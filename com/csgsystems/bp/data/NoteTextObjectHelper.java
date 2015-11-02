/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteTextObjectHelper.java
 * Definition File: Admin/NoteText.xml
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



/** Helper class to convert NoteTextObject JavaBean objects to/from HashMaps.
 */
public class NoteTextObjectHelper implements ArubaObjectHelper
{
  /** convert NoteTextObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (NoteTextObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteTextObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteTextObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteTextObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteTextObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert NoteTextObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NoteTextObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteTextObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteTextObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteTextObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteTextObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to NoteTextObjectData.
   * @param record the Map containing the data to convert to the object
   * @return NoteTextObjectData the converted object
   */
  public static NoteTextObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to NoteTextObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "NoteTextObject")
   * @return NoteTextObjectData the converted object
   */
  public static NoteTextObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteTextObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to NoteTextObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return NoteTextObjectFilter the converted object
   */
  public static NoteTextObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to NoteTextObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "NoteTextObject")
   * @return NoteTextObjectFilter the converted object
   */
  public static NoteTextObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteTextObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to NoteTextObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return NoteTextObjectDataList the converted object
   */
  public static NoteTextObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to NoteTextObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "NoteTextObjectList")
   * @return NoteTextObjectDataList the converted object
   */
  public static NoteTextObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteTextObjectList";
    Object[] root = (Object[]) record.get (rootName);
    NoteTextObjectData[] array = null;
    if (root != null)
    {
      array = new NoteTextObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = NoteTextObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new NoteTextObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new NoteTextObjectDataList (array, index, total);
  }
  /** convert NoteTextObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (NoteTextObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", NoteTextObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));    return record;
  }
  /** convert NoteTextObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (NoteTextObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", NoteTextObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    return record;
  }
  /** convert Map to NoteTextObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteTextObjectData the converted object
   */
  public static NoteTextObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteTextObjectData out = new NoteTextObjectData ();

    out.Key = NoteTextObjectKeyHelper.getObj ((Map) record.get ("Key"));    return out;
  }
  /** convert Map to NoteTextObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteTextObjectFilter the converted object
   */
  public static NoteTextObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteTextObjectFilter out = new NoteTextObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = NoteTextObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    return out;
  }
}
