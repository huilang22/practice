/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupUsageRedirectMapObjectHelper.java
 * Definition File: Catalog/HqgroupUsageRedirectMap.xml
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



/** Helper class to convert HqGroupUsageRedirectMapObject JavaBean objects to/from HashMaps.
 */
public class HqGroupUsageRedirectMapObjectHelper implements ArubaObjectHelper
{
  /** convert HqGroupUsageRedirectMapObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HqGroupUsageRedirectMapObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupUsageRedirectMapObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupUsageRedirectMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupUsageRedirectMapObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupUsageRedirectMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HqGroupUsageRedirectMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupUsageRedirectMapObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupUsageRedirectMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupUsageRedirectMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupUsageRedirectMapObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupUsageRedirectMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HqGroupUsageRedirectMapObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupUsageRedirectMapObjectData the converted object
   */
  public static HqGroupUsageRedirectMapObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HqGroupUsageRedirectMapObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HqGroupUsageRedirectMapObject")
   * @return HqGroupUsageRedirectMapObjectData the converted object
   */
  public static HqGroupUsageRedirectMapObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupUsageRedirectMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HqGroupUsageRedirectMapObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupUsageRedirectMapObjectFilter the converted object
   */
  public static HqGroupUsageRedirectMapObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HqGroupUsageRedirectMapObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HqGroupUsageRedirectMapObject")
   * @return HqGroupUsageRedirectMapObjectFilter the converted object
   */
  public static HqGroupUsageRedirectMapObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupUsageRedirectMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HqGroupUsageRedirectMapObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HqGroupUsageRedirectMapObjectDataList the converted object
   */
  public static HqGroupUsageRedirectMapObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HqGroupUsageRedirectMapObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HqGroupUsageRedirectMapObjectList")
   * @return HqGroupUsageRedirectMapObjectDataList the converted object
   */
  public static HqGroupUsageRedirectMapObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupUsageRedirectMapObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HqGroupUsageRedirectMapObjectData[] array = null;
    if (root != null)
    {
      array = new HqGroupUsageRedirectMapObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HqGroupUsageRedirectMapObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HqGroupUsageRedirectMapObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HqGroupUsageRedirectMapObjectDataList (array, index, total);
  }
  /** convert HqGroupUsageRedirectMapObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupUsageRedirectMapObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HqGroupUsageRedirectMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ExternalIdSet) record.put ("ExternalId", in.ExternalId);
  
    if (in._ExternalIdTypeSet) record.put ("ExternalIdType", in.ExternalIdType);
  
    if (in._GroupIdSet) record.put ("GroupId", in.GroupId);
  
    if (in._GroupIdServSet) record.put ("GroupIdServ", in.GroupIdServ);
  
    if (in._UsageRedirectGroupSet) record.put ("UsageRedirectGroup", in.UsageRedirectGroup);
  
    if (in._BalanceAccountInternalIdSet) record.put ("BalanceAccountInternalId", in.BalanceAccountInternalId);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._OrderLevelSet) record.put ("OrderLevel", in.OrderLevel);
      return record;
  }
  /** convert HqGroupUsageRedirectMapObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupUsageRedirectMapObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HqGroupUsageRedirectMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ExternalId, in.ExternalIdSort, in.ExternalIdSortAscending, in.ExternalIdFetch, in.ExternalIdCaseInsensitive);
      if (map != null) record.put ("ExternalId", map);
      map = DataHelper.filterToMap (in.ExternalIdType, in.ExternalIdTypeSort, in.ExternalIdTypeSortAscending, in.ExternalIdTypeFetch);
      if (map != null) record.put ("ExternalIdType", map);
      map = DataHelper.filterToMap (in.GroupId, in.GroupIdSort, in.GroupIdSortAscending, in.GroupIdFetch);
      if (map != null) record.put ("GroupId", map);
      map = DataHelper.filterToMap (in.GroupIdServ, in.GroupIdServSort, in.GroupIdServSortAscending, in.GroupIdServFetch);
      if (map != null) record.put ("GroupIdServ", map);
      map = DataHelper.filterToMap (in.UsageRedirectGroup, in.UsageRedirectGroupSort, in.UsageRedirectGroupSortAscending, in.UsageRedirectGroupFetch);
      if (map != null) record.put ("UsageRedirectGroup", map);
      map = DataHelper.filterToMap (in.BalanceAccountInternalId, in.BalanceAccountInternalIdSort, in.BalanceAccountInternalIdSortAscending, in.BalanceAccountInternalIdFetch);
      if (map != null) record.put ("BalanceAccountInternalId", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.OrderLevel, in.OrderLevelSort, in.OrderLevelSortAscending, in.OrderLevelFetch);
      if (map != null) record.put ("OrderLevel", map);
    return record;
  }
  /** convert Map to HqGroupUsageRedirectMapObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupUsageRedirectMapObjectData the converted object
   */
  public static HqGroupUsageRedirectMapObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupUsageRedirectMapObjectData out = new HqGroupUsageRedirectMapObjectData ();

    out.Key = HqGroupUsageRedirectMapObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ExternalId")) != null)
    {
      out.ExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ExternalIdType")) != null)
    {
      out.ExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("GroupId")) != null)
    {
      out.GroupId = (Integer) obj;
    }
  
    if ((obj = record.get ("GroupIdServ")) != null)
    {
      out.GroupIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("UsageRedirectGroup")) != null)
    {
      out.UsageRedirectGroup = (Integer) obj;
    }
  
    if ((obj = record.get ("BalanceAccountInternalId")) != null)
    {
      out.BalanceAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("OrderLevel")) != null)
    {
      out.OrderLevel = (Integer) obj;
    }
      return out;
  }
  /** convert Map to HqGroupUsageRedirectMapObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupUsageRedirectMapObjectFilter the converted object
   */
  public static HqGroupUsageRedirectMapObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupUsageRedirectMapObjectFilter out = new HqGroupUsageRedirectMapObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HqGroupUsageRedirectMapObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map GroupIdMap = (Map)record.get("GroupId");
    Boolean GroupIdFetch = DataHelper.getFetch(GroupIdMap);
    Boolean GroupIdSortDir = DataHelper.getSortDirection(GroupIdMap);
    Integer GroupIdSortOrder = DataHelper.getSortOrder(GroupIdMap);
    if (GroupIdFetch != null) out.setGroupIdFetch(GroupIdFetch);
    if (GroupIdSortDir != null) out.setGroupIdSortDirection(GroupIdSortDir);
    if (GroupIdSortOrder != null) out.setGroupIdSortOrder(GroupIdSortOrder);

    Filter[] GroupIdFilter = DataHelper.mapToFilterArray(GroupIdMap, Integer.class);
    if (GroupIdFilter != null) {
      IntegerFilter[] GroupIdFilters = new IntegerFilter[GroupIdFilter.length];
      for (int i = 0; i < GroupIdFilters.length; i++) {
        GroupIdFilters[i] = (IntegerFilter)GroupIdFilter[i];
      }
      try {
        out.setGroupIdFilter(GroupIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GroupIdServMap = (Map)record.get("GroupIdServ");
    Boolean GroupIdServFetch = DataHelper.getFetch(GroupIdServMap);
    Boolean GroupIdServSortDir = DataHelper.getSortDirection(GroupIdServMap);
    Integer GroupIdServSortOrder = DataHelper.getSortOrder(GroupIdServMap);
    if (GroupIdServFetch != null) out.setGroupIdServFetch(GroupIdServFetch);
    if (GroupIdServSortDir != null) out.setGroupIdServSortDirection(GroupIdServSortDir);
    if (GroupIdServSortOrder != null) out.setGroupIdServSortOrder(GroupIdServSortOrder);

    Filter[] GroupIdServFilter = DataHelper.mapToFilterArray(GroupIdServMap, Integer.class);
    if (GroupIdServFilter != null) {
      IntegerFilter[] GroupIdServFilters = new IntegerFilter[GroupIdServFilter.length];
      for (int i = 0; i < GroupIdServFilters.length; i++) {
        GroupIdServFilters[i] = (IntegerFilter)GroupIdServFilter[i];
      }
      try {
        out.setGroupIdServFilter(GroupIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsageRedirectGroupMap = (Map)record.get("UsageRedirectGroup");
    Boolean UsageRedirectGroupFetch = DataHelper.getFetch(UsageRedirectGroupMap);
    Boolean UsageRedirectGroupSortDir = DataHelper.getSortDirection(UsageRedirectGroupMap);
    Integer UsageRedirectGroupSortOrder = DataHelper.getSortOrder(UsageRedirectGroupMap);
    if (UsageRedirectGroupFetch != null) out.setUsageRedirectGroupFetch(UsageRedirectGroupFetch);
    if (UsageRedirectGroupSortDir != null) out.setUsageRedirectGroupSortDirection(UsageRedirectGroupSortDir);
    if (UsageRedirectGroupSortOrder != null) out.setUsageRedirectGroupSortOrder(UsageRedirectGroupSortOrder);

    Filter[] UsageRedirectGroupFilter = DataHelper.mapToFilterArray(UsageRedirectGroupMap, Integer.class);
    if (UsageRedirectGroupFilter != null) {
      IntegerFilter[] UsageRedirectGroupFilters = new IntegerFilter[UsageRedirectGroupFilter.length];
      for (int i = 0; i < UsageRedirectGroupFilters.length; i++) {
        UsageRedirectGroupFilters[i] = (IntegerFilter)UsageRedirectGroupFilter[i];
      }
      try {
        out.setUsageRedirectGroupFilter(UsageRedirectGroupFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BalanceAccountInternalIdMap = (Map)record.get("BalanceAccountInternalId");
    Boolean BalanceAccountInternalIdFetch = DataHelper.getFetch(BalanceAccountInternalIdMap);
    Boolean BalanceAccountInternalIdSortDir = DataHelper.getSortDirection(BalanceAccountInternalIdMap);
    Integer BalanceAccountInternalIdSortOrder = DataHelper.getSortOrder(BalanceAccountInternalIdMap);
    if (BalanceAccountInternalIdFetch != null) out.setBalanceAccountInternalIdFetch(BalanceAccountInternalIdFetch);
    if (BalanceAccountInternalIdSortDir != null) out.setBalanceAccountInternalIdSortDirection(BalanceAccountInternalIdSortDir);
    if (BalanceAccountInternalIdSortOrder != null) out.setBalanceAccountInternalIdSortOrder(BalanceAccountInternalIdSortOrder);

    Filter[] BalanceAccountInternalIdFilter = DataHelper.mapToFilterArray(BalanceAccountInternalIdMap, Integer.class);
    if (BalanceAccountInternalIdFilter != null) {
      IntegerFilter[] BalanceAccountInternalIdFilters = new IntegerFilter[BalanceAccountInternalIdFilter.length];
      for (int i = 0; i < BalanceAccountInternalIdFilters.length; i++) {
        BalanceAccountInternalIdFilters[i] = (IntegerFilter)BalanceAccountInternalIdFilter[i];
      }
      try {
        out.setBalanceAccountInternalIdFilter(BalanceAccountInternalIdFilters);
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
  
    Map OrderLevelMap = (Map)record.get("OrderLevel");
    Boolean OrderLevelFetch = DataHelper.getFetch(OrderLevelMap);
    Boolean OrderLevelSortDir = DataHelper.getSortDirection(OrderLevelMap);
    Integer OrderLevelSortOrder = DataHelper.getSortOrder(OrderLevelMap);
    if (OrderLevelFetch != null) out.setOrderLevelFetch(OrderLevelFetch);
    if (OrderLevelSortDir != null) out.setOrderLevelSortDirection(OrderLevelSortDir);
    if (OrderLevelSortOrder != null) out.setOrderLevelSortOrder(OrderLevelSortOrder);

    Filter[] OrderLevelFilter = DataHelper.mapToFilterArray(OrderLevelMap, Integer.class);
    if (OrderLevelFilter != null) {
      IntegerFilter[] OrderLevelFilters = new IntegerFilter[OrderLevelFilter.length];
      for (int i = 0; i < OrderLevelFilters.length; i++) {
        OrderLevelFilters[i] = (IntegerFilter)OrderLevelFilter[i];
      }
      try {
        out.setOrderLevelFilter(OrderLevelFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
