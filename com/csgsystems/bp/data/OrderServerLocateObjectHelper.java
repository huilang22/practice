/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: OrderServerLocateObjectHelper.java
 * Definition File: Catalog/AccountLocate.xml
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



/** Helper class to convert OrderServerLocateObject JavaBean objects to/from HashMaps.
 */
public class OrderServerLocateObjectHelper implements ArubaObjectHelper
{
  /** convert OrderServerLocateObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (OrderServerLocateObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert OrderServerLocateObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "OrderServerLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (OrderServerLocateObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "OrderServerLocateObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert OrderServerLocateObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (OrderServerLocateObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert OrderServerLocateObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "OrderServerLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (OrderServerLocateObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "OrderServerLocateObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to OrderServerLocateObjectData.
   * @param record the Map containing the data to convert to the object
   * @return OrderServerLocateObjectData the converted object
   */
  public static OrderServerLocateObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to OrderServerLocateObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "OrderServerLocateObject")
   * @return OrderServerLocateObjectData the converted object
   */
  public static OrderServerLocateObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "OrderServerLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to OrderServerLocateObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return OrderServerLocateObjectFilter the converted object
   */
  public static OrderServerLocateObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to OrderServerLocateObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "OrderServerLocateObject")
   * @return OrderServerLocateObjectFilter the converted object
   */
  public static OrderServerLocateObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "OrderServerLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to OrderServerLocateObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return OrderServerLocateObjectDataList the converted object
   */
  public static OrderServerLocateObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to OrderServerLocateObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "OrderServerLocateObjectList")
   * @return OrderServerLocateObjectDataList the converted object
   */
  public static OrderServerLocateObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "OrderServerLocateObjectList";
    Object[] root = (Object[]) record.get (rootName);
    OrderServerLocateObjectData[] array = null;
    if (root != null)
    {
      array = new OrderServerLocateObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = OrderServerLocateObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new OrderServerLocateObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new OrderServerLocateObjectDataList (array, index, total);
  }
  /** convert OrderServerLocateObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (OrderServerLocateObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", OrderServerLocateObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._OrderNumberSet) record.put ("OrderNumber", in.OrderNumber);
  
    if (in._OrderStatusIdSet) record.put ("OrderStatusId", in.OrderStatusId);
  
    if (in._ContactFnameSet) record.put ("ContactFname", in.ContactFname);
  
    if (in._ContactLnameSet) record.put ("ContactLname", in.ContactLname);
  
    if (in._ContactCompanySet) record.put ("ContactCompany", in.ContactCompany);
  
    if (in._ContactFnameFindSet) record.put ("ContactFnameFind", in.ContactFnameFind);
  
    if (in._ContactLnameFindSet) record.put ("ContactLnameFind", in.ContactLnameFind);
  
    if (in._ContactCompanyFindSet) record.put ("ContactCompanyFind", in.ContactCompanyFind);
  
    if (in._ContactEmailSet) record.put ("ContactEmail", in.ContactEmail);
  
    if (in._BatchIdSet) record.put ("BatchId", in.BatchId);
      return record;
  }
  /** convert OrderServerLocateObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (OrderServerLocateObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", OrderServerLocateObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch);
      if (map != null) record.put ("ServerId", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.OrderNumber, in.OrderNumberSort, in.OrderNumberSortAscending, in.OrderNumberFetch, in.OrderNumberCaseInsensitive);
      if (map != null) record.put ("OrderNumber", map);
      map = DataHelper.filterToMap (in.OrderStatusId, in.OrderStatusIdSort, in.OrderStatusIdSortAscending, in.OrderStatusIdFetch);
      if (map != null) record.put ("OrderStatusId", map);
      map = DataHelper.filterToMap (in.ContactFname, in.ContactFnameSort, in.ContactFnameSortAscending, in.ContactFnameFetch, in.ContactFnameCaseInsensitive);
      if (map != null) record.put ("ContactFname", map);
      map = DataHelper.filterToMap (in.ContactLname, in.ContactLnameSort, in.ContactLnameSortAscending, in.ContactLnameFetch, in.ContactLnameCaseInsensitive);
      if (map != null) record.put ("ContactLname", map);
      map = DataHelper.filterToMap (in.ContactCompany, in.ContactCompanySort, in.ContactCompanySortAscending, in.ContactCompanyFetch, in.ContactCompanyCaseInsensitive);
      if (map != null) record.put ("ContactCompany", map);
      map = DataHelper.filterToMap (in.ContactFnameFind, in.ContactFnameFindSort, in.ContactFnameFindSortAscending, in.ContactFnameFindFetch, in.ContactFnameFindCaseInsensitive);
      if (map != null) record.put ("ContactFnameFind", map);
      map = DataHelper.filterToMap (in.ContactLnameFind, in.ContactLnameFindSort, in.ContactLnameFindSortAscending, in.ContactLnameFindFetch, in.ContactLnameFindCaseInsensitive);
      if (map != null) record.put ("ContactLnameFind", map);
      map = DataHelper.filterToMap (in.ContactCompanyFind, in.ContactCompanyFindSort, in.ContactCompanyFindSortAscending, in.ContactCompanyFindFetch, in.ContactCompanyFindCaseInsensitive);
      if (map != null) record.put ("ContactCompanyFind", map);
      map = DataHelper.filterToMap (in.ContactEmail, in.ContactEmailSort, in.ContactEmailSortAscending, in.ContactEmailFetch, in.ContactEmailCaseInsensitive);
      if (map != null) record.put ("ContactEmail", map);
      map = DataHelper.filterToMap (in.BatchId, in.BatchIdSort, in.BatchIdSortAscending, in.BatchIdFetch);
      if (map != null) record.put ("BatchId", map);
    return record;
  }
  /** convert Map to OrderServerLocateObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return OrderServerLocateObjectData the converted object
   */
  public static OrderServerLocateObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    OrderServerLocateObjectData out = new OrderServerLocateObjectData ();

    out.Key = OrderServerLocateObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ServerId")) != null)
    {
      out.ServerId = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrderNumber")) != null)
    {
      out.OrderNumber = (String) obj;
    }
  
    if ((obj = record.get ("OrderStatusId")) != null)
    {
      out.OrderStatusId = (Integer) obj;
    }
  
    if ((obj = record.get ("ContactFname")) != null)
    {
      out.ContactFname = (String) obj;
    }
  
    if ((obj = record.get ("ContactLname")) != null)
    {
      out.ContactLname = (String) obj;
    }
  
    if ((obj = record.get ("ContactCompany")) != null)
    {
      out.ContactCompany = (String) obj;
    }
  
    if ((obj = record.get ("ContactFnameFind")) != null)
    {
      out.ContactFnameFind = (String) obj;
    }
  
    if ((obj = record.get ("ContactLnameFind")) != null)
    {
      out.ContactLnameFind = (String) obj;
    }
  
    if ((obj = record.get ("ContactCompanyFind")) != null)
    {
      out.ContactCompanyFind = (String) obj;
    }
  
    if ((obj = record.get ("ContactEmail")) != null)
    {
      out.ContactEmail = (String) obj;
    }
  
    if ((obj = record.get ("BatchId")) != null)
    {
      out.BatchId = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to OrderServerLocateObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return OrderServerLocateObjectFilter the converted object
   */
  public static OrderServerLocateObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    OrderServerLocateObjectFilter out = new OrderServerLocateObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = OrderServerLocateObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ServerIdMap = (Map)record.get("ServerId");
    Boolean ServerIdFetch = DataHelper.getFetch(ServerIdMap);
    Boolean ServerIdSortDir = DataHelper.getSortDirection(ServerIdMap);
    Integer ServerIdSortOrder = DataHelper.getSortOrder(ServerIdMap);
    if (ServerIdFetch != null) out.setServerIdFetch(ServerIdFetch);
    if (ServerIdSortDir != null) out.setServerIdSortDirection(ServerIdSortDir);
    if (ServerIdSortOrder != null) out.setServerIdSortOrder(ServerIdSortOrder);

    Filter[] ServerIdFilter = DataHelper.mapToFilterArray(ServerIdMap, Integer.class);
    if (ServerIdFilter != null) {
      IntegerFilter[] ServerIdFilters = new IntegerFilter[ServerIdFilter.length];
      for (int i = 0; i < ServerIdFilters.length; i++) {
        ServerIdFilters[i] = (IntegerFilter)ServerIdFilter[i];
      }
      try {
        out.setServerIdFilter(ServerIdFilters);
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
  
    Map OrderNumberMap = (Map)record.get("OrderNumber");
    Boolean OrderNumberFetch = DataHelper.getFetch(OrderNumberMap);
    Boolean OrderNumberSortDir = DataHelper.getSortDirection(OrderNumberMap);
    Integer OrderNumberSortOrder = DataHelper.getSortOrder(OrderNumberMap);
    if (OrderNumberFetch != null) out.setOrderNumberFetch(OrderNumberFetch);
    if (OrderNumberSortDir != null) out.setOrderNumberSortDirection(OrderNumberSortDir);
    if (OrderNumberSortOrder != null) out.setOrderNumberSortOrder(OrderNumberSortOrder);

    Filter[] OrderNumberFilter = DataHelper.mapToFilterArray(OrderNumberMap, String.class);
    if (OrderNumberFilter != null) {
      StringFilter[] OrderNumberFilters = new StringFilter[OrderNumberFilter.length];
      for (int i = 0; i < OrderNumberFilters.length; i++) {
        OrderNumberFilters[i] = (StringFilter)OrderNumberFilter[i];
      }
      try {
        out.setOrderNumberFilter(OrderNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrderStatusIdMap = (Map)record.get("OrderStatusId");
    Boolean OrderStatusIdFetch = DataHelper.getFetch(OrderStatusIdMap);
    Boolean OrderStatusIdSortDir = DataHelper.getSortDirection(OrderStatusIdMap);
    Integer OrderStatusIdSortOrder = DataHelper.getSortOrder(OrderStatusIdMap);
    if (OrderStatusIdFetch != null) out.setOrderStatusIdFetch(OrderStatusIdFetch);
    if (OrderStatusIdSortDir != null) out.setOrderStatusIdSortDirection(OrderStatusIdSortDir);
    if (OrderStatusIdSortOrder != null) out.setOrderStatusIdSortOrder(OrderStatusIdSortOrder);

    Filter[] OrderStatusIdFilter = DataHelper.mapToFilterArray(OrderStatusIdMap, Integer.class);
    if (OrderStatusIdFilter != null) {
      IntegerFilter[] OrderStatusIdFilters = new IntegerFilter[OrderStatusIdFilter.length];
      for (int i = 0; i < OrderStatusIdFilters.length; i++) {
        OrderStatusIdFilters[i] = (IntegerFilter)OrderStatusIdFilter[i];
      }
      try {
        out.setOrderStatusIdFilter(OrderStatusIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContactFnameMap = (Map)record.get("ContactFname");
    Boolean ContactFnameFetch = DataHelper.getFetch(ContactFnameMap);
    Boolean ContactFnameSortDir = DataHelper.getSortDirection(ContactFnameMap);
    Integer ContactFnameSortOrder = DataHelper.getSortOrder(ContactFnameMap);
    if (ContactFnameFetch != null) out.setContactFnameFetch(ContactFnameFetch);
    if (ContactFnameSortDir != null) out.setContactFnameSortDirection(ContactFnameSortDir);
    if (ContactFnameSortOrder != null) out.setContactFnameSortOrder(ContactFnameSortOrder);

    Filter[] ContactFnameFilter = DataHelper.mapToFilterArray(ContactFnameMap, String.class);
    if (ContactFnameFilter != null) {
      StringFilter[] ContactFnameFilters = new StringFilter[ContactFnameFilter.length];
      for (int i = 0; i < ContactFnameFilters.length; i++) {
        ContactFnameFilters[i] = (StringFilter)ContactFnameFilter[i];
      }
      try {
        out.setContactFnameFilter(ContactFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContactLnameMap = (Map)record.get("ContactLname");
    Boolean ContactLnameFetch = DataHelper.getFetch(ContactLnameMap);
    Boolean ContactLnameSortDir = DataHelper.getSortDirection(ContactLnameMap);
    Integer ContactLnameSortOrder = DataHelper.getSortOrder(ContactLnameMap);
    if (ContactLnameFetch != null) out.setContactLnameFetch(ContactLnameFetch);
    if (ContactLnameSortDir != null) out.setContactLnameSortDirection(ContactLnameSortDir);
    if (ContactLnameSortOrder != null) out.setContactLnameSortOrder(ContactLnameSortOrder);

    Filter[] ContactLnameFilter = DataHelper.mapToFilterArray(ContactLnameMap, String.class);
    if (ContactLnameFilter != null) {
      StringFilter[] ContactLnameFilters = new StringFilter[ContactLnameFilter.length];
      for (int i = 0; i < ContactLnameFilters.length; i++) {
        ContactLnameFilters[i] = (StringFilter)ContactLnameFilter[i];
      }
      try {
        out.setContactLnameFilter(ContactLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContactCompanyMap = (Map)record.get("ContactCompany");
    Boolean ContactCompanyFetch = DataHelper.getFetch(ContactCompanyMap);
    Boolean ContactCompanySortDir = DataHelper.getSortDirection(ContactCompanyMap);
    Integer ContactCompanySortOrder = DataHelper.getSortOrder(ContactCompanyMap);
    if (ContactCompanyFetch != null) out.setContactCompanyFetch(ContactCompanyFetch);
    if (ContactCompanySortDir != null) out.setContactCompanySortDirection(ContactCompanySortDir);
    if (ContactCompanySortOrder != null) out.setContactCompanySortOrder(ContactCompanySortOrder);

    Filter[] ContactCompanyFilter = DataHelper.mapToFilterArray(ContactCompanyMap, String.class);
    if (ContactCompanyFilter != null) {
      StringFilter[] ContactCompanyFilters = new StringFilter[ContactCompanyFilter.length];
      for (int i = 0; i < ContactCompanyFilters.length; i++) {
        ContactCompanyFilters[i] = (StringFilter)ContactCompanyFilter[i];
      }
      try {
        out.setContactCompanyFilter(ContactCompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContactFnameFindMap = (Map)record.get("ContactFnameFind");
    Boolean ContactFnameFindFetch = DataHelper.getFetch(ContactFnameFindMap);
    Boolean ContactFnameFindSortDir = DataHelper.getSortDirection(ContactFnameFindMap);
    Integer ContactFnameFindSortOrder = DataHelper.getSortOrder(ContactFnameFindMap);
    if (ContactFnameFindFetch != null) out.setContactFnameFindFetch(ContactFnameFindFetch);
    if (ContactFnameFindSortDir != null) out.setContactFnameFindSortDirection(ContactFnameFindSortDir);
    if (ContactFnameFindSortOrder != null) out.setContactFnameFindSortOrder(ContactFnameFindSortOrder);

    Filter[] ContactFnameFindFilter = DataHelper.mapToFilterArray(ContactFnameFindMap, String.class);
    if (ContactFnameFindFilter != null) {
      StringFilter[] ContactFnameFindFilters = new StringFilter[ContactFnameFindFilter.length];
      for (int i = 0; i < ContactFnameFindFilters.length; i++) {
        ContactFnameFindFilters[i] = (StringFilter)ContactFnameFindFilter[i];
      }
      try {
        out.setContactFnameFindFilter(ContactFnameFindFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContactLnameFindMap = (Map)record.get("ContactLnameFind");
    Boolean ContactLnameFindFetch = DataHelper.getFetch(ContactLnameFindMap);
    Boolean ContactLnameFindSortDir = DataHelper.getSortDirection(ContactLnameFindMap);
    Integer ContactLnameFindSortOrder = DataHelper.getSortOrder(ContactLnameFindMap);
    if (ContactLnameFindFetch != null) out.setContactLnameFindFetch(ContactLnameFindFetch);
    if (ContactLnameFindSortDir != null) out.setContactLnameFindSortDirection(ContactLnameFindSortDir);
    if (ContactLnameFindSortOrder != null) out.setContactLnameFindSortOrder(ContactLnameFindSortOrder);

    Filter[] ContactLnameFindFilter = DataHelper.mapToFilterArray(ContactLnameFindMap, String.class);
    if (ContactLnameFindFilter != null) {
      StringFilter[] ContactLnameFindFilters = new StringFilter[ContactLnameFindFilter.length];
      for (int i = 0; i < ContactLnameFindFilters.length; i++) {
        ContactLnameFindFilters[i] = (StringFilter)ContactLnameFindFilter[i];
      }
      try {
        out.setContactLnameFindFilter(ContactLnameFindFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContactCompanyFindMap = (Map)record.get("ContactCompanyFind");
    Boolean ContactCompanyFindFetch = DataHelper.getFetch(ContactCompanyFindMap);
    Boolean ContactCompanyFindSortDir = DataHelper.getSortDirection(ContactCompanyFindMap);
    Integer ContactCompanyFindSortOrder = DataHelper.getSortOrder(ContactCompanyFindMap);
    if (ContactCompanyFindFetch != null) out.setContactCompanyFindFetch(ContactCompanyFindFetch);
    if (ContactCompanyFindSortDir != null) out.setContactCompanyFindSortDirection(ContactCompanyFindSortDir);
    if (ContactCompanyFindSortOrder != null) out.setContactCompanyFindSortOrder(ContactCompanyFindSortOrder);

    Filter[] ContactCompanyFindFilter = DataHelper.mapToFilterArray(ContactCompanyFindMap, String.class);
    if (ContactCompanyFindFilter != null) {
      StringFilter[] ContactCompanyFindFilters = new StringFilter[ContactCompanyFindFilter.length];
      for (int i = 0; i < ContactCompanyFindFilters.length; i++) {
        ContactCompanyFindFilters[i] = (StringFilter)ContactCompanyFindFilter[i];
      }
      try {
        out.setContactCompanyFindFilter(ContactCompanyFindFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContactEmailMap = (Map)record.get("ContactEmail");
    Boolean ContactEmailFetch = DataHelper.getFetch(ContactEmailMap);
    Boolean ContactEmailSortDir = DataHelper.getSortDirection(ContactEmailMap);
    Integer ContactEmailSortOrder = DataHelper.getSortOrder(ContactEmailMap);
    if (ContactEmailFetch != null) out.setContactEmailFetch(ContactEmailFetch);
    if (ContactEmailSortDir != null) out.setContactEmailSortDirection(ContactEmailSortDir);
    if (ContactEmailSortOrder != null) out.setContactEmailSortOrder(ContactEmailSortOrder);

    Filter[] ContactEmailFilter = DataHelper.mapToFilterArray(ContactEmailMap, String.class);
    if (ContactEmailFilter != null) {
      StringFilter[] ContactEmailFilters = new StringFilter[ContactEmailFilter.length];
      for (int i = 0; i < ContactEmailFilters.length; i++) {
        ContactEmailFilters[i] = (StringFilter)ContactEmailFilter[i];
      }
      try {
        out.setContactEmailFilter(ContactEmailFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BatchIdMap = (Map)record.get("BatchId");
    Boolean BatchIdFetch = DataHelper.getFetch(BatchIdMap);
    Boolean BatchIdSortDir = DataHelper.getSortDirection(BatchIdMap);
    Integer BatchIdSortOrder = DataHelper.getSortOrder(BatchIdMap);
    if (BatchIdFetch != null) out.setBatchIdFetch(BatchIdFetch);
    if (BatchIdSortDir != null) out.setBatchIdSortDirection(BatchIdSortDir);
    if (BatchIdSortOrder != null) out.setBatchIdSortOrder(BatchIdSortOrder);

    Filter[] BatchIdFilter = DataHelper.mapToFilterArray(BatchIdMap, BigInteger.class);
    if (BatchIdFilter != null) {
      BigIntegerFilter[] BatchIdFilters = new BigIntegerFilter[BatchIdFilter.length];
      for (int i = 0; i < BatchIdFilters.length; i++) {
        BatchIdFilters[i] = (BigIntegerFilter)BatchIdFilter[i];
      }
      try {
        out.setBatchIdFilter(BatchIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
