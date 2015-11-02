/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContractDiscountObjectHelper.java
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

import java.math.BigInteger;
import java.util.*;
import com.csgsystems.api.bulk.*;


import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;



/** Helper class to convert ContractDiscountObject JavaBean objects to/from HashMaps.
 */
public class ContractDiscountObjectHelper implements ArubaObjectHelper
{
  /** convert ContractDiscountObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ContractDiscountObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContractDiscountObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContractDiscountObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContractDiscountObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContractDiscountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ContractDiscountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ContractDiscountObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContractDiscountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContractDiscountObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContractDiscountObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContractDiscountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ContractDiscountObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ContractDiscountObjectData the converted object
   */
  public static ContractDiscountObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ContractDiscountObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ContractDiscountObject")
   * @return ContractDiscountObjectData the converted object
   */
  public static ContractDiscountObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ContractDiscountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ContractDiscountObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ContractDiscountObjectFilter the converted object
   */
  public static ContractDiscountObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ContractDiscountObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ContractDiscountObject")
   * @return ContractDiscountObjectFilter the converted object
   */
  public static ContractDiscountObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ContractDiscountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ContractDiscountObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ContractDiscountObjectDataList the converted object
   */
  public static ContractDiscountObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ContractDiscountObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ContractDiscountObjectList")
   * @return ContractDiscountObjectDataList the converted object
   */
  public static ContractDiscountObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ContractDiscountObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ContractDiscountObjectData[] array = null;
    if (root != null)
    {
      array = new ContractDiscountObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ContractDiscountObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ContractDiscountObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ContractDiscountObjectDataList (array, index, total);
  }
  /** convert ContractDiscountObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ContractDiscountObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ContractDiscountObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ContractCategorySet) record.put ("ContractCategory", in.ContractCategory);
  
    if (in._ElementIdSet) record.put ("ElementId", in.ElementId);
  
    if (in._CommitmentReferenceSet) record.put ("CommitmentReference", in.CommitmentReference);
  
    if (in._DurationUnitsSet) record.put ("DurationUnits", in.DurationUnits);
  
    if (in._DurationSet) record.put ("Duration", in.Duration);
  
    if (in._PlanIdDiscountSet) record.put ("PlanIdDiscount", in.PlanIdDiscount);
  
    if (in._PlanIdCreditSet) record.put ("PlanIdCredit", in.PlanIdCredit);
  
    if (in._ActivationTypeIdNrcSet) record.put ("ActivationTypeIdNrc", in.ActivationTypeIdNrc);
  
    if (in._TerminationTypeIdNrcSet) record.put ("TerminationTypeIdNrc", in.TerminationTypeIdNrc);
  
    if (in._IsPromotionSet) record.put ("IsPromotion", in.IsPromotion);
  
    if (in._DescriptionCodeSet) record.put ("DescriptionCode", in.DescriptionCode);
  
    if (in._ForeignCodeSet) record.put ("ForeignCode", in.ForeignCode);
  
    if (in._StartByUnitsSet) record.put ("StartByUnits", in.StartByUnits);
  
    if (in._StartBySet) record.put ("StartBy", in.StartBy);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._FixedStartDateSet) record.put ("FixedStartDate", in.FixedStartDate);
  
    if (in._FixedEndDateSet) record.put ("FixedEndDate", in.FixedEndDate);
  
    if (in._PartialPeriodSet) record.put ("PartialPeriod", in.PartialPeriod);
  
    if (in._CommitmentTypeIdNrcSet) record.put ("CommitmentTypeIdNrc", in.CommitmentTypeIdNrc);
  
    if (in._DiscountBasePeriodSet) record.put ("DiscountBasePeriod", in.DiscountBasePeriod);
  
    if (in._RolloverOrderSet) record.put ("RolloverOrder", in.RolloverOrder);
  
    if (in._RolloverGroupingSet) record.put ("RolloverGrouping", in.RolloverGrouping);
  
    if (in._BonusPointIdSet) record.put ("BonusPointId", in.BonusPointId);
  
    if (in._ProrateContractStartSet) record.put ("ProrateContractStart", in.ProrateContractStart);
  
    if (in._ProrateContractEndSet) record.put ("ProrateContractEnd", in.ProrateContractEnd);
  
    if (in._ProrateInterimBillSet) record.put ("ProrateInterimBill", in.ProrateInterimBill);
  
    if (in._ProratePeriodChangeSet) record.put ("ProratePeriodChange", in.ProratePeriodChange);
  
    if (in._ProrateAccountStartSet) record.put ("ProrateAccountStart", in.ProrateAccountStart);
  
    if (in._ProrateAccountEndSet) record.put ("ProrateAccountEnd", in.ProrateAccountEnd);
  
    if (in._ProrateTargetThresholdSet) record.put ("ProrateTargetThreshold", in.ProrateTargetThreshold);
  
    if (in._ProrateTargetRebatesSet) record.put ("ProrateTargetRebates", in.ProrateTargetRebates);
  
    if (in._AllowAccountSet) record.put ("AllowAccount", in.AllowAccount);
  
    if (in._AllowServiceSet) record.put ("AllowService", in.AllowService);
  
    if (in._AllowAccountGroupSet) record.put ("AllowAccountGroup", in.AllowAccountGroup);
  
    if (in._AllowServiceGroupSet) record.put ("AllowServiceGroup", in.AllowServiceGroup);
  
    if (in._BillPeriodSet) record.put ("BillPeriod", in.BillPeriod);
  
    if (in._MinDurationUnitsSet) record.put ("MinDurationUnits", in.MinDurationUnits);
  
    if (in._MinDurationSet) record.put ("MinDuration", in.MinDuration);
  
    if (in._MinNoticeUnitsSet) record.put ("MinNoticeUnits", in.MinNoticeUnits);
  
    if (in._MinNoticeDelaySet) record.put ("MinNoticeDelay", in.MinNoticeDelay);
  
    if (in._IsCustomSet) record.put ("IsCustom", in.IsCustom);
  
    if (in._WhenAppliedSet) record.put ("WhenApplied", in.WhenApplied);
  
    if (in._ApplyDuringSuspendSet) record.put ("ApplyDuringSuspend", in.ApplyDuringSuspend);
  
    if (in._PlanOrderSet) record.put ("PlanOrder", in.PlanOrder);
  
    if (in._DefOrderSet) record.put ("DefOrder", in.DefOrder);
      return record;
  }
  /** convert ContractDiscountObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ContractDiscountObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ContractDiscountObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ContractCategory, in.ContractCategorySort, in.ContractCategorySortAscending, in.ContractCategoryFetch);
      if (map != null) record.put ("ContractCategory", map);
      map = DataHelper.filterToMap (in.ElementId, in.ElementIdSort, in.ElementIdSortAscending, in.ElementIdFetch);
      if (map != null) record.put ("ElementId", map);
      map = DataHelper.filterToMap (in.CommitmentReference, in.CommitmentReferenceSort, in.CommitmentReferenceSortAscending, in.CommitmentReferenceFetch);
      if (map != null) record.put ("CommitmentReference", map);
      map = DataHelper.filterToMap (in.DurationUnits, in.DurationUnitsSort, in.DurationUnitsSortAscending, in.DurationUnitsFetch);
      if (map != null) record.put ("DurationUnits", map);
      map = DataHelper.filterToMap (in.Duration, in.DurationSort, in.DurationSortAscending, in.DurationFetch);
      if (map != null) record.put ("Duration", map);
      map = DataHelper.filterToMap (in.PlanIdDiscount, in.PlanIdDiscountSort, in.PlanIdDiscountSortAscending, in.PlanIdDiscountFetch);
      if (map != null) record.put ("PlanIdDiscount", map);
      map = DataHelper.filterToMap (in.PlanIdCredit, in.PlanIdCreditSort, in.PlanIdCreditSortAscending, in.PlanIdCreditFetch);
      if (map != null) record.put ("PlanIdCredit", map);
      map = DataHelper.filterToMap (in.ActivationTypeIdNrc, in.ActivationTypeIdNrcSort, in.ActivationTypeIdNrcSortAscending, in.ActivationTypeIdNrcFetch);
      if (map != null) record.put ("ActivationTypeIdNrc", map);
      map = DataHelper.filterToMap (in.TerminationTypeIdNrc, in.TerminationTypeIdNrcSort, in.TerminationTypeIdNrcSortAscending, in.TerminationTypeIdNrcFetch);
      if (map != null) record.put ("TerminationTypeIdNrc", map);
      map = DataHelper.filterToMap (in.IsPromotion, in.IsPromotionSort, in.IsPromotionSortAscending, in.IsPromotionFetch);
      if (map != null) record.put ("IsPromotion", map);
      map = DataHelper.filterToMap (in.DescriptionCode, in.DescriptionCodeSort, in.DescriptionCodeSortAscending, in.DescriptionCodeFetch);
      if (map != null) record.put ("DescriptionCode", map);
      map = DataHelper.filterToMap (in.ForeignCode, in.ForeignCodeSort, in.ForeignCodeSortAscending, in.ForeignCodeFetch, in.ForeignCodeCaseInsensitive);
      if (map != null) record.put ("ForeignCode", map);
      map = DataHelper.filterToMap (in.StartByUnits, in.StartByUnitsSort, in.StartByUnitsSortAscending, in.StartByUnitsFetch);
      if (map != null) record.put ("StartByUnits", map);
      map = DataHelper.filterToMap (in.StartBy, in.StartBySort, in.StartBySortAscending, in.StartByFetch);
      if (map != null) record.put ("StartBy", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
      map = DataHelper.filterToMap (in.FixedStartDate, in.FixedStartDateSort, in.FixedStartDateSortAscending, in.FixedStartDateFetch);
      if (map != null) record.put ("FixedStartDate", map);
      map = DataHelper.filterToMap (in.FixedEndDate, in.FixedEndDateSort, in.FixedEndDateSortAscending, in.FixedEndDateFetch);
      if (map != null) record.put ("FixedEndDate", map);
      map = DataHelper.filterToMap (in.PartialPeriod, in.PartialPeriodSort, in.PartialPeriodSortAscending, in.PartialPeriodFetch);
      if (map != null) record.put ("PartialPeriod", map);
      map = DataHelper.filterToMap (in.CommitmentTypeIdNrc, in.CommitmentTypeIdNrcSort, in.CommitmentTypeIdNrcSortAscending, in.CommitmentTypeIdNrcFetch);
      if (map != null) record.put ("CommitmentTypeIdNrc", map);
      map = DataHelper.filterToMap (in.DiscountBasePeriod, in.DiscountBasePeriodSort, in.DiscountBasePeriodSortAscending, in.DiscountBasePeriodFetch);
      if (map != null) record.put ("DiscountBasePeriod", map);
      map = DataHelper.filterToMap (in.RolloverOrder, in.RolloverOrderSort, in.RolloverOrderSortAscending, in.RolloverOrderFetch);
      if (map != null) record.put ("RolloverOrder", map);
      map = DataHelper.filterToMap (in.RolloverGrouping, in.RolloverGroupingSort, in.RolloverGroupingSortAscending, in.RolloverGroupingFetch);
      if (map != null) record.put ("RolloverGrouping", map);
      map = DataHelper.filterToMap (in.BonusPointId, in.BonusPointIdSort, in.BonusPointIdSortAscending, in.BonusPointIdFetch);
      if (map != null) record.put ("BonusPointId", map);
      map = DataHelper.filterToMap (in.ProrateContractStart, in.ProrateContractStartSort, in.ProrateContractStartSortAscending, in.ProrateContractStartFetch);
      if (map != null) record.put ("ProrateContractStart", map);
      map = DataHelper.filterToMap (in.ProrateContractEnd, in.ProrateContractEndSort, in.ProrateContractEndSortAscending, in.ProrateContractEndFetch);
      if (map != null) record.put ("ProrateContractEnd", map);
      map = DataHelper.filterToMap (in.ProrateInterimBill, in.ProrateInterimBillSort, in.ProrateInterimBillSortAscending, in.ProrateInterimBillFetch);
      if (map != null) record.put ("ProrateInterimBill", map);
      map = DataHelper.filterToMap (in.ProratePeriodChange, in.ProratePeriodChangeSort, in.ProratePeriodChangeSortAscending, in.ProratePeriodChangeFetch);
      if (map != null) record.put ("ProratePeriodChange", map);
      map = DataHelper.filterToMap (in.ProrateAccountStart, in.ProrateAccountStartSort, in.ProrateAccountStartSortAscending, in.ProrateAccountStartFetch);
      if (map != null) record.put ("ProrateAccountStart", map);
      map = DataHelper.filterToMap (in.ProrateAccountEnd, in.ProrateAccountEndSort, in.ProrateAccountEndSortAscending, in.ProrateAccountEndFetch);
      if (map != null) record.put ("ProrateAccountEnd", map);
      map = DataHelper.filterToMap (in.ProrateTargetThreshold, in.ProrateTargetThresholdSort, in.ProrateTargetThresholdSortAscending, in.ProrateTargetThresholdFetch);
      if (map != null) record.put ("ProrateTargetThreshold", map);
      map = DataHelper.filterToMap (in.ProrateTargetRebates, in.ProrateTargetRebatesSort, in.ProrateTargetRebatesSortAscending, in.ProrateTargetRebatesFetch);
      if (map != null) record.put ("ProrateTargetRebates", map);
      map = DataHelper.filterToMap (in.AllowAccount, in.AllowAccountSort, in.AllowAccountSortAscending, in.AllowAccountFetch);
      if (map != null) record.put ("AllowAccount", map);
      map = DataHelper.filterToMap (in.AllowService, in.AllowServiceSort, in.AllowServiceSortAscending, in.AllowServiceFetch);
      if (map != null) record.put ("AllowService", map);
      map = DataHelper.filterToMap (in.AllowAccountGroup, in.AllowAccountGroupSort, in.AllowAccountGroupSortAscending, in.AllowAccountGroupFetch);
      if (map != null) record.put ("AllowAccountGroup", map);
      map = DataHelper.filterToMap (in.AllowServiceGroup, in.AllowServiceGroupSort, in.AllowServiceGroupSortAscending, in.AllowServiceGroupFetch);
      if (map != null) record.put ("AllowServiceGroup", map);
      map = DataHelper.filterToMap (in.BillPeriod, in.BillPeriodSort, in.BillPeriodSortAscending, in.BillPeriodFetch, in.BillPeriodCaseInsensitive);
      if (map != null) record.put ("BillPeriod", map);
      map = DataHelper.filterToMap (in.MinDurationUnits, in.MinDurationUnitsSort, in.MinDurationUnitsSortAscending, in.MinDurationUnitsFetch);
      if (map != null) record.put ("MinDurationUnits", map);
      map = DataHelper.filterToMap (in.MinDuration, in.MinDurationSort, in.MinDurationSortAscending, in.MinDurationFetch);
      if (map != null) record.put ("MinDuration", map);
      map = DataHelper.filterToMap (in.MinNoticeUnits, in.MinNoticeUnitsSort, in.MinNoticeUnitsSortAscending, in.MinNoticeUnitsFetch);
      if (map != null) record.put ("MinNoticeUnits", map);
      map = DataHelper.filterToMap (in.MinNoticeDelay, in.MinNoticeDelaySort, in.MinNoticeDelaySortAscending, in.MinNoticeDelayFetch);
      if (map != null) record.put ("MinNoticeDelay", map);
      map = DataHelper.filterToMap (in.IsCustom, in.IsCustomSort, in.IsCustomSortAscending, in.IsCustomFetch);
      if (map != null) record.put ("IsCustom", map);
      map = DataHelper.filterToMap (in.WhenApplied, in.WhenAppliedSort, in.WhenAppliedSortAscending, in.WhenAppliedFetch);
      if (map != null) record.put ("WhenApplied", map);
      map = DataHelper.filterToMap (in.ApplyDuringSuspend, in.ApplyDuringSuspendSort, in.ApplyDuringSuspendSortAscending, in.ApplyDuringSuspendFetch);
      if (map != null) record.put ("ApplyDuringSuspend", map);
      map = DataHelper.filterToMap (in.PlanOrder, in.PlanOrderSort, in.PlanOrderSortAscending, in.PlanOrderFetch);
      if (map != null) record.put ("PlanOrder", map);
      map = DataHelper.filterToMap (in.DefOrder, in.DefOrderSort, in.DefOrderSortAscending, in.DefOrderFetch);
      if (map != null) record.put ("DefOrder", map);
    return record;
  }
  /** convert Map to ContractDiscountObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContractDiscountObjectData the converted object
   */
  public static ContractDiscountObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContractDiscountObjectData out = new ContractDiscountObjectData ();

    out.Key = ContractDiscountObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ContractCategory")) != null)
    {
      out.ContractCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("ElementId")) != null)
    {
      out.ElementId = (Integer) obj;
    }
  
    if ((obj = record.get ("CommitmentReference")) != null)
    {
      out.CommitmentReference = (Integer) obj;
    }
  
    if ((obj = record.get ("DurationUnits")) != null)
    {
      out.DurationUnits = (Integer) obj;
    }
  
    if ((obj = record.get ("Duration")) != null)
    {
      out.Duration = (Integer) obj;
    }
  
    if ((obj = record.get ("PlanIdDiscount")) != null)
    {
      out.PlanIdDiscount = (Integer) obj;
    }
  
    if ((obj = record.get ("PlanIdCredit")) != null)
    {
      out.PlanIdCredit = (Integer) obj;
    }
  
    if ((obj = record.get ("ActivationTypeIdNrc")) != null)
    {
      out.ActivationTypeIdNrc = (Integer) obj;
    }
  
    if ((obj = record.get ("TerminationTypeIdNrc")) != null)
    {
      out.TerminationTypeIdNrc = (Integer) obj;
    }
  
    if ((obj = record.get ("IsPromotion")) != null)
    {
      out.IsPromotion = (Boolean) obj;
    }
  
    if ((obj = record.get ("DescriptionCode")) != null)
    {
      out.DescriptionCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ForeignCode")) != null)
    {
      out.ForeignCode = (String) obj;
    }
  
    if ((obj = record.get ("StartByUnits")) != null)
    {
      out.StartByUnits = (Integer) obj;
    }
  
    if ((obj = record.get ("StartBy")) != null)
    {
      out.StartBy = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("FixedStartDate")) != null)
    {
      out.FixedStartDate = (Date) obj;
    }
  
    if ((obj = record.get ("FixedEndDate")) != null)
    {
      out.FixedEndDate = (Date) obj;
    }
  
    if ((obj = record.get ("PartialPeriod")) != null)
    {
      out.PartialPeriod = (Boolean) obj;
    }
  
    if ((obj = record.get ("CommitmentTypeIdNrc")) != null)
    {
      out.CommitmentTypeIdNrc = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountBasePeriod")) != null)
    {
      out.DiscountBasePeriod = (Integer) obj;
    }
  
    if ((obj = record.get ("RolloverOrder")) != null)
    {
      out.RolloverOrder = (Integer) obj;
    }
  
    if ((obj = record.get ("RolloverGrouping")) != null)
    {
      out.RolloverGrouping = (Integer) obj;
    }
  
    if ((obj = record.get ("BonusPointId")) != null)
    {
      out.BonusPointId = (Integer) obj;
    }
  
    if ((obj = record.get ("ProrateContractStart")) != null)
    {
      out.ProrateContractStart = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProrateContractEnd")) != null)
    {
      out.ProrateContractEnd = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProrateInterimBill")) != null)
    {
      out.ProrateInterimBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProratePeriodChange")) != null)
    {
      out.ProratePeriodChange = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProrateAccountStart")) != null)
    {
      out.ProrateAccountStart = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProrateAccountEnd")) != null)
    {
      out.ProrateAccountEnd = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProrateTargetThreshold")) != null)
    {
      out.ProrateTargetThreshold = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProrateTargetRebates")) != null)
    {
      out.ProrateTargetRebates = (Boolean) obj;
    }
  
    if ((obj = record.get ("AllowAccount")) != null)
    {
      out.AllowAccount = (Integer) obj;
    }
  
    if ((obj = record.get ("AllowService")) != null)
    {
      out.AllowService = (Integer) obj;
    }
  
    if ((obj = record.get ("AllowAccountGroup")) != null)
    {
      out.AllowAccountGroup = (Integer) obj;
    }
  
    if ((obj = record.get ("AllowServiceGroup")) != null)
    {
      out.AllowServiceGroup = (Integer) obj;
    }
  
    if ((obj = record.get ("BillPeriod")) != null)
    {
      out.BillPeriod = (String) obj;
    }
  
    if ((obj = record.get ("MinDurationUnits")) != null)
    {
      out.MinDurationUnits = (Integer) obj;
    }
  
    if ((obj = record.get ("MinDuration")) != null)
    {
      out.MinDuration = (Integer) obj;
    }
  
    if ((obj = record.get ("MinNoticeUnits")) != null)
    {
      out.MinNoticeUnits = (Integer) obj;
    }
  
    if ((obj = record.get ("MinNoticeDelay")) != null)
    {
      out.MinNoticeDelay = (Integer) obj;
    }
  
    if ((obj = record.get ("IsCustom")) != null)
    {
      out.IsCustom = (Integer) obj;
    }
  
    if ((obj = record.get ("WhenApplied")) != null)
    {
      out.WhenApplied = (Integer) obj;
    }
  
    if ((obj = record.get ("ApplyDuringSuspend")) != null)
    {
      out.ApplyDuringSuspend = (Integer) obj;
    }
  
    if ((obj = record.get ("PlanOrder")) != null)
    {
      out.PlanOrder = (Integer) obj;
    }
  
    if ((obj = record.get ("DefOrder")) != null)
    {
      out.DefOrder = (Integer) obj;
    }
      return out;
  }
  /** convert Map to ContractDiscountObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContractDiscountObjectFilter the converted object
   */
  public static ContractDiscountObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContractDiscountObjectFilter out = new ContractDiscountObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ContractDiscountObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ContractCategoryMap = (Map)record.get("ContractCategory");
    Boolean ContractCategoryFetch = DataHelper.getFetch(ContractCategoryMap);
    Boolean ContractCategorySortDir = DataHelper.getSortDirection(ContractCategoryMap);
    Integer ContractCategorySortOrder = DataHelper.getSortOrder(ContractCategoryMap);
    if (ContractCategoryFetch != null) out.setContractCategoryFetch(ContractCategoryFetch);
    if (ContractCategorySortDir != null) out.setContractCategorySortDirection(ContractCategorySortDir);
    if (ContractCategorySortOrder != null) out.setContractCategorySortOrder(ContractCategorySortOrder);

    Filter[] ContractCategoryFilter = DataHelper.mapToFilterArray(ContractCategoryMap, Integer.class);
    if (ContractCategoryFilter != null) {
      IntegerFilter[] ContractCategoryFilters = new IntegerFilter[ContractCategoryFilter.length];
      for (int i = 0; i < ContractCategoryFilters.length; i++) {
        ContractCategoryFilters[i] = (IntegerFilter)ContractCategoryFilter[i];
      }
      try {
        out.setContractCategoryFilter(ContractCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ElementIdMap = (Map)record.get("ElementId");
    Boolean ElementIdFetch = DataHelper.getFetch(ElementIdMap);
    Boolean ElementIdSortDir = DataHelper.getSortDirection(ElementIdMap);
    Integer ElementIdSortOrder = DataHelper.getSortOrder(ElementIdMap);
    if (ElementIdFetch != null) out.setElementIdFetch(ElementIdFetch);
    if (ElementIdSortDir != null) out.setElementIdSortDirection(ElementIdSortDir);
    if (ElementIdSortOrder != null) out.setElementIdSortOrder(ElementIdSortOrder);

    Filter[] ElementIdFilter = DataHelper.mapToFilterArray(ElementIdMap, Integer.class);
    if (ElementIdFilter != null) {
      IntegerFilter[] ElementIdFilters = new IntegerFilter[ElementIdFilter.length];
      for (int i = 0; i < ElementIdFilters.length; i++) {
        ElementIdFilters[i] = (IntegerFilter)ElementIdFilter[i];
      }
      try {
        out.setElementIdFilter(ElementIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CommitmentReferenceMap = (Map)record.get("CommitmentReference");
    Boolean CommitmentReferenceFetch = DataHelper.getFetch(CommitmentReferenceMap);
    Boolean CommitmentReferenceSortDir = DataHelper.getSortDirection(CommitmentReferenceMap);
    Integer CommitmentReferenceSortOrder = DataHelper.getSortOrder(CommitmentReferenceMap);
    if (CommitmentReferenceFetch != null) out.setCommitmentReferenceFetch(CommitmentReferenceFetch);
    if (CommitmentReferenceSortDir != null) out.setCommitmentReferenceSortDirection(CommitmentReferenceSortDir);
    if (CommitmentReferenceSortOrder != null) out.setCommitmentReferenceSortOrder(CommitmentReferenceSortOrder);

    Filter[] CommitmentReferenceFilter = DataHelper.mapToFilterArray(CommitmentReferenceMap, Integer.class);
    if (CommitmentReferenceFilter != null) {
      IntegerFilter[] CommitmentReferenceFilters = new IntegerFilter[CommitmentReferenceFilter.length];
      for (int i = 0; i < CommitmentReferenceFilters.length; i++) {
        CommitmentReferenceFilters[i] = (IntegerFilter)CommitmentReferenceFilter[i];
      }
      try {
        out.setCommitmentReferenceFilter(CommitmentReferenceFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DurationUnitsMap = (Map)record.get("DurationUnits");
    Boolean DurationUnitsFetch = DataHelper.getFetch(DurationUnitsMap);
    Boolean DurationUnitsSortDir = DataHelper.getSortDirection(DurationUnitsMap);
    Integer DurationUnitsSortOrder = DataHelper.getSortOrder(DurationUnitsMap);
    if (DurationUnitsFetch != null) out.setDurationUnitsFetch(DurationUnitsFetch);
    if (DurationUnitsSortDir != null) out.setDurationUnitsSortDirection(DurationUnitsSortDir);
    if (DurationUnitsSortOrder != null) out.setDurationUnitsSortOrder(DurationUnitsSortOrder);

    Filter[] DurationUnitsFilter = DataHelper.mapToFilterArray(DurationUnitsMap, Integer.class);
    if (DurationUnitsFilter != null) {
      IntegerFilter[] DurationUnitsFilters = new IntegerFilter[DurationUnitsFilter.length];
      for (int i = 0; i < DurationUnitsFilters.length; i++) {
        DurationUnitsFilters[i] = (IntegerFilter)DurationUnitsFilter[i];
      }
      try {
        out.setDurationUnitsFilter(DurationUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DurationMap = (Map)record.get("Duration");
    Boolean DurationFetch = DataHelper.getFetch(DurationMap);
    Boolean DurationSortDir = DataHelper.getSortDirection(DurationMap);
    Integer DurationSortOrder = DataHelper.getSortOrder(DurationMap);
    if (DurationFetch != null) out.setDurationFetch(DurationFetch);
    if (DurationSortDir != null) out.setDurationSortDirection(DurationSortDir);
    if (DurationSortOrder != null) out.setDurationSortOrder(DurationSortOrder);

    Filter[] DurationFilter = DataHelper.mapToFilterArray(DurationMap, Integer.class);
    if (DurationFilter != null) {
      IntegerFilter[] DurationFilters = new IntegerFilter[DurationFilter.length];
      for (int i = 0; i < DurationFilters.length; i++) {
        DurationFilters[i] = (IntegerFilter)DurationFilter[i];
      }
      try {
        out.setDurationFilter(DurationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PlanIdDiscountMap = (Map)record.get("PlanIdDiscount");
    Boolean PlanIdDiscountFetch = DataHelper.getFetch(PlanIdDiscountMap);
    Boolean PlanIdDiscountSortDir = DataHelper.getSortDirection(PlanIdDiscountMap);
    Integer PlanIdDiscountSortOrder = DataHelper.getSortOrder(PlanIdDiscountMap);
    if (PlanIdDiscountFetch != null) out.setPlanIdDiscountFetch(PlanIdDiscountFetch);
    if (PlanIdDiscountSortDir != null) out.setPlanIdDiscountSortDirection(PlanIdDiscountSortDir);
    if (PlanIdDiscountSortOrder != null) out.setPlanIdDiscountSortOrder(PlanIdDiscountSortOrder);

    Filter[] PlanIdDiscountFilter = DataHelper.mapToFilterArray(PlanIdDiscountMap, Integer.class);
    if (PlanIdDiscountFilter != null) {
      IntegerFilter[] PlanIdDiscountFilters = new IntegerFilter[PlanIdDiscountFilter.length];
      for (int i = 0; i < PlanIdDiscountFilters.length; i++) {
        PlanIdDiscountFilters[i] = (IntegerFilter)PlanIdDiscountFilter[i];
      }
      try {
        out.setPlanIdDiscountFilter(PlanIdDiscountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PlanIdCreditMap = (Map)record.get("PlanIdCredit");
    Boolean PlanIdCreditFetch = DataHelper.getFetch(PlanIdCreditMap);
    Boolean PlanIdCreditSortDir = DataHelper.getSortDirection(PlanIdCreditMap);
    Integer PlanIdCreditSortOrder = DataHelper.getSortOrder(PlanIdCreditMap);
    if (PlanIdCreditFetch != null) out.setPlanIdCreditFetch(PlanIdCreditFetch);
    if (PlanIdCreditSortDir != null) out.setPlanIdCreditSortDirection(PlanIdCreditSortDir);
    if (PlanIdCreditSortOrder != null) out.setPlanIdCreditSortOrder(PlanIdCreditSortOrder);

    Filter[] PlanIdCreditFilter = DataHelper.mapToFilterArray(PlanIdCreditMap, Integer.class);
    if (PlanIdCreditFilter != null) {
      IntegerFilter[] PlanIdCreditFilters = new IntegerFilter[PlanIdCreditFilter.length];
      for (int i = 0; i < PlanIdCreditFilters.length; i++) {
        PlanIdCreditFilters[i] = (IntegerFilter)PlanIdCreditFilter[i];
      }
      try {
        out.setPlanIdCreditFilter(PlanIdCreditFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActivationTypeIdNrcMap = (Map)record.get("ActivationTypeIdNrc");
    Boolean ActivationTypeIdNrcFetch = DataHelper.getFetch(ActivationTypeIdNrcMap);
    Boolean ActivationTypeIdNrcSortDir = DataHelper.getSortDirection(ActivationTypeIdNrcMap);
    Integer ActivationTypeIdNrcSortOrder = DataHelper.getSortOrder(ActivationTypeIdNrcMap);
    if (ActivationTypeIdNrcFetch != null) out.setActivationTypeIdNrcFetch(ActivationTypeIdNrcFetch);
    if (ActivationTypeIdNrcSortDir != null) out.setActivationTypeIdNrcSortDirection(ActivationTypeIdNrcSortDir);
    if (ActivationTypeIdNrcSortOrder != null) out.setActivationTypeIdNrcSortOrder(ActivationTypeIdNrcSortOrder);

    Filter[] ActivationTypeIdNrcFilter = DataHelper.mapToFilterArray(ActivationTypeIdNrcMap, Integer.class);
    if (ActivationTypeIdNrcFilter != null) {
      IntegerFilter[] ActivationTypeIdNrcFilters = new IntegerFilter[ActivationTypeIdNrcFilter.length];
      for (int i = 0; i < ActivationTypeIdNrcFilters.length; i++) {
        ActivationTypeIdNrcFilters[i] = (IntegerFilter)ActivationTypeIdNrcFilter[i];
      }
      try {
        out.setActivationTypeIdNrcFilter(ActivationTypeIdNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TerminationTypeIdNrcMap = (Map)record.get("TerminationTypeIdNrc");
    Boolean TerminationTypeIdNrcFetch = DataHelper.getFetch(TerminationTypeIdNrcMap);
    Boolean TerminationTypeIdNrcSortDir = DataHelper.getSortDirection(TerminationTypeIdNrcMap);
    Integer TerminationTypeIdNrcSortOrder = DataHelper.getSortOrder(TerminationTypeIdNrcMap);
    if (TerminationTypeIdNrcFetch != null) out.setTerminationTypeIdNrcFetch(TerminationTypeIdNrcFetch);
    if (TerminationTypeIdNrcSortDir != null) out.setTerminationTypeIdNrcSortDirection(TerminationTypeIdNrcSortDir);
    if (TerminationTypeIdNrcSortOrder != null) out.setTerminationTypeIdNrcSortOrder(TerminationTypeIdNrcSortOrder);

    Filter[] TerminationTypeIdNrcFilter = DataHelper.mapToFilterArray(TerminationTypeIdNrcMap, Integer.class);
    if (TerminationTypeIdNrcFilter != null) {
      IntegerFilter[] TerminationTypeIdNrcFilters = new IntegerFilter[TerminationTypeIdNrcFilter.length];
      for (int i = 0; i < TerminationTypeIdNrcFilters.length; i++) {
        TerminationTypeIdNrcFilters[i] = (IntegerFilter)TerminationTypeIdNrcFilter[i];
      }
      try {
        out.setTerminationTypeIdNrcFilter(TerminationTypeIdNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsPromotionMap = (Map)record.get("IsPromotion");
    Boolean IsPromotionFetch = DataHelper.getFetch(IsPromotionMap);
    Boolean IsPromotionSortDir = DataHelper.getSortDirection(IsPromotionMap);
    Integer IsPromotionSortOrder = DataHelper.getSortOrder(IsPromotionMap);
    if (IsPromotionFetch != null) out.setIsPromotionFetch(IsPromotionFetch);
    if (IsPromotionSortDir != null) out.setIsPromotionSortDirection(IsPromotionSortDir);
    if (IsPromotionSortOrder != null) out.setIsPromotionSortOrder(IsPromotionSortOrder);

    Filter[] IsPromotionFilter = DataHelper.mapToFilterArray(IsPromotionMap, Boolean.class);
    if (IsPromotionFilter != null) {
      BooleanFilter[] IsPromotionFilters = new BooleanFilter[IsPromotionFilter.length];
      for (int i = 0; i < IsPromotionFilters.length; i++) {
        IsPromotionFilters[i] = (BooleanFilter)IsPromotionFilter[i];
      }
      try {
        out.setIsPromotionFilter(IsPromotionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DescriptionCodeMap = (Map)record.get("DescriptionCode");
    Boolean DescriptionCodeFetch = DataHelper.getFetch(DescriptionCodeMap);
    Boolean DescriptionCodeSortDir = DataHelper.getSortDirection(DescriptionCodeMap);
    Integer DescriptionCodeSortOrder = DataHelper.getSortOrder(DescriptionCodeMap);
    if (DescriptionCodeFetch != null) out.setDescriptionCodeFetch(DescriptionCodeFetch);
    if (DescriptionCodeSortDir != null) out.setDescriptionCodeSortDirection(DescriptionCodeSortDir);
    if (DescriptionCodeSortOrder != null) out.setDescriptionCodeSortOrder(DescriptionCodeSortOrder);

    Filter[] DescriptionCodeFilter = DataHelper.mapToFilterArray(DescriptionCodeMap, Integer.class);
    if (DescriptionCodeFilter != null) {
      IntegerFilter[] DescriptionCodeFilters = new IntegerFilter[DescriptionCodeFilter.length];
      for (int i = 0; i < DescriptionCodeFilters.length; i++) {
        DescriptionCodeFilters[i] = (IntegerFilter)DescriptionCodeFilter[i];
      }
      try {
        out.setDescriptionCodeFilter(DescriptionCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ForeignCodeMap = (Map)record.get("ForeignCode");
    Boolean ForeignCodeFetch = DataHelper.getFetch(ForeignCodeMap);
    Boolean ForeignCodeSortDir = DataHelper.getSortDirection(ForeignCodeMap);
    Integer ForeignCodeSortOrder = DataHelper.getSortOrder(ForeignCodeMap);
    if (ForeignCodeFetch != null) out.setForeignCodeFetch(ForeignCodeFetch);
    if (ForeignCodeSortDir != null) out.setForeignCodeSortDirection(ForeignCodeSortDir);
    if (ForeignCodeSortOrder != null) out.setForeignCodeSortOrder(ForeignCodeSortOrder);

    Filter[] ForeignCodeFilter = DataHelper.mapToFilterArray(ForeignCodeMap, String.class);
    if (ForeignCodeFilter != null) {
      StringFilter[] ForeignCodeFilters = new StringFilter[ForeignCodeFilter.length];
      for (int i = 0; i < ForeignCodeFilters.length; i++) {
        ForeignCodeFilters[i] = (StringFilter)ForeignCodeFilter[i];
      }
      try {
        out.setForeignCodeFilter(ForeignCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StartByUnitsMap = (Map)record.get("StartByUnits");
    Boolean StartByUnitsFetch = DataHelper.getFetch(StartByUnitsMap);
    Boolean StartByUnitsSortDir = DataHelper.getSortDirection(StartByUnitsMap);
    Integer StartByUnitsSortOrder = DataHelper.getSortOrder(StartByUnitsMap);
    if (StartByUnitsFetch != null) out.setStartByUnitsFetch(StartByUnitsFetch);
    if (StartByUnitsSortDir != null) out.setStartByUnitsSortDirection(StartByUnitsSortDir);
    if (StartByUnitsSortOrder != null) out.setStartByUnitsSortOrder(StartByUnitsSortOrder);

    Filter[] StartByUnitsFilter = DataHelper.mapToFilterArray(StartByUnitsMap, Integer.class);
    if (StartByUnitsFilter != null) {
      IntegerFilter[] StartByUnitsFilters = new IntegerFilter[StartByUnitsFilter.length];
      for (int i = 0; i < StartByUnitsFilters.length; i++) {
        StartByUnitsFilters[i] = (IntegerFilter)StartByUnitsFilter[i];
      }
      try {
        out.setStartByUnitsFilter(StartByUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StartByMap = (Map)record.get("StartBy");
    Boolean StartByFetch = DataHelper.getFetch(StartByMap);
    Boolean StartBySortDir = DataHelper.getSortDirection(StartByMap);
    Integer StartBySortOrder = DataHelper.getSortOrder(StartByMap);
    if (StartByFetch != null) out.setStartByFetch(StartByFetch);
    if (StartBySortDir != null) out.setStartBySortDirection(StartBySortDir);
    if (StartBySortOrder != null) out.setStartBySortOrder(StartBySortOrder);

    Filter[] StartByFilter = DataHelper.mapToFilterArray(StartByMap, Integer.class);
    if (StartByFilter != null) {
      IntegerFilter[] StartByFilters = new IntegerFilter[StartByFilter.length];
      for (int i = 0; i < StartByFilters.length; i++) {
        StartByFilters[i] = (IntegerFilter)StartByFilter[i];
      }
      try {
        out.setStartByFilter(StartByFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDateMap = (Map)record.get("ActiveDate");
    Boolean ActiveDateFetch = DataHelper.getFetch(ActiveDateMap);
    Boolean ActiveDateSortDir = DataHelper.getSortDirection(ActiveDateMap);
    Integer ActiveDateSortOrder = DataHelper.getSortOrder(ActiveDateMap);
    if (ActiveDateFetch != null) out.setActiveDateFetch(ActiveDateFetch);
    if (ActiveDateSortDir != null) out.setActiveDateSortDirection(ActiveDateSortDir);
    if (ActiveDateSortOrder != null) out.setActiveDateSortOrder(ActiveDateSortOrder);

    Filter[] ActiveDateFilter = DataHelper.mapToFilterArray(ActiveDateMap, Date.class);
    if (ActiveDateFilter != null) {
      DateFilter[] ActiveDateFilters = new DateFilter[ActiveDateFilter.length];
      for (int i = 0; i < ActiveDateFilters.length; i++) {
        ActiveDateFilters[i] = (DateFilter)ActiveDateFilter[i];
      }
      try {
        out.setActiveDateFilter(ActiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDateMap = (Map)record.get("InactiveDate");
    Boolean InactiveDateFetch = DataHelper.getFetch(InactiveDateMap);
    Boolean InactiveDateSortDir = DataHelper.getSortDirection(InactiveDateMap);
    Integer InactiveDateSortOrder = DataHelper.getSortOrder(InactiveDateMap);
    if (InactiveDateFetch != null) out.setInactiveDateFetch(InactiveDateFetch);
    if (InactiveDateSortDir != null) out.setInactiveDateSortDirection(InactiveDateSortDir);
    if (InactiveDateSortOrder != null) out.setInactiveDateSortOrder(InactiveDateSortOrder);

    Filter[] InactiveDateFilter = DataHelper.mapToFilterArray(InactiveDateMap, Date.class);
    if (InactiveDateFilter != null) {
      DateFilter[] InactiveDateFilters = new DateFilter[InactiveDateFilter.length];
      for (int i = 0; i < InactiveDateFilters.length; i++) {
        InactiveDateFilters[i] = (DateFilter)InactiveDateFilter[i];
      }
      try {
        out.setInactiveDateFilter(InactiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FixedStartDateMap = (Map)record.get("FixedStartDate");
    Boolean FixedStartDateFetch = DataHelper.getFetch(FixedStartDateMap);
    Boolean FixedStartDateSortDir = DataHelper.getSortDirection(FixedStartDateMap);
    Integer FixedStartDateSortOrder = DataHelper.getSortOrder(FixedStartDateMap);
    if (FixedStartDateFetch != null) out.setFixedStartDateFetch(FixedStartDateFetch);
    if (FixedStartDateSortDir != null) out.setFixedStartDateSortDirection(FixedStartDateSortDir);
    if (FixedStartDateSortOrder != null) out.setFixedStartDateSortOrder(FixedStartDateSortOrder);

    Filter[] FixedStartDateFilter = DataHelper.mapToFilterArray(FixedStartDateMap, Date.class);
    if (FixedStartDateFilter != null) {
      DateFilter[] FixedStartDateFilters = new DateFilter[FixedStartDateFilter.length];
      for (int i = 0; i < FixedStartDateFilters.length; i++) {
        FixedStartDateFilters[i] = (DateFilter)FixedStartDateFilter[i];
      }
      try {
        out.setFixedStartDateFilter(FixedStartDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FixedEndDateMap = (Map)record.get("FixedEndDate");
    Boolean FixedEndDateFetch = DataHelper.getFetch(FixedEndDateMap);
    Boolean FixedEndDateSortDir = DataHelper.getSortDirection(FixedEndDateMap);
    Integer FixedEndDateSortOrder = DataHelper.getSortOrder(FixedEndDateMap);
    if (FixedEndDateFetch != null) out.setFixedEndDateFetch(FixedEndDateFetch);
    if (FixedEndDateSortDir != null) out.setFixedEndDateSortDirection(FixedEndDateSortDir);
    if (FixedEndDateSortOrder != null) out.setFixedEndDateSortOrder(FixedEndDateSortOrder);

    Filter[] FixedEndDateFilter = DataHelper.mapToFilterArray(FixedEndDateMap, Date.class);
    if (FixedEndDateFilter != null) {
      DateFilter[] FixedEndDateFilters = new DateFilter[FixedEndDateFilter.length];
      for (int i = 0; i < FixedEndDateFilters.length; i++) {
        FixedEndDateFilters[i] = (DateFilter)FixedEndDateFilter[i];
      }
      try {
        out.setFixedEndDateFilter(FixedEndDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PartialPeriodMap = (Map)record.get("PartialPeriod");
    Boolean PartialPeriodFetch = DataHelper.getFetch(PartialPeriodMap);
    Boolean PartialPeriodSortDir = DataHelper.getSortDirection(PartialPeriodMap);
    Integer PartialPeriodSortOrder = DataHelper.getSortOrder(PartialPeriodMap);
    if (PartialPeriodFetch != null) out.setPartialPeriodFetch(PartialPeriodFetch);
    if (PartialPeriodSortDir != null) out.setPartialPeriodSortDirection(PartialPeriodSortDir);
    if (PartialPeriodSortOrder != null) out.setPartialPeriodSortOrder(PartialPeriodSortOrder);

    Filter[] PartialPeriodFilter = DataHelper.mapToFilterArray(PartialPeriodMap, Boolean.class);
    if (PartialPeriodFilter != null) {
      BooleanFilter[] PartialPeriodFilters = new BooleanFilter[PartialPeriodFilter.length];
      for (int i = 0; i < PartialPeriodFilters.length; i++) {
        PartialPeriodFilters[i] = (BooleanFilter)PartialPeriodFilter[i];
      }
      try {
        out.setPartialPeriodFilter(PartialPeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CommitmentTypeIdNrcMap = (Map)record.get("CommitmentTypeIdNrc");
    Boolean CommitmentTypeIdNrcFetch = DataHelper.getFetch(CommitmentTypeIdNrcMap);
    Boolean CommitmentTypeIdNrcSortDir = DataHelper.getSortDirection(CommitmentTypeIdNrcMap);
    Integer CommitmentTypeIdNrcSortOrder = DataHelper.getSortOrder(CommitmentTypeIdNrcMap);
    if (CommitmentTypeIdNrcFetch != null) out.setCommitmentTypeIdNrcFetch(CommitmentTypeIdNrcFetch);
    if (CommitmentTypeIdNrcSortDir != null) out.setCommitmentTypeIdNrcSortDirection(CommitmentTypeIdNrcSortDir);
    if (CommitmentTypeIdNrcSortOrder != null) out.setCommitmentTypeIdNrcSortOrder(CommitmentTypeIdNrcSortOrder);

    Filter[] CommitmentTypeIdNrcFilter = DataHelper.mapToFilterArray(CommitmentTypeIdNrcMap, Integer.class);
    if (CommitmentTypeIdNrcFilter != null) {
      IntegerFilter[] CommitmentTypeIdNrcFilters = new IntegerFilter[CommitmentTypeIdNrcFilter.length];
      for (int i = 0; i < CommitmentTypeIdNrcFilters.length; i++) {
        CommitmentTypeIdNrcFilters[i] = (IntegerFilter)CommitmentTypeIdNrcFilter[i];
      }
      try {
        out.setCommitmentTypeIdNrcFilter(CommitmentTypeIdNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiscountBasePeriodMap = (Map)record.get("DiscountBasePeriod");
    Boolean DiscountBasePeriodFetch = DataHelper.getFetch(DiscountBasePeriodMap);
    Boolean DiscountBasePeriodSortDir = DataHelper.getSortDirection(DiscountBasePeriodMap);
    Integer DiscountBasePeriodSortOrder = DataHelper.getSortOrder(DiscountBasePeriodMap);
    if (DiscountBasePeriodFetch != null) out.setDiscountBasePeriodFetch(DiscountBasePeriodFetch);
    if (DiscountBasePeriodSortDir != null) out.setDiscountBasePeriodSortDirection(DiscountBasePeriodSortDir);
    if (DiscountBasePeriodSortOrder != null) out.setDiscountBasePeriodSortOrder(DiscountBasePeriodSortOrder);

    Filter[] DiscountBasePeriodFilter = DataHelper.mapToFilterArray(DiscountBasePeriodMap, Integer.class);
    if (DiscountBasePeriodFilter != null) {
      IntegerFilter[] DiscountBasePeriodFilters = new IntegerFilter[DiscountBasePeriodFilter.length];
      for (int i = 0; i < DiscountBasePeriodFilters.length; i++) {
        DiscountBasePeriodFilters[i] = (IntegerFilter)DiscountBasePeriodFilter[i];
      }
      try {
        out.setDiscountBasePeriodFilter(DiscountBasePeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RolloverOrderMap = (Map)record.get("RolloverOrder");
    Boolean RolloverOrderFetch = DataHelper.getFetch(RolloverOrderMap);
    Boolean RolloverOrderSortDir = DataHelper.getSortDirection(RolloverOrderMap);
    Integer RolloverOrderSortOrder = DataHelper.getSortOrder(RolloverOrderMap);
    if (RolloverOrderFetch != null) out.setRolloverOrderFetch(RolloverOrderFetch);
    if (RolloverOrderSortDir != null) out.setRolloverOrderSortDirection(RolloverOrderSortDir);
    if (RolloverOrderSortOrder != null) out.setRolloverOrderSortOrder(RolloverOrderSortOrder);

    Filter[] RolloverOrderFilter = DataHelper.mapToFilterArray(RolloverOrderMap, Integer.class);
    if (RolloverOrderFilter != null) {
      IntegerFilter[] RolloverOrderFilters = new IntegerFilter[RolloverOrderFilter.length];
      for (int i = 0; i < RolloverOrderFilters.length; i++) {
        RolloverOrderFilters[i] = (IntegerFilter)RolloverOrderFilter[i];
      }
      try {
        out.setRolloverOrderFilter(RolloverOrderFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RolloverGroupingMap = (Map)record.get("RolloverGrouping");
    Boolean RolloverGroupingFetch = DataHelper.getFetch(RolloverGroupingMap);
    Boolean RolloverGroupingSortDir = DataHelper.getSortDirection(RolloverGroupingMap);
    Integer RolloverGroupingSortOrder = DataHelper.getSortOrder(RolloverGroupingMap);
    if (RolloverGroupingFetch != null) out.setRolloverGroupingFetch(RolloverGroupingFetch);
    if (RolloverGroupingSortDir != null) out.setRolloverGroupingSortDirection(RolloverGroupingSortDir);
    if (RolloverGroupingSortOrder != null) out.setRolloverGroupingSortOrder(RolloverGroupingSortOrder);

    Filter[] RolloverGroupingFilter = DataHelper.mapToFilterArray(RolloverGroupingMap, Integer.class);
    if (RolloverGroupingFilter != null) {
      IntegerFilter[] RolloverGroupingFilters = new IntegerFilter[RolloverGroupingFilter.length];
      for (int i = 0; i < RolloverGroupingFilters.length; i++) {
        RolloverGroupingFilters[i] = (IntegerFilter)RolloverGroupingFilter[i];
      }
      try {
        out.setRolloverGroupingFilter(RolloverGroupingFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BonusPointIdMap = (Map)record.get("BonusPointId");
    Boolean BonusPointIdFetch = DataHelper.getFetch(BonusPointIdMap);
    Boolean BonusPointIdSortDir = DataHelper.getSortDirection(BonusPointIdMap);
    Integer BonusPointIdSortOrder = DataHelper.getSortOrder(BonusPointIdMap);
    if (BonusPointIdFetch != null) out.setBonusPointIdFetch(BonusPointIdFetch);
    if (BonusPointIdSortDir != null) out.setBonusPointIdSortDirection(BonusPointIdSortDir);
    if (BonusPointIdSortOrder != null) out.setBonusPointIdSortOrder(BonusPointIdSortOrder);

    Filter[] BonusPointIdFilter = DataHelper.mapToFilterArray(BonusPointIdMap, Integer.class);
    if (BonusPointIdFilter != null) {
      IntegerFilter[] BonusPointIdFilters = new IntegerFilter[BonusPointIdFilter.length];
      for (int i = 0; i < BonusPointIdFilters.length; i++) {
        BonusPointIdFilters[i] = (IntegerFilter)BonusPointIdFilter[i];
      }
      try {
        out.setBonusPointIdFilter(BonusPointIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateContractStartMap = (Map)record.get("ProrateContractStart");
    Boolean ProrateContractStartFetch = DataHelper.getFetch(ProrateContractStartMap);
    Boolean ProrateContractStartSortDir = DataHelper.getSortDirection(ProrateContractStartMap);
    Integer ProrateContractStartSortOrder = DataHelper.getSortOrder(ProrateContractStartMap);
    if (ProrateContractStartFetch != null) out.setProrateContractStartFetch(ProrateContractStartFetch);
    if (ProrateContractStartSortDir != null) out.setProrateContractStartSortDirection(ProrateContractStartSortDir);
    if (ProrateContractStartSortOrder != null) out.setProrateContractStartSortOrder(ProrateContractStartSortOrder);

    Filter[] ProrateContractStartFilter = DataHelper.mapToFilterArray(ProrateContractStartMap, Boolean.class);
    if (ProrateContractStartFilter != null) {
      BooleanFilter[] ProrateContractStartFilters = new BooleanFilter[ProrateContractStartFilter.length];
      for (int i = 0; i < ProrateContractStartFilters.length; i++) {
        ProrateContractStartFilters[i] = (BooleanFilter)ProrateContractStartFilter[i];
      }
      try {
        out.setProrateContractStartFilter(ProrateContractStartFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateContractEndMap = (Map)record.get("ProrateContractEnd");
    Boolean ProrateContractEndFetch = DataHelper.getFetch(ProrateContractEndMap);
    Boolean ProrateContractEndSortDir = DataHelper.getSortDirection(ProrateContractEndMap);
    Integer ProrateContractEndSortOrder = DataHelper.getSortOrder(ProrateContractEndMap);
    if (ProrateContractEndFetch != null) out.setProrateContractEndFetch(ProrateContractEndFetch);
    if (ProrateContractEndSortDir != null) out.setProrateContractEndSortDirection(ProrateContractEndSortDir);
    if (ProrateContractEndSortOrder != null) out.setProrateContractEndSortOrder(ProrateContractEndSortOrder);

    Filter[] ProrateContractEndFilter = DataHelper.mapToFilterArray(ProrateContractEndMap, Boolean.class);
    if (ProrateContractEndFilter != null) {
      BooleanFilter[] ProrateContractEndFilters = new BooleanFilter[ProrateContractEndFilter.length];
      for (int i = 0; i < ProrateContractEndFilters.length; i++) {
        ProrateContractEndFilters[i] = (BooleanFilter)ProrateContractEndFilter[i];
      }
      try {
        out.setProrateContractEndFilter(ProrateContractEndFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateInterimBillMap = (Map)record.get("ProrateInterimBill");
    Boolean ProrateInterimBillFetch = DataHelper.getFetch(ProrateInterimBillMap);
    Boolean ProrateInterimBillSortDir = DataHelper.getSortDirection(ProrateInterimBillMap);
    Integer ProrateInterimBillSortOrder = DataHelper.getSortOrder(ProrateInterimBillMap);
    if (ProrateInterimBillFetch != null) out.setProrateInterimBillFetch(ProrateInterimBillFetch);
    if (ProrateInterimBillSortDir != null) out.setProrateInterimBillSortDirection(ProrateInterimBillSortDir);
    if (ProrateInterimBillSortOrder != null) out.setProrateInterimBillSortOrder(ProrateInterimBillSortOrder);

    Filter[] ProrateInterimBillFilter = DataHelper.mapToFilterArray(ProrateInterimBillMap, Boolean.class);
    if (ProrateInterimBillFilter != null) {
      BooleanFilter[] ProrateInterimBillFilters = new BooleanFilter[ProrateInterimBillFilter.length];
      for (int i = 0; i < ProrateInterimBillFilters.length; i++) {
        ProrateInterimBillFilters[i] = (BooleanFilter)ProrateInterimBillFilter[i];
      }
      try {
        out.setProrateInterimBillFilter(ProrateInterimBillFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProratePeriodChangeMap = (Map)record.get("ProratePeriodChange");
    Boolean ProratePeriodChangeFetch = DataHelper.getFetch(ProratePeriodChangeMap);
    Boolean ProratePeriodChangeSortDir = DataHelper.getSortDirection(ProratePeriodChangeMap);
    Integer ProratePeriodChangeSortOrder = DataHelper.getSortOrder(ProratePeriodChangeMap);
    if (ProratePeriodChangeFetch != null) out.setProratePeriodChangeFetch(ProratePeriodChangeFetch);
    if (ProratePeriodChangeSortDir != null) out.setProratePeriodChangeSortDirection(ProratePeriodChangeSortDir);
    if (ProratePeriodChangeSortOrder != null) out.setProratePeriodChangeSortOrder(ProratePeriodChangeSortOrder);

    Filter[] ProratePeriodChangeFilter = DataHelper.mapToFilterArray(ProratePeriodChangeMap, Boolean.class);
    if (ProratePeriodChangeFilter != null) {
      BooleanFilter[] ProratePeriodChangeFilters = new BooleanFilter[ProratePeriodChangeFilter.length];
      for (int i = 0; i < ProratePeriodChangeFilters.length; i++) {
        ProratePeriodChangeFilters[i] = (BooleanFilter)ProratePeriodChangeFilter[i];
      }
      try {
        out.setProratePeriodChangeFilter(ProratePeriodChangeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateAccountStartMap = (Map)record.get("ProrateAccountStart");
    Boolean ProrateAccountStartFetch = DataHelper.getFetch(ProrateAccountStartMap);
    Boolean ProrateAccountStartSortDir = DataHelper.getSortDirection(ProrateAccountStartMap);
    Integer ProrateAccountStartSortOrder = DataHelper.getSortOrder(ProrateAccountStartMap);
    if (ProrateAccountStartFetch != null) out.setProrateAccountStartFetch(ProrateAccountStartFetch);
    if (ProrateAccountStartSortDir != null) out.setProrateAccountStartSortDirection(ProrateAccountStartSortDir);
    if (ProrateAccountStartSortOrder != null) out.setProrateAccountStartSortOrder(ProrateAccountStartSortOrder);

    Filter[] ProrateAccountStartFilter = DataHelper.mapToFilterArray(ProrateAccountStartMap, Boolean.class);
    if (ProrateAccountStartFilter != null) {
      BooleanFilter[] ProrateAccountStartFilters = new BooleanFilter[ProrateAccountStartFilter.length];
      for (int i = 0; i < ProrateAccountStartFilters.length; i++) {
        ProrateAccountStartFilters[i] = (BooleanFilter)ProrateAccountStartFilter[i];
      }
      try {
        out.setProrateAccountStartFilter(ProrateAccountStartFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateAccountEndMap = (Map)record.get("ProrateAccountEnd");
    Boolean ProrateAccountEndFetch = DataHelper.getFetch(ProrateAccountEndMap);
    Boolean ProrateAccountEndSortDir = DataHelper.getSortDirection(ProrateAccountEndMap);
    Integer ProrateAccountEndSortOrder = DataHelper.getSortOrder(ProrateAccountEndMap);
    if (ProrateAccountEndFetch != null) out.setProrateAccountEndFetch(ProrateAccountEndFetch);
    if (ProrateAccountEndSortDir != null) out.setProrateAccountEndSortDirection(ProrateAccountEndSortDir);
    if (ProrateAccountEndSortOrder != null) out.setProrateAccountEndSortOrder(ProrateAccountEndSortOrder);

    Filter[] ProrateAccountEndFilter = DataHelper.mapToFilterArray(ProrateAccountEndMap, Boolean.class);
    if (ProrateAccountEndFilter != null) {
      BooleanFilter[] ProrateAccountEndFilters = new BooleanFilter[ProrateAccountEndFilter.length];
      for (int i = 0; i < ProrateAccountEndFilters.length; i++) {
        ProrateAccountEndFilters[i] = (BooleanFilter)ProrateAccountEndFilter[i];
      }
      try {
        out.setProrateAccountEndFilter(ProrateAccountEndFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateTargetThresholdMap = (Map)record.get("ProrateTargetThreshold");
    Boolean ProrateTargetThresholdFetch = DataHelper.getFetch(ProrateTargetThresholdMap);
    Boolean ProrateTargetThresholdSortDir = DataHelper.getSortDirection(ProrateTargetThresholdMap);
    Integer ProrateTargetThresholdSortOrder = DataHelper.getSortOrder(ProrateTargetThresholdMap);
    if (ProrateTargetThresholdFetch != null) out.setProrateTargetThresholdFetch(ProrateTargetThresholdFetch);
    if (ProrateTargetThresholdSortDir != null) out.setProrateTargetThresholdSortDirection(ProrateTargetThresholdSortDir);
    if (ProrateTargetThresholdSortOrder != null) out.setProrateTargetThresholdSortOrder(ProrateTargetThresholdSortOrder);

    Filter[] ProrateTargetThresholdFilter = DataHelper.mapToFilterArray(ProrateTargetThresholdMap, Boolean.class);
    if (ProrateTargetThresholdFilter != null) {
      BooleanFilter[] ProrateTargetThresholdFilters = new BooleanFilter[ProrateTargetThresholdFilter.length];
      for (int i = 0; i < ProrateTargetThresholdFilters.length; i++) {
        ProrateTargetThresholdFilters[i] = (BooleanFilter)ProrateTargetThresholdFilter[i];
      }
      try {
        out.setProrateTargetThresholdFilter(ProrateTargetThresholdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateTargetRebatesMap = (Map)record.get("ProrateTargetRebates");
    Boolean ProrateTargetRebatesFetch = DataHelper.getFetch(ProrateTargetRebatesMap);
    Boolean ProrateTargetRebatesSortDir = DataHelper.getSortDirection(ProrateTargetRebatesMap);
    Integer ProrateTargetRebatesSortOrder = DataHelper.getSortOrder(ProrateTargetRebatesMap);
    if (ProrateTargetRebatesFetch != null) out.setProrateTargetRebatesFetch(ProrateTargetRebatesFetch);
    if (ProrateTargetRebatesSortDir != null) out.setProrateTargetRebatesSortDirection(ProrateTargetRebatesSortDir);
    if (ProrateTargetRebatesSortOrder != null) out.setProrateTargetRebatesSortOrder(ProrateTargetRebatesSortOrder);

    Filter[] ProrateTargetRebatesFilter = DataHelper.mapToFilterArray(ProrateTargetRebatesMap, Boolean.class);
    if (ProrateTargetRebatesFilter != null) {
      BooleanFilter[] ProrateTargetRebatesFilters = new BooleanFilter[ProrateTargetRebatesFilter.length];
      for (int i = 0; i < ProrateTargetRebatesFilters.length; i++) {
        ProrateTargetRebatesFilters[i] = (BooleanFilter)ProrateTargetRebatesFilter[i];
      }
      try {
        out.setProrateTargetRebatesFilter(ProrateTargetRebatesFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllowAccountMap = (Map)record.get("AllowAccount");
    Boolean AllowAccountFetch = DataHelper.getFetch(AllowAccountMap);
    Boolean AllowAccountSortDir = DataHelper.getSortDirection(AllowAccountMap);
    Integer AllowAccountSortOrder = DataHelper.getSortOrder(AllowAccountMap);
    if (AllowAccountFetch != null) out.setAllowAccountFetch(AllowAccountFetch);
    if (AllowAccountSortDir != null) out.setAllowAccountSortDirection(AllowAccountSortDir);
    if (AllowAccountSortOrder != null) out.setAllowAccountSortOrder(AllowAccountSortOrder);

    Filter[] AllowAccountFilter = DataHelper.mapToFilterArray(AllowAccountMap, Integer.class);
    if (AllowAccountFilter != null) {
      IntegerFilter[] AllowAccountFilters = new IntegerFilter[AllowAccountFilter.length];
      for (int i = 0; i < AllowAccountFilters.length; i++) {
        AllowAccountFilters[i] = (IntegerFilter)AllowAccountFilter[i];
      }
      try {
        out.setAllowAccountFilter(AllowAccountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllowServiceMap = (Map)record.get("AllowService");
    Boolean AllowServiceFetch = DataHelper.getFetch(AllowServiceMap);
    Boolean AllowServiceSortDir = DataHelper.getSortDirection(AllowServiceMap);
    Integer AllowServiceSortOrder = DataHelper.getSortOrder(AllowServiceMap);
    if (AllowServiceFetch != null) out.setAllowServiceFetch(AllowServiceFetch);
    if (AllowServiceSortDir != null) out.setAllowServiceSortDirection(AllowServiceSortDir);
    if (AllowServiceSortOrder != null) out.setAllowServiceSortOrder(AllowServiceSortOrder);

    Filter[] AllowServiceFilter = DataHelper.mapToFilterArray(AllowServiceMap, Integer.class);
    if (AllowServiceFilter != null) {
      IntegerFilter[] AllowServiceFilters = new IntegerFilter[AllowServiceFilter.length];
      for (int i = 0; i < AllowServiceFilters.length; i++) {
        AllowServiceFilters[i] = (IntegerFilter)AllowServiceFilter[i];
      }
      try {
        out.setAllowServiceFilter(AllowServiceFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllowAccountGroupMap = (Map)record.get("AllowAccountGroup");
    Boolean AllowAccountGroupFetch = DataHelper.getFetch(AllowAccountGroupMap);
    Boolean AllowAccountGroupSortDir = DataHelper.getSortDirection(AllowAccountGroupMap);
    Integer AllowAccountGroupSortOrder = DataHelper.getSortOrder(AllowAccountGroupMap);
    if (AllowAccountGroupFetch != null) out.setAllowAccountGroupFetch(AllowAccountGroupFetch);
    if (AllowAccountGroupSortDir != null) out.setAllowAccountGroupSortDirection(AllowAccountGroupSortDir);
    if (AllowAccountGroupSortOrder != null) out.setAllowAccountGroupSortOrder(AllowAccountGroupSortOrder);

    Filter[] AllowAccountGroupFilter = DataHelper.mapToFilterArray(AllowAccountGroupMap, Integer.class);
    if (AllowAccountGroupFilter != null) {
      IntegerFilter[] AllowAccountGroupFilters = new IntegerFilter[AllowAccountGroupFilter.length];
      for (int i = 0; i < AllowAccountGroupFilters.length; i++) {
        AllowAccountGroupFilters[i] = (IntegerFilter)AllowAccountGroupFilter[i];
      }
      try {
        out.setAllowAccountGroupFilter(AllowAccountGroupFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllowServiceGroupMap = (Map)record.get("AllowServiceGroup");
    Boolean AllowServiceGroupFetch = DataHelper.getFetch(AllowServiceGroupMap);
    Boolean AllowServiceGroupSortDir = DataHelper.getSortDirection(AllowServiceGroupMap);
    Integer AllowServiceGroupSortOrder = DataHelper.getSortOrder(AllowServiceGroupMap);
    if (AllowServiceGroupFetch != null) out.setAllowServiceGroupFetch(AllowServiceGroupFetch);
    if (AllowServiceGroupSortDir != null) out.setAllowServiceGroupSortDirection(AllowServiceGroupSortDir);
    if (AllowServiceGroupSortOrder != null) out.setAllowServiceGroupSortOrder(AllowServiceGroupSortOrder);

    Filter[] AllowServiceGroupFilter = DataHelper.mapToFilterArray(AllowServiceGroupMap, Integer.class);
    if (AllowServiceGroupFilter != null) {
      IntegerFilter[] AllowServiceGroupFilters = new IntegerFilter[AllowServiceGroupFilter.length];
      for (int i = 0; i < AllowServiceGroupFilters.length; i++) {
        AllowServiceGroupFilters[i] = (IntegerFilter)AllowServiceGroupFilter[i];
      }
      try {
        out.setAllowServiceGroupFilter(AllowServiceGroupFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillPeriodMap = (Map)record.get("BillPeriod");
    Boolean BillPeriodFetch = DataHelper.getFetch(BillPeriodMap);
    Boolean BillPeriodSortDir = DataHelper.getSortDirection(BillPeriodMap);
    Integer BillPeriodSortOrder = DataHelper.getSortOrder(BillPeriodMap);
    if (BillPeriodFetch != null) out.setBillPeriodFetch(BillPeriodFetch);
    if (BillPeriodSortDir != null) out.setBillPeriodSortDirection(BillPeriodSortDir);
    if (BillPeriodSortOrder != null) out.setBillPeriodSortOrder(BillPeriodSortOrder);

    Filter[] BillPeriodFilter = DataHelper.mapToFilterArray(BillPeriodMap, String.class);
    if (BillPeriodFilter != null) {
      StringFilter[] BillPeriodFilters = new StringFilter[BillPeriodFilter.length];
      for (int i = 0; i < BillPeriodFilters.length; i++) {
        BillPeriodFilters[i] = (StringFilter)BillPeriodFilter[i];
      }
      try {
        out.setBillPeriodFilter(BillPeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MinDurationUnitsMap = (Map)record.get("MinDurationUnits");
    Boolean MinDurationUnitsFetch = DataHelper.getFetch(MinDurationUnitsMap);
    Boolean MinDurationUnitsSortDir = DataHelper.getSortDirection(MinDurationUnitsMap);
    Integer MinDurationUnitsSortOrder = DataHelper.getSortOrder(MinDurationUnitsMap);
    if (MinDurationUnitsFetch != null) out.setMinDurationUnitsFetch(MinDurationUnitsFetch);
    if (MinDurationUnitsSortDir != null) out.setMinDurationUnitsSortDirection(MinDurationUnitsSortDir);
    if (MinDurationUnitsSortOrder != null) out.setMinDurationUnitsSortOrder(MinDurationUnitsSortOrder);

    Filter[] MinDurationUnitsFilter = DataHelper.mapToFilterArray(MinDurationUnitsMap, Integer.class);
    if (MinDurationUnitsFilter != null) {
      IntegerFilter[] MinDurationUnitsFilters = new IntegerFilter[MinDurationUnitsFilter.length];
      for (int i = 0; i < MinDurationUnitsFilters.length; i++) {
        MinDurationUnitsFilters[i] = (IntegerFilter)MinDurationUnitsFilter[i];
      }
      try {
        out.setMinDurationUnitsFilter(MinDurationUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MinDurationMap = (Map)record.get("MinDuration");
    Boolean MinDurationFetch = DataHelper.getFetch(MinDurationMap);
    Boolean MinDurationSortDir = DataHelper.getSortDirection(MinDurationMap);
    Integer MinDurationSortOrder = DataHelper.getSortOrder(MinDurationMap);
    if (MinDurationFetch != null) out.setMinDurationFetch(MinDurationFetch);
    if (MinDurationSortDir != null) out.setMinDurationSortDirection(MinDurationSortDir);
    if (MinDurationSortOrder != null) out.setMinDurationSortOrder(MinDurationSortOrder);

    Filter[] MinDurationFilter = DataHelper.mapToFilterArray(MinDurationMap, Integer.class);
    if (MinDurationFilter != null) {
      IntegerFilter[] MinDurationFilters = new IntegerFilter[MinDurationFilter.length];
      for (int i = 0; i < MinDurationFilters.length; i++) {
        MinDurationFilters[i] = (IntegerFilter)MinDurationFilter[i];
      }
      try {
        out.setMinDurationFilter(MinDurationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MinNoticeUnitsMap = (Map)record.get("MinNoticeUnits");
    Boolean MinNoticeUnitsFetch = DataHelper.getFetch(MinNoticeUnitsMap);
    Boolean MinNoticeUnitsSortDir = DataHelper.getSortDirection(MinNoticeUnitsMap);
    Integer MinNoticeUnitsSortOrder = DataHelper.getSortOrder(MinNoticeUnitsMap);
    if (MinNoticeUnitsFetch != null) out.setMinNoticeUnitsFetch(MinNoticeUnitsFetch);
    if (MinNoticeUnitsSortDir != null) out.setMinNoticeUnitsSortDirection(MinNoticeUnitsSortDir);
    if (MinNoticeUnitsSortOrder != null) out.setMinNoticeUnitsSortOrder(MinNoticeUnitsSortOrder);

    Filter[] MinNoticeUnitsFilter = DataHelper.mapToFilterArray(MinNoticeUnitsMap, Integer.class);
    if (MinNoticeUnitsFilter != null) {
      IntegerFilter[] MinNoticeUnitsFilters = new IntegerFilter[MinNoticeUnitsFilter.length];
      for (int i = 0; i < MinNoticeUnitsFilters.length; i++) {
        MinNoticeUnitsFilters[i] = (IntegerFilter)MinNoticeUnitsFilter[i];
      }
      try {
        out.setMinNoticeUnitsFilter(MinNoticeUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MinNoticeDelayMap = (Map)record.get("MinNoticeDelay");
    Boolean MinNoticeDelayFetch = DataHelper.getFetch(MinNoticeDelayMap);
    Boolean MinNoticeDelaySortDir = DataHelper.getSortDirection(MinNoticeDelayMap);
    Integer MinNoticeDelaySortOrder = DataHelper.getSortOrder(MinNoticeDelayMap);
    if (MinNoticeDelayFetch != null) out.setMinNoticeDelayFetch(MinNoticeDelayFetch);
    if (MinNoticeDelaySortDir != null) out.setMinNoticeDelaySortDirection(MinNoticeDelaySortDir);
    if (MinNoticeDelaySortOrder != null) out.setMinNoticeDelaySortOrder(MinNoticeDelaySortOrder);

    Filter[] MinNoticeDelayFilter = DataHelper.mapToFilterArray(MinNoticeDelayMap, Integer.class);
    if (MinNoticeDelayFilter != null) {
      IntegerFilter[] MinNoticeDelayFilters = new IntegerFilter[MinNoticeDelayFilter.length];
      for (int i = 0; i < MinNoticeDelayFilters.length; i++) {
        MinNoticeDelayFilters[i] = (IntegerFilter)MinNoticeDelayFilter[i];
      }
      try {
        out.setMinNoticeDelayFilter(MinNoticeDelayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsCustomMap = (Map)record.get("IsCustom");
    Boolean IsCustomFetch = DataHelper.getFetch(IsCustomMap);
    Boolean IsCustomSortDir = DataHelper.getSortDirection(IsCustomMap);
    Integer IsCustomSortOrder = DataHelper.getSortOrder(IsCustomMap);
    if (IsCustomFetch != null) out.setIsCustomFetch(IsCustomFetch);
    if (IsCustomSortDir != null) out.setIsCustomSortDirection(IsCustomSortDir);
    if (IsCustomSortOrder != null) out.setIsCustomSortOrder(IsCustomSortOrder);

    Filter[] IsCustomFilter = DataHelper.mapToFilterArray(IsCustomMap, Integer.class);
    if (IsCustomFilter != null) {
      IntegerFilter[] IsCustomFilters = new IntegerFilter[IsCustomFilter.length];
      for (int i = 0; i < IsCustomFilters.length; i++) {
        IsCustomFilters[i] = (IntegerFilter)IsCustomFilter[i];
      }
      try {
        out.setIsCustomFilter(IsCustomFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map WhenAppliedMap = (Map)record.get("WhenApplied");
    Boolean WhenAppliedFetch = DataHelper.getFetch(WhenAppliedMap);
    Boolean WhenAppliedSortDir = DataHelper.getSortDirection(WhenAppliedMap);
    Integer WhenAppliedSortOrder = DataHelper.getSortOrder(WhenAppliedMap);
    if (WhenAppliedFetch != null) out.setWhenAppliedFetch(WhenAppliedFetch);
    if (WhenAppliedSortDir != null) out.setWhenAppliedSortDirection(WhenAppliedSortDir);
    if (WhenAppliedSortOrder != null) out.setWhenAppliedSortOrder(WhenAppliedSortOrder);

    Filter[] WhenAppliedFilter = DataHelper.mapToFilterArray(WhenAppliedMap, Integer.class);
    if (WhenAppliedFilter != null) {
      IntegerFilter[] WhenAppliedFilters = new IntegerFilter[WhenAppliedFilter.length];
      for (int i = 0; i < WhenAppliedFilters.length; i++) {
        WhenAppliedFilters[i] = (IntegerFilter)WhenAppliedFilter[i];
      }
      try {
        out.setWhenAppliedFilter(WhenAppliedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ApplyDuringSuspendMap = (Map)record.get("ApplyDuringSuspend");
    Boolean ApplyDuringSuspendFetch = DataHelper.getFetch(ApplyDuringSuspendMap);
    Boolean ApplyDuringSuspendSortDir = DataHelper.getSortDirection(ApplyDuringSuspendMap);
    Integer ApplyDuringSuspendSortOrder = DataHelper.getSortOrder(ApplyDuringSuspendMap);
    if (ApplyDuringSuspendFetch != null) out.setApplyDuringSuspendFetch(ApplyDuringSuspendFetch);
    if (ApplyDuringSuspendSortDir != null) out.setApplyDuringSuspendSortDirection(ApplyDuringSuspendSortDir);
    if (ApplyDuringSuspendSortOrder != null) out.setApplyDuringSuspendSortOrder(ApplyDuringSuspendSortOrder);

    Filter[] ApplyDuringSuspendFilter = DataHelper.mapToFilterArray(ApplyDuringSuspendMap, Integer.class);
    if (ApplyDuringSuspendFilter != null) {
      IntegerFilter[] ApplyDuringSuspendFilters = new IntegerFilter[ApplyDuringSuspendFilter.length];
      for (int i = 0; i < ApplyDuringSuspendFilters.length; i++) {
        ApplyDuringSuspendFilters[i] = (IntegerFilter)ApplyDuringSuspendFilter[i];
      }
      try {
        out.setApplyDuringSuspendFilter(ApplyDuringSuspendFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PlanOrderMap = (Map)record.get("PlanOrder");
    Boolean PlanOrderFetch = DataHelper.getFetch(PlanOrderMap);
    Boolean PlanOrderSortDir = DataHelper.getSortDirection(PlanOrderMap);
    Integer PlanOrderSortOrder = DataHelper.getSortOrder(PlanOrderMap);
    if (PlanOrderFetch != null) out.setPlanOrderFetch(PlanOrderFetch);
    if (PlanOrderSortDir != null) out.setPlanOrderSortDirection(PlanOrderSortDir);
    if (PlanOrderSortOrder != null) out.setPlanOrderSortOrder(PlanOrderSortOrder);

    Filter[] PlanOrderFilter = DataHelper.mapToFilterArray(PlanOrderMap, Integer.class);
    if (PlanOrderFilter != null) {
      IntegerFilter[] PlanOrderFilters = new IntegerFilter[PlanOrderFilter.length];
      for (int i = 0; i < PlanOrderFilters.length; i++) {
        PlanOrderFilters[i] = (IntegerFilter)PlanOrderFilter[i];
      }
      try {
        out.setPlanOrderFilter(PlanOrderFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DefOrderMap = (Map)record.get("DefOrder");
    Boolean DefOrderFetch = DataHelper.getFetch(DefOrderMap);
    Boolean DefOrderSortDir = DataHelper.getSortDirection(DefOrderMap);
    Integer DefOrderSortOrder = DataHelper.getSortOrder(DefOrderMap);
    if (DefOrderFetch != null) out.setDefOrderFetch(DefOrderFetch);
    if (DefOrderSortDir != null) out.setDefOrderSortDirection(DefOrderSortDir);
    if (DefOrderSortOrder != null) out.setDefOrderSortOrder(DefOrderSortOrder);

    Filter[] DefOrderFilter = DataHelper.mapToFilterArray(DefOrderMap, Integer.class);
    if (DefOrderFilter != null) {
      IntegerFilter[] DefOrderFilters = new IntegerFilter[DefOrderFilter.length];
      for (int i = 0; i < DefOrderFilters.length; i++) {
        DefOrderFilters[i] = (IntegerFilter)DefOrderFilter[i];
      }
      try {
        out.setDefOrderFilter(DefOrderFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
