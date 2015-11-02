/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountHqContractObjectHelper.java
 * Definition File: Customer/AccountHqContract.xml
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



/** Helper class to convert AccountHqContractObject JavaBean objects to/from HashMaps.
 */
public class AccountHqContractObjectHelper implements ArubaObjectHelper
{
  /** convert AccountHqContractObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountHqContractObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountHqContractObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountHqContractObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountHqContractObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountHqContractObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AccountHqContractObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountHqContractObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountHqContractObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountHqContractObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountHqContractObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountHqContractObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountHqContractObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountHqContractObjectData the converted object
   */
  public static AccountHqContractObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountHqContractObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountHqContractObject")
   * @return AccountHqContractObjectData the converted object
   */
  public static AccountHqContractObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountHqContractObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountHqContractObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountHqContractObjectFilter the converted object
   */
  public static AccountHqContractObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountHqContractObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountHqContractObject")
   * @return AccountHqContractObjectFilter the converted object
   */
  public static AccountHqContractObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountHqContractObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountHqContractObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountHqContractObjectDataList the converted object
   */
  public static AccountHqContractObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountHqContractObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountHqContractObjectList")
   * @return AccountHqContractObjectDataList the converted object
   */
  public static AccountHqContractObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountHqContractObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountHqContractObjectData[] array = null;
    if (root != null)
    {
      array = new AccountHqContractObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountHqContractObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountHqContractObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountHqContractObjectDataList (array, index, total);
  }
  /** convert AccountHqContractObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountHqContractObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AccountHqContractObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._EndDtSet) record.put ("EndDt", in.EndDt);
  
    if (in._ProportionSet) record.put ("Proportion", in.Proportion);
  
    if (in._ExcludeSet) record.put ("Exclude", in.Exclude);
  
    if (in._InUseSet) record.put ("InUse", in.InUse);
      return record;
  }
  /** convert AccountHqContractObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountHqContractObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AccountHqContractObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.EndDt, in.EndDtSort, in.EndDtSortAscending, in.EndDtFetch);
      if (map != null) record.put ("EndDt", map);
      map = DataHelper.filterToMap (in.Proportion, in.ProportionSort, in.ProportionSortAscending, in.ProportionFetch);
      if (map != null) record.put ("Proportion", map);
      map = DataHelper.filterToMap (in.Exclude, in.ExcludeSort, in.ExcludeSortAscending, in.ExcludeFetch);
      if (map != null) record.put ("Exclude", map);
      map = DataHelper.filterToMap (in.InUse, in.InUseSort, in.InUseSortAscending, in.InUseFetch, in.InUseCaseInsensitive);
      if (map != null) record.put ("InUse", map);
    return record;
  }
  /** convert Map to AccountHqContractObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountHqContractObjectData the converted object
   */
  public static AccountHqContractObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountHqContractObjectData out = new AccountHqContractObjectData ();

    out.Key = AccountHqContractObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("EndDt")) != null)
    {
      out.EndDt = (Date) obj;
    }
  
    if ((obj = record.get ("Proportion")) != null)
    {
      out.Proportion = (Integer) obj;
    }
  
    if ((obj = record.get ("Exclude")) != null)
    {
      out.Exclude = (Boolean) obj;
    }
  
    if ((obj = record.get ("InUse")) != null)
    {
      out.InUse = (String) obj;
    }
      return out;
  }
  /** convert Map to AccountHqContractObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountHqContractObjectFilter the converted object
   */
  public static AccountHqContractObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountHqContractObjectFilter out = new AccountHqContractObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AccountHqContractObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map EndDtMap = (Map)record.get("EndDt");
    Boolean EndDtFetch = DataHelper.getFetch(EndDtMap);
    Boolean EndDtSortDir = DataHelper.getSortDirection(EndDtMap);
    Integer EndDtSortOrder = DataHelper.getSortOrder(EndDtMap);
    if (EndDtFetch != null) out.setEndDtFetch(EndDtFetch);
    if (EndDtSortDir != null) out.setEndDtSortDirection(EndDtSortDir);
    if (EndDtSortOrder != null) out.setEndDtSortOrder(EndDtSortOrder);

    Filter[] EndDtFilter = DataHelper.mapToFilterArray(EndDtMap, Date.class);
    if (EndDtFilter != null) {
      DateFilter[] EndDtFilters = new DateFilter[EndDtFilter.length];
      for (int i = 0; i < EndDtFilters.length; i++) {
        EndDtFilters[i] = (DateFilter)EndDtFilter[i];
      }
      try {
        out.setEndDtFilter(EndDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProportionMap = (Map)record.get("Proportion");
    Boolean ProportionFetch = DataHelper.getFetch(ProportionMap);
    Boolean ProportionSortDir = DataHelper.getSortDirection(ProportionMap);
    Integer ProportionSortOrder = DataHelper.getSortOrder(ProportionMap);
    if (ProportionFetch != null) out.setProportionFetch(ProportionFetch);
    if (ProportionSortDir != null) out.setProportionSortDirection(ProportionSortDir);
    if (ProportionSortOrder != null) out.setProportionSortOrder(ProportionSortOrder);

    Filter[] ProportionFilter = DataHelper.mapToFilterArray(ProportionMap, Integer.class);
    if (ProportionFilter != null) {
      IntegerFilter[] ProportionFilters = new IntegerFilter[ProportionFilter.length];
      for (int i = 0; i < ProportionFilters.length; i++) {
        ProportionFilters[i] = (IntegerFilter)ProportionFilter[i];
      }
      try {
        out.setProportionFilter(ProportionFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExcludeMap = (Map)record.get("Exclude");
    Boolean ExcludeFetch = DataHelper.getFetch(ExcludeMap);
    Boolean ExcludeSortDir = DataHelper.getSortDirection(ExcludeMap);
    Integer ExcludeSortOrder = DataHelper.getSortOrder(ExcludeMap);
    if (ExcludeFetch != null) out.setExcludeFetch(ExcludeFetch);
    if (ExcludeSortDir != null) out.setExcludeSortDirection(ExcludeSortDir);
    if (ExcludeSortOrder != null) out.setExcludeSortOrder(ExcludeSortOrder);

    Filter[] ExcludeFilter = DataHelper.mapToFilterArray(ExcludeMap, Boolean.class);
    if (ExcludeFilter != null) {
      BooleanFilter[] ExcludeFilters = new BooleanFilter[ExcludeFilter.length];
      for (int i = 0; i < ExcludeFilters.length; i++) {
        ExcludeFilters[i] = (BooleanFilter)ExcludeFilter[i];
      }
      try {
        out.setExcludeFilter(ExcludeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map InUseMap = (Map)record.get("InUse");
    Boolean InUseFetch = DataHelper.getFetch(InUseMap);
    Boolean InUseSortDir = DataHelper.getSortDirection(InUseMap);
    Integer InUseSortOrder = DataHelper.getSortOrder(InUseMap);
    if (InUseFetch != null) out.setInUseFetch(InUseFetch);
    if (InUseSortDir != null) out.setInUseSortDirection(InUseSortDir);
    if (InUseSortOrder != null) out.setInUseSortOrder(InUseSortOrder);

    Filter[] InUseFilter = DataHelper.mapToFilterArray(InUseMap, String.class);
    if (InUseFilter != null) {
      StringFilter[] InUseFilters = new StringFilter[InUseFilter.length];
      for (int i = 0; i < InUseFilters.length; i++) {
        InUseFilters[i] = (StringFilter)InUseFilter[i];
      }
      try {
        out.setInUseFilter(InUseFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
