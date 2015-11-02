/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CreditCardTypeCodeObjectKeyHelper.java
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

/** Helper class for CreditCardTypeCodeObject's Key objects. */
public class CreditCardTypeCodeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CreditCardTypeCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardTypeCodeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CreditCardTypeCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CreditCardTypeCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardTypeCodeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CreditCardTypeCodeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CreditCardTypeCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardTypeCodeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CreditCardTypeCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CreditCardTypeCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardTypeCodeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CreditCardTypeCodeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CreditCardTypeCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CreditCardTypeCodeObjectKeyData the converted object
   */
  public static CreditCardTypeCodeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CreditCardTypeCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CreditCardTypeCodeObject")
   * @return CreditCardTypeCodeObjectKeyData the converted object
   */
  public static CreditCardTypeCodeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardTypeCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CreditCardTypeCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CreditCardTypeCodeObjectKeyFilter the converted object
   */
  public static CreditCardTypeCodeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CreditCardTypeCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CreditCardTypeCodeObject")
   * @return CreditCardTypeCodeObjectKeyFilter the converted object
   */
  public static CreditCardTypeCodeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardTypeCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CreditCardTypeCodeObjectKeyData to a Map (not including the root).
  /** convert CreditCardTypeCodeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CreditCardTypeCodeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    if (in._CcardTypeCodeSet) record.put ("CcardTypeCode", in.CcardTypeCode);
  
    return record;
  }
  /** convert CreditCardTypeCodeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CreditCardTypeCodeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
      map = DataHelper.filterToMap (in.CcardTypeCode, in.CcardTypeCodeSort, in.CcardTypeCodeSortAscending, in.CcardTypeCodeFetch);
      if (map != null) record.put ("CcardTypeCode", map);
    return record;
  }
  /** convert Map to CreditCardTypeCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CreditCardTypeCodeObjectKeyData the converted object
   */
  public static CreditCardTypeCodeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CreditCardTypeCodeObjectKeyData out = new CreditCardTypeCodeObjectKeyData ();

    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    if ((obj = record.get ("CcardTypeCode")) != null)
    {
      out.CcardTypeCode = (Integer) obj;
      out._CcardTypeCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to CreditCardTypeCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CreditCardTypeCodeObjectKeyFilter the converted object
   */
  public static CreditCardTypeCodeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CreditCardTypeCodeObjectKeyFilter out = new CreditCardTypeCodeObjectKeyFilter ();

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
  
    Map CcardTypeCodeMap = (Map)record.get("CcardTypeCode");
    Boolean CcardTypeCodeFetch = DataHelper.getFetch(CcardTypeCodeMap);
    Boolean CcardTypeCodeSortDir = DataHelper.getSortDirection(CcardTypeCodeMap);
    Integer CcardTypeCodeSortOrder = DataHelper.getSortOrder(CcardTypeCodeMap);
    if (CcardTypeCodeFetch != null) out.setCcardTypeCodeFetch(CcardTypeCodeFetch);
    if (CcardTypeCodeSortDir != null) out.setCcardTypeCodeSortDirection(CcardTypeCodeSortDir);
    if (CcardTypeCodeSortOrder != null) out.setCcardTypeCodeSortOrder(CcardTypeCodeSortOrder);

    Filter[] CcardTypeCodeFilter = DataHelper.mapToFilterArray(CcardTypeCodeMap, Integer.class);
    if (CcardTypeCodeFilter != null) {
      IntegerFilter[] CcardTypeCodeFilters = new IntegerFilter[CcardTypeCodeFilter.length];
      for (int i = 0; i < CcardTypeCodeFilters.length; i++) {
        CcardTypeCodeFilters[i] = (IntegerFilter)CcardTypeCodeFilter[i];
      }
      try {
        out.setCcardTypeCodeFilter(CcardTypeCodeFilters);
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
