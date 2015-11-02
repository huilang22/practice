/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAndDiscountAmountObjectHelper.java
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


/** Helper class to convert TaxAndDiscountAmountObject JavaBean objects to/from HashMaps.
 */
public class TaxAndDiscountAmountObjectHelper implements ArubaObjectHelper
{
  /** convert TaxAndDiscountAmountObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (TaxAndDiscountAmountObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAndDiscountAmountObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAndDiscountAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAndDiscountAmountObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAndDiscountAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert TaxAndDiscountAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxAndDiscountAmountObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAndDiscountAmountObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAndDiscountAmountObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAndDiscountAmountObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAndDiscountAmountObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TaxAndDiscountAmountObjectData.
   * @param record the Map containing the data to convert to the object
   * @return TaxAndDiscountAmountObjectData the converted object
   */
  public static TaxAndDiscountAmountObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TaxAndDiscountAmountObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TaxAndDiscountAmountObject")
   * @return TaxAndDiscountAmountObjectData the converted object
   */
  public static TaxAndDiscountAmountObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAndDiscountAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TaxAndDiscountAmountObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return TaxAndDiscountAmountObjectFilter the converted object
   */
  public static TaxAndDiscountAmountObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TaxAndDiscountAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TaxAndDiscountAmountObject")
   * @return TaxAndDiscountAmountObjectFilter the converted object
   */
  public static TaxAndDiscountAmountObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAndDiscountAmountObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to TaxAndDiscountAmountObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return TaxAndDiscountAmountObjectDataList the converted object
   */
  public static TaxAndDiscountAmountObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to TaxAndDiscountAmountObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "TaxAndDiscountAmountObjectList")
   * @return TaxAndDiscountAmountObjectDataList the converted object
   */
  public static TaxAndDiscountAmountObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAndDiscountAmountObjectList";
    Object[] root = (Object[]) record.get (rootName);
    TaxAndDiscountAmountObjectData[] array = null;
    if (root != null)
    {
      array = new TaxAndDiscountAmountObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = TaxAndDiscountAmountObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new TaxAndDiscountAmountObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new TaxAndDiscountAmountObjectDataList (array, index, total);
  }
  /** convert TaxAndDiscountAmountObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxAndDiscountAmountObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._DiscountSet) record.put ("Discount", in.Discount);
  
    if (in._TaxSet) record.put ("Tax", in.Tax);
      return record;
  }
  /** convert TaxAndDiscountAmountObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxAndDiscountAmountObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.Discount, in.DiscountSort, in.DiscountSortAscending, in.DiscountFetch); 
      if (map != null) record.put ("Discount", map);
      map = DataHelper.filterToMap (in.Tax, in.TaxSort, in.TaxSortAscending, in.TaxFetch); 
      if (map != null) record.put ("Tax", map);
    return record;
  }
  /** convert Map to TaxAndDiscountAmountObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAndDiscountAmountObjectData the converted object
   */
  public static TaxAndDiscountAmountObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAndDiscountAmountObjectData out = new TaxAndDiscountAmountObjectData ();

    if ((obj = record.get ("Discount")) != null)
    {
      out.Discount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Tax")) != null)
    {
      out.Tax = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to TaxAndDiscountAmountObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAndDiscountAmountObjectFilter the converted object
   */
  public static TaxAndDiscountAmountObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAndDiscountAmountObjectFilter out = new TaxAndDiscountAmountObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
