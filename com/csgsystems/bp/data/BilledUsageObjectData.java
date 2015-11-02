/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BilledUsageObjectData.java
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
  
/** BilledUsageObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class BilledUsageObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public BilledUsageObjectKeyData Key = null;
  /** BILL_INVOICE.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** BILL_INVOICE.statement_date field */
  public    Date StatementDate  = null;
  protected boolean _StatementDateSet = false;
  /** ServerId field */
  public    Integer ServerId  = null;
  protected boolean _ServerIdSet = false;
  /** CDR_BILLED.subscr_no field */
  public    Integer ServiceInternalId  = null;
  protected boolean _ServiceInternalIdSet = false;
  /** CDR_BILLED.subscr_no_resets field */
  public    Integer ServiceInternalIdResets  = null;
  protected boolean _ServiceInternalIdResetsSet = false;
  /** CDR_BILLED.billed_amount field */
  public    BigInteger Amount  = null;
  protected boolean _AmountSet = false;
  /** CDR_BILLED.billed_base_amt field */
  public    BigInteger BaseAmt  = null;
  protected boolean _BaseAmtSet = false;
  /** CDR_BILLED.billed_unrounded_amount field */
  public    BigInteger UnroundedAmount  = null;
  protected boolean _UnroundedAmountSet = false;
  /** CDR_BILLED.billed_amount_reduction field */
  public    BigInteger AmountReduction  = null;
  protected boolean _AmountReductionSet = false;
  /** CDR_BILLED.billed_federal_tax field */
  public    BigInteger FederalTax  = null;
  protected boolean _FederalTaxSet = false;
  /** CDR_BILLED.billed_state_tax field */
  public    BigInteger StateTax  = null;
  protected boolean _StateTaxSet = false;
  /** CDR_BILLED.billed_county_tax field */
  public    BigInteger CountyTax  = null;
  protected boolean _CountyTaxSet = false;
  /** CDR_BILLED.billed_city_tax field */
  public    BigInteger CityTax  = null;
  protected boolean _CityTaxSet = false;
  /** CDR_BILLED.billed_other_tax field */
  public    BigInteger OtherTax  = null;
  protected boolean _OtherTaxSet = false;
  /** CDR_BILLED.billed_num_records field */
  public    Integer NumRecords  = null;
  protected boolean _NumRecordsSet = false;
  /** CDR_BILLED.process_num field */
  public    String ProcessNum  = null;
  protected boolean _ProcessNumSet = false;
  /** CDR_BILLED.units_credited field */
  public    BigInteger UnitsCredited  = null;
  protected boolean _UnitsCreditedSet = false;
  /** CDR_BILLED.amount_credited field */
  public    BigInteger AmountCredited  = null;
  protected boolean _AmountCreditedSet = false;
  /** CDR_BILLED.geocode field */
  public    String Geocode  = null;
  protected boolean _GeocodeSet = false;
  /** CDR_BILLED.aux_tax_info field */
  public    String AuxTaxInfo  = null;
  protected boolean _AuxTaxInfoSet = false;
  /** CDR_BILLED.bill_invoice_row field */
  public    Integer BillInvoiceRow  = null;
  protected boolean _BillInvoiceRowSet = false;
  /** CDR_BILLED.unit_cr_id field */
  public    Integer UnitCrId  = null;
  protected boolean _UnitCrIdSet = false;
  /** CDR_BILLED.arch_flag field */
  public    Boolean ArchFlag  = null;
  protected boolean _ArchFlagSet = false;
  /** CDR_BILLED.discount field */
  public    BigInteger Discount  = null;
  protected boolean _DiscountSet = false;
  /** CDR_BILLED.discount_id field */
  public    Integer DiscountId  = null;
  protected boolean _DiscountIdSet = false;
  /** CDR_BILLED.threshold_proration_factor field */
  public    Integer ThresholdProrationFactor  = null;
  protected boolean _ThresholdProrationFactorSet = false;
  /** CDR_BILLED.refund_proration_factor field */
  public    Integer RefundProrationFactor  = null;
  protected boolean _RefundProrationFactorSet = false;
  /** CDR_BILLED.point_origin field */
  public    String PointOrigin  = null;
  protected boolean _PointOriginSet = false;
  /** CDR_BILLED.point_target field */
  public    String PointTarget  = null;
  protected boolean _PointTargetSet = false;
  /** CDR_BILLED.trans_dt field */
  public    Date TransDt  = null;
  protected boolean _TransDtSet = false;
  /** CDR_BILLED.type_id_usg field */
  public    Integer TypeIdUsg  = null;
  protected boolean _TypeIdUsgSet = false;
  /** CDR_DATA.ext_tracking_id field */
  public    String ExtTrackingId  = null;
  protected boolean _ExtTrackingIdSet = false;
  /** CDR_DATA.trans_id field */
  public    String TransId  = null;
  protected boolean _TransIdSet = false;
  /** CDR_DATA.element_id field */
  public    Integer ElementId  = null;
  protected boolean _ElementIdSet = false;
  /** CDR_DATA.rate_class field */
  public    Integer RateClass  = null;
  protected boolean _RateClassSet = false;
  /** CDR_DATA.bill_class field */
  public    Integer BillClass  = null;
  protected boolean _BillClassSet = false;
  /** CDR_DATA.provider_id field */
  public    Integer ProviderId  = null;
  protected boolean _ProviderIdSet = false;
  /** CDR_DATA.jurisdiction field */
  public    Integer Jurisdiction  = null;
  protected boolean _JurisdictionSet = false;
  /** CDR_DATA.rate_currency_code field */
  public    Integer RateCurrencyCode  = null;
  protected boolean _RateCurrencyCodeSet = false;
  /** CDR_DATA.account_no field */
  public    Integer AccountNo  = null;
  protected boolean _AccountNoSet = false;
  /** CDR_DATA.external_id field */
  public    String ExternalId  = null;
  protected boolean _ExternalIdSet = false;
  /** CDR_DATA.external_id_type field */
  public    Integer ExternalIdType  = null;
  protected boolean _ExternalIdTypeSet = false;
  /** CDR_DATA.country_code_origin field */
  public    Integer CountryCodeOrigin  = null;
  protected boolean _CountryCodeOriginSet = false;
  /** CDR_DATA.country_dial_code_origin field */
  public    String CountryDialCodeOrigin  = null;
  protected boolean _CountryDialCodeOriginSet = false;
  /** CDR_DATA.point_id_origin field */
  public    Integer PointIdOrigin  = null;
  protected boolean _PointIdOriginSet = false;
  /** CDR_DATA.point_tax_code_origin field */
  public    String PointTaxCodeOrigin  = null;
  protected boolean _PointTaxCodeOriginSet = false;
  /** CDR_DATA.point_tax_code_type_origin field */
  public    Integer PointTaxCodeTypeOrigin  = null;
  protected boolean _PointTaxCodeTypeOriginSet = false;
  /** CDR_DATA.country_code_target field */
  public    Integer CountryCodeTarget  = null;
  protected boolean _CountryCodeTargetSet = false;
  /** CDR_DATA.point_id_target field */
  public    Integer PointIdTarget  = null;
  protected boolean _PointIdTargetSet = false;
  /** CDR_DATA.point_tax_code_target field */
  public    String PointTaxCodeTarget  = null;
  protected boolean _PointTaxCodeTargetSet = false;
  /** CDR_DATA.point_tax_code_type_target field */
  public    Integer PointTaxCodeTypeTarget  = null;
  protected boolean _PointTaxCodeTypeTargetSet = false;
  /** CDR_DATA.rate_dt field */
  public    Date RateDt  = null;
  protected boolean _RateDtSet = false;
  /** CDR_DATA.second_dt field */
  public    Date SecondDt  = null;
  protected boolean _SecondDtSet = false;
  /** CDR_DATA.tax_rate_active_dt field */
  public    Date TaxRateActiveDt  = null;
  protected boolean _TaxRateActiveDtSet = false;
  /** CDR_DATA.tax_rate_inactive_dt field */
  public    Date TaxRateInactiveDt  = null;
  protected boolean _TaxRateInactiveDtSet = false;
  /** CDR_DATA.timezone field */
  public    Integer Timezone  = null;
  protected boolean _TimezoneSet = false;
  /** CDR_DATA.primary_units field */
  public    BigInteger PrimaryUnits  = null;
  protected boolean _PrimaryUnitsSet = false;
  /** CDR_DATA.second_units field */
  public    BigInteger SecondUnits  = null;
  protected boolean _SecondUnitsSet = false;
  /** CDR_DATA.third_units field */
  public    BigInteger ThirdUnits  = null;
  protected boolean _ThirdUnitsSet = false;
  /** CDR_DATA.units_currency_code field */
  public    Integer UnitsCurrencyCode  = null;
  protected boolean _UnitsCurrencyCodeSet = false;
  /** CDR_DATA.billing_units_type field */
  public    Integer BillingUnitsType  = null;
  protected boolean _BillingUnitsTypeSet = false;
  /** CDR_DATA.profile_id field */
  public    BigInteger ProfileId  = null;
  protected boolean _ProfileIdSet = false;
  /** CDR_DATA.annotation field */
  public    String Annotation  = null;
  protected boolean _AnnotationSet = false;
  /** CDR_DATA.customer_tag field */
  public    String CustomerTag  = null;
  protected boolean _CustomerTagSet = false;
  /** CDR_DATA.rated_units field */
  public    BigInteger Units  = null;
  protected boolean _UnitsSet = false;
  /** CDR_DATA.amount field */
  public    BigInteger RatedAmount  = null;
  protected boolean _RatedAmountSet = false;
  /** CDR_DATA.foreign_amount field */
  public    BigInteger ForeignAmount  = null;
  protected boolean _ForeignAmountSet = false;
  /** CDR_DATA.rate_period field */
  public    String RatePeriod  = null;
  protected boolean _RatePeriodSet = false;
  /** CDR_DATA.no_bill field */
  public    Boolean NoBill  = null;
  protected boolean _NoBillSet = false;
  /** CDR_DATA.comp_status field */
  public    Integer CompStatus  = null;
  protected boolean _CompStatusSet = false;
  /** CDR_DATA.cdr_status field */
  public    Integer CdrStatus  = null;
  protected boolean _CdrStatusSet = false;
  /** CDR_DATA.file_id field */
  public    Integer FileId  = null;
  protected boolean _FileIdSet = false;
  /** CDR_DATA.file_id_serv field */
  public    Integer FileIdServ  = null;
  protected boolean _FileIdServSet = false;
  /** CDR_DATA.rev_rcv_cost_ctr field */
  public    Integer RevRcvCostCtr  = null;
  protected boolean _RevRcvCostCtrSet = false;
  /** CDR_DATA.corridor_plan_id field */
  public    Integer CorridorPlanId  = null;
  protected boolean _CorridorPlanIdSet = false;
  /** CDR_DATA.cell_id_origin field */
  public    Integer CellIdOrigin  = null;
  protected boolean _CellIdOriginSet = false;
  /** CDR_DATA.orig_type_id_usg field */
  public    Integer OrigTypeIdUsg  = null;
  protected boolean _OrigTypeIdUsgSet = false;
  /** CDR_DATA.access_region_origin field */
  public    String AccessRegionOrigin  = null;
  protected boolean _AccessRegionOriginSet = false;
  /** CDR_DATA.access_region_target field */
  public    String AccessRegionTarget  = null;
  protected boolean _AccessRegionTargetSet = false;
  /** CDR_DATA.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** CDR_DATA.amount_reduction field */
  public    BigInteger RatedAmountReduction  = null;
  protected boolean _RatedAmountReductionSet = false;
  /** CDR_DATA.amount_reduction_id field */
  public    Integer AmountReductionId  = null;
  protected boolean _AmountReductionIdSet = false;
  /** CDR_DATA.seqnum_rate_usage field */
  public    Integer SeqnumRateUsage  = null;
  protected boolean _SeqnumRateUsageSet = false;
  /** CDR_DATA.seqnum_rate_usage_overrides field */
  public    Integer SeqnumRateUsageOverrides  = null;
  protected boolean _SeqnumRateUsageOverridesSet = false;
  /** CDR_DATA.raw_units field */
  public    BigInteger RawUnits  = null;
  protected boolean _RawUnitsSet = false;
  /** CDR_DATA.raw_units_rounded field */
  public    BigInteger RawUnitsRounded  = null;
  protected boolean _RawUnitsRoundedSet = false;
  /** CDR_DATA.aggr_usage_id field */
  public    Integer AggrUsageId  = null;
  protected boolean _AggrUsageIdSet = false;
  /** CDR_DATA.zone_class field */
  public    Integer ZoneClass  = null;
  protected boolean _ZoneClassSet = false;
  /** CDR_DATA.point_class_origin field */
  public    Integer PointClassOrigin  = null;
  protected boolean _PointClassOriginSet = false;
  /** CDR_DATA.point_class_target field */
  public    Integer PointClassTarget  = null;
  protected boolean _PointClassTargetSet = false;
  /** CDR_DATA.equip_class_code field */
  public    Integer EquipClassCode  = null;
  protected boolean _EquipClassCodeSet = false;
  /** CDR_DATA.component_id field */
  public    Integer ComponentId  = null;
  protected boolean _ComponentIdSet = false;
  /** CDR_DATA.tax_pkg_count field */
  public    Integer TaxPkgCount  = null;
  protected boolean _TaxPkgCountSet = false;
  /** CDR_DATA.add_implied_decimal field */
  public    Integer AddImpliedDecimal  = null;
  protected boolean _AddImpliedDecimalSet = false;
  /** CDR_DATA.rerated_dt field */
  public    Date ReratedDt  = null;
  protected boolean _ReratedDtSet = false;
  /** CDR_DATA.external_invoice_id field */
  public    BigInteger ExternalInvoiceId  = null;
  protected boolean _ExternalInvoiceIdSet = false;
  /** CDR_DATA.invoice_record_seq field */
  public    BigInteger InvoiceRecordSeq  = null;
  protected boolean _InvoiceRecordSeqSet = false;
  /** CDR_DATA.lob_id field */
  public    BigInteger LobId  = null;
  protected boolean _LobIdSet = false;
  /** CDR_DATA.transaction_id field */
  public    BigInteger TransactionId  = null;
  protected boolean _TransactionIdSet = false;
  /** USAGE_TYPES.guide_to field */
  public    Integer GuideTo  = null;
  protected boolean _GuideToSet = false;
  /** USAGE_TYPES.point_category field */
  public    Integer PointCategory  = null;
  protected boolean _PointCategorySet = false;
  /** USAGE_TYPES.origin_country_dial_code_req field */
  public    Integer OriginCountryDialCodeReq  = null;
  protected boolean _OriginCountryDialCodeReqSet = false;
  /** USAGE_TYPES.tax_code_origin_req field */
  public    Integer TaxCodeOriginReq  = null;
  protected boolean _TaxCodeOriginReqSet = false;
  /** USAGE_TYPES.tax_code_target_req field */
  public    Integer TaxCodeTargetReq  = null;
  protected boolean _TaxCodeTargetReqSet = false;
  /** USAGE_TYPES.description_code field */
  public    Integer DescriptionCode  = null;
  protected boolean _DescriptionCodeSet = false;
  /** USAGE_TYPES.tax_class field */
  public    Integer TaxClass  = null;
  protected boolean _TaxClassSet = false;
  /** USAGE_TYPES.tax_location_usg field */
  public    Integer TaxLocationUsg  = null;
  protected boolean _TaxLocationUsgSet = false;
  /** USAGE_TYPES.tax_location_outcollect field */
  public    Integer TaxLocationOutcollect  = null;
  protected boolean _TaxLocationOutcollectSet = false;
  /** USAGE_TYPES.usg_class field */
  public    Integer UsgClass  = null;
  protected boolean _UsgClassSet = false;
  /** USAGE_TYPES.free_usg field */
  public    Boolean FreeUsg  = null;
  protected boolean _FreeUsgSet = false;
  /** USAGE_TYPES.product_line_id field */
  public    Integer ProductLineId  = null;
  protected boolean _ProductLineIdSet = false;
  /** USAGE_TYPES.bill_aggr_level field */
  public    Integer BillAggrLevel  = null;
  protected boolean _BillAggrLevelSet = false;
  /** USAGE_TYPES.derive_jurisdiction field */
  public    Integer DeriveJurisdiction  = null;
  protected boolean _DeriveJurisdictionSet = false;
  /** USAGE_TYPES.units_indicator field */
  public    Integer UnitsIndicator  = null;
  protected boolean _UnitsIndicatorSet = false;
  /** USAGE_TYPES.ratable_unit_class field */
  public    Integer RatableUnitClass  = null;
  protected boolean _RatableUnitClassSet = false;
  /** USAGE_TYPES.duration_flag field */
  public    Boolean DurationFlag  = null;
  protected boolean _DurationFlagSet = false;
  /** USAGE_TYPES.derive_distance_units field */
  public    Integer DeriveDistanceUnits  = null;
  protected boolean _DeriveDistanceUnitsSet = false;
  /** USAGE_TYPES.vh_minor_threshold field */
  public    Integer VhMinorThreshold  = null;
  protected boolean _VhMinorThresholdSet = false;
  /** USAGE_TYPES.distance_units_indicator field */
  public    Integer DistanceUnitsIndicator  = null;
  protected boolean _DistanceUnitsIndicatorSet = false;
  /** USAGE_TYPES.guide_to_provider field */
  public    Integer GuideToProvider  = null;
  protected boolean _GuideToProviderSet = false;
  /** USAGE_TYPES.is_prerated field */
  public    Boolean IsPrerated  = null;
  protected boolean _IsPreratedSet = false;
  /** USAGE_TYPES.keep_running_total field */
  public    Boolean KeepRunningTotal  = null;
  protected boolean _KeepRunningTotalSet = false;
  /** USAGE_TYPES.rounding_method field */
  public    Integer RoundingMethod  = null;
  protected boolean _RoundingMethodSet = false;
  /** USAGE_TYPES.raw_units_type field */
  public    Integer RawUnitsType  = null;
  protected boolean _RawUnitsTypeSet = false;
  /** USAGE_TYPES.use_rate_class field */
  public    Integer UseRateClass  = null;
  protected boolean _UseRateClassSet = false;
  /** USAGE_TYPES.use_bill_class field */
  public    Integer UseBillClass  = null;
  protected boolean _UseBillClassSet = false;
  /** USAGE_TYPES.use_jurisdiction field */
  public    Integer UseJurisdiction  = null;
  protected boolean _UseJurisdictionSet = false;
  /** USAGE_TYPES.use_point_class_origin field */
  public    Integer UsePointClassOrigin  = null;
  protected boolean _UsePointClassOriginSet = false;
  /** USAGE_TYPES.use_point_class_target field */
  public    Integer UsePointClassTarget  = null;
  protected boolean _UsePointClassTargetSet = false;
  /** USAGE_TYPES.use_provider_class field */
  public    Integer UseProviderClass  = null;
  protected boolean _UseProviderClassSet = false;
  /** USAGE_TYPES.use_rate_period field */
  public    Integer UseRatePeriod  = null;
  protected boolean _UseRatePeriodSet = false;
  /** USAGE_TYPES.use_element_id field */
  public    Integer UseElementId  = null;
  protected boolean _UseElementIdSet = false;
  /** USAGE_TYPES.use_equip_type_code field */
  public    Integer UseEquipTypeCode  = null;
  protected boolean _UseEquipTypeCodeSet = false;
  /** USAGE_TYPES.use_equip_class_code field */
  public    Integer UseEquipClassCode  = null;
  protected boolean _UseEquipClassCodeSet = false;
  /** USAGE_TYPES.use_class_of_service_code field */
  public    Integer UseClassOfServiceCode  = null;
  protected boolean _UseClassOfServiceCodeSet = false;
  /** USAGE_TYPES.use_distance_band_id field */
  public    Integer UseDistanceBandId  = null;
  protected boolean _UseDistanceBandIdSet = false;
  /** USAGE_TYPES.use_default_rate_type field */
  public    Integer UseDefaultRateType  = null;
  protected boolean _UseDefaultRateTypeSet = false;
  /** USAGE_TYPES.rate_currency_location field */
  public    Integer RateCurrencyLocation  = null;
  protected boolean _RateCurrencyLocationSet = false;
  /** USAGE_TYPES.rate_period_rounding field */
  public    Integer RatePeriodRounding  = null;
  protected boolean _RatePeriodRoundingSet = false;
  /** USAGE_TYPES.rate_minimum_duration field */
  public    Integer RateMinimumDuration  = null;
  protected boolean _RateMinimumDurationSet = false;
  /** USAGE_TYPES.use_component_id field */
  public    Integer UseComponentId  = null;
  protected boolean _UseComponentIdSet = false;
  /** USAGE_TYPES.min_billing_units field */
  public    BigInteger MinBillingUnits  = null;
  protected boolean _MinBillingUnitsSet = false;
  /** USAGE_TYPES.consolidate_usage field */
  public    Boolean ConsolidateUsage  = null;
  protected boolean _ConsolidateUsageSet = false;
  /** USAGE_TYPES.network_delay field */
  public    Integer NetworkDelay  = null;
  protected boolean _NetworkDelaySet = false;
  /** USAGE_TYPES.is_late_fee_exempt field */
  public    Boolean IsLateFeeExempt  = null;
  protected boolean _IsLateFeeExemptSet = false;
  /** USAGE_TYPES.rating_method field */
  public    Integer RatingMethod  = null;
  protected boolean _RatingMethodSet = false;
  /** USAGE_TYPES.use_zone_class field */
  public    Integer UseZoneClass  = null;
  protected boolean _UseZoneClassSet = false;
  /** DESCRIPTIONS.description_group field */
  public    Integer DescriptionGroup  = null;
  protected boolean _DescriptionGroupSet = false;
  /** DESCRIPTIONS.description_text field */
  public    String DescriptionText  = null;
  protected boolean _DescriptionTextSet = false;
  /** DESCRIPTIONS.short_description_text field */
  public    String ShortDescriptionText  = null;
  protected boolean _ShortDescriptionTextSet = false;
  private String _objName = "BilledUsageObjectData";
  /** Default constructor */
  public BilledUsageObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public BilledUsageObjectData (BilledUsageObjectData other)
  {

    if (other == null) return;
    this.Key = new BilledUsageObjectKeyData (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.StatementDate = other.StatementDate;
    this._StatementDateSet = other._StatementDateSet;
    this.ServerId = other.ServerId;
    this._ServerIdSet = other._ServerIdSet;
    this.ServiceInternalId = other.ServiceInternalId;
    this._ServiceInternalIdSet = other._ServiceInternalIdSet;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this._ServiceInternalIdResetsSet = other._ServiceInternalIdResetsSet;
    this.Amount = other.Amount;
    this._AmountSet = other._AmountSet;
    this.BaseAmt = other.BaseAmt;
    this._BaseAmtSet = other._BaseAmtSet;
    this.UnroundedAmount = other.UnroundedAmount;
    this._UnroundedAmountSet = other._UnroundedAmountSet;
    this.AmountReduction = other.AmountReduction;
    this._AmountReductionSet = other._AmountReductionSet;
    this.FederalTax = other.FederalTax;
    this._FederalTaxSet = other._FederalTaxSet;
    this.StateTax = other.StateTax;
    this._StateTaxSet = other._StateTaxSet;
    this.CountyTax = other.CountyTax;
    this._CountyTaxSet = other._CountyTaxSet;
    this.CityTax = other.CityTax;
    this._CityTaxSet = other._CityTaxSet;
    this.OtherTax = other.OtherTax;
    this._OtherTaxSet = other._OtherTaxSet;
    this.NumRecords = other.NumRecords;
    this._NumRecordsSet = other._NumRecordsSet;
    this.ProcessNum = other.ProcessNum;
    this._ProcessNumSet = other._ProcessNumSet;
    this.UnitsCredited = other.UnitsCredited;
    this._UnitsCreditedSet = other._UnitsCreditedSet;
    this.AmountCredited = other.AmountCredited;
    this._AmountCreditedSet = other._AmountCreditedSet;
    this.Geocode = other.Geocode;
    this._GeocodeSet = other._GeocodeSet;
    this.AuxTaxInfo = other.AuxTaxInfo;
    this._AuxTaxInfoSet = other._AuxTaxInfoSet;
    this.BillInvoiceRow = other.BillInvoiceRow;
    this._BillInvoiceRowSet = other._BillInvoiceRowSet;
    this.UnitCrId = other.UnitCrId;
    this._UnitCrIdSet = other._UnitCrIdSet;
    this.ArchFlag = other.ArchFlag;
    this._ArchFlagSet = other._ArchFlagSet;
    this.Discount = other.Discount;
    this._DiscountSet = other._DiscountSet;
    this.DiscountId = other.DiscountId;
    this._DiscountIdSet = other._DiscountIdSet;
    this.ThresholdProrationFactor = other.ThresholdProrationFactor;
    this._ThresholdProrationFactorSet = other._ThresholdProrationFactorSet;
    this.RefundProrationFactor = other.RefundProrationFactor;
    this._RefundProrationFactorSet = other._RefundProrationFactorSet;
    this.PointOrigin = other.PointOrigin;
    this._PointOriginSet = other._PointOriginSet;
    this.PointTarget = other.PointTarget;
    this._PointTargetSet = other._PointTargetSet;
    this.TransDt = other.TransDt;
    this._TransDtSet = other._TransDtSet;
    this.TypeIdUsg = other.TypeIdUsg;
    this._TypeIdUsgSet = other._TypeIdUsgSet;
    this.ExtTrackingId = other.ExtTrackingId;
    this._ExtTrackingIdSet = other._ExtTrackingIdSet;
    this.TransId = other.TransId;
    this._TransIdSet = other._TransIdSet;
    this.ElementId = other.ElementId;
    this._ElementIdSet = other._ElementIdSet;
    this.RateClass = other.RateClass;
    this._RateClassSet = other._RateClassSet;
    this.BillClass = other.BillClass;
    this._BillClassSet = other._BillClassSet;
    this.ProviderId = other.ProviderId;
    this._ProviderIdSet = other._ProviderIdSet;
    this.Jurisdiction = other.Jurisdiction;
    this._JurisdictionSet = other._JurisdictionSet;
    this.RateCurrencyCode = other.RateCurrencyCode;
    this._RateCurrencyCodeSet = other._RateCurrencyCodeSet;
    this.AccountNo = other.AccountNo;
    this._AccountNoSet = other._AccountNoSet;
    this.ExternalId = other.ExternalId;
    this._ExternalIdSet = other._ExternalIdSet;
    this.ExternalIdType = other.ExternalIdType;
    this._ExternalIdTypeSet = other._ExternalIdTypeSet;
    this.CountryCodeOrigin = other.CountryCodeOrigin;
    this._CountryCodeOriginSet = other._CountryCodeOriginSet;
    this.CountryDialCodeOrigin = other.CountryDialCodeOrigin;
    this._CountryDialCodeOriginSet = other._CountryDialCodeOriginSet;
    this.PointIdOrigin = other.PointIdOrigin;
    this._PointIdOriginSet = other._PointIdOriginSet;
    this.PointTaxCodeOrigin = other.PointTaxCodeOrigin;
    this._PointTaxCodeOriginSet = other._PointTaxCodeOriginSet;
    this.PointTaxCodeTypeOrigin = other.PointTaxCodeTypeOrigin;
    this._PointTaxCodeTypeOriginSet = other._PointTaxCodeTypeOriginSet;
    this.CountryCodeTarget = other.CountryCodeTarget;
    this._CountryCodeTargetSet = other._CountryCodeTargetSet;
    this.PointIdTarget = other.PointIdTarget;
    this._PointIdTargetSet = other._PointIdTargetSet;
    this.PointTaxCodeTarget = other.PointTaxCodeTarget;
    this._PointTaxCodeTargetSet = other._PointTaxCodeTargetSet;
    this.PointTaxCodeTypeTarget = other.PointTaxCodeTypeTarget;
    this._PointTaxCodeTypeTargetSet = other._PointTaxCodeTypeTargetSet;
    this.RateDt = other.RateDt;
    this._RateDtSet = other._RateDtSet;
    this.SecondDt = other.SecondDt;
    this._SecondDtSet = other._SecondDtSet;
    this.TaxRateActiveDt = other.TaxRateActiveDt;
    this._TaxRateActiveDtSet = other._TaxRateActiveDtSet;
    this.TaxRateInactiveDt = other.TaxRateInactiveDt;
    this._TaxRateInactiveDtSet = other._TaxRateInactiveDtSet;
    this.Timezone = other.Timezone;
    this._TimezoneSet = other._TimezoneSet;
    this.PrimaryUnits = other.PrimaryUnits;
    this._PrimaryUnitsSet = other._PrimaryUnitsSet;
    this.SecondUnits = other.SecondUnits;
    this._SecondUnitsSet = other._SecondUnitsSet;
    this.ThirdUnits = other.ThirdUnits;
    this._ThirdUnitsSet = other._ThirdUnitsSet;
    this.UnitsCurrencyCode = other.UnitsCurrencyCode;
    this._UnitsCurrencyCodeSet = other._UnitsCurrencyCodeSet;
    this.BillingUnitsType = other.BillingUnitsType;
    this._BillingUnitsTypeSet = other._BillingUnitsTypeSet;
    this.ProfileId = other.ProfileId;
    this._ProfileIdSet = other._ProfileIdSet;
    this.Annotation = other.Annotation;
    this._AnnotationSet = other._AnnotationSet;
    this.CustomerTag = other.CustomerTag;
    this._CustomerTagSet = other._CustomerTagSet;
    this.Units = other.Units;
    this._UnitsSet = other._UnitsSet;
    this.RatedAmount = other.RatedAmount;
    this._RatedAmountSet = other._RatedAmountSet;
    this.ForeignAmount = other.ForeignAmount;
    this._ForeignAmountSet = other._ForeignAmountSet;
    this.RatePeriod = other.RatePeriod;
    this._RatePeriodSet = other._RatePeriodSet;
    this.NoBill = other.NoBill;
    this._NoBillSet = other._NoBillSet;
    this.CompStatus = other.CompStatus;
    this._CompStatusSet = other._CompStatusSet;
    this.CdrStatus = other.CdrStatus;
    this._CdrStatusSet = other._CdrStatusSet;
    this.FileId = other.FileId;
    this._FileIdSet = other._FileIdSet;
    this.FileIdServ = other.FileIdServ;
    this._FileIdServSet = other._FileIdServSet;
    this.RevRcvCostCtr = other.RevRcvCostCtr;
    this._RevRcvCostCtrSet = other._RevRcvCostCtrSet;
    this.CorridorPlanId = other.CorridorPlanId;
    this._CorridorPlanIdSet = other._CorridorPlanIdSet;
    this.CellIdOrigin = other.CellIdOrigin;
    this._CellIdOriginSet = other._CellIdOriginSet;
    this.OrigTypeIdUsg = other.OrigTypeIdUsg;
    this._OrigTypeIdUsgSet = other._OrigTypeIdUsgSet;
    this.AccessRegionOrigin = other.AccessRegionOrigin;
    this._AccessRegionOriginSet = other._AccessRegionOriginSet;
    this.AccessRegionTarget = other.AccessRegionTarget;
    this._AccessRegionTargetSet = other._AccessRegionTargetSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.RatedAmountReduction = other.RatedAmountReduction;
    this._RatedAmountReductionSet = other._RatedAmountReductionSet;
    this.AmountReductionId = other.AmountReductionId;
    this._AmountReductionIdSet = other._AmountReductionIdSet;
    this.SeqnumRateUsage = other.SeqnumRateUsage;
    this._SeqnumRateUsageSet = other._SeqnumRateUsageSet;
    this.SeqnumRateUsageOverrides = other.SeqnumRateUsageOverrides;
    this._SeqnumRateUsageOverridesSet = other._SeqnumRateUsageOverridesSet;
    this.RawUnits = other.RawUnits;
    this._RawUnitsSet = other._RawUnitsSet;
    this.RawUnitsRounded = other.RawUnitsRounded;
    this._RawUnitsRoundedSet = other._RawUnitsRoundedSet;
    this.AggrUsageId = other.AggrUsageId;
    this._AggrUsageIdSet = other._AggrUsageIdSet;
    this.ZoneClass = other.ZoneClass;
    this._ZoneClassSet = other._ZoneClassSet;
    this.PointClassOrigin = other.PointClassOrigin;
    this._PointClassOriginSet = other._PointClassOriginSet;
    this.PointClassTarget = other.PointClassTarget;
    this._PointClassTargetSet = other._PointClassTargetSet;
    this.EquipClassCode = other.EquipClassCode;
    this._EquipClassCodeSet = other._EquipClassCodeSet;
    this.ComponentId = other.ComponentId;
    this._ComponentIdSet = other._ComponentIdSet;
    this.TaxPkgCount = other.TaxPkgCount;
    this._TaxPkgCountSet = other._TaxPkgCountSet;
    this.AddImpliedDecimal = other.AddImpliedDecimal;
    this._AddImpliedDecimalSet = other._AddImpliedDecimalSet;
    this.ReratedDt = other.ReratedDt;
    this._ReratedDtSet = other._ReratedDtSet;
    this.ExternalInvoiceId = other.ExternalInvoiceId;
    this._ExternalInvoiceIdSet = other._ExternalInvoiceIdSet;
    this.InvoiceRecordSeq = other.InvoiceRecordSeq;
    this._InvoiceRecordSeqSet = other._InvoiceRecordSeqSet;
    this.LobId = other.LobId;
    this._LobIdSet = other._LobIdSet;
    this.TransactionId = other.TransactionId;
    this._TransactionIdSet = other._TransactionIdSet;
    this.GuideTo = other.GuideTo;
    this._GuideToSet = other._GuideToSet;
    this.PointCategory = other.PointCategory;
    this._PointCategorySet = other._PointCategorySet;
    this.OriginCountryDialCodeReq = other.OriginCountryDialCodeReq;
    this._OriginCountryDialCodeReqSet = other._OriginCountryDialCodeReqSet;
    this.TaxCodeOriginReq = other.TaxCodeOriginReq;
    this._TaxCodeOriginReqSet = other._TaxCodeOriginReqSet;
    this.TaxCodeTargetReq = other.TaxCodeTargetReq;
    this._TaxCodeTargetReqSet = other._TaxCodeTargetReqSet;
    this.DescriptionCode = other.DescriptionCode;
    this._DescriptionCodeSet = other._DescriptionCodeSet;
    this.TaxClass = other.TaxClass;
    this._TaxClassSet = other._TaxClassSet;
    this.TaxLocationUsg = other.TaxLocationUsg;
    this._TaxLocationUsgSet = other._TaxLocationUsgSet;
    this.TaxLocationOutcollect = other.TaxLocationOutcollect;
    this._TaxLocationOutcollectSet = other._TaxLocationOutcollectSet;
    this.UsgClass = other.UsgClass;
    this._UsgClassSet = other._UsgClassSet;
    this.FreeUsg = other.FreeUsg;
    this._FreeUsgSet = other._FreeUsgSet;
    this.ProductLineId = other.ProductLineId;
    this._ProductLineIdSet = other._ProductLineIdSet;
    this.BillAggrLevel = other.BillAggrLevel;
    this._BillAggrLevelSet = other._BillAggrLevelSet;
    this.DeriveJurisdiction = other.DeriveJurisdiction;
    this._DeriveJurisdictionSet = other._DeriveJurisdictionSet;
    this.UnitsIndicator = other.UnitsIndicator;
    this._UnitsIndicatorSet = other._UnitsIndicatorSet;
    this.RatableUnitClass = other.RatableUnitClass;
    this._RatableUnitClassSet = other._RatableUnitClassSet;
    this.DurationFlag = other.DurationFlag;
    this._DurationFlagSet = other._DurationFlagSet;
    this.DeriveDistanceUnits = other.DeriveDistanceUnits;
    this._DeriveDistanceUnitsSet = other._DeriveDistanceUnitsSet;
    this.VhMinorThreshold = other.VhMinorThreshold;
    this._VhMinorThresholdSet = other._VhMinorThresholdSet;
    this.DistanceUnitsIndicator = other.DistanceUnitsIndicator;
    this._DistanceUnitsIndicatorSet = other._DistanceUnitsIndicatorSet;
    this.GuideToProvider = other.GuideToProvider;
    this._GuideToProviderSet = other._GuideToProviderSet;
    this.IsPrerated = other.IsPrerated;
    this._IsPreratedSet = other._IsPreratedSet;
    this.KeepRunningTotal = other.KeepRunningTotal;
    this._KeepRunningTotalSet = other._KeepRunningTotalSet;
    this.RoundingMethod = other.RoundingMethod;
    this._RoundingMethodSet = other._RoundingMethodSet;
    this.RawUnitsType = other.RawUnitsType;
    this._RawUnitsTypeSet = other._RawUnitsTypeSet;
    this.UseRateClass = other.UseRateClass;
    this._UseRateClassSet = other._UseRateClassSet;
    this.UseBillClass = other.UseBillClass;
    this._UseBillClassSet = other._UseBillClassSet;
    this.UseJurisdiction = other.UseJurisdiction;
    this._UseJurisdictionSet = other._UseJurisdictionSet;
    this.UsePointClassOrigin = other.UsePointClassOrigin;
    this._UsePointClassOriginSet = other._UsePointClassOriginSet;
    this.UsePointClassTarget = other.UsePointClassTarget;
    this._UsePointClassTargetSet = other._UsePointClassTargetSet;
    this.UseProviderClass = other.UseProviderClass;
    this._UseProviderClassSet = other._UseProviderClassSet;
    this.UseRatePeriod = other.UseRatePeriod;
    this._UseRatePeriodSet = other._UseRatePeriodSet;
    this.UseElementId = other.UseElementId;
    this._UseElementIdSet = other._UseElementIdSet;
    this.UseEquipTypeCode = other.UseEquipTypeCode;
    this._UseEquipTypeCodeSet = other._UseEquipTypeCodeSet;
    this.UseEquipClassCode = other.UseEquipClassCode;
    this._UseEquipClassCodeSet = other._UseEquipClassCodeSet;
    this.UseClassOfServiceCode = other.UseClassOfServiceCode;
    this._UseClassOfServiceCodeSet = other._UseClassOfServiceCodeSet;
    this.UseDistanceBandId = other.UseDistanceBandId;
    this._UseDistanceBandIdSet = other._UseDistanceBandIdSet;
    this.UseDefaultRateType = other.UseDefaultRateType;
    this._UseDefaultRateTypeSet = other._UseDefaultRateTypeSet;
    this.RateCurrencyLocation = other.RateCurrencyLocation;
    this._RateCurrencyLocationSet = other._RateCurrencyLocationSet;
    this.RatePeriodRounding = other.RatePeriodRounding;
    this._RatePeriodRoundingSet = other._RatePeriodRoundingSet;
    this.RateMinimumDuration = other.RateMinimumDuration;
    this._RateMinimumDurationSet = other._RateMinimumDurationSet;
    this.UseComponentId = other.UseComponentId;
    this._UseComponentIdSet = other._UseComponentIdSet;
    this.MinBillingUnits = other.MinBillingUnits;
    this._MinBillingUnitsSet = other._MinBillingUnitsSet;
    this.ConsolidateUsage = other.ConsolidateUsage;
    this._ConsolidateUsageSet = other._ConsolidateUsageSet;
    this.NetworkDelay = other.NetworkDelay;
    this._NetworkDelaySet = other._NetworkDelaySet;
    this.IsLateFeeExempt = other.IsLateFeeExempt;
    this._IsLateFeeExemptSet = other._IsLateFeeExemptSet;
    this.RatingMethod = other.RatingMethod;
    this._RatingMethodSet = other._RatingMethodSet;
    this.UseZoneClass = other.UseZoneClass;
    this._UseZoneClassSet = other._UseZoneClassSet;
    this.DescriptionGroup = other.DescriptionGroup;
    this._DescriptionGroupSet = other._DescriptionGroupSet;
    this.DescriptionText = other.DescriptionText;
    this._DescriptionTextSet = other._DescriptionTextSet;
    this.ShortDescriptionText = other.ShortDescriptionText;
    this._ShortDescriptionTextSet = other._ShortDescriptionTextSet;
  }

  /** get the Key for this object
   * @return BilledUsageObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public BilledUsageObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (BilledUsageObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefNo", "setBillRefNo");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.BillRefNo = value;
    this.Key._BillRefNoSet = true;
  }
  /** get the value of the field: BillRefNo (BILL_INVOICE.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (BILL_INVOICE.bill_ref_no)
   */
  public void unsetBillRefNo () {
    if (this.Key == null) return;
    this.Key._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (BILL_INVOICE.bill_ref_no)
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

  /** set the fields value: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillRefResets", "setBillRefResets");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.BillRefResets = value;
    this.Key._BillRefResetsSet = true;
  }
  /** get the value of the field: BillRefResets (BILL_INVOICE.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (BILL_INVOICE.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    if (this.Key == null) return;
    this.Key._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (BILL_INVOICE.bill_ref_resets)
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

  /** set the fields value: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCdrDataPartitionKey (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CdrDataPartitionKey", "setCdrDataPartitionKey");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.CdrDataPartitionKey = value;
    this.Key._CdrDataPartitionKeySet = true;
  }
  /** get the value of the field: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * @return Date the value
   */
  public Date getCdrDataPartitionKey () {
    if (this.Key == null) return null;
    return this.Key.CdrDataPartitionKey;
  }
  /** Change the field to not being actively set: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   */
  public void unsetCdrDataPartitionKey () {
    if (this.Key == null) return;
    this.Key._CdrDataPartitionKeySet = false;
  }
  /** See if the field is actively set: CdrDataPartitionKey (CDR_BILLED.cdr_data_partition_key)
   * @return boolean whether the field is actively set
   */
  public boolean issetCdrDataPartitionKey () {
    if (this.Key == null) return false;
    return this.Key._CdrDataPartitionKeySet;
  }

  /** Retrieves the CdrDataPartitionKey field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CdrDataPartitionKey field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKey field
   */
   public String getCdrDataPartitionKeyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyAsFormattedString");
       return fmtMgr.formatDate(this.getCdrDataPartitionKey(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CdrDataPartitionKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyAsFormattedString");
       throw x;
     }
   }
  /** Sets the CdrDataPartitionKey field from a formatted string
   *
   * @param _value the CdrDataPartitionKey field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CdrDataPartitionKey field
   */
   public void setCdrDataPartitionKeyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCdrDataPartitionKey(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CdrDataPartitionKey");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrDataPartitionKeyFromFormattedString");
   }

  /**
   * Retrieves the CdrDataPartitionKey field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CdrDataPartitionKey field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrDataPartitionKey field
   */
  public String getCdrDataPartitionKeyAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrDataPartitionKeyAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrDataPartitionKeyAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getCdrDataPartitionKey(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKey");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrDataPartitionKeyAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CdrDataPartitionKey field value from a formatted date/time string
   *
   * @param _value the CdrDataPartitionKey field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CdrDataPartitionKey field
   */
  public void setCdrDataPartitionKeyFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCdrDataPartitionKeyFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCdrDataPartitionKey(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CdrDataPartitionKey");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrDataPartitionKeyFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** set the fields value: MsgId (CDR_BILLED.msg_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMsgId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgId", "setMsgId");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.MsgId = value;
    this.Key._MsgIdSet = true;
  }
  /** get the value of the field: MsgId (CDR_BILLED.msg_id)
   * @return Integer the value
   */
  public Integer getMsgId () {
    if (this.Key == null) return null;
    return this.Key.MsgId;
  }
  /** Change the field to not being actively set: MsgId (CDR_BILLED.msg_id)
   */
  public void unsetMsgId () {
    if (this.Key == null) return;
    this.Key._MsgIdSet = false;
  }
  /** See if the field is actively set: MsgId (CDR_BILLED.msg_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgId () {
    if (this.Key == null) return false;
    return this.Key._MsgIdSet;
  }

  /** Retrieves the MsgId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId field
   */
   public String getMsgIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgId field from a formatted string
   *
   * @param _value the MsgId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgId field
   */
   public void setMsgIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdFromFormattedString");
   }

  /** set the fields value: MsgId2 (CDR_BILLED.msg_id2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMsgId2 (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgId2", "setMsgId2");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.MsgId2 = value;
    this.Key._MsgId2Set = true;
  }
  /** get the value of the field: MsgId2 (CDR_BILLED.msg_id2)
   * @return Integer the value
   */
  public Integer getMsgId2 () {
    if (this.Key == null) return null;
    return this.Key.MsgId2;
  }
  /** Change the field to not being actively set: MsgId2 (CDR_BILLED.msg_id2)
   */
  public void unsetMsgId2 () {
    if (this.Key == null) return;
    this.Key._MsgId2Set = false;
  }
  /** See if the field is actively set: MsgId2 (CDR_BILLED.msg_id2)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgId2 () {
    if (this.Key == null) return false;
    return this.Key._MsgId2Set;
  }

  /** Retrieves the MsgId2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgId2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgId2 field
   */
   public String getMsgId2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgId2AsFormattedString");
       return fmtMgr.formatNumber(this.getMsgId2(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgId2AsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgId2 field from a formatted string
   *
   * @param _value the MsgId2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgId2 field
   */
   public void setMsgId2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgId2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgId2(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgId2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgId2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgId2FromFormattedString");
   }

  /** set the fields value: MsgIdServ (CDR_BILLED.msg_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setMsgIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgIdServ", "setMsgIdServ");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.MsgIdServ = value;
    this.Key._MsgIdServSet = true;
  }
  /** get the value of the field: MsgIdServ (CDR_BILLED.msg_id_serv)
   * @return Integer the value
   */
  public Integer getMsgIdServ () {
    if (this.Key == null) return null;
    return this.Key.MsgIdServ;
  }
  /** Change the field to not being actively set: MsgIdServ (CDR_BILLED.msg_id_serv)
   */
  public void unsetMsgIdServ () {
    if (this.Key == null) return;
    this.Key._MsgIdServSet = false;
  }
  /** See if the field is actively set: MsgIdServ (CDR_BILLED.msg_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgIdServ () {
    if (this.Key == null) return false;
    return this.Key._MsgIdServSet;
  }

  /** Retrieves the MsgIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgIdServ field
   */
   public String getMsgIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgIdServ field from a formatted string
   *
   * @param _value the MsgIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgIdServ field
   */
   public void setMsgIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgIdServFromFormattedString");
   }

  /** set the fields value: SplitRowNum (CDR_BILLED.split_row_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setSplitRowNum (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SplitRowNum", "setSplitRowNum");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.SplitRowNum = value;
    this.Key._SplitRowNumSet = true;
  }
  /** get the value of the field: SplitRowNum (CDR_BILLED.split_row_num)
   * @return Integer the value
   */
  public Integer getSplitRowNum () {
    if (this.Key == null) return null;
    return this.Key.SplitRowNum;
  }
  /** Change the field to not being actively set: SplitRowNum (CDR_BILLED.split_row_num)
   */
  public void unsetSplitRowNum () {
    if (this.Key == null) return;
    this.Key._SplitRowNumSet = false;
  }
  /** See if the field is actively set: SplitRowNum (CDR_BILLED.split_row_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetSplitRowNum () {
    if (this.Key == null) return false;
    return this.Key._SplitRowNumSet;
  }

  /** Retrieves the SplitRowNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SplitRowNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SplitRowNum field
   */
   public String getSplitRowNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSplitRowNumAsFormattedString");
       return fmtMgr.formatNumber(this.getSplitRowNum(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSplitRowNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the SplitRowNum field from a formatted string
   *
   * @param _value the SplitRowNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SplitRowNum field
   */
   public void setSplitRowNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSplitRowNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSplitRowNum(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SplitRowNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSplitRowNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSplitRowNumFromFormattedString");
   }

  /** set the fields value: LanguageCode (DESCRIPTIONS.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.LanguageCode = value;
    this.Key._LanguageCodeSet = true;
  }
  /** get the value of the field: LanguageCode (DESCRIPTIONS.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (DESCRIPTIONS.language_code)
   */
  public void unsetLanguageCode () {
    if (this.Key == null) return;
    this.Key._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (DESCRIPTIONS.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    if (this.Key == null) return false;
    return this.Key._LanguageCodeSet;
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

  /** set the fields value: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServiceExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalId", "setServiceExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ServiceExternalId", "setServiceExternalId");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.ServiceExternalId = value;
    this.Key._ServiceExternalIdSet = true;
  }
  /** get the value of the field: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return String the value
   */
  public String getServiceExternalId () {
    if (this.Key == null) return null;
    return this.Key.ServiceExternalId;
  }
  /** Change the field to not being actively set: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   */
  public void unsetServiceExternalId () {
    if (this.Key == null) return;
    this.Key._ServiceExternalIdSet = false;
  }
  /** See if the field is actively set: ServiceExternalId (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalId () {
    if (this.Key == null) return false;
    return this.Key._ServiceExternalIdSet;
  }

  /** Retrieves the ServiceExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalId field
   */
   public String getServiceExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getServiceExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalId field from a formatted string
   *
   * @param _value the ServiceExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalId field
   */
   public void setServiceExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdFromFormattedString");
   }

  /** set the fields value: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServiceExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceExternalIdType", "setServiceExternalIdType");
    }
    if (this.Key == null) this.Key = new BilledUsageObjectKeyData ();
    this.Key.ServiceExternalIdType = value;
    this.Key._ServiceExternalIdTypeSet = true;
  }
  /** get the value of the field: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return Integer the value
   */
  public Integer getServiceExternalIdType () {
    if (this.Key == null) return null;
    return this.Key.ServiceExternalIdType;
  }
  /** Change the field to not being actively set: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   */
  public void unsetServiceExternalIdType () {
    if (this.Key == null) return;
    this.Key._ServiceExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ServiceExternalIdType (CUSTOMER_ID_EQUIP_MAP_VIEW.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceExternalIdType () {
    if (this.Key == null) return false;
    return this.Key._ServiceExternalIdTypeSet;
  }

  /** Retrieves the ServiceExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceExternalIdType field
   */
   public String getServiceExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceExternalIdType field from a formatted string
   *
   * @param _value the ServiceExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceExternalIdType field
   */
   public void setServiceExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ServiceExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ServiceExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceExternalIdType field
   */
  public String getServiceExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getServiceExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getServiceExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ServiceExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ServiceExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ServiceExternalIdType field
   */
  public Enumeration getServiceExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceExternalIdTypeEnumeration");
    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, null, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ServiceExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setServiceExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getServiceExternalIdTypeEnumeration(_locale);
      this.setServiceExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ServiceExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setServiceExternalIdTypeFromDisplayValue");
  }

  /** set the fields value: AccountInternalId (BILL_INVOICE.account_no)
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

  /** get the value of the field: AccountInternalId (BILL_INVOICE.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (BILL_INVOICE.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (BILL_INVOICE.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalId") 
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
    this.AccountExternalId = value;
    this._AccountExternalIdSet = true;
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

  /** get the value of the field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getAccountExternalId () {
    return this.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetAccountExternalId () {
    this._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId () {
    return this._AccountExternalIdSet;
  }
  /** set the fields value: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalIdType") 
  public void setAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalIdType", "setAccountExternalIdType");
    }
    this.AccountExternalIdType = value;
    this._AccountExternalIdTypeSet = true;
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
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
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

  /** get the value of the field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getAccountExternalIdType () {
    return this.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetAccountExternalIdType () {
    this._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType () {
    return this._AccountExternalIdTypeSet;
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
  /** set the fields value: ServerId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setServerId (Integer value) throws ServiceException
  {
    this.ServerId = value;
    this._ServerIdSet = true;
  }
  /** get the value of the field: ServerId
   * @return Integer the value
   */
  public Integer getServerId ()
  {
    return this.ServerId;
  }
  /** Change the field to not being actively set: ServerId
   */
  public void unsetServerId ()
  {
    this._ServerIdSet = false;
  }
  /** See if the field is actively set: ServerId
   * @return boolean whether the field is actively set
   */
  public boolean issetServerId ()
  {
    return this._ServerIdSet;
  }

  /** Retrieves the ServerId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServerId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServerId field
   */
   public String getServerIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServerIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServerId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServerIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServerId field from a formatted string
   *
   * @param _value the ServerId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServerId field
   */
   public void setServerIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServerIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServerId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServerId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServerIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServerIdFromFormattedString");
   }

  /** set the fields value: ServiceInternalId (CDR_BILLED.subscr_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalId") 
  public void setServiceInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalId", "setServiceInternalId");
    }
    this.ServiceInternalId = value;
    this._ServiceInternalIdSet = true;
  }

  /** Retrieves the ServiceInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalId field
   */
   public String getServiceInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalId field from a formatted string
   *
   * @param _value the ServiceInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalId field
   */
   public void setServiceInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdFromFormattedString");
   }

  /** get the value of the field: ServiceInternalId (CDR_BILLED.subscr_no)
   * @return Integer the value
   */
  public Integer getServiceInternalId () {
    return this.ServiceInternalId;
  }
  /** Change the field to not being actively set: ServiceInternalId (CDR_BILLED.subscr_no)
   */
  public void unsetServiceInternalId () {
    this._ServiceInternalIdSet = false;
  }
  /** See if the field is actively set: ServiceInternalId (CDR_BILLED.subscr_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalId () {
    return this._ServiceInternalIdSet;
  }
  /** set the fields value: ServiceInternalIdResets (CDR_BILLED.subscr_no_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceInternalIdResets") 
  public void setServiceInternalIdResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceInternalIdResets", "setServiceInternalIdResets");
    }
    this.ServiceInternalIdResets = value;
    this._ServiceInternalIdResetsSet = true;
  }

  /** Retrieves the ServiceInternalIdResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceInternalIdResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceInternalIdResets field
   */
   public String getServiceInternalIdResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceInternalIdResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceInternalIdResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceInternalIdResets field from a formatted string
   *
   * @param _value the ServiceInternalIdResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceInternalIdResets field
   */
   public void setServiceInternalIdResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceInternalIdResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceInternalIdResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceInternalIdResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceInternalIdResetsFromFormattedString");
   }

  /** get the value of the field: ServiceInternalIdResets (CDR_BILLED.subscr_no_resets)
   * @return Integer the value
   */
  public Integer getServiceInternalIdResets () {
    return this.ServiceInternalIdResets;
  }
  /** Change the field to not being actively set: ServiceInternalIdResets (CDR_BILLED.subscr_no_resets)
   */
  public void unsetServiceInternalIdResets () {
    this._ServiceInternalIdResetsSet = false;
  }
  /** See if the field is actively set: ServiceInternalIdResets (CDR_BILLED.subscr_no_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceInternalIdResets () {
    return this._ServiceInternalIdResetsSet;
  }
  /** set the fields value: Amount (CDR_BILLED.billed_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Amount") 
  public void setAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Amount", "setAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Amount", "setAmount");
    }
    this.Amount = value;
    this._AmountSet = true;
  }

  /** Retrieves the Amount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Amount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
   public String getAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the Amount field from a formatted string
   *
   * @param _value the Amount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
   public void setAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedString");
   }

  /**
   * Retrieves the Amount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Amount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
  public String getAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Amount field value from a formatted currency string
   *
   * @param _value the Amount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
  public void setAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: Amount (CDR_BILLED.billed_amount)
   * @return BigInteger the value
   */
  public BigInteger getAmount () {
    return this.Amount;
  }
  /** Change the field to not being actively set: Amount (CDR_BILLED.billed_amount)
   */
  public void unsetAmount () {
    this._AmountSet = false;
  }
  /** See if the field is actively set: Amount (CDR_BILLED.billed_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmount () {
    return this._AmountSet;
  }
  /** set the fields value: BaseAmt (CDR_BILLED.billed_base_amt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BaseAmt") 
  public void setBaseAmt (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BaseAmt", "setBaseAmt");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BaseAmt", "setBaseAmt");
    }
    this.BaseAmt = value;
    this._BaseAmtSet = true;
  }

  /** Retrieves the BaseAmt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BaseAmt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BaseAmt field
   */
   public String getBaseAmtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBaseAmtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBaseAmtAsFormattedString");
       return fmtMgr.formatBigInteger(this.getBaseAmt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BaseAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBaseAmtAsFormattedString");
       throw x;
     }
   }
  /** Sets the BaseAmt field from a formatted string
   *
   * @param _value the BaseAmt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BaseAmt field
   */
   public void setBaseAmtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBaseAmtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBaseAmt(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BaseAmt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBaseAmtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBaseAmtFromFormattedString");
   }

  /**
   * Retrieves the BaseAmt field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BaseAmt field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the BaseAmt field
   */
  public String getBaseAmtAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBaseAmtAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBaseAmtAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getBaseAmt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BaseAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBaseAmtAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the BaseAmt field value from a formatted currency string
   *
   * @param _value the BaseAmt field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BaseAmt field
   */
  public void setBaseAmtFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBaseAmtFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setBaseAmt(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BaseAmt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBaseAmtFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBaseAmtFromFormattedCurrencyString");
  }

  /** get the value of the field: BaseAmt (CDR_BILLED.billed_base_amt)
   * @return BigInteger the value
   */
  public BigInteger getBaseAmt () {
    return this.BaseAmt;
  }
  /** Change the field to not being actively set: BaseAmt (CDR_BILLED.billed_base_amt)
   */
  public void unsetBaseAmt () {
    this._BaseAmtSet = false;
  }
  /** See if the field is actively set: BaseAmt (CDR_BILLED.billed_base_amt)
   * @return boolean whether the field is actively set
   */
  public boolean issetBaseAmt () {
    return this._BaseAmtSet;
  }
  /** set the fields value: UnroundedAmount (CDR_BILLED.billed_unrounded_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnroundedAmount") 
  public void setUnroundedAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnroundedAmount", "setUnroundedAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UnroundedAmount", "setUnroundedAmount");
    }
    this.UnroundedAmount = value;
    this._UnroundedAmountSet = true;
  }

  /** Retrieves the UnroundedAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnroundedAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnroundedAmount field
   */
   public String getUnroundedAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnroundedAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnroundedAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUnroundedAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnroundedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnroundedAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnroundedAmount field from a formatted string
   *
   * @param _value the UnroundedAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnroundedAmount field
   */
   public void setUnroundedAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnroundedAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnroundedAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnroundedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnroundedAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnroundedAmountFromFormattedString");
   }

  /**
   * Retrieves the UnroundedAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnroundedAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnroundedAmount field
   */
  public String getUnroundedAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnroundedAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnroundedAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getUnroundedAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnroundedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnroundedAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the UnroundedAmount field value from a formatted currency string
   *
   * @param _value the UnroundedAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnroundedAmount field
   */
  public void setUnroundedAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnroundedAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setUnroundedAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnroundedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnroundedAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnroundedAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: UnroundedAmount (CDR_BILLED.billed_unrounded_amount)
   * @return BigInteger the value
   */
  public BigInteger getUnroundedAmount () {
    return this.UnroundedAmount;
  }
  /** Change the field to not being actively set: UnroundedAmount (CDR_BILLED.billed_unrounded_amount)
   */
  public void unsetUnroundedAmount () {
    this._UnroundedAmountSet = false;
  }
  /** See if the field is actively set: UnroundedAmount (CDR_BILLED.billed_unrounded_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnroundedAmount () {
    return this._UnroundedAmountSet;
  }
  /** set the fields value: AmountReduction (CDR_BILLED.billed_amount_reduction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AmountReduction") 
  public void setAmountReduction (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AmountReduction", "setAmountReduction");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AmountReduction", "setAmountReduction");
    }
    this.AmountReduction = value;
    this._AmountReductionSet = true;
  }

  /** Retrieves the AmountReduction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AmountReduction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountReduction field
   */
   public String getAmountReductionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountReductionAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmountReduction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountReduction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountReductionAsFormattedString");
       throw x;
     }
   }
  /** Sets the AmountReduction field from a formatted string
   *
   * @param _value the AmountReduction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountReduction field
   */
   public void setAmountReductionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmountReduction(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountReduction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountReductionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountReductionFromFormattedString");
   }

  /**
   * Retrieves the AmountReduction field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountReduction field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountReduction field
   */
  public String getAmountReductionAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountReductionAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmountReduction(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReduction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountReductionAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the AmountReduction field value from a formatted currency string
   *
   * @param _value the AmountReduction field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountReduction field
   */
  public void setAmountReductionFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountReductionFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmountReduction(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountReduction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountReductionFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountReductionFromFormattedCurrencyString");
  }

  /** get the value of the field: AmountReduction (CDR_BILLED.billed_amount_reduction)
   * @return BigInteger the value
   */
  public BigInteger getAmountReduction () {
    return this.AmountReduction;
  }
  /** Change the field to not being actively set: AmountReduction (CDR_BILLED.billed_amount_reduction)
   */
  public void unsetAmountReduction () {
    this._AmountReductionSet = false;
  }
  /** See if the field is actively set: AmountReduction (CDR_BILLED.billed_amount_reduction)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmountReduction () {
    return this._AmountReductionSet;
  }
  /** set the fields value: FederalTax (CDR_BILLED.billed_federal_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FederalTax") 
  public void setFederalTax (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FederalTax", "setFederalTax");
    }
    this.FederalTax = value;
    this._FederalTaxSet = true;
  }

  /** Retrieves the FederalTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FederalTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTax field
   */
   public String getFederalTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFederalTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the FederalTax field from a formatted string
   *
   * @param _value the FederalTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FederalTax field
   */
   public void setFederalTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFederalTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FederalTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFromFormattedString");
   }

  /**
   * Retrieves the FederalTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FederalTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the FederalTax field
   */
  public String getFederalTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFederalTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFederalTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getFederalTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFederalTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the FederalTax field value from a formatted currency string
   *
   * @param _value the FederalTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FederalTax field
   */
  public void setFederalTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFederalTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setFederalTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FederalTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFederalTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFederalTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: FederalTax (CDR_BILLED.billed_federal_tax)
   * @return BigInteger the value
   */
  public BigInteger getFederalTax () {
    return this.FederalTax;
  }
  /** Change the field to not being actively set: FederalTax (CDR_BILLED.billed_federal_tax)
   */
  public void unsetFederalTax () {
    this._FederalTaxSet = false;
  }
  /** See if the field is actively set: FederalTax (CDR_BILLED.billed_federal_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetFederalTax () {
    return this._FederalTaxSet;
  }
  /** set the fields value: StateTax (CDR_BILLED.billed_state_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StateTax") 
  public void setStateTax (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "StateTax", "setStateTax");
    }
    this.StateTax = value;
    this._StateTaxSet = true;
  }

  /** Retrieves the StateTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StateTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTax field
   */
   public String getStateTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getStateTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the StateTax field from a formatted string
   *
   * @param _value the StateTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateTax field
   */
   public void setStateTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStateTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StateTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFromFormattedString");
   }

  /**
   * Retrieves the StateTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StateTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the StateTax field
   */
  public String getStateTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStateTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStateTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getStateTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStateTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the StateTax field value from a formatted currency string
   *
   * @param _value the StateTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StateTax field
   */
  public void setStateTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStateTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStateTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StateTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStateTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStateTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: StateTax (CDR_BILLED.billed_state_tax)
   * @return BigInteger the value
   */
  public BigInteger getStateTax () {
    return this.StateTax;
  }
  /** Change the field to not being actively set: StateTax (CDR_BILLED.billed_state_tax)
   */
  public void unsetStateTax () {
    this._StateTaxSet = false;
  }
  /** See if the field is actively set: StateTax (CDR_BILLED.billed_state_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetStateTax () {
    return this._StateTaxSet;
  }
  /** set the fields value: CountyTax (CDR_BILLED.billed_county_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountyTax") 
  public void setCountyTax (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CountyTax", "setCountyTax");
    }
    this.CountyTax = value;
    this._CountyTaxSet = true;
  }

  /** Retrieves the CountyTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountyTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTax field
   */
   public String getCountyTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCountyTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountyTax field from a formatted string
   *
   * @param _value the CountyTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyTax field
   */
   public void setCountyTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountyTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountyTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFromFormattedString");
   }

  /**
   * Retrieves the CountyTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CountyTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountyTax field
   */
  public String getCountyTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountyTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountyTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCountyTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountyTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CountyTax field value from a formatted currency string
   *
   * @param _value the CountyTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountyTax field
   */
  public void setCountyTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountyTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCountyTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountyTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountyTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountyTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: CountyTax (CDR_BILLED.billed_county_tax)
   * @return BigInteger the value
   */
  public BigInteger getCountyTax () {
    return this.CountyTax;
  }
  /** Change the field to not being actively set: CountyTax (CDR_BILLED.billed_county_tax)
   */
  public void unsetCountyTax () {
    this._CountyTaxSet = false;
  }
  /** See if the field is actively set: CountyTax (CDR_BILLED.billed_county_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountyTax () {
    return this._CountyTaxSet;
  }
  /** set the fields value: CityTax (CDR_BILLED.billed_city_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CityTax") 
  public void setCityTax (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CityTax", "setCityTax");
    }
    this.CityTax = value;
    this._CityTaxSet = true;
  }

  /** Retrieves the CityTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CityTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTax field
   */
   public String getCityTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getCityTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the CityTax field from a formatted string
   *
   * @param _value the CityTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityTax field
   */
   public void setCityTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCityTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CityTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFromFormattedString");
   }

  /**
   * Retrieves the CityTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CityTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CityTax field
   */
  public String getCityTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCityTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCityTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getCityTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCityTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the CityTax field value from a formatted currency string
   *
   * @param _value the CityTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CityTax field
   */
  public void setCityTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCityTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setCityTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CityTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCityTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCityTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: CityTax (CDR_BILLED.billed_city_tax)
   * @return BigInteger the value
   */
  public BigInteger getCityTax () {
    return this.CityTax;
  }
  /** Change the field to not being actively set: CityTax (CDR_BILLED.billed_city_tax)
   */
  public void unsetCityTax () {
    this._CityTaxSet = false;
  }
  /** See if the field is actively set: CityTax (CDR_BILLED.billed_city_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetCityTax () {
    return this._CityTaxSet;
  }
  /** set the fields value: OtherTax (CDR_BILLED.billed_other_tax)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OtherTax") 
  public void setOtherTax (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OtherTax", "setOtherTax");
    }
    this.OtherTax = value;
    this._OtherTaxSet = true;
  }

  /** Retrieves the OtherTax field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OtherTax field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTax field
   */
   public String getOtherTaxAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxAsFormattedString");
       return fmtMgr.formatBigInteger(this.getOtherTax(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxAsFormattedString");
       throw x;
     }
   }
  /** Sets the OtherTax field from a formatted string
   *
   * @param _value the OtherTax field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OtherTax field
   */
   public void setOtherTaxFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOtherTax(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OtherTax");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFromFormattedString");
   }

  /**
   * Retrieves the OtherTax field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OtherTax field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the OtherTax field
   */
  public String getOtherTaxAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOtherTaxAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOtherTaxAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getOtherTax(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOtherTaxAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the OtherTax field value from a formatted currency string
   *
   * @param _value the OtherTax field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OtherTax field
   */
  public void setOtherTaxFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOtherTaxFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setOtherTax(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OtherTax");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOtherTaxFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOtherTaxFromFormattedCurrencyString");
  }

  /** get the value of the field: OtherTax (CDR_BILLED.billed_other_tax)
   * @return BigInteger the value
   */
  public BigInteger getOtherTax () {
    return this.OtherTax;
  }
  /** Change the field to not being actively set: OtherTax (CDR_BILLED.billed_other_tax)
   */
  public void unsetOtherTax () {
    this._OtherTaxSet = false;
  }
  /** See if the field is actively set: OtherTax (CDR_BILLED.billed_other_tax)
   * @return boolean whether the field is actively set
   */
  public boolean issetOtherTax () {
    return this._OtherTaxSet;
  }
  /** set the fields value: NumRecords (CDR_BILLED.billed_num_records)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NumRecords") 
  public void setNumRecords (Integer value) throws ServiceException
  {
    this.NumRecords = value;
    this._NumRecordsSet = true;
  }

  /** Retrieves the NumRecords field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NumRecords field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NumRecords field
   */
   public String getNumRecordsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumRecordsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNumRecordsAsFormattedString");
       return fmtMgr.formatNumber(this.getNumRecords(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumRecords");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNumRecordsAsFormattedString");
       throw x;
     }
   }
  /** Sets the NumRecords field from a formatted string
   *
   * @param _value the NumRecords field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NumRecords field
   */
   public void setNumRecordsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNumRecordsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNumRecords(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NumRecords");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNumRecordsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNumRecordsFromFormattedString");
   }

  /** get the value of the field: NumRecords (CDR_BILLED.billed_num_records)
   * @return Integer the value
   */
  public Integer getNumRecords () {
    return this.NumRecords;
  }
  /** Change the field to not being actively set: NumRecords (CDR_BILLED.billed_num_records)
   */
  public void unsetNumRecords () {
    this._NumRecordsSet = false;
  }
  /** See if the field is actively set: NumRecords (CDR_BILLED.billed_num_records)
   * @return boolean whether the field is actively set
   */
  public boolean issetNumRecords () {
    return this._NumRecordsSet;
  }
  /** set the fields value: ProcessNum (CDR_BILLED.process_num)
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

  /** get the value of the field: ProcessNum (CDR_BILLED.process_num)
   * @return String the value
   */
  public String getProcessNum () {
    return this.ProcessNum;
  }
  /** Change the field to not being actively set: ProcessNum (CDR_BILLED.process_num)
   */
  public void unsetProcessNum () {
    this._ProcessNumSet = false;
  }
  /** See if the field is actively set: ProcessNum (CDR_BILLED.process_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetProcessNum () {
    return this._ProcessNumSet;
  }
  /** set the fields value: UnitsCredited (CDR_BILLED.units_credited)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitsCredited") 
  public void setUnitsCredited (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitsCredited", "setUnitsCredited");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UnitsCredited", "setUnitsCredited");
    }
    this.UnitsCredited = value;
    this._UnitsCreditedSet = true;
  }

  /** Retrieves the UnitsCredited field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitsCredited field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsCredited field
   */
   public String getUnitsCreditedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCreditedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsCreditedAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUnitsCredited(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsCredited");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsCreditedAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitsCredited field from a formatted string
   *
   * @param _value the UnitsCredited field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitsCredited field
   */
   public void setUnitsCreditedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCreditedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitsCredited(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsCredited");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsCreditedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsCreditedFromFormattedString");
   }

  /** get the value of the field: UnitsCredited (CDR_BILLED.units_credited)
   * @return BigInteger the value
   */
  public BigInteger getUnitsCredited () {
    return this.UnitsCredited;
  }
  /** Change the field to not being actively set: UnitsCredited (CDR_BILLED.units_credited)
   */
  public void unsetUnitsCredited () {
    this._UnitsCreditedSet = false;
  }
  /** See if the field is actively set: UnitsCredited (CDR_BILLED.units_credited)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitsCredited () {
    return this._UnitsCreditedSet;
  }
  /** set the fields value: AmountCredited (CDR_BILLED.amount_credited)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AmountCredited") 
  public void setAmountCredited (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AmountCredited", "setAmountCredited");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AmountCredited", "setAmountCredited");
    }
    this.AmountCredited = value;
    this._AmountCreditedSet = true;
  }

  /** Retrieves the AmountCredited field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AmountCredited field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountCredited field
   */
   public String getAmountCreditedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountCreditedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountCreditedAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmountCredited(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountCredited");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountCreditedAsFormattedString");
       throw x;
     }
   }
  /** Sets the AmountCredited field from a formatted string
   *
   * @param _value the AmountCredited field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountCredited field
   */
   public void setAmountCreditedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountCreditedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmountCredited(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountCredited");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountCreditedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountCreditedFromFormattedString");
   }

  /**
   * Retrieves the AmountCredited field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AmountCredited field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountCredited field
   */
  public String getAmountCreditedAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountCreditedAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountCreditedAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmountCredited(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountCredited");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountCreditedAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the AmountCredited field value from a formatted currency string
   *
   * @param _value the AmountCredited field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountCredited field
   */
  public void setAmountCreditedFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountCreditedFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmountCredited(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AmountCredited");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountCreditedFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountCreditedFromFormattedCurrencyString");
  }

  /** get the value of the field: AmountCredited (CDR_BILLED.amount_credited)
   * @return BigInteger the value
   */
  public BigInteger getAmountCredited () {
    return this.AmountCredited;
  }
  /** Change the field to not being actively set: AmountCredited (CDR_BILLED.amount_credited)
   */
  public void unsetAmountCredited () {
    this._AmountCreditedSet = false;
  }
  /** See if the field is actively set: AmountCredited (CDR_BILLED.amount_credited)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmountCredited () {
    return this._AmountCreditedSet;
  }
  /** set the fields value: Geocode (CDR_BILLED.geocode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Geocode") 
  public void setGeocode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Geocode", "setGeocode");
    }
    this.Geocode = value;
    this._GeocodeSet = true;
  }

  /** Retrieves the Geocode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Geocode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Geocode field
   */
   public String getGeocodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGeocodeAsFormattedString");
       return fmtMgr.formatString(this.getGeocode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Geocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGeocodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the Geocode field from a formatted string
   *
   * @param _value the Geocode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Geocode field
   */
   public void setGeocodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGeocodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGeocode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Geocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGeocodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGeocodeFromFormattedString");
   }

  /** get the value of the field: Geocode (CDR_BILLED.geocode)
   * @return String the value
   */
  public String getGeocode () {
    return this.Geocode;
  }
  /** Change the field to not being actively set: Geocode (CDR_BILLED.geocode)
   */
  public void unsetGeocode () {
    this._GeocodeSet = false;
  }
  /** See if the field is actively set: Geocode (CDR_BILLED.geocode)
   * @return boolean whether the field is actively set
   */
  public boolean issetGeocode () {
    return this._GeocodeSet;
  }
  /** set the fields value: AuxTaxInfo (CDR_BILLED.aux_tax_info)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AuxTaxInfo") 
  public void setAuxTaxInfo (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AuxTaxInfo", "setAuxTaxInfo");
    }
    this.AuxTaxInfo = value;
    this._AuxTaxInfoSet = true;
  }

  /** Retrieves the AuxTaxInfo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AuxTaxInfo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AuxTaxInfo field
   */
   public String getAuxTaxInfoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuxTaxInfoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAuxTaxInfoAsFormattedString");
       return fmtMgr.formatString(this.getAuxTaxInfo());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AuxTaxInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAuxTaxInfoAsFormattedString");
       throw x;
     }
   }
  /** Sets the AuxTaxInfo field from a formatted string
   *
   * @param _value the AuxTaxInfo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AuxTaxInfo field
   */
   public void setAuxTaxInfoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAuxTaxInfoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAuxTaxInfo(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AuxTaxInfo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAuxTaxInfoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAuxTaxInfoFromFormattedString");
   }

  /** get the value of the field: AuxTaxInfo (CDR_BILLED.aux_tax_info)
   * @return String the value
   */
  public String getAuxTaxInfo () {
    return this.AuxTaxInfo;
  }
  /** Change the field to not being actively set: AuxTaxInfo (CDR_BILLED.aux_tax_info)
   */
  public void unsetAuxTaxInfo () {
    this._AuxTaxInfoSet = false;
  }
  /** See if the field is actively set: AuxTaxInfo (CDR_BILLED.aux_tax_info)
   * @return boolean whether the field is actively set
   */
  public boolean issetAuxTaxInfo () {
    return this._AuxTaxInfoSet;
  }
  /** set the fields value: BillInvoiceRow (CDR_BILLED.bill_invoice_row)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillInvoiceRow") 
  public void setBillInvoiceRow (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BillInvoiceRow", "setBillInvoiceRow");
    }
    this.BillInvoiceRow = value;
    this._BillInvoiceRowSet = true;
  }

  /** Retrieves the BillInvoiceRow field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillInvoiceRow field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillInvoiceRow field
   */
   public String getBillInvoiceRowAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInvoiceRowAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillInvoiceRowAsFormattedString");
       return fmtMgr.formatNumber(this.getBillInvoiceRow(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillInvoiceRow");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillInvoiceRowAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillInvoiceRow field from a formatted string
   *
   * @param _value the BillInvoiceRow field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillInvoiceRow field
   */
   public void setBillInvoiceRowFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillInvoiceRowFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillInvoiceRow(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillInvoiceRow");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillInvoiceRowFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillInvoiceRowFromFormattedString");
   }

  /** get the value of the field: BillInvoiceRow (CDR_BILLED.bill_invoice_row)
   * @return Integer the value
   */
  public Integer getBillInvoiceRow () {
    return this.BillInvoiceRow;
  }
  /** Change the field to not being actively set: BillInvoiceRow (CDR_BILLED.bill_invoice_row)
   */
  public void unsetBillInvoiceRow () {
    this._BillInvoiceRowSet = false;
  }
  /** See if the field is actively set: BillInvoiceRow (CDR_BILLED.bill_invoice_row)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillInvoiceRow () {
    return this._BillInvoiceRowSet;
  }
  /** set the fields value: UnitCrId (CDR_BILLED.unit_cr_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitCrId") 
  public void setUnitCrId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitCrId", "setUnitCrId");
    }
    this.UnitCrId = value;
    this._UnitCrIdSet = true;
  }

  /** Retrieves the UnitCrId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitCrId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitCrId field
   */
   public String getUnitCrIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitCrIdAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitCrId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitCrIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitCrId field from a formatted string
   *
   * @param _value the UnitCrId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitCrId field
   */
   public void setUnitCrIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitCrIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitCrId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitCrId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitCrIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitCrIdFromFormattedString");
   }

  /** get the value of the field: UnitCrId (CDR_BILLED.unit_cr_id)
   * @return Integer the value
   */
  public Integer getUnitCrId () {
    return this.UnitCrId;
  }
  /** Change the field to not being actively set: UnitCrId (CDR_BILLED.unit_cr_id)
   */
  public void unsetUnitCrId () {
    this._UnitCrIdSet = false;
  }
  /** See if the field is actively set: UnitCrId (CDR_BILLED.unit_cr_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitCrId () {
    return this._UnitCrIdSet;
  }
  /** set the fields value: ArchFlag (CDR_BILLED.arch_flag)
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

  /** get the value of the field: ArchFlag (CDR_BILLED.arch_flag)
   * @return Boolean the value
   */
  public Boolean getArchFlag () {
    return this.ArchFlag;
  }
  /** Change the field to not being actively set: ArchFlag (CDR_BILLED.arch_flag)
   */
  public void unsetArchFlag () {
    this._ArchFlagSet = false;
  }
  /** See if the field is actively set: ArchFlag (CDR_BILLED.arch_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetArchFlag () {
    return this._ArchFlagSet;
  }
  /** set the fields value: Discount (CDR_BILLED.discount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Discount") 
  public void setDiscount (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Discount", "setDiscount");
    }
    this.Discount = value;
    this._DiscountSet = true;
  }

  /** Retrieves the Discount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Discount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Discount field
   */
   public String getDiscountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getDiscount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Discount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAsFormattedString");
       throw x;
     }
   }
  /** Sets the Discount field from a formatted string
   *
   * @param _value the Discount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Discount field
   */
   public void setDiscountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Discount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountFromFormattedString");
   }

  /**
   * Retrieves the Discount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Discount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Discount field
   */
  public String getDiscountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getDiscount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Discount field value from a formatted currency string
   *
   * @param _value the Discount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Discount field
   */
  public void setDiscountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setDiscount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountFromFormattedCurrencyString");
  }

  /**
   * Retrieves the display value for the enumerated Discount field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the Discount field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Discount field
   */

  public String getDiscountDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getDiscountEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getDiscount()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated Discount field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the Discount field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Discount field
   */
  public Enumeration getDiscountEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("DiscountType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated Discount field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setDiscountFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getDiscountEnumeration(_locale);
      this.setDiscount((BigInteger)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), BigInteger.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Discount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountFromDisplayValue");
  }

  /** get the value of the field: Discount (CDR_BILLED.discount)
   * @return BigInteger the value
   */
  public BigInteger getDiscount () {
    return this.Discount;
  }
  /** Change the field to not being actively set: Discount (CDR_BILLED.discount)
   */
  public void unsetDiscount () {
    this._DiscountSet = false;
  }
  /** See if the field is actively set: Discount (CDR_BILLED.discount)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscount () {
    return this._DiscountSet;
  }
  /** set the fields value: DiscountId (CDR_BILLED.discount_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiscountId") 
  public void setDiscountId (Integer value) throws ServiceException
  {
    this.DiscountId = value;
    this._DiscountIdSet = true;
  }

  /** Retrieves the DiscountId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiscountId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountId field
   */
   public String getDiscountIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountIdAsFormattedString");
       return fmtMgr.formatNumber(this.getDiscountId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiscountId field from a formatted string
   *
   * @param _value the DiscountId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiscountId field
   */
   public void setDiscountIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiscountId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiscountId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountIdFromFormattedString");
   }

  /** get the value of the field: DiscountId (CDR_BILLED.discount_id)
   * @return Integer the value
   */
  public Integer getDiscountId () {
    return this.DiscountId;
  }
  /** Change the field to not being actively set: DiscountId (CDR_BILLED.discount_id)
   */
  public void unsetDiscountId () {
    this._DiscountIdSet = false;
  }
  /** See if the field is actively set: DiscountId (CDR_BILLED.discount_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiscountId () {
    return this._DiscountIdSet;
  }
  /** set the fields value: ThresholdProrationFactor (CDR_BILLED.threshold_proration_factor)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ThresholdProrationFactor") 
  public void setThresholdProrationFactor (Integer value) throws ServiceException
  {
    this.ThresholdProrationFactor = value;
    this._ThresholdProrationFactorSet = true;
  }

  /** Retrieves the ThresholdProrationFactor field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ThresholdProrationFactor field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdProrationFactor field
   */
   public String getThresholdProrationFactorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdProrationFactorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdProrationFactorAsFormattedString");
       return fmtMgr.formatNumber(this.getThresholdProrationFactor(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdProrationFactor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdProrationFactorAsFormattedString");
       throw x;
     }
   }
  /** Sets the ThresholdProrationFactor field from a formatted string
   *
   * @param _value the ThresholdProrationFactor field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ThresholdProrationFactor field
   */
   public void setThresholdProrationFactorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdProrationFactorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setThresholdProrationFactor(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdProrationFactor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdProrationFactorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdProrationFactorFromFormattedString");
   }

  /** get the value of the field: ThresholdProrationFactor (CDR_BILLED.threshold_proration_factor)
   * @return Integer the value
   */
  public Integer getThresholdProrationFactor () {
    return this.ThresholdProrationFactor;
  }
  /** Change the field to not being actively set: ThresholdProrationFactor (CDR_BILLED.threshold_proration_factor)
   */
  public void unsetThresholdProrationFactor () {
    this._ThresholdProrationFactorSet = false;
  }
  /** See if the field is actively set: ThresholdProrationFactor (CDR_BILLED.threshold_proration_factor)
   * @return boolean whether the field is actively set
   */
  public boolean issetThresholdProrationFactor () {
    return this._ThresholdProrationFactorSet;
  }
  /** set the fields value: RefundProrationFactor (CDR_BILLED.refund_proration_factor)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RefundProrationFactor") 
  public void setRefundProrationFactor (Integer value) throws ServiceException
  {
    this.RefundProrationFactor = value;
    this._RefundProrationFactorSet = true;
  }

  /** Retrieves the RefundProrationFactor field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RefundProrationFactor field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefundProrationFactor field
   */
   public String getRefundProrationFactorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundProrationFactorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundProrationFactorAsFormattedString");
       return fmtMgr.formatNumber(this.getRefundProrationFactor(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundProrationFactor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefundProrationFactorAsFormattedString");
       throw x;
     }
   }
  /** Sets the RefundProrationFactor field from a formatted string
   *
   * @param _value the RefundProrationFactor field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RefundProrationFactor field
   */
   public void setRefundProrationFactorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundProrationFactorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRefundProrationFactor(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundProrationFactor");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefundProrationFactorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefundProrationFactorFromFormattedString");
   }

  /** get the value of the field: RefundProrationFactor (CDR_BILLED.refund_proration_factor)
   * @return Integer the value
   */
  public Integer getRefundProrationFactor () {
    return this.RefundProrationFactor;
  }
  /** Change the field to not being actively set: RefundProrationFactor (CDR_BILLED.refund_proration_factor)
   */
  public void unsetRefundProrationFactor () {
    this._RefundProrationFactorSet = false;
  }
  /** See if the field is actively set: RefundProrationFactor (CDR_BILLED.refund_proration_factor)
   * @return boolean whether the field is actively set
   */
  public boolean issetRefundProrationFactor () {
    return this._RefundProrationFactorSet;
  }
  /** set the fields value: PointOrigin (CDR_BILLED.point_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointOrigin") 
  public void setPointOrigin (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PointOrigin", "setPointOrigin");
    }
    this.PointOrigin = value;
    this._PointOriginSet = true;
  }

  /** Retrieves the PointOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointOrigin field
   */
   public String getPointOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointOriginAsFormattedString");
       return fmtMgr.formatString(this.getPointOrigin());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointOrigin field from a formatted string
   *
   * @param _value the PointOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointOrigin field
   */
   public void setPointOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointOrigin(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointOriginFromFormattedString");
   }

  /** get the value of the field: PointOrigin (CDR_BILLED.point_origin)
   * @return String the value
   */
  public String getPointOrigin () {
    return this.PointOrigin;
  }
  /** Change the field to not being actively set: PointOrigin (CDR_BILLED.point_origin)
   */
  public void unsetPointOrigin () {
    this._PointOriginSet = false;
  }
  /** See if the field is actively set: PointOrigin (CDR_BILLED.point_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointOrigin () {
    return this._PointOriginSet;
  }
  /** set the fields value: PointTarget (CDR_BILLED.point_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointTarget") 
  public void setPointTarget (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PointTarget", "setPointTarget");
    }
    this.PointTarget = value;
    this._PointTargetSet = true;
  }

  /** Retrieves the PointTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTarget field
   */
   public String getPointTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTargetAsFormattedString");
       return fmtMgr.formatString(this.getPointTarget());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTarget field from a formatted string
   *
   * @param _value the PointTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTarget field
   */
   public void setPointTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTarget(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTargetFromFormattedString");
   }

  /** get the value of the field: PointTarget (CDR_BILLED.point_target)
   * @return String the value
   */
  public String getPointTarget () {
    return this.PointTarget;
  }
  /** Change the field to not being actively set: PointTarget (CDR_BILLED.point_target)
   */
  public void unsetPointTarget () {
    this._PointTargetSet = false;
  }
  /** See if the field is actively set: PointTarget (CDR_BILLED.point_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTarget () {
    return this._PointTargetSet;
  }
  /** set the fields value: TransDt (CDR_BILLED.trans_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransDt") 
  public void setTransDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransDt", "setTransDt");
    }
    this.TransDt = value;
    this._TransDtSet = true;
  }

  /** Retrieves the TransDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDt field
   */
   public String getTransDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtAsFormattedString");
       return fmtMgr.formatDate(this.getTransDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransDt field from a formatted string
   *
   * @param _value the TransDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDt field
   */
   public void setTransDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDtFromFormattedString");
   }

  /**
   * Retrieves the TransDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDt field
   */
  public String getTransDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTransDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDt field value from a formatted date/time string
   *
   * @param _value the TransDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDt field
   */
  public void setTransDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TransDt (CDR_BILLED.trans_dt)
   * @return Date the value
   */
  public Date getTransDt () {
    return this.TransDt;
  }
  /** Change the field to not being actively set: TransDt (CDR_BILLED.trans_dt)
   */
  public void unsetTransDt () {
    this._TransDtSet = false;
  }
  /** See if the field is actively set: TransDt (CDR_BILLED.trans_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransDt () {
    return this._TransDtSet;
  }
  /** set the fields value: TypeIdUsg (CDR_BILLED.type_id_usg)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TypeIdUsg") 
  public void setTypeIdUsg (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TypeIdUsg", "setTypeIdUsg");
    }
    this.TypeIdUsg = value;
    this._TypeIdUsgSet = true;
  }

  /** Retrieves the TypeIdUsg field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TypeIdUsg field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeIdUsg field
   */
   public String getTypeIdUsgAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdUsgAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdUsgAsFormattedString");
       return fmtMgr.formatNumber(this.getTypeIdUsg(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeIdUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdUsgAsFormattedString");
       throw x;
     }
   }
  /** Sets the TypeIdUsg field from a formatted string
   *
   * @param _value the TypeIdUsg field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TypeIdUsg field
   */
   public void setTypeIdUsgFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdUsgFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTypeIdUsg(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TypeIdUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdUsgFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeIdUsgFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated TypeIdUsg field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the TypeIdUsg field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TypeIdUsg field
   */

  public String getTypeIdUsgDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdUsgDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTypeIdUsgEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdUsgDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getTypeIdUsg()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdUsg");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdUsgDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated TypeIdUsg field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the TypeIdUsg field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the TypeIdUsg field
   */
  public Enumeration getTypeIdUsgEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeIdUsgEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("UsageType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeIdUsgEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdUsg");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeIdUsgEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated TypeIdUsg field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setTypeIdUsgFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdUsgFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTypeIdUsgEnumeration(_locale);
      this.setTypeIdUsg((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeIdUsg");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeIdUsgFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeIdUsgFromDisplayValue");
  }

  /** get the value of the field: TypeIdUsg (CDR_BILLED.type_id_usg)
   * @return Integer the value
   */
  public Integer getTypeIdUsg () {
    return this.TypeIdUsg;
  }
  /** Change the field to not being actively set: TypeIdUsg (CDR_BILLED.type_id_usg)
   */
  public void unsetTypeIdUsg () {
    this._TypeIdUsgSet = false;
  }
  /** See if the field is actively set: TypeIdUsg (CDR_BILLED.type_id_usg)
   * @return boolean whether the field is actively set
   */
  public boolean issetTypeIdUsg () {
    return this._TypeIdUsgSet;
  }
  /** set the fields value: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExtTrackingId") 
  public void setExtTrackingId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 32))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExtTrackingId", "setExtTrackingId");
    }
    this.ExtTrackingId = value;
    this._ExtTrackingIdSet = true;
  }

  /** Retrieves the ExtTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExtTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExtTrackingId field
   */
   public String getExtTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtTrackingIdAsFormattedString");
       return fmtMgr.formatString(this.getExtTrackingId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExtTrackingId field from a formatted string
   *
   * @param _value the ExtTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExtTrackingId field
   */
   public void setExtTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExtTrackingId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExtTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExtTrackingIdFromFormattedString");
   }

  /** get the value of the field: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @return String the value
   */
  public String getExtTrackingId () {
    return this.ExtTrackingId;
  }
  /** Change the field to not being actively set: ExtTrackingId (CDR_DATA.ext_tracking_id)
   */
  public void unsetExtTrackingId () {
    this._ExtTrackingIdSet = false;
  }
  /** See if the field is actively set: ExtTrackingId (CDR_DATA.ext_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExtTrackingId () {
    return this._ExtTrackingIdSet;
  }
  /** set the fields value: TransId (CDR_DATA.trans_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransId") 
  public void setTransId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransId", "setTransId");
    }
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TransId", "setTransId");
    }
    this.TransId = value;
    this._TransIdSet = true;
  }

  /** Retrieves the TransId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransId field
   */
   public String getTransIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransIdAsFormattedString");
       return fmtMgr.formatString(this.getTransId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransId field from a formatted string
   *
   * @param _value the TransId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransId field
   */
   public void setTransIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransIdFromFormattedString");
   }

  /** get the value of the field: TransId (CDR_DATA.trans_id)
   * @return String the value
   */
  public String getTransId () {
    return this.TransId;
  }
  /** Change the field to not being actively set: TransId (CDR_DATA.trans_id)
   */
  public void unsetTransId () {
    this._TransIdSet = false;
  }
  /** See if the field is actively set: TransId (CDR_DATA.trans_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransId () {
    return this._TransIdSet;
  }
  /** set the fields value: ElementId (CDR_DATA.element_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ElementId") 
  public void setElementId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ElementId", "setElementId");
    }
    this.ElementId = value;
    this._ElementIdSet = true;
  }

  /** Retrieves the ElementId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ElementId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ElementId field
   */
   public String getElementIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdAsFormattedString");
       return fmtMgr.formatNumber(this.getElementId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ElementId field from a formatted string
   *
   * @param _value the ElementId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ElementId field
   */
   public void setElementIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setElementId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setElementIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setElementIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ElementId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ElementId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ElementId field
   */

  public String getElementIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getElementIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getElementId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ElementId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ElementId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ElementId field
   */
  public Enumeration getElementIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getElementIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ProductType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getElementIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getElementIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ElementId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setElementIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setElementIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getElementIdEnumeration(_locale);
      this.setElementId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ElementId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setElementIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setElementIdFromDisplayValue");
  }

  /** get the value of the field: ElementId (CDR_DATA.element_id)
   * @return Integer the value
   */
  public Integer getElementId () {
    return this.ElementId;
  }
  /** Change the field to not being actively set: ElementId (CDR_DATA.element_id)
   */
  public void unsetElementId () {
    this._ElementIdSet = false;
  }
  /** See if the field is actively set: ElementId (CDR_DATA.element_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetElementId () {
    return this._ElementIdSet;
  }
  /** set the fields value: RateClass (CDR_DATA.rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateClass") 
  public void setRateClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateClass", "setRateClass");
    }
    this.RateClass = value;
    this._RateClassSet = true;
  }

  /** Retrieves the RateClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateClass field
   */
   public String getRateClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassAsFormattedString");
       return fmtMgr.formatNumber(this.getRateClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateClass field from a formatted string
   *
   * @param _value the RateClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateClass field
   */
   public void setRateClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateClassFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RateClass field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RateClass field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateClass field
   */

  public String getRateClassDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateClassEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRateClass()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClass");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RateClass field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RateClass field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateClass field
   */
  public Enumeration getRateClassEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateClassEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RateClass", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateClassEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClass");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateClassEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RateClass field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRateClassFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateClassEnumeration(_locale);
      this.setRateClass((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateClass");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateClassFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateClassFromDisplayValue");
  }

  /** get the value of the field: RateClass (CDR_DATA.rate_class)
   * @return Integer the value
   */
  public Integer getRateClass () {
    return this.RateClass;
  }
  /** Change the field to not being actively set: RateClass (CDR_DATA.rate_class)
   */
  public void unsetRateClass () {
    this._RateClassSet = false;
  }
  /** See if the field is actively set: RateClass (CDR_DATA.rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateClass () {
    return this._RateClassSet;
  }
  /** set the fields value: BillClass (CDR_DATA.bill_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillClass") 
  public void setBillClass (Integer value) throws ServiceException
  {
    this.BillClass = value;
    this._BillClassSet = true;
  }

  /** Retrieves the BillClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillClass field
   */
   public String getBillClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillClassAsFormattedString");
       return fmtMgr.formatNumber(this.getBillClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillClass field from a formatted string
   *
   * @param _value the BillClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillClass field
   */
   public void setBillClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillClassFromFormattedString");
   }

  /** get the value of the field: BillClass (CDR_DATA.bill_class)
   * @return Integer the value
   */
  public Integer getBillClass () {
    return this.BillClass;
  }
  /** Change the field to not being actively set: BillClass (CDR_DATA.bill_class)
   */
  public void unsetBillClass () {
    this._BillClassSet = false;
  }
  /** See if the field is actively set: BillClass (CDR_DATA.bill_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillClass () {
    return this._BillClassSet;
  }
  /** set the fields value: ProviderId (CDR_DATA.provider_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProviderId") 
  public void setProviderId (Integer value) throws ServiceException
  {
    this.ProviderId = value;
    this._ProviderIdSet = true;
  }

  /** Retrieves the ProviderId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProviderId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProviderId field
   */
   public String getProviderIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdAsFormattedString");
       return fmtMgr.formatNumber(this.getProviderId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProviderId field from a formatted string
   *
   * @param _value the ProviderId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProviderId field
   */
   public void setProviderIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProviderId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProviderId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProviderIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ProviderId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ProviderId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ProviderId field
   */

  public String getProviderIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getProviderIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getProviderId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ProviderId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ProviderId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ProviderId field
   */
  public Enumeration getProviderIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProviderIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ProviderType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProviderIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProviderIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ProviderId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setProviderIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProviderIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getProviderIdEnumeration(_locale);
      this.setProviderId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProviderId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProviderIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProviderIdFromDisplayValue");
  }

  /** get the value of the field: ProviderId (CDR_DATA.provider_id)
   * @return Integer the value
   */
  public Integer getProviderId () {
    return this.ProviderId;
  }
  /** Change the field to not being actively set: ProviderId (CDR_DATA.provider_id)
   */
  public void unsetProviderId () {
    this._ProviderIdSet = false;
  }
  /** See if the field is actively set: ProviderId (CDR_DATA.provider_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProviderId () {
    return this._ProviderIdSet;
  }
  /** set the fields value: Jurisdiction (CDR_DATA.jurisdiction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Jurisdiction") 
  public void setJurisdiction (Integer value) throws ServiceException
  {
    this.Jurisdiction = value;
    this._JurisdictionSet = true;
  }

  /** Retrieves the Jurisdiction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Jurisdiction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Jurisdiction field
   */
   public String getJurisdictionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionAsFormattedString");
       return fmtMgr.formatNumber(this.getJurisdiction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Jurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionAsFormattedString");
       throw x;
     }
   }
  /** Sets the Jurisdiction field from a formatted string
   *
   * @param _value the Jurisdiction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Jurisdiction field
   */
   public void setJurisdictionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setJurisdiction(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Jurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setJurisdictionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setJurisdictionFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated Jurisdiction field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the Jurisdiction field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Jurisdiction field
   */

  public String getJurisdictionDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getJurisdictionEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getJurisdiction()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Jurisdiction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated Jurisdiction field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the Jurisdiction field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Jurisdiction field
   */
  public Enumeration getJurisdictionEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getJurisdictionEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Jurisdiction", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getJurisdictionEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Jurisdiction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getJurisdictionEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated Jurisdiction field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setJurisdictionFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJurisdictionFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getJurisdictionEnumeration(_locale);
      this.setJurisdiction((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Jurisdiction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setJurisdictionFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setJurisdictionFromDisplayValue");
  }

  /** get the value of the field: Jurisdiction (CDR_DATA.jurisdiction)
   * @return Integer the value
   */
  public Integer getJurisdiction () {
    return this.Jurisdiction;
  }
  /** Change the field to not being actively set: Jurisdiction (CDR_DATA.jurisdiction)
   */
  public void unsetJurisdiction () {
    this._JurisdictionSet = false;
  }
  /** See if the field is actively set: Jurisdiction (CDR_DATA.jurisdiction)
   * @return boolean whether the field is actively set
   */
  public boolean issetJurisdiction () {
    return this._JurisdictionSet;
  }
  /** set the fields value: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateCurrencyCode") 
  public void setRateCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateCurrencyCode", "setRateCurrencyCode");
    }
    this.RateCurrencyCode = value;
    this._RateCurrencyCodeSet = true;
  }

  /** Retrieves the RateCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyCode field
   */
   public String getRateCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getRateCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateCurrencyCode field from a formatted string
   *
   * @param _value the RateCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateCurrencyCode field
   */
   public void setRateCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RateCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RateCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateCurrencyCode field
   */

  public String getRateCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRateCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RateCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RateCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RateCurrencyCode field
   */
  public Enumeration getRateCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RateCurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRateCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRateCurrencyCodeEnumeration(_locale);
      this.setRateCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * @return Integer the value
   */
  public Integer getRateCurrencyCode () {
    return this.RateCurrencyCode;
  }
  /** Change the field to not being actively set: RateCurrencyCode (CDR_DATA.rate_currency_code)
   */
  public void unsetRateCurrencyCode () {
    this._RateCurrencyCodeSet = false;
  }
  /** See if the field is actively set: RateCurrencyCode (CDR_DATA.rate_currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateCurrencyCode () {
    return this._RateCurrencyCodeSet;
  }
  /** set the fields value: AccountNo (CDR_DATA.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountNo") 
  public void setAccountNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountNo", "setAccountNo");
    }
    this.AccountNo = value;
    this._AccountNoSet = true;
  }

  /** Retrieves the AccountNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountNo field
   */
   public String getAccountNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountNoAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountNo field from a formatted string
   *
   * @param _value the AccountNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountNo field
   */
   public void setAccountNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountNoFromFormattedString");
   }

  /** get the value of the field: AccountNo (CDR_DATA.account_no)
   * @return Integer the value
   */
  public Integer getAccountNo () {
    return this.AccountNo;
  }
  /** Change the field to not being actively set: AccountNo (CDR_DATA.account_no)
   */
  public void unsetAccountNo () {
    this._AccountNoSet = false;
  }
  /** See if the field is actively set: AccountNo (CDR_DATA.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountNo () {
    return this._AccountNoSet;
  }
  /** set the fields value: ExternalId (CDR_DATA.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalId") 
  public void setExternalId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExternalId", "setExternalId");
    }
    this.ExternalId = value;
    this._ExternalIdSet = true;
  }

  /** Retrieves the ExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalId field
   */
   public String getExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalId field from a formatted string
   *
   * @param _value the ExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalId field
   */
   public void setExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdFromFormattedString");
   }

  /** get the value of the field: ExternalId (CDR_DATA.external_id)
   * @return String the value
   */
  public String getExternalId () {
    return this.ExternalId;
  }
  /** Change the field to not being actively set: ExternalId (CDR_DATA.external_id)
   */
  public void unsetExternalId () {
    this._ExternalIdSet = false;
  }
  /** See if the field is actively set: ExternalId (CDR_DATA.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalId () {
    return this._ExternalIdSet;
  }
  /** set the fields value: ExternalIdType (CDR_DATA.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalIdType") 
  public void setExternalIdType (Integer value) throws ServiceException
  {
    this.ExternalIdType = value;
    this._ExternalIdTypeSet = true;
  }

  /** Retrieves the ExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalIdType field
   */
   public String getExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalIdType field from a formatted string
   *
   * @param _value the ExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalIdType field
   */
   public void setExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalIdTypeFromFormattedString");
   }

  /** get the value of the field: ExternalIdType (CDR_DATA.external_id_type)
   * @return Integer the value
   */
  public Integer getExternalIdType () {
    return this.ExternalIdType;
  }
  /** Change the field to not being actively set: ExternalIdType (CDR_DATA.external_id_type)
   */
  public void unsetExternalIdType () {
    this._ExternalIdTypeSet = false;
  }
  /** See if the field is actively set: ExternalIdType (CDR_DATA.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalIdType () {
    return this._ExternalIdTypeSet;
  }
  /** set the fields value: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountryCodeOrigin") 
  public void setCountryCodeOrigin (Integer value) throws ServiceException
  {
    this.CountryCodeOrigin = value;
    this._CountryCodeOriginSet = true;
  }

  /** Retrieves the CountryCodeOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountryCodeOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCodeOrigin field
   */
   public String getCountryCodeOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginAsFormattedString");
       return fmtMgr.formatNumber(this.getCountryCodeOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCodeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountryCodeOrigin field from a formatted string
   *
   * @param _value the CountryCodeOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountryCodeOrigin field
   */
   public void setCountryCodeOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountryCodeOrigin(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCodeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeOriginFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CountryCodeOrigin field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CountryCodeOrigin field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeOrigin field
   */

  public String getCountryCodeOriginDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCountryCodeOriginEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCountryCodeOrigin()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CountryCodeOrigin field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CountryCodeOrigin field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeOrigin field
   */
  public Enumeration getCountryCodeOriginEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeOriginEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CountryCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeOriginEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeOriginEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CountryCodeOrigin field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCountryCodeOriginFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeOriginFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCountryCodeOriginEnumeration(_locale);
      this.setCountryCodeOrigin((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeOriginFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeOriginFromDisplayValue");
  }

  /** get the value of the field: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * @return Integer the value
   */
  public Integer getCountryCodeOrigin () {
    return this.CountryCodeOrigin;
  }
  /** Change the field to not being actively set: CountryCodeOrigin (CDR_DATA.country_code_origin)
   */
  public void unsetCountryCodeOrigin () {
    this._CountryCodeOriginSet = false;
  }
  /** See if the field is actively set: CountryCodeOrigin (CDR_DATA.country_code_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCodeOrigin () {
    return this._CountryCodeOriginSet;
  }
  /** set the fields value: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountryDialCodeOrigin") 
  public void setCountryDialCodeOrigin (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CountryDialCodeOrigin", "setCountryDialCodeOrigin");
    }
    this.CountryDialCodeOrigin = value;
    this._CountryDialCodeOriginSet = true;
  }

  /** Retrieves the CountryDialCodeOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountryDialCodeOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryDialCodeOrigin field
   */
   public String getCountryDialCodeOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryDialCodeOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryDialCodeOriginAsFormattedString");
       return fmtMgr.formatString(this.getCountryDialCodeOrigin());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryDialCodeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryDialCodeOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountryDialCodeOrigin field from a formatted string
   *
   * @param _value the CountryDialCodeOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountryDialCodeOrigin field
   */
   public void setCountryDialCodeOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryDialCodeOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountryDialCodeOrigin(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryDialCodeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryDialCodeOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryDialCodeOriginFromFormattedString");
   }

  /** get the value of the field: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @return String the value
   */
  public String getCountryDialCodeOrigin () {
    return this.CountryDialCodeOrigin;
  }
  /** Change the field to not being actively set: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   */
  public void unsetCountryDialCodeOrigin () {
    this._CountryDialCodeOriginSet = false;
  }
  /** See if the field is actively set: CountryDialCodeOrigin (CDR_DATA.country_dial_code_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryDialCodeOrigin () {
    return this._CountryDialCodeOriginSet;
  }
  /** set the fields value: PointIdOrigin (CDR_DATA.point_id_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointIdOrigin") 
  public void setPointIdOrigin (Integer value) throws ServiceException
  {
    this.PointIdOrigin = value;
    this._PointIdOriginSet = true;
  }

  /** Retrieves the PointIdOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointIdOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointIdOrigin field
   */
   public String getPointIdOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdOriginAsFormattedString");
       return fmtMgr.formatNumber(this.getPointIdOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointIdOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointIdOrigin field from a formatted string
   *
   * @param _value the PointIdOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointIdOrigin field
   */
   public void setPointIdOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointIdOrigin(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointIdOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointIdOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointIdOriginFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated PointIdOrigin field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PointIdOrigin field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PointIdOrigin field
   */

  public String getPointIdOriginDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdOriginDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPointIdOriginEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdOriginDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPointIdOrigin()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdOriginDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PointIdOrigin field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PointIdOrigin field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PointIdOrigin field
   */
  public Enumeration getPointIdOriginEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdOriginEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("UsagePoint", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdOriginEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdOriginEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PointIdOrigin field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPointIdOriginFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointIdOriginFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPointIdOriginEnumeration(_locale);
      this.setPointIdOrigin((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdOrigin");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointIdOriginFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointIdOriginFromDisplayValue");
  }

  /** get the value of the field: PointIdOrigin (CDR_DATA.point_id_origin)
   * @return Integer the value
   */
  public Integer getPointIdOrigin () {
    return this.PointIdOrigin;
  }
  /** Change the field to not being actively set: PointIdOrigin (CDR_DATA.point_id_origin)
   */
  public void unsetPointIdOrigin () {
    this._PointIdOriginSet = false;
  }
  /** See if the field is actively set: PointIdOrigin (CDR_DATA.point_id_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointIdOrigin () {
    return this._PointIdOriginSet;
  }
  /** set the fields value: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointTaxCodeOrigin") 
  public void setPointTaxCodeOrigin (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PointTaxCodeOrigin", "setPointTaxCodeOrigin");
    }
    this.PointTaxCodeOrigin = value;
    this._PointTaxCodeOriginSet = true;
  }

  /** Retrieves the PointTaxCodeOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTaxCodeOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTaxCodeOrigin field
   */
   public String getPointTaxCodeOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTaxCodeOriginAsFormattedString");
       return fmtMgr.formatString(this.getPointTaxCodeOrigin());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTaxCodeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTaxCodeOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTaxCodeOrigin field from a formatted string
   *
   * @param _value the PointTaxCodeOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTaxCodeOrigin field
   */
   public void setPointTaxCodeOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTaxCodeOrigin(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTaxCodeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTaxCodeOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTaxCodeOriginFromFormattedString");
   }

  /** get the value of the field: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @return String the value
   */
  public String getPointTaxCodeOrigin () {
    return this.PointTaxCodeOrigin;
  }
  /** Change the field to not being actively set: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   */
  public void unsetPointTaxCodeOrigin () {
    this._PointTaxCodeOriginSet = false;
  }
  /** See if the field is actively set: PointTaxCodeOrigin (CDR_DATA.point_tax_code_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTaxCodeOrigin () {
    return this._PointTaxCodeOriginSet;
  }
  /** set the fields value: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointTaxCodeTypeOrigin") 
  public void setPointTaxCodeTypeOrigin (Integer value) throws ServiceException
  {
    this.PointTaxCodeTypeOrigin = value;
    this._PointTaxCodeTypeOriginSet = true;
  }

  /** Retrieves the PointTaxCodeTypeOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTaxCodeTypeOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTaxCodeTypeOrigin field
   */
   public String getPointTaxCodeTypeOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeTypeOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTaxCodeTypeOriginAsFormattedString");
       return fmtMgr.formatNumber(this.getPointTaxCodeTypeOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTaxCodeTypeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTaxCodeTypeOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTaxCodeTypeOrigin field from a formatted string
   *
   * @param _value the PointTaxCodeTypeOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTaxCodeTypeOrigin field
   */
   public void setPointTaxCodeTypeOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeTypeOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTaxCodeTypeOrigin(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTaxCodeTypeOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTaxCodeTypeOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTaxCodeTypeOriginFromFormattedString");
   }

  /** get the value of the field: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * @return Integer the value
   */
  public Integer getPointTaxCodeTypeOrigin () {
    return this.PointTaxCodeTypeOrigin;
  }
  /** Change the field to not being actively set: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   */
  public void unsetPointTaxCodeTypeOrigin () {
    this._PointTaxCodeTypeOriginSet = false;
  }
  /** See if the field is actively set: PointTaxCodeTypeOrigin (CDR_DATA.point_tax_code_type_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTaxCodeTypeOrigin () {
    return this._PointTaxCodeTypeOriginSet;
  }
  /** set the fields value: CountryCodeTarget (CDR_DATA.country_code_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CountryCodeTarget") 
  public void setCountryCodeTarget (Integer value) throws ServiceException
  {
    this.CountryCodeTarget = value;
    this._CountryCodeTargetSet = true;
  }

  /** Retrieves the CountryCodeTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CountryCodeTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CountryCodeTarget field
   */
   public String getCountryCodeTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetAsFormattedString");
       return fmtMgr.formatNumber(this.getCountryCodeTarget(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCodeTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the CountryCodeTarget field from a formatted string
   *
   * @param _value the CountryCodeTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CountryCodeTarget field
   */
   public void setCountryCodeTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCountryCodeTarget(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CountryCodeTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCountryCodeTargetFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CountryCodeTarget field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CountryCodeTarget field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeTarget field
   */

  public String getCountryCodeTargetDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCountryCodeTargetEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCountryCodeTarget()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CountryCodeTarget field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CountryCodeTarget field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CountryCodeTarget field
   */
  public Enumeration getCountryCodeTargetEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCountryCodeTargetEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CountryCode", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCountryCodeTargetEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCountryCodeTargetEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CountryCodeTarget field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCountryCodeTargetFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeTargetFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCountryCodeTargetEnumeration(_locale);
      this.setCountryCodeTarget((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CountryCodeTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCountryCodeTargetFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCountryCodeTargetFromDisplayValue");
  }

  /** get the value of the field: CountryCodeTarget (CDR_DATA.country_code_target)
   * @return Integer the value
   */
  public Integer getCountryCodeTarget () {
    return this.CountryCodeTarget;
  }
  /** Change the field to not being actively set: CountryCodeTarget (CDR_DATA.country_code_target)
   */
  public void unsetCountryCodeTarget () {
    this._CountryCodeTargetSet = false;
  }
  /** See if the field is actively set: CountryCodeTarget (CDR_DATA.country_code_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetCountryCodeTarget () {
    return this._CountryCodeTargetSet;
  }
  /** set the fields value: PointIdTarget (CDR_DATA.point_id_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointIdTarget") 
  public void setPointIdTarget (Integer value) throws ServiceException
  {
    this.PointIdTarget = value;
    this._PointIdTargetSet = true;
  }

  /** Retrieves the PointIdTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointIdTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointIdTarget field
   */
   public String getPointIdTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdTargetAsFormattedString");
       return fmtMgr.formatNumber(this.getPointIdTarget(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointIdTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointIdTarget field from a formatted string
   *
   * @param _value the PointIdTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointIdTarget field
   */
   public void setPointIdTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointIdTarget(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointIdTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointIdTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointIdTargetFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated PointIdTarget field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PointIdTarget field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PointIdTarget field
   */

  public String getPointIdTargetDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdTargetDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPointIdTargetEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdTargetDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getPointIdTarget()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdTargetDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated PointIdTarget field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the PointIdTarget field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PointIdTarget field
   */
  public Enumeration getPointIdTargetEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointIdTargetEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("UsagePoint", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointIdTargetEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointIdTargetEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated PointIdTarget field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setPointIdTargetFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointIdTargetFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getPointIdTargetEnumeration(_locale);
      this.setPointIdTarget((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PointIdTarget");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointIdTargetFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPointIdTargetFromDisplayValue");
  }

  /** get the value of the field: PointIdTarget (CDR_DATA.point_id_target)
   * @return Integer the value
   */
  public Integer getPointIdTarget () {
    return this.PointIdTarget;
  }
  /** Change the field to not being actively set: PointIdTarget (CDR_DATA.point_id_target)
   */
  public void unsetPointIdTarget () {
    this._PointIdTargetSet = false;
  }
  /** See if the field is actively set: PointIdTarget (CDR_DATA.point_id_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointIdTarget () {
    return this._PointIdTargetSet;
  }
  /** set the fields value: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointTaxCodeTarget") 
  public void setPointTaxCodeTarget (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PointTaxCodeTarget", "setPointTaxCodeTarget");
    }
    this.PointTaxCodeTarget = value;
    this._PointTaxCodeTargetSet = true;
  }

  /** Retrieves the PointTaxCodeTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTaxCodeTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTaxCodeTarget field
   */
   public String getPointTaxCodeTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTaxCodeTargetAsFormattedString");
       return fmtMgr.formatString(this.getPointTaxCodeTarget());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTaxCodeTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTaxCodeTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTaxCodeTarget field from a formatted string
   *
   * @param _value the PointTaxCodeTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTaxCodeTarget field
   */
   public void setPointTaxCodeTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTaxCodeTarget(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTaxCodeTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTaxCodeTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTaxCodeTargetFromFormattedString");
   }

  /** get the value of the field: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @return String the value
   */
  public String getPointTaxCodeTarget () {
    return this.PointTaxCodeTarget;
  }
  /** Change the field to not being actively set: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   */
  public void unsetPointTaxCodeTarget () {
    this._PointTaxCodeTargetSet = false;
  }
  /** See if the field is actively set: PointTaxCodeTarget (CDR_DATA.point_tax_code_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTaxCodeTarget () {
    return this._PointTaxCodeTargetSet;
  }
  /** set the fields value: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointTaxCodeTypeTarget") 
  public void setPointTaxCodeTypeTarget (Integer value) throws ServiceException
  {
    this.PointTaxCodeTypeTarget = value;
    this._PointTaxCodeTypeTargetSet = true;
  }

  /** Retrieves the PointTaxCodeTypeTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointTaxCodeTypeTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointTaxCodeTypeTarget field
   */
   public String getPointTaxCodeTypeTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeTypeTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointTaxCodeTypeTargetAsFormattedString");
       return fmtMgr.formatNumber(this.getPointTaxCodeTypeTarget(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTaxCodeTypeTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointTaxCodeTypeTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointTaxCodeTypeTarget field from a formatted string
   *
   * @param _value the PointTaxCodeTypeTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointTaxCodeTypeTarget field
   */
   public void setPointTaxCodeTypeTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointTaxCodeTypeTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointTaxCodeTypeTarget(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointTaxCodeTypeTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointTaxCodeTypeTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointTaxCodeTypeTargetFromFormattedString");
   }

  /** get the value of the field: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * @return Integer the value
   */
  public Integer getPointTaxCodeTypeTarget () {
    return this.PointTaxCodeTypeTarget;
  }
  /** Change the field to not being actively set: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   */
  public void unsetPointTaxCodeTypeTarget () {
    this._PointTaxCodeTypeTargetSet = false;
  }
  /** See if the field is actively set: PointTaxCodeTypeTarget (CDR_DATA.point_tax_code_type_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointTaxCodeTypeTarget () {
    return this._PointTaxCodeTypeTargetSet;
  }
  /** set the fields value: RateDt (CDR_DATA.rate_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateDt") 
  public void setRateDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateDt", "setRateDt");
    }
    this.RateDt = value;
    this._RateDtSet = true;
  }

  /** Retrieves the RateDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateDt field
   */
   public String getRateDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateDtAsFormattedString");
       return fmtMgr.formatDate(this.getRateDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateDt field from a formatted string
   *
   * @param _value the RateDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateDt field
   */
   public void setRateDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateDtFromFormattedString");
   }

  /**
   * Retrieves the RateDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateDt field
   */
  public String getRateDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getRateDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RateDt field value from a formatted date/time string
   *
   * @param _value the RateDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateDt field
   */
  public void setRateDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRateDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: RateDt (CDR_DATA.rate_dt)
   * @return Date the value
   */
  public Date getRateDt () {
    return this.RateDt;
  }
  /** Change the field to not being actively set: RateDt (CDR_DATA.rate_dt)
   */
  public void unsetRateDt () {
    this._RateDtSet = false;
  }
  /** See if the field is actively set: RateDt (CDR_DATA.rate_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateDt () {
    return this._RateDtSet;
  }
  /** set the fields value: SecondDt (CDR_DATA.second_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SecondDt") 
  public void setSecondDt (Date value) throws ServiceException
  {
    this.SecondDt = value;
    this._SecondDtSet = true;
  }

  /** Retrieves the SecondDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SecondDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondDt field
   */
   public String getSecondDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondDtAsFormattedString");
       return fmtMgr.formatDate(this.getSecondDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SecondDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the SecondDt field from a formatted string
   *
   * @param _value the SecondDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SecondDt field
   */
   public void setSecondDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSecondDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SecondDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecondDtFromFormattedString");
   }

  /**
   * Retrieves the SecondDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SecondDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondDt field
   */
  public String getSecondDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getSecondDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the SecondDt field value from a formatted date/time string
   *
   * @param _value the SecondDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SecondDt field
   */
  public void setSecondDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSecondDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setSecondDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: SecondDt (CDR_DATA.second_dt)
   * @return Date the value
   */
  public Date getSecondDt () {
    return this.SecondDt;
  }
  /** Change the field to not being actively set: SecondDt (CDR_DATA.second_dt)
   */
  public void unsetSecondDt () {
    this._SecondDtSet = false;
  }
  /** See if the field is actively set: SecondDt (CDR_DATA.second_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetSecondDt () {
    return this._SecondDtSet;
  }
  /** set the fields value: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxRateActiveDt") 
  public void setTaxRateActiveDt (Date value) throws ServiceException
  {
    this.TaxRateActiveDt = value;
    this._TaxRateActiveDtSet = true;
  }

  /** Retrieves the TaxRateActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxRateActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateActiveDt field
   */
   public String getTaxRateActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getTaxRateActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxRateActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxRateActiveDt field from a formatted string
   *
   * @param _value the TaxRateActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxRateActiveDt field
   */
   public void setTaxRateActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxRateActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxRateActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateActiveDtFromFormattedString");
   }

  /**
   * Retrieves the TaxRateActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxRateActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateActiveDt field
   */
  public String getTaxRateActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTaxRateActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TaxRateActiveDt field value from a formatted date/time string
   *
   * @param _value the TaxRateActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxRateActiveDt field
   */
  public void setTaxRateActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxRateActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTaxRateActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * @return Date the value
   */
  public Date getTaxRateActiveDt () {
    return this.TaxRateActiveDt;
  }
  /** Change the field to not being actively set: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   */
  public void unsetTaxRateActiveDt () {
    this._TaxRateActiveDtSet = false;
  }
  /** See if the field is actively set: TaxRateActiveDt (CDR_DATA.tax_rate_active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxRateActiveDt () {
    return this._TaxRateActiveDtSet;
  }
  /** set the fields value: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxRateInactiveDt") 
  public void setTaxRateInactiveDt (Date value) throws ServiceException
  {
    this.TaxRateInactiveDt = value;
    this._TaxRateInactiveDtSet = true;
  }

  /** Retrieves the TaxRateInactiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxRateInactiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateInactiveDt field
   */
   public String getTaxRateInactiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateInactiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateInactiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getTaxRateInactiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxRateInactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateInactiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxRateInactiveDt field from a formatted string
   *
   * @param _value the TaxRateInactiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxRateInactiveDt field
   */
   public void setTaxRateInactiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateInactiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxRateInactiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxRateInactiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateInactiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxRateInactiveDtFromFormattedString");
   }

  /**
   * Retrieves the TaxRateInactiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxRateInactiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxRateInactiveDt field
   */
  public String getTaxRateInactiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxRateInactiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxRateInactiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTaxRateInactiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateInactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxRateInactiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TaxRateInactiveDt field value from a formatted date/time string
   *
   * @param _value the TaxRateInactiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxRateInactiveDt field
   */
  public void setTaxRateInactiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxRateInactiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTaxRateInactiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxRateInactiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxRateInactiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * @return Date the value
   */
  public Date getTaxRateInactiveDt () {
    return this.TaxRateInactiveDt;
  }
  /** Change the field to not being actively set: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   */
  public void unsetTaxRateInactiveDt () {
    this._TaxRateInactiveDtSet = false;
  }
  /** See if the field is actively set: TaxRateInactiveDt (CDR_DATA.tax_rate_inactive_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxRateInactiveDt () {
    return this._TaxRateInactiveDtSet;
  }
  /** set the fields value: Timezone (CDR_DATA.timezone)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Timezone") 
  public void setTimezone (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Timezone", "setTimezone");
    }
    this.Timezone = value;
    this._TimezoneSet = true;
  }

  /** Retrieves the Timezone field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Timezone field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Timezone field
   */
   public String getTimezoneAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneAsFormattedString");
       return fmtMgr.formatNumber(this.getTimezone(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Timezone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTimezoneAsFormattedString");
       throw x;
     }
   }
  /** Sets the Timezone field from a formatted string
   *
   * @param _value the Timezone field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Timezone field
   */
   public void setTimezoneFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTimezone(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Timezone");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTimezoneFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTimezoneFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated Timezone field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the Timezone field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Timezone field
   */

  public String getTimezoneDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTimezoneEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getTimezone()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Timezone");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTimezoneDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated Timezone field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the Timezone field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the Timezone field
   */
  public Enumeration getTimezoneEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTimezoneEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Timezone", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTimezoneEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Timezone");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTimezoneEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated Timezone field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setTimezoneFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTimezoneFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getTimezoneEnumeration(_locale);
      this.setTimezone((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Timezone");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTimezoneFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTimezoneFromDisplayValue");
  }

  /** get the value of the field: Timezone (CDR_DATA.timezone)
   * @return Integer the value
   */
  public Integer getTimezone () {
    return this.Timezone;
  }
  /** Change the field to not being actively set: Timezone (CDR_DATA.timezone)
   */
  public void unsetTimezone () {
    this._TimezoneSet = false;
  }
  /** See if the field is actively set: Timezone (CDR_DATA.timezone)
   * @return boolean whether the field is actively set
   */
  public boolean issetTimezone () {
    return this._TimezoneSet;
  }
  /** set the fields value: PrimaryUnits (CDR_DATA.primary_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PrimaryUnits") 
  public void setPrimaryUnits (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PrimaryUnits", "setPrimaryUnits");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PrimaryUnits", "setPrimaryUnits");
    }
    this.PrimaryUnits = value;
    this._PrimaryUnitsSet = true;
  }

  /** Retrieves the PrimaryUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PrimaryUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrimaryUnits field
   */
   public String getPrimaryUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrimaryUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getPrimaryUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrimaryUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the PrimaryUnits field from a formatted string
   *
   * @param _value the PrimaryUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PrimaryUnits field
   */
   public void setPrimaryUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrimaryUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPrimaryUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PrimaryUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrimaryUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrimaryUnitsFromFormattedString");
   }

  /** get the value of the field: PrimaryUnits (CDR_DATA.primary_units)
   * @return BigInteger the value
   */
  public BigInteger getPrimaryUnits () {
    return this.PrimaryUnits;
  }
  /** Change the field to not being actively set: PrimaryUnits (CDR_DATA.primary_units)
   */
  public void unsetPrimaryUnits () {
    this._PrimaryUnitsSet = false;
  }
  /** See if the field is actively set: PrimaryUnits (CDR_DATA.primary_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetPrimaryUnits () {
    return this._PrimaryUnitsSet;
  }
  /** set the fields value: SecondUnits (CDR_DATA.second_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SecondUnits") 
  public void setSecondUnits (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SecondUnits", "setSecondUnits");
    }
    this.SecondUnits = value;
    this._SecondUnitsSet = true;
  }

  /** Retrieves the SecondUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SecondUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondUnits field
   */
   public String getSecondUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getSecondUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SecondUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the SecondUnits field from a formatted string
   *
   * @param _value the SecondUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SecondUnits field
   */
   public void setSecondUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSecondUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SecondUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecondUnitsFromFormattedString");
   }

  /** get the value of the field: SecondUnits (CDR_DATA.second_units)
   * @return BigInteger the value
   */
  public BigInteger getSecondUnits () {
    return this.SecondUnits;
  }
  /** Change the field to not being actively set: SecondUnits (CDR_DATA.second_units)
   */
  public void unsetSecondUnits () {
    this._SecondUnitsSet = false;
  }
  /** See if the field is actively set: SecondUnits (CDR_DATA.second_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetSecondUnits () {
    return this._SecondUnitsSet;
  }
  /** set the fields value: ThirdUnits (CDR_DATA.third_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ThirdUnits") 
  public void setThirdUnits (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ThirdUnits", "setThirdUnits");
    }
    this.ThirdUnits = value;
    this._ThirdUnitsSet = true;
  }

  /** Retrieves the ThirdUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ThirdUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThirdUnits field
   */
   public String getThirdUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThirdUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThirdUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getThirdUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThirdUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getThirdUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the ThirdUnits field from a formatted string
   *
   * @param _value the ThirdUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ThirdUnits field
   */
   public void setThirdUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThirdUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setThirdUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThirdUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setThirdUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThirdUnitsFromFormattedString");
   }

  /** get the value of the field: ThirdUnits (CDR_DATA.third_units)
   * @return BigInteger the value
   */
  public BigInteger getThirdUnits () {
    return this.ThirdUnits;
  }
  /** Change the field to not being actively set: ThirdUnits (CDR_DATA.third_units)
   */
  public void unsetThirdUnits () {
    this._ThirdUnitsSet = false;
  }
  /** See if the field is actively set: ThirdUnits (CDR_DATA.third_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetThirdUnits () {
    return this._ThirdUnitsSet;
  }
  /** set the fields value: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitsCurrencyCode") 
  public void setUnitsCurrencyCode (Integer value) throws ServiceException
  {
    this.UnitsCurrencyCode = value;
    this._UnitsCurrencyCodeSet = true;
  }

  /** Retrieves the UnitsCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitsCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsCurrencyCode field
   */
   public String getUnitsCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitsCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitsCurrencyCode field from a formatted string
   *
   * @param _value the UnitsCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitsCurrencyCode field
   */
   public void setUnitsCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitsCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsCurrencyCodeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated UnitsCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the UnitsCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the UnitsCurrencyCode field
   */

  public String getUnitsCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getUnitsCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getUnitsCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated UnitsCurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the UnitsCurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the UnitsCurrencyCode field
   */
  public Enumeration getUnitsCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated UnitsCurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setUnitsCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getUnitsCurrencyCodeEnumeration(_locale);
      this.setUnitsCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsCurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * @return Integer the value
   */
  public Integer getUnitsCurrencyCode () {
    return this.UnitsCurrencyCode;
  }
  /** Change the field to not being actively set: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   */
  public void unsetUnitsCurrencyCode () {
    this._UnitsCurrencyCodeSet = false;
  }
  /** See if the field is actively set: UnitsCurrencyCode (CDR_DATA.units_currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitsCurrencyCode () {
    return this._UnitsCurrencyCodeSet;
  }
  /** set the fields value: BillingUnitsType (CDR_DATA.billing_units_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillingUnitsType") 
  public void setBillingUnitsType (Integer value) throws ServiceException
  {
    this.BillingUnitsType = value;
    this._BillingUnitsTypeSet = true;
  }

  /** Retrieves the BillingUnitsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillingUnitsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingUnitsType field
   */
   public String getBillingUnitsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingUnitsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingUnitsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBillingUnitsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingUnitsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillingUnitsType field from a formatted string
   *
   * @param _value the BillingUnitsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillingUnitsType field
   */
   public void setBillingUnitsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingUnitsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillingUnitsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillingUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingUnitsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingUnitsTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated BillingUnitsType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BillingUnitsType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillingUnitsType field
   */

  public String getBillingUnitsTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingUnitsTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillingUnitsTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingUnitsTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBillingUnitsType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingUnitsType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingUnitsTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BillingUnitsType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BillingUnitsType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BillingUnitsType field
   */
  public Enumeration getBillingUnitsTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingUnitsTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("UnitsType", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingUnitsTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingUnitsType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingUnitsTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BillingUnitsType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBillingUnitsTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingUnitsTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBillingUnitsTypeEnumeration(_locale);
      this.setBillingUnitsType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingUnitsType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingUnitsTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingUnitsTypeFromDisplayValue");
  }

  /** get the value of the field: BillingUnitsType (CDR_DATA.billing_units_type)
   * @return Integer the value
   */
  public Integer getBillingUnitsType () {
    return this.BillingUnitsType;
  }
  /** Change the field to not being actively set: BillingUnitsType (CDR_DATA.billing_units_type)
   */
  public void unsetBillingUnitsType () {
    this._BillingUnitsTypeSet = false;
  }
  /** See if the field is actively set: BillingUnitsType (CDR_DATA.billing_units_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillingUnitsType () {
    return this._BillingUnitsTypeSet;
  }
  /** set the fields value: ProfileId (CDR_DATA.profile_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProfileId") 
  public void setProfileId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ProfileId", "setProfileId");
    }
    this.ProfileId = value;
    this._ProfileIdSet = true;
  }

  /** Retrieves the ProfileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProfileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileId field
   */
   public String getProfileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getProfileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProfileId field from a formatted string
   *
   * @param _value the ProfileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProfileId field
   */
   public void setProfileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProfileId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFromFormattedString");
   }

  /** get the value of the field: ProfileId (CDR_DATA.profile_id)
   * @return BigInteger the value
   */
  public BigInteger getProfileId () {
    return this.ProfileId;
  }
  /** Change the field to not being actively set: ProfileId (CDR_DATA.profile_id)
   */
  public void unsetProfileId () {
    this._ProfileIdSet = false;
  }
  /** See if the field is actively set: ProfileId (CDR_DATA.profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileId () {
    return this._ProfileIdSet;
  }
  /** set the fields value: Annotation (CDR_DATA.annotation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Annotation") 
  public void setAnnotation (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Annotation", "setAnnotation");
    }
    this.Annotation = value;
    this._AnnotationSet = true;
  }

  /** Retrieves the Annotation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Annotation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Annotation field
   */
   public String getAnnotationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationAsFormattedString");
       return fmtMgr.formatString(this.getAnnotation());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationAsFormattedString");
       throw x;
     }
   }
  /** Sets the Annotation field from a formatted string
   *
   * @param _value the Annotation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Annotation field
   */
   public void setAnnotationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAnnotation(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFromFormattedString");
   }

  /** get the value of the field: Annotation (CDR_DATA.annotation)
   * @return String the value
   */
  public String getAnnotation () {
    return this.Annotation;
  }
  /** Change the field to not being actively set: Annotation (CDR_DATA.annotation)
   */
  public void unsetAnnotation () {
    this._AnnotationSet = false;
  }
  /** See if the field is actively set: Annotation (CDR_DATA.annotation)
   * @return boolean whether the field is actively set
   */
  public boolean issetAnnotation () {
    return this._AnnotationSet;
  }
  /** set the fields value: CustomerTag (CDR_DATA.customer_tag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustomerTag") 
  public void setCustomerTag (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustomerTag", "setCustomerTag");
    }
    this.CustomerTag = value;
    this._CustomerTagSet = true;
  }

  /** Retrieves the CustomerTag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustomerTag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustomerTag field
   */
   public String getCustomerTagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerTagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustomerTagAsFormattedString");
       return fmtMgr.formatString(this.getCustomerTag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerTag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustomerTagAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustomerTag field from a formatted string
   *
   * @param _value the CustomerTag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustomerTag field
   */
   public void setCustomerTagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustomerTagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustomerTag(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustomerTag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustomerTagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustomerTagFromFormattedString");
   }

  /** get the value of the field: CustomerTag (CDR_DATA.customer_tag)
   * @return String the value
   */
  public String getCustomerTag () {
    return this.CustomerTag;
  }
  /** Change the field to not being actively set: CustomerTag (CDR_DATA.customer_tag)
   */
  public void unsetCustomerTag () {
    this._CustomerTagSet = false;
  }
  /** See if the field is actively set: CustomerTag (CDR_DATA.customer_tag)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustomerTag () {
    return this._CustomerTagSet;
  }
  /** set the fields value: Units (CDR_DATA.rated_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Units") 
  public void setUnits (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Units", "setUnits");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Units", "setUnits");
    }
    this.Units = value;
    this._UnitsSet = true;
  }

  /** Retrieves the Units field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Units field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Units field
   */
   public String getUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Units");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the Units field from a formatted string
   *
   * @param _value the Units field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Units field
   */
   public void setUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Units");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsFromFormattedString");
   }

  /** get the value of the field: Units (CDR_DATA.rated_units)
   * @return BigInteger the value
   */
  public BigInteger getUnits () {
    return this.Units;
  }
  /** Change the field to not being actively set: Units (CDR_DATA.rated_units)
   */
  public void unsetUnits () {
    this._UnitsSet = false;
  }
  /** See if the field is actively set: Units (CDR_DATA.rated_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnits () {
    return this._UnitsSet;
  }
  /** set the fields value: RatedAmount (CDR_DATA.amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatedAmount") 
  public void setRatedAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatedAmount", "setRatedAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RatedAmount", "setRatedAmount");
    }
    this.RatedAmount = value;
    this._RatedAmountSet = true;
  }

  /** Retrieves the RatedAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatedAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedAmount field
   */
   public String getRatedAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRatedAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatedAmount field from a formatted string
   *
   * @param _value the RatedAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatedAmount field
   */
   public void setRatedAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatedAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatedAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedAmountFromFormattedString");
   }

  /**
   * Retrieves the RatedAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatedAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedAmount field
   */
  public String getRatedAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getRatedAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the RatedAmount field value from a formatted currency string
   *
   * @param _value the RatedAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatedAmount field
   */
  public void setRatedAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatedAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRatedAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: RatedAmount (CDR_DATA.amount)
   * @return BigInteger the value
   */
  public BigInteger getRatedAmount () {
    return this.RatedAmount;
  }
  /** Change the field to not being actively set: RatedAmount (CDR_DATA.amount)
   */
  public void unsetRatedAmount () {
    this._RatedAmountSet = false;
  }
  /** See if the field is actively set: RatedAmount (CDR_DATA.amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatedAmount () {
    return this._RatedAmountSet;
  }
  /** set the fields value: ForeignAmount (CDR_DATA.foreign_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ForeignAmount") 
  public void setForeignAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ForeignAmount", "setForeignAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ForeignAmount", "setForeignAmount");
    }
    this.ForeignAmount = value;
    this._ForeignAmountSet = true;
  }

  /** Retrieves the ForeignAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ForeignAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ForeignAmount field
   */
   public String getForeignAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getForeignAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getForeignAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getForeignAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ForeignAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getForeignAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the ForeignAmount field from a formatted string
   *
   * @param _value the ForeignAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ForeignAmount field
   */
   public void setForeignAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getForeignAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setForeignAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ForeignAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setForeignAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setForeignAmountFromFormattedString");
   }

  /**
   * Retrieves the ForeignAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ForeignAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ForeignAmount field
   */
  public String getForeignAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getForeignAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getForeignAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getForeignAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ForeignAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getForeignAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the ForeignAmount field value from a formatted currency string
   *
   * @param _value the ForeignAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ForeignAmount field
   */
  public void setForeignAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setForeignAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setForeignAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ForeignAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setForeignAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setForeignAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: ForeignAmount (CDR_DATA.foreign_amount)
   * @return BigInteger the value
   */
  public BigInteger getForeignAmount () {
    return this.ForeignAmount;
  }
  /** Change the field to not being actively set: ForeignAmount (CDR_DATA.foreign_amount)
   */
  public void unsetForeignAmount () {
    this._ForeignAmountSet = false;
  }
  /** See if the field is actively set: ForeignAmount (CDR_DATA.foreign_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetForeignAmount () {
    return this._ForeignAmountSet;
  }
  /** set the fields value: RatePeriod (CDR_DATA.rate_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatePeriod") 
  public void setRatePeriod (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatePeriod", "setRatePeriod");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RatePeriod", "setRatePeriod");
    }
    this.RatePeriod = value;
    this._RatePeriodSet = true;
  }

  /** Retrieves the RatePeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatePeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatePeriod field
   */
   public String getRatePeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodAsFormattedString");
       return fmtMgr.formatString(this.getRatePeriod());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatePeriod field from a formatted string
   *
   * @param _value the RatePeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatePeriod field
   */
   public void setRatePeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatePeriod(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePeriodFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RatePeriod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RatePeriod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RatePeriod field
   */

  public String getRatePeriodDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRatePeriodEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRatePeriod()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RatePeriod field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RatePeriod field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RatePeriod field
   */
  public Enumeration getRatePeriodEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RatePeriod", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RatePeriod field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRatePeriodFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatePeriodFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRatePeriodEnumeration(_locale);
      this.setRatePeriod((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatePeriod");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePeriodFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatePeriodFromDisplayValue");
  }

  /** get the value of the field: RatePeriod (CDR_DATA.rate_period)
   * @return String the value
   */
  public String getRatePeriod () {
    return this.RatePeriod;
  }
  /** Change the field to not being actively set: RatePeriod (CDR_DATA.rate_period)
   */
  public void unsetRatePeriod () {
    this._RatePeriodSet = false;
  }
  /** See if the field is actively set: RatePeriod (CDR_DATA.rate_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatePeriod () {
    return this._RatePeriodSet;
  }
  /** set the fields value: NoBill (CDR_DATA.no_bill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoBill") 
  public void setNoBill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoBill", "setNoBill");
    }
    this.NoBill = value;
    this._NoBillSet = true;
  }

  /** Retrieves the NoBill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoBill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBill field
   */
   public String getNoBillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillAsFormattedString");
       return fmtMgr.formatBoolean(this.getNoBill());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoBill field from a formatted string
   *
   * @param _value the NoBill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoBill field
   */
   public void setNoBillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoBill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFromFormattedString");
   }

  /** get the value of the field: NoBill (CDR_DATA.no_bill)
   * @return Boolean the value
   */
  public Boolean getNoBill () {
    return this.NoBill;
  }
  /** Change the field to not being actively set: NoBill (CDR_DATA.no_bill)
   */
  public void unsetNoBill () {
    this._NoBillSet = false;
  }
  /** See if the field is actively set: NoBill (CDR_DATA.no_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoBill () {
    return this._NoBillSet;
  }
  /** set the fields value: CompStatus (CDR_DATA.comp_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CompStatus") 
  public void setCompStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CompStatus", "setCompStatus");
    }
    this.CompStatus = value;
    this._CompStatusSet = true;
  }

  /** Retrieves the CompStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CompStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CompStatus field
   */
   public String getCompStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCompStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getCompStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CompStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCompStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the CompStatus field from a formatted string
   *
   * @param _value the CompStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CompStatus field
   */
   public void setCompStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCompStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCompStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CompStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCompStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCompStatusFromFormattedString");
   }

  /** get the value of the field: CompStatus (CDR_DATA.comp_status)
   * @return Integer the value
   */
  public Integer getCompStatus () {
    return this.CompStatus;
  }
  /** Change the field to not being actively set: CompStatus (CDR_DATA.comp_status)
   */
  public void unsetCompStatus () {
    this._CompStatusSet = false;
  }
  /** See if the field is actively set: CompStatus (CDR_DATA.comp_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetCompStatus () {
    return this._CompStatusSet;
  }
  /** set the fields value: CdrStatus (CDR_DATA.cdr_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CdrStatus") 
  public void setCdrStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CdrStatus", "setCdrStatus");
    }
    this.CdrStatus = value;
    this._CdrStatusSet = true;
  }

  /** Retrieves the CdrStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CdrStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CdrStatus field
   */
   public String getCdrStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCdrStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getCdrStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CdrStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCdrStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the CdrStatus field from a formatted string
   *
   * @param _value the CdrStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CdrStatus field
   */
   public void setCdrStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCdrStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCdrStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CdrStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCdrStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCdrStatusFromFormattedString");
   }

  /** get the value of the field: CdrStatus (CDR_DATA.cdr_status)
   * @return Integer the value
   */
  public Integer getCdrStatus () {
    return this.CdrStatus;
  }
  /** Change the field to not being actively set: CdrStatus (CDR_DATA.cdr_status)
   */
  public void unsetCdrStatus () {
    this._CdrStatusSet = false;
  }
  /** See if the field is actively set: CdrStatus (CDR_DATA.cdr_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetCdrStatus () {
    return this._CdrStatusSet;
  }
  /** set the fields value: FileId (CDR_DATA.file_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FileId") 
  public void setFileId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FileId", "setFileId");
    }
    this.FileId = value;
    this._FileIdSet = true;
  }

  /** Retrieves the FileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileId field
   */
   public String getFileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdAsFormattedString");
       return fmtMgr.formatNumber(this.getFileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FileId field from a formatted string
   *
   * @param _value the FileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FileId field
   */
   public void setFileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFileId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdFromFormattedString");
   }

  /** get the value of the field: FileId (CDR_DATA.file_id)
   * @return Integer the value
   */
  public Integer getFileId () {
    return this.FileId;
  }
  /** Change the field to not being actively set: FileId (CDR_DATA.file_id)
   */
  public void unsetFileId () {
    this._FileIdSet = false;
  }
  /** See if the field is actively set: FileId (CDR_DATA.file_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFileId () {
    return this._FileIdSet;
  }
  /** set the fields value: FileIdServ (CDR_DATA.file_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FileIdServ") 
  public void setFileIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FileIdServ", "setFileIdServ");
    }
    this.FileIdServ = value;
    this._FileIdServSet = true;
  }

  /** Retrieves the FileIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FileIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileIdServ field
   */
   public String getFileIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getFileIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the FileIdServ field from a formatted string
   *
   * @param _value the FileIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FileIdServ field
   */
   public void setFileIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFileIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdServFromFormattedString");
   }

  /** get the value of the field: FileIdServ (CDR_DATA.file_id_serv)
   * @return Integer the value
   */
  public Integer getFileIdServ () {
    return this.FileIdServ;
  }
  /** Change the field to not being actively set: FileIdServ (CDR_DATA.file_id_serv)
   */
  public void unsetFileIdServ () {
    this._FileIdServSet = false;
  }
  /** See if the field is actively set: FileIdServ (CDR_DATA.file_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetFileIdServ () {
    return this._FileIdServSet;
  }
  /** set the fields value: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RevRcvCostCtr") 
  public void setRevRcvCostCtr (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RevRcvCostCtr", "setRevRcvCostCtr");
    }
    this.RevRcvCostCtr = value;
    this._RevRcvCostCtrSet = true;
  }

  /** Retrieves the RevRcvCostCtr field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RevRcvCostCtr field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RevRcvCostCtr field
   */
   public String getRevRcvCostCtrAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrAsFormattedString");
       return fmtMgr.formatNumber(this.getRevRcvCostCtr(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrAsFormattedString");
       throw x;
     }
   }
  /** Sets the RevRcvCostCtr field from a formatted string
   *
   * @param _value the RevRcvCostCtr field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RevRcvCostCtr field
   */
   public void setRevRcvCostCtrFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRevRcvCostCtr(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RevRcvCostCtr");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRevRcvCostCtrFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRevRcvCostCtrFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated RevRcvCostCtr field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RevRcvCostCtr field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RevRcvCostCtr field
   */

  public String getRevRcvCostCtrDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRevRcvCostCtrEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getRevRcvCostCtr()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated RevRcvCostCtr field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the RevRcvCostCtr field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RevRcvCostCtr field
   */
  public Enumeration getRevRcvCostCtrEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRevRcvCostCtrEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("RevRcvCostCenter", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRevRcvCostCtrEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRevRcvCostCtrEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated RevRcvCostCtr field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setRevRcvCostCtrFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRevRcvCostCtrFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getRevRcvCostCtrEnumeration(_locale);
      this.setRevRcvCostCtr((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RevRcvCostCtr");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRevRcvCostCtrFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRevRcvCostCtrFromDisplayValue");
  }

  /** get the value of the field: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * @return Integer the value
   */
  public Integer getRevRcvCostCtr () {
    return this.RevRcvCostCtr;
  }
  /** Change the field to not being actively set: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   */
  public void unsetRevRcvCostCtr () {
    this._RevRcvCostCtrSet = false;
  }
  /** See if the field is actively set: RevRcvCostCtr (CDR_DATA.rev_rcv_cost_ctr)
   * @return boolean whether the field is actively set
   */
  public boolean issetRevRcvCostCtr () {
    return this._RevRcvCostCtrSet;
  }
  /** set the fields value: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CorridorPlanId") 
  public void setCorridorPlanId (Integer value) throws ServiceException
  {
    this.CorridorPlanId = value;
    this._CorridorPlanIdSet = true;
  }

  /** Retrieves the CorridorPlanId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CorridorPlanId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CorridorPlanId field
   */
   public String getCorridorPlanIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdAsFormattedString");
       return fmtMgr.formatNumber(this.getCorridorPlanId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CorridorPlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the CorridorPlanId field from a formatted string
   *
   * @param _value the CorridorPlanId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CorridorPlanId field
   */
   public void setCorridorPlanIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCorridorPlanId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CorridorPlanId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCorridorPlanIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated CorridorPlanId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CorridorPlanId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CorridorPlanId field
   */

  public String getCorridorPlanIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCorridorPlanIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCorridorPlanId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CorridorPlanId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CorridorPlanId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CorridorPlanId field
   */
  public Enumeration getCorridorPlanIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCorridorPlanIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("CorridorPlan", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCorridorPlanIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCorridorPlanIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CorridorPlanId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCorridorPlanIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorPlanIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCorridorPlanIdEnumeration(_locale);
      this.setCorridorPlanId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CorridorPlanId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCorridorPlanIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCorridorPlanIdFromDisplayValue");
  }

  /** get the value of the field: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * @return Integer the value
   */
  public Integer getCorridorPlanId () {
    return this.CorridorPlanId;
  }
  /** Change the field to not being actively set: CorridorPlanId (CDR_DATA.corridor_plan_id)
   */
  public void unsetCorridorPlanId () {
    this._CorridorPlanIdSet = false;
  }
  /** See if the field is actively set: CorridorPlanId (CDR_DATA.corridor_plan_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetCorridorPlanId () {
    return this._CorridorPlanIdSet;
  }
  /** set the fields value: CellIdOrigin (CDR_DATA.cell_id_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CellIdOrigin") 
  public void setCellIdOrigin (Integer value) throws ServiceException
  {
    this.CellIdOrigin = value;
    this._CellIdOriginSet = true;
  }

  /** Retrieves the CellIdOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CellIdOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CellIdOrigin field
   */
   public String getCellIdOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCellIdOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCellIdOriginAsFormattedString");
       return fmtMgr.formatNumber(this.getCellIdOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CellIdOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCellIdOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the CellIdOrigin field from a formatted string
   *
   * @param _value the CellIdOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CellIdOrigin field
   */
   public void setCellIdOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCellIdOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCellIdOrigin(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CellIdOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCellIdOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCellIdOriginFromFormattedString");
   }

  /** get the value of the field: CellIdOrigin (CDR_DATA.cell_id_origin)
   * @return Integer the value
   */
  public Integer getCellIdOrigin () {
    return this.CellIdOrigin;
  }
  /** Change the field to not being actively set: CellIdOrigin (CDR_DATA.cell_id_origin)
   */
  public void unsetCellIdOrigin () {
    this._CellIdOriginSet = false;
  }
  /** See if the field is actively set: CellIdOrigin (CDR_DATA.cell_id_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetCellIdOrigin () {
    return this._CellIdOriginSet;
  }
  /** set the fields value: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigTypeIdUsg") 
  public void setOrigTypeIdUsg (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrigTypeIdUsg", "setOrigTypeIdUsg");
    }
    this.OrigTypeIdUsg = value;
    this._OrigTypeIdUsgSet = true;
  }

  /** Retrieves the OrigTypeIdUsg field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigTypeIdUsg field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTypeIdUsg field
   */
   public String getOrigTypeIdUsgAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTypeIdUsgAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTypeIdUsgAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigTypeIdUsg(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTypeIdUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTypeIdUsgAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigTypeIdUsg field from a formatted string
   *
   * @param _value the OrigTypeIdUsg field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTypeIdUsg field
   */
   public void setOrigTypeIdUsgFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTypeIdUsgFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigTypeIdUsg(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTypeIdUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTypeIdUsgFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTypeIdUsgFromFormattedString");
   }

  /** get the value of the field: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * @return Integer the value
   */
  public Integer getOrigTypeIdUsg () {
    return this.OrigTypeIdUsg;
  }
  /** Change the field to not being actively set: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   */
  public void unsetOrigTypeIdUsg () {
    this._OrigTypeIdUsgSet = false;
  }
  /** See if the field is actively set: OrigTypeIdUsg (CDR_DATA.orig_type_id_usg)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTypeIdUsg () {
    return this._OrigTypeIdUsgSet;
  }
  /** set the fields value: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccessRegionOrigin") 
  public void setAccessRegionOrigin (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccessRegionOrigin", "setAccessRegionOrigin");
    }
    this.AccessRegionOrigin = value;
    this._AccessRegionOriginSet = true;
  }

  /** Retrieves the AccessRegionOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccessRegionOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccessRegionOrigin field
   */
   public String getAccessRegionOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionOriginAsFormattedString");
       return fmtMgr.formatString(this.getAccessRegionOrigin());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccessRegionOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccessRegionOrigin field from a formatted string
   *
   * @param _value the AccessRegionOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccessRegionOrigin field
   */
   public void setAccessRegionOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccessRegionOrigin(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccessRegionOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionOriginFromFormattedString");
   }

  /** get the value of the field: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @return String the value
   */
  public String getAccessRegionOrigin () {
    return this.AccessRegionOrigin;
  }
  /** Change the field to not being actively set: AccessRegionOrigin (CDR_DATA.access_region_origin)
   */
  public void unsetAccessRegionOrigin () {
    this._AccessRegionOriginSet = false;
  }
  /** See if the field is actively set: AccessRegionOrigin (CDR_DATA.access_region_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccessRegionOrigin () {
    return this._AccessRegionOriginSet;
  }
  /** set the fields value: AccessRegionTarget (CDR_DATA.access_region_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccessRegionTarget") 
  public void setAccessRegionTarget (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccessRegionTarget", "setAccessRegionTarget");
    }
    this.AccessRegionTarget = value;
    this._AccessRegionTargetSet = true;
  }

  /** Retrieves the AccessRegionTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccessRegionTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccessRegionTarget field
   */
   public String getAccessRegionTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccessRegionTargetAsFormattedString");
       return fmtMgr.formatString(this.getAccessRegionTarget());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccessRegionTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccessRegionTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccessRegionTarget field from a formatted string
   *
   * @param _value the AccessRegionTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccessRegionTarget field
   */
   public void setAccessRegionTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccessRegionTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccessRegionTarget(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccessRegionTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccessRegionTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccessRegionTargetFromFormattedString");
   }

  /** get the value of the field: AccessRegionTarget (CDR_DATA.access_region_target)
   * @return String the value
   */
  public String getAccessRegionTarget () {
    return this.AccessRegionTarget;
  }
  /** Change the field to not being actively set: AccessRegionTarget (CDR_DATA.access_region_target)
   */
  public void unsetAccessRegionTarget () {
    this._AccessRegionTargetSet = false;
  }
  /** See if the field is actively set: AccessRegionTarget (CDR_DATA.access_region_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccessRegionTarget () {
    return this._AccessRegionTargetSet;
  }
  /** set the fields value: OpenItemId (CDR_DATA.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OpenItemId", "setOpenItemId");
    }
    this.OpenItemId = value;
    this._OpenItemIdSet = true;
  }

  /** Retrieves the OpenItemId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OpenItemId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemId field
   */
   public String getOpenItemIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOpenItemId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OpenItemId field from a formatted string
   *
   * @param _value the OpenItemId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OpenItemId field
   */
   public void setOpenItemIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOpenItemId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated OpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the OpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemId field
   */

  public String getOpenItemIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOpenItemIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getOpenItemId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated OpenItemId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the OpenItemId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the OpenItemId field
   */
  public Enumeration getOpenItemIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("OpenItem", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated OpenItemId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setOpenItemIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getOpenItemIdEnumeration(_locale);
      this.setOpenItemId((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFromDisplayValue");
  }

  /** get the value of the field: OpenItemId (CDR_DATA.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (CDR_DATA.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (CDR_DATA.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: RatedAmountReduction (CDR_DATA.amount_reduction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatedAmountReduction") 
  public void setRatedAmountReduction (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatedAmountReduction", "setRatedAmountReduction");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RatedAmountReduction", "setRatedAmountReduction");
    }
    this.RatedAmountReduction = value;
    this._RatedAmountReductionSet = true;
  }

  /** Retrieves the RatedAmountReduction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatedAmountReduction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedAmountReduction field
   */
   public String getRatedAmountReductionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountReductionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedAmountReductionAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRatedAmountReduction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatedAmountReduction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedAmountReductionAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatedAmountReduction field from a formatted string
   *
   * @param _value the RatedAmountReduction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatedAmountReduction field
   */
   public void setRatedAmountReductionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountReductionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatedAmountReduction(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatedAmountReduction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedAmountReductionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedAmountReductionFromFormattedString");
   }

  /**
   * Retrieves the RatedAmountReduction field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatedAmountReduction field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedAmountReduction field
   */
  public String getRatedAmountReductionAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountReductionAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedAmountReductionAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getRatedAmountReduction(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmountReduction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedAmountReductionAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the RatedAmountReduction field value from a formatted currency string
   *
   * @param _value the RatedAmountReduction field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatedAmountReduction field
   */
  public void setRatedAmountReductionFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatedAmountReductionFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRatedAmountReduction(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmountReduction");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedAmountReductionFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedAmountReductionFromFormattedCurrencyString");
  }

  /** get the value of the field: RatedAmountReduction (CDR_DATA.amount_reduction)
   * @return BigInteger the value
   */
  public BigInteger getRatedAmountReduction () {
    return this.RatedAmountReduction;
  }
  /** Change the field to not being actively set: RatedAmountReduction (CDR_DATA.amount_reduction)
   */
  public void unsetRatedAmountReduction () {
    this._RatedAmountReductionSet = false;
  }
  /** See if the field is actively set: RatedAmountReduction (CDR_DATA.amount_reduction)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatedAmountReduction () {
    return this._RatedAmountReductionSet;
  }
  /** set the fields value: AmountReductionId (CDR_DATA.amount_reduction_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AmountReductionId") 
  public void setAmountReductionId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AmountReductionId", "setAmountReductionId");
    }
    this.AmountReductionId = value;
    this._AmountReductionIdSet = true;
  }

  /** Retrieves the AmountReductionId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AmountReductionId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AmountReductionId field
   */
   public String getAmountReductionIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountReductionIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAmountReductionId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountReductionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountReductionIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AmountReductionId field from a formatted string
   *
   * @param _value the AmountReductionId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AmountReductionId field
   */
   public void setAmountReductionIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountReductionIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmountReductionId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AmountReductionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountReductionIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountReductionIdFromFormattedString");
   }

  /** get the value of the field: AmountReductionId (CDR_DATA.amount_reduction_id)
   * @return Integer the value
   */
  public Integer getAmountReductionId () {
    return this.AmountReductionId;
  }
  /** Change the field to not being actively set: AmountReductionId (CDR_DATA.amount_reduction_id)
   */
  public void unsetAmountReductionId () {
    this._AmountReductionIdSet = false;
  }
  /** See if the field is actively set: AmountReductionId (CDR_DATA.amount_reduction_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmountReductionId () {
    return this._AmountReductionIdSet;
  }
  /** set the fields value: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SeqnumRateUsage") 
  public void setSeqnumRateUsage (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SeqnumRateUsage", "setSeqnumRateUsage");
    }
    this.SeqnumRateUsage = value;
    this._SeqnumRateUsageSet = true;
  }

  /** Retrieves the SeqnumRateUsage field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SeqnumRateUsage field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SeqnumRateUsage field
   */
   public String getSeqnumRateUsageAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumRateUsageAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSeqnumRateUsageAsFormattedString");
       return fmtMgr.formatNumber(this.getSeqnumRateUsage(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SeqnumRateUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSeqnumRateUsageAsFormattedString");
       throw x;
     }
   }
  /** Sets the SeqnumRateUsage field from a formatted string
   *
   * @param _value the SeqnumRateUsage field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SeqnumRateUsage field
   */
   public void setSeqnumRateUsageFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumRateUsageFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSeqnumRateUsage(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SeqnumRateUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSeqnumRateUsageFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSeqnumRateUsageFromFormattedString");
   }

  /** get the value of the field: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * @return Integer the value
   */
  public Integer getSeqnumRateUsage () {
    return this.SeqnumRateUsage;
  }
  /** Change the field to not being actively set: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   */
  public void unsetSeqnumRateUsage () {
    this._SeqnumRateUsageSet = false;
  }
  /** See if the field is actively set: SeqnumRateUsage (CDR_DATA.seqnum_rate_usage)
   * @return boolean whether the field is actively set
   */
  public boolean issetSeqnumRateUsage () {
    return this._SeqnumRateUsageSet;
  }
  /** set the fields value: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SeqnumRateUsageOverrides") 
  public void setSeqnumRateUsageOverrides (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SeqnumRateUsageOverrides", "setSeqnumRateUsageOverrides");
    }
    this.SeqnumRateUsageOverrides = value;
    this._SeqnumRateUsageOverridesSet = true;
  }

  /** Retrieves the SeqnumRateUsageOverrides field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SeqnumRateUsageOverrides field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SeqnumRateUsageOverrides field
   */
   public String getSeqnumRateUsageOverridesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumRateUsageOverridesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSeqnumRateUsageOverridesAsFormattedString");
       return fmtMgr.formatNumber(this.getSeqnumRateUsageOverrides(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SeqnumRateUsageOverrides");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSeqnumRateUsageOverridesAsFormattedString");
       throw x;
     }
   }
  /** Sets the SeqnumRateUsageOverrides field from a formatted string
   *
   * @param _value the SeqnumRateUsageOverrides field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SeqnumRateUsageOverrides field
   */
   public void setSeqnumRateUsageOverridesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSeqnumRateUsageOverridesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSeqnumRateUsageOverrides(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SeqnumRateUsageOverrides");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSeqnumRateUsageOverridesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSeqnumRateUsageOverridesFromFormattedString");
   }

  /** get the value of the field: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * @return Integer the value
   */
  public Integer getSeqnumRateUsageOverrides () {
    return this.SeqnumRateUsageOverrides;
  }
  /** Change the field to not being actively set: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   */
  public void unsetSeqnumRateUsageOverrides () {
    this._SeqnumRateUsageOverridesSet = false;
  }
  /** See if the field is actively set: SeqnumRateUsageOverrides (CDR_DATA.seqnum_rate_usage_overrides)
   * @return boolean whether the field is actively set
   */
  public boolean issetSeqnumRateUsageOverrides () {
    return this._SeqnumRateUsageOverridesSet;
  }
  /** set the fields value: RawUnits (CDR_DATA.raw_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RawUnits") 
  public void setRawUnits (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RawUnits", "setRawUnits");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RawUnits", "setRawUnits");
    }
    this.RawUnits = value;
    this._RawUnitsSet = true;
  }

  /** Retrieves the RawUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RawUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RawUnits field
   */
   public String getRawUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRawUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRawUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRawUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RawUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRawUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the RawUnits field from a formatted string
   *
   * @param _value the RawUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RawUnits field
   */
   public void setRawUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRawUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRawUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RawUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRawUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRawUnitsFromFormattedString");
   }

  /** get the value of the field: RawUnits (CDR_DATA.raw_units)
   * @return BigInteger the value
   */
  public BigInteger getRawUnits () {
    return this.RawUnits;
  }
  /** Change the field to not being actively set: RawUnits (CDR_DATA.raw_units)
   */
  public void unsetRawUnits () {
    this._RawUnitsSet = false;
  }
  /** See if the field is actively set: RawUnits (CDR_DATA.raw_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetRawUnits () {
    return this._RawUnitsSet;
  }
  /** set the fields value: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RawUnitsRounded") 
  public void setRawUnitsRounded (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RawUnitsRounded", "setRawUnitsRounded");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "RawUnitsRounded", "setRawUnitsRounded");
    }
    this.RawUnitsRounded = value;
    this._RawUnitsRoundedSet = true;
  }

  /** Retrieves the RawUnitsRounded field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RawUnitsRounded field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RawUnitsRounded field
   */
   public String getRawUnitsRoundedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRawUnitsRoundedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRawUnitsRoundedAsFormattedString");
       return fmtMgr.formatBigInteger(this.getRawUnitsRounded(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RawUnitsRounded");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRawUnitsRoundedAsFormattedString");
       throw x;
     }
   }
  /** Sets the RawUnitsRounded field from a formatted string
   *
   * @param _value the RawUnitsRounded field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RawUnitsRounded field
   */
   public void setRawUnitsRoundedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRawUnitsRoundedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRawUnitsRounded(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RawUnitsRounded");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRawUnitsRoundedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRawUnitsRoundedFromFormattedString");
   }

  /** get the value of the field: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * @return BigInteger the value
   */
  public BigInteger getRawUnitsRounded () {
    return this.RawUnitsRounded;
  }
  /** Change the field to not being actively set: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   */
  public void unsetRawUnitsRounded () {
    this._RawUnitsRoundedSet = false;
  }
  /** See if the field is actively set: RawUnitsRounded (CDR_DATA.raw_units_rounded)
   * @return boolean whether the field is actively set
   */
  public boolean issetRawUnitsRounded () {
    return this._RawUnitsRoundedSet;
  }
  /** set the fields value: AggrUsageId (CDR_DATA.aggr_usage_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AggrUsageId") 
  public void setAggrUsageId (Integer value) throws ServiceException
  {
    this.AggrUsageId = value;
    this._AggrUsageIdSet = true;
  }

  /** Retrieves the AggrUsageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AggrUsageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AggrUsageId field
   */
   public String getAggrUsageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAggrUsageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAggrUsageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAggrUsageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AggrUsageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAggrUsageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AggrUsageId field from a formatted string
   *
   * @param _value the AggrUsageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AggrUsageId field
   */
   public void setAggrUsageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAggrUsageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAggrUsageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AggrUsageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAggrUsageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAggrUsageIdFromFormattedString");
   }

  /** get the value of the field: AggrUsageId (CDR_DATA.aggr_usage_id)
   * @return Integer the value
   */
  public Integer getAggrUsageId () {
    return this.AggrUsageId;
  }
  /** Change the field to not being actively set: AggrUsageId (CDR_DATA.aggr_usage_id)
   */
  public void unsetAggrUsageId () {
    this._AggrUsageIdSet = false;
  }
  /** See if the field is actively set: AggrUsageId (CDR_DATA.aggr_usage_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAggrUsageId () {
    return this._AggrUsageIdSet;
  }
  /** set the fields value: ZoneClass (CDR_DATA.zone_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ZoneClass") 
  public void setZoneClass (Integer value) throws ServiceException
  {
    this.ZoneClass = value;
    this._ZoneClassSet = true;
  }

  /** Retrieves the ZoneClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ZoneClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ZoneClass field
   */
   public String getZoneClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZoneClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getZoneClassAsFormattedString");
       return fmtMgr.formatNumber(this.getZoneClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ZoneClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getZoneClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the ZoneClass field from a formatted string
   *
   * @param _value the ZoneClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ZoneClass field
   */
   public void setZoneClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getZoneClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setZoneClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ZoneClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setZoneClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setZoneClassFromFormattedString");
   }

  /** get the value of the field: ZoneClass (CDR_DATA.zone_class)
   * @return Integer the value
   */
  public Integer getZoneClass () {
    return this.ZoneClass;
  }
  /** Change the field to not being actively set: ZoneClass (CDR_DATA.zone_class)
   */
  public void unsetZoneClass () {
    this._ZoneClassSet = false;
  }
  /** See if the field is actively set: ZoneClass (CDR_DATA.zone_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetZoneClass () {
    return this._ZoneClassSet;
  }
  /** set the fields value: PointClassOrigin (CDR_DATA.point_class_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointClassOrigin") 
  public void setPointClassOrigin (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PointClassOrigin", "setPointClassOrigin");
    }
    this.PointClassOrigin = value;
    this._PointClassOriginSet = true;
  }

  /** Retrieves the PointClassOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointClassOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointClassOrigin field
   */
   public String getPointClassOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointClassOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointClassOriginAsFormattedString");
       return fmtMgr.formatNumber(this.getPointClassOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointClassOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointClassOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointClassOrigin field from a formatted string
   *
   * @param _value the PointClassOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointClassOrigin field
   */
   public void setPointClassOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointClassOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointClassOrigin(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointClassOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointClassOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointClassOriginFromFormattedString");
   }

  /** get the value of the field: PointClassOrigin (CDR_DATA.point_class_origin)
   * @return Integer the value
   */
  public Integer getPointClassOrigin () {
    return this.PointClassOrigin;
  }
  /** Change the field to not being actively set: PointClassOrigin (CDR_DATA.point_class_origin)
   */
  public void unsetPointClassOrigin () {
    this._PointClassOriginSet = false;
  }
  /** See if the field is actively set: PointClassOrigin (CDR_DATA.point_class_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointClassOrigin () {
    return this._PointClassOriginSet;
  }
  /** set the fields value: PointClassTarget (CDR_DATA.point_class_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointClassTarget") 
  public void setPointClassTarget (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PointClassTarget", "setPointClassTarget");
    }
    this.PointClassTarget = value;
    this._PointClassTargetSet = true;
  }

  /** Retrieves the PointClassTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointClassTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointClassTarget field
   */
   public String getPointClassTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointClassTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointClassTargetAsFormattedString");
       return fmtMgr.formatNumber(this.getPointClassTarget(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointClassTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointClassTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointClassTarget field from a formatted string
   *
   * @param _value the PointClassTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointClassTarget field
   */
   public void setPointClassTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointClassTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointClassTarget(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointClassTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointClassTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointClassTargetFromFormattedString");
   }

  /** get the value of the field: PointClassTarget (CDR_DATA.point_class_target)
   * @return Integer the value
   */
  public Integer getPointClassTarget () {
    return this.PointClassTarget;
  }
  /** Change the field to not being actively set: PointClassTarget (CDR_DATA.point_class_target)
   */
  public void unsetPointClassTarget () {
    this._PointClassTargetSet = false;
  }
  /** See if the field is actively set: PointClassTarget (CDR_DATA.point_class_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointClassTarget () {
    return this._PointClassTargetSet;
  }
  /** set the fields value: EquipClassCode (CDR_DATA.equip_class_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EquipClassCode") 
  public void setEquipClassCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EquipClassCode", "setEquipClassCode");
    }
    this.EquipClassCode = value;
    this._EquipClassCodeSet = true;
  }

  /** Retrieves the EquipClassCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EquipClassCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipClassCode field
   */
   public String getEquipClassCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipClassCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipClassCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getEquipClassCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EquipClassCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipClassCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the EquipClassCode field from a formatted string
   *
   * @param _value the EquipClassCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EquipClassCode field
   */
   public void setEquipClassCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipClassCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEquipClassCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EquipClassCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipClassCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipClassCodeFromFormattedString");
   }

  /** get the value of the field: EquipClassCode (CDR_DATA.equip_class_code)
   * @return Integer the value
   */
  public Integer getEquipClassCode () {
    return this.EquipClassCode;
  }
  /** Change the field to not being actively set: EquipClassCode (CDR_DATA.equip_class_code)
   */
  public void unsetEquipClassCode () {
    this._EquipClassCodeSet = false;
  }
  /** See if the field is actively set: EquipClassCode (CDR_DATA.equip_class_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetEquipClassCode () {
    return this._EquipClassCodeSet;
  }
  /** set the fields value: ComponentId (CDR_DATA.component_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ComponentId") 
  public void setComponentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ComponentId", "setComponentId");
    }
    this.ComponentId = value;
    this._ComponentIdSet = true;
  }

  /** Retrieves the ComponentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ComponentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ComponentId field
   */
   public String getComponentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getComponentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ComponentId field from a formatted string
   *
   * @param _value the ComponentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ComponentId field
   */
   public void setComponentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setComponentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFromFormattedString");
   }

  /** get the value of the field: ComponentId (CDR_DATA.component_id)
   * @return Integer the value
   */
  public Integer getComponentId () {
    return this.ComponentId;
  }
  /** Change the field to not being actively set: ComponentId (CDR_DATA.component_id)
   */
  public void unsetComponentId () {
    this._ComponentIdSet = false;
  }
  /** See if the field is actively set: ComponentId (CDR_DATA.component_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetComponentId () {
    return this._ComponentIdSet;
  }
  /** set the fields value: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxPkgCount") 
  public void setTaxPkgCount (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxPkgCount", "setTaxPkgCount");
    }
    this.TaxPkgCount = value;
    this._TaxPkgCountSet = true;
  }

  /** Retrieves the TaxPkgCount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxPkgCount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxPkgCount field
   */
   public String getTaxPkgCountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgCountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxPkgCountAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxPkgCount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxPkgCountAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxPkgCount field from a formatted string
   *
   * @param _value the TaxPkgCount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxPkgCount field
   */
   public void setTaxPkgCountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxPkgCountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxPkgCount(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxPkgCount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxPkgCountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxPkgCountFromFormattedString");
   }

  /** get the value of the field: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * @return Integer the value
   */
  public Integer getTaxPkgCount () {
    return this.TaxPkgCount;
  }
  /** Change the field to not being actively set: TaxPkgCount (CDR_DATA.tax_pkg_count)
   */
  public void unsetTaxPkgCount () {
    this._TaxPkgCountSet = false;
  }
  /** See if the field is actively set: TaxPkgCount (CDR_DATA.tax_pkg_count)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxPkgCount () {
    return this._TaxPkgCountSet;
  }
  /** set the fields value: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AddImpliedDecimal") 
  public void setAddImpliedDecimal (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AddImpliedDecimal", "setAddImpliedDecimal");
    }
    this.AddImpliedDecimal = value;
    this._AddImpliedDecimalSet = true;
  }

  /** Retrieves the AddImpliedDecimal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AddImpliedDecimal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AddImpliedDecimal field
   */
   public String getAddImpliedDecimalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddImpliedDecimalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAddImpliedDecimalAsFormattedString");
       return fmtMgr.formatNumber(this.getAddImpliedDecimal(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddImpliedDecimal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAddImpliedDecimalAsFormattedString");
       throw x;
     }
   }
  /** Sets the AddImpliedDecimal field from a formatted string
   *
   * @param _value the AddImpliedDecimal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AddImpliedDecimal field
   */
   public void setAddImpliedDecimalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAddImpliedDecimalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAddImpliedDecimal(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AddImpliedDecimal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAddImpliedDecimalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAddImpliedDecimalFromFormattedString");
   }

  /** get the value of the field: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * @return Integer the value
   */
  public Integer getAddImpliedDecimal () {
    return this.AddImpliedDecimal;
  }
  /** Change the field to not being actively set: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   */
  public void unsetAddImpliedDecimal () {
    this._AddImpliedDecimalSet = false;
  }
  /** See if the field is actively set: AddImpliedDecimal (CDR_DATA.add_implied_decimal)
   * @return boolean whether the field is actively set
   */
  public boolean issetAddImpliedDecimal () {
    return this._AddImpliedDecimalSet;
  }
  /** set the fields value: ReratedDt (CDR_DATA.rerated_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ReratedDt") 
  public void setReratedDt (Date value) throws ServiceException
  {
    this.ReratedDt = value;
    this._ReratedDtSet = true;
  }

  /** Retrieves the ReratedDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ReratedDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReratedDt field
   */
   public String getReratedDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReratedDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReratedDtAsFormattedString");
       return fmtMgr.formatDate(this.getReratedDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReratedDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getReratedDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ReratedDt field from a formatted string
   *
   * @param _value the ReratedDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReratedDt field
   */
   public void setReratedDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReratedDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setReratedDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReratedDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setReratedDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReratedDtFromFormattedString");
   }

  /**
   * Retrieves the ReratedDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReratedDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReratedDt field
   */
  public String getReratedDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReratedDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReratedDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getReratedDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReratedDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReratedDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ReratedDt field value from a formatted date/time string
   *
   * @param _value the ReratedDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReratedDt field
   */
  public void setReratedDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReratedDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setReratedDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReratedDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReratedDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ReratedDt (CDR_DATA.rerated_dt)
   * @return Date the value
   */
  public Date getReratedDt () {
    return this.ReratedDt;
  }
  /** Change the field to not being actively set: ReratedDt (CDR_DATA.rerated_dt)
   */
  public void unsetReratedDt () {
    this._ReratedDtSet = false;
  }
  /** See if the field is actively set: ReratedDt (CDR_DATA.rerated_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetReratedDt () {
    return this._ReratedDtSet;
  }
  /** set the fields value: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalInvoiceId") 
  public void setExternalInvoiceId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExternalInvoiceId", "setExternalInvoiceId");
    }
    this.ExternalInvoiceId = value;
    this._ExternalInvoiceIdSet = true;
  }

  /** Retrieves the ExternalInvoiceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalInvoiceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalInvoiceId field
   */
   public String getExternalInvoiceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalInvoiceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalInvoiceIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getExternalInvoiceId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalInvoiceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalInvoiceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalInvoiceId field from a formatted string
   *
   * @param _value the ExternalInvoiceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalInvoiceId field
   */
   public void setExternalInvoiceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalInvoiceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalInvoiceId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalInvoiceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalInvoiceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalInvoiceIdFromFormattedString");
   }

  /** get the value of the field: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * @return BigInteger the value
   */
  public BigInteger getExternalInvoiceId () {
    return this.ExternalInvoiceId;
  }
  /** Change the field to not being actively set: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   */
  public void unsetExternalInvoiceId () {
    this._ExternalInvoiceIdSet = false;
  }
  /** See if the field is actively set: ExternalInvoiceId (CDR_DATA.external_invoice_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalInvoiceId () {
    return this._ExternalInvoiceIdSet;
  }
  /** set the fields value: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InvoiceRecordSeq") 
  public void setInvoiceRecordSeq (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "InvoiceRecordSeq", "setInvoiceRecordSeq");
    }
    this.InvoiceRecordSeq = value;
    this._InvoiceRecordSeqSet = true;
  }

  /** Retrieves the InvoiceRecordSeq field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InvoiceRecordSeq field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InvoiceRecordSeq field
   */
   public String getInvoiceRecordSeqAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceRecordSeqAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInvoiceRecordSeqAsFormattedString");
       return fmtMgr.formatBigInteger(this.getInvoiceRecordSeq(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InvoiceRecordSeq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInvoiceRecordSeqAsFormattedString");
       throw x;
     }
   }
  /** Sets the InvoiceRecordSeq field from a formatted string
   *
   * @param _value the InvoiceRecordSeq field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InvoiceRecordSeq field
   */
   public void setInvoiceRecordSeqFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInvoiceRecordSeqFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInvoiceRecordSeq(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InvoiceRecordSeq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInvoiceRecordSeqFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInvoiceRecordSeqFromFormattedString");
   }

  /** get the value of the field: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * @return BigInteger the value
   */
  public BigInteger getInvoiceRecordSeq () {
    return this.InvoiceRecordSeq;
  }
  /** Change the field to not being actively set: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   */
  public void unsetInvoiceRecordSeq () {
    this._InvoiceRecordSeqSet = false;
  }
  /** See if the field is actively set: InvoiceRecordSeq (CDR_DATA.invoice_record_seq)
   * @return boolean whether the field is actively set
   */
  public boolean issetInvoiceRecordSeq () {
    return this._InvoiceRecordSeqSet;
  }
  /** set the fields value: LobId (CDR_DATA.lob_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LobId") 
  public void setLobId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LobId", "setLobId");
    }
    this.LobId = value;
    this._LobIdSet = true;
  }

  /** Retrieves the LobId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LobId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LobId field
   */
   public String getLobIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLobIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getLobId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LobId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLobIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the LobId field from a formatted string
   *
   * @param _value the LobId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LobId field
   */
   public void setLobIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLobIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLobId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LobId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLobIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLobIdFromFormattedString");
   }

  /** get the value of the field: LobId (CDR_DATA.lob_id)
   * @return BigInteger the value
   */
  public BigInteger getLobId () {
    return this.LobId;
  }
  /** Change the field to not being actively set: LobId (CDR_DATA.lob_id)
   */
  public void unsetLobId () {
    this._LobIdSet = false;
  }
  /** See if the field is actively set: LobId (CDR_DATA.lob_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetLobId () {
    return this._LobIdSet;
  }
  /** set the fields value: TransactionId (CDR_DATA.transaction_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransactionId") 
  public void setTransactionId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TransactionId", "setTransactionId");
    }
    this.TransactionId = value;
    this._TransactionIdSet = true;
  }

  /** Retrieves the TransactionId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransactionId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransactionId field
   */
   public String getTransactionIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactionIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransactionIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTransactionId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransactionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransactionIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransactionId field from a formatted string
   *
   * @param _value the TransactionId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransactionId field
   */
   public void setTransactionIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransactionIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransactionId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransactionId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransactionIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransactionIdFromFormattedString");
   }

  /** get the value of the field: TransactionId (CDR_DATA.transaction_id)
   * @return BigInteger the value
   */
  public BigInteger getTransactionId () {
    return this.TransactionId;
  }
  /** Change the field to not being actively set: TransactionId (CDR_DATA.transaction_id)
   */
  public void unsetTransactionId () {
    this._TransactionIdSet = false;
  }
  /** See if the field is actively set: TransactionId (CDR_DATA.transaction_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransactionId () {
    return this._TransactionIdSet;
  }
  /** set the fields value: GuideTo (USAGE_TYPES.guide_to)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GuideTo") 
  public void setGuideTo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GuideTo", "setGuideTo");
    }
    this.GuideTo = value;
    this._GuideToSet = true;
  }

  /** Retrieves the GuideTo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GuideTo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GuideTo field
   */
   public String getGuideToAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuideToAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGuideToAsFormattedString");
       return fmtMgr.formatNumber(this.getGuideTo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GuideTo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGuideToAsFormattedString");
       throw x;
     }
   }
  /** Sets the GuideTo field from a formatted string
   *
   * @param _value the GuideTo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GuideTo field
   */
   public void setGuideToFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuideToFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGuideTo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GuideTo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGuideToFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGuideToFromFormattedString");
   }

  /** get the value of the field: GuideTo (USAGE_TYPES.guide_to)
   * @return Integer the value
   */
  public Integer getGuideTo () {
    return this.GuideTo;
  }
  /** Change the field to not being actively set: GuideTo (USAGE_TYPES.guide_to)
   */
  public void unsetGuideTo () {
    this._GuideToSet = false;
  }
  /** See if the field is actively set: GuideTo (USAGE_TYPES.guide_to)
   * @return boolean whether the field is actively set
   */
  public boolean issetGuideTo () {
    return this._GuideToSet;
  }
  /** set the fields value: PointCategory (USAGE_TYPES.point_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PointCategory") 
  public void setPointCategory (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PointCategory", "setPointCategory");
    }
    this.PointCategory = value;
    this._PointCategorySet = true;
  }

  /** Retrieves the PointCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PointCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PointCategory field
   */
   public String getPointCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPointCategoryAsFormattedString");
       return fmtMgr.formatNumber(this.getPointCategory(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPointCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the PointCategory field from a formatted string
   *
   * @param _value the PointCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PointCategory field
   */
   public void setPointCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPointCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPointCategory(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PointCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPointCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPointCategoryFromFormattedString");
   }

  /** get the value of the field: PointCategory (USAGE_TYPES.point_category)
   * @return Integer the value
   */
  public Integer getPointCategory () {
    return this.PointCategory;
  }
  /** Change the field to not being actively set: PointCategory (USAGE_TYPES.point_category)
   */
  public void unsetPointCategory () {
    this._PointCategorySet = false;
  }
  /** See if the field is actively set: PointCategory (USAGE_TYPES.point_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetPointCategory () {
    return this._PointCategorySet;
  }
  /** set the fields value: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OriginCountryDialCodeReq") 
  public void setOriginCountryDialCodeReq (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OriginCountryDialCodeReq", "setOriginCountryDialCodeReq");
    }
    this.OriginCountryDialCodeReq = value;
    this._OriginCountryDialCodeReqSet = true;
  }

  /** Retrieves the OriginCountryDialCodeReq field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OriginCountryDialCodeReq field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OriginCountryDialCodeReq field
   */
   public String getOriginCountryDialCodeReqAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginCountryDialCodeReqAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOriginCountryDialCodeReqAsFormattedString");
       return fmtMgr.formatNumber(this.getOriginCountryDialCodeReq(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginCountryDialCodeReq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOriginCountryDialCodeReqAsFormattedString");
       throw x;
     }
   }
  /** Sets the OriginCountryDialCodeReq field from a formatted string
   *
   * @param _value the OriginCountryDialCodeReq field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OriginCountryDialCodeReq field
   */
   public void setOriginCountryDialCodeReqFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOriginCountryDialCodeReqFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOriginCountryDialCodeReq(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OriginCountryDialCodeReq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOriginCountryDialCodeReqFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOriginCountryDialCodeReqFromFormattedString");
   }

  /** get the value of the field: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * @return Integer the value
   */
  public Integer getOriginCountryDialCodeReq () {
    return this.OriginCountryDialCodeReq;
  }
  /** Change the field to not being actively set: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   */
  public void unsetOriginCountryDialCodeReq () {
    this._OriginCountryDialCodeReqSet = false;
  }
  /** See if the field is actively set: OriginCountryDialCodeReq (USAGE_TYPES.origin_country_dial_code_req)
   * @return boolean whether the field is actively set
   */
  public boolean issetOriginCountryDialCodeReq () {
    return this._OriginCountryDialCodeReqSet;
  }
  /** set the fields value: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxCodeOriginReq") 
  public void setTaxCodeOriginReq (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxCodeOriginReq", "setTaxCodeOriginReq");
    }
    this.TaxCodeOriginReq = value;
    this._TaxCodeOriginReqSet = true;
  }

  /** Retrieves the TaxCodeOriginReq field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxCodeOriginReq field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxCodeOriginReq field
   */
   public String getTaxCodeOriginReqAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxCodeOriginReqAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxCodeOriginReqAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxCodeOriginReq(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxCodeOriginReq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxCodeOriginReqAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxCodeOriginReq field from a formatted string
   *
   * @param _value the TaxCodeOriginReq field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxCodeOriginReq field
   */
   public void setTaxCodeOriginReqFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxCodeOriginReqFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxCodeOriginReq(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxCodeOriginReq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxCodeOriginReqFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxCodeOriginReqFromFormattedString");
   }

  /** get the value of the field: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * @return Integer the value
   */
  public Integer getTaxCodeOriginReq () {
    return this.TaxCodeOriginReq;
  }
  /** Change the field to not being actively set: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   */
  public void unsetTaxCodeOriginReq () {
    this._TaxCodeOriginReqSet = false;
  }
  /** See if the field is actively set: TaxCodeOriginReq (USAGE_TYPES.tax_code_origin_req)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxCodeOriginReq () {
    return this._TaxCodeOriginReqSet;
  }
  /** set the fields value: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxCodeTargetReq") 
  public void setTaxCodeTargetReq (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxCodeTargetReq", "setTaxCodeTargetReq");
    }
    this.TaxCodeTargetReq = value;
    this._TaxCodeTargetReqSet = true;
  }

  /** Retrieves the TaxCodeTargetReq field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxCodeTargetReq field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxCodeTargetReq field
   */
   public String getTaxCodeTargetReqAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxCodeTargetReqAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxCodeTargetReqAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxCodeTargetReq(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxCodeTargetReq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxCodeTargetReqAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxCodeTargetReq field from a formatted string
   *
   * @param _value the TaxCodeTargetReq field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxCodeTargetReq field
   */
   public void setTaxCodeTargetReqFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxCodeTargetReqFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxCodeTargetReq(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxCodeTargetReq");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxCodeTargetReqFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxCodeTargetReqFromFormattedString");
   }

  /** get the value of the field: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * @return Integer the value
   */
  public Integer getTaxCodeTargetReq () {
    return this.TaxCodeTargetReq;
  }
  /** Change the field to not being actively set: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   */
  public void unsetTaxCodeTargetReq () {
    this._TaxCodeTargetReqSet = false;
  }
  /** See if the field is actively set: TaxCodeTargetReq (USAGE_TYPES.tax_code_target_req)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxCodeTargetReq () {
    return this._TaxCodeTargetReqSet;
  }
  /** set the fields value: DescriptionCode (USAGE_TYPES.description_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DescriptionCode") 
  public void setDescriptionCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DescriptionCode", "setDescriptionCode");
    }
    this.DescriptionCode = value;
    this._DescriptionCodeSet = true;
  }

  /** Retrieves the DescriptionCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DescriptionCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionCode field
   */
   public String getDescriptionCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getDescriptionCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the DescriptionCode field from a formatted string
   *
   * @param _value the DescriptionCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DescriptionCode field
   */
   public void setDescriptionCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescriptionCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionCodeFromFormattedString");
   }

  /** get the value of the field: DescriptionCode (USAGE_TYPES.description_code)
   * @return Integer the value
   */
  public Integer getDescriptionCode () {
    return this.DescriptionCode;
  }
  /** Change the field to not being actively set: DescriptionCode (USAGE_TYPES.description_code)
   */
  public void unsetDescriptionCode () {
    this._DescriptionCodeSet = false;
  }
  /** See if the field is actively set: DescriptionCode (USAGE_TYPES.description_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionCode () {
    return this._DescriptionCodeSet;
  }
  /** set the fields value: TaxClass (USAGE_TYPES.tax_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxClass") 
  public void setTaxClass (Integer value) throws ServiceException
  {
    this.TaxClass = value;
    this._TaxClassSet = true;
  }

  /** Retrieves the TaxClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxClass field
   */
   public String getTaxClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxClassAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxClass field from a formatted string
   *
   * @param _value the TaxClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxClass field
   */
   public void setTaxClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxClassFromFormattedString");
   }

  /** get the value of the field: TaxClass (USAGE_TYPES.tax_class)
   * @return Integer the value
   */
  public Integer getTaxClass () {
    return this.TaxClass;
  }
  /** Change the field to not being actively set: TaxClass (USAGE_TYPES.tax_class)
   */
  public void unsetTaxClass () {
    this._TaxClassSet = false;
  }
  /** See if the field is actively set: TaxClass (USAGE_TYPES.tax_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxClass () {
    return this._TaxClassSet;
  }
  /** set the fields value: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxLocationUsg") 
  public void setTaxLocationUsg (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TaxLocationUsg", "setTaxLocationUsg");
    }
    this.TaxLocationUsg = value;
    this._TaxLocationUsgSet = true;
  }

  /** Retrieves the TaxLocationUsg field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxLocationUsg field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxLocationUsg field
   */
   public String getTaxLocationUsgAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxLocationUsgAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxLocationUsgAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxLocationUsg(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxLocationUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxLocationUsgAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxLocationUsg field from a formatted string
   *
   * @param _value the TaxLocationUsg field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxLocationUsg field
   */
   public void setTaxLocationUsgFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxLocationUsgFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxLocationUsg(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxLocationUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxLocationUsgFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxLocationUsgFromFormattedString");
   }

  /** get the value of the field: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * @return Integer the value
   */
  public Integer getTaxLocationUsg () {
    return this.TaxLocationUsg;
  }
  /** Change the field to not being actively set: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   */
  public void unsetTaxLocationUsg () {
    this._TaxLocationUsgSet = false;
  }
  /** See if the field is actively set: TaxLocationUsg (USAGE_TYPES.tax_location_usg)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxLocationUsg () {
    return this._TaxLocationUsgSet;
  }
  /** set the fields value: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TaxLocationOutcollect") 
  public void setTaxLocationOutcollect (Integer value) throws ServiceException
  {
    this.TaxLocationOutcollect = value;
    this._TaxLocationOutcollectSet = true;
  }

  /** Retrieves the TaxLocationOutcollect field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TaxLocationOutcollect field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxLocationOutcollect field
   */
   public String getTaxLocationOutcollectAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxLocationOutcollectAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxLocationOutcollectAsFormattedString");
       return fmtMgr.formatNumber(this.getTaxLocationOutcollect(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxLocationOutcollect");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxLocationOutcollectAsFormattedString");
       throw x;
     }
   }
  /** Sets the TaxLocationOutcollect field from a formatted string
   *
   * @param _value the TaxLocationOutcollect field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TaxLocationOutcollect field
   */
   public void setTaxLocationOutcollectFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxLocationOutcollectFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTaxLocationOutcollect(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TaxLocationOutcollect");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxLocationOutcollectFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxLocationOutcollectFromFormattedString");
   }

  /** get the value of the field: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * @return Integer the value
   */
  public Integer getTaxLocationOutcollect () {
    return this.TaxLocationOutcollect;
  }
  /** Change the field to not being actively set: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   */
  public void unsetTaxLocationOutcollect () {
    this._TaxLocationOutcollectSet = false;
  }
  /** See if the field is actively set: TaxLocationOutcollect (USAGE_TYPES.tax_location_outcollect)
   * @return boolean whether the field is actively set
   */
  public boolean issetTaxLocationOutcollect () {
    return this._TaxLocationOutcollectSet;
  }
  /** set the fields value: UsgClass (USAGE_TYPES.usg_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsgClass") 
  public void setUsgClass (Integer value) throws ServiceException
  {
    this.UsgClass = value;
    this._UsgClassSet = true;
  }

  /** Retrieves the UsgClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsgClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsgClass field
   */
   public String getUsgClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsgClassAsFormattedString");
       return fmtMgr.formatNumber(this.getUsgClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsgClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsgClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsgClass field from a formatted string
   *
   * @param _value the UsgClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsgClass field
   */
   public void setUsgClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsgClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsgClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsgClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsgClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsgClassFromFormattedString");
   }

  /** get the value of the field: UsgClass (USAGE_TYPES.usg_class)
   * @return Integer the value
   */
  public Integer getUsgClass () {
    return this.UsgClass;
  }
  /** Change the field to not being actively set: UsgClass (USAGE_TYPES.usg_class)
   */
  public void unsetUsgClass () {
    this._UsgClassSet = false;
  }
  /** See if the field is actively set: UsgClass (USAGE_TYPES.usg_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsgClass () {
    return this._UsgClassSet;
  }
  /** set the fields value: FreeUsg (USAGE_TYPES.free_usg)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FreeUsg") 
  public void setFreeUsg (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FreeUsg", "setFreeUsg");
    }
    this.FreeUsg = value;
    this._FreeUsgSet = true;
  }

  /** Retrieves the FreeUsg field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FreeUsg field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FreeUsg field
   */
   public String getFreeUsgAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFreeUsgAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFreeUsgAsFormattedString");
       return fmtMgr.formatBoolean(this.getFreeUsg());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FreeUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFreeUsgAsFormattedString");
       throw x;
     }
   }
  /** Sets the FreeUsg field from a formatted string
   *
   * @param _value the FreeUsg field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FreeUsg field
   */
   public void setFreeUsgFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFreeUsgFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFreeUsg(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FreeUsg");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFreeUsgFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFreeUsgFromFormattedString");
   }

  /** get the value of the field: FreeUsg (USAGE_TYPES.free_usg)
   * @return Boolean the value
   */
  public Boolean getFreeUsg () {
    return this.FreeUsg;
  }
  /** Change the field to not being actively set: FreeUsg (USAGE_TYPES.free_usg)
   */
  public void unsetFreeUsg () {
    this._FreeUsgSet = false;
  }
  /** See if the field is actively set: FreeUsg (USAGE_TYPES.free_usg)
   * @return boolean whether the field is actively set
   */
  public boolean issetFreeUsg () {
    return this._FreeUsgSet;
  }
  /** set the fields value: ProductLineId (USAGE_TYPES.product_line_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProductLineId") 
  public void setProductLineId (Integer value) throws ServiceException
  {
    this.ProductLineId = value;
    this._ProductLineIdSet = true;
  }

  /** Retrieves the ProductLineId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProductLineId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProductLineId field
   */
   public String getProductLineIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProductLineIdAsFormattedString");
       return fmtMgr.formatNumber(this.getProductLineId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProductLineId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProductLineIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProductLineId field from a formatted string
   *
   * @param _value the ProductLineId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProductLineId field
   */
   public void setProductLineIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProductLineId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProductLineId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProductLineIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProductLineIdFromFormattedString");
   }

  /** get the value of the field: ProductLineId (USAGE_TYPES.product_line_id)
   * @return Integer the value
   */
  public Integer getProductLineId () {
    return this.ProductLineId;
  }
  /** Change the field to not being actively set: ProductLineId (USAGE_TYPES.product_line_id)
   */
  public void unsetProductLineId () {
    this._ProductLineIdSet = false;
  }
  /** See if the field is actively set: ProductLineId (USAGE_TYPES.product_line_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProductLineId () {
    return this._ProductLineIdSet;
  }
  /** set the fields value: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillAggrLevel") 
  public void setBillAggrLevel (Integer value) throws ServiceException
  {
    this.BillAggrLevel = value;
    this._BillAggrLevelSet = true;
  }

  /** Retrieves the BillAggrLevel field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillAggrLevel field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillAggrLevel field
   */
   public String getBillAggrLevelAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAggrLevelAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillAggrLevelAsFormattedString");
       return fmtMgr.formatNumber(this.getBillAggrLevel(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAggrLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillAggrLevelAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillAggrLevel field from a formatted string
   *
   * @param _value the BillAggrLevel field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillAggrLevel field
   */
   public void setBillAggrLevelFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillAggrLevelFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillAggrLevel(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillAggrLevel");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillAggrLevelFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillAggrLevelFromFormattedString");
   }

  /** get the value of the field: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * @return Integer the value
   */
  public Integer getBillAggrLevel () {
    return this.BillAggrLevel;
  }
  /** Change the field to not being actively set: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   */
  public void unsetBillAggrLevel () {
    this._BillAggrLevelSet = false;
  }
  /** See if the field is actively set: BillAggrLevel (USAGE_TYPES.bill_aggr_level)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillAggrLevel () {
    return this._BillAggrLevelSet;
  }
  /** set the fields value: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DeriveJurisdiction") 
  public void setDeriveJurisdiction (Integer value) throws ServiceException
  {
    this.DeriveJurisdiction = value;
    this._DeriveJurisdictionSet = true;
  }

  /** Retrieves the DeriveJurisdiction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DeriveJurisdiction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DeriveJurisdiction field
   */
   public String getDeriveJurisdictionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeriveJurisdictionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDeriveJurisdictionAsFormattedString");
       return fmtMgr.formatNumber(this.getDeriveJurisdiction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DeriveJurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDeriveJurisdictionAsFormattedString");
       throw x;
     }
   }
  /** Sets the DeriveJurisdiction field from a formatted string
   *
   * @param _value the DeriveJurisdiction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DeriveJurisdiction field
   */
   public void setDeriveJurisdictionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeriveJurisdictionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDeriveJurisdiction(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DeriveJurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDeriveJurisdictionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDeriveJurisdictionFromFormattedString");
   }

  /** get the value of the field: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * @return Integer the value
   */
  public Integer getDeriveJurisdiction () {
    return this.DeriveJurisdiction;
  }
  /** Change the field to not being actively set: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   */
  public void unsetDeriveJurisdiction () {
    this._DeriveJurisdictionSet = false;
  }
  /** See if the field is actively set: DeriveJurisdiction (USAGE_TYPES.derive_jurisdiction)
   * @return boolean whether the field is actively set
   */
  public boolean issetDeriveJurisdiction () {
    return this._DeriveJurisdictionSet;
  }
  /** set the fields value: UnitsIndicator (USAGE_TYPES.units_indicator)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UnitsIndicator") 
  public void setUnitsIndicator (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UnitsIndicator", "setUnitsIndicator");
    }
    this.UnitsIndicator = value;
    this._UnitsIndicatorSet = true;
  }

  /** Retrieves the UnitsIndicator field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UnitsIndicator field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsIndicator field
   */
   public String getUnitsIndicatorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsIndicatorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsIndicatorAsFormattedString");
       return fmtMgr.formatNumber(this.getUnitsIndicator(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsIndicatorAsFormattedString");
       throw x;
     }
   }
  /** Sets the UnitsIndicator field from a formatted string
   *
   * @param _value the UnitsIndicator field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UnitsIndicator field
   */
   public void setUnitsIndicatorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsIndicatorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUnitsIndicator(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UnitsIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsIndicatorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsIndicatorFromFormattedString");
   }

  /** get the value of the field: UnitsIndicator (USAGE_TYPES.units_indicator)
   * @return Integer the value
   */
  public Integer getUnitsIndicator () {
    return this.UnitsIndicator;
  }
  /** Change the field to not being actively set: UnitsIndicator (USAGE_TYPES.units_indicator)
   */
  public void unsetUnitsIndicator () {
    this._UnitsIndicatorSet = false;
  }
  /** See if the field is actively set: UnitsIndicator (USAGE_TYPES.units_indicator)
   * @return boolean whether the field is actively set
   */
  public boolean issetUnitsIndicator () {
    return this._UnitsIndicatorSet;
  }
  /** set the fields value: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatableUnitClass") 
  public void setRatableUnitClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatableUnitClass", "setRatableUnitClass");
    }
    this.RatableUnitClass = value;
    this._RatableUnitClassSet = true;
  }

  /** Retrieves the RatableUnitClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatableUnitClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatableUnitClass field
   */
   public String getRatableUnitClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatableUnitClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatableUnitClassAsFormattedString");
       return fmtMgr.formatNumber(this.getRatableUnitClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatableUnitClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatableUnitClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatableUnitClass field from a formatted string
   *
   * @param _value the RatableUnitClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatableUnitClass field
   */
   public void setRatableUnitClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatableUnitClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatableUnitClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatableUnitClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatableUnitClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatableUnitClassFromFormattedString");
   }

  /** get the value of the field: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * @return Integer the value
   */
  public Integer getRatableUnitClass () {
    return this.RatableUnitClass;
  }
  /** Change the field to not being actively set: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   */
  public void unsetRatableUnitClass () {
    this._RatableUnitClassSet = false;
  }
  /** See if the field is actively set: RatableUnitClass (USAGE_TYPES.ratable_unit_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatableUnitClass () {
    return this._RatableUnitClassSet;
  }
  /** set the fields value: DurationFlag (USAGE_TYPES.duration_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DurationFlag") 
  public void setDurationFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DurationFlag", "setDurationFlag");
    }
    this.DurationFlag = value;
    this._DurationFlagSet = true;
  }

  /** Retrieves the DurationFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DurationFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DurationFlag field
   */
   public String getDurationFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDurationFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getDurationFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DurationFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDurationFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the DurationFlag field from a formatted string
   *
   * @param _value the DurationFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DurationFlag field
   */
   public void setDurationFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDurationFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DurationFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDurationFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDurationFlagFromFormattedString");
   }

  /** get the value of the field: DurationFlag (USAGE_TYPES.duration_flag)
   * @return Boolean the value
   */
  public Boolean getDurationFlag () {
    return this.DurationFlag;
  }
  /** Change the field to not being actively set: DurationFlag (USAGE_TYPES.duration_flag)
   */
  public void unsetDurationFlag () {
    this._DurationFlagSet = false;
  }
  /** See if the field is actively set: DurationFlag (USAGE_TYPES.duration_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetDurationFlag () {
    return this._DurationFlagSet;
  }
  /** set the fields value: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DeriveDistanceUnits") 
  public void setDeriveDistanceUnits (Integer value) throws ServiceException
  {
    this.DeriveDistanceUnits = value;
    this._DeriveDistanceUnitsSet = true;
  }

  /** Retrieves the DeriveDistanceUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DeriveDistanceUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DeriveDistanceUnits field
   */
   public String getDeriveDistanceUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeriveDistanceUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDeriveDistanceUnitsAsFormattedString");
       return fmtMgr.formatNumber(this.getDeriveDistanceUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DeriveDistanceUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDeriveDistanceUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the DeriveDistanceUnits field from a formatted string
   *
   * @param _value the DeriveDistanceUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DeriveDistanceUnits field
   */
   public void setDeriveDistanceUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDeriveDistanceUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDeriveDistanceUnits(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DeriveDistanceUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDeriveDistanceUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDeriveDistanceUnitsFromFormattedString");
   }

  /** get the value of the field: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * @return Integer the value
   */
  public Integer getDeriveDistanceUnits () {
    return this.DeriveDistanceUnits;
  }
  /** Change the field to not being actively set: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   */
  public void unsetDeriveDistanceUnits () {
    this._DeriveDistanceUnitsSet = false;
  }
  /** See if the field is actively set: DeriveDistanceUnits (USAGE_TYPES.derive_distance_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetDeriveDistanceUnits () {
    return this._DeriveDistanceUnitsSet;
  }
  /** set the fields value: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("VhMinorThreshold") 
  public void setVhMinorThreshold (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "VhMinorThreshold", "setVhMinorThreshold");
    }
    this.VhMinorThreshold = value;
    this._VhMinorThresholdSet = true;
  }

  /** Retrieves the VhMinorThreshold field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The VhMinorThreshold field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the VhMinorThreshold field
   */
   public String getVhMinorThresholdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVhMinorThresholdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getVhMinorThresholdAsFormattedString");
       return fmtMgr.formatNumber(this.getVhMinorThreshold(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VhMinorThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getVhMinorThresholdAsFormattedString");
       throw x;
     }
   }
  /** Sets the VhMinorThreshold field from a formatted string
   *
   * @param _value the VhMinorThreshold field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the VhMinorThreshold field
   */
   public void setVhMinorThresholdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getVhMinorThresholdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setVhMinorThreshold(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("VhMinorThreshold");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setVhMinorThresholdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setVhMinorThresholdFromFormattedString");
   }

  /** get the value of the field: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * @return Integer the value
   */
  public Integer getVhMinorThreshold () {
    return this.VhMinorThreshold;
  }
  /** Change the field to not being actively set: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   */
  public void unsetVhMinorThreshold () {
    this._VhMinorThresholdSet = false;
  }
  /** See if the field is actively set: VhMinorThreshold (USAGE_TYPES.vh_minor_threshold)
   * @return boolean whether the field is actively set
   */
  public boolean issetVhMinorThreshold () {
    return this._VhMinorThresholdSet;
  }
  /** set the fields value: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DistanceUnitsIndicator") 
  public void setDistanceUnitsIndicator (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DistanceUnitsIndicator", "setDistanceUnitsIndicator");
    }
    this.DistanceUnitsIndicator = value;
    this._DistanceUnitsIndicatorSet = true;
  }

  /** Retrieves the DistanceUnitsIndicator field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DistanceUnitsIndicator field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistanceUnitsIndicator field
   */
   public String getDistanceUnitsIndicatorAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistanceUnitsIndicatorAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistanceUnitsIndicatorAsFormattedString");
       return fmtMgr.formatNumber(this.getDistanceUnitsIndicator(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistanceUnitsIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistanceUnitsIndicatorAsFormattedString");
       throw x;
     }
   }
  /** Sets the DistanceUnitsIndicator field from a formatted string
   *
   * @param _value the DistanceUnitsIndicator field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DistanceUnitsIndicator field
   */
   public void setDistanceUnitsIndicatorFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistanceUnitsIndicatorFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDistanceUnitsIndicator(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DistanceUnitsIndicator");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistanceUnitsIndicatorFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistanceUnitsIndicatorFromFormattedString");
   }

  /** get the value of the field: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * @return Integer the value
   */
  public Integer getDistanceUnitsIndicator () {
    return this.DistanceUnitsIndicator;
  }
  /** Change the field to not being actively set: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   */
  public void unsetDistanceUnitsIndicator () {
    this._DistanceUnitsIndicatorSet = false;
  }
  /** See if the field is actively set: DistanceUnitsIndicator (USAGE_TYPES.distance_units_indicator)
   * @return boolean whether the field is actively set
   */
  public boolean issetDistanceUnitsIndicator () {
    return this._DistanceUnitsIndicatorSet;
  }
  /** set the fields value: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GuideToProvider") 
  public void setGuideToProvider (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "GuideToProvider", "setGuideToProvider");
    }
    this.GuideToProvider = value;
    this._GuideToProviderSet = true;
  }

  /** Retrieves the GuideToProvider field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GuideToProvider field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GuideToProvider field
   */
   public String getGuideToProviderAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuideToProviderAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGuideToProviderAsFormattedString");
       return fmtMgr.formatNumber(this.getGuideToProvider(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GuideToProvider");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGuideToProviderAsFormattedString");
       throw x;
     }
   }
  /** Sets the GuideToProvider field from a formatted string
   *
   * @param _value the GuideToProvider field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GuideToProvider field
   */
   public void setGuideToProviderFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGuideToProviderFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGuideToProvider(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GuideToProvider");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGuideToProviderFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGuideToProviderFromFormattedString");
   }

  /** get the value of the field: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * @return Integer the value
   */
  public Integer getGuideToProvider () {
    return this.GuideToProvider;
  }
  /** Change the field to not being actively set: GuideToProvider (USAGE_TYPES.guide_to_provider)
   */
  public void unsetGuideToProvider () {
    this._GuideToProviderSet = false;
  }
  /** See if the field is actively set: GuideToProvider (USAGE_TYPES.guide_to_provider)
   * @return boolean whether the field is actively set
   */
  public boolean issetGuideToProvider () {
    return this._GuideToProviderSet;
  }
  /** set the fields value: IsPrerated (USAGE_TYPES.is_prerated)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsPrerated") 
  public void setIsPrerated (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsPrerated", "setIsPrerated");
    }
    this.IsPrerated = value;
    this._IsPreratedSet = true;
  }

  /** Retrieves the IsPrerated field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsPrerated field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPrerated field
   */
   public String getIsPreratedAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPreratedAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPreratedAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsPrerated());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPrerated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPreratedAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsPrerated field from a formatted string
   *
   * @param _value the IsPrerated field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsPrerated field
   */
   public void setIsPreratedFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPreratedFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsPrerated(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsPrerated");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPreratedFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPreratedFromFormattedString");
   }

  /** get the value of the field: IsPrerated (USAGE_TYPES.is_prerated)
   * @return Boolean the value
   */
  public Boolean getIsPrerated () {
    return this.IsPrerated;
  }
  /** Change the field to not being actively set: IsPrerated (USAGE_TYPES.is_prerated)
   */
  public void unsetIsPrerated () {
    this._IsPreratedSet = false;
  }
  /** See if the field is actively set: IsPrerated (USAGE_TYPES.is_prerated)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsPrerated () {
    return this._IsPreratedSet;
  }
  /** set the fields value: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("KeepRunningTotal") 
  public void setKeepRunningTotal (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "KeepRunningTotal", "setKeepRunningTotal");
    }
    this.KeepRunningTotal = value;
    this._KeepRunningTotalSet = true;
  }

  /** Retrieves the KeepRunningTotal field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The KeepRunningTotal field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the KeepRunningTotal field
   */
   public String getKeepRunningTotalAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getKeepRunningTotalAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getKeepRunningTotalAsFormattedString");
       return fmtMgr.formatBoolean(this.getKeepRunningTotal());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("KeepRunningTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getKeepRunningTotalAsFormattedString");
       throw x;
     }
   }
  /** Sets the KeepRunningTotal field from a formatted string
   *
   * @param _value the KeepRunningTotal field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the KeepRunningTotal field
   */
   public void setKeepRunningTotalFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getKeepRunningTotalFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setKeepRunningTotal(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("KeepRunningTotal");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setKeepRunningTotalFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setKeepRunningTotalFromFormattedString");
   }

  /** get the value of the field: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * @return Boolean the value
   */
  public Boolean getKeepRunningTotal () {
    return this.KeepRunningTotal;
  }
  /** Change the field to not being actively set: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   */
  public void unsetKeepRunningTotal () {
    this._KeepRunningTotalSet = false;
  }
  /** See if the field is actively set: KeepRunningTotal (USAGE_TYPES.keep_running_total)
   * @return boolean whether the field is actively set
   */
  public boolean issetKeepRunningTotal () {
    return this._KeepRunningTotalSet;
  }
  /** set the fields value: RoundingMethod (USAGE_TYPES.rounding_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RoundingMethod") 
  public void setRoundingMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RoundingMethod", "setRoundingMethod");
    }
    this.RoundingMethod = value;
    this._RoundingMethodSet = true;
  }

  /** Retrieves the RoundingMethod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RoundingMethod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RoundingMethod field
   */
   public String getRoundingMethodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRoundingMethodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRoundingMethodAsFormattedString");
       return fmtMgr.formatNumber(this.getRoundingMethod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RoundingMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRoundingMethodAsFormattedString");
       throw x;
     }
   }
  /** Sets the RoundingMethod field from a formatted string
   *
   * @param _value the RoundingMethod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RoundingMethod field
   */
   public void setRoundingMethodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRoundingMethodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRoundingMethod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RoundingMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRoundingMethodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRoundingMethodFromFormattedString");
   }

  /** get the value of the field: RoundingMethod (USAGE_TYPES.rounding_method)
   * @return Integer the value
   */
  public Integer getRoundingMethod () {
    return this.RoundingMethod;
  }
  /** Change the field to not being actively set: RoundingMethod (USAGE_TYPES.rounding_method)
   */
  public void unsetRoundingMethod () {
    this._RoundingMethodSet = false;
  }
  /** See if the field is actively set: RoundingMethod (USAGE_TYPES.rounding_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetRoundingMethod () {
    return this._RoundingMethodSet;
  }
  /** set the fields value: RawUnitsType (USAGE_TYPES.raw_units_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RawUnitsType") 
  public void setRawUnitsType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RawUnitsType", "setRawUnitsType");
    }
    this.RawUnitsType = value;
    this._RawUnitsTypeSet = true;
  }

  /** Retrieves the RawUnitsType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RawUnitsType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RawUnitsType field
   */
   public String getRawUnitsTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRawUnitsTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRawUnitsTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getRawUnitsType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RawUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRawUnitsTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RawUnitsType field from a formatted string
   *
   * @param _value the RawUnitsType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RawUnitsType field
   */
   public void setRawUnitsTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRawUnitsTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRawUnitsType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RawUnitsType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRawUnitsTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRawUnitsTypeFromFormattedString");
   }

  /** get the value of the field: RawUnitsType (USAGE_TYPES.raw_units_type)
   * @return Integer the value
   */
  public Integer getRawUnitsType () {
    return this.RawUnitsType;
  }
  /** Change the field to not being actively set: RawUnitsType (USAGE_TYPES.raw_units_type)
   */
  public void unsetRawUnitsType () {
    this._RawUnitsTypeSet = false;
  }
  /** See if the field is actively set: RawUnitsType (USAGE_TYPES.raw_units_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetRawUnitsType () {
    return this._RawUnitsTypeSet;
  }
  /** set the fields value: UseRateClass (USAGE_TYPES.use_rate_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseRateClass") 
  public void setUseRateClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseRateClass", "setUseRateClass");
    }
    this.UseRateClass = value;
    this._UseRateClassSet = true;
  }

  /** Retrieves the UseRateClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseRateClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseRateClass field
   */
   public String getUseRateClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseRateClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseRateClassAsFormattedString");
       return fmtMgr.formatNumber(this.getUseRateClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseRateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseRateClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseRateClass field from a formatted string
   *
   * @param _value the UseRateClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseRateClass field
   */
   public void setUseRateClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseRateClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseRateClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseRateClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseRateClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseRateClassFromFormattedString");
   }

  /** get the value of the field: UseRateClass (USAGE_TYPES.use_rate_class)
   * @return Integer the value
   */
  public Integer getUseRateClass () {
    return this.UseRateClass;
  }
  /** Change the field to not being actively set: UseRateClass (USAGE_TYPES.use_rate_class)
   */
  public void unsetUseRateClass () {
    this._UseRateClassSet = false;
  }
  /** See if the field is actively set: UseRateClass (USAGE_TYPES.use_rate_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseRateClass () {
    return this._UseRateClassSet;
  }
  /** set the fields value: UseBillClass (USAGE_TYPES.use_bill_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseBillClass") 
  public void setUseBillClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseBillClass", "setUseBillClass");
    }
    this.UseBillClass = value;
    this._UseBillClassSet = true;
  }

  /** Retrieves the UseBillClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseBillClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseBillClass field
   */
   public String getUseBillClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseBillClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseBillClassAsFormattedString");
       return fmtMgr.formatNumber(this.getUseBillClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseBillClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseBillClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseBillClass field from a formatted string
   *
   * @param _value the UseBillClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseBillClass field
   */
   public void setUseBillClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseBillClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseBillClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseBillClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseBillClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseBillClassFromFormattedString");
   }

  /** get the value of the field: UseBillClass (USAGE_TYPES.use_bill_class)
   * @return Integer the value
   */
  public Integer getUseBillClass () {
    return this.UseBillClass;
  }
  /** Change the field to not being actively set: UseBillClass (USAGE_TYPES.use_bill_class)
   */
  public void unsetUseBillClass () {
    this._UseBillClassSet = false;
  }
  /** See if the field is actively set: UseBillClass (USAGE_TYPES.use_bill_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseBillClass () {
    return this._UseBillClassSet;
  }
  /** set the fields value: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseJurisdiction") 
  public void setUseJurisdiction (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseJurisdiction", "setUseJurisdiction");
    }
    this.UseJurisdiction = value;
    this._UseJurisdictionSet = true;
  }

  /** Retrieves the UseJurisdiction field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseJurisdiction field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseJurisdiction field
   */
   public String getUseJurisdictionAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseJurisdictionAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseJurisdictionAsFormattedString");
       return fmtMgr.formatNumber(this.getUseJurisdiction(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseJurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseJurisdictionAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseJurisdiction field from a formatted string
   *
   * @param _value the UseJurisdiction field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseJurisdiction field
   */
   public void setUseJurisdictionFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseJurisdictionFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseJurisdiction(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseJurisdiction");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseJurisdictionFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseJurisdictionFromFormattedString");
   }

  /** get the value of the field: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * @return Integer the value
   */
  public Integer getUseJurisdiction () {
    return this.UseJurisdiction;
  }
  /** Change the field to not being actively set: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   */
  public void unsetUseJurisdiction () {
    this._UseJurisdictionSet = false;
  }
  /** See if the field is actively set: UseJurisdiction (USAGE_TYPES.use_jurisdiction)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseJurisdiction () {
    return this._UseJurisdictionSet;
  }
  /** set the fields value: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsePointClassOrigin") 
  public void setUsePointClassOrigin (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsePointClassOrigin", "setUsePointClassOrigin");
    }
    this.UsePointClassOrigin = value;
    this._UsePointClassOriginSet = true;
  }

  /** Retrieves the UsePointClassOrigin field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsePointClassOrigin field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsePointClassOrigin field
   */
   public String getUsePointClassOriginAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsePointClassOriginAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsePointClassOriginAsFormattedString");
       return fmtMgr.formatNumber(this.getUsePointClassOrigin(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsePointClassOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsePointClassOriginAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsePointClassOrigin field from a formatted string
   *
   * @param _value the UsePointClassOrigin field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsePointClassOrigin field
   */
   public void setUsePointClassOriginFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsePointClassOriginFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsePointClassOrigin(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsePointClassOrigin");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsePointClassOriginFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsePointClassOriginFromFormattedString");
   }

  /** get the value of the field: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * @return Integer the value
   */
  public Integer getUsePointClassOrigin () {
    return this.UsePointClassOrigin;
  }
  /** Change the field to not being actively set: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   */
  public void unsetUsePointClassOrigin () {
    this._UsePointClassOriginSet = false;
  }
  /** See if the field is actively set: UsePointClassOrigin (USAGE_TYPES.use_point_class_origin)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsePointClassOrigin () {
    return this._UsePointClassOriginSet;
  }
  /** set the fields value: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UsePointClassTarget") 
  public void setUsePointClassTarget (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UsePointClassTarget", "setUsePointClassTarget");
    }
    this.UsePointClassTarget = value;
    this._UsePointClassTargetSet = true;
  }

  /** Retrieves the UsePointClassTarget field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UsePointClassTarget field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UsePointClassTarget field
   */
   public String getUsePointClassTargetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsePointClassTargetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUsePointClassTargetAsFormattedString");
       return fmtMgr.formatNumber(this.getUsePointClassTarget(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsePointClassTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUsePointClassTargetAsFormattedString");
       throw x;
     }
   }
  /** Sets the UsePointClassTarget field from a formatted string
   *
   * @param _value the UsePointClassTarget field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UsePointClassTarget field
   */
   public void setUsePointClassTargetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUsePointClassTargetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUsePointClassTarget(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UsePointClassTarget");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUsePointClassTargetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUsePointClassTargetFromFormattedString");
   }

  /** get the value of the field: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * @return Integer the value
   */
  public Integer getUsePointClassTarget () {
    return this.UsePointClassTarget;
  }
  /** Change the field to not being actively set: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   */
  public void unsetUsePointClassTarget () {
    this._UsePointClassTargetSet = false;
  }
  /** See if the field is actively set: UsePointClassTarget (USAGE_TYPES.use_point_class_target)
   * @return boolean whether the field is actively set
   */
  public boolean issetUsePointClassTarget () {
    return this._UsePointClassTargetSet;
  }
  /** set the fields value: UseProviderClass (USAGE_TYPES.use_provider_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseProviderClass") 
  public void setUseProviderClass (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseProviderClass", "setUseProviderClass");
    }
    this.UseProviderClass = value;
    this._UseProviderClassSet = true;
  }

  /** Retrieves the UseProviderClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseProviderClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseProviderClass field
   */
   public String getUseProviderClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseProviderClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseProviderClassAsFormattedString");
       return fmtMgr.formatNumber(this.getUseProviderClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseProviderClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseProviderClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseProviderClass field from a formatted string
   *
   * @param _value the UseProviderClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseProviderClass field
   */
   public void setUseProviderClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseProviderClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseProviderClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseProviderClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseProviderClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseProviderClassFromFormattedString");
   }

  /** get the value of the field: UseProviderClass (USAGE_TYPES.use_provider_class)
   * @return Integer the value
   */
  public Integer getUseProviderClass () {
    return this.UseProviderClass;
  }
  /** Change the field to not being actively set: UseProviderClass (USAGE_TYPES.use_provider_class)
   */
  public void unsetUseProviderClass () {
    this._UseProviderClassSet = false;
  }
  /** See if the field is actively set: UseProviderClass (USAGE_TYPES.use_provider_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseProviderClass () {
    return this._UseProviderClassSet;
  }
  /** set the fields value: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseRatePeriod") 
  public void setUseRatePeriod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseRatePeriod", "setUseRatePeriod");
    }
    this.UseRatePeriod = value;
    this._UseRatePeriodSet = true;
  }

  /** Retrieves the UseRatePeriod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseRatePeriod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseRatePeriod field
   */
   public String getUseRatePeriodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseRatePeriodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseRatePeriodAsFormattedString");
       return fmtMgr.formatNumber(this.getUseRatePeriod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseRatePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseRatePeriodAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseRatePeriod field from a formatted string
   *
   * @param _value the UseRatePeriod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseRatePeriod field
   */
   public void setUseRatePeriodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseRatePeriodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseRatePeriod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseRatePeriod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseRatePeriodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseRatePeriodFromFormattedString");
   }

  /** get the value of the field: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * @return Integer the value
   */
  public Integer getUseRatePeriod () {
    return this.UseRatePeriod;
  }
  /** Change the field to not being actively set: UseRatePeriod (USAGE_TYPES.use_rate_period)
   */
  public void unsetUseRatePeriod () {
    this._UseRatePeriodSet = false;
  }
  /** See if the field is actively set: UseRatePeriod (USAGE_TYPES.use_rate_period)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseRatePeriod () {
    return this._UseRatePeriodSet;
  }
  /** set the fields value: UseElementId (USAGE_TYPES.use_element_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseElementId") 
  public void setUseElementId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseElementId", "setUseElementId");
    }
    this.UseElementId = value;
    this._UseElementIdSet = true;
  }

  /** Retrieves the UseElementId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseElementId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseElementId field
   */
   public String getUseElementIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseElementIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseElementIdAsFormattedString");
       return fmtMgr.formatNumber(this.getUseElementId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseElementIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseElementId field from a formatted string
   *
   * @param _value the UseElementId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseElementId field
   */
   public void setUseElementIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseElementIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseElementId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseElementId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseElementIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseElementIdFromFormattedString");
   }

  /** get the value of the field: UseElementId (USAGE_TYPES.use_element_id)
   * @return Integer the value
   */
  public Integer getUseElementId () {
    return this.UseElementId;
  }
  /** Change the field to not being actively set: UseElementId (USAGE_TYPES.use_element_id)
   */
  public void unsetUseElementId () {
    this._UseElementIdSet = false;
  }
  /** See if the field is actively set: UseElementId (USAGE_TYPES.use_element_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseElementId () {
    return this._UseElementIdSet;
  }
  /** set the fields value: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseEquipTypeCode") 
  public void setUseEquipTypeCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseEquipTypeCode", "setUseEquipTypeCode");
    }
    this.UseEquipTypeCode = value;
    this._UseEquipTypeCodeSet = true;
  }

  /** Retrieves the UseEquipTypeCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseEquipTypeCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseEquipTypeCode field
   */
   public String getUseEquipTypeCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseEquipTypeCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseEquipTypeCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getUseEquipTypeCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseEquipTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseEquipTypeCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseEquipTypeCode field from a formatted string
   *
   * @param _value the UseEquipTypeCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseEquipTypeCode field
   */
   public void setUseEquipTypeCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseEquipTypeCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseEquipTypeCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseEquipTypeCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseEquipTypeCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseEquipTypeCodeFromFormattedString");
   }

  /** get the value of the field: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * @return Integer the value
   */
  public Integer getUseEquipTypeCode () {
    return this.UseEquipTypeCode;
  }
  /** Change the field to not being actively set: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   */
  public void unsetUseEquipTypeCode () {
    this._UseEquipTypeCodeSet = false;
  }
  /** See if the field is actively set: UseEquipTypeCode (USAGE_TYPES.use_equip_type_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseEquipTypeCode () {
    return this._UseEquipTypeCodeSet;
  }
  /** set the fields value: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseEquipClassCode") 
  public void setUseEquipClassCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseEquipClassCode", "setUseEquipClassCode");
    }
    this.UseEquipClassCode = value;
    this._UseEquipClassCodeSet = true;
  }

  /** Retrieves the UseEquipClassCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseEquipClassCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseEquipClassCode field
   */
   public String getUseEquipClassCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseEquipClassCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseEquipClassCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getUseEquipClassCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseEquipClassCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseEquipClassCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseEquipClassCode field from a formatted string
   *
   * @param _value the UseEquipClassCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseEquipClassCode field
   */
   public void setUseEquipClassCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseEquipClassCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseEquipClassCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseEquipClassCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseEquipClassCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseEquipClassCodeFromFormattedString");
   }

  /** get the value of the field: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * @return Integer the value
   */
  public Integer getUseEquipClassCode () {
    return this.UseEquipClassCode;
  }
  /** Change the field to not being actively set: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   */
  public void unsetUseEquipClassCode () {
    this._UseEquipClassCodeSet = false;
  }
  /** See if the field is actively set: UseEquipClassCode (USAGE_TYPES.use_equip_class_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseEquipClassCode () {
    return this._UseEquipClassCodeSet;
  }
  /** set the fields value: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseClassOfServiceCode") 
  public void setUseClassOfServiceCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseClassOfServiceCode", "setUseClassOfServiceCode");
    }
    this.UseClassOfServiceCode = value;
    this._UseClassOfServiceCodeSet = true;
  }

  /** Retrieves the UseClassOfServiceCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseClassOfServiceCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseClassOfServiceCode field
   */
   public String getUseClassOfServiceCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseClassOfServiceCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseClassOfServiceCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getUseClassOfServiceCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseClassOfServiceCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseClassOfServiceCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseClassOfServiceCode field from a formatted string
   *
   * @param _value the UseClassOfServiceCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseClassOfServiceCode field
   */
   public void setUseClassOfServiceCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseClassOfServiceCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseClassOfServiceCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseClassOfServiceCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseClassOfServiceCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseClassOfServiceCodeFromFormattedString");
   }

  /** get the value of the field: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * @return Integer the value
   */
  public Integer getUseClassOfServiceCode () {
    return this.UseClassOfServiceCode;
  }
  /** Change the field to not being actively set: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   */
  public void unsetUseClassOfServiceCode () {
    this._UseClassOfServiceCodeSet = false;
  }
  /** See if the field is actively set: UseClassOfServiceCode (USAGE_TYPES.use_class_of_service_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseClassOfServiceCode () {
    return this._UseClassOfServiceCodeSet;
  }
  /** set the fields value: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseDistanceBandId") 
  public void setUseDistanceBandId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseDistanceBandId", "setUseDistanceBandId");
    }
    this.UseDistanceBandId = value;
    this._UseDistanceBandIdSet = true;
  }

  /** Retrieves the UseDistanceBandId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseDistanceBandId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseDistanceBandId field
   */
   public String getUseDistanceBandIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseDistanceBandIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseDistanceBandIdAsFormattedString");
       return fmtMgr.formatNumber(this.getUseDistanceBandId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseDistanceBandId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseDistanceBandIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseDistanceBandId field from a formatted string
   *
   * @param _value the UseDistanceBandId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseDistanceBandId field
   */
   public void setUseDistanceBandIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseDistanceBandIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseDistanceBandId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseDistanceBandId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseDistanceBandIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseDistanceBandIdFromFormattedString");
   }

  /** get the value of the field: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * @return Integer the value
   */
  public Integer getUseDistanceBandId () {
    return this.UseDistanceBandId;
  }
  /** Change the field to not being actively set: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   */
  public void unsetUseDistanceBandId () {
    this._UseDistanceBandIdSet = false;
  }
  /** See if the field is actively set: UseDistanceBandId (USAGE_TYPES.use_distance_band_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseDistanceBandId () {
    return this._UseDistanceBandIdSet;
  }
  /** set the fields value: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseDefaultRateType") 
  public void setUseDefaultRateType (Integer value) throws ServiceException
  {
    this.UseDefaultRateType = value;
    this._UseDefaultRateTypeSet = true;
  }

  /** Retrieves the UseDefaultRateType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseDefaultRateType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseDefaultRateType field
   */
   public String getUseDefaultRateTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseDefaultRateTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseDefaultRateTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getUseDefaultRateType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseDefaultRateType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseDefaultRateTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseDefaultRateType field from a formatted string
   *
   * @param _value the UseDefaultRateType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseDefaultRateType field
   */
   public void setUseDefaultRateTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseDefaultRateTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseDefaultRateType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseDefaultRateType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseDefaultRateTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseDefaultRateTypeFromFormattedString");
   }

  /** get the value of the field: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * @return Integer the value
   */
  public Integer getUseDefaultRateType () {
    return this.UseDefaultRateType;
  }
  /** Change the field to not being actively set: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   */
  public void unsetUseDefaultRateType () {
    this._UseDefaultRateTypeSet = false;
  }
  /** See if the field is actively set: UseDefaultRateType (USAGE_TYPES.use_default_rate_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseDefaultRateType () {
    return this._UseDefaultRateTypeSet;
  }
  /** set the fields value: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateCurrencyLocation") 
  public void setRateCurrencyLocation (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateCurrencyLocation", "setRateCurrencyLocation");
    }
    this.RateCurrencyLocation = value;
    this._RateCurrencyLocationSet = true;
  }

  /** Retrieves the RateCurrencyLocation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateCurrencyLocation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyLocation field
   */
   public String getRateCurrencyLocationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyLocationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyLocationAsFormattedString");
       return fmtMgr.formatNumber(this.getRateCurrencyLocation(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyLocation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyLocationAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateCurrencyLocation field from a formatted string
   *
   * @param _value the RateCurrencyLocation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateCurrencyLocation field
   */
   public void setRateCurrencyLocationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyLocationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateCurrencyLocation(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyLocation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyLocationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyLocationFromFormattedString");
   }

  /** get the value of the field: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * @return Integer the value
   */
  public Integer getRateCurrencyLocation () {
    return this.RateCurrencyLocation;
  }
  /** Change the field to not being actively set: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   */
  public void unsetRateCurrencyLocation () {
    this._RateCurrencyLocationSet = false;
  }
  /** See if the field is actively set: RateCurrencyLocation (USAGE_TYPES.rate_currency_location)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateCurrencyLocation () {
    return this._RateCurrencyLocationSet;
  }
  /** set the fields value: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatePeriodRounding") 
  public void setRatePeriodRounding (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatePeriodRounding", "setRatePeriodRounding");
    }
    this.RatePeriodRounding = value;
    this._RatePeriodRoundingSet = true;
  }

  /** Retrieves the RatePeriodRounding field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatePeriodRounding field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatePeriodRounding field
   */
   public String getRatePeriodRoundingAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodRoundingAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatePeriodRoundingAsFormattedString");
       return fmtMgr.formatNumber(this.getRatePeriodRounding(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePeriodRounding");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatePeriodRoundingAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatePeriodRounding field from a formatted string
   *
   * @param _value the RatePeriodRounding field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatePeriodRounding field
   */
   public void setRatePeriodRoundingFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatePeriodRoundingFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatePeriodRounding(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatePeriodRounding");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatePeriodRoundingFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatePeriodRoundingFromFormattedString");
   }

  /** get the value of the field: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * @return Integer the value
   */
  public Integer getRatePeriodRounding () {
    return this.RatePeriodRounding;
  }
  /** Change the field to not being actively set: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   */
  public void unsetRatePeriodRounding () {
    this._RatePeriodRoundingSet = false;
  }
  /** See if the field is actively set: RatePeriodRounding (USAGE_TYPES.rate_period_rounding)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatePeriodRounding () {
    return this._RatePeriodRoundingSet;
  }
  /** set the fields value: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateMinimumDuration") 
  public void setRateMinimumDuration (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateMinimumDuration", "setRateMinimumDuration");
    }
    this.RateMinimumDuration = value;
    this._RateMinimumDurationSet = true;
  }

  /** Retrieves the RateMinimumDuration field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateMinimumDuration field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateMinimumDuration field
   */
   public String getRateMinimumDurationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateMinimumDurationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateMinimumDurationAsFormattedString");
       return fmtMgr.formatNumber(this.getRateMinimumDuration(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateMinimumDuration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateMinimumDurationAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateMinimumDuration field from a formatted string
   *
   * @param _value the RateMinimumDuration field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateMinimumDuration field
   */
   public void setRateMinimumDurationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateMinimumDurationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateMinimumDuration(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateMinimumDuration");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateMinimumDurationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateMinimumDurationFromFormattedString");
   }

  /** get the value of the field: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * @return Integer the value
   */
  public Integer getRateMinimumDuration () {
    return this.RateMinimumDuration;
  }
  /** Change the field to not being actively set: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   */
  public void unsetRateMinimumDuration () {
    this._RateMinimumDurationSet = false;
  }
  /** See if the field is actively set: RateMinimumDuration (USAGE_TYPES.rate_minimum_duration)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateMinimumDuration () {
    return this._RateMinimumDurationSet;
  }
  /** set the fields value: UseComponentId (USAGE_TYPES.use_component_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseComponentId") 
  public void setUseComponentId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UseComponentId", "setUseComponentId");
    }
    this.UseComponentId = value;
    this._UseComponentIdSet = true;
  }

  /** Retrieves the UseComponentId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseComponentId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseComponentId field
   */
   public String getUseComponentIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseComponentIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseComponentIdAsFormattedString");
       return fmtMgr.formatNumber(this.getUseComponentId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseComponentIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseComponentId field from a formatted string
   *
   * @param _value the UseComponentId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseComponentId field
   */
   public void setUseComponentIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseComponentIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseComponentId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseComponentId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseComponentIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseComponentIdFromFormattedString");
   }

  /** get the value of the field: UseComponentId (USAGE_TYPES.use_component_id)
   * @return Integer the value
   */
  public Integer getUseComponentId () {
    return this.UseComponentId;
  }
  /** Change the field to not being actively set: UseComponentId (USAGE_TYPES.use_component_id)
   */
  public void unsetUseComponentId () {
    this._UseComponentIdSet = false;
  }
  /** See if the field is actively set: UseComponentId (USAGE_TYPES.use_component_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseComponentId () {
    return this._UseComponentIdSet;
  }
  /** set the fields value: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MinBillingUnits") 
  public void setMinBillingUnits (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MinBillingUnits", "setMinBillingUnits");
    }
    this.MinBillingUnits = value;
    this._MinBillingUnitsSet = true;
  }

  /** Retrieves the MinBillingUnits field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MinBillingUnits field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinBillingUnits field
   */
   public String getMinBillingUnitsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinBillingUnitsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinBillingUnitsAsFormattedString");
       return fmtMgr.formatBigInteger(this.getMinBillingUnits(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinBillingUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinBillingUnitsAsFormattedString");
       throw x;
     }
   }
  /** Sets the MinBillingUnits field from a formatted string
   *
   * @param _value the MinBillingUnits field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MinBillingUnits field
   */
   public void setMinBillingUnitsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinBillingUnitsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMinBillingUnits(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MinBillingUnits");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinBillingUnitsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinBillingUnitsFromFormattedString");
   }

  /** get the value of the field: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * @return BigInteger the value
   */
  public BigInteger getMinBillingUnits () {
    return this.MinBillingUnits;
  }
  /** Change the field to not being actively set: MinBillingUnits (USAGE_TYPES.min_billing_units)
   */
  public void unsetMinBillingUnits () {
    this._MinBillingUnitsSet = false;
  }
  /** See if the field is actively set: MinBillingUnits (USAGE_TYPES.min_billing_units)
   * @return boolean whether the field is actively set
   */
  public boolean issetMinBillingUnits () {
    return this._MinBillingUnitsSet;
  }
  /** set the fields value: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ConsolidateUsage") 
  public void setConsolidateUsage (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ConsolidateUsage", "setConsolidateUsage");
    }
    this.ConsolidateUsage = value;
    this._ConsolidateUsageSet = true;
  }

  /** Retrieves the ConsolidateUsage field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ConsolidateUsage field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ConsolidateUsage field
   */
   public String getConsolidateUsageAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConsolidateUsageAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getConsolidateUsageAsFormattedString");
       return fmtMgr.formatBoolean(this.getConsolidateUsage());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConsolidateUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getConsolidateUsageAsFormattedString");
       throw x;
     }
   }
  /** Sets the ConsolidateUsage field from a formatted string
   *
   * @param _value the ConsolidateUsage field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ConsolidateUsage field
   */
   public void setConsolidateUsageFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getConsolidateUsageFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setConsolidateUsage(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ConsolidateUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setConsolidateUsageFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setConsolidateUsageFromFormattedString");
   }

  /** get the value of the field: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * @return Boolean the value
   */
  public Boolean getConsolidateUsage () {
    return this.ConsolidateUsage;
  }
  /** Change the field to not being actively set: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   */
  public void unsetConsolidateUsage () {
    this._ConsolidateUsageSet = false;
  }
  /** See if the field is actively set: ConsolidateUsage (USAGE_TYPES.consolidate_usage)
   * @return boolean whether the field is actively set
   */
  public boolean issetConsolidateUsage () {
    return this._ConsolidateUsageSet;
  }
  /** set the fields value: NetworkDelay (USAGE_TYPES.network_delay)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NetworkDelay") 
  public void setNetworkDelay (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NetworkDelay", "setNetworkDelay");
    }
    this.NetworkDelay = value;
    this._NetworkDelaySet = true;
  }

  /** Retrieves the NetworkDelay field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NetworkDelay field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NetworkDelay field
   */
   public String getNetworkDelayAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetworkDelayAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNetworkDelayAsFormattedString");
       return fmtMgr.formatNumber(this.getNetworkDelay(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetworkDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNetworkDelayAsFormattedString");
       throw x;
     }
   }
  /** Sets the NetworkDelay field from a formatted string
   *
   * @param _value the NetworkDelay field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NetworkDelay field
   */
   public void setNetworkDelayFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNetworkDelayFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNetworkDelay(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NetworkDelay");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNetworkDelayFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNetworkDelayFromFormattedString");
   }

  /** get the value of the field: NetworkDelay (USAGE_TYPES.network_delay)
   * @return Integer the value
   */
  public Integer getNetworkDelay () {
    return this.NetworkDelay;
  }
  /** Change the field to not being actively set: NetworkDelay (USAGE_TYPES.network_delay)
   */
  public void unsetNetworkDelay () {
    this._NetworkDelaySet = false;
  }
  /** See if the field is actively set: NetworkDelay (USAGE_TYPES.network_delay)
   * @return boolean whether the field is actively set
   */
  public boolean issetNetworkDelay () {
    return this._NetworkDelaySet;
  }
  /** set the fields value: IsLateFeeExempt (USAGE_TYPES.is_late_fee_exempt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsLateFeeExempt") 
  public void setIsLateFeeExempt (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsLateFeeExempt", "setIsLateFeeExempt");
    }
    this.IsLateFeeExempt = value;
    this._IsLateFeeExemptSet = true;
  }

  /** Retrieves the IsLateFeeExempt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsLateFeeExempt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsLateFeeExempt field
   */
   public String getIsLateFeeExemptAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLateFeeExemptAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsLateFeeExemptAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsLateFeeExempt());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsLateFeeExempt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsLateFeeExemptAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsLateFeeExempt field from a formatted string
   *
   * @param _value the IsLateFeeExempt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsLateFeeExempt field
   */
   public void setIsLateFeeExemptFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsLateFeeExemptFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsLateFeeExempt(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsLateFeeExempt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsLateFeeExemptFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsLateFeeExemptFromFormattedString");
   }

  /** get the value of the field: IsLateFeeExempt (USAGE_TYPES.is_late_fee_exempt)
   * @return Boolean the value
   */
  public Boolean getIsLateFeeExempt () {
    return this.IsLateFeeExempt;
  }
  /** Change the field to not being actively set: IsLateFeeExempt (USAGE_TYPES.is_late_fee_exempt)
   */
  public void unsetIsLateFeeExempt () {
    this._IsLateFeeExemptSet = false;
  }
  /** See if the field is actively set: IsLateFeeExempt (USAGE_TYPES.is_late_fee_exempt)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsLateFeeExempt () {
    return this._IsLateFeeExemptSet;
  }
  /** set the fields value: RatingMethod (USAGE_TYPES.rating_method)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RatingMethod") 
  public void setRatingMethod (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RatingMethod", "setRatingMethod");
    }
    this.RatingMethod = value;
    this._RatingMethodSet = true;
  }

  /** Retrieves the RatingMethod field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RatingMethod field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatingMethod field
   */
   public String getRatingMethodAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatingMethodAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatingMethodAsFormattedString");
       return fmtMgr.formatNumber(this.getRatingMethod(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatingMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatingMethodAsFormattedString");
       throw x;
     }
   }
  /** Sets the RatingMethod field from a formatted string
   *
   * @param _value the RatingMethod field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RatingMethod field
   */
   public void setRatingMethodFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatingMethodFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRatingMethod(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RatingMethod");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatingMethodFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatingMethodFromFormattedString");
   }

  /** get the value of the field: RatingMethod (USAGE_TYPES.rating_method)
   * @return Integer the value
   */
  public Integer getRatingMethod () {
    return this.RatingMethod;
  }
  /** Change the field to not being actively set: RatingMethod (USAGE_TYPES.rating_method)
   */
  public void unsetRatingMethod () {
    this._RatingMethodSet = false;
  }
  /** See if the field is actively set: RatingMethod (USAGE_TYPES.rating_method)
   * @return boolean whether the field is actively set
   */
  public boolean issetRatingMethod () {
    return this._RatingMethodSet;
  }
  /** set the fields value: UseZoneClass (USAGE_TYPES.use_zone_class)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UseZoneClass") 
  public void setUseZoneClass (Integer value) throws ServiceException
  {
    this.UseZoneClass = value;
    this._UseZoneClassSet = true;
  }

  /** Retrieves the UseZoneClass field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UseZoneClass field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UseZoneClass field
   */
   public String getUseZoneClassAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseZoneClassAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUseZoneClassAsFormattedString");
       return fmtMgr.formatNumber(this.getUseZoneClass(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseZoneClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUseZoneClassAsFormattedString");
       throw x;
     }
   }
  /** Sets the UseZoneClass field from a formatted string
   *
   * @param _value the UseZoneClass field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UseZoneClass field
   */
   public void setUseZoneClassFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUseZoneClassFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUseZoneClass(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UseZoneClass");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUseZoneClassFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUseZoneClassFromFormattedString");
   }

  /** get the value of the field: UseZoneClass (USAGE_TYPES.use_zone_class)
   * @return Integer the value
   */
  public Integer getUseZoneClass () {
    return this.UseZoneClass;
  }
  /** Change the field to not being actively set: UseZoneClass (USAGE_TYPES.use_zone_class)
   */
  public void unsetUseZoneClass () {
    this._UseZoneClassSet = false;
  }
  /** See if the field is actively set: UseZoneClass (USAGE_TYPES.use_zone_class)
   * @return boolean whether the field is actively set
   */
  public boolean issetUseZoneClass () {
    return this._UseZoneClassSet;
  }
  /** set the fields value: DescriptionGroup (DESCRIPTIONS.description_group)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DescriptionGroup") 
  public void setDescriptionGroup (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DescriptionGroup", "setDescriptionGroup");
    }
    this.DescriptionGroup = value;
    this._DescriptionGroupSet = true;
  }

  /** Retrieves the DescriptionGroup field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DescriptionGroup field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionGroup field
   */
   public String getDescriptionGroupAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionGroupAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionGroupAsFormattedString");
       return fmtMgr.formatNumber(this.getDescriptionGroup(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionGroupAsFormattedString");
       throw x;
     }
   }
  /** Sets the DescriptionGroup field from a formatted string
   *
   * @param _value the DescriptionGroup field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DescriptionGroup field
   */
   public void setDescriptionGroupFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionGroupFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescriptionGroup(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionGroup");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionGroupFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionGroupFromFormattedString");
   }

  /** get the value of the field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return Integer the value
   */
  public Integer getDescriptionGroup () {
    return this.DescriptionGroup;
  }
  /** Change the field to not being actively set: DescriptionGroup (DESCRIPTIONS.description_group)
   */
  public void unsetDescriptionGroup () {
    this._DescriptionGroupSet = false;
  }
  /** See if the field is actively set: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionGroup () {
    return this._DescriptionGroupSet;
  }
  /** set the fields value: DescriptionText (DESCRIPTIONS.description_text)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DescriptionText") 
  public void setDescriptionText (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "DescriptionText", "setDescriptionText");
    }
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DescriptionText", "setDescriptionText");
    }
    this.DescriptionText = value;
    this._DescriptionTextSet = true;
  }

  /** Retrieves the DescriptionText field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DescriptionText field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionText field
   */
   public String getDescriptionTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionTextAsFormattedString");
       return fmtMgr.formatString(this.getDescriptionText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the DescriptionText field from a formatted string
   *
   * @param _value the DescriptionText field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DescriptionText field
   */
   public void setDescriptionTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDescriptionText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionTextFromFormattedString");
   }

  /** get the value of the field: DescriptionText (DESCRIPTIONS.description_text)
   * @return String the value
   */
  public String getDescriptionText () {
    return this.DescriptionText;
  }
  /** Change the field to not being actively set: DescriptionText (DESCRIPTIONS.description_text)
   */
  public void unsetDescriptionText () {
    this._DescriptionTextSet = false;
  }
  /** See if the field is actively set: DescriptionText (DESCRIPTIONS.description_text)
   * @return boolean whether the field is actively set
   */
  public boolean issetDescriptionText () {
    return this._DescriptionTextSet;
  }
  /** set the fields value: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ShortDescriptionText") 
  public void setShortDescriptionText (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ShortDescriptionText", "setShortDescriptionText");
    }
    this.ShortDescriptionText = value;
    this._ShortDescriptionTextSet = true;
  }

  /** Retrieves the ShortDescriptionText field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ShortDescriptionText field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDescriptionText field
   */
   public String getShortDescriptionTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDescriptionTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDescriptionTextAsFormattedString");
       return fmtMgr.formatString(this.getShortDescriptionText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDescriptionTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the ShortDescriptionText field from a formatted string
   *
   * @param _value the ShortDescriptionText field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ShortDescriptionText field
   */
   public void setShortDescriptionTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDescriptionTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setShortDescriptionText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ShortDescriptionText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDescriptionTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDescriptionTextFromFormattedString");
   }

  /** get the value of the field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return String the value
   */
  public String getShortDescriptionText () {
    return this.ShortDescriptionText;
  }
  /** Change the field to not being actively set: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   */
  public void unsetShortDescriptionText () {
    this._ShortDescriptionTextSet = false;
  }
  /** See if the field is actively set: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return boolean whether the field is actively set
   */
  public boolean issetShortDescriptionText () {
    return this._ShortDescriptionTextSet;
  }
  public String toString() {
    return BilledUsageObjectHelper.toMap(this, null).toString();
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
  /** BILL_INVOICE.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** BILL_INVOICE.statement_date field */
    if(!nonNullOnly || (StatementDate != null))  _StatementDateSet = flag;
  /** ServerId field */
    if (!nonNullOnly || (ServerId != null)) _ServerIdSet = flag;
  /** CDR_BILLED.subscr_no field */
    if(!nonNullOnly || (ServiceInternalId != null))  _ServiceInternalIdSet = flag;
  /** CDR_BILLED.subscr_no_resets field */
    if(!nonNullOnly || (ServiceInternalIdResets != null))  _ServiceInternalIdResetsSet = flag;
  /** CDR_BILLED.billed_amount field */
    if(!nonNullOnly || (Amount != null))  _AmountSet = flag;
  /** CDR_BILLED.billed_base_amt field */
    if(!nonNullOnly || (BaseAmt != null))  _BaseAmtSet = flag;
  /** CDR_BILLED.billed_unrounded_amount field */
    if(!nonNullOnly || (UnroundedAmount != null))  _UnroundedAmountSet = flag;
  /** CDR_BILLED.billed_amount_reduction field */
    if(!nonNullOnly || (AmountReduction != null))  _AmountReductionSet = flag;
  /** CDR_BILLED.billed_federal_tax field */
    if(!nonNullOnly || (FederalTax != null))  _FederalTaxSet = flag;
  /** CDR_BILLED.billed_state_tax field */
    if(!nonNullOnly || (StateTax != null))  _StateTaxSet = flag;
  /** CDR_BILLED.billed_county_tax field */
    if(!nonNullOnly || (CountyTax != null))  _CountyTaxSet = flag;
  /** CDR_BILLED.billed_city_tax field */
    if(!nonNullOnly || (CityTax != null))  _CityTaxSet = flag;
  /** CDR_BILLED.billed_other_tax field */
    if(!nonNullOnly || (OtherTax != null))  _OtherTaxSet = flag;
  /** CDR_BILLED.billed_num_records field */
    if(!nonNullOnly || (NumRecords != null))  _NumRecordsSet = flag;
  /** CDR_BILLED.process_num field */
    if(!nonNullOnly || (ProcessNum != null))  _ProcessNumSet = flag;
  /** CDR_BILLED.units_credited field */
    if(!nonNullOnly || (UnitsCredited != null))  _UnitsCreditedSet = flag;
  /** CDR_BILLED.amount_credited field */
    if(!nonNullOnly || (AmountCredited != null))  _AmountCreditedSet = flag;
  /** CDR_BILLED.geocode field */
    if(!nonNullOnly || (Geocode != null))  _GeocodeSet = flag;
  /** CDR_BILLED.aux_tax_info field */
    if(!nonNullOnly || (AuxTaxInfo != null))  _AuxTaxInfoSet = flag;
  /** CDR_BILLED.bill_invoice_row field */
    if(!nonNullOnly || (BillInvoiceRow != null))  _BillInvoiceRowSet = flag;
  /** CDR_BILLED.unit_cr_id field */
    if(!nonNullOnly || (UnitCrId != null))  _UnitCrIdSet = flag;
  /** CDR_BILLED.arch_flag field */
    if(!nonNullOnly || (ArchFlag != null))  _ArchFlagSet = flag;
  /** CDR_BILLED.discount field */
    if(!nonNullOnly || (Discount != null))  _DiscountSet = flag;
  /** CDR_BILLED.discount_id field */
    if(!nonNullOnly || (DiscountId != null))  _DiscountIdSet = flag;
  /** CDR_BILLED.threshold_proration_factor field */
    if(!nonNullOnly || (ThresholdProrationFactor != null))  _ThresholdProrationFactorSet = flag;
  /** CDR_BILLED.refund_proration_factor field */
    if(!nonNullOnly || (RefundProrationFactor != null))  _RefundProrationFactorSet = flag;
  /** CDR_BILLED.point_origin field */
    if(!nonNullOnly || (PointOrigin != null))  _PointOriginSet = flag;
  /** CDR_BILLED.point_target field */
    if(!nonNullOnly || (PointTarget != null))  _PointTargetSet = flag;
  /** CDR_BILLED.trans_dt field */
    if(!nonNullOnly || (TransDt != null))  _TransDtSet = flag;
  /** CDR_BILLED.type_id_usg field */
    if(!nonNullOnly || (TypeIdUsg != null))  _TypeIdUsgSet = flag;
  /** CDR_DATA.ext_tracking_id field */
    if(!nonNullOnly || (ExtTrackingId != null))  _ExtTrackingIdSet = flag;
  /** CDR_DATA.trans_id field */
    if(!nonNullOnly || (TransId != null))  _TransIdSet = flag;
  /** CDR_DATA.element_id field */
    if(!nonNullOnly || (ElementId != null))  _ElementIdSet = flag;
  /** CDR_DATA.rate_class field */
    if(!nonNullOnly || (RateClass != null))  _RateClassSet = flag;
  /** CDR_DATA.bill_class field */
    if(!nonNullOnly || (BillClass != null))  _BillClassSet = flag;
  /** CDR_DATA.provider_id field */
    if(!nonNullOnly || (ProviderId != null))  _ProviderIdSet = flag;
  /** CDR_DATA.jurisdiction field */
    if(!nonNullOnly || (Jurisdiction != null))  _JurisdictionSet = flag;
  /** CDR_DATA.rate_currency_code field */
    if(!nonNullOnly || (RateCurrencyCode != null))  _RateCurrencyCodeSet = flag;
  /** CDR_DATA.account_no field */
    if(!nonNullOnly || (AccountNo != null))  _AccountNoSet = flag;
  /** CDR_DATA.external_id field */
    if(!nonNullOnly || (ExternalId != null))  _ExternalIdSet = flag;
  /** CDR_DATA.external_id_type field */
    if(!nonNullOnly || (ExternalIdType != null))  _ExternalIdTypeSet = flag;
  /** CDR_DATA.country_code_origin field */
    if(!nonNullOnly || (CountryCodeOrigin != null))  _CountryCodeOriginSet = flag;
  /** CDR_DATA.country_dial_code_origin field */
    if(!nonNullOnly || (CountryDialCodeOrigin != null))  _CountryDialCodeOriginSet = flag;
  /** CDR_DATA.point_id_origin field */
    if(!nonNullOnly || (PointIdOrigin != null))  _PointIdOriginSet = flag;
  /** CDR_DATA.point_tax_code_origin field */
    if(!nonNullOnly || (PointTaxCodeOrigin != null))  _PointTaxCodeOriginSet = flag;
  /** CDR_DATA.point_tax_code_type_origin field */
    if(!nonNullOnly || (PointTaxCodeTypeOrigin != null))  _PointTaxCodeTypeOriginSet = flag;
  /** CDR_DATA.country_code_target field */
    if(!nonNullOnly || (CountryCodeTarget != null))  _CountryCodeTargetSet = flag;
  /** CDR_DATA.point_id_target field */
    if(!nonNullOnly || (PointIdTarget != null))  _PointIdTargetSet = flag;
  /** CDR_DATA.point_tax_code_target field */
    if(!nonNullOnly || (PointTaxCodeTarget != null))  _PointTaxCodeTargetSet = flag;
  /** CDR_DATA.point_tax_code_type_target field */
    if(!nonNullOnly || (PointTaxCodeTypeTarget != null))  _PointTaxCodeTypeTargetSet = flag;
  /** CDR_DATA.rate_dt field */
    if(!nonNullOnly || (RateDt != null))  _RateDtSet = flag;
  /** CDR_DATA.second_dt field */
    if(!nonNullOnly || (SecondDt != null))  _SecondDtSet = flag;
  /** CDR_DATA.tax_rate_active_dt field */
    if(!nonNullOnly || (TaxRateActiveDt != null))  _TaxRateActiveDtSet = flag;
  /** CDR_DATA.tax_rate_inactive_dt field */
    if(!nonNullOnly || (TaxRateInactiveDt != null))  _TaxRateInactiveDtSet = flag;
  /** CDR_DATA.timezone field */
    if(!nonNullOnly || (Timezone != null))  _TimezoneSet = flag;
  /** CDR_DATA.primary_units field */
    if(!nonNullOnly || (PrimaryUnits != null))  _PrimaryUnitsSet = flag;
  /** CDR_DATA.second_units field */
    if(!nonNullOnly || (SecondUnits != null))  _SecondUnitsSet = flag;
  /** CDR_DATA.third_units field */
    if(!nonNullOnly || (ThirdUnits != null))  _ThirdUnitsSet = flag;
  /** CDR_DATA.units_currency_code field */
    if(!nonNullOnly || (UnitsCurrencyCode != null))  _UnitsCurrencyCodeSet = flag;
  /** CDR_DATA.billing_units_type field */
    if(!nonNullOnly || (BillingUnitsType != null))  _BillingUnitsTypeSet = flag;
  /** CDR_DATA.profile_id field */
    if(!nonNullOnly || (ProfileId != null))  _ProfileIdSet = flag;
  /** CDR_DATA.annotation field */
    if(!nonNullOnly || (Annotation != null))  _AnnotationSet = flag;
  /** CDR_DATA.customer_tag field */
    if(!nonNullOnly || (CustomerTag != null))  _CustomerTagSet = flag;
  /** CDR_DATA.rated_units field */
    if(!nonNullOnly || (Units != null))  _UnitsSet = flag;
  /** CDR_DATA.amount field */
    if(!nonNullOnly || (RatedAmount != null))  _RatedAmountSet = flag;
  /** CDR_DATA.foreign_amount field */
    if(!nonNullOnly || (ForeignAmount != null))  _ForeignAmountSet = flag;
  /** CDR_DATA.rate_period field */
    if(!nonNullOnly || (RatePeriod != null))  _RatePeriodSet = flag;
  /** CDR_DATA.no_bill field */
    if(!nonNullOnly || (NoBill != null))  _NoBillSet = flag;
  /** CDR_DATA.comp_status field */
    if(!nonNullOnly || (CompStatus != null))  _CompStatusSet = flag;
  /** CDR_DATA.cdr_status field */
    if(!nonNullOnly || (CdrStatus != null))  _CdrStatusSet = flag;
  /** CDR_DATA.file_id field */
    if(!nonNullOnly || (FileId != null))  _FileIdSet = flag;
  /** CDR_DATA.file_id_serv field */
    if(!nonNullOnly || (FileIdServ != null))  _FileIdServSet = flag;
  /** CDR_DATA.rev_rcv_cost_ctr field */
    if(!nonNullOnly || (RevRcvCostCtr != null))  _RevRcvCostCtrSet = flag;
  /** CDR_DATA.corridor_plan_id field */
    if(!nonNullOnly || (CorridorPlanId != null))  _CorridorPlanIdSet = flag;
  /** CDR_DATA.cell_id_origin field */
    if(!nonNullOnly || (CellIdOrigin != null))  _CellIdOriginSet = flag;
  /** CDR_DATA.orig_type_id_usg field */
    if(!nonNullOnly || (OrigTypeIdUsg != null))  _OrigTypeIdUsgSet = flag;
  /** CDR_DATA.access_region_origin field */
    if(!nonNullOnly || (AccessRegionOrigin != null))  _AccessRegionOriginSet = flag;
  /** CDR_DATA.access_region_target field */
    if(!nonNullOnly || (AccessRegionTarget != null))  _AccessRegionTargetSet = flag;
  /** CDR_DATA.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** CDR_DATA.amount_reduction field */
    if(!nonNullOnly || (RatedAmountReduction != null))  _RatedAmountReductionSet = flag;
  /** CDR_DATA.amount_reduction_id field */
    if(!nonNullOnly || (AmountReductionId != null))  _AmountReductionIdSet = flag;
  /** CDR_DATA.seqnum_rate_usage field */
    if(!nonNullOnly || (SeqnumRateUsage != null))  _SeqnumRateUsageSet = flag;
  /** CDR_DATA.seqnum_rate_usage_overrides field */
    if(!nonNullOnly || (SeqnumRateUsageOverrides != null))  _SeqnumRateUsageOverridesSet = flag;
  /** CDR_DATA.raw_units field */
    if(!nonNullOnly || (RawUnits != null))  _RawUnitsSet = flag;
  /** CDR_DATA.raw_units_rounded field */
    if(!nonNullOnly || (RawUnitsRounded != null))  _RawUnitsRoundedSet = flag;
  /** CDR_DATA.aggr_usage_id field */
    if(!nonNullOnly || (AggrUsageId != null))  _AggrUsageIdSet = flag;
  /** CDR_DATA.zone_class field */
    if(!nonNullOnly || (ZoneClass != null))  _ZoneClassSet = flag;
  /** CDR_DATA.point_class_origin field */
    if(!nonNullOnly || (PointClassOrigin != null))  _PointClassOriginSet = flag;
  /** CDR_DATA.point_class_target field */
    if(!nonNullOnly || (PointClassTarget != null))  _PointClassTargetSet = flag;
  /** CDR_DATA.equip_class_code field */
    if(!nonNullOnly || (EquipClassCode != null))  _EquipClassCodeSet = flag;
  /** CDR_DATA.component_id field */
    if(!nonNullOnly || (ComponentId != null))  _ComponentIdSet = flag;
  /** CDR_DATA.tax_pkg_count field */
    if(!nonNullOnly || (TaxPkgCount != null))  _TaxPkgCountSet = flag;
  /** CDR_DATA.add_implied_decimal field */
    if(!nonNullOnly || (AddImpliedDecimal != null))  _AddImpliedDecimalSet = flag;
  /** CDR_DATA.rerated_dt field */
    if(!nonNullOnly || (ReratedDt != null))  _ReratedDtSet = flag;
  /** CDR_DATA.external_invoice_id field */
    if(!nonNullOnly || (ExternalInvoiceId != null))  _ExternalInvoiceIdSet = flag;
  /** CDR_DATA.invoice_record_seq field */
    if(!nonNullOnly || (InvoiceRecordSeq != null))  _InvoiceRecordSeqSet = flag;
  /** CDR_DATA.lob_id field */
    if(!nonNullOnly || (LobId != null))  _LobIdSet = flag;
  /** CDR_DATA.transaction_id field */
    if(!nonNullOnly || (TransactionId != null))  _TransactionIdSet = flag;
  /** USAGE_TYPES.guide_to field */
    if(!nonNullOnly || (GuideTo != null))  _GuideToSet = flag;
  /** USAGE_TYPES.point_category field */
    if(!nonNullOnly || (PointCategory != null))  _PointCategorySet = flag;
  /** USAGE_TYPES.origin_country_dial_code_req field */
    if(!nonNullOnly || (OriginCountryDialCodeReq != null))  _OriginCountryDialCodeReqSet = flag;
  /** USAGE_TYPES.tax_code_origin_req field */
    if(!nonNullOnly || (TaxCodeOriginReq != null))  _TaxCodeOriginReqSet = flag;
  /** USAGE_TYPES.tax_code_target_req field */
    if(!nonNullOnly || (TaxCodeTargetReq != null))  _TaxCodeTargetReqSet = flag;
  /** USAGE_TYPES.description_code field */
    if(!nonNullOnly || (DescriptionCode != null))  _DescriptionCodeSet = flag;
  /** USAGE_TYPES.tax_class field */
    if(!nonNullOnly || (TaxClass != null))  _TaxClassSet = flag;
  /** USAGE_TYPES.tax_location_usg field */
    if(!nonNullOnly || (TaxLocationUsg != null))  _TaxLocationUsgSet = flag;
  /** USAGE_TYPES.tax_location_outcollect field */
    if(!nonNullOnly || (TaxLocationOutcollect != null))  _TaxLocationOutcollectSet = flag;
  /** USAGE_TYPES.usg_class field */
    if(!nonNullOnly || (UsgClass != null))  _UsgClassSet = flag;
  /** USAGE_TYPES.free_usg field */
    if(!nonNullOnly || (FreeUsg != null))  _FreeUsgSet = flag;
  /** USAGE_TYPES.product_line_id field */
    if(!nonNullOnly || (ProductLineId != null))  _ProductLineIdSet = flag;
  /** USAGE_TYPES.bill_aggr_level field */
    if(!nonNullOnly || (BillAggrLevel != null))  _BillAggrLevelSet = flag;
  /** USAGE_TYPES.derive_jurisdiction field */
    if(!nonNullOnly || (DeriveJurisdiction != null))  _DeriveJurisdictionSet = flag;
  /** USAGE_TYPES.units_indicator field */
    if(!nonNullOnly || (UnitsIndicator != null))  _UnitsIndicatorSet = flag;
  /** USAGE_TYPES.ratable_unit_class field */
    if(!nonNullOnly || (RatableUnitClass != null))  _RatableUnitClassSet = flag;
  /** USAGE_TYPES.duration_flag field */
    if(!nonNullOnly || (DurationFlag != null))  _DurationFlagSet = flag;
  /** USAGE_TYPES.derive_distance_units field */
    if(!nonNullOnly || (DeriveDistanceUnits != null))  _DeriveDistanceUnitsSet = flag;
  /** USAGE_TYPES.vh_minor_threshold field */
    if(!nonNullOnly || (VhMinorThreshold != null))  _VhMinorThresholdSet = flag;
  /** USAGE_TYPES.distance_units_indicator field */
    if(!nonNullOnly || (DistanceUnitsIndicator != null))  _DistanceUnitsIndicatorSet = flag;
  /** USAGE_TYPES.guide_to_provider field */
    if(!nonNullOnly || (GuideToProvider != null))  _GuideToProviderSet = flag;
  /** USAGE_TYPES.is_prerated field */
    if(!nonNullOnly || (IsPrerated != null))  _IsPreratedSet = flag;
  /** USAGE_TYPES.keep_running_total field */
    if(!nonNullOnly || (KeepRunningTotal != null))  _KeepRunningTotalSet = flag;
  /** USAGE_TYPES.rounding_method field */
    if(!nonNullOnly || (RoundingMethod != null))  _RoundingMethodSet = flag;
  /** USAGE_TYPES.raw_units_type field */
    if(!nonNullOnly || (RawUnitsType != null))  _RawUnitsTypeSet = flag;
  /** USAGE_TYPES.use_rate_class field */
    if(!nonNullOnly || (UseRateClass != null))  _UseRateClassSet = flag;
  /** USAGE_TYPES.use_bill_class field */
    if(!nonNullOnly || (UseBillClass != null))  _UseBillClassSet = flag;
  /** USAGE_TYPES.use_jurisdiction field */
    if(!nonNullOnly || (UseJurisdiction != null))  _UseJurisdictionSet = flag;
  /** USAGE_TYPES.use_point_class_origin field */
    if(!nonNullOnly || (UsePointClassOrigin != null))  _UsePointClassOriginSet = flag;
  /** USAGE_TYPES.use_point_class_target field */
    if(!nonNullOnly || (UsePointClassTarget != null))  _UsePointClassTargetSet = flag;
  /** USAGE_TYPES.use_provider_class field */
    if(!nonNullOnly || (UseProviderClass != null))  _UseProviderClassSet = flag;
  /** USAGE_TYPES.use_rate_period field */
    if(!nonNullOnly || (UseRatePeriod != null))  _UseRatePeriodSet = flag;
  /** USAGE_TYPES.use_element_id field */
    if(!nonNullOnly || (UseElementId != null))  _UseElementIdSet = flag;
  /** USAGE_TYPES.use_equip_type_code field */
    if(!nonNullOnly || (UseEquipTypeCode != null))  _UseEquipTypeCodeSet = flag;
  /** USAGE_TYPES.use_equip_class_code field */
    if(!nonNullOnly || (UseEquipClassCode != null))  _UseEquipClassCodeSet = flag;
  /** USAGE_TYPES.use_class_of_service_code field */
    if(!nonNullOnly || (UseClassOfServiceCode != null))  _UseClassOfServiceCodeSet = flag;
  /** USAGE_TYPES.use_distance_band_id field */
    if(!nonNullOnly || (UseDistanceBandId != null))  _UseDistanceBandIdSet = flag;
  /** USAGE_TYPES.use_default_rate_type field */
    if(!nonNullOnly || (UseDefaultRateType != null))  _UseDefaultRateTypeSet = flag;
  /** USAGE_TYPES.rate_currency_location field */
    if(!nonNullOnly || (RateCurrencyLocation != null))  _RateCurrencyLocationSet = flag;
  /** USAGE_TYPES.rate_period_rounding field */
    if(!nonNullOnly || (RatePeriodRounding != null))  _RatePeriodRoundingSet = flag;
  /** USAGE_TYPES.rate_minimum_duration field */
    if(!nonNullOnly || (RateMinimumDuration != null))  _RateMinimumDurationSet = flag;
  /** USAGE_TYPES.use_component_id field */
    if(!nonNullOnly || (UseComponentId != null))  _UseComponentIdSet = flag;
  /** USAGE_TYPES.min_billing_units field */
    if(!nonNullOnly || (MinBillingUnits != null))  _MinBillingUnitsSet = flag;
  /** USAGE_TYPES.consolidate_usage field */
    if(!nonNullOnly || (ConsolidateUsage != null))  _ConsolidateUsageSet = flag;
  /** USAGE_TYPES.network_delay field */
    if(!nonNullOnly || (NetworkDelay != null))  _NetworkDelaySet = flag;
  /** USAGE_TYPES.is_late_fee_exempt field */
    if(!nonNullOnly || (IsLateFeeExempt != null))  _IsLateFeeExemptSet = flag;
  /** USAGE_TYPES.rating_method field */
    if(!nonNullOnly || (RatingMethod != null))  _RatingMethodSet = flag;
  /** USAGE_TYPES.use_zone_class field */
    if(!nonNullOnly || (UseZoneClass != null))  _UseZoneClassSet = flag;
  /** DESCRIPTIONS.description_group field */
    if(!nonNullOnly || (DescriptionGroup != null))  _DescriptionGroupSet = flag;
  /** DESCRIPTIONS.description_text field */
    if(!nonNullOnly || (DescriptionText != null))  _DescriptionTextSet = flag;
  /** DESCRIPTIONS.short_description_text field */
    if(!nonNullOnly || (ShortDescriptionText != null))  _ShortDescriptionTextSet = flag;
  }
}
