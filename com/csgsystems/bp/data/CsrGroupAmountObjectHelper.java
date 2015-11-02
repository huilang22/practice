/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupAmountObjectHelper.java
 * Definition File: Admin/CsrGroupAmount.xml
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



/** Helper class to convert CsrGroupAmountObject JavaBean objects to/from HashMaps.
 */
public class CsrGroupAmountObjectHelper implements ArubaObjectHelper
{
  /** convert CsrGroupAmountObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CsrGroupAmountObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrGroupAmountObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrGroupAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupAmountObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrGroupAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CsrGroupAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupAmountObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrGroupAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrGroupAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupAmountObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrGroupAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CsrGroupAmountObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CsrGroupAmountObjectData the converted object
   */
  public static CsrGroupAmountObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CsrGroupAmountObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CsrGroupAmountObject")
   * @return CsrGroupAmountObjectData the converted object
   */
  public static CsrGroupAmountObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CsrGroupAmountObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CsrGroupAmountObjectFilter the converted object
   */
  public static CsrGroupAmountObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CsrGroupAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CsrGroupAmountObject")
   * @return CsrGroupAmountObjectFilter the converted object
   */
  public static CsrGroupAmountObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CsrGroupAmountObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CsrGroupAmountObjectDataList the converted object
   */
  public static CsrGroupAmountObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CsrGroupAmountObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CsrGroupAmountObjectList")
   * @return CsrGroupAmountObjectDataList the converted object
   */
  public static CsrGroupAmountObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupAmountObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CsrGroupAmountObjectData[] array = null;
    if (root != null)
    {
      array = new CsrGroupAmountObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CsrGroupAmountObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CsrGroupAmountObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CsrGroupAmountObjectDataList (array, index, total);
  }
  /** convert CsrGroupAmountObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CsrGroupAmountObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CsrGroupAmountObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._MaxAmountSet) record.put ("MaxAmount", in.MaxAmount);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert CsrGroupAmountObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CsrGroupAmountObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CsrGroupAmountObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.MaxAmount, in.MaxAmountSort, in.MaxAmountSortAscending, in.MaxAmountFetch);
      if (map != null) record.put ("MaxAmount", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to CsrGroupAmountObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrGroupAmountObjectData the converted object
   */
  public static CsrGroupAmountObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrGroupAmountObjectData out = new CsrGroupAmountObjectData ();

    out.Key = CsrGroupAmountObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("MaxAmount")) != null)
    {
      out.MaxAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to CsrGroupAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrGroupAmountObjectFilter the converted object
   */
  public static CsrGroupAmountObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrGroupAmountObjectFilter out = new CsrGroupAmountObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CsrGroupAmountObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map MaxAmountMap = (Map)record.get("MaxAmount");
    Boolean MaxAmountFetch = DataHelper.getFetch(MaxAmountMap);
    Boolean MaxAmountSortDir = DataHelper.getSortDirection(MaxAmountMap);
    Integer MaxAmountSortOrder = DataHelper.getSortOrder(MaxAmountMap);
    if (MaxAmountFetch != null) out.setMaxAmountFetch(MaxAmountFetch);
    if (MaxAmountSortDir != null) out.setMaxAmountSortDirection(MaxAmountSortDir);
    if (MaxAmountSortOrder != null) out.setMaxAmountSortOrder(MaxAmountSortOrder);

    Filter[] MaxAmountFilter = DataHelper.mapToFilterArray(MaxAmountMap, BigInteger.class);
    if (MaxAmountFilter != null) {
      BigIntegerFilter[] MaxAmountFilters = new BigIntegerFilter[MaxAmountFilter.length];
      for (int i = 0; i < MaxAmountFilters.length; i++) {
        MaxAmountFilters[i] = (BigIntegerFilter)MaxAmountFilter[i];
      }
      try {
        out.setMaxAmountFilter(MaxAmountFilters);
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
