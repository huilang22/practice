/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalOpenItemIdMapObjectHelper.java
 * Definition File: Admin/GlobalOpenItemIdMap.xml
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



/** Helper class to convert GlobalOpenItemIdMapObject JavaBean objects to/from HashMaps.
 */
public class GlobalOpenItemIdMapObjectHelper implements ArubaObjectHelper
{
  /** convert GlobalOpenItemIdMapObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (GlobalOpenItemIdMapObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalOpenItemIdMapObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalOpenItemIdMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalOpenItemIdMapObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalOpenItemIdMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert GlobalOpenItemIdMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GlobalOpenItemIdMapObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalOpenItemIdMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalOpenItemIdMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalOpenItemIdMapObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalOpenItemIdMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GlobalOpenItemIdMapObjectData.
   * @param record the Map containing the data to convert to the object
   * @return GlobalOpenItemIdMapObjectData the converted object
   */
  public static GlobalOpenItemIdMapObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GlobalOpenItemIdMapObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GlobalOpenItemIdMapObject")
   * @return GlobalOpenItemIdMapObjectData the converted object
   */
  public static GlobalOpenItemIdMapObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalOpenItemIdMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GlobalOpenItemIdMapObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return GlobalOpenItemIdMapObjectFilter the converted object
   */
  public static GlobalOpenItemIdMapObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GlobalOpenItemIdMapObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GlobalOpenItemIdMapObject")
   * @return GlobalOpenItemIdMapObjectFilter the converted object
   */
  public static GlobalOpenItemIdMapObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalOpenItemIdMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to GlobalOpenItemIdMapObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return GlobalOpenItemIdMapObjectDataList the converted object
   */
  public static GlobalOpenItemIdMapObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to GlobalOpenItemIdMapObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "GlobalOpenItemIdMapObjectList")
   * @return GlobalOpenItemIdMapObjectDataList the converted object
   */
  public static GlobalOpenItemIdMapObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalOpenItemIdMapObjectList";
    Object[] root = (Object[]) record.get (rootName);
    GlobalOpenItemIdMapObjectData[] array = null;
    if (root != null)
    {
      array = new GlobalOpenItemIdMapObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = GlobalOpenItemIdMapObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new GlobalOpenItemIdMapObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new GlobalOpenItemIdMapObjectDataList (array, index, total);
  }
  /** convert GlobalOpenItemIdMapObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GlobalOpenItemIdMapObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", GlobalOpenItemIdMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._ChargeElementTypeSet) record.put ("ChargeElementType", in.ChargeElementType);
  
    if (in._ChargeElementValueSet) record.put ("ChargeElementValue", in.ChargeElementValue);
  
    if (in._BalanceAccountInternalIdSet) record.put ("BalanceAccountInternalId", in.BalanceAccountInternalId);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._OrderLevelSet) record.put ("OrderLevel", in.OrderLevel);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert GlobalOpenItemIdMapObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GlobalOpenItemIdMapObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", GlobalOpenItemIdMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.ChargeElementType, in.ChargeElementTypeSort, in.ChargeElementTypeSortAscending, in.ChargeElementTypeFetch);
      if (map != null) record.put ("ChargeElementType", map);
      map = DataHelper.filterToMap (in.ChargeElementValue, in.ChargeElementValueSort, in.ChargeElementValueSortAscending, in.ChargeElementValueFetch);
      if (map != null) record.put ("ChargeElementValue", map);
      map = DataHelper.filterToMap (in.BalanceAccountInternalId, in.BalanceAccountInternalIdSort, in.BalanceAccountInternalIdSortAscending, in.BalanceAccountInternalIdFetch);
      if (map != null) record.put ("BalanceAccountInternalId", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.OrderLevel, in.OrderLevelSort, in.OrderLevelSortAscending, in.OrderLevelFetch);
      if (map != null) record.put ("OrderLevel", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to GlobalOpenItemIdMapObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalOpenItemIdMapObjectData the converted object
   */
  public static GlobalOpenItemIdMapObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalOpenItemIdMapObjectData out = new GlobalOpenItemIdMapObjectData ();

    out.Key = GlobalOpenItemIdMapObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (Integer) obj;
    }
  
    if ((obj = record.get ("ChargeElementType")) != null)
    {
      out.ChargeElementType = (Integer) obj;
    }
  
    if ((obj = record.get ("ChargeElementValue")) != null)
    {
      out.ChargeElementValue = (Integer) obj;
    }
  
    if ((obj = record.get ("BalanceAccountInternalId")) != null)
    {
      out.BalanceAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
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
  
    if ((obj = record.get ("OrderLevel")) != null)
    {
      out.OrderLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to GlobalOpenItemIdMapObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalOpenItemIdMapObjectFilter the converted object
   */
  public static GlobalOpenItemIdMapObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalOpenItemIdMapObjectFilter out = new GlobalOpenItemIdMapObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = GlobalOpenItemIdMapObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map AccountInternalIdMap = (Map)record.get("AccountInternalId");
    Boolean AccountInternalIdFetch = DataHelper.getFetch(AccountInternalIdMap);
    Boolean AccountInternalIdSortDir = DataHelper.getSortDirection(AccountInternalIdMap);
    Integer AccountInternalIdSortOrder = DataHelper.getSortOrder(AccountInternalIdMap);
    if (AccountInternalIdFetch != null) out.setAccountInternalIdFetch(AccountInternalIdFetch);
    if (AccountInternalIdSortDir != null) out.setAccountInternalIdSortDirection(AccountInternalIdSortDir);
    if (AccountInternalIdSortOrder != null) out.setAccountInternalIdSortOrder(AccountInternalIdSortOrder);

    Filter[] AccountInternalIdFilter = DataHelper.mapToFilterArray(AccountInternalIdMap, Integer.class);
    if (AccountInternalIdFilter != null) {
      IntegerFilter[] AccountInternalIdFilters = new IntegerFilter[AccountInternalIdFilter.length];
      for (int i = 0; i < AccountInternalIdFilters.length; i++) {
        AccountInternalIdFilters[i] = (IntegerFilter)AccountInternalIdFilter[i];
      }
      try {
        out.setAccountInternalIdFilter(AccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdMap = (Map)record.get("ServiceInternalId");
    Boolean ServiceInternalIdFetch = DataHelper.getFetch(ServiceInternalIdMap);
    Boolean ServiceInternalIdSortDir = DataHelper.getSortDirection(ServiceInternalIdMap);
    Integer ServiceInternalIdSortOrder = DataHelper.getSortOrder(ServiceInternalIdMap);
    if (ServiceInternalIdFetch != null) out.setServiceInternalIdFetch(ServiceInternalIdFetch);
    if (ServiceInternalIdSortDir != null) out.setServiceInternalIdSortDirection(ServiceInternalIdSortDir);
    if (ServiceInternalIdSortOrder != null) out.setServiceInternalIdSortOrder(ServiceInternalIdSortOrder);

    Filter[] ServiceInternalIdFilter = DataHelper.mapToFilterArray(ServiceInternalIdMap, Integer.class);
    if (ServiceInternalIdFilter != null) {
      IntegerFilter[] ServiceInternalIdFilters = new IntegerFilter[ServiceInternalIdFilter.length];
      for (int i = 0; i < ServiceInternalIdFilters.length; i++) {
        ServiceInternalIdFilters[i] = (IntegerFilter)ServiceInternalIdFilter[i];
      }
      try {
        out.setServiceInternalIdFilter(ServiceInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdResetsMap = (Map)record.get("ServiceInternalIdResets");
    Boolean ServiceInternalIdResetsFetch = DataHelper.getFetch(ServiceInternalIdResetsMap);
    Boolean ServiceInternalIdResetsSortDir = DataHelper.getSortDirection(ServiceInternalIdResetsMap);
    Integer ServiceInternalIdResetsSortOrder = DataHelper.getSortOrder(ServiceInternalIdResetsMap);
    if (ServiceInternalIdResetsFetch != null) out.setServiceInternalIdResetsFetch(ServiceInternalIdResetsFetch);
    if (ServiceInternalIdResetsSortDir != null) out.setServiceInternalIdResetsSortDirection(ServiceInternalIdResetsSortDir);
    if (ServiceInternalIdResetsSortOrder != null) out.setServiceInternalIdResetsSortOrder(ServiceInternalIdResetsSortOrder);

    Filter[] ServiceInternalIdResetsFilter = DataHelper.mapToFilterArray(ServiceInternalIdResetsMap, Integer.class);
    if (ServiceInternalIdResetsFilter != null) {
      IntegerFilter[] ServiceInternalIdResetsFilters = new IntegerFilter[ServiceInternalIdResetsFilter.length];
      for (int i = 0; i < ServiceInternalIdResetsFilters.length; i++) {
        ServiceInternalIdResetsFilters[i] = (IntegerFilter)ServiceInternalIdResetsFilter[i];
      }
      try {
        out.setServiceInternalIdResetsFilter(ServiceInternalIdResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChargeElementTypeMap = (Map)record.get("ChargeElementType");
    Boolean ChargeElementTypeFetch = DataHelper.getFetch(ChargeElementTypeMap);
    Boolean ChargeElementTypeSortDir = DataHelper.getSortDirection(ChargeElementTypeMap);
    Integer ChargeElementTypeSortOrder = DataHelper.getSortOrder(ChargeElementTypeMap);
    if (ChargeElementTypeFetch != null) out.setChargeElementTypeFetch(ChargeElementTypeFetch);
    if (ChargeElementTypeSortDir != null) out.setChargeElementTypeSortDirection(ChargeElementTypeSortDir);
    if (ChargeElementTypeSortOrder != null) out.setChargeElementTypeSortOrder(ChargeElementTypeSortOrder);

    Filter[] ChargeElementTypeFilter = DataHelper.mapToFilterArray(ChargeElementTypeMap, Integer.class);
    if (ChargeElementTypeFilter != null) {
      IntegerFilter[] ChargeElementTypeFilters = new IntegerFilter[ChargeElementTypeFilter.length];
      for (int i = 0; i < ChargeElementTypeFilters.length; i++) {
        ChargeElementTypeFilters[i] = (IntegerFilter)ChargeElementTypeFilter[i];
      }
      try {
        out.setChargeElementTypeFilter(ChargeElementTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChargeElementValueMap = (Map)record.get("ChargeElementValue");
    Boolean ChargeElementValueFetch = DataHelper.getFetch(ChargeElementValueMap);
    Boolean ChargeElementValueSortDir = DataHelper.getSortDirection(ChargeElementValueMap);
    Integer ChargeElementValueSortOrder = DataHelper.getSortOrder(ChargeElementValueMap);
    if (ChargeElementValueFetch != null) out.setChargeElementValueFetch(ChargeElementValueFetch);
    if (ChargeElementValueSortDir != null) out.setChargeElementValueSortDirection(ChargeElementValueSortDir);
    if (ChargeElementValueSortOrder != null) out.setChargeElementValueSortOrder(ChargeElementValueSortOrder);

    Filter[] ChargeElementValueFilter = DataHelper.mapToFilterArray(ChargeElementValueMap, Integer.class);
    if (ChargeElementValueFilter != null) {
      IntegerFilter[] ChargeElementValueFilters = new IntegerFilter[ChargeElementValueFilter.length];
      for (int i = 0; i < ChargeElementValueFilters.length; i++) {
        ChargeElementValueFilters[i] = (IntegerFilter)ChargeElementValueFilter[i];
      }
      try {
        out.setChargeElementValueFilter(ChargeElementValueFilters);
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
  
    Map OrderLevelMap = (Map)record.get("OrderLevel");
    Boolean OrderLevelFetch = DataHelper.getFetch(OrderLevelMap);
    Boolean OrderLevelSortDir = DataHelper.getSortDirection(OrderLevelMap);
    Integer OrderLevelSortOrder = DataHelper.getSortOrder(OrderLevelMap);
    if (OrderLevelFetch != null) out.setOrderLevelFetch(OrderLevelFetch);
    if (OrderLevelSortDir != null) out.setOrderLevelSortDirection(OrderLevelSortDir);
    if (OrderLevelSortOrder != null) out.setOrderLevelSortOrder(OrderLevelSortOrder);

    Filter[] OrderLevelFilter = DataHelper.mapToFilterArray(OrderLevelMap, Integer.class);
    if (OrderLevelFilter != null) {
      IntegerFilter[] OrderLevelFilters = new IntegerFilter[OrderLevelFilter.length];
      for (int i = 0; i < OrderLevelFilters.length; i++) {
        OrderLevelFilters[i] = (IntegerFilter)OrderLevelFilter[i];
      }
      try {
        out.setOrderLevelFilter(OrderLevelFilters);
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
