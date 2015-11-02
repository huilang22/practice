/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BECObjectKeyHelper.java
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

/** Helper class for BECObject's Key objects. */
public class BECObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BECObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BECObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BECObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BECObject")
   * @return Map     the output Map
   */
  public static Map toMap (BECObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BECObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BECObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BECObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BECObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BECObject")
   * @return Map     the output Map
   */
  public static Map toMap (BECObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BECObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BECObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BECObjectKeyData the converted object
   */
  public static BECObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BECObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BECObject")
   * @return BECObjectKeyData the converted object
   */
  public static BECObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BECObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BECObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BECObjectKeyFilter the converted object
   */
  public static BECObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BECObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BECObject")
   * @return BECObjectKeyFilter the converted object
   */
  public static BECObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BECObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BECObjectKeyData to a Map (not including the root).
  /** convert BECObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BECObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BamErrorCodeSet) record.put ("BamErrorCode", in.BamErrorCode);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert BECObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BECObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BamErrorCode, in.BamErrorCodeSort, in.BamErrorCodeSortAscending, in.BamErrorCodeFetch);
      if (map != null) record.put ("BamErrorCode", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to BECObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BECObjectKeyData the converted object
   */
  public static BECObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BECObjectKeyData out = new BECObjectKeyData ();

    if ((obj = record.get ("BamErrorCode")) != null)
    {
      out.BamErrorCode = (Integer) obj;
      out._BamErrorCodeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to BECObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BECObjectKeyFilter the converted object
   */
  public static BECObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BECObjectKeyFilter out = new BECObjectKeyFilter ();

    Map BamErrorCodeMap = (Map)record.get("BamErrorCode");
    Boolean BamErrorCodeFetch = DataHelper.getFetch(BamErrorCodeMap);
    Boolean BamErrorCodeSortDir = DataHelper.getSortDirection(BamErrorCodeMap);
    Integer BamErrorCodeSortOrder = DataHelper.getSortOrder(BamErrorCodeMap);
    if (BamErrorCodeFetch != null) out.setBamErrorCodeFetch(BamErrorCodeFetch);
    if (BamErrorCodeSortDir != null) out.setBamErrorCodeSortDirection(BamErrorCodeSortDir);
    if (BamErrorCodeSortOrder != null) out.setBamErrorCodeSortOrder(BamErrorCodeSortOrder);

    Filter[] BamErrorCodeFilter = DataHelper.mapToFilterArray(BamErrorCodeMap, Integer.class);
    if (BamErrorCodeFilter != null) {
      IntegerFilter[] BamErrorCodeFilters = new IntegerFilter[BamErrorCodeFilter.length];
      for (int i = 0; i < BamErrorCodeFilters.length; i++) {
        BamErrorCodeFilters[i] = (IntegerFilter)BamErrorCodeFilter[i];
      }
      try {
        out.setBamErrorCodeFilter(BamErrorCodeFilters);
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
