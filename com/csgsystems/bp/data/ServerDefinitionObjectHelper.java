/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServerDefinitionObjectHelper.java
 * Definition File: Catalog/ServerDefinition.xml
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



/** Helper class to convert ServerDefinitionObject JavaBean objects to/from HashMaps.
 */
public class ServerDefinitionObjectHelper implements ArubaObjectHelper
{
  /** convert ServerDefinitionObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ServerDefinitionObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServerDefinitionObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServerDefinitionObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServerDefinitionObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServerDefinitionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ServerDefinitionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServerDefinitionObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServerDefinitionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServerDefinitionObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServerDefinitionObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServerDefinitionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServerDefinitionObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ServerDefinitionObjectData the converted object
   */
  public static ServerDefinitionObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServerDefinitionObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServerDefinitionObject")
   * @return ServerDefinitionObjectData the converted object
   */
  public static ServerDefinitionObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServerDefinitionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServerDefinitionObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ServerDefinitionObjectFilter the converted object
   */
  public static ServerDefinitionObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServerDefinitionObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServerDefinitionObject")
   * @return ServerDefinitionObjectFilter the converted object
   */
  public static ServerDefinitionObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServerDefinitionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ServerDefinitionObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ServerDefinitionObjectDataList the converted object
   */
  public static ServerDefinitionObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ServerDefinitionObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ServerDefinitionObjectList")
   * @return ServerDefinitionObjectDataList the converted object
   */
  public static ServerDefinitionObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServerDefinitionObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ServerDefinitionObjectData[] array = null;
    if (root != null)
    {
      array = new ServerDefinitionObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ServerDefinitionObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ServerDefinitionObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ServerDefinitionObjectDataList (array, index, total);
  }
  /** convert ServerDefinitionObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServerDefinitionObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ServerDefinitionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ServerTypeSet) record.put ("ServerType", in.ServerType);
  
    if (in._HostnameSet) record.put ("Hostname", in.Hostname);
  
    if (in._IpAddressSet) record.put ("IpAddress", in.IpAddress);
  
    if (in._DsquerySet) record.put ("Dsquery", in.Dsquery);
  
    if (in._DsDatabaseSet) record.put ("DsDatabase", in.DsDatabase);
  
    if (in._ArbordataSet) record.put ("Arbordata", in.Arbordata);
  
    if (in._NumAcctsSet) record.put ("NumAccts", in.NumAccts);
  
    if (in._ServerCapacitySet) record.put ("ServerCapacity", in.ServerCapacity);
  
    if (in._ActiveFlagSet) record.put ("ActiveFlag", in.ActiveFlag);
  
    if (in._UpSinceDtSet) record.put ("UpSinceDt", in.UpSinceDt);
  
    if (in._DownSinceDtSet) record.put ("DownSinceDt", in.DownSinceDt);
  
    if (in._DownSetBySet) record.put ("DownSetBy", in.DownSetBy);
  
    if (in._DownReasonCodeSet) record.put ("DownReasonCode", in.DownReasonCode);
  
    if (in._ServerCategorySet) record.put ("ServerCategory", in.ServerCategory);
      return record;
  }
  /** convert ServerDefinitionObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServerDefinitionObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ServerDefinitionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ServerType, in.ServerTypeSort, in.ServerTypeSortAscending, in.ServerTypeFetch);
      if (map != null) record.put ("ServerType", map);
      map = DataHelper.filterToMap (in.Hostname, in.HostnameSort, in.HostnameSortAscending, in.HostnameFetch, in.HostnameCaseInsensitive);
      if (map != null) record.put ("Hostname", map);
      map = DataHelper.filterToMap (in.IpAddress, in.IpAddressSort, in.IpAddressSortAscending, in.IpAddressFetch, in.IpAddressCaseInsensitive);
      if (map != null) record.put ("IpAddress", map);
      map = DataHelper.filterToMap (in.Dsquery, in.DsquerySort, in.DsquerySortAscending, in.DsqueryFetch, in.DsqueryCaseInsensitive);
      if (map != null) record.put ("Dsquery", map);
      map = DataHelper.filterToMap (in.DsDatabase, in.DsDatabaseSort, in.DsDatabaseSortAscending, in.DsDatabaseFetch, in.DsDatabaseCaseInsensitive);
      if (map != null) record.put ("DsDatabase", map);
      map = DataHelper.filterToMap (in.Arbordata, in.ArbordataSort, in.ArbordataSortAscending, in.ArbordataFetch, in.ArbordataCaseInsensitive);
      if (map != null) record.put ("Arbordata", map);
      map = DataHelper.filterToMap (in.NumAccts, in.NumAcctsSort, in.NumAcctsSortAscending, in.NumAcctsFetch);
      if (map != null) record.put ("NumAccts", map);
      map = DataHelper.filterToMap (in.ServerCapacity, in.ServerCapacitySort, in.ServerCapacitySortAscending, in.ServerCapacityFetch);
      if (map != null) record.put ("ServerCapacity", map);
      map = DataHelper.filterToMap (in.ActiveFlag, in.ActiveFlagSort, in.ActiveFlagSortAscending, in.ActiveFlagFetch);
      if (map != null) record.put ("ActiveFlag", map);
      map = DataHelper.filterToMap (in.UpSinceDt, in.UpSinceDtSort, in.UpSinceDtSortAscending, in.UpSinceDtFetch);
      if (map != null) record.put ("UpSinceDt", map);
      map = DataHelper.filterToMap (in.DownSinceDt, in.DownSinceDtSort, in.DownSinceDtSortAscending, in.DownSinceDtFetch);
      if (map != null) record.put ("DownSinceDt", map);
      map = DataHelper.filterToMap (in.DownSetBy, in.DownSetBySort, in.DownSetBySortAscending, in.DownSetByFetch, in.DownSetByCaseInsensitive);
      if (map != null) record.put ("DownSetBy", map);
      map = DataHelper.filterToMap (in.DownReasonCode, in.DownReasonCodeSort, in.DownReasonCodeSortAscending, in.DownReasonCodeFetch);
      if (map != null) record.put ("DownReasonCode", map);
      map = DataHelper.filterToMap (in.ServerCategory, in.ServerCategorySort, in.ServerCategorySortAscending, in.ServerCategoryFetch);
      if (map != null) record.put ("ServerCategory", map);
    return record;
  }
  /** convert Map to ServerDefinitionObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServerDefinitionObjectData the converted object
   */
  public static ServerDefinitionObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServerDefinitionObjectData out = new ServerDefinitionObjectData ();

    out.Key = ServerDefinitionObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ServerType")) != null)
    {
      out.ServerType = (Integer) obj;
    }
  
    if ((obj = record.get ("Hostname")) != null)
    {
      out.Hostname = (String) obj;
    }
  
    if ((obj = record.get ("IpAddress")) != null)
    {
      out.IpAddress = (String) obj;
    }
  
    if ((obj = record.get ("Dsquery")) != null)
    {
      out.Dsquery = (String) obj;
    }
  
    if ((obj = record.get ("DsDatabase")) != null)
    {
      out.DsDatabase = (String) obj;
    }
  
    if ((obj = record.get ("Arbordata")) != null)
    {
      out.Arbordata = (String) obj;
    }
  
    if ((obj = record.get ("NumAccts")) != null)
    {
      out.NumAccts = (Integer) obj;
    }
  
    if ((obj = record.get ("ServerCapacity")) != null)
    {
      out.ServerCapacity = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveFlag")) != null)
    {
      out.ActiveFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("UpSinceDt")) != null)
    {
      out.UpSinceDt = (Date) obj;
    }
  
    if ((obj = record.get ("DownSinceDt")) != null)
    {
      out.DownSinceDt = (Date) obj;
    }
  
    if ((obj = record.get ("DownSetBy")) != null)
    {
      out.DownSetBy = (String) obj;
    }
  
    if ((obj = record.get ("DownReasonCode")) != null)
    {
      out.DownReasonCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ServerCategory")) != null)
    {
      out.ServerCategory = (Integer) obj;
    }
      return out;
  }
  /** convert Map to ServerDefinitionObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServerDefinitionObjectFilter the converted object
   */
  public static ServerDefinitionObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServerDefinitionObjectFilter out = new ServerDefinitionObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ServerDefinitionObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ServerTypeMap = (Map)record.get("ServerType");
    Boolean ServerTypeFetch = DataHelper.getFetch(ServerTypeMap);
    Boolean ServerTypeSortDir = DataHelper.getSortDirection(ServerTypeMap);
    Integer ServerTypeSortOrder = DataHelper.getSortOrder(ServerTypeMap);
    if (ServerTypeFetch != null) out.setServerTypeFetch(ServerTypeFetch);
    if (ServerTypeSortDir != null) out.setServerTypeSortDirection(ServerTypeSortDir);
    if (ServerTypeSortOrder != null) out.setServerTypeSortOrder(ServerTypeSortOrder);

    Filter[] ServerTypeFilter = DataHelper.mapToFilterArray(ServerTypeMap, Integer.class);
    if (ServerTypeFilter != null) {
      IntegerFilter[] ServerTypeFilters = new IntegerFilter[ServerTypeFilter.length];
      for (int i = 0; i < ServerTypeFilters.length; i++) {
        ServerTypeFilters[i] = (IntegerFilter)ServerTypeFilter[i];
      }
      try {
        out.setServerTypeFilter(ServerTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map HostnameMap = (Map)record.get("Hostname");
    Boolean HostnameFetch = DataHelper.getFetch(HostnameMap);
    Boolean HostnameSortDir = DataHelper.getSortDirection(HostnameMap);
    Integer HostnameSortOrder = DataHelper.getSortOrder(HostnameMap);
    if (HostnameFetch != null) out.setHostnameFetch(HostnameFetch);
    if (HostnameSortDir != null) out.setHostnameSortDirection(HostnameSortDir);
    if (HostnameSortOrder != null) out.setHostnameSortOrder(HostnameSortOrder);

    Filter[] HostnameFilter = DataHelper.mapToFilterArray(HostnameMap, String.class);
    if (HostnameFilter != null) {
      StringFilter[] HostnameFilters = new StringFilter[HostnameFilter.length];
      for (int i = 0; i < HostnameFilters.length; i++) {
        HostnameFilters[i] = (StringFilter)HostnameFilter[i];
      }
      try {
        out.setHostnameFilter(HostnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IpAddressMap = (Map)record.get("IpAddress");
    Boolean IpAddressFetch = DataHelper.getFetch(IpAddressMap);
    Boolean IpAddressSortDir = DataHelper.getSortDirection(IpAddressMap);
    Integer IpAddressSortOrder = DataHelper.getSortOrder(IpAddressMap);
    if (IpAddressFetch != null) out.setIpAddressFetch(IpAddressFetch);
    if (IpAddressSortDir != null) out.setIpAddressSortDirection(IpAddressSortDir);
    if (IpAddressSortOrder != null) out.setIpAddressSortOrder(IpAddressSortOrder);

    Filter[] IpAddressFilter = DataHelper.mapToFilterArray(IpAddressMap, String.class);
    if (IpAddressFilter != null) {
      StringFilter[] IpAddressFilters = new StringFilter[IpAddressFilter.length];
      for (int i = 0; i < IpAddressFilters.length; i++) {
        IpAddressFilters[i] = (StringFilter)IpAddressFilter[i];
      }
      try {
        out.setIpAddressFilter(IpAddressFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DsqueryMap = (Map)record.get("Dsquery");
    Boolean DsqueryFetch = DataHelper.getFetch(DsqueryMap);
    Boolean DsquerySortDir = DataHelper.getSortDirection(DsqueryMap);
    Integer DsquerySortOrder = DataHelper.getSortOrder(DsqueryMap);
    if (DsqueryFetch != null) out.setDsqueryFetch(DsqueryFetch);
    if (DsquerySortDir != null) out.setDsquerySortDirection(DsquerySortDir);
    if (DsquerySortOrder != null) out.setDsquerySortOrder(DsquerySortOrder);

    Filter[] DsqueryFilter = DataHelper.mapToFilterArray(DsqueryMap, String.class);
    if (DsqueryFilter != null) {
      StringFilter[] DsqueryFilters = new StringFilter[DsqueryFilter.length];
      for (int i = 0; i < DsqueryFilters.length; i++) {
        DsqueryFilters[i] = (StringFilter)DsqueryFilter[i];
      }
      try {
        out.setDsqueryFilter(DsqueryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DsDatabaseMap = (Map)record.get("DsDatabase");
    Boolean DsDatabaseFetch = DataHelper.getFetch(DsDatabaseMap);
    Boolean DsDatabaseSortDir = DataHelper.getSortDirection(DsDatabaseMap);
    Integer DsDatabaseSortOrder = DataHelper.getSortOrder(DsDatabaseMap);
    if (DsDatabaseFetch != null) out.setDsDatabaseFetch(DsDatabaseFetch);
    if (DsDatabaseSortDir != null) out.setDsDatabaseSortDirection(DsDatabaseSortDir);
    if (DsDatabaseSortOrder != null) out.setDsDatabaseSortOrder(DsDatabaseSortOrder);

    Filter[] DsDatabaseFilter = DataHelper.mapToFilterArray(DsDatabaseMap, String.class);
    if (DsDatabaseFilter != null) {
      StringFilter[] DsDatabaseFilters = new StringFilter[DsDatabaseFilter.length];
      for (int i = 0; i < DsDatabaseFilters.length; i++) {
        DsDatabaseFilters[i] = (StringFilter)DsDatabaseFilter[i];
      }
      try {
        out.setDsDatabaseFilter(DsDatabaseFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ArbordataMap = (Map)record.get("Arbordata");
    Boolean ArbordataFetch = DataHelper.getFetch(ArbordataMap);
    Boolean ArbordataSortDir = DataHelper.getSortDirection(ArbordataMap);
    Integer ArbordataSortOrder = DataHelper.getSortOrder(ArbordataMap);
    if (ArbordataFetch != null) out.setArbordataFetch(ArbordataFetch);
    if (ArbordataSortDir != null) out.setArbordataSortDirection(ArbordataSortDir);
    if (ArbordataSortOrder != null) out.setArbordataSortOrder(ArbordataSortOrder);

    Filter[] ArbordataFilter = DataHelper.mapToFilterArray(ArbordataMap, String.class);
    if (ArbordataFilter != null) {
      StringFilter[] ArbordataFilters = new StringFilter[ArbordataFilter.length];
      for (int i = 0; i < ArbordataFilters.length; i++) {
        ArbordataFilters[i] = (StringFilter)ArbordataFilter[i];
      }
      try {
        out.setArbordataFilter(ArbordataFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NumAcctsMap = (Map)record.get("NumAccts");
    Boolean NumAcctsFetch = DataHelper.getFetch(NumAcctsMap);
    Boolean NumAcctsSortDir = DataHelper.getSortDirection(NumAcctsMap);
    Integer NumAcctsSortOrder = DataHelper.getSortOrder(NumAcctsMap);
    if (NumAcctsFetch != null) out.setNumAcctsFetch(NumAcctsFetch);
    if (NumAcctsSortDir != null) out.setNumAcctsSortDirection(NumAcctsSortDir);
    if (NumAcctsSortOrder != null) out.setNumAcctsSortOrder(NumAcctsSortOrder);

    Filter[] NumAcctsFilter = DataHelper.mapToFilterArray(NumAcctsMap, Integer.class);
    if (NumAcctsFilter != null) {
      IntegerFilter[] NumAcctsFilters = new IntegerFilter[NumAcctsFilter.length];
      for (int i = 0; i < NumAcctsFilters.length; i++) {
        NumAcctsFilters[i] = (IntegerFilter)NumAcctsFilter[i];
      }
      try {
        out.setNumAcctsFilter(NumAcctsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServerCapacityMap = (Map)record.get("ServerCapacity");
    Boolean ServerCapacityFetch = DataHelper.getFetch(ServerCapacityMap);
    Boolean ServerCapacitySortDir = DataHelper.getSortDirection(ServerCapacityMap);
    Integer ServerCapacitySortOrder = DataHelper.getSortOrder(ServerCapacityMap);
    if (ServerCapacityFetch != null) out.setServerCapacityFetch(ServerCapacityFetch);
    if (ServerCapacitySortDir != null) out.setServerCapacitySortDirection(ServerCapacitySortDir);
    if (ServerCapacitySortOrder != null) out.setServerCapacitySortOrder(ServerCapacitySortOrder);

    Filter[] ServerCapacityFilter = DataHelper.mapToFilterArray(ServerCapacityMap, Integer.class);
    if (ServerCapacityFilter != null) {
      IntegerFilter[] ServerCapacityFilters = new IntegerFilter[ServerCapacityFilter.length];
      for (int i = 0; i < ServerCapacityFilters.length; i++) {
        ServerCapacityFilters[i] = (IntegerFilter)ServerCapacityFilter[i];
      }
      try {
        out.setServerCapacityFilter(ServerCapacityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveFlagMap = (Map)record.get("ActiveFlag");
    Boolean ActiveFlagFetch = DataHelper.getFetch(ActiveFlagMap);
    Boolean ActiveFlagSortDir = DataHelper.getSortDirection(ActiveFlagMap);
    Integer ActiveFlagSortOrder = DataHelper.getSortOrder(ActiveFlagMap);
    if (ActiveFlagFetch != null) out.setActiveFlagFetch(ActiveFlagFetch);
    if (ActiveFlagSortDir != null) out.setActiveFlagSortDirection(ActiveFlagSortDir);
    if (ActiveFlagSortOrder != null) out.setActiveFlagSortOrder(ActiveFlagSortOrder);

    Filter[] ActiveFlagFilter = DataHelper.mapToFilterArray(ActiveFlagMap, Boolean.class);
    if (ActiveFlagFilter != null) {
      BooleanFilter[] ActiveFlagFilters = new BooleanFilter[ActiveFlagFilter.length];
      for (int i = 0; i < ActiveFlagFilters.length; i++) {
        ActiveFlagFilters[i] = (BooleanFilter)ActiveFlagFilter[i];
      }
      try {
        out.setActiveFlagFilter(ActiveFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UpSinceDtMap = (Map)record.get("UpSinceDt");
    Boolean UpSinceDtFetch = DataHelper.getFetch(UpSinceDtMap);
    Boolean UpSinceDtSortDir = DataHelper.getSortDirection(UpSinceDtMap);
    Integer UpSinceDtSortOrder = DataHelper.getSortOrder(UpSinceDtMap);
    if (UpSinceDtFetch != null) out.setUpSinceDtFetch(UpSinceDtFetch);
    if (UpSinceDtSortDir != null) out.setUpSinceDtSortDirection(UpSinceDtSortDir);
    if (UpSinceDtSortOrder != null) out.setUpSinceDtSortOrder(UpSinceDtSortOrder);

    Filter[] UpSinceDtFilter = DataHelper.mapToFilterArray(UpSinceDtMap, Date.class);
    if (UpSinceDtFilter != null) {
      DateFilter[] UpSinceDtFilters = new DateFilter[UpSinceDtFilter.length];
      for (int i = 0; i < UpSinceDtFilters.length; i++) {
        UpSinceDtFilters[i] = (DateFilter)UpSinceDtFilter[i];
      }
      try {
        out.setUpSinceDtFilter(UpSinceDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DownSinceDtMap = (Map)record.get("DownSinceDt");
    Boolean DownSinceDtFetch = DataHelper.getFetch(DownSinceDtMap);
    Boolean DownSinceDtSortDir = DataHelper.getSortDirection(DownSinceDtMap);
    Integer DownSinceDtSortOrder = DataHelper.getSortOrder(DownSinceDtMap);
    if (DownSinceDtFetch != null) out.setDownSinceDtFetch(DownSinceDtFetch);
    if (DownSinceDtSortDir != null) out.setDownSinceDtSortDirection(DownSinceDtSortDir);
    if (DownSinceDtSortOrder != null) out.setDownSinceDtSortOrder(DownSinceDtSortOrder);

    Filter[] DownSinceDtFilter = DataHelper.mapToFilterArray(DownSinceDtMap, Date.class);
    if (DownSinceDtFilter != null) {
      DateFilter[] DownSinceDtFilters = new DateFilter[DownSinceDtFilter.length];
      for (int i = 0; i < DownSinceDtFilters.length; i++) {
        DownSinceDtFilters[i] = (DateFilter)DownSinceDtFilter[i];
      }
      try {
        out.setDownSinceDtFilter(DownSinceDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DownSetByMap = (Map)record.get("DownSetBy");
    Boolean DownSetByFetch = DataHelper.getFetch(DownSetByMap);
    Boolean DownSetBySortDir = DataHelper.getSortDirection(DownSetByMap);
    Integer DownSetBySortOrder = DataHelper.getSortOrder(DownSetByMap);
    if (DownSetByFetch != null) out.setDownSetByFetch(DownSetByFetch);
    if (DownSetBySortDir != null) out.setDownSetBySortDirection(DownSetBySortDir);
    if (DownSetBySortOrder != null) out.setDownSetBySortOrder(DownSetBySortOrder);

    Filter[] DownSetByFilter = DataHelper.mapToFilterArray(DownSetByMap, String.class);
    if (DownSetByFilter != null) {
      StringFilter[] DownSetByFilters = new StringFilter[DownSetByFilter.length];
      for (int i = 0; i < DownSetByFilters.length; i++) {
        DownSetByFilters[i] = (StringFilter)DownSetByFilter[i];
      }
      try {
        out.setDownSetByFilter(DownSetByFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DownReasonCodeMap = (Map)record.get("DownReasonCode");
    Boolean DownReasonCodeFetch = DataHelper.getFetch(DownReasonCodeMap);
    Boolean DownReasonCodeSortDir = DataHelper.getSortDirection(DownReasonCodeMap);
    Integer DownReasonCodeSortOrder = DataHelper.getSortOrder(DownReasonCodeMap);
    if (DownReasonCodeFetch != null) out.setDownReasonCodeFetch(DownReasonCodeFetch);
    if (DownReasonCodeSortDir != null) out.setDownReasonCodeSortDirection(DownReasonCodeSortDir);
    if (DownReasonCodeSortOrder != null) out.setDownReasonCodeSortOrder(DownReasonCodeSortOrder);

    Filter[] DownReasonCodeFilter = DataHelper.mapToFilterArray(DownReasonCodeMap, Integer.class);
    if (DownReasonCodeFilter != null) {
      IntegerFilter[] DownReasonCodeFilters = new IntegerFilter[DownReasonCodeFilter.length];
      for (int i = 0; i < DownReasonCodeFilters.length; i++) {
        DownReasonCodeFilters[i] = (IntegerFilter)DownReasonCodeFilter[i];
      }
      try {
        out.setDownReasonCodeFilter(DownReasonCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServerCategoryMap = (Map)record.get("ServerCategory");
    Boolean ServerCategoryFetch = DataHelper.getFetch(ServerCategoryMap);
    Boolean ServerCategorySortDir = DataHelper.getSortDirection(ServerCategoryMap);
    Integer ServerCategorySortOrder = DataHelper.getSortOrder(ServerCategoryMap);
    if (ServerCategoryFetch != null) out.setServerCategoryFetch(ServerCategoryFetch);
    if (ServerCategorySortDir != null) out.setServerCategorySortDirection(ServerCategorySortDir);
    if (ServerCategorySortOrder != null) out.setServerCategorySortOrder(ServerCategorySortOrder);

    Filter[] ServerCategoryFilter = DataHelper.mapToFilterArray(ServerCategoryMap, Integer.class);
    if (ServerCategoryFilter != null) {
      IntegerFilter[] ServerCategoryFilters = new IntegerFilter[ServerCategoryFilter.length];
      for (int i = 0; i < ServerCategoryFilters.length; i++) {
        ServerCategoryFilters[i] = (IntegerFilter)ServerCategoryFilter[i];
      }
      try {
        out.setServerCategoryFilter(ServerCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
