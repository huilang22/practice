/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtCurrCodeMapObjectKeyHelper.java
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

/** Helper class for AxrtCurrCodeMapObject's Key objects. */
public class AxrtCurrCodeMapObjectKeyHelper implements ArubaObjectHelper
{
  /** convert AxrtCurrCodeMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrCodeMapObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtCurrCodeMapObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtCurrCodeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrCodeMapObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtCurrCodeMapObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert AxrtCurrCodeMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrCodeMapObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtCurrCodeMapObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtCurrCodeMapObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtCurrCodeMapObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtCurrCodeMapObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AxrtCurrCodeMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return AxrtCurrCodeMapObjectKeyData the converted object
   */
  public static AxrtCurrCodeMapObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AxrtCurrCodeMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AxrtCurrCodeMapObject")
   * @return AxrtCurrCodeMapObjectKeyData the converted object
   */
  public static AxrtCurrCodeMapObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtCurrCodeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AxrtCurrCodeMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return AxrtCurrCodeMapObjectKeyFilter the converted object
   */
  public static AxrtCurrCodeMapObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AxrtCurrCodeMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AxrtCurrCodeMapObject")
   * @return AxrtCurrCodeMapObjectKeyFilter the converted object
   */
  public static AxrtCurrCodeMapObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtCurrCodeMapObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert AxrtCurrCodeMapObjectKeyData to a Map (not including the root).
  /** convert AxrtCurrCodeMapObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AxrtCurrCodeMapObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._RateCurrencyCodeSet) record.put ("RateCurrencyCode", in.RateCurrencyCode);
  
    return record;
  }
  /** convert AxrtCurrCodeMapObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (AxrtCurrCodeMapObjectKeyFilter in, Map record)
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
  /** convert Map to AxrtCurrCodeMapObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtCurrCodeMapObjectKeyData the converted object
   */
  public static AxrtCurrCodeMapObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtCurrCodeMapObjectKeyData out = new AxrtCurrCodeMapObjectKeyData ();

    if ((obj = record.get ("RateCurrencyCode")) != null)
    {
      out.RateCurrencyCode = (Integer) obj;
      out._RateCurrencyCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to AxrtCurrCodeMapObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtCurrCodeMapObjectKeyFilter the converted object
   */
  public static AxrtCurrCodeMapObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtCurrCodeMapObjectKeyFilter out = new AxrtCurrCodeMapObjectKeyFilter ();

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
