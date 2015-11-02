/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalContractObjectFilter.java
 * Definition File: Customer/GlobalContract.xml
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
public class GlobalContractObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public GlobalContractObjectKeyFilter Key = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.tracking_id) */
  public    IntegerFilter[] TrackingId  = null;
  protected boolean TrackingIdFetch = false;
  protected boolean TrackingIdSortAscending = true;
  protected Integer TrackingIdSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.tracking_id_serv) */
  public    IntegerFilter[] TrackingIdServ  = null;
  protected boolean TrackingIdServFetch = false;
  protected boolean TrackingIdServSortAscending = true;
  protected Integer TrackingIdServSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.create_dt) */
  public    DateFilter[] CreateDt  = null;
  protected boolean CreateDtFetch = false;
  protected boolean CreateDtSortAscending = true;
  protected Integer CreateDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.in_use) */
  public    StringFilter[] InUse  = null;
  protected boolean InUseFetch = false;
  protected boolean InUseSortAscending = true;
  protected boolean InUseCaseInsensitive = false;
  protected Integer InUseSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.arch_flag) */
  public    BooleanFilter[] ArchFlag  = null;
  protected boolean ArchFlagFetch = false;
  protected boolean ArchFlagSortAscending = true;
  protected Integer ArchFlagSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.avail_periods) */
  public    IntegerFilter[] AvailPeriods  = null;
  protected boolean AvailPeriodsFetch = false;
  protected boolean AvailPeriodsSortAscending = true;
  protected Integer AvailPeriodsSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.first_use_dt) */
  public    DateFilter[] FirstUseDt  = null;
  protected boolean FirstUseDtFetch = false;
  protected boolean FirstUseDtSortAscending = true;
  protected Integer FirstUseDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.last_use_dt) */
  public    DateFilter[] LastUseDt  = null;
  protected boolean LastUseDtFetch = false;
  protected boolean LastUseDtSortAscending = true;
  protected Integer LastUseDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.commitment_amount) */
  public    BigIntegerFilter[] CommitmentAmount  = null;
  protected boolean CommitmentAmountFetch = false;
  protected boolean CommitmentAmountSortAscending = true;
  protected Integer CommitmentAmountSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.commitment_currency_code) */
  public    IntegerFilter[] CommitmentCurrencyCode  = null;
  protected boolean CommitmentCurrencyCodeFetch = false;
  protected boolean CommitmentCurrencyCodeSortAscending = true;
  protected Integer CommitmentCurrencyCodeSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.total_savings_amount) */
  public    BigIntegerFilter[] TotalSavingsAmount  = null;
  protected boolean TotalSavingsAmountFetch = false;
  protected boolean TotalSavingsAmountSortAscending = true;
  protected Integer TotalSavingsAmountSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.total_element_amount) */
  public    BigIntegerFilter[] TotalElementAmount  = null;
  protected boolean TotalElementAmountFetch = false;
  protected boolean TotalElementAmountSortAscending = true;
  protected Integer TotalElementAmountSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.prev_eval_date) */
  public    DateFilter[] PrevEvalDate  = null;
  protected boolean PrevEvalDateFetch = false;
  protected boolean PrevEvalDateSortAscending = true;
  protected Integer PrevEvalDateSort = null;
  /** raw field for: CUSTOMER_CONTRACT_KEY.next_eval_date) */
  public    DateFilter[] NextEvalDate  = null;
  protected boolean NextEvalDateFetch = false;
  protected boolean NextEvalDateSortAscending = true;
  protected Integer NextEvalDateSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.view_status) */
  public    IntegerFilter[] ViewStatus  = null;
  protected boolean ViewStatusFetch = false;
  protected boolean ViewStatusSortAscending = true;
  protected Integer ViewStatusSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.view_created_dt) */
  public    DateFilter[] ViewCreatedDt  = null;
  protected boolean ViewCreatedDtFetch = false;
  protected boolean ViewCreatedDtSortAscending = true;
  protected Integer ViewCreatedDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.view_effective_dt) */
  public    DateFilter[] ViewEffectiveDt  = null;
  protected boolean ViewEffectiveDtFetch = false;
  protected boolean ViewEffectiveDtSortAscending = true;
  protected Integer ViewEffectiveDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt) */
  public    DateFilter[] IntendedViewEffectiveDt  = null;
  protected boolean IntendedViewEffectiveDtFetch = false;
  protected boolean IntendedViewEffectiveDtSortAscending = true;
  protected Integer IntendedViewEffectiveDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prev_view_id) */
  public    BigIntegerFilter[] PrevViewId  = null;
  protected boolean PrevViewIdFetch = false;
  protected boolean PrevViewIdSortAscending = true;
  protected Integer PrevViewIdSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.contract_type) */
  public    IntegerFilter[] ContractType  = null;
  protected boolean ContractTypeFetch = false;
  protected boolean ContractTypeSortAscending = true;
  protected Integer ContractTypeSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.contract_id) */
  public    StringFilter[] ContractId  = null;
  protected boolean ContractIdFetch = false;
  protected boolean ContractIdSortAscending = true;
  protected boolean ContractIdCaseInsensitive = false;
  protected Integer ContractIdSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.parent_group_no) */
  public    IntegerFilter[] ParentGroupNo  = null;
  protected boolean ParentGroupNoFetch = false;
  protected boolean ParentGroupNoSortAscending = true;
  protected Integer ParentGroupNoSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.start_dt) */
  public    DateFilter[] StartDt  = null;
  protected boolean StartDtFetch = false;
  protected boolean StartDtSortAscending = true;
  protected Integer StartDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.end_dt) */
  public    DateFilter[] EndDt  = null;
  protected boolean EndDtFetch = false;
  protected boolean EndDtSortAscending = true;
  protected Integer EndDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prev_end_dt) */
  public    DateFilter[] PrevEndDt  = null;
  protected boolean PrevEndDtFetch = false;
  protected boolean PrevEndDtSortAscending = true;
  protected Integer PrevEndDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.grace_period) */
  public    IntegerFilter[] GracePeriod  = null;
  protected boolean GracePeriodFetch = false;
  protected boolean GracePeriodSortAscending = true;
  protected Integer GracePeriodSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.total_periods) */
  public    IntegerFilter[] TotalPeriods  = null;
  protected boolean TotalPeriodsFetch = false;
  protected boolean TotalPeriodsSortAscending = true;
  protected Integer TotalPeriodsSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.sales_channel_id) */
  public    IntegerFilter[] SalesChannelId  = null;
  protected boolean SalesChannelIdFetch = false;
  protected boolean SalesChannelIdSortAscending = true;
  protected Integer SalesChannelIdSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.track_total_amounts) */
  public    BooleanFilter[] TrackTotalAmounts  = null;
  protected boolean TrackTotalAmountsFetch = false;
  protected boolean TrackTotalAmountsSortAscending = true;
  protected Integer TrackTotalAmountsSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.rollover_period) */
  public    IntegerFilter[] RolloverPeriod  = null;
  protected boolean RolloverPeriodFetch = false;
  protected boolean RolloverPeriodSortAscending = true;
  protected Integer RolloverPeriodSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.rollover_period_start) */
  public    IntegerFilter[] RolloverPeriodStart  = null;
  protected boolean RolloverPeriodStartFetch = false;
  protected boolean RolloverPeriodStartSortAscending = true;
  protected Integer RolloverPeriodStartSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.bill_period) */
  public    StringFilter[] BillPeriod  = null;
  protected boolean BillPeriodFetch = false;
  protected boolean BillPeriodSortAscending = true;
  protected boolean BillPeriodCaseInsensitive = false;
  protected Integer BillPeriodSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.distribute_payback) */
  public    BooleanFilter[] DistributePayback  = null;
  protected boolean DistributePaybackFetch = false;
  protected boolean DistributePaybackSortAscending = true;
  protected Integer DistributePaybackSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override) */
  public    IntegerFilter[] ProrateContractStrtOverride  = null;
  protected boolean ProrateContractStrtOverrideFetch = false;
  protected boolean ProrateContractStrtOverrideSortAscending = true;
  protected Integer ProrateContractStrtOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override) */
  public    IntegerFilter[] ProrateContractEndOverride  = null;
  protected boolean ProrateContractEndOverrideFetch = false;
  protected boolean ProrateContractEndOverrideSortAscending = true;
  protected Integer ProrateContractEndOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override) */
  public    IntegerFilter[] ProrateInterimBillOverride  = null;
  protected boolean ProrateInterimBillOverrideFetch = false;
  protected boolean ProrateInterimBillOverrideSortAscending = true;
  protected Integer ProrateInterimBillOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prorate_period_change_override) */
  public    IntegerFilter[] ProratePeriodChangeOverride  = null;
  protected boolean ProratePeriodChangeOverrideFetch = false;
  protected boolean ProratePeriodChangeOverrideSortAscending = true;
  protected Integer ProratePeriodChangeOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prorate_account_start_override) */
  public    IntegerFilter[] ProrateAccountStartOverride  = null;
  protected boolean ProrateAccountStartOverrideFetch = false;
  protected boolean ProrateAccountStartOverrideSortAscending = true;
  protected Integer ProrateAccountStartOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prorate_account_end_override) */
  public    IntegerFilter[] ProrateAccountEndOverride  = null;
  protected boolean ProrateAccountEndOverrideFetch = false;
  protected boolean ProrateAccountEndOverrideSortAscending = true;
  protected Integer ProrateAccountEndOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override) */
  public    IntegerFilter[] ProrateTgtThresholdOverride  = null;
  protected boolean ProrateTgtThresholdOverrideFetch = false;
  protected boolean ProrateTgtThresholdOverrideSortAscending = true;
  protected Integer ProrateTgtThresholdOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override) */
  public    IntegerFilter[] ProrateTgtRebatesOverride  = null;
  protected boolean ProrateTgtRebatesOverrideFetch = false;
  protected boolean ProrateTgtRebatesOverrideSortAscending = true;
  protected Integer ProrateTgtRebatesOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.start_by_dt) */
  public    DateFilter[] StartByDt  = null;
  protected boolean StartByDtFetch = false;
  protected boolean StartByDtSortAscending = true;
  protected Integer StartByDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.notice_end_dt) */
  public    DateFilter[] NoticeEndDt  = null;
  protected boolean NoticeEndDtFetch = false;
  protected boolean NoticeEndDtSortAscending = true;
  protected Integer NoticeEndDtSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.duration_override) */
  public    BooleanFilter[] DurationOverride  = null;
  protected boolean DurationOverrideFetch = false;
  protected boolean DurationOverrideSortAscending = true;
  protected Integer DurationOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.notice_override) */
  public    BooleanFilter[] NoticeOverride  = null;
  protected boolean NoticeOverrideFetch = false;
  protected boolean NoticeOverrideSortAscending = true;
  protected Integer NoticeOverrideSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.is_part_of_component) */
  public    BooleanFilter[] IsPartOfComponent  = null;
  protected boolean IsPartOfComponentFetch = false;
  protected boolean IsPartOfComponentSortAscending = true;
  protected Integer IsPartOfComponentSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.element_id) */
  public    IntegerFilter[] ElementId  = null;
  protected boolean ElementIdFetch = false;
  protected boolean ElementIdSortAscending = true;
  protected Integer ElementIdSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.commitment_reference) */
  public    IntegerFilter[] CommitmentReference  = null;
  protected boolean CommitmentReferenceFetch = false;
  protected boolean CommitmentReferenceSortAscending = true;
  protected Integer CommitmentReferenceSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.min_duration_date) */
  public    DateFilter[] MinDurationDate  = null;
  protected boolean MinDurationDateFetch = false;
  protected boolean MinDurationDateSortAscending = true;
  protected Integer MinDurationDateSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.min_notice_date) */
  public    DateFilter[] MinNoticeDate  = null;
  protected boolean MinNoticeDateFetch = false;
  protected boolean MinNoticeDateSortAscending = true;
  protected Integer MinNoticeDateSort = null;
  /** raw field for: CUSTOMER_CONTRACT_VIEW.is_custom) */
  public    IntegerFilter[] IsCustom  = null;
  protected boolean IsCustomFetch = false;
  protected boolean IsCustomSortAscending = true;
  protected Integer IsCustomSort = null;  /** ExtendedData filter Map */
  public Map extendedDataFilter = null;

  private String _objName = "GlobalContractObjectFilter";
  /** default constructor */
  public GlobalContractObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public GlobalContractObjectFilter (GlobalContractObjectFilter other)
  {
    if (other == null) return;
    this.Key = new GlobalContractObjectKeyFilter (other.Key);
    this.TrackingId = other.TrackingId;
    this.TrackingIdFetch = other.TrackingIdFetch;
    this.TrackingIdSort = other.TrackingIdSort;
    this.TrackingIdSortAscending = other.TrackingIdSortAscending;
    this.TrackingIdServ = other.TrackingIdServ;
    this.TrackingIdServFetch = other.TrackingIdServFetch;
    this.TrackingIdServSort = other.TrackingIdServSort;
    this.TrackingIdServSortAscending = other.TrackingIdServSortAscending;
    this.CreateDt = other.CreateDt;
    this.CreateDtFetch = other.CreateDtFetch;
    this.CreateDtSort = other.CreateDtSort;
    this.CreateDtSortAscending = other.CreateDtSortAscending;
    this.InUse = other.InUse;
    this.InUseFetch = other.InUseFetch;
    this.InUseSort = other.InUseSort;
    this.InUseCaseInsensitive = other.InUseCaseInsensitive;
    this.InUseSortAscending = other.InUseSortAscending;
    this.ArchFlag = other.ArchFlag;
    this.ArchFlagFetch = other.ArchFlagFetch;
    this.ArchFlagSort = other.ArchFlagSort;
    this.ArchFlagSortAscending = other.ArchFlagSortAscending;
    this.AvailPeriods = other.AvailPeriods;
    this.AvailPeriodsFetch = other.AvailPeriodsFetch;
    this.AvailPeriodsSort = other.AvailPeriodsSort;
    this.AvailPeriodsSortAscending = other.AvailPeriodsSortAscending;
    this.FirstUseDt = other.FirstUseDt;
    this.FirstUseDtFetch = other.FirstUseDtFetch;
    this.FirstUseDtSort = other.FirstUseDtSort;
    this.FirstUseDtSortAscending = other.FirstUseDtSortAscending;
    this.LastUseDt = other.LastUseDt;
    this.LastUseDtFetch = other.LastUseDtFetch;
    this.LastUseDtSort = other.LastUseDtSort;
    this.LastUseDtSortAscending = other.LastUseDtSortAscending;
    this.CommitmentAmount = other.CommitmentAmount;
    this.CommitmentAmountFetch = other.CommitmentAmountFetch;
    this.CommitmentAmountSort = other.CommitmentAmountSort;
    this.CommitmentAmountSortAscending = other.CommitmentAmountSortAscending;
    this.CommitmentCurrencyCode = other.CommitmentCurrencyCode;
    this.CommitmentCurrencyCodeFetch = other.CommitmentCurrencyCodeFetch;
    this.CommitmentCurrencyCodeSort = other.CommitmentCurrencyCodeSort;
    this.CommitmentCurrencyCodeSortAscending = other.CommitmentCurrencyCodeSortAscending;
    this.TotalSavingsAmount = other.TotalSavingsAmount;
    this.TotalSavingsAmountFetch = other.TotalSavingsAmountFetch;
    this.TotalSavingsAmountSort = other.TotalSavingsAmountSort;
    this.TotalSavingsAmountSortAscending = other.TotalSavingsAmountSortAscending;
    this.TotalElementAmount = other.TotalElementAmount;
    this.TotalElementAmountFetch = other.TotalElementAmountFetch;
    this.TotalElementAmountSort = other.TotalElementAmountSort;
    this.TotalElementAmountSortAscending = other.TotalElementAmountSortAscending;
    this.PrevEvalDate = other.PrevEvalDate;
    this.PrevEvalDateFetch = other.PrevEvalDateFetch;
    this.PrevEvalDateSort = other.PrevEvalDateSort;
    this.PrevEvalDateSortAscending = other.PrevEvalDateSortAscending;
    this.NextEvalDate = other.NextEvalDate;
    this.NextEvalDateFetch = other.NextEvalDateFetch;
    this.NextEvalDateSort = other.NextEvalDateSort;
    this.NextEvalDateSortAscending = other.NextEvalDateSortAscending;
    this.ViewStatus = other.ViewStatus;
    this.ViewStatusFetch = other.ViewStatusFetch;
    this.ViewStatusSort = other.ViewStatusSort;
    this.ViewStatusSortAscending = other.ViewStatusSortAscending;
    this.ViewCreatedDt = other.ViewCreatedDt;
    this.ViewCreatedDtFetch = other.ViewCreatedDtFetch;
    this.ViewCreatedDtSort = other.ViewCreatedDtSort;
    this.ViewCreatedDtSortAscending = other.ViewCreatedDtSortAscending;
    this.ViewEffectiveDt = other.ViewEffectiveDt;
    this.ViewEffectiveDtFetch = other.ViewEffectiveDtFetch;
    this.ViewEffectiveDtSort = other.ViewEffectiveDtSort;
    this.ViewEffectiveDtSortAscending = other.ViewEffectiveDtSortAscending;
    this.IntendedViewEffectiveDt = other.IntendedViewEffectiveDt;
    this.IntendedViewEffectiveDtFetch = other.IntendedViewEffectiveDtFetch;
    this.IntendedViewEffectiveDtSort = other.IntendedViewEffectiveDtSort;
    this.IntendedViewEffectiveDtSortAscending = other.IntendedViewEffectiveDtSortAscending;
    this.PrevViewId = other.PrevViewId;
    this.PrevViewIdFetch = other.PrevViewIdFetch;
    this.PrevViewIdSort = other.PrevViewIdSort;
    this.PrevViewIdSortAscending = other.PrevViewIdSortAscending;
    this.ContractType = other.ContractType;
    this.ContractTypeFetch = other.ContractTypeFetch;
    this.ContractTypeSort = other.ContractTypeSort;
    this.ContractTypeSortAscending = other.ContractTypeSortAscending;
    this.ContractId = other.ContractId;
    this.ContractIdFetch = other.ContractIdFetch;
    this.ContractIdSort = other.ContractIdSort;
    this.ContractIdCaseInsensitive = other.ContractIdCaseInsensitive;
    this.ContractIdSortAscending = other.ContractIdSortAscending;
    this.ParentGroupNo = other.ParentGroupNo;
    this.ParentGroupNoFetch = other.ParentGroupNoFetch;
    this.ParentGroupNoSort = other.ParentGroupNoSort;
    this.ParentGroupNoSortAscending = other.ParentGroupNoSortAscending;
    this.StartDt = other.StartDt;
    this.StartDtFetch = other.StartDtFetch;
    this.StartDtSort = other.StartDtSort;
    this.StartDtSortAscending = other.StartDtSortAscending;
    this.EndDt = other.EndDt;
    this.EndDtFetch = other.EndDtFetch;
    this.EndDtSort = other.EndDtSort;
    this.EndDtSortAscending = other.EndDtSortAscending;
    this.PrevEndDt = other.PrevEndDt;
    this.PrevEndDtFetch = other.PrevEndDtFetch;
    this.PrevEndDtSort = other.PrevEndDtSort;
    this.PrevEndDtSortAscending = other.PrevEndDtSortAscending;
    this.GracePeriod = other.GracePeriod;
    this.GracePeriodFetch = other.GracePeriodFetch;
    this.GracePeriodSort = other.GracePeriodSort;
    this.GracePeriodSortAscending = other.GracePeriodSortAscending;
    this.TotalPeriods = other.TotalPeriods;
    this.TotalPeriodsFetch = other.TotalPeriodsFetch;
    this.TotalPeriodsSort = other.TotalPeriodsSort;
    this.TotalPeriodsSortAscending = other.TotalPeriodsSortAscending;
    this.SalesChannelId = other.SalesChannelId;
    this.SalesChannelIdFetch = other.SalesChannelIdFetch;
    this.SalesChannelIdSort = other.SalesChannelIdSort;
    this.SalesChannelIdSortAscending = other.SalesChannelIdSortAscending;
    this.TrackTotalAmounts = other.TrackTotalAmounts;
    this.TrackTotalAmountsFetch = other.TrackTotalAmountsFetch;
    this.TrackTotalAmountsSort = other.TrackTotalAmountsSort;
    this.TrackTotalAmountsSortAscending = other.TrackTotalAmountsSortAscending;
    this.RolloverPeriod = other.RolloverPeriod;
    this.RolloverPeriodFetch = other.RolloverPeriodFetch;
    this.RolloverPeriodSort = other.RolloverPeriodSort;
    this.RolloverPeriodSortAscending = other.RolloverPeriodSortAscending;
    this.RolloverPeriodStart = other.RolloverPeriodStart;
    this.RolloverPeriodStartFetch = other.RolloverPeriodStartFetch;
    this.RolloverPeriodStartSort = other.RolloverPeriodStartSort;
    this.RolloverPeriodStartSortAscending = other.RolloverPeriodStartSortAscending;
    this.BillPeriod = other.BillPeriod;
    this.BillPeriodFetch = other.BillPeriodFetch;
    this.BillPeriodSort = other.BillPeriodSort;
    this.BillPeriodCaseInsensitive = other.BillPeriodCaseInsensitive;
    this.BillPeriodSortAscending = other.BillPeriodSortAscending;
    this.DistributePayback = other.DistributePayback;
    this.DistributePaybackFetch = other.DistributePaybackFetch;
    this.DistributePaybackSort = other.DistributePaybackSort;
    this.DistributePaybackSortAscending = other.DistributePaybackSortAscending;
    this.ProrateContractStrtOverride = other.ProrateContractStrtOverride;
    this.ProrateContractStrtOverrideFetch = other.ProrateContractStrtOverrideFetch;
    this.ProrateContractStrtOverrideSort = other.ProrateContractStrtOverrideSort;
    this.ProrateContractStrtOverrideSortAscending = other.ProrateContractStrtOverrideSortAscending;
    this.ProrateContractEndOverride = other.ProrateContractEndOverride;
    this.ProrateContractEndOverrideFetch = other.ProrateContractEndOverrideFetch;
    this.ProrateContractEndOverrideSort = other.ProrateContractEndOverrideSort;
    this.ProrateContractEndOverrideSortAscending = other.ProrateContractEndOverrideSortAscending;
    this.ProrateInterimBillOverride = other.ProrateInterimBillOverride;
    this.ProrateInterimBillOverrideFetch = other.ProrateInterimBillOverrideFetch;
    this.ProrateInterimBillOverrideSort = other.ProrateInterimBillOverrideSort;
    this.ProrateInterimBillOverrideSortAscending = other.ProrateInterimBillOverrideSortAscending;
    this.ProratePeriodChangeOverride = other.ProratePeriodChangeOverride;
    this.ProratePeriodChangeOverrideFetch = other.ProratePeriodChangeOverrideFetch;
    this.ProratePeriodChangeOverrideSort = other.ProratePeriodChangeOverrideSort;
    this.ProratePeriodChangeOverrideSortAscending = other.ProratePeriodChangeOverrideSortAscending;
    this.ProrateAccountStartOverride = other.ProrateAccountStartOverride;
    this.ProrateAccountStartOverrideFetch = other.ProrateAccountStartOverrideFetch;
    this.ProrateAccountStartOverrideSort = other.ProrateAccountStartOverrideSort;
    this.ProrateAccountStartOverrideSortAscending = other.ProrateAccountStartOverrideSortAscending;
    this.ProrateAccountEndOverride = other.ProrateAccountEndOverride;
    this.ProrateAccountEndOverrideFetch = other.ProrateAccountEndOverrideFetch;
    this.ProrateAccountEndOverrideSort = other.ProrateAccountEndOverrideSort;
    this.ProrateAccountEndOverrideSortAscending = other.ProrateAccountEndOverrideSortAscending;
    this.ProrateTgtThresholdOverride = other.ProrateTgtThresholdOverride;
    this.ProrateTgtThresholdOverrideFetch = other.ProrateTgtThresholdOverrideFetch;
    this.ProrateTgtThresholdOverrideSort = other.ProrateTgtThresholdOverrideSort;
    this.ProrateTgtThresholdOverrideSortAscending = other.ProrateTgtThresholdOverrideSortAscending;
    this.ProrateTgtRebatesOverride = other.ProrateTgtRebatesOverride;
    this.ProrateTgtRebatesOverrideFetch = other.ProrateTgtRebatesOverrideFetch;
    this.ProrateTgtRebatesOverrideSort = other.ProrateTgtRebatesOverrideSort;
    this.ProrateTgtRebatesOverrideSortAscending = other.ProrateTgtRebatesOverrideSortAscending;
    this.StartByDt = other.StartByDt;
    this.StartByDtFetch = other.StartByDtFetch;
    this.StartByDtSort = other.StartByDtSort;
    this.StartByDtSortAscending = other.StartByDtSortAscending;
    this.NoticeEndDt = other.NoticeEndDt;
    this.NoticeEndDtFetch = other.NoticeEndDtFetch;
    this.NoticeEndDtSort = other.NoticeEndDtSort;
    this.NoticeEndDtSortAscending = other.NoticeEndDtSortAscending;
    this.DurationOverride = other.DurationOverride;
    this.DurationOverrideFetch = other.DurationOverrideFetch;
    this.DurationOverrideSort = other.DurationOverrideSort;
    this.DurationOverrideSortAscending = other.DurationOverrideSortAscending;
    this.NoticeOverride = other.NoticeOverride;
    this.NoticeOverrideFetch = other.NoticeOverrideFetch;
    this.NoticeOverrideSort = other.NoticeOverrideSort;
    this.NoticeOverrideSortAscending = other.NoticeOverrideSortAscending;
    this.IsPartOfComponent = other.IsPartOfComponent;
    this.IsPartOfComponentFetch = other.IsPartOfComponentFetch;
    this.IsPartOfComponentSort = other.IsPartOfComponentSort;
    this.IsPartOfComponentSortAscending = other.IsPartOfComponentSortAscending;
    this.ElementId = other.ElementId;
    this.ElementIdFetch = other.ElementIdFetch;
    this.ElementIdSort = other.ElementIdSort;
    this.ElementIdSortAscending = other.ElementIdSortAscending;
    this.CommitmentReference = other.CommitmentReference;
    this.CommitmentReferenceFetch = other.CommitmentReferenceFetch;
    this.CommitmentReferenceSort = other.CommitmentReferenceSort;
    this.CommitmentReferenceSortAscending = other.CommitmentReferenceSortAscending;
    this.MinDurationDate = other.MinDurationDate;
    this.MinDurationDateFetch = other.MinDurationDateFetch;
    this.MinDurationDateSort = other.MinDurationDateSort;
    this.MinDurationDateSortAscending = other.MinDurationDateSortAscending;
    this.MinNoticeDate = other.MinNoticeDate;
    this.MinNoticeDateFetch = other.MinNoticeDateFetch;
    this.MinNoticeDateSort = other.MinNoticeDateSort;
    this.MinNoticeDateSortAscending = other.MinNoticeDateSortAscending;
    this.IsCustom = other.IsCustom;
    this.IsCustomFetch = other.IsCustomFetch;
    this.IsCustomSort = other.IsCustomSort;
    this.IsCustomSortAscending = other.IsCustomSortAscending;  this.extendedDataFilter = other.extendedDataFilter;    
  }
  /** get the filter for this object's key
   * @return GlobalContractObjectKeyFilter
   */
  public GlobalContractObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (GlobalContractObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @param fetch whether to fetch this field or not
   */
  public void setViewIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new GlobalContractObjectKeyFilter ();
    this.Key.ViewIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getViewIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.ViewIdFetch;
  }
  /** Set the SortOrder for field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setViewIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new GlobalContractObjectKeyFilter ();
    this.Key.ViewIdSort = value;
  }
  /** Retrieve SortOrder for field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getViewIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.ViewIdSort;
  }
  /** Set the sort direction for field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setViewIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new GlobalContractObjectKeyFilter ();
    this.Key.ViewIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getViewIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.ViewIdSortAscending;
  }
  /** Set the field level filters for field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setViewIdFilter (BigIntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new GlobalContractObjectKeyFilter ();
    this.Key.ViewId = value;
  }
  /** Retrieve filter for field: ViewId (CUSTOMER_CONTRACT_VIEW.view_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getViewIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.ViewId;
  }
  /** Set the field level Fetch value for field: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch) {
    this.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch () {
    return this.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value) {
    this.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder () {
    return this.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending) {
    this.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection () {
    return this.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (CUSTOMER_CONTRACT_KEY.tracking_id)
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

  /** Set the field level Fetch value for field: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch) {
    this.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch () {
    return this.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value) {
    this.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder () {
    return this.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending) {
    this.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection () {
    return this.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (CUSTOMER_CONTRACT_KEY.tracking_id_serv)
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

  /** Set the field level Fetch value for field: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setCreateDtFetch (boolean fetch) {
    this.CreateDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getCreateDtFetch () {
    return this.CreateDtFetch;
  }
  /** Set the SortOrder for field: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCreateDtSortOrder (Integer value) {
    this.CreateDtSort = value;
  }
  /** Retrieve SortOrder for field: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCreateDtSortOrder () {
    return this.CreateDtSort;
  }
  /** Set the sort direction for field: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCreateDtSortDirection (boolean ascending) {
    this.CreateDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCreateDtSortDirection () {
    return this.CreateDtSortAscending;
  }
  /** Set the field level filters for field: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCreateDtFilter (DateFilter[] value) throws ServiceException {
    this.CreateDt = value;
  }
  /** Retrieve filter for field: CreateDt (CUSTOMER_CONTRACT_KEY.create_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getCreateDtFilter () {
    return this.CreateDt;
  }

  /**
   * Retrieves the CreateDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDtFilter field
   */
  public String[] getCreateDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreateDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDtFilter filter value from a formatted string
   *
   * @param _value the CreateDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreateDtFilter filter field
   */
  public void setCreateDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFilterFromFormattedString");
    try {
      this.setCreateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFilterFromFormattedString");
  }

  /**
   * Retrieves the CreateDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CreateDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the CreateDtFilter field
   */
  public String[] getCreateDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCreateDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCreateDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the CreateDtFilter filter value from a formatted string
   *
   * @param _value the CreateDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CreateDtFilter filter field
   */
  public void setCreateDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
    try {
      this.setCreateDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CreateDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCreateDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @param fetch whether to fetch this field or not
   */
  public void setInUseFetch (boolean fetch) {
    this.InUseFetch = fetch;
  }
  /** Retrieve Fetch value for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @return boolean the Fetch value for this field
   */
  public boolean getInUseFetch () {
    return this.InUseFetch;
  }
  /** Set the SortOrder for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setInUseSortOrder (Integer value) {
    this.InUseSort = value;
  }
  /** Retrieve SortOrder for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getInUseSortOrder () {
    return this.InUseSort;
  }
  /** Set the sort direction for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setInUseSortDirection (boolean ascending) {
    this.InUseSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getInUseSortDirection () {
    return this.InUseSortAscending;
  }
  /** Set the case insensitive for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setInUseCaseInsensitive (boolean ascending) {
    this.InUseCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getInUseCaseInsensitive () {
    return this.InUseCaseInsensitive;
  }
  /** Set the field level filters for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setInUseFilter (StringFilter[] value) throws ServiceException {
    this.InUse = value;
  }
  /** Retrieve filter for field: InUse (CUSTOMER_CONTRACT_KEY.in_use)
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

  /** Set the field level Fetch value for field: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setArchFlagFetch (boolean fetch) {
    this.ArchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getArchFlagFetch () {
    return this.ArchFlagFetch;
  }
  /** Set the SortOrder for field: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArchFlagSortOrder (Integer value) {
    this.ArchFlagSort = value;
  }
  /** Retrieve SortOrder for field: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArchFlagSortOrder () {
    return this.ArchFlagSort;
  }
  /** Set the sort direction for field: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArchFlagSortDirection (boolean ascending) {
    this.ArchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArchFlagSortDirection () {
    return this.ArchFlagSortAscending;
  }
  /** Set the field level filters for field: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ArchFlag = value;
  }
  /** Retrieve filter for field: ArchFlag (CUSTOMER_CONTRACT_KEY.arch_flag)
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

  /** Set the field level Fetch value for field: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * @param fetch whether to fetch this field or not
   */
  public void setAvailPeriodsFetch (boolean fetch) {
    this.AvailPeriodsFetch = fetch;
  }
  /** Retrieve Fetch value for field: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * @return boolean the Fetch value for this field
   */
  public boolean getAvailPeriodsFetch () {
    return this.AvailPeriodsFetch;
  }
  /** Set the SortOrder for field: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAvailPeriodsSortOrder (Integer value) {
    this.AvailPeriodsSort = value;
  }
  /** Retrieve SortOrder for field: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAvailPeriodsSortOrder () {
    return this.AvailPeriodsSort;
  }
  /** Set the sort direction for field: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAvailPeriodsSortDirection (boolean ascending) {
    this.AvailPeriodsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAvailPeriodsSortDirection () {
    return this.AvailPeriodsSortAscending;
  }
  /** Set the field level filters for field: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAvailPeriodsFilter (IntegerFilter[] value) throws ServiceException {
    this.AvailPeriods = value;
  }
  /** Retrieve filter for field: AvailPeriods (CUSTOMER_CONTRACT_KEY.avail_periods)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAvailPeriodsFilter () {
    return this.AvailPeriods;
  }

  /**
   * Retrieves the AvailPeriodsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AvailPeriodsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AvailPeriodsFilter field
   */
  public String[] getAvailPeriodsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAvailPeriodsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAvailPeriodsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAvailPeriodsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvailPeriodsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAvailPeriodsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AvailPeriodsFilter filter value from a formatted string
   *
   * @param _value the AvailPeriodsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AvailPeriodsFilter filter field
   */
  public void setAvailPeriodsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAvailPeriodsFilterFromFormattedString");
    try {
      this.setAvailPeriodsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AvailPeriodsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAvailPeriodsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAvailPeriodsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setFirstUseDtFetch (boolean fetch) {
    this.FirstUseDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getFirstUseDtFetch () {
    return this.FirstUseDtFetch;
  }
  /** Set the SortOrder for field: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFirstUseDtSortOrder (Integer value) {
    this.FirstUseDtSort = value;
  }
  /** Retrieve SortOrder for field: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFirstUseDtSortOrder () {
    return this.FirstUseDtSort;
  }
  /** Set the sort direction for field: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFirstUseDtSortDirection (boolean ascending) {
    this.FirstUseDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFirstUseDtSortDirection () {
    return this.FirstUseDtSortAscending;
  }
  /** Set the field level filters for field: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFirstUseDtFilter (DateFilter[] value) throws ServiceException {
    this.FirstUseDt = value;
  }
  /** Retrieve filter for field: FirstUseDt (CUSTOMER_CONTRACT_KEY.first_use_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getFirstUseDtFilter () {
    return this.FirstUseDt;
  }

  /**
   * Retrieves the FirstUseDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FirstUseDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FirstUseDtFilter field
   */
  public String[] getFirstUseDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFirstUseDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFirstUseDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFirstUseDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FirstUseDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFirstUseDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FirstUseDtFilter filter value from a formatted string
   *
   * @param _value the FirstUseDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FirstUseDtFilter filter field
   */
  public void setFirstUseDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFirstUseDtFilterFromFormattedString");
    try {
      this.setFirstUseDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FirstUseDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFirstUseDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFirstUseDtFilterFromFormattedString");
  }

  /**
   * Retrieves the FirstUseDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FirstUseDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the FirstUseDtFilter field
   */
  public String[] getFirstUseDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFirstUseDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFirstUseDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFirstUseDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FirstUseDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFirstUseDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the FirstUseDtFilter filter value from a formatted string
   *
   * @param _value the FirstUseDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FirstUseDtFilter filter field
   */
  public void setFirstUseDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFirstUseDtFilterFromFormattedDateTimeString");
    try {
      this.setFirstUseDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FirstUseDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFirstUseDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFirstUseDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setLastUseDtFetch (boolean fetch) {
    this.LastUseDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getLastUseDtFetch () {
    return this.LastUseDtFetch;
  }
  /** Set the SortOrder for field: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setLastUseDtSortOrder (Integer value) {
    this.LastUseDtSort = value;
  }
  /** Retrieve SortOrder for field: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getLastUseDtSortOrder () {
    return this.LastUseDtSort;
  }
  /** Set the sort direction for field: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setLastUseDtSortDirection (boolean ascending) {
    this.LastUseDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getLastUseDtSortDirection () {
    return this.LastUseDtSortAscending;
  }
  /** Set the field level filters for field: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setLastUseDtFilter (DateFilter[] value) throws ServiceException {
    this.LastUseDt = value;
  }
  /** Retrieve filter for field: LastUseDt (CUSTOMER_CONTRACT_KEY.last_use_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getLastUseDtFilter () {
    return this.LastUseDt;
  }

  /**
   * Retrieves the LastUseDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LastUseDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastUseDtFilter field
   */
  public String[] getLastUseDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastUseDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLastUseDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastUseDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastUseDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastUseDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the LastUseDtFilter filter value from a formatted string
   *
   * @param _value the LastUseDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LastUseDtFilter filter field
   */
  public void setLastUseDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLastUseDtFilterFromFormattedString");
    try {
      this.setLastUseDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastUseDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastUseDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLastUseDtFilterFromFormattedString");
  }

  /**
   * Retrieves the LastUseDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The LastUseDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastUseDtFilter field
   */
  public String[] getLastUseDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastUseDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getLastUseDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastUseDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastUseDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastUseDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the LastUseDtFilter filter value from a formatted string
   *
   * @param _value the LastUseDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the LastUseDtFilter filter field
   */
  public void setLastUseDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setLastUseDtFilterFromFormattedDateTimeString");
    try {
      this.setLastUseDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("LastUseDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastUseDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLastUseDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setCommitmentAmountFetch (boolean fetch) {
    this.CommitmentAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getCommitmentAmountFetch () {
    return this.CommitmentAmountFetch;
  }
  /** Set the SortOrder for field: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCommitmentAmountSortOrder (Integer value) {
    this.CommitmentAmountSort = value;
  }
  /** Retrieve SortOrder for field: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCommitmentAmountSortOrder () {
    return this.CommitmentAmountSort;
  }
  /** Set the sort direction for field: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCommitmentAmountSortDirection (boolean ascending) {
    this.CommitmentAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCommitmentAmountSortDirection () {
    return this.CommitmentAmountSortAscending;
  }
  /** Set the field level filters for field: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCommitmentAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.CommitmentAmount = value;
  }
  /** Retrieve filter for field: CommitmentAmount (CUSTOMER_CONTRACT_KEY.commitment_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getCommitmentAmountFilter () {
    return this.CommitmentAmount;
  }

  /**
   * Retrieves the CommitmentAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommitmentAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentAmountFilter field
   */
  public String[] getCommitmentAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCommitmentAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CommitmentAmountFilter filter value from a formatted string
   *
   * @param _value the CommitmentAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentAmountFilter filter field
   */
  public void setCommitmentAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentAmountFilterFromFormattedString");
    try {
      this.setCommitmentAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentAmountFilterFromFormattedString");
  }

  /**
   * Sets the CommitmentAmountFilter filter value from a formatted string
   *
   * @param _value the CommitmentAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentAmountFilter filter field
   */
  public void setCommitmentAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentAmountFilterFromFormattedCurrencyString");
    try {
      this.setCommitmentAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the CommitmentAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommitmentAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentAmountFilter field
   */

  public String[] getCommitmentAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCommitmentAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCommitmentCurrencyCodeFetch (boolean fetch) {
    this.CommitmentCurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCommitmentCurrencyCodeFetch () {
    return this.CommitmentCurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCommitmentCurrencyCodeSortOrder (Integer value) {
    this.CommitmentCurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCommitmentCurrencyCodeSortOrder () {
    return this.CommitmentCurrencyCodeSort;
  }
  /** Set the sort direction for field: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCommitmentCurrencyCodeSortDirection (boolean ascending) {
    this.CommitmentCurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCommitmentCurrencyCodeSortDirection () {
    return this.CommitmentCurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCommitmentCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CommitmentCurrencyCode = value;
  }
  /** Retrieve filter for field: CommitmentCurrencyCode (CUSTOMER_CONTRACT_KEY.commitment_currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCommitmentCurrencyCodeFilter () {
    return this.CommitmentCurrencyCode;
  }

  /**
   * Retrieves the CommitmentCurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CommitmentCurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CommitmentCurrencyCodeFilter field
   */
  public String[] getCommitmentCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCommitmentCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CommitmentCurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the CommitmentCurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentCurrencyCodeFilter filter field
   */
  public void setCommitmentCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentCurrencyCodeFilterFromFormattedString");
    try {
      this.setCommitmentCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentCurrencyCodeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated CommitmentCurrencyCodeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CommitmentCurrencyCodeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CommitmentCurrencyCodeFilter filter field
   */
  public String[] getCommitmentCurrencyCodeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentCurrencyCodeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCommitmentCurrencyCodeFilter(), "Currency", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentCurrencyCodeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentCurrencyCodeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CommitmentCurrencyCodeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentCurrencyCodeFilter filter field
   */
  public void setCommitmentCurrencyCodeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentCurrencyCodeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCommitmentCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CommitmentCurrencyCode", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentCurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentCurrencyCodeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentCurrencyCodeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalSavingsAmountFetch (boolean fetch) {
    this.TotalSavingsAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalSavingsAmountFetch () {
    return this.TotalSavingsAmountFetch;
  }
  /** Set the SortOrder for field: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalSavingsAmountSortOrder (Integer value) {
    this.TotalSavingsAmountSort = value;
  }
  /** Retrieve SortOrder for field: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalSavingsAmountSortOrder () {
    return this.TotalSavingsAmountSort;
  }
  /** Set the sort direction for field: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalSavingsAmountSortDirection (boolean ascending) {
    this.TotalSavingsAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalSavingsAmountSortDirection () {
    return this.TotalSavingsAmountSortAscending;
  }
  /** Set the field level filters for field: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalSavingsAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalSavingsAmount = value;
  }
  /** Retrieve filter for field: TotalSavingsAmount (CUSTOMER_CONTRACT_KEY.total_savings_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalSavingsAmountFilter () {
    return this.TotalSavingsAmount;
  }

  /**
   * Retrieves the TotalSavingsAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalSavingsAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalSavingsAmountFilter field
   */
  public String[] getTotalSavingsAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSavingsAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalSavingsAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalSavingsAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSavingsAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalSavingsAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalSavingsAmountFilter filter value from a formatted string
   *
   * @param _value the TotalSavingsAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalSavingsAmountFilter filter field
   */
  public void setTotalSavingsAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalSavingsAmountFilterFromFormattedString");
    try {
      this.setTotalSavingsAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSavingsAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalSavingsAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalSavingsAmountFilterFromFormattedString");
  }

  /**
   * Sets the TotalSavingsAmountFilter filter value from a formatted string
   *
   * @param _value the TotalSavingsAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalSavingsAmountFilter filter field
   */
  public void setTotalSavingsAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalSavingsAmountFilterFromFormattedCurrencyString");
    try {
      this.setTotalSavingsAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSavingsAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalSavingsAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalSavingsAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TotalSavingsAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalSavingsAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalSavingsAmountFilter field
   */

  public String[] getTotalSavingsAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalSavingsAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalSavingsAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalSavingsAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalSavingsAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalSavingsAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalElementAmountFetch (boolean fetch) {
    this.TotalElementAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalElementAmountFetch () {
    return this.TotalElementAmountFetch;
  }
  /** Set the SortOrder for field: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalElementAmountSortOrder (Integer value) {
    this.TotalElementAmountSort = value;
  }
  /** Retrieve SortOrder for field: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalElementAmountSortOrder () {
    return this.TotalElementAmountSort;
  }
  /** Set the sort direction for field: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalElementAmountSortDirection (boolean ascending) {
    this.TotalElementAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalElementAmountSortDirection () {
    return this.TotalElementAmountSortAscending;
  }
  /** Set the field level filters for field: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalElementAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TotalElementAmount = value;
  }
  /** Retrieve filter for field: TotalElementAmount (CUSTOMER_CONTRACT_KEY.total_element_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTotalElementAmountFilter () {
    return this.TotalElementAmount;
  }

  /**
   * Retrieves the TotalElementAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalElementAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalElementAmountFilter field
   */
  public String[] getTotalElementAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalElementAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalElementAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalElementAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalElementAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalElementAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalElementAmountFilter filter value from a formatted string
   *
   * @param _value the TotalElementAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalElementAmountFilter filter field
   */
  public void setTotalElementAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalElementAmountFilterFromFormattedString");
    try {
      this.setTotalElementAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalElementAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalElementAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalElementAmountFilterFromFormattedString");
  }

  /**
   * Sets the TotalElementAmountFilter filter value from a formatted string
   *
   * @param _value the TotalElementAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalElementAmountFilter filter field
   */
  public void setTotalElementAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalElementAmountFilterFromFormattedCurrencyString");
    try {
      this.setTotalElementAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalElementAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalElementAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalElementAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TotalElementAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalElementAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalElementAmountFilter field
   */

  public String[] getTotalElementAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalElementAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalElementAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalElementAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalElementAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalElementAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevEvalDateFetch (boolean fetch) {
    this.PrevEvalDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevEvalDateFetch () {
    return this.PrevEvalDateFetch;
  }
  /** Set the SortOrder for field: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevEvalDateSortOrder (Integer value) {
    this.PrevEvalDateSort = value;
  }
  /** Retrieve SortOrder for field: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevEvalDateSortOrder () {
    return this.PrevEvalDateSort;
  }
  /** Set the sort direction for field: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevEvalDateSortDirection (boolean ascending) {
    this.PrevEvalDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevEvalDateSortDirection () {
    return this.PrevEvalDateSortAscending;
  }
  /** Set the field level filters for field: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevEvalDateFilter (DateFilter[] value) throws ServiceException {
    this.PrevEvalDate = value;
  }
  /** Retrieve filter for field: PrevEvalDate (CUSTOMER_CONTRACT_KEY.prev_eval_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrevEvalDateFilter () {
    return this.PrevEvalDate;
  }

  /**
   * Retrieves the PrevEvalDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevEvalDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEvalDateFilter field
   */
  public String[] getPrevEvalDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEvalDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevEvalDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEvalDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEvalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEvalDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevEvalDateFilter filter value from a formatted string
   *
   * @param _value the PrevEvalDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevEvalDateFilter filter field
   */
  public void setPrevEvalDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevEvalDateFilterFromFormattedString");
    try {
      this.setPrevEvalDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEvalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEvalDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevEvalDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PrevEvalDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevEvalDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEvalDateFilter field
   */
  public String[] getPrevEvalDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEvalDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevEvalDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEvalDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEvalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEvalDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevEvalDateFilter filter value from a formatted string
   *
   * @param _value the PrevEvalDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevEvalDateFilter filter field
   */
  public void setPrevEvalDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevEvalDateFilterFromFormattedDateTimeString");
    try {
      this.setPrevEvalDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEvalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEvalDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevEvalDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * @param fetch whether to fetch this field or not
   */
  public void setNextEvalDateFetch (boolean fetch) {
    this.NextEvalDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getNextEvalDateFetch () {
    return this.NextEvalDateFetch;
  }
  /** Set the SortOrder for field: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNextEvalDateSortOrder (Integer value) {
    this.NextEvalDateSort = value;
  }
  /** Retrieve SortOrder for field: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNextEvalDateSortOrder () {
    return this.NextEvalDateSort;
  }
  /** Set the sort direction for field: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNextEvalDateSortDirection (boolean ascending) {
    this.NextEvalDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNextEvalDateSortDirection () {
    return this.NextEvalDateSortAscending;
  }
  /** Set the field level filters for field: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNextEvalDateFilter (DateFilter[] value) throws ServiceException {
    this.NextEvalDate = value;
  }
  /** Retrieve filter for field: NextEvalDate (CUSTOMER_CONTRACT_KEY.next_eval_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getNextEvalDateFilter () {
    return this.NextEvalDate;
  }

  /**
   * Retrieves the NextEvalDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextEvalDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextEvalDateFilter field
   */
  public String[] getNextEvalDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextEvalDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNextEvalDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextEvalDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextEvalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextEvalDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NextEvalDateFilter filter value from a formatted string
   *
   * @param _value the NextEvalDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NextEvalDateFilter filter field
   */
  public void setNextEvalDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextEvalDateFilterFromFormattedString");
    try {
      this.setNextEvalDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextEvalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextEvalDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextEvalDateFilterFromFormattedString");
  }

  /**
   * Retrieves the NextEvalDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NextEvalDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NextEvalDateFilter field
   */
  public String[] getNextEvalDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNextEvalDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNextEvalDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNextEvalDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextEvalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNextEvalDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NextEvalDateFilter filter value from a formatted string
   *
   * @param _value the NextEvalDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NextEvalDateFilter filter field
   */
  public void setNextEvalDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNextEvalDateFilterFromFormattedDateTimeString");
    try {
      this.setNextEvalDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NextEvalDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNextEvalDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNextEvalDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @param fetch whether to fetch this field or not
   */
  public void setViewStatusFetch (boolean fetch) {
    this.ViewStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getViewStatusFetch () {
    return this.ViewStatusFetch;
  }
  /** Set the SortOrder for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setViewStatusSortOrder (Integer value) {
    this.ViewStatusSort = value;
  }
  /** Retrieve SortOrder for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getViewStatusSortOrder () {
    return this.ViewStatusSort;
  }
  /** Set the sort direction for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setViewStatusSortDirection (boolean ascending) {
    this.ViewStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getViewStatusSortDirection () {
    return this.ViewStatusSortAscending;
  }
  /** Set the field level filters for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setViewStatusFilter (IntegerFilter[] value) throws ServiceException {
    this.ViewStatus = value;
  }
  /** Retrieve filter for field: ViewStatus (CUSTOMER_CONTRACT_VIEW.view_status)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getViewStatusFilter () {
    return this.ViewStatus;
  }

  /**
   * Retrieves the ViewStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewStatusFilter field
   */
  public String[] getViewStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getViewStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ViewStatusFilter filter value from a formatted string
   *
   * @param _value the ViewStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewStatusFilter filter field
   */
  public void setViewStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewStatusFilterFromFormattedString");
    try {
      this.setViewStatusFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewStatusFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ViewStatusFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ViewStatusFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ViewStatusFilter filter field
   */
  public String[] getViewStatusFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewStatusFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getViewStatusFilter(), "ViewStatus", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewStatusFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewStatusFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ViewStatusFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewStatusFilter filter field
   */
  public void setViewStatusFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewStatusFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setViewStatusFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ViewStatus", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewStatusFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewStatusFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setViewCreatedDtFetch (boolean fetch) {
    this.ViewCreatedDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getViewCreatedDtFetch () {
    return this.ViewCreatedDtFetch;
  }
  /** Set the SortOrder for field: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setViewCreatedDtSortOrder (Integer value) {
    this.ViewCreatedDtSort = value;
  }
  /** Retrieve SortOrder for field: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getViewCreatedDtSortOrder () {
    return this.ViewCreatedDtSort;
  }
  /** Set the sort direction for field: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setViewCreatedDtSortDirection (boolean ascending) {
    this.ViewCreatedDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getViewCreatedDtSortDirection () {
    return this.ViewCreatedDtSortAscending;
  }
  /** Set the field level filters for field: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setViewCreatedDtFilter (DateFilter[] value) throws ServiceException {
    this.ViewCreatedDt = value;
  }
  /** Retrieve filter for field: ViewCreatedDt (CUSTOMER_CONTRACT_VIEW.view_created_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getViewCreatedDtFilter () {
    return this.ViewCreatedDt;
  }

  /**
   * Retrieves the ViewCreatedDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewCreatedDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewCreatedDtFilter field
   */
  public String[] getViewCreatedDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewCreatedDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getViewCreatedDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewCreatedDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewCreatedDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewCreatedDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ViewCreatedDtFilter filter value from a formatted string
   *
   * @param _value the ViewCreatedDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewCreatedDtFilter filter field
   */
  public void setViewCreatedDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewCreatedDtFilterFromFormattedString");
    try {
      this.setViewCreatedDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewCreatedDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewCreatedDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewCreatedDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ViewCreatedDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewCreatedDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewCreatedDtFilter field
   */
  public String[] getViewCreatedDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewCreatedDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getViewCreatedDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewCreatedDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewCreatedDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewCreatedDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ViewCreatedDtFilter filter value from a formatted string
   *
   * @param _value the ViewCreatedDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewCreatedDtFilter filter field
   */
  public void setViewCreatedDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewCreatedDtFilterFromFormattedDateTimeString");
    try {
      this.setViewCreatedDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewCreatedDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewCreatedDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewCreatedDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setViewEffectiveDtFetch (boolean fetch) {
    this.ViewEffectiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getViewEffectiveDtFetch () {
    return this.ViewEffectiveDtFetch;
  }
  /** Set the SortOrder for field: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setViewEffectiveDtSortOrder (Integer value) {
    this.ViewEffectiveDtSort = value;
  }
  /** Retrieve SortOrder for field: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getViewEffectiveDtSortOrder () {
    return this.ViewEffectiveDtSort;
  }
  /** Set the sort direction for field: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setViewEffectiveDtSortDirection (boolean ascending) {
    this.ViewEffectiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getViewEffectiveDtSortDirection () {
    return this.ViewEffectiveDtSortAscending;
  }
  /** Set the field level filters for field: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setViewEffectiveDtFilter (DateFilter[] value) throws ServiceException {
    this.ViewEffectiveDt = value;
  }
  /** Retrieve filter for field: ViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.view_effective_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getViewEffectiveDtFilter () {
    return this.ViewEffectiveDt;
  }

  /**
   * Retrieves the ViewEffectiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewEffectiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewEffectiveDtFilter field
   */
  public String[] getViewEffectiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewEffectiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getViewEffectiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewEffectiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewEffectiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewEffectiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ViewEffectiveDtFilter filter value from a formatted string
   *
   * @param _value the ViewEffectiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewEffectiveDtFilter filter field
   */
  public void setViewEffectiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewEffectiveDtFilterFromFormattedString");
    try {
      this.setViewEffectiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewEffectiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewEffectiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewEffectiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the ViewEffectiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ViewEffectiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewEffectiveDtFilter field
   */
  public String[] getViewEffectiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewEffectiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getViewEffectiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewEffectiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewEffectiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewEffectiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ViewEffectiveDtFilter filter value from a formatted string
   *
   * @param _value the ViewEffectiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ViewEffectiveDtFilter filter field
   */
  public void setViewEffectiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setViewEffectiveDtFilterFromFormattedDateTimeString");
    try {
      this.setViewEffectiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ViewEffectiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewEffectiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewEffectiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setIntendedViewEffectiveDtFetch (boolean fetch) {
    this.IntendedViewEffectiveDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getIntendedViewEffectiveDtFetch () {
    return this.IntendedViewEffectiveDtFetch;
  }
  /** Set the SortOrder for field: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIntendedViewEffectiveDtSortOrder (Integer value) {
    this.IntendedViewEffectiveDtSort = value;
  }
  /** Retrieve SortOrder for field: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIntendedViewEffectiveDtSortOrder () {
    return this.IntendedViewEffectiveDtSort;
  }
  /** Set the sort direction for field: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIntendedViewEffectiveDtSortDirection (boolean ascending) {
    this.IntendedViewEffectiveDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIntendedViewEffectiveDtSortDirection () {
    return this.IntendedViewEffectiveDtSortAscending;
  }
  /** Set the field level filters for field: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIntendedViewEffectiveDtFilter (DateFilter[] value) throws ServiceException {
    this.IntendedViewEffectiveDt = value;
  }
  /** Retrieve filter for field: IntendedViewEffectiveDt (CUSTOMER_CONTRACT_VIEW.intended_view_effective_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getIntendedViewEffectiveDtFilter () {
    return this.IntendedViewEffectiveDt;
  }

  /**
   * Retrieves the IntendedViewEffectiveDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IntendedViewEffectiveDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IntendedViewEffectiveDtFilter field
   */
  public String[] getIntendedViewEffectiveDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIntendedViewEffectiveDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIntendedViewEffectiveDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIntendedViewEffectiveDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IntendedViewEffectiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIntendedViewEffectiveDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IntendedViewEffectiveDtFilter filter value from a formatted string
   *
   * @param _value the IntendedViewEffectiveDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IntendedViewEffectiveDtFilter filter field
   */
  public void setIntendedViewEffectiveDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIntendedViewEffectiveDtFilterFromFormattedString");
    try {
      this.setIntendedViewEffectiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IntendedViewEffectiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIntendedViewEffectiveDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIntendedViewEffectiveDtFilterFromFormattedString");
  }

  /**
   * Retrieves the IntendedViewEffectiveDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IntendedViewEffectiveDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the IntendedViewEffectiveDtFilter field
   */
  public String[] getIntendedViewEffectiveDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIntendedViewEffectiveDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIntendedViewEffectiveDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIntendedViewEffectiveDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IntendedViewEffectiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIntendedViewEffectiveDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the IntendedViewEffectiveDtFilter filter value from a formatted string
   *
   * @param _value the IntendedViewEffectiveDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IntendedViewEffectiveDtFilter filter field
   */
  public void setIntendedViewEffectiveDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIntendedViewEffectiveDtFilterFromFormattedDateTimeString");
    try {
      this.setIntendedViewEffectiveDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IntendedViewEffectiveDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIntendedViewEffectiveDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIntendedViewEffectiveDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevViewIdFetch (boolean fetch) {
    this.PrevViewIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevViewIdFetch () {
    return this.PrevViewIdFetch;
  }
  /** Set the SortOrder for field: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevViewIdSortOrder (Integer value) {
    this.PrevViewIdSort = value;
  }
  /** Retrieve SortOrder for field: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevViewIdSortOrder () {
    return this.PrevViewIdSort;
  }
  /** Set the sort direction for field: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevViewIdSortDirection (boolean ascending) {
    this.PrevViewIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevViewIdSortDirection () {
    return this.PrevViewIdSortAscending;
  }
  /** Set the field level filters for field: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevViewIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.PrevViewId = value;
  }
  /** Retrieve filter for field: PrevViewId (CUSTOMER_CONTRACT_VIEW.prev_view_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getPrevViewIdFilter () {
    return this.PrevViewId;
  }

  /**
   * Retrieves the PrevViewIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevViewIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevViewIdFilter field
   */
  public String[] getPrevViewIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevViewIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevViewIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevViewIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevViewIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevViewIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevViewIdFilter filter value from a formatted string
   *
   * @param _value the PrevViewIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevViewIdFilter filter field
   */
  public void setPrevViewIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevViewIdFilterFromFormattedString");
    try {
      this.setPrevViewIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevViewIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevViewIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevViewIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @param fetch whether to fetch this field or not
   */
  public void setContractTypeFetch (boolean fetch) {
    this.ContractTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractTypeFetch () {
    return this.ContractTypeFetch;
  }
  /** Set the SortOrder for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractTypeSortOrder (Integer value) {
    this.ContractTypeSort = value;
  }
  /** Retrieve SortOrder for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractTypeSortOrder () {
    return this.ContractTypeSort;
  }
  /** Set the sort direction for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractTypeSortDirection (boolean ascending) {
    this.ContractTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractTypeSortDirection () {
    return this.ContractTypeSortAscending;
  }
  /** Set the field level filters for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.ContractType = value;
  }
  /** Retrieve filter for field: ContractType (CUSTOMER_CONTRACT_VIEW.contract_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getContractTypeFilter () {
    return this.ContractType;
  }

  /**
   * Retrieves the ContractTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractTypeFilter field
   */
  public String[] getContractTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractTypeFilter filter value from a formatted string
   *
   * @param _value the ContractTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTypeFilter filter field
   */
  public void setContractTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFilterFromFormattedString");
    try {
      this.setContractTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated ContractTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ContractTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ContractTypeFilter filter field
   */
  public String[] getContractTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getContractTypeFilter(), "ContractType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated ContractTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractTypeFilter filter field
   */
  public void setContractTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setContractTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "ContractType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @param fetch whether to fetch this field or not
   */
  public void setContractIdFetch (boolean fetch) {
    this.ContractIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getContractIdFetch () {
    return this.ContractIdFetch;
  }
  /** Set the SortOrder for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setContractIdSortOrder (Integer value) {
    this.ContractIdSort = value;
  }
  /** Retrieve SortOrder for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getContractIdSortOrder () {
    return this.ContractIdSort;
  }
  /** Set the sort direction for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setContractIdSortDirection (boolean ascending) {
    this.ContractIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getContractIdSortDirection () {
    return this.ContractIdSortAscending;
  }
  /** Set the case insensitive for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setContractIdCaseInsensitive (boolean ascending) {
    this.ContractIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getContractIdCaseInsensitive () {
    return this.ContractIdCaseInsensitive;
  }
  /** Set the field level filters for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setContractIdFilter (StringFilter[] value) throws ServiceException {
    this.ContractId = value;
  }
  /** Retrieve filter for field: ContractId (CUSTOMER_CONTRACT_VIEW.contract_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getContractIdFilter () {
    return this.ContractId;
  }

  /**
   * Retrieves the ContractIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ContractIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ContractIdFilter field
   */
  public String[] getContractIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getContractIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getContractIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getContractIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getContractIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ContractIdFilter filter value from a formatted string
   *
   * @param _value the ContractIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ContractIdFilter filter field
   */
  public void setContractIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setContractIdFilterFromFormattedString");
    try {
      this.setContractIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ContractIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setContractIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setContractIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * @param fetch whether to fetch this field or not
   */
  public void setParentGroupNoFetch (boolean fetch) {
    this.ParentGroupNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getParentGroupNoFetch () {
    return this.ParentGroupNoFetch;
  }
  /** Set the SortOrder for field: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setParentGroupNoSortOrder (Integer value) {
    this.ParentGroupNoSort = value;
  }
  /** Retrieve SortOrder for field: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getParentGroupNoSortOrder () {
    return this.ParentGroupNoSort;
  }
  /** Set the sort direction for field: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setParentGroupNoSortDirection (boolean ascending) {
    this.ParentGroupNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getParentGroupNoSortDirection () {
    return this.ParentGroupNoSortAscending;
  }
  /** Set the field level filters for field: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setParentGroupNoFilter (IntegerFilter[] value) throws ServiceException {
    this.ParentGroupNo = value;
  }
  /** Retrieve filter for field: ParentGroupNo (CUSTOMER_CONTRACT_VIEW.parent_group_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getParentGroupNoFilter () {
    return this.ParentGroupNo;
  }

  /**
   * Retrieves the ParentGroupNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ParentGroupNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ParentGroupNoFilter field
   */
  public String[] getParentGroupNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getParentGroupNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getParentGroupNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getParentGroupNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentGroupNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getParentGroupNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ParentGroupNoFilter filter value from a formatted string
   *
   * @param _value the ParentGroupNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ParentGroupNoFilter filter field
   */
  public void setParentGroupNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setParentGroupNoFilterFromFormattedString");
    try {
      this.setParentGroupNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ParentGroupNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setParentGroupNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setParentGroupNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setStartDtFetch (boolean fetch) {
    this.StartDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartDtFetch () {
    return this.StartDtFetch;
  }
  /** Set the SortOrder for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartDtSortOrder (Integer value) {
    this.StartDtSort = value;
  }
  /** Retrieve SortOrder for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartDtSortOrder () {
    return this.StartDtSort;
  }
  /** Set the sort direction for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartDtSortDirection (boolean ascending) {
    this.StartDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartDtSortDirection () {
    return this.StartDtSortAscending;
  }
  /** Set the field level filters for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartDtFilter (DateFilter[] value) throws ServiceException {
    this.StartDt = value;
  }
  /** Retrieve filter for field: StartDt (CUSTOMER_CONTRACT_VIEW.start_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getStartDtFilter () {
    return this.StartDt;
  }

  /**
   * Retrieves the StartDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDtFilter field
   */
  public String[] getStartDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StartDtFilter filter value from a formatted string
   *
   * @param _value the StartDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartDtFilter filter field
   */
  public void setStartDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFilterFromFormattedString");
    try {
      this.setStartDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFilterFromFormattedString");
  }

  /**
   * Retrieves the StartDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartDtFilter field
   */
  public String[] getStartDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StartDtFilter filter value from a formatted string
   *
   * @param _value the StartDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartDtFilter filter field
   */
  public void setStartDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartDtFilterFromFormattedDateTimeString");
    try {
      this.setStartDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setEndDtFetch (boolean fetch) {
    this.EndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getEndDtFetch () {
    return this.EndDtFetch;
  }
  /** Set the SortOrder for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setEndDtSortOrder (Integer value) {
    this.EndDtSort = value;
  }
  /** Retrieve SortOrder for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getEndDtSortOrder () {
    return this.EndDtSort;
  }
  /** Set the sort direction for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setEndDtSortDirection (boolean ascending) {
    this.EndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getEndDtSortDirection () {
    return this.EndDtSortAscending;
  }
  /** Set the field level filters for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setEndDtFilter (DateFilter[] value) throws ServiceException {
    this.EndDt = value;
  }
  /** Retrieve filter for field: EndDt (CUSTOMER_CONTRACT_VIEW.end_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getEndDtFilter () {
    return this.EndDt;
  }

  /**
   * Retrieves the EndDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDtFilter field
   */
  public String[] getEndDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEndDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the EndDtFilter filter value from a formatted string
   *
   * @param _value the EndDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EndDtFilter filter field
   */
  public void setEndDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFilterFromFormattedString");
    try {
      this.setEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFilterFromFormattedString");
  }

  /**
   * Retrieves the EndDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The EndDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the EndDtFilter field
   */
  public String[] getEndDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEndDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getEndDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEndDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getEndDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the EndDtFilter filter value from a formatted string
   *
   * @param _value the EndDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the EndDtFilter filter field
   */
  public void setEndDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setEndDtFilterFromFormattedDateTimeString");
    try {
      this.setEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("EndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setEndDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEndDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setPrevEndDtFetch (boolean fetch) {
    this.PrevEndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getPrevEndDtFetch () {
    return this.PrevEndDtFetch;
  }
  /** Set the SortOrder for field: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPrevEndDtSortOrder (Integer value) {
    this.PrevEndDtSort = value;
  }
  /** Retrieve SortOrder for field: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPrevEndDtSortOrder () {
    return this.PrevEndDtSort;
  }
  /** Set the sort direction for field: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPrevEndDtSortDirection (boolean ascending) {
    this.PrevEndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPrevEndDtSortDirection () {
    return this.PrevEndDtSortAscending;
  }
  /** Set the field level filters for field: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPrevEndDtFilter (DateFilter[] value) throws ServiceException {
    this.PrevEndDt = value;
  }
  /** Retrieve filter for field: PrevEndDt (CUSTOMER_CONTRACT_VIEW.prev_end_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPrevEndDtFilter () {
    return this.PrevEndDt;
  }

  /**
   * Retrieves the PrevEndDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevEndDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEndDtFilter field
   */
  public String[] getPrevEndDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevEndDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEndDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEndDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PrevEndDtFilter filter value from a formatted string
   *
   * @param _value the PrevEndDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevEndDtFilter filter field
   */
  public void setPrevEndDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevEndDtFilterFromFormattedString");
    try {
      this.setPrevEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEndDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevEndDtFilterFromFormattedString");
  }

  /**
   * Retrieves the PrevEndDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PrevEndDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PrevEndDtFilter field
   */
  public String[] getPrevEndDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPrevEndDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPrevEndDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPrevEndDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPrevEndDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PrevEndDtFilter filter value from a formatted string
   *
   * @param _value the PrevEndDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PrevEndDtFilter filter field
   */
  public void setPrevEndDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPrevEndDtFilterFromFormattedDateTimeString");
    try {
      this.setPrevEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PrevEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPrevEndDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPrevEndDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * @param fetch whether to fetch this field or not
   */
  public void setGracePeriodFetch (boolean fetch) {
    this.GracePeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getGracePeriodFetch () {
    return this.GracePeriodFetch;
  }
  /** Set the SortOrder for field: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGracePeriodSortOrder (Integer value) {
    this.GracePeriodSort = value;
  }
  /** Retrieve SortOrder for field: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGracePeriodSortOrder () {
    return this.GracePeriodSort;
  }
  /** Set the sort direction for field: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGracePeriodSortDirection (boolean ascending) {
    this.GracePeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGracePeriodSortDirection () {
    return this.GracePeriodSortAscending;
  }
  /** Set the field level filters for field: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGracePeriodFilter (IntegerFilter[] value) throws ServiceException {
    this.GracePeriod = value;
  }
  /** Retrieve filter for field: GracePeriod (CUSTOMER_CONTRACT_VIEW.grace_period)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getGracePeriodFilter () {
    return this.GracePeriod;
  }

  /**
   * Retrieves the GracePeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GracePeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GracePeriodFilter field
   */
  public String[] getGracePeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGracePeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGracePeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGracePeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GracePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGracePeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GracePeriodFilter filter value from a formatted string
   *
   * @param _value the GracePeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GracePeriodFilter filter field
   */
  public void setGracePeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGracePeriodFilterFromFormattedString");
    try {
      this.setGracePeriodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GracePeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGracePeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGracePeriodFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * @param fetch whether to fetch this field or not
   */
  public void setTotalPeriodsFetch (boolean fetch) {
    this.TotalPeriodsFetch = fetch;
  }
  /** Retrieve Fetch value for field: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * @return boolean the Fetch value for this field
   */
  public boolean getTotalPeriodsFetch () {
    return this.TotalPeriodsFetch;
  }
  /** Set the SortOrder for field: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTotalPeriodsSortOrder (Integer value) {
    this.TotalPeriodsSort = value;
  }
  /** Retrieve SortOrder for field: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTotalPeriodsSortOrder () {
    return this.TotalPeriodsSort;
  }
  /** Set the sort direction for field: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTotalPeriodsSortDirection (boolean ascending) {
    this.TotalPeriodsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTotalPeriodsSortDirection () {
    return this.TotalPeriodsSortAscending;
  }
  /** Set the field level filters for field: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTotalPeriodsFilter (IntegerFilter[] value) throws ServiceException {
    this.TotalPeriods = value;
  }
  /** Retrieve filter for field: TotalPeriods (CUSTOMER_CONTRACT_VIEW.total_periods)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTotalPeriodsFilter () {
    return this.TotalPeriods;
  }

  /**
   * Retrieves the TotalPeriodsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TotalPeriodsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TotalPeriodsFilter field
   */
  public String[] getTotalPeriodsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTotalPeriodsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTotalPeriodsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTotalPeriodsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalPeriodsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTotalPeriodsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TotalPeriodsFilter filter value from a formatted string
   *
   * @param _value the TotalPeriodsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TotalPeriodsFilter filter field
   */
  public void setTotalPeriodsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTotalPeriodsFilterFromFormattedString");
    try {
      this.setTotalPeriodsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TotalPeriodsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTotalPeriodsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTotalPeriodsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSalesChannelIdFetch (boolean fetch) {
    this.SalesChannelIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSalesChannelIdFetch () {
    return this.SalesChannelIdFetch;
  }
  /** Set the SortOrder for field: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSalesChannelIdSortOrder (Integer value) {
    this.SalesChannelIdSort = value;
  }
  /** Retrieve SortOrder for field: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSalesChannelIdSortOrder () {
    return this.SalesChannelIdSort;
  }
  /** Set the sort direction for field: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSalesChannelIdSortDirection (boolean ascending) {
    this.SalesChannelIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSalesChannelIdSortDirection () {
    return this.SalesChannelIdSortAscending;
  }
  /** Set the field level filters for field: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSalesChannelIdFilter (IntegerFilter[] value) throws ServiceException {
    this.SalesChannelId = value;
  }
  /** Retrieve filter for field: SalesChannelId (CUSTOMER_CONTRACT_VIEW.sales_channel_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSalesChannelIdFilter () {
    return this.SalesChannelId;
  }

  /**
   * Retrieves the SalesChannelIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SalesChannelIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SalesChannelIdFilter field
   */
  public String[] getSalesChannelIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSalesChannelIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesChannelIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesChannelIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SalesChannelIdFilter filter value from a formatted string
   *
   * @param _value the SalesChannelIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SalesChannelIdFilter filter field
   */
  public void setSalesChannelIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSalesChannelIdFilterFromFormattedString");
    try {
      this.setSalesChannelIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesChannelIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesChannelIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSalesChannelIdFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated SalesChannelIdFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the SalesChannelIdFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the SalesChannelIdFilter filter field
   */
  public String[] getSalesChannelIdFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getSalesChannelIdFilter(), "SalesChannel", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelIdFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesChannelIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesChannelIdFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated SalesChannelIdFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the SalesChannelIdFilter filter field
   */
  public void setSalesChannelIdFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSalesChannelIdFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setSalesChannelIdFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "SalesChannelId", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SalesChannelIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesChannelIdFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSalesChannelIdFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackTotalAmountsFetch (boolean fetch) {
    this.TrackTotalAmountsFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackTotalAmountsFetch () {
    return this.TrackTotalAmountsFetch;
  }
  /** Set the SortOrder for field: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackTotalAmountsSortOrder (Integer value) {
    this.TrackTotalAmountsSort = value;
  }
  /** Retrieve SortOrder for field: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackTotalAmountsSortOrder () {
    return this.TrackTotalAmountsSort;
  }
  /** Set the sort direction for field: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackTotalAmountsSortDirection (boolean ascending) {
    this.TrackTotalAmountsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackTotalAmountsSortDirection () {
    return this.TrackTotalAmountsSortAscending;
  }
  /** Set the field level filters for field: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackTotalAmountsFilter (BooleanFilter[] value) throws ServiceException {
    this.TrackTotalAmounts = value;
  }
  /** Retrieve filter for field: TrackTotalAmounts (CUSTOMER_CONTRACT_VIEW.track_total_amounts)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getTrackTotalAmountsFilter () {
    return this.TrackTotalAmounts;
  }

  /**
   * Retrieves the TrackTotalAmountsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TrackTotalAmountsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackTotalAmountsFilter field
   */
  public String[] getTrackTotalAmountsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackTotalAmountsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTrackTotalAmountsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackTotalAmountsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackTotalAmountsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackTotalAmountsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TrackTotalAmountsFilter filter value from a formatted string
   *
   * @param _value the TrackTotalAmountsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TrackTotalAmountsFilter filter field
   */
  public void setTrackTotalAmountsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTrackTotalAmountsFilterFromFormattedString");
    try {
      this.setTrackTotalAmountsFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TrackTotalAmountsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackTotalAmountsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackTotalAmountsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * @param fetch whether to fetch this field or not
   */
  public void setRolloverPeriodFetch (boolean fetch) {
    this.RolloverPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getRolloverPeriodFetch () {
    return this.RolloverPeriodFetch;
  }
  /** Set the SortOrder for field: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRolloverPeriodSortOrder (Integer value) {
    this.RolloverPeriodSort = value;
  }
  /** Retrieve SortOrder for field: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRolloverPeriodSortOrder () {
    return this.RolloverPeriodSort;
  }
  /** Set the sort direction for field: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRolloverPeriodSortDirection (boolean ascending) {
    this.RolloverPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRolloverPeriodSortDirection () {
    return this.RolloverPeriodSortAscending;
  }
  /** Set the field level filters for field: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRolloverPeriodFilter (IntegerFilter[] value) throws ServiceException {
    this.RolloverPeriod = value;
  }
  /** Retrieve filter for field: RolloverPeriod (CUSTOMER_CONTRACT_VIEW.rollover_period)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRolloverPeriodFilter () {
    return this.RolloverPeriod;
  }

  /**
   * Retrieves the RolloverPeriodFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RolloverPeriodFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RolloverPeriodFilter field
   */
  public String[] getRolloverPeriodFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverPeriodFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRolloverPeriodFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverPeriodFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverPeriodFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RolloverPeriodFilter filter value from a formatted string
   *
   * @param _value the RolloverPeriodFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RolloverPeriodFilter filter field
   */
  public void setRolloverPeriodFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRolloverPeriodFilterFromFormattedString");
    try {
      this.setRolloverPeriodFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverPeriodFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRolloverPeriodFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated RolloverPeriodFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the RolloverPeriodFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the RolloverPeriodFilter filter field
   */
  public String[] getRolloverPeriodFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverPeriodFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getRolloverPeriodFilter(), "RolloverPeriodStart", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverPeriodFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverPeriodFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated RolloverPeriodFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the RolloverPeriodFilter filter field
   */
  public void setRolloverPeriodFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRolloverPeriodFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setRolloverPeriodFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "RolloverPeriod", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverPeriodFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverPeriodFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRolloverPeriodFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * @param fetch whether to fetch this field or not
   */
  public void setRolloverPeriodStartFetch (boolean fetch) {
    this.RolloverPeriodStartFetch = fetch;
  }
  /** Retrieve Fetch value for field: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * @return boolean the Fetch value for this field
   */
  public boolean getRolloverPeriodStartFetch () {
    return this.RolloverPeriodStartFetch;
  }
  /** Set the SortOrder for field: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setRolloverPeriodStartSortOrder (Integer value) {
    this.RolloverPeriodStartSort = value;
  }
  /** Retrieve SortOrder for field: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getRolloverPeriodStartSortOrder () {
    return this.RolloverPeriodStartSort;
  }
  /** Set the sort direction for field: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setRolloverPeriodStartSortDirection (boolean ascending) {
    this.RolloverPeriodStartSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getRolloverPeriodStartSortDirection () {
    return this.RolloverPeriodStartSortAscending;
  }
  /** Set the field level filters for field: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setRolloverPeriodStartFilter (IntegerFilter[] value) throws ServiceException {
    this.RolloverPeriodStart = value;
  }
  /** Retrieve filter for field: RolloverPeriodStart (CUSTOMER_CONTRACT_VIEW.rollover_period_start)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getRolloverPeriodStartFilter () {
    return this.RolloverPeriodStart;
  }

  /**
   * Retrieves the RolloverPeriodStartFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RolloverPeriodStartFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RolloverPeriodStartFilter field
   */
  public String[] getRolloverPeriodStartFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRolloverPeriodStartFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getRolloverPeriodStartFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRolloverPeriodStartFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverPeriodStartFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRolloverPeriodStartFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the RolloverPeriodStartFilter filter value from a formatted string
   *
   * @param _value the RolloverPeriodStartFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the RolloverPeriodStartFilter filter field
   */
  public void setRolloverPeriodStartFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRolloverPeriodStartFilterFromFormattedString");
    try {
      this.setRolloverPeriodStartFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RolloverPeriodStartFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRolloverPeriodStartFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRolloverPeriodStartFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @param fetch whether to fetch this field or not
   */
  public void setBillPeriodFetch (boolean fetch) {
    this.BillPeriodFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillPeriodFetch () {
    return this.BillPeriodFetch;
  }
  /** Set the SortOrder for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillPeriodSortOrder (Integer value) {
    this.BillPeriodSort = value;
  }
  /** Retrieve SortOrder for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillPeriodSortOrder () {
    return this.BillPeriodSort;
  }
  /** Set the sort direction for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillPeriodSortDirection (boolean ascending) {
    this.BillPeriodSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillPeriodSortDirection () {
    return this.BillPeriodSortAscending;
  }
  /** Set the case insensitive for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillPeriodCaseInsensitive (boolean ascending) {
    this.BillPeriodCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillPeriodCaseInsensitive () {
    return this.BillPeriodCaseInsensitive;
  }
  /** Set the field level filters for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillPeriodFilter (StringFilter[] value) throws ServiceException {
    this.BillPeriod = value;
  }
  /** Retrieve filter for field: BillPeriod (CUSTOMER_CONTRACT_VIEW.bill_period)
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


  /** Set the field level Fetch value for field: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * @param fetch whether to fetch this field or not
   */
  public void setDistributePaybackFetch (boolean fetch) {
    this.DistributePaybackFetch = fetch;
  }
  /** Retrieve Fetch value for field: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * @return boolean the Fetch value for this field
   */
  public boolean getDistributePaybackFetch () {
    return this.DistributePaybackFetch;
  }
  /** Set the SortOrder for field: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDistributePaybackSortOrder (Integer value) {
    this.DistributePaybackSort = value;
  }
  /** Retrieve SortOrder for field: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDistributePaybackSortOrder () {
    return this.DistributePaybackSort;
  }
  /** Set the sort direction for field: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDistributePaybackSortDirection (boolean ascending) {
    this.DistributePaybackSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDistributePaybackSortDirection () {
    return this.DistributePaybackSortAscending;
  }
  /** Set the field level filters for field: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDistributePaybackFilter (BooleanFilter[] value) throws ServiceException {
    this.DistributePayback = value;
  }
  /** Retrieve filter for field: DistributePayback (CUSTOMER_CONTRACT_VIEW.distribute_payback)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getDistributePaybackFilter () {
    return this.DistributePayback;
  }

  /**
   * Retrieves the DistributePaybackFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DistributePaybackFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DistributePaybackFilter field
   */
  public String[] getDistributePaybackFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDistributePaybackFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDistributePaybackFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDistributePaybackFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributePaybackFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDistributePaybackFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DistributePaybackFilter filter value from a formatted string
   *
   * @param _value the DistributePaybackFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DistributePaybackFilter filter field
   */
  public void setDistributePaybackFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDistributePaybackFilterFromFormattedString");
    try {
      this.setDistributePaybackFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DistributePaybackFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDistributePaybackFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDistributePaybackFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateContractStrtOverrideFetch (boolean fetch) {
    this.ProrateContractStrtOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateContractStrtOverrideFetch () {
    return this.ProrateContractStrtOverrideFetch;
  }
  /** Set the SortOrder for field: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateContractStrtOverrideSortOrder (Integer value) {
    this.ProrateContractStrtOverrideSort = value;
  }
  /** Retrieve SortOrder for field: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateContractStrtOverrideSortOrder () {
    return this.ProrateContractStrtOverrideSort;
  }
  /** Set the sort direction for field: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateContractStrtOverrideSortDirection (boolean ascending) {
    this.ProrateContractStrtOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateContractStrtOverrideSortDirection () {
    return this.ProrateContractStrtOverrideSortAscending;
  }
  /** Set the field level filters for field: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateContractStrtOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.ProrateContractStrtOverride = value;
  }
  /** Retrieve filter for field: ProrateContractStrtOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_strt_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProrateContractStrtOverrideFilter () {
    return this.ProrateContractStrtOverride;
  }

  /**
   * Retrieves the ProrateContractStrtOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateContractStrtOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateContractStrtOverrideFilter field
   */
  public String[] getProrateContractStrtOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractStrtOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateContractStrtOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateContractStrtOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateContractStrtOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateContractStrtOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateContractStrtOverrideFilter filter value from a formatted string
   *
   * @param _value the ProrateContractStrtOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateContractStrtOverrideFilter filter field
   */
  public void setProrateContractStrtOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateContractStrtOverrideFilterFromFormattedString");
    try {
      this.setProrateContractStrtOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateContractStrtOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateContractStrtOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateContractStrtOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateContractEndOverrideFetch (boolean fetch) {
    this.ProrateContractEndOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateContractEndOverrideFetch () {
    return this.ProrateContractEndOverrideFetch;
  }
  /** Set the SortOrder for field: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateContractEndOverrideSortOrder (Integer value) {
    this.ProrateContractEndOverrideSort = value;
  }
  /** Retrieve SortOrder for field: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateContractEndOverrideSortOrder () {
    return this.ProrateContractEndOverrideSort;
  }
  /** Set the sort direction for field: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateContractEndOverrideSortDirection (boolean ascending) {
    this.ProrateContractEndOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateContractEndOverrideSortDirection () {
    return this.ProrateContractEndOverrideSortAscending;
  }
  /** Set the field level filters for field: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateContractEndOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.ProrateContractEndOverride = value;
  }
  /** Retrieve filter for field: ProrateContractEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_contract_end_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProrateContractEndOverrideFilter () {
    return this.ProrateContractEndOverride;
  }

  /**
   * Retrieves the ProrateContractEndOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateContractEndOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateContractEndOverrideFilter field
   */
  public String[] getProrateContractEndOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateContractEndOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateContractEndOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateContractEndOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateContractEndOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateContractEndOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateContractEndOverrideFilter filter value from a formatted string
   *
   * @param _value the ProrateContractEndOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateContractEndOverrideFilter filter field
   */
  public void setProrateContractEndOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateContractEndOverrideFilterFromFormattedString");
    try {
      this.setProrateContractEndOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateContractEndOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateContractEndOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateContractEndOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateInterimBillOverrideFetch (boolean fetch) {
    this.ProrateInterimBillOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateInterimBillOverrideFetch () {
    return this.ProrateInterimBillOverrideFetch;
  }
  /** Set the SortOrder for field: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateInterimBillOverrideSortOrder (Integer value) {
    this.ProrateInterimBillOverrideSort = value;
  }
  /** Retrieve SortOrder for field: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateInterimBillOverrideSortOrder () {
    return this.ProrateInterimBillOverrideSort;
  }
  /** Set the sort direction for field: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateInterimBillOverrideSortDirection (boolean ascending) {
    this.ProrateInterimBillOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateInterimBillOverrideSortDirection () {
    return this.ProrateInterimBillOverrideSortAscending;
  }
  /** Set the field level filters for field: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateInterimBillOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.ProrateInterimBillOverride = value;
  }
  /** Retrieve filter for field: ProrateInterimBillOverride (CUSTOMER_CONTRACT_VIEW.prorate_interim_bill_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProrateInterimBillOverrideFilter () {
    return this.ProrateInterimBillOverride;
  }

  /**
   * Retrieves the ProrateInterimBillOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateInterimBillOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateInterimBillOverrideFilter field
   */
  public String[] getProrateInterimBillOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateInterimBillOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateInterimBillOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateInterimBillOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateInterimBillOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateInterimBillOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateInterimBillOverrideFilter filter value from a formatted string
   *
   * @param _value the ProrateInterimBillOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateInterimBillOverrideFilter filter field
   */
  public void setProrateInterimBillOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateInterimBillOverrideFilterFromFormattedString");
    try {
      this.setProrateInterimBillOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateInterimBillOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateInterimBillOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateInterimBillOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * @param fetch whether to fetch this field or not
   */
  public void setProratePeriodChangeOverrideFetch (boolean fetch) {
    this.ProratePeriodChangeOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getProratePeriodChangeOverrideFetch () {
    return this.ProratePeriodChangeOverrideFetch;
  }
  /** Set the SortOrder for field: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProratePeriodChangeOverrideSortOrder (Integer value) {
    this.ProratePeriodChangeOverrideSort = value;
  }
  /** Retrieve SortOrder for field: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProratePeriodChangeOverrideSortOrder () {
    return this.ProratePeriodChangeOverrideSort;
  }
  /** Set the sort direction for field: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProratePeriodChangeOverrideSortDirection (boolean ascending) {
    this.ProratePeriodChangeOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProratePeriodChangeOverrideSortDirection () {
    return this.ProratePeriodChangeOverrideSortAscending;
  }
  /** Set the field level filters for field: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProratePeriodChangeOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.ProratePeriodChangeOverride = value;
  }
  /** Retrieve filter for field: ProratePeriodChangeOverride (CUSTOMER_CONTRACT_VIEW.prorate_period_change_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProratePeriodChangeOverrideFilter () {
    return this.ProratePeriodChangeOverride;
  }

  /**
   * Retrieves the ProratePeriodChangeOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProratePeriodChangeOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProratePeriodChangeOverrideFilter field
   */
  public String[] getProratePeriodChangeOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProratePeriodChangeOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProratePeriodChangeOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProratePeriodChangeOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProratePeriodChangeOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProratePeriodChangeOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProratePeriodChangeOverrideFilter filter value from a formatted string
   *
   * @param _value the ProratePeriodChangeOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProratePeriodChangeOverrideFilter filter field
   */
  public void setProratePeriodChangeOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProratePeriodChangeOverrideFilterFromFormattedString");
    try {
      this.setProratePeriodChangeOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProratePeriodChangeOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProratePeriodChangeOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProratePeriodChangeOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateAccountStartOverrideFetch (boolean fetch) {
    this.ProrateAccountStartOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateAccountStartOverrideFetch () {
    return this.ProrateAccountStartOverrideFetch;
  }
  /** Set the SortOrder for field: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateAccountStartOverrideSortOrder (Integer value) {
    this.ProrateAccountStartOverrideSort = value;
  }
  /** Retrieve SortOrder for field: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateAccountStartOverrideSortOrder () {
    return this.ProrateAccountStartOverrideSort;
  }
  /** Set the sort direction for field: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateAccountStartOverrideSortDirection (boolean ascending) {
    this.ProrateAccountStartOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateAccountStartOverrideSortDirection () {
    return this.ProrateAccountStartOverrideSortAscending;
  }
  /** Set the field level filters for field: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateAccountStartOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.ProrateAccountStartOverride = value;
  }
  /** Retrieve filter for field: ProrateAccountStartOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_start_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProrateAccountStartOverrideFilter () {
    return this.ProrateAccountStartOverride;
  }

  /**
   * Retrieves the ProrateAccountStartOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateAccountStartOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateAccountStartOverrideFilter field
   */
  public String[] getProrateAccountStartOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountStartOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateAccountStartOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateAccountStartOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateAccountStartOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateAccountStartOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateAccountStartOverrideFilter filter value from a formatted string
   *
   * @param _value the ProrateAccountStartOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateAccountStartOverrideFilter filter field
   */
  public void setProrateAccountStartOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateAccountStartOverrideFilterFromFormattedString");
    try {
      this.setProrateAccountStartOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateAccountStartOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateAccountStartOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateAccountStartOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateAccountEndOverrideFetch (boolean fetch) {
    this.ProrateAccountEndOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateAccountEndOverrideFetch () {
    return this.ProrateAccountEndOverrideFetch;
  }
  /** Set the SortOrder for field: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateAccountEndOverrideSortOrder (Integer value) {
    this.ProrateAccountEndOverrideSort = value;
  }
  /** Retrieve SortOrder for field: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateAccountEndOverrideSortOrder () {
    return this.ProrateAccountEndOverrideSort;
  }
  /** Set the sort direction for field: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateAccountEndOverrideSortDirection (boolean ascending) {
    this.ProrateAccountEndOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateAccountEndOverrideSortDirection () {
    return this.ProrateAccountEndOverrideSortAscending;
  }
  /** Set the field level filters for field: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateAccountEndOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.ProrateAccountEndOverride = value;
  }
  /** Retrieve filter for field: ProrateAccountEndOverride (CUSTOMER_CONTRACT_VIEW.prorate_account_end_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProrateAccountEndOverrideFilter () {
    return this.ProrateAccountEndOverride;
  }

  /**
   * Retrieves the ProrateAccountEndOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateAccountEndOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateAccountEndOverrideFilter field
   */
  public String[] getProrateAccountEndOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateAccountEndOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateAccountEndOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateAccountEndOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateAccountEndOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateAccountEndOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateAccountEndOverrideFilter filter value from a formatted string
   *
   * @param _value the ProrateAccountEndOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateAccountEndOverrideFilter filter field
   */
  public void setProrateAccountEndOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateAccountEndOverrideFilterFromFormattedString");
    try {
      this.setProrateAccountEndOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateAccountEndOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateAccountEndOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateAccountEndOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateTgtThresholdOverrideFetch (boolean fetch) {
    this.ProrateTgtThresholdOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateTgtThresholdOverrideFetch () {
    return this.ProrateTgtThresholdOverrideFetch;
  }
  /** Set the SortOrder for field: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateTgtThresholdOverrideSortOrder (Integer value) {
    this.ProrateTgtThresholdOverrideSort = value;
  }
  /** Retrieve SortOrder for field: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateTgtThresholdOverrideSortOrder () {
    return this.ProrateTgtThresholdOverrideSort;
  }
  /** Set the sort direction for field: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateTgtThresholdOverrideSortDirection (boolean ascending) {
    this.ProrateTgtThresholdOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateTgtThresholdOverrideSortDirection () {
    return this.ProrateTgtThresholdOverrideSortAscending;
  }
  /** Set the field level filters for field: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateTgtThresholdOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.ProrateTgtThresholdOverride = value;
  }
  /** Retrieve filter for field: ProrateTgtThresholdOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_threshold_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProrateTgtThresholdOverrideFilter () {
    return this.ProrateTgtThresholdOverride;
  }

  /**
   * Retrieves the ProrateTgtThresholdOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateTgtThresholdOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateTgtThresholdOverrideFilter field
   */
  public String[] getProrateTgtThresholdOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTgtThresholdOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateTgtThresholdOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateTgtThresholdOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateTgtThresholdOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateTgtThresholdOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateTgtThresholdOverrideFilter filter value from a formatted string
   *
   * @param _value the ProrateTgtThresholdOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateTgtThresholdOverrideFilter filter field
   */
  public void setProrateTgtThresholdOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateTgtThresholdOverrideFilterFromFormattedString");
    try {
      this.setProrateTgtThresholdOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateTgtThresholdOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateTgtThresholdOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateTgtThresholdOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * @param fetch whether to fetch this field or not
   */
  public void setProrateTgtRebatesOverrideFetch (boolean fetch) {
    this.ProrateTgtRebatesOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getProrateTgtRebatesOverrideFetch () {
    return this.ProrateTgtRebatesOverrideFetch;
  }
  /** Set the SortOrder for field: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProrateTgtRebatesOverrideSortOrder (Integer value) {
    this.ProrateTgtRebatesOverrideSort = value;
  }
  /** Retrieve SortOrder for field: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProrateTgtRebatesOverrideSortOrder () {
    return this.ProrateTgtRebatesOverrideSort;
  }
  /** Set the sort direction for field: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProrateTgtRebatesOverrideSortDirection (boolean ascending) {
    this.ProrateTgtRebatesOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProrateTgtRebatesOverrideSortDirection () {
    return this.ProrateTgtRebatesOverrideSortAscending;
  }
  /** Set the field level filters for field: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProrateTgtRebatesOverrideFilter (IntegerFilter[] value) throws ServiceException {
    this.ProrateTgtRebatesOverride = value;
  }
  /** Retrieve filter for field: ProrateTgtRebatesOverride (CUSTOMER_CONTRACT_VIEW.prorate_tgt_rebates_override)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getProrateTgtRebatesOverrideFilter () {
    return this.ProrateTgtRebatesOverride;
  }

  /**
   * Retrieves the ProrateTgtRebatesOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProrateTgtRebatesOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProrateTgtRebatesOverrideFilter field
   */
  public String[] getProrateTgtRebatesOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProrateTgtRebatesOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProrateTgtRebatesOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProrateTgtRebatesOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateTgtRebatesOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProrateTgtRebatesOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProrateTgtRebatesOverrideFilter filter value from a formatted string
   *
   * @param _value the ProrateTgtRebatesOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProrateTgtRebatesOverrideFilter filter field
   */
  public void setProrateTgtRebatesOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProrateTgtRebatesOverrideFilterFromFormattedString");
    try {
      this.setProrateTgtRebatesOverrideFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProrateTgtRebatesOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProrateTgtRebatesOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProrateTgtRebatesOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setStartByDtFetch (boolean fetch) {
    this.StartByDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getStartByDtFetch () {
    return this.StartByDtFetch;
  }
  /** Set the SortOrder for field: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setStartByDtSortOrder (Integer value) {
    this.StartByDtSort = value;
  }
  /** Retrieve SortOrder for field: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getStartByDtSortOrder () {
    return this.StartByDtSort;
  }
  /** Set the sort direction for field: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setStartByDtSortDirection (boolean ascending) {
    this.StartByDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getStartByDtSortDirection () {
    return this.StartByDtSortAscending;
  }
  /** Set the field level filters for field: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setStartByDtFilter (DateFilter[] value) throws ServiceException {
    this.StartByDt = value;
  }
  /** Retrieve filter for field: StartByDt (CUSTOMER_CONTRACT_VIEW.start_by_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getStartByDtFilter () {
    return this.StartByDt;
  }

  /**
   * Retrieves the StartByDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartByDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartByDtFilter field
   */
  public String[] getStartByDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartByDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartByDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartByDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the StartByDtFilter filter value from a formatted string
   *
   * @param _value the StartByDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartByDtFilter filter field
   */
  public void setStartByDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartByDtFilterFromFormattedString");
    try {
      this.setStartByDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartByDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartByDtFilterFromFormattedString");
  }

  /**
   * Retrieves the StartByDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StartByDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StartByDtFilter field
   */
  public String[] getStartByDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStartByDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getStartByDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStartByDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStartByDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StartByDtFilter filter value from a formatted string
   *
   * @param _value the StartByDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the StartByDtFilter filter field
   */
  public void setStartByDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStartByDtFilterFromFormattedDateTimeString");
    try {
      this.setStartByDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StartByDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStartByDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStartByDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * @param fetch whether to fetch this field or not
   */
  public void setNoticeEndDtFetch (boolean fetch) {
    this.NoticeEndDtFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoticeEndDtFetch () {
    return this.NoticeEndDtFetch;
  }
  /** Set the SortOrder for field: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoticeEndDtSortOrder (Integer value) {
    this.NoticeEndDtSort = value;
  }
  /** Retrieve SortOrder for field: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoticeEndDtSortOrder () {
    return this.NoticeEndDtSort;
  }
  /** Set the sort direction for field: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoticeEndDtSortDirection (boolean ascending) {
    this.NoticeEndDtSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoticeEndDtSortDirection () {
    return this.NoticeEndDtSortAscending;
  }
  /** Set the field level filters for field: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoticeEndDtFilter (DateFilter[] value) throws ServiceException {
    this.NoticeEndDt = value;
  }
  /** Retrieve filter for field: NoticeEndDt (CUSTOMER_CONTRACT_VIEW.notice_end_dt)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getNoticeEndDtFilter () {
    return this.NoticeEndDt;
  }

  /**
   * Retrieves the NoticeEndDtFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoticeEndDtFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoticeEndDtFilter field
   */
  public String[] getNoticeEndDtFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoticeEndDtFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoticeEndDtFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoticeEndDtFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoticeEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoticeEndDtFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoticeEndDtFilter filter value from a formatted string
   *
   * @param _value the NoticeEndDtFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoticeEndDtFilter filter field
   */
  public void setNoticeEndDtFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoticeEndDtFilterFromFormattedString");
    try {
      this.setNoticeEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoticeEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoticeEndDtFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoticeEndDtFilterFromFormattedString");
  }

  /**
   * Retrieves the NoticeEndDtFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoticeEndDtFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoticeEndDtFilter field
   */
  public String[] getNoticeEndDtFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoticeEndDtFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoticeEndDtFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoticeEndDtFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoticeEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoticeEndDtFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the NoticeEndDtFilter filter value from a formatted string
   *
   * @param _value the NoticeEndDtFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoticeEndDtFilter filter field
   */
  public void setNoticeEndDtFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoticeEndDtFilterFromFormattedDateTimeString");
    try {
      this.setNoticeEndDtFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoticeEndDtFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoticeEndDtFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoticeEndDtFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * @param fetch whether to fetch this field or not
   */
  public void setDurationOverrideFetch (boolean fetch) {
    this.DurationOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getDurationOverrideFetch () {
    return this.DurationOverrideFetch;
  }
  /** Set the SortOrder for field: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setDurationOverrideSortOrder (Integer value) {
    this.DurationOverrideSort = value;
  }
  /** Retrieve SortOrder for field: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getDurationOverrideSortOrder () {
    return this.DurationOverrideSort;
  }
  /** Set the sort direction for field: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setDurationOverrideSortDirection (boolean ascending) {
    this.DurationOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getDurationOverrideSortDirection () {
    return this.DurationOverrideSortAscending;
  }
  /** Set the field level filters for field: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setDurationOverrideFilter (BooleanFilter[] value) throws ServiceException {
    this.DurationOverride = value;
  }
  /** Retrieve filter for field: DurationOverride (CUSTOMER_CONTRACT_VIEW.duration_override)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getDurationOverrideFilter () {
    return this.DurationOverride;
  }

  /**
   * Retrieves the DurationOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The DurationOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DurationOverrideFilter field
   */
  public String[] getDurationOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDurationOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getDurationOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDurationOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DurationOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getDurationOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the DurationOverrideFilter filter value from a formatted string
   *
   * @param _value the DurationOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the DurationOverrideFilter filter field
   */
  public void setDurationOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setDurationOverrideFilterFromFormattedString");
    try {
      this.setDurationOverrideFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("DurationOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setDurationOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDurationOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * @param fetch whether to fetch this field or not
   */
  public void setNoticeOverrideFetch (boolean fetch) {
    this.NoticeOverrideFetch = fetch;
  }
  /** Retrieve Fetch value for field: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * @return boolean the Fetch value for this field
   */
  public boolean getNoticeOverrideFetch () {
    return this.NoticeOverrideFetch;
  }
  /** Set the SortOrder for field: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setNoticeOverrideSortOrder (Integer value) {
    this.NoticeOverrideSort = value;
  }
  /** Retrieve SortOrder for field: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getNoticeOverrideSortOrder () {
    return this.NoticeOverrideSort;
  }
  /** Set the sort direction for field: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setNoticeOverrideSortDirection (boolean ascending) {
    this.NoticeOverrideSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getNoticeOverrideSortDirection () {
    return this.NoticeOverrideSortAscending;
  }
  /** Set the field level filters for field: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setNoticeOverrideFilter (BooleanFilter[] value) throws ServiceException {
    this.NoticeOverride = value;
  }
  /** Retrieve filter for field: NoticeOverride (CUSTOMER_CONTRACT_VIEW.notice_override)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getNoticeOverrideFilter () {
    return this.NoticeOverride;
  }

  /**
   * Retrieves the NoticeOverrideFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The NoticeOverrideFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoticeOverrideFilter field
   */
  public String[] getNoticeOverrideFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoticeOverrideFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getNoticeOverrideFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoticeOverrideFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoticeOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoticeOverrideFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the NoticeOverrideFilter filter value from a formatted string
   *
   * @param _value the NoticeOverrideFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the NoticeOverrideFilter filter field
   */
  public void setNoticeOverrideFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setNoticeOverrideFilterFromFormattedString");
    try {
      this.setNoticeOverrideFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("NoticeOverrideFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoticeOverrideFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoticeOverrideFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * @param fetch whether to fetch this field or not
   */
  public void setIsPartOfComponentFetch (boolean fetch) {
    this.IsPartOfComponentFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsPartOfComponentFetch () {
    return this.IsPartOfComponentFetch;
  }
  /** Set the SortOrder for field: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsPartOfComponentSortOrder (Integer value) {
    this.IsPartOfComponentSort = value;
  }
  /** Retrieve SortOrder for field: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsPartOfComponentSortOrder () {
    return this.IsPartOfComponentSort;
  }
  /** Set the sort direction for field: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsPartOfComponentSortDirection (boolean ascending) {
    this.IsPartOfComponentSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsPartOfComponentSortDirection () {
    return this.IsPartOfComponentSortAscending;
  }
  /** Set the field level filters for field: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsPartOfComponentFilter (BooleanFilter[] value) throws ServiceException {
    this.IsPartOfComponent = value;
  }
  /** Retrieve filter for field: IsPartOfComponent (CUSTOMER_CONTRACT_VIEW.is_part_of_component)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getIsPartOfComponentFilter () {
    return this.IsPartOfComponent;
  }

  /**
   * Retrieves the IsPartOfComponentFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The IsPartOfComponentFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsPartOfComponentFilter field
   */
  public String[] getIsPartOfComponentFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsPartOfComponentFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getIsPartOfComponentFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsPartOfComponentFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPartOfComponentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsPartOfComponentFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the IsPartOfComponentFilter filter value from a formatted string
   *
   * @param _value the IsPartOfComponentFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the IsPartOfComponentFilter filter field
   */
  public void setIsPartOfComponentFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setIsPartOfComponentFilterFromFormattedString");
    try {
      this.setIsPartOfComponentFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("IsPartOfComponentFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsPartOfComponentFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsPartOfComponentFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * @param fetch whether to fetch this field or not
   */
  public void setElementIdFetch (boolean fetch) {
    this.ElementIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getElementIdFetch () {
    return this.ElementIdFetch;
  }
  /** Set the SortOrder for field: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setElementIdSortOrder (Integer value) {
    this.ElementIdSort = value;
  }
  /** Retrieve SortOrder for field: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getElementIdSortOrder () {
    return this.ElementIdSort;
  }
  /** Set the sort direction for field: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setElementIdSortDirection (boolean ascending) {
    this.ElementIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getElementIdSortDirection () {
    return this.ElementIdSortAscending;
  }
  /** Set the field level filters for field: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setElementIdFilter (IntegerFilter[] value) throws ServiceException {
    this.ElementId = value;
  }
  /** Retrieve filter for field: ElementId (CUSTOMER_CONTRACT_VIEW.element_id)
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


  /** Set the field level Fetch value for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @param fetch whether to fetch this field or not
   */
  public void setCommitmentReferenceFetch (boolean fetch) {
    this.CommitmentReferenceFetch = fetch;
  }
  /** Retrieve Fetch value for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return boolean the Fetch value for this field
   */
  public boolean getCommitmentReferenceFetch () {
    return this.CommitmentReferenceFetch;
  }
  /** Set the SortOrder for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCommitmentReferenceSortOrder (Integer value) {
    this.CommitmentReferenceSort = value;
  }
  /** Retrieve SortOrder for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCommitmentReferenceSortOrder () {
    return this.CommitmentReferenceSort;
  }
  /** Set the sort direction for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCommitmentReferenceSortDirection (boolean ascending) {
    this.CommitmentReferenceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCommitmentReferenceSortDirection () {
    return this.CommitmentReferenceSortAscending;
  }
  /** Set the field level filters for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCommitmentReferenceFilter (IntegerFilter[] value) throws ServiceException {
    this.CommitmentReference = value;
  }
  /** Retrieve filter for field: CommitmentReference (CUSTOMER_CONTRACT_VIEW.commitment_reference)
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

  /**
   * Retrieves the display value for the enumerated CommitmentReferenceFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CommitmentReferenceFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CommitmentReferenceFilter filter field
   */
  public String[] getCommitmentReferenceFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCommitmentReferenceFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getCommitmentReferenceFilter(), "ProductType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCommitmentReferenceFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReferenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCommitmentReferenceFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated CommitmentReferenceFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the CommitmentReferenceFilter filter field
   */
  public void setCommitmentReferenceFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCommitmentReferenceFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setCommitmentReferenceFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "CommitmentReference", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CommitmentReferenceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCommitmentReferenceFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCommitmentReferenceFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * @param fetch whether to fetch this field or not
   */
  public void setMinDurationDateFetch (boolean fetch) {
    this.MinDurationDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinDurationDateFetch () {
    return this.MinDurationDateFetch;
  }
  /** Set the SortOrder for field: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinDurationDateSortOrder (Integer value) {
    this.MinDurationDateSort = value;
  }
  /** Retrieve SortOrder for field: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinDurationDateSortOrder () {
    return this.MinDurationDateSort;
  }
  /** Set the sort direction for field: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinDurationDateSortDirection (boolean ascending) {
    this.MinDurationDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinDurationDateSortDirection () {
    return this.MinDurationDateSortAscending;
  }
  /** Set the field level filters for field: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinDurationDateFilter (DateFilter[] value) throws ServiceException {
    this.MinDurationDate = value;
  }
  /** Retrieve filter for field: MinDurationDate (CUSTOMER_CONTRACT_VIEW.min_duration_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getMinDurationDateFilter () {
    return this.MinDurationDate;
  }

  /**
   * Retrieves the MinDurationDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinDurationDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinDurationDateFilter field
   */
  public String[] getMinDurationDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinDurationDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinDurationDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinDurationDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinDurationDateFilter filter value from a formatted string
   *
   * @param _value the MinDurationDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinDurationDateFilter filter field
   */
  public void setMinDurationDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinDurationDateFilterFromFormattedString");
    try {
      this.setMinDurationDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinDurationDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinDurationDateFilterFromFormattedString");
  }

  /**
   * Retrieves the MinDurationDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinDurationDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinDurationDateFilter field
   */
  public String[] getMinDurationDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinDurationDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinDurationDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinDurationDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinDurationDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the MinDurationDateFilter filter value from a formatted string
   *
   * @param _value the MinDurationDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinDurationDateFilter filter field
   */
  public void setMinDurationDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinDurationDateFilterFromFormattedDateTimeString");
    try {
      this.setMinDurationDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinDurationDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinDurationDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinDurationDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * @param fetch whether to fetch this field or not
   */
  public void setMinNoticeDateFetch (boolean fetch) {
    this.MinNoticeDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getMinNoticeDateFetch () {
    return this.MinNoticeDateFetch;
  }
  /** Set the SortOrder for field: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMinNoticeDateSortOrder (Integer value) {
    this.MinNoticeDateSort = value;
  }
  /** Retrieve SortOrder for field: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMinNoticeDateSortOrder () {
    return this.MinNoticeDateSort;
  }
  /** Set the sort direction for field: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMinNoticeDateSortDirection (boolean ascending) {
    this.MinNoticeDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMinNoticeDateSortDirection () {
    return this.MinNoticeDateSortAscending;
  }
  /** Set the field level filters for field: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMinNoticeDateFilter (DateFilter[] value) throws ServiceException {
    this.MinNoticeDate = value;
  }
  /** Retrieve filter for field: MinNoticeDate (CUSTOMER_CONTRACT_VIEW.min_notice_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getMinNoticeDateFilter () {
    return this.MinNoticeDate;
  }

  /**
   * Retrieves the MinNoticeDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinNoticeDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinNoticeDateFilter field
   */
  public String[] getMinNoticeDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinNoticeDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinNoticeDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinNoticeDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MinNoticeDateFilter filter value from a formatted string
   *
   * @param _value the MinNoticeDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinNoticeDateFilter filter field
   */
  public void setMinNoticeDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinNoticeDateFilterFromFormattedString");
    try {
      this.setMinNoticeDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinNoticeDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinNoticeDateFilterFromFormattedString");
  }

  /**
   * Retrieves the MinNoticeDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MinNoticeDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the MinNoticeDateFilter field
   */
  public String[] getMinNoticeDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMinNoticeDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMinNoticeDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMinNoticeDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMinNoticeDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the MinNoticeDateFilter filter value from a formatted string
   *
   * @param _value the MinNoticeDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MinNoticeDateFilter filter field
   */
  public void setMinNoticeDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMinNoticeDateFilterFromFormattedDateTimeString");
    try {
      this.setMinNoticeDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MinNoticeDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMinNoticeDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMinNoticeDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * @param fetch whether to fetch this field or not
   */
  public void setIsCustomFetch (boolean fetch) {
    this.IsCustomFetch = fetch;
  }
  /** Retrieve Fetch value for field: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * @return boolean the Fetch value for this field
   */
  public boolean getIsCustomFetch () {
    return this.IsCustomFetch;
  }
  /** Set the SortOrder for field: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setIsCustomSortOrder (Integer value) {
    this.IsCustomSort = value;
  }
  /** Retrieve SortOrder for field: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getIsCustomSortOrder () {
    return this.IsCustomSort;
  }
  /** Set the sort direction for field: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setIsCustomSortDirection (boolean ascending) {
    this.IsCustomSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getIsCustomSortDirection () {
    return this.IsCustomSortAscending;
  }
  /** Set the field level filters for field: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setIsCustomFilter (IntegerFilter[] value) throws ServiceException {
    this.IsCustom = value;
  }
  /** Retrieve filter for field: IsCustom (CUSTOMER_CONTRACT_VIEW.is_custom)
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

  public String toString() {
    return GlobalContractObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return GlobalContractObjectHelper.toMap(this, null);
  }
}
