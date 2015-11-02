/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteCodeObjectHelper.java
 * Definition File: Admin/NoteCode.xml
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



/** Helper class to convert NoteCodeObject JavaBean objects to/from HashMaps.
 */
public class NoteCodeObjectHelper implements ArubaObjectHelper
{
  /** convert NoteCodeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (NoteCodeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteCodeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteCodeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteCodeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert NoteCodeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NoteCodeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteCodeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteCodeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteCodeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to NoteCodeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return NoteCodeObjectData the converted object
   */
  public static NoteCodeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to NoteCodeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "NoteCodeObject")
   * @return NoteCodeObjectData the converted object
   */
  public static NoteCodeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to NoteCodeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return NoteCodeObjectFilter the converted object
   */
  public static NoteCodeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to NoteCodeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "NoteCodeObject")
   * @return NoteCodeObjectFilter the converted object
   */
  public static NoteCodeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to NoteCodeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return NoteCodeObjectDataList the converted object
   */
  public static NoteCodeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to NoteCodeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "NoteCodeObjectList")
   * @return NoteCodeObjectDataList the converted object
   */
  public static NoteCodeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteCodeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    NoteCodeObjectData[] array = null;
    if (root != null)
    {
      array = new NoteCodeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = NoteCodeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new NoteCodeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new NoteCodeObjectDataList (array, index, total);
  }
  /** convert NoteCodeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (NoteCodeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", NoteCodeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));    return record;
  }
  /** convert NoteCodeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (NoteCodeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", NoteCodeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    return record;
  }
  /** convert Map to NoteCodeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteCodeObjectData the converted object
   */
  public static NoteCodeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteCodeObjectData out = new NoteCodeObjectData ();

    out.Key = NoteCodeObjectKeyHelper.getObj ((Map) record.get ("Key"));    return out;
  }
  /** convert Map to NoteCodeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteCodeObjectFilter the converted object
   */
  public static NoteCodeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteCodeObjectFilter out = new NoteCodeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = NoteCodeObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    return out;
  }
}
