/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnbilledUsageAmountObjectHelper.java
 * Definition File: Customer/UnbilledUsage.xml
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


/** Helper class to convert UnbilledUsageAmountObject JavaBean objects to/from HashMaps.
 */
public class UnbilledUsageAmountObjectHelper implements ArubaObjectHelper
{
  /** convert UnbilledUsageAmountObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (UnbilledUsageAmountObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageAmountObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageAmountObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert UnbilledUsageAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageAmountObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnbilledUsageAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnbilledUsageAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnbilledUsageAmountObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnbilledUsageAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to UnbilledUsageAmountObjectData.
   * @param record the Map containing the data to convert to the object
   * @return UnbilledUsageAmountObjectData the converted object
   */
  public static UnbilledUsageAmountObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to UnbilledUsageAmountObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "UnbilledUsageAmountObject")
   * @return UnbilledUsageAmountObjectData the converted object
   */
  public static UnbilledUsageAmountObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to UnbilledUsageAmountObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return UnbilledUsageAmountObjectFilter the converted object
   */
  public static UnbilledUsageAmountObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to UnbilledUsageAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "UnbilledUsageAmountObject")
   * @return UnbilledUsageAmountObjectFilter the converted object
   */
  public static UnbilledUsageAmountObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to UnbilledUsageAmountObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return UnbilledUsageAmountObjectDataList the converted object
   */
  public static UnbilledUsageAmountObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to UnbilledUsageAmountObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "UnbilledUsageAmountObjectList")
   * @return UnbilledUsageAmountObjectDataList the converted object
   */
  public static UnbilledUsageAmountObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnbilledUsageAmountObjectList";
    Object[] root = (Object[]) record.get (rootName);
    UnbilledUsageAmountObjectData[] array = null;
    if (root != null)
    {
      array = new UnbilledUsageAmountObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = UnbilledUsageAmountObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new UnbilledUsageAmountObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new UnbilledUsageAmountObjectDataList (array, index, total);
  }
  /** convert UnbilledUsageAmountObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnbilledUsageAmountObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._AdjustmentEligibleAmountSet) record.put ("AdjustmentEligibleAmount", in.AdjustmentEligibleAmount);
  
    if (in._TaxSet) record.put ("Tax", in.Tax);
  
    if (in._UnbilledUsageTaxExclusiveAmountSet) record.put ("UnbilledUsageTaxExclusiveAmount", in.UnbilledUsageTaxExclusiveAmount);
  
    if (in._AmountCreditedSet) record.put ("AmountCredited", in.AmountCredited);
  
    if (in._UnitsCreditedSet) record.put ("UnitsCredited", in.UnitsCredited);
      return record;
  }
  /** convert UnbilledUsageAmountObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnbilledUsageAmountObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.AdjustmentEligibleAmount, in.AdjustmentEligibleAmountSort, in.AdjustmentEligibleAmountSortAscending, in.AdjustmentEligibleAmountFetch); 
      if (map != null) record.put ("AdjustmentEligibleAmount", map);
      map = DataHelper.filterToMap (in.Tax, in.TaxSort, in.TaxSortAscending, in.TaxFetch); 
      if (map != null) record.put ("Tax", map);
      map = DataHelper.filterToMap (in.UnbilledUsageTaxExclusiveAmount, in.UnbilledUsageTaxExclusiveAmountSort, in.UnbilledUsageTaxExclusiveAmountSortAscending, in.UnbilledUsageTaxExclusiveAmountFetch); 
      if (map != null) record.put ("UnbilledUsageTaxExclusiveAmount", map);
      map = DataHelper.filterToMap (in.AmountCredited, in.AmountCreditedSort, in.AmountCreditedSortAscending, in.AmountCreditedFetch); 
      if (map != null) record.put ("AmountCredited", map);
      map = DataHelper.filterToMap (in.UnitsCredited, in.UnitsCreditedSort, in.UnitsCreditedSortAscending, in.UnitsCreditedFetch); 
      if (map != null) record.put ("UnitsCredited", map);
    return record;
  }
  /** convert Map to UnbilledUsageAmountObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageAmountObjectData the converted object
   */
  public static UnbilledUsageAmountObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageAmountObjectData out = new UnbilledUsageAmountObjectData ();

    if ((obj = record.get ("AdjustmentEligibleAmount")) != null)
    {
      out.AdjustmentEligibleAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Tax")) != null)
    {
      out.Tax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UnbilledUsageTaxExclusiveAmount")) != null)
    {
      out.UnbilledUsageTaxExclusiveAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AmountCredited")) != null)
    {
      out.AmountCredited = (BigInteger) obj;
    }
  
    if ((obj = record.get ("UnitsCredited")) != null)
    {
      out.UnitsCredited = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to UnbilledUsageAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnbilledUsageAmountObjectFilter the converted object
   */
  public static UnbilledUsageAmountObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnbilledUsageAmountObjectFilter out = new UnbilledUsageAmountObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
