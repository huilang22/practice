/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceMasterGroupObjectKeyHelper.java
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

/** Helper class for ServiceMasterGroupObject's Key objects. */
public class ServiceMasterGroupObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ServiceMasterGroupObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceMasterGroupObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceMasterGroupObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceMasterGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceMasterGroupObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceMasterGroupObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ServiceMasterGroupObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceMasterGroupObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceMasterGroupObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceMasterGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceMasterGroupObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceMasterGroupObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServiceMasterGroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ServiceMasterGroupObjectKeyData the converted object
   */
  public static ServiceMasterGroupObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServiceMasterGroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServiceMasterGroupObject")
   * @return ServiceMasterGroupObjectKeyData the converted object
   */
  public static ServiceMasterGroupObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceMasterGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServiceMasterGroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ServiceMasterGroupObjectKeyFilter the converted object
   */
  public static ServiceMasterGroupObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServiceMasterGroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServiceMasterGroupObject")
   * @return ServiceMasterGroupObjectKeyFilter the converted object
   */
  public static ServiceMasterGroupObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceMasterGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ServiceMasterGroupObjectKeyData to a Map (not including the root).
  /** convert ServiceMasterGroupObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServiceMasterGroupObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._SubscrMasterGroupNoSet) record.put ("SubscrMasterGroupNo", in.SubscrMasterGroupNo);
  
    return record;
  }
  /** convert ServiceMasterGroupObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServiceMasterGroupObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.SubscrMasterGroupNo, in.SubscrMasterGroupNoSort, in.SubscrMasterGroupNoSortAscending, in.SubscrMasterGroupNoFetch);
      if (map != null) record.put ("SubscrMasterGroupNo", map);
    return record;
  }
  /** convert Map to ServiceMasterGroupObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceMasterGroupObjectKeyData the converted object
   */
  public static ServiceMasterGroupObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceMasterGroupObjectKeyData out = new ServiceMasterGroupObjectKeyData ();

    if ((obj = record.get ("SubscrMasterGroupNo")) != null)
    {
      out.SubscrMasterGroupNo = (Integer) obj;
      out._SubscrMasterGroupNoSet = true;
    }
  
    return out;
  }
  /** convert Map to ServiceMasterGroupObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceMasterGroupObjectKeyFilter the converted object
   */
  public static ServiceMasterGroupObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceMasterGroupObjectKeyFilter out = new ServiceMasterGroupObjectKeyFilter ();

    Map SubscrMasterGroupNoMap = (Map)record.get("SubscrMasterGroupNo");
    Boolean SubscrMasterGroupNoFetch = DataHelper.getFetch(SubscrMasterGroupNoMap);
    Boolean SubscrMasterGroupNoSortDir = DataHelper.getSortDirection(SubscrMasterGroupNoMap);
    Integer SubscrMasterGroupNoSortOrder = DataHelper.getSortOrder(SubscrMasterGroupNoMap);
    if (SubscrMasterGroupNoFetch != null) out.setSubscrMasterGroupNoFetch(SubscrMasterGroupNoFetch);
    if (SubscrMasterGroupNoSortDir != null) out.setSubscrMasterGroupNoSortDirection(SubscrMasterGroupNoSortDir);
    if (SubscrMasterGroupNoSortOrder != null) out.setSubscrMasterGroupNoSortOrder(SubscrMasterGroupNoSortOrder);

    Filter[] SubscrMasterGroupNoFilter = DataHelper.mapToFilterArray(SubscrMasterGroupNoMap, Integer.class);
    if (SubscrMasterGroupNoFilter != null) {
      IntegerFilter[] SubscrMasterGroupNoFilters = new IntegerFilter[SubscrMasterGroupNoFilter.length];
      for (int i = 0; i < SubscrMasterGroupNoFilters.length; i++) {
        SubscrMasterGroupNoFilters[i] = (IntegerFilter)SubscrMasterGroupNoFilter[i];
      }
      try {
        out.setSubscrMasterGroupNoFilter(SubscrMasterGroupNoFilters);
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
