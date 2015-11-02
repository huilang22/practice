/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: NoteCodeObjectKeyHelper.java
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

/** Helper class for NoteCodeObject's Key objects. */
public class NoteCodeObjectKeyHelper implements ArubaObjectHelper
{
  /** convert NoteCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NoteCodeObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteCodeObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteCodeObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteCodeObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert NoteCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (NoteCodeObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert NoteCodeObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "NoteCodeObject")
   * @return Map     the output Map
   */
  public static Map toMap (NoteCodeObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "NoteCodeObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to NoteCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return NoteCodeObjectKeyData the converted object
   */
  public static NoteCodeObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to NoteCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "NoteCodeObject")
   * @return NoteCodeObjectKeyData the converted object
   */
  public static NoteCodeObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to NoteCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return NoteCodeObjectKeyFilter the converted object
   */
  public static NoteCodeObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to NoteCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "NoteCodeObject")
   * @return NoteCodeObjectKeyFilter the converted object
   */
  public static NoteCodeObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "NoteCodeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert NoteCodeObjectKeyData to a Map (not including the root).
  /** convert NoteCodeObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (NoteCodeObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._CodeSet) record.put ("Code", in.Code);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert NoteCodeObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (NoteCodeObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.Code, in.CodeSort, in.CodeSortAscending, in.CodeFetch, in.CodeCaseInsensitive);
      if (map != null) record.put ("Code", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to NoteCodeObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteCodeObjectKeyData the converted object
   */
  public static NoteCodeObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteCodeObjectKeyData out = new NoteCodeObjectKeyData ();

    if ((obj = record.get ("Code")) != null)
    {
      out.Code = (String) obj;
      out._CodeSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to NoteCodeObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return NoteCodeObjectKeyFilter the converted object
   */
  public static NoteCodeObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    NoteCodeObjectKeyFilter out = new NoteCodeObjectKeyFilter ();

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
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, Integer.class);
    if (LanguageCodeFilter != null) {
      IntegerFilter[] LanguageCodeFilters = new IntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (IntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
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
