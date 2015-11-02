/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HqContractUnitCrObjectKeyHelper.java
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

/** Helper class for HqContractUnitCrObject's Key objects. */
public class HqContractUnitCrObjectKeyHelper implements ArubaObjectHelper
{
  /** convert HqContractUnitCrObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqContractUnitCrObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqContractUnitCrObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqContractUnitCrObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqContractUnitCrObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqContractUnitCrObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert HqContractUnitCrObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HqContractUnitCrObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HqContractUnitCrObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HqContractUnitCrObject")
   * @return Map     the output Map
   */
  public static Map toMap (HqContractUnitCrObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HqContractUnitCrObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HqContractUnitCrObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return HqContractUnitCrObjectKeyData the converted object
   */
  public static HqContractUnitCrObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HqContractUnitCrObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HqContractUnitCrObject")
   * @return HqContractUnitCrObjectKeyData the converted object
   */
  public static HqContractUnitCrObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HqContractUnitCrObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HqContractUnitCrObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return HqContractUnitCrObjectKeyFilter the converted object
   */
  public static HqContractUnitCrObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HqContractUnitCrObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HqContractUnitCrObject")
   * @return HqContractUnitCrObjectKeyFilter the converted object
   */
  public static HqContractUnitCrObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HqContractUnitCrObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert HqContractUnitCrObjectKeyData to a Map (not including the root).
  /** convert HqContractUnitCrObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HqContractUnitCrObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TrackingIdSet) record.put ("TrackingId", in.TrackingId);
  
    if (in._TrackingIdServSet) record.put ("TrackingIdServ", in.TrackingIdServ);
  
    if (in._UnitCrIdSet) record.put ("UnitCrId", in.UnitCrId);
  
    return record;
  }
  /** convert HqContractUnitCrObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HqContractUnitCrObjectKeyFilter in, Map record)
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
      map = DataHelper.filterToMap (in.UnitCrId, in.UnitCrIdSort, in.UnitCrIdSortAscending, in.UnitCrIdFetch);
      if (map != null) record.put ("UnitCrId", map);
    return record;
  }
  /** convert Map to HqContractUnitCrObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqContractUnitCrObjectKeyData the converted object
   */
  public static HqContractUnitCrObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqContractUnitCrObjectKeyData out = new HqContractUnitCrObjectKeyData ();

    if ((obj = record.get ("TrackingId")) != null)
    {
      out.TrackingId = (Integer) obj;
      out._TrackingIdSet = true;
    }
  
    if ((obj = record.get ("TrackingIdServ")) != null)
    {
      out.TrackingIdServ = (Integer) obj;
      out._TrackingIdServSet = true;
    }
  
    if ((obj = record.get ("UnitCrId")) != null)
    {
      out.UnitCrId = (Integer) obj;
      out._UnitCrIdSet = true;
    }
  
    return out;
  }
  /** convert Map to HqContractUnitCrObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HqContractUnitCrObjectKeyFilter the converted object
   */
  public static HqContractUnitCrObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HqContractUnitCrObjectKeyFilter out = new HqContractUnitCrObjectKeyFilter ();

    Map TrackingIdMap = (Map)record.get("TrackingId");
    Boolean TrackingIdFetch = DataHelper.getFetch(TrackingIdMap);
    Boolean TrackingIdSortDir = DataHelper.getSortDirection(TrackingIdMap);
    Integer TrackingIdSortOrder = DataHelper.getSortOrder(TrackingIdMap);
    if (TrackingIdFetch != null) out.setTrackingIdFetch(TrackingIdFetch);
    if (TrackingIdSortDir != null) out.setTrackingIdSortDirection(TrackingIdSortDir);
    if (TrackingIdSortOrder != null) out.setTrackingIdSortOrder(TrackingIdSortOrder);

    Filter[] TrackingIdFilter = DataHelper.mapToFilterArray(TrackingIdMap, Integer.class);
    if (TrackingIdFilter != null) {
      IntegerFilter[] TrackingIdFilters = new IntegerFilter[TrackingIdFilter.length];
      for (int i = 0; i < TrackingIdFilters.length; i++) {
        TrackingIdFilters[i] = (IntegerFilter)TrackingIdFilter[i];
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

    Filter[] TrackingIdServFilter = DataHelper.mapToFilterArray(TrackingIdServMap, Integer.class);
    if (TrackingIdServFilter != null) {
      IntegerFilter[] TrackingIdServFilters = new IntegerFilter[TrackingIdServFilter.length];
      for (int i = 0; i < TrackingIdServFilters.length; i++) {
        TrackingIdServFilters[i] = (IntegerFilter)TrackingIdServFilter[i];
      }
      try {
        out.setTrackingIdServFilter(TrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitCrIdMap = (Map)record.get("UnitCrId");
    Boolean UnitCrIdFetch = DataHelper.getFetch(UnitCrIdMap);
    Boolean UnitCrIdSortDir = DataHelper.getSortDirection(UnitCrIdMap);
    Integer UnitCrIdSortOrder = DataHelper.getSortOrder(UnitCrIdMap);
    if (UnitCrIdFetch != null) out.setUnitCrIdFetch(UnitCrIdFetch);
    if (UnitCrIdSortDir != null) out.setUnitCrIdSortDirection(UnitCrIdSortDir);
    if (UnitCrIdSortOrder != null) out.setUnitCrIdSortOrder(UnitCrIdSortOrder);

    Filter[] UnitCrIdFilter = DataHelper.mapToFilterArray(UnitCrIdMap, Integer.class);
    if (UnitCrIdFilter != null) {
      IntegerFilter[] UnitCrIdFilters = new IntegerFilter[UnitCrIdFilter.length];
      for (int i = 0; i < UnitCrIdFilters.length; i++) {
        UnitCrIdFilters[i] = (IntegerFilter)UnitCrIdFilter[i];
      }
      try {
        out.setUnitCrIdFilter(UnitCrIdFilters);
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
