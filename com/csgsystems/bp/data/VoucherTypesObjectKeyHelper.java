/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherTypesObjectKeyHelper.java
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

/** Helper class for VoucherTypesObject's Key objects. */
public class VoucherTypesObjectKeyHelper implements ArubaObjectHelper
{
  /** convert VoucherTypesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherTypesObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherTypesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherTypesObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherTypesObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherTypesObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherTypesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherTypesObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherTypesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherTypesObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherTypesObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherTypesObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherTypesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherTypesObjectKeyData the converted object
   */
  public static VoucherTypesObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherTypesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherTypesObject")
   * @return VoucherTypesObjectKeyData the converted object
   */
  public static VoucherTypesObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherTypesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherTypesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherTypesObjectKeyFilter the converted object
   */
  public static VoucherTypesObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherTypesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherTypesObject")
   * @return VoucherTypesObjectKeyFilter the converted object
   */
  public static VoucherTypesObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherTypesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert VoucherTypesObjectKeyData to a Map (not including the root).
  /** convert VoucherTypesObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherTypesObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._VoucherTypeIdSet) record.put ("VoucherTypeId", in.VoucherTypeId);
  
    return record;
  }
  /** convert VoucherTypesObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherTypesObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.VoucherTypeId, in.VoucherTypeIdSort, in.VoucherTypeIdSortAscending, in.VoucherTypeIdFetch);
      if (map != null) record.put ("VoucherTypeId", map);
    return record;
  }
  /** convert Map to VoucherTypesObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherTypesObjectKeyData the converted object
   */
  public static VoucherTypesObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherTypesObjectKeyData out = new VoucherTypesObjectKeyData ();

    if ((obj = record.get ("VoucherTypeId")) != null)
    {
      out.VoucherTypeId = (BigInteger) obj;
      out._VoucherTypeIdSet = true;
    }
  
    return out;
  }
  /** convert Map to VoucherTypesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherTypesObjectKeyFilter the converted object
   */
  public static VoucherTypesObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherTypesObjectKeyFilter out = new VoucherTypesObjectKeyFilter ();

    Map VoucherTypeIdMap = (Map)record.get("VoucherTypeId");
    Boolean VoucherTypeIdFetch = DataHelper.getFetch(VoucherTypeIdMap);
    Boolean VoucherTypeIdSortDir = DataHelper.getSortDirection(VoucherTypeIdMap);
    Integer VoucherTypeIdSortOrder = DataHelper.getSortOrder(VoucherTypeIdMap);
    if (VoucherTypeIdFetch != null) out.setVoucherTypeIdFetch(VoucherTypeIdFetch);
    if (VoucherTypeIdSortDir != null) out.setVoucherTypeIdSortDirection(VoucherTypeIdSortDir);
    if (VoucherTypeIdSortOrder != null) out.setVoucherTypeIdSortOrder(VoucherTypeIdSortOrder);

    Filter[] VoucherTypeIdFilter = DataHelper.mapToFilterArray(VoucherTypeIdMap, BigInteger.class);
    if (VoucherTypeIdFilter != null) {
      BigIntegerFilter[] VoucherTypeIdFilters = new BigIntegerFilter[VoucherTypeIdFilter.length];
      for (int i = 0; i < VoucherTypeIdFilters.length; i++) {
        VoucherTypeIdFilters[i] = (BigIntegerFilter)VoucherTypeIdFilter[i];
      }
      try {
        out.setVoucherTypeIdFilter(VoucherTypeIdFilters);
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
