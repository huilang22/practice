/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeObjectKeyHelper.java
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

/** Helper class for AccountCodeObject's Key objects. */
public class AccountCodeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountCodeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountCodeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountCodeObjectKeyData the converted object
   */
  public static AccountCodeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountCodeObject")
   * @return AccountCodeObjectKeyData the converted object
   */
  public static AccountCodeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountCodeObjectKeyFilter the converted object
   */
  public static AccountCodeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountCodeObject")
   * @return AccountCodeObjectKeyFilter the converted object
   */
  public static AccountCodeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountCodeObjectKeyData to a Map (not including the root).
  /** convert AccountCodeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountCodeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AcgTrackingIdSet) record.put ("AcgTrackingId", in.AcgTrackingId);
  
    if (in._AcgTrackingIdServSet) record.put ("AcgTrackingIdServ", in.AcgTrackingIdServ);
  
    if (in._AccountCodeSet) record.put ("AccountCode", in.AccountCode);
  
    return record;
  }
  /** convert AccountCodeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountCodeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AcgTrackingId, in.AcgTrackingIdSort, in.AcgTrackingIdSortAscending, in.AcgTrackingIdFetch);
      if (map != null) record.put ("AcgTrackingId", map);
      map = DataHelper.filterToMap (in.AcgTrackingIdServ, in.AcgTrackingIdServSort, in.AcgTrackingIdServSortAscending, in.AcgTrackingIdServFetch);
      if (map != null) record.put ("AcgTrackingIdServ", map);
      map = DataHelper.filterToMap (in.AccountCode, in.AccountCodeSort, in.AccountCodeSortAscending, in.AccountCodeFetch, in.AccountCodeCaseInsensitive);
      if (map != null) record.put ("AccountCode", map);
    return record;
  }
  /** convert Map to AccountCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountCodeObjectKeyData the converted object
   */
  public static AccountCodeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountCodeObjectKeyData out = new AccountCodeObjectKeyData ();

    if ((obj = record.get ("AcgTrackingId")) != null)
    {
      out.AcgTrackingId = (Integer) obj;
      out._AcgTrackingIdSet = true;
    }
  
    if ((obj = record.get ("AcgTrackingIdServ")) != null)
    {
      out.AcgTrackingIdServ = (Integer) obj;
      out._AcgTrackingIdServSet = true;
    }
  
    if ((obj = record.get ("AccountCode")) != null)
    {
      out.AccountCode = (String) obj;
      out._AccountCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountCodeObjectKeyFilter the converted object
   */
  public static AccountCodeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountCodeObjectKeyFilter out = new AccountCodeObjectKeyFilter ();

    Map AcgTrackingIdMap = (Map)record.get("AcgTrackingId");
    Boolean AcgTrackingIdFetch = DataHelper.getFetch(AcgTrackingIdMap);
    Boolean AcgTrackingIdSortDir = DataHelper.getSortDirection(AcgTrackingIdMap);
    Integer AcgTrackingIdSortOrder = DataHelper.getSortOrder(AcgTrackingIdMap);
    if (AcgTrackingIdFetch != null) out.setAcgTrackingIdFetch(AcgTrackingIdFetch);
    if (AcgTrackingIdSortDir != null) out.setAcgTrackingIdSortDirection(AcgTrackingIdSortDir);
    if (AcgTrackingIdSortOrder != null) out.setAcgTrackingIdSortOrder(AcgTrackingIdSortOrder);

    Filter[] AcgTrackingIdFilter = DataHelper.mapToFilterArray(AcgTrackingIdMap, Integer.class);
    if (AcgTrackingIdFilter != null) {
      IntegerFilter[] AcgTrackingIdFilters = new IntegerFilter[AcgTrackingIdFilter.length];
      for (int i = 0; i < AcgTrackingIdFilters.length; i++) {
        AcgTrackingIdFilters[i] = (IntegerFilter)AcgTrackingIdFilter[i];
      }
      try {
        out.setAcgTrackingIdFilter(AcgTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AcgTrackingIdServMap = (Map)record.get("AcgTrackingIdServ");
    Boolean AcgTrackingIdServFetch = DataHelper.getFetch(AcgTrackingIdServMap);
    Boolean AcgTrackingIdServSortDir = DataHelper.getSortDirection(AcgTrackingIdServMap);
    Integer AcgTrackingIdServSortOrder = DataHelper.getSortOrder(AcgTrackingIdServMap);
    if (AcgTrackingIdServFetch != null) out.setAcgTrackingIdServFetch(AcgTrackingIdServFetch);
    if (AcgTrackingIdServSortDir != null) out.setAcgTrackingIdServSortDirection(AcgTrackingIdServSortDir);
    if (AcgTrackingIdServSortOrder != null) out.setAcgTrackingIdServSortOrder(AcgTrackingIdServSortOrder);

    Filter[] AcgTrackingIdServFilter = DataHelper.mapToFilterArray(AcgTrackingIdServMap, Integer.class);
    if (AcgTrackingIdServFilter != null) {
      IntegerFilter[] AcgTrackingIdServFilters = new IntegerFilter[AcgTrackingIdServFilter.length];
      for (int i = 0; i < AcgTrackingIdServFilters.length; i++) {
        AcgTrackingIdServFilters[i] = (IntegerFilter)AcgTrackingIdServFilter[i];
      }
      try {
        out.setAcgTrackingIdServFilter(AcgTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountCodeMap = (Map)record.get("AccountCode");
    Boolean AccountCodeFetch = DataHelper.getFetch(AccountCodeMap);
    Boolean AccountCodeSortDir = DataHelper.getSortDirection(AccountCodeMap);
    Integer AccountCodeSortOrder = DataHelper.getSortOrder(AccountCodeMap);
    if (AccountCodeFetch != null) out.setAccountCodeFetch(AccountCodeFetch);
    if (AccountCodeSortDir != null) out.setAccountCodeSortDirection(AccountCodeSortDir);
    if (AccountCodeSortOrder != null) out.setAccountCodeSortOrder(AccountCodeSortOrder);

    Filter[] AccountCodeFilter = DataHelper.mapToFilterArray(AccountCodeMap, String.class);
    if (AccountCodeFilter != null) {
      StringFilter[] AccountCodeFilters = new StringFilter[AccountCodeFilter.length];
      for (int i = 0; i < AccountCodeFilters.length; i++) {
        AccountCodeFilters[i] = (StringFilter)AccountCodeFilter[i];
      }
      try {
        out.setAccountCodeFilter(AccountCodeFilters);
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
