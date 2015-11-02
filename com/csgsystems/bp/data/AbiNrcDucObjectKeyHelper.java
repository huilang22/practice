/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiNrcDucObjectKeyHelper.java
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

/** Helper class for AbiNrcDucObject's Key objects. */
public class AbiNrcDucObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AbiNrcDucObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiNrcDucObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiNrcDucObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiNrcDucObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiNrcDucObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiNrcDucObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AbiNrcDucObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiNrcDucObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiNrcDucObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiNrcDucObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiNrcDucObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiNrcDucObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AbiNrcDucObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AbiNrcDucObjectKeyData the converted object
   */
  public static AbiNrcDucObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AbiNrcDucObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AbiNrcDucObject")
   * @return AbiNrcDucObjectKeyData the converted object
   */
  public static AbiNrcDucObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiNrcDucObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AbiNrcDucObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AbiNrcDucObjectKeyFilter the converted object
   */
  public static AbiNrcDucObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AbiNrcDucObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AbiNrcDucObject")
   * @return AbiNrcDucObjectKeyFilter the converted object
   */
  public static AbiNrcDucObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiNrcDucObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AbiNrcDucObjectKeyData to a Map (not including the root).
  /** convert AbiNrcDucObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AbiNrcDucObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TrackingIdSet) record.put ("TrackingId", in.TrackingId);
  
    if (in._TrackingIdServSet) record.put ("TrackingIdServ", in.TrackingIdServ);
  
    if (in._ParentChargeTypeSet) record.put ("ParentChargeType", in.ParentChargeType);
  
    return record;
  }
  /** convert AbiNrcDucObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AbiNrcDucObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TrackingId, in.TrackingIdSort, in.TrackingIdSortAscending, in.TrackingIdFetch);
      if (map != null) record.put ("TrackingId", map);
      map = DataHelper.filterToMap (in.TrackingIdServ, in.TrackingIdServSort, in.TrackingIdServSortAscending, in.TrackingIdServFetch);
      if (map != null) record.put ("TrackingIdServ", map);
      map = DataHelper.filterToMap (in.ParentChargeType, in.ParentChargeTypeSort, in.ParentChargeTypeSortAscending, in.ParentChargeTypeFetch);
      if (map != null) record.put ("ParentChargeType", map);
    return record;
  }
  /** convert Map to AbiNrcDucObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiNrcDucObjectKeyData the converted object
   */
  public static AbiNrcDucObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiNrcDucObjectKeyData out = new AbiNrcDucObjectKeyData ();

    if ((obj = record.get ("TrackingId")) != null)
    {
      out.TrackingId = (BigInteger) obj;
      out._TrackingIdSet = true;
    }
  
    if ((obj = record.get ("TrackingIdServ")) != null)
    {
      out.TrackingIdServ = (BigInteger) obj;
      out._TrackingIdServSet = true;
    }
  
    if ((obj = record.get ("ParentChargeType")) != null)
    {
      out.ParentChargeType = (BigInteger) obj;
      out._ParentChargeTypeSet = true;
    }
  
    return out;
  }
  /** convert Map to AbiNrcDucObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiNrcDucObjectKeyFilter the converted object
   */
  public static AbiNrcDucObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiNrcDucObjectKeyFilter out = new AbiNrcDucObjectKeyFilter ();

    Map TrackingIdMap = (Map)record.get("TrackingId");
    Boolean TrackingIdFetch = DataHelper.getFetch(TrackingIdMap);
    Boolean TrackingIdSortDir = DataHelper.getSortDirection(TrackingIdMap);
    Integer TrackingIdSortOrder = DataHelper.getSortOrder(TrackingIdMap);
    if (TrackingIdFetch != null) out.setTrackingIdFetch(TrackingIdFetch);
    if (TrackingIdSortDir != null) out.setTrackingIdSortDirection(TrackingIdSortDir);
    if (TrackingIdSortOrder != null) out.setTrackingIdSortOrder(TrackingIdSortOrder);

    Filter[] TrackingIdFilter = DataHelper.mapToFilterArray(TrackingIdMap, BigInteger.class);
    if (TrackingIdFilter != null) {
      BigIntegerFilter[] TrackingIdFilters = new BigIntegerFilter[TrackingIdFilter.length];
      for (int i = 0; i < TrackingIdFilters.length; i++) {
        TrackingIdFilters[i] = (BigIntegerFilter)TrackingIdFilter[i];
      }
      try {
        out.setTrackingIdFilter(TrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TrackingIdServMap = (Map)record.get("TrackingIdServ");
    Boolean TrackingIdServFetch = DataHelper.getFetch(TrackingIdServMap);
    Boolean TrackingIdServSortDir = DataHelper.getSortDirection(TrackingIdServMap);
    Integer TrackingIdServSortOrder = DataHelper.getSortOrder(TrackingIdServMap);
    if (TrackingIdServFetch != null) out.setTrackingIdServFetch(TrackingIdServFetch);
    if (TrackingIdServSortDir != null) out.setTrackingIdServSortDirection(TrackingIdServSortDir);
    if (TrackingIdServSortOrder != null) out.setTrackingIdServSortOrder(TrackingIdServSortOrder);

    Filter[] TrackingIdServFilter = DataHelper.mapToFilterArray(TrackingIdServMap, BigInteger.class);
    if (TrackingIdServFilter != null) {
      BigIntegerFilter[] TrackingIdServFilters = new BigIntegerFilter[TrackingIdServFilter.length];
      for (int i = 0; i < TrackingIdServFilters.length; i++) {
        TrackingIdServFilters[i] = (BigIntegerFilter)TrackingIdServFilter[i];
      }
      try {
        out.setTrackingIdServFilter(TrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentChargeTypeMap = (Map)record.get("ParentChargeType");
    Boolean ParentChargeTypeFetch = DataHelper.getFetch(ParentChargeTypeMap);
    Boolean ParentChargeTypeSortDir = DataHelper.getSortDirection(ParentChargeTypeMap);
    Integer ParentChargeTypeSortOrder = DataHelper.getSortOrder(ParentChargeTypeMap);
    if (ParentChargeTypeFetch != null) out.setParentChargeTypeFetch(ParentChargeTypeFetch);
    if (ParentChargeTypeSortDir != null) out.setParentChargeTypeSortDirection(ParentChargeTypeSortDir);
    if (ParentChargeTypeSortOrder != null) out.setParentChargeTypeSortOrder(ParentChargeTypeSortOrder);

    Filter[] ParentChargeTypeFilter = DataHelper.mapToFilterArray(ParentChargeTypeMap, BigInteger.class);
    if (ParentChargeTypeFilter != null) {
      BigIntegerFilter[] ParentChargeTypeFilters = new BigIntegerFilter[ParentChargeTypeFilter.length];
      for (int i = 0; i < ParentChargeTypeFilters.length; i++) {
        ParentChargeTypeFilters[i] = (BigIntegerFilter)ParentChargeTypeFilter[i];
      }
      try {
        out.setParentChargeTypeFilter(ParentChargeTypeFilters);
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
