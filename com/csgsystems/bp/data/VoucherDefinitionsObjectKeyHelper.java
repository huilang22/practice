/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherDefinitionsObjectKeyHelper.java
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

/** Helper class for VoucherDefinitionsObject's Key objects. */
public class VoucherDefinitionsObjectKeyHelper implements ArubaObjectHelper
{
  /** convert VoucherDefinitionsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherDefinitionsObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherDefinitionsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherDefinitionsObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherDefinitionsObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherDefinitionsObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherDefinitionsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherDefinitionsObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherDefinitionsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherDefinitionsObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherDefinitionsObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherDefinitionsObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherDefinitionsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherDefinitionsObjectKeyData the converted object
   */
  public static VoucherDefinitionsObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherDefinitionsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherDefinitionsObject")
   * @return VoucherDefinitionsObjectKeyData the converted object
   */
  public static VoucherDefinitionsObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherDefinitionsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherDefinitionsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherDefinitionsObjectKeyFilter the converted object
   */
  public static VoucherDefinitionsObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherDefinitionsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherDefinitionsObject")
   * @return VoucherDefinitionsObjectKeyFilter the converted object
   */
  public static VoucherDefinitionsObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherDefinitionsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert VoucherDefinitionsObjectKeyData to a Map (not including the root).
  /** convert VoucherDefinitionsObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherDefinitionsObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._VoucherIdSet) record.put ("VoucherId", in.VoucherId);
  
    return record;
  }
  /** convert VoucherDefinitionsObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherDefinitionsObjectKeyFilter in, Map record)
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
  /** convert Map to VoucherDefinitionsObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherDefinitionsObjectKeyData the converted object
   */
  public static VoucherDefinitionsObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherDefinitionsObjectKeyData out = new VoucherDefinitionsObjectKeyData ();

    if ((obj = record.get ("VoucherId")) != null)
    {
      out.VoucherId = (String) obj;
      out._VoucherIdSet = true;
    }
  
    return out;
  }
  /** convert Map to VoucherDefinitionsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherDefinitionsObjectKeyFilter the converted object
   */
  public static VoucherDefinitionsObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherDefinitionsObjectKeyFilter out = new VoucherDefinitionsObjectKeyFilter ();

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
