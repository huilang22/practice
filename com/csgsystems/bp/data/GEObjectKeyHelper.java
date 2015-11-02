/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GEObjectKeyHelper.java
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

/** Helper class for GEObject's Key objects. */
public class GEObjectKeyHelper implements ArubaObjectHelper
{
  /** convert GEObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GEObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GEObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GEObject")
   * @return Map     the output Map
   */
  public static Map toMap (GEObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GEObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert GEObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GEObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GEObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GEObject")
   * @return Map     the output Map
   */
  public static Map toMap (GEObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GEObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GEObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return GEObjectKeyData the converted object
   */
  public static GEObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GEObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GEObject")
   * @return GEObjectKeyData the converted object
   */
  public static GEObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GEObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GEObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return GEObjectKeyFilter the converted object
   */
  public static GEObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GEObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GEObject")
   * @return GEObjectKeyFilter the converted object
   */
  public static GEObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GEObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert GEObjectKeyData to a Map (not including the root).
  /** convert GEObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GEObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._EnumerationKeySet) record.put ("EnumerationKey", in.EnumerationKey);
  
    if (in._ValueSet) record.put ("Value", in.Value);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert GEObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GEObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.EnumerationKey, in.EnumerationKeySort, in.EnumerationKeySortAscending, in.EnumerationKeyFetch, in.EnumerationKeyCaseInsensitive);
      if (map != null) record.put ("EnumerationKey", map);
      map = DataHelper.filterToMap (in.Value, in.ValueSort, in.ValueSortAscending, in.ValueFetch, in.ValueCaseInsensitive);
      if (map != null) record.put ("Value", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to GEObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GEObjectKeyData the converted object
   */
  public static GEObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GEObjectKeyData out = new GEObjectKeyData ();

    if ((obj = record.get ("EnumerationKey")) != null)
    {
      out.EnumerationKey = (String) obj;
      out._EnumerationKeySet = true;
    }
  
    if ((obj = record.get ("Value")) != null)
    {
      out.Value = (String) obj;
      out._ValueSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to GEObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GEObjectKeyFilter the converted object
   */
  public static GEObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GEObjectKeyFilter out = new GEObjectKeyFilter ();

    Map EnumerationKeyMap = (Map)record.get("EnumerationKey");
    Boolean EnumerationKeyFetch = DataHelper.getFetch(EnumerationKeyMap);
    Boolean EnumerationKeySortDir = DataHelper.getSortDirection(EnumerationKeyMap);
    Integer EnumerationKeySortOrder = DataHelper.getSortOrder(EnumerationKeyMap);
    if (EnumerationKeyFetch != null) out.setEnumerationKeyFetch(EnumerationKeyFetch);
    if (EnumerationKeySortDir != null) out.setEnumerationKeySortDirection(EnumerationKeySortDir);
    if (EnumerationKeySortOrder != null) out.setEnumerationKeySortOrder(EnumerationKeySortOrder);

    Filter[] EnumerationKeyFilter = DataHelper.mapToFilterArray(EnumerationKeyMap, String.class);
    if (EnumerationKeyFilter != null) {
      StringFilter[] EnumerationKeyFilters = new StringFilter[EnumerationKeyFilter.length];
      for (int i = 0; i < EnumerationKeyFilters.length; i++) {
        EnumerationKeyFilters[i] = (StringFilter)EnumerationKeyFilter[i];
      }
      try {
        out.setEnumerationKeyFilter(EnumerationKeyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ValueMap = (Map)record.get("Value");
    Boolean ValueFetch = DataHelper.getFetch(ValueMap);
    Boolean ValueSortDir = DataHelper.getSortDirection(ValueMap);
    Integer ValueSortOrder = DataHelper.getSortOrder(ValueMap);
    if (ValueFetch != null) out.setValueFetch(ValueFetch);
    if (ValueSortDir != null) out.setValueSortDirection(ValueSortDir);
    if (ValueSortOrder != null) out.setValueSortOrder(ValueSortOrder);

    Filter[] ValueFilter = DataHelper.mapToFilterArray(ValueMap, String.class);
    if (ValueFilter != null) {
      StringFilter[] ValueFilters = new StringFilter[ValueFilter.length];
      for (int i = 0; i < ValueFilters.length; i++) {
        ValueFilters[i] = (StringFilter)ValueFilter[i];
      }
      try {
        out.setValueFilter(ValueFilters);
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
