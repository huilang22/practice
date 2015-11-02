/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountAbiSourceObjectKeyHelper.java
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

/** Helper class for AccountAbiSourceObject's Key objects. */
public class AccountAbiSourceObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AccountAbiSourceObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountAbiSourceObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountAbiSourceObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountAbiSourceObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountAbiSourceObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountAbiSourceObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AccountAbiSourceObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountAbiSourceObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountAbiSourceObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountAbiSourceObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountAbiSourceObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountAbiSourceObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountAbiSourceObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AccountAbiSourceObjectKeyData the converted object
   */
  public static AccountAbiSourceObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountAbiSourceObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountAbiSourceObject")
   * @return AccountAbiSourceObjectKeyData the converted object
   */
  public static AccountAbiSourceObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountAbiSourceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountAbiSourceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AccountAbiSourceObjectKeyFilter the converted object
   */
  public static AccountAbiSourceObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountAbiSourceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountAbiSourceObject")
   * @return AccountAbiSourceObjectKeyFilter the converted object
   */
  public static AccountAbiSourceObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountAbiSourceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AccountAbiSourceObjectKeyData to a Map (not including the root).
  /** convert AccountAbiSourceObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountAbiSourceObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._SourceIdSet) record.put ("SourceId", in.SourceId);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    return record;
  }
  /** convert AccountAbiSourceObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AccountAbiSourceObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.SourceId, in.SourceIdSort, in.SourceIdSortAscending, in.SourceIdFetch);
      if (map != null) record.put ("SourceId", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
    return record;
  }
  /** convert Map to AccountAbiSourceObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountAbiSourceObjectKeyData the converted object
   */
  public static AccountAbiSourceObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountAbiSourceObjectKeyData out = new AccountAbiSourceObjectKeyData ();

    if ((obj = record.get ("SourceId")) != null)
    {
      out.SourceId = (Integer) obj;
      out._SourceIdSet = true;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
      out._ActiveDtSet = true;
    }
  
    return out;
  }
  /** convert Map to AccountAbiSourceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountAbiSourceObjectKeyFilter the converted object
   */
  public static AccountAbiSourceObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountAbiSourceObjectKeyFilter out = new AccountAbiSourceObjectKeyFilter ();

    Map SourceIdMap = (Map)record.get("SourceId");
    Boolean SourceIdFetch = DataHelper.getFetch(SourceIdMap);
    Boolean SourceIdSortDir = DataHelper.getSortDirection(SourceIdMap);
    Integer SourceIdSortOrder = DataHelper.getSortOrder(SourceIdMap);
    if (SourceIdFetch != null) out.setSourceIdFetch(SourceIdFetch);
    if (SourceIdSortDir != null) out.setSourceIdSortDirection(SourceIdSortDir);
    if (SourceIdSortOrder != null) out.setSourceIdSortOrder(SourceIdSortOrder);

    Filter[] SourceIdFilter = DataHelper.mapToFilterArray(SourceIdMap, Integer.class);
    if (SourceIdFilter != null) {
      IntegerFilter[] SourceIdFilters = new IntegerFilter[SourceIdFilter.length];
      for (int i = 0; i < SourceIdFilters.length; i++) {
        SourceIdFilters[i] = (IntegerFilter)SourceIdFilter[i];
      }
      try {
        out.setSourceIdFilter(SourceIdFilters);
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
  
    Map ActiveDtMap = (Map)record.get("ActiveDt");
    Boolean ActiveDtFetch = DataHelper.getFetch(ActiveDtMap);
    Boolean ActiveDtSortDir = DataHelper.getSortDirection(ActiveDtMap);
    Integer ActiveDtSortOrder = DataHelper.getSortOrder(ActiveDtMap);
    if (ActiveDtFetch != null) out.setActiveDtFetch(ActiveDtFetch);
    if (ActiveDtSortDir != null) out.setActiveDtSortDirection(ActiveDtSortDir);
    if (ActiveDtSortOrder != null) out.setActiveDtSortOrder(ActiveDtSortOrder);

    Filter[] ActiveDtFilter = DataHelper.mapToFilterArray(ActiveDtMap, Date.class);
    if (ActiveDtFilter != null) {
      DateFilter[] ActiveDtFilters = new DateFilter[ActiveDtFilter.length];
      for (int i = 0; i < ActiveDtFilters.length; i++) {
        ActiveDtFilters[i] = (DateFilter)ActiveDtFilter[i];
      }
      try {
        out.setActiveDtFilter(ActiveDtFilters);
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
