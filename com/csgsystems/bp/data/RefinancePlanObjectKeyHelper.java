/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RefinancePlanObjectKeyHelper.java
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

/** Helper class for RefinancePlanObject's Key objects. */
public class RefinancePlanObjectKeyHelper implements ArubaObjectHelper
{
  /** convert RefinancePlanObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RefinancePlanObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RefinancePlanObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RefinancePlanObject")
   * @return Map     the output Map
   */
  public static Map toMap (RefinancePlanObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RefinancePlanObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert RefinancePlanObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RefinancePlanObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RefinancePlanObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RefinancePlanObject")
   * @return Map     the output Map
   */
  public static Map toMap (RefinancePlanObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RefinancePlanObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RefinancePlanObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return RefinancePlanObjectKeyData the converted object
   */
  public static RefinancePlanObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RefinancePlanObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RefinancePlanObject")
   * @return RefinancePlanObjectKeyData the converted object
   */
  public static RefinancePlanObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RefinancePlanObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RefinancePlanObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return RefinancePlanObjectKeyFilter the converted object
   */
  public static RefinancePlanObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RefinancePlanObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RefinancePlanObject")
   * @return RefinancePlanObjectKeyFilter the converted object
   */
  public static RefinancePlanObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RefinancePlanObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert RefinancePlanObjectKeyData to a Map (not including the root).
  /** convert RefinancePlanObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RefinancePlanObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._RefinancePlanIdSet) record.put ("RefinancePlanId", in.RefinancePlanId);
  
    if (in._RefinancePlanIdServSet) record.put ("RefinancePlanIdServ", in.RefinancePlanIdServ);
  
    if (in._AdjTrackingIdSet) record.put ("AdjTrackingId", in.AdjTrackingId);
  
    if (in._AdjTrackingIdServSet) record.put ("AdjTrackingIdServ", in.AdjTrackingIdServ);
  
    return record;
  }
  /** convert RefinancePlanObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RefinancePlanObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.RefinancePlanId, in.RefinancePlanIdSort, in.RefinancePlanIdSortAscending, in.RefinancePlanIdFetch);
      if (map != null) record.put ("RefinancePlanId", map);
      map = DataHelper.filterToMap (in.RefinancePlanIdServ, in.RefinancePlanIdServSort, in.RefinancePlanIdServSortAscending, in.RefinancePlanIdServFetch);
      if (map != null) record.put ("RefinancePlanIdServ", map);
      map = DataHelper.filterToMap (in.AdjTrackingId, in.AdjTrackingIdSort, in.AdjTrackingIdSortAscending, in.AdjTrackingIdFetch);
      if (map != null) record.put ("AdjTrackingId", map);
      map = DataHelper.filterToMap (in.AdjTrackingIdServ, in.AdjTrackingIdServSort, in.AdjTrackingIdServSortAscending, in.AdjTrackingIdServFetch);
      if (map != null) record.put ("AdjTrackingIdServ", map);
    return record;
  }
  /** convert Map to RefinancePlanObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RefinancePlanObjectKeyData the converted object
   */
  public static RefinancePlanObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RefinancePlanObjectKeyData out = new RefinancePlanObjectKeyData ();

    if ((obj = record.get ("RefinancePlanId")) != null)
    {
      out.RefinancePlanId = (Integer) obj;
      out._RefinancePlanIdSet = true;
    }
  
    if ((obj = record.get ("RefinancePlanIdServ")) != null)
    {
      out.RefinancePlanIdServ = (Integer) obj;
      out._RefinancePlanIdServSet = true;
    }
  
    if ((obj = record.get ("AdjTrackingId")) != null)
    {
      out.AdjTrackingId = (Integer) obj;
      out._AdjTrackingIdSet = true;
    }
  
    if ((obj = record.get ("AdjTrackingIdServ")) != null)
    {
      out.AdjTrackingIdServ = (Integer) obj;
      out._AdjTrackingIdServSet = true;
    }
  
    return out;
  }
  /** convert Map to RefinancePlanObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RefinancePlanObjectKeyFilter the converted object
   */
  public static RefinancePlanObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RefinancePlanObjectKeyFilter out = new RefinancePlanObjectKeyFilter ();

    Map RefinancePlanIdMap = (Map)record.get("RefinancePlanId");
    Boolean RefinancePlanIdFetch = DataHelper.getFetch(RefinancePlanIdMap);
    Boolean RefinancePlanIdSortDir = DataHelper.getSortDirection(RefinancePlanIdMap);
    Integer RefinancePlanIdSortOrder = DataHelper.getSortOrder(RefinancePlanIdMap);
    if (RefinancePlanIdFetch != null) out.setRefinancePlanIdFetch(RefinancePlanIdFetch);
    if (RefinancePlanIdSortDir != null) out.setRefinancePlanIdSortDirection(RefinancePlanIdSortDir);
    if (RefinancePlanIdSortOrder != null) out.setRefinancePlanIdSortOrder(RefinancePlanIdSortOrder);

    Filter[] RefinancePlanIdFilter = DataHelper.mapToFilterArray(RefinancePlanIdMap, Integer.class);
    if (RefinancePlanIdFilter != null) {
      IntegerFilter[] RefinancePlanIdFilters = new IntegerFilter[RefinancePlanIdFilter.length];
      for (int i = 0; i < RefinancePlanIdFilters.length; i++) {
        RefinancePlanIdFilters[i] = (IntegerFilter)RefinancePlanIdFilter[i];
      }
      try {
        out.setRefinancePlanIdFilter(RefinancePlanIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RefinancePlanIdServMap = (Map)record.get("RefinancePlanIdServ");
    Boolean RefinancePlanIdServFetch = DataHelper.getFetch(RefinancePlanIdServMap);
    Boolean RefinancePlanIdServSortDir = DataHelper.getSortDirection(RefinancePlanIdServMap);
    Integer RefinancePlanIdServSortOrder = DataHelper.getSortOrder(RefinancePlanIdServMap);
    if (RefinancePlanIdServFetch != null) out.setRefinancePlanIdServFetch(RefinancePlanIdServFetch);
    if (RefinancePlanIdServSortDir != null) out.setRefinancePlanIdServSortDirection(RefinancePlanIdServSortDir);
    if (RefinancePlanIdServSortOrder != null) out.setRefinancePlanIdServSortOrder(RefinancePlanIdServSortOrder);

    Filter[] RefinancePlanIdServFilter = DataHelper.mapToFilterArray(RefinancePlanIdServMap, Integer.class);
    if (RefinancePlanIdServFilter != null) {
      IntegerFilter[] RefinancePlanIdServFilters = new IntegerFilter[RefinancePlanIdServFilter.length];
      for (int i = 0; i < RefinancePlanIdServFilters.length; i++) {
        RefinancePlanIdServFilters[i] = (IntegerFilter)RefinancePlanIdServFilter[i];
      }
      try {
        out.setRefinancePlanIdServFilter(RefinancePlanIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AdjTrackingIdMap = (Map)record.get("AdjTrackingId");
    Boolean AdjTrackingIdFetch = DataHelper.getFetch(AdjTrackingIdMap);
    Boolean AdjTrackingIdSortDir = DataHelper.getSortDirection(AdjTrackingIdMap);
    Integer AdjTrackingIdSortOrder = DataHelper.getSortOrder(AdjTrackingIdMap);
    if (AdjTrackingIdFetch != null) out.setAdjTrackingIdFetch(AdjTrackingIdFetch);
    if (AdjTrackingIdSortDir != null) out.setAdjTrackingIdSortDirection(AdjTrackingIdSortDir);
    if (AdjTrackingIdSortOrder != null) out.setAdjTrackingIdSortOrder(AdjTrackingIdSortOrder);

    Filter[] AdjTrackingIdFilter = DataHelper.mapToFilterArray(AdjTrackingIdMap, Integer.class);
    if (AdjTrackingIdFilter != null) {
      IntegerFilter[] AdjTrackingIdFilters = new IntegerFilter[AdjTrackingIdFilter.length];
      for (int i = 0; i < AdjTrackingIdFilters.length; i++) {
        AdjTrackingIdFilters[i] = (IntegerFilter)AdjTrackingIdFilter[i];
      }
      try {
        out.setAdjTrackingIdFilter(AdjTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AdjTrackingIdServMap = (Map)record.get("AdjTrackingIdServ");
    Boolean AdjTrackingIdServFetch = DataHelper.getFetch(AdjTrackingIdServMap);
    Boolean AdjTrackingIdServSortDir = DataHelper.getSortDirection(AdjTrackingIdServMap);
    Integer AdjTrackingIdServSortOrder = DataHelper.getSortOrder(AdjTrackingIdServMap);
    if (AdjTrackingIdServFetch != null) out.setAdjTrackingIdServFetch(AdjTrackingIdServFetch);
    if (AdjTrackingIdServSortDir != null) out.setAdjTrackingIdServSortDirection(AdjTrackingIdServSortDir);
    if (AdjTrackingIdServSortOrder != null) out.setAdjTrackingIdServSortOrder(AdjTrackingIdServSortOrder);

    Filter[] AdjTrackingIdServFilter = DataHelper.mapToFilterArray(AdjTrackingIdServMap, Integer.class);
    if (AdjTrackingIdServFilter != null) {
      IntegerFilter[] AdjTrackingIdServFilters = new IntegerFilter[AdjTrackingIdServFilter.length];
      for (int i = 0; i < AdjTrackingIdServFilters.length; i++) {
        AdjTrackingIdServFilters[i] = (IntegerFilter)AdjTrackingIdServFilter[i];
      }
      try {
        out.setAdjTrackingIdServFilter(AdjTrackingIdServFilters);
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
