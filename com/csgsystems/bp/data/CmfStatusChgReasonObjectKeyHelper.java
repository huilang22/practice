/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CmfStatusChgReasonObjectKeyHelper.java
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

/** Helper class for CmfStatusChgReasonObject's Key objects. */
public class CmfStatusChgReasonObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CmfStatusChgReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CmfStatusChgReasonObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CmfStatusChgReasonObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CmfStatusChgReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (CmfStatusChgReasonObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CmfStatusChgReasonObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CmfStatusChgReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CmfStatusChgReasonObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CmfStatusChgReasonObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CmfStatusChgReasonObject")
   * @return Map     the output Map
   */
  public static Map toMap (CmfStatusChgReasonObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CmfStatusChgReasonObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CmfStatusChgReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CmfStatusChgReasonObjectKeyData the converted object
   */
  public static CmfStatusChgReasonObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CmfStatusChgReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CmfStatusChgReasonObject")
   * @return CmfStatusChgReasonObjectKeyData the converted object
   */
  public static CmfStatusChgReasonObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CmfStatusChgReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CmfStatusChgReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CmfStatusChgReasonObjectKeyFilter the converted object
   */
  public static CmfStatusChgReasonObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CmfStatusChgReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CmfStatusChgReasonObject")
   * @return CmfStatusChgReasonObjectKeyFilter the converted object
   */
  public static CmfStatusChgReasonObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CmfStatusChgReasonObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CmfStatusChgReasonObjectKeyData to a Map (not including the root).
  /** convert CmfStatusChgReasonObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CmfStatusChgReasonObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ChgReasonValueSet) record.put ("ChgReasonValue", in.ChgReasonValue);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert CmfStatusChgReasonObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CmfStatusChgReasonObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ChgReasonValue, in.ChgReasonValueSort, in.ChgReasonValueSortAscending, in.ChgReasonValueFetch);
      if (map != null) record.put ("ChgReasonValue", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to CmfStatusChgReasonObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CmfStatusChgReasonObjectKeyData the converted object
   */
  public static CmfStatusChgReasonObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CmfStatusChgReasonObjectKeyData out = new CmfStatusChgReasonObjectKeyData ();

    if ((obj = record.get ("ChgReasonValue")) != null)
    {
      out.ChgReasonValue = (Integer) obj;
      out._ChgReasonValueSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to CmfStatusChgReasonObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CmfStatusChgReasonObjectKeyFilter the converted object
   */
  public static CmfStatusChgReasonObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CmfStatusChgReasonObjectKeyFilter out = new CmfStatusChgReasonObjectKeyFilter ();

    Map ChgReasonValueMap = (Map)record.get("ChgReasonValue");
    Boolean ChgReasonValueFetch = DataHelper.getFetch(ChgReasonValueMap);
    Boolean ChgReasonValueSortDir = DataHelper.getSortDirection(ChgReasonValueMap);
    Integer ChgReasonValueSortOrder = DataHelper.getSortOrder(ChgReasonValueMap);
    if (ChgReasonValueFetch != null) out.setChgReasonValueFetch(ChgReasonValueFetch);
    if (ChgReasonValueSortDir != null) out.setChgReasonValueSortDirection(ChgReasonValueSortDir);
    if (ChgReasonValueSortOrder != null) out.setChgReasonValueSortOrder(ChgReasonValueSortOrder);

    Filter[] ChgReasonValueFilter = DataHelper.mapToFilterArray(ChgReasonValueMap, Integer.class);
    if (ChgReasonValueFilter != null) {
      IntegerFilter[] ChgReasonValueFilters = new IntegerFilter[ChgReasonValueFilter.length];
      for (int i = 0; i < ChgReasonValueFilters.length; i++) {
        ChgReasonValueFilters[i] = (IntegerFilter)ChgReasonValueFilter[i];
      }
      try {
        out.setChgReasonValueFilter(ChgReasonValueFilters);
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
