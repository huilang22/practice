/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: VipCodeObjectKeyHelper.java
 * Definition File: Admin/.xml
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

/** Helper class for VipCodeObject's Key objects. */
public class VipCodeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert VipCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VipCodeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VipCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VipCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (VipCodeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VipCodeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert VipCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (VipCodeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert VipCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "VipCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (VipCodeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "VipCodeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to VipCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return VipCodeObjectKeyData the converted object
   */
  public static VipCodeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to VipCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "VipCodeObject")
   * @return VipCodeObjectKeyData the converted object
   */
  public static VipCodeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "VipCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to VipCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return VipCodeObjectKeyFilter the converted object
   */
  public static VipCodeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to VipCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "VipCodeObject")
   * @return VipCodeObjectKeyFilter the converted object
   */
  public static VipCodeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "VipCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert VipCodeObjectKeyData to a Map (not including the root).
  /** convert VipCodeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VipCodeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._VipCodeSet) record.put ("VipCode", in.VipCode);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert VipCodeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (VipCodeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.VipCode, in.VipCodeSort, in.VipCodeSortAscending, in.VipCodeFetch);
      if (map != null) record.put ("VipCode", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to VipCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VipCodeObjectKeyData the converted object
   */
  public static VipCodeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VipCodeObjectKeyData out = new VipCodeObjectKeyData ();

    if ((obj = record.get ("VipCode")) != null)
    {
      out.VipCode = (Integer) obj;
      out._VipCodeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to VipCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return VipCodeObjectKeyFilter the converted object
   */
  public static VipCodeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    VipCodeObjectKeyFilter out = new VipCodeObjectKeyFilter ();

    Map VipCodeMap = (Map)record.get("VipCode");
    Boolean VipCodeFetch = DataHelper.getFetch(VipCodeMap);
    Boolean VipCodeSortDir = DataHelper.getSortDirection(VipCodeMap);
    Integer VipCodeSortOrder = DataHelper.getSortOrder(VipCodeMap);
    if (VipCodeFetch != null) out.setVipCodeFetch(VipCodeFetch);
    if (VipCodeSortDir != null) out.setVipCodeSortDirection(VipCodeSortDir);
    if (VipCodeSortOrder != null) out.setVipCodeSortOrder(VipCodeSortOrder);

    Filter[] VipCodeFilter = DataHelper.mapToFilterArray(VipCodeMap, Integer.class);
    if (VipCodeFilter != null) {
      IntegerFilter[] VipCodeFilters = new IntegerFilter[VipCodeFilter.length];
      for (int i = 0; i < VipCodeFilters.length; i++) {
        VipCodeFilters[i] = (IntegerFilter)VipCodeFilter[i];
      }
      try {
        out.setVipCodeFilter(VipCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, Integer.class);
    if (LanguageCodeFilter != null) {
      IntegerFilter[] LanguageCodeFilters = new IntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (IntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
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
