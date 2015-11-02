/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceDetailQueryObjectHelper.java
 * Definition File: Customer/InvoiceDetail.xml
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


/** Helper class to convert InvoiceDetailQueryObject JavaBean objects to/from HashMaps.
 */
public class InvoiceDetailQueryObjectHelper implements ArubaObjectHelper
{
  /** convert InvoiceDetailQueryObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (InvoiceDetailQueryObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceDetailQueryObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceDetailQueryObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceDetailQueryObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceDetailQueryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = InvoiceDetailObjectHelper.getMap (in, map);
    record.put (rootName, map);
    return record;
  }
  /** convert InvoiceDetailQueryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceDetailQueryObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceDetailQueryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceDetailQueryObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceDetailQueryObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceDetailQueryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    map = InvoiceDetailObjectHelper.getMap (in, map);
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to InvoiceDetailQueryObjectData.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceDetailQueryObjectData the converted object
   */
  public static InvoiceDetailQueryObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to InvoiceDetailQueryObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "InvoiceDetailQueryObject")
   * @return InvoiceDetailQueryObjectData the converted object
   */
  public static InvoiceDetailQueryObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceDetailQueryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to InvoiceDetailQueryObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceDetailQueryObjectFilter the converted object
   */
  public static InvoiceDetailQueryObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to InvoiceDetailQueryObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "InvoiceDetailQueryObject")
   * @return InvoiceDetailQueryObjectFilter the converted object
   */
  public static InvoiceDetailQueryObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceDetailQueryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to InvoiceDetailQueryObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return InvoiceDetailQueryObjectDataList the converted object
   */
  public static InvoiceDetailQueryObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to InvoiceDetailQueryObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "InvoiceDetailQueryObjectList")
   * @return InvoiceDetailQueryObjectDataList the converted object
   */
  public static InvoiceDetailQueryObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceDetailQueryObjectList";
    Object[] root = (Object[]) record.get (rootName);
    InvoiceDetailQueryObjectData[] array = null;
    if (root != null)
    {
      array = new InvoiceDetailQueryObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = InvoiceDetailQueryObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new InvoiceDetailQueryObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new InvoiceDetailQueryObjectDataList (array, index, total);
  }
  /** convert InvoiceDetailQueryObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceDetailQueryObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ApiQueryNameSet) record.put ("ApiQueryName", in.ApiQueryName);
  
    if (in._LatestInvoiceSet) record.put ("LatestInvoice", in.LatestInvoice);
  
    if (in._ShowZeroRatedChargesSet) record.put ("ShowZeroRatedCharges", in.ShowZeroRatedCharges);
  
    if (in._BPCurrencyAttributeSet) record.put ("BPCurrencyAttribute", in.BPCurrencyAttribute);
  
    if (in._HierarchyIdSet) record.put ("HierarchyId", in.HierarchyId);
  
    if (in._BillCitySet) record.put ("BillCity", in.BillCity);
  
    if (in._BillStateSet) record.put ("BillState", in.BillState);
  
    if (in._BillCountryCodeSet) record.put ("BillCountryCode", in.BillCountryCode);
  
    if (in._BillZipSet) record.put ("BillZip", in.BillZip);
  
    if (in._TypeIdNrcSet) record.put ("TypeIdNrc", in.TypeIdNrc);
      return record;
  }
  /** convert InvoiceDetailQueryObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceDetailQueryObjectFilter in, Map record)
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
      map = DataHelper.filterToMap (in.ShowZeroRatedCharges, in.ShowZeroRatedChargesSort, in.ShowZeroRatedChargesSortAscending, in.ShowZeroRatedChargesFetch); 
      if (map != null) record.put ("ShowZeroRatedCharges", map);
      map = DataHelper.filterToMap (in.BPCurrencyAttribute, in.BPCurrencyAttributeSort, in.BPCurrencyAttributeSortAscending, in.BPCurrencyAttributeFetch); 
      if (map != null) record.put ("BPCurrencyAttribute", map);
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
      map = DataHelper.filterToMap (in.TypeIdNrc, in.TypeIdNrcSort, in.TypeIdNrcSortAscending, in.TypeIdNrcFetch);
      if (map != null) record.put ("TypeIdNrc", map);
    return record;
  }
  /** convert Map to InvoiceDetailQueryObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceDetailQueryObjectData the converted object
   */
  public static InvoiceDetailQueryObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceDetailQueryObjectData out = new InvoiceDetailQueryObjectData (InvoiceDetailObjectHelper.getObj (record));

    if ((obj = record.get ("ApiQueryName")) != null)
    {
      out.ApiQueryName = (String) obj;
    }
  
    if ((obj = record.get ("LatestInvoice")) != null)
    {
      out.LatestInvoice = (Boolean) obj;
    }
  
    if ((obj = record.get ("ShowZeroRatedCharges")) != null)
    {
      out.ShowZeroRatedCharges = (Boolean) obj;
    }
  
    if ((obj = record.get ("BPCurrencyAttribute")) != null)
    {
      out.BPCurrencyAttribute = (BigInteger) obj;
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
  
    if ((obj = record.get ("TypeIdNrc")) != null)
    {
      out.TypeIdNrc = (Integer) obj;
    }
      return out;
  }
  /** convert Map to InvoiceDetailQueryObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceDetailQueryObjectFilter the converted object
   */
  public static InvoiceDetailQueryObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceDetailQueryObjectFilter out = new InvoiceDetailQueryObjectFilter (InvoiceDetailObjectHelper.getFilter (record));
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
  
    Map TypeIdNrcMap = (Map)record.get("TypeIdNrc");
    Boolean TypeIdNrcFetch = DataHelper.getFetch(TypeIdNrcMap);
    Boolean TypeIdNrcSortDir = DataHelper.getSortDirection(TypeIdNrcMap);
    Integer TypeIdNrcSortOrder = DataHelper.getSortOrder(TypeIdNrcMap);
    if (TypeIdNrcFetch != null) out.setTypeIdNrcFetch(TypeIdNrcFetch);
    if (TypeIdNrcSortDir != null) out.setTypeIdNrcSortDirection(TypeIdNrcSortDir);
    if (TypeIdNrcSortOrder != null) out.setTypeIdNrcSortOrder(TypeIdNrcSortOrder);

    Filter[] TypeIdNrcFilter = DataHelper.mapToFilterArray(TypeIdNrcMap, Integer.class);
    if (TypeIdNrcFilter != null) {
      IntegerFilter[] TypeIdNrcFilters = new IntegerFilter[TypeIdNrcFilter.length];
      for (int i = 0; i < TypeIdNrcFilters.length; i++) {
        TypeIdNrcFilters[i] = (IntegerFilter)TypeIdNrcFilter[i];
      }
      try {
        out.setTypeIdNrcFilter(TypeIdNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
