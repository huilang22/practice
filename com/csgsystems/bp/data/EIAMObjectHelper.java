/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EIAMObjectHelper.java
 * Definition File: Catalog/ExternalIdAcctMap.xml
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



/** Helper class to convert EIAMObject JavaBean objects to/from HashMaps.
 */
public class EIAMObjectHelper implements ArubaObjectHelper
{
  /** convert EIAMObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (EIAMObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EIAMObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EIAMObject")
   * @return Map     the output Map
   */
  public static Map toMap (EIAMObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EIAMObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert EIAMObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EIAMObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EIAMObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EIAMObject")
   * @return Map     the output Map
   */
  public static Map toMap (EIAMObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EIAMObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EIAMObjectData.
   * @param record the Map containing the data to convert to the object
   * @return EIAMObjectData the converted object
   */
  public static EIAMObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EIAMObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EIAMObject")
   * @return EIAMObjectData the converted object
   */
  public static EIAMObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EIAMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EIAMObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return EIAMObjectFilter the converted object
   */
  public static EIAMObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EIAMObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EIAMObject")
   * @return EIAMObjectFilter the converted object
   */
  public static EIAMObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EIAMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to EIAMObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return EIAMObjectDataList the converted object
   */
  public static EIAMObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to EIAMObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "EIAMObjectList")
   * @return EIAMObjectDataList the converted object
   */
  public static EIAMObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EIAMObjectList";
    Object[] root = (Object[]) record.get (rootName);
    EIAMObjectData[] array = null;
    if (root != null)
    {
      array = new EIAMObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = EIAMObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new EIAMObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new EIAMObjectDataList (array, index, total);
  }
  /** convert EIAMObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EIAMObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", EIAMObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
      return record;
  }
  /** convert EIAMObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EIAMObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", EIAMObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch);
      if (map != null) record.put ("ServerId", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
    return record;
  }
  /** convert Map to EIAMObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EIAMObjectData the converted object
   */
  public static EIAMObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EIAMObjectData out = new EIAMObjectData ();

    out.Key = EIAMObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ServerId")) != null)
    {
      out.ServerId = (Integer) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to EIAMObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EIAMObjectFilter the converted object
   */
  public static EIAMObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EIAMObjectFilter out = new EIAMObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = EIAMObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    return out;
  }
}
