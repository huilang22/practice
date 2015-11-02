/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ExtendedDataLocateObjectHelper.java
 * Definition File: Catalog/ExtendedDataLocate.xml
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



/** Helper class to convert ExtendedDataLocateObject JavaBean objects to/from HashMaps.
 */
public class ExtendedDataLocateObjectHelper implements ArubaObjectHelper
{
  /** convert ExtendedDataLocateObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ExtendedDataLocateObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ExtendedDataLocateObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ExtendedDataLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataLocateObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ExtendedDataLocateObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ExtendedDataLocateObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataLocateObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ExtendedDataLocateObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ExtendedDataLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (ExtendedDataLocateObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ExtendedDataLocateObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ExtendedDataLocateObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ExtendedDataLocateObjectData the converted object
   */
  public static ExtendedDataLocateObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ExtendedDataLocateObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ExtendedDataLocateObject")
   * @return ExtendedDataLocateObjectData the converted object
   */
  public static ExtendedDataLocateObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ExtendedDataLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ExtendedDataLocateObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ExtendedDataLocateObjectFilter the converted object
   */
  public static ExtendedDataLocateObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ExtendedDataLocateObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ExtendedDataLocateObject")
   * @return ExtendedDataLocateObjectFilter the converted object
   */
  public static ExtendedDataLocateObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ExtendedDataLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ExtendedDataLocateObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ExtendedDataLocateObjectDataList the converted object
   */
  public static ExtendedDataLocateObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ExtendedDataLocateObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ExtendedDataLocateObjectList")
   * @return ExtendedDataLocateObjectDataList the converted object
   */
  public static ExtendedDataLocateObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ExtendedDataLocateObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ExtendedDataLocateObjectData[] array = null;
    if (root != null)
    {
      array = new ExtendedDataLocateObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ExtendedDataLocateObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ExtendedDataLocateObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ExtendedDataLocateObjectDataList (array, index, total);
  }
  /** convert ExtendedDataLocateObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ExtendedDataLocateObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ExtendedDataLocateObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ParamValueSet) record.put ("ParamValue", in.ParamValue);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
      return record;
  }
  /** convert ExtendedDataLocateObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ExtendedDataLocateObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ExtendedDataLocateObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ParamValue, in.ParamValueSort, in.ParamValueSortAscending, in.ParamValueFetch, in.ParamValueCaseInsensitive);
      if (map != null) record.put ("ParamValue", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
    return record;
  }
  /** convert Map to ExtendedDataLocateObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ExtendedDataLocateObjectData the converted object
   */
  public static ExtendedDataLocateObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ExtendedDataLocateObjectData out = new ExtendedDataLocateObjectData ();

    out.Key = ExtendedDataLocateObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ParamValue")) != null)
    {
      out.ParamValue = (String) obj;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (Integer) obj;
    }
      return out;
  }
  /** convert Map to ExtendedDataLocateObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ExtendedDataLocateObjectFilter the converted object
   */
  public static ExtendedDataLocateObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ExtendedDataLocateObjectFilter out = new ExtendedDataLocateObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ExtendedDataLocateObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ParamValueMap = (Map)record.get("ParamValue");
    Boolean ParamValueFetch = DataHelper.getFetch(ParamValueMap);
    Boolean ParamValueSortDir = DataHelper.getSortDirection(ParamValueMap);
    Integer ParamValueSortOrder = DataHelper.getSortOrder(ParamValueMap);
    if (ParamValueFetch != null) out.setParamValueFetch(ParamValueFetch);
    if (ParamValueSortDir != null) out.setParamValueSortDirection(ParamValueSortDir);
    if (ParamValueSortOrder != null) out.setParamValueSortOrder(ParamValueSortOrder);

    Filter[] ParamValueFilter = DataHelper.mapToFilterArray(ParamValueMap, String.class);
    if (ParamValueFilter != null) {
      StringFilter[] ParamValueFilters = new StringFilter[ParamValueFilter.length];
      for (int i = 0; i < ParamValueFilters.length; i++) {
        ParamValueFilters[i] = (StringFilter)ParamValueFilter[i];
      }
      try {
        out.setParamValueFilter(ParamValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdMap = (Map)record.get("ServiceInternalId");
    Boolean ServiceInternalIdFetch = DataHelper.getFetch(ServiceInternalIdMap);
    Boolean ServiceInternalIdSortDir = DataHelper.getSortDirection(ServiceInternalIdMap);
    Integer ServiceInternalIdSortOrder = DataHelper.getSortOrder(ServiceInternalIdMap);
    if (ServiceInternalIdFetch != null) out.setServiceInternalIdFetch(ServiceInternalIdFetch);
    if (ServiceInternalIdSortDir != null) out.setServiceInternalIdSortDirection(ServiceInternalIdSortDir);
    if (ServiceInternalIdSortOrder != null) out.setServiceInternalIdSortOrder(ServiceInternalIdSortOrder);

    Filter[] ServiceInternalIdFilter = DataHelper.mapToFilterArray(ServiceInternalIdMap, Integer.class);
    if (ServiceInternalIdFilter != null) {
      IntegerFilter[] ServiceInternalIdFilters = new IntegerFilter[ServiceInternalIdFilter.length];
      for (int i = 0; i < ServiceInternalIdFilters.length; i++) {
        ServiceInternalIdFilters[i] = (IntegerFilter)ServiceInternalIdFilter[i];
      }
      try {
        out.setServiceInternalIdFilter(ServiceInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdResetsMap = (Map)record.get("ServiceInternalIdResets");
    Boolean ServiceInternalIdResetsFetch = DataHelper.getFetch(ServiceInternalIdResetsMap);
    Boolean ServiceInternalIdResetsSortDir = DataHelper.getSortDirection(ServiceInternalIdResetsMap);
    Integer ServiceInternalIdResetsSortOrder = DataHelper.getSortOrder(ServiceInternalIdResetsMap);
    if (ServiceInternalIdResetsFetch != null) out.setServiceInternalIdResetsFetch(ServiceInternalIdResetsFetch);
    if (ServiceInternalIdResetsSortDir != null) out.setServiceInternalIdResetsSortDirection(ServiceInternalIdResetsSortDir);
    if (ServiceInternalIdResetsSortOrder != null) out.setServiceInternalIdResetsSortOrder(ServiceInternalIdResetsSortOrder);

    Filter[] ServiceInternalIdResetsFilter = DataHelper.mapToFilterArray(ServiceInternalIdResetsMap, Integer.class);
    if (ServiceInternalIdResetsFilter != null) {
      IntegerFilter[] ServiceInternalIdResetsFilters = new IntegerFilter[ServiceInternalIdResetsFilter.length];
      for (int i = 0; i < ServiceInternalIdResetsFilters.length; i++) {
        ServiceInternalIdResetsFilters[i] = (IntegerFilter)ServiceInternalIdResetsFilter[i];
      }
      try {
        out.setServiceInternalIdResetsFilter(ServiceInternalIdResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
