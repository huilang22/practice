/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityAciObjectHelper.java
 * Definition File: Admin/SecurityAci.xml
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



/** Helper class to convert SecurityAciObject JavaBean objects to/from HashMaps.
 */
public class SecurityAciObjectHelper implements ArubaObjectHelper
{
  /** convert SecurityAciObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (SecurityAciObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityAciObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityAciObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityAciObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityAciObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert SecurityAciObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityAciObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityAciObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityAciObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityAciObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityAciObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SecurityAciObjectData.
   * @param record the Map containing the data to convert to the object
   * @return SecurityAciObjectData the converted object
   */
  public static SecurityAciObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SecurityAciObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SecurityAciObject")
   * @return SecurityAciObjectData the converted object
   */
  public static SecurityAciObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityAciObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SecurityAciObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return SecurityAciObjectFilter the converted object
   */
  public static SecurityAciObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SecurityAciObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SecurityAciObject")
   * @return SecurityAciObjectFilter the converted object
   */
  public static SecurityAciObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityAciObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to SecurityAciObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return SecurityAciObjectDataList the converted object
   */
  public static SecurityAciObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to SecurityAciObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "SecurityAciObjectList")
   * @return SecurityAciObjectDataList the converted object
   */
  public static SecurityAciObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityAciObjectList";
    Object[] root = (Object[]) record.get (rootName);
    SecurityAciObjectData[] array = null;
    if (root != null)
    {
      array = new SecurityAciObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = SecurityAciObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new SecurityAciObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new SecurityAciObjectDataList (array, index, total);
  }
  /** convert SecurityAciObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SecurityAciObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", SecurityAciObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AciNameSet) record.put ("AciName", in.AciName);
  
    if (in._AciResIdSet) record.put ("AciResId", in.AciResId);
  
    if (in._AciRoleIdSet) record.put ("AciRoleId", in.AciRoleId);
  
    if (in._AciUpdateCountSet) record.put ("AciUpdateCount", in.AciUpdateCount);
  
    if (in._AciCreateDateSet) record.put ("AciCreateDate", in.AciCreateDate);
  
    if (in._AciModifyDateSet) record.put ("AciModifyDate", in.AciModifyDate);
  
    if (in._AciModifyUserSet) record.put ("AciModifyUser", in.AciModifyUser);
  
    if (in._ResIdSet) record.put ("ResId", in.ResId);
  
    if (in._ResNameSet) record.put ("ResName", in.ResName);
  
    if (in._ResSubIdSet) record.put ("ResSubId", in.ResSubId);
  
    if (in._ResRtyIdSet) record.put ("ResRtyId", in.ResRtyId);
  
    if (in._ResMrIdSet) record.put ("ResMrId", in.ResMrId);
  
    if (in._ResUpdateCountSet) record.put ("ResUpdateCount", in.ResUpdateCount);
  
    if (in._ResCreateDateSet) record.put ("ResCreateDate", in.ResCreateDate);
  
    if (in._ResModifyDateSet) record.put ("ResModifyDate", in.ResModifyDate);
  
    if (in._ResModifyUserSet) record.put ("ResModifyUser", in.ResModifyUser);
  
    if (in._FrvRoleIdSet) record.put ("FrvRoleId", in.FrvRoleId);
  
    if (in._FrvLanguageCodeSet) record.put ("FrvLanguageCode", in.FrvLanguageCode);
  
    if (in._FrvShortDisplaySet) record.put ("FrvShortDisplay", in.FrvShortDisplay);
  
    if (in._FrvDisplayValueSet) record.put ("FrvDisplayValue", in.FrvDisplayValue);
  
    if (in._FrvUpdateCountSet) record.put ("FrvUpdateCount", in.FrvUpdateCount);
  
    if (in._FrvCreateDateSet) record.put ("FrvCreateDate", in.FrvCreateDate);
  
    if (in._FrvModifyDateSet) record.put ("FrvModifyDate", in.FrvModifyDate);
  
    if (in._FrvModifyUserSet) record.put ("FrvModifyUser", in.FrvModifyUser);
      return record;
  }
  /** convert SecurityAciObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SecurityAciObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", SecurityAciObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AciName, in.AciNameSort, in.AciNameSortAscending, in.AciNameFetch, in.AciNameCaseInsensitive);
      if (map != null) record.put ("AciName", map);
      map = DataHelper.filterToMap (in.AciResId, in.AciResIdSort, in.AciResIdSortAscending, in.AciResIdFetch);
      if (map != null) record.put ("AciResId", map);
      map = DataHelper.filterToMap (in.AciRoleId, in.AciRoleIdSort, in.AciRoleIdSortAscending, in.AciRoleIdFetch);
      if (map != null) record.put ("AciRoleId", map);
      map = DataHelper.filterToMap (in.AciUpdateCount, in.AciUpdateCountSort, in.AciUpdateCountSortAscending, in.AciUpdateCountFetch);
      if (map != null) record.put ("AciUpdateCount", map);
      map = DataHelper.filterToMap (in.AciCreateDate, in.AciCreateDateSort, in.AciCreateDateSortAscending, in.AciCreateDateFetch);
      if (map != null) record.put ("AciCreateDate", map);
      map = DataHelper.filterToMap (in.AciModifyDate, in.AciModifyDateSort, in.AciModifyDateSortAscending, in.AciModifyDateFetch);
      if (map != null) record.put ("AciModifyDate", map);
      map = DataHelper.filterToMap (in.AciModifyUser, in.AciModifyUserSort, in.AciModifyUserSortAscending, in.AciModifyUserFetch, in.AciModifyUserCaseInsensitive);
      if (map != null) record.put ("AciModifyUser", map);
      map = DataHelper.filterToMap (in.ResId, in.ResIdSort, in.ResIdSortAscending, in.ResIdFetch);
      if (map != null) record.put ("ResId", map);
      map = DataHelper.filterToMap (in.ResName, in.ResNameSort, in.ResNameSortAscending, in.ResNameFetch, in.ResNameCaseInsensitive);
      if (map != null) record.put ("ResName", map);
      map = DataHelper.filterToMap (in.ResSubId, in.ResSubIdSort, in.ResSubIdSortAscending, in.ResSubIdFetch);
      if (map != null) record.put ("ResSubId", map);
      map = DataHelper.filterToMap (in.ResRtyId, in.ResRtyIdSort, in.ResRtyIdSortAscending, in.ResRtyIdFetch);
      if (map != null) record.put ("ResRtyId", map);
      map = DataHelper.filterToMap (in.ResMrId, in.ResMrIdSort, in.ResMrIdSortAscending, in.ResMrIdFetch);
      if (map != null) record.put ("ResMrId", map);
      map = DataHelper.filterToMap (in.ResUpdateCount, in.ResUpdateCountSort, in.ResUpdateCountSortAscending, in.ResUpdateCountFetch);
      if (map != null) record.put ("ResUpdateCount", map);
      map = DataHelper.filterToMap (in.ResCreateDate, in.ResCreateDateSort, in.ResCreateDateSortAscending, in.ResCreateDateFetch);
      if (map != null) record.put ("ResCreateDate", map);
      map = DataHelper.filterToMap (in.ResModifyDate, in.ResModifyDateSort, in.ResModifyDateSortAscending, in.ResModifyDateFetch);
      if (map != null) record.put ("ResModifyDate", map);
      map = DataHelper.filterToMap (in.ResModifyUser, in.ResModifyUserSort, in.ResModifyUserSortAscending, in.ResModifyUserFetch, in.ResModifyUserCaseInsensitive);
      if (map != null) record.put ("ResModifyUser", map);
      map = DataHelper.filterToMap (in.FrvRoleId, in.FrvRoleIdSort, in.FrvRoleIdSortAscending, in.FrvRoleIdFetch);
      if (map != null) record.put ("FrvRoleId", map);
      map = DataHelper.filterToMap (in.FrvLanguageCode, in.FrvLanguageCodeSort, in.FrvLanguageCodeSortAscending, in.FrvLanguageCodeFetch);
      if (map != null) record.put ("FrvLanguageCode", map);
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
  /** convert Map to SecurityAciObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityAciObjectData the converted object
   */
  public static SecurityAciObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityAciObjectData out = new SecurityAciObjectData ();

    out.Key = SecurityAciObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AciName")) != null)
    {
      out.AciName = (String) obj;
    }
  
    if ((obj = record.get ("AciResId")) != null)
    {
      out.AciResId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AciRoleId")) != null)
    {
      out.AciRoleId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AciUpdateCount")) != null)
    {
      out.AciUpdateCount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AciCreateDate")) != null)
    {
      out.AciCreateDate = (Date) obj;
    }
  
    if ((obj = record.get ("AciModifyDate")) != null)
    {
      out.AciModifyDate = (Date) obj;
    }
  
    if ((obj = record.get ("AciModifyUser")) != null)
    {
      out.AciModifyUser = (String) obj;
    }
  
    if ((obj = record.get ("ResId")) != null)
    {
      out.ResId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ResName")) != null)
    {
      out.ResName = (String) obj;
    }
  
    if ((obj = record.get ("ResSubId")) != null)
    {
      out.ResSubId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ResRtyId")) != null)
    {
      out.ResRtyId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ResMrId")) != null)
    {
      out.ResMrId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ResUpdateCount")) != null)
    {
      out.ResUpdateCount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ResCreateDate")) != null)
    {
      out.ResCreateDate = (Date) obj;
    }
  
    if ((obj = record.get ("ResModifyDate")) != null)
    {
      out.ResModifyDate = (Date) obj;
    }
  
    if ((obj = record.get ("ResModifyUser")) != null)
    {
      out.ResModifyUser = (String) obj;
    }
  
    if ((obj = record.get ("FrvRoleId")) != null)
    {
      out.FrvRoleId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("FrvLanguageCode")) != null)
    {
      out.FrvLanguageCode = (Integer) obj;
    }
  
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
  /** convert Map to SecurityAciObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityAciObjectFilter the converted object
   */
  public static SecurityAciObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityAciObjectFilter out = new SecurityAciObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = SecurityAciObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map AciNameMap = (Map)record.get("AciName");
    Boolean AciNameFetch = DataHelper.getFetch(AciNameMap);
    Boolean AciNameSortDir = DataHelper.getSortDirection(AciNameMap);
    Integer AciNameSortOrder = DataHelper.getSortOrder(AciNameMap);
    if (AciNameFetch != null) out.setAciNameFetch(AciNameFetch);
    if (AciNameSortDir != null) out.setAciNameSortDirection(AciNameSortDir);
    if (AciNameSortOrder != null) out.setAciNameSortOrder(AciNameSortOrder);

    Filter[] AciNameFilter = DataHelper.mapToFilterArray(AciNameMap, String.class);
    if (AciNameFilter != null) {
      StringFilter[] AciNameFilters = new StringFilter[AciNameFilter.length];
      for (int i = 0; i < AciNameFilters.length; i++) {
        AciNameFilters[i] = (StringFilter)AciNameFilter[i];
      }
      try {
        out.setAciNameFilter(AciNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AciResIdMap = (Map)record.get("AciResId");
    Boolean AciResIdFetch = DataHelper.getFetch(AciResIdMap);
    Boolean AciResIdSortDir = DataHelper.getSortDirection(AciResIdMap);
    Integer AciResIdSortOrder = DataHelper.getSortOrder(AciResIdMap);
    if (AciResIdFetch != null) out.setAciResIdFetch(AciResIdFetch);
    if (AciResIdSortDir != null) out.setAciResIdSortDirection(AciResIdSortDir);
    if (AciResIdSortOrder != null) out.setAciResIdSortOrder(AciResIdSortOrder);

    Filter[] AciResIdFilter = DataHelper.mapToFilterArray(AciResIdMap, BigInteger.class);
    if (AciResIdFilter != null) {
      BigIntegerFilter[] AciResIdFilters = new BigIntegerFilter[AciResIdFilter.length];
      for (int i = 0; i < AciResIdFilters.length; i++) {
        AciResIdFilters[i] = (BigIntegerFilter)AciResIdFilter[i];
      }
      try {
        out.setAciResIdFilter(AciResIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AciRoleIdMap = (Map)record.get("AciRoleId");
    Boolean AciRoleIdFetch = DataHelper.getFetch(AciRoleIdMap);
    Boolean AciRoleIdSortDir = DataHelper.getSortDirection(AciRoleIdMap);
    Integer AciRoleIdSortOrder = DataHelper.getSortOrder(AciRoleIdMap);
    if (AciRoleIdFetch != null) out.setAciRoleIdFetch(AciRoleIdFetch);
    if (AciRoleIdSortDir != null) out.setAciRoleIdSortDirection(AciRoleIdSortDir);
    if (AciRoleIdSortOrder != null) out.setAciRoleIdSortOrder(AciRoleIdSortOrder);

    Filter[] AciRoleIdFilter = DataHelper.mapToFilterArray(AciRoleIdMap, BigInteger.class);
    if (AciRoleIdFilter != null) {
      BigIntegerFilter[] AciRoleIdFilters = new BigIntegerFilter[AciRoleIdFilter.length];
      for (int i = 0; i < AciRoleIdFilters.length; i++) {
        AciRoleIdFilters[i] = (BigIntegerFilter)AciRoleIdFilter[i];
      }
      try {
        out.setAciRoleIdFilter(AciRoleIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AciUpdateCountMap = (Map)record.get("AciUpdateCount");
    Boolean AciUpdateCountFetch = DataHelper.getFetch(AciUpdateCountMap);
    Boolean AciUpdateCountSortDir = DataHelper.getSortDirection(AciUpdateCountMap);
    Integer AciUpdateCountSortOrder = DataHelper.getSortOrder(AciUpdateCountMap);
    if (AciUpdateCountFetch != null) out.setAciUpdateCountFetch(AciUpdateCountFetch);
    if (AciUpdateCountSortDir != null) out.setAciUpdateCountSortDirection(AciUpdateCountSortDir);
    if (AciUpdateCountSortOrder != null) out.setAciUpdateCountSortOrder(AciUpdateCountSortOrder);

    Filter[] AciUpdateCountFilter = DataHelper.mapToFilterArray(AciUpdateCountMap, BigInteger.class);
    if (AciUpdateCountFilter != null) {
      BigIntegerFilter[] AciUpdateCountFilters = new BigIntegerFilter[AciUpdateCountFilter.length];
      for (int i = 0; i < AciUpdateCountFilters.length; i++) {
        AciUpdateCountFilters[i] = (BigIntegerFilter)AciUpdateCountFilter[i];
      }
      try {
        out.setAciUpdateCountFilter(AciUpdateCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AciCreateDateMap = (Map)record.get("AciCreateDate");
    Boolean AciCreateDateFetch = DataHelper.getFetch(AciCreateDateMap);
    Boolean AciCreateDateSortDir = DataHelper.getSortDirection(AciCreateDateMap);
    Integer AciCreateDateSortOrder = DataHelper.getSortOrder(AciCreateDateMap);
    if (AciCreateDateFetch != null) out.setAciCreateDateFetch(AciCreateDateFetch);
    if (AciCreateDateSortDir != null) out.setAciCreateDateSortDirection(AciCreateDateSortDir);
    if (AciCreateDateSortOrder != null) out.setAciCreateDateSortOrder(AciCreateDateSortOrder);

    Filter[] AciCreateDateFilter = DataHelper.mapToFilterArray(AciCreateDateMap, Date.class);
    if (AciCreateDateFilter != null) {
      DateFilter[] AciCreateDateFilters = new DateFilter[AciCreateDateFilter.length];
      for (int i = 0; i < AciCreateDateFilters.length; i++) {
        AciCreateDateFilters[i] = (DateFilter)AciCreateDateFilter[i];
      }
      try {
        out.setAciCreateDateFilter(AciCreateDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AciModifyDateMap = (Map)record.get("AciModifyDate");
    Boolean AciModifyDateFetch = DataHelper.getFetch(AciModifyDateMap);
    Boolean AciModifyDateSortDir = DataHelper.getSortDirection(AciModifyDateMap);
    Integer AciModifyDateSortOrder = DataHelper.getSortOrder(AciModifyDateMap);
    if (AciModifyDateFetch != null) out.setAciModifyDateFetch(AciModifyDateFetch);
    if (AciModifyDateSortDir != null) out.setAciModifyDateSortDirection(AciModifyDateSortDir);
    if (AciModifyDateSortOrder != null) out.setAciModifyDateSortOrder(AciModifyDateSortOrder);

    Filter[] AciModifyDateFilter = DataHelper.mapToFilterArray(AciModifyDateMap, Date.class);
    if (AciModifyDateFilter != null) {
      DateFilter[] AciModifyDateFilters = new DateFilter[AciModifyDateFilter.length];
      for (int i = 0; i < AciModifyDateFilters.length; i++) {
        AciModifyDateFilters[i] = (DateFilter)AciModifyDateFilter[i];
      }
      try {
        out.setAciModifyDateFilter(AciModifyDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AciModifyUserMap = (Map)record.get("AciModifyUser");
    Boolean AciModifyUserFetch = DataHelper.getFetch(AciModifyUserMap);
    Boolean AciModifyUserSortDir = DataHelper.getSortDirection(AciModifyUserMap);
    Integer AciModifyUserSortOrder = DataHelper.getSortOrder(AciModifyUserMap);
    if (AciModifyUserFetch != null) out.setAciModifyUserFetch(AciModifyUserFetch);
    if (AciModifyUserSortDir != null) out.setAciModifyUserSortDirection(AciModifyUserSortDir);
    if (AciModifyUserSortOrder != null) out.setAciModifyUserSortOrder(AciModifyUserSortOrder);

    Filter[] AciModifyUserFilter = DataHelper.mapToFilterArray(AciModifyUserMap, String.class);
    if (AciModifyUserFilter != null) {
      StringFilter[] AciModifyUserFilters = new StringFilter[AciModifyUserFilter.length];
      for (int i = 0; i < AciModifyUserFilters.length; i++) {
        AciModifyUserFilters[i] = (StringFilter)AciModifyUserFilter[i];
      }
      try {
        out.setAciModifyUserFilter(AciModifyUserFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResIdMap = (Map)record.get("ResId");
    Boolean ResIdFetch = DataHelper.getFetch(ResIdMap);
    Boolean ResIdSortDir = DataHelper.getSortDirection(ResIdMap);
    Integer ResIdSortOrder = DataHelper.getSortOrder(ResIdMap);
    if (ResIdFetch != null) out.setResIdFetch(ResIdFetch);
    if (ResIdSortDir != null) out.setResIdSortDirection(ResIdSortDir);
    if (ResIdSortOrder != null) out.setResIdSortOrder(ResIdSortOrder);

    Filter[] ResIdFilter = DataHelper.mapToFilterArray(ResIdMap, BigInteger.class);
    if (ResIdFilter != null) {
      BigIntegerFilter[] ResIdFilters = new BigIntegerFilter[ResIdFilter.length];
      for (int i = 0; i < ResIdFilters.length; i++) {
        ResIdFilters[i] = (BigIntegerFilter)ResIdFilter[i];
      }
      try {
        out.setResIdFilter(ResIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResNameMap = (Map)record.get("ResName");
    Boolean ResNameFetch = DataHelper.getFetch(ResNameMap);
    Boolean ResNameSortDir = DataHelper.getSortDirection(ResNameMap);
    Integer ResNameSortOrder = DataHelper.getSortOrder(ResNameMap);
    if (ResNameFetch != null) out.setResNameFetch(ResNameFetch);
    if (ResNameSortDir != null) out.setResNameSortDirection(ResNameSortDir);
    if (ResNameSortOrder != null) out.setResNameSortOrder(ResNameSortOrder);

    Filter[] ResNameFilter = DataHelper.mapToFilterArray(ResNameMap, String.class);
    if (ResNameFilter != null) {
      StringFilter[] ResNameFilters = new StringFilter[ResNameFilter.length];
      for (int i = 0; i < ResNameFilters.length; i++) {
        ResNameFilters[i] = (StringFilter)ResNameFilter[i];
      }
      try {
        out.setResNameFilter(ResNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResSubIdMap = (Map)record.get("ResSubId");
    Boolean ResSubIdFetch = DataHelper.getFetch(ResSubIdMap);
    Boolean ResSubIdSortDir = DataHelper.getSortDirection(ResSubIdMap);
    Integer ResSubIdSortOrder = DataHelper.getSortOrder(ResSubIdMap);
    if (ResSubIdFetch != null) out.setResSubIdFetch(ResSubIdFetch);
    if (ResSubIdSortDir != null) out.setResSubIdSortDirection(ResSubIdSortDir);
    if (ResSubIdSortOrder != null) out.setResSubIdSortOrder(ResSubIdSortOrder);

    Filter[] ResSubIdFilter = DataHelper.mapToFilterArray(ResSubIdMap, BigInteger.class);
    if (ResSubIdFilter != null) {
      BigIntegerFilter[] ResSubIdFilters = new BigIntegerFilter[ResSubIdFilter.length];
      for (int i = 0; i < ResSubIdFilters.length; i++) {
        ResSubIdFilters[i] = (BigIntegerFilter)ResSubIdFilter[i];
      }
      try {
        out.setResSubIdFilter(ResSubIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResRtyIdMap = (Map)record.get("ResRtyId");
    Boolean ResRtyIdFetch = DataHelper.getFetch(ResRtyIdMap);
    Boolean ResRtyIdSortDir = DataHelper.getSortDirection(ResRtyIdMap);
    Integer ResRtyIdSortOrder = DataHelper.getSortOrder(ResRtyIdMap);
    if (ResRtyIdFetch != null) out.setResRtyIdFetch(ResRtyIdFetch);
    if (ResRtyIdSortDir != null) out.setResRtyIdSortDirection(ResRtyIdSortDir);
    if (ResRtyIdSortOrder != null) out.setResRtyIdSortOrder(ResRtyIdSortOrder);

    Filter[] ResRtyIdFilter = DataHelper.mapToFilterArray(ResRtyIdMap, BigInteger.class);
    if (ResRtyIdFilter != null) {
      BigIntegerFilter[] ResRtyIdFilters = new BigIntegerFilter[ResRtyIdFilter.length];
      for (int i = 0; i < ResRtyIdFilters.length; i++) {
        ResRtyIdFilters[i] = (BigIntegerFilter)ResRtyIdFilter[i];
      }
      try {
        out.setResRtyIdFilter(ResRtyIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResMrIdMap = (Map)record.get("ResMrId");
    Boolean ResMrIdFetch = DataHelper.getFetch(ResMrIdMap);
    Boolean ResMrIdSortDir = DataHelper.getSortDirection(ResMrIdMap);
    Integer ResMrIdSortOrder = DataHelper.getSortOrder(ResMrIdMap);
    if (ResMrIdFetch != null) out.setResMrIdFetch(ResMrIdFetch);
    if (ResMrIdSortDir != null) out.setResMrIdSortDirection(ResMrIdSortDir);
    if (ResMrIdSortOrder != null) out.setResMrIdSortOrder(ResMrIdSortOrder);

    Filter[] ResMrIdFilter = DataHelper.mapToFilterArray(ResMrIdMap, BigInteger.class);
    if (ResMrIdFilter != null) {
      BigIntegerFilter[] ResMrIdFilters = new BigIntegerFilter[ResMrIdFilter.length];
      for (int i = 0; i < ResMrIdFilters.length; i++) {
        ResMrIdFilters[i] = (BigIntegerFilter)ResMrIdFilter[i];
      }
      try {
        out.setResMrIdFilter(ResMrIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResUpdateCountMap = (Map)record.get("ResUpdateCount");
    Boolean ResUpdateCountFetch = DataHelper.getFetch(ResUpdateCountMap);
    Boolean ResUpdateCountSortDir = DataHelper.getSortDirection(ResUpdateCountMap);
    Integer ResUpdateCountSortOrder = DataHelper.getSortOrder(ResUpdateCountMap);
    if (ResUpdateCountFetch != null) out.setResUpdateCountFetch(ResUpdateCountFetch);
    if (ResUpdateCountSortDir != null) out.setResUpdateCountSortDirection(ResUpdateCountSortDir);
    if (ResUpdateCountSortOrder != null) out.setResUpdateCountSortOrder(ResUpdateCountSortOrder);

    Filter[] ResUpdateCountFilter = DataHelper.mapToFilterArray(ResUpdateCountMap, BigInteger.class);
    if (ResUpdateCountFilter != null) {
      BigIntegerFilter[] ResUpdateCountFilters = new BigIntegerFilter[ResUpdateCountFilter.length];
      for (int i = 0; i < ResUpdateCountFilters.length; i++) {
        ResUpdateCountFilters[i] = (BigIntegerFilter)ResUpdateCountFilter[i];
      }
      try {
        out.setResUpdateCountFilter(ResUpdateCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResCreateDateMap = (Map)record.get("ResCreateDate");
    Boolean ResCreateDateFetch = DataHelper.getFetch(ResCreateDateMap);
    Boolean ResCreateDateSortDir = DataHelper.getSortDirection(ResCreateDateMap);
    Integer ResCreateDateSortOrder = DataHelper.getSortOrder(ResCreateDateMap);
    if (ResCreateDateFetch != null) out.setResCreateDateFetch(ResCreateDateFetch);
    if (ResCreateDateSortDir != null) out.setResCreateDateSortDirection(ResCreateDateSortDir);
    if (ResCreateDateSortOrder != null) out.setResCreateDateSortOrder(ResCreateDateSortOrder);

    Filter[] ResCreateDateFilter = DataHelper.mapToFilterArray(ResCreateDateMap, Date.class);
    if (ResCreateDateFilter != null) {
      DateFilter[] ResCreateDateFilters = new DateFilter[ResCreateDateFilter.length];
      for (int i = 0; i < ResCreateDateFilters.length; i++) {
        ResCreateDateFilters[i] = (DateFilter)ResCreateDateFilter[i];
      }
      try {
        out.setResCreateDateFilter(ResCreateDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResModifyDateMap = (Map)record.get("ResModifyDate");
    Boolean ResModifyDateFetch = DataHelper.getFetch(ResModifyDateMap);
    Boolean ResModifyDateSortDir = DataHelper.getSortDirection(ResModifyDateMap);
    Integer ResModifyDateSortOrder = DataHelper.getSortOrder(ResModifyDateMap);
    if (ResModifyDateFetch != null) out.setResModifyDateFetch(ResModifyDateFetch);
    if (ResModifyDateSortDir != null) out.setResModifyDateSortDirection(ResModifyDateSortDir);
    if (ResModifyDateSortOrder != null) out.setResModifyDateSortOrder(ResModifyDateSortOrder);

    Filter[] ResModifyDateFilter = DataHelper.mapToFilterArray(ResModifyDateMap, Date.class);
    if (ResModifyDateFilter != null) {
      DateFilter[] ResModifyDateFilters = new DateFilter[ResModifyDateFilter.length];
      for (int i = 0; i < ResModifyDateFilters.length; i++) {
        ResModifyDateFilters[i] = (DateFilter)ResModifyDateFilter[i];
      }
      try {
        out.setResModifyDateFilter(ResModifyDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResModifyUserMap = (Map)record.get("ResModifyUser");
    Boolean ResModifyUserFetch = DataHelper.getFetch(ResModifyUserMap);
    Boolean ResModifyUserSortDir = DataHelper.getSortDirection(ResModifyUserMap);
    Integer ResModifyUserSortOrder = DataHelper.getSortOrder(ResModifyUserMap);
    if (ResModifyUserFetch != null) out.setResModifyUserFetch(ResModifyUserFetch);
    if (ResModifyUserSortDir != null) out.setResModifyUserSortDirection(ResModifyUserSortDir);
    if (ResModifyUserSortOrder != null) out.setResModifyUserSortOrder(ResModifyUserSortOrder);

    Filter[] ResModifyUserFilter = DataHelper.mapToFilterArray(ResModifyUserMap, String.class);
    if (ResModifyUserFilter != null) {
      StringFilter[] ResModifyUserFilters = new StringFilter[ResModifyUserFilter.length];
      for (int i = 0; i < ResModifyUserFilters.length; i++) {
        ResModifyUserFilters[i] = (StringFilter)ResModifyUserFilter[i];
      }
      try {
        out.setResModifyUserFilter(ResModifyUserFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrvRoleIdMap = (Map)record.get("FrvRoleId");
    Boolean FrvRoleIdFetch = DataHelper.getFetch(FrvRoleIdMap);
    Boolean FrvRoleIdSortDir = DataHelper.getSortDirection(FrvRoleIdMap);
    Integer FrvRoleIdSortOrder = DataHelper.getSortOrder(FrvRoleIdMap);
    if (FrvRoleIdFetch != null) out.setFrvRoleIdFetch(FrvRoleIdFetch);
    if (FrvRoleIdSortDir != null) out.setFrvRoleIdSortDirection(FrvRoleIdSortDir);
    if (FrvRoleIdSortOrder != null) out.setFrvRoleIdSortOrder(FrvRoleIdSortOrder);

    Filter[] FrvRoleIdFilter = DataHelper.mapToFilterArray(FrvRoleIdMap, BigInteger.class);
    if (FrvRoleIdFilter != null) {
      BigIntegerFilter[] FrvRoleIdFilters = new BigIntegerFilter[FrvRoleIdFilter.length];
      for (int i = 0; i < FrvRoleIdFilters.length; i++) {
        FrvRoleIdFilters[i] = (BigIntegerFilter)FrvRoleIdFilter[i];
      }
      try {
        out.setFrvRoleIdFilter(FrvRoleIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrvLanguageCodeMap = (Map)record.get("FrvLanguageCode");
    Boolean FrvLanguageCodeFetch = DataHelper.getFetch(FrvLanguageCodeMap);
    Boolean FrvLanguageCodeSortDir = DataHelper.getSortDirection(FrvLanguageCodeMap);
    Integer FrvLanguageCodeSortOrder = DataHelper.getSortOrder(FrvLanguageCodeMap);
    if (FrvLanguageCodeFetch != null) out.setFrvLanguageCodeFetch(FrvLanguageCodeFetch);
    if (FrvLanguageCodeSortDir != null) out.setFrvLanguageCodeSortDirection(FrvLanguageCodeSortDir);
    if (FrvLanguageCodeSortOrder != null) out.setFrvLanguageCodeSortOrder(FrvLanguageCodeSortOrder);

    Filter[] FrvLanguageCodeFilter = DataHelper.mapToFilterArray(FrvLanguageCodeMap, Integer.class);
    if (FrvLanguageCodeFilter != null) {
      IntegerFilter[] FrvLanguageCodeFilters = new IntegerFilter[FrvLanguageCodeFilter.length];
      for (int i = 0; i < FrvLanguageCodeFilters.length; i++) {
        FrvLanguageCodeFilters[i] = (IntegerFilter)FrvLanguageCodeFilter[i];
      }
      try {
        out.setFrvLanguageCodeFilter(FrvLanguageCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
