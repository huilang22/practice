/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBonusPointBalanceObjectHelper.java
 * Definition File: Customer/AccountBonusPointBalance.xml
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
import com.csgsystems.api.bulk.*;


import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;



/** Helper class to convert AccountBonusPointBalanceObject JavaBean objects to/from HashMaps.
 */
public class AccountBonusPointBalanceObjectHelper implements ArubaObjectHelper
{
  /** convert AccountBonusPointBalanceObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountBonusPointBalanceObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountBonusPointBalanceObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountBonusPointBalanceObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointBalanceObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountBonusPointBalanceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AccountBonusPointBalanceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointBalanceObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountBonusPointBalanceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountBonusPointBalanceObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointBalanceObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountBonusPointBalanceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountBonusPointBalanceObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountBonusPointBalanceObjectData the converted object
   */
  public static AccountBonusPointBalanceObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountBonusPointBalanceObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountBonusPointBalanceObject")
   * @return AccountBonusPointBalanceObjectData the converted object
   */
  public static AccountBonusPointBalanceObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBonusPointBalanceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountBonusPointBalanceObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountBonusPointBalanceObjectFilter the converted object
   */
  public static AccountBonusPointBalanceObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountBonusPointBalanceObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountBonusPointBalanceObject")
   * @return AccountBonusPointBalanceObjectFilter the converted object
   */
  public static AccountBonusPointBalanceObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBonusPointBalanceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountBonusPointBalanceObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountBonusPointBalanceObjectDataList the converted object
   */
  public static AccountBonusPointBalanceObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountBonusPointBalanceObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountBonusPointBalanceObjectList")
   * @return AccountBonusPointBalanceObjectDataList the converted object
   */
  public static AccountBonusPointBalanceObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBonusPointBalanceObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountBonusPointBalanceObjectData[] array = null;
    if (root != null)
    {
      array = new AccountBonusPointBalanceObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountBonusPointBalanceObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountBonusPointBalanceObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountBonusPointBalanceObjectDataList (array, index, total);
  }
  /** convert AccountBonusPointBalanceObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountBonusPointBalanceObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AccountBonusPointBalanceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._TotalPointsSet) record.put ("TotalPoints", in.TotalPoints);
  
    if (in._PointsEarnedSet) record.put ("PointsEarned", in.PointsEarned);
      return record;
  }
  /** convert AccountBonusPointBalanceObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountBonusPointBalanceObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AccountBonusPointBalanceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.TotalPoints, in.TotalPointsSort, in.TotalPointsSortAscending, in.TotalPointsFetch);
      if (map != null) record.put ("TotalPoints", map);
      map = DataHelper.filterToMap (in.PointsEarned, in.PointsEarnedSort, in.PointsEarnedSortAscending, in.PointsEarnedFetch);
      if (map != null) record.put ("PointsEarned", map);
    return record;
  }
  /** convert Map to AccountBonusPointBalanceObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountBonusPointBalanceObjectData the converted object
   */
  public static AccountBonusPointBalanceObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBonusPointBalanceObjectData out = new AccountBonusPointBalanceObjectData ();

    out.Key = AccountBonusPointBalanceObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("TotalPoints")) != null)
    {
      out.TotalPoints = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PointsEarned")) != null)
    {
      out.PointsEarned = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to AccountBonusPointBalanceObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountBonusPointBalanceObjectFilter the converted object
   */
  public static AccountBonusPointBalanceObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBonusPointBalanceObjectFilter out = new AccountBonusPointBalanceObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AccountBonusPointBalanceObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map AccountExternalIdMap = (Map)record.get("AccountExternalId");
    Boolean AccountExternalIdFetch = DataHelper.getFetch(AccountExternalIdMap);
    Boolean AccountExternalIdSortDir = DataHelper.getSortDirection(AccountExternalIdMap);
    Integer AccountExternalIdSortOrder = DataHelper.getSortOrder(AccountExternalIdMap);
    if (AccountExternalIdFetch != null) out.setAccountExternalIdFetch(AccountExternalIdFetch);
    if (AccountExternalIdSortDir != null) out.setAccountExternalIdSortDirection(AccountExternalIdSortDir);
    if (AccountExternalIdSortOrder != null) out.setAccountExternalIdSortOrder(AccountExternalIdSortOrder);

    Filter[] AccountExternalIdFilter = DataHelper.mapToFilterArray(AccountExternalIdMap, String.class);
    if (AccountExternalIdFilter != null) {
      StringFilter[] AccountExternalIdFilters = new StringFilter[AccountExternalIdFilter.length];
      for (int i = 0; i < AccountExternalIdFilters.length; i++) {
        AccountExternalIdFilters[i] = (StringFilter)AccountExternalIdFilter[i];
      }
      try {
        out.setAccountExternalIdFilter(AccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountExternalIdTypeMap = (Map)record.get("AccountExternalIdType");
    Boolean AccountExternalIdTypeFetch = DataHelper.getFetch(AccountExternalIdTypeMap);
    Boolean AccountExternalIdTypeSortDir = DataHelper.getSortDirection(AccountExternalIdTypeMap);
    Integer AccountExternalIdTypeSortOrder = DataHelper.getSortOrder(AccountExternalIdTypeMap);
    if (AccountExternalIdTypeFetch != null) out.setAccountExternalIdTypeFetch(AccountExternalIdTypeFetch);
    if (AccountExternalIdTypeSortDir != null) out.setAccountExternalIdTypeSortDirection(AccountExternalIdTypeSortDir);
    if (AccountExternalIdTypeSortOrder != null) out.setAccountExternalIdTypeSortOrder(AccountExternalIdTypeSortOrder);

    Filter[] AccountExternalIdTypeFilter = DataHelper.mapToFilterArray(AccountExternalIdTypeMap, Integer.class);
    if (AccountExternalIdTypeFilter != null) {
      IntegerFilter[] AccountExternalIdTypeFilters = new IntegerFilter[AccountExternalIdTypeFilter.length];
      for (int i = 0; i < AccountExternalIdTypeFilters.length; i++) {
        AccountExternalIdTypeFilters[i] = (IntegerFilter)AccountExternalIdTypeFilter[i];
      }
      try {
        out.setAccountExternalIdTypeFilter(AccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalPointsMap = (Map)record.get("TotalPoints");
    Boolean TotalPointsFetch = DataHelper.getFetch(TotalPointsMap);
    Boolean TotalPointsSortDir = DataHelper.getSortDirection(TotalPointsMap);
    Integer TotalPointsSortOrder = DataHelper.getSortOrder(TotalPointsMap);
    if (TotalPointsFetch != null) out.setTotalPointsFetch(TotalPointsFetch);
    if (TotalPointsSortDir != null) out.setTotalPointsSortDirection(TotalPointsSortDir);
    if (TotalPointsSortOrder != null) out.setTotalPointsSortOrder(TotalPointsSortOrder);

    Filter[] TotalPointsFilter = DataHelper.mapToFilterArray(TotalPointsMap, BigInteger.class);
    if (TotalPointsFilter != null) {
      BigIntegerFilter[] TotalPointsFilters = new BigIntegerFilter[TotalPointsFilter.length];
      for (int i = 0; i < TotalPointsFilters.length; i++) {
        TotalPointsFilters[i] = (BigIntegerFilter)TotalPointsFilter[i];
      }
      try {
        out.setTotalPointsFilter(TotalPointsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointsEarnedMap = (Map)record.get("PointsEarned");
    Boolean PointsEarnedFetch = DataHelper.getFetch(PointsEarnedMap);
    Boolean PointsEarnedSortDir = DataHelper.getSortDirection(PointsEarnedMap);
    Integer PointsEarnedSortOrder = DataHelper.getSortOrder(PointsEarnedMap);
    if (PointsEarnedFetch != null) out.setPointsEarnedFetch(PointsEarnedFetch);
    if (PointsEarnedSortDir != null) out.setPointsEarnedSortDirection(PointsEarnedSortDir);
    if (PointsEarnedSortOrder != null) out.setPointsEarnedSortOrder(PointsEarnedSortOrder);

    Filter[] PointsEarnedFilter = DataHelper.mapToFilterArray(PointsEarnedMap, BigInteger.class);
    if (PointsEarnedFilter != null) {
      BigIntegerFilter[] PointsEarnedFilters = new BigIntegerFilter[PointsEarnedFilter.length];
      for (int i = 0; i < PointsEarnedFilters.length; i++) {
        PointsEarnedFilters[i] = (BigIntegerFilter)PointsEarnedFilter[i];
      }
      try {
        out.setPointsEarnedFilter(PointsEarnedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
