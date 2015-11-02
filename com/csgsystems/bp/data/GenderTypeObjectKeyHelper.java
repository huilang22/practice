/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GenderTypeObjectKeyHelper.java
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

/** Helper class for GenderTypeObject's Key objects. */
public class GenderTypeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert GenderTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GenderTypeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GenderTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GenderTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (GenderTypeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GenderTypeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert GenderTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GenderTypeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GenderTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GenderTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (GenderTypeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GenderTypeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GenderTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return GenderTypeObjectKeyData the converted object
   */
  public static GenderTypeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GenderTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GenderTypeObject")
   * @return GenderTypeObjectKeyData the converted object
   */
  public static GenderTypeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GenderTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GenderTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return GenderTypeObjectKeyFilter the converted object
   */
  public static GenderTypeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GenderTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GenderTypeObject")
   * @return GenderTypeObjectKeyFilter the converted object
   */
  public static GenderTypeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GenderTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert GenderTypeObjectKeyData to a Map (not including the root).
  /** convert GenderTypeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GenderTypeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._GenderSet) record.put ("Gender", in.Gender);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert GenderTypeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GenderTypeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.Gender, in.GenderSort, in.GenderSortAscending, in.GenderFetch);
      if (map != null) record.put ("Gender", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to GenderTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GenderTypeObjectKeyData the converted object
   */
  public static GenderTypeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GenderTypeObjectKeyData out = new GenderTypeObjectKeyData ();

    if ((obj = record.get ("Gender")) != null)
    {
      out.Gender = (Integer) obj;
      out._GenderSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to GenderTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GenderTypeObjectKeyFilter the converted object
   */
  public static GenderTypeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GenderTypeObjectKeyFilter out = new GenderTypeObjectKeyFilter ();

    Map GenderMap = (Map)record.get("Gender");
    Boolean GenderFetch = DataHelper.getFetch(GenderMap);
    Boolean GenderSortDir = DataHelper.getSortDirection(GenderMap);
    Integer GenderSortOrder = DataHelper.getSortOrder(GenderMap);
    if (GenderFetch != null) out.setGenderFetch(GenderFetch);
    if (GenderSortDir != null) out.setGenderSortDirection(GenderSortDir);
    if (GenderSortOrder != null) out.setGenderSortOrder(GenderSortOrder);

    Filter[] GenderFilter = DataHelper.mapToFilterArray(GenderMap, Integer.class);
    if (GenderFilter != null) {
      IntegerFilter[] GenderFilters = new IntegerFilter[GenderFilter.length];
      for (int i = 0; i < GenderFilters.length; i++) {
        GenderFilters[i] = (IntegerFilter)GenderFilter[i];
      }
      try {
        out.setGenderFilter(GenderFilters);
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
