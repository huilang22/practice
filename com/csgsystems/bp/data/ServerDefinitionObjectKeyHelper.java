/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServerDefinitionObjectKeyHelper.java
 * Definition File: Catalog/.xml
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

/** Helper class for ServerDefinitionObject's Key objects. */
public class ServerDefinitionObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ServerDefinitionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServerDefinitionObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServerDefinitionObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServerDefinitionObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServerDefinitionObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServerDefinitionObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ServerDefinitionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServerDefinitionObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServerDefinitionObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServerDefinitionObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServerDefinitionObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServerDefinitionObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServerDefinitionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ServerDefinitionObjectKeyData the converted object
   */
  public static ServerDefinitionObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServerDefinitionObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServerDefinitionObject")
   * @return ServerDefinitionObjectKeyData the converted object
   */
  public static ServerDefinitionObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServerDefinitionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServerDefinitionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ServerDefinitionObjectKeyFilter the converted object
   */
  public static ServerDefinitionObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServerDefinitionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServerDefinitionObject")
   * @return ServerDefinitionObjectKeyFilter the converted object
   */
  public static ServerDefinitionObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServerDefinitionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ServerDefinitionObjectKeyData to a Map (not including the root).
  /** convert ServerDefinitionObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServerDefinitionObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    return record;
  }
  /** convert ServerDefinitionObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ServerDefinitionObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch);
      if (map != null) record.put ("ServerId", map);
    return record;
  }
  /** convert Map to ServerDefinitionObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServerDefinitionObjectKeyData the converted object
   */
  public static ServerDefinitionObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServerDefinitionObjectKeyData out = new ServerDefinitionObjectKeyData ();

    if ((obj = record.get ("ServerId")) != null)
    {
      out.ServerId = (Integer) obj;
      out._ServerIdSet = true;
    }
  
    return out;
  }
  /** convert Map to ServerDefinitionObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServerDefinitionObjectKeyFilter the converted object
   */
  public static ServerDefinitionObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServerDefinitionObjectKeyFilter out = new ServerDefinitionObjectKeyFilter ();

    Map ServerIdMap = (Map)record.get("ServerId");
    Boolean ServerIdFetch = DataHelper.getFetch(ServerIdMap);
    Boolean ServerIdSortDir = DataHelper.getSortDirection(ServerIdMap);
    Integer ServerIdSortOrder = DataHelper.getSortOrder(ServerIdMap);
    if (ServerIdFetch != null) out.setServerIdFetch(ServerIdFetch);
    if (ServerIdSortDir != null) out.setServerIdSortDirection(ServerIdSortDir);
    if (ServerIdSortOrder != null) out.setServerIdSortOrder(ServerIdSortOrder);

    Filter[] ServerIdFilter = DataHelper.mapToFilterArray(ServerIdMap, Integer.class);
    if (ServerIdFilter != null) {
      IntegerFilter[] ServerIdFilters = new IntegerFilter[ServerIdFilter.length];
      for (int i = 0; i < ServerIdFilters.length; i++) {
        ServerIdFilters[i] = (IntegerFilter)ServerIdFilter[i];
      }
      try {
        out.setServerIdFilter(ServerIdFilters);
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
