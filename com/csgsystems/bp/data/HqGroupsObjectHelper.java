/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupsObjectHelper.java
 * Definition File: Catalog/HqGroups.xml
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



/** Helper class to convert HqGroupsObject JavaBean objects to/from HashMaps.
 */
public class HqGroupsObjectHelper implements ArubaObjectHelper
{
  /** convert HqGroupsObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HqGroupsObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupsObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupsObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HqGroupsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupsObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupsObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HqGroupsObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupsObjectData the converted object
   */
  public static HqGroupsObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HqGroupsObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HqGroupsObject")
   * @return HqGroupsObjectData the converted object
   */
  public static HqGroupsObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HqGroupsObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupsObjectFilter the converted object
   */
  public static HqGroupsObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HqGroupsObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HqGroupsObject")
   * @return HqGroupsObjectFilter the converted object
   */
  public static HqGroupsObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HqGroupsObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HqGroupsObjectDataList the converted object
   */
  public static HqGroupsObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HqGroupsObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HqGroupsObjectList")
   * @return HqGroupsObjectDataList the converted object
   */
  public static HqGroupsObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupsObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HqGroupsObjectData[] array = null;
    if (root != null)
    {
      array = new HqGroupsObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HqGroupsObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HqGroupsObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HqGroupsObjectDataList (array, index, total);
  }
  /** convert HqGroupsObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupsObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HqGroupsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ExternalIdSet) record.put ("ExternalId", in.ExternalId);
  
    if (in._ExternalIdTypeSet) record.put ("ExternalIdType", in.ExternalIdType);
  
    if (in._OwningAccountInternalIdSet) record.put ("OwningAccountInternalId", in.OwningAccountInternalId);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._BillPeriodSet) record.put ("BillPeriod", in.BillPeriod);
  
    if (in._NextBillDateSet) record.put ("NextBillDate", in.NextBillDate);
  
    if (in._PrevCutoffDateSet) record.put ("PrevCutoffDate", in.PrevCutoffDate);
  
    if (in._PrioritySet) record.put ("Priority", in.Priority);
  
    if (in._GroupPurposeSet) record.put ("GroupPurpose", in.GroupPurpose);
      return record;
  }
  /** convert HqGroupsObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupsObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HqGroupsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ExternalId, in.ExternalIdSort, in.ExternalIdSortAscending, in.ExternalIdFetch, in.ExternalIdCaseInsensitive);
      if (map != null) record.put ("ExternalId", map);
      map = DataHelper.filterToMap (in.ExternalIdType, in.ExternalIdTypeSort, in.ExternalIdTypeSortAscending, in.ExternalIdTypeFetch);
      if (map != null) record.put ("ExternalIdType", map);
      map = DataHelper.filterToMap (in.OwningAccountInternalId, in.OwningAccountInternalIdSort, in.OwningAccountInternalIdSortAscending, in.OwningAccountInternalIdFetch);
      if (map != null) record.put ("OwningAccountInternalId", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.BillPeriod, in.BillPeriodSort, in.BillPeriodSortAscending, in.BillPeriodFetch, in.BillPeriodCaseInsensitive);
      if (map != null) record.put ("BillPeriod", map);
      map = DataHelper.filterToMap (in.NextBillDate, in.NextBillDateSort, in.NextBillDateSortAscending, in.NextBillDateFetch);
      if (map != null) record.put ("NextBillDate", map);
      map = DataHelper.filterToMap (in.PrevCutoffDate, in.PrevCutoffDateSort, in.PrevCutoffDateSortAscending, in.PrevCutoffDateFetch);
      if (map != null) record.put ("PrevCutoffDate", map);
      map = DataHelper.filterToMap (in.Priority, in.PrioritySort, in.PrioritySortAscending, in.PriorityFetch);
      if (map != null) record.put ("Priority", map);
      map = DataHelper.filterToMap (in.GroupPurpose, in.GroupPurposeSort, in.GroupPurposeSortAscending, in.GroupPurposeFetch);
      if (map != null) record.put ("GroupPurpose", map);
    return record;
  }
  /** convert Map to HqGroupsObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupsObjectData the converted object
   */
  public static HqGroupsObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupsObjectData out = new HqGroupsObjectData ();

    out.Key = HqGroupsObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ExternalId")) != null)
    {
      out.ExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ExternalIdType")) != null)
    {
      out.ExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("OwningAccountInternalId")) != null)
    {
      out.OwningAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("BillPeriod")) != null)
    {
      out.BillPeriod = (String) obj;
    }
  
    if ((obj = record.get ("NextBillDate")) != null)
    {
      out.NextBillDate = (Date) obj;
    }
  
    if ((obj = record.get ("PrevCutoffDate")) != null)
    {
      out.PrevCutoffDate = (Date) obj;
    }
  
    if ((obj = record.get ("Priority")) != null)
    {
      out.Priority = (Integer) obj;
    }
  
    if ((obj = record.get ("GroupPurpose")) != null)
    {
      out.GroupPurpose = (Integer) obj;
    }
      return out;
  }
  /** convert Map to HqGroupsObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupsObjectFilter the converted object
   */
  public static HqGroupsObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupsObjectFilter out = new HqGroupsObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HqGroupsObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ExternalIdMap = (Map)record.get("ExternalId");
    Boolean ExternalIdFetch = DataHelper.getFetch(ExternalIdMap);
    Boolean ExternalIdSortDir = DataHelper.getSortDirection(ExternalIdMap);
    Integer ExternalIdSortOrder = DataHelper.getSortOrder(ExternalIdMap);
    if (ExternalIdFetch != null) out.setExternalIdFetch(ExternalIdFetch);
    if (ExternalIdSortDir != null) out.setExternalIdSortDirection(ExternalIdSortDir);
    if (ExternalIdSortOrder != null) out.setExternalIdSortOrder(ExternalIdSortOrder);

    Filter[] ExternalIdFilter = DataHelper.mapToFilterArray(ExternalIdMap, String.class);
    if (ExternalIdFilter != null) {
      StringFilter[] ExternalIdFilters = new StringFilter[ExternalIdFilter.length];
      for (int i = 0; i < ExternalIdFilters.length; i++) {
        ExternalIdFilters[i] = (StringFilter)ExternalIdFilter[i];
      }
      try {
        out.setExternalIdFilter(ExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalIdTypeMap = (Map)record.get("ExternalIdType");
    Boolean ExternalIdTypeFetch = DataHelper.getFetch(ExternalIdTypeMap);
    Boolean ExternalIdTypeSortDir = DataHelper.getSortDirection(ExternalIdTypeMap);
    Integer ExternalIdTypeSortOrder = DataHelper.getSortOrder(ExternalIdTypeMap);
    if (ExternalIdTypeFetch != null) out.setExternalIdTypeFetch(ExternalIdTypeFetch);
    if (ExternalIdTypeSortDir != null) out.setExternalIdTypeSortDirection(ExternalIdTypeSortDir);
    if (ExternalIdTypeSortOrder != null) out.setExternalIdTypeSortOrder(ExternalIdTypeSortOrder);

    Filter[] ExternalIdTypeFilter = DataHelper.mapToFilterArray(ExternalIdTypeMap, Integer.class);
    if (ExternalIdTypeFilter != null) {
      IntegerFilter[] ExternalIdTypeFilters = new IntegerFilter[ExternalIdTypeFilter.length];
      for (int i = 0; i < ExternalIdTypeFilters.length; i++) {
        ExternalIdTypeFilters[i] = (IntegerFilter)ExternalIdTypeFilter[i];
      }
      try {
        out.setExternalIdTypeFilter(ExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwningAccountInternalIdMap = (Map)record.get("OwningAccountInternalId");
    Boolean OwningAccountInternalIdFetch = DataHelper.getFetch(OwningAccountInternalIdMap);
    Boolean OwningAccountInternalIdSortDir = DataHelper.getSortDirection(OwningAccountInternalIdMap);
    Integer OwningAccountInternalIdSortOrder = DataHelper.getSortOrder(OwningAccountInternalIdMap);
    if (OwningAccountInternalIdFetch != null) out.setOwningAccountInternalIdFetch(OwningAccountInternalIdFetch);
    if (OwningAccountInternalIdSortDir != null) out.setOwningAccountInternalIdSortDirection(OwningAccountInternalIdSortDir);
    if (OwningAccountInternalIdSortOrder != null) out.setOwningAccountInternalIdSortOrder(OwningAccountInternalIdSortOrder);

    Filter[] OwningAccountInternalIdFilter = DataHelper.mapToFilterArray(OwningAccountInternalIdMap, Integer.class);
    if (OwningAccountInternalIdFilter != null) {
      IntegerFilter[] OwningAccountInternalIdFilters = new IntegerFilter[OwningAccountInternalIdFilter.length];
      for (int i = 0; i < OwningAccountInternalIdFilters.length; i++) {
        OwningAccountInternalIdFilters[i] = (IntegerFilter)OwningAccountInternalIdFilter[i];
      }
      try {
        out.setOwningAccountInternalIdFilter(OwningAccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDtMap = (Map)record.get("ActiveDt");
    Boolean ActiveDtFetch = DataHelper.getFetch(ActiveDtMap);
    Boolean ActiveDtSortDir = DataHelper.getSortDirection(ActiveDtMap);
    Integer ActiveDtSortOrder = DataHelper.getSortOrder(ActiveDtMap);
    if (ActiveDtFetch != null) out.setActiveDtFetch(ActiveDtFetch);
    if (ActiveDtSortDir != null) out.setActiveDtSortDirection(ActiveDtSortDir);
    if (ActiveDtSortOrder != null) out.setActiveDtSortOrder(ActiveDtSortOrder);

    Filter[] ActiveDtFilter = DataHelper.mapToFilterArray(ActiveDtMap, Date.class);
    if (ActiveDtFilter != null) {
      DateFilter[] ActiveDtFilters = new DateFilter[ActiveDtFilter.length];
      for (int i = 0; i < ActiveDtFilters.length; i++) {
        ActiveDtFilters[i] = (DateFilter)ActiveDtFilter[i];
      }
      try {
        out.setActiveDtFilter(ActiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDtMap = (Map)record.get("InactiveDt");
    Boolean InactiveDtFetch = DataHelper.getFetch(InactiveDtMap);
    Boolean InactiveDtSortDir = DataHelper.getSortDirection(InactiveDtMap);
    Integer InactiveDtSortOrder = DataHelper.getSortOrder(InactiveDtMap);
    if (InactiveDtFetch != null) out.setInactiveDtFetch(InactiveDtFetch);
    if (InactiveDtSortDir != null) out.setInactiveDtSortDirection(InactiveDtSortDir);
    if (InactiveDtSortOrder != null) out.setInactiveDtSortOrder(InactiveDtSortOrder);

    Filter[] InactiveDtFilter = DataHelper.mapToFilterArray(InactiveDtMap, Date.class);
    if (InactiveDtFilter != null) {
      DateFilter[] InactiveDtFilters = new DateFilter[InactiveDtFilter.length];
      for (int i = 0; i < InactiveDtFilters.length; i++) {
        InactiveDtFilters[i] = (DateFilter)InactiveDtFilter[i];
      }
      try {
        out.setInactiveDtFilter(InactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDtMap = (Map)record.get("ChgDt");
    Boolean ChgDtFetch = DataHelper.getFetch(ChgDtMap);
    Boolean ChgDtSortDir = DataHelper.getSortDirection(ChgDtMap);
    Integer ChgDtSortOrder = DataHelper.getSortOrder(ChgDtMap);
    if (ChgDtFetch != null) out.setChgDtFetch(ChgDtFetch);
    if (ChgDtSortDir != null) out.setChgDtSortDirection(ChgDtSortDir);
    if (ChgDtSortOrder != null) out.setChgDtSortOrder(ChgDtSortOrder);

    Filter[] ChgDtFilter = DataHelper.mapToFilterArray(ChgDtMap, Date.class);
    if (ChgDtFilter != null) {
      DateFilter[] ChgDtFilters = new DateFilter[ChgDtFilter.length];
      for (int i = 0; i < ChgDtFilters.length; i++) {
        ChgDtFilters[i] = (DateFilter)ChgDtFilter[i];
      }
      try {
        out.setChgDtFilter(ChgDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgWhoMap = (Map)record.get("ChgWho");
    Boolean ChgWhoFetch = DataHelper.getFetch(ChgWhoMap);
    Boolean ChgWhoSortDir = DataHelper.getSortDirection(ChgWhoMap);
    Integer ChgWhoSortOrder = DataHelper.getSortOrder(ChgWhoMap);
    if (ChgWhoFetch != null) out.setChgWhoFetch(ChgWhoFetch);
    if (ChgWhoSortDir != null) out.setChgWhoSortDirection(ChgWhoSortDir);
    if (ChgWhoSortOrder != null) out.setChgWhoSortOrder(ChgWhoSortOrder);

    Filter[] ChgWhoFilter = DataHelper.mapToFilterArray(ChgWhoMap, String.class);
    if (ChgWhoFilter != null) {
      StringFilter[] ChgWhoFilters = new StringFilter[ChgWhoFilter.length];
      for (int i = 0; i < ChgWhoFilters.length; i++) {
        ChgWhoFilters[i] = (StringFilter)ChgWhoFilter[i];
      }
      try {
        out.setChgWhoFilter(ChgWhoFilters);
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
  
    Map NextBillDateMap = (Map)record.get("NextBillDate");
    Boolean NextBillDateFetch = DataHelper.getFetch(NextBillDateMap);
    Boolean NextBillDateSortDir = DataHelper.getSortDirection(NextBillDateMap);
    Integer NextBillDateSortOrder = DataHelper.getSortOrder(NextBillDateMap);
    if (NextBillDateFetch != null) out.setNextBillDateFetch(NextBillDateFetch);
    if (NextBillDateSortDir != null) out.setNextBillDateSortDirection(NextBillDateSortDir);
    if (NextBillDateSortOrder != null) out.setNextBillDateSortOrder(NextBillDateSortOrder);

    Filter[] NextBillDateFilter = DataHelper.mapToFilterArray(NextBillDateMap, Date.class);
    if (NextBillDateFilter != null) {
      DateFilter[] NextBillDateFilters = new DateFilter[NextBillDateFilter.length];
      for (int i = 0; i < NextBillDateFilters.length; i++) {
        NextBillDateFilters[i] = (DateFilter)NextBillDateFilter[i];
      }
      try {
        out.setNextBillDateFilter(NextBillDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevCutoffDateMap = (Map)record.get("PrevCutoffDate");
    Boolean PrevCutoffDateFetch = DataHelper.getFetch(PrevCutoffDateMap);
    Boolean PrevCutoffDateSortDir = DataHelper.getSortDirection(PrevCutoffDateMap);
    Integer PrevCutoffDateSortOrder = DataHelper.getSortOrder(PrevCutoffDateMap);
    if (PrevCutoffDateFetch != null) out.setPrevCutoffDateFetch(PrevCutoffDateFetch);
    if (PrevCutoffDateSortDir != null) out.setPrevCutoffDateSortDirection(PrevCutoffDateSortDir);
    if (PrevCutoffDateSortOrder != null) out.setPrevCutoffDateSortOrder(PrevCutoffDateSortOrder);

    Filter[] PrevCutoffDateFilter = DataHelper.mapToFilterArray(PrevCutoffDateMap, Date.class);
    if (PrevCutoffDateFilter != null) {
      DateFilter[] PrevCutoffDateFilters = new DateFilter[PrevCutoffDateFilter.length];
      for (int i = 0; i < PrevCutoffDateFilters.length; i++) {
        PrevCutoffDateFilters[i] = (DateFilter)PrevCutoffDateFilter[i];
      }
      try {
        out.setPrevCutoffDateFilter(PrevCutoffDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PriorityMap = (Map)record.get("Priority");
    Boolean PriorityFetch = DataHelper.getFetch(PriorityMap);
    Boolean PrioritySortDir = DataHelper.getSortDirection(PriorityMap);
    Integer PrioritySortOrder = DataHelper.getSortOrder(PriorityMap);
    if (PriorityFetch != null) out.setPriorityFetch(PriorityFetch);
    if (PrioritySortDir != null) out.setPrioritySortDirection(PrioritySortDir);
    if (PrioritySortOrder != null) out.setPrioritySortOrder(PrioritySortOrder);

    Filter[] PriorityFilter = DataHelper.mapToFilterArray(PriorityMap, Integer.class);
    if (PriorityFilter != null) {
      IntegerFilter[] PriorityFilters = new IntegerFilter[PriorityFilter.length];
      for (int i = 0; i < PriorityFilters.length; i++) {
        PriorityFilters[i] = (IntegerFilter)PriorityFilter[i];
      }
      try {
        out.setPriorityFilter(PriorityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GroupPurposeMap = (Map)record.get("GroupPurpose");
    Boolean GroupPurposeFetch = DataHelper.getFetch(GroupPurposeMap);
    Boolean GroupPurposeSortDir = DataHelper.getSortDirection(GroupPurposeMap);
    Integer GroupPurposeSortOrder = DataHelper.getSortOrder(GroupPurposeMap);
    if (GroupPurposeFetch != null) out.setGroupPurposeFetch(GroupPurposeFetch);
    if (GroupPurposeSortDir != null) out.setGroupPurposeSortDirection(GroupPurposeSortDir);
    if (GroupPurposeSortOrder != null) out.setGroupPurposeSortOrder(GroupPurposeSortOrder);

    Filter[] GroupPurposeFilter = DataHelper.mapToFilterArray(GroupPurposeMap, Integer.class);
    if (GroupPurposeFilter != null) {
      IntegerFilter[] GroupPurposeFilters = new IntegerFilter[GroupPurposeFilter.length];
      for (int i = 0; i < GroupPurposeFilters.length; i++) {
        GroupPurposeFilters[i] = (IntegerFilter)GroupPurposeFilter[i];
      }
      try {
        out.setGroupPurposeFilter(GroupPurposeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
