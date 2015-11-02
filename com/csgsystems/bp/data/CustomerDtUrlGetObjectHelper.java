/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtUrlGetObjectHelper.java
 * Definition File: Customer/CustomerDtUrl.xml
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



/** Helper class to convert CustomerDtUrlGetObject JavaBean objects to/from HashMaps.
 */
public class CustomerDtUrlGetObjectHelper implements ArubaObjectHelper
{
  /** convert CustomerDtUrlGetObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CustomerDtUrlGetObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDtUrlGetObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDtUrlGetObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtUrlGetObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDtUrlGetObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CustomerDtUrlGetObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtUrlGetObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDtUrlGetObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDtUrlGetObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtUrlGetObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDtUrlGetObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CustomerDtUrlGetObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDtUrlGetObjectData the converted object
   */
  public static CustomerDtUrlGetObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CustomerDtUrlGetObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CustomerDtUrlGetObject")
   * @return CustomerDtUrlGetObjectData the converted object
   */
  public static CustomerDtUrlGetObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtUrlGetObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CustomerDtUrlGetObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDtUrlGetObjectFilter the converted object
   */
  public static CustomerDtUrlGetObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CustomerDtUrlGetObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CustomerDtUrlGetObject")
   * @return CustomerDtUrlGetObjectFilter the converted object
   */
  public static CustomerDtUrlGetObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtUrlGetObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CustomerDtUrlGetObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CustomerDtUrlGetObjectDataList the converted object
   */
  public static CustomerDtUrlGetObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CustomerDtUrlGetObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CustomerDtUrlGetObjectList")
   * @return CustomerDtUrlGetObjectDataList the converted object
   */
  public static CustomerDtUrlGetObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtUrlGetObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CustomerDtUrlGetObjectData[] array = null;
    if (root != null)
    {
      array = new CustomerDtUrlGetObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CustomerDtUrlGetObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CustomerDtUrlGetObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CustomerDtUrlGetObjectDataList (array, index, total);
  }
  /** convert CustomerDtUrlGetObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDtUrlGetObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._DocumentIdSet) record.put ("DocumentId", in.DocumentId);
  
    if (in._DocumentTypeIdSet) record.put ("DocumentTypeId", in.DocumentTypeId);
  
    if (in._SourceIdSet) record.put ("SourceId", in.SourceId);
  
    if (in._SourceId2Set) record.put ("SourceId2", in.SourceId2);
  
    if (in._DisFilenameSet) record.put ("DisFilename", in.DisFilename);
  
    if (in._CustomerDocURLSet) record.put ("CustomerDocURL", in.CustomerDocURL);
      return record;
  }
  /** convert CustomerDtUrlGetObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDtUrlGetObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.DocumentId, in.DocumentIdSort, in.DocumentIdSortAscending, in.DocumentIdFetch); 
      if (map != null) record.put ("DocumentId", map);
      map = DataHelper.filterToMap (in.DocumentTypeId, in.DocumentTypeIdSort, in.DocumentTypeIdSortAscending, in.DocumentTypeIdFetch); 
      if (map != null) record.put ("DocumentTypeId", map);
      map = DataHelper.filterToMap (in.SourceId, in.SourceIdSort, in.SourceIdSortAscending, in.SourceIdFetch); 
      if (map != null) record.put ("SourceId", map);
      map = DataHelper.filterToMap (in.SourceId2, in.SourceId2Sort, in.SourceId2SortAscending, in.SourceId2Fetch); 
      if (map != null) record.put ("SourceId2", map);
      map = DataHelper.filterToMap (in.DisFilename, in.DisFilenameSort, in.DisFilenameSortAscending, in.DisFilenameFetch, in.DisFilenameCaseInsensitive); 
      if (map != null) record.put ("DisFilename", map);
      map = DataHelper.filterToMap (in.CustomerDocURL, in.CustomerDocURLSort, in.CustomerDocURLSortAscending, in.CustomerDocURLFetch, in.CustomerDocURLCaseInsensitive); 
      if (map != null) record.put ("CustomerDocURL", map);
    return record;
  }
  /** convert Map to CustomerDtUrlGetObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDtUrlGetObjectData the converted object
   */
  public static CustomerDtUrlGetObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDtUrlGetObjectData out = new CustomerDtUrlGetObjectData ();

    if ((obj = record.get ("DocumentId")) != null)
    {
      out.DocumentId = (Integer) obj;
    }
  
    if ((obj = record.get ("DocumentTypeId")) != null)
    {
      out.DocumentTypeId = (Integer) obj;
    }
  
    if ((obj = record.get ("SourceId")) != null)
    {
      out.SourceId = (Integer) obj;
    }
  
    if ((obj = record.get ("SourceId2")) != null)
    {
      out.SourceId2 = (Integer) obj;
    }
  
    if ((obj = record.get ("DisFilename")) != null)
    {
      out.DisFilename = (String) obj;
    }
  
    if ((obj = record.get ("CustomerDocURL")) != null)
    {
      out.CustomerDocURL = (String) obj;
    }
      return out;
  }
  /** convert Map to CustomerDtUrlGetObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDtUrlGetObjectFilter the converted object
   */
  public static CustomerDtUrlGetObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDtUrlGetObjectFilter out = new CustomerDtUrlGetObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
