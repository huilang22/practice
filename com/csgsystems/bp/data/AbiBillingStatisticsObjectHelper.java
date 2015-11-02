/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillingStatisticsObjectHelper.java
 * Definition File: Customer/AbiBillingStatistics.xml
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



/** Helper class to convert AbiBillingStatisticsObject JavaBean objects to/from HashMaps.
 */
public class AbiBillingStatisticsObjectHelper implements ArubaObjectHelper
{
  /** convert AbiBillingStatisticsObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AbiBillingStatisticsObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiBillingStatisticsObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiBillingStatisticsObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillingStatisticsObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiBillingStatisticsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AbiBillingStatisticsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillingStatisticsObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiBillingStatisticsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiBillingStatisticsObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillingStatisticsObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiBillingStatisticsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AbiBillingStatisticsObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AbiBillingStatisticsObjectData the converted object
   */
  public static AbiBillingStatisticsObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AbiBillingStatisticsObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AbiBillingStatisticsObject")
   * @return AbiBillingStatisticsObjectData the converted object
   */
  public static AbiBillingStatisticsObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillingStatisticsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AbiBillingStatisticsObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AbiBillingStatisticsObjectFilter the converted object
   */
  public static AbiBillingStatisticsObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AbiBillingStatisticsObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AbiBillingStatisticsObject")
   * @return AbiBillingStatisticsObjectFilter the converted object
   */
  public static AbiBillingStatisticsObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillingStatisticsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AbiBillingStatisticsObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AbiBillingStatisticsObjectDataList the converted object
   */
  public static AbiBillingStatisticsObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AbiBillingStatisticsObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AbiBillingStatisticsObjectList")
   * @return AbiBillingStatisticsObjectDataList the converted object
   */
  public static AbiBillingStatisticsObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillingStatisticsObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AbiBillingStatisticsObjectData[] array = null;
    if (root != null)
    {
      array = new AbiBillingStatisticsObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AbiBillingStatisticsObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AbiBillingStatisticsObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AbiBillingStatisticsObjectDataList (array, index, total);
  }
  /** convert AbiBillingStatisticsObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AbiBillingStatisticsObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AbiBillingStatisticsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._StatisticValueSet) record.put ("StatisticValue", in.StatisticValue);
  
    if (in._CurrencySet) record.put ("Currency", in.Currency);
  
    if (in._StatisticTypeSet) record.put ("StatisticType", in.StatisticType);
  
    if (in._DescriptionSet) record.put ("Description", in.Description);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._ExternalInvoiceIdSet) record.put ("ExternalInvoiceId", in.ExternalInvoiceId);
  
    if (in._InvoiceRecordSeqSet) record.put ("InvoiceRecordSeq", in.InvoiceRecordSeq);
  
    if (in._FileIdSet) record.put ("FileId", in.FileId);
  
    if (in._FileIdServSet) record.put ("FileIdServ", in.FileIdServ);
  
    if (in._LobIdSet) record.put ("LobId", in.LobId);
  
    if (in._TransactionIdSet) record.put ("TransactionId", in.TransactionId);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
      return record;
  }
  /** convert AbiBillingStatisticsObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AbiBillingStatisticsObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AbiBillingStatisticsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.StatisticValue, in.StatisticValueSort, in.StatisticValueSortAscending, in.StatisticValueFetch);
      if (map != null) record.put ("StatisticValue", map);
      map = DataHelper.filterToMap (in.Currency, in.CurrencySort, in.CurrencySortAscending, in.CurrencyFetch);
      if (map != null) record.put ("Currency", map);
      map = DataHelper.filterToMap (in.StatisticType, in.StatisticTypeSort, in.StatisticTypeSortAscending, in.StatisticTypeFetch);
      if (map != null) record.put ("StatisticType", map);
      map = DataHelper.filterToMap (in.Description, in.DescriptionSort, in.DescriptionSortAscending, in.DescriptionFetch, in.DescriptionCaseInsensitive);
      if (map != null) record.put ("Description", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.ExternalInvoiceId, in.ExternalInvoiceIdSort, in.ExternalInvoiceIdSortAscending, in.ExternalInvoiceIdFetch);
      if (map != null) record.put ("ExternalInvoiceId", map);
      map = DataHelper.filterToMap (in.InvoiceRecordSeq, in.InvoiceRecordSeqSort, in.InvoiceRecordSeqSortAscending, in.InvoiceRecordSeqFetch);
      if (map != null) record.put ("InvoiceRecordSeq", map);
      map = DataHelper.filterToMap (in.FileId, in.FileIdSort, in.FileIdSortAscending, in.FileIdFetch);
      if (map != null) record.put ("FileId", map);
      map = DataHelper.filterToMap (in.FileIdServ, in.FileIdServSort, in.FileIdServSortAscending, in.FileIdServFetch);
      if (map != null) record.put ("FileIdServ", map);
      map = DataHelper.filterToMap (in.LobId, in.LobIdSort, in.LobIdSortAscending, in.LobIdFetch);
      if (map != null) record.put ("LobId", map);
      map = DataHelper.filterToMap (in.TransactionId, in.TransactionIdSort, in.TransactionIdSortAscending, in.TransactionIdFetch);
      if (map != null) record.put ("TransactionId", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
    return record;
  }
  /** convert Map to AbiBillingStatisticsObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiBillingStatisticsObjectData the converted object
   */
  public static AbiBillingStatisticsObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiBillingStatisticsObjectData out = new AbiBillingStatisticsObjectData ();

    out.Key = AbiBillingStatisticsObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("StatisticValue")) != null)
    {
      out.StatisticValue = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Currency")) != null)
    {
      out.Currency = (BigInteger) obj;
    }
  
    if ((obj = record.get ("StatisticType")) != null)
    {
      out.StatisticType = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Description")) != null)
    {
      out.Description = (String) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ExternalInvoiceId")) != null)
    {
      out.ExternalInvoiceId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("InvoiceRecordSeq")) != null)
    {
      out.InvoiceRecordSeq = (BigInteger) obj;
    }
  
    if ((obj = record.get ("FileId")) != null)
    {
      out.FileId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("FileIdServ")) != null)
    {
      out.FileIdServ = (BigInteger) obj;
    }
  
    if ((obj = record.get ("LobId")) != null)
    {
      out.LobId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TransactionId")) != null)
    {
      out.TransactionId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to AbiBillingStatisticsObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiBillingStatisticsObjectFilter the converted object
   */
  public static AbiBillingStatisticsObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiBillingStatisticsObjectFilter out = new AbiBillingStatisticsObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AbiBillingStatisticsObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map StatisticValueMap = (Map)record.get("StatisticValue");
    Boolean StatisticValueFetch = DataHelper.getFetch(StatisticValueMap);
    Boolean StatisticValueSortDir = DataHelper.getSortDirection(StatisticValueMap);
    Integer StatisticValueSortOrder = DataHelper.getSortOrder(StatisticValueMap);
    if (StatisticValueFetch != null) out.setStatisticValueFetch(StatisticValueFetch);
    if (StatisticValueSortDir != null) out.setStatisticValueSortDirection(StatisticValueSortDir);
    if (StatisticValueSortOrder != null) out.setStatisticValueSortOrder(StatisticValueSortOrder);

    Filter[] StatisticValueFilter = DataHelper.mapToFilterArray(StatisticValueMap, BigInteger.class);
    if (StatisticValueFilter != null) {
      BigIntegerFilter[] StatisticValueFilters = new BigIntegerFilter[StatisticValueFilter.length];
      for (int i = 0; i < StatisticValueFilters.length; i++) {
        StatisticValueFilters[i] = (BigIntegerFilter)StatisticValueFilter[i];
      }
      try {
        out.setStatisticValueFilter(StatisticValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyMap = (Map)record.get("Currency");
    Boolean CurrencyFetch = DataHelper.getFetch(CurrencyMap);
    Boolean CurrencySortDir = DataHelper.getSortDirection(CurrencyMap);
    Integer CurrencySortOrder = DataHelper.getSortOrder(CurrencyMap);
    if (CurrencyFetch != null) out.setCurrencyFetch(CurrencyFetch);
    if (CurrencySortDir != null) out.setCurrencySortDirection(CurrencySortDir);
    if (CurrencySortOrder != null) out.setCurrencySortOrder(CurrencySortOrder);

    Filter[] CurrencyFilter = DataHelper.mapToFilterArray(CurrencyMap, BigInteger.class);
    if (CurrencyFilter != null) {
      BigIntegerFilter[] CurrencyFilters = new BigIntegerFilter[CurrencyFilter.length];
      for (int i = 0; i < CurrencyFilters.length; i++) {
        CurrencyFilters[i] = (BigIntegerFilter)CurrencyFilter[i];
      }
      try {
        out.setCurrencyFilter(CurrencyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatisticTypeMap = (Map)record.get("StatisticType");
    Boolean StatisticTypeFetch = DataHelper.getFetch(StatisticTypeMap);
    Boolean StatisticTypeSortDir = DataHelper.getSortDirection(StatisticTypeMap);
    Integer StatisticTypeSortOrder = DataHelper.getSortOrder(StatisticTypeMap);
    if (StatisticTypeFetch != null) out.setStatisticTypeFetch(StatisticTypeFetch);
    if (StatisticTypeSortDir != null) out.setStatisticTypeSortDirection(StatisticTypeSortDir);
    if (StatisticTypeSortOrder != null) out.setStatisticTypeSortOrder(StatisticTypeSortOrder);

    Filter[] StatisticTypeFilter = DataHelper.mapToFilterArray(StatisticTypeMap, BigInteger.class);
    if (StatisticTypeFilter != null) {
      BigIntegerFilter[] StatisticTypeFilters = new BigIntegerFilter[StatisticTypeFilter.length];
      for (int i = 0; i < StatisticTypeFilters.length; i++) {
        StatisticTypeFilters[i] = (BigIntegerFilter)StatisticTypeFilter[i];
      }
      try {
        out.setStatisticTypeFilter(StatisticTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DescriptionMap = (Map)record.get("Description");
    Boolean DescriptionFetch = DataHelper.getFetch(DescriptionMap);
    Boolean DescriptionSortDir = DataHelper.getSortDirection(DescriptionMap);
    Integer DescriptionSortOrder = DataHelper.getSortOrder(DescriptionMap);
    if (DescriptionFetch != null) out.setDescriptionFetch(DescriptionFetch);
    if (DescriptionSortDir != null) out.setDescriptionSortDirection(DescriptionSortDir);
    if (DescriptionSortOrder != null) out.setDescriptionSortOrder(DescriptionSortOrder);

    Filter[] DescriptionFilter = DataHelper.mapToFilterArray(DescriptionMap, String.class);
    if (DescriptionFilter != null) {
      StringFilter[] DescriptionFilters = new StringFilter[DescriptionFilter.length];
      for (int i = 0; i < DescriptionFilters.length; i++) {
        DescriptionFilters[i] = (StringFilter)DescriptionFilter[i];
      }
      try {
        out.setDescriptionFilter(DescriptionFilters);
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

    Filter[] AccountInternalIdFilter = DataHelper.mapToFilterArray(AccountInternalIdMap, BigInteger.class);
    if (AccountInternalIdFilter != null) {
      BigIntegerFilter[] AccountInternalIdFilters = new BigIntegerFilter[AccountInternalIdFilter.length];
      for (int i = 0; i < AccountInternalIdFilters.length; i++) {
        AccountInternalIdFilters[i] = (BigIntegerFilter)AccountInternalIdFilter[i];
      }
      try {
        out.setAccountInternalIdFilter(AccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdMap = (Map)record.get("ServiceInternalId");
    Boolean ServiceInternalIdFetch = DataHelper.getFetch(ServiceInternalIdMap);
    Boolean ServiceInternalIdSortDir = DataHelper.getSortDirection(ServiceInternalIdMap);
    Integer ServiceInternalIdSortOrder = DataHelper.getSortOrder(ServiceInternalIdMap);
    if (ServiceInternalIdFetch != null) out.setServiceInternalIdFetch(ServiceInternalIdFetch);
    if (ServiceInternalIdSortDir != null) out.setServiceInternalIdSortDirection(ServiceInternalIdSortDir);
    if (ServiceInternalIdSortOrder != null) out.setServiceInternalIdSortOrder(ServiceInternalIdSortOrder);

    Filter[] ServiceInternalIdFilter = DataHelper.mapToFilterArray(ServiceInternalIdMap, BigInteger.class);
    if (ServiceInternalIdFilter != null) {
      BigIntegerFilter[] ServiceInternalIdFilters = new BigIntegerFilter[ServiceInternalIdFilter.length];
      for (int i = 0; i < ServiceInternalIdFilters.length; i++) {
        ServiceInternalIdFilters[i] = (BigIntegerFilter)ServiceInternalIdFilter[i];
      }
      try {
        out.setServiceInternalIdFilter(ServiceInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdResetsMap = (Map)record.get("ServiceInternalIdResets");
    Boolean ServiceInternalIdResetsFetch = DataHelper.getFetch(ServiceInternalIdResetsMap);
    Boolean ServiceInternalIdResetsSortDir = DataHelper.getSortDirection(ServiceInternalIdResetsMap);
    Integer ServiceInternalIdResetsSortOrder = DataHelper.getSortOrder(ServiceInternalIdResetsMap);
    if (ServiceInternalIdResetsFetch != null) out.setServiceInternalIdResetsFetch(ServiceInternalIdResetsFetch);
    if (ServiceInternalIdResetsSortDir != null) out.setServiceInternalIdResetsSortDirection(ServiceInternalIdResetsSortDir);
    if (ServiceInternalIdResetsSortOrder != null) out.setServiceInternalIdResetsSortOrder(ServiceInternalIdResetsSortOrder);

    Filter[] ServiceInternalIdResetsFilter = DataHelper.mapToFilterArray(ServiceInternalIdResetsMap, BigInteger.class);
    if (ServiceInternalIdResetsFilter != null) {
      BigIntegerFilter[] ServiceInternalIdResetsFilters = new BigIntegerFilter[ServiceInternalIdResetsFilter.length];
      for (int i = 0; i < ServiceInternalIdResetsFilters.length; i++) {
        ServiceInternalIdResetsFilters[i] = (BigIntegerFilter)ServiceInternalIdResetsFilter[i];
      }
      try {
        out.setServiceInternalIdResetsFilter(ServiceInternalIdResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalInvoiceIdMap = (Map)record.get("ExternalInvoiceId");
    Boolean ExternalInvoiceIdFetch = DataHelper.getFetch(ExternalInvoiceIdMap);
    Boolean ExternalInvoiceIdSortDir = DataHelper.getSortDirection(ExternalInvoiceIdMap);
    Integer ExternalInvoiceIdSortOrder = DataHelper.getSortOrder(ExternalInvoiceIdMap);
    if (ExternalInvoiceIdFetch != null) out.setExternalInvoiceIdFetch(ExternalInvoiceIdFetch);
    if (ExternalInvoiceIdSortDir != null) out.setExternalInvoiceIdSortDirection(ExternalInvoiceIdSortDir);
    if (ExternalInvoiceIdSortOrder != null) out.setExternalInvoiceIdSortOrder(ExternalInvoiceIdSortOrder);

    Filter[] ExternalInvoiceIdFilter = DataHelper.mapToFilterArray(ExternalInvoiceIdMap, BigInteger.class);
    if (ExternalInvoiceIdFilter != null) {
      BigIntegerFilter[] ExternalInvoiceIdFilters = new BigIntegerFilter[ExternalInvoiceIdFilter.length];
      for (int i = 0; i < ExternalInvoiceIdFilters.length; i++) {
        ExternalInvoiceIdFilters[i] = (BigIntegerFilter)ExternalInvoiceIdFilter[i];
      }
      try {
        out.setExternalInvoiceIdFilter(ExternalInvoiceIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InvoiceRecordSeqMap = (Map)record.get("InvoiceRecordSeq");
    Boolean InvoiceRecordSeqFetch = DataHelper.getFetch(InvoiceRecordSeqMap);
    Boolean InvoiceRecordSeqSortDir = DataHelper.getSortDirection(InvoiceRecordSeqMap);
    Integer InvoiceRecordSeqSortOrder = DataHelper.getSortOrder(InvoiceRecordSeqMap);
    if (InvoiceRecordSeqFetch != null) out.setInvoiceRecordSeqFetch(InvoiceRecordSeqFetch);
    if (InvoiceRecordSeqSortDir != null) out.setInvoiceRecordSeqSortDirection(InvoiceRecordSeqSortDir);
    if (InvoiceRecordSeqSortOrder != null) out.setInvoiceRecordSeqSortOrder(InvoiceRecordSeqSortOrder);

    Filter[] InvoiceRecordSeqFilter = DataHelper.mapToFilterArray(InvoiceRecordSeqMap, BigInteger.class);
    if (InvoiceRecordSeqFilter != null) {
      BigIntegerFilter[] InvoiceRecordSeqFilters = new BigIntegerFilter[InvoiceRecordSeqFilter.length];
      for (int i = 0; i < InvoiceRecordSeqFilters.length; i++) {
        InvoiceRecordSeqFilters[i] = (BigIntegerFilter)InvoiceRecordSeqFilter[i];
      }
      try {
        out.setInvoiceRecordSeqFilter(InvoiceRecordSeqFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FileIdMap = (Map)record.get("FileId");
    Boolean FileIdFetch = DataHelper.getFetch(FileIdMap);
    Boolean FileIdSortDir = DataHelper.getSortDirection(FileIdMap);
    Integer FileIdSortOrder = DataHelper.getSortOrder(FileIdMap);
    if (FileIdFetch != null) out.setFileIdFetch(FileIdFetch);
    if (FileIdSortDir != null) out.setFileIdSortDirection(FileIdSortDir);
    if (FileIdSortOrder != null) out.setFileIdSortOrder(FileIdSortOrder);

    Filter[] FileIdFilter = DataHelper.mapToFilterArray(FileIdMap, BigInteger.class);
    if (FileIdFilter != null) {
      BigIntegerFilter[] FileIdFilters = new BigIntegerFilter[FileIdFilter.length];
      for (int i = 0; i < FileIdFilters.length; i++) {
        FileIdFilters[i] = (BigIntegerFilter)FileIdFilter[i];
      }
      try {
        out.setFileIdFilter(FileIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FileIdServMap = (Map)record.get("FileIdServ");
    Boolean FileIdServFetch = DataHelper.getFetch(FileIdServMap);
    Boolean FileIdServSortDir = DataHelper.getSortDirection(FileIdServMap);
    Integer FileIdServSortOrder = DataHelper.getSortOrder(FileIdServMap);
    if (FileIdServFetch != null) out.setFileIdServFetch(FileIdServFetch);
    if (FileIdServSortDir != null) out.setFileIdServSortDirection(FileIdServSortDir);
    if (FileIdServSortOrder != null) out.setFileIdServSortOrder(FileIdServSortOrder);

    Filter[] FileIdServFilter = DataHelper.mapToFilterArray(FileIdServMap, BigInteger.class);
    if (FileIdServFilter != null) {
      BigIntegerFilter[] FileIdServFilters = new BigIntegerFilter[FileIdServFilter.length];
      for (int i = 0; i < FileIdServFilters.length; i++) {
        FileIdServFilters[i] = (BigIntegerFilter)FileIdServFilter[i];
      }
      try {
        out.setFileIdServFilter(FileIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LobIdMap = (Map)record.get("LobId");
    Boolean LobIdFetch = DataHelper.getFetch(LobIdMap);
    Boolean LobIdSortDir = DataHelper.getSortDirection(LobIdMap);
    Integer LobIdSortOrder = DataHelper.getSortOrder(LobIdMap);
    if (LobIdFetch != null) out.setLobIdFetch(LobIdFetch);
    if (LobIdSortDir != null) out.setLobIdSortDirection(LobIdSortDir);
    if (LobIdSortOrder != null) out.setLobIdSortOrder(LobIdSortOrder);

    Filter[] LobIdFilter = DataHelper.mapToFilterArray(LobIdMap, BigInteger.class);
    if (LobIdFilter != null) {
      BigIntegerFilter[] LobIdFilters = new BigIntegerFilter[LobIdFilter.length];
      for (int i = 0; i < LobIdFilters.length; i++) {
        LobIdFilters[i] = (BigIntegerFilter)LobIdFilter[i];
      }
      try {
        out.setLobIdFilter(LobIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransactionIdMap = (Map)record.get("TransactionId");
    Boolean TransactionIdFetch = DataHelper.getFetch(TransactionIdMap);
    Boolean TransactionIdSortDir = DataHelper.getSortDirection(TransactionIdMap);
    Integer TransactionIdSortOrder = DataHelper.getSortOrder(TransactionIdMap);
    if (TransactionIdFetch != null) out.setTransactionIdFetch(TransactionIdFetch);
    if (TransactionIdSortDir != null) out.setTransactionIdSortDirection(TransactionIdSortDir);
    if (TransactionIdSortOrder != null) out.setTransactionIdSortOrder(TransactionIdSortOrder);

    Filter[] TransactionIdFilter = DataHelper.mapToFilterArray(TransactionIdMap, BigInteger.class);
    if (TransactionIdFilter != null) {
      BigIntegerFilter[] TransactionIdFilters = new BigIntegerFilter[TransactionIdFilter.length];
      for (int i = 0; i < TransactionIdFilters.length; i++) {
        TransactionIdFilters[i] = (BigIntegerFilter)TransactionIdFilter[i];
      }
      try {
        out.setTransactionIdFilter(TransactionIdFilters);
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

    Filter[] BillRefNoFilter = DataHelper.mapToFilterArray(BillRefNoMap, BigInteger.class);
    if (BillRefNoFilter != null) {
      BigIntegerFilter[] BillRefNoFilters = new BigIntegerFilter[BillRefNoFilter.length];
      for (int i = 0; i < BillRefNoFilters.length; i++) {
        BillRefNoFilters[i] = (BigIntegerFilter)BillRefNoFilter[i];
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

    Filter[] BillRefResetsFilter = DataHelper.mapToFilterArray(BillRefResetsMap, BigInteger.class);
    if (BillRefResetsFilter != null) {
      BigIntegerFilter[] BillRefResetsFilters = new BigIntegerFilter[BillRefResetsFilter.length];
      for (int i = 0; i < BillRefResetsFilters.length; i++) {
        BillRefResetsFilters[i] = (BigIntegerFilter)BillRefResetsFilter[i];
      }
      try {
        out.setBillRefResetsFilter(BillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
