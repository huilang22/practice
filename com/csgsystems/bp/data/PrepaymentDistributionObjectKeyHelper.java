/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrepaymentDistributionObjectKeyHelper.java
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

/** Helper class for PrepaymentDistributionObject's Key objects. */
public class PrepaymentDistributionObjectKeyHelper implements ArubaObjectHelper
{
  /** convert PrepaymentDistributionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentDistributionObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PrepaymentDistributionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PrepaymentDistributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentDistributionObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PrepaymentDistributionObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert PrepaymentDistributionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentDistributionObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PrepaymentDistributionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PrepaymentDistributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentDistributionObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PrepaymentDistributionObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PrepaymentDistributionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return PrepaymentDistributionObjectKeyData the converted object
   */
  public static PrepaymentDistributionObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PrepaymentDistributionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PrepaymentDistributionObject")
   * @return PrepaymentDistributionObjectKeyData the converted object
   */
  public static PrepaymentDistributionObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PrepaymentDistributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PrepaymentDistributionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return PrepaymentDistributionObjectKeyFilter the converted object
   */
  public static PrepaymentDistributionObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PrepaymentDistributionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PrepaymentDistributionObject")
   * @return PrepaymentDistributionObjectKeyFilter the converted object
   */
  public static PrepaymentDistributionObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PrepaymentDistributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert PrepaymentDistributionObjectKeyData to a Map (not including the root).
  /** convert PrepaymentDistributionObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PrepaymentDistributionObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._PrepaymentTrackingIdSet) record.put ("PrepaymentTrackingId", in.PrepaymentTrackingId);
  
    if (in._PrepaymentTrackingIdServSet) record.put ("PrepaymentTrackingIdServ", in.PrepaymentTrackingIdServ);
  
    if (in._DistribOrderSet) record.put ("DistribOrder", in.DistribOrder);
  
    return record;
  }
  /** convert PrepaymentDistributionObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PrepaymentDistributionObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.PrepaymentTrackingId, in.PrepaymentTrackingIdSort, in.PrepaymentTrackingIdSortAscending, in.PrepaymentTrackingIdFetch);
      if (map != null) record.put ("PrepaymentTrackingId", map);
      map = DataHelper.filterToMap (in.PrepaymentTrackingIdServ, in.PrepaymentTrackingIdServSort, in.PrepaymentTrackingIdServSortAscending, in.PrepaymentTrackingIdServFetch);
      if (map != null) record.put ("PrepaymentTrackingIdServ", map);
      map = DataHelper.filterToMap (in.DistribOrder, in.DistribOrderSort, in.DistribOrderSortAscending, in.DistribOrderFetch);
      if (map != null) record.put ("DistribOrder", map);
    return record;
  }
  /** convert Map to PrepaymentDistributionObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PrepaymentDistributionObjectKeyData the converted object
   */
  public static PrepaymentDistributionObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PrepaymentDistributionObjectKeyData out = new PrepaymentDistributionObjectKeyData ();

    if ((obj = record.get ("PrepaymentTrackingId")) != null)
    {
      out.PrepaymentTrackingId = (Integer) obj;
      out._PrepaymentTrackingIdSet = true;
    }
  
    if ((obj = record.get ("PrepaymentTrackingIdServ")) != null)
    {
      out.PrepaymentTrackingIdServ = (Integer) obj;
      out._PrepaymentTrackingIdServSet = true;
    }
  
    if ((obj = record.get ("DistribOrder")) != null)
    {
      out.DistribOrder = (Integer) obj;
      out._DistribOrderSet = true;
    }
  
    return out;
  }
  /** convert Map to PrepaymentDistributionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PrepaymentDistributionObjectKeyFilter the converted object
   */
  public static PrepaymentDistributionObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PrepaymentDistributionObjectKeyFilter out = new PrepaymentDistributionObjectKeyFilter ();

    Map PrepaymentTrackingIdMap = (Map)record.get("PrepaymentTrackingId");
    Boolean PrepaymentTrackingIdFetch = DataHelper.getFetch(PrepaymentTrackingIdMap);
    Boolean PrepaymentTrackingIdSortDir = DataHelper.getSortDirection(PrepaymentTrackingIdMap);
    Integer PrepaymentTrackingIdSortOrder = DataHelper.getSortOrder(PrepaymentTrackingIdMap);
    if (PrepaymentTrackingIdFetch != null) out.setPrepaymentTrackingIdFetch(PrepaymentTrackingIdFetch);
    if (PrepaymentTrackingIdSortDir != null) out.setPrepaymentTrackingIdSortDirection(PrepaymentTrackingIdSortDir);
    if (PrepaymentTrackingIdSortOrder != null) out.setPrepaymentTrackingIdSortOrder(PrepaymentTrackingIdSortOrder);

    Filter[] PrepaymentTrackingIdFilter = DataHelper.mapToFilterArray(PrepaymentTrackingIdMap, Integer.class);
    if (PrepaymentTrackingIdFilter != null) {
      IntegerFilter[] PrepaymentTrackingIdFilters = new IntegerFilter[PrepaymentTrackingIdFilter.length];
      for (int i = 0; i < PrepaymentTrackingIdFilters.length; i++) {
        PrepaymentTrackingIdFilters[i] = (IntegerFilter)PrepaymentTrackingIdFilter[i];
      }
      try {
        out.setPrepaymentTrackingIdFilter(PrepaymentTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepaymentTrackingIdServMap = (Map)record.get("PrepaymentTrackingIdServ");
    Boolean PrepaymentTrackingIdServFetch = DataHelper.getFetch(PrepaymentTrackingIdServMap);
    Boolean PrepaymentTrackingIdServSortDir = DataHelper.getSortDirection(PrepaymentTrackingIdServMap);
    Integer PrepaymentTrackingIdServSortOrder = DataHelper.getSortOrder(PrepaymentTrackingIdServMap);
    if (PrepaymentTrackingIdServFetch != null) out.setPrepaymentTrackingIdServFetch(PrepaymentTrackingIdServFetch);
    if (PrepaymentTrackingIdServSortDir != null) out.setPrepaymentTrackingIdServSortDirection(PrepaymentTrackingIdServSortDir);
    if (PrepaymentTrackingIdServSortOrder != null) out.setPrepaymentTrackingIdServSortOrder(PrepaymentTrackingIdServSortOrder);

    Filter[] PrepaymentTrackingIdServFilter = DataHelper.mapToFilterArray(PrepaymentTrackingIdServMap, Integer.class);
    if (PrepaymentTrackingIdServFilter != null) {
      IntegerFilter[] PrepaymentTrackingIdServFilters = new IntegerFilter[PrepaymentTrackingIdServFilter.length];
      for (int i = 0; i < PrepaymentTrackingIdServFilters.length; i++) {
        PrepaymentTrackingIdServFilters[i] = (IntegerFilter)PrepaymentTrackingIdServFilter[i];
      }
      try {
        out.setPrepaymentTrackingIdServFilter(PrepaymentTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DistribOrderMap = (Map)record.get("DistribOrder");
    Boolean DistribOrderFetch = DataHelper.getFetch(DistribOrderMap);
    Boolean DistribOrderSortDir = DataHelper.getSortDirection(DistribOrderMap);
    Integer DistribOrderSortOrder = DataHelper.getSortOrder(DistribOrderMap);
    if (DistribOrderFetch != null) out.setDistribOrderFetch(DistribOrderFetch);
    if (DistribOrderSortDir != null) out.setDistribOrderSortDirection(DistribOrderSortDir);
    if (DistribOrderSortOrder != null) out.setDistribOrderSortOrder(DistribOrderSortOrder);

    Filter[] DistribOrderFilter = DataHelper.mapToFilterArray(DistribOrderMap, Integer.class);
    if (DistribOrderFilter != null) {
      IntegerFilter[] DistribOrderFilters = new IntegerFilter[DistribOrderFilter.length];
      for (int i = 0; i < DistribOrderFilters.length; i++) {
        DistribOrderFilters[i] = (IntegerFilter)DistribOrderFilter[i];
      }
      try {
        out.setDistribOrderFilter(DistribOrderFilters);
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
