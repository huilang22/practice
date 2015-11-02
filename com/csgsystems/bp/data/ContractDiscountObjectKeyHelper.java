/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContractDiscountObjectKeyHelper.java
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

/** Helper class for ContractDiscountObject's Key objects. */
public class ContractDiscountObjectKeyHelper implements ArubaObjectHelper
{
  /** convert ContractDiscountObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ContractDiscountObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContractDiscountObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContractDiscountObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContractDiscountObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContractDiscountObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert ContractDiscountObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ContractDiscountObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContractDiscountObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContractDiscountObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContractDiscountObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContractDiscountObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ContractDiscountObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return ContractDiscountObjectKeyData the converted object
   */
  public static ContractDiscountObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ContractDiscountObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ContractDiscountObject")
   * @return ContractDiscountObjectKeyData the converted object
   */
  public static ContractDiscountObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ContractDiscountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ContractDiscountObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return ContractDiscountObjectKeyFilter the converted object
   */
  public static ContractDiscountObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ContractDiscountObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ContractDiscountObject")
   * @return ContractDiscountObjectKeyFilter the converted object
   */
  public static ContractDiscountObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ContractDiscountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert ContractDiscountObjectKeyData to a Map (not including the root).
  /** convert ContractDiscountObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ContractDiscountObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._DiscountIdSet) record.put ("DiscountId", in.DiscountId);
  
    if (in._ContractTypeSet) record.put ("ContractType", in.ContractType);
  
    return record;
  }
  /** convert ContractDiscountObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (ContractDiscountObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.DiscountId, in.DiscountIdSort, in.DiscountIdSortAscending, in.DiscountIdFetch);
      if (map != null) record.put ("DiscountId", map);
      map = DataHelper.filterToMap (in.ContractType, in.ContractTypeSort, in.ContractTypeSortAscending, in.ContractTypeFetch);
      if (map != null) record.put ("ContractType", map);
    return record;
  }
  /** convert Map to ContractDiscountObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContractDiscountObjectKeyData the converted object
   */
  public static ContractDiscountObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContractDiscountObjectKeyData out = new ContractDiscountObjectKeyData ();

    if ((obj = record.get ("DiscountId")) != null)
    {
      out.DiscountId = (Integer) obj;
      out._DiscountIdSet = true;
    }
  
    if ((obj = record.get ("ContractType")) != null)
    {
      out.ContractType = (Integer) obj;
      out._ContractTypeSet = true;
    }
  
    return out;
  }
  /** convert Map to ContractDiscountObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContractDiscountObjectKeyFilter the converted object
   */
  public static ContractDiscountObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContractDiscountObjectKeyFilter out = new ContractDiscountObjectKeyFilter ();

    Map DiscountIdMap = (Map)record.get("DiscountId");
    Boolean DiscountIdFetch = DataHelper.getFetch(DiscountIdMap);
    Boolean DiscountIdSortDir = DataHelper.getSortDirection(DiscountIdMap);
    Integer DiscountIdSortOrder = DataHelper.getSortOrder(DiscountIdMap);
    if (DiscountIdFetch != null) out.setDiscountIdFetch(DiscountIdFetch);
    if (DiscountIdSortDir != null) out.setDiscountIdSortDirection(DiscountIdSortDir);
    if (DiscountIdSortOrder != null) out.setDiscountIdSortOrder(DiscountIdSortOrder);

    Filter[] DiscountIdFilter = DataHelper.mapToFilterArray(DiscountIdMap, Integer.class);
    if (DiscountIdFilter != null) {
      IntegerFilter[] DiscountIdFilters = new IntegerFilter[DiscountIdFilter.length];
      for (int i = 0; i < DiscountIdFilters.length; i++) {
        DiscountIdFilters[i] = (IntegerFilter)DiscountIdFilter[i];
      }
      try {
        out.setDiscountIdFilter(DiscountIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ContractTypeMap = (Map)record.get("ContractType");
    Boolean ContractTypeFetch = DataHelper.getFetch(ContractTypeMap);
    Boolean ContractTypeSortDir = DataHelper.getSortDirection(ContractTypeMap);
    Integer ContractTypeSortOrder = DataHelper.getSortOrder(ContractTypeMap);
    if (ContractTypeFetch != null) out.setContractTypeFetch(ContractTypeFetch);
    if (ContractTypeSortDir != null) out.setContractTypeSortDirection(ContractTypeSortDir);
    if (ContractTypeSortOrder != null) out.setContractTypeSortOrder(ContractTypeSortOrder);

    Filter[] ContractTypeFilter = DataHelper.mapToFilterArray(ContractTypeMap, Integer.class);
    if (ContractTypeFilter != null) {
      IntegerFilter[] ContractTypeFilters = new IntegerFilter[ContractTypeFilter.length];
      for (int i = 0; i < ContractTypeFilters.length; i++) {
        ContractTypeFilters[i] = (IntegerFilter)ContractTypeFilter[i];
      }
      try {
        out.setContractTypeFilter(ContractTypeFilters);
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
