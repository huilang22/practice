/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ChargeDistribPercentObjectHelper.java
 * Definition File: Customer/ChargeDistribPercent.xml
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



/** Helper class to convert ChargeDistribPercentObject JavaBean objects to/from HashMaps.
 */
public class ChargeDistribPercentObjectHelper implements ArubaObjectHelper
{
  /** convert ChargeDistribPercentObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ChargeDistribPercentObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ChargeDistribPercentObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ChargeDistribPercentObject")
   * @return Map     the output Map
   */
  public static Map toMap (ChargeDistribPercentObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ChargeDistribPercentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ChargeDistribPercentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ChargeDistribPercentObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ChargeDistribPercentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ChargeDistribPercentObject")
   * @return Map     the output Map
   */
  public static Map toMap (ChargeDistribPercentObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ChargeDistribPercentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ChargeDistribPercentObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ChargeDistribPercentObjectData the converted object
   */
  public static ChargeDistribPercentObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ChargeDistribPercentObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ChargeDistribPercentObject")
   * @return ChargeDistribPercentObjectData the converted object
   */
  public static ChargeDistribPercentObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ChargeDistribPercentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ChargeDistribPercentObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ChargeDistribPercentObjectFilter the converted object
   */
  public static ChargeDistribPercentObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ChargeDistribPercentObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ChargeDistribPercentObject")
   * @return ChargeDistribPercentObjectFilter the converted object
   */
  public static ChargeDistribPercentObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ChargeDistribPercentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ChargeDistribPercentObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ChargeDistribPercentObjectDataList the converted object
   */
  public static ChargeDistribPercentObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ChargeDistribPercentObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ChargeDistribPercentObjectList")
   * @return ChargeDistribPercentObjectDataList the converted object
   */
  public static ChargeDistribPercentObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ChargeDistribPercentObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ChargeDistribPercentObjectData[] array = null;
    if (root != null)
    {
      array = new ChargeDistribPercentObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ChargeDistribPercentObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ChargeDistribPercentObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ChargeDistribPercentObjectDataList (array, index, total);
  }
  /** convert ChargeDistribPercentObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ChargeDistribPercentObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ChargeDistribPercentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ADistriPercentSet) record.put ("ADistriPercent", in.ADistriPercent);
  
    if (in._BDistriPercentSet) record.put ("BDistriPercent", in.BDistriPercent);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
      return record;
  }
  /** convert ChargeDistribPercentObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ChargeDistribPercentObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ChargeDistribPercentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ADistriPercent, in.ADistriPercentSort, in.ADistriPercentSortAscending, in.ADistriPercentFetch);
      if (map != null) record.put ("ADistriPercent", map);
      map = DataHelper.filterToMap (in.BDistriPercent, in.BDistriPercentSort, in.BDistriPercentSortAscending, in.BDistriPercentFetch);
      if (map != null) record.put ("BDistriPercent", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
    return record;
  }
  /** convert Map to ChargeDistribPercentObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ChargeDistribPercentObjectData the converted object
   */
  public static ChargeDistribPercentObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ChargeDistribPercentObjectData out = new ChargeDistribPercentObjectData ();

    out.Key = ChargeDistribPercentObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ADistriPercent")) != null)
    {
      out.ADistriPercent = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BDistriPercent")) != null)
    {
      out.BDistriPercent = (BigInteger) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to ChargeDistribPercentObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ChargeDistribPercentObjectFilter the converted object
   */
  public static ChargeDistribPercentObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ChargeDistribPercentObjectFilter out = new ChargeDistribPercentObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ChargeDistribPercentObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ADistriPercentMap = (Map)record.get("ADistriPercent");
    Boolean ADistriPercentFetch = DataHelper.getFetch(ADistriPercentMap);
    Boolean ADistriPercentSortDir = DataHelper.getSortDirection(ADistriPercentMap);
    Integer ADistriPercentSortOrder = DataHelper.getSortOrder(ADistriPercentMap);
    if (ADistriPercentFetch != null) out.setADistriPercentFetch(ADistriPercentFetch);
    if (ADistriPercentSortDir != null) out.setADistriPercentSortDirection(ADistriPercentSortDir);
    if (ADistriPercentSortOrder != null) out.setADistriPercentSortOrder(ADistriPercentSortOrder);

    Filter[] ADistriPercentFilter = DataHelper.mapToFilterArray(ADistriPercentMap, BigInteger.class);
    if (ADistriPercentFilter != null) {
      BigIntegerFilter[] ADistriPercentFilters = new BigIntegerFilter[ADistriPercentFilter.length];
      for (int i = 0; i < ADistriPercentFilters.length; i++) {
        ADistriPercentFilters[i] = (BigIntegerFilter)ADistriPercentFilter[i];
      }
      try {
        out.setADistriPercentFilter(ADistriPercentFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BDistriPercentMap = (Map)record.get("BDistriPercent");
    Boolean BDistriPercentFetch = DataHelper.getFetch(BDistriPercentMap);
    Boolean BDistriPercentSortDir = DataHelper.getSortDirection(BDistriPercentMap);
    Integer BDistriPercentSortOrder = DataHelper.getSortOrder(BDistriPercentMap);
    if (BDistriPercentFetch != null) out.setBDistriPercentFetch(BDistriPercentFetch);
    if (BDistriPercentSortDir != null) out.setBDistriPercentSortDirection(BDistriPercentSortDir);
    if (BDistriPercentSortOrder != null) out.setBDistriPercentSortOrder(BDistriPercentSortOrder);

    Filter[] BDistriPercentFilter = DataHelper.mapToFilterArray(BDistriPercentMap, BigInteger.class);
    if (BDistriPercentFilter != null) {
      BigIntegerFilter[] BDistriPercentFilters = new BigIntegerFilter[BDistriPercentFilter.length];
      for (int i = 0; i < BDistriPercentFilters.length; i++) {
        BDistriPercentFilters[i] = (BigIntegerFilter)BDistriPercentFilter[i];
      }
      try {
        out.setBDistriPercentFilter(BDistriPercentFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InactiveDateMap = (Map)record.get("InactiveDate");
    Boolean InactiveDateFetch = DataHelper.getFetch(InactiveDateMap);
    Boolean InactiveDateSortDir = DataHelper.getSortDirection(InactiveDateMap);
    Integer InactiveDateSortOrder = DataHelper.getSortOrder(InactiveDateMap);
    if (InactiveDateFetch != null) out.setInactiveDateFetch(InactiveDateFetch);
    if (InactiveDateSortDir != null) out.setInactiveDateSortDirection(InactiveDateSortDir);
    if (InactiveDateSortOrder != null) out.setInactiveDateSortOrder(InactiveDateSortOrder);

    Filter[] InactiveDateFilter = DataHelper.mapToFilterArray(InactiveDateMap, Date.class);
    if (InactiveDateFilter != null) {
      DateFilter[] InactiveDateFilters = new DateFilter[InactiveDateFilter.length];
      for (int i = 0; i < InactiveDateFilters.length; i++) {
        InactiveDateFilters[i] = (DateFilter)InactiveDateFilter[i];
      }
      try {
        out.setInactiveDateFilter(InactiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
