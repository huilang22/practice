/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupFunctionObjectKeyHelper.java
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

/** Helper class for CsrGroupFunctionObject's Key objects. */
public class CsrGroupFunctionObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CsrGroupFunctionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupFunctionObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrGroupFunctionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrGroupFunctionObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupFunctionObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrGroupFunctionObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CsrGroupFunctionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupFunctionObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrGroupFunctionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrGroupFunctionObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupFunctionObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrGroupFunctionObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CsrGroupFunctionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CsrGroupFunctionObjectKeyData the converted object
   */
  public static CsrGroupFunctionObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CsrGroupFunctionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CsrGroupFunctionObject")
   * @return CsrGroupFunctionObjectKeyData the converted object
   */
  public static CsrGroupFunctionObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupFunctionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CsrGroupFunctionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CsrGroupFunctionObjectKeyFilter the converted object
   */
  public static CsrGroupFunctionObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CsrGroupFunctionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CsrGroupFunctionObject")
   * @return CsrGroupFunctionObjectKeyFilter the converted object
   */
  public static CsrGroupFunctionObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupFunctionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CsrGroupFunctionObjectKeyData to a Map (not including the root).
  /** convert CsrGroupFunctionObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CsrGroupFunctionObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._GroupNameSet) record.put ("GroupName", in.GroupName);
  
    if (in._ModuleNameSet) record.put ("ModuleName", in.ModuleName);
  
    return record;
  }
  /** convert CsrGroupFunctionObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CsrGroupFunctionObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.GroupName, in.GroupNameSort, in.GroupNameSortAscending, in.GroupNameFetch, in.GroupNameCaseInsensitive);
      if (map != null) record.put ("GroupName", map);
      map = DataHelper.filterToMap (in.ModuleName, in.ModuleNameSort, in.ModuleNameSortAscending, in.ModuleNameFetch, in.ModuleNameCaseInsensitive);
      if (map != null) record.put ("ModuleName", map);
    return record;
  }
  /** convert Map to CsrGroupFunctionObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrGroupFunctionObjectKeyData the converted object
   */
  public static CsrGroupFunctionObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrGroupFunctionObjectKeyData out = new CsrGroupFunctionObjectKeyData ();

    if ((obj = record.get ("GroupName")) != null)
    {
      out.GroupName = (String) obj;
      out._GroupNameSet = true;
    }
  
    if ((obj = record.get ("ModuleName")) != null)
    {
      out.ModuleName = (String) obj;
      out._ModuleNameSet = true;
    }
  
    return out;
  }
  /** convert Map to CsrGroupFunctionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrGroupFunctionObjectKeyFilter the converted object
   */
  public static CsrGroupFunctionObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrGroupFunctionObjectKeyFilter out = new CsrGroupFunctionObjectKeyFilter ();

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
  
    Map ModuleNameMap = (Map)record.get("ModuleName");
    Boolean ModuleNameFetch = DataHelper.getFetch(ModuleNameMap);
    Boolean ModuleNameSortDir = DataHelper.getSortDirection(ModuleNameMap);
    Integer ModuleNameSortOrder = DataHelper.getSortOrder(ModuleNameMap);
    if (ModuleNameFetch != null) out.setModuleNameFetch(ModuleNameFetch);
    if (ModuleNameSortDir != null) out.setModuleNameSortDirection(ModuleNameSortDir);
    if (ModuleNameSortOrder != null) out.setModuleNameSortOrder(ModuleNameSortOrder);

    Filter[] ModuleNameFilter = DataHelper.mapToFilterArray(ModuleNameMap, String.class);
    if (ModuleNameFilter != null) {
      StringFilter[] ModuleNameFilters = new StringFilter[ModuleNameFilter.length];
      for (int i = 0; i < ModuleNameFilters.length; i++) {
        ModuleNameFilters[i] = (StringFilter)ModuleNameFilter[i];
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
