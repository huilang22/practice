/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TSObjectKeyHelper.java
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

/** Helper class for TSObject's Key objects. */
public class TSObjectKeyHelper implements ArubaObjectHelper
{
  /** convert TSObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TSObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TSObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TSObject")
   * @return Map     the output Map
   */
  public static Map toMap (TSObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TSObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert TSObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TSObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TSObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TSObject")
   * @return Map     the output Map
   */
  public static Map toMap (TSObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TSObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TSObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return TSObjectKeyData the converted object
   */
  public static TSObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TSObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TSObject")
   * @return TSObjectKeyData the converted object
   */
  public static TSObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TSObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TSObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return TSObjectKeyFilter the converted object
   */
  public static TSObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TSObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TSObject")
   * @return TSObjectKeyFilter the converted object
   */
  public static TSObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TSObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert TSObjectKeyData to a Map (not including the root).
  /** convert TSObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TSObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TaxStatusSet) record.put ("TaxStatus", in.TaxStatus);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert TSObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TSObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TaxStatus, in.TaxStatusSort, in.TaxStatusSortAscending, in.TaxStatusFetch);
      if (map != null) record.put ("TaxStatus", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to TSObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TSObjectKeyData the converted object
   */
  public static TSObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TSObjectKeyData out = new TSObjectKeyData ();

    if ((obj = record.get ("TaxStatus")) != null)
    {
      out.TaxStatus = (Integer) obj;
      out._TaxStatusSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to TSObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TSObjectKeyFilter the converted object
   */
  public static TSObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TSObjectKeyFilter out = new TSObjectKeyFilter ();

    Map TaxStatusMap = (Map)record.get("TaxStatus");
    Boolean TaxStatusFetch = DataHelper.getFetch(TaxStatusMap);
    Boolean TaxStatusSortDir = DataHelper.getSortDirection(TaxStatusMap);
    Integer TaxStatusSortOrder = DataHelper.getSortOrder(TaxStatusMap);
    if (TaxStatusFetch != null) out.setTaxStatusFetch(TaxStatusFetch);
    if (TaxStatusSortDir != null) out.setTaxStatusSortDirection(TaxStatusSortDir);
    if (TaxStatusSortOrder != null) out.setTaxStatusSortOrder(TaxStatusSortOrder);

    Filter[] TaxStatusFilter = DataHelper.mapToFilterArray(TaxStatusMap, Integer.class);
    if (TaxStatusFilter != null) {
      IntegerFilter[] TaxStatusFilters = new IntegerFilter[TaxStatusFilter.length];
      for (int i = 0; i < TaxStatusFilters.length; i++) {
        TaxStatusFilters[i] = (IntegerFilter)TaxStatusFilter[i];
      }
      try {
        out.setTaxStatusFilter(TaxStatusFilters);
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
