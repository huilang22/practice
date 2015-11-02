/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityUserObjectKeyHelper.java
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

/** Helper class for SecurityUserObject's Key objects. */
public class SecurityUserObjectKeyHelper implements ArubaObjectHelper
{
  /** convert SecurityUserObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityUserObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityUserObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityUserObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityUserObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityUserObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert SecurityUserObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityUserObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityUserObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityUserObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityUserObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityUserObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SecurityUserObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return SecurityUserObjectKeyData the converted object
   */
  public static SecurityUserObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SecurityUserObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SecurityUserObject")
   * @return SecurityUserObjectKeyData the converted object
   */
  public static SecurityUserObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityUserObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SecurityUserObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return SecurityUserObjectKeyFilter the converted object
   */
  public static SecurityUserObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SecurityUserObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SecurityUserObject")
   * @return SecurityUserObjectKeyFilter the converted object
   */
  public static SecurityUserObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityUserObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert SecurityUserObjectKeyData to a Map (not including the root).
  /** convert SecurityUserObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SecurityUserObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._UsrIdSet) record.put ("UsrId", in.UsrId);
  
    return record;
  }
  /** convert SecurityUserObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SecurityUserObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.UsrId, in.UsrIdSort, in.UsrIdSortAscending, in.UsrIdFetch);
      if (map != null) record.put ("UsrId", map);
    return record;
  }
  /** convert Map to SecurityUserObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityUserObjectKeyData the converted object
   */
  public static SecurityUserObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityUserObjectKeyData out = new SecurityUserObjectKeyData ();

    if ((obj = record.get ("UsrId")) != null)
    {
      out.UsrId = (BigInteger) obj;
      out._UsrIdSet = true;
    }
  
    return out;
  }
  /** convert Map to SecurityUserObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityUserObjectKeyFilter the converted object
   */
  public static SecurityUserObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityUserObjectKeyFilter out = new SecurityUserObjectKeyFilter ();

    Map UsrIdMap = (Map)record.get("UsrId");
    Boolean UsrIdFetch = DataHelper.getFetch(UsrIdMap);
    Boolean UsrIdSortDir = DataHelper.getSortDirection(UsrIdMap);
    Integer UsrIdSortOrder = DataHelper.getSortOrder(UsrIdMap);
    if (UsrIdFetch != null) out.setUsrIdFetch(UsrIdFetch);
    if (UsrIdSortDir != null) out.setUsrIdSortDirection(UsrIdSortDir);
    if (UsrIdSortOrder != null) out.setUsrIdSortOrder(UsrIdSortOrder);

    Filter[] UsrIdFilter = DataHelper.mapToFilterArray(UsrIdMap, BigInteger.class);
    if (UsrIdFilter != null) {
      BigIntegerFilter[] UsrIdFilters = new BigIntegerFilter[UsrIdFilter.length];
      for (int i = 0; i < UsrIdFilters.length; i++) {
        UsrIdFilters[i] = (BigIntegerFilter)UsrIdFilter[i];
      }
      try {
        out.setUsrIdFilter(UsrIdFilters);
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
