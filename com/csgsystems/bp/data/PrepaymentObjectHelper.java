/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PrepaymentObjectHelper.java
 * Definition File: Customer/Prepayment.xml
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



/** Helper class to convert PrepaymentObject JavaBean objects to/from HashMaps.
 */
public class PrepaymentObjectHelper implements ArubaObjectHelper
{
  /** convert PrepaymentObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PrepaymentObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PrepaymentObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PrepaymentObject")
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PrepaymentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PrepaymentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PrepaymentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PrepaymentObject")
   * @return Map     the output Map
   */
  public static Map toMap (PrepaymentObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PrepaymentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PrepaymentObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PrepaymentObjectData the converted object
   */
  public static PrepaymentObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PrepaymentObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PrepaymentObject")
   * @return PrepaymentObjectData the converted object
   */
  public static PrepaymentObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PrepaymentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PrepaymentObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PrepaymentObjectFilter the converted object
   */
  public static PrepaymentObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PrepaymentObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PrepaymentObject")
   * @return PrepaymentObjectFilter the converted object
   */
  public static PrepaymentObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PrepaymentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PrepaymentObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PrepaymentObjectDataList the converted object
   */
  public static PrepaymentObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PrepaymentObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PrepaymentObjectList")
   * @return PrepaymentObjectDataList the converted object
   */
  public static PrepaymentObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PrepaymentObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PrepaymentObjectData[] array = null;
    if (root != null)
    {
      array = new PrepaymentObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PrepaymentObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PrepaymentObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PrepaymentObjectDataList (array, index, total);
  }
  /** convert PrepaymentObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PrepaymentObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PrepaymentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._EpgTransactionIdSet) record.put ("EpgTransactionId", in.EpgTransactionId);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._UndesignatedAmountSet) record.put ("UndesignatedAmount", in.UndesignatedAmount);
  
    if (in._TaxRateSet) record.put ("TaxRate", in.TaxRate);
  
    if (in._DesignatedTaxAmountSet) record.put ("DesignatedTaxAmount", in.DesignatedTaxAmount);
  
    if (in._TaxPointSet) record.put ("TaxPoint", in.TaxPoint);
  
    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._TransDtSet) record.put ("TransDt", in.TransDt);
  
    if (in._TaxTypeCodeSet) record.put ("TaxTypeCode", in.TaxTypeCode);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._SourceTypeSet) record.put ("SourceType", in.SourceType);
  
    if (in._SourceIdSet) record.put ("SourceId", in.SourceId);
  
    if (in._SourceIdServSet) record.put ("SourceIdServ", in.SourceIdServ);
  
    if (in._DiscountIdSet) record.put ("DiscountId", in.DiscountId);
  
    if (in._AllocatedTaxSet) record.put ("AllocatedTax", in.AllocatedTax);
  
    if (in._AllocatedUndesignatedSet) record.put ("AllocatedUndesignated", in.AllocatedUndesignated);
  
    if (in._MicrBankIdSet) record.put ("MicrBankId", in.MicrBankId);
  
    if (in._MicrDdaNumSet) record.put ("MicrDdaNum", in.MicrDdaNum);
  
    if (in._MicrCheckNumSet) record.put ("MicrCheckNum", in.MicrCheckNum);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._StatusSet) record.put ("Status", in.Status);
  
    if (in._ImpliedDecimalSet) record.put ("ImpliedDecimal", in.ImpliedDecimal);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._PayMethodSet) record.put ("PayMethod", in.PayMethod);
  
    if (in._RealtimeIndicatorSet) record.put ("RealtimeIndicator", in.RealtimeIndicator);
  
    if (in._PaymentProfileIdSet) record.put ("PaymentProfileId", in.PaymentProfileId);
  
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
  /** convert PrepaymentObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PrepaymentObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PrepaymentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.EpgTransactionId, in.EpgTransactionIdSort, in.EpgTransactionIdSortAscending, in.EpgTransactionIdFetch, in.EpgTransactionIdCaseInsensitive);
      if (map != null) record.put ("EpgTransactionId", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.UndesignatedAmount, in.UndesignatedAmountSort, in.UndesignatedAmountSortAscending, in.UndesignatedAmountFetch);
      if (map != null) record.put ("UndesignatedAmount", map);
      map = DataHelper.filterToMap (in.TaxRate, in.TaxRateSort, in.TaxRateSortAscending, in.TaxRateFetch);
      if (map != null) record.put ("TaxRate", map);
      map = DataHelper.filterToMap (in.DesignatedTaxAmount, in.DesignatedTaxAmountSort, in.DesignatedTaxAmountSortAscending, in.DesignatedTaxAmountFetch);
      if (map != null) record.put ("DesignatedTaxAmount", map);
      map = DataHelper.filterToMap (in.TaxPoint, in.TaxPointSort, in.TaxPointSortAscending, in.TaxPointFetch);
      if (map != null) record.put ("TaxPoint", map);
      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.TransDt, in.TransDtSort, in.TransDtSortAscending, in.TransDtFetch);
      if (map != null) record.put ("TransDt", map);
      map = DataHelper.filterToMap (in.TaxTypeCode, in.TaxTypeCodeSort, in.TaxTypeCodeSortAscending, in.TaxTypeCodeFetch);
      if (map != null) record.put ("TaxTypeCode", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.SourceType, in.SourceTypeSort, in.SourceTypeSortAscending, in.SourceTypeFetch);
      if (map != null) record.put ("SourceType", map);
      map = DataHelper.filterToMap (in.SourceId, in.SourceIdSort, in.SourceIdSortAscending, in.SourceIdFetch);
      if (map != null) record.put ("SourceId", map);
      map = DataHelper.filterToMap (in.SourceIdServ, in.SourceIdServSort, in.SourceIdServSortAscending, in.SourceIdServFetch);
      if (map != null) record.put ("SourceIdServ", map);
      map = DataHelper.filterToMap (in.DiscountId, in.DiscountIdSort, in.DiscountIdSortAscending, in.DiscountIdFetch);
      if (map != null) record.put ("DiscountId", map);
      map = DataHelper.filterToMap (in.AllocatedTax, in.AllocatedTaxSort, in.AllocatedTaxSortAscending, in.AllocatedTaxFetch);
      if (map != null) record.put ("AllocatedTax", map);
      map = DataHelper.filterToMap (in.AllocatedUndesignated, in.AllocatedUndesignatedSort, in.AllocatedUndesignatedSortAscending, in.AllocatedUndesignatedFetch);
      if (map != null) record.put ("AllocatedUndesignated", map);
      map = DataHelper.filterToMap (in.MicrBankId, in.MicrBankIdSort, in.MicrBankIdSortAscending, in.MicrBankIdFetch, in.MicrBankIdCaseInsensitive);
      if (map != null) record.put ("MicrBankId", map);
      map = DataHelper.filterToMap (in.MicrDdaNum, in.MicrDdaNumSort, in.MicrDdaNumSortAscending, in.MicrDdaNumFetch, in.MicrDdaNumCaseInsensitive);
      if (map != null) record.put ("MicrDdaNum", map);
      map = DataHelper.filterToMap (in.MicrCheckNum, in.MicrCheckNumSort, in.MicrCheckNumSortAscending, in.MicrCheckNumFetch, in.MicrCheckNumCaseInsensitive);
      if (map != null) record.put ("MicrCheckNum", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.Status, in.StatusSort, in.StatusSortAscending, in.StatusFetch);
      if (map != null) record.put ("Status", map);
      map = DataHelper.filterToMap (in.ImpliedDecimal, in.ImpliedDecimalSort, in.ImpliedDecimalSortAscending, in.ImpliedDecimalFetch);
      if (map != null) record.put ("ImpliedDecimal", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.PayMethod, in.PayMethodSort, in.PayMethodSortAscending, in.PayMethodFetch);
      if (map != null) record.put ("PayMethod", map);
      map = DataHelper.filterToMap (in.RealtimeIndicator, in.RealtimeIndicatorSort, in.RealtimeIndicatorSortAscending, in.RealtimeIndicatorFetch);
      if (map != null) record.put ("RealtimeIndicator", map);
      map = DataHelper.filterToMap (in.PaymentProfileId, in.PaymentProfileIdSort, in.PaymentProfileIdSortAscending, in.PaymentProfileIdFetch);
      if (map != null) record.put ("PaymentProfileId", map);
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
  /** convert Map to PrepaymentObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PrepaymentObjectData the converted object
   */
  public static PrepaymentObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PrepaymentObjectData out = new PrepaymentObjectData ();

    out.Key = PrepaymentObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
  
    if ((obj = record.get ("EpgTransactionId")) != null)
    {
      out.EpgTransactionId = (String) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("UndesignatedAmount")) != null)
    {
      out.UndesignatedAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TaxRate")) != null)
    {
      out.TaxRate = (Integer) obj;
    }
  
    if ((obj = record.get ("DesignatedTaxAmount")) != null)
    {
      out.DesignatedTaxAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TaxPoint")) != null)
    {
      out.TaxPoint = (Date) obj;
    }
  
    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("TransDt")) != null)
    {
      out.TransDt = (Date) obj;
    }
  
    if ((obj = record.get ("TaxTypeCode")) != null)
    {
      out.TaxTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("SourceType")) != null)
    {
      out.SourceType = (Integer) obj;
    }
  
    if ((obj = record.get ("SourceId")) != null)
    {
      out.SourceId = (Integer) obj;
    }
  
    if ((obj = record.get ("SourceIdServ")) != null)
    {
      out.SourceIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountId")) != null)
    {
      out.DiscountId = (Integer) obj;
    }
  
    if ((obj = record.get ("AllocatedTax")) != null)
    {
      out.AllocatedTax = (BigInteger) obj;
    }
  
    if ((obj = record.get ("AllocatedUndesignated")) != null)
    {
      out.AllocatedUndesignated = (BigInteger) obj;
    }
  
    if ((obj = record.get ("MicrBankId")) != null)
    {
      out.MicrBankId = (String) obj;
    }
  
    if ((obj = record.get ("MicrDdaNum")) != null)
    {
      out.MicrDdaNum = (String) obj;
    }
  
    if ((obj = record.get ("MicrCheckNum")) != null)
    {
      out.MicrCheckNum = (String) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("Status")) != null)
    {
      out.Status = (Integer) obj;
    }
  
    if ((obj = record.get ("ImpliedDecimal")) != null)
    {
      out.ImpliedDecimal = (Integer) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("PayMethod")) != null)
    {
      out.PayMethod = (Integer) obj;
    }
  
    if ((obj = record.get ("RealtimeIndicator")) != null)
    {
      out.RealtimeIndicator = (Integer) obj;
    }
  
    if ((obj = record.get ("PaymentProfileId")) != null)
    {
      out.PaymentProfileId = (BigInteger) obj;
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
  /** convert Map to PrepaymentObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PrepaymentObjectFilter the converted object
   */
  public static PrepaymentObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PrepaymentObjectFilter out = new PrepaymentObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PrepaymentObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map EpgTransactionIdMap = (Map)record.get("EpgTransactionId");
    Boolean EpgTransactionIdFetch = DataHelper.getFetch(EpgTransactionIdMap);
    Boolean EpgTransactionIdSortDir = DataHelper.getSortDirection(EpgTransactionIdMap);
    Integer EpgTransactionIdSortOrder = DataHelper.getSortOrder(EpgTransactionIdMap);
    if (EpgTransactionIdFetch != null) out.setEpgTransactionIdFetch(EpgTransactionIdFetch);
    if (EpgTransactionIdSortDir != null) out.setEpgTransactionIdSortDirection(EpgTransactionIdSortDir);
    if (EpgTransactionIdSortOrder != null) out.setEpgTransactionIdSortOrder(EpgTransactionIdSortOrder);

    Filter[] EpgTransactionIdFilter = DataHelper.mapToFilterArray(EpgTransactionIdMap, String.class);
    if (EpgTransactionIdFilter != null) {
      StringFilter[] EpgTransactionIdFilters = new StringFilter[EpgTransactionIdFilter.length];
      for (int i = 0; i < EpgTransactionIdFilters.length; i++) {
        EpgTransactionIdFilters[i] = (StringFilter)EpgTransactionIdFilter[i];
      }
      try {
        out.setEpgTransactionIdFilter(EpgTransactionIdFilters);
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
  
    Map UndesignatedAmountMap = (Map)record.get("UndesignatedAmount");
    Boolean UndesignatedAmountFetch = DataHelper.getFetch(UndesignatedAmountMap);
    Boolean UndesignatedAmountSortDir = DataHelper.getSortDirection(UndesignatedAmountMap);
    Integer UndesignatedAmountSortOrder = DataHelper.getSortOrder(UndesignatedAmountMap);
    if (UndesignatedAmountFetch != null) out.setUndesignatedAmountFetch(UndesignatedAmountFetch);
    if (UndesignatedAmountSortDir != null) out.setUndesignatedAmountSortDirection(UndesignatedAmountSortDir);
    if (UndesignatedAmountSortOrder != null) out.setUndesignatedAmountSortOrder(UndesignatedAmountSortOrder);

    Filter[] UndesignatedAmountFilter = DataHelper.mapToFilterArray(UndesignatedAmountMap, BigInteger.class);
    if (UndesignatedAmountFilter != null) {
      BigIntegerFilter[] UndesignatedAmountFilters = new BigIntegerFilter[UndesignatedAmountFilter.length];
      for (int i = 0; i < UndesignatedAmountFilters.length; i++) {
        UndesignatedAmountFilters[i] = (BigIntegerFilter)UndesignatedAmountFilter[i];
      }
      try {
        out.setUndesignatedAmountFilter(UndesignatedAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxRateMap = (Map)record.get("TaxRate");
    Boolean TaxRateFetch = DataHelper.getFetch(TaxRateMap);
    Boolean TaxRateSortDir = DataHelper.getSortDirection(TaxRateMap);
    Integer TaxRateSortOrder = DataHelper.getSortOrder(TaxRateMap);
    if (TaxRateFetch != null) out.setTaxRateFetch(TaxRateFetch);
    if (TaxRateSortDir != null) out.setTaxRateSortDirection(TaxRateSortDir);
    if (TaxRateSortOrder != null) out.setTaxRateSortOrder(TaxRateSortOrder);

    Filter[] TaxRateFilter = DataHelper.mapToFilterArray(TaxRateMap, Integer.class);
    if (TaxRateFilter != null) {
      IntegerFilter[] TaxRateFilters = new IntegerFilter[TaxRateFilter.length];
      for (int i = 0; i < TaxRateFilters.length; i++) {
        TaxRateFilters[i] = (IntegerFilter)TaxRateFilter[i];
      }
      try {
        out.setTaxRateFilter(TaxRateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DesignatedTaxAmountMap = (Map)record.get("DesignatedTaxAmount");
    Boolean DesignatedTaxAmountFetch = DataHelper.getFetch(DesignatedTaxAmountMap);
    Boolean DesignatedTaxAmountSortDir = DataHelper.getSortDirection(DesignatedTaxAmountMap);
    Integer DesignatedTaxAmountSortOrder = DataHelper.getSortOrder(DesignatedTaxAmountMap);
    if (DesignatedTaxAmountFetch != null) out.setDesignatedTaxAmountFetch(DesignatedTaxAmountFetch);
    if (DesignatedTaxAmountSortDir != null) out.setDesignatedTaxAmountSortDirection(DesignatedTaxAmountSortDir);
    if (DesignatedTaxAmountSortOrder != null) out.setDesignatedTaxAmountSortOrder(DesignatedTaxAmountSortOrder);

    Filter[] DesignatedTaxAmountFilter = DataHelper.mapToFilterArray(DesignatedTaxAmountMap, BigInteger.class);
    if (DesignatedTaxAmountFilter != null) {
      BigIntegerFilter[] DesignatedTaxAmountFilters = new BigIntegerFilter[DesignatedTaxAmountFilter.length];
      for (int i = 0; i < DesignatedTaxAmountFilters.length; i++) {
        DesignatedTaxAmountFilters[i] = (BigIntegerFilter)DesignatedTaxAmountFilter[i];
      }
      try {
        out.setDesignatedTaxAmountFilter(DesignatedTaxAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxPointMap = (Map)record.get("TaxPoint");
    Boolean TaxPointFetch = DataHelper.getFetch(TaxPointMap);
    Boolean TaxPointSortDir = DataHelper.getSortDirection(TaxPointMap);
    Integer TaxPointSortOrder = DataHelper.getSortOrder(TaxPointMap);
    if (TaxPointFetch != null) out.setTaxPointFetch(TaxPointFetch);
    if (TaxPointSortDir != null) out.setTaxPointSortDirection(TaxPointSortDir);
    if (TaxPointSortOrder != null) out.setTaxPointSortOrder(TaxPointSortOrder);

    Filter[] TaxPointFilter = DataHelper.mapToFilterArray(TaxPointMap, Date.class);
    if (TaxPointFilter != null) {
      DateFilter[] TaxPointFilters = new DateFilter[TaxPointFilter.length];
      for (int i = 0; i < TaxPointFilters.length; i++) {
        TaxPointFilters[i] = (DateFilter)TaxPointFilter[i];
      }
      try {
        out.setTaxPointFilter(TaxPointFilters);
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
  
    Map NoBillMap = (Map)record.get("NoBill");
    Boolean NoBillFetch = DataHelper.getFetch(NoBillMap);
    Boolean NoBillSortDir = DataHelper.getSortDirection(NoBillMap);
    Integer NoBillSortOrder = DataHelper.getSortOrder(NoBillMap);
    if (NoBillFetch != null) out.setNoBillFetch(NoBillFetch);
    if (NoBillSortDir != null) out.setNoBillSortDirection(NoBillSortDir);
    if (NoBillSortOrder != null) out.setNoBillSortOrder(NoBillSortOrder);

    Filter[] NoBillFilter = DataHelper.mapToFilterArray(NoBillMap, Boolean.class);
    if (NoBillFilter != null) {
      BooleanFilter[] NoBillFilters = new BooleanFilter[NoBillFilter.length];
      for (int i = 0; i < NoBillFilters.length; i++) {
        NoBillFilters[i] = (BooleanFilter)NoBillFilter[i];
      }
      try {
        out.setNoBillFilter(NoBillFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefNoMap = (Map)record.get("BillRefNo");
    Boolean BillRefNoFetch = DataHelper.getFetch(BillRefNoMap);
    Boolean BillRefNoSortDir = DataHelper.getSortDirection(BillRefNoMap);
    Integer BillRefNoSortOrder = DataHelper.getSortOrder(BillRefNoMap);
    if (BillRefNoFetch != null) out.setBillRefNoFetch(BillRefNoFetch);
    if (BillRefNoSortDir != null) out.setBillRefNoSortDirection(BillRefNoSortDir);
    if (BillRefNoSortOrder != null) out.setBillRefNoSortOrder(BillRefNoSortOrder);

    Filter[] BillRefNoFilter = DataHelper.mapToFilterArray(BillRefNoMap, Integer.class);
    if (BillRefNoFilter != null) {
      IntegerFilter[] BillRefNoFilters = new IntegerFilter[BillRefNoFilter.length];
      for (int i = 0; i < BillRefNoFilters.length; i++) {
        BillRefNoFilters[i] = (IntegerFilter)BillRefNoFilter[i];
      }
      try {
        out.setBillRefNoFilter(BillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillRefResetsMap = (Map)record.get("BillRefResets");
    Boolean BillRefResetsFetch = DataHelper.getFetch(BillRefResetsMap);
    Boolean BillRefResetsSortDir = DataHelper.getSortDirection(BillRefResetsMap);
    Integer BillRefResetsSortOrder = DataHelper.getSortOrder(BillRefResetsMap);
    if (BillRefResetsFetch != null) out.setBillRefResetsFetch(BillRefResetsFetch);
    if (BillRefResetsSortDir != null) out.setBillRefResetsSortDirection(BillRefResetsSortDir);
    if (BillRefResetsSortOrder != null) out.setBillRefResetsSortOrder(BillRefResetsSortOrder);

    Filter[] BillRefResetsFilter = DataHelper.mapToFilterArray(BillRefResetsMap, Integer.class);
    if (BillRefResetsFilter != null) {
      IntegerFilter[] BillRefResetsFilters = new IntegerFilter[BillRefResetsFilter.length];
      for (int i = 0; i < BillRefResetsFilters.length; i++) {
        BillRefResetsFilters[i] = (IntegerFilter)BillRefResetsFilter[i];
      }
      try {
        out.setBillRefResetsFilter(BillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransDtMap = (Map)record.get("TransDt");
    Boolean TransDtFetch = DataHelper.getFetch(TransDtMap);
    Boolean TransDtSortDir = DataHelper.getSortDirection(TransDtMap);
    Integer TransDtSortOrder = DataHelper.getSortOrder(TransDtMap);
    if (TransDtFetch != null) out.setTransDtFetch(TransDtFetch);
    if (TransDtSortDir != null) out.setTransDtSortDirection(TransDtSortDir);
    if (TransDtSortOrder != null) out.setTransDtSortOrder(TransDtSortOrder);

    Filter[] TransDtFilter = DataHelper.mapToFilterArray(TransDtMap, Date.class);
    if (TransDtFilter != null) {
      DateFilter[] TransDtFilters = new DateFilter[TransDtFilter.length];
      for (int i = 0; i < TransDtFilters.length; i++) {
        TransDtFilters[i] = (DateFilter)TransDtFilter[i];
      }
      try {
        out.setTransDtFilter(TransDtFilters);
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
  
    Map SourceTypeMap = (Map)record.get("SourceType");
    Boolean SourceTypeFetch = DataHelper.getFetch(SourceTypeMap);
    Boolean SourceTypeSortDir = DataHelper.getSortDirection(SourceTypeMap);
    Integer SourceTypeSortOrder = DataHelper.getSortOrder(SourceTypeMap);
    if (SourceTypeFetch != null) out.setSourceTypeFetch(SourceTypeFetch);
    if (SourceTypeSortDir != null) out.setSourceTypeSortDirection(SourceTypeSortDir);
    if (SourceTypeSortOrder != null) out.setSourceTypeSortOrder(SourceTypeSortOrder);

    Filter[] SourceTypeFilter = DataHelper.mapToFilterArray(SourceTypeMap, Integer.class);
    if (SourceTypeFilter != null) {
      IntegerFilter[] SourceTypeFilters = new IntegerFilter[SourceTypeFilter.length];
      for (int i = 0; i < SourceTypeFilters.length; i++) {
        SourceTypeFilters[i] = (IntegerFilter)SourceTypeFilter[i];
      }
      try {
        out.setSourceTypeFilter(SourceTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SourceIdMap = (Map)record.get("SourceId");
    Boolean SourceIdFetch = DataHelper.getFetch(SourceIdMap);
    Boolean SourceIdSortDir = DataHelper.getSortDirection(SourceIdMap);
    Integer SourceIdSortOrder = DataHelper.getSortOrder(SourceIdMap);
    if (SourceIdFetch != null) out.setSourceIdFetch(SourceIdFetch);
    if (SourceIdSortDir != null) out.setSourceIdSortDirection(SourceIdSortDir);
    if (SourceIdSortOrder != null) out.setSourceIdSortOrder(SourceIdSortOrder);

    Filter[] SourceIdFilter = DataHelper.mapToFilterArray(SourceIdMap, Integer.class);
    if (SourceIdFilter != null) {
      IntegerFilter[] SourceIdFilters = new IntegerFilter[SourceIdFilter.length];
      for (int i = 0; i < SourceIdFilters.length; i++) {
        SourceIdFilters[i] = (IntegerFilter)SourceIdFilter[i];
      }
      try {
        out.setSourceIdFilter(SourceIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SourceIdServMap = (Map)record.get("SourceIdServ");
    Boolean SourceIdServFetch = DataHelper.getFetch(SourceIdServMap);
    Boolean SourceIdServSortDir = DataHelper.getSortDirection(SourceIdServMap);
    Integer SourceIdServSortOrder = DataHelper.getSortOrder(SourceIdServMap);
    if (SourceIdServFetch != null) out.setSourceIdServFetch(SourceIdServFetch);
    if (SourceIdServSortDir != null) out.setSourceIdServSortDirection(SourceIdServSortDir);
    if (SourceIdServSortOrder != null) out.setSourceIdServSortOrder(SourceIdServSortOrder);

    Filter[] SourceIdServFilter = DataHelper.mapToFilterArray(SourceIdServMap, Integer.class);
    if (SourceIdServFilter != null) {
      IntegerFilter[] SourceIdServFilters = new IntegerFilter[SourceIdServFilter.length];
      for (int i = 0; i < SourceIdServFilters.length; i++) {
        SourceIdServFilters[i] = (IntegerFilter)SourceIdServFilter[i];
      }
      try {
        out.setSourceIdServFilter(SourceIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DiscountIdMap = (Map)record.get("DiscountId");
    Boolean DiscountIdFetch = DataHelper.getFetch(DiscountIdMap);
    Boolean DiscountIdSortDir = DataHelper.getSortDirection(DiscountIdMap);
    Integer DiscountIdSortOrder = DataHelper.getSortOrder(DiscountIdMap);
    if (DiscountIdFetch != null) out.setDiscountIdFetch(DiscountIdFetch);
    if (DiscountIdSortDir != null) out.setDiscountIdSortDirection(DiscountIdSortDir);
    if (DiscountIdSortOrder != null) out.setDiscountIdSortOrder(DiscountIdSortOrder);

    Filter[] DiscountIdFilter = DataHelper.mapToFilterArray(DiscountIdMap, Integer.class);
    if (DiscountIdFilter != null) {
      IntegerFilter[] DiscountIdFilters = new IntegerFilter[DiscountIdFilter.length];
      for (int i = 0; i < DiscountIdFilters.length; i++) {
        DiscountIdFilters[i] = (IntegerFilter)DiscountIdFilter[i];
      }
      try {
        out.setDiscountIdFilter(DiscountIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllocatedTaxMap = (Map)record.get("AllocatedTax");
    Boolean AllocatedTaxFetch = DataHelper.getFetch(AllocatedTaxMap);
    Boolean AllocatedTaxSortDir = DataHelper.getSortDirection(AllocatedTaxMap);
    Integer AllocatedTaxSortOrder = DataHelper.getSortOrder(AllocatedTaxMap);
    if (AllocatedTaxFetch != null) out.setAllocatedTaxFetch(AllocatedTaxFetch);
    if (AllocatedTaxSortDir != null) out.setAllocatedTaxSortDirection(AllocatedTaxSortDir);
    if (AllocatedTaxSortOrder != null) out.setAllocatedTaxSortOrder(AllocatedTaxSortOrder);

    Filter[] AllocatedTaxFilter = DataHelper.mapToFilterArray(AllocatedTaxMap, BigInteger.class);
    if (AllocatedTaxFilter != null) {
      BigIntegerFilter[] AllocatedTaxFilters = new BigIntegerFilter[AllocatedTaxFilter.length];
      for (int i = 0; i < AllocatedTaxFilters.length; i++) {
        AllocatedTaxFilters[i] = (BigIntegerFilter)AllocatedTaxFilter[i];
      }
      try {
        out.setAllocatedTaxFilter(AllocatedTaxFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AllocatedUndesignatedMap = (Map)record.get("AllocatedUndesignated");
    Boolean AllocatedUndesignatedFetch = DataHelper.getFetch(AllocatedUndesignatedMap);
    Boolean AllocatedUndesignatedSortDir = DataHelper.getSortDirection(AllocatedUndesignatedMap);
    Integer AllocatedUndesignatedSortOrder = DataHelper.getSortOrder(AllocatedUndesignatedMap);
    if (AllocatedUndesignatedFetch != null) out.setAllocatedUndesignatedFetch(AllocatedUndesignatedFetch);
    if (AllocatedUndesignatedSortDir != null) out.setAllocatedUndesignatedSortDirection(AllocatedUndesignatedSortDir);
    if (AllocatedUndesignatedSortOrder != null) out.setAllocatedUndesignatedSortOrder(AllocatedUndesignatedSortOrder);

    Filter[] AllocatedUndesignatedFilter = DataHelper.mapToFilterArray(AllocatedUndesignatedMap, BigInteger.class);
    if (AllocatedUndesignatedFilter != null) {
      BigIntegerFilter[] AllocatedUndesignatedFilters = new BigIntegerFilter[AllocatedUndesignatedFilter.length];
      for (int i = 0; i < AllocatedUndesignatedFilters.length; i++) {
        AllocatedUndesignatedFilters[i] = (BigIntegerFilter)AllocatedUndesignatedFilter[i];
      }
      try {
        out.setAllocatedUndesignatedFilter(AllocatedUndesignatedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MicrBankIdMap = (Map)record.get("MicrBankId");
    Boolean MicrBankIdFetch = DataHelper.getFetch(MicrBankIdMap);
    Boolean MicrBankIdSortDir = DataHelper.getSortDirection(MicrBankIdMap);
    Integer MicrBankIdSortOrder = DataHelper.getSortOrder(MicrBankIdMap);
    if (MicrBankIdFetch != null) out.setMicrBankIdFetch(MicrBankIdFetch);
    if (MicrBankIdSortDir != null) out.setMicrBankIdSortDirection(MicrBankIdSortDir);
    if (MicrBankIdSortOrder != null) out.setMicrBankIdSortOrder(MicrBankIdSortOrder);

    Filter[] MicrBankIdFilter = DataHelper.mapToFilterArray(MicrBankIdMap, String.class);
    if (MicrBankIdFilter != null) {
      StringFilter[] MicrBankIdFilters = new StringFilter[MicrBankIdFilter.length];
      for (int i = 0; i < MicrBankIdFilters.length; i++) {
        MicrBankIdFilters[i] = (StringFilter)MicrBankIdFilter[i];
      }
      try {
        out.setMicrBankIdFilter(MicrBankIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MicrDdaNumMap = (Map)record.get("MicrDdaNum");
    Boolean MicrDdaNumFetch = DataHelper.getFetch(MicrDdaNumMap);
    Boolean MicrDdaNumSortDir = DataHelper.getSortDirection(MicrDdaNumMap);
    Integer MicrDdaNumSortOrder = DataHelper.getSortOrder(MicrDdaNumMap);
    if (MicrDdaNumFetch != null) out.setMicrDdaNumFetch(MicrDdaNumFetch);
    if (MicrDdaNumSortDir != null) out.setMicrDdaNumSortDirection(MicrDdaNumSortDir);
    if (MicrDdaNumSortOrder != null) out.setMicrDdaNumSortOrder(MicrDdaNumSortOrder);

    Filter[] MicrDdaNumFilter = DataHelper.mapToFilterArray(MicrDdaNumMap, String.class);
    if (MicrDdaNumFilter != null) {
      StringFilter[] MicrDdaNumFilters = new StringFilter[MicrDdaNumFilter.length];
      for (int i = 0; i < MicrDdaNumFilters.length; i++) {
        MicrDdaNumFilters[i] = (StringFilter)MicrDdaNumFilter[i];
      }
      try {
        out.setMicrDdaNumFilter(MicrDdaNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map MicrCheckNumMap = (Map)record.get("MicrCheckNum");
    Boolean MicrCheckNumFetch = DataHelper.getFetch(MicrCheckNumMap);
    Boolean MicrCheckNumSortDir = DataHelper.getSortDirection(MicrCheckNumMap);
    Integer MicrCheckNumSortOrder = DataHelper.getSortOrder(MicrCheckNumMap);
    if (MicrCheckNumFetch != null) out.setMicrCheckNumFetch(MicrCheckNumFetch);
    if (MicrCheckNumSortDir != null) out.setMicrCheckNumSortDirection(MicrCheckNumSortDir);
    if (MicrCheckNumSortOrder != null) out.setMicrCheckNumSortOrder(MicrCheckNumSortOrder);

    Filter[] MicrCheckNumFilter = DataHelper.mapToFilterArray(MicrCheckNumMap, String.class);
    if (MicrCheckNumFilter != null) {
      StringFilter[] MicrCheckNumFilters = new StringFilter[MicrCheckNumFilter.length];
      for (int i = 0; i < MicrCheckNumFilters.length; i++) {
        MicrCheckNumFilters[i] = (StringFilter)MicrCheckNumFilter[i];
      }
      try {
        out.setMicrCheckNumFilter(MicrCheckNumFilters);
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
  
    Map ImpliedDecimalMap = (Map)record.get("ImpliedDecimal");
    Boolean ImpliedDecimalFetch = DataHelper.getFetch(ImpliedDecimalMap);
    Boolean ImpliedDecimalSortDir = DataHelper.getSortDirection(ImpliedDecimalMap);
    Integer ImpliedDecimalSortOrder = DataHelper.getSortOrder(ImpliedDecimalMap);
    if (ImpliedDecimalFetch != null) out.setImpliedDecimalFetch(ImpliedDecimalFetch);
    if (ImpliedDecimalSortDir != null) out.setImpliedDecimalSortDirection(ImpliedDecimalSortDir);
    if (ImpliedDecimalSortOrder != null) out.setImpliedDecimalSortOrder(ImpliedDecimalSortOrder);

    Filter[] ImpliedDecimalFilter = DataHelper.mapToFilterArray(ImpliedDecimalMap, Integer.class);
    if (ImpliedDecimalFilter != null) {
      IntegerFilter[] ImpliedDecimalFilters = new IntegerFilter[ImpliedDecimalFilter.length];
      for (int i = 0; i < ImpliedDecimalFilters.length; i++) {
        ImpliedDecimalFilters[i] = (IntegerFilter)ImpliedDecimalFilter[i];
      }
      try {
        out.setImpliedDecimalFilter(ImpliedDecimalFilters);
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
  
    Map RealtimeIndicatorMap = (Map)record.get("RealtimeIndicator");
    Boolean RealtimeIndicatorFetch = DataHelper.getFetch(RealtimeIndicatorMap);
    Boolean RealtimeIndicatorSortDir = DataHelper.getSortDirection(RealtimeIndicatorMap);
    Integer RealtimeIndicatorSortOrder = DataHelper.getSortOrder(RealtimeIndicatorMap);
    if (RealtimeIndicatorFetch != null) out.setRealtimeIndicatorFetch(RealtimeIndicatorFetch);
    if (RealtimeIndicatorSortDir != null) out.setRealtimeIndicatorSortDirection(RealtimeIndicatorSortDir);
    if (RealtimeIndicatorSortOrder != null) out.setRealtimeIndicatorSortOrder(RealtimeIndicatorSortOrder);

    Filter[] RealtimeIndicatorFilter = DataHelper.mapToFilterArray(RealtimeIndicatorMap, Integer.class);
    if (RealtimeIndicatorFilter != null) {
      IntegerFilter[] RealtimeIndicatorFilters = new IntegerFilter[RealtimeIndicatorFilter.length];
      for (int i = 0; i < RealtimeIndicatorFilters.length; i++) {
        RealtimeIndicatorFilters[i] = (IntegerFilter)RealtimeIndicatorFilter[i];
      }
      try {
        out.setRealtimeIndicatorFilter(RealtimeIndicatorFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PaymentProfileIdMap = (Map)record.get("PaymentProfileId");
    Boolean PaymentProfileIdFetch = DataHelper.getFetch(PaymentProfileIdMap);
    Boolean PaymentProfileIdSortDir = DataHelper.getSortDirection(PaymentProfileIdMap);
    Integer PaymentProfileIdSortOrder = DataHelper.getSortOrder(PaymentProfileIdMap);
    if (PaymentProfileIdFetch != null) out.setPaymentProfileIdFetch(PaymentProfileIdFetch);
    if (PaymentProfileIdSortDir != null) out.setPaymentProfileIdSortDirection(PaymentProfileIdSortDir);
    if (PaymentProfileIdSortOrder != null) out.setPaymentProfileIdSortOrder(PaymentProfileIdSortOrder);

    Filter[] PaymentProfileIdFilter = DataHelper.mapToFilterArray(PaymentProfileIdMap, BigInteger.class);
    if (PaymentProfileIdFilter != null) {
      BigIntegerFilter[] PaymentProfileIdFilters = new BigIntegerFilter[PaymentProfileIdFilter.length];
      for (int i = 0; i < PaymentProfileIdFilters.length; i++) {
        PaymentProfileIdFilters[i] = (BigIntegerFilter)PaymentProfileIdFilter[i];
      }
      try {
        out.setPaymentProfileIdFilter(PaymentProfileIdFilters);
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
