/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AdjustmentTaxObjectHelper.java
 * Definition File: Customer/AdjustmentTax.xml
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



/** Helper class to convert AdjustmentTaxObject JavaBean objects to/from HashMaps.
 */
public class AdjustmentTaxObjectHelper implements ArubaObjectHelper
{
  /** convert AdjustmentTaxObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AdjustmentTaxObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentTaxObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentTaxObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTaxObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentTaxObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AdjustmentTaxObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTaxObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AdjustmentTaxObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AdjustmentTaxObject")
   * @return Map     the output Map
   */
  public static Map toMap (AdjustmentTaxObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AdjustmentTaxObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AdjustmentTaxObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AdjustmentTaxObjectData the converted object
   */
  public static AdjustmentTaxObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AdjustmentTaxObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AdjustmentTaxObject")
   * @return AdjustmentTaxObjectData the converted object
   */
  public static AdjustmentTaxObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentTaxObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AdjustmentTaxObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AdjustmentTaxObjectFilter the converted object
   */
  public static AdjustmentTaxObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AdjustmentTaxObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AdjustmentTaxObject")
   * @return AdjustmentTaxObjectFilter the converted object
   */
  public static AdjustmentTaxObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentTaxObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AdjustmentTaxObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AdjustmentTaxObjectDataList the converted object
   */
  public static AdjustmentTaxObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AdjustmentTaxObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AdjustmentTaxObjectList")
   * @return AdjustmentTaxObjectDataList the converted object
   */
  public static AdjustmentTaxObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AdjustmentTaxObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AdjustmentTaxObjectData[] array = null;
    if (root != null)
    {
      array = new AdjustmentTaxObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AdjustmentTaxObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AdjustmentTaxObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AdjustmentTaxObjectDataList (array, index, total);
  }
  /** convert AdjustmentTaxObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AdjustmentTaxObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AdjustmentTaxObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._TrackingIdCounterSet) record.put ("TrackingIdCounter", in.TrackingIdCounter);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._TaxRateSet) record.put ("TaxRate", in.TaxRate);
  
    if (in._FederalTaxSet) record.put ("FederalTax", in.FederalTax);
  
    if (in._StateTaxSet) record.put ("StateTax", in.StateTax);
  
    if (in._CountyTaxSet) record.put ("CountyTax", in.CountyTax);
  
    if (in._CityTaxSet) record.put ("CityTax", in.CityTax);
  
    if (in._OtherTaxSet) record.put ("OtherTax", in.OtherTax);
  
    if (in._ArchFlagSet) record.put ("ArchFlag", in.ArchFlag);
  
    if (in._AuxTaxInfoSet) record.put ("AuxTaxInfo", in.AuxTaxInfo);
  
    if (in._TaxTypeCodeSet) record.put ("TaxTypeCode", in.TaxTypeCode);
      return record;
  }
  /** convert AdjustmentTaxObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AdjustmentTaxObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AdjustmentTaxObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.TrackingIdCounter, in.TrackingIdCounterSort, in.TrackingIdCounterSortAscending, in.TrackingIdCounterFetch);
      if (map != null) record.put ("TrackingIdCounter", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
      map = DataHelper.filterToMap (in.TaxRate, in.TaxRateSort, in.TaxRateSortAscending, in.TaxRateFetch);
      if (map != null) record.put ("TaxRate", map);
      map = DataHelper.filterToMap (in.FederalTax, in.FederalTaxSort, in.FederalTaxSortAscending, in.FederalTaxFetch);
      if (map != null) record.put ("FederalTax", map);
      map = DataHelper.filterToMap (in.StateTax, in.StateTaxSort, in.StateTaxSortAscending, in.StateTaxFetch);
      if (map != null) record.put ("StateTax", map);
      map = DataHelper.filterToMap (in.CountyTax, in.CountyTaxSort, in.CountyTaxSortAscending, in.CountyTaxFetch);
      if (map != null) record.put ("CountyTax", map);
      map = DataHelper.filterToMap (in.CityTax, in.CityTaxSort, in.CityTaxSortAscending, in.CityTaxFetch);
      if (map != null) record.put ("CityTax", map);
      map = DataHelper.filterToMap (in.OtherTax, in.OtherTaxSort, in.OtherTaxSortAscending, in.OtherTaxFetch);
      if (map != null) record.put ("OtherTax", map);
      map = DataHelper.filterToMap (in.ArchFlag, in.ArchFlagSort, in.ArchFlagSortAscending, in.ArchFlagFetch);
      if (map != null) record.put ("ArchFlag", map);
      map = DataHelper.filterToMap (in.AuxTaxInfo, in.AuxTaxInfoSort, in.AuxTaxInfoSortAscending, in.AuxTaxInfoFetch, in.AuxTaxInfoCaseInsensitive);
      if (map != null) record.put ("AuxTaxInfo", map);
      map = DataHelper.filterToMap (in.TaxTypeCode, in.TaxTypeCodeSort, in.TaxTypeCodeSortAscending, in.TaxTypeCodeFetch);
      if (map != null) record.put ("TaxTypeCode", map);
    return record;
  }
  /** convert Map to AdjustmentTaxObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentTaxObjectData the converted object
   */
  public static AdjustmentTaxObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentTaxObjectData out = new AdjustmentTaxObjectData ();

    out.Key = AdjustmentTaxObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("TrackingIdCounter")) != null)
    {
      out.TrackingIdCounter = (Integer) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("TaxRate")) != null)
    {
      out.TaxRate = (Integer) obj;
    }
  
    if ((obj = record.get ("FederalTax")) != null)
    {
      out.FederalTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("StateTax")) != null)
    {
      out.StateTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CountyTax")) != null)
    {
      out.CountyTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CityTax")) != null)
    {
      out.CityTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("OtherTax")) != null)
    {
      out.OtherTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ArchFlag")) != null)
    {
      out.ArchFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("AuxTaxInfo")) != null)
    {
      out.AuxTaxInfo = (String) obj;
    }
  
    if ((obj = record.get ("TaxTypeCode")) != null)
    {
      out.TaxTypeCode = (Integer) obj;
    }
      return out;
  }
  /** convert Map to AdjustmentTaxObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AdjustmentTaxObjectFilter the converted object
   */
  public static AdjustmentTaxObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AdjustmentTaxObjectFilter out = new AdjustmentTaxObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AdjustmentTaxObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map TrackingIdCounterMap = (Map)record.get("TrackingIdCounter");
    Boolean TrackingIdCounterFetch = DataHelper.getFetch(TrackingIdCounterMap);
    Boolean TrackingIdCounterSortDir = DataHelper.getSortDirection(TrackingIdCounterMap);
    Integer TrackingIdCounterSortOrder = DataHelper.getSortOrder(TrackingIdCounterMap);
    if (TrackingIdCounterFetch != null) out.setTrackingIdCounterFetch(TrackingIdCounterFetch);
    if (TrackingIdCounterSortDir != null) out.setTrackingIdCounterSortDirection(TrackingIdCounterSortDir);
    if (TrackingIdCounterSortOrder != null) out.setTrackingIdCounterSortOrder(TrackingIdCounterSortOrder);

    Filter[] TrackingIdCounterFilter = DataHelper.mapToFilterArray(TrackingIdCounterMap, Integer.class);
    if (TrackingIdCounterFilter != null) {
      IntegerFilter[] TrackingIdCounterFilters = new IntegerFilter[TrackingIdCounterFilter.length];
      for (int i = 0; i < TrackingIdCounterFilters.length; i++) {
        TrackingIdCounterFilters[i] = (IntegerFilter)TrackingIdCounterFilter[i];
      }
      try {
        out.setTrackingIdCounterFilter(TrackingIdCounterFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NoBillMap = (Map)record.get("NoBill");
    Boolean NoBillFetch = DataHelper.getFetch(NoBillMap);
    Boolean NoBillSortDir = DataHelper.getSortDirection(NoBillMap);
    Integer NoBillSortOrder = DataHelper.getSortOrder(NoBillMap);
    if (NoBillFetch != null) out.setNoBillFetch(NoBillFetch);
    if (NoBillSortDir != null) out.setNoBillSortDirection(NoBillSortDir);
    if (NoBillSortOrder != null) out.setNoBillSortOrder(NoBillSortOrder);

    Filter[] NoBillFilter = DataHelper.mapToFilterArray(NoBillMap, Boolean.class);
    if (NoBillFilter != null) {
      BooleanFilter[] NoBillFilters = new BooleanFilter[NoBillFilter.length];
      for (int i = 0; i < NoBillFilters.length; i++) {
        NoBillFilters[i] = (BooleanFilter)NoBillFilter[i];
      }
      try {
        out.setNoBillFilter(NoBillFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxRateMap = (Map)record.get("TaxRate");
    Boolean TaxRateFetch = DataHelper.getFetch(TaxRateMap);
    Boolean TaxRateSortDir = DataHelper.getSortDirection(TaxRateMap);
    Integer TaxRateSortOrder = DataHelper.getSortOrder(TaxRateMap);
    if (TaxRateFetch != null) out.setTaxRateFetch(TaxRateFetch);
    if (TaxRateSortDir != null) out.setTaxRateSortDirection(TaxRateSortDir);
    if (TaxRateSortOrder != null) out.setTaxRateSortOrder(TaxRateSortOrder);

    Filter[] TaxRateFilter = DataHelper.mapToFilterArray(TaxRateMap, Integer.class);
    if (TaxRateFilter != null) {
      IntegerFilter[] TaxRateFilters = new IntegerFilter[TaxRateFilter.length];
      for (int i = 0; i < TaxRateFilters.length; i++) {
        TaxRateFilters[i] = (IntegerFilter)TaxRateFilter[i];
      }
      try {
        out.setTaxRateFilter(TaxRateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FederalTaxMap = (Map)record.get("FederalTax");
    Boolean FederalTaxFetch = DataHelper.getFetch(FederalTaxMap);
    Boolean FederalTaxSortDir = DataHelper.getSortDirection(FederalTaxMap);
    Integer FederalTaxSortOrder = DataHelper.getSortOrder(FederalTaxMap);
    if (FederalTaxFetch != null) out.setFederalTaxFetch(FederalTaxFetch);
    if (FederalTaxSortDir != null) out.setFederalTaxSortDirection(FederalTaxSortDir);
    if (FederalTaxSortOrder != null) out.setFederalTaxSortOrder(FederalTaxSortOrder);

    Filter[] FederalTaxFilter = DataHelper.mapToFilterArray(FederalTaxMap, BigInteger.class);
    if (FederalTaxFilter != null) {
      BigIntegerFilter[] FederalTaxFilters = new BigIntegerFilter[FederalTaxFilter.length];
      for (int i = 0; i < FederalTaxFilters.length; i++) {
        FederalTaxFilters[i] = (BigIntegerFilter)FederalTaxFilter[i];
      }
      try {
        out.setFederalTaxFilter(FederalTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StateTaxMap = (Map)record.get("StateTax");
    Boolean StateTaxFetch = DataHelper.getFetch(StateTaxMap);
    Boolean StateTaxSortDir = DataHelper.getSortDirection(StateTaxMap);
    Integer StateTaxSortOrder = DataHelper.getSortOrder(StateTaxMap);
    if (StateTaxFetch != null) out.setStateTaxFetch(StateTaxFetch);
    if (StateTaxSortDir != null) out.setStateTaxSortDirection(StateTaxSortDir);
    if (StateTaxSortOrder != null) out.setStateTaxSortOrder(StateTaxSortOrder);

    Filter[] StateTaxFilter = DataHelper.mapToFilterArray(StateTaxMap, BigInteger.class);
    if (StateTaxFilter != null) {
      BigIntegerFilter[] StateTaxFilters = new BigIntegerFilter[StateTaxFilter.length];
      for (int i = 0; i < StateTaxFilters.length; i++) {
        StateTaxFilters[i] = (BigIntegerFilter)StateTaxFilter[i];
      }
      try {
        out.setStateTaxFilter(StateTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountyTaxMap = (Map)record.get("CountyTax");
    Boolean CountyTaxFetch = DataHelper.getFetch(CountyTaxMap);
    Boolean CountyTaxSortDir = DataHelper.getSortDirection(CountyTaxMap);
    Integer CountyTaxSortOrder = DataHelper.getSortOrder(CountyTaxMap);
    if (CountyTaxFetch != null) out.setCountyTaxFetch(CountyTaxFetch);
    if (CountyTaxSortDir != null) out.setCountyTaxSortDirection(CountyTaxSortDir);
    if (CountyTaxSortOrder != null) out.setCountyTaxSortOrder(CountyTaxSortOrder);

    Filter[] CountyTaxFilter = DataHelper.mapToFilterArray(CountyTaxMap, BigInteger.class);
    if (CountyTaxFilter != null) {
      BigIntegerFilter[] CountyTaxFilters = new BigIntegerFilter[CountyTaxFilter.length];
      for (int i = 0; i < CountyTaxFilters.length; i++) {
        CountyTaxFilters[i] = (BigIntegerFilter)CountyTaxFilter[i];
      }
      try {
        out.setCountyTaxFilter(CountyTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CityTaxMap = (Map)record.get("CityTax");
    Boolean CityTaxFetch = DataHelper.getFetch(CityTaxMap);
    Boolean CityTaxSortDir = DataHelper.getSortDirection(CityTaxMap);
    Integer CityTaxSortOrder = DataHelper.getSortOrder(CityTaxMap);
    if (CityTaxFetch != null) out.setCityTaxFetch(CityTaxFetch);
    if (CityTaxSortDir != null) out.setCityTaxSortDirection(CityTaxSortDir);
    if (CityTaxSortOrder != null) out.setCityTaxSortOrder(CityTaxSortOrder);

    Filter[] CityTaxFilter = DataHelper.mapToFilterArray(CityTaxMap, BigInteger.class);
    if (CityTaxFilter != null) {
      BigIntegerFilter[] CityTaxFilters = new BigIntegerFilter[CityTaxFilter.length];
      for (int i = 0; i < CityTaxFilters.length; i++) {
        CityTaxFilters[i] = (BigIntegerFilter)CityTaxFilter[i];
      }
      try {
        out.setCityTaxFilter(CityTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OtherTaxMap = (Map)record.get("OtherTax");
    Boolean OtherTaxFetch = DataHelper.getFetch(OtherTaxMap);
    Boolean OtherTaxSortDir = DataHelper.getSortDirection(OtherTaxMap);
    Integer OtherTaxSortOrder = DataHelper.getSortOrder(OtherTaxMap);
    if (OtherTaxFetch != null) out.setOtherTaxFetch(OtherTaxFetch);
    if (OtherTaxSortDir != null) out.setOtherTaxSortDirection(OtherTaxSortDir);
    if (OtherTaxSortOrder != null) out.setOtherTaxSortOrder(OtherTaxSortOrder);

    Filter[] OtherTaxFilter = DataHelper.mapToFilterArray(OtherTaxMap, BigInteger.class);
    if (OtherTaxFilter != null) {
      BigIntegerFilter[] OtherTaxFilters = new BigIntegerFilter[OtherTaxFilter.length];
      for (int i = 0; i < OtherTaxFilters.length; i++) {
        OtherTaxFilters[i] = (BigIntegerFilter)OtherTaxFilter[i];
      }
      try {
        out.setOtherTaxFilter(OtherTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ArchFlagMap = (Map)record.get("ArchFlag");
    Boolean ArchFlagFetch = DataHelper.getFetch(ArchFlagMap);
    Boolean ArchFlagSortDir = DataHelper.getSortDirection(ArchFlagMap);
    Integer ArchFlagSortOrder = DataHelper.getSortOrder(ArchFlagMap);
    if (ArchFlagFetch != null) out.setArchFlagFetch(ArchFlagFetch);
    if (ArchFlagSortDir != null) out.setArchFlagSortDirection(ArchFlagSortDir);
    if (ArchFlagSortOrder != null) out.setArchFlagSortOrder(ArchFlagSortOrder);

    Filter[] ArchFlagFilter = DataHelper.mapToFilterArray(ArchFlagMap, Boolean.class);
    if (ArchFlagFilter != null) {
      BooleanFilter[] ArchFlagFilters = new BooleanFilter[ArchFlagFilter.length];
      for (int i = 0; i < ArchFlagFilters.length; i++) {
        ArchFlagFilters[i] = (BooleanFilter)ArchFlagFilter[i];
      }
      try {
        out.setArchFlagFilter(ArchFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AuxTaxInfoMap = (Map)record.get("AuxTaxInfo");
    Boolean AuxTaxInfoFetch = DataHelper.getFetch(AuxTaxInfoMap);
    Boolean AuxTaxInfoSortDir = DataHelper.getSortDirection(AuxTaxInfoMap);
    Integer AuxTaxInfoSortOrder = DataHelper.getSortOrder(AuxTaxInfoMap);
    if (AuxTaxInfoFetch != null) out.setAuxTaxInfoFetch(AuxTaxInfoFetch);
    if (AuxTaxInfoSortDir != null) out.setAuxTaxInfoSortDirection(AuxTaxInfoSortDir);
    if (AuxTaxInfoSortOrder != null) out.setAuxTaxInfoSortOrder(AuxTaxInfoSortOrder);

    Filter[] AuxTaxInfoFilter = DataHelper.mapToFilterArray(AuxTaxInfoMap, String.class);
    if (AuxTaxInfoFilter != null) {
      StringFilter[] AuxTaxInfoFilters = new StringFilter[AuxTaxInfoFilter.length];
      for (int i = 0; i < AuxTaxInfoFilters.length; i++) {
        AuxTaxInfoFilters[i] = (StringFilter)AuxTaxInfoFilter[i];
      }
      try {
        out.setAuxTaxInfoFilter(AuxTaxInfoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxTypeCodeMap = (Map)record.get("TaxTypeCode");
    Boolean TaxTypeCodeFetch = DataHelper.getFetch(TaxTypeCodeMap);
    Boolean TaxTypeCodeSortDir = DataHelper.getSortDirection(TaxTypeCodeMap);
    Integer TaxTypeCodeSortOrder = DataHelper.getSortOrder(TaxTypeCodeMap);
    if (TaxTypeCodeFetch != null) out.setTaxTypeCodeFetch(TaxTypeCodeFetch);
    if (TaxTypeCodeSortDir != null) out.setTaxTypeCodeSortDirection(TaxTypeCodeSortDir);
    if (TaxTypeCodeSortOrder != null) out.setTaxTypeCodeSortOrder(TaxTypeCodeSortOrder);

    Filter[] TaxTypeCodeFilter = DataHelper.mapToFilterArray(TaxTypeCodeMap, Integer.class);
    if (TaxTypeCodeFilter != null) {
      IntegerFilter[] TaxTypeCodeFilters = new IntegerFilter[TaxTypeCodeFilter.length];
      for (int i = 0; i < TaxTypeCodeFilters.length; i++) {
        TaxTypeCodeFilters[i] = (IntegerFilter)TaxTypeCodeFilter[i];
      }
      try {
        out.setTaxTypeCodeFilter(TaxTypeCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
