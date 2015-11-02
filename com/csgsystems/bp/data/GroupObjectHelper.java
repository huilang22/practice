/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupObjectHelper.java
 * Definition File: Customer/Group.xml
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

import com.csgsystems.bp.data.*;


/** Helper class to convert GroupObject JavaBean objects to/from HashMaps.
 */
public class GroupObjectHelper implements ArubaObjectHelper
{
  /** convert GroupObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (GroupObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert GroupObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GroupObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GroupObjectData.
   * @param record the Map containing the data to convert to the object
   * @return GroupObjectData the converted object
   */
  public static GroupObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GroupObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GroupObject")
   * @return GroupObjectData the converted object
   */
  public static GroupObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GroupObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return GroupObjectFilter the converted object
   */
  public static GroupObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GroupObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GroupObject")
   * @return GroupObjectFilter the converted object
   */
  public static GroupObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to GroupObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return GroupObjectDataList the converted object
   */
  public static GroupObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to GroupObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "GroupObjectList")
   * @return GroupObjectDataList the converted object
   */
  public static GroupObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupObjectList";
    Object[] root = (Object[]) record.get (rootName);
    GroupObjectData[] array = null;
    if (root != null)
    {
      array = new GroupObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = GroupObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new GroupObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new GroupObjectDataList (array, index, total);
  }
  /** convert GroupObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GroupObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", GroupObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._GroupExternalIdSet) record.put ("GroupExternalId", in.GroupExternalId);
  
    if (in._GroupExternalIdTypeSet) record.put ("GroupExternalIdType", in.GroupExternalIdType);
  
    if (in._GroupTypeSet) record.put ("GroupType", in.GroupType);
  
    if (in._GroupLevelSet) record.put ("GroupLevel", in.GroupLevel);
  
    if (in._SubscrMasterGroupNoSet) record.put ("SubscrMasterGroupNo", in.SubscrMasterGroupNo);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._CommentsSet) record.put ("Comments", in.Comments);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
      return record;
  }
  /** convert GroupObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GroupObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", GroupObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.GroupExternalId, in.GroupExternalIdSort, in.GroupExternalIdSortAscending, in.GroupExternalIdFetch, in.GroupExternalIdCaseInsensitive);
      if (map != null) record.put ("GroupExternalId", map);
      map = DataHelper.filterToMap (in.GroupExternalIdType, in.GroupExternalIdTypeSort, in.GroupExternalIdTypeSortAscending, in.GroupExternalIdTypeFetch);
      if (map != null) record.put ("GroupExternalIdType", map);
      map = DataHelper.filterToMap (in.GroupType, in.GroupTypeSort, in.GroupTypeSortAscending, in.GroupTypeFetch);
      if (map != null) record.put ("GroupType", map);
      map = DataHelper.filterToMap (in.GroupLevel, in.GroupLevelSort, in.GroupLevelSortAscending, in.GroupLevelFetch);
      if (map != null) record.put ("GroupLevel", map);
      map = DataHelper.filterToMap (in.SubscrMasterGroupNo, in.SubscrMasterGroupNoSort, in.SubscrMasterGroupNoSortAscending, in.SubscrMasterGroupNoFetch);
      if (map != null) record.put ("SubscrMasterGroupNo", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.Comments, in.CommentsSort, in.CommentsSortAscending, in.CommentsFetch, in.CommentsCaseInsensitive);
      if (map != null) record.put ("Comments", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
    return record;
  }
  /** convert Map to GroupObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupObjectData the converted object
   */
  public static GroupObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupObjectData out = new GroupObjectData ();

    out.Key = GroupObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("GroupExternalId")) != null)
    {
      out.GroupExternalId = (String) obj;
    }
  
    if ((obj = record.get ("GroupExternalIdType")) != null)
    {
      out.GroupExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("GroupType")) != null)
    {
      out.GroupType = (Integer) obj;
    }
  
    if ((obj = record.get ("GroupLevel")) != null)
    {
      out.GroupLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("SubscrMasterGroupNo")) != null)
    {
      out.SubscrMasterGroupNo = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("Comments")) != null)
    {
      out.Comments = (String) obj;
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
      return out;
  }
  /** convert Map to GroupObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupObjectFilter the converted object
   */
  public static GroupObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupObjectFilter out = new GroupObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = GroupObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map GroupTypeMap = (Map)record.get("GroupType");
    Boolean GroupTypeFetch = DataHelper.getFetch(GroupTypeMap);
    Boolean GroupTypeSortDir = DataHelper.getSortDirection(GroupTypeMap);
    Integer GroupTypeSortOrder = DataHelper.getSortOrder(GroupTypeMap);
    if (GroupTypeFetch != null) out.setGroupTypeFetch(GroupTypeFetch);
    if (GroupTypeSortDir != null) out.setGroupTypeSortDirection(GroupTypeSortDir);
    if (GroupTypeSortOrder != null) out.setGroupTypeSortOrder(GroupTypeSortOrder);

    Filter[] GroupTypeFilter = DataHelper.mapToFilterArray(GroupTypeMap, Integer.class);
    if (GroupTypeFilter != null) {
      IntegerFilter[] GroupTypeFilters = new IntegerFilter[GroupTypeFilter.length];
      for (int i = 0; i < GroupTypeFilters.length; i++) {
        GroupTypeFilters[i] = (IntegerFilter)GroupTypeFilter[i];
      }
      try {
        out.setGroupTypeFilter(GroupTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GroupLevelMap = (Map)record.get("GroupLevel");
    Boolean GroupLevelFetch = DataHelper.getFetch(GroupLevelMap);
    Boolean GroupLevelSortDir = DataHelper.getSortDirection(GroupLevelMap);
    Integer GroupLevelSortOrder = DataHelper.getSortOrder(GroupLevelMap);
    if (GroupLevelFetch != null) out.setGroupLevelFetch(GroupLevelFetch);
    if (GroupLevelSortDir != null) out.setGroupLevelSortDirection(GroupLevelSortDir);
    if (GroupLevelSortOrder != null) out.setGroupLevelSortOrder(GroupLevelSortOrder);

    Filter[] GroupLevelFilter = DataHelper.mapToFilterArray(GroupLevelMap, Integer.class);
    if (GroupLevelFilter != null) {
      IntegerFilter[] GroupLevelFilters = new IntegerFilter[GroupLevelFilter.length];
      for (int i = 0; i < GroupLevelFilters.length; i++) {
        GroupLevelFilters[i] = (IntegerFilter)GroupLevelFilter[i];
      }
      try {
        out.setGroupLevelFilter(GroupLevelFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SubscrMasterGroupNoMap = (Map)record.get("SubscrMasterGroupNo");
    Boolean SubscrMasterGroupNoFetch = DataHelper.getFetch(SubscrMasterGroupNoMap);
    Boolean SubscrMasterGroupNoSortDir = DataHelper.getSortDirection(SubscrMasterGroupNoMap);
    Integer SubscrMasterGroupNoSortOrder = DataHelper.getSortOrder(SubscrMasterGroupNoMap);
    if (SubscrMasterGroupNoFetch != null) out.setSubscrMasterGroupNoFetch(SubscrMasterGroupNoFetch);
    if (SubscrMasterGroupNoSortDir != null) out.setSubscrMasterGroupNoSortDirection(SubscrMasterGroupNoSortDir);
    if (SubscrMasterGroupNoSortOrder != null) out.setSubscrMasterGroupNoSortOrder(SubscrMasterGroupNoSortOrder);

    Filter[] SubscrMasterGroupNoFilter = DataHelper.mapToFilterArray(SubscrMasterGroupNoMap, Integer.class);
    if (SubscrMasterGroupNoFilter != null) {
      IntegerFilter[] SubscrMasterGroupNoFilters = new IntegerFilter[SubscrMasterGroupNoFilter.length];
      for (int i = 0; i < SubscrMasterGroupNoFilters.length; i++) {
        SubscrMasterGroupNoFilters[i] = (IntegerFilter)SubscrMasterGroupNoFilter[i];
      }
      try {
        out.setSubscrMasterGroupNoFilter(SubscrMasterGroupNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountInternalIdMap = (Map)record.get("AccountInternalId");
    Boolean AccountInternalIdFetch = DataHelper.getFetch(AccountInternalIdMap);
    Boolean AccountInternalIdSortDir = DataHelper.getSortDirection(AccountInternalIdMap);
    Integer AccountInternalIdSortOrder = DataHelper.getSortOrder(AccountInternalIdMap);
    if (AccountInternalIdFetch != null) out.setAccountInternalIdFetch(AccountInternalIdFetch);
    if (AccountInternalIdSortDir != null) out.setAccountInternalIdSortDirection(AccountInternalIdSortDir);
    if (AccountInternalIdSortOrder != null) out.setAccountInternalIdSortOrder(AccountInternalIdSortOrder);

    Filter[] AccountInternalIdFilter = DataHelper.mapToFilterArray(AccountInternalIdMap, Integer.class);
    if (AccountInternalIdFilter != null) {
      IntegerFilter[] AccountInternalIdFilters = new IntegerFilter[AccountInternalIdFilter.length];
      for (int i = 0; i < AccountInternalIdFilters.length; i++) {
        AccountInternalIdFilters[i] = (IntegerFilter)AccountInternalIdFilter[i];
      }
      try {
        out.setAccountInternalIdFilter(AccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CommentsMap = (Map)record.get("Comments");
    Boolean CommentsFetch = DataHelper.getFetch(CommentsMap);
    Boolean CommentsSortDir = DataHelper.getSortDirection(CommentsMap);
    Integer CommentsSortOrder = DataHelper.getSortOrder(CommentsMap);
    if (CommentsFetch != null) out.setCommentsFetch(CommentsFetch);
    if (CommentsSortDir != null) out.setCommentsSortDirection(CommentsSortDir);
    if (CommentsSortOrder != null) out.setCommentsSortOrder(CommentsSortOrder);

    Filter[] CommentsFilter = DataHelper.mapToFilterArray(CommentsMap, String.class);
    if (CommentsFilter != null) {
      StringFilter[] CommentsFilters = new StringFilter[CommentsFilter.length];
      for (int i = 0; i < CommentsFilters.length; i++) {
        CommentsFilters[i] = (StringFilter)CommentsFilter[i];
      }
      try {
        out.setCommentsFilter(CommentsFilters);
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
  
    return out;
  }
}
