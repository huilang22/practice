/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SalesChannelObjectKeyHelper.java
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

/** Helper class for SalesChannelObject's Key objects. */
public class SalesChannelObjectKeyHelper implements ArubaObjectHelper
{
  /** convert SalesChannelObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SalesChannelObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SalesChannelObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SalesChannelObject")
   * @return Map     the output Map
   */
  public static Map toMap (SalesChannelObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SalesChannelObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert SalesChannelObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SalesChannelObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SalesChannelObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SalesChannelObject")
   * @return Map     the output Map
   */
  public static Map toMap (SalesChannelObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SalesChannelObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SalesChannelObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return SalesChannelObjectKeyData the converted object
   */
  public static SalesChannelObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SalesChannelObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SalesChannelObject")
   * @return SalesChannelObjectKeyData the converted object
   */
  public static SalesChannelObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SalesChannelObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SalesChannelObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return SalesChannelObjectKeyFilter the converted object
   */
  public static SalesChannelObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SalesChannelObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SalesChannelObject")
   * @return SalesChannelObjectKeyFilter the converted object
   */
  public static SalesChannelObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SalesChannelObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert SalesChannelObjectKeyData to a Map (not including the root).
  /** convert SalesChannelObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SalesChannelObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._SalesChannelIdSet) record.put ("SalesChannelId", in.SalesChannelId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert SalesChannelObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SalesChannelObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.SalesChannelId, in.SalesChannelIdSort, in.SalesChannelIdSortAscending, in.SalesChannelIdFetch);
      if (map != null) record.put ("SalesChannelId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to SalesChannelObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SalesChannelObjectKeyData the converted object
   */
  public static SalesChannelObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SalesChannelObjectKeyData out = new SalesChannelObjectKeyData ();

    if ((obj = record.get ("SalesChannelId")) != null)
    {
      out.SalesChannelId = (Integer) obj;
      out._SalesChannelIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to SalesChannelObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SalesChannelObjectKeyFilter the converted object
   */
  public static SalesChannelObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SalesChannelObjectKeyFilter out = new SalesChannelObjectKeyFilter ();

    Map SalesChannelIdMap = (Map)record.get("SalesChannelId");
    Boolean SalesChannelIdFetch = DataHelper.getFetch(SalesChannelIdMap);
    Boolean SalesChannelIdSortDir = DataHelper.getSortDirection(SalesChannelIdMap);
    Integer SalesChannelIdSortOrder = DataHelper.getSortOrder(SalesChannelIdMap);
    if (SalesChannelIdFetch != null) out.setSalesChannelIdFetch(SalesChannelIdFetch);
    if (SalesChannelIdSortDir != null) out.setSalesChannelIdSortDirection(SalesChannelIdSortDir);
    if (SalesChannelIdSortOrder != null) out.setSalesChannelIdSortOrder(SalesChannelIdSortOrder);

    Filter[] SalesChannelIdFilter = DataHelper.mapToFilterArray(SalesChannelIdMap, Integer.class);
    if (SalesChannelIdFilter != null) {
      IntegerFilter[] SalesChannelIdFilters = new IntegerFilter[SalesChannelIdFilter.length];
      for (int i = 0; i < SalesChannelIdFilters.length; i++) {
        SalesChannelIdFilters[i] = (IntegerFilter)SalesChannelIdFilter[i];
      }
      try {
        out.setSalesChannelIdFilter(SalesChannelIdFilters);
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
