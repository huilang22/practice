/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EDObjectKeyHelper.java
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

/** Helper class for EDObject's Key objects. */
public class EDObjectKeyHelper implements ArubaObjectHelper
{
  /** convert EDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EDObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EDObject")
   * @return Map     the output Map
   */
  public static Map toMap (EDObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EDObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert EDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EDObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EDObject")
   * @return Map     the output Map
   */
  public static Map toMap (EDObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EDObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return EDObjectKeyData the converted object
   */
  public static EDObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EDObject")
   * @return EDObjectKeyData the converted object
   */
  public static EDObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return EDObjectKeyFilter the converted object
   */
  public static EDObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EDObject")
   * @return EDObjectKeyFilter the converted object
   */
  public static EDObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert EDObjectKeyData to a Map (not including the root).
  /** convert EDObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (EDObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._EnumerationIdSet) record.put ("EnumerationId", in.EnumerationId);
  
    return record;
  }
  /** convert EDObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (EDObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.EnumerationId, in.EnumerationIdSort, in.EnumerationIdSortAscending, in.EnumerationIdFetch);
      if (map != null) record.put ("EnumerationId", map);
    return record;
  }
  /** convert Map to EDObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EDObjectKeyData the converted object
   */
  public static EDObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EDObjectKeyData out = new EDObjectKeyData ();

    if ((obj = record.get ("EnumerationId")) != null)
    {
      out.EnumerationId = (Integer) obj;
      out._EnumerationIdSet = true;
    }
  
    return out;
  }
  /** convert Map to EDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EDObjectKeyFilter the converted object
   */
  public static EDObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EDObjectKeyFilter out = new EDObjectKeyFilter ();

    Map EnumerationIdMap = (Map)record.get("EnumerationId");
    Boolean EnumerationIdFetch = DataHelper.getFetch(EnumerationIdMap);
    Boolean EnumerationIdSortDir = DataHelper.getSortDirection(EnumerationIdMap);
    Integer EnumerationIdSortOrder = DataHelper.getSortOrder(EnumerationIdMap);
    if (EnumerationIdFetch != null) out.setEnumerationIdFetch(EnumerationIdFetch);
    if (EnumerationIdSortDir != null) out.setEnumerationIdSortDirection(EnumerationIdSortDir);
    if (EnumerationIdSortOrder != null) out.setEnumerationIdSortOrder(EnumerationIdSortOrder);

    Filter[] EnumerationIdFilter = DataHelper.mapToFilterArray(EnumerationIdMap, Integer.class);
    if (EnumerationIdFilter != null) {
      IntegerFilter[] EnumerationIdFilters = new IntegerFilter[EnumerationIdFilter.length];
      for (int i = 0; i < EnumerationIdFilters.length; i++) {
        EnumerationIdFilters[i] = (IntegerFilter)EnumerationIdFilter[i];
      }
      try {
        out.setEnumerationIdFilter(EnumerationIdFilters);
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
