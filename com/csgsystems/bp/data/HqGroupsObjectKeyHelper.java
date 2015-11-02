/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupsObjectKeyHelper.java
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

/** Helper class for HqGroupsObject's Key objects. */
public class HqGroupsObjectKeyHelper implements ArubaObjectHelper
{
  /** convert HqGroupsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupsObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupsObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupsObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert HqGroupsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupsObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupsObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupsObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HqGroupsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return HqGroupsObjectKeyData the converted object
   */
  public static HqGroupsObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HqGroupsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HqGroupsObject")
   * @return HqGroupsObjectKeyData the converted object
   */
  public static HqGroupsObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HqGroupsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return HqGroupsObjectKeyFilter the converted object
   */
  public static HqGroupsObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HqGroupsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HqGroupsObject")
   * @return HqGroupsObjectKeyFilter the converted object
   */
  public static HqGroupsObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert HqGroupsObjectKeyData to a Map (not including the root).
  /** convert HqGroupsObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HqGroupsObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._GroupIdSet) record.put ("GroupId", in.GroupId);
  
    if (in._GroupIdServSet) record.put ("GroupIdServ", in.GroupIdServ);
  
    return record;
  }
  /** convert HqGroupsObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HqGroupsObjectKeyFilter in, Map record)
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
    return record;
  }
  /** convert Map to HqGroupsObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupsObjectKeyData the converted object
   */
  public static HqGroupsObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupsObjectKeyData out = new HqGroupsObjectKeyData ();

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
  
    return out;
  }
  /** convert Map to HqGroupsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupsObjectKeyFilter the converted object
   */
  public static HqGroupsObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupsObjectKeyFilter out = new HqGroupsObjectKeyFilter ();

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
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
