/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CROObjectKeyHelper.java
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

/** Helper class for CROObject's Key objects. */
public class CROObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CROObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CROObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CROObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CROObject")
   * @return Map     the output Map
   */
  public static Map toMap (CROObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CROObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CROObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CROObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CROObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CROObject")
   * @return Map     the output Map
   */
  public static Map toMap (CROObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CROObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CROObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CROObjectKeyData the converted object
   */
  public static CROObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CROObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CROObject")
   * @return CROObjectKeyData the converted object
   */
  public static CROObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CROObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CROObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CROObjectKeyFilter the converted object
   */
  public static CROObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CROObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CROObject")
   * @return CROObjectKeyFilter the converted object
   */
  public static CROObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CROObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CROObjectKeyData to a Map (not including the root).
  /** convert CROObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CROObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._SeqnumSet) record.put ("Seqnum", in.Seqnum);
  
    return record;
  }
  /** convert CROObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CROObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.Seqnum, in.SeqnumSort, in.SeqnumSortAscending, in.SeqnumFetch);
      if (map != null) record.put ("Seqnum", map);
    return record;
  }
  /** convert Map to CROObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CROObjectKeyData the converted object
   */
  public static CROObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CROObjectKeyData out = new CROObjectKeyData ();

    if ((obj = record.get ("Seqnum")) != null)
    {
      out.Seqnum = (Integer) obj;
      out._SeqnumSet = true;
    }
  
    return out;
  }
  /** convert Map to CROObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CROObjectKeyFilter the converted object
   */
  public static CROObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CROObjectKeyFilter out = new CROObjectKeyFilter ();

    Map SeqnumMap = (Map)record.get("Seqnum");
    Boolean SeqnumFetch = DataHelper.getFetch(SeqnumMap);
    Boolean SeqnumSortDir = DataHelper.getSortDirection(SeqnumMap);
    Integer SeqnumSortOrder = DataHelper.getSortOrder(SeqnumMap);
    if (SeqnumFetch != null) out.setSeqnumFetch(SeqnumFetch);
    if (SeqnumSortDir != null) out.setSeqnumSortDirection(SeqnumSortDir);
    if (SeqnumSortOrder != null) out.setSeqnumSortOrder(SeqnumSortOrder);

    Filter[] SeqnumFilter = DataHelper.mapToFilterArray(SeqnumMap, Integer.class);
    if (SeqnumFilter != null) {
      IntegerFilter[] SeqnumFilters = new IntegerFilter[SeqnumFilter.length];
      for (int i = 0; i < SeqnumFilters.length; i++) {
        SeqnumFilters[i] = (IntegerFilter)SeqnumFilter[i];
      }
      try {
        out.setSeqnumFilter(SeqnumFilters);
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
