/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCreditObjectKeyHelper.java
 * Definition File: Customer/.xml
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

/** Helper class for RUCreditObject's Key objects. */
public class RUCreditObjectKeyHelper implements ArubaObjectHelper
{
  /** convert RUCreditObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RUCreditObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RUCreditObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RUCreditObject")
   * @return Map     the output Map
   */
  public static Map toMap (RUCreditObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RUCreditObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert RUCreditObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RUCreditObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RUCreditObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RUCreditObject")
   * @return Map     the output Map
   */
  public static Map toMap (RUCreditObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RUCreditObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RUCreditObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return RUCreditObjectKeyData the converted object
   */
  public static RUCreditObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RUCreditObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RUCreditObject")
   * @return RUCreditObjectKeyData the converted object
   */
  public static RUCreditObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCreditObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RUCreditObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return RUCreditObjectKeyFilter the converted object
   */
  public static RUCreditObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RUCreditObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RUCreditObject")
   * @return RUCreditObjectKeyFilter the converted object
   */
  public static RUCreditObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCreditObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert RUCreditObjectKeyData to a Map (not including the root).
  /** convert RUCreditObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RUCreditObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._UnitCrIdSet) record.put ("UnitCrId", in.UnitCrId);
  
    if (in._RateClassSet) record.put ("RateClass", in.RateClass);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._BillingFrequencySet) record.put ("BillingFrequency", in.BillingFrequency);
  
    if (in._DateActiveSet) record.put ("DateActive", in.DateActive);
  
    if (in._RangeOriginSet) record.put ("RangeOrigin", in.RangeOrigin);
  
    return record;
  }
  /** convert RUCreditObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RUCreditObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.UnitCrId, in.UnitCrIdSort, in.UnitCrIdSortAscending, in.UnitCrIdFetch);
      if (map != null) record.put ("UnitCrId", map);
      map = DataHelper.filterToMap (in.RateClass, in.RateClassSort, in.RateClassSortAscending, in.RateClassFetch);
      if (map != null) record.put ("RateClass", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.BillingFrequency, in.BillingFrequencySort, in.BillingFrequencySortAscending, in.BillingFrequencyFetch);
      if (map != null) record.put ("BillingFrequency", map);
      map = DataHelper.filterToMap (in.DateActive, in.DateActiveSort, in.DateActiveSortAscending, in.DateActiveFetch);
      if (map != null) record.put ("DateActive", map);
      map = DataHelper.filterToMap (in.RangeOrigin, in.RangeOriginSort, in.RangeOriginSortAscending, in.RangeOriginFetch);
      if (map != null) record.put ("RangeOrigin", map);
    return record;
  }
  /** convert Map to RUCreditObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RUCreditObjectKeyData the converted object
   */
  public static RUCreditObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RUCreditObjectKeyData out = new RUCreditObjectKeyData ();

    if ((obj = record.get ("UnitCrId")) != null)
    {
      out.UnitCrId = (Integer) obj;
      out._UnitCrIdSet = true;
    }
  
    if ((obj = record.get ("RateClass")) != null)
    {
      out.RateClass = (Integer) obj;
      out._RateClassSet = true;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
      out._CurrencyCodeSet = true;
    }
  
    if ((obj = record.get ("BillingFrequency")) != null)
    {
      out.BillingFrequency = (Integer) obj;
      out._BillingFrequencySet = true;
    }
  
    if ((obj = record.get ("DateActive")) != null)
    {
      out.DateActive = (Date) obj;
      out._DateActiveSet = true;
    }
  
    if ((obj = record.get ("RangeOrigin")) != null)
    {
      out.RangeOrigin = (BigInteger) obj;
      out._RangeOriginSet = true;
    }
  
    return out;
  }
  /** convert Map to RUCreditObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RUCreditObjectKeyFilter the converted object
   */
  public static RUCreditObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RUCreditObjectKeyFilter out = new RUCreditObjectKeyFilter ();

    Map UnitCrIdMap = (Map)record.get("UnitCrId");
    Boolean UnitCrIdFetch = DataHelper.getFetch(UnitCrIdMap);
    Boolean UnitCrIdSortDir = DataHelper.getSortDirection(UnitCrIdMap);
    Integer UnitCrIdSortOrder = DataHelper.getSortOrder(UnitCrIdMap);
    if (UnitCrIdFetch != null) out.setUnitCrIdFetch(UnitCrIdFetch);
    if (UnitCrIdSortDir != null) out.setUnitCrIdSortDirection(UnitCrIdSortDir);
    if (UnitCrIdSortOrder != null) out.setUnitCrIdSortOrder(UnitCrIdSortOrder);

    Filter[] UnitCrIdFilter = DataHelper.mapToFilterArray(UnitCrIdMap, Integer.class);
    if (UnitCrIdFilter != null) {
      IntegerFilter[] UnitCrIdFilters = new IntegerFilter[UnitCrIdFilter.length];
      for (int i = 0; i < UnitCrIdFilters.length; i++) {
        UnitCrIdFilters[i] = (IntegerFilter)UnitCrIdFilter[i];
      }
      try {
        out.setUnitCrIdFilter(UnitCrIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateClassMap = (Map)record.get("RateClass");
    Boolean RateClassFetch = DataHelper.getFetch(RateClassMap);
    Boolean RateClassSortDir = DataHelper.getSortDirection(RateClassMap);
    Integer RateClassSortOrder = DataHelper.getSortOrder(RateClassMap);
    if (RateClassFetch != null) out.setRateClassFetch(RateClassFetch);
    if (RateClassSortDir != null) out.setRateClassSortDirection(RateClassSortDir);
    if (RateClassSortOrder != null) out.setRateClassSortOrder(RateClassSortOrder);

    Filter[] RateClassFilter = DataHelper.mapToFilterArray(RateClassMap, Integer.class);
    if (RateClassFilter != null) {
      IntegerFilter[] RateClassFilters = new IntegerFilter[RateClassFilter.length];
      for (int i = 0; i < RateClassFilters.length; i++) {
        RateClassFilters[i] = (IntegerFilter)RateClassFilter[i];
      }
      try {
        out.setRateClassFilter(RateClassFilters);
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
  
    Map BillingFrequencyMap = (Map)record.get("BillingFrequency");
    Boolean BillingFrequencyFetch = DataHelper.getFetch(BillingFrequencyMap);
    Boolean BillingFrequencySortDir = DataHelper.getSortDirection(BillingFrequencyMap);
    Integer BillingFrequencySortOrder = DataHelper.getSortOrder(BillingFrequencyMap);
    if (BillingFrequencyFetch != null) out.setBillingFrequencyFetch(BillingFrequencyFetch);
    if (BillingFrequencySortDir != null) out.setBillingFrequencySortDirection(BillingFrequencySortDir);
    if (BillingFrequencySortOrder != null) out.setBillingFrequencySortOrder(BillingFrequencySortOrder);

    Filter[] BillingFrequencyFilter = DataHelper.mapToFilterArray(BillingFrequencyMap, Integer.class);
    if (BillingFrequencyFilter != null) {
      IntegerFilter[] BillingFrequencyFilters = new IntegerFilter[BillingFrequencyFilter.length];
      for (int i = 0; i < BillingFrequencyFilters.length; i++) {
        BillingFrequencyFilters[i] = (IntegerFilter)BillingFrequencyFilter[i];
      }
      try {
        out.setBillingFrequencyFilter(BillingFrequencyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateActiveMap = (Map)record.get("DateActive");
    Boolean DateActiveFetch = DataHelper.getFetch(DateActiveMap);
    Boolean DateActiveSortDir = DataHelper.getSortDirection(DateActiveMap);
    Integer DateActiveSortOrder = DataHelper.getSortOrder(DateActiveMap);
    if (DateActiveFetch != null) out.setDateActiveFetch(DateActiveFetch);
    if (DateActiveSortDir != null) out.setDateActiveSortDirection(DateActiveSortDir);
    if (DateActiveSortOrder != null) out.setDateActiveSortOrder(DateActiveSortOrder);

    Filter[] DateActiveFilter = DataHelper.mapToFilterArray(DateActiveMap, Date.class);
    if (DateActiveFilter != null) {
      DateFilter[] DateActiveFilters = new DateFilter[DateActiveFilter.length];
      for (int i = 0; i < DateActiveFilters.length; i++) {
        DateActiveFilters[i] = (DateFilter)DateActiveFilter[i];
      }
      try {
        out.setDateActiveFilter(DateActiveFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RangeOriginMap = (Map)record.get("RangeOrigin");
    Boolean RangeOriginFetch = DataHelper.getFetch(RangeOriginMap);
    Boolean RangeOriginSortDir = DataHelper.getSortDirection(RangeOriginMap);
    Integer RangeOriginSortOrder = DataHelper.getSortOrder(RangeOriginMap);
    if (RangeOriginFetch != null) out.setRangeOriginFetch(RangeOriginFetch);
    if (RangeOriginSortDir != null) out.setRangeOriginSortDirection(RangeOriginSortDir);
    if (RangeOriginSortOrder != null) out.setRangeOriginSortOrder(RangeOriginSortOrder);

    Filter[] RangeOriginFilter = DataHelper.mapToFilterArray(RangeOriginMap, BigInteger.class);
    if (RangeOriginFilter != null) {
      BigIntegerFilter[] RangeOriginFilters = new BigIntegerFilter[RangeOriginFilter.length];
      for (int i = 0; i < RangeOriginFilters.length; i++) {
        RangeOriginFilters[i] = (BigIntegerFilter)RangeOriginFilter[i];
      }
      try {
        out.setRangeOriginFilter(RangeOriginFilters);
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
