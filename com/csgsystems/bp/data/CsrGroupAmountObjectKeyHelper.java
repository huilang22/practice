/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupAmountObjectKeyHelper.java
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

/** Helper class for CsrGroupAmountObject's Key objects. */
public class CsrGroupAmountObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CsrGroupAmountObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupAmountObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrGroupAmountObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrGroupAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupAmountObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrGroupAmountObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CsrGroupAmountObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupAmountObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrGroupAmountObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrGroupAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupAmountObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrGroupAmountObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CsrGroupAmountObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CsrGroupAmountObjectKeyData the converted object
   */
  public static CsrGroupAmountObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CsrGroupAmountObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CsrGroupAmountObject")
   * @return CsrGroupAmountObjectKeyData the converted object
   */
  public static CsrGroupAmountObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CsrGroupAmountObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CsrGroupAmountObjectKeyFilter the converted object
   */
  public static CsrGroupAmountObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CsrGroupAmountObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CsrGroupAmountObject")
   * @return CsrGroupAmountObjectKeyFilter the converted object
   */
  public static CsrGroupAmountObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CsrGroupAmountObjectKeyData to a Map (not including the root).
  /** convert CsrGroupAmountObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CsrGroupAmountObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._GroupNameSet) record.put ("GroupName", in.GroupName);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._ModuleNameSet) record.put ("ModuleName", in.ModuleName);
  
    return record;
  }
  /** convert CsrGroupAmountObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CsrGroupAmountObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.GroupName, in.GroupNameSort, in.GroupNameSortAscending, in.GroupNameFetch, in.GroupNameCaseInsensitive);
      if (map != null) record.put ("GroupName", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.ModuleName, in.ModuleNameSort, in.ModuleNameSortAscending, in.ModuleNameFetch);
      if (map != null) record.put ("ModuleName", map);
    return record;
  }
  /** convert Map to CsrGroupAmountObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrGroupAmountObjectKeyData the converted object
   */
  public static CsrGroupAmountObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrGroupAmountObjectKeyData out = new CsrGroupAmountObjectKeyData ();

    if ((obj = record.get ("GroupName")) != null)
    {
      out.GroupName = (String) obj;
      out._GroupNameSet = true;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
      out._CurrencyCodeSet = true;
    }
  
    if ((obj = record.get ("ModuleName")) != null)
    {
      out.ModuleName = (Integer) obj;
      out._ModuleNameSet = true;
    }
  
    return out;
  }
  /** convert Map to CsrGroupAmountObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrGroupAmountObjectKeyFilter the converted object
   */
  public static CsrGroupAmountObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrGroupAmountObjectKeyFilter out = new CsrGroupAmountObjectKeyFilter ();

    Map GroupNameMap = (Map)record.get("GroupName");
    Boolean GroupNameFetch = DataHelper.getFetch(GroupNameMap);
    Boolean GroupNameSortDir = DataHelper.getSortDirection(GroupNameMap);
    Integer GroupNameSortOrder = DataHelper.getSortOrder(GroupNameMap);
    if (GroupNameFetch != null) out.setGroupNameFetch(GroupNameFetch);
    if (GroupNameSortDir != null) out.setGroupNameSortDirection(GroupNameSortDir);
    if (GroupNameSortOrder != null) out.setGroupNameSortOrder(GroupNameSortOrder);

    Filter[] GroupNameFilter = DataHelper.mapToFilterArray(GroupNameMap, String.class);
    if (GroupNameFilter != null) {
      StringFilter[] GroupNameFilters = new StringFilter[GroupNameFilter.length];
      for (int i = 0; i < GroupNameFilters.length; i++) {
        GroupNameFilters[i] = (StringFilter)GroupNameFilter[i];
      }
      try {
        out.setGroupNameFilter(GroupNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, Integer.class);
    if (CurrencyCodeFilter != null) {
      IntegerFilter[] CurrencyCodeFilters = new IntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (IntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ModuleNameMap = (Map)record.get("ModuleName");
    Boolean ModuleNameFetch = DataHelper.getFetch(ModuleNameMap);
    Boolean ModuleNameSortDir = DataHelper.getSortDirection(ModuleNameMap);
    Integer ModuleNameSortOrder = DataHelper.getSortOrder(ModuleNameMap);
    if (ModuleNameFetch != null) out.setModuleNameFetch(ModuleNameFetch);
    if (ModuleNameSortDir != null) out.setModuleNameSortDirection(ModuleNameSortDir);
    if (ModuleNameSortOrder != null) out.setModuleNameSortOrder(ModuleNameSortOrder);

    Filter[] ModuleNameFilter = DataHelper.mapToFilterArray(ModuleNameMap, Integer.class);
    if (ModuleNameFilter != null) {
      IntegerFilter[] ModuleNameFilters = new IntegerFilter[ModuleNameFilter.length];
      for (int i = 0; i < ModuleNameFilters.length; i++) {
        ModuleNameFilters[i] = (IntegerFilter)ModuleNameFilter[i];
      }
      try {
        out.setModuleNameFilter(ModuleNameFilters);
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
