/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceSummaryObjectHelper.java
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


/** Helper class to convert InvoiceSummaryObject JavaBean objects to/from HashMaps.
 */
public class InvoiceSummaryObjectHelper implements ArubaObjectHelper
{
  /** convert InvoiceSummaryObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (InvoiceSummaryObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceSummaryObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceSummaryObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceSummaryObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceSummaryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert InvoiceSummaryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceSummaryObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceSummaryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceSummaryObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceSummaryObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceSummaryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to InvoiceSummaryObjectData.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceSummaryObjectData the converted object
   */
  public static InvoiceSummaryObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to InvoiceSummaryObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "InvoiceSummaryObject")
   * @return InvoiceSummaryObjectData the converted object
   */
  public static InvoiceSummaryObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceSummaryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to InvoiceSummaryObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceSummaryObjectFilter the converted object
   */
  public static InvoiceSummaryObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to InvoiceSummaryObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "InvoiceSummaryObject")
   * @return InvoiceSummaryObjectFilter the converted object
   */
  public static InvoiceSummaryObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceSummaryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to InvoiceSummaryObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return InvoiceSummaryObjectDataList the converted object
   */
  public static InvoiceSummaryObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to InvoiceSummaryObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "InvoiceSummaryObjectList")
   * @return InvoiceSummaryObjectDataList the converted object
   */
  public static InvoiceSummaryObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceSummaryObjectList";
    Object[] root = (Object[]) record.get (rootName);
    InvoiceSummaryObjectData[] array = null;
    if (root != null)
    {
      array = new InvoiceSummaryObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = InvoiceSummaryObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new InvoiceSummaryObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new InvoiceSummaryObjectDataList (array, index, total);
  }
  /** convert InvoiceSummaryObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceSummaryObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._UsageTotalSet) record.put ("UsageTotal", in.UsageTotal);
  
    if (in._UsageNumberSet) record.put ("UsageNumber", in.UsageNumber);
  
    if (in._RcTotalSet) record.put ("RcTotal", in.RcTotal);
  
    if (in._RcNumberSet) record.put ("RcNumber", in.RcNumber);
  
    if (in._NrcTotalSet) record.put ("NrcTotal", in.NrcTotal);
  
    if (in._NrcNumberSet) record.put ("NrcNumber", in.NrcNumber);
  
    if (in._AdjNumberSet) record.put ("AdjNumber", in.AdjNumber);
  
    if (in._PaymentNumberSet) record.put ("PaymentNumber", in.PaymentNumber);
  
    if (in._TaxTotalSet) record.put ("TaxTotal", in.TaxTotal);
  
    if (in._PostPaymentNumberSet) record.put ("PostPaymentNumber", in.PostPaymentNumber);
  
    if (in._PostPaymentTotalSet) record.put ("PostPaymentTotal", in.PostPaymentTotal);
  
    if (in._PrevBalanceDueSet) record.put ("PrevBalanceDue", in.PrevBalanceDue);
      return record;
  }
  /** convert InvoiceSummaryObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceSummaryObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.UsageTotal, in.UsageTotalSort, in.UsageTotalSortAscending, in.UsageTotalFetch); 
      if (map != null) record.put ("UsageTotal", map);
      map = DataHelper.filterToMap (in.UsageNumber, in.UsageNumberSort, in.UsageNumberSortAscending, in.UsageNumberFetch); 
      if (map != null) record.put ("UsageNumber", map);
      map = DataHelper.filterToMap (in.RcTotal, in.RcTotalSort, in.RcTotalSortAscending, in.RcTotalFetch); 
      if (map != null) record.put ("RcTotal", map);
      map = DataHelper.filterToMap (in.RcNumber, in.RcNumberSort, in.RcNumberSortAscending, in.RcNumberFetch); 
      if (map != null) record.put ("RcNumber", map);
      map = DataHelper.filterToMap (in.NrcTotal, in.NrcTotalSort, in.NrcTotalSortAscending, in.NrcTotalFetch); 
      if (map != null) record.put ("NrcTotal", map);
      map = DataHelper.filterToMap (in.NrcNumber, in.NrcNumberSort, in.NrcNumberSortAscending, in.NrcNumberFetch); 
      if (map != null) record.put ("NrcNumber", map);
      map = DataHelper.filterToMap (in.AdjNumber, in.AdjNumberSort, in.AdjNumberSortAscending, in.AdjNumberFetch); 
      if (map != null) record.put ("AdjNumber", map);
      map = DataHelper.filterToMap (in.PaymentNumber, in.PaymentNumberSort, in.PaymentNumberSortAscending, in.PaymentNumberFetch); 
      if (map != null) record.put ("PaymentNumber", map);
      map = DataHelper.filterToMap (in.TaxTotal, in.TaxTotalSort, in.TaxTotalSortAscending, in.TaxTotalFetch); 
      if (map != null) record.put ("TaxTotal", map);
      map = DataHelper.filterToMap (in.PostPaymentNumber, in.PostPaymentNumberSort, in.PostPaymentNumberSortAscending, in.PostPaymentNumberFetch); 
      if (map != null) record.put ("PostPaymentNumber", map);
      map = DataHelper.filterToMap (in.PostPaymentTotal, in.PostPaymentTotalSort, in.PostPaymentTotalSortAscending, in.PostPaymentTotalFetch); 
      if (map != null) record.put ("PostPaymentTotal", map);
      map = DataHelper.filterToMap (in.PrevBalanceDue, in.PrevBalanceDueSort, in.PrevBalanceDueSortAscending, in.PrevBalanceDueFetch); 
      if (map != null) record.put ("PrevBalanceDue", map);
    return record;
  }
  /** convert Map to InvoiceSummaryObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceSummaryObjectData the converted object
   */
  public static InvoiceSummaryObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceSummaryObjectData out = new InvoiceSummaryObjectData ();

    if ((obj = record.get ("UsageTotal")) != null)
    {
      out.UsageTotal = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UsageNumber")) != null)
    {
      out.UsageNumber = (Integer) obj;
    }
  
    if ((obj = record.get ("RcTotal")) != null)
    {
      out.RcTotal = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RcNumber")) != null)
    {
      out.RcNumber = (Integer) obj;
    }
  
    if ((obj = record.get ("NrcTotal")) != null)
    {
      out.NrcTotal = (BigInteger) obj;
    }
  
    if ((obj = record.get ("NrcNumber")) != null)
    {
      out.NrcNumber = (Integer) obj;
    }
  
    if ((obj = record.get ("AdjNumber")) != null)
    {
      out.AdjNumber = (Integer) obj;
    }
  
    if ((obj = record.get ("PaymentNumber")) != null)
    {
      out.PaymentNumber = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxTotal")) != null)
    {
      out.TaxTotal = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PostPaymentNumber")) != null)
    {
      out.PostPaymentNumber = (Integer) obj;
    }
  
    if ((obj = record.get ("PostPaymentTotal")) != null)
    {
      out.PostPaymentTotal = (BigInteger) obj;
    }
  
    if ((obj = record.get ("PrevBalanceDue")) != null)
    {
      out.PrevBalanceDue = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to InvoiceSummaryObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceSummaryObjectFilter the converted object
   */
  public static InvoiceSummaryObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceSummaryObjectFilter out = new InvoiceSummaryObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
