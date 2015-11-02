/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtPaymentMerchantObjectKeyHelper.java
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

/** Helper class for AxrtPaymentMerchantObject's Key objects. */
public class AxrtPaymentMerchantObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AxrtPaymentMerchantObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtPaymentMerchantObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtPaymentMerchantObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtPaymentMerchantObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtPaymentMerchantObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtPaymentMerchantObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AxrtPaymentMerchantObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtPaymentMerchantObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtPaymentMerchantObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtPaymentMerchantObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtPaymentMerchantObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtPaymentMerchantObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AxrtPaymentMerchantObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AxrtPaymentMerchantObjectKeyData the converted object
   */
  public static AxrtPaymentMerchantObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AxrtPaymentMerchantObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AxrtPaymentMerchantObject")
   * @return AxrtPaymentMerchantObjectKeyData the converted object
   */
  public static AxrtPaymentMerchantObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtPaymentMerchantObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AxrtPaymentMerchantObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AxrtPaymentMerchantObjectKeyFilter the converted object
   */
  public static AxrtPaymentMerchantObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AxrtPaymentMerchantObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AxrtPaymentMerchantObject")
   * @return AxrtPaymentMerchantObjectKeyFilter the converted object
   */
  public static AxrtPaymentMerchantObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtPaymentMerchantObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AxrtPaymentMerchantObjectKeyData to a Map (not including the root).
  /** convert AxrtPaymentMerchantObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AxrtPaymentMerchantObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._PaymentMerchantIdSet) record.put ("PaymentMerchantId", in.PaymentMerchantId);
  
    return record;
  }
  /** convert AxrtPaymentMerchantObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AxrtPaymentMerchantObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.PaymentMerchantId, in.PaymentMerchantIdSort, in.PaymentMerchantIdSortAscending, in.PaymentMerchantIdFetch);
      if (map != null) record.put ("PaymentMerchantId", map);
    return record;
  }
  /** convert Map to AxrtPaymentMerchantObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtPaymentMerchantObjectKeyData the converted object
   */
  public static AxrtPaymentMerchantObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtPaymentMerchantObjectKeyData out = new AxrtPaymentMerchantObjectKeyData ();

    if ((obj = record.get ("PaymentMerchantId")) != null)
    {
      out.PaymentMerchantId = (Integer) obj;
      out._PaymentMerchantIdSet = true;
    }
  
    return out;
  }
  /** convert Map to AxrtPaymentMerchantObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtPaymentMerchantObjectKeyFilter the converted object
   */
  public static AxrtPaymentMerchantObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtPaymentMerchantObjectKeyFilter out = new AxrtPaymentMerchantObjectKeyFilter ();

    Map PaymentMerchantIdMap = (Map)record.get("PaymentMerchantId");
    Boolean PaymentMerchantIdFetch = DataHelper.getFetch(PaymentMerchantIdMap);
    Boolean PaymentMerchantIdSortDir = DataHelper.getSortDirection(PaymentMerchantIdMap);
    Integer PaymentMerchantIdSortOrder = DataHelper.getSortOrder(PaymentMerchantIdMap);
    if (PaymentMerchantIdFetch != null) out.setPaymentMerchantIdFetch(PaymentMerchantIdFetch);
    if (PaymentMerchantIdSortDir != null) out.setPaymentMerchantIdSortDirection(PaymentMerchantIdSortDir);
    if (PaymentMerchantIdSortOrder != null) out.setPaymentMerchantIdSortOrder(PaymentMerchantIdSortOrder);

    Filter[] PaymentMerchantIdFilter = DataHelper.mapToFilterArray(PaymentMerchantIdMap, Integer.class);
    if (PaymentMerchantIdFilter != null) {
      IntegerFilter[] PaymentMerchantIdFilters = new IntegerFilter[PaymentMerchantIdFilter.length];
      for (int i = 0; i < PaymentMerchantIdFilters.length; i++) {
        PaymentMerchantIdFilters[i] = (IntegerFilter)PaymentMerchantIdFilter[i];
      }
      try {
        out.setPaymentMerchantIdFilter(PaymentMerchantIdFilters);
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
