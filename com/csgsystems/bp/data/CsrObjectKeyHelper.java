/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrObjectKeyHelper.java
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

/** Helper class for CsrObject's Key objects. */
public class CsrObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CsrObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CsrObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CsrObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CsrObjectKeyData the converted object
   */
  public static CsrObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CsrObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CsrObject")
   * @return CsrObjectKeyData the converted object
   */
  public static CsrObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CsrObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CsrObjectKeyFilter the converted object
   */
  public static CsrObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CsrObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CsrObject")
   * @return CsrObjectKeyFilter the converted object
   */
  public static CsrObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CsrObjectKeyData to a Map (not including the root).
  /** convert CsrObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CsrObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._UserNameSet) record.put ("UserName", in.UserName);
  
    return record;
  }
  /** convert CsrObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CsrObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.UserName, in.UserNameSort, in.UserNameSortAscending, in.UserNameFetch, in.UserNameCaseInsensitive);
      if (map != null) record.put ("UserName", map);
    return record;
  }
  /** convert Map to CsrObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrObjectKeyData the converted object
   */
  public static CsrObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrObjectKeyData out = new CsrObjectKeyData ();

    if ((obj = record.get ("UserName")) != null)
    {
      out.UserName = (String) obj;
      out._UserNameSet = true;
    }
  
    return out;
  }
  /** convert Map to CsrObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrObjectKeyFilter the converted object
   */
  public static CsrObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrObjectKeyFilter out = new CsrObjectKeyFilter ();

    Map UserNameMap = (Map)record.get("UserName");
    Boolean UserNameFetch = DataHelper.getFetch(UserNameMap);
    Boolean UserNameSortDir = DataHelper.getSortDirection(UserNameMap);
    Integer UserNameSortOrder = DataHelper.getSortOrder(UserNameMap);
    if (UserNameFetch != null) out.setUserNameFetch(UserNameFetch);
    if (UserNameSortDir != null) out.setUserNameSortDirection(UserNameSortDir);
    if (UserNameSortOrder != null) out.setUserNameSortOrder(UserNameSortOrder);

    Filter[] UserNameFilter = DataHelper.mapToFilterArray(UserNameMap, String.class);
    if (UserNameFilter != null) {
      StringFilter[] UserNameFilters = new StringFilter[UserNameFilter.length];
      for (int i = 0; i < UserNameFilters.length; i++) {
        UserNameFilters[i] = (StringFilter)UserNameFilter[i];
      }
      try {
        out.setUserNameFilter(UserNameFilters);
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
