/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCOverrideObjectHelper.java
 * Definition File: Customer/OverrideUsageCreditRate.xml
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



/** Helper class to convert RUCOverrideObject JavaBean objects to/from HashMaps.
 */
public class RUCOverrideObjectHelper implements ArubaObjectHelper
{
  /** convert RUCOverrideObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (RUCOverrideObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RUCOverrideObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RUCOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (RUCOverrideObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RUCOverrideObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = RUCBaseOverrideObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert RUCOverrideObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RUCOverrideObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RUCOverrideObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RUCOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (RUCOverrideObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RUCOverrideObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = RUCBaseOverrideObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RUCOverrideObjectData.
   * @param record the Map containing the data to convert to the object
   * @return RUCOverrideObjectData the converted object
   */
  public static RUCOverrideObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RUCOverrideObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RUCOverrideObject")
   * @return RUCOverrideObjectData the converted object
   */
  public static RUCOverrideObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RUCOverrideObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return RUCOverrideObjectFilter the converted object
   */
  public static RUCOverrideObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RUCOverrideObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RUCOverrideObject")
   * @return RUCOverrideObjectFilter the converted object
   */
  public static RUCOverrideObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to RUCOverrideObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return RUCOverrideObjectDataList the converted object
   */
  public static RUCOverrideObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to RUCOverrideObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "RUCOverrideObjectList")
   * @return RUCOverrideObjectDataList the converted object
   */
  public static RUCOverrideObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCOverrideObjectList";
    Object[] root = (Object[]) record.get (rootName);
    RUCOverrideObjectData[] array = null;
    if (root != null)
    {
      array = new RUCOverrideObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = RUCOverrideObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new RUCOverrideObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new RUCOverrideObjectDataList (array, index, total);
  }
  /** convert RUCOverrideObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RUCOverrideObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._RangeOriginAmountSet) record.put ("RangeOriginAmount", in.RangeOriginAmount);
  
    if (in._RangeOriginUnitsSet) record.put ("RangeOriginUnits", in.RangeOriginUnits);
  
    if (in._RangeTerminusAmountSet) record.put ("RangeTerminusAmount", in.RangeTerminusAmount);
  
    if (in._RangeTerminusUnitsSet) record.put ("RangeTerminusUnits", in.RangeTerminusUnits);
      return record;
  }
  /** convert RUCOverrideObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RUCOverrideObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.RangeOriginAmount, in.RangeOriginAmountSort, in.RangeOriginAmountSortAscending, in.RangeOriginAmountFetch);
      if (map != null) record.put ("RangeOriginAmount", map);
      map = DataHelper.filterToMap (in.RangeOriginUnits, in.RangeOriginUnitsSort, in.RangeOriginUnitsSortAscending, in.RangeOriginUnitsFetch);
      if (map != null) record.put ("RangeOriginUnits", map);
      map = DataHelper.filterToMap (in.RangeTerminusAmount, in.RangeTerminusAmountSort, in.RangeTerminusAmountSortAscending, in.RangeTerminusAmountFetch);
      if (map != null) record.put ("RangeTerminusAmount", map);
      map = DataHelper.filterToMap (in.RangeTerminusUnits, in.RangeTerminusUnitsSort, in.RangeTerminusUnitsSortAscending, in.RangeTerminusUnitsFetch);
      if (map != null) record.put ("RangeTerminusUnits", map);
    return record;
  }
  /** convert Map to RUCOverrideObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RUCOverrideObjectData the converted object
   */
  public static RUCOverrideObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RUCOverrideObjectData out = new RUCOverrideObjectData (RUCBaseOverrideObjectHelper.getObj (record));

    if ((obj = record.get ("RangeOriginAmount")) != null)
    {
      out.RangeOriginAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RangeOriginUnits")) != null)
    {
      out.RangeOriginUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RangeTerminusAmount")) != null)
    {
      out.RangeTerminusAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RangeTerminusUnits")) != null)
    {
      out.RangeTerminusUnits = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to RUCOverrideObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RUCOverrideObjectFilter the converted object
   */
  public static RUCOverrideObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RUCOverrideObjectFilter out = new RUCOverrideObjectFilter (RUCBaseOverrideObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map RangeOriginAmountMap = (Map)record.get("RangeOriginAmount");
    Boolean RangeOriginAmountFetch = DataHelper.getFetch(RangeOriginAmountMap);
    Boolean RangeOriginAmountSortDir = DataHelper.getSortDirection(RangeOriginAmountMap);
    Integer RangeOriginAmountSortOrder = DataHelper.getSortOrder(RangeOriginAmountMap);
    if (RangeOriginAmountFetch != null) out.setRangeOriginAmountFetch(RangeOriginAmountFetch);
    if (RangeOriginAmountSortDir != null) out.setRangeOriginAmountSortDirection(RangeOriginAmountSortDir);
    if (RangeOriginAmountSortOrder != null) out.setRangeOriginAmountSortOrder(RangeOriginAmountSortOrder);

    Filter[] RangeOriginAmountFilter = DataHelper.mapToFilterArray(RangeOriginAmountMap, BigInteger.class);
    if (RangeOriginAmountFilter != null) {
      BigIntegerFilter[] RangeOriginAmountFilters = new BigIntegerFilter[RangeOriginAmountFilter.length];
      for (int i = 0; i < RangeOriginAmountFilters.length; i++) {
        RangeOriginAmountFilters[i] = (BigIntegerFilter)RangeOriginAmountFilter[i];
      }
      try {
        out.setRangeOriginAmountFilter(RangeOriginAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RangeOriginUnitsMap = (Map)record.get("RangeOriginUnits");
    Boolean RangeOriginUnitsFetch = DataHelper.getFetch(RangeOriginUnitsMap);
    Boolean RangeOriginUnitsSortDir = DataHelper.getSortDirection(RangeOriginUnitsMap);
    Integer RangeOriginUnitsSortOrder = DataHelper.getSortOrder(RangeOriginUnitsMap);
    if (RangeOriginUnitsFetch != null) out.setRangeOriginUnitsFetch(RangeOriginUnitsFetch);
    if (RangeOriginUnitsSortDir != null) out.setRangeOriginUnitsSortDirection(RangeOriginUnitsSortDir);
    if (RangeOriginUnitsSortOrder != null) out.setRangeOriginUnitsSortOrder(RangeOriginUnitsSortOrder);

    Filter[] RangeOriginUnitsFilter = DataHelper.mapToFilterArray(RangeOriginUnitsMap, BigInteger.class);
    if (RangeOriginUnitsFilter != null) {
      BigIntegerFilter[] RangeOriginUnitsFilters = new BigIntegerFilter[RangeOriginUnitsFilter.length];
      for (int i = 0; i < RangeOriginUnitsFilters.length; i++) {
        RangeOriginUnitsFilters[i] = (BigIntegerFilter)RangeOriginUnitsFilter[i];
      }
      try {
        out.setRangeOriginUnitsFilter(RangeOriginUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RangeTerminusAmountMap = (Map)record.get("RangeTerminusAmount");
    Boolean RangeTerminusAmountFetch = DataHelper.getFetch(RangeTerminusAmountMap);
    Boolean RangeTerminusAmountSortDir = DataHelper.getSortDirection(RangeTerminusAmountMap);
    Integer RangeTerminusAmountSortOrder = DataHelper.getSortOrder(RangeTerminusAmountMap);
    if (RangeTerminusAmountFetch != null) out.setRangeTerminusAmountFetch(RangeTerminusAmountFetch);
    if (RangeTerminusAmountSortDir != null) out.setRangeTerminusAmountSortDirection(RangeTerminusAmountSortDir);
    if (RangeTerminusAmountSortOrder != null) out.setRangeTerminusAmountSortOrder(RangeTerminusAmountSortOrder);

    Filter[] RangeTerminusAmountFilter = DataHelper.mapToFilterArray(RangeTerminusAmountMap, BigInteger.class);
    if (RangeTerminusAmountFilter != null) {
      BigIntegerFilter[] RangeTerminusAmountFilters = new BigIntegerFilter[RangeTerminusAmountFilter.length];
      for (int i = 0; i < RangeTerminusAmountFilters.length; i++) {
        RangeTerminusAmountFilters[i] = (BigIntegerFilter)RangeTerminusAmountFilter[i];
      }
      try {
        out.setRangeTerminusAmountFilter(RangeTerminusAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RangeTerminusUnitsMap = (Map)record.get("RangeTerminusUnits");
    Boolean RangeTerminusUnitsFetch = DataHelper.getFetch(RangeTerminusUnitsMap);
    Boolean RangeTerminusUnitsSortDir = DataHelper.getSortDirection(RangeTerminusUnitsMap);
    Integer RangeTerminusUnitsSortOrder = DataHelper.getSortOrder(RangeTerminusUnitsMap);
    if (RangeTerminusUnitsFetch != null) out.setRangeTerminusUnitsFetch(RangeTerminusUnitsFetch);
    if (RangeTerminusUnitsSortDir != null) out.setRangeTerminusUnitsSortDirection(RangeTerminusUnitsSortDir);
    if (RangeTerminusUnitsSortOrder != null) out.setRangeTerminusUnitsSortOrder(RangeTerminusUnitsSortOrder);

    Filter[] RangeTerminusUnitsFilter = DataHelper.mapToFilterArray(RangeTerminusUnitsMap, BigInteger.class);
    if (RangeTerminusUnitsFilter != null) {
      BigIntegerFilter[] RangeTerminusUnitsFilters = new BigIntegerFilter[RangeTerminusUnitsFilter.length];
      for (int i = 0; i < RangeTerminusUnitsFilters.length; i++) {
        RangeTerminusUnitsFilters[i] = (BigIntegerFilter)RangeTerminusUnitsFilter[i];
      }
      try {
        out.setRangeTerminusUnitsFilter(RangeTerminusUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
