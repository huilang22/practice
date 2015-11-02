/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiNrcDucObjectHelper.java
 * Definition File: Customer/AbiNrcDuc.xml
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



/** Helper class to convert AbiNrcDucObject JavaBean objects to/from HashMaps.
 */
public class AbiNrcDucObjectHelper implements ArubaObjectHelper
{
  /** convert AbiNrcDucObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AbiNrcDucObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiNrcDucObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiNrcDucObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiNrcDucObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiNrcDucObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AbiNrcDucObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiNrcDucObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiNrcDucObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiNrcDucObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiNrcDucObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiNrcDucObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AbiNrcDucObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AbiNrcDucObjectData the converted object
   */
  public static AbiNrcDucObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AbiNrcDucObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AbiNrcDucObject")
   * @return AbiNrcDucObjectData the converted object
   */
  public static AbiNrcDucObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiNrcDucObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AbiNrcDucObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AbiNrcDucObjectFilter the converted object
   */
  public static AbiNrcDucObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AbiNrcDucObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AbiNrcDucObject")
   * @return AbiNrcDucObjectFilter the converted object
   */
  public static AbiNrcDucObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiNrcDucObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AbiNrcDucObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AbiNrcDucObjectDataList the converted object
   */
  public static AbiNrcDucObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AbiNrcDucObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AbiNrcDucObjectList")
   * @return AbiNrcDucObjectDataList the converted object
   */
  public static AbiNrcDucObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiNrcDucObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AbiNrcDucObjectData[] array = null;
    if (root != null)
    {
      array = new AbiNrcDucObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AbiNrcDucObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AbiNrcDucObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AbiNrcDucObjectDataList (array, index, total);
  }
  /** convert AbiNrcDucObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AbiNrcDucObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AbiNrcDucObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._DucIdSet) record.put ("DucId", in.DucId);
  
    if (in._DucTypeSet) record.put ("DucType", in.DucType);
  
    if (in._DucSubtypeSet) record.put ("DucSubtype", in.DucSubtype);
  
    if (in._MoneyValueSet) record.put ("MoneyValue", in.MoneyValue);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._AnnotationSet) record.put ("Annotation", in.Annotation);
      return record;
  }
  /** convert AbiNrcDucObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AbiNrcDucObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AbiNrcDucObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.DucId, in.DucIdSort, in.DucIdSortAscending, in.DucIdFetch);
      if (map != null) record.put ("DucId", map);
      map = DataHelper.filterToMap (in.DucType, in.DucTypeSort, in.DucTypeSortAscending, in.DucTypeFetch);
      if (map != null) record.put ("DucType", map);
      map = DataHelper.filterToMap (in.DucSubtype, in.DucSubtypeSort, in.DucSubtypeSortAscending, in.DucSubtypeFetch);
      if (map != null) record.put ("DucSubtype", map);
      map = DataHelper.filterToMap (in.MoneyValue, in.MoneyValueSort, in.MoneyValueSortAscending, in.MoneyValueFetch);
      if (map != null) record.put ("MoneyValue", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.Annotation, in.AnnotationSort, in.AnnotationSortAscending, in.AnnotationFetch, in.AnnotationCaseInsensitive);
      if (map != null) record.put ("Annotation", map);
    return record;
  }
  /** convert Map to AbiNrcDucObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiNrcDucObjectData the converted object
   */
  public static AbiNrcDucObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiNrcDucObjectData out = new AbiNrcDucObjectData ();

    out.Key = AbiNrcDucObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("DucId")) != null)
    {
      out.DucId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("DucType")) != null)
    {
      out.DucType = (BigInteger) obj;
    }
  
    if ((obj = record.get ("DucSubtype")) != null)
    {
      out.DucSubtype = (BigInteger) obj;
    }
  
    if ((obj = record.get ("MoneyValue")) != null)
    {
      out.MoneyValue = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Annotation")) != null)
    {
      out.Annotation = (String) obj;
    }
      return out;
  }
  /** convert Map to AbiNrcDucObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiNrcDucObjectFilter the converted object
   */
  public static AbiNrcDucObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiNrcDucObjectFilter out = new AbiNrcDucObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AbiNrcDucObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map DucIdMap = (Map)record.get("DucId");
    Boolean DucIdFetch = DataHelper.getFetch(DucIdMap);
    Boolean DucIdSortDir = DataHelper.getSortDirection(DucIdMap);
    Integer DucIdSortOrder = DataHelper.getSortOrder(DucIdMap);
    if (DucIdFetch != null) out.setDucIdFetch(DucIdFetch);
    if (DucIdSortDir != null) out.setDucIdSortDirection(DucIdSortDir);
    if (DucIdSortOrder != null) out.setDucIdSortOrder(DucIdSortOrder);

    Filter[] DucIdFilter = DataHelper.mapToFilterArray(DucIdMap, BigInteger.class);
    if (DucIdFilter != null) {
      BigIntegerFilter[] DucIdFilters = new BigIntegerFilter[DucIdFilter.length];
      for (int i = 0; i < DucIdFilters.length; i++) {
        DucIdFilters[i] = (BigIntegerFilter)DucIdFilter[i];
      }
      try {
        out.setDucIdFilter(DucIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DucTypeMap = (Map)record.get("DucType");
    Boolean DucTypeFetch = DataHelper.getFetch(DucTypeMap);
    Boolean DucTypeSortDir = DataHelper.getSortDirection(DucTypeMap);
    Integer DucTypeSortOrder = DataHelper.getSortOrder(DucTypeMap);
    if (DucTypeFetch != null) out.setDucTypeFetch(DucTypeFetch);
    if (DucTypeSortDir != null) out.setDucTypeSortDirection(DucTypeSortDir);
    if (DucTypeSortOrder != null) out.setDucTypeSortOrder(DucTypeSortOrder);

    Filter[] DucTypeFilter = DataHelper.mapToFilterArray(DucTypeMap, BigInteger.class);
    if (DucTypeFilter != null) {
      BigIntegerFilter[] DucTypeFilters = new BigIntegerFilter[DucTypeFilter.length];
      for (int i = 0; i < DucTypeFilters.length; i++) {
        DucTypeFilters[i] = (BigIntegerFilter)DucTypeFilter[i];
      }
      try {
        out.setDucTypeFilter(DucTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DucSubtypeMap = (Map)record.get("DucSubtype");
    Boolean DucSubtypeFetch = DataHelper.getFetch(DucSubtypeMap);
    Boolean DucSubtypeSortDir = DataHelper.getSortDirection(DucSubtypeMap);
    Integer DucSubtypeSortOrder = DataHelper.getSortOrder(DucSubtypeMap);
    if (DucSubtypeFetch != null) out.setDucSubtypeFetch(DucSubtypeFetch);
    if (DucSubtypeSortDir != null) out.setDucSubtypeSortDirection(DucSubtypeSortDir);
    if (DucSubtypeSortOrder != null) out.setDucSubtypeSortOrder(DucSubtypeSortOrder);

    Filter[] DucSubtypeFilter = DataHelper.mapToFilterArray(DucSubtypeMap, BigInteger.class);
    if (DucSubtypeFilter != null) {
      BigIntegerFilter[] DucSubtypeFilters = new BigIntegerFilter[DucSubtypeFilter.length];
      for (int i = 0; i < DucSubtypeFilters.length; i++) {
        DucSubtypeFilters[i] = (BigIntegerFilter)DucSubtypeFilter[i];
      }
      try {
        out.setDucSubtypeFilter(DucSubtypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MoneyValueMap = (Map)record.get("MoneyValue");
    Boolean MoneyValueFetch = DataHelper.getFetch(MoneyValueMap);
    Boolean MoneyValueSortDir = DataHelper.getSortDirection(MoneyValueMap);
    Integer MoneyValueSortOrder = DataHelper.getSortOrder(MoneyValueMap);
    if (MoneyValueFetch != null) out.setMoneyValueFetch(MoneyValueFetch);
    if (MoneyValueSortDir != null) out.setMoneyValueSortDirection(MoneyValueSortDir);
    if (MoneyValueSortOrder != null) out.setMoneyValueSortOrder(MoneyValueSortOrder);

    Filter[] MoneyValueFilter = DataHelper.mapToFilterArray(MoneyValueMap, BigInteger.class);
    if (MoneyValueFilter != null) {
      BigIntegerFilter[] MoneyValueFilters = new BigIntegerFilter[MoneyValueFilter.length];
      for (int i = 0; i < MoneyValueFilters.length; i++) {
        MoneyValueFilters[i] = (BigIntegerFilter)MoneyValueFilter[i];
      }
      try {
        out.setMoneyValueFilter(MoneyValueFilters);
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

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, BigInteger.class);
    if (CurrencyCodeFilter != null) {
      BigIntegerFilter[] CurrencyCodeFilters = new BigIntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (BigIntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AnnotationMap = (Map)record.get("Annotation");
    Boolean AnnotationFetch = DataHelper.getFetch(AnnotationMap);
    Boolean AnnotationSortDir = DataHelper.getSortDirection(AnnotationMap);
    Integer AnnotationSortOrder = DataHelper.getSortOrder(AnnotationMap);
    if (AnnotationFetch != null) out.setAnnotationFetch(AnnotationFetch);
    if (AnnotationSortDir != null) out.setAnnotationSortDirection(AnnotationSortDir);
    if (AnnotationSortOrder != null) out.setAnnotationSortOrder(AnnotationSortOrder);

    Filter[] AnnotationFilter = DataHelper.mapToFilterArray(AnnotationMap, String.class);
    if (AnnotationFilter != null) {
      StringFilter[] AnnotationFilters = new StringFilter[AnnotationFilter.length];
      for (int i = 0; i < AnnotationFilters.length; i++) {
        AnnotationFilters[i] = (StringFilter)AnnotationFilter[i];
      }
      try {
        out.setAnnotationFilter(AnnotationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
