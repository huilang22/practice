/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LateFeeRateOverridesObjectHelper.java
 * Definition File: Customer/LateFeeRateOverrides.xml
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



/** Helper class to convert LateFeeRateOverridesObject JavaBean objects to/from HashMaps.
 */
public class LateFeeRateOverridesObjectHelper implements ArubaObjectHelper
{
  /** convert LateFeeRateOverridesObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (LateFeeRateOverridesObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert LateFeeRateOverridesObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "LateFeeRateOverridesObject")
   * @return Map     the output Map
   */
  public static Map toMap (LateFeeRateOverridesObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "LateFeeRateOverridesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert LateFeeRateOverridesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (LateFeeRateOverridesObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert LateFeeRateOverridesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "LateFeeRateOverridesObject")
   * @return Map     the output Map
   */
  public static Map toMap (LateFeeRateOverridesObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "LateFeeRateOverridesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to LateFeeRateOverridesObjectData.
   * @param record the Map containing the data to convert to the object
   * @return LateFeeRateOverridesObjectData the converted object
   */
  public static LateFeeRateOverridesObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to LateFeeRateOverridesObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "LateFeeRateOverridesObject")
   * @return LateFeeRateOverridesObjectData the converted object
   */
  public static LateFeeRateOverridesObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "LateFeeRateOverridesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to LateFeeRateOverridesObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return LateFeeRateOverridesObjectFilter the converted object
   */
  public static LateFeeRateOverridesObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to LateFeeRateOverridesObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "LateFeeRateOverridesObject")
   * @return LateFeeRateOverridesObjectFilter the converted object
   */
  public static LateFeeRateOverridesObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "LateFeeRateOverridesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to LateFeeRateOverridesObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return LateFeeRateOverridesObjectDataList the converted object
   */
  public static LateFeeRateOverridesObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to LateFeeRateOverridesObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "LateFeeRateOverridesObjectList")
   * @return LateFeeRateOverridesObjectDataList the converted object
   */
  public static LateFeeRateOverridesObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "LateFeeRateOverridesObjectList";
    Object[] root = (Object[]) record.get (rootName);
    LateFeeRateOverridesObjectData[] array = null;
    if (root != null)
    {
      array = new LateFeeRateOverridesObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = LateFeeRateOverridesObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new LateFeeRateOverridesObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new LateFeeRateOverridesObjectDataList (array, index, total);
  }
  /** convert LateFeeRateOverridesObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (LateFeeRateOverridesObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", LateFeeRateOverridesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._RateAmtSet) record.put ("RateAmt", in.RateAmt);
  
    if (in._RatePctSet) record.put ("RatePct", in.RatePct);
  
    if (in._AddImpliedDecimalsSet) record.put ("AddImpliedDecimals", in.AddImpliedDecimals);
  
    if (in._DelayOriginSet) record.put ("DelayOrigin", in.DelayOrigin);
  
    if (in._DelayTerminusSet) record.put ("DelayTerminus", in.DelayTerminus);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._CalculationTypeSet) record.put ("CalculationType", in.CalculationType);
  
    if (in._MinAmtSet) record.put ("MinAmt", in.MinAmt);
  
    if (in._MaxAmtSet) record.put ("MaxAmt", in.MaxAmt);
  
    if (in._TypeIdNrcSet) record.put ("TypeIdNrc", in.TypeIdNrc);
  
    if (in._GracePeriodSet) record.put ("GracePeriod", in.GracePeriod);
  
    if (in._MinBalThreshSet) record.put ("MinBalThresh", in.MinBalThresh);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._ProductLineIdSet) record.put ("ProductLineId", in.ProductLineId);
  
    if (in._DualLateFeeSet) record.put ("DualLateFee", in.DualLateFee);
      return record;
  }
  /** convert LateFeeRateOverridesObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (LateFeeRateOverridesObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", LateFeeRateOverridesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.RateAmt, in.RateAmtSort, in.RateAmtSortAscending, in.RateAmtFetch);
      if (map != null) record.put ("RateAmt", map);
      map = DataHelper.filterToMap (in.RatePct, in.RatePctSort, in.RatePctSortAscending, in.RatePctFetch);
      if (map != null) record.put ("RatePct", map);
      map = DataHelper.filterToMap (in.AddImpliedDecimals, in.AddImpliedDecimalsSort, in.AddImpliedDecimalsSortAscending, in.AddImpliedDecimalsFetch);
      if (map != null) record.put ("AddImpliedDecimals", map);
      map = DataHelper.filterToMap (in.DelayOrigin, in.DelayOriginSort, in.DelayOriginSortAscending, in.DelayOriginFetch);
      if (map != null) record.put ("DelayOrigin", map);
      map = DataHelper.filterToMap (in.DelayTerminus, in.DelayTerminusSort, in.DelayTerminusSortAscending, in.DelayTerminusFetch);
      if (map != null) record.put ("DelayTerminus", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.CalculationType, in.CalculationTypeSort, in.CalculationTypeSortAscending, in.CalculationTypeFetch);
      if (map != null) record.put ("CalculationType", map);
      map = DataHelper.filterToMap (in.MinAmt, in.MinAmtSort, in.MinAmtSortAscending, in.MinAmtFetch);
      if (map != null) record.put ("MinAmt", map);
      map = DataHelper.filterToMap (in.MaxAmt, in.MaxAmtSort, in.MaxAmtSortAscending, in.MaxAmtFetch);
      if (map != null) record.put ("MaxAmt", map);
      map = DataHelper.filterToMap (in.TypeIdNrc, in.TypeIdNrcSort, in.TypeIdNrcSortAscending, in.TypeIdNrcFetch);
      if (map != null) record.put ("TypeIdNrc", map);
      map = DataHelper.filterToMap (in.GracePeriod, in.GracePeriodSort, in.GracePeriodSortAscending, in.GracePeriodFetch);
      if (map != null) record.put ("GracePeriod", map);
      map = DataHelper.filterToMap (in.MinBalThresh, in.MinBalThreshSort, in.MinBalThreshSortAscending, in.MinBalThreshFetch);
      if (map != null) record.put ("MinBalThresh", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.ProductLineId, in.ProductLineIdSort, in.ProductLineIdSortAscending, in.ProductLineIdFetch);
      if (map != null) record.put ("ProductLineId", map);
      map = DataHelper.filterToMap (in.DualLateFee, in.DualLateFeeSort, in.DualLateFeeSortAscending, in.DualLateFeeFetch);
      if (map != null) record.put ("DualLateFee", map);
    return record;
  }
  /** convert Map to LateFeeRateOverridesObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return LateFeeRateOverridesObjectData the converted object
   */
  public static LateFeeRateOverridesObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    LateFeeRateOverridesObjectData out = new LateFeeRateOverridesObjectData ();

    out.Key = LateFeeRateOverridesObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("RateAmt")) != null)
    {
      out.RateAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RatePct")) != null)
    {
      out.RatePct = (Integer) obj;
    }
  
    if ((obj = record.get ("AddImpliedDecimals")) != null)
    {
      out.AddImpliedDecimals = (Integer) obj;
    }
  
    if ((obj = record.get ("DelayOrigin")) != null)
    {
      out.DelayOrigin = (Integer) obj;
    }
  
    if ((obj = record.get ("DelayTerminus")) != null)
    {
      out.DelayTerminus = (Integer) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("CalculationType")) != null)
    {
      out.CalculationType = (Integer) obj;
    }
  
    if ((obj = record.get ("MinAmt")) != null)
    {
      out.MinAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("MaxAmt")) != null)
    {
      out.MaxAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TypeIdNrc")) != null)
    {
      out.TypeIdNrc = (Integer) obj;
    }
  
    if ((obj = record.get ("GracePeriod")) != null)
    {
      out.GracePeriod = (Integer) obj;
    }
  
    if ((obj = record.get ("MinBalThresh")) != null)
    {
      out.MinBalThresh = (BigInteger) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("ProductLineId")) != null)
    {
      out.ProductLineId = (Integer) obj;
    }
  
    if ((obj = record.get ("DualLateFee")) != null)
    {
      out.DualLateFee = (Integer) obj;
    }
      return out;
  }
  /** convert Map to LateFeeRateOverridesObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return LateFeeRateOverridesObjectFilter the converted object
   */
  public static LateFeeRateOverridesObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    LateFeeRateOverridesObjectFilter out = new LateFeeRateOverridesObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = LateFeeRateOverridesObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map RateAmtMap = (Map)record.get("RateAmt");
    Boolean RateAmtFetch = DataHelper.getFetch(RateAmtMap);
    Boolean RateAmtSortDir = DataHelper.getSortDirection(RateAmtMap);
    Integer RateAmtSortOrder = DataHelper.getSortOrder(RateAmtMap);
    if (RateAmtFetch != null) out.setRateAmtFetch(RateAmtFetch);
    if (RateAmtSortDir != null) out.setRateAmtSortDirection(RateAmtSortDir);
    if (RateAmtSortOrder != null) out.setRateAmtSortOrder(RateAmtSortOrder);

    Filter[] RateAmtFilter = DataHelper.mapToFilterArray(RateAmtMap, BigInteger.class);
    if (RateAmtFilter != null) {
      BigIntegerFilter[] RateAmtFilters = new BigIntegerFilter[RateAmtFilter.length];
      for (int i = 0; i < RateAmtFilters.length; i++) {
        RateAmtFilters[i] = (BigIntegerFilter)RateAmtFilter[i];
      }
      try {
        out.setRateAmtFilter(RateAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RatePctMap = (Map)record.get("RatePct");
    Boolean RatePctFetch = DataHelper.getFetch(RatePctMap);
    Boolean RatePctSortDir = DataHelper.getSortDirection(RatePctMap);
    Integer RatePctSortOrder = DataHelper.getSortOrder(RatePctMap);
    if (RatePctFetch != null) out.setRatePctFetch(RatePctFetch);
    if (RatePctSortDir != null) out.setRatePctSortDirection(RatePctSortDir);
    if (RatePctSortOrder != null) out.setRatePctSortOrder(RatePctSortOrder);

    Filter[] RatePctFilter = DataHelper.mapToFilterArray(RatePctMap, Integer.class);
    if (RatePctFilter != null) {
      IntegerFilter[] RatePctFilters = new IntegerFilter[RatePctFilter.length];
      for (int i = 0; i < RatePctFilters.length; i++) {
        RatePctFilters[i] = (IntegerFilter)RatePctFilter[i];
      }
      try {
        out.setRatePctFilter(RatePctFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddImpliedDecimalsMap = (Map)record.get("AddImpliedDecimals");
    Boolean AddImpliedDecimalsFetch = DataHelper.getFetch(AddImpliedDecimalsMap);
    Boolean AddImpliedDecimalsSortDir = DataHelper.getSortDirection(AddImpliedDecimalsMap);
    Integer AddImpliedDecimalsSortOrder = DataHelper.getSortOrder(AddImpliedDecimalsMap);
    if (AddImpliedDecimalsFetch != null) out.setAddImpliedDecimalsFetch(AddImpliedDecimalsFetch);
    if (AddImpliedDecimalsSortDir != null) out.setAddImpliedDecimalsSortDirection(AddImpliedDecimalsSortDir);
    if (AddImpliedDecimalsSortOrder != null) out.setAddImpliedDecimalsSortOrder(AddImpliedDecimalsSortOrder);

    Filter[] AddImpliedDecimalsFilter = DataHelper.mapToFilterArray(AddImpliedDecimalsMap, Integer.class);
    if (AddImpliedDecimalsFilter != null) {
      IntegerFilter[] AddImpliedDecimalsFilters = new IntegerFilter[AddImpliedDecimalsFilter.length];
      for (int i = 0; i < AddImpliedDecimalsFilters.length; i++) {
        AddImpliedDecimalsFilters[i] = (IntegerFilter)AddImpliedDecimalsFilter[i];
      }
      try {
        out.setAddImpliedDecimalsFilter(AddImpliedDecimalsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DelayOriginMap = (Map)record.get("DelayOrigin");
    Boolean DelayOriginFetch = DataHelper.getFetch(DelayOriginMap);
    Boolean DelayOriginSortDir = DataHelper.getSortDirection(DelayOriginMap);
    Integer DelayOriginSortOrder = DataHelper.getSortOrder(DelayOriginMap);
    if (DelayOriginFetch != null) out.setDelayOriginFetch(DelayOriginFetch);
    if (DelayOriginSortDir != null) out.setDelayOriginSortDirection(DelayOriginSortDir);
    if (DelayOriginSortOrder != null) out.setDelayOriginSortOrder(DelayOriginSortOrder);

    Filter[] DelayOriginFilter = DataHelper.mapToFilterArray(DelayOriginMap, Integer.class);
    if (DelayOriginFilter != null) {
      IntegerFilter[] DelayOriginFilters = new IntegerFilter[DelayOriginFilter.length];
      for (int i = 0; i < DelayOriginFilters.length; i++) {
        DelayOriginFilters[i] = (IntegerFilter)DelayOriginFilter[i];
      }
      try {
        out.setDelayOriginFilter(DelayOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DelayTerminusMap = (Map)record.get("DelayTerminus");
    Boolean DelayTerminusFetch = DataHelper.getFetch(DelayTerminusMap);
    Boolean DelayTerminusSortDir = DataHelper.getSortDirection(DelayTerminusMap);
    Integer DelayTerminusSortOrder = DataHelper.getSortOrder(DelayTerminusMap);
    if (DelayTerminusFetch != null) out.setDelayTerminusFetch(DelayTerminusFetch);
    if (DelayTerminusSortDir != null) out.setDelayTerminusSortDirection(DelayTerminusSortDir);
    if (DelayTerminusSortOrder != null) out.setDelayTerminusSortOrder(DelayTerminusSortOrder);

    Filter[] DelayTerminusFilter = DataHelper.mapToFilterArray(DelayTerminusMap, Integer.class);
    if (DelayTerminusFilter != null) {
      IntegerFilter[] DelayTerminusFilters = new IntegerFilter[DelayTerminusFilter.length];
      for (int i = 0; i < DelayTerminusFilters.length; i++) {
        DelayTerminusFilters[i] = (IntegerFilter)DelayTerminusFilter[i];
      }
      try {
        out.setDelayTerminusFilter(DelayTerminusFilters);
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
  
    Map CalculationTypeMap = (Map)record.get("CalculationType");
    Boolean CalculationTypeFetch = DataHelper.getFetch(CalculationTypeMap);
    Boolean CalculationTypeSortDir = DataHelper.getSortDirection(CalculationTypeMap);
    Integer CalculationTypeSortOrder = DataHelper.getSortOrder(CalculationTypeMap);
    if (CalculationTypeFetch != null) out.setCalculationTypeFetch(CalculationTypeFetch);
    if (CalculationTypeSortDir != null) out.setCalculationTypeSortDirection(CalculationTypeSortDir);
    if (CalculationTypeSortOrder != null) out.setCalculationTypeSortOrder(CalculationTypeSortOrder);

    Filter[] CalculationTypeFilter = DataHelper.mapToFilterArray(CalculationTypeMap, Integer.class);
    if (CalculationTypeFilter != null) {
      IntegerFilter[] CalculationTypeFilters = new IntegerFilter[CalculationTypeFilter.length];
      for (int i = 0; i < CalculationTypeFilters.length; i++) {
        CalculationTypeFilters[i] = (IntegerFilter)CalculationTypeFilter[i];
      }
      try {
        out.setCalculationTypeFilter(CalculationTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MinAmtMap = (Map)record.get("MinAmt");
    Boolean MinAmtFetch = DataHelper.getFetch(MinAmtMap);
    Boolean MinAmtSortDir = DataHelper.getSortDirection(MinAmtMap);
    Integer MinAmtSortOrder = DataHelper.getSortOrder(MinAmtMap);
    if (MinAmtFetch != null) out.setMinAmtFetch(MinAmtFetch);
    if (MinAmtSortDir != null) out.setMinAmtSortDirection(MinAmtSortDir);
    if (MinAmtSortOrder != null) out.setMinAmtSortOrder(MinAmtSortOrder);

    Filter[] MinAmtFilter = DataHelper.mapToFilterArray(MinAmtMap, BigInteger.class);
    if (MinAmtFilter != null) {
      BigIntegerFilter[] MinAmtFilters = new BigIntegerFilter[MinAmtFilter.length];
      for (int i = 0; i < MinAmtFilters.length; i++) {
        MinAmtFilters[i] = (BigIntegerFilter)MinAmtFilter[i];
      }
      try {
        out.setMinAmtFilter(MinAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MaxAmtMap = (Map)record.get("MaxAmt");
    Boolean MaxAmtFetch = DataHelper.getFetch(MaxAmtMap);
    Boolean MaxAmtSortDir = DataHelper.getSortDirection(MaxAmtMap);
    Integer MaxAmtSortOrder = DataHelper.getSortOrder(MaxAmtMap);
    if (MaxAmtFetch != null) out.setMaxAmtFetch(MaxAmtFetch);
    if (MaxAmtSortDir != null) out.setMaxAmtSortDirection(MaxAmtSortDir);
    if (MaxAmtSortOrder != null) out.setMaxAmtSortOrder(MaxAmtSortOrder);

    Filter[] MaxAmtFilter = DataHelper.mapToFilterArray(MaxAmtMap, BigInteger.class);
    if (MaxAmtFilter != null) {
      BigIntegerFilter[] MaxAmtFilters = new BigIntegerFilter[MaxAmtFilter.length];
      for (int i = 0; i < MaxAmtFilters.length; i++) {
        MaxAmtFilters[i] = (BigIntegerFilter)MaxAmtFilter[i];
      }
      try {
        out.setMaxAmtFilter(MaxAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TypeIdNrcMap = (Map)record.get("TypeIdNrc");
    Boolean TypeIdNrcFetch = DataHelper.getFetch(TypeIdNrcMap);
    Boolean TypeIdNrcSortDir = DataHelper.getSortDirection(TypeIdNrcMap);
    Integer TypeIdNrcSortOrder = DataHelper.getSortOrder(TypeIdNrcMap);
    if (TypeIdNrcFetch != null) out.setTypeIdNrcFetch(TypeIdNrcFetch);
    if (TypeIdNrcSortDir != null) out.setTypeIdNrcSortDirection(TypeIdNrcSortDir);
    if (TypeIdNrcSortOrder != null) out.setTypeIdNrcSortOrder(TypeIdNrcSortOrder);

    Filter[] TypeIdNrcFilter = DataHelper.mapToFilterArray(TypeIdNrcMap, Integer.class);
    if (TypeIdNrcFilter != null) {
      IntegerFilter[] TypeIdNrcFilters = new IntegerFilter[TypeIdNrcFilter.length];
      for (int i = 0; i < TypeIdNrcFilters.length; i++) {
        TypeIdNrcFilters[i] = (IntegerFilter)TypeIdNrcFilter[i];
      }
      try {
        out.setTypeIdNrcFilter(TypeIdNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GracePeriodMap = (Map)record.get("GracePeriod");
    Boolean GracePeriodFetch = DataHelper.getFetch(GracePeriodMap);
    Boolean GracePeriodSortDir = DataHelper.getSortDirection(GracePeriodMap);
    Integer GracePeriodSortOrder = DataHelper.getSortOrder(GracePeriodMap);
    if (GracePeriodFetch != null) out.setGracePeriodFetch(GracePeriodFetch);
    if (GracePeriodSortDir != null) out.setGracePeriodSortDirection(GracePeriodSortDir);
    if (GracePeriodSortOrder != null) out.setGracePeriodSortOrder(GracePeriodSortOrder);

    Filter[] GracePeriodFilter = DataHelper.mapToFilterArray(GracePeriodMap, Integer.class);
    if (GracePeriodFilter != null) {
      IntegerFilter[] GracePeriodFilters = new IntegerFilter[GracePeriodFilter.length];
      for (int i = 0; i < GracePeriodFilters.length; i++) {
        GracePeriodFilters[i] = (IntegerFilter)GracePeriodFilter[i];
      }
      try {
        out.setGracePeriodFilter(GracePeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MinBalThreshMap = (Map)record.get("MinBalThresh");
    Boolean MinBalThreshFetch = DataHelper.getFetch(MinBalThreshMap);
    Boolean MinBalThreshSortDir = DataHelper.getSortDirection(MinBalThreshMap);
    Integer MinBalThreshSortOrder = DataHelper.getSortOrder(MinBalThreshMap);
    if (MinBalThreshFetch != null) out.setMinBalThreshFetch(MinBalThreshFetch);
    if (MinBalThreshSortDir != null) out.setMinBalThreshSortDirection(MinBalThreshSortDir);
    if (MinBalThreshSortOrder != null) out.setMinBalThreshSortOrder(MinBalThreshSortOrder);

    Filter[] MinBalThreshFilter = DataHelper.mapToFilterArray(MinBalThreshMap, BigInteger.class);
    if (MinBalThreshFilter != null) {
      BigIntegerFilter[] MinBalThreshFilters = new BigIntegerFilter[MinBalThreshFilter.length];
      for (int i = 0; i < MinBalThreshFilters.length; i++) {
        MinBalThreshFilters[i] = (BigIntegerFilter)MinBalThreshFilter[i];
      }
      try {
        out.setMinBalThreshFilter(MinBalThreshFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OpenItemIdMap = (Map)record.get("OpenItemId");
    Boolean OpenItemIdFetch = DataHelper.getFetch(OpenItemIdMap);
    Boolean OpenItemIdSortDir = DataHelper.getSortDirection(OpenItemIdMap);
    Integer OpenItemIdSortOrder = DataHelper.getSortOrder(OpenItemIdMap);
    if (OpenItemIdFetch != null) out.setOpenItemIdFetch(OpenItemIdFetch);
    if (OpenItemIdSortDir != null) out.setOpenItemIdSortDirection(OpenItemIdSortDir);
    if (OpenItemIdSortOrder != null) out.setOpenItemIdSortOrder(OpenItemIdSortOrder);

    Filter[] OpenItemIdFilter = DataHelper.mapToFilterArray(OpenItemIdMap, Integer.class);
    if (OpenItemIdFilter != null) {
      IntegerFilter[] OpenItemIdFilters = new IntegerFilter[OpenItemIdFilter.length];
      for (int i = 0; i < OpenItemIdFilters.length; i++) {
        OpenItemIdFilters[i] = (IntegerFilter)OpenItemIdFilter[i];
      }
      try {
        out.setOpenItemIdFilter(OpenItemIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProductLineIdMap = (Map)record.get("ProductLineId");
    Boolean ProductLineIdFetch = DataHelper.getFetch(ProductLineIdMap);
    Boolean ProductLineIdSortDir = DataHelper.getSortDirection(ProductLineIdMap);
    Integer ProductLineIdSortOrder = DataHelper.getSortOrder(ProductLineIdMap);
    if (ProductLineIdFetch != null) out.setProductLineIdFetch(ProductLineIdFetch);
    if (ProductLineIdSortDir != null) out.setProductLineIdSortDirection(ProductLineIdSortDir);
    if (ProductLineIdSortOrder != null) out.setProductLineIdSortOrder(ProductLineIdSortOrder);

    Filter[] ProductLineIdFilter = DataHelper.mapToFilterArray(ProductLineIdMap, Integer.class);
    if (ProductLineIdFilter != null) {
      IntegerFilter[] ProductLineIdFilters = new IntegerFilter[ProductLineIdFilter.length];
      for (int i = 0; i < ProductLineIdFilters.length; i++) {
        ProductLineIdFilters[i] = (IntegerFilter)ProductLineIdFilter[i];
      }
      try {
        out.setProductLineIdFilter(ProductLineIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DualLateFeeMap = (Map)record.get("DualLateFee");
    Boolean DualLateFeeFetch = DataHelper.getFetch(DualLateFeeMap);
    Boolean DualLateFeeSortDir = DataHelper.getSortDirection(DualLateFeeMap);
    Integer DualLateFeeSortOrder = DataHelper.getSortOrder(DualLateFeeMap);
    if (DualLateFeeFetch != null) out.setDualLateFeeFetch(DualLateFeeFetch);
    if (DualLateFeeSortDir != null) out.setDualLateFeeSortDirection(DualLateFeeSortDir);
    if (DualLateFeeSortOrder != null) out.setDualLateFeeSortOrder(DualLateFeeSortOrder);

    Filter[] DualLateFeeFilter = DataHelper.mapToFilterArray(DualLateFeeMap, Integer.class);
    if (DualLateFeeFilter != null) {
      IntegerFilter[] DualLateFeeFilters = new IntegerFilter[DualLateFeeFilter.length];
      for (int i = 0; i < DualLateFeeFilters.length; i++) {
        DualLateFeeFilters[i] = (IntegerFilter)DualLateFeeFilter[i];
      }
      try {
        out.setDualLateFeeFilter(DualLateFeeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
