/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentDistributionObjectHelper.java
 * Definition File: Customer/PaymentDistribution.xml
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



/** Helper class to convert PaymentDistributionObject JavaBean objects to/from HashMaps.
 */
public class PaymentDistributionObjectHelper implements ArubaObjectHelper
{
  /** convert PaymentDistributionObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PaymentDistributionObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentDistributionObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentDistributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentDistributionObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentDistributionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentDistributionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentDistributionObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentDistributionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentDistributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentDistributionObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentDistributionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentDistributionObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PaymentDistributionObjectData the converted object
   */
  public static PaymentDistributionObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentDistributionObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentDistributionObject")
   * @return PaymentDistributionObjectData the converted object
   */
  public static PaymentDistributionObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentDistributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentDistributionObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PaymentDistributionObjectFilter the converted object
   */
  public static PaymentDistributionObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentDistributionObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentDistributionObject")
   * @return PaymentDistributionObjectFilter the converted object
   */
  public static PaymentDistributionObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentDistributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PaymentDistributionObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PaymentDistributionObjectDataList the converted object
   */
  public static PaymentDistributionObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PaymentDistributionObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PaymentDistributionObjectList")
   * @return PaymentDistributionObjectDataList the converted object
   */
  public static PaymentDistributionObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentDistributionObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PaymentDistributionObjectData[] array = null;
    if (root != null)
    {
      array = new PaymentDistributionObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PaymentDistributionObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PaymentDistributionObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PaymentDistributionObjectDataList (array, index, total);
  }
  /** convert PaymentDistributionObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentDistributionObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PaymentDistributionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._PrepayBalanceDescSet) record.put ("PrepayBalanceDesc", in.PrepayBalanceDesc);
  
    if (in._BmfOpenItemIdSet) record.put ("BmfOpenItemId", in.BmfOpenItemId);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._PaymentBillRefNoSet) record.put ("PaymentBillRefNo", in.PaymentBillRefNo);
  
    if (in._PaymentBillRefResetsSet) record.put ("PaymentBillRefResets", in.PaymentBillRefResets);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._OrigBillRefNoSet) record.put ("OrigBillRefNo", in.OrigBillRefNo);
  
    if (in._OrigBillRefResetsSet) record.put ("OrigBillRefResets", in.OrigBillRefResets);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._GlAmountSet) record.put ("GlAmount", in.GlAmount);
  
    if (in._StatusSet) record.put ("Status", in.Status);
  
    if (in._TransDateSet) record.put ("TransDate", in.TransDate);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._BmfTransTypeSet) record.put ("BmfTransType", in.BmfTransType);
  
    if (in._CurrencyGainLossSet) record.put ("CurrencyGainLoss", in.CurrencyGainLoss);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._LateFeeStatusSet) record.put ("LateFeeStatus", in.LateFeeStatus);
      return record;
  }
  /** convert PaymentDistributionObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentDistributionObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PaymentDistributionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.PrepayBalanceDesc, in.PrepayBalanceDescSort, in.PrepayBalanceDescSortAscending, in.PrepayBalanceDescFetch, in.PrepayBalanceDescCaseInsensitive);
      if (map != null) record.put ("PrepayBalanceDesc", map);
      map = DataHelper.filterToMap (in.BmfOpenItemId, in.BmfOpenItemIdSort, in.BmfOpenItemIdSortAscending, in.BmfOpenItemIdFetch);
      if (map != null) record.put ("BmfOpenItemId", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
      map = DataHelper.filterToMap (in.PaymentBillRefNo, in.PaymentBillRefNoSort, in.PaymentBillRefNoSortAscending, in.PaymentBillRefNoFetch);
      if (map != null) record.put ("PaymentBillRefNo", map);
      map = DataHelper.filterToMap (in.PaymentBillRefResets, in.PaymentBillRefResetsSort, in.PaymentBillRefResetsSortAscending, in.PaymentBillRefResetsFetch);
      if (map != null) record.put ("PaymentBillRefResets", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.OrigBillRefNo, in.OrigBillRefNoSort, in.OrigBillRefNoSortAscending, in.OrigBillRefNoFetch);
      if (map != null) record.put ("OrigBillRefNo", map);
      map = DataHelper.filterToMap (in.OrigBillRefResets, in.OrigBillRefResetsSort, in.OrigBillRefResetsSortAscending, in.OrigBillRefResetsFetch);
      if (map != null) record.put ("OrigBillRefResets", map);
      map = DataHelper.filterToMap (in.Amount, in.AmountSort, in.AmountSortAscending, in.AmountFetch);
      if (map != null) record.put ("Amount", map);
      map = DataHelper.filterToMap (in.GlAmount, in.GlAmountSort, in.GlAmountSortAscending, in.GlAmountFetch);
      if (map != null) record.put ("GlAmount", map);
      map = DataHelper.filterToMap (in.Status, in.StatusSort, in.StatusSortAscending, in.StatusFetch);
      if (map != null) record.put ("Status", map);
      map = DataHelper.filterToMap (in.TransDate, in.TransDateSort, in.TransDateSortAscending, in.TransDateFetch);
      if (map != null) record.put ("TransDate", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.BmfTransType, in.BmfTransTypeSort, in.BmfTransTypeSortAscending, in.BmfTransTypeFetch);
      if (map != null) record.put ("BmfTransType", map);
      map = DataHelper.filterToMap (in.CurrencyGainLoss, in.CurrencyGainLossSort, in.CurrencyGainLossSortAscending, in.CurrencyGainLossFetch);
      if (map != null) record.put ("CurrencyGainLoss", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.LateFeeStatus, in.LateFeeStatusSort, in.LateFeeStatusSortAscending, in.LateFeeStatusFetch);
      if (map != null) record.put ("LateFeeStatus", map);
    return record;
  }
  /** convert Map to PaymentDistributionObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentDistributionObjectData the converted object
   */
  public static PaymentDistributionObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentDistributionObjectData out = new PaymentDistributionObjectData ();

    out.Key = PaymentDistributionObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("PrepayBalanceDesc")) != null)
    {
      out.PrepayBalanceDesc = (String) obj;
    }
  
    if ((obj = record.get ("BmfOpenItemId")) != null)
    {
      out.BmfOpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("PaymentBillRefNo")) != null)
    {
      out.PaymentBillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("PaymentBillRefResets")) != null)
    {
      out.PaymentBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefNo")) != null)
    {
      out.OrigBillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefResets")) != null)
    {
      out.OrigBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("Amount")) != null)
    {
      out.Amount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("GlAmount")) != null)
    {
      out.GlAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (Integer) obj;
    }
  
    if ((obj = record.get ("TransDate")) != null)
    {
      out.TransDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("BmfTransType")) != null)
    {
      out.BmfTransType = (Integer) obj;
    }
  
    if ((obj = record.get ("CurrencyGainLoss")) != null)
    {
      out.CurrencyGainLoss = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("LateFeeStatus")) != null)
    {
      out.LateFeeStatus = (Integer) obj;
    }
      return out;
  }
  /** convert Map to PaymentDistributionObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentDistributionObjectFilter the converted object
   */
  public static PaymentDistributionObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentDistributionObjectFilter out = new PaymentDistributionObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PaymentDistributionObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map PrepayBalanceDescMap = (Map)record.get("PrepayBalanceDesc");
    Boolean PrepayBalanceDescFetch = DataHelper.getFetch(PrepayBalanceDescMap);
    Boolean PrepayBalanceDescSortDir = DataHelper.getSortDirection(PrepayBalanceDescMap);
    Integer PrepayBalanceDescSortOrder = DataHelper.getSortOrder(PrepayBalanceDescMap);
    if (PrepayBalanceDescFetch != null) out.setPrepayBalanceDescFetch(PrepayBalanceDescFetch);
    if (PrepayBalanceDescSortDir != null) out.setPrepayBalanceDescSortDirection(PrepayBalanceDescSortDir);
    if (PrepayBalanceDescSortOrder != null) out.setPrepayBalanceDescSortOrder(PrepayBalanceDescSortOrder);

    Filter[] PrepayBalanceDescFilter = DataHelper.mapToFilterArray(PrepayBalanceDescMap, String.class);
    if (PrepayBalanceDescFilter != null) {
      StringFilter[] PrepayBalanceDescFilters = new StringFilter[PrepayBalanceDescFilter.length];
      for (int i = 0; i < PrepayBalanceDescFilters.length; i++) {
        PrepayBalanceDescFilters[i] = (StringFilter)PrepayBalanceDescFilter[i];
      }
      try {
        out.setPrepayBalanceDescFilter(PrepayBalanceDescFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BmfOpenItemIdMap = (Map)record.get("BmfOpenItemId");
    Boolean BmfOpenItemIdFetch = DataHelper.getFetch(BmfOpenItemIdMap);
    Boolean BmfOpenItemIdSortDir = DataHelper.getSortDirection(BmfOpenItemIdMap);
    Integer BmfOpenItemIdSortOrder = DataHelper.getSortOrder(BmfOpenItemIdMap);
    if (BmfOpenItemIdFetch != null) out.setBmfOpenItemIdFetch(BmfOpenItemIdFetch);
    if (BmfOpenItemIdSortDir != null) out.setBmfOpenItemIdSortDirection(BmfOpenItemIdSortDir);
    if (BmfOpenItemIdSortOrder != null) out.setBmfOpenItemIdSortOrder(BmfOpenItemIdSortOrder);

    Filter[] BmfOpenItemIdFilter = DataHelper.mapToFilterArray(BmfOpenItemIdMap, Integer.class);
    if (BmfOpenItemIdFilter != null) {
      IntegerFilter[] BmfOpenItemIdFilters = new IntegerFilter[BmfOpenItemIdFilter.length];
      for (int i = 0; i < BmfOpenItemIdFilters.length; i++) {
        BmfOpenItemIdFilters[i] = (IntegerFilter)BmfOpenItemIdFilter[i];
      }
      try {
        out.setBmfOpenItemIdFilter(BmfOpenItemIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoBillMap = (Map)record.get("NoBill");
    Boolean NoBillFetch = DataHelper.getFetch(NoBillMap);
    Boolean NoBillSortDir = DataHelper.getSortDirection(NoBillMap);
    Integer NoBillSortOrder = DataHelper.getSortOrder(NoBillMap);
    if (NoBillFetch != null) out.setNoBillFetch(NoBillFetch);
    if (NoBillSortDir != null) out.setNoBillSortDirection(NoBillSortDir);
    if (NoBillSortOrder != null) out.setNoBillSortOrder(NoBillSortOrder);

    Filter[] NoBillFilter = DataHelper.mapToFilterArray(NoBillMap, Boolean.class);
    if (NoBillFilter != null) {
      BooleanFilter[] NoBillFilters = new BooleanFilter[NoBillFilter.length];
      for (int i = 0; i < NoBillFilters.length; i++) {
        NoBillFilters[i] = (BooleanFilter)NoBillFilter[i];
      }
      try {
        out.setNoBillFilter(NoBillFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PaymentBillRefNoMap = (Map)record.get("PaymentBillRefNo");
    Boolean PaymentBillRefNoFetch = DataHelper.getFetch(PaymentBillRefNoMap);
    Boolean PaymentBillRefNoSortDir = DataHelper.getSortDirection(PaymentBillRefNoMap);
    Integer PaymentBillRefNoSortOrder = DataHelper.getSortOrder(PaymentBillRefNoMap);
    if (PaymentBillRefNoFetch != null) out.setPaymentBillRefNoFetch(PaymentBillRefNoFetch);
    if (PaymentBillRefNoSortDir != null) out.setPaymentBillRefNoSortDirection(PaymentBillRefNoSortDir);
    if (PaymentBillRefNoSortOrder != null) out.setPaymentBillRefNoSortOrder(PaymentBillRefNoSortOrder);

    Filter[] PaymentBillRefNoFilter = DataHelper.mapToFilterArray(PaymentBillRefNoMap, Integer.class);
    if (PaymentBillRefNoFilter != null) {
      IntegerFilter[] PaymentBillRefNoFilters = new IntegerFilter[PaymentBillRefNoFilter.length];
      for (int i = 0; i < PaymentBillRefNoFilters.length; i++) {
        PaymentBillRefNoFilters[i] = (IntegerFilter)PaymentBillRefNoFilter[i];
      }
      try {
        out.setPaymentBillRefNoFilter(PaymentBillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PaymentBillRefResetsMap = (Map)record.get("PaymentBillRefResets");
    Boolean PaymentBillRefResetsFetch = DataHelper.getFetch(PaymentBillRefResetsMap);
    Boolean PaymentBillRefResetsSortDir = DataHelper.getSortDirection(PaymentBillRefResetsMap);
    Integer PaymentBillRefResetsSortOrder = DataHelper.getSortOrder(PaymentBillRefResetsMap);
    if (PaymentBillRefResetsFetch != null) out.setPaymentBillRefResetsFetch(PaymentBillRefResetsFetch);
    if (PaymentBillRefResetsSortDir != null) out.setPaymentBillRefResetsSortDirection(PaymentBillRefResetsSortDir);
    if (PaymentBillRefResetsSortOrder != null) out.setPaymentBillRefResetsSortOrder(PaymentBillRefResetsSortOrder);

    Filter[] PaymentBillRefResetsFilter = DataHelper.mapToFilterArray(PaymentBillRefResetsMap, Integer.class);
    if (PaymentBillRefResetsFilter != null) {
      IntegerFilter[] PaymentBillRefResetsFilters = new IntegerFilter[PaymentBillRefResetsFilter.length];
      for (int i = 0; i < PaymentBillRefResetsFilters.length; i++) {
        PaymentBillRefResetsFilters[i] = (IntegerFilter)PaymentBillRefResetsFilter[i];
      }
      try {
        out.setPaymentBillRefResetsFilter(PaymentBillRefResetsFilters);
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
  
    Map OrigBillRefNoMap = (Map)record.get("OrigBillRefNo");
    Boolean OrigBillRefNoFetch = DataHelper.getFetch(OrigBillRefNoMap);
    Boolean OrigBillRefNoSortDir = DataHelper.getSortDirection(OrigBillRefNoMap);
    Integer OrigBillRefNoSortOrder = DataHelper.getSortOrder(OrigBillRefNoMap);
    if (OrigBillRefNoFetch != null) out.setOrigBillRefNoFetch(OrigBillRefNoFetch);
    if (OrigBillRefNoSortDir != null) out.setOrigBillRefNoSortDirection(OrigBillRefNoSortDir);
    if (OrigBillRefNoSortOrder != null) out.setOrigBillRefNoSortOrder(OrigBillRefNoSortOrder);

    Filter[] OrigBillRefNoFilter = DataHelper.mapToFilterArray(OrigBillRefNoMap, Integer.class);
    if (OrigBillRefNoFilter != null) {
      IntegerFilter[] OrigBillRefNoFilters = new IntegerFilter[OrigBillRefNoFilter.length];
      for (int i = 0; i < OrigBillRefNoFilters.length; i++) {
        OrigBillRefNoFilters[i] = (IntegerFilter)OrigBillRefNoFilter[i];
      }
      try {
        out.setOrigBillRefNoFilter(OrigBillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBillRefResetsMap = (Map)record.get("OrigBillRefResets");
    Boolean OrigBillRefResetsFetch = DataHelper.getFetch(OrigBillRefResetsMap);
    Boolean OrigBillRefResetsSortDir = DataHelper.getSortDirection(OrigBillRefResetsMap);
    Integer OrigBillRefResetsSortOrder = DataHelper.getSortOrder(OrigBillRefResetsMap);
    if (OrigBillRefResetsFetch != null) out.setOrigBillRefResetsFetch(OrigBillRefResetsFetch);
    if (OrigBillRefResetsSortDir != null) out.setOrigBillRefResetsSortDirection(OrigBillRefResetsSortDir);
    if (OrigBillRefResetsSortOrder != null) out.setOrigBillRefResetsSortOrder(OrigBillRefResetsSortOrder);

    Filter[] OrigBillRefResetsFilter = DataHelper.mapToFilterArray(OrigBillRefResetsMap, Integer.class);
    if (OrigBillRefResetsFilter != null) {
      IntegerFilter[] OrigBillRefResetsFilters = new IntegerFilter[OrigBillRefResetsFilter.length];
      for (int i = 0; i < OrigBillRefResetsFilters.length; i++) {
        OrigBillRefResetsFilters[i] = (IntegerFilter)OrigBillRefResetsFilter[i];
      }
      try {
        out.setOrigBillRefResetsFilter(OrigBillRefResetsFilters);
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
  
    Map GlAmountMap = (Map)record.get("GlAmount");
    Boolean GlAmountFetch = DataHelper.getFetch(GlAmountMap);
    Boolean GlAmountSortDir = DataHelper.getSortDirection(GlAmountMap);
    Integer GlAmountSortOrder = DataHelper.getSortOrder(GlAmountMap);
    if (GlAmountFetch != null) out.setGlAmountFetch(GlAmountFetch);
    if (GlAmountSortDir != null) out.setGlAmountSortDirection(GlAmountSortDir);
    if (GlAmountSortOrder != null) out.setGlAmountSortOrder(GlAmountSortOrder);

    Filter[] GlAmountFilter = DataHelper.mapToFilterArray(GlAmountMap, BigInteger.class);
    if (GlAmountFilter != null) {
      BigIntegerFilter[] GlAmountFilters = new BigIntegerFilter[GlAmountFilter.length];
      for (int i = 0; i < GlAmountFilters.length; i++) {
        GlAmountFilters[i] = (BigIntegerFilter)GlAmountFilter[i];
      }
      try {
        out.setGlAmountFilter(GlAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatusMap = (Map)record.get("Status");
    Boolean StatusFetch = DataHelper.getFetch(StatusMap);
    Boolean StatusSortDir = DataHelper.getSortDirection(StatusMap);
    Integer StatusSortOrder = DataHelper.getSortOrder(StatusMap);
    if (StatusFetch != null) out.setStatusFetch(StatusFetch);
    if (StatusSortDir != null) out.setStatusSortDirection(StatusSortDir);
    if (StatusSortOrder != null) out.setStatusSortOrder(StatusSortOrder);

    Filter[] StatusFilter = DataHelper.mapToFilterArray(StatusMap, Integer.class);
    if (StatusFilter != null) {
      IntegerFilter[] StatusFilters = new IntegerFilter[StatusFilter.length];
      for (int i = 0; i < StatusFilters.length; i++) {
        StatusFilters[i] = (IntegerFilter)StatusFilter[i];
      }
      try {
        out.setStatusFilter(StatusFilters);
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
  
    Map ChgDateMap = (Map)record.get("ChgDate");
    Boolean ChgDateFetch = DataHelper.getFetch(ChgDateMap);
    Boolean ChgDateSortDir = DataHelper.getSortDirection(ChgDateMap);
    Integer ChgDateSortOrder = DataHelper.getSortOrder(ChgDateMap);
    if (ChgDateFetch != null) out.setChgDateFetch(ChgDateFetch);
    if (ChgDateSortDir != null) out.setChgDateSortDirection(ChgDateSortDir);
    if (ChgDateSortOrder != null) out.setChgDateSortOrder(ChgDateSortOrder);

    Filter[] ChgDateFilter = DataHelper.mapToFilterArray(ChgDateMap, Date.class);
    if (ChgDateFilter != null) {
      DateFilter[] ChgDateFilters = new DateFilter[ChgDateFilter.length];
      for (int i = 0; i < ChgDateFilters.length; i++) {
        ChgDateFilters[i] = (DateFilter)ChgDateFilter[i];
      }
      try {
        out.setChgDateFilter(ChgDateFilters);
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
  
    Map BmfTransTypeMap = (Map)record.get("BmfTransType");
    Boolean BmfTransTypeFetch = DataHelper.getFetch(BmfTransTypeMap);
    Boolean BmfTransTypeSortDir = DataHelper.getSortDirection(BmfTransTypeMap);
    Integer BmfTransTypeSortOrder = DataHelper.getSortOrder(BmfTransTypeMap);
    if (BmfTransTypeFetch != null) out.setBmfTransTypeFetch(BmfTransTypeFetch);
    if (BmfTransTypeSortDir != null) out.setBmfTransTypeSortDirection(BmfTransTypeSortDir);
    if (BmfTransTypeSortOrder != null) out.setBmfTransTypeSortOrder(BmfTransTypeSortOrder);

    Filter[] BmfTransTypeFilter = DataHelper.mapToFilterArray(BmfTransTypeMap, Integer.class);
    if (BmfTransTypeFilter != null) {
      IntegerFilter[] BmfTransTypeFilters = new IntegerFilter[BmfTransTypeFilter.length];
      for (int i = 0; i < BmfTransTypeFilters.length; i++) {
        BmfTransTypeFilters[i] = (IntegerFilter)BmfTransTypeFilter[i];
      }
      try {
        out.setBmfTransTypeFilter(BmfTransTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyGainLossMap = (Map)record.get("CurrencyGainLoss");
    Boolean CurrencyGainLossFetch = DataHelper.getFetch(CurrencyGainLossMap);
    Boolean CurrencyGainLossSortDir = DataHelper.getSortDirection(CurrencyGainLossMap);
    Integer CurrencyGainLossSortOrder = DataHelper.getSortOrder(CurrencyGainLossMap);
    if (CurrencyGainLossFetch != null) out.setCurrencyGainLossFetch(CurrencyGainLossFetch);
    if (CurrencyGainLossSortDir != null) out.setCurrencyGainLossSortDirection(CurrencyGainLossSortDir);
    if (CurrencyGainLossSortOrder != null) out.setCurrencyGainLossSortOrder(CurrencyGainLossSortOrder);

    Filter[] CurrencyGainLossFilter = DataHelper.mapToFilterArray(CurrencyGainLossMap, BigInteger.class);
    if (CurrencyGainLossFilter != null) {
      BigIntegerFilter[] CurrencyGainLossFilters = new BigIntegerFilter[CurrencyGainLossFilter.length];
      for (int i = 0; i < CurrencyGainLossFilters.length; i++) {
        CurrencyGainLossFilters[i] = (BigIntegerFilter)CurrencyGainLossFilter[i];
      }
      try {
        out.setCurrencyGainLossFilter(CurrencyGainLossFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, Integer.class);
    if (CurrencyCodeFilter != null) {
      IntegerFilter[] CurrencyCodeFilters = new IntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (IntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OpenItemIdMap = (Map)record.get("OpenItemId");
    Boolean OpenItemIdFetch = DataHelper.getFetch(OpenItemIdMap);
    Boolean OpenItemIdSortDir = DataHelper.getSortDirection(OpenItemIdMap);
    Integer OpenItemIdSortOrder = DataHelper.getSortOrder(OpenItemIdMap);
    if (OpenItemIdFetch != null) out.setOpenItemIdFetch(OpenItemIdFetch);
    if (OpenItemIdSortDir != null) out.setOpenItemIdSortDirection(OpenItemIdSortDir);
    if (OpenItemIdSortOrder != null) out.setOpenItemIdSortOrder(OpenItemIdSortOrder);

    Filter[] OpenItemIdFilter = DataHelper.mapToFilterArray(OpenItemIdMap, Integer.class);
    if (OpenItemIdFilter != null) {
      IntegerFilter[] OpenItemIdFilters = new IntegerFilter[OpenItemIdFilter.length];
      for (int i = 0; i < OpenItemIdFilters.length; i++) {
        OpenItemIdFilters[i] = (IntegerFilter)OpenItemIdFilter[i];
      }
      try {
        out.setOpenItemIdFilter(OpenItemIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LateFeeStatusMap = (Map)record.get("LateFeeStatus");
    Boolean LateFeeStatusFetch = DataHelper.getFetch(LateFeeStatusMap);
    Boolean LateFeeStatusSortDir = DataHelper.getSortDirection(LateFeeStatusMap);
    Integer LateFeeStatusSortOrder = DataHelper.getSortOrder(LateFeeStatusMap);
    if (LateFeeStatusFetch != null) out.setLateFeeStatusFetch(LateFeeStatusFetch);
    if (LateFeeStatusSortDir != null) out.setLateFeeStatusSortDirection(LateFeeStatusSortDir);
    if (LateFeeStatusSortOrder != null) out.setLateFeeStatusSortOrder(LateFeeStatusSortOrder);

    Filter[] LateFeeStatusFilter = DataHelper.mapToFilterArray(LateFeeStatusMap, Integer.class);
    if (LateFeeStatusFilter != null) {
      IntegerFilter[] LateFeeStatusFilters = new IntegerFilter[LateFeeStatusFilter.length];
      for (int i = 0; i < LateFeeStatusFilters.length; i++) {
        LateFeeStatusFilters[i] = (IntegerFilter)LateFeeStatusFilter[i];
      }
      try {
        out.setLateFeeStatusFilter(LateFeeStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
