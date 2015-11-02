/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseInfoObjectKeyHelper.java
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

/** Helper class for ClearingHouseInfoObject's Key objects. */
public class ClearingHouseInfoObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ClearingHouseInfoObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseInfoObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ClearingHouseInfoObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ClearingHouseInfoObject")
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseInfoObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ClearingHouseInfoObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ClearingHouseInfoObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseInfoObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ClearingHouseInfoObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ClearingHouseInfoObject")
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseInfoObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ClearingHouseInfoObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ClearingHouseInfoObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ClearingHouseInfoObjectKeyData the converted object
   */
  public static ClearingHouseInfoObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ClearingHouseInfoObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ClearingHouseInfoObject")
   * @return ClearingHouseInfoObjectKeyData the converted object
   */
  public static ClearingHouseInfoObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseInfoObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ClearingHouseInfoObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ClearingHouseInfoObjectKeyFilter the converted object
   */
  public static ClearingHouseInfoObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ClearingHouseInfoObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ClearingHouseInfoObject")
   * @return ClearingHouseInfoObjectKeyFilter the converted object
   */
  public static ClearingHouseInfoObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseInfoObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ClearingHouseInfoObjectKeyData to a Map (not including the root).
  /** convert ClearingHouseInfoObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ClearingHouseInfoObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ClearingHouseIdSet) record.put ("ClearingHouseId", in.ClearingHouseId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    if (in._ModuleSet) record.put ("Module", in.Module);
  
    return record;
  }
  /** convert ClearingHouseInfoObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ClearingHouseInfoObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ClearingHouseId, in.ClearingHouseIdSort, in.ClearingHouseIdSortAscending, in.ClearingHouseIdFetch, in.ClearingHouseIdCaseInsensitive);
      if (map != null) record.put ("ClearingHouseId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
      map = DataHelper.filterToMap (in.Module, in.ModuleSort, in.ModuleSortAscending, in.ModuleFetch, in.ModuleCaseInsensitive);
      if (map != null) record.put ("Module", map);
    return record;
  }
  /** convert Map to ClearingHouseInfoObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ClearingHouseInfoObjectKeyData the converted object
   */
  public static ClearingHouseInfoObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ClearingHouseInfoObjectKeyData out = new ClearingHouseInfoObjectKeyData ();

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
  
    if ((obj = record.get ("Module")) != null)
    {
      out.Module = (String) obj;
      out._ModuleSet = true;
    }
  
    return out;
  }
  /** convert Map to ClearingHouseInfoObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ClearingHouseInfoObjectKeyFilter the converted object
   */
  public static ClearingHouseInfoObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ClearingHouseInfoObjectKeyFilter out = new ClearingHouseInfoObjectKeyFilter ();

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
  
    Map ModuleMap = (Map)record.get("Module");
    Boolean ModuleFetch = DataHelper.getFetch(ModuleMap);
    Boolean ModuleSortDir = DataHelper.getSortDirection(ModuleMap);
    Integer ModuleSortOrder = DataHelper.getSortOrder(ModuleMap);
    if (ModuleFetch != null) out.setModuleFetch(ModuleFetch);
    if (ModuleSortDir != null) out.setModuleSortDirection(ModuleSortDir);
    if (ModuleSortOrder != null) out.setModuleSortOrder(ModuleSortOrder);

    Filter[] ModuleFilter = DataHelper.mapToFilterArray(ModuleMap, String.class);
    if (ModuleFilter != null) {
      StringFilter[] ModuleFilters = new StringFilter[ModuleFilter.length];
      for (int i = 0; i < ModuleFilters.length; i++) {
        ModuleFilters[i] = (StringFilter)ModuleFilter[i];
      }
      try {
        out.setModuleFilter(ModuleFilters);
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
