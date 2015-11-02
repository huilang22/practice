/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherStatusInfoObjectKeyHelper.java
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

/** Helper class for VoucherStatusInfoObject's Key objects. */
public class VoucherStatusInfoObjectKeyHelper implements ArubaObjectHelper
{
  /** convert VoucherStatusInfoObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusInfoObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherStatusInfoObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherStatusInfoObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusInfoObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherStatusInfoObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherStatusInfoObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusInfoObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherStatusInfoObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherStatusInfoObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherStatusInfoObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherStatusInfoObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherStatusInfoObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherStatusInfoObjectKeyData the converted object
   */
  public static VoucherStatusInfoObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherStatusInfoObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherStatusInfoObject")
   * @return VoucherStatusInfoObjectKeyData the converted object
   */
  public static VoucherStatusInfoObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusInfoObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherStatusInfoObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherStatusInfoObjectKeyFilter the converted object
   */
  public static VoucherStatusInfoObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherStatusInfoObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherStatusInfoObject")
   * @return VoucherStatusInfoObjectKeyFilter the converted object
   */
  public static VoucherStatusInfoObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherStatusInfoObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert VoucherStatusInfoObjectKeyData to a Map (not including the root).
  /** convert VoucherStatusInfoObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherStatusInfoObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._VoucherIdSet) record.put ("VoucherId", in.VoucherId);
  
    return record;
  }
  /** convert VoucherStatusInfoObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherStatusInfoObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.VoucherId, in.VoucherIdSort, in.VoucherIdSortAscending, in.VoucherIdFetch, in.VoucherIdCaseInsensitive);
      if (map != null) record.put ("VoucherId", map);
    return record;
  }
  /** convert Map to VoucherStatusInfoObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherStatusInfoObjectKeyData the converted object
   */
  public static VoucherStatusInfoObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherStatusInfoObjectKeyData out = new VoucherStatusInfoObjectKeyData ();

    if ((obj = record.get ("VoucherId")) != null)
    {
      out.VoucherId = (String) obj;
      out._VoucherIdSet = true;
    }
  
    return out;
  }
  /** convert Map to VoucherStatusInfoObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherStatusInfoObjectKeyFilter the converted object
   */
  public static VoucherStatusInfoObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherStatusInfoObjectKeyFilter out = new VoucherStatusInfoObjectKeyFilter ();

    Map VoucherIdMap = (Map)record.get("VoucherId");
    Boolean VoucherIdFetch = DataHelper.getFetch(VoucherIdMap);
    Boolean VoucherIdSortDir = DataHelper.getSortDirection(VoucherIdMap);
    Integer VoucherIdSortOrder = DataHelper.getSortOrder(VoucherIdMap);
    if (VoucherIdFetch != null) out.setVoucherIdFetch(VoucherIdFetch);
    if (VoucherIdSortDir != null) out.setVoucherIdSortDirection(VoucherIdSortDir);
    if (VoucherIdSortOrder != null) out.setVoucherIdSortOrder(VoucherIdSortOrder);

    Filter[] VoucherIdFilter = DataHelper.mapToFilterArray(VoucherIdMap, String.class);
    if (VoucherIdFilter != null) {
      StringFilter[] VoucherIdFilters = new StringFilter[VoucherIdFilter.length];
      for (int i = 0; i < VoucherIdFilters.length; i++) {
        VoucherIdFilters[i] = (StringFilter)VoucherIdFilter[i];
      }
      try {
        out.setVoucherIdFilter(VoucherIdFilters);
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
