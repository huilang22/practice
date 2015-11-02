/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BonusPointTransTypeObjectKeyHelper.java
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

/** Helper class for BonusPointTransTypeObject's Key objects. */
public class BonusPointTransTypeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BonusPointTransTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointTransTypeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BonusPointTransTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BonusPointTransTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointTransTypeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BonusPointTransTypeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BonusPointTransTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointTransTypeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BonusPointTransTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BonusPointTransTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointTransTypeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BonusPointTransTypeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BonusPointTransTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BonusPointTransTypeObjectKeyData the converted object
   */
  public static BonusPointTransTypeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BonusPointTransTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BonusPointTransTypeObject")
   * @return BonusPointTransTypeObjectKeyData the converted object
   */
  public static BonusPointTransTypeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointTransTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BonusPointTransTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BonusPointTransTypeObjectKeyFilter the converted object
   */
  public static BonusPointTransTypeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BonusPointTransTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BonusPointTransTypeObject")
   * @return BonusPointTransTypeObjectKeyFilter the converted object
   */
  public static BonusPointTransTypeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointTransTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BonusPointTransTypeObjectKeyData to a Map (not including the root).
  /** convert BonusPointTransTypeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BonusPointTransTypeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BonusPointTransTypeSet) record.put ("BonusPointTransType", in.BonusPointTransType);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert BonusPointTransTypeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BonusPointTransTypeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BonusPointTransType, in.BonusPointTransTypeSort, in.BonusPointTransTypeSortAscending, in.BonusPointTransTypeFetch);
      if (map != null) record.put ("BonusPointTransType", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to BonusPointTransTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BonusPointTransTypeObjectKeyData the converted object
   */
  public static BonusPointTransTypeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BonusPointTransTypeObjectKeyData out = new BonusPointTransTypeObjectKeyData ();

    if ((obj = record.get ("BonusPointTransType")) != null)
    {
      out.BonusPointTransType = (Integer) obj;
      out._BonusPointTransTypeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to BonusPointTransTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BonusPointTransTypeObjectKeyFilter the converted object
   */
  public static BonusPointTransTypeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BonusPointTransTypeObjectKeyFilter out = new BonusPointTransTypeObjectKeyFilter ();

    Map BonusPointTransTypeMap = (Map)record.get("BonusPointTransType");
    Boolean BonusPointTransTypeFetch = DataHelper.getFetch(BonusPointTransTypeMap);
    Boolean BonusPointTransTypeSortDir = DataHelper.getSortDirection(BonusPointTransTypeMap);
    Integer BonusPointTransTypeSortOrder = DataHelper.getSortOrder(BonusPointTransTypeMap);
    if (BonusPointTransTypeFetch != null) out.setBonusPointTransTypeFetch(BonusPointTransTypeFetch);
    if (BonusPointTransTypeSortDir != null) out.setBonusPointTransTypeSortDirection(BonusPointTransTypeSortDir);
    if (BonusPointTransTypeSortOrder != null) out.setBonusPointTransTypeSortOrder(BonusPointTransTypeSortOrder);

    Filter[] BonusPointTransTypeFilter = DataHelper.mapToFilterArray(BonusPointTransTypeMap, Integer.class);
    if (BonusPointTransTypeFilter != null) {
      IntegerFilter[] BonusPointTransTypeFilters = new IntegerFilter[BonusPointTransTypeFilter.length];
      for (int i = 0; i < BonusPointTransTypeFilters.length; i++) {
        BonusPointTransTypeFilters[i] = (IntegerFilter)BonusPointTransTypeFilter[i];
      }
      try {
        out.setBonusPointTransTypeFilter(BonusPointTransTypeFilters);
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
