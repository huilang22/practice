/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PRRRcDataObjectHelper.java
 * Definition File: Customer/ProductRcRate.xml
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



/** Helper class to convert PRRRcDataObject JavaBean objects to/from HashMaps.
 */
public class PRRRcDataObjectHelper implements ArubaObjectHelper
{
  /** convert PRRRcDataObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PRRRcDataObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PRRRcDataObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PRRRcDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (PRRRcDataObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PRRRcDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PRRRcDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PRRRcDataObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PRRRcDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PRRRcDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (PRRRcDataObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PRRRcDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PRRRcDataObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PRRRcDataObjectData the converted object
   */
  public static PRRRcDataObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PRRRcDataObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PRRRcDataObject")
   * @return PRRRcDataObjectData the converted object
   */
  public static PRRRcDataObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PRRRcDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PRRRcDataObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PRRRcDataObjectFilter the converted object
   */
  public static PRRRcDataObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PRRRcDataObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PRRRcDataObject")
   * @return PRRRcDataObjectFilter the converted object
   */
  public static PRRRcDataObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PRRRcDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PRRRcDataObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PRRRcDataObjectDataList the converted object
   */
  public static PRRRcDataObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PRRRcDataObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PRRRcDataObjectList")
   * @return PRRRcDataObjectDataList the converted object
   */
  public static PRRRcDataObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PRRRcDataObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PRRRcDataObjectData[] array = null;
    if (root != null)
    {
      array = new PRRRcDataObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PRRRcDataObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PRRRcDataObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PRRRcDataObjectDataList (array, index, total);
  }
  /** convert PRRRcDataObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PRRRcDataObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._DescriptionCodeSet) record.put ("DescriptionCode", in.DescriptionCode);
  
    if (in._RateRateClassSet) record.put ("RateRateClass", in.RateRateClass);
  
    if (in._RateEquipTypeSet) record.put ("RateEquipType", in.RateEquipType);
  
    if (in._RateEquipClassSet) record.put ("RateEquipClass", in.RateEquipClass);
  
    if (in._RateClassOfServiceSet) record.put ("RateClassOfService", in.RateClassOfService);
  
    if (in._RateComponentIdSet) record.put ("RateComponentId", in.RateComponentId);
  
    if (in._RateJurisdictionSet) record.put ("RateJurisdiction", in.RateJurisdiction);
  
    if (in._RateUnitsSet) record.put ("RateUnits", in.RateUnits);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._RateCurrencyLocationSet) record.put ("RateCurrencyLocation", in.RateCurrencyLocation);
  
    if (in._BillInArrearsSet) record.put ("BillInArrears", in.BillInArrears);
  
    if (in._UnitsTypeSet) record.put ("UnitsType", in.UnitsType);
  
    if (in._UnitsSet) record.put ("Units", in.Units);
  
    if (in._ComponentIdSet) record.put ("ComponentId", in.ComponentId);
  
    if (in._BillPeriodSet) record.put ("BillPeriod", in.BillPeriod);
  
    if (in._BilledThruDtSet) record.put ("BilledThruDt", in.BilledThruDt);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._TerminationCodeSet) record.put ("TerminationCode", in.TerminationCode);
  
    if (in._InArrearsOverrideSet) record.put ("InArrearsOverride", in.InArrearsOverride);
      return record;
  }
  /** convert PRRRcDataObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PRRRcDataObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.DescriptionCode, in.DescriptionCodeSort, in.DescriptionCodeSortAscending, in.DescriptionCodeFetch);
      if (map != null) record.put ("DescriptionCode", map);
      map = DataHelper.filterToMap (in.RateRateClass, in.RateRateClassSort, in.RateRateClassSortAscending, in.RateRateClassFetch);
      if (map != null) record.put ("RateRateClass", map);
      map = DataHelper.filterToMap (in.RateEquipType, in.RateEquipTypeSort, in.RateEquipTypeSortAscending, in.RateEquipTypeFetch);
      if (map != null) record.put ("RateEquipType", map);
      map = DataHelper.filterToMap (in.RateEquipClass, in.RateEquipClassSort, in.RateEquipClassSortAscending, in.RateEquipClassFetch);
      if (map != null) record.put ("RateEquipClass", map);
      map = DataHelper.filterToMap (in.RateClassOfService, in.RateClassOfServiceSort, in.RateClassOfServiceSortAscending, in.RateClassOfServiceFetch);
      if (map != null) record.put ("RateClassOfService", map);
      map = DataHelper.filterToMap (in.RateComponentId, in.RateComponentIdSort, in.RateComponentIdSortAscending, in.RateComponentIdFetch);
      if (map != null) record.put ("RateComponentId", map);
      map = DataHelper.filterToMap (in.RateJurisdiction, in.RateJurisdictionSort, in.RateJurisdictionSortAscending, in.RateJurisdictionFetch);
      if (map != null) record.put ("RateJurisdiction", map);
      map = DataHelper.filterToMap (in.RateUnits, in.RateUnitsSort, in.RateUnitsSortAscending, in.RateUnitsFetch);
      if (map != null) record.put ("RateUnits", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.RateCurrencyLocation, in.RateCurrencyLocationSort, in.RateCurrencyLocationSortAscending, in.RateCurrencyLocationFetch);
      if (map != null) record.put ("RateCurrencyLocation", map);
      map = DataHelper.filterToMap (in.BillInArrears, in.BillInArrearsSort, in.BillInArrearsSortAscending, in.BillInArrearsFetch);
      if (map != null) record.put ("BillInArrears", map);
      map = DataHelper.filterToMap (in.UnitsType, in.UnitsTypeSort, in.UnitsTypeSortAscending, in.UnitsTypeFetch);
      if (map != null) record.put ("UnitsType", map);
      map = DataHelper.filterToMap (in.Units, in.UnitsSort, in.UnitsSortAscending, in.UnitsFetch);
      if (map != null) record.put ("Units", map);
      map = DataHelper.filterToMap (in.ComponentId, in.ComponentIdSort, in.ComponentIdSortAscending, in.ComponentIdFetch);
      if (map != null) record.put ("ComponentId", map);
      map = DataHelper.filterToMap (in.BillPeriod, in.BillPeriodSort, in.BillPeriodSortAscending, in.BillPeriodFetch, in.BillPeriodCaseInsensitive);
      if (map != null) record.put ("BillPeriod", map);
      map = DataHelper.filterToMap (in.BilledThruDt, in.BilledThruDtSort, in.BilledThruDtSortAscending, in.BilledThruDtFetch);
      if (map != null) record.put ("BilledThruDt", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.TerminationCode, in.TerminationCodeSort, in.TerminationCodeSortAscending, in.TerminationCodeFetch);
      if (map != null) record.put ("TerminationCode", map);
      map = DataHelper.filterToMap (in.InArrearsOverride, in.InArrearsOverrideSort, in.InArrearsOverrideSortAscending, in.InArrearsOverrideFetch);
      if (map != null) record.put ("InArrearsOverride", map);
    return record;
  }
  /** convert Map to PRRRcDataObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PRRRcDataObjectData the converted object
   */
  public static PRRRcDataObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PRRRcDataObjectData out = new PRRRcDataObjectData ();

    if ((obj = record.get ("DescriptionCode")) != null)
    {
      out.DescriptionCode = (Integer) obj;
    }
  
    if ((obj = record.get ("RateRateClass")) != null)
    {
      out.RateRateClass = (Boolean) obj;
    }
  
    if ((obj = record.get ("RateEquipType")) != null)
    {
      out.RateEquipType = (Boolean) obj;
    }
  
    if ((obj = record.get ("RateEquipClass")) != null)
    {
      out.RateEquipClass = (Boolean) obj;
    }
  
    if ((obj = record.get ("RateClassOfService")) != null)
    {
      out.RateClassOfService = (Boolean) obj;
    }
  
    if ((obj = record.get ("RateComponentId")) != null)
    {
      out.RateComponentId = (Boolean) obj;
    }
  
    if ((obj = record.get ("RateJurisdiction")) != null)
    {
      out.RateJurisdiction = (Boolean) obj;
    }
  
    if ((obj = record.get ("RateUnits")) != null)
    {
      out.RateUnits = (Boolean) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("RateCurrencyLocation")) != null)
    {
      out.RateCurrencyLocation = (Integer) obj;
    }
  
    if ((obj = record.get ("BillInArrears")) != null)
    {
      out.BillInArrears = (Boolean) obj;
    }
  
    if ((obj = record.get ("UnitsType")) != null)
    {
      out.UnitsType = (Integer) obj;
    }
  
    if ((obj = record.get ("Units")) != null)
    {
      out.Units = (Integer) obj;
    }
  
    if ((obj = record.get ("ComponentId")) != null)
    {
      out.ComponentId = (Integer) obj;
    }
  
    if ((obj = record.get ("BillPeriod")) != null)
    {
      out.BillPeriod = (String) obj;
    }
  
    if ((obj = record.get ("BilledThruDt")) != null)
    {
      out.BilledThruDt = (Date) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("TerminationCode")) != null)
    {
      out.TerminationCode = (Integer) obj;
    }
  
    if ((obj = record.get ("InArrearsOverride")) != null)
    {
      out.InArrearsOverride = (Integer) obj;
    }
      return out;
  }
  /** convert Map to PRRRcDataObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PRRRcDataObjectFilter the converted object
   */
  public static PRRRcDataObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PRRRcDataObjectFilter out = new PRRRcDataObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

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
  
    Map RateRateClassMap = (Map)record.get("RateRateClass");
    Boolean RateRateClassFetch = DataHelper.getFetch(RateRateClassMap);
    Boolean RateRateClassSortDir = DataHelper.getSortDirection(RateRateClassMap);
    Integer RateRateClassSortOrder = DataHelper.getSortOrder(RateRateClassMap);
    if (RateRateClassFetch != null) out.setRateRateClassFetch(RateRateClassFetch);
    if (RateRateClassSortDir != null) out.setRateRateClassSortDirection(RateRateClassSortDir);
    if (RateRateClassSortOrder != null) out.setRateRateClassSortOrder(RateRateClassSortOrder);

    Filter[] RateRateClassFilter = DataHelper.mapToFilterArray(RateRateClassMap, Boolean.class);
    if (RateRateClassFilter != null) {
      BooleanFilter[] RateRateClassFilters = new BooleanFilter[RateRateClassFilter.length];
      for (int i = 0; i < RateRateClassFilters.length; i++) {
        RateRateClassFilters[i] = (BooleanFilter)RateRateClassFilter[i];
      }
      try {
        out.setRateRateClassFilter(RateRateClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateEquipTypeMap = (Map)record.get("RateEquipType");
    Boolean RateEquipTypeFetch = DataHelper.getFetch(RateEquipTypeMap);
    Boolean RateEquipTypeSortDir = DataHelper.getSortDirection(RateEquipTypeMap);
    Integer RateEquipTypeSortOrder = DataHelper.getSortOrder(RateEquipTypeMap);
    if (RateEquipTypeFetch != null) out.setRateEquipTypeFetch(RateEquipTypeFetch);
    if (RateEquipTypeSortDir != null) out.setRateEquipTypeSortDirection(RateEquipTypeSortDir);
    if (RateEquipTypeSortOrder != null) out.setRateEquipTypeSortOrder(RateEquipTypeSortOrder);

    Filter[] RateEquipTypeFilter = DataHelper.mapToFilterArray(RateEquipTypeMap, Boolean.class);
    if (RateEquipTypeFilter != null) {
      BooleanFilter[] RateEquipTypeFilters = new BooleanFilter[RateEquipTypeFilter.length];
      for (int i = 0; i < RateEquipTypeFilters.length; i++) {
        RateEquipTypeFilters[i] = (BooleanFilter)RateEquipTypeFilter[i];
      }
      try {
        out.setRateEquipTypeFilter(RateEquipTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateEquipClassMap = (Map)record.get("RateEquipClass");
    Boolean RateEquipClassFetch = DataHelper.getFetch(RateEquipClassMap);
    Boolean RateEquipClassSortDir = DataHelper.getSortDirection(RateEquipClassMap);
    Integer RateEquipClassSortOrder = DataHelper.getSortOrder(RateEquipClassMap);
    if (RateEquipClassFetch != null) out.setRateEquipClassFetch(RateEquipClassFetch);
    if (RateEquipClassSortDir != null) out.setRateEquipClassSortDirection(RateEquipClassSortDir);
    if (RateEquipClassSortOrder != null) out.setRateEquipClassSortOrder(RateEquipClassSortOrder);

    Filter[] RateEquipClassFilter = DataHelper.mapToFilterArray(RateEquipClassMap, Boolean.class);
    if (RateEquipClassFilter != null) {
      BooleanFilter[] RateEquipClassFilters = new BooleanFilter[RateEquipClassFilter.length];
      for (int i = 0; i < RateEquipClassFilters.length; i++) {
        RateEquipClassFilters[i] = (BooleanFilter)RateEquipClassFilter[i];
      }
      try {
        out.setRateEquipClassFilter(RateEquipClassFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateClassOfServiceMap = (Map)record.get("RateClassOfService");
    Boolean RateClassOfServiceFetch = DataHelper.getFetch(RateClassOfServiceMap);
    Boolean RateClassOfServiceSortDir = DataHelper.getSortDirection(RateClassOfServiceMap);
    Integer RateClassOfServiceSortOrder = DataHelper.getSortOrder(RateClassOfServiceMap);
    if (RateClassOfServiceFetch != null) out.setRateClassOfServiceFetch(RateClassOfServiceFetch);
    if (RateClassOfServiceSortDir != null) out.setRateClassOfServiceSortDirection(RateClassOfServiceSortDir);
    if (RateClassOfServiceSortOrder != null) out.setRateClassOfServiceSortOrder(RateClassOfServiceSortOrder);

    Filter[] RateClassOfServiceFilter = DataHelper.mapToFilterArray(RateClassOfServiceMap, Boolean.class);
    if (RateClassOfServiceFilter != null) {
      BooleanFilter[] RateClassOfServiceFilters = new BooleanFilter[RateClassOfServiceFilter.length];
      for (int i = 0; i < RateClassOfServiceFilters.length; i++) {
        RateClassOfServiceFilters[i] = (BooleanFilter)RateClassOfServiceFilter[i];
      }
      try {
        out.setRateClassOfServiceFilter(RateClassOfServiceFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateComponentIdMap = (Map)record.get("RateComponentId");
    Boolean RateComponentIdFetch = DataHelper.getFetch(RateComponentIdMap);
    Boolean RateComponentIdSortDir = DataHelper.getSortDirection(RateComponentIdMap);
    Integer RateComponentIdSortOrder = DataHelper.getSortOrder(RateComponentIdMap);
    if (RateComponentIdFetch != null) out.setRateComponentIdFetch(RateComponentIdFetch);
    if (RateComponentIdSortDir != null) out.setRateComponentIdSortDirection(RateComponentIdSortDir);
    if (RateComponentIdSortOrder != null) out.setRateComponentIdSortOrder(RateComponentIdSortOrder);

    Filter[] RateComponentIdFilter = DataHelper.mapToFilterArray(RateComponentIdMap, Boolean.class);
    if (RateComponentIdFilter != null) {
      BooleanFilter[] RateComponentIdFilters = new BooleanFilter[RateComponentIdFilter.length];
      for (int i = 0; i < RateComponentIdFilters.length; i++) {
        RateComponentIdFilters[i] = (BooleanFilter)RateComponentIdFilter[i];
      }
      try {
        out.setRateComponentIdFilter(RateComponentIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateJurisdictionMap = (Map)record.get("RateJurisdiction");
    Boolean RateJurisdictionFetch = DataHelper.getFetch(RateJurisdictionMap);
    Boolean RateJurisdictionSortDir = DataHelper.getSortDirection(RateJurisdictionMap);
    Integer RateJurisdictionSortOrder = DataHelper.getSortOrder(RateJurisdictionMap);
    if (RateJurisdictionFetch != null) out.setRateJurisdictionFetch(RateJurisdictionFetch);
    if (RateJurisdictionSortDir != null) out.setRateJurisdictionSortDirection(RateJurisdictionSortDir);
    if (RateJurisdictionSortOrder != null) out.setRateJurisdictionSortOrder(RateJurisdictionSortOrder);

    Filter[] RateJurisdictionFilter = DataHelper.mapToFilterArray(RateJurisdictionMap, Boolean.class);
    if (RateJurisdictionFilter != null) {
      BooleanFilter[] RateJurisdictionFilters = new BooleanFilter[RateJurisdictionFilter.length];
      for (int i = 0; i < RateJurisdictionFilters.length; i++) {
        RateJurisdictionFilters[i] = (BooleanFilter)RateJurisdictionFilter[i];
      }
      try {
        out.setRateJurisdictionFilter(RateJurisdictionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateUnitsMap = (Map)record.get("RateUnits");
    Boolean RateUnitsFetch = DataHelper.getFetch(RateUnitsMap);
    Boolean RateUnitsSortDir = DataHelper.getSortDirection(RateUnitsMap);
    Integer RateUnitsSortOrder = DataHelper.getSortOrder(RateUnitsMap);
    if (RateUnitsFetch != null) out.setRateUnitsFetch(RateUnitsFetch);
    if (RateUnitsSortDir != null) out.setRateUnitsSortDirection(RateUnitsSortDir);
    if (RateUnitsSortOrder != null) out.setRateUnitsSortOrder(RateUnitsSortOrder);

    Filter[] RateUnitsFilter = DataHelper.mapToFilterArray(RateUnitsMap, Boolean.class);
    if (RateUnitsFilter != null) {
      BooleanFilter[] RateUnitsFilters = new BooleanFilter[RateUnitsFilter.length];
      for (int i = 0; i < RateUnitsFilters.length; i++) {
        RateUnitsFilters[i] = (BooleanFilter)RateUnitsFilter[i];
      }
      try {
        out.setRateUnitsFilter(RateUnitsFilters);
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
  
    Map RateCurrencyLocationMap = (Map)record.get("RateCurrencyLocation");
    Boolean RateCurrencyLocationFetch = DataHelper.getFetch(RateCurrencyLocationMap);
    Boolean RateCurrencyLocationSortDir = DataHelper.getSortDirection(RateCurrencyLocationMap);
    Integer RateCurrencyLocationSortOrder = DataHelper.getSortOrder(RateCurrencyLocationMap);
    if (RateCurrencyLocationFetch != null) out.setRateCurrencyLocationFetch(RateCurrencyLocationFetch);
    if (RateCurrencyLocationSortDir != null) out.setRateCurrencyLocationSortDirection(RateCurrencyLocationSortDir);
    if (RateCurrencyLocationSortOrder != null) out.setRateCurrencyLocationSortOrder(RateCurrencyLocationSortOrder);

    Filter[] RateCurrencyLocationFilter = DataHelper.mapToFilterArray(RateCurrencyLocationMap, Integer.class);
    if (RateCurrencyLocationFilter != null) {
      IntegerFilter[] RateCurrencyLocationFilters = new IntegerFilter[RateCurrencyLocationFilter.length];
      for (int i = 0; i < RateCurrencyLocationFilters.length; i++) {
        RateCurrencyLocationFilters[i] = (IntegerFilter)RateCurrencyLocationFilter[i];
      }
      try {
        out.setRateCurrencyLocationFilter(RateCurrencyLocationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillInArrearsMap = (Map)record.get("BillInArrears");
    Boolean BillInArrearsFetch = DataHelper.getFetch(BillInArrearsMap);
    Boolean BillInArrearsSortDir = DataHelper.getSortDirection(BillInArrearsMap);
    Integer BillInArrearsSortOrder = DataHelper.getSortOrder(BillInArrearsMap);
    if (BillInArrearsFetch != null) out.setBillInArrearsFetch(BillInArrearsFetch);
    if (BillInArrearsSortDir != null) out.setBillInArrearsSortDirection(BillInArrearsSortDir);
    if (BillInArrearsSortOrder != null) out.setBillInArrearsSortOrder(BillInArrearsSortOrder);

    Filter[] BillInArrearsFilter = DataHelper.mapToFilterArray(BillInArrearsMap, Boolean.class);
    if (BillInArrearsFilter != null) {
      BooleanFilter[] BillInArrearsFilters = new BooleanFilter[BillInArrearsFilter.length];
      for (int i = 0; i < BillInArrearsFilters.length; i++) {
        BillInArrearsFilters[i] = (BooleanFilter)BillInArrearsFilter[i];
      }
      try {
        out.setBillInArrearsFilter(BillInArrearsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitsTypeMap = (Map)record.get("UnitsType");
    Boolean UnitsTypeFetch = DataHelper.getFetch(UnitsTypeMap);
    Boolean UnitsTypeSortDir = DataHelper.getSortDirection(UnitsTypeMap);
    Integer UnitsTypeSortOrder = DataHelper.getSortOrder(UnitsTypeMap);
    if (UnitsTypeFetch != null) out.setUnitsTypeFetch(UnitsTypeFetch);
    if (UnitsTypeSortDir != null) out.setUnitsTypeSortDirection(UnitsTypeSortDir);
    if (UnitsTypeSortOrder != null) out.setUnitsTypeSortOrder(UnitsTypeSortOrder);

    Filter[] UnitsTypeFilter = DataHelper.mapToFilterArray(UnitsTypeMap, Integer.class);
    if (UnitsTypeFilter != null) {
      IntegerFilter[] UnitsTypeFilters = new IntegerFilter[UnitsTypeFilter.length];
      for (int i = 0; i < UnitsTypeFilters.length; i++) {
        UnitsTypeFilters[i] = (IntegerFilter)UnitsTypeFilter[i];
      }
      try {
        out.setUnitsTypeFilter(UnitsTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitsMap = (Map)record.get("Units");
    Boolean UnitsFetch = DataHelper.getFetch(UnitsMap);
    Boolean UnitsSortDir = DataHelper.getSortDirection(UnitsMap);
    Integer UnitsSortOrder = DataHelper.getSortOrder(UnitsMap);
    if (UnitsFetch != null) out.setUnitsFetch(UnitsFetch);
    if (UnitsSortDir != null) out.setUnitsSortDirection(UnitsSortDir);
    if (UnitsSortOrder != null) out.setUnitsSortOrder(UnitsSortOrder);

    Filter[] UnitsFilter = DataHelper.mapToFilterArray(UnitsMap, Integer.class);
    if (UnitsFilter != null) {
      IntegerFilter[] UnitsFilters = new IntegerFilter[UnitsFilter.length];
      for (int i = 0; i < UnitsFilters.length; i++) {
        UnitsFilters[i] = (IntegerFilter)UnitsFilter[i];
      }
      try {
        out.setUnitsFilter(UnitsFilters);
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
  
    return out;
  }
}
