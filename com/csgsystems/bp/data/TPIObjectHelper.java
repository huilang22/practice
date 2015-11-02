/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TPIObjectHelper.java
 * Definition File: Admin/TaxPackageInst.xml
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



/** Helper class to convert TPIObject JavaBean objects to/from HashMaps.
 */
public class TPIObjectHelper implements ArubaObjectHelper
{
  /** convert TPIObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (TPIObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TPIObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TPIObject")
   * @return Map     the output Map
   */
  public static Map toMap (TPIObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TPIObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert TPIObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TPIObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TPIObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TPIObject")
   * @return Map     the output Map
   */
  public static Map toMap (TPIObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TPIObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TPIObjectData.
   * @param record the Map containing the data to convert to the object
   * @return TPIObjectData the converted object
   */
  public static TPIObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TPIObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TPIObject")
   * @return TPIObjectData the converted object
   */
  public static TPIObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TPIObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TPIObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return TPIObjectFilter the converted object
   */
  public static TPIObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TPIObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TPIObject")
   * @return TPIObjectFilter the converted object
   */
  public static TPIObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TPIObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to TPIObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return TPIObjectDataList the converted object
   */
  public static TPIObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to TPIObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "TPIObjectList")
   * @return TPIObjectDataList the converted object
   */
  public static TPIObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TPIObjectList";
    Object[] root = (Object[]) record.get (rootName);
    TPIObjectData[] array = null;
    if (root != null)
    {
      array = new TPIObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = TPIObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new TPIObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new TPIObjectDataList (array, index, total);
  }
  /** convert TPIObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TPIObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", TPIObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._TaxPkgTypeSet) record.put ("TaxPkgType", in.TaxPkgType);
  
    if (in._PkgOrderSet) record.put ("PkgOrder", in.PkgOrder);
  
    if (in._BasicDaysSet) record.put ("BasicDays", in.BasicDays);
  
    if (in._IsBinnedSet) record.put ("IsBinned", in.IsBinned);
  
    if (in._IsDistributedSet) record.put ("IsDistributed", in.IsDistributed);
  
    if (in._IsFranchiseSet) record.put ("IsFranchise", in.IsFranchise);
  
    if (in._IsGuiPretaxSet) record.put ("IsGuiPretax", in.IsGuiPretax);
  
    if (in._ExcludeChargeSet) record.put ("ExcludeCharge", in.ExcludeCharge);
  
    if (in._RoundingMethodSet) record.put ("RoundingMethod", in.RoundingMethod);
  
    if (in._TaxTypeSet) record.put ("TaxType", in.TaxType);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._IsGraduatedSet) record.put ("IsGraduated", in.IsGraduated);
  
    if (in._TaxZeroChargeSet) record.put ("TaxZeroCharge", in.TaxZeroCharge);
  
    if (in._RoundingFactorSet) record.put ("RoundingFactor", in.RoundingFactor);
  
    if (in._BinRoundingSet) record.put ("BinRounding", in.BinRounding);
  
    if (in._IsLateFeeExemptSet) record.put ("IsLateFeeExempt", in.IsLateFeeExempt);
  
    if (in._IsInclusiveSet) record.put ("IsInclusive", in.IsInclusive);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert TPIObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TPIObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", TPIObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.TaxPkgType, in.TaxPkgTypeSort, in.TaxPkgTypeSortAscending, in.TaxPkgTypeFetch);
      if (map != null) record.put ("TaxPkgType", map);
      map = DataHelper.filterToMap (in.PkgOrder, in.PkgOrderSort, in.PkgOrderSortAscending, in.PkgOrderFetch);
      if (map != null) record.put ("PkgOrder", map);
      map = DataHelper.filterToMap (in.BasicDays, in.BasicDaysSort, in.BasicDaysSortAscending, in.BasicDaysFetch);
      if (map != null) record.put ("BasicDays", map);
      map = DataHelper.filterToMap (in.IsBinned, in.IsBinnedSort, in.IsBinnedSortAscending, in.IsBinnedFetch);
      if (map != null) record.put ("IsBinned", map);
      map = DataHelper.filterToMap (in.IsDistributed, in.IsDistributedSort, in.IsDistributedSortAscending, in.IsDistributedFetch);
      if (map != null) record.put ("IsDistributed", map);
      map = DataHelper.filterToMap (in.IsFranchise, in.IsFranchiseSort, in.IsFranchiseSortAscending, in.IsFranchiseFetch);
      if (map != null) record.put ("IsFranchise", map);
      map = DataHelper.filterToMap (in.IsGuiPretax, in.IsGuiPretaxSort, in.IsGuiPretaxSortAscending, in.IsGuiPretaxFetch);
      if (map != null) record.put ("IsGuiPretax", map);
      map = DataHelper.filterToMap (in.ExcludeCharge, in.ExcludeChargeSort, in.ExcludeChargeSortAscending, in.ExcludeChargeFetch);
      if (map != null) record.put ("ExcludeCharge", map);
      map = DataHelper.filterToMap (in.RoundingMethod, in.RoundingMethodSort, in.RoundingMethodSortAscending, in.RoundingMethodFetch);
      if (map != null) record.put ("RoundingMethod", map);
      map = DataHelper.filterToMap (in.TaxType, in.TaxTypeSort, in.TaxTypeSortAscending, in.TaxTypeFetch);
      if (map != null) record.put ("TaxType", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.IsGraduated, in.IsGraduatedSort, in.IsGraduatedSortAscending, in.IsGraduatedFetch);
      if (map != null) record.put ("IsGraduated", map);
      map = DataHelper.filterToMap (in.TaxZeroCharge, in.TaxZeroChargeSort, in.TaxZeroChargeSortAscending, in.TaxZeroChargeFetch);
      if (map != null) record.put ("TaxZeroCharge", map);
      map = DataHelper.filterToMap (in.RoundingFactor, in.RoundingFactorSort, in.RoundingFactorSortAscending, in.RoundingFactorFetch);
      if (map != null) record.put ("RoundingFactor", map);
      map = DataHelper.filterToMap (in.BinRounding, in.BinRoundingSort, in.BinRoundingSortAscending, in.BinRoundingFetch);
      if (map != null) record.put ("BinRounding", map);
      map = DataHelper.filterToMap (in.IsLateFeeExempt, in.IsLateFeeExemptSort, in.IsLateFeeExemptSortAscending, in.IsLateFeeExemptFetch);
      if (map != null) record.put ("IsLateFeeExempt", map);
      map = DataHelper.filterToMap (in.IsInclusive, in.IsInclusiveSort, in.IsInclusiveSortAscending, in.IsInclusiveFetch);
      if (map != null) record.put ("IsInclusive", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
    return record;
  }
  /** convert Map to TPIObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TPIObjectData the converted object
   */
  public static TPIObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TPIObjectData out = new TPIObjectData ();

    out.Key = TPIObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("TaxPkgType")) != null)
    {
      out.TaxPkgType = (Integer) obj;
    }
  
    if ((obj = record.get ("PkgOrder")) != null)
    {
      out.PkgOrder = (Integer) obj;
    }
  
    if ((obj = record.get ("BasicDays")) != null)
    {
      out.BasicDays = (Integer) obj;
    }
  
    if ((obj = record.get ("IsBinned")) != null)
    {
      out.IsBinned = (Integer) obj;
    }
  
    if ((obj = record.get ("IsDistributed")) != null)
    {
      out.IsDistributed = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsFranchise")) != null)
    {
      out.IsFranchise = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsGuiPretax")) != null)
    {
      out.IsGuiPretax = (Boolean) obj;
    }
  
    if ((obj = record.get ("ExcludeCharge")) != null)
    {
      out.ExcludeCharge = (Boolean) obj;
    }
  
    if ((obj = record.get ("RoundingMethod")) != null)
    {
      out.RoundingMethod = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxType")) != null)
    {
      out.TaxType = (Integer) obj;
    }
  
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsGraduated")) != null)
    {
      out.IsGraduated = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxZeroCharge")) != null)
    {
      out.TaxZeroCharge = (Integer) obj;
    }
  
    if ((obj = record.get ("RoundingFactor")) != null)
    {
      out.RoundingFactor = (Integer) obj;
    }
  
    if ((obj = record.get ("BinRounding")) != null)
    {
      out.BinRounding = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsLateFeeExempt")) != null)
    {
      out.IsLateFeeExempt = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInclusive")) != null)
    {
      out.IsInclusive = (Integer) obj;
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
  /** convert Map to TPIObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TPIObjectFilter the converted object
   */
  public static TPIObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TPIObjectFilter out = new TPIObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = TPIObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map TaxPkgTypeMap = (Map)record.get("TaxPkgType");
    Boolean TaxPkgTypeFetch = DataHelper.getFetch(TaxPkgTypeMap);
    Boolean TaxPkgTypeSortDir = DataHelper.getSortDirection(TaxPkgTypeMap);
    Integer TaxPkgTypeSortOrder = DataHelper.getSortOrder(TaxPkgTypeMap);
    if (TaxPkgTypeFetch != null) out.setTaxPkgTypeFetch(TaxPkgTypeFetch);
    if (TaxPkgTypeSortDir != null) out.setTaxPkgTypeSortDirection(TaxPkgTypeSortDir);
    if (TaxPkgTypeSortOrder != null) out.setTaxPkgTypeSortOrder(TaxPkgTypeSortOrder);

    Filter[] TaxPkgTypeFilter = DataHelper.mapToFilterArray(TaxPkgTypeMap, Integer.class);
    if (TaxPkgTypeFilter != null) {
      IntegerFilter[] TaxPkgTypeFilters = new IntegerFilter[TaxPkgTypeFilter.length];
      for (int i = 0; i < TaxPkgTypeFilters.length; i++) {
        TaxPkgTypeFilters[i] = (IntegerFilter)TaxPkgTypeFilter[i];
      }
      try {
        out.setTaxPkgTypeFilter(TaxPkgTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PkgOrderMap = (Map)record.get("PkgOrder");
    Boolean PkgOrderFetch = DataHelper.getFetch(PkgOrderMap);
    Boolean PkgOrderSortDir = DataHelper.getSortDirection(PkgOrderMap);
    Integer PkgOrderSortOrder = DataHelper.getSortOrder(PkgOrderMap);
    if (PkgOrderFetch != null) out.setPkgOrderFetch(PkgOrderFetch);
    if (PkgOrderSortDir != null) out.setPkgOrderSortDirection(PkgOrderSortDir);
    if (PkgOrderSortOrder != null) out.setPkgOrderSortOrder(PkgOrderSortOrder);

    Filter[] PkgOrderFilter = DataHelper.mapToFilterArray(PkgOrderMap, Integer.class);
    if (PkgOrderFilter != null) {
      IntegerFilter[] PkgOrderFilters = new IntegerFilter[PkgOrderFilter.length];
      for (int i = 0; i < PkgOrderFilters.length; i++) {
        PkgOrderFilters[i] = (IntegerFilter)PkgOrderFilter[i];
      }
      try {
        out.setPkgOrderFilter(PkgOrderFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BasicDaysMap = (Map)record.get("BasicDays");
    Boolean BasicDaysFetch = DataHelper.getFetch(BasicDaysMap);
    Boolean BasicDaysSortDir = DataHelper.getSortDirection(BasicDaysMap);
    Integer BasicDaysSortOrder = DataHelper.getSortOrder(BasicDaysMap);
    if (BasicDaysFetch != null) out.setBasicDaysFetch(BasicDaysFetch);
    if (BasicDaysSortDir != null) out.setBasicDaysSortDirection(BasicDaysSortDir);
    if (BasicDaysSortOrder != null) out.setBasicDaysSortOrder(BasicDaysSortOrder);

    Filter[] BasicDaysFilter = DataHelper.mapToFilterArray(BasicDaysMap, Integer.class);
    if (BasicDaysFilter != null) {
      IntegerFilter[] BasicDaysFilters = new IntegerFilter[BasicDaysFilter.length];
      for (int i = 0; i < BasicDaysFilters.length; i++) {
        BasicDaysFilters[i] = (IntegerFilter)BasicDaysFilter[i];
      }
      try {
        out.setBasicDaysFilter(BasicDaysFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsBinnedMap = (Map)record.get("IsBinned");
    Boolean IsBinnedFetch = DataHelper.getFetch(IsBinnedMap);
    Boolean IsBinnedSortDir = DataHelper.getSortDirection(IsBinnedMap);
    Integer IsBinnedSortOrder = DataHelper.getSortOrder(IsBinnedMap);
    if (IsBinnedFetch != null) out.setIsBinnedFetch(IsBinnedFetch);
    if (IsBinnedSortDir != null) out.setIsBinnedSortDirection(IsBinnedSortDir);
    if (IsBinnedSortOrder != null) out.setIsBinnedSortOrder(IsBinnedSortOrder);

    Filter[] IsBinnedFilter = DataHelper.mapToFilterArray(IsBinnedMap, Integer.class);
    if (IsBinnedFilter != null) {
      IntegerFilter[] IsBinnedFilters = new IntegerFilter[IsBinnedFilter.length];
      for (int i = 0; i < IsBinnedFilters.length; i++) {
        IsBinnedFilters[i] = (IntegerFilter)IsBinnedFilter[i];
      }
      try {
        out.setIsBinnedFilter(IsBinnedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsDistributedMap = (Map)record.get("IsDistributed");
    Boolean IsDistributedFetch = DataHelper.getFetch(IsDistributedMap);
    Boolean IsDistributedSortDir = DataHelper.getSortDirection(IsDistributedMap);
    Integer IsDistributedSortOrder = DataHelper.getSortOrder(IsDistributedMap);
    if (IsDistributedFetch != null) out.setIsDistributedFetch(IsDistributedFetch);
    if (IsDistributedSortDir != null) out.setIsDistributedSortDirection(IsDistributedSortDir);
    if (IsDistributedSortOrder != null) out.setIsDistributedSortOrder(IsDistributedSortOrder);

    Filter[] IsDistributedFilter = DataHelper.mapToFilterArray(IsDistributedMap, Boolean.class);
    if (IsDistributedFilter != null) {
      BooleanFilter[] IsDistributedFilters = new BooleanFilter[IsDistributedFilter.length];
      for (int i = 0; i < IsDistributedFilters.length; i++) {
        IsDistributedFilters[i] = (BooleanFilter)IsDistributedFilter[i];
      }
      try {
        out.setIsDistributedFilter(IsDistributedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsFranchiseMap = (Map)record.get("IsFranchise");
    Boolean IsFranchiseFetch = DataHelper.getFetch(IsFranchiseMap);
    Boolean IsFranchiseSortDir = DataHelper.getSortDirection(IsFranchiseMap);
    Integer IsFranchiseSortOrder = DataHelper.getSortOrder(IsFranchiseMap);
    if (IsFranchiseFetch != null) out.setIsFranchiseFetch(IsFranchiseFetch);
    if (IsFranchiseSortDir != null) out.setIsFranchiseSortDirection(IsFranchiseSortDir);
    if (IsFranchiseSortOrder != null) out.setIsFranchiseSortOrder(IsFranchiseSortOrder);

    Filter[] IsFranchiseFilter = DataHelper.mapToFilterArray(IsFranchiseMap, Boolean.class);
    if (IsFranchiseFilter != null) {
      BooleanFilter[] IsFranchiseFilters = new BooleanFilter[IsFranchiseFilter.length];
      for (int i = 0; i < IsFranchiseFilters.length; i++) {
        IsFranchiseFilters[i] = (BooleanFilter)IsFranchiseFilter[i];
      }
      try {
        out.setIsFranchiseFilter(IsFranchiseFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsGuiPretaxMap = (Map)record.get("IsGuiPretax");
    Boolean IsGuiPretaxFetch = DataHelper.getFetch(IsGuiPretaxMap);
    Boolean IsGuiPretaxSortDir = DataHelper.getSortDirection(IsGuiPretaxMap);
    Integer IsGuiPretaxSortOrder = DataHelper.getSortOrder(IsGuiPretaxMap);
    if (IsGuiPretaxFetch != null) out.setIsGuiPretaxFetch(IsGuiPretaxFetch);
    if (IsGuiPretaxSortDir != null) out.setIsGuiPretaxSortDirection(IsGuiPretaxSortDir);
    if (IsGuiPretaxSortOrder != null) out.setIsGuiPretaxSortOrder(IsGuiPretaxSortOrder);

    Filter[] IsGuiPretaxFilter = DataHelper.mapToFilterArray(IsGuiPretaxMap, Boolean.class);
    if (IsGuiPretaxFilter != null) {
      BooleanFilter[] IsGuiPretaxFilters = new BooleanFilter[IsGuiPretaxFilter.length];
      for (int i = 0; i < IsGuiPretaxFilters.length; i++) {
        IsGuiPretaxFilters[i] = (BooleanFilter)IsGuiPretaxFilter[i];
      }
      try {
        out.setIsGuiPretaxFilter(IsGuiPretaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExcludeChargeMap = (Map)record.get("ExcludeCharge");
    Boolean ExcludeChargeFetch = DataHelper.getFetch(ExcludeChargeMap);
    Boolean ExcludeChargeSortDir = DataHelper.getSortDirection(ExcludeChargeMap);
    Integer ExcludeChargeSortOrder = DataHelper.getSortOrder(ExcludeChargeMap);
    if (ExcludeChargeFetch != null) out.setExcludeChargeFetch(ExcludeChargeFetch);
    if (ExcludeChargeSortDir != null) out.setExcludeChargeSortDirection(ExcludeChargeSortDir);
    if (ExcludeChargeSortOrder != null) out.setExcludeChargeSortOrder(ExcludeChargeSortOrder);

    Filter[] ExcludeChargeFilter = DataHelper.mapToFilterArray(ExcludeChargeMap, Boolean.class);
    if (ExcludeChargeFilter != null) {
      BooleanFilter[] ExcludeChargeFilters = new BooleanFilter[ExcludeChargeFilter.length];
      for (int i = 0; i < ExcludeChargeFilters.length; i++) {
        ExcludeChargeFilters[i] = (BooleanFilter)ExcludeChargeFilter[i];
      }
      try {
        out.setExcludeChargeFilter(ExcludeChargeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RoundingMethodMap = (Map)record.get("RoundingMethod");
    Boolean RoundingMethodFetch = DataHelper.getFetch(RoundingMethodMap);
    Boolean RoundingMethodSortDir = DataHelper.getSortDirection(RoundingMethodMap);
    Integer RoundingMethodSortOrder = DataHelper.getSortOrder(RoundingMethodMap);
    if (RoundingMethodFetch != null) out.setRoundingMethodFetch(RoundingMethodFetch);
    if (RoundingMethodSortDir != null) out.setRoundingMethodSortDirection(RoundingMethodSortDir);
    if (RoundingMethodSortOrder != null) out.setRoundingMethodSortOrder(RoundingMethodSortOrder);

    Filter[] RoundingMethodFilter = DataHelper.mapToFilterArray(RoundingMethodMap, Integer.class);
    if (RoundingMethodFilter != null) {
      IntegerFilter[] RoundingMethodFilters = new IntegerFilter[RoundingMethodFilter.length];
      for (int i = 0; i < RoundingMethodFilters.length; i++) {
        RoundingMethodFilters[i] = (IntegerFilter)RoundingMethodFilter[i];
      }
      try {
        out.setRoundingMethodFilter(RoundingMethodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxTypeMap = (Map)record.get("TaxType");
    Boolean TaxTypeFetch = DataHelper.getFetch(TaxTypeMap);
    Boolean TaxTypeSortDir = DataHelper.getSortDirection(TaxTypeMap);
    Integer TaxTypeSortOrder = DataHelper.getSortOrder(TaxTypeMap);
    if (TaxTypeFetch != null) out.setTaxTypeFetch(TaxTypeFetch);
    if (TaxTypeSortDir != null) out.setTaxTypeSortDirection(TaxTypeSortDir);
    if (TaxTypeSortOrder != null) out.setTaxTypeSortOrder(TaxTypeSortOrder);

    Filter[] TaxTypeFilter = DataHelper.mapToFilterArray(TaxTypeMap, Integer.class);
    if (TaxTypeFilter != null) {
      IntegerFilter[] TaxTypeFilters = new IntegerFilter[TaxTypeFilter.length];
      for (int i = 0; i < TaxTypeFilters.length; i++) {
        TaxTypeFilters[i] = (IntegerFilter)TaxTypeFilter[i];
      }
      try {
        out.setTaxTypeFilter(TaxTypeFilters);
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
  
    Map IsGraduatedMap = (Map)record.get("IsGraduated");
    Boolean IsGraduatedFetch = DataHelper.getFetch(IsGraduatedMap);
    Boolean IsGraduatedSortDir = DataHelper.getSortDirection(IsGraduatedMap);
    Integer IsGraduatedSortOrder = DataHelper.getSortOrder(IsGraduatedMap);
    if (IsGraduatedFetch != null) out.setIsGraduatedFetch(IsGraduatedFetch);
    if (IsGraduatedSortDir != null) out.setIsGraduatedSortDirection(IsGraduatedSortDir);
    if (IsGraduatedSortOrder != null) out.setIsGraduatedSortOrder(IsGraduatedSortOrder);

    Filter[] IsGraduatedFilter = DataHelper.mapToFilterArray(IsGraduatedMap, Integer.class);
    if (IsGraduatedFilter != null) {
      IntegerFilter[] IsGraduatedFilters = new IntegerFilter[IsGraduatedFilter.length];
      for (int i = 0; i < IsGraduatedFilters.length; i++) {
        IsGraduatedFilters[i] = (IntegerFilter)IsGraduatedFilter[i];
      }
      try {
        out.setIsGraduatedFilter(IsGraduatedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxZeroChargeMap = (Map)record.get("TaxZeroCharge");
    Boolean TaxZeroChargeFetch = DataHelper.getFetch(TaxZeroChargeMap);
    Boolean TaxZeroChargeSortDir = DataHelper.getSortDirection(TaxZeroChargeMap);
    Integer TaxZeroChargeSortOrder = DataHelper.getSortOrder(TaxZeroChargeMap);
    if (TaxZeroChargeFetch != null) out.setTaxZeroChargeFetch(TaxZeroChargeFetch);
    if (TaxZeroChargeSortDir != null) out.setTaxZeroChargeSortDirection(TaxZeroChargeSortDir);
    if (TaxZeroChargeSortOrder != null) out.setTaxZeroChargeSortOrder(TaxZeroChargeSortOrder);

    Filter[] TaxZeroChargeFilter = DataHelper.mapToFilterArray(TaxZeroChargeMap, Integer.class);
    if (TaxZeroChargeFilter != null) {
      IntegerFilter[] TaxZeroChargeFilters = new IntegerFilter[TaxZeroChargeFilter.length];
      for (int i = 0; i < TaxZeroChargeFilters.length; i++) {
        TaxZeroChargeFilters[i] = (IntegerFilter)TaxZeroChargeFilter[i];
      }
      try {
        out.setTaxZeroChargeFilter(TaxZeroChargeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RoundingFactorMap = (Map)record.get("RoundingFactor");
    Boolean RoundingFactorFetch = DataHelper.getFetch(RoundingFactorMap);
    Boolean RoundingFactorSortDir = DataHelper.getSortDirection(RoundingFactorMap);
    Integer RoundingFactorSortOrder = DataHelper.getSortOrder(RoundingFactorMap);
    if (RoundingFactorFetch != null) out.setRoundingFactorFetch(RoundingFactorFetch);
    if (RoundingFactorSortDir != null) out.setRoundingFactorSortDirection(RoundingFactorSortDir);
    if (RoundingFactorSortOrder != null) out.setRoundingFactorSortOrder(RoundingFactorSortOrder);

    Filter[] RoundingFactorFilter = DataHelper.mapToFilterArray(RoundingFactorMap, Integer.class);
    if (RoundingFactorFilter != null) {
      IntegerFilter[] RoundingFactorFilters = new IntegerFilter[RoundingFactorFilter.length];
      for (int i = 0; i < RoundingFactorFilters.length; i++) {
        RoundingFactorFilters[i] = (IntegerFilter)RoundingFactorFilter[i];
      }
      try {
        out.setRoundingFactorFilter(RoundingFactorFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BinRoundingMap = (Map)record.get("BinRounding");
    Boolean BinRoundingFetch = DataHelper.getFetch(BinRoundingMap);
    Boolean BinRoundingSortDir = DataHelper.getSortDirection(BinRoundingMap);
    Integer BinRoundingSortOrder = DataHelper.getSortOrder(BinRoundingMap);
    if (BinRoundingFetch != null) out.setBinRoundingFetch(BinRoundingFetch);
    if (BinRoundingSortDir != null) out.setBinRoundingSortDirection(BinRoundingSortDir);
    if (BinRoundingSortOrder != null) out.setBinRoundingSortOrder(BinRoundingSortOrder);

    Filter[] BinRoundingFilter = DataHelper.mapToFilterArray(BinRoundingMap, Boolean.class);
    if (BinRoundingFilter != null) {
      BooleanFilter[] BinRoundingFilters = new BooleanFilter[BinRoundingFilter.length];
      for (int i = 0; i < BinRoundingFilters.length; i++) {
        BinRoundingFilters[i] = (BooleanFilter)BinRoundingFilter[i];
      }
      try {
        out.setBinRoundingFilter(BinRoundingFilters);
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
  
    Map IsInclusiveMap = (Map)record.get("IsInclusive");
    Boolean IsInclusiveFetch = DataHelper.getFetch(IsInclusiveMap);
    Boolean IsInclusiveSortDir = DataHelper.getSortDirection(IsInclusiveMap);
    Integer IsInclusiveSortOrder = DataHelper.getSortOrder(IsInclusiveMap);
    if (IsInclusiveFetch != null) out.setIsInclusiveFetch(IsInclusiveFetch);
    if (IsInclusiveSortDir != null) out.setIsInclusiveSortDirection(IsInclusiveSortDir);
    if (IsInclusiveSortOrder != null) out.setIsInclusiveSortOrder(IsInclusiveSortOrder);

    Filter[] IsInclusiveFilter = DataHelper.mapToFilterArray(IsInclusiveMap, Integer.class);
    if (IsInclusiveFilter != null) {
      IntegerFilter[] IsInclusiveFilters = new IntegerFilter[IsInclusiveFilter.length];
      for (int i = 0; i < IsInclusiveFilters.length; i++) {
        IsInclusiveFilters[i] = (IntegerFilter)IsInclusiveFilter[i];
      }
      try {
        out.setIsInclusiveFilter(IsInclusiveFilters);
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
