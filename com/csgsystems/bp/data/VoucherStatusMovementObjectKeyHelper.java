/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusMovementObjectKeyHelper.java
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

/** Helper class for VoucherStatusMovementObject's Key objects. */
public class VoucherStatusMovementObjectKeyHelper implements ArubaObjectHelper
{
  /** convert VoucherStatusMovementObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusMovementObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherStatusMovementObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherStatusMovementObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusMovementObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherStatusMovementObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherStatusMovementObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusMovementObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherStatusMovementObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherStatusMovementObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusMovementObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherStatusMovementObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherStatusMovementObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherStatusMovementObjectKeyData the converted object
   */
  public static VoucherStatusMovementObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherStatusMovementObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherStatusMovementObject")
   * @return VoucherStatusMovementObjectKeyData the converted object
   */
  public static VoucherStatusMovementObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusMovementObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherStatusMovementObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherStatusMovementObjectKeyFilter the converted object
   */
  public static VoucherStatusMovementObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherStatusMovementObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherStatusMovementObject")
   * @return VoucherStatusMovementObjectKeyFilter the converted object
   */
  public static VoucherStatusMovementObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusMovementObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert VoucherStatusMovementObjectKeyData to a Map (not including the root).
  /** convert VoucherStatusMovementObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherStatusMovementObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._StateFromSet) record.put ("StateFrom", in.StateFrom);
  
    return record;
  }
  /** convert VoucherStatusMovementObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherStatusMovementObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.StateFrom, in.StateFromSort, in.StateFromSortAscending, in.StateFromFetch);
      if (map != null) record.put ("StateFrom", map);
    return record;
  }
  /** convert Map to VoucherStatusMovementObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherStatusMovementObjectKeyData the converted object
   */
  public static VoucherStatusMovementObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherStatusMovementObjectKeyData out = new VoucherStatusMovementObjectKeyData ();

    if ((obj = record.get ("StateFrom")) != null)
    {
      out.StateFrom = (BigInteger) obj;
      out._StateFromSet = true;
    }
  
    return out;
  }
  /** convert Map to VoucherStatusMovementObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherStatusMovementObjectKeyFilter the converted object
   */
  public static VoucherStatusMovementObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherStatusMovementObjectKeyFilter out = new VoucherStatusMovementObjectKeyFilter ();

    Map StateFromMap = (Map)record.get("StateFrom");
    Boolean StateFromFetch = DataHelper.getFetch(StateFromMap);
    Boolean StateFromSortDir = DataHelper.getSortDirection(StateFromMap);
    Integer StateFromSortOrder = DataHelper.getSortOrder(StateFromMap);
    if (StateFromFetch != null) out.setStateFromFetch(StateFromFetch);
    if (StateFromSortDir != null) out.setStateFromSortDirection(StateFromSortDir);
    if (StateFromSortOrder != null) out.setStateFromSortOrder(StateFromSortOrder);

    Filter[] StateFromFilter = DataHelper.mapToFilterArray(StateFromMap, BigInteger.class);
    if (StateFromFilter != null) {
      BigIntegerFilter[] StateFromFilters = new BigIntegerFilter[StateFromFilter.length];
      for (int i = 0; i < StateFromFilters.length; i++) {
        StateFromFilters[i] = (BigIntegerFilter)StateFromFilter[i];
      }
      try {
        out.setStateFromFilter(StateFromFilters);
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
