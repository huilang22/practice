/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxRatesVatObjectHelper.java
 * Definition File: Admin/TaxRatesVat.xml
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



/** Helper class to convert TaxRatesVatObject JavaBean objects to/from HashMaps.
 */
public class TaxRatesVatObjectHelper implements ArubaObjectHelper
{
  /** convert TaxRatesVatObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (TaxRatesVatObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxRatesVatObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxRatesVatObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxRatesVatObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxRatesVatObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert TaxRatesVatObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxRatesVatObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxRatesVatObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxRatesVatObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxRatesVatObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxRatesVatObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TaxRatesVatObjectData.
   * @param record the Map containing the data to convert to the object
   * @return TaxRatesVatObjectData the converted object
   */
  public static TaxRatesVatObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TaxRatesVatObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TaxRatesVatObject")
   * @return TaxRatesVatObjectData the converted object
   */
  public static TaxRatesVatObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxRatesVatObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TaxRatesVatObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return TaxRatesVatObjectFilter the converted object
   */
  public static TaxRatesVatObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TaxRatesVatObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TaxRatesVatObject")
   * @return TaxRatesVatObjectFilter the converted object
   */
  public static TaxRatesVatObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxRatesVatObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to TaxRatesVatObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return TaxRatesVatObjectDataList the converted object
   */
  public static TaxRatesVatObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to TaxRatesVatObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "TaxRatesVatObjectList")
   * @return TaxRatesVatObjectDataList the converted object
   */
  public static TaxRatesVatObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxRatesVatObjectList";
    Object[] root = (Object[]) record.get (rootName);
    TaxRatesVatObjectData[] array = null;
    if (root != null)
    {
      array = new TaxRatesVatObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = TaxRatesVatObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new TaxRatesVatObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new TaxRatesVatObjectDataList (array, index, total);
  }
  /** convert TaxRatesVatObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxRatesVatObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", TaxRatesVatObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._FixedAmtSet) record.put ("FixedAmt", in.FixedAmt);
  
    if (in._RateSet) record.put ("Rate", in.Rate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._TaxTypeCodeSet) record.put ("TaxTypeCode", in.TaxTypeCode);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert TaxRatesVatObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxRatesVatObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", TaxRatesVatObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.FixedAmt, in.FixedAmtSort, in.FixedAmtSortAscending, in.FixedAmtFetch);
      if (map != null) record.put ("FixedAmt", map);
      map = DataHelper.filterToMap (in.Rate, in.RateSort, in.RateSortAscending, in.RateFetch);
      if (map != null) record.put ("Rate", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
      map = DataHelper.filterToMap (in.TaxTypeCode, in.TaxTypeCodeSort, in.TaxTypeCodeSortAscending, in.TaxTypeCodeFetch);
      if (map != null) record.put ("TaxTypeCode", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to TaxRatesVatObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxRatesVatObjectData the converted object
   */
  public static TaxRatesVatObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxRatesVatObjectData out = new TaxRatesVatObjectData ();

    out.Key = TaxRatesVatObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("FixedAmt")) != null)
    {
      out.FixedAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Rate")) != null)
    {
      out.Rate = (Integer) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("TaxTypeCode")) != null)
    {
      out.TaxTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to TaxRatesVatObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxRatesVatObjectFilter the converted object
   */
  public static TaxRatesVatObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxRatesVatObjectFilter out = new TaxRatesVatObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = TaxRatesVatObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map FixedAmtMap = (Map)record.get("FixedAmt");
    Boolean FixedAmtFetch = DataHelper.getFetch(FixedAmtMap);
    Boolean FixedAmtSortDir = DataHelper.getSortDirection(FixedAmtMap);
    Integer FixedAmtSortOrder = DataHelper.getSortOrder(FixedAmtMap);
    if (FixedAmtFetch != null) out.setFixedAmtFetch(FixedAmtFetch);
    if (FixedAmtSortDir != null) out.setFixedAmtSortDirection(FixedAmtSortDir);
    if (FixedAmtSortOrder != null) out.setFixedAmtSortOrder(FixedAmtSortOrder);

    Filter[] FixedAmtFilter = DataHelper.mapToFilterArray(FixedAmtMap, BigInteger.class);
    if (FixedAmtFilter != null) {
      BigIntegerFilter[] FixedAmtFilters = new BigIntegerFilter[FixedAmtFilter.length];
      for (int i = 0; i < FixedAmtFilters.length; i++) {
        FixedAmtFilters[i] = (BigIntegerFilter)FixedAmtFilter[i];
      }
      try {
        out.setFixedAmtFilter(FixedAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateMap = (Map)record.get("Rate");
    Boolean RateFetch = DataHelper.getFetch(RateMap);
    Boolean RateSortDir = DataHelper.getSortDirection(RateMap);
    Integer RateSortOrder = DataHelper.getSortOrder(RateMap);
    if (RateFetch != null) out.setRateFetch(RateFetch);
    if (RateSortDir != null) out.setRateSortDirection(RateSortDir);
    if (RateSortOrder != null) out.setRateSortOrder(RateSortOrder);

    Filter[] RateFilter = DataHelper.mapToFilterArray(RateMap, Integer.class);
    if (RateFilter != null) {
      IntegerFilter[] RateFilters = new IntegerFilter[RateFilter.length];
      for (int i = 0; i < RateFilters.length; i++) {
        RateFilters[i] = (IntegerFilter)RateFilter[i];
      }
      try {
        out.setRateFilter(RateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDateMap = (Map)record.get("InactiveDate");
    Boolean InactiveDateFetch = DataHelper.getFetch(InactiveDateMap);
    Boolean InactiveDateSortDir = DataHelper.getSortDirection(InactiveDateMap);
    Integer InactiveDateSortOrder = DataHelper.getSortOrder(InactiveDateMap);
    if (InactiveDateFetch != null) out.setInactiveDateFetch(InactiveDateFetch);
    if (InactiveDateSortDir != null) out.setInactiveDateSortDirection(InactiveDateSortDir);
    if (InactiveDateSortOrder != null) out.setInactiveDateSortOrder(InactiveDateSortOrder);

    Filter[] InactiveDateFilter = DataHelper.mapToFilterArray(InactiveDateMap, Date.class);
    if (InactiveDateFilter != null) {
      DateFilter[] InactiveDateFilters = new DateFilter[InactiveDateFilter.length];
      for (int i = 0; i < InactiveDateFilters.length; i++) {
        InactiveDateFilters[i] = (DateFilter)InactiveDateFilter[i];
      }
      try {
        out.setInactiveDateFilter(InactiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxTypeCodeMap = (Map)record.get("TaxTypeCode");
    Boolean TaxTypeCodeFetch = DataHelper.getFetch(TaxTypeCodeMap);
    Boolean TaxTypeCodeSortDir = DataHelper.getSortDirection(TaxTypeCodeMap);
    Integer TaxTypeCodeSortOrder = DataHelper.getSortOrder(TaxTypeCodeMap);
    if (TaxTypeCodeFetch != null) out.setTaxTypeCodeFetch(TaxTypeCodeFetch);
    if (TaxTypeCodeSortDir != null) out.setTaxTypeCodeSortDirection(TaxTypeCodeSortDir);
    if (TaxTypeCodeSortOrder != null) out.setTaxTypeCodeSortOrder(TaxTypeCodeSortOrder);

    Filter[] TaxTypeCodeFilter = DataHelper.mapToFilterArray(TaxTypeCodeMap, Integer.class);
    if (TaxTypeCodeFilter != null) {
      IntegerFilter[] TaxTypeCodeFilters = new IntegerFilter[TaxTypeCodeFilter.length];
      for (int i = 0; i < TaxTypeCodeFilters.length; i++) {
        TaxTypeCodeFilters[i] = (IntegerFilter)TaxTypeCodeFilter[i];
      }
      try {
        out.setTaxTypeCodeFilter(TaxTypeCodeFilters);
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
