/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiAutoPayCmfMapObjectHelper.java
 * Definition File: Customer/AbiAutoPayCmfMap.xml
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



/** Helper class to convert AbiAutoPayCmfMapObject JavaBean objects to/from HashMaps.
 */
public class AbiAutoPayCmfMapObjectHelper implements ArubaObjectHelper
{
  /** convert AbiAutoPayCmfMapObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AbiAutoPayCmfMapObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiAutoPayCmfMapObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiAutoPayCmfMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiAutoPayCmfMapObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiAutoPayCmfMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AbiAutoPayCmfMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiAutoPayCmfMapObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiAutoPayCmfMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiAutoPayCmfMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiAutoPayCmfMapObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiAutoPayCmfMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AbiAutoPayCmfMapObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AbiAutoPayCmfMapObjectData the converted object
   */
  public static AbiAutoPayCmfMapObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AbiAutoPayCmfMapObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AbiAutoPayCmfMapObject")
   * @return AbiAutoPayCmfMapObjectData the converted object
   */
  public static AbiAutoPayCmfMapObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiAutoPayCmfMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AbiAutoPayCmfMapObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AbiAutoPayCmfMapObjectFilter the converted object
   */
  public static AbiAutoPayCmfMapObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AbiAutoPayCmfMapObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AbiAutoPayCmfMapObject")
   * @return AbiAutoPayCmfMapObjectFilter the converted object
   */
  public static AbiAutoPayCmfMapObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiAutoPayCmfMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AbiAutoPayCmfMapObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AbiAutoPayCmfMapObjectDataList the converted object
   */
  public static AbiAutoPayCmfMapObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AbiAutoPayCmfMapObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AbiAutoPayCmfMapObjectList")
   * @return AbiAutoPayCmfMapObjectDataList the converted object
   */
  public static AbiAutoPayCmfMapObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiAutoPayCmfMapObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AbiAutoPayCmfMapObjectData[] array = null;
    if (root != null)
    {
      array = new AbiAutoPayCmfMapObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AbiAutoPayCmfMapObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AbiAutoPayCmfMapObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AbiAutoPayCmfMapObjectDataList (array, index, total);
  }
  /** convert AbiAutoPayCmfMapObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AbiAutoPayCmfMapObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AbiAutoPayCmfMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._LobIdSet) record.put ("LobId", in.LobId);
      return record;
  }
  /** convert AbiAutoPayCmfMapObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AbiAutoPayCmfMapObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AbiAutoPayCmfMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.LobId, in.LobIdSort, in.LobIdSortAscending, in.LobIdFetch);
      if (map != null) record.put ("LobId", map);
    return record;
  }
  /** convert Map to AbiAutoPayCmfMapObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiAutoPayCmfMapObjectData the converted object
   */
  public static AbiAutoPayCmfMapObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiAutoPayCmfMapObjectData out = new AbiAutoPayCmfMapObjectData ();

    out.Key = AbiAutoPayCmfMapObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("LobId")) != null)
    {
      out.LobId = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to AbiAutoPayCmfMapObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiAutoPayCmfMapObjectFilter the converted object
   */
  public static AbiAutoPayCmfMapObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiAutoPayCmfMapObjectFilter out = new AbiAutoPayCmfMapObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AbiAutoPayCmfMapObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map LobIdMap = (Map)record.get("LobId");
    Boolean LobIdFetch = DataHelper.getFetch(LobIdMap);
    Boolean LobIdSortDir = DataHelper.getSortDirection(LobIdMap);
    Integer LobIdSortOrder = DataHelper.getSortOrder(LobIdMap);
    if (LobIdFetch != null) out.setLobIdFetch(LobIdFetch);
    if (LobIdSortDir != null) out.setLobIdSortDirection(LobIdSortDir);
    if (LobIdSortOrder != null) out.setLobIdSortOrder(LobIdSortOrder);

    Filter[] LobIdFilter = DataHelper.mapToFilterArray(LobIdMap, BigInteger.class);
    if (LobIdFilter != null) {
      BigIntegerFilter[] LobIdFilters = new BigIntegerFilter[LobIdFilter.length];
      for (int i = 0; i < LobIdFilters.length; i++) {
        LobIdFilters[i] = (BigIntegerFilter)LobIdFilter[i];
      }
      try {
        out.setLobIdFilter(LobIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
