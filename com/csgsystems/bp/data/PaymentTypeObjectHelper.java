/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentTypeObjectHelper.java
 * Definition File: Admin/PaymentType.xml
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



/** Helper class to convert PaymentTypeObject JavaBean objects to/from HashMaps.
 */
public class PaymentTypeObjectHelper implements ArubaObjectHelper
{
  /** convert PaymentTypeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PaymentTypeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentTypeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTypeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTypeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTypeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentTypeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PaymentTypeObjectData the converted object
   */
  public static PaymentTypeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentTypeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentTypeObject")
   * @return PaymentTypeObjectData the converted object
   */
  public static PaymentTypeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentTypeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PaymentTypeObjectFilter the converted object
   */
  public static PaymentTypeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentTypeObject")
   * @return PaymentTypeObjectFilter the converted object
   */
  public static PaymentTypeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PaymentTypeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PaymentTypeObjectDataList the converted object
   */
  public static PaymentTypeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PaymentTypeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PaymentTypeObjectList")
   * @return PaymentTypeObjectDataList the converted object
   */
  public static PaymentTypeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTypeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PaymentTypeObjectData[] array = null;
    if (root != null)
    {
      array = new PaymentTypeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PaymentTypeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PaymentTypeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PaymentTypeObjectDataList (array, index, total);
  }
  /** convert PaymentTypeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentTypeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PaymentTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BmfTransCategorySet) record.put ("BmfTransCategory", in.BmfTransCategory);
  
    if (in._TransSignSet) record.put ("TransSign", in.TransSign);
  
    if (in._BillingCategorySet) record.put ("BillingCategory", in.BillingCategory);
  
    if (in._AllowManualEntrySet) record.put ("AllowManualEntry", in.AllowManualEntry);
  
    if (in._AllowSuspenseAcntSet) record.put ("AllowSuspenseAcnt", in.AllowSuspenseAcnt);
  
    if (in._IsDisplayedOnbillSet) record.put ("IsDisplayedOnbill", in.IsDisplayedOnbill);
  
    if (in._IsJournalableSet) record.put ("IsJournalable", in.IsJournalable);
  
    if (in._AllowAutotransferSet) record.put ("AllowAutotransfer", in.AllowAutotransfer);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._DescriptionCodeSet) record.put ("DescriptionCode", in.DescriptionCode);
  
    if (in._DescriptionGroupSet) record.put ("DescriptionGroup", in.DescriptionGroup);
  
    if (in._DescriptionTextSet) record.put ("DescriptionText", in.DescriptionText);
  
    if (in._ShortDescriptionTextSet) record.put ("ShortDescriptionText", in.ShortDescriptionText);
      return record;
  }
  /** convert PaymentTypeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentTypeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PaymentTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BmfTransCategory, in.BmfTransCategorySort, in.BmfTransCategorySortAscending, in.BmfTransCategoryFetch);
      if (map != null) record.put ("BmfTransCategory", map);
      map = DataHelper.filterToMap (in.TransSign, in.TransSignSort, in.TransSignSortAscending, in.TransSignFetch);
      if (map != null) record.put ("TransSign", map);
      map = DataHelper.filterToMap (in.BillingCategory, in.BillingCategorySort, in.BillingCategorySortAscending, in.BillingCategoryFetch);
      if (map != null) record.put ("BillingCategory", map);
      map = DataHelper.filterToMap (in.AllowManualEntry, in.AllowManualEntrySort, in.AllowManualEntrySortAscending, in.AllowManualEntryFetch);
      if (map != null) record.put ("AllowManualEntry", map);
      map = DataHelper.filterToMap (in.AllowSuspenseAcnt, in.AllowSuspenseAcntSort, in.AllowSuspenseAcntSortAscending, in.AllowSuspenseAcntFetch);
      if (map != null) record.put ("AllowSuspenseAcnt", map);
      map = DataHelper.filterToMap (in.IsDisplayedOnbill, in.IsDisplayedOnbillSort, in.IsDisplayedOnbillSortAscending, in.IsDisplayedOnbillFetch);
      if (map != null) record.put ("IsDisplayedOnbill", map);
      map = DataHelper.filterToMap (in.IsJournalable, in.IsJournalableSort, in.IsJournalableSortAscending, in.IsJournalableFetch);
      if (map != null) record.put ("IsJournalable", map);
      map = DataHelper.filterToMap (in.AllowAutotransfer, in.AllowAutotransferSort, in.AllowAutotransferSortAscending, in.AllowAutotransferFetch);
      if (map != null) record.put ("AllowAutotransfer", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.DescriptionCode, in.DescriptionCodeSort, in.DescriptionCodeSortAscending, in.DescriptionCodeFetch);
      if (map != null) record.put ("DescriptionCode", map);
      map = DataHelper.filterToMap (in.DescriptionGroup, in.DescriptionGroupSort, in.DescriptionGroupSortAscending, in.DescriptionGroupFetch);
      if (map != null) record.put ("DescriptionGroup", map);
      map = DataHelper.filterToMap (in.DescriptionText, in.DescriptionTextSort, in.DescriptionTextSortAscending, in.DescriptionTextFetch, in.DescriptionTextCaseInsensitive);
      if (map != null) record.put ("DescriptionText", map);
      map = DataHelper.filterToMap (in.ShortDescriptionText, in.ShortDescriptionTextSort, in.ShortDescriptionTextSortAscending, in.ShortDescriptionTextFetch, in.ShortDescriptionTextCaseInsensitive);
      if (map != null) record.put ("ShortDescriptionText", map);
    return record;
  }
  /** convert Map to PaymentTypeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentTypeObjectData the converted object
   */
  public static PaymentTypeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentTypeObjectData out = new PaymentTypeObjectData ();

    out.Key = PaymentTypeObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BmfTransCategory")) != null)
    {
      out.BmfTransCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("TransSign")) != null)
    {
      out.TransSign = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingCategory")) != null)
    {
      out.BillingCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("AllowManualEntry")) != null)
    {
      out.AllowManualEntry = (Boolean) obj;
    }
  
    if ((obj = record.get ("AllowSuspenseAcnt")) != null)
    {
      out.AllowSuspenseAcnt = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsDisplayedOnbill")) != null)
    {
      out.IsDisplayedOnbill = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsJournalable")) != null)
    {
      out.IsJournalable = (Boolean) obj;
    }
  
    if ((obj = record.get ("AllowAutotransfer")) != null)
    {
      out.AllowAutotransfer = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
  
    if ((obj = record.get ("DescriptionCode")) != null)
    {
      out.DescriptionCode = (Integer) obj;
    }
  
    if ((obj = record.get ("DescriptionGroup")) != null)
    {
      out.DescriptionGroup = (Integer) obj;
    }
  
    if ((obj = record.get ("DescriptionText")) != null)
    {
      out.DescriptionText = (String) obj;
    }
  
    if ((obj = record.get ("ShortDescriptionText")) != null)
    {
      out.ShortDescriptionText = (String) obj;
    }
      return out;
  }
  /** convert Map to PaymentTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentTypeObjectFilter the converted object
   */
  public static PaymentTypeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentTypeObjectFilter out = new PaymentTypeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PaymentTypeObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map BmfTransCategoryMap = (Map)record.get("BmfTransCategory");
    Boolean BmfTransCategoryFetch = DataHelper.getFetch(BmfTransCategoryMap);
    Boolean BmfTransCategorySortDir = DataHelper.getSortDirection(BmfTransCategoryMap);
    Integer BmfTransCategorySortOrder = DataHelper.getSortOrder(BmfTransCategoryMap);
    if (BmfTransCategoryFetch != null) out.setBmfTransCategoryFetch(BmfTransCategoryFetch);
    if (BmfTransCategorySortDir != null) out.setBmfTransCategorySortDirection(BmfTransCategorySortDir);
    if (BmfTransCategorySortOrder != null) out.setBmfTransCategorySortOrder(BmfTransCategorySortOrder);

    Filter[] BmfTransCategoryFilter = DataHelper.mapToFilterArray(BmfTransCategoryMap, Integer.class);
    if (BmfTransCategoryFilter != null) {
      IntegerFilter[] BmfTransCategoryFilters = new IntegerFilter[BmfTransCategoryFilter.length];
      for (int i = 0; i < BmfTransCategoryFilters.length; i++) {
        BmfTransCategoryFilters[i] = (IntegerFilter)BmfTransCategoryFilter[i];
      }
      try {
        out.setBmfTransCategoryFilter(BmfTransCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransSignMap = (Map)record.get("TransSign");
    Boolean TransSignFetch = DataHelper.getFetch(TransSignMap);
    Boolean TransSignSortDir = DataHelper.getSortDirection(TransSignMap);
    Integer TransSignSortOrder = DataHelper.getSortOrder(TransSignMap);
    if (TransSignFetch != null) out.setTransSignFetch(TransSignFetch);
    if (TransSignSortDir != null) out.setTransSignSortDirection(TransSignSortDir);
    if (TransSignSortOrder != null) out.setTransSignSortOrder(TransSignSortOrder);

    Filter[] TransSignFilter = DataHelper.mapToFilterArray(TransSignMap, Integer.class);
    if (TransSignFilter != null) {
      IntegerFilter[] TransSignFilters = new IntegerFilter[TransSignFilter.length];
      for (int i = 0; i < TransSignFilters.length; i++) {
        TransSignFilters[i] = (IntegerFilter)TransSignFilter[i];
      }
      try {
        out.setTransSignFilter(TransSignFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillingCategoryMap = (Map)record.get("BillingCategory");
    Boolean BillingCategoryFetch = DataHelper.getFetch(BillingCategoryMap);
    Boolean BillingCategorySortDir = DataHelper.getSortDirection(BillingCategoryMap);
    Integer BillingCategorySortOrder = DataHelper.getSortOrder(BillingCategoryMap);
    if (BillingCategoryFetch != null) out.setBillingCategoryFetch(BillingCategoryFetch);
    if (BillingCategorySortDir != null) out.setBillingCategorySortDirection(BillingCategorySortDir);
    if (BillingCategorySortOrder != null) out.setBillingCategorySortOrder(BillingCategorySortOrder);

    Filter[] BillingCategoryFilter = DataHelper.mapToFilterArray(BillingCategoryMap, Integer.class);
    if (BillingCategoryFilter != null) {
      IntegerFilter[] BillingCategoryFilters = new IntegerFilter[BillingCategoryFilter.length];
      for (int i = 0; i < BillingCategoryFilters.length; i++) {
        BillingCategoryFilters[i] = (IntegerFilter)BillingCategoryFilter[i];
      }
      try {
        out.setBillingCategoryFilter(BillingCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllowManualEntryMap = (Map)record.get("AllowManualEntry");
    Boolean AllowManualEntryFetch = DataHelper.getFetch(AllowManualEntryMap);
    Boolean AllowManualEntrySortDir = DataHelper.getSortDirection(AllowManualEntryMap);
    Integer AllowManualEntrySortOrder = DataHelper.getSortOrder(AllowManualEntryMap);
    if (AllowManualEntryFetch != null) out.setAllowManualEntryFetch(AllowManualEntryFetch);
    if (AllowManualEntrySortDir != null) out.setAllowManualEntrySortDirection(AllowManualEntrySortDir);
    if (AllowManualEntrySortOrder != null) out.setAllowManualEntrySortOrder(AllowManualEntrySortOrder);

    Filter[] AllowManualEntryFilter = DataHelper.mapToFilterArray(AllowManualEntryMap, Boolean.class);
    if (AllowManualEntryFilter != null) {
      BooleanFilter[] AllowManualEntryFilters = new BooleanFilter[AllowManualEntryFilter.length];
      for (int i = 0; i < AllowManualEntryFilters.length; i++) {
        AllowManualEntryFilters[i] = (BooleanFilter)AllowManualEntryFilter[i];
      }
      try {
        out.setAllowManualEntryFilter(AllowManualEntryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllowSuspenseAcntMap = (Map)record.get("AllowSuspenseAcnt");
    Boolean AllowSuspenseAcntFetch = DataHelper.getFetch(AllowSuspenseAcntMap);
    Boolean AllowSuspenseAcntSortDir = DataHelper.getSortDirection(AllowSuspenseAcntMap);
    Integer AllowSuspenseAcntSortOrder = DataHelper.getSortOrder(AllowSuspenseAcntMap);
    if (AllowSuspenseAcntFetch != null) out.setAllowSuspenseAcntFetch(AllowSuspenseAcntFetch);
    if (AllowSuspenseAcntSortDir != null) out.setAllowSuspenseAcntSortDirection(AllowSuspenseAcntSortDir);
    if (AllowSuspenseAcntSortOrder != null) out.setAllowSuspenseAcntSortOrder(AllowSuspenseAcntSortOrder);

    Filter[] AllowSuspenseAcntFilter = DataHelper.mapToFilterArray(AllowSuspenseAcntMap, Boolean.class);
    if (AllowSuspenseAcntFilter != null) {
      BooleanFilter[] AllowSuspenseAcntFilters = new BooleanFilter[AllowSuspenseAcntFilter.length];
      for (int i = 0; i < AllowSuspenseAcntFilters.length; i++) {
        AllowSuspenseAcntFilters[i] = (BooleanFilter)AllowSuspenseAcntFilter[i];
      }
      try {
        out.setAllowSuspenseAcntFilter(AllowSuspenseAcntFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsDisplayedOnbillMap = (Map)record.get("IsDisplayedOnbill");
    Boolean IsDisplayedOnbillFetch = DataHelper.getFetch(IsDisplayedOnbillMap);
    Boolean IsDisplayedOnbillSortDir = DataHelper.getSortDirection(IsDisplayedOnbillMap);
    Integer IsDisplayedOnbillSortOrder = DataHelper.getSortOrder(IsDisplayedOnbillMap);
    if (IsDisplayedOnbillFetch != null) out.setIsDisplayedOnbillFetch(IsDisplayedOnbillFetch);
    if (IsDisplayedOnbillSortDir != null) out.setIsDisplayedOnbillSortDirection(IsDisplayedOnbillSortDir);
    if (IsDisplayedOnbillSortOrder != null) out.setIsDisplayedOnbillSortOrder(IsDisplayedOnbillSortOrder);

    Filter[] IsDisplayedOnbillFilter = DataHelper.mapToFilterArray(IsDisplayedOnbillMap, Boolean.class);
    if (IsDisplayedOnbillFilter != null) {
      BooleanFilter[] IsDisplayedOnbillFilters = new BooleanFilter[IsDisplayedOnbillFilter.length];
      for (int i = 0; i < IsDisplayedOnbillFilters.length; i++) {
        IsDisplayedOnbillFilters[i] = (BooleanFilter)IsDisplayedOnbillFilter[i];
      }
      try {
        out.setIsDisplayedOnbillFilter(IsDisplayedOnbillFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsJournalableMap = (Map)record.get("IsJournalable");
    Boolean IsJournalableFetch = DataHelper.getFetch(IsJournalableMap);
    Boolean IsJournalableSortDir = DataHelper.getSortDirection(IsJournalableMap);
    Integer IsJournalableSortOrder = DataHelper.getSortOrder(IsJournalableMap);
    if (IsJournalableFetch != null) out.setIsJournalableFetch(IsJournalableFetch);
    if (IsJournalableSortDir != null) out.setIsJournalableSortDirection(IsJournalableSortDir);
    if (IsJournalableSortOrder != null) out.setIsJournalableSortOrder(IsJournalableSortOrder);

    Filter[] IsJournalableFilter = DataHelper.mapToFilterArray(IsJournalableMap, Boolean.class);
    if (IsJournalableFilter != null) {
      BooleanFilter[] IsJournalableFilters = new BooleanFilter[IsJournalableFilter.length];
      for (int i = 0; i < IsJournalableFilters.length; i++) {
        IsJournalableFilters[i] = (BooleanFilter)IsJournalableFilter[i];
      }
      try {
        out.setIsJournalableFilter(IsJournalableFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllowAutotransferMap = (Map)record.get("AllowAutotransfer");
    Boolean AllowAutotransferFetch = DataHelper.getFetch(AllowAutotransferMap);
    Boolean AllowAutotransferSortDir = DataHelper.getSortDirection(AllowAutotransferMap);
    Integer AllowAutotransferSortOrder = DataHelper.getSortOrder(AllowAutotransferMap);
    if (AllowAutotransferFetch != null) out.setAllowAutotransferFetch(AllowAutotransferFetch);
    if (AllowAutotransferSortDir != null) out.setAllowAutotransferSortDirection(AllowAutotransferSortDir);
    if (AllowAutotransferSortOrder != null) out.setAllowAutotransferSortOrder(AllowAutotransferSortOrder);

    Filter[] AllowAutotransferFilter = DataHelper.mapToFilterArray(AllowAutotransferMap, Boolean.class);
    if (AllowAutotransferFilter != null) {
      BooleanFilter[] AllowAutotransferFilters = new BooleanFilter[AllowAutotransferFilter.length];
      for (int i = 0; i < AllowAutotransferFilters.length; i++) {
        AllowAutotransferFilters[i] = (BooleanFilter)AllowAutotransferFilter[i];
      }
      try {
        out.setAllowAutotransferFilter(AllowAutotransferFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ConfigTagIdMap = (Map)record.get("ConfigTagId");
    Boolean ConfigTagIdFetch = DataHelper.getFetch(ConfigTagIdMap);
    Boolean ConfigTagIdSortDir = DataHelper.getSortDirection(ConfigTagIdMap);
    Integer ConfigTagIdSortOrder = DataHelper.getSortOrder(ConfigTagIdMap);
    if (ConfigTagIdFetch != null) out.setConfigTagIdFetch(ConfigTagIdFetch);
    if (ConfigTagIdSortDir != null) out.setConfigTagIdSortDirection(ConfigTagIdSortDir);
    if (ConfigTagIdSortOrder != null) out.setConfigTagIdSortOrder(ConfigTagIdSortOrder);

    Filter[] ConfigTagIdFilter = DataHelper.mapToFilterArray(ConfigTagIdMap, String.class);
    if (ConfigTagIdFilter != null) {
      StringFilter[] ConfigTagIdFilters = new StringFilter[ConfigTagIdFilter.length];
      for (int i = 0; i < ConfigTagIdFilters.length; i++) {
        ConfigTagIdFilters[i] = (StringFilter)ConfigTagIdFilter[i];
      }
      try {
        out.setConfigTagIdFilter(ConfigTagIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DescriptionCodeMap = (Map)record.get("DescriptionCode");
    Boolean DescriptionCodeFetch = DataHelper.getFetch(DescriptionCodeMap);
    Boolean DescriptionCodeSortDir = DataHelper.getSortDirection(DescriptionCodeMap);
    Integer DescriptionCodeSortOrder = DataHelper.getSortOrder(DescriptionCodeMap);
    if (DescriptionCodeFetch != null) out.setDescriptionCodeFetch(DescriptionCodeFetch);
    if (DescriptionCodeSortDir != null) out.setDescriptionCodeSortDirection(DescriptionCodeSortDir);
    if (DescriptionCodeSortOrder != null) out.setDescriptionCodeSortOrder(DescriptionCodeSortOrder);

    Filter[] DescriptionCodeFilter = DataHelper.mapToFilterArray(DescriptionCodeMap, Integer.class);
    if (DescriptionCodeFilter != null) {
      IntegerFilter[] DescriptionCodeFilters = new IntegerFilter[DescriptionCodeFilter.length];
      for (int i = 0; i < DescriptionCodeFilters.length; i++) {
        DescriptionCodeFilters[i] = (IntegerFilter)DescriptionCodeFilter[i];
      }
      try {
        out.setDescriptionCodeFilter(DescriptionCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DescriptionGroupMap = (Map)record.get("DescriptionGroup");
    Boolean DescriptionGroupFetch = DataHelper.getFetch(DescriptionGroupMap);
    Boolean DescriptionGroupSortDir = DataHelper.getSortDirection(DescriptionGroupMap);
    Integer DescriptionGroupSortOrder = DataHelper.getSortOrder(DescriptionGroupMap);
    if (DescriptionGroupFetch != null) out.setDescriptionGroupFetch(DescriptionGroupFetch);
    if (DescriptionGroupSortDir != null) out.setDescriptionGroupSortDirection(DescriptionGroupSortDir);
    if (DescriptionGroupSortOrder != null) out.setDescriptionGroupSortOrder(DescriptionGroupSortOrder);

    Filter[] DescriptionGroupFilter = DataHelper.mapToFilterArray(DescriptionGroupMap, Integer.class);
    if (DescriptionGroupFilter != null) {
      IntegerFilter[] DescriptionGroupFilters = new IntegerFilter[DescriptionGroupFilter.length];
      for (int i = 0; i < DescriptionGroupFilters.length; i++) {
        DescriptionGroupFilters[i] = (IntegerFilter)DescriptionGroupFilter[i];
      }
      try {
        out.setDescriptionGroupFilter(DescriptionGroupFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DescriptionTextMap = (Map)record.get("DescriptionText");
    Boolean DescriptionTextFetch = DataHelper.getFetch(DescriptionTextMap);
    Boolean DescriptionTextSortDir = DataHelper.getSortDirection(DescriptionTextMap);
    Integer DescriptionTextSortOrder = DataHelper.getSortOrder(DescriptionTextMap);
    if (DescriptionTextFetch != null) out.setDescriptionTextFetch(DescriptionTextFetch);
    if (DescriptionTextSortDir != null) out.setDescriptionTextSortDirection(DescriptionTextSortDir);
    if (DescriptionTextSortOrder != null) out.setDescriptionTextSortOrder(DescriptionTextSortOrder);

    Filter[] DescriptionTextFilter = DataHelper.mapToFilterArray(DescriptionTextMap, String.class);
    if (DescriptionTextFilter != null) {
      StringFilter[] DescriptionTextFilters = new StringFilter[DescriptionTextFilter.length];
      for (int i = 0; i < DescriptionTextFilters.length; i++) {
        DescriptionTextFilters[i] = (StringFilter)DescriptionTextFilter[i];
      }
      try {
        out.setDescriptionTextFilter(DescriptionTextFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ShortDescriptionTextMap = (Map)record.get("ShortDescriptionText");
    Boolean ShortDescriptionTextFetch = DataHelper.getFetch(ShortDescriptionTextMap);
    Boolean ShortDescriptionTextSortDir = DataHelper.getSortDirection(ShortDescriptionTextMap);
    Integer ShortDescriptionTextSortOrder = DataHelper.getSortOrder(ShortDescriptionTextMap);
    if (ShortDescriptionTextFetch != null) out.setShortDescriptionTextFetch(ShortDescriptionTextFetch);
    if (ShortDescriptionTextSortDir != null) out.setShortDescriptionTextSortDirection(ShortDescriptionTextSortDir);
    if (ShortDescriptionTextSortOrder != null) out.setShortDescriptionTextSortOrder(ShortDescriptionTextSortOrder);

    Filter[] ShortDescriptionTextFilter = DataHelper.mapToFilterArray(ShortDescriptionTextMap, String.class);
    if (ShortDescriptionTextFilter != null) {
      StringFilter[] ShortDescriptionTextFilters = new StringFilter[ShortDescriptionTextFilter.length];
      for (int i = 0; i < ShortDescriptionTextFilters.length; i++) {
        ShortDescriptionTextFilters[i] = (StringFilter)ShortDescriptionTextFilter[i];
      }
      try {
        out.setShortDescriptionTextFilter(ShortDescriptionTextFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
