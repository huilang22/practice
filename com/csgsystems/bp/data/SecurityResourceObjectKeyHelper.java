/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityResourceObjectKeyHelper.java
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

/** Helper class for SecurityResourceObject's Key objects. */
public class SecurityResourceObjectKeyHelper implements ArubaObjectHelper
{
  /** convert SecurityResourceObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityResourceObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityResourceObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityResourceObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityResourceObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityResourceObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert SecurityResourceObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityResourceObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityResourceObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityResourceObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityResourceObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityResourceObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SecurityResourceObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return SecurityResourceObjectKeyData the converted object
   */
  public static SecurityResourceObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SecurityResourceObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SecurityResourceObject")
   * @return SecurityResourceObjectKeyData the converted object
   */
  public static SecurityResourceObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityResourceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SecurityResourceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return SecurityResourceObjectKeyFilter the converted object
   */
  public static SecurityResourceObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SecurityResourceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SecurityResourceObject")
   * @return SecurityResourceObjectKeyFilter the converted object
   */
  public static SecurityResourceObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityResourceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert SecurityResourceObjectKeyData to a Map (not including the root).
  /** convert SecurityResourceObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SecurityResourceObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ResIdSet) record.put ("ResId", in.ResId);
  
    return record;
  }
  /** convert SecurityResourceObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SecurityResourceObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ResId, in.ResIdSort, in.ResIdSortAscending, in.ResIdFetch);
      if (map != null) record.put ("ResId", map);
    return record;
  }
  /** convert Map to SecurityResourceObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityResourceObjectKeyData the converted object
   */
  public static SecurityResourceObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityResourceObjectKeyData out = new SecurityResourceObjectKeyData ();

    if ((obj = record.get ("ResId")) != null)
    {
      out.ResId = (BigInteger) obj;
      out._ResIdSet = true;
    }
  
    return out;
  }
  /** convert Map to SecurityResourceObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityResourceObjectKeyFilter the converted object
   */
  public static SecurityResourceObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityResourceObjectKeyFilter out = new SecurityResourceObjectKeyFilter ();

    Map ResIdMap = (Map)record.get("ResId");
    Boolean ResIdFetch = DataHelper.getFetch(ResIdMap);
    Boolean ResIdSortDir = DataHelper.getSortDirection(ResIdMap);
    Integer ResIdSortOrder = DataHelper.getSortOrder(ResIdMap);
    if (ResIdFetch != null) out.setResIdFetch(ResIdFetch);
    if (ResIdSortDir != null) out.setResIdSortDirection(ResIdSortDir);
    if (ResIdSortOrder != null) out.setResIdSortOrder(ResIdSortOrder);

    Filter[] ResIdFilter = DataHelper.mapToFilterArray(ResIdMap, BigInteger.class);
    if (ResIdFilter != null) {
      BigIntegerFilter[] ResIdFilters = new BigIntegerFilter[ResIdFilter.length];
      for (int i = 0; i < ResIdFilters.length; i++) {
        ResIdFilters[i] = (BigIntegerFilter)ResIdFilter[i];
      }
      try {
        out.setResIdFilter(ResIdFilters);
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
