/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TaxExemptionObjectHelper.java
 * Definition File: Customer/TaxExemption.xml
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



/** Helper class to convert TaxExemptionObject JavaBean objects to/from HashMaps.
 */
public class TaxExemptionObjectHelper implements ArubaObjectHelper
{
  /** convert TaxExemptionObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (TaxExemptionObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxExemptionObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxExemptionObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxExemptionObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxExemptionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert TaxExemptionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (TaxExemptionObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert TaxExemptionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "TaxExemptionObject")
   * @return Map     the output Map
   */
  public static Map toMap (TaxExemptionObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "TaxExemptionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to TaxExemptionObjectData.
   * @param record the Map containing the data to convert to the object
   * @return TaxExemptionObjectData the converted object
   */
  public static TaxExemptionObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to TaxExemptionObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "TaxExemptionObject")
   * @return TaxExemptionObjectData the converted object
   */
  public static TaxExemptionObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxExemptionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to TaxExemptionObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return TaxExemptionObjectFilter the converted object
   */
  public static TaxExemptionObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to TaxExemptionObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "TaxExemptionObject")
   * @return TaxExemptionObjectFilter the converted object
   */
  public static TaxExemptionObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxExemptionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to TaxExemptionObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return TaxExemptionObjectDataList the converted object
   */
  public static TaxExemptionObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to TaxExemptionObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "TaxExemptionObjectList")
   * @return TaxExemptionObjectDataList the converted object
   */
  public static TaxExemptionObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "TaxExemptionObjectList";
    Object[] root = (Object[]) record.get (rootName);
    TaxExemptionObjectData[] array = null;
    if (root != null)
    {
      array = new TaxExemptionObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = TaxExemptionObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new TaxExemptionObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new TaxExemptionObjectDataList (array, index, total);
  }
  /** convert TaxExemptionObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxExemptionObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", TaxExemptionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    if (in._TaxStatusSet) record.put ("TaxStatus", in.TaxStatus);
  
    if (in._CertificateSet) record.put ("Certificate", in.Certificate);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._DateExpirationSet) record.put ("DateExpiration", in.DateExpiration);
  
    if (in._ExemptFederalSet) record.put ("ExemptFederal", in.ExemptFederal);
  
    if (in._ExemptStateSet) record.put ("ExemptState", in.ExemptState);
  
    if (in._ExemptCountySet) record.put ("ExemptCounty", in.ExemptCounty);
  
    if (in._ExemptCitySet) record.put ("ExemptCity", in.ExemptCity);
  
    if (in._ExemptOtherSet) record.put ("ExemptOther", in.ExemptOther);
  
    if (in._TaxTypeCodeSet) record.put ("TaxTypeCode", in.TaxTypeCode);
  
    if (in._CountryCodeSet) record.put ("CountryCode", in.CountryCode);
  
    if (in._FranchiseCodeSet) record.put ("FranchiseCode", in.FranchiseCode);
  
    if (in._StateCodeSet) record.put ("StateCode", in.StateCode);
  
    if (in._CountyCodeSet) record.put ("CountyCode", in.CountyCode);
  
    if (in._CityCodeSet) record.put ("CityCode", in.CityCode);
  
    if (in._StateSet) record.put ("State", in.State);
  
    if (in._CountySet) record.put ("County", in.County);
  
    if (in._CitySet) record.put ("City", in.City);
      return record;
  }
  /** convert TaxExemptionObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (TaxExemptionObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", TaxExemptionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
      map = DataHelper.filterToMap (in.TaxStatus, in.TaxStatusSort, in.TaxStatusSortAscending, in.TaxStatusFetch);
      if (map != null) record.put ("TaxStatus", map);
      map = DataHelper.filterToMap (in.Certificate, in.CertificateSort, in.CertificateSortAscending, in.CertificateFetch, in.CertificateCaseInsensitive);
      if (map != null) record.put ("Certificate", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
      map = DataHelper.filterToMap (in.DateExpiration, in.DateExpirationSort, in.DateExpirationSortAscending, in.DateExpirationFetch);
      if (map != null) record.put ("DateExpiration", map);
      map = DataHelper.filterToMap (in.ExemptFederal, in.ExemptFederalSort, in.ExemptFederalSortAscending, in.ExemptFederalFetch);
      if (map != null) record.put ("ExemptFederal", map);
      map = DataHelper.filterToMap (in.ExemptState, in.ExemptStateSort, in.ExemptStateSortAscending, in.ExemptStateFetch);
      if (map != null) record.put ("ExemptState", map);
      map = DataHelper.filterToMap (in.ExemptCounty, in.ExemptCountySort, in.ExemptCountySortAscending, in.ExemptCountyFetch);
      if (map != null) record.put ("ExemptCounty", map);
      map = DataHelper.filterToMap (in.ExemptCity, in.ExemptCitySort, in.ExemptCitySortAscending, in.ExemptCityFetch);
      if (map != null) record.put ("ExemptCity", map);
      map = DataHelper.filterToMap (in.ExemptOther, in.ExemptOtherSort, in.ExemptOtherSortAscending, in.ExemptOtherFetch);
      if (map != null) record.put ("ExemptOther", map);
      map = DataHelper.filterToMap (in.TaxTypeCode, in.TaxTypeCodeSort, in.TaxTypeCodeSortAscending, in.TaxTypeCodeFetch);
      if (map != null) record.put ("TaxTypeCode", map);
      map = DataHelper.filterToMap (in.CountryCode, in.CountryCodeSort, in.CountryCodeSortAscending, in.CountryCodeFetch);
      if (map != null) record.put ("CountryCode", map);
      map = DataHelper.filterToMap (in.FranchiseCode, in.FranchiseCodeSort, in.FranchiseCodeSortAscending, in.FranchiseCodeFetch);
      if (map != null) record.put ("FranchiseCode", map);
      map = DataHelper.filterToMap (in.StateCode, in.StateCodeSort, in.StateCodeSortAscending, in.StateCodeFetch);
      if (map != null) record.put ("StateCode", map);
      map = DataHelper.filterToMap (in.CountyCode, in.CountyCodeSort, in.CountyCodeSortAscending, in.CountyCodeFetch);
      if (map != null) record.put ("CountyCode", map);
      map = DataHelper.filterToMap (in.CityCode, in.CityCodeSort, in.CityCodeSortAscending, in.CityCodeFetch);
      if (map != null) record.put ("CityCode", map);
      map = DataHelper.filterToMap (in.State, in.StateSort, in.StateSortAscending, in.StateFetch, in.StateCaseInsensitive);
      if (map != null) record.put ("State", map);
      map = DataHelper.filterToMap (in.County, in.CountySort, in.CountySortAscending, in.CountyFetch, in.CountyCaseInsensitive);
      if (map != null) record.put ("County", map);
      map = DataHelper.filterToMap (in.City, in.CitySort, in.CitySortAscending, in.CityFetch, in.CityCaseInsensitive);
      if (map != null) record.put ("City", map);
    return record;
  }
  /** convert Map to TaxExemptionObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxExemptionObjectData the converted object
   */
  public static TaxExemptionObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxExemptionObjectData out = new TaxExemptionObjectData ();

    out.Key = TaxExemptionObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxStatus")) != null)
    {
      out.TaxStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("Certificate")) != null)
    {
      out.Certificate = (String) obj;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("DateExpiration")) != null)
    {
      out.DateExpiration = (Date) obj;
    }
  
    if ((obj = record.get ("ExemptFederal")) != null)
    {
      out.ExemptFederal = (Boolean) obj;
    }
  
    if ((obj = record.get ("ExemptState")) != null)
    {
      out.ExemptState = (Boolean) obj;
    }
  
    if ((obj = record.get ("ExemptCounty")) != null)
    {
      out.ExemptCounty = (Boolean) obj;
    }
  
    if ((obj = record.get ("ExemptCity")) != null)
    {
      out.ExemptCity = (Boolean) obj;
    }
  
    if ((obj = record.get ("ExemptOther")) != null)
    {
      out.ExemptOther = (Boolean) obj;
    }
  
    if ((obj = record.get ("TaxTypeCode")) != null)
    {
      out.TaxTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("CountryCode")) != null)
    {
      out.CountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("FranchiseCode")) != null)
    {
      out.FranchiseCode = (Integer) obj;
    }
  
    if ((obj = record.get ("StateCode")) != null)
    {
      out.StateCode = (Integer) obj;
    }
  
    if ((obj = record.get ("CountyCode")) != null)
    {
      out.CountyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("CityCode")) != null)
    {
      out.CityCode = (Integer) obj;
    }
  
    if ((obj = record.get ("State")) != null)
    {
      out.State = (String) obj;
    }
  
    if ((obj = record.get ("County")) != null)
    {
      out.County = (String) obj;
    }
  
    if ((obj = record.get ("City")) != null)
    {
      out.City = (String) obj;
    }
      return out;
  }
  /** convert Map to TaxExemptionObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return TaxExemptionObjectFilter the converted object
   */
  public static TaxExemptionObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    TaxExemptionObjectFilter out = new TaxExemptionObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = TaxExemptionObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map TaxPkgInstIdMap = (Map)record.get("TaxPkgInstId");
    Boolean TaxPkgInstIdFetch = DataHelper.getFetch(TaxPkgInstIdMap);
    Boolean TaxPkgInstIdSortDir = DataHelper.getSortDirection(TaxPkgInstIdMap);
    Integer TaxPkgInstIdSortOrder = DataHelper.getSortOrder(TaxPkgInstIdMap);
    if (TaxPkgInstIdFetch != null) out.setTaxPkgInstIdFetch(TaxPkgInstIdFetch);
    if (TaxPkgInstIdSortDir != null) out.setTaxPkgInstIdSortDirection(TaxPkgInstIdSortDir);
    if (TaxPkgInstIdSortOrder != null) out.setTaxPkgInstIdSortOrder(TaxPkgInstIdSortOrder);

    Filter[] TaxPkgInstIdFilter = DataHelper.mapToFilterArray(TaxPkgInstIdMap, Integer.class);
    if (TaxPkgInstIdFilter != null) {
      IntegerFilter[] TaxPkgInstIdFilters = new IntegerFilter[TaxPkgInstIdFilter.length];
      for (int i = 0; i < TaxPkgInstIdFilters.length; i++) {
        TaxPkgInstIdFilters[i] = (IntegerFilter)TaxPkgInstIdFilter[i];
      }
      try {
        out.setTaxPkgInstIdFilter(TaxPkgInstIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxStatusMap = (Map)record.get("TaxStatus");
    Boolean TaxStatusFetch = DataHelper.getFetch(TaxStatusMap);
    Boolean TaxStatusSortDir = DataHelper.getSortDirection(TaxStatusMap);
    Integer TaxStatusSortOrder = DataHelper.getSortOrder(TaxStatusMap);
    if (TaxStatusFetch != null) out.setTaxStatusFetch(TaxStatusFetch);
    if (TaxStatusSortDir != null) out.setTaxStatusSortDirection(TaxStatusSortDir);
    if (TaxStatusSortOrder != null) out.setTaxStatusSortOrder(TaxStatusSortOrder);

    Filter[] TaxStatusFilter = DataHelper.mapToFilterArray(TaxStatusMap, Integer.class);
    if (TaxStatusFilter != null) {
      IntegerFilter[] TaxStatusFilters = new IntegerFilter[TaxStatusFilter.length];
      for (int i = 0; i < TaxStatusFilters.length; i++) {
        TaxStatusFilters[i] = (IntegerFilter)TaxStatusFilter[i];
      }
      try {
        out.setTaxStatusFilter(TaxStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CertificateMap = (Map)record.get("Certificate");
    Boolean CertificateFetch = DataHelper.getFetch(CertificateMap);
    Boolean CertificateSortDir = DataHelper.getSortDirection(CertificateMap);
    Integer CertificateSortOrder = DataHelper.getSortOrder(CertificateMap);
    if (CertificateFetch != null) out.setCertificateFetch(CertificateFetch);
    if (CertificateSortDir != null) out.setCertificateSortDirection(CertificateSortDir);
    if (CertificateSortOrder != null) out.setCertificateSortOrder(CertificateSortOrder);

    Filter[] CertificateFilter = DataHelper.mapToFilterArray(CertificateMap, String.class);
    if (CertificateFilter != null) {
      StringFilter[] CertificateFilters = new StringFilter[CertificateFilter.length];
      for (int i = 0; i < CertificateFilters.length; i++) {
        CertificateFilters[i] = (StringFilter)CertificateFilter[i];
      }
      try {
        out.setCertificateFilter(CertificateFilters);
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
  
    Map DateExpirationMap = (Map)record.get("DateExpiration");
    Boolean DateExpirationFetch = DataHelper.getFetch(DateExpirationMap);
    Boolean DateExpirationSortDir = DataHelper.getSortDirection(DateExpirationMap);
    Integer DateExpirationSortOrder = DataHelper.getSortOrder(DateExpirationMap);
    if (DateExpirationFetch != null) out.setDateExpirationFetch(DateExpirationFetch);
    if (DateExpirationSortDir != null) out.setDateExpirationSortDirection(DateExpirationSortDir);
    if (DateExpirationSortOrder != null) out.setDateExpirationSortOrder(DateExpirationSortOrder);

    Filter[] DateExpirationFilter = DataHelper.mapToFilterArray(DateExpirationMap, Date.class);
    if (DateExpirationFilter != null) {
      DateFilter[] DateExpirationFilters = new DateFilter[DateExpirationFilter.length];
      for (int i = 0; i < DateExpirationFilters.length; i++) {
        DateExpirationFilters[i] = (DateFilter)DateExpirationFilter[i];
      }
      try {
        out.setDateExpirationFilter(DateExpirationFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExemptFederalMap = (Map)record.get("ExemptFederal");
    Boolean ExemptFederalFetch = DataHelper.getFetch(ExemptFederalMap);
    Boolean ExemptFederalSortDir = DataHelper.getSortDirection(ExemptFederalMap);
    Integer ExemptFederalSortOrder = DataHelper.getSortOrder(ExemptFederalMap);
    if (ExemptFederalFetch != null) out.setExemptFederalFetch(ExemptFederalFetch);
    if (ExemptFederalSortDir != null) out.setExemptFederalSortDirection(ExemptFederalSortDir);
    if (ExemptFederalSortOrder != null) out.setExemptFederalSortOrder(ExemptFederalSortOrder);

    Filter[] ExemptFederalFilter = DataHelper.mapToFilterArray(ExemptFederalMap, Boolean.class);
    if (ExemptFederalFilter != null) {
      BooleanFilter[] ExemptFederalFilters = new BooleanFilter[ExemptFederalFilter.length];
      for (int i = 0; i < ExemptFederalFilters.length; i++) {
        ExemptFederalFilters[i] = (BooleanFilter)ExemptFederalFilter[i];
      }
      try {
        out.setExemptFederalFilter(ExemptFederalFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExemptStateMap = (Map)record.get("ExemptState");
    Boolean ExemptStateFetch = DataHelper.getFetch(ExemptStateMap);
    Boolean ExemptStateSortDir = DataHelper.getSortDirection(ExemptStateMap);
    Integer ExemptStateSortOrder = DataHelper.getSortOrder(ExemptStateMap);
    if (ExemptStateFetch != null) out.setExemptStateFetch(ExemptStateFetch);
    if (ExemptStateSortDir != null) out.setExemptStateSortDirection(ExemptStateSortDir);
    if (ExemptStateSortOrder != null) out.setExemptStateSortOrder(ExemptStateSortOrder);

    Filter[] ExemptStateFilter = DataHelper.mapToFilterArray(ExemptStateMap, Boolean.class);
    if (ExemptStateFilter != null) {
      BooleanFilter[] ExemptStateFilters = new BooleanFilter[ExemptStateFilter.length];
      for (int i = 0; i < ExemptStateFilters.length; i++) {
        ExemptStateFilters[i] = (BooleanFilter)ExemptStateFilter[i];
      }
      try {
        out.setExemptStateFilter(ExemptStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExemptCountyMap = (Map)record.get("ExemptCounty");
    Boolean ExemptCountyFetch = DataHelper.getFetch(ExemptCountyMap);
    Boolean ExemptCountySortDir = DataHelper.getSortDirection(ExemptCountyMap);
    Integer ExemptCountySortOrder = DataHelper.getSortOrder(ExemptCountyMap);
    if (ExemptCountyFetch != null) out.setExemptCountyFetch(ExemptCountyFetch);
    if (ExemptCountySortDir != null) out.setExemptCountySortDirection(ExemptCountySortDir);
    if (ExemptCountySortOrder != null) out.setExemptCountySortOrder(ExemptCountySortOrder);

    Filter[] ExemptCountyFilter = DataHelper.mapToFilterArray(ExemptCountyMap, Boolean.class);
    if (ExemptCountyFilter != null) {
      BooleanFilter[] ExemptCountyFilters = new BooleanFilter[ExemptCountyFilter.length];
      for (int i = 0; i < ExemptCountyFilters.length; i++) {
        ExemptCountyFilters[i] = (BooleanFilter)ExemptCountyFilter[i];
      }
      try {
        out.setExemptCountyFilter(ExemptCountyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExemptCityMap = (Map)record.get("ExemptCity");
    Boolean ExemptCityFetch = DataHelper.getFetch(ExemptCityMap);
    Boolean ExemptCitySortDir = DataHelper.getSortDirection(ExemptCityMap);
    Integer ExemptCitySortOrder = DataHelper.getSortOrder(ExemptCityMap);
    if (ExemptCityFetch != null) out.setExemptCityFetch(ExemptCityFetch);
    if (ExemptCitySortDir != null) out.setExemptCitySortDirection(ExemptCitySortDir);
    if (ExemptCitySortOrder != null) out.setExemptCitySortOrder(ExemptCitySortOrder);

    Filter[] ExemptCityFilter = DataHelper.mapToFilterArray(ExemptCityMap, Boolean.class);
    if (ExemptCityFilter != null) {
      BooleanFilter[] ExemptCityFilters = new BooleanFilter[ExemptCityFilter.length];
      for (int i = 0; i < ExemptCityFilters.length; i++) {
        ExemptCityFilters[i] = (BooleanFilter)ExemptCityFilter[i];
      }
      try {
        out.setExemptCityFilter(ExemptCityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExemptOtherMap = (Map)record.get("ExemptOther");
    Boolean ExemptOtherFetch = DataHelper.getFetch(ExemptOtherMap);
    Boolean ExemptOtherSortDir = DataHelper.getSortDirection(ExemptOtherMap);
    Integer ExemptOtherSortOrder = DataHelper.getSortOrder(ExemptOtherMap);
    if (ExemptOtherFetch != null) out.setExemptOtherFetch(ExemptOtherFetch);
    if (ExemptOtherSortDir != null) out.setExemptOtherSortDirection(ExemptOtherSortDir);
    if (ExemptOtherSortOrder != null) out.setExemptOtherSortOrder(ExemptOtherSortOrder);

    Filter[] ExemptOtherFilter = DataHelper.mapToFilterArray(ExemptOtherMap, Boolean.class);
    if (ExemptOtherFilter != null) {
      BooleanFilter[] ExemptOtherFilters = new BooleanFilter[ExemptOtherFilter.length];
      for (int i = 0; i < ExemptOtherFilters.length; i++) {
        ExemptOtherFilters[i] = (BooleanFilter)ExemptOtherFilter[i];
      }
      try {
        out.setExemptOtherFilter(ExemptOtherFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxTypeCodeMap = (Map)record.get("TaxTypeCode");
    Boolean TaxTypeCodeFetch = DataHelper.getFetch(TaxTypeCodeMap);
    Boolean TaxTypeCodeSortDir = DataHelper.getSortDirection(TaxTypeCodeMap);
    Integer TaxTypeCodeSortOrder = DataHelper.getSortOrder(TaxTypeCodeMap);
    if (TaxTypeCodeFetch != null) out.setTaxTypeCodeFetch(TaxTypeCodeFetch);
    if (TaxTypeCodeSortDir != null) out.setTaxTypeCodeSortDirection(TaxTypeCodeSortDir);
    if (TaxTypeCodeSortOrder != null) out.setTaxTypeCodeSortOrder(TaxTypeCodeSortOrder);

    Filter[] TaxTypeCodeFilter = DataHelper.mapToFilterArray(TaxTypeCodeMap, Integer.class);
    if (TaxTypeCodeFilter != null) {
      IntegerFilter[] TaxTypeCodeFilters = new IntegerFilter[TaxTypeCodeFilter.length];
      for (int i = 0; i < TaxTypeCodeFilters.length; i++) {
        TaxTypeCodeFilters[i] = (IntegerFilter)TaxTypeCodeFilter[i];
      }
      try {
        out.setTaxTypeCodeFilter(TaxTypeCodeFilters);
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
  
    Map FranchiseCodeMap = (Map)record.get("FranchiseCode");
    Boolean FranchiseCodeFetch = DataHelper.getFetch(FranchiseCodeMap);
    Boolean FranchiseCodeSortDir = DataHelper.getSortDirection(FranchiseCodeMap);
    Integer FranchiseCodeSortOrder = DataHelper.getSortOrder(FranchiseCodeMap);
    if (FranchiseCodeFetch != null) out.setFranchiseCodeFetch(FranchiseCodeFetch);
    if (FranchiseCodeSortDir != null) out.setFranchiseCodeSortDirection(FranchiseCodeSortDir);
    if (FranchiseCodeSortOrder != null) out.setFranchiseCodeSortOrder(FranchiseCodeSortOrder);

    Filter[] FranchiseCodeFilter = DataHelper.mapToFilterArray(FranchiseCodeMap, Integer.class);
    if (FranchiseCodeFilter != null) {
      IntegerFilter[] FranchiseCodeFilters = new IntegerFilter[FranchiseCodeFilter.length];
      for (int i = 0; i < FranchiseCodeFilters.length; i++) {
        FranchiseCodeFilters[i] = (IntegerFilter)FranchiseCodeFilter[i];
      }
      try {
        out.setFranchiseCodeFilter(FranchiseCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StateCodeMap = (Map)record.get("StateCode");
    Boolean StateCodeFetch = DataHelper.getFetch(StateCodeMap);
    Boolean StateCodeSortDir = DataHelper.getSortDirection(StateCodeMap);
    Integer StateCodeSortOrder = DataHelper.getSortOrder(StateCodeMap);
    if (StateCodeFetch != null) out.setStateCodeFetch(StateCodeFetch);
    if (StateCodeSortDir != null) out.setStateCodeSortDirection(StateCodeSortDir);
    if (StateCodeSortOrder != null) out.setStateCodeSortOrder(StateCodeSortOrder);

    Filter[] StateCodeFilter = DataHelper.mapToFilterArray(StateCodeMap, Integer.class);
    if (StateCodeFilter != null) {
      IntegerFilter[] StateCodeFilters = new IntegerFilter[StateCodeFilter.length];
      for (int i = 0; i < StateCodeFilters.length; i++) {
        StateCodeFilters[i] = (IntegerFilter)StateCodeFilter[i];
      }
      try {
        out.setStateCodeFilter(StateCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CountyCodeMap = (Map)record.get("CountyCode");
    Boolean CountyCodeFetch = DataHelper.getFetch(CountyCodeMap);
    Boolean CountyCodeSortDir = DataHelper.getSortDirection(CountyCodeMap);
    Integer CountyCodeSortOrder = DataHelper.getSortOrder(CountyCodeMap);
    if (CountyCodeFetch != null) out.setCountyCodeFetch(CountyCodeFetch);
    if (CountyCodeSortDir != null) out.setCountyCodeSortDirection(CountyCodeSortDir);
    if (CountyCodeSortOrder != null) out.setCountyCodeSortOrder(CountyCodeSortOrder);

    Filter[] CountyCodeFilter = DataHelper.mapToFilterArray(CountyCodeMap, Integer.class);
    if (CountyCodeFilter != null) {
      IntegerFilter[] CountyCodeFilters = new IntegerFilter[CountyCodeFilter.length];
      for (int i = 0; i < CountyCodeFilters.length; i++) {
        CountyCodeFilters[i] = (IntegerFilter)CountyCodeFilter[i];
      }
      try {
        out.setCountyCodeFilter(CountyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CityCodeMap = (Map)record.get("CityCode");
    Boolean CityCodeFetch = DataHelper.getFetch(CityCodeMap);
    Boolean CityCodeSortDir = DataHelper.getSortDirection(CityCodeMap);
    Integer CityCodeSortOrder = DataHelper.getSortOrder(CityCodeMap);
    if (CityCodeFetch != null) out.setCityCodeFetch(CityCodeFetch);
    if (CityCodeSortDir != null) out.setCityCodeSortDirection(CityCodeSortDir);
    if (CityCodeSortOrder != null) out.setCityCodeSortOrder(CityCodeSortOrder);

    Filter[] CityCodeFilter = DataHelper.mapToFilterArray(CityCodeMap, Integer.class);
    if (CityCodeFilter != null) {
      IntegerFilter[] CityCodeFilters = new IntegerFilter[CityCodeFilter.length];
      for (int i = 0; i < CityCodeFilters.length; i++) {
        CityCodeFilters[i] = (IntegerFilter)CityCodeFilter[i];
      }
      try {
        out.setCityCodeFilter(CityCodeFilters);
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
  
    return out;
  }
}
