/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RewardBalanceObjectHelper.java
 * Definition File: Admin/RewardBalance.xml
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



/** Helper class to convert RewardBalanceObject JavaBean objects to/from HashMaps.
 */
public class RewardBalanceObjectHelper implements ArubaObjectHelper
{
  /** convert RewardBalanceObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (RewardBalanceObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RewardBalanceObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RewardBalanceObject")
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RewardBalanceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert RewardBalanceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RewardBalanceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RewardBalanceObject")
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RewardBalanceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RewardBalanceObjectData.
   * @param record the Map containing the data to convert to the object
   * @return RewardBalanceObjectData the converted object
   */
  public static RewardBalanceObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RewardBalanceObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RewardBalanceObject")
   * @return RewardBalanceObjectData the converted object
   */
  public static RewardBalanceObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RewardBalanceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RewardBalanceObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return RewardBalanceObjectFilter the converted object
   */
  public static RewardBalanceObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RewardBalanceObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RewardBalanceObject")
   * @return RewardBalanceObjectFilter the converted object
   */
  public static RewardBalanceObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RewardBalanceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to RewardBalanceObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return RewardBalanceObjectDataList the converted object
   */
  public static RewardBalanceObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to RewardBalanceObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "RewardBalanceObjectList")
   * @return RewardBalanceObjectDataList the converted object
   */
  public static RewardBalanceObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RewardBalanceObjectList";
    Object[] root = (Object[]) record.get (rootName);
    RewardBalanceObjectData[] array = null;
    if (root != null)
    {
      array = new RewardBalanceObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = RewardBalanceObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new RewardBalanceObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new RewardBalanceObjectDataList (array, index, total);
  }
  /** convert RewardBalanceObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RewardBalanceObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", RewardBalanceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BalanceTypeSet) record.put ("BalanceType", in.BalanceType);
  
    if (in._ExtIdSet) record.put ("ExtId", in.ExtId);
  
    if (in._ExternalIdTypeSet) record.put ("ExternalIdType", in.ExternalIdType);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
      return record;
  }
  /** convert RewardBalanceObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RewardBalanceObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", RewardBalanceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BalanceType, in.BalanceTypeSort, in.BalanceTypeSortAscending, in.BalanceTypeFetch);
      if (map != null) record.put ("BalanceType", map);
      map = DataHelper.filterToMap (in.ExtId, in.ExtIdSort, in.ExtIdSortAscending, in.ExtIdFetch, in.ExtIdCaseInsensitive);
      if (map != null) record.put ("ExtId", map);
      map = DataHelper.filterToMap (in.ExternalIdType, in.ExternalIdTypeSort, in.ExternalIdTypeSortAscending, in.ExternalIdTypeFetch);
      if (map != null) record.put ("ExternalIdType", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
    return record;
  }
  /** convert Map to RewardBalanceObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RewardBalanceObjectData the converted object
   */
  public static RewardBalanceObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RewardBalanceObjectData out = new RewardBalanceObjectData ();

    out.Key = RewardBalanceObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BalanceType")) != null)
    {
      out.BalanceType = (Integer) obj;
    }
  
    if ((obj = record.get ("ExtId")) != null)
    {
      out.ExtId = (String) obj;
    }
  
    if ((obj = record.get ("ExternalIdType")) != null)
    {
      out.ExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
  
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
      return out;
  }
  /** convert Map to RewardBalanceObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RewardBalanceObjectFilter the converted object
   */
  public static RewardBalanceObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RewardBalanceObjectFilter out = new RewardBalanceObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = RewardBalanceObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map BalanceTypeMap = (Map)record.get("BalanceType");
    Boolean BalanceTypeFetch = DataHelper.getFetch(BalanceTypeMap);
    Boolean BalanceTypeSortDir = DataHelper.getSortDirection(BalanceTypeMap);
    Integer BalanceTypeSortOrder = DataHelper.getSortOrder(BalanceTypeMap);
    if (BalanceTypeFetch != null) out.setBalanceTypeFetch(BalanceTypeFetch);
    if (BalanceTypeSortDir != null) out.setBalanceTypeSortDirection(BalanceTypeSortDir);
    if (BalanceTypeSortOrder != null) out.setBalanceTypeSortOrder(BalanceTypeSortOrder);

    Filter[] BalanceTypeFilter = DataHelper.mapToFilterArray(BalanceTypeMap, Integer.class);
    if (BalanceTypeFilter != null) {
      IntegerFilter[] BalanceTypeFilters = new IntegerFilter[BalanceTypeFilter.length];
      for (int i = 0; i < BalanceTypeFilters.length; i++) {
        BalanceTypeFilters[i] = (IntegerFilter)BalanceTypeFilter[i];
      }
      try {
        out.setBalanceTypeFilter(BalanceTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExtIdMap = (Map)record.get("ExtId");
    Boolean ExtIdFetch = DataHelper.getFetch(ExtIdMap);
    Boolean ExtIdSortDir = DataHelper.getSortDirection(ExtIdMap);
    Integer ExtIdSortOrder = DataHelper.getSortOrder(ExtIdMap);
    if (ExtIdFetch != null) out.setExtIdFetch(ExtIdFetch);
    if (ExtIdSortDir != null) out.setExtIdSortDirection(ExtIdSortDir);
    if (ExtIdSortOrder != null) out.setExtIdSortOrder(ExtIdSortOrder);

    Filter[] ExtIdFilter = DataHelper.mapToFilterArray(ExtIdMap, String.class);
    if (ExtIdFilter != null) {
      StringFilter[] ExtIdFilters = new StringFilter[ExtIdFilter.length];
      for (int i = 0; i < ExtIdFilters.length; i++) {
        ExtIdFilters[i] = (StringFilter)ExtIdFilter[i];
      }
      try {
        out.setExtIdFilter(ExtIdFilters);
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
  
    return out;
  }
}
