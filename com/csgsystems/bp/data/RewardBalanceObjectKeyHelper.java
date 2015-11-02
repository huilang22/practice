/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RewardBalanceObjectKeyHelper.java
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

/** Helper class for RewardBalanceObject's Key objects. */
public class RewardBalanceObjectKeyHelper implements ArubaObjectHelper
{
  /** convert RewardBalanceObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RewardBalanceObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RewardBalanceObject")
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RewardBalanceObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert RewardBalanceObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RewardBalanceObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RewardBalanceObject")
   * @return Map     the output Map
   */
  public static Map toMap (RewardBalanceObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RewardBalanceObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RewardBalanceObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return RewardBalanceObjectKeyData the converted object
   */
  public static RewardBalanceObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RewardBalanceObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RewardBalanceObject")
   * @return RewardBalanceObjectKeyData the converted object
   */
  public static RewardBalanceObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RewardBalanceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RewardBalanceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return RewardBalanceObjectKeyFilter the converted object
   */
  public static RewardBalanceObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RewardBalanceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RewardBalanceObject")
   * @return RewardBalanceObjectKeyFilter the converted object
   */
  public static RewardBalanceObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RewardBalanceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert RewardBalanceObjectKeyData to a Map (not including the root).
  /** convert RewardBalanceObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RewardBalanceObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._RewardBalanceIdSet) record.put ("RewardBalanceId", in.RewardBalanceId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert RewardBalanceObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RewardBalanceObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.RewardBalanceId, in.RewardBalanceIdSort, in.RewardBalanceIdSortAscending, in.RewardBalanceIdFetch);
      if (map != null) record.put ("RewardBalanceId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to RewardBalanceObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RewardBalanceObjectKeyData the converted object
   */
  public static RewardBalanceObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RewardBalanceObjectKeyData out = new RewardBalanceObjectKeyData ();

    if ((obj = record.get ("RewardBalanceId")) != null)
    {
      out.RewardBalanceId = (Integer) obj;
      out._RewardBalanceIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to RewardBalanceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RewardBalanceObjectKeyFilter the converted object
   */
  public static RewardBalanceObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RewardBalanceObjectKeyFilter out = new RewardBalanceObjectKeyFilter ();

    Map RewardBalanceIdMap = (Map)record.get("RewardBalanceId");
    Boolean RewardBalanceIdFetch = DataHelper.getFetch(RewardBalanceIdMap);
    Boolean RewardBalanceIdSortDir = DataHelper.getSortDirection(RewardBalanceIdMap);
    Integer RewardBalanceIdSortOrder = DataHelper.getSortOrder(RewardBalanceIdMap);
    if (RewardBalanceIdFetch != null) out.setRewardBalanceIdFetch(RewardBalanceIdFetch);
    if (RewardBalanceIdSortDir != null) out.setRewardBalanceIdSortDirection(RewardBalanceIdSortDir);
    if (RewardBalanceIdSortOrder != null) out.setRewardBalanceIdSortOrder(RewardBalanceIdSortOrder);

    Filter[] RewardBalanceIdFilter = DataHelper.mapToFilterArray(RewardBalanceIdMap, Integer.class);
    if (RewardBalanceIdFilter != null) {
      IntegerFilter[] RewardBalanceIdFilters = new IntegerFilter[RewardBalanceIdFilter.length];
      for (int i = 0; i < RewardBalanceIdFilters.length; i++) {
        RewardBalanceIdFilters[i] = (IntegerFilter)RewardBalanceIdFilter[i];
      }
      try {
        out.setRewardBalanceIdFilter(RewardBalanceIdFilters);
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
