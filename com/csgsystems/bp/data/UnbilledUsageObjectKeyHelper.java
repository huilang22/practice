/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageObjectKeyHelper.java
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

/** Helper class for UnbilledUsageObject's Key objects. */
public class UnbilledUsageObjectKeyHelper implements ArubaObjectHelper
{
  /** convert UnbilledUsageObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert UnbilledUsageObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to UnbilledUsageObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return UnbilledUsageObjectKeyData the converted object
   */
  public static UnbilledUsageObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to UnbilledUsageObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "UnbilledUsageObject")
   * @return UnbilledUsageObjectKeyData the converted object
   */
  public static UnbilledUsageObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to UnbilledUsageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return UnbilledUsageObjectKeyFilter the converted object
   */
  public static UnbilledUsageObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to UnbilledUsageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "UnbilledUsageObject")
   * @return UnbilledUsageObjectKeyFilter the converted object
   */
  public static UnbilledUsageObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert UnbilledUsageObjectKeyData to a Map (not including the root).
  /** convert UnbilledUsageObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (UnbilledUsageObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._MsgIdSet) record.put ("MsgId", in.MsgId);
  
    if (in._MsgId2Set) record.put ("MsgId2", in.MsgId2);
  
    if (in._MsgIdServSet) record.put ("MsgIdServ", in.MsgIdServ);
  
    if (in._SplitRowNumSet) record.put ("SplitRowNum", in.SplitRowNum);
  
    return record;
  }
  /** convert UnbilledUsageObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (UnbilledUsageObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.MsgId, in.MsgIdSort, in.MsgIdSortAscending, in.MsgIdFetch);
      if (map != null) record.put ("MsgId", map);
      map = DataHelper.filterToMap (in.MsgId2, in.MsgId2Sort, in.MsgId2SortAscending, in.MsgId2Fetch);
      if (map != null) record.put ("MsgId2", map);
      map = DataHelper.filterToMap (in.MsgIdServ, in.MsgIdServSort, in.MsgIdServSortAscending, in.MsgIdServFetch);
      if (map != null) record.put ("MsgIdServ", map);
      map = DataHelper.filterToMap (in.SplitRowNum, in.SplitRowNumSort, in.SplitRowNumSortAscending, in.SplitRowNumFetch);
      if (map != null) record.put ("SplitRowNum", map);
    return record;
  }
  /** convert Map to UnbilledUsageObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageObjectKeyData the converted object
   */
  public static UnbilledUsageObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageObjectKeyData out = new UnbilledUsageObjectKeyData ();

    if ((obj = record.get ("MsgId")) != null)
    {
      out.MsgId = (Integer) obj;
      out._MsgIdSet = true;
    }
  
    if ((obj = record.get ("MsgId2")) != null)
    {
      out.MsgId2 = (Integer) obj;
      out._MsgId2Set = true;
    }
  
    if ((obj = record.get ("MsgIdServ")) != null)
    {
      out.MsgIdServ = (Integer) obj;
      out._MsgIdServSet = true;
    }
  
    if ((obj = record.get ("SplitRowNum")) != null)
    {
      out.SplitRowNum = (Integer) obj;
      out._SplitRowNumSet = true;
    }
  
    return out;
  }
  /** convert Map to UnbilledUsageObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageObjectKeyFilter the converted object
   */
  public static UnbilledUsageObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageObjectKeyFilter out = new UnbilledUsageObjectKeyFilter ();

    Map MsgIdMap = (Map)record.get("MsgId");
    Boolean MsgIdFetch = DataHelper.getFetch(MsgIdMap);
    Boolean MsgIdSortDir = DataHelper.getSortDirection(MsgIdMap);
    Integer MsgIdSortOrder = DataHelper.getSortOrder(MsgIdMap);
    if (MsgIdFetch != null) out.setMsgIdFetch(MsgIdFetch);
    if (MsgIdSortDir != null) out.setMsgIdSortDirection(MsgIdSortDir);
    if (MsgIdSortOrder != null) out.setMsgIdSortOrder(MsgIdSortOrder);

    Filter[] MsgIdFilter = DataHelper.mapToFilterArray(MsgIdMap, Integer.class);
    if (MsgIdFilter != null) {
      IntegerFilter[] MsgIdFilters = new IntegerFilter[MsgIdFilter.length];
      for (int i = 0; i < MsgIdFilters.length; i++) {
        MsgIdFilters[i] = (IntegerFilter)MsgIdFilter[i];
      }
      try {
        out.setMsgIdFilter(MsgIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MsgId2Map = (Map)record.get("MsgId2");
    Boolean MsgId2Fetch = DataHelper.getFetch(MsgId2Map);
    Boolean MsgId2SortDir = DataHelper.getSortDirection(MsgId2Map);
    Integer MsgId2SortOrder = DataHelper.getSortOrder(MsgId2Map);
    if (MsgId2Fetch != null) out.setMsgId2Fetch(MsgId2Fetch);
    if (MsgId2SortDir != null) out.setMsgId2SortDirection(MsgId2SortDir);
    if (MsgId2SortOrder != null) out.setMsgId2SortOrder(MsgId2SortOrder);

    Filter[] MsgId2Filter = DataHelper.mapToFilterArray(MsgId2Map, Integer.class);
    if (MsgId2Filter != null) {
      IntegerFilter[] MsgId2Filters = new IntegerFilter[MsgId2Filter.length];
      for (int i = 0; i < MsgId2Filters.length; i++) {
        MsgId2Filters[i] = (IntegerFilter)MsgId2Filter[i];
      }
      try {
        out.setMsgId2Filter(MsgId2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MsgIdServMap = (Map)record.get("MsgIdServ");
    Boolean MsgIdServFetch = DataHelper.getFetch(MsgIdServMap);
    Boolean MsgIdServSortDir = DataHelper.getSortDirection(MsgIdServMap);
    Integer MsgIdServSortOrder = DataHelper.getSortOrder(MsgIdServMap);
    if (MsgIdServFetch != null) out.setMsgIdServFetch(MsgIdServFetch);
    if (MsgIdServSortDir != null) out.setMsgIdServSortDirection(MsgIdServSortDir);
    if (MsgIdServSortOrder != null) out.setMsgIdServSortOrder(MsgIdServSortOrder);

    Filter[] MsgIdServFilter = DataHelper.mapToFilterArray(MsgIdServMap, Integer.class);
    if (MsgIdServFilter != null) {
      IntegerFilter[] MsgIdServFilters = new IntegerFilter[MsgIdServFilter.length];
      for (int i = 0; i < MsgIdServFilters.length; i++) {
        MsgIdServFilters[i] = (IntegerFilter)MsgIdServFilter[i];
      }
      try {
        out.setMsgIdServFilter(MsgIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SplitRowNumMap = (Map)record.get("SplitRowNum");
    Boolean SplitRowNumFetch = DataHelper.getFetch(SplitRowNumMap);
    Boolean SplitRowNumSortDir = DataHelper.getSortDirection(SplitRowNumMap);
    Integer SplitRowNumSortOrder = DataHelper.getSortOrder(SplitRowNumMap);
    if (SplitRowNumFetch != null) out.setSplitRowNumFetch(SplitRowNumFetch);
    if (SplitRowNumSortDir != null) out.setSplitRowNumSortDirection(SplitRowNumSortDir);
    if (SplitRowNumSortOrder != null) out.setSplitRowNumSortOrder(SplitRowNumSortOrder);

    Filter[] SplitRowNumFilter = DataHelper.mapToFilterArray(SplitRowNumMap, Integer.class);
    if (SplitRowNumFilter != null) {
      IntegerFilter[] SplitRowNumFilters = new IntegerFilter[SplitRowNumFilter.length];
      for (int i = 0; i < SplitRowNumFilters.length; i++) {
        SplitRowNumFilters[i] = (IntegerFilter)SplitRowNumFilter[i];
      }
      try {
        out.setSplitRowNumFilter(SplitRowNumFilters);
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
