/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountXIDOrderObjectHelper.java
 * Definition File: Customer/Account.xml
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
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;


/** Helper class to convert AccountXIDOrderObject JavaBean objects to/from HashMaps.
 */
public class AccountXIDOrderObjectHelper implements ArubaObjectHelper
{
  /** convert AccountXIDOrderObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountXIDOrderObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountXIDOrderObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountXIDOrderObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountXIDOrderObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountXIDOrderObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = AccountObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountXIDOrderObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountXIDOrderObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountXIDOrderObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountXIDOrderObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountXIDOrderObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountXIDOrderObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = AccountObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountXIDOrderObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountXIDOrderObjectData the converted object
   */
  public static AccountXIDOrderObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountXIDOrderObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountXIDOrderObject")
   * @return AccountXIDOrderObjectData the converted object
   */
  public static AccountXIDOrderObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountXIDOrderObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountXIDOrderObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountXIDOrderObjectFilter the converted object
   */
  public static AccountXIDOrderObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountXIDOrderObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountXIDOrderObject")
   * @return AccountXIDOrderObjectFilter the converted object
   */
  public static AccountXIDOrderObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountXIDOrderObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountXIDOrderObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountXIDOrderObjectDataList the converted object
   */
  public static AccountXIDOrderObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountXIDOrderObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountXIDOrderObjectList")
   * @return AccountXIDOrderObjectDataList the converted object
   */
  public static AccountXIDOrderObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountXIDOrderObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountXIDOrderObjectData[] array = null;
    if (root != null)
    {
      array = new AccountXIDOrderObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountXIDOrderObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountXIDOrderObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountXIDOrderObjectDataList (array, index, total);
  }
  /** convert AccountXIDOrderObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountXIDOrderObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._OrderNumberSet) record.put ("OrderNumber", in.OrderNumber);
      return record;
  }
  /** convert AccountXIDOrderObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountXIDOrderObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
      map = DataHelper.filterToMap (in.OrderNumber, in.OrderNumberSort, in.OrderNumberSortAscending, in.OrderNumberFetch, in.OrderNumberCaseInsensitive);
      if (map != null) record.put ("OrderNumber", map);
    return record;
  }
  /** convert Map to AccountXIDOrderObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountXIDOrderObjectData the converted object
   */
  public static AccountXIDOrderObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountXIDOrderObjectData out = new AccountXIDOrderObjectData (AccountObjectHelper.getObj (record));

    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("OrderNumber")) != null)
    {
      out.OrderNumber = (String) obj;
    }
      return out;
  }
  /** convert Map to AccountXIDOrderObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountXIDOrderObjectFilter the converted object
   */
  public static AccountXIDOrderObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountXIDOrderObjectFilter out = new AccountXIDOrderObjectFilter (AccountObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

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
  
    Map ActiveDateMap = (Map)record.get("ActiveDate");
    Boolean ActiveDateFetch = DataHelper.getFetch(ActiveDateMap);
    Boolean ActiveDateSortDir = DataHelper.getSortDirection(ActiveDateMap);
    Integer ActiveDateSortOrder = DataHelper.getSortOrder(ActiveDateMap);
    if (ActiveDateFetch != null) out.setActiveDateFetch(ActiveDateFetch);
    if (ActiveDateSortDir != null) out.setActiveDateSortDirection(ActiveDateSortDir);
    if (ActiveDateSortOrder != null) out.setActiveDateSortOrder(ActiveDateSortOrder);

    Filter[] ActiveDateFilter = DataHelper.mapToFilterArray(ActiveDateMap, Date.class);
    if (ActiveDateFilter != null) {
      DateFilter[] ActiveDateFilters = new DateFilter[ActiveDateFilter.length];
      for (int i = 0; i < ActiveDateFilters.length; i++) {
        ActiveDateFilters[i] = (DateFilter)ActiveDateFilter[i];
      }
      try {
        out.setActiveDateFilter(ActiveDateFilters);
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
  
    return out;
  }
}
