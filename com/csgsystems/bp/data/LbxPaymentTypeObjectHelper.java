/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LbxPaymentTypeObjectHelper.java
 * Definition File: Admin/LbxPaymentType.xml
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



/** Helper class to convert LbxPaymentTypeObject JavaBean objects to/from HashMaps.
 */
public class LbxPaymentTypeObjectHelper implements ArubaObjectHelper
{
  /** convert LbxPaymentTypeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (LbxPaymentTypeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert LbxPaymentTypeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "LbxPaymentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (LbxPaymentTypeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "LbxPaymentTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert LbxPaymentTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (LbxPaymentTypeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert LbxPaymentTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "LbxPaymentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (LbxPaymentTypeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "LbxPaymentTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to LbxPaymentTypeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return LbxPaymentTypeObjectData the converted object
   */
  public static LbxPaymentTypeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to LbxPaymentTypeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "LbxPaymentTypeObject")
   * @return LbxPaymentTypeObjectData the converted object
   */
  public static LbxPaymentTypeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "LbxPaymentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to LbxPaymentTypeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return LbxPaymentTypeObjectFilter the converted object
   */
  public static LbxPaymentTypeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to LbxPaymentTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "LbxPaymentTypeObject")
   * @return LbxPaymentTypeObjectFilter the converted object
   */
  public static LbxPaymentTypeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "LbxPaymentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to LbxPaymentTypeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return LbxPaymentTypeObjectDataList the converted object
   */
  public static LbxPaymentTypeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to LbxPaymentTypeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "LbxPaymentTypeObjectList")
   * @return LbxPaymentTypeObjectDataList the converted object
   */
  public static LbxPaymentTypeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "LbxPaymentTypeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    LbxPaymentTypeObjectData[] array = null;
    if (root != null)
    {
      array = new LbxPaymentTypeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = LbxPaymentTypeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new LbxPaymentTypeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new LbxPaymentTypeObjectDataList (array, index, total);
  }
  /** convert LbxPaymentTypeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (LbxPaymentTypeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", LbxPaymentTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BmfTransTypeSet) record.put ("BmfTransType", in.BmfTransType);
  
    if (in._LbxSourceTypeSet) record.put ("LbxSourceType", in.LbxSourceType);
  
    if (in._LbxCycleTypeSet) record.put ("LbxCycleType", in.LbxCycleType);
  
    if (in._CycleExpectedSet) record.put ("CycleExpected", in.CycleExpected);
  
    if (in._PathNameSet) record.put ("PathName", in.PathName);
  
    if (in._NamingPatternSet) record.put ("NamingPattern", in.NamingPattern);
  
    if (in._NamingExtensionSet) record.put ("NamingExtension", in.NamingExtension);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert LbxPaymentTypeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (LbxPaymentTypeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", LbxPaymentTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BmfTransType, in.BmfTransTypeSort, in.BmfTransTypeSortAscending, in.BmfTransTypeFetch);
      if (map != null) record.put ("BmfTransType", map);
      map = DataHelper.filterToMap (in.LbxSourceType, in.LbxSourceTypeSort, in.LbxSourceTypeSortAscending, in.LbxSourceTypeFetch);
      if (map != null) record.put ("LbxSourceType", map);
      map = DataHelper.filterToMap (in.LbxCycleType, in.LbxCycleTypeSort, in.LbxCycleTypeSortAscending, in.LbxCycleTypeFetch);
      if (map != null) record.put ("LbxCycleType", map);
      map = DataHelper.filterToMap (in.CycleExpected, in.CycleExpectedSort, in.CycleExpectedSortAscending, in.CycleExpectedFetch, in.CycleExpectedCaseInsensitive);
      if (map != null) record.put ("CycleExpected", map);
      map = DataHelper.filterToMap (in.PathName, in.PathNameSort, in.PathNameSortAscending, in.PathNameFetch, in.PathNameCaseInsensitive);
      if (map != null) record.put ("PathName", map);
      map = DataHelper.filterToMap (in.NamingPattern, in.NamingPatternSort, in.NamingPatternSortAscending, in.NamingPatternFetch, in.NamingPatternCaseInsensitive);
      if (map != null) record.put ("NamingPattern", map);
      map = DataHelper.filterToMap (in.NamingExtension, in.NamingExtensionSort, in.NamingExtensionSortAscending, in.NamingExtensionFetch, in.NamingExtensionCaseInsensitive);
      if (map != null) record.put ("NamingExtension", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
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
  /** convert Map to LbxPaymentTypeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return LbxPaymentTypeObjectData the converted object
   */
  public static LbxPaymentTypeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    LbxPaymentTypeObjectData out = new LbxPaymentTypeObjectData ();

    out.Key = LbxPaymentTypeObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BmfTransType")) != null)
    {
      out.BmfTransType = (Integer) obj;
    }
  
    if ((obj = record.get ("LbxSourceType")) != null)
    {
      out.LbxSourceType = (Integer) obj;
    }
  
    if ((obj = record.get ("LbxCycleType")) != null)
    {
      out.LbxCycleType = (Integer) obj;
    }
  
    if ((obj = record.get ("CycleExpected")) != null)
    {
      out.CycleExpected = (String) obj;
    }
  
    if ((obj = record.get ("PathName")) != null)
    {
      out.PathName = (String) obj;
    }
  
    if ((obj = record.get ("NamingPattern")) != null)
    {
      out.NamingPattern = (String) obj;
    }
  
    if ((obj = record.get ("NamingExtension")) != null)
    {
      out.NamingExtension = (String) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
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
  /** convert Map to LbxPaymentTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return LbxPaymentTypeObjectFilter the converted object
   */
  public static LbxPaymentTypeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    LbxPaymentTypeObjectFilter out = new LbxPaymentTypeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = LbxPaymentTypeObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map BmfTransTypeMap = (Map)record.get("BmfTransType");
    Boolean BmfTransTypeFetch = DataHelper.getFetch(BmfTransTypeMap);
    Boolean BmfTransTypeSortDir = DataHelper.getSortDirection(BmfTransTypeMap);
    Integer BmfTransTypeSortOrder = DataHelper.getSortOrder(BmfTransTypeMap);
    if (BmfTransTypeFetch != null) out.setBmfTransTypeFetch(BmfTransTypeFetch);
    if (BmfTransTypeSortDir != null) out.setBmfTransTypeSortDirection(BmfTransTypeSortDir);
    if (BmfTransTypeSortOrder != null) out.setBmfTransTypeSortOrder(BmfTransTypeSortOrder);

    Filter[] BmfTransTypeFilter = DataHelper.mapToFilterArray(BmfTransTypeMap, Integer.class);
    if (BmfTransTypeFilter != null) {
      IntegerFilter[] BmfTransTypeFilters = new IntegerFilter[BmfTransTypeFilter.length];
      for (int i = 0; i < BmfTransTypeFilters.length; i++) {
        BmfTransTypeFilters[i] = (IntegerFilter)BmfTransTypeFilter[i];
      }
      try {
        out.setBmfTransTypeFilter(BmfTransTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LbxSourceTypeMap = (Map)record.get("LbxSourceType");
    Boolean LbxSourceTypeFetch = DataHelper.getFetch(LbxSourceTypeMap);
    Boolean LbxSourceTypeSortDir = DataHelper.getSortDirection(LbxSourceTypeMap);
    Integer LbxSourceTypeSortOrder = DataHelper.getSortOrder(LbxSourceTypeMap);
    if (LbxSourceTypeFetch != null) out.setLbxSourceTypeFetch(LbxSourceTypeFetch);
    if (LbxSourceTypeSortDir != null) out.setLbxSourceTypeSortDirection(LbxSourceTypeSortDir);
    if (LbxSourceTypeSortOrder != null) out.setLbxSourceTypeSortOrder(LbxSourceTypeSortOrder);

    Filter[] LbxSourceTypeFilter = DataHelper.mapToFilterArray(LbxSourceTypeMap, Integer.class);
    if (LbxSourceTypeFilter != null) {
      IntegerFilter[] LbxSourceTypeFilters = new IntegerFilter[LbxSourceTypeFilter.length];
      for (int i = 0; i < LbxSourceTypeFilters.length; i++) {
        LbxSourceTypeFilters[i] = (IntegerFilter)LbxSourceTypeFilter[i];
      }
      try {
        out.setLbxSourceTypeFilter(LbxSourceTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LbxCycleTypeMap = (Map)record.get("LbxCycleType");
    Boolean LbxCycleTypeFetch = DataHelper.getFetch(LbxCycleTypeMap);
    Boolean LbxCycleTypeSortDir = DataHelper.getSortDirection(LbxCycleTypeMap);
    Integer LbxCycleTypeSortOrder = DataHelper.getSortOrder(LbxCycleTypeMap);
    if (LbxCycleTypeFetch != null) out.setLbxCycleTypeFetch(LbxCycleTypeFetch);
    if (LbxCycleTypeSortDir != null) out.setLbxCycleTypeSortDirection(LbxCycleTypeSortDir);
    if (LbxCycleTypeSortOrder != null) out.setLbxCycleTypeSortOrder(LbxCycleTypeSortOrder);

    Filter[] LbxCycleTypeFilter = DataHelper.mapToFilterArray(LbxCycleTypeMap, Integer.class);
    if (LbxCycleTypeFilter != null) {
      IntegerFilter[] LbxCycleTypeFilters = new IntegerFilter[LbxCycleTypeFilter.length];
      for (int i = 0; i < LbxCycleTypeFilters.length; i++) {
        LbxCycleTypeFilters[i] = (IntegerFilter)LbxCycleTypeFilter[i];
      }
      try {
        out.setLbxCycleTypeFilter(LbxCycleTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CycleExpectedMap = (Map)record.get("CycleExpected");
    Boolean CycleExpectedFetch = DataHelper.getFetch(CycleExpectedMap);
    Boolean CycleExpectedSortDir = DataHelper.getSortDirection(CycleExpectedMap);
    Integer CycleExpectedSortOrder = DataHelper.getSortOrder(CycleExpectedMap);
    if (CycleExpectedFetch != null) out.setCycleExpectedFetch(CycleExpectedFetch);
    if (CycleExpectedSortDir != null) out.setCycleExpectedSortDirection(CycleExpectedSortDir);
    if (CycleExpectedSortOrder != null) out.setCycleExpectedSortOrder(CycleExpectedSortOrder);

    Filter[] CycleExpectedFilter = DataHelper.mapToFilterArray(CycleExpectedMap, String.class);
    if (CycleExpectedFilter != null) {
      StringFilter[] CycleExpectedFilters = new StringFilter[CycleExpectedFilter.length];
      for (int i = 0; i < CycleExpectedFilters.length; i++) {
        CycleExpectedFilters[i] = (StringFilter)CycleExpectedFilter[i];
      }
      try {
        out.setCycleExpectedFilter(CycleExpectedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PathNameMap = (Map)record.get("PathName");
    Boolean PathNameFetch = DataHelper.getFetch(PathNameMap);
    Boolean PathNameSortDir = DataHelper.getSortDirection(PathNameMap);
    Integer PathNameSortOrder = DataHelper.getSortOrder(PathNameMap);
    if (PathNameFetch != null) out.setPathNameFetch(PathNameFetch);
    if (PathNameSortDir != null) out.setPathNameSortDirection(PathNameSortDir);
    if (PathNameSortOrder != null) out.setPathNameSortOrder(PathNameSortOrder);

    Filter[] PathNameFilter = DataHelper.mapToFilterArray(PathNameMap, String.class);
    if (PathNameFilter != null) {
      StringFilter[] PathNameFilters = new StringFilter[PathNameFilter.length];
      for (int i = 0; i < PathNameFilters.length; i++) {
        PathNameFilters[i] = (StringFilter)PathNameFilter[i];
      }
      try {
        out.setPathNameFilter(PathNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NamingPatternMap = (Map)record.get("NamingPattern");
    Boolean NamingPatternFetch = DataHelper.getFetch(NamingPatternMap);
    Boolean NamingPatternSortDir = DataHelper.getSortDirection(NamingPatternMap);
    Integer NamingPatternSortOrder = DataHelper.getSortOrder(NamingPatternMap);
    if (NamingPatternFetch != null) out.setNamingPatternFetch(NamingPatternFetch);
    if (NamingPatternSortDir != null) out.setNamingPatternSortDirection(NamingPatternSortDir);
    if (NamingPatternSortOrder != null) out.setNamingPatternSortOrder(NamingPatternSortOrder);

    Filter[] NamingPatternFilter = DataHelper.mapToFilterArray(NamingPatternMap, String.class);
    if (NamingPatternFilter != null) {
      StringFilter[] NamingPatternFilters = new StringFilter[NamingPatternFilter.length];
      for (int i = 0; i < NamingPatternFilters.length; i++) {
        NamingPatternFilters[i] = (StringFilter)NamingPatternFilter[i];
      }
      try {
        out.setNamingPatternFilter(NamingPatternFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NamingExtensionMap = (Map)record.get("NamingExtension");
    Boolean NamingExtensionFetch = DataHelper.getFetch(NamingExtensionMap);
    Boolean NamingExtensionSortDir = DataHelper.getSortDirection(NamingExtensionMap);
    Integer NamingExtensionSortOrder = DataHelper.getSortOrder(NamingExtensionMap);
    if (NamingExtensionFetch != null) out.setNamingExtensionFetch(NamingExtensionFetch);
    if (NamingExtensionSortDir != null) out.setNamingExtensionSortDirection(NamingExtensionSortDir);
    if (NamingExtensionSortOrder != null) out.setNamingExtensionSortOrder(NamingExtensionSortOrder);

    Filter[] NamingExtensionFilter = DataHelper.mapToFilterArray(NamingExtensionMap, String.class);
    if (NamingExtensionFilter != null) {
      StringFilter[] NamingExtensionFilters = new StringFilter[NamingExtensionFilter.length];
      for (int i = 0; i < NamingExtensionFilters.length; i++) {
        NamingExtensionFilters[i] = (StringFilter)NamingExtensionFilter[i];
      }
      try {
        out.setNamingExtensionFilter(NamingExtensionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, Integer.class);
    if (CurrencyCodeFilter != null) {
      IntegerFilter[] CurrencyCodeFilters = new IntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (IntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
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
