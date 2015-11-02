/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillMessageGroupMapObjectHelper.java
 * Definition File: Admin/BillMessageGroupMap.xml
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



/** Helper class to convert BillMessageGroupMapObject JavaBean objects to/from HashMaps.
 */
public class BillMessageGroupMapObjectHelper implements ArubaObjectHelper
{
  /** convert BillMessageGroupMapObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BillMessageGroupMapObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillMessageGroupMapObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillMessageGroupMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillMessageGroupMapObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillMessageGroupMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BillMessageGroupMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillMessageGroupMapObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillMessageGroupMapObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillMessageGroupMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillMessageGroupMapObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillMessageGroupMapObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillMessageGroupMapObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BillMessageGroupMapObjectData the converted object
   */
  public static BillMessageGroupMapObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillMessageGroupMapObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillMessageGroupMapObject")
   * @return BillMessageGroupMapObjectData the converted object
   */
  public static BillMessageGroupMapObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillMessageGroupMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillMessageGroupMapObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BillMessageGroupMapObjectFilter the converted object
   */
  public static BillMessageGroupMapObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillMessageGroupMapObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillMessageGroupMapObject")
   * @return BillMessageGroupMapObjectFilter the converted object
   */
  public static BillMessageGroupMapObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillMessageGroupMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BillMessageGroupMapObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BillMessageGroupMapObjectDataList the converted object
   */
  public static BillMessageGroupMapObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BillMessageGroupMapObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BillMessageGroupMapObjectList")
   * @return BillMessageGroupMapObjectDataList the converted object
   */
  public static BillMessageGroupMapObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillMessageGroupMapObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BillMessageGroupMapObjectData[] array = null;
    if (root != null)
    {
      array = new BillMessageGroupMapObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BillMessageGroupMapObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BillMessageGroupMapObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BillMessageGroupMapObjectDataList (array, index, total);
  }
  /** convert BillMessageGroupMapObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillMessageGroupMapObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", BillMessageGroupMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._MsgTriggerIdSet) record.put ("MsgTriggerId", in.MsgTriggerId);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert BillMessageGroupMapObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillMessageGroupMapObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", BillMessageGroupMapObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.MsgTriggerId, in.MsgTriggerIdSort, in.MsgTriggerIdSortAscending, in.MsgTriggerIdFetch);
      if (map != null) record.put ("MsgTriggerId", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to BillMessageGroupMapObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillMessageGroupMapObjectData the converted object
   */
  public static BillMessageGroupMapObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillMessageGroupMapObjectData out = new BillMessageGroupMapObjectData ();

    out.Key = BillMessageGroupMapObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("MsgTriggerId")) != null)
    {
      out.MsgTriggerId = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to BillMessageGroupMapObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillMessageGroupMapObjectFilter the converted object
   */
  public static BillMessageGroupMapObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillMessageGroupMapObjectFilter out = new BillMessageGroupMapObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = BillMessageGroupMapObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map MsgTriggerIdMap = (Map)record.get("MsgTriggerId");
    Boolean MsgTriggerIdFetch = DataHelper.getFetch(MsgTriggerIdMap);
    Boolean MsgTriggerIdSortDir = DataHelper.getSortDirection(MsgTriggerIdMap);
    Integer MsgTriggerIdSortOrder = DataHelper.getSortOrder(MsgTriggerIdMap);
    if (MsgTriggerIdFetch != null) out.setMsgTriggerIdFetch(MsgTriggerIdFetch);
    if (MsgTriggerIdSortDir != null) out.setMsgTriggerIdSortDirection(MsgTriggerIdSortDir);
    if (MsgTriggerIdSortOrder != null) out.setMsgTriggerIdSortOrder(MsgTriggerIdSortOrder);

    Filter[] MsgTriggerIdFilter = DataHelper.mapToFilterArray(MsgTriggerIdMap, Integer.class);
    if (MsgTriggerIdFilter != null) {
      IntegerFilter[] MsgTriggerIdFilters = new IntegerFilter[MsgTriggerIdFilter.length];
      for (int i = 0; i < MsgTriggerIdFilters.length; i++) {
        MsgTriggerIdFilters[i] = (IntegerFilter)MsgTriggerIdFilter[i];
      }
      try {
        out.setMsgTriggerIdFilter(MsgTriggerIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDateMap = (Map)record.get("ActiveDate");
    Boolean ActiveDateFetch = DataHelper.getFetch(ActiveDateMap);
    Boolean ActiveDateSortDir = DataHelper.getSortDirection(ActiveDateMap);
    Integer ActiveDateSortOrder = DataHelper.getSortOrder(ActiveDateMap);
    if (ActiveDateFetch != null) out.setActiveDateFetch(ActiveDateFetch);
    if (ActiveDateSortDir != null) out.setActiveDateSortDirection(ActiveDateSortDir);
    if (ActiveDateSortOrder != null) out.setActiveDateSortOrder(ActiveDateSortOrder);

    Filter[] ActiveDateFilter = DataHelper.mapToFilterArray(ActiveDateMap, Date.class);
    if (ActiveDateFilter != null) {
      DateFilter[] ActiveDateFilters = new DateFilter[ActiveDateFilter.length];
      for (int i = 0; i < ActiveDateFilters.length; i++) {
        ActiveDateFilters[i] = (DateFilter)ActiveDateFilter[i];
      }
      try {
        out.setActiveDateFilter(ActiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDateMap = (Map)record.get("InactiveDate");
    Boolean InactiveDateFetch = DataHelper.getFetch(InactiveDateMap);
    Boolean InactiveDateSortDir = DataHelper.getSortDirection(InactiveDateMap);
    Integer InactiveDateSortOrder = DataHelper.getSortOrder(InactiveDateMap);
    if (InactiveDateFetch != null) out.setInactiveDateFetch(InactiveDateFetch);
    if (InactiveDateSortDir != null) out.setInactiveDateSortDirection(InactiveDateSortDir);
    if (InactiveDateSortOrder != null) out.setInactiveDateSortOrder(InactiveDateSortOrder);

    Filter[] InactiveDateFilter = DataHelper.mapToFilterArray(InactiveDateMap, Date.class);
    if (InactiveDateFilter != null) {
      DateFilter[] InactiveDateFilters = new DateFilter[InactiveDateFilter.length];
      for (int i = 0; i < InactiveDateFilters.length; i++) {
        InactiveDateFilters[i] = (DateFilter)InactiveDateFilter[i];
      }
      try {
        out.setInactiveDateFilter(InactiveDateFilters);
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
