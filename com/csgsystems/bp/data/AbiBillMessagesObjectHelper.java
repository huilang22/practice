/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillMessagesObjectHelper.java
 * Definition File: Customer/AbiBillMessages.xml
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



/** Helper class to convert AbiBillMessagesObject JavaBean objects to/from HashMaps.
 */
public class AbiBillMessagesObjectHelper implements ArubaObjectHelper
{
  /** convert AbiBillMessagesObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AbiBillMessagesObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiBillMessagesObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiBillMessagesObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillMessagesObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiBillMessagesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AbiBillMessagesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillMessagesObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiBillMessagesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiBillMessagesObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillMessagesObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiBillMessagesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AbiBillMessagesObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AbiBillMessagesObjectData the converted object
   */
  public static AbiBillMessagesObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AbiBillMessagesObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AbiBillMessagesObject")
   * @return AbiBillMessagesObjectData the converted object
   */
  public static AbiBillMessagesObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillMessagesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AbiBillMessagesObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AbiBillMessagesObjectFilter the converted object
   */
  public static AbiBillMessagesObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AbiBillMessagesObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AbiBillMessagesObject")
   * @return AbiBillMessagesObjectFilter the converted object
   */
  public static AbiBillMessagesObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillMessagesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AbiBillMessagesObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AbiBillMessagesObjectDataList the converted object
   */
  public static AbiBillMessagesObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AbiBillMessagesObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AbiBillMessagesObjectList")
   * @return AbiBillMessagesObjectDataList the converted object
   */
  public static AbiBillMessagesObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillMessagesObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AbiBillMessagesObjectData[] array = null;
    if (root != null)
    {
      array = new AbiBillMessagesObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AbiBillMessagesObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AbiBillMessagesObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AbiBillMessagesObjectDataList (array, index, total);
  }
  /** convert AbiBillMessagesObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AbiBillMessagesObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AbiBillMessagesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._MessageTextSet) record.put ("MessageText", in.MessageText);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._FileIdSet) record.put ("FileId", in.FileId);
  
    if (in._FileIdServSet) record.put ("FileIdServ", in.FileIdServ);
  
    if (in._LobIdSet) record.put ("LobId", in.LobId);
  
    if (in._TransactionIdSet) record.put ("TransactionId", in.TransactionId);
  
    if (in._ExternalInvoiceIdSet) record.put ("ExternalInvoiceId", in.ExternalInvoiceId);
  
    if (in._InvoiceRecordSeqSet) record.put ("InvoiceRecordSeq", in.InvoiceRecordSeq);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
      return record;
  }
  /** convert AbiBillMessagesObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AbiBillMessagesObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AbiBillMessagesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.MessageText, in.MessageTextSort, in.MessageTextSortAscending, in.MessageTextFetch, in.MessageTextCaseInsensitive);
      if (map != null) record.put ("MessageText", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.FileId, in.FileIdSort, in.FileIdSortAscending, in.FileIdFetch);
      if (map != null) record.put ("FileId", map);
      map = DataHelper.filterToMap (in.FileIdServ, in.FileIdServSort, in.FileIdServSortAscending, in.FileIdServFetch);
      if (map != null) record.put ("FileIdServ", map);
      map = DataHelper.filterToMap (in.LobId, in.LobIdSort, in.LobIdSortAscending, in.LobIdFetch);
      if (map != null) record.put ("LobId", map);
      map = DataHelper.filterToMap (in.TransactionId, in.TransactionIdSort, in.TransactionIdSortAscending, in.TransactionIdFetch);
      if (map != null) record.put ("TransactionId", map);
      map = DataHelper.filterToMap (in.ExternalInvoiceId, in.ExternalInvoiceIdSort, in.ExternalInvoiceIdSortAscending, in.ExternalInvoiceIdFetch);
      if (map != null) record.put ("ExternalInvoiceId", map);
      map = DataHelper.filterToMap (in.InvoiceRecordSeq, in.InvoiceRecordSeqSort, in.InvoiceRecordSeqSortAscending, in.InvoiceRecordSeqFetch);
      if (map != null) record.put ("InvoiceRecordSeq", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
    return record;
  }
  /** convert Map to AbiBillMessagesObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiBillMessagesObjectData the converted object
   */
  public static AbiBillMessagesObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiBillMessagesObjectData out = new AbiBillMessagesObjectData ();

    out.Key = AbiBillMessagesObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("MessageText")) != null)
    {
      out.MessageText = (String) obj;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (BigInteger) obj;
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
  
    if ((obj = record.get ("ExternalInvoiceId")) != null)
    {
      out.ExternalInvoiceId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("InvoiceRecordSeq")) != null)
    {
      out.InvoiceRecordSeq = (BigInteger) obj;
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
  /** convert Map to AbiBillMessagesObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiBillMessagesObjectFilter the converted object
   */
  public static AbiBillMessagesObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiBillMessagesObjectFilter out = new AbiBillMessagesObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AbiBillMessagesObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map MessageTextMap = (Map)record.get("MessageText");
    Boolean MessageTextFetch = DataHelper.getFetch(MessageTextMap);
    Boolean MessageTextSortDir = DataHelper.getSortDirection(MessageTextMap);
    Integer MessageTextSortOrder = DataHelper.getSortOrder(MessageTextMap);
    if (MessageTextFetch != null) out.setMessageTextFetch(MessageTextFetch);
    if (MessageTextSortDir != null) out.setMessageTextSortDirection(MessageTextSortDir);
    if (MessageTextSortOrder != null) out.setMessageTextSortOrder(MessageTextSortOrder);

    Filter[] MessageTextFilter = DataHelper.mapToFilterArray(MessageTextMap, String.class);
    if (MessageTextFilter != null) {
      StringFilter[] MessageTextFilters = new StringFilter[MessageTextFilter.length];
      for (int i = 0; i < MessageTextFilters.length; i++) {
        MessageTextFilters[i] = (StringFilter)MessageTextFilter[i];
      }
      try {
        out.setMessageTextFilter(MessageTextFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, BigInteger.class);
    if (LanguageCodeFilter != null) {
      BigIntegerFilter[] LanguageCodeFilters = new BigIntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (BigIntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
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
