/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRateOverrideObjectHelper.java
 * Definition File: Customer/ProductRateOverride.xml
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



/** Helper class to convert ProductRateOverrideObject JavaBean objects to/from HashMaps.
 */
public class ProductRateOverrideObjectHelper implements ArubaObjectHelper
{
  /** convert ProductRateOverrideObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ProductRateOverrideObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ProductRateOverrideObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ProductRateOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (ProductRateOverrideObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ProductRateOverrideObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ProductRateOverrideObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ProductRateOverrideObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ProductRateOverrideObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ProductRateOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (ProductRateOverrideObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ProductRateOverrideObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ProductRateOverrideObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ProductRateOverrideObjectData the converted object
   */
  public static ProductRateOverrideObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ProductRateOverrideObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ProductRateOverrideObject")
   * @return ProductRateOverrideObjectData the converted object
   */
  public static ProductRateOverrideObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ProductRateOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ProductRateOverrideObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ProductRateOverrideObjectFilter the converted object
   */
  public static ProductRateOverrideObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ProductRateOverrideObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ProductRateOverrideObject")
   * @return ProductRateOverrideObjectFilter the converted object
   */
  public static ProductRateOverrideObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ProductRateOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ProductRateOverrideObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ProductRateOverrideObjectDataList the converted object
   */
  public static ProductRateOverrideObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ProductRateOverrideObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ProductRateOverrideObjectList")
   * @return ProductRateOverrideObjectDataList the converted object
   */
  public static ProductRateOverrideObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ProductRateOverrideObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ProductRateOverrideObjectData[] array = null;
    if (root != null)
    {
      array = new ProductRateOverrideObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ProductRateOverrideObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ProductRateOverrideObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ProductRateOverrideObjectDataList (array, index, total);
  }
  /** convert ProductRateOverrideObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ProductRateOverrideObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ProductRateOverrideObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._OverrideRateSet) record.put ("OverrideRate", in.OverrideRate);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
      return record;
  }
  /** convert ProductRateOverrideObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ProductRateOverrideObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ProductRateOverrideObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.OverrideRate, in.OverrideRateSort, in.OverrideRateSortAscending, in.OverrideRateFetch);
      if (map != null) record.put ("OverrideRate", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
    return record;
  }
  /** convert Map to ProductRateOverrideObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ProductRateOverrideObjectData the converted object
   */
  public static ProductRateOverrideObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductRateOverrideObjectData out = new ProductRateOverrideObjectData ();

    out.Key = ProductRateOverrideObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("OverrideRate")) != null)
    {
      out.OverrideRate = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
      return out;
  }
  /** convert Map to ProductRateOverrideObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ProductRateOverrideObjectFilter the converted object
   */
  public static ProductRateOverrideObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductRateOverrideObjectFilter out = new ProductRateOverrideObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ProductRateOverrideObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map OverrideRateMap = (Map)record.get("OverrideRate");
    Boolean OverrideRateFetch = DataHelper.getFetch(OverrideRateMap);
    Boolean OverrideRateSortDir = DataHelper.getSortDirection(OverrideRateMap);
    Integer OverrideRateSortOrder = DataHelper.getSortOrder(OverrideRateMap);
    if (OverrideRateFetch != null) out.setOverrideRateFetch(OverrideRateFetch);
    if (OverrideRateSortDir != null) out.setOverrideRateSortDirection(OverrideRateSortDir);
    if (OverrideRateSortOrder != null) out.setOverrideRateSortOrder(OverrideRateSortOrder);

    Filter[] OverrideRateFilter = DataHelper.mapToFilterArray(OverrideRateMap, BigInteger.class);
    if (OverrideRateFilter != null) {
      BigIntegerFilter[] OverrideRateFilters = new BigIntegerFilter[OverrideRateFilter.length];
      for (int i = 0; i < OverrideRateFilters.length; i++) {
        OverrideRateFilters[i] = (BigIntegerFilter)OverrideRateFilter[i];
      }
      try {
        out.setOverrideRateFilter(OverrideRateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, Integer.class);
    if (CurrencyCodeFilter != null) {
      IntegerFilter[] CurrencyCodeFilters = new IntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (IntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDtMap = (Map)record.get("InactiveDt");
    Boolean InactiveDtFetch = DataHelper.getFetch(InactiveDtMap);
    Boolean InactiveDtSortDir = DataHelper.getSortDirection(InactiveDtMap);
    Integer InactiveDtSortOrder = DataHelper.getSortOrder(InactiveDtMap);
    if (InactiveDtFetch != null) out.setInactiveDtFetch(InactiveDtFetch);
    if (InactiveDtSortDir != null) out.setInactiveDtSortDirection(InactiveDtSortDir);
    if (InactiveDtSortOrder != null) out.setInactiveDtSortOrder(InactiveDtSortOrder);

    Filter[] InactiveDtFilter = DataHelper.mapToFilterArray(InactiveDtMap, Date.class);
    if (InactiveDtFilter != null) {
      DateFilter[] InactiveDtFilters = new DateFilter[InactiveDtFilter.length];
      for (int i = 0; i < InactiveDtFilters.length; i++) {
        InactiveDtFilters[i] = (DateFilter)InactiveDtFilter[i];
      }
      try {
        out.setInactiveDtFilter(InactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
