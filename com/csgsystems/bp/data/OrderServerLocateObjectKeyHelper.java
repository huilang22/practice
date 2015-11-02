/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: OrderServerLocateObjectKeyHelper.java
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

/** Helper class for OrderServerLocateObject's Key objects. */
public class OrderServerLocateObjectKeyHelper implements ArubaObjectHelper
{
  /** convert OrderServerLocateObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (OrderServerLocateObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert OrderServerLocateObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "OrderServerLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (OrderServerLocateObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "OrderServerLocateObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert OrderServerLocateObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (OrderServerLocateObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert OrderServerLocateObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "OrderServerLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (OrderServerLocateObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "OrderServerLocateObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to OrderServerLocateObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return OrderServerLocateObjectKeyData the converted object
   */
  public static OrderServerLocateObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to OrderServerLocateObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "OrderServerLocateObject")
   * @return OrderServerLocateObjectKeyData the converted object
   */
  public static OrderServerLocateObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "OrderServerLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to OrderServerLocateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return OrderServerLocateObjectKeyFilter the converted object
   */
  public static OrderServerLocateObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to OrderServerLocateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "OrderServerLocateObject")
   * @return OrderServerLocateObjectKeyFilter the converted object
   */
  public static OrderServerLocateObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "OrderServerLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert OrderServerLocateObjectKeyData to a Map (not including the root).
  /** convert OrderServerLocateObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (OrderServerLocateObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._OrderIdSet) record.put ("OrderId", in.OrderId);
  
    return record;
  }
  /** convert OrderServerLocateObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (OrderServerLocateObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.OrderId, in.OrderIdSort, in.OrderIdSortAscending, in.OrderIdFetch);
      if (map != null) record.put ("OrderId", map);
    return record;
  }
  /** convert Map to OrderServerLocateObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return OrderServerLocateObjectKeyData the converted object
   */
  public static OrderServerLocateObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    OrderServerLocateObjectKeyData out = new OrderServerLocateObjectKeyData ();

    if ((obj = record.get ("OrderId")) != null)
    {
      out.OrderId = (BigInteger) obj;
      out._OrderIdSet = true;
    }
  
    return out;
  }
  /** convert Map to OrderServerLocateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return OrderServerLocateObjectKeyFilter the converted object
   */
  public static OrderServerLocateObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    OrderServerLocateObjectKeyFilter out = new OrderServerLocateObjectKeyFilter ();

    Map OrderIdMap = (Map)record.get("OrderId");
    Boolean OrderIdFetch = DataHelper.getFetch(OrderIdMap);
    Boolean OrderIdSortDir = DataHelper.getSortDirection(OrderIdMap);
    Integer OrderIdSortOrder = DataHelper.getSortOrder(OrderIdMap);
    if (OrderIdFetch != null) out.setOrderIdFetch(OrderIdFetch);
    if (OrderIdSortDir != null) out.setOrderIdSortDirection(OrderIdSortDir);
    if (OrderIdSortOrder != null) out.setOrderIdSortOrder(OrderIdSortOrder);

    Filter[] OrderIdFilter = DataHelper.mapToFilterArray(OrderIdMap, BigInteger.class);
    if (OrderIdFilter != null) {
      BigIntegerFilter[] OrderIdFilters = new BigIntegerFilter[OrderIdFilter.length];
      for (int i = 0; i < OrderIdFilters.length; i++) {
        OrderIdFilters[i] = (BigIntegerFilter)OrderIdFilter[i];
      }
      try {
        out.setOrderIdFilter(OrderIdFilters);
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
