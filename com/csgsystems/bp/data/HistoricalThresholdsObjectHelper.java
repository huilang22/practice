/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalThresholdsObjectHelper.java
 * Definition File: Customer/HistoricalThresholds.xml
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



/** Helper class to convert HistoricalThresholdsObject JavaBean objects to/from HashMaps.
 */
public class HistoricalThresholdsObjectHelper implements ArubaObjectHelper
{
  /** convert HistoricalThresholdsObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HistoricalThresholdsObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalThresholdsObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalThresholdsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalThresholdsObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalThresholdsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HistoricalThresholdsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalThresholdsObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalThresholdsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalThresholdsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalThresholdsObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalThresholdsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HistoricalThresholdsObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HistoricalThresholdsObjectData the converted object
   */
  public static HistoricalThresholdsObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HistoricalThresholdsObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HistoricalThresholdsObject")
   * @return HistoricalThresholdsObjectData the converted object
   */
  public static HistoricalThresholdsObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalThresholdsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HistoricalThresholdsObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HistoricalThresholdsObjectFilter the converted object
   */
  public static HistoricalThresholdsObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HistoricalThresholdsObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HistoricalThresholdsObject")
   * @return HistoricalThresholdsObjectFilter the converted object
   */
  public static HistoricalThresholdsObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalThresholdsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HistoricalThresholdsObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HistoricalThresholdsObjectDataList the converted object
   */
  public static HistoricalThresholdsObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HistoricalThresholdsObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HistoricalThresholdsObjectList")
   * @return HistoricalThresholdsObjectDataList the converted object
   */
  public static HistoricalThresholdsObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalThresholdsObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HistoricalThresholdsObjectData[] array = null;
    if (root != null)
    {
      array = new HistoricalThresholdsObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HistoricalThresholdsObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HistoricalThresholdsObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HistoricalThresholdsObjectDataList (array, index, total);
  }
  /** convert HistoricalThresholdsObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HistoricalThresholdsObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HistoricalThresholdsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ContractTrackingIdSet) record.put ("ContractTrackingId", in.ContractTrackingId);
  
    if (in._ContractTrackingIdServSet) record.put ("ContractTrackingIdServ", in.ContractTrackingIdServ);
  
    if (in._DiscountIdSet) record.put ("DiscountId", in.DiscountId);
  
    if (in._TaskModeSet) record.put ("TaskMode", in.TaskMode);
  
    if (in._DiscountQuantumSet) record.put ("DiscountQuantum", in.DiscountQuantum);
  
    if (in._QuantaSet) record.put ("Quanta", in.Quanta);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
      return record;
  }
  /** convert HistoricalThresholdsObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HistoricalThresholdsObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HistoricalThresholdsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ContractTrackingId, in.ContractTrackingIdSort, in.ContractTrackingIdSortAscending, in.ContractTrackingIdFetch);
      if (map != null) record.put ("ContractTrackingId", map);
      map = DataHelper.filterToMap (in.ContractTrackingIdServ, in.ContractTrackingIdServSort, in.ContractTrackingIdServSortAscending, in.ContractTrackingIdServFetch);
      if (map != null) record.put ("ContractTrackingIdServ", map);
      map = DataHelper.filterToMap (in.DiscountId, in.DiscountIdSort, in.DiscountIdSortAscending, in.DiscountIdFetch);
      if (map != null) record.put ("DiscountId", map);
      map = DataHelper.filterToMap (in.TaskMode, in.TaskModeSort, in.TaskModeSortAscending, in.TaskModeFetch);
      if (map != null) record.put ("TaskMode", map);
      map = DataHelper.filterToMap (in.DiscountQuantum, in.DiscountQuantumSort, in.DiscountQuantumSortAscending, in.DiscountQuantumFetch);
      if (map != null) record.put ("DiscountQuantum", map);
      map = DataHelper.filterToMap (in.Quanta, in.QuantaSort, in.QuantaSortAscending, in.QuantaFetch);
      if (map != null) record.put ("Quanta", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
    return record;
  }
  /** convert Map to HistoricalThresholdsObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalThresholdsObjectData the converted object
   */
  public static HistoricalThresholdsObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalThresholdsObjectData out = new HistoricalThresholdsObjectData ();

    out.Key = HistoricalThresholdsObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("TaskMode")) != null)
    {
      out.TaskMode = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountQuantum")) != null)
    {
      out.DiscountQuantum = (Integer) obj;
    }
  
    if ((obj = record.get ("Quanta")) != null)
    {
      out.Quanta = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
      return out;
  }
  /** convert Map to HistoricalThresholdsObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalThresholdsObjectFilter the converted object
   */
  public static HistoricalThresholdsObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalThresholdsObjectFilter out = new HistoricalThresholdsObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HistoricalThresholdsObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map DiscountQuantumMap = (Map)record.get("DiscountQuantum");
    Boolean DiscountQuantumFetch = DataHelper.getFetch(DiscountQuantumMap);
    Boolean DiscountQuantumSortDir = DataHelper.getSortDirection(DiscountQuantumMap);
    Integer DiscountQuantumSortOrder = DataHelper.getSortOrder(DiscountQuantumMap);
    if (DiscountQuantumFetch != null) out.setDiscountQuantumFetch(DiscountQuantumFetch);
    if (DiscountQuantumSortDir != null) out.setDiscountQuantumSortDirection(DiscountQuantumSortDir);
    if (DiscountQuantumSortOrder != null) out.setDiscountQuantumSortOrder(DiscountQuantumSortOrder);

    Filter[] DiscountQuantumFilter = DataHelper.mapToFilterArray(DiscountQuantumMap, Integer.class);
    if (DiscountQuantumFilter != null) {
      IntegerFilter[] DiscountQuantumFilters = new IntegerFilter[DiscountQuantumFilter.length];
      for (int i = 0; i < DiscountQuantumFilters.length; i++) {
        DiscountQuantumFilters[i] = (IntegerFilter)DiscountQuantumFilter[i];
      }
      try {
        out.setDiscountQuantumFilter(DiscountQuantumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map QuantaMap = (Map)record.get("Quanta");
    Boolean QuantaFetch = DataHelper.getFetch(QuantaMap);
    Boolean QuantaSortDir = DataHelper.getSortDirection(QuantaMap);
    Integer QuantaSortOrder = DataHelper.getSortOrder(QuantaMap);
    if (QuantaFetch != null) out.setQuantaFetch(QuantaFetch);
    if (QuantaSortDir != null) out.setQuantaSortDirection(QuantaSortDir);
    if (QuantaSortOrder != null) out.setQuantaSortOrder(QuantaSortOrder);

    Filter[] QuantaFilter = DataHelper.mapToFilterArray(QuantaMap, BigInteger.class);
    if (QuantaFilter != null) {
      BigIntegerFilter[] QuantaFilters = new BigIntegerFilter[QuantaFilter.length];
      for (int i = 0; i < QuantaFilters.length; i++) {
        QuantaFilters[i] = (BigIntegerFilter)QuantaFilter[i];
      }
      try {
        out.setQuantaFilter(QuantaFilters);
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
  
    return out;
  }
}
