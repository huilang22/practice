/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountCodeGroupObjectHelper.java
 * Definition File: Customer/AccountCodeGroup.xml
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



/** Helper class to convert AccountCodeGroupObject JavaBean objects to/from HashMaps.
 */
public class AccountCodeGroupObjectHelper implements ArubaObjectHelper
{
  /** convert AccountCodeGroupObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountCodeGroupObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountCodeGroupObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountCodeGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeGroupObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountCodeGroupObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AccountCodeGroupObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeGroupObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountCodeGroupObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountCodeGroupObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountCodeGroupObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountCodeGroupObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountCodeGroupObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountCodeGroupObjectData the converted object
   */
  public static AccountCodeGroupObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountCodeGroupObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountCodeGroupObject")
   * @return AccountCodeGroupObjectData the converted object
   */
  public static AccountCodeGroupObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountCodeGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountCodeGroupObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountCodeGroupObjectFilter the converted object
   */
  public static AccountCodeGroupObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountCodeGroupObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountCodeGroupObject")
   * @return AccountCodeGroupObjectFilter the converted object
   */
  public static AccountCodeGroupObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountCodeGroupObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountCodeGroupObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountCodeGroupObjectDataList the converted object
   */
  public static AccountCodeGroupObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountCodeGroupObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountCodeGroupObjectList")
   * @return AccountCodeGroupObjectDataList the converted object
   */
  public static AccountCodeGroupObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountCodeGroupObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountCodeGroupObjectData[] array = null;
    if (root != null)
    {
      array = new AccountCodeGroupObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountCodeGroupObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountCodeGroupObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountCodeGroupObjectDataList (array, index, total);
  }
  /** convert AccountCodeGroupObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountCodeGroupObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AccountCodeGroupObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
  
    if (in._AcgTrackingIdSet) record.put ("AcgTrackingId", in.AcgTrackingId);
  
    if (in._AcgTrackingIdServSet) record.put ("AcgTrackingIdServ", in.AcgTrackingIdServ);
  
    if (in._ParentAcgTrackingIdSet) record.put ("ParentAcgTrackingId", in.ParentAcgTrackingId);
  
    if (in._ParentAcgTrackingIdServSet) record.put ("ParentAcgTrackingIdServ", in.ParentAcgTrackingIdServ);
  
    if (in._HierarchyAcgTrackingIdSet) record.put ("HierarchyAcgTrackingId", in.HierarchyAcgTrackingId);
  
    if (in._HierarchyAcgTrackingIdServSet) record.put ("HierarchyAcgTrackingIdServ", in.HierarchyAcgTrackingIdServ);
      return record;
  }
  /** convert AccountCodeGroupObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountCodeGroupObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AccountCodeGroupObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
      map = DataHelper.filterToMap (in.AcgTrackingId, in.AcgTrackingIdSort, in.AcgTrackingIdSortAscending, in.AcgTrackingIdFetch);
      if (map != null) record.put ("AcgTrackingId", map);
      map = DataHelper.filterToMap (in.AcgTrackingIdServ, in.AcgTrackingIdServSort, in.AcgTrackingIdServSortAscending, in.AcgTrackingIdServFetch);
      if (map != null) record.put ("AcgTrackingIdServ", map);
      map = DataHelper.filterToMap (in.ParentAcgTrackingId, in.ParentAcgTrackingIdSort, in.ParentAcgTrackingIdSortAscending, in.ParentAcgTrackingIdFetch);
      if (map != null) record.put ("ParentAcgTrackingId", map);
      map = DataHelper.filterToMap (in.ParentAcgTrackingIdServ, in.ParentAcgTrackingIdServSort, in.ParentAcgTrackingIdServSortAscending, in.ParentAcgTrackingIdServFetch);
      if (map != null) record.put ("ParentAcgTrackingIdServ", map);
      map = DataHelper.filterToMap (in.HierarchyAcgTrackingId, in.HierarchyAcgTrackingIdSort, in.HierarchyAcgTrackingIdSortAscending, in.HierarchyAcgTrackingIdFetch);
      if (map != null) record.put ("HierarchyAcgTrackingId", map);
      map = DataHelper.filterToMap (in.HierarchyAcgTrackingIdServ, in.HierarchyAcgTrackingIdServSort, in.HierarchyAcgTrackingIdServSortAscending, in.HierarchyAcgTrackingIdServFetch);
      if (map != null) record.put ("HierarchyAcgTrackingIdServ", map);
    return record;
  }
  /** convert Map to AccountCodeGroupObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountCodeGroupObjectData the converted object
   */
  public static AccountCodeGroupObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountCodeGroupObjectData out = new AccountCodeGroupObjectData ();

    out.Key = AccountCodeGroupObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
  
    if ((obj = record.get ("AcgTrackingId")) != null)
    {
      out.AcgTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("AcgTrackingIdServ")) != null)
    {
      out.AcgTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("ParentAcgTrackingId")) != null)
    {
      out.ParentAcgTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("ParentAcgTrackingIdServ")) != null)
    {
      out.ParentAcgTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("HierarchyAcgTrackingId")) != null)
    {
      out.HierarchyAcgTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("HierarchyAcgTrackingIdServ")) != null)
    {
      out.HierarchyAcgTrackingIdServ = (Integer) obj;
    }
      return out;
  }
  /** convert Map to AccountCodeGroupObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountCodeGroupObjectFilter the converted object
   */
  public static AccountCodeGroupObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountCodeGroupObjectFilter out = new AccountCodeGroupObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AccountCodeGroupObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map AccountExternalIdMap = (Map)record.get("AccountExternalId");
    Boolean AccountExternalIdFetch = DataHelper.getFetch(AccountExternalIdMap);
    Boolean AccountExternalIdSortDir = DataHelper.getSortDirection(AccountExternalIdMap);
    Integer AccountExternalIdSortOrder = DataHelper.getSortOrder(AccountExternalIdMap);
    if (AccountExternalIdFetch != null) out.setAccountExternalIdFetch(AccountExternalIdFetch);
    if (AccountExternalIdSortDir != null) out.setAccountExternalIdSortDirection(AccountExternalIdSortDir);
    if (AccountExternalIdSortOrder != null) out.setAccountExternalIdSortOrder(AccountExternalIdSortOrder);

    Filter[] AccountExternalIdFilter = DataHelper.mapToFilterArray(AccountExternalIdMap, String.class);
    if (AccountExternalIdFilter != null) {
      StringFilter[] AccountExternalIdFilters = new StringFilter[AccountExternalIdFilter.length];
      for (int i = 0; i < AccountExternalIdFilters.length; i++) {
        AccountExternalIdFilters[i] = (StringFilter)AccountExternalIdFilter[i];
      }
      try {
        out.setAccountExternalIdFilter(AccountExternalIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountExternalIdTypeMap = (Map)record.get("AccountExternalIdType");
    Boolean AccountExternalIdTypeFetch = DataHelper.getFetch(AccountExternalIdTypeMap);
    Boolean AccountExternalIdTypeSortDir = DataHelper.getSortDirection(AccountExternalIdTypeMap);
    Integer AccountExternalIdTypeSortOrder = DataHelper.getSortOrder(AccountExternalIdTypeMap);
    if (AccountExternalIdTypeFetch != null) out.setAccountExternalIdTypeFetch(AccountExternalIdTypeFetch);
    if (AccountExternalIdTypeSortDir != null) out.setAccountExternalIdTypeSortDirection(AccountExternalIdTypeSortDir);
    if (AccountExternalIdTypeSortOrder != null) out.setAccountExternalIdTypeSortOrder(AccountExternalIdTypeSortOrder);

    Filter[] AccountExternalIdTypeFilter = DataHelper.mapToFilterArray(AccountExternalIdTypeMap, Integer.class);
    if (AccountExternalIdTypeFilter != null) {
      IntegerFilter[] AccountExternalIdTypeFilters = new IntegerFilter[AccountExternalIdTypeFilter.length];
      for (int i = 0; i < AccountExternalIdTypeFilters.length; i++) {
        AccountExternalIdTypeFilters[i] = (IntegerFilter)AccountExternalIdTypeFilter[i];
      }
      try {
        out.setAccountExternalIdTypeFilter(AccountExternalIdTypeFilters);
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
  
    Map AcgTrackingIdMap = (Map)record.get("AcgTrackingId");
    Boolean AcgTrackingIdFetch = DataHelper.getFetch(AcgTrackingIdMap);
    Boolean AcgTrackingIdSortDir = DataHelper.getSortDirection(AcgTrackingIdMap);
    Integer AcgTrackingIdSortOrder = DataHelper.getSortOrder(AcgTrackingIdMap);
    if (AcgTrackingIdFetch != null) out.setAcgTrackingIdFetch(AcgTrackingIdFetch);
    if (AcgTrackingIdSortDir != null) out.setAcgTrackingIdSortDirection(AcgTrackingIdSortDir);
    if (AcgTrackingIdSortOrder != null) out.setAcgTrackingIdSortOrder(AcgTrackingIdSortOrder);

    Filter[] AcgTrackingIdFilter = DataHelper.mapToFilterArray(AcgTrackingIdMap, Integer.class);
    if (AcgTrackingIdFilter != null) {
      IntegerFilter[] AcgTrackingIdFilters = new IntegerFilter[AcgTrackingIdFilter.length];
      for (int i = 0; i < AcgTrackingIdFilters.length; i++) {
        AcgTrackingIdFilters[i] = (IntegerFilter)AcgTrackingIdFilter[i];
      }
      try {
        out.setAcgTrackingIdFilter(AcgTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AcgTrackingIdServMap = (Map)record.get("AcgTrackingIdServ");
    Boolean AcgTrackingIdServFetch = DataHelper.getFetch(AcgTrackingIdServMap);
    Boolean AcgTrackingIdServSortDir = DataHelper.getSortDirection(AcgTrackingIdServMap);
    Integer AcgTrackingIdServSortOrder = DataHelper.getSortOrder(AcgTrackingIdServMap);
    if (AcgTrackingIdServFetch != null) out.setAcgTrackingIdServFetch(AcgTrackingIdServFetch);
    if (AcgTrackingIdServSortDir != null) out.setAcgTrackingIdServSortDirection(AcgTrackingIdServSortDir);
    if (AcgTrackingIdServSortOrder != null) out.setAcgTrackingIdServSortOrder(AcgTrackingIdServSortOrder);

    Filter[] AcgTrackingIdServFilter = DataHelper.mapToFilterArray(AcgTrackingIdServMap, Integer.class);
    if (AcgTrackingIdServFilter != null) {
      IntegerFilter[] AcgTrackingIdServFilters = new IntegerFilter[AcgTrackingIdServFilter.length];
      for (int i = 0; i < AcgTrackingIdServFilters.length; i++) {
        AcgTrackingIdServFilters[i] = (IntegerFilter)AcgTrackingIdServFilter[i];
      }
      try {
        out.setAcgTrackingIdServFilter(AcgTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentAcgTrackingIdMap = (Map)record.get("ParentAcgTrackingId");
    Boolean ParentAcgTrackingIdFetch = DataHelper.getFetch(ParentAcgTrackingIdMap);
    Boolean ParentAcgTrackingIdSortDir = DataHelper.getSortDirection(ParentAcgTrackingIdMap);
    Integer ParentAcgTrackingIdSortOrder = DataHelper.getSortOrder(ParentAcgTrackingIdMap);
    if (ParentAcgTrackingIdFetch != null) out.setParentAcgTrackingIdFetch(ParentAcgTrackingIdFetch);
    if (ParentAcgTrackingIdSortDir != null) out.setParentAcgTrackingIdSortDirection(ParentAcgTrackingIdSortDir);
    if (ParentAcgTrackingIdSortOrder != null) out.setParentAcgTrackingIdSortOrder(ParentAcgTrackingIdSortOrder);

    Filter[] ParentAcgTrackingIdFilter = DataHelper.mapToFilterArray(ParentAcgTrackingIdMap, Integer.class);
    if (ParentAcgTrackingIdFilter != null) {
      IntegerFilter[] ParentAcgTrackingIdFilters = new IntegerFilter[ParentAcgTrackingIdFilter.length];
      for (int i = 0; i < ParentAcgTrackingIdFilters.length; i++) {
        ParentAcgTrackingIdFilters[i] = (IntegerFilter)ParentAcgTrackingIdFilter[i];
      }
      try {
        out.setParentAcgTrackingIdFilter(ParentAcgTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentAcgTrackingIdServMap = (Map)record.get("ParentAcgTrackingIdServ");
    Boolean ParentAcgTrackingIdServFetch = DataHelper.getFetch(ParentAcgTrackingIdServMap);
    Boolean ParentAcgTrackingIdServSortDir = DataHelper.getSortDirection(ParentAcgTrackingIdServMap);
    Integer ParentAcgTrackingIdServSortOrder = DataHelper.getSortOrder(ParentAcgTrackingIdServMap);
    if (ParentAcgTrackingIdServFetch != null) out.setParentAcgTrackingIdServFetch(ParentAcgTrackingIdServFetch);
    if (ParentAcgTrackingIdServSortDir != null) out.setParentAcgTrackingIdServSortDirection(ParentAcgTrackingIdServSortDir);
    if (ParentAcgTrackingIdServSortOrder != null) out.setParentAcgTrackingIdServSortOrder(ParentAcgTrackingIdServSortOrder);

    Filter[] ParentAcgTrackingIdServFilter = DataHelper.mapToFilterArray(ParentAcgTrackingIdServMap, Integer.class);
    if (ParentAcgTrackingIdServFilter != null) {
      IntegerFilter[] ParentAcgTrackingIdServFilters = new IntegerFilter[ParentAcgTrackingIdServFilter.length];
      for (int i = 0; i < ParentAcgTrackingIdServFilters.length; i++) {
        ParentAcgTrackingIdServFilters[i] = (IntegerFilter)ParentAcgTrackingIdServFilter[i];
      }
      try {
        out.setParentAcgTrackingIdServFilter(ParentAcgTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map HierarchyAcgTrackingIdMap = (Map)record.get("HierarchyAcgTrackingId");
    Boolean HierarchyAcgTrackingIdFetch = DataHelper.getFetch(HierarchyAcgTrackingIdMap);
    Boolean HierarchyAcgTrackingIdSortDir = DataHelper.getSortDirection(HierarchyAcgTrackingIdMap);
    Integer HierarchyAcgTrackingIdSortOrder = DataHelper.getSortOrder(HierarchyAcgTrackingIdMap);
    if (HierarchyAcgTrackingIdFetch != null) out.setHierarchyAcgTrackingIdFetch(HierarchyAcgTrackingIdFetch);
    if (HierarchyAcgTrackingIdSortDir != null) out.setHierarchyAcgTrackingIdSortDirection(HierarchyAcgTrackingIdSortDir);
    if (HierarchyAcgTrackingIdSortOrder != null) out.setHierarchyAcgTrackingIdSortOrder(HierarchyAcgTrackingIdSortOrder);

    Filter[] HierarchyAcgTrackingIdFilter = DataHelper.mapToFilterArray(HierarchyAcgTrackingIdMap, Integer.class);
    if (HierarchyAcgTrackingIdFilter != null) {
      IntegerFilter[] HierarchyAcgTrackingIdFilters = new IntegerFilter[HierarchyAcgTrackingIdFilter.length];
      for (int i = 0; i < HierarchyAcgTrackingIdFilters.length; i++) {
        HierarchyAcgTrackingIdFilters[i] = (IntegerFilter)HierarchyAcgTrackingIdFilter[i];
      }
      try {
        out.setHierarchyAcgTrackingIdFilter(HierarchyAcgTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map HierarchyAcgTrackingIdServMap = (Map)record.get("HierarchyAcgTrackingIdServ");
    Boolean HierarchyAcgTrackingIdServFetch = DataHelper.getFetch(HierarchyAcgTrackingIdServMap);
    Boolean HierarchyAcgTrackingIdServSortDir = DataHelper.getSortDirection(HierarchyAcgTrackingIdServMap);
    Integer HierarchyAcgTrackingIdServSortOrder = DataHelper.getSortOrder(HierarchyAcgTrackingIdServMap);
    if (HierarchyAcgTrackingIdServFetch != null) out.setHierarchyAcgTrackingIdServFetch(HierarchyAcgTrackingIdServFetch);
    if (HierarchyAcgTrackingIdServSortDir != null) out.setHierarchyAcgTrackingIdServSortDirection(HierarchyAcgTrackingIdServSortDir);
    if (HierarchyAcgTrackingIdServSortOrder != null) out.setHierarchyAcgTrackingIdServSortOrder(HierarchyAcgTrackingIdServSortOrder);

    Filter[] HierarchyAcgTrackingIdServFilter = DataHelper.mapToFilterArray(HierarchyAcgTrackingIdServMap, Integer.class);
    if (HierarchyAcgTrackingIdServFilter != null) {
      IntegerFilter[] HierarchyAcgTrackingIdServFilters = new IntegerFilter[HierarchyAcgTrackingIdServFilter.length];
      for (int i = 0; i < HierarchyAcgTrackingIdServFilters.length; i++) {
        HierarchyAcgTrackingIdServFilters[i] = (IntegerFilter)HierarchyAcgTrackingIdServFilter[i];
      }
      try {
        out.setHierarchyAcgTrackingIdServFilter(HierarchyAcgTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
