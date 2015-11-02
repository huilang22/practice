/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExchangeRateClassObjectKeyHelper.java
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

/** Helper class for ExchangeRateClassObject's Key objects. */
public class ExchangeRateClassObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ExchangeRateClassObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ExchangeRateClassObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ExchangeRateClassObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ExchangeRateClassObject")
   * @return Map     the output Map
   */
  public static Map toMap (ExchangeRateClassObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ExchangeRateClassObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ExchangeRateClassObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ExchangeRateClassObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ExchangeRateClassObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ExchangeRateClassObject")
   * @return Map     the output Map
   */
  public static Map toMap (ExchangeRateClassObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ExchangeRateClassObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ExchangeRateClassObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ExchangeRateClassObjectKeyData the converted object
   */
  public static ExchangeRateClassObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ExchangeRateClassObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ExchangeRateClassObject")
   * @return ExchangeRateClassObjectKeyData the converted object
   */
  public static ExchangeRateClassObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ExchangeRateClassObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ExchangeRateClassObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ExchangeRateClassObjectKeyFilter the converted object
   */
  public static ExchangeRateClassObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ExchangeRateClassObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ExchangeRateClassObject")
   * @return ExchangeRateClassObjectKeyFilter the converted object
   */
  public static ExchangeRateClassObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ExchangeRateClassObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ExchangeRateClassObjectKeyData to a Map (not including the root).
  /** convert ExchangeRateClassObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ExchangeRateClassObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._EClassSet) record.put ("EClass", in.EClass);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert ExchangeRateClassObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ExchangeRateClassObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.EClass, in.EClassSort, in.EClassSortAscending, in.EClassFetch);
      if (map != null) record.put ("EClass", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to ExchangeRateClassObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ExchangeRateClassObjectKeyData the converted object
   */
  public static ExchangeRateClassObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ExchangeRateClassObjectKeyData out = new ExchangeRateClassObjectKeyData ();

    if ((obj = record.get ("EClass")) != null)
    {
      out.EClass = (Integer) obj;
      out._EClassSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to ExchangeRateClassObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ExchangeRateClassObjectKeyFilter the converted object
   */
  public static ExchangeRateClassObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ExchangeRateClassObjectKeyFilter out = new ExchangeRateClassObjectKeyFilter ();

    Map EClassMap = (Map)record.get("EClass");
    Boolean EClassFetch = DataHelper.getFetch(EClassMap);
    Boolean EClassSortDir = DataHelper.getSortDirection(EClassMap);
    Integer EClassSortOrder = DataHelper.getSortOrder(EClassMap);
    if (EClassFetch != null) out.setEClassFetch(EClassFetch);
    if (EClassSortDir != null) out.setEClassSortDirection(EClassSortDir);
    if (EClassSortOrder != null) out.setEClassSortOrder(EClassSortOrder);

    Filter[] EClassFilter = DataHelper.mapToFilterArray(EClassMap, Integer.class);
    if (EClassFilter != null) {
      IntegerFilter[] EClassFilters = new IntegerFilter[EClassFilter.length];
      for (int i = 0; i < EClassFilters.length; i++) {
        EClassFilters[i] = (IntegerFilter)EClassFilter[i];
      }
      try {
        out.setEClassFilter(EClassFilters);
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
