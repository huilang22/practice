/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBalancesObjectKeyHelper.java
 * Definition File: Customer/.xml
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

/** Helper class for AccountBalancesObject's Key objects. */
public class AccountBalancesObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountBalancesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountBalancesObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountBalancesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountBalancesObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountBalancesObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountBalancesObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountBalancesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountBalancesObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountBalancesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountBalancesObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountBalancesObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountBalancesObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountBalancesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountBalancesObjectKeyData the converted object
   */
  public static AccountBalancesObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountBalancesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountBalancesObject")
   * @return AccountBalancesObjectKeyData the converted object
   */
  public static AccountBalancesObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBalancesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountBalancesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountBalancesObjectKeyFilter the converted object
   */
  public static AccountBalancesObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountBalancesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountBalancesObject")
   * @return AccountBalancesObjectKeyFilter the converted object
   */
  public static AccountBalancesObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBalancesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountBalancesObjectKeyData to a Map (not including the root).
  /** convert AccountBalancesObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountBalancesObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BalanceTrackingIdSet) record.put ("BalanceTrackingId", in.BalanceTrackingId);
  
    if (in._BalanceTrackingIdServSet) record.put ("BalanceTrackingIdServ", in.BalanceTrackingIdServ);
  
    return record;
  }
  /** convert AccountBalancesObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountBalancesObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BalanceTrackingId, in.BalanceTrackingIdSort, in.BalanceTrackingIdSortAscending, in.BalanceTrackingIdFetch);
      if (map != null) record.put ("BalanceTrackingId", map);
      map = DataHelper.filterToMap (in.BalanceTrackingIdServ, in.BalanceTrackingIdServSort, in.BalanceTrackingIdServSortAscending, in.BalanceTrackingIdServFetch);
      if (map != null) record.put ("BalanceTrackingIdServ", map);
    return record;
  }
  /** convert Map to AccountBalancesObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountBalancesObjectKeyData the converted object
   */
  public static AccountBalancesObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBalancesObjectKeyData out = new AccountBalancesObjectKeyData ();

    if ((obj = record.get ("BalanceTrackingId")) != null)
    {
      out.BalanceTrackingId = (Integer) obj;
      out._BalanceTrackingIdSet = true;
    }
  
    if ((obj = record.get ("BalanceTrackingIdServ")) != null)
    {
      out.BalanceTrackingIdServ = (Integer) obj;
      out._BalanceTrackingIdServSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountBalancesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountBalancesObjectKeyFilter the converted object
   */
  public static AccountBalancesObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBalancesObjectKeyFilter out = new AccountBalancesObjectKeyFilter ();

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
  
    Map BalanceTrackingIdServMap = (Map)record.get("BalanceTrackingIdServ");
    Boolean BalanceTrackingIdServFetch = DataHelper.getFetch(BalanceTrackingIdServMap);
    Boolean BalanceTrackingIdServSortDir = DataHelper.getSortDirection(BalanceTrackingIdServMap);
    Integer BalanceTrackingIdServSortOrder = DataHelper.getSortOrder(BalanceTrackingIdServMap);
    if (BalanceTrackingIdServFetch != null) out.setBalanceTrackingIdServFetch(BalanceTrackingIdServFetch);
    if (BalanceTrackingIdServSortDir != null) out.setBalanceTrackingIdServSortDirection(BalanceTrackingIdServSortDir);
    if (BalanceTrackingIdServSortOrder != null) out.setBalanceTrackingIdServSortOrder(BalanceTrackingIdServSortOrder);

    Filter[] BalanceTrackingIdServFilter = DataHelper.mapToFilterArray(BalanceTrackingIdServMap, Integer.class);
    if (BalanceTrackingIdServFilter != null) {
      IntegerFilter[] BalanceTrackingIdServFilters = new IntegerFilter[BalanceTrackingIdServFilter.length];
      for (int i = 0; i < BalanceTrackingIdServFilters.length; i++) {
        BalanceTrackingIdServFilters[i] = (IntegerFilter)BalanceTrackingIdServFilter[i];
      }
      try {
        out.setBalanceTrackingIdServFilter(BalanceTrackingIdServFilters);
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
