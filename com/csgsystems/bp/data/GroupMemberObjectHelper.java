/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupMemberObjectHelper.java
 * Definition File: Customer/GroupMember.xml
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



/** Helper class to convert GroupMemberObject JavaBean objects to/from HashMaps.
 */
public class GroupMemberObjectHelper implements ArubaObjectHelper
{
  /** convert GroupMemberObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (GroupMemberObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupMemberObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupMemberObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupMemberObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupMemberObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert GroupMemberObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GroupMemberObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupMemberObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupMemberObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupMemberObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupMemberObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GroupMemberObjectData.
   * @param record the Map containing the data to convert to the object
   * @return GroupMemberObjectData the converted object
   */
  public static GroupMemberObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GroupMemberObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GroupMemberObject")
   * @return GroupMemberObjectData the converted object
   */
  public static GroupMemberObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupMemberObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GroupMemberObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return GroupMemberObjectFilter the converted object
   */
  public static GroupMemberObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GroupMemberObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GroupMemberObject")
   * @return GroupMemberObjectFilter the converted object
   */
  public static GroupMemberObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupMemberObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to GroupMemberObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return GroupMemberObjectDataList the converted object
   */
  public static GroupMemberObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to GroupMemberObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "GroupMemberObjectList")
   * @return GroupMemberObjectDataList the converted object
   */
  public static GroupMemberObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupMemberObjectList";
    Object[] root = (Object[]) record.get (rootName);
    GroupMemberObjectData[] array = null;
    if (root != null)
    {
      array = new GroupMemberObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = GroupMemberObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new GroupMemberObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new GroupMemberObjectDataList (array, index, total);
  }
  /** convert GroupMemberObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GroupMemberObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", GroupMemberObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._GroupExternalIdSet) record.put ("GroupExternalId", in.GroupExternalId);
  
    if (in._GroupExternalIdTypeSet) record.put ("GroupExternalIdType", in.GroupExternalIdType);
  
    if (in._ServiceExternalIdSet) record.put ("ServiceExternalId", in.ServiceExternalId);
  
    if (in._ServiceExternalIdTypeSet) record.put ("ServiceExternalIdType", in.ServiceExternalIdType);
  
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._IsDesignatedSet) record.put ("IsDesignated", in.IsDesignated);
      return record;
  }
  /** convert GroupMemberObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GroupMemberObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", GroupMemberObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.GroupExternalId, in.GroupExternalIdSort, in.GroupExternalIdSortAscending, in.GroupExternalIdFetch, in.GroupExternalIdCaseInsensitive);
      if (map != null) record.put ("GroupExternalId", map);
      map = DataHelper.filterToMap (in.GroupExternalIdType, in.GroupExternalIdTypeSort, in.GroupExternalIdTypeSortAscending, in.GroupExternalIdTypeFetch);
      if (map != null) record.put ("GroupExternalIdType", map);
      map = DataHelper.filterToMap (in.ServiceExternalId, in.ServiceExternalIdSort, in.ServiceExternalIdSortAscending, in.ServiceExternalIdFetch, in.ServiceExternalIdCaseInsensitive);
      if (map != null) record.put ("ServiceExternalId", map);
      map = DataHelper.filterToMap (in.ServiceExternalIdType, in.ServiceExternalIdTypeSort, in.ServiceExternalIdTypeSortAscending, in.ServiceExternalIdTypeFetch);
      if (map != null) record.put ("ServiceExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.IsDesignated, in.IsDesignatedSort, in.IsDesignatedSortAscending, in.IsDesignatedFetch);
      if (map != null) record.put ("IsDesignated", map);
    return record;
  }
  /** convert Map to GroupMemberObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupMemberObjectData the converted object
   */
  public static GroupMemberObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupMemberObjectData out = new GroupMemberObjectData ();

    out.Key = GroupMemberObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("GroupExternalId")) != null)
    {
      out.GroupExternalId = (String) obj;
    }
  
    if ((obj = record.get ("GroupExternalIdType")) != null)
    {
      out.GroupExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceExternalId")) != null)
    {
      out.ServiceExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ServiceExternalIdType")) != null)
    {
      out.ServiceExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("CreateDt")) != null)
    {
      out.CreateDt = (Date) obj;
    }
  
    if ((obj = record.get ("IsDesignated")) != null)
    {
      out.IsDesignated = (Integer) obj;
    }
      return out;
  }
  /** convert Map to GroupMemberObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupMemberObjectFilter the converted object
   */
  public static GroupMemberObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupMemberObjectFilter out = new GroupMemberObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = GroupMemberObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map ServiceExternalIdMap = (Map)record.get("ServiceExternalId");
    Boolean ServiceExternalIdFetch = DataHelper.getFetch(ServiceExternalIdMap);
    Boolean ServiceExternalIdSortDir = DataHelper.getSortDirection(ServiceExternalIdMap);
    Integer ServiceExternalIdSortOrder = DataHelper.getSortOrder(ServiceExternalIdMap);
    if (ServiceExternalIdFetch != null) out.setServiceExternalIdFetch(ServiceExternalIdFetch);
    if (ServiceExternalIdSortDir != null) out.setServiceExternalIdSortDirection(ServiceExternalIdSortDir);
    if (ServiceExternalIdSortOrder != null) out.setServiceExternalIdSortOrder(ServiceExternalIdSortOrder);

    Filter[] ServiceExternalIdFilter = DataHelper.mapToFilterArray(ServiceExternalIdMap, String.class);
    if (ServiceExternalIdFilter != null) {
      StringFilter[] ServiceExternalIdFilters = new StringFilter[ServiceExternalIdFilter.length];
      for (int i = 0; i < ServiceExternalIdFilters.length; i++) {
        ServiceExternalIdFilters[i] = (StringFilter)ServiceExternalIdFilter[i];
      }
      try {
        out.setServiceExternalIdFilter(ServiceExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceExternalIdTypeMap = (Map)record.get("ServiceExternalIdType");
    Boolean ServiceExternalIdTypeFetch = DataHelper.getFetch(ServiceExternalIdTypeMap);
    Boolean ServiceExternalIdTypeSortDir = DataHelper.getSortDirection(ServiceExternalIdTypeMap);
    Integer ServiceExternalIdTypeSortOrder = DataHelper.getSortOrder(ServiceExternalIdTypeMap);
    if (ServiceExternalIdTypeFetch != null) out.setServiceExternalIdTypeFetch(ServiceExternalIdTypeFetch);
    if (ServiceExternalIdTypeSortDir != null) out.setServiceExternalIdTypeSortDirection(ServiceExternalIdTypeSortDir);
    if (ServiceExternalIdTypeSortOrder != null) out.setServiceExternalIdTypeSortOrder(ServiceExternalIdTypeSortOrder);

    Filter[] ServiceExternalIdTypeFilter = DataHelper.mapToFilterArray(ServiceExternalIdTypeMap, Integer.class);
    if (ServiceExternalIdTypeFilter != null) {
      IntegerFilter[] ServiceExternalIdTypeFilters = new IntegerFilter[ServiceExternalIdTypeFilter.length];
      for (int i = 0; i < ServiceExternalIdTypeFilters.length; i++) {
        ServiceExternalIdTypeFilters[i] = (IntegerFilter)ServiceExternalIdTypeFilter[i];
      }
      try {
        out.setServiceExternalIdTypeFilter(ServiceExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountExternalIdMap = (Map)record.get("AccountExternalId");
    Boolean AccountExternalIdFetch = DataHelper.getFetch(AccountExternalIdMap);
    Boolean AccountExternalIdSortDir = DataHelper.getSortDirection(AccountExternalIdMap);
    Integer AccountExternalIdSortOrder = DataHelper.getSortOrder(AccountExternalIdMap);
    if (AccountExternalIdFetch != null) out.setAccountExternalIdFetch(AccountExternalIdFetch);
    if (AccountExternalIdSortDir != null) out.setAccountExternalIdSortDirection(AccountExternalIdSortDir);
    if (AccountExternalIdSortOrder != null) out.setAccountExternalIdSortOrder(AccountExternalIdSortOrder);

    Filter[] AccountExternalIdFilter = DataHelper.mapToFilterArray(AccountExternalIdMap, String.class);
    if (AccountExternalIdFilter != null) {
      StringFilter[] AccountExternalIdFilters = new StringFilter[AccountExternalIdFilter.length];
      for (int i = 0; i < AccountExternalIdFilters.length; i++) {
        AccountExternalIdFilters[i] = (StringFilter)AccountExternalIdFilter[i];
      }
      try {
        out.setAccountExternalIdFilter(AccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountExternalIdTypeMap = (Map)record.get("AccountExternalIdType");
    Boolean AccountExternalIdTypeFetch = DataHelper.getFetch(AccountExternalIdTypeMap);
    Boolean AccountExternalIdTypeSortDir = DataHelper.getSortDirection(AccountExternalIdTypeMap);
    Integer AccountExternalIdTypeSortOrder = DataHelper.getSortOrder(AccountExternalIdTypeMap);
    if (AccountExternalIdTypeFetch != null) out.setAccountExternalIdTypeFetch(AccountExternalIdTypeFetch);
    if (AccountExternalIdTypeSortDir != null) out.setAccountExternalIdTypeSortDirection(AccountExternalIdTypeSortDir);
    if (AccountExternalIdTypeSortOrder != null) out.setAccountExternalIdTypeSortOrder(AccountExternalIdTypeSortOrder);

    Filter[] AccountExternalIdTypeFilter = DataHelper.mapToFilterArray(AccountExternalIdTypeMap, Integer.class);
    if (AccountExternalIdTypeFilter != null) {
      IntegerFilter[] AccountExternalIdTypeFilters = new IntegerFilter[AccountExternalIdTypeFilter.length];
      for (int i = 0; i < AccountExternalIdTypeFilters.length; i++) {
        AccountExternalIdTypeFilters[i] = (IntegerFilter)AccountExternalIdTypeFilter[i];
      }
      try {
        out.setAccountExternalIdTypeFilter(AccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDtMap = (Map)record.get("InactiveDt");
    Boolean InactiveDtFetch = DataHelper.getFetch(InactiveDtMap);
    Boolean InactiveDtSortDir = DataHelper.getSortDirection(InactiveDtMap);
    Integer InactiveDtSortOrder = DataHelper.getSortOrder(InactiveDtMap);
    if (InactiveDtFetch != null) out.setInactiveDtFetch(InactiveDtFetch);
    if (InactiveDtSortDir != null) out.setInactiveDtSortDirection(InactiveDtSortDir);
    if (InactiveDtSortOrder != null) out.setInactiveDtSortOrder(InactiveDtSortOrder);

    Filter[] InactiveDtFilter = DataHelper.mapToFilterArray(InactiveDtMap, Date.class);
    if (InactiveDtFilter != null) {
      DateFilter[] InactiveDtFilters = new DateFilter[InactiveDtFilter.length];
      for (int i = 0; i < InactiveDtFilters.length; i++) {
        InactiveDtFilters[i] = (DateFilter)InactiveDtFilter[i];
      }
      try {
        out.setInactiveDtFilter(InactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDtMap = (Map)record.get("ChgDt");
    Boolean ChgDtFetch = DataHelper.getFetch(ChgDtMap);
    Boolean ChgDtSortDir = DataHelper.getSortDirection(ChgDtMap);
    Integer ChgDtSortOrder = DataHelper.getSortOrder(ChgDtMap);
    if (ChgDtFetch != null) out.setChgDtFetch(ChgDtFetch);
    if (ChgDtSortDir != null) out.setChgDtSortDirection(ChgDtSortDir);
    if (ChgDtSortOrder != null) out.setChgDtSortOrder(ChgDtSortOrder);

    Filter[] ChgDtFilter = DataHelper.mapToFilterArray(ChgDtMap, Date.class);
    if (ChgDtFilter != null) {
      DateFilter[] ChgDtFilters = new DateFilter[ChgDtFilter.length];
      for (int i = 0; i < ChgDtFilters.length; i++) {
        ChgDtFilters[i] = (DateFilter)ChgDtFilter[i];
      }
      try {
        out.setChgDtFilter(ChgDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgWhoMap = (Map)record.get("ChgWho");
    Boolean ChgWhoFetch = DataHelper.getFetch(ChgWhoMap);
    Boolean ChgWhoSortDir = DataHelper.getSortDirection(ChgWhoMap);
    Integer ChgWhoSortOrder = DataHelper.getSortOrder(ChgWhoMap);
    if (ChgWhoFetch != null) out.setChgWhoFetch(ChgWhoFetch);
    if (ChgWhoSortDir != null) out.setChgWhoSortDirection(ChgWhoSortDir);
    if (ChgWhoSortOrder != null) out.setChgWhoSortOrder(ChgWhoSortOrder);

    Filter[] ChgWhoFilter = DataHelper.mapToFilterArray(ChgWhoMap, String.class);
    if (ChgWhoFilter != null) {
      StringFilter[] ChgWhoFilters = new StringFilter[ChgWhoFilter.length];
      for (int i = 0; i < ChgWhoFilters.length; i++) {
        ChgWhoFilters[i] = (StringFilter)ChgWhoFilter[i];
      }
      try {
        out.setChgWhoFilter(ChgWhoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CreateDtMap = (Map)record.get("CreateDt");
    Boolean CreateDtFetch = DataHelper.getFetch(CreateDtMap);
    Boolean CreateDtSortDir = DataHelper.getSortDirection(CreateDtMap);
    Integer CreateDtSortOrder = DataHelper.getSortOrder(CreateDtMap);
    if (CreateDtFetch != null) out.setCreateDtFetch(CreateDtFetch);
    if (CreateDtSortDir != null) out.setCreateDtSortDirection(CreateDtSortDir);
    if (CreateDtSortOrder != null) out.setCreateDtSortOrder(CreateDtSortOrder);

    Filter[] CreateDtFilter = DataHelper.mapToFilterArray(CreateDtMap, Date.class);
    if (CreateDtFilter != null) {
      DateFilter[] CreateDtFilters = new DateFilter[CreateDtFilter.length];
      for (int i = 0; i < CreateDtFilters.length; i++) {
        CreateDtFilters[i] = (DateFilter)CreateDtFilter[i];
      }
      try {
        out.setCreateDtFilter(CreateDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsDesignatedMap = (Map)record.get("IsDesignated");
    Boolean IsDesignatedFetch = DataHelper.getFetch(IsDesignatedMap);
    Boolean IsDesignatedSortDir = DataHelper.getSortDirection(IsDesignatedMap);
    Integer IsDesignatedSortOrder = DataHelper.getSortOrder(IsDesignatedMap);
    if (IsDesignatedFetch != null) out.setIsDesignatedFetch(IsDesignatedFetch);
    if (IsDesignatedSortDir != null) out.setIsDesignatedSortDirection(IsDesignatedSortDir);
    if (IsDesignatedSortOrder != null) out.setIsDesignatedSortOrder(IsDesignatedSortOrder);

    Filter[] IsDesignatedFilter = DataHelper.mapToFilterArray(IsDesignatedMap, Integer.class);
    if (IsDesignatedFilter != null) {
      IntegerFilter[] IsDesignatedFilters = new IntegerFilter[IsDesignatedFilter.length];
      for (int i = 0; i < IsDesignatedFilters.length; i++) {
        IsDesignatedFilters[i] = (IntegerFilter)IsDesignatedFilter[i];
      }
      try {
        out.setIsDesignatedFilter(IsDesignatedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
