/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServicePricingPlanObjectKeyHelper.java
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

/** Helper class for ServicePricingPlanObject's Key objects. */
public class ServicePricingPlanObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ServicePricingPlanObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServicePricingPlanObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServicePricingPlanObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServicePricingPlanObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServicePricingPlanObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServicePricingPlanObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ServicePricingPlanObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServicePricingPlanObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServicePricingPlanObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServicePricingPlanObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServicePricingPlanObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServicePricingPlanObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServicePricingPlanObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ServicePricingPlanObjectKeyData the converted object
   */
  public static ServicePricingPlanObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServicePricingPlanObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServicePricingPlanObject")
   * @return ServicePricingPlanObjectKeyData the converted object
   */
  public static ServicePricingPlanObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServicePricingPlanObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServicePricingPlanObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ServicePricingPlanObjectKeyFilter the converted object
   */
  public static ServicePricingPlanObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServicePricingPlanObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServicePricingPlanObject")
   * @return ServicePricingPlanObjectKeyFilter the converted object
   */
  public static ServicePricingPlanObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServicePricingPlanObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ServicePricingPlanObjectKeyData to a Map (not including the root).
  /** convert ServicePricingPlanObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServicePricingPlanObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._EmfConfigIdSet) record.put ("EmfConfigId", in.EmfConfigId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert ServicePricingPlanObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServicePricingPlanObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.EmfConfigId, in.EmfConfigIdSort, in.EmfConfigIdSortAscending, in.EmfConfigIdFetch);
      if (map != null) record.put ("EmfConfigId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to ServicePricingPlanObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServicePricingPlanObjectKeyData the converted object
   */
  public static ServicePricingPlanObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServicePricingPlanObjectKeyData out = new ServicePricingPlanObjectKeyData ();

    if ((obj = record.get ("EmfConfigId")) != null)
    {
      out.EmfConfigId = (Integer) obj;
      out._EmfConfigIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to ServicePricingPlanObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServicePricingPlanObjectKeyFilter the converted object
   */
  public static ServicePricingPlanObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServicePricingPlanObjectKeyFilter out = new ServicePricingPlanObjectKeyFilter ();

    Map EmfConfigIdMap = (Map)record.get("EmfConfigId");
    Boolean EmfConfigIdFetch = DataHelper.getFetch(EmfConfigIdMap);
    Boolean EmfConfigIdSortDir = DataHelper.getSortDirection(EmfConfigIdMap);
    Integer EmfConfigIdSortOrder = DataHelper.getSortOrder(EmfConfigIdMap);
    if (EmfConfigIdFetch != null) out.setEmfConfigIdFetch(EmfConfigIdFetch);
    if (EmfConfigIdSortDir != null) out.setEmfConfigIdSortDirection(EmfConfigIdSortDir);
    if (EmfConfigIdSortOrder != null) out.setEmfConfigIdSortOrder(EmfConfigIdSortOrder);

    Filter[] EmfConfigIdFilter = DataHelper.mapToFilterArray(EmfConfigIdMap, Integer.class);
    if (EmfConfigIdFilter != null) {
      IntegerFilter[] EmfConfigIdFilters = new IntegerFilter[EmfConfigIdFilter.length];
      for (int i = 0; i < EmfConfigIdFilters.length; i++) {
        EmfConfigIdFilters[i] = (IntegerFilter)EmfConfigIdFilter[i];
      }
      try {
        out.setEmfConfigIdFilter(EmfConfigIdFilters);
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
