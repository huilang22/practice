/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: DepositObjectHelper.java
 * Definition File: Customer/Deposit.xml
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

import com.csgsystems.bp.data.*;


/** Helper class to convert DepositObject JavaBean objects to/from HashMaps.
 */
public class DepositObjectHelper implements ArubaObjectHelper
{
  /** convert DepositObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (DepositObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert DepositObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "DepositObject")
   * @return Map     the output Map
   */
  public static Map toMap (DepositObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "DepositObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert DepositObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (DepositObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert DepositObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "DepositObject")
   * @return Map     the output Map
   */
  public static Map toMap (DepositObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "DepositObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to DepositObjectData.
   * @param record the Map containing the data to convert to the object
   * @return DepositObjectData the converted object
   */
  public static DepositObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to DepositObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "DepositObject")
   * @return DepositObjectData the converted object
   */
  public static DepositObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "DepositObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to DepositObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return DepositObjectFilter the converted object
   */
  public static DepositObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to DepositObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "DepositObject")
   * @return DepositObjectFilter the converted object
   */
  public static DepositObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "DepositObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to DepositObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return DepositObjectDataList the converted object
   */
  public static DepositObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to DepositObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "DepositObjectList")
   * @return DepositObjectDataList the converted object
   */
  public static DepositObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "DepositObjectList";
    Object[] root = (Object[]) record.get (rootName);
    DepositObjectData[] array = null;
    if (root != null)
    {
      array = new DepositObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = DepositObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new DepositObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new DepositObjectDataList (array, index, total);
  }
  /** convert DepositObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (DepositObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", DepositObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._DepositTypeSet) record.put ("DepositType", in.DepositType);
  
    if (in._DateReceivedSet) record.put ("DateReceived", in.DateReceived);
  
    if (in._DateReturnedSet) record.put ("DateReturned", in.DateReturned);
  
    if (in._DepositAmountSet) record.put ("DepositAmount", in.DepositAmount);
  
    if (in._InterestAmountSet) record.put ("InterestAmount", in.InterestAmount);
  
    if (in._IncomeTaxAmountSet) record.put ("IncomeTaxAmount", in.IncomeTaxAmount);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._ManualCcauthCodeSet) record.put ("ManualCcauthCode", in.ManualCcauthCode);
  
    if (in._ManualCcauthDateSet) record.put ("ManualCcauthDate", in.ManualCcauthDate);
  
    if (in._PayMethodSet) record.put ("PayMethod", in.PayMethod);
  
    if (in._RefundTypeSet) record.put ("RefundType", in.RefundType);
  
    if (in._ReasonCodeSet) record.put ("ReasonCode", in.ReasonCode);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
      return record;
  }
  /** convert DepositObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (DepositObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", DepositObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.DepositType, in.DepositTypeSort, in.DepositTypeSortAscending, in.DepositTypeFetch);
      if (map != null) record.put ("DepositType", map);
      map = DataHelper.filterToMap (in.DateReceived, in.DateReceivedSort, in.DateReceivedSortAscending, in.DateReceivedFetch);
      if (map != null) record.put ("DateReceived", map);
      map = DataHelper.filterToMap (in.DateReturned, in.DateReturnedSort, in.DateReturnedSortAscending, in.DateReturnedFetch);
      if (map != null) record.put ("DateReturned", map);
      map = DataHelper.filterToMap (in.DepositAmount, in.DepositAmountSort, in.DepositAmountSortAscending, in.DepositAmountFetch);
      if (map != null) record.put ("DepositAmount", map);
      map = DataHelper.filterToMap (in.InterestAmount, in.InterestAmountSort, in.InterestAmountSortAscending, in.InterestAmountFetch);
      if (map != null) record.put ("InterestAmount", map);
      map = DataHelper.filterToMap (in.IncomeTaxAmount, in.IncomeTaxAmountSort, in.IncomeTaxAmountSortAscending, in.IncomeTaxAmountFetch);
      if (map != null) record.put ("IncomeTaxAmount", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.ManualCcauthCode, in.ManualCcauthCodeSort, in.ManualCcauthCodeSortAscending, in.ManualCcauthCodeFetch, in.ManualCcauthCodeCaseInsensitive);
      if (map != null) record.put ("ManualCcauthCode", map);
      map = DataHelper.filterToMap (in.ManualCcauthDate, in.ManualCcauthDateSort, in.ManualCcauthDateSortAscending, in.ManualCcauthDateFetch, in.ManualCcauthDateCaseInsensitive);
      if (map != null) record.put ("ManualCcauthDate", map);
      map = DataHelper.filterToMap (in.PayMethod, in.PayMethodSort, in.PayMethodSortAscending, in.PayMethodFetch);
      if (map != null) record.put ("PayMethod", map);
      map = DataHelper.filterToMap (in.RefundType, in.RefundTypeSort, in.RefundTypeSortAscending, in.RefundTypeFetch);
      if (map != null) record.put ("RefundType", map);
      map = DataHelper.filterToMap (in.ReasonCode, in.ReasonCodeSort, in.ReasonCodeSortAscending, in.ReasonCodeFetch);
      if (map != null) record.put ("ReasonCode", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
    return record;
  }
  /** convert Map to DepositObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return DepositObjectData the converted object
   */
  public static DepositObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    DepositObjectData out = new DepositObjectData ();

    out.Key = DepositObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("DepositType")) != null)
    {
      out.DepositType = (Integer) obj;
    }
  
    if ((obj = record.get ("DateReceived")) != null)
    {
      out.DateReceived = (Date) obj;
    }
  
    if ((obj = record.get ("DateReturned")) != null)
    {
      out.DateReturned = (Date) obj;
    }
  
    if ((obj = record.get ("DepositAmount")) != null)
    {
      out.DepositAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("InterestAmount")) != null)
    {
      out.InterestAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("IncomeTaxAmount")) != null)
    {
      out.IncomeTaxAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("ManualCcauthCode")) != null)
    {
      out.ManualCcauthCode = (String) obj;
    }
  
    if ((obj = record.get ("ManualCcauthDate")) != null)
    {
      out.ManualCcauthDate = (String) obj;
    }
  
    if ((obj = record.get ("PayMethod")) != null)
    {
      out.PayMethod = (Integer) obj;
    }
  
    if ((obj = record.get ("RefundType")) != null)
    {
      out.RefundType = (Integer) obj;
    }
  
    if ((obj = record.get ("ReasonCode")) != null)
    {
      out.ReasonCode = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
      return out;
  }
  /** convert Map to DepositObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return DepositObjectFilter the converted object
   */
  public static DepositObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    DepositObjectFilter out = new DepositObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = DepositObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map DepositTypeMap = (Map)record.get("DepositType");
    Boolean DepositTypeFetch = DataHelper.getFetch(DepositTypeMap);
    Boolean DepositTypeSortDir = DataHelper.getSortDirection(DepositTypeMap);
    Integer DepositTypeSortOrder = DataHelper.getSortOrder(DepositTypeMap);
    if (DepositTypeFetch != null) out.setDepositTypeFetch(DepositTypeFetch);
    if (DepositTypeSortDir != null) out.setDepositTypeSortDirection(DepositTypeSortDir);
    if (DepositTypeSortOrder != null) out.setDepositTypeSortOrder(DepositTypeSortOrder);

    Filter[] DepositTypeFilter = DataHelper.mapToFilterArray(DepositTypeMap, Integer.class);
    if (DepositTypeFilter != null) {
      IntegerFilter[] DepositTypeFilters = new IntegerFilter[DepositTypeFilter.length];
      for (int i = 0; i < DepositTypeFilters.length; i++) {
        DepositTypeFilters[i] = (IntegerFilter)DepositTypeFilter[i];
      }
      try {
        out.setDepositTypeFilter(DepositTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateReceivedMap = (Map)record.get("DateReceived");
    Boolean DateReceivedFetch = DataHelper.getFetch(DateReceivedMap);
    Boolean DateReceivedSortDir = DataHelper.getSortDirection(DateReceivedMap);
    Integer DateReceivedSortOrder = DataHelper.getSortOrder(DateReceivedMap);
    if (DateReceivedFetch != null) out.setDateReceivedFetch(DateReceivedFetch);
    if (DateReceivedSortDir != null) out.setDateReceivedSortDirection(DateReceivedSortDir);
    if (DateReceivedSortOrder != null) out.setDateReceivedSortOrder(DateReceivedSortOrder);

    Filter[] DateReceivedFilter = DataHelper.mapToFilterArray(DateReceivedMap, Date.class);
    if (DateReceivedFilter != null) {
      DateFilter[] DateReceivedFilters = new DateFilter[DateReceivedFilter.length];
      for (int i = 0; i < DateReceivedFilters.length; i++) {
        DateReceivedFilters[i] = (DateFilter)DateReceivedFilter[i];
      }
      try {
        out.setDateReceivedFilter(DateReceivedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateReturnedMap = (Map)record.get("DateReturned");
    Boolean DateReturnedFetch = DataHelper.getFetch(DateReturnedMap);
    Boolean DateReturnedSortDir = DataHelper.getSortDirection(DateReturnedMap);
    Integer DateReturnedSortOrder = DataHelper.getSortOrder(DateReturnedMap);
    if (DateReturnedFetch != null) out.setDateReturnedFetch(DateReturnedFetch);
    if (DateReturnedSortDir != null) out.setDateReturnedSortDirection(DateReturnedSortDir);
    if (DateReturnedSortOrder != null) out.setDateReturnedSortOrder(DateReturnedSortOrder);

    Filter[] DateReturnedFilter = DataHelper.mapToFilterArray(DateReturnedMap, Date.class);
    if (DateReturnedFilter != null) {
      DateFilter[] DateReturnedFilters = new DateFilter[DateReturnedFilter.length];
      for (int i = 0; i < DateReturnedFilters.length; i++) {
        DateReturnedFilters[i] = (DateFilter)DateReturnedFilter[i];
      }
      try {
        out.setDateReturnedFilter(DateReturnedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DepositAmountMap = (Map)record.get("DepositAmount");
    Boolean DepositAmountFetch = DataHelper.getFetch(DepositAmountMap);
    Boolean DepositAmountSortDir = DataHelper.getSortDirection(DepositAmountMap);
    Integer DepositAmountSortOrder = DataHelper.getSortOrder(DepositAmountMap);
    if (DepositAmountFetch != null) out.setDepositAmountFetch(DepositAmountFetch);
    if (DepositAmountSortDir != null) out.setDepositAmountSortDirection(DepositAmountSortDir);
    if (DepositAmountSortOrder != null) out.setDepositAmountSortOrder(DepositAmountSortOrder);

    Filter[] DepositAmountFilter = DataHelper.mapToFilterArray(DepositAmountMap, BigInteger.class);
    if (DepositAmountFilter != null) {
      BigIntegerFilter[] DepositAmountFilters = new BigIntegerFilter[DepositAmountFilter.length];
      for (int i = 0; i < DepositAmountFilters.length; i++) {
        DepositAmountFilters[i] = (BigIntegerFilter)DepositAmountFilter[i];
      }
      try {
        out.setDepositAmountFilter(DepositAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InterestAmountMap = (Map)record.get("InterestAmount");
    Boolean InterestAmountFetch = DataHelper.getFetch(InterestAmountMap);
    Boolean InterestAmountSortDir = DataHelper.getSortDirection(InterestAmountMap);
    Integer InterestAmountSortOrder = DataHelper.getSortOrder(InterestAmountMap);
    if (InterestAmountFetch != null) out.setInterestAmountFetch(InterestAmountFetch);
    if (InterestAmountSortDir != null) out.setInterestAmountSortDirection(InterestAmountSortDir);
    if (InterestAmountSortOrder != null) out.setInterestAmountSortOrder(InterestAmountSortOrder);

    Filter[] InterestAmountFilter = DataHelper.mapToFilterArray(InterestAmountMap, BigInteger.class);
    if (InterestAmountFilter != null) {
      BigIntegerFilter[] InterestAmountFilters = new BigIntegerFilter[InterestAmountFilter.length];
      for (int i = 0; i < InterestAmountFilters.length; i++) {
        InterestAmountFilters[i] = (BigIntegerFilter)InterestAmountFilter[i];
      }
      try {
        out.setInterestAmountFilter(InterestAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncomeTaxAmountMap = (Map)record.get("IncomeTaxAmount");
    Boolean IncomeTaxAmountFetch = DataHelper.getFetch(IncomeTaxAmountMap);
    Boolean IncomeTaxAmountSortDir = DataHelper.getSortDirection(IncomeTaxAmountMap);
    Integer IncomeTaxAmountSortOrder = DataHelper.getSortOrder(IncomeTaxAmountMap);
    if (IncomeTaxAmountFetch != null) out.setIncomeTaxAmountFetch(IncomeTaxAmountFetch);
    if (IncomeTaxAmountSortDir != null) out.setIncomeTaxAmountSortDirection(IncomeTaxAmountSortDir);
    if (IncomeTaxAmountSortOrder != null) out.setIncomeTaxAmountSortOrder(IncomeTaxAmountSortOrder);

    Filter[] IncomeTaxAmountFilter = DataHelper.mapToFilterArray(IncomeTaxAmountMap, BigInteger.class);
    if (IncomeTaxAmountFilter != null) {
      BigIntegerFilter[] IncomeTaxAmountFilters = new BigIntegerFilter[IncomeTaxAmountFilter.length];
      for (int i = 0; i < IncomeTaxAmountFilters.length; i++) {
        IncomeTaxAmountFilters[i] = (BigIntegerFilter)IncomeTaxAmountFilter[i];
      }
      try {
        out.setIncomeTaxAmountFilter(IncomeTaxAmountFilters);
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
  
    Map ManualCcauthCodeMap = (Map)record.get("ManualCcauthCode");
    Boolean ManualCcauthCodeFetch = DataHelper.getFetch(ManualCcauthCodeMap);
    Boolean ManualCcauthCodeSortDir = DataHelper.getSortDirection(ManualCcauthCodeMap);
    Integer ManualCcauthCodeSortOrder = DataHelper.getSortOrder(ManualCcauthCodeMap);
    if (ManualCcauthCodeFetch != null) out.setManualCcauthCodeFetch(ManualCcauthCodeFetch);
    if (ManualCcauthCodeSortDir != null) out.setManualCcauthCodeSortDirection(ManualCcauthCodeSortDir);
    if (ManualCcauthCodeSortOrder != null) out.setManualCcauthCodeSortOrder(ManualCcauthCodeSortOrder);

    Filter[] ManualCcauthCodeFilter = DataHelper.mapToFilterArray(ManualCcauthCodeMap, String.class);
    if (ManualCcauthCodeFilter != null) {
      StringFilter[] ManualCcauthCodeFilters = new StringFilter[ManualCcauthCodeFilter.length];
      for (int i = 0; i < ManualCcauthCodeFilters.length; i++) {
        ManualCcauthCodeFilters[i] = (StringFilter)ManualCcauthCodeFilter[i];
      }
      try {
        out.setManualCcauthCodeFilter(ManualCcauthCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ManualCcauthDateMap = (Map)record.get("ManualCcauthDate");
    Boolean ManualCcauthDateFetch = DataHelper.getFetch(ManualCcauthDateMap);
    Boolean ManualCcauthDateSortDir = DataHelper.getSortDirection(ManualCcauthDateMap);
    Integer ManualCcauthDateSortOrder = DataHelper.getSortOrder(ManualCcauthDateMap);
    if (ManualCcauthDateFetch != null) out.setManualCcauthDateFetch(ManualCcauthDateFetch);
    if (ManualCcauthDateSortDir != null) out.setManualCcauthDateSortDirection(ManualCcauthDateSortDir);
    if (ManualCcauthDateSortOrder != null) out.setManualCcauthDateSortOrder(ManualCcauthDateSortOrder);

    Filter[] ManualCcauthDateFilter = DataHelper.mapToFilterArray(ManualCcauthDateMap, String.class);
    if (ManualCcauthDateFilter != null) {
      StringFilter[] ManualCcauthDateFilters = new StringFilter[ManualCcauthDateFilter.length];
      for (int i = 0; i < ManualCcauthDateFilters.length; i++) {
        ManualCcauthDateFilters[i] = (StringFilter)ManualCcauthDateFilter[i];
      }
      try {
        out.setManualCcauthDateFilter(ManualCcauthDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayMethodMap = (Map)record.get("PayMethod");
    Boolean PayMethodFetch = DataHelper.getFetch(PayMethodMap);
    Boolean PayMethodSortDir = DataHelper.getSortDirection(PayMethodMap);
    Integer PayMethodSortOrder = DataHelper.getSortOrder(PayMethodMap);
    if (PayMethodFetch != null) out.setPayMethodFetch(PayMethodFetch);
    if (PayMethodSortDir != null) out.setPayMethodSortDirection(PayMethodSortDir);
    if (PayMethodSortOrder != null) out.setPayMethodSortOrder(PayMethodSortOrder);

    Filter[] PayMethodFilter = DataHelper.mapToFilterArray(PayMethodMap, Integer.class);
    if (PayMethodFilter != null) {
      IntegerFilter[] PayMethodFilters = new IntegerFilter[PayMethodFilter.length];
      for (int i = 0; i < PayMethodFilters.length; i++) {
        PayMethodFilters[i] = (IntegerFilter)PayMethodFilter[i];
      }
      try {
        out.setPayMethodFilter(PayMethodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RefundTypeMap = (Map)record.get("RefundType");
    Boolean RefundTypeFetch = DataHelper.getFetch(RefundTypeMap);
    Boolean RefundTypeSortDir = DataHelper.getSortDirection(RefundTypeMap);
    Integer RefundTypeSortOrder = DataHelper.getSortOrder(RefundTypeMap);
    if (RefundTypeFetch != null) out.setRefundTypeFetch(RefundTypeFetch);
    if (RefundTypeSortDir != null) out.setRefundTypeSortDirection(RefundTypeSortDir);
    if (RefundTypeSortOrder != null) out.setRefundTypeSortOrder(RefundTypeSortOrder);

    Filter[] RefundTypeFilter = DataHelper.mapToFilterArray(RefundTypeMap, Integer.class);
    if (RefundTypeFilter != null) {
      IntegerFilter[] RefundTypeFilters = new IntegerFilter[RefundTypeFilter.length];
      for (int i = 0; i < RefundTypeFilters.length; i++) {
        RefundTypeFilters[i] = (IntegerFilter)RefundTypeFilter[i];
      }
      try {
        out.setRefundTypeFilter(RefundTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ReasonCodeMap = (Map)record.get("ReasonCode");
    Boolean ReasonCodeFetch = DataHelper.getFetch(ReasonCodeMap);
    Boolean ReasonCodeSortDir = DataHelper.getSortDirection(ReasonCodeMap);
    Integer ReasonCodeSortOrder = DataHelper.getSortOrder(ReasonCodeMap);
    if (ReasonCodeFetch != null) out.setReasonCodeFetch(ReasonCodeFetch);
    if (ReasonCodeSortDir != null) out.setReasonCodeSortDirection(ReasonCodeSortDir);
    if (ReasonCodeSortOrder != null) out.setReasonCodeSortOrder(ReasonCodeSortOrder);

    Filter[] ReasonCodeFilter = DataHelper.mapToFilterArray(ReasonCodeMap, Integer.class);
    if (ReasonCodeFilter != null) {
      IntegerFilter[] ReasonCodeFilters = new IntegerFilter[ReasonCodeFilter.length];
      for (int i = 0; i < ReasonCodeFilters.length; i++) {
        ReasonCodeFilters[i] = (IntegerFilter)ReasonCodeFilter[i];
      }
      try {
        out.setReasonCodeFilter(ReasonCodeFilters);
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
  
    return out;
  }
}
