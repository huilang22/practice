/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HotInvoiceObjectHelper.java
 * Definition File: Customer/InterimBill.xml
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
import com.csgsystems.api.bulk.*;


import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;



/** Helper class to convert HotInvoiceObject JavaBean objects to/from HashMaps.
 */
public class HotInvoiceObjectHelper implements ArubaObjectHelper
{
  /** convert HotInvoiceObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HotInvoiceObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HotInvoiceObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HotInvoiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (HotInvoiceObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HotInvoiceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HotInvoiceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HotInvoiceObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HotInvoiceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HotInvoiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (HotInvoiceObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HotInvoiceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HotInvoiceObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HotInvoiceObjectData the converted object
   */
  public static HotInvoiceObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HotInvoiceObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HotInvoiceObject")
   * @return HotInvoiceObjectData the converted object
   */
  public static HotInvoiceObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HotInvoiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HotInvoiceObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HotInvoiceObjectFilter the converted object
   */
  public static HotInvoiceObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HotInvoiceObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HotInvoiceObject")
   * @return HotInvoiceObjectFilter the converted object
   */
  public static HotInvoiceObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HotInvoiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HotInvoiceObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HotInvoiceObjectDataList the converted object
   */
  public static HotInvoiceObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HotInvoiceObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HotInvoiceObjectList")
   * @return HotInvoiceObjectDataList the converted object
   */
  public static HotInvoiceObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HotInvoiceObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HotInvoiceObjectData[] array = null;
    if (root != null)
    {
      array = new HotInvoiceObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HotInvoiceObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HotInvoiceObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HotInvoiceObjectDataList (array, index, total);
  }
  /** convert HotInvoiceObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HotInvoiceObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HotInvoiceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._HotReqIdSet) record.put ("HotReqId", in.HotReqId);
  
    if (in._HotReqReturnCustomSet) record.put ("HotReqReturnCustom", in.HotReqReturnCustom);
  
    if (in._HotReqReturnStatusSet) record.put ("HotReqReturnStatus", in.HotReqReturnStatus);
  
    if (in._HotReqBillRefNoSet) record.put ("HotReqBillRefNo", in.HotReqBillRefNo);
  
    if (in._HotReqBillRefResetsSet) record.put ("HotReqBillRefResets", in.HotReqBillRefResets);
      return record;
  }
  /** convert HotInvoiceObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HotInvoiceObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HotInvoiceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.HotReqId, in.HotReqIdSort, in.HotReqIdSortAscending, in.HotReqIdFetch); 
      if (map != null) record.put ("HotReqId", map);
      map = DataHelper.filterToMap (in.HotReqReturnCustom, in.HotReqReturnCustomSort, in.HotReqReturnCustomSortAscending, in.HotReqReturnCustomFetch); 
      if (map != null) record.put ("HotReqReturnCustom", map);
      map = DataHelper.filterToMap (in.HotReqReturnStatus, in.HotReqReturnStatusSort, in.HotReqReturnStatusSortAscending, in.HotReqReturnStatusFetch); 
      if (map != null) record.put ("HotReqReturnStatus", map);
      map = DataHelper.filterToMap (in.HotReqBillRefNo, in.HotReqBillRefNoSort, in.HotReqBillRefNoSortAscending, in.HotReqBillRefNoFetch); 
      if (map != null) record.put ("HotReqBillRefNo", map);
      map = DataHelper.filterToMap (in.HotReqBillRefResets, in.HotReqBillRefResetsSort, in.HotReqBillRefResetsSortAscending, in.HotReqBillRefResetsFetch); 
      if (map != null) record.put ("HotReqBillRefResets", map);
    return record;
  }
  /** convert Map to HotInvoiceObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HotInvoiceObjectData the converted object
   */
  public static HotInvoiceObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HotInvoiceObjectData out = new HotInvoiceObjectData ();

    out.Key = HotInvoiceObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("HotReqId")) != null)
    {
      out.HotReqId = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqReturnCustom")) != null)
    {
      out.HotReqReturnCustom = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqReturnStatus")) != null)
    {
      out.HotReqReturnStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqBillRefNo")) != null)
    {
      out.HotReqBillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("HotReqBillRefResets")) != null)
    {
      out.HotReqBillRefResets = (Integer) obj;
    }
      return out;
  }
  /** convert Map to HotInvoiceObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HotInvoiceObjectFilter the converted object
   */
  public static HotInvoiceObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HotInvoiceObjectFilter out = new HotInvoiceObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HotInvoiceObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    return out;
  }
}
