/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AbiBillMessagesObjectKeyHelper.java
 * Definition File: Customer/.xml
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

/** Helper class for AbiBillMessagesObject's Key objects. */
public class AbiBillMessagesObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AbiBillMessagesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillMessagesObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiBillMessagesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiBillMessagesObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillMessagesObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiBillMessagesObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AbiBillMessagesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillMessagesObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AbiBillMessagesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AbiBillMessagesObject")
   * @return Map     the output Map
   */
  public static Map toMap (AbiBillMessagesObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AbiBillMessagesObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AbiBillMessagesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AbiBillMessagesObjectKeyData the converted object
   */
  public static AbiBillMessagesObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AbiBillMessagesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AbiBillMessagesObject")
   * @return AbiBillMessagesObjectKeyData the converted object
   */
  public static AbiBillMessagesObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillMessagesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AbiBillMessagesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AbiBillMessagesObjectKeyFilter the converted object
   */
  public static AbiBillMessagesObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AbiBillMessagesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AbiBillMessagesObject")
   * @return AbiBillMessagesObjectKeyFilter the converted object
   */
  public static AbiBillMessagesObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AbiBillMessagesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AbiBillMessagesObjectKeyData to a Map (not including the root).
  /** convert AbiBillMessagesObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AbiBillMessagesObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._MessageIdSet) record.put ("MessageId", in.MessageId);
  
    return record;
  }
  /** convert AbiBillMessagesObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AbiBillMessagesObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.MessageId, in.MessageIdSort, in.MessageIdSortAscending, in.MessageIdFetch);
      if (map != null) record.put ("MessageId", map);
    return record;
  }
  /** convert Map to AbiBillMessagesObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiBillMessagesObjectKeyData the converted object
   */
  public static AbiBillMessagesObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiBillMessagesObjectKeyData out = new AbiBillMessagesObjectKeyData ();

    if ((obj = record.get ("MessageId")) != null)
    {
      out.MessageId = (Integer) obj;
      out._MessageIdSet = true;
    }
  
    return out;
  }
  /** convert Map to AbiBillMessagesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AbiBillMessagesObjectKeyFilter the converted object
   */
  public static AbiBillMessagesObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AbiBillMessagesObjectKeyFilter out = new AbiBillMessagesObjectKeyFilter ();

    Map MessageIdMap = (Map)record.get("MessageId");
    Boolean MessageIdFetch = DataHelper.getFetch(MessageIdMap);
    Boolean MessageIdSortDir = DataHelper.getSortDirection(MessageIdMap);
    Integer MessageIdSortOrder = DataHelper.getSortOrder(MessageIdMap);
    if (MessageIdFetch != null) out.setMessageIdFetch(MessageIdFetch);
    if (MessageIdSortDir != null) out.setMessageIdSortDirection(MessageIdSortDir);
    if (MessageIdSortOrder != null) out.setMessageIdSortOrder(MessageIdSortOrder);

    Filter[] MessageIdFilter = DataHelper.mapToFilterArray(MessageIdMap, Integer.class);
    if (MessageIdFilter != null) {
      IntegerFilter[] MessageIdFilters = new IntegerFilter[MessageIdFilter.length];
      for (int i = 0; i < MessageIdFilters.length; i++) {
        MessageIdFilters[i] = (IntegerFilter)MessageIdFilter[i];
      }
      try {
        out.setMessageIdFilter(MessageIdFilters);
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
