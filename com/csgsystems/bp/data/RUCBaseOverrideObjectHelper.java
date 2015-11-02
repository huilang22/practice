/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RUCBaseOverrideObjectHelper.java
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



/** Helper class to convert RUCBaseOverrideObject JavaBean objects to/from HashMaps.
 */
public class RUCBaseOverrideObjectHelper implements ArubaObjectHelper
{
  /** convert RUCBaseOverrideObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (RUCBaseOverrideObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RUCBaseOverrideObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RUCBaseOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (RUCBaseOverrideObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RUCBaseOverrideObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert RUCBaseOverrideObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RUCBaseOverrideObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RUCBaseOverrideObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RUCBaseOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (RUCBaseOverrideObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RUCBaseOverrideObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RUCBaseOverrideObjectData.
   * @param record the Map containing the data to convert to the object
   * @return RUCBaseOverrideObjectData the converted object
   */
  public static RUCBaseOverrideObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RUCBaseOverrideObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RUCBaseOverrideObject")
   * @return RUCBaseOverrideObjectData the converted object
   */
  public static RUCBaseOverrideObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCBaseOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RUCBaseOverrideObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return RUCBaseOverrideObjectFilter the converted object
   */
  public static RUCBaseOverrideObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RUCBaseOverrideObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RUCBaseOverrideObject")
   * @return RUCBaseOverrideObjectFilter the converted object
   */
  public static RUCBaseOverrideObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCBaseOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to RUCBaseOverrideObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return RUCBaseOverrideObjectDataList the converted object
   */
  public static RUCBaseOverrideObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to RUCBaseOverrideObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "RUCBaseOverrideObjectList")
   * @return RUCBaseOverrideObjectDataList the converted object
   */
  public static RUCBaseOverrideObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RUCBaseOverrideObjectList";
    Object[] root = (Object[]) record.get (rootName);
    RUCBaseOverrideObjectData[] array = null;
    if (root != null)
    {
      array = new RUCBaseOverrideObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = RUCBaseOverrideObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new RUCBaseOverrideObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new RUCBaseOverrideObjectDataList (array, index, total);
  }
  /** convert RUCBaseOverrideObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RUCBaseOverrideObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", RUCBaseOverrideObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._UnitCrQuantumSet) record.put ("UnitCrQuantum", in.UnitCrQuantum);
  
    if (in._ContractTrackingIdSet) record.put ("ContractTrackingId", in.ContractTrackingId);
  
    if (in._ContractTrackingIdServSet) record.put ("ContractTrackingIdServ", in.ContractTrackingIdServ);
  
    if (in._UnitCrIdSet) record.put ("UnitCrId", in.UnitCrId);
  
    if (in._UnitsFreeSet) record.put ("UnitsFree", in.UnitsFree);
  
    if (in._BillingFrequencySet) record.put ("BillingFrequency", in.BillingFrequency);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._AmountFreeSet) record.put ("AmountFree", in.AmountFree);
  
    if (in._RangeOriginSet) record.put ("RangeOrigin", in.RangeOrigin);
  
    if (in._RangeTerminusSet) record.put ("RangeTerminus", in.RangeTerminus);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
      return record;
  }
  /** convert RUCBaseOverrideObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RUCBaseOverrideObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", RUCBaseOverrideObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.UnitCrQuantum, in.UnitCrQuantumSort, in.UnitCrQuantumSortAscending, in.UnitCrQuantumFetch);
      if (map != null) record.put ("UnitCrQuantum", map);
      map = DataHelper.filterToMap (in.ContractTrackingId, in.ContractTrackingIdSort, in.ContractTrackingIdSortAscending, in.ContractTrackingIdFetch);
      if (map != null) record.put ("ContractTrackingId", map);
      map = DataHelper.filterToMap (in.ContractTrackingIdServ, in.ContractTrackingIdServSort, in.ContractTrackingIdServSortAscending, in.ContractTrackingIdServFetch);
      if (map != null) record.put ("ContractTrackingIdServ", map);
      map = DataHelper.filterToMap (in.UnitCrId, in.UnitCrIdSort, in.UnitCrIdSortAscending, in.UnitCrIdFetch);
      if (map != null) record.put ("UnitCrId", map);
      map = DataHelper.filterToMap (in.UnitsFree, in.UnitsFreeSort, in.UnitsFreeSortAscending, in.UnitsFreeFetch);
      if (map != null) record.put ("UnitsFree", map);
      map = DataHelper.filterToMap (in.BillingFrequency, in.BillingFrequencySort, in.BillingFrequencySortAscending, in.BillingFrequencyFetch);
      if (map != null) record.put ("BillingFrequency", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.AmountFree, in.AmountFreeSort, in.AmountFreeSortAscending, in.AmountFreeFetch);
      if (map != null) record.put ("AmountFree", map);
      map = DataHelper.filterToMap (in.RangeOrigin, in.RangeOriginSort, in.RangeOriginSortAscending, in.RangeOriginFetch);
      if (map != null) record.put ("RangeOrigin", map);
      map = DataHelper.filterToMap (in.RangeTerminus, in.RangeTerminusSort, in.RangeTerminusSortAscending, in.RangeTerminusFetch);
      if (map != null) record.put ("RangeTerminus", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
    return record;
  }
  /** convert Map to RUCBaseOverrideObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RUCBaseOverrideObjectData the converted object
   */
  public static RUCBaseOverrideObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RUCBaseOverrideObjectData out = new RUCBaseOverrideObjectData ();

    out.Key = RUCBaseOverrideObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("UnitCrQuantum")) != null)
    {
      out.UnitCrQuantum = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractTrackingId")) != null)
    {
      out.ContractTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractTrackingIdServ")) != null)
    {
      out.ContractTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("UnitCrId")) != null)
    {
      out.UnitCrId = (Integer) obj;
    }
  
    if ((obj = record.get ("UnitsFree")) != null)
    {
      out.UnitsFree = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BillingFrequency")) != null)
    {
      out.BillingFrequency = (Integer) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("AmountFree")) != null)
    {
      out.AmountFree = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RangeOrigin")) != null)
    {
      out.RangeOrigin = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RangeTerminus")) != null)
    {
      out.RangeTerminus = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CreateDt")) != null)
    {
      out.CreateDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
      return out;
  }
  /** convert Map to RUCBaseOverrideObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RUCBaseOverrideObjectFilter the converted object
   */
  public static RUCBaseOverrideObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RUCBaseOverrideObjectFilter out = new RUCBaseOverrideObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = RUCBaseOverrideObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map UnitCrQuantumMap = (Map)record.get("UnitCrQuantum");
    Boolean UnitCrQuantumFetch = DataHelper.getFetch(UnitCrQuantumMap);
    Boolean UnitCrQuantumSortDir = DataHelper.getSortDirection(UnitCrQuantumMap);
    Integer UnitCrQuantumSortOrder = DataHelper.getSortOrder(UnitCrQuantumMap);
    if (UnitCrQuantumFetch != null) out.setUnitCrQuantumFetch(UnitCrQuantumFetch);
    if (UnitCrQuantumSortDir != null) out.setUnitCrQuantumSortDirection(UnitCrQuantumSortDir);
    if (UnitCrQuantumSortOrder != null) out.setUnitCrQuantumSortOrder(UnitCrQuantumSortOrder);

    Filter[] UnitCrQuantumFilter = DataHelper.mapToFilterArray(UnitCrQuantumMap, Integer.class);
    if (UnitCrQuantumFilter != null) {
      IntegerFilter[] UnitCrQuantumFilters = new IntegerFilter[UnitCrQuantumFilter.length];
      for (int i = 0; i < UnitCrQuantumFilters.length; i++) {
        UnitCrQuantumFilters[i] = (IntegerFilter)UnitCrQuantumFilter[i];
      }
      try {
        out.setUnitCrQuantumFilter(UnitCrQuantumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTrackingIdMap = (Map)record.get("ContractTrackingId");
    Boolean ContractTrackingIdFetch = DataHelper.getFetch(ContractTrackingIdMap);
    Boolean ContractTrackingIdSortDir = DataHelper.getSortDirection(ContractTrackingIdMap);
    Integer ContractTrackingIdSortOrder = DataHelper.getSortOrder(ContractTrackingIdMap);
    if (ContractTrackingIdFetch != null) out.setContractTrackingIdFetch(ContractTrackingIdFetch);
    if (ContractTrackingIdSortDir != null) out.setContractTrackingIdSortDirection(ContractTrackingIdSortDir);
    if (ContractTrackingIdSortOrder != null) out.setContractTrackingIdSortOrder(ContractTrackingIdSortOrder);

    Filter[] ContractTrackingIdFilter = DataHelper.mapToFilterArray(ContractTrackingIdMap, Integer.class);
    if (ContractTrackingIdFilter != null) {
      IntegerFilter[] ContractTrackingIdFilters = new IntegerFilter[ContractTrackingIdFilter.length];
      for (int i = 0; i < ContractTrackingIdFilters.length; i++) {
        ContractTrackingIdFilters[i] = (IntegerFilter)ContractTrackingIdFilter[i];
      }
      try {
        out.setContractTrackingIdFilter(ContractTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTrackingIdServMap = (Map)record.get("ContractTrackingIdServ");
    Boolean ContractTrackingIdServFetch = DataHelper.getFetch(ContractTrackingIdServMap);
    Boolean ContractTrackingIdServSortDir = DataHelper.getSortDirection(ContractTrackingIdServMap);
    Integer ContractTrackingIdServSortOrder = DataHelper.getSortOrder(ContractTrackingIdServMap);
    if (ContractTrackingIdServFetch != null) out.setContractTrackingIdServFetch(ContractTrackingIdServFetch);
    if (ContractTrackingIdServSortDir != null) out.setContractTrackingIdServSortDirection(ContractTrackingIdServSortDir);
    if (ContractTrackingIdServSortOrder != null) out.setContractTrackingIdServSortOrder(ContractTrackingIdServSortOrder);

    Filter[] ContractTrackingIdServFilter = DataHelper.mapToFilterArray(ContractTrackingIdServMap, Integer.class);
    if (ContractTrackingIdServFilter != null) {
      IntegerFilter[] ContractTrackingIdServFilters = new IntegerFilter[ContractTrackingIdServFilter.length];
      for (int i = 0; i < ContractTrackingIdServFilters.length; i++) {
        ContractTrackingIdServFilters[i] = (IntegerFilter)ContractTrackingIdServFilter[i];
      }
      try {
        out.setContractTrackingIdServFilter(ContractTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    Map CreateDtMap = (Map)record.get("CreateDt");
    Boolean CreateDtFetch = DataHelper.getFetch(CreateDtMap);
    Boolean CreateDtSortDir = DataHelper.getSortDirection(CreateDtMap);
    Integer CreateDtSortOrder = DataHelper.getSortOrder(CreateDtMap);
    if (CreateDtFetch != null) out.setCreateDtFetch(CreateDtFetch);
    if (CreateDtSortDir != null) out.setCreateDtSortDirection(CreateDtSortDir);
    if (CreateDtSortOrder != null) out.setCreateDtSortOrder(CreateDtSortOrder);

    Filter[] CreateDtFilter = DataHelper.mapToFilterArray(CreateDtMap, Date.class);
    if (CreateDtFilter != null) {
      DateFilter[] CreateDtFilters = new DateFilter[CreateDtFilter.length];
      for (int i = 0; i < CreateDtFilters.length; i++) {
        CreateDtFilters[i] = (DateFilter)CreateDtFilter[i];
      }
      try {
        out.setCreateDtFilter(CreateDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDtMap = (Map)record.get("ChgDt");
    Boolean ChgDtFetch = DataHelper.getFetch(ChgDtMap);
    Boolean ChgDtSortDir = DataHelper.getSortDirection(ChgDtMap);
    Integer ChgDtSortOrder = DataHelper.getSortOrder(ChgDtMap);
    if (ChgDtFetch != null) out.setChgDtFetch(ChgDtFetch);
    if (ChgDtSortDir != null) out.setChgDtSortDirection(ChgDtSortDir);
    if (ChgDtSortOrder != null) out.setChgDtSortOrder(ChgDtSortOrder);

    Filter[] ChgDtFilter = DataHelper.mapToFilterArray(ChgDtMap, Date.class);
    if (ChgDtFilter != null) {
      DateFilter[] ChgDtFilters = new DateFilter[ChgDtFilter.length];
      for (int i = 0; i < ChgDtFilters.length; i++) {
        ChgDtFilters[i] = (DateFilter)ChgDtFilter[i];
      }
      try {
        out.setChgDtFilter(ChgDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgWhoMap = (Map)record.get("ChgWho");
    Boolean ChgWhoFetch = DataHelper.getFetch(ChgWhoMap);
    Boolean ChgWhoSortDir = DataHelper.getSortDirection(ChgWhoMap);
    Integer ChgWhoSortOrder = DataHelper.getSortOrder(ChgWhoMap);
    if (ChgWhoFetch != null) out.setChgWhoFetch(ChgWhoFetch);
    if (ChgWhoSortDir != null) out.setChgWhoSortDirection(ChgWhoSortDir);
    if (ChgWhoSortOrder != null) out.setChgWhoSortOrder(ChgWhoSortOrder);

    Filter[] ChgWhoFilter = DataHelper.mapToFilterArray(ChgWhoMap, String.class);
    if (ChgWhoFilter != null) {
      StringFilter[] ChgWhoFilters = new StringFilter[ChgWhoFilter.length];
      for (int i = 0; i < ChgWhoFilters.length; i++) {
        ChgWhoFilters[i] = (StringFilter)ChgWhoFilter[i];
      }
      try {
        out.setChgWhoFilter(ChgWhoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDtMap = (Map)record.get("ActiveDt");
    Boolean ActiveDtFetch = DataHelper.getFetch(ActiveDtMap);
    Boolean ActiveDtSortDir = DataHelper.getSortDirection(ActiveDtMap);
    Integer ActiveDtSortOrder = DataHelper.getSortOrder(ActiveDtMap);
    if (ActiveDtFetch != null) out.setActiveDtFetch(ActiveDtFetch);
    if (ActiveDtSortDir != null) out.setActiveDtSortDirection(ActiveDtSortDir);
    if (ActiveDtSortOrder != null) out.setActiveDtSortOrder(ActiveDtSortOrder);

    Filter[] ActiveDtFilter = DataHelper.mapToFilterArray(ActiveDtMap, Date.class);
    if (ActiveDtFilter != null) {
      DateFilter[] ActiveDtFilters = new DateFilter[ActiveDtFilter.length];
      for (int i = 0; i < ActiveDtFilters.length; i++) {
        ActiveDtFilters[i] = (DateFilter)ActiveDtFilter[i];
      }
      try {
        out.setActiveDtFilter(ActiveDtFilters);
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
