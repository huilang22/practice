/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalContributionTaxObjectKeyHelper.java
 * Definition File: Customer/.xml
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

/** Helper class for HistoricalContributionTaxObject's Key objects. */
public class HistoricalContributionTaxObjectKeyHelper implements ArubaObjectHelper
{
  /** convert HistoricalContributionTaxObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionTaxObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalContributionTaxObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalContributionTaxObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionTaxObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalContributionTaxObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert HistoricalContributionTaxObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionTaxObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalContributionTaxObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalContributionTaxObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionTaxObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalContributionTaxObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HistoricalContributionTaxObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return HistoricalContributionTaxObjectKeyData the converted object
   */
  public static HistoricalContributionTaxObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HistoricalContributionTaxObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HistoricalContributionTaxObject")
   * @return HistoricalContributionTaxObjectKeyData the converted object
   */
  public static HistoricalContributionTaxObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionTaxObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HistoricalContributionTaxObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return HistoricalContributionTaxObjectKeyFilter the converted object
   */
  public static HistoricalContributionTaxObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HistoricalContributionTaxObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HistoricalContributionTaxObject")
   * @return HistoricalContributionTaxObjectKeyFilter the converted object
   */
  public static HistoricalContributionTaxObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionTaxObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert HistoricalContributionTaxObjectKeyData to a Map (not including the root).
  /** convert HistoricalContributionTaxObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HistoricalContributionTaxObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccumulationTrackingIdSet) record.put ("AccumulationTrackingId", in.AccumulationTrackingId);
  
    if (in._AccumulationTrackingIdServSet) record.put ("AccumulationTrackingIdServ", in.AccumulationTrackingIdServ);
  
    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    return record;
  }
  /** convert HistoricalContributionTaxObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HistoricalContributionTaxObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccumulationTrackingId, in.AccumulationTrackingIdSort, in.AccumulationTrackingIdSortAscending, in.AccumulationTrackingIdFetch);
      if (map != null) record.put ("AccumulationTrackingId", map);
      map = DataHelper.filterToMap (in.AccumulationTrackingIdServ, in.AccumulationTrackingIdServSort, in.AccumulationTrackingIdServSortAscending, in.AccumulationTrackingIdServFetch);
      if (map != null) record.put ("AccumulationTrackingIdServ", map);
      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
    return record;
  }
  /** convert Map to HistoricalContributionTaxObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalContributionTaxObjectKeyData the converted object
   */
  public static HistoricalContributionTaxObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalContributionTaxObjectKeyData out = new HistoricalContributionTaxObjectKeyData ();

    if ((obj = record.get ("AccumulationTrackingId")) != null)
    {
      out.AccumulationTrackingId = (Integer) obj;
      out._AccumulationTrackingIdSet = true;
    }
  
    if ((obj = record.get ("AccumulationTrackingIdServ")) != null)
    {
      out.AccumulationTrackingIdServ = (Integer) obj;
      out._AccumulationTrackingIdServSet = true;
    }
  
    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
      out._TaxPkgInstIdSet = true;
    }
  
    return out;
  }
  /** convert Map to HistoricalContributionTaxObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalContributionTaxObjectKeyFilter the converted object
   */
  public static HistoricalContributionTaxObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalContributionTaxObjectKeyFilter out = new HistoricalContributionTaxObjectKeyFilter ();

    Map AccumulationTrackingIdMap = (Map)record.get("AccumulationTrackingId");
    Boolean AccumulationTrackingIdFetch = DataHelper.getFetch(AccumulationTrackingIdMap);
    Boolean AccumulationTrackingIdSortDir = DataHelper.getSortDirection(AccumulationTrackingIdMap);
    Integer AccumulationTrackingIdSortOrder = DataHelper.getSortOrder(AccumulationTrackingIdMap);
    if (AccumulationTrackingIdFetch != null) out.setAccumulationTrackingIdFetch(AccumulationTrackingIdFetch);
    if (AccumulationTrackingIdSortDir != null) out.setAccumulationTrackingIdSortDirection(AccumulationTrackingIdSortDir);
    if (AccumulationTrackingIdSortOrder != null) out.setAccumulationTrackingIdSortOrder(AccumulationTrackingIdSortOrder);

    Filter[] AccumulationTrackingIdFilter = DataHelper.mapToFilterArray(AccumulationTrackingIdMap, Integer.class);
    if (AccumulationTrackingIdFilter != null) {
      IntegerFilter[] AccumulationTrackingIdFilters = new IntegerFilter[AccumulationTrackingIdFilter.length];
      for (int i = 0; i < AccumulationTrackingIdFilters.length; i++) {
        AccumulationTrackingIdFilters[i] = (IntegerFilter)AccumulationTrackingIdFilter[i];
      }
      try {
        out.setAccumulationTrackingIdFilter(AccumulationTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccumulationTrackingIdServMap = (Map)record.get("AccumulationTrackingIdServ");
    Boolean AccumulationTrackingIdServFetch = DataHelper.getFetch(AccumulationTrackingIdServMap);
    Boolean AccumulationTrackingIdServSortDir = DataHelper.getSortDirection(AccumulationTrackingIdServMap);
    Integer AccumulationTrackingIdServSortOrder = DataHelper.getSortOrder(AccumulationTrackingIdServMap);
    if (AccumulationTrackingIdServFetch != null) out.setAccumulationTrackingIdServFetch(AccumulationTrackingIdServFetch);
    if (AccumulationTrackingIdServSortDir != null) out.setAccumulationTrackingIdServSortDirection(AccumulationTrackingIdServSortDir);
    if (AccumulationTrackingIdServSortOrder != null) out.setAccumulationTrackingIdServSortOrder(AccumulationTrackingIdServSortOrder);

    Filter[] AccumulationTrackingIdServFilter = DataHelper.mapToFilterArray(AccumulationTrackingIdServMap, Integer.class);
    if (AccumulationTrackingIdServFilter != null) {
      IntegerFilter[] AccumulationTrackingIdServFilters = new IntegerFilter[AccumulationTrackingIdServFilter.length];
      for (int i = 0; i < AccumulationTrackingIdServFilters.length; i++) {
        AccumulationTrackingIdServFilters[i] = (IntegerFilter)AccumulationTrackingIdServFilter[i];
      }
      try {
        out.setAccumulationTrackingIdServFilter(AccumulationTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxPkgInstIdMap = (Map)record.get("TaxPkgInstId");
    Boolean TaxPkgInstIdFetch = DataHelper.getFetch(TaxPkgInstIdMap);
    Boolean TaxPkgInstIdSortDir = DataHelper.getSortDirection(TaxPkgInstIdMap);
    Integer TaxPkgInstIdSortOrder = DataHelper.getSortOrder(TaxPkgInstIdMap);
    if (TaxPkgInstIdFetch != null) out.setTaxPkgInstIdFetch(TaxPkgInstIdFetch);
    if (TaxPkgInstIdSortDir != null) out.setTaxPkgInstIdSortDirection(TaxPkgInstIdSortDir);
    if (TaxPkgInstIdSortOrder != null) out.setTaxPkgInstIdSortOrder(TaxPkgInstIdSortOrder);

    Filter[] TaxPkgInstIdFilter = DataHelper.mapToFilterArray(TaxPkgInstIdMap, Integer.class);
    if (TaxPkgInstIdFilter != null) {
      IntegerFilter[] TaxPkgInstIdFilters = new IntegerFilter[TaxPkgInstIdFilter.length];
      for (int i = 0; i < TaxPkgInstIdFilters.length; i++) {
        TaxPkgInstIdFilters[i] = (IntegerFilter)TaxPkgInstIdFilter[i];
      }
      try {
        out.setTaxPkgInstIdFilter(TaxPkgInstIdFilters);
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
