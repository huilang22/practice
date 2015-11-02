/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusMovementObjectHelper.java
 * Definition File: Catalog/VoucherStatusMovement.xml
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



/** Helper class to convert VoucherStatusMovementObject JavaBean objects to/from HashMaps.
 */
public class VoucherStatusMovementObjectHelper implements ArubaObjectHelper
{
  /** convert VoucherStatusMovementObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (VoucherStatusMovementObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherStatusMovementObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherStatusMovementObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusMovementObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherStatusMovementObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherStatusMovementObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusMovementObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherStatusMovementObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherStatusMovementObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusMovementObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherStatusMovementObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherStatusMovementObjectData.
   * @param record the Map containing the data to convert to the object
   * @return VoucherStatusMovementObjectData the converted object
   */
  public static VoucherStatusMovementObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherStatusMovementObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherStatusMovementObject")
   * @return VoucherStatusMovementObjectData the converted object
   */
  public static VoucherStatusMovementObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusMovementObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherStatusMovementObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return VoucherStatusMovementObjectFilter the converted object
   */
  public static VoucherStatusMovementObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherStatusMovementObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherStatusMovementObject")
   * @return VoucherStatusMovementObjectFilter the converted object
   */
  public static VoucherStatusMovementObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusMovementObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to VoucherStatusMovementObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return VoucherStatusMovementObjectDataList the converted object
   */
  public static VoucherStatusMovementObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to VoucherStatusMovementObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "VoucherStatusMovementObjectList")
   * @return VoucherStatusMovementObjectDataList the converted object
   */
  public static VoucherStatusMovementObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusMovementObjectList";
    Object[] root = (Object[]) record.get (rootName);
    VoucherStatusMovementObjectData[] array = null;
    if (root != null)
    {
      array = new VoucherStatusMovementObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = VoucherStatusMovementObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new VoucherStatusMovementObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new VoucherStatusMovementObjectDataList (array, index, total);
  }
  /** convert VoucherStatusMovementObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherStatusMovementObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", VoucherStatusMovementObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._StateToSet) record.put ("StateTo", in.StateTo);
      return record;
  }
  /** convert VoucherStatusMovementObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (VoucherStatusMovementObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", VoucherStatusMovementObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.StateTo, in.StateToSort, in.StateToSortAscending, in.StateToFetch);
      if (map != null) record.put ("StateTo", map);
    return record;
  }
  /** convert Map to VoucherStatusMovementObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherStatusMovementObjectData the converted object
   */
  public static VoucherStatusMovementObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherStatusMovementObjectData out = new VoucherStatusMovementObjectData ();

    out.Key = VoucherStatusMovementObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("StateTo")) != null)
    {
      out.StateTo = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to VoucherStatusMovementObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherStatusMovementObjectFilter the converted object
   */
  public static VoucherStatusMovementObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherStatusMovementObjectFilter out = new VoucherStatusMovementObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = VoucherStatusMovementObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map StateToMap = (Map)record.get("StateTo");
    Boolean StateToFetch = DataHelper.getFetch(StateToMap);
    Boolean StateToSortDir = DataHelper.getSortDirection(StateToMap);
    Integer StateToSortOrder = DataHelper.getSortOrder(StateToMap);
    if (StateToFetch != null) out.setStateToFetch(StateToFetch);
    if (StateToSortDir != null) out.setStateToSortDirection(StateToSortDir);
    if (StateToSortOrder != null) out.setStateToSortOrder(StateToSortOrder);

    Filter[] StateToFilter = DataHelper.mapToFilterArray(StateToMap, BigInteger.class);
    if (StateToFilter != null) {
      BigIntegerFilter[] StateToFilters = new BigIntegerFilter[StateToFilter.length];
      for (int i = 0; i < StateToFilters.length; i++) {
        StateToFilters[i] = (BigIntegerFilter)StateToFilter[i];
      }
      try {
        out.setStateToFilter(StateToFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
