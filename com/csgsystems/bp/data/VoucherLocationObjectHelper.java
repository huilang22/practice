/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherLocationObjectHelper.java
 * Definition File: Catalog/VoucherLocation.xml
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



/** Helper class to convert VoucherLocationObject JavaBean objects to/from HashMaps.
 */
public class VoucherLocationObjectHelper implements ArubaObjectHelper
{
  /** convert VoucherLocationObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (VoucherLocationObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherLocationObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherLocationObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherLocationObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherLocationObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherLocationObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherLocationObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherLocationObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherLocationObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherLocationObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherLocationObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherLocationObjectData.
   * @param record the Map containing the data to convert to the object
   * @return VoucherLocationObjectData the converted object
   */
  public static VoucherLocationObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherLocationObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherLocationObject")
   * @return VoucherLocationObjectData the converted object
   */
  public static VoucherLocationObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherLocationObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherLocationObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return VoucherLocationObjectFilter the converted object
   */
  public static VoucherLocationObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherLocationObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherLocationObject")
   * @return VoucherLocationObjectFilter the converted object
   */
  public static VoucherLocationObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherLocationObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to VoucherLocationObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return VoucherLocationObjectDataList the converted object
   */
  public static VoucherLocationObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to VoucherLocationObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "VoucherLocationObjectList")
   * @return VoucherLocationObjectDataList the converted object
   */
  public static VoucherLocationObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherLocationObjectList";
    Object[] root = (Object[]) record.get (rootName);
    VoucherLocationObjectData[] array = null;
    if (root != null)
    {
      array = new VoucherLocationObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = VoucherLocationObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new VoucherLocationObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new VoucherLocationObjectDataList (array, index, total);
  }
  /** convert VoucherLocationObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherLocationObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", VoucherLocationObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._LocationInfoSet) record.put ("LocationInfo", in.LocationInfo);
      return record;
  }
  /** convert VoucherLocationObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherLocationObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", VoucherLocationObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.LocationInfo, in.LocationInfoSort, in.LocationInfoSortAscending, in.LocationInfoFetch, in.LocationInfoCaseInsensitive);
      if (map != null) record.put ("LocationInfo", map);
    return record;
  }
  /** convert Map to VoucherLocationObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherLocationObjectData the converted object
   */
  public static VoucherLocationObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherLocationObjectData out = new VoucherLocationObjectData ();

    out.Key = VoucherLocationObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("LocationInfo")) != null)
    {
      out.LocationInfo = (String) obj;
    }
      return out;
  }
  /** convert Map to VoucherLocationObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherLocationObjectFilter the converted object
   */
  public static VoucherLocationObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherLocationObjectFilter out = new VoucherLocationObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = VoucherLocationObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map LocationInfoMap = (Map)record.get("LocationInfo");
    Boolean LocationInfoFetch = DataHelper.getFetch(LocationInfoMap);
    Boolean LocationInfoSortDir = DataHelper.getSortDirection(LocationInfoMap);
    Integer LocationInfoSortOrder = DataHelper.getSortOrder(LocationInfoMap);
    if (LocationInfoFetch != null) out.setLocationInfoFetch(LocationInfoFetch);
    if (LocationInfoSortDir != null) out.setLocationInfoSortDirection(LocationInfoSortDir);
    if (LocationInfoSortOrder != null) out.setLocationInfoSortOrder(LocationInfoSortOrder);

    Filter[] LocationInfoFilter = DataHelper.mapToFilterArray(LocationInfoMap, String.class);
    if (LocationInfoFilter != null) {
      StringFilter[] LocationInfoFilters = new StringFilter[LocationInfoFilter.length];
      for (int i = 0; i < LocationInfoFilters.length; i++) {
        LocationInfoFilters[i] = (StringFilter)LocationInfoFilter[i];
      }
      try {
        out.setLocationInfoFilter(LocationInfoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
