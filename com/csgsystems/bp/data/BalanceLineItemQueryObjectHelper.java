/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BalanceLineItemQueryObjectHelper.java
 * Definition File: Customer/BalanceLineItem.xml
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



/** Helper class to convert BalanceLineItemQueryObject JavaBean objects to/from HashMaps.
 */
public class BalanceLineItemQueryObjectHelper implements ArubaObjectHelper
{
  /** convert BalanceLineItemQueryObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BalanceLineItemQueryObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BalanceLineItemQueryObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BalanceLineItemQueryObject")
   * @return Map     the output Map
   */
  public static Map toMap (BalanceLineItemQueryObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BalanceLineItemQueryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = BalanceLineItemObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert BalanceLineItemQueryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BalanceLineItemQueryObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BalanceLineItemQueryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BalanceLineItemQueryObject")
   * @return Map     the output Map
   */
  public static Map toMap (BalanceLineItemQueryObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BalanceLineItemQueryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = BalanceLineItemObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BalanceLineItemQueryObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BalanceLineItemQueryObjectData the converted object
   */
  public static BalanceLineItemQueryObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BalanceLineItemQueryObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BalanceLineItemQueryObject")
   * @return BalanceLineItemQueryObjectData the converted object
   */
  public static BalanceLineItemQueryObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BalanceLineItemQueryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BalanceLineItemQueryObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BalanceLineItemQueryObjectFilter the converted object
   */
  public static BalanceLineItemQueryObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BalanceLineItemQueryObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BalanceLineItemQueryObject")
   * @return BalanceLineItemQueryObjectFilter the converted object
   */
  public static BalanceLineItemQueryObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BalanceLineItemQueryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BalanceLineItemQueryObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BalanceLineItemQueryObjectDataList the converted object
   */
  public static BalanceLineItemQueryObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BalanceLineItemQueryObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BalanceLineItemQueryObjectList")
   * @return BalanceLineItemQueryObjectDataList the converted object
   */
  public static BalanceLineItemQueryObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BalanceLineItemQueryObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BalanceLineItemQueryObjectData[] array = null;
    if (root != null)
    {
      array = new BalanceLineItemQueryObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BalanceLineItemQueryObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BalanceLineItemQueryObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BalanceLineItemQueryObjectDataList (array, index, total);
  }
  /** convert BalanceLineItemQueryObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BalanceLineItemQueryObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ApiQueryNameSet) record.put ("ApiQueryName", in.ApiQueryName);
  
    if (in._LatestInvoiceSet) record.put ("LatestInvoice", in.LatestInvoice);
  
    if (in._BillLnameSet) record.put ("BillLname", in.BillLname);
  
    if (in._BillFnameSet) record.put ("BillFname", in.BillFname);
  
    if (in._BillCompanySet) record.put ("BillCompany", in.BillCompany);
  
    if (in._HierarchyIdSet) record.put ("HierarchyId", in.HierarchyId);
  
    if (in._BillCitySet) record.put ("BillCity", in.BillCity);
  
    if (in._BillStateSet) record.put ("BillState", in.BillState);
  
    if (in._BillCountryCodeSet) record.put ("BillCountryCode", in.BillCountryCode);
  
    if (in._BillZipSet) record.put ("BillZip", in.BillZip);
      return record;
  }
  /** convert BalanceLineItemQueryObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BalanceLineItemQueryObjectFilter in, Map record)
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
      map = DataHelper.filterToMap (in.BillLname, in.BillLnameSort, in.BillLnameSortAscending, in.BillLnameFetch, in.BillLnameCaseInsensitive);
      if (map != null) record.put ("BillLname", map);
      map = DataHelper.filterToMap (in.BillFname, in.BillFnameSort, in.BillFnameSortAscending, in.BillFnameFetch, in.BillFnameCaseInsensitive);
      if (map != null) record.put ("BillFname", map);
      map = DataHelper.filterToMap (in.BillCompany, in.BillCompanySort, in.BillCompanySortAscending, in.BillCompanyFetch, in.BillCompanyCaseInsensitive);
      if (map != null) record.put ("BillCompany", map);
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
    return record;
  }
  /** convert Map to BalanceLineItemQueryObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BalanceLineItemQueryObjectData the converted object
   */
  public static BalanceLineItemQueryObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BalanceLineItemQueryObjectData out = new BalanceLineItemQueryObjectData (BalanceLineItemObjectHelper.getObj (record));

    if ((obj = record.get ("ApiQueryName")) != null)
    {
      out.ApiQueryName = (String) obj;
    }
  
    if ((obj = record.get ("LatestInvoice")) != null)
    {
      out.LatestInvoice = (Boolean) obj;
    }
  
    if ((obj = record.get ("BillLname")) != null)
    {
      out.BillLname = (String) obj;
    }
  
    if ((obj = record.get ("BillFname")) != null)
    {
      out.BillFname = (String) obj;
    }
  
    if ((obj = record.get ("BillCompany")) != null)
    {
      out.BillCompany = (String) obj;
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
      return out;
  }
  /** convert Map to BalanceLineItemQueryObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BalanceLineItemQueryObjectFilter the converted object
   */
  public static BalanceLineItemQueryObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BalanceLineItemQueryObjectFilter out = new BalanceLineItemQueryObjectFilter (BalanceLineItemObjectHelper.getFilter (record));
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map BillLnameMap = (Map)record.get("BillLname");
    Boolean BillLnameFetch = DataHelper.getFetch(BillLnameMap);
    Boolean BillLnameSortDir = DataHelper.getSortDirection(BillLnameMap);
    Integer BillLnameSortOrder = DataHelper.getSortOrder(BillLnameMap);
    if (BillLnameFetch != null) out.setBillLnameFetch(BillLnameFetch);
    if (BillLnameSortDir != null) out.setBillLnameSortDirection(BillLnameSortDir);
    if (BillLnameSortOrder != null) out.setBillLnameSortOrder(BillLnameSortOrder);

    Filter[] BillLnameFilter = DataHelper.mapToFilterArray(BillLnameMap, String.class);
    if (BillLnameFilter != null) {
      StringFilter[] BillLnameFilters = new StringFilter[BillLnameFilter.length];
      for (int i = 0; i < BillLnameFilters.length; i++) {
        BillLnameFilters[i] = (StringFilter)BillLnameFilter[i];
      }
      try {
        out.setBillLnameFilter(BillLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillFnameMap = (Map)record.get("BillFname");
    Boolean BillFnameFetch = DataHelper.getFetch(BillFnameMap);
    Boolean BillFnameSortDir = DataHelper.getSortDirection(BillFnameMap);
    Integer BillFnameSortOrder = DataHelper.getSortOrder(BillFnameMap);
    if (BillFnameFetch != null) out.setBillFnameFetch(BillFnameFetch);
    if (BillFnameSortDir != null) out.setBillFnameSortDirection(BillFnameSortDir);
    if (BillFnameSortOrder != null) out.setBillFnameSortOrder(BillFnameSortOrder);

    Filter[] BillFnameFilter = DataHelper.mapToFilterArray(BillFnameMap, String.class);
    if (BillFnameFilter != null) {
      StringFilter[] BillFnameFilters = new StringFilter[BillFnameFilter.length];
      for (int i = 0; i < BillFnameFilters.length; i++) {
        BillFnameFilters[i] = (StringFilter)BillFnameFilter[i];
      }
      try {
        out.setBillFnameFilter(BillFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCompanyMap = (Map)record.get("BillCompany");
    Boolean BillCompanyFetch = DataHelper.getFetch(BillCompanyMap);
    Boolean BillCompanySortDir = DataHelper.getSortDirection(BillCompanyMap);
    Integer BillCompanySortOrder = DataHelper.getSortOrder(BillCompanyMap);
    if (BillCompanyFetch != null) out.setBillCompanyFetch(BillCompanyFetch);
    if (BillCompanySortDir != null) out.setBillCompanySortDirection(BillCompanySortDir);
    if (BillCompanySortOrder != null) out.setBillCompanySortOrder(BillCompanySortOrder);

    Filter[] BillCompanyFilter = DataHelper.mapToFilterArray(BillCompanyMap, String.class);
    if (BillCompanyFilter != null) {
      StringFilter[] BillCompanyFilters = new StringFilter[BillCompanyFilter.length];
      for (int i = 0; i < BillCompanyFilters.length; i++) {
        BillCompanyFilters[i] = (StringFilter)BillCompanyFilter[i];
      }
      try {
        out.setBillCompanyFilter(BillCompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    return out;
  }
}
