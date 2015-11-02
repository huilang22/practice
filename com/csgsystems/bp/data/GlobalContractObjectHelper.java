/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalContractObjectHelper.java
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

import java.math.BigInteger;
import java.util.*;
import com.csgsystems.api.bulk.*;


import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;



/** Helper class to convert GlobalContractObject JavaBean objects to/from HashMaps.
 */
public class GlobalContractObjectHelper implements ArubaObjectHelper
{
  /** convert GlobalContractObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (GlobalContractObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalContractObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalContractObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalContractObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert GlobalContractObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalContractObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalContractObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalContractObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GlobalContractObjectData.
   * @param record the Map containing the data to convert to the object
   * @return GlobalContractObjectData the converted object
   */
  public static GlobalContractObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GlobalContractObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GlobalContractObject")
   * @return GlobalContractObjectData the converted object
   */
  public static GlobalContractObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalContractObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GlobalContractObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return GlobalContractObjectFilter the converted object
   */
  public static GlobalContractObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GlobalContractObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GlobalContractObject")
   * @return GlobalContractObjectFilter the converted object
   */
  public static GlobalContractObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalContractObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to GlobalContractObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return GlobalContractObjectDataList the converted object
   */
  public static GlobalContractObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to GlobalContractObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "GlobalContractObjectList")
   * @return GlobalContractObjectDataList the converted object
   */
  public static GlobalContractObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalContractObjectList";
    Object[] root = (Object[]) record.get (rootName);
    GlobalContractObjectData[] array = null;
    if (root != null)
    {
      array = new GlobalContractObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = GlobalContractObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new GlobalContractObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new GlobalContractObjectDataList (array, index, total);
  }
  /** convert GlobalContractObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GlobalContractObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", GlobalContractObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._TrackingIdSet) record.put ("TrackingId", in.TrackingId);
  
    if (in._TrackingIdServSet) record.put ("TrackingIdServ", in.TrackingIdServ);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._InUseSet) record.put ("InUse", in.InUse);
  
    if (in._ArchFlagSet) record.put ("ArchFlag", in.ArchFlag);
  
    if (in._AvailPeriodsSet) record.put ("AvailPeriods", in.AvailPeriods);
  
    if (in._FirstUseDtSet) record.put ("FirstUseDt", in.FirstUseDt);
  
    if (in._LastUseDtSet) record.put ("LastUseDt", in.LastUseDt);
  
    if (in._CommitmentAmountSet) record.put ("CommitmentAmount", in.CommitmentAmount);
  
    if (in._CommitmentCurrencyCodeSet) record.put ("CommitmentCurrencyCode", in.CommitmentCurrencyCode);
  
    if (in._TotalSavingsAmountSet) record.put ("TotalSavingsAmount", in.TotalSavingsAmount);
  
    if (in._TotalElementAmountSet) record.put ("TotalElementAmount", in.TotalElementAmount);
  
    if (in._PrevEvalDateSet) record.put ("PrevEvalDate", in.PrevEvalDate);
  
    if (in._NextEvalDateSet) record.put ("NextEvalDate", in.NextEvalDate);
  
    if (in._ViewStatusSet) record.put ("ViewStatus", in.ViewStatus);
  
    if (in._ViewCreatedDtSet) record.put ("ViewCreatedDt", in.ViewCreatedDt);
  
    if (in._ViewEffectiveDtSet) record.put ("ViewEffectiveDt", in.ViewEffectiveDt);
  
    if (in._IntendedViewEffectiveDtSet) record.put ("IntendedViewEffectiveDt", in.IntendedViewEffectiveDt);
  
    if (in._PrevViewIdSet) record.put ("PrevViewId", in.PrevViewId);
  
    if (in._ContractTypeSet) record.put ("ContractType", in.ContractType);
  
    if (in._ContractIdSet) record.put ("ContractId", in.ContractId);
  
    if (in._ParentGroupNoSet) record.put ("ParentGroupNo", in.ParentGroupNo);
  
    if (in._StartDtSet) record.put ("StartDt", in.StartDt);
  
    if (in._EndDtSet) record.put ("EndDt", in.EndDt);
  
    if (in._PrevEndDtSet) record.put ("PrevEndDt", in.PrevEndDt);
  
    if (in._GracePeriodSet) record.put ("GracePeriod", in.GracePeriod);
  
    if (in._TotalPeriodsSet) record.put ("TotalPeriods", in.TotalPeriods);
  
    if (in._SalesChannelIdSet) record.put ("SalesChannelId", in.SalesChannelId);
  
    if (in._TrackTotalAmountsSet) record.put ("TrackTotalAmounts", in.TrackTotalAmounts);
  
    if (in._RolloverPeriodSet) record.put ("RolloverPeriod", in.RolloverPeriod);
  
    if (in._RolloverPeriodStartSet) record.put ("RolloverPeriodStart", in.RolloverPeriodStart);
  
    if (in._BillPeriodSet) record.put ("BillPeriod", in.BillPeriod);
  
    if (in._DistributePaybackSet) record.put ("DistributePayback", in.DistributePayback);
  
    if (in._ProrateContractStrtOverrideSet) record.put ("ProrateContractStrtOverride", in.ProrateContractStrtOverride);
  
    if (in._ProrateContractEndOverrideSet) record.put ("ProrateContractEndOverride", in.ProrateContractEndOverride);
  
    if (in._ProrateInterimBillOverrideSet) record.put ("ProrateInterimBillOverride", in.ProrateInterimBillOverride);
  
    if (in._ProratePeriodChangeOverrideSet) record.put ("ProratePeriodChangeOverride", in.ProratePeriodChangeOverride);
  
    if (in._ProrateAccountStartOverrideSet) record.put ("ProrateAccountStartOverride", in.ProrateAccountStartOverride);
  
    if (in._ProrateAccountEndOverrideSet) record.put ("ProrateAccountEndOverride", in.ProrateAccountEndOverride);
  
    if (in._ProrateTgtThresholdOverrideSet) record.put ("ProrateTgtThresholdOverride", in.ProrateTgtThresholdOverride);
  
    if (in._ProrateTgtRebatesOverrideSet) record.put ("ProrateTgtRebatesOverride", in.ProrateTgtRebatesOverride);
  
    if (in._StartByDtSet) record.put ("StartByDt", in.StartByDt);
  
    if (in._NoticeEndDtSet) record.put ("NoticeEndDt", in.NoticeEndDt);
  
    if (in._DurationOverrideSet) record.put ("DurationOverride", in.DurationOverride);
  
    if (in._NoticeOverrideSet) record.put ("NoticeOverride", in.NoticeOverride);
  
    if (in._IsPartOfComponentSet) record.put ("IsPartOfComponent", in.IsPartOfComponent);
  
    if (in._ElementIdSet) record.put ("ElementId", in.ElementId);
  
    if (in._CommitmentReferenceSet) record.put ("CommitmentReference", in.CommitmentReference);
  
    if (in._MinDurationDateSet) record.put ("MinDurationDate", in.MinDurationDate);
  
    if (in._MinNoticeDateSet) record.put ("MinNoticeDate", in.MinNoticeDate);
  
    if (in._IsCustomSet) record.put ("IsCustom", in.IsCustom);
      if (in.extendedData != null && in.extendedData.size () > 0)
    {
      Iterator iter = in.extendedData.entrySet ().iterator ();
      int i = 0;
      list = new Object[in.extendedData.size ()];
      while (iter.hasNext ())
      {
        Map edmap = new HashMap ();
        Map.Entry entry = (Map.Entry) iter.next ();
        edmap.put ("ParamId", entry.getKey ());
        edmap.put ("ParamValue", entry.getValue ());
        edmap.put ("#NAME", "ExtendedDataParam");
        list[i++] = edmap;
      }
      record.put ("ExtendedData", list);
    }
    return record;
  }
  /** convert GlobalContractObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GlobalContractObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", GlobalContractObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.TrackingId, in.TrackingIdSort, in.TrackingIdSortAscending, in.TrackingIdFetch);
      if (map != null) record.put ("TrackingId", map);
      map = DataHelper.filterToMap (in.TrackingIdServ, in.TrackingIdServSort, in.TrackingIdServSortAscending, in.TrackingIdServFetch);
      if (map != null) record.put ("TrackingIdServ", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.InUse, in.InUseSort, in.InUseSortAscending, in.InUseFetch, in.InUseCaseInsensitive);
      if (map != null) record.put ("InUse", map);
      map = DataHelper.filterToMap (in.ArchFlag, in.ArchFlagSort, in.ArchFlagSortAscending, in.ArchFlagFetch);
      if (map != null) record.put ("ArchFlag", map);
      map = DataHelper.filterToMap (in.AvailPeriods, in.AvailPeriodsSort, in.AvailPeriodsSortAscending, in.AvailPeriodsFetch);
      if (map != null) record.put ("AvailPeriods", map);
      map = DataHelper.filterToMap (in.FirstUseDt, in.FirstUseDtSort, in.FirstUseDtSortAscending, in.FirstUseDtFetch);
      if (map != null) record.put ("FirstUseDt", map);
      map = DataHelper.filterToMap (in.LastUseDt, in.LastUseDtSort, in.LastUseDtSortAscending, in.LastUseDtFetch);
      if (map != null) record.put ("LastUseDt", map);
      map = DataHelper.filterToMap (in.CommitmentAmount, in.CommitmentAmountSort, in.CommitmentAmountSortAscending, in.CommitmentAmountFetch);
      if (map != null) record.put ("CommitmentAmount", map);
      map = DataHelper.filterToMap (in.CommitmentCurrencyCode, in.CommitmentCurrencyCodeSort, in.CommitmentCurrencyCodeSortAscending, in.CommitmentCurrencyCodeFetch);
      if (map != null) record.put ("CommitmentCurrencyCode", map);
      map = DataHelper.filterToMap (in.TotalSavingsAmount, in.TotalSavingsAmountSort, in.TotalSavingsAmountSortAscending, in.TotalSavingsAmountFetch);
      if (map != null) record.put ("TotalSavingsAmount", map);
      map = DataHelper.filterToMap (in.TotalElementAmount, in.TotalElementAmountSort, in.TotalElementAmountSortAscending, in.TotalElementAmountFetch);
      if (map != null) record.put ("TotalElementAmount", map);
      map = DataHelper.filterToMap (in.PrevEvalDate, in.PrevEvalDateSort, in.PrevEvalDateSortAscending, in.PrevEvalDateFetch);
      if (map != null) record.put ("PrevEvalDate", map);
      map = DataHelper.filterToMap (in.NextEvalDate, in.NextEvalDateSort, in.NextEvalDateSortAscending, in.NextEvalDateFetch);
      if (map != null) record.put ("NextEvalDate", map);
      map = DataHelper.filterToMap (in.ViewStatus, in.ViewStatusSort, in.ViewStatusSortAscending, in.ViewStatusFetch);
      if (map != null) record.put ("ViewStatus", map);
      map = DataHelper.filterToMap (in.ViewCreatedDt, in.ViewCreatedDtSort, in.ViewCreatedDtSortAscending, in.ViewCreatedDtFetch);
      if (map != null) record.put ("ViewCreatedDt", map);
      map = DataHelper.filterToMap (in.ViewEffectiveDt, in.ViewEffectiveDtSort, in.ViewEffectiveDtSortAscending, in.ViewEffectiveDtFetch);
      if (map != null) record.put ("ViewEffectiveDt", map);
      map = DataHelper.filterToMap (in.IntendedViewEffectiveDt, in.IntendedViewEffectiveDtSort, in.IntendedViewEffectiveDtSortAscending, in.IntendedViewEffectiveDtFetch);
      if (map != null) record.put ("IntendedViewEffectiveDt", map);
      map = DataHelper.filterToMap (in.PrevViewId, in.PrevViewIdSort, in.PrevViewIdSortAscending, in.PrevViewIdFetch);
      if (map != null) record.put ("PrevViewId", map);
      map = DataHelper.filterToMap (in.ContractType, in.ContractTypeSort, in.ContractTypeSortAscending, in.ContractTypeFetch);
      if (map != null) record.put ("ContractType", map);
      map = DataHelper.filterToMap (in.ContractId, in.ContractIdSort, in.ContractIdSortAscending, in.ContractIdFetch, in.ContractIdCaseInsensitive);
      if (map != null) record.put ("ContractId", map);
      map = DataHelper.filterToMap (in.ParentGroupNo, in.ParentGroupNoSort, in.ParentGroupNoSortAscending, in.ParentGroupNoFetch);
      if (map != null) record.put ("ParentGroupNo", map);
      map = DataHelper.filterToMap (in.StartDt, in.StartDtSort, in.StartDtSortAscending, in.StartDtFetch);
      if (map != null) record.put ("StartDt", map);
      map = DataHelper.filterToMap (in.EndDt, in.EndDtSort, in.EndDtSortAscending, in.EndDtFetch);
      if (map != null) record.put ("EndDt", map);
      map = DataHelper.filterToMap (in.PrevEndDt, in.PrevEndDtSort, in.PrevEndDtSortAscending, in.PrevEndDtFetch);
      if (map != null) record.put ("PrevEndDt", map);
      map = DataHelper.filterToMap (in.GracePeriod, in.GracePeriodSort, in.GracePeriodSortAscending, in.GracePeriodFetch);
      if (map != null) record.put ("GracePeriod", map);
      map = DataHelper.filterToMap (in.TotalPeriods, in.TotalPeriodsSort, in.TotalPeriodsSortAscending, in.TotalPeriodsFetch);
      if (map != null) record.put ("TotalPeriods", map);
      map = DataHelper.filterToMap (in.SalesChannelId, in.SalesChannelIdSort, in.SalesChannelIdSortAscending, in.SalesChannelIdFetch);
      if (map != null) record.put ("SalesChannelId", map);
      map = DataHelper.filterToMap (in.TrackTotalAmounts, in.TrackTotalAmountsSort, in.TrackTotalAmountsSortAscending, in.TrackTotalAmountsFetch);
      if (map != null) record.put ("TrackTotalAmounts", map);
      map = DataHelper.filterToMap (in.RolloverPeriod, in.RolloverPeriodSort, in.RolloverPeriodSortAscending, in.RolloverPeriodFetch);
      if (map != null) record.put ("RolloverPeriod", map);
      map = DataHelper.filterToMap (in.RolloverPeriodStart, in.RolloverPeriodStartSort, in.RolloverPeriodStartSortAscending, in.RolloverPeriodStartFetch);
      if (map != null) record.put ("RolloverPeriodStart", map);
      map = DataHelper.filterToMap (in.BillPeriod, in.BillPeriodSort, in.BillPeriodSortAscending, in.BillPeriodFetch, in.BillPeriodCaseInsensitive);
      if (map != null) record.put ("BillPeriod", map);
      map = DataHelper.filterToMap (in.DistributePayback, in.DistributePaybackSort, in.DistributePaybackSortAscending, in.DistributePaybackFetch);
      if (map != null) record.put ("DistributePayback", map);
      map = DataHelper.filterToMap (in.ProrateContractStrtOverride, in.ProrateContractStrtOverrideSort, in.ProrateContractStrtOverrideSortAscending, in.ProrateContractStrtOverrideFetch);
      if (map != null) record.put ("ProrateContractStrtOverride", map);
      map = DataHelper.filterToMap (in.ProrateContractEndOverride, in.ProrateContractEndOverrideSort, in.ProrateContractEndOverrideSortAscending, in.ProrateContractEndOverrideFetch);
      if (map != null) record.put ("ProrateContractEndOverride", map);
      map = DataHelper.filterToMap (in.ProrateInterimBillOverride, in.ProrateInterimBillOverrideSort, in.ProrateInterimBillOverrideSortAscending, in.ProrateInterimBillOverrideFetch);
      if (map != null) record.put ("ProrateInterimBillOverride", map);
      map = DataHelper.filterToMap (in.ProratePeriodChangeOverride, in.ProratePeriodChangeOverrideSort, in.ProratePeriodChangeOverrideSortAscending, in.ProratePeriodChangeOverrideFetch);
      if (map != null) record.put ("ProratePeriodChangeOverride", map);
      map = DataHelper.filterToMap (in.ProrateAccountStartOverride, in.ProrateAccountStartOverrideSort, in.ProrateAccountStartOverrideSortAscending, in.ProrateAccountStartOverrideFetch);
      if (map != null) record.put ("ProrateAccountStartOverride", map);
      map = DataHelper.filterToMap (in.ProrateAccountEndOverride, in.ProrateAccountEndOverrideSort, in.ProrateAccountEndOverrideSortAscending, in.ProrateAccountEndOverrideFetch);
      if (map != null) record.put ("ProrateAccountEndOverride", map);
      map = DataHelper.filterToMap (in.ProrateTgtThresholdOverride, in.ProrateTgtThresholdOverrideSort, in.ProrateTgtThresholdOverrideSortAscending, in.ProrateTgtThresholdOverrideFetch);
      if (map != null) record.put ("ProrateTgtThresholdOverride", map);
      map = DataHelper.filterToMap (in.ProrateTgtRebatesOverride, in.ProrateTgtRebatesOverrideSort, in.ProrateTgtRebatesOverrideSortAscending, in.ProrateTgtRebatesOverrideFetch);
      if (map != null) record.put ("ProrateTgtRebatesOverride", map);
      map = DataHelper.filterToMap (in.StartByDt, in.StartByDtSort, in.StartByDtSortAscending, in.StartByDtFetch);
      if (map != null) record.put ("StartByDt", map);
      map = DataHelper.filterToMap (in.NoticeEndDt, in.NoticeEndDtSort, in.NoticeEndDtSortAscending, in.NoticeEndDtFetch);
      if (map != null) record.put ("NoticeEndDt", map);
      map = DataHelper.filterToMap (in.DurationOverride, in.DurationOverrideSort, in.DurationOverrideSortAscending, in.DurationOverrideFetch);
      if (map != null) record.put ("DurationOverride", map);
      map = DataHelper.filterToMap (in.NoticeOverride, in.NoticeOverrideSort, in.NoticeOverrideSortAscending, in.NoticeOverrideFetch);
      if (map != null) record.put ("NoticeOverride", map);
      map = DataHelper.filterToMap (in.IsPartOfComponent, in.IsPartOfComponentSort, in.IsPartOfComponentSortAscending, in.IsPartOfComponentFetch);
      if (map != null) record.put ("IsPartOfComponent", map);
      map = DataHelper.filterToMap (in.ElementId, in.ElementIdSort, in.ElementIdSortAscending, in.ElementIdFetch);
      if (map != null) record.put ("ElementId", map);
      map = DataHelper.filterToMap (in.CommitmentReference, in.CommitmentReferenceSort, in.CommitmentReferenceSortAscending, in.CommitmentReferenceFetch);
      if (map != null) record.put ("CommitmentReference", map);
      map = DataHelper.filterToMap (in.MinDurationDate, in.MinDurationDateSort, in.MinDurationDateSortAscending, in.MinDurationDateFetch);
      if (map != null) record.put ("MinDurationDate", map);
      map = DataHelper.filterToMap (in.MinNoticeDate, in.MinNoticeDateSort, in.MinNoticeDateSortAscending, in.MinNoticeDateFetch);
      if (map != null) record.put ("MinNoticeDate", map);
      map = DataHelper.filterToMap (in.IsCustom, in.IsCustomSort, in.IsCustomSortAscending, in.IsCustomFetch);
      if (map != null) record.put ("IsCustom", map);    if (in.extendedDataFilter != null && in.extendedDataFilter.size () > 0)
    {
      Iterator iter = in.extendedDataFilter.entrySet ().iterator ();
      int i = 0;
      list = new Object[in.extendedDataFilter.size ()];

      while (iter.hasNext ())
      {
        Map edmap = new HashMap ();
        Map.Entry entry = (Map.Entry) iter.next ();
        edmap.put ("ParamId", entry.getKey ());
        edmap.put ("ParamValue", entry.getValue ());
        edmap.put ("#NAME", "ExtendedDataParam");
        list[i++] = edmap;
      }
      record.put ("ExtendedData", list);
    }
   
    return record;
  }
  /** convert Map to GlobalContractObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalContractObjectData the converted object
   */
  public static GlobalContractObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalContractObjectData out = new GlobalContractObjectData ();

    out.Key = GlobalContractObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("TrackingId")) != null)
    {
      out.TrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("TrackingIdServ")) != null)
    {
      out.TrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("CreateDt")) != null)
    {
      out.CreateDt = (Date) obj;
    }
  
    if ((obj = record.get ("InUse")) != null)
    {
      out.InUse = (String) obj;
    }
  
    if ((obj = record.get ("ArchFlag")) != null)
    {
      out.ArchFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("AvailPeriods")) != null)
    {
      out.AvailPeriods = (Integer) obj;
    }
  
    if ((obj = record.get ("FirstUseDt")) != null)
    {
      out.FirstUseDt = (Date) obj;
    }
  
    if ((obj = record.get ("LastUseDt")) != null)
    {
      out.LastUseDt = (Date) obj;
    }
  
    if ((obj = record.get ("CommitmentAmount")) != null)
    {
      out.CommitmentAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CommitmentCurrencyCode")) != null)
    {
      out.CommitmentCurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("TotalSavingsAmount")) != null)
    {
      out.TotalSavingsAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TotalElementAmount")) != null)
    {
      out.TotalElementAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PrevEvalDate")) != null)
    {
      out.PrevEvalDate = (Date) obj;
    }
  
    if ((obj = record.get ("NextEvalDate")) != null)
    {
      out.NextEvalDate = (Date) obj;
    }
  
    if ((obj = record.get ("ViewStatus")) != null)
    {
      out.ViewStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("ViewCreatedDt")) != null)
    {
      out.ViewCreatedDt = (Date) obj;
    }
  
    if ((obj = record.get ("ViewEffectiveDt")) != null)
    {
      out.ViewEffectiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("IntendedViewEffectiveDt")) != null)
    {
      out.IntendedViewEffectiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("PrevViewId")) != null)
    {
      out.PrevViewId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ContractType")) != null)
    {
      out.ContractType = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractId")) != null)
    {
      out.ContractId = (String) obj;
    }
  
    if ((obj = record.get ("ParentGroupNo")) != null)
    {
      out.ParentGroupNo = (Integer) obj;
    }
  
    if ((obj = record.get ("StartDt")) != null)
    {
      out.StartDt = (Date) obj;
    }
  
    if ((obj = record.get ("EndDt")) != null)
    {
      out.EndDt = (Date) obj;
    }
  
    if ((obj = record.get ("PrevEndDt")) != null)
    {
      out.PrevEndDt = (Date) obj;
    }
  
    if ((obj = record.get ("GracePeriod")) != null)
    {
      out.GracePeriod = (Integer) obj;
    }
  
    if ((obj = record.get ("TotalPeriods")) != null)
    {
      out.TotalPeriods = (Integer) obj;
    }
  
    if ((obj = record.get ("SalesChannelId")) != null)
    {
      out.SalesChannelId = (Integer) obj;
    }
  
    if ((obj = record.get ("TrackTotalAmounts")) != null)
    {
      out.TrackTotalAmounts = (Boolean) obj;
    }
  
    if ((obj = record.get ("RolloverPeriod")) != null)
    {
      out.RolloverPeriod = (Integer) obj;
    }
  
    if ((obj = record.get ("RolloverPeriodStart")) != null)
    {
      out.RolloverPeriodStart = (Integer) obj;
    }
  
    if ((obj = record.get ("BillPeriod")) != null)
    {
      out.BillPeriod = (String) obj;
    }
  
    if ((obj = record.get ("DistributePayback")) != null)
    {
      out.DistributePayback = (Boolean) obj;
    }
  
    if ((obj = record.get ("ProrateContractStrtOverride")) != null)
    {
      out.ProrateContractStrtOverride = (Integer) obj;
    }
  
    if ((obj = record.get ("ProrateContractEndOverride")) != null)
    {
      out.ProrateContractEndOverride = (Integer) obj;
    }
  
    if ((obj = record.get ("ProrateInterimBillOverride")) != null)
    {
      out.ProrateInterimBillOverride = (Integer) obj;
    }
  
    if ((obj = record.get ("ProratePeriodChangeOverride")) != null)
    {
      out.ProratePeriodChangeOverride = (Integer) obj;
    }
  
    if ((obj = record.get ("ProrateAccountStartOverride")) != null)
    {
      out.ProrateAccountStartOverride = (Integer) obj;
    }
  
    if ((obj = record.get ("ProrateAccountEndOverride")) != null)
    {
      out.ProrateAccountEndOverride = (Integer) obj;
    }
  
    if ((obj = record.get ("ProrateTgtThresholdOverride")) != null)
    {
      out.ProrateTgtThresholdOverride = (Integer) obj;
    }
  
    if ((obj = record.get ("ProrateTgtRebatesOverride")) != null)
    {
      out.ProrateTgtRebatesOverride = (Integer) obj;
    }
  
    if ((obj = record.get ("StartByDt")) != null)
    {
      out.StartByDt = (Date) obj;
    }
  
    if ((obj = record.get ("NoticeEndDt")) != null)
    {
      out.NoticeEndDt = (Date) obj;
    }
  
    if ((obj = record.get ("DurationOverride")) != null)
    {
      out.DurationOverride = (Boolean) obj;
    }
  
    if ((obj = record.get ("NoticeOverride")) != null)
    {
      out.NoticeOverride = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsPartOfComponent")) != null)
    {
      out.IsPartOfComponent = (Boolean) obj;
    }
  
    if ((obj = record.get ("ElementId")) != null)
    {
      out.ElementId = (Integer) obj;
    }
  
    if ((obj = record.get ("CommitmentReference")) != null)
    {
      out.CommitmentReference = (Integer) obj;
    }
  
    if ((obj = record.get ("MinDurationDate")) != null)
    {
      out.MinDurationDate = (Date) obj;
    }
  
    if ((obj = record.get ("MinNoticeDate")) != null)
    {
      out.MinNoticeDate = (Date) obj;
    }
  
    if ((obj = record.get ("IsCustom")) != null)
    {
      out.IsCustom = (Integer) obj;
    }
      list = (Object[]) record.get ("ExtendedData");
    out.extendedData = new HashMap ();
    for (int i = 0; list != null && i < list.length; i++)
    {
      Map edmap = (Map) list[i];
      if (edmap != null) out.extendedData.put (edmap.get ("ParamId"), edmap.get ("ParamValue"));
    }
    return out;
  }
  /** convert Map to GlobalContractObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalContractObjectFilter the converted object
   */
  public static GlobalContractObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalContractObjectFilter out = new GlobalContractObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = GlobalContractObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map TrackingIdMap = (Map)record.get("TrackingId");
    Boolean TrackingIdFetch = DataHelper.getFetch(TrackingIdMap);
    Boolean TrackingIdSortDir = DataHelper.getSortDirection(TrackingIdMap);
    Integer TrackingIdSortOrder = DataHelper.getSortOrder(TrackingIdMap);
    if (TrackingIdFetch != null) out.setTrackingIdFetch(TrackingIdFetch);
    if (TrackingIdSortDir != null) out.setTrackingIdSortDirection(TrackingIdSortDir);
    if (TrackingIdSortOrder != null) out.setTrackingIdSortOrder(TrackingIdSortOrder);

    Filter[] TrackingIdFilter = DataHelper.mapToFilterArray(TrackingIdMap, Integer.class);
    if (TrackingIdFilter != null) {
      IntegerFilter[] TrackingIdFilters = new IntegerFilter[TrackingIdFilter.length];
      for (int i = 0; i < TrackingIdFilters.length; i++) {
        TrackingIdFilters[i] = (IntegerFilter)TrackingIdFilter[i];
      }
      try {
        out.setTrackingIdFilter(TrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TrackingIdServMap = (Map)record.get("TrackingIdServ");
    Boolean TrackingIdServFetch = DataHelper.getFetch(TrackingIdServMap);
    Boolean TrackingIdServSortDir = DataHelper.getSortDirection(TrackingIdServMap);
    Integer TrackingIdServSortOrder = DataHelper.getSortOrder(TrackingIdServMap);
    if (TrackingIdServFetch != null) out.setTrackingIdServFetch(TrackingIdServFetch);
    if (TrackingIdServSortDir != null) out.setTrackingIdServSortDirection(TrackingIdServSortDir);
    if (TrackingIdServSortOrder != null) out.setTrackingIdServSortOrder(TrackingIdServSortOrder);

    Filter[] TrackingIdServFilter = DataHelper.mapToFilterArray(TrackingIdServMap, Integer.class);
    if (TrackingIdServFilter != null) {
      IntegerFilter[] TrackingIdServFilters = new IntegerFilter[TrackingIdServFilter.length];
      for (int i = 0; i < TrackingIdServFilters.length; i++) {
        TrackingIdServFilters[i] = (IntegerFilter)TrackingIdServFilter[i];
      }
      try {
        out.setTrackingIdServFilter(TrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CreateDtMap = (Map)record.get("CreateDt");
    Boolean CreateDtFetch = DataHelper.getFetch(CreateDtMap);
    Boolean CreateDtSortDir = DataHelper.getSortDirection(CreateDtMap);
    Integer CreateDtSortOrder = DataHelper.getSortOrder(CreateDtMap);
    if (CreateDtFetch != null) out.setCreateDtFetch(CreateDtFetch);
    if (CreateDtSortDir != null) out.setCreateDtSortDirection(CreateDtSortDir);
    if (CreateDtSortOrder != null) out.setCreateDtSortOrder(CreateDtSortOrder);

    Filter[] CreateDtFilter = DataHelper.mapToFilterArray(CreateDtMap, Date.class);
    if (CreateDtFilter != null) {
      DateFilter[] CreateDtFilters = new DateFilter[CreateDtFilter.length];
      for (int i = 0; i < CreateDtFilters.length; i++) {
        CreateDtFilters[i] = (DateFilter)CreateDtFilter[i];
      }
      try {
        out.setCreateDtFilter(CreateDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InUseMap = (Map)record.get("InUse");
    Boolean InUseFetch = DataHelper.getFetch(InUseMap);
    Boolean InUseSortDir = DataHelper.getSortDirection(InUseMap);
    Integer InUseSortOrder = DataHelper.getSortOrder(InUseMap);
    if (InUseFetch != null) out.setInUseFetch(InUseFetch);
    if (InUseSortDir != null) out.setInUseSortDirection(InUseSortDir);
    if (InUseSortOrder != null) out.setInUseSortOrder(InUseSortOrder);

    Filter[] InUseFilter = DataHelper.mapToFilterArray(InUseMap, String.class);
    if (InUseFilter != null) {
      StringFilter[] InUseFilters = new StringFilter[InUseFilter.length];
      for (int i = 0; i < InUseFilters.length; i++) {
        InUseFilters[i] = (StringFilter)InUseFilter[i];
      }
      try {
        out.setInUseFilter(InUseFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ArchFlagMap = (Map)record.get("ArchFlag");
    Boolean ArchFlagFetch = DataHelper.getFetch(ArchFlagMap);
    Boolean ArchFlagSortDir = DataHelper.getSortDirection(ArchFlagMap);
    Integer ArchFlagSortOrder = DataHelper.getSortOrder(ArchFlagMap);
    if (ArchFlagFetch != null) out.setArchFlagFetch(ArchFlagFetch);
    if (ArchFlagSortDir != null) out.setArchFlagSortDirection(ArchFlagSortDir);
    if (ArchFlagSortOrder != null) out.setArchFlagSortOrder(ArchFlagSortOrder);

    Filter[] ArchFlagFilter = DataHelper.mapToFilterArray(ArchFlagMap, Boolean.class);
    if (ArchFlagFilter != null) {
      BooleanFilter[] ArchFlagFilters = new BooleanFilter[ArchFlagFilter.length];
      for (int i = 0; i < ArchFlagFilters.length; i++) {
        ArchFlagFilters[i] = (BooleanFilter)ArchFlagFilter[i];
      }
      try {
        out.setArchFlagFilter(ArchFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AvailPeriodsMap = (Map)record.get("AvailPeriods");
    Boolean AvailPeriodsFetch = DataHelper.getFetch(AvailPeriodsMap);
    Boolean AvailPeriodsSortDir = DataHelper.getSortDirection(AvailPeriodsMap);
    Integer AvailPeriodsSortOrder = DataHelper.getSortOrder(AvailPeriodsMap);
    if (AvailPeriodsFetch != null) out.setAvailPeriodsFetch(AvailPeriodsFetch);
    if (AvailPeriodsSortDir != null) out.setAvailPeriodsSortDirection(AvailPeriodsSortDir);
    if (AvailPeriodsSortOrder != null) out.setAvailPeriodsSortOrder(AvailPeriodsSortOrder);

    Filter[] AvailPeriodsFilter = DataHelper.mapToFilterArray(AvailPeriodsMap, Integer.class);
    if (AvailPeriodsFilter != null) {
      IntegerFilter[] AvailPeriodsFilters = new IntegerFilter[AvailPeriodsFilter.length];
      for (int i = 0; i < AvailPeriodsFilters.length; i++) {
        AvailPeriodsFilters[i] = (IntegerFilter)AvailPeriodsFilter[i];
      }
      try {
        out.setAvailPeriodsFilter(AvailPeriodsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FirstUseDtMap = (Map)record.get("FirstUseDt");
    Boolean FirstUseDtFetch = DataHelper.getFetch(FirstUseDtMap);
    Boolean FirstUseDtSortDir = DataHelper.getSortDirection(FirstUseDtMap);
    Integer FirstUseDtSortOrder = DataHelper.getSortOrder(FirstUseDtMap);
    if (FirstUseDtFetch != null) out.setFirstUseDtFetch(FirstUseDtFetch);
    if (FirstUseDtSortDir != null) out.setFirstUseDtSortDirection(FirstUseDtSortDir);
    if (FirstUseDtSortOrder != null) out.setFirstUseDtSortOrder(FirstUseDtSortOrder);

    Filter[] FirstUseDtFilter = DataHelper.mapToFilterArray(FirstUseDtMap, Date.class);
    if (FirstUseDtFilter != null) {
      DateFilter[] FirstUseDtFilters = new DateFilter[FirstUseDtFilter.length];
      for (int i = 0; i < FirstUseDtFilters.length; i++) {
        FirstUseDtFilters[i] = (DateFilter)FirstUseDtFilter[i];
      }
      try {
        out.setFirstUseDtFilter(FirstUseDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LastUseDtMap = (Map)record.get("LastUseDt");
    Boolean LastUseDtFetch = DataHelper.getFetch(LastUseDtMap);
    Boolean LastUseDtSortDir = DataHelper.getSortDirection(LastUseDtMap);
    Integer LastUseDtSortOrder = DataHelper.getSortOrder(LastUseDtMap);
    if (LastUseDtFetch != null) out.setLastUseDtFetch(LastUseDtFetch);
    if (LastUseDtSortDir != null) out.setLastUseDtSortDirection(LastUseDtSortDir);
    if (LastUseDtSortOrder != null) out.setLastUseDtSortOrder(LastUseDtSortOrder);

    Filter[] LastUseDtFilter = DataHelper.mapToFilterArray(LastUseDtMap, Date.class);
    if (LastUseDtFilter != null) {
      DateFilter[] LastUseDtFilters = new DateFilter[LastUseDtFilter.length];
      for (int i = 0; i < LastUseDtFilters.length; i++) {
        LastUseDtFilters[i] = (DateFilter)LastUseDtFilter[i];
      }
      try {
        out.setLastUseDtFilter(LastUseDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CommitmentAmountMap = (Map)record.get("CommitmentAmount");
    Boolean CommitmentAmountFetch = DataHelper.getFetch(CommitmentAmountMap);
    Boolean CommitmentAmountSortDir = DataHelper.getSortDirection(CommitmentAmountMap);
    Integer CommitmentAmountSortOrder = DataHelper.getSortOrder(CommitmentAmountMap);
    if (CommitmentAmountFetch != null) out.setCommitmentAmountFetch(CommitmentAmountFetch);
    if (CommitmentAmountSortDir != null) out.setCommitmentAmountSortDirection(CommitmentAmountSortDir);
    if (CommitmentAmountSortOrder != null) out.setCommitmentAmountSortOrder(CommitmentAmountSortOrder);

    Filter[] CommitmentAmountFilter = DataHelper.mapToFilterArray(CommitmentAmountMap, BigInteger.class);
    if (CommitmentAmountFilter != null) {
      BigIntegerFilter[] CommitmentAmountFilters = new BigIntegerFilter[CommitmentAmountFilter.length];
      for (int i = 0; i < CommitmentAmountFilters.length; i++) {
        CommitmentAmountFilters[i] = (BigIntegerFilter)CommitmentAmountFilter[i];
      }
      try {
        out.setCommitmentAmountFilter(CommitmentAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CommitmentCurrencyCodeMap = (Map)record.get("CommitmentCurrencyCode");
    Boolean CommitmentCurrencyCodeFetch = DataHelper.getFetch(CommitmentCurrencyCodeMap);
    Boolean CommitmentCurrencyCodeSortDir = DataHelper.getSortDirection(CommitmentCurrencyCodeMap);
    Integer CommitmentCurrencyCodeSortOrder = DataHelper.getSortOrder(CommitmentCurrencyCodeMap);
    if (CommitmentCurrencyCodeFetch != null) out.setCommitmentCurrencyCodeFetch(CommitmentCurrencyCodeFetch);
    if (CommitmentCurrencyCodeSortDir != null) out.setCommitmentCurrencyCodeSortDirection(CommitmentCurrencyCodeSortDir);
    if (CommitmentCurrencyCodeSortOrder != null) out.setCommitmentCurrencyCodeSortOrder(CommitmentCurrencyCodeSortOrder);

    Filter[] CommitmentCurrencyCodeFilter = DataHelper.mapToFilterArray(CommitmentCurrencyCodeMap, Integer.class);
    if (CommitmentCurrencyCodeFilter != null) {
      IntegerFilter[] CommitmentCurrencyCodeFilters = new IntegerFilter[CommitmentCurrencyCodeFilter.length];
      for (int i = 0; i < CommitmentCurrencyCodeFilters.length; i++) {
        CommitmentCurrencyCodeFilters[i] = (IntegerFilter)CommitmentCurrencyCodeFilter[i];
      }
      try {
        out.setCommitmentCurrencyCodeFilter(CommitmentCurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalSavingsAmountMap = (Map)record.get("TotalSavingsAmount");
    Boolean TotalSavingsAmountFetch = DataHelper.getFetch(TotalSavingsAmountMap);
    Boolean TotalSavingsAmountSortDir = DataHelper.getSortDirection(TotalSavingsAmountMap);
    Integer TotalSavingsAmountSortOrder = DataHelper.getSortOrder(TotalSavingsAmountMap);
    if (TotalSavingsAmountFetch != null) out.setTotalSavingsAmountFetch(TotalSavingsAmountFetch);
    if (TotalSavingsAmountSortDir != null) out.setTotalSavingsAmountSortDirection(TotalSavingsAmountSortDir);
    if (TotalSavingsAmountSortOrder != null) out.setTotalSavingsAmountSortOrder(TotalSavingsAmountSortOrder);

    Filter[] TotalSavingsAmountFilter = DataHelper.mapToFilterArray(TotalSavingsAmountMap, BigInteger.class);
    if (TotalSavingsAmountFilter != null) {
      BigIntegerFilter[] TotalSavingsAmountFilters = new BigIntegerFilter[TotalSavingsAmountFilter.length];
      for (int i = 0; i < TotalSavingsAmountFilters.length; i++) {
        TotalSavingsAmountFilters[i] = (BigIntegerFilter)TotalSavingsAmountFilter[i];
      }
      try {
        out.setTotalSavingsAmountFilter(TotalSavingsAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalElementAmountMap = (Map)record.get("TotalElementAmount");
    Boolean TotalElementAmountFetch = DataHelper.getFetch(TotalElementAmountMap);
    Boolean TotalElementAmountSortDir = DataHelper.getSortDirection(TotalElementAmountMap);
    Integer TotalElementAmountSortOrder = DataHelper.getSortOrder(TotalElementAmountMap);
    if (TotalElementAmountFetch != null) out.setTotalElementAmountFetch(TotalElementAmountFetch);
    if (TotalElementAmountSortDir != null) out.setTotalElementAmountSortDirection(TotalElementAmountSortDir);
    if (TotalElementAmountSortOrder != null) out.setTotalElementAmountSortOrder(TotalElementAmountSortOrder);

    Filter[] TotalElementAmountFilter = DataHelper.mapToFilterArray(TotalElementAmountMap, BigInteger.class);
    if (TotalElementAmountFilter != null) {
      BigIntegerFilter[] TotalElementAmountFilters = new BigIntegerFilter[TotalElementAmountFilter.length];
      for (int i = 0; i < TotalElementAmountFilters.length; i++) {
        TotalElementAmountFilters[i] = (BigIntegerFilter)TotalElementAmountFilter[i];
      }
      try {
        out.setTotalElementAmountFilter(TotalElementAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevEvalDateMap = (Map)record.get("PrevEvalDate");
    Boolean PrevEvalDateFetch = DataHelper.getFetch(PrevEvalDateMap);
    Boolean PrevEvalDateSortDir = DataHelper.getSortDirection(PrevEvalDateMap);
    Integer PrevEvalDateSortOrder = DataHelper.getSortOrder(PrevEvalDateMap);
    if (PrevEvalDateFetch != null) out.setPrevEvalDateFetch(PrevEvalDateFetch);
    if (PrevEvalDateSortDir != null) out.setPrevEvalDateSortDirection(PrevEvalDateSortDir);
    if (PrevEvalDateSortOrder != null) out.setPrevEvalDateSortOrder(PrevEvalDateSortOrder);

    Filter[] PrevEvalDateFilter = DataHelper.mapToFilterArray(PrevEvalDateMap, Date.class);
    if (PrevEvalDateFilter != null) {
      DateFilter[] PrevEvalDateFilters = new DateFilter[PrevEvalDateFilter.length];
      for (int i = 0; i < PrevEvalDateFilters.length; i++) {
        PrevEvalDateFilters[i] = (DateFilter)PrevEvalDateFilter[i];
      }
      try {
        out.setPrevEvalDateFilter(PrevEvalDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NextEvalDateMap = (Map)record.get("NextEvalDate");
    Boolean NextEvalDateFetch = DataHelper.getFetch(NextEvalDateMap);
    Boolean NextEvalDateSortDir = DataHelper.getSortDirection(NextEvalDateMap);
    Integer NextEvalDateSortOrder = DataHelper.getSortOrder(NextEvalDateMap);
    if (NextEvalDateFetch != null) out.setNextEvalDateFetch(NextEvalDateFetch);
    if (NextEvalDateSortDir != null) out.setNextEvalDateSortDirection(NextEvalDateSortDir);
    if (NextEvalDateSortOrder != null) out.setNextEvalDateSortOrder(NextEvalDateSortOrder);

    Filter[] NextEvalDateFilter = DataHelper.mapToFilterArray(NextEvalDateMap, Date.class);
    if (NextEvalDateFilter != null) {
      DateFilter[] NextEvalDateFilters = new DateFilter[NextEvalDateFilter.length];
      for (int i = 0; i < NextEvalDateFilters.length; i++) {
        NextEvalDateFilters[i] = (DateFilter)NextEvalDateFilter[i];
      }
      try {
        out.setNextEvalDateFilter(NextEvalDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ViewStatusMap = (Map)record.get("ViewStatus");
    Boolean ViewStatusFetch = DataHelper.getFetch(ViewStatusMap);
    Boolean ViewStatusSortDir = DataHelper.getSortDirection(ViewStatusMap);
    Integer ViewStatusSortOrder = DataHelper.getSortOrder(ViewStatusMap);
    if (ViewStatusFetch != null) out.setViewStatusFetch(ViewStatusFetch);
    if (ViewStatusSortDir != null) out.setViewStatusSortDirection(ViewStatusSortDir);
    if (ViewStatusSortOrder != null) out.setViewStatusSortOrder(ViewStatusSortOrder);

    Filter[] ViewStatusFilter = DataHelper.mapToFilterArray(ViewStatusMap, Integer.class);
    if (ViewStatusFilter != null) {
      IntegerFilter[] ViewStatusFilters = new IntegerFilter[ViewStatusFilter.length];
      for (int i = 0; i < ViewStatusFilters.length; i++) {
        ViewStatusFilters[i] = (IntegerFilter)ViewStatusFilter[i];
      }
      try {
        out.setViewStatusFilter(ViewStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ViewCreatedDtMap = (Map)record.get("ViewCreatedDt");
    Boolean ViewCreatedDtFetch = DataHelper.getFetch(ViewCreatedDtMap);
    Boolean ViewCreatedDtSortDir = DataHelper.getSortDirection(ViewCreatedDtMap);
    Integer ViewCreatedDtSortOrder = DataHelper.getSortOrder(ViewCreatedDtMap);
    if (ViewCreatedDtFetch != null) out.setViewCreatedDtFetch(ViewCreatedDtFetch);
    if (ViewCreatedDtSortDir != null) out.setViewCreatedDtSortDirection(ViewCreatedDtSortDir);
    if (ViewCreatedDtSortOrder != null) out.setViewCreatedDtSortOrder(ViewCreatedDtSortOrder);

    Filter[] ViewCreatedDtFilter = DataHelper.mapToFilterArray(ViewCreatedDtMap, Date.class);
    if (ViewCreatedDtFilter != null) {
      DateFilter[] ViewCreatedDtFilters = new DateFilter[ViewCreatedDtFilter.length];
      for (int i = 0; i < ViewCreatedDtFilters.length; i++) {
        ViewCreatedDtFilters[i] = (DateFilter)ViewCreatedDtFilter[i];
      }
      try {
        out.setViewCreatedDtFilter(ViewCreatedDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ViewEffectiveDtMap = (Map)record.get("ViewEffectiveDt");
    Boolean ViewEffectiveDtFetch = DataHelper.getFetch(ViewEffectiveDtMap);
    Boolean ViewEffectiveDtSortDir = DataHelper.getSortDirection(ViewEffectiveDtMap);
    Integer ViewEffectiveDtSortOrder = DataHelper.getSortOrder(ViewEffectiveDtMap);
    if (ViewEffectiveDtFetch != null) out.setViewEffectiveDtFetch(ViewEffectiveDtFetch);
    if (ViewEffectiveDtSortDir != null) out.setViewEffectiveDtSortDirection(ViewEffectiveDtSortDir);
    if (ViewEffectiveDtSortOrder != null) out.setViewEffectiveDtSortOrder(ViewEffectiveDtSortOrder);

    Filter[] ViewEffectiveDtFilter = DataHelper.mapToFilterArray(ViewEffectiveDtMap, Date.class);
    if (ViewEffectiveDtFilter != null) {
      DateFilter[] ViewEffectiveDtFilters = new DateFilter[ViewEffectiveDtFilter.length];
      for (int i = 0; i < ViewEffectiveDtFilters.length; i++) {
        ViewEffectiveDtFilters[i] = (DateFilter)ViewEffectiveDtFilter[i];
      }
      try {
        out.setViewEffectiveDtFilter(ViewEffectiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IntendedViewEffectiveDtMap = (Map)record.get("IntendedViewEffectiveDt");
    Boolean IntendedViewEffectiveDtFetch = DataHelper.getFetch(IntendedViewEffectiveDtMap);
    Boolean IntendedViewEffectiveDtSortDir = DataHelper.getSortDirection(IntendedViewEffectiveDtMap);
    Integer IntendedViewEffectiveDtSortOrder = DataHelper.getSortOrder(IntendedViewEffectiveDtMap);
    if (IntendedViewEffectiveDtFetch != null) out.setIntendedViewEffectiveDtFetch(IntendedViewEffectiveDtFetch);
    if (IntendedViewEffectiveDtSortDir != null) out.setIntendedViewEffectiveDtSortDirection(IntendedViewEffectiveDtSortDir);
    if (IntendedViewEffectiveDtSortOrder != null) out.setIntendedViewEffectiveDtSortOrder(IntendedViewEffectiveDtSortOrder);

    Filter[] IntendedViewEffectiveDtFilter = DataHelper.mapToFilterArray(IntendedViewEffectiveDtMap, Date.class);
    if (IntendedViewEffectiveDtFilter != null) {
      DateFilter[] IntendedViewEffectiveDtFilters = new DateFilter[IntendedViewEffectiveDtFilter.length];
      for (int i = 0; i < IntendedViewEffectiveDtFilters.length; i++) {
        IntendedViewEffectiveDtFilters[i] = (DateFilter)IntendedViewEffectiveDtFilter[i];
      }
      try {
        out.setIntendedViewEffectiveDtFilter(IntendedViewEffectiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevViewIdMap = (Map)record.get("PrevViewId");
    Boolean PrevViewIdFetch = DataHelper.getFetch(PrevViewIdMap);
    Boolean PrevViewIdSortDir = DataHelper.getSortDirection(PrevViewIdMap);
    Integer PrevViewIdSortOrder = DataHelper.getSortOrder(PrevViewIdMap);
    if (PrevViewIdFetch != null) out.setPrevViewIdFetch(PrevViewIdFetch);
    if (PrevViewIdSortDir != null) out.setPrevViewIdSortDirection(PrevViewIdSortDir);
    if (PrevViewIdSortOrder != null) out.setPrevViewIdSortOrder(PrevViewIdSortOrder);

    Filter[] PrevViewIdFilter = DataHelper.mapToFilterArray(PrevViewIdMap, BigInteger.class);
    if (PrevViewIdFilter != null) {
      BigIntegerFilter[] PrevViewIdFilters = new BigIntegerFilter[PrevViewIdFilter.length];
      for (int i = 0; i < PrevViewIdFilters.length; i++) {
        PrevViewIdFilters[i] = (BigIntegerFilter)PrevViewIdFilter[i];
      }
      try {
        out.setPrevViewIdFilter(PrevViewIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTypeMap = (Map)record.get("ContractType");
    Boolean ContractTypeFetch = DataHelper.getFetch(ContractTypeMap);
    Boolean ContractTypeSortDir = DataHelper.getSortDirection(ContractTypeMap);
    Integer ContractTypeSortOrder = DataHelper.getSortOrder(ContractTypeMap);
    if (ContractTypeFetch != null) out.setContractTypeFetch(ContractTypeFetch);
    if (ContractTypeSortDir != null) out.setContractTypeSortDirection(ContractTypeSortDir);
    if (ContractTypeSortOrder != null) out.setContractTypeSortOrder(ContractTypeSortOrder);

    Filter[] ContractTypeFilter = DataHelper.mapToFilterArray(ContractTypeMap, Integer.class);
    if (ContractTypeFilter != null) {
      IntegerFilter[] ContractTypeFilters = new IntegerFilter[ContractTypeFilter.length];
      for (int i = 0; i < ContractTypeFilters.length; i++) {
        ContractTypeFilters[i] = (IntegerFilter)ContractTypeFilter[i];
      }
      try {
        out.setContractTypeFilter(ContractTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractIdMap = (Map)record.get("ContractId");
    Boolean ContractIdFetch = DataHelper.getFetch(ContractIdMap);
    Boolean ContractIdSortDir = DataHelper.getSortDirection(ContractIdMap);
    Integer ContractIdSortOrder = DataHelper.getSortOrder(ContractIdMap);
    if (ContractIdFetch != null) out.setContractIdFetch(ContractIdFetch);
    if (ContractIdSortDir != null) out.setContractIdSortDirection(ContractIdSortDir);
    if (ContractIdSortOrder != null) out.setContractIdSortOrder(ContractIdSortOrder);

    Filter[] ContractIdFilter = DataHelper.mapToFilterArray(ContractIdMap, String.class);
    if (ContractIdFilter != null) {
      StringFilter[] ContractIdFilters = new StringFilter[ContractIdFilter.length];
      for (int i = 0; i < ContractIdFilters.length; i++) {
        ContractIdFilters[i] = (StringFilter)ContractIdFilter[i];
      }
      try {
        out.setContractIdFilter(ContractIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentGroupNoMap = (Map)record.get("ParentGroupNo");
    Boolean ParentGroupNoFetch = DataHelper.getFetch(ParentGroupNoMap);
    Boolean ParentGroupNoSortDir = DataHelper.getSortDirection(ParentGroupNoMap);
    Integer ParentGroupNoSortOrder = DataHelper.getSortOrder(ParentGroupNoMap);
    if (ParentGroupNoFetch != null) out.setParentGroupNoFetch(ParentGroupNoFetch);
    if (ParentGroupNoSortDir != null) out.setParentGroupNoSortDirection(ParentGroupNoSortDir);
    if (ParentGroupNoSortOrder != null) out.setParentGroupNoSortOrder(ParentGroupNoSortOrder);

    Filter[] ParentGroupNoFilter = DataHelper.mapToFilterArray(ParentGroupNoMap, Integer.class);
    if (ParentGroupNoFilter != null) {
      IntegerFilter[] ParentGroupNoFilters = new IntegerFilter[ParentGroupNoFilter.length];
      for (int i = 0; i < ParentGroupNoFilters.length; i++) {
        ParentGroupNoFilters[i] = (IntegerFilter)ParentGroupNoFilter[i];
      }
      try {
        out.setParentGroupNoFilter(ParentGroupNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StartDtMap = (Map)record.get("StartDt");
    Boolean StartDtFetch = DataHelper.getFetch(StartDtMap);
    Boolean StartDtSortDir = DataHelper.getSortDirection(StartDtMap);
    Integer StartDtSortOrder = DataHelper.getSortOrder(StartDtMap);
    if (StartDtFetch != null) out.setStartDtFetch(StartDtFetch);
    if (StartDtSortDir != null) out.setStartDtSortDirection(StartDtSortDir);
    if (StartDtSortOrder != null) out.setStartDtSortOrder(StartDtSortOrder);

    Filter[] StartDtFilter = DataHelper.mapToFilterArray(StartDtMap, Date.class);
    if (StartDtFilter != null) {
      DateFilter[] StartDtFilters = new DateFilter[StartDtFilter.length];
      for (int i = 0; i < StartDtFilters.length; i++) {
        StartDtFilters[i] = (DateFilter)StartDtFilter[i];
      }
      try {
        out.setStartDtFilter(StartDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EndDtMap = (Map)record.get("EndDt");
    Boolean EndDtFetch = DataHelper.getFetch(EndDtMap);
    Boolean EndDtSortDir = DataHelper.getSortDirection(EndDtMap);
    Integer EndDtSortOrder = DataHelper.getSortOrder(EndDtMap);
    if (EndDtFetch != null) out.setEndDtFetch(EndDtFetch);
    if (EndDtSortDir != null) out.setEndDtSortDirection(EndDtSortDir);
    if (EndDtSortOrder != null) out.setEndDtSortOrder(EndDtSortOrder);

    Filter[] EndDtFilter = DataHelper.mapToFilterArray(EndDtMap, Date.class);
    if (EndDtFilter != null) {
      DateFilter[] EndDtFilters = new DateFilter[EndDtFilter.length];
      for (int i = 0; i < EndDtFilters.length; i++) {
        EndDtFilters[i] = (DateFilter)EndDtFilter[i];
      }
      try {
        out.setEndDtFilter(EndDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevEndDtMap = (Map)record.get("PrevEndDt");
    Boolean PrevEndDtFetch = DataHelper.getFetch(PrevEndDtMap);
    Boolean PrevEndDtSortDir = DataHelper.getSortDirection(PrevEndDtMap);
    Integer PrevEndDtSortOrder = DataHelper.getSortOrder(PrevEndDtMap);
    if (PrevEndDtFetch != null) out.setPrevEndDtFetch(PrevEndDtFetch);
    if (PrevEndDtSortDir != null) out.setPrevEndDtSortDirection(PrevEndDtSortDir);
    if (PrevEndDtSortOrder != null) out.setPrevEndDtSortOrder(PrevEndDtSortOrder);

    Filter[] PrevEndDtFilter = DataHelper.mapToFilterArray(PrevEndDtMap, Date.class);
    if (PrevEndDtFilter != null) {
      DateFilter[] PrevEndDtFilters = new DateFilter[PrevEndDtFilter.length];
      for (int i = 0; i < PrevEndDtFilters.length; i++) {
        PrevEndDtFilters[i] = (DateFilter)PrevEndDtFilter[i];
      }
      try {
        out.setPrevEndDtFilter(PrevEndDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GracePeriodMap = (Map)record.get("GracePeriod");
    Boolean GracePeriodFetch = DataHelper.getFetch(GracePeriodMap);
    Boolean GracePeriodSortDir = DataHelper.getSortDirection(GracePeriodMap);
    Integer GracePeriodSortOrder = DataHelper.getSortOrder(GracePeriodMap);
    if (GracePeriodFetch != null) out.setGracePeriodFetch(GracePeriodFetch);
    if (GracePeriodSortDir != null) out.setGracePeriodSortDirection(GracePeriodSortDir);
    if (GracePeriodSortOrder != null) out.setGracePeriodSortOrder(GracePeriodSortOrder);

    Filter[] GracePeriodFilter = DataHelper.mapToFilterArray(GracePeriodMap, Integer.class);
    if (GracePeriodFilter != null) {
      IntegerFilter[] GracePeriodFilters = new IntegerFilter[GracePeriodFilter.length];
      for (int i = 0; i < GracePeriodFilters.length; i++) {
        GracePeriodFilters[i] = (IntegerFilter)GracePeriodFilter[i];
      }
      try {
        out.setGracePeriodFilter(GracePeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalPeriodsMap = (Map)record.get("TotalPeriods");
    Boolean TotalPeriodsFetch = DataHelper.getFetch(TotalPeriodsMap);
    Boolean TotalPeriodsSortDir = DataHelper.getSortDirection(TotalPeriodsMap);
    Integer TotalPeriodsSortOrder = DataHelper.getSortOrder(TotalPeriodsMap);
    if (TotalPeriodsFetch != null) out.setTotalPeriodsFetch(TotalPeriodsFetch);
    if (TotalPeriodsSortDir != null) out.setTotalPeriodsSortDirection(TotalPeriodsSortDir);
    if (TotalPeriodsSortOrder != null) out.setTotalPeriodsSortOrder(TotalPeriodsSortOrder);

    Filter[] TotalPeriodsFilter = DataHelper.mapToFilterArray(TotalPeriodsMap, Integer.class);
    if (TotalPeriodsFilter != null) {
      IntegerFilter[] TotalPeriodsFilters = new IntegerFilter[TotalPeriodsFilter.length];
      for (int i = 0; i < TotalPeriodsFilters.length; i++) {
        TotalPeriodsFilters[i] = (IntegerFilter)TotalPeriodsFilter[i];
      }
      try {
        out.setTotalPeriodsFilter(TotalPeriodsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SalesChannelIdMap = (Map)record.get("SalesChannelId");
    Boolean SalesChannelIdFetch = DataHelper.getFetch(SalesChannelIdMap);
    Boolean SalesChannelIdSortDir = DataHelper.getSortDirection(SalesChannelIdMap);
    Integer SalesChannelIdSortOrder = DataHelper.getSortOrder(SalesChannelIdMap);
    if (SalesChannelIdFetch != null) out.setSalesChannelIdFetch(SalesChannelIdFetch);
    if (SalesChannelIdSortDir != null) out.setSalesChannelIdSortDirection(SalesChannelIdSortDir);
    if (SalesChannelIdSortOrder != null) out.setSalesChannelIdSortOrder(SalesChannelIdSortOrder);

    Filter[] SalesChannelIdFilter = DataHelper.mapToFilterArray(SalesChannelIdMap, Integer.class);
    if (SalesChannelIdFilter != null) {
      IntegerFilter[] SalesChannelIdFilters = new IntegerFilter[SalesChannelIdFilter.length];
      for (int i = 0; i < SalesChannelIdFilters.length; i++) {
        SalesChannelIdFilters[i] = (IntegerFilter)SalesChannelIdFilter[i];
      }
      try {
        out.setSalesChannelIdFilter(SalesChannelIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TrackTotalAmountsMap = (Map)record.get("TrackTotalAmounts");
    Boolean TrackTotalAmountsFetch = DataHelper.getFetch(TrackTotalAmountsMap);
    Boolean TrackTotalAmountsSortDir = DataHelper.getSortDirection(TrackTotalAmountsMap);
    Integer TrackTotalAmountsSortOrder = DataHelper.getSortOrder(TrackTotalAmountsMap);
    if (TrackTotalAmountsFetch != null) out.setTrackTotalAmountsFetch(TrackTotalAmountsFetch);
    if (TrackTotalAmountsSortDir != null) out.setTrackTotalAmountsSortDirection(TrackTotalAmountsSortDir);
    if (TrackTotalAmountsSortOrder != null) out.setTrackTotalAmountsSortOrder(TrackTotalAmountsSortOrder);

    Filter[] TrackTotalAmountsFilter = DataHelper.mapToFilterArray(TrackTotalAmountsMap, Boolean.class);
    if (TrackTotalAmountsFilter != null) {
      BooleanFilter[] TrackTotalAmountsFilters = new BooleanFilter[TrackTotalAmountsFilter.length];
      for (int i = 0; i < TrackTotalAmountsFilters.length; i++) {
        TrackTotalAmountsFilters[i] = (BooleanFilter)TrackTotalAmountsFilter[i];
      }
      try {
        out.setTrackTotalAmountsFilter(TrackTotalAmountsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RolloverPeriodMap = (Map)record.get("RolloverPeriod");
    Boolean RolloverPeriodFetch = DataHelper.getFetch(RolloverPeriodMap);
    Boolean RolloverPeriodSortDir = DataHelper.getSortDirection(RolloverPeriodMap);
    Integer RolloverPeriodSortOrder = DataHelper.getSortOrder(RolloverPeriodMap);
    if (RolloverPeriodFetch != null) out.setRolloverPeriodFetch(RolloverPeriodFetch);
    if (RolloverPeriodSortDir != null) out.setRolloverPeriodSortDirection(RolloverPeriodSortDir);
    if (RolloverPeriodSortOrder != null) out.setRolloverPeriodSortOrder(RolloverPeriodSortOrder);

    Filter[] RolloverPeriodFilter = DataHelper.mapToFilterArray(RolloverPeriodMap, Integer.class);
    if (RolloverPeriodFilter != null) {
      IntegerFilter[] RolloverPeriodFilters = new IntegerFilter[RolloverPeriodFilter.length];
      for (int i = 0; i < RolloverPeriodFilters.length; i++) {
        RolloverPeriodFilters[i] = (IntegerFilter)RolloverPeriodFilter[i];
      }
      try {
        out.setRolloverPeriodFilter(RolloverPeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RolloverPeriodStartMap = (Map)record.get("RolloverPeriodStart");
    Boolean RolloverPeriodStartFetch = DataHelper.getFetch(RolloverPeriodStartMap);
    Boolean RolloverPeriodStartSortDir = DataHelper.getSortDirection(RolloverPeriodStartMap);
    Integer RolloverPeriodStartSortOrder = DataHelper.getSortOrder(RolloverPeriodStartMap);
    if (RolloverPeriodStartFetch != null) out.setRolloverPeriodStartFetch(RolloverPeriodStartFetch);
    if (RolloverPeriodStartSortDir != null) out.setRolloverPeriodStartSortDirection(RolloverPeriodStartSortDir);
    if (RolloverPeriodStartSortOrder != null) out.setRolloverPeriodStartSortOrder(RolloverPeriodStartSortOrder);

    Filter[] RolloverPeriodStartFilter = DataHelper.mapToFilterArray(RolloverPeriodStartMap, Integer.class);
    if (RolloverPeriodStartFilter != null) {
      IntegerFilter[] RolloverPeriodStartFilters = new IntegerFilter[RolloverPeriodStartFilter.length];
      for (int i = 0; i < RolloverPeriodStartFilters.length; i++) {
        RolloverPeriodStartFilters[i] = (IntegerFilter)RolloverPeriodStartFilter[i];
      }
      try {
        out.setRolloverPeriodStartFilter(RolloverPeriodStartFilters);
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
  
    Map DistributePaybackMap = (Map)record.get("DistributePayback");
    Boolean DistributePaybackFetch = DataHelper.getFetch(DistributePaybackMap);
    Boolean DistributePaybackSortDir = DataHelper.getSortDirection(DistributePaybackMap);
    Integer DistributePaybackSortOrder = DataHelper.getSortOrder(DistributePaybackMap);
    if (DistributePaybackFetch != null) out.setDistributePaybackFetch(DistributePaybackFetch);
    if (DistributePaybackSortDir != null) out.setDistributePaybackSortDirection(DistributePaybackSortDir);
    if (DistributePaybackSortOrder != null) out.setDistributePaybackSortOrder(DistributePaybackSortOrder);

    Filter[] DistributePaybackFilter = DataHelper.mapToFilterArray(DistributePaybackMap, Boolean.class);
    if (DistributePaybackFilter != null) {
      BooleanFilter[] DistributePaybackFilters = new BooleanFilter[DistributePaybackFilter.length];
      for (int i = 0; i < DistributePaybackFilters.length; i++) {
        DistributePaybackFilters[i] = (BooleanFilter)DistributePaybackFilter[i];
      }
      try {
        out.setDistributePaybackFilter(DistributePaybackFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateContractStrtOverrideMap = (Map)record.get("ProrateContractStrtOverride");
    Boolean ProrateContractStrtOverrideFetch = DataHelper.getFetch(ProrateContractStrtOverrideMap);
    Boolean ProrateContractStrtOverrideSortDir = DataHelper.getSortDirection(ProrateContractStrtOverrideMap);
    Integer ProrateContractStrtOverrideSortOrder = DataHelper.getSortOrder(ProrateContractStrtOverrideMap);
    if (ProrateContractStrtOverrideFetch != null) out.setProrateContractStrtOverrideFetch(ProrateContractStrtOverrideFetch);
    if (ProrateContractStrtOverrideSortDir != null) out.setProrateContractStrtOverrideSortDirection(ProrateContractStrtOverrideSortDir);
    if (ProrateContractStrtOverrideSortOrder != null) out.setProrateContractStrtOverrideSortOrder(ProrateContractStrtOverrideSortOrder);

    Filter[] ProrateContractStrtOverrideFilter = DataHelper.mapToFilterArray(ProrateContractStrtOverrideMap, Integer.class);
    if (ProrateContractStrtOverrideFilter != null) {
      IntegerFilter[] ProrateContractStrtOverrideFilters = new IntegerFilter[ProrateContractStrtOverrideFilter.length];
      for (int i = 0; i < ProrateContractStrtOverrideFilters.length; i++) {
        ProrateContractStrtOverrideFilters[i] = (IntegerFilter)ProrateContractStrtOverrideFilter[i];
      }
      try {
        out.setProrateContractStrtOverrideFilter(ProrateContractStrtOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateContractEndOverrideMap = (Map)record.get("ProrateContractEndOverride");
    Boolean ProrateContractEndOverrideFetch = DataHelper.getFetch(ProrateContractEndOverrideMap);
    Boolean ProrateContractEndOverrideSortDir = DataHelper.getSortDirection(ProrateContractEndOverrideMap);
    Integer ProrateContractEndOverrideSortOrder = DataHelper.getSortOrder(ProrateContractEndOverrideMap);
    if (ProrateContractEndOverrideFetch != null) out.setProrateContractEndOverrideFetch(ProrateContractEndOverrideFetch);
    if (ProrateContractEndOverrideSortDir != null) out.setProrateContractEndOverrideSortDirection(ProrateContractEndOverrideSortDir);
    if (ProrateContractEndOverrideSortOrder != null) out.setProrateContractEndOverrideSortOrder(ProrateContractEndOverrideSortOrder);

    Filter[] ProrateContractEndOverrideFilter = DataHelper.mapToFilterArray(ProrateContractEndOverrideMap, Integer.class);
    if (ProrateContractEndOverrideFilter != null) {
      IntegerFilter[] ProrateContractEndOverrideFilters = new IntegerFilter[ProrateContractEndOverrideFilter.length];
      for (int i = 0; i < ProrateContractEndOverrideFilters.length; i++) {
        ProrateContractEndOverrideFilters[i] = (IntegerFilter)ProrateContractEndOverrideFilter[i];
      }
      try {
        out.setProrateContractEndOverrideFilter(ProrateContractEndOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateInterimBillOverrideMap = (Map)record.get("ProrateInterimBillOverride");
    Boolean ProrateInterimBillOverrideFetch = DataHelper.getFetch(ProrateInterimBillOverrideMap);
    Boolean ProrateInterimBillOverrideSortDir = DataHelper.getSortDirection(ProrateInterimBillOverrideMap);
    Integer ProrateInterimBillOverrideSortOrder = DataHelper.getSortOrder(ProrateInterimBillOverrideMap);
    if (ProrateInterimBillOverrideFetch != null) out.setProrateInterimBillOverrideFetch(ProrateInterimBillOverrideFetch);
    if (ProrateInterimBillOverrideSortDir != null) out.setProrateInterimBillOverrideSortDirection(ProrateInterimBillOverrideSortDir);
    if (ProrateInterimBillOverrideSortOrder != null) out.setProrateInterimBillOverrideSortOrder(ProrateInterimBillOverrideSortOrder);

    Filter[] ProrateInterimBillOverrideFilter = DataHelper.mapToFilterArray(ProrateInterimBillOverrideMap, Integer.class);
    if (ProrateInterimBillOverrideFilter != null) {
      IntegerFilter[] ProrateInterimBillOverrideFilters = new IntegerFilter[ProrateInterimBillOverrideFilter.length];
      for (int i = 0; i < ProrateInterimBillOverrideFilters.length; i++) {
        ProrateInterimBillOverrideFilters[i] = (IntegerFilter)ProrateInterimBillOverrideFilter[i];
      }
      try {
        out.setProrateInterimBillOverrideFilter(ProrateInterimBillOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProratePeriodChangeOverrideMap = (Map)record.get("ProratePeriodChangeOverride");
    Boolean ProratePeriodChangeOverrideFetch = DataHelper.getFetch(ProratePeriodChangeOverrideMap);
    Boolean ProratePeriodChangeOverrideSortDir = DataHelper.getSortDirection(ProratePeriodChangeOverrideMap);
    Integer ProratePeriodChangeOverrideSortOrder = DataHelper.getSortOrder(ProratePeriodChangeOverrideMap);
    if (ProratePeriodChangeOverrideFetch != null) out.setProratePeriodChangeOverrideFetch(ProratePeriodChangeOverrideFetch);
    if (ProratePeriodChangeOverrideSortDir != null) out.setProratePeriodChangeOverrideSortDirection(ProratePeriodChangeOverrideSortDir);
    if (ProratePeriodChangeOverrideSortOrder != null) out.setProratePeriodChangeOverrideSortOrder(ProratePeriodChangeOverrideSortOrder);

    Filter[] ProratePeriodChangeOverrideFilter = DataHelper.mapToFilterArray(ProratePeriodChangeOverrideMap, Integer.class);
    if (ProratePeriodChangeOverrideFilter != null) {
      IntegerFilter[] ProratePeriodChangeOverrideFilters = new IntegerFilter[ProratePeriodChangeOverrideFilter.length];
      for (int i = 0; i < ProratePeriodChangeOverrideFilters.length; i++) {
        ProratePeriodChangeOverrideFilters[i] = (IntegerFilter)ProratePeriodChangeOverrideFilter[i];
      }
      try {
        out.setProratePeriodChangeOverrideFilter(ProratePeriodChangeOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateAccountStartOverrideMap = (Map)record.get("ProrateAccountStartOverride");
    Boolean ProrateAccountStartOverrideFetch = DataHelper.getFetch(ProrateAccountStartOverrideMap);
    Boolean ProrateAccountStartOverrideSortDir = DataHelper.getSortDirection(ProrateAccountStartOverrideMap);
    Integer ProrateAccountStartOverrideSortOrder = DataHelper.getSortOrder(ProrateAccountStartOverrideMap);
    if (ProrateAccountStartOverrideFetch != null) out.setProrateAccountStartOverrideFetch(ProrateAccountStartOverrideFetch);
    if (ProrateAccountStartOverrideSortDir != null) out.setProrateAccountStartOverrideSortDirection(ProrateAccountStartOverrideSortDir);
    if (ProrateAccountStartOverrideSortOrder != null) out.setProrateAccountStartOverrideSortOrder(ProrateAccountStartOverrideSortOrder);

    Filter[] ProrateAccountStartOverrideFilter = DataHelper.mapToFilterArray(ProrateAccountStartOverrideMap, Integer.class);
    if (ProrateAccountStartOverrideFilter != null) {
      IntegerFilter[] ProrateAccountStartOverrideFilters = new IntegerFilter[ProrateAccountStartOverrideFilter.length];
      for (int i = 0; i < ProrateAccountStartOverrideFilters.length; i++) {
        ProrateAccountStartOverrideFilters[i] = (IntegerFilter)ProrateAccountStartOverrideFilter[i];
      }
      try {
        out.setProrateAccountStartOverrideFilter(ProrateAccountStartOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateAccountEndOverrideMap = (Map)record.get("ProrateAccountEndOverride");
    Boolean ProrateAccountEndOverrideFetch = DataHelper.getFetch(ProrateAccountEndOverrideMap);
    Boolean ProrateAccountEndOverrideSortDir = DataHelper.getSortDirection(ProrateAccountEndOverrideMap);
    Integer ProrateAccountEndOverrideSortOrder = DataHelper.getSortOrder(ProrateAccountEndOverrideMap);
    if (ProrateAccountEndOverrideFetch != null) out.setProrateAccountEndOverrideFetch(ProrateAccountEndOverrideFetch);
    if (ProrateAccountEndOverrideSortDir != null) out.setProrateAccountEndOverrideSortDirection(ProrateAccountEndOverrideSortDir);
    if (ProrateAccountEndOverrideSortOrder != null) out.setProrateAccountEndOverrideSortOrder(ProrateAccountEndOverrideSortOrder);

    Filter[] ProrateAccountEndOverrideFilter = DataHelper.mapToFilterArray(ProrateAccountEndOverrideMap, Integer.class);
    if (ProrateAccountEndOverrideFilter != null) {
      IntegerFilter[] ProrateAccountEndOverrideFilters = new IntegerFilter[ProrateAccountEndOverrideFilter.length];
      for (int i = 0; i < ProrateAccountEndOverrideFilters.length; i++) {
        ProrateAccountEndOverrideFilters[i] = (IntegerFilter)ProrateAccountEndOverrideFilter[i];
      }
      try {
        out.setProrateAccountEndOverrideFilter(ProrateAccountEndOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateTgtThresholdOverrideMap = (Map)record.get("ProrateTgtThresholdOverride");
    Boolean ProrateTgtThresholdOverrideFetch = DataHelper.getFetch(ProrateTgtThresholdOverrideMap);
    Boolean ProrateTgtThresholdOverrideSortDir = DataHelper.getSortDirection(ProrateTgtThresholdOverrideMap);
    Integer ProrateTgtThresholdOverrideSortOrder = DataHelper.getSortOrder(ProrateTgtThresholdOverrideMap);
    if (ProrateTgtThresholdOverrideFetch != null) out.setProrateTgtThresholdOverrideFetch(ProrateTgtThresholdOverrideFetch);
    if (ProrateTgtThresholdOverrideSortDir != null) out.setProrateTgtThresholdOverrideSortDirection(ProrateTgtThresholdOverrideSortDir);
    if (ProrateTgtThresholdOverrideSortOrder != null) out.setProrateTgtThresholdOverrideSortOrder(ProrateTgtThresholdOverrideSortOrder);

    Filter[] ProrateTgtThresholdOverrideFilter = DataHelper.mapToFilterArray(ProrateTgtThresholdOverrideMap, Integer.class);
    if (ProrateTgtThresholdOverrideFilter != null) {
      IntegerFilter[] ProrateTgtThresholdOverrideFilters = new IntegerFilter[ProrateTgtThresholdOverrideFilter.length];
      for (int i = 0; i < ProrateTgtThresholdOverrideFilters.length; i++) {
        ProrateTgtThresholdOverrideFilters[i] = (IntegerFilter)ProrateTgtThresholdOverrideFilter[i];
      }
      try {
        out.setProrateTgtThresholdOverrideFilter(ProrateTgtThresholdOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProrateTgtRebatesOverrideMap = (Map)record.get("ProrateTgtRebatesOverride");
    Boolean ProrateTgtRebatesOverrideFetch = DataHelper.getFetch(ProrateTgtRebatesOverrideMap);
    Boolean ProrateTgtRebatesOverrideSortDir = DataHelper.getSortDirection(ProrateTgtRebatesOverrideMap);
    Integer ProrateTgtRebatesOverrideSortOrder = DataHelper.getSortOrder(ProrateTgtRebatesOverrideMap);
    if (ProrateTgtRebatesOverrideFetch != null) out.setProrateTgtRebatesOverrideFetch(ProrateTgtRebatesOverrideFetch);
    if (ProrateTgtRebatesOverrideSortDir != null) out.setProrateTgtRebatesOverrideSortDirection(ProrateTgtRebatesOverrideSortDir);
    if (ProrateTgtRebatesOverrideSortOrder != null) out.setProrateTgtRebatesOverrideSortOrder(ProrateTgtRebatesOverrideSortOrder);

    Filter[] ProrateTgtRebatesOverrideFilter = DataHelper.mapToFilterArray(ProrateTgtRebatesOverrideMap, Integer.class);
    if (ProrateTgtRebatesOverrideFilter != null) {
      IntegerFilter[] ProrateTgtRebatesOverrideFilters = new IntegerFilter[ProrateTgtRebatesOverrideFilter.length];
      for (int i = 0; i < ProrateTgtRebatesOverrideFilters.length; i++) {
        ProrateTgtRebatesOverrideFilters[i] = (IntegerFilter)ProrateTgtRebatesOverrideFilter[i];
      }
      try {
        out.setProrateTgtRebatesOverrideFilter(ProrateTgtRebatesOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StartByDtMap = (Map)record.get("StartByDt");
    Boolean StartByDtFetch = DataHelper.getFetch(StartByDtMap);
    Boolean StartByDtSortDir = DataHelper.getSortDirection(StartByDtMap);
    Integer StartByDtSortOrder = DataHelper.getSortOrder(StartByDtMap);
    if (StartByDtFetch != null) out.setStartByDtFetch(StartByDtFetch);
    if (StartByDtSortDir != null) out.setStartByDtSortDirection(StartByDtSortDir);
    if (StartByDtSortOrder != null) out.setStartByDtSortOrder(StartByDtSortOrder);

    Filter[] StartByDtFilter = DataHelper.mapToFilterArray(StartByDtMap, Date.class);
    if (StartByDtFilter != null) {
      DateFilter[] StartByDtFilters = new DateFilter[StartByDtFilter.length];
      for (int i = 0; i < StartByDtFilters.length; i++) {
        StartByDtFilters[i] = (DateFilter)StartByDtFilter[i];
      }
      try {
        out.setStartByDtFilter(StartByDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoticeEndDtMap = (Map)record.get("NoticeEndDt");
    Boolean NoticeEndDtFetch = DataHelper.getFetch(NoticeEndDtMap);
    Boolean NoticeEndDtSortDir = DataHelper.getSortDirection(NoticeEndDtMap);
    Integer NoticeEndDtSortOrder = DataHelper.getSortOrder(NoticeEndDtMap);
    if (NoticeEndDtFetch != null) out.setNoticeEndDtFetch(NoticeEndDtFetch);
    if (NoticeEndDtSortDir != null) out.setNoticeEndDtSortDirection(NoticeEndDtSortDir);
    if (NoticeEndDtSortOrder != null) out.setNoticeEndDtSortOrder(NoticeEndDtSortOrder);

    Filter[] NoticeEndDtFilter = DataHelper.mapToFilterArray(NoticeEndDtMap, Date.class);
    if (NoticeEndDtFilter != null) {
      DateFilter[] NoticeEndDtFilters = new DateFilter[NoticeEndDtFilter.length];
      for (int i = 0; i < NoticeEndDtFilters.length; i++) {
        NoticeEndDtFilters[i] = (DateFilter)NoticeEndDtFilter[i];
      }
      try {
        out.setNoticeEndDtFilter(NoticeEndDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DurationOverrideMap = (Map)record.get("DurationOverride");
    Boolean DurationOverrideFetch = DataHelper.getFetch(DurationOverrideMap);
    Boolean DurationOverrideSortDir = DataHelper.getSortDirection(DurationOverrideMap);
    Integer DurationOverrideSortOrder = DataHelper.getSortOrder(DurationOverrideMap);
    if (DurationOverrideFetch != null) out.setDurationOverrideFetch(DurationOverrideFetch);
    if (DurationOverrideSortDir != null) out.setDurationOverrideSortDirection(DurationOverrideSortDir);
    if (DurationOverrideSortOrder != null) out.setDurationOverrideSortOrder(DurationOverrideSortOrder);

    Filter[] DurationOverrideFilter = DataHelper.mapToFilterArray(DurationOverrideMap, Boolean.class);
    if (DurationOverrideFilter != null) {
      BooleanFilter[] DurationOverrideFilters = new BooleanFilter[DurationOverrideFilter.length];
      for (int i = 0; i < DurationOverrideFilters.length; i++) {
        DurationOverrideFilters[i] = (BooleanFilter)DurationOverrideFilter[i];
      }
      try {
        out.setDurationOverrideFilter(DurationOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoticeOverrideMap = (Map)record.get("NoticeOverride");
    Boolean NoticeOverrideFetch = DataHelper.getFetch(NoticeOverrideMap);
    Boolean NoticeOverrideSortDir = DataHelper.getSortDirection(NoticeOverrideMap);
    Integer NoticeOverrideSortOrder = DataHelper.getSortOrder(NoticeOverrideMap);
    if (NoticeOverrideFetch != null) out.setNoticeOverrideFetch(NoticeOverrideFetch);
    if (NoticeOverrideSortDir != null) out.setNoticeOverrideSortDirection(NoticeOverrideSortDir);
    if (NoticeOverrideSortOrder != null) out.setNoticeOverrideSortOrder(NoticeOverrideSortOrder);

    Filter[] NoticeOverrideFilter = DataHelper.mapToFilterArray(NoticeOverrideMap, Boolean.class);
    if (NoticeOverrideFilter != null) {
      BooleanFilter[] NoticeOverrideFilters = new BooleanFilter[NoticeOverrideFilter.length];
      for (int i = 0; i < NoticeOverrideFilters.length; i++) {
        NoticeOverrideFilters[i] = (BooleanFilter)NoticeOverrideFilter[i];
      }
      try {
        out.setNoticeOverrideFilter(NoticeOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsPartOfComponentMap = (Map)record.get("IsPartOfComponent");
    Boolean IsPartOfComponentFetch = DataHelper.getFetch(IsPartOfComponentMap);
    Boolean IsPartOfComponentSortDir = DataHelper.getSortDirection(IsPartOfComponentMap);
    Integer IsPartOfComponentSortOrder = DataHelper.getSortOrder(IsPartOfComponentMap);
    if (IsPartOfComponentFetch != null) out.setIsPartOfComponentFetch(IsPartOfComponentFetch);
    if (IsPartOfComponentSortDir != null) out.setIsPartOfComponentSortDirection(IsPartOfComponentSortDir);
    if (IsPartOfComponentSortOrder != null) out.setIsPartOfComponentSortOrder(IsPartOfComponentSortOrder);

    Filter[] IsPartOfComponentFilter = DataHelper.mapToFilterArray(IsPartOfComponentMap, Boolean.class);
    if (IsPartOfComponentFilter != null) {
      BooleanFilter[] IsPartOfComponentFilters = new BooleanFilter[IsPartOfComponentFilter.length];
      for (int i = 0; i < IsPartOfComponentFilters.length; i++) {
        IsPartOfComponentFilters[i] = (BooleanFilter)IsPartOfComponentFilter[i];
      }
      try {
        out.setIsPartOfComponentFilter(IsPartOfComponentFilters);
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
  
    Map MinDurationDateMap = (Map)record.get("MinDurationDate");
    Boolean MinDurationDateFetch = DataHelper.getFetch(MinDurationDateMap);
    Boolean MinDurationDateSortDir = DataHelper.getSortDirection(MinDurationDateMap);
    Integer MinDurationDateSortOrder = DataHelper.getSortOrder(MinDurationDateMap);
    if (MinDurationDateFetch != null) out.setMinDurationDateFetch(MinDurationDateFetch);
    if (MinDurationDateSortDir != null) out.setMinDurationDateSortDirection(MinDurationDateSortDir);
    if (MinDurationDateSortOrder != null) out.setMinDurationDateSortOrder(MinDurationDateSortOrder);

    Filter[] MinDurationDateFilter = DataHelper.mapToFilterArray(MinDurationDateMap, Date.class);
    if (MinDurationDateFilter != null) {
      DateFilter[] MinDurationDateFilters = new DateFilter[MinDurationDateFilter.length];
      for (int i = 0; i < MinDurationDateFilters.length; i++) {
        MinDurationDateFilters[i] = (DateFilter)MinDurationDateFilter[i];
      }
      try {
        out.setMinDurationDateFilter(MinDurationDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MinNoticeDateMap = (Map)record.get("MinNoticeDate");
    Boolean MinNoticeDateFetch = DataHelper.getFetch(MinNoticeDateMap);
    Boolean MinNoticeDateSortDir = DataHelper.getSortDirection(MinNoticeDateMap);
    Integer MinNoticeDateSortOrder = DataHelper.getSortOrder(MinNoticeDateMap);
    if (MinNoticeDateFetch != null) out.setMinNoticeDateFetch(MinNoticeDateFetch);
    if (MinNoticeDateSortDir != null) out.setMinNoticeDateSortDirection(MinNoticeDateSortDir);
    if (MinNoticeDateSortOrder != null) out.setMinNoticeDateSortOrder(MinNoticeDateSortOrder);

    Filter[] MinNoticeDateFilter = DataHelper.mapToFilterArray(MinNoticeDateMap, Date.class);
    if (MinNoticeDateFilter != null) {
      DateFilter[] MinNoticeDateFilters = new DateFilter[MinNoticeDateFilter.length];
      for (int i = 0; i < MinNoticeDateFilters.length; i++) {
        MinNoticeDateFilters[i] = (DateFilter)MinNoticeDateFilter[i];
      }
      try {
        out.setMinNoticeDateFilter(MinNoticeDateFilters);
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
  
    list = (Object[]) record.get ("ExtendedData");
    out.extendedDataFilter = new HashMap ();
    for (int i = 0; list != null && i < list.length; i++)
    {
      Map edmap = (Map) list[i];
      if (edmap != null) out.extendedDataFilter.put (edmap.get ("ParamId"), edmap.get ("ParamValue"));
    }

    return out;
  }
}
