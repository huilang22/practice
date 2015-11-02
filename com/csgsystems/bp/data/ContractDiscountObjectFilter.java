/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContractDiscountObjectFilter.java
 * Definition File: Customer/ContractDiscount.xml
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
public class ContractDiscountObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public ContractDiscountObjectKeyFilter Key = null;
  /** raw field for: CONTRACT_TYPES.contract_category) */
  public    IntegerFilter[] ContractCategory  = null;
  protected boolean ContractCategoryFetch = false;
  protected boolean ContractCategorySortAscending = true;
  protected Integer ContractCategorySort = null;
  /** raw field for: CONTRACT_TYPES.element_id) */
  public    IntegerFilter[] ElementId  = null;
  protected boolean ElementIdFetch = false;
  protected boolean ElementIdSortAscending = true;
  protected Integer ElementIdSort = null;
  /** raw field for: CONTRACT_TYPES.commitment_reference) */
  public    IntegerFilter[] CommitmentReference  = null;
  protected boolean CommitmentReferenceFetch = false;
  protected boolean CommitmentReferenceSortAscending = true;
  protected Integer CommitmentReferenceSort = null;
  /** raw field for: CONTRACT_TYPES.duration_units) */
  public    IntegerFilter[] DurationUnits  = null;
  protected boolean DurationUnitsFetch = false;
  protected boolean DurationUnitsSortAscending = true;
  protected Integer DurationUnitsSort = null;
  /** raw field for: CONTRACT_TYPES.duration) */
  public    IntegerFilter[] Duration  = null;
  protected boolean DurationFetch = false;
  protected boolean DurationSortAscending = true;
  protected Integer DurationSort = null;
  /** raw field for: CONTRACT_TYPES.plan_id_discount) */
  public    IntegerFilter[] PlanIdDiscount  = null;
  protected boolean PlanIdDiscountFetch = false;
  protected boolean PlanIdDiscountSortAscending = true;
  protected Integer PlanIdDiscountSort = null;
  /** raw field for: CONTRACT_TYPES.plan_id_credit) */
  public    IntegerFilter[] PlanIdCredit  = null;
  protected boolean PlanIdCreditFetch = false;
  protected boolean PlanIdCreditSortAscending = true;
  protected Integer PlanIdCreditSort = null;
  /** raw field for: CONTRACT_TYPES.activation_type_id_nrc) */
  public    IntegerFilter[] ActivationTypeIdNrc  = null;
  protected boolean ActivationTypeIdNrcFetch = false;
  protected boolean ActivationTypeIdNrcSortAscending = true;
  protected Integer ActivationTypeIdNrcSort = null;
  /** raw field for: CONTRACT_TYPES.termination_type_id_nrc) */
  public    IntegerFilter[] TerminationTypeIdNrc  = null;
  protected boolean TerminationTypeIdNrcFetch = false;
  protected boolean TerminationTypeIdNrcSortAscending = true;
  protected Integer TerminationTypeIdNrcSort = null;
  /** raw field for: CONTRACT_TYPES.is_promotion) */
  public    BooleanFilter[] IsPromotion  = null;
  protected boolean IsPromotionFetch = false;
  protected boolean IsPromotionSortAscending = true;
  protected Integer IsPromotionSort = null;
  /** raw field for: CONTRACT_TYPES.description_code) */
  public    IntegerFilter[] DescriptionCode  = null;
  protected boolean DescriptionCodeFetch = false;
  protected boolean DescriptionCodeSortAscending = true;
  protected Integer DescriptionCodeSort = null;
  /** raw field for: CONTRACT_TYPES.foreign_code) */
  public    StringFilter[] ForeignCode  = null;
  protected boolean ForeignCodeFetch = false;
  protected boolean ForeignCodeSortAscending = true;
  protected boolean ForeignCodeCaseInsensitive = false;
  protected Integer ForeignCodeSort = null;
  /** raw field for: CONTRACT_TYPES.start_by_units) */
  public    IntegerFilter[] StartByUnits  = null;
  protected boolean StartByUnitsFetch = false;
  protected boolean StartByUnitsSortAscending = true;
  protected Integer StartByUnitsSort = null;
  /** raw field for: CONTRACT_TYPES.start_by) */
  public    IntegerFilter[] StartBy  = null;
  protected boolean StartByFetch = false;
  protected boolean StartBySortAscending = true;
  protected Integer StartBySort = null;
  /** raw field for: CONTRACT_TYPES.active_date) */
  public    DateFilter[] ActiveDate  = null;
  protected boolean ActiveDateFetch = false;
  protected boolean ActiveDateSortAscending = true;
  protected Integer ActiveDateSort = null;
  /** raw field for: CONTRACT_TYPES.inactive_date) */
  public    DateFilter[] InactiveDate  = null;
  protected boolean InactiveDateFetch = false;
  protected boolean InactiveDateSortAscending = true;
  protected Integer InactiveDateSort = null;
  /** raw field for: CONTRACT_TYPES.fixed_start_date) */
  public    DateFilter[] FixedStartDate  = null;
  protected boolean FixedStartDateFetch = false;
  protected boolean FixedStartDateSortAscending = true;
  protected Integer FixedStartDateSort = null;
  /** raw field for: CONTRACT_TYPES.fixed_end_date) */
  public    DateFilter[] FixedEndDate  = null;
  protected boolean FixedEndDateFetch = false;
  protected boolean FixedEndDateSortAscending = true;
  protected Integer FixedEndDateSort = null;
  /** raw field for: CONTRACT_TYPES.partial_period) */
  public    BooleanFilter[] PartialPeriod  = null;
  protected boolean PartialPeriodFetch = false;
  protected boolean PartialPeriodSortAscending = true;
  protected Integer PartialPeriodSort = null;
  /** raw field for: CONTRACT_TYPES.commitment_type_id_nrc) */
  public    IntegerFilter[] CommitmentTypeIdNrc  = null;
  protected boolean CommitmentTypeIdNrcFetch = false;
  protected boolean CommitmentTypeIdNrcSortAscending = true;
  protected Integer CommitmentTypeIdNrcSort = null;
  /** raw field for: CONTRACT_TYPES.discount_base_period) */
  public    IntegerFilter[] DiscountBasePeriod  = null;
  protected boolean DiscountBasePeriodFetch = false;
  protected boolean DiscountBasePeriodSortAscending = true;
  protected Integer DiscountBasePeriodSort = null;
  /** raw field for: CONTRACT_TYPES.rollover_order) */
  public    IntegerFilter[] RolloverOrder  = null;
  protected boolean RolloverOrderFetch = false;
  protected boolean RolloverOrderSortAscending = true;
  protected Integer RolloverOrderSort = null;
  /** raw field for: CONTRACT_TYPES.rollover_grouping) */
  public    IntegerFilter[] RolloverGrouping  = null;
  protected boolean RolloverGroupingFetch = false;
  protected boolean RolloverGroupingSortAscending = true;
  protected Integer RolloverGroupingSort = null;
  /** raw field for: CONTRACT_TYPES.bonus_point_id) */
  public    IntegerFilter[] BonusPointId  = null;
  protected boolean BonusPointIdFetch = false;
  protected boolean BonusPointIdSortAscending = true;
  protected Integer BonusPointIdSort = null;
  /** raw field for: CONTRACT_TYPES.prorate_contract_start) */
  public    BooleanFilter[] ProrateContractStart  = null;
  protected boolean ProrateContractStartFetch = false;
  protected boolean ProrateContractStartSortAscending = true;
  protected Integer ProrateContractStartSort = null;
  /** raw field for: CONTRACT_TYPES.prorate_contract_end) */
  public    BooleanFilter[] ProrateContractEnd  = null;
  protected boolean ProrateContractEndFetch = false;
  protected boolean ProrateContractEndSortAscending = true;
  protected Integer ProrateContractEndSort = null;
  /** raw field for: CONTRACT_TYPES.prorate_interim_bill) */
  public    BooleanFilter[] ProrateInterimBill  = null;
  protected boolean ProrateInterimBillFetch = false;
  protected boolean ProrateInterimBillSortAscending = true;
  protected Integer ProrateInterimBillSort = null;
  /** raw field for: CONTRACT_TYPES.prorate_period_change) */
  public    BooleanFilter[] ProratePeriodChange  = null;
  protected boolean ProratePeriodChangeFetch = false;
  protected boolean ProratePeriodChangeSortAscending = true;
  protected Integer ProratePeriodChangeSort = null;
  /** raw field for: CONTRACT_TYPES.prorate_account_start) */
  public    BooleanFilter[] ProrateAccountStart  = null;
  protected boolean ProrateAccountStartFetch = false;
  protected boolean ProrateAccountStartSortAscending = true;
  protected Integer ProrateAccountStartSort = null;
  /** raw field for: CONTRACT_TYPES.prorate_account_end) */
  public    BooleanFilter[] ProrateAccountEnd  = null;
  protected boolean ProrateAccountEndFetch = false;
  protected boolean ProrateAccountEndSortAscending = true;
  protected Integer ProrateAccountEndSort = null;
  /** raw field for: CONTRACT_TYPES.prorate_target_threshold) */
  public    BooleanFilter[] ProrateTargetThreshold  = null;
  protected boolean ProrateTargetThresholdFetch = false;
  protected boolean ProrateTargetThresholdSortAscending = true;
  protected Integer ProrateTargetThresholdSort = null;
  /** raw field for: CONTRACT_TYPES.prorate_target_rebates) */
  public    BooleanFilter[] ProrateTargetRebates  = null;
  protected boolean ProrateTargetRebatesFetch = false;
  protected boolean ProrateTargetRebatesSortAscending = true;
  protected Integer ProrateTargetRebatesSort = null;
  /** raw field for: CONTRACT_TYPES.allow_account) */
  public    IntegerFilter[] AllowAccount  = null;
  protected boolean AllowAccountFetch = false;
  protected boolean AllowAccountSortAscending = true;
  protected Integer AllowAccountSort = null;
  /** raw field for: CONTRACT_TYPES.allow_serv_inst) */
  public    IntegerFilter[] AllowService  = null;
  protected boolean AllowServiceFetch = false;
  protected boolean AllowServiceSortAscending = true;
  protected Integer AllowServiceSort = null;
  /** raw field for: CONTRACT_TYPES.allow_acct_group) */
  public    IntegerFilter[] AllowAccountGroup  = null;
  protected boolean AllowAccountGroupFetch = false;
  protected boolean AllowAccountGroupSortAscending = true;
  protected Integer AllowAccountGroupSort = null;
  /** raw field for: CONTRACT_TYPES.allow_si_group) */
  public    IntegerFilter[] AllowServiceGroup  = null;
  protected boolean AllowServiceGroupFetch = false;
  protected boolean AllowServiceGroupSortAscending = true;
  protected Integer AllowServiceGroupSort = null;
  /** raw field for: CONTRACT_TYPES.bill_period) */
  public    StringFilter[] BillPeriod  = null;
  protected boolean BillPeriodFetch = false;
  protected boolean BillPeriodSortAscending = true;
  protected boolean BillPeriodCaseInsensitive = false;
  protected Integer BillPeriodSort = null;
  /** raw field for: CONTRACT_TYPES.min_duration_units) */
  public    IntegerFilter[] MinDurationUnits  = null;
  protected boolean MinDurationUnitsFetch = false;
  protected boolean MinDurationUnitsSortAscending = true;
  protected Integer MinDurationUnitsSort = null;
  /** raw field for: CONTRACT_TYPES.min_duration) */
  public    IntegerFilter[] MinDuration  = null;
  protected boolean MinDurationFetch = false;
  protected boolean MinDurationSortAscending = true;
  protected Integer MinDurationSort = null;
  /** raw field for: CONTRACT_TYPES.min_notice_units) */
  public    IntegerFilter[] MinNoticeUnits  = null;
  protected boolean MinNoticeUnitsFetch = false;
  protected boolean MinNoticeUnitsSortAscending = true;
  protected Integer MinNoticeUnitsSort = null;
  /** raw field for: CONTRACT_TYPES.min_notice_delay) */
  public    IntegerFilter[] MinNoticeDelay  = null;
  protected boolean MinNoticeDelayFetch = false;
  protected boolean MinNoticeDelaySortAscending = true;
  protected Integer MinNoticeDelaySort = null;
  /** raw field for: CONTRACT_TYPES.is_custom) */
  public    IntegerFilter[] IsCustom  = null;
  protected boolean IsCustomFetch = false;
  protected boolean IsCustomSortAscending = true;
  protected Integer IsCustomSort = null;
  /** raw field for: CONTRACT_TYPES.when_applied) */
  public    IntegerFilter[] WhenApplied  = null;
  protected boolean WhenAppliedFetch = false;
  protected boolean WhenAppliedSortAscending = true;
  protected Integer WhenAppliedSort = null;
  /** raw field for: CONTRACT_TYPES.apply_during_suspend) */
  public    IntegerFilter[] ApplyDuringSuspend  = null;
  protected boolean ApplyDuringSuspendFetch = false;
  protected boolean ApplyDuringSuspendSortAscending = true;
  protected Integer ApplyDuringSuspendSort = null;
  /** raw field for: DISCOUNT_PLANS.plan_order) */
  public    IntegerFilter[] PlanOrder  = null;
  protected boolean PlanOrderFetch = false;
  protected boolean PlanOrderSortAscending = true;
  protected Integer PlanOrderSort = null;
  /** raw field for: DISCOUNT_PLANS.def_order) */
  public    IntegerFilter[] DefOrder  = null;
  protected boolean DefOrderFetch = false;
  protected boolean DefOrderSortAscending = true;
  protected Integer DefOrderSort = null;
  private String _objName = "ContractDiscountObjectFilter";
  /** default constructor */
  public ContractDiscountObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public ContractDiscountObjectFilter (ContractDiscountObjectFilter other)
  {
    if (other == null) return;
    this.Key = new ContractDiscountObjectKeyFilter (other.Key);
    this.ContractCategory = other.ContractCategory;
    this.ContractCategoryFetch = other.ContractCategoryFetch;
    this.ContractCategorySort = other.ContractCategorySort;
    this.ContractCategorySortAscending = other.ContractCategorySortAscending;
    this.ElementId = other.ElementId;
    this.ElementIdFetch = other.ElementIdFetch;
    this.ElementIdSort = other.ElementIdSort;
    this.ElementIdSortAscending = other.ElementIdSortAscending;
    this.CommitmentReference = other.CommitmentReference;
    this.CommitmentReferenceFetch = other.CommitmentReferenceFetch;
    this.CommitmentReferenceSort = other.CommitmentReferenceSort;
    this.CommitmentReferenceSortAscending = other.CommitmentReferenceSortAscending;
    this.DurationUnits = other.DurationUnits;
    this.DurationUnitsFetch = other.DurationUnitsFetch;
    this.DurationUnitsSort = other.DurationUnitsSort;
    this.DurationUnitsSortAscending = other.DurationUnitsSortAscending;
    this.Duration = other.Duration;
    this.DurationFetch = other.DurationFetch;
    this.DurationSort = other.DurationSort;
    this.DurationSortAscending = other.DurationSortAscending;
    this.PlanIdDiscount = other.PlanIdDiscount;
    this.PlanIdDiscountFetch = other.PlanIdDiscountFetch;
    this.PlanIdDiscountSort = other.PlanIdDiscountSort;
    this.PlanIdDiscountSortAscending = other.PlanIdDiscountSortAscending;
    this.PlanIdCredit = other.PlanIdCredit;
    this.PlanIdCreditFetch = other.PlanIdCreditFetch;
    this.PlanIdCreditSort = other.PlanIdCreditSort;
    this.PlanIdCreditSortAscending = other.PlanIdCreditSortAscending;
    this.ActivationTypeIdNrc = other.ActivationTypeIdNrc;
    this.ActivationTypeIdNrcFetch = other.ActivationTypeIdNrcFetch;
    this.ActivationTypeIdNrcSort = other.ActivationTypeIdNrcSort;
    this.ActivationTypeIdNrcSortAscending = other.ActivationTypeIdNrcSortAscending;
    this.TerminationTypeIdNrc = other.TerminationTypeIdNrc;
    this.TerminationTypeIdNrcFetch = other.TerminationTypeIdNrcFetch;
    this.TerminationTypeIdNrcSort = other.TerminationTypeIdNrcSort;
    this.TerminationTypeIdNrcSortAscending = other.TerminationTypeIdNrcSortAscending;
    this.IsPromotion = other.IsPromotion;
    this.IsPromotionFetch = other.IsPromotionFetch;
    this.IsPromotionSort = other.IsPromotionSort;
    this.IsPromotionSortAscending = other.IsPromotionSortAscending;
    this.DescriptionCode = other.DescriptionCode;
    this.DescriptionCodeFetch = other.DescriptionCodeFetch;
    this.DescriptionCodeSort = other.DescriptionCodeSort;
    this.DescriptionCodeSortAscending = other.DescriptionCodeSortAscending;
    this.ForeignCode = other.ForeignCode;
    this.ForeignCodeFetch = other.ForeignCodeFetch;
    this.ForeignCodeSort = other.ForeignCodeSort;
    this.ForeignCodeCaseInsensitive = other.ForeignCodeCaseInsensitive;
    this.ForeignCodeSortAscending = other.ForeignCodeSortAscending;
    this.StartByUnits = other.StartByUnits;
    this.StartByUnitsFetch = other.StartByUnitsFetch;
    this.StartByUnitsSort = other.StartByUnitsSort;
    this.StartByUnitsSortAscending = other.StartByUnitsSortAscending;
    this.StartBy = other.StartBy;
    this.StartByFetch = other.StartByFetch;
    this.StartBySort = other.StartBySort;
    this.StartBySortAscending = other.StartBySortAscending;
    this.ActiveDate = other.ActiveDate;
    this.ActiveDateFetch = other.ActiveDateFetch;
    this.ActiveDateSort = other.ActiveDateSort;
    this.ActiveDateSortAscending = other.ActiveDateSortAscending;
    this.InactiveDate = other.InactiveDate;
    this.InactiveDateFetch = other.InactiveDateFetch;
    this.InactiveDateSort = other.InactiveDateSort;
    this.InactiveDateSortAscending = other.InactiveDateSortAscending;
    this.FixedStartDate = other.FixedStartDate;
    this.FixedStartDateFetch = other.FixedStartDateFetch;
    this.FixedStartDateSort = other.FixedStartDateSort;
    this.FixedStartDateSortAscending = other.FixedStartDateSortAscending;
    this.FixedEndDate = other.FixedEndDate;
    this.FixedEndDateFetch = other.FixedEndDateFetch;
    this.FixedEndDateSort = other.FixedEndDateSort;
    this.FixedEndDateSortAscending = other.FixedEndDateSortAscending;
    this.PartialPeriod = other.PartialPeriod;
    this.PartialPeriodFetch = other.PartialPeriodFetch;
    this.PartialPeriodSort = other.PartialPeriodSort;
    this.PartialPeriodSortAscending = other.PartialPeriodSortAscending;
    this.CommitmentTypeIdNrc = other.CommitmentTypeIdNrc;
    this.CommitmentTypeIdNrcFetch = other.CommitmentTypeIdNrcFetch;
    this.CommitmentTypeIdNrcSort = other.CommitmentTypeIdNrcSort;
    this.CommitmentTypeIdNrcSortAscending = other.CommitmentTypeIdNrcSortAscending;
    this.DiscountBasePeriod = other.DiscountBasePeriod;
    this.DiscountBasePeriodFetch = other.DiscountBasePeriodFetch;
    this.DiscountBasePeriodSort = other.DiscountBasePeriodSort;
    this.DiscountBasePeriodSortAscending = other.DiscountBasePeriodSortAscending;
    this.RolloverOrder = other.RolloverOrder;
    this.RolloverOrderFetch = other.RolloverOrderFetch;
    this.RolloverOrderSort = other.RolloverOrderSort;
    this.RolloverOrderSortAscending = other.RolloverOrderSortAscending;
    this.RolloverGrouping = other.RolloverGrouping;
    this.RolloverGroupingFetch = other.RolloverGroupingFetch;
    this.RolloverGroupingSort = other.RolloverGroupingSort;
    this.RolloverGroupingSortAscending = other.RolloverGroupingSortAscending;
    this.BonusPointId = other.BonusPointId;
    this.BonusPointIdFetch = other.BonusPointIdFetch;
    this.BonusPointIdSort = other.BonusPointIdSort;
    this.BonusPointIdSortAscending = other.BonusPointIdSortAscending;
    this.ProrateContractStart = other.ProrateContractStart;
    this.ProrateContractStartFetch = other.ProrateContractStartFetch;
    this.ProrateContractStartSort = other.ProrateContractStartSort;
    this.ProrateContractStartSortAscending = other.ProrateContractStartSortAscending;
    this.ProrateContractEnd = other.ProrateContractEnd;
    this.ProrateContractEndFetch = other.ProrateContractEndFetch;
    this.ProrateContractEndSort = other.ProrateContractEndSort;
    this.ProrateContractEndSortAscending = other.ProrateContractEndSortAscending;
    this.ProrateInterimBill = other.ProrateInterimBill;
    this.ProrateInterimBillFetch = other.ProrateInterimBillFetch;
    this.ProrateInterimBillSort = other.ProrateInterimBillSort;
    this.ProrateInterimBillSortAscending = other.ProrateInterimBillSortAscending;
    this.ProratePeriodChange = other.ProratePeriodChange;
    this.ProratePeriodChangeFetch = other.ProratePeriodChangeFetch;
    this.ProratePeriodChangeSort = other.ProratePeriodChangeSort;
    this.ProratePeriodChangeSortAscending = other.ProratePeriodChangeSortAscending;
    this.ProrateAccountStart = other.ProrateAccountStart;
    this.ProrateAccountStartFetch = other.ProrateAccountStartFetch;
    this.ProrateAccountStartSort = other.ProrateAccountStartSort;
    this.ProrateAccountStartSortAscending = other.ProrateAccountStartSortAscending;
    this.ProrateAccountEnd = other.ProrateAccountEnd;
    this.ProrateAccountEndFetch = other.ProrateAccountEndFetch;
    this.ProrateAccountEndSort = other.ProrateAccountEndSort;
    this.ProrateAccountEndSortAscending = other.ProrateAccountEndSortAscending;
    this.ProrateTargetThreshold = other.ProrateTargetThreshold;
    this.ProrateTargetThresholdFetch = other.ProrateTargetThresholdFetch;
    this.ProrateTargetThresholdSort = other.ProrateTargetThresholdSort;
    this.ProrateTargetThresholdSortAscending = other.ProrateTargetThresholdSortAscending;
    this.ProrateTargetRebates = other.ProrateTargetRebates;
    this.ProrateTargetRebatesFetch = other.ProrateTargetRebatesFetch;
    this.ProrateTargetRebatesSort = other.ProrateTargetRebatesSort;
    this.ProrateTargetRebatesSortAscending = other.ProrateTargetRebatesSortAscending;
    this.AllowAccount = other.AllowAccount;
    this.AllowAccountFetch = other.AllowAccountFetch;
    this.AllowAccountSort = other.AllowAccountSort;
    this.AllowAccountSortAscending = other.AllowAccountSortAscending;
    this.AllowService = other.AllowService;
    this.AllowServiceFetch = other.AllowServiceFetch;
    this.AllowServiceSort = other.AllowServiceSort;
    this.AllowServiceSortAscending = other.AllowServiceSortAscending;
    this.AllowAccountGroup = other.AllowAccountGroup;
    this.AllowAccountGroupFetch = other.AllowAccountGroupFetch;
    this.AllowAccountGroupSort = other.AllowAccountGroupSort;
    this.AllowAccountGroupSortAscending = other.AllowAccountGroupSortAscending;
    this.AllowServiceGroup = other.AllowServiceGroup;
    this.AllowServiceGroupFetch = other.AllowServiceGroupFetch;
    this.AllowServiceGroupSort = other.AllowServiceGroupSort;
    this.AllowServiceGroupSortAscending = other.AllowServiceGroupSortAscending;
    this.BillPeriod = other.BillPeriod;
    this.BillPeriodFetch = other.BillPeriodFetch;
    this.BillPeriodSort = other.BillPeriodSort;
    this.BillPeriodCaseInsensitive = other.BillPeriodCaseInsensitive;
    this.BillPeriodSortAscending = other.BillPeriodSortAscending;
    this.MinDurationUnits = other.MinDurationUnits;
    this.MinDurationUnitsFetch = other.MinDurationUnitsFetch;
    this.MinDurationUnitsSort = other.MinDurationUnitsSort;
    this.MinDurationUnitsSortAscending = other.MinDurationUnitsSortAscending;
    this.MinDuration = other.MinDuration;
    this.MinDurationFetch = other.MinDurationFetch;
    this.MinDurationSort = other.MinDurationSort;
    this.MinDurationSortAscending = other.MinDurationSortAscending;
    this.MinNoticeUnits = other.MinNoticeUnits;
    this.MinNoticeUnitsFetch = other.MinNoticeUnitsFetch;
    this.MinNoticeUnitsSort = other.MinNoticeUnitsSort;
    this.MinNoticeUnitsSortAscending = other.MinNoticeUnitsSortAscending;
    this.MinNoticeDelay = other.MinNoticeDelay;
    this.MinNoticeDelayFetch = other.MinNoticeDelayFetch;
    this.MinNoticeDelaySort = other.MinNoticeDelaySort;
    this.MinNoticeDelaySortAscending = other.MinNoticeDelaySortAscending;
    this.IsCustom = other.IsCustom;
    this.IsCustomFetch = other.IsCustomFetch;
    this.IsCustomSort = other.IsCustomSort;
    this.IsCustomSortAscending = other.IsCustomSortAscending;
    this.WhenApplied = other.WhenApplied;
    this.WhenAppliedFetch = other.WhenAppliedFetch;
    this.WhenAppliedSort = other.WhenAppliedSort;
    this.WhenAppliedSortAscending = other.WhenAppliedSortAscending;
    this.ApplyDuringSuspend = other.ApplyDuringSuspend;
    this.ApplyDuringSuspendFetch = other.ApplyDuringSuspendFetch;
    this.ApplyDuringSuspendSort = other.ApplyDuringSuspendSort;
    this.ApplyDuringSuspendSortAscending = other.ApplyDuringSuspendSortAscending;
    this.PlanOrder = other.PlanOrder;
    this.PlanOrderFetch = other.PlanOrderFetch;
    this.PlanOrderSort = other.PlanOrderSort;
    this.PlanOrderSortAscending = other.PlanOrderSortAscending;
    this.DefOrder = other.DefOrder;
    this.DefOrderFetch = other.DefOrderFetch;
    this.DefOrderSort = other.DefOrderSort;
    this.DefOrderSortAscending = other.DefOrderSortAscending;  }
  /** get the filter for this object's key
   * @return ContractDiscountObjectKeyFilter
   */
  public ContractDiscountObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (ContractDiscountObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyFilter ();
    this.Key.DiscountIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.DiscountIdFetch;
  }
  /** Set the SortOrder for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyFilter ();
    this.Key.DiscountIdSort = value;
  }
  /** Retrieve SortOrder for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.DiscountIdSort;
  }
  /** Set the sort direction for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyFilter ();
    this.Key.DiscountIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.DiscountIdSortAscending;
  }
  /** Set the field level filters for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyFilter ();
    this.Key.DiscountId = value;
  }
  /** Retrieve filter for field: DiscountId (DISCOUNT_PLANS.discount_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscountIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.DiscountId;
  }
  /** Set the field level Fetch value for field: ContractType (CONTRACT_TYPES.contract_type)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTypeFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyFilter ();
    this.Key.ContractTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractType (CONTRACT_TYPES.contract_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTypeFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ContractTypeFetch;
  }
  /** Set the SortOrder for field: ContractType (CONTRACT_TYPES.contract_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTypeSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyFilter ();
    this.Key.ContractTypeSort = value;
  }
  /** Retrieve SortOrder for field: ContractType (CONTRACT_TYPES.contract_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTypeSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ContractTypeSort;
  }
  /** Set the sort direction for field: ContractType (CONTRACT_TYPES.contract_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTypeSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyFilter ();
    this.Key.ContractTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractType (CONTRACT_TYPES.contract_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTypeSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ContractTypeSortAscending;
  }
  /** Set the field level filters for field: ContractType (CONTRACT_TYPES.contract_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTypeFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new ContractDiscountObjectKeyFilter ();
    this.Key.ContractType = value;
  }
  /** Retrieve filter for field: ContractType (CONTRACT_TYPES.contract_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractTypeFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ContractType;
  }
  /** Set the field level Fetch value for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @param fetch whether to fetch this field or not
   */
  public void setContractCategoryFetch (boolean fetch) {
    this.ContractCategoryFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractCategoryFetch () {
    return this.ContractCategoryFetch;
  }
  /** Set the SortOrder for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractCategorySortOrder (Integer value) {
    this.ContractCategorySort = value;
  }
  /** Retrieve SortOrder for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractCategorySortOrder () {
    return this.ContractCategorySort;
  }
  /** Set the sort direction for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractCategorySortDirection (boolean ascending) {
    this.ContractCategorySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractCategorySortDirection () {
    return this.ContractCategorySortAscending;
  }
  /** Set the field level filters for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractCategoryFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractCategory = value;
  }
  /** Retrieve filter for field: ContractCategory (CONTRACT_TYPES.contract_category)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractCategoryFilter () {
    return this.ContractCategory;
  }

  /**
   * Retrieves the ContractCategoryFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractCategoryFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractCategoryFilter field
   */
  public String[] getContractCategoryFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractCategoryFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractCategoryFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractCategoryFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractCategoryFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractCategoryFilter filter value from a formatted string
   *
   * @param _value the ContractCategoryFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractCategoryFilter filter field
   */
  public void setContractCategoryFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractCategoryFilterFromFormattedString");
    try {
      this.setContractCategoryFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractCategoryFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractCategoryFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractCategoryFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ElementId (CONTRACT_TYPES.element_id)
   * @param fetch whether to fetch this field or not
   */
  public void setElementIdFetch (boolean fetch) {
    this.ElementIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ElementId (CONTRACT_TYPES.element_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getElementIdFetch () {
    return this.ElementIdFetch;
  }
  /** Set the SortOrder for field: ElementId (CONTRACT_TYPES.element_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setElementIdSortOrder (Integer value) {
    this.ElementIdSort = value;
  }
  /** Retrieve SortOrder for field: ElementId (CONTRACT_TYPES.element_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getElementIdSortOrder () {
    return this.ElementIdSort;
  }
  /** Set the sort direction for field: ElementId (CONTRACT_TYPES.element_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setElementIdSortDirection (boolean ascending) {
    this.ElementIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ElementId (CONTRACT_TYPES.element_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getElementIdSortDirection () {
    return this.ElementIdSortAscending;
  }
  /** Set the field level filters for field: ElementId (CONTRACT_TYPES.element_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setElementIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ElementId = value;
  }
  /** Retrieve filter for field: ElementId (CONTRACT_TYPES.element_id)
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

  /** Set the field level Fetch value for field: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * @param fetch whether to fetch this field or not
   */
  public void setCommitmentReferenceFetch (boolean fetch) {
    this.CommitmentReferenceFetch = fetch;
  }
  /** Retrieve Fetch value for field: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * @return boolean the Fetch value for this field
   */
  public boolean getCommitmentReferenceFetch () {
    return this.CommitmentReferenceFetch;
  }
  /** Set the SortOrder for field: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCommitmentReferenceSortOrder (Integer value) {
    this.CommitmentReferenceSort = value;
  }
  /** Retrieve SortOrder for field: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCommitmentReferenceSortOrder () {
    return this.CommitmentReferenceSort;
  }
  /** Set the sort direction for field: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCommitmentReferenceSortDirection (boolean ascending) {
    this.CommitmentReferenceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCommitmentReferenceSortDirection () {
    return this.CommitmentReferenceSortAscending;
  }
  /** Set the field level filters for field: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCommitmentReferenceFilter (IntegerFilter[] value) throws ServiceException {
    this.CommitmentReference = value;
  }
  /** Retrieve filter for field: CommitmentReference (CONTRACT_TYPES.commitment_reference)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCommitmentReferenceFilter () {
    return this.CommitmentReference;
  }

  /**
   * Retrieves the CommitmentReferenceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommitmentReferenceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentReferenceFilter field
   */
  public String[] getCommitmentReferenceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCommitmentReferenceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReferenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CommitmentReferenceFilter filter value from a formatted string
   *
   * @param _value the CommitmentReferenceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentReferenceFilter filter field
   */
  public void setCommitmentReferenceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentReferenceFilterFromFormattedString");
    try {
      this.setCommitmentReferenceFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReferenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentReferenceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentReferenceFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DurationUnits (CONTRACT_TYPES.duration_units)
   * @param fetch whether to fetch this field or not
   */
  public void setDurationUnitsFetch (boolean fetch) {
    this.DurationUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: DurationUnits (CONTRACT_TYPES.duration_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getDurationUnitsFetch () {
    return this.DurationUnitsFetch;
  }
  /** Set the SortOrder for field: DurationUnits (CONTRACT_TYPES.duration_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDurationUnitsSortOrder (Integer value) {
    this.DurationUnitsSort = value;
  }
  /** Retrieve SortOrder for field: DurationUnits (CONTRACT_TYPES.duration_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDurationUnitsSortOrder () {
    return this.DurationUnitsSort;
  }
  /** Set the sort direction for field: DurationUnits (CONTRACT_TYPES.duration_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDurationUnitsSortDirection (boolean ascending) {
    this.DurationUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DurationUnits (CONTRACT_TYPES.duration_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDurationUnitsSortDirection () {
    return this.DurationUnitsSortAscending;
  }
  /** Set the field level filters for field: DurationUnits (CONTRACT_TYPES.duration_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDurationUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.DurationUnits = value;
  }
  /** Retrieve filter for field: DurationUnits (CONTRACT_TYPES.duration_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDurationUnitsFilter () {
    return this.DurationUnits;
  }

  /**
   * Retrieves the DurationUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DurationUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DurationUnitsFilter field
   */
  public String[] getDurationUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDurationUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDurationUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DurationUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDurationUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DurationUnitsFilter filter value from a formatted string
   *
   * @param _value the DurationUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DurationUnitsFilter filter field
   */
  public void setDurationUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDurationUnitsFilterFromFormattedString");
    try {
      this.setDurationUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DurationUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDurationUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDurationUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Duration (CONTRACT_TYPES.duration)
   * @param fetch whether to fetch this field or not
   */
  public void setDurationFetch (boolean fetch) {
    this.DurationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Duration (CONTRACT_TYPES.duration)
   * @return boolean the Fetch value for this field
   */
  public boolean getDurationFetch () {
    return this.DurationFetch;
  }
  /** Set the SortOrder for field: Duration (CONTRACT_TYPES.duration)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDurationSortOrder (Integer value) {
    this.DurationSort = value;
  }
  /** Retrieve SortOrder for field: Duration (CONTRACT_TYPES.duration)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDurationSortOrder () {
    return this.DurationSort;
  }
  /** Set the sort direction for field: Duration (CONTRACT_TYPES.duration)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDurationSortDirection (boolean ascending) {
    this.DurationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Duration (CONTRACT_TYPES.duration)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDurationSortDirection () {
    return this.DurationSortAscending;
  }
  /** Set the field level filters for field: Duration (CONTRACT_TYPES.duration)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDurationFilter (IntegerFilter[] value) throws ServiceException {
    this.Duration = value;
  }
  /** Retrieve filter for field: Duration (CONTRACT_TYPES.duration)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDurationFilter () {
    return this.Duration;
  }

  /**
   * Retrieves the DurationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DurationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DurationFilter field
   */
  public String[] getDurationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDurationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDurationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DurationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDurationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DurationFilter filter value from a formatted string
   *
   * @param _value the DurationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DurationFilter filter field
   */
  public void setDurationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDurationFilterFromFormattedString");
    try {
      this.setDurationFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DurationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDurationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDurationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * @param fetch whether to fetch this field or not
   */
  public void setPlanIdDiscountFetch (boolean fetch) {
    this.PlanIdDiscountFetch = fetch;
  }
  /** Retrieve Fetch value for field: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * @return boolean the Fetch value for this field
   */
  public boolean getPlanIdDiscountFetch () {
    return this.PlanIdDiscountFetch;
  }
  /** Set the SortOrder for field: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPlanIdDiscountSortOrder (Integer value) {
    this.PlanIdDiscountSort = value;
  }
  /** Retrieve SortOrder for field: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPlanIdDiscountSortOrder () {
    return this.PlanIdDiscountSort;
  }
  /** Set the sort direction for field: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPlanIdDiscountSortDirection (boolean ascending) {
    this.PlanIdDiscountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPlanIdDiscountSortDirection () {
    return this.PlanIdDiscountSortAscending;
  }
  /** Set the field level filters for field: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPlanIdDiscountFilter (IntegerFilter[] value) throws ServiceException {
    this.PlanIdDiscount = value;
  }
  /** Retrieve filter for field: PlanIdDiscount (CONTRACT_TYPES.plan_id_discount)
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

  /** Set the field level Fetch value for field: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * @param fetch whether to fetch this field or not
   */
  public void setPlanIdCreditFetch (boolean fetch) {
    this.PlanIdCreditFetch = fetch;
  }
  /** Retrieve Fetch value for field: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * @return boolean the Fetch value for this field
   */
  public boolean getPlanIdCreditFetch () {
    return this.PlanIdCreditFetch;
  }
  /** Set the SortOrder for field: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPlanIdCreditSortOrder (Integer value) {
    this.PlanIdCreditSort = value;
  }
  /** Retrieve SortOrder for field: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPlanIdCreditSortOrder () {
    return this.PlanIdCreditSort;
  }
  /** Set the sort direction for field: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPlanIdCreditSortDirection (boolean ascending) {
    this.PlanIdCreditSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPlanIdCreditSortDirection () {
    return this.PlanIdCreditSortAscending;
  }
  /** Set the field level filters for field: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPlanIdCreditFilter (IntegerFilter[] value) throws ServiceException {
    this.PlanIdCredit = value;
  }
  /** Retrieve filter for field: PlanIdCredit (CONTRACT_TYPES.plan_id_credit)
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

  /** Set the field level Fetch value for field: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setActivationTypeIdNrcFetch (boolean fetch) {
    this.ActivationTypeIdNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getActivationTypeIdNrcFetch () {
    return this.ActivationTypeIdNrcFetch;
  }
  /** Set the SortOrder for field: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActivationTypeIdNrcSortOrder (Integer value) {
    this.ActivationTypeIdNrcSort = value;
  }
  /** Retrieve SortOrder for field: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActivationTypeIdNrcSortOrder () {
    return this.ActivationTypeIdNrcSort;
  }
  /** Set the sort direction for field: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActivationTypeIdNrcSortDirection (boolean ascending) {
    this.ActivationTypeIdNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActivationTypeIdNrcSortDirection () {
    return this.ActivationTypeIdNrcSortAscending;
  }
  /** Set the field level filters for field: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActivationTypeIdNrcFilter (IntegerFilter[] value) throws ServiceException {
    this.ActivationTypeIdNrc = value;
  }
  /** Retrieve filter for field: ActivationTypeIdNrc (CONTRACT_TYPES.activation_type_id_nrc)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getActivationTypeIdNrcFilter () {
    return this.ActivationTypeIdNrc;
  }

  /**
   * Retrieves the ActivationTypeIdNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActivationTypeIdNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActivationTypeIdNrcFilter field
   */
  public String[] getActivationTypeIdNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActivationTypeIdNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActivationTypeIdNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActivationTypeIdNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActivationTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActivationTypeIdNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActivationTypeIdNrcFilter filter value from a formatted string
   *
   * @param _value the ActivationTypeIdNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActivationTypeIdNrcFilter filter field
   */
  public void setActivationTypeIdNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActivationTypeIdNrcFilterFromFormattedString");
    try {
      this.setActivationTypeIdNrcFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActivationTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActivationTypeIdNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActivationTypeIdNrcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setTerminationTypeIdNrcFetch (boolean fetch) {
    this.TerminationTypeIdNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getTerminationTypeIdNrcFetch () {
    return this.TerminationTypeIdNrcFetch;
  }
  /** Set the SortOrder for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTerminationTypeIdNrcSortOrder (Integer value) {
    this.TerminationTypeIdNrcSort = value;
  }
  /** Retrieve SortOrder for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTerminationTypeIdNrcSortOrder () {
    return this.TerminationTypeIdNrcSort;
  }
  /** Set the sort direction for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTerminationTypeIdNrcSortDirection (boolean ascending) {
    this.TerminationTypeIdNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTerminationTypeIdNrcSortDirection () {
    return this.TerminationTypeIdNrcSortAscending;
  }
  /** Set the field level filters for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTerminationTypeIdNrcFilter (IntegerFilter[] value) throws ServiceException {
    this.TerminationTypeIdNrc = value;
  }
  /** Retrieve filter for field: TerminationTypeIdNrc (CONTRACT_TYPES.termination_type_id_nrc)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTerminationTypeIdNrcFilter () {
    return this.TerminationTypeIdNrc;
  }

  /**
   * Retrieves the TerminationTypeIdNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TerminationTypeIdNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TerminationTypeIdNrcFilter field
   */
  public String[] getTerminationTypeIdNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTerminationTypeIdNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTerminationTypeIdNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTerminationTypeIdNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TerminationTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTerminationTypeIdNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TerminationTypeIdNrcFilter filter value from a formatted string
   *
   * @param _value the TerminationTypeIdNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TerminationTypeIdNrcFilter filter field
   */
  public void setTerminationTypeIdNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTerminationTypeIdNrcFilterFromFormattedString");
    try {
      this.setTerminationTypeIdNrcFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TerminationTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTerminationTypeIdNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTerminationTypeIdNrcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsPromotion (CONTRACT_TYPES.is_promotion)
   * @param fetch whether to fetch this field or not
   */
  public void setIsPromotionFetch (boolean fetch) {
    this.IsPromotionFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsPromotion (CONTRACT_TYPES.is_promotion)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsPromotionFetch () {
    return this.IsPromotionFetch;
  }
  /** Set the SortOrder for field: IsPromotion (CONTRACT_TYPES.is_promotion)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsPromotionSortOrder (Integer value) {
    this.IsPromotionSort = value;
  }
  /** Retrieve SortOrder for field: IsPromotion (CONTRACT_TYPES.is_promotion)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsPromotionSortOrder () {
    return this.IsPromotionSort;
  }
  /** Set the sort direction for field: IsPromotion (CONTRACT_TYPES.is_promotion)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsPromotionSortDirection (boolean ascending) {
    this.IsPromotionSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsPromotion (CONTRACT_TYPES.is_promotion)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsPromotionSortDirection () {
    return this.IsPromotionSortAscending;
  }
  /** Set the field level filters for field: IsPromotion (CONTRACT_TYPES.is_promotion)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsPromotionFilter (BooleanFilter[] value) throws ServiceException {
    this.IsPromotion = value;
  }
  /** Retrieve filter for field: IsPromotion (CONTRACT_TYPES.is_promotion)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsPromotionFilter () {
    return this.IsPromotion;
  }

  /**
   * Retrieves the IsPromotionFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsPromotionFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPromotionFilter field
   */
  public String[] getIsPromotionFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPromotionFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsPromotionFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPromotionFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPromotionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPromotionFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsPromotionFilter filter value from a formatted string
   *
   * @param _value the IsPromotionFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsPromotionFilter filter field
   */
  public void setIsPromotionFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsPromotionFilterFromFormattedString");
    try {
      this.setIsPromotionFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPromotionFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPromotionFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPromotionFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @param fetch whether to fetch this field or not
   */
  public void setDescriptionCodeFetch (boolean fetch) {
    this.DescriptionCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getDescriptionCodeFetch () {
    return this.DescriptionCodeFetch;
  }
  /** Set the SortOrder for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDescriptionCodeSortOrder (Integer value) {
    this.DescriptionCodeSort = value;
  }
  /** Retrieve SortOrder for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDescriptionCodeSortOrder () {
    return this.DescriptionCodeSort;
  }
  /** Set the sort direction for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDescriptionCodeSortDirection (boolean ascending) {
    this.DescriptionCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDescriptionCodeSortDirection () {
    return this.DescriptionCodeSortAscending;
  }
  /** Set the field level filters for field: DescriptionCode (CONTRACT_TYPES.description_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDescriptionCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.DescriptionCode = value;
  }
  /** Retrieve filter for field: DescriptionCode (CONTRACT_TYPES.description_code)
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

  /** Set the field level Fetch value for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @param fetch whether to fetch this field or not
   */
  public void setForeignCodeFetch (boolean fetch) {
    this.ForeignCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getForeignCodeFetch () {
    return this.ForeignCodeFetch;
  }
  /** Set the SortOrder for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setForeignCodeSortOrder (Integer value) {
    this.ForeignCodeSort = value;
  }
  /** Retrieve SortOrder for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getForeignCodeSortOrder () {
    return this.ForeignCodeSort;
  }
  /** Set the sort direction for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setForeignCodeSortDirection (boolean ascending) {
    this.ForeignCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getForeignCodeSortDirection () {
    return this.ForeignCodeSortAscending;
  }
  /** Set the case insensitive for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setForeignCodeCaseInsensitive (boolean ascending) {
    this.ForeignCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getForeignCodeCaseInsensitive () {
    return this.ForeignCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setForeignCodeFilter (StringFilter[] value) throws ServiceException {
    this.ForeignCode = value;
  }
  /** Retrieve filter for field: ForeignCode (CONTRACT_TYPES.foreign_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getForeignCodeFilter () {
    return this.ForeignCode;
  }

  /**
   * Retrieves the ForeignCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ForeignCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ForeignCodeFilter field
   */
  public String[] getForeignCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getForeignCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getForeignCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getForeignCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ForeignCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getForeignCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ForeignCodeFilter filter value from a formatted string
   *
   * @param _value the ForeignCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ForeignCodeFilter filter field
   */
  public void setForeignCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setForeignCodeFilterFromFormattedString");
    try {
      this.setForeignCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ForeignCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setForeignCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setForeignCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StartByUnits (CONTRACT_TYPES.start_by_units)
   * @param fetch whether to fetch this field or not
   */
  public void setStartByUnitsFetch (boolean fetch) {
    this.StartByUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartByUnits (CONTRACT_TYPES.start_by_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartByUnitsFetch () {
    return this.StartByUnitsFetch;
  }
  /** Set the SortOrder for field: StartByUnits (CONTRACT_TYPES.start_by_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartByUnitsSortOrder (Integer value) {
    this.StartByUnitsSort = value;
  }
  /** Retrieve SortOrder for field: StartByUnits (CONTRACT_TYPES.start_by_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartByUnitsSortOrder () {
    return this.StartByUnitsSort;
  }
  /** Set the sort direction for field: StartByUnits (CONTRACT_TYPES.start_by_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartByUnitsSortDirection (boolean ascending) {
    this.StartByUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartByUnits (CONTRACT_TYPES.start_by_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartByUnitsSortDirection () {
    return this.StartByUnitsSortAscending;
  }
  /** Set the field level filters for field: StartByUnits (CONTRACT_TYPES.start_by_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartByUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.StartByUnits = value;
  }
  /** Retrieve filter for field: StartByUnits (CONTRACT_TYPES.start_by_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStartByUnitsFilter () {
    return this.StartByUnits;
  }

  /**
   * Retrieves the StartByUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartByUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartByUnitsFilter field
   */
  public String[] getStartByUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartByUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartByUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartByUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StartByUnitsFilter filter value from a formatted string
   *
   * @param _value the StartByUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartByUnitsFilter filter field
   */
  public void setStartByUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartByUnitsFilterFromFormattedString");
    try {
      this.setStartByUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartByUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartByUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StartBy (CONTRACT_TYPES.start_by)
   * @param fetch whether to fetch this field or not
   */
  public void setStartByFetch (boolean fetch) {
    this.StartByFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartBy (CONTRACT_TYPES.start_by)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartByFetch () {
    return this.StartByFetch;
  }
  /** Set the SortOrder for field: StartBy (CONTRACT_TYPES.start_by)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartBySortOrder (Integer value) {
    this.StartBySort = value;
  }
  /** Retrieve SortOrder for field: StartBy (CONTRACT_TYPES.start_by)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartBySortOrder () {
    return this.StartBySort;
  }
  /** Set the sort direction for field: StartBy (CONTRACT_TYPES.start_by)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartBySortDirection (boolean ascending) {
    this.StartBySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartBy (CONTRACT_TYPES.start_by)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartBySortDirection () {
    return this.StartBySortAscending;
  }
  /** Set the field level filters for field: StartBy (CONTRACT_TYPES.start_by)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartByFilter (IntegerFilter[] value) throws ServiceException {
    this.StartBy = value;
  }
  /** Retrieve filter for field: StartBy (CONTRACT_TYPES.start_by)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getStartByFilter () {
    return this.StartBy;
  }

  /**
   * Retrieves the StartByFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartByFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartByFilter field
   */
  public String[] getStartByFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartByFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartByFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartByFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StartByFilter filter value from a formatted string
   *
   * @param _value the StartByFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartByFilter filter field
   */
  public void setStartByFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartByFilterFromFormattedString");
    try {
      this.setStartByFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartByFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartByFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ActiveDate (CONTRACT_TYPES.active_date)
   * @param fetch whether to fetch this field or not
   */
  public void setActiveDateFetch (boolean fetch) {
    this.ActiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActiveDate (CONTRACT_TYPES.active_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getActiveDateFetch () {
    return this.ActiveDateFetch;
  }
  /** Set the SortOrder for field: ActiveDate (CONTRACT_TYPES.active_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActiveDateSortOrder (Integer value) {
    this.ActiveDateSort = value;
  }
  /** Retrieve SortOrder for field: ActiveDate (CONTRACT_TYPES.active_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActiveDateSortOrder () {
    return this.ActiveDateSort;
  }
  /** Set the sort direction for field: ActiveDate (CONTRACT_TYPES.active_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActiveDateSortDirection (boolean ascending) {
    this.ActiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActiveDate (CONTRACT_TYPES.active_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActiveDateSortDirection () {
    return this.ActiveDateSortAscending;
  }
  /** Set the field level filters for field: ActiveDate (CONTRACT_TYPES.active_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActiveDateFilter (DateFilter[] value) throws ServiceException {
    this.ActiveDate = value;
  }
  /** Retrieve filter for field: ActiveDate (CONTRACT_TYPES.active_date)
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


  /** Set the field level Fetch value for field: InactiveDate (CONTRACT_TYPES.inactive_date)
   * @param fetch whether to fetch this field or not
   */
  public void setInactiveDateFetch (boolean fetch) {
    this.InactiveDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: InactiveDate (CONTRACT_TYPES.inactive_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getInactiveDateFetch () {
    return this.InactiveDateFetch;
  }
  /** Set the SortOrder for field: InactiveDate (CONTRACT_TYPES.inactive_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInactiveDateSortOrder (Integer value) {
    this.InactiveDateSort = value;
  }
  /** Retrieve SortOrder for field: InactiveDate (CONTRACT_TYPES.inactive_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInactiveDateSortOrder () {
    return this.InactiveDateSort;
  }
  /** Set the sort direction for field: InactiveDate (CONTRACT_TYPES.inactive_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInactiveDateSortDirection (boolean ascending) {
    this.InactiveDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InactiveDate (CONTRACT_TYPES.inactive_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInactiveDateSortDirection () {
    return this.InactiveDateSortAscending;
  }
  /** Set the field level filters for field: InactiveDate (CONTRACT_TYPES.inactive_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInactiveDateFilter (DateFilter[] value) throws ServiceException {
    this.InactiveDate = value;
  }
  /** Retrieve filter for field: InactiveDate (CONTRACT_TYPES.inactive_date)
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


  /** Set the field level Fetch value for field: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * @param fetch whether to fetch this field or not
   */
  public void setFixedStartDateFetch (boolean fetch) {
    this.FixedStartDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getFixedStartDateFetch () {
    return this.FixedStartDateFetch;
  }
  /** Set the SortOrder for field: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFixedStartDateSortOrder (Integer value) {
    this.FixedStartDateSort = value;
  }
  /** Retrieve SortOrder for field: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFixedStartDateSortOrder () {
    return this.FixedStartDateSort;
  }
  /** Set the sort direction for field: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFixedStartDateSortDirection (boolean ascending) {
    this.FixedStartDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFixedStartDateSortDirection () {
    return this.FixedStartDateSortAscending;
  }
  /** Set the field level filters for field: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFixedStartDateFilter (DateFilter[] value) throws ServiceException {
    this.FixedStartDate = value;
  }
  /** Retrieve filter for field: FixedStartDate (CONTRACT_TYPES.fixed_start_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getFixedStartDateFilter () {
    return this.FixedStartDate;
  }

  /**
   * Retrieves the FixedStartDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedStartDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedStartDateFilter field
   */
  public String[] getFixedStartDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedStartDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFixedStartDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedStartDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedStartDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedStartDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FixedStartDateFilter filter value from a formatted string
   *
   * @param _value the FixedStartDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FixedStartDateFilter filter field
   */
  public void setFixedStartDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedStartDateFilterFromFormattedString");
    try {
      this.setFixedStartDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedStartDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedStartDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedStartDateFilterFromFormattedString");
  }

  /**
   * Retrieves the FixedStartDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedStartDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedStartDateFilter field
   */
  public String[] getFixedStartDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedStartDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFixedStartDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedStartDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedStartDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedStartDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FixedStartDateFilter filter value from a formatted string
   *
   * @param _value the FixedStartDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FixedStartDateFilter filter field
   */
  public void setFixedStartDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedStartDateFilterFromFormattedDateTimeString");
    try {
      this.setFixedStartDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedStartDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedStartDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedStartDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * @param fetch whether to fetch this field or not
   */
  public void setFixedEndDateFetch (boolean fetch) {
    this.FixedEndDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getFixedEndDateFetch () {
    return this.FixedEndDateFetch;
  }
  /** Set the SortOrder for field: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFixedEndDateSortOrder (Integer value) {
    this.FixedEndDateSort = value;
  }
  /** Retrieve SortOrder for field: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFixedEndDateSortOrder () {
    return this.FixedEndDateSort;
  }
  /** Set the sort direction for field: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFixedEndDateSortDirection (boolean ascending) {
    this.FixedEndDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFixedEndDateSortDirection () {
    return this.FixedEndDateSortAscending;
  }
  /** Set the field level filters for field: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFixedEndDateFilter (DateFilter[] value) throws ServiceException {
    this.FixedEndDate = value;
  }
  /** Retrieve filter for field: FixedEndDate (CONTRACT_TYPES.fixed_end_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getFixedEndDateFilter () {
    return this.FixedEndDate;
  }

  /**
   * Retrieves the FixedEndDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedEndDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedEndDateFilter field
   */
  public String[] getFixedEndDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedEndDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFixedEndDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedEndDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedEndDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedEndDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FixedEndDateFilter filter value from a formatted string
   *
   * @param _value the FixedEndDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FixedEndDateFilter filter field
   */
  public void setFixedEndDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedEndDateFilterFromFormattedString");
    try {
      this.setFixedEndDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedEndDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedEndDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedEndDateFilterFromFormattedString");
  }

  /**
   * Retrieves the FixedEndDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FixedEndDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FixedEndDateFilter field
   */
  public String[] getFixedEndDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFixedEndDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFixedEndDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFixedEndDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedEndDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFixedEndDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FixedEndDateFilter filter value from a formatted string
   *
   * @param _value the FixedEndDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FixedEndDateFilter filter field
   */
  public void setFixedEndDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFixedEndDateFilterFromFormattedDateTimeString");
    try {
      this.setFixedEndDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FixedEndDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFixedEndDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFixedEndDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PartialPeriod (CONTRACT_TYPES.partial_period)
   * @param fetch whether to fetch this field or not
   */
  public void setPartialPeriodFetch (boolean fetch) {
    this.PartialPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: PartialPeriod (CONTRACT_TYPES.partial_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getPartialPeriodFetch () {
    return this.PartialPeriodFetch;
  }
  /** Set the SortOrder for field: PartialPeriod (CONTRACT_TYPES.partial_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPartialPeriodSortOrder (Integer value) {
    this.PartialPeriodSort = value;
  }
  /** Retrieve SortOrder for field: PartialPeriod (CONTRACT_TYPES.partial_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPartialPeriodSortOrder () {
    return this.PartialPeriodSort;
  }
  /** Set the sort direction for field: PartialPeriod (CONTRACT_TYPES.partial_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPartialPeriodSortDirection (boolean ascending) {
    this.PartialPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PartialPeriod (CONTRACT_TYPES.partial_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPartialPeriodSortDirection () {
    return this.PartialPeriodSortAscending;
  }
  /** Set the field level filters for field: PartialPeriod (CONTRACT_TYPES.partial_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPartialPeriodFilter (BooleanFilter[] value) throws ServiceException {
    this.PartialPeriod = value;
  }
  /** Retrieve filter for field: PartialPeriod (CONTRACT_TYPES.partial_period)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getPartialPeriodFilter () {
    return this.PartialPeriod;
  }

  /**
   * Retrieves the PartialPeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PartialPeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PartialPeriodFilter field
   */
  public String[] getPartialPeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPartialPeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPartialPeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPartialPeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PartialPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPartialPeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PartialPeriodFilter filter value from a formatted string
   *
   * @param _value the PartialPeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PartialPeriodFilter filter field
   */
  public void setPartialPeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPartialPeriodFilterFromFormattedString");
    try {
      this.setPartialPeriodFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PartialPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPartialPeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPartialPeriodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @param fetch whether to fetch this field or not
   */
  public void setCommitmentTypeIdNrcFetch (boolean fetch) {
    this.CommitmentTypeIdNrcFetch = fetch;
  }
  /** Retrieve Fetch value for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return boolean the Fetch value for this field
   */
  public boolean getCommitmentTypeIdNrcFetch () {
    return this.CommitmentTypeIdNrcFetch;
  }
  /** Set the SortOrder for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCommitmentTypeIdNrcSortOrder (Integer value) {
    this.CommitmentTypeIdNrcSort = value;
  }
  /** Retrieve SortOrder for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCommitmentTypeIdNrcSortOrder () {
    return this.CommitmentTypeIdNrcSort;
  }
  /** Set the sort direction for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCommitmentTypeIdNrcSortDirection (boolean ascending) {
    this.CommitmentTypeIdNrcSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCommitmentTypeIdNrcSortDirection () {
    return this.CommitmentTypeIdNrcSortAscending;
  }
  /** Set the field level filters for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCommitmentTypeIdNrcFilter (IntegerFilter[] value) throws ServiceException {
    this.CommitmentTypeIdNrc = value;
  }
  /** Retrieve filter for field: CommitmentTypeIdNrc (CONTRACT_TYPES.commitment_type_id_nrc)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCommitmentTypeIdNrcFilter () {
    return this.CommitmentTypeIdNrc;
  }

  /**
   * Retrieves the CommitmentTypeIdNrcFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommitmentTypeIdNrcFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentTypeIdNrcFilter field
   */
  public String[] getCommitmentTypeIdNrcFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentTypeIdNrcFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCommitmentTypeIdNrcFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentTypeIdNrcFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentTypeIdNrcFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CommitmentTypeIdNrcFilter filter value from a formatted string
   *
   * @param _value the CommitmentTypeIdNrcFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentTypeIdNrcFilter filter field
   */
  public void setCommitmentTypeIdNrcFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentTypeIdNrcFilterFromFormattedString");
    try {
      this.setCommitmentTypeIdNrcFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentTypeIdNrcFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentTypeIdNrcFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentTypeIdNrcFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * @param fetch whether to fetch this field or not
   */
  public void setDiscountBasePeriodFetch (boolean fetch) {
    this.DiscountBasePeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getDiscountBasePeriodFetch () {
    return this.DiscountBasePeriodFetch;
  }
  /** Set the SortOrder for field: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDiscountBasePeriodSortOrder (Integer value) {
    this.DiscountBasePeriodSort = value;
  }
  /** Retrieve SortOrder for field: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDiscountBasePeriodSortOrder () {
    return this.DiscountBasePeriodSort;
  }
  /** Set the sort direction for field: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDiscountBasePeriodSortDirection (boolean ascending) {
    this.DiscountBasePeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDiscountBasePeriodSortDirection () {
    return this.DiscountBasePeriodSortAscending;
  }
  /** Set the field level filters for field: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDiscountBasePeriodFilter (IntegerFilter[] value) throws ServiceException {
    this.DiscountBasePeriod = value;
  }
  /** Retrieve filter for field: DiscountBasePeriod (CONTRACT_TYPES.discount_base_period)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDiscountBasePeriodFilter () {
    return this.DiscountBasePeriod;
  }

  /**
   * Retrieves the DiscountBasePeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DiscountBasePeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiscountBasePeriodFilter field
   */
  public String[] getDiscountBasePeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiscountBasePeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDiscountBasePeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiscountBasePeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountBasePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiscountBasePeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DiscountBasePeriodFilter filter value from a formatted string
   *
   * @param _value the DiscountBasePeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DiscountBasePeriodFilter filter field
   */
  public void setDiscountBasePeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDiscountBasePeriodFilterFromFormattedString");
    try {
      this.setDiscountBasePeriodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DiscountBasePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiscountBasePeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiscountBasePeriodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * @param fetch whether to fetch this field or not
   */
  public void setRolloverOrderFetch (boolean fetch) {
    this.RolloverOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getRolloverOrderFetch () {
    return this.RolloverOrderFetch;
  }
  /** Set the SortOrder for field: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRolloverOrderSortOrder (Integer value) {
    this.RolloverOrderSort = value;
  }
  /** Retrieve SortOrder for field: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRolloverOrderSortOrder () {
    return this.RolloverOrderSort;
  }
  /** Set the sort direction for field: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRolloverOrderSortDirection (boolean ascending) {
    this.RolloverOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRolloverOrderSortDirection () {
    return this.RolloverOrderSortAscending;
  }
  /** Set the field level filters for field: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRolloverOrderFilter (IntegerFilter[] value) throws ServiceException {
    this.RolloverOrder = value;
  }
  /** Retrieve filter for field: RolloverOrder (CONTRACT_TYPES.rollover_order)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRolloverOrderFilter () {
    return this.RolloverOrder;
  }

  /**
   * Retrieves the RolloverOrderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RolloverOrderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RolloverOrderFilter field
   */
  public String[] getRolloverOrderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverOrderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRolloverOrderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverOrderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverOrderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RolloverOrderFilter filter value from a formatted string
   *
   * @param _value the RolloverOrderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RolloverOrderFilter filter field
   */
  public void setRolloverOrderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRolloverOrderFilterFromFormattedString");
    try {
      this.setRolloverOrderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverOrderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRolloverOrderFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * @param fetch whether to fetch this field or not
   */
  public void setRolloverGroupingFetch (boolean fetch) {
    this.RolloverGroupingFetch = fetch;
  }
  /** Retrieve Fetch value for field: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * @return boolean the Fetch value for this field
   */
  public boolean getRolloverGroupingFetch () {
    return this.RolloverGroupingFetch;
  }
  /** Set the SortOrder for field: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRolloverGroupingSortOrder (Integer value) {
    this.RolloverGroupingSort = value;
  }
  /** Retrieve SortOrder for field: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRolloverGroupingSortOrder () {
    return this.RolloverGroupingSort;
  }
  /** Set the sort direction for field: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRolloverGroupingSortDirection (boolean ascending) {
    this.RolloverGroupingSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRolloverGroupingSortDirection () {
    return this.RolloverGroupingSortAscending;
  }
  /** Set the field level filters for field: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRolloverGroupingFilter (IntegerFilter[] value) throws ServiceException {
    this.RolloverGrouping = value;
  }
  /** Retrieve filter for field: RolloverGrouping (CONTRACT_TYPES.rollover_grouping)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRolloverGroupingFilter () {
    return this.RolloverGrouping;
  }

  /**
   * Retrieves the RolloverGroupingFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RolloverGroupingFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RolloverGroupingFilter field
   */
  public String[] getRolloverGroupingFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverGroupingFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRolloverGroupingFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverGroupingFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverGroupingFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverGroupingFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RolloverGroupingFilter filter value from a formatted string
   *
   * @param _value the RolloverGroupingFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RolloverGroupingFilter filter field
   */
  public void setRolloverGroupingFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRolloverGroupingFilterFromFormattedString");
    try {
      this.setRolloverGroupingFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverGroupingFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverGroupingFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRolloverGroupingFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBonusPointIdFetch (boolean fetch) {
    this.BonusPointIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBonusPointIdFetch () {
    return this.BonusPointIdFetch;
  }
  /** Set the SortOrder for field: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBonusPointIdSortOrder (Integer value) {
    this.BonusPointIdSort = value;
  }
  /** Retrieve SortOrder for field: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBonusPointIdSortOrder () {
    return this.BonusPointIdSort;
  }
  /** Set the sort direction for field: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBonusPointIdSortDirection (boolean ascending) {
    this.BonusPointIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBonusPointIdSortDirection () {
    return this.BonusPointIdSortAscending;
  }
  /** Set the field level filters for field: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBonusPointIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BonusPointId = value;
  }
  /** Retrieve filter for field: BonusPointId (CONTRACT_TYPES.bonus_point_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBonusPointIdFilter () {
    return this.BonusPointId;
  }

  /**
   * Retrieves the BonusPointIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BonusPointIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BonusPointIdFilter field
   */
  public String[] getBonusPointIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBonusPointIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBonusPointIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBonusPointIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBonusPointIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BonusPointIdFilter filter value from a formatted string
   *
   * @param _value the BonusPointIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BonusPointIdFilter filter field
   */
  public void setBonusPointIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBonusPointIdFilterFromFormattedString");
    try {
      this.setBonusPointIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BonusPointIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBonusPointIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBonusPointIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateContractStartFetch (boolean fetch) {
    this.ProrateContractStartFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateContractStartFetch () {
    return this.ProrateContractStartFetch;
  }
  /** Set the SortOrder for field: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateContractStartSortOrder (Integer value) {
    this.ProrateContractStartSort = value;
  }
  /** Retrieve SortOrder for field: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateContractStartSortOrder () {
    return this.ProrateContractStartSort;
  }
  /** Set the sort direction for field: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateContractStartSortDirection (boolean ascending) {
    this.ProrateContractStartSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateContractStartSortDirection () {
    return this.ProrateContractStartSortAscending;
  }
  /** Set the field level filters for field: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateContractStartFilter (BooleanFilter[] value) throws ServiceException {
    this.ProrateContractStart = value;
  }
  /** Retrieve filter for field: ProrateContractStart (CONTRACT_TYPES.prorate_contract_start)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getProrateContractStartFilter () {
    return this.ProrateContractStart;
  }

  /**
   * Retrieves the ProrateContractStartFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateContractStartFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateContractStartFilter field
   */
  public String[] getProrateContractStartFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractStartFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateContractStartFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateContractStartFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateContractStartFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateContractStartFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateContractStartFilter filter value from a formatted string
   *
   * @param _value the ProrateContractStartFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateContractStartFilter filter field
   */
  public void setProrateContractStartFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateContractStartFilterFromFormattedString");
    try {
      this.setProrateContractStartFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateContractStartFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateContractStartFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateContractStartFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateContractEndFetch (boolean fetch) {
    this.ProrateContractEndFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateContractEndFetch () {
    return this.ProrateContractEndFetch;
  }
  /** Set the SortOrder for field: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateContractEndSortOrder (Integer value) {
    this.ProrateContractEndSort = value;
  }
  /** Retrieve SortOrder for field: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateContractEndSortOrder () {
    return this.ProrateContractEndSort;
  }
  /** Set the sort direction for field: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateContractEndSortDirection (boolean ascending) {
    this.ProrateContractEndSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateContractEndSortDirection () {
    return this.ProrateContractEndSortAscending;
  }
  /** Set the field level filters for field: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateContractEndFilter (BooleanFilter[] value) throws ServiceException {
    this.ProrateContractEnd = value;
  }
  /** Retrieve filter for field: ProrateContractEnd (CONTRACT_TYPES.prorate_contract_end)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getProrateContractEndFilter () {
    return this.ProrateContractEnd;
  }

  /**
   * Retrieves the ProrateContractEndFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateContractEndFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateContractEndFilter field
   */
  public String[] getProrateContractEndFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractEndFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateContractEndFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateContractEndFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateContractEndFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateContractEndFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateContractEndFilter filter value from a formatted string
   *
   * @param _value the ProrateContractEndFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateContractEndFilter filter field
   */
  public void setProrateContractEndFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateContractEndFilterFromFormattedString");
    try {
      this.setProrateContractEndFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateContractEndFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateContractEndFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateContractEndFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateInterimBillFetch (boolean fetch) {
    this.ProrateInterimBillFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateInterimBillFetch () {
    return this.ProrateInterimBillFetch;
  }
  /** Set the SortOrder for field: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateInterimBillSortOrder (Integer value) {
    this.ProrateInterimBillSort = value;
  }
  /** Retrieve SortOrder for field: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateInterimBillSortOrder () {
    return this.ProrateInterimBillSort;
  }
  /** Set the sort direction for field: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateInterimBillSortDirection (boolean ascending) {
    this.ProrateInterimBillSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateInterimBillSortDirection () {
    return this.ProrateInterimBillSortAscending;
  }
  /** Set the field level filters for field: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateInterimBillFilter (BooleanFilter[] value) throws ServiceException {
    this.ProrateInterimBill = value;
  }
  /** Retrieve filter for field: ProrateInterimBill (CONTRACT_TYPES.prorate_interim_bill)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getProrateInterimBillFilter () {
    return this.ProrateInterimBill;
  }

  /**
   * Retrieves the ProrateInterimBillFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateInterimBillFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateInterimBillFilter field
   */
  public String[] getProrateInterimBillFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateInterimBillFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateInterimBillFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateInterimBillFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateInterimBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateInterimBillFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateInterimBillFilter filter value from a formatted string
   *
   * @param _value the ProrateInterimBillFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateInterimBillFilter filter field
   */
  public void setProrateInterimBillFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateInterimBillFilterFromFormattedString");
    try {
      this.setProrateInterimBillFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateInterimBillFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateInterimBillFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateInterimBillFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * @param fetch whether to fetch this field or not
   */
  public void setProratePeriodChangeFetch (boolean fetch) {
    this.ProratePeriodChangeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * @return boolean the Fetch value for this field
   */
  public boolean getProratePeriodChangeFetch () {
    return this.ProratePeriodChangeFetch;
  }
  /** Set the SortOrder for field: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProratePeriodChangeSortOrder (Integer value) {
    this.ProratePeriodChangeSort = value;
  }
  /** Retrieve SortOrder for field: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProratePeriodChangeSortOrder () {
    return this.ProratePeriodChangeSort;
  }
  /** Set the sort direction for field: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProratePeriodChangeSortDirection (boolean ascending) {
    this.ProratePeriodChangeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProratePeriodChangeSortDirection () {
    return this.ProratePeriodChangeSortAscending;
  }
  /** Set the field level filters for field: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProratePeriodChangeFilter (BooleanFilter[] value) throws ServiceException {
    this.ProratePeriodChange = value;
  }
  /** Retrieve filter for field: ProratePeriodChange (CONTRACT_TYPES.prorate_period_change)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getProratePeriodChangeFilter () {
    return this.ProratePeriodChange;
  }

  /**
   * Retrieves the ProratePeriodChangeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProratePeriodChangeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProratePeriodChangeFilter field
   */
  public String[] getProratePeriodChangeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProratePeriodChangeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProratePeriodChangeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProratePeriodChangeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProratePeriodChangeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProratePeriodChangeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProratePeriodChangeFilter filter value from a formatted string
   *
   * @param _value the ProratePeriodChangeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProratePeriodChangeFilter filter field
   */
  public void setProratePeriodChangeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProratePeriodChangeFilterFromFormattedString");
    try {
      this.setProratePeriodChangeFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProratePeriodChangeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProratePeriodChangeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProratePeriodChangeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateAccountStartFetch (boolean fetch) {
    this.ProrateAccountStartFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateAccountStartFetch () {
    return this.ProrateAccountStartFetch;
  }
  /** Set the SortOrder for field: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateAccountStartSortOrder (Integer value) {
    this.ProrateAccountStartSort = value;
  }
  /** Retrieve SortOrder for field: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateAccountStartSortOrder () {
    return this.ProrateAccountStartSort;
  }
  /** Set the sort direction for field: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateAccountStartSortDirection (boolean ascending) {
    this.ProrateAccountStartSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateAccountStartSortDirection () {
    return this.ProrateAccountStartSortAscending;
  }
  /** Set the field level filters for field: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateAccountStartFilter (BooleanFilter[] value) throws ServiceException {
    this.ProrateAccountStart = value;
  }
  /** Retrieve filter for field: ProrateAccountStart (CONTRACT_TYPES.prorate_account_start)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getProrateAccountStartFilter () {
    return this.ProrateAccountStart;
  }

  /**
   * Retrieves the ProrateAccountStartFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateAccountStartFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateAccountStartFilter field
   */
  public String[] getProrateAccountStartFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountStartFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateAccountStartFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateAccountStartFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateAccountStartFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateAccountStartFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateAccountStartFilter filter value from a formatted string
   *
   * @param _value the ProrateAccountStartFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateAccountStartFilter filter field
   */
  public void setProrateAccountStartFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateAccountStartFilterFromFormattedString");
    try {
      this.setProrateAccountStartFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateAccountStartFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateAccountStartFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateAccountStartFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateAccountEndFetch (boolean fetch) {
    this.ProrateAccountEndFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateAccountEndFetch () {
    return this.ProrateAccountEndFetch;
  }
  /** Set the SortOrder for field: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateAccountEndSortOrder (Integer value) {
    this.ProrateAccountEndSort = value;
  }
  /** Retrieve SortOrder for field: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateAccountEndSortOrder () {
    return this.ProrateAccountEndSort;
  }
  /** Set the sort direction for field: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateAccountEndSortDirection (boolean ascending) {
    this.ProrateAccountEndSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateAccountEndSortDirection () {
    return this.ProrateAccountEndSortAscending;
  }
  /** Set the field level filters for field: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateAccountEndFilter (BooleanFilter[] value) throws ServiceException {
    this.ProrateAccountEnd = value;
  }
  /** Retrieve filter for field: ProrateAccountEnd (CONTRACT_TYPES.prorate_account_end)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getProrateAccountEndFilter () {
    return this.ProrateAccountEnd;
  }

  /**
   * Retrieves the ProrateAccountEndFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateAccountEndFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateAccountEndFilter field
   */
  public String[] getProrateAccountEndFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountEndFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateAccountEndFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateAccountEndFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateAccountEndFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateAccountEndFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateAccountEndFilter filter value from a formatted string
   *
   * @param _value the ProrateAccountEndFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateAccountEndFilter filter field
   */
  public void setProrateAccountEndFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateAccountEndFilterFromFormattedString");
    try {
      this.setProrateAccountEndFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateAccountEndFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateAccountEndFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateAccountEndFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateTargetThresholdFetch (boolean fetch) {
    this.ProrateTargetThresholdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateTargetThresholdFetch () {
    return this.ProrateTargetThresholdFetch;
  }
  /** Set the SortOrder for field: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateTargetThresholdSortOrder (Integer value) {
    this.ProrateTargetThresholdSort = value;
  }
  /** Retrieve SortOrder for field: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateTargetThresholdSortOrder () {
    return this.ProrateTargetThresholdSort;
  }
  /** Set the sort direction for field: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateTargetThresholdSortDirection (boolean ascending) {
    this.ProrateTargetThresholdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateTargetThresholdSortDirection () {
    return this.ProrateTargetThresholdSortAscending;
  }
  /** Set the field level filters for field: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateTargetThresholdFilter (BooleanFilter[] value) throws ServiceException {
    this.ProrateTargetThreshold = value;
  }
  /** Retrieve filter for field: ProrateTargetThreshold (CONTRACT_TYPES.prorate_target_threshold)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getProrateTargetThresholdFilter () {
    return this.ProrateTargetThreshold;
  }

  /**
   * Retrieves the ProrateTargetThresholdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateTargetThresholdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateTargetThresholdFilter field
   */
  public String[] getProrateTargetThresholdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTargetThresholdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateTargetThresholdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateTargetThresholdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateTargetThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateTargetThresholdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateTargetThresholdFilter filter value from a formatted string
   *
   * @param _value the ProrateTargetThresholdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateTargetThresholdFilter filter field
   */
  public void setProrateTargetThresholdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateTargetThresholdFilterFromFormattedString");
    try {
      this.setProrateTargetThresholdFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateTargetThresholdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateTargetThresholdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateTargetThresholdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateTargetRebatesFetch (boolean fetch) {
    this.ProrateTargetRebatesFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateTargetRebatesFetch () {
    return this.ProrateTargetRebatesFetch;
  }
  /** Set the SortOrder for field: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateTargetRebatesSortOrder (Integer value) {
    this.ProrateTargetRebatesSort = value;
  }
  /** Retrieve SortOrder for field: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateTargetRebatesSortOrder () {
    return this.ProrateTargetRebatesSort;
  }
  /** Set the sort direction for field: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateTargetRebatesSortDirection (boolean ascending) {
    this.ProrateTargetRebatesSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateTargetRebatesSortDirection () {
    return this.ProrateTargetRebatesSortAscending;
  }
  /** Set the field level filters for field: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateTargetRebatesFilter (BooleanFilter[] value) throws ServiceException {
    this.ProrateTargetRebates = value;
  }
  /** Retrieve filter for field: ProrateTargetRebates (CONTRACT_TYPES.prorate_target_rebates)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getProrateTargetRebatesFilter () {
    return this.ProrateTargetRebates;
  }

  /**
   * Retrieves the ProrateTargetRebatesFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateTargetRebatesFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateTargetRebatesFilter field
   */
  public String[] getProrateTargetRebatesFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTargetRebatesFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateTargetRebatesFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateTargetRebatesFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateTargetRebatesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateTargetRebatesFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateTargetRebatesFilter filter value from a formatted string
   *
   * @param _value the ProrateTargetRebatesFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateTargetRebatesFilter filter field
   */
  public void setProrateTargetRebatesFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateTargetRebatesFilterFromFormattedString");
    try {
      this.setProrateTargetRebatesFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateTargetRebatesFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateTargetRebatesFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateTargetRebatesFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AllowAccount (CONTRACT_TYPES.allow_account)
   * @param fetch whether to fetch this field or not
   */
  public void setAllowAccountFetch (boolean fetch) {
    this.AllowAccountFetch = fetch;
  }
  /** Retrieve Fetch value for field: AllowAccount (CONTRACT_TYPES.allow_account)
   * @return boolean the Fetch value for this field
   */
  public boolean getAllowAccountFetch () {
    return this.AllowAccountFetch;
  }
  /** Set the SortOrder for field: AllowAccount (CONTRACT_TYPES.allow_account)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAllowAccountSortOrder (Integer value) {
    this.AllowAccountSort = value;
  }
  /** Retrieve SortOrder for field: AllowAccount (CONTRACT_TYPES.allow_account)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAllowAccountSortOrder () {
    return this.AllowAccountSort;
  }
  /** Set the sort direction for field: AllowAccount (CONTRACT_TYPES.allow_account)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAllowAccountSortDirection (boolean ascending) {
    this.AllowAccountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AllowAccount (CONTRACT_TYPES.allow_account)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAllowAccountSortDirection () {
    return this.AllowAccountSortAscending;
  }
  /** Set the field level filters for field: AllowAccount (CONTRACT_TYPES.allow_account)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAllowAccountFilter (IntegerFilter[] value) throws ServiceException {
    this.AllowAccount = value;
  }
  /** Retrieve filter for field: AllowAccount (CONTRACT_TYPES.allow_account)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAllowAccountFilter () {
    return this.AllowAccount;
  }

  /**
   * Retrieves the AllowAccountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllowAccountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowAccountFilter field
   */
  public String[] getAllowAccountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAccountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAllowAccountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowAccountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowAccountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowAccountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AllowAccountFilter filter value from a formatted string
   *
   * @param _value the AllowAccountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AllowAccountFilter filter field
   */
  public void setAllowAccountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllowAccountFilterFromFormattedString");
    try {
      this.setAllowAccountFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowAccountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowAccountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowAccountFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * @param fetch whether to fetch this field or not
   */
  public void setAllowServiceFetch (boolean fetch) {
    this.AllowServiceFetch = fetch;
  }
  /** Retrieve Fetch value for field: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * @return boolean the Fetch value for this field
   */
  public boolean getAllowServiceFetch () {
    return this.AllowServiceFetch;
  }
  /** Set the SortOrder for field: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAllowServiceSortOrder (Integer value) {
    this.AllowServiceSort = value;
  }
  /** Retrieve SortOrder for field: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAllowServiceSortOrder () {
    return this.AllowServiceSort;
  }
  /** Set the sort direction for field: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAllowServiceSortDirection (boolean ascending) {
    this.AllowServiceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAllowServiceSortDirection () {
    return this.AllowServiceSortAscending;
  }
  /** Set the field level filters for field: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAllowServiceFilter (IntegerFilter[] value) throws ServiceException {
    this.AllowService = value;
  }
  /** Retrieve filter for field: AllowService (CONTRACT_TYPES.allow_serv_inst)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAllowServiceFilter () {
    return this.AllowService;
  }

  /**
   * Retrieves the AllowServiceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllowServiceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowServiceFilter field
   */
  public String[] getAllowServiceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowServiceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAllowServiceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowServiceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowServiceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowServiceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AllowServiceFilter filter value from a formatted string
   *
   * @param _value the AllowServiceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AllowServiceFilter filter field
   */
  public void setAllowServiceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllowServiceFilterFromFormattedString");
    try {
      this.setAllowServiceFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowServiceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowServiceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowServiceFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * @param fetch whether to fetch this field or not
   */
  public void setAllowAccountGroupFetch (boolean fetch) {
    this.AllowAccountGroupFetch = fetch;
  }
  /** Retrieve Fetch value for field: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * @return boolean the Fetch value for this field
   */
  public boolean getAllowAccountGroupFetch () {
    return this.AllowAccountGroupFetch;
  }
  /** Set the SortOrder for field: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAllowAccountGroupSortOrder (Integer value) {
    this.AllowAccountGroupSort = value;
  }
  /** Retrieve SortOrder for field: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAllowAccountGroupSortOrder () {
    return this.AllowAccountGroupSort;
  }
  /** Set the sort direction for field: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAllowAccountGroupSortDirection (boolean ascending) {
    this.AllowAccountGroupSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAllowAccountGroupSortDirection () {
    return this.AllowAccountGroupSortAscending;
  }
  /** Set the field level filters for field: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAllowAccountGroupFilter (IntegerFilter[] value) throws ServiceException {
    this.AllowAccountGroup = value;
  }
  /** Retrieve filter for field: AllowAccountGroup (CONTRACT_TYPES.allow_acct_group)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAllowAccountGroupFilter () {
    return this.AllowAccountGroup;
  }

  /**
   * Retrieves the AllowAccountGroupFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllowAccountGroupFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowAccountGroupFilter field
   */
  public String[] getAllowAccountGroupFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowAccountGroupFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAllowAccountGroupFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowAccountGroupFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowAccountGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowAccountGroupFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AllowAccountGroupFilter filter value from a formatted string
   *
   * @param _value the AllowAccountGroupFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AllowAccountGroupFilter filter field
   */
  public void setAllowAccountGroupFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllowAccountGroupFilterFromFormattedString");
    try {
      this.setAllowAccountGroupFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowAccountGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowAccountGroupFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowAccountGroupFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * @param fetch whether to fetch this field or not
   */
  public void setAllowServiceGroupFetch (boolean fetch) {
    this.AllowServiceGroupFetch = fetch;
  }
  /** Retrieve Fetch value for field: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * @return boolean the Fetch value for this field
   */
  public boolean getAllowServiceGroupFetch () {
    return this.AllowServiceGroupFetch;
  }
  /** Set the SortOrder for field: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAllowServiceGroupSortOrder (Integer value) {
    this.AllowServiceGroupSort = value;
  }
  /** Retrieve SortOrder for field: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAllowServiceGroupSortOrder () {
    return this.AllowServiceGroupSort;
  }
  /** Set the sort direction for field: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAllowServiceGroupSortDirection (boolean ascending) {
    this.AllowServiceGroupSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAllowServiceGroupSortDirection () {
    return this.AllowServiceGroupSortAscending;
  }
  /** Set the field level filters for field: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAllowServiceGroupFilter (IntegerFilter[] value) throws ServiceException {
    this.AllowServiceGroup = value;
  }
  /** Retrieve filter for field: AllowServiceGroup (CONTRACT_TYPES.allow_si_group)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAllowServiceGroupFilter () {
    return this.AllowServiceGroup;
  }

  /**
   * Retrieves the AllowServiceGroupFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AllowServiceGroupFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AllowServiceGroupFilter field
   */
  public String[] getAllowServiceGroupFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAllowServiceGroupFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAllowServiceGroupFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAllowServiceGroupFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowServiceGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAllowServiceGroupFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AllowServiceGroupFilter filter value from a formatted string
   *
   * @param _value the AllowServiceGroupFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AllowServiceGroupFilter filter field
   */
  public void setAllowServiceGroupFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAllowServiceGroupFilterFromFormattedString");
    try {
      this.setAllowServiceGroupFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AllowServiceGroupFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAllowServiceGroupFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAllowServiceGroupFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillPeriod (CONTRACT_TYPES.bill_period)
   * @param fetch whether to fetch this field or not
   */
  public void setBillPeriodFetch (boolean fetch) {
    this.BillPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillPeriod (CONTRACT_TYPES.bill_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillPeriodFetch () {
    return this.BillPeriodFetch;
  }
  /** Set the SortOrder for field: BillPeriod (CONTRACT_TYPES.bill_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillPeriodSortOrder (Integer value) {
    this.BillPeriodSort = value;
  }
  /** Retrieve SortOrder for field: BillPeriod (CONTRACT_TYPES.bill_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillPeriodSortOrder () {
    return this.BillPeriodSort;
  }
  /** Set the sort direction for field: BillPeriod (CONTRACT_TYPES.bill_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillPeriodSortDirection (boolean ascending) {
    this.BillPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillPeriod (CONTRACT_TYPES.bill_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillPeriodSortDirection () {
    return this.BillPeriodSortAscending;
  }
  /** Set the case insensitive for field: BillPeriod (CONTRACT_TYPES.bill_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillPeriodCaseInsensitive (boolean ascending) {
    this.BillPeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillPeriod (CONTRACT_TYPES.bill_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillPeriodCaseInsensitive () {
    return this.BillPeriodCaseInsensitive;
  }
  /** Set the field level filters for field: BillPeriod (CONTRACT_TYPES.bill_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillPeriodFilter (StringFilter[] value) throws ServiceException {
    this.BillPeriod = value;
  }
  /** Retrieve filter for field: BillPeriod (CONTRACT_TYPES.bill_period)
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

  /** Set the field level Fetch value for field: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * @param fetch whether to fetch this field or not
   */
  public void setMinDurationUnitsFetch (boolean fetch) {
    this.MinDurationUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinDurationUnitsFetch () {
    return this.MinDurationUnitsFetch;
  }
  /** Set the SortOrder for field: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinDurationUnitsSortOrder (Integer value) {
    this.MinDurationUnitsSort = value;
  }
  /** Retrieve SortOrder for field: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinDurationUnitsSortOrder () {
    return this.MinDurationUnitsSort;
  }
  /** Set the sort direction for field: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinDurationUnitsSortDirection (boolean ascending) {
    this.MinDurationUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinDurationUnitsSortDirection () {
    return this.MinDurationUnitsSortAscending;
  }
  /** Set the field level filters for field: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinDurationUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.MinDurationUnits = value;
  }
  /** Retrieve filter for field: MinDurationUnits (CONTRACT_TYPES.min_duration_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMinDurationUnitsFilter () {
    return this.MinDurationUnits;
  }

  /**
   * Retrieves the MinDurationUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinDurationUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinDurationUnitsFilter field
   */
  public String[] getMinDurationUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinDurationUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinDurationUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinDurationUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinDurationUnitsFilter filter value from a formatted string
   *
   * @param _value the MinDurationUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinDurationUnitsFilter filter field
   */
  public void setMinDurationUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinDurationUnitsFilterFromFormattedString");
    try {
      this.setMinDurationUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinDurationUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinDurationUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MinDuration (CONTRACT_TYPES.min_duration)
   * @param fetch whether to fetch this field or not
   */
  public void setMinDurationFetch (boolean fetch) {
    this.MinDurationFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinDuration (CONTRACT_TYPES.min_duration)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinDurationFetch () {
    return this.MinDurationFetch;
  }
  /** Set the SortOrder for field: MinDuration (CONTRACT_TYPES.min_duration)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinDurationSortOrder (Integer value) {
    this.MinDurationSort = value;
  }
  /** Retrieve SortOrder for field: MinDuration (CONTRACT_TYPES.min_duration)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinDurationSortOrder () {
    return this.MinDurationSort;
  }
  /** Set the sort direction for field: MinDuration (CONTRACT_TYPES.min_duration)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinDurationSortDirection (boolean ascending) {
    this.MinDurationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinDuration (CONTRACT_TYPES.min_duration)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinDurationSortDirection () {
    return this.MinDurationSortAscending;
  }
  /** Set the field level filters for field: MinDuration (CONTRACT_TYPES.min_duration)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinDurationFilter (IntegerFilter[] value) throws ServiceException {
    this.MinDuration = value;
  }
  /** Retrieve filter for field: MinDuration (CONTRACT_TYPES.min_duration)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMinDurationFilter () {
    return this.MinDuration;
  }

  /**
   * Retrieves the MinDurationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinDurationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinDurationFilter field
   */
  public String[] getMinDurationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinDurationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinDurationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinDurationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinDurationFilter filter value from a formatted string
   *
   * @param _value the MinDurationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinDurationFilter filter field
   */
  public void setMinDurationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinDurationFilterFromFormattedString");
    try {
      this.setMinDurationFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinDurationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinDurationFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * @param fetch whether to fetch this field or not
   */
  public void setMinNoticeUnitsFetch (boolean fetch) {
    this.MinNoticeUnitsFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinNoticeUnitsFetch () {
    return this.MinNoticeUnitsFetch;
  }
  /** Set the SortOrder for field: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinNoticeUnitsSortOrder (Integer value) {
    this.MinNoticeUnitsSort = value;
  }
  /** Retrieve SortOrder for field: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinNoticeUnitsSortOrder () {
    return this.MinNoticeUnitsSort;
  }
  /** Set the sort direction for field: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinNoticeUnitsSortDirection (boolean ascending) {
    this.MinNoticeUnitsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinNoticeUnitsSortDirection () {
    return this.MinNoticeUnitsSortAscending;
  }
  /** Set the field level filters for field: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinNoticeUnitsFilter (IntegerFilter[] value) throws ServiceException {
    this.MinNoticeUnits = value;
  }
  /** Retrieve filter for field: MinNoticeUnits (CONTRACT_TYPES.min_notice_units)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMinNoticeUnitsFilter () {
    return this.MinNoticeUnits;
  }

  /**
   * Retrieves the MinNoticeUnitsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinNoticeUnitsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinNoticeUnitsFilter field
   */
  public String[] getMinNoticeUnitsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeUnitsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinNoticeUnitsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinNoticeUnitsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinNoticeUnitsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinNoticeUnitsFilter filter value from a formatted string
   *
   * @param _value the MinNoticeUnitsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinNoticeUnitsFilter filter field
   */
  public void setMinNoticeUnitsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinNoticeUnitsFilterFromFormattedString");
    try {
      this.setMinNoticeUnitsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeUnitsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinNoticeUnitsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinNoticeUnitsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * @param fetch whether to fetch this field or not
   */
  public void setMinNoticeDelayFetch (boolean fetch) {
    this.MinNoticeDelayFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinNoticeDelayFetch () {
    return this.MinNoticeDelayFetch;
  }
  /** Set the SortOrder for field: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinNoticeDelaySortOrder (Integer value) {
    this.MinNoticeDelaySort = value;
  }
  /** Retrieve SortOrder for field: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinNoticeDelaySortOrder () {
    return this.MinNoticeDelaySort;
  }
  /** Set the sort direction for field: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinNoticeDelaySortDirection (boolean ascending) {
    this.MinNoticeDelaySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinNoticeDelaySortDirection () {
    return this.MinNoticeDelaySortAscending;
  }
  /** Set the field level filters for field: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinNoticeDelayFilter (IntegerFilter[] value) throws ServiceException {
    this.MinNoticeDelay = value;
  }
  /** Retrieve filter for field: MinNoticeDelay (CONTRACT_TYPES.min_notice_delay)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getMinNoticeDelayFilter () {
    return this.MinNoticeDelay;
  }

  /**
   * Retrieves the MinNoticeDelayFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinNoticeDelayFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinNoticeDelayFilter field
   */
  public String[] getMinNoticeDelayFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeDelayFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinNoticeDelayFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinNoticeDelayFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinNoticeDelayFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinNoticeDelayFilter filter value from a formatted string
   *
   * @param _value the MinNoticeDelayFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinNoticeDelayFilter filter field
   */
  public void setMinNoticeDelayFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinNoticeDelayFilterFromFormattedString");
    try {
      this.setMinNoticeDelayFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeDelayFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinNoticeDelayFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinNoticeDelayFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsCustom (CONTRACT_TYPES.is_custom)
   * @param fetch whether to fetch this field or not
   */
  public void setIsCustomFetch (boolean fetch) {
    this.IsCustomFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsCustom (CONTRACT_TYPES.is_custom)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsCustomFetch () {
    return this.IsCustomFetch;
  }
  /** Set the SortOrder for field: IsCustom (CONTRACT_TYPES.is_custom)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsCustomSortOrder (Integer value) {
    this.IsCustomSort = value;
  }
  /** Retrieve SortOrder for field: IsCustom (CONTRACT_TYPES.is_custom)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsCustomSortOrder () {
    return this.IsCustomSort;
  }
  /** Set the sort direction for field: IsCustom (CONTRACT_TYPES.is_custom)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsCustomSortDirection (boolean ascending) {
    this.IsCustomSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsCustom (CONTRACT_TYPES.is_custom)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsCustomSortDirection () {
    return this.IsCustomSortAscending;
  }
  /** Set the field level filters for field: IsCustom (CONTRACT_TYPES.is_custom)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsCustomFilter (IntegerFilter[] value) throws ServiceException {
    this.IsCustom = value;
  }
  /** Retrieve filter for field: IsCustom (CONTRACT_TYPES.is_custom)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getIsCustomFilter () {
    return this.IsCustom;
  }

  /**
   * Retrieves the IsCustomFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsCustomFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsCustomFilter field
   */
  public String[] getIsCustomFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCustomFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsCustomFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsCustomFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCustomFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsCustomFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsCustomFilter filter value from a formatted string
   *
   * @param _value the IsCustomFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsCustomFilter filter field
   */
  public void setIsCustomFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsCustomFilterFromFormattedString");
    try {
      this.setIsCustomFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsCustomFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsCustomFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsCustomFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: WhenApplied (CONTRACT_TYPES.when_applied)
   * @param fetch whether to fetch this field or not
   */
  public void setWhenAppliedFetch (boolean fetch) {
    this.WhenAppliedFetch = fetch;
  }
  /** Retrieve Fetch value for field: WhenApplied (CONTRACT_TYPES.when_applied)
   * @return boolean the Fetch value for this field
   */
  public boolean getWhenAppliedFetch () {
    return this.WhenAppliedFetch;
  }
  /** Set the SortOrder for field: WhenApplied (CONTRACT_TYPES.when_applied)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setWhenAppliedSortOrder (Integer value) {
    this.WhenAppliedSort = value;
  }
  /** Retrieve SortOrder for field: WhenApplied (CONTRACT_TYPES.when_applied)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getWhenAppliedSortOrder () {
    return this.WhenAppliedSort;
  }
  /** Set the sort direction for field: WhenApplied (CONTRACT_TYPES.when_applied)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setWhenAppliedSortDirection (boolean ascending) {
    this.WhenAppliedSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: WhenApplied (CONTRACT_TYPES.when_applied)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getWhenAppliedSortDirection () {
    return this.WhenAppliedSortAscending;
  }
  /** Set the field level filters for field: WhenApplied (CONTRACT_TYPES.when_applied)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setWhenAppliedFilter (IntegerFilter[] value) throws ServiceException {
    this.WhenApplied = value;
  }
  /** Retrieve filter for field: WhenApplied (CONTRACT_TYPES.when_applied)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getWhenAppliedFilter () {
    return this.WhenApplied;
  }

  /**
   * Retrieves the WhenAppliedFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The WhenAppliedFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the WhenAppliedFilter field
   */
  public String[] getWhenAppliedFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWhenAppliedFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getWhenAppliedFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getWhenAppliedFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("WhenAppliedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getWhenAppliedFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the WhenAppliedFilter filter value from a formatted string
   *
   * @param _value the WhenAppliedFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the WhenAppliedFilter filter field
   */
  public void setWhenAppliedFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setWhenAppliedFilterFromFormattedString");
    try {
      this.setWhenAppliedFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("WhenAppliedFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setWhenAppliedFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setWhenAppliedFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * @param fetch whether to fetch this field or not
   */
  public void setApplyDuringSuspendFetch (boolean fetch) {
    this.ApplyDuringSuspendFetch = fetch;
  }
  /** Retrieve Fetch value for field: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * @return boolean the Fetch value for this field
   */
  public boolean getApplyDuringSuspendFetch () {
    return this.ApplyDuringSuspendFetch;
  }
  /** Set the SortOrder for field: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setApplyDuringSuspendSortOrder (Integer value) {
    this.ApplyDuringSuspendSort = value;
  }
  /** Retrieve SortOrder for field: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getApplyDuringSuspendSortOrder () {
    return this.ApplyDuringSuspendSort;
  }
  /** Set the sort direction for field: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setApplyDuringSuspendSortDirection (boolean ascending) {
    this.ApplyDuringSuspendSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getApplyDuringSuspendSortDirection () {
    return this.ApplyDuringSuspendSortAscending;
  }
  /** Set the field level filters for field: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setApplyDuringSuspendFilter (IntegerFilter[] value) throws ServiceException {
    this.ApplyDuringSuspend = value;
  }
  /** Retrieve filter for field: ApplyDuringSuspend (CONTRACT_TYPES.apply_during_suspend)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getApplyDuringSuspendFilter () {
    return this.ApplyDuringSuspend;
  }

  /**
   * Retrieves the ApplyDuringSuspendFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ApplyDuringSuspendFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ApplyDuringSuspendFilter field
   */
  public String[] getApplyDuringSuspendFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getApplyDuringSuspendFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getApplyDuringSuspendFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getApplyDuringSuspendFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ApplyDuringSuspendFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getApplyDuringSuspendFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ApplyDuringSuspendFilter filter value from a formatted string
   *
   * @param _value the ApplyDuringSuspendFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ApplyDuringSuspendFilter filter field
   */
  public void setApplyDuringSuspendFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setApplyDuringSuspendFilterFromFormattedString");
    try {
      this.setApplyDuringSuspendFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ApplyDuringSuspendFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setApplyDuringSuspendFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setApplyDuringSuspendFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: PlanOrder (DISCOUNT_PLANS.plan_order)
   * @param fetch whether to fetch this field or not
   */
  public void setPlanOrderFetch (boolean fetch) {
    this.PlanOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: PlanOrder (DISCOUNT_PLANS.plan_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getPlanOrderFetch () {
    return this.PlanOrderFetch;
  }
  /** Set the SortOrder for field: PlanOrder (DISCOUNT_PLANS.plan_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPlanOrderSortOrder (Integer value) {
    this.PlanOrderSort = value;
  }
  /** Retrieve SortOrder for field: PlanOrder (DISCOUNT_PLANS.plan_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPlanOrderSortOrder () {
    return this.PlanOrderSort;
  }
  /** Set the sort direction for field: PlanOrder (DISCOUNT_PLANS.plan_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPlanOrderSortDirection (boolean ascending) {
    this.PlanOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PlanOrder (DISCOUNT_PLANS.plan_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPlanOrderSortDirection () {
    return this.PlanOrderSortAscending;
  }
  /** Set the field level filters for field: PlanOrder (DISCOUNT_PLANS.plan_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPlanOrderFilter (IntegerFilter[] value) throws ServiceException {
    this.PlanOrder = value;
  }
  /** Retrieve filter for field: PlanOrder (DISCOUNT_PLANS.plan_order)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getPlanOrderFilter () {
    return this.PlanOrder;
  }

  /**
   * Retrieves the PlanOrderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PlanOrderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PlanOrderFilter field
   */
  public String[] getPlanOrderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPlanOrderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPlanOrderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPlanOrderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPlanOrderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PlanOrderFilter filter value from a formatted string
   *
   * @param _value the PlanOrderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PlanOrderFilter filter field
   */
  public void setPlanOrderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPlanOrderFilterFromFormattedString");
    try {
      this.setPlanOrderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PlanOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPlanOrderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPlanOrderFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: DefOrder (DISCOUNT_PLANS.def_order)
   * @param fetch whether to fetch this field or not
   */
  public void setDefOrderFetch (boolean fetch) {
    this.DefOrderFetch = fetch;
  }
  /** Retrieve Fetch value for field: DefOrder (DISCOUNT_PLANS.def_order)
   * @return boolean the Fetch value for this field
   */
  public boolean getDefOrderFetch () {
    return this.DefOrderFetch;
  }
  /** Set the SortOrder for field: DefOrder (DISCOUNT_PLANS.def_order)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDefOrderSortOrder (Integer value) {
    this.DefOrderSort = value;
  }
  /** Retrieve SortOrder for field: DefOrder (DISCOUNT_PLANS.def_order)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDefOrderSortOrder () {
    return this.DefOrderSort;
  }
  /** Set the sort direction for field: DefOrder (DISCOUNT_PLANS.def_order)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDefOrderSortDirection (boolean ascending) {
    this.DefOrderSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DefOrder (DISCOUNT_PLANS.def_order)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDefOrderSortDirection () {
    return this.DefOrderSortAscending;
  }
  /** Set the field level filters for field: DefOrder (DISCOUNT_PLANS.def_order)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDefOrderFilter (IntegerFilter[] value) throws ServiceException {
    this.DefOrder = value;
  }
  /** Retrieve filter for field: DefOrder (DISCOUNT_PLANS.def_order)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getDefOrderFilter () {
    return this.DefOrder;
  }

  /**
   * Retrieves the DefOrderFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DefOrderFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DefOrderFilter field
   */
  public String[] getDefOrderFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDefOrderFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDefOrderFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDefOrderFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DefOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDefOrderFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DefOrderFilter filter value from a formatted string
   *
   * @param _value the DefOrderFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DefOrderFilter filter field
   */
  public void setDefOrderFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDefOrderFilterFromFormattedString");
    try {
      this.setDefOrderFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DefOrderFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDefOrderFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDefOrderFilterFromFormattedString");
  }

  public String toString() {
    return ContractDiscountObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ContractDiscountObjectHelper.toMap(this, null);
  }
}
