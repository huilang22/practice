/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceCenterTypeObjectHelper.java
 * Definition File: Admin/ServiceCenterType.xml
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



/** Helper class to convert ServiceCenterTypeObject JavaBean objects to/from HashMaps.
 */
public class ServiceCenterTypeObjectHelper implements ArubaObjectHelper
{
  /** convert ServiceCenterTypeObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ServiceCenterTypeObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceCenterTypeObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceCenterTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterTypeObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceCenterTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ServiceCenterTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterTypeObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ServiceCenterTypeObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ServiceCenterTypeObject")
   * @return Map     the output Map
   */
  public static Map toMap (ServiceCenterTypeObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ServiceCenterTypeObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ServiceCenterTypeObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ServiceCenterTypeObjectData the converted object
   */
  public static ServiceCenterTypeObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ServiceCenterTypeObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ServiceCenterTypeObject")
   * @return ServiceCenterTypeObjectData the converted object
   */
  public static ServiceCenterTypeObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceCenterTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ServiceCenterTypeObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ServiceCenterTypeObjectFilter the converted object
   */
  public static ServiceCenterTypeObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ServiceCenterTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ServiceCenterTypeObject")
   * @return ServiceCenterTypeObjectFilter the converted object
   */
  public static ServiceCenterTypeObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceCenterTypeObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ServiceCenterTypeObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ServiceCenterTypeObjectDataList the converted object
   */
  public static ServiceCenterTypeObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ServiceCenterTypeObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ServiceCenterTypeObjectList")
   * @return ServiceCenterTypeObjectDataList the converted object
   */
  public static ServiceCenterTypeObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ServiceCenterTypeObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ServiceCenterTypeObjectData[] array = null;
    if (root != null)
    {
      array = new ServiceCenterTypeObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ServiceCenterTypeObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ServiceCenterTypeObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ServiceCenterTypeObjectDataList (array, index, total);
  }
  /** convert ServiceCenterTypeObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServiceCenterTypeObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ServiceCenterTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._ScNameSet) record.put ("ScName", in.ScName);
  
    if (in._ScContactFnameSet) record.put ("ScContactFname", in.ScContactFname);
  
    if (in._ScContactMinitSet) record.put ("ScContactMinit", in.ScContactMinit);
  
    if (in._ScContactLnameSet) record.put ("ScContactLname", in.ScContactLname);
  
    if (in._ScAddress1Set) record.put ("ScAddress1", in.ScAddress1);
  
    if (in._ScAddress2Set) record.put ("ScAddress2", in.ScAddress2);
  
    if (in._ScAddress3Set) record.put ("ScAddress3", in.ScAddress3);
  
    if (in._ScCitySet) record.put ("ScCity", in.ScCity);
  
    if (in._ScStateSet) record.put ("ScState", in.ScState);
  
    if (in._ScZipSet) record.put ("ScZip", in.ScZip);
  
    if (in._ScCountryCodeSet) record.put ("ScCountryCode", in.ScCountryCode);
  
    if (in._ScCountySet) record.put ("ScCounty", in.ScCounty);
  
    if (in._ScPhoneSet) record.put ("ScPhone", in.ScPhone);
  
    if (in._TeleMsgSet) record.put ("TeleMsg", in.TeleMsg);
  
    if (in._FaxMsgSet) record.put ("FaxMsg", in.FaxMsg);
  
    if (in._EmailMsgSet) record.put ("EmailMsg", in.EmailMsg);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._PrinterDeviceIdSet) record.put ("PrinterDeviceId", in.PrinterDeviceId);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._IsInternalSet) record.put ("IsInternal", in.IsInternal);
  
    if (in._ConfigTagIdSet) record.put ("ConfigTagId", in.ConfigTagId);
  
    if (in._ShortDisplaySet) record.put ("ShortDisplay", in.ShortDisplay);
  
    if (in._DisplayValueSet) record.put ("DisplayValue", in.DisplayValue);
      return record;
  }
  /** convert ServiceCenterTypeObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ServiceCenterTypeObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ServiceCenterTypeObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.ScName, in.ScNameSort, in.ScNameSortAscending, in.ScNameFetch, in.ScNameCaseInsensitive);
      if (map != null) record.put ("ScName", map);
      map = DataHelper.filterToMap (in.ScContactFname, in.ScContactFnameSort, in.ScContactFnameSortAscending, in.ScContactFnameFetch, in.ScContactFnameCaseInsensitive);
      if (map != null) record.put ("ScContactFname", map);
      map = DataHelper.filterToMap (in.ScContactMinit, in.ScContactMinitSort, in.ScContactMinitSortAscending, in.ScContactMinitFetch, in.ScContactMinitCaseInsensitive);
      if (map != null) record.put ("ScContactMinit", map);
      map = DataHelper.filterToMap (in.ScContactLname, in.ScContactLnameSort, in.ScContactLnameSortAscending, in.ScContactLnameFetch, in.ScContactLnameCaseInsensitive);
      if (map != null) record.put ("ScContactLname", map);
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
      map = DataHelper.filterToMap (in.ScZip, in.ScZipSort, in.ScZipSortAscending, in.ScZipFetch, in.ScZipCaseInsensitive);
      if (map != null) record.put ("ScZip", map);
      map = DataHelper.filterToMap (in.ScCountryCode, in.ScCountryCodeSort, in.ScCountryCodeSortAscending, in.ScCountryCodeFetch);
      if (map != null) record.put ("ScCountryCode", map);
      map = DataHelper.filterToMap (in.ScCounty, in.ScCountySort, in.ScCountySortAscending, in.ScCountyFetch, in.ScCountyCaseInsensitive);
      if (map != null) record.put ("ScCounty", map);
      map = DataHelper.filterToMap (in.ScPhone, in.ScPhoneSort, in.ScPhoneSortAscending, in.ScPhoneFetch, in.ScPhoneCaseInsensitive);
      if (map != null) record.put ("ScPhone", map);
      map = DataHelper.filterToMap (in.TeleMsg, in.TeleMsgSort, in.TeleMsgSortAscending, in.TeleMsgFetch, in.TeleMsgCaseInsensitive);
      if (map != null) record.put ("TeleMsg", map);
      map = DataHelper.filterToMap (in.FaxMsg, in.FaxMsgSort, in.FaxMsgSortAscending, in.FaxMsgFetch, in.FaxMsgCaseInsensitive);
      if (map != null) record.put ("FaxMsg", map);
      map = DataHelper.filterToMap (in.EmailMsg, in.EmailMsgSort, in.EmailMsgSortAscending, in.EmailMsgFetch, in.EmailMsgCaseInsensitive);
      if (map != null) record.put ("EmailMsg", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.PrinterDeviceId, in.PrinterDeviceIdSort, in.PrinterDeviceIdSortAscending, in.PrinterDeviceIdFetch, in.PrinterDeviceIdCaseInsensitive);
      if (map != null) record.put ("PrinterDeviceId", map);
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
  /** convert Map to ServiceCenterTypeObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceCenterTypeObjectData the converted object
   */
  public static ServiceCenterTypeObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceCenterTypeObjectData out = new ServiceCenterTypeObjectData ();

    out.Key = ServiceCenterTypeObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("ScName")) != null)
    {
      out.ScName = (String) obj;
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
  
    if ((obj = record.get ("ScZip")) != null)
    {
      out.ScZip = (String) obj;
    }
  
    if ((obj = record.get ("ScCountryCode")) != null)
    {
      out.ScCountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("ScCounty")) != null)
    {
      out.ScCounty = (String) obj;
    }
  
    if ((obj = record.get ("ScPhone")) != null)
    {
      out.ScPhone = (String) obj;
    }
  
    if ((obj = record.get ("TeleMsg")) != null)
    {
      out.TeleMsg = (String) obj;
    }
  
    if ((obj = record.get ("FaxMsg")) != null)
    {
      out.FaxMsg = (String) obj;
    }
  
    if ((obj = record.get ("EmailMsg")) != null)
    {
      out.EmailMsg = (String) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("PrinterDeviceId")) != null)
    {
      out.PrinterDeviceId = (String) obj;
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
  /** convert Map to ServiceCenterTypeObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ServiceCenterTypeObjectFilter the converted object
   */
  public static ServiceCenterTypeObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ServiceCenterTypeObjectFilter out = new ServiceCenterTypeObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ServiceCenterTypeObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map ScZipMap = (Map)record.get("ScZip");
    Boolean ScZipFetch = DataHelper.getFetch(ScZipMap);
    Boolean ScZipSortDir = DataHelper.getSortDirection(ScZipMap);
    Integer ScZipSortOrder = DataHelper.getSortOrder(ScZipMap);
    if (ScZipFetch != null) out.setScZipFetch(ScZipFetch);
    if (ScZipSortDir != null) out.setScZipSortDirection(ScZipSortDir);
    if (ScZipSortOrder != null) out.setScZipSortOrder(ScZipSortOrder);

    Filter[] ScZipFilter = DataHelper.mapToFilterArray(ScZipMap, String.class);
    if (ScZipFilter != null) {
      StringFilter[] ScZipFilters = new StringFilter[ScZipFilter.length];
      for (int i = 0; i < ScZipFilters.length; i++) {
        ScZipFilters[i] = (StringFilter)ScZipFilter[i];
      }
      try {
        out.setScZipFilter(ScZipFilters);
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
  
    Map ScCountyMap = (Map)record.get("ScCounty");
    Boolean ScCountyFetch = DataHelper.getFetch(ScCountyMap);
    Boolean ScCountySortDir = DataHelper.getSortDirection(ScCountyMap);
    Integer ScCountySortOrder = DataHelper.getSortOrder(ScCountyMap);
    if (ScCountyFetch != null) out.setScCountyFetch(ScCountyFetch);
    if (ScCountySortDir != null) out.setScCountySortDirection(ScCountySortDir);
    if (ScCountySortOrder != null) out.setScCountySortOrder(ScCountySortOrder);

    Filter[] ScCountyFilter = DataHelper.mapToFilterArray(ScCountyMap, String.class);
    if (ScCountyFilter != null) {
      StringFilter[] ScCountyFilters = new StringFilter[ScCountyFilter.length];
      for (int i = 0; i < ScCountyFilters.length; i++) {
        ScCountyFilters[i] = (StringFilter)ScCountyFilter[i];
      }
      try {
        out.setScCountyFilter(ScCountyFilters);
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
  
    Map TeleMsgMap = (Map)record.get("TeleMsg");
    Boolean TeleMsgFetch = DataHelper.getFetch(TeleMsgMap);
    Boolean TeleMsgSortDir = DataHelper.getSortDirection(TeleMsgMap);
    Integer TeleMsgSortOrder = DataHelper.getSortOrder(TeleMsgMap);
    if (TeleMsgFetch != null) out.setTeleMsgFetch(TeleMsgFetch);
    if (TeleMsgSortDir != null) out.setTeleMsgSortDirection(TeleMsgSortDir);
    if (TeleMsgSortOrder != null) out.setTeleMsgSortOrder(TeleMsgSortOrder);

    Filter[] TeleMsgFilter = DataHelper.mapToFilterArray(TeleMsgMap, String.class);
    if (TeleMsgFilter != null) {
      StringFilter[] TeleMsgFilters = new StringFilter[TeleMsgFilter.length];
      for (int i = 0; i < TeleMsgFilters.length; i++) {
        TeleMsgFilters[i] = (StringFilter)TeleMsgFilter[i];
      }
      try {
        out.setTeleMsgFilter(TeleMsgFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FaxMsgMap = (Map)record.get("FaxMsg");
    Boolean FaxMsgFetch = DataHelper.getFetch(FaxMsgMap);
    Boolean FaxMsgSortDir = DataHelper.getSortDirection(FaxMsgMap);
    Integer FaxMsgSortOrder = DataHelper.getSortOrder(FaxMsgMap);
    if (FaxMsgFetch != null) out.setFaxMsgFetch(FaxMsgFetch);
    if (FaxMsgSortDir != null) out.setFaxMsgSortDirection(FaxMsgSortDir);
    if (FaxMsgSortOrder != null) out.setFaxMsgSortOrder(FaxMsgSortOrder);

    Filter[] FaxMsgFilter = DataHelper.mapToFilterArray(FaxMsgMap, String.class);
    if (FaxMsgFilter != null) {
      StringFilter[] FaxMsgFilters = new StringFilter[FaxMsgFilter.length];
      for (int i = 0; i < FaxMsgFilters.length; i++) {
        FaxMsgFilters[i] = (StringFilter)FaxMsgFilter[i];
      }
      try {
        out.setFaxMsgFilter(FaxMsgFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EmailMsgMap = (Map)record.get("EmailMsg");
    Boolean EmailMsgFetch = DataHelper.getFetch(EmailMsgMap);
    Boolean EmailMsgSortDir = DataHelper.getSortDirection(EmailMsgMap);
    Integer EmailMsgSortOrder = DataHelper.getSortOrder(EmailMsgMap);
    if (EmailMsgFetch != null) out.setEmailMsgFetch(EmailMsgFetch);
    if (EmailMsgSortDir != null) out.setEmailMsgSortDirection(EmailMsgSortDir);
    if (EmailMsgSortOrder != null) out.setEmailMsgSortOrder(EmailMsgSortOrder);

    Filter[] EmailMsgFilter = DataHelper.mapToFilterArray(EmailMsgMap, String.class);
    if (EmailMsgFilter != null) {
      StringFilter[] EmailMsgFilters = new StringFilter[EmailMsgFilter.length];
      for (int i = 0; i < EmailMsgFilters.length; i++) {
        EmailMsgFilters[i] = (StringFilter)EmailMsgFilter[i];
      }
      try {
        out.setEmailMsgFilter(EmailMsgFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ChgDateMap = (Map)record.get("ChgDate");
    Boolean ChgDateFetch = DataHelper.getFetch(ChgDateMap);
    Boolean ChgDateSortDir = DataHelper.getSortDirection(ChgDateMap);
    Integer ChgDateSortOrder = DataHelper.getSortOrder(ChgDateMap);
    if (ChgDateFetch != null) out.setChgDateFetch(ChgDateFetch);
    if (ChgDateSortDir != null) out.setChgDateSortDirection(ChgDateSortDir);
    if (ChgDateSortOrder != null) out.setChgDateSortOrder(ChgDateSortOrder);

    Filter[] ChgDateFilter = DataHelper.mapToFilterArray(ChgDateMap, Date.class);
    if (ChgDateFilter != null) {
      DateFilter[] ChgDateFilters = new DateFilter[ChgDateFilter.length];
      for (int i = 0; i < ChgDateFilters.length; i++) {
        ChgDateFilters[i] = (DateFilter)ChgDateFilter[i];
      }
      try {
        out.setChgDateFilter(ChgDateFilters);
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
  
    Map PrinterDeviceIdMap = (Map)record.get("PrinterDeviceId");
    Boolean PrinterDeviceIdFetch = DataHelper.getFetch(PrinterDeviceIdMap);
    Boolean PrinterDeviceIdSortDir = DataHelper.getSortDirection(PrinterDeviceIdMap);
    Integer PrinterDeviceIdSortOrder = DataHelper.getSortOrder(PrinterDeviceIdMap);
    if (PrinterDeviceIdFetch != null) out.setPrinterDeviceIdFetch(PrinterDeviceIdFetch);
    if (PrinterDeviceIdSortDir != null) out.setPrinterDeviceIdSortDirection(PrinterDeviceIdSortDir);
    if (PrinterDeviceIdSortOrder != null) out.setPrinterDeviceIdSortOrder(PrinterDeviceIdSortOrder);

    Filter[] PrinterDeviceIdFilter = DataHelper.mapToFilterArray(PrinterDeviceIdMap, String.class);
    if (PrinterDeviceIdFilter != null) {
      StringFilter[] PrinterDeviceIdFilters = new StringFilter[PrinterDeviceIdFilter.length];
      for (int i = 0; i < PrinterDeviceIdFilters.length; i++) {
        PrinterDeviceIdFilters[i] = (StringFilter)PrinterDeviceIdFilter[i];
      }
      try {
        out.setPrinterDeviceIdFilter(PrinterDeviceIdFilters);
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
