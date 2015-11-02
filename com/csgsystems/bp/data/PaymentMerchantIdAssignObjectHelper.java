/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentMerchantIdAssignObjectHelper.java
 * Definition File: Admin/PaymentMerchantIdAssign.xml
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
import com.csgsystems.api.bulk.*;


import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;



/** Helper class to convert PaymentMerchantIdAssignObject JavaBean objects to/from HashMaps.
 */
public class PaymentMerchantIdAssignObjectHelper implements ArubaObjectHelper
{
  /** convert PaymentMerchantIdAssignObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PaymentMerchantIdAssignObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentMerchantIdAssignObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentMerchantIdAssignObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdAssignObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentMerchantIdAssignObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentMerchantIdAssignObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdAssignObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentMerchantIdAssignObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentMerchantIdAssignObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentMerchantIdAssignObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentMerchantIdAssignObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentMerchantIdAssignObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PaymentMerchantIdAssignObjectData the converted object
   */
  public static PaymentMerchantIdAssignObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentMerchantIdAssignObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentMerchantIdAssignObject")
   * @return PaymentMerchantIdAssignObjectData the converted object
   */
  public static PaymentMerchantIdAssignObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentMerchantIdAssignObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentMerchantIdAssignObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PaymentMerchantIdAssignObjectFilter the converted object
   */
  public static PaymentMerchantIdAssignObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentMerchantIdAssignObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentMerchantIdAssignObject")
   * @return PaymentMerchantIdAssignObjectFilter the converted object
   */
  public static PaymentMerchantIdAssignObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentMerchantIdAssignObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PaymentMerchantIdAssignObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PaymentMerchantIdAssignObjectDataList the converted object
   */
  public static PaymentMerchantIdAssignObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PaymentMerchantIdAssignObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PaymentMerchantIdAssignObjectList")
   * @return PaymentMerchantIdAssignObjectDataList the converted object
   */
  public static PaymentMerchantIdAssignObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentMerchantIdAssignObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PaymentMerchantIdAssignObjectData[] array = null;
    if (root != null)
    {
      array = new PaymentMerchantIdAssignObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PaymentMerchantIdAssignObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PaymentMerchantIdAssignObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PaymentMerchantIdAssignObjectDataList (array, index, total);
  }
  /** convert PaymentMerchantIdAssignObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentMerchantIdAssignObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PaymentMerchantIdAssignObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._IsDefaultMerchantIdSet) record.put ("IsDefaultMerchantId", in.IsDefaultMerchantId);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert PaymentMerchantIdAssignObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentMerchantIdAssignObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PaymentMerchantIdAssignObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.IsDefaultMerchantId, in.IsDefaultMerchantIdSort, in.IsDefaultMerchantIdSortAscending, in.IsDefaultMerchantIdFetch);
      if (map != null) record.put ("IsDefaultMerchantId", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to PaymentMerchantIdAssignObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentMerchantIdAssignObjectData the converted object
   */
  public static PaymentMerchantIdAssignObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentMerchantIdAssignObjectData out = new PaymentMerchantIdAssignObjectData ();

    out.Key = PaymentMerchantIdAssignObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("IsDefaultMerchantId")) != null)
    {
      out.IsDefaultMerchantId = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to PaymentMerchantIdAssignObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentMerchantIdAssignObjectFilter the converted object
   */
  public static PaymentMerchantIdAssignObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentMerchantIdAssignObjectFilter out = new PaymentMerchantIdAssignObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PaymentMerchantIdAssignObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map IsDefaultMerchantIdMap = (Map)record.get("IsDefaultMerchantId");
    Boolean IsDefaultMerchantIdFetch = DataHelper.getFetch(IsDefaultMerchantIdMap);
    Boolean IsDefaultMerchantIdSortDir = DataHelper.getSortDirection(IsDefaultMerchantIdMap);
    Integer IsDefaultMerchantIdSortOrder = DataHelper.getSortOrder(IsDefaultMerchantIdMap);
    if (IsDefaultMerchantIdFetch != null) out.setIsDefaultMerchantIdFetch(IsDefaultMerchantIdFetch);
    if (IsDefaultMerchantIdSortDir != null) out.setIsDefaultMerchantIdSortDirection(IsDefaultMerchantIdSortDir);
    if (IsDefaultMerchantIdSortOrder != null) out.setIsDefaultMerchantIdSortOrder(IsDefaultMerchantIdSortOrder);

    Filter[] IsDefaultMerchantIdFilter = DataHelper.mapToFilterArray(IsDefaultMerchantIdMap, Boolean.class);
    if (IsDefaultMerchantIdFilter != null) {
      BooleanFilter[] IsDefaultMerchantIdFilters = new BooleanFilter[IsDefaultMerchantIdFilter.length];
      for (int i = 0; i < IsDefaultMerchantIdFilters.length; i++) {
        IsDefaultMerchantIdFilters[i] = (BooleanFilter)IsDefaultMerchantIdFilter[i];
      }
      try {
        out.setIsDefaultMerchantIdFilter(IsDefaultMerchantIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ConfigTagIdMap = (Map)record.get("ConfigTagId");
    Boolean ConfigTagIdFetch = DataHelper.getFetch(ConfigTagIdMap);
    Boolean ConfigTagIdSortDir = DataHelper.getSortDirection(ConfigTagIdMap);
    Integer ConfigTagIdSortOrder = DataHelper.getSortOrder(ConfigTagIdMap);
    if (ConfigTagIdFetch != null) out.setConfigTagIdFetch(ConfigTagIdFetch);
    if (ConfigTagIdSortDir != null) out.setConfigTagIdSortDirection(ConfigTagIdSortDir);
    if (ConfigTagIdSortOrder != null) out.setConfigTagIdSortOrder(ConfigTagIdSortOrder);

    Filter[] ConfigTagIdFilter = DataHelper.mapToFilterArray(ConfigTagIdMap, String.class);
    if (ConfigTagIdFilter != null) {
      StringFilter[] ConfigTagIdFilters = new StringFilter[ConfigTagIdFilter.length];
      for (int i = 0; i < ConfigTagIdFilters.length; i++) {
        ConfigTagIdFilters[i] = (StringFilter)ConfigTagIdFilter[i];
      }
      try {
        out.setConfigTagIdFilter(ConfigTagIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
