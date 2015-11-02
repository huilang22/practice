/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CmfRewardBalanceDetailObjectKeyHelper.java
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

/** Helper class for CmfRewardBalanceDetailObject's Key objects. */
public class CmfRewardBalanceDetailObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CmfRewardBalanceDetailObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CmfRewardBalanceDetailObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CmfRewardBalanceDetailObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CmfRewardBalanceDetailObject")
   * @return Map     the output Map
   */
  public static Map toMap (CmfRewardBalanceDetailObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CmfRewardBalanceDetailObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CmfRewardBalanceDetailObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CmfRewardBalanceDetailObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CmfRewardBalanceDetailObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CmfRewardBalanceDetailObject")
   * @return Map     the output Map
   */
  public static Map toMap (CmfRewardBalanceDetailObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CmfRewardBalanceDetailObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CmfRewardBalanceDetailObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CmfRewardBalanceDetailObjectKeyData the converted object
   */
  public static CmfRewardBalanceDetailObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CmfRewardBalanceDetailObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CmfRewardBalanceDetailObject")
   * @return CmfRewardBalanceDetailObjectKeyData the converted object
   */
  public static CmfRewardBalanceDetailObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CmfRewardBalanceDetailObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CmfRewardBalanceDetailObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CmfRewardBalanceDetailObjectKeyFilter the converted object
   */
  public static CmfRewardBalanceDetailObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CmfRewardBalanceDetailObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CmfRewardBalanceDetailObject")
   * @return CmfRewardBalanceDetailObjectKeyFilter the converted object
   */
  public static CmfRewardBalanceDetailObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CmfRewardBalanceDetailObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CmfRewardBalanceDetailObjectKeyData to a Map (not including the root).
  /** convert CmfRewardBalanceDetailObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CmfRewardBalanceDetailObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._RewardBalanceIdSet) record.put ("RewardBalanceId", in.RewardBalanceId);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    return record;
  }
  /** convert CmfRewardBalanceDetailObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CmfRewardBalanceDetailObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.RewardBalanceId, in.RewardBalanceIdSort, in.RewardBalanceIdSortAscending, in.RewardBalanceIdFetch);
      if (map != null) record.put ("RewardBalanceId", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
    return record;
  }
  /** convert Map to CmfRewardBalanceDetailObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CmfRewardBalanceDetailObjectKeyData the converted object
   */
  public static CmfRewardBalanceDetailObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CmfRewardBalanceDetailObjectKeyData out = new CmfRewardBalanceDetailObjectKeyData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("RewardBalanceId")) != null)
    {
      out.RewardBalanceId = (Integer) obj;
      out._RewardBalanceIdSet = true;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
      out._BillRefNoSet = true;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
      out._BillRefResetsSet = true;
    }
  
    return out;
  }
  /** convert Map to CmfRewardBalanceDetailObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CmfRewardBalanceDetailObjectKeyFilter the converted object
   */
  public static CmfRewardBalanceDetailObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CmfRewardBalanceDetailObjectKeyFilter out = new CmfRewardBalanceDetailObjectKeyFilter ();

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
  
    Map RewardBalanceIdMap = (Map)record.get("RewardBalanceId");
    Boolean RewardBalanceIdFetch = DataHelper.getFetch(RewardBalanceIdMap);
    Boolean RewardBalanceIdSortDir = DataHelper.getSortDirection(RewardBalanceIdMap);
    Integer RewardBalanceIdSortOrder = DataHelper.getSortOrder(RewardBalanceIdMap);
    if (RewardBalanceIdFetch != null) out.setRewardBalanceIdFetch(RewardBalanceIdFetch);
    if (RewardBalanceIdSortDir != null) out.setRewardBalanceIdSortDirection(RewardBalanceIdSortDir);
    if (RewardBalanceIdSortOrder != null) out.setRewardBalanceIdSortOrder(RewardBalanceIdSortOrder);

    Filter[] RewardBalanceIdFilter = DataHelper.mapToFilterArray(RewardBalanceIdMap, Integer.class);
    if (RewardBalanceIdFilter != null) {
      IntegerFilter[] RewardBalanceIdFilters = new IntegerFilter[RewardBalanceIdFilter.length];
      for (int i = 0; i < RewardBalanceIdFilters.length; i++) {
        RewardBalanceIdFilters[i] = (IntegerFilter)RewardBalanceIdFilter[i];
      }
      try {
        out.setRewardBalanceIdFilter(RewardBalanceIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefNoMap = (Map)record.get("BillRefNo");
    Boolean BillRefNoFetch = DataHelper.getFetch(BillRefNoMap);
    Boolean BillRefNoSortDir = DataHelper.getSortDirection(BillRefNoMap);
    Integer BillRefNoSortOrder = DataHelper.getSortOrder(BillRefNoMap);
    if (BillRefNoFetch != null) out.setBillRefNoFetch(BillRefNoFetch);
    if (BillRefNoSortDir != null) out.setBillRefNoSortDirection(BillRefNoSortDir);
    if (BillRefNoSortOrder != null) out.setBillRefNoSortOrder(BillRefNoSortOrder);

    Filter[] BillRefNoFilter = DataHelper.mapToFilterArray(BillRefNoMap, Integer.class);
    if (BillRefNoFilter != null) {
      IntegerFilter[] BillRefNoFilters = new IntegerFilter[BillRefNoFilter.length];
      for (int i = 0; i < BillRefNoFilters.length; i++) {
        BillRefNoFilters[i] = (IntegerFilter)BillRefNoFilter[i];
      }
      try {
        out.setBillRefNoFilter(BillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefResetsMap = (Map)record.get("BillRefResets");
    Boolean BillRefResetsFetch = DataHelper.getFetch(BillRefResetsMap);
    Boolean BillRefResetsSortDir = DataHelper.getSortDirection(BillRefResetsMap);
    Integer BillRefResetsSortOrder = DataHelper.getSortOrder(BillRefResetsMap);
    if (BillRefResetsFetch != null) out.setBillRefResetsFetch(BillRefResetsFetch);
    if (BillRefResetsSortDir != null) out.setBillRefResetsSortDirection(BillRefResetsSortDir);
    if (BillRefResetsSortOrder != null) out.setBillRefResetsSortOrder(BillRefResetsSortOrder);

    Filter[] BillRefResetsFilter = DataHelper.mapToFilterArray(BillRefResetsMap, Integer.class);
    if (BillRefResetsFilter != null) {
      IntegerFilter[] BillRefResetsFilters = new IntegerFilter[BillRefResetsFilter.length];
      for (int i = 0; i < BillRefResetsFilters.length; i++) {
        BillRefResetsFilters[i] = (IntegerFilter)BillRefResetsFilter[i];
      }
      try {
        out.setBillRefResetsFilter(BillRefResetsFilters);
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
