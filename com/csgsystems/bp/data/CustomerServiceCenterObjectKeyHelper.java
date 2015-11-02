/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerServiceCenterObjectKeyHelper.java
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

/** Helper class for CustomerServiceCenterObject's Key objects. */
public class CustomerServiceCenterObjectKeyHelper implements ArubaObjectHelper
{
  /** convert CustomerServiceCenterObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerServiceCenterObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerServiceCenterObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerServiceCenterObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerServiceCenterObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerServiceCenterObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert CustomerServiceCenterObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerServiceCenterObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerServiceCenterObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerServiceCenterObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerServiceCenterObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerServiceCenterObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CustomerServiceCenterObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return CustomerServiceCenterObjectKeyData the converted object
   */
  public static CustomerServiceCenterObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CustomerServiceCenterObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CustomerServiceCenterObject")
   * @return CustomerServiceCenterObjectKeyData the converted object
   */
  public static CustomerServiceCenterObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerServiceCenterObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CustomerServiceCenterObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return CustomerServiceCenterObjectKeyFilter the converted object
   */
  public static CustomerServiceCenterObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CustomerServiceCenterObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CustomerServiceCenterObject")
   * @return CustomerServiceCenterObjectKeyFilter the converted object
   */
  public static CustomerServiceCenterObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerServiceCenterObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert CustomerServiceCenterObjectKeyData to a Map (not including the root).
  /** convert CustomerServiceCenterObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CustomerServiceCenterObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ServiceCenterTypeSet) record.put ("ServiceCenterType", in.ServiceCenterType);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    return record;
  }
  /** convert CustomerServiceCenterObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (CustomerServiceCenterObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ServiceCenterType, in.ServiceCenterTypeSort, in.ServiceCenterTypeSortAscending, in.ServiceCenterTypeFetch);
      if (map != null) record.put ("ServiceCenterType", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
    return record;
  }
  /** convert Map to CustomerServiceCenterObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerServiceCenterObjectKeyData the converted object
   */
  public static CustomerServiceCenterObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerServiceCenterObjectKeyData out = new CustomerServiceCenterObjectKeyData ();

    if ((obj = record.get ("ServiceCenterType")) != null)
    {
      out.ServiceCenterType = (Integer) obj;
      out._ServiceCenterTypeSet = true;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
      out._AccountInternalIdSet = true;
    }
  
    return out;
  }
  /** convert Map to CustomerServiceCenterObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerServiceCenterObjectKeyFilter the converted object
   */
  public static CustomerServiceCenterObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerServiceCenterObjectKeyFilter out = new CustomerServiceCenterObjectKeyFilter ();

    Map ServiceCenterTypeMap = (Map)record.get("ServiceCenterType");
    Boolean ServiceCenterTypeFetch = DataHelper.getFetch(ServiceCenterTypeMap);
    Boolean ServiceCenterTypeSortDir = DataHelper.getSortDirection(ServiceCenterTypeMap);
    Integer ServiceCenterTypeSortOrder = DataHelper.getSortOrder(ServiceCenterTypeMap);
    if (ServiceCenterTypeFetch != null) out.setServiceCenterTypeFetch(ServiceCenterTypeFetch);
    if (ServiceCenterTypeSortDir != null) out.setServiceCenterTypeSortDirection(ServiceCenterTypeSortDir);
    if (ServiceCenterTypeSortOrder != null) out.setServiceCenterTypeSortOrder(ServiceCenterTypeSortOrder);

    Filter[] ServiceCenterTypeFilter = DataHelper.mapToFilterArray(ServiceCenterTypeMap, Integer.class);
    if (ServiceCenterTypeFilter != null) {
      IntegerFilter[] ServiceCenterTypeFilters = new IntegerFilter[ServiceCenterTypeFilter.length];
      for (int i = 0; i < ServiceCenterTypeFilters.length; i++) {
        ServiceCenterTypeFilters[i] = (IntegerFilter)ServiceCenterTypeFilter[i];
      }
      try {
        out.setServiceCenterTypeFilter(ServiceCenterTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountInternalIdMap = (Map)record.get("AccountInternalId");
    Boolean AccountInternalIdFetch = DataHelper.getFetch(AccountInternalIdMap);
    Boolean AccountInternalIdSortDir = DataHelper.getSortDirection(AccountInternalIdMap);
    Integer AccountInternalIdSortOrder = DataHelper.getSortOrder(AccountInternalIdMap);
    if (AccountInternalIdFetch != null) out.setAccountInternalIdFetch(AccountInternalIdFetch);
    if (AccountInternalIdSortDir != null) out.setAccountInternalIdSortDirection(AccountInternalIdSortDir);
    if (AccountInternalIdSortOrder != null) out.setAccountInternalIdSortOrder(AccountInternalIdSortOrder);

    Filter[] AccountInternalIdFilter = DataHelper.mapToFilterArray(AccountInternalIdMap, Integer.class);
    if (AccountInternalIdFilter != null) {
      IntegerFilter[] AccountInternalIdFilters = new IntegerFilter[AccountInternalIdFilter.length];
      for (int i = 0; i < AccountInternalIdFilters.length; i++) {
        AccountInternalIdFilters[i] = (IntegerFilter)AccountInternalIdFilter[i];
      }
      try {
        out.setAccountInternalIdFilter(AccountInternalIdFilters);
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
