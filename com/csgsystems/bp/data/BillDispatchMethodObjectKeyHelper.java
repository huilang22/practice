/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillDispatchMethodObjectKeyHelper.java
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

/** Helper class for BillDispatchMethodObject's Key objects. */
public class BillDispatchMethodObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BillDispatchMethodObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillDispatchMethodObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillDispatchMethodObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillDispatchMethodObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillDispatchMethodObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillDispatchMethodObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BillDispatchMethodObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillDispatchMethodObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillDispatchMethodObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillDispatchMethodObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillDispatchMethodObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillDispatchMethodObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillDispatchMethodObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BillDispatchMethodObjectKeyData the converted object
   */
  public static BillDispatchMethodObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillDispatchMethodObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillDispatchMethodObject")
   * @return BillDispatchMethodObjectKeyData the converted object
   */
  public static BillDispatchMethodObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillDispatchMethodObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillDispatchMethodObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BillDispatchMethodObjectKeyFilter the converted object
   */
  public static BillDispatchMethodObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillDispatchMethodObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillDispatchMethodObject")
   * @return BillDispatchMethodObjectKeyFilter the converted object
   */
  public static BillDispatchMethodObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillDispatchMethodObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BillDispatchMethodObjectKeyData to a Map (not including the root).
  /** convert BillDispatchMethodObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillDispatchMethodObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BillDispMethSet) record.put ("BillDispMeth", in.BillDispMeth);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert BillDispatchMethodObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BillDispatchMethodObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BillDispMeth, in.BillDispMethSort, in.BillDispMethSortAscending, in.BillDispMethFetch);
      if (map != null) record.put ("BillDispMeth", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to BillDispatchMethodObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillDispatchMethodObjectKeyData the converted object
   */
  public static BillDispatchMethodObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillDispatchMethodObjectKeyData out = new BillDispatchMethodObjectKeyData ();

    if ((obj = record.get ("BillDispMeth")) != null)
    {
      out.BillDispMeth = (Integer) obj;
      out._BillDispMethSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to BillDispatchMethodObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillDispatchMethodObjectKeyFilter the converted object
   */
  public static BillDispatchMethodObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillDispatchMethodObjectKeyFilter out = new BillDispatchMethodObjectKeyFilter ();

    Map BillDispMethMap = (Map)record.get("BillDispMeth");
    Boolean BillDispMethFetch = DataHelper.getFetch(BillDispMethMap);
    Boolean BillDispMethSortDir = DataHelper.getSortDirection(BillDispMethMap);
    Integer BillDispMethSortOrder = DataHelper.getSortOrder(BillDispMethMap);
    if (BillDispMethFetch != null) out.setBillDispMethFetch(BillDispMethFetch);
    if (BillDispMethSortDir != null) out.setBillDispMethSortDirection(BillDispMethSortDir);
    if (BillDispMethSortOrder != null) out.setBillDispMethSortOrder(BillDispMethSortOrder);

    Filter[] BillDispMethFilter = DataHelper.mapToFilterArray(BillDispMethMap, Integer.class);
    if (BillDispMethFilter != null) {
      IntegerFilter[] BillDispMethFilters = new IntegerFilter[BillDispMethFilter.length];
      for (int i = 0; i < BillDispMethFilters.length; i++) {
        BillDispMethFilters[i] = (IntegerFilter)BillDispMethFilter[i];
      }
      try {
        out.setBillDispMethFilter(BillDispMethFilters);
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
