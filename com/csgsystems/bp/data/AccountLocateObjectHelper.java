/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountLocateObjectHelper.java
 * Definition File: Catalog/AccountLocate.xml
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



/** Helper class to convert AccountLocateObject JavaBean objects to/from HashMaps.
 */
public class AccountLocateObjectHelper implements ArubaObjectHelper
{
  /** convert AccountLocateObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AccountLocateObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountLocateObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountLocateObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountLocateObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AccountLocateObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AccountLocateObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AccountLocateObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AccountLocateObject")
   * @return Map     the output Map
   */
  public static Map toMap (AccountLocateObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AccountLocateObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AccountLocateObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AccountLocateObjectData the converted object
   */
  public static AccountLocateObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AccountLocateObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AccountLocateObject")
   * @return AccountLocateObjectData the converted object
   */
  public static AccountLocateObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AccountLocateObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AccountLocateObjectFilter the converted object
   */
  public static AccountLocateObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AccountLocateObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AccountLocateObject")
   * @return AccountLocateObjectFilter the converted object
   */
  public static AccountLocateObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountLocateObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AccountLocateObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AccountLocateObjectDataList the converted object
   */
  public static AccountLocateObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AccountLocateObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AccountLocateObjectList")
   * @return AccountLocateObjectDataList the converted object
   */
  public static AccountLocateObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AccountLocateObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AccountLocateObjectData[] array = null;
    if (root != null)
    {
      array = new AccountLocateObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AccountLocateObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AccountLocateObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AccountLocateObjectDataList (array, index, total);
  }
  /** convert AccountLocateObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountLocateObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AccountLocateObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._HierarchyIdSet) record.put ("HierarchyId", in.HierarchyId);
  
    if (in._ParentIdSet) record.put ("ParentId", in.ParentId);
  
    if (in._AccountCategorySet) record.put ("AccountCategory", in.AccountCategory);
  
    if (in._BillFnameSet) record.put ("BillFname", in.BillFname);
  
    if (in._BillFnameFindSet) record.put ("BillFnameFind", in.BillFnameFind);
  
    if (in._BillLnameSet) record.put ("BillLname", in.BillLname);
  
    if (in._BillLnameFindSet) record.put ("BillLnameFind", in.BillLnameFind);
  
    if (in._BillCompanySet) record.put ("BillCompany", in.BillCompany);
  
    if (in._BillCompanyFindSet) record.put ("BillCompanyFind", in.BillCompanyFind);
  
    if (in._BillAddress1Set) record.put ("BillAddress1", in.BillAddress1);
  
    if (in._BillCitySet) record.put ("BillCity", in.BillCity);
  
    if (in._BillStateSet) record.put ("BillState", in.BillState);
  
    if (in._BillZipSet) record.put ("BillZip", in.BillZip);
  
    if (in._CustPhone1Set) record.put ("CustPhone1", in.CustPhone1);
  
    if (in._CustPhone2Set) record.put ("CustPhone2", in.CustPhone2);
  
    if (in._CodewordSet) record.put ("Codeword", in.Codeword);
  
    if (in._ServerIdSet) record.put ("ServerId", in.ServerId);
  
    if (in._AcctSegIdSet) record.put ("AcctSegId", in.AcctSegId);
  
    if (in._AltLnameSet) record.put ("AltLname", in.AltLname);
  
    if (in._AltFnameSet) record.put ("AltFname", in.AltFname);
  
    if (in._AltCompanyNameSet) record.put ("AltCompanyName", in.AltCompanyName);
  
    if (in._DateActiveSet) record.put ("DateActive", in.DateActive);
  
    if (in._DateInactiveSet) record.put ("DateInactive", in.DateInactive);
  
    if (in._CustomerLifetimeIdSet) record.put ("CustomerLifetimeId", in.CustomerLifetimeId);
  
    if (in._CustomerLifetimeId2Set) record.put ("CustomerLifetimeId2", in.CustomerLifetimeId2);
      return record;
  }
  /** convert AccountLocateObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AccountLocateObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AccountLocateObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.HierarchyId, in.HierarchyIdSort, in.HierarchyIdSortAscending, in.HierarchyIdFetch); 
      if (map != null) record.put ("HierarchyId", map);
      map = DataHelper.filterToMap (in.ParentId, in.ParentIdSort, in.ParentIdSortAscending, in.ParentIdFetch); 
      if (map != null) record.put ("ParentId", map);
      map = DataHelper.filterToMap (in.AccountCategory, in.AccountCategorySort, in.AccountCategorySortAscending, in.AccountCategoryFetch);
      if (map != null) record.put ("AccountCategory", map);
      map = DataHelper.filterToMap (in.BillFname, in.BillFnameSort, in.BillFnameSortAscending, in.BillFnameFetch, in.BillFnameCaseInsensitive);
      if (map != null) record.put ("BillFname", map);
      map = DataHelper.filterToMap (in.BillFnameFind, in.BillFnameFindSort, in.BillFnameFindSortAscending, in.BillFnameFindFetch, in.BillFnameFindCaseInsensitive);
      if (map != null) record.put ("BillFnameFind", map);
      map = DataHelper.filterToMap (in.BillLname, in.BillLnameSort, in.BillLnameSortAscending, in.BillLnameFetch, in.BillLnameCaseInsensitive);
      if (map != null) record.put ("BillLname", map);
      map = DataHelper.filterToMap (in.BillLnameFind, in.BillLnameFindSort, in.BillLnameFindSortAscending, in.BillLnameFindFetch, in.BillLnameFindCaseInsensitive);
      if (map != null) record.put ("BillLnameFind", map);
      map = DataHelper.filterToMap (in.BillCompany, in.BillCompanySort, in.BillCompanySortAscending, in.BillCompanyFetch, in.BillCompanyCaseInsensitive);
      if (map != null) record.put ("BillCompany", map);
      map = DataHelper.filterToMap (in.BillCompanyFind, in.BillCompanyFindSort, in.BillCompanyFindSortAscending, in.BillCompanyFindFetch, in.BillCompanyFindCaseInsensitive);
      if (map != null) record.put ("BillCompanyFind", map);
      map = DataHelper.filterToMap (in.BillAddress1, in.BillAddress1Sort, in.BillAddress1SortAscending, in.BillAddress1Fetch, in.BillAddress1CaseInsensitive);
      if (map != null) record.put ("BillAddress1", map);
      map = DataHelper.filterToMap (in.BillCity, in.BillCitySort, in.BillCitySortAscending, in.BillCityFetch, in.BillCityCaseInsensitive);
      if (map != null) record.put ("BillCity", map);
      map = DataHelper.filterToMap (in.BillState, in.BillStateSort, in.BillStateSortAscending, in.BillStateFetch, in.BillStateCaseInsensitive);
      if (map != null) record.put ("BillState", map);
      map = DataHelper.filterToMap (in.BillZip, in.BillZipSort, in.BillZipSortAscending, in.BillZipFetch, in.BillZipCaseInsensitive);
      if (map != null) record.put ("BillZip", map);
      map = DataHelper.filterToMap (in.CustPhone1, in.CustPhone1Sort, in.CustPhone1SortAscending, in.CustPhone1Fetch, in.CustPhone1CaseInsensitive);
      if (map != null) record.put ("CustPhone1", map);
      map = DataHelper.filterToMap (in.CustPhone2, in.CustPhone2Sort, in.CustPhone2SortAscending, in.CustPhone2Fetch, in.CustPhone2CaseInsensitive);
      if (map != null) record.put ("CustPhone2", map);
      map = DataHelper.filterToMap (in.Codeword, in.CodewordSort, in.CodewordSortAscending, in.CodewordFetch, in.CodewordCaseInsensitive);
      if (map != null) record.put ("Codeword", map);
      map = DataHelper.filterToMap (in.ServerId, in.ServerIdSort, in.ServerIdSortAscending, in.ServerIdFetch);
      if (map != null) record.put ("ServerId", map);
      map = DataHelper.filterToMap (in.AcctSegId, in.AcctSegIdSort, in.AcctSegIdSortAscending, in.AcctSegIdFetch);
      if (map != null) record.put ("AcctSegId", map);
      map = DataHelper.filterToMap (in.AltLname, in.AltLnameSort, in.AltLnameSortAscending, in.AltLnameFetch, in.AltLnameCaseInsensitive);
      if (map != null) record.put ("AltLname", map);
      map = DataHelper.filterToMap (in.AltFname, in.AltFnameSort, in.AltFnameSortAscending, in.AltFnameFetch, in.AltFnameCaseInsensitive);
      if (map != null) record.put ("AltFname", map);
      map = DataHelper.filterToMap (in.AltCompanyName, in.AltCompanyNameSort, in.AltCompanyNameSortAscending, in.AltCompanyNameFetch, in.AltCompanyNameCaseInsensitive);
      if (map != null) record.put ("AltCompanyName", map);
      map = DataHelper.filterToMap (in.DateActive, in.DateActiveSort, in.DateActiveSortAscending, in.DateActiveFetch);
      if (map != null) record.put ("DateActive", map);
      map = DataHelper.filterToMap (in.DateInactive, in.DateInactiveSort, in.DateInactiveSortAscending, in.DateInactiveFetch);
      if (map != null) record.put ("DateInactive", map);
      map = DataHelper.filterToMap (in.CustomerLifetimeId, in.CustomerLifetimeIdSort, in.CustomerLifetimeIdSortAscending, in.CustomerLifetimeIdFetch);
      if (map != null) record.put ("CustomerLifetimeId", map);
      map = DataHelper.filterToMap (in.CustomerLifetimeId2, in.CustomerLifetimeId2Sort, in.CustomerLifetimeId2SortAscending, in.CustomerLifetimeId2Fetch);
      if (map != null) record.put ("CustomerLifetimeId2", map);
    return record;
  }
  /** convert Map to AccountLocateObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountLocateObjectData the converted object
   */
  public static AccountLocateObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountLocateObjectData out = new AccountLocateObjectData ();

    out.Key = AccountLocateObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("HierarchyId")) != null)
    {
      out.HierarchyId = (Integer) obj;
    }
  
    if ((obj = record.get ("ParentId")) != null)
    {
      out.ParentId = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountCategory")) != null)
    {
      out.AccountCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("BillFname")) != null)
    {
      out.BillFname = (String) obj;
    }
  
    if ((obj = record.get ("BillFnameFind")) != null)
    {
      out.BillFnameFind = (String) obj;
    }
  
    if ((obj = record.get ("BillLname")) != null)
    {
      out.BillLname = (String) obj;
    }
  
    if ((obj = record.get ("BillLnameFind")) != null)
    {
      out.BillLnameFind = (String) obj;
    }
  
    if ((obj = record.get ("BillCompany")) != null)
    {
      out.BillCompany = (String) obj;
    }
  
    if ((obj = record.get ("BillCompanyFind")) != null)
    {
      out.BillCompanyFind = (String) obj;
    }
  
    if ((obj = record.get ("BillAddress1")) != null)
    {
      out.BillAddress1 = (String) obj;
    }
  
    if ((obj = record.get ("BillCity")) != null)
    {
      out.BillCity = (String) obj;
    }
  
    if ((obj = record.get ("BillState")) != null)
    {
      out.BillState = (String) obj;
    }
  
    if ((obj = record.get ("BillZip")) != null)
    {
      out.BillZip = (String) obj;
    }
  
    if ((obj = record.get ("CustPhone1")) != null)
    {
      out.CustPhone1 = (String) obj;
    }
  
    if ((obj = record.get ("CustPhone2")) != null)
    {
      out.CustPhone2 = (String) obj;
    }
  
    if ((obj = record.get ("Codeword")) != null)
    {
      out.Codeword = (String) obj;
    }
  
    if ((obj = record.get ("ServerId")) != null)
    {
      out.ServerId = (Integer) obj;
    }
  
    if ((obj = record.get ("AcctSegId")) != null)
    {
      out.AcctSegId = (Integer) obj;
    }
  
    if ((obj = record.get ("AltLname")) != null)
    {
      out.AltLname = (String) obj;
    }
  
    if ((obj = record.get ("AltFname")) != null)
    {
      out.AltFname = (String) obj;
    }
  
    if ((obj = record.get ("AltCompanyName")) != null)
    {
      out.AltCompanyName = (String) obj;
    }
  
    if ((obj = record.get ("DateActive")) != null)
    {
      out.DateActive = (Date) obj;
    }
  
    if ((obj = record.get ("DateInactive")) != null)
    {
      out.DateInactive = (Date) obj;
    }
  
    if ((obj = record.get ("CustomerLifetimeId")) != null)
    {
      out.CustomerLifetimeId = (Integer) obj;
    }
  
    if ((obj = record.get ("CustomerLifetimeId2")) != null)
    {
      out.CustomerLifetimeId2 = (Integer) obj;
    }
      return out;
  }
  /** convert Map to AccountLocateObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AccountLocateObjectFilter the converted object
   */
  public static AccountLocateObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AccountLocateObjectFilter out = new AccountLocateObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AccountLocateObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map AccountCategoryMap = (Map)record.get("AccountCategory");
    Boolean AccountCategoryFetch = DataHelper.getFetch(AccountCategoryMap);
    Boolean AccountCategorySortDir = DataHelper.getSortDirection(AccountCategoryMap);
    Integer AccountCategorySortOrder = DataHelper.getSortOrder(AccountCategoryMap);
    if (AccountCategoryFetch != null) out.setAccountCategoryFetch(AccountCategoryFetch);
    if (AccountCategorySortDir != null) out.setAccountCategorySortDirection(AccountCategorySortDir);
    if (AccountCategorySortOrder != null) out.setAccountCategorySortOrder(AccountCategorySortOrder);

    Filter[] AccountCategoryFilter = DataHelper.mapToFilterArray(AccountCategoryMap, Integer.class);
    if (AccountCategoryFilter != null) {
      IntegerFilter[] AccountCategoryFilters = new IntegerFilter[AccountCategoryFilter.length];
      for (int i = 0; i < AccountCategoryFilters.length; i++) {
        AccountCategoryFilters[i] = (IntegerFilter)AccountCategoryFilter[i];
      }
      try {
        out.setAccountCategoryFilter(AccountCategoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillFnameMap = (Map)record.get("BillFname");
    Boolean BillFnameFetch = DataHelper.getFetch(BillFnameMap);
    Boolean BillFnameSortDir = DataHelper.getSortDirection(BillFnameMap);
    Integer BillFnameSortOrder = DataHelper.getSortOrder(BillFnameMap);
    if (BillFnameFetch != null) out.setBillFnameFetch(BillFnameFetch);
    if (BillFnameSortDir != null) out.setBillFnameSortDirection(BillFnameSortDir);
    if (BillFnameSortOrder != null) out.setBillFnameSortOrder(BillFnameSortOrder);

    Filter[] BillFnameFilter = DataHelper.mapToFilterArray(BillFnameMap, String.class);
    if (BillFnameFilter != null) {
      StringFilter[] BillFnameFilters = new StringFilter[BillFnameFilter.length];
      for (int i = 0; i < BillFnameFilters.length; i++) {
        BillFnameFilters[i] = (StringFilter)BillFnameFilter[i];
      }
      try {
        out.setBillFnameFilter(BillFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillFnameFindMap = (Map)record.get("BillFnameFind");
    Boolean BillFnameFindFetch = DataHelper.getFetch(BillFnameFindMap);
    Boolean BillFnameFindSortDir = DataHelper.getSortDirection(BillFnameFindMap);
    Integer BillFnameFindSortOrder = DataHelper.getSortOrder(BillFnameFindMap);
    if (BillFnameFindFetch != null) out.setBillFnameFindFetch(BillFnameFindFetch);
    if (BillFnameFindSortDir != null) out.setBillFnameFindSortDirection(BillFnameFindSortDir);
    if (BillFnameFindSortOrder != null) out.setBillFnameFindSortOrder(BillFnameFindSortOrder);

    Filter[] BillFnameFindFilter = DataHelper.mapToFilterArray(BillFnameFindMap, String.class);
    if (BillFnameFindFilter != null) {
      StringFilter[] BillFnameFindFilters = new StringFilter[BillFnameFindFilter.length];
      for (int i = 0; i < BillFnameFindFilters.length; i++) {
        BillFnameFindFilters[i] = (StringFilter)BillFnameFindFilter[i];
      }
      try {
        out.setBillFnameFindFilter(BillFnameFindFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillLnameMap = (Map)record.get("BillLname");
    Boolean BillLnameFetch = DataHelper.getFetch(BillLnameMap);
    Boolean BillLnameSortDir = DataHelper.getSortDirection(BillLnameMap);
    Integer BillLnameSortOrder = DataHelper.getSortOrder(BillLnameMap);
    if (BillLnameFetch != null) out.setBillLnameFetch(BillLnameFetch);
    if (BillLnameSortDir != null) out.setBillLnameSortDirection(BillLnameSortDir);
    if (BillLnameSortOrder != null) out.setBillLnameSortOrder(BillLnameSortOrder);

    Filter[] BillLnameFilter = DataHelper.mapToFilterArray(BillLnameMap, String.class);
    if (BillLnameFilter != null) {
      StringFilter[] BillLnameFilters = new StringFilter[BillLnameFilter.length];
      for (int i = 0; i < BillLnameFilters.length; i++) {
        BillLnameFilters[i] = (StringFilter)BillLnameFilter[i];
      }
      try {
        out.setBillLnameFilter(BillLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillLnameFindMap = (Map)record.get("BillLnameFind");
    Boolean BillLnameFindFetch = DataHelper.getFetch(BillLnameFindMap);
    Boolean BillLnameFindSortDir = DataHelper.getSortDirection(BillLnameFindMap);
    Integer BillLnameFindSortOrder = DataHelper.getSortOrder(BillLnameFindMap);
    if (BillLnameFindFetch != null) out.setBillLnameFindFetch(BillLnameFindFetch);
    if (BillLnameFindSortDir != null) out.setBillLnameFindSortDirection(BillLnameFindSortDir);
    if (BillLnameFindSortOrder != null) out.setBillLnameFindSortOrder(BillLnameFindSortOrder);

    Filter[] BillLnameFindFilter = DataHelper.mapToFilterArray(BillLnameFindMap, String.class);
    if (BillLnameFindFilter != null) {
      StringFilter[] BillLnameFindFilters = new StringFilter[BillLnameFindFilter.length];
      for (int i = 0; i < BillLnameFindFilters.length; i++) {
        BillLnameFindFilters[i] = (StringFilter)BillLnameFindFilter[i];
      }
      try {
        out.setBillLnameFindFilter(BillLnameFindFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCompanyMap = (Map)record.get("BillCompany");
    Boolean BillCompanyFetch = DataHelper.getFetch(BillCompanyMap);
    Boolean BillCompanySortDir = DataHelper.getSortDirection(BillCompanyMap);
    Integer BillCompanySortOrder = DataHelper.getSortOrder(BillCompanyMap);
    if (BillCompanyFetch != null) out.setBillCompanyFetch(BillCompanyFetch);
    if (BillCompanySortDir != null) out.setBillCompanySortDirection(BillCompanySortDir);
    if (BillCompanySortOrder != null) out.setBillCompanySortOrder(BillCompanySortOrder);

    Filter[] BillCompanyFilter = DataHelper.mapToFilterArray(BillCompanyMap, String.class);
    if (BillCompanyFilter != null) {
      StringFilter[] BillCompanyFilters = new StringFilter[BillCompanyFilter.length];
      for (int i = 0; i < BillCompanyFilters.length; i++) {
        BillCompanyFilters[i] = (StringFilter)BillCompanyFilter[i];
      }
      try {
        out.setBillCompanyFilter(BillCompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCompanyFindMap = (Map)record.get("BillCompanyFind");
    Boolean BillCompanyFindFetch = DataHelper.getFetch(BillCompanyFindMap);
    Boolean BillCompanyFindSortDir = DataHelper.getSortDirection(BillCompanyFindMap);
    Integer BillCompanyFindSortOrder = DataHelper.getSortOrder(BillCompanyFindMap);
    if (BillCompanyFindFetch != null) out.setBillCompanyFindFetch(BillCompanyFindFetch);
    if (BillCompanyFindSortDir != null) out.setBillCompanyFindSortDirection(BillCompanyFindSortDir);
    if (BillCompanyFindSortOrder != null) out.setBillCompanyFindSortOrder(BillCompanyFindSortOrder);

    Filter[] BillCompanyFindFilter = DataHelper.mapToFilterArray(BillCompanyFindMap, String.class);
    if (BillCompanyFindFilter != null) {
      StringFilter[] BillCompanyFindFilters = new StringFilter[BillCompanyFindFilter.length];
      for (int i = 0; i < BillCompanyFindFilters.length; i++) {
        BillCompanyFindFilters[i] = (StringFilter)BillCompanyFindFilter[i];
      }
      try {
        out.setBillCompanyFindFilter(BillCompanyFindFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillAddress1Map = (Map)record.get("BillAddress1");
    Boolean BillAddress1Fetch = DataHelper.getFetch(BillAddress1Map);
    Boolean BillAddress1SortDir = DataHelper.getSortDirection(BillAddress1Map);
    Integer BillAddress1SortOrder = DataHelper.getSortOrder(BillAddress1Map);
    if (BillAddress1Fetch != null) out.setBillAddress1Fetch(BillAddress1Fetch);
    if (BillAddress1SortDir != null) out.setBillAddress1SortDirection(BillAddress1SortDir);
    if (BillAddress1SortOrder != null) out.setBillAddress1SortOrder(BillAddress1SortOrder);

    Filter[] BillAddress1Filter = DataHelper.mapToFilterArray(BillAddress1Map, String.class);
    if (BillAddress1Filter != null) {
      StringFilter[] BillAddress1Filters = new StringFilter[BillAddress1Filter.length];
      for (int i = 0; i < BillAddress1Filters.length; i++) {
        BillAddress1Filters[i] = (StringFilter)BillAddress1Filter[i];
      }
      try {
        out.setBillAddress1Filter(BillAddress1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCityMap = (Map)record.get("BillCity");
    Boolean BillCityFetch = DataHelper.getFetch(BillCityMap);
    Boolean BillCitySortDir = DataHelper.getSortDirection(BillCityMap);
    Integer BillCitySortOrder = DataHelper.getSortOrder(BillCityMap);
    if (BillCityFetch != null) out.setBillCityFetch(BillCityFetch);
    if (BillCitySortDir != null) out.setBillCitySortDirection(BillCitySortDir);
    if (BillCitySortOrder != null) out.setBillCitySortOrder(BillCitySortOrder);

    Filter[] BillCityFilter = DataHelper.mapToFilterArray(BillCityMap, String.class);
    if (BillCityFilter != null) {
      StringFilter[] BillCityFilters = new StringFilter[BillCityFilter.length];
      for (int i = 0; i < BillCityFilters.length; i++) {
        BillCityFilters[i] = (StringFilter)BillCityFilter[i];
      }
      try {
        out.setBillCityFilter(BillCityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillStateMap = (Map)record.get("BillState");
    Boolean BillStateFetch = DataHelper.getFetch(BillStateMap);
    Boolean BillStateSortDir = DataHelper.getSortDirection(BillStateMap);
    Integer BillStateSortOrder = DataHelper.getSortOrder(BillStateMap);
    if (BillStateFetch != null) out.setBillStateFetch(BillStateFetch);
    if (BillStateSortDir != null) out.setBillStateSortDirection(BillStateSortDir);
    if (BillStateSortOrder != null) out.setBillStateSortOrder(BillStateSortOrder);

    Filter[] BillStateFilter = DataHelper.mapToFilterArray(BillStateMap, String.class);
    if (BillStateFilter != null) {
      StringFilter[] BillStateFilters = new StringFilter[BillStateFilter.length];
      for (int i = 0; i < BillStateFilters.length; i++) {
        BillStateFilters[i] = (StringFilter)BillStateFilter[i];
      }
      try {
        out.setBillStateFilter(BillStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillZipMap = (Map)record.get("BillZip");
    Boolean BillZipFetch = DataHelper.getFetch(BillZipMap);
    Boolean BillZipSortDir = DataHelper.getSortDirection(BillZipMap);
    Integer BillZipSortOrder = DataHelper.getSortOrder(BillZipMap);
    if (BillZipFetch != null) out.setBillZipFetch(BillZipFetch);
    if (BillZipSortDir != null) out.setBillZipSortDirection(BillZipSortDir);
    if (BillZipSortOrder != null) out.setBillZipSortOrder(BillZipSortOrder);

    Filter[] BillZipFilter = DataHelper.mapToFilterArray(BillZipMap, String.class);
    if (BillZipFilter != null) {
      StringFilter[] BillZipFilters = new StringFilter[BillZipFilter.length];
      for (int i = 0; i < BillZipFilters.length; i++) {
        BillZipFilters[i] = (StringFilter)BillZipFilter[i];
      }
      try {
        out.setBillZipFilter(BillZipFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustPhone1Map = (Map)record.get("CustPhone1");
    Boolean CustPhone1Fetch = DataHelper.getFetch(CustPhone1Map);
    Boolean CustPhone1SortDir = DataHelper.getSortDirection(CustPhone1Map);
    Integer CustPhone1SortOrder = DataHelper.getSortOrder(CustPhone1Map);
    if (CustPhone1Fetch != null) out.setCustPhone1Fetch(CustPhone1Fetch);
    if (CustPhone1SortDir != null) out.setCustPhone1SortDirection(CustPhone1SortDir);
    if (CustPhone1SortOrder != null) out.setCustPhone1SortOrder(CustPhone1SortOrder);

    Filter[] CustPhone1Filter = DataHelper.mapToFilterArray(CustPhone1Map, String.class);
    if (CustPhone1Filter != null) {
      StringFilter[] CustPhone1Filters = new StringFilter[CustPhone1Filter.length];
      for (int i = 0; i < CustPhone1Filters.length; i++) {
        CustPhone1Filters[i] = (StringFilter)CustPhone1Filter[i];
      }
      try {
        out.setCustPhone1Filter(CustPhone1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustPhone2Map = (Map)record.get("CustPhone2");
    Boolean CustPhone2Fetch = DataHelper.getFetch(CustPhone2Map);
    Boolean CustPhone2SortDir = DataHelper.getSortDirection(CustPhone2Map);
    Integer CustPhone2SortOrder = DataHelper.getSortOrder(CustPhone2Map);
    if (CustPhone2Fetch != null) out.setCustPhone2Fetch(CustPhone2Fetch);
    if (CustPhone2SortDir != null) out.setCustPhone2SortDirection(CustPhone2SortDir);
    if (CustPhone2SortOrder != null) out.setCustPhone2SortOrder(CustPhone2SortOrder);

    Filter[] CustPhone2Filter = DataHelper.mapToFilterArray(CustPhone2Map, String.class);
    if (CustPhone2Filter != null) {
      StringFilter[] CustPhone2Filters = new StringFilter[CustPhone2Filter.length];
      for (int i = 0; i < CustPhone2Filters.length; i++) {
        CustPhone2Filters[i] = (StringFilter)CustPhone2Filter[i];
      }
      try {
        out.setCustPhone2Filter(CustPhone2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CodewordMap = (Map)record.get("Codeword");
    Boolean CodewordFetch = DataHelper.getFetch(CodewordMap);
    Boolean CodewordSortDir = DataHelper.getSortDirection(CodewordMap);
    Integer CodewordSortOrder = DataHelper.getSortOrder(CodewordMap);
    if (CodewordFetch != null) out.setCodewordFetch(CodewordFetch);
    if (CodewordSortDir != null) out.setCodewordSortDirection(CodewordSortDir);
    if (CodewordSortOrder != null) out.setCodewordSortOrder(CodewordSortOrder);

    Filter[] CodewordFilter = DataHelper.mapToFilterArray(CodewordMap, String.class);
    if (CodewordFilter != null) {
      StringFilter[] CodewordFilters = new StringFilter[CodewordFilter.length];
      for (int i = 0; i < CodewordFilters.length; i++) {
        CodewordFilters[i] = (StringFilter)CodewordFilter[i];
      }
      try {
        out.setCodewordFilter(CodewordFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ServerIdMap = (Map)record.get("ServerId");
    Boolean ServerIdFetch = DataHelper.getFetch(ServerIdMap);
    Boolean ServerIdSortDir = DataHelper.getSortDirection(ServerIdMap);
    Integer ServerIdSortOrder = DataHelper.getSortOrder(ServerIdMap);
    if (ServerIdFetch != null) out.setServerIdFetch(ServerIdFetch);
    if (ServerIdSortDir != null) out.setServerIdSortDirection(ServerIdSortDir);
    if (ServerIdSortOrder != null) out.setServerIdSortOrder(ServerIdSortOrder);

    Filter[] ServerIdFilter = DataHelper.mapToFilterArray(ServerIdMap, Integer.class);
    if (ServerIdFilter != null) {
      IntegerFilter[] ServerIdFilters = new IntegerFilter[ServerIdFilter.length];
      for (int i = 0; i < ServerIdFilters.length; i++) {
        ServerIdFilters[i] = (IntegerFilter)ServerIdFilter[i];
      }
      try {
        out.setServerIdFilter(ServerIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AcctSegIdMap = (Map)record.get("AcctSegId");
    Boolean AcctSegIdFetch = DataHelper.getFetch(AcctSegIdMap);
    Boolean AcctSegIdSortDir = DataHelper.getSortDirection(AcctSegIdMap);
    Integer AcctSegIdSortOrder = DataHelper.getSortOrder(AcctSegIdMap);
    if (AcctSegIdFetch != null) out.setAcctSegIdFetch(AcctSegIdFetch);
    if (AcctSegIdSortDir != null) out.setAcctSegIdSortDirection(AcctSegIdSortDir);
    if (AcctSegIdSortOrder != null) out.setAcctSegIdSortOrder(AcctSegIdSortOrder);

    Filter[] AcctSegIdFilter = DataHelper.mapToFilterArray(AcctSegIdMap, Integer.class);
    if (AcctSegIdFilter != null) {
      IntegerFilter[] AcctSegIdFilters = new IntegerFilter[AcctSegIdFilter.length];
      for (int i = 0; i < AcctSegIdFilters.length; i++) {
        AcctSegIdFilters[i] = (IntegerFilter)AcctSegIdFilter[i];
      }
      try {
        out.setAcctSegIdFilter(AcctSegIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltLnameMap = (Map)record.get("AltLname");
    Boolean AltLnameFetch = DataHelper.getFetch(AltLnameMap);
    Boolean AltLnameSortDir = DataHelper.getSortDirection(AltLnameMap);
    Integer AltLnameSortOrder = DataHelper.getSortOrder(AltLnameMap);
    if (AltLnameFetch != null) out.setAltLnameFetch(AltLnameFetch);
    if (AltLnameSortDir != null) out.setAltLnameSortDirection(AltLnameSortDir);
    if (AltLnameSortOrder != null) out.setAltLnameSortOrder(AltLnameSortOrder);

    Filter[] AltLnameFilter = DataHelper.mapToFilterArray(AltLnameMap, String.class);
    if (AltLnameFilter != null) {
      StringFilter[] AltLnameFilters = new StringFilter[AltLnameFilter.length];
      for (int i = 0; i < AltLnameFilters.length; i++) {
        AltLnameFilters[i] = (StringFilter)AltLnameFilter[i];
      }
      try {
        out.setAltLnameFilter(AltLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltFnameMap = (Map)record.get("AltFname");
    Boolean AltFnameFetch = DataHelper.getFetch(AltFnameMap);
    Boolean AltFnameSortDir = DataHelper.getSortDirection(AltFnameMap);
    Integer AltFnameSortOrder = DataHelper.getSortOrder(AltFnameMap);
    if (AltFnameFetch != null) out.setAltFnameFetch(AltFnameFetch);
    if (AltFnameSortDir != null) out.setAltFnameSortDirection(AltFnameSortDir);
    if (AltFnameSortOrder != null) out.setAltFnameSortOrder(AltFnameSortOrder);

    Filter[] AltFnameFilter = DataHelper.mapToFilterArray(AltFnameMap, String.class);
    if (AltFnameFilter != null) {
      StringFilter[] AltFnameFilters = new StringFilter[AltFnameFilter.length];
      for (int i = 0; i < AltFnameFilters.length; i++) {
        AltFnameFilters[i] = (StringFilter)AltFnameFilter[i];
      }
      try {
        out.setAltFnameFilter(AltFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltCompanyNameMap = (Map)record.get("AltCompanyName");
    Boolean AltCompanyNameFetch = DataHelper.getFetch(AltCompanyNameMap);
    Boolean AltCompanyNameSortDir = DataHelper.getSortDirection(AltCompanyNameMap);
    Integer AltCompanyNameSortOrder = DataHelper.getSortOrder(AltCompanyNameMap);
    if (AltCompanyNameFetch != null) out.setAltCompanyNameFetch(AltCompanyNameFetch);
    if (AltCompanyNameSortDir != null) out.setAltCompanyNameSortDirection(AltCompanyNameSortDir);
    if (AltCompanyNameSortOrder != null) out.setAltCompanyNameSortOrder(AltCompanyNameSortOrder);

    Filter[] AltCompanyNameFilter = DataHelper.mapToFilterArray(AltCompanyNameMap, String.class);
    if (AltCompanyNameFilter != null) {
      StringFilter[] AltCompanyNameFilters = new StringFilter[AltCompanyNameFilter.length];
      for (int i = 0; i < AltCompanyNameFilters.length; i++) {
        AltCompanyNameFilters[i] = (StringFilter)AltCompanyNameFilter[i];
      }
      try {
        out.setAltCompanyNameFilter(AltCompanyNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateActiveMap = (Map)record.get("DateActive");
    Boolean DateActiveFetch = DataHelper.getFetch(DateActiveMap);
    Boolean DateActiveSortDir = DataHelper.getSortDirection(DateActiveMap);
    Integer DateActiveSortOrder = DataHelper.getSortOrder(DateActiveMap);
    if (DateActiveFetch != null) out.setDateActiveFetch(DateActiveFetch);
    if (DateActiveSortDir != null) out.setDateActiveSortDirection(DateActiveSortDir);
    if (DateActiveSortOrder != null) out.setDateActiveSortOrder(DateActiveSortOrder);

    Filter[] DateActiveFilter = DataHelper.mapToFilterArray(DateActiveMap, Date.class);
    if (DateActiveFilter != null) {
      DateFilter[] DateActiveFilters = new DateFilter[DateActiveFilter.length];
      for (int i = 0; i < DateActiveFilters.length; i++) {
        DateActiveFilters[i] = (DateFilter)DateActiveFilter[i];
      }
      try {
        out.setDateActiveFilter(DateActiveFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DateInactiveMap = (Map)record.get("DateInactive");
    Boolean DateInactiveFetch = DataHelper.getFetch(DateInactiveMap);
    Boolean DateInactiveSortDir = DataHelper.getSortDirection(DateInactiveMap);
    Integer DateInactiveSortOrder = DataHelper.getSortOrder(DateInactiveMap);
    if (DateInactiveFetch != null) out.setDateInactiveFetch(DateInactiveFetch);
    if (DateInactiveSortDir != null) out.setDateInactiveSortDirection(DateInactiveSortDir);
    if (DateInactiveSortOrder != null) out.setDateInactiveSortOrder(DateInactiveSortOrder);

    Filter[] DateInactiveFilter = DataHelper.mapToFilterArray(DateInactiveMap, Date.class);
    if (DateInactiveFilter != null) {
      DateFilter[] DateInactiveFilters = new DateFilter[DateInactiveFilter.length];
      for (int i = 0; i < DateInactiveFilters.length; i++) {
        DateInactiveFilters[i] = (DateFilter)DateInactiveFilter[i];
      }
      try {
        out.setDateInactiveFilter(DateInactiveFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustomerLifetimeIdMap = (Map)record.get("CustomerLifetimeId");
    Boolean CustomerLifetimeIdFetch = DataHelper.getFetch(CustomerLifetimeIdMap);
    Boolean CustomerLifetimeIdSortDir = DataHelper.getSortDirection(CustomerLifetimeIdMap);
    Integer CustomerLifetimeIdSortOrder = DataHelper.getSortOrder(CustomerLifetimeIdMap);
    if (CustomerLifetimeIdFetch != null) out.setCustomerLifetimeIdFetch(CustomerLifetimeIdFetch);
    if (CustomerLifetimeIdSortDir != null) out.setCustomerLifetimeIdSortDirection(CustomerLifetimeIdSortDir);
    if (CustomerLifetimeIdSortOrder != null) out.setCustomerLifetimeIdSortOrder(CustomerLifetimeIdSortOrder);

    Filter[] CustomerLifetimeIdFilter = DataHelper.mapToFilterArray(CustomerLifetimeIdMap, Integer.class);
    if (CustomerLifetimeIdFilter != null) {
      IntegerFilter[] CustomerLifetimeIdFilters = new IntegerFilter[CustomerLifetimeIdFilter.length];
      for (int i = 0; i < CustomerLifetimeIdFilters.length; i++) {
        CustomerLifetimeIdFilters[i] = (IntegerFilter)CustomerLifetimeIdFilter[i];
      }
      try {
        out.setCustomerLifetimeIdFilter(CustomerLifetimeIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustomerLifetimeId2Map = (Map)record.get("CustomerLifetimeId2");
    Boolean CustomerLifetimeId2Fetch = DataHelper.getFetch(CustomerLifetimeId2Map);
    Boolean CustomerLifetimeId2SortDir = DataHelper.getSortDirection(CustomerLifetimeId2Map);
    Integer CustomerLifetimeId2SortOrder = DataHelper.getSortOrder(CustomerLifetimeId2Map);
    if (CustomerLifetimeId2Fetch != null) out.setCustomerLifetimeId2Fetch(CustomerLifetimeId2Fetch);
    if (CustomerLifetimeId2SortDir != null) out.setCustomerLifetimeId2SortDirection(CustomerLifetimeId2SortDir);
    if (CustomerLifetimeId2SortOrder != null) out.setCustomerLifetimeId2SortOrder(CustomerLifetimeId2SortOrder);

    Filter[] CustomerLifetimeId2Filter = DataHelper.mapToFilterArray(CustomerLifetimeId2Map, Integer.class);
    if (CustomerLifetimeId2Filter != null) {
      IntegerFilter[] CustomerLifetimeId2Filters = new IntegerFilter[CustomerLifetimeId2Filter.length];
      for (int i = 0; i < CustomerLifetimeId2Filters.length; i++) {
        CustomerLifetimeId2Filters[i] = (IntegerFilter)CustomerLifetimeId2Filter[i];
      }
      try {
        out.setCustomerLifetimeId2Filter(CustomerLifetimeId2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
