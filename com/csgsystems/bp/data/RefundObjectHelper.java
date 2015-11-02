/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RefundObjectHelper.java
 * Definition File: Customer/Refund.xml
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



/** Helper class to convert RefundObject JavaBean objects to/from HashMaps.
 */
public class RefundObjectHelper implements ArubaObjectHelper
{
  /** convert RefundObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (RefundObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RefundObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RefundObject")
   * @return Map     the output Map
   */
  public static Map toMap (RefundObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RefundObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert RefundObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (RefundObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert RefundObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "RefundObject")
   * @return Map     the output Map
   */
  public static Map toMap (RefundObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "RefundObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to RefundObjectData.
   * @param record the Map containing the data to convert to the object
   * @return RefundObjectData the converted object
   */
  public static RefundObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to RefundObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "RefundObject")
   * @return RefundObjectData the converted object
   */
  public static RefundObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RefundObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to RefundObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return RefundObjectFilter the converted object
   */
  public static RefundObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to RefundObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "RefundObject")
   * @return RefundObjectFilter the converted object
   */
  public static RefundObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "RefundObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to RefundObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return RefundObjectDataList the converted object
   */
  public static RefundObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to RefundObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "RefundObjectList")
   * @return RefundObjectDataList the converted object
   */
  public static RefundObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "RefundObjectList";
    Object[] root = (Object[]) record.get (rootName);
    RefundObjectData[] array = null;
    if (root != null)
    {
      array = new RefundObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = RefundObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new RefundObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new RefundObjectDataList (array, index, total);
  }
  /** convert RefundObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RefundObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", RefundObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._OrigSubmitterNameSet) record.put ("OrigSubmitterName", in.OrigSubmitterName);
  
    if (in._RequestDateSet) record.put ("RequestDate", in.RequestDate);
  
    if (in._RefundReasonCodeSet) record.put ("RefundReasonCode", in.RefundReasonCode);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._RefundStatusSet) record.put ("RefundStatus", in.RefundStatus);
  
    if (in._RefundTypeSet) record.put ("RefundType", in.RefundType);
  
    if (in._SupervisorNameSet) record.put ("SupervisorName", in.SupervisorName);
  
    if (in._ReviewDateSet) record.put ("ReviewDate", in.ReviewDate);
  
    if (in._PayeeLastSet) record.put ("PayeeLast", in.PayeeLast);
  
    if (in._PayeeFirstSet) record.put ("PayeeFirst", in.PayeeFirst);
  
    if (in._PayeeCompanySet) record.put ("PayeeCompany", in.PayeeCompany);
  
    if (in._PayeeAddress1Set) record.put ("PayeeAddress1", in.PayeeAddress1);
  
    if (in._PayeeAddress2Set) record.put ("PayeeAddress2", in.PayeeAddress2);
  
    if (in._PayeeAddress3Set) record.put ("PayeeAddress3", in.PayeeAddress3);
  
    if (in._PayeeCitySet) record.put ("PayeeCity", in.PayeeCity);
  
    if (in._PayeeStateSet) record.put ("PayeeState", in.PayeeState);
  
    if (in._PayeeZipSet) record.put ("PayeeZip", in.PayeeZip);
  
    if (in._PayeeCountryCodeSet) record.put ("PayeeCountryCode", in.PayeeCountryCode);
  
    if (in._PayeeGeocodeSet) record.put ("PayeeGeocode", in.PayeeGeocode);
  
    if (in._PayeeCountySet) record.put ("PayeeCounty", in.PayeeCounty);
  
    if (in._TreasuryDateSet) record.put ("TreasuryDate", in.TreasuryDate);
  
    if (in._CheckNumSet) record.put ("CheckNum", in.CheckNum);
  
    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._LastReviewedNameSet) record.put ("LastReviewedName", in.LastReviewedName);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._AltContactIdSet) record.put ("AltContactId", in.AltContactId);
  
    if (in._AltCurrencyCodeSet) record.put ("AltCurrencyCode", in.AltCurrencyCode);
  
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._IsCurrentSet) record.put ("IsCurrent", in.IsCurrent);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
      return record;
  }
  /** convert RefundObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (RefundObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", RefundObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.OrigSubmitterName, in.OrigSubmitterNameSort, in.OrigSubmitterNameSortAscending, in.OrigSubmitterNameFetch, in.OrigSubmitterNameCaseInsensitive);
      if (map != null) record.put ("OrigSubmitterName", map);
      map = DataHelper.filterToMap (in.RequestDate, in.RequestDateSort, in.RequestDateSortAscending, in.RequestDateFetch);
      if (map != null) record.put ("RequestDate", map);
      map = DataHelper.filterToMap (in.RefundReasonCode, in.RefundReasonCodeSort, in.RefundReasonCodeSortAscending, in.RefundReasonCodeFetch);
      if (map != null) record.put ("RefundReasonCode", map);
      map = DataHelper.filterToMap (in.Amount, in.AmountSort, in.AmountSortAscending, in.AmountFetch);
      if (map != null) record.put ("Amount", map);
      map = DataHelper.filterToMap (in.RefundStatus, in.RefundStatusSort, in.RefundStatusSortAscending, in.RefundStatusFetch);
      if (map != null) record.put ("RefundStatus", map);
      map = DataHelper.filterToMap (in.RefundType, in.RefundTypeSort, in.RefundTypeSortAscending, in.RefundTypeFetch);
      if (map != null) record.put ("RefundType", map);
      map = DataHelper.filterToMap (in.SupervisorName, in.SupervisorNameSort, in.SupervisorNameSortAscending, in.SupervisorNameFetch, in.SupervisorNameCaseInsensitive);
      if (map != null) record.put ("SupervisorName", map);
      map = DataHelper.filterToMap (in.ReviewDate, in.ReviewDateSort, in.ReviewDateSortAscending, in.ReviewDateFetch);
      if (map != null) record.put ("ReviewDate", map);
      map = DataHelper.filterToMap (in.PayeeLast, in.PayeeLastSort, in.PayeeLastSortAscending, in.PayeeLastFetch, in.PayeeLastCaseInsensitive);
      if (map != null) record.put ("PayeeLast", map);
      map = DataHelper.filterToMap (in.PayeeFirst, in.PayeeFirstSort, in.PayeeFirstSortAscending, in.PayeeFirstFetch, in.PayeeFirstCaseInsensitive);
      if (map != null) record.put ("PayeeFirst", map);
      map = DataHelper.filterToMap (in.PayeeCompany, in.PayeeCompanySort, in.PayeeCompanySortAscending, in.PayeeCompanyFetch, in.PayeeCompanyCaseInsensitive);
      if (map != null) record.put ("PayeeCompany", map);
      map = DataHelper.filterToMap (in.PayeeAddress1, in.PayeeAddress1Sort, in.PayeeAddress1SortAscending, in.PayeeAddress1Fetch, in.PayeeAddress1CaseInsensitive);
      if (map != null) record.put ("PayeeAddress1", map);
      map = DataHelper.filterToMap (in.PayeeAddress2, in.PayeeAddress2Sort, in.PayeeAddress2SortAscending, in.PayeeAddress2Fetch, in.PayeeAddress2CaseInsensitive);
      if (map != null) record.put ("PayeeAddress2", map);
      map = DataHelper.filterToMap (in.PayeeAddress3, in.PayeeAddress3Sort, in.PayeeAddress3SortAscending, in.PayeeAddress3Fetch, in.PayeeAddress3CaseInsensitive);
      if (map != null) record.put ("PayeeAddress3", map);
      map = DataHelper.filterToMap (in.PayeeCity, in.PayeeCitySort, in.PayeeCitySortAscending, in.PayeeCityFetch, in.PayeeCityCaseInsensitive);
      if (map != null) record.put ("PayeeCity", map);
      map = DataHelper.filterToMap (in.PayeeState, in.PayeeStateSort, in.PayeeStateSortAscending, in.PayeeStateFetch, in.PayeeStateCaseInsensitive);
      if (map != null) record.put ("PayeeState", map);
      map = DataHelper.filterToMap (in.PayeeZip, in.PayeeZipSort, in.PayeeZipSortAscending, in.PayeeZipFetch, in.PayeeZipCaseInsensitive);
      if (map != null) record.put ("PayeeZip", map);
      map = DataHelper.filterToMap (in.PayeeCountryCode, in.PayeeCountryCodeSort, in.PayeeCountryCodeSortAscending, in.PayeeCountryCodeFetch);
      if (map != null) record.put ("PayeeCountryCode", map);
      map = DataHelper.filterToMap (in.PayeeGeocode, in.PayeeGeocodeSort, in.PayeeGeocodeSortAscending, in.PayeeGeocodeFetch, in.PayeeGeocodeCaseInsensitive);
      if (map != null) record.put ("PayeeGeocode", map);
      map = DataHelper.filterToMap (in.PayeeCounty, in.PayeeCountySort, in.PayeeCountySortAscending, in.PayeeCountyFetch, in.PayeeCountyCaseInsensitive);
      if (map != null) record.put ("PayeeCounty", map);
      map = DataHelper.filterToMap (in.TreasuryDate, in.TreasuryDateSort, in.TreasuryDateSortAscending, in.TreasuryDateFetch);
      if (map != null) record.put ("TreasuryDate", map);
      map = DataHelper.filterToMap (in.CheckNum, in.CheckNumSort, in.CheckNumSortAscending, in.CheckNumFetch, in.CheckNumCaseInsensitive);
      if (map != null) record.put ("CheckNum", map);
      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch);
      if (map != null) record.put ("ProfileId", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.LastReviewedName, in.LastReviewedNameSort, in.LastReviewedNameSortAscending, in.LastReviewedNameFetch, in.LastReviewedNameCaseInsensitive);
      if (map != null) record.put ("LastReviewedName", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.AltContactId, in.AltContactIdSort, in.AltContactIdSortAscending, in.AltContactIdFetch);
      if (map != null) record.put ("AltContactId", map);
      map = DataHelper.filterToMap (in.AltCurrencyCode, in.AltCurrencyCodeSort, in.AltCurrencyCodeSortAscending, in.AltCurrencyCodeFetch);
      if (map != null) record.put ("AltCurrencyCode", map);
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.IsCurrent, in.IsCurrentSort, in.IsCurrentSortAscending, in.IsCurrentFetch);
      if (map != null) record.put ("IsCurrent", map);
      map = DataHelper.filterToMap (in.ActiveDate, in.ActiveDateSort, in.ActiveDateSortAscending, in.ActiveDateFetch);
      if (map != null) record.put ("ActiveDate", map);
      map = DataHelper.filterToMap (in.InactiveDate, in.InactiveDateSort, in.InactiveDateSortAscending, in.InactiveDateFetch);
      if (map != null) record.put ("InactiveDate", map);
    return record;
  }
  /** convert Map to RefundObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RefundObjectData the converted object
   */
  public static RefundObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RefundObjectData out = new RefundObjectData ();

    out.Key = RefundObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigSubmitterName")) != null)
    {
      out.OrigSubmitterName = (String) obj;
    }
  
    if ((obj = record.get ("RequestDate")) != null)
    {
      out.RequestDate = (Date) obj;
    }
  
    if ((obj = record.get ("RefundReasonCode")) != null)
    {
      out.RefundReasonCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Amount")) != null)
    {
      out.Amount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("RefundStatus")) != null)
    {
      out.RefundStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("RefundType")) != null)
    {
      out.RefundType = (Integer) obj;
    }
  
    if ((obj = record.get ("SupervisorName")) != null)
    {
      out.SupervisorName = (String) obj;
    }
  
    if ((obj = record.get ("ReviewDate")) != null)
    {
      out.ReviewDate = (Date) obj;
    }
  
    if ((obj = record.get ("PayeeLast")) != null)
    {
      out.PayeeLast = (String) obj;
    }
  
    if ((obj = record.get ("PayeeFirst")) != null)
    {
      out.PayeeFirst = (String) obj;
    }
  
    if ((obj = record.get ("PayeeCompany")) != null)
    {
      out.PayeeCompany = (String) obj;
    }
  
    if ((obj = record.get ("PayeeAddress1")) != null)
    {
      out.PayeeAddress1 = (String) obj;
    }
  
    if ((obj = record.get ("PayeeAddress2")) != null)
    {
      out.PayeeAddress2 = (String) obj;
    }
  
    if ((obj = record.get ("PayeeAddress3")) != null)
    {
      out.PayeeAddress3 = (String) obj;
    }
  
    if ((obj = record.get ("PayeeCity")) != null)
    {
      out.PayeeCity = (String) obj;
    }
  
    if ((obj = record.get ("PayeeState")) != null)
    {
      out.PayeeState = (String) obj;
    }
  
    if ((obj = record.get ("PayeeZip")) != null)
    {
      out.PayeeZip = (String) obj;
    }
  
    if ((obj = record.get ("PayeeCountryCode")) != null)
    {
      out.PayeeCountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("PayeeGeocode")) != null)
    {
      out.PayeeGeocode = (String) obj;
    }
  
    if ((obj = record.get ("PayeeCounty")) != null)
    {
      out.PayeeCounty = (String) obj;
    }
  
    if ((obj = record.get ("TreasuryDate")) != null)
    {
      out.TreasuryDate = (Date) obj;
    }
  
    if ((obj = record.get ("CheckNum")) != null)
    {
      out.CheckNum = (String) obj;
    }
  
    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("LastReviewedName")) != null)
    {
      out.LastReviewedName = (String) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("AltContactId")) != null)
    {
      out.AltContactId = (Integer) obj;
    }
  
    if ((obj = record.get ("AltCurrencyCode")) != null)
    {
      out.AltCurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("IsCurrent")) != null)
    {
      out.IsCurrent = (Boolean) obj;
    }
  
    if ((obj = record.get ("ActiveDate")) != null)
    {
      out.ActiveDate = (Date) obj;
    }
  
    if ((obj = record.get ("InactiveDate")) != null)
    {
      out.InactiveDate = (Date) obj;
    }
      return out;
  }
  /** convert Map to RefundObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return RefundObjectFilter the converted object
   */
  public static RefundObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    RefundObjectFilter out = new RefundObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = RefundObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map OrigSubmitterNameMap = (Map)record.get("OrigSubmitterName");
    Boolean OrigSubmitterNameFetch = DataHelper.getFetch(OrigSubmitterNameMap);
    Boolean OrigSubmitterNameSortDir = DataHelper.getSortDirection(OrigSubmitterNameMap);
    Integer OrigSubmitterNameSortOrder = DataHelper.getSortOrder(OrigSubmitterNameMap);
    if (OrigSubmitterNameFetch != null) out.setOrigSubmitterNameFetch(OrigSubmitterNameFetch);
    if (OrigSubmitterNameSortDir != null) out.setOrigSubmitterNameSortDirection(OrigSubmitterNameSortDir);
    if (OrigSubmitterNameSortOrder != null) out.setOrigSubmitterNameSortOrder(OrigSubmitterNameSortOrder);

    Filter[] OrigSubmitterNameFilter = DataHelper.mapToFilterArray(OrigSubmitterNameMap, String.class);
    if (OrigSubmitterNameFilter != null) {
      StringFilter[] OrigSubmitterNameFilters = new StringFilter[OrigSubmitterNameFilter.length];
      for (int i = 0; i < OrigSubmitterNameFilters.length; i++) {
        OrigSubmitterNameFilters[i] = (StringFilter)OrigSubmitterNameFilter[i];
      }
      try {
        out.setOrigSubmitterNameFilter(OrigSubmitterNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RequestDateMap = (Map)record.get("RequestDate");
    Boolean RequestDateFetch = DataHelper.getFetch(RequestDateMap);
    Boolean RequestDateSortDir = DataHelper.getSortDirection(RequestDateMap);
    Integer RequestDateSortOrder = DataHelper.getSortOrder(RequestDateMap);
    if (RequestDateFetch != null) out.setRequestDateFetch(RequestDateFetch);
    if (RequestDateSortDir != null) out.setRequestDateSortDirection(RequestDateSortDir);
    if (RequestDateSortOrder != null) out.setRequestDateSortOrder(RequestDateSortOrder);

    Filter[] RequestDateFilter = DataHelper.mapToFilterArray(RequestDateMap, Date.class);
    if (RequestDateFilter != null) {
      DateFilter[] RequestDateFilters = new DateFilter[RequestDateFilter.length];
      for (int i = 0; i < RequestDateFilters.length; i++) {
        RequestDateFilters[i] = (DateFilter)RequestDateFilter[i];
      }
      try {
        out.setRequestDateFilter(RequestDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RefundReasonCodeMap = (Map)record.get("RefundReasonCode");
    Boolean RefundReasonCodeFetch = DataHelper.getFetch(RefundReasonCodeMap);
    Boolean RefundReasonCodeSortDir = DataHelper.getSortDirection(RefundReasonCodeMap);
    Integer RefundReasonCodeSortOrder = DataHelper.getSortOrder(RefundReasonCodeMap);
    if (RefundReasonCodeFetch != null) out.setRefundReasonCodeFetch(RefundReasonCodeFetch);
    if (RefundReasonCodeSortDir != null) out.setRefundReasonCodeSortDirection(RefundReasonCodeSortDir);
    if (RefundReasonCodeSortOrder != null) out.setRefundReasonCodeSortOrder(RefundReasonCodeSortOrder);

    Filter[] RefundReasonCodeFilter = DataHelper.mapToFilterArray(RefundReasonCodeMap, Integer.class);
    if (RefundReasonCodeFilter != null) {
      IntegerFilter[] RefundReasonCodeFilters = new IntegerFilter[RefundReasonCodeFilter.length];
      for (int i = 0; i < RefundReasonCodeFilters.length; i++) {
        RefundReasonCodeFilters[i] = (IntegerFilter)RefundReasonCodeFilter[i];
      }
      try {
        out.setRefundReasonCodeFilter(RefundReasonCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AmountMap = (Map)record.get("Amount");
    Boolean AmountFetch = DataHelper.getFetch(AmountMap);
    Boolean AmountSortDir = DataHelper.getSortDirection(AmountMap);
    Integer AmountSortOrder = DataHelper.getSortOrder(AmountMap);
    if (AmountFetch != null) out.setAmountFetch(AmountFetch);
    if (AmountSortDir != null) out.setAmountSortDirection(AmountSortDir);
    if (AmountSortOrder != null) out.setAmountSortOrder(AmountSortOrder);

    Filter[] AmountFilter = DataHelper.mapToFilterArray(AmountMap, BigInteger.class);
    if (AmountFilter != null) {
      BigIntegerFilter[] AmountFilters = new BigIntegerFilter[AmountFilter.length];
      for (int i = 0; i < AmountFilters.length; i++) {
        AmountFilters[i] = (BigIntegerFilter)AmountFilter[i];
      }
      try {
        out.setAmountFilter(AmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RefundStatusMap = (Map)record.get("RefundStatus");
    Boolean RefundStatusFetch = DataHelper.getFetch(RefundStatusMap);
    Boolean RefundStatusSortDir = DataHelper.getSortDirection(RefundStatusMap);
    Integer RefundStatusSortOrder = DataHelper.getSortOrder(RefundStatusMap);
    if (RefundStatusFetch != null) out.setRefundStatusFetch(RefundStatusFetch);
    if (RefundStatusSortDir != null) out.setRefundStatusSortDirection(RefundStatusSortDir);
    if (RefundStatusSortOrder != null) out.setRefundStatusSortOrder(RefundStatusSortOrder);

    Filter[] RefundStatusFilter = DataHelper.mapToFilterArray(RefundStatusMap, Integer.class);
    if (RefundStatusFilter != null) {
      IntegerFilter[] RefundStatusFilters = new IntegerFilter[RefundStatusFilter.length];
      for (int i = 0; i < RefundStatusFilters.length; i++) {
        RefundStatusFilters[i] = (IntegerFilter)RefundStatusFilter[i];
      }
      try {
        out.setRefundStatusFilter(RefundStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RefundTypeMap = (Map)record.get("RefundType");
    Boolean RefundTypeFetch = DataHelper.getFetch(RefundTypeMap);
    Boolean RefundTypeSortDir = DataHelper.getSortDirection(RefundTypeMap);
    Integer RefundTypeSortOrder = DataHelper.getSortOrder(RefundTypeMap);
    if (RefundTypeFetch != null) out.setRefundTypeFetch(RefundTypeFetch);
    if (RefundTypeSortDir != null) out.setRefundTypeSortDirection(RefundTypeSortDir);
    if (RefundTypeSortOrder != null) out.setRefundTypeSortOrder(RefundTypeSortOrder);

    Filter[] RefundTypeFilter = DataHelper.mapToFilterArray(RefundTypeMap, Integer.class);
    if (RefundTypeFilter != null) {
      IntegerFilter[] RefundTypeFilters = new IntegerFilter[RefundTypeFilter.length];
      for (int i = 0; i < RefundTypeFilters.length; i++) {
        RefundTypeFilters[i] = (IntegerFilter)RefundTypeFilter[i];
      }
      try {
        out.setRefundTypeFilter(RefundTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
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
  
    Map ReviewDateMap = (Map)record.get("ReviewDate");
    Boolean ReviewDateFetch = DataHelper.getFetch(ReviewDateMap);
    Boolean ReviewDateSortDir = DataHelper.getSortDirection(ReviewDateMap);
    Integer ReviewDateSortOrder = DataHelper.getSortOrder(ReviewDateMap);
    if (ReviewDateFetch != null) out.setReviewDateFetch(ReviewDateFetch);
    if (ReviewDateSortDir != null) out.setReviewDateSortDirection(ReviewDateSortDir);
    if (ReviewDateSortOrder != null) out.setReviewDateSortOrder(ReviewDateSortOrder);

    Filter[] ReviewDateFilter = DataHelper.mapToFilterArray(ReviewDateMap, Date.class);
    if (ReviewDateFilter != null) {
      DateFilter[] ReviewDateFilters = new DateFilter[ReviewDateFilter.length];
      for (int i = 0; i < ReviewDateFilters.length; i++) {
        ReviewDateFilters[i] = (DateFilter)ReviewDateFilter[i];
      }
      try {
        out.setReviewDateFilter(ReviewDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeLastMap = (Map)record.get("PayeeLast");
    Boolean PayeeLastFetch = DataHelper.getFetch(PayeeLastMap);
    Boolean PayeeLastSortDir = DataHelper.getSortDirection(PayeeLastMap);
    Integer PayeeLastSortOrder = DataHelper.getSortOrder(PayeeLastMap);
    if (PayeeLastFetch != null) out.setPayeeLastFetch(PayeeLastFetch);
    if (PayeeLastSortDir != null) out.setPayeeLastSortDirection(PayeeLastSortDir);
    if (PayeeLastSortOrder != null) out.setPayeeLastSortOrder(PayeeLastSortOrder);

    Filter[] PayeeLastFilter = DataHelper.mapToFilterArray(PayeeLastMap, String.class);
    if (PayeeLastFilter != null) {
      StringFilter[] PayeeLastFilters = new StringFilter[PayeeLastFilter.length];
      for (int i = 0; i < PayeeLastFilters.length; i++) {
        PayeeLastFilters[i] = (StringFilter)PayeeLastFilter[i];
      }
      try {
        out.setPayeeLastFilter(PayeeLastFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeFirstMap = (Map)record.get("PayeeFirst");
    Boolean PayeeFirstFetch = DataHelper.getFetch(PayeeFirstMap);
    Boolean PayeeFirstSortDir = DataHelper.getSortDirection(PayeeFirstMap);
    Integer PayeeFirstSortOrder = DataHelper.getSortOrder(PayeeFirstMap);
    if (PayeeFirstFetch != null) out.setPayeeFirstFetch(PayeeFirstFetch);
    if (PayeeFirstSortDir != null) out.setPayeeFirstSortDirection(PayeeFirstSortDir);
    if (PayeeFirstSortOrder != null) out.setPayeeFirstSortOrder(PayeeFirstSortOrder);

    Filter[] PayeeFirstFilter = DataHelper.mapToFilterArray(PayeeFirstMap, String.class);
    if (PayeeFirstFilter != null) {
      StringFilter[] PayeeFirstFilters = new StringFilter[PayeeFirstFilter.length];
      for (int i = 0; i < PayeeFirstFilters.length; i++) {
        PayeeFirstFilters[i] = (StringFilter)PayeeFirstFilter[i];
      }
      try {
        out.setPayeeFirstFilter(PayeeFirstFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeCompanyMap = (Map)record.get("PayeeCompany");
    Boolean PayeeCompanyFetch = DataHelper.getFetch(PayeeCompanyMap);
    Boolean PayeeCompanySortDir = DataHelper.getSortDirection(PayeeCompanyMap);
    Integer PayeeCompanySortOrder = DataHelper.getSortOrder(PayeeCompanyMap);
    if (PayeeCompanyFetch != null) out.setPayeeCompanyFetch(PayeeCompanyFetch);
    if (PayeeCompanySortDir != null) out.setPayeeCompanySortDirection(PayeeCompanySortDir);
    if (PayeeCompanySortOrder != null) out.setPayeeCompanySortOrder(PayeeCompanySortOrder);

    Filter[] PayeeCompanyFilter = DataHelper.mapToFilterArray(PayeeCompanyMap, String.class);
    if (PayeeCompanyFilter != null) {
      StringFilter[] PayeeCompanyFilters = new StringFilter[PayeeCompanyFilter.length];
      for (int i = 0; i < PayeeCompanyFilters.length; i++) {
        PayeeCompanyFilters[i] = (StringFilter)PayeeCompanyFilter[i];
      }
      try {
        out.setPayeeCompanyFilter(PayeeCompanyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeAddress1Map = (Map)record.get("PayeeAddress1");
    Boolean PayeeAddress1Fetch = DataHelper.getFetch(PayeeAddress1Map);
    Boolean PayeeAddress1SortDir = DataHelper.getSortDirection(PayeeAddress1Map);
    Integer PayeeAddress1SortOrder = DataHelper.getSortOrder(PayeeAddress1Map);
    if (PayeeAddress1Fetch != null) out.setPayeeAddress1Fetch(PayeeAddress1Fetch);
    if (PayeeAddress1SortDir != null) out.setPayeeAddress1SortDirection(PayeeAddress1SortDir);
    if (PayeeAddress1SortOrder != null) out.setPayeeAddress1SortOrder(PayeeAddress1SortOrder);

    Filter[] PayeeAddress1Filter = DataHelper.mapToFilterArray(PayeeAddress1Map, String.class);
    if (PayeeAddress1Filter != null) {
      StringFilter[] PayeeAddress1Filters = new StringFilter[PayeeAddress1Filter.length];
      for (int i = 0; i < PayeeAddress1Filters.length; i++) {
        PayeeAddress1Filters[i] = (StringFilter)PayeeAddress1Filter[i];
      }
      try {
        out.setPayeeAddress1Filter(PayeeAddress1Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeAddress2Map = (Map)record.get("PayeeAddress2");
    Boolean PayeeAddress2Fetch = DataHelper.getFetch(PayeeAddress2Map);
    Boolean PayeeAddress2SortDir = DataHelper.getSortDirection(PayeeAddress2Map);
    Integer PayeeAddress2SortOrder = DataHelper.getSortOrder(PayeeAddress2Map);
    if (PayeeAddress2Fetch != null) out.setPayeeAddress2Fetch(PayeeAddress2Fetch);
    if (PayeeAddress2SortDir != null) out.setPayeeAddress2SortDirection(PayeeAddress2SortDir);
    if (PayeeAddress2SortOrder != null) out.setPayeeAddress2SortOrder(PayeeAddress2SortOrder);

    Filter[] PayeeAddress2Filter = DataHelper.mapToFilterArray(PayeeAddress2Map, String.class);
    if (PayeeAddress2Filter != null) {
      StringFilter[] PayeeAddress2Filters = new StringFilter[PayeeAddress2Filter.length];
      for (int i = 0; i < PayeeAddress2Filters.length; i++) {
        PayeeAddress2Filters[i] = (StringFilter)PayeeAddress2Filter[i];
      }
      try {
        out.setPayeeAddress2Filter(PayeeAddress2Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeAddress3Map = (Map)record.get("PayeeAddress3");
    Boolean PayeeAddress3Fetch = DataHelper.getFetch(PayeeAddress3Map);
    Boolean PayeeAddress3SortDir = DataHelper.getSortDirection(PayeeAddress3Map);
    Integer PayeeAddress3SortOrder = DataHelper.getSortOrder(PayeeAddress3Map);
    if (PayeeAddress3Fetch != null) out.setPayeeAddress3Fetch(PayeeAddress3Fetch);
    if (PayeeAddress3SortDir != null) out.setPayeeAddress3SortDirection(PayeeAddress3SortDir);
    if (PayeeAddress3SortOrder != null) out.setPayeeAddress3SortOrder(PayeeAddress3SortOrder);

    Filter[] PayeeAddress3Filter = DataHelper.mapToFilterArray(PayeeAddress3Map, String.class);
    if (PayeeAddress3Filter != null) {
      StringFilter[] PayeeAddress3Filters = new StringFilter[PayeeAddress3Filter.length];
      for (int i = 0; i < PayeeAddress3Filters.length; i++) {
        PayeeAddress3Filters[i] = (StringFilter)PayeeAddress3Filter[i];
      }
      try {
        out.setPayeeAddress3Filter(PayeeAddress3Filters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeCityMap = (Map)record.get("PayeeCity");
    Boolean PayeeCityFetch = DataHelper.getFetch(PayeeCityMap);
    Boolean PayeeCitySortDir = DataHelper.getSortDirection(PayeeCityMap);
    Integer PayeeCitySortOrder = DataHelper.getSortOrder(PayeeCityMap);
    if (PayeeCityFetch != null) out.setPayeeCityFetch(PayeeCityFetch);
    if (PayeeCitySortDir != null) out.setPayeeCitySortDirection(PayeeCitySortDir);
    if (PayeeCitySortOrder != null) out.setPayeeCitySortOrder(PayeeCitySortOrder);

    Filter[] PayeeCityFilter = DataHelper.mapToFilterArray(PayeeCityMap, String.class);
    if (PayeeCityFilter != null) {
      StringFilter[] PayeeCityFilters = new StringFilter[PayeeCityFilter.length];
      for (int i = 0; i < PayeeCityFilters.length; i++) {
        PayeeCityFilters[i] = (StringFilter)PayeeCityFilter[i];
      }
      try {
        out.setPayeeCityFilter(PayeeCityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeStateMap = (Map)record.get("PayeeState");
    Boolean PayeeStateFetch = DataHelper.getFetch(PayeeStateMap);
    Boolean PayeeStateSortDir = DataHelper.getSortDirection(PayeeStateMap);
    Integer PayeeStateSortOrder = DataHelper.getSortOrder(PayeeStateMap);
    if (PayeeStateFetch != null) out.setPayeeStateFetch(PayeeStateFetch);
    if (PayeeStateSortDir != null) out.setPayeeStateSortDirection(PayeeStateSortDir);
    if (PayeeStateSortOrder != null) out.setPayeeStateSortOrder(PayeeStateSortOrder);

    Filter[] PayeeStateFilter = DataHelper.mapToFilterArray(PayeeStateMap, String.class);
    if (PayeeStateFilter != null) {
      StringFilter[] PayeeStateFilters = new StringFilter[PayeeStateFilter.length];
      for (int i = 0; i < PayeeStateFilters.length; i++) {
        PayeeStateFilters[i] = (StringFilter)PayeeStateFilter[i];
      }
      try {
        out.setPayeeStateFilter(PayeeStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeZipMap = (Map)record.get("PayeeZip");
    Boolean PayeeZipFetch = DataHelper.getFetch(PayeeZipMap);
    Boolean PayeeZipSortDir = DataHelper.getSortDirection(PayeeZipMap);
    Integer PayeeZipSortOrder = DataHelper.getSortOrder(PayeeZipMap);
    if (PayeeZipFetch != null) out.setPayeeZipFetch(PayeeZipFetch);
    if (PayeeZipSortDir != null) out.setPayeeZipSortDirection(PayeeZipSortDir);
    if (PayeeZipSortOrder != null) out.setPayeeZipSortOrder(PayeeZipSortOrder);

    Filter[] PayeeZipFilter = DataHelper.mapToFilterArray(PayeeZipMap, String.class);
    if (PayeeZipFilter != null) {
      StringFilter[] PayeeZipFilters = new StringFilter[PayeeZipFilter.length];
      for (int i = 0; i < PayeeZipFilters.length; i++) {
        PayeeZipFilters[i] = (StringFilter)PayeeZipFilter[i];
      }
      try {
        out.setPayeeZipFilter(PayeeZipFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeCountryCodeMap = (Map)record.get("PayeeCountryCode");
    Boolean PayeeCountryCodeFetch = DataHelper.getFetch(PayeeCountryCodeMap);
    Boolean PayeeCountryCodeSortDir = DataHelper.getSortDirection(PayeeCountryCodeMap);
    Integer PayeeCountryCodeSortOrder = DataHelper.getSortOrder(PayeeCountryCodeMap);
    if (PayeeCountryCodeFetch != null) out.setPayeeCountryCodeFetch(PayeeCountryCodeFetch);
    if (PayeeCountryCodeSortDir != null) out.setPayeeCountryCodeSortDirection(PayeeCountryCodeSortDir);
    if (PayeeCountryCodeSortOrder != null) out.setPayeeCountryCodeSortOrder(PayeeCountryCodeSortOrder);

    Filter[] PayeeCountryCodeFilter = DataHelper.mapToFilterArray(PayeeCountryCodeMap, Integer.class);
    if (PayeeCountryCodeFilter != null) {
      IntegerFilter[] PayeeCountryCodeFilters = new IntegerFilter[PayeeCountryCodeFilter.length];
      for (int i = 0; i < PayeeCountryCodeFilters.length; i++) {
        PayeeCountryCodeFilters[i] = (IntegerFilter)PayeeCountryCodeFilter[i];
      }
      try {
        out.setPayeeCountryCodeFilter(PayeeCountryCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeGeocodeMap = (Map)record.get("PayeeGeocode");
    Boolean PayeeGeocodeFetch = DataHelper.getFetch(PayeeGeocodeMap);
    Boolean PayeeGeocodeSortDir = DataHelper.getSortDirection(PayeeGeocodeMap);
    Integer PayeeGeocodeSortOrder = DataHelper.getSortOrder(PayeeGeocodeMap);
    if (PayeeGeocodeFetch != null) out.setPayeeGeocodeFetch(PayeeGeocodeFetch);
    if (PayeeGeocodeSortDir != null) out.setPayeeGeocodeSortDirection(PayeeGeocodeSortDir);
    if (PayeeGeocodeSortOrder != null) out.setPayeeGeocodeSortOrder(PayeeGeocodeSortOrder);

    Filter[] PayeeGeocodeFilter = DataHelper.mapToFilterArray(PayeeGeocodeMap, String.class);
    if (PayeeGeocodeFilter != null) {
      StringFilter[] PayeeGeocodeFilters = new StringFilter[PayeeGeocodeFilter.length];
      for (int i = 0; i < PayeeGeocodeFilters.length; i++) {
        PayeeGeocodeFilters[i] = (StringFilter)PayeeGeocodeFilter[i];
      }
      try {
        out.setPayeeGeocodeFilter(PayeeGeocodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PayeeCountyMap = (Map)record.get("PayeeCounty");
    Boolean PayeeCountyFetch = DataHelper.getFetch(PayeeCountyMap);
    Boolean PayeeCountySortDir = DataHelper.getSortDirection(PayeeCountyMap);
    Integer PayeeCountySortOrder = DataHelper.getSortOrder(PayeeCountyMap);
    if (PayeeCountyFetch != null) out.setPayeeCountyFetch(PayeeCountyFetch);
    if (PayeeCountySortDir != null) out.setPayeeCountySortDirection(PayeeCountySortDir);
    if (PayeeCountySortOrder != null) out.setPayeeCountySortOrder(PayeeCountySortOrder);

    Filter[] PayeeCountyFilter = DataHelper.mapToFilterArray(PayeeCountyMap, String.class);
    if (PayeeCountyFilter != null) {
      StringFilter[] PayeeCountyFilters = new StringFilter[PayeeCountyFilter.length];
      for (int i = 0; i < PayeeCountyFilters.length; i++) {
        PayeeCountyFilters[i] = (StringFilter)PayeeCountyFilter[i];
      }
      try {
        out.setPayeeCountyFilter(PayeeCountyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TreasuryDateMap = (Map)record.get("TreasuryDate");
    Boolean TreasuryDateFetch = DataHelper.getFetch(TreasuryDateMap);
    Boolean TreasuryDateSortDir = DataHelper.getSortDirection(TreasuryDateMap);
    Integer TreasuryDateSortOrder = DataHelper.getSortOrder(TreasuryDateMap);
    if (TreasuryDateFetch != null) out.setTreasuryDateFetch(TreasuryDateFetch);
    if (TreasuryDateSortDir != null) out.setTreasuryDateSortDirection(TreasuryDateSortDir);
    if (TreasuryDateSortOrder != null) out.setTreasuryDateSortOrder(TreasuryDateSortOrder);

    Filter[] TreasuryDateFilter = DataHelper.mapToFilterArray(TreasuryDateMap, Date.class);
    if (TreasuryDateFilter != null) {
      DateFilter[] TreasuryDateFilters = new DateFilter[TreasuryDateFilter.length];
      for (int i = 0; i < TreasuryDateFilters.length; i++) {
        TreasuryDateFilters[i] = (DateFilter)TreasuryDateFilter[i];
      }
      try {
        out.setTreasuryDateFilter(TreasuryDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CheckNumMap = (Map)record.get("CheckNum");
    Boolean CheckNumFetch = DataHelper.getFetch(CheckNumMap);
    Boolean CheckNumSortDir = DataHelper.getSortDirection(CheckNumMap);
    Integer CheckNumSortOrder = DataHelper.getSortOrder(CheckNumMap);
    if (CheckNumFetch != null) out.setCheckNumFetch(CheckNumFetch);
    if (CheckNumSortDir != null) out.setCheckNumSortDirection(CheckNumSortDir);
    if (CheckNumSortOrder != null) out.setCheckNumSortOrder(CheckNumSortOrder);

    Filter[] CheckNumFilter = DataHelper.mapToFilterArray(CheckNumMap, String.class);
    if (CheckNumFilter != null) {
      StringFilter[] CheckNumFilters = new StringFilter[CheckNumFilter.length];
      for (int i = 0; i < CheckNumFilters.length; i++) {
        CheckNumFilters[i] = (StringFilter)CheckNumFilter[i];
      }
      try {
        out.setCheckNumFilter(CheckNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProfileIdMap = (Map)record.get("ProfileId");
    Boolean ProfileIdFetch = DataHelper.getFetch(ProfileIdMap);
    Boolean ProfileIdSortDir = DataHelper.getSortDirection(ProfileIdMap);
    Integer ProfileIdSortOrder = DataHelper.getSortOrder(ProfileIdMap);
    if (ProfileIdFetch != null) out.setProfileIdFetch(ProfileIdFetch);
    if (ProfileIdSortDir != null) out.setProfileIdSortDirection(ProfileIdSortDir);
    if (ProfileIdSortOrder != null) out.setProfileIdSortOrder(ProfileIdSortOrder);

    Filter[] ProfileIdFilter = DataHelper.mapToFilterArray(ProfileIdMap, BigInteger.class);
    if (ProfileIdFilter != null) {
      BigIntegerFilter[] ProfileIdFilters = new BigIntegerFilter[ProfileIdFilter.length];
      for (int i = 0; i < ProfileIdFilters.length; i++) {
        ProfileIdFilters[i] = (BigIntegerFilter)ProfileIdFilter[i];
      }
      try {
        out.setProfileIdFilter(ProfileIdFilters);
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
  
    Map LastReviewedNameMap = (Map)record.get("LastReviewedName");
    Boolean LastReviewedNameFetch = DataHelper.getFetch(LastReviewedNameMap);
    Boolean LastReviewedNameSortDir = DataHelper.getSortDirection(LastReviewedNameMap);
    Integer LastReviewedNameSortOrder = DataHelper.getSortOrder(LastReviewedNameMap);
    if (LastReviewedNameFetch != null) out.setLastReviewedNameFetch(LastReviewedNameFetch);
    if (LastReviewedNameSortDir != null) out.setLastReviewedNameSortDirection(LastReviewedNameSortDir);
    if (LastReviewedNameSortOrder != null) out.setLastReviewedNameSortOrder(LastReviewedNameSortOrder);

    Filter[] LastReviewedNameFilter = DataHelper.mapToFilterArray(LastReviewedNameMap, String.class);
    if (LastReviewedNameFilter != null) {
      StringFilter[] LastReviewedNameFilters = new StringFilter[LastReviewedNameFilter.length];
      for (int i = 0; i < LastReviewedNameFilters.length; i++) {
        LastReviewedNameFilters[i] = (StringFilter)LastReviewedNameFilter[i];
      }
      try {
        out.setLastReviewedNameFilter(LastReviewedNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OpenItemIdMap = (Map)record.get("OpenItemId");
    Boolean OpenItemIdFetch = DataHelper.getFetch(OpenItemIdMap);
    Boolean OpenItemIdSortDir = DataHelper.getSortDirection(OpenItemIdMap);
    Integer OpenItemIdSortOrder = DataHelper.getSortOrder(OpenItemIdMap);
    if (OpenItemIdFetch != null) out.setOpenItemIdFetch(OpenItemIdFetch);
    if (OpenItemIdSortDir != null) out.setOpenItemIdSortDirection(OpenItemIdSortDir);
    if (OpenItemIdSortOrder != null) out.setOpenItemIdSortOrder(OpenItemIdSortOrder);

    Filter[] OpenItemIdFilter = DataHelper.mapToFilterArray(OpenItemIdMap, Integer.class);
    if (OpenItemIdFilter != null) {
      IntegerFilter[] OpenItemIdFilters = new IntegerFilter[OpenItemIdFilter.length];
      for (int i = 0; i < OpenItemIdFilters.length; i++) {
        OpenItemIdFilters[i] = (IntegerFilter)OpenItemIdFilter[i];
      }
      try {
        out.setOpenItemIdFilter(OpenItemIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltContactIdMap = (Map)record.get("AltContactId");
    Boolean AltContactIdFetch = DataHelper.getFetch(AltContactIdMap);
    Boolean AltContactIdSortDir = DataHelper.getSortDirection(AltContactIdMap);
    Integer AltContactIdSortOrder = DataHelper.getSortOrder(AltContactIdMap);
    if (AltContactIdFetch != null) out.setAltContactIdFetch(AltContactIdFetch);
    if (AltContactIdSortDir != null) out.setAltContactIdSortDirection(AltContactIdSortDir);
    if (AltContactIdSortOrder != null) out.setAltContactIdSortOrder(AltContactIdSortOrder);

    Filter[] AltContactIdFilter = DataHelper.mapToFilterArray(AltContactIdMap, Integer.class);
    if (AltContactIdFilter != null) {
      IntegerFilter[] AltContactIdFilters = new IntegerFilter[AltContactIdFilter.length];
      for (int i = 0; i < AltContactIdFilters.length; i++) {
        AltContactIdFilters[i] = (IntegerFilter)AltContactIdFilter[i];
      }
      try {
        out.setAltContactIdFilter(AltContactIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltCurrencyCodeMap = (Map)record.get("AltCurrencyCode");
    Boolean AltCurrencyCodeFetch = DataHelper.getFetch(AltCurrencyCodeMap);
    Boolean AltCurrencyCodeSortDir = DataHelper.getSortDirection(AltCurrencyCodeMap);
    Integer AltCurrencyCodeSortOrder = DataHelper.getSortOrder(AltCurrencyCodeMap);
    if (AltCurrencyCodeFetch != null) out.setAltCurrencyCodeFetch(AltCurrencyCodeFetch);
    if (AltCurrencyCodeSortDir != null) out.setAltCurrencyCodeSortDirection(AltCurrencyCodeSortDir);
    if (AltCurrencyCodeSortOrder != null) out.setAltCurrencyCodeSortOrder(AltCurrencyCodeSortOrder);

    Filter[] AltCurrencyCodeFilter = DataHelper.mapToFilterArray(AltCurrencyCodeMap, Integer.class);
    if (AltCurrencyCodeFilter != null) {
      IntegerFilter[] AltCurrencyCodeFilters = new IntegerFilter[AltCurrencyCodeFilter.length];
      for (int i = 0; i < AltCurrencyCodeFilters.length; i++) {
        AltCurrencyCodeFilters[i] = (IntegerFilter)AltCurrencyCodeFilter[i];
      }
      try {
        out.setAltCurrencyCodeFilter(AltCurrencyCodeFilters);
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
  
    Map IsCurrentMap = (Map)record.get("IsCurrent");
    Boolean IsCurrentFetch = DataHelper.getFetch(IsCurrentMap);
    Boolean IsCurrentSortDir = DataHelper.getSortDirection(IsCurrentMap);
    Integer IsCurrentSortOrder = DataHelper.getSortOrder(IsCurrentMap);
    if (IsCurrentFetch != null) out.setIsCurrentFetch(IsCurrentFetch);
    if (IsCurrentSortDir != null) out.setIsCurrentSortDirection(IsCurrentSortDir);
    if (IsCurrentSortOrder != null) out.setIsCurrentSortOrder(IsCurrentSortOrder);

    Filter[] IsCurrentFilter = DataHelper.mapToFilterArray(IsCurrentMap, Boolean.class);
    if (IsCurrentFilter != null) {
      BooleanFilter[] IsCurrentFilters = new BooleanFilter[IsCurrentFilter.length];
      for (int i = 0; i < IsCurrentFilters.length; i++) {
        IsCurrentFilters[i] = (BooleanFilter)IsCurrentFilter[i];
      }
      try {
        out.setIsCurrentFilter(IsCurrentFilters);
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
  
    Map InactiveDateMap = (Map)record.get("InactiveDate");
    Boolean InactiveDateFetch = DataHelper.getFetch(InactiveDateMap);
    Boolean InactiveDateSortDir = DataHelper.getSortDirection(InactiveDateMap);
    Integer InactiveDateSortOrder = DataHelper.getSortOrder(InactiveDateMap);
    if (InactiveDateFetch != null) out.setInactiveDateFetch(InactiveDateFetch);
    if (InactiveDateSortDir != null) out.setInactiveDateSortDirection(InactiveDateSortDir);
    if (InactiveDateSortOrder != null) out.setInactiveDateSortOrder(InactiveDateSortOrder);

    Filter[] InactiveDateFilter = DataHelper.mapToFilterArray(InactiveDateMap, Date.class);
    if (InactiveDateFilter != null) {
      DateFilter[] InactiveDateFilters = new DateFilter[InactiveDateFilter.length];
      for (int i = 0; i < InactiveDateFilters.length; i++) {
        InactiveDateFilters[i] = (DateFilter)InactiveDateFilter[i];
      }
      try {
        out.setInactiveDateFilter(InactiveDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
