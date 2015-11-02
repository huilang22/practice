/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExtendedDataObjectHelper.java
 * Definition File: Admin/ExtendedDataAssociation.xml
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



/** Helper class to convert ExtendedDataObject JavaBean objects to/from HashMaps.
 */
public class ExtendedDataObjectHelper implements ArubaObjectHelper
{
  /** convert ExtendedDataObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ExtendedDataObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ExtendedDataObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ExtendedDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ExtendedDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ExtendedDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ExtendedDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ExtendedDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ExtendedDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ExtendedDataObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ExtendedDataObjectData the converted object
   */
  public static ExtendedDataObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ExtendedDataObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ExtendedDataObject")
   * @return ExtendedDataObjectData the converted object
   */
  public static ExtendedDataObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ExtendedDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ExtendedDataObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ExtendedDataObjectFilter the converted object
   */
  public static ExtendedDataObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ExtendedDataObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ExtendedDataObject")
   * @return ExtendedDataObjectFilter the converted object
   */
  public static ExtendedDataObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ExtendedDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ExtendedDataObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ExtendedDataObjectDataList the converted object
   */
  public static ExtendedDataObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ExtendedDataObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ExtendedDataObjectList")
   * @return ExtendedDataObjectDataList the converted object
   */
  public static ExtendedDataObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ExtendedDataObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ExtendedDataObjectData[] array = null;
    if (root != null)
    {
      array = new ExtendedDataObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ExtendedDataObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ExtendedDataObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ExtendedDataObjectDataList (array, index, total);
  }
  /** convert ExtendedDataObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ExtendedDataObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ExtendedDataObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._GroupingIdSet) record.put ("GroupingId", in.GroupingId);
  
    if (in._DefaultValueSet) record.put ("DefaultValue", in.DefaultValue);
  
    if (in._IsRequiredSet) record.put ("IsRequired", in.IsRequired);
  
    if (in._AttributeDisplayOrderSet) record.put ("AttributeDisplayOrder", in.AttributeDisplayOrder);
  
    if (in._IsSearchableSet) record.put ("IsSearchable", in.IsSearchable);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert ExtendedDataObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ExtendedDataObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ExtendedDataObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.GroupingId, in.GroupingIdSort, in.GroupingIdSortAscending, in.GroupingIdFetch, in.GroupingIdCaseInsensitive);
      if (map != null) record.put ("GroupingId", map);
      map = DataHelper.filterToMap (in.DefaultValue, in.DefaultValueSort, in.DefaultValueSortAscending, in.DefaultValueFetch, in.DefaultValueCaseInsensitive);
      if (map != null) record.put ("DefaultValue", map);
      map = DataHelper.filterToMap (in.IsRequired, in.IsRequiredSort, in.IsRequiredSortAscending, in.IsRequiredFetch);
      if (map != null) record.put ("IsRequired", map);
      map = DataHelper.filterToMap (in.AttributeDisplayOrder, in.AttributeDisplayOrderSort, in.AttributeDisplayOrderSortAscending, in.AttributeDisplayOrderFetch);
      if (map != null) record.put ("AttributeDisplayOrder", map);
      map = DataHelper.filterToMap (in.IsSearchable, in.IsSearchableSort, in.IsSearchableSortAscending, in.IsSearchableFetch);
      if (map != null) record.put ("IsSearchable", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to ExtendedDataObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ExtendedDataObjectData the converted object
   */
  public static ExtendedDataObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ExtendedDataObjectData out = new ExtendedDataObjectData ();

    out.Key = ExtendedDataObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("GroupingId")) != null)
    {
      out.GroupingId = (String) obj;
    }
  
    if ((obj = record.get ("DefaultValue")) != null)
    {
      out.DefaultValue = (String) obj;
    }
  
    if ((obj = record.get ("IsRequired")) != null)
    {
      out.IsRequired = (Boolean) obj;
    }
  
    if ((obj = record.get ("AttributeDisplayOrder")) != null)
    {
      out.AttributeDisplayOrder = (Integer) obj;
    }
  
    if ((obj = record.get ("IsSearchable")) != null)
    {
      out.IsSearchable = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to ExtendedDataObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ExtendedDataObjectFilter the converted object
   */
  public static ExtendedDataObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ExtendedDataObjectFilter out = new ExtendedDataObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ExtendedDataObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map GroupingIdMap = (Map)record.get("GroupingId");
    Boolean GroupingIdFetch = DataHelper.getFetch(GroupingIdMap);
    Boolean GroupingIdSortDir = DataHelper.getSortDirection(GroupingIdMap);
    Integer GroupingIdSortOrder = DataHelper.getSortOrder(GroupingIdMap);
    if (GroupingIdFetch != null) out.setGroupingIdFetch(GroupingIdFetch);
    if (GroupingIdSortDir != null) out.setGroupingIdSortDirection(GroupingIdSortDir);
    if (GroupingIdSortOrder != null) out.setGroupingIdSortOrder(GroupingIdSortOrder);

    Filter[] GroupingIdFilter = DataHelper.mapToFilterArray(GroupingIdMap, String.class);
    if (GroupingIdFilter != null) {
      StringFilter[] GroupingIdFilters = new StringFilter[GroupingIdFilter.length];
      for (int i = 0; i < GroupingIdFilters.length; i++) {
        GroupingIdFilters[i] = (StringFilter)GroupingIdFilter[i];
      }
      try {
        out.setGroupingIdFilter(GroupingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DefaultValueMap = (Map)record.get("DefaultValue");
    Boolean DefaultValueFetch = DataHelper.getFetch(DefaultValueMap);
    Boolean DefaultValueSortDir = DataHelper.getSortDirection(DefaultValueMap);
    Integer DefaultValueSortOrder = DataHelper.getSortOrder(DefaultValueMap);
    if (DefaultValueFetch != null) out.setDefaultValueFetch(DefaultValueFetch);
    if (DefaultValueSortDir != null) out.setDefaultValueSortDirection(DefaultValueSortDir);
    if (DefaultValueSortOrder != null) out.setDefaultValueSortOrder(DefaultValueSortOrder);

    Filter[] DefaultValueFilter = DataHelper.mapToFilterArray(DefaultValueMap, String.class);
    if (DefaultValueFilter != null) {
      StringFilter[] DefaultValueFilters = new StringFilter[DefaultValueFilter.length];
      for (int i = 0; i < DefaultValueFilters.length; i++) {
        DefaultValueFilters[i] = (StringFilter)DefaultValueFilter[i];
      }
      try {
        out.setDefaultValueFilter(DefaultValueFilters);
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
  
    Map AttributeDisplayOrderMap = (Map)record.get("AttributeDisplayOrder");
    Boolean AttributeDisplayOrderFetch = DataHelper.getFetch(AttributeDisplayOrderMap);
    Boolean AttributeDisplayOrderSortDir = DataHelper.getSortDirection(AttributeDisplayOrderMap);
    Integer AttributeDisplayOrderSortOrder = DataHelper.getSortOrder(AttributeDisplayOrderMap);
    if (AttributeDisplayOrderFetch != null) out.setAttributeDisplayOrderFetch(AttributeDisplayOrderFetch);
    if (AttributeDisplayOrderSortDir != null) out.setAttributeDisplayOrderSortDirection(AttributeDisplayOrderSortDir);
    if (AttributeDisplayOrderSortOrder != null) out.setAttributeDisplayOrderSortOrder(AttributeDisplayOrderSortOrder);

    Filter[] AttributeDisplayOrderFilter = DataHelper.mapToFilterArray(AttributeDisplayOrderMap, Integer.class);
    if (AttributeDisplayOrderFilter != null) {
      IntegerFilter[] AttributeDisplayOrderFilters = new IntegerFilter[AttributeDisplayOrderFilter.length];
      for (int i = 0; i < AttributeDisplayOrderFilters.length; i++) {
        AttributeDisplayOrderFilters[i] = (IntegerFilter)AttributeDisplayOrderFilter[i];
      }
      try {
        out.setAttributeDisplayOrderFilter(AttributeDisplayOrderFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsSearchableMap = (Map)record.get("IsSearchable");
    Boolean IsSearchableFetch = DataHelper.getFetch(IsSearchableMap);
    Boolean IsSearchableSortDir = DataHelper.getSortDirection(IsSearchableMap);
    Integer IsSearchableSortOrder = DataHelper.getSortOrder(IsSearchableMap);
    if (IsSearchableFetch != null) out.setIsSearchableFetch(IsSearchableFetch);
    if (IsSearchableSortDir != null) out.setIsSearchableSortDirection(IsSearchableSortDir);
    if (IsSearchableSortOrder != null) out.setIsSearchableSortOrder(IsSearchableSortOrder);

    Filter[] IsSearchableFilter = DataHelper.mapToFilterArray(IsSearchableMap, Boolean.class);
    if (IsSearchableFilter != null) {
      BooleanFilter[] IsSearchableFilters = new BooleanFilter[IsSearchableFilter.length];
      for (int i = 0; i < IsSearchableFilters.length; i++) {
        IsSearchableFilters[i] = (BooleanFilter)IsSearchableFilter[i];
      }
      try {
        out.setIsSearchableFilter(IsSearchableFilters);
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
