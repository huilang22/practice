/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PCDObjectHelper.java
 * Definition File: Admin/PackageComponentDef.xml
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



/** Helper class to convert PCDObject JavaBean objects to/from HashMaps.
 */
public class PCDObjectHelper implements ArubaObjectHelper
{
  /** convert PCDObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PCDObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PCDObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PCDObject")
   * @return Map     the output Map
   */
  public static Map toMap (PCDObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PCDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PCDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PCDObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PCDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PCDObject")
   * @return Map     the output Map
   */
  public static Map toMap (PCDObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PCDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PCDObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PCDObjectData the converted object
   */
  public static PCDObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PCDObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PCDObject")
   * @return PCDObjectData the converted object
   */
  public static PCDObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PCDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PCDObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PCDObjectFilter the converted object
   */
  public static PCDObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PCDObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PCDObject")
   * @return PCDObjectFilter the converted object
   */
  public static PCDObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PCDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PCDObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PCDObjectDataList the converted object
   */
  public static PCDObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PCDObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PCDObjectList")
   * @return PCDObjectDataList the converted object
   */
  public static PCDObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PCDObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PCDObjectData[] array = null;
    if (root != null)
    {
      array = new PCDObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PCDObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PCDObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PCDObjectDataList (array, index, total);
  }
  /** convert PCDObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PCDObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PCDObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._MinimumRequiredSet) record.put ("MinimumRequired", in.MinimumRequired);
  
    if (in._MaximumAllowedSet) record.put ("MaximumAllowed", in.MaximumAllowed);
  
    if (in._PackageInactiveDtSet) record.put ("PackageInactiveDt", in.PackageInactiveDt);
  
    if (in._ComponentLevelSet) record.put ("ComponentLevel", in.ComponentLevel);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._IsServiceabilityApplicableSet) record.put ("IsServiceabilityApplicable", in.IsServiceabilityApplicable);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert PCDObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PCDObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PCDObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.MinimumRequired, in.MinimumRequiredSort, in.MinimumRequiredSortAscending, in.MinimumRequiredFetch);
      if (map != null) record.put ("MinimumRequired", map);
      map = DataHelper.filterToMap (in.MaximumAllowed, in.MaximumAllowedSort, in.MaximumAllowedSortAscending, in.MaximumAllowedFetch);
      if (map != null) record.put ("MaximumAllowed", map);
      map = DataHelper.filterToMap (in.PackageInactiveDt, in.PackageInactiveDtSort, in.PackageInactiveDtSortAscending, in.PackageInactiveDtFetch);
      if (map != null) record.put ("PackageInactiveDt", map);
      map = DataHelper.filterToMap (in.ComponentLevel, in.ComponentLevelSort, in.ComponentLevelSortAscending, in.ComponentLevelFetch);
      if (map != null) record.put ("ComponentLevel", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.IsServiceabilityApplicable, in.IsServiceabilityApplicableSort, in.IsServiceabilityApplicableSortAscending, in.IsServiceabilityApplicableFetch);
      if (map != null) record.put ("IsServiceabilityApplicable", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
    return record;
  }
  /** convert Map to PCDObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PCDObjectData the converted object
   */
  public static PCDObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PCDObjectData out = new PCDObjectData ();

    out.Key = PCDObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("MinimumRequired")) != null)
    {
      out.MinimumRequired = (Integer) obj;
    }
  
    if ((obj = record.get ("MaximumAllowed")) != null)
    {
      out.MaximumAllowed = (Integer) obj;
    }
  
    if ((obj = record.get ("PackageInactiveDt")) != null)
    {
      out.PackageInactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("ComponentLevel")) != null)
    {
      out.ComponentLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
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
  /** convert Map to PCDObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PCDObjectFilter the converted object
   */
  public static PCDObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PCDObjectFilter out = new PCDObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PCDObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map MinimumRequiredMap = (Map)record.get("MinimumRequired");
    Boolean MinimumRequiredFetch = DataHelper.getFetch(MinimumRequiredMap);
    Boolean MinimumRequiredSortDir = DataHelper.getSortDirection(MinimumRequiredMap);
    Integer MinimumRequiredSortOrder = DataHelper.getSortOrder(MinimumRequiredMap);
    if (MinimumRequiredFetch != null) out.setMinimumRequiredFetch(MinimumRequiredFetch);
    if (MinimumRequiredSortDir != null) out.setMinimumRequiredSortDirection(MinimumRequiredSortDir);
    if (MinimumRequiredSortOrder != null) out.setMinimumRequiredSortOrder(MinimumRequiredSortOrder);

    Filter[] MinimumRequiredFilter = DataHelper.mapToFilterArray(MinimumRequiredMap, Integer.class);
    if (MinimumRequiredFilter != null) {
      IntegerFilter[] MinimumRequiredFilters = new IntegerFilter[MinimumRequiredFilter.length];
      for (int i = 0; i < MinimumRequiredFilters.length; i++) {
        MinimumRequiredFilters[i] = (IntegerFilter)MinimumRequiredFilter[i];
      }
      try {
        out.setMinimumRequiredFilter(MinimumRequiredFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MaximumAllowedMap = (Map)record.get("MaximumAllowed");
    Boolean MaximumAllowedFetch = DataHelper.getFetch(MaximumAllowedMap);
    Boolean MaximumAllowedSortDir = DataHelper.getSortDirection(MaximumAllowedMap);
    Integer MaximumAllowedSortOrder = DataHelper.getSortOrder(MaximumAllowedMap);
    if (MaximumAllowedFetch != null) out.setMaximumAllowedFetch(MaximumAllowedFetch);
    if (MaximumAllowedSortDir != null) out.setMaximumAllowedSortDirection(MaximumAllowedSortDir);
    if (MaximumAllowedSortOrder != null) out.setMaximumAllowedSortOrder(MaximumAllowedSortOrder);

    Filter[] MaximumAllowedFilter = DataHelper.mapToFilterArray(MaximumAllowedMap, Integer.class);
    if (MaximumAllowedFilter != null) {
      IntegerFilter[] MaximumAllowedFilters = new IntegerFilter[MaximumAllowedFilter.length];
      for (int i = 0; i < MaximumAllowedFilters.length; i++) {
        MaximumAllowedFilters[i] = (IntegerFilter)MaximumAllowedFilter[i];
      }
      try {
        out.setMaximumAllowedFilter(MaximumAllowedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PackageInactiveDtMap = (Map)record.get("PackageInactiveDt");
    Boolean PackageInactiveDtFetch = DataHelper.getFetch(PackageInactiveDtMap);
    Boolean PackageInactiveDtSortDir = DataHelper.getSortDirection(PackageInactiveDtMap);
    Integer PackageInactiveDtSortOrder = DataHelper.getSortOrder(PackageInactiveDtMap);
    if (PackageInactiveDtFetch != null) out.setPackageInactiveDtFetch(PackageInactiveDtFetch);
    if (PackageInactiveDtSortDir != null) out.setPackageInactiveDtSortDirection(PackageInactiveDtSortDir);
    if (PackageInactiveDtSortOrder != null) out.setPackageInactiveDtSortOrder(PackageInactiveDtSortOrder);

    Filter[] PackageInactiveDtFilter = DataHelper.mapToFilterArray(PackageInactiveDtMap, Date.class);
    if (PackageInactiveDtFilter != null) {
      DateFilter[] PackageInactiveDtFilters = new DateFilter[PackageInactiveDtFilter.length];
      for (int i = 0; i < PackageInactiveDtFilters.length; i++) {
        PackageInactiveDtFilters[i] = (DateFilter)PackageInactiveDtFilter[i];
      }
      try {
        out.setPackageInactiveDtFilter(PackageInactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ComponentLevelMap = (Map)record.get("ComponentLevel");
    Boolean ComponentLevelFetch = DataHelper.getFetch(ComponentLevelMap);
    Boolean ComponentLevelSortDir = DataHelper.getSortDirection(ComponentLevelMap);
    Integer ComponentLevelSortOrder = DataHelper.getSortOrder(ComponentLevelMap);
    if (ComponentLevelFetch != null) out.setComponentLevelFetch(ComponentLevelFetch);
    if (ComponentLevelSortDir != null) out.setComponentLevelSortDirection(ComponentLevelSortDir);
    if (ComponentLevelSortOrder != null) out.setComponentLevelSortOrder(ComponentLevelSortOrder);

    Filter[] ComponentLevelFilter = DataHelper.mapToFilterArray(ComponentLevelMap, Integer.class);
    if (ComponentLevelFilter != null) {
      IntegerFilter[] ComponentLevelFilters = new IntegerFilter[ComponentLevelFilter.length];
      for (int i = 0; i < ComponentLevelFilters.length; i++) {
        ComponentLevelFilters[i] = (IntegerFilter)ComponentLevelFilter[i];
      }
      try {
        out.setComponentLevelFilter(ComponentLevelFilters);
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
