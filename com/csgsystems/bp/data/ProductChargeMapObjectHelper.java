/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductChargeMapObjectHelper.java
 * Definition File: Customer/ProductChargeMap.xml
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



/** Helper class to convert ProductChargeMapObject JavaBean objects to/from HashMaps.
 */
public class ProductChargeMapObjectHelper implements ArubaObjectHelper
{
  /** convert ProductChargeMapObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ProductChargeMapObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ProductChargeMapObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ProductChargeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (ProductChargeMapObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ProductChargeMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ProductChargeMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ProductChargeMapObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ProductChargeMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ProductChargeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (ProductChargeMapObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ProductChargeMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ProductChargeMapObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ProductChargeMapObjectData the converted object
   */
  public static ProductChargeMapObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ProductChargeMapObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ProductChargeMapObject")
   * @return ProductChargeMapObjectData the converted object
   */
  public static ProductChargeMapObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ProductChargeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ProductChargeMapObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ProductChargeMapObjectFilter the converted object
   */
  public static ProductChargeMapObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ProductChargeMapObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ProductChargeMapObject")
   * @return ProductChargeMapObjectFilter the converted object
   */
  public static ProductChargeMapObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ProductChargeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ProductChargeMapObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ProductChargeMapObjectDataList the converted object
   */
  public static ProductChargeMapObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ProductChargeMapObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ProductChargeMapObjectList")
   * @return ProductChargeMapObjectDataList the converted object
   */
  public static ProductChargeMapObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ProductChargeMapObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ProductChargeMapObjectData[] array = null;
    if (root != null)
    {
      array = new ProductChargeMapObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ProductChargeMapObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ProductChargeMapObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ProductChargeMapObjectDataList (array, index, total);
  }
  /** convert ProductChargeMapObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ProductChargeMapObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ProductChargeMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BillingAccountInternalIdSet) record.put ("BillingAccountInternalId", in.BillingAccountInternalId);
  
    if (in._BilledThruDtSet) record.put ("BilledThruDt", in.BilledThruDt);
  
    if (in._BillPeriodSet) record.put ("BillPeriod", in.BillPeriod);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._ParentAccountInternalIdSet) record.put ("ParentAccountInternalId", in.ParentAccountInternalId);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._InArrearsOverrideSet) record.put ("InArrearsOverride", in.InArrearsOverride);
  
    if (in._ActivationCodeSet) record.put ("ActivationCode", in.ActivationCode);
  
    if (in._TerminationCodeSet) record.put ("TerminationCode", in.TerminationCode);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._BillingAccountExternalIdSet) record.put ("BillingAccountExternalId", in.BillingAccountExternalId);
  
    if (in._BillingAccountExternalIdTypeSet) record.put ("BillingAccountExternalIdType", in.BillingAccountExternalIdType);
      return record;
  }
  /** convert ProductChargeMapObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ProductChargeMapObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ProductChargeMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BillingAccountInternalId, in.BillingAccountInternalIdSort, in.BillingAccountInternalIdSortAscending, in.BillingAccountInternalIdFetch);
      if (map != null) record.put ("BillingAccountInternalId", map);
      map = DataHelper.filterToMap (in.BilledThruDt, in.BilledThruDtSort, in.BilledThruDtSortAscending, in.BilledThruDtFetch);
      if (map != null) record.put ("BilledThruDt", map);
      map = DataHelper.filterToMap (in.BillPeriod, in.BillPeriodSort, in.BillPeriodSortAscending, in.BillPeriodFetch, in.BillPeriodCaseInsensitive);
      if (map != null) record.put ("BillPeriod", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
      map = DataHelper.filterToMap (in.ParentAccountInternalId, in.ParentAccountInternalIdSort, in.ParentAccountInternalIdSortAscending, in.ParentAccountInternalIdFetch);
      if (map != null) record.put ("ParentAccountInternalId", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.InArrearsOverride, in.InArrearsOverrideSort, in.InArrearsOverrideSortAscending, in.InArrearsOverrideFetch);
      if (map != null) record.put ("InArrearsOverride", map);
      map = DataHelper.filterToMap (in.ActivationCode, in.ActivationCodeSort, in.ActivationCodeSortAscending, in.ActivationCodeFetch);
      if (map != null) record.put ("ActivationCode", map);
      map = DataHelper.filterToMap (in.TerminationCode, in.TerminationCodeSort, in.TerminationCodeSortAscending, in.TerminationCodeFetch);
      if (map != null) record.put ("TerminationCode", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.BillingAccountExternalId, in.BillingAccountExternalIdSort, in.BillingAccountExternalIdSortAscending, in.BillingAccountExternalIdFetch, in.BillingAccountExternalIdCaseInsensitive);
      if (map != null) record.put ("BillingAccountExternalId", map);
      map = DataHelper.filterToMap (in.BillingAccountExternalIdType, in.BillingAccountExternalIdTypeSort, in.BillingAccountExternalIdTypeSortAscending, in.BillingAccountExternalIdTypeFetch);
      if (map != null) record.put ("BillingAccountExternalIdType", map);
    return record;
  }
  /** convert Map to ProductChargeMapObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ProductChargeMapObjectData the converted object
   */
  public static ProductChargeMapObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductChargeMapObjectData out = new ProductChargeMapObjectData ();

    out.Key = ProductChargeMapObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BillingAccountInternalId")) != null)
    {
      out.BillingAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("BilledThruDt")) != null)
    {
      out.BilledThruDt = (Date) obj;
    }
  
    if ((obj = record.get ("BillPeriod")) != null)
    {
      out.BillPeriod = (String) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("ParentAccountInternalId")) != null)
    {
      out.ParentAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("InArrearsOverride")) != null)
    {
      out.InArrearsOverride = (Integer) obj;
    }
  
    if ((obj = record.get ("ActivationCode")) != null)
    {
      out.ActivationCode = (Integer) obj;
    }
  
    if ((obj = record.get ("TerminationCode")) != null)
    {
      out.TerminationCode = (Integer) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("BillingAccountExternalId")) != null)
    {
      out.BillingAccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("BillingAccountExternalIdType")) != null)
    {
      out.BillingAccountExternalIdType = (Integer) obj;
    }
      return out;
  }
  /** convert Map to ProductChargeMapObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ProductChargeMapObjectFilter the converted object
   */
  public static ProductChargeMapObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductChargeMapObjectFilter out = new ProductChargeMapObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ProductChargeMapObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map BillingAccountInternalIdMap = (Map)record.get("BillingAccountInternalId");
    Boolean BillingAccountInternalIdFetch = DataHelper.getFetch(BillingAccountInternalIdMap);
    Boolean BillingAccountInternalIdSortDir = DataHelper.getSortDirection(BillingAccountInternalIdMap);
    Integer BillingAccountInternalIdSortOrder = DataHelper.getSortOrder(BillingAccountInternalIdMap);
    if (BillingAccountInternalIdFetch != null) out.setBillingAccountInternalIdFetch(BillingAccountInternalIdFetch);
    if (BillingAccountInternalIdSortDir != null) out.setBillingAccountInternalIdSortDirection(BillingAccountInternalIdSortDir);
    if (BillingAccountInternalIdSortOrder != null) out.setBillingAccountInternalIdSortOrder(BillingAccountInternalIdSortOrder);

    Filter[] BillingAccountInternalIdFilter = DataHelper.mapToFilterArray(BillingAccountInternalIdMap, Integer.class);
    if (BillingAccountInternalIdFilter != null) {
      IntegerFilter[] BillingAccountInternalIdFilters = new IntegerFilter[BillingAccountInternalIdFilter.length];
      for (int i = 0; i < BillingAccountInternalIdFilters.length; i++) {
        BillingAccountInternalIdFilters[i] = (IntegerFilter)BillingAccountInternalIdFilter[i];
      }
      try {
        out.setBillingAccountInternalIdFilter(BillingAccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BilledThruDtMap = (Map)record.get("BilledThruDt");
    Boolean BilledThruDtFetch = DataHelper.getFetch(BilledThruDtMap);
    Boolean BilledThruDtSortDir = DataHelper.getSortDirection(BilledThruDtMap);
    Integer BilledThruDtSortOrder = DataHelper.getSortOrder(BilledThruDtMap);
    if (BilledThruDtFetch != null) out.setBilledThruDtFetch(BilledThruDtFetch);
    if (BilledThruDtSortDir != null) out.setBilledThruDtSortDirection(BilledThruDtSortDir);
    if (BilledThruDtSortOrder != null) out.setBilledThruDtSortOrder(BilledThruDtSortOrder);

    Filter[] BilledThruDtFilter = DataHelper.mapToFilterArray(BilledThruDtMap, Date.class);
    if (BilledThruDtFilter != null) {
      DateFilter[] BilledThruDtFilters = new DateFilter[BilledThruDtFilter.length];
      for (int i = 0; i < BilledThruDtFilters.length; i++) {
        BilledThruDtFilters[i] = (DateFilter)BilledThruDtFilter[i];
      }
      try {
        out.setBilledThruDtFilter(BilledThruDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillPeriodMap = (Map)record.get("BillPeriod");
    Boolean BillPeriodFetch = DataHelper.getFetch(BillPeriodMap);
    Boolean BillPeriodSortDir = DataHelper.getSortDirection(BillPeriodMap);
    Integer BillPeriodSortOrder = DataHelper.getSortOrder(BillPeriodMap);
    if (BillPeriodFetch != null) out.setBillPeriodFetch(BillPeriodFetch);
    if (BillPeriodSortDir != null) out.setBillPeriodSortDirection(BillPeriodSortDir);
    if (BillPeriodSortOrder != null) out.setBillPeriodSortOrder(BillPeriodSortOrder);

    Filter[] BillPeriodFilter = DataHelper.mapToFilterArray(BillPeriodMap, String.class);
    if (BillPeriodFilter != null) {
      StringFilter[] BillPeriodFilters = new StringFilter[BillPeriodFilter.length];
      for (int i = 0; i < BillPeriodFilters.length; i++) {
        BillPeriodFilters[i] = (StringFilter)BillPeriodFilter[i];
      }
      try {
        out.setBillPeriodFilter(BillPeriodFilters);
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
  
    Map ParentAccountInternalIdMap = (Map)record.get("ParentAccountInternalId");
    Boolean ParentAccountInternalIdFetch = DataHelper.getFetch(ParentAccountInternalIdMap);
    Boolean ParentAccountInternalIdSortDir = DataHelper.getSortDirection(ParentAccountInternalIdMap);
    Integer ParentAccountInternalIdSortOrder = DataHelper.getSortOrder(ParentAccountInternalIdMap);
    if (ParentAccountInternalIdFetch != null) out.setParentAccountInternalIdFetch(ParentAccountInternalIdFetch);
    if (ParentAccountInternalIdSortDir != null) out.setParentAccountInternalIdSortDirection(ParentAccountInternalIdSortDir);
    if (ParentAccountInternalIdSortOrder != null) out.setParentAccountInternalIdSortOrder(ParentAccountInternalIdSortOrder);

    Filter[] ParentAccountInternalIdFilter = DataHelper.mapToFilterArray(ParentAccountInternalIdMap, Integer.class);
    if (ParentAccountInternalIdFilter != null) {
      IntegerFilter[] ParentAccountInternalIdFilters = new IntegerFilter[ParentAccountInternalIdFilter.length];
      for (int i = 0; i < ParentAccountInternalIdFilters.length; i++) {
        ParentAccountInternalIdFilters[i] = (IntegerFilter)ParentAccountInternalIdFilter[i];
      }
      try {
        out.setParentAccountInternalIdFilter(ParentAccountInternalIdFilters);
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
  
    Map InArrearsOverrideMap = (Map)record.get("InArrearsOverride");
    Boolean InArrearsOverrideFetch = DataHelper.getFetch(InArrearsOverrideMap);
    Boolean InArrearsOverrideSortDir = DataHelper.getSortDirection(InArrearsOverrideMap);
    Integer InArrearsOverrideSortOrder = DataHelper.getSortOrder(InArrearsOverrideMap);
    if (InArrearsOverrideFetch != null) out.setInArrearsOverrideFetch(InArrearsOverrideFetch);
    if (InArrearsOverrideSortDir != null) out.setInArrearsOverrideSortDirection(InArrearsOverrideSortDir);
    if (InArrearsOverrideSortOrder != null) out.setInArrearsOverrideSortOrder(InArrearsOverrideSortOrder);

    Filter[] InArrearsOverrideFilter = DataHelper.mapToFilterArray(InArrearsOverrideMap, Integer.class);
    if (InArrearsOverrideFilter != null) {
      IntegerFilter[] InArrearsOverrideFilters = new IntegerFilter[InArrearsOverrideFilter.length];
      for (int i = 0; i < InArrearsOverrideFilters.length; i++) {
        InArrearsOverrideFilters[i] = (IntegerFilter)InArrearsOverrideFilter[i];
      }
      try {
        out.setInArrearsOverrideFilter(InArrearsOverrideFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActivationCodeMap = (Map)record.get("ActivationCode");
    Boolean ActivationCodeFetch = DataHelper.getFetch(ActivationCodeMap);
    Boolean ActivationCodeSortDir = DataHelper.getSortDirection(ActivationCodeMap);
    Integer ActivationCodeSortOrder = DataHelper.getSortOrder(ActivationCodeMap);
    if (ActivationCodeFetch != null) out.setActivationCodeFetch(ActivationCodeFetch);
    if (ActivationCodeSortDir != null) out.setActivationCodeSortDirection(ActivationCodeSortDir);
    if (ActivationCodeSortOrder != null) out.setActivationCodeSortOrder(ActivationCodeSortOrder);

    Filter[] ActivationCodeFilter = DataHelper.mapToFilterArray(ActivationCodeMap, Integer.class);
    if (ActivationCodeFilter != null) {
      IntegerFilter[] ActivationCodeFilters = new IntegerFilter[ActivationCodeFilter.length];
      for (int i = 0; i < ActivationCodeFilters.length; i++) {
        ActivationCodeFilters[i] = (IntegerFilter)ActivationCodeFilter[i];
      }
      try {
        out.setActivationCodeFilter(ActivationCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TerminationCodeMap = (Map)record.get("TerminationCode");
    Boolean TerminationCodeFetch = DataHelper.getFetch(TerminationCodeMap);
    Boolean TerminationCodeSortDir = DataHelper.getSortDirection(TerminationCodeMap);
    Integer TerminationCodeSortOrder = DataHelper.getSortOrder(TerminationCodeMap);
    if (TerminationCodeFetch != null) out.setTerminationCodeFetch(TerminationCodeFetch);
    if (TerminationCodeSortDir != null) out.setTerminationCodeSortDirection(TerminationCodeSortDir);
    if (TerminationCodeSortOrder != null) out.setTerminationCodeSortOrder(TerminationCodeSortOrder);

    Filter[] TerminationCodeFilter = DataHelper.mapToFilterArray(TerminationCodeMap, Integer.class);
    if (TerminationCodeFilter != null) {
      IntegerFilter[] TerminationCodeFilters = new IntegerFilter[TerminationCodeFilter.length];
      for (int i = 0; i < TerminationCodeFilters.length; i++) {
        TerminationCodeFilters[i] = (IntegerFilter)TerminationCodeFilter[i];
      }
      try {
        out.setTerminationCodeFilter(TerminationCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDtMap = (Map)record.get("InactiveDt");
    Boolean InactiveDtFetch = DataHelper.getFetch(InactiveDtMap);
    Boolean InactiveDtSortDir = DataHelper.getSortDirection(InactiveDtMap);
    Integer InactiveDtSortOrder = DataHelper.getSortOrder(InactiveDtMap);
    if (InactiveDtFetch != null) out.setInactiveDtFetch(InactiveDtFetch);
    if (InactiveDtSortDir != null) out.setInactiveDtSortDirection(InactiveDtSortDir);
    if (InactiveDtSortOrder != null) out.setInactiveDtSortOrder(InactiveDtSortOrder);

    Filter[] InactiveDtFilter = DataHelper.mapToFilterArray(InactiveDtMap, Date.class);
    if (InactiveDtFilter != null) {
      DateFilter[] InactiveDtFilters = new DateFilter[InactiveDtFilter.length];
      for (int i = 0; i < InactiveDtFilters.length; i++) {
        InactiveDtFilters[i] = (DateFilter)InactiveDtFilter[i];
      }
      try {
        out.setInactiveDtFilter(InactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillingAccountExternalIdMap = (Map)record.get("BillingAccountExternalId");
    Boolean BillingAccountExternalIdFetch = DataHelper.getFetch(BillingAccountExternalIdMap);
    Boolean BillingAccountExternalIdSortDir = DataHelper.getSortDirection(BillingAccountExternalIdMap);
    Integer BillingAccountExternalIdSortOrder = DataHelper.getSortOrder(BillingAccountExternalIdMap);
    if (BillingAccountExternalIdFetch != null) out.setBillingAccountExternalIdFetch(BillingAccountExternalIdFetch);
    if (BillingAccountExternalIdSortDir != null) out.setBillingAccountExternalIdSortDirection(BillingAccountExternalIdSortDir);
    if (BillingAccountExternalIdSortOrder != null) out.setBillingAccountExternalIdSortOrder(BillingAccountExternalIdSortOrder);

    Filter[] BillingAccountExternalIdFilter = DataHelper.mapToFilterArray(BillingAccountExternalIdMap, String.class);
    if (BillingAccountExternalIdFilter != null) {
      StringFilter[] BillingAccountExternalIdFilters = new StringFilter[BillingAccountExternalIdFilter.length];
      for (int i = 0; i < BillingAccountExternalIdFilters.length; i++) {
        BillingAccountExternalIdFilters[i] = (StringFilter)BillingAccountExternalIdFilter[i];
      }
      try {
        out.setBillingAccountExternalIdFilter(BillingAccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillingAccountExternalIdTypeMap = (Map)record.get("BillingAccountExternalIdType");
    Boolean BillingAccountExternalIdTypeFetch = DataHelper.getFetch(BillingAccountExternalIdTypeMap);
    Boolean BillingAccountExternalIdTypeSortDir = DataHelper.getSortDirection(BillingAccountExternalIdTypeMap);
    Integer BillingAccountExternalIdTypeSortOrder = DataHelper.getSortOrder(BillingAccountExternalIdTypeMap);
    if (BillingAccountExternalIdTypeFetch != null) out.setBillingAccountExternalIdTypeFetch(BillingAccountExternalIdTypeFetch);
    if (BillingAccountExternalIdTypeSortDir != null) out.setBillingAccountExternalIdTypeSortDirection(BillingAccountExternalIdTypeSortDir);
    if (BillingAccountExternalIdTypeSortOrder != null) out.setBillingAccountExternalIdTypeSortOrder(BillingAccountExternalIdTypeSortOrder);

    Filter[] BillingAccountExternalIdTypeFilter = DataHelper.mapToFilterArray(BillingAccountExternalIdTypeMap, Integer.class);
    if (BillingAccountExternalIdTypeFilter != null) {
      IntegerFilter[] BillingAccountExternalIdTypeFilters = new IntegerFilter[BillingAccountExternalIdTypeFilter.length];
      for (int i = 0; i < BillingAccountExternalIdTypeFilters.length; i++) {
        BillingAccountExternalIdTypeFilters[i] = (IntegerFilter)BillingAccountExternalIdTypeFilter[i];
      }
      try {
        out.setBillingAccountExternalIdTypeFilter(BillingAccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
