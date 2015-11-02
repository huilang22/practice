/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SalesChannelObjectHelper.java
 * Definition File: Admin/SalesChannel.xml
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



/** Helper class to convert SalesChannelObject JavaBean objects to/from HashMaps.
 */
public class SalesChannelObjectHelper implements ArubaObjectHelper
{
  /** convert SalesChannelObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (SalesChannelObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SalesChannelObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SalesChannelObject")
   * @return Map     the output Map
   */
  public static Map toMap (SalesChannelObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SalesChannelObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert SalesChannelObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (SalesChannelObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert SalesChannelObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "SalesChannelObject")
   * @return Map     the output Map
   */
  public static Map toMap (SalesChannelObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "SalesChannelObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to SalesChannelObjectData.
   * @param record the Map containing the data to convert to the object
   * @return SalesChannelObjectData the converted object
   */
  public static SalesChannelObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to SalesChannelObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "SalesChannelObject")
   * @return SalesChannelObjectData the converted object
   */
  public static SalesChannelObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SalesChannelObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to SalesChannelObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return SalesChannelObjectFilter the converted object
   */
  public static SalesChannelObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to SalesChannelObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "SalesChannelObject")
   * @return SalesChannelObjectFilter the converted object
   */
  public static SalesChannelObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "SalesChannelObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to SalesChannelObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return SalesChannelObjectDataList the converted object
   */
  public static SalesChannelObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to SalesChannelObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "SalesChannelObjectList")
   * @return SalesChannelObjectDataList the converted object
   */
  public static SalesChannelObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "SalesChannelObjectList";
    Object[] root = (Object[]) record.get (rootName);
    SalesChannelObjectData[] array = null;
    if (root != null)
    {
      array = new SalesChannelObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = SalesChannelObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new SalesChannelObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new SalesChannelObjectDataList (array, index, total);
  }
  /** convert SalesChannelObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SalesChannelObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", SalesChannelObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ScNameSet) record.put ("ScName", in.ScName);
  
    if (in._ScNumberSet) record.put ("ScNumber", in.ScNumber);
  
    if (in._ScContactNamePreSet) record.put ("ScContactNamePre", in.ScContactNamePre);
  
    if (in._ScContactFnameSet) record.put ("ScContactFname", in.ScContactFname);
  
    if (in._ScContactMinitSet) record.put ("ScContactMinit", in.ScContactMinit);
  
    if (in._ScContactLnameSet) record.put ("ScContactLname", in.ScContactLname);
  
    if (in._ScContactNameGenSet) record.put ("ScContactNameGen", in.ScContactNameGen);
  
    if (in._ScAddress1Set) record.put ("ScAddress1", in.ScAddress1);
  
    if (in._ScAddress2Set) record.put ("ScAddress2", in.ScAddress2);
  
    if (in._ScAddress3Set) record.put ("ScAddress3", in.ScAddress3);
  
    if (in._ScCitySet) record.put ("ScCity", in.ScCity);
  
    if (in._ScStateSet) record.put ("ScState", in.ScState);
  
    if (in._ScZipCodeSet) record.put ("ScZipCode", in.ScZipCode);
  
    if (in._ScCountryCodeSet) record.put ("ScCountryCode", in.ScCountryCode);
  
    if (in._ScPhoneSet) record.put ("ScPhone", in.ScPhone);
  
    if (in._ParentSalesChannelIdSet) record.put ("ParentSalesChannelId", in.ParentSalesChannelId);
  
    if (in._CommissionIdSet) record.put ("CommissionId", in.CommissionId);
  
    if (in._DealerPinSet) record.put ("DealerPin", in.DealerPin);
  
    if (in._SecurityWordSet) record.put ("SecurityWord", in.SecurityWord);
  
    if (in._StatusSet) record.put ("Status", in.Status);
  
    if (in._DateActiveSet) record.put ("DateActive", in.DateActive);
  
    if (in._DateInactiveSet) record.put ("DateInactive", in.DateInactive);
  
    if (in._NumThresholdSet) record.put ("NumThreshold", in.NumThreshold);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert SalesChannelObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (SalesChannelObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", SalesChannelObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ScName, in.ScNameSort, in.ScNameSortAscending, in.ScNameFetch, in.ScNameCaseInsensitive);
      if (map != null) record.put ("ScName", map);
      map = DataHelper.filterToMap (in.ScNumber, in.ScNumberSort, in.ScNumberSortAscending, in.ScNumberFetch, in.ScNumberCaseInsensitive);
      if (map != null) record.put ("ScNumber", map);
      map = DataHelper.filterToMap (in.ScContactNamePre, in.ScContactNamePreSort, in.ScContactNamePreSortAscending, in.ScContactNamePreFetch, in.ScContactNamePreCaseInsensitive);
      if (map != null) record.put ("ScContactNamePre", map);
      map = DataHelper.filterToMap (in.ScContactFname, in.ScContactFnameSort, in.ScContactFnameSortAscending, in.ScContactFnameFetch, in.ScContactFnameCaseInsensitive);
      if (map != null) record.put ("ScContactFname", map);
      map = DataHelper.filterToMap (in.ScContactMinit, in.ScContactMinitSort, in.ScContactMinitSortAscending, in.ScContactMinitFetch, in.ScContactMinitCaseInsensitive);
      if (map != null) record.put ("ScContactMinit", map);
      map = DataHelper.filterToMap (in.ScContactLname, in.ScContactLnameSort, in.ScContactLnameSortAscending, in.ScContactLnameFetch, in.ScContactLnameCaseInsensitive);
      if (map != null) record.put ("ScContactLname", map);
      map = DataHelper.filterToMap (in.ScContactNameGen, in.ScContactNameGenSort, in.ScContactNameGenSortAscending, in.ScContactNameGenFetch, in.ScContactNameGenCaseInsensitive);
      if (map != null) record.put ("ScContactNameGen", map);
      map = DataHelper.filterToMap (in.ScAddress1, in.ScAddress1Sort, in.ScAddress1SortAscending, in.ScAddress1Fetch, in.ScAddress1CaseInsensitive);
      if (map != null) record.put ("ScAddress1", map);
      map = DataHelper.filterToMap (in.ScAddress2, in.ScAddress2Sort, in.ScAddress2SortAscending, in.ScAddress2Fetch, in.ScAddress2CaseInsensitive);
      if (map != null) record.put ("ScAddress2", map);
      map = DataHelper.filterToMap (in.ScAddress3, in.ScAddress3Sort, in.ScAddress3SortAscending, in.ScAddress3Fetch, in.ScAddress3CaseInsensitive);
      if (map != null) record.put ("ScAddress3", map);
      map = DataHelper.filterToMap (in.ScCity, in.ScCitySort, in.ScCitySortAscending, in.ScCityFetch, in.ScCityCaseInsensitive);
      if (map != null) record.put ("ScCity", map);
      map = DataHelper.filterToMap (in.ScState, in.ScStateSort, in.ScStateSortAscending, in.ScStateFetch, in.ScStateCaseInsensitive);
      if (map != null) record.put ("ScState", map);
      map = DataHelper.filterToMap (in.ScZipCode, in.ScZipCodeSort, in.ScZipCodeSortAscending, in.ScZipCodeFetch, in.ScZipCodeCaseInsensitive);
      if (map != null) record.put ("ScZipCode", map);
      map = DataHelper.filterToMap (in.ScCountryCode, in.ScCountryCodeSort, in.ScCountryCodeSortAscending, in.ScCountryCodeFetch);
      if (map != null) record.put ("ScCountryCode", map);
      map = DataHelper.filterToMap (in.ScPhone, in.ScPhoneSort, in.ScPhoneSortAscending, in.ScPhoneFetch, in.ScPhoneCaseInsensitive);
      if (map != null) record.put ("ScPhone", map);
      map = DataHelper.filterToMap (in.ParentSalesChannelId, in.ParentSalesChannelIdSort, in.ParentSalesChannelIdSortAscending, in.ParentSalesChannelIdFetch);
      if (map != null) record.put ("ParentSalesChannelId", map);
      map = DataHelper.filterToMap (in.CommissionId, in.CommissionIdSort, in.CommissionIdSortAscending, in.CommissionIdFetch);
      if (map != null) record.put ("CommissionId", map);
      map = DataHelper.filterToMap (in.DealerPin, in.DealerPinSort, in.DealerPinSortAscending, in.DealerPinFetch, in.DealerPinCaseInsensitive);
      if (map != null) record.put ("DealerPin", map);
      map = DataHelper.filterToMap (in.SecurityWord, in.SecurityWordSort, in.SecurityWordSortAscending, in.SecurityWordFetch, in.SecurityWordCaseInsensitive);
      if (map != null) record.put ("SecurityWord", map);
      map = DataHelper.filterToMap (in.Status, in.StatusSort, in.StatusSortAscending, in.StatusFetch);
      if (map != null) record.put ("Status", map);
      map = DataHelper.filterToMap (in.DateActive, in.DateActiveSort, in.DateActiveSortAscending, in.DateActiveFetch);
      if (map != null) record.put ("DateActive", map);
      map = DataHelper.filterToMap (in.DateInactive, in.DateInactiveSort, in.DateInactiveSortAscending, in.DateInactiveFetch);
      if (map != null) record.put ("DateInactive", map);
      map = DataHelper.filterToMap (in.NumThreshold, in.NumThresholdSort, in.NumThresholdSortAscending, in.NumThresholdFetch);
      if (map != null) record.put ("NumThreshold", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.IsInternal, in.IsInternalSort, in.IsInternalSortAscending, in.IsInternalFetch);
      if (map != null) record.put ("IsInternal", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
      map = DataHelper.filterToMap (in.ShortDisplay, in.ShortDisplaySort, in.ShortDisplaySortAscending, in.ShortDisplayFetch, in.ShortDisplayCaseInsensitive);
      if (map != null) record.put ("ShortDisplay", map);
      map = DataHelper.filterToMap (in.DisplayValue, in.DisplayValueSort, in.DisplayValueSortAscending, in.DisplayValueFetch, in.DisplayValueCaseInsensitive);
      if (map != null) record.put ("DisplayValue", map);
    return record;
  }
  /** convert Map to SalesChannelObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SalesChannelObjectData the converted object
   */
  public static SalesChannelObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SalesChannelObjectData out = new SalesChannelObjectData ();

    out.Key = SalesChannelObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ScName")) != null)
    {
      out.ScName = (String) obj;
    }
  
    if ((obj = record.get ("ScNumber")) != null)
    {
      out.ScNumber = (String) obj;
    }
  
    if ((obj = record.get ("ScContactNamePre")) != null)
    {
      out.ScContactNamePre = (String) obj;
    }
  
    if ((obj = record.get ("ScContactFname")) != null)
    {
      out.ScContactFname = (String) obj;
    }
  
    if ((obj = record.get ("ScContactMinit")) != null)
    {
      out.ScContactMinit = (String) obj;
    }
  
    if ((obj = record.get ("ScContactLname")) != null)
    {
      out.ScContactLname = (String) obj;
    }
  
    if ((obj = record.get ("ScContactNameGen")) != null)
    {
      out.ScContactNameGen = (String) obj;
    }
  
    if ((obj = record.get ("ScAddress1")) != null)
    {
      out.ScAddress1 = (String) obj;
    }
  
    if ((obj = record.get ("ScAddress2")) != null)
    {
      out.ScAddress2 = (String) obj;
    }
  
    if ((obj = record.get ("ScAddress3")) != null)
    {
      out.ScAddress3 = (String) obj;
    }
  
    if ((obj = record.get ("ScCity")) != null)
    {
      out.ScCity = (String) obj;
    }
  
    if ((obj = record.get ("ScState")) != null)
    {
      out.ScState = (String) obj;
    }
  
    if ((obj = record.get ("ScZipCode")) != null)
    {
      out.ScZipCode = (String) obj;
    }
  
    if ((obj = record.get ("ScCountryCode")) != null)
    {
      out.ScCountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ScPhone")) != null)
    {
      out.ScPhone = (String) obj;
    }
  
    if ((obj = record.get ("ParentSalesChannelId")) != null)
    {
      out.ParentSalesChannelId = (Integer) obj;
    }
  
    if ((obj = record.get ("CommissionId")) != null)
    {
      out.CommissionId = (Integer) obj;
    }
  
    if ((obj = record.get ("DealerPin")) != null)
    {
      out.DealerPin = (String) obj;
    }
  
    if ((obj = record.get ("SecurityWord")) != null)
    {
      out.SecurityWord = (String) obj;
    }
  
    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (Integer) obj;
    }
  
    if ((obj = record.get ("DateActive")) != null)
    {
      out.DateActive = (Date) obj;
    }
  
    if ((obj = record.get ("DateInactive")) != null)
    {
      out.DateInactive = (Date) obj;
    }
  
    if ((obj = record.get ("NumThreshold")) != null)
    {
      out.NumThreshold = (Integer) obj;
    }
  
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsInternal")) != null)
    {
      out.IsInternal = (Boolean) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
  
    if ((obj = record.get ("ShortDisplay")) != null)
    {
      out.ShortDisplay = (String) obj;
    }
  
    if ((obj = record.get ("DisplayValue")) != null)
    {
      out.DisplayValue = (String) obj;
    }
      return out;
  }
  /** convert Map to SalesChannelObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return SalesChannelObjectFilter the converted object
   */
  public static SalesChannelObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    SalesChannelObjectFilter out = new SalesChannelObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = SalesChannelObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map ScNameMap = (Map)record.get("ScName");
    Boolean ScNameFetch = DataHelper.getFetch(ScNameMap);
    Boolean ScNameSortDir = DataHelper.getSortDirection(ScNameMap);
    Integer ScNameSortOrder = DataHelper.getSortOrder(ScNameMap);
    if (ScNameFetch != null) out.setScNameFetch(ScNameFetch);
    if (ScNameSortDir != null) out.setScNameSortDirection(ScNameSortDir);
    if (ScNameSortOrder != null) out.setScNameSortOrder(ScNameSortOrder);

    Filter[] ScNameFilter = DataHelper.mapToFilterArray(ScNameMap, String.class);
    if (ScNameFilter != null) {
      StringFilter[] ScNameFilters = new StringFilter[ScNameFilter.length];
      for (int i = 0; i < ScNameFilters.length; i++) {
        ScNameFilters[i] = (StringFilter)ScNameFilter[i];
      }
      try {
        out.setScNameFilter(ScNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScNumberMap = (Map)record.get("ScNumber");
    Boolean ScNumberFetch = DataHelper.getFetch(ScNumberMap);
    Boolean ScNumberSortDir = DataHelper.getSortDirection(ScNumberMap);
    Integer ScNumberSortOrder = DataHelper.getSortOrder(ScNumberMap);
    if (ScNumberFetch != null) out.setScNumberFetch(ScNumberFetch);
    if (ScNumberSortDir != null) out.setScNumberSortDirection(ScNumberSortDir);
    if (ScNumberSortOrder != null) out.setScNumberSortOrder(ScNumberSortOrder);

    Filter[] ScNumberFilter = DataHelper.mapToFilterArray(ScNumberMap, String.class);
    if (ScNumberFilter != null) {
      StringFilter[] ScNumberFilters = new StringFilter[ScNumberFilter.length];
      for (int i = 0; i < ScNumberFilters.length; i++) {
        ScNumberFilters[i] = (StringFilter)ScNumberFilter[i];
      }
      try {
        out.setScNumberFilter(ScNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScContactNamePreMap = (Map)record.get("ScContactNamePre");
    Boolean ScContactNamePreFetch = DataHelper.getFetch(ScContactNamePreMap);
    Boolean ScContactNamePreSortDir = DataHelper.getSortDirection(ScContactNamePreMap);
    Integer ScContactNamePreSortOrder = DataHelper.getSortOrder(ScContactNamePreMap);
    if (ScContactNamePreFetch != null) out.setScContactNamePreFetch(ScContactNamePreFetch);
    if (ScContactNamePreSortDir != null) out.setScContactNamePreSortDirection(ScContactNamePreSortDir);
    if (ScContactNamePreSortOrder != null) out.setScContactNamePreSortOrder(ScContactNamePreSortOrder);

    Filter[] ScContactNamePreFilter = DataHelper.mapToFilterArray(ScContactNamePreMap, String.class);
    if (ScContactNamePreFilter != null) {
      StringFilter[] ScContactNamePreFilters = new StringFilter[ScContactNamePreFilter.length];
      for (int i = 0; i < ScContactNamePreFilters.length; i++) {
        ScContactNamePreFilters[i] = (StringFilter)ScContactNamePreFilter[i];
      }
      try {
        out.setScContactNamePreFilter(ScContactNamePreFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScContactFnameMap = (Map)record.get("ScContactFname");
    Boolean ScContactFnameFetch = DataHelper.getFetch(ScContactFnameMap);
    Boolean ScContactFnameSortDir = DataHelper.getSortDirection(ScContactFnameMap);
    Integer ScContactFnameSortOrder = DataHelper.getSortOrder(ScContactFnameMap);
    if (ScContactFnameFetch != null) out.setScContactFnameFetch(ScContactFnameFetch);
    if (ScContactFnameSortDir != null) out.setScContactFnameSortDirection(ScContactFnameSortDir);
    if (ScContactFnameSortOrder != null) out.setScContactFnameSortOrder(ScContactFnameSortOrder);

    Filter[] ScContactFnameFilter = DataHelper.mapToFilterArray(ScContactFnameMap, String.class);
    if (ScContactFnameFilter != null) {
      StringFilter[] ScContactFnameFilters = new StringFilter[ScContactFnameFilter.length];
      for (int i = 0; i < ScContactFnameFilters.length; i++) {
        ScContactFnameFilters[i] = (StringFilter)ScContactFnameFilter[i];
      }
      try {
        out.setScContactFnameFilter(ScContactFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScContactMinitMap = (Map)record.get("ScContactMinit");
    Boolean ScContactMinitFetch = DataHelper.getFetch(ScContactMinitMap);
    Boolean ScContactMinitSortDir = DataHelper.getSortDirection(ScContactMinitMap);
    Integer ScContactMinitSortOrder = DataHelper.getSortOrder(ScContactMinitMap);
    if (ScContactMinitFetch != null) out.setScContactMinitFetch(ScContactMinitFetch);
    if (ScContactMinitSortDir != null) out.setScContactMinitSortDirection(ScContactMinitSortDir);
    if (ScContactMinitSortOrder != null) out.setScContactMinitSortOrder(ScContactMinitSortOrder);

    Filter[] ScContactMinitFilter = DataHelper.mapToFilterArray(ScContactMinitMap, String.class);
    if (ScContactMinitFilter != null) {
      StringFilter[] ScContactMinitFilters = new StringFilter[ScContactMinitFilter.length];
      for (int i = 0; i < ScContactMinitFilters.length; i++) {
        ScContactMinitFilters[i] = (StringFilter)ScContactMinitFilter[i];
      }
      try {
        out.setScContactMinitFilter(ScContactMinitFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScContactLnameMap = (Map)record.get("ScContactLname");
    Boolean ScContactLnameFetch = DataHelper.getFetch(ScContactLnameMap);
    Boolean ScContactLnameSortDir = DataHelper.getSortDirection(ScContactLnameMap);
    Integer ScContactLnameSortOrder = DataHelper.getSortOrder(ScContactLnameMap);
    if (ScContactLnameFetch != null) out.setScContactLnameFetch(ScContactLnameFetch);
    if (ScContactLnameSortDir != null) out.setScContactLnameSortDirection(ScContactLnameSortDir);
    if (ScContactLnameSortOrder != null) out.setScContactLnameSortOrder(ScContactLnameSortOrder);

    Filter[] ScContactLnameFilter = DataHelper.mapToFilterArray(ScContactLnameMap, String.class);
    if (ScContactLnameFilter != null) {
      StringFilter[] ScContactLnameFilters = new StringFilter[ScContactLnameFilter.length];
      for (int i = 0; i < ScContactLnameFilters.length; i++) {
        ScContactLnameFilters[i] = (StringFilter)ScContactLnameFilter[i];
      }
      try {
        out.setScContactLnameFilter(ScContactLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScContactNameGenMap = (Map)record.get("ScContactNameGen");
    Boolean ScContactNameGenFetch = DataHelper.getFetch(ScContactNameGenMap);
    Boolean ScContactNameGenSortDir = DataHelper.getSortDirection(ScContactNameGenMap);
    Integer ScContactNameGenSortOrder = DataHelper.getSortOrder(ScContactNameGenMap);
    if (ScContactNameGenFetch != null) out.setScContactNameGenFetch(ScContactNameGenFetch);
    if (ScContactNameGenSortDir != null) out.setScContactNameGenSortDirection(ScContactNameGenSortDir);
    if (ScContactNameGenSortOrder != null) out.setScContactNameGenSortOrder(ScContactNameGenSortOrder);

    Filter[] ScContactNameGenFilter = DataHelper.mapToFilterArray(ScContactNameGenMap, String.class);
    if (ScContactNameGenFilter != null) {
      StringFilter[] ScContactNameGenFilters = new StringFilter[ScContactNameGenFilter.length];
      for (int i = 0; i < ScContactNameGenFilters.length; i++) {
        ScContactNameGenFilters[i] = (StringFilter)ScContactNameGenFilter[i];
      }
      try {
        out.setScContactNameGenFilter(ScContactNameGenFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScAddress1Map = (Map)record.get("ScAddress1");
    Boolean ScAddress1Fetch = DataHelper.getFetch(ScAddress1Map);
    Boolean ScAddress1SortDir = DataHelper.getSortDirection(ScAddress1Map);
    Integer ScAddress1SortOrder = DataHelper.getSortOrder(ScAddress1Map);
    if (ScAddress1Fetch != null) out.setScAddress1Fetch(ScAddress1Fetch);
    if (ScAddress1SortDir != null) out.setScAddress1SortDirection(ScAddress1SortDir);
    if (ScAddress1SortOrder != null) out.setScAddress1SortOrder(ScAddress1SortOrder);

    Filter[] ScAddress1Filter = DataHelper.mapToFilterArray(ScAddress1Map, String.class);
    if (ScAddress1Filter != null) {
      StringFilter[] ScAddress1Filters = new StringFilter[ScAddress1Filter.length];
      for (int i = 0; i < ScAddress1Filters.length; i++) {
        ScAddress1Filters[i] = (StringFilter)ScAddress1Filter[i];
      }
      try {
        out.setScAddress1Filter(ScAddress1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScAddress2Map = (Map)record.get("ScAddress2");
    Boolean ScAddress2Fetch = DataHelper.getFetch(ScAddress2Map);
    Boolean ScAddress2SortDir = DataHelper.getSortDirection(ScAddress2Map);
    Integer ScAddress2SortOrder = DataHelper.getSortOrder(ScAddress2Map);
    if (ScAddress2Fetch != null) out.setScAddress2Fetch(ScAddress2Fetch);
    if (ScAddress2SortDir != null) out.setScAddress2SortDirection(ScAddress2SortDir);
    if (ScAddress2SortOrder != null) out.setScAddress2SortOrder(ScAddress2SortOrder);

    Filter[] ScAddress2Filter = DataHelper.mapToFilterArray(ScAddress2Map, String.class);
    if (ScAddress2Filter != null) {
      StringFilter[] ScAddress2Filters = new StringFilter[ScAddress2Filter.length];
      for (int i = 0; i < ScAddress2Filters.length; i++) {
        ScAddress2Filters[i] = (StringFilter)ScAddress2Filter[i];
      }
      try {
        out.setScAddress2Filter(ScAddress2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScAddress3Map = (Map)record.get("ScAddress3");
    Boolean ScAddress3Fetch = DataHelper.getFetch(ScAddress3Map);
    Boolean ScAddress3SortDir = DataHelper.getSortDirection(ScAddress3Map);
    Integer ScAddress3SortOrder = DataHelper.getSortOrder(ScAddress3Map);
    if (ScAddress3Fetch != null) out.setScAddress3Fetch(ScAddress3Fetch);
    if (ScAddress3SortDir != null) out.setScAddress3SortDirection(ScAddress3SortDir);
    if (ScAddress3SortOrder != null) out.setScAddress3SortOrder(ScAddress3SortOrder);

    Filter[] ScAddress3Filter = DataHelper.mapToFilterArray(ScAddress3Map, String.class);
    if (ScAddress3Filter != null) {
      StringFilter[] ScAddress3Filters = new StringFilter[ScAddress3Filter.length];
      for (int i = 0; i < ScAddress3Filters.length; i++) {
        ScAddress3Filters[i] = (StringFilter)ScAddress3Filter[i];
      }
      try {
        out.setScAddress3Filter(ScAddress3Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScCityMap = (Map)record.get("ScCity");
    Boolean ScCityFetch = DataHelper.getFetch(ScCityMap);
    Boolean ScCitySortDir = DataHelper.getSortDirection(ScCityMap);
    Integer ScCitySortOrder = DataHelper.getSortOrder(ScCityMap);
    if (ScCityFetch != null) out.setScCityFetch(ScCityFetch);
    if (ScCitySortDir != null) out.setScCitySortDirection(ScCitySortDir);
    if (ScCitySortOrder != null) out.setScCitySortOrder(ScCitySortOrder);

    Filter[] ScCityFilter = DataHelper.mapToFilterArray(ScCityMap, String.class);
    if (ScCityFilter != null) {
      StringFilter[] ScCityFilters = new StringFilter[ScCityFilter.length];
      for (int i = 0; i < ScCityFilters.length; i++) {
        ScCityFilters[i] = (StringFilter)ScCityFilter[i];
      }
      try {
        out.setScCityFilter(ScCityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScStateMap = (Map)record.get("ScState");
    Boolean ScStateFetch = DataHelper.getFetch(ScStateMap);
    Boolean ScStateSortDir = DataHelper.getSortDirection(ScStateMap);
    Integer ScStateSortOrder = DataHelper.getSortOrder(ScStateMap);
    if (ScStateFetch != null) out.setScStateFetch(ScStateFetch);
    if (ScStateSortDir != null) out.setScStateSortDirection(ScStateSortDir);
    if (ScStateSortOrder != null) out.setScStateSortOrder(ScStateSortOrder);

    Filter[] ScStateFilter = DataHelper.mapToFilterArray(ScStateMap, String.class);
    if (ScStateFilter != null) {
      StringFilter[] ScStateFilters = new StringFilter[ScStateFilter.length];
      for (int i = 0; i < ScStateFilters.length; i++) {
        ScStateFilters[i] = (StringFilter)ScStateFilter[i];
      }
      try {
        out.setScStateFilter(ScStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScZipCodeMap = (Map)record.get("ScZipCode");
    Boolean ScZipCodeFetch = DataHelper.getFetch(ScZipCodeMap);
    Boolean ScZipCodeSortDir = DataHelper.getSortDirection(ScZipCodeMap);
    Integer ScZipCodeSortOrder = DataHelper.getSortOrder(ScZipCodeMap);
    if (ScZipCodeFetch != null) out.setScZipCodeFetch(ScZipCodeFetch);
    if (ScZipCodeSortDir != null) out.setScZipCodeSortDirection(ScZipCodeSortDir);
    if (ScZipCodeSortOrder != null) out.setScZipCodeSortOrder(ScZipCodeSortOrder);

    Filter[] ScZipCodeFilter = DataHelper.mapToFilterArray(ScZipCodeMap, String.class);
    if (ScZipCodeFilter != null) {
      StringFilter[] ScZipCodeFilters = new StringFilter[ScZipCodeFilter.length];
      for (int i = 0; i < ScZipCodeFilters.length; i++) {
        ScZipCodeFilters[i] = (StringFilter)ScZipCodeFilter[i];
      }
      try {
        out.setScZipCodeFilter(ScZipCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScCountryCodeMap = (Map)record.get("ScCountryCode");
    Boolean ScCountryCodeFetch = DataHelper.getFetch(ScCountryCodeMap);
    Boolean ScCountryCodeSortDir = DataHelper.getSortDirection(ScCountryCodeMap);
    Integer ScCountryCodeSortOrder = DataHelper.getSortOrder(ScCountryCodeMap);
    if (ScCountryCodeFetch != null) out.setScCountryCodeFetch(ScCountryCodeFetch);
    if (ScCountryCodeSortDir != null) out.setScCountryCodeSortDirection(ScCountryCodeSortDir);
    if (ScCountryCodeSortOrder != null) out.setScCountryCodeSortOrder(ScCountryCodeSortOrder);

    Filter[] ScCountryCodeFilter = DataHelper.mapToFilterArray(ScCountryCodeMap, Integer.class);
    if (ScCountryCodeFilter != null) {
      IntegerFilter[] ScCountryCodeFilters = new IntegerFilter[ScCountryCodeFilter.length];
      for (int i = 0; i < ScCountryCodeFilters.length; i++) {
        ScCountryCodeFilters[i] = (IntegerFilter)ScCountryCodeFilter[i];
      }
      try {
        out.setScCountryCodeFilter(ScCountryCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ScPhoneMap = (Map)record.get("ScPhone");
    Boolean ScPhoneFetch = DataHelper.getFetch(ScPhoneMap);
    Boolean ScPhoneSortDir = DataHelper.getSortDirection(ScPhoneMap);
    Integer ScPhoneSortOrder = DataHelper.getSortOrder(ScPhoneMap);
    if (ScPhoneFetch != null) out.setScPhoneFetch(ScPhoneFetch);
    if (ScPhoneSortDir != null) out.setScPhoneSortDirection(ScPhoneSortDir);
    if (ScPhoneSortOrder != null) out.setScPhoneSortOrder(ScPhoneSortOrder);

    Filter[] ScPhoneFilter = DataHelper.mapToFilterArray(ScPhoneMap, String.class);
    if (ScPhoneFilter != null) {
      StringFilter[] ScPhoneFilters = new StringFilter[ScPhoneFilter.length];
      for (int i = 0; i < ScPhoneFilters.length; i++) {
        ScPhoneFilters[i] = (StringFilter)ScPhoneFilter[i];
      }
      try {
        out.setScPhoneFilter(ScPhoneFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ParentSalesChannelIdMap = (Map)record.get("ParentSalesChannelId");
    Boolean ParentSalesChannelIdFetch = DataHelper.getFetch(ParentSalesChannelIdMap);
    Boolean ParentSalesChannelIdSortDir = DataHelper.getSortDirection(ParentSalesChannelIdMap);
    Integer ParentSalesChannelIdSortOrder = DataHelper.getSortOrder(ParentSalesChannelIdMap);
    if (ParentSalesChannelIdFetch != null) out.setParentSalesChannelIdFetch(ParentSalesChannelIdFetch);
    if (ParentSalesChannelIdSortDir != null) out.setParentSalesChannelIdSortDirection(ParentSalesChannelIdSortDir);
    if (ParentSalesChannelIdSortOrder != null) out.setParentSalesChannelIdSortOrder(ParentSalesChannelIdSortOrder);

    Filter[] ParentSalesChannelIdFilter = DataHelper.mapToFilterArray(ParentSalesChannelIdMap, Integer.class);
    if (ParentSalesChannelIdFilter != null) {
      IntegerFilter[] ParentSalesChannelIdFilters = new IntegerFilter[ParentSalesChannelIdFilter.length];
      for (int i = 0; i < ParentSalesChannelIdFilters.length; i++) {
        ParentSalesChannelIdFilters[i] = (IntegerFilter)ParentSalesChannelIdFilter[i];
      }
      try {
        out.setParentSalesChannelIdFilter(ParentSalesChannelIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CommissionIdMap = (Map)record.get("CommissionId");
    Boolean CommissionIdFetch = DataHelper.getFetch(CommissionIdMap);
    Boolean CommissionIdSortDir = DataHelper.getSortDirection(CommissionIdMap);
    Integer CommissionIdSortOrder = DataHelper.getSortOrder(CommissionIdMap);
    if (CommissionIdFetch != null) out.setCommissionIdFetch(CommissionIdFetch);
    if (CommissionIdSortDir != null) out.setCommissionIdSortDirection(CommissionIdSortDir);
    if (CommissionIdSortOrder != null) out.setCommissionIdSortOrder(CommissionIdSortOrder);

    Filter[] CommissionIdFilter = DataHelper.mapToFilterArray(CommissionIdMap, Integer.class);
    if (CommissionIdFilter != null) {
      IntegerFilter[] CommissionIdFilters = new IntegerFilter[CommissionIdFilter.length];
      for (int i = 0; i < CommissionIdFilters.length; i++) {
        CommissionIdFilters[i] = (IntegerFilter)CommissionIdFilter[i];
      }
      try {
        out.setCommissionIdFilter(CommissionIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DealerPinMap = (Map)record.get("DealerPin");
    Boolean DealerPinFetch = DataHelper.getFetch(DealerPinMap);
    Boolean DealerPinSortDir = DataHelper.getSortDirection(DealerPinMap);
    Integer DealerPinSortOrder = DataHelper.getSortOrder(DealerPinMap);
    if (DealerPinFetch != null) out.setDealerPinFetch(DealerPinFetch);
    if (DealerPinSortDir != null) out.setDealerPinSortDirection(DealerPinSortDir);
    if (DealerPinSortOrder != null) out.setDealerPinSortOrder(DealerPinSortOrder);

    Filter[] DealerPinFilter = DataHelper.mapToFilterArray(DealerPinMap, String.class);
    if (DealerPinFilter != null) {
      StringFilter[] DealerPinFilters = new StringFilter[DealerPinFilter.length];
      for (int i = 0; i < DealerPinFilters.length; i++) {
        DealerPinFilters[i] = (StringFilter)DealerPinFilter[i];
      }
      try {
        out.setDealerPinFilter(DealerPinFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SecurityWordMap = (Map)record.get("SecurityWord");
    Boolean SecurityWordFetch = DataHelper.getFetch(SecurityWordMap);
    Boolean SecurityWordSortDir = DataHelper.getSortDirection(SecurityWordMap);
    Integer SecurityWordSortOrder = DataHelper.getSortOrder(SecurityWordMap);
    if (SecurityWordFetch != null) out.setSecurityWordFetch(SecurityWordFetch);
    if (SecurityWordSortDir != null) out.setSecurityWordSortDirection(SecurityWordSortDir);
    if (SecurityWordSortOrder != null) out.setSecurityWordSortOrder(SecurityWordSortOrder);

    Filter[] SecurityWordFilter = DataHelper.mapToFilterArray(SecurityWordMap, String.class);
    if (SecurityWordFilter != null) {
      StringFilter[] SecurityWordFilters = new StringFilter[SecurityWordFilter.length];
      for (int i = 0; i < SecurityWordFilters.length; i++) {
        SecurityWordFilters[i] = (StringFilter)SecurityWordFilter[i];
      }
      try {
        out.setSecurityWordFilter(SecurityWordFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatusMap = (Map)record.get("Status");
    Boolean StatusFetch = DataHelper.getFetch(StatusMap);
    Boolean StatusSortDir = DataHelper.getSortDirection(StatusMap);
    Integer StatusSortOrder = DataHelper.getSortOrder(StatusMap);
    if (StatusFetch != null) out.setStatusFetch(StatusFetch);
    if (StatusSortDir != null) out.setStatusSortDirection(StatusSortDir);
    if (StatusSortOrder != null) out.setStatusSortOrder(StatusSortOrder);

    Filter[] StatusFilter = DataHelper.mapToFilterArray(StatusMap, Integer.class);
    if (StatusFilter != null) {
      IntegerFilter[] StatusFilters = new IntegerFilter[StatusFilter.length];
      for (int i = 0; i < StatusFilters.length; i++) {
        StatusFilters[i] = (IntegerFilter)StatusFilter[i];
      }
      try {
        out.setStatusFilter(StatusFilters);
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
  
    Map NumThresholdMap = (Map)record.get("NumThreshold");
    Boolean NumThresholdFetch = DataHelper.getFetch(NumThresholdMap);
    Boolean NumThresholdSortDir = DataHelper.getSortDirection(NumThresholdMap);
    Integer NumThresholdSortOrder = DataHelper.getSortOrder(NumThresholdMap);
    if (NumThresholdFetch != null) out.setNumThresholdFetch(NumThresholdFetch);
    if (NumThresholdSortDir != null) out.setNumThresholdSortDirection(NumThresholdSortDir);
    if (NumThresholdSortOrder != null) out.setNumThresholdSortOrder(NumThresholdSortOrder);

    Filter[] NumThresholdFilter = DataHelper.mapToFilterArray(NumThresholdMap, Integer.class);
    if (NumThresholdFilter != null) {
      IntegerFilter[] NumThresholdFilters = new IntegerFilter[NumThresholdFilter.length];
      for (int i = 0; i < NumThresholdFilters.length; i++) {
        NumThresholdFilters[i] = (IntegerFilter)NumThresholdFilter[i];
      }
      try {
        out.setNumThresholdFilter(NumThresholdFilters);
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
  
    Map ConfigTagIdMap = (Map)record.get("ConfigTagId");
    Boolean ConfigTagIdFetch = DataHelper.getFetch(ConfigTagIdMap);
    Boolean ConfigTagIdSortDir = DataHelper.getSortDirection(ConfigTagIdMap);
    Integer ConfigTagIdSortOrder = DataHelper.getSortOrder(ConfigTagIdMap);
    if (ConfigTagIdFetch != null) out.setConfigTagIdFetch(ConfigTagIdFetch);
    if (ConfigTagIdSortDir != null) out.setConfigTagIdSortDirection(ConfigTagIdSortDir);
    if (ConfigTagIdSortOrder != null) out.setConfigTagIdSortOrder(ConfigTagIdSortOrder);

    Filter[] ConfigTagIdFilter = DataHelper.mapToFilterArray(ConfigTagIdMap, String.class);
    if (ConfigTagIdFilter != null) {
      StringFilter[] ConfigTagIdFilters = new StringFilter[ConfigTagIdFilter.length];
      for (int i = 0; i < ConfigTagIdFilters.length; i++) {
        ConfigTagIdFilters[i] = (StringFilter)ConfigTagIdFilter[i];
      }
      try {
        out.setConfigTagIdFilter(ConfigTagIdFilters);
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
  
    return out;
  }
}
