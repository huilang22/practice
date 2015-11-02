/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GroupMemberObjectKeyHelper.java
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

/** Helper class for GroupMemberObject's Key objects. */
public class GroupMemberObjectKeyHelper implements ArubaObjectHelper
{
  /** convert GroupMemberObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GroupMemberObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupMemberObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupMemberObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupMemberObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupMemberObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert GroupMemberObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GroupMemberObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GroupMemberObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GroupMemberObject")
   * @return Map     the output Map
   */
  public static Map toMap (GroupMemberObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GroupMemberObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GroupMemberObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return GroupMemberObjectKeyData the converted object
   */
  public static GroupMemberObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GroupMemberObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GroupMemberObject")
   * @return GroupMemberObjectKeyData the converted object
   */
  public static GroupMemberObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupMemberObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GroupMemberObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return GroupMemberObjectKeyFilter the converted object
   */
  public static GroupMemberObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GroupMemberObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GroupMemberObject")
   * @return GroupMemberObjectKeyFilter the converted object
   */
  public static GroupMemberObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GroupMemberObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert GroupMemberObjectKeyData to a Map (not including the root).
  /** convert GroupMemberObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GroupMemberObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._GroupNoSet) record.put ("GroupNo", in.GroupNo);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    return record;
  }
  /** convert GroupMemberObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GroupMemberObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.GroupNo, in.GroupNoSort, in.GroupNoSortAscending, in.GroupNoFetch);
      if (map != null) record.put ("GroupNo", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
    return record;
  }
  /** convert Map to GroupMemberObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupMemberObjectKeyData the converted object
   */
  public static GroupMemberObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupMemberObjectKeyData out = new GroupMemberObjectKeyData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (Integer) obj;
      out._ServiceInternalIdSet = true;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (Integer) obj;
      out._ServiceInternalIdResetsSet = true;
    }
  
    if ((obj = record.get ("GroupNo")) != null)
    {
      out.GroupNo = (Integer) obj;
      out._GroupNoSet = true;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
      out._ActiveDtSet = true;
    }
  
    return out;
  }
  /** convert Map to GroupMemberObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GroupMemberObjectKeyFilter the converted object
   */
  public static GroupMemberObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GroupMemberObjectKeyFilter out = new GroupMemberObjectKeyFilter ();

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
  
    Map ServiceInternalIdMap = (Map)record.get("ServiceInternalId");
    Boolean ServiceInternalIdFetch = DataHelper.getFetch(ServiceInternalIdMap);
    Boolean ServiceInternalIdSortDir = DataHelper.getSortDirection(ServiceInternalIdMap);
    Integer ServiceInternalIdSortOrder = DataHelper.getSortOrder(ServiceInternalIdMap);
    if (ServiceInternalIdFetch != null) out.setServiceInternalIdFetch(ServiceInternalIdFetch);
    if (ServiceInternalIdSortDir != null) out.setServiceInternalIdSortDirection(ServiceInternalIdSortDir);
    if (ServiceInternalIdSortOrder != null) out.setServiceInternalIdSortOrder(ServiceInternalIdSortOrder);

    Filter[] ServiceInternalIdFilter = DataHelper.mapToFilterArray(ServiceInternalIdMap, Integer.class);
    if (ServiceInternalIdFilter != null) {
      IntegerFilter[] ServiceInternalIdFilters = new IntegerFilter[ServiceInternalIdFilter.length];
      for (int i = 0; i < ServiceInternalIdFilters.length; i++) {
        ServiceInternalIdFilters[i] = (IntegerFilter)ServiceInternalIdFilter[i];
      }
      try {
        out.setServiceInternalIdFilter(ServiceInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdResetsMap = (Map)record.get("ServiceInternalIdResets");
    Boolean ServiceInternalIdResetsFetch = DataHelper.getFetch(ServiceInternalIdResetsMap);
    Boolean ServiceInternalIdResetsSortDir = DataHelper.getSortDirection(ServiceInternalIdResetsMap);
    Integer ServiceInternalIdResetsSortOrder = DataHelper.getSortOrder(ServiceInternalIdResetsMap);
    if (ServiceInternalIdResetsFetch != null) out.setServiceInternalIdResetsFetch(ServiceInternalIdResetsFetch);
    if (ServiceInternalIdResetsSortDir != null) out.setServiceInternalIdResetsSortDirection(ServiceInternalIdResetsSortDir);
    if (ServiceInternalIdResetsSortOrder != null) out.setServiceInternalIdResetsSortOrder(ServiceInternalIdResetsSortOrder);

    Filter[] ServiceInternalIdResetsFilter = DataHelper.mapToFilterArray(ServiceInternalIdResetsMap, Integer.class);
    if (ServiceInternalIdResetsFilter != null) {
      IntegerFilter[] ServiceInternalIdResetsFilters = new IntegerFilter[ServiceInternalIdResetsFilter.length];
      for (int i = 0; i < ServiceInternalIdResetsFilters.length; i++) {
        ServiceInternalIdResetsFilters[i] = (IntegerFilter)ServiceInternalIdResetsFilter[i];
      }
      try {
        out.setServiceInternalIdResetsFilter(ServiceInternalIdResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    Map ActiveDtMap = (Map)record.get("ActiveDt");
    Boolean ActiveDtFetch = DataHelper.getFetch(ActiveDtMap);
    Boolean ActiveDtSortDir = DataHelper.getSortDirection(ActiveDtMap);
    Integer ActiveDtSortOrder = DataHelper.getSortOrder(ActiveDtMap);
    if (ActiveDtFetch != null) out.setActiveDtFetch(ActiveDtFetch);
    if (ActiveDtSortDir != null) out.setActiveDtSortDirection(ActiveDtSortDir);
    if (ActiveDtSortOrder != null) out.setActiveDtSortOrder(ActiveDtSortOrder);

    Filter[] ActiveDtFilter = DataHelper.mapToFilterArray(ActiveDtMap, Date.class);
    if (ActiveDtFilter != null) {
      DateFilter[] ActiveDtFilters = new DateFilter[ActiveDtFilter.length];
      for (int i = 0; i < ActiveDtFilters.length; i++) {
        ActiveDtFilters[i] = (DateFilter)ActiveDtFilter[i];
      }
      try {
        out.setActiveDtFilter(ActiveDtFilters);
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
