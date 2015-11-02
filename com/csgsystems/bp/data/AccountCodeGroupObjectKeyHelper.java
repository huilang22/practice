/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeGroupObjectKeyHelper.java
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

/** Helper class for AccountCodeGroupObject's Key objects. */
public class AccountCodeGroupObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountCodeGroupObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeGroupObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountCodeGroupObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountCodeGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeGroupObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountCodeGroupObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountCodeGroupObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeGroupObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountCodeGroupObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountCodeGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeGroupObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountCodeGroupObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountCodeGroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountCodeGroupObjectKeyData the converted object
   */
  public static AccountCodeGroupObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountCodeGroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountCodeGroupObject")
   * @return AccountCodeGroupObjectKeyData the converted object
   */
  public static AccountCodeGroupObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountCodeGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountCodeGroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountCodeGroupObjectKeyFilter the converted object
   */
  public static AccountCodeGroupObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountCodeGroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountCodeGroupObject")
   * @return AccountCodeGroupObjectKeyFilter the converted object
   */
  public static AccountCodeGroupObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountCodeGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountCodeGroupObjectKeyData to a Map (not including the root).
  /** convert AccountCodeGroupObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountCodeGroupObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountCodeGroupSet) record.put ("AccountCodeGroup", in.AccountCodeGroup);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    return record;
  }
  /** convert AccountCodeGroupObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountCodeGroupObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountCodeGroup, in.AccountCodeGroupSort, in.AccountCodeGroupSortAscending, in.AccountCodeGroupFetch, in.AccountCodeGroupCaseInsensitive);
      if (map != null) record.put ("AccountCodeGroup", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
    return record;
  }
  /** convert Map to AccountCodeGroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountCodeGroupObjectKeyData the converted object
   */
  public static AccountCodeGroupObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountCodeGroupObjectKeyData out = new AccountCodeGroupObjectKeyData ();

    if ((obj = record.get ("AccountCodeGroup")) != null)
    {
      out.AccountCodeGroup = (String) obj;
      out._AccountCodeGroupSet = true;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountCodeGroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountCodeGroupObjectKeyFilter the converted object
   */
  public static AccountCodeGroupObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountCodeGroupObjectKeyFilter out = new AccountCodeGroupObjectKeyFilter ();

    Map AccountCodeGroupMap = (Map)record.get("AccountCodeGroup");
    Boolean AccountCodeGroupFetch = DataHelper.getFetch(AccountCodeGroupMap);
    Boolean AccountCodeGroupSortDir = DataHelper.getSortDirection(AccountCodeGroupMap);
    Integer AccountCodeGroupSortOrder = DataHelper.getSortOrder(AccountCodeGroupMap);
    if (AccountCodeGroupFetch != null) out.setAccountCodeGroupFetch(AccountCodeGroupFetch);
    if (AccountCodeGroupSortDir != null) out.setAccountCodeGroupSortDirection(AccountCodeGroupSortDir);
    if (AccountCodeGroupSortOrder != null) out.setAccountCodeGroupSortOrder(AccountCodeGroupSortOrder);

    Filter[] AccountCodeGroupFilter = DataHelper.mapToFilterArray(AccountCodeGroupMap, String.class);
    if (AccountCodeGroupFilter != null) {
      StringFilter[] AccountCodeGroupFilters = new StringFilter[AccountCodeGroupFilter.length];
      for (int i = 0; i < AccountCodeGroupFilters.length; i++) {
        AccountCodeGroupFilters[i] = (StringFilter)AccountCodeGroupFilter[i];
      }
      try {
        out.setAccountCodeGroupFilter(AccountCodeGroupFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
