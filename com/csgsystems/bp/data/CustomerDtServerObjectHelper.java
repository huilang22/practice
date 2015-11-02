/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtServerObjectHelper.java
 * Definition File: Customer/CustomerDtServer.xml
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



/** Helper class to convert CustomerDtServerObject JavaBean objects to/from HashMaps.
 */
public class CustomerDtServerObjectHelper implements ArubaObjectHelper
{
  /** convert CustomerDtServerObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CustomerDtServerObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDtServerObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDtServerObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtServerObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDtServerObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CustomerDtServerObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtServerObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDtServerObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDtServerObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtServerObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDtServerObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CustomerDtServerObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDtServerObjectData the converted object
   */
  public static CustomerDtServerObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CustomerDtServerObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CustomerDtServerObject")
   * @return CustomerDtServerObjectData the converted object
   */
  public static CustomerDtServerObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtServerObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CustomerDtServerObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDtServerObjectFilter the converted object
   */
  public static CustomerDtServerObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CustomerDtServerObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CustomerDtServerObject")
   * @return CustomerDtServerObjectFilter the converted object
   */
  public static CustomerDtServerObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtServerObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CustomerDtServerObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CustomerDtServerObjectDataList the converted object
   */
  public static CustomerDtServerObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CustomerDtServerObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CustomerDtServerObjectList")
   * @return CustomerDtServerObjectDataList the converted object
   */
  public static CustomerDtServerObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtServerObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CustomerDtServerObjectData[] array = null;
    if (root != null)
    {
      array = new CustomerDtServerObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CustomerDtServerObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CustomerDtServerObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CustomerDtServerObjectDataList (array, index, total);
  }
  /** convert CustomerDtServerObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDtServerObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._DocumentIdSet) record.put ("DocumentId", in.DocumentId);
  
    if (in._DocumentTypeIdSet) record.put ("DocumentTypeId", in.DocumentTypeId);
  
    if (in._SourceIdSet) record.put ("SourceId", in.SourceId);
  
    if (in._SourceId2Set) record.put ("SourceId2", in.SourceId2);
  
    if (in._DocumentServerSet) record.put ("DocumentServer", in.DocumentServer);
  
    if (in._DisplayFilenameSet) record.put ("DisplayFilename", in.DisplayFilename);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._StatementDateSet) record.put ("StatementDate", in.StatementDate);
  
    if (in._PrepDateSet) record.put ("PrepDate", in.PrepDate);
  
    if (in._PaymentDueDateSet) record.put ("PaymentDueDate", in.PaymentDueDate);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
      return record;
  }
  /** convert CustomerDtServerObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDtServerObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.DocumentId, in.DocumentIdSort, in.DocumentIdSortAscending, in.DocumentIdFetch);
      if (map != null) record.put ("DocumentId", map);
      map = DataHelper.filterToMap (in.DocumentTypeId, in.DocumentTypeIdSort, in.DocumentTypeIdSortAscending, in.DocumentTypeIdFetch);
      if (map != null) record.put ("DocumentTypeId", map);
      map = DataHelper.filterToMap (in.SourceId, in.SourceIdSort, in.SourceIdSortAscending, in.SourceIdFetch);
      if (map != null) record.put ("SourceId", map);
      map = DataHelper.filterToMap (in.SourceId2, in.SourceId2Sort, in.SourceId2SortAscending, in.SourceId2Fetch);
      if (map != null) record.put ("SourceId2", map);
      map = DataHelper.filterToMap (in.DocumentServer, in.DocumentServerSort, in.DocumentServerSortAscending, in.DocumentServerFetch, in.DocumentServerCaseInsensitive);
      if (map != null) record.put ("DocumentServer", map);
      map = DataHelper.filterToMap (in.DisplayFilename, in.DisplayFilenameSort, in.DisplayFilenameSortAscending, in.DisplayFilenameFetch, in.DisplayFilenameCaseInsensitive);
      if (map != null) record.put ("DisplayFilename", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.StatementDate, in.StatementDateSort, in.StatementDateSortAscending, in.StatementDateFetch);
      if (map != null) record.put ("StatementDate", map);
      map = DataHelper.filterToMap (in.PrepDate, in.PrepDateSort, in.PrepDateSortAscending, in.PrepDateFetch);
      if (map != null) record.put ("PrepDate", map);
      map = DataHelper.filterToMap (in.PaymentDueDate, in.PaymentDueDateSort, in.PaymentDueDateSortAscending, in.PaymentDueDateFetch);
      if (map != null) record.put ("PaymentDueDate", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
    return record;
  }
  /** convert Map to CustomerDtServerObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDtServerObjectData the converted object
   */
  public static CustomerDtServerObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDtServerObjectData out = new CustomerDtServerObjectData ();

    if ((obj = record.get ("DocumentId")) != null)
    {
      out.DocumentId = (Integer) obj;
    }
  
    if ((obj = record.get ("DocumentTypeId")) != null)
    {
      out.DocumentTypeId = (Integer) obj;
    }
  
    if ((obj = record.get ("SourceId")) != null)
    {
      out.SourceId = (Integer) obj;
    }
  
    if ((obj = record.get ("SourceId2")) != null)
    {
      out.SourceId2 = (Integer) obj;
    }
  
    if ((obj = record.get ("DocumentServer")) != null)
    {
      out.DocumentServer = (String) obj;
    }
  
    if ((obj = record.get ("DisplayFilename")) != null)
    {
      out.DisplayFilename = (String) obj;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("StatementDate")) != null)
    {
      out.StatementDate = (Date) obj;
    }
  
    if ((obj = record.get ("PrepDate")) != null)
    {
      out.PrepDate = (Date) obj;
    }
  
    if ((obj = record.get ("PaymentDueDate")) != null)
    {
      out.PaymentDueDate = (Date) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
      return out;
  }
  /** convert Map to CustomerDtServerObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDtServerObjectFilter the converted object
   */
  public static CustomerDtServerObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDtServerObjectFilter out = new CustomerDtServerObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map DocumentIdMap = (Map)record.get("DocumentId");
    Boolean DocumentIdFetch = DataHelper.getFetch(DocumentIdMap);
    Boolean DocumentIdSortDir = DataHelper.getSortDirection(DocumentIdMap);
    Integer DocumentIdSortOrder = DataHelper.getSortOrder(DocumentIdMap);
    if (DocumentIdFetch != null) out.setDocumentIdFetch(DocumentIdFetch);
    if (DocumentIdSortDir != null) out.setDocumentIdSortDirection(DocumentIdSortDir);
    if (DocumentIdSortOrder != null) out.setDocumentIdSortOrder(DocumentIdSortOrder);

    Filter[] DocumentIdFilter = DataHelper.mapToFilterArray(DocumentIdMap, Integer.class);
    if (DocumentIdFilter != null) {
      IntegerFilter[] DocumentIdFilters = new IntegerFilter[DocumentIdFilter.length];
      for (int i = 0; i < DocumentIdFilters.length; i++) {
        DocumentIdFilters[i] = (IntegerFilter)DocumentIdFilter[i];
      }
      try {
        out.setDocumentIdFilter(DocumentIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DocumentTypeIdMap = (Map)record.get("DocumentTypeId");
    Boolean DocumentTypeIdFetch = DataHelper.getFetch(DocumentTypeIdMap);
    Boolean DocumentTypeIdSortDir = DataHelper.getSortDirection(DocumentTypeIdMap);
    Integer DocumentTypeIdSortOrder = DataHelper.getSortOrder(DocumentTypeIdMap);
    if (DocumentTypeIdFetch != null) out.setDocumentTypeIdFetch(DocumentTypeIdFetch);
    if (DocumentTypeIdSortDir != null) out.setDocumentTypeIdSortDirection(DocumentTypeIdSortDir);
    if (DocumentTypeIdSortOrder != null) out.setDocumentTypeIdSortOrder(DocumentTypeIdSortOrder);

    Filter[] DocumentTypeIdFilter = DataHelper.mapToFilterArray(DocumentTypeIdMap, Integer.class);
    if (DocumentTypeIdFilter != null) {
      IntegerFilter[] DocumentTypeIdFilters = new IntegerFilter[DocumentTypeIdFilter.length];
      for (int i = 0; i < DocumentTypeIdFilters.length; i++) {
        DocumentTypeIdFilters[i] = (IntegerFilter)DocumentTypeIdFilter[i];
      }
      try {
        out.setDocumentTypeIdFilter(DocumentTypeIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    Map SourceId2Map = (Map)record.get("SourceId2");
    Boolean SourceId2Fetch = DataHelper.getFetch(SourceId2Map);
    Boolean SourceId2SortDir = DataHelper.getSortDirection(SourceId2Map);
    Integer SourceId2SortOrder = DataHelper.getSortOrder(SourceId2Map);
    if (SourceId2Fetch != null) out.setSourceId2Fetch(SourceId2Fetch);
    if (SourceId2SortDir != null) out.setSourceId2SortDirection(SourceId2SortDir);
    if (SourceId2SortOrder != null) out.setSourceId2SortOrder(SourceId2SortOrder);

    Filter[] SourceId2Filter = DataHelper.mapToFilterArray(SourceId2Map, Integer.class);
    if (SourceId2Filter != null) {
      IntegerFilter[] SourceId2Filters = new IntegerFilter[SourceId2Filter.length];
      for (int i = 0; i < SourceId2Filters.length; i++) {
        SourceId2Filters[i] = (IntegerFilter)SourceId2Filter[i];
      }
      try {
        out.setSourceId2Filter(SourceId2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DocumentServerMap = (Map)record.get("DocumentServer");
    Boolean DocumentServerFetch = DataHelper.getFetch(DocumentServerMap);
    Boolean DocumentServerSortDir = DataHelper.getSortDirection(DocumentServerMap);
    Integer DocumentServerSortOrder = DataHelper.getSortOrder(DocumentServerMap);
    if (DocumentServerFetch != null) out.setDocumentServerFetch(DocumentServerFetch);
    if (DocumentServerSortDir != null) out.setDocumentServerSortDirection(DocumentServerSortDir);
    if (DocumentServerSortOrder != null) out.setDocumentServerSortOrder(DocumentServerSortOrder);

    Filter[] DocumentServerFilter = DataHelper.mapToFilterArray(DocumentServerMap, String.class);
    if (DocumentServerFilter != null) {
      StringFilter[] DocumentServerFilters = new StringFilter[DocumentServerFilter.length];
      for (int i = 0; i < DocumentServerFilters.length; i++) {
        DocumentServerFilters[i] = (StringFilter)DocumentServerFilter[i];
      }
      try {
        out.setDocumentServerFilter(DocumentServerFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DisplayFilenameMap = (Map)record.get("DisplayFilename");
    Boolean DisplayFilenameFetch = DataHelper.getFetch(DisplayFilenameMap);
    Boolean DisplayFilenameSortDir = DataHelper.getSortDirection(DisplayFilenameMap);
    Integer DisplayFilenameSortOrder = DataHelper.getSortOrder(DisplayFilenameMap);
    if (DisplayFilenameFetch != null) out.setDisplayFilenameFetch(DisplayFilenameFetch);
    if (DisplayFilenameSortDir != null) out.setDisplayFilenameSortDirection(DisplayFilenameSortDir);
    if (DisplayFilenameSortOrder != null) out.setDisplayFilenameSortOrder(DisplayFilenameSortOrder);

    Filter[] DisplayFilenameFilter = DataHelper.mapToFilterArray(DisplayFilenameMap, String.class);
    if (DisplayFilenameFilter != null) {
      StringFilter[] DisplayFilenameFilters = new StringFilter[DisplayFilenameFilter.length];
      for (int i = 0; i < DisplayFilenameFilters.length; i++) {
        DisplayFilenameFilters[i] = (StringFilter)DisplayFilenameFilter[i];
      }
      try {
        out.setDisplayFilenameFilter(DisplayFilenameFilters);
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
  
    Map StatementDateMap = (Map)record.get("StatementDate");
    Boolean StatementDateFetch = DataHelper.getFetch(StatementDateMap);
    Boolean StatementDateSortDir = DataHelper.getSortDirection(StatementDateMap);
    Integer StatementDateSortOrder = DataHelper.getSortOrder(StatementDateMap);
    if (StatementDateFetch != null) out.setStatementDateFetch(StatementDateFetch);
    if (StatementDateSortDir != null) out.setStatementDateSortDirection(StatementDateSortDir);
    if (StatementDateSortOrder != null) out.setStatementDateSortOrder(StatementDateSortOrder);

    Filter[] StatementDateFilter = DataHelper.mapToFilterArray(StatementDateMap, Date.class);
    if (StatementDateFilter != null) {
      DateFilter[] StatementDateFilters = new DateFilter[StatementDateFilter.length];
      for (int i = 0; i < StatementDateFilters.length; i++) {
        StatementDateFilters[i] = (DateFilter)StatementDateFilter[i];
      }
      try {
        out.setStatementDateFilter(StatementDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepDateMap = (Map)record.get("PrepDate");
    Boolean PrepDateFetch = DataHelper.getFetch(PrepDateMap);
    Boolean PrepDateSortDir = DataHelper.getSortDirection(PrepDateMap);
    Integer PrepDateSortOrder = DataHelper.getSortOrder(PrepDateMap);
    if (PrepDateFetch != null) out.setPrepDateFetch(PrepDateFetch);
    if (PrepDateSortDir != null) out.setPrepDateSortDirection(PrepDateSortDir);
    if (PrepDateSortOrder != null) out.setPrepDateSortOrder(PrepDateSortOrder);

    Filter[] PrepDateFilter = DataHelper.mapToFilterArray(PrepDateMap, Date.class);
    if (PrepDateFilter != null) {
      DateFilter[] PrepDateFilters = new DateFilter[PrepDateFilter.length];
      for (int i = 0; i < PrepDateFilters.length; i++) {
        PrepDateFilters[i] = (DateFilter)PrepDateFilter[i];
      }
      try {
        out.setPrepDateFilter(PrepDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PaymentDueDateMap = (Map)record.get("PaymentDueDate");
    Boolean PaymentDueDateFetch = DataHelper.getFetch(PaymentDueDateMap);
    Boolean PaymentDueDateSortDir = DataHelper.getSortDirection(PaymentDueDateMap);
    Integer PaymentDueDateSortOrder = DataHelper.getSortOrder(PaymentDueDateMap);
    if (PaymentDueDateFetch != null) out.setPaymentDueDateFetch(PaymentDueDateFetch);
    if (PaymentDueDateSortDir != null) out.setPaymentDueDateSortDirection(PaymentDueDateSortDir);
    if (PaymentDueDateSortOrder != null) out.setPaymentDueDateSortOrder(PaymentDueDateSortOrder);

    Filter[] PaymentDueDateFilter = DataHelper.mapToFilterArray(PaymentDueDateMap, Date.class);
    if (PaymentDueDateFilter != null) {
      DateFilter[] PaymentDueDateFilters = new DateFilter[PaymentDueDateFilter.length];
      for (int i = 0; i < PaymentDueDateFilters.length; i++) {
        PaymentDueDateFilters[i] = (DateFilter)PaymentDueDateFilter[i];
      }
      try {
        out.setPaymentDueDateFilter(PaymentDueDateFilters);
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
  
    return out;
  }
}
