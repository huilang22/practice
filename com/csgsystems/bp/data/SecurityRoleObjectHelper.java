/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityRoleObjectHelper.java
 * Definition File: Admin/SecurityRole.xml
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



/** Helper class to convert SecurityRoleObject JavaBean objects to/from HashMaps.
 */
public class SecurityRoleObjectHelper implements ArubaObjectHelper
{
  /** convert SecurityRoleObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (SecurityRoleObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityRoleObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityRoleObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityRoleObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityRoleObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert SecurityRoleObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityRoleObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityRoleObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityRoleObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityRoleObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityRoleObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SecurityRoleObjectData.
   * @param record the Map containing the data to convert to the object
   * @return SecurityRoleObjectData the converted object
   */
  public static SecurityRoleObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SecurityRoleObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SecurityRoleObject")
   * @return SecurityRoleObjectData the converted object
   */
  public static SecurityRoleObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityRoleObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SecurityRoleObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return SecurityRoleObjectFilter the converted object
   */
  public static SecurityRoleObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SecurityRoleObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SecurityRoleObject")
   * @return SecurityRoleObjectFilter the converted object
   */
  public static SecurityRoleObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityRoleObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to SecurityRoleObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return SecurityRoleObjectDataList the converted object
   */
  public static SecurityRoleObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to SecurityRoleObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "SecurityRoleObjectList")
   * @return SecurityRoleObjectDataList the converted object
   */
  public static SecurityRoleObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityRoleObjectList";
    Object[] root = (Object[]) record.get (rootName);
    SecurityRoleObjectData[] array = null;
    if (root != null)
    {
      array = new SecurityRoleObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = SecurityRoleObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new SecurityRoleObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new SecurityRoleObjectDataList (array, index, total);
  }
  /** convert SecurityRoleObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SecurityRoleObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", SecurityRoleObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._FrvShortDisplaySet) record.put ("FrvShortDisplay", in.FrvShortDisplay);
  
    if (in._FrvDisplayValueSet) record.put ("FrvDisplayValue", in.FrvDisplayValue);
  
    if (in._FrvUpdateCountSet) record.put ("FrvUpdateCount", in.FrvUpdateCount);
  
    if (in._FrvCreateDateSet) record.put ("FrvCreateDate", in.FrvCreateDate);
  
    if (in._FrvModifyDateSet) record.put ("FrvModifyDate", in.FrvModifyDate);
  
    if (in._FrvModifyUserSet) record.put ("FrvModifyUser", in.FrvModifyUser);
      return record;
  }
  /** convert SecurityRoleObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SecurityRoleObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", SecurityRoleObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.FrvShortDisplay, in.FrvShortDisplaySort, in.FrvShortDisplaySortAscending, in.FrvShortDisplayFetch, in.FrvShortDisplayCaseInsensitive);
      if (map != null) record.put ("FrvShortDisplay", map);
      map = DataHelper.filterToMap (in.FrvDisplayValue, in.FrvDisplayValueSort, in.FrvDisplayValueSortAscending, in.FrvDisplayValueFetch, in.FrvDisplayValueCaseInsensitive);
      if (map != null) record.put ("FrvDisplayValue", map);
      map = DataHelper.filterToMap (in.FrvUpdateCount, in.FrvUpdateCountSort, in.FrvUpdateCountSortAscending, in.FrvUpdateCountFetch);
      if (map != null) record.put ("FrvUpdateCount", map);
      map = DataHelper.filterToMap (in.FrvCreateDate, in.FrvCreateDateSort, in.FrvCreateDateSortAscending, in.FrvCreateDateFetch);
      if (map != null) record.put ("FrvCreateDate", map);
      map = DataHelper.filterToMap (in.FrvModifyDate, in.FrvModifyDateSort, in.FrvModifyDateSortAscending, in.FrvModifyDateFetch);
      if (map != null) record.put ("FrvModifyDate", map);
      map = DataHelper.filterToMap (in.FrvModifyUser, in.FrvModifyUserSort, in.FrvModifyUserSortAscending, in.FrvModifyUserFetch, in.FrvModifyUserCaseInsensitive);
      if (map != null) record.put ("FrvModifyUser", map);
    return record;
  }
  /** convert Map to SecurityRoleObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityRoleObjectData the converted object
   */
  public static SecurityRoleObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityRoleObjectData out = new SecurityRoleObjectData ();

    out.Key = SecurityRoleObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("FrvShortDisplay")) != null)
    {
      out.FrvShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("FrvDisplayValue")) != null)
    {
      out.FrvDisplayValue = (String) obj;
    }
  
    if ((obj = record.get ("FrvUpdateCount")) != null)
    {
      out.FrvUpdateCount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("FrvCreateDate")) != null)
    {
      out.FrvCreateDate = (Date) obj;
    }
  
    if ((obj = record.get ("FrvModifyDate")) != null)
    {
      out.FrvModifyDate = (Date) obj;
    }
  
    if ((obj = record.get ("FrvModifyUser")) != null)
    {
      out.FrvModifyUser = (String) obj;
    }
      return out;
  }
  /** convert Map to SecurityRoleObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityRoleObjectFilter the converted object
   */
  public static SecurityRoleObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityRoleObjectFilter out = new SecurityRoleObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = SecurityRoleObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map FrvShortDisplayMap = (Map)record.get("FrvShortDisplay");
    Boolean FrvShortDisplayFetch = DataHelper.getFetch(FrvShortDisplayMap);
    Boolean FrvShortDisplaySortDir = DataHelper.getSortDirection(FrvShortDisplayMap);
    Integer FrvShortDisplaySortOrder = DataHelper.getSortOrder(FrvShortDisplayMap);
    if (FrvShortDisplayFetch != null) out.setFrvShortDisplayFetch(FrvShortDisplayFetch);
    if (FrvShortDisplaySortDir != null) out.setFrvShortDisplaySortDirection(FrvShortDisplaySortDir);
    if (FrvShortDisplaySortOrder != null) out.setFrvShortDisplaySortOrder(FrvShortDisplaySortOrder);

    Filter[] FrvShortDisplayFilter = DataHelper.mapToFilterArray(FrvShortDisplayMap, String.class);
    if (FrvShortDisplayFilter != null) {
      StringFilter[] FrvShortDisplayFilters = new StringFilter[FrvShortDisplayFilter.length];
      for (int i = 0; i < FrvShortDisplayFilters.length; i++) {
        FrvShortDisplayFilters[i] = (StringFilter)FrvShortDisplayFilter[i];
      }
      try {
        out.setFrvShortDisplayFilter(FrvShortDisplayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrvDisplayValueMap = (Map)record.get("FrvDisplayValue");
    Boolean FrvDisplayValueFetch = DataHelper.getFetch(FrvDisplayValueMap);
    Boolean FrvDisplayValueSortDir = DataHelper.getSortDirection(FrvDisplayValueMap);
    Integer FrvDisplayValueSortOrder = DataHelper.getSortOrder(FrvDisplayValueMap);
    if (FrvDisplayValueFetch != null) out.setFrvDisplayValueFetch(FrvDisplayValueFetch);
    if (FrvDisplayValueSortDir != null) out.setFrvDisplayValueSortDirection(FrvDisplayValueSortDir);
    if (FrvDisplayValueSortOrder != null) out.setFrvDisplayValueSortOrder(FrvDisplayValueSortOrder);

    Filter[] FrvDisplayValueFilter = DataHelper.mapToFilterArray(FrvDisplayValueMap, String.class);
    if (FrvDisplayValueFilter != null) {
      StringFilter[] FrvDisplayValueFilters = new StringFilter[FrvDisplayValueFilter.length];
      for (int i = 0; i < FrvDisplayValueFilters.length; i++) {
        FrvDisplayValueFilters[i] = (StringFilter)FrvDisplayValueFilter[i];
      }
      try {
        out.setFrvDisplayValueFilter(FrvDisplayValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrvUpdateCountMap = (Map)record.get("FrvUpdateCount");
    Boolean FrvUpdateCountFetch = DataHelper.getFetch(FrvUpdateCountMap);
    Boolean FrvUpdateCountSortDir = DataHelper.getSortDirection(FrvUpdateCountMap);
    Integer FrvUpdateCountSortOrder = DataHelper.getSortOrder(FrvUpdateCountMap);
    if (FrvUpdateCountFetch != null) out.setFrvUpdateCountFetch(FrvUpdateCountFetch);
    if (FrvUpdateCountSortDir != null) out.setFrvUpdateCountSortDirection(FrvUpdateCountSortDir);
    if (FrvUpdateCountSortOrder != null) out.setFrvUpdateCountSortOrder(FrvUpdateCountSortOrder);

    Filter[] FrvUpdateCountFilter = DataHelper.mapToFilterArray(FrvUpdateCountMap, BigInteger.class);
    if (FrvUpdateCountFilter != null) {
      BigIntegerFilter[] FrvUpdateCountFilters = new BigIntegerFilter[FrvUpdateCountFilter.length];
      for (int i = 0; i < FrvUpdateCountFilters.length; i++) {
        FrvUpdateCountFilters[i] = (BigIntegerFilter)FrvUpdateCountFilter[i];
      }
      try {
        out.setFrvUpdateCountFilter(FrvUpdateCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrvCreateDateMap = (Map)record.get("FrvCreateDate");
    Boolean FrvCreateDateFetch = DataHelper.getFetch(FrvCreateDateMap);
    Boolean FrvCreateDateSortDir = DataHelper.getSortDirection(FrvCreateDateMap);
    Integer FrvCreateDateSortOrder = DataHelper.getSortOrder(FrvCreateDateMap);
    if (FrvCreateDateFetch != null) out.setFrvCreateDateFetch(FrvCreateDateFetch);
    if (FrvCreateDateSortDir != null) out.setFrvCreateDateSortDirection(FrvCreateDateSortDir);
    if (FrvCreateDateSortOrder != null) out.setFrvCreateDateSortOrder(FrvCreateDateSortOrder);

    Filter[] FrvCreateDateFilter = DataHelper.mapToFilterArray(FrvCreateDateMap, Date.class);
    if (FrvCreateDateFilter != null) {
      DateFilter[] FrvCreateDateFilters = new DateFilter[FrvCreateDateFilter.length];
      for (int i = 0; i < FrvCreateDateFilters.length; i++) {
        FrvCreateDateFilters[i] = (DateFilter)FrvCreateDateFilter[i];
      }
      try {
        out.setFrvCreateDateFilter(FrvCreateDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrvModifyDateMap = (Map)record.get("FrvModifyDate");
    Boolean FrvModifyDateFetch = DataHelper.getFetch(FrvModifyDateMap);
    Boolean FrvModifyDateSortDir = DataHelper.getSortDirection(FrvModifyDateMap);
    Integer FrvModifyDateSortOrder = DataHelper.getSortOrder(FrvModifyDateMap);
    if (FrvModifyDateFetch != null) out.setFrvModifyDateFetch(FrvModifyDateFetch);
    if (FrvModifyDateSortDir != null) out.setFrvModifyDateSortDirection(FrvModifyDateSortDir);
    if (FrvModifyDateSortOrder != null) out.setFrvModifyDateSortOrder(FrvModifyDateSortOrder);

    Filter[] FrvModifyDateFilter = DataHelper.mapToFilterArray(FrvModifyDateMap, Date.class);
    if (FrvModifyDateFilter != null) {
      DateFilter[] FrvModifyDateFilters = new DateFilter[FrvModifyDateFilter.length];
      for (int i = 0; i < FrvModifyDateFilters.length; i++) {
        FrvModifyDateFilters[i] = (DateFilter)FrvModifyDateFilter[i];
      }
      try {
        out.setFrvModifyDateFilter(FrvModifyDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrvModifyUserMap = (Map)record.get("FrvModifyUser");
    Boolean FrvModifyUserFetch = DataHelper.getFetch(FrvModifyUserMap);
    Boolean FrvModifyUserSortDir = DataHelper.getSortDirection(FrvModifyUserMap);
    Integer FrvModifyUserSortOrder = DataHelper.getSortOrder(FrvModifyUserMap);
    if (FrvModifyUserFetch != null) out.setFrvModifyUserFetch(FrvModifyUserFetch);
    if (FrvModifyUserSortDir != null) out.setFrvModifyUserSortDirection(FrvModifyUserSortDir);
    if (FrvModifyUserSortOrder != null) out.setFrvModifyUserSortOrder(FrvModifyUserSortOrder);

    Filter[] FrvModifyUserFilter = DataHelper.mapToFilterArray(FrvModifyUserMap, String.class);
    if (FrvModifyUserFilter != null) {
      StringFilter[] FrvModifyUserFilters = new StringFilter[FrvModifyUserFilter.length];
      for (int i = 0; i < FrvModifyUserFilters.length; i++) {
        FrvModifyUserFilters[i] = (StringFilter)FrvModifyUserFilter[i];
      }
      try {
        out.setFrvModifyUserFilter(FrvModifyUserFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
