/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: BulkAdjustmentObjectHelper.java
 * Definition File: Customer/BulkAdjustment.xml
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



/** Helper class to convert BulkAdjustmentObject JavaBean objects to/from HashMaps.
 */
public class BulkAdjustmentObjectHelper implements ArubaObjectHelper
{
  /** convert BulkAdjustmentObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (BulkAdjustmentObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BulkAdjustmentObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BulkAdjustmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (BulkAdjustmentObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BulkAdjustmentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert BulkAdjustmentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (BulkAdjustmentObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert BulkAdjustmentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "BulkAdjustmentObject")
   * @return Map     the output Map
   */
  public static Map toMap (BulkAdjustmentObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "BulkAdjustmentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to BulkAdjustmentObjectData.
   * @param record the Map containing the data to convert to the object
   * @return BulkAdjustmentObjectData the converted object
   */
  public static BulkAdjustmentObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to BulkAdjustmentObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "BulkAdjustmentObject")
   * @return BulkAdjustmentObjectData the converted object
   */
  public static BulkAdjustmentObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BulkAdjustmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to BulkAdjustmentObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return BulkAdjustmentObjectFilter the converted object
   */
  public static BulkAdjustmentObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to BulkAdjustmentObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "BulkAdjustmentObject")
   * @return BulkAdjustmentObjectFilter the converted object
   */
  public static BulkAdjustmentObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "BulkAdjustmentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to BulkAdjustmentObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return BulkAdjustmentObjectDataList the converted object
   */
  public static BulkAdjustmentObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to BulkAdjustmentObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "BulkAdjustmentObjectList")
   * @return BulkAdjustmentObjectDataList the converted object
   */
  public static BulkAdjustmentObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "BulkAdjustmentObjectList";
    Object[] root = (Object[]) record.get (rootName);
    BulkAdjustmentObjectData[] array = null;
    if (root != null)
    {
      array = new BulkAdjustmentObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = BulkAdjustmentObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new BulkAdjustmentObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new BulkAdjustmentObjectDataList (array, index, total);
  }
  /** convert BulkAdjustmentObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BulkAdjustmentObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._TransCodeSet) record.put ("TransCode", in.TransCode);
  
    if (in._AnnotationSet) record.put ("Annotation", in.Annotation);
  
    if (in._PrimaryUnitsTypeSet) record.put ("PrimaryUnitsType", in.PrimaryUnitsType);
  
    if (in._PrimaryUnitsSet) record.put ("PrimaryUnits", in.PrimaryUnits);
  
    if (in._EffectiveDateSet) record.put ("EffectiveDate", in.EffectiveDate);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._AdjReasonCodeSet) record.put ("AdjReasonCode", in.AdjReasonCode);
  
    if (in._TotalAmtSet) record.put ("TotalAmt", in.TotalAmt);
  
    if (in._AdjTransGroupSet) record.put ("AdjTransGroup", in.AdjTransGroup);
  
    if (in._IsMaxSet) record.put ("IsMax", in.IsMax);
      return record;
  }
  /** convert BulkAdjustmentObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (BulkAdjustmentObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.TransCode, in.TransCodeSort, in.TransCodeSortAscending, in.TransCodeFetch);
      if (map != null) record.put ("TransCode", map);
      map = DataHelper.filterToMap (in.Annotation, in.AnnotationSort, in.AnnotationSortAscending, in.AnnotationFetch, in.AnnotationCaseInsensitive);
      if (map != null) record.put ("Annotation", map);
      map = DataHelper.filterToMap (in.PrimaryUnitsType, in.PrimaryUnitsTypeSort, in.PrimaryUnitsTypeSortAscending, in.PrimaryUnitsTypeFetch);
      if (map != null) record.put ("PrimaryUnitsType", map);
      map = DataHelper.filterToMap (in.PrimaryUnits, in.PrimaryUnitsSort, in.PrimaryUnitsSortAscending, in.PrimaryUnitsFetch);
      if (map != null) record.put ("PrimaryUnits", map);
      map = DataHelper.filterToMap (in.EffectiveDate, in.EffectiveDateSort, in.EffectiveDateSortAscending, in.EffectiveDateFetch);
      if (map != null) record.put ("EffectiveDate", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.AdjReasonCode, in.AdjReasonCodeSort, in.AdjReasonCodeSortAscending, in.AdjReasonCodeFetch);
      if (map != null) record.put ("AdjReasonCode", map);
      map = DataHelper.filterToMap (in.TotalAmt, in.TotalAmtSort, in.TotalAmtSortAscending, in.TotalAmtFetch);
      if (map != null) record.put ("TotalAmt", map);
      map = DataHelper.filterToMap (in.AdjTransGroup, in.AdjTransGroupSort, in.AdjTransGroupSortAscending, in.AdjTransGroupFetch); 
      if (map != null) record.put ("AdjTransGroup", map);
      map = DataHelper.filterToMap (in.IsMax, in.IsMaxSort, in.IsMaxSortAscending, in.IsMaxFetch); 
      if (map != null) record.put ("IsMax", map);
    return record;
  }
  /** convert Map to BulkAdjustmentObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BulkAdjustmentObjectData the converted object
   */
  public static BulkAdjustmentObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BulkAdjustmentObjectData out = new BulkAdjustmentObjectData ();

    if ((obj = record.get ("TransCode")) != null)
    {
      out.TransCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Annotation")) != null)
    {
      out.Annotation = (String) obj;
    }
  
    if ((obj = record.get ("PrimaryUnitsType")) != null)
    {
      out.PrimaryUnitsType = (Integer) obj;
    }
  
    if ((obj = record.get ("PrimaryUnits")) != null)
    {
      out.PrimaryUnits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("EffectiveDate")) != null)
    {
      out.EffectiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("AdjReasonCode")) != null)
    {
      out.AdjReasonCode = (Integer) obj;
    }
  
    if ((obj = record.get ("TotalAmt")) != null)
    {
      out.TotalAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AdjTransGroup")) != null)
    {
      out.AdjTransGroup = (Integer) obj;
    }
  
    if ((obj = record.get ("IsMax")) != null)
    {
      out.IsMax = (Integer) obj;
    }
      return out;
  }
  /** convert Map to BulkAdjustmentObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return BulkAdjustmentObjectFilter the converted object
   */
  public static BulkAdjustmentObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    BulkAdjustmentObjectFilter out = new BulkAdjustmentObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    Map TransCodeMap = (Map)record.get("TransCode");
    Boolean TransCodeFetch = DataHelper.getFetch(TransCodeMap);
    Boolean TransCodeSortDir = DataHelper.getSortDirection(TransCodeMap);
    Integer TransCodeSortOrder = DataHelper.getSortOrder(TransCodeMap);
    if (TransCodeFetch != null) out.setTransCodeFetch(TransCodeFetch);
    if (TransCodeSortDir != null) out.setTransCodeSortDirection(TransCodeSortDir);
    if (TransCodeSortOrder != null) out.setTransCodeSortOrder(TransCodeSortOrder);

    Filter[] TransCodeFilter = DataHelper.mapToFilterArray(TransCodeMap, Integer.class);
    if (TransCodeFilter != null) {
      IntegerFilter[] TransCodeFilters = new IntegerFilter[TransCodeFilter.length];
      for (int i = 0; i < TransCodeFilters.length; i++) {
        TransCodeFilters[i] = (IntegerFilter)TransCodeFilter[i];
      }
      try {
        out.setTransCodeFilter(TransCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AnnotationMap = (Map)record.get("Annotation");
    Boolean AnnotationFetch = DataHelper.getFetch(AnnotationMap);
    Boolean AnnotationSortDir = DataHelper.getSortDirection(AnnotationMap);
    Integer AnnotationSortOrder = DataHelper.getSortOrder(AnnotationMap);
    if (AnnotationFetch != null) out.setAnnotationFetch(AnnotationFetch);
    if (AnnotationSortDir != null) out.setAnnotationSortDirection(AnnotationSortDir);
    if (AnnotationSortOrder != null) out.setAnnotationSortOrder(AnnotationSortOrder);

    Filter[] AnnotationFilter = DataHelper.mapToFilterArray(AnnotationMap, String.class);
    if (AnnotationFilter != null) {
      StringFilter[] AnnotationFilters = new StringFilter[AnnotationFilter.length];
      for (int i = 0; i < AnnotationFilters.length; i++) {
        AnnotationFilters[i] = (StringFilter)AnnotationFilter[i];
      }
      try {
        out.setAnnotationFilter(AnnotationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrimaryUnitsTypeMap = (Map)record.get("PrimaryUnitsType");
    Boolean PrimaryUnitsTypeFetch = DataHelper.getFetch(PrimaryUnitsTypeMap);
    Boolean PrimaryUnitsTypeSortDir = DataHelper.getSortDirection(PrimaryUnitsTypeMap);
    Integer PrimaryUnitsTypeSortOrder = DataHelper.getSortOrder(PrimaryUnitsTypeMap);
    if (PrimaryUnitsTypeFetch != null) out.setPrimaryUnitsTypeFetch(PrimaryUnitsTypeFetch);
    if (PrimaryUnitsTypeSortDir != null) out.setPrimaryUnitsTypeSortDirection(PrimaryUnitsTypeSortDir);
    if (PrimaryUnitsTypeSortOrder != null) out.setPrimaryUnitsTypeSortOrder(PrimaryUnitsTypeSortOrder);

    Filter[] PrimaryUnitsTypeFilter = DataHelper.mapToFilterArray(PrimaryUnitsTypeMap, Integer.class);
    if (PrimaryUnitsTypeFilter != null) {
      IntegerFilter[] PrimaryUnitsTypeFilters = new IntegerFilter[PrimaryUnitsTypeFilter.length];
      for (int i = 0; i < PrimaryUnitsTypeFilters.length; i++) {
        PrimaryUnitsTypeFilters[i] = (IntegerFilter)PrimaryUnitsTypeFilter[i];
      }
      try {
        out.setPrimaryUnitsTypeFilter(PrimaryUnitsTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrimaryUnitsMap = (Map)record.get("PrimaryUnits");
    Boolean PrimaryUnitsFetch = DataHelper.getFetch(PrimaryUnitsMap);
    Boolean PrimaryUnitsSortDir = DataHelper.getSortDirection(PrimaryUnitsMap);
    Integer PrimaryUnitsSortOrder = DataHelper.getSortOrder(PrimaryUnitsMap);
    if (PrimaryUnitsFetch != null) out.setPrimaryUnitsFetch(PrimaryUnitsFetch);
    if (PrimaryUnitsSortDir != null) out.setPrimaryUnitsSortDirection(PrimaryUnitsSortDir);
    if (PrimaryUnitsSortOrder != null) out.setPrimaryUnitsSortOrder(PrimaryUnitsSortOrder);

    Filter[] PrimaryUnitsFilter = DataHelper.mapToFilterArray(PrimaryUnitsMap, BigInteger.class);
    if (PrimaryUnitsFilter != null) {
      BigIntegerFilter[] PrimaryUnitsFilters = new BigIntegerFilter[PrimaryUnitsFilter.length];
      for (int i = 0; i < PrimaryUnitsFilters.length; i++) {
        PrimaryUnitsFilters[i] = (BigIntegerFilter)PrimaryUnitsFilter[i];
      }
      try {
        out.setPrimaryUnitsFilter(PrimaryUnitsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EffectiveDateMap = (Map)record.get("EffectiveDate");
    Boolean EffectiveDateFetch = DataHelper.getFetch(EffectiveDateMap);
    Boolean EffectiveDateSortDir = DataHelper.getSortDirection(EffectiveDateMap);
    Integer EffectiveDateSortOrder = DataHelper.getSortOrder(EffectiveDateMap);
    if (EffectiveDateFetch != null) out.setEffectiveDateFetch(EffectiveDateFetch);
    if (EffectiveDateSortDir != null) out.setEffectiveDateSortDirection(EffectiveDateSortDir);
    if (EffectiveDateSortOrder != null) out.setEffectiveDateSortOrder(EffectiveDateSortOrder);

    Filter[] EffectiveDateFilter = DataHelper.mapToFilterArray(EffectiveDateMap, Date.class);
    if (EffectiveDateFilter != null) {
      DateFilter[] EffectiveDateFilters = new DateFilter[EffectiveDateFilter.length];
      for (int i = 0; i < EffectiveDateFilters.length; i++) {
        EffectiveDateFilters[i] = (DateFilter)EffectiveDateFilter[i];
      }
      try {
        out.setEffectiveDateFilter(EffectiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CurrencyCodeMap = (Map)record.get("CurrencyCode");
    Boolean CurrencyCodeFetch = DataHelper.getFetch(CurrencyCodeMap);
    Boolean CurrencyCodeSortDir = DataHelper.getSortDirection(CurrencyCodeMap);
    Integer CurrencyCodeSortOrder = DataHelper.getSortOrder(CurrencyCodeMap);
    if (CurrencyCodeFetch != null) out.setCurrencyCodeFetch(CurrencyCodeFetch);
    if (CurrencyCodeSortDir != null) out.setCurrencyCodeSortDirection(CurrencyCodeSortDir);
    if (CurrencyCodeSortOrder != null) out.setCurrencyCodeSortOrder(CurrencyCodeSortOrder);

    Filter[] CurrencyCodeFilter = DataHelper.mapToFilterArray(CurrencyCodeMap, Integer.class);
    if (CurrencyCodeFilter != null) {
      IntegerFilter[] CurrencyCodeFilters = new IntegerFilter[CurrencyCodeFilter.length];
      for (int i = 0; i < CurrencyCodeFilters.length; i++) {
        CurrencyCodeFilters[i] = (IntegerFilter)CurrencyCodeFilter[i];
      }
      try {
        out.setCurrencyCodeFilter(CurrencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AdjReasonCodeMap = (Map)record.get("AdjReasonCode");
    Boolean AdjReasonCodeFetch = DataHelper.getFetch(AdjReasonCodeMap);
    Boolean AdjReasonCodeSortDir = DataHelper.getSortDirection(AdjReasonCodeMap);
    Integer AdjReasonCodeSortOrder = DataHelper.getSortOrder(AdjReasonCodeMap);
    if (AdjReasonCodeFetch != null) out.setAdjReasonCodeFetch(AdjReasonCodeFetch);
    if (AdjReasonCodeSortDir != null) out.setAdjReasonCodeSortDirection(AdjReasonCodeSortDir);
    if (AdjReasonCodeSortOrder != null) out.setAdjReasonCodeSortOrder(AdjReasonCodeSortOrder);

    Filter[] AdjReasonCodeFilter = DataHelper.mapToFilterArray(AdjReasonCodeMap, Integer.class);
    if (AdjReasonCodeFilter != null) {
      IntegerFilter[] AdjReasonCodeFilters = new IntegerFilter[AdjReasonCodeFilter.length];
      for (int i = 0; i < AdjReasonCodeFilters.length; i++) {
        AdjReasonCodeFilters[i] = (IntegerFilter)AdjReasonCodeFilter[i];
      }
      try {
        out.setAdjReasonCodeFilter(AdjReasonCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalAmtMap = (Map)record.get("TotalAmt");
    Boolean TotalAmtFetch = DataHelper.getFetch(TotalAmtMap);
    Boolean TotalAmtSortDir = DataHelper.getSortDirection(TotalAmtMap);
    Integer TotalAmtSortOrder = DataHelper.getSortOrder(TotalAmtMap);
    if (TotalAmtFetch != null) out.setTotalAmtFetch(TotalAmtFetch);
    if (TotalAmtSortDir != null) out.setTotalAmtSortDirection(TotalAmtSortDir);
    if (TotalAmtSortOrder != null) out.setTotalAmtSortOrder(TotalAmtSortOrder);

    Filter[] TotalAmtFilter = DataHelper.mapToFilterArray(TotalAmtMap, BigInteger.class);
    if (TotalAmtFilter != null) {
      BigIntegerFilter[] TotalAmtFilters = new BigIntegerFilter[TotalAmtFilter.length];
      for (int i = 0; i < TotalAmtFilters.length; i++) {
        TotalAmtFilters[i] = (BigIntegerFilter)TotalAmtFilter[i];
      }
      try {
        out.setTotalAmtFilter(TotalAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
