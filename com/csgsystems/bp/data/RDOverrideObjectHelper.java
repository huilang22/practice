/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RDOverrideObjectHelper.java
 * Definition File: Customer/OverrideDiscountRate.xml
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



/** Helper class to convert RDOverrideObject JavaBean objects to/from HashMaps.
 */
public class RDOverrideObjectHelper implements ArubaObjectHelper
{
  /** convert RDOverrideObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (RDOverrideObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RDOverrideObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RDOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (RDOverrideObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RDOverrideObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert RDOverrideObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RDOverrideObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RDOverrideObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RDOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (RDOverrideObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RDOverrideObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RDOverrideObjectData.
   * @param record the Map containing the data to convert to the object
   * @return RDOverrideObjectData the converted object
   */
  public static RDOverrideObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RDOverrideObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RDOverrideObject")
   * @return RDOverrideObjectData the converted object
   */
  public static RDOverrideObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RDOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RDOverrideObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return RDOverrideObjectFilter the converted object
   */
  public static RDOverrideObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RDOverrideObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RDOverrideObject")
   * @return RDOverrideObjectFilter the converted object
   */
  public static RDOverrideObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RDOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to RDOverrideObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return RDOverrideObjectDataList the converted object
   */
  public static RDOverrideObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to RDOverrideObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "RDOverrideObjectList")
   * @return RDOverrideObjectDataList the converted object
   */
  public static RDOverrideObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RDOverrideObjectList";
    Object[] root = (Object[]) record.get (rootName);
    RDOverrideObjectData[] array = null;
    if (root != null)
    {
      array = new RDOverrideObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = RDOverrideObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new RDOverrideObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new RDOverrideObjectDataList (array, index, total);
  }
  /** convert RDOverrideObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RDOverrideObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", RDOverrideObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ContractTrackingIdSet) record.put ("ContractTrackingId", in.ContractTrackingId);
  
    if (in._ContractTrackingIdServSet) record.put ("ContractTrackingIdServ", in.ContractTrackingIdServ);
  
    if (in._DiscountIdSet) record.put ("DiscountId", in.DiscountId);
  
    if (in._RangeOriginSet) record.put ("RangeOrigin", in.RangeOrigin);
  
    if (in._RangeTerminusSet) record.put ("RangeTerminus", in.RangeTerminus);
  
    if (in._BillingFrequencySet) record.put ("BillingFrequency", in.BillingFrequency);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._DiscountPercentSet) record.put ("DiscountPercent", in.DiscountPercent);
  
    if (in._ImpliedDecimalsSet) record.put ("ImpliedDecimals", in.ImpliedDecimals);
  
    if (in._DiscountAmountSet) record.put ("DiscountAmount", in.DiscountAmount);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._TaskModeSet) record.put ("TaskMode", in.TaskMode);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
      return record;
  }
  /** convert RDOverrideObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RDOverrideObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", RDOverrideObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ContractTrackingId, in.ContractTrackingIdSort, in.ContractTrackingIdSortAscending, in.ContractTrackingIdFetch);
      if (map != null) record.put ("ContractTrackingId", map);
      map = DataHelper.filterToMap (in.ContractTrackingIdServ, in.ContractTrackingIdServSort, in.ContractTrackingIdServSortAscending, in.ContractTrackingIdServFetch);
      if (map != null) record.put ("ContractTrackingIdServ", map);
      map = DataHelper.filterToMap (in.DiscountId, in.DiscountIdSort, in.DiscountIdSortAscending, in.DiscountIdFetch);
      if (map != null) record.put ("DiscountId", map);
      map = DataHelper.filterToMap (in.RangeOrigin, in.RangeOriginSort, in.RangeOriginSortAscending, in.RangeOriginFetch);
      if (map != null) record.put ("RangeOrigin", map);
      map = DataHelper.filterToMap (in.RangeTerminus, in.RangeTerminusSort, in.RangeTerminusSortAscending, in.RangeTerminusFetch);
      if (map != null) record.put ("RangeTerminus", map);
      map = DataHelper.filterToMap (in.BillingFrequency, in.BillingFrequencySort, in.BillingFrequencySortAscending, in.BillingFrequencyFetch);
      if (map != null) record.put ("BillingFrequency", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.DiscountPercent, in.DiscountPercentSort, in.DiscountPercentSortAscending, in.DiscountPercentFetch);
      if (map != null) record.put ("DiscountPercent", map);
      map = DataHelper.filterToMap (in.ImpliedDecimals, in.ImpliedDecimalsSort, in.ImpliedDecimalsSortAscending, in.ImpliedDecimalsFetch);
      if (map != null) record.put ("ImpliedDecimals", map);
      map = DataHelper.filterToMap (in.DiscountAmount, in.DiscountAmountSort, in.DiscountAmountSortAscending, in.DiscountAmountFetch);
      if (map != null) record.put ("DiscountAmount", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.TaskMode, in.TaskModeSort, in.TaskModeSortAscending, in.TaskModeFetch);
      if (map != null) record.put ("TaskMode", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
    return record;
  }
  /** convert Map to RDOverrideObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RDOverrideObjectData the converted object
   */
  public static RDOverrideObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RDOverrideObjectData out = new RDOverrideObjectData ();

    out.Key = RDOverrideObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ContractTrackingId")) != null)
    {
      out.ContractTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractTrackingIdServ")) != null)
    {
      out.ContractTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountId")) != null)
    {
      out.DiscountId = (Integer) obj;
    }
  
    if ((obj = record.get ("RangeOrigin")) != null)
    {
      out.RangeOrigin = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RangeTerminus")) != null)
    {
      out.RangeTerminus = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BillingFrequency")) != null)
    {
      out.BillingFrequency = (Integer) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountPercent")) != null)
    {
      out.DiscountPercent = (Integer) obj;
    }
  
    if ((obj = record.get ("ImpliedDecimals")) != null)
    {
      out.ImpliedDecimals = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountAmount")) != null)
    {
      out.DiscountAmount = (BigInteger) obj;
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
  
    if ((obj = record.get ("TaskMode")) != null)
    {
      out.TaskMode = (Integer) obj;
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
  /** convert Map to RDOverrideObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RDOverrideObjectFilter the converted object
   */
  public static RDOverrideObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RDOverrideObjectFilter out = new RDOverrideObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = RDOverrideObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map DiscountIdMap = (Map)record.get("DiscountId");
    Boolean DiscountIdFetch = DataHelper.getFetch(DiscountIdMap);
    Boolean DiscountIdSortDir = DataHelper.getSortDirection(DiscountIdMap);
    Integer DiscountIdSortOrder = DataHelper.getSortOrder(DiscountIdMap);
    if (DiscountIdFetch != null) out.setDiscountIdFetch(DiscountIdFetch);
    if (DiscountIdSortDir != null) out.setDiscountIdSortDirection(DiscountIdSortDir);
    if (DiscountIdSortOrder != null) out.setDiscountIdSortOrder(DiscountIdSortOrder);

    Filter[] DiscountIdFilter = DataHelper.mapToFilterArray(DiscountIdMap, Integer.class);
    if (DiscountIdFilter != null) {
      IntegerFilter[] DiscountIdFilters = new IntegerFilter[DiscountIdFilter.length];
      for (int i = 0; i < DiscountIdFilters.length; i++) {
        DiscountIdFilters[i] = (IntegerFilter)DiscountIdFilter[i];
      }
      try {
        out.setDiscountIdFilter(DiscountIdFilters);
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
  
    Map DiscountPercentMap = (Map)record.get("DiscountPercent");
    Boolean DiscountPercentFetch = DataHelper.getFetch(DiscountPercentMap);
    Boolean DiscountPercentSortDir = DataHelper.getSortDirection(DiscountPercentMap);
    Integer DiscountPercentSortOrder = DataHelper.getSortOrder(DiscountPercentMap);
    if (DiscountPercentFetch != null) out.setDiscountPercentFetch(DiscountPercentFetch);
    if (DiscountPercentSortDir != null) out.setDiscountPercentSortDirection(DiscountPercentSortDir);
    if (DiscountPercentSortOrder != null) out.setDiscountPercentSortOrder(DiscountPercentSortOrder);

    Filter[] DiscountPercentFilter = DataHelper.mapToFilterArray(DiscountPercentMap, Integer.class);
    if (DiscountPercentFilter != null) {
      IntegerFilter[] DiscountPercentFilters = new IntegerFilter[DiscountPercentFilter.length];
      for (int i = 0; i < DiscountPercentFilters.length; i++) {
        DiscountPercentFilters[i] = (IntegerFilter)DiscountPercentFilter[i];
      }
      try {
        out.setDiscountPercentFilter(DiscountPercentFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ImpliedDecimalsMap = (Map)record.get("ImpliedDecimals");
    Boolean ImpliedDecimalsFetch = DataHelper.getFetch(ImpliedDecimalsMap);
    Boolean ImpliedDecimalsSortDir = DataHelper.getSortDirection(ImpliedDecimalsMap);
    Integer ImpliedDecimalsSortOrder = DataHelper.getSortOrder(ImpliedDecimalsMap);
    if (ImpliedDecimalsFetch != null) out.setImpliedDecimalsFetch(ImpliedDecimalsFetch);
    if (ImpliedDecimalsSortDir != null) out.setImpliedDecimalsSortDirection(ImpliedDecimalsSortDir);
    if (ImpliedDecimalsSortOrder != null) out.setImpliedDecimalsSortOrder(ImpliedDecimalsSortOrder);

    Filter[] ImpliedDecimalsFilter = DataHelper.mapToFilterArray(ImpliedDecimalsMap, Integer.class);
    if (ImpliedDecimalsFilter != null) {
      IntegerFilter[] ImpliedDecimalsFilters = new IntegerFilter[ImpliedDecimalsFilter.length];
      for (int i = 0; i < ImpliedDecimalsFilters.length; i++) {
        ImpliedDecimalsFilters[i] = (IntegerFilter)ImpliedDecimalsFilter[i];
      }
      try {
        out.setImpliedDecimalsFilter(ImpliedDecimalsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiscountAmountMap = (Map)record.get("DiscountAmount");
    Boolean DiscountAmountFetch = DataHelper.getFetch(DiscountAmountMap);
    Boolean DiscountAmountSortDir = DataHelper.getSortDirection(DiscountAmountMap);
    Integer DiscountAmountSortOrder = DataHelper.getSortOrder(DiscountAmountMap);
    if (DiscountAmountFetch != null) out.setDiscountAmountFetch(DiscountAmountFetch);
    if (DiscountAmountSortDir != null) out.setDiscountAmountSortDirection(DiscountAmountSortDir);
    if (DiscountAmountSortOrder != null) out.setDiscountAmountSortOrder(DiscountAmountSortOrder);

    Filter[] DiscountAmountFilter = DataHelper.mapToFilterArray(DiscountAmountMap, BigInteger.class);
    if (DiscountAmountFilter != null) {
      BigIntegerFilter[] DiscountAmountFilters = new BigIntegerFilter[DiscountAmountFilter.length];
      for (int i = 0; i < DiscountAmountFilters.length; i++) {
        DiscountAmountFilters[i] = (BigIntegerFilter)DiscountAmountFilter[i];
      }
      try {
        out.setDiscountAmountFilter(DiscountAmountFilters);
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
  
    Map TaskModeMap = (Map)record.get("TaskMode");
    Boolean TaskModeFetch = DataHelper.getFetch(TaskModeMap);
    Boolean TaskModeSortDir = DataHelper.getSortDirection(TaskModeMap);
    Integer TaskModeSortOrder = DataHelper.getSortOrder(TaskModeMap);
    if (TaskModeFetch != null) out.setTaskModeFetch(TaskModeFetch);
    if (TaskModeSortDir != null) out.setTaskModeSortDirection(TaskModeSortDir);
    if (TaskModeSortOrder != null) out.setTaskModeSortOrder(TaskModeSortOrder);

    Filter[] TaskModeFilter = DataHelper.mapToFilterArray(TaskModeMap, Integer.class);
    if (TaskModeFilter != null) {
      IntegerFilter[] TaskModeFilters = new IntegerFilter[TaskModeFilter.length];
      for (int i = 0; i < TaskModeFilters.length; i++) {
        TaskModeFilters[i] = (IntegerFilter)TaskModeFilter[i];
      }
      try {
        out.setTaskModeFilter(TaskModeFilters);
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
