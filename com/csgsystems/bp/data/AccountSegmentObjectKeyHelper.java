/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountSegmentObjectKeyHelper.java
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

/** Helper class for AccountSegmentObject's Key objects. */
public class AccountSegmentObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountSegmentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountSegmentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountSegmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountSegmentObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountSegmentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountSegmentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountSegmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountSegmentObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountSegmentObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountSegmentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountSegmentObjectKeyData the converted object
   */
  public static AccountSegmentObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountSegmentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountSegmentObject")
   * @return AccountSegmentObjectKeyData the converted object
   */
  public static AccountSegmentObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountSegmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountSegmentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountSegmentObjectKeyFilter the converted object
   */
  public static AccountSegmentObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountSegmentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountSegmentObject")
   * @return AccountSegmentObjectKeyFilter the converted object
   */
  public static AccountSegmentObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountSegmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountSegmentObjectKeyData to a Map (not including the root).
  /** convert AccountSegmentObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountSegmentObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountSegmentIdSet) record.put ("AccountSegmentId", in.AccountSegmentId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert AccountSegmentObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountSegmentObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountSegmentId, in.AccountSegmentIdSort, in.AccountSegmentIdSortAscending, in.AccountSegmentIdFetch);
      if (map != null) record.put ("AccountSegmentId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to AccountSegmentObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountSegmentObjectKeyData the converted object
   */
  public static AccountSegmentObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountSegmentObjectKeyData out = new AccountSegmentObjectKeyData ();

    if ((obj = record.get ("AccountSegmentId")) != null)
    {
      out.AccountSegmentId = (Integer) obj;
      out._AccountSegmentIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountSegmentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountSegmentObjectKeyFilter the converted object
   */
  public static AccountSegmentObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountSegmentObjectKeyFilter out = new AccountSegmentObjectKeyFilter ();

    Map AccountSegmentIdMap = (Map)record.get("AccountSegmentId");
    Boolean AccountSegmentIdFetch = DataHelper.getFetch(AccountSegmentIdMap);
    Boolean AccountSegmentIdSortDir = DataHelper.getSortDirection(AccountSegmentIdMap);
    Integer AccountSegmentIdSortOrder = DataHelper.getSortOrder(AccountSegmentIdMap);
    if (AccountSegmentIdFetch != null) out.setAccountSegmentIdFetch(AccountSegmentIdFetch);
    if (AccountSegmentIdSortDir != null) out.setAccountSegmentIdSortDirection(AccountSegmentIdSortDir);
    if (AccountSegmentIdSortOrder != null) out.setAccountSegmentIdSortOrder(AccountSegmentIdSortOrder);

    Filter[] AccountSegmentIdFilter = DataHelper.mapToFilterArray(AccountSegmentIdMap, Integer.class);
    if (AccountSegmentIdFilter != null) {
      IntegerFilter[] AccountSegmentIdFilters = new IntegerFilter[AccountSegmentIdFilter.length];
      for (int i = 0; i < AccountSegmentIdFilters.length; i++) {
        AccountSegmentIdFilters[i] = (IntegerFilter)AccountSegmentIdFilter[i];
      }
      try {
        out.setAccountSegmentIdFilter(AccountSegmentIdFilters);
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
