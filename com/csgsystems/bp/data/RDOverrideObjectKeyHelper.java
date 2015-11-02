/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RDOverrideObjectKeyHelper.java
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

/** Helper class for RDOverrideObject's Key objects. */
public class RDOverrideObjectKeyHelper implements ArubaObjectHelper
{
  /** convert RDOverrideObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RDOverrideObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RDOverrideObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RDOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (RDOverrideObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RDOverrideObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert RDOverrideObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RDOverrideObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RDOverrideObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RDOverrideObject")
   * @return Map     the output Map
   */
  public static Map toMap (RDOverrideObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RDOverrideObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RDOverrideObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return RDOverrideObjectKeyData the converted object
   */
  public static RDOverrideObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RDOverrideObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RDOverrideObject")
   * @return RDOverrideObjectKeyData the converted object
   */
  public static RDOverrideObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RDOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RDOverrideObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return RDOverrideObjectKeyFilter the converted object
   */
  public static RDOverrideObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RDOverrideObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RDOverrideObject")
   * @return RDOverrideObjectKeyFilter the converted object
   */
  public static RDOverrideObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RDOverrideObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert RDOverrideObjectKeyData to a Map (not including the root).
  /** convert RDOverrideObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RDOverrideObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._OverrideTrackingIdSet) record.put ("OverrideTrackingId", in.OverrideTrackingId);
  
    if (in._OverrideTrackingIdServSet) record.put ("OverrideTrackingIdServ", in.OverrideTrackingIdServ);
  
    return record;
  }
  /** convert RDOverrideObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (RDOverrideObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.OverrideTrackingId, in.OverrideTrackingIdSort, in.OverrideTrackingIdSortAscending, in.OverrideTrackingIdFetch);
      if (map != null) record.put ("OverrideTrackingId", map);
      map = DataHelper.filterToMap (in.OverrideTrackingIdServ, in.OverrideTrackingIdServSort, in.OverrideTrackingIdServSortAscending, in.OverrideTrackingIdServFetch);
      if (map != null) record.put ("OverrideTrackingIdServ", map);
    return record;
  }
  /** convert Map to RDOverrideObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RDOverrideObjectKeyData the converted object
   */
  public static RDOverrideObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RDOverrideObjectKeyData out = new RDOverrideObjectKeyData ();

    if ((obj = record.get ("OverrideTrackingId")) != null)
    {
      out.OverrideTrackingId = (Integer) obj;
      out._OverrideTrackingIdSet = true;
    }
  
    if ((obj = record.get ("OverrideTrackingIdServ")) != null)
    {
      out.OverrideTrackingIdServ = (Integer) obj;
      out._OverrideTrackingIdServSet = true;
    }
  
    return out;
  }
  /** convert Map to RDOverrideObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RDOverrideObjectKeyFilter the converted object
   */
  public static RDOverrideObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RDOverrideObjectKeyFilter out = new RDOverrideObjectKeyFilter ();

    Map OverrideTrackingIdMap = (Map)record.get("OverrideTrackingId");
    Boolean OverrideTrackingIdFetch = DataHelper.getFetch(OverrideTrackingIdMap);
    Boolean OverrideTrackingIdSortDir = DataHelper.getSortDirection(OverrideTrackingIdMap);
    Integer OverrideTrackingIdSortOrder = DataHelper.getSortOrder(OverrideTrackingIdMap);
    if (OverrideTrackingIdFetch != null) out.setOverrideTrackingIdFetch(OverrideTrackingIdFetch);
    if (OverrideTrackingIdSortDir != null) out.setOverrideTrackingIdSortDirection(OverrideTrackingIdSortDir);
    if (OverrideTrackingIdSortOrder != null) out.setOverrideTrackingIdSortOrder(OverrideTrackingIdSortOrder);

    Filter[] OverrideTrackingIdFilter = DataHelper.mapToFilterArray(OverrideTrackingIdMap, Integer.class);
    if (OverrideTrackingIdFilter != null) {
      IntegerFilter[] OverrideTrackingIdFilters = new IntegerFilter[OverrideTrackingIdFilter.length];
      for (int i = 0; i < OverrideTrackingIdFilters.length; i++) {
        OverrideTrackingIdFilters[i] = (IntegerFilter)OverrideTrackingIdFilter[i];
      }
      try {
        out.setOverrideTrackingIdFilter(OverrideTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OverrideTrackingIdServMap = (Map)record.get("OverrideTrackingIdServ");
    Boolean OverrideTrackingIdServFetch = DataHelper.getFetch(OverrideTrackingIdServMap);
    Boolean OverrideTrackingIdServSortDir = DataHelper.getSortDirection(OverrideTrackingIdServMap);
    Integer OverrideTrackingIdServSortOrder = DataHelper.getSortOrder(OverrideTrackingIdServMap);
    if (OverrideTrackingIdServFetch != null) out.setOverrideTrackingIdServFetch(OverrideTrackingIdServFetch);
    if (OverrideTrackingIdServSortDir != null) out.setOverrideTrackingIdServSortDirection(OverrideTrackingIdServSortDir);
    if (OverrideTrackingIdServSortOrder != null) out.setOverrideTrackingIdServSortOrder(OverrideTrackingIdServSortOrder);

    Filter[] OverrideTrackingIdServFilter = DataHelper.mapToFilterArray(OverrideTrackingIdServMap, Integer.class);
    if (OverrideTrackingIdServFilter != null) {
      IntegerFilter[] OverrideTrackingIdServFilters = new IntegerFilter[OverrideTrackingIdServFilter.length];
      for (int i = 0; i < OverrideTrackingIdServFilters.length; i++) {
        OverrideTrackingIdServFilters[i] = (IntegerFilter)OverrideTrackingIdServFilter[i];
      }
      try {
        out.setOverrideTrackingIdServFilter(OverrideTrackingIdServFilters);
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
