/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EIHGMObjectHelper.java
 * Definition File: Catalog/ExternalIdHqGroupsMap.xml
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



/** Helper class to convert EIHGMObject JavaBean objects to/from HashMaps.
 */
public class EIHGMObjectHelper implements ArubaObjectHelper
{
  /** convert EIHGMObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (EIHGMObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EIHGMObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EIHGMObject")
   * @return Map     the output Map
   */
  public static Map toMap (EIHGMObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EIHGMObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert EIHGMObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EIHGMObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EIHGMObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EIHGMObject")
   * @return Map     the output Map
   */
  public static Map toMap (EIHGMObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EIHGMObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EIHGMObjectData.
   * @param record the Map containing the data to convert to the object
   * @return EIHGMObjectData the converted object
   */
  public static EIHGMObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EIHGMObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EIHGMObject")
   * @return EIHGMObjectData the converted object
   */
  public static EIHGMObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EIHGMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EIHGMObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return EIHGMObjectFilter the converted object
   */
  public static EIHGMObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EIHGMObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EIHGMObject")
   * @return EIHGMObjectFilter the converted object
   */
  public static EIHGMObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EIHGMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to EIHGMObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return EIHGMObjectDataList the converted object
   */
  public static EIHGMObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to EIHGMObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "EIHGMObjectList")
   * @return EIHGMObjectDataList the converted object
   */
  public static EIHGMObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EIHGMObjectList";
    Object[] root = (Object[]) record.get (rootName);
    EIHGMObjectData[] array = null;
    if (root != null)
    {
      array = new EIHGMObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = EIHGMObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new EIHGMObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new EIHGMObjectDataList (array, index, total);
  }
  /** convert EIHGMObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EIHGMObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", EIHGMObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._GroupIdSet) record.put ("GroupId", in.GroupId);
  
    if (in._GroupIdServSet) record.put ("GroupIdServ", in.GroupIdServ);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._GroupPurposeSet) record.put ("GroupPurpose", in.GroupPurpose);
      return record;
  }
  /** convert EIHGMObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EIHGMObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", EIHGMObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.GroupId, in.GroupIdSort, in.GroupIdSortAscending, in.GroupIdFetch);
      if (map != null) record.put ("GroupId", map);
      map = DataHelper.filterToMap (in.GroupIdServ, in.GroupIdServSort, in.GroupIdServSortAscending, in.GroupIdServFetch);
      if (map != null) record.put ("GroupIdServ", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
      map = DataHelper.filterToMap (in.GroupPurpose, in.GroupPurposeSort, in.GroupPurposeSortAscending, in.GroupPurposeFetch);
      if (map != null) record.put ("GroupPurpose", map);
    return record;
  }
  /** convert Map to EIHGMObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EIHGMObjectData the converted object
   */
  public static EIHGMObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EIHGMObjectData out = new EIHGMObjectData ();

    out.Key = EIHGMObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("GroupId")) != null)
    {
      out.GroupId = (Integer) obj;
    }
  
    if ((obj = record.get ("GroupIdServ")) != null)
    {
      out.GroupIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("GroupPurpose")) != null)
    {
      out.GroupPurpose = (Integer) obj;
    }
      return out;
  }
  /** convert Map to EIHGMObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EIHGMObjectFilter the converted object
   */
  public static EIHGMObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EIHGMObjectFilter out = new EIHGMObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = EIHGMObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map InactiveDateMap = (Map)record.get("InactiveDate");
    Boolean InactiveDateFetch = DataHelper.getFetch(InactiveDateMap);
    Boolean InactiveDateSortDir = DataHelper.getSortDirection(InactiveDateMap);
    Integer InactiveDateSortOrder = DataHelper.getSortOrder(InactiveDateMap);
    if (InactiveDateFetch != null) out.setInactiveDateFetch(InactiveDateFetch);
    if (InactiveDateSortDir != null) out.setInactiveDateSortDirection(InactiveDateSortDir);
    if (InactiveDateSortOrder != null) out.setInactiveDateSortOrder(InactiveDateSortOrder);

    Filter[] InactiveDateFilter = DataHelper.mapToFilterArray(InactiveDateMap, Date.class);
    if (InactiveDateFilter != null) {
      DateFilter[] InactiveDateFilters = new DateFilter[InactiveDateFilter.length];
      for (int i = 0; i < InactiveDateFilters.length; i++) {
        InactiveDateFilters[i] = (DateFilter)InactiveDateFilter[i];
      }
      try {
        out.setInactiveDateFilter(InactiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GroupPurposeMap = (Map)record.get("GroupPurpose");
    Boolean GroupPurposeFetch = DataHelper.getFetch(GroupPurposeMap);
    Boolean GroupPurposeSortDir = DataHelper.getSortDirection(GroupPurposeMap);
    Integer GroupPurposeSortOrder = DataHelper.getSortOrder(GroupPurposeMap);
    if (GroupPurposeFetch != null) out.setGroupPurposeFetch(GroupPurposeFetch);
    if (GroupPurposeSortDir != null) out.setGroupPurposeSortDirection(GroupPurposeSortDir);
    if (GroupPurposeSortOrder != null) out.setGroupPurposeSortOrder(GroupPurposeSortOrder);

    Filter[] GroupPurposeFilter = DataHelper.mapToFilterArray(GroupPurposeMap, Integer.class);
    if (GroupPurposeFilter != null) {
      IntegerFilter[] GroupPurposeFilters = new IntegerFilter[GroupPurposeFilter.length];
      for (int i = 0; i < GroupPurposeFilters.length; i++) {
        GroupPurposeFilters[i] = (IntegerFilter)GroupPurposeFilter[i];
      }
      try {
        out.setGroupPurposeFilter(GroupPurposeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
