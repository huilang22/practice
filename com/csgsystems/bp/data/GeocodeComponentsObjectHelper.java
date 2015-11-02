/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GeocodeComponentsObjectHelper.java
 * Definition File: Admin/Geocode.xml
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



/** Helper class to convert GeocodeComponentsObject JavaBean objects to/from HashMaps.
 */
public class GeocodeComponentsObjectHelper implements ArubaObjectHelper
{
  /** convert GeocodeComponentsObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (GeocodeComponentsObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GeocodeComponentsObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GeocodeComponentsObject")
   * @return Map     the output Map
   */
  public static Map toMap (GeocodeComponentsObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GeocodeComponentsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert GeocodeComponentsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GeocodeComponentsObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GeocodeComponentsObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GeocodeComponentsObject")
   * @return Map     the output Map
   */
  public static Map toMap (GeocodeComponentsObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GeocodeComponentsObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GeocodeComponentsObjectData.
   * @param record the Map containing the data to convert to the object
   * @return GeocodeComponentsObjectData the converted object
   */
  public static GeocodeComponentsObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GeocodeComponentsObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GeocodeComponentsObject")
   * @return GeocodeComponentsObjectData the converted object
   */
  public static GeocodeComponentsObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GeocodeComponentsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GeocodeComponentsObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return GeocodeComponentsObjectFilter the converted object
   */
  public static GeocodeComponentsObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GeocodeComponentsObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GeocodeComponentsObject")
   * @return GeocodeComponentsObjectFilter the converted object
   */
  public static GeocodeComponentsObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GeocodeComponentsObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to GeocodeComponentsObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return GeocodeComponentsObjectDataList the converted object
   */
  public static GeocodeComponentsObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to GeocodeComponentsObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "GeocodeComponentsObjectList")
   * @return GeocodeComponentsObjectDataList the converted object
   */
  public static GeocodeComponentsObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GeocodeComponentsObjectList";
    Object[] root = (Object[]) record.get (rootName);
    GeocodeComponentsObjectData[] array = null;
    if (root != null)
    {
      array = new GeocodeComponentsObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = GeocodeComponentsObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new GeocodeComponentsObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new GeocodeComponentsObjectDataList (array, index, total);
  }
  /** convert GeocodeComponentsObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GeocodeComponentsObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CityCodeSet) record.put ("CityCode", in.CityCode);
  
    if (in._CountyCodeSet) record.put ("CountyCode", in.CountyCode);
  
    if (in._StateCodeSet) record.put ("StateCode", in.StateCode);
  
    if (in._GeocodeSet) record.put ("Geocode", in.Geocode);
  
    if (in._CountySet) record.put ("County", in.County);
      return record;
  }
  /** convert GeocodeComponentsObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GeocodeComponentsObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.CityCode, in.CityCodeSort, in.CityCodeSortAscending, in.CityCodeFetch); 
      if (map != null) record.put ("CityCode", map);
      map = DataHelper.filterToMap (in.CountyCode, in.CountyCodeSort, in.CountyCodeSortAscending, in.CountyCodeFetch); 
      if (map != null) record.put ("CountyCode", map);
      map = DataHelper.filterToMap (in.StateCode, in.StateCodeSort, in.StateCodeSortAscending, in.StateCodeFetch); 
      if (map != null) record.put ("StateCode", map);
      map = DataHelper.filterToMap (in.Geocode, in.GeocodeSort, in.GeocodeSortAscending, in.GeocodeFetch, in.GeocodeCaseInsensitive); 
      if (map != null) record.put ("Geocode", map);
      map = DataHelper.filterToMap (in.County, in.CountySort, in.CountySortAscending, in.CountyFetch, in.CountyCaseInsensitive); 
      if (map != null) record.put ("County", map);
    return record;
  }
  /** convert Map to GeocodeComponentsObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GeocodeComponentsObjectData the converted object
   */
  public static GeocodeComponentsObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GeocodeComponentsObjectData out = new GeocodeComponentsObjectData ();

    if ((obj = record.get ("CityCode")) != null)
    {
      out.CityCode = (Integer) obj;
    }
  
    if ((obj = record.get ("CountyCode")) != null)
    {
      out.CountyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("StateCode")) != null)
    {
      out.StateCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Geocode")) != null)
    {
      out.Geocode = (String) obj;
    }
  
    if ((obj = record.get ("County")) != null)
    {
      out.County = (String) obj;
    }
      return out;
  }
  /** convert Map to GeocodeComponentsObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GeocodeComponentsObjectFilter the converted object
   */
  public static GeocodeComponentsObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GeocodeComponentsObjectFilter out = new GeocodeComponentsObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
