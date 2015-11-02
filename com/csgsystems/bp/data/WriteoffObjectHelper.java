/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: WriteoffObjectHelper.java
 * Definition File: Customer/Writeoff.xml
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



/** Helper class to convert WriteoffObject JavaBean objects to/from HashMaps.
 */
public class WriteoffObjectHelper implements ArubaObjectHelper
{
  /** convert WriteoffObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (WriteoffObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert WriteoffObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "WriteoffObject")
   * @return Map     the output Map
   */
  public static Map toMap (WriteoffObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "WriteoffObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert WriteoffObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (WriteoffObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert WriteoffObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "WriteoffObject")
   * @return Map     the output Map
   */
  public static Map toMap (WriteoffObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "WriteoffObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to WriteoffObjectData.
   * @param record the Map containing the data to convert to the object
   * @return WriteoffObjectData the converted object
   */
  public static WriteoffObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to WriteoffObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "WriteoffObject")
   * @return WriteoffObjectData the converted object
   */
  public static WriteoffObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "WriteoffObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to WriteoffObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return WriteoffObjectFilter the converted object
   */
  public static WriteoffObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to WriteoffObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "WriteoffObject")
   * @return WriteoffObjectFilter the converted object
   */
  public static WriteoffObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "WriteoffObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to WriteoffObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return WriteoffObjectDataList the converted object
   */
  public static WriteoffObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to WriteoffObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "WriteoffObjectList")
   * @return WriteoffObjectDataList the converted object
   */
  public static WriteoffObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "WriteoffObjectList";
    Object[] root = (Object[]) record.get (rootName);
    WriteoffObjectData[] array = null;
    if (root != null)
    {
      array = new WriteoffObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = WriteoffObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new WriteoffObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new WriteoffObjectDataList (array, index, total);
  }
  /** convert WriteoffObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (WriteoffObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", WriteoffObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._MicrBankIdSet) record.put ("MicrBankId", in.MicrBankId);
  
    if (in._WriteoffTypeCodeSet) record.put ("WriteoffTypeCode", in.WriteoffTypeCode);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._ChargeDateSet) record.put ("ChargeDate", in.ChargeDate);
  
    if (in._TaxClassSet) record.put ("TaxClass", in.TaxClass);
  
    if (in._TaxDateSet) record.put ("TaxDate", in.TaxDate);
  
    if (in._WriteoffTransDateSet) record.put ("WriteoffTransDate", in.WriteoffTransDate);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._BmfSourceTypeSet) record.put ("BmfSourceType", in.BmfSourceType);
  
    if (in._BmfTrackingIdSet) record.put ("BmfTrackingId", in.BmfTrackingId);
  
    if (in._BmfTrackingIdServSet) record.put ("BmfTrackingIdServ", in.BmfTrackingIdServ);
  
    if (in._OrigTrackingIdSet) record.put ("OrigTrackingId", in.OrigTrackingId);
  
    if (in._OrigTrackingIdServSet) record.put ("OrigTrackingIdServ", in.OrigTrackingIdServ);
      return record;
  }
  /** convert WriteoffObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (WriteoffObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", WriteoffObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.MicrBankId, in.MicrBankIdSort, in.MicrBankIdSortAscending, in.MicrBankIdFetch, in.MicrBankIdCaseInsensitive);
      if (map != null) record.put ("MicrBankId", map);
      map = DataHelper.filterToMap (in.WriteoffTypeCode, in.WriteoffTypeCodeSort, in.WriteoffTypeCodeSortAscending, in.WriteoffTypeCodeFetch);
      if (map != null) record.put ("WriteoffTypeCode", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.ChargeDate, in.ChargeDateSort, in.ChargeDateSortAscending, in.ChargeDateFetch);
      if (map != null) record.put ("ChargeDate", map);
      map = DataHelper.filterToMap (in.TaxClass, in.TaxClassSort, in.TaxClassSortAscending, in.TaxClassFetch);
      if (map != null) record.put ("TaxClass", map);
      map = DataHelper.filterToMap (in.TaxDate, in.TaxDateSort, in.TaxDateSortAscending, in.TaxDateFetch);
      if (map != null) record.put ("TaxDate", map);
      map = DataHelper.filterToMap (in.WriteoffTransDate, in.WriteoffTransDateSort, in.WriteoffTransDateSortAscending, in.WriteoffTransDateFetch);
      if (map != null) record.put ("WriteoffTransDate", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.Amount, in.AmountSort, in.AmountSortAscending, in.AmountFetch);
      if (map != null) record.put ("Amount", map);
      map = DataHelper.filterToMap (in.BmfSourceType, in.BmfSourceTypeSort, in.BmfSourceTypeSortAscending, in.BmfSourceTypeFetch);
      if (map != null) record.put ("BmfSourceType", map);
      map = DataHelper.filterToMap (in.BmfTrackingId, in.BmfTrackingIdSort, in.BmfTrackingIdSortAscending, in.BmfTrackingIdFetch);
      if (map != null) record.put ("BmfTrackingId", map);
      map = DataHelper.filterToMap (in.BmfTrackingIdServ, in.BmfTrackingIdServSort, in.BmfTrackingIdServSortAscending, in.BmfTrackingIdServFetch);
      if (map != null) record.put ("BmfTrackingIdServ", map);
      map = DataHelper.filterToMap (in.OrigTrackingId, in.OrigTrackingIdSort, in.OrigTrackingIdSortAscending, in.OrigTrackingIdFetch);
      if (map != null) record.put ("OrigTrackingId", map);
      map = DataHelper.filterToMap (in.OrigTrackingIdServ, in.OrigTrackingIdServSort, in.OrigTrackingIdServSortAscending, in.OrigTrackingIdServFetch);
      if (map != null) record.put ("OrigTrackingIdServ", map);
    return record;
  }
  /** convert Map to WriteoffObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return WriteoffObjectData the converted object
   */
  public static WriteoffObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    WriteoffObjectData out = new WriteoffObjectData ();

    out.Key = WriteoffObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("MicrBankId")) != null)
    {
      out.MicrBankId = (String) obj;
    }
  
    if ((obj = record.get ("WriteoffTypeCode")) != null)
    {
      out.WriteoffTypeCode = (Integer) obj;
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
  
    if ((obj = record.get ("ChargeDate")) != null)
    {
      out.ChargeDate = (Date) obj;
    }
  
    if ((obj = record.get ("TaxClass")) != null)
    {
      out.TaxClass = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxDate")) != null)
    {
      out.TaxDate = (Date) obj;
    }
  
    if ((obj = record.get ("WriteoffTransDate")) != null)
    {
      out.WriteoffTransDate = (Date) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Amount")) != null)
    {
      out.Amount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BmfSourceType")) != null)
    {
      out.BmfSourceType = (Integer) obj;
    }
  
    if ((obj = record.get ("BmfTrackingId")) != null)
    {
      out.BmfTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("BmfTrackingIdServ")) != null)
    {
      out.BmfTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingId")) != null)
    {
      out.OrigTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingIdServ")) != null)
    {
      out.OrigTrackingIdServ = (Integer) obj;
    }
      return out;
  }
  /** convert Map to WriteoffObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return WriteoffObjectFilter the converted object
   */
  public static WriteoffObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    WriteoffObjectFilter out = new WriteoffObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = WriteoffObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map MicrBankIdMap = (Map)record.get("MicrBankId");
    Boolean MicrBankIdFetch = DataHelper.getFetch(MicrBankIdMap);
    Boolean MicrBankIdSortDir = DataHelper.getSortDirection(MicrBankIdMap);
    Integer MicrBankIdSortOrder = DataHelper.getSortOrder(MicrBankIdMap);
    if (MicrBankIdFetch != null) out.setMicrBankIdFetch(MicrBankIdFetch);
    if (MicrBankIdSortDir != null) out.setMicrBankIdSortDirection(MicrBankIdSortDir);
    if (MicrBankIdSortOrder != null) out.setMicrBankIdSortOrder(MicrBankIdSortOrder);

    Filter[] MicrBankIdFilter = DataHelper.mapToFilterArray(MicrBankIdMap, String.class);
    if (MicrBankIdFilter != null) {
      StringFilter[] MicrBankIdFilters = new StringFilter[MicrBankIdFilter.length];
      for (int i = 0; i < MicrBankIdFilters.length; i++) {
        MicrBankIdFilters[i] = (StringFilter)MicrBankIdFilter[i];
      }
      try {
        out.setMicrBankIdFilter(MicrBankIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map WriteoffTypeCodeMap = (Map)record.get("WriteoffTypeCode");
    Boolean WriteoffTypeCodeFetch = DataHelper.getFetch(WriteoffTypeCodeMap);
    Boolean WriteoffTypeCodeSortDir = DataHelper.getSortDirection(WriteoffTypeCodeMap);
    Integer WriteoffTypeCodeSortOrder = DataHelper.getSortOrder(WriteoffTypeCodeMap);
    if (WriteoffTypeCodeFetch != null) out.setWriteoffTypeCodeFetch(WriteoffTypeCodeFetch);
    if (WriteoffTypeCodeSortDir != null) out.setWriteoffTypeCodeSortDirection(WriteoffTypeCodeSortDir);
    if (WriteoffTypeCodeSortOrder != null) out.setWriteoffTypeCodeSortOrder(WriteoffTypeCodeSortOrder);

    Filter[] WriteoffTypeCodeFilter = DataHelper.mapToFilterArray(WriteoffTypeCodeMap, Integer.class);
    if (WriteoffTypeCodeFilter != null) {
      IntegerFilter[] WriteoffTypeCodeFilters = new IntegerFilter[WriteoffTypeCodeFilter.length];
      for (int i = 0; i < WriteoffTypeCodeFilters.length; i++) {
        WriteoffTypeCodeFilters[i] = (IntegerFilter)WriteoffTypeCodeFilter[i];
      }
      try {
        out.setWriteoffTypeCodeFilter(WriteoffTypeCodeFilters);
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
  
    Map ChargeDateMap = (Map)record.get("ChargeDate");
    Boolean ChargeDateFetch = DataHelper.getFetch(ChargeDateMap);
    Boolean ChargeDateSortDir = DataHelper.getSortDirection(ChargeDateMap);
    Integer ChargeDateSortOrder = DataHelper.getSortOrder(ChargeDateMap);
    if (ChargeDateFetch != null) out.setChargeDateFetch(ChargeDateFetch);
    if (ChargeDateSortDir != null) out.setChargeDateSortDirection(ChargeDateSortDir);
    if (ChargeDateSortOrder != null) out.setChargeDateSortOrder(ChargeDateSortOrder);

    Filter[] ChargeDateFilter = DataHelper.mapToFilterArray(ChargeDateMap, Date.class);
    if (ChargeDateFilter != null) {
      DateFilter[] ChargeDateFilters = new DateFilter[ChargeDateFilter.length];
      for (int i = 0; i < ChargeDateFilters.length; i++) {
        ChargeDateFilters[i] = (DateFilter)ChargeDateFilter[i];
      }
      try {
        out.setChargeDateFilter(ChargeDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxClassMap = (Map)record.get("TaxClass");
    Boolean TaxClassFetch = DataHelper.getFetch(TaxClassMap);
    Boolean TaxClassSortDir = DataHelper.getSortDirection(TaxClassMap);
    Integer TaxClassSortOrder = DataHelper.getSortOrder(TaxClassMap);
    if (TaxClassFetch != null) out.setTaxClassFetch(TaxClassFetch);
    if (TaxClassSortDir != null) out.setTaxClassSortDirection(TaxClassSortDir);
    if (TaxClassSortOrder != null) out.setTaxClassSortOrder(TaxClassSortOrder);

    Filter[] TaxClassFilter = DataHelper.mapToFilterArray(TaxClassMap, Integer.class);
    if (TaxClassFilter != null) {
      IntegerFilter[] TaxClassFilters = new IntegerFilter[TaxClassFilter.length];
      for (int i = 0; i < TaxClassFilters.length; i++) {
        TaxClassFilters[i] = (IntegerFilter)TaxClassFilter[i];
      }
      try {
        out.setTaxClassFilter(TaxClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxDateMap = (Map)record.get("TaxDate");
    Boolean TaxDateFetch = DataHelper.getFetch(TaxDateMap);
    Boolean TaxDateSortDir = DataHelper.getSortDirection(TaxDateMap);
    Integer TaxDateSortOrder = DataHelper.getSortOrder(TaxDateMap);
    if (TaxDateFetch != null) out.setTaxDateFetch(TaxDateFetch);
    if (TaxDateSortDir != null) out.setTaxDateSortDirection(TaxDateSortDir);
    if (TaxDateSortOrder != null) out.setTaxDateSortOrder(TaxDateSortOrder);

    Filter[] TaxDateFilter = DataHelper.mapToFilterArray(TaxDateMap, Date.class);
    if (TaxDateFilter != null) {
      DateFilter[] TaxDateFilters = new DateFilter[TaxDateFilter.length];
      for (int i = 0; i < TaxDateFilters.length; i++) {
        TaxDateFilters[i] = (DateFilter)TaxDateFilter[i];
      }
      try {
        out.setTaxDateFilter(TaxDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map WriteoffTransDateMap = (Map)record.get("WriteoffTransDate");
    Boolean WriteoffTransDateFetch = DataHelper.getFetch(WriteoffTransDateMap);
    Boolean WriteoffTransDateSortDir = DataHelper.getSortDirection(WriteoffTransDateMap);
    Integer WriteoffTransDateSortOrder = DataHelper.getSortOrder(WriteoffTransDateMap);
    if (WriteoffTransDateFetch != null) out.setWriteoffTransDateFetch(WriteoffTransDateFetch);
    if (WriteoffTransDateSortDir != null) out.setWriteoffTransDateSortDirection(WriteoffTransDateSortDir);
    if (WriteoffTransDateSortOrder != null) out.setWriteoffTransDateSortOrder(WriteoffTransDateSortOrder);

    Filter[] WriteoffTransDateFilter = DataHelper.mapToFilterArray(WriteoffTransDateMap, Date.class);
    if (WriteoffTransDateFilter != null) {
      DateFilter[] WriteoffTransDateFilters = new DateFilter[WriteoffTransDateFilter.length];
      for (int i = 0; i < WriteoffTransDateFilters.length; i++) {
        WriteoffTransDateFilters[i] = (DateFilter)WriteoffTransDateFilter[i];
      }
      try {
        out.setWriteoffTransDateFilter(WriteoffTransDateFilters);
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
  
    Map BmfSourceTypeMap = (Map)record.get("BmfSourceType");
    Boolean BmfSourceTypeFetch = DataHelper.getFetch(BmfSourceTypeMap);
    Boolean BmfSourceTypeSortDir = DataHelper.getSortDirection(BmfSourceTypeMap);
    Integer BmfSourceTypeSortOrder = DataHelper.getSortOrder(BmfSourceTypeMap);
    if (BmfSourceTypeFetch != null) out.setBmfSourceTypeFetch(BmfSourceTypeFetch);
    if (BmfSourceTypeSortDir != null) out.setBmfSourceTypeSortDirection(BmfSourceTypeSortDir);
    if (BmfSourceTypeSortOrder != null) out.setBmfSourceTypeSortOrder(BmfSourceTypeSortOrder);

    Filter[] BmfSourceTypeFilter = DataHelper.mapToFilterArray(BmfSourceTypeMap, Integer.class);
    if (BmfSourceTypeFilter != null) {
      IntegerFilter[] BmfSourceTypeFilters = new IntegerFilter[BmfSourceTypeFilter.length];
      for (int i = 0; i < BmfSourceTypeFilters.length; i++) {
        BmfSourceTypeFilters[i] = (IntegerFilter)BmfSourceTypeFilter[i];
      }
      try {
        out.setBmfSourceTypeFilter(BmfSourceTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BmfTrackingIdMap = (Map)record.get("BmfTrackingId");
    Boolean BmfTrackingIdFetch = DataHelper.getFetch(BmfTrackingIdMap);
    Boolean BmfTrackingIdSortDir = DataHelper.getSortDirection(BmfTrackingIdMap);
    Integer BmfTrackingIdSortOrder = DataHelper.getSortOrder(BmfTrackingIdMap);
    if (BmfTrackingIdFetch != null) out.setBmfTrackingIdFetch(BmfTrackingIdFetch);
    if (BmfTrackingIdSortDir != null) out.setBmfTrackingIdSortDirection(BmfTrackingIdSortDir);
    if (BmfTrackingIdSortOrder != null) out.setBmfTrackingIdSortOrder(BmfTrackingIdSortOrder);

    Filter[] BmfTrackingIdFilter = DataHelper.mapToFilterArray(BmfTrackingIdMap, Integer.class);
    if (BmfTrackingIdFilter != null) {
      IntegerFilter[] BmfTrackingIdFilters = new IntegerFilter[BmfTrackingIdFilter.length];
      for (int i = 0; i < BmfTrackingIdFilters.length; i++) {
        BmfTrackingIdFilters[i] = (IntegerFilter)BmfTrackingIdFilter[i];
      }
      try {
        out.setBmfTrackingIdFilter(BmfTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BmfTrackingIdServMap = (Map)record.get("BmfTrackingIdServ");
    Boolean BmfTrackingIdServFetch = DataHelper.getFetch(BmfTrackingIdServMap);
    Boolean BmfTrackingIdServSortDir = DataHelper.getSortDirection(BmfTrackingIdServMap);
    Integer BmfTrackingIdServSortOrder = DataHelper.getSortOrder(BmfTrackingIdServMap);
    if (BmfTrackingIdServFetch != null) out.setBmfTrackingIdServFetch(BmfTrackingIdServFetch);
    if (BmfTrackingIdServSortDir != null) out.setBmfTrackingIdServSortDirection(BmfTrackingIdServSortDir);
    if (BmfTrackingIdServSortOrder != null) out.setBmfTrackingIdServSortOrder(BmfTrackingIdServSortOrder);

    Filter[] BmfTrackingIdServFilter = DataHelper.mapToFilterArray(BmfTrackingIdServMap, Integer.class);
    if (BmfTrackingIdServFilter != null) {
      IntegerFilter[] BmfTrackingIdServFilters = new IntegerFilter[BmfTrackingIdServFilter.length];
      for (int i = 0; i < BmfTrackingIdServFilters.length; i++) {
        BmfTrackingIdServFilters[i] = (IntegerFilter)BmfTrackingIdServFilter[i];
      }
      try {
        out.setBmfTrackingIdServFilter(BmfTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTrackingIdMap = (Map)record.get("OrigTrackingId");
    Boolean OrigTrackingIdFetch = DataHelper.getFetch(OrigTrackingIdMap);
    Boolean OrigTrackingIdSortDir = DataHelper.getSortDirection(OrigTrackingIdMap);
    Integer OrigTrackingIdSortOrder = DataHelper.getSortOrder(OrigTrackingIdMap);
    if (OrigTrackingIdFetch != null) out.setOrigTrackingIdFetch(OrigTrackingIdFetch);
    if (OrigTrackingIdSortDir != null) out.setOrigTrackingIdSortDirection(OrigTrackingIdSortDir);
    if (OrigTrackingIdSortOrder != null) out.setOrigTrackingIdSortOrder(OrigTrackingIdSortOrder);

    Filter[] OrigTrackingIdFilter = DataHelper.mapToFilterArray(OrigTrackingIdMap, Integer.class);
    if (OrigTrackingIdFilter != null) {
      IntegerFilter[] OrigTrackingIdFilters = new IntegerFilter[OrigTrackingIdFilter.length];
      for (int i = 0; i < OrigTrackingIdFilters.length; i++) {
        OrigTrackingIdFilters[i] = (IntegerFilter)OrigTrackingIdFilter[i];
      }
      try {
        out.setOrigTrackingIdFilter(OrigTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTrackingIdServMap = (Map)record.get("OrigTrackingIdServ");
    Boolean OrigTrackingIdServFetch = DataHelper.getFetch(OrigTrackingIdServMap);
    Boolean OrigTrackingIdServSortDir = DataHelper.getSortDirection(OrigTrackingIdServMap);
    Integer OrigTrackingIdServSortOrder = DataHelper.getSortOrder(OrigTrackingIdServMap);
    if (OrigTrackingIdServFetch != null) out.setOrigTrackingIdServFetch(OrigTrackingIdServFetch);
    if (OrigTrackingIdServSortDir != null) out.setOrigTrackingIdServSortDirection(OrigTrackingIdServSortDir);
    if (OrigTrackingIdServSortOrder != null) out.setOrigTrackingIdServSortOrder(OrigTrackingIdServSortOrder);

    Filter[] OrigTrackingIdServFilter = DataHelper.mapToFilterArray(OrigTrackingIdServMap, Integer.class);
    if (OrigTrackingIdServFilter != null) {
      IntegerFilter[] OrigTrackingIdServFilters = new IntegerFilter[OrigTrackingIdServFilter.length];
      for (int i = 0; i < OrigTrackingIdServFilters.length; i++) {
        OrigTrackingIdServFilters[i] = (IntegerFilter)OrigTrackingIdServFilter[i];
      }
      try {
        out.setOrigTrackingIdServFilter(OrigTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
