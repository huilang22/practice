/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqContractUnitCrObjectHelper.java
 * Definition File: Catalog/HqContractUnitCr.xml
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



/** Helper class to convert HqContractUnitCrObject JavaBean objects to/from HashMaps.
 */
public class HqContractUnitCrObjectHelper implements ArubaObjectHelper
{
  /** convert HqContractUnitCrObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HqContractUnitCrObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqContractUnitCrObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqContractUnitCrObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqContractUnitCrObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqContractUnitCrObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HqContractUnitCrObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqContractUnitCrObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqContractUnitCrObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqContractUnitCrObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqContractUnitCrObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqContractUnitCrObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HqContractUnitCrObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HqContractUnitCrObjectData the converted object
   */
  public static HqContractUnitCrObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HqContractUnitCrObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HqContractUnitCrObject")
   * @return HqContractUnitCrObjectData the converted object
   */
  public static HqContractUnitCrObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqContractUnitCrObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HqContractUnitCrObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HqContractUnitCrObjectFilter the converted object
   */
  public static HqContractUnitCrObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HqContractUnitCrObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HqContractUnitCrObject")
   * @return HqContractUnitCrObjectFilter the converted object
   */
  public static HqContractUnitCrObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HqContractUnitCrObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HqContractUnitCrObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HqContractUnitCrObjectDataList the converted object
   */
  public static HqContractUnitCrObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HqContractUnitCrObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HqContractUnitCrObjectList")
   * @return HqContractUnitCrObjectDataList the converted object
   */
  public static HqContractUnitCrObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqContractUnitCrObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HqContractUnitCrObjectData[] array = null;
    if (root != null)
    {
      array = new HqContractUnitCrObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HqContractUnitCrObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HqContractUnitCrObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HqContractUnitCrObjectDataList (array, index, total);
  }
  /** convert HqContractUnitCrObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqContractUnitCrObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HqContractUnitCrObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._TotalUnitsSet) record.put ("TotalUnits", in.TotalUnits);
  
    if (in._AvailUnitsSet) record.put ("AvailUnits", in.AvailUnits);
  
    if (in._TotalAmountSet) record.put ("TotalAmount", in.TotalAmount);
  
    if (in._AvailAmountSet) record.put ("AvailAmount", in.AvailAmount);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
      return record;
  }
  /** convert HqContractUnitCrObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqContractUnitCrObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HqContractUnitCrObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.TotalUnits, in.TotalUnitsSort, in.TotalUnitsSortAscending, in.TotalUnitsFetch);
      if (map != null) record.put ("TotalUnits", map);
      map = DataHelper.filterToMap (in.AvailUnits, in.AvailUnitsSort, in.AvailUnitsSortAscending, in.AvailUnitsFetch);
      if (map != null) record.put ("AvailUnits", map);
      map = DataHelper.filterToMap (in.TotalAmount, in.TotalAmountSort, in.TotalAmountSortAscending, in.TotalAmountFetch);
      if (map != null) record.put ("TotalAmount", map);
      map = DataHelper.filterToMap (in.AvailAmount, in.AvailAmountSort, in.AvailAmountSortAscending, in.AvailAmountFetch);
      if (map != null) record.put ("AvailAmount", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
    return record;
  }
  /** convert Map to HqContractUnitCrObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqContractUnitCrObjectData the converted object
   */
  public static HqContractUnitCrObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqContractUnitCrObjectData out = new HqContractUnitCrObjectData ();

    out.Key = HqContractUnitCrObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("TotalUnits")) != null)
    {
      out.TotalUnits = (Integer) obj;
    }
  
    if ((obj = record.get ("AvailUnits")) != null)
    {
      out.AvailUnits = (Integer) obj;
    }
  
    if ((obj = record.get ("TotalAmount")) != null)
    {
      out.TotalAmount = (Integer) obj;
    }
  
    if ((obj = record.get ("AvailAmount")) != null)
    {
      out.AvailAmount = (Integer) obj;
    }
  
    if ((obj = record.get ("CreateDt")) != null)
    {
      out.CreateDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Integer) obj;
    }
      return out;
  }
  /** convert Map to HqContractUnitCrObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqContractUnitCrObjectFilter the converted object
   */
  public static HqContractUnitCrObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqContractUnitCrObjectFilter out = new HqContractUnitCrObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HqContractUnitCrObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map TotalUnitsMap = (Map)record.get("TotalUnits");
    Boolean TotalUnitsFetch = DataHelper.getFetch(TotalUnitsMap);
    Boolean TotalUnitsSortDir = DataHelper.getSortDirection(TotalUnitsMap);
    Integer TotalUnitsSortOrder = DataHelper.getSortOrder(TotalUnitsMap);
    if (TotalUnitsFetch != null) out.setTotalUnitsFetch(TotalUnitsFetch);
    if (TotalUnitsSortDir != null) out.setTotalUnitsSortDirection(TotalUnitsSortDir);
    if (TotalUnitsSortOrder != null) out.setTotalUnitsSortOrder(TotalUnitsSortOrder);

    Filter[] TotalUnitsFilter = DataHelper.mapToFilterArray(TotalUnitsMap, Integer.class);
    if (TotalUnitsFilter != null) {
      IntegerFilter[] TotalUnitsFilters = new IntegerFilter[TotalUnitsFilter.length];
      for (int i = 0; i < TotalUnitsFilters.length; i++) {
        TotalUnitsFilters[i] = (IntegerFilter)TotalUnitsFilter[i];
      }
      try {
        out.setTotalUnitsFilter(TotalUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AvailUnitsMap = (Map)record.get("AvailUnits");
    Boolean AvailUnitsFetch = DataHelper.getFetch(AvailUnitsMap);
    Boolean AvailUnitsSortDir = DataHelper.getSortDirection(AvailUnitsMap);
    Integer AvailUnitsSortOrder = DataHelper.getSortOrder(AvailUnitsMap);
    if (AvailUnitsFetch != null) out.setAvailUnitsFetch(AvailUnitsFetch);
    if (AvailUnitsSortDir != null) out.setAvailUnitsSortDirection(AvailUnitsSortDir);
    if (AvailUnitsSortOrder != null) out.setAvailUnitsSortOrder(AvailUnitsSortOrder);

    Filter[] AvailUnitsFilter = DataHelper.mapToFilterArray(AvailUnitsMap, Integer.class);
    if (AvailUnitsFilter != null) {
      IntegerFilter[] AvailUnitsFilters = new IntegerFilter[AvailUnitsFilter.length];
      for (int i = 0; i < AvailUnitsFilters.length; i++) {
        AvailUnitsFilters[i] = (IntegerFilter)AvailUnitsFilter[i];
      }
      try {
        out.setAvailUnitsFilter(AvailUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalAmountMap = (Map)record.get("TotalAmount");
    Boolean TotalAmountFetch = DataHelper.getFetch(TotalAmountMap);
    Boolean TotalAmountSortDir = DataHelper.getSortDirection(TotalAmountMap);
    Integer TotalAmountSortOrder = DataHelper.getSortOrder(TotalAmountMap);
    if (TotalAmountFetch != null) out.setTotalAmountFetch(TotalAmountFetch);
    if (TotalAmountSortDir != null) out.setTotalAmountSortDirection(TotalAmountSortDir);
    if (TotalAmountSortOrder != null) out.setTotalAmountSortOrder(TotalAmountSortOrder);

    Filter[] TotalAmountFilter = DataHelper.mapToFilterArray(TotalAmountMap, Integer.class);
    if (TotalAmountFilter != null) {
      IntegerFilter[] TotalAmountFilters = new IntegerFilter[TotalAmountFilter.length];
      for (int i = 0; i < TotalAmountFilters.length; i++) {
        TotalAmountFilters[i] = (IntegerFilter)TotalAmountFilter[i];
      }
      try {
        out.setTotalAmountFilter(TotalAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AvailAmountMap = (Map)record.get("AvailAmount");
    Boolean AvailAmountFetch = DataHelper.getFetch(AvailAmountMap);
    Boolean AvailAmountSortDir = DataHelper.getSortDirection(AvailAmountMap);
    Integer AvailAmountSortOrder = DataHelper.getSortOrder(AvailAmountMap);
    if (AvailAmountFetch != null) out.setAvailAmountFetch(AvailAmountFetch);
    if (AvailAmountSortDir != null) out.setAvailAmountSortDirection(AvailAmountSortDir);
    if (AvailAmountSortOrder != null) out.setAvailAmountSortOrder(AvailAmountSortOrder);

    Filter[] AvailAmountFilter = DataHelper.mapToFilterArray(AvailAmountMap, Integer.class);
    if (AvailAmountFilter != null) {
      IntegerFilter[] AvailAmountFilters = new IntegerFilter[AvailAmountFilter.length];
      for (int i = 0; i < AvailAmountFilters.length; i++) {
        AvailAmountFilters[i] = (IntegerFilter)AvailAmountFilter[i];
      }
      try {
        out.setAvailAmountFilter(AvailAmountFilters);
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
  
    Map NoBillMap = (Map)record.get("NoBill");
    Boolean NoBillFetch = DataHelper.getFetch(NoBillMap);
    Boolean NoBillSortDir = DataHelper.getSortDirection(NoBillMap);
    Integer NoBillSortOrder = DataHelper.getSortOrder(NoBillMap);
    if (NoBillFetch != null) out.setNoBillFetch(NoBillFetch);
    if (NoBillSortDir != null) out.setNoBillSortDirection(NoBillSortDir);
    if (NoBillSortOrder != null) out.setNoBillSortOrder(NoBillSortOrder);

    Filter[] NoBillFilter = DataHelper.mapToFilterArray(NoBillMap, Integer.class);
    if (NoBillFilter != null) {
      IntegerFilter[] NoBillFilters = new IntegerFilter[NoBillFilter.length];
      for (int i = 0; i < NoBillFilters.length; i++) {
        NoBillFilters[i] = (IntegerFilter)NoBillFilter[i];
      }
      try {
        out.setNoBillFilter(NoBillFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
