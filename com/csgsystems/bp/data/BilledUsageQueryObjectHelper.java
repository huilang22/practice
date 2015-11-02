/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BilledUsageQueryObjectHelper.java
 * Definition File: Customer/BilledUsage.xml
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


/** Helper class to convert BilledUsageQueryObject JavaBean objects to/from HashMaps.
 */
public class BilledUsageQueryObjectHelper implements ArubaObjectHelper
{
  /** convert BilledUsageQueryObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BilledUsageQueryObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BilledUsageQueryObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BilledUsageQueryObject")
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageQueryObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BilledUsageQueryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = BilledUsageObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert BilledUsageQueryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageQueryObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BilledUsageQueryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BilledUsageQueryObject")
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageQueryObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BilledUsageQueryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = BilledUsageObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BilledUsageQueryObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BilledUsageQueryObjectData the converted object
   */
  public static BilledUsageQueryObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BilledUsageQueryObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BilledUsageQueryObject")
   * @return BilledUsageQueryObjectData the converted object
   */
  public static BilledUsageQueryObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BilledUsageQueryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BilledUsageQueryObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BilledUsageQueryObjectFilter the converted object
   */
  public static BilledUsageQueryObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BilledUsageQueryObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BilledUsageQueryObject")
   * @return BilledUsageQueryObjectFilter the converted object
   */
  public static BilledUsageQueryObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BilledUsageQueryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BilledUsageQueryObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BilledUsageQueryObjectDataList the converted object
   */
  public static BilledUsageQueryObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BilledUsageQueryObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BilledUsageQueryObjectList")
   * @return BilledUsageQueryObjectDataList the converted object
   */
  public static BilledUsageQueryObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BilledUsageQueryObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BilledUsageQueryObjectData[] array = null;
    if (root != null)
    {
      array = new BilledUsageQueryObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BilledUsageQueryObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BilledUsageQueryObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BilledUsageQueryObjectDataList (array, index, total);
  }
  /** convert BilledUsageQueryObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BilledUsageQueryObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ApiQueryNameSet) record.put ("ApiQueryName", in.ApiQueryName);
  
    if (in._LatestInvoiceSet) record.put ("LatestInvoice", in.LatestInvoice);
  
    if (in._HierarchyIdSet) record.put ("HierarchyId", in.HierarchyId);
  
    if (in._BillCitySet) record.put ("BillCity", in.BillCity);
  
    if (in._BillStateSet) record.put ("BillState", in.BillState);
  
    if (in._BillCountryCodeSet) record.put ("BillCountryCode", in.BillCountryCode);
  
    if (in._BillZipSet) record.put ("BillZip", in.BillZip);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._EmfConfigIdSet) record.put ("EmfConfigId", in.EmfConfigId);
      return record;
  }
  /** convert BilledUsageQueryObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BilledUsageQueryObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ApiQueryName, in.ApiQueryNameSort, in.ApiQueryNameSortAscending, in.ApiQueryNameFetch, in.ApiQueryNameCaseInsensitive); 
      if (map != null) record.put ("ApiQueryName", map);
      map = DataHelper.filterToMap (in.LatestInvoice, in.LatestInvoiceSort, in.LatestInvoiceSortAscending, in.LatestInvoiceFetch); 
      if (map != null) record.put ("LatestInvoice", map);
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
      map = DataHelper.filterToMap (in.EmfConfigId, in.EmfConfigIdSort, in.EmfConfigIdSortAscending, in.EmfConfigIdFetch);
      if (map != null) record.put ("EmfConfigId", map);
    return record;
  }
  /** convert Map to BilledUsageQueryObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BilledUsageQueryObjectData the converted object
   */
  public static BilledUsageQueryObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BilledUsageQueryObjectData out = new BilledUsageQueryObjectData (BilledUsageObjectHelper.getObj (record));

    if ((obj = record.get ("ApiQueryName")) != null)
    {
      out.ApiQueryName = (String) obj;
    }
  
    if ((obj = record.get ("LatestInvoice")) != null)
    {
      out.LatestInvoice = (Boolean) obj;
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
  
    if ((obj = record.get ("EmfConfigId")) != null)
    {
      out.EmfConfigId = (Integer) obj;
    }
      return out;
  }
  /** convert Map to BilledUsageQueryObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BilledUsageQueryObjectFilter the converted object
   */
  public static BilledUsageQueryObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BilledUsageQueryObjectFilter out = new BilledUsageQueryObjectFilter (BilledUsageObjectHelper.getFilter (record));
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
