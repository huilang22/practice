/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountIdObjectHelper.java
 * Definition File: Customer/AccountId.xml
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


/** Helper class to convert AccountIdObject JavaBean objects to/from HashMaps.
 */
public class AccountIdObjectHelper implements ArubaObjectHelper
{
  /** convert AccountIdObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountIdObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountIdObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountIdObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountIdObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountIdObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AccountIdObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountIdObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountIdObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountIdObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountIdObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountIdObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountIdObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountIdObjectData the converted object
   */
  public static AccountIdObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountIdObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountIdObject")
   * @return AccountIdObjectData the converted object
   */
  public static AccountIdObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountIdObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountIdObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountIdObjectFilter the converted object
   */
  public static AccountIdObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountIdObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountIdObject")
   * @return AccountIdObjectFilter the converted object
   */
  public static AccountIdObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountIdObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountIdObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountIdObjectDataList the converted object
   */
  public static AccountIdObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountIdObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountIdObjectList")
   * @return AccountIdObjectDataList the converted object
   */
  public static AccountIdObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountIdObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountIdObjectData[] array = null;
    if (root != null)
    {
      array = new AccountIdObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountIdObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountIdObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountIdObjectDataList (array, index, total);
  }
  /** convert AccountIdObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountIdObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AccountIdObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._IsCurrentSet) record.put ("IsCurrent", in.IsCurrent);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
      return record;
  }
  /** convert AccountIdObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountIdObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AccountIdObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.IsCurrent, in.IsCurrentSort, in.IsCurrentSortAscending, in.IsCurrentFetch);
      if (map != null) record.put ("IsCurrent", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
    return record;
  }
  /** convert Map to AccountIdObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountIdObjectData the converted object
   */
  public static AccountIdObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountIdObjectData out = new AccountIdObjectData ();

    out.Key = AccountIdObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("IsCurrent")) != null)
    {
      out.IsCurrent = (Boolean) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to AccountIdObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountIdObjectFilter the converted object
   */
  public static AccountIdObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountIdObjectFilter out = new AccountIdObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AccountIdObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map IsCurrentMap = (Map)record.get("IsCurrent");
    Boolean IsCurrentFetch = DataHelper.getFetch(IsCurrentMap);
    Boolean IsCurrentSortDir = DataHelper.getSortDirection(IsCurrentMap);
    Integer IsCurrentSortOrder = DataHelper.getSortOrder(IsCurrentMap);
    if (IsCurrentFetch != null) out.setIsCurrentFetch(IsCurrentFetch);
    if (IsCurrentSortDir != null) out.setIsCurrentSortDirection(IsCurrentSortDir);
    if (IsCurrentSortOrder != null) out.setIsCurrentSortOrder(IsCurrentSortOrder);

    Filter[] IsCurrentFilter = DataHelper.mapToFilterArray(IsCurrentMap, Boolean.class);
    if (IsCurrentFilter != null) {
      BooleanFilter[] IsCurrentFilters = new BooleanFilter[IsCurrentFilter.length];
      for (int i = 0; i < IsCurrentFilters.length; i++) {
        IsCurrentFilters[i] = (BooleanFilter)IsCurrentFilter[i];
      }
      try {
        out.setIsCurrentFilter(IsCurrentFilters);
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
  
    return out;
  }
}
