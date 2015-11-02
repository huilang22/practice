/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupCorridorObjectHelper.java
 * Definition File: Catalog/HqGroupCorridor.xml
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



/** Helper class to convert HqGroupCorridorObject JavaBean objects to/from HashMaps.
 */
public class HqGroupCorridorObjectHelper implements ArubaObjectHelper
{
  /** convert HqGroupCorridorObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HqGroupCorridorObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupCorridorObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupCorridorObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupCorridorObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupCorridorObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HqGroupCorridorObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupCorridorObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupCorridorObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupCorridorObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupCorridorObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupCorridorObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HqGroupCorridorObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupCorridorObjectData the converted object
   */
  public static HqGroupCorridorObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HqGroupCorridorObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HqGroupCorridorObject")
   * @return HqGroupCorridorObjectData the converted object
   */
  public static HqGroupCorridorObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupCorridorObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HqGroupCorridorObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupCorridorObjectFilter the converted object
   */
  public static HqGroupCorridorObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HqGroupCorridorObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HqGroupCorridorObject")
   * @return HqGroupCorridorObjectFilter the converted object
   */
  public static HqGroupCorridorObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupCorridorObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HqGroupCorridorObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HqGroupCorridorObjectDataList the converted object
   */
  public static HqGroupCorridorObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HqGroupCorridorObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HqGroupCorridorObjectList")
   * @return HqGroupCorridorObjectDataList the converted object
   */
  public static HqGroupCorridorObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupCorridorObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HqGroupCorridorObjectData[] array = null;
    if (root != null)
    {
      array = new HqGroupCorridorObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HqGroupCorridorObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HqGroupCorridorObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HqGroupCorridorObjectDataList (array, index, total);
  }
  /** convert HqGroupCorridorObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupCorridorObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HqGroupCorridorObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._CorridorAccountNoSet) record.put ("CorridorAccountNo", in.CorridorAccountNo);
  
    if (in._CorridorSubscrNoSet) record.put ("CorridorSubscrNo", in.CorridorSubscrNo);
  
    if (in._CorridorSubscrNoResetsSet) record.put ("CorridorSubscrNoResets", in.CorridorSubscrNoResets);
  
    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    if (in._StartDtSet) record.put ("StartDt", in.StartDt);
  
    if (in._EndDtSet) record.put ("EndDt", in.EndDt);
      return record;
  }
  /** convert HqGroupCorridorObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupCorridorObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HqGroupCorridorObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.CorridorAccountNo, in.CorridorAccountNoSort, in.CorridorAccountNoSortAscending, in.CorridorAccountNoFetch);
      if (map != null) record.put ("CorridorAccountNo", map);
      map = DataHelper.filterToMap (in.CorridorSubscrNo, in.CorridorSubscrNoSort, in.CorridorSubscrNoSortAscending, in.CorridorSubscrNoFetch);
      if (map != null) record.put ("CorridorSubscrNo", map);
      map = DataHelper.filterToMap (in.CorridorSubscrNoResets, in.CorridorSubscrNoResetsSort, in.CorridorSubscrNoResetsSortAscending, in.CorridorSubscrNoResetsFetch);
      if (map != null) record.put ("CorridorSubscrNoResets", map);
      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch);
      if (map != null) record.put ("ServerId", map);
      map = DataHelper.filterToMap (in.StartDt, in.StartDtSort, in.StartDtSortAscending, in.StartDtFetch);
      if (map != null) record.put ("StartDt", map);
      map = DataHelper.filterToMap (in.EndDt, in.EndDtSort, in.EndDtSortAscending, in.EndDtFetch);
      if (map != null) record.put ("EndDt", map);
    return record;
  }
  /** convert Map to HqGroupCorridorObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupCorridorObjectData the converted object
   */
  public static HqGroupCorridorObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupCorridorObjectData out = new HqGroupCorridorObjectData ();

    out.Key = HqGroupCorridorObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("CorridorAccountNo")) != null)
    {
      out.CorridorAccountNo = (Integer) obj;
    }
  
    if ((obj = record.get ("CorridorSubscrNo")) != null)
    {
      out.CorridorSubscrNo = (Integer) obj;
    }
  
    if ((obj = record.get ("CorridorSubscrNoResets")) != null)
    {
      out.CorridorSubscrNoResets = (Integer) obj;
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
  /** convert Map to HqGroupCorridorObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupCorridorObjectFilter the converted object
   */
  public static HqGroupCorridorObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupCorridorObjectFilter out = new HqGroupCorridorObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HqGroupCorridorObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map CorridorAccountNoMap = (Map)record.get("CorridorAccountNo");
    Boolean CorridorAccountNoFetch = DataHelper.getFetch(CorridorAccountNoMap);
    Boolean CorridorAccountNoSortDir = DataHelper.getSortDirection(CorridorAccountNoMap);
    Integer CorridorAccountNoSortOrder = DataHelper.getSortOrder(CorridorAccountNoMap);
    if (CorridorAccountNoFetch != null) out.setCorridorAccountNoFetch(CorridorAccountNoFetch);
    if (CorridorAccountNoSortDir != null) out.setCorridorAccountNoSortDirection(CorridorAccountNoSortDir);
    if (CorridorAccountNoSortOrder != null) out.setCorridorAccountNoSortOrder(CorridorAccountNoSortOrder);

    Filter[] CorridorAccountNoFilter = DataHelper.mapToFilterArray(CorridorAccountNoMap, Integer.class);
    if (CorridorAccountNoFilter != null) {
      IntegerFilter[] CorridorAccountNoFilters = new IntegerFilter[CorridorAccountNoFilter.length];
      for (int i = 0; i < CorridorAccountNoFilters.length; i++) {
        CorridorAccountNoFilters[i] = (IntegerFilter)CorridorAccountNoFilter[i];
      }
      try {
        out.setCorridorAccountNoFilter(CorridorAccountNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CorridorSubscrNoMap = (Map)record.get("CorridorSubscrNo");
    Boolean CorridorSubscrNoFetch = DataHelper.getFetch(CorridorSubscrNoMap);
    Boolean CorridorSubscrNoSortDir = DataHelper.getSortDirection(CorridorSubscrNoMap);
    Integer CorridorSubscrNoSortOrder = DataHelper.getSortOrder(CorridorSubscrNoMap);
    if (CorridorSubscrNoFetch != null) out.setCorridorSubscrNoFetch(CorridorSubscrNoFetch);
    if (CorridorSubscrNoSortDir != null) out.setCorridorSubscrNoSortDirection(CorridorSubscrNoSortDir);
    if (CorridorSubscrNoSortOrder != null) out.setCorridorSubscrNoSortOrder(CorridorSubscrNoSortOrder);

    Filter[] CorridorSubscrNoFilter = DataHelper.mapToFilterArray(CorridorSubscrNoMap, Integer.class);
    if (CorridorSubscrNoFilter != null) {
      IntegerFilter[] CorridorSubscrNoFilters = new IntegerFilter[CorridorSubscrNoFilter.length];
      for (int i = 0; i < CorridorSubscrNoFilters.length; i++) {
        CorridorSubscrNoFilters[i] = (IntegerFilter)CorridorSubscrNoFilter[i];
      }
      try {
        out.setCorridorSubscrNoFilter(CorridorSubscrNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CorridorSubscrNoResetsMap = (Map)record.get("CorridorSubscrNoResets");
    Boolean CorridorSubscrNoResetsFetch = DataHelper.getFetch(CorridorSubscrNoResetsMap);
    Boolean CorridorSubscrNoResetsSortDir = DataHelper.getSortDirection(CorridorSubscrNoResetsMap);
    Integer CorridorSubscrNoResetsSortOrder = DataHelper.getSortOrder(CorridorSubscrNoResetsMap);
    if (CorridorSubscrNoResetsFetch != null) out.setCorridorSubscrNoResetsFetch(CorridorSubscrNoResetsFetch);
    if (CorridorSubscrNoResetsSortDir != null) out.setCorridorSubscrNoResetsSortDirection(CorridorSubscrNoResetsSortDir);
    if (CorridorSubscrNoResetsSortOrder != null) out.setCorridorSubscrNoResetsSortOrder(CorridorSubscrNoResetsSortOrder);

    Filter[] CorridorSubscrNoResetsFilter = DataHelper.mapToFilterArray(CorridorSubscrNoResetsMap, Integer.class);
    if (CorridorSubscrNoResetsFilter != null) {
      IntegerFilter[] CorridorSubscrNoResetsFilters = new IntegerFilter[CorridorSubscrNoResetsFilter.length];
      for (int i = 0; i < CorridorSubscrNoResetsFilters.length; i++) {
        CorridorSubscrNoResetsFilters[i] = (IntegerFilter)CorridorSubscrNoResetsFilter[i];
      }
      try {
        out.setCorridorSubscrNoResetsFilter(CorridorSubscrNoResetsFilters);
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
