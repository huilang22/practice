/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerServiceCenterObjectHelper.java
 * Definition File: Customer/CustomerServiceCenter.xml
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



/** Helper class to convert CustomerServiceCenterObject JavaBean objects to/from HashMaps.
 */
public class CustomerServiceCenterObjectHelper implements ArubaObjectHelper
{
  /** convert CustomerServiceCenterObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CustomerServiceCenterObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerServiceCenterObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerServiceCenterObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerServiceCenterObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerServiceCenterObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CustomerServiceCenterObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerServiceCenterObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerServiceCenterObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerServiceCenterObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerServiceCenterObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerServiceCenterObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CustomerServiceCenterObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CustomerServiceCenterObjectData the converted object
   */
  public static CustomerServiceCenterObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CustomerServiceCenterObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CustomerServiceCenterObject")
   * @return CustomerServiceCenterObjectData the converted object
   */
  public static CustomerServiceCenterObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerServiceCenterObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CustomerServiceCenterObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CustomerServiceCenterObjectFilter the converted object
   */
  public static CustomerServiceCenterObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CustomerServiceCenterObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CustomerServiceCenterObject")
   * @return CustomerServiceCenterObjectFilter the converted object
   */
  public static CustomerServiceCenterObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerServiceCenterObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CustomerServiceCenterObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CustomerServiceCenterObjectDataList the converted object
   */
  public static CustomerServiceCenterObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CustomerServiceCenterObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CustomerServiceCenterObjectList")
   * @return CustomerServiceCenterObjectDataList the converted object
   */
  public static CustomerServiceCenterObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerServiceCenterObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CustomerServiceCenterObjectData[] array = null;
    if (root != null)
    {
      array = new CustomerServiceCenterObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CustomerServiceCenterObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CustomerServiceCenterObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CustomerServiceCenterObjectDataList (array, index, total);
  }
  /** convert CustomerServiceCenterObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerServiceCenterObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CustomerServiceCenterObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ServiceCenterIdSet) record.put ("ServiceCenterId", in.ServiceCenterId);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
      return record;
  }
  /** convert CustomerServiceCenterObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerServiceCenterObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CustomerServiceCenterObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ServiceCenterId, in.ServiceCenterIdSort, in.ServiceCenterIdSortAscending, in.ServiceCenterIdFetch);
      if (map != null) record.put ("ServiceCenterId", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
    return record;
  }
  /** convert Map to CustomerServiceCenterObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerServiceCenterObjectData the converted object
   */
  public static CustomerServiceCenterObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerServiceCenterObjectData out = new CustomerServiceCenterObjectData ();

    out.Key = CustomerServiceCenterObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ServiceCenterId")) != null)
    {
      out.ServiceCenterId = (Integer) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to CustomerServiceCenterObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerServiceCenterObjectFilter the converted object
   */
  public static CustomerServiceCenterObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerServiceCenterObjectFilter out = new CustomerServiceCenterObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CustomerServiceCenterObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ServiceCenterIdMap = (Map)record.get("ServiceCenterId");
    Boolean ServiceCenterIdFetch = DataHelper.getFetch(ServiceCenterIdMap);
    Boolean ServiceCenterIdSortDir = DataHelper.getSortDirection(ServiceCenterIdMap);
    Integer ServiceCenterIdSortOrder = DataHelper.getSortOrder(ServiceCenterIdMap);
    if (ServiceCenterIdFetch != null) out.setServiceCenterIdFetch(ServiceCenterIdFetch);
    if (ServiceCenterIdSortDir != null) out.setServiceCenterIdSortDirection(ServiceCenterIdSortDir);
    if (ServiceCenterIdSortOrder != null) out.setServiceCenterIdSortOrder(ServiceCenterIdSortOrder);

    Filter[] ServiceCenterIdFilter = DataHelper.mapToFilterArray(ServiceCenterIdMap, Integer.class);
    if (ServiceCenterIdFilter != null) {
      IntegerFilter[] ServiceCenterIdFilters = new IntegerFilter[ServiceCenterIdFilter.length];
      for (int i = 0; i < ServiceCenterIdFilters.length; i++) {
        ServiceCenterIdFilters[i] = (IntegerFilter)ServiceCenterIdFilter[i];
      }
      try {
        out.setServiceCenterIdFilter(ServiceCenterIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgWhoMap = (Map)record.get("ChgWho");
    Boolean ChgWhoFetch = DataHelper.getFetch(ChgWhoMap);
    Boolean ChgWhoSortDir = DataHelper.getSortDirection(ChgWhoMap);
    Integer ChgWhoSortOrder = DataHelper.getSortOrder(ChgWhoMap);
    if (ChgWhoFetch != null) out.setChgWhoFetch(ChgWhoFetch);
    if (ChgWhoSortDir != null) out.setChgWhoSortDirection(ChgWhoSortDir);
    if (ChgWhoSortOrder != null) out.setChgWhoSortOrder(ChgWhoSortOrder);

    Filter[] ChgWhoFilter = DataHelper.mapToFilterArray(ChgWhoMap, String.class);
    if (ChgWhoFilter != null) {
      StringFilter[] ChgWhoFilters = new StringFilter[ChgWhoFilter.length];
      for (int i = 0; i < ChgWhoFilters.length; i++) {
        ChgWhoFilters[i] = (StringFilter)ChgWhoFilter[i];
      }
      try {
        out.setChgWhoFilter(ChgWhoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDateMap = (Map)record.get("ChgDate");
    Boolean ChgDateFetch = DataHelper.getFetch(ChgDateMap);
    Boolean ChgDateSortDir = DataHelper.getSortDirection(ChgDateMap);
    Integer ChgDateSortOrder = DataHelper.getSortOrder(ChgDateMap);
    if (ChgDateFetch != null) out.setChgDateFetch(ChgDateFetch);
    if (ChgDateSortDir != null) out.setChgDateSortDirection(ChgDateSortDir);
    if (ChgDateSortOrder != null) out.setChgDateSortOrder(ChgDateSortOrder);

    Filter[] ChgDateFilter = DataHelper.mapToFilterArray(ChgDateMap, Date.class);
    if (ChgDateFilter != null) {
      DateFilter[] ChgDateFilters = new DateFilter[ChgDateFilter.length];
      for (int i = 0; i < ChgDateFilters.length; i++) {
        ChgDateFilters[i] = (DateFilter)ChgDateFilter[i];
      }
      try {
        out.setChgDateFilter(ChgDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
