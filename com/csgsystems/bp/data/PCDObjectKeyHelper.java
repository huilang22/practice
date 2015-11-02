/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PCDObjectKeyHelper.java
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

/** Helper class for PCDObject's Key objects. */
public class PCDObjectKeyHelper implements ArubaObjectHelper
{
  /** convert PCDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PCDObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PCDObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PCDObject")
   * @return Map     the output Map
   */
  public static Map toMap (PCDObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PCDObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert PCDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PCDObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PCDObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PCDObject")
   * @return Map     the output Map
   */
  public static Map toMap (PCDObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PCDObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PCDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return PCDObjectKeyData the converted object
   */
  public static PCDObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PCDObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PCDObject")
   * @return PCDObjectKeyData the converted object
   */
  public static PCDObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PCDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PCDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return PCDObjectKeyFilter the converted object
   */
  public static PCDObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PCDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PCDObject")
   * @return PCDObjectKeyFilter the converted object
   */
  public static PCDObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PCDObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert PCDObjectKeyData to a Map (not including the root).
  /** convert PCDObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PCDObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._PackageIdSet) record.put ("PackageId", in.PackageId);
  
    if (in._PackageActiveDtSet) record.put ("PackageActiveDt", in.PackageActiveDt);
  
    if (in._ComponentIdSet) record.put ("ComponentId", in.ComponentId);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    return record;
  }
  /** convert PCDObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PCDObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.PackageId, in.PackageIdSort, in.PackageIdSortAscending, in.PackageIdFetch);
      if (map != null) record.put ("PackageId", map);
      map = DataHelper.filterToMap (in.PackageActiveDt, in.PackageActiveDtSort, in.PackageActiveDtSortAscending, in.PackageActiveDtFetch);
      if (map != null) record.put ("PackageActiveDt", map);
      map = DataHelper.filterToMap (in.ComponentId, in.ComponentIdSort, in.ComponentIdSortAscending, in.ComponentIdFetch);
      if (map != null) record.put ("ComponentId", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
    return record;
  }
  /** convert Map to PCDObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PCDObjectKeyData the converted object
   */
  public static PCDObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PCDObjectKeyData out = new PCDObjectKeyData ();

    if ((obj = record.get ("PackageId")) != null)
    {
      out.PackageId = (Integer) obj;
      out._PackageIdSet = true;
    }
  
    if ((obj = record.get ("PackageActiveDt")) != null)
    {
      out.PackageActiveDt = (Date) obj;
      out._PackageActiveDtSet = true;
    }
  
    if ((obj = record.get ("ComponentId")) != null)
    {
      out.ComponentId = (Integer) obj;
      out._ComponentIdSet = true;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
      out._LanguageCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to PCDObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PCDObjectKeyFilter the converted object
   */
  public static PCDObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PCDObjectKeyFilter out = new PCDObjectKeyFilter ();

    Map PackageIdMap = (Map)record.get("PackageId");
    Boolean PackageIdFetch = DataHelper.getFetch(PackageIdMap);
    Boolean PackageIdSortDir = DataHelper.getSortDirection(PackageIdMap);
    Integer PackageIdSortOrder = DataHelper.getSortOrder(PackageIdMap);
    if (PackageIdFetch != null) out.setPackageIdFetch(PackageIdFetch);
    if (PackageIdSortDir != null) out.setPackageIdSortDirection(PackageIdSortDir);
    if (PackageIdSortOrder != null) out.setPackageIdSortOrder(PackageIdSortOrder);

    Filter[] PackageIdFilter = DataHelper.mapToFilterArray(PackageIdMap, Integer.class);
    if (PackageIdFilter != null) {
      IntegerFilter[] PackageIdFilters = new IntegerFilter[PackageIdFilter.length];
      for (int i = 0; i < PackageIdFilters.length; i++) {
        PackageIdFilters[i] = (IntegerFilter)PackageIdFilter[i];
      }
      try {
        out.setPackageIdFilter(PackageIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PackageActiveDtMap = (Map)record.get("PackageActiveDt");
    Boolean PackageActiveDtFetch = DataHelper.getFetch(PackageActiveDtMap);
    Boolean PackageActiveDtSortDir = DataHelper.getSortDirection(PackageActiveDtMap);
    Integer PackageActiveDtSortOrder = DataHelper.getSortOrder(PackageActiveDtMap);
    if (PackageActiveDtFetch != null) out.setPackageActiveDtFetch(PackageActiveDtFetch);
    if (PackageActiveDtSortDir != null) out.setPackageActiveDtSortDirection(PackageActiveDtSortDir);
    if (PackageActiveDtSortOrder != null) out.setPackageActiveDtSortOrder(PackageActiveDtSortOrder);

    Filter[] PackageActiveDtFilter = DataHelper.mapToFilterArray(PackageActiveDtMap, Date.class);
    if (PackageActiveDtFilter != null) {
      DateFilter[] PackageActiveDtFilters = new DateFilter[PackageActiveDtFilter.length];
      for (int i = 0; i < PackageActiveDtFilters.length; i++) {
        PackageActiveDtFilters[i] = (DateFilter)PackageActiveDtFilter[i];
      }
      try {
        out.setPackageActiveDtFilter(PackageActiveDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ComponentIdMap = (Map)record.get("ComponentId");
    Boolean ComponentIdFetch = DataHelper.getFetch(ComponentIdMap);
    Boolean ComponentIdSortDir = DataHelper.getSortDirection(ComponentIdMap);
    Integer ComponentIdSortOrder = DataHelper.getSortOrder(ComponentIdMap);
    if (ComponentIdFetch != null) out.setComponentIdFetch(ComponentIdFetch);
    if (ComponentIdSortDir != null) out.setComponentIdSortDirection(ComponentIdSortDir);
    if (ComponentIdSortOrder != null) out.setComponentIdSortOrder(ComponentIdSortOrder);

    Filter[] ComponentIdFilter = DataHelper.mapToFilterArray(ComponentIdMap, Integer.class);
    if (ComponentIdFilter != null) {
      IntegerFilter[] ComponentIdFilters = new IntegerFilter[ComponentIdFilter.length];
      for (int i = 0; i < ComponentIdFilters.length; i++) {
        ComponentIdFilters[i] = (IntegerFilter)ComponentIdFilter[i];
      }
      try {
        out.setComponentIdFilter(ComponentIdFilters);
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
