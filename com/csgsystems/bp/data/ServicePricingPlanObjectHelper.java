/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServicePricingPlanObjectHelper.java
 * Definition File: Admin/ServicePricingPlan.xml
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



/** Helper class to convert ServicePricingPlanObject JavaBean objects to/from HashMaps.
 */
public class ServicePricingPlanObjectHelper implements ArubaObjectHelper
{
  /** convert ServicePricingPlanObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ServicePricingPlanObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServicePricingPlanObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServicePricingPlanObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServicePricingPlanObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServicePricingPlanObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ServicePricingPlanObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServicePricingPlanObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServicePricingPlanObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServicePricingPlanObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServicePricingPlanObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServicePricingPlanObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServicePricingPlanObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ServicePricingPlanObjectData the converted object
   */
  public static ServicePricingPlanObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServicePricingPlanObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServicePricingPlanObject")
   * @return ServicePricingPlanObjectData the converted object
   */
  public static ServicePricingPlanObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServicePricingPlanObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServicePricingPlanObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ServicePricingPlanObjectFilter the converted object
   */
  public static ServicePricingPlanObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServicePricingPlanObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServicePricingPlanObject")
   * @return ServicePricingPlanObjectFilter the converted object
   */
  public static ServicePricingPlanObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServicePricingPlanObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ServicePricingPlanObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ServicePricingPlanObjectDataList the converted object
   */
  public static ServicePricingPlanObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ServicePricingPlanObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ServicePricingPlanObjectList")
   * @return ServicePricingPlanObjectDataList the converted object
   */
  public static ServicePricingPlanObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServicePricingPlanObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ServicePricingPlanObjectData[] array = null;
    if (root != null)
    {
      array = new ServicePricingPlanObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ServicePricingPlanObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ServicePricingPlanObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ServicePricingPlanObjectDataList (array, index, total);
  }
  /** convert ServicePricingPlanObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServicePricingPlanObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ServicePricingPlanObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
  
    if (in._FormatDisplaySet) record.put ("FormatDisplay", in.FormatDisplay);
  
    if (in._DefaultExternalIdTypeSet) record.put ("DefaultExternalIdType", in.DefaultExternalIdType);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._IsServiceabilityApplicableSet) record.put ("IsServiceabilityApplicable", in.IsServiceabilityApplicable);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._EmfTypeSet) record.put ("EmfType", in.EmfType);
  
    if (in._EquipTypeCodeSet) record.put ("EquipTypeCode", in.EquipTypeCode);
  
    if (in._EquipClassCodeSet) record.put ("EquipClassCode", in.EquipClassCode);
  
    if (in._ClassOfServiceCodeSet) record.put ("ClassOfServiceCode", in.ClassOfServiceCode);
  
    if (in._RateClassSet) record.put ("RateClass", in.RateClass);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._EmfBookIdSet) record.put ("EmfBookId", in.EmfBookId);
  
    if (in._IndustryTypeSet) record.put ("IndustryType", in.IndustryType);
  
    if (in._UseAddressServerSet) record.put ("UseAddressServer", in.UseAddressServer);
  
    if (in._IsE911RequiredSet) record.put ("IsE911Required", in.IsE911Required);
  
    if (in._IsLidbRequiredSet) record.put ("IsLidbRequired", in.IsLidbRequired);
  
    if (in._IsPicRequiredSet) record.put ("IsPicRequired", in.IsPicRequired);
  
    if (in._IsDadlUsedSet) record.put ("IsDadlUsed", in.IsDadlUsed);
  
    if (in._IsCallingCardUsedSet) record.put ("IsCallingCardUsed", in.IsCallingCardUsed);
      return record;
  }
  /** convert ServicePricingPlanObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServicePricingPlanObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ServicePricingPlanObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
      map = DataHelper.filterToMap (in.FormatDisplay, in.FormatDisplaySort, in.FormatDisplaySortAscending, in.FormatDisplayFetch, in.FormatDisplayCaseInsensitive);
      if (map != null) record.put ("FormatDisplay", map);
      map = DataHelper.filterToMap (in.DefaultExternalIdType, in.DefaultExternalIdTypeSort, in.DefaultExternalIdTypeSortAscending, in.DefaultExternalIdTypeFetch);
      if (map != null) record.put ("DefaultExternalIdType", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.IsServiceabilityApplicable, in.IsServiceabilityApplicableSort, in.IsServiceabilityApplicableSortAscending, in.IsServiceabilityApplicableFetch);
      if (map != null) record.put ("IsServiceabilityApplicable", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.EmfType, in.EmfTypeSort, in.EmfTypeSortAscending, in.EmfTypeFetch);
      if (map != null) record.put ("EmfType", map);
      map = DataHelper.filterToMap (in.EquipTypeCode, in.EquipTypeCodeSort, in.EquipTypeCodeSortAscending, in.EquipTypeCodeFetch);
      if (map != null) record.put ("EquipTypeCode", map);
      map = DataHelper.filterToMap (in.EquipClassCode, in.EquipClassCodeSort, in.EquipClassCodeSortAscending, in.EquipClassCodeFetch);
      if (map != null) record.put ("EquipClassCode", map);
      map = DataHelper.filterToMap (in.ClassOfServiceCode, in.ClassOfServiceCodeSort, in.ClassOfServiceCodeSortAscending, in.ClassOfServiceCodeFetch);
      if (map != null) record.put ("ClassOfServiceCode", map);
      map = DataHelper.filterToMap (in.RateClass, in.RateClassSort, in.RateClassSortAscending, in.RateClassFetch);
      if (map != null) record.put ("RateClass", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.EmfBookId, in.EmfBookIdSort, in.EmfBookIdSortAscending, in.EmfBookIdFetch);
      if (map != null) record.put ("EmfBookId", map);
      map = DataHelper.filterToMap (in.IndustryType, in.IndustryTypeSort, in.IndustryTypeSortAscending, in.IndustryTypeFetch);
      if (map != null) record.put ("IndustryType", map);
      map = DataHelper.filterToMap (in.UseAddressServer, in.UseAddressServerSort, in.UseAddressServerSortAscending, in.UseAddressServerFetch);
      if (map != null) record.put ("UseAddressServer", map);
      map = DataHelper.filterToMap (in.IsE911Required, in.IsE911RequiredSort, in.IsE911RequiredSortAscending, in.IsE911RequiredFetch);
      if (map != null) record.put ("IsE911Required", map);
      map = DataHelper.filterToMap (in.IsLidbRequired, in.IsLidbRequiredSort, in.IsLidbRequiredSortAscending, in.IsLidbRequiredFetch);
      if (map != null) record.put ("IsLidbRequired", map);
      map = DataHelper.filterToMap (in.IsPicRequired, in.IsPicRequiredSort, in.IsPicRequiredSortAscending, in.IsPicRequiredFetch);
      if (map != null) record.put ("IsPicRequired", map);
      map = DataHelper.filterToMap (in.IsDadlUsed, in.IsDadlUsedSort, in.IsDadlUsedSortAscending, in.IsDadlUsedFetch);
      if (map != null) record.put ("IsDadlUsed", map);
      map = DataHelper.filterToMap (in.IsCallingCardUsed, in.IsCallingCardUsedSort, in.IsCallingCardUsedSortAscending, in.IsCallingCardUsedFetch);
      if (map != null) record.put ("IsCallingCardUsed", map);
    return record;
  }
  /** convert Map to ServicePricingPlanObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServicePricingPlanObjectData the converted object
   */
  public static ServicePricingPlanObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServicePricingPlanObjectData out = new ServicePricingPlanObjectData ();

    out.Key = ServicePricingPlanObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
  
    if ((obj = record.get ("FormatDisplay")) != null)
    {
      out.FormatDisplay = (String) obj;
    }
  
    if ((obj = record.get ("DefaultExternalIdType")) != null)
    {
      out.DefaultExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsServiceabilityApplicable")) != null)
    {
      out.IsServiceabilityApplicable = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
  
    if ((obj = record.get ("EmfType")) != null)
    {
      out.EmfType = (Integer) obj;
    }
  
    if ((obj = record.get ("EquipTypeCode")) != null)
    {
      out.EquipTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("EquipClassCode")) != null)
    {
      out.EquipClassCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ClassOfServiceCode")) != null)
    {
      out.ClassOfServiceCode = (Integer) obj;
    }
  
    if ((obj = record.get ("RateClass")) != null)
    {
      out.RateClass = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("EmfBookId")) != null)
    {
      out.EmfBookId = (Integer) obj;
    }
  
    if ((obj = record.get ("IndustryType")) != null)
    {
      out.IndustryType = (Integer) obj;
    }
  
    if ((obj = record.get ("UseAddressServer")) != null)
    {
      out.UseAddressServer = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsE911Required")) != null)
    {
      out.IsE911Required = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsLidbRequired")) != null)
    {
      out.IsLidbRequired = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsPicRequired")) != null)
    {
      out.IsPicRequired = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsDadlUsed")) != null)
    {
      out.IsDadlUsed = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsCallingCardUsed")) != null)
    {
      out.IsCallingCardUsed = (Boolean) obj;
    }
      return out;
  }
  /** convert Map to ServicePricingPlanObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServicePricingPlanObjectFilter the converted object
   */
  public static ServicePricingPlanObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServicePricingPlanObjectFilter out = new ServicePricingPlanObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ServicePricingPlanObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ShortDisplayMap = (Map)record.get("ShortDisplay");
    Boolean ShortDisplayFetch = DataHelper.getFetch(ShortDisplayMap);
    Boolean ShortDisplaySortDir = DataHelper.getSortDirection(ShortDisplayMap);
    Integer ShortDisplaySortOrder = DataHelper.getSortOrder(ShortDisplayMap);
    if (ShortDisplayFetch != null) out.setShortDisplayFetch(ShortDisplayFetch);
    if (ShortDisplaySortDir != null) out.setShortDisplaySortDirection(ShortDisplaySortDir);
    if (ShortDisplaySortOrder != null) out.setShortDisplaySortOrder(ShortDisplaySortOrder);

    Filter[] ShortDisplayFilter = DataHelper.mapToFilterArray(ShortDisplayMap, String.class);
    if (ShortDisplayFilter != null) {
      StringFilter[] ShortDisplayFilters = new StringFilter[ShortDisplayFilter.length];
      for (int i = 0; i < ShortDisplayFilters.length; i++) {
        ShortDisplayFilters[i] = (StringFilter)ShortDisplayFilter[i];
      }
      try {
        out.setShortDisplayFilter(ShortDisplayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DisplayValueMap = (Map)record.get("DisplayValue");
    Boolean DisplayValueFetch = DataHelper.getFetch(DisplayValueMap);
    Boolean DisplayValueSortDir = DataHelper.getSortDirection(DisplayValueMap);
    Integer DisplayValueSortOrder = DataHelper.getSortOrder(DisplayValueMap);
    if (DisplayValueFetch != null) out.setDisplayValueFetch(DisplayValueFetch);
    if (DisplayValueSortDir != null) out.setDisplayValueSortDirection(DisplayValueSortDir);
    if (DisplayValueSortOrder != null) out.setDisplayValueSortOrder(DisplayValueSortOrder);

    Filter[] DisplayValueFilter = DataHelper.mapToFilterArray(DisplayValueMap, String.class);
    if (DisplayValueFilter != null) {
      StringFilter[] DisplayValueFilters = new StringFilter[DisplayValueFilter.length];
      for (int i = 0; i < DisplayValueFilters.length; i++) {
        DisplayValueFilters[i] = (StringFilter)DisplayValueFilter[i];
      }
      try {
        out.setDisplayValueFilter(DisplayValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FormatDisplayMap = (Map)record.get("FormatDisplay");
    Boolean FormatDisplayFetch = DataHelper.getFetch(FormatDisplayMap);
    Boolean FormatDisplaySortDir = DataHelper.getSortDirection(FormatDisplayMap);
    Integer FormatDisplaySortOrder = DataHelper.getSortOrder(FormatDisplayMap);
    if (FormatDisplayFetch != null) out.setFormatDisplayFetch(FormatDisplayFetch);
    if (FormatDisplaySortDir != null) out.setFormatDisplaySortDirection(FormatDisplaySortDir);
    if (FormatDisplaySortOrder != null) out.setFormatDisplaySortOrder(FormatDisplaySortOrder);

    Filter[] FormatDisplayFilter = DataHelper.mapToFilterArray(FormatDisplayMap, String.class);
    if (FormatDisplayFilter != null) {
      StringFilter[] FormatDisplayFilters = new StringFilter[FormatDisplayFilter.length];
      for (int i = 0; i < FormatDisplayFilters.length; i++) {
        FormatDisplayFilters[i] = (StringFilter)FormatDisplayFilter[i];
      }
      try {
        out.setFormatDisplayFilter(FormatDisplayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DefaultExternalIdTypeMap = (Map)record.get("DefaultExternalIdType");
    Boolean DefaultExternalIdTypeFetch = DataHelper.getFetch(DefaultExternalIdTypeMap);
    Boolean DefaultExternalIdTypeSortDir = DataHelper.getSortDirection(DefaultExternalIdTypeMap);
    Integer DefaultExternalIdTypeSortOrder = DataHelper.getSortOrder(DefaultExternalIdTypeMap);
    if (DefaultExternalIdTypeFetch != null) out.setDefaultExternalIdTypeFetch(DefaultExternalIdTypeFetch);
    if (DefaultExternalIdTypeSortDir != null) out.setDefaultExternalIdTypeSortDirection(DefaultExternalIdTypeSortDir);
    if (DefaultExternalIdTypeSortOrder != null) out.setDefaultExternalIdTypeSortOrder(DefaultExternalIdTypeSortOrder);

    Filter[] DefaultExternalIdTypeFilter = DataHelper.mapToFilterArray(DefaultExternalIdTypeMap, Integer.class);
    if (DefaultExternalIdTypeFilter != null) {
      IntegerFilter[] DefaultExternalIdTypeFilters = new IntegerFilter[DefaultExternalIdTypeFilter.length];
      for (int i = 0; i < DefaultExternalIdTypeFilters.length; i++) {
        DefaultExternalIdTypeFilters[i] = (IntegerFilter)DefaultExternalIdTypeFilter[i];
      }
      try {
        out.setDefaultExternalIdTypeFilter(DefaultExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsDefaultMap = (Map)record.get("IsDefault");
    Boolean IsDefaultFetch = DataHelper.getFetch(IsDefaultMap);
    Boolean IsDefaultSortDir = DataHelper.getSortDirection(IsDefaultMap);
    Integer IsDefaultSortOrder = DataHelper.getSortOrder(IsDefaultMap);
    if (IsDefaultFetch != null) out.setIsDefaultFetch(IsDefaultFetch);
    if (IsDefaultSortDir != null) out.setIsDefaultSortDirection(IsDefaultSortDir);
    if (IsDefaultSortOrder != null) out.setIsDefaultSortOrder(IsDefaultSortOrder);

    Filter[] IsDefaultFilter = DataHelper.mapToFilterArray(IsDefaultMap, Boolean.class);
    if (IsDefaultFilter != null) {
      BooleanFilter[] IsDefaultFilters = new BooleanFilter[IsDefaultFilter.length];
      for (int i = 0; i < IsDefaultFilters.length; i++) {
        IsDefaultFilters[i] = (BooleanFilter)IsDefaultFilter[i];
      }
      try {
        out.setIsDefaultFilter(IsDefaultFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsInternalMap = (Map)record.get("IsInternal");
    Boolean IsInternalFetch = DataHelper.getFetch(IsInternalMap);
    Boolean IsInternalSortDir = DataHelper.getSortDirection(IsInternalMap);
    Integer IsInternalSortOrder = DataHelper.getSortOrder(IsInternalMap);
    if (IsInternalFetch != null) out.setIsInternalFetch(IsInternalFetch);
    if (IsInternalSortDir != null) out.setIsInternalSortDirection(IsInternalSortDir);
    if (IsInternalSortOrder != null) out.setIsInternalSortOrder(IsInternalSortOrder);

    Filter[] IsInternalFilter = DataHelper.mapToFilterArray(IsInternalMap, Boolean.class);
    if (IsInternalFilter != null) {
      BooleanFilter[] IsInternalFilters = new BooleanFilter[IsInternalFilter.length];
      for (int i = 0; i < IsInternalFilters.length; i++) {
        IsInternalFilters[i] = (BooleanFilter)IsInternalFilter[i];
      }
      try {
        out.setIsInternalFilter(IsInternalFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsServiceabilityApplicableMap = (Map)record.get("IsServiceabilityApplicable");
    Boolean IsServiceabilityApplicableFetch = DataHelper.getFetch(IsServiceabilityApplicableMap);
    Boolean IsServiceabilityApplicableSortDir = DataHelper.getSortDirection(IsServiceabilityApplicableMap);
    Integer IsServiceabilityApplicableSortOrder = DataHelper.getSortOrder(IsServiceabilityApplicableMap);
    if (IsServiceabilityApplicableFetch != null) out.setIsServiceabilityApplicableFetch(IsServiceabilityApplicableFetch);
    if (IsServiceabilityApplicableSortDir != null) out.setIsServiceabilityApplicableSortDirection(IsServiceabilityApplicableSortDir);
    if (IsServiceabilityApplicableSortOrder != null) out.setIsServiceabilityApplicableSortOrder(IsServiceabilityApplicableSortOrder);

    Filter[] IsServiceabilityApplicableFilter = DataHelper.mapToFilterArray(IsServiceabilityApplicableMap, Boolean.class);
    if (IsServiceabilityApplicableFilter != null) {
      BooleanFilter[] IsServiceabilityApplicableFilters = new BooleanFilter[IsServiceabilityApplicableFilter.length];
      for (int i = 0; i < IsServiceabilityApplicableFilters.length; i++) {
        IsServiceabilityApplicableFilters[i] = (BooleanFilter)IsServiceabilityApplicableFilter[i];
      }
      try {
        out.setIsServiceabilityApplicableFilter(IsServiceabilityApplicableFilters);
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
  
    Map EmfTypeMap = (Map)record.get("EmfType");
    Boolean EmfTypeFetch = DataHelper.getFetch(EmfTypeMap);
    Boolean EmfTypeSortDir = DataHelper.getSortDirection(EmfTypeMap);
    Integer EmfTypeSortOrder = DataHelper.getSortOrder(EmfTypeMap);
    if (EmfTypeFetch != null) out.setEmfTypeFetch(EmfTypeFetch);
    if (EmfTypeSortDir != null) out.setEmfTypeSortDirection(EmfTypeSortDir);
    if (EmfTypeSortOrder != null) out.setEmfTypeSortOrder(EmfTypeSortOrder);

    Filter[] EmfTypeFilter = DataHelper.mapToFilterArray(EmfTypeMap, Integer.class);
    if (EmfTypeFilter != null) {
      IntegerFilter[] EmfTypeFilters = new IntegerFilter[EmfTypeFilter.length];
      for (int i = 0; i < EmfTypeFilters.length; i++) {
        EmfTypeFilters[i] = (IntegerFilter)EmfTypeFilter[i];
      }
      try {
        out.setEmfTypeFilter(EmfTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EquipTypeCodeMap = (Map)record.get("EquipTypeCode");
    Boolean EquipTypeCodeFetch = DataHelper.getFetch(EquipTypeCodeMap);
    Boolean EquipTypeCodeSortDir = DataHelper.getSortDirection(EquipTypeCodeMap);
    Integer EquipTypeCodeSortOrder = DataHelper.getSortOrder(EquipTypeCodeMap);
    if (EquipTypeCodeFetch != null) out.setEquipTypeCodeFetch(EquipTypeCodeFetch);
    if (EquipTypeCodeSortDir != null) out.setEquipTypeCodeSortDirection(EquipTypeCodeSortDir);
    if (EquipTypeCodeSortOrder != null) out.setEquipTypeCodeSortOrder(EquipTypeCodeSortOrder);

    Filter[] EquipTypeCodeFilter = DataHelper.mapToFilterArray(EquipTypeCodeMap, Integer.class);
    if (EquipTypeCodeFilter != null) {
      IntegerFilter[] EquipTypeCodeFilters = new IntegerFilter[EquipTypeCodeFilter.length];
      for (int i = 0; i < EquipTypeCodeFilters.length; i++) {
        EquipTypeCodeFilters[i] = (IntegerFilter)EquipTypeCodeFilter[i];
      }
      try {
        out.setEquipTypeCodeFilter(EquipTypeCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EquipClassCodeMap = (Map)record.get("EquipClassCode");
    Boolean EquipClassCodeFetch = DataHelper.getFetch(EquipClassCodeMap);
    Boolean EquipClassCodeSortDir = DataHelper.getSortDirection(EquipClassCodeMap);
    Integer EquipClassCodeSortOrder = DataHelper.getSortOrder(EquipClassCodeMap);
    if (EquipClassCodeFetch != null) out.setEquipClassCodeFetch(EquipClassCodeFetch);
    if (EquipClassCodeSortDir != null) out.setEquipClassCodeSortDirection(EquipClassCodeSortDir);
    if (EquipClassCodeSortOrder != null) out.setEquipClassCodeSortOrder(EquipClassCodeSortOrder);

    Filter[] EquipClassCodeFilter = DataHelper.mapToFilterArray(EquipClassCodeMap, Integer.class);
    if (EquipClassCodeFilter != null) {
      IntegerFilter[] EquipClassCodeFilters = new IntegerFilter[EquipClassCodeFilter.length];
      for (int i = 0; i < EquipClassCodeFilters.length; i++) {
        EquipClassCodeFilters[i] = (IntegerFilter)EquipClassCodeFilter[i];
      }
      try {
        out.setEquipClassCodeFilter(EquipClassCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ClassOfServiceCodeMap = (Map)record.get("ClassOfServiceCode");
    Boolean ClassOfServiceCodeFetch = DataHelper.getFetch(ClassOfServiceCodeMap);
    Boolean ClassOfServiceCodeSortDir = DataHelper.getSortDirection(ClassOfServiceCodeMap);
    Integer ClassOfServiceCodeSortOrder = DataHelper.getSortOrder(ClassOfServiceCodeMap);
    if (ClassOfServiceCodeFetch != null) out.setClassOfServiceCodeFetch(ClassOfServiceCodeFetch);
    if (ClassOfServiceCodeSortDir != null) out.setClassOfServiceCodeSortDirection(ClassOfServiceCodeSortDir);
    if (ClassOfServiceCodeSortOrder != null) out.setClassOfServiceCodeSortOrder(ClassOfServiceCodeSortOrder);

    Filter[] ClassOfServiceCodeFilter = DataHelper.mapToFilterArray(ClassOfServiceCodeMap, Integer.class);
    if (ClassOfServiceCodeFilter != null) {
      IntegerFilter[] ClassOfServiceCodeFilters = new IntegerFilter[ClassOfServiceCodeFilter.length];
      for (int i = 0; i < ClassOfServiceCodeFilters.length; i++) {
        ClassOfServiceCodeFilters[i] = (IntegerFilter)ClassOfServiceCodeFilter[i];
      }
      try {
        out.setClassOfServiceCodeFilter(ClassOfServiceCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateClassMap = (Map)record.get("RateClass");
    Boolean RateClassFetch = DataHelper.getFetch(RateClassMap);
    Boolean RateClassSortDir = DataHelper.getSortDirection(RateClassMap);
    Integer RateClassSortOrder = DataHelper.getSortOrder(RateClassMap);
    if (RateClassFetch != null) out.setRateClassFetch(RateClassFetch);
    if (RateClassSortDir != null) out.setRateClassSortDirection(RateClassSortDir);
    if (RateClassSortOrder != null) out.setRateClassSortOrder(RateClassSortOrder);

    Filter[] RateClassFilter = DataHelper.mapToFilterArray(RateClassMap, Integer.class);
    if (RateClassFilter != null) {
      IntegerFilter[] RateClassFilters = new IntegerFilter[RateClassFilter.length];
      for (int i = 0; i < RateClassFilters.length; i++) {
        RateClassFilters[i] = (IntegerFilter)RateClassFilter[i];
      }
      try {
        out.setRateClassFilter(RateClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDtMap = (Map)record.get("ActiveDt");
    Boolean ActiveDtFetch = DataHelper.getFetch(ActiveDtMap);
    Boolean ActiveDtSortDir = DataHelper.getSortDirection(ActiveDtMap);
    Integer ActiveDtSortOrder = DataHelper.getSortOrder(ActiveDtMap);
    if (ActiveDtFetch != null) out.setActiveDtFetch(ActiveDtFetch);
    if (ActiveDtSortDir != null) out.setActiveDtSortDirection(ActiveDtSortDir);
    if (ActiveDtSortOrder != null) out.setActiveDtSortOrder(ActiveDtSortOrder);

    Filter[] ActiveDtFilter = DataHelper.mapToFilterArray(ActiveDtMap, Date.class);
    if (ActiveDtFilter != null) {
      DateFilter[] ActiveDtFilters = new DateFilter[ActiveDtFilter.length];
      for (int i = 0; i < ActiveDtFilters.length; i++) {
        ActiveDtFilters[i] = (DateFilter)ActiveDtFilter[i];
      }
      try {
        out.setActiveDtFilter(ActiveDtFilters);
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
  
    Map EmfBookIdMap = (Map)record.get("EmfBookId");
    Boolean EmfBookIdFetch = DataHelper.getFetch(EmfBookIdMap);
    Boolean EmfBookIdSortDir = DataHelper.getSortDirection(EmfBookIdMap);
    Integer EmfBookIdSortOrder = DataHelper.getSortOrder(EmfBookIdMap);
    if (EmfBookIdFetch != null) out.setEmfBookIdFetch(EmfBookIdFetch);
    if (EmfBookIdSortDir != null) out.setEmfBookIdSortDirection(EmfBookIdSortDir);
    if (EmfBookIdSortOrder != null) out.setEmfBookIdSortOrder(EmfBookIdSortOrder);

    Filter[] EmfBookIdFilter = DataHelper.mapToFilterArray(EmfBookIdMap, Integer.class);
    if (EmfBookIdFilter != null) {
      IntegerFilter[] EmfBookIdFilters = new IntegerFilter[EmfBookIdFilter.length];
      for (int i = 0; i < EmfBookIdFilters.length; i++) {
        EmfBookIdFilters[i] = (IntegerFilter)EmfBookIdFilter[i];
      }
      try {
        out.setEmfBookIdFilter(EmfBookIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IndustryTypeMap = (Map)record.get("IndustryType");
    Boolean IndustryTypeFetch = DataHelper.getFetch(IndustryTypeMap);
    Boolean IndustryTypeSortDir = DataHelper.getSortDirection(IndustryTypeMap);
    Integer IndustryTypeSortOrder = DataHelper.getSortOrder(IndustryTypeMap);
    if (IndustryTypeFetch != null) out.setIndustryTypeFetch(IndustryTypeFetch);
    if (IndustryTypeSortDir != null) out.setIndustryTypeSortDirection(IndustryTypeSortDir);
    if (IndustryTypeSortOrder != null) out.setIndustryTypeSortOrder(IndustryTypeSortOrder);

    Filter[] IndustryTypeFilter = DataHelper.mapToFilterArray(IndustryTypeMap, Integer.class);
    if (IndustryTypeFilter != null) {
      IntegerFilter[] IndustryTypeFilters = new IntegerFilter[IndustryTypeFilter.length];
      for (int i = 0; i < IndustryTypeFilters.length; i++) {
        IndustryTypeFilters[i] = (IntegerFilter)IndustryTypeFilter[i];
      }
      try {
        out.setIndustryTypeFilter(IndustryTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UseAddressServerMap = (Map)record.get("UseAddressServer");
    Boolean UseAddressServerFetch = DataHelper.getFetch(UseAddressServerMap);
    Boolean UseAddressServerSortDir = DataHelper.getSortDirection(UseAddressServerMap);
    Integer UseAddressServerSortOrder = DataHelper.getSortOrder(UseAddressServerMap);
    if (UseAddressServerFetch != null) out.setUseAddressServerFetch(UseAddressServerFetch);
    if (UseAddressServerSortDir != null) out.setUseAddressServerSortDirection(UseAddressServerSortDir);
    if (UseAddressServerSortOrder != null) out.setUseAddressServerSortOrder(UseAddressServerSortOrder);

    Filter[] UseAddressServerFilter = DataHelper.mapToFilterArray(UseAddressServerMap, Boolean.class);
    if (UseAddressServerFilter != null) {
      BooleanFilter[] UseAddressServerFilters = new BooleanFilter[UseAddressServerFilter.length];
      for (int i = 0; i < UseAddressServerFilters.length; i++) {
        UseAddressServerFilters[i] = (BooleanFilter)UseAddressServerFilter[i];
      }
      try {
        out.setUseAddressServerFilter(UseAddressServerFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsE911RequiredMap = (Map)record.get("IsE911Required");
    Boolean IsE911RequiredFetch = DataHelper.getFetch(IsE911RequiredMap);
    Boolean IsE911RequiredSortDir = DataHelper.getSortDirection(IsE911RequiredMap);
    Integer IsE911RequiredSortOrder = DataHelper.getSortOrder(IsE911RequiredMap);
    if (IsE911RequiredFetch != null) out.setIsE911RequiredFetch(IsE911RequiredFetch);
    if (IsE911RequiredSortDir != null) out.setIsE911RequiredSortDirection(IsE911RequiredSortDir);
    if (IsE911RequiredSortOrder != null) out.setIsE911RequiredSortOrder(IsE911RequiredSortOrder);

    Filter[] IsE911RequiredFilter = DataHelper.mapToFilterArray(IsE911RequiredMap, Boolean.class);
    if (IsE911RequiredFilter != null) {
      BooleanFilter[] IsE911RequiredFilters = new BooleanFilter[IsE911RequiredFilter.length];
      for (int i = 0; i < IsE911RequiredFilters.length; i++) {
        IsE911RequiredFilters[i] = (BooleanFilter)IsE911RequiredFilter[i];
      }
      try {
        out.setIsE911RequiredFilter(IsE911RequiredFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsLidbRequiredMap = (Map)record.get("IsLidbRequired");
    Boolean IsLidbRequiredFetch = DataHelper.getFetch(IsLidbRequiredMap);
    Boolean IsLidbRequiredSortDir = DataHelper.getSortDirection(IsLidbRequiredMap);
    Integer IsLidbRequiredSortOrder = DataHelper.getSortOrder(IsLidbRequiredMap);
    if (IsLidbRequiredFetch != null) out.setIsLidbRequiredFetch(IsLidbRequiredFetch);
    if (IsLidbRequiredSortDir != null) out.setIsLidbRequiredSortDirection(IsLidbRequiredSortDir);
    if (IsLidbRequiredSortOrder != null) out.setIsLidbRequiredSortOrder(IsLidbRequiredSortOrder);

    Filter[] IsLidbRequiredFilter = DataHelper.mapToFilterArray(IsLidbRequiredMap, Boolean.class);
    if (IsLidbRequiredFilter != null) {
      BooleanFilter[] IsLidbRequiredFilters = new BooleanFilter[IsLidbRequiredFilter.length];
      for (int i = 0; i < IsLidbRequiredFilters.length; i++) {
        IsLidbRequiredFilters[i] = (BooleanFilter)IsLidbRequiredFilter[i];
      }
      try {
        out.setIsLidbRequiredFilter(IsLidbRequiredFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsPicRequiredMap = (Map)record.get("IsPicRequired");
    Boolean IsPicRequiredFetch = DataHelper.getFetch(IsPicRequiredMap);
    Boolean IsPicRequiredSortDir = DataHelper.getSortDirection(IsPicRequiredMap);
    Integer IsPicRequiredSortOrder = DataHelper.getSortOrder(IsPicRequiredMap);
    if (IsPicRequiredFetch != null) out.setIsPicRequiredFetch(IsPicRequiredFetch);
    if (IsPicRequiredSortDir != null) out.setIsPicRequiredSortDirection(IsPicRequiredSortDir);
    if (IsPicRequiredSortOrder != null) out.setIsPicRequiredSortOrder(IsPicRequiredSortOrder);

    Filter[] IsPicRequiredFilter = DataHelper.mapToFilterArray(IsPicRequiredMap, Boolean.class);
    if (IsPicRequiredFilter != null) {
      BooleanFilter[] IsPicRequiredFilters = new BooleanFilter[IsPicRequiredFilter.length];
      for (int i = 0; i < IsPicRequiredFilters.length; i++) {
        IsPicRequiredFilters[i] = (BooleanFilter)IsPicRequiredFilter[i];
      }
      try {
        out.setIsPicRequiredFilter(IsPicRequiredFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsDadlUsedMap = (Map)record.get("IsDadlUsed");
    Boolean IsDadlUsedFetch = DataHelper.getFetch(IsDadlUsedMap);
    Boolean IsDadlUsedSortDir = DataHelper.getSortDirection(IsDadlUsedMap);
    Integer IsDadlUsedSortOrder = DataHelper.getSortOrder(IsDadlUsedMap);
    if (IsDadlUsedFetch != null) out.setIsDadlUsedFetch(IsDadlUsedFetch);
    if (IsDadlUsedSortDir != null) out.setIsDadlUsedSortDirection(IsDadlUsedSortDir);
    if (IsDadlUsedSortOrder != null) out.setIsDadlUsedSortOrder(IsDadlUsedSortOrder);

    Filter[] IsDadlUsedFilter = DataHelper.mapToFilterArray(IsDadlUsedMap, Boolean.class);
    if (IsDadlUsedFilter != null) {
      BooleanFilter[] IsDadlUsedFilters = new BooleanFilter[IsDadlUsedFilter.length];
      for (int i = 0; i < IsDadlUsedFilters.length; i++) {
        IsDadlUsedFilters[i] = (BooleanFilter)IsDadlUsedFilter[i];
      }
      try {
        out.setIsDadlUsedFilter(IsDadlUsedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsCallingCardUsedMap = (Map)record.get("IsCallingCardUsed");
    Boolean IsCallingCardUsedFetch = DataHelper.getFetch(IsCallingCardUsedMap);
    Boolean IsCallingCardUsedSortDir = DataHelper.getSortDirection(IsCallingCardUsedMap);
    Integer IsCallingCardUsedSortOrder = DataHelper.getSortOrder(IsCallingCardUsedMap);
    if (IsCallingCardUsedFetch != null) out.setIsCallingCardUsedFetch(IsCallingCardUsedFetch);
    if (IsCallingCardUsedSortDir != null) out.setIsCallingCardUsedSortDirection(IsCallingCardUsedSortDir);
    if (IsCallingCardUsedSortOrder != null) out.setIsCallingCardUsedSortOrder(IsCallingCardUsedSortOrder);

    Filter[] IsCallingCardUsedFilter = DataHelper.mapToFilterArray(IsCallingCardUsedMap, Boolean.class);
    if (IsCallingCardUsedFilter != null) {
      BooleanFilter[] IsCallingCardUsedFilters = new BooleanFilter[IsCallingCardUsedFilter.length];
      for (int i = 0; i < IsCallingCardUsedFilters.length; i++) {
        IsCallingCardUsedFilters[i] = (BooleanFilter)IsCallingCardUsedFilter[i];
      }
      try {
        out.setIsCallingCardUsedFilter(IsCallingCardUsedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
