/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ETCQuoteRequestObjectHelper.java
 * Definition File: Customer/EarlyTerminationCharge.xml
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



/** Helper class to convert ETCQuoteRequestObject JavaBean objects to/from HashMaps.
 */
public class ETCQuoteRequestObjectHelper implements ArubaObjectHelper
{
  /** convert ETCQuoteRequestObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ETCQuoteRequestObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ETCQuoteRequestObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ETCQuoteRequestObject")
   * @return Map     the output Map
   */
  public static Map toMap (ETCQuoteRequestObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ETCQuoteRequestObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ETCQuoteRequestObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ETCQuoteRequestObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ETCQuoteRequestObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ETCQuoteRequestObject")
   * @return Map     the output Map
   */
  public static Map toMap (ETCQuoteRequestObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ETCQuoteRequestObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ETCQuoteRequestObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ETCQuoteRequestObjectData the converted object
   */
  public static ETCQuoteRequestObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ETCQuoteRequestObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ETCQuoteRequestObject")
   * @return ETCQuoteRequestObjectData the converted object
   */
  public static ETCQuoteRequestObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ETCQuoteRequestObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ETCQuoteRequestObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ETCQuoteRequestObjectFilter the converted object
   */
  public static ETCQuoteRequestObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ETCQuoteRequestObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ETCQuoteRequestObject")
   * @return ETCQuoteRequestObjectFilter the converted object
   */
  public static ETCQuoteRequestObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ETCQuoteRequestObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ETCQuoteRequestObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ETCQuoteRequestObjectDataList the converted object
   */
  public static ETCQuoteRequestObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ETCQuoteRequestObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ETCQuoteRequestObjectList")
   * @return ETCQuoteRequestObjectDataList the converted object
   */
  public static ETCQuoteRequestObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ETCQuoteRequestObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ETCQuoteRequestObjectData[] array = null;
    if (root != null)
    {
      array = new ETCQuoteRequestObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ETCQuoteRequestObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ETCQuoteRequestObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ETCQuoteRequestObjectDataList (array, index, total);
  }
  /** convert ETCQuoteRequestObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ETCQuoteRequestObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._TrackingIdSet) record.put ("TrackingId", in.TrackingId);
  
    if (in._TrackingIdServSet) record.put ("TrackingIdServ", in.TrackingIdServ);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
      return record;
  }
  /** convert ETCQuoteRequestObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ETCQuoteRequestObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch); 
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.TrackingId, in.TrackingIdSort, in.TrackingIdSortAscending, in.TrackingIdFetch); 
      if (map != null) record.put ("TrackingId", map);
      map = DataHelper.filterToMap (in.TrackingIdServ, in.TrackingIdServSort, in.TrackingIdServSortAscending, in.TrackingIdServFetch); 
      if (map != null) record.put ("TrackingIdServ", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch); 
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch); 
      if (map != null) record.put ("ServiceInternalIdResets", map);
    return record;
  }
  /** convert Map to ETCQuoteRequestObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ETCQuoteRequestObjectData the converted object
   */
  public static ETCQuoteRequestObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ETCQuoteRequestObjectData out = new ETCQuoteRequestObjectData ();

    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("TrackingId")) != null)
    {
      out.TrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("TrackingIdServ")) != null)
    {
      out.TrackingIdServ = (Integer) obj;
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
  /** convert Map to ETCQuoteRequestObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ETCQuoteRequestObjectFilter the converted object
   */
  public static ETCQuoteRequestObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ETCQuoteRequestObjectFilter out = new ETCQuoteRequestObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
