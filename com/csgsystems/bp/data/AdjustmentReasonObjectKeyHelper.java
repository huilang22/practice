/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentReasonObjectKeyHelper.java
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

/** Helper class for AdjustmentReasonObject's Key objects. */
public class AdjustmentReasonObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AdjustmentReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentReasonObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentReasonObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentReasonObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AdjustmentReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentReasonObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentReasonObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentReasonObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AdjustmentReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AdjustmentReasonObjectKeyData the converted object
   */
  public static AdjustmentReasonObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AdjustmentReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AdjustmentReasonObject")
   * @return AdjustmentReasonObjectKeyData the converted object
   */
  public static AdjustmentReasonObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AdjustmentReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AdjustmentReasonObjectKeyFilter the converted object
   */
  public static AdjustmentReasonObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AdjustmentReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AdjustmentReasonObject")
   * @return AdjustmentReasonObjectKeyFilter the converted object
   */
  public static AdjustmentReasonObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AdjustmentReasonObjectKeyData to a Map (not including the root).
  /** convert AdjustmentReasonObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AdjustmentReasonObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AdjReasonCodeSet) record.put ("AdjReasonCode", in.AdjReasonCode);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert AdjustmentReasonObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AdjustmentReasonObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AdjReasonCode, in.AdjReasonCodeSort, in.AdjReasonCodeSortAscending, in.AdjReasonCodeFetch);
      if (map != null) record.put ("AdjReasonCode", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to AdjustmentReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentReasonObjectKeyData the converted object
   */
  public static AdjustmentReasonObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentReasonObjectKeyData out = new AdjustmentReasonObjectKeyData ();

    if ((obj = record.get ("AdjReasonCode")) != null)
    {
      out.AdjReasonCode = (Integer) obj;
      out._AdjReasonCodeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to AdjustmentReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentReasonObjectKeyFilter the converted object
   */
  public static AdjustmentReasonObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentReasonObjectKeyFilter out = new AdjustmentReasonObjectKeyFilter ();

    Map AdjReasonCodeMap = (Map)record.get("AdjReasonCode");
    Boolean AdjReasonCodeFetch = DataHelper.getFetch(AdjReasonCodeMap);
    Boolean AdjReasonCodeSortDir = DataHelper.getSortDirection(AdjReasonCodeMap);
    Integer AdjReasonCodeSortOrder = DataHelper.getSortOrder(AdjReasonCodeMap);
    if (AdjReasonCodeFetch != null) out.setAdjReasonCodeFetch(AdjReasonCodeFetch);
    if (AdjReasonCodeSortDir != null) out.setAdjReasonCodeSortDirection(AdjReasonCodeSortDir);
    if (AdjReasonCodeSortOrder != null) out.setAdjReasonCodeSortOrder(AdjReasonCodeSortOrder);

    Filter[] AdjReasonCodeFilter = DataHelper.mapToFilterArray(AdjReasonCodeMap, Integer.class);
    if (AdjReasonCodeFilter != null) {
      IntegerFilter[] AdjReasonCodeFilters = new IntegerFilter[AdjReasonCodeFilter.length];
      for (int i = 0; i < AdjReasonCodeFilters.length; i++) {
        AdjReasonCodeFilters[i] = (IntegerFilter)AdjReasonCodeFilter[i];
      }
      try {
        out.setAdjReasonCodeFilter(AdjReasonCodeFilters);
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
