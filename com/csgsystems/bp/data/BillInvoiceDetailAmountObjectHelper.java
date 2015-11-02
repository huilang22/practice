/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillInvoiceDetailAmountObjectHelper.java
 * Definition File: Customer/InvoiceDetail.xml
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

import com.csgsystems.bp.data.*;


/** Helper class to convert BillInvoiceDetailAmountObject JavaBean objects to/from HashMaps.
 */
public class BillInvoiceDetailAmountObjectHelper implements ArubaObjectHelper
{
  /** convert BillInvoiceDetailAmountObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BillInvoiceDetailAmountObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInvoiceDetailAmountObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInvoiceDetailAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInvoiceDetailAmountObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInvoiceDetailAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BillInvoiceDetailAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillInvoiceDetailAmountObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillInvoiceDetailAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillInvoiceDetailAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillInvoiceDetailAmountObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillInvoiceDetailAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillInvoiceDetailAmountObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BillInvoiceDetailAmountObjectData the converted object
   */
  public static BillInvoiceDetailAmountObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillInvoiceDetailAmountObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillInvoiceDetailAmountObject")
   * @return BillInvoiceDetailAmountObjectData the converted object
   */
  public static BillInvoiceDetailAmountObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInvoiceDetailAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillInvoiceDetailAmountObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BillInvoiceDetailAmountObjectFilter the converted object
   */
  public static BillInvoiceDetailAmountObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillInvoiceDetailAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillInvoiceDetailAmountObject")
   * @return BillInvoiceDetailAmountObjectFilter the converted object
   */
  public static BillInvoiceDetailAmountObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInvoiceDetailAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BillInvoiceDetailAmountObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BillInvoiceDetailAmountObjectDataList the converted object
   */
  public static BillInvoiceDetailAmountObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BillInvoiceDetailAmountObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BillInvoiceDetailAmountObjectList")
   * @return BillInvoiceDetailAmountObjectDataList the converted object
   */
  public static BillInvoiceDetailAmountObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillInvoiceDetailAmountObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BillInvoiceDetailAmountObjectData[] array = null;
    if (root != null)
    {
      array = new BillInvoiceDetailAmountObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BillInvoiceDetailAmountObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BillInvoiceDetailAmountObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BillInvoiceDetailAmountObjectDataList (array, index, total);
  }
  /** convert BillInvoiceDetailAmountObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillInvoiceDetailAmountObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._DiscountTotalSet) record.put ("DiscountTotal", in.DiscountTotal);
  
    if (in._TotalTaxSet) record.put ("TotalTax", in.TotalTax);
  
    if (in._UntaxesUndiscountedNewChargesSet) record.put ("UntaxesUndiscountedNewCharges", in.UntaxesUndiscountedNewCharges);
      return record;
  }
  /** convert BillInvoiceDetailAmountObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillInvoiceDetailAmountObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.DiscountTotal, in.DiscountTotalSort, in.DiscountTotalSortAscending, in.DiscountTotalFetch); 
      if (map != null) record.put ("DiscountTotal", map);
      map = DataHelper.filterToMap (in.TotalTax, in.TotalTaxSort, in.TotalTaxSortAscending, in.TotalTaxFetch); 
      if (map != null) record.put ("TotalTax", map);
      map = DataHelper.filterToMap (in.UntaxesUndiscountedNewCharges, in.UntaxesUndiscountedNewChargesSort, in.UntaxesUndiscountedNewChargesSortAscending, in.UntaxesUndiscountedNewChargesFetch); 
      if (map != null) record.put ("UntaxesUndiscountedNewCharges", map);
    return record;
  }
  /** convert Map to BillInvoiceDetailAmountObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInvoiceDetailAmountObjectData the converted object
   */
  public static BillInvoiceDetailAmountObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInvoiceDetailAmountObjectData out = new BillInvoiceDetailAmountObjectData ();

    if ((obj = record.get ("DiscountTotal")) != null)
    {
      out.DiscountTotal = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TotalTax")) != null)
    {
      out.TotalTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UntaxesUndiscountedNewCharges")) != null)
    {
      out.UntaxesUndiscountedNewCharges = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to BillInvoiceDetailAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillInvoiceDetailAmountObjectFilter the converted object
   */
  public static BillInvoiceDetailAmountObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillInvoiceDetailAmountObjectFilter out = new BillInvoiceDetailAmountObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
