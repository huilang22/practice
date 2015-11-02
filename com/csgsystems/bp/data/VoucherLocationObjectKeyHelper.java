/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherLocationObjectKeyHelper.java
 * Definition File: Catalog/.xml
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

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

/** Helper class for VoucherLocationObject's Key objects. */
public class VoucherLocationObjectKeyHelper implements ArubaObjectHelper
{
  /** convert VoucherLocationObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherLocationObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherLocationObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherLocationObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherLocationObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherLocationObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherLocationObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherLocationObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherLocationObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherLocationObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherLocationObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherLocationObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherLocationObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherLocationObjectKeyData the converted object
   */
  public static VoucherLocationObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherLocationObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherLocationObject")
   * @return VoucherLocationObjectKeyData the converted object
   */
  public static VoucherLocationObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherLocationObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherLocationObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherLocationObjectKeyFilter the converted object
   */
  public static VoucherLocationObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherLocationObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherLocationObject")
   * @return VoucherLocationObjectKeyFilter the converted object
   */
  public static VoucherLocationObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherLocationObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert VoucherLocationObjectKeyData to a Map (not including the root).
  /** convert VoucherLocationObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherLocationObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._LocationCodeSet) record.put ("LocationCode", in.LocationCode);
  
    return record;
  }
  /** convert VoucherLocationObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherLocationObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.LocationCode, in.LocationCodeSort, in.LocationCodeSortAscending, in.LocationCodeFetch);
      if (map != null) record.put ("LocationCode", map);
    return record;
  }
  /** convert Map to VoucherLocationObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherLocationObjectKeyData the converted object
   */
  public static VoucherLocationObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherLocationObjectKeyData out = new VoucherLocationObjectKeyData ();

    if ((obj = record.get ("LocationCode")) != null)
    {
      out.LocationCode = (BigInteger) obj;
      out._LocationCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to VoucherLocationObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherLocationObjectKeyFilter the converted object
   */
  public static VoucherLocationObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherLocationObjectKeyFilter out = new VoucherLocationObjectKeyFilter ();

    Map LocationCodeMap = (Map)record.get("LocationCode");
    Boolean LocationCodeFetch = DataHelper.getFetch(LocationCodeMap);
    Boolean LocationCodeSortDir = DataHelper.getSortDirection(LocationCodeMap);
    Integer LocationCodeSortOrder = DataHelper.getSortOrder(LocationCodeMap);
    if (LocationCodeFetch != null) out.setLocationCodeFetch(LocationCodeFetch);
    if (LocationCodeSortDir != null) out.setLocationCodeSortDirection(LocationCodeSortDir);
    if (LocationCodeSortOrder != null) out.setLocationCodeSortOrder(LocationCodeSortOrder);

    Filter[] LocationCodeFilter = DataHelper.mapToFilterArray(LocationCodeMap, BigInteger.class);
    if (LocationCodeFilter != null) {
      BigIntegerFilter[] LocationCodeFilters = new BigIntegerFilter[LocationCodeFilter.length];
      for (int i = 0; i < LocationCodeFilters.length; i++) {
        LocationCodeFilters[i] = (BigIntegerFilter)LocationCodeFilter[i];
      }
      try {
        out.setLocationCodeFilter(LocationCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
