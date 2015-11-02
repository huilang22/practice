/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExtendedDataObjectKeyHelper.java
 * Definition File: Admin/.xml
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

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

/** Helper class for ExtendedDataObject's Key objects. */
public class ExtendedDataObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ExtendedDataObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ExtendedDataObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ExtendedDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ExtendedDataObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ExtendedDataObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ExtendedDataObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ExtendedDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ExtendedDataObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ExtendedDataObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ExtendedDataObjectKeyData the converted object
   */
  public static ExtendedDataObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ExtendedDataObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ExtendedDataObject")
   * @return ExtendedDataObjectKeyData the converted object
   */
  public static ExtendedDataObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ExtendedDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ExtendedDataObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ExtendedDataObjectKeyFilter the converted object
   */
  public static ExtendedDataObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ExtendedDataObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ExtendedDataObject")
   * @return ExtendedDataObjectKeyFilter the converted object
   */
  public static ExtendedDataObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ExtendedDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ExtendedDataObjectKeyData to a Map (not including the root).
  /** convert ExtendedDataObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ExtendedDataObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BaseTableSet) record.put ("BaseTable", in.BaseTable);
  
    if (in._EntityTypeSet) record.put ("EntityType", in.EntityType);
  
    if (in._ParamIdSet) record.put ("ParamId", in.ParamId);
  
    return record;
  }
  /** convert ExtendedDataObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ExtendedDataObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BaseTable, in.BaseTableSort, in.BaseTableSortAscending, in.BaseTableFetch, in.BaseTableCaseInsensitive);
      if (map != null) record.put ("BaseTable", map);
      map = DataHelper.filterToMap (in.EntityType, in.EntityTypeSort, in.EntityTypeSortAscending, in.EntityTypeFetch);
      if (map != null) record.put ("EntityType", map);
      map = DataHelper.filterToMap (in.ParamId, in.ParamIdSort, in.ParamIdSortAscending, in.ParamIdFetch);
      if (map != null) record.put ("ParamId", map);
    return record;
  }
  /** convert Map to ExtendedDataObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ExtendedDataObjectKeyData the converted object
   */
  public static ExtendedDataObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ExtendedDataObjectKeyData out = new ExtendedDataObjectKeyData ();

    if ((obj = record.get ("BaseTable")) != null)
    {
      out.BaseTable = (String) obj;
      out._BaseTableSet = true;
    }
  
    if ((obj = record.get ("EntityType")) != null)
    {
      out.EntityType = (Integer) obj;
      out._EntityTypeSet = true;
    }
  
    if ((obj = record.get ("ParamId")) != null)
    {
      out.ParamId = (Integer) obj;
      out._ParamIdSet = true;
    }
  
    return out;
  }
  /** convert Map to ExtendedDataObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ExtendedDataObjectKeyFilter the converted object
   */
  public static ExtendedDataObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ExtendedDataObjectKeyFilter out = new ExtendedDataObjectKeyFilter ();

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
  
    Map ParamIdMap = (Map)record.get("ParamId");
    Boolean ParamIdFetch = DataHelper.getFetch(ParamIdMap);
    Boolean ParamIdSortDir = DataHelper.getSortDirection(ParamIdMap);
    Integer ParamIdSortOrder = DataHelper.getSortOrder(ParamIdMap);
    if (ParamIdFetch != null) out.setParamIdFetch(ParamIdFetch);
    if (ParamIdSortDir != null) out.setParamIdSortDirection(ParamIdSortDir);
    if (ParamIdSortOrder != null) out.setParamIdSortOrder(ParamIdSortOrder);

    Filter[] ParamIdFilter = DataHelper.mapToFilterArray(ParamIdMap, Integer.class);
    if (ParamIdFilter != null) {
      IntegerFilter[] ParamIdFilters = new IntegerFilter[ParamIdFilter.length];
      for (int i = 0; i < ParamIdFilters.length; i++) {
        ParamIdFilters[i] = (IntegerFilter)ParamIdFilter[i];
      }
      try {
        out.setParamIdFilter(ParamIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
