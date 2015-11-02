/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountEDObjectKeyHelper.java
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

/** Helper class for AccountEDObject's Key objects. */
public class AccountEDObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountEDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountEDObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountEDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountEDObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountEDObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountEDObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountEDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountEDObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountEDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountEDObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountEDObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountEDObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountEDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountEDObjectKeyData the converted object
   */
  public static AccountEDObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountEDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountEDObject")
   * @return AccountEDObjectKeyData the converted object
   */
  public static AccountEDObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountEDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountEDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountEDObjectKeyFilter the converted object
   */
  public static AccountEDObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountEDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountEDObject")
   * @return AccountEDObjectKeyFilter the converted object
   */
  public static AccountEDObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountEDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountEDObjectKeyData to a Map (not including the root).
  /** convert AccountEDObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountEDObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ParamIdSet) record.put ("ParamId", in.ParamId);
  
    return record;
  }
  /** convert AccountEDObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountEDObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ParamId, in.ParamIdSort, in.ParamIdSortAscending, in.ParamIdFetch);
      if (map != null) record.put ("ParamId", map);
    return record;
  }
  /** convert Map to AccountEDObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountEDObjectKeyData the converted object
   */
  public static AccountEDObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountEDObjectKeyData out = new AccountEDObjectKeyData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("ParamId")) != null)
    {
      out.ParamId = (Integer) obj;
      out._ParamIdSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountEDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountEDObjectKeyFilter the converted object
   */
  public static AccountEDObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountEDObjectKeyFilter out = new AccountEDObjectKeyFilter ();

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
  
    Map ParamIdMap = (Map)record.get("ParamId");
    Boolean ParamIdFetch = DataHelper.getFetch(ParamIdMap);
    Boolean ParamIdSortDir = DataHelper.getSortDirection(ParamIdMap);
    Integer ParamIdSortOrder = DataHelper.getSortOrder(ParamIdMap);
    if (ParamIdFetch != null) out.setParamIdFetch(ParamIdFetch);
    if (ParamIdSortDir != null) out.setParamIdSortDirection(ParamIdSortDir);
    if (ParamIdSortOrder != null) out.setParamIdSortOrder(ParamIdSortOrder);

    Filter[] ParamIdFilter = DataHelper.mapToFilterArray(ParamIdMap, Integer.class);
    if (ParamIdFilter != null) {
      IntegerFilter[] ParamIdFilters = new IntegerFilter[ParamIdFilter.length];
      for (int i = 0; i < ParamIdFilters.length; i++) {
        ParamIdFilters[i] = (IntegerFilter)ParamIdFilter[i];
      }
      try {
        out.setParamIdFilter(ParamIdFilters);
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
