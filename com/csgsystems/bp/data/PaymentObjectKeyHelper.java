/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentObjectKeyHelper.java
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

/** Helper class for PaymentObject's Key objects. */
public class PaymentObjectKeyHelper implements ArubaObjectHelper
{
  /** convert PaymentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentObjectKeyData the converted object
   */
  public static PaymentObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentObject")
   * @return PaymentObjectKeyData the converted object
   */
  public static PaymentObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentObjectKeyFilter the converted object
   */
  public static PaymentObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentObject")
   * @return PaymentObjectKeyFilter the converted object
   */
  public static PaymentObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert PaymentObjectKeyData to a Map (not including the root).
  /** convert PaymentObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TrackingIdSet) record.put ("TrackingId", in.TrackingId);
  
    if (in._TrackingIdServSet) record.put ("TrackingIdServ", in.TrackingIdServ);
  
    return record;
  }
  /** convert PaymentObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentObjectKeyFilter in, Map record)
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
    return record;
  }
  /** convert Map to PaymentObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentObjectKeyData the converted object
   */
  public static PaymentObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentObjectKeyData out = new PaymentObjectKeyData ();

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
  
    return out;
  }
  /** convert Map to PaymentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentObjectKeyFilter the converted object
   */
  public static PaymentObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentObjectKeyFilter out = new PaymentObjectKeyFilter ();

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
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
