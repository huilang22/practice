/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceDetailObjectFilter.java
 * Definition File: Customer/InvoiceDetail.xml
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
public class InvoiceDetailObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public InvoiceDetailObjectKeyFilter Key = null;
  /** raw field for: BILL_INVOICE.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: BILL_INVOICE.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: BILL_INVOICE.statement_date) */
  public    DateFilter[] StatementDate  = null;
  protected boolean StatementDateFetch = false;
  protected boolean StatementDateSortAscending = true;
  protected Integer StatementDateSort = null;
  /** raw field for: BILL_INVOICE.bill_sequence_num) */
  public    IntegerFilter[] BillSequenceNum  = null;
  protected boolean BillSequenceNumFetch = false;
  protected boolean BillSequenceNumSortAscending = true;
  protected Integer BillSequenceNumSort = null;
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
  /** raw field */
  public    IntegerFilter[] ServerId  = null;
  protected boolean ServerIdFetch = false;
  protected boolean ServerIdSortAscending = true;
  protected Integer ServerIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.process_num) */
  public    StringFilter[] ProcessNum  = null;
  protected boolean ProcessNumFetch = false;
  protected boolean ProcessNumSortAscending = true;
  protected boolean ProcessNumCaseInsensitive = false;
  protected Integer ProcessNumSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.package_id) */
  public    IntegerFilter[] PackageId  = null;
  protected boolean PackageIdFetch = false;
  protected boolean PackageIdSortAscending = true;
  protected Integer PackageIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.component_id) */
  public    IntegerFilter[] ComponentId  = null;
  protected boolean ComponentIdFetch = false;
  protected boolean ComponentIdSortAscending = true;
  protected Integer ComponentIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.type_code) */
  public    IntegerFilter[] TypeCode  = null;
  protected boolean TypeCodeFetch = false;
  protected boolean TypeCodeSortAscending = true;
  protected Integer TypeCodeSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.subtype_code) */
  public    IntegerFilter[] SubtypeCode  = null;
  protected boolean SubtypeCodeFetch = false;
  protected boolean SubtypeCodeSortAscending = true;
  protected Integer SubtypeCodeSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.tracking_id) */
  public    IntegerFilter[] TrackingId  = null;
  protected boolean TrackingIdFetch = false;
  protected boolean TrackingIdSortAscending = true;
  protected Integer TrackingIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.tracking_id_serv) */
  public    IntegerFilter[] TrackingIdServ  = null;
  protected boolean TrackingIdServFetch = false;
  protected boolean TrackingIdServSortAscending = true;
  protected Integer TrackingIdServSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.tracking_date) */
  public    DateFilter[] TrackingDate  = null;
  protected boolean TrackingDateFetch = false;
  protected boolean TrackingDateSortAscending = true;
  protected Integer TrackingDateSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.prep_sequence) */
  public    IntegerFilter[] PrepSequence  = null;
  protected boolean PrepSequenceFetch = false;
  protected boolean PrepSequenceSortAscending = true;
  protected Integer PrepSequenceSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.prorate_code) */
  public    IntegerFilter[] ProrateCode  = null;
  protected boolean ProrateCodeFetch = false;
  protected boolean ProrateCodeSortAscending = true;
  protected Integer ProrateCodeSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.billing_level) */
  public    IntegerFilter[] BillingLevel  = null;
  protected boolean BillingLevelFetch = false;
  protected boolean BillingLevelSortAscending = true;
  protected Integer BillingLevelSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.billing_category) */
  public    IntegerFilter[] BillingCategory  = null;
  protected boolean BillingCategoryFetch = false;
  protected boolean BillingCategorySortAscending = true;
  protected Integer BillingCategorySort = null;
  /** raw field for: BILL_INVOICE_DETAIL.amount) */
  public    BigIntegerFilter[] Amount  = null;
  protected boolean AmountFetch = false;
  protected boolean AmountSortAscending = true;
  protected Integer AmountSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.rated_amount) */
  public    BigIntegerFilter[] RatedAmount  = null;
  protected boolean RatedAmountFetch = false;
  protected boolean RatedAmountSortAscending = true;
  protected Integer RatedAmountSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.secondary_amount) */
  public    BigIntegerFilter[] SecondaryAmount  = null;
  protected boolean SecondaryAmountFetch = false;
  protected boolean SecondaryAmountSortAscending = true;
  protected Integer SecondaryAmountSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.rate_currency_code) */
  public    IntegerFilter[] RateCurrencyCode  = null;
  protected boolean RateCurrencyCodeFetch = false;
  protected boolean RateCurrencyCodeSortAscending = true;
  protected Integer RateCurrencyCodeSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.units) */
  public    BigIntegerFilter[] Units  = null;
  protected boolean UnitsFetch = false;
  protected boolean UnitsSortAscending = true;
  protected Integer UnitsSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.tax) */
  public    BigIntegerFilter[] Tax  = null;
  protected boolean TaxFetch = false;
  protected boolean TaxSortAscending = true;
  protected Integer TaxSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.tax_rate) */
  public    IntegerFilter[] TaxRate  = null;
  protected boolean TaxRateFetch = false;
  protected boolean TaxRateSortAscending = true;
  protected Integer TaxRateSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.tax_pkg_inst_id) */
  public    IntegerFilter[] TaxPkgInstId  = null;
  protected boolean TaxPkgInstIdFetch = false;
  protected boolean TaxPkgInstIdSortAscending = true;
  protected Integer TaxPkgInstIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.discount) */
  public    BigIntegerFilter[] Discount  = null;
  protected boolean DiscountFetch = false;
  protected boolean DiscountSortAscending = true;
  protected Integer DiscountSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.discount_id) */
  public    IntegerFilter[] DiscountId  = null;
  protected boolean DiscountIdFetch = false;
  protected boolean DiscountIdSortAscending = true;
  protected Integer DiscountIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.trans_date) */
  public    DateFilter[] TransDate  = null;
  protected boolean TransDateFetch = false;
  protected boolean TransDateSortAscending = true;
  protected Integer TransDateSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.provider_id) */
  public    IntegerFilter[] ProviderId  = null;
  protected boolean ProviderIdFetch = false;
  protected boolean ProviderIdSortAscending = true;
  protected Integer ProviderIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.element_id) */
  public    IntegerFilter[] ElementId  = null;
  protected boolean ElementIdFetch = false;
  protected boolean ElementIdSortAscending = true;
  protected Integer ElementIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.product_line_id) */
  public    IntegerFilter[] ProductLineId  = null;
  protected boolean ProductLineIdFetch = false;
  protected boolean ProductLineIdSortAscending = true;
  protected Integer ProductLineIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.description_code) */
  public    IntegerFilter[] DescriptionCode  = null;
  protected boolean DescriptionCodeFetch = false;
  protected boolean DescriptionCodeSortAscending = true;
  protected Integer DescriptionCodeSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.rate_type) */
  public    IntegerFilter[] RateType  = null;
  protected boolean RateTypeFetch = false;
  protected boolean RateTypeSortAscending = true;
  protected Integer RateTypeSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.rate_period) */
  public    StringFilter[] RatePeriod  = null;
  protected boolean RatePeriodFetch = false;
  protected boolean RatePeriodSortAscending = true;
  protected boolean RatePeriodCaseInsensitive = false;
  protected Integer RatePeriodSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.subscr_no) */
  public    IntegerFilter[] ServiceInternalId  = null;
  protected boolean ServiceInternalIdFetch = false;
  protected boolean ServiceInternalIdSortAscending = true;
  protected Integer ServiceInternalIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.subscr_no_resets) */
  public    IntegerFilter[] ServiceInternalIdResets  = null;
  protected boolean ServiceInternalIdResetsFetch = false;
  protected boolean ServiceInternalIdResetsSortAscending = true;
  protected Integer ServiceInternalIdResetsSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.equip_status) */
  public    IntegerFilter[] EquipStatus  = null;
  protected boolean EquipStatusFetch = false;
  protected boolean EquipStatusSortAscending = true;
  protected Integer EquipStatusSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.from_date) */
  public    DateFilter[] FromDate  = null;
  protected boolean FromDateFetch = false;
  protected boolean FromDateSortAscending = true;
  protected Integer FromDateSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.to_date) */
  public    DateFilter[] ToDate  = null;
  protected boolean ToDateFetch = false;
  protected boolean ToDateSortAscending = true;
  protected Integer ToDateSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.annotation) */
  public    StringFilter[] Annotation  = null;
  protected boolean AnnotationFetch = false;
  protected boolean AnnotationSortAscending = true;
  protected boolean AnnotationCaseInsensitive = false;
  protected Integer AnnotationSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.profile_id) */
  public    BigIntegerFilter[] ProfileId  = null;
  protected boolean ProfileIdFetch = false;
  protected boolean ProfileIdSortAscending = true;
  protected Integer ProfileIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.geocode) */
  public    StringFilter[] Geocode  = null;
  protected boolean GeocodeFetch = false;
  protected boolean GeocodeSortAscending = true;
  protected boolean GeocodeCaseInsensitive = false;
  protected Integer GeocodeSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.aux_tax_info) */
  public    StringFilter[] AuxTaxInfo  = null;
  protected boolean AuxTaxInfoFetch = false;
  protected boolean AuxTaxInfoSortAscending = true;
  protected boolean AuxTaxInfoCaseInsensitive = false;
  protected Integer AuxTaxInfoSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.federal_tax) */
  public    BigIntegerFilter[] FederalTax  = null;
  protected boolean FederalTaxFetch = false;
  protected boolean FederalTaxSortAscending = true;
  protected Integer FederalTaxSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.state_tax) */
  public    BigIntegerFilter[] StateTax  = null;
  protected boolean StateTaxFetch = false;
  protected boolean StateTaxSortAscending = true;
  protected Integer StateTaxSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.county_tax) */
  public    BigIntegerFilter[] CountyTax  = null;
  protected boolean CountyTaxFetch = false;
  protected boolean CountyTaxSortAscending = true;
  protected Integer CountyTaxSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.city_tax) */
  public    BigIntegerFilter[] CityTax  = null;
  protected boolean CityTaxFetch = false;
  protected boolean CityTaxSortAscending = true;
  protected Integer CityTaxSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.other_tax) */
  public    BigIntegerFilter[] OtherTax  = null;
  protected boolean OtherTaxFetch = false;
  protected boolean OtherTaxSortAscending = true;
  protected Integer OtherTaxSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.test_flag) */
  public    BooleanFilter[] TestFlag  = null;
  protected boolean TestFlagFetch = false;
  protected boolean TestFlagSortAscending = true;
  protected Integer TestFlagSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.arch_flag) */
  public    BooleanFilter[] ArchFlag  = null;
  protected boolean ArchFlagFetch = false;
  protected boolean ArchFlagSortAscending = true;
  protected Integer ArchFlagSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.rev_rcv_cost_ctr) */
  public    IntegerFilter[] RevRcvCostCtr  = null;
  protected boolean RevRcvCostCtrFetch = false;
  protected boolean RevRcvCostCtrSortAscending = true;
  protected Integer RevRcvCostCtrSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr) */
  public    IntegerFilter[] BRevRcvCostCtr  = null;
  protected boolean BRevRcvCostCtrFetch = false;
  protected boolean BRevRcvCostCtrSortAscending = true;
  protected Integer BRevRcvCostCtrSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.aggr_usage_id) */
  public    IntegerFilter[] AggrUsageId  = null;
  protected boolean AggrUsageIdFetch = false;
  protected boolean AggrUsageIdSortAscending = true;
  protected Integer AggrUsageIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.tax_type_code) */
  public    IntegerFilter[] TaxTypeCode  = null;
  protected boolean TaxTypeCodeFetch = false;
  protected boolean TaxTypeCodeSortAscending = true;
  protected Integer TaxTypeCodeSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.amount_reduction) */
  public    BigIntegerFilter[] AmountReduction  = null;
  protected boolean AmountReductionFetch = false;
  protected boolean AmountReductionSortAscending = true;
  protected Integer AmountReductionSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.amount_reduction_id) */
  public    IntegerFilter[] AmountReductionId  = null;
  protected boolean AmountReductionIdFetch = false;
  protected boolean AmountReductionIdSortAscending = true;
  protected Integer AmountReductionIdSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.zone_class) */
  public    IntegerFilter[] ZoneClass  = null;
  protected boolean ZoneClassFetch = false;
  protected boolean ZoneClassSortAscending = true;
  protected Integer ZoneClassSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.bill_class) */
  public    IntegerFilter[] BillClass  = null;
  protected boolean BillClassFetch = false;
  protected boolean BillClassSortAscending = true;
  protected Integer BillClassSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.inclusive_tax) */
  public    BigIntegerFilter[] InclusiveTax  = null;
  protected boolean InclusiveTaxFetch = false;
  protected boolean InclusiveTaxSortAscending = true;
  protected Integer InclusiveTaxSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.pcm_active_dt) */
  public    DateFilter[] PcmActiveDt  = null;
  protected boolean PcmActiveDtFetch = false;
  protected boolean PcmActiveDtSortAscending = true;
  protected Integer PcmActiveDtSort = null;
  /** raw field for: BILL_INVOICE_DETAIL.misc_number1) */
  public    BigIntegerFilter[] MiscNumber1  = null;
  protected boolean MiscNumber1Fetch = false;
  protected boolean MiscNumber1SortAscending = true;
  protected Integer MiscNumber1Sort = null;
  /** raw field for: BILL_INVOICE_DETAIL.misc_number2) */
  public    BigIntegerFilter[] MiscNumber2  = null;
  protected boolean MiscNumber2Fetch = false;
  protected boolean MiscNumber2SortAscending = true;
  protected Integer MiscNumber2Sort = null;
  /** raw field for: BILL_INVOICE_DETAIL.lob_id) */
  public    BigIntegerFilter[] LobId  = null;
  protected boolean LobIdFetch = false;
  protected boolean LobIdSortAscending = true;
  protected Integer LobIdSort = null;
  /** raw field for: DESCRIPTIONS.description_group) */
  public    IntegerFilter[] DescriptionGroup  = null;
  protected boolean DescriptionGroupFetch = false;
  protected boolean DescriptionGroupSortAscending = true;
  protected Integer DescriptionGroupSort = null;
  /** raw field for: DESCRIPTIONS.description_text) */
  public    StringFilter[] DescriptionText  = null;
  protected boolean DescriptionTextFetch = false;
  protected boolean DescriptionTextSortAscending = true;
  protected boolean DescriptionTextCaseInsensitive = false;
  protected Integer DescriptionTextSort = null;
  /** raw field for: DESCRIPTIONS.short_description_text) */
  public    StringFilter[] ShortDescriptionText  = null;
  protected boolean ShortDescriptionTextFetch = false;
  protected boolean ShortDescriptionTextSortAscending = true;
  protected boolean ShortDescriptionTextCaseInsensitive = false;
  protected Integer ShortDescriptionTextSort = null;
  private String _objName = "InvoiceDetailObjectFilter";
  /** default constructor */
  public InvoiceDetailObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public InvoiceDetailObjectFilter (InvoiceDetailObjectFilter other)
  {
    if (other == null) return;
    this.Key = new InvoiceDetailObjectKeyFilter (other.Key);
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.StatementDate = other.StatementDate;
    this.StatementDateFetch = other.StatementDateFetch;
    this.StatementDateSort = other.StatementDateSort;
    this.StatementDateSortAscending = other.StatementDateSortAscending;
    this.BillSequenceNum = other.BillSequenceNum;
    this.BillSequenceNumFetch = other.BillSequenceNumFetch;
    this.BillSequenceNumSort = other.BillSequenceNumSort;
    this.BillSequenceNumSortAscending = other.BillSequenceNumSortAscending;
    this.ServiceExternalId = other.ServiceExternalId;
    this.ServiceExternalIdFetch = other.ServiceExternalIdFetch;
    this.ServiceExternalIdSort = other.ServiceExternalIdSort;
    this.ServiceExternalIdCaseInsensitive = other.ServiceExternalIdCaseInsensitive;
    this.ServiceExternalIdSortAscending = other.ServiceExternalIdSortAscending;
    this.ServiceExternalIdType = other.ServiceExternalIdType;
    this.ServiceExternalIdTypeFetch = other.ServiceExternalIdTypeFetch;
    this.ServiceExternalIdTypeSort = other.ServiceExternalIdTypeSort;
    this.ServiceExternalIdTypeSortAscending = other.ServiceExternalIdTypeSortAscending;
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.ServerId = other.ServerId;
    this.ServerIdFetch = other.ServerIdFetch;
    this.ServerIdSort = other.ServerIdSort;
    this.ServerIdSortAscending = other.ServerIdSortAscending;
    this.ProcessNum = other.ProcessNum;
    this.ProcessNumFetch = other.ProcessNumFetch;
    this.ProcessNumSort = other.ProcessNumSort;
    this.ProcessNumCaseInsensitive = other.ProcessNumCaseInsensitive;
    this.ProcessNumSortAscending = other.ProcessNumSortAscending;
    this.PackageId = other.PackageId;
    this.PackageIdFetch = other.PackageIdFetch;
    this.PackageIdSort = other.PackageIdSort;
    this.PackageIdSortAscending = other.PackageIdSortAscending;
    this.ComponentId = other.ComponentId;
    this.ComponentIdFetch = other.ComponentIdFetch;
    this.ComponentIdSort = other.ComponentIdSort;
    this.ComponentIdSortAscending = other.ComponentIdSortAscending;
    this.TypeCode = other.TypeCode;
    this.TypeCodeFetch = other.TypeCodeFetch;
    this.TypeCodeSort = other.TypeCodeSort;
    this.TypeCodeSortAscending = other.TypeCodeSortAscending;
    this.SubtypeCode = other.SubtypeCode;
    this.SubtypeCodeFetch = other.SubtypeCodeFetch;
    this.SubtypeCodeSort = other.SubtypeCodeSort;
    this.SubtypeCodeSortAscending = other.SubtypeCodeSortAscending;
    this.TrackingId = other.TrackingId;
    this.TrackingIdFetch = other.TrackingIdFetch;
    this.TrackingIdSort = other.TrackingIdSort;
    this.TrackingIdSortAscending = other.TrackingIdSortAscending;
    this.TrackingIdServ = other.TrackingIdServ;
    this.TrackingIdServFetch = other.TrackingIdServFetch;
    this.TrackingIdServSort = other.TrackingIdServSort;
    this.TrackingIdServSortAscending = other.TrackingIdServSortAscending;
    this.TrackingDate = other.TrackingDate;
    this.TrackingDateFetch = other.TrackingDateFetch;
    this.TrackingDateSort = other.TrackingDateSort;
    this.TrackingDateSortAscending = other.TrackingDateSortAscending;
    this.PrepSequence = other.PrepSequence;
    this.PrepSequenceFetch = other.PrepSequenceFetch;
    this.PrepSequenceSort = other.PrepSequenceSort;
    this.PrepSequenceSortAscending = other.PrepSequenceSortAscending;
    this.ProrateCode = other.ProrateCode;
    this.ProrateCodeFetch = other.ProrateCodeFetch;
    this.ProrateCodeSort = other.ProrateCodeSort;
    this.ProrateCodeSortAscending = other.ProrateCodeSortAscending;
    this.BillingLevel = other.BillingLevel;
    this.BillingLevelFetch = other.BillingLevelFetch;
    this.BillingLevelSort = other.BillingLevelSort;
    this.BillingLevelSortAscending = other.BillingLevelSortAscending;
    this.BillingCategory = other.BillingCategory;
    this.BillingCategoryFetch = other.BillingCategoryFetch;
    this.BillingCategorySort = other.BillingCategorySort;
    this.BillingCategorySortAscending = other.BillingCategorySortAscending;
    this.Amount = other.Amount;
    this.AmountFetch = other.AmountFetch;
    this.AmountSort = other.AmountSort;
    this.AmountSortAscending = other.AmountSortAscending;
    this.RatedAmount = other.RatedAmount;
    this.RatedAmountFetch = other.RatedAmountFetch;
    this.RatedAmountSort = other.RatedAmountSort;
    this.RatedAmountSortAscending = other.RatedAmountSortAscending;
    this.SecondaryAmount = other.SecondaryAmount;
    this.SecondaryAmountFetch = other.SecondaryAmountFetch;
    this.SecondaryAmountSort = other.SecondaryAmountSort;
    this.SecondaryAmountSortAscending = other.SecondaryAmountSortAscending;
    this.RateCurrencyCode = other.RateCurrencyCode;
    this.RateCurrencyCodeFetch = other.RateCurrencyCodeFetch;
    this.RateCurrencyCodeSort = other.RateCurrencyCodeSort;
    this.RateCurrencyCodeSortAscending = other.RateCurrencyCodeSortAscending;
    this.Units = other.Units;
    this.UnitsFetch = other.UnitsFetch;
    this.UnitsSort = other.UnitsSort;
    this.UnitsSortAscending = other.UnitsSortAscending;
    this.Tax = other.Tax;
    this.TaxFetch = other.TaxFetch;
    this.TaxSort = other.TaxSort;
    this.TaxSortAscending = other.TaxSortAscending;
    this.TaxRate = other.TaxRate;
    this.TaxRateFetch = other.TaxRateFetch;
    this.TaxRateSort = other.TaxRateSort;
    this.TaxRateSortAscending = other.TaxRateSortAscending;
    this.TaxPkgInstId = other.TaxPkgInstId;
    this.TaxPkgInstIdFetch = other.TaxPkgInstIdFetch;
    this.TaxPkgInstIdSort = other.TaxPkgInstIdSort;
    this.TaxPkgInstIdSortAscending = other.TaxPkgInstIdSortAscending;
    this.Discount = other.Discount;
    this.DiscountFetch = other.DiscountFetch;
    this.DiscountSort = other.DiscountSort;
    this.DiscountSortAscending = other.DiscountSortAscending;
    this.DiscountId = other.DiscountId;
    this.DiscountIdFetch = other.DiscountIdFetch;
    this.DiscountIdSort = other.DiscountIdSort;
    this.DiscountIdSortAscending = other.DiscountIdSortAscending;
    this.TransDate = other.TransDate;
    this.TransDateFetch = other.TransDateFetch;
    this.TransDateSort = other.TransDateSort;
    this.TransDateSortAscending = other.TransDateSortAscending;
    this.ProviderId = other.ProviderId;
    this.ProviderIdFetch = other.ProviderIdFetch;
    this.ProviderIdSort = other.ProviderIdSort;
    this.ProviderIdSortAscending = other.ProviderIdSortAscending;
    this.ElementId = other.ElementId;
    this.ElementIdFetch = other.ElementIdFetch;
    this.ElementIdSort = other.ElementIdSort;
    this.ElementIdSortAscending = other.ElementIdSortAscending;
    this.ProductLineId = other.ProductLineId;
    this.ProductLineIdFetch = other.ProductLineIdFetch;
    this.ProductLineIdSort = other.ProductLineIdSort;
    this.ProductLineIdSortAscending = other.ProductLineIdSortAscending;
    this.DescriptionCode = other.DescriptionCode;
    this.DescriptionCodeFetch = other.DescriptionCodeFetch;
    this.DescriptionCodeSort = other.DescriptionCodeSort;
    this.DescriptionCodeSortAscending = other.DescriptionCodeSortAscending;
    this.RateType = other.RateType;
    this.RateTypeFetch = other.RateTypeFetch;
    this.RateTypeSort = other.RateTypeSort;
    this.RateTypeSortAscending = other.RateTypeSortAscending;
    this.RatePeriod = other.RatePeriod;
    this.RatePeriodFetch = other.RatePeriodFetch;
    this.RatePeriodSort = other.RatePeriodSort;
    this.RatePeriodCaseInsensitive = other.RatePeriodCaseInsensitive;
    this.RatePeriodSortAscending = other.RatePeriodSortAscending;
    this.ServiceInternalId = other.ServiceInternalId;
    this.ServiceInternalIdFetch = other.ServiceInternalIdFetch;
    this.ServiceInternalIdSort = other.ServiceInternalIdSort;
    this.ServiceInternalIdSortAscending = other.ServiceInternalIdSortAscending;
    this.ServiceInternalIdResets = other.ServiceInternalIdResets;
    this.ServiceInternalIdResetsFetch = other.ServiceInternalIdResetsFetch;
    this.ServiceInternalIdResetsSort = other.ServiceInternalIdResetsSort;
    this.ServiceInternalIdResetsSortAscending = other.ServiceInternalIdResetsSortAscending;
    this.EquipStatus = other.EquipStatus;
    this.EquipStatusFetch = other.EquipStatusFetch;
    this.EquipStatusSort = other.EquipStatusSort;
    this.EquipStatusSortAscending = other.EquipStatusSortAscending;
    this.FromDate = other.FromDate;
    this.FromDateFetch = other.FromDateFetch;
    this.FromDateSort = other.FromDateSort;
    this.FromDateSortAscending = other.FromDateSortAscending;
    this.ToDate = other.ToDate;
    this.ToDateFetch = other.ToDateFetch;
    this.ToDateSort = other.ToDateSort;
    this.ToDateSortAscending = other.ToDateSortAscending;
    this.Annotation = other.Annotation;
    this.AnnotationFetch = other.AnnotationFetch;
    this.AnnotationSort = other.AnnotationSort;
    this.AnnotationCaseInsensitive = other.AnnotationCaseInsensitive;
    this.AnnotationSortAscending = other.AnnotationSortAscending;
    this.ProfileId = other.ProfileId;
    this.ProfileIdFetch = other.ProfileIdFetch;
    this.ProfileIdSort = other.ProfileIdSort;
    this.ProfileIdSortAscending = other.ProfileIdSortAscending;
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
    this.TestFlag = other.TestFlag;
    this.TestFlagFetch = other.TestFlagFetch;
    this.TestFlagSort = other.TestFlagSort;
    this.TestFlagSortAscending = other.TestFlagSortAscending;
    this.ArchFlag = other.ArchFlag;
    this.ArchFlagFetch = other.ArchFlagFetch;
    this.ArchFlagSort = other.ArchFlagSort;
    this.ArchFlagSortAscending = other.ArchFlagSortAscending;
    this.RevRcvCostCtr = other.RevRcvCostCtr;
    this.RevRcvCostCtrFetch = other.RevRcvCostCtrFetch;
    this.RevRcvCostCtrSort = other.RevRcvCostCtrSort;
    this.RevRcvCostCtrSortAscending = other.RevRcvCostCtrSortAscending;
    this.BRevRcvCostCtr = other.BRevRcvCostCtr;
    this.BRevRcvCostCtrFetch = other.BRevRcvCostCtrFetch;
    this.BRevRcvCostCtrSort = other.BRevRcvCostCtrSort;
    this.BRevRcvCostCtrSortAscending = other.BRevRcvCostCtrSortAscending;
    this.AggrUsageId = other.AggrUsageId;
    this.AggrUsageIdFetch = other.AggrUsageIdFetch;
    this.AggrUsageIdSort = other.AggrUsageIdSort;
    this.AggrUsageIdSortAscending = other.AggrUsageIdSortAscending;
    this.TaxTypeCode = other.TaxTypeCode;
    this.TaxTypeCodeFetch = other.TaxTypeCodeFetch;
    this.TaxTypeCodeSort = other.TaxTypeCodeSort;
    this.TaxTypeCodeSortAscending = other.TaxTypeCodeSortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.AmountReduction = other.AmountReduction;
    this.AmountReductionFetch = other.AmountReductionFetch;
    this.AmountReductionSort = other.AmountReductionSort;
    this.AmountReductionSortAscending = other.AmountReductionSortAscending;
    this.AmountReductionId = other.AmountReductionId;
    this.AmountReductionIdFetch = other.AmountReductionIdFetch;
    this.AmountReductionIdSort = other.AmountReductionIdSort;
    this.AmountReductionIdSortAscending = other.AmountReductionIdSortAscending;
    this.ZoneClass = other.ZoneClass;
    this.ZoneClassFetch = other.ZoneClassFetch;
    this.ZoneClassSort = other.ZoneClassSort;
    this.ZoneClassSortAscending = other.ZoneClassSortAscending;
    this.BillClass = other.BillClass;
    this.BillClassFetch = other.BillClassFetch;
    this.BillClassSort = other.BillClassSort;
    this.BillClassSortAscending = other.BillClassSortAscending;
    this.InclusiveTax = other.InclusiveTax;
    this.InclusiveTaxFetch = other.InclusiveTaxFetch;
    this.InclusiveTaxSort = other.InclusiveTaxSort;
    this.InclusiveTaxSortAscending = other.InclusiveTaxSortAscending;
    this.PcmActiveDt = other.PcmActiveDt;
    this.PcmActiveDtFetch = other.PcmActiveDtFetch;
    this.PcmActiveDtSort = other.PcmActiveDtSort;
    this.PcmActiveDtSortAscending = other.PcmActiveDtSortAscending;
    this.MiscNumber1 = other.MiscNumber1;
    this.MiscNumber1Fetch = other.MiscNumber1Fetch;
    this.MiscNumber1Sort = other.MiscNumber1Sort;
    this.MiscNumber1SortAscending = other.MiscNumber1SortAscending;
    this.MiscNumber2 = other.MiscNumber2;
    this.MiscNumber2Fetch = other.MiscNumber2Fetch;
    this.MiscNumber2Sort = other.MiscNumber2Sort;
    this.MiscNumber2SortAscending = other.MiscNumber2SortAscending;
    this.LobId = other.LobId;
    this.LobIdFetch = other.LobIdFetch;
    this.LobIdSort = other.LobIdSort;
    this.LobIdSortAscending = other.LobIdSortAscending;
    this.DescriptionGroup = other.DescriptionGroup;
    this.DescriptionGroupFetch = other.DescriptionGroupFetch;
    this.DescriptionGroupSort = other.DescriptionGroupSort;
    this.DescriptionGroupSortAscending = other.DescriptionGroupSortAscending;
    this.DescriptionText = other.DescriptionText;
    this.DescriptionTextFetch = other.DescriptionTextFetch;
    this.DescriptionTextSort = other.DescriptionTextSort;
    this.DescriptionTextCaseInsensitive = other.DescriptionTextCaseInsensitive;
    this.DescriptionTextSortAscending = other.DescriptionTextSortAscending;
    this.ShortDescriptionText = other.ShortDescriptionText;
    this.ShortDescriptionTextFetch = other.ShortDescriptionTextFetch;
    this.ShortDescriptionTextSort = other.ShortDescriptionTextSort;
    this.ShortDescriptionTextCaseInsensitive = other.ShortDescriptionTextCaseInsensitive;
    this.ShortDescriptionTextSortAscending = other.ShortDescriptionTextSortAscending;  }
  /** get the filter for this object's key
   * @return InvoiceDetailObjectKeyFilter
   */
  public InvoiceDetailObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (InvoiceDetailObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefNoFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefNoFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoFetch;
  }
  /** Set the SortOrder for field: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefNoSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefNoSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNoSort;
  }
  /** Set the sort direction for field: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefNoSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefNoSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefNoSortAscending;
  }
  /** Set the field level filters for field: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefNoFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillRefNo = value;
  }
  /** Retrieve filter for field: BillRefNo (BILL_INVOICE_DETAIL.bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefNoFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefNo;
  }
  /** Set the field level Fetch value for field: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setBillRefResetsFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillRefResetsFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsFetch;
  }
  /** Set the SortOrder for field: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillRefResetsSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillRefResetsSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResetsSort;
  }
  /** Set the sort direction for field: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillRefResetsSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillRefResetsSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillRefResetsSortAscending;
  }
  /** Set the field level filters for field: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillRefResetsFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillRefResets = value;
  }
  /** Retrieve filter for field: BillRefResets (BILL_INVOICE_DETAIL.bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillRefResetsFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillRefResets;
  }
  /** Set the field level Fetch value for field: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * @param fetch whether to fetch this field or not
   */
  public void setBillInvoiceRowFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillInvoiceRowFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillInvoiceRowFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.BillInvoiceRowFetch;
  }
  /** Set the SortOrder for field: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillInvoiceRowSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillInvoiceRowSort = value;
  }
  /** Retrieve SortOrder for field: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillInvoiceRowSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.BillInvoiceRowSort;
  }
  /** Set the sort direction for field: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillInvoiceRowSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillInvoiceRowSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillInvoiceRowSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.BillInvoiceRowSortAscending;
  }
  /** Set the field level filters for field: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillInvoiceRowFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.BillInvoiceRow = value;
  }
  /** Retrieve filter for field: BillInvoiceRow (BILL_INVOICE_DETAIL.bill_invoice_row)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillInvoiceRowFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.BillInvoiceRow;
  }
  /** Set the field level Fetch value for field: LanguageCode (DESCRIPTIONS.language_code)
   * @param fetch whether to fetch this field or not
   */
  public void setLanguageCodeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.LanguageCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getLanguageCodeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeFetch;
  }
  /** Set the SortOrder for field: LanguageCode (DESCRIPTIONS.language_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLanguageCodeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.LanguageCodeSort = value;
  }
  /** Retrieve SortOrder for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLanguageCodeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCodeSort;
  }
  /** Set the sort direction for field: LanguageCode (DESCRIPTIONS.language_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLanguageCodeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.LanguageCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLanguageCodeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.LanguageCodeSortAscending;
  }
  /** Set the field level filters for field: LanguageCode (DESCRIPTIONS.language_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLanguageCodeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new InvoiceDetailObjectKeyFilter ();
    this.Key.LanguageCode = value;
  }
  /** Retrieve filter for field: LanguageCode (DESCRIPTIONS.language_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getLanguageCodeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.LanguageCode;
  }
  /** Set the field level Fetch value for field: CurrencyCode (BILL_INVOICE.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (BILL_INVOICE.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (BILL_INVOICE.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (BILL_INVOICE.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (BILL_INVOICE.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (BILL_INVOICE.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (BILL_INVOICE.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (BILL_INVOICE.currency_code)
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


  /** Set the field level Fetch value for field: AccountInternalId (BILL_INVOICE.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (BILL_INVOICE.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (BILL_INVOICE.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (BILL_INVOICE.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (BILL_INVOICE.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (BILL_INVOICE.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (BILL_INVOICE.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (BILL_INVOICE.account_no)
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
  /** Set the field level Fetch value for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @param fetch whether to fetch this field or not
   */
  public void setProcessNumFetch (boolean fetch) {
    this.ProcessNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getProcessNumFetch () {
    return this.ProcessNumFetch;
  }
  /** Set the SortOrder for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProcessNumSortOrder (Integer value) {
    this.ProcessNumSort = value;
  }
  /** Retrieve SortOrder for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProcessNumSortOrder () {
    return this.ProcessNumSort;
  }
  /** Set the sort direction for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProcessNumSortDirection (boolean ascending) {
    this.ProcessNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProcessNumSortDirection () {
    return this.ProcessNumSortAscending;
  }
  /** Set the case insensitive for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setProcessNumCaseInsensitive (boolean ascending) {
    this.ProcessNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getProcessNumCaseInsensitive () {
    return this.ProcessNumCaseInsensitive;
  }
  /** Set the field level filters for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProcessNumFilter (StringFilter[] value) throws ServiceException {
    this.ProcessNum = value;
  }
  /** Retrieve filter for field: ProcessNum (BILL_INVOICE_DETAIL.process_num)
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

  /** Set the field level Fetch value for field: PackageId (BILL_INVOICE_DETAIL.package_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPackageIdFetch (boolean fetch) {
    this.PackageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PackageId (BILL_INVOICE_DETAIL.package_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPackageIdFetch () {
    return this.PackageIdFetch;
  }
  /** Set the SortOrder for field: PackageId (BILL_INVOICE_DETAIL.package_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPackageIdSortOrder (Integer value) {
    this.PackageIdSort = value;
  }
  /** Retrieve SortOrder for field: PackageId (BILL_INVOICE_DETAIL.package_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPackageIdSortOrder () {
    return this.PackageIdSort;
  }
  /** Set the sort direction for field: PackageId (BILL_INVOICE_DETAIL.package_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPackageIdSortDirection (boolean ascending) {
    this.PackageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PackageId (BILL_INVOICE_DETAIL.package_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPackageIdSortDirection () {
    return this.PackageIdSortAscending;
  }
  /** Set the field level filters for field: PackageId (BILL_INVOICE_DETAIL.package_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPackageIdFilter (IntegerFilter[] value) throws ServiceException {
    this.PackageId = value;
  }
  /** Retrieve filter for field: PackageId (BILL_INVOICE_DETAIL.package_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPackageIdFilter () {
    return this.PackageId;
  }

  /**
   * Retrieves the PackageIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PackageIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PackageIdFilter field
   */
  public String[] getPackageIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPackageIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PackageIdFilter filter value from a formatted string
   *
   * @param _value the PackageIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageIdFilter filter field
   */
  public void setPackageIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageIdFilterFromFormattedString");
    try {
      this.setPackageIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated PackageIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the PackageIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the PackageIdFilter filter field
   */
  public String[] getPackageIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPackageIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getPackageIdFilter(), "PackageType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPackageIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPackageIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated PackageIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the PackageIdFilter filter field
   */
  public void setPackageIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPackageIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setPackageIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "PackageId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PackageIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPackageIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPackageIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * @param fetch whether to fetch this field or not
   */
  public void setComponentIdFetch (boolean fetch) {
    this.ComponentIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getComponentIdFetch () {
    return this.ComponentIdFetch;
  }
  /** Set the SortOrder for field: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setComponentIdSortOrder (Integer value) {
    this.ComponentIdSort = value;
  }
  /** Retrieve SortOrder for field: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getComponentIdSortOrder () {
    return this.ComponentIdSort;
  }
  /** Set the sort direction for field: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setComponentIdSortDirection (boolean ascending) {
    this.ComponentIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getComponentIdSortDirection () {
    return this.ComponentIdSortAscending;
  }
  /** Set the field level filters for field: ComponentId (BILL_INVOICE_DETAIL.component_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setComponentIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ComponentId = value;
  }
  /** Retrieve filter for field: ComponentId (BILL_INVOICE_DETAIL.component_id)
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

  /**
   * Retrieves the display value for the enumerated ComponentIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ComponentIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ComponentIdFilter filter field
   */
  public String[] getComponentIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getComponentIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getComponentIdFilter(), "PackageComponentType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getComponentIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getComponentIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ComponentIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ComponentIdFilter filter field
   */
  public void setComponentIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setComponentIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setComponentIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ComponentId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ComponentIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setComponentIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setComponentIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTypeCodeFetch (boolean fetch) {
    this.TypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTypeCodeFetch () {
    return this.TypeCodeFetch;
  }
  /** Set the SortOrder for field: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTypeCodeSortOrder (Integer value) {
    this.TypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTypeCodeSortOrder () {
    return this.TypeCodeSort;
  }
  /** Set the sort direction for field: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTypeCodeSortDirection (boolean ascending) {
    this.TypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTypeCodeSortDirection () {
    return this.TypeCodeSortAscending;
  }
  /** Set the field level filters for field: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TypeCode = value;
  }
  /** Retrieve filter for field: TypeCode (BILL_INVOICE_DETAIL.type_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTypeCodeFilter () {
    return this.TypeCode;
  }

  /**
   * Retrieves the TypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TypeCodeFilter field
   */
  public String[] getTypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TypeCodeFilter filter value from a formatted string
   *
   * @param _value the TypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TypeCodeFilter filter field
   */
  public void setTypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTypeCodeFilterFromFormattedString");
    try {
      this.setTypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTypeCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * @param fetch whether to fetch this field or not
   */
  public void setSubtypeCodeFetch (boolean fetch) {
    this.SubtypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getSubtypeCodeFetch () {
    return this.SubtypeCodeFetch;
  }
  /** Set the SortOrder for field: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSubtypeCodeSortOrder (Integer value) {
    this.SubtypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSubtypeCodeSortOrder () {
    return this.SubtypeCodeSort;
  }
  /** Set the sort direction for field: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSubtypeCodeSortDirection (boolean ascending) {
    this.SubtypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSubtypeCodeSortDirection () {
    return this.SubtypeCodeSortAscending;
  }
  /** Set the field level filters for field: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSubtypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.SubtypeCode = value;
  }
  /** Retrieve filter for field: SubtypeCode (BILL_INVOICE_DETAIL.subtype_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSubtypeCodeFilter () {
    return this.SubtypeCode;
  }

  /**
   * Retrieves the SubtypeCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SubtypeCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SubtypeCodeFilter field
   */
  public String[] getSubtypeCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSubtypeCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSubtypeCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSubtypeCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubtypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSubtypeCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SubtypeCodeFilter filter value from a formatted string
   *
   * @param _value the SubtypeCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SubtypeCodeFilter filter field
   */
  public void setSubtypeCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSubtypeCodeFilterFromFormattedString");
    try {
      this.setSubtypeCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SubtypeCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSubtypeCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSubtypeCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch) {
    this.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch () {
    return this.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value) {
    this.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder () {
    return this.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending) {
    this.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection () {
    return this.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (BILL_INVOICE_DETAIL.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter () {
    return this.TrackingId;
  }

  /**
   * Retrieves the TrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdFilter field
   */
  public String[] getTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdFilter filter value from a formatted string
   *
   * @param _value the TrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdFilter filter field
   */
  public void setTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdFilterFromFormattedString");
    try {
      this.setTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch) {
    this.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch () {
    return this.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value) {
    this.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder () {
    return this.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending) {
    this.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection () {
    return this.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (BILL_INVOICE_DETAIL.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter () {
    return this.TrackingIdServ;
  }

  /**
   * Retrieves the TrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServFilter field
   */
  public String[] getTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingIdServFilter filter value from a formatted string
   *
   * @param _value the TrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingIdServFilter filter field
   */
  public void setTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingIdServFilterFromFormattedString");
    try {
      this.setTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingDateFetch (boolean fetch) {
    this.TrackingDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingDateFetch () {
    return this.TrackingDateFetch;
  }
  /** Set the SortOrder for field: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingDateSortOrder (Integer value) {
    this.TrackingDateSort = value;
  }
  /** Retrieve SortOrder for field: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingDateSortOrder () {
    return this.TrackingDateSort;
  }
  /** Set the sort direction for field: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingDateSortDirection (boolean ascending) {
    this.TrackingDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingDateSortDirection () {
    return this.TrackingDateSortAscending;
  }
  /** Set the field level filters for field: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingDateFilter (DateFilter[] value) throws ServiceException {
    this.TrackingDate = value;
  }
  /** Retrieve filter for field: TrackingDate (BILL_INVOICE_DETAIL.tracking_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTrackingDateFilter () {
    return this.TrackingDate;
  }

  /**
   * Retrieves the TrackingDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingDateFilter field
   */
  public String[] getTrackingDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingDateFilter filter value from a formatted string
   *
   * @param _value the TrackingDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingDateFilter filter field
   */
  public void setTrackingDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingDateFilterFromFormattedString");
    try {
      this.setTrackingDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingDateFilterFromFormattedString");
  }

  /**
   * Retrieves the TrackingDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackingDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingDateFilter field
   */
  public String[] getTrackingDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackingDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TrackingDateFilter filter value from a formatted string
   *
   * @param _value the TrackingDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackingDateFilter filter field
   */
  public void setTrackingDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackingDateFilterFromFormattedDateTimeString");
    try {
      this.setTrackingDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackingDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * @param fetch whether to fetch this field or not
   */
  public void setPrepSequenceFetch (boolean fetch) {
    this.PrepSequenceFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrepSequenceFetch () {
    return this.PrepSequenceFetch;
  }
  /** Set the SortOrder for field: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrepSequenceSortOrder (Integer value) {
    this.PrepSequenceSort = value;
  }
  /** Retrieve SortOrder for field: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrepSequenceSortOrder () {
    return this.PrepSequenceSort;
  }
  /** Set the sort direction for field: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrepSequenceSortDirection (boolean ascending) {
    this.PrepSequenceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrepSequenceSortDirection () {
    return this.PrepSequenceSortAscending;
  }
  /** Set the field level filters for field: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrepSequenceFilter (IntegerFilter[] value) throws ServiceException {
    this.PrepSequence = value;
  }
  /** Retrieve filter for field: PrepSequence (BILL_INVOICE_DETAIL.prep_sequence)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPrepSequenceFilter () {
    return this.PrepSequence;
  }

  /**
   * Retrieves the PrepSequenceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrepSequenceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrepSequenceFilter field
   */
  public String[] getPrepSequenceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrepSequenceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrepSequenceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrepSequenceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepSequenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrepSequenceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrepSequenceFilter filter value from a formatted string
   *
   * @param _value the PrepSequenceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrepSequenceFilter filter field
   */
  public void setPrepSequenceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrepSequenceFilterFromFormattedString");
    try {
      this.setPrepSequenceFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrepSequenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrepSequenceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrepSequenceFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateCodeFetch (boolean fetch) {
    this.ProrateCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateCodeFetch () {
    return this.ProrateCodeFetch;
  }
  /** Set the SortOrder for field: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateCodeSortOrder (Integer value) {
    this.ProrateCodeSort = value;
  }
  /** Retrieve SortOrder for field: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateCodeSortOrder () {
    return this.ProrateCodeSort;
  }
  /** Set the sort direction for field: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateCodeSortDirection (boolean ascending) {
    this.ProrateCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateCodeSortDirection () {
    return this.ProrateCodeSortAscending;
  }
  /** Set the field level filters for field: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.ProrateCode = value;
  }
  /** Retrieve filter for field: ProrateCode (BILL_INVOICE_DETAIL.prorate_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProrateCodeFilter () {
    return this.ProrateCode;
  }

  /**
   * Retrieves the ProrateCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateCodeFilter field
   */
  public String[] getProrateCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateCodeFilter filter value from a formatted string
   *
   * @param _value the ProrateCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateCodeFilter filter field
   */
  public void setProrateCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateCodeFilterFromFormattedString");
    try {
      this.setProrateCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingLevelFetch (boolean fetch) {
    this.BillingLevelFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingLevelFetch () {
    return this.BillingLevelFetch;
  }
  /** Set the SortOrder for field: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingLevelSortOrder (Integer value) {
    this.BillingLevelSort = value;
  }
  /** Retrieve SortOrder for field: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingLevelSortOrder () {
    return this.BillingLevelSort;
  }
  /** Set the sort direction for field: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingLevelSortDirection (boolean ascending) {
    this.BillingLevelSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingLevelSortDirection () {
    return this.BillingLevelSortAscending;
  }
  /** Set the field level filters for field: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingLevelFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingLevel = value;
  }
  /** Retrieve filter for field: BillingLevel (BILL_INVOICE_DETAIL.billing_level)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBillingLevelFilter () {
    return this.BillingLevel;
  }

  /**
   * Retrieves the BillingLevelFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillingLevelFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillingLevelFilter field
   */
  public String[] getBillingLevelFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillingLevelFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillingLevelFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillingLevelFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillingLevelFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillingLevelFilter filter value from a formatted string
   *
   * @param _value the BillingLevelFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillingLevelFilter filter field
   */
  public void setBillingLevelFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillingLevelFilterFromFormattedString");
    try {
      this.setBillingLevelFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillingLevelFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillingLevelFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillingLevelFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   * @param fetch whether to fetch this field or not
   */
  public void setBillingCategoryFetch (boolean fetch) {
    this.BillingCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillingCategoryFetch () {
    return this.BillingCategoryFetch;
  }
  /** Set the SortOrder for field: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillingCategorySortOrder (Integer value) {
    this.BillingCategorySort = value;
  }
  /** Retrieve SortOrder for field: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillingCategorySortOrder () {
    return this.BillingCategorySort;
  }
  /** Set the sort direction for field: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillingCategorySortDirection (boolean ascending) {
    this.BillingCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillingCategorySortDirection () {
    return this.BillingCategorySortAscending;
  }
  /** Set the field level filters for field: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillingCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.BillingCategory = value;
  }
  /** Retrieve filter for field: BillingCategory (BILL_INVOICE_DETAIL.billing_category)
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

  /** Set the field level Fetch value for field: Amount (BILL_INVOICE_DETAIL.amount)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountFetch (boolean fetch) {
    this.AmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Amount (BILL_INVOICE_DETAIL.amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountFetch () {
    return this.AmountFetch;
  }
  /** Set the SortOrder for field: Amount (BILL_INVOICE_DETAIL.amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountSortOrder (Integer value) {
    this.AmountSort = value;
  }
  /** Retrieve SortOrder for field: Amount (BILL_INVOICE_DETAIL.amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountSortOrder () {
    return this.AmountSort;
  }
  /** Set the sort direction for field: Amount (BILL_INVOICE_DETAIL.amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountSortDirection (boolean ascending) {
    this.AmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Amount (BILL_INVOICE_DETAIL.amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountSortDirection () {
    return this.AmountSortAscending;
  }
  /** Set the field level filters for field: Amount (BILL_INVOICE_DETAIL.amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Amount = value;
  }
  /** Retrieve filter for field: Amount (BILL_INVOICE_DETAIL.amount)
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


  /** Set the field level Fetch value for field: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setRatedAmountFetch (boolean fetch) {
    this.RatedAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatedAmountFetch () {
    return this.RatedAmountFetch;
  }
  /** Set the SortOrder for field: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatedAmountSortOrder (Integer value) {
    this.RatedAmountSort = value;
  }
  /** Retrieve SortOrder for field: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatedAmountSortOrder () {
    return this.RatedAmountSort;
  }
  /** Set the sort direction for field: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatedAmountSortDirection (boolean ascending) {
    this.RatedAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatedAmountSortDirection () {
    return this.RatedAmountSortAscending;
  }
  /** Set the field level filters for field: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatedAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.RatedAmount = value;
  }
  /** Retrieve filter for field: RatedAmount (BILL_INVOICE_DETAIL.rated_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getRatedAmountFilter () {
    return this.RatedAmount;
  }

  /**
   * Retrieves the RatedAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatedAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedAmountFilter field
   */
  public String[] getRatedAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatedAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RatedAmountFilter filter value from a formatted string
   *
   * @param _value the RatedAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatedAmountFilter filter field
   */
  public void setRatedAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatedAmountFilterFromFormattedString");
    try {
      this.setRatedAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedAmountFilterFromFormattedString");
  }

  /**
   * Sets the RatedAmountFilter filter value from a formatted string
   *
   * @param _value the RatedAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RatedAmountFilter filter field
   */
  public void setRatedAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRatedAmountFilterFromFormattedCurrencyString");
    try {
      this.setRatedAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRatedAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRatedAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the RatedAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RatedAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the RatedAmountFilter field
   */

  public String[] getRatedAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRatedAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRatedAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRatedAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RatedAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRatedAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setSecondaryAmountFetch (boolean fetch) {
    this.SecondaryAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getSecondaryAmountFetch () {
    return this.SecondaryAmountFetch;
  }
  /** Set the SortOrder for field: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSecondaryAmountSortOrder (Integer value) {
    this.SecondaryAmountSort = value;
  }
  /** Retrieve SortOrder for field: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSecondaryAmountSortOrder () {
    return this.SecondaryAmountSort;
  }
  /** Set the sort direction for field: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSecondaryAmountSortDirection (boolean ascending) {
    this.SecondaryAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSecondaryAmountSortDirection () {
    return this.SecondaryAmountSortAscending;
  }
  /** Set the field level filters for field: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSecondaryAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.SecondaryAmount = value;
  }
  /** Retrieve filter for field: SecondaryAmount (BILL_INVOICE_DETAIL.secondary_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getSecondaryAmountFilter () {
    return this.SecondaryAmount;
  }

  /**
   * Retrieves the SecondaryAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SecondaryAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondaryAmountFilter field
   */
  public String[] getSecondaryAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondaryAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSecondaryAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondaryAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondaryAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondaryAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SecondaryAmountFilter filter value from a formatted string
   *
   * @param _value the SecondaryAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SecondaryAmountFilter filter field
   */
  public void setSecondaryAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSecondaryAmountFilterFromFormattedString");
    try {
      this.setSecondaryAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondaryAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondaryAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecondaryAmountFilterFromFormattedString");
  }

  /**
   * Sets the SecondaryAmountFilter filter value from a formatted string
   *
   * @param _value the SecondaryAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SecondaryAmountFilter filter field
   */
  public void setSecondaryAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSecondaryAmountFilterFromFormattedCurrencyString");
    try {
      this.setSecondaryAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondaryAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSecondaryAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSecondaryAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the SecondaryAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SecondaryAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the SecondaryAmountFilter field
   */

  public String[] getSecondaryAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSecondaryAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSecondaryAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSecondaryAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SecondaryAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSecondaryAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setRateCurrencyCodeFetch (boolean fetch) {
    this.RateCurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateCurrencyCodeFetch () {
    return this.RateCurrencyCodeFetch;
  }
  /** Set the SortOrder for field: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateCurrencyCodeSortOrder (Integer value) {
    this.RateCurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateCurrencyCodeSortOrder () {
    return this.RateCurrencyCodeSort;
  }
  /** Set the sort direction for field: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateCurrencyCodeSortDirection (boolean ascending) {
    this.RateCurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateCurrencyCodeSortDirection () {
    return this.RateCurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.RateCurrencyCode = value;
  }
  /** Retrieve filter for field: RateCurrencyCode (BILL_INVOICE_DETAIL.rate_currency_code)
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


  /** Set the field level Fetch value for field: Units (BILL_INVOICE_DETAIL.units)
   * @param fetch whether to fetch this field or not
   */
  public void setUnitsFetch (boolean fetch) {
    this.UnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: Units (BILL_INVOICE_DETAIL.units)
   * @return boolean the Fetch value for this field
   */
  public boolean getUnitsFetch () {
    return this.UnitsFetch;
  }
  /** Set the SortOrder for field: Units (BILL_INVOICE_DETAIL.units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setUnitsSortOrder (Integer value) {
    this.UnitsSort = value;
  }
  /** Retrieve SortOrder for field: Units (BILL_INVOICE_DETAIL.units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getUnitsSortOrder () {
    return this.UnitsSort;
  }
  /** Set the sort direction for field: Units (BILL_INVOICE_DETAIL.units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setUnitsSortDirection (boolean ascending) {
    this.UnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Units (BILL_INVOICE_DETAIL.units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getUnitsSortDirection () {
    return this.UnitsSortAscending;
  }
  /** Set the field level filters for field: Units (BILL_INVOICE_DETAIL.units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setUnitsFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Units = value;
  }
  /** Retrieve filter for field: Units (BILL_INVOICE_DETAIL.units)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getUnitsFilter () {
    return this.Units;
  }

  /**
   * Retrieves the UnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The UnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UnitsFilter field
   */
  public String[] getUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the UnitsFilter filter value from a formatted string
   *
   * @param _value the UnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the UnitsFilter filter field
   */
  public void setUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setUnitsFilterFromFormattedString");
    try {
      this.setUnitsFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("UnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Tax (BILL_INVOICE_DETAIL.tax)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxFetch (boolean fetch) {
    this.TaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: Tax (BILL_INVOICE_DETAIL.tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxFetch () {
    return this.TaxFetch;
  }
  /** Set the SortOrder for field: Tax (BILL_INVOICE_DETAIL.tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxSortOrder (Integer value) {
    this.TaxSort = value;
  }
  /** Retrieve SortOrder for field: Tax (BILL_INVOICE_DETAIL.tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxSortOrder () {
    return this.TaxSort;
  }
  /** Set the sort direction for field: Tax (BILL_INVOICE_DETAIL.tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxSortDirection (boolean ascending) {
    this.TaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Tax (BILL_INVOICE_DETAIL.tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxSortDirection () {
    return this.TaxSortAscending;
  }
  /** Set the field level filters for field: Tax (BILL_INVOICE_DETAIL.tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Tax = value;
  }
  /** Retrieve filter for field: Tax (BILL_INVOICE_DETAIL.tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTaxFilter () {
    return this.Tax;
  }

  /**
   * Retrieves the TaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxFilter field
   */
  public String[] getTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TaxFilter filter value from a formatted string
   *
   * @param _value the TaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxFilter filter field
   */
  public void setTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxFilterFromFormattedString");
    try {
      this.setTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxFilterFromFormattedString");
  }

  /**
   * Sets the TaxFilter filter value from a formatted string
   *
   * @param _value the TaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TaxFilter filter field
   */
  public void setTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTaxFilterFromFormattedCurrencyString");
    try {
      this.setTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TaxFilter field
   */

  public String[] getTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxRateFetch (boolean fetch) {
    this.TaxRateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxRateFetch () {
    return this.TaxRateFetch;
  }
  /** Set the SortOrder for field: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxRateSortOrder (Integer value) {
    this.TaxRateSort = value;
  }
  /** Retrieve SortOrder for field: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxRateSortOrder () {
    return this.TaxRateSort;
  }
  /** Set the sort direction for field: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxRateSortDirection (boolean ascending) {
    this.TaxRateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxRateSortDirection () {
    return this.TaxRateSortAscending;
  }
  /** Set the field level filters for field: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxRateFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxRate = value;
  }
  /** Retrieve filter for field: TaxRate (BILL_INVOICE_DETAIL.tax_rate)
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

  /** Set the field level Fetch value for field: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxPkgInstIdFetch (boolean fetch) {
    this.TaxPkgInstIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxPkgInstIdFetch () {
    return this.TaxPkgInstIdFetch;
  }
  /** Set the SortOrder for field: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxPkgInstIdSortOrder (Integer value) {
    this.TaxPkgInstIdSort = value;
  }
  /** Retrieve SortOrder for field: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxPkgInstIdSortOrder () {
    return this.TaxPkgInstIdSort;
  }
  /** Set the sort direction for field: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxPkgInstIdSortDirection (boolean ascending) {
    this.TaxPkgInstIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxPkgInstIdSortDirection () {
    return this.TaxPkgInstIdSortAscending;
  }
  /** Set the field level filters for field: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxPkgInstIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxPkgInstId = value;
  }
  /** Retrieve filter for field: TaxPkgInstId (BILL_INVOICE_DETAIL.tax_pkg_inst_id)
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


  /** Set the field level Fetch value for field: Discount (BILL_INVOICE_DETAIL.discount)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountFetch (boolean fetch) {
    this.DiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: Discount (BILL_INVOICE_DETAIL.discount)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountFetch () {
    return this.DiscountFetch;
  }
  /** Set the SortOrder for field: Discount (BILL_INVOICE_DETAIL.discount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountSortOrder (Integer value) {
    this.DiscountSort = value;
  }
  /** Retrieve SortOrder for field: Discount (BILL_INVOICE_DETAIL.discount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountSortOrder () {
    return this.DiscountSort;
  }
  /** Set the sort direction for field: Discount (BILL_INVOICE_DETAIL.discount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountSortDirection (boolean ascending) {
    this.DiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Discount (BILL_INVOICE_DETAIL.discount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountSortDirection () {
    return this.DiscountSortAscending;
  }
  /** Set the field level filters for field: Discount (BILL_INVOICE_DETAIL.discount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.Discount = value;
  }
  /** Retrieve filter for field: Discount (BILL_INVOICE_DETAIL.discount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getDiscountFilter () {
    return this.Discount;
  }

  /**
   * Retrieves the DiscountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountFilter field
   */
  public String[] getDiscountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountFilter filter value from a formatted string
   *
   * @param _value the DiscountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountFilter filter field
   */
  public void setDiscountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountFilterFromFormattedString");
    try {
      this.setDiscountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated DiscountFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the DiscountFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the DiscountFilter filter field
   */
  public String[] getDiscountFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getDiscountFilter(), "DiscountType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated DiscountFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountFilter filter field
   */
  public void setDiscountFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setDiscountFilter((BigIntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "Discount", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountFilterFromDisplayValue");
  }


  /**
   * Sets the DiscountFilter filter value from a formatted string
   *
   * @param _value the DiscountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountFilter filter field
   */
  public void setDiscountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountFilterFromFormattedCurrencyString");
    try {
      this.setDiscountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the DiscountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountFilter field
   */

  public String[] getDiscountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountIdFetch (boolean fetch) {
    this.DiscountIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountIdFetch () {
    return this.DiscountIdFetch;
  }
  /** Set the SortOrder for field: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountIdSortOrder (Integer value) {
    this.DiscountIdSort = value;
  }
  /** Retrieve SortOrder for field: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountIdSortOrder () {
    return this.DiscountIdSort;
  }
  /** Set the sort direction for field: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountIdSortDirection (boolean ascending) {
    this.DiscountIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountIdSortDirection () {
    return this.DiscountIdSortAscending;
  }
  /** Set the field level filters for field: DiscountId (BILL_INVOICE_DETAIL.discount_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountIdFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscountId = value;
  }
  /** Retrieve filter for field: DiscountId (BILL_INVOICE_DETAIL.discount_id)
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

  /** Set the field level Fetch value for field: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDateFetch (boolean fetch) {
    this.TransDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDateFetch () {
    return this.TransDateFetch;
  }
  /** Set the SortOrder for field: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDateSortOrder (Integer value) {
    this.TransDateSort = value;
  }
  /** Retrieve SortOrder for field: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDateSortOrder () {
    return this.TransDateSort;
  }
  /** Set the sort direction for field: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDateSortDirection (boolean ascending) {
    this.TransDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDateSortDirection () {
    return this.TransDateSortAscending;
  }
  /** Set the field level filters for field: TransDate (BILL_INVOICE_DETAIL.trans_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDateFilter (DateFilter[] value) throws ServiceException {
    this.TransDate = value;
  }
  /** Retrieve filter for field: TransDate (BILL_INVOICE_DETAIL.trans_date)
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


  /** Set the field level Fetch value for field: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProviderIdFetch (boolean fetch) {
    this.ProviderIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProviderIdFetch () {
    return this.ProviderIdFetch;
  }
  /** Set the SortOrder for field: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProviderIdSortOrder (Integer value) {
    this.ProviderIdSort = value;
  }
  /** Retrieve SortOrder for field: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProviderIdSortOrder () {
    return this.ProviderIdSort;
  }
  /** Set the sort direction for field: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProviderIdSortDirection (boolean ascending) {
    this.ProviderIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProviderIdSortDirection () {
    return this.ProviderIdSortAscending;
  }
  /** Set the field level filters for field: ProviderId (BILL_INVOICE_DETAIL.provider_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProviderIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ProviderId = value;
  }
  /** Retrieve filter for field: ProviderId (BILL_INVOICE_DETAIL.provider_id)
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


  /** Set the field level Fetch value for field: ElementId (BILL_INVOICE_DETAIL.element_id)
   * @param fetch whether to fetch this field or not
   */
  public void setElementIdFetch (boolean fetch) {
    this.ElementIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ElementId (BILL_INVOICE_DETAIL.element_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getElementIdFetch () {
    return this.ElementIdFetch;
  }
  /** Set the SortOrder for field: ElementId (BILL_INVOICE_DETAIL.element_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setElementIdSortOrder (Integer value) {
    this.ElementIdSort = value;
  }
  /** Retrieve SortOrder for field: ElementId (BILL_INVOICE_DETAIL.element_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getElementIdSortOrder () {
    return this.ElementIdSort;
  }
  /** Set the sort direction for field: ElementId (BILL_INVOICE_DETAIL.element_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setElementIdSortDirection (boolean ascending) {
    this.ElementIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ElementId (BILL_INVOICE_DETAIL.element_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getElementIdSortDirection () {
    return this.ElementIdSortAscending;
  }
  /** Set the field level filters for field: ElementId (BILL_INVOICE_DETAIL.element_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setElementIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ElementId = value;
  }
  /** Retrieve filter for field: ElementId (BILL_INVOICE_DETAIL.element_id)
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


  /** Set the field level Fetch value for field: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProductLineIdFetch (boolean fetch) {
    this.ProductLineIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProductLineIdFetch () {
    return this.ProductLineIdFetch;
  }
  /** Set the SortOrder for field: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProductLineIdSortOrder (Integer value) {
    this.ProductLineIdSort = value;
  }
  /** Retrieve SortOrder for field: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProductLineIdSortOrder () {
    return this.ProductLineIdSort;
  }
  /** Set the sort direction for field: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProductLineIdSortDirection (boolean ascending) {
    this.ProductLineIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProductLineIdSortDirection () {
    return this.ProductLineIdSortAscending;
  }
  /** Set the field level filters for field: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProductLineIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ProductLineId = value;
  }
  /** Retrieve filter for field: ProductLineId (BILL_INVOICE_DETAIL.product_line_id)
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

  /**
   * Retrieves the display value for the enumerated ProductLineIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ProductLineIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ProductLineIdFilter filter field
   */
  public String[] getProductLineIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProductLineIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getProductLineIdFilter(), "ProductLines", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProductLineIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProductLineIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProductLineIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ProductLineIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ProductLineIdFilter filter field
   */
  public void setProductLineIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProductLineIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setProductLineIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ProductLineId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProductLineIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProductLineIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProductLineIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionCodeFetch (boolean fetch) {
    this.DescriptionCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionCodeFetch () {
    return this.DescriptionCodeFetch;
  }
  /** Set the SortOrder for field: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionCodeSortOrder (Integer value) {
    this.DescriptionCodeSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionCodeSortOrder () {
    return this.DescriptionCodeSort;
  }
  /** Set the sort direction for field: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionCodeSortDirection (boolean ascending) {
    this.DescriptionCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionCodeSortDirection () {
    return this.DescriptionCodeSortAscending;
  }
  /** Set the field level filters for field: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.DescriptionCode = value;
  }
  /** Retrieve filter for field: DescriptionCode (BILL_INVOICE_DETAIL.description_code)
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

  /** Set the field level Fetch value for field: RateType (BILL_INVOICE_DETAIL.rate_type)
   * @param fetch whether to fetch this field or not
   */
  public void setRateTypeFetch (boolean fetch) {
    this.RateTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: RateType (BILL_INVOICE_DETAIL.rate_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getRateTypeFetch () {
    return this.RateTypeFetch;
  }
  /** Set the SortOrder for field: RateType (BILL_INVOICE_DETAIL.rate_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRateTypeSortOrder (Integer value) {
    this.RateTypeSort = value;
  }
  /** Retrieve SortOrder for field: RateType (BILL_INVOICE_DETAIL.rate_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRateTypeSortOrder () {
    return this.RateTypeSort;
  }
  /** Set the sort direction for field: RateType (BILL_INVOICE_DETAIL.rate_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRateTypeSortDirection (boolean ascending) {
    this.RateTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RateType (BILL_INVOICE_DETAIL.rate_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRateTypeSortDirection () {
    return this.RateTypeSortAscending;
  }
  /** Set the field level filters for field: RateType (BILL_INVOICE_DETAIL.rate_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRateTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.RateType = value;
  }
  /** Retrieve filter for field: RateType (BILL_INVOICE_DETAIL.rate_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRateTypeFilter () {
    return this.RateType;
  }

  /**
   * Retrieves the RateTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RateTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateTypeFilter field
   */
  public String[] getRateTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRateTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RateTypeFilter filter value from a formatted string
   *
   * @param _value the RateTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RateTypeFilter filter field
   */
  public void setRateTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRateTypeFilterFromFormattedString");
    try {
      this.setRateTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RateTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @param fetch whether to fetch this field or not
   */
  public void setRatePeriodFetch (boolean fetch) {
    this.RatePeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getRatePeriodFetch () {
    return this.RatePeriodFetch;
  }
  /** Set the SortOrder for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRatePeriodSortOrder (Integer value) {
    this.RatePeriodSort = value;
  }
  /** Retrieve SortOrder for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRatePeriodSortOrder () {
    return this.RatePeriodSort;
  }
  /** Set the sort direction for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRatePeriodSortDirection (boolean ascending) {
    this.RatePeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRatePeriodSortDirection () {
    return this.RatePeriodSortAscending;
  }
  /** Set the case insensitive for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setRatePeriodCaseInsensitive (boolean ascending) {
    this.RatePeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getRatePeriodCaseInsensitive () {
    return this.RatePeriodCaseInsensitive;
  }
  /** Set the field level filters for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRatePeriodFilter (StringFilter[] value) throws ServiceException {
    this.RatePeriod = value;
  }
  /** Retrieve filter for field: RatePeriod (BILL_INVOICE_DETAIL.rate_period)
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

  /** Set the field level Fetch value for field: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdFetch (boolean fetch) {
    this.ServiceInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdFetch () {
    return this.ServiceInternalIdFetch;
  }
  /** Set the SortOrder for field: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdSortOrder (Integer value) {
    this.ServiceInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdSortOrder () {
    return this.ServiceInternalIdSort;
  }
  /** Set the sort direction for field: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdSortDirection (boolean ascending) {
    this.ServiceInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdSortDirection () {
    return this.ServiceInternalIdSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalId = value;
  }
  /** Retrieve filter for field: ServiceInternalId (BILL_INVOICE_DETAIL.subscr_no)
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

  /** Set the field level Fetch value for field: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setServiceInternalIdResetsFetch (boolean fetch) {
    this.ServiceInternalIdResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getServiceInternalIdResetsFetch () {
    return this.ServiceInternalIdResetsFetch;
  }
  /** Set the SortOrder for field: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setServiceInternalIdResetsSortOrder (Integer value) {
    this.ServiceInternalIdResetsSort = value;
  }
  /** Retrieve SortOrder for field: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getServiceInternalIdResetsSortOrder () {
    return this.ServiceInternalIdResetsSort;
  }
  /** Set the sort direction for field: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setServiceInternalIdResetsSortDirection (boolean ascending) {
    this.ServiceInternalIdResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getServiceInternalIdResetsSortDirection () {
    return this.ServiceInternalIdResetsSortAscending;
  }
  /** Set the field level filters for field: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setServiceInternalIdResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.ServiceInternalIdResets = value;
  }
  /** Retrieve filter for field: ServiceInternalIdResets (BILL_INVOICE_DETAIL.subscr_no_resets)
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

  /** Set the field level Fetch value for field: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * @param fetch whether to fetch this field or not
   */
  public void setEquipStatusFetch (boolean fetch) {
    this.EquipStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getEquipStatusFetch () {
    return this.EquipStatusFetch;
  }
  /** Set the SortOrder for field: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEquipStatusSortOrder (Integer value) {
    this.EquipStatusSort = value;
  }
  /** Retrieve SortOrder for field: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEquipStatusSortOrder () {
    return this.EquipStatusSort;
  }
  /** Set the sort direction for field: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEquipStatusSortDirection (boolean ascending) {
    this.EquipStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEquipStatusSortDirection () {
    return this.EquipStatusSortAscending;
  }
  /** Set the field level filters for field: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEquipStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.EquipStatus = value;
  }
  /** Retrieve filter for field: EquipStatus (BILL_INVOICE_DETAIL.equip_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getEquipStatusFilter () {
    return this.EquipStatus;
  }

  /**
   * Retrieves the EquipStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EquipStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EquipStatusFilter field
   */
  public String[] getEquipStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEquipStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEquipStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEquipStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEquipStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EquipStatusFilter filter value from a formatted string
   *
   * @param _value the EquipStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EquipStatusFilter filter field
   */
  public void setEquipStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEquipStatusFilterFromFormattedString");
    try {
      this.setEquipStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EquipStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEquipStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEquipStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FromDate (BILL_INVOICE_DETAIL.from_date)
   * @param fetch whether to fetch this field or not
   */
  public void setFromDateFetch (boolean fetch) {
    this.FromDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: FromDate (BILL_INVOICE_DETAIL.from_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getFromDateFetch () {
    return this.FromDateFetch;
  }
  /** Set the SortOrder for field: FromDate (BILL_INVOICE_DETAIL.from_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFromDateSortOrder (Integer value) {
    this.FromDateSort = value;
  }
  /** Retrieve SortOrder for field: FromDate (BILL_INVOICE_DETAIL.from_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFromDateSortOrder () {
    return this.FromDateSort;
  }
  /** Set the sort direction for field: FromDate (BILL_INVOICE_DETAIL.from_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFromDateSortDirection (boolean ascending) {
    this.FromDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FromDate (BILL_INVOICE_DETAIL.from_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFromDateSortDirection () {
    return this.FromDateSortAscending;
  }
  /** Set the field level filters for field: FromDate (BILL_INVOICE_DETAIL.from_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFromDateFilter (DateFilter[] value) throws ServiceException {
    this.FromDate = value;
  }
  /** Retrieve filter for field: FromDate (BILL_INVOICE_DETAIL.from_date)
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


  /** Set the field level Fetch value for field: ToDate (BILL_INVOICE_DETAIL.to_date)
   * @param fetch whether to fetch this field or not
   */
  public void setToDateFetch (boolean fetch) {
    this.ToDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ToDate (BILL_INVOICE_DETAIL.to_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getToDateFetch () {
    return this.ToDateFetch;
  }
  /** Set the SortOrder for field: ToDate (BILL_INVOICE_DETAIL.to_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setToDateSortOrder (Integer value) {
    this.ToDateSort = value;
  }
  /** Retrieve SortOrder for field: ToDate (BILL_INVOICE_DETAIL.to_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getToDateSortOrder () {
    return this.ToDateSort;
  }
  /** Set the sort direction for field: ToDate (BILL_INVOICE_DETAIL.to_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setToDateSortDirection (boolean ascending) {
    this.ToDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ToDate (BILL_INVOICE_DETAIL.to_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getToDateSortDirection () {
    return this.ToDateSortAscending;
  }
  /** Set the field level filters for field: ToDate (BILL_INVOICE_DETAIL.to_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setToDateFilter (DateFilter[] value) throws ServiceException {
    this.ToDate = value;
  }
  /** Retrieve filter for field: ToDate (BILL_INVOICE_DETAIL.to_date)
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


  /** Set the field level Fetch value for field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationFetch (boolean fetch) {
    this.AnnotationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationFetch () {
    return this.AnnotationFetch;
  }
  /** Set the SortOrder for field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationSortOrder (Integer value) {
    this.AnnotationSort = value;
  }
  /** Retrieve SortOrder for field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationSortOrder () {
    return this.AnnotationSort;
  }
  /** Set the sort direction for field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationSortDirection (boolean ascending) {
    this.AnnotationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationSortDirection () {
    return this.AnnotationSortAscending;
  }
  /** Set the case insensitive for field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAnnotationCaseInsensitive (boolean ascending) {
    this.AnnotationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAnnotationCaseInsensitive () {
    return this.AnnotationCaseInsensitive;
  }
  /** Set the field level filters for field: Annotation (BILL_INVOICE_DETAIL.annotation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationFilter (StringFilter[] value) throws ServiceException {
    this.Annotation = value;
  }
  /** Retrieve filter for field: Annotation (BILL_INVOICE_DETAIL.annotation)
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

  /** Set the field level Fetch value for field: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdFetch (boolean fetch) {
    this.ProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdFetch () {
    return this.ProfileIdFetch;
  }
  /** Set the SortOrder for field: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdSortOrder (Integer value) {
    this.ProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdSortOrder () {
    return this.ProfileIdSort;
  }
  /** Set the sort direction for field: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdSortDirection (boolean ascending) {
    this.ProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdSortDirection () {
    return this.ProfileIdSortAscending;
  }
  /** Set the field level filters for field: ProfileId (BILL_INVOICE_DETAIL.profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ProfileId = value;
  }
  /** Retrieve filter for field: ProfileId (BILL_INVOICE_DETAIL.profile_id)
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

  /** Set the field level Fetch value for field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * @param fetch whether to fetch this field or not
   */
  public void setGeocodeFetch (boolean fetch) {
    this.GeocodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * @return boolean the Fetch value for this field
   */
  public boolean getGeocodeFetch () {
    return this.GeocodeFetch;
  }
  /** Set the SortOrder for field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGeocodeSortOrder (Integer value) {
    this.GeocodeSort = value;
  }
  /** Retrieve SortOrder for field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGeocodeSortOrder () {
    return this.GeocodeSort;
  }
  /** Set the sort direction for field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGeocodeSortDirection (boolean ascending) {
    this.GeocodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGeocodeSortDirection () {
    return this.GeocodeSortAscending;
  }
  /** Set the case insensitive for field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setGeocodeCaseInsensitive (boolean ascending) {
    this.GeocodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getGeocodeCaseInsensitive () {
    return this.GeocodeCaseInsensitive;
  }
  /** Set the field level filters for field: Geocode (BILL_INVOICE_DETAIL.geocode)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGeocodeFilter (StringFilter[] value) throws ServiceException {
    this.Geocode = value;
  }
  /** Retrieve filter for field: Geocode (BILL_INVOICE_DETAIL.geocode)
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

  /** Set the field level Fetch value for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * @param fetch whether to fetch this field or not
   */
  public void setAuxTaxInfoFetch (boolean fetch) {
    this.AuxTaxInfoFetch = fetch;
  }
  /** Retrieve Fetch value for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * @return boolean the Fetch value for this field
   */
  public boolean getAuxTaxInfoFetch () {
    return this.AuxTaxInfoFetch;
  }
  /** Set the SortOrder for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAuxTaxInfoSortOrder (Integer value) {
    this.AuxTaxInfoSort = value;
  }
  /** Retrieve SortOrder for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAuxTaxInfoSortOrder () {
    return this.AuxTaxInfoSort;
  }
  /** Set the sort direction for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAuxTaxInfoSortDirection (boolean ascending) {
    this.AuxTaxInfoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAuxTaxInfoSortDirection () {
    return this.AuxTaxInfoSortAscending;
  }
  /** Set the case insensitive for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAuxTaxInfoCaseInsensitive (boolean ascending) {
    this.AuxTaxInfoCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAuxTaxInfoCaseInsensitive () {
    return this.AuxTaxInfoCaseInsensitive;
  }
  /** Set the field level filters for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAuxTaxInfoFilter (StringFilter[] value) throws ServiceException {
    this.AuxTaxInfo = value;
  }
  /** Retrieve filter for field: AuxTaxInfo (BILL_INVOICE_DETAIL.aux_tax_info)
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

  /** Set the field level Fetch value for field: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setFederalTaxFetch (boolean fetch) {
    this.FederalTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getFederalTaxFetch () {
    return this.FederalTaxFetch;
  }
  /** Set the SortOrder for field: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFederalTaxSortOrder (Integer value) {
    this.FederalTaxSort = value;
  }
  /** Retrieve SortOrder for field: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFederalTaxSortOrder () {
    return this.FederalTaxSort;
  }
  /** Set the sort direction for field: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFederalTaxSortDirection (boolean ascending) {
    this.FederalTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFederalTaxSortDirection () {
    return this.FederalTaxSortAscending;
  }
  /** Set the field level filters for field: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFederalTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.FederalTax = value;
  }
  /** Retrieve filter for field: FederalTax (BILL_INVOICE_DETAIL.federal_tax)
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


  /** Set the field level Fetch value for field: StateTax (BILL_INVOICE_DETAIL.state_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setStateTaxFetch (boolean fetch) {
    this.StateTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: StateTax (BILL_INVOICE_DETAIL.state_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getStateTaxFetch () {
    return this.StateTaxFetch;
  }
  /** Set the SortOrder for field: StateTax (BILL_INVOICE_DETAIL.state_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStateTaxSortOrder (Integer value) {
    this.StateTaxSort = value;
  }
  /** Retrieve SortOrder for field: StateTax (BILL_INVOICE_DETAIL.state_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStateTaxSortOrder () {
    return this.StateTaxSort;
  }
  /** Set the sort direction for field: StateTax (BILL_INVOICE_DETAIL.state_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStateTaxSortDirection (boolean ascending) {
    this.StateTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StateTax (BILL_INVOICE_DETAIL.state_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStateTaxSortDirection () {
    return this.StateTaxSortAscending;
  }
  /** Set the field level filters for field: StateTax (BILL_INVOICE_DETAIL.state_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStateTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.StateTax = value;
  }
  /** Retrieve filter for field: StateTax (BILL_INVOICE_DETAIL.state_tax)
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


  /** Set the field level Fetch value for field: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setCountyTaxFetch (boolean fetch) {
    this.CountyTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getCountyTaxFetch () {
    return this.CountyTaxFetch;
  }
  /** Set the SortOrder for field: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCountyTaxSortOrder (Integer value) {
    this.CountyTaxSort = value;
  }
  /** Retrieve SortOrder for field: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCountyTaxSortOrder () {
    return this.CountyTaxSort;
  }
  /** Set the sort direction for field: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCountyTaxSortDirection (boolean ascending) {
    this.CountyTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCountyTaxSortDirection () {
    return this.CountyTaxSortAscending;
  }
  /** Set the field level filters for field: CountyTax (BILL_INVOICE_DETAIL.county_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCountyTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CountyTax = value;
  }
  /** Retrieve filter for field: CountyTax (BILL_INVOICE_DETAIL.county_tax)
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


  /** Set the field level Fetch value for field: CityTax (BILL_INVOICE_DETAIL.city_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setCityTaxFetch (boolean fetch) {
    this.CityTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: CityTax (BILL_INVOICE_DETAIL.city_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getCityTaxFetch () {
    return this.CityTaxFetch;
  }
  /** Set the SortOrder for field: CityTax (BILL_INVOICE_DETAIL.city_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCityTaxSortOrder (Integer value) {
    this.CityTaxSort = value;
  }
  /** Retrieve SortOrder for field: CityTax (BILL_INVOICE_DETAIL.city_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCityTaxSortOrder () {
    return this.CityTaxSort;
  }
  /** Set the sort direction for field: CityTax (BILL_INVOICE_DETAIL.city_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCityTaxSortDirection (boolean ascending) {
    this.CityTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CityTax (BILL_INVOICE_DETAIL.city_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCityTaxSortDirection () {
    return this.CityTaxSortAscending;
  }
  /** Set the field level filters for field: CityTax (BILL_INVOICE_DETAIL.city_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCityTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CityTax = value;
  }
  /** Retrieve filter for field: CityTax (BILL_INVOICE_DETAIL.city_tax)
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


  /** Set the field level Fetch value for field: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setOtherTaxFetch (boolean fetch) {
    this.OtherTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getOtherTaxFetch () {
    return this.OtherTaxFetch;
  }
  /** Set the SortOrder for field: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOtherTaxSortOrder (Integer value) {
    this.OtherTaxSort = value;
  }
  /** Retrieve SortOrder for field: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOtherTaxSortOrder () {
    return this.OtherTaxSort;
  }
  /** Set the sort direction for field: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOtherTaxSortDirection (boolean ascending) {
    this.OtherTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOtherTaxSortDirection () {
    return this.OtherTaxSortAscending;
  }
  /** Set the field level filters for field: OtherTax (BILL_INVOICE_DETAIL.other_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOtherTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.OtherTax = value;
  }
  /** Retrieve filter for field: OtherTax (BILL_INVOICE_DETAIL.other_tax)
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


  /** Set the field level Fetch value for field: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setTestFlagFetch (boolean fetch) {
    this.TestFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getTestFlagFetch () {
    return this.TestFlagFetch;
  }
  /** Set the SortOrder for field: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTestFlagSortOrder (Integer value) {
    this.TestFlagSort = value;
  }
  /** Retrieve SortOrder for field: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTestFlagSortOrder () {
    return this.TestFlagSort;
  }
  /** Set the sort direction for field: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTestFlagSortDirection (boolean ascending) {
    this.TestFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTestFlagSortDirection () {
    return this.TestFlagSortAscending;
  }
  /** Set the field level filters for field: TestFlag (BILL_INVOICE_DETAIL.test_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTestFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.TestFlag = value;
  }
  /** Retrieve filter for field: TestFlag (BILL_INVOICE_DETAIL.test_flag)
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

  /** Set the field level Fetch value for field: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setArchFlagFetch (boolean fetch) {
    this.ArchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getArchFlagFetch () {
    return this.ArchFlagFetch;
  }
  /** Set the SortOrder for field: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArchFlagSortOrder (Integer value) {
    this.ArchFlagSort = value;
  }
  /** Retrieve SortOrder for field: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArchFlagSortOrder () {
    return this.ArchFlagSort;
  }
  /** Set the sort direction for field: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArchFlagSortDirection (boolean ascending) {
    this.ArchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArchFlagSortDirection () {
    return this.ArchFlagSortAscending;
  }
  /** Set the field level filters for field: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ArchFlag = value;
  }
  /** Retrieve filter for field: ArchFlag (BILL_INVOICE_DETAIL.arch_flag)
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

  /** Set the field level Fetch value for field: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   * @param fetch whether to fetch this field or not
   */
  public void setRevRcvCostCtrFetch (boolean fetch) {
    this.RevRcvCostCtrFetch = fetch;
  }
  /** Retrieve Fetch value for field: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   * @return boolean the Fetch value for this field
   */
  public boolean getRevRcvCostCtrFetch () {
    return this.RevRcvCostCtrFetch;
  }
  /** Set the SortOrder for field: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRevRcvCostCtrSortOrder (Integer value) {
    this.RevRcvCostCtrSort = value;
  }
  /** Retrieve SortOrder for field: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRevRcvCostCtrSortOrder () {
    return this.RevRcvCostCtrSort;
  }
  /** Set the sort direction for field: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRevRcvCostCtrSortDirection (boolean ascending) {
    this.RevRcvCostCtrSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRevRcvCostCtrSortDirection () {
    return this.RevRcvCostCtrSortAscending;
  }
  /** Set the field level filters for field: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRevRcvCostCtrFilter (IntegerFilter[] value) throws ServiceException {
    this.RevRcvCostCtr = value;
  }
  /** Retrieve filter for field: RevRcvCostCtr (BILL_INVOICE_DETAIL.rev_rcv_cost_ctr)
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


  /** Set the field level Fetch value for field: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   * @param fetch whether to fetch this field or not
   */
  public void setBRevRcvCostCtrFetch (boolean fetch) {
    this.BRevRcvCostCtrFetch = fetch;
  }
  /** Retrieve Fetch value for field: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   * @return boolean the Fetch value for this field
   */
  public boolean getBRevRcvCostCtrFetch () {
    return this.BRevRcvCostCtrFetch;
  }
  /** Set the SortOrder for field: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBRevRcvCostCtrSortOrder (Integer value) {
    this.BRevRcvCostCtrSort = value;
  }
  /** Retrieve SortOrder for field: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBRevRcvCostCtrSortOrder () {
    return this.BRevRcvCostCtrSort;
  }
  /** Set the sort direction for field: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBRevRcvCostCtrSortDirection (boolean ascending) {
    this.BRevRcvCostCtrSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBRevRcvCostCtrSortDirection () {
    return this.BRevRcvCostCtrSortAscending;
  }
  /** Set the field level filters for field: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBRevRcvCostCtrFilter (IntegerFilter[] value) throws ServiceException {
    this.BRevRcvCostCtr = value;
  }
  /** Retrieve filter for field: BRevRcvCostCtr (BILL_INVOICE_DETAIL.b_rev_rcv_cost_ctr)
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


  /** Set the field level Fetch value for field: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAggrUsageIdFetch (boolean fetch) {
    this.AggrUsageIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAggrUsageIdFetch () {
    return this.AggrUsageIdFetch;
  }
  /** Set the SortOrder for field: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAggrUsageIdSortOrder (Integer value) {
    this.AggrUsageIdSort = value;
  }
  /** Retrieve SortOrder for field: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAggrUsageIdSortOrder () {
    return this.AggrUsageIdSort;
  }
  /** Set the sort direction for field: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAggrUsageIdSortDirection (boolean ascending) {
    this.AggrUsageIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAggrUsageIdSortDirection () {
    return this.AggrUsageIdSortAscending;
  }
  /** Set the field level filters for field: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAggrUsageIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AggrUsageId = value;
  }
  /** Retrieve filter for field: AggrUsageId (BILL_INVOICE_DETAIL.aggr_usage_id)
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

  /** Set the field level Fetch value for field: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   * @param fetch whether to fetch this field or not
   */
  public void setTaxTypeCodeFetch (boolean fetch) {
    this.TaxTypeCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getTaxTypeCodeFetch () {
    return this.TaxTypeCodeFetch;
  }
  /** Set the SortOrder for field: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTaxTypeCodeSortOrder (Integer value) {
    this.TaxTypeCodeSort = value;
  }
  /** Retrieve SortOrder for field: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTaxTypeCodeSortOrder () {
    return this.TaxTypeCodeSort;
  }
  /** Set the sort direction for field: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTaxTypeCodeSortDirection (boolean ascending) {
    this.TaxTypeCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTaxTypeCodeSortDirection () {
    return this.TaxTypeCodeSortAscending;
  }
  /** Set the field level filters for field: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTaxTypeCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.TaxTypeCode = value;
  }
  /** Retrieve filter for field: TaxTypeCode (BILL_INVOICE_DETAIL.tax_type_code)
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

  /** Set the field level Fetch value for field: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (BILL_INVOICE_DETAIL.open_item_id)
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


  /** Set the field level Fetch value for field: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountReductionFetch (boolean fetch) {
    this.AmountReductionFetch = fetch;
  }
  /** Retrieve Fetch value for field: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountReductionFetch () {
    return this.AmountReductionFetch;
  }
  /** Set the SortOrder for field: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountReductionSortOrder (Integer value) {
    this.AmountReductionSort = value;
  }
  /** Retrieve SortOrder for field: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountReductionSortOrder () {
    return this.AmountReductionSort;
  }
  /** Set the sort direction for field: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountReductionSortDirection (boolean ascending) {
    this.AmountReductionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountReductionSortDirection () {
    return this.AmountReductionSortAscending;
  }
  /** Set the field level filters for field: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountReductionFilter (BigIntegerFilter[] value) throws ServiceException {
    this.AmountReduction = value;
  }
  /** Retrieve filter for field: AmountReduction (BILL_INVOICE_DETAIL.amount_reduction)
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


  /** Set the field level Fetch value for field: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAmountReductionIdFetch (boolean fetch) {
    this.AmountReductionIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAmountReductionIdFetch () {
    return this.AmountReductionIdFetch;
  }
  /** Set the SortOrder for field: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAmountReductionIdSortOrder (Integer value) {
    this.AmountReductionIdSort = value;
  }
  /** Retrieve SortOrder for field: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAmountReductionIdSortOrder () {
    return this.AmountReductionIdSort;
  }
  /** Set the sort direction for field: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAmountReductionIdSortDirection (boolean ascending) {
    this.AmountReductionIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAmountReductionIdSortDirection () {
    return this.AmountReductionIdSortAscending;
  }
  /** Set the field level filters for field: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAmountReductionIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AmountReductionId = value;
  }
  /** Retrieve filter for field: AmountReductionId (BILL_INVOICE_DETAIL.amount_reduction_id)
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

  /** Set the field level Fetch value for field: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * @param fetch whether to fetch this field or not
   */
  public void setZoneClassFetch (boolean fetch) {
    this.ZoneClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getZoneClassFetch () {
    return this.ZoneClassFetch;
  }
  /** Set the SortOrder for field: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setZoneClassSortOrder (Integer value) {
    this.ZoneClassSort = value;
  }
  /** Retrieve SortOrder for field: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getZoneClassSortOrder () {
    return this.ZoneClassSort;
  }
  /** Set the sort direction for field: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setZoneClassSortDirection (boolean ascending) {
    this.ZoneClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getZoneClassSortDirection () {
    return this.ZoneClassSortAscending;
  }
  /** Set the field level filters for field: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setZoneClassFilter (IntegerFilter[] value) throws ServiceException {
    this.ZoneClass = value;
  }
  /** Retrieve filter for field: ZoneClass (BILL_INVOICE_DETAIL.zone_class)
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

  /** Set the field level Fetch value for field: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * @param fetch whether to fetch this field or not
   */
  public void setBillClassFetch (boolean fetch) {
    this.BillClassFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillClassFetch () {
    return this.BillClassFetch;
  }
  /** Set the SortOrder for field: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillClassSortOrder (Integer value) {
    this.BillClassSort = value;
  }
  /** Retrieve SortOrder for field: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillClassSortOrder () {
    return this.BillClassSort;
  }
  /** Set the sort direction for field: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillClassSortDirection (boolean ascending) {
    this.BillClassSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillClassSortDirection () {
    return this.BillClassSortAscending;
  }
  /** Set the field level filters for field: BillClass (BILL_INVOICE_DETAIL.bill_class)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillClassFilter (IntegerFilter[] value) throws ServiceException {
    this.BillClass = value;
  }
  /** Retrieve filter for field: BillClass (BILL_INVOICE_DETAIL.bill_class)
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

  /** Set the field level Fetch value for field: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * @param fetch whether to fetch this field or not
   */
  public void setInclusiveTaxFetch (boolean fetch) {
    this.InclusiveTaxFetch = fetch;
  }
  /** Retrieve Fetch value for field: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * @return boolean the Fetch value for this field
   */
  public boolean getInclusiveTaxFetch () {
    return this.InclusiveTaxFetch;
  }
  /** Set the SortOrder for field: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInclusiveTaxSortOrder (Integer value) {
    this.InclusiveTaxSort = value;
  }
  /** Retrieve SortOrder for field: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInclusiveTaxSortOrder () {
    return this.InclusiveTaxSort;
  }
  /** Set the sort direction for field: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInclusiveTaxSortDirection (boolean ascending) {
    this.InclusiveTaxSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInclusiveTaxSortDirection () {
    return this.InclusiveTaxSortAscending;
  }
  /** Set the field level filters for field: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInclusiveTaxFilter (BigIntegerFilter[] value) throws ServiceException {
    this.InclusiveTax = value;
  }
  /** Retrieve filter for field: InclusiveTax (BILL_INVOICE_DETAIL.inclusive_tax)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getInclusiveTaxFilter () {
    return this.InclusiveTax;
  }

  /**
   * Retrieves the InclusiveTaxFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InclusiveTaxFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InclusiveTaxFilter field
   */
  public String[] getInclusiveTaxFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInclusiveTaxFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInclusiveTaxFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInclusiveTaxFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InclusiveTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInclusiveTaxFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the InclusiveTaxFilter filter value from a formatted string
   *
   * @param _value the InclusiveTaxFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InclusiveTaxFilter filter field
   */
  public void setInclusiveTaxFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInclusiveTaxFilterFromFormattedString");
    try {
      this.setInclusiveTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InclusiveTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInclusiveTaxFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInclusiveTaxFilterFromFormattedString");
  }

  /**
   * Sets the InclusiveTaxFilter filter value from a formatted string
   *
   * @param _value the InclusiveTaxFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the InclusiveTaxFilter filter field
   */
  public void setInclusiveTaxFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInclusiveTaxFilterFromFormattedCurrencyString");
    try {
      this.setInclusiveTaxFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InclusiveTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInclusiveTaxFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInclusiveTaxFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the InclusiveTaxFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InclusiveTaxFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the InclusiveTaxFilter field
   */

  public String[] getInclusiveTaxFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInclusiveTaxFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getInclusiveTaxFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInclusiveTaxFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InclusiveTaxFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInclusiveTaxFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setPcmActiveDtFetch (boolean fetch) {
    this.PcmActiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getPcmActiveDtFetch () {
    return this.PcmActiveDtFetch;
  }
  /** Set the SortOrder for field: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPcmActiveDtSortOrder (Integer value) {
    this.PcmActiveDtSort = value;
  }
  /** Retrieve SortOrder for field: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPcmActiveDtSortOrder () {
    return this.PcmActiveDtSort;
  }
  /** Set the sort direction for field: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPcmActiveDtSortDirection (boolean ascending) {
    this.PcmActiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPcmActiveDtSortDirection () {
    return this.PcmActiveDtSortAscending;
  }
  /** Set the field level filters for field: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPcmActiveDtFilter (DateFilter[] value) throws ServiceException {
    this.PcmActiveDt = value;
  }
  /** Retrieve filter for field: PcmActiveDt (BILL_INVOICE_DETAIL.pcm_active_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPcmActiveDtFilter () {
    return this.PcmActiveDt;
  }

  /**
   * Retrieves the PcmActiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PcmActiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PcmActiveDtFilter field
   */
  public String[] getPcmActiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPcmActiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPcmActiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPcmActiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PcmActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPcmActiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PcmActiveDtFilter filter value from a formatted string
   *
   * @param _value the PcmActiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PcmActiveDtFilter filter field
   */
  public void setPcmActiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPcmActiveDtFilterFromFormattedString");
    try {
      this.setPcmActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PcmActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPcmActiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPcmActiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the PcmActiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PcmActiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PcmActiveDtFilter field
   */
  public String[] getPcmActiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPcmActiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPcmActiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPcmActiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PcmActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPcmActiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PcmActiveDtFilter filter value from a formatted string
   *
   * @param _value the PcmActiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PcmActiveDtFilter filter field
   */
  public void setPcmActiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPcmActiveDtFilterFromFormattedDateTimeString");
    try {
      this.setPcmActiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PcmActiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPcmActiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPcmActiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * @param fetch whether to fetch this field or not
   */
  public void setMiscNumber1Fetch (boolean fetch) {
    this.MiscNumber1Fetch = fetch;
  }
  /** Retrieve Fetch value for field: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * @return boolean the Fetch value for this field
   */
  public boolean getMiscNumber1Fetch () {
    return this.MiscNumber1Fetch;
  }
  /** Set the SortOrder for field: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMiscNumber1SortOrder (Integer value) {
    this.MiscNumber1Sort = value;
  }
  /** Retrieve SortOrder for field: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMiscNumber1SortOrder () {
    return this.MiscNumber1Sort;
  }
  /** Set the sort direction for field: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMiscNumber1SortDirection (boolean ascending) {
    this.MiscNumber1SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMiscNumber1SortDirection () {
    return this.MiscNumber1SortAscending;
  }
  /** Set the field level filters for field: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMiscNumber1Filter (BigIntegerFilter[] value) throws ServiceException {
    this.MiscNumber1 = value;
  }
  /** Retrieve filter for field: MiscNumber1 (BILL_INVOICE_DETAIL.misc_number1)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMiscNumber1Filter () {
    return this.MiscNumber1;
  }

  /**
   * Retrieves the MiscNumber1Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MiscNumber1Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiscNumber1Filter field
   */
  public String[] getMiscNumber1FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber1FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMiscNumber1Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiscNumber1FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiscNumber1FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MiscNumber1Filter filter value from a formatted string
   *
   * @param _value the MiscNumber1Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MiscNumber1Filter filter field
   */
  public void setMiscNumber1FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMiscNumber1FilterFromFormattedString");
    try {
      this.setMiscNumber1Filter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiscNumber1FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiscNumber1FilterFromFormattedString");
  }

  /**
   * Sets the MiscNumber1Filter filter value from a formatted string
   *
   * @param _value the MiscNumber1Filter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MiscNumber1Filter filter field
   */
  public void setMiscNumber1FilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMiscNumber1FilterFromFormattedCurrencyString");
    try {
      this.setMiscNumber1Filter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiscNumber1FilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiscNumber1FilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the MiscNumber1Filter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MiscNumber1Filter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiscNumber1Filter field
   */

  public String[] getMiscNumber1FilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber1FilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMiscNumber1Filter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiscNumber1FilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber1Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiscNumber1FilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * @param fetch whether to fetch this field or not
   */
  public void setMiscNumber2Fetch (boolean fetch) {
    this.MiscNumber2Fetch = fetch;
  }
  /** Retrieve Fetch value for field: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * @return boolean the Fetch value for this field
   */
  public boolean getMiscNumber2Fetch () {
    return this.MiscNumber2Fetch;
  }
  /** Set the SortOrder for field: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMiscNumber2SortOrder (Integer value) {
    this.MiscNumber2Sort = value;
  }
  /** Retrieve SortOrder for field: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMiscNumber2SortOrder () {
    return this.MiscNumber2Sort;
  }
  /** Set the sort direction for field: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMiscNumber2SortDirection (boolean ascending) {
    this.MiscNumber2SortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMiscNumber2SortDirection () {
    return this.MiscNumber2SortAscending;
  }
  /** Set the field level filters for field: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMiscNumber2Filter (BigIntegerFilter[] value) throws ServiceException {
    this.MiscNumber2 = value;
  }
  /** Retrieve filter for field: MiscNumber2 (BILL_INVOICE_DETAIL.misc_number2)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getMiscNumber2Filter () {
    return this.MiscNumber2;
  }

  /**
   * Retrieves the MiscNumber2Filter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MiscNumber2Filter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiscNumber2Filter field
   */
  public String[] getMiscNumber2FilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber2FilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMiscNumber2Filter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiscNumber2FilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiscNumber2FilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MiscNumber2Filter filter value from a formatted string
   *
   * @param _value the MiscNumber2Filter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MiscNumber2Filter filter field
   */
  public void setMiscNumber2FilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMiscNumber2FilterFromFormattedString");
    try {
      this.setMiscNumber2Filter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiscNumber2FilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiscNumber2FilterFromFormattedString");
  }

  /**
   * Sets the MiscNumber2Filter filter value from a formatted string
   *
   * @param _value the MiscNumber2Filter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MiscNumber2Filter filter field
   */
  public void setMiscNumber2FilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMiscNumber2FilterFromFormattedCurrencyString");
    try {
      this.setMiscNumber2Filter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMiscNumber2FilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMiscNumber2FilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the MiscNumber2Filter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MiscNumber2Filter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the MiscNumber2Filter field
   */

  public String[] getMiscNumber2FilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMiscNumber2FilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMiscNumber2Filter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMiscNumber2FilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MiscNumber2Filter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMiscNumber2FilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: LobId (BILL_INVOICE_DETAIL.lob_id)
   * @param fetch whether to fetch this field or not
   */
  public void setLobIdFetch (boolean fetch) {
    this.LobIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: LobId (BILL_INVOICE_DETAIL.lob_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getLobIdFetch () {
    return this.LobIdFetch;
  }
  /** Set the SortOrder for field: LobId (BILL_INVOICE_DETAIL.lob_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLobIdSortOrder (Integer value) {
    this.LobIdSort = value;
  }
  /** Retrieve SortOrder for field: LobId (BILL_INVOICE_DETAIL.lob_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLobIdSortOrder () {
    return this.LobIdSort;
  }
  /** Set the sort direction for field: LobId (BILL_INVOICE_DETAIL.lob_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLobIdSortDirection (boolean ascending) {
    this.LobIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LobId (BILL_INVOICE_DETAIL.lob_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLobIdSortDirection () {
    return this.LobIdSortAscending;
  }
  /** Set the field level filters for field: LobId (BILL_INVOICE_DETAIL.lob_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLobIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.LobId = value;
  }
  /** Retrieve filter for field: LobId (BILL_INVOICE_DETAIL.lob_id)
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

  /** Set the field level Fetch value for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionGroupFetch (boolean fetch) {
    this.DescriptionGroupFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionGroupFetch () {
    return this.DescriptionGroupFetch;
  }
  /** Set the SortOrder for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionGroupSortOrder (Integer value) {
    this.DescriptionGroupSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionGroupSortOrder () {
    return this.DescriptionGroupSort;
  }
  /** Set the sort direction for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionGroupSortDirection (boolean ascending) {
    this.DescriptionGroupSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionGroupSortDirection () {
    return this.DescriptionGroupSortAscending;
  }
  /** Set the field level filters for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionGroupFilter (IntegerFilter[] value) throws ServiceException {
    this.DescriptionGroup = value;
  }
  /** Retrieve filter for field: DescriptionGroup (DESCRIPTIONS.description_group)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDescriptionGroupFilter () {
    return this.DescriptionGroup;
  }

  /**
   * Retrieves the DescriptionGroupFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DescriptionGroupFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionGroupFilter field
   */
  public String[] getDescriptionGroupFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionGroupFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDescriptionGroupFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionGroupFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionGroupFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DescriptionGroupFilter filter value from a formatted string
   *
   * @param _value the DescriptionGroupFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DescriptionGroupFilter filter field
   */
  public void setDescriptionGroupFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDescriptionGroupFilterFromFormattedString");
    try {
      this.setDescriptionGroupFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionGroupFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionGroupFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DescriptionText (DESCRIPTIONS.description_text)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionTextFetch (boolean fetch) {
    this.DescriptionTextFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionTextFetch () {
    return this.DescriptionTextFetch;
  }
  /** Set the SortOrder for field: DescriptionText (DESCRIPTIONS.description_text)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionTextSortOrder (Integer value) {
    this.DescriptionTextSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionTextSortOrder () {
    return this.DescriptionTextSort;
  }
  /** Set the sort direction for field: DescriptionText (DESCRIPTIONS.description_text)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionTextSortDirection (boolean ascending) {
    this.DescriptionTextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionTextSortDirection () {
    return this.DescriptionTextSortAscending;
  }
  /** Set the case insensitive for field: DescriptionText (DESCRIPTIONS.description_text)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setDescriptionTextCaseInsensitive (boolean ascending) {
    this.DescriptionTextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getDescriptionTextCaseInsensitive () {
    return this.DescriptionTextCaseInsensitive;
  }
  /** Set the field level filters for field: DescriptionText (DESCRIPTIONS.description_text)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionTextFilter (StringFilter[] value) throws ServiceException {
    this.DescriptionText = value;
  }
  /** Retrieve filter for field: DescriptionText (DESCRIPTIONS.description_text)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getDescriptionTextFilter () {
    return this.DescriptionText;
  }

  /**
   * Retrieves the DescriptionTextFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DescriptionTextFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DescriptionTextFilter field
   */
  public String[] getDescriptionTextFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDescriptionTextFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDescriptionTextFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDescriptionTextFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDescriptionTextFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DescriptionTextFilter filter value from a formatted string
   *
   * @param _value the DescriptionTextFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DescriptionTextFilter filter field
   */
  public void setDescriptionTextFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDescriptionTextFilterFromFormattedString");
    try {
      this.setDescriptionTextFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DescriptionTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDescriptionTextFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDescriptionTextFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @param fetch whether to fetch this field or not
   */
  public void setShortDescriptionTextFetch (boolean fetch) {
    this.ShortDescriptionTextFetch = fetch;
  }
  /** Retrieve Fetch value for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return boolean the Fetch value for this field
   */
  public boolean getShortDescriptionTextFetch () {
    return this.ShortDescriptionTextFetch;
  }
  /** Set the SortOrder for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setShortDescriptionTextSortOrder (Integer value) {
    this.ShortDescriptionTextSort = value;
  }
  /** Retrieve SortOrder for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getShortDescriptionTextSortOrder () {
    return this.ShortDescriptionTextSort;
  }
  /** Set the sort direction for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setShortDescriptionTextSortDirection (boolean ascending) {
    this.ShortDescriptionTextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getShortDescriptionTextSortDirection () {
    return this.ShortDescriptionTextSortAscending;
  }
  /** Set the case insensitive for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setShortDescriptionTextCaseInsensitive (boolean ascending) {
    this.ShortDescriptionTextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getShortDescriptionTextCaseInsensitive () {
    return this.ShortDescriptionTextCaseInsensitive;
  }
  /** Set the field level filters for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setShortDescriptionTextFilter (StringFilter[] value) throws ServiceException {
    this.ShortDescriptionText = value;
  }
  /** Retrieve filter for field: ShortDescriptionText (DESCRIPTIONS.short_description_text)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getShortDescriptionTextFilter () {
    return this.ShortDescriptionText;
  }

  /**
   * Retrieves the ShortDescriptionTextFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ShortDescriptionTextFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ShortDescriptionTextFilter field
   */
  public String[] getShortDescriptionTextFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getShortDescriptionTextFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getShortDescriptionTextFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getShortDescriptionTextFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDescriptionTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getShortDescriptionTextFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ShortDescriptionTextFilter filter value from a formatted string
   *
   * @param _value the ShortDescriptionTextFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ShortDescriptionTextFilter filter field
   */
  public void setShortDescriptionTextFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setShortDescriptionTextFilterFromFormattedString");
    try {
      this.setShortDescriptionTextFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ShortDescriptionTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setShortDescriptionTextFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setShortDescriptionTextFilterFromFormattedString");
  }

  public String toString() {
    return InvoiceDetailObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return InvoiceDetailObjectHelper.toMap(this, null);
  }
}
