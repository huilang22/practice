/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentTypeObjectKeyHelper.java
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

/** Helper class for AdjustmentTypeObject's Key objects. */
public class AdjustmentTypeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AdjustmentTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTypeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTypeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentTypeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AdjustmentTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTypeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTypeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentTypeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AdjustmentTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AdjustmentTypeObjectKeyData the converted object
   */
  public static AdjustmentTypeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AdjustmentTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AdjustmentTypeObject")
   * @return AdjustmentTypeObjectKeyData the converted object
   */
  public static AdjustmentTypeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AdjustmentTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AdjustmentTypeObjectKeyFilter the converted object
   */
  public static AdjustmentTypeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AdjustmentTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AdjustmentTypeObject")
   * @return AdjustmentTypeObjectKeyFilter the converted object
   */
  public static AdjustmentTypeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AdjustmentTypeObjectKeyData to a Map (not including the root).
  /** convert AdjustmentTypeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AdjustmentTypeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TransCodeSet) record.put ("TransCode", in.TransCode);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert AdjustmentTypeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AdjustmentTypeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TransCode, in.TransCodeSort, in.TransCodeSortAscending, in.TransCodeFetch);
      if (map != null) record.put ("TransCode", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to AdjustmentTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentTypeObjectKeyData the converted object
   */
  public static AdjustmentTypeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentTypeObjectKeyData out = new AdjustmentTypeObjectKeyData ();

    if ((obj = record.get ("TransCode")) != null)
    {
      out.TransCode = (Integer) obj;
      out._TransCodeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to AdjustmentTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentTypeObjectKeyFilter the converted object
   */
  public static AdjustmentTypeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentTypeObjectKeyFilter out = new AdjustmentTypeObjectKeyFilter ();

    Map TransCodeMap = (Map)record.get("TransCode");
    Boolean TransCodeFetch = DataHelper.getFetch(TransCodeMap);
    Boolean TransCodeSortDir = DataHelper.getSortDirection(TransCodeMap);
    Integer TransCodeSortOrder = DataHelper.getSortOrder(TransCodeMap);
    if (TransCodeFetch != null) out.setTransCodeFetch(TransCodeFetch);
    if (TransCodeSortDir != null) out.setTransCodeSortDirection(TransCodeSortDir);
    if (TransCodeSortOrder != null) out.setTransCodeSortOrder(TransCodeSortOrder);

    Filter[] TransCodeFilter = DataHelper.mapToFilterArray(TransCodeMap, Integer.class);
    if (TransCodeFilter != null) {
      IntegerFilter[] TransCodeFilters = new IntegerFilter[TransCodeFilter.length];
      for (int i = 0; i < TransCodeFilters.length; i++) {
        TransCodeFilters[i] = (IntegerFilter)TransCodeFilter[i];
      }
      try {
        out.setTransCodeFilter(TransCodeFilters);
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
