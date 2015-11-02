/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: XPTObjectKeyHelper.java
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

/** Helper class for XPTObject's Key objects. */
public class XPTObjectKeyHelper implements ArubaObjectHelper
{
  /** convert XPTObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (XPTObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert XPTObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "XPTObject")
   * @return Map     the output Map
   */
  public static Map toMap (XPTObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "XPTObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert XPTObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (XPTObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert XPTObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "XPTObject")
   * @return Map     the output Map
   */
  public static Map toMap (XPTObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "XPTObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to XPTObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return XPTObjectKeyData the converted object
   */
  public static XPTObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to XPTObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "XPTObject")
   * @return XPTObjectKeyData the converted object
   */
  public static XPTObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "XPTObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to XPTObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return XPTObjectKeyFilter the converted object
   */
  public static XPTObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to XPTObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "XPTObject")
   * @return XPTObjectKeyFilter the converted object
   */
  public static XPTObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "XPTObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert XPTObjectKeyData to a Map (not including the root).
  /** convert XPTObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (XPTObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ParamIdSet) record.put ("ParamId", in.ParamId);
  
    return record;
  }
  /** convert XPTObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (XPTObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ParamId, in.ParamIdSort, in.ParamIdSortAscending, in.ParamIdFetch);
      if (map != null) record.put ("ParamId", map);
    return record;
  }
  /** convert Map to XPTObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return XPTObjectKeyData the converted object
   */
  public static XPTObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    XPTObjectKeyData out = new XPTObjectKeyData ();

    if ((obj = record.get ("ParamId")) != null)
    {
      out.ParamId = (Integer) obj;
      out._ParamIdSet = true;
    }
  
    return out;
  }
  /** convert Map to XPTObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return XPTObjectKeyFilter the converted object
   */
  public static XPTObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    XPTObjectKeyFilter out = new XPTObjectKeyFilter ();

    Map ParamIdMap = (Map)record.get("ParamId");
    Boolean ParamIdFetch = DataHelper.getFetch(ParamIdMap);
    Boolean ParamIdSortDir = DataHelper.getSortDirection(ParamIdMap);
    Integer ParamIdSortOrder = DataHelper.getSortOrder(ParamIdMap);
    if (ParamIdFetch != null) out.setParamIdFetch(ParamIdFetch);
    if (ParamIdSortDir != null) out.setParamIdSortDirection(ParamIdSortDir);
    if (ParamIdSortOrder != null) out.setParamIdSortOrder(ParamIdSortOrder);

    Filter[] ParamIdFilter = DataHelper.mapToFilterArray(ParamIdMap, Integer.class);
    if (ParamIdFilter != null) {
      IntegerFilter[] ParamIdFilters = new IntegerFilter[ParamIdFilter.length];
      for (int i = 0; i < ParamIdFilters.length; i++) {
        ParamIdFilters[i] = (IntegerFilter)ParamIdFilter[i];
      }
      try {
        out.setParamIdFilter(ParamIdFilters);
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
