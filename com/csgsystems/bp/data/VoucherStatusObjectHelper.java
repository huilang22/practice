/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusObjectHelper.java
 * Definition File: Catalog/VoucherStatus.xml
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



/** Helper class to convert VoucherStatusObject JavaBean objects to/from HashMaps.
 */
public class VoucherStatusObjectHelper implements ArubaObjectHelper
{
  /** convert VoucherStatusObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (VoucherStatusObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherStatusObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherStatusObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherStatusObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherStatusObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherStatusObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherStatusObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherStatusObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherStatusObjectData.
   * @param record the Map containing the data to convert to the object
   * @return VoucherStatusObjectData the converted object
   */
  public static VoucherStatusObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherStatusObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherStatusObject")
   * @return VoucherStatusObjectData the converted object
   */
  public static VoucherStatusObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherStatusObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return VoucherStatusObjectFilter the converted object
   */
  public static VoucherStatusObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherStatusObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherStatusObject")
   * @return VoucherStatusObjectFilter the converted object
   */
  public static VoucherStatusObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to VoucherStatusObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return VoucherStatusObjectDataList the converted object
   */
  public static VoucherStatusObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to VoucherStatusObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "VoucherStatusObjectList")
   * @return VoucherStatusObjectDataList the converted object
   */
  public static VoucherStatusObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusObjectList";
    Object[] root = (Object[]) record.get (rootName);
    VoucherStatusObjectData[] array = null;
    if (root != null)
    {
      array = new VoucherStatusObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = VoucherStatusObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new VoucherStatusObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new VoucherStatusObjectDataList (array, index, total);
  }
  /** convert VoucherStatusObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherStatusObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", VoucherStatusObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._StatusInfoSet) record.put ("StatusInfo", in.StatusInfo);
      return record;
  }
  /** convert VoucherStatusObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherStatusObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", VoucherStatusObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.StatusInfo, in.StatusInfoSort, in.StatusInfoSortAscending, in.StatusInfoFetch, in.StatusInfoCaseInsensitive);
      if (map != null) record.put ("StatusInfo", map);
    return record;
  }
  /** convert Map to VoucherStatusObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherStatusObjectData the converted object
   */
  public static VoucherStatusObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherStatusObjectData out = new VoucherStatusObjectData ();

    out.Key = VoucherStatusObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("StatusInfo")) != null)
    {
      out.StatusInfo = (String) obj;
    }
      return out;
  }
  /** convert Map to VoucherStatusObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherStatusObjectFilter the converted object
   */
  public static VoucherStatusObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherStatusObjectFilter out = new VoucherStatusObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = VoucherStatusObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map StatusInfoMap = (Map)record.get("StatusInfo");
    Boolean StatusInfoFetch = DataHelper.getFetch(StatusInfoMap);
    Boolean StatusInfoSortDir = DataHelper.getSortDirection(StatusInfoMap);
    Integer StatusInfoSortOrder = DataHelper.getSortOrder(StatusInfoMap);
    if (StatusInfoFetch != null) out.setStatusInfoFetch(StatusInfoFetch);
    if (StatusInfoSortDir != null) out.setStatusInfoSortDirection(StatusInfoSortDir);
    if (StatusInfoSortOrder != null) out.setStatusInfoSortOrder(StatusInfoSortOrder);

    Filter[] StatusInfoFilter = DataHelper.mapToFilterArray(StatusInfoMap, String.class);
    if (StatusInfoFilter != null) {
      StringFilter[] StatusInfoFilters = new StringFilter[StatusInfoFilter.length];
      for (int i = 0; i < StatusInfoFilters.length; i++) {
        StatusInfoFilters[i] = (StringFilter)StatusInfoFilter[i];
      }
      try {
        out.setStatusInfoFilter(StatusInfoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
