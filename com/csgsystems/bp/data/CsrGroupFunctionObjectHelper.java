/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrGroupFunctionObjectHelper.java
 * Definition File: Admin/CsrGroupFunction.xml
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



/** Helper class to convert CsrGroupFunctionObject JavaBean objects to/from HashMaps.
 */
public class CsrGroupFunctionObjectHelper implements ArubaObjectHelper
{
  /** convert CsrGroupFunctionObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CsrGroupFunctionObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrGroupFunctionObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrGroupFunctionObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupFunctionObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrGroupFunctionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CsrGroupFunctionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupFunctionObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrGroupFunctionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrGroupFunctionObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrGroupFunctionObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrGroupFunctionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CsrGroupFunctionObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CsrGroupFunctionObjectData the converted object
   */
  public static CsrGroupFunctionObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CsrGroupFunctionObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CsrGroupFunctionObject")
   * @return CsrGroupFunctionObjectData the converted object
   */
  public static CsrGroupFunctionObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupFunctionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CsrGroupFunctionObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CsrGroupFunctionObjectFilter the converted object
   */
  public static CsrGroupFunctionObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CsrGroupFunctionObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CsrGroupFunctionObject")
   * @return CsrGroupFunctionObjectFilter the converted object
   */
  public static CsrGroupFunctionObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupFunctionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CsrGroupFunctionObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CsrGroupFunctionObjectDataList the converted object
   */
  public static CsrGroupFunctionObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CsrGroupFunctionObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CsrGroupFunctionObjectList")
   * @return CsrGroupFunctionObjectDataList the converted object
   */
  public static CsrGroupFunctionObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrGroupFunctionObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CsrGroupFunctionObjectData[] array = null;
    if (root != null)
    {
      array = new CsrGroupFunctionObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CsrGroupFunctionObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CsrGroupFunctionObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CsrGroupFunctionObjectDataList (array, index, total);
  }
  /** convert CsrGroupFunctionObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CsrGroupFunctionObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CsrGroupFunctionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));    return record;
  }
  /** convert CsrGroupFunctionObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CsrGroupFunctionObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CsrGroupFunctionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    return record;
  }
  /** convert Map to CsrGroupFunctionObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrGroupFunctionObjectData the converted object
   */
  public static CsrGroupFunctionObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrGroupFunctionObjectData out = new CsrGroupFunctionObjectData ();

    out.Key = CsrGroupFunctionObjectKeyHelper.getObj ((Map) record.get ("Key"));    return out;
  }
  /** convert Map to CsrGroupFunctionObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrGroupFunctionObjectFilter the converted object
   */
  public static CsrGroupFunctionObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrGroupFunctionObjectFilter out = new CsrGroupFunctionObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CsrGroupFunctionObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    return out;
  }
}
