/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherHistoryObjectHelper.java
 * Definition File: Catalog/VoucherHistory.xml
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



/** Helper class to convert VoucherHistoryObject JavaBean objects to/from HashMaps.
 */
public class VoucherHistoryObjectHelper implements ArubaObjectHelper
{
  /** convert VoucherHistoryObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (VoucherHistoryObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherHistoryObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherHistoryObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherHistoryObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherHistoryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherHistoryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherHistoryObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherHistoryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherHistoryObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherHistoryObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherHistoryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherHistoryObjectData.
   * @param record the Map containing the data to convert to the object
   * @return VoucherHistoryObjectData the converted object
   */
  public static VoucherHistoryObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherHistoryObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherHistoryObject")
   * @return VoucherHistoryObjectData the converted object
   */
  public static VoucherHistoryObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherHistoryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherHistoryObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return VoucherHistoryObjectFilter the converted object
   */
  public static VoucherHistoryObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherHistoryObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherHistoryObject")
   * @return VoucherHistoryObjectFilter the converted object
   */
  public static VoucherHistoryObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherHistoryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to VoucherHistoryObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return VoucherHistoryObjectDataList the converted object
   */
  public static VoucherHistoryObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to VoucherHistoryObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "VoucherHistoryObjectList")
   * @return VoucherHistoryObjectDataList the converted object
   */
  public static VoucherHistoryObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherHistoryObjectList";
    Object[] root = (Object[]) record.get (rootName);
    VoucherHistoryObjectData[] array = null;
    if (root != null)
    {
      array = new VoucherHistoryObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = VoucherHistoryObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new VoucherHistoryObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new VoucherHistoryObjectDataList (array, index, total);
  }
  /** convert VoucherHistoryObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherHistoryObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", VoucherHistoryObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._StatusSet) record.put ("Status", in.Status);
  
    if (in._LocationCodeSet) record.put ("LocationCode", in.LocationCode);
  
    if (in._ModificationRemark1Set) record.put ("ModificationRemark1", in.ModificationRemark1);
  
    if (in._ModificationRemark2Set) record.put ("ModificationRemark2", in.ModificationRemark2);
  
    if (in._ModificationRemark3Set) record.put ("ModificationRemark3", in.ModificationRemark3);
  
    if (in._ModificationRemark4Set) record.put ("ModificationRemark4", in.ModificationRemark4);
  
    if (in._ModificationRemark5Set) record.put ("ModificationRemark5", in.ModificationRemark5);
      return record;
  }
  /** convert VoucherHistoryObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherHistoryObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", VoucherHistoryObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.Status, in.StatusSort, in.StatusSortAscending, in.StatusFetch);
      if (map != null) record.put ("Status", map);
      map = DataHelper.filterToMap (in.LocationCode, in.LocationCodeSort, in.LocationCodeSortAscending, in.LocationCodeFetch);
      if (map != null) record.put ("LocationCode", map);
      map = DataHelper.filterToMap (in.ModificationRemark1, in.ModificationRemark1Sort, in.ModificationRemark1SortAscending, in.ModificationRemark1Fetch, in.ModificationRemark1CaseInsensitive);
      if (map != null) record.put ("ModificationRemark1", map);
      map = DataHelper.filterToMap (in.ModificationRemark2, in.ModificationRemark2Sort, in.ModificationRemark2SortAscending, in.ModificationRemark2Fetch, in.ModificationRemark2CaseInsensitive);
      if (map != null) record.put ("ModificationRemark2", map);
      map = DataHelper.filterToMap (in.ModificationRemark3, in.ModificationRemark3Sort, in.ModificationRemark3SortAscending, in.ModificationRemark3Fetch, in.ModificationRemark3CaseInsensitive);
      if (map != null) record.put ("ModificationRemark3", map);
      map = DataHelper.filterToMap (in.ModificationRemark4, in.ModificationRemark4Sort, in.ModificationRemark4SortAscending, in.ModificationRemark4Fetch, in.ModificationRemark4CaseInsensitive);
      if (map != null) record.put ("ModificationRemark4", map);
      map = DataHelper.filterToMap (in.ModificationRemark5, in.ModificationRemark5Sort, in.ModificationRemark5SortAscending, in.ModificationRemark5Fetch, in.ModificationRemark5CaseInsensitive);
      if (map != null) record.put ("ModificationRemark5", map);
    return record;
  }
  /** convert Map to VoucherHistoryObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherHistoryObjectData the converted object
   */
  public static VoucherHistoryObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherHistoryObjectData out = new VoucherHistoryObjectData ();

    out.Key = VoucherHistoryObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (BigInteger) obj;
    }
  
    if ((obj = record.get ("LocationCode")) != null)
    {
      out.LocationCode = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ModificationRemark1")) != null)
    {
      out.ModificationRemark1 = (String) obj;
    }
  
    if ((obj = record.get ("ModificationRemark2")) != null)
    {
      out.ModificationRemark2 = (String) obj;
    }
  
    if ((obj = record.get ("ModificationRemark3")) != null)
    {
      out.ModificationRemark3 = (String) obj;
    }
  
    if ((obj = record.get ("ModificationRemark4")) != null)
    {
      out.ModificationRemark4 = (String) obj;
    }
  
    if ((obj = record.get ("ModificationRemark5")) != null)
    {
      out.ModificationRemark5 = (String) obj;
    }
      return out;
  }
  /** convert Map to VoucherHistoryObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherHistoryObjectFilter the converted object
   */
  public static VoucherHistoryObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherHistoryObjectFilter out = new VoucherHistoryObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = VoucherHistoryObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map StatusMap = (Map)record.get("Status");
    Boolean StatusFetch = DataHelper.getFetch(StatusMap);
    Boolean StatusSortDir = DataHelper.getSortDirection(StatusMap);
    Integer StatusSortOrder = DataHelper.getSortOrder(StatusMap);
    if (StatusFetch != null) out.setStatusFetch(StatusFetch);
    if (StatusSortDir != null) out.setStatusSortDirection(StatusSortDir);
    if (StatusSortOrder != null) out.setStatusSortOrder(StatusSortOrder);

    Filter[] StatusFilter = DataHelper.mapToFilterArray(StatusMap, BigInteger.class);
    if (StatusFilter != null) {
      BigIntegerFilter[] StatusFilters = new BigIntegerFilter[StatusFilter.length];
      for (int i = 0; i < StatusFilters.length; i++) {
        StatusFilters[i] = (BigIntegerFilter)StatusFilter[i];
      }
      try {
        out.setStatusFilter(StatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LocationCodeMap = (Map)record.get("LocationCode");
    Boolean LocationCodeFetch = DataHelper.getFetch(LocationCodeMap);
    Boolean LocationCodeSortDir = DataHelper.getSortDirection(LocationCodeMap);
    Integer LocationCodeSortOrder = DataHelper.getSortOrder(LocationCodeMap);
    if (LocationCodeFetch != null) out.setLocationCodeFetch(LocationCodeFetch);
    if (LocationCodeSortDir != null) out.setLocationCodeSortDirection(LocationCodeSortDir);
    if (LocationCodeSortOrder != null) out.setLocationCodeSortOrder(LocationCodeSortOrder);

    Filter[] LocationCodeFilter = DataHelper.mapToFilterArray(LocationCodeMap, BigInteger.class);
    if (LocationCodeFilter != null) {
      BigIntegerFilter[] LocationCodeFilters = new BigIntegerFilter[LocationCodeFilter.length];
      for (int i = 0; i < LocationCodeFilters.length; i++) {
        LocationCodeFilters[i] = (BigIntegerFilter)LocationCodeFilter[i];
      }
      try {
        out.setLocationCodeFilter(LocationCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ModificationRemark1Map = (Map)record.get("ModificationRemark1");
    Boolean ModificationRemark1Fetch = DataHelper.getFetch(ModificationRemark1Map);
    Boolean ModificationRemark1SortDir = DataHelper.getSortDirection(ModificationRemark1Map);
    Integer ModificationRemark1SortOrder = DataHelper.getSortOrder(ModificationRemark1Map);
    if (ModificationRemark1Fetch != null) out.setModificationRemark1Fetch(ModificationRemark1Fetch);
    if (ModificationRemark1SortDir != null) out.setModificationRemark1SortDirection(ModificationRemark1SortDir);
    if (ModificationRemark1SortOrder != null) out.setModificationRemark1SortOrder(ModificationRemark1SortOrder);

    Filter[] ModificationRemark1Filter = DataHelper.mapToFilterArray(ModificationRemark1Map, String.class);
    if (ModificationRemark1Filter != null) {
      StringFilter[] ModificationRemark1Filters = new StringFilter[ModificationRemark1Filter.length];
      for (int i = 0; i < ModificationRemark1Filters.length; i++) {
        ModificationRemark1Filters[i] = (StringFilter)ModificationRemark1Filter[i];
      }
      try {
        out.setModificationRemark1Filter(ModificationRemark1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ModificationRemark2Map = (Map)record.get("ModificationRemark2");
    Boolean ModificationRemark2Fetch = DataHelper.getFetch(ModificationRemark2Map);
    Boolean ModificationRemark2SortDir = DataHelper.getSortDirection(ModificationRemark2Map);
    Integer ModificationRemark2SortOrder = DataHelper.getSortOrder(ModificationRemark2Map);
    if (ModificationRemark2Fetch != null) out.setModificationRemark2Fetch(ModificationRemark2Fetch);
    if (ModificationRemark2SortDir != null) out.setModificationRemark2SortDirection(ModificationRemark2SortDir);
    if (ModificationRemark2SortOrder != null) out.setModificationRemark2SortOrder(ModificationRemark2SortOrder);

    Filter[] ModificationRemark2Filter = DataHelper.mapToFilterArray(ModificationRemark2Map, String.class);
    if (ModificationRemark2Filter != null) {
      StringFilter[] ModificationRemark2Filters = new StringFilter[ModificationRemark2Filter.length];
      for (int i = 0; i < ModificationRemark2Filters.length; i++) {
        ModificationRemark2Filters[i] = (StringFilter)ModificationRemark2Filter[i];
      }
      try {
        out.setModificationRemark2Filter(ModificationRemark2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ModificationRemark3Map = (Map)record.get("ModificationRemark3");
    Boolean ModificationRemark3Fetch = DataHelper.getFetch(ModificationRemark3Map);
    Boolean ModificationRemark3SortDir = DataHelper.getSortDirection(ModificationRemark3Map);
    Integer ModificationRemark3SortOrder = DataHelper.getSortOrder(ModificationRemark3Map);
    if (ModificationRemark3Fetch != null) out.setModificationRemark3Fetch(ModificationRemark3Fetch);
    if (ModificationRemark3SortDir != null) out.setModificationRemark3SortDirection(ModificationRemark3SortDir);
    if (ModificationRemark3SortOrder != null) out.setModificationRemark3SortOrder(ModificationRemark3SortOrder);

    Filter[] ModificationRemark3Filter = DataHelper.mapToFilterArray(ModificationRemark3Map, String.class);
    if (ModificationRemark3Filter != null) {
      StringFilter[] ModificationRemark3Filters = new StringFilter[ModificationRemark3Filter.length];
      for (int i = 0; i < ModificationRemark3Filters.length; i++) {
        ModificationRemark3Filters[i] = (StringFilter)ModificationRemark3Filter[i];
      }
      try {
        out.setModificationRemark3Filter(ModificationRemark3Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ModificationRemark4Map = (Map)record.get("ModificationRemark4");
    Boolean ModificationRemark4Fetch = DataHelper.getFetch(ModificationRemark4Map);
    Boolean ModificationRemark4SortDir = DataHelper.getSortDirection(ModificationRemark4Map);
    Integer ModificationRemark4SortOrder = DataHelper.getSortOrder(ModificationRemark4Map);
    if (ModificationRemark4Fetch != null) out.setModificationRemark4Fetch(ModificationRemark4Fetch);
    if (ModificationRemark4SortDir != null) out.setModificationRemark4SortDirection(ModificationRemark4SortDir);
    if (ModificationRemark4SortOrder != null) out.setModificationRemark4SortOrder(ModificationRemark4SortOrder);

    Filter[] ModificationRemark4Filter = DataHelper.mapToFilterArray(ModificationRemark4Map, String.class);
    if (ModificationRemark4Filter != null) {
      StringFilter[] ModificationRemark4Filters = new StringFilter[ModificationRemark4Filter.length];
      for (int i = 0; i < ModificationRemark4Filters.length; i++) {
        ModificationRemark4Filters[i] = (StringFilter)ModificationRemark4Filter[i];
      }
      try {
        out.setModificationRemark4Filter(ModificationRemark4Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ModificationRemark5Map = (Map)record.get("ModificationRemark5");
    Boolean ModificationRemark5Fetch = DataHelper.getFetch(ModificationRemark5Map);
    Boolean ModificationRemark5SortDir = DataHelper.getSortDirection(ModificationRemark5Map);
    Integer ModificationRemark5SortOrder = DataHelper.getSortOrder(ModificationRemark5Map);
    if (ModificationRemark5Fetch != null) out.setModificationRemark5Fetch(ModificationRemark5Fetch);
    if (ModificationRemark5SortDir != null) out.setModificationRemark5SortDirection(ModificationRemark5SortDir);
    if (ModificationRemark5SortOrder != null) out.setModificationRemark5SortOrder(ModificationRemark5SortOrder);

    Filter[] ModificationRemark5Filter = DataHelper.mapToFilterArray(ModificationRemark5Map, String.class);
    if (ModificationRemark5Filter != null) {
      StringFilter[] ModificationRemark5Filters = new StringFilter[ModificationRemark5Filter.length];
      for (int i = 0; i < ModificationRemark5Filters.length; i++) {
        ModificationRemark5Filters[i] = (StringFilter)ModificationRemark5Filter[i];
      }
      try {
        out.setModificationRemark5Filter(ModificationRemark5Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
