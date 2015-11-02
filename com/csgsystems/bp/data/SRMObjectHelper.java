/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SRMObjectHelper.java
 * Definition File: Admin/StatusReasonMap.xml
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



/** Helper class to convert SRMObject JavaBean objects to/from HashMaps.
 */
public class SRMObjectHelper implements ArubaObjectHelper
{
  /** convert SRMObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (SRMObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SRMObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SRMObject")
   * @return Map     the output Map
   */
  public static Map toMap (SRMObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SRMObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert SRMObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SRMObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SRMObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SRMObject")
   * @return Map     the output Map
   */
  public static Map toMap (SRMObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SRMObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SRMObjectData.
   * @param record the Map containing the data to convert to the object
   * @return SRMObjectData the converted object
   */
  public static SRMObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SRMObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SRMObject")
   * @return SRMObjectData the converted object
   */
  public static SRMObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SRMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SRMObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return SRMObjectFilter the converted object
   */
  public static SRMObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SRMObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SRMObject")
   * @return SRMObjectFilter the converted object
   */
  public static SRMObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SRMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to SRMObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return SRMObjectDataList the converted object
   */
  public static SRMObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to SRMObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "SRMObjectList")
   * @return SRMObjectDataList the converted object
   */
  public static SRMObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SRMObjectList";
    Object[] root = (Object[]) record.get (rootName);
    SRMObjectData[] array = null;
    if (root != null)
    {
      array = new SRMObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = SRMObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new SRMObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new SRMObjectDataList (array, index, total);
  }
  /** convert SRMObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SRMObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", SRMObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._StatusShortDisplaySet) record.put ("StatusShortDisplay", in.StatusShortDisplay);
  
    if (in._StatusDisplayValueSet) record.put ("StatusDisplayValue", in.StatusDisplayValue);
  
    if (in._StatusReasonShortDisplaySet) record.put ("StatusReasonShortDisplay", in.StatusReasonShortDisplay);
  
    if (in._StatusReasonDisplayValueSet) record.put ("StatusReasonDisplayValue", in.StatusReasonDisplayValue);
      return record;
  }
  /** convert SRMObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SRMObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", SRMObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.StatusShortDisplay, in.StatusShortDisplaySort, in.StatusShortDisplaySortAscending, in.StatusShortDisplayFetch, in.StatusShortDisplayCaseInsensitive);
      if (map != null) record.put ("StatusShortDisplay", map);
      map = DataHelper.filterToMap (in.StatusDisplayValue, in.StatusDisplayValueSort, in.StatusDisplayValueSortAscending, in.StatusDisplayValueFetch, in.StatusDisplayValueCaseInsensitive);
      if (map != null) record.put ("StatusDisplayValue", map);
      map = DataHelper.filterToMap (in.StatusReasonShortDisplay, in.StatusReasonShortDisplaySort, in.StatusReasonShortDisplaySortAscending, in.StatusReasonShortDisplayFetch, in.StatusReasonShortDisplayCaseInsensitive);
      if (map != null) record.put ("StatusReasonShortDisplay", map);
      map = DataHelper.filterToMap (in.StatusReasonDisplayValue, in.StatusReasonDisplayValueSort, in.StatusReasonDisplayValueSortAscending, in.StatusReasonDisplayValueFetch, in.StatusReasonDisplayValueCaseInsensitive);
      if (map != null) record.put ("StatusReasonDisplayValue", map);
    return record;
  }
  /** convert Map to SRMObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SRMObjectData the converted object
   */
  public static SRMObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SRMObjectData out = new SRMObjectData ();

    out.Key = SRMObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("StatusShortDisplay")) != null)
    {
      out.StatusShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("StatusDisplayValue")) != null)
    {
      out.StatusDisplayValue = (String) obj;
    }
  
    if ((obj = record.get ("StatusReasonShortDisplay")) != null)
    {
      out.StatusReasonShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("StatusReasonDisplayValue")) != null)
    {
      out.StatusReasonDisplayValue = (String) obj;
    }
      return out;
  }
  /** convert Map to SRMObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SRMObjectFilter the converted object
   */
  public static SRMObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SRMObjectFilter out = new SRMObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = SRMObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map StatusShortDisplayMap = (Map)record.get("StatusShortDisplay");
    Boolean StatusShortDisplayFetch = DataHelper.getFetch(StatusShortDisplayMap);
    Boolean StatusShortDisplaySortDir = DataHelper.getSortDirection(StatusShortDisplayMap);
    Integer StatusShortDisplaySortOrder = DataHelper.getSortOrder(StatusShortDisplayMap);
    if (StatusShortDisplayFetch != null) out.setStatusShortDisplayFetch(StatusShortDisplayFetch);
    if (StatusShortDisplaySortDir != null) out.setStatusShortDisplaySortDirection(StatusShortDisplaySortDir);
    if (StatusShortDisplaySortOrder != null) out.setStatusShortDisplaySortOrder(StatusShortDisplaySortOrder);

    Filter[] StatusShortDisplayFilter = DataHelper.mapToFilterArray(StatusShortDisplayMap, String.class);
    if (StatusShortDisplayFilter != null) {
      StringFilter[] StatusShortDisplayFilters = new StringFilter[StatusShortDisplayFilter.length];
      for (int i = 0; i < StatusShortDisplayFilters.length; i++) {
        StatusShortDisplayFilters[i] = (StringFilter)StatusShortDisplayFilter[i];
      }
      try {
        out.setStatusShortDisplayFilter(StatusShortDisplayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatusDisplayValueMap = (Map)record.get("StatusDisplayValue");
    Boolean StatusDisplayValueFetch = DataHelper.getFetch(StatusDisplayValueMap);
    Boolean StatusDisplayValueSortDir = DataHelper.getSortDirection(StatusDisplayValueMap);
    Integer StatusDisplayValueSortOrder = DataHelper.getSortOrder(StatusDisplayValueMap);
    if (StatusDisplayValueFetch != null) out.setStatusDisplayValueFetch(StatusDisplayValueFetch);
    if (StatusDisplayValueSortDir != null) out.setStatusDisplayValueSortDirection(StatusDisplayValueSortDir);
    if (StatusDisplayValueSortOrder != null) out.setStatusDisplayValueSortOrder(StatusDisplayValueSortOrder);

    Filter[] StatusDisplayValueFilter = DataHelper.mapToFilterArray(StatusDisplayValueMap, String.class);
    if (StatusDisplayValueFilter != null) {
      StringFilter[] StatusDisplayValueFilters = new StringFilter[StatusDisplayValueFilter.length];
      for (int i = 0; i < StatusDisplayValueFilters.length; i++) {
        StatusDisplayValueFilters[i] = (StringFilter)StatusDisplayValueFilter[i];
      }
      try {
        out.setStatusDisplayValueFilter(StatusDisplayValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatusReasonShortDisplayMap = (Map)record.get("StatusReasonShortDisplay");
    Boolean StatusReasonShortDisplayFetch = DataHelper.getFetch(StatusReasonShortDisplayMap);
    Boolean StatusReasonShortDisplaySortDir = DataHelper.getSortDirection(StatusReasonShortDisplayMap);
    Integer StatusReasonShortDisplaySortOrder = DataHelper.getSortOrder(StatusReasonShortDisplayMap);
    if (StatusReasonShortDisplayFetch != null) out.setStatusReasonShortDisplayFetch(StatusReasonShortDisplayFetch);
    if (StatusReasonShortDisplaySortDir != null) out.setStatusReasonShortDisplaySortDirection(StatusReasonShortDisplaySortDir);
    if (StatusReasonShortDisplaySortOrder != null) out.setStatusReasonShortDisplaySortOrder(StatusReasonShortDisplaySortOrder);

    Filter[] StatusReasonShortDisplayFilter = DataHelper.mapToFilterArray(StatusReasonShortDisplayMap, String.class);
    if (StatusReasonShortDisplayFilter != null) {
      StringFilter[] StatusReasonShortDisplayFilters = new StringFilter[StatusReasonShortDisplayFilter.length];
      for (int i = 0; i < StatusReasonShortDisplayFilters.length; i++) {
        StatusReasonShortDisplayFilters[i] = (StringFilter)StatusReasonShortDisplayFilter[i];
      }
      try {
        out.setStatusReasonShortDisplayFilter(StatusReasonShortDisplayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatusReasonDisplayValueMap = (Map)record.get("StatusReasonDisplayValue");
    Boolean StatusReasonDisplayValueFetch = DataHelper.getFetch(StatusReasonDisplayValueMap);
    Boolean StatusReasonDisplayValueSortDir = DataHelper.getSortDirection(StatusReasonDisplayValueMap);
    Integer StatusReasonDisplayValueSortOrder = DataHelper.getSortOrder(StatusReasonDisplayValueMap);
    if (StatusReasonDisplayValueFetch != null) out.setStatusReasonDisplayValueFetch(StatusReasonDisplayValueFetch);
    if (StatusReasonDisplayValueSortDir != null) out.setStatusReasonDisplayValueSortDirection(StatusReasonDisplayValueSortDir);
    if (StatusReasonDisplayValueSortOrder != null) out.setStatusReasonDisplayValueSortOrder(StatusReasonDisplayValueSortOrder);

    Filter[] StatusReasonDisplayValueFilter = DataHelper.mapToFilterArray(StatusReasonDisplayValueMap, String.class);
    if (StatusReasonDisplayValueFilter != null) {
      StringFilter[] StatusReasonDisplayValueFilters = new StringFilter[StatusReasonDisplayValueFilter.length];
      for (int i = 0; i < StatusReasonDisplayValueFilters.length; i++) {
        StatusReasonDisplayValueFilters[i] = (StringFilter)StatusReasonDisplayValueFilter[i];
      }
      try {
        out.setStatusReasonDisplayValueFilter(StatusReasonDisplayValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
