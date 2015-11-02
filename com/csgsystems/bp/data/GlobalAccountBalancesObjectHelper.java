/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalAccountBalancesObjectHelper.java
 * Definition File: Admin/GlobalAccountBalances.xml
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



/** Helper class to convert GlobalAccountBalancesObject JavaBean objects to/from HashMaps.
 */
public class GlobalAccountBalancesObjectHelper implements ArubaObjectHelper
{
  /** convert GlobalAccountBalancesObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (GlobalAccountBalancesObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalAccountBalancesObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalAccountBalancesObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalAccountBalancesObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalAccountBalancesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert GlobalAccountBalancesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GlobalAccountBalancesObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalAccountBalancesObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalAccountBalancesObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalAccountBalancesObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalAccountBalancesObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GlobalAccountBalancesObjectData.
   * @param record the Map containing the data to convert to the object
   * @return GlobalAccountBalancesObjectData the converted object
   */
  public static GlobalAccountBalancesObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GlobalAccountBalancesObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GlobalAccountBalancesObject")
   * @return GlobalAccountBalancesObjectData the converted object
   */
  public static GlobalAccountBalancesObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalAccountBalancesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GlobalAccountBalancesObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return GlobalAccountBalancesObjectFilter the converted object
   */
  public static GlobalAccountBalancesObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GlobalAccountBalancesObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GlobalAccountBalancesObject")
   * @return GlobalAccountBalancesObjectFilter the converted object
   */
  public static GlobalAccountBalancesObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalAccountBalancesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to GlobalAccountBalancesObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return GlobalAccountBalancesObjectDataList the converted object
   */
  public static GlobalAccountBalancesObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to GlobalAccountBalancesObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "GlobalAccountBalancesObjectList")
   * @return GlobalAccountBalancesObjectDataList the converted object
   */
  public static GlobalAccountBalancesObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalAccountBalancesObjectList";
    Object[] root = (Object[]) record.get (rootName);
    GlobalAccountBalancesObjectData[] array = null;
    if (root != null)
    {
      array = new GlobalAccountBalancesObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = GlobalAccountBalancesObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new GlobalAccountBalancesObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new GlobalAccountBalancesObjectDataList (array, index, total);
  }
  /** convert GlobalAccountBalancesObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GlobalAccountBalancesObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", GlobalAccountBalancesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BalanceTrackingIdServSet) record.put ("BalanceTrackingIdServ", in.BalanceTrackingIdServ);
  
    if (in._BalanceAccountInternalIdSet) record.put ("BalanceAccountInternalId", in.BalanceAccountInternalId);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._IsBalancePrepaidSet) record.put ("IsBalancePrepaid", in.IsBalancePrepaid);
  
    if (in._AuthorizationFlagSet) record.put ("AuthorizationFlag", in.AuthorizationFlag);
  
    if (in._RegulatoryIdSet) record.put ("RegulatoryId", in.RegulatoryId);
  
    if (in._PrioritySet) record.put ("Priority", in.Priority);
  
    if (in._BalanceDescSet) record.put ("BalanceDesc", in.BalanceDesc);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert GlobalAccountBalancesObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GlobalAccountBalancesObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", GlobalAccountBalancesObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BalanceTrackingIdServ, in.BalanceTrackingIdServSort, in.BalanceTrackingIdServSortAscending, in.BalanceTrackingIdServFetch);
      if (map != null) record.put ("BalanceTrackingIdServ", map);
      map = DataHelper.filterToMap (in.BalanceAccountInternalId, in.BalanceAccountInternalIdSort, in.BalanceAccountInternalIdSortAscending, in.BalanceAccountInternalIdFetch);
      if (map != null) record.put ("BalanceAccountInternalId", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.IsBalancePrepaid, in.IsBalancePrepaidSort, in.IsBalancePrepaidSortAscending, in.IsBalancePrepaidFetch);
      if (map != null) record.put ("IsBalancePrepaid", map);
      map = DataHelper.filterToMap (in.AuthorizationFlag, in.AuthorizationFlagSort, in.AuthorizationFlagSortAscending, in.AuthorizationFlagFetch);
      if (map != null) record.put ("AuthorizationFlag", map);
      map = DataHelper.filterToMap (in.RegulatoryId, in.RegulatoryIdSort, in.RegulatoryIdSortAscending, in.RegulatoryIdFetch);
      if (map != null) record.put ("RegulatoryId", map);
      map = DataHelper.filterToMap (in.Priority, in.PrioritySort, in.PrioritySortAscending, in.PriorityFetch);
      if (map != null) record.put ("Priority", map);
      map = DataHelper.filterToMap (in.BalanceDesc, in.BalanceDescSort, in.BalanceDescSortAscending, in.BalanceDescFetch, in.BalanceDescCaseInsensitive);
      if (map != null) record.put ("BalanceDesc", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to GlobalAccountBalancesObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalAccountBalancesObjectData the converted object
   */
  public static GlobalAccountBalancesObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalAccountBalancesObjectData out = new GlobalAccountBalancesObjectData ();

    out.Key = GlobalAccountBalancesObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BalanceTrackingIdServ")) != null)
    {
      out.BalanceTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("BalanceAccountInternalId")) != null)
    {
      out.BalanceAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("IsBalancePrepaid")) != null)
    {
      out.IsBalancePrepaid = (Integer) obj;
    }
  
    if ((obj = record.get ("AuthorizationFlag")) != null)
    {
      out.AuthorizationFlag = (Integer) obj;
    }
  
    if ((obj = record.get ("RegulatoryId")) != null)
    {
      out.RegulatoryId = (Integer) obj;
    }
  
    if ((obj = record.get ("Priority")) != null)
    {
      out.Priority = (Integer) obj;
    }
  
    if ((obj = record.get ("BalanceDesc")) != null)
    {
      out.BalanceDesc = (String) obj;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
    }
  
    if ((obj = record.get ("CreateDt")) != null)
    {
      out.CreateDt = (Date) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to GlobalAccountBalancesObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalAccountBalancesObjectFilter the converted object
   */
  public static GlobalAccountBalancesObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalAccountBalancesObjectFilter out = new GlobalAccountBalancesObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = GlobalAccountBalancesObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map BalanceTrackingIdServMap = (Map)record.get("BalanceTrackingIdServ");
    Boolean BalanceTrackingIdServFetch = DataHelper.getFetch(BalanceTrackingIdServMap);
    Boolean BalanceTrackingIdServSortDir = DataHelper.getSortDirection(BalanceTrackingIdServMap);
    Integer BalanceTrackingIdServSortOrder = DataHelper.getSortOrder(BalanceTrackingIdServMap);
    if (BalanceTrackingIdServFetch != null) out.setBalanceTrackingIdServFetch(BalanceTrackingIdServFetch);
    if (BalanceTrackingIdServSortDir != null) out.setBalanceTrackingIdServSortDirection(BalanceTrackingIdServSortDir);
    if (BalanceTrackingIdServSortOrder != null) out.setBalanceTrackingIdServSortOrder(BalanceTrackingIdServSortOrder);

    Filter[] BalanceTrackingIdServFilter = DataHelper.mapToFilterArray(BalanceTrackingIdServMap, Integer.class);
    if (BalanceTrackingIdServFilter != null) {
      IntegerFilter[] BalanceTrackingIdServFilters = new IntegerFilter[BalanceTrackingIdServFilter.length];
      for (int i = 0; i < BalanceTrackingIdServFilters.length; i++) {
        BalanceTrackingIdServFilters[i] = (IntegerFilter)BalanceTrackingIdServFilter[i];
      }
      try {
        out.setBalanceTrackingIdServFilter(BalanceTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BalanceAccountInternalIdMap = (Map)record.get("BalanceAccountInternalId");
    Boolean BalanceAccountInternalIdFetch = DataHelper.getFetch(BalanceAccountInternalIdMap);
    Boolean BalanceAccountInternalIdSortDir = DataHelper.getSortDirection(BalanceAccountInternalIdMap);
    Integer BalanceAccountInternalIdSortOrder = DataHelper.getSortOrder(BalanceAccountInternalIdMap);
    if (BalanceAccountInternalIdFetch != null) out.setBalanceAccountInternalIdFetch(BalanceAccountInternalIdFetch);
    if (BalanceAccountInternalIdSortDir != null) out.setBalanceAccountInternalIdSortDirection(BalanceAccountInternalIdSortDir);
    if (BalanceAccountInternalIdSortOrder != null) out.setBalanceAccountInternalIdSortOrder(BalanceAccountInternalIdSortOrder);

    Filter[] BalanceAccountInternalIdFilter = DataHelper.mapToFilterArray(BalanceAccountInternalIdMap, Integer.class);
    if (BalanceAccountInternalIdFilter != null) {
      IntegerFilter[] BalanceAccountInternalIdFilters = new IntegerFilter[BalanceAccountInternalIdFilter.length];
      for (int i = 0; i < BalanceAccountInternalIdFilters.length; i++) {
        BalanceAccountInternalIdFilters[i] = (IntegerFilter)BalanceAccountInternalIdFilter[i];
      }
      try {
        out.setBalanceAccountInternalIdFilter(BalanceAccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OpenItemIdMap = (Map)record.get("OpenItemId");
    Boolean OpenItemIdFetch = DataHelper.getFetch(OpenItemIdMap);
    Boolean OpenItemIdSortDir = DataHelper.getSortDirection(OpenItemIdMap);
    Integer OpenItemIdSortOrder = DataHelper.getSortOrder(OpenItemIdMap);
    if (OpenItemIdFetch != null) out.setOpenItemIdFetch(OpenItemIdFetch);
    if (OpenItemIdSortDir != null) out.setOpenItemIdSortDirection(OpenItemIdSortDir);
    if (OpenItemIdSortOrder != null) out.setOpenItemIdSortOrder(OpenItemIdSortOrder);

    Filter[] OpenItemIdFilter = DataHelper.mapToFilterArray(OpenItemIdMap, Integer.class);
    if (OpenItemIdFilter != null) {
      IntegerFilter[] OpenItemIdFilters = new IntegerFilter[OpenItemIdFilter.length];
      for (int i = 0; i < OpenItemIdFilters.length; i++) {
        OpenItemIdFilters[i] = (IntegerFilter)OpenItemIdFilter[i];
      }
      try {
        out.setOpenItemIdFilter(OpenItemIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsBalancePrepaidMap = (Map)record.get("IsBalancePrepaid");
    Boolean IsBalancePrepaidFetch = DataHelper.getFetch(IsBalancePrepaidMap);
    Boolean IsBalancePrepaidSortDir = DataHelper.getSortDirection(IsBalancePrepaidMap);
    Integer IsBalancePrepaidSortOrder = DataHelper.getSortOrder(IsBalancePrepaidMap);
    if (IsBalancePrepaidFetch != null) out.setIsBalancePrepaidFetch(IsBalancePrepaidFetch);
    if (IsBalancePrepaidSortDir != null) out.setIsBalancePrepaidSortDirection(IsBalancePrepaidSortDir);
    if (IsBalancePrepaidSortOrder != null) out.setIsBalancePrepaidSortOrder(IsBalancePrepaidSortOrder);

    Filter[] IsBalancePrepaidFilter = DataHelper.mapToFilterArray(IsBalancePrepaidMap, Integer.class);
    if (IsBalancePrepaidFilter != null) {
      IntegerFilter[] IsBalancePrepaidFilters = new IntegerFilter[IsBalancePrepaidFilter.length];
      for (int i = 0; i < IsBalancePrepaidFilters.length; i++) {
        IsBalancePrepaidFilters[i] = (IntegerFilter)IsBalancePrepaidFilter[i];
      }
      try {
        out.setIsBalancePrepaidFilter(IsBalancePrepaidFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AuthorizationFlagMap = (Map)record.get("AuthorizationFlag");
    Boolean AuthorizationFlagFetch = DataHelper.getFetch(AuthorizationFlagMap);
    Boolean AuthorizationFlagSortDir = DataHelper.getSortDirection(AuthorizationFlagMap);
    Integer AuthorizationFlagSortOrder = DataHelper.getSortOrder(AuthorizationFlagMap);
    if (AuthorizationFlagFetch != null) out.setAuthorizationFlagFetch(AuthorizationFlagFetch);
    if (AuthorizationFlagSortDir != null) out.setAuthorizationFlagSortDirection(AuthorizationFlagSortDir);
    if (AuthorizationFlagSortOrder != null) out.setAuthorizationFlagSortOrder(AuthorizationFlagSortOrder);

    Filter[] AuthorizationFlagFilter = DataHelper.mapToFilterArray(AuthorizationFlagMap, Integer.class);
    if (AuthorizationFlagFilter != null) {
      IntegerFilter[] AuthorizationFlagFilters = new IntegerFilter[AuthorizationFlagFilter.length];
      for (int i = 0; i < AuthorizationFlagFilters.length; i++) {
        AuthorizationFlagFilters[i] = (IntegerFilter)AuthorizationFlagFilter[i];
      }
      try {
        out.setAuthorizationFlagFilter(AuthorizationFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RegulatoryIdMap = (Map)record.get("RegulatoryId");
    Boolean RegulatoryIdFetch = DataHelper.getFetch(RegulatoryIdMap);
    Boolean RegulatoryIdSortDir = DataHelper.getSortDirection(RegulatoryIdMap);
    Integer RegulatoryIdSortOrder = DataHelper.getSortOrder(RegulatoryIdMap);
    if (RegulatoryIdFetch != null) out.setRegulatoryIdFetch(RegulatoryIdFetch);
    if (RegulatoryIdSortDir != null) out.setRegulatoryIdSortDirection(RegulatoryIdSortDir);
    if (RegulatoryIdSortOrder != null) out.setRegulatoryIdSortOrder(RegulatoryIdSortOrder);

    Filter[] RegulatoryIdFilter = DataHelper.mapToFilterArray(RegulatoryIdMap, Integer.class);
    if (RegulatoryIdFilter != null) {
      IntegerFilter[] RegulatoryIdFilters = new IntegerFilter[RegulatoryIdFilter.length];
      for (int i = 0; i < RegulatoryIdFilters.length; i++) {
        RegulatoryIdFilters[i] = (IntegerFilter)RegulatoryIdFilter[i];
      }
      try {
        out.setRegulatoryIdFilter(RegulatoryIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PriorityMap = (Map)record.get("Priority");
    Boolean PriorityFetch = DataHelper.getFetch(PriorityMap);
    Boolean PrioritySortDir = DataHelper.getSortDirection(PriorityMap);
    Integer PrioritySortOrder = DataHelper.getSortOrder(PriorityMap);
    if (PriorityFetch != null) out.setPriorityFetch(PriorityFetch);
    if (PrioritySortDir != null) out.setPrioritySortDirection(PrioritySortDir);
    if (PrioritySortOrder != null) out.setPrioritySortOrder(PrioritySortOrder);

    Filter[] PriorityFilter = DataHelper.mapToFilterArray(PriorityMap, Integer.class);
    if (PriorityFilter != null) {
      IntegerFilter[] PriorityFilters = new IntegerFilter[PriorityFilter.length];
      for (int i = 0; i < PriorityFilters.length; i++) {
        PriorityFilters[i] = (IntegerFilter)PriorityFilter[i];
      }
      try {
        out.setPriorityFilter(PriorityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BalanceDescMap = (Map)record.get("BalanceDesc");
    Boolean BalanceDescFetch = DataHelper.getFetch(BalanceDescMap);
    Boolean BalanceDescSortDir = DataHelper.getSortDirection(BalanceDescMap);
    Integer BalanceDescSortOrder = DataHelper.getSortOrder(BalanceDescMap);
    if (BalanceDescFetch != null) out.setBalanceDescFetch(BalanceDescFetch);
    if (BalanceDescSortDir != null) out.setBalanceDescSortDirection(BalanceDescSortDir);
    if (BalanceDescSortOrder != null) out.setBalanceDescSortOrder(BalanceDescSortOrder);

    Filter[] BalanceDescFilter = DataHelper.mapToFilterArray(BalanceDescMap, String.class);
    if (BalanceDescFilter != null) {
      StringFilter[] BalanceDescFilters = new StringFilter[BalanceDescFilter.length];
      for (int i = 0; i < BalanceDescFilters.length; i++) {
        BalanceDescFilters[i] = (StringFilter)BalanceDescFilter[i];
      }
      try {
        out.setBalanceDescFilter(BalanceDescFilters);
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
  
    Map CreateDtMap = (Map)record.get("CreateDt");
    Boolean CreateDtFetch = DataHelper.getFetch(CreateDtMap);
    Boolean CreateDtSortDir = DataHelper.getSortDirection(CreateDtMap);
    Integer CreateDtSortOrder = DataHelper.getSortOrder(CreateDtMap);
    if (CreateDtFetch != null) out.setCreateDtFetch(CreateDtFetch);
    if (CreateDtSortDir != null) out.setCreateDtSortDirection(CreateDtSortDir);
    if (CreateDtSortOrder != null) out.setCreateDtSortOrder(CreateDtSortOrder);

    Filter[] CreateDtFilter = DataHelper.mapToFilterArray(CreateDtMap, Date.class);
    if (CreateDtFilter != null) {
      DateFilter[] CreateDtFilters = new DateFilter[CreateDtFilter.length];
      for (int i = 0; i < CreateDtFilters.length; i++) {
        CreateDtFilters[i] = (DateFilter)CreateDtFilter[i];
      }
      try {
        out.setCreateDtFilter(CreateDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDtMap = (Map)record.get("ActiveDt");
    Boolean ActiveDtFetch = DataHelper.getFetch(ActiveDtMap);
    Boolean ActiveDtSortDir = DataHelper.getSortDirection(ActiveDtMap);
    Integer ActiveDtSortOrder = DataHelper.getSortOrder(ActiveDtMap);
    if (ActiveDtFetch != null) out.setActiveDtFetch(ActiveDtFetch);
    if (ActiveDtSortDir != null) out.setActiveDtSortDirection(ActiveDtSortDir);
    if (ActiveDtSortOrder != null) out.setActiveDtSortOrder(ActiveDtSortOrder);

    Filter[] ActiveDtFilter = DataHelper.mapToFilterArray(ActiveDtMap, Date.class);
    if (ActiveDtFilter != null) {
      DateFilter[] ActiveDtFilters = new DateFilter[ActiveDtFilter.length];
      for (int i = 0; i < ActiveDtFilters.length; i++) {
        ActiveDtFilters[i] = (DateFilter)ActiveDtFilter[i];
      }
      try {
        out.setActiveDtFilter(ActiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDtMap = (Map)record.get("InactiveDt");
    Boolean InactiveDtFetch = DataHelper.getFetch(InactiveDtMap);
    Boolean InactiveDtSortDir = DataHelper.getSortDirection(InactiveDtMap);
    Integer InactiveDtSortOrder = DataHelper.getSortOrder(InactiveDtMap);
    if (InactiveDtFetch != null) out.setInactiveDtFetch(InactiveDtFetch);
    if (InactiveDtSortDir != null) out.setInactiveDtSortDirection(InactiveDtSortDir);
    if (InactiveDtSortOrder != null) out.setInactiveDtSortOrder(InactiveDtSortOrder);

    Filter[] InactiveDtFilter = DataHelper.mapToFilterArray(InactiveDtMap, Date.class);
    if (InactiveDtFilter != null) {
      DateFilter[] InactiveDtFilters = new DateFilter[InactiveDtFilter.length];
      for (int i = 0; i < InactiveDtFilters.length; i++) {
        InactiveDtFilters[i] = (DateFilter)InactiveDtFilter[i];
      }
      try {
        out.setInactiveDtFilter(InactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDtMap = (Map)record.get("ChgDt");
    Boolean ChgDtFetch = DataHelper.getFetch(ChgDtMap);
    Boolean ChgDtSortDir = DataHelper.getSortDirection(ChgDtMap);
    Integer ChgDtSortOrder = DataHelper.getSortOrder(ChgDtMap);
    if (ChgDtFetch != null) out.setChgDtFetch(ChgDtFetch);
    if (ChgDtSortDir != null) out.setChgDtSortDirection(ChgDtSortDir);
    if (ChgDtSortOrder != null) out.setChgDtSortOrder(ChgDtSortOrder);

    Filter[] ChgDtFilter = DataHelper.mapToFilterArray(ChgDtMap, Date.class);
    if (ChgDtFilter != null) {
      DateFilter[] ChgDtFilters = new DateFilter[ChgDtFilter.length];
      for (int i = 0; i < ChgDtFilters.length; i++) {
        ChgDtFilters[i] = (DateFilter)ChgDtFilter[i];
      }
      try {
        out.setChgDtFilter(ChgDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    Map ConfigTagIdMap = (Map)record.get("ConfigTagId");
    Boolean ConfigTagIdFetch = DataHelper.getFetch(ConfigTagIdMap);
    Boolean ConfigTagIdSortDir = DataHelper.getSortDirection(ConfigTagIdMap);
    Integer ConfigTagIdSortOrder = DataHelper.getSortOrder(ConfigTagIdMap);
    if (ConfigTagIdFetch != null) out.setConfigTagIdFetch(ConfigTagIdFetch);
    if (ConfigTagIdSortDir != null) out.setConfigTagIdSortDirection(ConfigTagIdSortDir);
    if (ConfigTagIdSortOrder != null) out.setConfigTagIdSortOrder(ConfigTagIdSortOrder);

    Filter[] ConfigTagIdFilter = DataHelper.mapToFilterArray(ConfigTagIdMap, String.class);
    if (ConfigTagIdFilter != null) {
      StringFilter[] ConfigTagIdFilters = new StringFilter[ConfigTagIdFilter.length];
      for (int i = 0; i < ConfigTagIdFilters.length; i++) {
        ConfigTagIdFilters[i] = (StringFilter)ConfigTagIdFilter[i];
      }
      try {
        out.setConfigTagIdFilter(ConfigTagIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
