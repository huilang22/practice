/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAssignmentObjectHelper.java
 * Definition File: Admin/TaxAssignment.xml
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



/** Helper class to convert TaxAssignmentObject JavaBean objects to/from HashMaps.
 */
public class TaxAssignmentObjectHelper implements ArubaObjectHelper
{
  /** convert TaxAssignmentObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (TaxAssignmentObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAssignmentObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAssignmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAssignmentObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAssignmentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert TaxAssignmentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxAssignmentObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAssignmentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAssignmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAssignmentObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAssignmentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TaxAssignmentObjectData.
   * @param record the Map containing the data to convert to the object
   * @return TaxAssignmentObjectData the converted object
   */
  public static TaxAssignmentObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TaxAssignmentObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TaxAssignmentObject")
   * @return TaxAssignmentObjectData the converted object
   */
  public static TaxAssignmentObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAssignmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TaxAssignmentObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return TaxAssignmentObjectFilter the converted object
   */
  public static TaxAssignmentObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TaxAssignmentObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TaxAssignmentObject")
   * @return TaxAssignmentObjectFilter the converted object
   */
  public static TaxAssignmentObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAssignmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to TaxAssignmentObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return TaxAssignmentObjectDataList the converted object
   */
  public static TaxAssignmentObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to TaxAssignmentObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "TaxAssignmentObjectList")
   * @return TaxAssignmentObjectDataList the converted object
   */
  public static TaxAssignmentObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAssignmentObjectList";
    Object[] root = (Object[]) record.get (rootName);
    TaxAssignmentObjectData[] array = null;
    if (root != null)
    {
      array = new TaxAssignmentObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = TaxAssignmentObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new TaxAssignmentObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new TaxAssignmentObjectDataList (array, index, total);
  }
  /** convert TaxAssignmentObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxAssignmentObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", TaxAssignmentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ProviderIdSet) record.put ("ProviderId", in.ProviderId);
  
    if (in._OwningCostCtrSet) record.put ("OwningCostCtr", in.OwningCostCtr);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert TaxAssignmentObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxAssignmentObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", TaxAssignmentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ProviderId, in.ProviderIdSort, in.ProviderIdSortAscending, in.ProviderIdFetch);
      if (map != null) record.put ("ProviderId", map);
      map = DataHelper.filterToMap (in.OwningCostCtr, in.OwningCostCtrSort, in.OwningCostCtrSortAscending, in.OwningCostCtrFetch);
      if (map != null) record.put ("OwningCostCtr", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to TaxAssignmentObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAssignmentObjectData the converted object
   */
  public static TaxAssignmentObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAssignmentObjectData out = new TaxAssignmentObjectData ();

    out.Key = TaxAssignmentObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ProviderId")) != null)
    {
      out.ProviderId = (Integer) obj;
    }
  
    if ((obj = record.get ("OwningCostCtr")) != null)
    {
      out.OwningCostCtr = (Integer) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to TaxAssignmentObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAssignmentObjectFilter the converted object
   */
  public static TaxAssignmentObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAssignmentObjectFilter out = new TaxAssignmentObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = TaxAssignmentObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ProviderIdMap = (Map)record.get("ProviderId");
    Boolean ProviderIdFetch = DataHelper.getFetch(ProviderIdMap);
    Boolean ProviderIdSortDir = DataHelper.getSortDirection(ProviderIdMap);
    Integer ProviderIdSortOrder = DataHelper.getSortOrder(ProviderIdMap);
    if (ProviderIdFetch != null) out.setProviderIdFetch(ProviderIdFetch);
    if (ProviderIdSortDir != null) out.setProviderIdSortDirection(ProviderIdSortDir);
    if (ProviderIdSortOrder != null) out.setProviderIdSortOrder(ProviderIdSortOrder);

    Filter[] ProviderIdFilter = DataHelper.mapToFilterArray(ProviderIdMap, Integer.class);
    if (ProviderIdFilter != null) {
      IntegerFilter[] ProviderIdFilters = new IntegerFilter[ProviderIdFilter.length];
      for (int i = 0; i < ProviderIdFilters.length; i++) {
        ProviderIdFilters[i] = (IntegerFilter)ProviderIdFilter[i];
      }
      try {
        out.setProviderIdFilter(ProviderIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwningCostCtrMap = (Map)record.get("OwningCostCtr");
    Boolean OwningCostCtrFetch = DataHelper.getFetch(OwningCostCtrMap);
    Boolean OwningCostCtrSortDir = DataHelper.getSortDirection(OwningCostCtrMap);
    Integer OwningCostCtrSortOrder = DataHelper.getSortOrder(OwningCostCtrMap);
    if (OwningCostCtrFetch != null) out.setOwningCostCtrFetch(OwningCostCtrFetch);
    if (OwningCostCtrSortDir != null) out.setOwningCostCtrSortDirection(OwningCostCtrSortDir);
    if (OwningCostCtrSortOrder != null) out.setOwningCostCtrSortOrder(OwningCostCtrSortOrder);

    Filter[] OwningCostCtrFilter = DataHelper.mapToFilterArray(OwningCostCtrMap, Integer.class);
    if (OwningCostCtrFilter != null) {
      IntegerFilter[] OwningCostCtrFilters = new IntegerFilter[OwningCostCtrFilter.length];
      for (int i = 0; i < OwningCostCtrFilters.length; i++) {
        OwningCostCtrFilters[i] = (IntegerFilter)OwningCostCtrFilter[i];
      }
      try {
        out.setOwningCostCtrFilter(OwningCostCtrFilters);
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
