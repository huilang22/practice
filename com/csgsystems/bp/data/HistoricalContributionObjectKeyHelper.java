/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalContributionObjectKeyHelper.java
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

/** Helper class for HistoricalContributionObject's Key objects. */
public class HistoricalContributionObjectKeyHelper implements ArubaObjectHelper
{
  /** convert HistoricalContributionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalContributionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalContributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalContributionObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert HistoricalContributionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalContributionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalContributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalContributionObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HistoricalContributionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return HistoricalContributionObjectKeyData the converted object
   */
  public static HistoricalContributionObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HistoricalContributionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HistoricalContributionObject")
   * @return HistoricalContributionObjectKeyData the converted object
   */
  public static HistoricalContributionObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HistoricalContributionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return HistoricalContributionObjectKeyFilter the converted object
   */
  public static HistoricalContributionObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HistoricalContributionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HistoricalContributionObject")
   * @return HistoricalContributionObjectKeyFilter the converted object
   */
  public static HistoricalContributionObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert HistoricalContributionObjectKeyData to a Map (not including the root).
  /** convert HistoricalContributionObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HistoricalContributionObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccumulationTrackingIdSet) record.put ("AccumulationTrackingId", in.AccumulationTrackingId);
  
    if (in._AccumulationTrackingIdServSet) record.put ("AccumulationTrackingIdServ", in.AccumulationTrackingIdServ);
  
    return record;
  }
  /** convert HistoricalContributionObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HistoricalContributionObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccumulationTrackingId, in.AccumulationTrackingIdSort, in.AccumulationTrackingIdSortAscending, in.AccumulationTrackingIdFetch);
      if (map != null) record.put ("AccumulationTrackingId", map);
      map = DataHelper.filterToMap (in.AccumulationTrackingIdServ, in.AccumulationTrackingIdServSort, in.AccumulationTrackingIdServSortAscending, in.AccumulationTrackingIdServFetch);
      if (map != null) record.put ("AccumulationTrackingIdServ", map);
    return record;
  }
  /** convert Map to HistoricalContributionObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalContributionObjectKeyData the converted object
   */
  public static HistoricalContributionObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalContributionObjectKeyData out = new HistoricalContributionObjectKeyData ();

    if ((obj = record.get ("AccumulationTrackingId")) != null)
    {
      out.AccumulationTrackingId = (Integer) obj;
      out._AccumulationTrackingIdSet = true;
    }
  
    if ((obj = record.get ("AccumulationTrackingIdServ")) != null)
    {
      out.AccumulationTrackingIdServ = (Integer) obj;
      out._AccumulationTrackingIdServSet = true;
    }
  
    return out;
  }
  /** convert Map to HistoricalContributionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalContributionObjectKeyFilter the converted object
   */
  public static HistoricalContributionObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalContributionObjectKeyFilter out = new HistoricalContributionObjectKeyFilter ();

    Map AccumulationTrackingIdMap = (Map)record.get("AccumulationTrackingId");
    Boolean AccumulationTrackingIdFetch = DataHelper.getFetch(AccumulationTrackingIdMap);
    Boolean AccumulationTrackingIdSortDir = DataHelper.getSortDirection(AccumulationTrackingIdMap);
    Integer AccumulationTrackingIdSortOrder = DataHelper.getSortOrder(AccumulationTrackingIdMap);
    if (AccumulationTrackingIdFetch != null) out.setAccumulationTrackingIdFetch(AccumulationTrackingIdFetch);
    if (AccumulationTrackingIdSortDir != null) out.setAccumulationTrackingIdSortDirection(AccumulationTrackingIdSortDir);
    if (AccumulationTrackingIdSortOrder != null) out.setAccumulationTrackingIdSortOrder(AccumulationTrackingIdSortOrder);

    Filter[] AccumulationTrackingIdFilter = DataHelper.mapToFilterArray(AccumulationTrackingIdMap, Integer.class);
    if (AccumulationTrackingIdFilter != null) {
      IntegerFilter[] AccumulationTrackingIdFilters = new IntegerFilter[AccumulationTrackingIdFilter.length];
      for (int i = 0; i < AccumulationTrackingIdFilters.length; i++) {
        AccumulationTrackingIdFilters[i] = (IntegerFilter)AccumulationTrackingIdFilter[i];
      }
      try {
        out.setAccumulationTrackingIdFilter(AccumulationTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccumulationTrackingIdServMap = (Map)record.get("AccumulationTrackingIdServ");
    Boolean AccumulationTrackingIdServFetch = DataHelper.getFetch(AccumulationTrackingIdServMap);
    Boolean AccumulationTrackingIdServSortDir = DataHelper.getSortDirection(AccumulationTrackingIdServMap);
    Integer AccumulationTrackingIdServSortOrder = DataHelper.getSortOrder(AccumulationTrackingIdServMap);
    if (AccumulationTrackingIdServFetch != null) out.setAccumulationTrackingIdServFetch(AccumulationTrackingIdServFetch);
    if (AccumulationTrackingIdServSortDir != null) out.setAccumulationTrackingIdServSortDirection(AccumulationTrackingIdServSortDir);
    if (AccumulationTrackingIdServSortOrder != null) out.setAccumulationTrackingIdServSortOrder(AccumulationTrackingIdServSortOrder);

    Filter[] AccumulationTrackingIdServFilter = DataHelper.mapToFilterArray(AccumulationTrackingIdServMap, Integer.class);
    if (AccumulationTrackingIdServFilter != null) {
      IntegerFilter[] AccumulationTrackingIdServFilters = new IntegerFilter[AccumulationTrackingIdServFilter.length];
      for (int i = 0; i < AccumulationTrackingIdServFilters.length; i++) {
        AccumulationTrackingIdServFilters[i] = (IntegerFilter)AccumulationTrackingIdServFilter[i];
      }
      try {
        out.setAccumulationTrackingIdServFilter(AccumulationTrackingIdServFilters);
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
