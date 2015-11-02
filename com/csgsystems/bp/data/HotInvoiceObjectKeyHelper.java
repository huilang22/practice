/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HotInvoiceObjectKeyHelper.java
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

/** Helper class for HotInvoiceObject's Key objects. */
public class HotInvoiceObjectKeyHelper implements ArubaObjectHelper
{
  /** convert HotInvoiceObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HotInvoiceObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HotInvoiceObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HotInvoiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (HotInvoiceObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HotInvoiceObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert HotInvoiceObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HotInvoiceObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HotInvoiceObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HotInvoiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (HotInvoiceObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HotInvoiceObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HotInvoiceObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return HotInvoiceObjectKeyData the converted object
   */
  public static HotInvoiceObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HotInvoiceObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HotInvoiceObject")
   * @return HotInvoiceObjectKeyData the converted object
   */
  public static HotInvoiceObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HotInvoiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HotInvoiceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return HotInvoiceObjectKeyFilter the converted object
   */
  public static HotInvoiceObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HotInvoiceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HotInvoiceObject")
   * @return HotInvoiceObjectKeyFilter the converted object
   */
  public static HotInvoiceObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HotInvoiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert HotInvoiceObjectKeyData to a Map (not including the root).
  /** convert HotInvoiceObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HotInvoiceObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._HotReqStatusQueueSet) record.put ("HotReqStatusQueue", in.HotReqStatusQueue);
  
    return record;
  }
  /** convert HotInvoiceObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (HotInvoiceObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.HotReqStatusQueue, in.HotReqStatusQueueSort, in.HotReqStatusQueueSortAscending, in.HotReqStatusQueueFetch, in.HotReqStatusQueueCaseInsensitive); 
      if (map != null) record.put ("HotReqStatusQueue", map);
    return record;
  }
  /** convert Map to HotInvoiceObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HotInvoiceObjectKeyData the converted object
   */
  public static HotInvoiceObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HotInvoiceObjectKeyData out = new HotInvoiceObjectKeyData ();

    if ((obj = record.get ("HotReqStatusQueue")) != null)
    {
      out.HotReqStatusQueue = (String) obj;
      out._HotReqStatusQueueSet = true;
    }
  
    return out;
  }
  /** convert Map to HotInvoiceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HotInvoiceObjectKeyFilter the converted object
   */
  public static HotInvoiceObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HotInvoiceObjectKeyFilter out = new HotInvoiceObjectKeyFilter ();

    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
