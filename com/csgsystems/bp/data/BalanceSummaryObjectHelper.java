/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BalanceSummaryObjectHelper.java
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


/** Helper class to convert BalanceSummaryObject JavaBean objects to/from HashMaps.
 */
public class BalanceSummaryObjectHelper implements ArubaObjectHelper
{
  /** convert BalanceSummaryObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BalanceSummaryObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BalanceSummaryObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BalanceSummaryObject")
   * @return Map     the output Map
   */
  public static Map toMap (BalanceSummaryObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BalanceSummaryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BalanceSummaryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BalanceSummaryObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BalanceSummaryObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BalanceSummaryObject")
   * @return Map     the output Map
   */
  public static Map toMap (BalanceSummaryObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BalanceSummaryObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BalanceSummaryObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BalanceSummaryObjectData the converted object
   */
  public static BalanceSummaryObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BalanceSummaryObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BalanceSummaryObject")
   * @return BalanceSummaryObjectData the converted object
   */
  public static BalanceSummaryObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BalanceSummaryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BalanceSummaryObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BalanceSummaryObjectFilter the converted object
   */
  public static BalanceSummaryObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BalanceSummaryObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BalanceSummaryObject")
   * @return BalanceSummaryObjectFilter the converted object
   */
  public static BalanceSummaryObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BalanceSummaryObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BalanceSummaryObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BalanceSummaryObjectDataList the converted object
   */
  public static BalanceSummaryObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BalanceSummaryObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BalanceSummaryObjectList")
   * @return BalanceSummaryObjectDataList the converted object
   */
  public static BalanceSummaryObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BalanceSummaryObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BalanceSummaryObjectData[] array = null;
    if (root != null)
    {
      array = new BalanceSummaryObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BalanceSummaryObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BalanceSummaryObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BalanceSummaryObjectDataList (array, index, total);
  }
  /** convert BalanceSummaryObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BalanceSummaryObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TransAmountSet) record.put ("TransAmount", in.TransAmount);
  
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
      return record;
  }
  /** convert BalanceSummaryObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BalanceSummaryObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TransAmount, in.TransAmountSort, in.TransAmountSortAscending, in.TransAmountFetch); 
      if (map != null) record.put ("TransAmount", map);
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive); 
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch); 
      if (map != null) record.put ("AccountExternalIdType", map);
    return record;
  }
  /** convert Map to BalanceSummaryObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BalanceSummaryObjectData the converted object
   */
  public static BalanceSummaryObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BalanceSummaryObjectData out = new BalanceSummaryObjectData ();

    if ((obj = record.get ("TransAmount")) != null)
    {
      out.TransAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
      return out;
  }
  /** convert Map to BalanceSummaryObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BalanceSummaryObjectFilter the converted object
   */
  public static BalanceSummaryObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BalanceSummaryObjectFilter out = new BalanceSummaryObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    return out;
  }
}
