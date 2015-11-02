/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxRatesVatObjectKeyHelper.java
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

/** Helper class for TaxRatesVatObject's Key objects. */
public class TaxRatesVatObjectKeyHelper implements ArubaObjectHelper
{
  /** convert TaxRatesVatObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxRatesVatObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxRatesVatObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxRatesVatObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxRatesVatObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxRatesVatObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert TaxRatesVatObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxRatesVatObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxRatesVatObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxRatesVatObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxRatesVatObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxRatesVatObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TaxRatesVatObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return TaxRatesVatObjectKeyData the converted object
   */
  public static TaxRatesVatObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TaxRatesVatObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TaxRatesVatObject")
   * @return TaxRatesVatObjectKeyData the converted object
   */
  public static TaxRatesVatObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxRatesVatObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TaxRatesVatObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return TaxRatesVatObjectKeyFilter the converted object
   */
  public static TaxRatesVatObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TaxRatesVatObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TaxRatesVatObject")
   * @return TaxRatesVatObjectKeyFilter the converted object
   */
  public static TaxRatesVatObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxRatesVatObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert TaxRatesVatObjectKeyData to a Map (not including the root).
  /** convert TaxRatesVatObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TaxRatesVatObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._TaxClassSet) record.put ("TaxClass", in.TaxClass);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._BillingFrequencySet) record.put ("BillingFrequency", in.BillingFrequency);
  
    if (in._RangeTerminusSet) record.put ("RangeTerminus", in.RangeTerminus);
  
    return record;
  }
  /** convert TaxRatesVatObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TaxRatesVatObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.TaxClass, in.TaxClassSort, in.TaxClassSortAscending, in.TaxClassFetch);
      if (map != null) record.put ("TaxClass", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
      map = DataHelper.filterToMap (in.BillingFrequency, in.BillingFrequencySort, in.BillingFrequencySortAscending, in.BillingFrequencyFetch);
      if (map != null) record.put ("BillingFrequency", map);
      map = DataHelper.filterToMap (in.RangeTerminus, in.RangeTerminusSort, in.RangeTerminusSortAscending, in.RangeTerminusFetch);
      if (map != null) record.put ("RangeTerminus", map);
    return record;
  }
  /** convert Map to TaxRatesVatObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxRatesVatObjectKeyData the converted object
   */
  public static TaxRatesVatObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxRatesVatObjectKeyData out = new TaxRatesVatObjectKeyData ();

    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
      out._TaxPkgInstIdSet = true;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
      out._CurrencyCodeSet = true;
    }
  
    if ((obj = record.get ("TaxClass")) != null)
    {
      out.TaxClass = (Integer) obj;
      out._TaxClassSet = true;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
      out._ActiveDateSet = true;
    }
  
    if ((obj = record.get ("BillingFrequency")) != null)
    {
      out.BillingFrequency = (Integer) obj;
      out._BillingFrequencySet = true;
    }
  
    if ((obj = record.get ("RangeTerminus")) != null)
    {
      out.RangeTerminus = (BigInteger) obj;
      out._RangeTerminusSet = true;
    }
  
    return out;
  }
  /** convert Map to TaxRatesVatObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxRatesVatObjectKeyFilter the converted object
   */
  public static TaxRatesVatObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxRatesVatObjectKeyFilter out = new TaxRatesVatObjectKeyFilter ();

    Map TaxPkgInstIdMap = (Map)record.get("TaxPkgInstId");
    Boolean TaxPkgInstIdFetch = DataHelper.getFetch(TaxPkgInstIdMap);
    Boolean TaxPkgInstIdSortDir = DataHelper.getSortDirection(TaxPkgInstIdMap);
    Integer TaxPkgInstIdSortOrder = DataHelper.getSortOrder(TaxPkgInstIdMap);
    if (TaxPkgInstIdFetch != null) out.setTaxPkgInstIdFetch(TaxPkgInstIdFetch);
    if (TaxPkgInstIdSortDir != null) out.setTaxPkgInstIdSortDirection(TaxPkgInstIdSortDir);
    if (TaxPkgInstIdSortOrder != null) out.setTaxPkgInstIdSortOrder(TaxPkgInstIdSortOrder);

    Filter[] TaxPkgInstIdFilter = DataHelper.mapToFilterArray(TaxPkgInstIdMap, Integer.class);
    if (TaxPkgInstIdFilter != null) {
      IntegerFilter[] TaxPkgInstIdFilters = new IntegerFilter[TaxPkgInstIdFilter.length];
      for (int i = 0; i < TaxPkgInstIdFilters.length; i++) {
        TaxPkgInstIdFilters[i] = (IntegerFilter)TaxPkgInstIdFilter[i];
      }
      try {
        out.setTaxPkgInstIdFilter(TaxPkgInstIdFilters);
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
  
    Map TaxClassMap = (Map)record.get("TaxClass");
    Boolean TaxClassFetch = DataHelper.getFetch(TaxClassMap);
    Boolean TaxClassSortDir = DataHelper.getSortDirection(TaxClassMap);
    Integer TaxClassSortOrder = DataHelper.getSortOrder(TaxClassMap);
    if (TaxClassFetch != null) out.setTaxClassFetch(TaxClassFetch);
    if (TaxClassSortDir != null) out.setTaxClassSortDirection(TaxClassSortDir);
    if (TaxClassSortOrder != null) out.setTaxClassSortOrder(TaxClassSortOrder);

    Filter[] TaxClassFilter = DataHelper.mapToFilterArray(TaxClassMap, Integer.class);
    if (TaxClassFilter != null) {
      IntegerFilter[] TaxClassFilters = new IntegerFilter[TaxClassFilter.length];
      for (int i = 0; i < TaxClassFilters.length; i++) {
        TaxClassFilters[i] = (IntegerFilter)TaxClassFilter[i];
      }
      try {
        out.setTaxClassFilter(TaxClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDateMap = (Map)record.get("ActiveDate");
    Boolean ActiveDateFetch = DataHelper.getFetch(ActiveDateMap);
    Boolean ActiveDateSortDir = DataHelper.getSortDirection(ActiveDateMap);
    Integer ActiveDateSortOrder = DataHelper.getSortOrder(ActiveDateMap);
    if (ActiveDateFetch != null) out.setActiveDateFetch(ActiveDateFetch);
    if (ActiveDateSortDir != null) out.setActiveDateSortDirection(ActiveDateSortDir);
    if (ActiveDateSortOrder != null) out.setActiveDateSortOrder(ActiveDateSortOrder);

    Filter[] ActiveDateFilter = DataHelper.mapToFilterArray(ActiveDateMap, Date.class);
    if (ActiveDateFilter != null) {
      DateFilter[] ActiveDateFilters = new DateFilter[ActiveDateFilter.length];
      for (int i = 0; i < ActiveDateFilters.length; i++) {
        ActiveDateFilters[i] = (DateFilter)ActiveDateFilter[i];
      }
      try {
        out.setActiveDateFilter(ActiveDateFilters);
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
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
