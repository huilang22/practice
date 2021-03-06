/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBonusPointTransactionObjectKeyHelper.java
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

/** Helper class for AccountBonusPointTransactionObject's Key objects. */
public class AccountBonusPointTransactionObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountBonusPointTransactionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointTransactionObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountBonusPointTransactionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountBonusPointTransactionObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointTransactionObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountBonusPointTransactionObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountBonusPointTransactionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointTransactionObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountBonusPointTransactionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountBonusPointTransactionObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointTransactionObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountBonusPointTransactionObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountBonusPointTransactionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountBonusPointTransactionObjectKeyData the converted object
   */
  public static AccountBonusPointTransactionObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountBonusPointTransactionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountBonusPointTransactionObject")
   * @return AccountBonusPointTransactionObjectKeyData the converted object
   */
  public static AccountBonusPointTransactionObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBonusPointTransactionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountBonusPointTransactionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountBonusPointTransactionObjectKeyFilter the converted object
   */
  public static AccountBonusPointTransactionObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountBonusPointTransactionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountBonusPointTransactionObject")
   * @return AccountBonusPointTransactionObjectKeyFilter the converted object
   */
  public static AccountBonusPointTransactionObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBonusPointTransactionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountBonusPointTransactionObjectKeyData to a Map (not including the root).
  /** convert AccountBonusPointTransactionObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountBonusPointTransactionObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._PointTransTrackingIdSet) record.put ("PointTransTrackingId", in.PointTransTrackingId);
  
    if (in._PointTransTrackingIdServSet) record.put ("PointTransTrackingIdServ", in.PointTransTrackingIdServ);
  
    return record;
  }
  /** convert AccountBonusPointTransactionObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountBonusPointTransactionObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.PointTransTrackingId, in.PointTransTrackingIdSort, in.PointTransTrackingIdSortAscending, in.PointTransTrackingIdFetch);
      if (map != null) record.put ("PointTransTrackingId", map);
      map = DataHelper.filterToMap (in.PointTransTrackingIdServ, in.PointTransTrackingIdServSort, in.PointTransTrackingIdServSortAscending, in.PointTransTrackingIdServFetch);
      if (map != null) record.put ("PointTransTrackingIdServ", map);
    return record;
  }
  /** convert Map to AccountBonusPointTransactionObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountBonusPointTransactionObjectKeyData the converted object
   */
  public static AccountBonusPointTransactionObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBonusPointTransactionObjectKeyData out = new AccountBonusPointTransactionObjectKeyData ();

    if ((obj = record.get ("PointTransTrackingId")) != null)
    {
      out.PointTransTrackingId = (Integer) obj;
      out._PointTransTrackingIdSet = true;
    }
  
    if ((obj = record.get ("PointTransTrackingIdServ")) != null)
    {
      out.PointTransTrackingIdServ = (Integer) obj;
      out._PointTransTrackingIdServSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountBonusPointTransactionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountBonusPointTransactionObjectKeyFilter the converted object
   */
  public static AccountBonusPointTransactionObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBonusPointTransactionObjectKeyFilter out = new AccountBonusPointTransactionObjectKeyFilter ();

    Map PointTransTrackingIdMap = (Map)record.get("PointTransTrackingId");
    Boolean PointTransTrackingIdFetch = DataHelper.getFetch(PointTransTrackingIdMap);
    Boolean PointTransTrackingIdSortDir = DataHelper.getSortDirection(PointTransTrackingIdMap);
    Integer PointTransTrackingIdSortOrder = DataHelper.getSortOrder(PointTransTrackingIdMap);
    if (PointTransTrackingIdFetch != null) out.setPointTransTrackingIdFetch(PointTransTrackingIdFetch);
    if (PointTransTrackingIdSortDir != null) out.setPointTransTrackingIdSortDirection(PointTransTrackingIdSortDir);
    if (PointTransTrackingIdSortOrder != null) out.setPointTransTrackingIdSortOrder(PointTransTrackingIdSortOrder);

    Filter[] PointTransTrackingIdFilter = DataHelper.mapToFilterArray(PointTransTrackingIdMap, Integer.class);
    if (PointTransTrackingIdFilter != null) {
      IntegerFilter[] PointTransTrackingIdFilters = new IntegerFilter[PointTransTrackingIdFilter.length];
      for (int i = 0; i < PointTransTrackingIdFilters.length; i++) {
        PointTransTrackingIdFilters[i] = (IntegerFilter)PointTransTrackingIdFilter[i];
      }
      try {
        out.setPointTransTrackingIdFilter(PointTransTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointTransTrackingIdServMap = (Map)record.get("PointTransTrackingIdServ");
    Boolean PointTransTrackingIdServFetch = DataHelper.getFetch(PointTransTrackingIdServMap);
    Boolean PointTransTrackingIdServSortDir = DataHelper.getSortDirection(PointTransTrackingIdServMap);
    Integer PointTransTrackingIdServSortOrder = DataHelper.getSortOrder(PointTransTrackingIdServMap);
    if (PointTransTrackingIdServFetch != null) out.setPointTransTrackingIdServFetch(PointTransTrackingIdServFetch);
    if (PointTransTrackingIdServSortDir != null) out.setPointTransTrackingIdServSortDirection(PointTransTrackingIdServSortDir);
    if (PointTransTrackingIdServSortOrder != null) out.setPointTransTrackingIdServSortOrder(PointTransTrackingIdServSortOrder);

    Filter[] PointTransTrackingIdServFilter = DataHelper.mapToFilterArray(PointTransTrackingIdServMap, Integer.class);
    if (PointTransTrackingIdServFilter != null) {
      IntegerFilter[] PointTransTrackingIdServFilters = new IntegerFilter[PointTransTrackingIdServFilter.length];
      for (int i = 0; i < PointTransTrackingIdServFilters.length; i++) {
        PointTransTrackingIdServFilters[i] = (IntegerFilter)PointTransTrackingIdServFilter[i];
      }
      try {
        out.setPointTransTrackingIdServFilter(PointTransTrackingIdServFilters);
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
