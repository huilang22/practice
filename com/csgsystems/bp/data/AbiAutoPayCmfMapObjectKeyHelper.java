/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiAutoPayCmfMapObjectKeyHelper.java
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

/** Helper class for AbiAutoPayCmfMapObject's Key objects. */
public class AbiAutoPayCmfMapObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AbiAutoPayCmfMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiAutoPayCmfMapObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiAutoPayCmfMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiAutoPayCmfMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiAutoPayCmfMapObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiAutoPayCmfMapObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AbiAutoPayCmfMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiAutoPayCmfMapObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiAutoPayCmfMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiAutoPayCmfMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiAutoPayCmfMapObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiAutoPayCmfMapObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AbiAutoPayCmfMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AbiAutoPayCmfMapObjectKeyData the converted object
   */
  public static AbiAutoPayCmfMapObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AbiAutoPayCmfMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AbiAutoPayCmfMapObject")
   * @return AbiAutoPayCmfMapObjectKeyData the converted object
   */
  public static AbiAutoPayCmfMapObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiAutoPayCmfMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AbiAutoPayCmfMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AbiAutoPayCmfMapObjectKeyFilter the converted object
   */
  public static AbiAutoPayCmfMapObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AbiAutoPayCmfMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AbiAutoPayCmfMapObject")
   * @return AbiAutoPayCmfMapObjectKeyFilter the converted object
   */
  public static AbiAutoPayCmfMapObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiAutoPayCmfMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AbiAutoPayCmfMapObjectKeyData to a Map (not including the root).
  /** convert AbiAutoPayCmfMapObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AbiAutoPayCmfMapObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._PayOffMethodSet) record.put ("PayOffMethod", in.PayOffMethod);
  
    if (in._ChargeTypeCodeSet) record.put ("ChargeTypeCode", in.ChargeTypeCode);
  
    return record;
  }
  /** convert AbiAutoPayCmfMapObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AbiAutoPayCmfMapObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.PayOffMethod, in.PayOffMethodSort, in.PayOffMethodSortAscending, in.PayOffMethodFetch);
      if (map != null) record.put ("PayOffMethod", map);
      map = DataHelper.filterToMap (in.ChargeTypeCode, in.ChargeTypeCodeSort, in.ChargeTypeCodeSortAscending, in.ChargeTypeCodeFetch);
      if (map != null) record.put ("ChargeTypeCode", map);
    return record;
  }
  /** convert Map to AbiAutoPayCmfMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiAutoPayCmfMapObjectKeyData the converted object
   */
  public static AbiAutoPayCmfMapObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiAutoPayCmfMapObjectKeyData out = new AbiAutoPayCmfMapObjectKeyData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("PayOffMethod")) != null)
    {
      out.PayOffMethod = (Integer) obj;
      out._PayOffMethodSet = true;
    }
  
    if ((obj = record.get ("ChargeTypeCode")) != null)
    {
      out.ChargeTypeCode = (Integer) obj;
      out._ChargeTypeCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to AbiAutoPayCmfMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiAutoPayCmfMapObjectKeyFilter the converted object
   */
  public static AbiAutoPayCmfMapObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiAutoPayCmfMapObjectKeyFilter out = new AbiAutoPayCmfMapObjectKeyFilter ();

    Map AccountInternalIdMap = (Map)record.get("AccountInternalId");
    Boolean AccountInternalIdFetch = DataHelper.getFetch(AccountInternalIdMap);
    Boolean AccountInternalIdSortDir = DataHelper.getSortDirection(AccountInternalIdMap);
    Integer AccountInternalIdSortOrder = DataHelper.getSortOrder(AccountInternalIdMap);
    if (AccountInternalIdFetch != null) out.setAccountInternalIdFetch(AccountInternalIdFetch);
    if (AccountInternalIdSortDir != null) out.setAccountInternalIdSortDirection(AccountInternalIdSortDir);
    if (AccountInternalIdSortOrder != null) out.setAccountInternalIdSortOrder(AccountInternalIdSortOrder);

    Filter[] AccountInternalIdFilter = DataHelper.mapToFilterArray(AccountInternalIdMap, Integer.class);
    if (AccountInternalIdFilter != null) {
      IntegerFilter[] AccountInternalIdFilters = new IntegerFilter[AccountInternalIdFilter.length];
      for (int i = 0; i < AccountInternalIdFilters.length; i++) {
        AccountInternalIdFilters[i] = (IntegerFilter)AccountInternalIdFilter[i];
      }
      try {
        out.setAccountInternalIdFilter(AccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayOffMethodMap = (Map)record.get("PayOffMethod");
    Boolean PayOffMethodFetch = DataHelper.getFetch(PayOffMethodMap);
    Boolean PayOffMethodSortDir = DataHelper.getSortDirection(PayOffMethodMap);
    Integer PayOffMethodSortOrder = DataHelper.getSortOrder(PayOffMethodMap);
    if (PayOffMethodFetch != null) out.setPayOffMethodFetch(PayOffMethodFetch);
    if (PayOffMethodSortDir != null) out.setPayOffMethodSortDirection(PayOffMethodSortDir);
    if (PayOffMethodSortOrder != null) out.setPayOffMethodSortOrder(PayOffMethodSortOrder);

    Filter[] PayOffMethodFilter = DataHelper.mapToFilterArray(PayOffMethodMap, Integer.class);
    if (PayOffMethodFilter != null) {
      IntegerFilter[] PayOffMethodFilters = new IntegerFilter[PayOffMethodFilter.length];
      for (int i = 0; i < PayOffMethodFilters.length; i++) {
        PayOffMethodFilters[i] = (IntegerFilter)PayOffMethodFilter[i];
      }
      try {
        out.setPayOffMethodFilter(PayOffMethodFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChargeTypeCodeMap = (Map)record.get("ChargeTypeCode");
    Boolean ChargeTypeCodeFetch = DataHelper.getFetch(ChargeTypeCodeMap);
    Boolean ChargeTypeCodeSortDir = DataHelper.getSortDirection(ChargeTypeCodeMap);
    Integer ChargeTypeCodeSortOrder = DataHelper.getSortOrder(ChargeTypeCodeMap);
    if (ChargeTypeCodeFetch != null) out.setChargeTypeCodeFetch(ChargeTypeCodeFetch);
    if (ChargeTypeCodeSortDir != null) out.setChargeTypeCodeSortDirection(ChargeTypeCodeSortDir);
    if (ChargeTypeCodeSortOrder != null) out.setChargeTypeCodeSortOrder(ChargeTypeCodeSortOrder);

    Filter[] ChargeTypeCodeFilter = DataHelper.mapToFilterArray(ChargeTypeCodeMap, Integer.class);
    if (ChargeTypeCodeFilter != null) {
      IntegerFilter[] ChargeTypeCodeFilters = new IntegerFilter[ChargeTypeCodeFilter.length];
      for (int i = 0; i < ChargeTypeCodeFilters.length; i++) {
        ChargeTypeCodeFilters[i] = (IntegerFilter)ChargeTypeCodeFilter[i];
      }
      try {
        out.setChargeTypeCodeFilter(ChargeTypeCodeFilters);
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
