/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityRoleObjectKeyHelper.java
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

/** Helper class for SecurityRoleObject's Key objects. */
public class SecurityRoleObjectKeyHelper implements ArubaObjectHelper
{
  /** convert SecurityRoleObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityRoleObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityRoleObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityRoleObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityRoleObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityRoleObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert SecurityRoleObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SecurityRoleObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SecurityRoleObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SecurityRoleObject")
   * @return Map     the output Map
   */
  public static Map toMap (SecurityRoleObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SecurityRoleObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SecurityRoleObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return SecurityRoleObjectKeyData the converted object
   */
  public static SecurityRoleObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SecurityRoleObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SecurityRoleObject")
   * @return SecurityRoleObjectKeyData the converted object
   */
  public static SecurityRoleObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityRoleObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SecurityRoleObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return SecurityRoleObjectKeyFilter the converted object
   */
  public static SecurityRoleObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SecurityRoleObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SecurityRoleObject")
   * @return SecurityRoleObjectKeyFilter the converted object
   */
  public static SecurityRoleObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SecurityRoleObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert SecurityRoleObjectKeyData to a Map (not including the root).
  /** convert SecurityRoleObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SecurityRoleObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._FrvRoleIdSet) record.put ("FrvRoleId", in.FrvRoleId);
  
    if (in._FrvLanguageCodeSet) record.put ("FrvLanguageCode", in.FrvLanguageCode);
  
    return record;
  }
  /** convert SecurityRoleObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (SecurityRoleObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.FrvRoleId, in.FrvRoleIdSort, in.FrvRoleIdSortAscending, in.FrvRoleIdFetch);
      if (map != null) record.put ("FrvRoleId", map);
      map = DataHelper.filterToMap (in.FrvLanguageCode, in.FrvLanguageCodeSort, in.FrvLanguageCodeSortAscending, in.FrvLanguageCodeFetch);
      if (map != null) record.put ("FrvLanguageCode", map);
    return record;
  }
  /** convert Map to SecurityRoleObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityRoleObjectKeyData the converted object
   */
  public static SecurityRoleObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityRoleObjectKeyData out = new SecurityRoleObjectKeyData ();

    if ((obj = record.get ("FrvRoleId")) != null)
    {
      out.FrvRoleId = (BigInteger) obj;
      out._FrvRoleIdSet = true;
    }
  
    if ((obj = record.get ("FrvLanguageCode")) != null)
    {
      out.FrvLanguageCode = (Integer) obj;
      out._FrvLanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to SecurityRoleObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SecurityRoleObjectKeyFilter the converted object
   */
  public static SecurityRoleObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SecurityRoleObjectKeyFilter out = new SecurityRoleObjectKeyFilter ();

    Map FrvRoleIdMap = (Map)record.get("FrvRoleId");
    Boolean FrvRoleIdFetch = DataHelper.getFetch(FrvRoleIdMap);
    Boolean FrvRoleIdSortDir = DataHelper.getSortDirection(FrvRoleIdMap);
    Integer FrvRoleIdSortOrder = DataHelper.getSortOrder(FrvRoleIdMap);
    if (FrvRoleIdFetch != null) out.setFrvRoleIdFetch(FrvRoleIdFetch);
    if (FrvRoleIdSortDir != null) out.setFrvRoleIdSortDirection(FrvRoleIdSortDir);
    if (FrvRoleIdSortOrder != null) out.setFrvRoleIdSortOrder(FrvRoleIdSortOrder);

    Filter[] FrvRoleIdFilter = DataHelper.mapToFilterArray(FrvRoleIdMap, BigInteger.class);
    if (FrvRoleIdFilter != null) {
      BigIntegerFilter[] FrvRoleIdFilters = new BigIntegerFilter[FrvRoleIdFilter.length];
      for (int i = 0; i < FrvRoleIdFilters.length; i++) {
        FrvRoleIdFilters[i] = (BigIntegerFilter)FrvRoleIdFilter[i];
      }
      try {
        out.setFrvRoleIdFilter(FrvRoleIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FrvLanguageCodeMap = (Map)record.get("FrvLanguageCode");
    Boolean FrvLanguageCodeFetch = DataHelper.getFetch(FrvLanguageCodeMap);
    Boolean FrvLanguageCodeSortDir = DataHelper.getSortDirection(FrvLanguageCodeMap);
    Integer FrvLanguageCodeSortOrder = DataHelper.getSortOrder(FrvLanguageCodeMap);
    if (FrvLanguageCodeFetch != null) out.setFrvLanguageCodeFetch(FrvLanguageCodeFetch);
    if (FrvLanguageCodeSortDir != null) out.setFrvLanguageCodeSortDirection(FrvLanguageCodeSortDir);
    if (FrvLanguageCodeSortOrder != null) out.setFrvLanguageCodeSortOrder(FrvLanguageCodeSortOrder);

    Filter[] FrvLanguageCodeFilter = DataHelper.mapToFilterArray(FrvLanguageCodeMap, Integer.class);
    if (FrvLanguageCodeFilter != null) {
      IntegerFilter[] FrvLanguageCodeFilters = new IntegerFilter[FrvLanguageCodeFilter.length];
      for (int i = 0; i < FrvLanguageCodeFilters.length; i++) {
        FrvLanguageCodeFilters[i] = (IntegerFilter)FrvLanguageCodeFilter[i];
      }
      try {
        out.setFrvLanguageCodeFilter(FrvLanguageCodeFilters);
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
