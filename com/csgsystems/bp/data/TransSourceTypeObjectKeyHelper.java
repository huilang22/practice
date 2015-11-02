/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TransSourceTypeObjectKeyHelper.java
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

/** Helper class for TransSourceTypeObject's Key objects. */
public class TransSourceTypeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert TransSourceTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TransSourceTypeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TransSourceTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TransSourceTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (TransSourceTypeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TransSourceTypeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert TransSourceTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TransSourceTypeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TransSourceTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TransSourceTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (TransSourceTypeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TransSourceTypeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TransSourceTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return TransSourceTypeObjectKeyData the converted object
   */
  public static TransSourceTypeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TransSourceTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TransSourceTypeObject")
   * @return TransSourceTypeObjectKeyData the converted object
   */
  public static TransSourceTypeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TransSourceTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TransSourceTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return TransSourceTypeObjectKeyFilter the converted object
   */
  public static TransSourceTypeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TransSourceTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TransSourceTypeObject")
   * @return TransSourceTypeObjectKeyFilter the converted object
   */
  public static TransSourceTypeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TransSourceTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert TransSourceTypeObjectKeyData to a Map (not including the root).
  /** convert TransSourceTypeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TransSourceTypeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TransSourceSet) record.put ("TransSource", in.TransSource);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert TransSourceTypeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TransSourceTypeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TransSource, in.TransSourceSort, in.TransSourceSortAscending, in.TransSourceFetch);
      if (map != null) record.put ("TransSource", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to TransSourceTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TransSourceTypeObjectKeyData the converted object
   */
  public static TransSourceTypeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TransSourceTypeObjectKeyData out = new TransSourceTypeObjectKeyData ();

    if ((obj = record.get ("TransSource")) != null)
    {
      out.TransSource = (Integer) obj;
      out._TransSourceSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to TransSourceTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TransSourceTypeObjectKeyFilter the converted object
   */
  public static TransSourceTypeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TransSourceTypeObjectKeyFilter out = new TransSourceTypeObjectKeyFilter ();

    Map TransSourceMap = (Map)record.get("TransSource");
    Boolean TransSourceFetch = DataHelper.getFetch(TransSourceMap);
    Boolean TransSourceSortDir = DataHelper.getSortDirection(TransSourceMap);
    Integer TransSourceSortOrder = DataHelper.getSortOrder(TransSourceMap);
    if (TransSourceFetch != null) out.setTransSourceFetch(TransSourceFetch);
    if (TransSourceSortDir != null) out.setTransSourceSortDirection(TransSourceSortDir);
    if (TransSourceSortOrder != null) out.setTransSourceSortOrder(TransSourceSortOrder);

    Filter[] TransSourceFilter = DataHelper.mapToFilterArray(TransSourceMap, Integer.class);
    if (TransSourceFilter != null) {
      IntegerFilter[] TransSourceFilters = new IntegerFilter[TransSourceFilter.length];
      for (int i = 0; i < TransSourceFilters.length; i++) {
        TransSourceFilters[i] = (IntegerFilter)TransSourceFilter[i];
      }
      try {
        out.setTransSourceFilter(TransSourceFilters);
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
