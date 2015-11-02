/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtPaymentProfileObjectHelper.java
 * Definition File: Customer/AxrtPaymentProfile.xml
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



/** Helper class to convert AxrtPaymentProfileObject JavaBean objects to/from HashMaps.
 */
public class AxrtPaymentProfileObjectHelper implements ArubaObjectHelper
{
  /** convert AxrtPaymentProfileObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (AxrtPaymentProfileObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtPaymentProfileObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtPaymentProfileObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtPaymentProfileObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtPaymentProfileObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert AxrtPaymentProfileObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (AxrtPaymentProfileObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert AxrtPaymentProfileObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "AxrtPaymentProfileObject")
   * @return Map     the output Map
   */
  public static Map toMap (AxrtPaymentProfileObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "AxrtPaymentProfileObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to AxrtPaymentProfileObjectData.
   * @param record the Map containing the data to convert to the object
   * @return AxrtPaymentProfileObjectData the converted object
   */
  public static AxrtPaymentProfileObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to AxrtPaymentProfileObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "AxrtPaymentProfileObject")
   * @return AxrtPaymentProfileObjectData the converted object
   */
  public static AxrtPaymentProfileObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtPaymentProfileObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to AxrtPaymentProfileObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return AxrtPaymentProfileObjectFilter the converted object
   */
  public static AxrtPaymentProfileObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to AxrtPaymentProfileObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "AxrtPaymentProfileObject")
   * @return AxrtPaymentProfileObjectFilter the converted object
   */
  public static AxrtPaymentProfileObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtPaymentProfileObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to AxrtPaymentProfileObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return AxrtPaymentProfileObjectDataList the converted object
   */
  public static AxrtPaymentProfileObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to AxrtPaymentProfileObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "AxrtPaymentProfileObjectList")
   * @return AxrtPaymentProfileObjectDataList the converted object
   */
  public static AxrtPaymentProfileObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "AxrtPaymentProfileObjectList";
    Object[] root = (Object[]) record.get (rootName);
    AxrtPaymentProfileObjectData[] array = null;
    if (root != null)
    {
      array = new AxrtPaymentProfileObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = AxrtPaymentProfileObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new AxrtPaymentProfileObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new AxrtPaymentProfileObjectDataList (array, index, total);
  }
  /** convert AxrtPaymentProfileObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AxrtPaymentProfileObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", AxrtPaymentProfileObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._PayMethodSet) record.put ("PayMethod", in.PayMethod);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._CustBankSortCodeSet) record.put ("CustBankSortCode", in.CustBankSortCode);
  
    if (in._CustBankAccNumSet) record.put ("CustBankAccNum", in.CustBankAccNum);
  
    if (in._AltBankAccNumSet) record.put ("AltBankAccNum", in.AltBankAccNum);
  
    if (in._ClearingHouseIdSet) record.put ("ClearingHouseId", in.ClearingHouseId);
  
    if (in._BankAgencyCodeSet) record.put ("BankAgencyCode", in.BankAgencyCode);
  
    if (in._BankAgencyNameSet) record.put ("BankAgencyName", in.BankAgencyName);
  
    if (in._NewCustBankSortCodeSet) record.put ("NewCustBankSortCode", in.NewCustBankSortCode);
  
    if (in._BankCodeSet) record.put ("BankCode", in.BankCode);
  
    if (in._BankAccountTypeSet) record.put ("BankAccountType", in.BankAccountType);
  
    if (in._BranchNameSet) record.put ("BranchName", in.BranchName);
  
    if (in._BranchCodeSet) record.put ("BranchCode", in.BranchCode);
  
    if (in._CardAccountSet) record.put ("CardAccount", in.CardAccount);
  
    if (in._CardCarrierSet) record.put ("CardCarrier", in.CardCarrier);
  
    if (in._CardExpireSet) record.put ("CardExpire", in.CardExpire);
  
    if (in._AvsAddressIdSet) record.put ("AvsAddressId", in.AvsAddressId);
  
    if (in._AvsResponseCodeSet) record.put ("AvsResponseCode", in.AvsResponseCode);
  
    if (in._TransFlagSet) record.put ("TransFlag", in.TransFlag);
  
    if (in._CustBankAcctTypeSet) record.put ("CustBankAcctType", in.CustBankAcctType);
  
    if (in._CustEmailSet) record.put ("CustEmail", in.CustEmail);
  
    if (in._CustBillAddressSet) record.put ("CustBillAddress", in.CustBillAddress);
  
    if (in._CustBillCitySet) record.put ("CustBillCity", in.CustBillCity);
  
    if (in._CustBillStateSet) record.put ("CustBillState", in.CustBillState);
  
    if (in._CustBillZipSet) record.put ("CustBillZip", in.CustBillZip);
  
    if (in._CustBillCountryCodeSet) record.put ("CustBillCountryCode", in.CustBillCountryCode);
  
    if (in._DriverLicenseNumSet) record.put ("DriverLicenseNum", in.DriverLicenseNum);
  
    if (in._DriverLicenseStateSet) record.put ("DriverLicenseState", in.DriverLicenseState);
  
    if (in._CustCompanyNameSet) record.put ("CustCompanyName", in.CustCompanyName);
  
    if (in._BillCompanyTaxIdSet) record.put ("BillCompanyTaxId", in.BillCompanyTaxId);
  
    if (in._CustPhoneSet) record.put ("CustPhone", in.CustPhone);
  
    if (in._OwnrFnameSet) record.put ("OwnrFname", in.OwnrFname);
  
    if (in._OwnrLnameSet) record.put ("OwnrLname", in.OwnrLname);
  
    if (in._StatusSet) record.put ("Status", in.Status);
  
    if (in._CyclicalBillUsedSet) record.put ("CyclicalBillUsed", in.CyclicalBillUsed);
  
    if (in._IsDefaultSet) record.put ("IsDefault", in.IsDefault);
  
    if (in._NonRealtimeOnlySet) record.put ("NonRealtimeOnly", in.NonRealtimeOnly);
  
    if (in._IsTemporarySet) record.put ("IsTemporary", in.IsTemporary);
  
    if (in._MandateIdSet) record.put ("MandateId", in.MandateId);
  
    if (in._MandateSignDateSet) record.put ("MandateSignDate", in.MandateSignDate);
  
    if (in._MandateStatusSet) record.put ("MandateStatus", in.MandateStatus);
  
    if (in._CustBankIbanSet) record.put ("CustBankIban", in.CustBankIban);
  
    if (in._CustBankBicSet) record.put ("CustBankBic", in.CustBankBic);
  
    if (in._DiffAcctOwnFlagSet) record.put ("DiffAcctOwnFlag", in.DiffAcctOwnFlag);
  
    if (in._CustBankAccOwnerSet) record.put ("CustBankAccOwner", in.CustBankAccOwner);
  
    if (in._SequenceTypeSet) record.put ("SequenceType", in.SequenceType);
  
    if (in._CustBankIbanHistSet) record.put ("CustBankIbanHist", in.CustBankIbanHist);
  
    if (in._CustBankBicHistSet) record.put ("CustBankBicHist", in.CustBankBicHist);
  
    if (in._MandateResetSet) record.put ("MandateReset", in.MandateReset);
  
    if (in._EpgSubscriptionIdSet) record.put ("EpgSubscriptionId", in.EpgSubscriptionId);
  
    if (in._ReferenceNumberSet) record.put ("ReferenceNumber", in.ReferenceNumber);
  
    if (in._TransactionUuidSet) record.put ("TransactionUuid", in.TransactionUuid);
  
    if (in._ProfileCreationTimeSet) record.put ("ProfileCreationTime", in.ProfileCreationTime);
  
    if (in._PaymentMerchantIdSet) record.put ("PaymentMerchantId", in.PaymentMerchantId);
      return record;
  }
  /** convert AxrtPaymentProfileObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (AxrtPaymentProfileObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", AxrtPaymentProfileObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.PayMethod, in.PayMethodSort, in.PayMethodSortAscending, in.PayMethodFetch);
      if (map != null) record.put ("PayMethod", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.CustBankSortCode, in.CustBankSortCodeSort, in.CustBankSortCodeSortAscending, in.CustBankSortCodeFetch, in.CustBankSortCodeCaseInsensitive);
      if (map != null) record.put ("CustBankSortCode", map);
      map = DataHelper.filterToMap (in.CustBankAccNum, in.CustBankAccNumSort, in.CustBankAccNumSortAscending, in.CustBankAccNumFetch, in.CustBankAccNumCaseInsensitive);
      if (map != null) record.put ("CustBankAccNum", map);
      map = DataHelper.filterToMap (in.AltBankAccNum, in.AltBankAccNumSort, in.AltBankAccNumSortAscending, in.AltBankAccNumFetch, in.AltBankAccNumCaseInsensitive);
      if (map != null) record.put ("AltBankAccNum", map);
      map = DataHelper.filterToMap (in.ClearingHouseId, in.ClearingHouseIdSort, in.ClearingHouseIdSortAscending, in.ClearingHouseIdFetch, in.ClearingHouseIdCaseInsensitive);
      if (map != null) record.put ("ClearingHouseId", map);
      map = DataHelper.filterToMap (in.BankAgencyCode, in.BankAgencyCodeSort, in.BankAgencyCodeSortAscending, in.BankAgencyCodeFetch, in.BankAgencyCodeCaseInsensitive);
      if (map != null) record.put ("BankAgencyCode", map);
      map = DataHelper.filterToMap (in.BankAgencyName, in.BankAgencyNameSort, in.BankAgencyNameSortAscending, in.BankAgencyNameFetch, in.BankAgencyNameCaseInsensitive);
      if (map != null) record.put ("BankAgencyName", map);
      map = DataHelper.filterToMap (in.NewCustBankSortCode, in.NewCustBankSortCodeSort, in.NewCustBankSortCodeSortAscending, in.NewCustBankSortCodeFetch, in.NewCustBankSortCodeCaseInsensitive);
      if (map != null) record.put ("NewCustBankSortCode", map);
      map = DataHelper.filterToMap (in.BankCode, in.BankCodeSort, in.BankCodeSortAscending, in.BankCodeFetch, in.BankCodeCaseInsensitive);
      if (map != null) record.put ("BankCode", map);
      map = DataHelper.filterToMap (in.BankAccountType, in.BankAccountTypeSort, in.BankAccountTypeSortAscending, in.BankAccountTypeFetch);
      if (map != null) record.put ("BankAccountType", map);
      map = DataHelper.filterToMap (in.BranchName, in.BranchNameSort, in.BranchNameSortAscending, in.BranchNameFetch, in.BranchNameCaseInsensitive);
      if (map != null) record.put ("BranchName", map);
      map = DataHelper.filterToMap (in.BranchCode, in.BranchCodeSort, in.BranchCodeSortAscending, in.BranchCodeFetch, in.BranchCodeCaseInsensitive);
      if (map != null) record.put ("BranchCode", map);
      map = DataHelper.filterToMap (in.CardAccount, in.CardAccountSort, in.CardAccountSortAscending, in.CardAccountFetch, in.CardAccountCaseInsensitive);
      if (map != null) record.put ("CardAccount", map);
      map = DataHelper.filterToMap (in.CardCarrier, in.CardCarrierSort, in.CardCarrierSortAscending, in.CardCarrierFetch, in.CardCarrierCaseInsensitive);
      if (map != null) record.put ("CardCarrier", map);
      map = DataHelper.filterToMap (in.CardExpire, in.CardExpireSort, in.CardExpireSortAscending, in.CardExpireFetch, in.CardExpireCaseInsensitive);
      if (map != null) record.put ("CardExpire", map);
      map = DataHelper.filterToMap (in.AvsAddressId, in.AvsAddressIdSort, in.AvsAddressIdSortAscending, in.AvsAddressIdFetch);
      if (map != null) record.put ("AvsAddressId", map);
      map = DataHelper.filterToMap (in.AvsResponseCode, in.AvsResponseCodeSort, in.AvsResponseCodeSortAscending, in.AvsResponseCodeFetch, in.AvsResponseCodeCaseInsensitive);
      if (map != null) record.put ("AvsResponseCode", map);
      map = DataHelper.filterToMap (in.TransFlag, in.TransFlagSort, in.TransFlagSortAscending, in.TransFlagFetch, in.TransFlagCaseInsensitive);
      if (map != null) record.put ("TransFlag", map);
      map = DataHelper.filterToMap (in.CustBankAcctType, in.CustBankAcctTypeSort, in.CustBankAcctTypeSortAscending, in.CustBankAcctTypeFetch, in.CustBankAcctTypeCaseInsensitive);
      if (map != null) record.put ("CustBankAcctType", map);
      map = DataHelper.filterToMap (in.CustEmail, in.CustEmailSort, in.CustEmailSortAscending, in.CustEmailFetch, in.CustEmailCaseInsensitive);
      if (map != null) record.put ("CustEmail", map);
      map = DataHelper.filterToMap (in.CustBillAddress, in.CustBillAddressSort, in.CustBillAddressSortAscending, in.CustBillAddressFetch, in.CustBillAddressCaseInsensitive);
      if (map != null) record.put ("CustBillAddress", map);
      map = DataHelper.filterToMap (in.CustBillCity, in.CustBillCitySort, in.CustBillCitySortAscending, in.CustBillCityFetch, in.CustBillCityCaseInsensitive);
      if (map != null) record.put ("CustBillCity", map);
      map = DataHelper.filterToMap (in.CustBillState, in.CustBillStateSort, in.CustBillStateSortAscending, in.CustBillStateFetch, in.CustBillStateCaseInsensitive);
      if (map != null) record.put ("CustBillState", map);
      map = DataHelper.filterToMap (in.CustBillZip, in.CustBillZipSort, in.CustBillZipSortAscending, in.CustBillZipFetch, in.CustBillZipCaseInsensitive);
      if (map != null) record.put ("CustBillZip", map);
      map = DataHelper.filterToMap (in.CustBillCountryCode, in.CustBillCountryCodeSort, in.CustBillCountryCodeSortAscending, in.CustBillCountryCodeFetch);
      if (map != null) record.put ("CustBillCountryCode", map);
      map = DataHelper.filterToMap (in.DriverLicenseNum, in.DriverLicenseNumSort, in.DriverLicenseNumSortAscending, in.DriverLicenseNumFetch, in.DriverLicenseNumCaseInsensitive);
      if (map != null) record.put ("DriverLicenseNum", map);
      map = DataHelper.filterToMap (in.DriverLicenseState, in.DriverLicenseStateSort, in.DriverLicenseStateSortAscending, in.DriverLicenseStateFetch, in.DriverLicenseStateCaseInsensitive);
      if (map != null) record.put ("DriverLicenseState", map);
      map = DataHelper.filterToMap (in.CustCompanyName, in.CustCompanyNameSort, in.CustCompanyNameSortAscending, in.CustCompanyNameFetch, in.CustCompanyNameCaseInsensitive);
      if (map != null) record.put ("CustCompanyName", map);
      map = DataHelper.filterToMap (in.BillCompanyTaxId, in.BillCompanyTaxIdSort, in.BillCompanyTaxIdSortAscending, in.BillCompanyTaxIdFetch);
      if (map != null) record.put ("BillCompanyTaxId", map);
      map = DataHelper.filterToMap (in.CustPhone, in.CustPhoneSort, in.CustPhoneSortAscending, in.CustPhoneFetch, in.CustPhoneCaseInsensitive);
      if (map != null) record.put ("CustPhone", map);
      map = DataHelper.filterToMap (in.OwnrFname, in.OwnrFnameSort, in.OwnrFnameSortAscending, in.OwnrFnameFetch, in.OwnrFnameCaseInsensitive);
      if (map != null) record.put ("OwnrFname", map);
      map = DataHelper.filterToMap (in.OwnrLname, in.OwnrLnameSort, in.OwnrLnameSortAscending, in.OwnrLnameFetch, in.OwnrLnameCaseInsensitive);
      if (map != null) record.put ("OwnrLname", map);
      map = DataHelper.filterToMap (in.Status, in.StatusSort, in.StatusSortAscending, in.StatusFetch);
      if (map != null) record.put ("Status", map);
      map = DataHelper.filterToMap (in.CyclicalBillUsed, in.CyclicalBillUsedSort, in.CyclicalBillUsedSortAscending, in.CyclicalBillUsedFetch);
      if (map != null) record.put ("CyclicalBillUsed", map);
      map = DataHelper.filterToMap (in.IsDefault, in.IsDefaultSort, in.IsDefaultSortAscending, in.IsDefaultFetch);
      if (map != null) record.put ("IsDefault", map);
      map = DataHelper.filterToMap (in.NonRealtimeOnly, in.NonRealtimeOnlySort, in.NonRealtimeOnlySortAscending, in.NonRealtimeOnlyFetch);
      if (map != null) record.put ("NonRealtimeOnly", map);
      map = DataHelper.filterToMap (in.IsTemporary, in.IsTemporarySort, in.IsTemporarySortAscending, in.IsTemporaryFetch);
      if (map != null) record.put ("IsTemporary", map);
      map = DataHelper.filterToMap (in.MandateId, in.MandateIdSort, in.MandateIdSortAscending, in.MandateIdFetch, in.MandateIdCaseInsensitive);
      if (map != null) record.put ("MandateId", map);
      map = DataHelper.filterToMap (in.MandateSignDate, in.MandateSignDateSort, in.MandateSignDateSortAscending, in.MandateSignDateFetch);
      if (map != null) record.put ("MandateSignDate", map);
      map = DataHelper.filterToMap (in.MandateStatus, in.MandateStatusSort, in.MandateStatusSortAscending, in.MandateStatusFetch, in.MandateStatusCaseInsensitive);
      if (map != null) record.put ("MandateStatus", map);
      map = DataHelper.filterToMap (in.CustBankIban, in.CustBankIbanSort, in.CustBankIbanSortAscending, in.CustBankIbanFetch, in.CustBankIbanCaseInsensitive);
      if (map != null) record.put ("CustBankIban", map);
      map = DataHelper.filterToMap (in.CustBankBic, in.CustBankBicSort, in.CustBankBicSortAscending, in.CustBankBicFetch, in.CustBankBicCaseInsensitive);
      if (map != null) record.put ("CustBankBic", map);
      map = DataHelper.filterToMap (in.DiffAcctOwnFlag, in.DiffAcctOwnFlagSort, in.DiffAcctOwnFlagSortAscending, in.DiffAcctOwnFlagFetch, in.DiffAcctOwnFlagCaseInsensitive);
      if (map != null) record.put ("DiffAcctOwnFlag", map);
      map = DataHelper.filterToMap (in.CustBankAccOwner, in.CustBankAccOwnerSort, in.CustBankAccOwnerSortAscending, in.CustBankAccOwnerFetch, in.CustBankAccOwnerCaseInsensitive);
      if (map != null) record.put ("CustBankAccOwner", map);
      map = DataHelper.filterToMap (in.SequenceType, in.SequenceTypeSort, in.SequenceTypeSortAscending, in.SequenceTypeFetch, in.SequenceTypeCaseInsensitive);
      if (map != null) record.put ("SequenceType", map);
      map = DataHelper.filterToMap (in.CustBankIbanHist, in.CustBankIbanHistSort, in.CustBankIbanHistSortAscending, in.CustBankIbanHistFetch, in.CustBankIbanHistCaseInsensitive);
      if (map != null) record.put ("CustBankIbanHist", map);
      map = DataHelper.filterToMap (in.CustBankBicHist, in.CustBankBicHistSort, in.CustBankBicHistSortAscending, in.CustBankBicHistFetch, in.CustBankBicHistCaseInsensitive);
      if (map != null) record.put ("CustBankBicHist", map);
      map = DataHelper.filterToMap (in.MandateReset, in.MandateResetSort, in.MandateResetSortAscending, in.MandateResetFetch, in.MandateResetCaseInsensitive);
      if (map != null) record.put ("MandateReset", map);
      map = DataHelper.filterToMap (in.EpgSubscriptionId, in.EpgSubscriptionIdSort, in.EpgSubscriptionIdSortAscending, in.EpgSubscriptionIdFetch, in.EpgSubscriptionIdCaseInsensitive);
      if (map != null) record.put ("EpgSubscriptionId", map);
      map = DataHelper.filterToMap (in.ReferenceNumber, in.ReferenceNumberSort, in.ReferenceNumberSortAscending, in.ReferenceNumberFetch, in.ReferenceNumberCaseInsensitive);
      if (map != null) record.put ("ReferenceNumber", map);
      map = DataHelper.filterToMap (in.TransactionUuid, in.TransactionUuidSort, in.TransactionUuidSortAscending, in.TransactionUuidFetch, in.TransactionUuidCaseInsensitive);
      if (map != null) record.put ("TransactionUuid", map);
      map = DataHelper.filterToMap (in.ProfileCreationTime, in.ProfileCreationTimeSort, in.ProfileCreationTimeSortAscending, in.ProfileCreationTimeFetch);
      if (map != null) record.put ("ProfileCreationTime", map);
      map = DataHelper.filterToMap (in.PaymentMerchantId, in.PaymentMerchantIdSort, in.PaymentMerchantIdSortAscending, in.PaymentMerchantIdFetch);
      if (map != null) record.put ("PaymentMerchantId", map);
    return record;
  }
  /** convert Map to AxrtPaymentProfileObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtPaymentProfileObjectData the converted object
   */
  public static AxrtPaymentProfileObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtPaymentProfileObjectData out = new AxrtPaymentProfileObjectData ();

    out.Key = AxrtPaymentProfileObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("PayMethod")) != null)
    {
      out.PayMethod = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("CustBankSortCode")) != null)
    {
      out.CustBankSortCode = (String) obj;
    }
  
    if ((obj = record.get ("CustBankAccNum")) != null)
    {
      out.CustBankAccNum = (String) obj;
    }
  
    if ((obj = record.get ("AltBankAccNum")) != null)
    {
      out.AltBankAccNum = (String) obj;
    }
  
    if ((obj = record.get ("ClearingHouseId")) != null)
    {
      out.ClearingHouseId = (String) obj;
    }
  
    if ((obj = record.get ("BankAgencyCode")) != null)
    {
      out.BankAgencyCode = (String) obj;
    }
  
    if ((obj = record.get ("BankAgencyName")) != null)
    {
      out.BankAgencyName = (String) obj;
    }
  
    if ((obj = record.get ("NewCustBankSortCode")) != null)
    {
      out.NewCustBankSortCode = (String) obj;
    }
  
    if ((obj = record.get ("BankCode")) != null)
    {
      out.BankCode = (String) obj;
    }
  
    if ((obj = record.get ("BankAccountType")) != null)
    {
      out.BankAccountType = (Integer) obj;
    }
  
    if ((obj = record.get ("BranchName")) != null)
    {
      out.BranchName = (String) obj;
    }
  
    if ((obj = record.get ("BranchCode")) != null)
    {
      out.BranchCode = (String) obj;
    }
  
    if ((obj = record.get ("CardAccount")) != null)
    {
      out.CardAccount = (String) obj;
    }
  
    if ((obj = record.get ("CardCarrier")) != null)
    {
      out.CardCarrier = (String) obj;
    }
  
    if ((obj = record.get ("CardExpire")) != null)
    {
      out.CardExpire = (String) obj;
    }
  
    if ((obj = record.get ("AvsAddressId")) != null)
    {
      out.AvsAddressId = (Integer) obj;
    }
  
    if ((obj = record.get ("AvsResponseCode")) != null)
    {
      out.AvsResponseCode = (String) obj;
    }
  
    if ((obj = record.get ("TransFlag")) != null)
    {
      out.TransFlag = (String) obj;
    }
  
    if ((obj = record.get ("CustBankAcctType")) != null)
    {
      out.CustBankAcctType = (String) obj;
    }
  
    if ((obj = record.get ("CustEmail")) != null)
    {
      out.CustEmail = (String) obj;
    }
  
    if ((obj = record.get ("CustBillAddress")) != null)
    {
      out.CustBillAddress = (String) obj;
    }
  
    if ((obj = record.get ("CustBillCity")) != null)
    {
      out.CustBillCity = (String) obj;
    }
  
    if ((obj = record.get ("CustBillState")) != null)
    {
      out.CustBillState = (String) obj;
    }
  
    if ((obj = record.get ("CustBillZip")) != null)
    {
      out.CustBillZip = (String) obj;
    }
  
    if ((obj = record.get ("CustBillCountryCode")) != null)
    {
      out.CustBillCountryCode = (Integer) obj;
    }
  
    if ((obj = record.get ("DriverLicenseNum")) != null)
    {
      out.DriverLicenseNum = (String) obj;
    }
  
    if ((obj = record.get ("DriverLicenseState")) != null)
    {
      out.DriverLicenseState = (String) obj;
    }
  
    if ((obj = record.get ("CustCompanyName")) != null)
    {
      out.CustCompanyName = (String) obj;
    }
  
    if ((obj = record.get ("BillCompanyTaxId")) != null)
    {
      out.BillCompanyTaxId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CustPhone")) != null)
    {
      out.CustPhone = (String) obj;
    }
  
    if ((obj = record.get ("OwnrFname")) != null)
    {
      out.OwnrFname = (String) obj;
    }
  
    if ((obj = record.get ("OwnrLname")) != null)
    {
      out.OwnrLname = (String) obj;
    }
  
    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (Integer) obj;
    }
  
    if ((obj = record.get ("CyclicalBillUsed")) != null)
    {
      out.CyclicalBillUsed = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsDefault")) != null)
    {
      out.IsDefault = (Boolean) obj;
    }
  
    if ((obj = record.get ("NonRealtimeOnly")) != null)
    {
      out.NonRealtimeOnly = (Boolean) obj;
    }
  
    if ((obj = record.get ("IsTemporary")) != null)
    {
      out.IsTemporary = (Boolean) obj;
    }
  
    if ((obj = record.get ("MandateId")) != null)
    {
      out.MandateId = (String) obj;
    }
  
    if ((obj = record.get ("MandateSignDate")) != null)
    {
      out.MandateSignDate = (Date) obj;
    }
  
    if ((obj = record.get ("MandateStatus")) != null)
    {
      out.MandateStatus = (String) obj;
    }
  
    if ((obj = record.get ("CustBankIban")) != null)
    {
      out.CustBankIban = (String) obj;
    }
  
    if ((obj = record.get ("CustBankBic")) != null)
    {
      out.CustBankBic = (String) obj;
    }
  
    if ((obj = record.get ("DiffAcctOwnFlag")) != null)
    {
      out.DiffAcctOwnFlag = (String) obj;
    }
  
    if ((obj = record.get ("CustBankAccOwner")) != null)
    {
      out.CustBankAccOwner = (String) obj;
    }
  
    if ((obj = record.get ("SequenceType")) != null)
    {
      out.SequenceType = (String) obj;
    }
  
    if ((obj = record.get ("CustBankIbanHist")) != null)
    {
      out.CustBankIbanHist = (String) obj;
    }
  
    if ((obj = record.get ("CustBankBicHist")) != null)
    {
      out.CustBankBicHist = (String) obj;
    }
  
    if ((obj = record.get ("MandateReset")) != null)
    {
      out.MandateReset = (String) obj;
    }
  
    if ((obj = record.get ("EpgSubscriptionId")) != null)
    {
      out.EpgSubscriptionId = (String) obj;
    }
  
    if ((obj = record.get ("ReferenceNumber")) != null)
    {
      out.ReferenceNumber = (String) obj;
    }
  
    if ((obj = record.get ("TransactionUuid")) != null)
    {
      out.TransactionUuid = (String) obj;
    }
  
    if ((obj = record.get ("ProfileCreationTime")) != null)
    {
      out.ProfileCreationTime = (Date) obj;
    }
  
    if ((obj = record.get ("PaymentMerchantId")) != null)
    {
      out.PaymentMerchantId = (Integer) obj;
    }
      return out;
  }
  /** convert Map to AxrtPaymentProfileObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return AxrtPaymentProfileObjectFilter the converted object
   */
  public static AxrtPaymentProfileObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    AxrtPaymentProfileObjectFilter out = new AxrtPaymentProfileObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = AxrtPaymentProfileObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map PayMethodMap = (Map)record.get("PayMethod");
    Boolean PayMethodFetch = DataHelper.getFetch(PayMethodMap);
    Boolean PayMethodSortDir = DataHelper.getSortDirection(PayMethodMap);
    Integer PayMethodSortOrder = DataHelper.getSortOrder(PayMethodMap);
    if (PayMethodFetch != null) out.setPayMethodFetch(PayMethodFetch);
    if (PayMethodSortDir != null) out.setPayMethodSortDirection(PayMethodSortDir);
    if (PayMethodSortOrder != null) out.setPayMethodSortOrder(PayMethodSortOrder);

    Filter[] PayMethodFilter = DataHelper.mapToFilterArray(PayMethodMap, Integer.class);
    if (PayMethodFilter != null) {
      IntegerFilter[] PayMethodFilters = new IntegerFilter[PayMethodFilter.length];
      for (int i = 0; i < PayMethodFilters.length; i++) {
        PayMethodFilters[i] = (IntegerFilter)PayMethodFilter[i];
      }
      try {
        out.setPayMethodFilter(PayMethodFilters);
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
  
    Map CustBankSortCodeMap = (Map)record.get("CustBankSortCode");
    Boolean CustBankSortCodeFetch = DataHelper.getFetch(CustBankSortCodeMap);
    Boolean CustBankSortCodeSortDir = DataHelper.getSortDirection(CustBankSortCodeMap);
    Integer CustBankSortCodeSortOrder = DataHelper.getSortOrder(CustBankSortCodeMap);
    if (CustBankSortCodeFetch != null) out.setCustBankSortCodeFetch(CustBankSortCodeFetch);
    if (CustBankSortCodeSortDir != null) out.setCustBankSortCodeSortDirection(CustBankSortCodeSortDir);
    if (CustBankSortCodeSortOrder != null) out.setCustBankSortCodeSortOrder(CustBankSortCodeSortOrder);

    Filter[] CustBankSortCodeFilter = DataHelper.mapToFilterArray(CustBankSortCodeMap, String.class);
    if (CustBankSortCodeFilter != null) {
      StringFilter[] CustBankSortCodeFilters = new StringFilter[CustBankSortCodeFilter.length];
      for (int i = 0; i < CustBankSortCodeFilters.length; i++) {
        CustBankSortCodeFilters[i] = (StringFilter)CustBankSortCodeFilter[i];
      }
      try {
        out.setCustBankSortCodeFilter(CustBankSortCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBankAccNumMap = (Map)record.get("CustBankAccNum");
    Boolean CustBankAccNumFetch = DataHelper.getFetch(CustBankAccNumMap);
    Boolean CustBankAccNumSortDir = DataHelper.getSortDirection(CustBankAccNumMap);
    Integer CustBankAccNumSortOrder = DataHelper.getSortOrder(CustBankAccNumMap);
    if (CustBankAccNumFetch != null) out.setCustBankAccNumFetch(CustBankAccNumFetch);
    if (CustBankAccNumSortDir != null) out.setCustBankAccNumSortDirection(CustBankAccNumSortDir);
    if (CustBankAccNumSortOrder != null) out.setCustBankAccNumSortOrder(CustBankAccNumSortOrder);

    Filter[] CustBankAccNumFilter = DataHelper.mapToFilterArray(CustBankAccNumMap, String.class);
    if (CustBankAccNumFilter != null) {
      StringFilter[] CustBankAccNumFilters = new StringFilter[CustBankAccNumFilter.length];
      for (int i = 0; i < CustBankAccNumFilters.length; i++) {
        CustBankAccNumFilters[i] = (StringFilter)CustBankAccNumFilter[i];
      }
      try {
        out.setCustBankAccNumFilter(CustBankAccNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AltBankAccNumMap = (Map)record.get("AltBankAccNum");
    Boolean AltBankAccNumFetch = DataHelper.getFetch(AltBankAccNumMap);
    Boolean AltBankAccNumSortDir = DataHelper.getSortDirection(AltBankAccNumMap);
    Integer AltBankAccNumSortOrder = DataHelper.getSortOrder(AltBankAccNumMap);
    if (AltBankAccNumFetch != null) out.setAltBankAccNumFetch(AltBankAccNumFetch);
    if (AltBankAccNumSortDir != null) out.setAltBankAccNumSortDirection(AltBankAccNumSortDir);
    if (AltBankAccNumSortOrder != null) out.setAltBankAccNumSortOrder(AltBankAccNumSortOrder);

    Filter[] AltBankAccNumFilter = DataHelper.mapToFilterArray(AltBankAccNumMap, String.class);
    if (AltBankAccNumFilter != null) {
      StringFilter[] AltBankAccNumFilters = new StringFilter[AltBankAccNumFilter.length];
      for (int i = 0; i < AltBankAccNumFilters.length; i++) {
        AltBankAccNumFilters[i] = (StringFilter)AltBankAccNumFilter[i];
      }
      try {
        out.setAltBankAccNumFilter(AltBankAccNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ClearingHouseIdMap = (Map)record.get("ClearingHouseId");
    Boolean ClearingHouseIdFetch = DataHelper.getFetch(ClearingHouseIdMap);
    Boolean ClearingHouseIdSortDir = DataHelper.getSortDirection(ClearingHouseIdMap);
    Integer ClearingHouseIdSortOrder = DataHelper.getSortOrder(ClearingHouseIdMap);
    if (ClearingHouseIdFetch != null) out.setClearingHouseIdFetch(ClearingHouseIdFetch);
    if (ClearingHouseIdSortDir != null) out.setClearingHouseIdSortDirection(ClearingHouseIdSortDir);
    if (ClearingHouseIdSortOrder != null) out.setClearingHouseIdSortOrder(ClearingHouseIdSortOrder);

    Filter[] ClearingHouseIdFilter = DataHelper.mapToFilterArray(ClearingHouseIdMap, String.class);
    if (ClearingHouseIdFilter != null) {
      StringFilter[] ClearingHouseIdFilters = new StringFilter[ClearingHouseIdFilter.length];
      for (int i = 0; i < ClearingHouseIdFilters.length; i++) {
        ClearingHouseIdFilters[i] = (StringFilter)ClearingHouseIdFilter[i];
      }
      try {
        out.setClearingHouseIdFilter(ClearingHouseIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BankAgencyCodeMap = (Map)record.get("BankAgencyCode");
    Boolean BankAgencyCodeFetch = DataHelper.getFetch(BankAgencyCodeMap);
    Boolean BankAgencyCodeSortDir = DataHelper.getSortDirection(BankAgencyCodeMap);
    Integer BankAgencyCodeSortOrder = DataHelper.getSortOrder(BankAgencyCodeMap);
    if (BankAgencyCodeFetch != null) out.setBankAgencyCodeFetch(BankAgencyCodeFetch);
    if (BankAgencyCodeSortDir != null) out.setBankAgencyCodeSortDirection(BankAgencyCodeSortDir);
    if (BankAgencyCodeSortOrder != null) out.setBankAgencyCodeSortOrder(BankAgencyCodeSortOrder);

    Filter[] BankAgencyCodeFilter = DataHelper.mapToFilterArray(BankAgencyCodeMap, String.class);
    if (BankAgencyCodeFilter != null) {
      StringFilter[] BankAgencyCodeFilters = new StringFilter[BankAgencyCodeFilter.length];
      for (int i = 0; i < BankAgencyCodeFilters.length; i++) {
        BankAgencyCodeFilters[i] = (StringFilter)BankAgencyCodeFilter[i];
      }
      try {
        out.setBankAgencyCodeFilter(BankAgencyCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BankAgencyNameMap = (Map)record.get("BankAgencyName");
    Boolean BankAgencyNameFetch = DataHelper.getFetch(BankAgencyNameMap);
    Boolean BankAgencyNameSortDir = DataHelper.getSortDirection(BankAgencyNameMap);
    Integer BankAgencyNameSortOrder = DataHelper.getSortOrder(BankAgencyNameMap);
    if (BankAgencyNameFetch != null) out.setBankAgencyNameFetch(BankAgencyNameFetch);
    if (BankAgencyNameSortDir != null) out.setBankAgencyNameSortDirection(BankAgencyNameSortDir);
    if (BankAgencyNameSortOrder != null) out.setBankAgencyNameSortOrder(BankAgencyNameSortOrder);

    Filter[] BankAgencyNameFilter = DataHelper.mapToFilterArray(BankAgencyNameMap, String.class);
    if (BankAgencyNameFilter != null) {
      StringFilter[] BankAgencyNameFilters = new StringFilter[BankAgencyNameFilter.length];
      for (int i = 0; i < BankAgencyNameFilters.length; i++) {
        BankAgencyNameFilters[i] = (StringFilter)BankAgencyNameFilter[i];
      }
      try {
        out.setBankAgencyNameFilter(BankAgencyNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NewCustBankSortCodeMap = (Map)record.get("NewCustBankSortCode");
    Boolean NewCustBankSortCodeFetch = DataHelper.getFetch(NewCustBankSortCodeMap);
    Boolean NewCustBankSortCodeSortDir = DataHelper.getSortDirection(NewCustBankSortCodeMap);
    Integer NewCustBankSortCodeSortOrder = DataHelper.getSortOrder(NewCustBankSortCodeMap);
    if (NewCustBankSortCodeFetch != null) out.setNewCustBankSortCodeFetch(NewCustBankSortCodeFetch);
    if (NewCustBankSortCodeSortDir != null) out.setNewCustBankSortCodeSortDirection(NewCustBankSortCodeSortDir);
    if (NewCustBankSortCodeSortOrder != null) out.setNewCustBankSortCodeSortOrder(NewCustBankSortCodeSortOrder);

    Filter[] NewCustBankSortCodeFilter = DataHelper.mapToFilterArray(NewCustBankSortCodeMap, String.class);
    if (NewCustBankSortCodeFilter != null) {
      StringFilter[] NewCustBankSortCodeFilters = new StringFilter[NewCustBankSortCodeFilter.length];
      for (int i = 0; i < NewCustBankSortCodeFilters.length; i++) {
        NewCustBankSortCodeFilters[i] = (StringFilter)NewCustBankSortCodeFilter[i];
      }
      try {
        out.setNewCustBankSortCodeFilter(NewCustBankSortCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BankCodeMap = (Map)record.get("BankCode");
    Boolean BankCodeFetch = DataHelper.getFetch(BankCodeMap);
    Boolean BankCodeSortDir = DataHelper.getSortDirection(BankCodeMap);
    Integer BankCodeSortOrder = DataHelper.getSortOrder(BankCodeMap);
    if (BankCodeFetch != null) out.setBankCodeFetch(BankCodeFetch);
    if (BankCodeSortDir != null) out.setBankCodeSortDirection(BankCodeSortDir);
    if (BankCodeSortOrder != null) out.setBankCodeSortOrder(BankCodeSortOrder);

    Filter[] BankCodeFilter = DataHelper.mapToFilterArray(BankCodeMap, String.class);
    if (BankCodeFilter != null) {
      StringFilter[] BankCodeFilters = new StringFilter[BankCodeFilter.length];
      for (int i = 0; i < BankCodeFilters.length; i++) {
        BankCodeFilters[i] = (StringFilter)BankCodeFilter[i];
      }
      try {
        out.setBankCodeFilter(BankCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BankAccountTypeMap = (Map)record.get("BankAccountType");
    Boolean BankAccountTypeFetch = DataHelper.getFetch(BankAccountTypeMap);
    Boolean BankAccountTypeSortDir = DataHelper.getSortDirection(BankAccountTypeMap);
    Integer BankAccountTypeSortOrder = DataHelper.getSortOrder(BankAccountTypeMap);
    if (BankAccountTypeFetch != null) out.setBankAccountTypeFetch(BankAccountTypeFetch);
    if (BankAccountTypeSortDir != null) out.setBankAccountTypeSortDirection(BankAccountTypeSortDir);
    if (BankAccountTypeSortOrder != null) out.setBankAccountTypeSortOrder(BankAccountTypeSortOrder);

    Filter[] BankAccountTypeFilter = DataHelper.mapToFilterArray(BankAccountTypeMap, Integer.class);
    if (BankAccountTypeFilter != null) {
      IntegerFilter[] BankAccountTypeFilters = new IntegerFilter[BankAccountTypeFilter.length];
      for (int i = 0; i < BankAccountTypeFilters.length; i++) {
        BankAccountTypeFilters[i] = (IntegerFilter)BankAccountTypeFilter[i];
      }
      try {
        out.setBankAccountTypeFilter(BankAccountTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BranchNameMap = (Map)record.get("BranchName");
    Boolean BranchNameFetch = DataHelper.getFetch(BranchNameMap);
    Boolean BranchNameSortDir = DataHelper.getSortDirection(BranchNameMap);
    Integer BranchNameSortOrder = DataHelper.getSortOrder(BranchNameMap);
    if (BranchNameFetch != null) out.setBranchNameFetch(BranchNameFetch);
    if (BranchNameSortDir != null) out.setBranchNameSortDirection(BranchNameSortDir);
    if (BranchNameSortOrder != null) out.setBranchNameSortOrder(BranchNameSortOrder);

    Filter[] BranchNameFilter = DataHelper.mapToFilterArray(BranchNameMap, String.class);
    if (BranchNameFilter != null) {
      StringFilter[] BranchNameFilters = new StringFilter[BranchNameFilter.length];
      for (int i = 0; i < BranchNameFilters.length; i++) {
        BranchNameFilters[i] = (StringFilter)BranchNameFilter[i];
      }
      try {
        out.setBranchNameFilter(BranchNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BranchCodeMap = (Map)record.get("BranchCode");
    Boolean BranchCodeFetch = DataHelper.getFetch(BranchCodeMap);
    Boolean BranchCodeSortDir = DataHelper.getSortDirection(BranchCodeMap);
    Integer BranchCodeSortOrder = DataHelper.getSortOrder(BranchCodeMap);
    if (BranchCodeFetch != null) out.setBranchCodeFetch(BranchCodeFetch);
    if (BranchCodeSortDir != null) out.setBranchCodeSortDirection(BranchCodeSortDir);
    if (BranchCodeSortOrder != null) out.setBranchCodeSortOrder(BranchCodeSortOrder);

    Filter[] BranchCodeFilter = DataHelper.mapToFilterArray(BranchCodeMap, String.class);
    if (BranchCodeFilter != null) {
      StringFilter[] BranchCodeFilters = new StringFilter[BranchCodeFilter.length];
      for (int i = 0; i < BranchCodeFilters.length; i++) {
        BranchCodeFilters[i] = (StringFilter)BranchCodeFilter[i];
      }
      try {
        out.setBranchCodeFilter(BranchCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CardAccountMap = (Map)record.get("CardAccount");
    Boolean CardAccountFetch = DataHelper.getFetch(CardAccountMap);
    Boolean CardAccountSortDir = DataHelper.getSortDirection(CardAccountMap);
    Integer CardAccountSortOrder = DataHelper.getSortOrder(CardAccountMap);
    if (CardAccountFetch != null) out.setCardAccountFetch(CardAccountFetch);
    if (CardAccountSortDir != null) out.setCardAccountSortDirection(CardAccountSortDir);
    if (CardAccountSortOrder != null) out.setCardAccountSortOrder(CardAccountSortOrder);

    Filter[] CardAccountFilter = DataHelper.mapToFilterArray(CardAccountMap, String.class);
    if (CardAccountFilter != null) {
      StringFilter[] CardAccountFilters = new StringFilter[CardAccountFilter.length];
      for (int i = 0; i < CardAccountFilters.length; i++) {
        CardAccountFilters[i] = (StringFilter)CardAccountFilter[i];
      }
      try {
        out.setCardAccountFilter(CardAccountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CardCarrierMap = (Map)record.get("CardCarrier");
    Boolean CardCarrierFetch = DataHelper.getFetch(CardCarrierMap);
    Boolean CardCarrierSortDir = DataHelper.getSortDirection(CardCarrierMap);
    Integer CardCarrierSortOrder = DataHelper.getSortOrder(CardCarrierMap);
    if (CardCarrierFetch != null) out.setCardCarrierFetch(CardCarrierFetch);
    if (CardCarrierSortDir != null) out.setCardCarrierSortDirection(CardCarrierSortDir);
    if (CardCarrierSortOrder != null) out.setCardCarrierSortOrder(CardCarrierSortOrder);

    Filter[] CardCarrierFilter = DataHelper.mapToFilterArray(CardCarrierMap, String.class);
    if (CardCarrierFilter != null) {
      StringFilter[] CardCarrierFilters = new StringFilter[CardCarrierFilter.length];
      for (int i = 0; i < CardCarrierFilters.length; i++) {
        CardCarrierFilters[i] = (StringFilter)CardCarrierFilter[i];
      }
      try {
        out.setCardCarrierFilter(CardCarrierFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CardExpireMap = (Map)record.get("CardExpire");
    Boolean CardExpireFetch = DataHelper.getFetch(CardExpireMap);
    Boolean CardExpireSortDir = DataHelper.getSortDirection(CardExpireMap);
    Integer CardExpireSortOrder = DataHelper.getSortOrder(CardExpireMap);
    if (CardExpireFetch != null) out.setCardExpireFetch(CardExpireFetch);
    if (CardExpireSortDir != null) out.setCardExpireSortDirection(CardExpireSortDir);
    if (CardExpireSortOrder != null) out.setCardExpireSortOrder(CardExpireSortOrder);

    Filter[] CardExpireFilter = DataHelper.mapToFilterArray(CardExpireMap, String.class);
    if (CardExpireFilter != null) {
      StringFilter[] CardExpireFilters = new StringFilter[CardExpireFilter.length];
      for (int i = 0; i < CardExpireFilters.length; i++) {
        CardExpireFilters[i] = (StringFilter)CardExpireFilter[i];
      }
      try {
        out.setCardExpireFilter(CardExpireFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AvsAddressIdMap = (Map)record.get("AvsAddressId");
    Boolean AvsAddressIdFetch = DataHelper.getFetch(AvsAddressIdMap);
    Boolean AvsAddressIdSortDir = DataHelper.getSortDirection(AvsAddressIdMap);
    Integer AvsAddressIdSortOrder = DataHelper.getSortOrder(AvsAddressIdMap);
    if (AvsAddressIdFetch != null) out.setAvsAddressIdFetch(AvsAddressIdFetch);
    if (AvsAddressIdSortDir != null) out.setAvsAddressIdSortDirection(AvsAddressIdSortDir);
    if (AvsAddressIdSortOrder != null) out.setAvsAddressIdSortOrder(AvsAddressIdSortOrder);

    Filter[] AvsAddressIdFilter = DataHelper.mapToFilterArray(AvsAddressIdMap, Integer.class);
    if (AvsAddressIdFilter != null) {
      IntegerFilter[] AvsAddressIdFilters = new IntegerFilter[AvsAddressIdFilter.length];
      for (int i = 0; i < AvsAddressIdFilters.length; i++) {
        AvsAddressIdFilters[i] = (IntegerFilter)AvsAddressIdFilter[i];
      }
      try {
        out.setAvsAddressIdFilter(AvsAddressIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AvsResponseCodeMap = (Map)record.get("AvsResponseCode");
    Boolean AvsResponseCodeFetch = DataHelper.getFetch(AvsResponseCodeMap);
    Boolean AvsResponseCodeSortDir = DataHelper.getSortDirection(AvsResponseCodeMap);
    Integer AvsResponseCodeSortOrder = DataHelper.getSortOrder(AvsResponseCodeMap);
    if (AvsResponseCodeFetch != null) out.setAvsResponseCodeFetch(AvsResponseCodeFetch);
    if (AvsResponseCodeSortDir != null) out.setAvsResponseCodeSortDirection(AvsResponseCodeSortDir);
    if (AvsResponseCodeSortOrder != null) out.setAvsResponseCodeSortOrder(AvsResponseCodeSortOrder);

    Filter[] AvsResponseCodeFilter = DataHelper.mapToFilterArray(AvsResponseCodeMap, String.class);
    if (AvsResponseCodeFilter != null) {
      StringFilter[] AvsResponseCodeFilters = new StringFilter[AvsResponseCodeFilter.length];
      for (int i = 0; i < AvsResponseCodeFilters.length; i++) {
        AvsResponseCodeFilters[i] = (StringFilter)AvsResponseCodeFilter[i];
      }
      try {
        out.setAvsResponseCodeFilter(AvsResponseCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransFlagMap = (Map)record.get("TransFlag");
    Boolean TransFlagFetch = DataHelper.getFetch(TransFlagMap);
    Boolean TransFlagSortDir = DataHelper.getSortDirection(TransFlagMap);
    Integer TransFlagSortOrder = DataHelper.getSortOrder(TransFlagMap);
    if (TransFlagFetch != null) out.setTransFlagFetch(TransFlagFetch);
    if (TransFlagSortDir != null) out.setTransFlagSortDirection(TransFlagSortDir);
    if (TransFlagSortOrder != null) out.setTransFlagSortOrder(TransFlagSortOrder);

    Filter[] TransFlagFilter = DataHelper.mapToFilterArray(TransFlagMap, String.class);
    if (TransFlagFilter != null) {
      StringFilter[] TransFlagFilters = new StringFilter[TransFlagFilter.length];
      for (int i = 0; i < TransFlagFilters.length; i++) {
        TransFlagFilters[i] = (StringFilter)TransFlagFilter[i];
      }
      try {
        out.setTransFlagFilter(TransFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBankAcctTypeMap = (Map)record.get("CustBankAcctType");
    Boolean CustBankAcctTypeFetch = DataHelper.getFetch(CustBankAcctTypeMap);
    Boolean CustBankAcctTypeSortDir = DataHelper.getSortDirection(CustBankAcctTypeMap);
    Integer CustBankAcctTypeSortOrder = DataHelper.getSortOrder(CustBankAcctTypeMap);
    if (CustBankAcctTypeFetch != null) out.setCustBankAcctTypeFetch(CustBankAcctTypeFetch);
    if (CustBankAcctTypeSortDir != null) out.setCustBankAcctTypeSortDirection(CustBankAcctTypeSortDir);
    if (CustBankAcctTypeSortOrder != null) out.setCustBankAcctTypeSortOrder(CustBankAcctTypeSortOrder);

    Filter[] CustBankAcctTypeFilter = DataHelper.mapToFilterArray(CustBankAcctTypeMap, String.class);
    if (CustBankAcctTypeFilter != null) {
      StringFilter[] CustBankAcctTypeFilters = new StringFilter[CustBankAcctTypeFilter.length];
      for (int i = 0; i < CustBankAcctTypeFilters.length; i++) {
        CustBankAcctTypeFilters[i] = (StringFilter)CustBankAcctTypeFilter[i];
      }
      try {
        out.setCustBankAcctTypeFilter(CustBankAcctTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustEmailMap = (Map)record.get("CustEmail");
    Boolean CustEmailFetch = DataHelper.getFetch(CustEmailMap);
    Boolean CustEmailSortDir = DataHelper.getSortDirection(CustEmailMap);
    Integer CustEmailSortOrder = DataHelper.getSortOrder(CustEmailMap);
    if (CustEmailFetch != null) out.setCustEmailFetch(CustEmailFetch);
    if (CustEmailSortDir != null) out.setCustEmailSortDirection(CustEmailSortDir);
    if (CustEmailSortOrder != null) out.setCustEmailSortOrder(CustEmailSortOrder);

    Filter[] CustEmailFilter = DataHelper.mapToFilterArray(CustEmailMap, String.class);
    if (CustEmailFilter != null) {
      StringFilter[] CustEmailFilters = new StringFilter[CustEmailFilter.length];
      for (int i = 0; i < CustEmailFilters.length; i++) {
        CustEmailFilters[i] = (StringFilter)CustEmailFilter[i];
      }
      try {
        out.setCustEmailFilter(CustEmailFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBillAddressMap = (Map)record.get("CustBillAddress");
    Boolean CustBillAddressFetch = DataHelper.getFetch(CustBillAddressMap);
    Boolean CustBillAddressSortDir = DataHelper.getSortDirection(CustBillAddressMap);
    Integer CustBillAddressSortOrder = DataHelper.getSortOrder(CustBillAddressMap);
    if (CustBillAddressFetch != null) out.setCustBillAddressFetch(CustBillAddressFetch);
    if (CustBillAddressSortDir != null) out.setCustBillAddressSortDirection(CustBillAddressSortDir);
    if (CustBillAddressSortOrder != null) out.setCustBillAddressSortOrder(CustBillAddressSortOrder);

    Filter[] CustBillAddressFilter = DataHelper.mapToFilterArray(CustBillAddressMap, String.class);
    if (CustBillAddressFilter != null) {
      StringFilter[] CustBillAddressFilters = new StringFilter[CustBillAddressFilter.length];
      for (int i = 0; i < CustBillAddressFilters.length; i++) {
        CustBillAddressFilters[i] = (StringFilter)CustBillAddressFilter[i];
      }
      try {
        out.setCustBillAddressFilter(CustBillAddressFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBillCityMap = (Map)record.get("CustBillCity");
    Boolean CustBillCityFetch = DataHelper.getFetch(CustBillCityMap);
    Boolean CustBillCitySortDir = DataHelper.getSortDirection(CustBillCityMap);
    Integer CustBillCitySortOrder = DataHelper.getSortOrder(CustBillCityMap);
    if (CustBillCityFetch != null) out.setCustBillCityFetch(CustBillCityFetch);
    if (CustBillCitySortDir != null) out.setCustBillCitySortDirection(CustBillCitySortDir);
    if (CustBillCitySortOrder != null) out.setCustBillCitySortOrder(CustBillCitySortOrder);

    Filter[] CustBillCityFilter = DataHelper.mapToFilterArray(CustBillCityMap, String.class);
    if (CustBillCityFilter != null) {
      StringFilter[] CustBillCityFilters = new StringFilter[CustBillCityFilter.length];
      for (int i = 0; i < CustBillCityFilters.length; i++) {
        CustBillCityFilters[i] = (StringFilter)CustBillCityFilter[i];
      }
      try {
        out.setCustBillCityFilter(CustBillCityFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBillStateMap = (Map)record.get("CustBillState");
    Boolean CustBillStateFetch = DataHelper.getFetch(CustBillStateMap);
    Boolean CustBillStateSortDir = DataHelper.getSortDirection(CustBillStateMap);
    Integer CustBillStateSortOrder = DataHelper.getSortOrder(CustBillStateMap);
    if (CustBillStateFetch != null) out.setCustBillStateFetch(CustBillStateFetch);
    if (CustBillStateSortDir != null) out.setCustBillStateSortDirection(CustBillStateSortDir);
    if (CustBillStateSortOrder != null) out.setCustBillStateSortOrder(CustBillStateSortOrder);

    Filter[] CustBillStateFilter = DataHelper.mapToFilterArray(CustBillStateMap, String.class);
    if (CustBillStateFilter != null) {
      StringFilter[] CustBillStateFilters = new StringFilter[CustBillStateFilter.length];
      for (int i = 0; i < CustBillStateFilters.length; i++) {
        CustBillStateFilters[i] = (StringFilter)CustBillStateFilter[i];
      }
      try {
        out.setCustBillStateFilter(CustBillStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBillZipMap = (Map)record.get("CustBillZip");
    Boolean CustBillZipFetch = DataHelper.getFetch(CustBillZipMap);
    Boolean CustBillZipSortDir = DataHelper.getSortDirection(CustBillZipMap);
    Integer CustBillZipSortOrder = DataHelper.getSortOrder(CustBillZipMap);
    if (CustBillZipFetch != null) out.setCustBillZipFetch(CustBillZipFetch);
    if (CustBillZipSortDir != null) out.setCustBillZipSortDirection(CustBillZipSortDir);
    if (CustBillZipSortOrder != null) out.setCustBillZipSortOrder(CustBillZipSortOrder);

    Filter[] CustBillZipFilter = DataHelper.mapToFilterArray(CustBillZipMap, String.class);
    if (CustBillZipFilter != null) {
      StringFilter[] CustBillZipFilters = new StringFilter[CustBillZipFilter.length];
      for (int i = 0; i < CustBillZipFilters.length; i++) {
        CustBillZipFilters[i] = (StringFilter)CustBillZipFilter[i];
      }
      try {
        out.setCustBillZipFilter(CustBillZipFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBillCountryCodeMap = (Map)record.get("CustBillCountryCode");
    Boolean CustBillCountryCodeFetch = DataHelper.getFetch(CustBillCountryCodeMap);
    Boolean CustBillCountryCodeSortDir = DataHelper.getSortDirection(CustBillCountryCodeMap);
    Integer CustBillCountryCodeSortOrder = DataHelper.getSortOrder(CustBillCountryCodeMap);
    if (CustBillCountryCodeFetch != null) out.setCustBillCountryCodeFetch(CustBillCountryCodeFetch);
    if (CustBillCountryCodeSortDir != null) out.setCustBillCountryCodeSortDirection(CustBillCountryCodeSortDir);
    if (CustBillCountryCodeSortOrder != null) out.setCustBillCountryCodeSortOrder(CustBillCountryCodeSortOrder);

    Filter[] CustBillCountryCodeFilter = DataHelper.mapToFilterArray(CustBillCountryCodeMap, Integer.class);
    if (CustBillCountryCodeFilter != null) {
      IntegerFilter[] CustBillCountryCodeFilters = new IntegerFilter[CustBillCountryCodeFilter.length];
      for (int i = 0; i < CustBillCountryCodeFilters.length; i++) {
        CustBillCountryCodeFilters[i] = (IntegerFilter)CustBillCountryCodeFilter[i];
      }
      try {
        out.setCustBillCountryCodeFilter(CustBillCountryCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DriverLicenseNumMap = (Map)record.get("DriverLicenseNum");
    Boolean DriverLicenseNumFetch = DataHelper.getFetch(DriverLicenseNumMap);
    Boolean DriverLicenseNumSortDir = DataHelper.getSortDirection(DriverLicenseNumMap);
    Integer DriverLicenseNumSortOrder = DataHelper.getSortOrder(DriverLicenseNumMap);
    if (DriverLicenseNumFetch != null) out.setDriverLicenseNumFetch(DriverLicenseNumFetch);
    if (DriverLicenseNumSortDir != null) out.setDriverLicenseNumSortDirection(DriverLicenseNumSortDir);
    if (DriverLicenseNumSortOrder != null) out.setDriverLicenseNumSortOrder(DriverLicenseNumSortOrder);

    Filter[] DriverLicenseNumFilter = DataHelper.mapToFilterArray(DriverLicenseNumMap, String.class);
    if (DriverLicenseNumFilter != null) {
      StringFilter[] DriverLicenseNumFilters = new StringFilter[DriverLicenseNumFilter.length];
      for (int i = 0; i < DriverLicenseNumFilters.length; i++) {
        DriverLicenseNumFilters[i] = (StringFilter)DriverLicenseNumFilter[i];
      }
      try {
        out.setDriverLicenseNumFilter(DriverLicenseNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DriverLicenseStateMap = (Map)record.get("DriverLicenseState");
    Boolean DriverLicenseStateFetch = DataHelper.getFetch(DriverLicenseStateMap);
    Boolean DriverLicenseStateSortDir = DataHelper.getSortDirection(DriverLicenseStateMap);
    Integer DriverLicenseStateSortOrder = DataHelper.getSortOrder(DriverLicenseStateMap);
    if (DriverLicenseStateFetch != null) out.setDriverLicenseStateFetch(DriverLicenseStateFetch);
    if (DriverLicenseStateSortDir != null) out.setDriverLicenseStateSortDirection(DriverLicenseStateSortDir);
    if (DriverLicenseStateSortOrder != null) out.setDriverLicenseStateSortOrder(DriverLicenseStateSortOrder);

    Filter[] DriverLicenseStateFilter = DataHelper.mapToFilterArray(DriverLicenseStateMap, String.class);
    if (DriverLicenseStateFilter != null) {
      StringFilter[] DriverLicenseStateFilters = new StringFilter[DriverLicenseStateFilter.length];
      for (int i = 0; i < DriverLicenseStateFilters.length; i++) {
        DriverLicenseStateFilters[i] = (StringFilter)DriverLicenseStateFilter[i];
      }
      try {
        out.setDriverLicenseStateFilter(DriverLicenseStateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustCompanyNameMap = (Map)record.get("CustCompanyName");
    Boolean CustCompanyNameFetch = DataHelper.getFetch(CustCompanyNameMap);
    Boolean CustCompanyNameSortDir = DataHelper.getSortDirection(CustCompanyNameMap);
    Integer CustCompanyNameSortOrder = DataHelper.getSortOrder(CustCompanyNameMap);
    if (CustCompanyNameFetch != null) out.setCustCompanyNameFetch(CustCompanyNameFetch);
    if (CustCompanyNameSortDir != null) out.setCustCompanyNameSortDirection(CustCompanyNameSortDir);
    if (CustCompanyNameSortOrder != null) out.setCustCompanyNameSortOrder(CustCompanyNameSortOrder);

    Filter[] CustCompanyNameFilter = DataHelper.mapToFilterArray(CustCompanyNameMap, String.class);
    if (CustCompanyNameFilter != null) {
      StringFilter[] CustCompanyNameFilters = new StringFilter[CustCompanyNameFilter.length];
      for (int i = 0; i < CustCompanyNameFilters.length; i++) {
        CustCompanyNameFilters[i] = (StringFilter)CustCompanyNameFilter[i];
      }
      try {
        out.setCustCompanyNameFilter(CustCompanyNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillCompanyTaxIdMap = (Map)record.get("BillCompanyTaxId");
    Boolean BillCompanyTaxIdFetch = DataHelper.getFetch(BillCompanyTaxIdMap);
    Boolean BillCompanyTaxIdSortDir = DataHelper.getSortDirection(BillCompanyTaxIdMap);
    Integer BillCompanyTaxIdSortOrder = DataHelper.getSortOrder(BillCompanyTaxIdMap);
    if (BillCompanyTaxIdFetch != null) out.setBillCompanyTaxIdFetch(BillCompanyTaxIdFetch);
    if (BillCompanyTaxIdSortDir != null) out.setBillCompanyTaxIdSortDirection(BillCompanyTaxIdSortDir);
    if (BillCompanyTaxIdSortOrder != null) out.setBillCompanyTaxIdSortOrder(BillCompanyTaxIdSortOrder);

    Filter[] BillCompanyTaxIdFilter = DataHelper.mapToFilterArray(BillCompanyTaxIdMap, BigInteger.class);
    if (BillCompanyTaxIdFilter != null) {
      BigIntegerFilter[] BillCompanyTaxIdFilters = new BigIntegerFilter[BillCompanyTaxIdFilter.length];
      for (int i = 0; i < BillCompanyTaxIdFilters.length; i++) {
        BillCompanyTaxIdFilters[i] = (BigIntegerFilter)BillCompanyTaxIdFilter[i];
      }
      try {
        out.setBillCompanyTaxIdFilter(BillCompanyTaxIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustPhoneMap = (Map)record.get("CustPhone");
    Boolean CustPhoneFetch = DataHelper.getFetch(CustPhoneMap);
    Boolean CustPhoneSortDir = DataHelper.getSortDirection(CustPhoneMap);
    Integer CustPhoneSortOrder = DataHelper.getSortOrder(CustPhoneMap);
    if (CustPhoneFetch != null) out.setCustPhoneFetch(CustPhoneFetch);
    if (CustPhoneSortDir != null) out.setCustPhoneSortDirection(CustPhoneSortDir);
    if (CustPhoneSortOrder != null) out.setCustPhoneSortOrder(CustPhoneSortOrder);

    Filter[] CustPhoneFilter = DataHelper.mapToFilterArray(CustPhoneMap, String.class);
    if (CustPhoneFilter != null) {
      StringFilter[] CustPhoneFilters = new StringFilter[CustPhoneFilter.length];
      for (int i = 0; i < CustPhoneFilters.length; i++) {
        CustPhoneFilters[i] = (StringFilter)CustPhoneFilter[i];
      }
      try {
        out.setCustPhoneFilter(CustPhoneFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwnrFnameMap = (Map)record.get("OwnrFname");
    Boolean OwnrFnameFetch = DataHelper.getFetch(OwnrFnameMap);
    Boolean OwnrFnameSortDir = DataHelper.getSortDirection(OwnrFnameMap);
    Integer OwnrFnameSortOrder = DataHelper.getSortOrder(OwnrFnameMap);
    if (OwnrFnameFetch != null) out.setOwnrFnameFetch(OwnrFnameFetch);
    if (OwnrFnameSortDir != null) out.setOwnrFnameSortDirection(OwnrFnameSortDir);
    if (OwnrFnameSortOrder != null) out.setOwnrFnameSortOrder(OwnrFnameSortOrder);

    Filter[] OwnrFnameFilter = DataHelper.mapToFilterArray(OwnrFnameMap, String.class);
    if (OwnrFnameFilter != null) {
      StringFilter[] OwnrFnameFilters = new StringFilter[OwnrFnameFilter.length];
      for (int i = 0; i < OwnrFnameFilters.length; i++) {
        OwnrFnameFilters[i] = (StringFilter)OwnrFnameFilter[i];
      }
      try {
        out.setOwnrFnameFilter(OwnrFnameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OwnrLnameMap = (Map)record.get("OwnrLname");
    Boolean OwnrLnameFetch = DataHelper.getFetch(OwnrLnameMap);
    Boolean OwnrLnameSortDir = DataHelper.getSortDirection(OwnrLnameMap);
    Integer OwnrLnameSortOrder = DataHelper.getSortOrder(OwnrLnameMap);
    if (OwnrLnameFetch != null) out.setOwnrLnameFetch(OwnrLnameFetch);
    if (OwnrLnameSortDir != null) out.setOwnrLnameSortDirection(OwnrLnameSortDir);
    if (OwnrLnameSortOrder != null) out.setOwnrLnameSortOrder(OwnrLnameSortOrder);

    Filter[] OwnrLnameFilter = DataHelper.mapToFilterArray(OwnrLnameMap, String.class);
    if (OwnrLnameFilter != null) {
      StringFilter[] OwnrLnameFilters = new StringFilter[OwnrLnameFilter.length];
      for (int i = 0; i < OwnrLnameFilters.length; i++) {
        OwnrLnameFilters[i] = (StringFilter)OwnrLnameFilter[i];
      }
      try {
        out.setOwnrLnameFilter(OwnrLnameFilters);
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
  
    Map CyclicalBillUsedMap = (Map)record.get("CyclicalBillUsed");
    Boolean CyclicalBillUsedFetch = DataHelper.getFetch(CyclicalBillUsedMap);
    Boolean CyclicalBillUsedSortDir = DataHelper.getSortDirection(CyclicalBillUsedMap);
    Integer CyclicalBillUsedSortOrder = DataHelper.getSortOrder(CyclicalBillUsedMap);
    if (CyclicalBillUsedFetch != null) out.setCyclicalBillUsedFetch(CyclicalBillUsedFetch);
    if (CyclicalBillUsedSortDir != null) out.setCyclicalBillUsedSortDirection(CyclicalBillUsedSortDir);
    if (CyclicalBillUsedSortOrder != null) out.setCyclicalBillUsedSortOrder(CyclicalBillUsedSortOrder);

    Filter[] CyclicalBillUsedFilter = DataHelper.mapToFilterArray(CyclicalBillUsedMap, Boolean.class);
    if (CyclicalBillUsedFilter != null) {
      BooleanFilter[] CyclicalBillUsedFilters = new BooleanFilter[CyclicalBillUsedFilter.length];
      for (int i = 0; i < CyclicalBillUsedFilters.length; i++) {
        CyclicalBillUsedFilters[i] = (BooleanFilter)CyclicalBillUsedFilter[i];
      }
      try {
        out.setCyclicalBillUsedFilter(CyclicalBillUsedFilters);
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
  
    Map NonRealtimeOnlyMap = (Map)record.get("NonRealtimeOnly");
    Boolean NonRealtimeOnlyFetch = DataHelper.getFetch(NonRealtimeOnlyMap);
    Boolean NonRealtimeOnlySortDir = DataHelper.getSortDirection(NonRealtimeOnlyMap);
    Integer NonRealtimeOnlySortOrder = DataHelper.getSortOrder(NonRealtimeOnlyMap);
    if (NonRealtimeOnlyFetch != null) out.setNonRealtimeOnlyFetch(NonRealtimeOnlyFetch);
    if (NonRealtimeOnlySortDir != null) out.setNonRealtimeOnlySortDirection(NonRealtimeOnlySortDir);
    if (NonRealtimeOnlySortOrder != null) out.setNonRealtimeOnlySortOrder(NonRealtimeOnlySortOrder);

    Filter[] NonRealtimeOnlyFilter = DataHelper.mapToFilterArray(NonRealtimeOnlyMap, Boolean.class);
    if (NonRealtimeOnlyFilter != null) {
      BooleanFilter[] NonRealtimeOnlyFilters = new BooleanFilter[NonRealtimeOnlyFilter.length];
      for (int i = 0; i < NonRealtimeOnlyFilters.length; i++) {
        NonRealtimeOnlyFilters[i] = (BooleanFilter)NonRealtimeOnlyFilter[i];
      }
      try {
        out.setNonRealtimeOnlyFilter(NonRealtimeOnlyFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IsTemporaryMap = (Map)record.get("IsTemporary");
    Boolean IsTemporaryFetch = DataHelper.getFetch(IsTemporaryMap);
    Boolean IsTemporarySortDir = DataHelper.getSortDirection(IsTemporaryMap);
    Integer IsTemporarySortOrder = DataHelper.getSortOrder(IsTemporaryMap);
    if (IsTemporaryFetch != null) out.setIsTemporaryFetch(IsTemporaryFetch);
    if (IsTemporarySortDir != null) out.setIsTemporarySortDirection(IsTemporarySortDir);
    if (IsTemporarySortOrder != null) out.setIsTemporarySortOrder(IsTemporarySortOrder);

    Filter[] IsTemporaryFilter = DataHelper.mapToFilterArray(IsTemporaryMap, Boolean.class);
    if (IsTemporaryFilter != null) {
      BooleanFilter[] IsTemporaryFilters = new BooleanFilter[IsTemporaryFilter.length];
      for (int i = 0; i < IsTemporaryFilters.length; i++) {
        IsTemporaryFilters[i] = (BooleanFilter)IsTemporaryFilter[i];
      }
      try {
        out.setIsTemporaryFilter(IsTemporaryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MandateIdMap = (Map)record.get("MandateId");
    Boolean MandateIdFetch = DataHelper.getFetch(MandateIdMap);
    Boolean MandateIdSortDir = DataHelper.getSortDirection(MandateIdMap);
    Integer MandateIdSortOrder = DataHelper.getSortOrder(MandateIdMap);
    if (MandateIdFetch != null) out.setMandateIdFetch(MandateIdFetch);
    if (MandateIdSortDir != null) out.setMandateIdSortDirection(MandateIdSortDir);
    if (MandateIdSortOrder != null) out.setMandateIdSortOrder(MandateIdSortOrder);

    Filter[] MandateIdFilter = DataHelper.mapToFilterArray(MandateIdMap, String.class);
    if (MandateIdFilter != null) {
      StringFilter[] MandateIdFilters = new StringFilter[MandateIdFilter.length];
      for (int i = 0; i < MandateIdFilters.length; i++) {
        MandateIdFilters[i] = (StringFilter)MandateIdFilter[i];
      }
      try {
        out.setMandateIdFilter(MandateIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MandateSignDateMap = (Map)record.get("MandateSignDate");
    Boolean MandateSignDateFetch = DataHelper.getFetch(MandateSignDateMap);
    Boolean MandateSignDateSortDir = DataHelper.getSortDirection(MandateSignDateMap);
    Integer MandateSignDateSortOrder = DataHelper.getSortOrder(MandateSignDateMap);
    if (MandateSignDateFetch != null) out.setMandateSignDateFetch(MandateSignDateFetch);
    if (MandateSignDateSortDir != null) out.setMandateSignDateSortDirection(MandateSignDateSortDir);
    if (MandateSignDateSortOrder != null) out.setMandateSignDateSortOrder(MandateSignDateSortOrder);

    Filter[] MandateSignDateFilter = DataHelper.mapToFilterArray(MandateSignDateMap, Date.class);
    if (MandateSignDateFilter != null) {
      DateFilter[] MandateSignDateFilters = new DateFilter[MandateSignDateFilter.length];
      for (int i = 0; i < MandateSignDateFilters.length; i++) {
        MandateSignDateFilters[i] = (DateFilter)MandateSignDateFilter[i];
      }
      try {
        out.setMandateSignDateFilter(MandateSignDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MandateStatusMap = (Map)record.get("MandateStatus");
    Boolean MandateStatusFetch = DataHelper.getFetch(MandateStatusMap);
    Boolean MandateStatusSortDir = DataHelper.getSortDirection(MandateStatusMap);
    Integer MandateStatusSortOrder = DataHelper.getSortOrder(MandateStatusMap);
    if (MandateStatusFetch != null) out.setMandateStatusFetch(MandateStatusFetch);
    if (MandateStatusSortDir != null) out.setMandateStatusSortDirection(MandateStatusSortDir);
    if (MandateStatusSortOrder != null) out.setMandateStatusSortOrder(MandateStatusSortOrder);

    Filter[] MandateStatusFilter = DataHelper.mapToFilterArray(MandateStatusMap, String.class);
    if (MandateStatusFilter != null) {
      StringFilter[] MandateStatusFilters = new StringFilter[MandateStatusFilter.length];
      for (int i = 0; i < MandateStatusFilters.length; i++) {
        MandateStatusFilters[i] = (StringFilter)MandateStatusFilter[i];
      }
      try {
        out.setMandateStatusFilter(MandateStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBankIbanMap = (Map)record.get("CustBankIban");
    Boolean CustBankIbanFetch = DataHelper.getFetch(CustBankIbanMap);
    Boolean CustBankIbanSortDir = DataHelper.getSortDirection(CustBankIbanMap);
    Integer CustBankIbanSortOrder = DataHelper.getSortOrder(CustBankIbanMap);
    if (CustBankIbanFetch != null) out.setCustBankIbanFetch(CustBankIbanFetch);
    if (CustBankIbanSortDir != null) out.setCustBankIbanSortDirection(CustBankIbanSortDir);
    if (CustBankIbanSortOrder != null) out.setCustBankIbanSortOrder(CustBankIbanSortOrder);

    Filter[] CustBankIbanFilter = DataHelper.mapToFilterArray(CustBankIbanMap, String.class);
    if (CustBankIbanFilter != null) {
      StringFilter[] CustBankIbanFilters = new StringFilter[CustBankIbanFilter.length];
      for (int i = 0; i < CustBankIbanFilters.length; i++) {
        CustBankIbanFilters[i] = (StringFilter)CustBankIbanFilter[i];
      }
      try {
        out.setCustBankIbanFilter(CustBankIbanFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBankBicMap = (Map)record.get("CustBankBic");
    Boolean CustBankBicFetch = DataHelper.getFetch(CustBankBicMap);
    Boolean CustBankBicSortDir = DataHelper.getSortDirection(CustBankBicMap);
    Integer CustBankBicSortOrder = DataHelper.getSortOrder(CustBankBicMap);
    if (CustBankBicFetch != null) out.setCustBankBicFetch(CustBankBicFetch);
    if (CustBankBicSortDir != null) out.setCustBankBicSortDirection(CustBankBicSortDir);
    if (CustBankBicSortOrder != null) out.setCustBankBicSortOrder(CustBankBicSortOrder);

    Filter[] CustBankBicFilter = DataHelper.mapToFilterArray(CustBankBicMap, String.class);
    if (CustBankBicFilter != null) {
      StringFilter[] CustBankBicFilters = new StringFilter[CustBankBicFilter.length];
      for (int i = 0; i < CustBankBicFilters.length; i++) {
        CustBankBicFilters[i] = (StringFilter)CustBankBicFilter[i];
      }
      try {
        out.setCustBankBicFilter(CustBankBicFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiffAcctOwnFlagMap = (Map)record.get("DiffAcctOwnFlag");
    Boolean DiffAcctOwnFlagFetch = DataHelper.getFetch(DiffAcctOwnFlagMap);
    Boolean DiffAcctOwnFlagSortDir = DataHelper.getSortDirection(DiffAcctOwnFlagMap);
    Integer DiffAcctOwnFlagSortOrder = DataHelper.getSortOrder(DiffAcctOwnFlagMap);
    if (DiffAcctOwnFlagFetch != null) out.setDiffAcctOwnFlagFetch(DiffAcctOwnFlagFetch);
    if (DiffAcctOwnFlagSortDir != null) out.setDiffAcctOwnFlagSortDirection(DiffAcctOwnFlagSortDir);
    if (DiffAcctOwnFlagSortOrder != null) out.setDiffAcctOwnFlagSortOrder(DiffAcctOwnFlagSortOrder);

    Filter[] DiffAcctOwnFlagFilter = DataHelper.mapToFilterArray(DiffAcctOwnFlagMap, String.class);
    if (DiffAcctOwnFlagFilter != null) {
      StringFilter[] DiffAcctOwnFlagFilters = new StringFilter[DiffAcctOwnFlagFilter.length];
      for (int i = 0; i < DiffAcctOwnFlagFilters.length; i++) {
        DiffAcctOwnFlagFilters[i] = (StringFilter)DiffAcctOwnFlagFilter[i];
      }
      try {
        out.setDiffAcctOwnFlagFilter(DiffAcctOwnFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBankAccOwnerMap = (Map)record.get("CustBankAccOwner");
    Boolean CustBankAccOwnerFetch = DataHelper.getFetch(CustBankAccOwnerMap);
    Boolean CustBankAccOwnerSortDir = DataHelper.getSortDirection(CustBankAccOwnerMap);
    Integer CustBankAccOwnerSortOrder = DataHelper.getSortOrder(CustBankAccOwnerMap);
    if (CustBankAccOwnerFetch != null) out.setCustBankAccOwnerFetch(CustBankAccOwnerFetch);
    if (CustBankAccOwnerSortDir != null) out.setCustBankAccOwnerSortDirection(CustBankAccOwnerSortDir);
    if (CustBankAccOwnerSortOrder != null) out.setCustBankAccOwnerSortOrder(CustBankAccOwnerSortOrder);

    Filter[] CustBankAccOwnerFilter = DataHelper.mapToFilterArray(CustBankAccOwnerMap, String.class);
    if (CustBankAccOwnerFilter != null) {
      StringFilter[] CustBankAccOwnerFilters = new StringFilter[CustBankAccOwnerFilter.length];
      for (int i = 0; i < CustBankAccOwnerFilters.length; i++) {
        CustBankAccOwnerFilters[i] = (StringFilter)CustBankAccOwnerFilter[i];
      }
      try {
        out.setCustBankAccOwnerFilter(CustBankAccOwnerFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SequenceTypeMap = (Map)record.get("SequenceType");
    Boolean SequenceTypeFetch = DataHelper.getFetch(SequenceTypeMap);
    Boolean SequenceTypeSortDir = DataHelper.getSortDirection(SequenceTypeMap);
    Integer SequenceTypeSortOrder = DataHelper.getSortOrder(SequenceTypeMap);
    if (SequenceTypeFetch != null) out.setSequenceTypeFetch(SequenceTypeFetch);
    if (SequenceTypeSortDir != null) out.setSequenceTypeSortDirection(SequenceTypeSortDir);
    if (SequenceTypeSortOrder != null) out.setSequenceTypeSortOrder(SequenceTypeSortOrder);

    Filter[] SequenceTypeFilter = DataHelper.mapToFilterArray(SequenceTypeMap, String.class);
    if (SequenceTypeFilter != null) {
      StringFilter[] SequenceTypeFilters = new StringFilter[SequenceTypeFilter.length];
      for (int i = 0; i < SequenceTypeFilters.length; i++) {
        SequenceTypeFilters[i] = (StringFilter)SequenceTypeFilter[i];
      }
      try {
        out.setSequenceTypeFilter(SequenceTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBankIbanHistMap = (Map)record.get("CustBankIbanHist");
    Boolean CustBankIbanHistFetch = DataHelper.getFetch(CustBankIbanHistMap);
    Boolean CustBankIbanHistSortDir = DataHelper.getSortDirection(CustBankIbanHistMap);
    Integer CustBankIbanHistSortOrder = DataHelper.getSortOrder(CustBankIbanHistMap);
    if (CustBankIbanHistFetch != null) out.setCustBankIbanHistFetch(CustBankIbanHistFetch);
    if (CustBankIbanHistSortDir != null) out.setCustBankIbanHistSortDirection(CustBankIbanHistSortDir);
    if (CustBankIbanHistSortOrder != null) out.setCustBankIbanHistSortOrder(CustBankIbanHistSortOrder);

    Filter[] CustBankIbanHistFilter = DataHelper.mapToFilterArray(CustBankIbanHistMap, String.class);
    if (CustBankIbanHistFilter != null) {
      StringFilter[] CustBankIbanHistFilters = new StringFilter[CustBankIbanHistFilter.length];
      for (int i = 0; i < CustBankIbanHistFilters.length; i++) {
        CustBankIbanHistFilters[i] = (StringFilter)CustBankIbanHistFilter[i];
      }
      try {
        out.setCustBankIbanHistFilter(CustBankIbanHistFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CustBankBicHistMap = (Map)record.get("CustBankBicHist");
    Boolean CustBankBicHistFetch = DataHelper.getFetch(CustBankBicHistMap);
    Boolean CustBankBicHistSortDir = DataHelper.getSortDirection(CustBankBicHistMap);
    Integer CustBankBicHistSortOrder = DataHelper.getSortOrder(CustBankBicHistMap);
    if (CustBankBicHistFetch != null) out.setCustBankBicHistFetch(CustBankBicHistFetch);
    if (CustBankBicHistSortDir != null) out.setCustBankBicHistSortDirection(CustBankBicHistSortDir);
    if (CustBankBicHistSortOrder != null) out.setCustBankBicHistSortOrder(CustBankBicHistSortOrder);

    Filter[] CustBankBicHistFilter = DataHelper.mapToFilterArray(CustBankBicHistMap, String.class);
    if (CustBankBicHistFilter != null) {
      StringFilter[] CustBankBicHistFilters = new StringFilter[CustBankBicHistFilter.length];
      for (int i = 0; i < CustBankBicHistFilters.length; i++) {
        CustBankBicHistFilters[i] = (StringFilter)CustBankBicHistFilter[i];
      }
      try {
        out.setCustBankBicHistFilter(CustBankBicHistFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MandateResetMap = (Map)record.get("MandateReset");
    Boolean MandateResetFetch = DataHelper.getFetch(MandateResetMap);
    Boolean MandateResetSortDir = DataHelper.getSortDirection(MandateResetMap);
    Integer MandateResetSortOrder = DataHelper.getSortOrder(MandateResetMap);
    if (MandateResetFetch != null) out.setMandateResetFetch(MandateResetFetch);
    if (MandateResetSortDir != null) out.setMandateResetSortDirection(MandateResetSortDir);
    if (MandateResetSortOrder != null) out.setMandateResetSortOrder(MandateResetSortOrder);

    Filter[] MandateResetFilter = DataHelper.mapToFilterArray(MandateResetMap, String.class);
    if (MandateResetFilter != null) {
      StringFilter[] MandateResetFilters = new StringFilter[MandateResetFilter.length];
      for (int i = 0; i < MandateResetFilters.length; i++) {
        MandateResetFilters[i] = (StringFilter)MandateResetFilter[i];
      }
      try {
        out.setMandateResetFilter(MandateResetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EpgSubscriptionIdMap = (Map)record.get("EpgSubscriptionId");
    Boolean EpgSubscriptionIdFetch = DataHelper.getFetch(EpgSubscriptionIdMap);
    Boolean EpgSubscriptionIdSortDir = DataHelper.getSortDirection(EpgSubscriptionIdMap);
    Integer EpgSubscriptionIdSortOrder = DataHelper.getSortOrder(EpgSubscriptionIdMap);
    if (EpgSubscriptionIdFetch != null) out.setEpgSubscriptionIdFetch(EpgSubscriptionIdFetch);
    if (EpgSubscriptionIdSortDir != null) out.setEpgSubscriptionIdSortDirection(EpgSubscriptionIdSortDir);
    if (EpgSubscriptionIdSortOrder != null) out.setEpgSubscriptionIdSortOrder(EpgSubscriptionIdSortOrder);

    Filter[] EpgSubscriptionIdFilter = DataHelper.mapToFilterArray(EpgSubscriptionIdMap, String.class);
    if (EpgSubscriptionIdFilter != null) {
      StringFilter[] EpgSubscriptionIdFilters = new StringFilter[EpgSubscriptionIdFilter.length];
      for (int i = 0; i < EpgSubscriptionIdFilters.length; i++) {
        EpgSubscriptionIdFilters[i] = (StringFilter)EpgSubscriptionIdFilter[i];
      }
      try {
        out.setEpgSubscriptionIdFilter(EpgSubscriptionIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ReferenceNumberMap = (Map)record.get("ReferenceNumber");
    Boolean ReferenceNumberFetch = DataHelper.getFetch(ReferenceNumberMap);
    Boolean ReferenceNumberSortDir = DataHelper.getSortDirection(ReferenceNumberMap);
    Integer ReferenceNumberSortOrder = DataHelper.getSortOrder(ReferenceNumberMap);
    if (ReferenceNumberFetch != null) out.setReferenceNumberFetch(ReferenceNumberFetch);
    if (ReferenceNumberSortDir != null) out.setReferenceNumberSortDirection(ReferenceNumberSortDir);
    if (ReferenceNumberSortOrder != null) out.setReferenceNumberSortOrder(ReferenceNumberSortOrder);

    Filter[] ReferenceNumberFilter = DataHelper.mapToFilterArray(ReferenceNumberMap, String.class);
    if (ReferenceNumberFilter != null) {
      StringFilter[] ReferenceNumberFilters = new StringFilter[ReferenceNumberFilter.length];
      for (int i = 0; i < ReferenceNumberFilters.length; i++) {
        ReferenceNumberFilters[i] = (StringFilter)ReferenceNumberFilter[i];
      }
      try {
        out.setReferenceNumberFilter(ReferenceNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransactionUuidMap = (Map)record.get("TransactionUuid");
    Boolean TransactionUuidFetch = DataHelper.getFetch(TransactionUuidMap);
    Boolean TransactionUuidSortDir = DataHelper.getSortDirection(TransactionUuidMap);
    Integer TransactionUuidSortOrder = DataHelper.getSortOrder(TransactionUuidMap);
    if (TransactionUuidFetch != null) out.setTransactionUuidFetch(TransactionUuidFetch);
    if (TransactionUuidSortDir != null) out.setTransactionUuidSortDirection(TransactionUuidSortDir);
    if (TransactionUuidSortOrder != null) out.setTransactionUuidSortOrder(TransactionUuidSortOrder);

    Filter[] TransactionUuidFilter = DataHelper.mapToFilterArray(TransactionUuidMap, String.class);
    if (TransactionUuidFilter != null) {
      StringFilter[] TransactionUuidFilters = new StringFilter[TransactionUuidFilter.length];
      for (int i = 0; i < TransactionUuidFilters.length; i++) {
        TransactionUuidFilters[i] = (StringFilter)TransactionUuidFilter[i];
      }
      try {
        out.setTransactionUuidFilter(TransactionUuidFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProfileCreationTimeMap = (Map)record.get("ProfileCreationTime");
    Boolean ProfileCreationTimeFetch = DataHelper.getFetch(ProfileCreationTimeMap);
    Boolean ProfileCreationTimeSortDir = DataHelper.getSortDirection(ProfileCreationTimeMap);
    Integer ProfileCreationTimeSortOrder = DataHelper.getSortOrder(ProfileCreationTimeMap);
    if (ProfileCreationTimeFetch != null) out.setProfileCreationTimeFetch(ProfileCreationTimeFetch);
    if (ProfileCreationTimeSortDir != null) out.setProfileCreationTimeSortDirection(ProfileCreationTimeSortDir);
    if (ProfileCreationTimeSortOrder != null) out.setProfileCreationTimeSortOrder(ProfileCreationTimeSortOrder);

    Filter[] ProfileCreationTimeFilter = DataHelper.mapToFilterArray(ProfileCreationTimeMap, Date.class);
    if (ProfileCreationTimeFilter != null) {
      DateFilter[] ProfileCreationTimeFilters = new DateFilter[ProfileCreationTimeFilter.length];
      for (int i = 0; i < ProfileCreationTimeFilters.length; i++) {
        ProfileCreationTimeFilters[i] = (DateFilter)ProfileCreationTimeFilter[i];
      }
      try {
        out.setProfileCreationTimeFilter(ProfileCreationTimeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PaymentMerchantIdMap = (Map)record.get("PaymentMerchantId");
    Boolean PaymentMerchantIdFetch = DataHelper.getFetch(PaymentMerchantIdMap);
    Boolean PaymentMerchantIdSortDir = DataHelper.getSortDirection(PaymentMerchantIdMap);
    Integer PaymentMerchantIdSortOrder = DataHelper.getSortOrder(PaymentMerchantIdMap);
    if (PaymentMerchantIdFetch != null) out.setPaymentMerchantIdFetch(PaymentMerchantIdFetch);
    if (PaymentMerchantIdSortDir != null) out.setPaymentMerchantIdSortDirection(PaymentMerchantIdSortDir);
    if (PaymentMerchantIdSortOrder != null) out.setPaymentMerchantIdSortOrder(PaymentMerchantIdSortOrder);

    Filter[] PaymentMerchantIdFilter = DataHelper.mapToFilterArray(PaymentMerchantIdMap, Integer.class);
    if (PaymentMerchantIdFilter != null) {
      IntegerFilter[] PaymentMerchantIdFilters = new IntegerFilter[PaymentMerchantIdFilter.length];
      for (int i = 0; i < PaymentMerchantIdFilters.length; i++) {
        PaymentMerchantIdFilters[i] = (IntegerFilter)PaymentMerchantIdFilter[i];
      }
      try {
        out.setPaymentMerchantIdFilter(PaymentMerchantIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
