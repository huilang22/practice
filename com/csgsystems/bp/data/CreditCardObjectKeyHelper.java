/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CreditCardObjectKeyHelper.java
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

/** Helper class for CreditCardObject's Key objects. */
public class CreditCardObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CreditCardObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CreditCardObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CreditCardObject")
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CreditCardObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CreditCardObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CreditCardObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CreditCardObject")
   * @return Map     the output Map
   */
  public static Map toMap (CreditCardObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CreditCardObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CreditCardObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CreditCardObjectKeyData the converted object
   */
  public static CreditCardObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CreditCardObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CreditCardObject")
   * @return CreditCardObjectKeyData the converted object
   */
  public static CreditCardObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CreditCardObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CreditCardObjectKeyFilter the converted object
   */
  public static CreditCardObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CreditCardObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CreditCardObject")
   * @return CreditCardObjectKeyFilter the converted object
   */
  public static CreditCardObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CreditCardObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CreditCardObjectKeyData to a Map (not including the root).
  /** convert CreditCardObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CreditCardObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
  
    return record;
  }
  /** convert CreditCardObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CreditCardObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch);
      if (map != null) record.put ("ProfileId", map);
    return record;
  }
  /** convert Map to CreditCardObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CreditCardObjectKeyData the converted object
   */
  public static CreditCardObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CreditCardObjectKeyData out = new CreditCardObjectKeyData ();

    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (BigInteger) obj;
      out._ProfileIdSet = true;
    }
  
    return out;
  }
  /** convert Map to CreditCardObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CreditCardObjectKeyFilter the converted object
   */
  public static CreditCardObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CreditCardObjectKeyFilter out = new CreditCardObjectKeyFilter ();

    Map ProfileIdMap = (Map)record.get("ProfileId");
    Boolean ProfileIdFetch = DataHelper.getFetch(ProfileIdMap);
    Boolean ProfileIdSortDir = DataHelper.getSortDirection(ProfileIdMap);
    Integer ProfileIdSortOrder = DataHelper.getSortOrder(ProfileIdMap);
    if (ProfileIdFetch != null) out.setProfileIdFetch(ProfileIdFetch);
    if (ProfileIdSortDir != null) out.setProfileIdSortDirection(ProfileIdSortDir);
    if (ProfileIdSortOrder != null) out.setProfileIdSortOrder(ProfileIdSortOrder);

    Filter[] ProfileIdFilter = DataHelper.mapToFilterArray(ProfileIdMap, BigInteger.class);
    if (ProfileIdFilter != null) {
      BigIntegerFilter[] ProfileIdFilters = new BigIntegerFilter[ProfileIdFilter.length];
      for (int i = 0; i < ProfileIdFilters.length; i++) {
        ProfileIdFilters[i] = (BigIntegerFilter)ProfileIdFilter[i];
      }
      try {
        out.setProfileIdFilter(ProfileIdFilters);
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
