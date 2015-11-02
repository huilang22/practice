/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCreditObjectHelper.java
 * Definition File: Customer/UsageCreditRate.xml
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



/** Helper class to convert RUCreditObject JavaBean objects to/from HashMaps.
 */
public class RUCreditObjectHelper implements ArubaObjectHelper
{
  /** convert RUCreditObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (RUCreditObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RUCreditObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RUCreditObject")
   * @return Map     the output Map
   */
  public static Map toMap (RUCreditObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RUCreditObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert RUCreditObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RUCreditObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RUCreditObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RUCreditObject")
   * @return Map     the output Map
   */
  public static Map toMap (RUCreditObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RUCreditObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RUCreditObjectData.
   * @param record the Map containing the data to convert to the object
   * @return RUCreditObjectData the converted object
   */
  public static RUCreditObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RUCreditObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RUCreditObject")
   * @return RUCreditObjectData the converted object
   */
  public static RUCreditObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCreditObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RUCreditObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return RUCreditObjectFilter the converted object
   */
  public static RUCreditObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RUCreditObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RUCreditObject")
   * @return RUCreditObjectFilter the converted object
   */
  public static RUCreditObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCreditObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to RUCreditObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return RUCreditObjectDataList the converted object
   */
  public static RUCreditObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to RUCreditObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "RUCreditObjectList")
   * @return RUCreditObjectDataList the converted object
   */
  public static RUCreditObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCreditObjectList";
    Object[] root = (Object[]) record.get (rootName);
    RUCreditObjectData[] array = null;
    if (root != null)
    {
      array = new RUCreditObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = RUCreditObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new RUCreditObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new RUCreditObjectDataList (array, index, total);
  }
  /** convert RUCreditObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RUCreditObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", RUCreditObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._UnitsFreeSet) record.put ("UnitsFree", in.UnitsFree);
  
    if (in._AmountFreeSet) record.put ("AmountFree", in.AmountFree);
  
    if (in._DateInactiveSet) record.put ("DateInactive", in.DateInactive);
  
    if (in._RangeTerminusSet) record.put ("RangeTerminus", in.RangeTerminus);
      return record;
  }
  /** convert RUCreditObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RUCreditObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", RUCreditObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.UnitsFree, in.UnitsFreeSort, in.UnitsFreeSortAscending, in.UnitsFreeFetch);
      if (map != null) record.put ("UnitsFree", map);
      map = DataHelper.filterToMap (in.AmountFree, in.AmountFreeSort, in.AmountFreeSortAscending, in.AmountFreeFetch);
      if (map != null) record.put ("AmountFree", map);
      map = DataHelper.filterToMap (in.DateInactive, in.DateInactiveSort, in.DateInactiveSortAscending, in.DateInactiveFetch);
      if (map != null) record.put ("DateInactive", map);
      map = DataHelper.filterToMap (in.RangeTerminus, in.RangeTerminusSort, in.RangeTerminusSortAscending, in.RangeTerminusFetch);
      if (map != null) record.put ("RangeTerminus", map);
    return record;
  }
  /** convert Map to RUCreditObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RUCreditObjectData the converted object
   */
  public static RUCreditObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RUCreditObjectData out = new RUCreditObjectData ();

    out.Key = RUCreditObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("UnitsFree")) != null)
    {
      out.UnitsFree = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AmountFree")) != null)
    {
      out.AmountFree = (BigInteger) obj;
    }
  
    if ((obj = record.get ("DateInactive")) != null)
    {
      out.DateInactive = (Date) obj;
    }
  
    if ((obj = record.get ("RangeTerminus")) != null)
    {
      out.RangeTerminus = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to RUCreditObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RUCreditObjectFilter the converted object
   */
  public static RUCreditObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RUCreditObjectFilter out = new RUCreditObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = RUCreditObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map UnitsFreeMap = (Map)record.get("UnitsFree");
    Boolean UnitsFreeFetch = DataHelper.getFetch(UnitsFreeMap);
    Boolean UnitsFreeSortDir = DataHelper.getSortDirection(UnitsFreeMap);
    Integer UnitsFreeSortOrder = DataHelper.getSortOrder(UnitsFreeMap);
    if (UnitsFreeFetch != null) out.setUnitsFreeFetch(UnitsFreeFetch);
    if (UnitsFreeSortDir != null) out.setUnitsFreeSortDirection(UnitsFreeSortDir);
    if (UnitsFreeSortOrder != null) out.setUnitsFreeSortOrder(UnitsFreeSortOrder);

    Filter[] UnitsFreeFilter = DataHelper.mapToFilterArray(UnitsFreeMap, BigInteger.class);
    if (UnitsFreeFilter != null) {
      BigIntegerFilter[] UnitsFreeFilters = new BigIntegerFilter[UnitsFreeFilter.length];
      for (int i = 0; i < UnitsFreeFilters.length; i++) {
        UnitsFreeFilters[i] = (BigIntegerFilter)UnitsFreeFilter[i];
      }
      try {
        out.setUnitsFreeFilter(UnitsFreeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AmountFreeMap = (Map)record.get("AmountFree");
    Boolean AmountFreeFetch = DataHelper.getFetch(AmountFreeMap);
    Boolean AmountFreeSortDir = DataHelper.getSortDirection(AmountFreeMap);
    Integer AmountFreeSortOrder = DataHelper.getSortOrder(AmountFreeMap);
    if (AmountFreeFetch != null) out.setAmountFreeFetch(AmountFreeFetch);
    if (AmountFreeSortDir != null) out.setAmountFreeSortDirection(AmountFreeSortDir);
    if (AmountFreeSortOrder != null) out.setAmountFreeSortOrder(AmountFreeSortOrder);

    Filter[] AmountFreeFilter = DataHelper.mapToFilterArray(AmountFreeMap, BigInteger.class);
    if (AmountFreeFilter != null) {
      BigIntegerFilter[] AmountFreeFilters = new BigIntegerFilter[AmountFreeFilter.length];
      for (int i = 0; i < AmountFreeFilters.length; i++) {
        AmountFreeFilters[i] = (BigIntegerFilter)AmountFreeFilter[i];
      }
      try {
        out.setAmountFreeFilter(AmountFreeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateInactiveMap = (Map)record.get("DateInactive");
    Boolean DateInactiveFetch = DataHelper.getFetch(DateInactiveMap);
    Boolean DateInactiveSortDir = DataHelper.getSortDirection(DateInactiveMap);
    Integer DateInactiveSortOrder = DataHelper.getSortOrder(DateInactiveMap);
    if (DateInactiveFetch != null) out.setDateInactiveFetch(DateInactiveFetch);
    if (DateInactiveSortDir != null) out.setDateInactiveSortDirection(DateInactiveSortDir);
    if (DateInactiveSortOrder != null) out.setDateInactiveSortOrder(DateInactiveSortOrder);

    Filter[] DateInactiveFilter = DataHelper.mapToFilterArray(DateInactiveMap, Date.class);
    if (DateInactiveFilter != null) {
      DateFilter[] DateInactiveFilters = new DateFilter[DateInactiveFilter.length];
      for (int i = 0; i < DateInactiveFilters.length; i++) {
        DateInactiveFilters[i] = (DateFilter)DateInactiveFilter[i];
      }
      try {
        out.setDateInactiveFilter(DateInactiveFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RangeTerminusMap = (Map)record.get("RangeTerminus");
    Boolean RangeTerminusFetch = DataHelper.getFetch(RangeTerminusMap);
    Boolean RangeTerminusSortDir = DataHelper.getSortDirection(RangeTerminusMap);
    Integer RangeTerminusSortOrder = DataHelper.getSortOrder(RangeTerminusMap);
    if (RangeTerminusFetch != null) out.setRangeTerminusFetch(RangeTerminusFetch);
    if (RangeTerminusSortDir != null) out.setRangeTerminusSortDirection(RangeTerminusSortDir);
    if (RangeTerminusSortOrder != null) out.setRangeTerminusSortOrder(RangeTerminusSortOrder);

    Filter[] RangeTerminusFilter = DataHelper.mapToFilterArray(RangeTerminusMap, BigInteger.class);
    if (RangeTerminusFilter != null) {
      BigIntegerFilter[] RangeTerminusFilters = new BigIntegerFilter[RangeTerminusFilter.length];
      for (int i = 0; i < RangeTerminusFilters.length; i++) {
        RangeTerminusFilters[i] = (BigIntegerFilter)RangeTerminusFilter[i];
      }
      try {
        out.setRangeTerminusFilter(RangeTerminusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
