/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseContactsObjectHelper.java
 * Definition File: Customer/ClearingHouseContacts.xml
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



/** Helper class to convert ClearingHouseContactsObject JavaBean objects to/from HashMaps.
 */
public class ClearingHouseContactsObjectHelper implements ArubaObjectHelper
{
  /** convert ClearingHouseContactsObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ClearingHouseContactsObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ClearingHouseContactsObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ClearingHouseContactsObject")
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseContactsObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ClearingHouseContactsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ClearingHouseContactsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseContactsObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ClearingHouseContactsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ClearingHouseContactsObject")
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseContactsObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ClearingHouseContactsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ClearingHouseContactsObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ClearingHouseContactsObjectData the converted object
   */
  public static ClearingHouseContactsObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ClearingHouseContactsObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ClearingHouseContactsObject")
   * @return ClearingHouseContactsObjectData the converted object
   */
  public static ClearingHouseContactsObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseContactsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ClearingHouseContactsObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ClearingHouseContactsObjectFilter the converted object
   */
  public static ClearingHouseContactsObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ClearingHouseContactsObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ClearingHouseContactsObject")
   * @return ClearingHouseContactsObjectFilter the converted object
   */
  public static ClearingHouseContactsObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseContactsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ClearingHouseContactsObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ClearingHouseContactsObjectDataList the converted object
   */
  public static ClearingHouseContactsObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ClearingHouseContactsObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ClearingHouseContactsObjectList")
   * @return ClearingHouseContactsObjectDataList the converted object
   */
  public static ClearingHouseContactsObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseContactsObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ClearingHouseContactsObjectData[] array = null;
    if (root != null)
    {
      array = new ClearingHouseContactsObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ClearingHouseContactsObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ClearingHouseContactsObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ClearingHouseContactsObjectDataList (array, index, total);
  }
  /** convert ClearingHouseContactsObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ClearingHouseContactsObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ClearingHouseContactsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ClearingHouseIdSet) record.put ("ClearingHouseId", in.ClearingHouseId);
  
    if (in._ModuleSet) record.put ("Module", in.Module);
  
    if (in._IsSendSet) record.put ("IsSend", in.IsSend);
  
    if (in._ChFormatTypeSet) record.put ("ChFormatType", in.ChFormatType);
  
    if (in._CreditTransTypeSet) record.put ("CreditTransType", in.CreditTransType);
  
    if (in._DebitTransTypeSet) record.put ("DebitTransType", in.DebitTransType);
  
    if (in._AllowAutoPostSet) record.put ("AllowAutoPost", in.AllowAutoPost);
  
    if (in._AutoPostDelaySet) record.put ("AutoPostDelay", in.AutoPostDelay);
  
    if (in._ChgbResubmitDelaySet) record.put ("ChgbResubmitDelay", in.ChgbResubmitDelay);
  
    if (in._CollectionDelaySet) record.put ("CollectionDelay", in.CollectionDelay);
  
    if (in._SuppressPrenotesSet) record.put ("SuppressPrenotes", in.SuppressPrenotes);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert ClearingHouseContactsObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ClearingHouseContactsObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ClearingHouseContactsObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ClearingHouseId, in.ClearingHouseIdSort, in.ClearingHouseIdSortAscending, in.ClearingHouseIdFetch, in.ClearingHouseIdCaseInsensitive);
      if (map != null) record.put ("ClearingHouseId", map);
      map = DataHelper.filterToMap (in.Module, in.ModuleSort, in.ModuleSortAscending, in.ModuleFetch, in.ModuleCaseInsensitive);
      if (map != null) record.put ("Module", map);
      map = DataHelper.filterToMap (in.IsSend, in.IsSendSort, in.IsSendSortAscending, in.IsSendFetch);
      if (map != null) record.put ("IsSend", map);
      map = DataHelper.filterToMap (in.ChFormatType, in.ChFormatTypeSort, in.ChFormatTypeSortAscending, in.ChFormatTypeFetch);
      if (map != null) record.put ("ChFormatType", map);
      map = DataHelper.filterToMap (in.CreditTransType, in.CreditTransTypeSort, in.CreditTransTypeSortAscending, in.CreditTransTypeFetch);
      if (map != null) record.put ("CreditTransType", map);
      map = DataHelper.filterToMap (in.DebitTransType, in.DebitTransTypeSort, in.DebitTransTypeSortAscending, in.DebitTransTypeFetch);
      if (map != null) record.put ("DebitTransType", map);
      map = DataHelper.filterToMap (in.AllowAutoPost, in.AllowAutoPostSort, in.AllowAutoPostSortAscending, in.AllowAutoPostFetch);
      if (map != null) record.put ("AllowAutoPost", map);
      map = DataHelper.filterToMap (in.AutoPostDelay, in.AutoPostDelaySort, in.AutoPostDelaySortAscending, in.AutoPostDelayFetch);
      if (map != null) record.put ("AutoPostDelay", map);
      map = DataHelper.filterToMap (in.ChgbResubmitDelay, in.ChgbResubmitDelaySort, in.ChgbResubmitDelaySortAscending, in.ChgbResubmitDelayFetch);
      if (map != null) record.put ("ChgbResubmitDelay", map);
      map = DataHelper.filterToMap (in.CollectionDelay, in.CollectionDelaySort, in.CollectionDelaySortAscending, in.CollectionDelayFetch);
      if (map != null) record.put ("CollectionDelay", map);
      map = DataHelper.filterToMap (in.SuppressPrenotes, in.SuppressPrenotesSort, in.SuppressPrenotesSortAscending, in.SuppressPrenotesFetch);
      if (map != null) record.put ("SuppressPrenotes", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to ClearingHouseContactsObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ClearingHouseContactsObjectData the converted object
   */
  public static ClearingHouseContactsObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ClearingHouseContactsObjectData out = new ClearingHouseContactsObjectData ();

    out.Key = ClearingHouseContactsObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ClearingHouseId")) != null)
    {
      out.ClearingHouseId = (String) obj;
    }
  
    if ((obj = record.get ("Module")) != null)
    {
      out.Module = (String) obj;
    }
  
    if ((obj = record.get ("IsSend")) != null)
    {
      out.IsSend = (Integer) obj;
    }
  
    if ((obj = record.get ("ChFormatType")) != null)
    {
      out.ChFormatType = (Integer) obj;
    }
  
    if ((obj = record.get ("CreditTransType")) != null)
    {
      out.CreditTransType = (Integer) obj;
    }
  
    if ((obj = record.get ("DebitTransType")) != null)
    {
      out.DebitTransType = (Integer) obj;
    }
  
    if ((obj = record.get ("AllowAutoPost")) != null)
    {
      out.AllowAutoPost = (Boolean) obj;
    }
  
    if ((obj = record.get ("AutoPostDelay")) != null)
    {
      out.AutoPostDelay = (Integer) obj;
    }
  
    if ((obj = record.get ("ChgbResubmitDelay")) != null)
    {
      out.ChgbResubmitDelay = (Integer) obj;
    }
  
    if ((obj = record.get ("CollectionDelay")) != null)
    {
      out.CollectionDelay = (Integer) obj;
    }
  
    if ((obj = record.get ("SuppressPrenotes")) != null)
    {
      out.SuppressPrenotes = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to ClearingHouseContactsObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ClearingHouseContactsObjectFilter the converted object
   */
  public static ClearingHouseContactsObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ClearingHouseContactsObjectFilter out = new ClearingHouseContactsObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ClearingHouseContactsObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ClearingHouseIdMap = (Map)record.get("ClearingHouseId");
    Boolean ClearingHouseIdFetch = DataHelper.getFetch(ClearingHouseIdMap);
    Boolean ClearingHouseIdSortDir = DataHelper.getSortDirection(ClearingHouseIdMap);
    Integer ClearingHouseIdSortOrder = DataHelper.getSortOrder(ClearingHouseIdMap);
    if (ClearingHouseIdFetch != null) out.setClearingHouseIdFetch(ClearingHouseIdFetch);
    if (ClearingHouseIdSortDir != null) out.setClearingHouseIdSortDirection(ClearingHouseIdSortDir);
    if (ClearingHouseIdSortOrder != null) out.setClearingHouseIdSortOrder(ClearingHouseIdSortOrder);

    Filter[] ClearingHouseIdFilter = DataHelper.mapToFilterArray(ClearingHouseIdMap, String.class);
    if (ClearingHouseIdFilter != null) {
      StringFilter[] ClearingHouseIdFilters = new StringFilter[ClearingHouseIdFilter.length];
      for (int i = 0; i < ClearingHouseIdFilters.length; i++) {
        ClearingHouseIdFilters[i] = (StringFilter)ClearingHouseIdFilter[i];
      }
      try {
        out.setClearingHouseIdFilter(ClearingHouseIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ModuleMap = (Map)record.get("Module");
    Boolean ModuleFetch = DataHelper.getFetch(ModuleMap);
    Boolean ModuleSortDir = DataHelper.getSortDirection(ModuleMap);
    Integer ModuleSortOrder = DataHelper.getSortOrder(ModuleMap);
    if (ModuleFetch != null) out.setModuleFetch(ModuleFetch);
    if (ModuleSortDir != null) out.setModuleSortDirection(ModuleSortDir);
    if (ModuleSortOrder != null) out.setModuleSortOrder(ModuleSortOrder);

    Filter[] ModuleFilter = DataHelper.mapToFilterArray(ModuleMap, String.class);
    if (ModuleFilter != null) {
      StringFilter[] ModuleFilters = new StringFilter[ModuleFilter.length];
      for (int i = 0; i < ModuleFilters.length; i++) {
        ModuleFilters[i] = (StringFilter)ModuleFilter[i];
      }
      try {
        out.setModuleFilter(ModuleFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsSendMap = (Map)record.get("IsSend");
    Boolean IsSendFetch = DataHelper.getFetch(IsSendMap);
    Boolean IsSendSortDir = DataHelper.getSortDirection(IsSendMap);
    Integer IsSendSortOrder = DataHelper.getSortOrder(IsSendMap);
    if (IsSendFetch != null) out.setIsSendFetch(IsSendFetch);
    if (IsSendSortDir != null) out.setIsSendSortDirection(IsSendSortDir);
    if (IsSendSortOrder != null) out.setIsSendSortOrder(IsSendSortOrder);

    Filter[] IsSendFilter = DataHelper.mapToFilterArray(IsSendMap, Integer.class);
    if (IsSendFilter != null) {
      IntegerFilter[] IsSendFilters = new IntegerFilter[IsSendFilter.length];
      for (int i = 0; i < IsSendFilters.length; i++) {
        IsSendFilters[i] = (IntegerFilter)IsSendFilter[i];
      }
      try {
        out.setIsSendFilter(IsSendFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChFormatTypeMap = (Map)record.get("ChFormatType");
    Boolean ChFormatTypeFetch = DataHelper.getFetch(ChFormatTypeMap);
    Boolean ChFormatTypeSortDir = DataHelper.getSortDirection(ChFormatTypeMap);
    Integer ChFormatTypeSortOrder = DataHelper.getSortOrder(ChFormatTypeMap);
    if (ChFormatTypeFetch != null) out.setChFormatTypeFetch(ChFormatTypeFetch);
    if (ChFormatTypeSortDir != null) out.setChFormatTypeSortDirection(ChFormatTypeSortDir);
    if (ChFormatTypeSortOrder != null) out.setChFormatTypeSortOrder(ChFormatTypeSortOrder);

    Filter[] ChFormatTypeFilter = DataHelper.mapToFilterArray(ChFormatTypeMap, Integer.class);
    if (ChFormatTypeFilter != null) {
      IntegerFilter[] ChFormatTypeFilters = new IntegerFilter[ChFormatTypeFilter.length];
      for (int i = 0; i < ChFormatTypeFilters.length; i++) {
        ChFormatTypeFilters[i] = (IntegerFilter)ChFormatTypeFilter[i];
      }
      try {
        out.setChFormatTypeFilter(ChFormatTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CreditTransTypeMap = (Map)record.get("CreditTransType");
    Boolean CreditTransTypeFetch = DataHelper.getFetch(CreditTransTypeMap);
    Boolean CreditTransTypeSortDir = DataHelper.getSortDirection(CreditTransTypeMap);
    Integer CreditTransTypeSortOrder = DataHelper.getSortOrder(CreditTransTypeMap);
    if (CreditTransTypeFetch != null) out.setCreditTransTypeFetch(CreditTransTypeFetch);
    if (CreditTransTypeSortDir != null) out.setCreditTransTypeSortDirection(CreditTransTypeSortDir);
    if (CreditTransTypeSortOrder != null) out.setCreditTransTypeSortOrder(CreditTransTypeSortOrder);

    Filter[] CreditTransTypeFilter = DataHelper.mapToFilterArray(CreditTransTypeMap, Integer.class);
    if (CreditTransTypeFilter != null) {
      IntegerFilter[] CreditTransTypeFilters = new IntegerFilter[CreditTransTypeFilter.length];
      for (int i = 0; i < CreditTransTypeFilters.length; i++) {
        CreditTransTypeFilters[i] = (IntegerFilter)CreditTransTypeFilter[i];
      }
      try {
        out.setCreditTransTypeFilter(CreditTransTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DebitTransTypeMap = (Map)record.get("DebitTransType");
    Boolean DebitTransTypeFetch = DataHelper.getFetch(DebitTransTypeMap);
    Boolean DebitTransTypeSortDir = DataHelper.getSortDirection(DebitTransTypeMap);
    Integer DebitTransTypeSortOrder = DataHelper.getSortOrder(DebitTransTypeMap);
    if (DebitTransTypeFetch != null) out.setDebitTransTypeFetch(DebitTransTypeFetch);
    if (DebitTransTypeSortDir != null) out.setDebitTransTypeSortDirection(DebitTransTypeSortDir);
    if (DebitTransTypeSortOrder != null) out.setDebitTransTypeSortOrder(DebitTransTypeSortOrder);

    Filter[] DebitTransTypeFilter = DataHelper.mapToFilterArray(DebitTransTypeMap, Integer.class);
    if (DebitTransTypeFilter != null) {
      IntegerFilter[] DebitTransTypeFilters = new IntegerFilter[DebitTransTypeFilter.length];
      for (int i = 0; i < DebitTransTypeFilters.length; i++) {
        DebitTransTypeFilters[i] = (IntegerFilter)DebitTransTypeFilter[i];
      }
      try {
        out.setDebitTransTypeFilter(DebitTransTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllowAutoPostMap = (Map)record.get("AllowAutoPost");
    Boolean AllowAutoPostFetch = DataHelper.getFetch(AllowAutoPostMap);
    Boolean AllowAutoPostSortDir = DataHelper.getSortDirection(AllowAutoPostMap);
    Integer AllowAutoPostSortOrder = DataHelper.getSortOrder(AllowAutoPostMap);
    if (AllowAutoPostFetch != null) out.setAllowAutoPostFetch(AllowAutoPostFetch);
    if (AllowAutoPostSortDir != null) out.setAllowAutoPostSortDirection(AllowAutoPostSortDir);
    if (AllowAutoPostSortOrder != null) out.setAllowAutoPostSortOrder(AllowAutoPostSortOrder);

    Filter[] AllowAutoPostFilter = DataHelper.mapToFilterArray(AllowAutoPostMap, Boolean.class);
    if (AllowAutoPostFilter != null) {
      BooleanFilter[] AllowAutoPostFilters = new BooleanFilter[AllowAutoPostFilter.length];
      for (int i = 0; i < AllowAutoPostFilters.length; i++) {
        AllowAutoPostFilters[i] = (BooleanFilter)AllowAutoPostFilter[i];
      }
      try {
        out.setAllowAutoPostFilter(AllowAutoPostFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AutoPostDelayMap = (Map)record.get("AutoPostDelay");
    Boolean AutoPostDelayFetch = DataHelper.getFetch(AutoPostDelayMap);
    Boolean AutoPostDelaySortDir = DataHelper.getSortDirection(AutoPostDelayMap);
    Integer AutoPostDelaySortOrder = DataHelper.getSortOrder(AutoPostDelayMap);
    if (AutoPostDelayFetch != null) out.setAutoPostDelayFetch(AutoPostDelayFetch);
    if (AutoPostDelaySortDir != null) out.setAutoPostDelaySortDirection(AutoPostDelaySortDir);
    if (AutoPostDelaySortOrder != null) out.setAutoPostDelaySortOrder(AutoPostDelaySortOrder);

    Filter[] AutoPostDelayFilter = DataHelper.mapToFilterArray(AutoPostDelayMap, Integer.class);
    if (AutoPostDelayFilter != null) {
      IntegerFilter[] AutoPostDelayFilters = new IntegerFilter[AutoPostDelayFilter.length];
      for (int i = 0; i < AutoPostDelayFilters.length; i++) {
        AutoPostDelayFilters[i] = (IntegerFilter)AutoPostDelayFilter[i];
      }
      try {
        out.setAutoPostDelayFilter(AutoPostDelayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgbResubmitDelayMap = (Map)record.get("ChgbResubmitDelay");
    Boolean ChgbResubmitDelayFetch = DataHelper.getFetch(ChgbResubmitDelayMap);
    Boolean ChgbResubmitDelaySortDir = DataHelper.getSortDirection(ChgbResubmitDelayMap);
    Integer ChgbResubmitDelaySortOrder = DataHelper.getSortOrder(ChgbResubmitDelayMap);
    if (ChgbResubmitDelayFetch != null) out.setChgbResubmitDelayFetch(ChgbResubmitDelayFetch);
    if (ChgbResubmitDelaySortDir != null) out.setChgbResubmitDelaySortDirection(ChgbResubmitDelaySortDir);
    if (ChgbResubmitDelaySortOrder != null) out.setChgbResubmitDelaySortOrder(ChgbResubmitDelaySortOrder);

    Filter[] ChgbResubmitDelayFilter = DataHelper.mapToFilterArray(ChgbResubmitDelayMap, Integer.class);
    if (ChgbResubmitDelayFilter != null) {
      IntegerFilter[] ChgbResubmitDelayFilters = new IntegerFilter[ChgbResubmitDelayFilter.length];
      for (int i = 0; i < ChgbResubmitDelayFilters.length; i++) {
        ChgbResubmitDelayFilters[i] = (IntegerFilter)ChgbResubmitDelayFilter[i];
      }
      try {
        out.setChgbResubmitDelayFilter(ChgbResubmitDelayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CollectionDelayMap = (Map)record.get("CollectionDelay");
    Boolean CollectionDelayFetch = DataHelper.getFetch(CollectionDelayMap);
    Boolean CollectionDelaySortDir = DataHelper.getSortDirection(CollectionDelayMap);
    Integer CollectionDelaySortOrder = DataHelper.getSortOrder(CollectionDelayMap);
    if (CollectionDelayFetch != null) out.setCollectionDelayFetch(CollectionDelayFetch);
    if (CollectionDelaySortDir != null) out.setCollectionDelaySortDirection(CollectionDelaySortDir);
    if (CollectionDelaySortOrder != null) out.setCollectionDelaySortOrder(CollectionDelaySortOrder);

    Filter[] CollectionDelayFilter = DataHelper.mapToFilterArray(CollectionDelayMap, Integer.class);
    if (CollectionDelayFilter != null) {
      IntegerFilter[] CollectionDelayFilters = new IntegerFilter[CollectionDelayFilter.length];
      for (int i = 0; i < CollectionDelayFilters.length; i++) {
        CollectionDelayFilters[i] = (IntegerFilter)CollectionDelayFilter[i];
      }
      try {
        out.setCollectionDelayFilter(CollectionDelayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SuppressPrenotesMap = (Map)record.get("SuppressPrenotes");
    Boolean SuppressPrenotesFetch = DataHelper.getFetch(SuppressPrenotesMap);
    Boolean SuppressPrenotesSortDir = DataHelper.getSortDirection(SuppressPrenotesMap);
    Integer SuppressPrenotesSortOrder = DataHelper.getSortOrder(SuppressPrenotesMap);
    if (SuppressPrenotesFetch != null) out.setSuppressPrenotesFetch(SuppressPrenotesFetch);
    if (SuppressPrenotesSortDir != null) out.setSuppressPrenotesSortDirection(SuppressPrenotesSortDir);
    if (SuppressPrenotesSortOrder != null) out.setSuppressPrenotesSortOrder(SuppressPrenotesSortOrder);

    Filter[] SuppressPrenotesFilter = DataHelper.mapToFilterArray(SuppressPrenotesMap, Boolean.class);
    if (SuppressPrenotesFilter != null) {
      BooleanFilter[] SuppressPrenotesFilters = new BooleanFilter[SuppressPrenotesFilter.length];
      for (int i = 0; i < SuppressPrenotesFilters.length; i++) {
        SuppressPrenotesFilters[i] = (BooleanFilter)SuppressPrenotesFilter[i];
      }
      try {
        out.setSuppressPrenotesFilter(SuppressPrenotesFilters);
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
