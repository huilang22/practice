/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInsertGroupMapObjectHelper.java
 * Definition File: Admin/BillInsertGroupMap.xml
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



/** Helper class to convert BillInsertGroupMapObject JavaBean objects to/from HashMaps.
 */
public class BillInsertGroupMapObjectHelper implements ArubaObjectHelper
{
  /** convert BillInsertGroupMapObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BillInsertGroupMapObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInsertGroupMapObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInsertGroupMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupMapObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInsertGroupMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BillInsertGroupMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupMapObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInsertGroupMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInsertGroupMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInsertGroupMapObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInsertGroupMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillInsertGroupMapObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BillInsertGroupMapObjectData the converted object
   */
  public static BillInsertGroupMapObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillInsertGroupMapObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillInsertGroupMapObject")
   * @return BillInsertGroupMapObjectData the converted object
   */
  public static BillInsertGroupMapObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInsertGroupMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillInsertGroupMapObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BillInsertGroupMapObjectFilter the converted object
   */
  public static BillInsertGroupMapObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillInsertGroupMapObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillInsertGroupMapObject")
   * @return BillInsertGroupMapObjectFilter the converted object
   */
  public static BillInsertGroupMapObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInsertGroupMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BillInsertGroupMapObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BillInsertGroupMapObjectDataList the converted object
   */
  public static BillInsertGroupMapObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BillInsertGroupMapObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BillInsertGroupMapObjectList")
   * @return BillInsertGroupMapObjectDataList the converted object
   */
  public static BillInsertGroupMapObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInsertGroupMapObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BillInsertGroupMapObjectData[] array = null;
    if (root != null)
    {
      array = new BillInsertGroupMapObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BillInsertGroupMapObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BillInsertGroupMapObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BillInsertGroupMapObjectDataList (array, index, total);
  }
  /** convert BillInsertGroupMapObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillInsertGroupMapObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", BillInsertGroupMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._InsertTriggerIdSet) record.put ("InsertTriggerId", in.InsertTriggerId);
  
    if (in._InsertBinNumSet) record.put ("InsertBinNum", in.InsertBinNum);
  
    if (in._IsRequiredSet) record.put ("IsRequired", in.IsRequired);
  
    if (in._PrioritySet) record.put ("Priority", in.Priority);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._InsertForeignKeySet) record.put ("InsertForeignKey", in.InsertForeignKey);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert BillInsertGroupMapObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillInsertGroupMapObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", BillInsertGroupMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.InsertTriggerId, in.InsertTriggerIdSort, in.InsertTriggerIdSortAscending, in.InsertTriggerIdFetch);
      if (map != null) record.put ("InsertTriggerId", map);
      map = DataHelper.filterToMap (in.InsertBinNum, in.InsertBinNumSort, in.InsertBinNumSortAscending, in.InsertBinNumFetch);
      if (map != null) record.put ("InsertBinNum", map);
      map = DataHelper.filterToMap (in.IsRequired, in.IsRequiredSort, in.IsRequiredSortAscending, in.IsRequiredFetch);
      if (map != null) record.put ("IsRequired", map);
      map = DataHelper.filterToMap (in.Priority, in.PrioritySort, in.PrioritySortAscending, in.PriorityFetch);
      if (map != null) record.put ("Priority", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.InsertForeignKey, in.InsertForeignKeySort, in.InsertForeignKeySortAscending, in.InsertForeignKeyFetch);
      if (map != null) record.put ("InsertForeignKey", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to BillInsertGroupMapObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInsertGroupMapObjectData the converted object
   */
  public static BillInsertGroupMapObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInsertGroupMapObjectData out = new BillInsertGroupMapObjectData ();

    out.Key = BillInsertGroupMapObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("InsertTriggerId")) != null)
    {
      out.InsertTriggerId = (Integer) obj;
    }
  
    if ((obj = record.get ("InsertBinNum")) != null)
    {
      out.InsertBinNum = (Integer) obj;
    }
  
    if ((obj = record.get ("IsRequired")) != null)
    {
      out.IsRequired = (Boolean) obj;
    }
  
    if ((obj = record.get ("Priority")) != null)
    {
      out.Priority = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InsertForeignKey")) != null)
    {
      out.InsertForeignKey = (Integer) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to BillInsertGroupMapObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInsertGroupMapObjectFilter the converted object
   */
  public static BillInsertGroupMapObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInsertGroupMapObjectFilter out = new BillInsertGroupMapObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = BillInsertGroupMapObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map InsertTriggerIdMap = (Map)record.get("InsertTriggerId");
    Boolean InsertTriggerIdFetch = DataHelper.getFetch(InsertTriggerIdMap);
    Boolean InsertTriggerIdSortDir = DataHelper.getSortDirection(InsertTriggerIdMap);
    Integer InsertTriggerIdSortOrder = DataHelper.getSortOrder(InsertTriggerIdMap);
    if (InsertTriggerIdFetch != null) out.setInsertTriggerIdFetch(InsertTriggerIdFetch);
    if (InsertTriggerIdSortDir != null) out.setInsertTriggerIdSortDirection(InsertTriggerIdSortDir);
    if (InsertTriggerIdSortOrder != null) out.setInsertTriggerIdSortOrder(InsertTriggerIdSortOrder);

    Filter[] InsertTriggerIdFilter = DataHelper.mapToFilterArray(InsertTriggerIdMap, Integer.class);
    if (InsertTriggerIdFilter != null) {
      IntegerFilter[] InsertTriggerIdFilters = new IntegerFilter[InsertTriggerIdFilter.length];
      for (int i = 0; i < InsertTriggerIdFilters.length; i++) {
        InsertTriggerIdFilters[i] = (IntegerFilter)InsertTriggerIdFilter[i];
      }
      try {
        out.setInsertTriggerIdFilter(InsertTriggerIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InsertBinNumMap = (Map)record.get("InsertBinNum");
    Boolean InsertBinNumFetch = DataHelper.getFetch(InsertBinNumMap);
    Boolean InsertBinNumSortDir = DataHelper.getSortDirection(InsertBinNumMap);
    Integer InsertBinNumSortOrder = DataHelper.getSortOrder(InsertBinNumMap);
    if (InsertBinNumFetch != null) out.setInsertBinNumFetch(InsertBinNumFetch);
    if (InsertBinNumSortDir != null) out.setInsertBinNumSortDirection(InsertBinNumSortDir);
    if (InsertBinNumSortOrder != null) out.setInsertBinNumSortOrder(InsertBinNumSortOrder);

    Filter[] InsertBinNumFilter = DataHelper.mapToFilterArray(InsertBinNumMap, Integer.class);
    if (InsertBinNumFilter != null) {
      IntegerFilter[] InsertBinNumFilters = new IntegerFilter[InsertBinNumFilter.length];
      for (int i = 0; i < InsertBinNumFilters.length; i++) {
        InsertBinNumFilters[i] = (IntegerFilter)InsertBinNumFilter[i];
      }
      try {
        out.setInsertBinNumFilter(InsertBinNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsRequiredMap = (Map)record.get("IsRequired");
    Boolean IsRequiredFetch = DataHelper.getFetch(IsRequiredMap);
    Boolean IsRequiredSortDir = DataHelper.getSortDirection(IsRequiredMap);
    Integer IsRequiredSortOrder = DataHelper.getSortOrder(IsRequiredMap);
    if (IsRequiredFetch != null) out.setIsRequiredFetch(IsRequiredFetch);
    if (IsRequiredSortDir != null) out.setIsRequiredSortDirection(IsRequiredSortDir);
    if (IsRequiredSortOrder != null) out.setIsRequiredSortOrder(IsRequiredSortOrder);

    Filter[] IsRequiredFilter = DataHelper.mapToFilterArray(IsRequiredMap, Boolean.class);
    if (IsRequiredFilter != null) {
      BooleanFilter[] IsRequiredFilters = new BooleanFilter[IsRequiredFilter.length];
      for (int i = 0; i < IsRequiredFilters.length; i++) {
        IsRequiredFilters[i] = (BooleanFilter)IsRequiredFilter[i];
      }
      try {
        out.setIsRequiredFilter(IsRequiredFilters);
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
  
    Map InsertForeignKeyMap = (Map)record.get("InsertForeignKey");
    Boolean InsertForeignKeyFetch = DataHelper.getFetch(InsertForeignKeyMap);
    Boolean InsertForeignKeySortDir = DataHelper.getSortDirection(InsertForeignKeyMap);
    Integer InsertForeignKeySortOrder = DataHelper.getSortOrder(InsertForeignKeyMap);
    if (InsertForeignKeyFetch != null) out.setInsertForeignKeyFetch(InsertForeignKeyFetch);
    if (InsertForeignKeySortDir != null) out.setInsertForeignKeySortDirection(InsertForeignKeySortDir);
    if (InsertForeignKeySortOrder != null) out.setInsertForeignKeySortOrder(InsertForeignKeySortOrder);

    Filter[] InsertForeignKeyFilter = DataHelper.mapToFilterArray(InsertForeignKeyMap, Integer.class);
    if (InsertForeignKeyFilter != null) {
      IntegerFilter[] InsertForeignKeyFilters = new IntegerFilter[InsertForeignKeyFilter.length];
      for (int i = 0; i < InsertForeignKeyFilters.length; i++) {
        InsertForeignKeyFilters[i] = (IntegerFilter)InsertForeignKeyFilter[i];
      }
      try {
        out.setInsertForeignKeyFilter(InsertForeignKeyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ConfigTagIdMap = (Map)record.get("ConfigTagId");
    Boolean ConfigTagIdFetch = DataHelper.getFetch(ConfigTagIdMap);
    Boolean ConfigTagIdSortDir = DataHelper.getSortDirection(ConfigTagIdMap);
    Integer ConfigTagIdSortOrder = DataHelper.getSortOrder(ConfigTagIdMap);
    if (ConfigTagIdFetch != null) out.setConfigTagIdFetch(ConfigTagIdFetch);
    if (ConfigTagIdSortDir != null) out.setConfigTagIdSortDirection(ConfigTagIdSortDir);
    if (ConfigTagIdSortOrder != null) out.setConfigTagIdSortOrder(ConfigTagIdSortOrder);

    Filter[] ConfigTagIdFilter = DataHelper.mapToFilterArray(ConfigTagIdMap, String.class);
    if (ConfigTagIdFilter != null) {
      StringFilter[] ConfigTagIdFilters = new StringFilter[ConfigTagIdFilter.length];
      for (int i = 0; i < ConfigTagIdFilters.length; i++) {
        ConfigTagIdFilters[i] = (StringFilter)ConfigTagIdFilter[i];
      }
      try {
        out.setConfigTagIdFilter(ConfigTagIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
