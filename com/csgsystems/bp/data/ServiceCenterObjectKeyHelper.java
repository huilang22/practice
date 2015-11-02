/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceCenterObjectKeyHelper.java
 * Definition File: Admin/.xml
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

/** Helper class for ServiceCenterObject's Key objects. */
public class ServiceCenterObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ServiceCenterObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceCenterObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceCenterObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceCenterObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ServiceCenterObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceCenterObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceCenterObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceCenterObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServiceCenterObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ServiceCenterObjectKeyData the converted object
   */
  public static ServiceCenterObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServiceCenterObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServiceCenterObject")
   * @return ServiceCenterObjectKeyData the converted object
   */
  public static ServiceCenterObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceCenterObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServiceCenterObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ServiceCenterObjectKeyFilter the converted object
   */
  public static ServiceCenterObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServiceCenterObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServiceCenterObject")
   * @return ServiceCenterObjectKeyFilter the converted object
   */
  public static ServiceCenterObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceCenterObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ServiceCenterObjectKeyData to a Map (not including the root).
  /** convert ServiceCenterObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServiceCenterObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ServiceCenterIdSet) record.put ("ServiceCenterId", in.ServiceCenterId);
  
    return record;
  }
  /** convert ServiceCenterObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServiceCenterObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ServiceCenterId, in.ServiceCenterIdSort, in.ServiceCenterIdSortAscending, in.ServiceCenterIdFetch);
      if (map != null) record.put ("ServiceCenterId", map);
    return record;
  }
  /** convert Map to ServiceCenterObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceCenterObjectKeyData the converted object
   */
  public static ServiceCenterObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceCenterObjectKeyData out = new ServiceCenterObjectKeyData ();

    if ((obj = record.get ("ServiceCenterId")) != null)
    {
      out.ServiceCenterId = (Integer) obj;
      out._ServiceCenterIdSet = true;
    }
  
    return out;
  }
  /** convert Map to ServiceCenterObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceCenterObjectKeyFilter the converted object
   */
  public static ServiceCenterObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceCenterObjectKeyFilter out = new ServiceCenterObjectKeyFilter ();

    Map ServiceCenterIdMap = (Map)record.get("ServiceCenterId");
    Boolean ServiceCenterIdFetch = DataHelper.getFetch(ServiceCenterIdMap);
    Boolean ServiceCenterIdSortDir = DataHelper.getSortDirection(ServiceCenterIdMap);
    Integer ServiceCenterIdSortOrder = DataHelper.getSortOrder(ServiceCenterIdMap);
    if (ServiceCenterIdFetch != null) out.setServiceCenterIdFetch(ServiceCenterIdFetch);
    if (ServiceCenterIdSortDir != null) out.setServiceCenterIdSortDirection(ServiceCenterIdSortDir);
    if (ServiceCenterIdSortOrder != null) out.setServiceCenterIdSortOrder(ServiceCenterIdSortOrder);

    Filter[] ServiceCenterIdFilter = DataHelper.mapToFilterArray(ServiceCenterIdMap, Integer.class);
    if (ServiceCenterIdFilter != null) {
      IntegerFilter[] ServiceCenterIdFilters = new IntegerFilter[ServiceCenterIdFilter.length];
      for (int i = 0; i < ServiceCenterIdFilters.length; i++) {
        ServiceCenterIdFilters[i] = (IntegerFilter)ServiceCenterIdFilter[i];
      }
      try {
        out.setServiceCenterIdFilter(ServiceCenterIdFilters);
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
