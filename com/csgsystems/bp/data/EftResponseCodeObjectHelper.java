/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EftResponseCodeObjectHelper.java
 * Definition File: Admin/EftResponseCode.xml
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



/** Helper class to convert EftResponseCodeObject JavaBean objects to/from HashMaps.
 */
public class EftResponseCodeObjectHelper implements ArubaObjectHelper
{
  /** convert EftResponseCodeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (EftResponseCodeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EftResponseCodeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EftResponseCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (EftResponseCodeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EftResponseCodeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert EftResponseCodeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EftResponseCodeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EftResponseCodeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EftResponseCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (EftResponseCodeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EftResponseCodeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EftResponseCodeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return EftResponseCodeObjectData the converted object
   */
  public static EftResponseCodeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EftResponseCodeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EftResponseCodeObject")
   * @return EftResponseCodeObjectData the converted object
   */
  public static EftResponseCodeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EftResponseCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EftResponseCodeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return EftResponseCodeObjectFilter the converted object
   */
  public static EftResponseCodeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EftResponseCodeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EftResponseCodeObject")
   * @return EftResponseCodeObjectFilter the converted object
   */
  public static EftResponseCodeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EftResponseCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to EftResponseCodeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return EftResponseCodeObjectDataList the converted object
   */
  public static EftResponseCodeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to EftResponseCodeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "EftResponseCodeObjectList")
   * @return EftResponseCodeObjectDataList the converted object
   */
  public static EftResponseCodeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EftResponseCodeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    EftResponseCodeObjectData[] array = null;
    if (root != null)
    {
      array = new EftResponseCodeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = EftResponseCodeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new EftResponseCodeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new EftResponseCodeObjectDataList (array, index, total);
  }
  /** convert EftResponseCodeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EftResponseCodeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", EftResponseCodeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ResponseCategorySet) record.put ("ResponseCategory", in.ResponseCategory);
  
    if (in._TreatmentIndSet) record.put ("TreatmentInd", in.TreatmentInd);
  
    if (in._ReversalTransTypeSet) record.put ("ReversalTransType", in.ReversalTransType);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._EftEventTypeSet) record.put ("EftEventType", in.EftEventType);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
      return record;
  }
  /** convert EftResponseCodeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EftResponseCodeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", EftResponseCodeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ResponseCategory, in.ResponseCategorySort, in.ResponseCategorySortAscending, in.ResponseCategoryFetch);
      if (map != null) record.put ("ResponseCategory", map);
      map = DataHelper.filterToMap (in.TreatmentInd, in.TreatmentIndSort, in.TreatmentIndSortAscending, in.TreatmentIndFetch);
      if (map != null) record.put ("TreatmentInd", map);
      map = DataHelper.filterToMap (in.ReversalTransType, in.ReversalTransTypeSort, in.ReversalTransTypeSortAscending, in.ReversalTransTypeFetch);
      if (map != null) record.put ("ReversalTransType", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.EftEventType, in.EftEventTypeSort, in.EftEventTypeSortAscending, in.EftEventTypeFetch);
      if (map != null) record.put ("EftEventType", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
    return record;
  }
  /** convert Map to EftResponseCodeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EftResponseCodeObjectData the converted object
   */
  public static EftResponseCodeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EftResponseCodeObjectData out = new EftResponseCodeObjectData ();

    out.Key = EftResponseCodeObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ResponseCategory")) != null)
    {
      out.ResponseCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("TreatmentInd")) != null)
    {
      out.TreatmentInd = (Integer) obj;
    }
  
    if ((obj = record.get ("ReversalTransType")) != null)
    {
      out.ReversalTransType = (Integer) obj;
    }
  
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("EftEventType")) != null)
    {
      out.EftEventType = (Integer) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
  
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
      return out;
  }
  /** convert Map to EftResponseCodeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EftResponseCodeObjectFilter the converted object
   */
  public static EftResponseCodeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EftResponseCodeObjectFilter out = new EftResponseCodeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = EftResponseCodeObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ResponseCategoryMap = (Map)record.get("ResponseCategory");
    Boolean ResponseCategoryFetch = DataHelper.getFetch(ResponseCategoryMap);
    Boolean ResponseCategorySortDir = DataHelper.getSortDirection(ResponseCategoryMap);
    Integer ResponseCategorySortOrder = DataHelper.getSortOrder(ResponseCategoryMap);
    if (ResponseCategoryFetch != null) out.setResponseCategoryFetch(ResponseCategoryFetch);
    if (ResponseCategorySortDir != null) out.setResponseCategorySortDirection(ResponseCategorySortDir);
    if (ResponseCategorySortOrder != null) out.setResponseCategorySortOrder(ResponseCategorySortOrder);

    Filter[] ResponseCategoryFilter = DataHelper.mapToFilterArray(ResponseCategoryMap, Integer.class);
    if (ResponseCategoryFilter != null) {
      IntegerFilter[] ResponseCategoryFilters = new IntegerFilter[ResponseCategoryFilter.length];
      for (int i = 0; i < ResponseCategoryFilters.length; i++) {
        ResponseCategoryFilters[i] = (IntegerFilter)ResponseCategoryFilter[i];
      }
      try {
        out.setResponseCategoryFilter(ResponseCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TreatmentIndMap = (Map)record.get("TreatmentInd");
    Boolean TreatmentIndFetch = DataHelper.getFetch(TreatmentIndMap);
    Boolean TreatmentIndSortDir = DataHelper.getSortDirection(TreatmentIndMap);
    Integer TreatmentIndSortOrder = DataHelper.getSortOrder(TreatmentIndMap);
    if (TreatmentIndFetch != null) out.setTreatmentIndFetch(TreatmentIndFetch);
    if (TreatmentIndSortDir != null) out.setTreatmentIndSortDirection(TreatmentIndSortDir);
    if (TreatmentIndSortOrder != null) out.setTreatmentIndSortOrder(TreatmentIndSortOrder);

    Filter[] TreatmentIndFilter = DataHelper.mapToFilterArray(TreatmentIndMap, Integer.class);
    if (TreatmentIndFilter != null) {
      IntegerFilter[] TreatmentIndFilters = new IntegerFilter[TreatmentIndFilter.length];
      for (int i = 0; i < TreatmentIndFilters.length; i++) {
        TreatmentIndFilters[i] = (IntegerFilter)TreatmentIndFilter[i];
      }
      try {
        out.setTreatmentIndFilter(TreatmentIndFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ReversalTransTypeMap = (Map)record.get("ReversalTransType");
    Boolean ReversalTransTypeFetch = DataHelper.getFetch(ReversalTransTypeMap);
    Boolean ReversalTransTypeSortDir = DataHelper.getSortDirection(ReversalTransTypeMap);
    Integer ReversalTransTypeSortOrder = DataHelper.getSortOrder(ReversalTransTypeMap);
    if (ReversalTransTypeFetch != null) out.setReversalTransTypeFetch(ReversalTransTypeFetch);
    if (ReversalTransTypeSortDir != null) out.setReversalTransTypeSortDirection(ReversalTransTypeSortDir);
    if (ReversalTransTypeSortOrder != null) out.setReversalTransTypeSortOrder(ReversalTransTypeSortOrder);

    Filter[] ReversalTransTypeFilter = DataHelper.mapToFilterArray(ReversalTransTypeMap, Integer.class);
    if (ReversalTransTypeFilter != null) {
      IntegerFilter[] ReversalTransTypeFilters = new IntegerFilter[ReversalTransTypeFilter.length];
      for (int i = 0; i < ReversalTransTypeFilters.length; i++) {
        ReversalTransTypeFilters[i] = (IntegerFilter)ReversalTransTypeFilter[i];
      }
      try {
        out.setReversalTransTypeFilter(ReversalTransTypeFilters);
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
  
    Map EftEventTypeMap = (Map)record.get("EftEventType");
    Boolean EftEventTypeFetch = DataHelper.getFetch(EftEventTypeMap);
    Boolean EftEventTypeSortDir = DataHelper.getSortDirection(EftEventTypeMap);
    Integer EftEventTypeSortOrder = DataHelper.getSortOrder(EftEventTypeMap);
    if (EftEventTypeFetch != null) out.setEftEventTypeFetch(EftEventTypeFetch);
    if (EftEventTypeSortDir != null) out.setEftEventTypeSortDirection(EftEventTypeSortDir);
    if (EftEventTypeSortOrder != null) out.setEftEventTypeSortOrder(EftEventTypeSortOrder);

    Filter[] EftEventTypeFilter = DataHelper.mapToFilterArray(EftEventTypeMap, Integer.class);
    if (EftEventTypeFilter != null) {
      IntegerFilter[] EftEventTypeFilters = new IntegerFilter[EftEventTypeFilter.length];
      for (int i = 0; i < EftEventTypeFilters.length; i++) {
        EftEventTypeFilters[i] = (IntegerFilter)EftEventTypeFilter[i];
      }
      try {
        out.setEftEventTypeFilter(EftEventTypeFilters);
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
  
    return out;
  }
}
