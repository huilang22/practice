/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillingStatisticsObjectKeyHelper.java
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

/** Helper class for AbiBillingStatisticsObject's Key objects. */
public class AbiBillingStatisticsObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AbiBillingStatisticsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillingStatisticsObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiBillingStatisticsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiBillingStatisticsObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillingStatisticsObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiBillingStatisticsObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AbiBillingStatisticsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillingStatisticsObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiBillingStatisticsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiBillingStatisticsObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillingStatisticsObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiBillingStatisticsObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AbiBillingStatisticsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AbiBillingStatisticsObjectKeyData the converted object
   */
  public static AbiBillingStatisticsObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AbiBillingStatisticsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AbiBillingStatisticsObject")
   * @return AbiBillingStatisticsObjectKeyData the converted object
   */
  public static AbiBillingStatisticsObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillingStatisticsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AbiBillingStatisticsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AbiBillingStatisticsObjectKeyFilter the converted object
   */
  public static AbiBillingStatisticsObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AbiBillingStatisticsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AbiBillingStatisticsObject")
   * @return AbiBillingStatisticsObjectKeyFilter the converted object
   */
  public static AbiBillingStatisticsObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillingStatisticsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AbiBillingStatisticsObjectKeyData to a Map (not including the root).
  /** convert AbiBillingStatisticsObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AbiBillingStatisticsObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._StatisticIdSet) record.put ("StatisticId", in.StatisticId);
  
    return record;
  }
  /** convert AbiBillingStatisticsObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AbiBillingStatisticsObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.StatisticId, in.StatisticIdSort, in.StatisticIdSortAscending, in.StatisticIdFetch);
      if (map != null) record.put ("StatisticId", map);
    return record;
  }
  /** convert Map to AbiBillingStatisticsObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiBillingStatisticsObjectKeyData the converted object
   */
  public static AbiBillingStatisticsObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiBillingStatisticsObjectKeyData out = new AbiBillingStatisticsObjectKeyData ();

    if ((obj = record.get ("StatisticId")) != null)
    {
      out.StatisticId = (BigInteger) obj;
      out._StatisticIdSet = true;
    }
  
    return out;
  }
  /** convert Map to AbiBillingStatisticsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiBillingStatisticsObjectKeyFilter the converted object
   */
  public static AbiBillingStatisticsObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiBillingStatisticsObjectKeyFilter out = new AbiBillingStatisticsObjectKeyFilter ();

    Map StatisticIdMap = (Map)record.get("StatisticId");
    Boolean StatisticIdFetch = DataHelper.getFetch(StatisticIdMap);
    Boolean StatisticIdSortDir = DataHelper.getSortDirection(StatisticIdMap);
    Integer StatisticIdSortOrder = DataHelper.getSortOrder(StatisticIdMap);
    if (StatisticIdFetch != null) out.setStatisticIdFetch(StatisticIdFetch);
    if (StatisticIdSortDir != null) out.setStatisticIdSortDirection(StatisticIdSortDir);
    if (StatisticIdSortOrder != null) out.setStatisticIdSortOrder(StatisticIdSortOrder);

    Filter[] StatisticIdFilter = DataHelper.mapToFilterArray(StatisticIdMap, BigInteger.class);
    if (StatisticIdFilter != null) {
      BigIntegerFilter[] StatisticIdFilters = new BigIntegerFilter[StatisticIdFilter.length];
      for (int i = 0; i < StatisticIdFilters.length; i++) {
        StatisticIdFilters[i] = (BigIntegerFilter)StatisticIdFilter[i];
      }
      try {
        out.setStatisticIdFilter(StatisticIdFilters);
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
