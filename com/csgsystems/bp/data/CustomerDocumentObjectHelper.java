/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDocumentObjectHelper.java
 * Definition File: Customer/CustomerDocument.xml
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



/** Helper class to convert CustomerDocumentObject JavaBean objects to/from HashMaps.
 */
public class CustomerDocumentObjectHelper implements ArubaObjectHelper
{
  /** convert CustomerDocumentObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CustomerDocumentObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDocumentObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDocumentObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDocumentObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDocumentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CustomerDocumentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDocumentObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDocumentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDocumentObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDocumentObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDocumentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CustomerDocumentObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDocumentObjectData the converted object
   */
  public static CustomerDocumentObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CustomerDocumentObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CustomerDocumentObject")
   * @return CustomerDocumentObjectData the converted object
   */
  public static CustomerDocumentObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDocumentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CustomerDocumentObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDocumentObjectFilter the converted object
   */
  public static CustomerDocumentObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CustomerDocumentObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CustomerDocumentObject")
   * @return CustomerDocumentObjectFilter the converted object
   */
  public static CustomerDocumentObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDocumentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CustomerDocumentObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CustomerDocumentObjectDataList the converted object
   */
  public static CustomerDocumentObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CustomerDocumentObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CustomerDocumentObjectList")
   * @return CustomerDocumentObjectDataList the converted object
   */
  public static CustomerDocumentObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDocumentObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CustomerDocumentObjectData[] array = null;
    if (root != null)
    {
      array = new CustomerDocumentObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CustomerDocumentObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CustomerDocumentObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CustomerDocumentObjectDataList (array, index, total);
  }
  /** convert CustomerDocumentObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDocumentObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CustomerDocumentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._DocumentTypeIdSet) record.put ("DocumentTypeId", in.DocumentTypeId);
  
    if (in._SourceIdSet) record.put ("SourceId", in.SourceId);
  
    if (in._SourceId2Set) record.put ("SourceId2", in.SourceId2);
  
    if (in._BillDispMethSet) record.put ("BillDispMeth", in.BillDispMeth);
  
    if (in._BillFmtOptSet) record.put ("BillFmtOpt", in.BillFmtOpt);
  
    if (in._BillFmtTypeSet) record.put ("BillFmtType", in.BillFmtType);
  
    if (in._AddressIdSet) record.put ("AddressId", in.AddressId);
  
    if (in._StatusSet) record.put ("Status", in.Status);
  
    if (in._ProcessedDateSet) record.put ("ProcessedDate", in.ProcessedDate);
  
    if (in._DocumentServerSet) record.put ("DocumentServer", in.DocumentServer);
  
    if (in._DisplayFilenameSet) record.put ("DisplayFilename", in.DisplayFilename);
      return record;
  }
  /** convert CustomerDocumentObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDocumentObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CustomerDocumentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.DocumentTypeId, in.DocumentTypeIdSort, in.DocumentTypeIdSortAscending, in.DocumentTypeIdFetch);
      if (map != null) record.put ("DocumentTypeId", map);
      map = DataHelper.filterToMap (in.SourceId, in.SourceIdSort, in.SourceIdSortAscending, in.SourceIdFetch);
      if (map != null) record.put ("SourceId", map);
      map = DataHelper.filterToMap (in.SourceId2, in.SourceId2Sort, in.SourceId2SortAscending, in.SourceId2Fetch);
      if (map != null) record.put ("SourceId2", map);
      map = DataHelper.filterToMap (in.BillDispMeth, in.BillDispMethSort, in.BillDispMethSortAscending, in.BillDispMethFetch);
      if (map != null) record.put ("BillDispMeth", map);
      map = DataHelper.filterToMap (in.BillFmtOpt, in.BillFmtOptSort, in.BillFmtOptSortAscending, in.BillFmtOptFetch);
      if (map != null) record.put ("BillFmtOpt", map);
      map = DataHelper.filterToMap (in.BillFmtType, in.BillFmtTypeSort, in.BillFmtTypeSortAscending, in.BillFmtTypeFetch, in.BillFmtTypeCaseInsensitive);
      if (map != null) record.put ("BillFmtType", map);
      map = DataHelper.filterToMap (in.AddressId, in.AddressIdSort, in.AddressIdSortAscending, in.AddressIdFetch);
      if (map != null) record.put ("AddressId", map);
      map = DataHelper.filterToMap (in.Status, in.StatusSort, in.StatusSortAscending, in.StatusFetch);
      if (map != null) record.put ("Status", map);
      map = DataHelper.filterToMap (in.ProcessedDate, in.ProcessedDateSort, in.ProcessedDateSortAscending, in.ProcessedDateFetch);
      if (map != null) record.put ("ProcessedDate", map);
      map = DataHelper.filterToMap (in.DocumentServer, in.DocumentServerSort, in.DocumentServerSortAscending, in.DocumentServerFetch, in.DocumentServerCaseInsensitive);
      if (map != null) record.put ("DocumentServer", map);
      map = DataHelper.filterToMap (in.DisplayFilename, in.DisplayFilenameSort, in.DisplayFilenameSortAscending, in.DisplayFilenameFetch, in.DisplayFilenameCaseInsensitive);
      if (map != null) record.put ("DisplayFilename", map);
    return record;
  }
  /** convert Map to CustomerDocumentObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDocumentObjectData the converted object
   */
  public static CustomerDocumentObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDocumentObjectData out = new CustomerDocumentObjectData ();

    out.Key = CustomerDocumentObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("BillDispMeth")) != null)
    {
      out.BillDispMeth = (Integer) obj;
    }
  
    if ((obj = record.get ("BillFmtOpt")) != null)
    {
      out.BillFmtOpt = (Integer) obj;
    }
  
    if ((obj = record.get ("BillFmtType")) != null)
    {
      out.BillFmtType = (String) obj;
    }
  
    if ((obj = record.get ("AddressId")) != null)
    {
      out.AddressId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (Integer) obj;
    }
  
    if ((obj = record.get ("ProcessedDate")) != null)
    {
      out.ProcessedDate = (Date) obj;
    }
  
    if ((obj = record.get ("DocumentServer")) != null)
    {
      out.DocumentServer = (String) obj;
    }
  
    if ((obj = record.get ("DisplayFilename")) != null)
    {
      out.DisplayFilename = (String) obj;
    }
      return out;
  }
  /** convert Map to CustomerDocumentObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDocumentObjectFilter the converted object
   */
  public static CustomerDocumentObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDocumentObjectFilter out = new CustomerDocumentObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CustomerDocumentObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map BillDispMethMap = (Map)record.get("BillDispMeth");
    Boolean BillDispMethFetch = DataHelper.getFetch(BillDispMethMap);
    Boolean BillDispMethSortDir = DataHelper.getSortDirection(BillDispMethMap);
    Integer BillDispMethSortOrder = DataHelper.getSortOrder(BillDispMethMap);
    if (BillDispMethFetch != null) out.setBillDispMethFetch(BillDispMethFetch);
    if (BillDispMethSortDir != null) out.setBillDispMethSortDirection(BillDispMethSortDir);
    if (BillDispMethSortOrder != null) out.setBillDispMethSortOrder(BillDispMethSortOrder);

    Filter[] BillDispMethFilter = DataHelper.mapToFilterArray(BillDispMethMap, Integer.class);
    if (BillDispMethFilter != null) {
      IntegerFilter[] BillDispMethFilters = new IntegerFilter[BillDispMethFilter.length];
      for (int i = 0; i < BillDispMethFilters.length; i++) {
        BillDispMethFilters[i] = (IntegerFilter)BillDispMethFilter[i];
      }
      try {
        out.setBillDispMethFilter(BillDispMethFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillFmtOptMap = (Map)record.get("BillFmtOpt");
    Boolean BillFmtOptFetch = DataHelper.getFetch(BillFmtOptMap);
    Boolean BillFmtOptSortDir = DataHelper.getSortDirection(BillFmtOptMap);
    Integer BillFmtOptSortOrder = DataHelper.getSortOrder(BillFmtOptMap);
    if (BillFmtOptFetch != null) out.setBillFmtOptFetch(BillFmtOptFetch);
    if (BillFmtOptSortDir != null) out.setBillFmtOptSortDirection(BillFmtOptSortDir);
    if (BillFmtOptSortOrder != null) out.setBillFmtOptSortOrder(BillFmtOptSortOrder);

    Filter[] BillFmtOptFilter = DataHelper.mapToFilterArray(BillFmtOptMap, Integer.class);
    if (BillFmtOptFilter != null) {
      IntegerFilter[] BillFmtOptFilters = new IntegerFilter[BillFmtOptFilter.length];
      for (int i = 0; i < BillFmtOptFilters.length; i++) {
        BillFmtOptFilters[i] = (IntegerFilter)BillFmtOptFilter[i];
      }
      try {
        out.setBillFmtOptFilter(BillFmtOptFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillFmtTypeMap = (Map)record.get("BillFmtType");
    Boolean BillFmtTypeFetch = DataHelper.getFetch(BillFmtTypeMap);
    Boolean BillFmtTypeSortDir = DataHelper.getSortDirection(BillFmtTypeMap);
    Integer BillFmtTypeSortOrder = DataHelper.getSortOrder(BillFmtTypeMap);
    if (BillFmtTypeFetch != null) out.setBillFmtTypeFetch(BillFmtTypeFetch);
    if (BillFmtTypeSortDir != null) out.setBillFmtTypeSortDirection(BillFmtTypeSortDir);
    if (BillFmtTypeSortOrder != null) out.setBillFmtTypeSortOrder(BillFmtTypeSortOrder);

    Filter[] BillFmtTypeFilter = DataHelper.mapToFilterArray(BillFmtTypeMap, String.class);
    if (BillFmtTypeFilter != null) {
      StringFilter[] BillFmtTypeFilters = new StringFilter[BillFmtTypeFilter.length];
      for (int i = 0; i < BillFmtTypeFilters.length; i++) {
        BillFmtTypeFilters[i] = (StringFilter)BillFmtTypeFilter[i];
      }
      try {
        out.setBillFmtTypeFilter(BillFmtTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddressIdMap = (Map)record.get("AddressId");
    Boolean AddressIdFetch = DataHelper.getFetch(AddressIdMap);
    Boolean AddressIdSortDir = DataHelper.getSortDirection(AddressIdMap);
    Integer AddressIdSortOrder = DataHelper.getSortOrder(AddressIdMap);
    if (AddressIdFetch != null) out.setAddressIdFetch(AddressIdFetch);
    if (AddressIdSortDir != null) out.setAddressIdSortDirection(AddressIdSortDir);
    if (AddressIdSortOrder != null) out.setAddressIdSortOrder(AddressIdSortOrder);

    Filter[] AddressIdFilter = DataHelper.mapToFilterArray(AddressIdMap, BigInteger.class);
    if (AddressIdFilter != null) {
      BigIntegerFilter[] AddressIdFilters = new BigIntegerFilter[AddressIdFilter.length];
      for (int i = 0; i < AddressIdFilters.length; i++) {
        AddressIdFilters[i] = (BigIntegerFilter)AddressIdFilter[i];
      }
      try {
        out.setAddressIdFilter(AddressIdFilters);
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
  
    Map ProcessedDateMap = (Map)record.get("ProcessedDate");
    Boolean ProcessedDateFetch = DataHelper.getFetch(ProcessedDateMap);
    Boolean ProcessedDateSortDir = DataHelper.getSortDirection(ProcessedDateMap);
    Integer ProcessedDateSortOrder = DataHelper.getSortOrder(ProcessedDateMap);
    if (ProcessedDateFetch != null) out.setProcessedDateFetch(ProcessedDateFetch);
    if (ProcessedDateSortDir != null) out.setProcessedDateSortDirection(ProcessedDateSortDir);
    if (ProcessedDateSortOrder != null) out.setProcessedDateSortOrder(ProcessedDateSortOrder);

    Filter[] ProcessedDateFilter = DataHelper.mapToFilterArray(ProcessedDateMap, Date.class);
    if (ProcessedDateFilter != null) {
      DateFilter[] ProcessedDateFilters = new DateFilter[ProcessedDateFilter.length];
      for (int i = 0; i < ProcessedDateFilters.length; i++) {
        ProcessedDateFilters[i] = (DateFilter)ProcessedDateFilter[i];
      }
      try {
        out.setProcessedDateFilter(ProcessedDateFilters);
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
  
    return out;
  }
}
