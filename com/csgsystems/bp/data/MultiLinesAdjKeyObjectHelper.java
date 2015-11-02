/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: MultiLinesAdjKeyObjectHelper.java
 * Definition File: Customer/MultiLinesAdj.xml
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



/** Helper class to convert MultiLinesAdjKeyObject JavaBean objects to/from HashMaps.
 */
public class MultiLinesAdjKeyObjectHelper implements ArubaObjectHelper
{
  /** convert MultiLinesAdjKeyObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (MultiLinesAdjKeyObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert MultiLinesAdjKeyObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "MultiLinesAdjKeyObject")
   * @return Map     the output Map
   */
  public static Map toMap (MultiLinesAdjKeyObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "MultiLinesAdjKeyObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert MultiLinesAdjKeyObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (MultiLinesAdjKeyObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert MultiLinesAdjKeyObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "MultiLinesAdjKeyObject")
   * @return Map     the output Map
   */
  public static Map toMap (MultiLinesAdjKeyObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "MultiLinesAdjKeyObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to MultiLinesAdjKeyObjectData.
   * @param record the Map containing the data to convert to the object
   * @return MultiLinesAdjKeyObjectData the converted object
   */
  public static MultiLinesAdjKeyObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to MultiLinesAdjKeyObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "MultiLinesAdjKeyObject")
   * @return MultiLinesAdjKeyObjectData the converted object
   */
  public static MultiLinesAdjKeyObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "MultiLinesAdjKeyObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to MultiLinesAdjKeyObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return MultiLinesAdjKeyObjectFilter the converted object
   */
  public static MultiLinesAdjKeyObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to MultiLinesAdjKeyObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "MultiLinesAdjKeyObject")
   * @return MultiLinesAdjKeyObjectFilter the converted object
   */
  public static MultiLinesAdjKeyObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "MultiLinesAdjKeyObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to MultiLinesAdjKeyObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return MultiLinesAdjKeyObjectDataList the converted object
   */
  public static MultiLinesAdjKeyObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to MultiLinesAdjKeyObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "MultiLinesAdjKeyObjectList")
   * @return MultiLinesAdjKeyObjectDataList the converted object
   */
  public static MultiLinesAdjKeyObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "MultiLinesAdjKeyObjectList";
    Object[] root = (Object[]) record.get (rootName);
    MultiLinesAdjKeyObjectData[] array = null;
    if (root != null)
    {
      array = new MultiLinesAdjKeyObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = MultiLinesAdjKeyObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new MultiLinesAdjKeyObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new MultiLinesAdjKeyObjectDataList (array, index, total);
  }
  /** convert MultiLinesAdjKeyObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (MultiLinesAdjKeyObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._BillRefNo1Set) record.put ("BillRefNo1", in.BillRefNo1);
  
    if (in._BillRefResets1Set) record.put ("BillRefResets1", in.BillRefResets1);
  
    if (in._AccountNo1Set) record.put ("AccountNo1", in.AccountNo1);
      return record;
  }
  /** convert MultiLinesAdjKeyObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (MultiLinesAdjKeyObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.BillRefNo1, in.BillRefNo1Sort, in.BillRefNo1SortAscending, in.BillRefNo1Fetch);
      if (map != null) record.put ("BillRefNo1", map);
      map = DataHelper.filterToMap (in.BillRefResets1, in.BillRefResets1Sort, in.BillRefResets1SortAscending, in.BillRefResets1Fetch);
      if (map != null) record.put ("BillRefResets1", map);
      map = DataHelper.filterToMap (in.AccountNo1, in.AccountNo1Sort, in.AccountNo1SortAscending, in.AccountNo1Fetch);
      if (map != null) record.put ("AccountNo1", map);
    return record;
  }
  /** convert Map to MultiLinesAdjKeyObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return MultiLinesAdjKeyObjectData the converted object
   */
  public static MultiLinesAdjKeyObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    MultiLinesAdjKeyObjectData out = new MultiLinesAdjKeyObjectData ();

    if ((obj = record.get ("BillRefNo1")) != null)
    {
      out.BillRefNo1 = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets1")) != null)
    {
      out.BillRefResets1 = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountNo1")) != null)
    {
      out.AccountNo1 = (Integer) obj;
    }
      return out;
  }
  /** convert Map to MultiLinesAdjKeyObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return MultiLinesAdjKeyObjectFilter the converted object
   */
  public static MultiLinesAdjKeyObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    MultiLinesAdjKeyObjectFilter out = new MultiLinesAdjKeyObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map BillRefNo1Map = (Map)record.get("BillRefNo1");
    Boolean BillRefNo1Fetch = DataHelper.getFetch(BillRefNo1Map);
    Boolean BillRefNo1SortDir = DataHelper.getSortDirection(BillRefNo1Map);
    Integer BillRefNo1SortOrder = DataHelper.getSortOrder(BillRefNo1Map);
    if (BillRefNo1Fetch != null) out.setBillRefNo1Fetch(BillRefNo1Fetch);
    if (BillRefNo1SortDir != null) out.setBillRefNo1SortDirection(BillRefNo1SortDir);
    if (BillRefNo1SortOrder != null) out.setBillRefNo1SortOrder(BillRefNo1SortOrder);

    Filter[] BillRefNo1Filter = DataHelper.mapToFilterArray(BillRefNo1Map, Integer.class);
    if (BillRefNo1Filter != null) {
      IntegerFilter[] BillRefNo1Filters = new IntegerFilter[BillRefNo1Filter.length];
      for (int i = 0; i < BillRefNo1Filters.length; i++) {
        BillRefNo1Filters[i] = (IntegerFilter)BillRefNo1Filter[i];
      }
      try {
        out.setBillRefNo1Filter(BillRefNo1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefResets1Map = (Map)record.get("BillRefResets1");
    Boolean BillRefResets1Fetch = DataHelper.getFetch(BillRefResets1Map);
    Boolean BillRefResets1SortDir = DataHelper.getSortDirection(BillRefResets1Map);
    Integer BillRefResets1SortOrder = DataHelper.getSortOrder(BillRefResets1Map);
    if (BillRefResets1Fetch != null) out.setBillRefResets1Fetch(BillRefResets1Fetch);
    if (BillRefResets1SortDir != null) out.setBillRefResets1SortDirection(BillRefResets1SortDir);
    if (BillRefResets1SortOrder != null) out.setBillRefResets1SortOrder(BillRefResets1SortOrder);

    Filter[] BillRefResets1Filter = DataHelper.mapToFilterArray(BillRefResets1Map, Integer.class);
    if (BillRefResets1Filter != null) {
      IntegerFilter[] BillRefResets1Filters = new IntegerFilter[BillRefResets1Filter.length];
      for (int i = 0; i < BillRefResets1Filters.length; i++) {
        BillRefResets1Filters[i] = (IntegerFilter)BillRefResets1Filter[i];
      }
      try {
        out.setBillRefResets1Filter(BillRefResets1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountNo1Map = (Map)record.get("AccountNo1");
    Boolean AccountNo1Fetch = DataHelper.getFetch(AccountNo1Map);
    Boolean AccountNo1SortDir = DataHelper.getSortDirection(AccountNo1Map);
    Integer AccountNo1SortOrder = DataHelper.getSortOrder(AccountNo1Map);
    if (AccountNo1Fetch != null) out.setAccountNo1Fetch(AccountNo1Fetch);
    if (AccountNo1SortDir != null) out.setAccountNo1SortDirection(AccountNo1SortDir);
    if (AccountNo1SortOrder != null) out.setAccountNo1SortOrder(AccountNo1SortOrder);

    Filter[] AccountNo1Filter = DataHelper.mapToFilterArray(AccountNo1Map, Integer.class);
    if (AccountNo1Filter != null) {
      IntegerFilter[] AccountNo1Filters = new IntegerFilter[AccountNo1Filter.length];
      for (int i = 0; i < AccountNo1Filters.length; i++) {
        AccountNo1Filters[i] = (IntegerFilter)AccountNo1Filter[i];
      }
      try {
        out.setAccountNo1Filter(AccountNo1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
