/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CRBOObjectHelper.java
 * Definition File: Admin/CorridorRateBandOverride.xml
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



/** Helper class to convert CRBOObject JavaBean objects to/from HashMaps.
 */
public class CRBOObjectHelper implements ArubaObjectHelper
{
  /** convert CRBOObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CRBOObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CRBOObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CRBOObject")
   * @return Map     the output Map
   */
  public static Map toMap (CRBOObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CRBOObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CRBOObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CRBOObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CRBOObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CRBOObject")
   * @return Map     the output Map
   */
  public static Map toMap (CRBOObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CRBOObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CRBOObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CRBOObjectData the converted object
   */
  public static CRBOObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CRBOObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CRBOObject")
   * @return CRBOObjectData the converted object
   */
  public static CRBOObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CRBOObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CRBOObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CRBOObjectFilter the converted object
   */
  public static CRBOObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CRBOObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CRBOObject")
   * @return CRBOObjectFilter the converted object
   */
  public static CRBOObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CRBOObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CRBOObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CRBOObjectDataList the converted object
   */
  public static CRBOObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CRBOObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CRBOObjectList")
   * @return CRBOObjectDataList the converted object
   */
  public static CRBOObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CRBOObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CRBOObjectData[] array = null;
    if (root != null)
    {
      array = new CRBOObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CRBOObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CRBOObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CRBOObjectDataList (array, index, total);
  }
  /** convert CRBOObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CRBOObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CRBOObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._UnitRateSet) record.put ("UnitRate", in.UnitRate);
  
    if (in._NumUnitsSet) record.put ("NumUnits", in.NumUnits);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert CRBOObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CRBOObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CRBOObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.UnitRate, in.UnitRateSort, in.UnitRateSortAscending, in.UnitRateFetch);
      if (map != null) record.put ("UnitRate", map);
      map = DataHelper.filterToMap (in.NumUnits, in.NumUnitsSort, in.NumUnitsSortAscending, in.NumUnitsFetch);
      if (map != null) record.put ("NumUnits", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to CRBOObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CRBOObjectData the converted object
   */
  public static CRBOObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CRBOObjectData out = new CRBOObjectData ();

    out.Key = CRBOObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("UnitRate")) != null)
    {
      out.UnitRate = (Integer) obj;
    }
  
    if ((obj = record.get ("NumUnits")) != null)
    {
      out.NumUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to CRBOObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CRBOObjectFilter the converted object
   */
  public static CRBOObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CRBOObjectFilter out = new CRBOObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CRBOObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map UnitRateMap = (Map)record.get("UnitRate");
    Boolean UnitRateFetch = DataHelper.getFetch(UnitRateMap);
    Boolean UnitRateSortDir = DataHelper.getSortDirection(UnitRateMap);
    Integer UnitRateSortOrder = DataHelper.getSortOrder(UnitRateMap);
    if (UnitRateFetch != null) out.setUnitRateFetch(UnitRateFetch);
    if (UnitRateSortDir != null) out.setUnitRateSortDirection(UnitRateSortDir);
    if (UnitRateSortOrder != null) out.setUnitRateSortOrder(UnitRateSortOrder);

    Filter[] UnitRateFilter = DataHelper.mapToFilterArray(UnitRateMap, Integer.class);
    if (UnitRateFilter != null) {
      IntegerFilter[] UnitRateFilters = new IntegerFilter[UnitRateFilter.length];
      for (int i = 0; i < UnitRateFilters.length; i++) {
        UnitRateFilters[i] = (IntegerFilter)UnitRateFilter[i];
      }
      try {
        out.setUnitRateFilter(UnitRateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NumUnitsMap = (Map)record.get("NumUnits");
    Boolean NumUnitsFetch = DataHelper.getFetch(NumUnitsMap);
    Boolean NumUnitsSortDir = DataHelper.getSortDirection(NumUnitsMap);
    Integer NumUnitsSortOrder = DataHelper.getSortOrder(NumUnitsMap);
    if (NumUnitsFetch != null) out.setNumUnitsFetch(NumUnitsFetch);
    if (NumUnitsSortDir != null) out.setNumUnitsSortDirection(NumUnitsSortDir);
    if (NumUnitsSortOrder != null) out.setNumUnitsSortOrder(NumUnitsSortOrder);

    Filter[] NumUnitsFilter = DataHelper.mapToFilterArray(NumUnitsMap, BigInteger.class);
    if (NumUnitsFilter != null) {
      BigIntegerFilter[] NumUnitsFilters = new BigIntegerFilter[NumUnitsFilter.length];
      for (int i = 0; i < NumUnitsFilters.length; i++) {
        NumUnitsFilters[i] = (BigIntegerFilter)NumUnitsFilter[i];
      }
      try {
        out.setNumUnitsFilter(NumUnitsFilters);
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
