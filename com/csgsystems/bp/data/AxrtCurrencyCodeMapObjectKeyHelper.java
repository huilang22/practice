/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtCurrencyCodeMapObjectKeyHelper.java
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

/** Helper class for AxrtCurrencyCodeMapObject's Key objects. */
public class AxrtCurrencyCodeMapObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AxrtCurrencyCodeMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrencyCodeMapObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtCurrencyCodeMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtCurrencyCodeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrencyCodeMapObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtCurrencyCodeMapObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AxrtCurrencyCodeMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrencyCodeMapObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtCurrencyCodeMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtCurrencyCodeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrencyCodeMapObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtCurrencyCodeMapObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AxrtCurrencyCodeMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AxrtCurrencyCodeMapObjectKeyData the converted object
   */
  public static AxrtCurrencyCodeMapObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AxrtCurrencyCodeMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AxrtCurrencyCodeMapObject")
   * @return AxrtCurrencyCodeMapObjectKeyData the converted object
   */
  public static AxrtCurrencyCodeMapObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtCurrencyCodeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AxrtCurrencyCodeMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AxrtCurrencyCodeMapObjectKeyFilter the converted object
   */
  public static AxrtCurrencyCodeMapObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AxrtCurrencyCodeMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AxrtCurrencyCodeMapObject")
   * @return AxrtCurrencyCodeMapObjectKeyFilter the converted object
   */
  public static AxrtCurrencyCodeMapObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtCurrencyCodeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AxrtCurrencyCodeMapObjectKeyData to a Map (not including the root).
  /** convert AxrtCurrencyCodeMapObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AxrtCurrencyCodeMapObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._RateCurrencyCodeSet) record.put ("RateCurrencyCode", in.RateCurrencyCode);
  
    return record;
  }
  /** convert AxrtCurrencyCodeMapObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AxrtCurrencyCodeMapObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.RateCurrencyCode, in.RateCurrencyCodeSort, in.RateCurrencyCodeSortAscending, in.RateCurrencyCodeFetch);
      if (map != null) record.put ("RateCurrencyCode", map);
    return record;
  }
  /** convert Map to AxrtCurrencyCodeMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtCurrencyCodeMapObjectKeyData the converted object
   */
  public static AxrtCurrencyCodeMapObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtCurrencyCodeMapObjectKeyData out = new AxrtCurrencyCodeMapObjectKeyData ();

    if ((obj = record.get ("RateCurrencyCode")) != null)
    {
      out.RateCurrencyCode = (Integer) obj;
      out._RateCurrencyCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to AxrtCurrencyCodeMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtCurrencyCodeMapObjectKeyFilter the converted object
   */
  public static AxrtCurrencyCodeMapObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtCurrencyCodeMapObjectKeyFilter out = new AxrtCurrencyCodeMapObjectKeyFilter ();

    Map RateCurrencyCodeMap = (Map)record.get("RateCurrencyCode");
    Boolean RateCurrencyCodeFetch = DataHelper.getFetch(RateCurrencyCodeMap);
    Boolean RateCurrencyCodeSortDir = DataHelper.getSortDirection(RateCurrencyCodeMap);
    Integer RateCurrencyCodeSortOrder = DataHelper.getSortOrder(RateCurrencyCodeMap);
    if (RateCurrencyCodeFetch != null) out.setRateCurrencyCodeFetch(RateCurrencyCodeFetch);
    if (RateCurrencyCodeSortDir != null) out.setRateCurrencyCodeSortDirection(RateCurrencyCodeSortDir);
    if (RateCurrencyCodeSortOrder != null) out.setRateCurrencyCodeSortOrder(RateCurrencyCodeSortOrder);

    Filter[] RateCurrencyCodeFilter = DataHelper.mapToFilterArray(RateCurrencyCodeMap, Integer.class);
    if (RateCurrencyCodeFilter != null) {
      IntegerFilter[] RateCurrencyCodeFilters = new IntegerFilter[RateCurrencyCodeFilter.length];
      for (int i = 0; i < RateCurrencyCodeFilters.length; i++) {
        RateCurrencyCodeFilters[i] = (IntegerFilter)RateCurrencyCodeFilter[i];
      }
      try {
        out.setRateCurrencyCodeFilter(RateCurrencyCodeFilters);
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
