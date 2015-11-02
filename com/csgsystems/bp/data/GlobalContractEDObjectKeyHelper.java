/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalContractEDObjectKeyHelper.java
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

/** Helper class for GlobalContractEDObject's Key objects. */
public class GlobalContractEDObjectKeyHelper implements ArubaObjectHelper
{
  /** convert GlobalContractEDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractEDObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalContractEDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalContractEDObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractEDObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalContractEDObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert GlobalContractEDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractEDObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalContractEDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalContractEDObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractEDObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalContractEDObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GlobalContractEDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return GlobalContractEDObjectKeyData the converted object
   */
  public static GlobalContractEDObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GlobalContractEDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GlobalContractEDObject")
   * @return GlobalContractEDObjectKeyData the converted object
   */
  public static GlobalContractEDObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalContractEDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GlobalContractEDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return GlobalContractEDObjectKeyFilter the converted object
   */
  public static GlobalContractEDObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GlobalContractEDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GlobalContractEDObject")
   * @return GlobalContractEDObjectKeyFilter the converted object
   */
  public static GlobalContractEDObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalContractEDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert GlobalContractEDObjectKeyData to a Map (not including the root).
  /** convert GlobalContractEDObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GlobalContractEDObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ViewIdSet) record.put ("ViewId", in.ViewId);
  
    if (in._ParamIdSet) record.put ("ParamId", in.ParamId);
  
    return record;
  }
  /** convert GlobalContractEDObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GlobalContractEDObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ViewId, in.ViewIdSort, in.ViewIdSortAscending, in.ViewIdFetch);
      if (map != null) record.put ("ViewId", map);
      map = DataHelper.filterToMap (in.ParamId, in.ParamIdSort, in.ParamIdSortAscending, in.ParamIdFetch);
      if (map != null) record.put ("ParamId", map);
    return record;
  }
  /** convert Map to GlobalContractEDObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalContractEDObjectKeyData the converted object
   */
  public static GlobalContractEDObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalContractEDObjectKeyData out = new GlobalContractEDObjectKeyData ();

    if ((obj = record.get ("ViewId")) != null)
    {
      out.ViewId = (BigInteger) obj;
      out._ViewIdSet = true;
    }
  
    if ((obj = record.get ("ParamId")) != null)
    {
      out.ParamId = (Integer) obj;
      out._ParamIdSet = true;
    }
  
    return out;
  }
  /** convert Map to GlobalContractEDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalContractEDObjectKeyFilter the converted object
   */
  public static GlobalContractEDObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalContractEDObjectKeyFilter out = new GlobalContractEDObjectKeyFilter ();

    Map ViewIdMap = (Map)record.get("ViewId");
    Boolean ViewIdFetch = DataHelper.getFetch(ViewIdMap);
    Boolean ViewIdSortDir = DataHelper.getSortDirection(ViewIdMap);
    Integer ViewIdSortOrder = DataHelper.getSortOrder(ViewIdMap);
    if (ViewIdFetch != null) out.setViewIdFetch(ViewIdFetch);
    if (ViewIdSortDir != null) out.setViewIdSortDirection(ViewIdSortDir);
    if (ViewIdSortOrder != null) out.setViewIdSortOrder(ViewIdSortOrder);

    Filter[] ViewIdFilter = DataHelper.mapToFilterArray(ViewIdMap, BigInteger.class);
    if (ViewIdFilter != null) {
      BigIntegerFilter[] ViewIdFilters = new BigIntegerFilter[ViewIdFilter.length];
      for (int i = 0; i < ViewIdFilters.length; i++) {
        ViewIdFilters[i] = (BigIntegerFilter)ViewIdFilter[i];
      }
      try {
        out.setViewIdFilter(ViewIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParamIdMap = (Map)record.get("ParamId");
    Boolean ParamIdFetch = DataHelper.getFetch(ParamIdMap);
    Boolean ParamIdSortDir = DataHelper.getSortDirection(ParamIdMap);
    Integer ParamIdSortOrder = DataHelper.getSortOrder(ParamIdMap);
    if (ParamIdFetch != null) out.setParamIdFetch(ParamIdFetch);
    if (ParamIdSortDir != null) out.setParamIdSortDirection(ParamIdSortDir);
    if (ParamIdSortOrder != null) out.setParamIdSortOrder(ParamIdSortOrder);

    Filter[] ParamIdFilter = DataHelper.mapToFilterArray(ParamIdMap, Integer.class);
    if (ParamIdFilter != null) {
      IntegerFilter[] ParamIdFilters = new IntegerFilter[ParamIdFilter.length];
      for (int i = 0; i < ParamIdFilters.length; i++) {
        ParamIdFilters[i] = (IntegerFilter)ParamIdFilter[i];
      }
      try {
        out.setParamIdFilter(ParamIdFilters);
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
