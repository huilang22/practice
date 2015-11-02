/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqGroupContractsObjectHelper.java
 * Definition File: Catalog/HqGroupContracts.xml
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



/** Helper class to convert HqGroupContractsObject JavaBean objects to/from HashMaps.
 */
public class HqGroupContractsObjectHelper implements ArubaObjectHelper
{
  /** convert HqGroupContractsObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HqGroupContractsObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupContractsObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupContractsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupContractsObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupContractsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HqGroupContractsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupContractsObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqGroupContractsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqGroupContractsObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqGroupContractsObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqGroupContractsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HqGroupContractsObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupContractsObjectData the converted object
   */
  public static HqGroupContractsObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HqGroupContractsObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HqGroupContractsObject")
   * @return HqGroupContractsObjectData the converted object
   */
  public static HqGroupContractsObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupContractsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HqGroupContractsObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HqGroupContractsObjectFilter the converted object
   */
  public static HqGroupContractsObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HqGroupContractsObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HqGroupContractsObject")
   * @return HqGroupContractsObjectFilter the converted object
   */
  public static HqGroupContractsObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupContractsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HqGroupContractsObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HqGroupContractsObjectDataList the converted object
   */
  public static HqGroupContractsObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HqGroupContractsObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HqGroupContractsObjectList")
   * @return HqGroupContractsObjectDataList the converted object
   */
  public static HqGroupContractsObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqGroupContractsObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HqGroupContractsObjectData[] array = null;
    if (root != null)
    {
      array = new HqGroupContractsObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HqGroupContractsObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HqGroupContractsObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HqGroupContractsObjectDataList (array, index, total);
  }
  /** convert HqGroupContractsObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupContractsObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HqGroupContractsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._GroupIdSet) record.put ("GroupId", in.GroupId);
  
    if (in._GroupIdServSet) record.put ("GroupIdServ", in.GroupIdServ);
  
    if (in._ContractTypeSet) record.put ("ContractType", in.ContractType);
  
    if (in._StartDtSet) record.put ("StartDt", in.StartDt);
  
    if (in._EndDtSet) record.put ("EndDt", in.EndDt);
  
    if (in._ContractLevelSet) record.put ("ContractLevel", in.ContractLevel);
  
    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    if (in._CntrctParentAccountNoSet) record.put ("CntrctParentAccountNo", in.CntrctParentAccountNo);
  
    if (in._CntrctParentSubscrNoSet) record.put ("CntrctParentSubscrNo", in.CntrctParentSubscrNo);
  
    if (in._CntrctParentSubscrNoResetsSet) record.put ("CntrctParentSubscrNoResets", in.CntrctParentSubscrNoResets);
      return record;
  }
  /** convert HqGroupContractsObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HqGroupContractsObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HqGroupContractsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.GroupId, in.GroupIdSort, in.GroupIdSortAscending, in.GroupIdFetch);
      if (map != null) record.put ("GroupId", map);
      map = DataHelper.filterToMap (in.GroupIdServ, in.GroupIdServSort, in.GroupIdServSortAscending, in.GroupIdServFetch);
      if (map != null) record.put ("GroupIdServ", map);
      map = DataHelper.filterToMap (in.ContractType, in.ContractTypeSort, in.ContractTypeSortAscending, in.ContractTypeFetch);
      if (map != null) record.put ("ContractType", map);
      map = DataHelper.filterToMap (in.StartDt, in.StartDtSort, in.StartDtSortAscending, in.StartDtFetch);
      if (map != null) record.put ("StartDt", map);
      map = DataHelper.filterToMap (in.EndDt, in.EndDtSort, in.EndDtSortAscending, in.EndDtFetch);
      if (map != null) record.put ("EndDt", map);
      map = DataHelper.filterToMap (in.ContractLevel, in.ContractLevelSort, in.ContractLevelSortAscending, in.ContractLevelFetch);
      if (map != null) record.put ("ContractLevel", map);
      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch);
      if (map != null) record.put ("ServerId", map);
      map = DataHelper.filterToMap (in.CntrctParentAccountNo, in.CntrctParentAccountNoSort, in.CntrctParentAccountNoSortAscending, in.CntrctParentAccountNoFetch);
      if (map != null) record.put ("CntrctParentAccountNo", map);
      map = DataHelper.filterToMap (in.CntrctParentSubscrNo, in.CntrctParentSubscrNoSort, in.CntrctParentSubscrNoSortAscending, in.CntrctParentSubscrNoFetch);
      if (map != null) record.put ("CntrctParentSubscrNo", map);
      map = DataHelper.filterToMap (in.CntrctParentSubscrNoResets, in.CntrctParentSubscrNoResetsSort, in.CntrctParentSubscrNoResetsSortAscending, in.CntrctParentSubscrNoResetsFetch);
      if (map != null) record.put ("CntrctParentSubscrNoResets", map);
    return record;
  }
  /** convert Map to HqGroupContractsObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupContractsObjectData the converted object
   */
  public static HqGroupContractsObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupContractsObjectData out = new HqGroupContractsObjectData ();

    out.Key = HqGroupContractsObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("GroupId")) != null)
    {
      out.GroupId = (Integer) obj;
    }
  
    if ((obj = record.get ("GroupIdServ")) != null)
    {
      out.GroupIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("ContractType")) != null)
    {
      out.ContractType = (Integer) obj;
    }
  
    if ((obj = record.get ("StartDt")) != null)
    {
      out.StartDt = (Date) obj;
    }
  
    if ((obj = record.get ("EndDt")) != null)
    {
      out.EndDt = (Date) obj;
    }
  
    if ((obj = record.get ("ContractLevel")) != null)
    {
      out.ContractLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("ServerId")) != null)
    {
      out.ServerId = (Integer) obj;
    }
  
    if ((obj = record.get ("CntrctParentAccountNo")) != null)
    {
      out.CntrctParentAccountNo = (Integer) obj;
    }
  
    if ((obj = record.get ("CntrctParentSubscrNo")) != null)
    {
      out.CntrctParentSubscrNo = (Integer) obj;
    }
  
    if ((obj = record.get ("CntrctParentSubscrNoResets")) != null)
    {
      out.CntrctParentSubscrNoResets = (Integer) obj;
    }
      return out;
  }
  /** convert Map to HqGroupContractsObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqGroupContractsObjectFilter the converted object
   */
  public static HqGroupContractsObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqGroupContractsObjectFilter out = new HqGroupContractsObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HqGroupContractsObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map GroupIdMap = (Map)record.get("GroupId");
    Boolean GroupIdFetch = DataHelper.getFetch(GroupIdMap);
    Boolean GroupIdSortDir = DataHelper.getSortDirection(GroupIdMap);
    Integer GroupIdSortOrder = DataHelper.getSortOrder(GroupIdMap);
    if (GroupIdFetch != null) out.setGroupIdFetch(GroupIdFetch);
    if (GroupIdSortDir != null) out.setGroupIdSortDirection(GroupIdSortDir);
    if (GroupIdSortOrder != null) out.setGroupIdSortOrder(GroupIdSortOrder);

    Filter[] GroupIdFilter = DataHelper.mapToFilterArray(GroupIdMap, Integer.class);
    if (GroupIdFilter != null) {
      IntegerFilter[] GroupIdFilters = new IntegerFilter[GroupIdFilter.length];
      for (int i = 0; i < GroupIdFilters.length; i++) {
        GroupIdFilters[i] = (IntegerFilter)GroupIdFilter[i];
      }
      try {
        out.setGroupIdFilter(GroupIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GroupIdServMap = (Map)record.get("GroupIdServ");
    Boolean GroupIdServFetch = DataHelper.getFetch(GroupIdServMap);
    Boolean GroupIdServSortDir = DataHelper.getSortDirection(GroupIdServMap);
    Integer GroupIdServSortOrder = DataHelper.getSortOrder(GroupIdServMap);
    if (GroupIdServFetch != null) out.setGroupIdServFetch(GroupIdServFetch);
    if (GroupIdServSortDir != null) out.setGroupIdServSortDirection(GroupIdServSortDir);
    if (GroupIdServSortOrder != null) out.setGroupIdServSortOrder(GroupIdServSortOrder);

    Filter[] GroupIdServFilter = DataHelper.mapToFilterArray(GroupIdServMap, Integer.class);
    if (GroupIdServFilter != null) {
      IntegerFilter[] GroupIdServFilters = new IntegerFilter[GroupIdServFilter.length];
      for (int i = 0; i < GroupIdServFilters.length; i++) {
        GroupIdServFilters[i] = (IntegerFilter)GroupIdServFilter[i];
      }
      try {
        out.setGroupIdServFilter(GroupIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTypeMap = (Map)record.get("ContractType");
    Boolean ContractTypeFetch = DataHelper.getFetch(ContractTypeMap);
    Boolean ContractTypeSortDir = DataHelper.getSortDirection(ContractTypeMap);
    Integer ContractTypeSortOrder = DataHelper.getSortOrder(ContractTypeMap);
    if (ContractTypeFetch != null) out.setContractTypeFetch(ContractTypeFetch);
    if (ContractTypeSortDir != null) out.setContractTypeSortDirection(ContractTypeSortDir);
    if (ContractTypeSortOrder != null) out.setContractTypeSortOrder(ContractTypeSortOrder);

    Filter[] ContractTypeFilter = DataHelper.mapToFilterArray(ContractTypeMap, Integer.class);
    if (ContractTypeFilter != null) {
      IntegerFilter[] ContractTypeFilters = new IntegerFilter[ContractTypeFilter.length];
      for (int i = 0; i < ContractTypeFilters.length; i++) {
        ContractTypeFilters[i] = (IntegerFilter)ContractTypeFilter[i];
      }
      try {
        out.setContractTypeFilter(ContractTypeFilters);
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
  
    Map ContractLevelMap = (Map)record.get("ContractLevel");
    Boolean ContractLevelFetch = DataHelper.getFetch(ContractLevelMap);
    Boolean ContractLevelSortDir = DataHelper.getSortDirection(ContractLevelMap);
    Integer ContractLevelSortOrder = DataHelper.getSortOrder(ContractLevelMap);
    if (ContractLevelFetch != null) out.setContractLevelFetch(ContractLevelFetch);
    if (ContractLevelSortDir != null) out.setContractLevelSortDirection(ContractLevelSortDir);
    if (ContractLevelSortOrder != null) out.setContractLevelSortOrder(ContractLevelSortOrder);

    Filter[] ContractLevelFilter = DataHelper.mapToFilterArray(ContractLevelMap, Integer.class);
    if (ContractLevelFilter != null) {
      IntegerFilter[] ContractLevelFilters = new IntegerFilter[ContractLevelFilter.length];
      for (int i = 0; i < ContractLevelFilters.length; i++) {
        ContractLevelFilters[i] = (IntegerFilter)ContractLevelFilter[i];
      }
      try {
        out.setContractLevelFilter(ContractLevelFilters);
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
  
    Map CntrctParentAccountNoMap = (Map)record.get("CntrctParentAccountNo");
    Boolean CntrctParentAccountNoFetch = DataHelper.getFetch(CntrctParentAccountNoMap);
    Boolean CntrctParentAccountNoSortDir = DataHelper.getSortDirection(CntrctParentAccountNoMap);
    Integer CntrctParentAccountNoSortOrder = DataHelper.getSortOrder(CntrctParentAccountNoMap);
    if (CntrctParentAccountNoFetch != null) out.setCntrctParentAccountNoFetch(CntrctParentAccountNoFetch);
    if (CntrctParentAccountNoSortDir != null) out.setCntrctParentAccountNoSortDirection(CntrctParentAccountNoSortDir);
    if (CntrctParentAccountNoSortOrder != null) out.setCntrctParentAccountNoSortOrder(CntrctParentAccountNoSortOrder);

    Filter[] CntrctParentAccountNoFilter = DataHelper.mapToFilterArray(CntrctParentAccountNoMap, Integer.class);
    if (CntrctParentAccountNoFilter != null) {
      IntegerFilter[] CntrctParentAccountNoFilters = new IntegerFilter[CntrctParentAccountNoFilter.length];
      for (int i = 0; i < CntrctParentAccountNoFilters.length; i++) {
        CntrctParentAccountNoFilters[i] = (IntegerFilter)CntrctParentAccountNoFilter[i];
      }
      try {
        out.setCntrctParentAccountNoFilter(CntrctParentAccountNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CntrctParentSubscrNoMap = (Map)record.get("CntrctParentSubscrNo");
    Boolean CntrctParentSubscrNoFetch = DataHelper.getFetch(CntrctParentSubscrNoMap);
    Boolean CntrctParentSubscrNoSortDir = DataHelper.getSortDirection(CntrctParentSubscrNoMap);
    Integer CntrctParentSubscrNoSortOrder = DataHelper.getSortOrder(CntrctParentSubscrNoMap);
    if (CntrctParentSubscrNoFetch != null) out.setCntrctParentSubscrNoFetch(CntrctParentSubscrNoFetch);
    if (CntrctParentSubscrNoSortDir != null) out.setCntrctParentSubscrNoSortDirection(CntrctParentSubscrNoSortDir);
    if (CntrctParentSubscrNoSortOrder != null) out.setCntrctParentSubscrNoSortOrder(CntrctParentSubscrNoSortOrder);

    Filter[] CntrctParentSubscrNoFilter = DataHelper.mapToFilterArray(CntrctParentSubscrNoMap, Integer.class);
    if (CntrctParentSubscrNoFilter != null) {
      IntegerFilter[] CntrctParentSubscrNoFilters = new IntegerFilter[CntrctParentSubscrNoFilter.length];
      for (int i = 0; i < CntrctParentSubscrNoFilters.length; i++) {
        CntrctParentSubscrNoFilters[i] = (IntegerFilter)CntrctParentSubscrNoFilter[i];
      }
      try {
        out.setCntrctParentSubscrNoFilter(CntrctParentSubscrNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CntrctParentSubscrNoResetsMap = (Map)record.get("CntrctParentSubscrNoResets");
    Boolean CntrctParentSubscrNoResetsFetch = DataHelper.getFetch(CntrctParentSubscrNoResetsMap);
    Boolean CntrctParentSubscrNoResetsSortDir = DataHelper.getSortDirection(CntrctParentSubscrNoResetsMap);
    Integer CntrctParentSubscrNoResetsSortOrder = DataHelper.getSortOrder(CntrctParentSubscrNoResetsMap);
    if (CntrctParentSubscrNoResetsFetch != null) out.setCntrctParentSubscrNoResetsFetch(CntrctParentSubscrNoResetsFetch);
    if (CntrctParentSubscrNoResetsSortDir != null) out.setCntrctParentSubscrNoResetsSortDirection(CntrctParentSubscrNoResetsSortDir);
    if (CntrctParentSubscrNoResetsSortOrder != null) out.setCntrctParentSubscrNoResetsSortOrder(CntrctParentSubscrNoResetsSortOrder);

    Filter[] CntrctParentSubscrNoResetsFilter = DataHelper.mapToFilterArray(CntrctParentSubscrNoResetsMap, Integer.class);
    if (CntrctParentSubscrNoResetsFilter != null) {
      IntegerFilter[] CntrctParentSubscrNoResetsFilters = new IntegerFilter[CntrctParentSubscrNoResetsFilter.length];
      for (int i = 0; i < CntrctParentSubscrNoResetsFilters.length; i++) {
        CntrctParentSubscrNoResetsFilters[i] = (IntegerFilter)CntrctParentSubscrNoResetsFilter[i];
      }
      try {
        out.setCntrctParentSubscrNoResetsFilter(CntrctParentSubscrNoResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
