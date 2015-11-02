/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentTypeObjectKeyHelper.java
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

/** Helper class for PaymentTypeObject's Key objects. */
public class PaymentTypeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert PaymentTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTypeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTypeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentTypeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTypeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTypeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentTypeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentTypeObjectKeyData the converted object
   */
  public static PaymentTypeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentTypeObject")
   * @return PaymentTypeObjectKeyData the converted object
   */
  public static PaymentTypeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return PaymentTypeObjectKeyFilter the converted object
   */
  public static PaymentTypeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentTypeObject")
   * @return PaymentTypeObjectKeyFilter the converted object
   */
  public static PaymentTypeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert PaymentTypeObjectKeyData to a Map (not including the root).
  /** convert PaymentTypeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentTypeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BmfTransTypeSet) record.put ("BmfTransType", in.BmfTransType);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert PaymentTypeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PaymentTypeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BmfTransType, in.BmfTransTypeSort, in.BmfTransTypeSortAscending, in.BmfTransTypeFetch);
      if (map != null) record.put ("BmfTransType", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to PaymentTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentTypeObjectKeyData the converted object
   */
  public static PaymentTypeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentTypeObjectKeyData out = new PaymentTypeObjectKeyData ();

    if ((obj = record.get ("BmfTransType")) != null)
    {
      out.BmfTransType = (Integer) obj;
      out._BmfTransTypeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to PaymentTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentTypeObjectKeyFilter the converted object
   */
  public static PaymentTypeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentTypeObjectKeyFilter out = new PaymentTypeObjectKeyFilter ();

    Map BmfTransTypeMap = (Map)record.get("BmfTransType");
    Boolean BmfTransTypeFetch = DataHelper.getFetch(BmfTransTypeMap);
    Boolean BmfTransTypeSortDir = DataHelper.getSortDirection(BmfTransTypeMap);
    Integer BmfTransTypeSortOrder = DataHelper.getSortOrder(BmfTransTypeMap);
    if (BmfTransTypeFetch != null) out.setBmfTransTypeFetch(BmfTransTypeFetch);
    if (BmfTransTypeSortDir != null) out.setBmfTransTypeSortDirection(BmfTransTypeSortDir);
    if (BmfTransTypeSortOrder != null) out.setBmfTransTypeSortOrder(BmfTransTypeSortOrder);

    Filter[] BmfTransTypeFilter = DataHelper.mapToFilterArray(BmfTransTypeMap, Integer.class);
    if (BmfTransTypeFilter != null) {
      IntegerFilter[] BmfTransTypeFilters = new IntegerFilter[BmfTransTypeFilter.length];
      for (int i = 0; i < BmfTransTypeFilters.length; i++) {
        BmfTransTypeFilters[i] = (IntegerFilter)BmfTransTypeFilter[i];
      }
      try {
        out.setBmfTransTypeFilter(BmfTransTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, Integer.class);
    if (LanguageCodeFilter != null) {
      IntegerFilter[] LanguageCodeFilters = new IntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (IntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
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
