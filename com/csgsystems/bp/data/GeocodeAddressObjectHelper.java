/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GeocodeAddressObjectHelper.java
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



/** Helper class to convert GeocodeAddressObject JavaBean objects to/from HashMaps.
 */
public class GeocodeAddressObjectHelper implements ArubaObjectHelper
{
  /** convert GeocodeAddressObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (GeocodeAddressObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GeocodeAddressObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GeocodeAddressObject")
   * @return Map     the output Map
   */
  public static Map toMap (GeocodeAddressObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GeocodeAddressObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert GeocodeAddressObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GeocodeAddressObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GeocodeAddressObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GeocodeAddressObject")
   * @return Map     the output Map
   */
  public static Map toMap (GeocodeAddressObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GeocodeAddressObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GeocodeAddressObjectData.
   * @param record the Map containing the data to convert to the object
   * @return GeocodeAddressObjectData the converted object
   */
  public static GeocodeAddressObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GeocodeAddressObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GeocodeAddressObject")
   * @return GeocodeAddressObjectData the converted object
   */
  public static GeocodeAddressObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GeocodeAddressObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GeocodeAddressObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return GeocodeAddressObjectFilter the converted object
   */
  public static GeocodeAddressObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GeocodeAddressObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GeocodeAddressObject")
   * @return GeocodeAddressObjectFilter the converted object
   */
  public static GeocodeAddressObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GeocodeAddressObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to GeocodeAddressObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return GeocodeAddressObjectDataList the converted object
   */
  public static GeocodeAddressObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to GeocodeAddressObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "GeocodeAddressObjectList")
   * @return GeocodeAddressObjectDataList the converted object
   */
  public static GeocodeAddressObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GeocodeAddressObjectList";
    Object[] root = (Object[]) record.get (rootName);
    GeocodeAddressObjectData[] array = null;
    if (root != null)
    {
      array = new GeocodeAddressObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = GeocodeAddressObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new GeocodeAddressObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new GeocodeAddressObjectDataList (array, index, total);
  }
  /** convert GeocodeAddressObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GeocodeAddressObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CitySet) record.put ("City", in.City);
  
    if (in._CountryCodeSet) record.put ("CountryCode", in.CountryCode);
  
    if (in._FranchiseCodeSet) record.put ("FranchiseCode", in.FranchiseCode);
  
    if (in._StateSet) record.put ("State", in.State);
  
    if (in._ZipSet) record.put ("Zip", in.Zip);
      return record;
  }
  /** convert GeocodeAddressObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (GeocodeAddressObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.City, in.CitySort, in.CitySortAscending, in.CityFetch, in.CityCaseInsensitive); 
      if (map != null) record.put ("City", map);
      map = DataHelper.filterToMap (in.CountryCode, in.CountryCodeSort, in.CountryCodeSortAscending, in.CountryCodeFetch); 
      if (map != null) record.put ("CountryCode", map);
      map = DataHelper.filterToMap (in.FranchiseCode, in.FranchiseCodeSort, in.FranchiseCodeSortAscending, in.FranchiseCodeFetch); 
      if (map != null) record.put ("FranchiseCode", map);
      map = DataHelper.filterToMap (in.State, in.StateSort, in.StateSortAscending, in.StateFetch, in.StateCaseInsensitive); 
      if (map != null) record.put ("State", map);
      map = DataHelper.filterToMap (in.Zip, in.ZipSort, in.ZipSortAscending, in.ZipFetch, in.ZipCaseInsensitive); 
      if (map != null) record.put ("Zip", map);
    return record;
  }
  /** convert Map to GeocodeAddressObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GeocodeAddressObjectData the converted object
   */
  public static GeocodeAddressObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GeocodeAddressObjectData out = new GeocodeAddressObjectData ();

    if ((obj = record.get ("City")) != null)
    {
      out.City = (String) obj;
    }
  
    if ((obj = record.get ("CountryCode")) != null)
    {
      out.CountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("FranchiseCode")) != null)
    {
      out.FranchiseCode = (Integer) obj;
    }
  
    if ((obj = record.get ("State")) != null)
    {
      out.State = (String) obj;
    }
  
    if ((obj = record.get ("Zip")) != null)
    {
      out.Zip = (String) obj;
    }
      return out;
  }
  /** convert Map to GeocodeAddressObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GeocodeAddressObjectFilter the converted object
   */
  public static GeocodeAddressObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GeocodeAddressObjectFilter out = new GeocodeAddressObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
