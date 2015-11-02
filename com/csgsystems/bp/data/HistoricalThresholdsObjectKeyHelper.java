/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalThresholdsObjectKeyHelper.java
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

/** Helper class for HistoricalThresholdsObject's Key objects. */
public class HistoricalThresholdsObjectKeyHelper implements ArubaObjectHelper
{
  /** convert HistoricalThresholdsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalThresholdsObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalThresholdsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalThresholdsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalThresholdsObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalThresholdsObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert HistoricalThresholdsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalThresholdsObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalThresholdsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalThresholdsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalThresholdsObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalThresholdsObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HistoricalThresholdsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return HistoricalThresholdsObjectKeyData the converted object
   */
  public static HistoricalThresholdsObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HistoricalThresholdsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HistoricalThresholdsObject")
   * @return HistoricalThresholdsObjectKeyData the converted object
   */
  public static HistoricalThresholdsObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalThresholdsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HistoricalThresholdsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return HistoricalThresholdsObjectKeyFilter the converted object
   */
  public static HistoricalThresholdsObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HistoricalThresholdsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HistoricalThresholdsObject")
   * @return HistoricalThresholdsObjectKeyFilter the converted object
   */
  public static HistoricalThresholdsObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalThresholdsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert HistoricalThresholdsObjectKeyData to a Map (not including the root).
  /** convert HistoricalThresholdsObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HistoricalThresholdsObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ThresholdTrackingIdSet) record.put ("ThresholdTrackingId", in.ThresholdTrackingId);
  
    if (in._ThresholdTrackingIdServSet) record.put ("ThresholdTrackingIdServ", in.ThresholdTrackingIdServ);
  
    return record;
  }
  /** convert HistoricalThresholdsObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HistoricalThresholdsObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ThresholdTrackingId, in.ThresholdTrackingIdSort, in.ThresholdTrackingIdSortAscending, in.ThresholdTrackingIdFetch);
      if (map != null) record.put ("ThresholdTrackingId", map);
      map = DataHelper.filterToMap (in.ThresholdTrackingIdServ, in.ThresholdTrackingIdServSort, in.ThresholdTrackingIdServSortAscending, in.ThresholdTrackingIdServFetch);
      if (map != null) record.put ("ThresholdTrackingIdServ", map);
    return record;
  }
  /** convert Map to HistoricalThresholdsObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalThresholdsObjectKeyData the converted object
   */
  public static HistoricalThresholdsObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalThresholdsObjectKeyData out = new HistoricalThresholdsObjectKeyData ();

    if ((obj = record.get ("ThresholdTrackingId")) != null)
    {
      out.ThresholdTrackingId = (Integer) obj;
      out._ThresholdTrackingIdSet = true;
    }
  
    if ((obj = record.get ("ThresholdTrackingIdServ")) != null)
    {
      out.ThresholdTrackingIdServ = (Integer) obj;
      out._ThresholdTrackingIdServSet = true;
    }
  
    return out;
  }
  /** convert Map to HistoricalThresholdsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalThresholdsObjectKeyFilter the converted object
   */
  public static HistoricalThresholdsObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalThresholdsObjectKeyFilter out = new HistoricalThresholdsObjectKeyFilter ();

    Map ThresholdTrackingIdMap = (Map)record.get("ThresholdTrackingId");
    Boolean ThresholdTrackingIdFetch = DataHelper.getFetch(ThresholdTrackingIdMap);
    Boolean ThresholdTrackingIdSortDir = DataHelper.getSortDirection(ThresholdTrackingIdMap);
    Integer ThresholdTrackingIdSortOrder = DataHelper.getSortOrder(ThresholdTrackingIdMap);
    if (ThresholdTrackingIdFetch != null) out.setThresholdTrackingIdFetch(ThresholdTrackingIdFetch);
    if (ThresholdTrackingIdSortDir != null) out.setThresholdTrackingIdSortDirection(ThresholdTrackingIdSortDir);
    if (ThresholdTrackingIdSortOrder != null) out.setThresholdTrackingIdSortOrder(ThresholdTrackingIdSortOrder);

    Filter[] ThresholdTrackingIdFilter = DataHelper.mapToFilterArray(ThresholdTrackingIdMap, Integer.class);
    if (ThresholdTrackingIdFilter != null) {
      IntegerFilter[] ThresholdTrackingIdFilters = new IntegerFilter[ThresholdTrackingIdFilter.length];
      for (int i = 0; i < ThresholdTrackingIdFilters.length; i++) {
        ThresholdTrackingIdFilters[i] = (IntegerFilter)ThresholdTrackingIdFilter[i];
      }
      try {
        out.setThresholdTrackingIdFilter(ThresholdTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ThresholdTrackingIdServMap = (Map)record.get("ThresholdTrackingIdServ");
    Boolean ThresholdTrackingIdServFetch = DataHelper.getFetch(ThresholdTrackingIdServMap);
    Boolean ThresholdTrackingIdServSortDir = DataHelper.getSortDirection(ThresholdTrackingIdServMap);
    Integer ThresholdTrackingIdServSortOrder = DataHelper.getSortOrder(ThresholdTrackingIdServMap);
    if (ThresholdTrackingIdServFetch != null) out.setThresholdTrackingIdServFetch(ThresholdTrackingIdServFetch);
    if (ThresholdTrackingIdServSortDir != null) out.setThresholdTrackingIdServSortDirection(ThresholdTrackingIdServSortDir);
    if (ThresholdTrackingIdServSortOrder != null) out.setThresholdTrackingIdServSortOrder(ThresholdTrackingIdServSortOrder);

    Filter[] ThresholdTrackingIdServFilter = DataHelper.mapToFilterArray(ThresholdTrackingIdServMap, Integer.class);
    if (ThresholdTrackingIdServFilter != null) {
      IntegerFilter[] ThresholdTrackingIdServFilters = new IntegerFilter[ThresholdTrackingIdServFilter.length];
      for (int i = 0; i < ThresholdTrackingIdServFilters.length; i++) {
        ThresholdTrackingIdServFilters[i] = (IntegerFilter)ThresholdTrackingIdServFilter[i];
      }
      try {
        out.setThresholdTrackingIdServFilter(ThresholdTrackingIdServFilters);
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
