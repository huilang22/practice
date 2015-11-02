/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RegulatoryIdObjectKeyHelper.java
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

/** Helper class for RegulatoryIdObject's Key objects. */
public class RegulatoryIdObjectKeyHelper implements ArubaObjectHelper
{
  /** convert RegulatoryIdObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RegulatoryIdObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RegulatoryIdObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RegulatoryIdObject")
   * @return Map     the output Map
   */
  public static Map toMap (RegulatoryIdObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RegulatoryIdObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert RegulatoryIdObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RegulatoryIdObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RegulatoryIdObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RegulatoryIdObject")
   * @return Map     the output Map
   */
  public static Map toMap (RegulatoryIdObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RegulatoryIdObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RegulatoryIdObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return RegulatoryIdObjectKeyData the converted object
   */
  public static RegulatoryIdObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RegulatoryIdObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RegulatoryIdObject")
   * @return RegulatoryIdObjectKeyData the converted object
   */
  public static RegulatoryIdObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RegulatoryIdObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RegulatoryIdObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return RegulatoryIdObjectKeyFilter the converted object
   */
  public static RegulatoryIdObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RegulatoryIdObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RegulatoryIdObject")
   * @return RegulatoryIdObjectKeyFilter the converted object
   */
  public static RegulatoryIdObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RegulatoryIdObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert RegulatoryIdObjectKeyData to a Map (not including the root).
  /** convert RegulatoryIdObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RegulatoryIdObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._RegulatoryIdSet) record.put ("RegulatoryId", in.RegulatoryId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert RegulatoryIdObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RegulatoryIdObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.RegulatoryId, in.RegulatoryIdSort, in.RegulatoryIdSortAscending, in.RegulatoryIdFetch);
      if (map != null) record.put ("RegulatoryId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to RegulatoryIdObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RegulatoryIdObjectKeyData the converted object
   */
  public static RegulatoryIdObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RegulatoryIdObjectKeyData out = new RegulatoryIdObjectKeyData ();

    if ((obj = record.get ("RegulatoryId")) != null)
    {
      out.RegulatoryId = (Integer) obj;
      out._RegulatoryIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to RegulatoryIdObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RegulatoryIdObjectKeyFilter the converted object
   */
  public static RegulatoryIdObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RegulatoryIdObjectKeyFilter out = new RegulatoryIdObjectKeyFilter ();

    Map RegulatoryIdMap = (Map)record.get("RegulatoryId");
    Boolean RegulatoryIdFetch = DataHelper.getFetch(RegulatoryIdMap);
    Boolean RegulatoryIdSortDir = DataHelper.getSortDirection(RegulatoryIdMap);
    Integer RegulatoryIdSortOrder = DataHelper.getSortOrder(RegulatoryIdMap);
    if (RegulatoryIdFetch != null) out.setRegulatoryIdFetch(RegulatoryIdFetch);
    if (RegulatoryIdSortDir != null) out.setRegulatoryIdSortDirection(RegulatoryIdSortDir);
    if (RegulatoryIdSortOrder != null) out.setRegulatoryIdSortOrder(RegulatoryIdSortOrder);

    Filter[] RegulatoryIdFilter = DataHelper.mapToFilterArray(RegulatoryIdMap, Integer.class);
    if (RegulatoryIdFilter != null) {
      IntegerFilter[] RegulatoryIdFilters = new IntegerFilter[RegulatoryIdFilter.length];
      for (int i = 0; i < RegulatoryIdFilters.length; i++) {
        RegulatoryIdFilters[i] = (IntegerFilter)RegulatoryIdFilter[i];
      }
      try {
        out.setRegulatoryIdFilter(RegulatoryIdFilters);
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
