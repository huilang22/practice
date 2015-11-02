/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentMerchantIdAssignObjectKeyHelper.java
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

/** Helper class for PaymentMerchantIdAssignObject's Key objects. */
public class PaymentMerchantIdAssignObjectKeyHelper implements ArubaObjectHelper
{
  /** convert PaymentMerchantIdAssignObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdAssignObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentMerchantIdAssignObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentMerchantIdAssignObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdAssignObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentMerchantIdAssignObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentMerchantIdAssignObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdAssignObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentMerchantIdAssignObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentMerchantIdAssignObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdAssignObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentMerchantIdAssignObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentMerchantIdAssignObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentMerchantIdAssignObjectKeyData the converted object
   */
  public static PaymentMerchantIdAssignObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentMerchantIdAssignObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentMerchantIdAssignObject")
   * @return PaymentMerchantIdAssignObjectKeyData the converted object
   */
  public static PaymentMerchantIdAssignObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentMerchantIdAssignObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentMerchantIdAssignObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentMerchantIdAssignObjectKeyFilter the converted object
   */
  public static PaymentMerchantIdAssignObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentMerchantIdAssignObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentMerchantIdAssignObject")
   * @return PaymentMerchantIdAssignObjectKeyFilter the converted object
   */
  public static PaymentMerchantIdAssignObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentMerchantIdAssignObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert PaymentMerchantIdAssignObjectKeyData to a Map (not including the root).
  /** convert PaymentMerchantIdAssignObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentMerchantIdAssignObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._PaymentMerchantIdSet) record.put ("PaymentMerchantId", in.PaymentMerchantId);
  
    if (in._CardTypeCodeSet) record.put ("CardTypeCode", in.CardTypeCode);
  
    if (in._PayMethodSet) record.put ("PayMethod", in.PayMethod);
  
    return record;
  }
  /** convert PaymentMerchantIdAssignObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentMerchantIdAssignObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.PaymentMerchantId, in.PaymentMerchantIdSort, in.PaymentMerchantIdSortAscending, in.PaymentMerchantIdFetch);
      if (map != null) record.put ("PaymentMerchantId", map);
      map = DataHelper.filterToMap (in.CardTypeCode, in.CardTypeCodeSort, in.CardTypeCodeSortAscending, in.CardTypeCodeFetch);
      if (map != null) record.put ("CardTypeCode", map);
      map = DataHelper.filterToMap (in.PayMethod, in.PayMethodSort, in.PayMethodSortAscending, in.PayMethodFetch);
      if (map != null) record.put ("PayMethod", map);
    return record;
  }
  /** convert Map to PaymentMerchantIdAssignObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentMerchantIdAssignObjectKeyData the converted object
   */
  public static PaymentMerchantIdAssignObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentMerchantIdAssignObjectKeyData out = new PaymentMerchantIdAssignObjectKeyData ();

    if ((obj = record.get ("PaymentMerchantId")) != null)
    {
      out.PaymentMerchantId = (Integer) obj;
      out._PaymentMerchantIdSet = true;
    }
  
    if ((obj = record.get ("CardTypeCode")) != null)
    {
      out.CardTypeCode = (Integer) obj;
      out._CardTypeCodeSet = true;
    }
  
    if ((obj = record.get ("PayMethod")) != null)
    {
      out.PayMethod = (Integer) obj;
      out._PayMethodSet = true;
    }
  
    return out;
  }
  /** convert Map to PaymentMerchantIdAssignObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentMerchantIdAssignObjectKeyFilter the converted object
   */
  public static PaymentMerchantIdAssignObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentMerchantIdAssignObjectKeyFilter out = new PaymentMerchantIdAssignObjectKeyFilter ();

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
  
    Map CardTypeCodeMap = (Map)record.get("CardTypeCode");
    Boolean CardTypeCodeFetch = DataHelper.getFetch(CardTypeCodeMap);
    Boolean CardTypeCodeSortDir = DataHelper.getSortDirection(CardTypeCodeMap);
    Integer CardTypeCodeSortOrder = DataHelper.getSortOrder(CardTypeCodeMap);
    if (CardTypeCodeFetch != null) out.setCardTypeCodeFetch(CardTypeCodeFetch);
    if (CardTypeCodeSortDir != null) out.setCardTypeCodeSortDirection(CardTypeCodeSortDir);
    if (CardTypeCodeSortOrder != null) out.setCardTypeCodeSortOrder(CardTypeCodeSortOrder);

    Filter[] CardTypeCodeFilter = DataHelper.mapToFilterArray(CardTypeCodeMap, Integer.class);
    if (CardTypeCodeFilter != null) {
      IntegerFilter[] CardTypeCodeFilters = new IntegerFilter[CardTypeCodeFilter.length];
      for (int i = 0; i < CardTypeCodeFilters.length; i++) {
        CardTypeCodeFilters[i] = (IntegerFilter)CardTypeCodeFilter[i];
      }
      try {
        out.setCardTypeCodeFilter(CardTypeCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayMethodMap = (Map)record.get("PayMethod");
    Boolean PayMethodFetch = DataHelper.getFetch(PayMethodMap);
    Boolean PayMethodSortDir = DataHelper.getSortDirection(PayMethodMap);
    Integer PayMethodSortOrder = DataHelper.getSortOrder(PayMethodMap);
    if (PayMethodFetch != null) out.setPayMethodFetch(PayMethodFetch);
    if (PayMethodSortDir != null) out.setPayMethodSortDirection(PayMethodSortDir);
    if (PayMethodSortOrder != null) out.setPayMethodSortOrder(PayMethodSortOrder);

    Filter[] PayMethodFilter = DataHelper.mapToFilterArray(PayMethodMap, Integer.class);
    if (PayMethodFilter != null) {
      IntegerFilter[] PayMethodFilters = new IntegerFilter[PayMethodFilter.length];
      for (int i = 0; i < PayMethodFilters.length; i++) {
        PayMethodFilters[i] = (IntegerFilter)PayMethodFilter[i];
      }
      try {
        out.setPayMethodFilter(PayMethodFilters);
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
