/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrAccountSegmentObjectKeyHelper.java
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

/** Helper class for CsrAccountSegmentObject's Key objects. */
public class CsrAccountSegmentObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CsrAccountSegmentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrAccountSegmentObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrAccountSegmentObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrAccountSegmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrAccountSegmentObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrAccountSegmentObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CsrAccountSegmentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrAccountSegmentObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrAccountSegmentObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrAccountSegmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrAccountSegmentObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrAccountSegmentObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CsrAccountSegmentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CsrAccountSegmentObjectKeyData the converted object
   */
  public static CsrAccountSegmentObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CsrAccountSegmentObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CsrAccountSegmentObject")
   * @return CsrAccountSegmentObjectKeyData the converted object
   */
  public static CsrAccountSegmentObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrAccountSegmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CsrAccountSegmentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CsrAccountSegmentObjectKeyFilter the converted object
   */
  public static CsrAccountSegmentObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CsrAccountSegmentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CsrAccountSegmentObject")
   * @return CsrAccountSegmentObjectKeyFilter the converted object
   */
  public static CsrAccountSegmentObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrAccountSegmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CsrAccountSegmentObjectKeyData to a Map (not including the root).
  /** convert CsrAccountSegmentObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CsrAccountSegmentObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CsrNameSet) record.put ("CsrName", in.CsrName);
  
    if (in._AcctSegIdSet) record.put ("AcctSegId", in.AcctSegId);
  
    return record;
  }
  /** convert CsrAccountSegmentObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CsrAccountSegmentObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.CsrName, in.CsrNameSort, in.CsrNameSortAscending, in.CsrNameFetch, in.CsrNameCaseInsensitive);
      if (map != null) record.put ("CsrName", map);
      map = DataHelper.filterToMap (in.AcctSegId, in.AcctSegIdSort, in.AcctSegIdSortAscending, in.AcctSegIdFetch);
      if (map != null) record.put ("AcctSegId", map);
    return record;
  }
  /** convert Map to CsrAccountSegmentObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrAccountSegmentObjectKeyData the converted object
   */
  public static CsrAccountSegmentObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrAccountSegmentObjectKeyData out = new CsrAccountSegmentObjectKeyData ();

    if ((obj = record.get ("CsrName")) != null)
    {
      out.CsrName = (String) obj;
      out._CsrNameSet = true;
    }
  
    if ((obj = record.get ("AcctSegId")) != null)
    {
      out.AcctSegId = (Integer) obj;
      out._AcctSegIdSet = true;
    }
  
    return out;
  }
  /** convert Map to CsrAccountSegmentObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrAccountSegmentObjectKeyFilter the converted object
   */
  public static CsrAccountSegmentObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrAccountSegmentObjectKeyFilter out = new CsrAccountSegmentObjectKeyFilter ();

    Map CsrNameMap = (Map)record.get("CsrName");
    Boolean CsrNameFetch = DataHelper.getFetch(CsrNameMap);
    Boolean CsrNameSortDir = DataHelper.getSortDirection(CsrNameMap);
    Integer CsrNameSortOrder = DataHelper.getSortOrder(CsrNameMap);
    if (CsrNameFetch != null) out.setCsrNameFetch(CsrNameFetch);
    if (CsrNameSortDir != null) out.setCsrNameSortDirection(CsrNameSortDir);
    if (CsrNameSortOrder != null) out.setCsrNameSortOrder(CsrNameSortOrder);

    Filter[] CsrNameFilter = DataHelper.mapToFilterArray(CsrNameMap, String.class);
    if (CsrNameFilter != null) {
      StringFilter[] CsrNameFilters = new StringFilter[CsrNameFilter.length];
      for (int i = 0; i < CsrNameFilters.length; i++) {
        CsrNameFilters[i] = (StringFilter)CsrNameFilter[i];
      }
      try {
        out.setCsrNameFilter(CsrNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AcctSegIdMap = (Map)record.get("AcctSegId");
    Boolean AcctSegIdFetch = DataHelper.getFetch(AcctSegIdMap);
    Boolean AcctSegIdSortDir = DataHelper.getSortDirection(AcctSegIdMap);
    Integer AcctSegIdSortOrder = DataHelper.getSortOrder(AcctSegIdMap);
    if (AcctSegIdFetch != null) out.setAcctSegIdFetch(AcctSegIdFetch);
    if (AcctSegIdSortDir != null) out.setAcctSegIdSortDirection(AcctSegIdSortDir);
    if (AcctSegIdSortOrder != null) out.setAcctSegIdSortOrder(AcctSegIdSortOrder);

    Filter[] AcctSegIdFilter = DataHelper.mapToFilterArray(AcctSegIdMap, Integer.class);
    if (AcctSegIdFilter != null) {
      IntegerFilter[] AcctSegIdFilters = new IntegerFilter[AcctSegIdFilter.length];
      for (int i = 0; i < AcctSegIdFilters.length; i++) {
        AcctSegIdFilters[i] = (IntegerFilter)AcctSegIdFilter[i];
      }
      try {
        out.setAcctSegIdFilter(AcctSegIdFilters);
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
