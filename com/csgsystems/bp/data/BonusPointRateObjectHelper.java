/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BonusPointRateObjectHelper.java
 * Definition File: Admin/BonusPointRate.xml
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



/** Helper class to convert BonusPointRateObject JavaBean objects to/from HashMaps.
 */
public class BonusPointRateObjectHelper implements ArubaObjectHelper
{
  /** convert BonusPointRateObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BonusPointRateObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BonusPointRateObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BonusPointRateObject")
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointRateObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BonusPointRateObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BonusPointRateObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointRateObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BonusPointRateObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BonusPointRateObject")
   * @return Map     the output Map
   */
  public static Map toMap (BonusPointRateObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BonusPointRateObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BonusPointRateObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BonusPointRateObjectData the converted object
   */
  public static BonusPointRateObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BonusPointRateObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BonusPointRateObject")
   * @return BonusPointRateObjectData the converted object
   */
  public static BonusPointRateObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointRateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BonusPointRateObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BonusPointRateObjectFilter the converted object
   */
  public static BonusPointRateObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BonusPointRateObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BonusPointRateObject")
   * @return BonusPointRateObjectFilter the converted object
   */
  public static BonusPointRateObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointRateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BonusPointRateObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BonusPointRateObjectDataList the converted object
   */
  public static BonusPointRateObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BonusPointRateObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BonusPointRateObjectList")
   * @return BonusPointRateObjectDataList the converted object
   */
  public static BonusPointRateObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BonusPointRateObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BonusPointRateObjectData[] array = null;
    if (root != null)
    {
      array = new BonusPointRateObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BonusPointRateObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BonusPointRateObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BonusPointRateObjectDataList (array, index, total);
  }
  /** convert BonusPointRateObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BonusPointRateObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", BonusPointRateObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ConvertFactorSet) record.put ("ConvertFactor", in.ConvertFactor);
  
    if (in._OperatorSet) record.put ("Operator", in.Operator);
  
    if (in._ImpliedDecimalsSet) record.put ("ImpliedDecimals", in.ImpliedDecimals);
  
    if (in._DateActiveSet) record.put ("DateActive", in.DateActive);
  
    if (in._DateInactiveSet) record.put ("DateInactive", in.DateInactive);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert BonusPointRateObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BonusPointRateObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", BonusPointRateObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ConvertFactor, in.ConvertFactorSort, in.ConvertFactorSortAscending, in.ConvertFactorFetch);
      if (map != null) record.put ("ConvertFactor", map);
      map = DataHelper.filterToMap (in.Operator, in.OperatorSort, in.OperatorSortAscending, in.OperatorFetch);
      if (map != null) record.put ("Operator", map);
      map = DataHelper.filterToMap (in.ImpliedDecimals, in.ImpliedDecimalsSort, in.ImpliedDecimalsSortAscending, in.ImpliedDecimalsFetch);
      if (map != null) record.put ("ImpliedDecimals", map);
      map = DataHelper.filterToMap (in.DateActive, in.DateActiveSort, in.DateActiveSortAscending, in.DateActiveFetch);
      if (map != null) record.put ("DateActive", map);
      map = DataHelper.filterToMap (in.DateInactive, in.DateInactiveSort, in.DateInactiveSortAscending, in.DateInactiveFetch);
      if (map != null) record.put ("DateInactive", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to BonusPointRateObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BonusPointRateObjectData the converted object
   */
  public static BonusPointRateObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BonusPointRateObjectData out = new BonusPointRateObjectData ();

    out.Key = BonusPointRateObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ConvertFactor")) != null)
    {
      out.ConvertFactor = (Integer) obj;
    }
  
    if ((obj = record.get ("Operator")) != null)
    {
      out.Operator = (Integer) obj;
    }
  
    if ((obj = record.get ("ImpliedDecimals")) != null)
    {
      out.ImpliedDecimals = (Integer) obj;
    }
  
    if ((obj = record.get ("DateActive")) != null)
    {
      out.DateActive = (Date) obj;
    }
  
    if ((obj = record.get ("DateInactive")) != null)
    {
      out.DateInactive = (Date) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to BonusPointRateObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BonusPointRateObjectFilter the converted object
   */
  public static BonusPointRateObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BonusPointRateObjectFilter out = new BonusPointRateObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = BonusPointRateObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ConvertFactorMap = (Map)record.get("ConvertFactor");
    Boolean ConvertFactorFetch = DataHelper.getFetch(ConvertFactorMap);
    Boolean ConvertFactorSortDir = DataHelper.getSortDirection(ConvertFactorMap);
    Integer ConvertFactorSortOrder = DataHelper.getSortOrder(ConvertFactorMap);
    if (ConvertFactorFetch != null) out.setConvertFactorFetch(ConvertFactorFetch);
    if (ConvertFactorSortDir != null) out.setConvertFactorSortDirection(ConvertFactorSortDir);
    if (ConvertFactorSortOrder != null) out.setConvertFactorSortOrder(ConvertFactorSortOrder);

    Filter[] ConvertFactorFilter = DataHelper.mapToFilterArray(ConvertFactorMap, Integer.class);
    if (ConvertFactorFilter != null) {
      IntegerFilter[] ConvertFactorFilters = new IntegerFilter[ConvertFactorFilter.length];
      for (int i = 0; i < ConvertFactorFilters.length; i++) {
        ConvertFactorFilters[i] = (IntegerFilter)ConvertFactorFilter[i];
      }
      try {
        out.setConvertFactorFilter(ConvertFactorFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OperatorMap = (Map)record.get("Operator");
    Boolean OperatorFetch = DataHelper.getFetch(OperatorMap);
    Boolean OperatorSortDir = DataHelper.getSortDirection(OperatorMap);
    Integer OperatorSortOrder = DataHelper.getSortOrder(OperatorMap);
    if (OperatorFetch != null) out.setOperatorFetch(OperatorFetch);
    if (OperatorSortDir != null) out.setOperatorSortDirection(OperatorSortDir);
    if (OperatorSortOrder != null) out.setOperatorSortOrder(OperatorSortOrder);

    Filter[] OperatorFilter = DataHelper.mapToFilterArray(OperatorMap, Integer.class);
    if (OperatorFilter != null) {
      IntegerFilter[] OperatorFilters = new IntegerFilter[OperatorFilter.length];
      for (int i = 0; i < OperatorFilters.length; i++) {
        OperatorFilters[i] = (IntegerFilter)OperatorFilter[i];
      }
      try {
        out.setOperatorFilter(OperatorFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ImpliedDecimalsMap = (Map)record.get("ImpliedDecimals");
    Boolean ImpliedDecimalsFetch = DataHelper.getFetch(ImpliedDecimalsMap);
    Boolean ImpliedDecimalsSortDir = DataHelper.getSortDirection(ImpliedDecimalsMap);
    Integer ImpliedDecimalsSortOrder = DataHelper.getSortOrder(ImpliedDecimalsMap);
    if (ImpliedDecimalsFetch != null) out.setImpliedDecimalsFetch(ImpliedDecimalsFetch);
    if (ImpliedDecimalsSortDir != null) out.setImpliedDecimalsSortDirection(ImpliedDecimalsSortDir);
    if (ImpliedDecimalsSortOrder != null) out.setImpliedDecimalsSortOrder(ImpliedDecimalsSortOrder);

    Filter[] ImpliedDecimalsFilter = DataHelper.mapToFilterArray(ImpliedDecimalsMap, Integer.class);
    if (ImpliedDecimalsFilter != null) {
      IntegerFilter[] ImpliedDecimalsFilters = new IntegerFilter[ImpliedDecimalsFilter.length];
      for (int i = 0; i < ImpliedDecimalsFilters.length; i++) {
        ImpliedDecimalsFilters[i] = (IntegerFilter)ImpliedDecimalsFilter[i];
      }
      try {
        out.setImpliedDecimalsFilter(ImpliedDecimalsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateActiveMap = (Map)record.get("DateActive");
    Boolean DateActiveFetch = DataHelper.getFetch(DateActiveMap);
    Boolean DateActiveSortDir = DataHelper.getSortDirection(DateActiveMap);
    Integer DateActiveSortOrder = DataHelper.getSortOrder(DateActiveMap);
    if (DateActiveFetch != null) out.setDateActiveFetch(DateActiveFetch);
    if (DateActiveSortDir != null) out.setDateActiveSortDirection(DateActiveSortDir);
    if (DateActiveSortOrder != null) out.setDateActiveSortOrder(DateActiveSortOrder);

    Filter[] DateActiveFilter = DataHelper.mapToFilterArray(DateActiveMap, Date.class);
    if (DateActiveFilter != null) {
      DateFilter[] DateActiveFilters = new DateFilter[DateActiveFilter.length];
      for (int i = 0; i < DateActiveFilters.length; i++) {
        DateActiveFilters[i] = (DateFilter)DateActiveFilter[i];
      }
      try {
        out.setDateActiveFilter(DateActiveFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateInactiveMap = (Map)record.get("DateInactive");
    Boolean DateInactiveFetch = DataHelper.getFetch(DateInactiveMap);
    Boolean DateInactiveSortDir = DataHelper.getSortDirection(DateInactiveMap);
    Integer DateInactiveSortOrder = DataHelper.getSortOrder(DateInactiveMap);
    if (DateInactiveFetch != null) out.setDateInactiveFetch(DateInactiveFetch);
    if (DateInactiveSortDir != null) out.setDateInactiveSortDirection(DateInactiveSortDir);
    if (DateInactiveSortOrder != null) out.setDateInactiveSortOrder(DateInactiveSortOrder);

    Filter[] DateInactiveFilter = DataHelper.mapToFilterArray(DateInactiveMap, Date.class);
    if (DateInactiveFilter != null) {
      DateFilter[] DateInactiveFilters = new DateFilter[DateInactiveFilter.length];
      for (int i = 0; i < DateInactiveFilters.length; i++) {
        DateInactiveFilters[i] = (DateFilter)DateInactiveFilter[i];
      }
      try {
        out.setDateInactiveFilter(DateInactiveFilters);
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
