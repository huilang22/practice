/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DiscReasonObjectKeyHelper.java
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

/** Helper class for DiscReasonObject's Key objects. */
public class DiscReasonObjectKeyHelper implements ArubaObjectHelper
{
  /** convert DiscReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (DiscReasonObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert DiscReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "DiscReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (DiscReasonObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "DiscReasonObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert DiscReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (DiscReasonObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert DiscReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "DiscReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (DiscReasonObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "DiscReasonObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to DiscReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return DiscReasonObjectKeyData the converted object
   */
  public static DiscReasonObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to DiscReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "DiscReasonObject")
   * @return DiscReasonObjectKeyData the converted object
   */
  public static DiscReasonObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "DiscReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to DiscReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return DiscReasonObjectKeyFilter the converted object
   */
  public static DiscReasonObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to DiscReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "DiscReasonObject")
   * @return DiscReasonObjectKeyFilter the converted object
   */
  public static DiscReasonObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "DiscReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert DiscReasonObjectKeyData to a Map (not including the root).
  /** convert DiscReasonObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (DiscReasonObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._DisconnectReasonSet) record.put ("DisconnectReason", in.DisconnectReason);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert DiscReasonObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (DiscReasonObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.DisconnectReason, in.DisconnectReasonSort, in.DisconnectReasonSortAscending, in.DisconnectReasonFetch);
      if (map != null) record.put ("DisconnectReason", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to DiscReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return DiscReasonObjectKeyData the converted object
   */
  public static DiscReasonObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    DiscReasonObjectKeyData out = new DiscReasonObjectKeyData ();

    if ((obj = record.get ("DisconnectReason")) != null)
    {
      out.DisconnectReason = (Integer) obj;
      out._DisconnectReasonSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to DiscReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return DiscReasonObjectKeyFilter the converted object
   */
  public static DiscReasonObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    DiscReasonObjectKeyFilter out = new DiscReasonObjectKeyFilter ();

    Map DisconnectReasonMap = (Map)record.get("DisconnectReason");
    Boolean DisconnectReasonFetch = DataHelper.getFetch(DisconnectReasonMap);
    Boolean DisconnectReasonSortDir = DataHelper.getSortDirection(DisconnectReasonMap);
    Integer DisconnectReasonSortOrder = DataHelper.getSortOrder(DisconnectReasonMap);
    if (DisconnectReasonFetch != null) out.setDisconnectReasonFetch(DisconnectReasonFetch);
    if (DisconnectReasonSortDir != null) out.setDisconnectReasonSortDirection(DisconnectReasonSortDir);
    if (DisconnectReasonSortOrder != null) out.setDisconnectReasonSortOrder(DisconnectReasonSortOrder);

    Filter[] DisconnectReasonFilter = DataHelper.mapToFilterArray(DisconnectReasonMap, Integer.class);
    if (DisconnectReasonFilter != null) {
      IntegerFilter[] DisconnectReasonFilters = new IntegerFilter[DisconnectReasonFilter.length];
      for (int i = 0; i < DisconnectReasonFilters.length; i++) {
        DisconnectReasonFilters[i] = (IntegerFilter)DisconnectReasonFilter[i];
      }
      try {
        out.setDisconnectReasonFilter(DisconnectReasonFilters);
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
