/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupProductObjectHelper.java
 * Definition File: Catalog/HqGroupProduct.xml
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



/** Helper class to convert HqGroupProductObject JavaBean objects to/from HashMaps.
 */
public class HqGroupProductObjectHelper implements ArubaObjectHelper
{
  /** convert HqGroupProductObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HqGroupProductObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupProductObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupProductObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupProductObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupProductObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HqGroupProductObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupProductObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupProductObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupProductObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupProductObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupProductObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HqGroupProductObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupProductObjectData the converted object
   */
  public static HqGroupProductObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HqGroupProductObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HqGroupProductObject")
   * @return HqGroupProductObjectData the converted object
   */
  public static HqGroupProductObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupProductObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HqGroupProductObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupProductObjectFilter the converted object
   */
  public static HqGroupProductObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HqGroupProductObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HqGroupProductObject")
   * @return HqGroupProductObjectFilter the converted object
   */
  public static HqGroupProductObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupProductObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HqGroupProductObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HqGroupProductObjectDataList the converted object
   */
  public static HqGroupProductObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HqGroupProductObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HqGroupProductObjectList")
   * @return HqGroupProductObjectDataList the converted object
   */
  public static HqGroupProductObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupProductObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HqGroupProductObjectData[] array = null;
    if (root != null)
    {
      array = new HqGroupProductObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HqGroupProductObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HqGroupProductObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HqGroupProductObjectDataList (array, index, total);
  }
  /** convert HqGroupProductObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupProductObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HqGroupProductObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._PrdctParentAccountNoSet) record.put ("PrdctParentAccountNo", in.PrdctParentAccountNo);
  
    if (in._PrdctParentSubscrNoSet) record.put ("PrdctParentSubscrNo", in.PrdctParentSubscrNo);
  
    if (in._PrdctParentSubscrNoResetsSet) record.put ("PrdctParentSubscrNoResets", in.PrdctParentSubscrNoResets);
  
    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    if (in._StartDtSet) record.put ("StartDt", in.StartDt);
  
    if (in._EndDtSet) record.put ("EndDt", in.EndDt);
      return record;
  }
  /** convert HqGroupProductObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupProductObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HqGroupProductObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.PrdctParentAccountNo, in.PrdctParentAccountNoSort, in.PrdctParentAccountNoSortAscending, in.PrdctParentAccountNoFetch);
      if (map != null) record.put ("PrdctParentAccountNo", map);
      map = DataHelper.filterToMap (in.PrdctParentSubscrNo, in.PrdctParentSubscrNoSort, in.PrdctParentSubscrNoSortAscending, in.PrdctParentSubscrNoFetch);
      if (map != null) record.put ("PrdctParentSubscrNo", map);
      map = DataHelper.filterToMap (in.PrdctParentSubscrNoResets, in.PrdctParentSubscrNoResetsSort, in.PrdctParentSubscrNoResetsSortAscending, in.PrdctParentSubscrNoResetsFetch);
      if (map != null) record.put ("PrdctParentSubscrNoResets", map);
      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch);
      if (map != null) record.put ("ServerId", map);
      map = DataHelper.filterToMap (in.StartDt, in.StartDtSort, in.StartDtSortAscending, in.StartDtFetch);
      if (map != null) record.put ("StartDt", map);
      map = DataHelper.filterToMap (in.EndDt, in.EndDtSort, in.EndDtSortAscending, in.EndDtFetch);
      if (map != null) record.put ("EndDt", map);
    return record;
  }
  /** convert Map to HqGroupProductObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupProductObjectData the converted object
   */
  public static HqGroupProductObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupProductObjectData out = new HqGroupProductObjectData ();

    out.Key = HqGroupProductObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("PrdctParentAccountNo")) != null)
    {
      out.PrdctParentAccountNo = (Integer) obj;
    }
  
    if ((obj = record.get ("PrdctParentSubscrNo")) != null)
    {
      out.PrdctParentSubscrNo = (Integer) obj;
    }
  
    if ((obj = record.get ("PrdctParentSubscrNoResets")) != null)
    {
      out.PrdctParentSubscrNoResets = (Integer) obj;
    }
  
    if ((obj = record.get ("ServerId")) != null)
    {
      out.ServerId = (Integer) obj;
    }
  
    if ((obj = record.get ("StartDt")) != null)
    {
      out.StartDt = (Date) obj;
    }
  
    if ((obj = record.get ("EndDt")) != null)
    {
      out.EndDt = (Date) obj;
    }
      return out;
  }
  /** convert Map to HqGroupProductObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupProductObjectFilter the converted object
   */
  public static HqGroupProductObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupProductObjectFilter out = new HqGroupProductObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HqGroupProductObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map PrdctParentAccountNoMap = (Map)record.get("PrdctParentAccountNo");
    Boolean PrdctParentAccountNoFetch = DataHelper.getFetch(PrdctParentAccountNoMap);
    Boolean PrdctParentAccountNoSortDir = DataHelper.getSortDirection(PrdctParentAccountNoMap);
    Integer PrdctParentAccountNoSortOrder = DataHelper.getSortOrder(PrdctParentAccountNoMap);
    if (PrdctParentAccountNoFetch != null) out.setPrdctParentAccountNoFetch(PrdctParentAccountNoFetch);
    if (PrdctParentAccountNoSortDir != null) out.setPrdctParentAccountNoSortDirection(PrdctParentAccountNoSortDir);
    if (PrdctParentAccountNoSortOrder != null) out.setPrdctParentAccountNoSortOrder(PrdctParentAccountNoSortOrder);

    Filter[] PrdctParentAccountNoFilter = DataHelper.mapToFilterArray(PrdctParentAccountNoMap, Integer.class);
    if (PrdctParentAccountNoFilter != null) {
      IntegerFilter[] PrdctParentAccountNoFilters = new IntegerFilter[PrdctParentAccountNoFilter.length];
      for (int i = 0; i < PrdctParentAccountNoFilters.length; i++) {
        PrdctParentAccountNoFilters[i] = (IntegerFilter)PrdctParentAccountNoFilter[i];
      }
      try {
        out.setPrdctParentAccountNoFilter(PrdctParentAccountNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrdctParentSubscrNoMap = (Map)record.get("PrdctParentSubscrNo");
    Boolean PrdctParentSubscrNoFetch = DataHelper.getFetch(PrdctParentSubscrNoMap);
    Boolean PrdctParentSubscrNoSortDir = DataHelper.getSortDirection(PrdctParentSubscrNoMap);
    Integer PrdctParentSubscrNoSortOrder = DataHelper.getSortOrder(PrdctParentSubscrNoMap);
    if (PrdctParentSubscrNoFetch != null) out.setPrdctParentSubscrNoFetch(PrdctParentSubscrNoFetch);
    if (PrdctParentSubscrNoSortDir != null) out.setPrdctParentSubscrNoSortDirection(PrdctParentSubscrNoSortDir);
    if (PrdctParentSubscrNoSortOrder != null) out.setPrdctParentSubscrNoSortOrder(PrdctParentSubscrNoSortOrder);

    Filter[] PrdctParentSubscrNoFilter = DataHelper.mapToFilterArray(PrdctParentSubscrNoMap, Integer.class);
    if (PrdctParentSubscrNoFilter != null) {
      IntegerFilter[] PrdctParentSubscrNoFilters = new IntegerFilter[PrdctParentSubscrNoFilter.length];
      for (int i = 0; i < PrdctParentSubscrNoFilters.length; i++) {
        PrdctParentSubscrNoFilters[i] = (IntegerFilter)PrdctParentSubscrNoFilter[i];
      }
      try {
        out.setPrdctParentSubscrNoFilter(PrdctParentSubscrNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrdctParentSubscrNoResetsMap = (Map)record.get("PrdctParentSubscrNoResets");
    Boolean PrdctParentSubscrNoResetsFetch = DataHelper.getFetch(PrdctParentSubscrNoResetsMap);
    Boolean PrdctParentSubscrNoResetsSortDir = DataHelper.getSortDirection(PrdctParentSubscrNoResetsMap);
    Integer PrdctParentSubscrNoResetsSortOrder = DataHelper.getSortOrder(PrdctParentSubscrNoResetsMap);
    if (PrdctParentSubscrNoResetsFetch != null) out.setPrdctParentSubscrNoResetsFetch(PrdctParentSubscrNoResetsFetch);
    if (PrdctParentSubscrNoResetsSortDir != null) out.setPrdctParentSubscrNoResetsSortDirection(PrdctParentSubscrNoResetsSortDir);
    if (PrdctParentSubscrNoResetsSortOrder != null) out.setPrdctParentSubscrNoResetsSortOrder(PrdctParentSubscrNoResetsSortOrder);

    Filter[] PrdctParentSubscrNoResetsFilter = DataHelper.mapToFilterArray(PrdctParentSubscrNoResetsMap, Integer.class);
    if (PrdctParentSubscrNoResetsFilter != null) {
      IntegerFilter[] PrdctParentSubscrNoResetsFilters = new IntegerFilter[PrdctParentSubscrNoResetsFilter.length];
      for (int i = 0; i < PrdctParentSubscrNoResetsFilters.length; i++) {
        PrdctParentSubscrNoResetsFilters[i] = (IntegerFilter)PrdctParentSubscrNoResetsFilter[i];
      }
      try {
        out.setPrdctParentSubscrNoResetsFilter(PrdctParentSubscrNoResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServerIdMap = (Map)record.get("ServerId");
    Boolean ServerIdFetch = DataHelper.getFetch(ServerIdMap);
    Boolean ServerIdSortDir = DataHelper.getSortDirection(ServerIdMap);
    Integer ServerIdSortOrder = DataHelper.getSortOrder(ServerIdMap);
    if (ServerIdFetch != null) out.setServerIdFetch(ServerIdFetch);
    if (ServerIdSortDir != null) out.setServerIdSortDirection(ServerIdSortDir);
    if (ServerIdSortOrder != null) out.setServerIdSortOrder(ServerIdSortOrder);

    Filter[] ServerIdFilter = DataHelper.mapToFilterArray(ServerIdMap, Integer.class);
    if (ServerIdFilter != null) {
      IntegerFilter[] ServerIdFilters = new IntegerFilter[ServerIdFilter.length];
      for (int i = 0; i < ServerIdFilters.length; i++) {
        ServerIdFilters[i] = (IntegerFilter)ServerIdFilter[i];
      }
      try {
        out.setServerIdFilter(ServerIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StartDtMap = (Map)record.get("StartDt");
    Boolean StartDtFetch = DataHelper.getFetch(StartDtMap);
    Boolean StartDtSortDir = DataHelper.getSortDirection(StartDtMap);
    Integer StartDtSortOrder = DataHelper.getSortOrder(StartDtMap);
    if (StartDtFetch != null) out.setStartDtFetch(StartDtFetch);
    if (StartDtSortDir != null) out.setStartDtSortDirection(StartDtSortDir);
    if (StartDtSortOrder != null) out.setStartDtSortOrder(StartDtSortOrder);

    Filter[] StartDtFilter = DataHelper.mapToFilterArray(StartDtMap, Date.class);
    if (StartDtFilter != null) {
      DateFilter[] StartDtFilters = new DateFilter[StartDtFilter.length];
      for (int i = 0; i < StartDtFilters.length; i++) {
        StartDtFilters[i] = (DateFilter)StartDtFilter[i];
      }
      try {
        out.setStartDtFilter(StartDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EndDtMap = (Map)record.get("EndDt");
    Boolean EndDtFetch = DataHelper.getFetch(EndDtMap);
    Boolean EndDtSortDir = DataHelper.getSortDirection(EndDtMap);
    Integer EndDtSortOrder = DataHelper.getSortOrder(EndDtMap);
    if (EndDtFetch != null) out.setEndDtFetch(EndDtFetch);
    if (EndDtSortDir != null) out.setEndDtSortDirection(EndDtSortDir);
    if (EndDtSortOrder != null) out.setEndDtSortOrder(EndDtSortOrder);

    Filter[] EndDtFilter = DataHelper.mapToFilterArray(EndDtMap, Date.class);
    if (EndDtFilter != null) {
      DateFilter[] EndDtFilters = new DateFilter[EndDtFilter.length];
      for (int i = 0; i < EndDtFilters.length; i++) {
        EndDtFilters[i] = (DateFilter)EndDtFilter[i];
      }
      try {
        out.setEndDtFilter(EndDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
