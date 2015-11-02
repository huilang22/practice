/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TransSourceTypeObjectHelper.java
 * Definition File: Admin/TransSourceType.xml
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



/** Helper class to convert TransSourceTypeObject JavaBean objects to/from HashMaps.
 */
public class TransSourceTypeObjectHelper implements ArubaObjectHelper
{
  /** convert TransSourceTypeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (TransSourceTypeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TransSourceTypeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TransSourceTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (TransSourceTypeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TransSourceTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert TransSourceTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TransSourceTypeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TransSourceTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TransSourceTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (TransSourceTypeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TransSourceTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TransSourceTypeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return TransSourceTypeObjectData the converted object
   */
  public static TransSourceTypeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TransSourceTypeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TransSourceTypeObject")
   * @return TransSourceTypeObjectData the converted object
   */
  public static TransSourceTypeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TransSourceTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TransSourceTypeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return TransSourceTypeObjectFilter the converted object
   */
  public static TransSourceTypeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TransSourceTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TransSourceTypeObject")
   * @return TransSourceTypeObjectFilter the converted object
   */
  public static TransSourceTypeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TransSourceTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to TransSourceTypeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return TransSourceTypeObjectDataList the converted object
   */
  public static TransSourceTypeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to TransSourceTypeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "TransSourceTypeObjectList")
   * @return TransSourceTypeObjectDataList the converted object
   */
  public static TransSourceTypeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TransSourceTypeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    TransSourceTypeObjectData[] array = null;
    if (root != null)
    {
      array = new TransSourceTypeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = TransSourceTypeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new TransSourceTypeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new TransSourceTypeObjectDataList (array, index, total);
  }
  /** convert TransSourceTypeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TransSourceTypeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", TransSourceTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._SourceIdSet) record.put ("SourceId", in.SourceId);
  
    if (in._ModuleSet) record.put ("Module", in.Module);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert TransSourceTypeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TransSourceTypeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", TransSourceTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.SourceId, in.SourceIdSort, in.SourceIdSortAscending, in.SourceIdFetch, in.SourceIdCaseInsensitive);
      if (map != null) record.put ("SourceId", map);
      map = DataHelper.filterToMap (in.Module, in.ModuleSort, in.ModuleSortAscending, in.ModuleFetch, in.ModuleCaseInsensitive);
      if (map != null) record.put ("Module", map);
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
  /** convert Map to TransSourceTypeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TransSourceTypeObjectData the converted object
   */
  public static TransSourceTypeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TransSourceTypeObjectData out = new TransSourceTypeObjectData ();

    out.Key = TransSourceTypeObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("SourceId")) != null)
    {
      out.SourceId = (String) obj;
    }
  
    if ((obj = record.get ("Module")) != null)
    {
      out.Module = (String) obj;
    }
  
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
  /** convert Map to TransSourceTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TransSourceTypeObjectFilter the converted object
   */
  public static TransSourceTypeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TransSourceTypeObjectFilter out = new TransSourceTypeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = TransSourceTypeObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map SourceIdMap = (Map)record.get("SourceId");
    Boolean SourceIdFetch = DataHelper.getFetch(SourceIdMap);
    Boolean SourceIdSortDir = DataHelper.getSortDirection(SourceIdMap);
    Integer SourceIdSortOrder = DataHelper.getSortOrder(SourceIdMap);
    if (SourceIdFetch != null) out.setSourceIdFetch(SourceIdFetch);
    if (SourceIdSortDir != null) out.setSourceIdSortDirection(SourceIdSortDir);
    if (SourceIdSortOrder != null) out.setSourceIdSortOrder(SourceIdSortOrder);

    Filter[] SourceIdFilter = DataHelper.mapToFilterArray(SourceIdMap, String.class);
    if (SourceIdFilter != null) {
      StringFilter[] SourceIdFilters = new StringFilter[SourceIdFilter.length];
      for (int i = 0; i < SourceIdFilters.length; i++) {
        SourceIdFilters[i] = (StringFilter)SourceIdFilter[i];
      }
      try {
        out.setSourceIdFilter(SourceIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ModuleMap = (Map)record.get("Module");
    Boolean ModuleFetch = DataHelper.getFetch(ModuleMap);
    Boolean ModuleSortDir = DataHelper.getSortDirection(ModuleMap);
    Integer ModuleSortOrder = DataHelper.getSortOrder(ModuleMap);
    if (ModuleFetch != null) out.setModuleFetch(ModuleFetch);
    if (ModuleSortDir != null) out.setModuleSortDirection(ModuleSortDir);
    if (ModuleSortOrder != null) out.setModuleSortOrder(ModuleSortOrder);

    Filter[] ModuleFilter = DataHelper.mapToFilterArray(ModuleMap, String.class);
    if (ModuleFilter != null) {
      StringFilter[] ModuleFilters = new StringFilter[ModuleFilter.length];
      for (int i = 0; i < ModuleFilters.length; i++) {
        ModuleFilters[i] = (StringFilter)ModuleFilter[i];
      }
      try {
        out.setModuleFilter(ModuleFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
