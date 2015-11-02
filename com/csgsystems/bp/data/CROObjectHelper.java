/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CROObjectHelper.java
 * Definition File: Admin/CorridorRateOverride.xml
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



/** Helper class to convert CROObject JavaBean objects to/from HashMaps.
 */
public class CROObjectHelper implements ArubaObjectHelper
{
  /** convert CROObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CROObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CROObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CROObject")
   * @return Map     the output Map
   */
  public static Map toMap (CROObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CROObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CROObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CROObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CROObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CROObject")
   * @return Map     the output Map
   */
  public static Map toMap (CROObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CROObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CROObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CROObjectData the converted object
   */
  public static CROObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CROObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CROObject")
   * @return CROObjectData the converted object
   */
  public static CROObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CROObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CROObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CROObjectFilter the converted object
   */
  public static CROObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CROObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CROObject")
   * @return CROObjectFilter the converted object
   */
  public static CROObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CROObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CROObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CROObjectDataList the converted object
   */
  public static CROObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CROObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CROObjectList")
   * @return CROObjectDataList the converted object
   */
  public static CROObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CROObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CROObjectData[] array = null;
    if (root != null)
    {
      array = new CROObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CROObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CROObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CROObjectDataList (array, index, total);
  }
  /** convert CROObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CROObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CROObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._CorridorPlanIdSet) record.put ("CorridorPlanId", in.CorridorPlanId);
  
    if (in._TypeIdUsgSet) record.put ("TypeIdUsg", in.TypeIdUsg);
  
    if (in._UnitsIndicatorSet) record.put ("UnitsIndicator", in.UnitsIndicator);
  
    if (in._ElementIdSet) record.put ("ElementId", in.ElementId);
  
    if (in._RateClassSet) record.put ("RateClass", in.RateClass);
  
    if (in._EquipTypeCodeSet) record.put ("EquipTypeCode", in.EquipTypeCode);
  
    if (in._EquipClassCodeSet) record.put ("EquipClassCode", in.EquipClassCode);
  
    if (in._ClassOfServiceCodeSet) record.put ("ClassOfServiceCode", in.ClassOfServiceCode);
  
    if (in._ProviderClassSet) record.put ("ProviderClass", in.ProviderClass);
  
    if (in._BillClassSet) record.put ("BillClass", in.BillClass);
  
    if (in._JurisdictionSet) record.put ("Jurisdiction", in.Jurisdiction);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._RatePeriodSet) record.put ("RatePeriod", in.RatePeriod);
  
    if (in._IncrementalBandsSet) record.put ("IncrementalBands", in.IncrementalBands);
  
    if (in._FixedChargeAmtSet) record.put ("FixedChargeAmt", in.FixedChargeAmt);
  
    if (in._AddFixedAmtSet) record.put ("AddFixedAmt", in.AddFixedAmt);
  
    if (in._AddUnitRateSet) record.put ("AddUnitRate", in.AddUnitRate);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._RateUnitsTypeSet) record.put ("RateUnitsType", in.RateUnitsType);
  
    if (in._DistanceBandIdSet) record.put ("DistanceBandId", in.DistanceBandId);
  
    if (in._AddImpliedDecimalSet) record.put ("AddImpliedDecimal", in.AddImpliedDecimal);
  
    if (in._ComponentIdSet) record.put ("ComponentId", in.ComponentId);
  
    if (in._BillingUnitsTypeSet) record.put ("BillingUnitsType", in.BillingUnitsType);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert CROObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CROObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CROObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.CorridorPlanId, in.CorridorPlanIdSort, in.CorridorPlanIdSortAscending, in.CorridorPlanIdFetch);
      if (map != null) record.put ("CorridorPlanId", map);
      map = DataHelper.filterToMap (in.TypeIdUsg, in.TypeIdUsgSort, in.TypeIdUsgSortAscending, in.TypeIdUsgFetch);
      if (map != null) record.put ("TypeIdUsg", map);
      map = DataHelper.filterToMap (in.UnitsIndicator, in.UnitsIndicatorSort, in.UnitsIndicatorSortAscending, in.UnitsIndicatorFetch);
      if (map != null) record.put ("UnitsIndicator", map);
      map = DataHelper.filterToMap (in.ElementId, in.ElementIdSort, in.ElementIdSortAscending, in.ElementIdFetch);
      if (map != null) record.put ("ElementId", map);
      map = DataHelper.filterToMap (in.RateClass, in.RateClassSort, in.RateClassSortAscending, in.RateClassFetch);
      if (map != null) record.put ("RateClass", map);
      map = DataHelper.filterToMap (in.EquipTypeCode, in.EquipTypeCodeSort, in.EquipTypeCodeSortAscending, in.EquipTypeCodeFetch);
      if (map != null) record.put ("EquipTypeCode", map);
      map = DataHelper.filterToMap (in.EquipClassCode, in.EquipClassCodeSort, in.EquipClassCodeSortAscending, in.EquipClassCodeFetch);
      if (map != null) record.put ("EquipClassCode", map);
      map = DataHelper.filterToMap (in.ClassOfServiceCode, in.ClassOfServiceCodeSort, in.ClassOfServiceCodeSortAscending, in.ClassOfServiceCodeFetch);
      if (map != null) record.put ("ClassOfServiceCode", map);
      map = DataHelper.filterToMap (in.ProviderClass, in.ProviderClassSort, in.ProviderClassSortAscending, in.ProviderClassFetch);
      if (map != null) record.put ("ProviderClass", map);
      map = DataHelper.filterToMap (in.BillClass, in.BillClassSort, in.BillClassSortAscending, in.BillClassFetch);
      if (map != null) record.put ("BillClass", map);
      map = DataHelper.filterToMap (in.Jurisdiction, in.JurisdictionSort, in.JurisdictionSortAscending, in.JurisdictionFetch);
      if (map != null) record.put ("Jurisdiction", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.RatePeriod, in.RatePeriodSort, in.RatePeriodSortAscending, in.RatePeriodFetch, in.RatePeriodCaseInsensitive);
      if (map != null) record.put ("RatePeriod", map);
      map = DataHelper.filterToMap (in.IncrementalBands, in.IncrementalBandsSort, in.IncrementalBandsSortAscending, in.IncrementalBandsFetch);
      if (map != null) record.put ("IncrementalBands", map);
      map = DataHelper.filterToMap (in.FixedChargeAmt, in.FixedChargeAmtSort, in.FixedChargeAmtSortAscending, in.FixedChargeAmtFetch);
      if (map != null) record.put ("FixedChargeAmt", map);
      map = DataHelper.filterToMap (in.AddFixedAmt, in.AddFixedAmtSort, in.AddFixedAmtSortAscending, in.AddFixedAmtFetch);
      if (map != null) record.put ("AddFixedAmt", map);
      map = DataHelper.filterToMap (in.AddUnitRate, in.AddUnitRateSort, in.AddUnitRateSortAscending, in.AddUnitRateFetch);
      if (map != null) record.put ("AddUnitRate", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.RateUnitsType, in.RateUnitsTypeSort, in.RateUnitsTypeSortAscending, in.RateUnitsTypeFetch);
      if (map != null) record.put ("RateUnitsType", map);
      map = DataHelper.filterToMap (in.DistanceBandId, in.DistanceBandIdSort, in.DistanceBandIdSortAscending, in.DistanceBandIdFetch);
      if (map != null) record.put ("DistanceBandId", map);
      map = DataHelper.filterToMap (in.AddImpliedDecimal, in.AddImpliedDecimalSort, in.AddImpliedDecimalSortAscending, in.AddImpliedDecimalFetch);
      if (map != null) record.put ("AddImpliedDecimal", map);
      map = DataHelper.filterToMap (in.ComponentId, in.ComponentIdSort, in.ComponentIdSortAscending, in.ComponentIdFetch);
      if (map != null) record.put ("ComponentId", map);
      map = DataHelper.filterToMap (in.BillingUnitsType, in.BillingUnitsTypeSort, in.BillingUnitsTypeSortAscending, in.BillingUnitsTypeFetch);
      if (map != null) record.put ("BillingUnitsType", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to CROObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CROObjectData the converted object
   */
  public static CROObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CROObjectData out = new CROObjectData ();

    out.Key = CROObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("CorridorPlanId")) != null)
    {
      out.CorridorPlanId = (Integer) obj;
    }
  
    if ((obj = record.get ("TypeIdUsg")) != null)
    {
      out.TypeIdUsg = (Integer) obj;
    }
  
    if ((obj = record.get ("UnitsIndicator")) != null)
    {
      out.UnitsIndicator = (Integer) obj;
    }
  
    if ((obj = record.get ("ElementId")) != null)
    {
      out.ElementId = (Integer) obj;
    }
  
    if ((obj = record.get ("RateClass")) != null)
    {
      out.RateClass = (Integer) obj;
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
  
    if ((obj = record.get ("ProviderClass")) != null)
    {
      out.ProviderClass = (Integer) obj;
    }
  
    if ((obj = record.get ("BillClass")) != null)
    {
      out.BillClass = (Integer) obj;
    }
  
    if ((obj = record.get ("Jurisdiction")) != null)
    {
      out.Jurisdiction = (Integer) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("RatePeriod")) != null)
    {
      out.RatePeriod = (String) obj;
    }
  
    if ((obj = record.get ("IncrementalBands")) != null)
    {
      out.IncrementalBands = (Boolean) obj;
    }
  
    if ((obj = record.get ("FixedChargeAmt")) != null)
    {
      out.FixedChargeAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AddFixedAmt")) != null)
    {
      out.AddFixedAmt = (Integer) obj;
    }
  
    if ((obj = record.get ("AddUnitRate")) != null)
    {
      out.AddUnitRate = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("CreateDt")) != null)
    {
      out.CreateDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("RateUnitsType")) != null)
    {
      out.RateUnitsType = (Integer) obj;
    }
  
    if ((obj = record.get ("DistanceBandId")) != null)
    {
      out.DistanceBandId = (Integer) obj;
    }
  
    if ((obj = record.get ("AddImpliedDecimal")) != null)
    {
      out.AddImpliedDecimal = (Integer) obj;
    }
  
    if ((obj = record.get ("ComponentId")) != null)
    {
      out.ComponentId = (Integer) obj;
    }
  
    if ((obj = record.get ("BillingUnitsType")) != null)
    {
      out.BillingUnitsType = (Integer) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to CROObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CROObjectFilter the converted object
   */
  public static CROObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CROObjectFilter out = new CROObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CROObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map CorridorPlanIdMap = (Map)record.get("CorridorPlanId");
    Boolean CorridorPlanIdFetch = DataHelper.getFetch(CorridorPlanIdMap);
    Boolean CorridorPlanIdSortDir = DataHelper.getSortDirection(CorridorPlanIdMap);
    Integer CorridorPlanIdSortOrder = DataHelper.getSortOrder(CorridorPlanIdMap);
    if (CorridorPlanIdFetch != null) out.setCorridorPlanIdFetch(CorridorPlanIdFetch);
    if (CorridorPlanIdSortDir != null) out.setCorridorPlanIdSortDirection(CorridorPlanIdSortDir);
    if (CorridorPlanIdSortOrder != null) out.setCorridorPlanIdSortOrder(CorridorPlanIdSortOrder);

    Filter[] CorridorPlanIdFilter = DataHelper.mapToFilterArray(CorridorPlanIdMap, Integer.class);
    if (CorridorPlanIdFilter != null) {
      IntegerFilter[] CorridorPlanIdFilters = new IntegerFilter[CorridorPlanIdFilter.length];
      for (int i = 0; i < CorridorPlanIdFilters.length; i++) {
        CorridorPlanIdFilters[i] = (IntegerFilter)CorridorPlanIdFilter[i];
      }
      try {
        out.setCorridorPlanIdFilter(CorridorPlanIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TypeIdUsgMap = (Map)record.get("TypeIdUsg");
    Boolean TypeIdUsgFetch = DataHelper.getFetch(TypeIdUsgMap);
    Boolean TypeIdUsgSortDir = DataHelper.getSortDirection(TypeIdUsgMap);
    Integer TypeIdUsgSortOrder = DataHelper.getSortOrder(TypeIdUsgMap);
    if (TypeIdUsgFetch != null) out.setTypeIdUsgFetch(TypeIdUsgFetch);
    if (TypeIdUsgSortDir != null) out.setTypeIdUsgSortDirection(TypeIdUsgSortDir);
    if (TypeIdUsgSortOrder != null) out.setTypeIdUsgSortOrder(TypeIdUsgSortOrder);

    Filter[] TypeIdUsgFilter = DataHelper.mapToFilterArray(TypeIdUsgMap, Integer.class);
    if (TypeIdUsgFilter != null) {
      IntegerFilter[] TypeIdUsgFilters = new IntegerFilter[TypeIdUsgFilter.length];
      for (int i = 0; i < TypeIdUsgFilters.length; i++) {
        TypeIdUsgFilters[i] = (IntegerFilter)TypeIdUsgFilter[i];
      }
      try {
        out.setTypeIdUsgFilter(TypeIdUsgFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitsIndicatorMap = (Map)record.get("UnitsIndicator");
    Boolean UnitsIndicatorFetch = DataHelper.getFetch(UnitsIndicatorMap);
    Boolean UnitsIndicatorSortDir = DataHelper.getSortDirection(UnitsIndicatorMap);
    Integer UnitsIndicatorSortOrder = DataHelper.getSortOrder(UnitsIndicatorMap);
    if (UnitsIndicatorFetch != null) out.setUnitsIndicatorFetch(UnitsIndicatorFetch);
    if (UnitsIndicatorSortDir != null) out.setUnitsIndicatorSortDirection(UnitsIndicatorSortDir);
    if (UnitsIndicatorSortOrder != null) out.setUnitsIndicatorSortOrder(UnitsIndicatorSortOrder);

    Filter[] UnitsIndicatorFilter = DataHelper.mapToFilterArray(UnitsIndicatorMap, Integer.class);
    if (UnitsIndicatorFilter != null) {
      IntegerFilter[] UnitsIndicatorFilters = new IntegerFilter[UnitsIndicatorFilter.length];
      for (int i = 0; i < UnitsIndicatorFilters.length; i++) {
        UnitsIndicatorFilters[i] = (IntegerFilter)UnitsIndicatorFilter[i];
      }
      try {
        out.setUnitsIndicatorFilter(UnitsIndicatorFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ElementIdMap = (Map)record.get("ElementId");
    Boolean ElementIdFetch = DataHelper.getFetch(ElementIdMap);
    Boolean ElementIdSortDir = DataHelper.getSortDirection(ElementIdMap);
    Integer ElementIdSortOrder = DataHelper.getSortOrder(ElementIdMap);
    if (ElementIdFetch != null) out.setElementIdFetch(ElementIdFetch);
    if (ElementIdSortDir != null) out.setElementIdSortDirection(ElementIdSortDir);
    if (ElementIdSortOrder != null) out.setElementIdSortOrder(ElementIdSortOrder);

    Filter[] ElementIdFilter = DataHelper.mapToFilterArray(ElementIdMap, Integer.class);
    if (ElementIdFilter != null) {
      IntegerFilter[] ElementIdFilters = new IntegerFilter[ElementIdFilter.length];
      for (int i = 0; i < ElementIdFilters.length; i++) {
        ElementIdFilters[i] = (IntegerFilter)ElementIdFilter[i];
      }
      try {
        out.setElementIdFilter(ElementIdFilters);
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
  
    Map ProviderClassMap = (Map)record.get("ProviderClass");
    Boolean ProviderClassFetch = DataHelper.getFetch(ProviderClassMap);
    Boolean ProviderClassSortDir = DataHelper.getSortDirection(ProviderClassMap);
    Integer ProviderClassSortOrder = DataHelper.getSortOrder(ProviderClassMap);
    if (ProviderClassFetch != null) out.setProviderClassFetch(ProviderClassFetch);
    if (ProviderClassSortDir != null) out.setProviderClassSortDirection(ProviderClassSortDir);
    if (ProviderClassSortOrder != null) out.setProviderClassSortOrder(ProviderClassSortOrder);

    Filter[] ProviderClassFilter = DataHelper.mapToFilterArray(ProviderClassMap, Integer.class);
    if (ProviderClassFilter != null) {
      IntegerFilter[] ProviderClassFilters = new IntegerFilter[ProviderClassFilter.length];
      for (int i = 0; i < ProviderClassFilters.length; i++) {
        ProviderClassFilters[i] = (IntegerFilter)ProviderClassFilter[i];
      }
      try {
        out.setProviderClassFilter(ProviderClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillClassMap = (Map)record.get("BillClass");
    Boolean BillClassFetch = DataHelper.getFetch(BillClassMap);
    Boolean BillClassSortDir = DataHelper.getSortDirection(BillClassMap);
    Integer BillClassSortOrder = DataHelper.getSortOrder(BillClassMap);
    if (BillClassFetch != null) out.setBillClassFetch(BillClassFetch);
    if (BillClassSortDir != null) out.setBillClassSortDirection(BillClassSortDir);
    if (BillClassSortOrder != null) out.setBillClassSortOrder(BillClassSortOrder);

    Filter[] BillClassFilter = DataHelper.mapToFilterArray(BillClassMap, Integer.class);
    if (BillClassFilter != null) {
      IntegerFilter[] BillClassFilters = new IntegerFilter[BillClassFilter.length];
      for (int i = 0; i < BillClassFilters.length; i++) {
        BillClassFilters[i] = (IntegerFilter)BillClassFilter[i];
      }
      try {
        out.setBillClassFilter(BillClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map JurisdictionMap = (Map)record.get("Jurisdiction");
    Boolean JurisdictionFetch = DataHelper.getFetch(JurisdictionMap);
    Boolean JurisdictionSortDir = DataHelper.getSortDirection(JurisdictionMap);
    Integer JurisdictionSortOrder = DataHelper.getSortOrder(JurisdictionMap);
    if (JurisdictionFetch != null) out.setJurisdictionFetch(JurisdictionFetch);
    if (JurisdictionSortDir != null) out.setJurisdictionSortDirection(JurisdictionSortDir);
    if (JurisdictionSortOrder != null) out.setJurisdictionSortOrder(JurisdictionSortOrder);

    Filter[] JurisdictionFilter = DataHelper.mapToFilterArray(JurisdictionMap, Integer.class);
    if (JurisdictionFilter != null) {
      IntegerFilter[] JurisdictionFilters = new IntegerFilter[JurisdictionFilter.length];
      for (int i = 0; i < JurisdictionFilters.length; i++) {
        JurisdictionFilters[i] = (IntegerFilter)JurisdictionFilter[i];
      }
      try {
        out.setJurisdictionFilter(JurisdictionFilters);
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
  
    Map RatePeriodMap = (Map)record.get("RatePeriod");
    Boolean RatePeriodFetch = DataHelper.getFetch(RatePeriodMap);
    Boolean RatePeriodSortDir = DataHelper.getSortDirection(RatePeriodMap);
    Integer RatePeriodSortOrder = DataHelper.getSortOrder(RatePeriodMap);
    if (RatePeriodFetch != null) out.setRatePeriodFetch(RatePeriodFetch);
    if (RatePeriodSortDir != null) out.setRatePeriodSortDirection(RatePeriodSortDir);
    if (RatePeriodSortOrder != null) out.setRatePeriodSortOrder(RatePeriodSortOrder);

    Filter[] RatePeriodFilter = DataHelper.mapToFilterArray(RatePeriodMap, String.class);
    if (RatePeriodFilter != null) {
      StringFilter[] RatePeriodFilters = new StringFilter[RatePeriodFilter.length];
      for (int i = 0; i < RatePeriodFilters.length; i++) {
        RatePeriodFilters[i] = (StringFilter)RatePeriodFilter[i];
      }
      try {
        out.setRatePeriodFilter(RatePeriodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncrementalBandsMap = (Map)record.get("IncrementalBands");
    Boolean IncrementalBandsFetch = DataHelper.getFetch(IncrementalBandsMap);
    Boolean IncrementalBandsSortDir = DataHelper.getSortDirection(IncrementalBandsMap);
    Integer IncrementalBandsSortOrder = DataHelper.getSortOrder(IncrementalBandsMap);
    if (IncrementalBandsFetch != null) out.setIncrementalBandsFetch(IncrementalBandsFetch);
    if (IncrementalBandsSortDir != null) out.setIncrementalBandsSortDirection(IncrementalBandsSortDir);
    if (IncrementalBandsSortOrder != null) out.setIncrementalBandsSortOrder(IncrementalBandsSortOrder);

    Filter[] IncrementalBandsFilter = DataHelper.mapToFilterArray(IncrementalBandsMap, Boolean.class);
    if (IncrementalBandsFilter != null) {
      BooleanFilter[] IncrementalBandsFilters = new BooleanFilter[IncrementalBandsFilter.length];
      for (int i = 0; i < IncrementalBandsFilters.length; i++) {
        IncrementalBandsFilters[i] = (BooleanFilter)IncrementalBandsFilter[i];
      }
      try {
        out.setIncrementalBandsFilter(IncrementalBandsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FixedChargeAmtMap = (Map)record.get("FixedChargeAmt");
    Boolean FixedChargeAmtFetch = DataHelper.getFetch(FixedChargeAmtMap);
    Boolean FixedChargeAmtSortDir = DataHelper.getSortDirection(FixedChargeAmtMap);
    Integer FixedChargeAmtSortOrder = DataHelper.getSortOrder(FixedChargeAmtMap);
    if (FixedChargeAmtFetch != null) out.setFixedChargeAmtFetch(FixedChargeAmtFetch);
    if (FixedChargeAmtSortDir != null) out.setFixedChargeAmtSortDirection(FixedChargeAmtSortDir);
    if (FixedChargeAmtSortOrder != null) out.setFixedChargeAmtSortOrder(FixedChargeAmtSortOrder);

    Filter[] FixedChargeAmtFilter = DataHelper.mapToFilterArray(FixedChargeAmtMap, BigInteger.class);
    if (FixedChargeAmtFilter != null) {
      BigIntegerFilter[] FixedChargeAmtFilters = new BigIntegerFilter[FixedChargeAmtFilter.length];
      for (int i = 0; i < FixedChargeAmtFilters.length; i++) {
        FixedChargeAmtFilters[i] = (BigIntegerFilter)FixedChargeAmtFilter[i];
      }
      try {
        out.setFixedChargeAmtFilter(FixedChargeAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddFixedAmtMap = (Map)record.get("AddFixedAmt");
    Boolean AddFixedAmtFetch = DataHelper.getFetch(AddFixedAmtMap);
    Boolean AddFixedAmtSortDir = DataHelper.getSortDirection(AddFixedAmtMap);
    Integer AddFixedAmtSortOrder = DataHelper.getSortOrder(AddFixedAmtMap);
    if (AddFixedAmtFetch != null) out.setAddFixedAmtFetch(AddFixedAmtFetch);
    if (AddFixedAmtSortDir != null) out.setAddFixedAmtSortDirection(AddFixedAmtSortDir);
    if (AddFixedAmtSortOrder != null) out.setAddFixedAmtSortOrder(AddFixedAmtSortOrder);

    Filter[] AddFixedAmtFilter = DataHelper.mapToFilterArray(AddFixedAmtMap, Integer.class);
    if (AddFixedAmtFilter != null) {
      IntegerFilter[] AddFixedAmtFilters = new IntegerFilter[AddFixedAmtFilter.length];
      for (int i = 0; i < AddFixedAmtFilters.length; i++) {
        AddFixedAmtFilters[i] = (IntegerFilter)AddFixedAmtFilter[i];
      }
      try {
        out.setAddFixedAmtFilter(AddFixedAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddUnitRateMap = (Map)record.get("AddUnitRate");
    Boolean AddUnitRateFetch = DataHelper.getFetch(AddUnitRateMap);
    Boolean AddUnitRateSortDir = DataHelper.getSortDirection(AddUnitRateMap);
    Integer AddUnitRateSortOrder = DataHelper.getSortOrder(AddUnitRateMap);
    if (AddUnitRateFetch != null) out.setAddUnitRateFetch(AddUnitRateFetch);
    if (AddUnitRateSortDir != null) out.setAddUnitRateSortDirection(AddUnitRateSortDir);
    if (AddUnitRateSortOrder != null) out.setAddUnitRateSortOrder(AddUnitRateSortOrder);

    Filter[] AddUnitRateFilter = DataHelper.mapToFilterArray(AddUnitRateMap, Integer.class);
    if (AddUnitRateFilter != null) {
      IntegerFilter[] AddUnitRateFilters = new IntegerFilter[AddUnitRateFilter.length];
      for (int i = 0; i < AddUnitRateFilters.length; i++) {
        AddUnitRateFilters[i] = (IntegerFilter)AddUnitRateFilter[i];
      }
      try {
        out.setAddUnitRateFilter(AddUnitRateFilters);
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
  
    Map CreateDtMap = (Map)record.get("CreateDt");
    Boolean CreateDtFetch = DataHelper.getFetch(CreateDtMap);
    Boolean CreateDtSortDir = DataHelper.getSortDirection(CreateDtMap);
    Integer CreateDtSortOrder = DataHelper.getSortOrder(CreateDtMap);
    if (CreateDtFetch != null) out.setCreateDtFetch(CreateDtFetch);
    if (CreateDtSortDir != null) out.setCreateDtSortDirection(CreateDtSortDir);
    if (CreateDtSortOrder != null) out.setCreateDtSortOrder(CreateDtSortOrder);

    Filter[] CreateDtFilter = DataHelper.mapToFilterArray(CreateDtMap, Date.class);
    if (CreateDtFilter != null) {
      DateFilter[] CreateDtFilters = new DateFilter[CreateDtFilter.length];
      for (int i = 0; i < CreateDtFilters.length; i++) {
        CreateDtFilters[i] = (DateFilter)CreateDtFilter[i];
      }
      try {
        out.setCreateDtFilter(CreateDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDtMap = (Map)record.get("ChgDt");
    Boolean ChgDtFetch = DataHelper.getFetch(ChgDtMap);
    Boolean ChgDtSortDir = DataHelper.getSortDirection(ChgDtMap);
    Integer ChgDtSortOrder = DataHelper.getSortOrder(ChgDtMap);
    if (ChgDtFetch != null) out.setChgDtFetch(ChgDtFetch);
    if (ChgDtSortDir != null) out.setChgDtSortDirection(ChgDtSortDir);
    if (ChgDtSortOrder != null) out.setChgDtSortOrder(ChgDtSortOrder);

    Filter[] ChgDtFilter = DataHelper.mapToFilterArray(ChgDtMap, Date.class);
    if (ChgDtFilter != null) {
      DateFilter[] ChgDtFilters = new DateFilter[ChgDtFilter.length];
      for (int i = 0; i < ChgDtFilters.length; i++) {
        ChgDtFilters[i] = (DateFilter)ChgDtFilter[i];
      }
      try {
        out.setChgDtFilter(ChgDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgWhoMap = (Map)record.get("ChgWho");
    Boolean ChgWhoFetch = DataHelper.getFetch(ChgWhoMap);
    Boolean ChgWhoSortDir = DataHelper.getSortDirection(ChgWhoMap);
    Integer ChgWhoSortOrder = DataHelper.getSortOrder(ChgWhoMap);
    if (ChgWhoFetch != null) out.setChgWhoFetch(ChgWhoFetch);
    if (ChgWhoSortDir != null) out.setChgWhoSortDirection(ChgWhoSortDir);
    if (ChgWhoSortOrder != null) out.setChgWhoSortOrder(ChgWhoSortOrder);

    Filter[] ChgWhoFilter = DataHelper.mapToFilterArray(ChgWhoMap, String.class);
    if (ChgWhoFilter != null) {
      StringFilter[] ChgWhoFilters = new StringFilter[ChgWhoFilter.length];
      for (int i = 0; i < ChgWhoFilters.length; i++) {
        ChgWhoFilters[i] = (StringFilter)ChgWhoFilter[i];
      }
      try {
        out.setChgWhoFilter(ChgWhoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateUnitsTypeMap = (Map)record.get("RateUnitsType");
    Boolean RateUnitsTypeFetch = DataHelper.getFetch(RateUnitsTypeMap);
    Boolean RateUnitsTypeSortDir = DataHelper.getSortDirection(RateUnitsTypeMap);
    Integer RateUnitsTypeSortOrder = DataHelper.getSortOrder(RateUnitsTypeMap);
    if (RateUnitsTypeFetch != null) out.setRateUnitsTypeFetch(RateUnitsTypeFetch);
    if (RateUnitsTypeSortDir != null) out.setRateUnitsTypeSortDirection(RateUnitsTypeSortDir);
    if (RateUnitsTypeSortOrder != null) out.setRateUnitsTypeSortOrder(RateUnitsTypeSortOrder);

    Filter[] RateUnitsTypeFilter = DataHelper.mapToFilterArray(RateUnitsTypeMap, Integer.class);
    if (RateUnitsTypeFilter != null) {
      IntegerFilter[] RateUnitsTypeFilters = new IntegerFilter[RateUnitsTypeFilter.length];
      for (int i = 0; i < RateUnitsTypeFilters.length; i++) {
        RateUnitsTypeFilters[i] = (IntegerFilter)RateUnitsTypeFilter[i];
      }
      try {
        out.setRateUnitsTypeFilter(RateUnitsTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DistanceBandIdMap = (Map)record.get("DistanceBandId");
    Boolean DistanceBandIdFetch = DataHelper.getFetch(DistanceBandIdMap);
    Boolean DistanceBandIdSortDir = DataHelper.getSortDirection(DistanceBandIdMap);
    Integer DistanceBandIdSortOrder = DataHelper.getSortOrder(DistanceBandIdMap);
    if (DistanceBandIdFetch != null) out.setDistanceBandIdFetch(DistanceBandIdFetch);
    if (DistanceBandIdSortDir != null) out.setDistanceBandIdSortDirection(DistanceBandIdSortDir);
    if (DistanceBandIdSortOrder != null) out.setDistanceBandIdSortOrder(DistanceBandIdSortOrder);

    Filter[] DistanceBandIdFilter = DataHelper.mapToFilterArray(DistanceBandIdMap, Integer.class);
    if (DistanceBandIdFilter != null) {
      IntegerFilter[] DistanceBandIdFilters = new IntegerFilter[DistanceBandIdFilter.length];
      for (int i = 0; i < DistanceBandIdFilters.length; i++) {
        DistanceBandIdFilters[i] = (IntegerFilter)DistanceBandIdFilter[i];
      }
      try {
        out.setDistanceBandIdFilter(DistanceBandIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddImpliedDecimalMap = (Map)record.get("AddImpliedDecimal");
    Boolean AddImpliedDecimalFetch = DataHelper.getFetch(AddImpliedDecimalMap);
    Boolean AddImpliedDecimalSortDir = DataHelper.getSortDirection(AddImpliedDecimalMap);
    Integer AddImpliedDecimalSortOrder = DataHelper.getSortOrder(AddImpliedDecimalMap);
    if (AddImpliedDecimalFetch != null) out.setAddImpliedDecimalFetch(AddImpliedDecimalFetch);
    if (AddImpliedDecimalSortDir != null) out.setAddImpliedDecimalSortDirection(AddImpliedDecimalSortDir);
    if (AddImpliedDecimalSortOrder != null) out.setAddImpliedDecimalSortOrder(AddImpliedDecimalSortOrder);

    Filter[] AddImpliedDecimalFilter = DataHelper.mapToFilterArray(AddImpliedDecimalMap, Integer.class);
    if (AddImpliedDecimalFilter != null) {
      IntegerFilter[] AddImpliedDecimalFilters = new IntegerFilter[AddImpliedDecimalFilter.length];
      for (int i = 0; i < AddImpliedDecimalFilters.length; i++) {
        AddImpliedDecimalFilters[i] = (IntegerFilter)AddImpliedDecimalFilter[i];
      }
      try {
        out.setAddImpliedDecimalFilter(AddImpliedDecimalFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ComponentIdMap = (Map)record.get("ComponentId");
    Boolean ComponentIdFetch = DataHelper.getFetch(ComponentIdMap);
    Boolean ComponentIdSortDir = DataHelper.getSortDirection(ComponentIdMap);
    Integer ComponentIdSortOrder = DataHelper.getSortOrder(ComponentIdMap);
    if (ComponentIdFetch != null) out.setComponentIdFetch(ComponentIdFetch);
    if (ComponentIdSortDir != null) out.setComponentIdSortDirection(ComponentIdSortDir);
    if (ComponentIdSortOrder != null) out.setComponentIdSortOrder(ComponentIdSortOrder);

    Filter[] ComponentIdFilter = DataHelper.mapToFilterArray(ComponentIdMap, Integer.class);
    if (ComponentIdFilter != null) {
      IntegerFilter[] ComponentIdFilters = new IntegerFilter[ComponentIdFilter.length];
      for (int i = 0; i < ComponentIdFilters.length; i++) {
        ComponentIdFilters[i] = (IntegerFilter)ComponentIdFilter[i];
      }
      try {
        out.setComponentIdFilter(ComponentIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillingUnitsTypeMap = (Map)record.get("BillingUnitsType");
    Boolean BillingUnitsTypeFetch = DataHelper.getFetch(BillingUnitsTypeMap);
    Boolean BillingUnitsTypeSortDir = DataHelper.getSortDirection(BillingUnitsTypeMap);
    Integer BillingUnitsTypeSortOrder = DataHelper.getSortOrder(BillingUnitsTypeMap);
    if (BillingUnitsTypeFetch != null) out.setBillingUnitsTypeFetch(BillingUnitsTypeFetch);
    if (BillingUnitsTypeSortDir != null) out.setBillingUnitsTypeSortDirection(BillingUnitsTypeSortDir);
    if (BillingUnitsTypeSortOrder != null) out.setBillingUnitsTypeSortOrder(BillingUnitsTypeSortOrder);

    Filter[] BillingUnitsTypeFilter = DataHelper.mapToFilterArray(BillingUnitsTypeMap, Integer.class);
    if (BillingUnitsTypeFilter != null) {
      IntegerFilter[] BillingUnitsTypeFilters = new IntegerFilter[BillingUnitsTypeFilter.length];
      for (int i = 0; i < BillingUnitsTypeFilters.length; i++) {
        BillingUnitsTypeFilters[i] = (IntegerFilter)BillingUnitsTypeFilter[i];
      }
      try {
        out.setBillingUnitsTypeFilter(BillingUnitsTypeFilters);
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
  
    return out;
  }
}
