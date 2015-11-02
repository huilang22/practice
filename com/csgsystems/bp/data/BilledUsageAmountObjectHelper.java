/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BilledUsageAmountObjectHelper.java
 * Definition File: Customer/BilledUsage.xml
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


/** Helper class to convert BilledUsageAmountObject JavaBean objects to/from HashMaps.
 */
public class BilledUsageAmountObjectHelper implements ArubaObjectHelper
{
  /** convert BilledUsageAmountObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BilledUsageAmountObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BilledUsageAmountObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BilledUsageAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageAmountObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BilledUsageAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BilledUsageAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageAmountObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BilledUsageAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BilledUsageAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (BilledUsageAmountObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BilledUsageAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BilledUsageAmountObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BilledUsageAmountObjectData the converted object
   */
  public static BilledUsageAmountObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BilledUsageAmountObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BilledUsageAmountObject")
   * @return BilledUsageAmountObjectData the converted object
   */
  public static BilledUsageAmountObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BilledUsageAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BilledUsageAmountObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BilledUsageAmountObjectFilter the converted object
   */
  public static BilledUsageAmountObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BilledUsageAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BilledUsageAmountObject")
   * @return BilledUsageAmountObjectFilter the converted object
   */
  public static BilledUsageAmountObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BilledUsageAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BilledUsageAmountObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BilledUsageAmountObjectDataList the converted object
   */
  public static BilledUsageAmountObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BilledUsageAmountObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BilledUsageAmountObjectList")
   * @return BilledUsageAmountObjectDataList the converted object
   */
  public static BilledUsageAmountObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BilledUsageAmountObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BilledUsageAmountObjectData[] array = null;
    if (root != null)
    {
      array = new BilledUsageAmountObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BilledUsageAmountObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BilledUsageAmountObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BilledUsageAmountObjectDataList (array, index, total);
  }
  /** convert BilledUsageAmountObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BilledUsageAmountObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AdjustmentEligibleAmountSet) record.put ("AdjustmentEligibleAmount", in.AdjustmentEligibleAmount);
  
    if (in._DiscountSet) record.put ("Discount", in.Discount);
  
    if (in._TaxSet) record.put ("Tax", in.Tax);
  
    if (in._BilledUsageTaxExclusiveAmountSet) record.put ("BilledUsageTaxExclusiveAmount", in.BilledUsageTaxExclusiveAmount);
      return record;
  }
  /** convert BilledUsageAmountObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BilledUsageAmountObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AdjustmentEligibleAmount, in.AdjustmentEligibleAmountSort, in.AdjustmentEligibleAmountSortAscending, in.AdjustmentEligibleAmountFetch); 
      if (map != null) record.put ("AdjustmentEligibleAmount", map);
      map = DataHelper.filterToMap (in.Discount, in.DiscountSort, in.DiscountSortAscending, in.DiscountFetch); 
      if (map != null) record.put ("Discount", map);
      map = DataHelper.filterToMap (in.Tax, in.TaxSort, in.TaxSortAscending, in.TaxFetch); 
      if (map != null) record.put ("Tax", map);
      map = DataHelper.filterToMap (in.BilledUsageTaxExclusiveAmount, in.BilledUsageTaxExclusiveAmountSort, in.BilledUsageTaxExclusiveAmountSortAscending, in.BilledUsageTaxExclusiveAmountFetch); 
      if (map != null) record.put ("BilledUsageTaxExclusiveAmount", map);
    return record;
  }
  /** convert Map to BilledUsageAmountObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BilledUsageAmountObjectData the converted object
   */
  public static BilledUsageAmountObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BilledUsageAmountObjectData out = new BilledUsageAmountObjectData ();

    if ((obj = record.get ("AdjustmentEligibleAmount")) != null)
    {
      out.AdjustmentEligibleAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Discount")) != null)
    {
      out.Discount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Tax")) != null)
    {
      out.Tax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BilledUsageTaxExclusiveAmount")) != null)
    {
      out.BilledUsageTaxExclusiveAmount = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to BilledUsageAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BilledUsageAmountObjectFilter the converted object
   */
  public static BilledUsageAmountObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BilledUsageAmountObjectFilter out = new BilledUsageAmountObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
