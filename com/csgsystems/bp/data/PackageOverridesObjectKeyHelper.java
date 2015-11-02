/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PackageOverridesObjectKeyHelper.java
 * Definition File: Customer/.xml
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

/** Helper class for PackageOverridesObject's Key objects. */
public class PackageOverridesObjectKeyHelper implements ArubaObjectHelper
{
  /** convert PackageOverridesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PackageOverridesObjectKeyData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PackageOverridesObjectKeyData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PackageOverridesObject")
   * @return Map     the output Map
   */
  public static Map toMap (PackageOverridesObjectKeyData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PackageOverridesObject";
    Map map = (Map) record.get (rootName);
    Map keyMap = null;
    if (map != null) keyMap = (Map) map.get ("Key");
    else map = new HashMap ();
    keyMap = getMap (in, keyMap);
    if (keyMap != null) map.put ("Key", keyMap);
    record.put (rootName, map);
    return record;
  }
  /** convert PackageOverridesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PackageOverridesObjectKeyFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PackageOverridesObjectKeyFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PackageOverridesObject")
   * @return Map     the output Map
   */
  public static Map toMap (PackageOverridesObjectKeyFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PackageOverridesObject";
    Map keyMap = (Map) record.get (rootName);
    if (keyMap != null) keyMap = (Map) record.get ("Key");
    keyMap.put ("Key", getMap (in, keyMap));
    record.put (rootName, keyMap);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PackageOverridesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @return PackageOverridesObjectKeyData the converted object
   */
  public static PackageOverridesObjectKeyData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PackageOverridesObjectKeyData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PackageOverridesObject")
   * @return PackageOverridesObjectKeyData the converted object
   */
  public static PackageOverridesObjectKeyData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PackageOverridesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PackageOverridesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @return PackageOverridesObjectKeyFilter the converted object
   */
  public static PackageOverridesObjectKeyFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PackageOverridesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PackageOverridesObject")
   * @return PackageOverridesObjectKeyFilter the converted object
   */
  public static PackageOverridesObjectKeyFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PackageOverridesObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    root = (Map) root.get ("Key");
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert PackageOverridesObjectKeyData to a Map (not including the root).
  /** convert PackageOverridesObjectKeyData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PackageOverridesObjectKeyData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in._ParentAccountInternalIdSet) record.put ("ParentAccountInternalId", in.ParentAccountInternalId);
  
    if (in._PackageInstIdSet) record.put ("PackageInstId", in.PackageInstId);
  
    if (in._PackageInstIdServSet) record.put ("PackageInstIdServ", in.PackageInstIdServ);
  
    if (in._PackageIdSet) record.put ("PackageId", in.PackageId);
  
    if (in._AssociationIdSet) record.put ("AssociationId", in.AssociationId);
  
    if (in._AssociationTypeSet) record.put ("AssociationType", in.AssociationType);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    return record;
  }
  /** convert PackageOverridesObjectKeyFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  protected static Map getMap (PackageOverridesObjectKeyFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

      map = DataHelper.filterToMap (in.ParentAccountInternalId, in.ParentAccountInternalIdSort, in.ParentAccountInternalIdSortAscending, in.ParentAccountInternalIdFetch);
      if (map != null) record.put ("ParentAccountInternalId", map);
      map = DataHelper.filterToMap (in.PackageInstId, in.PackageInstIdSort, in.PackageInstIdSortAscending, in.PackageInstIdFetch);
      if (map != null) record.put ("PackageInstId", map);
      map = DataHelper.filterToMap (in.PackageInstIdServ, in.PackageInstIdServSort, in.PackageInstIdServSortAscending, in.PackageInstIdServFetch);
      if (map != null) record.put ("PackageInstIdServ", map);
      map = DataHelper.filterToMap (in.PackageId, in.PackageIdSort, in.PackageIdSortAscending, in.PackageIdFetch);
      if (map != null) record.put ("PackageId", map);
      map = DataHelper.filterToMap (in.AssociationId, in.AssociationIdSort, in.AssociationIdSortAscending, in.AssociationIdFetch);
      if (map != null) record.put ("AssociationId", map);
      map = DataHelper.filterToMap (in.AssociationType, in.AssociationTypeSort, in.AssociationTypeSortAscending, in.AssociationTypeFetch);
      if (map != null) record.put ("AssociationType", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
    return record;
  }
  /** convert Map to PackageOverridesObjectKeyData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PackageOverridesObjectKeyData the converted object
   */
  public static PackageOverridesObjectKeyData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PackageOverridesObjectKeyData out = new PackageOverridesObjectKeyData ();

    if ((obj = record.get ("ParentAccountInternalId")) != null)
    {
      out.ParentAccountInternalId = (Integer) obj;
      out._ParentAccountInternalIdSet = true;
    }
  
    if ((obj = record.get ("PackageInstId")) != null)
    {
      out.PackageInstId = (Integer) obj;
      out._PackageInstIdSet = true;
    }
  
    if ((obj = record.get ("PackageInstIdServ")) != null)
    {
      out.PackageInstIdServ = (Integer) obj;
      out._PackageInstIdServSet = true;
    }
  
    if ((obj = record.get ("PackageId")) != null)
    {
      out.PackageId = (Integer) obj;
      out._PackageIdSet = true;
    }
  
    if ((obj = record.get ("AssociationId")) != null)
    {
      out.AssociationId = (Integer) obj;
      out._AssociationIdSet = true;
    }
  
    if ((obj = record.get ("AssociationType")) != null)
    {
      out.AssociationType = (BigInteger) obj;
      out._AssociationTypeSet = true;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
      out._CurrencyCodeSet = true;
    }
  
    return out;
  }
  /** convert Map to PackageOverridesObjectKeyFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PackageOverridesObjectKeyFilter the converted object
   */
  public static PackageOverridesObjectKeyFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PackageOverridesObjectKeyFilter out = new PackageOverridesObjectKeyFilter ();

    Map ParentAccountInternalIdMap = (Map)record.get("ParentAccountInternalId");
    Boolean ParentAccountInternalIdFetch = DataHelper.getFetch(ParentAccountInternalIdMap);
    Boolean ParentAccountInternalIdSortDir = DataHelper.getSortDirection(ParentAccountInternalIdMap);
    Integer ParentAccountInternalIdSortOrder = DataHelper.getSortOrder(ParentAccountInternalIdMap);
    if (ParentAccountInternalIdFetch != null) out.setParentAccountInternalIdFetch(ParentAccountInternalIdFetch);
    if (ParentAccountInternalIdSortDir != null) out.setParentAccountInternalIdSortDirection(ParentAccountInternalIdSortDir);
    if (ParentAccountInternalIdSortOrder != null) out.setParentAccountInternalIdSortOrder(ParentAccountInternalIdSortOrder);

    Filter[] ParentAccountInternalIdFilter = DataHelper.mapToFilterArray(ParentAccountInternalIdMap, Integer.class);
    if (ParentAccountInternalIdFilter != null) {
      IntegerFilter[] ParentAccountInternalIdFilters = new IntegerFilter[ParentAccountInternalIdFilter.length];
      for (int i = 0; i < ParentAccountInternalIdFilters.length; i++) {
        ParentAccountInternalIdFilters[i] = (IntegerFilter)ParentAccountInternalIdFilter[i];
      }
      try {
        out.setParentAccountInternalIdFilter(ParentAccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PackageInstIdMap = (Map)record.get("PackageInstId");
    Boolean PackageInstIdFetch = DataHelper.getFetch(PackageInstIdMap);
    Boolean PackageInstIdSortDir = DataHelper.getSortDirection(PackageInstIdMap);
    Integer PackageInstIdSortOrder = DataHelper.getSortOrder(PackageInstIdMap);
    if (PackageInstIdFetch != null) out.setPackageInstIdFetch(PackageInstIdFetch);
    if (PackageInstIdSortDir != null) out.setPackageInstIdSortDirection(PackageInstIdSortDir);
    if (PackageInstIdSortOrder != null) out.setPackageInstIdSortOrder(PackageInstIdSortOrder);

    Filter[] PackageInstIdFilter = DataHelper.mapToFilterArray(PackageInstIdMap, Integer.class);
    if (PackageInstIdFilter != null) {
      IntegerFilter[] PackageInstIdFilters = new IntegerFilter[PackageInstIdFilter.length];
      for (int i = 0; i < PackageInstIdFilters.length; i++) {
        PackageInstIdFilters[i] = (IntegerFilter)PackageInstIdFilter[i];
      }
      try {
        out.setPackageInstIdFilter(PackageInstIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PackageInstIdServMap = (Map)record.get("PackageInstIdServ");
    Boolean PackageInstIdServFetch = DataHelper.getFetch(PackageInstIdServMap);
    Boolean PackageInstIdServSortDir = DataHelper.getSortDirection(PackageInstIdServMap);
    Integer PackageInstIdServSortOrder = DataHelper.getSortOrder(PackageInstIdServMap);
    if (PackageInstIdServFetch != null) out.setPackageInstIdServFetch(PackageInstIdServFetch);
    if (PackageInstIdServSortDir != null) out.setPackageInstIdServSortDirection(PackageInstIdServSortDir);
    if (PackageInstIdServSortOrder != null) out.setPackageInstIdServSortOrder(PackageInstIdServSortOrder);

    Filter[] PackageInstIdServFilter = DataHelper.mapToFilterArray(PackageInstIdServMap, Integer.class);
    if (PackageInstIdServFilter != null) {
      IntegerFilter[] PackageInstIdServFilters = new IntegerFilter[PackageInstIdServFilter.length];
      for (int i = 0; i < PackageInstIdServFilters.length; i++) {
        PackageInstIdServFilters[i] = (IntegerFilter)PackageInstIdServFilter[i];
      }
      try {
        out.setPackageInstIdServFilter(PackageInstIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    Map AssociationIdMap = (Map)record.get("AssociationId");
    Boolean AssociationIdFetch = DataHelper.getFetch(AssociationIdMap);
    Boolean AssociationIdSortDir = DataHelper.getSortDirection(AssociationIdMap);
    Integer AssociationIdSortOrder = DataHelper.getSortOrder(AssociationIdMap);
    if (AssociationIdFetch != null) out.setAssociationIdFetch(AssociationIdFetch);
    if (AssociationIdSortDir != null) out.setAssociationIdSortDirection(AssociationIdSortDir);
    if (AssociationIdSortOrder != null) out.setAssociationIdSortOrder(AssociationIdSortOrder);

    Filter[] AssociationIdFilter = DataHelper.mapToFilterArray(AssociationIdMap, Integer.class);
    if (AssociationIdFilter != null) {
      IntegerFilter[] AssociationIdFilters = new IntegerFilter[AssociationIdFilter.length];
      for (int i = 0; i < AssociationIdFilters.length; i++) {
        AssociationIdFilters[i] = (IntegerFilter)AssociationIdFilter[i];
      }
      try {
        out.setAssociationIdFilter(AssociationIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AssociationTypeMap = (Map)record.get("AssociationType");
    Boolean AssociationTypeFetch = DataHelper.getFetch(AssociationTypeMap);
    Boolean AssociationTypeSortDir = DataHelper.getSortDirection(AssociationTypeMap);
    Integer AssociationTypeSortOrder = DataHelper.getSortOrder(AssociationTypeMap);
    if (AssociationTypeFetch != null) out.setAssociationTypeFetch(AssociationTypeFetch);
    if (AssociationTypeSortDir != null) out.setAssociationTypeSortDirection(AssociationTypeSortDir);
    if (AssociationTypeSortOrder != null) out.setAssociationTypeSortOrder(AssociationTypeSortOrder);

    Filter[] AssociationTypeFilter = DataHelper.mapToFilterArray(AssociationTypeMap, BigInteger.class);
    if (AssociationTypeFilter != null) {
      BigIntegerFilter[] AssociationTypeFilters = new BigIntegerFilter[AssociationTypeFilter.length];
      for (int i = 0; i < AssociationTypeFilters.length; i++) {
        AssociationTypeFilters[i] = (BigIntegerFilter)AssociationTypeFilter[i];
      }
      try {
        out.setAssociationTypeFilter(AssociationTypeFilters);
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
  
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);
    return out;
  }
}
