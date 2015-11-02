/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SCObjectKeyHelper.java
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

/** Helper class for SCObject's Key objects. */
public class SCObjectKeyHelper implements ArubaObjectHelper
{
  /** convert SCObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SCObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SCObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SCObject")
   * @return Map     the output Map
   */
  public static Map toMap (SCObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SCObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert SCObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SCObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SCObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SCObject")
   * @return Map     the output Map
   */
  public static Map toMap (SCObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SCObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SCObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return SCObjectKeyData the converted object
   */
  public static SCObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SCObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SCObject")
   * @return SCObjectKeyData the converted object
   */
  public static SCObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SCObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SCObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return SCObjectKeyFilter the converted object
   */
  public static SCObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SCObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SCObject")
   * @return SCObjectKeyFilter the converted object
   */
  public static SCObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SCObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert SCObjectKeyData to a Map (not including the root).
  /** convert SCObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SCObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ServerCategorySet) record.put ("ServerCategory", in.ServerCategory);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert SCObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SCObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ServerCategory, in.ServerCategorySort, in.ServerCategorySortAscending, in.ServerCategoryFetch);
      if (map != null) record.put ("ServerCategory", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to SCObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SCObjectKeyData the converted object
   */
  public static SCObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SCObjectKeyData out = new SCObjectKeyData ();

    if ((obj = record.get ("ServerCategory")) != null)
    {
      out.ServerCategory = (Integer) obj;
      out._ServerCategorySet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to SCObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SCObjectKeyFilter the converted object
   */
  public static SCObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SCObjectKeyFilter out = new SCObjectKeyFilter ();

    Map ServerCategoryMap = (Map)record.get("ServerCategory");
    Boolean ServerCategoryFetch = DataHelper.getFetch(ServerCategoryMap);
    Boolean ServerCategorySortDir = DataHelper.getSortDirection(ServerCategoryMap);
    Integer ServerCategorySortOrder = DataHelper.getSortOrder(ServerCategoryMap);
    if (ServerCategoryFetch != null) out.setServerCategoryFetch(ServerCategoryFetch);
    if (ServerCategorySortDir != null) out.setServerCategorySortDirection(ServerCategorySortDir);
    if (ServerCategorySortOrder != null) out.setServerCategorySortOrder(ServerCategorySortOrder);

    Filter[] ServerCategoryFilter = DataHelper.mapToFilterArray(ServerCategoryMap, Integer.class);
    if (ServerCategoryFilter != null) {
      IntegerFilter[] ServerCategoryFilters = new IntegerFilter[ServerCategoryFilter.length];
      for (int i = 0; i < ServerCategoryFilters.length; i++) {
        ServerCategoryFilters[i] = (IntegerFilter)ServerCategoryFilter[i];
      }
      try {
        out.setServerCategoryFilter(ServerCategoryFilters);
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
