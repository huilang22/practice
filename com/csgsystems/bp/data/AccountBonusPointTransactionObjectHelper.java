/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountBonusPointTransactionObjectHelper.java
 * Definition File: Customer/AccountBonusPointTransaction.xml
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



/** Helper class to convert AccountBonusPointTransactionObject JavaBean objects to/from HashMaps.
 */
public class AccountBonusPointTransactionObjectHelper implements ArubaObjectHelper
{
  /** convert AccountBonusPointTransactionObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountBonusPointTransactionObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountBonusPointTransactionObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountBonusPointTransactionObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointTransactionObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountBonusPointTransactionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AccountBonusPointTransactionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointTransactionObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountBonusPointTransactionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountBonusPointTransactionObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountBonusPointTransactionObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountBonusPointTransactionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountBonusPointTransactionObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountBonusPointTransactionObjectData the converted object
   */
  public static AccountBonusPointTransactionObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountBonusPointTransactionObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountBonusPointTransactionObject")
   * @return AccountBonusPointTransactionObjectData the converted object
   */
  public static AccountBonusPointTransactionObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBonusPointTransactionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountBonusPointTransactionObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountBonusPointTransactionObjectFilter the converted object
   */
  public static AccountBonusPointTransactionObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountBonusPointTransactionObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountBonusPointTransactionObject")
   * @return AccountBonusPointTransactionObjectFilter the converted object
   */
  public static AccountBonusPointTransactionObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBonusPointTransactionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountBonusPointTransactionObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountBonusPointTransactionObjectDataList the converted object
   */
  public static AccountBonusPointTransactionObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountBonusPointTransactionObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountBonusPointTransactionObjectList")
   * @return AccountBonusPointTransactionObjectDataList the converted object
   */
  public static AccountBonusPointTransactionObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountBonusPointTransactionObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountBonusPointTransactionObjectData[] array = null;
    if (root != null)
    {
      array = new AccountBonusPointTransactionObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountBonusPointTransactionObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountBonusPointTransactionObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountBonusPointTransactionObjectDataList (array, index, total);
  }
  /** convert AccountBonusPointTransactionObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountBonusPointTransactionObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AccountBonusPointTransactionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ContractTrackingIdSet) record.put ("ContractTrackingId", in.ContractTrackingId);
  
    if (in._ContractTrackingIdServSet) record.put ("ContractTrackingIdServ", in.ContractTrackingIdServ);
  
    if (in._BonusPointIdSet) record.put ("BonusPointId", in.BonusPointId);
  
    if (in._BonusPointTransTypeSet) record.put ("BonusPointTransType", in.BonusPointTransType);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._DistributedAmountSet) record.put ("DistributedAmount", in.DistributedAmount);
  
    if (in._TransDateSet) record.put ("TransDate", in.TransDate);
  
    if (in._ExpirationDateSet) record.put ("ExpirationDate", in.ExpirationDate);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._ExpirationBillRefNoSet) record.put ("ExpirationBillRefNo", in.ExpirationBillRefNo);
  
    if (in._ExpirationBillRefResetsSet) record.put ("ExpirationBillRefResets", in.ExpirationBillRefResets);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._EntryDateSet) record.put ("EntryDate", in.EntryDate);
  
    if (in._TransStatusSet) record.put ("TransStatus", in.TransStatus);
  
    if (in._TransferTrackingIdSet) record.put ("TransferTrackingId", in.TransferTrackingId);
  
    if (in._TransferTrackingIdServSet) record.put ("TransferTrackingIdServ", in.TransferTrackingIdServ);
  
    if (in._ExternalTransIdSet) record.put ("ExternalTransId", in.ExternalTransId);
  
    if (in._ExternalDateSet) record.put ("ExternalDate", in.ExternalDate);
  
    if (in._ExternalTransMsgSet) record.put ("ExternalTransMsg", in.ExternalTransMsg);
  
    if (in._ExternalTransInfoSet) record.put ("ExternalTransInfo", in.ExternalTransInfo);
      return record;
  }
  /** convert AccountBonusPointTransactionObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountBonusPointTransactionObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AccountBonusPointTransactionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ContractTrackingId, in.ContractTrackingIdSort, in.ContractTrackingIdSortAscending, in.ContractTrackingIdFetch);
      if (map != null) record.put ("ContractTrackingId", map);
      map = DataHelper.filterToMap (in.ContractTrackingIdServ, in.ContractTrackingIdServSort, in.ContractTrackingIdServSortAscending, in.ContractTrackingIdServFetch);
      if (map != null) record.put ("ContractTrackingIdServ", map);
      map = DataHelper.filterToMap (in.BonusPointId, in.BonusPointIdSort, in.BonusPointIdSortAscending, in.BonusPointIdFetch);
      if (map != null) record.put ("BonusPointId", map);
      map = DataHelper.filterToMap (in.BonusPointTransType, in.BonusPointTransTypeSort, in.BonusPointTransTypeSortAscending, in.BonusPointTransTypeFetch);
      if (map != null) record.put ("BonusPointTransType", map);
      map = DataHelper.filterToMap (in.Amount, in.AmountSort, in.AmountSortAscending, in.AmountFetch);
      if (map != null) record.put ("Amount", map);
      map = DataHelper.filterToMap (in.DistributedAmount, in.DistributedAmountSort, in.DistributedAmountSortAscending, in.DistributedAmountFetch);
      if (map != null) record.put ("DistributedAmount", map);
      map = DataHelper.filterToMap (in.TransDate, in.TransDateSort, in.TransDateSortAscending, in.TransDateFetch);
      if (map != null) record.put ("TransDate", map);
      map = DataHelper.filterToMap (in.ExpirationDate, in.ExpirationDateSort, in.ExpirationDateSortAscending, in.ExpirationDateFetch);
      if (map != null) record.put ("ExpirationDate", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.ExpirationBillRefNo, in.ExpirationBillRefNoSort, in.ExpirationBillRefNoSortAscending, in.ExpirationBillRefNoFetch);
      if (map != null) record.put ("ExpirationBillRefNo", map);
      map = DataHelper.filterToMap (in.ExpirationBillRefResets, in.ExpirationBillRefResetsSort, in.ExpirationBillRefResetsSortAscending, in.ExpirationBillRefResetsFetch);
      if (map != null) record.put ("ExpirationBillRefResets", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.EntryDate, in.EntryDateSort, in.EntryDateSortAscending, in.EntryDateFetch);
      if (map != null) record.put ("EntryDate", map);
      map = DataHelper.filterToMap (in.TransStatus, in.TransStatusSort, in.TransStatusSortAscending, in.TransStatusFetch);
      if (map != null) record.put ("TransStatus", map);
      map = DataHelper.filterToMap (in.TransferTrackingId, in.TransferTrackingIdSort, in.TransferTrackingIdSortAscending, in.TransferTrackingIdFetch);
      if (map != null) record.put ("TransferTrackingId", map);
      map = DataHelper.filterToMap (in.TransferTrackingIdServ, in.TransferTrackingIdServSort, in.TransferTrackingIdServSortAscending, in.TransferTrackingIdServFetch);
      if (map != null) record.put ("TransferTrackingIdServ", map);
      map = DataHelper.filterToMap (in.ExternalTransId, in.ExternalTransIdSort, in.ExternalTransIdSortAscending, in.ExternalTransIdFetch, in.ExternalTransIdCaseInsensitive);
      if (map != null) record.put ("ExternalTransId", map);
      map = DataHelper.filterToMap (in.ExternalDate, in.ExternalDateSort, in.ExternalDateSortAscending, in.ExternalDateFetch);
      if (map != null) record.put ("ExternalDate", map);
      map = DataHelper.filterToMap (in.ExternalTransMsg, in.ExternalTransMsgSort, in.ExternalTransMsgSortAscending, in.ExternalTransMsgFetch, in.ExternalTransMsgCaseInsensitive);
      if (map != null) record.put ("ExternalTransMsg", map);
      map = DataHelper.filterToMap (in.ExternalTransInfo, in.ExternalTransInfoSort, in.ExternalTransInfoSortAscending, in.ExternalTransInfoFetch, in.ExternalTransInfoCaseInsensitive);
      if (map != null) record.put ("ExternalTransInfo", map);
    return record;
  }
  /** convert Map to AccountBonusPointTransactionObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountBonusPointTransactionObjectData the converted object
   */
  public static AccountBonusPointTransactionObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBonusPointTransactionObjectData out = new AccountBonusPointTransactionObjectData ();

    out.Key = AccountBonusPointTransactionObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractTrackingId")) != null)
    {
      out.ContractTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractTrackingIdServ")) != null)
    {
      out.ContractTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("BonusPointId")) != null)
    {
      out.BonusPointId = (Integer) obj;
    }
  
    if ((obj = record.get ("BonusPointTransType")) != null)
    {
      out.BonusPointTransType = (Integer) obj;
    }
  
    if ((obj = record.get ("Amount")) != null)
    {
      out.Amount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("DistributedAmount")) != null)
    {
      out.DistributedAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TransDate")) != null)
    {
      out.TransDate = (Date) obj;
    }
  
    if ((obj = record.get ("ExpirationDate")) != null)
    {
      out.ExpirationDate = (Date) obj;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("ExpirationBillRefNo")) != null)
    {
      out.ExpirationBillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("ExpirationBillRefResets")) != null)
    {
      out.ExpirationBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("EntryDate")) != null)
    {
      out.EntryDate = (Date) obj;
    }
  
    if ((obj = record.get ("TransStatus")) != null)
    {
      out.TransStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("TransferTrackingId")) != null)
    {
      out.TransferTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("TransferTrackingIdServ")) != null)
    {
      out.TransferTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("ExternalTransId")) != null)
    {
      out.ExternalTransId = (String) obj;
    }
  
    if ((obj = record.get ("ExternalDate")) != null)
    {
      out.ExternalDate = (Date) obj;
    }
  
    if ((obj = record.get ("ExternalTransMsg")) != null)
    {
      out.ExternalTransMsg = (String) obj;
    }
  
    if ((obj = record.get ("ExternalTransInfo")) != null)
    {
      out.ExternalTransInfo = (String) obj;
    }
      return out;
  }
  /** convert Map to AccountBonusPointTransactionObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountBonusPointTransactionObjectFilter the converted object
   */
  public static AccountBonusPointTransactionObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountBonusPointTransactionObjectFilter out = new AccountBonusPointTransactionObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AccountBonusPointTransactionObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map ContractTrackingIdMap = (Map)record.get("ContractTrackingId");
    Boolean ContractTrackingIdFetch = DataHelper.getFetch(ContractTrackingIdMap);
    Boolean ContractTrackingIdSortDir = DataHelper.getSortDirection(ContractTrackingIdMap);
    Integer ContractTrackingIdSortOrder = DataHelper.getSortOrder(ContractTrackingIdMap);
    if (ContractTrackingIdFetch != null) out.setContractTrackingIdFetch(ContractTrackingIdFetch);
    if (ContractTrackingIdSortDir != null) out.setContractTrackingIdSortDirection(ContractTrackingIdSortDir);
    if (ContractTrackingIdSortOrder != null) out.setContractTrackingIdSortOrder(ContractTrackingIdSortOrder);

    Filter[] ContractTrackingIdFilter = DataHelper.mapToFilterArray(ContractTrackingIdMap, Integer.class);
    if (ContractTrackingIdFilter != null) {
      IntegerFilter[] ContractTrackingIdFilters = new IntegerFilter[ContractTrackingIdFilter.length];
      for (int i = 0; i < ContractTrackingIdFilters.length; i++) {
        ContractTrackingIdFilters[i] = (IntegerFilter)ContractTrackingIdFilter[i];
      }
      try {
        out.setContractTrackingIdFilter(ContractTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTrackingIdServMap = (Map)record.get("ContractTrackingIdServ");
    Boolean ContractTrackingIdServFetch = DataHelper.getFetch(ContractTrackingIdServMap);
    Boolean ContractTrackingIdServSortDir = DataHelper.getSortDirection(ContractTrackingIdServMap);
    Integer ContractTrackingIdServSortOrder = DataHelper.getSortOrder(ContractTrackingIdServMap);
    if (ContractTrackingIdServFetch != null) out.setContractTrackingIdServFetch(ContractTrackingIdServFetch);
    if (ContractTrackingIdServSortDir != null) out.setContractTrackingIdServSortDirection(ContractTrackingIdServSortDir);
    if (ContractTrackingIdServSortOrder != null) out.setContractTrackingIdServSortOrder(ContractTrackingIdServSortOrder);

    Filter[] ContractTrackingIdServFilter = DataHelper.mapToFilterArray(ContractTrackingIdServMap, Integer.class);
    if (ContractTrackingIdServFilter != null) {
      IntegerFilter[] ContractTrackingIdServFilters = new IntegerFilter[ContractTrackingIdServFilter.length];
      for (int i = 0; i < ContractTrackingIdServFilters.length; i++) {
        ContractTrackingIdServFilters[i] = (IntegerFilter)ContractTrackingIdServFilter[i];
      }
      try {
        out.setContractTrackingIdServFilter(ContractTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BonusPointIdMap = (Map)record.get("BonusPointId");
    Boolean BonusPointIdFetch = DataHelper.getFetch(BonusPointIdMap);
    Boolean BonusPointIdSortDir = DataHelper.getSortDirection(BonusPointIdMap);
    Integer BonusPointIdSortOrder = DataHelper.getSortOrder(BonusPointIdMap);
    if (BonusPointIdFetch != null) out.setBonusPointIdFetch(BonusPointIdFetch);
    if (BonusPointIdSortDir != null) out.setBonusPointIdSortDirection(BonusPointIdSortDir);
    if (BonusPointIdSortOrder != null) out.setBonusPointIdSortOrder(BonusPointIdSortOrder);

    Filter[] BonusPointIdFilter = DataHelper.mapToFilterArray(BonusPointIdMap, Integer.class);
    if (BonusPointIdFilter != null) {
      IntegerFilter[] BonusPointIdFilters = new IntegerFilter[BonusPointIdFilter.length];
      for (int i = 0; i < BonusPointIdFilters.length; i++) {
        BonusPointIdFilters[i] = (IntegerFilter)BonusPointIdFilter[i];
      }
      try {
        out.setBonusPointIdFilter(BonusPointIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BonusPointTransTypeMap = (Map)record.get("BonusPointTransType");
    Boolean BonusPointTransTypeFetch = DataHelper.getFetch(BonusPointTransTypeMap);
    Boolean BonusPointTransTypeSortDir = DataHelper.getSortDirection(BonusPointTransTypeMap);
    Integer BonusPointTransTypeSortOrder = DataHelper.getSortOrder(BonusPointTransTypeMap);
    if (BonusPointTransTypeFetch != null) out.setBonusPointTransTypeFetch(BonusPointTransTypeFetch);
    if (BonusPointTransTypeSortDir != null) out.setBonusPointTransTypeSortDirection(BonusPointTransTypeSortDir);
    if (BonusPointTransTypeSortOrder != null) out.setBonusPointTransTypeSortOrder(BonusPointTransTypeSortOrder);

    Filter[] BonusPointTransTypeFilter = DataHelper.mapToFilterArray(BonusPointTransTypeMap, Integer.class);
    if (BonusPointTransTypeFilter != null) {
      IntegerFilter[] BonusPointTransTypeFilters = new IntegerFilter[BonusPointTransTypeFilter.length];
      for (int i = 0; i < BonusPointTransTypeFilters.length; i++) {
        BonusPointTransTypeFilters[i] = (IntegerFilter)BonusPointTransTypeFilter[i];
      }
      try {
        out.setBonusPointTransTypeFilter(BonusPointTransTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AmountMap = (Map)record.get("Amount");
    Boolean AmountFetch = DataHelper.getFetch(AmountMap);
    Boolean AmountSortDir = DataHelper.getSortDirection(AmountMap);
    Integer AmountSortOrder = DataHelper.getSortOrder(AmountMap);
    if (AmountFetch != null) out.setAmountFetch(AmountFetch);
    if (AmountSortDir != null) out.setAmountSortDirection(AmountSortDir);
    if (AmountSortOrder != null) out.setAmountSortOrder(AmountSortOrder);

    Filter[] AmountFilter = DataHelper.mapToFilterArray(AmountMap, BigInteger.class);
    if (AmountFilter != null) {
      BigIntegerFilter[] AmountFilters = new BigIntegerFilter[AmountFilter.length];
      for (int i = 0; i < AmountFilters.length; i++) {
        AmountFilters[i] = (BigIntegerFilter)AmountFilter[i];
      }
      try {
        out.setAmountFilter(AmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DistributedAmountMap = (Map)record.get("DistributedAmount");
    Boolean DistributedAmountFetch = DataHelper.getFetch(DistributedAmountMap);
    Boolean DistributedAmountSortDir = DataHelper.getSortDirection(DistributedAmountMap);
    Integer DistributedAmountSortOrder = DataHelper.getSortOrder(DistributedAmountMap);
    if (DistributedAmountFetch != null) out.setDistributedAmountFetch(DistributedAmountFetch);
    if (DistributedAmountSortDir != null) out.setDistributedAmountSortDirection(DistributedAmountSortDir);
    if (DistributedAmountSortOrder != null) out.setDistributedAmountSortOrder(DistributedAmountSortOrder);

    Filter[] DistributedAmountFilter = DataHelper.mapToFilterArray(DistributedAmountMap, BigInteger.class);
    if (DistributedAmountFilter != null) {
      BigIntegerFilter[] DistributedAmountFilters = new BigIntegerFilter[DistributedAmountFilter.length];
      for (int i = 0; i < DistributedAmountFilters.length; i++) {
        DistributedAmountFilters[i] = (BigIntegerFilter)DistributedAmountFilter[i];
      }
      try {
        out.setDistributedAmountFilter(DistributedAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransDateMap = (Map)record.get("TransDate");
    Boolean TransDateFetch = DataHelper.getFetch(TransDateMap);
    Boolean TransDateSortDir = DataHelper.getSortDirection(TransDateMap);
    Integer TransDateSortOrder = DataHelper.getSortOrder(TransDateMap);
    if (TransDateFetch != null) out.setTransDateFetch(TransDateFetch);
    if (TransDateSortDir != null) out.setTransDateSortDirection(TransDateSortDir);
    if (TransDateSortOrder != null) out.setTransDateSortOrder(TransDateSortOrder);

    Filter[] TransDateFilter = DataHelper.mapToFilterArray(TransDateMap, Date.class);
    if (TransDateFilter != null) {
      DateFilter[] TransDateFilters = new DateFilter[TransDateFilter.length];
      for (int i = 0; i < TransDateFilters.length; i++) {
        TransDateFilters[i] = (DateFilter)TransDateFilter[i];
      }
      try {
        out.setTransDateFilter(TransDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExpirationDateMap = (Map)record.get("ExpirationDate");
    Boolean ExpirationDateFetch = DataHelper.getFetch(ExpirationDateMap);
    Boolean ExpirationDateSortDir = DataHelper.getSortDirection(ExpirationDateMap);
    Integer ExpirationDateSortOrder = DataHelper.getSortOrder(ExpirationDateMap);
    if (ExpirationDateFetch != null) out.setExpirationDateFetch(ExpirationDateFetch);
    if (ExpirationDateSortDir != null) out.setExpirationDateSortDirection(ExpirationDateSortDir);
    if (ExpirationDateSortOrder != null) out.setExpirationDateSortOrder(ExpirationDateSortOrder);

    Filter[] ExpirationDateFilter = DataHelper.mapToFilterArray(ExpirationDateMap, Date.class);
    if (ExpirationDateFilter != null) {
      DateFilter[] ExpirationDateFilters = new DateFilter[ExpirationDateFilter.length];
      for (int i = 0; i < ExpirationDateFilters.length; i++) {
        ExpirationDateFilters[i] = (DateFilter)ExpirationDateFilter[i];
      }
      try {
        out.setExpirationDateFilter(ExpirationDateFilters);
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
  
    Map ExpirationBillRefNoMap = (Map)record.get("ExpirationBillRefNo");
    Boolean ExpirationBillRefNoFetch = DataHelper.getFetch(ExpirationBillRefNoMap);
    Boolean ExpirationBillRefNoSortDir = DataHelper.getSortDirection(ExpirationBillRefNoMap);
    Integer ExpirationBillRefNoSortOrder = DataHelper.getSortOrder(ExpirationBillRefNoMap);
    if (ExpirationBillRefNoFetch != null) out.setExpirationBillRefNoFetch(ExpirationBillRefNoFetch);
    if (ExpirationBillRefNoSortDir != null) out.setExpirationBillRefNoSortDirection(ExpirationBillRefNoSortDir);
    if (ExpirationBillRefNoSortOrder != null) out.setExpirationBillRefNoSortOrder(ExpirationBillRefNoSortOrder);

    Filter[] ExpirationBillRefNoFilter = DataHelper.mapToFilterArray(ExpirationBillRefNoMap, Integer.class);
    if (ExpirationBillRefNoFilter != null) {
      IntegerFilter[] ExpirationBillRefNoFilters = new IntegerFilter[ExpirationBillRefNoFilter.length];
      for (int i = 0; i < ExpirationBillRefNoFilters.length; i++) {
        ExpirationBillRefNoFilters[i] = (IntegerFilter)ExpirationBillRefNoFilter[i];
      }
      try {
        out.setExpirationBillRefNoFilter(ExpirationBillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExpirationBillRefResetsMap = (Map)record.get("ExpirationBillRefResets");
    Boolean ExpirationBillRefResetsFetch = DataHelper.getFetch(ExpirationBillRefResetsMap);
    Boolean ExpirationBillRefResetsSortDir = DataHelper.getSortDirection(ExpirationBillRefResetsMap);
    Integer ExpirationBillRefResetsSortOrder = DataHelper.getSortOrder(ExpirationBillRefResetsMap);
    if (ExpirationBillRefResetsFetch != null) out.setExpirationBillRefResetsFetch(ExpirationBillRefResetsFetch);
    if (ExpirationBillRefResetsSortDir != null) out.setExpirationBillRefResetsSortDirection(ExpirationBillRefResetsSortDir);
    if (ExpirationBillRefResetsSortOrder != null) out.setExpirationBillRefResetsSortOrder(ExpirationBillRefResetsSortOrder);

    Filter[] ExpirationBillRefResetsFilter = DataHelper.mapToFilterArray(ExpirationBillRefResetsMap, Integer.class);
    if (ExpirationBillRefResetsFilter != null) {
      IntegerFilter[] ExpirationBillRefResetsFilters = new IntegerFilter[ExpirationBillRefResetsFilter.length];
      for (int i = 0; i < ExpirationBillRefResetsFilters.length; i++) {
        ExpirationBillRefResetsFilters[i] = (IntegerFilter)ExpirationBillRefResetsFilter[i];
      }
      try {
        out.setExpirationBillRefResetsFilter(ExpirationBillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgWhoMap = (Map)record.get("ChgWho");
    Boolean ChgWhoFetch = DataHelper.getFetch(ChgWhoMap);
    Boolean ChgWhoSortDir = DataHelper.getSortDirection(ChgWhoMap);
    Integer ChgWhoSortOrder = DataHelper.getSortOrder(ChgWhoMap);
    if (ChgWhoFetch != null) out.setChgWhoFetch(ChgWhoFetch);
    if (ChgWhoSortDir != null) out.setChgWhoSortDirection(ChgWhoSortDir);
    if (ChgWhoSortOrder != null) out.setChgWhoSortOrder(ChgWhoSortOrder);

    Filter[] ChgWhoFilter = DataHelper.mapToFilterArray(ChgWhoMap, String.class);
    if (ChgWhoFilter != null) {
      StringFilter[] ChgWhoFilters = new StringFilter[ChgWhoFilter.length];
      for (int i = 0; i < ChgWhoFilters.length; i++) {
        ChgWhoFilters[i] = (StringFilter)ChgWhoFilter[i];
      }
      try {
        out.setChgWhoFilter(ChgWhoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EntryDateMap = (Map)record.get("EntryDate");
    Boolean EntryDateFetch = DataHelper.getFetch(EntryDateMap);
    Boolean EntryDateSortDir = DataHelper.getSortDirection(EntryDateMap);
    Integer EntryDateSortOrder = DataHelper.getSortOrder(EntryDateMap);
    if (EntryDateFetch != null) out.setEntryDateFetch(EntryDateFetch);
    if (EntryDateSortDir != null) out.setEntryDateSortDirection(EntryDateSortDir);
    if (EntryDateSortOrder != null) out.setEntryDateSortOrder(EntryDateSortOrder);

    Filter[] EntryDateFilter = DataHelper.mapToFilterArray(EntryDateMap, Date.class);
    if (EntryDateFilter != null) {
      DateFilter[] EntryDateFilters = new DateFilter[EntryDateFilter.length];
      for (int i = 0; i < EntryDateFilters.length; i++) {
        EntryDateFilters[i] = (DateFilter)EntryDateFilter[i];
      }
      try {
        out.setEntryDateFilter(EntryDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransStatusMap = (Map)record.get("TransStatus");
    Boolean TransStatusFetch = DataHelper.getFetch(TransStatusMap);
    Boolean TransStatusSortDir = DataHelper.getSortDirection(TransStatusMap);
    Integer TransStatusSortOrder = DataHelper.getSortOrder(TransStatusMap);
    if (TransStatusFetch != null) out.setTransStatusFetch(TransStatusFetch);
    if (TransStatusSortDir != null) out.setTransStatusSortDirection(TransStatusSortDir);
    if (TransStatusSortOrder != null) out.setTransStatusSortOrder(TransStatusSortOrder);

    Filter[] TransStatusFilter = DataHelper.mapToFilterArray(TransStatusMap, Integer.class);
    if (TransStatusFilter != null) {
      IntegerFilter[] TransStatusFilters = new IntegerFilter[TransStatusFilter.length];
      for (int i = 0; i < TransStatusFilters.length; i++) {
        TransStatusFilters[i] = (IntegerFilter)TransStatusFilter[i];
      }
      try {
        out.setTransStatusFilter(TransStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransferTrackingIdMap = (Map)record.get("TransferTrackingId");
    Boolean TransferTrackingIdFetch = DataHelper.getFetch(TransferTrackingIdMap);
    Boolean TransferTrackingIdSortDir = DataHelper.getSortDirection(TransferTrackingIdMap);
    Integer TransferTrackingIdSortOrder = DataHelper.getSortOrder(TransferTrackingIdMap);
    if (TransferTrackingIdFetch != null) out.setTransferTrackingIdFetch(TransferTrackingIdFetch);
    if (TransferTrackingIdSortDir != null) out.setTransferTrackingIdSortDirection(TransferTrackingIdSortDir);
    if (TransferTrackingIdSortOrder != null) out.setTransferTrackingIdSortOrder(TransferTrackingIdSortOrder);

    Filter[] TransferTrackingIdFilter = DataHelper.mapToFilterArray(TransferTrackingIdMap, Integer.class);
    if (TransferTrackingIdFilter != null) {
      IntegerFilter[] TransferTrackingIdFilters = new IntegerFilter[TransferTrackingIdFilter.length];
      for (int i = 0; i < TransferTrackingIdFilters.length; i++) {
        TransferTrackingIdFilters[i] = (IntegerFilter)TransferTrackingIdFilter[i];
      }
      try {
        out.setTransferTrackingIdFilter(TransferTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransferTrackingIdServMap = (Map)record.get("TransferTrackingIdServ");
    Boolean TransferTrackingIdServFetch = DataHelper.getFetch(TransferTrackingIdServMap);
    Boolean TransferTrackingIdServSortDir = DataHelper.getSortDirection(TransferTrackingIdServMap);
    Integer TransferTrackingIdServSortOrder = DataHelper.getSortOrder(TransferTrackingIdServMap);
    if (TransferTrackingIdServFetch != null) out.setTransferTrackingIdServFetch(TransferTrackingIdServFetch);
    if (TransferTrackingIdServSortDir != null) out.setTransferTrackingIdServSortDirection(TransferTrackingIdServSortDir);
    if (TransferTrackingIdServSortOrder != null) out.setTransferTrackingIdServSortOrder(TransferTrackingIdServSortOrder);

    Filter[] TransferTrackingIdServFilter = DataHelper.mapToFilterArray(TransferTrackingIdServMap, Integer.class);
    if (TransferTrackingIdServFilter != null) {
      IntegerFilter[] TransferTrackingIdServFilters = new IntegerFilter[TransferTrackingIdServFilter.length];
      for (int i = 0; i < TransferTrackingIdServFilters.length; i++) {
        TransferTrackingIdServFilters[i] = (IntegerFilter)TransferTrackingIdServFilter[i];
      }
      try {
        out.setTransferTrackingIdServFilter(TransferTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalTransIdMap = (Map)record.get("ExternalTransId");
    Boolean ExternalTransIdFetch = DataHelper.getFetch(ExternalTransIdMap);
    Boolean ExternalTransIdSortDir = DataHelper.getSortDirection(ExternalTransIdMap);
    Integer ExternalTransIdSortOrder = DataHelper.getSortOrder(ExternalTransIdMap);
    if (ExternalTransIdFetch != null) out.setExternalTransIdFetch(ExternalTransIdFetch);
    if (ExternalTransIdSortDir != null) out.setExternalTransIdSortDirection(ExternalTransIdSortDir);
    if (ExternalTransIdSortOrder != null) out.setExternalTransIdSortOrder(ExternalTransIdSortOrder);

    Filter[] ExternalTransIdFilter = DataHelper.mapToFilterArray(ExternalTransIdMap, String.class);
    if (ExternalTransIdFilter != null) {
      StringFilter[] ExternalTransIdFilters = new StringFilter[ExternalTransIdFilter.length];
      for (int i = 0; i < ExternalTransIdFilters.length; i++) {
        ExternalTransIdFilters[i] = (StringFilter)ExternalTransIdFilter[i];
      }
      try {
        out.setExternalTransIdFilter(ExternalTransIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalDateMap = (Map)record.get("ExternalDate");
    Boolean ExternalDateFetch = DataHelper.getFetch(ExternalDateMap);
    Boolean ExternalDateSortDir = DataHelper.getSortDirection(ExternalDateMap);
    Integer ExternalDateSortOrder = DataHelper.getSortOrder(ExternalDateMap);
    if (ExternalDateFetch != null) out.setExternalDateFetch(ExternalDateFetch);
    if (ExternalDateSortDir != null) out.setExternalDateSortDirection(ExternalDateSortDir);
    if (ExternalDateSortOrder != null) out.setExternalDateSortOrder(ExternalDateSortOrder);

    Filter[] ExternalDateFilter = DataHelper.mapToFilterArray(ExternalDateMap, Date.class);
    if (ExternalDateFilter != null) {
      DateFilter[] ExternalDateFilters = new DateFilter[ExternalDateFilter.length];
      for (int i = 0; i < ExternalDateFilters.length; i++) {
        ExternalDateFilters[i] = (DateFilter)ExternalDateFilter[i];
      }
      try {
        out.setExternalDateFilter(ExternalDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalTransMsgMap = (Map)record.get("ExternalTransMsg");
    Boolean ExternalTransMsgFetch = DataHelper.getFetch(ExternalTransMsgMap);
    Boolean ExternalTransMsgSortDir = DataHelper.getSortDirection(ExternalTransMsgMap);
    Integer ExternalTransMsgSortOrder = DataHelper.getSortOrder(ExternalTransMsgMap);
    if (ExternalTransMsgFetch != null) out.setExternalTransMsgFetch(ExternalTransMsgFetch);
    if (ExternalTransMsgSortDir != null) out.setExternalTransMsgSortDirection(ExternalTransMsgSortDir);
    if (ExternalTransMsgSortOrder != null) out.setExternalTransMsgSortOrder(ExternalTransMsgSortOrder);

    Filter[] ExternalTransMsgFilter = DataHelper.mapToFilterArray(ExternalTransMsgMap, String.class);
    if (ExternalTransMsgFilter != null) {
      StringFilter[] ExternalTransMsgFilters = new StringFilter[ExternalTransMsgFilter.length];
      for (int i = 0; i < ExternalTransMsgFilters.length; i++) {
        ExternalTransMsgFilters[i] = (StringFilter)ExternalTransMsgFilter[i];
      }
      try {
        out.setExternalTransMsgFilter(ExternalTransMsgFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalTransInfoMap = (Map)record.get("ExternalTransInfo");
    Boolean ExternalTransInfoFetch = DataHelper.getFetch(ExternalTransInfoMap);
    Boolean ExternalTransInfoSortDir = DataHelper.getSortDirection(ExternalTransInfoMap);
    Integer ExternalTransInfoSortOrder = DataHelper.getSortOrder(ExternalTransInfoMap);
    if (ExternalTransInfoFetch != null) out.setExternalTransInfoFetch(ExternalTransInfoFetch);
    if (ExternalTransInfoSortDir != null) out.setExternalTransInfoSortDirection(ExternalTransInfoSortDir);
    if (ExternalTransInfoSortOrder != null) out.setExternalTransInfoSortOrder(ExternalTransInfoSortOrder);

    Filter[] ExternalTransInfoFilter = DataHelper.mapToFilterArray(ExternalTransInfoMap, String.class);
    if (ExternalTransInfoFilter != null) {
      StringFilter[] ExternalTransInfoFilters = new StringFilter[ExternalTransInfoFilter.length];
      for (int i = 0; i < ExternalTransInfoFilters.length; i++) {
        ExternalTransInfoFilters[i] = (StringFilter)ExternalTransInfoFilter[i];
      }
      try {
        out.setExternalTransInfoFilter(ExternalTransInfoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
