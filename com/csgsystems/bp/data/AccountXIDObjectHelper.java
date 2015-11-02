/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountXIDObjectHelper.java
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


/** Helper class to convert AccountXIDObject JavaBean objects to/from HashMaps.
 */
public class AccountXIDObjectHelper implements ArubaObjectHelper
{
  /** convert AccountXIDObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountXIDObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountXIDObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountXIDObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountXIDObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountXIDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = AccountObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountXIDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountXIDObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountXIDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountXIDObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountXIDObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountXIDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = AccountObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountXIDObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountXIDObjectData the converted object
   */
  public static AccountXIDObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountXIDObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountXIDObject")
   * @return AccountXIDObjectData the converted object
   */
  public static AccountXIDObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountXIDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountXIDObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountXIDObjectFilter the converted object
   */
  public static AccountXIDObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountXIDObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountXIDObject")
   * @return AccountXIDObjectFilter the converted object
   */
  public static AccountXIDObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountXIDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountXIDObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountXIDObjectDataList the converted object
   */
  public static AccountXIDObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountXIDObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountXIDObjectList")
   * @return AccountXIDObjectDataList the converted object
   */
  public static AccountXIDObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountXIDObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountXIDObjectData[] array = null;
    if (root != null)
    {
      array = new AccountXIDObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountXIDObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountXIDObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountXIDObjectDataList (array, index, total);
  }
  /** convert AccountXIDObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountXIDObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._ParentAccountExternalIdSet) record.put ("ParentAccountExternalId", in.ParentAccountExternalId);
  
    if (in._ParentAccountExternalIdTypeSet) record.put ("ParentAccountExternalIdType", in.ParentAccountExternalIdType);
  
    if (in._HierarchyAccountExternalIdSet) record.put ("HierarchyAccountExternalId", in.HierarchyAccountExternalId);
  
    if (in._HierarchyAccountExternalIdTypeSet) record.put ("HierarchyAccountExternalIdType", in.HierarchyAccountExternalIdType);
      return record;
  }
  /** convert AccountXIDObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountXIDObjectFilter in, Map record)
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
      map = DataHelper.filterToMap (in.ParentAccountExternalId, in.ParentAccountExternalIdSort, in.ParentAccountExternalIdSortAscending, in.ParentAccountExternalIdFetch, in.ParentAccountExternalIdCaseInsensitive);
      if (map != null) record.put ("ParentAccountExternalId", map);
      map = DataHelper.filterToMap (in.ParentAccountExternalIdType, in.ParentAccountExternalIdTypeSort, in.ParentAccountExternalIdTypeSortAscending, in.ParentAccountExternalIdTypeFetch);
      if (map != null) record.put ("ParentAccountExternalIdType", map);
      map = DataHelper.filterToMap (in.HierarchyAccountExternalId, in.HierarchyAccountExternalIdSort, in.HierarchyAccountExternalIdSortAscending, in.HierarchyAccountExternalIdFetch, in.HierarchyAccountExternalIdCaseInsensitive);
      if (map != null) record.put ("HierarchyAccountExternalId", map);
      map = DataHelper.filterToMap (in.HierarchyAccountExternalIdType, in.HierarchyAccountExternalIdTypeSort, in.HierarchyAccountExternalIdTypeSortAscending, in.HierarchyAccountExternalIdTypeFetch);
      if (map != null) record.put ("HierarchyAccountExternalIdType", map);
    return record;
  }
  /** convert Map to AccountXIDObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountXIDObjectData the converted object
   */
  public static AccountXIDObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountXIDObjectData out = new AccountXIDObjectData (AccountObjectHelper.getObj (record));

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
  
    if ((obj = record.get ("ParentAccountExternalId")) != null)
    {
      out.ParentAccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ParentAccountExternalIdType")) != null)
    {
      out.ParentAccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("HierarchyAccountExternalId")) != null)
    {
      out.HierarchyAccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("HierarchyAccountExternalIdType")) != null)
    {
      out.HierarchyAccountExternalIdType = (Integer) obj;
    }
      return out;
  }
  /** convert Map to AccountXIDObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountXIDObjectFilter the converted object
   */
  public static AccountXIDObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountXIDObjectFilter out = new AccountXIDObjectFilter (AccountObjectHelper.getFilter (record));
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
  
    Map ParentAccountExternalIdMap = (Map)record.get("ParentAccountExternalId");
    Boolean ParentAccountExternalIdFetch = DataHelper.getFetch(ParentAccountExternalIdMap);
    Boolean ParentAccountExternalIdSortDir = DataHelper.getSortDirection(ParentAccountExternalIdMap);
    Integer ParentAccountExternalIdSortOrder = DataHelper.getSortOrder(ParentAccountExternalIdMap);
    if (ParentAccountExternalIdFetch != null) out.setParentAccountExternalIdFetch(ParentAccountExternalIdFetch);
    if (ParentAccountExternalIdSortDir != null) out.setParentAccountExternalIdSortDirection(ParentAccountExternalIdSortDir);
    if (ParentAccountExternalIdSortOrder != null) out.setParentAccountExternalIdSortOrder(ParentAccountExternalIdSortOrder);

    Filter[] ParentAccountExternalIdFilter = DataHelper.mapToFilterArray(ParentAccountExternalIdMap, String.class);
    if (ParentAccountExternalIdFilter != null) {
      StringFilter[] ParentAccountExternalIdFilters = new StringFilter[ParentAccountExternalIdFilter.length];
      for (int i = 0; i < ParentAccountExternalIdFilters.length; i++) {
        ParentAccountExternalIdFilters[i] = (StringFilter)ParentAccountExternalIdFilter[i];
      }
      try {
        out.setParentAccountExternalIdFilter(ParentAccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentAccountExternalIdTypeMap = (Map)record.get("ParentAccountExternalIdType");
    Boolean ParentAccountExternalIdTypeFetch = DataHelper.getFetch(ParentAccountExternalIdTypeMap);
    Boolean ParentAccountExternalIdTypeSortDir = DataHelper.getSortDirection(ParentAccountExternalIdTypeMap);
    Integer ParentAccountExternalIdTypeSortOrder = DataHelper.getSortOrder(ParentAccountExternalIdTypeMap);
    if (ParentAccountExternalIdTypeFetch != null) out.setParentAccountExternalIdTypeFetch(ParentAccountExternalIdTypeFetch);
    if (ParentAccountExternalIdTypeSortDir != null) out.setParentAccountExternalIdTypeSortDirection(ParentAccountExternalIdTypeSortDir);
    if (ParentAccountExternalIdTypeSortOrder != null) out.setParentAccountExternalIdTypeSortOrder(ParentAccountExternalIdTypeSortOrder);

    Filter[] ParentAccountExternalIdTypeFilter = DataHelper.mapToFilterArray(ParentAccountExternalIdTypeMap, Integer.class);
    if (ParentAccountExternalIdTypeFilter != null) {
      IntegerFilter[] ParentAccountExternalIdTypeFilters = new IntegerFilter[ParentAccountExternalIdTypeFilter.length];
      for (int i = 0; i < ParentAccountExternalIdTypeFilters.length; i++) {
        ParentAccountExternalIdTypeFilters[i] = (IntegerFilter)ParentAccountExternalIdTypeFilter[i];
      }
      try {
        out.setParentAccountExternalIdTypeFilter(ParentAccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map HierarchyAccountExternalIdMap = (Map)record.get("HierarchyAccountExternalId");
    Boolean HierarchyAccountExternalIdFetch = DataHelper.getFetch(HierarchyAccountExternalIdMap);
    Boolean HierarchyAccountExternalIdSortDir = DataHelper.getSortDirection(HierarchyAccountExternalIdMap);
    Integer HierarchyAccountExternalIdSortOrder = DataHelper.getSortOrder(HierarchyAccountExternalIdMap);
    if (HierarchyAccountExternalIdFetch != null) out.setHierarchyAccountExternalIdFetch(HierarchyAccountExternalIdFetch);
    if (HierarchyAccountExternalIdSortDir != null) out.setHierarchyAccountExternalIdSortDirection(HierarchyAccountExternalIdSortDir);
    if (HierarchyAccountExternalIdSortOrder != null) out.setHierarchyAccountExternalIdSortOrder(HierarchyAccountExternalIdSortOrder);

    Filter[] HierarchyAccountExternalIdFilter = DataHelper.mapToFilterArray(HierarchyAccountExternalIdMap, String.class);
    if (HierarchyAccountExternalIdFilter != null) {
      StringFilter[] HierarchyAccountExternalIdFilters = new StringFilter[HierarchyAccountExternalIdFilter.length];
      for (int i = 0; i < HierarchyAccountExternalIdFilters.length; i++) {
        HierarchyAccountExternalIdFilters[i] = (StringFilter)HierarchyAccountExternalIdFilter[i];
      }
      try {
        out.setHierarchyAccountExternalIdFilter(HierarchyAccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map HierarchyAccountExternalIdTypeMap = (Map)record.get("HierarchyAccountExternalIdType");
    Boolean HierarchyAccountExternalIdTypeFetch = DataHelper.getFetch(HierarchyAccountExternalIdTypeMap);
    Boolean HierarchyAccountExternalIdTypeSortDir = DataHelper.getSortDirection(HierarchyAccountExternalIdTypeMap);
    Integer HierarchyAccountExternalIdTypeSortOrder = DataHelper.getSortOrder(HierarchyAccountExternalIdTypeMap);
    if (HierarchyAccountExternalIdTypeFetch != null) out.setHierarchyAccountExternalIdTypeFetch(HierarchyAccountExternalIdTypeFetch);
    if (HierarchyAccountExternalIdTypeSortDir != null) out.setHierarchyAccountExternalIdTypeSortDirection(HierarchyAccountExternalIdTypeSortDir);
    if (HierarchyAccountExternalIdTypeSortOrder != null) out.setHierarchyAccountExternalIdTypeSortOrder(HierarchyAccountExternalIdTypeSortOrder);

    Filter[] HierarchyAccountExternalIdTypeFilter = DataHelper.mapToFilterArray(HierarchyAccountExternalIdTypeMap, Integer.class);
    if (HierarchyAccountExternalIdTypeFilter != null) {
      IntegerFilter[] HierarchyAccountExternalIdTypeFilters = new IntegerFilter[HierarchyAccountExternalIdTypeFilter.length];
      for (int i = 0; i < HierarchyAccountExternalIdTypeFilters.length; i++) {
        HierarchyAccountExternalIdTypeFilters[i] = (IntegerFilter)HierarchyAccountExternalIdTypeFilter[i];
      }
      try {
        out.setHierarchyAccountExternalIdTypeFilter(HierarchyAccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
