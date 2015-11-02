/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RegulatoryIdObjectHelper.java
 * Definition File: Admin/RegulatoryId.xml
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



/** Helper class to convert RegulatoryIdObject JavaBean objects to/from HashMaps.
 */
public class RegulatoryIdObjectHelper implements ArubaObjectHelper
{
  /** convert RegulatoryIdObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (RegulatoryIdObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RegulatoryIdObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RegulatoryIdObject")
   * @return Map     the output Map
   */
  public static Map toMap (RegulatoryIdObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RegulatoryIdObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert RegulatoryIdObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RegulatoryIdObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RegulatoryIdObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RegulatoryIdObject")
   * @return Map     the output Map
   */
  public static Map toMap (RegulatoryIdObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RegulatoryIdObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RegulatoryIdObjectData.
   * @param record the Map containing the data to convert to the object
   * @return RegulatoryIdObjectData the converted object
   */
  public static RegulatoryIdObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RegulatoryIdObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RegulatoryIdObject")
   * @return RegulatoryIdObjectData the converted object
   */
  public static RegulatoryIdObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RegulatoryIdObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RegulatoryIdObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return RegulatoryIdObjectFilter the converted object
   */
  public static RegulatoryIdObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RegulatoryIdObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RegulatoryIdObject")
   * @return RegulatoryIdObjectFilter the converted object
   */
  public static RegulatoryIdObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RegulatoryIdObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to RegulatoryIdObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return RegulatoryIdObjectDataList the converted object
   */
  public static RegulatoryIdObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to RegulatoryIdObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "RegulatoryIdObjectList")
   * @return RegulatoryIdObjectDataList the converted object
   */
  public static RegulatoryIdObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RegulatoryIdObjectList";
    Object[] root = (Object[]) record.get (rootName);
    RegulatoryIdObjectData[] array = null;
    if (root != null)
    {
      array = new RegulatoryIdObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = RegulatoryIdObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new RegulatoryIdObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new RegulatoryIdObjectDataList (array, index, total);
  }
  /** convert RegulatoryIdObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RegulatoryIdObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", RegulatoryIdObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert RegulatoryIdObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RegulatoryIdObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", RegulatoryIdObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
    return record;
  }
  /** convert Map to RegulatoryIdObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RegulatoryIdObjectData the converted object
   */
  public static RegulatoryIdObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RegulatoryIdObjectData out = new RegulatoryIdObjectData ();

    out.Key = RegulatoryIdObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
      return out;
  }
  /** convert Map to RegulatoryIdObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RegulatoryIdObjectFilter the converted object
   */
  public static RegulatoryIdObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RegulatoryIdObjectFilter out = new RegulatoryIdObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = RegulatoryIdObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map ShortDisplayMap = (Map)record.get("ShortDisplay");
    Boolean ShortDisplayFetch = DataHelper.getFetch(ShortDisplayMap);
    Boolean ShortDisplaySortDir = DataHelper.getSortDirection(ShortDisplayMap);
    Integer ShortDisplaySortOrder = DataHelper.getSortOrder(ShortDisplayMap);
    if (ShortDisplayFetch != null) out.setShortDisplayFetch(ShortDisplayFetch);
    if (ShortDisplaySortDir != null) out.setShortDisplaySortDirection(ShortDisplaySortDir);
    if (ShortDisplaySortOrder != null) out.setShortDisplaySortOrder(ShortDisplaySortOrder);

    Filter[] ShortDisplayFilter = DataHelper.mapToFilterArray(ShortDisplayMap, String.class);
    if (ShortDisplayFilter != null) {
      StringFilter[] ShortDisplayFilters = new StringFilter[ShortDisplayFilter.length];
      for (int i = 0; i < ShortDisplayFilters.length; i++) {
        ShortDisplayFilters[i] = (StringFilter)ShortDisplayFilter[i];
      }
      try {
        out.setShortDisplayFilter(ShortDisplayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DisplayValueMap = (Map)record.get("DisplayValue");
    Boolean DisplayValueFetch = DataHelper.getFetch(DisplayValueMap);
    Boolean DisplayValueSortDir = DataHelper.getSortDirection(DisplayValueMap);
    Integer DisplayValueSortOrder = DataHelper.getSortOrder(DisplayValueMap);
    if (DisplayValueFetch != null) out.setDisplayValueFetch(DisplayValueFetch);
    if (DisplayValueSortDir != null) out.setDisplayValueSortDirection(DisplayValueSortDir);
    if (DisplayValueSortOrder != null) out.setDisplayValueSortOrder(DisplayValueSortOrder);

    Filter[] DisplayValueFilter = DataHelper.mapToFilterArray(DisplayValueMap, String.class);
    if (DisplayValueFilter != null) {
      StringFilter[] DisplayValueFilters = new StringFilter[DisplayValueFilter.length];
      for (int i = 0; i < DisplayValueFilters.length; i++) {
        DisplayValueFilters[i] = (StringFilter)DisplayValueFilter[i];
      }
      try {
        out.setDisplayValueFilter(DisplayValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
