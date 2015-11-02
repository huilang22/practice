/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EDObjectHelper.java
 * Definition File: Admin/ExtendedDataEnumeration.xml
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



/** Helper class to convert EDObject JavaBean objects to/from HashMaps.
 */
public class EDObjectHelper implements ArubaObjectHelper
{
  /** convert EDObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (EDObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EDObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EDObject")
   * @return Map     the output Map
   */
  public static Map toMap (EDObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert EDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EDObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EDObject")
   * @return Map     the output Map
   */
  public static Map toMap (EDObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EDObjectData.
   * @param record the Map containing the data to convert to the object
   * @return EDObjectData the converted object
   */
  public static EDObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EDObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EDObject")
   * @return EDObjectData the converted object
   */
  public static EDObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EDObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return EDObjectFilter the converted object
   */
  public static EDObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EDObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EDObject")
   * @return EDObjectFilter the converted object
   */
  public static EDObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to EDObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return EDObjectDataList the converted object
   */
  public static EDObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to EDObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "EDObjectList")
   * @return EDObjectDataList the converted object
   */
  public static EDObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EDObjectList";
    Object[] root = (Object[]) record.get (rootName);
    EDObjectData[] array = null;
    if (root != null)
    {
      array = new EDObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = EDObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new EDObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new EDObjectDataList (array, index, total);
  }
  /** convert EDObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EDObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", EDObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._EnumerationNameSet) record.put ("EnumerationName", in.EnumerationName);
  
    if (in._EnumerationKeySet) record.put ("EnumerationKey", in.EnumerationKey);
  
    if (in._RefTableNameSet) record.put ("RefTableName", in.RefTableName);
  
    if (in._EnumerationSortBasisSet) record.put ("EnumerationSortBasis", in.EnumerationSortBasis);
  
    if (in._EnumerationSortOrderSet) record.put ("EnumerationSortOrder", in.EnumerationSortOrder);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert EDObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EDObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", EDObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.EnumerationName, in.EnumerationNameSort, in.EnumerationNameSortAscending, in.EnumerationNameFetch, in.EnumerationNameCaseInsensitive);
      if (map != null) record.put ("EnumerationName", map);
      map = DataHelper.filterToMap (in.EnumerationKey, in.EnumerationKeySort, in.EnumerationKeySortAscending, in.EnumerationKeyFetch, in.EnumerationKeyCaseInsensitive);
      if (map != null) record.put ("EnumerationKey", map);
      map = DataHelper.filterToMap (in.RefTableName, in.RefTableNameSort, in.RefTableNameSortAscending, in.RefTableNameFetch, in.RefTableNameCaseInsensitive);
      if (map != null) record.put ("RefTableName", map);
      map = DataHelper.filterToMap (in.EnumerationSortBasis, in.EnumerationSortBasisSort, in.EnumerationSortBasisSortAscending, in.EnumerationSortBasisFetch);
      if (map != null) record.put ("EnumerationSortBasis", map);
      map = DataHelper.filterToMap (in.EnumerationSortOrder, in.EnumerationSortOrderSort, in.EnumerationSortOrderSortAscending, in.EnumerationSortOrderFetch);
      if (map != null) record.put ("EnumerationSortOrder", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to EDObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EDObjectData the converted object
   */
  public static EDObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EDObjectData out = new EDObjectData ();

    out.Key = EDObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("EnumerationName")) != null)
    {
      out.EnumerationName = (String) obj;
    }
  
    if ((obj = record.get ("EnumerationKey")) != null)
    {
      out.EnumerationKey = (String) obj;
    }
  
    if ((obj = record.get ("RefTableName")) != null)
    {
      out.RefTableName = (String) obj;
    }
  
    if ((obj = record.get ("EnumerationSortBasis")) != null)
    {
      out.EnumerationSortBasis = (Integer) obj;
    }
  
    if ((obj = record.get ("EnumerationSortOrder")) != null)
    {
      out.EnumerationSortOrder = (Integer) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to EDObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EDObjectFilter the converted object
   */
  public static EDObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EDObjectFilter out = new EDObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = EDObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map EnumerationNameMap = (Map)record.get("EnumerationName");
    Boolean EnumerationNameFetch = DataHelper.getFetch(EnumerationNameMap);
    Boolean EnumerationNameSortDir = DataHelper.getSortDirection(EnumerationNameMap);
    Integer EnumerationNameSortOrder = DataHelper.getSortOrder(EnumerationNameMap);
    if (EnumerationNameFetch != null) out.setEnumerationNameFetch(EnumerationNameFetch);
    if (EnumerationNameSortDir != null) out.setEnumerationNameSortDirection(EnumerationNameSortDir);
    if (EnumerationNameSortOrder != null) out.setEnumerationNameSortOrder(EnumerationNameSortOrder);

    Filter[] EnumerationNameFilter = DataHelper.mapToFilterArray(EnumerationNameMap, String.class);
    if (EnumerationNameFilter != null) {
      StringFilter[] EnumerationNameFilters = new StringFilter[EnumerationNameFilter.length];
      for (int i = 0; i < EnumerationNameFilters.length; i++) {
        EnumerationNameFilters[i] = (StringFilter)EnumerationNameFilter[i];
      }
      try {
        out.setEnumerationNameFilter(EnumerationNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EnumerationKeyMap = (Map)record.get("EnumerationKey");
    Boolean EnumerationKeyFetch = DataHelper.getFetch(EnumerationKeyMap);
    Boolean EnumerationKeySortDir = DataHelper.getSortDirection(EnumerationKeyMap);
    Integer EnumerationKeySortOrder = DataHelper.getSortOrder(EnumerationKeyMap);
    if (EnumerationKeyFetch != null) out.setEnumerationKeyFetch(EnumerationKeyFetch);
    if (EnumerationKeySortDir != null) out.setEnumerationKeySortDirection(EnumerationKeySortDir);
    if (EnumerationKeySortOrder != null) out.setEnumerationKeySortOrder(EnumerationKeySortOrder);

    Filter[] EnumerationKeyFilter = DataHelper.mapToFilterArray(EnumerationKeyMap, String.class);
    if (EnumerationKeyFilter != null) {
      StringFilter[] EnumerationKeyFilters = new StringFilter[EnumerationKeyFilter.length];
      for (int i = 0; i < EnumerationKeyFilters.length; i++) {
        EnumerationKeyFilters[i] = (StringFilter)EnumerationKeyFilter[i];
      }
      try {
        out.setEnumerationKeyFilter(EnumerationKeyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RefTableNameMap = (Map)record.get("RefTableName");
    Boolean RefTableNameFetch = DataHelper.getFetch(RefTableNameMap);
    Boolean RefTableNameSortDir = DataHelper.getSortDirection(RefTableNameMap);
    Integer RefTableNameSortOrder = DataHelper.getSortOrder(RefTableNameMap);
    if (RefTableNameFetch != null) out.setRefTableNameFetch(RefTableNameFetch);
    if (RefTableNameSortDir != null) out.setRefTableNameSortDirection(RefTableNameSortDir);
    if (RefTableNameSortOrder != null) out.setRefTableNameSortOrder(RefTableNameSortOrder);

    Filter[] RefTableNameFilter = DataHelper.mapToFilterArray(RefTableNameMap, String.class);
    if (RefTableNameFilter != null) {
      StringFilter[] RefTableNameFilters = new StringFilter[RefTableNameFilter.length];
      for (int i = 0; i < RefTableNameFilters.length; i++) {
        RefTableNameFilters[i] = (StringFilter)RefTableNameFilter[i];
      }
      try {
        out.setRefTableNameFilter(RefTableNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EnumerationSortBasisMap = (Map)record.get("EnumerationSortBasis");
    Boolean EnumerationSortBasisFetch = DataHelper.getFetch(EnumerationSortBasisMap);
    Boolean EnumerationSortBasisSortDir = DataHelper.getSortDirection(EnumerationSortBasisMap);
    Integer EnumerationSortBasisSortOrder = DataHelper.getSortOrder(EnumerationSortBasisMap);
    if (EnumerationSortBasisFetch != null) out.setEnumerationSortBasisFetch(EnumerationSortBasisFetch);
    if (EnumerationSortBasisSortDir != null) out.setEnumerationSortBasisSortDirection(EnumerationSortBasisSortDir);
    if (EnumerationSortBasisSortOrder != null) out.setEnumerationSortBasisSortOrder(EnumerationSortBasisSortOrder);

    Filter[] EnumerationSortBasisFilter = DataHelper.mapToFilterArray(EnumerationSortBasisMap, Integer.class);
    if (EnumerationSortBasisFilter != null) {
      IntegerFilter[] EnumerationSortBasisFilters = new IntegerFilter[EnumerationSortBasisFilter.length];
      for (int i = 0; i < EnumerationSortBasisFilters.length; i++) {
        EnumerationSortBasisFilters[i] = (IntegerFilter)EnumerationSortBasisFilter[i];
      }
      try {
        out.setEnumerationSortBasisFilter(EnumerationSortBasisFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EnumerationSortOrderMap = (Map)record.get("EnumerationSortOrder");
    Boolean EnumerationSortOrderFetch = DataHelper.getFetch(EnumerationSortOrderMap);
    Boolean EnumerationSortOrderSortDir = DataHelper.getSortDirection(EnumerationSortOrderMap);
    Integer EnumerationSortOrderSortOrder = DataHelper.getSortOrder(EnumerationSortOrderMap);
    if (EnumerationSortOrderFetch != null) out.setEnumerationSortOrderFetch(EnumerationSortOrderFetch);
    if (EnumerationSortOrderSortDir != null) out.setEnumerationSortOrderSortDirection(EnumerationSortOrderSortDir);
    if (EnumerationSortOrderSortOrder != null) out.setEnumerationSortOrderSortOrder(EnumerationSortOrderSortOrder);

    Filter[] EnumerationSortOrderFilter = DataHelper.mapToFilterArray(EnumerationSortOrderMap, Integer.class);
    if (EnumerationSortOrderFilter != null) {
      IntegerFilter[] EnumerationSortOrderFilters = new IntegerFilter[EnumerationSortOrderFilter.length];
      for (int i = 0; i < EnumerationSortOrderFilters.length; i++) {
        EnumerationSortOrderFilters[i] = (IntegerFilter)EnumerationSortOrderFilter[i];
      }
      try {
        out.setEnumerationSortOrderFilter(EnumerationSortOrderFilters);
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
