/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceMasterGroupObjectHelper.java
 * Definition File: Customer/ServiceMasterGroup.xml
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



/** Helper class to convert ServiceMasterGroupObject JavaBean objects to/from HashMaps.
 */
public class ServiceMasterGroupObjectHelper implements ArubaObjectHelper
{
  /** convert ServiceMasterGroupObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ServiceMasterGroupObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceMasterGroupObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceMasterGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceMasterGroupObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceMasterGroupObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ServiceMasterGroupObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceMasterGroupObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceMasterGroupObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceMasterGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceMasterGroupObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceMasterGroupObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServiceMasterGroupObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ServiceMasterGroupObjectData the converted object
   */
  public static ServiceMasterGroupObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServiceMasterGroupObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServiceMasterGroupObject")
   * @return ServiceMasterGroupObjectData the converted object
   */
  public static ServiceMasterGroupObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceMasterGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServiceMasterGroupObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ServiceMasterGroupObjectFilter the converted object
   */
  public static ServiceMasterGroupObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServiceMasterGroupObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServiceMasterGroupObject")
   * @return ServiceMasterGroupObjectFilter the converted object
   */
  public static ServiceMasterGroupObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceMasterGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ServiceMasterGroupObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ServiceMasterGroupObjectDataList the converted object
   */
  public static ServiceMasterGroupObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ServiceMasterGroupObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ServiceMasterGroupObjectList")
   * @return ServiceMasterGroupObjectDataList the converted object
   */
  public static ServiceMasterGroupObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceMasterGroupObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ServiceMasterGroupObjectData[] array = null;
    if (root != null)
    {
      array = new ServiceMasterGroupObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ServiceMasterGroupObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ServiceMasterGroupObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ServiceMasterGroupObjectDataList (array, index, total);
  }
  /** convert ServiceMasterGroupObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServiceMasterGroupObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ServiceMasterGroupObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._CommentsSet) record.put ("Comments", in.Comments);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
      return record;
  }
  /** convert ServiceMasterGroupObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServiceMasterGroupObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ServiceMasterGroupObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.Comments, in.CommentsSort, in.CommentsSortAscending, in.CommentsFetch, in.CommentsCaseInsensitive);
      if (map != null) record.put ("Comments", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
    return record;
  }
  /** convert Map to ServiceMasterGroupObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceMasterGroupObjectData the converted object
   */
  public static ServiceMasterGroupObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceMasterGroupObjectData out = new ServiceMasterGroupObjectData ();

    out.Key = ServiceMasterGroupObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("Comments")) != null)
    {
      out.Comments = (String) obj;
    }
  
    if ((obj = record.get ("CreateDt")) != null)
    {
      out.CreateDt = (Date) obj;
    }
      return out;
  }
  /** convert Map to ServiceMasterGroupObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceMasterGroupObjectFilter the converted object
   */
  public static ServiceMasterGroupObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceMasterGroupObjectFilter out = new ServiceMasterGroupObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ServiceMasterGroupObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
