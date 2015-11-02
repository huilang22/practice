/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CustomerDtUrlInputObjectHelper.java
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



/** Helper class to convert CustomerDtUrlInputObject JavaBean objects to/from HashMaps.
 */
public class CustomerDtUrlInputObjectHelper implements ArubaObjectHelper
{
  /** convert CustomerDtUrlInputObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CustomerDtUrlInputObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDtUrlInputObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDtUrlInputObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtUrlInputObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDtUrlInputObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CustomerDtUrlInputObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtUrlInputObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CustomerDtUrlInputObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CustomerDtUrlInputObject")
   * @return Map     the output Map
   */
  public static Map toMap (CustomerDtUrlInputObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CustomerDtUrlInputObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CustomerDtUrlInputObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDtUrlInputObjectData the converted object
   */
  public static CustomerDtUrlInputObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CustomerDtUrlInputObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CustomerDtUrlInputObject")
   * @return CustomerDtUrlInputObjectData the converted object
   */
  public static CustomerDtUrlInputObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtUrlInputObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CustomerDtUrlInputObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CustomerDtUrlInputObjectFilter the converted object
   */
  public static CustomerDtUrlInputObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CustomerDtUrlInputObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CustomerDtUrlInputObject")
   * @return CustomerDtUrlInputObjectFilter the converted object
   */
  public static CustomerDtUrlInputObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtUrlInputObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CustomerDtUrlInputObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CustomerDtUrlInputObjectDataList the converted object
   */
  public static CustomerDtUrlInputObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CustomerDtUrlInputObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CustomerDtUrlInputObjectList")
   * @return CustomerDtUrlInputObjectDataList the converted object
   */
  public static CustomerDtUrlInputObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CustomerDtUrlInputObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CustomerDtUrlInputObjectData[] array = null;
    if (root != null)
    {
      array = new CustomerDtUrlInputObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CustomerDtUrlInputObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CustomerDtUrlInputObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CustomerDtUrlInputObjectDataList (array, index, total);
  }
  /** convert CustomerDtUrlInputObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDtUrlInputObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AccountNoSet) record.put ("AccountNo", in.AccountNo);
  
    if (in._StatementDateSet) record.put ("StatementDate", in.StatementDate);
  
    if (in._InvoiceTypeSet) record.put ("InvoiceType", in.InvoiceType);
      return record;
  }
  /** convert CustomerDtUrlInputObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CustomerDtUrlInputObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AccountNo, in.AccountNoSort, in.AccountNoSortAscending, in.AccountNoFetch); 
      if (map != null) record.put ("AccountNo", map);
      map = DataHelper.filterToMap (in.StatementDate, in.StatementDateSort, in.StatementDateSortAscending, in.StatementDateFetch); 
      if (map != null) record.put ("StatementDate", map);
      map = DataHelper.filterToMap (in.InvoiceType, in.InvoiceTypeSort, in.InvoiceTypeSortAscending, in.InvoiceTypeFetch); 
      if (map != null) record.put ("InvoiceType", map);
    return record;
  }
  /** convert Map to CustomerDtUrlInputObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDtUrlInputObjectData the converted object
   */
  public static CustomerDtUrlInputObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDtUrlInputObjectData out = new CustomerDtUrlInputObjectData ();

    if ((obj = record.get ("AccountNo")) != null)
    {
      out.AccountNo = (Integer) obj;
    }
  
    if ((obj = record.get ("StatementDate")) != null)
    {
      out.StatementDate = (Date) obj;
    }
  
    if ((obj = record.get ("InvoiceType")) != null)
    {
      out.InvoiceType = (Integer) obj;
    }
      return out;
  }
  /** convert Map to CustomerDtUrlInputObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CustomerDtUrlInputObjectFilter the converted object
   */
  public static CustomerDtUrlInputObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CustomerDtUrlInputObjectFilter out = new CustomerDtUrlInputObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
