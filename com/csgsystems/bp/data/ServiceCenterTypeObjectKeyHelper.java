/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceCenterTypeObjectKeyHelper.java
 * Definition File: Admin/.xml
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

/** Helper class for ServiceCenterTypeObject's Key objects. */
public class ServiceCenterTypeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ServiceCenterTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterTypeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceCenterTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceCenterTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterTypeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceCenterTypeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ServiceCenterTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterTypeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceCenterTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceCenterTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterTypeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceCenterTypeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServiceCenterTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ServiceCenterTypeObjectKeyData the converted object
   */
  public static ServiceCenterTypeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServiceCenterTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServiceCenterTypeObject")
   * @return ServiceCenterTypeObjectKeyData the converted object
   */
  public static ServiceCenterTypeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceCenterTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServiceCenterTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ServiceCenterTypeObjectKeyFilter the converted object
   */
  public static ServiceCenterTypeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServiceCenterTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServiceCenterTypeObject")
   * @return ServiceCenterTypeObjectKeyFilter the converted object
   */
  public static ServiceCenterTypeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceCenterTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ServiceCenterTypeObjectKeyData to a Map (not including the root).
  /** convert ServiceCenterTypeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServiceCenterTypeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ServiceCenterIdSet) record.put ("ServiceCenterId", in.ServiceCenterId);
  
    if (in._ServiceCenterTypeSet) record.put ("ServiceCenterType", in.ServiceCenterType);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert ServiceCenterTypeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServiceCenterTypeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ServiceCenterId, in.ServiceCenterIdSort, in.ServiceCenterIdSortAscending, in.ServiceCenterIdFetch);
      if (map != null) record.put ("ServiceCenterId", map);
      map = DataHelper.filterToMap (in.ServiceCenterType, in.ServiceCenterTypeSort, in.ServiceCenterTypeSortAscending, in.ServiceCenterTypeFetch);
      if (map != null) record.put ("ServiceCenterType", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to ServiceCenterTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceCenterTypeObjectKeyData the converted object
   */
  public static ServiceCenterTypeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceCenterTypeObjectKeyData out = new ServiceCenterTypeObjectKeyData ();

    if ((obj = record.get ("ServiceCenterId")) != null)
    {
      out.ServiceCenterId = (Integer) obj;
      out._ServiceCenterIdSet = true;
    }
  
    if ((obj = record.get ("ServiceCenterType")) != null)
    {
      out.ServiceCenterType = (Integer) obj;
      out._ServiceCenterTypeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to ServiceCenterTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceCenterTypeObjectKeyFilter the converted object
   */
  public static ServiceCenterTypeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceCenterTypeObjectKeyFilter out = new ServiceCenterTypeObjectKeyFilter ();

    Map ServiceCenterIdMap = (Map)record.get("ServiceCenterId");
    Boolean ServiceCenterIdFetch = DataHelper.getFetch(ServiceCenterIdMap);
    Boolean ServiceCenterIdSortDir = DataHelper.getSortDirection(ServiceCenterIdMap);
    Integer ServiceCenterIdSortOrder = DataHelper.getSortOrder(ServiceCenterIdMap);
    if (ServiceCenterIdFetch != null) out.setServiceCenterIdFetch(ServiceCenterIdFetch);
    if (ServiceCenterIdSortDir != null) out.setServiceCenterIdSortDirection(ServiceCenterIdSortDir);
    if (ServiceCenterIdSortOrder != null) out.setServiceCenterIdSortOrder(ServiceCenterIdSortOrder);

    Filter[] ServiceCenterIdFilter = DataHelper.mapToFilterArray(ServiceCenterIdMap, Integer.class);
    if (ServiceCenterIdFilter != null) {
      IntegerFilter[] ServiceCenterIdFilters = new IntegerFilter[ServiceCenterIdFilter.length];
      for (int i = 0; i < ServiceCenterIdFilters.length; i++) {
        ServiceCenterIdFilters[i] = (IntegerFilter)ServiceCenterIdFilter[i];
      }
      try {
        out.setServiceCenterIdFilter(ServiceCenterIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceCenterTypeMap = (Map)record.get("ServiceCenterType");
    Boolean ServiceCenterTypeFetch = DataHelper.getFetch(ServiceCenterTypeMap);
    Boolean ServiceCenterTypeSortDir = DataHelper.getSortDirection(ServiceCenterTypeMap);
    Integer ServiceCenterTypeSortOrder = DataHelper.getSortOrder(ServiceCenterTypeMap);
    if (ServiceCenterTypeFetch != null) out.setServiceCenterTypeFetch(ServiceCenterTypeFetch);
    if (ServiceCenterTypeSortDir != null) out.setServiceCenterTypeSortDirection(ServiceCenterTypeSortDir);
    if (ServiceCenterTypeSortOrder != null) out.setServiceCenterTypeSortOrder(ServiceCenterTypeSortOrder);

    Filter[] ServiceCenterTypeFilter = DataHelper.mapToFilterArray(ServiceCenterTypeMap, Integer.class);
    if (ServiceCenterTypeFilter != null) {
      IntegerFilter[] ServiceCenterTypeFilters = new IntegerFilter[ServiceCenterTypeFilter.length];
      for (int i = 0; i < ServiceCenterTypeFilters.length; i++) {
        ServiceCenterTypeFilters[i] = (IntegerFilter)ServiceCenterTypeFilter[i];
      }
      try {
        out.setServiceCenterTypeFilter(ServiceCenterTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, Integer.class);
    if (LanguageCodeFilter != null) {
      IntegerFilter[] LanguageCodeFilters = new IntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (IntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
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
