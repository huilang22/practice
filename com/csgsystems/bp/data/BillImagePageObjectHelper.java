/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BillImagePageObjectHelper.java
 * Definition File: Customer/BillImagePage.xml
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



/** Helper class to convert BillImagePageObject JavaBean objects to/from HashMaps.
 */
public class BillImagePageObjectHelper implements ArubaObjectHelper
{
  /** convert BillImagePageObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BillImagePageObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillImagePageObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillImagePageObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillImagePageObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillImagePageObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BillImagePageObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BillImagePageObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BillImagePageObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BillImagePageObject")
   * @return Map     the output Map
   */
  public static Map toMap (BillImagePageObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BillImagePageObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BillImagePageObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BillImagePageObjectData the converted object
   */
  public static BillImagePageObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BillImagePageObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BillImagePageObject")
   * @return BillImagePageObjectData the converted object
   */
  public static BillImagePageObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillImagePageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BillImagePageObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BillImagePageObjectFilter the converted object
   */
  public static BillImagePageObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BillImagePageObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BillImagePageObject")
   * @return BillImagePageObjectFilter the converted object
   */
  public static BillImagePageObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BillImagePageObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BillImagePageObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BillImagePageObjectDataList the converted object
   */
  public static BillImagePageObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BillImagePageObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BillImagePageObjectList")
   * @return BillImagePageObjectDataList the converted object
   */
  public static BillImagePageObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BillImagePageObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BillImagePageObjectData[] array = null;
    if (root != null)
    {
      array = new BillImagePageObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BillImagePageObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BillImagePageObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BillImagePageObjectDataList (array, index, total);
  }
  /** convert BillImagePageObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillImagePageObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", BillImagePageObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._PageTextSet) record.put ("PageText", in.PageText);
  
    if (in._ReverseSearchSet) record.put ("ReverseSearch", in.ReverseSearch);
      return record;
  }
  /** convert BillImagePageObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BillImagePageObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", BillImagePageObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.PageText, in.PageTextSort, in.PageTextSortAscending, in.PageTextFetch, in.PageTextCaseInsensitive); 
      if (map != null) record.put ("PageText", map);
      map = DataHelper.filterToMap (in.ReverseSearch, in.ReverseSearchSort, in.ReverseSearchSortAscending, in.ReverseSearchFetch); 
      if (map != null) record.put ("ReverseSearch", map);
    return record;
  }
  /** convert Map to BillImagePageObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillImagePageObjectData the converted object
   */
  public static BillImagePageObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillImagePageObjectData out = new BillImagePageObjectData ();

    out.Key = BillImagePageObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("PageText")) != null)
    {
      out.PageText = (String) obj;
    }
  
    if ((obj = record.get ("ReverseSearch")) != null)
    {
      out.ReverseSearch = (Boolean) obj;
    }
      return out;
  }
  /** convert Map to BillImagePageObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BillImagePageObjectFilter the converted object
   */
  public static BillImagePageObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BillImagePageObjectFilter out = new BillImagePageObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = BillImagePageObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    return out;
  }
}
