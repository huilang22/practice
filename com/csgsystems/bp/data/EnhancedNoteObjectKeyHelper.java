/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EnhancedNoteObjectKeyHelper.java
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

/** Helper class for EnhancedNoteObject's Key objects. */
public class EnhancedNoteObjectKeyHelper implements ArubaObjectHelper
{
  /** convert EnhancedNoteObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EnhancedNoteObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EnhancedNoteObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EnhancedNoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (EnhancedNoteObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EnhancedNoteObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert EnhancedNoteObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EnhancedNoteObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EnhancedNoteObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EnhancedNoteObject")
   * @return Map     the output Map
   */
  public static Map toMap (EnhancedNoteObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EnhancedNoteObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EnhancedNoteObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return EnhancedNoteObjectKeyData the converted object
   */
  public static EnhancedNoteObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EnhancedNoteObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EnhancedNoteObject")
   * @return EnhancedNoteObjectKeyData the converted object
   */
  public static EnhancedNoteObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EnhancedNoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EnhancedNoteObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return EnhancedNoteObjectKeyFilter the converted object
   */
  public static EnhancedNoteObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EnhancedNoteObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EnhancedNoteObject")
   * @return EnhancedNoteObjectKeyFilter the converted object
   */
  public static EnhancedNoteObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EnhancedNoteObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert EnhancedNoteObjectKeyData to a Map (not including the root).
  /** convert EnhancedNoteObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (EnhancedNoteObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._NoteIdSet) record.put ("NoteId", in.NoteId);
  
    return record;
  }
  /** convert EnhancedNoteObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (EnhancedNoteObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.NoteId, in.NoteIdSort, in.NoteIdSortAscending, in.NoteIdFetch);
      if (map != null) record.put ("NoteId", map);
    return record;
  }
  /** convert Map to EnhancedNoteObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EnhancedNoteObjectKeyData the converted object
   */
  public static EnhancedNoteObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EnhancedNoteObjectKeyData out = new EnhancedNoteObjectKeyData ();

    if ((obj = record.get ("NoteId")) != null)
    {
      out.NoteId = (BigInteger) obj;
      out._NoteIdSet = true;
    }
  
    return out;
  }
  /** convert Map to EnhancedNoteObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EnhancedNoteObjectKeyFilter the converted object
   */
  public static EnhancedNoteObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EnhancedNoteObjectKeyFilter out = new EnhancedNoteObjectKeyFilter ();

    Map NoteIdMap = (Map)record.get("NoteId");
    Boolean NoteIdFetch = DataHelper.getFetch(NoteIdMap);
    Boolean NoteIdSortDir = DataHelper.getSortDirection(NoteIdMap);
    Integer NoteIdSortOrder = DataHelper.getSortOrder(NoteIdMap);
    if (NoteIdFetch != null) out.setNoteIdFetch(NoteIdFetch);
    if (NoteIdSortDir != null) out.setNoteIdSortDirection(NoteIdSortDir);
    if (NoteIdSortOrder != null) out.setNoteIdSortOrder(NoteIdSortOrder);

    Filter[] NoteIdFilter = DataHelper.mapToFilterArray(NoteIdMap, BigInteger.class);
    if (NoteIdFilter != null) {
      BigIntegerFilter[] NoteIdFilters = new BigIntegerFilter[NoteIdFilter.length];
      for (int i = 0; i < NoteIdFilters.length; i++) {
        NoteIdFilters[i] = (BigIntegerFilter)NoteIdFilter[i];
      }
      try {
        out.setNoteIdFilter(NoteIdFilters);
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
