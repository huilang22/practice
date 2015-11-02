/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountLocateObjectKeyHelper.java
 * Definition File: Catalog/.xml
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

/** Helper class for AccountLocateObject's Key objects. */
public class AccountLocateObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountLocateObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountLocateObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountLocateObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountLocateObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountLocateObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountLocateObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountLocateObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountLocateObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountLocateObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountLocateObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountLocateObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountLocateObjectKeyData the converted object
   */
  public static AccountLocateObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountLocateObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountLocateObject")
   * @return AccountLocateObjectKeyData the converted object
   */
  public static AccountLocateObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountLocateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountLocateObjectKeyFilter the converted object
   */
  public static AccountLocateObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountLocateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountLocateObject")
   * @return AccountLocateObjectKeyFilter the converted object
   */
  public static AccountLocateObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountLocateObjectKeyData to a Map (not including the root).
  /** convert AccountLocateObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountLocateObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    return record;
  }
  /** convert AccountLocateObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountLocateObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
    return record;
  }
  /** convert Map to AccountLocateObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountLocateObjectKeyData the converted object
   */
  public static AccountLocateObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountLocateObjectKeyData out = new AccountLocateObjectKeyData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountLocateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountLocateObjectKeyFilter the converted object
   */
  public static AccountLocateObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountLocateObjectKeyFilter out = new AccountLocateObjectKeyFilter ();

    Map AccountInternalIdMap = (Map)record.get("AccountInternalId");
    Boolean AccountInternalIdFetch = DataHelper.getFetch(AccountInternalIdMap);
    Boolean AccountInternalIdSortDir = DataHelper.getSortDirection(AccountInternalIdMap);
    Integer AccountInternalIdSortOrder = DataHelper.getSortOrder(AccountInternalIdMap);
    if (AccountInternalIdFetch != null) out.setAccountInternalIdFetch(AccountInternalIdFetch);
    if (AccountInternalIdSortDir != null) out.setAccountInternalIdSortDirection(AccountInternalIdSortDir);
    if (AccountInternalIdSortOrder != null) out.setAccountInternalIdSortOrder(AccountInternalIdSortOrder);

    Filter[] AccountInternalIdFilter = DataHelper.mapToFilterArray(AccountInternalIdMap, Integer.class);
    if (AccountInternalIdFilter != null) {
      IntegerFilter[] AccountInternalIdFilters = new IntegerFilter[AccountInternalIdFilter.length];
      for (int i = 0; i < AccountInternalIdFilters.length; i++) {
        AccountInternalIdFilters[i] = (IntegerFilter)AccountInternalIdFilter[i];
      }
      try {
        out.setAccountInternalIdFilter(AccountInternalIdFilters);
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
