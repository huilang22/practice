/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupCorridorObjectKeyHelper.java
 * Definition File: Catalog/.xml
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

/** Helper class for HqGroupCorridorObject's Key objects. */
public class HqGroupCorridorObjectKeyHelper implements ArubaObjectHelper
{
  /** convert HqGroupCorridorObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupCorridorObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupCorridorObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupCorridorObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupCorridorObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupCorridorObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert HqGroupCorridorObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupCorridorObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupCorridorObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupCorridorObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupCorridorObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupCorridorObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HqGroupCorridorObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return HqGroupCorridorObjectKeyData the converted object
   */
  public static HqGroupCorridorObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HqGroupCorridorObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HqGroupCorridorObject")
   * @return HqGroupCorridorObjectKeyData the converted object
   */
  public static HqGroupCorridorObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupCorridorObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HqGroupCorridorObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return HqGroupCorridorObjectKeyFilter the converted object
   */
  public static HqGroupCorridorObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HqGroupCorridorObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HqGroupCorridorObject")
   * @return HqGroupCorridorObjectKeyFilter the converted object
   */
  public static HqGroupCorridorObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupCorridorObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert HqGroupCorridorObjectKeyData to a Map (not including the root).
  /** convert HqGroupCorridorObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HqGroupCorridorObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._GroupIdSet) record.put ("GroupId", in.GroupId);
  
    if (in._GroupIdServSet) record.put ("GroupIdServ", in.GroupIdServ);
  
    if (in._TrackingIdSet) record.put ("TrackingId", in.TrackingId);
  
    if (in._TrackingIdServSet) record.put ("TrackingIdServ", in.TrackingIdServ);
  
    return record;
  }
  /** convert HqGroupCorridorObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HqGroupCorridorObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.GroupId, in.GroupIdSort, in.GroupIdSortAscending, in.GroupIdFetch);
      if (map != null) record.put ("GroupId", map);
      map = DataHelper.filterToMap (in.GroupIdServ, in.GroupIdServSort, in.GroupIdServSortAscending, in.GroupIdServFetch);
      if (map != null) record.put ("GroupIdServ", map);
      map = DataHelper.filterToMap (in.TrackingId, in.TrackingIdSort, in.TrackingIdSortAscending, in.TrackingIdFetch);
      if (map != null) record.put ("TrackingId", map);
      map = DataHelper.filterToMap (in.TrackingIdServ, in.TrackingIdServSort, in.TrackingIdServSortAscending, in.TrackingIdServFetch);
      if (map != null) record.put ("TrackingIdServ", map);
    return record;
  }
  /** convert Map to HqGroupCorridorObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupCorridorObjectKeyData the converted object
   */
  public static HqGroupCorridorObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupCorridorObjectKeyData out = new HqGroupCorridorObjectKeyData ();

    if ((obj = record.get ("GroupId")) != null)
    {
      out.GroupId = (Integer) obj;
      out._GroupIdSet = true;
    }
  
    if ((obj = record.get ("GroupIdServ")) != null)
    {
      out.GroupIdServ = (Integer) obj;
      out._GroupIdServSet = true;
    }
  
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
  /** convert Map to HqGroupCorridorObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupCorridorObjectKeyFilter the converted object
   */
  public static HqGroupCorridorObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupCorridorObjectKeyFilter out = new HqGroupCorridorObjectKeyFilter ();

    Map GroupIdMap = (Map)record.get("GroupId");
    Boolean GroupIdFetch = DataHelper.getFetch(GroupIdMap);
    Boolean GroupIdSortDir = DataHelper.getSortDirection(GroupIdMap);
    Integer GroupIdSortOrder = DataHelper.getSortOrder(GroupIdMap);
    if (GroupIdFetch != null) out.setGroupIdFetch(GroupIdFetch);
    if (GroupIdSortDir != null) out.setGroupIdSortDirection(GroupIdSortDir);
    if (GroupIdSortOrder != null) out.setGroupIdSortOrder(GroupIdSortOrder);

    Filter[] GroupIdFilter = DataHelper.mapToFilterArray(GroupIdMap, Integer.class);
    if (GroupIdFilter != null) {
      IntegerFilter[] GroupIdFilters = new IntegerFilter[GroupIdFilter.length];
      for (int i = 0; i < GroupIdFilters.length; i++) {
        GroupIdFilters[i] = (IntegerFilter)GroupIdFilter[i];
      }
      try {
        out.setGroupIdFilter(GroupIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GroupIdServMap = (Map)record.get("GroupIdServ");
    Boolean GroupIdServFetch = DataHelper.getFetch(GroupIdServMap);
    Boolean GroupIdServSortDir = DataHelper.getSortDirection(GroupIdServMap);
    Integer GroupIdServSortOrder = DataHelper.getSortOrder(GroupIdServMap);
    if (GroupIdServFetch != null) out.setGroupIdServFetch(GroupIdServFetch);
    if (GroupIdServSortDir != null) out.setGroupIdServSortDirection(GroupIdServSortDir);
    if (GroupIdServSortOrder != null) out.setGroupIdServSortOrder(GroupIdServSortOrder);

    Filter[] GroupIdServFilter = DataHelper.mapToFilterArray(GroupIdServMap, Integer.class);
    if (GroupIdServFilter != null) {
      IntegerFilter[] GroupIdServFilters = new IntegerFilter[GroupIdServFilter.length];
      for (int i = 0; i < GroupIdServFilters.length; i++) {
        GroupIdServFilters[i] = (IntegerFilter)GroupIdServFilter[i];
      }
      try {
        out.setGroupIdServFilter(GroupIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
