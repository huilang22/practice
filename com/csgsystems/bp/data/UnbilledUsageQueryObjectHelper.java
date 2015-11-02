/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageQueryObjectHelper.java
 * Definition File: Customer/UnbilledUsage.xml
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

import com.csgsystems.bp.data.*;


/** Helper class to convert UnbilledUsageQueryObject JavaBean objects to/from HashMaps.
 */
public class UnbilledUsageQueryObjectHelper implements ArubaObjectHelper
{
  /** convert UnbilledUsageQueryObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (UnbilledUsageQueryObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageQueryObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageQueryObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageQueryObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageQueryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = UnbilledUsageObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert UnbilledUsageQueryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageQueryObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageQueryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageQueryObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageQueryObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageQueryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = UnbilledUsageObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to UnbilledUsageQueryObjectData.
   * @param record the Map containing the data to convert to the object
   * @return UnbilledUsageQueryObjectData the converted object
   */
  public static UnbilledUsageQueryObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to UnbilledUsageQueryObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "UnbilledUsageQueryObject")
   * @return UnbilledUsageQueryObjectData the converted object
   */
  public static UnbilledUsageQueryObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageQueryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to UnbilledUsageQueryObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return UnbilledUsageQueryObjectFilter the converted object
   */
  public static UnbilledUsageQueryObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to UnbilledUsageQueryObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "UnbilledUsageQueryObject")
   * @return UnbilledUsageQueryObjectFilter the converted object
   */
  public static UnbilledUsageQueryObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageQueryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to UnbilledUsageQueryObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return UnbilledUsageQueryObjectDataList the converted object
   */
  public static UnbilledUsageQueryObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to UnbilledUsageQueryObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "UnbilledUsageQueryObjectList")
   * @return UnbilledUsageQueryObjectDataList the converted object
   */
  public static UnbilledUsageQueryObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageQueryObjectList";
    Object[] root = (Object[]) record.get (rootName);
    UnbilledUsageQueryObjectData[] array = null;
    if (root != null)
    {
      array = new UnbilledUsageQueryObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = UnbilledUsageQueryObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new UnbilledUsageQueryObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new UnbilledUsageQueryObjectDataList (array, index, total);
  }
  /** convert UnbilledUsageQueryObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnbilledUsageQueryObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ApiQueryNameSet) record.put ("ApiQueryName", in.ApiQueryName);
  
    if (in._HierarchyIdSet) record.put ("HierarchyId", in.HierarchyId);
  
    if (in._BillCitySet) record.put ("BillCity", in.BillCity);
  
    if (in._BillStateSet) record.put ("BillState", in.BillState);
  
    if (in._BillCountryCodeSet) record.put ("BillCountryCode", in.BillCountryCode);
  
    if (in._BillZipSet) record.put ("BillZip", in.BillZip);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    if (in._EmfConfigIdSet) record.put ("EmfConfigId", in.EmfConfigId);
      return record;
  }
  /** convert UnbilledUsageQueryObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnbilledUsageQueryObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ApiQueryName, in.ApiQueryNameSort, in.ApiQueryNameSortAscending, in.ApiQueryNameFetch, in.ApiQueryNameCaseInsensitive); 
      if (map != null) record.put ("ApiQueryName", map);
      map = DataHelper.filterToMap (in.HierarchyId, in.HierarchyIdSort, in.HierarchyIdSortAscending, in.HierarchyIdFetch);
      if (map != null) record.put ("HierarchyId", map);
      map = DataHelper.filterToMap (in.BillCity, in.BillCitySort, in.BillCitySortAscending, in.BillCityFetch, in.BillCityCaseInsensitive);
      if (map != null) record.put ("BillCity", map);
      map = DataHelper.filterToMap (in.BillState, in.BillStateSort, in.BillStateSortAscending, in.BillStateFetch, in.BillStateCaseInsensitive);
      if (map != null) record.put ("BillState", map);
      map = DataHelper.filterToMap (in.BillCountryCode, in.BillCountryCodeSort, in.BillCountryCodeSortAscending, in.BillCountryCodeFetch);
      if (map != null) record.put ("BillCountryCode", map);
      map = DataHelper.filterToMap (in.BillZip, in.BillZipSort, in.BillZipSortAscending, in.BillZipFetch, in.BillZipCaseInsensitive);
      if (map != null) record.put ("BillZip", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
      map = DataHelper.filterToMap (in.EmfConfigId, in.EmfConfigIdSort, in.EmfConfigIdSortAscending, in.EmfConfigIdFetch);
      if (map != null) record.put ("EmfConfigId", map);
    return record;
  }
  /** convert Map to UnbilledUsageQueryObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageQueryObjectData the converted object
   */
  public static UnbilledUsageQueryObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageQueryObjectData out = new UnbilledUsageQueryObjectData (UnbilledUsageObjectHelper.getObj (record));

    if ((obj = record.get ("ApiQueryName")) != null)
    {
      out.ApiQueryName = (String) obj;
    }
  
    if ((obj = record.get ("HierarchyId")) != null)
    {
      out.HierarchyId = (Integer) obj;
    }
  
    if ((obj = record.get ("BillCity")) != null)
    {
      out.BillCity = (String) obj;
    }
  
    if ((obj = record.get ("BillState")) != null)
    {
      out.BillState = (String) obj;
    }
  
    if ((obj = record.get ("BillCountryCode")) != null)
    {
      out.BillCountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("BillZip")) != null)
    {
      out.BillZip = (String) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
    }
  
    if ((obj = record.get ("EmfConfigId")) != null)
    {
      out.EmfConfigId = (Integer) obj;
    }
      return out;
  }
  /** convert Map to UnbilledUsageQueryObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageQueryObjectFilter the converted object
   */
  public static UnbilledUsageQueryObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageQueryObjectFilter out = new UnbilledUsageQueryObjectFilter (UnbilledUsageObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map HierarchyIdMap = (Map)record.get("HierarchyId");
    Boolean HierarchyIdFetch = DataHelper.getFetch(HierarchyIdMap);
    Boolean HierarchyIdSortDir = DataHelper.getSortDirection(HierarchyIdMap);
    Integer HierarchyIdSortOrder = DataHelper.getSortOrder(HierarchyIdMap);
    if (HierarchyIdFetch != null) out.setHierarchyIdFetch(HierarchyIdFetch);
    if (HierarchyIdSortDir != null) out.setHierarchyIdSortDirection(HierarchyIdSortDir);
    if (HierarchyIdSortOrder != null) out.setHierarchyIdSortOrder(HierarchyIdSortOrder);

    Filter[] HierarchyIdFilter = DataHelper.mapToFilterArray(HierarchyIdMap, Integer.class);
    if (HierarchyIdFilter != null) {
      IntegerFilter[] HierarchyIdFilters = new IntegerFilter[HierarchyIdFilter.length];
      for (int i = 0; i < HierarchyIdFilters.length; i++) {
        HierarchyIdFilters[i] = (IntegerFilter)HierarchyIdFilter[i];
      }
      try {
        out.setHierarchyIdFilter(HierarchyIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCityMap = (Map)record.get("BillCity");
    Boolean BillCityFetch = DataHelper.getFetch(BillCityMap);
    Boolean BillCitySortDir = DataHelper.getSortDirection(BillCityMap);
    Integer BillCitySortOrder = DataHelper.getSortOrder(BillCityMap);
    if (BillCityFetch != null) out.setBillCityFetch(BillCityFetch);
    if (BillCitySortDir != null) out.setBillCitySortDirection(BillCitySortDir);
    if (BillCitySortOrder != null) out.setBillCitySortOrder(BillCitySortOrder);

    Filter[] BillCityFilter = DataHelper.mapToFilterArray(BillCityMap, String.class);
    if (BillCityFilter != null) {
      StringFilter[] BillCityFilters = new StringFilter[BillCityFilter.length];
      for (int i = 0; i < BillCityFilters.length; i++) {
        BillCityFilters[i] = (StringFilter)BillCityFilter[i];
      }
      try {
        out.setBillCityFilter(BillCityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillStateMap = (Map)record.get("BillState");
    Boolean BillStateFetch = DataHelper.getFetch(BillStateMap);
    Boolean BillStateSortDir = DataHelper.getSortDirection(BillStateMap);
    Integer BillStateSortOrder = DataHelper.getSortOrder(BillStateMap);
    if (BillStateFetch != null) out.setBillStateFetch(BillStateFetch);
    if (BillStateSortDir != null) out.setBillStateSortDirection(BillStateSortDir);
    if (BillStateSortOrder != null) out.setBillStateSortOrder(BillStateSortOrder);

    Filter[] BillStateFilter = DataHelper.mapToFilterArray(BillStateMap, String.class);
    if (BillStateFilter != null) {
      StringFilter[] BillStateFilters = new StringFilter[BillStateFilter.length];
      for (int i = 0; i < BillStateFilters.length; i++) {
        BillStateFilters[i] = (StringFilter)BillStateFilter[i];
      }
      try {
        out.setBillStateFilter(BillStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCountryCodeMap = (Map)record.get("BillCountryCode");
    Boolean BillCountryCodeFetch = DataHelper.getFetch(BillCountryCodeMap);
    Boolean BillCountryCodeSortDir = DataHelper.getSortDirection(BillCountryCodeMap);
    Integer BillCountryCodeSortOrder = DataHelper.getSortOrder(BillCountryCodeMap);
    if (BillCountryCodeFetch != null) out.setBillCountryCodeFetch(BillCountryCodeFetch);
    if (BillCountryCodeSortDir != null) out.setBillCountryCodeSortDirection(BillCountryCodeSortDir);
    if (BillCountryCodeSortOrder != null) out.setBillCountryCodeSortOrder(BillCountryCodeSortOrder);

    Filter[] BillCountryCodeFilter = DataHelper.mapToFilterArray(BillCountryCodeMap, Integer.class);
    if (BillCountryCodeFilter != null) {
      IntegerFilter[] BillCountryCodeFilters = new IntegerFilter[BillCountryCodeFilter.length];
      for (int i = 0; i < BillCountryCodeFilters.length; i++) {
        BillCountryCodeFilters[i] = (IntegerFilter)BillCountryCodeFilter[i];
      }
      try {
        out.setBillCountryCodeFilter(BillCountryCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillZipMap = (Map)record.get("BillZip");
    Boolean BillZipFetch = DataHelper.getFetch(BillZipMap);
    Boolean BillZipSortDir = DataHelper.getSortDirection(BillZipMap);
    Integer BillZipSortOrder = DataHelper.getSortOrder(BillZipMap);
    if (BillZipFetch != null) out.setBillZipFetch(BillZipFetch);
    if (BillZipSortDir != null) out.setBillZipSortDirection(BillZipSortDir);
    if (BillZipSortOrder != null) out.setBillZipSortOrder(BillZipSortOrder);

    Filter[] BillZipFilter = DataHelper.mapToFilterArray(BillZipMap, String.class);
    if (BillZipFilter != null) {
      StringFilter[] BillZipFilters = new StringFilter[BillZipFilter.length];
      for (int i = 0; i < BillZipFilters.length; i++) {
        BillZipFilters[i] = (StringFilter)BillZipFilter[i];
      }
      try {
        out.setBillZipFilter(BillZipFilters);
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
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, Integer.class);
    if (LanguageCodeFilter != null) {
      IntegerFilter[] LanguageCodeFilters = new IntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (IntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EmfConfigIdMap = (Map)record.get("EmfConfigId");
    Boolean EmfConfigIdFetch = DataHelper.getFetch(EmfConfigIdMap);
    Boolean EmfConfigIdSortDir = DataHelper.getSortDirection(EmfConfigIdMap);
    Integer EmfConfigIdSortOrder = DataHelper.getSortOrder(EmfConfigIdMap);
    if (EmfConfigIdFetch != null) out.setEmfConfigIdFetch(EmfConfigIdFetch);
    if (EmfConfigIdSortDir != null) out.setEmfConfigIdSortDirection(EmfConfigIdSortDir);
    if (EmfConfigIdSortOrder != null) out.setEmfConfigIdSortOrder(EmfConfigIdSortOrder);

    Filter[] EmfConfigIdFilter = DataHelper.mapToFilterArray(EmfConfigIdMap, Integer.class);
    if (EmfConfigIdFilter != null) {
      IntegerFilter[] EmfConfigIdFilters = new IntegerFilter[EmfConfigIdFilter.length];
      for (int i = 0; i < EmfConfigIdFilters.length; i++) {
        EmfConfigIdFilters[i] = (IntegerFilter)EmfConfigIdFilter[i];
      }
      try {
        out.setEmfConfigIdFilter(EmfConfigIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
