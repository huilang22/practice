/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SlaMeasurementDataObjectKeyHelper.java
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

/** Helper class for SlaMeasurementDataObject's Key objects. */
public class SlaMeasurementDataObjectKeyHelper implements ArubaObjectHelper
{
  /** convert SlaMeasurementDataObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SlaMeasurementDataObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SlaMeasurementDataObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SlaMeasurementDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (SlaMeasurementDataObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SlaMeasurementDataObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert SlaMeasurementDataObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SlaMeasurementDataObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SlaMeasurementDataObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SlaMeasurementDataObject")
   * @return Map     the output Map
   */
  public static Map toMap (SlaMeasurementDataObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SlaMeasurementDataObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SlaMeasurementDataObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return SlaMeasurementDataObjectKeyData the converted object
   */
  public static SlaMeasurementDataObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SlaMeasurementDataObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SlaMeasurementDataObject")
   * @return SlaMeasurementDataObjectKeyData the converted object
   */
  public static SlaMeasurementDataObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SlaMeasurementDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SlaMeasurementDataObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return SlaMeasurementDataObjectKeyFilter the converted object
   */
  public static SlaMeasurementDataObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SlaMeasurementDataObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SlaMeasurementDataObject")
   * @return SlaMeasurementDataObjectKeyFilter the converted object
   */
  public static SlaMeasurementDataObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SlaMeasurementDataObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert SlaMeasurementDataObjectKeyData to a Map (not including the root).
  /** convert SlaMeasurementDataObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SlaMeasurementDataObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._SlaMsmTrackingIdSet) record.put ("SlaMsmTrackingId", in.SlaMsmTrackingId);
  
    if (in._SlaMsmTrackingIdServSet) record.put ("SlaMsmTrackingIdServ", in.SlaMsmTrackingIdServ);
  
    return record;
  }
  /** convert SlaMeasurementDataObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SlaMeasurementDataObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.SlaMsmTrackingId, in.SlaMsmTrackingIdSort, in.SlaMsmTrackingIdSortAscending, in.SlaMsmTrackingIdFetch);
      if (map != null) record.put ("SlaMsmTrackingId", map);
      map = DataHelper.filterToMap (in.SlaMsmTrackingIdServ, in.SlaMsmTrackingIdServSort, in.SlaMsmTrackingIdServSortAscending, in.SlaMsmTrackingIdServFetch);
      if (map != null) record.put ("SlaMsmTrackingIdServ", map);
    return record;
  }
  /** convert Map to SlaMeasurementDataObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SlaMeasurementDataObjectKeyData the converted object
   */
  public static SlaMeasurementDataObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SlaMeasurementDataObjectKeyData out = new SlaMeasurementDataObjectKeyData ();

    if ((obj = record.get ("SlaMsmTrackingId")) != null)
    {
      out.SlaMsmTrackingId = (Integer) obj;
      out._SlaMsmTrackingIdSet = true;
    }
  
    if ((obj = record.get ("SlaMsmTrackingIdServ")) != null)
    {
      out.SlaMsmTrackingIdServ = (Integer) obj;
      out._SlaMsmTrackingIdServSet = true;
    }
  
    return out;
  }
  /** convert Map to SlaMeasurementDataObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SlaMeasurementDataObjectKeyFilter the converted object
   */
  public static SlaMeasurementDataObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SlaMeasurementDataObjectKeyFilter out = new SlaMeasurementDataObjectKeyFilter ();

    Map SlaMsmTrackingIdMap = (Map)record.get("SlaMsmTrackingId");
    Boolean SlaMsmTrackingIdFetch = DataHelper.getFetch(SlaMsmTrackingIdMap);
    Boolean SlaMsmTrackingIdSortDir = DataHelper.getSortDirection(SlaMsmTrackingIdMap);
    Integer SlaMsmTrackingIdSortOrder = DataHelper.getSortOrder(SlaMsmTrackingIdMap);
    if (SlaMsmTrackingIdFetch != null) out.setSlaMsmTrackingIdFetch(SlaMsmTrackingIdFetch);
    if (SlaMsmTrackingIdSortDir != null) out.setSlaMsmTrackingIdSortDirection(SlaMsmTrackingIdSortDir);
    if (SlaMsmTrackingIdSortOrder != null) out.setSlaMsmTrackingIdSortOrder(SlaMsmTrackingIdSortOrder);

    Filter[] SlaMsmTrackingIdFilter = DataHelper.mapToFilterArray(SlaMsmTrackingIdMap, Integer.class);
    if (SlaMsmTrackingIdFilter != null) {
      IntegerFilter[] SlaMsmTrackingIdFilters = new IntegerFilter[SlaMsmTrackingIdFilter.length];
      for (int i = 0; i < SlaMsmTrackingIdFilters.length; i++) {
        SlaMsmTrackingIdFilters[i] = (IntegerFilter)SlaMsmTrackingIdFilter[i];
      }
      try {
        out.setSlaMsmTrackingIdFilter(SlaMsmTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SlaMsmTrackingIdServMap = (Map)record.get("SlaMsmTrackingIdServ");
    Boolean SlaMsmTrackingIdServFetch = DataHelper.getFetch(SlaMsmTrackingIdServMap);
    Boolean SlaMsmTrackingIdServSortDir = DataHelper.getSortDirection(SlaMsmTrackingIdServMap);
    Integer SlaMsmTrackingIdServSortOrder = DataHelper.getSortOrder(SlaMsmTrackingIdServMap);
    if (SlaMsmTrackingIdServFetch != null) out.setSlaMsmTrackingIdServFetch(SlaMsmTrackingIdServFetch);
    if (SlaMsmTrackingIdServSortDir != null) out.setSlaMsmTrackingIdServSortDirection(SlaMsmTrackingIdServSortDir);
    if (SlaMsmTrackingIdServSortOrder != null) out.setSlaMsmTrackingIdServSortOrder(SlaMsmTrackingIdServSortOrder);

    Filter[] SlaMsmTrackingIdServFilter = DataHelper.mapToFilterArray(SlaMsmTrackingIdServMap, Integer.class);
    if (SlaMsmTrackingIdServFilter != null) {
      IntegerFilter[] SlaMsmTrackingIdServFilters = new IntegerFilter[SlaMsmTrackingIdServFilter.length];
      for (int i = 0; i < SlaMsmTrackingIdServFilters.length; i++) {
        SlaMsmTrackingIdServFilters[i] = (IntegerFilter)SlaMsmTrackingIdServFilter[i];
      }
      try {
        out.setSlaMsmTrackingIdServFilter(SlaMsmTrackingIdServFilters);
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
