/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TTCObjectKeyHelper.java
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

/** Helper class for TTCObject's Key objects. */
public class TTCObjectKeyHelper implements ArubaObjectHelper
{
  /** convert TTCObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TTCObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TTCObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TTCObject")
   * @return Map     the output Map
   */
  public static Map toMap (TTCObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TTCObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert TTCObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TTCObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TTCObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TTCObject")
   * @return Map     the output Map
   */
  public static Map toMap (TTCObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TTCObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TTCObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return TTCObjectKeyData the converted object
   */
  public static TTCObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TTCObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TTCObject")
   * @return TTCObjectKeyData the converted object
   */
  public static TTCObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TTCObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TTCObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return TTCObjectKeyFilter the converted object
   */
  public static TTCObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TTCObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TTCObject")
   * @return TTCObjectKeyFilter the converted object
   */
  public static TTCObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TTCObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert TTCObjectKeyData to a Map (not including the root).
  /** convert TTCObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TTCObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TaxTypeSet) record.put ("TaxType", in.TaxType);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert TTCObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (TTCObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TaxType, in.TaxTypeSort, in.TaxTypeSortAscending, in.TaxTypeFetch);
      if (map != null) record.put ("TaxType", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to TTCObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TTCObjectKeyData the converted object
   */
  public static TTCObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TTCObjectKeyData out = new TTCObjectKeyData ();

    if ((obj = record.get ("TaxType")) != null)
    {
      out.TaxType = (Integer) obj;
      out._TaxTypeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to TTCObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TTCObjectKeyFilter the converted object
   */
  public static TTCObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TTCObjectKeyFilter out = new TTCObjectKeyFilter ();

    Map TaxTypeMap = (Map)record.get("TaxType");
    Boolean TaxTypeFetch = DataHelper.getFetch(TaxTypeMap);
    Boolean TaxTypeSortDir = DataHelper.getSortDirection(TaxTypeMap);
    Integer TaxTypeSortOrder = DataHelper.getSortOrder(TaxTypeMap);
    if (TaxTypeFetch != null) out.setTaxTypeFetch(TaxTypeFetch);
    if (TaxTypeSortDir != null) out.setTaxTypeSortDirection(TaxTypeSortDir);
    if (TaxTypeSortOrder != null) out.setTaxTypeSortOrder(TaxTypeSortOrder);

    Filter[] TaxTypeFilter = DataHelper.mapToFilterArray(TaxTypeMap, Integer.class);
    if (TaxTypeFilter != null) {
      IntegerFilter[] TaxTypeFilters = new IntegerFilter[TaxTypeFilter.length];
      for (int i = 0; i < TaxTypeFilters.length; i++) {
        TaxTypeFilters[i] = (IntegerFilter)TaxTypeFilter[i];
      }
      try {
        out.setTaxTypeFilter(TaxTypeFilters);
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
