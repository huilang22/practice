/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentTypeObjectHelper.java
 * Definition File: Admin/AdjustmentType.xml
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
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;
import com.csgsystems.bp.data.*;


/** Helper class to convert AdjustmentTypeObject JavaBean objects to/from HashMaps.
 */
public class AdjustmentTypeObjectHelper implements ArubaObjectHelper
{
  /** convert AdjustmentTypeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AdjustmentTypeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentTypeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTypeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AdjustmentTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTypeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTypeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AdjustmentTypeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AdjustmentTypeObjectData the converted object
   */
  public static AdjustmentTypeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AdjustmentTypeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AdjustmentTypeObject")
   * @return AdjustmentTypeObjectData the converted object
   */
  public static AdjustmentTypeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AdjustmentTypeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AdjustmentTypeObjectFilter the converted object
   */
  public static AdjustmentTypeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AdjustmentTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AdjustmentTypeObject")
   * @return AdjustmentTypeObjectFilter the converted object
   */
  public static AdjustmentTypeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AdjustmentTypeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AdjustmentTypeObjectDataList the converted object
   */
  public static AdjustmentTypeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AdjustmentTypeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AdjustmentTypeObjectList")
   * @return AdjustmentTypeObjectDataList the converted object
   */
  public static AdjustmentTypeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentTypeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AdjustmentTypeObjectData[] array = null;
    if (root != null)
    {
      array = new AdjustmentTypeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AdjustmentTypeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AdjustmentTypeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AdjustmentTypeObjectDataList (array, index, total);
  }
  /** convert AdjustmentTypeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AdjustmentTypeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AdjustmentTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._TransTargetTypeSet) record.put ("TransTargetType", in.TransTargetType);
  
    if (in._TransTargetIdSet) record.put ("TransTargetId", in.TransTargetId);
  
    if (in._TransCategorySet) record.put ("TransCategory", in.TransCategory);
  
    if (in._TransSignSet) record.put ("TransSign", in.TransSign);
  
    if (in._BillingCategorySet) record.put ("BillingCategory", in.BillingCategory);
  
    if (in._BillingLevelSet) record.put ("BillingLevel", in.BillingLevel);
  
    if (in._TaxClassSet) record.put ("TaxClass", in.TaxClass);
  
    if (in._IsViewableSet) record.put ("IsViewable", in.IsViewable);
  
    if (in._IsModifiableSet) record.put ("IsModifiable", in.IsModifiable);
  
    if (in._IsAdjustableSet) record.put ("IsAdjustable", in.IsAdjustable);
  
    if (in._IsJournalableSet) record.put ("IsJournalable", in.IsJournalable);
  
    if (in._IsDisplayedOnbillSet) record.put ("IsDisplayedOnbill", in.IsDisplayedOnbill);
  
    if (in._IsDisconnectCreditSet) record.put ("IsDisconnectCredit", in.IsDisconnectCredit);
  
    if (in._IsRefinanceSet) record.put ("IsRefinance", in.IsRefinance);
  
    if (in._AnnotationTypeSet) record.put ("AnnotationType", in.AnnotationType);
  
    if (in._TaxOnInvoiceSet) record.put ("TaxOnInvoice", in.TaxOnInvoice);
  
    if (in._IsLateFeeExemptSet) record.put ("IsLateFeeExempt", in.IsLateFeeExempt);
  
    if (in._AllowInterimBillSet) record.put ("AllowInterimBill", in.AllowInterimBill);
  
    if (in._IsNegativeBillAdjSet) record.put ("IsNegativeBillAdj", in.IsNegativeBillAdj);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._DescriptionCodeSet) record.put ("DescriptionCode", in.DescriptionCode);
  
    if (in._DescriptionGroupSet) record.put ("DescriptionGroup", in.DescriptionGroup);
  
    if (in._DescriptionTextSet) record.put ("DescriptionText", in.DescriptionText);
  
    if (in._ShortDescriptionTextSet) record.put ("ShortDescriptionText", in.ShortDescriptionText);
      return record;
  }
  /** convert AdjustmentTypeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AdjustmentTypeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AdjustmentTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.TransTargetType, in.TransTargetTypeSort, in.TransTargetTypeSortAscending, in.TransTargetTypeFetch);
      if (map != null) record.put ("TransTargetType", map);
      map = DataHelper.filterToMap (in.TransTargetId, in.TransTargetIdSort, in.TransTargetIdSortAscending, in.TransTargetIdFetch);
      if (map != null) record.put ("TransTargetId", map);
      map = DataHelper.filterToMap (in.TransCategory, in.TransCategorySort, in.TransCategorySortAscending, in.TransCategoryFetch);
      if (map != null) record.put ("TransCategory", map);
      map = DataHelper.filterToMap (in.TransSign, in.TransSignSort, in.TransSignSortAscending, in.TransSignFetch);
      if (map != null) record.put ("TransSign", map);
      map = DataHelper.filterToMap (in.BillingCategory, in.BillingCategorySort, in.BillingCategorySortAscending, in.BillingCategoryFetch);
      if (map != null) record.put ("BillingCategory", map);
      map = DataHelper.filterToMap (in.BillingLevel, in.BillingLevelSort, in.BillingLevelSortAscending, in.BillingLevelFetch);
      if (map != null) record.put ("BillingLevel", map);
      map = DataHelper.filterToMap (in.TaxClass, in.TaxClassSort, in.TaxClassSortAscending, in.TaxClassFetch);
      if (map != null) record.put ("TaxClass", map);
      map = DataHelper.filterToMap (in.IsViewable, in.IsViewableSort, in.IsViewableSortAscending, in.IsViewableFetch);
      if (map != null) record.put ("IsViewable", map);
      map = DataHelper.filterToMap (in.IsModifiable, in.IsModifiableSort, in.IsModifiableSortAscending, in.IsModifiableFetch);
      if (map != null) record.put ("IsModifiable", map);
      map = DataHelper.filterToMap (in.IsAdjustable, in.IsAdjustableSort, in.IsAdjustableSortAscending, in.IsAdjustableFetch);
      if (map != null) record.put ("IsAdjustable", map);
      map = DataHelper.filterToMap (in.IsJournalable, in.IsJournalableSort, in.IsJournalableSortAscending, in.IsJournalableFetch);
      if (map != null) record.put ("IsJournalable", map);
      map = DataHelper.filterToMap (in.IsDisplayedOnbill, in.IsDisplayedOnbillSort, in.IsDisplayedOnbillSortAscending, in.IsDisplayedOnbillFetch);
      if (map != null) record.put ("IsDisplayedOnbill", map);
      map = DataHelper.filterToMap (in.IsDisconnectCredit, in.IsDisconnectCreditSort, in.IsDisconnectCreditSortAscending, in.IsDisconnectCreditFetch);
      if (map != null) record.put ("IsDisconnectCredit", map);
      map = DataHelper.filterToMap (in.IsRefinance, in.IsRefinanceSort, in.IsRefinanceSortAscending, in.IsRefinanceFetch);
      if (map != null) record.put ("IsRefinance", map);
      map = DataHelper.filterToMap (in.AnnotationType, in.AnnotationTypeSort, in.AnnotationTypeSortAscending, in.AnnotationTypeFetch);
      if (map != null) record.put ("AnnotationType", map);
      map = DataHelper.filterToMap (in.TaxOnInvoice, in.TaxOnInvoiceSort, in.TaxOnInvoiceSortAscending, in.TaxOnInvoiceFetch);
      if (map != null) record.put ("TaxOnInvoice", map);
      map = DataHelper.filterToMap (in.IsLateFeeExempt, in.IsLateFeeExemptSort, in.IsLateFeeExemptSortAscending, in.IsLateFeeExemptFetch);
      if (map != null) record.put ("IsLateFeeExempt", map);
      map = DataHelper.filterToMap (in.AllowInterimBill, in.AllowInterimBillSort, in.AllowInterimBillSortAscending, in.AllowInterimBillFetch);
      if (map != null) record.put ("AllowInterimBill", map);
      map = DataHelper.filterToMap (in.IsNegativeBillAdj, in.IsNegativeBillAdjSort, in.IsNegativeBillAdjSortAscending, in.IsNegativeBillAdjFetch);
      if (map != null) record.put ("IsNegativeBillAdj", map);
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
  /** convert Map to AdjustmentTypeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentTypeObjectData the converted object
   */
  public static AdjustmentTypeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentTypeObjectData out = new AdjustmentTypeObjectData ();

    out.Key = AdjustmentTypeObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("TransTargetType")) != null)
    {
      out.TransTargetType = (Integer) obj;
    }
  
    if ((obj = record.get ("TransTargetId")) != null)
    {
      out.TransTargetId = (Integer) obj;
    }
  
    if ((obj = record.get ("TransCategory")) != null)
    {
      out.TransCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("TransSign")) != null)
    {
      out.TransSign = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingCategory")) != null)
    {
      out.BillingCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingLevel")) != null)
    {
      out.BillingLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxClass")) != null)
    {
      out.TaxClass = (Integer) obj;
    }
  
    if ((obj = record.get ("IsViewable")) != null)
    {
      out.IsViewable = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsModifiable")) != null)
    {
      out.IsModifiable = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsAdjustable")) != null)
    {
      out.IsAdjustable = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsJournalable")) != null)
    {
      out.IsJournalable = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsDisplayedOnbill")) != null)
    {
      out.IsDisplayedOnbill = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsDisconnectCredit")) != null)
    {
      out.IsDisconnectCredit = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsRefinance")) != null)
    {
      out.IsRefinance = (Boolean) obj;
    }
  
    if ((obj = record.get ("AnnotationType")) != null)
    {
      out.AnnotationType = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxOnInvoice")) != null)
    {
      out.TaxOnInvoice = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsLateFeeExempt")) != null)
    {
      out.IsLateFeeExempt = (Boolean) obj;
    }
  
    if ((obj = record.get ("AllowInterimBill")) != null)
    {
      out.AllowInterimBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsNegativeBillAdj")) != null)
    {
      out.IsNegativeBillAdj = (Boolean) obj;
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
  /** convert Map to AdjustmentTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentTypeObjectFilter the converted object
   */
  public static AdjustmentTypeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentTypeObjectFilter out = new AdjustmentTypeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AdjustmentTypeObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map TransTargetTypeMap = (Map)record.get("TransTargetType");
    Boolean TransTargetTypeFetch = DataHelper.getFetch(TransTargetTypeMap);
    Boolean TransTargetTypeSortDir = DataHelper.getSortDirection(TransTargetTypeMap);
    Integer TransTargetTypeSortOrder = DataHelper.getSortOrder(TransTargetTypeMap);
    if (TransTargetTypeFetch != null) out.setTransTargetTypeFetch(TransTargetTypeFetch);
    if (TransTargetTypeSortDir != null) out.setTransTargetTypeSortDirection(TransTargetTypeSortDir);
    if (TransTargetTypeSortOrder != null) out.setTransTargetTypeSortOrder(TransTargetTypeSortOrder);

    Filter[] TransTargetTypeFilter = DataHelper.mapToFilterArray(TransTargetTypeMap, Integer.class);
    if (TransTargetTypeFilter != null) {
      IntegerFilter[] TransTargetTypeFilters = new IntegerFilter[TransTargetTypeFilter.length];
      for (int i = 0; i < TransTargetTypeFilters.length; i++) {
        TransTargetTypeFilters[i] = (IntegerFilter)TransTargetTypeFilter[i];
      }
      try {
        out.setTransTargetTypeFilter(TransTargetTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransTargetIdMap = (Map)record.get("TransTargetId");
    Boolean TransTargetIdFetch = DataHelper.getFetch(TransTargetIdMap);
    Boolean TransTargetIdSortDir = DataHelper.getSortDirection(TransTargetIdMap);
    Integer TransTargetIdSortOrder = DataHelper.getSortOrder(TransTargetIdMap);
    if (TransTargetIdFetch != null) out.setTransTargetIdFetch(TransTargetIdFetch);
    if (TransTargetIdSortDir != null) out.setTransTargetIdSortDirection(TransTargetIdSortDir);
    if (TransTargetIdSortOrder != null) out.setTransTargetIdSortOrder(TransTargetIdSortOrder);

    Filter[] TransTargetIdFilter = DataHelper.mapToFilterArray(TransTargetIdMap, Integer.class);
    if (TransTargetIdFilter != null) {
      IntegerFilter[] TransTargetIdFilters = new IntegerFilter[TransTargetIdFilter.length];
      for (int i = 0; i < TransTargetIdFilters.length; i++) {
        TransTargetIdFilters[i] = (IntegerFilter)TransTargetIdFilter[i];
      }
      try {
        out.setTransTargetIdFilter(TransTargetIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransCategoryMap = (Map)record.get("TransCategory");
    Boolean TransCategoryFetch = DataHelper.getFetch(TransCategoryMap);
    Boolean TransCategorySortDir = DataHelper.getSortDirection(TransCategoryMap);
    Integer TransCategorySortOrder = DataHelper.getSortOrder(TransCategoryMap);
    if (TransCategoryFetch != null) out.setTransCategoryFetch(TransCategoryFetch);
    if (TransCategorySortDir != null) out.setTransCategorySortDirection(TransCategorySortDir);
    if (TransCategorySortOrder != null) out.setTransCategorySortOrder(TransCategorySortOrder);

    Filter[] TransCategoryFilter = DataHelper.mapToFilterArray(TransCategoryMap, Integer.class);
    if (TransCategoryFilter != null) {
      IntegerFilter[] TransCategoryFilters = new IntegerFilter[TransCategoryFilter.length];
      for (int i = 0; i < TransCategoryFilters.length; i++) {
        TransCategoryFilters[i] = (IntegerFilter)TransCategoryFilter[i];
      }
      try {
        out.setTransCategoryFilter(TransCategoryFilters);
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
  
    Map BillingLevelMap = (Map)record.get("BillingLevel");
    Boolean BillingLevelFetch = DataHelper.getFetch(BillingLevelMap);
    Boolean BillingLevelSortDir = DataHelper.getSortDirection(BillingLevelMap);
    Integer BillingLevelSortOrder = DataHelper.getSortOrder(BillingLevelMap);
    if (BillingLevelFetch != null) out.setBillingLevelFetch(BillingLevelFetch);
    if (BillingLevelSortDir != null) out.setBillingLevelSortDirection(BillingLevelSortDir);
    if (BillingLevelSortOrder != null) out.setBillingLevelSortOrder(BillingLevelSortOrder);

    Filter[] BillingLevelFilter = DataHelper.mapToFilterArray(BillingLevelMap, Integer.class);
    if (BillingLevelFilter != null) {
      IntegerFilter[] BillingLevelFilters = new IntegerFilter[BillingLevelFilter.length];
      for (int i = 0; i < BillingLevelFilters.length; i++) {
        BillingLevelFilters[i] = (IntegerFilter)BillingLevelFilter[i];
      }
      try {
        out.setBillingLevelFilter(BillingLevelFilters);
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
  
    Map IsViewableMap = (Map)record.get("IsViewable");
    Boolean IsViewableFetch = DataHelper.getFetch(IsViewableMap);
    Boolean IsViewableSortDir = DataHelper.getSortDirection(IsViewableMap);
    Integer IsViewableSortOrder = DataHelper.getSortOrder(IsViewableMap);
    if (IsViewableFetch != null) out.setIsViewableFetch(IsViewableFetch);
    if (IsViewableSortDir != null) out.setIsViewableSortDirection(IsViewableSortDir);
    if (IsViewableSortOrder != null) out.setIsViewableSortOrder(IsViewableSortOrder);

    Filter[] IsViewableFilter = DataHelper.mapToFilterArray(IsViewableMap, Boolean.class);
    if (IsViewableFilter != null) {
      BooleanFilter[] IsViewableFilters = new BooleanFilter[IsViewableFilter.length];
      for (int i = 0; i < IsViewableFilters.length; i++) {
        IsViewableFilters[i] = (BooleanFilter)IsViewableFilter[i];
      }
      try {
        out.setIsViewableFilter(IsViewableFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsModifiableMap = (Map)record.get("IsModifiable");
    Boolean IsModifiableFetch = DataHelper.getFetch(IsModifiableMap);
    Boolean IsModifiableSortDir = DataHelper.getSortDirection(IsModifiableMap);
    Integer IsModifiableSortOrder = DataHelper.getSortOrder(IsModifiableMap);
    if (IsModifiableFetch != null) out.setIsModifiableFetch(IsModifiableFetch);
    if (IsModifiableSortDir != null) out.setIsModifiableSortDirection(IsModifiableSortDir);
    if (IsModifiableSortOrder != null) out.setIsModifiableSortOrder(IsModifiableSortOrder);

    Filter[] IsModifiableFilter = DataHelper.mapToFilterArray(IsModifiableMap, Boolean.class);
    if (IsModifiableFilter != null) {
      BooleanFilter[] IsModifiableFilters = new BooleanFilter[IsModifiableFilter.length];
      for (int i = 0; i < IsModifiableFilters.length; i++) {
        IsModifiableFilters[i] = (BooleanFilter)IsModifiableFilter[i];
      }
      try {
        out.setIsModifiableFilter(IsModifiableFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsAdjustableMap = (Map)record.get("IsAdjustable");
    Boolean IsAdjustableFetch = DataHelper.getFetch(IsAdjustableMap);
    Boolean IsAdjustableSortDir = DataHelper.getSortDirection(IsAdjustableMap);
    Integer IsAdjustableSortOrder = DataHelper.getSortOrder(IsAdjustableMap);
    if (IsAdjustableFetch != null) out.setIsAdjustableFetch(IsAdjustableFetch);
    if (IsAdjustableSortDir != null) out.setIsAdjustableSortDirection(IsAdjustableSortDir);
    if (IsAdjustableSortOrder != null) out.setIsAdjustableSortOrder(IsAdjustableSortOrder);

    Filter[] IsAdjustableFilter = DataHelper.mapToFilterArray(IsAdjustableMap, Boolean.class);
    if (IsAdjustableFilter != null) {
      BooleanFilter[] IsAdjustableFilters = new BooleanFilter[IsAdjustableFilter.length];
      for (int i = 0; i < IsAdjustableFilters.length; i++) {
        IsAdjustableFilters[i] = (BooleanFilter)IsAdjustableFilter[i];
      }
      try {
        out.setIsAdjustableFilter(IsAdjustableFilters);
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
  
    Map IsDisconnectCreditMap = (Map)record.get("IsDisconnectCredit");
    Boolean IsDisconnectCreditFetch = DataHelper.getFetch(IsDisconnectCreditMap);
    Boolean IsDisconnectCreditSortDir = DataHelper.getSortDirection(IsDisconnectCreditMap);
    Integer IsDisconnectCreditSortOrder = DataHelper.getSortOrder(IsDisconnectCreditMap);
    if (IsDisconnectCreditFetch != null) out.setIsDisconnectCreditFetch(IsDisconnectCreditFetch);
    if (IsDisconnectCreditSortDir != null) out.setIsDisconnectCreditSortDirection(IsDisconnectCreditSortDir);
    if (IsDisconnectCreditSortOrder != null) out.setIsDisconnectCreditSortOrder(IsDisconnectCreditSortOrder);

    Filter[] IsDisconnectCreditFilter = DataHelper.mapToFilterArray(IsDisconnectCreditMap, Boolean.class);
    if (IsDisconnectCreditFilter != null) {
      BooleanFilter[] IsDisconnectCreditFilters = new BooleanFilter[IsDisconnectCreditFilter.length];
      for (int i = 0; i < IsDisconnectCreditFilters.length; i++) {
        IsDisconnectCreditFilters[i] = (BooleanFilter)IsDisconnectCreditFilter[i];
      }
      try {
        out.setIsDisconnectCreditFilter(IsDisconnectCreditFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsRefinanceMap = (Map)record.get("IsRefinance");
    Boolean IsRefinanceFetch = DataHelper.getFetch(IsRefinanceMap);
    Boolean IsRefinanceSortDir = DataHelper.getSortDirection(IsRefinanceMap);
    Integer IsRefinanceSortOrder = DataHelper.getSortOrder(IsRefinanceMap);
    if (IsRefinanceFetch != null) out.setIsRefinanceFetch(IsRefinanceFetch);
    if (IsRefinanceSortDir != null) out.setIsRefinanceSortDirection(IsRefinanceSortDir);
    if (IsRefinanceSortOrder != null) out.setIsRefinanceSortOrder(IsRefinanceSortOrder);

    Filter[] IsRefinanceFilter = DataHelper.mapToFilterArray(IsRefinanceMap, Boolean.class);
    if (IsRefinanceFilter != null) {
      BooleanFilter[] IsRefinanceFilters = new BooleanFilter[IsRefinanceFilter.length];
      for (int i = 0; i < IsRefinanceFilters.length; i++) {
        IsRefinanceFilters[i] = (BooleanFilter)IsRefinanceFilter[i];
      }
      try {
        out.setIsRefinanceFilter(IsRefinanceFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AnnotationTypeMap = (Map)record.get("AnnotationType");
    Boolean AnnotationTypeFetch = DataHelper.getFetch(AnnotationTypeMap);
    Boolean AnnotationTypeSortDir = DataHelper.getSortDirection(AnnotationTypeMap);
    Integer AnnotationTypeSortOrder = DataHelper.getSortOrder(AnnotationTypeMap);
    if (AnnotationTypeFetch != null) out.setAnnotationTypeFetch(AnnotationTypeFetch);
    if (AnnotationTypeSortDir != null) out.setAnnotationTypeSortDirection(AnnotationTypeSortDir);
    if (AnnotationTypeSortOrder != null) out.setAnnotationTypeSortOrder(AnnotationTypeSortOrder);

    Filter[] AnnotationTypeFilter = DataHelper.mapToFilterArray(AnnotationTypeMap, Integer.class);
    if (AnnotationTypeFilter != null) {
      IntegerFilter[] AnnotationTypeFilters = new IntegerFilter[AnnotationTypeFilter.length];
      for (int i = 0; i < AnnotationTypeFilters.length; i++) {
        AnnotationTypeFilters[i] = (IntegerFilter)AnnotationTypeFilter[i];
      }
      try {
        out.setAnnotationTypeFilter(AnnotationTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxOnInvoiceMap = (Map)record.get("TaxOnInvoice");
    Boolean TaxOnInvoiceFetch = DataHelper.getFetch(TaxOnInvoiceMap);
    Boolean TaxOnInvoiceSortDir = DataHelper.getSortDirection(TaxOnInvoiceMap);
    Integer TaxOnInvoiceSortOrder = DataHelper.getSortOrder(TaxOnInvoiceMap);
    if (TaxOnInvoiceFetch != null) out.setTaxOnInvoiceFetch(TaxOnInvoiceFetch);
    if (TaxOnInvoiceSortDir != null) out.setTaxOnInvoiceSortDirection(TaxOnInvoiceSortDir);
    if (TaxOnInvoiceSortOrder != null) out.setTaxOnInvoiceSortOrder(TaxOnInvoiceSortOrder);

    Filter[] TaxOnInvoiceFilter = DataHelper.mapToFilterArray(TaxOnInvoiceMap, Boolean.class);
    if (TaxOnInvoiceFilter != null) {
      BooleanFilter[] TaxOnInvoiceFilters = new BooleanFilter[TaxOnInvoiceFilter.length];
      for (int i = 0; i < TaxOnInvoiceFilters.length; i++) {
        TaxOnInvoiceFilters[i] = (BooleanFilter)TaxOnInvoiceFilter[i];
      }
      try {
        out.setTaxOnInvoiceFilter(TaxOnInvoiceFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsLateFeeExemptMap = (Map)record.get("IsLateFeeExempt");
    Boolean IsLateFeeExemptFetch = DataHelper.getFetch(IsLateFeeExemptMap);
    Boolean IsLateFeeExemptSortDir = DataHelper.getSortDirection(IsLateFeeExemptMap);
    Integer IsLateFeeExemptSortOrder = DataHelper.getSortOrder(IsLateFeeExemptMap);
    if (IsLateFeeExemptFetch != null) out.setIsLateFeeExemptFetch(IsLateFeeExemptFetch);
    if (IsLateFeeExemptSortDir != null) out.setIsLateFeeExemptSortDirection(IsLateFeeExemptSortDir);
    if (IsLateFeeExemptSortOrder != null) out.setIsLateFeeExemptSortOrder(IsLateFeeExemptSortOrder);

    Filter[] IsLateFeeExemptFilter = DataHelper.mapToFilterArray(IsLateFeeExemptMap, Boolean.class);
    if (IsLateFeeExemptFilter != null) {
      BooleanFilter[] IsLateFeeExemptFilters = new BooleanFilter[IsLateFeeExemptFilter.length];
      for (int i = 0; i < IsLateFeeExemptFilters.length; i++) {
        IsLateFeeExemptFilters[i] = (BooleanFilter)IsLateFeeExemptFilter[i];
      }
      try {
        out.setIsLateFeeExemptFilter(IsLateFeeExemptFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllowInterimBillMap = (Map)record.get("AllowInterimBill");
    Boolean AllowInterimBillFetch = DataHelper.getFetch(AllowInterimBillMap);
    Boolean AllowInterimBillSortDir = DataHelper.getSortDirection(AllowInterimBillMap);
    Integer AllowInterimBillSortOrder = DataHelper.getSortOrder(AllowInterimBillMap);
    if (AllowInterimBillFetch != null) out.setAllowInterimBillFetch(AllowInterimBillFetch);
    if (AllowInterimBillSortDir != null) out.setAllowInterimBillSortDirection(AllowInterimBillSortDir);
    if (AllowInterimBillSortOrder != null) out.setAllowInterimBillSortOrder(AllowInterimBillSortOrder);

    Filter[] AllowInterimBillFilter = DataHelper.mapToFilterArray(AllowInterimBillMap, Boolean.class);
    if (AllowInterimBillFilter != null) {
      BooleanFilter[] AllowInterimBillFilters = new BooleanFilter[AllowInterimBillFilter.length];
      for (int i = 0; i < AllowInterimBillFilters.length; i++) {
        AllowInterimBillFilters[i] = (BooleanFilter)AllowInterimBillFilter[i];
      }
      try {
        out.setAllowInterimBillFilter(AllowInterimBillFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsNegativeBillAdjMap = (Map)record.get("IsNegativeBillAdj");
    Boolean IsNegativeBillAdjFetch = DataHelper.getFetch(IsNegativeBillAdjMap);
    Boolean IsNegativeBillAdjSortDir = DataHelper.getSortDirection(IsNegativeBillAdjMap);
    Integer IsNegativeBillAdjSortOrder = DataHelper.getSortOrder(IsNegativeBillAdjMap);
    if (IsNegativeBillAdjFetch != null) out.setIsNegativeBillAdjFetch(IsNegativeBillAdjFetch);
    if (IsNegativeBillAdjSortDir != null) out.setIsNegativeBillAdjSortDirection(IsNegativeBillAdjSortDir);
    if (IsNegativeBillAdjSortOrder != null) out.setIsNegativeBillAdjSortOrder(IsNegativeBillAdjSortOrder);

    Filter[] IsNegativeBillAdjFilter = DataHelper.mapToFilterArray(IsNegativeBillAdjMap, Boolean.class);
    if (IsNegativeBillAdjFilter != null) {
      BooleanFilter[] IsNegativeBillAdjFilters = new BooleanFilter[IsNegativeBillAdjFilter.length];
      for (int i = 0; i < IsNegativeBillAdjFilters.length; i++) {
        IsNegativeBillAdjFilters[i] = (BooleanFilter)IsNegativeBillAdjFilter[i];
      }
      try {
        out.setIsNegativeBillAdjFilter(IsNegativeBillAdjFilters);
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
