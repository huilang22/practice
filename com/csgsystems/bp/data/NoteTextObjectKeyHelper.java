/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteTextObjectKeyHelper.java
 * Definition File: Admin/.xml
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

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

/** Helper class for NoteTextObject's Key objects. */
public class NoteTextObjectKeyHelper implements ArubaObjectHelper
{
  /** convert NoteTextObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NoteTextObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteTextObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteTextObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteTextObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteTextObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert NoteTextObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NoteTextObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteTextObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteTextObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteTextObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteTextObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to NoteTextObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return NoteTextObjectKeyData the converted object
   */
  public static NoteTextObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to NoteTextObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "NoteTextObject")
   * @return NoteTextObjectKeyData the converted object
   */
  public static NoteTextObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteTextObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to NoteTextObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return NoteTextObjectKeyFilter the converted object
   */
  public static NoteTextObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to NoteTextObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "NoteTextObject")
   * @return NoteTextObjectKeyFilter the converted object
   */
  public static NoteTextObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteTextObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert NoteTextObjectKeyData to a Map (not including the root).
  /** convert NoteTextObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (NoteTextObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CodeSet) record.put ("Code", in.Code);
  
    if (in._TextSet) record.put ("Text", in.Text);
  
    return record;
  }
  /** convert NoteTextObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (NoteTextObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.Code, in.CodeSort, in.CodeSortAscending, in.CodeFetch, in.CodeCaseInsensitive);
      if (map != null) record.put ("Code", map);
      map = DataHelper.filterToMap (in.Text, in.TextSort, in.TextSortAscending, in.TextFetch, in.TextCaseInsensitive);
      if (map != null) record.put ("Text", map);
    return record;
  }
  /** convert Map to NoteTextObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteTextObjectKeyData the converted object
   */
  public static NoteTextObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteTextObjectKeyData out = new NoteTextObjectKeyData ();

    if ((obj = record.get ("Code")) != null)
    {
      out.Code = (String) obj;
      out._CodeSet = true;
    }
  
    if ((obj = record.get ("Text")) != null)
    {
      out.Text = (String) obj;
      out._TextSet = true;
    }
  
    return out;
  }
  /** convert Map to NoteTextObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteTextObjectKeyFilter the converted object
   */
  public static NoteTextObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteTextObjectKeyFilter out = new NoteTextObjectKeyFilter ();

    Map CodeMap = (Map)record.get("Code");
    Boolean CodeFetch = DataHelper.getFetch(CodeMap);
    Boolean CodeSortDir = DataHelper.getSortDirection(CodeMap);
    Integer CodeSortOrder = DataHelper.getSortOrder(CodeMap);
    if (CodeFetch != null) out.setCodeFetch(CodeFetch);
    if (CodeSortDir != null) out.setCodeSortDirection(CodeSortDir);
    if (CodeSortOrder != null) out.setCodeSortOrder(CodeSortOrder);

    Filter[] CodeFilter = DataHelper.mapToFilterArray(CodeMap, String.class);
    if (CodeFilter != null) {
      StringFilter[] CodeFilters = new StringFilter[CodeFilter.length];
      for (int i = 0; i < CodeFilters.length; i++) {
        CodeFilters[i] = (StringFilter)CodeFilter[i];
      }
      try {
        out.setCodeFilter(CodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TextMap = (Map)record.get("Text");
    Boolean TextFetch = DataHelper.getFetch(TextMap);
    Boolean TextSortDir = DataHelper.getSortDirection(TextMap);
    Integer TextSortOrder = DataHelper.getSortOrder(TextMap);
    if (TextFetch != null) out.setTextFetch(TextFetch);
    if (TextSortDir != null) out.setTextSortDirection(TextSortDir);
    if (TextSortOrder != null) out.setTextSortOrder(TextSortOrder);

    Filter[] TextFilter = DataHelper.mapToFilterArray(TextMap, String.class);
    if (TextFilter != null) {
      StringFilter[] TextFilters = new StringFilter[TextFilter.length];
      for (int i = 0; i < TextFilters.length; i++) {
        TextFilters[i] = (StringFilter)TextFilter[i];
      }
      try {
        out.setTextFilter(TextFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
