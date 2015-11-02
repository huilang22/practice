/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityUserObjectHelper.java
 * Definition File: Admin/SecurityUser.xml
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



/** Helper class to convert SecurityUserObject JavaBean objects to/from HashMaps.
 */
public class SecurityUserObjectHelper implements ArubaObjectHelper
{
  /** convert SecurityUserObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (SecurityUserObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityUserObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityUserObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityUserObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityUserObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert SecurityUserObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityUserObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityUserObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityUserObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityUserObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityUserObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SecurityUserObjectData.
   * @param record the Map containing the data to convert to the object
   * @return SecurityUserObjectData the converted object
   */
  public static SecurityUserObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SecurityUserObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SecurityUserObject")
   * @return SecurityUserObjectData the converted object
   */
  public static SecurityUserObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityUserObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SecurityUserObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return SecurityUserObjectFilter the converted object
   */
  public static SecurityUserObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SecurityUserObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SecurityUserObject")
   * @return SecurityUserObjectFilter the converted object
   */
  public static SecurityUserObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityUserObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to SecurityUserObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return SecurityUserObjectDataList the converted object
   */
  public static SecurityUserObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to SecurityUserObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "SecurityUserObjectList")
   * @return SecurityUserObjectDataList the converted object
   */
  public static SecurityUserObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityUserObjectList";
    Object[] root = (Object[]) record.get (rootName);
    SecurityUserObjectData[] array = null;
    if (root != null)
    {
      array = new SecurityUserObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = SecurityUserObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new SecurityUserObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new SecurityUserObjectDataList (array, index, total);
  }
  /** convert SecurityUserObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SecurityUserObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", SecurityUserObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._UsrUserIdSet) record.put ("UsrUserId", in.UsrUserId);
  
    if (in._UsrFirstNameSet) record.put ("UsrFirstName", in.UsrFirstName);
  
    if (in._UsrMiddleNameSet) record.put ("UsrMiddleName", in.UsrMiddleName);
  
    if (in._UsrLastNameSet) record.put ("UsrLastName", in.UsrLastName);
  
    if (in._UsrPhoneSet) record.put ("UsrPhone", in.UsrPhone);
  
    if (in._UsrExtensionSet) record.put ("UsrExtension", in.UsrExtension);
  
    if (in._UsrDepartmentSet) record.put ("UsrDepartment", in.UsrDepartment);
      return record;
  }
  /** convert SecurityUserObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SecurityUserObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", SecurityUserObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.UsrUserId, in.UsrUserIdSort, in.UsrUserIdSortAscending, in.UsrUserIdFetch, in.UsrUserIdCaseInsensitive);
      if (map != null) record.put ("UsrUserId", map);
      map = DataHelper.filterToMap (in.UsrFirstName, in.UsrFirstNameSort, in.UsrFirstNameSortAscending, in.UsrFirstNameFetch, in.UsrFirstNameCaseInsensitive);
      if (map != null) record.put ("UsrFirstName", map);
      map = DataHelper.filterToMap (in.UsrMiddleName, in.UsrMiddleNameSort, in.UsrMiddleNameSortAscending, in.UsrMiddleNameFetch, in.UsrMiddleNameCaseInsensitive);
      if (map != null) record.put ("UsrMiddleName", map);
      map = DataHelper.filterToMap (in.UsrLastName, in.UsrLastNameSort, in.UsrLastNameSortAscending, in.UsrLastNameFetch, in.UsrLastNameCaseInsensitive);
      if (map != null) record.put ("UsrLastName", map);
      map = DataHelper.filterToMap (in.UsrPhone, in.UsrPhoneSort, in.UsrPhoneSortAscending, in.UsrPhoneFetch, in.UsrPhoneCaseInsensitive);
      if (map != null) record.put ("UsrPhone", map);
      map = DataHelper.filterToMap (in.UsrExtension, in.UsrExtensionSort, in.UsrExtensionSortAscending, in.UsrExtensionFetch, in.UsrExtensionCaseInsensitive);
      if (map != null) record.put ("UsrExtension", map);
      map = DataHelper.filterToMap (in.UsrDepartment, in.UsrDepartmentSort, in.UsrDepartmentSortAscending, in.UsrDepartmentFetch, in.UsrDepartmentCaseInsensitive);
      if (map != null) record.put ("UsrDepartment", map);
    return record;
  }
  /** convert Map to SecurityUserObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityUserObjectData the converted object
   */
  public static SecurityUserObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityUserObjectData out = new SecurityUserObjectData ();

    out.Key = SecurityUserObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("UsrUserId")) != null)
    {
      out.UsrUserId = (String) obj;
    }
  
    if ((obj = record.get ("UsrFirstName")) != null)
    {
      out.UsrFirstName = (String) obj;
    }
  
    if ((obj = record.get ("UsrMiddleName")) != null)
    {
      out.UsrMiddleName = (String) obj;
    }
  
    if ((obj = record.get ("UsrLastName")) != null)
    {
      out.UsrLastName = (String) obj;
    }
  
    if ((obj = record.get ("UsrPhone")) != null)
    {
      out.UsrPhone = (String) obj;
    }
  
    if ((obj = record.get ("UsrExtension")) != null)
    {
      out.UsrExtension = (String) obj;
    }
  
    if ((obj = record.get ("UsrDepartment")) != null)
    {
      out.UsrDepartment = (String) obj;
    }
      return out;
  }
  /** convert Map to SecurityUserObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityUserObjectFilter the converted object
   */
  public static SecurityUserObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityUserObjectFilter out = new SecurityUserObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = SecurityUserObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map UsrUserIdMap = (Map)record.get("UsrUserId");
    Boolean UsrUserIdFetch = DataHelper.getFetch(UsrUserIdMap);
    Boolean UsrUserIdSortDir = DataHelper.getSortDirection(UsrUserIdMap);
    Integer UsrUserIdSortOrder = DataHelper.getSortOrder(UsrUserIdMap);
    if (UsrUserIdFetch != null) out.setUsrUserIdFetch(UsrUserIdFetch);
    if (UsrUserIdSortDir != null) out.setUsrUserIdSortDirection(UsrUserIdSortDir);
    if (UsrUserIdSortOrder != null) out.setUsrUserIdSortOrder(UsrUserIdSortOrder);

    Filter[] UsrUserIdFilter = DataHelper.mapToFilterArray(UsrUserIdMap, String.class);
    if (UsrUserIdFilter != null) {
      StringFilter[] UsrUserIdFilters = new StringFilter[UsrUserIdFilter.length];
      for (int i = 0; i < UsrUserIdFilters.length; i++) {
        UsrUserIdFilters[i] = (StringFilter)UsrUserIdFilter[i];
      }
      try {
        out.setUsrUserIdFilter(UsrUserIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsrFirstNameMap = (Map)record.get("UsrFirstName");
    Boolean UsrFirstNameFetch = DataHelper.getFetch(UsrFirstNameMap);
    Boolean UsrFirstNameSortDir = DataHelper.getSortDirection(UsrFirstNameMap);
    Integer UsrFirstNameSortOrder = DataHelper.getSortOrder(UsrFirstNameMap);
    if (UsrFirstNameFetch != null) out.setUsrFirstNameFetch(UsrFirstNameFetch);
    if (UsrFirstNameSortDir != null) out.setUsrFirstNameSortDirection(UsrFirstNameSortDir);
    if (UsrFirstNameSortOrder != null) out.setUsrFirstNameSortOrder(UsrFirstNameSortOrder);

    Filter[] UsrFirstNameFilter = DataHelper.mapToFilterArray(UsrFirstNameMap, String.class);
    if (UsrFirstNameFilter != null) {
      StringFilter[] UsrFirstNameFilters = new StringFilter[UsrFirstNameFilter.length];
      for (int i = 0; i < UsrFirstNameFilters.length; i++) {
        UsrFirstNameFilters[i] = (StringFilter)UsrFirstNameFilter[i];
      }
      try {
        out.setUsrFirstNameFilter(UsrFirstNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsrMiddleNameMap = (Map)record.get("UsrMiddleName");
    Boolean UsrMiddleNameFetch = DataHelper.getFetch(UsrMiddleNameMap);
    Boolean UsrMiddleNameSortDir = DataHelper.getSortDirection(UsrMiddleNameMap);
    Integer UsrMiddleNameSortOrder = DataHelper.getSortOrder(UsrMiddleNameMap);
    if (UsrMiddleNameFetch != null) out.setUsrMiddleNameFetch(UsrMiddleNameFetch);
    if (UsrMiddleNameSortDir != null) out.setUsrMiddleNameSortDirection(UsrMiddleNameSortDir);
    if (UsrMiddleNameSortOrder != null) out.setUsrMiddleNameSortOrder(UsrMiddleNameSortOrder);

    Filter[] UsrMiddleNameFilter = DataHelper.mapToFilterArray(UsrMiddleNameMap, String.class);
    if (UsrMiddleNameFilter != null) {
      StringFilter[] UsrMiddleNameFilters = new StringFilter[UsrMiddleNameFilter.length];
      for (int i = 0; i < UsrMiddleNameFilters.length; i++) {
        UsrMiddleNameFilters[i] = (StringFilter)UsrMiddleNameFilter[i];
      }
      try {
        out.setUsrMiddleNameFilter(UsrMiddleNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsrLastNameMap = (Map)record.get("UsrLastName");
    Boolean UsrLastNameFetch = DataHelper.getFetch(UsrLastNameMap);
    Boolean UsrLastNameSortDir = DataHelper.getSortDirection(UsrLastNameMap);
    Integer UsrLastNameSortOrder = DataHelper.getSortOrder(UsrLastNameMap);
    if (UsrLastNameFetch != null) out.setUsrLastNameFetch(UsrLastNameFetch);
    if (UsrLastNameSortDir != null) out.setUsrLastNameSortDirection(UsrLastNameSortDir);
    if (UsrLastNameSortOrder != null) out.setUsrLastNameSortOrder(UsrLastNameSortOrder);

    Filter[] UsrLastNameFilter = DataHelper.mapToFilterArray(UsrLastNameMap, String.class);
    if (UsrLastNameFilter != null) {
      StringFilter[] UsrLastNameFilters = new StringFilter[UsrLastNameFilter.length];
      for (int i = 0; i < UsrLastNameFilters.length; i++) {
        UsrLastNameFilters[i] = (StringFilter)UsrLastNameFilter[i];
      }
      try {
        out.setUsrLastNameFilter(UsrLastNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsrPhoneMap = (Map)record.get("UsrPhone");
    Boolean UsrPhoneFetch = DataHelper.getFetch(UsrPhoneMap);
    Boolean UsrPhoneSortDir = DataHelper.getSortDirection(UsrPhoneMap);
    Integer UsrPhoneSortOrder = DataHelper.getSortOrder(UsrPhoneMap);
    if (UsrPhoneFetch != null) out.setUsrPhoneFetch(UsrPhoneFetch);
    if (UsrPhoneSortDir != null) out.setUsrPhoneSortDirection(UsrPhoneSortDir);
    if (UsrPhoneSortOrder != null) out.setUsrPhoneSortOrder(UsrPhoneSortOrder);

    Filter[] UsrPhoneFilter = DataHelper.mapToFilterArray(UsrPhoneMap, String.class);
    if (UsrPhoneFilter != null) {
      StringFilter[] UsrPhoneFilters = new StringFilter[UsrPhoneFilter.length];
      for (int i = 0; i < UsrPhoneFilters.length; i++) {
        UsrPhoneFilters[i] = (StringFilter)UsrPhoneFilter[i];
      }
      try {
        out.setUsrPhoneFilter(UsrPhoneFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsrExtensionMap = (Map)record.get("UsrExtension");
    Boolean UsrExtensionFetch = DataHelper.getFetch(UsrExtensionMap);
    Boolean UsrExtensionSortDir = DataHelper.getSortDirection(UsrExtensionMap);
    Integer UsrExtensionSortOrder = DataHelper.getSortOrder(UsrExtensionMap);
    if (UsrExtensionFetch != null) out.setUsrExtensionFetch(UsrExtensionFetch);
    if (UsrExtensionSortDir != null) out.setUsrExtensionSortDirection(UsrExtensionSortDir);
    if (UsrExtensionSortOrder != null) out.setUsrExtensionSortOrder(UsrExtensionSortOrder);

    Filter[] UsrExtensionFilter = DataHelper.mapToFilterArray(UsrExtensionMap, String.class);
    if (UsrExtensionFilter != null) {
      StringFilter[] UsrExtensionFilters = new StringFilter[UsrExtensionFilter.length];
      for (int i = 0; i < UsrExtensionFilters.length; i++) {
        UsrExtensionFilters[i] = (StringFilter)UsrExtensionFilter[i];
      }
      try {
        out.setUsrExtensionFilter(UsrExtensionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UsrDepartmentMap = (Map)record.get("UsrDepartment");
    Boolean UsrDepartmentFetch = DataHelper.getFetch(UsrDepartmentMap);
    Boolean UsrDepartmentSortDir = DataHelper.getSortDirection(UsrDepartmentMap);
    Integer UsrDepartmentSortOrder = DataHelper.getSortOrder(UsrDepartmentMap);
    if (UsrDepartmentFetch != null) out.setUsrDepartmentFetch(UsrDepartmentFetch);
    if (UsrDepartmentSortDir != null) out.setUsrDepartmentSortDirection(UsrDepartmentSortDir);
    if (UsrDepartmentSortOrder != null) out.setUsrDepartmentSortOrder(UsrDepartmentSortOrder);

    Filter[] UsrDepartmentFilter = DataHelper.mapToFilterArray(UsrDepartmentMap, String.class);
    if (UsrDepartmentFilter != null) {
      StringFilter[] UsrDepartmentFilters = new StringFilter[UsrDepartmentFilter.length];
      for (int i = 0; i < UsrDepartmentFilters.length; i++) {
        UsrDepartmentFilters[i] = (StringFilter)UsrDepartmentFilter[i];
      }
      try {
        out.setUsrDepartmentFilter(UsrDepartmentFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
