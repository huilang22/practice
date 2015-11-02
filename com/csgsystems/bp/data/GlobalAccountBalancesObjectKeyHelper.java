/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalAccountBalancesObjectKeyHelper.java
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

/** Helper class for GlobalAccountBalancesObject's Key objects. */
public class GlobalAccountBalancesObjectKeyHelper implements ArubaObjectHelper
{
  /** convert GlobalAccountBalancesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GlobalAccountBalancesObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalAccountBalancesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalAccountBalancesObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalAccountBalancesObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalAccountBalancesObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert GlobalAccountBalancesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GlobalAccountBalancesObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalAccountBalancesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalAccountBalancesObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalAccountBalancesObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalAccountBalancesObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GlobalAccountBalancesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return GlobalAccountBalancesObjectKeyData the converted object
   */
  public static GlobalAccountBalancesObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GlobalAccountBalancesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GlobalAccountBalancesObject")
   * @return GlobalAccountBalancesObjectKeyData the converted object
   */
  public static GlobalAccountBalancesObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalAccountBalancesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GlobalAccountBalancesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return GlobalAccountBalancesObjectKeyFilter the converted object
   */
  public static GlobalAccountBalancesObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GlobalAccountBalancesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GlobalAccountBalancesObject")
   * @return GlobalAccountBalancesObjectKeyFilter the converted object
   */
  public static GlobalAccountBalancesObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalAccountBalancesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert GlobalAccountBalancesObjectKeyData to a Map (not including the root).
  /** convert GlobalAccountBalancesObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GlobalAccountBalancesObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BalanceTrackingIdSet) record.put ("BalanceTrackingId", in.BalanceTrackingId);
  
    return record;
  }
  /** convert GlobalAccountBalancesObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GlobalAccountBalancesObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BalanceTrackingId, in.BalanceTrackingIdSort, in.BalanceTrackingIdSortAscending, in.BalanceTrackingIdFetch);
      if (map != null) record.put ("BalanceTrackingId", map);
    return record;
  }
  /** convert Map to GlobalAccountBalancesObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalAccountBalancesObjectKeyData the converted object
   */
  public static GlobalAccountBalancesObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalAccountBalancesObjectKeyData out = new GlobalAccountBalancesObjectKeyData ();

    if ((obj = record.get ("BalanceTrackingId")) != null)
    {
      out.BalanceTrackingId = (Integer) obj;
      out._BalanceTrackingIdSet = true;
    }
  
    return out;
  }
  /** convert Map to GlobalAccountBalancesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalAccountBalancesObjectKeyFilter the converted object
   */
  public static GlobalAccountBalancesObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalAccountBalancesObjectKeyFilter out = new GlobalAccountBalancesObjectKeyFilter ();

    Map BalanceTrackingIdMap = (Map)record.get("BalanceTrackingId");
    Boolean BalanceTrackingIdFetch = DataHelper.getFetch(BalanceTrackingIdMap);
    Boolean BalanceTrackingIdSortDir = DataHelper.getSortDirection(BalanceTrackingIdMap);
    Integer BalanceTrackingIdSortOrder = DataHelper.getSortOrder(BalanceTrackingIdMap);
    if (BalanceTrackingIdFetch != null) out.setBalanceTrackingIdFetch(BalanceTrackingIdFetch);
    if (BalanceTrackingIdSortDir != null) out.setBalanceTrackingIdSortDirection(BalanceTrackingIdSortDir);
    if (BalanceTrackingIdSortOrder != null) out.setBalanceTrackingIdSortOrder(BalanceTrackingIdSortOrder);

    Filter[] BalanceTrackingIdFilter = DataHelper.mapToFilterArray(BalanceTrackingIdMap, Integer.class);
    if (BalanceTrackingIdFilter != null) {
      IntegerFilter[] BalanceTrackingIdFilters = new IntegerFilter[BalanceTrackingIdFilter.length];
      for (int i = 0; i < BalanceTrackingIdFilters.length; i++) {
        BalanceTrackingIdFilters[i] = (IntegerFilter)BalanceTrackingIdFilter[i];
      }
      try {
        out.setBalanceTrackingIdFilter(BalanceTrackingIdFilters);
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
