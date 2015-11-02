/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TimezoneObjectKeyHelper.java
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

/** Helper class for TimezoneObject's Key objects. */
public class TimezoneObjectKeyHelper implements ArubaObjectHelper
{
  /** convert TimezoneObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TimezoneObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TimezoneObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TimezoneObject")
   * @return Map     the output Map
   */
  public static Map toMap (TimezoneObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TimezoneObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert TimezoneObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TimezoneObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TimezoneObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TimezoneObject")
   * @return Map     the output Map
   */
  public static Map toMap (TimezoneObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TimezoneObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TimezoneObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return TimezoneObjectKeyData the converted object
   */
  public static TimezoneObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TimezoneObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TimezoneObject")
   * @return TimezoneObjectKeyData the converted object
   */
  public static TimezoneObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TimezoneObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TimezoneObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return TimezoneObjectKeyFilter the converted object
   */
  public static TimezoneObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TimezoneObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TimezoneObject")
   * @return TimezoneObjectKeyFilter the converted object
   */
  public static TimezoneObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TimezoneObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert TimezoneObjectKeyData to a Map (not including the root).
  /** convert TimezoneObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TimezoneObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TimezoneCodeSet) record.put ("TimezoneCode", in.TimezoneCode);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert TimezoneObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TimezoneObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TimezoneCode, in.TimezoneCodeSort, in.TimezoneCodeSortAscending, in.TimezoneCodeFetch);
      if (map != null) record.put ("TimezoneCode", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to TimezoneObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TimezoneObjectKeyData the converted object
   */
  public static TimezoneObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TimezoneObjectKeyData out = new TimezoneObjectKeyData ();

    if ((obj = record.get ("TimezoneCode")) != null)
    {
      out.TimezoneCode = (Integer) obj;
      out._TimezoneCodeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to TimezoneObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TimezoneObjectKeyFilter the converted object
   */
  public static TimezoneObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TimezoneObjectKeyFilter out = new TimezoneObjectKeyFilter ();

    Map TimezoneCodeMap = (Map)record.get("TimezoneCode");
    Boolean TimezoneCodeFetch = DataHelper.getFetch(TimezoneCodeMap);
    Boolean TimezoneCodeSortDir = DataHelper.getSortDirection(TimezoneCodeMap);
    Integer TimezoneCodeSortOrder = DataHelper.getSortOrder(TimezoneCodeMap);
    if (TimezoneCodeFetch != null) out.setTimezoneCodeFetch(TimezoneCodeFetch);
    if (TimezoneCodeSortDir != null) out.setTimezoneCodeSortDirection(TimezoneCodeSortDir);
    if (TimezoneCodeSortOrder != null) out.setTimezoneCodeSortOrder(TimezoneCodeSortOrder);

    Filter[] TimezoneCodeFilter = DataHelper.mapToFilterArray(TimezoneCodeMap, Integer.class);
    if (TimezoneCodeFilter != null) {
      IntegerFilter[] TimezoneCodeFilters = new IntegerFilter[TimezoneCodeFilter.length];
      for (int i = 0; i < TimezoneCodeFilters.length; i++) {
        TimezoneCodeFilters[i] = (IntegerFilter)TimezoneCodeFilter[i];
      }
      try {
        out.setTimezoneCodeFilter(TimezoneCodeFilters);
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
