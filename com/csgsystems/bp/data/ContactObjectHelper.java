/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ContactObjectHelper.java
 * Definition File: Customer/Contact.xml
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



/** Helper class to convert ContactObject JavaBean objects to/from HashMaps.
 */
public class ContactObjectHelper implements ArubaObjectHelper
{
  /** convert ContactObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (ContactObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContactObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContactObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContactObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContactObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert ContactObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (ContactObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert ContactObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "ContactObject")
   * @return Map     the output Map
   */
  public static Map toMap (ContactObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "ContactObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to ContactObjectData.
   * @param record the Map containing the data to convert to the object
   * @return ContactObjectData the converted object
   */
  public static ContactObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to ContactObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "ContactObject")
   * @return ContactObjectData the converted object
   */
  public static ContactObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ContactObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to ContactObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return ContactObjectFilter the converted object
   */
  public static ContactObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to ContactObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "ContactObject")
   * @return ContactObjectFilter the converted object
   */
  public static ContactObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "ContactObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to ContactObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return ContactObjectDataList the converted object
   */
  public static ContactObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to ContactObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "ContactObjectList")
   * @return ContactObjectDataList the converted object
   */
  public static ContactObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "ContactObjectList";
    Object[] root = (Object[]) record.get (rootName);
    ContactObjectData[] array = null;
    if (root != null)
    {
      array = new ContactObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = ContactObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new ContactObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new ContactObjectDataList (array, index, total);
  }
  /** convert ContactObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ContactObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", ContactObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._CreateDtSet) record.put ("CreateDt", in.CreateDt);
  
    if (in._ChgDtSet) record.put ("ChgDt", in.ChgDt);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._NamePrefixSet) record.put ("NamePrefix", in.NamePrefix);
  
    if (in._FirstNameSet) record.put ("FirstName", in.FirstName);
  
    if (in._MiddleNameSet) record.put ("MiddleName", in.MiddleName);
  
    if (in._LastNameSet) record.put ("LastName", in.LastName);
  
    if (in._GenerationSet) record.put ("Generation", in.Generation);
  
    if (in._TitleSet) record.put ("Title", in.Title);
  
    if (in._CompanySet) record.put ("Company", in.Company);
  
    if (in._AddressIdSet) record.put ("AddressId", in.AddressId);
  
    if (in._AltLnameSet) record.put ("AltLname", in.AltLname);
  
    if (in._AltFnameSet) record.put ("AltFname", in.AltFname);
  
    if (in._AltCompanySet) record.put ("AltCompany", in.AltCompany);
  
    if (in._GenderSet) record.put ("Gender", in.Gender);
  
    if (in._DeptSet) record.put ("Dept", in.Dept);
  
    if (in._DateActiveSet) record.put ("DateActive", in.DateActive);
  
    if (in._DateInactiveSet) record.put ("DateInactive", in.DateInactive);
  
    if (in._AddressLine1Set) record.put ("AddressLine1", in.AddressLine1);
  
    if (in._AddressLine2Set) record.put ("AddressLine2", in.AddressLine2);
  
    if (in._AddressLine3Set) record.put ("AddressLine3", in.AddressLine3);
  
    if (in._AddressLine4Set) record.put ("AddressLine4", in.AddressLine4);
  
    if (in._CitySet) record.put ("City", in.City);
  
    if (in._StateSet) record.put ("State", in.State);
  
    if (in._PostalCodeSet) record.put ("PostalCode", in.PostalCode);
  
    if (in._CountryCodeSet) record.put ("CountryCode", in.CountryCode);
  
    if (in._FranchiseTaxCodeSet) record.put ("FranchiseTaxCode", in.FranchiseTaxCode);
  
    if (in._GeocodeSet) record.put ("Geocode", in.Geocode);
  
    if (in._CountySet) record.put ("County", in.County);
      return record;
  }
  /** convert ContactObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (ContactObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", ContactObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.CreateDt, in.CreateDtSort, in.CreateDtSortAscending, in.CreateDtFetch);
      if (map != null) record.put ("CreateDt", map);
      map = DataHelper.filterToMap (in.ChgDt, in.ChgDtSort, in.ChgDtSortAscending, in.ChgDtFetch);
      if (map != null) record.put ("ChgDt", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.NamePrefix, in.NamePrefixSort, in.NamePrefixSortAscending, in.NamePrefixFetch, in.NamePrefixCaseInsensitive);
      if (map != null) record.put ("NamePrefix", map);
      map = DataHelper.filterToMap (in.FirstName, in.FirstNameSort, in.FirstNameSortAscending, in.FirstNameFetch, in.FirstNameCaseInsensitive);
      if (map != null) record.put ("FirstName", map);
      map = DataHelper.filterToMap (in.MiddleName, in.MiddleNameSort, in.MiddleNameSortAscending, in.MiddleNameFetch, in.MiddleNameCaseInsensitive);
      if (map != null) record.put ("MiddleName", map);
      map = DataHelper.filterToMap (in.LastName, in.LastNameSort, in.LastNameSortAscending, in.LastNameFetch, in.LastNameCaseInsensitive);
      if (map != null) record.put ("LastName", map);
      map = DataHelper.filterToMap (in.Generation, in.GenerationSort, in.GenerationSortAscending, in.GenerationFetch, in.GenerationCaseInsensitive);
      if (map != null) record.put ("Generation", map);
      map = DataHelper.filterToMap (in.Title, in.TitleSort, in.TitleSortAscending, in.TitleFetch, in.TitleCaseInsensitive);
      if (map != null) record.put ("Title", map);
      map = DataHelper.filterToMap (in.Company, in.CompanySort, in.CompanySortAscending, in.CompanyFetch, in.CompanyCaseInsensitive);
      if (map != null) record.put ("Company", map);
      map = DataHelper.filterToMap (in.AddressId, in.AddressIdSort, in.AddressIdSortAscending, in.AddressIdFetch);
      if (map != null) record.put ("AddressId", map);
      map = DataHelper.filterToMap (in.AltLname, in.AltLnameSort, in.AltLnameSortAscending, in.AltLnameFetch, in.AltLnameCaseInsensitive);
      if (map != null) record.put ("AltLname", map);
      map = DataHelper.filterToMap (in.AltFname, in.AltFnameSort, in.AltFnameSortAscending, in.AltFnameFetch, in.AltFnameCaseInsensitive);
      if (map != null) record.put ("AltFname", map);
      map = DataHelper.filterToMap (in.AltCompany, in.AltCompanySort, in.AltCompanySortAscending, in.AltCompanyFetch, in.AltCompanyCaseInsensitive);
      if (map != null) record.put ("AltCompany", map);
      map = DataHelper.filterToMap (in.Gender, in.GenderSort, in.GenderSortAscending, in.GenderFetch);
      if (map != null) record.put ("Gender", map);
      map = DataHelper.filterToMap (in.Dept, in.DeptSort, in.DeptSortAscending, in.DeptFetch, in.DeptCaseInsensitive);
      if (map != null) record.put ("Dept", map);
      map = DataHelper.filterToMap (in.DateActive, in.DateActiveSort, in.DateActiveSortAscending, in.DateActiveFetch);
      if (map != null) record.put ("DateActive", map);
      map = DataHelper.filterToMap (in.DateInactive, in.DateInactiveSort, in.DateInactiveSortAscending, in.DateInactiveFetch);
      if (map != null) record.put ("DateInactive", map);
      map = DataHelper.filterToMap (in.AddressLine1, in.AddressLine1Sort, in.AddressLine1SortAscending, in.AddressLine1Fetch, in.AddressLine1CaseInsensitive);
      if (map != null) record.put ("AddressLine1", map);
      map = DataHelper.filterToMap (in.AddressLine2, in.AddressLine2Sort, in.AddressLine2SortAscending, in.AddressLine2Fetch, in.AddressLine2CaseInsensitive);
      if (map != null) record.put ("AddressLine2", map);
      map = DataHelper.filterToMap (in.AddressLine3, in.AddressLine3Sort, in.AddressLine3SortAscending, in.AddressLine3Fetch, in.AddressLine3CaseInsensitive);
      if (map != null) record.put ("AddressLine3", map);
      map = DataHelper.filterToMap (in.AddressLine4, in.AddressLine4Sort, in.AddressLine4SortAscending, in.AddressLine4Fetch, in.AddressLine4CaseInsensitive);
      if (map != null) record.put ("AddressLine4", map);
      map = DataHelper.filterToMap (in.City, in.CitySort, in.CitySortAscending, in.CityFetch, in.CityCaseInsensitive);
      if (map != null) record.put ("City", map);
      map = DataHelper.filterToMap (in.State, in.StateSort, in.StateSortAscending, in.StateFetch, in.StateCaseInsensitive);
      if (map != null) record.put ("State", map);
      map = DataHelper.filterToMap (in.PostalCode, in.PostalCodeSort, in.PostalCodeSortAscending, in.PostalCodeFetch, in.PostalCodeCaseInsensitive);
      if (map != null) record.put ("PostalCode", map);
      map = DataHelper.filterToMap (in.CountryCode, in.CountryCodeSort, in.CountryCodeSortAscending, in.CountryCodeFetch);
      if (map != null) record.put ("CountryCode", map);
      map = DataHelper.filterToMap (in.FranchiseTaxCode, in.FranchiseTaxCodeSort, in.FranchiseTaxCodeSortAscending, in.FranchiseTaxCodeFetch);
      if (map != null) record.put ("FranchiseTaxCode", map);
      map = DataHelper.filterToMap (in.Geocode, in.GeocodeSort, in.GeocodeSortAscending, in.GeocodeFetch, in.GeocodeCaseInsensitive);
      if (map != null) record.put ("Geocode", map);
      map = DataHelper.filterToMap (in.County, in.CountySort, in.CountySortAscending, in.CountyFetch, in.CountyCaseInsensitive);
      if (map != null) record.put ("County", map);
    return record;
  }
  /** convert Map to ContactObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContactObjectData the converted object
   */
  public static ContactObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContactObjectData out = new ContactObjectData ();

    out.Key = ContactObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("NamePrefix")) != null)
    {
      out.NamePrefix = (String) obj;
    }
  
    if ((obj = record.get ("FirstName")) != null)
    {
      out.FirstName = (String) obj;
    }
  
    if ((obj = record.get ("MiddleName")) != null)
    {
      out.MiddleName = (String) obj;
    }
  
    if ((obj = record.get ("LastName")) != null)
    {
      out.LastName = (String) obj;
    }
  
    if ((obj = record.get ("Generation")) != null)
    {
      out.Generation = (String) obj;
    }
  
    if ((obj = record.get ("Title")) != null)
    {
      out.Title = (String) obj;
    }
  
    if ((obj = record.get ("Company")) != null)
    {
      out.Company = (String) obj;
    }
  
    if ((obj = record.get ("AddressId")) != null)
    {
      out.AddressId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AltLname")) != null)
    {
      out.AltLname = (String) obj;
    }
  
    if ((obj = record.get ("AltFname")) != null)
    {
      out.AltFname = (String) obj;
    }
  
    if ((obj = record.get ("AltCompany")) != null)
    {
      out.AltCompany = (String) obj;
    }
  
    if ((obj = record.get ("Gender")) != null)
    {
      out.Gender = (Integer) obj;
    }
  
    if ((obj = record.get ("Dept")) != null)
    {
      out.Dept = (String) obj;
    }
  
    if ((obj = record.get ("DateActive")) != null)
    {
      out.DateActive = (Date) obj;
    }
  
    if ((obj = record.get ("DateInactive")) != null)
    {
      out.DateInactive = (Date) obj;
    }
  
    if ((obj = record.get ("AddressLine1")) != null)
    {
      out.AddressLine1 = (String) obj;
    }
  
    if ((obj = record.get ("AddressLine2")) != null)
    {
      out.AddressLine2 = (String) obj;
    }
  
    if ((obj = record.get ("AddressLine3")) != null)
    {
      out.AddressLine3 = (String) obj;
    }
  
    if ((obj = record.get ("AddressLine4")) != null)
    {
      out.AddressLine4 = (String) obj;
    }
  
    if ((obj = record.get ("City")) != null)
    {
      out.City = (String) obj;
    }
  
    if ((obj = record.get ("State")) != null)
    {
      out.State = (String) obj;
    }
  
    if ((obj = record.get ("PostalCode")) != null)
    {
      out.PostalCode = (String) obj;
    }
  
    if ((obj = record.get ("CountryCode")) != null)
    {
      out.CountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("FranchiseTaxCode")) != null)
    {
      out.FranchiseTaxCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Geocode")) != null)
    {
      out.Geocode = (String) obj;
    }
  
    if ((obj = record.get ("County")) != null)
    {
      out.County = (String) obj;
    }
      return out;
  }
  /** convert Map to ContactObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return ContactObjectFilter the converted object
   */
  public static ContactObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    ContactObjectFilter out = new ContactObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = ContactObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map NamePrefixMap = (Map)record.get("NamePrefix");
    Boolean NamePrefixFetch = DataHelper.getFetch(NamePrefixMap);
    Boolean NamePrefixSortDir = DataHelper.getSortDirection(NamePrefixMap);
    Integer NamePrefixSortOrder = DataHelper.getSortOrder(NamePrefixMap);
    if (NamePrefixFetch != null) out.setNamePrefixFetch(NamePrefixFetch);
    if (NamePrefixSortDir != null) out.setNamePrefixSortDirection(NamePrefixSortDir);
    if (NamePrefixSortOrder != null) out.setNamePrefixSortOrder(NamePrefixSortOrder);

    Filter[] NamePrefixFilter = DataHelper.mapToFilterArray(NamePrefixMap, String.class);
    if (NamePrefixFilter != null) {
      StringFilter[] NamePrefixFilters = new StringFilter[NamePrefixFilter.length];
      for (int i = 0; i < NamePrefixFilters.length; i++) {
        NamePrefixFilters[i] = (StringFilter)NamePrefixFilter[i];
      }
      try {
        out.setNamePrefixFilter(NamePrefixFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FirstNameMap = (Map)record.get("FirstName");
    Boolean FirstNameFetch = DataHelper.getFetch(FirstNameMap);
    Boolean FirstNameSortDir = DataHelper.getSortDirection(FirstNameMap);
    Integer FirstNameSortOrder = DataHelper.getSortOrder(FirstNameMap);
    if (FirstNameFetch != null) out.setFirstNameFetch(FirstNameFetch);
    if (FirstNameSortDir != null) out.setFirstNameSortDirection(FirstNameSortDir);
    if (FirstNameSortOrder != null) out.setFirstNameSortOrder(FirstNameSortOrder);

    Filter[] FirstNameFilter = DataHelper.mapToFilterArray(FirstNameMap, String.class);
    if (FirstNameFilter != null) {
      StringFilter[] FirstNameFilters = new StringFilter[FirstNameFilter.length];
      for (int i = 0; i < FirstNameFilters.length; i++) {
        FirstNameFilters[i] = (StringFilter)FirstNameFilter[i];
      }
      try {
        out.setFirstNameFilter(FirstNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MiddleNameMap = (Map)record.get("MiddleName");
    Boolean MiddleNameFetch = DataHelper.getFetch(MiddleNameMap);
    Boolean MiddleNameSortDir = DataHelper.getSortDirection(MiddleNameMap);
    Integer MiddleNameSortOrder = DataHelper.getSortOrder(MiddleNameMap);
    if (MiddleNameFetch != null) out.setMiddleNameFetch(MiddleNameFetch);
    if (MiddleNameSortDir != null) out.setMiddleNameSortDirection(MiddleNameSortDir);
    if (MiddleNameSortOrder != null) out.setMiddleNameSortOrder(MiddleNameSortOrder);

    Filter[] MiddleNameFilter = DataHelper.mapToFilterArray(MiddleNameMap, String.class);
    if (MiddleNameFilter != null) {
      StringFilter[] MiddleNameFilters = new StringFilter[MiddleNameFilter.length];
      for (int i = 0; i < MiddleNameFilters.length; i++) {
        MiddleNameFilters[i] = (StringFilter)MiddleNameFilter[i];
      }
      try {
        out.setMiddleNameFilter(MiddleNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LastNameMap = (Map)record.get("LastName");
    Boolean LastNameFetch = DataHelper.getFetch(LastNameMap);
    Boolean LastNameSortDir = DataHelper.getSortDirection(LastNameMap);
    Integer LastNameSortOrder = DataHelper.getSortOrder(LastNameMap);
    if (LastNameFetch != null) out.setLastNameFetch(LastNameFetch);
    if (LastNameSortDir != null) out.setLastNameSortDirection(LastNameSortDir);
    if (LastNameSortOrder != null) out.setLastNameSortOrder(LastNameSortOrder);

    Filter[] LastNameFilter = DataHelper.mapToFilterArray(LastNameMap, String.class);
    if (LastNameFilter != null) {
      StringFilter[] LastNameFilters = new StringFilter[LastNameFilter.length];
      for (int i = 0; i < LastNameFilters.length; i++) {
        LastNameFilters[i] = (StringFilter)LastNameFilter[i];
      }
      try {
        out.setLastNameFilter(LastNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GenerationMap = (Map)record.get("Generation");
    Boolean GenerationFetch = DataHelper.getFetch(GenerationMap);
    Boolean GenerationSortDir = DataHelper.getSortDirection(GenerationMap);
    Integer GenerationSortOrder = DataHelper.getSortOrder(GenerationMap);
    if (GenerationFetch != null) out.setGenerationFetch(GenerationFetch);
    if (GenerationSortDir != null) out.setGenerationSortDirection(GenerationSortDir);
    if (GenerationSortOrder != null) out.setGenerationSortOrder(GenerationSortOrder);

    Filter[] GenerationFilter = DataHelper.mapToFilterArray(GenerationMap, String.class);
    if (GenerationFilter != null) {
      StringFilter[] GenerationFilters = new StringFilter[GenerationFilter.length];
      for (int i = 0; i < GenerationFilters.length; i++) {
        GenerationFilters[i] = (StringFilter)GenerationFilter[i];
      }
      try {
        out.setGenerationFilter(GenerationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TitleMap = (Map)record.get("Title");
    Boolean TitleFetch = DataHelper.getFetch(TitleMap);
    Boolean TitleSortDir = DataHelper.getSortDirection(TitleMap);
    Integer TitleSortOrder = DataHelper.getSortOrder(TitleMap);
    if (TitleFetch != null) out.setTitleFetch(TitleFetch);
    if (TitleSortDir != null) out.setTitleSortDirection(TitleSortDir);
    if (TitleSortOrder != null) out.setTitleSortOrder(TitleSortOrder);

    Filter[] TitleFilter = DataHelper.mapToFilterArray(TitleMap, String.class);
    if (TitleFilter != null) {
      StringFilter[] TitleFilters = new StringFilter[TitleFilter.length];
      for (int i = 0; i < TitleFilters.length; i++) {
        TitleFilters[i] = (StringFilter)TitleFilter[i];
      }
      try {
        out.setTitleFilter(TitleFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CompanyMap = (Map)record.get("Company");
    Boolean CompanyFetch = DataHelper.getFetch(CompanyMap);
    Boolean CompanySortDir = DataHelper.getSortDirection(CompanyMap);
    Integer CompanySortOrder = DataHelper.getSortOrder(CompanyMap);
    if (CompanyFetch != null) out.setCompanyFetch(CompanyFetch);
    if (CompanySortDir != null) out.setCompanySortDirection(CompanySortDir);
    if (CompanySortOrder != null) out.setCompanySortOrder(CompanySortOrder);

    Filter[] CompanyFilter = DataHelper.mapToFilterArray(CompanyMap, String.class);
    if (CompanyFilter != null) {
      StringFilter[] CompanyFilters = new StringFilter[CompanyFilter.length];
      for (int i = 0; i < CompanyFilters.length; i++) {
        CompanyFilters[i] = (StringFilter)CompanyFilter[i];
      }
      try {
        out.setCompanyFilter(CompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddressIdMap = (Map)record.get("AddressId");
    Boolean AddressIdFetch = DataHelper.getFetch(AddressIdMap);
    Boolean AddressIdSortDir = DataHelper.getSortDirection(AddressIdMap);
    Integer AddressIdSortOrder = DataHelper.getSortOrder(AddressIdMap);
    if (AddressIdFetch != null) out.setAddressIdFetch(AddressIdFetch);
    if (AddressIdSortDir != null) out.setAddressIdSortDirection(AddressIdSortDir);
    if (AddressIdSortOrder != null) out.setAddressIdSortOrder(AddressIdSortOrder);

    Filter[] AddressIdFilter = DataHelper.mapToFilterArray(AddressIdMap, BigInteger.class);
    if (AddressIdFilter != null) {
      BigIntegerFilter[] AddressIdFilters = new BigIntegerFilter[AddressIdFilter.length];
      for (int i = 0; i < AddressIdFilters.length; i++) {
        AddressIdFilters[i] = (BigIntegerFilter)AddressIdFilter[i];
      }
      try {
        out.setAddressIdFilter(AddressIdFilters);
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
  
    Map AltCompanyMap = (Map)record.get("AltCompany");
    Boolean AltCompanyFetch = DataHelper.getFetch(AltCompanyMap);
    Boolean AltCompanySortDir = DataHelper.getSortDirection(AltCompanyMap);
    Integer AltCompanySortOrder = DataHelper.getSortOrder(AltCompanyMap);
    if (AltCompanyFetch != null) out.setAltCompanyFetch(AltCompanyFetch);
    if (AltCompanySortDir != null) out.setAltCompanySortDirection(AltCompanySortDir);
    if (AltCompanySortOrder != null) out.setAltCompanySortOrder(AltCompanySortOrder);

    Filter[] AltCompanyFilter = DataHelper.mapToFilterArray(AltCompanyMap, String.class);
    if (AltCompanyFilter != null) {
      StringFilter[] AltCompanyFilters = new StringFilter[AltCompanyFilter.length];
      for (int i = 0; i < AltCompanyFilters.length; i++) {
        AltCompanyFilters[i] = (StringFilter)AltCompanyFilter[i];
      }
      try {
        out.setAltCompanyFilter(AltCompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GenderMap = (Map)record.get("Gender");
    Boolean GenderFetch = DataHelper.getFetch(GenderMap);
    Boolean GenderSortDir = DataHelper.getSortDirection(GenderMap);
    Integer GenderSortOrder = DataHelper.getSortOrder(GenderMap);
    if (GenderFetch != null) out.setGenderFetch(GenderFetch);
    if (GenderSortDir != null) out.setGenderSortDirection(GenderSortDir);
    if (GenderSortOrder != null) out.setGenderSortOrder(GenderSortOrder);

    Filter[] GenderFilter = DataHelper.mapToFilterArray(GenderMap, Integer.class);
    if (GenderFilter != null) {
      IntegerFilter[] GenderFilters = new IntegerFilter[GenderFilter.length];
      for (int i = 0; i < GenderFilters.length; i++) {
        GenderFilters[i] = (IntegerFilter)GenderFilter[i];
      }
      try {
        out.setGenderFilter(GenderFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DeptMap = (Map)record.get("Dept");
    Boolean DeptFetch = DataHelper.getFetch(DeptMap);
    Boolean DeptSortDir = DataHelper.getSortDirection(DeptMap);
    Integer DeptSortOrder = DataHelper.getSortOrder(DeptMap);
    if (DeptFetch != null) out.setDeptFetch(DeptFetch);
    if (DeptSortDir != null) out.setDeptSortDirection(DeptSortDir);
    if (DeptSortOrder != null) out.setDeptSortOrder(DeptSortOrder);

    Filter[] DeptFilter = DataHelper.mapToFilterArray(DeptMap, String.class);
    if (DeptFilter != null) {
      StringFilter[] DeptFilters = new StringFilter[DeptFilter.length];
      for (int i = 0; i < DeptFilters.length; i++) {
        DeptFilters[i] = (StringFilter)DeptFilter[i];
      }
      try {
        out.setDeptFilter(DeptFilters);
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
  
    Map AddressLine1Map = (Map)record.get("AddressLine1");
    Boolean AddressLine1Fetch = DataHelper.getFetch(AddressLine1Map);
    Boolean AddressLine1SortDir = DataHelper.getSortDirection(AddressLine1Map);
    Integer AddressLine1SortOrder = DataHelper.getSortOrder(AddressLine1Map);
    if (AddressLine1Fetch != null) out.setAddressLine1Fetch(AddressLine1Fetch);
    if (AddressLine1SortDir != null) out.setAddressLine1SortDirection(AddressLine1SortDir);
    if (AddressLine1SortOrder != null) out.setAddressLine1SortOrder(AddressLine1SortOrder);

    Filter[] AddressLine1Filter = DataHelper.mapToFilterArray(AddressLine1Map, String.class);
    if (AddressLine1Filter != null) {
      StringFilter[] AddressLine1Filters = new StringFilter[AddressLine1Filter.length];
      for (int i = 0; i < AddressLine1Filters.length; i++) {
        AddressLine1Filters[i] = (StringFilter)AddressLine1Filter[i];
      }
      try {
        out.setAddressLine1Filter(AddressLine1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddressLine2Map = (Map)record.get("AddressLine2");
    Boolean AddressLine2Fetch = DataHelper.getFetch(AddressLine2Map);
    Boolean AddressLine2SortDir = DataHelper.getSortDirection(AddressLine2Map);
    Integer AddressLine2SortOrder = DataHelper.getSortOrder(AddressLine2Map);
    if (AddressLine2Fetch != null) out.setAddressLine2Fetch(AddressLine2Fetch);
    if (AddressLine2SortDir != null) out.setAddressLine2SortDirection(AddressLine2SortDir);
    if (AddressLine2SortOrder != null) out.setAddressLine2SortOrder(AddressLine2SortOrder);

    Filter[] AddressLine2Filter = DataHelper.mapToFilterArray(AddressLine2Map, String.class);
    if (AddressLine2Filter != null) {
      StringFilter[] AddressLine2Filters = new StringFilter[AddressLine2Filter.length];
      for (int i = 0; i < AddressLine2Filters.length; i++) {
        AddressLine2Filters[i] = (StringFilter)AddressLine2Filter[i];
      }
      try {
        out.setAddressLine2Filter(AddressLine2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddressLine3Map = (Map)record.get("AddressLine3");
    Boolean AddressLine3Fetch = DataHelper.getFetch(AddressLine3Map);
    Boolean AddressLine3SortDir = DataHelper.getSortDirection(AddressLine3Map);
    Integer AddressLine3SortOrder = DataHelper.getSortOrder(AddressLine3Map);
    if (AddressLine3Fetch != null) out.setAddressLine3Fetch(AddressLine3Fetch);
    if (AddressLine3SortDir != null) out.setAddressLine3SortDirection(AddressLine3SortDir);
    if (AddressLine3SortOrder != null) out.setAddressLine3SortOrder(AddressLine3SortOrder);

    Filter[] AddressLine3Filter = DataHelper.mapToFilterArray(AddressLine3Map, String.class);
    if (AddressLine3Filter != null) {
      StringFilter[] AddressLine3Filters = new StringFilter[AddressLine3Filter.length];
      for (int i = 0; i < AddressLine3Filters.length; i++) {
        AddressLine3Filters[i] = (StringFilter)AddressLine3Filter[i];
      }
      try {
        out.setAddressLine3Filter(AddressLine3Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AddressLine4Map = (Map)record.get("AddressLine4");
    Boolean AddressLine4Fetch = DataHelper.getFetch(AddressLine4Map);
    Boolean AddressLine4SortDir = DataHelper.getSortDirection(AddressLine4Map);
    Integer AddressLine4SortOrder = DataHelper.getSortOrder(AddressLine4Map);
    if (AddressLine4Fetch != null) out.setAddressLine4Fetch(AddressLine4Fetch);
    if (AddressLine4SortDir != null) out.setAddressLine4SortDirection(AddressLine4SortDir);
    if (AddressLine4SortOrder != null) out.setAddressLine4SortOrder(AddressLine4SortOrder);

    Filter[] AddressLine4Filter = DataHelper.mapToFilterArray(AddressLine4Map, String.class);
    if (AddressLine4Filter != null) {
      StringFilter[] AddressLine4Filters = new StringFilter[AddressLine4Filter.length];
      for (int i = 0; i < AddressLine4Filters.length; i++) {
        AddressLine4Filters[i] = (StringFilter)AddressLine4Filter[i];
      }
      try {
        out.setAddressLine4Filter(AddressLine4Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CityMap = (Map)record.get("City");
    Boolean CityFetch = DataHelper.getFetch(CityMap);
    Boolean CitySortDir = DataHelper.getSortDirection(CityMap);
    Integer CitySortOrder = DataHelper.getSortOrder(CityMap);
    if (CityFetch != null) out.setCityFetch(CityFetch);
    if (CitySortDir != null) out.setCitySortDirection(CitySortDir);
    if (CitySortOrder != null) out.setCitySortOrder(CitySortOrder);

    Filter[] CityFilter = DataHelper.mapToFilterArray(CityMap, String.class);
    if (CityFilter != null) {
      StringFilter[] CityFilters = new StringFilter[CityFilter.length];
      for (int i = 0; i < CityFilters.length; i++) {
        CityFilters[i] = (StringFilter)CityFilter[i];
      }
      try {
        out.setCityFilter(CityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StateMap = (Map)record.get("State");
    Boolean StateFetch = DataHelper.getFetch(StateMap);
    Boolean StateSortDir = DataHelper.getSortDirection(StateMap);
    Integer StateSortOrder = DataHelper.getSortOrder(StateMap);
    if (StateFetch != null) out.setStateFetch(StateFetch);
    if (StateSortDir != null) out.setStateSortDirection(StateSortDir);
    if (StateSortOrder != null) out.setStateSortOrder(StateSortOrder);

    Filter[] StateFilter = DataHelper.mapToFilterArray(StateMap, String.class);
    if (StateFilter != null) {
      StringFilter[] StateFilters = new StringFilter[StateFilter.length];
      for (int i = 0; i < StateFilters.length; i++) {
        StateFilters[i] = (StringFilter)StateFilter[i];
      }
      try {
        out.setStateFilter(StateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PostalCodeMap = (Map)record.get("PostalCode");
    Boolean PostalCodeFetch = DataHelper.getFetch(PostalCodeMap);
    Boolean PostalCodeSortDir = DataHelper.getSortDirection(PostalCodeMap);
    Integer PostalCodeSortOrder = DataHelper.getSortOrder(PostalCodeMap);
    if (PostalCodeFetch != null) out.setPostalCodeFetch(PostalCodeFetch);
    if (PostalCodeSortDir != null) out.setPostalCodeSortDirection(PostalCodeSortDir);
    if (PostalCodeSortOrder != null) out.setPostalCodeSortOrder(PostalCodeSortOrder);

    Filter[] PostalCodeFilter = DataHelper.mapToFilterArray(PostalCodeMap, String.class);
    if (PostalCodeFilter != null) {
      StringFilter[] PostalCodeFilters = new StringFilter[PostalCodeFilter.length];
      for (int i = 0; i < PostalCodeFilters.length; i++) {
        PostalCodeFilters[i] = (StringFilter)PostalCodeFilter[i];
      }
      try {
        out.setPostalCodeFilter(PostalCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountryCodeMap = (Map)record.get("CountryCode");
    Boolean CountryCodeFetch = DataHelper.getFetch(CountryCodeMap);
    Boolean CountryCodeSortDir = DataHelper.getSortDirection(CountryCodeMap);
    Integer CountryCodeSortOrder = DataHelper.getSortOrder(CountryCodeMap);
    if (CountryCodeFetch != null) out.setCountryCodeFetch(CountryCodeFetch);
    if (CountryCodeSortDir != null) out.setCountryCodeSortDirection(CountryCodeSortDir);
    if (CountryCodeSortOrder != null) out.setCountryCodeSortOrder(CountryCodeSortOrder);

    Filter[] CountryCodeFilter = DataHelper.mapToFilterArray(CountryCodeMap, Integer.class);
    if (CountryCodeFilter != null) {
      IntegerFilter[] CountryCodeFilters = new IntegerFilter[CountryCodeFilter.length];
      for (int i = 0; i < CountryCodeFilters.length; i++) {
        CountryCodeFilters[i] = (IntegerFilter)CountryCodeFilter[i];
      }
      try {
        out.setCountryCodeFilter(CountryCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FranchiseTaxCodeMap = (Map)record.get("FranchiseTaxCode");
    Boolean FranchiseTaxCodeFetch = DataHelper.getFetch(FranchiseTaxCodeMap);
    Boolean FranchiseTaxCodeSortDir = DataHelper.getSortDirection(FranchiseTaxCodeMap);
    Integer FranchiseTaxCodeSortOrder = DataHelper.getSortOrder(FranchiseTaxCodeMap);
    if (FranchiseTaxCodeFetch != null) out.setFranchiseTaxCodeFetch(FranchiseTaxCodeFetch);
    if (FranchiseTaxCodeSortDir != null) out.setFranchiseTaxCodeSortDirection(FranchiseTaxCodeSortDir);
    if (FranchiseTaxCodeSortOrder != null) out.setFranchiseTaxCodeSortOrder(FranchiseTaxCodeSortOrder);

    Filter[] FranchiseTaxCodeFilter = DataHelper.mapToFilterArray(FranchiseTaxCodeMap, Integer.class);
    if (FranchiseTaxCodeFilter != null) {
      IntegerFilter[] FranchiseTaxCodeFilters = new IntegerFilter[FranchiseTaxCodeFilter.length];
      for (int i = 0; i < FranchiseTaxCodeFilters.length; i++) {
        FranchiseTaxCodeFilters[i] = (IntegerFilter)FranchiseTaxCodeFilter[i];
      }
      try {
        out.setFranchiseTaxCodeFilter(FranchiseTaxCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GeocodeMap = (Map)record.get("Geocode");
    Boolean GeocodeFetch = DataHelper.getFetch(GeocodeMap);
    Boolean GeocodeSortDir = DataHelper.getSortDirection(GeocodeMap);
    Integer GeocodeSortOrder = DataHelper.getSortOrder(GeocodeMap);
    if (GeocodeFetch != null) out.setGeocodeFetch(GeocodeFetch);
    if (GeocodeSortDir != null) out.setGeocodeSortDirection(GeocodeSortDir);
    if (GeocodeSortOrder != null) out.setGeocodeSortOrder(GeocodeSortOrder);

    Filter[] GeocodeFilter = DataHelper.mapToFilterArray(GeocodeMap, String.class);
    if (GeocodeFilter != null) {
      StringFilter[] GeocodeFilters = new StringFilter[GeocodeFilter.length];
      for (int i = 0; i < GeocodeFilters.length; i++) {
        GeocodeFilters[i] = (StringFilter)GeocodeFilter[i];
      }
      try {
        out.setGeocodeFilter(GeocodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountyMap = (Map)record.get("County");
    Boolean CountyFetch = DataHelper.getFetch(CountyMap);
    Boolean CountySortDir = DataHelper.getSortDirection(CountyMap);
    Integer CountySortOrder = DataHelper.getSortOrder(CountyMap);
    if (CountyFetch != null) out.setCountyFetch(CountyFetch);
    if (CountySortDir != null) out.setCountySortDirection(CountySortDir);
    if (CountySortOrder != null) out.setCountySortOrder(CountySortOrder);

    Filter[] CountyFilter = DataHelper.mapToFilterArray(CountyMap, String.class);
    if (CountyFilter != null) {
      StringFilter[] CountyFilters = new StringFilter[CountyFilter.length];
      for (int i = 0; i < CountyFilters.length; i++) {
        CountyFilters[i] = (StringFilter)CountyFilter[i];
      }
      try {
        out.setCountyFilter(CountyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
