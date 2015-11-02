/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BonusPointTransTypeObjectHelper.java
 * Definition File: Admin/BonusPointTransType.xml
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



/** Helper class to convert BonusPointTransTypeObject JavaBean objects to/from HashMaps.
 */
public class BonusPointTransTypeObjectHelper implements ArubaObjectHelper
{
  /** convert BonusPointTransTypeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BonusPointTransTypeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BonusPointTransTypeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BonusPointTransTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointTransTypeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BonusPointTransTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BonusPointTransTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointTransTypeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BonusPointTransTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BonusPointTransTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointTransTypeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BonusPointTransTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BonusPointTransTypeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BonusPointTransTypeObjectData the converted object
   */
  public static BonusPointTransTypeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BonusPointTransTypeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BonusPointTransTypeObject")
   * @return BonusPointTransTypeObjectData the converted object
   */
  public static BonusPointTransTypeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointTransTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BonusPointTransTypeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BonusPointTransTypeObjectFilter the converted object
   */
  public static BonusPointTransTypeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BonusPointTransTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BonusPointTransTypeObject")
   * @return BonusPointTransTypeObjectFilter the converted object
   */
  public static BonusPointTransTypeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointTransTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BonusPointTransTypeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BonusPointTransTypeObjectDataList the converted object
   */
  public static BonusPointTransTypeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BonusPointTransTypeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BonusPointTransTypeObjectList")
   * @return BonusPointTransTypeObjectDataList the converted object
   */
  public static BonusPointTransTypeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointTransTypeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BonusPointTransTypeObjectData[] array = null;
    if (root != null)
    {
      array = new BonusPointTransTypeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BonusPointTransTypeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BonusPointTransTypeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BonusPointTransTypeObjectDataList (array, index, total);
  }
  /** convert BonusPointTransTypeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BonusPointTransTypeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", BonusPointTransTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BonusPointTransCategorySet) record.put ("BonusPointTransCategory", in.BonusPointTransCategory);
  
    if (in._TransSignSet) record.put ("TransSign", in.TransSign);
  
    if (in._IsDisplayedOnbillSet) record.put ("IsDisplayedOnbill", in.IsDisplayedOnbill);
  
    if (in._IsViewableOnGuiSet) record.put ("IsViewableOnGui", in.IsViewableOnGui);
  
    if (in._IsExternalSet) record.put ("IsExternal", in.IsExternal);
  
    if (in._IsSystemGeneratedSet) record.put ("IsSystemGenerated", in.IsSystemGenerated);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert BonusPointTransTypeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BonusPointTransTypeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", BonusPointTransTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BonusPointTransCategory, in.BonusPointTransCategorySort, in.BonusPointTransCategorySortAscending, in.BonusPointTransCategoryFetch);
      if (map != null) record.put ("BonusPointTransCategory", map);
      map = DataHelper.filterToMap (in.TransSign, in.TransSignSort, in.TransSignSortAscending, in.TransSignFetch);
      if (map != null) record.put ("TransSign", map);
      map = DataHelper.filterToMap (in.IsDisplayedOnbill, in.IsDisplayedOnbillSort, in.IsDisplayedOnbillSortAscending, in.IsDisplayedOnbillFetch);
      if (map != null) record.put ("IsDisplayedOnbill", map);
      map = DataHelper.filterToMap (in.IsViewableOnGui, in.IsViewableOnGuiSort, in.IsViewableOnGuiSortAscending, in.IsViewableOnGuiFetch);
      if (map != null) record.put ("IsViewableOnGui", map);
      map = DataHelper.filterToMap (in.IsExternal, in.IsExternalSort, in.IsExternalSortAscending, in.IsExternalFetch);
      if (map != null) record.put ("IsExternal", map);
      map = DataHelper.filterToMap (in.IsSystemGenerated, in.IsSystemGeneratedSort, in.IsSystemGeneratedSortAscending, in.IsSystemGeneratedFetch);
      if (map != null) record.put ("IsSystemGenerated", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
    return record;
  }
  /** convert Map to BonusPointTransTypeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BonusPointTransTypeObjectData the converted object
   */
  public static BonusPointTransTypeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BonusPointTransTypeObjectData out = new BonusPointTransTypeObjectData ();

    out.Key = BonusPointTransTypeObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BonusPointTransCategory")) != null)
    {
      out.BonusPointTransCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("TransSign")) != null)
    {
      out.TransSign = (Integer) obj;
    }
  
    if ((obj = record.get ("IsDisplayedOnbill")) != null)
    {
      out.IsDisplayedOnbill = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsViewableOnGui")) != null)
    {
      out.IsViewableOnGui = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsExternal")) != null)
    {
      out.IsExternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsSystemGenerated")) != null)
    {
      out.IsSystemGenerated = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
  
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
      return out;
  }
  /** convert Map to BonusPointTransTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BonusPointTransTypeObjectFilter the converted object
   */
  public static BonusPointTransTypeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BonusPointTransTypeObjectFilter out = new BonusPointTransTypeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = BonusPointTransTypeObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map BonusPointTransCategoryMap = (Map)record.get("BonusPointTransCategory");
    Boolean BonusPointTransCategoryFetch = DataHelper.getFetch(BonusPointTransCategoryMap);
    Boolean BonusPointTransCategorySortDir = DataHelper.getSortDirection(BonusPointTransCategoryMap);
    Integer BonusPointTransCategorySortOrder = DataHelper.getSortOrder(BonusPointTransCategoryMap);
    if (BonusPointTransCategoryFetch != null) out.setBonusPointTransCategoryFetch(BonusPointTransCategoryFetch);
    if (BonusPointTransCategorySortDir != null) out.setBonusPointTransCategorySortDirection(BonusPointTransCategorySortDir);
    if (BonusPointTransCategorySortOrder != null) out.setBonusPointTransCategorySortOrder(BonusPointTransCategorySortOrder);

    Filter[] BonusPointTransCategoryFilter = DataHelper.mapToFilterArray(BonusPointTransCategoryMap, Integer.class);
    if (BonusPointTransCategoryFilter != null) {
      IntegerFilter[] BonusPointTransCategoryFilters = new IntegerFilter[BonusPointTransCategoryFilter.length];
      for (int i = 0; i < BonusPointTransCategoryFilters.length; i++) {
        BonusPointTransCategoryFilters[i] = (IntegerFilter)BonusPointTransCategoryFilter[i];
      }
      try {
        out.setBonusPointTransCategoryFilter(BonusPointTransCategoryFilters);
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
  
    Map IsViewableOnGuiMap = (Map)record.get("IsViewableOnGui");
    Boolean IsViewableOnGuiFetch = DataHelper.getFetch(IsViewableOnGuiMap);
    Boolean IsViewableOnGuiSortDir = DataHelper.getSortDirection(IsViewableOnGuiMap);
    Integer IsViewableOnGuiSortOrder = DataHelper.getSortOrder(IsViewableOnGuiMap);
    if (IsViewableOnGuiFetch != null) out.setIsViewableOnGuiFetch(IsViewableOnGuiFetch);
    if (IsViewableOnGuiSortDir != null) out.setIsViewableOnGuiSortDirection(IsViewableOnGuiSortDir);
    if (IsViewableOnGuiSortOrder != null) out.setIsViewableOnGuiSortOrder(IsViewableOnGuiSortOrder);

    Filter[] IsViewableOnGuiFilter = DataHelper.mapToFilterArray(IsViewableOnGuiMap, Boolean.class);
    if (IsViewableOnGuiFilter != null) {
      BooleanFilter[] IsViewableOnGuiFilters = new BooleanFilter[IsViewableOnGuiFilter.length];
      for (int i = 0; i < IsViewableOnGuiFilters.length; i++) {
        IsViewableOnGuiFilters[i] = (BooleanFilter)IsViewableOnGuiFilter[i];
      }
      try {
        out.setIsViewableOnGuiFilter(IsViewableOnGuiFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsExternalMap = (Map)record.get("IsExternal");
    Boolean IsExternalFetch = DataHelper.getFetch(IsExternalMap);
    Boolean IsExternalSortDir = DataHelper.getSortDirection(IsExternalMap);
    Integer IsExternalSortOrder = DataHelper.getSortOrder(IsExternalMap);
    if (IsExternalFetch != null) out.setIsExternalFetch(IsExternalFetch);
    if (IsExternalSortDir != null) out.setIsExternalSortDirection(IsExternalSortDir);
    if (IsExternalSortOrder != null) out.setIsExternalSortOrder(IsExternalSortOrder);

    Filter[] IsExternalFilter = DataHelper.mapToFilterArray(IsExternalMap, Boolean.class);
    if (IsExternalFilter != null) {
      BooleanFilter[] IsExternalFilters = new BooleanFilter[IsExternalFilter.length];
      for (int i = 0; i < IsExternalFilters.length; i++) {
        IsExternalFilters[i] = (BooleanFilter)IsExternalFilter[i];
      }
      try {
        out.setIsExternalFilter(IsExternalFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsSystemGeneratedMap = (Map)record.get("IsSystemGenerated");
    Boolean IsSystemGeneratedFetch = DataHelper.getFetch(IsSystemGeneratedMap);
    Boolean IsSystemGeneratedSortDir = DataHelper.getSortDirection(IsSystemGeneratedMap);
    Integer IsSystemGeneratedSortOrder = DataHelper.getSortOrder(IsSystemGeneratedMap);
    if (IsSystemGeneratedFetch != null) out.setIsSystemGeneratedFetch(IsSystemGeneratedFetch);
    if (IsSystemGeneratedSortDir != null) out.setIsSystemGeneratedSortDirection(IsSystemGeneratedSortDir);
    if (IsSystemGeneratedSortOrder != null) out.setIsSystemGeneratedSortOrder(IsSystemGeneratedSortOrder);

    Filter[] IsSystemGeneratedFilter = DataHelper.mapToFilterArray(IsSystemGeneratedMap, Boolean.class);
    if (IsSystemGeneratedFilter != null) {
      BooleanFilter[] IsSystemGeneratedFilters = new BooleanFilter[IsSystemGeneratedFilter.length];
      for (int i = 0; i < IsSystemGeneratedFilters.length; i++) {
        IsSystemGeneratedFilters[i] = (BooleanFilter)IsSystemGeneratedFilter[i];
      }
      try {
        out.setIsSystemGeneratedFilter(IsSystemGeneratedFilters);
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
  
    return out;
  }
}
