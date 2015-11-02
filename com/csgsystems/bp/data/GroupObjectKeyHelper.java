/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupObjectKeyHelper.java
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

/** Helper class for GroupObject's Key objects. */
public class GroupObjectKeyHelper implements ArubaObjectHelper
{
  /** convert GroupObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GroupObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert GroupObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GroupObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return GroupObjectKeyData the converted object
   */
  public static GroupObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GroupObject")
   * @return GroupObjectKeyData the converted object
   */
  public static GroupObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return GroupObjectKeyFilter the converted object
   */
  public static GroupObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GroupObject")
   * @return GroupObjectKeyFilter the converted object
   */
  public static GroupObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert GroupObjectKeyData to a Map (not including the root).
  /** convert GroupObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GroupObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._GroupNoSet) record.put ("GroupNo", in.GroupNo);
  
    return record;
  }
  /** convert GroupObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GroupObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.GroupNo, in.GroupNoSort, in.GroupNoSortAscending, in.GroupNoFetch);
      if (map != null) record.put ("GroupNo", map);
    return record;
  }
  /** convert Map to GroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupObjectKeyData the converted object
   */
  public static GroupObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupObjectKeyData out = new GroupObjectKeyData ();

    if ((obj = record.get ("GroupNo")) != null)
    {
      out.GroupNo = (Integer) obj;
      out._GroupNoSet = true;
    }
  
    return out;
  }
  /** convert Map to GroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupObjectKeyFilter the converted object
   */
  public static GroupObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupObjectKeyFilter out = new GroupObjectKeyFilter ();

    Map GroupNoMap = (Map)record.get("GroupNo");
    Boolean GroupNoFetch = DataHelper.getFetch(GroupNoMap);
    Boolean GroupNoSortDir = DataHelper.getSortDirection(GroupNoMap);
    Integer GroupNoSortOrder = DataHelper.getSortOrder(GroupNoMap);
    if (GroupNoFetch != null) out.setGroupNoFetch(GroupNoFetch);
    if (GroupNoSortDir != null) out.setGroupNoSortDirection(GroupNoSortDir);
    if (GroupNoSortOrder != null) out.setGroupNoSortOrder(GroupNoSortOrder);

    Filter[] GroupNoFilter = DataHelper.mapToFilterArray(GroupNoMap, Integer.class);
    if (GroupNoFilter != null) {
      IntegerFilter[] GroupNoFilters = new IntegerFilter[GroupNoFilter.length];
      for (int i = 0; i < GroupNoFilters.length; i++) {
        GroupNoFilters[i] = (IntegerFilter)GroupNoFilter[i];
      }
      try {
        out.setGroupNoFilter(GroupNoFilters);
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
