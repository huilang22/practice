/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalContributionTaxObjectHelper.java
 * Definition File: Customer/HistoricalContributionTax.xml
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



/** Helper class to convert HistoricalContributionTaxObject JavaBean objects to/from HashMaps.
 */
public class HistoricalContributionTaxObjectHelper implements ArubaObjectHelper
{
  /** convert HistoricalContributionTaxObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (HistoricalContributionTaxObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalContributionTaxObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalContributionTaxObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionTaxObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalContributionTaxObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert HistoricalContributionTaxObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionTaxObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert HistoricalContributionTaxObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "HistoricalContributionTaxObject")
   * @return Map     the output Map
   */
  public static Map toMap (HistoricalContributionTaxObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "HistoricalContributionTaxObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to HistoricalContributionTaxObjectData.
   * @param record the Map containing the data to convert to the object
   * @return HistoricalContributionTaxObjectData the converted object
   */
  public static HistoricalContributionTaxObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to HistoricalContributionTaxObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "HistoricalContributionTaxObject")
   * @return HistoricalContributionTaxObjectData the converted object
   */
  public static HistoricalContributionTaxObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionTaxObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to HistoricalContributionTaxObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return HistoricalContributionTaxObjectFilter the converted object
   */
  public static HistoricalContributionTaxObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to HistoricalContributionTaxObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "HistoricalContributionTaxObject")
   * @return HistoricalContributionTaxObjectFilter the converted object
   */
  public static HistoricalContributionTaxObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionTaxObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to HistoricalContributionTaxObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return HistoricalContributionTaxObjectDataList the converted object
   */
  public static HistoricalContributionTaxObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to HistoricalContributionTaxObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "HistoricalContributionTaxObjectList")
   * @return HistoricalContributionTaxObjectDataList the converted object
   */
  public static HistoricalContributionTaxObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "HistoricalContributionTaxObjectList";
    Object[] root = (Object[]) record.get (rootName);
    HistoricalContributionTaxObjectData[] array = null;
    if (root != null)
    {
      array = new HistoricalContributionTaxObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = HistoricalContributionTaxObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new HistoricalContributionTaxObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new HistoricalContributionTaxObjectDataList (array, index, total);
  }
  /** convert HistoricalContributionTaxObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HistoricalContributionTaxObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", HistoricalContributionTaxObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._TaxTypeCodeSet) record.put ("TaxTypeCode", in.TaxTypeCode);
  
    if (in._BasisSet) record.put ("Basis", in.Basis);
  
    if (in._TaxSet) record.put ("Tax", in.Tax);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
      return record;
  }
  /** convert HistoricalContributionTaxObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (HistoricalContributionTaxObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", HistoricalContributionTaxObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.TaxTypeCode, in.TaxTypeCodeSort, in.TaxTypeCodeSortAscending, in.TaxTypeCodeFetch);
      if (map != null) record.put ("TaxTypeCode", map);
      map = DataHelper.filterToMap (in.Basis, in.BasisSort, in.BasisSortAscending, in.BasisFetch);
      if (map != null) record.put ("Basis", map);
      map = DataHelper.filterToMap (in.Tax, in.TaxSort, in.TaxSortAscending, in.TaxFetch);
      if (map != null) record.put ("Tax", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
    return record;
  }
  /** convert Map to HistoricalContributionTaxObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalContributionTaxObjectData the converted object
   */
  public static HistoricalContributionTaxObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalContributionTaxObjectData out = new HistoricalContributionTaxObjectData ();

    out.Key = HistoricalContributionTaxObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("TaxTypeCode")) != null)
    {
      out.TaxTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Basis")) != null)
    {
      out.Basis = (BigInteger) obj;
    }
  
    if ((obj = record.get ("Tax")) != null)
    {
      out.Tax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
      return out;
  }
  /** convert Map to HistoricalContributionTaxObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return HistoricalContributionTaxObjectFilter the converted object
   */
  public static HistoricalContributionTaxObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    HistoricalContributionTaxObjectFilter out = new HistoricalContributionTaxObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = HistoricalContributionTaxObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map BasisMap = (Map)record.get("Basis");
    Boolean BasisFetch = DataHelper.getFetch(BasisMap);
    Boolean BasisSortDir = DataHelper.getSortDirection(BasisMap);
    Integer BasisSortOrder = DataHelper.getSortOrder(BasisMap);
    if (BasisFetch != null) out.setBasisFetch(BasisFetch);
    if (BasisSortDir != null) out.setBasisSortDirection(BasisSortDir);
    if (BasisSortOrder != null) out.setBasisSortOrder(BasisSortOrder);

    Filter[] BasisFilter = DataHelper.mapToFilterArray(BasisMap, BigInteger.class);
    if (BasisFilter != null) {
      BigIntegerFilter[] BasisFilters = new BigIntegerFilter[BasisFilter.length];
      for (int i = 0; i < BasisFilters.length; i++) {
        BasisFilters[i] = (BigIntegerFilter)BasisFilter[i];
      }
      try {
        out.setBasisFilter(BasisFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxMap = (Map)record.get("Tax");
    Boolean TaxFetch = DataHelper.getFetch(TaxMap);
    Boolean TaxSortDir = DataHelper.getSortDirection(TaxMap);
    Integer TaxSortOrder = DataHelper.getSortOrder(TaxMap);
    if (TaxFetch != null) out.setTaxFetch(TaxFetch);
    if (TaxSortDir != null) out.setTaxSortDirection(TaxSortDir);
    if (TaxSortOrder != null) out.setTaxSortOrder(TaxSortOrder);

    Filter[] TaxFilter = DataHelper.mapToFilterArray(TaxMap, BigInteger.class);
    if (TaxFilter != null) {
      BigIntegerFilter[] TaxFilters = new BigIntegerFilter[TaxFilter.length];
      for (int i = 0; i < TaxFilters.length; i++) {
        TaxFilters[i] = (BigIntegerFilter)TaxFilter[i];
      }
      try {
        out.setTaxFilter(TaxFilters);
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
  
    return out;
  }
}
