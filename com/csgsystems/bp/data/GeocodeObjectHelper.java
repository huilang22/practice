/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GeocodeObjectHelper.java
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



/** Helper class to convert GeocodeObject JavaBean objects to/from HashMaps.
 */
public class GeocodeObjectHelper implements ArubaObjectHelper
{
  /** convert GeocodeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (GeocodeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GeocodeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GeocodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (GeocodeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GeocodeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert GeocodeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GeocodeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GeocodeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GeocodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (GeocodeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GeocodeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GeocodeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return GeocodeObjectData the converted object
   */
  public static GeocodeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GeocodeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GeocodeObject")
   * @return GeocodeObjectData the converted object
   */
  public static GeocodeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GeocodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GeocodeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return GeocodeObjectFilter the converted object
   */
  public static GeocodeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GeocodeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GeocodeObject")
   * @return GeocodeObjectFilter the converted object
   */
  public static GeocodeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GeocodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to GeocodeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return GeocodeObjectDataList the converted object
   */
  public static GeocodeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to GeocodeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "GeocodeObjectList")
   * @return GeocodeObjectDataList the converted object
   */
  public static GeocodeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GeocodeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    GeocodeObjectData[] array = null;
    if (root != null)
    {
      array = new GeocodeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = GeocodeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new GeocodeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new GeocodeObjectDataList (array, index, total);
  }
  /** convert GeocodeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GeocodeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CountySet) record.put ("County", in.County);
  
    if (in._GeocodeSet) record.put ("Geocode", in.Geocode);
      return record;
  }
  /** convert GeocodeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GeocodeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.County, in.CountySort, in.CountySortAscending, in.CountyFetch, in.CountyCaseInsensitive); 
      if (map != null) record.put ("County", map);
      map = DataHelper.filterToMap (in.Geocode, in.GeocodeSort, in.GeocodeSortAscending, in.GeocodeFetch, in.GeocodeCaseInsensitive); 
      if (map != null) record.put ("Geocode", map);
    return record;
  }
  /** convert Map to GeocodeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GeocodeObjectData the converted object
   */
  public static GeocodeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GeocodeObjectData out = new GeocodeObjectData ();

    if ((obj = record.get ("County")) != null)
    {
      out.County = (String) obj;
    }
  
    if ((obj = record.get ("Geocode")) != null)
    {
      out.Geocode = (String) obj;
    }
      return out;
  }
  /** convert Map to GeocodeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GeocodeObjectFilter the converted object
   */
  public static GeocodeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GeocodeObjectFilter out = new GeocodeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
