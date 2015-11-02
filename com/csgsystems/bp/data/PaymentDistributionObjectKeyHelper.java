/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentDistributionObjectKeyHelper.java
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

/** Helper class for PaymentDistributionObject's Key objects. */
public class PaymentDistributionObjectKeyHelper implements ArubaObjectHelper
{
  /** convert PaymentDistributionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentDistributionObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentDistributionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentDistributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentDistributionObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentDistributionObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentDistributionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentDistributionObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentDistributionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentDistributionObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentDistributionObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentDistributionObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentDistributionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentDistributionObjectKeyData the converted object
   */
  public static PaymentDistributionObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentDistributionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentDistributionObject")
   * @return PaymentDistributionObjectKeyData the converted object
   */
  public static PaymentDistributionObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentDistributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentDistributionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentDistributionObjectKeyFilter the converted object
   */
  public static PaymentDistributionObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentDistributionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentDistributionObject")
   * @return PaymentDistributionObjectKeyFilter the converted object
   */
  public static PaymentDistributionObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentDistributionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert PaymentDistributionObjectKeyData to a Map (not including the root).
  /** convert PaymentDistributionObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentDistributionObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BmfTrackingIdSet) record.put ("BmfTrackingId", in.BmfTrackingId);
  
    if (in._BmfTrackingIdServSet) record.put ("BmfTrackingIdServ", in.BmfTrackingIdServ);
  
    if (in._DistribOrderSet) record.put ("DistribOrder", in.DistribOrder);
  
    return record;
  }
  /** convert PaymentDistributionObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentDistributionObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BmfTrackingId, in.BmfTrackingIdSort, in.BmfTrackingIdSortAscending, in.BmfTrackingIdFetch);
      if (map != null) record.put ("BmfTrackingId", map);
      map = DataHelper.filterToMap (in.BmfTrackingIdServ, in.BmfTrackingIdServSort, in.BmfTrackingIdServSortAscending, in.BmfTrackingIdServFetch);
      if (map != null) record.put ("BmfTrackingIdServ", map);
      map = DataHelper.filterToMap (in.DistribOrder, in.DistribOrderSort, in.DistribOrderSortAscending, in.DistribOrderFetch);
      if (map != null) record.put ("DistribOrder", map);
    return record;
  }
  /** convert Map to PaymentDistributionObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentDistributionObjectKeyData the converted object
   */
  public static PaymentDistributionObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentDistributionObjectKeyData out = new PaymentDistributionObjectKeyData ();

    if ((obj = record.get ("BmfTrackingId")) != null)
    {
      out.BmfTrackingId = (Integer) obj;
      out._BmfTrackingIdSet = true;
    }
  
    if ((obj = record.get ("BmfTrackingIdServ")) != null)
    {
      out.BmfTrackingIdServ = (Integer) obj;
      out._BmfTrackingIdServSet = true;
    }
  
    if ((obj = record.get ("DistribOrder")) != null)
    {
      out.DistribOrder = (Integer) obj;
      out._DistribOrderSet = true;
    }
  
    return out;
  }
  /** convert Map to PaymentDistributionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentDistributionObjectKeyFilter the converted object
   */
  public static PaymentDistributionObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentDistributionObjectKeyFilter out = new PaymentDistributionObjectKeyFilter ();

    Map BmfTrackingIdMap = (Map)record.get("BmfTrackingId");
    Boolean BmfTrackingIdFetch = DataHelper.getFetch(BmfTrackingIdMap);
    Boolean BmfTrackingIdSortDir = DataHelper.getSortDirection(BmfTrackingIdMap);
    Integer BmfTrackingIdSortOrder = DataHelper.getSortOrder(BmfTrackingIdMap);
    if (BmfTrackingIdFetch != null) out.setBmfTrackingIdFetch(BmfTrackingIdFetch);
    if (BmfTrackingIdSortDir != null) out.setBmfTrackingIdSortDirection(BmfTrackingIdSortDir);
    if (BmfTrackingIdSortOrder != null) out.setBmfTrackingIdSortOrder(BmfTrackingIdSortOrder);

    Filter[] BmfTrackingIdFilter = DataHelper.mapToFilterArray(BmfTrackingIdMap, Integer.class);
    if (BmfTrackingIdFilter != null) {
      IntegerFilter[] BmfTrackingIdFilters = new IntegerFilter[BmfTrackingIdFilter.length];
      for (int i = 0; i < BmfTrackingIdFilters.length; i++) {
        BmfTrackingIdFilters[i] = (IntegerFilter)BmfTrackingIdFilter[i];
      }
      try {
        out.setBmfTrackingIdFilter(BmfTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BmfTrackingIdServMap = (Map)record.get("BmfTrackingIdServ");
    Boolean BmfTrackingIdServFetch = DataHelper.getFetch(BmfTrackingIdServMap);
    Boolean BmfTrackingIdServSortDir = DataHelper.getSortDirection(BmfTrackingIdServMap);
    Integer BmfTrackingIdServSortOrder = DataHelper.getSortOrder(BmfTrackingIdServMap);
    if (BmfTrackingIdServFetch != null) out.setBmfTrackingIdServFetch(BmfTrackingIdServFetch);
    if (BmfTrackingIdServSortDir != null) out.setBmfTrackingIdServSortDirection(BmfTrackingIdServSortDir);
    if (BmfTrackingIdServSortOrder != null) out.setBmfTrackingIdServSortOrder(BmfTrackingIdServSortOrder);

    Filter[] BmfTrackingIdServFilter = DataHelper.mapToFilterArray(BmfTrackingIdServMap, Integer.class);
    if (BmfTrackingIdServFilter != null) {
      IntegerFilter[] BmfTrackingIdServFilters = new IntegerFilter[BmfTrackingIdServFilter.length];
      for (int i = 0; i < BmfTrackingIdServFilters.length; i++) {
        BmfTrackingIdServFilters[i] = (IntegerFilter)BmfTrackingIdServFilter[i];
      }
      try {
        out.setBmfTrackingIdServFilter(BmfTrackingIdServFilters);
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
