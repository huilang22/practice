/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PRRServiceDataObjectHelper.java
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



/** Helper class to convert PRRServiceDataObject JavaBean objects to/from HashMaps.
 */
public class PRRServiceDataObjectHelper implements ArubaObjectHelper
{
  /** convert PRRServiceDataObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PRRServiceDataObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PRRServiceDataObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PRRServiceDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (PRRServiceDataObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PRRServiceDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PRRServiceDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PRRServiceDataObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PRRServiceDataObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PRRServiceDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (PRRServiceDataObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PRRServiceDataObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PRRServiceDataObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PRRServiceDataObjectData the converted object
   */
  public static PRRServiceDataObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PRRServiceDataObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PRRServiceDataObject")
   * @return PRRServiceDataObjectData the converted object
   */
  public static PRRServiceDataObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PRRServiceDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PRRServiceDataObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PRRServiceDataObjectFilter the converted object
   */
  public static PRRServiceDataObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PRRServiceDataObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PRRServiceDataObject")
   * @return PRRServiceDataObjectFilter the converted object
   */
  public static PRRServiceDataObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PRRServiceDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PRRServiceDataObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PRRServiceDataObjectDataList the converted object
   */
  public static PRRServiceDataObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PRRServiceDataObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PRRServiceDataObjectList")
   * @return PRRServiceDataObjectDataList the converted object
   */
  public static PRRServiceDataObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PRRServiceDataObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PRRServiceDataObjectData[] array = null;
    if (root != null)
    {
      array = new PRRServiceDataObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PRRServiceDataObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PRRServiceDataObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PRRServiceDataObjectDataList (array, index, total);
  }
  /** convert PRRServiceDataObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PRRServiceDataObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ServiceExternalIdSet) record.put ("ServiceExternalId", in.ServiceExternalId);
  
    if (in._ServiceExternalIdTypeSet) record.put ("ServiceExternalIdType", in.ServiceExternalIdType);
  
    if (in._RateClassSet) record.put ("RateClass", in.RateClass);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._EquipTypeCodeSet) record.put ("EquipTypeCode", in.EquipTypeCode);
  
    if (in._EquipClassCodeSet) record.put ("EquipClassCode", in.EquipClassCode);
  
    if (in._ClassOfServiceCodeSet) record.put ("ClassOfServiceCode", in.ClassOfServiceCode);
  
    if (in._PopUnitsSet) record.put ("PopUnits", in.PopUnits);
      return record;
  }
  /** convert PRRServiceDataObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PRRServiceDataObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ServiceExternalId, in.ServiceExternalIdSort, in.ServiceExternalIdSortAscending, in.ServiceExternalIdFetch, in.ServiceExternalIdCaseInsensitive);
      if (map != null) record.put ("ServiceExternalId", map);
      map = DataHelper.filterToMap (in.ServiceExternalIdType, in.ServiceExternalIdTypeSort, in.ServiceExternalIdTypeSortAscending, in.ServiceExternalIdTypeFetch);
      if (map != null) record.put ("ServiceExternalIdType", map);
      map = DataHelper.filterToMap (in.RateClass, in.RateClassSort, in.RateClassSortAscending, in.RateClassFetch);
      if (map != null) record.put ("RateClass", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.EquipTypeCode, in.EquipTypeCodeSort, in.EquipTypeCodeSortAscending, in.EquipTypeCodeFetch);
      if (map != null) record.put ("EquipTypeCode", map);
      map = DataHelper.filterToMap (in.EquipClassCode, in.EquipClassCodeSort, in.EquipClassCodeSortAscending, in.EquipClassCodeFetch);
      if (map != null) record.put ("EquipClassCode", map);
      map = DataHelper.filterToMap (in.ClassOfServiceCode, in.ClassOfServiceCodeSort, in.ClassOfServiceCodeSortAscending, in.ClassOfServiceCodeFetch);
      if (map != null) record.put ("ClassOfServiceCode", map);
      map = DataHelper.filterToMap (in.PopUnits, in.PopUnitsSort, in.PopUnitsSortAscending, in.PopUnitsFetch);
      if (map != null) record.put ("PopUnits", map);
    return record;
  }
  /** convert Map to PRRServiceDataObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PRRServiceDataObjectData the converted object
   */
  public static PRRServiceDataObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PRRServiceDataObjectData out = new PRRServiceDataObjectData ();

    if ((obj = record.get ("ServiceExternalId")) != null)
    {
      out.ServiceExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ServiceExternalIdType")) != null)
    {
      out.ServiceExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("RateClass")) != null)
    {
      out.RateClass = (Integer) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
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
  
    if ((obj = record.get ("PopUnits")) != null)
    {
      out.PopUnits = (Integer) obj;
    }
      return out;
  }
  /** convert Map to PRRServiceDataObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PRRServiceDataObjectFilter the converted object
   */
  public static PRRServiceDataObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PRRServiceDataObjectFilter out = new PRRServiceDataObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map ServiceExternalIdMap = (Map)record.get("ServiceExternalId");
    Boolean ServiceExternalIdFetch = DataHelper.getFetch(ServiceExternalIdMap);
    Boolean ServiceExternalIdSortDir = DataHelper.getSortDirection(ServiceExternalIdMap);
    Integer ServiceExternalIdSortOrder = DataHelper.getSortOrder(ServiceExternalIdMap);
    if (ServiceExternalIdFetch != null) out.setServiceExternalIdFetch(ServiceExternalIdFetch);
    if (ServiceExternalIdSortDir != null) out.setServiceExternalIdSortDirection(ServiceExternalIdSortDir);
    if (ServiceExternalIdSortOrder != null) out.setServiceExternalIdSortOrder(ServiceExternalIdSortOrder);

    Filter[] ServiceExternalIdFilter = DataHelper.mapToFilterArray(ServiceExternalIdMap, String.class);
    if (ServiceExternalIdFilter != null) {
      StringFilter[] ServiceExternalIdFilters = new StringFilter[ServiceExternalIdFilter.length];
      for (int i = 0; i < ServiceExternalIdFilters.length; i++) {
        ServiceExternalIdFilters[i] = (StringFilter)ServiceExternalIdFilter[i];
      }
      try {
        out.setServiceExternalIdFilter(ServiceExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceExternalIdTypeMap = (Map)record.get("ServiceExternalIdType");
    Boolean ServiceExternalIdTypeFetch = DataHelper.getFetch(ServiceExternalIdTypeMap);
    Boolean ServiceExternalIdTypeSortDir = DataHelper.getSortDirection(ServiceExternalIdTypeMap);
    Integer ServiceExternalIdTypeSortOrder = DataHelper.getSortOrder(ServiceExternalIdTypeMap);
    if (ServiceExternalIdTypeFetch != null) out.setServiceExternalIdTypeFetch(ServiceExternalIdTypeFetch);
    if (ServiceExternalIdTypeSortDir != null) out.setServiceExternalIdTypeSortDirection(ServiceExternalIdTypeSortDir);
    if (ServiceExternalIdTypeSortOrder != null) out.setServiceExternalIdTypeSortOrder(ServiceExternalIdTypeSortOrder);

    Filter[] ServiceExternalIdTypeFilter = DataHelper.mapToFilterArray(ServiceExternalIdTypeMap, Integer.class);
    if (ServiceExternalIdTypeFilter != null) {
      IntegerFilter[] ServiceExternalIdTypeFilters = new IntegerFilter[ServiceExternalIdTypeFilter.length];
      for (int i = 0; i < ServiceExternalIdTypeFilters.length; i++) {
        ServiceExternalIdTypeFilters[i] = (IntegerFilter)ServiceExternalIdTypeFilter[i];
      }
      try {
        out.setServiceExternalIdTypeFilter(ServiceExternalIdTypeFilters);
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
  
    Map PopUnitsMap = (Map)record.get("PopUnits");
    Boolean PopUnitsFetch = DataHelper.getFetch(PopUnitsMap);
    Boolean PopUnitsSortDir = DataHelper.getSortDirection(PopUnitsMap);
    Integer PopUnitsSortOrder = DataHelper.getSortOrder(PopUnitsMap);
    if (PopUnitsFetch != null) out.setPopUnitsFetch(PopUnitsFetch);
    if (PopUnitsSortDir != null) out.setPopUnitsSortDirection(PopUnitsSortDir);
    if (PopUnitsSortOrder != null) out.setPopUnitsSortOrder(PopUnitsSortOrder);

    Filter[] PopUnitsFilter = DataHelper.mapToFilterArray(PopUnitsMap, Integer.class);
    if (PopUnitsFilter != null) {
      IntegerFilter[] PopUnitsFilters = new IntegerFilter[PopUnitsFilter.length];
      for (int i = 0; i < PopUnitsFilters.length; i++) {
        PopUnitsFilters[i] = (IntegerFilter)PopUnitsFilter[i];
      }
      try {
        out.setPopUnitsFilter(PopUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
