/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: GuiIndicatorObjectKeyHelper.java
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

/** Helper class for GuiIndicatorObject's Key objects. */
public class GuiIndicatorObjectKeyHelper implements ArubaObjectHelper
{
  /** convert GuiIndicatorObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GuiIndicatorObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GuiIndicatorObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GuiIndicatorObject")
   * @return Map     the output Map
   */
  public static Map toMap (GuiIndicatorObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GuiIndicatorObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert GuiIndicatorObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (GuiIndicatorObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert GuiIndicatorObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "GuiIndicatorObject")
   * @return Map     the output Map
   */
  public static Map toMap (GuiIndicatorObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "GuiIndicatorObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to GuiIndicatorObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return GuiIndicatorObjectKeyData the converted object
   */
  public static GuiIndicatorObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to GuiIndicatorObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "GuiIndicatorObject")
   * @return GuiIndicatorObjectKeyData the converted object
   */
  public static GuiIndicatorObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "GuiIndicatorObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to GuiIndicatorObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return GuiIndicatorObjectKeyFilter the converted object
   */
  public static GuiIndicatorObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to GuiIndicatorObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "GuiIndicatorObject")
   * @return GuiIndicatorObjectKeyFilter the converted object
   */
  public static GuiIndicatorObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "GuiIndicatorObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert GuiIndicatorObjectKeyData to a Map (not including the root).
  /** convert GuiIndicatorObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GuiIndicatorObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TableNameSet) record.put ("TableName", in.TableName);
  
    if (in._FieldNameSet) record.put ("FieldName", in.FieldName);
  
    if (in._IntegerValueSet) record.put ("IntegerValue", in.IntegerValue);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert GuiIndicatorObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (GuiIndicatorObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TableName, in.TableNameSort, in.TableNameSortAscending, in.TableNameFetch, in.TableNameCaseInsensitive);
      if (map != null) record.put ("TableName", map);
      map = DataHelper.filterToMap (in.FieldName, in.FieldNameSort, in.FieldNameSortAscending, in.FieldNameFetch, in.FieldNameCaseInsensitive);
      if (map != null) record.put ("FieldName", map);
      map = DataHelper.filterToMap (in.IntegerValue, in.IntegerValueSort, in.IntegerValueSortAscending, in.IntegerValueFetch);
      if (map != null) record.put ("IntegerValue", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to GuiIndicatorObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GuiIndicatorObjectKeyData the converted object
   */
  public static GuiIndicatorObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GuiIndicatorObjectKeyData out = new GuiIndicatorObjectKeyData ();

    if ((obj = record.get ("TableName")) != null)
    {
      out.TableName = (String) obj;
      out._TableNameSet = true;
    }
  
    if ((obj = record.get ("FieldName")) != null)
    {
      out.FieldName = (String) obj;
      out._FieldNameSet = true;
    }
  
    if ((obj = record.get ("IntegerValue")) != null)
    {
      out.IntegerValue = (Integer) obj;
      out._IntegerValueSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to GuiIndicatorObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return GuiIndicatorObjectKeyFilter the converted object
   */
  public static GuiIndicatorObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    GuiIndicatorObjectKeyFilter out = new GuiIndicatorObjectKeyFilter ();

    Map TableNameMap = (Map)record.get("TableName");
    Boolean TableNameFetch = DataHelper.getFetch(TableNameMap);
    Boolean TableNameSortDir = DataHelper.getSortDirection(TableNameMap);
    Integer TableNameSortOrder = DataHelper.getSortOrder(TableNameMap);
    if (TableNameFetch != null) out.setTableNameFetch(TableNameFetch);
    if (TableNameSortDir != null) out.setTableNameSortDirection(TableNameSortDir);
    if (TableNameSortOrder != null) out.setTableNameSortOrder(TableNameSortOrder);

    Filter[] TableNameFilter = DataHelper.mapToFilterArray(TableNameMap, String.class);
    if (TableNameFilter != null) {
      StringFilter[] TableNameFilters = new StringFilter[TableNameFilter.length];
      for (int i = 0; i < TableNameFilters.length; i++) {
        TableNameFilters[i] = (StringFilter)TableNameFilter[i];
      }
      try {
        out.setTableNameFilter(TableNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FieldNameMap = (Map)record.get("FieldName");
    Boolean FieldNameFetch = DataHelper.getFetch(FieldNameMap);
    Boolean FieldNameSortDir = DataHelper.getSortDirection(FieldNameMap);
    Integer FieldNameSortOrder = DataHelper.getSortOrder(FieldNameMap);
    if (FieldNameFetch != null) out.setFieldNameFetch(FieldNameFetch);
    if (FieldNameSortDir != null) out.setFieldNameSortDirection(FieldNameSortDir);
    if (FieldNameSortOrder != null) out.setFieldNameSortOrder(FieldNameSortOrder);

    Filter[] FieldNameFilter = DataHelper.mapToFilterArray(FieldNameMap, String.class);
    if (FieldNameFilter != null) {
      StringFilter[] FieldNameFilters = new StringFilter[FieldNameFilter.length];
      for (int i = 0; i < FieldNameFilters.length; i++) {
        FieldNameFilters[i] = (StringFilter)FieldNameFilter[i];
      }
      try {
        out.setFieldNameFilter(FieldNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IntegerValueMap = (Map)record.get("IntegerValue");
    Boolean IntegerValueFetch = DataHelper.getFetch(IntegerValueMap);
    Boolean IntegerValueSortDir = DataHelper.getSortDirection(IntegerValueMap);
    Integer IntegerValueSortOrder = DataHelper.getSortOrder(IntegerValueMap);
    if (IntegerValueFetch != null) out.setIntegerValueFetch(IntegerValueFetch);
    if (IntegerValueSortDir != null) out.setIntegerValueSortDirection(IntegerValueSortDir);
    if (IntegerValueSortOrder != null) out.setIntegerValueSortOrder(IntegerValueSortOrder);

    Filter[] IntegerValueFilter = DataHelper.mapToFilterArray(IntegerValueMap, Integer.class);
    if (IntegerValueFilter != null) {
      IntegerFilter[] IntegerValueFilters = new IntegerFilter[IntegerValueFilter.length];
      for (int i = 0; i < IntegerValueFilters.length; i++) {
        IntegerValueFilters[i] = (IntegerFilter)IntegerValueFilter[i];
      }
      try {
        out.setIntegerValueFilter(IntegerValueFilters);
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
