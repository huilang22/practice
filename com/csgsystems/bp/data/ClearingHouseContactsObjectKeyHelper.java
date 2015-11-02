/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseContactsObjectKeyHelper.java
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

/** Helper class for ClearingHouseContactsObject's Key objects. */
public class ClearingHouseContactsObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ClearingHouseContactsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseContactsObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ClearingHouseContactsObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ClearingHouseContactsObject")
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseContactsObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ClearingHouseContactsObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ClearingHouseContactsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseContactsObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ClearingHouseContactsObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ClearingHouseContactsObject")
   * @return Map     the output Map
   */
  public static Map toMap (ClearingHouseContactsObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ClearingHouseContactsObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ClearingHouseContactsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ClearingHouseContactsObjectKeyData the converted object
   */
  public static ClearingHouseContactsObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ClearingHouseContactsObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ClearingHouseContactsObject")
   * @return ClearingHouseContactsObjectKeyData the converted object
   */
  public static ClearingHouseContactsObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseContactsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ClearingHouseContactsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ClearingHouseContactsObjectKeyFilter the converted object
   */
  public static ClearingHouseContactsObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ClearingHouseContactsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ClearingHouseContactsObject")
   * @return ClearingHouseContactsObjectKeyFilter the converted object
   */
  public static ClearingHouseContactsObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ClearingHouseContactsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ClearingHouseContactsObjectKeyData to a Map (not including the root).
  /** convert ClearingHouseContactsObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ClearingHouseContactsObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ExtContactIdSet) record.put ("ExtContactId", in.ExtContactId);
  
    return record;
  }
  /** convert ClearingHouseContactsObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ClearingHouseContactsObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ExtContactId, in.ExtContactIdSort, in.ExtContactIdSortAscending, in.ExtContactIdFetch);
      if (map != null) record.put ("ExtContactId", map);
    return record;
  }
  /** convert Map to ClearingHouseContactsObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ClearingHouseContactsObjectKeyData the converted object
   */
  public static ClearingHouseContactsObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ClearingHouseContactsObjectKeyData out = new ClearingHouseContactsObjectKeyData ();

    if ((obj = record.get ("ExtContactId")) != null)
    {
      out.ExtContactId = (Integer) obj;
      out._ExtContactIdSet = true;
    }
  
    return out;
  }
  /** convert Map to ClearingHouseContactsObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ClearingHouseContactsObjectKeyFilter the converted object
   */
  public static ClearingHouseContactsObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ClearingHouseContactsObjectKeyFilter out = new ClearingHouseContactsObjectKeyFilter ();

    Map ExtContactIdMap = (Map)record.get("ExtContactId");
    Boolean ExtContactIdFetch = DataHelper.getFetch(ExtContactIdMap);
    Boolean ExtContactIdSortDir = DataHelper.getSortDirection(ExtContactIdMap);
    Integer ExtContactIdSortOrder = DataHelper.getSortOrder(ExtContactIdMap);
    if (ExtContactIdFetch != null) out.setExtContactIdFetch(ExtContactIdFetch);
    if (ExtContactIdSortDir != null) out.setExtContactIdSortDirection(ExtContactIdSortDir);
    if (ExtContactIdSortOrder != null) out.setExtContactIdSortOrder(ExtContactIdSortOrder);

    Filter[] ExtContactIdFilter = DataHelper.mapToFilterArray(ExtContactIdMap, Integer.class);
    if (ExtContactIdFilter != null) {
      IntegerFilter[] ExtContactIdFilters = new IntegerFilter[ExtContactIdFilter.length];
      for (int i = 0; i < ExtContactIdFilters.length; i++) {
        ExtContactIdFilters[i] = (IntegerFilter)ExtContactIdFilter[i];
      }
      try {
        out.setExtContactIdFilter(ExtContactIdFilters);
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
