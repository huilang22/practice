/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtCurrencyCodeMapObjectHelper.java
 * Definition File: Admin/AxrtCurrencyCodeMap.xml
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



/** Helper class to convert AxrtCurrencyCodeMapObject JavaBean objects to/from HashMaps.
 */
public class AxrtCurrencyCodeMapObjectHelper implements ArubaObjectHelper
{
  /** convert AxrtCurrencyCodeMapObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AxrtCurrencyCodeMapObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtCurrencyCodeMapObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtCurrencyCodeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrencyCodeMapObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtCurrencyCodeMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AxrtCurrencyCodeMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrencyCodeMapObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtCurrencyCodeMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtCurrencyCodeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrencyCodeMapObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtCurrencyCodeMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AxrtCurrencyCodeMapObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AxrtCurrencyCodeMapObjectData the converted object
   */
  public static AxrtCurrencyCodeMapObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AxrtCurrencyCodeMapObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AxrtCurrencyCodeMapObject")
   * @return AxrtCurrencyCodeMapObjectData the converted object
   */
  public static AxrtCurrencyCodeMapObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtCurrencyCodeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AxrtCurrencyCodeMapObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AxrtCurrencyCodeMapObjectFilter the converted object
   */
  public static AxrtCurrencyCodeMapObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AxrtCurrencyCodeMapObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AxrtCurrencyCodeMapObject")
   * @return AxrtCurrencyCodeMapObjectFilter the converted object
   */
  public static AxrtCurrencyCodeMapObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtCurrencyCodeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AxrtCurrencyCodeMapObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AxrtCurrencyCodeMapObjectDataList the converted object
   */
  public static AxrtCurrencyCodeMapObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AxrtCurrencyCodeMapObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AxrtCurrencyCodeMapObjectList")
   * @return AxrtCurrencyCodeMapObjectDataList the converted object
   */
  public static AxrtCurrencyCodeMapObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtCurrencyCodeMapObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AxrtCurrencyCodeMapObjectData[] array = null;
    if (root != null)
    {
      array = new AxrtCurrencyCodeMapObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AxrtCurrencyCodeMapObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AxrtCurrencyCodeMapObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AxrtCurrencyCodeMapObjectDataList (array, index, total);
  }
  /** convert AxrtCurrencyCodeMapObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AxrtCurrencyCodeMapObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AxrtCurrencyCodeMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._IsoCurrencyCodeSet) record.put ("IsoCurrencyCode", in.IsoCurrencyCode);
  
    if (in._DescriptionSet) record.put ("Description", in.Description);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert AxrtCurrencyCodeMapObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AxrtCurrencyCodeMapObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AxrtCurrencyCodeMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.IsoCurrencyCode, in.IsoCurrencyCodeSort, in.IsoCurrencyCodeSortAscending, in.IsoCurrencyCodeFetch, in.IsoCurrencyCodeCaseInsensitive);
      if (map != null) record.put ("IsoCurrencyCode", map);
      map = DataHelper.filterToMap (in.Description, in.DescriptionSort, in.DescriptionSortAscending, in.DescriptionFetch, in.DescriptionCaseInsensitive);
      if (map != null) record.put ("Description", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to AxrtCurrencyCodeMapObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtCurrencyCodeMapObjectData the converted object
   */
  public static AxrtCurrencyCodeMapObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtCurrencyCodeMapObjectData out = new AxrtCurrencyCodeMapObjectData ();

    out.Key = AxrtCurrencyCodeMapObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("IsoCurrencyCode")) != null)
    {
      out.IsoCurrencyCode = (String) obj;
    }
  
    if ((obj = record.get ("Description")) != null)
    {
      out.Description = (String) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to AxrtCurrencyCodeMapObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtCurrencyCodeMapObjectFilter the converted object
   */
  public static AxrtCurrencyCodeMapObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtCurrencyCodeMapObjectFilter out = new AxrtCurrencyCodeMapObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AxrtCurrencyCodeMapObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map IsoCurrencyCodeMap = (Map)record.get("IsoCurrencyCode");
    Boolean IsoCurrencyCodeFetch = DataHelper.getFetch(IsoCurrencyCodeMap);
    Boolean IsoCurrencyCodeSortDir = DataHelper.getSortDirection(IsoCurrencyCodeMap);
    Integer IsoCurrencyCodeSortOrder = DataHelper.getSortOrder(IsoCurrencyCodeMap);
    if (IsoCurrencyCodeFetch != null) out.setIsoCurrencyCodeFetch(IsoCurrencyCodeFetch);
    if (IsoCurrencyCodeSortDir != null) out.setIsoCurrencyCodeSortDirection(IsoCurrencyCodeSortDir);
    if (IsoCurrencyCodeSortOrder != null) out.setIsoCurrencyCodeSortOrder(IsoCurrencyCodeSortOrder);

    Filter[] IsoCurrencyCodeFilter = DataHelper.mapToFilterArray(IsoCurrencyCodeMap, String.class);
    if (IsoCurrencyCodeFilter != null) {
      StringFilter[] IsoCurrencyCodeFilters = new StringFilter[IsoCurrencyCodeFilter.length];
      for (int i = 0; i < IsoCurrencyCodeFilters.length; i++) {
        IsoCurrencyCodeFilters[i] = (StringFilter)IsoCurrencyCodeFilter[i];
      }
      try {
        out.setIsoCurrencyCodeFilter(IsoCurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DescriptionMap = (Map)record.get("Description");
    Boolean DescriptionFetch = DataHelper.getFetch(DescriptionMap);
    Boolean DescriptionSortDir = DataHelper.getSortDirection(DescriptionMap);
    Integer DescriptionSortOrder = DataHelper.getSortOrder(DescriptionMap);
    if (DescriptionFetch != null) out.setDescriptionFetch(DescriptionFetch);
    if (DescriptionSortDir != null) out.setDescriptionSortDirection(DescriptionSortDir);
    if (DescriptionSortOrder != null) out.setDescriptionSortOrder(DescriptionSortOrder);

    Filter[] DescriptionFilter = DataHelper.mapToFilterArray(DescriptionMap, String.class);
    if (DescriptionFilter != null) {
      StringFilter[] DescriptionFilters = new StringFilter[DescriptionFilter.length];
      for (int i = 0; i < DescriptionFilters.length; i++) {
        DescriptionFilters[i] = (StringFilter)DescriptionFilter[i];
      }
      try {
        out.setDescriptionFilter(DescriptionFilters);
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
