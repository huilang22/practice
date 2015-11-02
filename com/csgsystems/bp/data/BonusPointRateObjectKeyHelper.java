/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BonusPointRateObjectKeyHelper.java
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

/** Helper class for BonusPointRateObject's Key objects. */
public class BonusPointRateObjectKeyHelper implements ArubaObjectHelper
{
  /** convert BonusPointRateObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointRateObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BonusPointRateObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BonusPointRateObject")
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointRateObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BonusPointRateObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert BonusPointRateObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointRateObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BonusPointRateObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BonusPointRateObject")
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointRateObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BonusPointRateObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BonusPointRateObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return BonusPointRateObjectKeyData the converted object
   */
  public static BonusPointRateObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BonusPointRateObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BonusPointRateObject")
   * @return BonusPointRateObjectKeyData the converted object
   */
  public static BonusPointRateObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointRateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BonusPointRateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return BonusPointRateObjectKeyFilter the converted object
   */
  public static BonusPointRateObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BonusPointRateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BonusPointRateObject")
   * @return BonusPointRateObjectKeyFilter the converted object
   */
  public static BonusPointRateObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointRateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert BonusPointRateObjectKeyData to a Map (not including the root).
  /** convert BonusPointRateObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BonusPointRateObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BonusPointIdSet) record.put ("BonusPointId", in.BonusPointId);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    return record;
  }
  /** convert BonusPointRateObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (BonusPointRateObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BonusPointId, in.BonusPointIdSort, in.BonusPointIdSortAscending, in.BonusPointIdFetch);
      if (map != null) record.put ("BonusPointId", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
    return record;
  }
  /** convert Map to BonusPointRateObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BonusPointRateObjectKeyData the converted object
   */
  public static BonusPointRateObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BonusPointRateObjectKeyData out = new BonusPointRateObjectKeyData ();

    if ((obj = record.get ("BonusPointId")) != null)
    {
      out.BonusPointId = (Integer) obj;
      out._BonusPointIdSet = true;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
      out._CurrencyCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to BonusPointRateObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BonusPointRateObjectKeyFilter the converted object
   */
  public static BonusPointRateObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BonusPointRateObjectKeyFilter out = new BonusPointRateObjectKeyFilter ();

    Map BonusPointIdMap = (Map)record.get("BonusPointId");
    Boolean BonusPointIdFetch = DataHelper.getFetch(BonusPointIdMap);
    Boolean BonusPointIdSortDir = DataHelper.getSortDirection(BonusPointIdMap);
    Integer BonusPointIdSortOrder = DataHelper.getSortOrder(BonusPointIdMap);
    if (BonusPointIdFetch != null) out.setBonusPointIdFetch(BonusPointIdFetch);
    if (BonusPointIdSortDir != null) out.setBonusPointIdSortDirection(BonusPointIdSortDir);
    if (BonusPointIdSortOrder != null) out.setBonusPointIdSortOrder(BonusPointIdSortOrder);

    Filter[] BonusPointIdFilter = DataHelper.mapToFilterArray(BonusPointIdMap, Integer.class);
    if (BonusPointIdFilter != null) {
      IntegerFilter[] BonusPointIdFilters = new IntegerFilter[BonusPointIdFilter.length];
      for (int i = 0; i < BonusPointIdFilters.length; i++) {
        BonusPointIdFilters[i] = (IntegerFilter)BonusPointIdFilter[i];
      }
      try {
        out.setBonusPointIdFilter(BonusPointIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, Integer.class);
    if (CurrencyCodeFilter != null) {
      IntegerFilter[] CurrencyCodeFilters = new IntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (IntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
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
