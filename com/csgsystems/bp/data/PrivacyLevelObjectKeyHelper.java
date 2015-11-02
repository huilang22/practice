/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrivacyLevelObjectKeyHelper.java
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

/** Helper class for PrivacyLevelObject's Key objects. */
public class PrivacyLevelObjectKeyHelper implements ArubaObjectHelper
{
  /** convert PrivacyLevelObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PrivacyLevelObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PrivacyLevelObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PrivacyLevelObject")
   * @return Map     the output Map
   */
  public static Map toMap (PrivacyLevelObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PrivacyLevelObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert PrivacyLevelObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PrivacyLevelObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PrivacyLevelObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PrivacyLevelObject")
   * @return Map     the output Map
   */
  public static Map toMap (PrivacyLevelObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PrivacyLevelObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PrivacyLevelObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return PrivacyLevelObjectKeyData the converted object
   */
  public static PrivacyLevelObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PrivacyLevelObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PrivacyLevelObject")
   * @return PrivacyLevelObjectKeyData the converted object
   */
  public static PrivacyLevelObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PrivacyLevelObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PrivacyLevelObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return PrivacyLevelObjectKeyFilter the converted object
   */
  public static PrivacyLevelObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PrivacyLevelObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PrivacyLevelObject")
   * @return PrivacyLevelObjectKeyFilter the converted object
   */
  public static PrivacyLevelObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PrivacyLevelObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert PrivacyLevelObjectKeyData to a Map (not including the root).
  /** convert PrivacyLevelObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PrivacyLevelObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._LevelSet) record.put ("Level", in.Level);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert PrivacyLevelObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PrivacyLevelObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.Level, in.LevelSort, in.LevelSortAscending, in.LevelFetch);
      if (map != null) record.put ("Level", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to PrivacyLevelObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PrivacyLevelObjectKeyData the converted object
   */
  public static PrivacyLevelObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PrivacyLevelObjectKeyData out = new PrivacyLevelObjectKeyData ();

    if ((obj = record.get ("Level")) != null)
    {
      out.Level = (Integer) obj;
      out._LevelSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to PrivacyLevelObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PrivacyLevelObjectKeyFilter the converted object
   */
  public static PrivacyLevelObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PrivacyLevelObjectKeyFilter out = new PrivacyLevelObjectKeyFilter ();

    Map LevelMap = (Map)record.get("Level");
    Boolean LevelFetch = DataHelper.getFetch(LevelMap);
    Boolean LevelSortDir = DataHelper.getSortDirection(LevelMap);
    Integer LevelSortOrder = DataHelper.getSortOrder(LevelMap);
    if (LevelFetch != null) out.setLevelFetch(LevelFetch);
    if (LevelSortDir != null) out.setLevelSortDirection(LevelSortDir);
    if (LevelSortOrder != null) out.setLevelSortOrder(LevelSortOrder);

    Filter[] LevelFilter = DataHelper.mapToFilterArray(LevelMap, Integer.class);
    if (LevelFilter != null) {
      IntegerFilter[] LevelFilters = new IntegerFilter[LevelFilter.length];
      for (int i = 0; i < LevelFilters.length; i++) {
        LevelFilters[i] = (IntegerFilter)LevelFilter[i];
      }
      try {
        out.setLevelFilter(LevelFilters);
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
