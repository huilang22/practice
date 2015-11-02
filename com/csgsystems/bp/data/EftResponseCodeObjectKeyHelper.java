/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EftResponseCodeObjectKeyHelper.java
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

/** Helper class for EftResponseCodeObject's Key objects. */
public class EftResponseCodeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert EftResponseCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EftResponseCodeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EftResponseCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EftResponseCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (EftResponseCodeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EftResponseCodeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert EftResponseCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EftResponseCodeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EftResponseCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EftResponseCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (EftResponseCodeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EftResponseCodeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EftResponseCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return EftResponseCodeObjectKeyData the converted object
   */
  public static EftResponseCodeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EftResponseCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EftResponseCodeObject")
   * @return EftResponseCodeObjectKeyData the converted object
   */
  public static EftResponseCodeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EftResponseCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EftResponseCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return EftResponseCodeObjectKeyFilter the converted object
   */
  public static EftResponseCodeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EftResponseCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EftResponseCodeObject")
   * @return EftResponseCodeObjectKeyFilter the converted object
   */
  public static EftResponseCodeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EftResponseCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert EftResponseCodeObjectKeyData to a Map (not including the root).
  /** convert EftResponseCodeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (EftResponseCodeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ResponseCodeSet) record.put ("ResponseCode", in.ResponseCode);
  
    if (in._ClearingHouseIdSet) record.put ("ClearingHouseId", in.ClearingHouseId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert EftResponseCodeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (EftResponseCodeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ResponseCode, in.ResponseCodeSort, in.ResponseCodeSortAscending, in.ResponseCodeFetch, in.ResponseCodeCaseInsensitive);
      if (map != null) record.put ("ResponseCode", map);
      map = DataHelper.filterToMap (in.ClearingHouseId, in.ClearingHouseIdSort, in.ClearingHouseIdSortAscending, in.ClearingHouseIdFetch, in.ClearingHouseIdCaseInsensitive);
      if (map != null) record.put ("ClearingHouseId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to EftResponseCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EftResponseCodeObjectKeyData the converted object
   */
  public static EftResponseCodeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EftResponseCodeObjectKeyData out = new EftResponseCodeObjectKeyData ();

    if ((obj = record.get ("ResponseCode")) != null)
    {
      out.ResponseCode = (String) obj;
      out._ResponseCodeSet = true;
    }
  
    if ((obj = record.get ("ClearingHouseId")) != null)
    {
      out.ClearingHouseId = (String) obj;
      out._ClearingHouseIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to EftResponseCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EftResponseCodeObjectKeyFilter the converted object
   */
  public static EftResponseCodeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EftResponseCodeObjectKeyFilter out = new EftResponseCodeObjectKeyFilter ();

    Map ResponseCodeMap = (Map)record.get("ResponseCode");
    Boolean ResponseCodeFetch = DataHelper.getFetch(ResponseCodeMap);
    Boolean ResponseCodeSortDir = DataHelper.getSortDirection(ResponseCodeMap);
    Integer ResponseCodeSortOrder = DataHelper.getSortOrder(ResponseCodeMap);
    if (ResponseCodeFetch != null) out.setResponseCodeFetch(ResponseCodeFetch);
    if (ResponseCodeSortDir != null) out.setResponseCodeSortDirection(ResponseCodeSortDir);
    if (ResponseCodeSortOrder != null) out.setResponseCodeSortOrder(ResponseCodeSortOrder);

    Filter[] ResponseCodeFilter = DataHelper.mapToFilterArray(ResponseCodeMap, String.class);
    if (ResponseCodeFilter != null) {
      StringFilter[] ResponseCodeFilters = new StringFilter[ResponseCodeFilter.length];
      for (int i = 0; i < ResponseCodeFilters.length; i++) {
        ResponseCodeFilters[i] = (StringFilter)ResponseCodeFilter[i];
      }
      try {
        out.setResponseCodeFilter(ResponseCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ClearingHouseIdMap = (Map)record.get("ClearingHouseId");
    Boolean ClearingHouseIdFetch = DataHelper.getFetch(ClearingHouseIdMap);
    Boolean ClearingHouseIdSortDir = DataHelper.getSortDirection(ClearingHouseIdMap);
    Integer ClearingHouseIdSortOrder = DataHelper.getSortOrder(ClearingHouseIdMap);
    if (ClearingHouseIdFetch != null) out.setClearingHouseIdFetch(ClearingHouseIdFetch);
    if (ClearingHouseIdSortDir != null) out.setClearingHouseIdSortDirection(ClearingHouseIdSortDir);
    if (ClearingHouseIdSortOrder != null) out.setClearingHouseIdSortOrder(ClearingHouseIdSortOrder);

    Filter[] ClearingHouseIdFilter = DataHelper.mapToFilterArray(ClearingHouseIdMap, String.class);
    if (ClearingHouseIdFilter != null) {
      StringFilter[] ClearingHouseIdFilters = new StringFilter[ClearingHouseIdFilter.length];
      for (int i = 0; i < ClearingHouseIdFilters.length; i++) {
        ClearingHouseIdFilters[i] = (StringFilter)ClearingHouseIdFilter[i];
      }
      try {
        out.setClearingHouseIdFilter(ClearingHouseIdFilters);
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
