/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RewardBalanceEntityMappingObjectHelper.java
 * Definition File: Admin/RewardBalanceEntityMapping.xml
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



/** Helper class to convert RewardBalanceEntityMappingObject JavaBean objects to/from HashMaps.
 */
public class RewardBalanceEntityMappingObjectHelper implements ArubaObjectHelper
{
  /** convert RewardBalanceEntityMappingObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (RewardBalanceEntityMappingObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RewardBalanceEntityMappingObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RewardBalanceEntityMappingObject")
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceEntityMappingObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RewardBalanceEntityMappingObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert RewardBalanceEntityMappingObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceEntityMappingObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RewardBalanceEntityMappingObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RewardBalanceEntityMappingObject")
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceEntityMappingObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RewardBalanceEntityMappingObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RewardBalanceEntityMappingObjectData.
   * @param record the Map containing the data to convert to the object
   * @return RewardBalanceEntityMappingObjectData the converted object
   */
  public static RewardBalanceEntityMappingObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RewardBalanceEntityMappingObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RewardBalanceEntityMappingObject")
   * @return RewardBalanceEntityMappingObjectData the converted object
   */
  public static RewardBalanceEntityMappingObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RewardBalanceEntityMappingObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RewardBalanceEntityMappingObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return RewardBalanceEntityMappingObjectFilter the converted object
   */
  public static RewardBalanceEntityMappingObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RewardBalanceEntityMappingObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RewardBalanceEntityMappingObject")
   * @return RewardBalanceEntityMappingObjectFilter the converted object
   */
  public static RewardBalanceEntityMappingObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RewardBalanceEntityMappingObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to RewardBalanceEntityMappingObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return RewardBalanceEntityMappingObjectDataList the converted object
   */
  public static RewardBalanceEntityMappingObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to RewardBalanceEntityMappingObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "RewardBalanceEntityMappingObjectList")
   * @return RewardBalanceEntityMappingObjectDataList the converted object
   */
  public static RewardBalanceEntityMappingObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RewardBalanceEntityMappingObjectList";
    Object[] root = (Object[]) record.get (rootName);
    RewardBalanceEntityMappingObjectData[] array = null;
    if (root != null)
    {
      array = new RewardBalanceEntityMappingObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = RewardBalanceEntityMappingObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new RewardBalanceEntityMappingObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new RewardBalanceEntityMappingObjectDataList (array, index, total);
  }
  /** convert RewardBalanceEntityMappingObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RewardBalanceEntityMappingObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", RewardBalanceEntityMappingObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._RewardBalanceIdSet) record.put ("RewardBalanceId", in.RewardBalanceId);
  
    if (in._EntityId1Set) record.put ("EntityId1", in.EntityId1);
  
    if (in._EntityId2Set) record.put ("EntityId2", in.EntityId2);
  
    if (in._EntityId3Set) record.put ("EntityId3", in.EntityId3);
      return record;
  }
  /** convert RewardBalanceEntityMappingObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RewardBalanceEntityMappingObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", RewardBalanceEntityMappingObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.RewardBalanceId, in.RewardBalanceIdSort, in.RewardBalanceIdSortAscending, in.RewardBalanceIdFetch);
      if (map != null) record.put ("RewardBalanceId", map);
      map = DataHelper.filterToMap (in.EntityId1, in.EntityId1Sort, in.EntityId1SortAscending, in.EntityId1Fetch);
      if (map != null) record.put ("EntityId1", map);
      map = DataHelper.filterToMap (in.EntityId2, in.EntityId2Sort, in.EntityId2SortAscending, in.EntityId2Fetch);
      if (map != null) record.put ("EntityId2", map);
      map = DataHelper.filterToMap (in.EntityId3, in.EntityId3Sort, in.EntityId3SortAscending, in.EntityId3Fetch);
      if (map != null) record.put ("EntityId3", map);
    return record;
  }
  /** convert Map to RewardBalanceEntityMappingObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RewardBalanceEntityMappingObjectData the converted object
   */
  public static RewardBalanceEntityMappingObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RewardBalanceEntityMappingObjectData out = new RewardBalanceEntityMappingObjectData ();

    out.Key = RewardBalanceEntityMappingObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("RewardBalanceId")) != null)
    {
      out.RewardBalanceId = (Integer) obj;
    }
  
    if ((obj = record.get ("EntityId1")) != null)
    {
      out.EntityId1 = (Integer) obj;
    }
  
    if ((obj = record.get ("EntityId2")) != null)
    {
      out.EntityId2 = (Integer) obj;
    }
  
    if ((obj = record.get ("EntityId3")) != null)
    {
      out.EntityId3 = (Integer) obj;
    }
      return out;
  }
  /** convert Map to RewardBalanceEntityMappingObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RewardBalanceEntityMappingObjectFilter the converted object
   */
  public static RewardBalanceEntityMappingObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RewardBalanceEntityMappingObjectFilter out = new RewardBalanceEntityMappingObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = RewardBalanceEntityMappingObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map RewardBalanceIdMap = (Map)record.get("RewardBalanceId");
    Boolean RewardBalanceIdFetch = DataHelper.getFetch(RewardBalanceIdMap);
    Boolean RewardBalanceIdSortDir = DataHelper.getSortDirection(RewardBalanceIdMap);
    Integer RewardBalanceIdSortOrder = DataHelper.getSortOrder(RewardBalanceIdMap);
    if (RewardBalanceIdFetch != null) out.setRewardBalanceIdFetch(RewardBalanceIdFetch);
    if (RewardBalanceIdSortDir != null) out.setRewardBalanceIdSortDirection(RewardBalanceIdSortDir);
    if (RewardBalanceIdSortOrder != null) out.setRewardBalanceIdSortOrder(RewardBalanceIdSortOrder);

    Filter[] RewardBalanceIdFilter = DataHelper.mapToFilterArray(RewardBalanceIdMap, Integer.class);
    if (RewardBalanceIdFilter != null) {
      IntegerFilter[] RewardBalanceIdFilters = new IntegerFilter[RewardBalanceIdFilter.length];
      for (int i = 0; i < RewardBalanceIdFilters.length; i++) {
        RewardBalanceIdFilters[i] = (IntegerFilter)RewardBalanceIdFilter[i];
      }
      try {
        out.setRewardBalanceIdFilter(RewardBalanceIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EntityId1Map = (Map)record.get("EntityId1");
    Boolean EntityId1Fetch = DataHelper.getFetch(EntityId1Map);
    Boolean EntityId1SortDir = DataHelper.getSortDirection(EntityId1Map);
    Integer EntityId1SortOrder = DataHelper.getSortOrder(EntityId1Map);
    if (EntityId1Fetch != null) out.setEntityId1Fetch(EntityId1Fetch);
    if (EntityId1SortDir != null) out.setEntityId1SortDirection(EntityId1SortDir);
    if (EntityId1SortOrder != null) out.setEntityId1SortOrder(EntityId1SortOrder);

    Filter[] EntityId1Filter = DataHelper.mapToFilterArray(EntityId1Map, Integer.class);
    if (EntityId1Filter != null) {
      IntegerFilter[] EntityId1Filters = new IntegerFilter[EntityId1Filter.length];
      for (int i = 0; i < EntityId1Filters.length; i++) {
        EntityId1Filters[i] = (IntegerFilter)EntityId1Filter[i];
      }
      try {
        out.setEntityId1Filter(EntityId1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EntityId2Map = (Map)record.get("EntityId2");
    Boolean EntityId2Fetch = DataHelper.getFetch(EntityId2Map);
    Boolean EntityId2SortDir = DataHelper.getSortDirection(EntityId2Map);
    Integer EntityId2SortOrder = DataHelper.getSortOrder(EntityId2Map);
    if (EntityId2Fetch != null) out.setEntityId2Fetch(EntityId2Fetch);
    if (EntityId2SortDir != null) out.setEntityId2SortDirection(EntityId2SortDir);
    if (EntityId2SortOrder != null) out.setEntityId2SortOrder(EntityId2SortOrder);

    Filter[] EntityId2Filter = DataHelper.mapToFilterArray(EntityId2Map, Integer.class);
    if (EntityId2Filter != null) {
      IntegerFilter[] EntityId2Filters = new IntegerFilter[EntityId2Filter.length];
      for (int i = 0; i < EntityId2Filters.length; i++) {
        EntityId2Filters[i] = (IntegerFilter)EntityId2Filter[i];
      }
      try {
        out.setEntityId2Filter(EntityId2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EntityId3Map = (Map)record.get("EntityId3");
    Boolean EntityId3Fetch = DataHelper.getFetch(EntityId3Map);
    Boolean EntityId3SortDir = DataHelper.getSortDirection(EntityId3Map);
    Integer EntityId3SortOrder = DataHelper.getSortOrder(EntityId3Map);
    if (EntityId3Fetch != null) out.setEntityId3Fetch(EntityId3Fetch);
    if (EntityId3SortDir != null) out.setEntityId3SortDirection(EntityId3SortDir);
    if (EntityId3SortOrder != null) out.setEntityId3SortOrder(EntityId3SortOrder);

    Filter[] EntityId3Filter = DataHelper.mapToFilterArray(EntityId3Map, Integer.class);
    if (EntityId3Filter != null) {
      IntegerFilter[] EntityId3Filters = new IntegerFilter[EntityId3Filter.length];
      for (int i = 0; i < EntityId3Filters.length; i++) {
        EntityId3Filters[i] = (IntegerFilter)EntityId3Filter[i];
      }
      try {
        out.setEntityId3Filter(EntityId3Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
