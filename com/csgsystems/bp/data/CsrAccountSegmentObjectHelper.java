/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrAccountSegmentObjectHelper.java
 * Definition File: Admin/CsrAccountSegment.xml
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



/** Helper class to convert CsrAccountSegmentObject JavaBean objects to/from HashMaps.
 */
public class CsrAccountSegmentObjectHelper implements ArubaObjectHelper
{
  /** convert CsrAccountSegmentObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CsrAccountSegmentObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrAccountSegmentObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrAccountSegmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrAccountSegmentObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrAccountSegmentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CsrAccountSegmentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrAccountSegmentObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrAccountSegmentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrAccountSegmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrAccountSegmentObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrAccountSegmentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CsrAccountSegmentObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CsrAccountSegmentObjectData the converted object
   */
  public static CsrAccountSegmentObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CsrAccountSegmentObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CsrAccountSegmentObject")
   * @return CsrAccountSegmentObjectData the converted object
   */
  public static CsrAccountSegmentObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrAccountSegmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CsrAccountSegmentObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CsrAccountSegmentObjectFilter the converted object
   */
  public static CsrAccountSegmentObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CsrAccountSegmentObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CsrAccountSegmentObject")
   * @return CsrAccountSegmentObjectFilter the converted object
   */
  public static CsrAccountSegmentObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrAccountSegmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CsrAccountSegmentObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CsrAccountSegmentObjectDataList the converted object
   */
  public static CsrAccountSegmentObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CsrAccountSegmentObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CsrAccountSegmentObjectList")
   * @return CsrAccountSegmentObjectDataList the converted object
   */
  public static CsrAccountSegmentObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrAccountSegmentObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CsrAccountSegmentObjectData[] array = null;
    if (root != null)
    {
      array = new CsrAccountSegmentObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CsrAccountSegmentObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CsrAccountSegmentObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CsrAccountSegmentObjectDataList (array, index, total);
  }
  /** convert CsrAccountSegmentObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CsrAccountSegmentObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CsrAccountSegmentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._IsCsrDefaultSet) record.put ("IsCsrDefault", in.IsCsrDefault);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert CsrAccountSegmentObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CsrAccountSegmentObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CsrAccountSegmentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.IsCsrDefault, in.IsCsrDefaultSort, in.IsCsrDefaultSortAscending, in.IsCsrDefaultFetch);
      if (map != null) record.put ("IsCsrDefault", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to CsrAccountSegmentObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrAccountSegmentObjectData the converted object
   */
  public static CsrAccountSegmentObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrAccountSegmentObjectData out = new CsrAccountSegmentObjectData ();

    out.Key = CsrAccountSegmentObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("IsCsrDefault")) != null)
    {
      out.IsCsrDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to CsrAccountSegmentObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrAccountSegmentObjectFilter the converted object
   */
  public static CsrAccountSegmentObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrAccountSegmentObjectFilter out = new CsrAccountSegmentObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CsrAccountSegmentObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map IsCsrDefaultMap = (Map)record.get("IsCsrDefault");
    Boolean IsCsrDefaultFetch = DataHelper.getFetch(IsCsrDefaultMap);
    Boolean IsCsrDefaultSortDir = DataHelper.getSortDirection(IsCsrDefaultMap);
    Integer IsCsrDefaultSortOrder = DataHelper.getSortOrder(IsCsrDefaultMap);
    if (IsCsrDefaultFetch != null) out.setIsCsrDefaultFetch(IsCsrDefaultFetch);
    if (IsCsrDefaultSortDir != null) out.setIsCsrDefaultSortDirection(IsCsrDefaultSortDir);
    if (IsCsrDefaultSortOrder != null) out.setIsCsrDefaultSortOrder(IsCsrDefaultSortOrder);

    Filter[] IsCsrDefaultFilter = DataHelper.mapToFilterArray(IsCsrDefaultMap, Boolean.class);
    if (IsCsrDefaultFilter != null) {
      BooleanFilter[] IsCsrDefaultFilters = new BooleanFilter[IsCsrDefaultFilter.length];
      for (int i = 0; i < IsCsrDefaultFilters.length; i++) {
        IsCsrDefaultFilters[i] = (BooleanFilter)IsCsrDefaultFilter[i];
      }
      try {
        out.setIsCsrDefaultFilter(IsCsrDefaultFilters);
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
