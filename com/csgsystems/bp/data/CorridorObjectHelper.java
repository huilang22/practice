/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CorridorObjectHelper.java
 * Definition File: Customer/Corridor.xml
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



/** Helper class to convert CorridorObject JavaBean objects to/from HashMaps.
 */
public class CorridorObjectHelper implements ArubaObjectHelper
{
  /** convert CorridorObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CorridorObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CorridorObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CorridorObject")
   * @return Map     the output Map
   */
  public static Map toMap (CorridorObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CorridorObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CorridorObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CorridorObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CorridorObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CorridorObject")
   * @return Map     the output Map
   */
  public static Map toMap (CorridorObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CorridorObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CorridorObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CorridorObjectData the converted object
   */
  public static CorridorObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CorridorObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CorridorObject")
   * @return CorridorObjectData the converted object
   */
  public static CorridorObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CorridorObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CorridorObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CorridorObjectFilter the converted object
   */
  public static CorridorObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CorridorObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CorridorObject")
   * @return CorridorObjectFilter the converted object
   */
  public static CorridorObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CorridorObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CorridorObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CorridorObjectDataList the converted object
   */
  public static CorridorObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CorridorObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CorridorObjectList")
   * @return CorridorObjectDataList the converted object
   */
  public static CorridorObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CorridorObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CorridorObjectData[] array = null;
    if (root != null)
    {
      array = new CorridorObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CorridorObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CorridorObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CorridorObjectDataList (array, index, total);
  }
  /** convert CorridorObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CorridorObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CorridorObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._IsIcbCorridorSet) record.put ("IsIcbCorridor", in.IsIcbCorridor);
  
    if (in._PlanTypeSet) record.put ("PlanType", in.PlanType);
  
    if (in._PlanLevelSet) record.put ("PlanLevel", in.PlanLevel);
  
    if (in._OriginRestrictionSet) record.put ("OriginRestriction", in.OriginRestriction);
  
    if (in._TargetRestrictionSet) record.put ("TargetRestriction", in.TargetRestriction);
  
    if (in._DiscountIdSet) record.put ("DiscountId", in.DiscountId);
  
    if (in._MaxCorridorsSet) record.put ("MaxCorridors", in.MaxCorridors);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._PrioritySet) record.put ("Priority", in.Priority);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._PointOriginSet) record.put ("PointOrigin", in.PointOrigin);
  
    if (in._OriginIsXactSet) record.put ("OriginIsXact", in.OriginIsXact);
  
    if (in._CountryCodeOriginSet) record.put ("CountryCodeOrigin", in.CountryCodeOrigin);
  
    if (in._PointTargetSet) record.put ("PointTarget", in.PointTarget);
  
    if (in._TargetIsXactSet) record.put ("TargetIsXact", in.TargetIsXact);
  
    if (in._CountryCodeTargetSet) record.put ("CountryCodeTarget", in.CountryCodeTarget);
  
    if (in._CorridorPlanIdSet) record.put ("CorridorPlanId", in.CorridorPlanId);
  
    if (in._ActiveDtSet) record.put ("ActiveDt", in.ActiveDt);
  
    if (in._InactiveDtSet) record.put ("InactiveDt", in.InactiveDt);
  
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._AccessRegionOriginSet) record.put ("AccessRegionOrigin", in.AccessRegionOrigin);
  
    if (in._AccessRegionTargetSet) record.put ("AccessRegionTarget", in.AccessRegionTarget);
  
    if (in._OwningAccountInternalIdSet) record.put ("OwningAccountInternalId", in.OwningAccountInternalId);
  
    if (in._PointCategorySet) record.put ("PointCategory", in.PointCategory);
  
    if (in._ServiceInternalIdSet) record.put ("ServiceInternalId", in.ServiceInternalId);
  
    if (in._ServiceInternalIdResetsSet) record.put ("ServiceInternalIdResets", in.ServiceInternalIdResets);
  
    if (in._PrevEndDtSet) record.put ("PrevEndDt", in.PrevEndDt);
  
    if (in._OwningAccountExternalIdSet) record.put ("OwningAccountExternalId", in.OwningAccountExternalId);
  
    if (in._OwningAccountExternalIdTypeSet) record.put ("OwningAccountExternalIdType", in.OwningAccountExternalIdType);
      return record;
  }
  /** convert CorridorObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CorridorObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CorridorObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.IsIcbCorridor, in.IsIcbCorridorSort, in.IsIcbCorridorSortAscending, in.IsIcbCorridorFetch);
      if (map != null) record.put ("IsIcbCorridor", map);
      map = DataHelper.filterToMap (in.PlanType, in.PlanTypeSort, in.PlanTypeSortAscending, in.PlanTypeFetch);
      if (map != null) record.put ("PlanType", map);
      map = DataHelper.filterToMap (in.PlanLevel, in.PlanLevelSort, in.PlanLevelSortAscending, in.PlanLevelFetch);
      if (map != null) record.put ("PlanLevel", map);
      map = DataHelper.filterToMap (in.OriginRestriction, in.OriginRestrictionSort, in.OriginRestrictionSortAscending, in.OriginRestrictionFetch);
      if (map != null) record.put ("OriginRestriction", map);
      map = DataHelper.filterToMap (in.TargetRestriction, in.TargetRestrictionSort, in.TargetRestrictionSortAscending, in.TargetRestrictionFetch);
      if (map != null) record.put ("TargetRestriction", map);
      map = DataHelper.filterToMap (in.DiscountId, in.DiscountIdSort, in.DiscountIdSortAscending, in.DiscountIdFetch);
      if (map != null) record.put ("DiscountId", map);
      map = DataHelper.filterToMap (in.MaxCorridors, in.MaxCorridorsSort, in.MaxCorridorsSortAscending, in.MaxCorridorsFetch);
      if (map != null) record.put ("MaxCorridors", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.Priority, in.PrioritySort, in.PrioritySortAscending, in.PriorityFetch);
      if (map != null) record.put ("Priority", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.PointOrigin, in.PointOriginSort, in.PointOriginSortAscending, in.PointOriginFetch, in.PointOriginCaseInsensitive);
      if (map != null) record.put ("PointOrigin", map);
      map = DataHelper.filterToMap (in.OriginIsXact, in.OriginIsXactSort, in.OriginIsXactSortAscending, in.OriginIsXactFetch);
      if (map != null) record.put ("OriginIsXact", map);
      map = DataHelper.filterToMap (in.CountryCodeOrigin, in.CountryCodeOriginSort, in.CountryCodeOriginSortAscending, in.CountryCodeOriginFetch);
      if (map != null) record.put ("CountryCodeOrigin", map);
      map = DataHelper.filterToMap (in.PointTarget, in.PointTargetSort, in.PointTargetSortAscending, in.PointTargetFetch, in.PointTargetCaseInsensitive);
      if (map != null) record.put ("PointTarget", map);
      map = DataHelper.filterToMap (in.TargetIsXact, in.TargetIsXactSort, in.TargetIsXactSortAscending, in.TargetIsXactFetch);
      if (map != null) record.put ("TargetIsXact", map);
      map = DataHelper.filterToMap (in.CountryCodeTarget, in.CountryCodeTargetSort, in.CountryCodeTargetSortAscending, in.CountryCodeTargetFetch);
      if (map != null) record.put ("CountryCodeTarget", map);
      map = DataHelper.filterToMap (in.CorridorPlanId, in.CorridorPlanIdSort, in.CorridorPlanIdSortAscending, in.CorridorPlanIdFetch);
      if (map != null) record.put ("CorridorPlanId", map);
      map = DataHelper.filterToMap (in.ActiveDt, in.ActiveDtSort, in.ActiveDtSortAscending, in.ActiveDtFetch);
      if (map != null) record.put ("ActiveDt", map);
      map = DataHelper.filterToMap (in.InactiveDt, in.InactiveDtSort, in.InactiveDtSortAscending, in.InactiveDtFetch);
      if (map != null) record.put ("InactiveDt", map);
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.AccessRegionOrigin, in.AccessRegionOriginSort, in.AccessRegionOriginSortAscending, in.AccessRegionOriginFetch, in.AccessRegionOriginCaseInsensitive);
      if (map != null) record.put ("AccessRegionOrigin", map);
      map = DataHelper.filterToMap (in.AccessRegionTarget, in.AccessRegionTargetSort, in.AccessRegionTargetSortAscending, in.AccessRegionTargetFetch, in.AccessRegionTargetCaseInsensitive);
      if (map != null) record.put ("AccessRegionTarget", map);
      map = DataHelper.filterToMap (in.OwningAccountInternalId, in.OwningAccountInternalIdSort, in.OwningAccountInternalIdSortAscending, in.OwningAccountInternalIdFetch);
      if (map != null) record.put ("OwningAccountInternalId", map);
      map = DataHelper.filterToMap (in.PointCategory, in.PointCategorySort, in.PointCategorySortAscending, in.PointCategoryFetch);
      if (map != null) record.put ("PointCategory", map);
      map = DataHelper.filterToMap (in.ServiceInternalId, in.ServiceInternalIdSort, in.ServiceInternalIdSortAscending, in.ServiceInternalIdFetch);
      if (map != null) record.put ("ServiceInternalId", map);
      map = DataHelper.filterToMap (in.ServiceInternalIdResets, in.ServiceInternalIdResetsSort, in.ServiceInternalIdResetsSortAscending, in.ServiceInternalIdResetsFetch);
      if (map != null) record.put ("ServiceInternalIdResets", map);
      map = DataHelper.filterToMap (in.PrevEndDt, in.PrevEndDtSort, in.PrevEndDtSortAscending, in.PrevEndDtFetch);
      if (map != null) record.put ("PrevEndDt", map);
      map = DataHelper.filterToMap (in.OwningAccountExternalId, in.OwningAccountExternalIdSort, in.OwningAccountExternalIdSortAscending, in.OwningAccountExternalIdFetch, in.OwningAccountExternalIdCaseInsensitive);
      if (map != null) record.put ("OwningAccountExternalId", map);
      map = DataHelper.filterToMap (in.OwningAccountExternalIdType, in.OwningAccountExternalIdTypeSort, in.OwningAccountExternalIdTypeSortAscending, in.OwningAccountExternalIdTypeFetch);
      if (map != null) record.put ("OwningAccountExternalIdType", map);
    return record;
  }
  /** convert Map to CorridorObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CorridorObjectData the converted object
   */
  public static CorridorObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CorridorObjectData out = new CorridorObjectData ();

    out.Key = CorridorObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("IsIcbCorridor")) != null)
    {
      out.IsIcbCorridor = (Boolean) obj;
    }
  
    if ((obj = record.get ("PlanType")) != null)
    {
      out.PlanType = (Integer) obj;
    }
  
    if ((obj = record.get ("PlanLevel")) != null)
    {
      out.PlanLevel = (Integer) obj;
    }
  
    if ((obj = record.get ("OriginRestriction")) != null)
    {
      out.OriginRestriction = (Integer) obj;
    }
  
    if ((obj = record.get ("TargetRestriction")) != null)
    {
      out.TargetRestriction = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountId")) != null)
    {
      out.DiscountId = (Integer) obj;
    }
  
    if ((obj = record.get ("MaxCorridors")) != null)
    {
      out.MaxCorridors = (Integer) obj;
    }
  
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("Priority")) != null)
    {
      out.Priority = (Integer) obj;
    }
  
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("PointOrigin")) != null)
    {
      out.PointOrigin = (String) obj;
    }
  
    if ((obj = record.get ("OriginIsXact")) != null)
    {
      out.OriginIsXact = (Boolean) obj;
    }
  
    if ((obj = record.get ("CountryCodeOrigin")) != null)
    {
      out.CountryCodeOrigin = (Integer) obj;
    }
  
    if ((obj = record.get ("PointTarget")) != null)
    {
      out.PointTarget = (String) obj;
    }
  
    if ((obj = record.get ("TargetIsXact")) != null)
    {
      out.TargetIsXact = (Boolean) obj;
    }
  
    if ((obj = record.get ("CountryCodeTarget")) != null)
    {
      out.CountryCodeTarget = (Integer) obj;
    }
  
    if ((obj = record.get ("CorridorPlanId")) != null)
    {
      out.CorridorPlanId = (Integer) obj;
    }
  
    if ((obj = record.get ("ActiveDt")) != null)
    {
      out.ActiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDt")) != null)
    {
      out.InactiveDt = (Date) obj;
    }
  
    if ((obj = record.get ("CreateDt")) != null)
    {
      out.CreateDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgDt")) != null)
    {
      out.ChgDt = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("AccessRegionOrigin")) != null)
    {
      out.AccessRegionOrigin = (String) obj;
    }
  
    if ((obj = record.get ("AccessRegionTarget")) != null)
    {
      out.AccessRegionTarget = (String) obj;
    }
  
    if ((obj = record.get ("OwningAccountInternalId")) != null)
    {
      out.OwningAccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("PointCategory")) != null)
    {
      out.PointCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalId")) != null)
    {
      out.ServiceInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("ServiceInternalIdResets")) != null)
    {
      out.ServiceInternalIdResets = (Integer) obj;
    }
  
    if ((obj = record.get ("PrevEndDt")) != null)
    {
      out.PrevEndDt = (Date) obj;
    }
  
    if ((obj = record.get ("OwningAccountExternalId")) != null)
    {
      out.OwningAccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("OwningAccountExternalIdType")) != null)
    {
      out.OwningAccountExternalIdType = (Integer) obj;
    }
      return out;
  }
  /** convert Map to CorridorObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CorridorObjectFilter the converted object
   */
  public static CorridorObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CorridorObjectFilter out = new CorridorObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CorridorObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map IsIcbCorridorMap = (Map)record.get("IsIcbCorridor");
    Boolean IsIcbCorridorFetch = DataHelper.getFetch(IsIcbCorridorMap);
    Boolean IsIcbCorridorSortDir = DataHelper.getSortDirection(IsIcbCorridorMap);
    Integer IsIcbCorridorSortOrder = DataHelper.getSortOrder(IsIcbCorridorMap);
    if (IsIcbCorridorFetch != null) out.setIsIcbCorridorFetch(IsIcbCorridorFetch);
    if (IsIcbCorridorSortDir != null) out.setIsIcbCorridorSortDirection(IsIcbCorridorSortDir);
    if (IsIcbCorridorSortOrder != null) out.setIsIcbCorridorSortOrder(IsIcbCorridorSortOrder);

    Filter[] IsIcbCorridorFilter = DataHelper.mapToFilterArray(IsIcbCorridorMap, Boolean.class);
    if (IsIcbCorridorFilter != null) {
      BooleanFilter[] IsIcbCorridorFilters = new BooleanFilter[IsIcbCorridorFilter.length];
      for (int i = 0; i < IsIcbCorridorFilters.length; i++) {
        IsIcbCorridorFilters[i] = (BooleanFilter)IsIcbCorridorFilter[i];
      }
      try {
        out.setIsIcbCorridorFilter(IsIcbCorridorFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PlanTypeMap = (Map)record.get("PlanType");
    Boolean PlanTypeFetch = DataHelper.getFetch(PlanTypeMap);
    Boolean PlanTypeSortDir = DataHelper.getSortDirection(PlanTypeMap);
    Integer PlanTypeSortOrder = DataHelper.getSortOrder(PlanTypeMap);
    if (PlanTypeFetch != null) out.setPlanTypeFetch(PlanTypeFetch);
    if (PlanTypeSortDir != null) out.setPlanTypeSortDirection(PlanTypeSortDir);
    if (PlanTypeSortOrder != null) out.setPlanTypeSortOrder(PlanTypeSortOrder);

    Filter[] PlanTypeFilter = DataHelper.mapToFilterArray(PlanTypeMap, Integer.class);
    if (PlanTypeFilter != null) {
      IntegerFilter[] PlanTypeFilters = new IntegerFilter[PlanTypeFilter.length];
      for (int i = 0; i < PlanTypeFilters.length; i++) {
        PlanTypeFilters[i] = (IntegerFilter)PlanTypeFilter[i];
      }
      try {
        out.setPlanTypeFilter(PlanTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PlanLevelMap = (Map)record.get("PlanLevel");
    Boolean PlanLevelFetch = DataHelper.getFetch(PlanLevelMap);
    Boolean PlanLevelSortDir = DataHelper.getSortDirection(PlanLevelMap);
    Integer PlanLevelSortOrder = DataHelper.getSortOrder(PlanLevelMap);
    if (PlanLevelFetch != null) out.setPlanLevelFetch(PlanLevelFetch);
    if (PlanLevelSortDir != null) out.setPlanLevelSortDirection(PlanLevelSortDir);
    if (PlanLevelSortOrder != null) out.setPlanLevelSortOrder(PlanLevelSortOrder);

    Filter[] PlanLevelFilter = DataHelper.mapToFilterArray(PlanLevelMap, Integer.class);
    if (PlanLevelFilter != null) {
      IntegerFilter[] PlanLevelFilters = new IntegerFilter[PlanLevelFilter.length];
      for (int i = 0; i < PlanLevelFilters.length; i++) {
        PlanLevelFilters[i] = (IntegerFilter)PlanLevelFilter[i];
      }
      try {
        out.setPlanLevelFilter(PlanLevelFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OriginRestrictionMap = (Map)record.get("OriginRestriction");
    Boolean OriginRestrictionFetch = DataHelper.getFetch(OriginRestrictionMap);
    Boolean OriginRestrictionSortDir = DataHelper.getSortDirection(OriginRestrictionMap);
    Integer OriginRestrictionSortOrder = DataHelper.getSortOrder(OriginRestrictionMap);
    if (OriginRestrictionFetch != null) out.setOriginRestrictionFetch(OriginRestrictionFetch);
    if (OriginRestrictionSortDir != null) out.setOriginRestrictionSortDirection(OriginRestrictionSortDir);
    if (OriginRestrictionSortOrder != null) out.setOriginRestrictionSortOrder(OriginRestrictionSortOrder);

    Filter[] OriginRestrictionFilter = DataHelper.mapToFilterArray(OriginRestrictionMap, Integer.class);
    if (OriginRestrictionFilter != null) {
      IntegerFilter[] OriginRestrictionFilters = new IntegerFilter[OriginRestrictionFilter.length];
      for (int i = 0; i < OriginRestrictionFilters.length; i++) {
        OriginRestrictionFilters[i] = (IntegerFilter)OriginRestrictionFilter[i];
      }
      try {
        out.setOriginRestrictionFilter(OriginRestrictionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TargetRestrictionMap = (Map)record.get("TargetRestriction");
    Boolean TargetRestrictionFetch = DataHelper.getFetch(TargetRestrictionMap);
    Boolean TargetRestrictionSortDir = DataHelper.getSortDirection(TargetRestrictionMap);
    Integer TargetRestrictionSortOrder = DataHelper.getSortOrder(TargetRestrictionMap);
    if (TargetRestrictionFetch != null) out.setTargetRestrictionFetch(TargetRestrictionFetch);
    if (TargetRestrictionSortDir != null) out.setTargetRestrictionSortDirection(TargetRestrictionSortDir);
    if (TargetRestrictionSortOrder != null) out.setTargetRestrictionSortOrder(TargetRestrictionSortOrder);

    Filter[] TargetRestrictionFilter = DataHelper.mapToFilterArray(TargetRestrictionMap, Integer.class);
    if (TargetRestrictionFilter != null) {
      IntegerFilter[] TargetRestrictionFilters = new IntegerFilter[TargetRestrictionFilter.length];
      for (int i = 0; i < TargetRestrictionFilters.length; i++) {
        TargetRestrictionFilters[i] = (IntegerFilter)TargetRestrictionFilter[i];
      }
      try {
        out.setTargetRestrictionFilter(TargetRestrictionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiscountIdMap = (Map)record.get("DiscountId");
    Boolean DiscountIdFetch = DataHelper.getFetch(DiscountIdMap);
    Boolean DiscountIdSortDir = DataHelper.getSortDirection(DiscountIdMap);
    Integer DiscountIdSortOrder = DataHelper.getSortOrder(DiscountIdMap);
    if (DiscountIdFetch != null) out.setDiscountIdFetch(DiscountIdFetch);
    if (DiscountIdSortDir != null) out.setDiscountIdSortDirection(DiscountIdSortDir);
    if (DiscountIdSortOrder != null) out.setDiscountIdSortOrder(DiscountIdSortOrder);

    Filter[] DiscountIdFilter = DataHelper.mapToFilterArray(DiscountIdMap, Integer.class);
    if (DiscountIdFilter != null) {
      IntegerFilter[] DiscountIdFilters = new IntegerFilter[DiscountIdFilter.length];
      for (int i = 0; i < DiscountIdFilters.length; i++) {
        DiscountIdFilters[i] = (IntegerFilter)DiscountIdFilter[i];
      }
      try {
        out.setDiscountIdFilter(DiscountIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MaxCorridorsMap = (Map)record.get("MaxCorridors");
    Boolean MaxCorridorsFetch = DataHelper.getFetch(MaxCorridorsMap);
    Boolean MaxCorridorsSortDir = DataHelper.getSortDirection(MaxCorridorsMap);
    Integer MaxCorridorsSortOrder = DataHelper.getSortOrder(MaxCorridorsMap);
    if (MaxCorridorsFetch != null) out.setMaxCorridorsFetch(MaxCorridorsFetch);
    if (MaxCorridorsSortDir != null) out.setMaxCorridorsSortDirection(MaxCorridorsSortDir);
    if (MaxCorridorsSortOrder != null) out.setMaxCorridorsSortOrder(MaxCorridorsSortOrder);

    Filter[] MaxCorridorsFilter = DataHelper.mapToFilterArray(MaxCorridorsMap, Integer.class);
    if (MaxCorridorsFilter != null) {
      IntegerFilter[] MaxCorridorsFilters = new IntegerFilter[MaxCorridorsFilter.length];
      for (int i = 0; i < MaxCorridorsFilters.length; i++) {
        MaxCorridorsFilters[i] = (IntegerFilter)MaxCorridorsFilter[i];
      }
      try {
        out.setMaxCorridorsFilter(MaxCorridorsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsDefaultMap = (Map)record.get("IsDefault");
    Boolean IsDefaultFetch = DataHelper.getFetch(IsDefaultMap);
    Boolean IsDefaultSortDir = DataHelper.getSortDirection(IsDefaultMap);
    Integer IsDefaultSortOrder = DataHelper.getSortOrder(IsDefaultMap);
    if (IsDefaultFetch != null) out.setIsDefaultFetch(IsDefaultFetch);
    if (IsDefaultSortDir != null) out.setIsDefaultSortDirection(IsDefaultSortDir);
    if (IsDefaultSortOrder != null) out.setIsDefaultSortOrder(IsDefaultSortOrder);

    Filter[] IsDefaultFilter = DataHelper.mapToFilterArray(IsDefaultMap, Boolean.class);
    if (IsDefaultFilter != null) {
      BooleanFilter[] IsDefaultFilters = new BooleanFilter[IsDefaultFilter.length];
      for (int i = 0; i < IsDefaultFilters.length; i++) {
        IsDefaultFilters[i] = (BooleanFilter)IsDefaultFilter[i];
      }
      try {
        out.setIsDefaultFilter(IsDefaultFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsInternalMap = (Map)record.get("IsInternal");
    Boolean IsInternalFetch = DataHelper.getFetch(IsInternalMap);
    Boolean IsInternalSortDir = DataHelper.getSortDirection(IsInternalMap);
    Integer IsInternalSortOrder = DataHelper.getSortOrder(IsInternalMap);
    if (IsInternalFetch != null) out.setIsInternalFetch(IsInternalFetch);
    if (IsInternalSortDir != null) out.setIsInternalSortDirection(IsInternalSortDir);
    if (IsInternalSortOrder != null) out.setIsInternalSortOrder(IsInternalSortOrder);

    Filter[] IsInternalFilter = DataHelper.mapToFilterArray(IsInternalMap, Boolean.class);
    if (IsInternalFilter != null) {
      BooleanFilter[] IsInternalFilters = new BooleanFilter[IsInternalFilter.length];
      for (int i = 0; i < IsInternalFilters.length; i++) {
        IsInternalFilters[i] = (BooleanFilter)IsInternalFilter[i];
      }
      try {
        out.setIsInternalFilter(IsInternalFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PriorityMap = (Map)record.get("Priority");
    Boolean PriorityFetch = DataHelper.getFetch(PriorityMap);
    Boolean PrioritySortDir = DataHelper.getSortDirection(PriorityMap);
    Integer PrioritySortOrder = DataHelper.getSortOrder(PriorityMap);
    if (PriorityFetch != null) out.setPriorityFetch(PriorityFetch);
    if (PrioritySortDir != null) out.setPrioritySortDirection(PrioritySortDir);
    if (PrioritySortOrder != null) out.setPrioritySortOrder(PrioritySortOrder);

    Filter[] PriorityFilter = DataHelper.mapToFilterArray(PriorityMap, Integer.class);
    if (PriorityFilter != null) {
      IntegerFilter[] PriorityFilters = new IntegerFilter[PriorityFilter.length];
      for (int i = 0; i < PriorityFilters.length; i++) {
        PriorityFilters[i] = (IntegerFilter)PriorityFilter[i];
      }
      try {
        out.setPriorityFilter(PriorityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ShortDisplayMap = (Map)record.get("ShortDisplay");
    Boolean ShortDisplayFetch = DataHelper.getFetch(ShortDisplayMap);
    Boolean ShortDisplaySortDir = DataHelper.getSortDirection(ShortDisplayMap);
    Integer ShortDisplaySortOrder = DataHelper.getSortOrder(ShortDisplayMap);
    if (ShortDisplayFetch != null) out.setShortDisplayFetch(ShortDisplayFetch);
    if (ShortDisplaySortDir != null) out.setShortDisplaySortDirection(ShortDisplaySortDir);
    if (ShortDisplaySortOrder != null) out.setShortDisplaySortOrder(ShortDisplaySortOrder);

    Filter[] ShortDisplayFilter = DataHelper.mapToFilterArray(ShortDisplayMap, String.class);
    if (ShortDisplayFilter != null) {
      StringFilter[] ShortDisplayFilters = new StringFilter[ShortDisplayFilter.length];
      for (int i = 0; i < ShortDisplayFilters.length; i++) {
        ShortDisplayFilters[i] = (StringFilter)ShortDisplayFilter[i];
      }
      try {
        out.setShortDisplayFilter(ShortDisplayFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DisplayValueMap = (Map)record.get("DisplayValue");
    Boolean DisplayValueFetch = DataHelper.getFetch(DisplayValueMap);
    Boolean DisplayValueSortDir = DataHelper.getSortDirection(DisplayValueMap);
    Integer DisplayValueSortOrder = DataHelper.getSortOrder(DisplayValueMap);
    if (DisplayValueFetch != null) out.setDisplayValueFetch(DisplayValueFetch);
    if (DisplayValueSortDir != null) out.setDisplayValueSortDirection(DisplayValueSortDir);
    if (DisplayValueSortOrder != null) out.setDisplayValueSortOrder(DisplayValueSortOrder);

    Filter[] DisplayValueFilter = DataHelper.mapToFilterArray(DisplayValueMap, String.class);
    if (DisplayValueFilter != null) {
      StringFilter[] DisplayValueFilters = new StringFilter[DisplayValueFilter.length];
      for (int i = 0; i < DisplayValueFilters.length; i++) {
        DisplayValueFilters[i] = (StringFilter)DisplayValueFilter[i];
      }
      try {
        out.setDisplayValueFilter(DisplayValueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountInternalIdMap = (Map)record.get("AccountInternalId");
    Boolean AccountInternalIdFetch = DataHelper.getFetch(AccountInternalIdMap);
    Boolean AccountInternalIdSortDir = DataHelper.getSortDirection(AccountInternalIdMap);
    Integer AccountInternalIdSortOrder = DataHelper.getSortOrder(AccountInternalIdMap);
    if (AccountInternalIdFetch != null) out.setAccountInternalIdFetch(AccountInternalIdFetch);
    if (AccountInternalIdSortDir != null) out.setAccountInternalIdSortDirection(AccountInternalIdSortDir);
    if (AccountInternalIdSortOrder != null) out.setAccountInternalIdSortOrder(AccountInternalIdSortOrder);

    Filter[] AccountInternalIdFilter = DataHelper.mapToFilterArray(AccountInternalIdMap, Integer.class);
    if (AccountInternalIdFilter != null) {
      IntegerFilter[] AccountInternalIdFilters = new IntegerFilter[AccountInternalIdFilter.length];
      for (int i = 0; i < AccountInternalIdFilters.length; i++) {
        AccountInternalIdFilters[i] = (IntegerFilter)AccountInternalIdFilter[i];
      }
      try {
        out.setAccountInternalIdFilter(AccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointOriginMap = (Map)record.get("PointOrigin");
    Boolean PointOriginFetch = DataHelper.getFetch(PointOriginMap);
    Boolean PointOriginSortDir = DataHelper.getSortDirection(PointOriginMap);
    Integer PointOriginSortOrder = DataHelper.getSortOrder(PointOriginMap);
    if (PointOriginFetch != null) out.setPointOriginFetch(PointOriginFetch);
    if (PointOriginSortDir != null) out.setPointOriginSortDirection(PointOriginSortDir);
    if (PointOriginSortOrder != null) out.setPointOriginSortOrder(PointOriginSortOrder);

    Filter[] PointOriginFilter = DataHelper.mapToFilterArray(PointOriginMap, String.class);
    if (PointOriginFilter != null) {
      StringFilter[] PointOriginFilters = new StringFilter[PointOriginFilter.length];
      for (int i = 0; i < PointOriginFilters.length; i++) {
        PointOriginFilters[i] = (StringFilter)PointOriginFilter[i];
      }
      try {
        out.setPointOriginFilter(PointOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OriginIsXactMap = (Map)record.get("OriginIsXact");
    Boolean OriginIsXactFetch = DataHelper.getFetch(OriginIsXactMap);
    Boolean OriginIsXactSortDir = DataHelper.getSortDirection(OriginIsXactMap);
    Integer OriginIsXactSortOrder = DataHelper.getSortOrder(OriginIsXactMap);
    if (OriginIsXactFetch != null) out.setOriginIsXactFetch(OriginIsXactFetch);
    if (OriginIsXactSortDir != null) out.setOriginIsXactSortDirection(OriginIsXactSortDir);
    if (OriginIsXactSortOrder != null) out.setOriginIsXactSortOrder(OriginIsXactSortOrder);

    Filter[] OriginIsXactFilter = DataHelper.mapToFilterArray(OriginIsXactMap, Boolean.class);
    if (OriginIsXactFilter != null) {
      BooleanFilter[] OriginIsXactFilters = new BooleanFilter[OriginIsXactFilter.length];
      for (int i = 0; i < OriginIsXactFilters.length; i++) {
        OriginIsXactFilters[i] = (BooleanFilter)OriginIsXactFilter[i];
      }
      try {
        out.setOriginIsXactFilter(OriginIsXactFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountryCodeOriginMap = (Map)record.get("CountryCodeOrigin");
    Boolean CountryCodeOriginFetch = DataHelper.getFetch(CountryCodeOriginMap);
    Boolean CountryCodeOriginSortDir = DataHelper.getSortDirection(CountryCodeOriginMap);
    Integer CountryCodeOriginSortOrder = DataHelper.getSortOrder(CountryCodeOriginMap);
    if (CountryCodeOriginFetch != null) out.setCountryCodeOriginFetch(CountryCodeOriginFetch);
    if (CountryCodeOriginSortDir != null) out.setCountryCodeOriginSortDirection(CountryCodeOriginSortDir);
    if (CountryCodeOriginSortOrder != null) out.setCountryCodeOriginSortOrder(CountryCodeOriginSortOrder);

    Filter[] CountryCodeOriginFilter = DataHelper.mapToFilterArray(CountryCodeOriginMap, Integer.class);
    if (CountryCodeOriginFilter != null) {
      IntegerFilter[] CountryCodeOriginFilters = new IntegerFilter[CountryCodeOriginFilter.length];
      for (int i = 0; i < CountryCodeOriginFilters.length; i++) {
        CountryCodeOriginFilters[i] = (IntegerFilter)CountryCodeOriginFilter[i];
      }
      try {
        out.setCountryCodeOriginFilter(CountryCodeOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointTargetMap = (Map)record.get("PointTarget");
    Boolean PointTargetFetch = DataHelper.getFetch(PointTargetMap);
    Boolean PointTargetSortDir = DataHelper.getSortDirection(PointTargetMap);
    Integer PointTargetSortOrder = DataHelper.getSortOrder(PointTargetMap);
    if (PointTargetFetch != null) out.setPointTargetFetch(PointTargetFetch);
    if (PointTargetSortDir != null) out.setPointTargetSortDirection(PointTargetSortDir);
    if (PointTargetSortOrder != null) out.setPointTargetSortOrder(PointTargetSortOrder);

    Filter[] PointTargetFilter = DataHelper.mapToFilterArray(PointTargetMap, String.class);
    if (PointTargetFilter != null) {
      StringFilter[] PointTargetFilters = new StringFilter[PointTargetFilter.length];
      for (int i = 0; i < PointTargetFilters.length; i++) {
        PointTargetFilters[i] = (StringFilter)PointTargetFilter[i];
      }
      try {
        out.setPointTargetFilter(PointTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TargetIsXactMap = (Map)record.get("TargetIsXact");
    Boolean TargetIsXactFetch = DataHelper.getFetch(TargetIsXactMap);
    Boolean TargetIsXactSortDir = DataHelper.getSortDirection(TargetIsXactMap);
    Integer TargetIsXactSortOrder = DataHelper.getSortOrder(TargetIsXactMap);
    if (TargetIsXactFetch != null) out.setTargetIsXactFetch(TargetIsXactFetch);
    if (TargetIsXactSortDir != null) out.setTargetIsXactSortDirection(TargetIsXactSortDir);
    if (TargetIsXactSortOrder != null) out.setTargetIsXactSortOrder(TargetIsXactSortOrder);

    Filter[] TargetIsXactFilter = DataHelper.mapToFilterArray(TargetIsXactMap, Boolean.class);
    if (TargetIsXactFilter != null) {
      BooleanFilter[] TargetIsXactFilters = new BooleanFilter[TargetIsXactFilter.length];
      for (int i = 0; i < TargetIsXactFilters.length; i++) {
        TargetIsXactFilters[i] = (BooleanFilter)TargetIsXactFilter[i];
      }
      try {
        out.setTargetIsXactFilter(TargetIsXactFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountryCodeTargetMap = (Map)record.get("CountryCodeTarget");
    Boolean CountryCodeTargetFetch = DataHelper.getFetch(CountryCodeTargetMap);
    Boolean CountryCodeTargetSortDir = DataHelper.getSortDirection(CountryCodeTargetMap);
    Integer CountryCodeTargetSortOrder = DataHelper.getSortOrder(CountryCodeTargetMap);
    if (CountryCodeTargetFetch != null) out.setCountryCodeTargetFetch(CountryCodeTargetFetch);
    if (CountryCodeTargetSortDir != null) out.setCountryCodeTargetSortDirection(CountryCodeTargetSortDir);
    if (CountryCodeTargetSortOrder != null) out.setCountryCodeTargetSortOrder(CountryCodeTargetSortOrder);

    Filter[] CountryCodeTargetFilter = DataHelper.mapToFilterArray(CountryCodeTargetMap, Integer.class);
    if (CountryCodeTargetFilter != null) {
      IntegerFilter[] CountryCodeTargetFilters = new IntegerFilter[CountryCodeTargetFilter.length];
      for (int i = 0; i < CountryCodeTargetFilters.length; i++) {
        CountryCodeTargetFilters[i] = (IntegerFilter)CountryCodeTargetFilter[i];
      }
      try {
        out.setCountryCodeTargetFilter(CountryCodeTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CorridorPlanIdMap = (Map)record.get("CorridorPlanId");
    Boolean CorridorPlanIdFetch = DataHelper.getFetch(CorridorPlanIdMap);
    Boolean CorridorPlanIdSortDir = DataHelper.getSortDirection(CorridorPlanIdMap);
    Integer CorridorPlanIdSortOrder = DataHelper.getSortOrder(CorridorPlanIdMap);
    if (CorridorPlanIdFetch != null) out.setCorridorPlanIdFetch(CorridorPlanIdFetch);
    if (CorridorPlanIdSortDir != null) out.setCorridorPlanIdSortDirection(CorridorPlanIdSortDir);
    if (CorridorPlanIdSortOrder != null) out.setCorridorPlanIdSortOrder(CorridorPlanIdSortOrder);

    Filter[] CorridorPlanIdFilter = DataHelper.mapToFilterArray(CorridorPlanIdMap, Integer.class);
    if (CorridorPlanIdFilter != null) {
      IntegerFilter[] CorridorPlanIdFilters = new IntegerFilter[CorridorPlanIdFilter.length];
      for (int i = 0; i < CorridorPlanIdFilters.length; i++) {
        CorridorPlanIdFilters[i] = (IntegerFilter)CorridorPlanIdFilter[i];
      }
      try {
        out.setCorridorPlanIdFilter(CorridorPlanIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ActiveDtMap = (Map)record.get("ActiveDt");
    Boolean ActiveDtFetch = DataHelper.getFetch(ActiveDtMap);
    Boolean ActiveDtSortDir = DataHelper.getSortDirection(ActiveDtMap);
    Integer ActiveDtSortOrder = DataHelper.getSortOrder(ActiveDtMap);
    if (ActiveDtFetch != null) out.setActiveDtFetch(ActiveDtFetch);
    if (ActiveDtSortDir != null) out.setActiveDtSortDirection(ActiveDtSortDir);
    if (ActiveDtSortOrder != null) out.setActiveDtSortOrder(ActiveDtSortOrder);

    Filter[] ActiveDtFilter = DataHelper.mapToFilterArray(ActiveDtMap, Date.class);
    if (ActiveDtFilter != null) {
      DateFilter[] ActiveDtFilters = new DateFilter[ActiveDtFilter.length];
      for (int i = 0; i < ActiveDtFilters.length; i++) {
        ActiveDtFilters[i] = (DateFilter)ActiveDtFilter[i];
      }
      try {
        out.setActiveDtFilter(ActiveDtFilters);
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
  
    Map CreateDtMap = (Map)record.get("CreateDt");
    Boolean CreateDtFetch = DataHelper.getFetch(CreateDtMap);
    Boolean CreateDtSortDir = DataHelper.getSortDirection(CreateDtMap);
    Integer CreateDtSortOrder = DataHelper.getSortOrder(CreateDtMap);
    if (CreateDtFetch != null) out.setCreateDtFetch(CreateDtFetch);
    if (CreateDtSortDir != null) out.setCreateDtSortDirection(CreateDtSortDir);
    if (CreateDtSortOrder != null) out.setCreateDtSortOrder(CreateDtSortOrder);

    Filter[] CreateDtFilter = DataHelper.mapToFilterArray(CreateDtMap, Date.class);
    if (CreateDtFilter != null) {
      DateFilter[] CreateDtFilters = new DateFilter[CreateDtFilter.length];
      for (int i = 0; i < CreateDtFilters.length; i++) {
        CreateDtFilters[i] = (DateFilter)CreateDtFilter[i];
      }
      try {
        out.setCreateDtFilter(CreateDtFilters);
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
  
    Map AccessRegionOriginMap = (Map)record.get("AccessRegionOrigin");
    Boolean AccessRegionOriginFetch = DataHelper.getFetch(AccessRegionOriginMap);
    Boolean AccessRegionOriginSortDir = DataHelper.getSortDirection(AccessRegionOriginMap);
    Integer AccessRegionOriginSortOrder = DataHelper.getSortOrder(AccessRegionOriginMap);
    if (AccessRegionOriginFetch != null) out.setAccessRegionOriginFetch(AccessRegionOriginFetch);
    if (AccessRegionOriginSortDir != null) out.setAccessRegionOriginSortDirection(AccessRegionOriginSortDir);
    if (AccessRegionOriginSortOrder != null) out.setAccessRegionOriginSortOrder(AccessRegionOriginSortOrder);

    Filter[] AccessRegionOriginFilter = DataHelper.mapToFilterArray(AccessRegionOriginMap, String.class);
    if (AccessRegionOriginFilter != null) {
      StringFilter[] AccessRegionOriginFilters = new StringFilter[AccessRegionOriginFilter.length];
      for (int i = 0; i < AccessRegionOriginFilters.length; i++) {
        AccessRegionOriginFilters[i] = (StringFilter)AccessRegionOriginFilter[i];
      }
      try {
        out.setAccessRegionOriginFilter(AccessRegionOriginFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccessRegionTargetMap = (Map)record.get("AccessRegionTarget");
    Boolean AccessRegionTargetFetch = DataHelper.getFetch(AccessRegionTargetMap);
    Boolean AccessRegionTargetSortDir = DataHelper.getSortDirection(AccessRegionTargetMap);
    Integer AccessRegionTargetSortOrder = DataHelper.getSortOrder(AccessRegionTargetMap);
    if (AccessRegionTargetFetch != null) out.setAccessRegionTargetFetch(AccessRegionTargetFetch);
    if (AccessRegionTargetSortDir != null) out.setAccessRegionTargetSortDirection(AccessRegionTargetSortDir);
    if (AccessRegionTargetSortOrder != null) out.setAccessRegionTargetSortOrder(AccessRegionTargetSortOrder);

    Filter[] AccessRegionTargetFilter = DataHelper.mapToFilterArray(AccessRegionTargetMap, String.class);
    if (AccessRegionTargetFilter != null) {
      StringFilter[] AccessRegionTargetFilters = new StringFilter[AccessRegionTargetFilter.length];
      for (int i = 0; i < AccessRegionTargetFilters.length; i++) {
        AccessRegionTargetFilters[i] = (StringFilter)AccessRegionTargetFilter[i];
      }
      try {
        out.setAccessRegionTargetFilter(AccessRegionTargetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwningAccountInternalIdMap = (Map)record.get("OwningAccountInternalId");
    Boolean OwningAccountInternalIdFetch = DataHelper.getFetch(OwningAccountInternalIdMap);
    Boolean OwningAccountInternalIdSortDir = DataHelper.getSortDirection(OwningAccountInternalIdMap);
    Integer OwningAccountInternalIdSortOrder = DataHelper.getSortOrder(OwningAccountInternalIdMap);
    if (OwningAccountInternalIdFetch != null) out.setOwningAccountInternalIdFetch(OwningAccountInternalIdFetch);
    if (OwningAccountInternalIdSortDir != null) out.setOwningAccountInternalIdSortDirection(OwningAccountInternalIdSortDir);
    if (OwningAccountInternalIdSortOrder != null) out.setOwningAccountInternalIdSortOrder(OwningAccountInternalIdSortOrder);

    Filter[] OwningAccountInternalIdFilter = DataHelper.mapToFilterArray(OwningAccountInternalIdMap, Integer.class);
    if (OwningAccountInternalIdFilter != null) {
      IntegerFilter[] OwningAccountInternalIdFilters = new IntegerFilter[OwningAccountInternalIdFilter.length];
      for (int i = 0; i < OwningAccountInternalIdFilters.length; i++) {
        OwningAccountInternalIdFilters[i] = (IntegerFilter)OwningAccountInternalIdFilter[i];
      }
      try {
        out.setOwningAccountInternalIdFilter(OwningAccountInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PointCategoryMap = (Map)record.get("PointCategory");
    Boolean PointCategoryFetch = DataHelper.getFetch(PointCategoryMap);
    Boolean PointCategorySortDir = DataHelper.getSortDirection(PointCategoryMap);
    Integer PointCategorySortOrder = DataHelper.getSortOrder(PointCategoryMap);
    if (PointCategoryFetch != null) out.setPointCategoryFetch(PointCategoryFetch);
    if (PointCategorySortDir != null) out.setPointCategorySortDirection(PointCategorySortDir);
    if (PointCategorySortOrder != null) out.setPointCategorySortOrder(PointCategorySortOrder);

    Filter[] PointCategoryFilter = DataHelper.mapToFilterArray(PointCategoryMap, Integer.class);
    if (PointCategoryFilter != null) {
      IntegerFilter[] PointCategoryFilters = new IntegerFilter[PointCategoryFilter.length];
      for (int i = 0; i < PointCategoryFilters.length; i++) {
        PointCategoryFilters[i] = (IntegerFilter)PointCategoryFilter[i];
      }
      try {
        out.setPointCategoryFilter(PointCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdMap = (Map)record.get("ServiceInternalId");
    Boolean ServiceInternalIdFetch = DataHelper.getFetch(ServiceInternalIdMap);
    Boolean ServiceInternalIdSortDir = DataHelper.getSortDirection(ServiceInternalIdMap);
    Integer ServiceInternalIdSortOrder = DataHelper.getSortOrder(ServiceInternalIdMap);
    if (ServiceInternalIdFetch != null) out.setServiceInternalIdFetch(ServiceInternalIdFetch);
    if (ServiceInternalIdSortDir != null) out.setServiceInternalIdSortDirection(ServiceInternalIdSortDir);
    if (ServiceInternalIdSortOrder != null) out.setServiceInternalIdSortOrder(ServiceInternalIdSortOrder);

    Filter[] ServiceInternalIdFilter = DataHelper.mapToFilterArray(ServiceInternalIdMap, Integer.class);
    if (ServiceInternalIdFilter != null) {
      IntegerFilter[] ServiceInternalIdFilters = new IntegerFilter[ServiceInternalIdFilter.length];
      for (int i = 0; i < ServiceInternalIdFilters.length; i++) {
        ServiceInternalIdFilters[i] = (IntegerFilter)ServiceInternalIdFilter[i];
      }
      try {
        out.setServiceInternalIdFilter(ServiceInternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServiceInternalIdResetsMap = (Map)record.get("ServiceInternalIdResets");
    Boolean ServiceInternalIdResetsFetch = DataHelper.getFetch(ServiceInternalIdResetsMap);
    Boolean ServiceInternalIdResetsSortDir = DataHelper.getSortDirection(ServiceInternalIdResetsMap);
    Integer ServiceInternalIdResetsSortOrder = DataHelper.getSortOrder(ServiceInternalIdResetsMap);
    if (ServiceInternalIdResetsFetch != null) out.setServiceInternalIdResetsFetch(ServiceInternalIdResetsFetch);
    if (ServiceInternalIdResetsSortDir != null) out.setServiceInternalIdResetsSortDirection(ServiceInternalIdResetsSortDir);
    if (ServiceInternalIdResetsSortOrder != null) out.setServiceInternalIdResetsSortOrder(ServiceInternalIdResetsSortOrder);

    Filter[] ServiceInternalIdResetsFilter = DataHelper.mapToFilterArray(ServiceInternalIdResetsMap, Integer.class);
    if (ServiceInternalIdResetsFilter != null) {
      IntegerFilter[] ServiceInternalIdResetsFilters = new IntegerFilter[ServiceInternalIdResetsFilter.length];
      for (int i = 0; i < ServiceInternalIdResetsFilters.length; i++) {
        ServiceInternalIdResetsFilters[i] = (IntegerFilter)ServiceInternalIdResetsFilter[i];
      }
      try {
        out.setServiceInternalIdResetsFilter(ServiceInternalIdResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevEndDtMap = (Map)record.get("PrevEndDt");
    Boolean PrevEndDtFetch = DataHelper.getFetch(PrevEndDtMap);
    Boolean PrevEndDtSortDir = DataHelper.getSortDirection(PrevEndDtMap);
    Integer PrevEndDtSortOrder = DataHelper.getSortOrder(PrevEndDtMap);
    if (PrevEndDtFetch != null) out.setPrevEndDtFetch(PrevEndDtFetch);
    if (PrevEndDtSortDir != null) out.setPrevEndDtSortDirection(PrevEndDtSortDir);
    if (PrevEndDtSortOrder != null) out.setPrevEndDtSortOrder(PrevEndDtSortOrder);

    Filter[] PrevEndDtFilter = DataHelper.mapToFilterArray(PrevEndDtMap, Date.class);
    if (PrevEndDtFilter != null) {
      DateFilter[] PrevEndDtFilters = new DateFilter[PrevEndDtFilter.length];
      for (int i = 0; i < PrevEndDtFilters.length; i++) {
        PrevEndDtFilters[i] = (DateFilter)PrevEndDtFilter[i];
      }
      try {
        out.setPrevEndDtFilter(PrevEndDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwningAccountExternalIdMap = (Map)record.get("OwningAccountExternalId");
    Boolean OwningAccountExternalIdFetch = DataHelper.getFetch(OwningAccountExternalIdMap);
    Boolean OwningAccountExternalIdSortDir = DataHelper.getSortDirection(OwningAccountExternalIdMap);
    Integer OwningAccountExternalIdSortOrder = DataHelper.getSortOrder(OwningAccountExternalIdMap);
    if (OwningAccountExternalIdFetch != null) out.setOwningAccountExternalIdFetch(OwningAccountExternalIdFetch);
    if (OwningAccountExternalIdSortDir != null) out.setOwningAccountExternalIdSortDirection(OwningAccountExternalIdSortDir);
    if (OwningAccountExternalIdSortOrder != null) out.setOwningAccountExternalIdSortOrder(OwningAccountExternalIdSortOrder);

    Filter[] OwningAccountExternalIdFilter = DataHelper.mapToFilterArray(OwningAccountExternalIdMap, String.class);
    if (OwningAccountExternalIdFilter != null) {
      StringFilter[] OwningAccountExternalIdFilters = new StringFilter[OwningAccountExternalIdFilter.length];
      for (int i = 0; i < OwningAccountExternalIdFilters.length; i++) {
        OwningAccountExternalIdFilters[i] = (StringFilter)OwningAccountExternalIdFilter[i];
      }
      try {
        out.setOwningAccountExternalIdFilter(OwningAccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwningAccountExternalIdTypeMap = (Map)record.get("OwningAccountExternalIdType");
    Boolean OwningAccountExternalIdTypeFetch = DataHelper.getFetch(OwningAccountExternalIdTypeMap);
    Boolean OwningAccountExternalIdTypeSortDir = DataHelper.getSortDirection(OwningAccountExternalIdTypeMap);
    Integer OwningAccountExternalIdTypeSortOrder = DataHelper.getSortOrder(OwningAccountExternalIdTypeMap);
    if (OwningAccountExternalIdTypeFetch != null) out.setOwningAccountExternalIdTypeFetch(OwningAccountExternalIdTypeFetch);
    if (OwningAccountExternalIdTypeSortDir != null) out.setOwningAccountExternalIdTypeSortDirection(OwningAccountExternalIdTypeSortDir);
    if (OwningAccountExternalIdTypeSortOrder != null) out.setOwningAccountExternalIdTypeSortOrder(OwningAccountExternalIdTypeSortOrder);

    Filter[] OwningAccountExternalIdTypeFilter = DataHelper.mapToFilterArray(OwningAccountExternalIdTypeMap, Integer.class);
    if (OwningAccountExternalIdTypeFilter != null) {
      IntegerFilter[] OwningAccountExternalIdTypeFilters = new IntegerFilter[OwningAccountExternalIdTypeFilter.length];
      for (int i = 0; i < OwningAccountExternalIdTypeFilters.length; i++) {
        OwningAccountExternalIdTypeFilters[i] = (IntegerFilter)OwningAccountExternalIdTypeFilter[i];
      }
      try {
        out.setOwningAccountExternalIdTypeFilter(OwningAccountExternalIdTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
