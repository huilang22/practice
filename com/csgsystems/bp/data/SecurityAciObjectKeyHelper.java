/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityAciObjectKeyHelper.java
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

/** Helper class for SecurityAciObject's Key objects. */
public class SecurityAciObjectKeyHelper implements ArubaObjectHelper
{
  /** convert SecurityAciObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityAciObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityAciObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityAciObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityAciObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityAciObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert SecurityAciObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityAciObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityAciObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityAciObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityAciObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityAciObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SecurityAciObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return SecurityAciObjectKeyData the converted object
   */
  public static SecurityAciObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SecurityAciObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SecurityAciObject")
   * @return SecurityAciObjectKeyData the converted object
   */
  public static SecurityAciObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityAciObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SecurityAciObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return SecurityAciObjectKeyFilter the converted object
   */
  public static SecurityAciObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SecurityAciObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SecurityAciObject")
   * @return SecurityAciObjectKeyFilter the converted object
   */
  public static SecurityAciObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityAciObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert SecurityAciObjectKeyData to a Map (not including the root).
  /** convert SecurityAciObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SecurityAciObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AciIdSet) record.put ("AciId", in.AciId);
  
    return record;
  }
  /** convert SecurityAciObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SecurityAciObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AciId, in.AciIdSort, in.AciIdSortAscending, in.AciIdFetch);
      if (map != null) record.put ("AciId", map);
    return record;
  }
  /** convert Map to SecurityAciObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityAciObjectKeyData the converted object
   */
  public static SecurityAciObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityAciObjectKeyData out = new SecurityAciObjectKeyData ();

    if ((obj = record.get ("AciId")) != null)
    {
      out.AciId = (BigInteger) obj;
      out._AciIdSet = true;
    }
  
    return out;
  }
  /** convert Map to SecurityAciObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityAciObjectKeyFilter the converted object
   */
  public static SecurityAciObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityAciObjectKeyFilter out = new SecurityAciObjectKeyFilter ();

    Map AciIdMap = (Map)record.get("AciId");
    Boolean AciIdFetch = DataHelper.getFetch(AciIdMap);
    Boolean AciIdSortDir = DataHelper.getSortDirection(AciIdMap);
    Integer AciIdSortOrder = DataHelper.getSortOrder(AciIdMap);
    if (AciIdFetch != null) out.setAciIdFetch(AciIdFetch);
    if (AciIdSortDir != null) out.setAciIdSortDirection(AciIdSortDir);
    if (AciIdSortOrder != null) out.setAciIdSortOrder(AciIdSortOrder);

    Filter[] AciIdFilter = DataHelper.mapToFilterArray(AciIdMap, BigInteger.class);
    if (AciIdFilter != null) {
      BigIntegerFilter[] AciIdFilters = new BigIntegerFilter[AciIdFilter.length];
      for (int i = 0; i < AciIdFilters.length; i++) {
        AciIdFilters[i] = (BigIntegerFilter)AciIdFilter[i];
      }
      try {
        out.setAciIdFilter(AciIdFilters);
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
