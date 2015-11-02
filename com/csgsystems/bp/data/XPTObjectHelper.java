/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: XPTObjectHelper.java
 * Definition File: Admin/ExtendedDataParamType.xml
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



/** Helper class to convert XPTObject JavaBean objects to/from HashMaps.
 */
public class XPTObjectHelper implements ArubaObjectHelper
{
  /** convert XPTObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (XPTObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert XPTObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "XPTObject")
   * @return Map     the output Map
   */
  public static Map toMap (XPTObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "XPTObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert XPTObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (XPTObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert XPTObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "XPTObject")
   * @return Map     the output Map
   */
  public static Map toMap (XPTObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "XPTObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to XPTObjectData.
   * @param record the Map containing the data to convert to the object
   * @return XPTObjectData the converted object
   */
  public static XPTObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to XPTObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "XPTObject")
   * @return XPTObjectData the converted object
   */
  public static XPTObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "XPTObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to XPTObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return XPTObjectFilter the converted object
   */
  public static XPTObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to XPTObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "XPTObject")
   * @return XPTObjectFilter the converted object
   */
  public static XPTObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "XPTObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to XPTObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return XPTObjectDataList the converted object
   */
  public static XPTObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to XPTObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "XPTObjectList")
   * @return XPTObjectDataList the converted object
   */
  public static XPTObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "XPTObjectList";
    Object[] root = (Object[]) record.get (rootName);
    XPTObjectData[] array = null;
    if (root != null)
    {
      array = new XPTObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = XPTObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new XPTObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new XPTObjectDataList (array, index, total);
  }
  /** convert XPTObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (XPTObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", XPTObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BaseTableSet) record.put ("BaseTable", in.BaseTable);
  
    if (in._EntityTypeSet) record.put ("EntityType", in.EntityType);
  
    if (in._GroupingIdSet) record.put ("GroupingId", in.GroupingId);
  
    if (in._DefaultValueSet) record.put ("DefaultValue", in.DefaultValue);
  
    if (in._IsRequiredSet) record.put ("IsRequired", in.IsRequired);
  
    if (in._AttributeDisplayOrderSet) record.put ("AttributeDisplayOrder", in.AttributeDisplayOrder);
  
    if (in._IsSearchableSet) record.put ("IsSearchable", in.IsSearchable);
  
    if (in._ParamNameSet) record.put ("ParamName", in.ParamName);
  
    if (in._ParamDatatypeSet) record.put ("ParamDatatype", in.ParamDatatype);
  
    if (in._AssocEnumerationIdSet) record.put ("AssocEnumerationId", in.AssocEnumerationId);
  
    if (in._IsAddressableSet) record.put ("IsAddressable", in.IsAddressable);
  
    if (in._ParamExternalIdSet) record.put ("ParamExternalId", in.ParamExternalId);
  
    if (in._ValidationRulesSet) record.put ("ValidationRules", in.ValidationRules);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert XPTObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (XPTObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", XPTObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BaseTable, in.BaseTableSort, in.BaseTableSortAscending, in.BaseTableFetch, in.BaseTableCaseInsensitive);
      if (map != null) record.put ("BaseTable", map);
      map = DataHelper.filterToMap (in.EntityType, in.EntityTypeSort, in.EntityTypeSortAscending, in.EntityTypeFetch);
      if (map != null) record.put ("EntityType", map);
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
      map = DataHelper.filterToMap (in.ParamName, in.ParamNameSort, in.ParamNameSortAscending, in.ParamNameFetch, in.ParamNameCaseInsensitive);
      if (map != null) record.put ("ParamName", map);
      map = DataHelper.filterToMap (in.ParamDatatype, in.ParamDatatypeSort, in.ParamDatatypeSortAscending, in.ParamDatatypeFetch);
      if (map != null) record.put ("ParamDatatype", map);
      map = DataHelper.filterToMap (in.AssocEnumerationId, in.AssocEnumerationIdSort, in.AssocEnumerationIdSortAscending, in.AssocEnumerationIdFetch);
      if (map != null) record.put ("AssocEnumerationId", map);
      map = DataHelper.filterToMap (in.IsAddressable, in.IsAddressableSort, in.IsAddressableSortAscending, in.IsAddressableFetch);
      if (map != null) record.put ("IsAddressable", map);
      map = DataHelper.filterToMap (in.ParamExternalId, in.ParamExternalIdSort, in.ParamExternalIdSortAscending, in.ParamExternalIdFetch, in.ParamExternalIdCaseInsensitive);
      if (map != null) record.put ("ParamExternalId", map);
      map = DataHelper.filterToMap (in.ValidationRules, in.ValidationRulesSort, in.ValidationRulesSortAscending, in.ValidationRulesFetch, in.ValidationRulesCaseInsensitive);
      if (map != null) record.put ("ValidationRules", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to XPTObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return XPTObjectData the converted object
   */
  public static XPTObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    XPTObjectData out = new XPTObjectData ();

    out.Key = XPTObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BaseTable")) != null)
    {
      out.BaseTable = (String) obj;
    }
  
    if ((obj = record.get ("EntityType")) != null)
    {
      out.EntityType = (Integer) obj;
    }
  
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
  
    if ((obj = record.get ("ParamName")) != null)
    {
      out.ParamName = (String) obj;
    }
  
    if ((obj = record.get ("ParamDatatype")) != null)
    {
      out.ParamDatatype = (Integer) obj;
    }
  
    if ((obj = record.get ("AssocEnumerationId")) != null)
    {
      out.AssocEnumerationId = (Integer) obj;
    }
  
    if ((obj = record.get ("IsAddressable")) != null)
    {
      out.IsAddressable = (Boolean) obj;
    }
  
    if ((obj = record.get ("ParamExternalId")) != null)
    {
      out.ParamExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ValidationRules")) != null)
    {
      out.ValidationRules = (String) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to XPTObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return XPTObjectFilter the converted object
   */
  public static XPTObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    XPTObjectFilter out = new XPTObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = XPTObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map BaseTableMap = (Map)record.get("BaseTable");
    Boolean BaseTableFetch = DataHelper.getFetch(BaseTableMap);
    Boolean BaseTableSortDir = DataHelper.getSortDirection(BaseTableMap);
    Integer BaseTableSortOrder = DataHelper.getSortOrder(BaseTableMap);
    if (BaseTableFetch != null) out.setBaseTableFetch(BaseTableFetch);
    if (BaseTableSortDir != null) out.setBaseTableSortDirection(BaseTableSortDir);
    if (BaseTableSortOrder != null) out.setBaseTableSortOrder(BaseTableSortOrder);

    Filter[] BaseTableFilter = DataHelper.mapToFilterArray(BaseTableMap, String.class);
    if (BaseTableFilter != null) {
      StringFilter[] BaseTableFilters = new StringFilter[BaseTableFilter.length];
      for (int i = 0; i < BaseTableFilters.length; i++) {
        BaseTableFilters[i] = (StringFilter)BaseTableFilter[i];
      }
      try {
        out.setBaseTableFilter(BaseTableFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EntityTypeMap = (Map)record.get("EntityType");
    Boolean EntityTypeFetch = DataHelper.getFetch(EntityTypeMap);
    Boolean EntityTypeSortDir = DataHelper.getSortDirection(EntityTypeMap);
    Integer EntityTypeSortOrder = DataHelper.getSortOrder(EntityTypeMap);
    if (EntityTypeFetch != null) out.setEntityTypeFetch(EntityTypeFetch);
    if (EntityTypeSortDir != null) out.setEntityTypeSortDirection(EntityTypeSortDir);
    if (EntityTypeSortOrder != null) out.setEntityTypeSortOrder(EntityTypeSortOrder);

    Filter[] EntityTypeFilter = DataHelper.mapToFilterArray(EntityTypeMap, Integer.class);
    if (EntityTypeFilter != null) {
      IntegerFilter[] EntityTypeFilters = new IntegerFilter[EntityTypeFilter.length];
      for (int i = 0; i < EntityTypeFilters.length; i++) {
        EntityTypeFilters[i] = (IntegerFilter)EntityTypeFilter[i];
      }
      try {
        out.setEntityTypeFilter(EntityTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    Map ParamNameMap = (Map)record.get("ParamName");
    Boolean ParamNameFetch = DataHelper.getFetch(ParamNameMap);
    Boolean ParamNameSortDir = DataHelper.getSortDirection(ParamNameMap);
    Integer ParamNameSortOrder = DataHelper.getSortOrder(ParamNameMap);
    if (ParamNameFetch != null) out.setParamNameFetch(ParamNameFetch);
    if (ParamNameSortDir != null) out.setParamNameSortDirection(ParamNameSortDir);
    if (ParamNameSortOrder != null) out.setParamNameSortOrder(ParamNameSortOrder);

    Filter[] ParamNameFilter = DataHelper.mapToFilterArray(ParamNameMap, String.class);
    if (ParamNameFilter != null) {
      StringFilter[] ParamNameFilters = new StringFilter[ParamNameFilter.length];
      for (int i = 0; i < ParamNameFilters.length; i++) {
        ParamNameFilters[i] = (StringFilter)ParamNameFilter[i];
      }
      try {
        out.setParamNameFilter(ParamNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParamDatatypeMap = (Map)record.get("ParamDatatype");
    Boolean ParamDatatypeFetch = DataHelper.getFetch(ParamDatatypeMap);
    Boolean ParamDatatypeSortDir = DataHelper.getSortDirection(ParamDatatypeMap);
    Integer ParamDatatypeSortOrder = DataHelper.getSortOrder(ParamDatatypeMap);
    if (ParamDatatypeFetch != null) out.setParamDatatypeFetch(ParamDatatypeFetch);
    if (ParamDatatypeSortDir != null) out.setParamDatatypeSortDirection(ParamDatatypeSortDir);
    if (ParamDatatypeSortOrder != null) out.setParamDatatypeSortOrder(ParamDatatypeSortOrder);

    Filter[] ParamDatatypeFilter = DataHelper.mapToFilterArray(ParamDatatypeMap, Integer.class);
    if (ParamDatatypeFilter != null) {
      IntegerFilter[] ParamDatatypeFilters = new IntegerFilter[ParamDatatypeFilter.length];
      for (int i = 0; i < ParamDatatypeFilters.length; i++) {
        ParamDatatypeFilters[i] = (IntegerFilter)ParamDatatypeFilter[i];
      }
      try {
        out.setParamDatatypeFilter(ParamDatatypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AssocEnumerationIdMap = (Map)record.get("AssocEnumerationId");
    Boolean AssocEnumerationIdFetch = DataHelper.getFetch(AssocEnumerationIdMap);
    Boolean AssocEnumerationIdSortDir = DataHelper.getSortDirection(AssocEnumerationIdMap);
    Integer AssocEnumerationIdSortOrder = DataHelper.getSortOrder(AssocEnumerationIdMap);
    if (AssocEnumerationIdFetch != null) out.setAssocEnumerationIdFetch(AssocEnumerationIdFetch);
    if (AssocEnumerationIdSortDir != null) out.setAssocEnumerationIdSortDirection(AssocEnumerationIdSortDir);
    if (AssocEnumerationIdSortOrder != null) out.setAssocEnumerationIdSortOrder(AssocEnumerationIdSortOrder);

    Filter[] AssocEnumerationIdFilter = DataHelper.mapToFilterArray(AssocEnumerationIdMap, Integer.class);
    if (AssocEnumerationIdFilter != null) {
      IntegerFilter[] AssocEnumerationIdFilters = new IntegerFilter[AssocEnumerationIdFilter.length];
      for (int i = 0; i < AssocEnumerationIdFilters.length; i++) {
        AssocEnumerationIdFilters[i] = (IntegerFilter)AssocEnumerationIdFilter[i];
      }
      try {
        out.setAssocEnumerationIdFilter(AssocEnumerationIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsAddressableMap = (Map)record.get("IsAddressable");
    Boolean IsAddressableFetch = DataHelper.getFetch(IsAddressableMap);
    Boolean IsAddressableSortDir = DataHelper.getSortDirection(IsAddressableMap);
    Integer IsAddressableSortOrder = DataHelper.getSortOrder(IsAddressableMap);
    if (IsAddressableFetch != null) out.setIsAddressableFetch(IsAddressableFetch);
    if (IsAddressableSortDir != null) out.setIsAddressableSortDirection(IsAddressableSortDir);
    if (IsAddressableSortOrder != null) out.setIsAddressableSortOrder(IsAddressableSortOrder);

    Filter[] IsAddressableFilter = DataHelper.mapToFilterArray(IsAddressableMap, Boolean.class);
    if (IsAddressableFilter != null) {
      BooleanFilter[] IsAddressableFilters = new BooleanFilter[IsAddressableFilter.length];
      for (int i = 0; i < IsAddressableFilters.length; i++) {
        IsAddressableFilters[i] = (BooleanFilter)IsAddressableFilter[i];
      }
      try {
        out.setIsAddressableFilter(IsAddressableFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParamExternalIdMap = (Map)record.get("ParamExternalId");
    Boolean ParamExternalIdFetch = DataHelper.getFetch(ParamExternalIdMap);
    Boolean ParamExternalIdSortDir = DataHelper.getSortDirection(ParamExternalIdMap);
    Integer ParamExternalIdSortOrder = DataHelper.getSortOrder(ParamExternalIdMap);
    if (ParamExternalIdFetch != null) out.setParamExternalIdFetch(ParamExternalIdFetch);
    if (ParamExternalIdSortDir != null) out.setParamExternalIdSortDirection(ParamExternalIdSortDir);
    if (ParamExternalIdSortOrder != null) out.setParamExternalIdSortOrder(ParamExternalIdSortOrder);

    Filter[] ParamExternalIdFilter = DataHelper.mapToFilterArray(ParamExternalIdMap, String.class);
    if (ParamExternalIdFilter != null) {
      StringFilter[] ParamExternalIdFilters = new StringFilter[ParamExternalIdFilter.length];
      for (int i = 0; i < ParamExternalIdFilters.length; i++) {
        ParamExternalIdFilters[i] = (StringFilter)ParamExternalIdFilter[i];
      }
      try {
        out.setParamExternalIdFilter(ParamExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ValidationRulesMap = (Map)record.get("ValidationRules");
    Boolean ValidationRulesFetch = DataHelper.getFetch(ValidationRulesMap);
    Boolean ValidationRulesSortDir = DataHelper.getSortDirection(ValidationRulesMap);
    Integer ValidationRulesSortOrder = DataHelper.getSortOrder(ValidationRulesMap);
    if (ValidationRulesFetch != null) out.setValidationRulesFetch(ValidationRulesFetch);
    if (ValidationRulesSortDir != null) out.setValidationRulesSortDirection(ValidationRulesSortDir);
    if (ValidationRulesSortOrder != null) out.setValidationRulesSortOrder(ValidationRulesSortOrder);

    Filter[] ValidationRulesFilter = DataHelper.mapToFilterArray(ValidationRulesMap, String.class);
    if (ValidationRulesFilter != null) {
      StringFilter[] ValidationRulesFilters = new StringFilter[ValidationRulesFilter.length];
      for (int i = 0; i < ValidationRulesFilters.length; i++) {
        ValidationRulesFilters[i] = (StringFilter)ValidationRulesFilter[i];
      }
      try {
        out.setValidationRulesFilter(ValidationRulesFilters);
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
