/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceAmountObjectHelper.java
 * Definition File: Customer/Invoice.xml
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


/** Helper class to convert InvoiceAmountObject JavaBean objects to/from HashMaps.
 */
public class InvoiceAmountObjectHelper implements ArubaObjectHelper
{
  /** convert InvoiceAmountObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (InvoiceAmountObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceAmountObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceAmountObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert InvoiceAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceAmountObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceAmountObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to InvoiceAmountObjectData.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceAmountObjectData the converted object
   */
  public static InvoiceAmountObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to InvoiceAmountObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "InvoiceAmountObject")
   * @return InvoiceAmountObjectData the converted object
   */
  public static InvoiceAmountObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to InvoiceAmountObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceAmountObjectFilter the converted object
   */
  public static InvoiceAmountObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to InvoiceAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "InvoiceAmountObject")
   * @return InvoiceAmountObjectFilter the converted object
   */
  public static InvoiceAmountObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to InvoiceAmountObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return InvoiceAmountObjectDataList the converted object
   */
  public static InvoiceAmountObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to InvoiceAmountObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "InvoiceAmountObjectList")
   * @return InvoiceAmountObjectDataList the converted object
   */
  public static InvoiceAmountObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceAmountObjectList";
    Object[] root = (Object[]) record.get (rootName);
    InvoiceAmountObjectData[] array = null;
    if (root != null)
    {
      array = new InvoiceAmountObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = InvoiceAmountObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new InvoiceAmountObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new InvoiceAmountObjectDataList (array, index, total);
  }
  /** convert InvoiceAmountObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceAmountObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TaxTotalSet) record.put ("TaxTotal", in.TaxTotal);
  
    if (in._DiscountTotalSet) record.put ("DiscountTotal", in.DiscountTotal);
  
    if (in._AdjustmentEligibleAmountSet) record.put ("AdjustmentEligibleAmount", in.AdjustmentEligibleAmount);
  
    if (in._SubTotalNewChargesSet) record.put ("SubTotalNewCharges", in.SubTotalNewCharges);
      return record;
  }
  /** convert InvoiceAmountObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceAmountObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TaxTotal, in.TaxTotalSort, in.TaxTotalSortAscending, in.TaxTotalFetch); 
      if (map != null) record.put ("TaxTotal", map);
      map = DataHelper.filterToMap (in.DiscountTotal, in.DiscountTotalSort, in.DiscountTotalSortAscending, in.DiscountTotalFetch); 
      if (map != null) record.put ("DiscountTotal", map);
      map = DataHelper.filterToMap (in.AdjustmentEligibleAmount, in.AdjustmentEligibleAmountSort, in.AdjustmentEligibleAmountSortAscending, in.AdjustmentEligibleAmountFetch); 
      if (map != null) record.put ("AdjustmentEligibleAmount", map);
      map = DataHelper.filterToMap (in.SubTotalNewCharges, in.SubTotalNewChargesSort, in.SubTotalNewChargesSortAscending, in.SubTotalNewChargesFetch); 
      if (map != null) record.put ("SubTotalNewCharges", map);
    return record;
  }
  /** convert Map to InvoiceAmountObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceAmountObjectData the converted object
   */
  public static InvoiceAmountObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceAmountObjectData out = new InvoiceAmountObjectData ();

    if ((obj = record.get ("TaxTotal")) != null)
    {
      out.TaxTotal = (BigInteger) obj;
    }
  
    if ((obj = record.get ("DiscountTotal")) != null)
    {
      out.DiscountTotal = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AdjustmentEligibleAmount")) != null)
    {
      out.AdjustmentEligibleAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("SubTotalNewCharges")) != null)
    {
      out.SubTotalNewCharges = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to InvoiceAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceAmountObjectFilter the converted object
   */
  public static InvoiceAmountObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceAmountObjectFilter out = new InvoiceAmountObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
