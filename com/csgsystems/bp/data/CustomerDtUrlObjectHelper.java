/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtUrlObjectHelper.java
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



/** Helper class to convert CustomerDtUrlObject JavaBean objects to/from HashMaps.
 */
public class CustomerDtUrlObjectHelper implements ArubaObjectHelper
{
  /** convert CustomerDtUrlObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CustomerDtUrlObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDtUrlObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDtUrlObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtUrlObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDtUrlObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CustomerDtUrlObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtUrlObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDtUrlObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDtUrlObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtUrlObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDtUrlObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CustomerDtUrlObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDtUrlObjectData the converted object
   */
  public static CustomerDtUrlObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CustomerDtUrlObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CustomerDtUrlObject")
   * @return CustomerDtUrlObjectData the converted object
   */
  public static CustomerDtUrlObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtUrlObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CustomerDtUrlObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDtUrlObjectFilter the converted object
   */
  public static CustomerDtUrlObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CustomerDtUrlObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CustomerDtUrlObject")
   * @return CustomerDtUrlObjectFilter the converted object
   */
  public static CustomerDtUrlObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtUrlObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CustomerDtUrlObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CustomerDtUrlObjectDataList the converted object
   */
  public static CustomerDtUrlObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CustomerDtUrlObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CustomerDtUrlObjectList")
   * @return CustomerDtUrlObjectDataList the converted object
   */
  public static CustomerDtUrlObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtUrlObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CustomerDtUrlObjectData[] array = null;
    if (root != null)
    {
      array = new CustomerDtUrlObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CustomerDtUrlObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CustomerDtUrlObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CustomerDtUrlObjectDataList (array, index, total);
  }
  /** convert CustomerDtUrlObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDtUrlObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._PaymentDueDateSet) record.put ("PaymentDueDate", in.PaymentDueDate);
  
    if (in._PrepDateSet) record.put ("PrepDate", in.PrepDate);
  
    if (in._DisplayFilenameSet) record.put ("DisplayFilename", in.DisplayFilename);
  
    if (in._CustomerDocumentUrlSet) record.put ("CustomerDocumentUrl", in.CustomerDocumentUrl);
  
    if (in._DocumentIdSet) record.put ("DocumentId", in.DocumentId);
  
    if (in._DocumentTypeidSet) record.put ("DocumentTypeid", in.DocumentTypeid);
      return record;
  }
  /** convert CustomerDtUrlObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDtUrlObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch); 
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch); 
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.PaymentDueDate, in.PaymentDueDateSort, in.PaymentDueDateSortAscending, in.PaymentDueDateFetch); 
      if (map != null) record.put ("PaymentDueDate", map);
      map = DataHelper.filterToMap (in.PrepDate, in.PrepDateSort, in.PrepDateSortAscending, in.PrepDateFetch); 
      if (map != null) record.put ("PrepDate", map);
      map = DataHelper.filterToMap (in.DisplayFilename, in.DisplayFilenameSort, in.DisplayFilenameSortAscending, in.DisplayFilenameFetch, in.DisplayFilenameCaseInsensitive); 
      if (map != null) record.put ("DisplayFilename", map);
      map = DataHelper.filterToMap (in.CustomerDocumentUrl, in.CustomerDocumentUrlSort, in.CustomerDocumentUrlSortAscending, in.CustomerDocumentUrlFetch, in.CustomerDocumentUrlCaseInsensitive); 
      if (map != null) record.put ("CustomerDocumentUrl", map);
      map = DataHelper.filterToMap (in.DocumentId, in.DocumentIdSort, in.DocumentIdSortAscending, in.DocumentIdFetch); 
      if (map != null) record.put ("DocumentId", map);
      map = DataHelper.filterToMap (in.DocumentTypeid, in.DocumentTypeidSort, in.DocumentTypeidSortAscending, in.DocumentTypeidFetch); 
      if (map != null) record.put ("DocumentTypeid", map);
    return record;
  }
  /** convert Map to CustomerDtUrlObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDtUrlObjectData the converted object
   */
  public static CustomerDtUrlObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDtUrlObjectData out = new CustomerDtUrlObjectData ();

    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("PaymentDueDate")) != null)
    {
      out.PaymentDueDate = (Date) obj;
    }
  
    if ((obj = record.get ("PrepDate")) != null)
    {
      out.PrepDate = (Date) obj;
    }
  
    if ((obj = record.get ("DisplayFilename")) != null)
    {
      out.DisplayFilename = (String) obj;
    }
  
    if ((obj = record.get ("CustomerDocumentUrl")) != null)
    {
      out.CustomerDocumentUrl = (String) obj;
    }
  
    if ((obj = record.get ("DocumentId")) != null)
    {
      out.DocumentId = (Integer) obj;
    }
  
    if ((obj = record.get ("DocumentTypeid")) != null)
    {
      out.DocumentTypeid = (Integer) obj;
    }
      return out;
  }
  /** convert Map to CustomerDtUrlObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDtUrlObjectFilter the converted object
   */
  public static CustomerDtUrlObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDtUrlObjectFilter out = new CustomerDtUrlObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
