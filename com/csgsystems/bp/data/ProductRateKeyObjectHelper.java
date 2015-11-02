/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ProductRateKeyObjectHelper.java
 * Definition File: Customer/ProductRateKey.xml
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



/** Helper class to convert ProductRateKeyObject JavaBean objects to/from HashMaps.
 */
public class ProductRateKeyObjectHelper implements ArubaObjectHelper
{
  /** convert ProductRateKeyObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ProductRateKeyObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ProductRateKeyObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ProductRateKeyObject")
   * @return Map     the output Map
   */
  public static Map toMap (ProductRateKeyObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ProductRateKeyObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ProductRateKeyObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ProductRateKeyObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ProductRateKeyObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ProductRateKeyObject")
   * @return Map     the output Map
   */
  public static Map toMap (ProductRateKeyObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ProductRateKeyObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ProductRateKeyObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ProductRateKeyObjectData the converted object
   */
  public static ProductRateKeyObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ProductRateKeyObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ProductRateKeyObject")
   * @return ProductRateKeyObjectData the converted object
   */
  public static ProductRateKeyObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ProductRateKeyObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ProductRateKeyObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ProductRateKeyObjectFilter the converted object
   */
  public static ProductRateKeyObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ProductRateKeyObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ProductRateKeyObject")
   * @return ProductRateKeyObjectFilter the converted object
   */
  public static ProductRateKeyObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ProductRateKeyObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ProductRateKeyObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ProductRateKeyObjectDataList the converted object
   */
  public static ProductRateKeyObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ProductRateKeyObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ProductRateKeyObjectList")
   * @return ProductRateKeyObjectDataList the converted object
   */
  public static ProductRateKeyObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ProductRateKeyObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ProductRateKeyObjectData[] array = null;
    if (root != null)
    {
      array = new ProductRateKeyObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ProductRateKeyObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ProductRateKeyObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ProductRateKeyObjectDataList (array, index, total);
  }
  /** convert ProductRateKeyObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ProductRateKeyObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ProductRateKeyObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._RateJurisdictionSet) record.put ("RateJurisdiction", in.RateJurisdiction);
  
    if (in._RateUnitsSet) record.put ("RateUnits", in.RateUnits);
  
    if (in._OriginLocationCodeSet) record.put ("OriginLocationCode", in.OriginLocationCode);
  
    if (in._TargetLocationCodeSet) record.put ("TargetLocationCode", in.TargetLocationCode);
  
    if (in._JurisdictionSet) record.put ("Jurisdiction", in.Jurisdiction);
  
    if (in._UnitsSet) record.put ("Units", in.Units);
  
    if (in._UnitsTypeSet) record.put ("UnitsType", in.UnitsType);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._CostSet) record.put ("Cost", in.Cost);
      return record;
  }
  /** convert ProductRateKeyObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ProductRateKeyObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ProductRateKeyObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.RateJurisdiction, in.RateJurisdictionSort, in.RateJurisdictionSortAscending, in.RateJurisdictionFetch);
      if (map != null) record.put ("RateJurisdiction", map);
      map = DataHelper.filterToMap (in.RateUnits, in.RateUnitsSort, in.RateUnitsSortAscending, in.RateUnitsFetch);
      if (map != null) record.put ("RateUnits", map);
      map = DataHelper.filterToMap (in.OriginLocationCode, in.OriginLocationCodeSort, in.OriginLocationCodeSortAscending, in.OriginLocationCodeFetch);
      if (map != null) record.put ("OriginLocationCode", map);
      map = DataHelper.filterToMap (in.TargetLocationCode, in.TargetLocationCodeSort, in.TargetLocationCodeSortAscending, in.TargetLocationCodeFetch);
      if (map != null) record.put ("TargetLocationCode", map);
      map = DataHelper.filterToMap (in.Jurisdiction, in.JurisdictionSort, in.JurisdictionSortAscending, in.JurisdictionFetch);
      if (map != null) record.put ("Jurisdiction", map);
      map = DataHelper.filterToMap (in.Units, in.UnitsSort, in.UnitsSortAscending, in.UnitsFetch);
      if (map != null) record.put ("Units", map);
      map = DataHelper.filterToMap (in.UnitsType, in.UnitsTypeSort, in.UnitsTypeSortAscending, in.UnitsTypeFetch);
      if (map != null) record.put ("UnitsType", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.Cost, in.CostSort, in.CostSortAscending, in.CostFetch);
      if (map != null) record.put ("Cost", map);
    return record;
  }
  /** convert Map to ProductRateKeyObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ProductRateKeyObjectData the converted object
   */
  public static ProductRateKeyObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductRateKeyObjectData out = new ProductRateKeyObjectData ();

    out.Key = ProductRateKeyObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("RateJurisdiction")) != null)
    {
      out.RateJurisdiction = (Boolean) obj;
    }
  
    if ((obj = record.get ("RateUnits")) != null)
    {
      out.RateUnits = (Boolean) obj;
    }
  
    if ((obj = record.get ("OriginLocationCode")) != null)
    {
      out.OriginLocationCode = (Integer) obj;
    }
  
    if ((obj = record.get ("TargetLocationCode")) != null)
    {
      out.TargetLocationCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Jurisdiction")) != null)
    {
      out.Jurisdiction = (Integer) obj;
    }
  
    if ((obj = record.get ("Units")) != null)
    {
      out.Units = (Integer) obj;
    }
  
    if ((obj = record.get ("UnitsType")) != null)
    {
      out.UnitsType = (Integer) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("Cost")) != null)
    {
      out.Cost = (BigInteger) obj;
    }
      return out;
  }
  /** convert Map to ProductRateKeyObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ProductRateKeyObjectFilter the converted object
   */
  public static ProductRateKeyObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ProductRateKeyObjectFilter out = new ProductRateKeyObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ProductRateKeyObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map RateJurisdictionMap = (Map)record.get("RateJurisdiction");
    Boolean RateJurisdictionFetch = DataHelper.getFetch(RateJurisdictionMap);
    Boolean RateJurisdictionSortDir = DataHelper.getSortDirection(RateJurisdictionMap);
    Integer RateJurisdictionSortOrder = DataHelper.getSortOrder(RateJurisdictionMap);
    if (RateJurisdictionFetch != null) out.setRateJurisdictionFetch(RateJurisdictionFetch);
    if (RateJurisdictionSortDir != null) out.setRateJurisdictionSortDirection(RateJurisdictionSortDir);
    if (RateJurisdictionSortOrder != null) out.setRateJurisdictionSortOrder(RateJurisdictionSortOrder);

    Filter[] RateJurisdictionFilter = DataHelper.mapToFilterArray(RateJurisdictionMap, Boolean.class);
    if (RateJurisdictionFilter != null) {
      BooleanFilter[] RateJurisdictionFilters = new BooleanFilter[RateJurisdictionFilter.length];
      for (int i = 0; i < RateJurisdictionFilters.length; i++) {
        RateJurisdictionFilters[i] = (BooleanFilter)RateJurisdictionFilter[i];
      }
      try {
        out.setRateJurisdictionFilter(RateJurisdictionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RateUnitsMap = (Map)record.get("RateUnits");
    Boolean RateUnitsFetch = DataHelper.getFetch(RateUnitsMap);
    Boolean RateUnitsSortDir = DataHelper.getSortDirection(RateUnitsMap);
    Integer RateUnitsSortOrder = DataHelper.getSortOrder(RateUnitsMap);
    if (RateUnitsFetch != null) out.setRateUnitsFetch(RateUnitsFetch);
    if (RateUnitsSortDir != null) out.setRateUnitsSortDirection(RateUnitsSortDir);
    if (RateUnitsSortOrder != null) out.setRateUnitsSortOrder(RateUnitsSortOrder);

    Filter[] RateUnitsFilter = DataHelper.mapToFilterArray(RateUnitsMap, Boolean.class);
    if (RateUnitsFilter != null) {
      BooleanFilter[] RateUnitsFilters = new BooleanFilter[RateUnitsFilter.length];
      for (int i = 0; i < RateUnitsFilters.length; i++) {
        RateUnitsFilters[i] = (BooleanFilter)RateUnitsFilter[i];
      }
      try {
        out.setRateUnitsFilter(RateUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OriginLocationCodeMap = (Map)record.get("OriginLocationCode");
    Boolean OriginLocationCodeFetch = DataHelper.getFetch(OriginLocationCodeMap);
    Boolean OriginLocationCodeSortDir = DataHelper.getSortDirection(OriginLocationCodeMap);
    Integer OriginLocationCodeSortOrder = DataHelper.getSortOrder(OriginLocationCodeMap);
    if (OriginLocationCodeFetch != null) out.setOriginLocationCodeFetch(OriginLocationCodeFetch);
    if (OriginLocationCodeSortDir != null) out.setOriginLocationCodeSortDirection(OriginLocationCodeSortDir);
    if (OriginLocationCodeSortOrder != null) out.setOriginLocationCodeSortOrder(OriginLocationCodeSortOrder);

    Filter[] OriginLocationCodeFilter = DataHelper.mapToFilterArray(OriginLocationCodeMap, Integer.class);
    if (OriginLocationCodeFilter != null) {
      IntegerFilter[] OriginLocationCodeFilters = new IntegerFilter[OriginLocationCodeFilter.length];
      for (int i = 0; i < OriginLocationCodeFilters.length; i++) {
        OriginLocationCodeFilters[i] = (IntegerFilter)OriginLocationCodeFilter[i];
      }
      try {
        out.setOriginLocationCodeFilter(OriginLocationCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TargetLocationCodeMap = (Map)record.get("TargetLocationCode");
    Boolean TargetLocationCodeFetch = DataHelper.getFetch(TargetLocationCodeMap);
    Boolean TargetLocationCodeSortDir = DataHelper.getSortDirection(TargetLocationCodeMap);
    Integer TargetLocationCodeSortOrder = DataHelper.getSortOrder(TargetLocationCodeMap);
    if (TargetLocationCodeFetch != null) out.setTargetLocationCodeFetch(TargetLocationCodeFetch);
    if (TargetLocationCodeSortDir != null) out.setTargetLocationCodeSortDirection(TargetLocationCodeSortDir);
    if (TargetLocationCodeSortOrder != null) out.setTargetLocationCodeSortOrder(TargetLocationCodeSortOrder);

    Filter[] TargetLocationCodeFilter = DataHelper.mapToFilterArray(TargetLocationCodeMap, Integer.class);
    if (TargetLocationCodeFilter != null) {
      IntegerFilter[] TargetLocationCodeFilters = new IntegerFilter[TargetLocationCodeFilter.length];
      for (int i = 0; i < TargetLocationCodeFilters.length; i++) {
        TargetLocationCodeFilters[i] = (IntegerFilter)TargetLocationCodeFilter[i];
      }
      try {
        out.setTargetLocationCodeFilter(TargetLocationCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map JurisdictionMap = (Map)record.get("Jurisdiction");
    Boolean JurisdictionFetch = DataHelper.getFetch(JurisdictionMap);
    Boolean JurisdictionSortDir = DataHelper.getSortDirection(JurisdictionMap);
    Integer JurisdictionSortOrder = DataHelper.getSortOrder(JurisdictionMap);
    if (JurisdictionFetch != null) out.setJurisdictionFetch(JurisdictionFetch);
    if (JurisdictionSortDir != null) out.setJurisdictionSortDirection(JurisdictionSortDir);
    if (JurisdictionSortOrder != null) out.setJurisdictionSortOrder(JurisdictionSortOrder);

    Filter[] JurisdictionFilter = DataHelper.mapToFilterArray(JurisdictionMap, Integer.class);
    if (JurisdictionFilter != null) {
      IntegerFilter[] JurisdictionFilters = new IntegerFilter[JurisdictionFilter.length];
      for (int i = 0; i < JurisdictionFilters.length; i++) {
        JurisdictionFilters[i] = (IntegerFilter)JurisdictionFilter[i];
      }
      try {
        out.setJurisdictionFilter(JurisdictionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitsMap = (Map)record.get("Units");
    Boolean UnitsFetch = DataHelper.getFetch(UnitsMap);
    Boolean UnitsSortDir = DataHelper.getSortDirection(UnitsMap);
    Integer UnitsSortOrder = DataHelper.getSortOrder(UnitsMap);
    if (UnitsFetch != null) out.setUnitsFetch(UnitsFetch);
    if (UnitsSortDir != null) out.setUnitsSortDirection(UnitsSortDir);
    if (UnitsSortOrder != null) out.setUnitsSortOrder(UnitsSortOrder);

    Filter[] UnitsFilter = DataHelper.mapToFilterArray(UnitsMap, Integer.class);
    if (UnitsFilter != null) {
      IntegerFilter[] UnitsFilters = new IntegerFilter[UnitsFilter.length];
      for (int i = 0; i < UnitsFilters.length; i++) {
        UnitsFilters[i] = (IntegerFilter)UnitsFilter[i];
      }
      try {
        out.setUnitsFilter(UnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map UnitsTypeMap = (Map)record.get("UnitsType");
    Boolean UnitsTypeFetch = DataHelper.getFetch(UnitsTypeMap);
    Boolean UnitsTypeSortDir = DataHelper.getSortDirection(UnitsTypeMap);
    Integer UnitsTypeSortOrder = DataHelper.getSortOrder(UnitsTypeMap);
    if (UnitsTypeFetch != null) out.setUnitsTypeFetch(UnitsTypeFetch);
    if (UnitsTypeSortDir != null) out.setUnitsTypeSortDirection(UnitsTypeSortDir);
    if (UnitsTypeSortOrder != null) out.setUnitsTypeSortOrder(UnitsTypeSortOrder);

    Filter[] UnitsTypeFilter = DataHelper.mapToFilterArray(UnitsTypeMap, Integer.class);
    if (UnitsTypeFilter != null) {
      IntegerFilter[] UnitsTypeFilters = new IntegerFilter[UnitsTypeFilter.length];
      for (int i = 0; i < UnitsTypeFilters.length; i++) {
        UnitsTypeFilters[i] = (IntegerFilter)UnitsTypeFilter[i];
      }
      try {
        out.setUnitsTypeFilter(UnitsTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgWhoMap = (Map)record.get("ChgWho");
    Boolean ChgWhoFetch = DataHelper.getFetch(ChgWhoMap);
    Boolean ChgWhoSortDir = DataHelper.getSortDirection(ChgWhoMap);
    Integer ChgWhoSortOrder = DataHelper.getSortOrder(ChgWhoMap);
    if (ChgWhoFetch != null) out.setChgWhoFetch(ChgWhoFetch);
    if (ChgWhoSortDir != null) out.setChgWhoSortDirection(ChgWhoSortDir);
    if (ChgWhoSortOrder != null) out.setChgWhoSortOrder(ChgWhoSortOrder);

    Filter[] ChgWhoFilter = DataHelper.mapToFilterArray(ChgWhoMap, String.class);
    if (ChgWhoFilter != null) {
      StringFilter[] ChgWhoFilters = new StringFilter[ChgWhoFilter.length];
      for (int i = 0; i < ChgWhoFilters.length; i++) {
        ChgWhoFilters[i] = (StringFilter)ChgWhoFilter[i];
      }
      try {
        out.setChgWhoFilter(ChgWhoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDtMap = (Map)record.get("ChgDt");
    Boolean ChgDtFetch = DataHelper.getFetch(ChgDtMap);
    Boolean ChgDtSortDir = DataHelper.getSortDirection(ChgDtMap);
    Integer ChgDtSortOrder = DataHelper.getSortOrder(ChgDtMap);
    if (ChgDtFetch != null) out.setChgDtFetch(ChgDtFetch);
    if (ChgDtSortDir != null) out.setChgDtSortDirection(ChgDtSortDir);
    if (ChgDtSortOrder != null) out.setChgDtSortOrder(ChgDtSortOrder);

    Filter[] ChgDtFilter = DataHelper.mapToFilterArray(ChgDtMap, Date.class);
    if (ChgDtFilter != null) {
      DateFilter[] ChgDtFilters = new DateFilter[ChgDtFilter.length];
      for (int i = 0; i < ChgDtFilters.length; i++) {
        ChgDtFilters[i] = (DateFilter)ChgDtFilter[i];
      }
      try {
        out.setChgDtFilter(ChgDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDtMap = (Map)record.get("InactiveDt");
    Boolean InactiveDtFetch = DataHelper.getFetch(InactiveDtMap);
    Boolean InactiveDtSortDir = DataHelper.getSortDirection(InactiveDtMap);
    Integer InactiveDtSortOrder = DataHelper.getSortOrder(InactiveDtMap);
    if (InactiveDtFetch != null) out.setInactiveDtFetch(InactiveDtFetch);
    if (InactiveDtSortDir != null) out.setInactiveDtSortDirection(InactiveDtSortDir);
    if (InactiveDtSortOrder != null) out.setInactiveDtSortOrder(InactiveDtSortOrder);

    Filter[] InactiveDtFilter = DataHelper.mapToFilterArray(InactiveDtMap, Date.class);
    if (InactiveDtFilter != null) {
      DateFilter[] InactiveDtFilters = new DateFilter[InactiveDtFilter.length];
      for (int i = 0; i < InactiveDtFilters.length; i++) {
        InactiveDtFilters[i] = (DateFilter)InactiveDtFilter[i];
      }
      try {
        out.setInactiveDtFilter(InactiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CostMap = (Map)record.get("Cost");
    Boolean CostFetch = DataHelper.getFetch(CostMap);
    Boolean CostSortDir = DataHelper.getSortDirection(CostMap);
    Integer CostSortOrder = DataHelper.getSortOrder(CostMap);
    if (CostFetch != null) out.setCostFetch(CostFetch);
    if (CostSortDir != null) out.setCostSortDirection(CostSortDir);
    if (CostSortOrder != null) out.setCostSortOrder(CostSortOrder);

    Filter[] CostFilter = DataHelper.mapToFilterArray(CostMap, BigInteger.class);
    if (CostFilter != null) {
      BigIntegerFilter[] CostFilters = new BigIntegerFilter[CostFilter.length];
      for (int i = 0; i < CostFilters.length; i++) {
        CostFilters[i] = (BigIntegerFilter)CostFilter[i];
      }
      try {
        out.setCostFilter(CostFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
