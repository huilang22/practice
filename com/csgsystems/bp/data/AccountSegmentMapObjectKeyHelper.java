/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountSegmentMapObjectKeyHelper.java
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

/** Helper class for AccountSegmentMapObject's Key objects. */
public class AccountSegmentMapObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountSegmentMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentMapObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountSegmentMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountSegmentMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentMapObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountSegmentMapObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountSegmentMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentMapObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountSegmentMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountSegmentMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentMapObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountSegmentMapObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountSegmentMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountSegmentMapObjectKeyData the converted object
   */
  public static AccountSegmentMapObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountSegmentMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountSegmentMapObject")
   * @return AccountSegmentMapObjectKeyData the converted object
   */
  public static AccountSegmentMapObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountSegmentMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountSegmentMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountSegmentMapObjectKeyFilter the converted object
   */
  public static AccountSegmentMapObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountSegmentMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountSegmentMapObject")
   * @return AccountSegmentMapObjectKeyFilter the converted object
   */
  public static AccountSegmentMapObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountSegmentMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountSegmentMapObjectKeyData to a Map (not including the root).
  /** convert AccountSegmentMapObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountSegmentMapObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AcctSegIdSet) record.put ("AcctSegId", in.AcctSegId);
  
    return record;
  }
  /** convert AccountSegmentMapObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountSegmentMapObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AcctSegId, in.AcctSegIdSort, in.AcctSegIdSortAscending, in.AcctSegIdFetch);
      if (map != null) record.put ("AcctSegId", map);
    return record;
  }
  /** convert Map to AccountSegmentMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountSegmentMapObjectKeyData the converted object
   */
  public static AccountSegmentMapObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountSegmentMapObjectKeyData out = new AccountSegmentMapObjectKeyData ();

    if ((obj = record.get ("AcctSegId")) != null)
    {
      out.AcctSegId = (Integer) obj;
      out._AcctSegIdSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountSegmentMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountSegmentMapObjectKeyFilter the converted object
   */
  public static AccountSegmentMapObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountSegmentMapObjectKeyFilter out = new AccountSegmentMapObjectKeyFilter ();

    Map AcctSegIdMap = (Map)record.get("AcctSegId");
    Boolean AcctSegIdFetch = DataHelper.getFetch(AcctSegIdMap);
    Boolean AcctSegIdSortDir = DataHelper.getSortDirection(AcctSegIdMap);
    Integer AcctSegIdSortOrder = DataHelper.getSortOrder(AcctSegIdMap);
    if (AcctSegIdFetch != null) out.setAcctSegIdFetch(AcctSegIdFetch);
    if (AcctSegIdSortDir != null) out.setAcctSegIdSortDirection(AcctSegIdSortDir);
    if (AcctSegIdSortOrder != null) out.setAcctSegIdSortOrder(AcctSegIdSortOrder);

    Filter[] AcctSegIdFilter = DataHelper.mapToFilterArray(AcctSegIdMap, Integer.class);
    if (AcctSegIdFilter != null) {
      IntegerFilter[] AcctSegIdFilters = new IntegerFilter[AcctSegIdFilter.length];
      for (int i = 0; i < AcctSegIdFilters.length; i++) {
        AcctSegIdFilters[i] = (IntegerFilter)AcctSegIdFilter[i];
      }
      try {
        out.setAcctSegIdFilter(AcctSegIdFilters);
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
