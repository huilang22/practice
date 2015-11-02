/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LbxPaymentTypeObjectKeyHelper.java
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

/** Helper class for LbxPaymentTypeObject's Key objects. */
public class LbxPaymentTypeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert LbxPaymentTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (LbxPaymentTypeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert LbxPaymentTypeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "LbxPaymentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (LbxPaymentTypeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "LbxPaymentTypeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert LbxPaymentTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (LbxPaymentTypeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert LbxPaymentTypeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "LbxPaymentTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (LbxPaymentTypeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "LbxPaymentTypeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to LbxPaymentTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return LbxPaymentTypeObjectKeyData the converted object
   */
  public static LbxPaymentTypeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to LbxPaymentTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "LbxPaymentTypeObject")
   * @return LbxPaymentTypeObjectKeyData the converted object
   */
  public static LbxPaymentTypeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "LbxPaymentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to LbxPaymentTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return LbxPaymentTypeObjectKeyFilter the converted object
   */
  public static LbxPaymentTypeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to LbxPaymentTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "LbxPaymentTypeObject")
   * @return LbxPaymentTypeObjectKeyFilter the converted object
   */
  public static LbxPaymentTypeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "LbxPaymentTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert LbxPaymentTypeObjectKeyData to a Map (not including the root).
  /** convert LbxPaymentTypeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (LbxPaymentTypeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ExtCategorySet) record.put ("ExtCategory", in.ExtCategory);
  
    if (in._SourceIdSet) record.put ("SourceId", in.SourceId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert LbxPaymentTypeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (LbxPaymentTypeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ExtCategory, in.ExtCategorySort, in.ExtCategorySortAscending, in.ExtCategoryFetch, in.ExtCategoryCaseInsensitive);
      if (map != null) record.put ("ExtCategory", map);
      map = DataHelper.filterToMap (in.SourceId, in.SourceIdSort, in.SourceIdSortAscending, in.SourceIdFetch, in.SourceIdCaseInsensitive);
      if (map != null) record.put ("SourceId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to LbxPaymentTypeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return LbxPaymentTypeObjectKeyData the converted object
   */
  public static LbxPaymentTypeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    LbxPaymentTypeObjectKeyData out = new LbxPaymentTypeObjectKeyData ();

    if ((obj = record.get ("ExtCategory")) != null)
    {
      out.ExtCategory = (String) obj;
      out._ExtCategorySet = true;
    }
  
    if ((obj = record.get ("SourceId")) != null)
    {
      out.SourceId = (String) obj;
      out._SourceIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to LbxPaymentTypeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return LbxPaymentTypeObjectKeyFilter the converted object
   */
  public static LbxPaymentTypeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    LbxPaymentTypeObjectKeyFilter out = new LbxPaymentTypeObjectKeyFilter ();

    Map ExtCategoryMap = (Map)record.get("ExtCategory");
    Boolean ExtCategoryFetch = DataHelper.getFetch(ExtCategoryMap);
    Boolean ExtCategorySortDir = DataHelper.getSortDirection(ExtCategoryMap);
    Integer ExtCategorySortOrder = DataHelper.getSortOrder(ExtCategoryMap);
    if (ExtCategoryFetch != null) out.setExtCategoryFetch(ExtCategoryFetch);
    if (ExtCategorySortDir != null) out.setExtCategorySortDirection(ExtCategorySortDir);
    if (ExtCategorySortOrder != null) out.setExtCategorySortOrder(ExtCategorySortOrder);

    Filter[] ExtCategoryFilter = DataHelper.mapToFilterArray(ExtCategoryMap, String.class);
    if (ExtCategoryFilter != null) {
      StringFilter[] ExtCategoryFilters = new StringFilter[ExtCategoryFilter.length];
      for (int i = 0; i < ExtCategoryFilters.length; i++) {
        ExtCategoryFilters[i] = (StringFilter)ExtCategoryFilter[i];
      }
      try {
        out.setExtCategoryFilter(ExtCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SourceIdMap = (Map)record.get("SourceId");
    Boolean SourceIdFetch = DataHelper.getFetch(SourceIdMap);
    Boolean SourceIdSortDir = DataHelper.getSortDirection(SourceIdMap);
    Integer SourceIdSortOrder = DataHelper.getSortOrder(SourceIdMap);
    if (SourceIdFetch != null) out.setSourceIdFetch(SourceIdFetch);
    if (SourceIdSortDir != null) out.setSourceIdSortDirection(SourceIdSortDir);
    if (SourceIdSortOrder != null) out.setSourceIdSortOrder(SourceIdSortOrder);

    Filter[] SourceIdFilter = DataHelper.mapToFilterArray(SourceIdMap, String.class);
    if (SourceIdFilter != null) {
      StringFilter[] SourceIdFilters = new StringFilter[SourceIdFilter.length];
      for (int i = 0; i < SourceIdFilters.length; i++) {
        SourceIdFilters[i] = (StringFilter)SourceIdFilter[i];
      }
      try {
        out.setSourceIdFilter(SourceIdFilters);
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
