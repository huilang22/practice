/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillCycleObjectHelper.java
 * Definition File: Admin/BillCycle.xml
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



/** Helper class to convert BillCycleObject JavaBean objects to/from HashMaps.
 */
public class BillCycleObjectHelper implements ArubaObjectHelper
{
  /** convert BillCycleObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BillCycleObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillCycleObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillCycleObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillCycleObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillCycleObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BillCycleObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillCycleObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillCycleObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillCycleObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillCycleObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillCycleObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillCycleObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BillCycleObjectData the converted object
   */
  public static BillCycleObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillCycleObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillCycleObject")
   * @return BillCycleObjectData the converted object
   */
  public static BillCycleObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillCycleObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillCycleObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BillCycleObjectFilter the converted object
   */
  public static BillCycleObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillCycleObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillCycleObject")
   * @return BillCycleObjectFilter the converted object
   */
  public static BillCycleObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillCycleObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BillCycleObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BillCycleObjectDataList the converted object
   */
  public static BillCycleObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BillCycleObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BillCycleObjectList")
   * @return BillCycleObjectDataList the converted object
   */
  public static BillCycleObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillCycleObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BillCycleObjectData[] array = null;
    if (root != null)
    {
      array = new BillCycleObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BillCycleObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BillCycleObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BillCycleObjectDataList (array, index, total);
  }
  /** convert BillCycleObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillCycleObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", BillCycleObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BillingFrequencySet) record.put ("BillingFrequency", in.BillingFrequency);
  
    if (in._NextPpddDateSet) record.put ("NextPpddDate", in.NextPpddDate);
  
    if (in._StatementDateSet) record.put ("StatementDate", in.StatementDate);
  
    if (in._CutoffDateSet) record.put ("CutoffDate", in.CutoffDate);
  
    if (in._PrepDelaySet) record.put ("PrepDelay", in.PrepDelay);
  
    if (in._PrepDateSet) record.put ("PrepDate", in.PrepDate);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert BillCycleObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillCycleObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", BillCycleObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BillingFrequency, in.BillingFrequencySort, in.BillingFrequencySortAscending, in.BillingFrequencyFetch);
      if (map != null) record.put ("BillingFrequency", map);
      map = DataHelper.filterToMap (in.NextPpddDate, in.NextPpddDateSort, in.NextPpddDateSortAscending, in.NextPpddDateFetch);
      if (map != null) record.put ("NextPpddDate", map);
      map = DataHelper.filterToMap (in.StatementDate, in.StatementDateSort, in.StatementDateSortAscending, in.StatementDateFetch);
      if (map != null) record.put ("StatementDate", map);
      map = DataHelper.filterToMap (in.CutoffDate, in.CutoffDateSort, in.CutoffDateSortAscending, in.CutoffDateFetch);
      if (map != null) record.put ("CutoffDate", map);
      map = DataHelper.filterToMap (in.PrepDelay, in.PrepDelaySort, in.PrepDelaySortAscending, in.PrepDelayFetch);
      if (map != null) record.put ("PrepDelay", map);
      map = DataHelper.filterToMap (in.PrepDate, in.PrepDateSort, in.PrepDateSortAscending, in.PrepDateFetch);
      if (map != null) record.put ("PrepDate", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to BillCycleObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillCycleObjectData the converted object
   */
  public static BillCycleObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillCycleObjectData out = new BillCycleObjectData ();

    out.Key = BillCycleObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BillingFrequency")) != null)
    {
      out.BillingFrequency = (Integer) obj;
    }
  
    if ((obj = record.get ("NextPpddDate")) != null)
    {
      out.NextPpddDate = (Date) obj;
    }
  
    if ((obj = record.get ("StatementDate")) != null)
    {
      out.StatementDate = (Date) obj;
    }
  
    if ((obj = record.get ("CutoffDate")) != null)
    {
      out.CutoffDate = (Date) obj;
    }
  
    if ((obj = record.get ("PrepDelay")) != null)
    {
      out.PrepDelay = (Integer) obj;
    }
  
    if ((obj = record.get ("PrepDate")) != null)
    {
      out.PrepDate = (Date) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to BillCycleObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillCycleObjectFilter the converted object
   */
  public static BillCycleObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillCycleObjectFilter out = new BillCycleObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = BillCycleObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map NextPpddDateMap = (Map)record.get("NextPpddDate");
    Boolean NextPpddDateFetch = DataHelper.getFetch(NextPpddDateMap);
    Boolean NextPpddDateSortDir = DataHelper.getSortDirection(NextPpddDateMap);
    Integer NextPpddDateSortOrder = DataHelper.getSortOrder(NextPpddDateMap);
    if (NextPpddDateFetch != null) out.setNextPpddDateFetch(NextPpddDateFetch);
    if (NextPpddDateSortDir != null) out.setNextPpddDateSortDirection(NextPpddDateSortDir);
    if (NextPpddDateSortOrder != null) out.setNextPpddDateSortOrder(NextPpddDateSortOrder);

    Filter[] NextPpddDateFilter = DataHelper.mapToFilterArray(NextPpddDateMap, Date.class);
    if (NextPpddDateFilter != null) {
      DateFilter[] NextPpddDateFilters = new DateFilter[NextPpddDateFilter.length];
      for (int i = 0; i < NextPpddDateFilters.length; i++) {
        NextPpddDateFilters[i] = (DateFilter)NextPpddDateFilter[i];
      }
      try {
        out.setNextPpddDateFilter(NextPpddDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatementDateMap = (Map)record.get("StatementDate");
    Boolean StatementDateFetch = DataHelper.getFetch(StatementDateMap);
    Boolean StatementDateSortDir = DataHelper.getSortDirection(StatementDateMap);
    Integer StatementDateSortOrder = DataHelper.getSortOrder(StatementDateMap);
    if (StatementDateFetch != null) out.setStatementDateFetch(StatementDateFetch);
    if (StatementDateSortDir != null) out.setStatementDateSortDirection(StatementDateSortDir);
    if (StatementDateSortOrder != null) out.setStatementDateSortOrder(StatementDateSortOrder);

    Filter[] StatementDateFilter = DataHelper.mapToFilterArray(StatementDateMap, Date.class);
    if (StatementDateFilter != null) {
      DateFilter[] StatementDateFilters = new DateFilter[StatementDateFilter.length];
      for (int i = 0; i < StatementDateFilters.length; i++) {
        StatementDateFilters[i] = (DateFilter)StatementDateFilter[i];
      }
      try {
        out.setStatementDateFilter(StatementDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CutoffDateMap = (Map)record.get("CutoffDate");
    Boolean CutoffDateFetch = DataHelper.getFetch(CutoffDateMap);
    Boolean CutoffDateSortDir = DataHelper.getSortDirection(CutoffDateMap);
    Integer CutoffDateSortOrder = DataHelper.getSortOrder(CutoffDateMap);
    if (CutoffDateFetch != null) out.setCutoffDateFetch(CutoffDateFetch);
    if (CutoffDateSortDir != null) out.setCutoffDateSortDirection(CutoffDateSortDir);
    if (CutoffDateSortOrder != null) out.setCutoffDateSortOrder(CutoffDateSortOrder);

    Filter[] CutoffDateFilter = DataHelper.mapToFilterArray(CutoffDateMap, Date.class);
    if (CutoffDateFilter != null) {
      DateFilter[] CutoffDateFilters = new DateFilter[CutoffDateFilter.length];
      for (int i = 0; i < CutoffDateFilters.length; i++) {
        CutoffDateFilters[i] = (DateFilter)CutoffDateFilter[i];
      }
      try {
        out.setCutoffDateFilter(CutoffDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepDelayMap = (Map)record.get("PrepDelay");
    Boolean PrepDelayFetch = DataHelper.getFetch(PrepDelayMap);
    Boolean PrepDelaySortDir = DataHelper.getSortDirection(PrepDelayMap);
    Integer PrepDelaySortOrder = DataHelper.getSortOrder(PrepDelayMap);
    if (PrepDelayFetch != null) out.setPrepDelayFetch(PrepDelayFetch);
    if (PrepDelaySortDir != null) out.setPrepDelaySortDirection(PrepDelaySortDir);
    if (PrepDelaySortOrder != null) out.setPrepDelaySortOrder(PrepDelaySortOrder);

    Filter[] PrepDelayFilter = DataHelper.mapToFilterArray(PrepDelayMap, Integer.class);
    if (PrepDelayFilter != null) {
      IntegerFilter[] PrepDelayFilters = new IntegerFilter[PrepDelayFilter.length];
      for (int i = 0; i < PrepDelayFilters.length; i++) {
        PrepDelayFilters[i] = (IntegerFilter)PrepDelayFilter[i];
      }
      try {
        out.setPrepDelayFilter(PrepDelayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepDateMap = (Map)record.get("PrepDate");
    Boolean PrepDateFetch = DataHelper.getFetch(PrepDateMap);
    Boolean PrepDateSortDir = DataHelper.getSortDirection(PrepDateMap);
    Integer PrepDateSortOrder = DataHelper.getSortOrder(PrepDateMap);
    if (PrepDateFetch != null) out.setPrepDateFetch(PrepDateFetch);
    if (PrepDateSortDir != null) out.setPrepDateSortDirection(PrepDateSortDir);
    if (PrepDateSortOrder != null) out.setPrepDateSortOrder(PrepDateSortOrder);

    Filter[] PrepDateFilter = DataHelper.mapToFilterArray(PrepDateMap, Date.class);
    if (PrepDateFilter != null) {
      DateFilter[] PrepDateFilters = new DateFilter[PrepDateFilter.length];
      for (int i = 0; i < PrepDateFilters.length; i++) {
        PrepDateFilters[i] = (DateFilter)PrepDateFilter[i];
      }
      try {
        out.setPrepDateFilter(PrepDateFilters);
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
