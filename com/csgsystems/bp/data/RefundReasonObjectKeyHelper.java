/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RefundReasonObjectKeyHelper.java
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

/** Helper class for RefundReasonObject's Key objects. */
public class RefundReasonObjectKeyHelper implements ArubaObjectHelper
{
  /** convert RefundReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RefundReasonObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RefundReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RefundReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (RefundReasonObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RefundReasonObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert RefundReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RefundReasonObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RefundReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RefundReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (RefundReasonObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RefundReasonObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RefundReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return RefundReasonObjectKeyData the converted object
   */
  public static RefundReasonObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RefundReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RefundReasonObject")
   * @return RefundReasonObjectKeyData the converted object
   */
  public static RefundReasonObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RefundReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RefundReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return RefundReasonObjectKeyFilter the converted object
   */
  public static RefundReasonObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RefundReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RefundReasonObject")
   * @return RefundReasonObjectKeyFilter the converted object
   */
  public static RefundReasonObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RefundReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert RefundReasonObjectKeyData to a Map (not including the root).
  /** convert RefundReasonObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RefundReasonObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ReasonCodeSet) record.put ("ReasonCode", in.ReasonCode);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert RefundReasonObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RefundReasonObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ReasonCode, in.ReasonCodeSort, in.ReasonCodeSortAscending, in.ReasonCodeFetch);
      if (map != null) record.put ("ReasonCode", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to RefundReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RefundReasonObjectKeyData the converted object
   */
  public static RefundReasonObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RefundReasonObjectKeyData out = new RefundReasonObjectKeyData ();

    if ((obj = record.get ("ReasonCode")) != null)
    {
      out.ReasonCode = (Integer) obj;
      out._ReasonCodeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to RefundReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RefundReasonObjectKeyFilter the converted object
   */
  public static RefundReasonObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RefundReasonObjectKeyFilter out = new RefundReasonObjectKeyFilter ();

    Map ReasonCodeMap = (Map)record.get("ReasonCode");
    Boolean ReasonCodeFetch = DataHelper.getFetch(ReasonCodeMap);
    Boolean ReasonCodeSortDir = DataHelper.getSortDirection(ReasonCodeMap);
    Integer ReasonCodeSortOrder = DataHelper.getSortOrder(ReasonCodeMap);
    if (ReasonCodeFetch != null) out.setReasonCodeFetch(ReasonCodeFetch);
    if (ReasonCodeSortDir != null) out.setReasonCodeSortDirection(ReasonCodeSortDir);
    if (ReasonCodeSortOrder != null) out.setReasonCodeSortOrder(ReasonCodeSortOrder);

    Filter[] ReasonCodeFilter = DataHelper.mapToFilterArray(ReasonCodeMap, Integer.class);
    if (ReasonCodeFilter != null) {
      IntegerFilter[] ReasonCodeFilters = new IntegerFilter[ReasonCodeFilter.length];
      for (int i = 0; i < ReasonCodeFilters.length; i++) {
        ReasonCodeFilters[i] = (IntegerFilter)ReasonCodeFilter[i];
      }
      try {
        out.setReasonCodeFilter(ReasonCodeFilters);
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
