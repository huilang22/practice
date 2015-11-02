/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LateFeeRateOverridesObjectKeyHelper.java
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

/** Helper class for LateFeeRateOverridesObject's Key objects. */
public class LateFeeRateOverridesObjectKeyHelper implements ArubaObjectHelper
{
  /** convert LateFeeRateOverridesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (LateFeeRateOverridesObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert LateFeeRateOverridesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "LateFeeRateOverridesObject")
   * @return Map     the output Map
   */
  public static Map toMap (LateFeeRateOverridesObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "LateFeeRateOverridesObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert LateFeeRateOverridesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (LateFeeRateOverridesObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert LateFeeRateOverridesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "LateFeeRateOverridesObject")
   * @return Map     the output Map
   */
  public static Map toMap (LateFeeRateOverridesObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "LateFeeRateOverridesObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to LateFeeRateOverridesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return LateFeeRateOverridesObjectKeyData the converted object
   */
  public static LateFeeRateOverridesObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to LateFeeRateOverridesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "LateFeeRateOverridesObject")
   * @return LateFeeRateOverridesObjectKeyData the converted object
   */
  public static LateFeeRateOverridesObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "LateFeeRateOverridesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to LateFeeRateOverridesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return LateFeeRateOverridesObjectKeyFilter the converted object
   */
  public static LateFeeRateOverridesObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to LateFeeRateOverridesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "LateFeeRateOverridesObject")
   * @return LateFeeRateOverridesObjectKeyFilter the converted object
   */
  public static LateFeeRateOverridesObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "LateFeeRateOverridesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert LateFeeRateOverridesObjectKeyData to a Map (not including the root).
  /** convert LateFeeRateOverridesObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (LateFeeRateOverridesObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._LateFeeTypeIdSet) record.put ("LateFeeTypeId", in.LateFeeTypeId);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    return record;
  }
  /** convert LateFeeRateOverridesObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (LateFeeRateOverridesObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.LateFeeTypeId, in.LateFeeTypeIdSort, in.LateFeeTypeIdSortAscending, in.LateFeeTypeIdFetch);
      if (map != null) record.put ("LateFeeTypeId", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
    return record;
  }
  /** convert Map to LateFeeRateOverridesObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return LateFeeRateOverridesObjectKeyData the converted object
   */
  public static LateFeeRateOverridesObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    LateFeeRateOverridesObjectKeyData out = new LateFeeRateOverridesObjectKeyData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("LateFeeTypeId")) != null)
    {
      out.LateFeeTypeId = (Integer) obj;
      out._LateFeeTypeIdSet = true;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
      out._ActiveDtSet = true;
    }
  
    return out;
  }
  /** convert Map to LateFeeRateOverridesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return LateFeeRateOverridesObjectKeyFilter the converted object
   */
  public static LateFeeRateOverridesObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    LateFeeRateOverridesObjectKeyFilter out = new LateFeeRateOverridesObjectKeyFilter ();

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
  
    Map LateFeeTypeIdMap = (Map)record.get("LateFeeTypeId");
    Boolean LateFeeTypeIdFetch = DataHelper.getFetch(LateFeeTypeIdMap);
    Boolean LateFeeTypeIdSortDir = DataHelper.getSortDirection(LateFeeTypeIdMap);
    Integer LateFeeTypeIdSortOrder = DataHelper.getSortOrder(LateFeeTypeIdMap);
    if (LateFeeTypeIdFetch != null) out.setLateFeeTypeIdFetch(LateFeeTypeIdFetch);
    if (LateFeeTypeIdSortDir != null) out.setLateFeeTypeIdSortDirection(LateFeeTypeIdSortDir);
    if (LateFeeTypeIdSortOrder != null) out.setLateFeeTypeIdSortOrder(LateFeeTypeIdSortOrder);

    Filter[] LateFeeTypeIdFilter = DataHelper.mapToFilterArray(LateFeeTypeIdMap, Integer.class);
    if (LateFeeTypeIdFilter != null) {
      IntegerFilter[] LateFeeTypeIdFilters = new IntegerFilter[LateFeeTypeIdFilter.length];
      for (int i = 0; i < LateFeeTypeIdFilters.length; i++) {
        LateFeeTypeIdFilters[i] = (IntegerFilter)LateFeeTypeIdFilter[i];
      }
      try {
        out.setLateFeeTypeIdFilter(LateFeeTypeIdFilters);
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
