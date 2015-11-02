/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EIHGMObjectKeyHelper.java
 * Definition File: Catalog/.xml
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

/** Helper class for EIHGMObject's Key objects. */
public class EIHGMObjectKeyHelper implements ArubaObjectHelper
{
  /** convert EIHGMObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EIHGMObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EIHGMObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EIHGMObject")
   * @return Map     the output Map
   */
  public static Map toMap (EIHGMObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EIHGMObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert EIHGMObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EIHGMObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EIHGMObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EIHGMObject")
   * @return Map     the output Map
   */
  public static Map toMap (EIHGMObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EIHGMObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EIHGMObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return EIHGMObjectKeyData the converted object
   */
  public static EIHGMObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EIHGMObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EIHGMObject")
   * @return EIHGMObjectKeyData the converted object
   */
  public static EIHGMObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EIHGMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EIHGMObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return EIHGMObjectKeyFilter the converted object
   */
  public static EIHGMObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EIHGMObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EIHGMObject")
   * @return EIHGMObjectKeyFilter the converted object
   */
  public static EIHGMObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EIHGMObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert EIHGMObjectKeyData to a Map (not including the root).
  /** convert EIHGMObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (EIHGMObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ExternalIdSet) record.put ("ExternalId", in.ExternalId);
  
    if (in._ExternalIdTypeSet) record.put ("ExternalIdType", in.ExternalIdType);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    return record;
  }
  /** convert EIHGMObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (EIHGMObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ExternalId, in.ExternalIdSort, in.ExternalIdSortAscending, in.ExternalIdFetch, in.ExternalIdCaseInsensitive);
      if (map != null) record.put ("ExternalId", map);
      map = DataHelper.filterToMap (in.ExternalIdType, in.ExternalIdTypeSort, in.ExternalIdTypeSortAscending, in.ExternalIdTypeFetch);
      if (map != null) record.put ("ExternalIdType", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
    return record;
  }
  /** convert Map to EIHGMObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EIHGMObjectKeyData the converted object
   */
  public static EIHGMObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EIHGMObjectKeyData out = new EIHGMObjectKeyData ();

    if ((obj = record.get ("ExternalId")) != null)
    {
      out.ExternalId = (String) obj;
      out._ExternalIdSet = true;
    }
  
    if ((obj = record.get ("ExternalIdType")) != null)
    {
      out.ExternalIdType = (Integer) obj;
      out._ExternalIdTypeSet = true;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
      out._ActiveDateSet = true;
    }
  
    return out;
  }
  /** convert Map to EIHGMObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EIHGMObjectKeyFilter the converted object
   */
  public static EIHGMObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EIHGMObjectKeyFilter out = new EIHGMObjectKeyFilter ();

    Map ExternalIdMap = (Map)record.get("ExternalId");
    Boolean ExternalIdFetch = DataHelper.getFetch(ExternalIdMap);
    Boolean ExternalIdSortDir = DataHelper.getSortDirection(ExternalIdMap);
    Integer ExternalIdSortOrder = DataHelper.getSortOrder(ExternalIdMap);
    if (ExternalIdFetch != null) out.setExternalIdFetch(ExternalIdFetch);
    if (ExternalIdSortDir != null) out.setExternalIdSortDirection(ExternalIdSortDir);
    if (ExternalIdSortOrder != null) out.setExternalIdSortOrder(ExternalIdSortOrder);

    Filter[] ExternalIdFilter = DataHelper.mapToFilterArray(ExternalIdMap, String.class);
    if (ExternalIdFilter != null) {
      StringFilter[] ExternalIdFilters = new StringFilter[ExternalIdFilter.length];
      for (int i = 0; i < ExternalIdFilters.length; i++) {
        ExternalIdFilters[i] = (StringFilter)ExternalIdFilter[i];
      }
      try {
        out.setExternalIdFilter(ExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalIdTypeMap = (Map)record.get("ExternalIdType");
    Boolean ExternalIdTypeFetch = DataHelper.getFetch(ExternalIdTypeMap);
    Boolean ExternalIdTypeSortDir = DataHelper.getSortDirection(ExternalIdTypeMap);
    Integer ExternalIdTypeSortOrder = DataHelper.getSortOrder(ExternalIdTypeMap);
    if (ExternalIdTypeFetch != null) out.setExternalIdTypeFetch(ExternalIdTypeFetch);
    if (ExternalIdTypeSortDir != null) out.setExternalIdTypeSortDirection(ExternalIdTypeSortDir);
    if (ExternalIdTypeSortOrder != null) out.setExternalIdTypeSortOrder(ExternalIdTypeSortOrder);

    Filter[] ExternalIdTypeFilter = DataHelper.mapToFilterArray(ExternalIdTypeMap, Integer.class);
    if (ExternalIdTypeFilter != null) {
      IntegerFilter[] ExternalIdTypeFilters = new IntegerFilter[ExternalIdTypeFilter.length];
      for (int i = 0; i < ExternalIdTypeFilters.length; i++) {
        ExternalIdTypeFilters[i] = (IntegerFilter)ExternalIdTypeFilter[i];
      }
      try {
        out.setExternalIdTypeFilter(ExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDateMap = (Map)record.get("ActiveDate");
    Boolean ActiveDateFetch = DataHelper.getFetch(ActiveDateMap);
    Boolean ActiveDateSortDir = DataHelper.getSortDirection(ActiveDateMap);
    Integer ActiveDateSortOrder = DataHelper.getSortOrder(ActiveDateMap);
    if (ActiveDateFetch != null) out.setActiveDateFetch(ActiveDateFetch);
    if (ActiveDateSortDir != null) out.setActiveDateSortDirection(ActiveDateSortDir);
    if (ActiveDateSortOrder != null) out.setActiveDateSortOrder(ActiveDateSortOrder);

    Filter[] ActiveDateFilter = DataHelper.mapToFilterArray(ActiveDateMap, Date.class);
    if (ActiveDateFilter != null) {
      DateFilter[] ActiveDateFilters = new DateFilter[ActiveDateFilter.length];
      for (int i = 0; i < ActiveDateFilters.length; i++) {
        ActiveDateFilters[i] = (DateFilter)ActiveDateFilter[i];
      }
      try {
        out.setActiveDateFilter(ActiveDateFilters);
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
