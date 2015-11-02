/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentTransObjectKeyHelper.java
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

/** Helper class for PaymentTransObject's Key objects. */
public class PaymentTransObjectKeyHelper implements ArubaObjectHelper
{
  /** convert PaymentTransObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTransObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentTransObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentTransObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTransObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentTransObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentTransObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTransObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentTransObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentTransObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTransObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentTransObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentTransObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentTransObjectKeyData the converted object
   */
  public static PaymentTransObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentTransObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentTransObject")
   * @return PaymentTransObjectKeyData the converted object
   */
  public static PaymentTransObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTransObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentTransObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentTransObjectKeyFilter the converted object
   */
  public static PaymentTransObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentTransObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentTransObject")
   * @return PaymentTransObjectKeyFilter the converted object
   */
  public static PaymentTransObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTransObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert PaymentTransObjectKeyData to a Map (not including the root).
  /** convert PaymentTransObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentTransObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TrackingIdSet) record.put ("TrackingId", in.TrackingId);
  
    if (in._TrackingIdServSet) record.put ("TrackingIdServ", in.TrackingIdServ);
  
    if (in._CounterSet) record.put ("Counter", in.Counter);
  
    return record;
  }
  /** convert PaymentTransObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentTransObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TrackingId, in.TrackingIdSort, in.TrackingIdSortAscending, in.TrackingIdFetch);
      if (map != null) record.put ("TrackingId", map);
      map = DataHelper.filterToMap (in.TrackingIdServ, in.TrackingIdServSort, in.TrackingIdServSortAscending, in.TrackingIdServFetch);
      if (map != null) record.put ("TrackingIdServ", map);
      map = DataHelper.filterToMap (in.Counter, in.CounterSort, in.CounterSortAscending, in.CounterFetch);
      if (map != null) record.put ("Counter", map);
    return record;
  }
  /** convert Map to PaymentTransObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentTransObjectKeyData the converted object
   */
  public static PaymentTransObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentTransObjectKeyData out = new PaymentTransObjectKeyData ();

    if ((obj = record.get ("TrackingId")) != null)
    {
      out.TrackingId = (Integer) obj;
      out._TrackingIdSet = true;
    }
  
    if ((obj = record.get ("TrackingIdServ")) != null)
    {
      out.TrackingIdServ = (Integer) obj;
      out._TrackingIdServSet = true;
    }
  
    if ((obj = record.get ("Counter")) != null)
    {
      out.Counter = (Integer) obj;
      out._CounterSet = true;
    }
  
    return out;
  }
  /** convert Map to PaymentTransObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentTransObjectKeyFilter the converted object
   */
  public static PaymentTransObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentTransObjectKeyFilter out = new PaymentTransObjectKeyFilter ();

    Map TrackingIdMap = (Map)record.get("TrackingId");
    Boolean TrackingIdFetch = DataHelper.getFetch(TrackingIdMap);
    Boolean TrackingIdSortDir = DataHelper.getSortDirection(TrackingIdMap);
    Integer TrackingIdSortOrder = DataHelper.getSortOrder(TrackingIdMap);
    if (TrackingIdFetch != null) out.setTrackingIdFetch(TrackingIdFetch);
    if (TrackingIdSortDir != null) out.setTrackingIdSortDirection(TrackingIdSortDir);
    if (TrackingIdSortOrder != null) out.setTrackingIdSortOrder(TrackingIdSortOrder);

    Filter[] TrackingIdFilter = DataHelper.mapToFilterArray(TrackingIdMap, Integer.class);
    if (TrackingIdFilter != null) {
      IntegerFilter[] TrackingIdFilters = new IntegerFilter[TrackingIdFilter.length];
      for (int i = 0; i < TrackingIdFilters.length; i++) {
        TrackingIdFilters[i] = (IntegerFilter)TrackingIdFilter[i];
      }
      try {
        out.setTrackingIdFilter(TrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TrackingIdServMap = (Map)record.get("TrackingIdServ");
    Boolean TrackingIdServFetch = DataHelper.getFetch(TrackingIdServMap);
    Boolean TrackingIdServSortDir = DataHelper.getSortDirection(TrackingIdServMap);
    Integer TrackingIdServSortOrder = DataHelper.getSortOrder(TrackingIdServMap);
    if (TrackingIdServFetch != null) out.setTrackingIdServFetch(TrackingIdServFetch);
    if (TrackingIdServSortDir != null) out.setTrackingIdServSortDirection(TrackingIdServSortDir);
    if (TrackingIdServSortOrder != null) out.setTrackingIdServSortOrder(TrackingIdServSortOrder);

    Filter[] TrackingIdServFilter = DataHelper.mapToFilterArray(TrackingIdServMap, Integer.class);
    if (TrackingIdServFilter != null) {
      IntegerFilter[] TrackingIdServFilters = new IntegerFilter[TrackingIdServFilter.length];
      for (int i = 0; i < TrackingIdServFilters.length; i++) {
        TrackingIdServFilters[i] = (IntegerFilter)TrackingIdServFilter[i];
      }
      try {
        out.setTrackingIdServFilter(TrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CounterMap = (Map)record.get("Counter");
    Boolean CounterFetch = DataHelper.getFetch(CounterMap);
    Boolean CounterSortDir = DataHelper.getSortDirection(CounterMap);
    Integer CounterSortOrder = DataHelper.getSortOrder(CounterMap);
    if (CounterFetch != null) out.setCounterFetch(CounterFetch);
    if (CounterSortDir != null) out.setCounterSortDirection(CounterSortDir);
    if (CounterSortOrder != null) out.setCounterSortOrder(CounterSortOrder);

    Filter[] CounterFilter = DataHelper.mapToFilterArray(CounterMap, Integer.class);
    if (CounterFilter != null) {
      IntegerFilter[] CounterFilters = new IntegerFilter[CounterFilter.length];
      for (int i = 0; i < CounterFilters.length; i++) {
        CounterFilters[i] = (IntegerFilter)CounterFilter[i];
      }
      try {
        out.setCounterFilter(CounterFilters);
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
