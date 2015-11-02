/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillImageObjectHelper.java
 * Definition File: Customer/BillImage.xml
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



/** Helper class to convert BillImageObject JavaBean objects to/from HashMaps.
 */
public class BillImageObjectHelper implements ArubaObjectHelper
{
  /** convert BillImageObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BillImageObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillImageObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillImageObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillImageObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillImageObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BillImageObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillImageObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillImageObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillImageObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillImageObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillImageObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillImageObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BillImageObjectData the converted object
   */
  public static BillImageObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillImageObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillImageObject")
   * @return BillImageObjectData the converted object
   */
  public static BillImageObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillImageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillImageObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BillImageObjectFilter the converted object
   */
  public static BillImageObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillImageObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillImageObject")
   * @return BillImageObjectFilter the converted object
   */
  public static BillImageObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillImageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BillImageObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BillImageObjectDataList the converted object
   */
  public static BillImageObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BillImageObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BillImageObjectList")
   * @return BillImageObjectDataList the converted object
   */
  public static BillImageObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillImageObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BillImageObjectData[] array = null;
    if (root != null)
    {
      array = new BillImageObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BillImageObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BillImageObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BillImageObjectDataList (array, index, total);
  }
  /** convert BillImageObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillImageObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", BillImageObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._FromDateSet) record.put ("FromDate", in.FromDate);
  
    if (in._ToDateSet) record.put ("ToDate", in.ToDate);
  
    if (in._BillDateSet) record.put ("BillDate", in.BillDate);
  
    if (in._DueDateSet) record.put ("DueDate", in.DueDate);
  
    if (in._BillLnameSet) record.put ("BillLname", in.BillLname);
  
    if (in._BillFnameSet) record.put ("BillFname", in.BillFname);
  
    if (in._BillCompanySet) record.put ("BillCompany", in.BillCompany);
  
    if (in._Contact1NameSet) record.put ("Contact1Name", in.Contact1Name);
  
    if (in._Contact2NameSet) record.put ("Contact2Name", in.Contact2Name);
  
    if (in._BillImageSet) record.put ("BillImage", in.BillImage);
  
    if (in._ImageSizeSet) record.put ("ImageSize", in.ImageSize);
  
    if (in._CompressionTypeSet) record.put ("CompressionType", in.CompressionType);
  
    if (in._CompressedSizeSet) record.put ("CompressedSize", in.CompressedSize);
  
    if (in._ArchFlagSet) record.put ("ArchFlag", in.ArchFlag);
      return record;
  }
  /** convert BillImageObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillImageObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", BillImageObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.FromDate, in.FromDateSort, in.FromDateSortAscending, in.FromDateFetch);
      if (map != null) record.put ("FromDate", map);
      map = DataHelper.filterToMap (in.ToDate, in.ToDateSort, in.ToDateSortAscending, in.ToDateFetch);
      if (map != null) record.put ("ToDate", map);
      map = DataHelper.filterToMap (in.BillDate, in.BillDateSort, in.BillDateSortAscending, in.BillDateFetch);
      if (map != null) record.put ("BillDate", map);
      map = DataHelper.filterToMap (in.DueDate, in.DueDateSort, in.DueDateSortAscending, in.DueDateFetch);
      if (map != null) record.put ("DueDate", map);
      map = DataHelper.filterToMap (in.BillLname, in.BillLnameSort, in.BillLnameSortAscending, in.BillLnameFetch, in.BillLnameCaseInsensitive);
      if (map != null) record.put ("BillLname", map);
      map = DataHelper.filterToMap (in.BillFname, in.BillFnameSort, in.BillFnameSortAscending, in.BillFnameFetch, in.BillFnameCaseInsensitive);
      if (map != null) record.put ("BillFname", map);
      map = DataHelper.filterToMap (in.BillCompany, in.BillCompanySort, in.BillCompanySortAscending, in.BillCompanyFetch, in.BillCompanyCaseInsensitive);
      if (map != null) record.put ("BillCompany", map);
      map = DataHelper.filterToMap (in.Contact1Name, in.Contact1NameSort, in.Contact1NameSortAscending, in.Contact1NameFetch, in.Contact1NameCaseInsensitive);
      if (map != null) record.put ("Contact1Name", map);
      map = DataHelper.filterToMap (in.Contact2Name, in.Contact2NameSort, in.Contact2NameSortAscending, in.Contact2NameFetch, in.Contact2NameCaseInsensitive);
      if (map != null) record.put ("Contact2Name", map);
      map = DataHelper.filterToMap (in.BillImage, in.BillImageSort, in.BillImageSortAscending, in.BillImageFetch);
      if (map != null) record.put ("BillImage", map);
      map = DataHelper.filterToMap (in.ImageSize, in.ImageSizeSort, in.ImageSizeSortAscending, in.ImageSizeFetch);
      if (map != null) record.put ("ImageSize", map);
      map = DataHelper.filterToMap (in.CompressionType, in.CompressionTypeSort, in.CompressionTypeSortAscending, in.CompressionTypeFetch);
      if (map != null) record.put ("CompressionType", map);
      map = DataHelper.filterToMap (in.CompressedSize, in.CompressedSizeSort, in.CompressedSizeSortAscending, in.CompressedSizeFetch);
      if (map != null) record.put ("CompressedSize", map);
      map = DataHelper.filterToMap (in.ArchFlag, in.ArchFlagSort, in.ArchFlagSortAscending, in.ArchFlagFetch);
      if (map != null) record.put ("ArchFlag", map);
    return record;
  }
  /** convert Map to BillImageObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillImageObjectData the converted object
   */
  public static BillImageObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillImageObjectData out = new BillImageObjectData ();

    out.Key = BillImageObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("FromDate")) != null)
    {
      out.FromDate = (Date) obj;
    }
  
    if ((obj = record.get ("ToDate")) != null)
    {
      out.ToDate = (Date) obj;
    }
  
    if ((obj = record.get ("BillDate")) != null)
    {
      out.BillDate = (Date) obj;
    }
  
    if ((obj = record.get ("DueDate")) != null)
    {
      out.DueDate = (Date) obj;
    }
  
    if ((obj = record.get ("BillLname")) != null)
    {
      out.BillLname = (String) obj;
    }
  
    if ((obj = record.get ("BillFname")) != null)
    {
      out.BillFname = (String) obj;
    }
  
    if ((obj = record.get ("BillCompany")) != null)
    {
      out.BillCompany = (String) obj;
    }
  
    if ((obj = record.get ("Contact1Name")) != null)
    {
      out.Contact1Name = (String) obj;
    }
  
    if ((obj = record.get ("Contact2Name")) != null)
    {
      out.Contact2Name = (String) obj;
    }
  
    if ((obj = record.get ("BillImage")) != null)
    {
      out.BillImage = (String) obj;
    }
  
    if ((obj = record.get ("ImageSize")) != null)
    {
      out.ImageSize = (Integer) obj;
    }
  
    if ((obj = record.get ("CompressionType")) != null)
    {
      out.CompressionType = (Integer) obj;
    }
  
    if ((obj = record.get ("CompressedSize")) != null)
    {
      out.CompressedSize = (Integer) obj;
    }
  
    if ((obj = record.get ("ArchFlag")) != null)
    {
      out.ArchFlag = (Boolean) obj;
    }
      return out;
  }
  /** convert Map to BillImageObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillImageObjectFilter the converted object
   */
  public static BillImageObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillImageObjectFilter out = new BillImageObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = BillImageObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map FromDateMap = (Map)record.get("FromDate");
    Boolean FromDateFetch = DataHelper.getFetch(FromDateMap);
    Boolean FromDateSortDir = DataHelper.getSortDirection(FromDateMap);
    Integer FromDateSortOrder = DataHelper.getSortOrder(FromDateMap);
    if (FromDateFetch != null) out.setFromDateFetch(FromDateFetch);
    if (FromDateSortDir != null) out.setFromDateSortDirection(FromDateSortDir);
    if (FromDateSortOrder != null) out.setFromDateSortOrder(FromDateSortOrder);

    Filter[] FromDateFilter = DataHelper.mapToFilterArray(FromDateMap, Date.class);
    if (FromDateFilter != null) {
      DateFilter[] FromDateFilters = new DateFilter[FromDateFilter.length];
      for (int i = 0; i < FromDateFilters.length; i++) {
        FromDateFilters[i] = (DateFilter)FromDateFilter[i];
      }
      try {
        out.setFromDateFilter(FromDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ToDateMap = (Map)record.get("ToDate");
    Boolean ToDateFetch = DataHelper.getFetch(ToDateMap);
    Boolean ToDateSortDir = DataHelper.getSortDirection(ToDateMap);
    Integer ToDateSortOrder = DataHelper.getSortOrder(ToDateMap);
    if (ToDateFetch != null) out.setToDateFetch(ToDateFetch);
    if (ToDateSortDir != null) out.setToDateSortDirection(ToDateSortDir);
    if (ToDateSortOrder != null) out.setToDateSortOrder(ToDateSortOrder);

    Filter[] ToDateFilter = DataHelper.mapToFilterArray(ToDateMap, Date.class);
    if (ToDateFilter != null) {
      DateFilter[] ToDateFilters = new DateFilter[ToDateFilter.length];
      for (int i = 0; i < ToDateFilters.length; i++) {
        ToDateFilters[i] = (DateFilter)ToDateFilter[i];
      }
      try {
        out.setToDateFilter(ToDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillDateMap = (Map)record.get("BillDate");
    Boolean BillDateFetch = DataHelper.getFetch(BillDateMap);
    Boolean BillDateSortDir = DataHelper.getSortDirection(BillDateMap);
    Integer BillDateSortOrder = DataHelper.getSortOrder(BillDateMap);
    if (BillDateFetch != null) out.setBillDateFetch(BillDateFetch);
    if (BillDateSortDir != null) out.setBillDateSortDirection(BillDateSortDir);
    if (BillDateSortOrder != null) out.setBillDateSortOrder(BillDateSortOrder);

    Filter[] BillDateFilter = DataHelper.mapToFilterArray(BillDateMap, Date.class);
    if (BillDateFilter != null) {
      DateFilter[] BillDateFilters = new DateFilter[BillDateFilter.length];
      for (int i = 0; i < BillDateFilters.length; i++) {
        BillDateFilters[i] = (DateFilter)BillDateFilter[i];
      }
      try {
        out.setBillDateFilter(BillDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DueDateMap = (Map)record.get("DueDate");
    Boolean DueDateFetch = DataHelper.getFetch(DueDateMap);
    Boolean DueDateSortDir = DataHelper.getSortDirection(DueDateMap);
    Integer DueDateSortOrder = DataHelper.getSortOrder(DueDateMap);
    if (DueDateFetch != null) out.setDueDateFetch(DueDateFetch);
    if (DueDateSortDir != null) out.setDueDateSortDirection(DueDateSortDir);
    if (DueDateSortOrder != null) out.setDueDateSortOrder(DueDateSortOrder);

    Filter[] DueDateFilter = DataHelper.mapToFilterArray(DueDateMap, Date.class);
    if (DueDateFilter != null) {
      DateFilter[] DueDateFilters = new DateFilter[DueDateFilter.length];
      for (int i = 0; i < DueDateFilters.length; i++) {
        DueDateFilters[i] = (DateFilter)DueDateFilter[i];
      }
      try {
        out.setDueDateFilter(DueDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillLnameMap = (Map)record.get("BillLname");
    Boolean BillLnameFetch = DataHelper.getFetch(BillLnameMap);
    Boolean BillLnameSortDir = DataHelper.getSortDirection(BillLnameMap);
    Integer BillLnameSortOrder = DataHelper.getSortOrder(BillLnameMap);
    if (BillLnameFetch != null) out.setBillLnameFetch(BillLnameFetch);
    if (BillLnameSortDir != null) out.setBillLnameSortDirection(BillLnameSortDir);
    if (BillLnameSortOrder != null) out.setBillLnameSortOrder(BillLnameSortOrder);

    Filter[] BillLnameFilter = DataHelper.mapToFilterArray(BillLnameMap, String.class);
    if (BillLnameFilter != null) {
      StringFilter[] BillLnameFilters = new StringFilter[BillLnameFilter.length];
      for (int i = 0; i < BillLnameFilters.length; i++) {
        BillLnameFilters[i] = (StringFilter)BillLnameFilter[i];
      }
      try {
        out.setBillLnameFilter(BillLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillFnameMap = (Map)record.get("BillFname");
    Boolean BillFnameFetch = DataHelper.getFetch(BillFnameMap);
    Boolean BillFnameSortDir = DataHelper.getSortDirection(BillFnameMap);
    Integer BillFnameSortOrder = DataHelper.getSortOrder(BillFnameMap);
    if (BillFnameFetch != null) out.setBillFnameFetch(BillFnameFetch);
    if (BillFnameSortDir != null) out.setBillFnameSortDirection(BillFnameSortDir);
    if (BillFnameSortOrder != null) out.setBillFnameSortOrder(BillFnameSortOrder);

    Filter[] BillFnameFilter = DataHelper.mapToFilterArray(BillFnameMap, String.class);
    if (BillFnameFilter != null) {
      StringFilter[] BillFnameFilters = new StringFilter[BillFnameFilter.length];
      for (int i = 0; i < BillFnameFilters.length; i++) {
        BillFnameFilters[i] = (StringFilter)BillFnameFilter[i];
      }
      try {
        out.setBillFnameFilter(BillFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCompanyMap = (Map)record.get("BillCompany");
    Boolean BillCompanyFetch = DataHelper.getFetch(BillCompanyMap);
    Boolean BillCompanySortDir = DataHelper.getSortDirection(BillCompanyMap);
    Integer BillCompanySortOrder = DataHelper.getSortOrder(BillCompanyMap);
    if (BillCompanyFetch != null) out.setBillCompanyFetch(BillCompanyFetch);
    if (BillCompanySortDir != null) out.setBillCompanySortDirection(BillCompanySortDir);
    if (BillCompanySortOrder != null) out.setBillCompanySortOrder(BillCompanySortOrder);

    Filter[] BillCompanyFilter = DataHelper.mapToFilterArray(BillCompanyMap, String.class);
    if (BillCompanyFilter != null) {
      StringFilter[] BillCompanyFilters = new StringFilter[BillCompanyFilter.length];
      for (int i = 0; i < BillCompanyFilters.length; i++) {
        BillCompanyFilters[i] = (StringFilter)BillCompanyFilter[i];
      }
      try {
        out.setBillCompanyFilter(BillCompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map Contact1NameMap = (Map)record.get("Contact1Name");
    Boolean Contact1NameFetch = DataHelper.getFetch(Contact1NameMap);
    Boolean Contact1NameSortDir = DataHelper.getSortDirection(Contact1NameMap);
    Integer Contact1NameSortOrder = DataHelper.getSortOrder(Contact1NameMap);
    if (Contact1NameFetch != null) out.setContact1NameFetch(Contact1NameFetch);
    if (Contact1NameSortDir != null) out.setContact1NameSortDirection(Contact1NameSortDir);
    if (Contact1NameSortOrder != null) out.setContact1NameSortOrder(Contact1NameSortOrder);

    Filter[] Contact1NameFilter = DataHelper.mapToFilterArray(Contact1NameMap, String.class);
    if (Contact1NameFilter != null) {
      StringFilter[] Contact1NameFilters = new StringFilter[Contact1NameFilter.length];
      for (int i = 0; i < Contact1NameFilters.length; i++) {
        Contact1NameFilters[i] = (StringFilter)Contact1NameFilter[i];
      }
      try {
        out.setContact1NameFilter(Contact1NameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map Contact2NameMap = (Map)record.get("Contact2Name");
    Boolean Contact2NameFetch = DataHelper.getFetch(Contact2NameMap);
    Boolean Contact2NameSortDir = DataHelper.getSortDirection(Contact2NameMap);
    Integer Contact2NameSortOrder = DataHelper.getSortOrder(Contact2NameMap);
    if (Contact2NameFetch != null) out.setContact2NameFetch(Contact2NameFetch);
    if (Contact2NameSortDir != null) out.setContact2NameSortDirection(Contact2NameSortDir);
    if (Contact2NameSortOrder != null) out.setContact2NameSortOrder(Contact2NameSortOrder);

    Filter[] Contact2NameFilter = DataHelper.mapToFilterArray(Contact2NameMap, String.class);
    if (Contact2NameFilter != null) {
      StringFilter[] Contact2NameFilters = new StringFilter[Contact2NameFilter.length];
      for (int i = 0; i < Contact2NameFilters.length; i++) {
        Contact2NameFilters[i] = (StringFilter)Contact2NameFilter[i];
      }
      try {
        out.setContact2NameFilter(Contact2NameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillImageMap = (Map)record.get("BillImage");
    Boolean BillImageFetch = DataHelper.getFetch(BillImageMap);
    Boolean BillImageSortDir = DataHelper.getSortDirection(BillImageMap);
    Integer BillImageSortOrder = DataHelper.getSortOrder(BillImageMap);
    if (BillImageFetch != null) out.setBillImageFetch(BillImageFetch);
    if (BillImageSortDir != null) out.setBillImageSortDirection(BillImageSortDir);
    if (BillImageSortOrder != null) out.setBillImageSortOrder(BillImageSortOrder);

    Filter[] BillImageFilter = DataHelper.mapToFilterArray(BillImageMap, String.class);
    if (BillImageFilter != null) {
      StringFilter[] BillImageFilters = new StringFilter[BillImageFilter.length];
      for (int i = 0; i < BillImageFilters.length; i++) {
        BillImageFilters[i] = (StringFilter)BillImageFilter[i];
      }
      try {
        out.setBillImageFilter(BillImageFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ImageSizeMap = (Map)record.get("ImageSize");
    Boolean ImageSizeFetch = DataHelper.getFetch(ImageSizeMap);
    Boolean ImageSizeSortDir = DataHelper.getSortDirection(ImageSizeMap);
    Integer ImageSizeSortOrder = DataHelper.getSortOrder(ImageSizeMap);
    if (ImageSizeFetch != null) out.setImageSizeFetch(ImageSizeFetch);
    if (ImageSizeSortDir != null) out.setImageSizeSortDirection(ImageSizeSortDir);
    if (ImageSizeSortOrder != null) out.setImageSizeSortOrder(ImageSizeSortOrder);

    Filter[] ImageSizeFilter = DataHelper.mapToFilterArray(ImageSizeMap, Integer.class);
    if (ImageSizeFilter != null) {
      IntegerFilter[] ImageSizeFilters = new IntegerFilter[ImageSizeFilter.length];
      for (int i = 0; i < ImageSizeFilters.length; i++) {
        ImageSizeFilters[i] = (IntegerFilter)ImageSizeFilter[i];
      }
      try {
        out.setImageSizeFilter(ImageSizeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CompressionTypeMap = (Map)record.get("CompressionType");
    Boolean CompressionTypeFetch = DataHelper.getFetch(CompressionTypeMap);
    Boolean CompressionTypeSortDir = DataHelper.getSortDirection(CompressionTypeMap);
    Integer CompressionTypeSortOrder = DataHelper.getSortOrder(CompressionTypeMap);
    if (CompressionTypeFetch != null) out.setCompressionTypeFetch(CompressionTypeFetch);
    if (CompressionTypeSortDir != null) out.setCompressionTypeSortDirection(CompressionTypeSortDir);
    if (CompressionTypeSortOrder != null) out.setCompressionTypeSortOrder(CompressionTypeSortOrder);

    Filter[] CompressionTypeFilter = DataHelper.mapToFilterArray(CompressionTypeMap, Integer.class);
    if (CompressionTypeFilter != null) {
      IntegerFilter[] CompressionTypeFilters = new IntegerFilter[CompressionTypeFilter.length];
      for (int i = 0; i < CompressionTypeFilters.length; i++) {
        CompressionTypeFilters[i] = (IntegerFilter)CompressionTypeFilter[i];
      }
      try {
        out.setCompressionTypeFilter(CompressionTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CompressedSizeMap = (Map)record.get("CompressedSize");
    Boolean CompressedSizeFetch = DataHelper.getFetch(CompressedSizeMap);
    Boolean CompressedSizeSortDir = DataHelper.getSortDirection(CompressedSizeMap);
    Integer CompressedSizeSortOrder = DataHelper.getSortOrder(CompressedSizeMap);
    if (CompressedSizeFetch != null) out.setCompressedSizeFetch(CompressedSizeFetch);
    if (CompressedSizeSortDir != null) out.setCompressedSizeSortDirection(CompressedSizeSortDir);
    if (CompressedSizeSortOrder != null) out.setCompressedSizeSortOrder(CompressedSizeSortOrder);

    Filter[] CompressedSizeFilter = DataHelper.mapToFilterArray(CompressedSizeMap, Integer.class);
    if (CompressedSizeFilter != null) {
      IntegerFilter[] CompressedSizeFilters = new IntegerFilter[CompressedSizeFilter.length];
      for (int i = 0; i < CompressedSizeFilters.length; i++) {
        CompressedSizeFilters[i] = (IntegerFilter)CompressedSizeFilter[i];
      }
      try {
        out.setCompressedSizeFilter(CompressedSizeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ArchFlagMap = (Map)record.get("ArchFlag");
    Boolean ArchFlagFetch = DataHelper.getFetch(ArchFlagMap);
    Boolean ArchFlagSortDir = DataHelper.getSortDirection(ArchFlagMap);
    Integer ArchFlagSortOrder = DataHelper.getSortOrder(ArchFlagMap);
    if (ArchFlagFetch != null) out.setArchFlagFetch(ArchFlagFetch);
    if (ArchFlagSortDir != null) out.setArchFlagSortDirection(ArchFlagSortDir);
    if (ArchFlagSortOrder != null) out.setArchFlagSortOrder(ArchFlagSortOrder);

    Filter[] ArchFlagFilter = DataHelper.mapToFilterArray(ArchFlagMap, Boolean.class);
    if (ArchFlagFilter != null) {
      BooleanFilter[] ArchFlagFilters = new BooleanFilter[ArchFlagFilter.length];
      for (int i = 0; i < ArchFlagFilters.length; i++) {
        ArchFlagFilters[i] = (BooleanFilter)ArchFlagFilter[i];
      }
      try {
        out.setArchFlagFilter(ArchFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
