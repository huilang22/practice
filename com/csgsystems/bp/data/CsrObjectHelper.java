/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CsrObjectHelper.java
 * Definition File: Admin/Csr.xml
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



/** Helper class to convert CsrObject JavaBean objects to/from HashMaps.
 */
public class CsrObjectHelper implements ArubaObjectHelper
{
  /** convert CsrObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (CsrObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert CsrObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (CsrObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert CsrObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "CsrObject")
   * @return Map     the output Map
   */
  public static Map toMap (CsrObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "CsrObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to CsrObjectData.
   * @param record the Map containing the data to convert to the object
   * @return CsrObjectData the converted object
   */
  public static CsrObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to CsrObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "CsrObject")
   * @return CsrObjectData the converted object
   */
  public static CsrObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to CsrObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return CsrObjectFilter the converted object
   */
  public static CsrObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to CsrObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "CsrObject")
   * @return CsrObjectFilter the converted object
   */
  public static CsrObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to CsrObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return CsrObjectDataList the converted object
   */
  public static CsrObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to CsrObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "CsrObjectList")
   * @return CsrObjectDataList the converted object
   */
  public static CsrObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "CsrObjectList";
    Object[] root = (Object[]) record.get (rootName);
    CsrObjectData[] array = null;
    if (root != null)
    {
      array = new CsrObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = CsrObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new CsrObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new CsrObjectDataList (array, index, total);
  }
  /** convert CsrObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CsrObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", CsrObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._SupervisorNameSet) record.put ("SupervisorName", in.SupervisorName);
  
    if (in._CsrLnameSet) record.put ("CsrLname", in.CsrLname);
  
    if (in._CsrFnameSet) record.put ("CsrFname", in.CsrFname);
  
    if (in._CsrMinitSet) record.put ("CsrMinit", in.CsrMinit);
  
    if (in._CsrTitleSet) record.put ("CsrTitle", in.CsrTitle);
  
    if (in._CsrPhoneSet) record.put ("CsrPhone", in.CsrPhone);
  
    if (in._CsrEmailSet) record.put ("CsrEmail", in.CsrEmail);
  
    if (in._CsrAddress1Set) record.put ("CsrAddress1", in.CsrAddress1);
  
    if (in._CsrAddress2Set) record.put ("CsrAddress2", in.CsrAddress2);
  
    if (in._CsrAddress3Set) record.put ("CsrAddress3", in.CsrAddress3);
  
    if (in._CsrCitySet) record.put ("CsrCity", in.CsrCity);
  
    if (in._CsrStateSet) record.put ("CsrState", in.CsrState);
  
    if (in._CsrZipSet) record.put ("CsrZip", in.CsrZip);
  
    if (in._CsrCountryCodeSet) record.put ("CsrCountryCode", in.CsrCountryCode);
  
    if (in._CsrCountySet) record.put ("CsrCounty", in.CsrCounty);
  
    if (in._DateActiveSet) record.put ("DateActive", in.DateActive);
  
    if (in._DateInactiveSet) record.put ("DateInactive", in.DateInactive);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
      return record;
  }
  /** convert CsrObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (CsrObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", CsrObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.SupervisorName, in.SupervisorNameSort, in.SupervisorNameSortAscending, in.SupervisorNameFetch, in.SupervisorNameCaseInsensitive);
      if (map != null) record.put ("SupervisorName", map);
      map = DataHelper.filterToMap (in.CsrLname, in.CsrLnameSort, in.CsrLnameSortAscending, in.CsrLnameFetch, in.CsrLnameCaseInsensitive);
      if (map != null) record.put ("CsrLname", map);
      map = DataHelper.filterToMap (in.CsrFname, in.CsrFnameSort, in.CsrFnameSortAscending, in.CsrFnameFetch, in.CsrFnameCaseInsensitive);
      if (map != null) record.put ("CsrFname", map);
      map = DataHelper.filterToMap (in.CsrMinit, in.CsrMinitSort, in.CsrMinitSortAscending, in.CsrMinitFetch, in.CsrMinitCaseInsensitive);
      if (map != null) record.put ("CsrMinit", map);
      map = DataHelper.filterToMap (in.CsrTitle, in.CsrTitleSort, in.CsrTitleSortAscending, in.CsrTitleFetch, in.CsrTitleCaseInsensitive);
      if (map != null) record.put ("CsrTitle", map);
      map = DataHelper.filterToMap (in.CsrPhone, in.CsrPhoneSort, in.CsrPhoneSortAscending, in.CsrPhoneFetch, in.CsrPhoneCaseInsensitive);
      if (map != null) record.put ("CsrPhone", map);
      map = DataHelper.filterToMap (in.CsrEmail, in.CsrEmailSort, in.CsrEmailSortAscending, in.CsrEmailFetch, in.CsrEmailCaseInsensitive);
      if (map != null) record.put ("CsrEmail", map);
      map = DataHelper.filterToMap (in.CsrAddress1, in.CsrAddress1Sort, in.CsrAddress1SortAscending, in.CsrAddress1Fetch, in.CsrAddress1CaseInsensitive);
      if (map != null) record.put ("CsrAddress1", map);
      map = DataHelper.filterToMap (in.CsrAddress2, in.CsrAddress2Sort, in.CsrAddress2SortAscending, in.CsrAddress2Fetch, in.CsrAddress2CaseInsensitive);
      if (map != null) record.put ("CsrAddress2", map);
      map = DataHelper.filterToMap (in.CsrAddress3, in.CsrAddress3Sort, in.CsrAddress3SortAscending, in.CsrAddress3Fetch, in.CsrAddress3CaseInsensitive);
      if (map != null) record.put ("CsrAddress3", map);
      map = DataHelper.filterToMap (in.CsrCity, in.CsrCitySort, in.CsrCitySortAscending, in.CsrCityFetch, in.CsrCityCaseInsensitive);
      if (map != null) record.put ("CsrCity", map);
      map = DataHelper.filterToMap (in.CsrState, in.CsrStateSort, in.CsrStateSortAscending, in.CsrStateFetch, in.CsrStateCaseInsensitive);
      if (map != null) record.put ("CsrState", map);
      map = DataHelper.filterToMap (in.CsrZip, in.CsrZipSort, in.CsrZipSortAscending, in.CsrZipFetch, in.CsrZipCaseInsensitive);
      if (map != null) record.put ("CsrZip", map);
      map = DataHelper.filterToMap (in.CsrCountryCode, in.CsrCountryCodeSort, in.CsrCountryCodeSortAscending, in.CsrCountryCodeFetch);
      if (map != null) record.put ("CsrCountryCode", map);
      map = DataHelper.filterToMap (in.CsrCounty, in.CsrCountySort, in.CsrCountySortAscending, in.CsrCountyFetch, in.CsrCountyCaseInsensitive);
      if (map != null) record.put ("CsrCounty", map);
      map = DataHelper.filterToMap (in.DateActive, in.DateActiveSort, in.DateActiveSortAscending, in.DateActiveFetch);
      if (map != null) record.put ("DateActive", map);
      map = DataHelper.filterToMap (in.DateInactive, in.DateInactiveSort, in.DateInactiveSortAscending, in.DateInactiveFetch);
      if (map != null) record.put ("DateInactive", map);
      map = DataHelper.filterToMap (in.ConfigTagId, in.ConfigTagIdSort, in.ConfigTagIdSortAscending, in.ConfigTagIdFetch, in.ConfigTagIdCaseInsensitive);
      if (map != null) record.put ("ConfigTagId", map);
    return record;
  }
  /** convert Map to CsrObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrObjectData the converted object
   */
  public static CsrObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrObjectData out = new CsrObjectData ();

    out.Key = CsrObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("SupervisorName")) != null)
    {
      out.SupervisorName = (String) obj;
    }
  
    if ((obj = record.get ("CsrLname")) != null)
    {
      out.CsrLname = (String) obj;
    }
  
    if ((obj = record.get ("CsrFname")) != null)
    {
      out.CsrFname = (String) obj;
    }
  
    if ((obj = record.get ("CsrMinit")) != null)
    {
      out.CsrMinit = (String) obj;
    }
  
    if ((obj = record.get ("CsrTitle")) != null)
    {
      out.CsrTitle = (String) obj;
    }
  
    if ((obj = record.get ("CsrPhone")) != null)
    {
      out.CsrPhone = (String) obj;
    }
  
    if ((obj = record.get ("CsrEmail")) != null)
    {
      out.CsrEmail = (String) obj;
    }
  
    if ((obj = record.get ("CsrAddress1")) != null)
    {
      out.CsrAddress1 = (String) obj;
    }
  
    if ((obj = record.get ("CsrAddress2")) != null)
    {
      out.CsrAddress2 = (String) obj;
    }
  
    if ((obj = record.get ("CsrAddress3")) != null)
    {
      out.CsrAddress3 = (String) obj;
    }
  
    if ((obj = record.get ("CsrCity")) != null)
    {
      out.CsrCity = (String) obj;
    }
  
    if ((obj = record.get ("CsrState")) != null)
    {
      out.CsrState = (String) obj;
    }
  
    if ((obj = record.get ("CsrZip")) != null)
    {
      out.CsrZip = (String) obj;
    }
  
    if ((obj = record.get ("CsrCountryCode")) != null)
    {
      out.CsrCountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("CsrCounty")) != null)
    {
      out.CsrCounty = (String) obj;
    }
  
    if ((obj = record.get ("DateActive")) != null)
    {
      out.DateActive = (Date) obj;
    }
  
    if ((obj = record.get ("DateInactive")) != null)
    {
      out.DateInactive = (Date) obj;
    }
  
    if ((obj = record.get ("ConfigTagId")) != null)
    {
      out.ConfigTagId = (String) obj;
    }
      return out;
  }
  /** convert Map to CsrObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return CsrObjectFilter the converted object
   */
  public static CsrObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    CsrObjectFilter out = new CsrObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = CsrObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map SupervisorNameMap = (Map)record.get("SupervisorName");
    Boolean SupervisorNameFetch = DataHelper.getFetch(SupervisorNameMap);
    Boolean SupervisorNameSortDir = DataHelper.getSortDirection(SupervisorNameMap);
    Integer SupervisorNameSortOrder = DataHelper.getSortOrder(SupervisorNameMap);
    if (SupervisorNameFetch != null) out.setSupervisorNameFetch(SupervisorNameFetch);
    if (SupervisorNameSortDir != null) out.setSupervisorNameSortDirection(SupervisorNameSortDir);
    if (SupervisorNameSortOrder != null) out.setSupervisorNameSortOrder(SupervisorNameSortOrder);

    Filter[] SupervisorNameFilter = DataHelper.mapToFilterArray(SupervisorNameMap, String.class);
    if (SupervisorNameFilter != null) {
      StringFilter[] SupervisorNameFilters = new StringFilter[SupervisorNameFilter.length];
      for (int i = 0; i < SupervisorNameFilters.length; i++) {
        SupervisorNameFilters[i] = (StringFilter)SupervisorNameFilter[i];
      }
      try {
        out.setSupervisorNameFilter(SupervisorNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrLnameMap = (Map)record.get("CsrLname");
    Boolean CsrLnameFetch = DataHelper.getFetch(CsrLnameMap);
    Boolean CsrLnameSortDir = DataHelper.getSortDirection(CsrLnameMap);
    Integer CsrLnameSortOrder = DataHelper.getSortOrder(CsrLnameMap);
    if (CsrLnameFetch != null) out.setCsrLnameFetch(CsrLnameFetch);
    if (CsrLnameSortDir != null) out.setCsrLnameSortDirection(CsrLnameSortDir);
    if (CsrLnameSortOrder != null) out.setCsrLnameSortOrder(CsrLnameSortOrder);

    Filter[] CsrLnameFilter = DataHelper.mapToFilterArray(CsrLnameMap, String.class);
    if (CsrLnameFilter != null) {
      StringFilter[] CsrLnameFilters = new StringFilter[CsrLnameFilter.length];
      for (int i = 0; i < CsrLnameFilters.length; i++) {
        CsrLnameFilters[i] = (StringFilter)CsrLnameFilter[i];
      }
      try {
        out.setCsrLnameFilter(CsrLnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrFnameMap = (Map)record.get("CsrFname");
    Boolean CsrFnameFetch = DataHelper.getFetch(CsrFnameMap);
    Boolean CsrFnameSortDir = DataHelper.getSortDirection(CsrFnameMap);
    Integer CsrFnameSortOrder = DataHelper.getSortOrder(CsrFnameMap);
    if (CsrFnameFetch != null) out.setCsrFnameFetch(CsrFnameFetch);
    if (CsrFnameSortDir != null) out.setCsrFnameSortDirection(CsrFnameSortDir);
    if (CsrFnameSortOrder != null) out.setCsrFnameSortOrder(CsrFnameSortOrder);

    Filter[] CsrFnameFilter = DataHelper.mapToFilterArray(CsrFnameMap, String.class);
    if (CsrFnameFilter != null) {
      StringFilter[] CsrFnameFilters = new StringFilter[CsrFnameFilter.length];
      for (int i = 0; i < CsrFnameFilters.length; i++) {
        CsrFnameFilters[i] = (StringFilter)CsrFnameFilter[i];
      }
      try {
        out.setCsrFnameFilter(CsrFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrMinitMap = (Map)record.get("CsrMinit");
    Boolean CsrMinitFetch = DataHelper.getFetch(CsrMinitMap);
    Boolean CsrMinitSortDir = DataHelper.getSortDirection(CsrMinitMap);
    Integer CsrMinitSortOrder = DataHelper.getSortOrder(CsrMinitMap);
    if (CsrMinitFetch != null) out.setCsrMinitFetch(CsrMinitFetch);
    if (CsrMinitSortDir != null) out.setCsrMinitSortDirection(CsrMinitSortDir);
    if (CsrMinitSortOrder != null) out.setCsrMinitSortOrder(CsrMinitSortOrder);

    Filter[] CsrMinitFilter = DataHelper.mapToFilterArray(CsrMinitMap, String.class);
    if (CsrMinitFilter != null) {
      StringFilter[] CsrMinitFilters = new StringFilter[CsrMinitFilter.length];
      for (int i = 0; i < CsrMinitFilters.length; i++) {
        CsrMinitFilters[i] = (StringFilter)CsrMinitFilter[i];
      }
      try {
        out.setCsrMinitFilter(CsrMinitFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrTitleMap = (Map)record.get("CsrTitle");
    Boolean CsrTitleFetch = DataHelper.getFetch(CsrTitleMap);
    Boolean CsrTitleSortDir = DataHelper.getSortDirection(CsrTitleMap);
    Integer CsrTitleSortOrder = DataHelper.getSortOrder(CsrTitleMap);
    if (CsrTitleFetch != null) out.setCsrTitleFetch(CsrTitleFetch);
    if (CsrTitleSortDir != null) out.setCsrTitleSortDirection(CsrTitleSortDir);
    if (CsrTitleSortOrder != null) out.setCsrTitleSortOrder(CsrTitleSortOrder);

    Filter[] CsrTitleFilter = DataHelper.mapToFilterArray(CsrTitleMap, String.class);
    if (CsrTitleFilter != null) {
      StringFilter[] CsrTitleFilters = new StringFilter[CsrTitleFilter.length];
      for (int i = 0; i < CsrTitleFilters.length; i++) {
        CsrTitleFilters[i] = (StringFilter)CsrTitleFilter[i];
      }
      try {
        out.setCsrTitleFilter(CsrTitleFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrPhoneMap = (Map)record.get("CsrPhone");
    Boolean CsrPhoneFetch = DataHelper.getFetch(CsrPhoneMap);
    Boolean CsrPhoneSortDir = DataHelper.getSortDirection(CsrPhoneMap);
    Integer CsrPhoneSortOrder = DataHelper.getSortOrder(CsrPhoneMap);
    if (CsrPhoneFetch != null) out.setCsrPhoneFetch(CsrPhoneFetch);
    if (CsrPhoneSortDir != null) out.setCsrPhoneSortDirection(CsrPhoneSortDir);
    if (CsrPhoneSortOrder != null) out.setCsrPhoneSortOrder(CsrPhoneSortOrder);

    Filter[] CsrPhoneFilter = DataHelper.mapToFilterArray(CsrPhoneMap, String.class);
    if (CsrPhoneFilter != null) {
      StringFilter[] CsrPhoneFilters = new StringFilter[CsrPhoneFilter.length];
      for (int i = 0; i < CsrPhoneFilters.length; i++) {
        CsrPhoneFilters[i] = (StringFilter)CsrPhoneFilter[i];
      }
      try {
        out.setCsrPhoneFilter(CsrPhoneFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrEmailMap = (Map)record.get("CsrEmail");
    Boolean CsrEmailFetch = DataHelper.getFetch(CsrEmailMap);
    Boolean CsrEmailSortDir = DataHelper.getSortDirection(CsrEmailMap);
    Integer CsrEmailSortOrder = DataHelper.getSortOrder(CsrEmailMap);
    if (CsrEmailFetch != null) out.setCsrEmailFetch(CsrEmailFetch);
    if (CsrEmailSortDir != null) out.setCsrEmailSortDirection(CsrEmailSortDir);
    if (CsrEmailSortOrder != null) out.setCsrEmailSortOrder(CsrEmailSortOrder);

    Filter[] CsrEmailFilter = DataHelper.mapToFilterArray(CsrEmailMap, String.class);
    if (CsrEmailFilter != null) {
      StringFilter[] CsrEmailFilters = new StringFilter[CsrEmailFilter.length];
      for (int i = 0; i < CsrEmailFilters.length; i++) {
        CsrEmailFilters[i] = (StringFilter)CsrEmailFilter[i];
      }
      try {
        out.setCsrEmailFilter(CsrEmailFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrAddress1Map = (Map)record.get("CsrAddress1");
    Boolean CsrAddress1Fetch = DataHelper.getFetch(CsrAddress1Map);
    Boolean CsrAddress1SortDir = DataHelper.getSortDirection(CsrAddress1Map);
    Integer CsrAddress1SortOrder = DataHelper.getSortOrder(CsrAddress1Map);
    if (CsrAddress1Fetch != null) out.setCsrAddress1Fetch(CsrAddress1Fetch);
    if (CsrAddress1SortDir != null) out.setCsrAddress1SortDirection(CsrAddress1SortDir);
    if (CsrAddress1SortOrder != null) out.setCsrAddress1SortOrder(CsrAddress1SortOrder);

    Filter[] CsrAddress1Filter = DataHelper.mapToFilterArray(CsrAddress1Map, String.class);
    if (CsrAddress1Filter != null) {
      StringFilter[] CsrAddress1Filters = new StringFilter[CsrAddress1Filter.length];
      for (int i = 0; i < CsrAddress1Filters.length; i++) {
        CsrAddress1Filters[i] = (StringFilter)CsrAddress1Filter[i];
      }
      try {
        out.setCsrAddress1Filter(CsrAddress1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrAddress2Map = (Map)record.get("CsrAddress2");
    Boolean CsrAddress2Fetch = DataHelper.getFetch(CsrAddress2Map);
    Boolean CsrAddress2SortDir = DataHelper.getSortDirection(CsrAddress2Map);
    Integer CsrAddress2SortOrder = DataHelper.getSortOrder(CsrAddress2Map);
    if (CsrAddress2Fetch != null) out.setCsrAddress2Fetch(CsrAddress2Fetch);
    if (CsrAddress2SortDir != null) out.setCsrAddress2SortDirection(CsrAddress2SortDir);
    if (CsrAddress2SortOrder != null) out.setCsrAddress2SortOrder(CsrAddress2SortOrder);

    Filter[] CsrAddress2Filter = DataHelper.mapToFilterArray(CsrAddress2Map, String.class);
    if (CsrAddress2Filter != null) {
      StringFilter[] CsrAddress2Filters = new StringFilter[CsrAddress2Filter.length];
      for (int i = 0; i < CsrAddress2Filters.length; i++) {
        CsrAddress2Filters[i] = (StringFilter)CsrAddress2Filter[i];
      }
      try {
        out.setCsrAddress2Filter(CsrAddress2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrAddress3Map = (Map)record.get("CsrAddress3");
    Boolean CsrAddress3Fetch = DataHelper.getFetch(CsrAddress3Map);
    Boolean CsrAddress3SortDir = DataHelper.getSortDirection(CsrAddress3Map);
    Integer CsrAddress3SortOrder = DataHelper.getSortOrder(CsrAddress3Map);
    if (CsrAddress3Fetch != null) out.setCsrAddress3Fetch(CsrAddress3Fetch);
    if (CsrAddress3SortDir != null) out.setCsrAddress3SortDirection(CsrAddress3SortDir);
    if (CsrAddress3SortOrder != null) out.setCsrAddress3SortOrder(CsrAddress3SortOrder);

    Filter[] CsrAddress3Filter = DataHelper.mapToFilterArray(CsrAddress3Map, String.class);
    if (CsrAddress3Filter != null) {
      StringFilter[] CsrAddress3Filters = new StringFilter[CsrAddress3Filter.length];
      for (int i = 0; i < CsrAddress3Filters.length; i++) {
        CsrAddress3Filters[i] = (StringFilter)CsrAddress3Filter[i];
      }
      try {
        out.setCsrAddress3Filter(CsrAddress3Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrCityMap = (Map)record.get("CsrCity");
    Boolean CsrCityFetch = DataHelper.getFetch(CsrCityMap);
    Boolean CsrCitySortDir = DataHelper.getSortDirection(CsrCityMap);
    Integer CsrCitySortOrder = DataHelper.getSortOrder(CsrCityMap);
    if (CsrCityFetch != null) out.setCsrCityFetch(CsrCityFetch);
    if (CsrCitySortDir != null) out.setCsrCitySortDirection(CsrCitySortDir);
    if (CsrCitySortOrder != null) out.setCsrCitySortOrder(CsrCitySortOrder);

    Filter[] CsrCityFilter = DataHelper.mapToFilterArray(CsrCityMap, String.class);
    if (CsrCityFilter != null) {
      StringFilter[] CsrCityFilters = new StringFilter[CsrCityFilter.length];
      for (int i = 0; i < CsrCityFilters.length; i++) {
        CsrCityFilters[i] = (StringFilter)CsrCityFilter[i];
      }
      try {
        out.setCsrCityFilter(CsrCityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrStateMap = (Map)record.get("CsrState");
    Boolean CsrStateFetch = DataHelper.getFetch(CsrStateMap);
    Boolean CsrStateSortDir = DataHelper.getSortDirection(CsrStateMap);
    Integer CsrStateSortOrder = DataHelper.getSortOrder(CsrStateMap);
    if (CsrStateFetch != null) out.setCsrStateFetch(CsrStateFetch);
    if (CsrStateSortDir != null) out.setCsrStateSortDirection(CsrStateSortDir);
    if (CsrStateSortOrder != null) out.setCsrStateSortOrder(CsrStateSortOrder);

    Filter[] CsrStateFilter = DataHelper.mapToFilterArray(CsrStateMap, String.class);
    if (CsrStateFilter != null) {
      StringFilter[] CsrStateFilters = new StringFilter[CsrStateFilter.length];
      for (int i = 0; i < CsrStateFilters.length; i++) {
        CsrStateFilters[i] = (StringFilter)CsrStateFilter[i];
      }
      try {
        out.setCsrStateFilter(CsrStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrZipMap = (Map)record.get("CsrZip");
    Boolean CsrZipFetch = DataHelper.getFetch(CsrZipMap);
    Boolean CsrZipSortDir = DataHelper.getSortDirection(CsrZipMap);
    Integer CsrZipSortOrder = DataHelper.getSortOrder(CsrZipMap);
    if (CsrZipFetch != null) out.setCsrZipFetch(CsrZipFetch);
    if (CsrZipSortDir != null) out.setCsrZipSortDirection(CsrZipSortDir);
    if (CsrZipSortOrder != null) out.setCsrZipSortOrder(CsrZipSortOrder);

    Filter[] CsrZipFilter = DataHelper.mapToFilterArray(CsrZipMap, String.class);
    if (CsrZipFilter != null) {
      StringFilter[] CsrZipFilters = new StringFilter[CsrZipFilter.length];
      for (int i = 0; i < CsrZipFilters.length; i++) {
        CsrZipFilters[i] = (StringFilter)CsrZipFilter[i];
      }
      try {
        out.setCsrZipFilter(CsrZipFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrCountryCodeMap = (Map)record.get("CsrCountryCode");
    Boolean CsrCountryCodeFetch = DataHelper.getFetch(CsrCountryCodeMap);
    Boolean CsrCountryCodeSortDir = DataHelper.getSortDirection(CsrCountryCodeMap);
    Integer CsrCountryCodeSortOrder = DataHelper.getSortOrder(CsrCountryCodeMap);
    if (CsrCountryCodeFetch != null) out.setCsrCountryCodeFetch(CsrCountryCodeFetch);
    if (CsrCountryCodeSortDir != null) out.setCsrCountryCodeSortDirection(CsrCountryCodeSortDir);
    if (CsrCountryCodeSortOrder != null) out.setCsrCountryCodeSortOrder(CsrCountryCodeSortOrder);

    Filter[] CsrCountryCodeFilter = DataHelper.mapToFilterArray(CsrCountryCodeMap, Integer.class);
    if (CsrCountryCodeFilter != null) {
      IntegerFilter[] CsrCountryCodeFilters = new IntegerFilter[CsrCountryCodeFilter.length];
      for (int i = 0; i < CsrCountryCodeFilters.length; i++) {
        CsrCountryCodeFilters[i] = (IntegerFilter)CsrCountryCodeFilter[i];
      }
      try {
        out.setCsrCountryCodeFilter(CsrCountryCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CsrCountyMap = (Map)record.get("CsrCounty");
    Boolean CsrCountyFetch = DataHelper.getFetch(CsrCountyMap);
    Boolean CsrCountySortDir = DataHelper.getSortDirection(CsrCountyMap);
    Integer CsrCountySortOrder = DataHelper.getSortOrder(CsrCountyMap);
    if (CsrCountyFetch != null) out.setCsrCountyFetch(CsrCountyFetch);
    if (CsrCountySortDir != null) out.setCsrCountySortDirection(CsrCountySortDir);
    if (CsrCountySortOrder != null) out.setCsrCountySortOrder(CsrCountySortOrder);

    Filter[] CsrCountyFilter = DataHelper.mapToFilterArray(CsrCountyMap, String.class);
    if (CsrCountyFilter != null) {
      StringFilter[] CsrCountyFilters = new StringFilter[CsrCountyFilter.length];
      for (int i = 0; i < CsrCountyFilters.length; i++) {
        CsrCountyFilters[i] = (StringFilter)CsrCountyFilter[i];
      }
      try {
        out.setCsrCountyFilter(CsrCountyFilters);
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
  
    return out;
  }
}
