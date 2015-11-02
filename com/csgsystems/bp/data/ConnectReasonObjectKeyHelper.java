/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ConnectReasonObjectKeyHelper.java
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

/** Helper class for ConnectReasonObject's Key objects. */
public class ConnectReasonObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ConnectReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ConnectReasonObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ConnectReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ConnectReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (ConnectReasonObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ConnectReasonObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ConnectReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ConnectReasonObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ConnectReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ConnectReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (ConnectReasonObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ConnectReasonObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ConnectReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ConnectReasonObjectKeyData the converted object
   */
  public static ConnectReasonObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ConnectReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ConnectReasonObject")
   * @return ConnectReasonObjectKeyData the converted object
   */
  public static ConnectReasonObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ConnectReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ConnectReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ConnectReasonObjectKeyFilter the converted object
   */
  public static ConnectReasonObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ConnectReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ConnectReasonObject")
   * @return ConnectReasonObjectKeyFilter the converted object
   */
  public static ConnectReasonObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ConnectReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ConnectReasonObjectKeyData to a Map (not including the root).
  /** convert ConnectReasonObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ConnectReasonObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ConnectReasonSet) record.put ("ConnectReason", in.ConnectReason);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert ConnectReasonObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ConnectReasonObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ConnectReason, in.ConnectReasonSort, in.ConnectReasonSortAscending, in.ConnectReasonFetch);
      if (map != null) record.put ("ConnectReason", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to ConnectReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ConnectReasonObjectKeyData the converted object
   */
  public static ConnectReasonObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ConnectReasonObjectKeyData out = new ConnectReasonObjectKeyData ();

    if ((obj = record.get ("ConnectReason")) != null)
    {
      out.ConnectReason = (Integer) obj;
      out._ConnectReasonSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to ConnectReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ConnectReasonObjectKeyFilter the converted object
   */
  public static ConnectReasonObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ConnectReasonObjectKeyFilter out = new ConnectReasonObjectKeyFilter ();

    Map ConnectReasonMap = (Map)record.get("ConnectReason");
    Boolean ConnectReasonFetch = DataHelper.getFetch(ConnectReasonMap);
    Boolean ConnectReasonSortDir = DataHelper.getSortDirection(ConnectReasonMap);
    Integer ConnectReasonSortOrder = DataHelper.getSortOrder(ConnectReasonMap);
    if (ConnectReasonFetch != null) out.setConnectReasonFetch(ConnectReasonFetch);
    if (ConnectReasonSortDir != null) out.setConnectReasonSortDirection(ConnectReasonSortDir);
    if (ConnectReasonSortOrder != null) out.setConnectReasonSortOrder(ConnectReasonSortOrder);

    Filter[] ConnectReasonFilter = DataHelper.mapToFilterArray(ConnectReasonMap, Integer.class);
    if (ConnectReasonFilter != null) {
      IntegerFilter[] ConnectReasonFilters = new IntegerFilter[ConnectReasonFilter.length];
      for (int i = 0; i < ConnectReasonFilters.length; i++) {
        ConnectReasonFilters[i] = (IntegerFilter)ConnectReasonFilter[i];
      }
      try {
        out.setConnectReasonFilter(ConnectReasonFilters);
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
