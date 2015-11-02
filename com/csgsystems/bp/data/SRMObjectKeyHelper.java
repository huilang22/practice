/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SRMObjectKeyHelper.java
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

/** Helper class for SRMObject's Key objects. */
public class SRMObjectKeyHelper implements ArubaObjectHelper
{
  /** convert SRMObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SRMObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SRMObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SRMObject")
   * @return Map     the output Map
   */
  public static Map toMap (SRMObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SRMObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert SRMObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SRMObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SRMObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SRMObject")
   * @return Map     the output Map
   */
  public static Map toMap (SRMObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SRMObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SRMObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return SRMObjectKeyData the converted object
   */
  public static SRMObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SRMObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SRMObject")
   * @return SRMObjectKeyData the converted object
   */
  public static SRMObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SRMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SRMObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return SRMObjectKeyFilter the converted object
   */
  public static SRMObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SRMObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SRMObject")
   * @return SRMObjectKeyFilter the converted object
   */
  public static SRMObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SRMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert SRMObjectKeyData to a Map (not including the root).
  /** convert SRMObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SRMObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._StatusIdSet) record.put ("StatusId", in.StatusId);
  
    if (in._StatusReasonIdSet) record.put ("StatusReasonId", in.StatusReasonId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert SRMObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SRMObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.StatusId, in.StatusIdSort, in.StatusIdSortAscending, in.StatusIdFetch);
      if (map != null) record.put ("StatusId", map);
      map = DataHelper.filterToMap (in.StatusReasonId, in.StatusReasonIdSort, in.StatusReasonIdSortAscending, in.StatusReasonIdFetch);
      if (map != null) record.put ("StatusReasonId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to SRMObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SRMObjectKeyData the converted object
   */
  public static SRMObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SRMObjectKeyData out = new SRMObjectKeyData ();

    if ((obj = record.get ("StatusId")) != null)
    {
      out.StatusId = (Integer) obj;
      out._StatusIdSet = true;
    }
  
    if ((obj = record.get ("StatusReasonId")) != null)
    {
      out.StatusReasonId = (Integer) obj;
      out._StatusReasonIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to SRMObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SRMObjectKeyFilter the converted object
   */
  public static SRMObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SRMObjectKeyFilter out = new SRMObjectKeyFilter ();

    Map StatusIdMap = (Map)record.get("StatusId");
    Boolean StatusIdFetch = DataHelper.getFetch(StatusIdMap);
    Boolean StatusIdSortDir = DataHelper.getSortDirection(StatusIdMap);
    Integer StatusIdSortOrder = DataHelper.getSortOrder(StatusIdMap);
    if (StatusIdFetch != null) out.setStatusIdFetch(StatusIdFetch);
    if (StatusIdSortDir != null) out.setStatusIdSortDirection(StatusIdSortDir);
    if (StatusIdSortOrder != null) out.setStatusIdSortOrder(StatusIdSortOrder);

    Filter[] StatusIdFilter = DataHelper.mapToFilterArray(StatusIdMap, Integer.class);
    if (StatusIdFilter != null) {
      IntegerFilter[] StatusIdFilters = new IntegerFilter[StatusIdFilter.length];
      for (int i = 0; i < StatusIdFilters.length; i++) {
        StatusIdFilters[i] = (IntegerFilter)StatusIdFilter[i];
      }
      try {
        out.setStatusIdFilter(StatusIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatusReasonIdMap = (Map)record.get("StatusReasonId");
    Boolean StatusReasonIdFetch = DataHelper.getFetch(StatusReasonIdMap);
    Boolean StatusReasonIdSortDir = DataHelper.getSortDirection(StatusReasonIdMap);
    Integer StatusReasonIdSortOrder = DataHelper.getSortOrder(StatusReasonIdMap);
    if (StatusReasonIdFetch != null) out.setStatusReasonIdFetch(StatusReasonIdFetch);
    if (StatusReasonIdSortDir != null) out.setStatusReasonIdSortDirection(StatusReasonIdSortDir);
    if (StatusReasonIdSortOrder != null) out.setStatusReasonIdSortOrder(StatusReasonIdSortOrder);

    Filter[] StatusReasonIdFilter = DataHelper.mapToFilterArray(StatusReasonIdMap, Integer.class);
    if (StatusReasonIdFilter != null) {
      IntegerFilter[] StatusReasonIdFilters = new IntegerFilter[StatusReasonIdFilter.length];
      for (int i = 0; i < StatusReasonIdFilters.length; i++) {
        StatusReasonIdFilters[i] = (IntegerFilter)StatusReasonIdFilter[i];
      }
      try {
        out.setStatusReasonIdFilter(StatusReasonIdFilters);
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
