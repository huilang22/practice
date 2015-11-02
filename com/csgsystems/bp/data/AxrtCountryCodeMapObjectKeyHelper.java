/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtCountryCodeMapObjectKeyHelper.java
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

/** Helper class for AxrtCountryCodeMapObject's Key objects. */
public class AxrtCountryCodeMapObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AxrtCountryCodeMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCountryCodeMapObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtCountryCodeMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtCountryCodeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCountryCodeMapObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtCountryCodeMapObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AxrtCountryCodeMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCountryCodeMapObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtCountryCodeMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtCountryCodeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCountryCodeMapObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtCountryCodeMapObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AxrtCountryCodeMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AxrtCountryCodeMapObjectKeyData the converted object
   */
  public static AxrtCountryCodeMapObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AxrtCountryCodeMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AxrtCountryCodeMapObject")
   * @return AxrtCountryCodeMapObjectKeyData the converted object
   */
  public static AxrtCountryCodeMapObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtCountryCodeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AxrtCountryCodeMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AxrtCountryCodeMapObjectKeyFilter the converted object
   */
  public static AxrtCountryCodeMapObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AxrtCountryCodeMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AxrtCountryCodeMapObject")
   * @return AxrtCountryCodeMapObjectKeyFilter the converted object
   */
  public static AxrtCountryCodeMapObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtCountryCodeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AxrtCountryCodeMapObjectKeyData to a Map (not including the root).
  /** convert AxrtCountryCodeMapObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AxrtCountryCodeMapObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CountryCodeSet) record.put ("CountryCode", in.CountryCode);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert AxrtCountryCodeMapObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AxrtCountryCodeMapObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.CountryCode, in.CountryCodeSort, in.CountryCodeSortAscending, in.CountryCodeFetch);
      if (map != null) record.put ("CountryCode", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to AxrtCountryCodeMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtCountryCodeMapObjectKeyData the converted object
   */
  public static AxrtCountryCodeMapObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtCountryCodeMapObjectKeyData out = new AxrtCountryCodeMapObjectKeyData ();

    if ((obj = record.get ("CountryCode")) != null)
    {
      out.CountryCode = (Integer) obj;
      out._CountryCodeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to AxrtCountryCodeMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtCountryCodeMapObjectKeyFilter the converted object
   */
  public static AxrtCountryCodeMapObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtCountryCodeMapObjectKeyFilter out = new AxrtCountryCodeMapObjectKeyFilter ();

    Map CountryCodeMap = (Map)record.get("CountryCode");
    Boolean CountryCodeFetch = DataHelper.getFetch(CountryCodeMap);
    Boolean CountryCodeSortDir = DataHelper.getSortDirection(CountryCodeMap);
    Integer CountryCodeSortOrder = DataHelper.getSortOrder(CountryCodeMap);
    if (CountryCodeFetch != null) out.setCountryCodeFetch(CountryCodeFetch);
    if (CountryCodeSortDir != null) out.setCountryCodeSortDirection(CountryCodeSortDir);
    if (CountryCodeSortOrder != null) out.setCountryCodeSortOrder(CountryCodeSortOrder);

    Filter[] CountryCodeFilter = DataHelper.mapToFilterArray(CountryCodeMap, Integer.class);
    if (CountryCodeFilter != null) {
      IntegerFilter[] CountryCodeFilters = new IntegerFilter[CountryCodeFilter.length];
      for (int i = 0; i < CountryCodeFilters.length; i++) {
        CountryCodeFilters[i] = (IntegerFilter)CountryCodeFilter[i];
      }
      try {
        out.setCountryCodeFilter(CountryCodeFilters);
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
