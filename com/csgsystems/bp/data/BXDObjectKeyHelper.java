/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BXDObjectKeyHelper.java
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

/** Helper class for BXDObject's Key objects. */
public class BXDObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BXDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BXDObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BXDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BXDObject")
   * @return Map     the output Map
   */
  public static Map toMap (BXDObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BXDObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BXDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BXDObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BXDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BXDObject")
   * @return Map     the output Map
   */
  public static Map toMap (BXDObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BXDObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BXDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BXDObjectKeyData the converted object
   */
  public static BXDObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BXDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BXDObject")
   * @return BXDObjectKeyData the converted object
   */
  public static BXDObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BXDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BXDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BXDObjectKeyFilter the converted object
   */
  public static BXDObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BXDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BXDObject")
   * @return BXDObjectKeyFilter the converted object
   */
  public static BXDObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BXDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BXDObjectKeyData to a Map (not including the root).
  /** convert BXDObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BXDObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BalanceXferDiffSet) record.put ("BalanceXferDiff", in.BalanceXferDiff);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert BXDObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BXDObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BalanceXferDiff, in.BalanceXferDiffSort, in.BalanceXferDiffSortAscending, in.BalanceXferDiffFetch);
      if (map != null) record.put ("BalanceXferDiff", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to BXDObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BXDObjectKeyData the converted object
   */
  public static BXDObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BXDObjectKeyData out = new BXDObjectKeyData ();

    if ((obj = record.get ("BalanceXferDiff")) != null)
    {
      out.BalanceXferDiff = (Integer) obj;
      out._BalanceXferDiffSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to BXDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BXDObjectKeyFilter the converted object
   */
  public static BXDObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BXDObjectKeyFilter out = new BXDObjectKeyFilter ();

    Map BalanceXferDiffMap = (Map)record.get("BalanceXferDiff");
    Boolean BalanceXferDiffFetch = DataHelper.getFetch(BalanceXferDiffMap);
    Boolean BalanceXferDiffSortDir = DataHelper.getSortDirection(BalanceXferDiffMap);
    Integer BalanceXferDiffSortOrder = DataHelper.getSortOrder(BalanceXferDiffMap);
    if (BalanceXferDiffFetch != null) out.setBalanceXferDiffFetch(BalanceXferDiffFetch);
    if (BalanceXferDiffSortDir != null) out.setBalanceXferDiffSortDirection(BalanceXferDiffSortDir);
    if (BalanceXferDiffSortOrder != null) out.setBalanceXferDiffSortOrder(BalanceXferDiffSortOrder);

    Filter[] BalanceXferDiffFilter = DataHelper.mapToFilterArray(BalanceXferDiffMap, Integer.class);
    if (BalanceXferDiffFilter != null) {
      IntegerFilter[] BalanceXferDiffFilters = new IntegerFilter[BalanceXferDiffFilter.length];
      for (int i = 0; i < BalanceXferDiffFilters.length; i++) {
        BalanceXferDiffFilters[i] = (IntegerFilter)BalanceXferDiffFilter[i];
      }
      try {
        out.setBalanceXferDiffFilter(BalanceXferDiffFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, Integer.class);
    if (LanguageCodeFilter != null) {
      IntegerFilter[] LanguageCodeFilters = new IntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (IntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
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
