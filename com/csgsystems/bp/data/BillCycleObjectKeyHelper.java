/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillCycleObjectKeyHelper.java
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

/** Helper class for BillCycleObject's Key objects. */
public class BillCycleObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BillCycleObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillCycleObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillCycleObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillCycleObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillCycleObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillCycleObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BillCycleObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillCycleObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillCycleObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillCycleObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillCycleObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillCycleObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillCycleObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BillCycleObjectKeyData the converted object
   */
  public static BillCycleObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillCycleObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillCycleObject")
   * @return BillCycleObjectKeyData the converted object
   */
  public static BillCycleObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillCycleObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillCycleObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BillCycleObjectKeyFilter the converted object
   */
  public static BillCycleObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillCycleObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillCycleObject")
   * @return BillCycleObjectKeyFilter the converted object
   */
  public static BillCycleObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillCycleObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BillCycleObjectKeyData to a Map (not including the root).
  /** convert BillCycleObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillCycleObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BillPeriodSet) record.put ("BillPeriod", in.BillPeriod);
  
    if (in._PpddDateSet) record.put ("PpddDate", in.PpddDate);
  
    return record;
  }
  /** convert BillCycleObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillCycleObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BillPeriod, in.BillPeriodSort, in.BillPeriodSortAscending, in.BillPeriodFetch, in.BillPeriodCaseInsensitive);
      if (map != null) record.put ("BillPeriod", map);
      map = DataHelper.filterToMap (in.PpddDate, in.PpddDateSort, in.PpddDateSortAscending, in.PpddDateFetch);
      if (map != null) record.put ("PpddDate", map);
    return record;
  }
  /** convert Map to BillCycleObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillCycleObjectKeyData the converted object
   */
  public static BillCycleObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillCycleObjectKeyData out = new BillCycleObjectKeyData ();

    if ((obj = record.get ("BillPeriod")) != null)
    {
      out.BillPeriod = (String) obj;
      out._BillPeriodSet = true;
    }
  
    if ((obj = record.get ("PpddDate")) != null)
    {
      out.PpddDate = (Date) obj;
      out._PpddDateSet = true;
    }
  
    return out;
  }
  /** convert Map to BillCycleObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillCycleObjectKeyFilter the converted object
   */
  public static BillCycleObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillCycleObjectKeyFilter out = new BillCycleObjectKeyFilter ();

    Map BillPeriodMap = (Map)record.get("BillPeriod");
    Boolean BillPeriodFetch = DataHelper.getFetch(BillPeriodMap);
    Boolean BillPeriodSortDir = DataHelper.getSortDirection(BillPeriodMap);
    Integer BillPeriodSortOrder = DataHelper.getSortOrder(BillPeriodMap);
    if (BillPeriodFetch != null) out.setBillPeriodFetch(BillPeriodFetch);
    if (BillPeriodSortDir != null) out.setBillPeriodSortDirection(BillPeriodSortDir);
    if (BillPeriodSortOrder != null) out.setBillPeriodSortOrder(BillPeriodSortOrder);

    Filter[] BillPeriodFilter = DataHelper.mapToFilterArray(BillPeriodMap, String.class);
    if (BillPeriodFilter != null) {
      StringFilter[] BillPeriodFilters = new StringFilter[BillPeriodFilter.length];
      for (int i = 0; i < BillPeriodFilters.length; i++) {
        BillPeriodFilters[i] = (StringFilter)BillPeriodFilter[i];
      }
      try {
        out.setBillPeriodFilter(BillPeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PpddDateMap = (Map)record.get("PpddDate");
    Boolean PpddDateFetch = DataHelper.getFetch(PpddDateMap);
    Boolean PpddDateSortDir = DataHelper.getSortDirection(PpddDateMap);
    Integer PpddDateSortOrder = DataHelper.getSortOrder(PpddDateMap);
    if (PpddDateFetch != null) out.setPpddDateFetch(PpddDateFetch);
    if (PpddDateSortDir != null) out.setPpddDateSortDirection(PpddDateSortDir);
    if (PpddDateSortOrder != null) out.setPpddDateSortOrder(PpddDateSortOrder);

    Filter[] PpddDateFilter = DataHelper.mapToFilterArray(PpddDateMap, Date.class);
    if (PpddDateFilter != null) {
      DateFilter[] PpddDateFilters = new DateFilter[PpddDateFilter.length];
      for (int i = 0; i < PpddDateFilters.length; i++) {
        PpddDateFilters[i] = (DateFilter)PpddDateFilter[i];
      }
      try {
        out.setPpddDateFilter(PpddDateFilters);
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
