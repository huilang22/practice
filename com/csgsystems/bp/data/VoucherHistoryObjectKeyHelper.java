/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VoucherHistoryObjectKeyHelper.java
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

/** Helper class for VoucherHistoryObject's Key objects. */
public class VoucherHistoryObjectKeyHelper implements ArubaObjectHelper
{
  /** convert VoucherHistoryObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherHistoryObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherHistoryObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherHistoryObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherHistoryObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherHistoryObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert VoucherHistoryObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VoucherHistoryObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VoucherHistoryObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VoucherHistoryObject")
   * @return Map     the output Map
   */
  public static Map toMap (VoucherHistoryObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VoucherHistoryObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VoucherHistoryObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherHistoryObjectKeyData the converted object
   */
  public static VoucherHistoryObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VoucherHistoryObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VoucherHistoryObject")
   * @return VoucherHistoryObjectKeyData the converted object
   */
  public static VoucherHistoryObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherHistoryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VoucherHistoryObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return VoucherHistoryObjectKeyFilter the converted object
   */
  public static VoucherHistoryObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VoucherHistoryObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VoucherHistoryObject")
   * @return VoucherHistoryObjectKeyFilter the converted object
   */
  public static VoucherHistoryObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VoucherHistoryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert VoucherHistoryObjectKeyData to a Map (not including the root).
  /** convert VoucherHistoryObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherHistoryObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._VoucherIdSet) record.put ("VoucherId", in.VoucherId);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    return record;
  }
  /** convert VoucherHistoryObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VoucherHistoryObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.VoucherId, in.VoucherIdSort, in.VoucherIdSortAscending, in.VoucherIdFetch, in.VoucherIdCaseInsensitive);
      if (map != null) record.put ("VoucherId", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
    return record;
  }
  /** convert Map to VoucherHistoryObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherHistoryObjectKeyData the converted object
   */
  public static VoucherHistoryObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherHistoryObjectKeyData out = new VoucherHistoryObjectKeyData ();

    if ((obj = record.get ("VoucherId")) != null)
    {
      out.VoucherId = (String) obj;
      out._VoucherIdSet = true;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
      out._ChgDateSet = true;
    }
  
    return out;
  }
  /** convert Map to VoucherHistoryObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VoucherHistoryObjectKeyFilter the converted object
   */
  public static VoucherHistoryObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VoucherHistoryObjectKeyFilter out = new VoucherHistoryObjectKeyFilter ();

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
  
    Map ChgDateMap = (Map)record.get("ChgDate");
    Boolean ChgDateFetch = DataHelper.getFetch(ChgDateMap);
    Boolean ChgDateSortDir = DataHelper.getSortDirection(ChgDateMap);
    Integer ChgDateSortOrder = DataHelper.getSortOrder(ChgDateMap);
    if (ChgDateFetch != null) out.setChgDateFetch(ChgDateFetch);
    if (ChgDateSortDir != null) out.setChgDateSortDirection(ChgDateSortDir);
    if (ChgDateSortOrder != null) out.setChgDateSortOrder(ChgDateSortOrder);

    Filter[] ChgDateFilter = DataHelper.mapToFilterArray(ChgDateMap, Date.class);
    if (ChgDateFilter != null) {
      DateFilter[] ChgDateFilters = new DateFilter[ChgDateFilter.length];
      for (int i = 0; i < ChgDateFilters.length; i++) {
        ChgDateFilters[i] = (DateFilter)ChgDateFilter[i];
      }
      try {
        out.setChgDateFilter(ChgDateFilters);
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
