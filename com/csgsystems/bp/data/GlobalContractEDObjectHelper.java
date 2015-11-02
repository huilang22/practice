/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GlobalContractEDObjectHelper.java
 * Definition File: Customer/GlobalContract.xml
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



/** Helper class to convert GlobalContractEDObject JavaBean objects to/from HashMaps.
 */
public class GlobalContractEDObjectHelper implements ArubaObjectHelper
{
  /** convert GlobalContractEDObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (GlobalContractEDObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalContractEDObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalContractEDObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractEDObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalContractEDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert GlobalContractEDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractEDObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GlobalContractEDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GlobalContractEDObject")
   * @return Map     the output Map
   */
  public static Map toMap (GlobalContractEDObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GlobalContractEDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GlobalContractEDObjectData.
   * @param record the Map containing the data to convert to the object
   * @return GlobalContractEDObjectData the converted object
   */
  public static GlobalContractEDObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GlobalContractEDObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GlobalContractEDObject")
   * @return GlobalContractEDObjectData the converted object
   */
  public static GlobalContractEDObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalContractEDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GlobalContractEDObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return GlobalContractEDObjectFilter the converted object
   */
  public static GlobalContractEDObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GlobalContractEDObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GlobalContractEDObject")
   * @return GlobalContractEDObjectFilter the converted object
   */
  public static GlobalContractEDObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalContractEDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to GlobalContractEDObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return GlobalContractEDObjectDataList the converted object
   */
  public static GlobalContractEDObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to GlobalContractEDObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "GlobalContractEDObjectList")
   * @return GlobalContractEDObjectDataList the converted object
   */
  public static GlobalContractEDObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GlobalContractEDObjectList";
    Object[] root = (Object[]) record.get (rootName);
    GlobalContractEDObjectData[] array = null;
    if (root != null)
    {
      array = new GlobalContractEDObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = GlobalContractEDObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new GlobalContractEDObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new GlobalContractEDObjectDataList (array, index, total);
  }
  /** convert GlobalContractEDObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GlobalContractEDObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", GlobalContractEDObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ParamNameSet) record.put ("ParamName", in.ParamName);
  
    if (in._ParamValueSet) record.put ("ParamValue", in.ParamValue);
  
    if (in._ParamDatatypeSet) record.put ("ParamDatatype", in.ParamDatatype);
      return record;
  }
  /** convert GlobalContractEDObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GlobalContractEDObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", GlobalContractEDObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ParamName, in.ParamNameSort, in.ParamNameSortAscending, in.ParamNameFetch, in.ParamNameCaseInsensitive);
      if (map != null) record.put ("ParamName", map);
      map = DataHelper.filterToMap (in.ParamValue, in.ParamValueSort, in.ParamValueSortAscending, in.ParamValueFetch, in.ParamValueCaseInsensitive);
      if (map != null) record.put ("ParamValue", map);
      map = DataHelper.filterToMap (in.ParamDatatype, in.ParamDatatypeSort, in.ParamDatatypeSortAscending, in.ParamDatatypeFetch);
      if (map != null) record.put ("ParamDatatype", map);
    return record;
  }
  /** convert Map to GlobalContractEDObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalContractEDObjectData the converted object
   */
  public static GlobalContractEDObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalContractEDObjectData out = new GlobalContractEDObjectData ();

    out.Key = GlobalContractEDObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ParamName")) != null)
    {
      out.ParamName = (String) obj;
    }
  
    if ((obj = record.get ("ParamValue")) != null)
    {
      out.ParamValue = (String) obj;
    }
  
    if ((obj = record.get ("ParamDatatype")) != null)
    {
      out.ParamDatatype = (Integer) obj;
    }
      return out;
  }
  /** convert Map to GlobalContractEDObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GlobalContractEDObjectFilter the converted object
   */
  public static GlobalContractEDObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GlobalContractEDObjectFilter out = new GlobalContractEDObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = GlobalContractEDObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ParamNameMap = (Map)record.get("ParamName");
    Boolean ParamNameFetch = DataHelper.getFetch(ParamNameMap);
    Boolean ParamNameSortDir = DataHelper.getSortDirection(ParamNameMap);
    Integer ParamNameSortOrder = DataHelper.getSortOrder(ParamNameMap);
    if (ParamNameFetch != null) out.setParamNameFetch(ParamNameFetch);
    if (ParamNameSortDir != null) out.setParamNameSortDirection(ParamNameSortDir);
    if (ParamNameSortOrder != null) out.setParamNameSortOrder(ParamNameSortOrder);

    Filter[] ParamNameFilter = DataHelper.mapToFilterArray(ParamNameMap, String.class);
    if (ParamNameFilter != null) {
      StringFilter[] ParamNameFilters = new StringFilter[ParamNameFilter.length];
      for (int i = 0; i < ParamNameFilters.length; i++) {
        ParamNameFilters[i] = (StringFilter)ParamNameFilter[i];
      }
      try {
        out.setParamNameFilter(ParamNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    Map ParamDatatypeMap = (Map)record.get("ParamDatatype");
    Boolean ParamDatatypeFetch = DataHelper.getFetch(ParamDatatypeMap);
    Boolean ParamDatatypeSortDir = DataHelper.getSortDirection(ParamDatatypeMap);
    Integer ParamDatatypeSortOrder = DataHelper.getSortOrder(ParamDatatypeMap);
    if (ParamDatatypeFetch != null) out.setParamDatatypeFetch(ParamDatatypeFetch);
    if (ParamDatatypeSortDir != null) out.setParamDatatypeSortDirection(ParamDatatypeSortDir);
    if (ParamDatatypeSortOrder != null) out.setParamDatatypeSortOrder(ParamDatatypeSortOrder);

    Filter[] ParamDatatypeFilter = DataHelper.mapToFilterArray(ParamDatatypeMap, Integer.class);
    if (ParamDatatypeFilter != null) {
      IntegerFilter[] ParamDatatypeFilters = new IntegerFilter[ParamDatatypeFilter.length];
      for (int i = 0; i < ParamDatatypeFilters.length; i++) {
        ParamDatatypeFilters[i] = (IntegerFilter)ParamDatatypeFilter[i];
      }
      try {
        out.setParamDatatypeFilter(ParamDatatypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
