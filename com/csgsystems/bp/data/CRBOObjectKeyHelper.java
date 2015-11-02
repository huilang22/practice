/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CRBOObjectKeyHelper.java
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

/** Helper class for CRBOObject's Key objects. */
public class CRBOObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CRBOObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CRBOObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CRBOObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CRBOObject")
   * @return Map     the output Map
   */
  public static Map toMap (CRBOObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CRBOObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CRBOObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CRBOObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CRBOObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CRBOObject")
   * @return Map     the output Map
   */
  public static Map toMap (CRBOObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CRBOObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CRBOObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CRBOObjectKeyData the converted object
   */
  public static CRBOObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CRBOObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CRBOObject")
   * @return CRBOObjectKeyData the converted object
   */
  public static CRBOObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CRBOObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CRBOObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CRBOObjectKeyFilter the converted object
   */
  public static CRBOObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CRBOObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CRBOObject")
   * @return CRBOObjectKeyFilter the converted object
   */
  public static CRBOObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CRBOObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CRBOObjectKeyData to a Map (not including the root).
  /** convert CRBOObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CRBOObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._SeqnumSet) record.put ("Seqnum", in.Seqnum);
  
    if (in._RatebandSet) record.put ("Rateband", in.Rateband);
  
    return record;
  }
  /** convert CRBOObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CRBOObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.Seqnum, in.SeqnumSort, in.SeqnumSortAscending, in.SeqnumFetch);
      if (map != null) record.put ("Seqnum", map);
      map = DataHelper.filterToMap (in.Rateband, in.RatebandSort, in.RatebandSortAscending, in.RatebandFetch);
      if (map != null) record.put ("Rateband", map);
    return record;
  }
  /** convert Map to CRBOObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CRBOObjectKeyData the converted object
   */
  public static CRBOObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CRBOObjectKeyData out = new CRBOObjectKeyData ();

    if ((obj = record.get ("Seqnum")) != null)
    {
      out.Seqnum = (Integer) obj;
      out._SeqnumSet = true;
    }
  
    if ((obj = record.get ("Rateband")) != null)
    {
      out.Rateband = (Integer) obj;
      out._RatebandSet = true;
    }
  
    return out;
  }
  /** convert Map to CRBOObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CRBOObjectKeyFilter the converted object
   */
  public static CRBOObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CRBOObjectKeyFilter out = new CRBOObjectKeyFilter ();

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
  
    Map RatebandMap = (Map)record.get("Rateband");
    Boolean RatebandFetch = DataHelper.getFetch(RatebandMap);
    Boolean RatebandSortDir = DataHelper.getSortDirection(RatebandMap);
    Integer RatebandSortOrder = DataHelper.getSortOrder(RatebandMap);
    if (RatebandFetch != null) out.setRatebandFetch(RatebandFetch);
    if (RatebandSortDir != null) out.setRatebandSortDirection(RatebandSortDir);
    if (RatebandSortOrder != null) out.setRatebandSortOrder(RatebandSortOrder);

    Filter[] RatebandFilter = DataHelper.mapToFilterArray(RatebandMap, Integer.class);
    if (RatebandFilter != null) {
      IntegerFilter[] RatebandFilters = new IntegerFilter[RatebandFilter.length];
      for (int i = 0; i < RatebandFilters.length; i++) {
        RatebandFilters[i] = (IntegerFilter)RatebandFilter[i];
      }
      try {
        out.setRatebandFilter(RatebandFilters);
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
