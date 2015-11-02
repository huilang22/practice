/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxAbandonedObjectHelper.java
 * Definition File: Customer/TaxAbandoned.xml
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



/** Helper class to convert TaxAbandonedObject JavaBean objects to/from HashMaps.
 */
public class TaxAbandonedObjectHelper implements ArubaObjectHelper
{
  /** convert TaxAbandonedObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (TaxAbandonedObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAbandonedObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAbandonedObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAbandonedObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAbandonedObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert TaxAbandonedObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxAbandonedObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxAbandonedObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxAbandonedObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxAbandonedObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxAbandonedObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TaxAbandonedObjectData.
   * @param record the Map containing the data to convert to the object
   * @return TaxAbandonedObjectData the converted object
   */
  public static TaxAbandonedObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TaxAbandonedObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TaxAbandonedObject")
   * @return TaxAbandonedObjectData the converted object
   */
  public static TaxAbandonedObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAbandonedObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TaxAbandonedObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return TaxAbandonedObjectFilter the converted object
   */
  public static TaxAbandonedObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TaxAbandonedObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TaxAbandonedObject")
   * @return TaxAbandonedObjectFilter the converted object
   */
  public static TaxAbandonedObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAbandonedObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to TaxAbandonedObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return TaxAbandonedObjectDataList the converted object
   */
  public static TaxAbandonedObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to TaxAbandonedObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "TaxAbandonedObjectList")
   * @return TaxAbandonedObjectDataList the converted object
   */
  public static TaxAbandonedObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxAbandonedObjectList";
    Object[] root = (Object[]) record.get (rootName);
    TaxAbandonedObjectData[] array = null;
    if (root != null)
    {
      array = new TaxAbandonedObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = TaxAbandonedObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new TaxAbandonedObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new TaxAbandonedObjectDataList (array, index, total);
  }
  /** convert TaxAbandonedObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxAbandonedObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", TaxAbandonedObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._FederalTaxSet) record.put ("FederalTax", in.FederalTax);
  
    if (in._StateTaxSet) record.put ("StateTax", in.StateTax);
  
    if (in._CountyTaxSet) record.put ("CountyTax", in.CountyTax);
  
    if (in._CityTaxSet) record.put ("CityTax", in.CityTax);
  
    if (in._OtherTaxSet) record.put ("OtherTax", in.OtherTax);
      return record;
  }
  /** convert TaxAbandonedObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxAbandonedObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", TaxAbandonedObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
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
    return record;
  }
  /** convert Map to TaxAbandonedObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAbandonedObjectData the converted object
   */
  public static TaxAbandonedObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAbandonedObjectData out = new TaxAbandonedObjectData ();

    out.Key = TaxAbandonedObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
      return out;
  }
  /** convert Map to TaxAbandonedObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxAbandonedObjectFilter the converted object
   */
  public static TaxAbandonedObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxAbandonedObjectFilter out = new TaxAbandonedObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = TaxAbandonedObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    return out;
  }
}
