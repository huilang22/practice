/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: XPDObjectHelper.java
 * Definition File: Admin/ExtendedDataParam.xml
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



/** Helper class to convert XPDObject JavaBean objects to/from HashMaps.
 */
public class XPDObjectHelper implements ArubaObjectHelper
{
  /** convert XPDObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (XPDObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert XPDObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "XPDObject")
   * @return Map     the output Map
   */
  public static Map toMap (XPDObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "XPDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert XPDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (XPDObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert XPDObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "XPDObject")
   * @return Map     the output Map
   */
  public static Map toMap (XPDObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "XPDObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to XPDObjectData.
   * @param record the Map containing the data to convert to the object
   * @return XPDObjectData the converted object
   */
  public static XPDObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to XPDObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "XPDObject")
   * @return XPDObjectData the converted object
   */
  public static XPDObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "XPDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to XPDObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return XPDObjectFilter the converted object
   */
  public static XPDObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to XPDObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "XPDObject")
   * @return XPDObjectFilter the converted object
   */
  public static XPDObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "XPDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to XPDObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return XPDObjectDataList the converted object
   */
  public static XPDObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to XPDObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "XPDObjectList")
   * @return XPDObjectDataList the converted object
   */
  public static XPDObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "XPDObjectList";
    Object[] root = (Object[]) record.get (rootName);
    XPDObjectData[] array = null;
    if (root != null)
    {
      array = new XPDObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = XPDObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new XPDObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new XPDObjectDataList (array, index, total);
  }
  /** convert XPDObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (XPDObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", XPDObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
  
    if (in._ValidationRulesDescSet) record.put ("ValidationRulesDesc", in.ValidationRulesDesc);
  
    if (in._ParamNameSet) record.put ("ParamName", in.ParamName);
  
    if (in._ParamDatatypeSet) record.put ("ParamDatatype", in.ParamDatatype);
  
    if (in._AssocEnumerationIdSet) record.put ("AssocEnumerationId", in.AssocEnumerationId);
  
    if (in._IsAddressableSet) record.put ("IsAddressable", in.IsAddressable);
  
    if (in._ParamExternalIdSet) record.put ("ParamExternalId", in.ParamExternalId);
  
    if (in._ValidationRulesSet) record.put ("ValidationRules", in.ValidationRules);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert XPDObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (XPDObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", XPDObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
      map = DataHelper.filterToMap (in.ValidationRulesDesc, in.ValidationRulesDescSort, in.ValidationRulesDescSortAscending, in.ValidationRulesDescFetch, in.ValidationRulesDescCaseInsensitive);
      if (map != null) record.put ("ValidationRulesDesc", map);
      map = DataHelper.filterToMap (in.ParamName, in.ParamNameSort, in.ParamNameSortAscending, in.ParamNameFetch, in.ParamNameCaseInsensitive);
      if (map != null) record.put ("ParamName", map);
      map = DataHelper.filterToMap (in.ParamDatatype, in.ParamDatatypeSort, in.ParamDatatypeSortAscending, in.ParamDatatypeFetch);
      if (map != null) record.put ("ParamDatatype", map);
      map = DataHelper.filterToMap (in.AssocEnumerationId, in.AssocEnumerationIdSort, in.AssocEnumerationIdSortAscending, in.AssocEnumerationIdFetch);
      if (map != null) record.put ("AssocEnumerationId", map);
      map = DataHelper.filterToMap (in.IsAddressable, in.IsAddressableSort, in.IsAddressableSortAscending, in.IsAddressableFetch);
      if (map != null) record.put ("IsAddressable", map);
      map = DataHelper.filterToMap (in.ParamExternalId, in.ParamExternalIdSort, in.ParamExternalIdSortAscending, in.ParamExternalIdFetch, in.ParamExternalIdCaseInsensitive);
      if (map != null) record.put ("ParamExternalId", map);
      map = DataHelper.filterToMap (in.ValidationRules, in.ValidationRulesSort, in.ValidationRulesSortAscending, in.ValidationRulesFetch, in.ValidationRulesCaseInsensitive);
      if (map != null) record.put ("ValidationRules", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to XPDObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return XPDObjectData the converted object
   */
  public static XPDObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    XPDObjectData out = new XPDObjectData ();

    out.Key = XPDObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
  
    if ((obj = record.get ("ValidationRulesDesc")) != null)
    {
      out.ValidationRulesDesc = (String) obj;
    }
  
    if ((obj = record.get ("ParamName")) != null)
    {
      out.ParamName = (String) obj;
    }
  
    if ((obj = record.get ("ParamDatatype")) != null)
    {
      out.ParamDatatype = (Integer) obj;
    }
  
    if ((obj = record.get ("AssocEnumerationId")) != null)
    {
      out.AssocEnumerationId = (Integer) obj;
    }
  
    if ((obj = record.get ("IsAddressable")) != null)
    {
      out.IsAddressable = (Boolean) obj;
    }
  
    if ((obj = record.get ("ParamExternalId")) != null)
    {
      out.ParamExternalId = (String) obj;
    }
  
    if ((obj = record.get ("ValidationRules")) != null)
    {
      out.ValidationRules = (String) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to XPDObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return XPDObjectFilter the converted object
   */
  public static XPDObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    XPDObjectFilter out = new XPDObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = XPDObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ShortDisplayMap = (Map)record.get("ShortDisplay");
    Boolean ShortDisplayFetch = DataHelper.getFetch(ShortDisplayMap);
    Boolean ShortDisplaySortDir = DataHelper.getSortDirection(ShortDisplayMap);
    Integer ShortDisplaySortOrder = DataHelper.getSortOrder(ShortDisplayMap);
    if (ShortDisplayFetch != null) out.setShortDisplayFetch(ShortDisplayFetch);
    if (ShortDisplaySortDir != null) out.setShortDisplaySortDirection(ShortDisplaySortDir);
    if (ShortDisplaySortOrder != null) out.setShortDisplaySortOrder(ShortDisplaySortOrder);

    Filter[] ShortDisplayFilter = DataHelper.mapToFilterArray(ShortDisplayMap, String.class);
    if (ShortDisplayFilter != null) {
      StringFilter[] ShortDisplayFilters = new StringFilter[ShortDisplayFilter.length];
      for (int i = 0; i < ShortDisplayFilters.length; i++) {
        ShortDisplayFilters[i] = (StringFilter)ShortDisplayFilter[i];
      }
      try {
        out.setShortDisplayFilter(ShortDisplayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DisplayValueMap = (Map)record.get("DisplayValue");
    Boolean DisplayValueFetch = DataHelper.getFetch(DisplayValueMap);
    Boolean DisplayValueSortDir = DataHelper.getSortDirection(DisplayValueMap);
    Integer DisplayValueSortOrder = DataHelper.getSortOrder(DisplayValueMap);
    if (DisplayValueFetch != null) out.setDisplayValueFetch(DisplayValueFetch);
    if (DisplayValueSortDir != null) out.setDisplayValueSortDirection(DisplayValueSortDir);
    if (DisplayValueSortOrder != null) out.setDisplayValueSortOrder(DisplayValueSortOrder);

    Filter[] DisplayValueFilter = DataHelper.mapToFilterArray(DisplayValueMap, String.class);
    if (DisplayValueFilter != null) {
      StringFilter[] DisplayValueFilters = new StringFilter[DisplayValueFilter.length];
      for (int i = 0; i < DisplayValueFilters.length; i++) {
        DisplayValueFilters[i] = (StringFilter)DisplayValueFilter[i];
      }
      try {
        out.setDisplayValueFilter(DisplayValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ValidationRulesDescMap = (Map)record.get("ValidationRulesDesc");
    Boolean ValidationRulesDescFetch = DataHelper.getFetch(ValidationRulesDescMap);
    Boolean ValidationRulesDescSortDir = DataHelper.getSortDirection(ValidationRulesDescMap);
    Integer ValidationRulesDescSortOrder = DataHelper.getSortOrder(ValidationRulesDescMap);
    if (ValidationRulesDescFetch != null) out.setValidationRulesDescFetch(ValidationRulesDescFetch);
    if (ValidationRulesDescSortDir != null) out.setValidationRulesDescSortDirection(ValidationRulesDescSortDir);
    if (ValidationRulesDescSortOrder != null) out.setValidationRulesDescSortOrder(ValidationRulesDescSortOrder);

    Filter[] ValidationRulesDescFilter = DataHelper.mapToFilterArray(ValidationRulesDescMap, String.class);
    if (ValidationRulesDescFilter != null) {
      StringFilter[] ValidationRulesDescFilters = new StringFilter[ValidationRulesDescFilter.length];
      for (int i = 0; i < ValidationRulesDescFilters.length; i++) {
        ValidationRulesDescFilters[i] = (StringFilter)ValidationRulesDescFilter[i];
      }
      try {
        out.setValidationRulesDescFilter(ValidationRulesDescFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParamNameMap = (Map)record.get("ParamName");
    Boolean ParamNameFetch = DataHelper.getFetch(ParamNameMap);
    Boolean ParamNameSortDir = DataHelper.getSortDirection(ParamNameMap);
    Integer ParamNameSortOrder = DataHelper.getSortOrder(ParamNameMap);
    if (ParamNameFetch != null) out.setParamNameFetch(ParamNameFetch);
    if (ParamNameSortDir != null) out.setParamNameSortDirection(ParamNameSortDir);
    if (ParamNameSortOrder != null) out.setParamNameSortOrder(ParamNameSortOrder);

    Filter[] ParamNameFilter = DataHelper.mapToFilterArray(ParamNameMap, String.class);
    if (ParamNameFilter != null) {
      StringFilter[] ParamNameFilters = new StringFilter[ParamNameFilter.length];
      for (int i = 0; i < ParamNameFilters.length; i++) {
        ParamNameFilters[i] = (StringFilter)ParamNameFilter[i];
      }
      try {
        out.setParamNameFilter(ParamNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParamDatatypeMap = (Map)record.get("ParamDatatype");
    Boolean ParamDatatypeFetch = DataHelper.getFetch(ParamDatatypeMap);
    Boolean ParamDatatypeSortDir = DataHelper.getSortDirection(ParamDatatypeMap);
    Integer ParamDatatypeSortOrder = DataHelper.getSortOrder(ParamDatatypeMap);
    if (ParamDatatypeFetch != null) out.setParamDatatypeFetch(ParamDatatypeFetch);
    if (ParamDatatypeSortDir != null) out.setParamDatatypeSortDirection(ParamDatatypeSortDir);
    if (ParamDatatypeSortOrder != null) out.setParamDatatypeSortOrder(ParamDatatypeSortOrder);

    Filter[] ParamDatatypeFilter = DataHelper.mapToFilterArray(ParamDatatypeMap, Integer.class);
    if (ParamDatatypeFilter != null) {
      IntegerFilter[] ParamDatatypeFilters = new IntegerFilter[ParamDatatypeFilter.length];
      for (int i = 0; i < ParamDatatypeFilters.length; i++) {
        ParamDatatypeFilters[i] = (IntegerFilter)ParamDatatypeFilter[i];
      }
      try {
        out.setParamDatatypeFilter(ParamDatatypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AssocEnumerationIdMap = (Map)record.get("AssocEnumerationId");
    Boolean AssocEnumerationIdFetch = DataHelper.getFetch(AssocEnumerationIdMap);
    Boolean AssocEnumerationIdSortDir = DataHelper.getSortDirection(AssocEnumerationIdMap);
    Integer AssocEnumerationIdSortOrder = DataHelper.getSortOrder(AssocEnumerationIdMap);
    if (AssocEnumerationIdFetch != null) out.setAssocEnumerationIdFetch(AssocEnumerationIdFetch);
    if (AssocEnumerationIdSortDir != null) out.setAssocEnumerationIdSortDirection(AssocEnumerationIdSortDir);
    if (AssocEnumerationIdSortOrder != null) out.setAssocEnumerationIdSortOrder(AssocEnumerationIdSortOrder);

    Filter[] AssocEnumerationIdFilter = DataHelper.mapToFilterArray(AssocEnumerationIdMap, Integer.class);
    if (AssocEnumerationIdFilter != null) {
      IntegerFilter[] AssocEnumerationIdFilters = new IntegerFilter[AssocEnumerationIdFilter.length];
      for (int i = 0; i < AssocEnumerationIdFilters.length; i++) {
        AssocEnumerationIdFilters[i] = (IntegerFilter)AssocEnumerationIdFilter[i];
      }
      try {
        out.setAssocEnumerationIdFilter(AssocEnumerationIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsAddressableMap = (Map)record.get("IsAddressable");
    Boolean IsAddressableFetch = DataHelper.getFetch(IsAddressableMap);
    Boolean IsAddressableSortDir = DataHelper.getSortDirection(IsAddressableMap);
    Integer IsAddressableSortOrder = DataHelper.getSortOrder(IsAddressableMap);
    if (IsAddressableFetch != null) out.setIsAddressableFetch(IsAddressableFetch);
    if (IsAddressableSortDir != null) out.setIsAddressableSortDirection(IsAddressableSortDir);
    if (IsAddressableSortOrder != null) out.setIsAddressableSortOrder(IsAddressableSortOrder);

    Filter[] IsAddressableFilter = DataHelper.mapToFilterArray(IsAddressableMap, Boolean.class);
    if (IsAddressableFilter != null) {
      BooleanFilter[] IsAddressableFilters = new BooleanFilter[IsAddressableFilter.length];
      for (int i = 0; i < IsAddressableFilters.length; i++) {
        IsAddressableFilters[i] = (BooleanFilter)IsAddressableFilter[i];
      }
      try {
        out.setIsAddressableFilter(IsAddressableFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParamExternalIdMap = (Map)record.get("ParamExternalId");
    Boolean ParamExternalIdFetch = DataHelper.getFetch(ParamExternalIdMap);
    Boolean ParamExternalIdSortDir = DataHelper.getSortDirection(ParamExternalIdMap);
    Integer ParamExternalIdSortOrder = DataHelper.getSortOrder(ParamExternalIdMap);
    if (ParamExternalIdFetch != null) out.setParamExternalIdFetch(ParamExternalIdFetch);
    if (ParamExternalIdSortDir != null) out.setParamExternalIdSortDirection(ParamExternalIdSortDir);
    if (ParamExternalIdSortOrder != null) out.setParamExternalIdSortOrder(ParamExternalIdSortOrder);

    Filter[] ParamExternalIdFilter = DataHelper.mapToFilterArray(ParamExternalIdMap, String.class);
    if (ParamExternalIdFilter != null) {
      StringFilter[] ParamExternalIdFilters = new StringFilter[ParamExternalIdFilter.length];
      for (int i = 0; i < ParamExternalIdFilters.length; i++) {
        ParamExternalIdFilters[i] = (StringFilter)ParamExternalIdFilter[i];
      }
      try {
        out.setParamExternalIdFilter(ParamExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ValidationRulesMap = (Map)record.get("ValidationRules");
    Boolean ValidationRulesFetch = DataHelper.getFetch(ValidationRulesMap);
    Boolean ValidationRulesSortDir = DataHelper.getSortDirection(ValidationRulesMap);
    Integer ValidationRulesSortOrder = DataHelper.getSortOrder(ValidationRulesMap);
    if (ValidationRulesFetch != null) out.setValidationRulesFetch(ValidationRulesFetch);
    if (ValidationRulesSortDir != null) out.setValidationRulesSortDirection(ValidationRulesSortDir);
    if (ValidationRulesSortOrder != null) out.setValidationRulesSortOrder(ValidationRulesSortOrder);

    Filter[] ValidationRulesFilter = DataHelper.mapToFilterArray(ValidationRulesMap, String.class);
    if (ValidationRulesFilter != null) {
      StringFilter[] ValidationRulesFilters = new StringFilter[ValidationRulesFilter.length];
      for (int i = 0; i < ValidationRulesFilters.length; i++) {
        ValidationRulesFilters[i] = (StringFilter)ValidationRulesFilter[i];
      }
      try {
        out.setValidationRulesFilter(ValidationRulesFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ConfigTagIdMap = (Map)record.get("ConfigTagId");
    Boolean ConfigTagIdFetch = DataHelper.getFetch(ConfigTagIdMap);
    Boolean ConfigTagIdSortDir = DataHelper.getSortDirection(ConfigTagIdMap);
    Integer ConfigTagIdSortOrder = DataHelper.getSortOrder(ConfigTagIdMap);
    if (ConfigTagIdFetch != null) out.setConfigTagIdFetch(ConfigTagIdFetch);
    if (ConfigTagIdSortDir != null) out.setConfigTagIdSortDirection(ConfigTagIdSortDir);
    if (ConfigTagIdSortOrder != null) out.setConfigTagIdSortOrder(ConfigTagIdSortOrder);

    Filter[] ConfigTagIdFilter = DataHelper.mapToFilterArray(ConfigTagIdMap, String.class);
    if (ConfigTagIdFilter != null) {
      StringFilter[] ConfigTagIdFilters = new StringFilter[ConfigTagIdFilter.length];
      for (int i = 0; i < ConfigTagIdFilters.length; i++) {
        ConfigTagIdFilters[i] = (StringFilter)ConfigTagIdFilter[i];
      }
      try {
        out.setConfigTagIdFilter(ConfigTagIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
