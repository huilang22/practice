/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupLocateObjectKeyHelper.java
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

/** Helper class for GroupLocateObject's Key objects. */
public class GroupLocateObjectKeyHelper implements ArubaObjectHelper
{
  /** convert GroupLocateObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GroupLocateObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupLocateObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupLocateObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupLocateObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert GroupLocateObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GroupLocateObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupLocateObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupLocateObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupLocateObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GroupLocateObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return GroupLocateObjectKeyData the converted object
   */
  public static GroupLocateObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GroupLocateObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GroupLocateObject")
   * @return GroupLocateObjectKeyData the converted object
   */
  public static GroupLocateObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GroupLocateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return GroupLocateObjectKeyFilter the converted object
   */
  public static GroupLocateObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GroupLocateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GroupLocateObject")
   * @return GroupLocateObjectKeyFilter the converted object
   */
  public static GroupLocateObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert GroupLocateObjectKeyData to a Map (not including the root).
  /** convert GroupLocateObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GroupLocateObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._GroupExternalIdSet) record.put ("GroupExternalId", in.GroupExternalId);
  
    if (in._GroupExternalIdTypeSet) record.put ("GroupExternalIdType", in.GroupExternalIdType);
  
    return record;
  }
  /** convert GroupLocateObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GroupLocateObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.GroupExternalId, in.GroupExternalIdSort, in.GroupExternalIdSortAscending, in.GroupExternalIdFetch, in.GroupExternalIdCaseInsensitive);
      if (map != null) record.put ("GroupExternalId", map);
      map = DataHelper.filterToMap (in.GroupExternalIdType, in.GroupExternalIdTypeSort, in.GroupExternalIdTypeSortAscending, in.GroupExternalIdTypeFetch);
      if (map != null) record.put ("GroupExternalIdType", map);
    return record;
  }
  /** convert Map to GroupLocateObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupLocateObjectKeyData the converted object
   */
  public static GroupLocateObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupLocateObjectKeyData out = new GroupLocateObjectKeyData ();

    if ((obj = record.get ("GroupExternalId")) != null)
    {
      out.GroupExternalId = (String) obj;
      out._GroupExternalIdSet = true;
    }
  
    if ((obj = record.get ("GroupExternalIdType")) != null)
    {
      out.GroupExternalIdType = (Integer) obj;
      out._GroupExternalIdTypeSet = true;
    }
  
    return out;
  }
  /** convert Map to GroupLocateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupLocateObjectKeyFilter the converted object
   */
  public static GroupLocateObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupLocateObjectKeyFilter out = new GroupLocateObjectKeyFilter ();

    Map GroupExternalIdMap = (Map)record.get("GroupExternalId");
    Boolean GroupExternalIdFetch = DataHelper.getFetch(GroupExternalIdMap);
    Boolean GroupExternalIdSortDir = DataHelper.getSortDirection(GroupExternalIdMap);
    Integer GroupExternalIdSortOrder = DataHelper.getSortOrder(GroupExternalIdMap);
    if (GroupExternalIdFetch != null) out.setGroupExternalIdFetch(GroupExternalIdFetch);
    if (GroupExternalIdSortDir != null) out.setGroupExternalIdSortDirection(GroupExternalIdSortDir);
    if (GroupExternalIdSortOrder != null) out.setGroupExternalIdSortOrder(GroupExternalIdSortOrder);

    Filter[] GroupExternalIdFilter = DataHelper.mapToFilterArray(GroupExternalIdMap, String.class);
    if (GroupExternalIdFilter != null) {
      StringFilter[] GroupExternalIdFilters = new StringFilter[GroupExternalIdFilter.length];
      for (int i = 0; i < GroupExternalIdFilters.length; i++) {
        GroupExternalIdFilters[i] = (StringFilter)GroupExternalIdFilter[i];
      }
      try {
        out.setGroupExternalIdFilter(GroupExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GroupExternalIdTypeMap = (Map)record.get("GroupExternalIdType");
    Boolean GroupExternalIdTypeFetch = DataHelper.getFetch(GroupExternalIdTypeMap);
    Boolean GroupExternalIdTypeSortDir = DataHelper.getSortDirection(GroupExternalIdTypeMap);
    Integer GroupExternalIdTypeSortOrder = DataHelper.getSortOrder(GroupExternalIdTypeMap);
    if (GroupExternalIdTypeFetch != null) out.setGroupExternalIdTypeFetch(GroupExternalIdTypeFetch);
    if (GroupExternalIdTypeSortDir != null) out.setGroupExternalIdTypeSortDirection(GroupExternalIdTypeSortDir);
    if (GroupExternalIdTypeSortOrder != null) out.setGroupExternalIdTypeSortOrder(GroupExternalIdTypeSortOrder);

    Filter[] GroupExternalIdTypeFilter = DataHelper.mapToFilterArray(GroupExternalIdTypeMap, Integer.class);
    if (GroupExternalIdTypeFilter != null) {
      IntegerFilter[] GroupExternalIdTypeFilters = new IntegerFilter[GroupExternalIdTypeFilter.length];
      for (int i = 0; i < GroupExternalIdTypeFilters.length; i++) {
        GroupExternalIdTypeFilters[i] = (IntegerFilter)GroupExternalIdTypeFilter[i];
      }
      try {
        out.setGroupExternalIdTypeFilter(GroupExternalIdTypeFilters);
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
