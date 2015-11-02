/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NetActionObjectHelper.java
 * Definition File: Admin/NetAction.xml
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



/** Helper class to convert NetActionObject JavaBean objects to/from HashMaps.
 */
public class NetActionObjectHelper implements ArubaObjectHelper
{
  /** convert NetActionObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (NetActionObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NetActionObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NetActionObject")
   * @return Map     the output Map
   */
  public static Map toMap (NetActionObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NetActionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert NetActionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NetActionObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NetActionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NetActionObject")
   * @return Map     the output Map
   */
  public static Map toMap (NetActionObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NetActionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to NetActionObjectData.
   * @param record the Map containing the data to convert to the object
   * @return NetActionObjectData the converted object
   */
  public static NetActionObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to NetActionObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "NetActionObject")
   * @return NetActionObjectData the converted object
   */
  public static NetActionObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NetActionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to NetActionObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return NetActionObjectFilter the converted object
   */
  public static NetActionObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to NetActionObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "NetActionObject")
   * @return NetActionObjectFilter the converted object
   */
  public static NetActionObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "NetActionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to NetActionObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return NetActionObjectDataList the converted object
   */
  public static NetActionObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to NetActionObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "NetActionObjectList")
   * @return NetActionObjectDataList the converted object
   */
  public static NetActionObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NetActionObjectList";
    Object[] root = (Object[]) record.get (rootName);
    NetActionObjectData[] array = null;
    if (root != null)
    {
      array = new NetActionObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = NetActionObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new NetActionObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new NetActionObjectDataList (array, index, total);
  }
  /** convert NetActionObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (NetActionObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", NetActionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._NetInterfaceIdSet) record.put ("NetInterfaceId", in.NetInterfaceId);
  
    if (in._NetActionIdSet) record.put ("NetActionId", in.NetActionId);
  
    if (in._IsImmediateSet) record.put ("IsImmediate", in.IsImmediate);
  
    if (in._CgiUrlSet) record.put ("CgiUrl", in.CgiUrl);
      return record;
  }
  /** convert NetActionObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (NetActionObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", NetActionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.NetInterfaceId, in.NetInterfaceIdSort, in.NetInterfaceIdSortAscending, in.NetInterfaceIdFetch);
      if (map != null) record.put ("NetInterfaceId", map);
      map = DataHelper.filterToMap (in.NetActionId, in.NetActionIdSort, in.NetActionIdSortAscending, in.NetActionIdFetch);
      if (map != null) record.put ("NetActionId", map);
      map = DataHelper.filterToMap (in.IsImmediate, in.IsImmediateSort, in.IsImmediateSortAscending, in.IsImmediateFetch);
      if (map != null) record.put ("IsImmediate", map);
      map = DataHelper.filterToMap (in.CgiUrl, in.CgiUrlSort, in.CgiUrlSortAscending, in.CgiUrlFetch, in.CgiUrlCaseInsensitive);
      if (map != null) record.put ("CgiUrl", map);
    return record;
  }
  /** convert Map to NetActionObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NetActionObjectData the converted object
   */
  public static NetActionObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NetActionObjectData out = new NetActionObjectData ();

    out.Key = NetActionObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
  
    if ((obj = record.get ("NetInterfaceId")) != null)
    {
      out.NetInterfaceId = (Integer) obj;
    }
  
    if ((obj = record.get ("NetActionId")) != null)
    {
      out.NetActionId = (Integer) obj;
    }
  
    if ((obj = record.get ("IsImmediate")) != null)
    {
      out.IsImmediate = (Boolean) obj;
    }
  
    if ((obj = record.get ("CgiUrl")) != null)
    {
      out.CgiUrl = (String) obj;
    }
      return out;
  }
  /** convert Map to NetActionObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NetActionObjectFilter the converted object
   */
  public static NetActionObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NetActionObjectFilter out = new NetActionObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = NetActionObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map IsDefaultMap = (Map)record.get("IsDefault");
    Boolean IsDefaultFetch = DataHelper.getFetch(IsDefaultMap);
    Boolean IsDefaultSortDir = DataHelper.getSortDirection(IsDefaultMap);
    Integer IsDefaultSortOrder = DataHelper.getSortOrder(IsDefaultMap);
    if (IsDefaultFetch != null) out.setIsDefaultFetch(IsDefaultFetch);
    if (IsDefaultSortDir != null) out.setIsDefaultSortDirection(IsDefaultSortDir);
    if (IsDefaultSortOrder != null) out.setIsDefaultSortOrder(IsDefaultSortOrder);

    Filter[] IsDefaultFilter = DataHelper.mapToFilterArray(IsDefaultMap, Boolean.class);
    if (IsDefaultFilter != null) {
      BooleanFilter[] IsDefaultFilters = new BooleanFilter[IsDefaultFilter.length];
      for (int i = 0; i < IsDefaultFilters.length; i++) {
        IsDefaultFilters[i] = (BooleanFilter)IsDefaultFilter[i];
      }
      try {
        out.setIsDefaultFilter(IsDefaultFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsInternalMap = (Map)record.get("IsInternal");
    Boolean IsInternalFetch = DataHelper.getFetch(IsInternalMap);
    Boolean IsInternalSortDir = DataHelper.getSortDirection(IsInternalMap);
    Integer IsInternalSortOrder = DataHelper.getSortOrder(IsInternalMap);
    if (IsInternalFetch != null) out.setIsInternalFetch(IsInternalFetch);
    if (IsInternalSortDir != null) out.setIsInternalSortDirection(IsInternalSortDir);
    if (IsInternalSortOrder != null) out.setIsInternalSortOrder(IsInternalSortOrder);

    Filter[] IsInternalFilter = DataHelper.mapToFilterArray(IsInternalMap, Boolean.class);
    if (IsInternalFilter != null) {
      BooleanFilter[] IsInternalFilters = new BooleanFilter[IsInternalFilter.length];
      for (int i = 0; i < IsInternalFilters.length; i++) {
        IsInternalFilters[i] = (BooleanFilter)IsInternalFilter[i];
      }
      try {
        out.setIsInternalFilter(IsInternalFilters);
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
  
    Map NetInterfaceIdMap = (Map)record.get("NetInterfaceId");
    Boolean NetInterfaceIdFetch = DataHelper.getFetch(NetInterfaceIdMap);
    Boolean NetInterfaceIdSortDir = DataHelper.getSortDirection(NetInterfaceIdMap);
    Integer NetInterfaceIdSortOrder = DataHelper.getSortOrder(NetInterfaceIdMap);
    if (NetInterfaceIdFetch != null) out.setNetInterfaceIdFetch(NetInterfaceIdFetch);
    if (NetInterfaceIdSortDir != null) out.setNetInterfaceIdSortDirection(NetInterfaceIdSortDir);
    if (NetInterfaceIdSortOrder != null) out.setNetInterfaceIdSortOrder(NetInterfaceIdSortOrder);

    Filter[] NetInterfaceIdFilter = DataHelper.mapToFilterArray(NetInterfaceIdMap, Integer.class);
    if (NetInterfaceIdFilter != null) {
      IntegerFilter[] NetInterfaceIdFilters = new IntegerFilter[NetInterfaceIdFilter.length];
      for (int i = 0; i < NetInterfaceIdFilters.length; i++) {
        NetInterfaceIdFilters[i] = (IntegerFilter)NetInterfaceIdFilter[i];
      }
      try {
        out.setNetInterfaceIdFilter(NetInterfaceIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NetActionIdMap = (Map)record.get("NetActionId");
    Boolean NetActionIdFetch = DataHelper.getFetch(NetActionIdMap);
    Boolean NetActionIdSortDir = DataHelper.getSortDirection(NetActionIdMap);
    Integer NetActionIdSortOrder = DataHelper.getSortOrder(NetActionIdMap);
    if (NetActionIdFetch != null) out.setNetActionIdFetch(NetActionIdFetch);
    if (NetActionIdSortDir != null) out.setNetActionIdSortDirection(NetActionIdSortDir);
    if (NetActionIdSortOrder != null) out.setNetActionIdSortOrder(NetActionIdSortOrder);

    Filter[] NetActionIdFilter = DataHelper.mapToFilterArray(NetActionIdMap, Integer.class);
    if (NetActionIdFilter != null) {
      IntegerFilter[] NetActionIdFilters = new IntegerFilter[NetActionIdFilter.length];
      for (int i = 0; i < NetActionIdFilters.length; i++) {
        NetActionIdFilters[i] = (IntegerFilter)NetActionIdFilter[i];
      }
      try {
        out.setNetActionIdFilter(NetActionIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsImmediateMap = (Map)record.get("IsImmediate");
    Boolean IsImmediateFetch = DataHelper.getFetch(IsImmediateMap);
    Boolean IsImmediateSortDir = DataHelper.getSortDirection(IsImmediateMap);
    Integer IsImmediateSortOrder = DataHelper.getSortOrder(IsImmediateMap);
    if (IsImmediateFetch != null) out.setIsImmediateFetch(IsImmediateFetch);
    if (IsImmediateSortDir != null) out.setIsImmediateSortDirection(IsImmediateSortDir);
    if (IsImmediateSortOrder != null) out.setIsImmediateSortOrder(IsImmediateSortOrder);

    Filter[] IsImmediateFilter = DataHelper.mapToFilterArray(IsImmediateMap, Boolean.class);
    if (IsImmediateFilter != null) {
      BooleanFilter[] IsImmediateFilters = new BooleanFilter[IsImmediateFilter.length];
      for (int i = 0; i < IsImmediateFilters.length; i++) {
        IsImmediateFilters[i] = (BooleanFilter)IsImmediateFilter[i];
      }
      try {
        out.setIsImmediateFilter(IsImmediateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CgiUrlMap = (Map)record.get("CgiUrl");
    Boolean CgiUrlFetch = DataHelper.getFetch(CgiUrlMap);
    Boolean CgiUrlSortDir = DataHelper.getSortDirection(CgiUrlMap);
    Integer CgiUrlSortOrder = DataHelper.getSortOrder(CgiUrlMap);
    if (CgiUrlFetch != null) out.setCgiUrlFetch(CgiUrlFetch);
    if (CgiUrlSortDir != null) out.setCgiUrlSortDirection(CgiUrlSortDir);
    if (CgiUrlSortOrder != null) out.setCgiUrlSortOrder(CgiUrlSortOrder);

    Filter[] CgiUrlFilter = DataHelper.mapToFilterArray(CgiUrlMap, String.class);
    if (CgiUrlFilter != null) {
      StringFilter[] CgiUrlFilters = new StringFilter[CgiUrlFilter.length];
      for (int i = 0; i < CgiUrlFilters.length; i++) {
        CgiUrlFilters[i] = (StringFilter)CgiUrlFilter[i];
      }
      try {
        out.setCgiUrlFilter(CgiUrlFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
