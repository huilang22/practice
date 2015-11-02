/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentObjectHelper.java
 * Definition File: Customer/Payment.xml
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

import com.csgsystems.bp.data.*;


/** Helper class to convert PaymentObject JavaBean objects to/from HashMaps.
 */
public class PaymentObjectHelper implements ArubaObjectHelper
{
  /** convert PaymentObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PaymentObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PaymentObjectData the converted object
   */
  public static PaymentObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentObject")
   * @return PaymentObjectData the converted object
   */
  public static PaymentObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PaymentObjectFilter the converted object
   */
  public static PaymentObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentObject")
   * @return PaymentObjectFilter the converted object
   */
  public static PaymentObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PaymentObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PaymentObjectDataList the converted object
   */
  public static PaymentObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PaymentObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PaymentObjectList")
   * @return PaymentObjectDataList the converted object
   */
  public static PaymentObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PaymentObjectData[] array = null;
    if (root != null)
    {
      array = new PaymentObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PaymentObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PaymentObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PaymentObjectDataList (array, index, total);
  }
  /** convert PaymentObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PaymentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._TransCategorySet) record.put ("TransCategory", in.TransCategory);
  
    if (in._EpgTransactionIdSet) record.put ("EpgTransactionId", in.EpgTransactionId);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._OrigBillRefNoSet) record.put ("OrigBillRefNo", in.OrigBillRefNo);
  
    if (in._OrigBillRefResetsSet) record.put ("OrigBillRefResets", in.OrigBillRefResets);
  
    if (in._CrNoteBillRefNoSet) record.put ("CrNoteBillRefNo", in.CrNoteBillRefNo);
  
    if (in._CrNoteBillRefResetsSet) record.put ("CrNoteBillRefResets", in.CrNoteBillRefResets);
  
    if (in._TransTypeSet) record.put ("TransType", in.TransType);
  
    if (in._TransDateSet) record.put ("TransDate", in.TransDate);
  
    if (in._PostDateSet) record.put ("PostDate", in.PostDate);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._TransAmountSet) record.put ("TransAmount", in.TransAmount);
  
    if (in._GlAmountSet) record.put ("GlAmount", in.GlAmount);
  
    if (in._OrigTrackingIdSet) record.put ("OrigTrackingId", in.OrigTrackingId);
  
    if (in._OrigTrackingIdServSet) record.put ("OrigTrackingIdServ", in.OrigTrackingIdServ);
  
    if (in._TransSourceSet) record.put ("TransSource", in.TransSource);
  
    if (in._SourceTypeSet) record.put ("SourceType", in.SourceType);
  
    if (in._SourceIdSet) record.put ("SourceId", in.SourceId);
  
    if (in._SourceIdServSet) record.put ("SourceIdServ", in.SourceIdServ);
  
    if (in._BatchIdSet) record.put ("BatchId", in.BatchId);
  
    if (in._BatchIdServSet) record.put ("BatchIdServ", in.BatchIdServ);
  
    if (in._TransSubmitterSet) record.put ("TransSubmitter", in.TransSubmitter);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._ActionCodeSet) record.put ("ActionCode", in.ActionCode);
  
    if (in._MicrBankIdSet) record.put ("MicrBankId", in.MicrBankId);
  
    if (in._MicrDdaNumSet) record.put ("MicrDdaNum", in.MicrDdaNum);
  
    if (in._MicrCheckNumSet) record.put ("MicrCheckNum", in.MicrCheckNum);
  
    if (in._ArchFlagSet) record.put ("ArchFlag", in.ArchFlag);
  
    if (in._ManualCcauthCodeSet) record.put ("ManualCcauthCode", in.ManualCcauthCode);
  
    if (in._ManualCcauthDateSet) record.put ("ManualCcauthDate", in.ManualCcauthDate);
  
    if (in._DistributedAmountSet) record.put ("DistributedAmount", in.DistributedAmount);
  
    if (in._DistributedGlAmountSet) record.put ("DistributedGlAmount", in.DistributedGlAmount);
  
    if (in._FileIdSet) record.put ("FileId", in.FileId);
  
    if (in._ResponseCodeSet) record.put ("ResponseCode", in.ResponseCode);
  
    if (in._BillOrderNumberSet) record.put ("BillOrderNumber", in.BillOrderNumber);
  
    if (in._ExternalAmountSet) record.put ("ExternalAmount", in.ExternalAmount);
  
    if (in._ExternalCurrencySet) record.put ("ExternalCurrency", in.ExternalCurrency);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._DiscountIdSet) record.put ("DiscountId", in.DiscountId);
  
    if (in._TaxTypeCodeSet) record.put ("TaxTypeCode", in.TaxTypeCode);
  
    if (in._AnnotationSet) record.put ("Annotation", in.Annotation);
  
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
  
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._IsCurrentSet) record.put ("IsCurrent", in.IsCurrent);
  
    if (in._ActiveDateSet) record.put ("ActiveDate", in.ActiveDate);
  
    if (in._InactiveDateSet) record.put ("InactiveDate", in.InactiveDate);
      return record;
  }
  /** convert PaymentObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PaymentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.TransCategory, in.TransCategorySort, in.TransCategorySortAscending, in.TransCategoryFetch);
      if (map != null) record.put ("TransCategory", map);
      map = DataHelper.filterToMap (in.EpgTransactionId, in.EpgTransactionIdSort, in.EpgTransactionIdSortAscending, in.EpgTransactionIdFetch, in.EpgTransactionIdCaseInsensitive);
      if (map != null) record.put ("EpgTransactionId", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.OrigBillRefNo, in.OrigBillRefNoSort, in.OrigBillRefNoSortAscending, in.OrigBillRefNoFetch);
      if (map != null) record.put ("OrigBillRefNo", map);
      map = DataHelper.filterToMap (in.OrigBillRefResets, in.OrigBillRefResetsSort, in.OrigBillRefResetsSortAscending, in.OrigBillRefResetsFetch);
      if (map != null) record.put ("OrigBillRefResets", map);
      map = DataHelper.filterToMap (in.CrNoteBillRefNo, in.CrNoteBillRefNoSort, in.CrNoteBillRefNoSortAscending, in.CrNoteBillRefNoFetch);
      if (map != null) record.put ("CrNoteBillRefNo", map);
      map = DataHelper.filterToMap (in.CrNoteBillRefResets, in.CrNoteBillRefResetsSort, in.CrNoteBillRefResetsSortAscending, in.CrNoteBillRefResetsFetch);
      if (map != null) record.put ("CrNoteBillRefResets", map);
      map = DataHelper.filterToMap (in.TransType, in.TransTypeSort, in.TransTypeSortAscending, in.TransTypeFetch);
      if (map != null) record.put ("TransType", map);
      map = DataHelper.filterToMap (in.TransDate, in.TransDateSort, in.TransDateSortAscending, in.TransDateFetch);
      if (map != null) record.put ("TransDate", map);
      map = DataHelper.filterToMap (in.PostDate, in.PostDateSort, in.PostDateSortAscending, in.PostDateFetch);
      if (map != null) record.put ("PostDate", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.TransAmount, in.TransAmountSort, in.TransAmountSortAscending, in.TransAmountFetch);
      if (map != null) record.put ("TransAmount", map);
      map = DataHelper.filterToMap (in.GlAmount, in.GlAmountSort, in.GlAmountSortAscending, in.GlAmountFetch);
      if (map != null) record.put ("GlAmount", map);
      map = DataHelper.filterToMap (in.OrigTrackingId, in.OrigTrackingIdSort, in.OrigTrackingIdSortAscending, in.OrigTrackingIdFetch);
      if (map != null) record.put ("OrigTrackingId", map);
      map = DataHelper.filterToMap (in.OrigTrackingIdServ, in.OrigTrackingIdServSort, in.OrigTrackingIdServSortAscending, in.OrigTrackingIdServFetch);
      if (map != null) record.put ("OrigTrackingIdServ", map);
      map = DataHelper.filterToMap (in.TransSource, in.TransSourceSort, in.TransSourceSortAscending, in.TransSourceFetch);
      if (map != null) record.put ("TransSource", map);
      map = DataHelper.filterToMap (in.SourceType, in.SourceTypeSort, in.SourceTypeSortAscending, in.SourceTypeFetch);
      if (map != null) record.put ("SourceType", map);
      map = DataHelper.filterToMap (in.SourceId, in.SourceIdSort, in.SourceIdSortAscending, in.SourceIdFetch);
      if (map != null) record.put ("SourceId", map);
      map = DataHelper.filterToMap (in.SourceIdServ, in.SourceIdServSort, in.SourceIdServSortAscending, in.SourceIdServFetch);
      if (map != null) record.put ("SourceIdServ", map);
      map = DataHelper.filterToMap (in.BatchId, in.BatchIdSort, in.BatchIdSortAscending, in.BatchIdFetch, in.BatchIdCaseInsensitive);
      if (map != null) record.put ("BatchId", map);
      map = DataHelper.filterToMap (in.BatchIdServ, in.BatchIdServSort, in.BatchIdServSortAscending, in.BatchIdServFetch);
      if (map != null) record.put ("BatchIdServ", map);
      map = DataHelper.filterToMap (in.TransSubmitter, in.TransSubmitterSort, in.TransSubmitterSortAscending, in.TransSubmitterFetch, in.TransSubmitterCaseInsensitive);
      if (map != null) record.put ("TransSubmitter", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
      map = DataHelper.filterToMap (in.ActionCode, in.ActionCodeSort, in.ActionCodeSortAscending, in.ActionCodeFetch, in.ActionCodeCaseInsensitive);
      if (map != null) record.put ("ActionCode", map);
      map = DataHelper.filterToMap (in.MicrBankId, in.MicrBankIdSort, in.MicrBankIdSortAscending, in.MicrBankIdFetch, in.MicrBankIdCaseInsensitive);
      if (map != null) record.put ("MicrBankId", map);
      map = DataHelper.filterToMap (in.MicrDdaNum, in.MicrDdaNumSort, in.MicrDdaNumSortAscending, in.MicrDdaNumFetch, in.MicrDdaNumCaseInsensitive);
      if (map != null) record.put ("MicrDdaNum", map);
      map = DataHelper.filterToMap (in.MicrCheckNum, in.MicrCheckNumSort, in.MicrCheckNumSortAscending, in.MicrCheckNumFetch, in.MicrCheckNumCaseInsensitive);
      if (map != null) record.put ("MicrCheckNum", map);
      map = DataHelper.filterToMap (in.ArchFlag, in.ArchFlagSort, in.ArchFlagSortAscending, in.ArchFlagFetch);
      if (map != null) record.put ("ArchFlag", map);
      map = DataHelper.filterToMap (in.ManualCcauthCode, in.ManualCcauthCodeSort, in.ManualCcauthCodeSortAscending, in.ManualCcauthCodeFetch, in.ManualCcauthCodeCaseInsensitive);
      if (map != null) record.put ("ManualCcauthCode", map);
      map = DataHelper.filterToMap (in.ManualCcauthDate, in.ManualCcauthDateSort, in.ManualCcauthDateSortAscending, in.ManualCcauthDateFetch, in.ManualCcauthDateCaseInsensitive);
      if (map != null) record.put ("ManualCcauthDate", map);
      map = DataHelper.filterToMap (in.DistributedAmount, in.DistributedAmountSort, in.DistributedAmountSortAscending, in.DistributedAmountFetch);
      if (map != null) record.put ("DistributedAmount", map);
      map = DataHelper.filterToMap (in.DistributedGlAmount, in.DistributedGlAmountSort, in.DistributedGlAmountSortAscending, in.DistributedGlAmountFetch);
      if (map != null) record.put ("DistributedGlAmount", map);
      map = DataHelper.filterToMap (in.FileId, in.FileIdSort, in.FileIdSortAscending, in.FileIdFetch);
      if (map != null) record.put ("FileId", map);
      map = DataHelper.filterToMap (in.ResponseCode, in.ResponseCodeSort, in.ResponseCodeSortAscending, in.ResponseCodeFetch, in.ResponseCodeCaseInsensitive);
      if (map != null) record.put ("ResponseCode", map);
      map = DataHelper.filterToMap (in.BillOrderNumber, in.BillOrderNumberSort, in.BillOrderNumberSortAscending, in.BillOrderNumberFetch, in.BillOrderNumberCaseInsensitive);
      if (map != null) record.put ("BillOrderNumber", map);
      map = DataHelper.filterToMap (in.ExternalAmount, in.ExternalAmountSort, in.ExternalAmountSortAscending, in.ExternalAmountFetch);
      if (map != null) record.put ("ExternalAmount", map);
      map = DataHelper.filterToMap (in.ExternalCurrency, in.ExternalCurrencySort, in.ExternalCurrencySortAscending, in.ExternalCurrencyFetch);
      if (map != null) record.put ("ExternalCurrency", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.DiscountId, in.DiscountIdSort, in.DiscountIdSortAscending, in.DiscountIdFetch);
      if (map != null) record.put ("DiscountId", map);
      map = DataHelper.filterToMap (in.TaxTypeCode, in.TaxTypeCodeSort, in.TaxTypeCodeSortAscending, in.TaxTypeCodeFetch);
      if (map != null) record.put ("TaxTypeCode", map);
      map = DataHelper.filterToMap (in.Annotation, in.AnnotationSort, in.AnnotationSortAscending, in.AnnotationFetch, in.AnnotationCaseInsensitive);
      if (map != null) record.put ("Annotation", map);
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
  /** convert Map to PaymentObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentObjectData the converted object
   */
  public static PaymentObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentObjectData out = new PaymentObjectData ();

    out.Key = PaymentObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("TransCategory")) != null)
    {
      out.TransCategory = (Integer) obj;
    }
  
    if ((obj = record.get ("EpgTransactionId")) != null)
    {
      out.EpgTransactionId = (String) obj;
    }
  
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefNo")) != null)
    {
      out.OrigBillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefResets")) != null)
    {
      out.OrigBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("CrNoteBillRefNo")) != null)
    {
      out.CrNoteBillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("CrNoteBillRefResets")) != null)
    {
      out.CrNoteBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("TransType")) != null)
    {
      out.TransType = (Integer) obj;
    }
  
    if ((obj = record.get ("TransDate")) != null)
    {
      out.TransDate = (Date) obj;
    }
  
    if ((obj = record.get ("PostDate")) != null)
    {
      out.PostDate = (Date) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("TransAmount")) != null)
    {
      out.TransAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("GlAmount")) != null)
    {
      out.GlAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("OrigTrackingId")) != null)
    {
      out.OrigTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingIdServ")) != null)
    {
      out.OrigTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("TransSource")) != null)
    {
      out.TransSource = (Integer) obj;
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
  
    if ((obj = record.get ("BatchId")) != null)
    {
      out.BatchId = (String) obj;
    }
  
    if ((obj = record.get ("BatchIdServ")) != null)
    {
      out.BatchIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("TransSubmitter")) != null)
    {
      out.TransSubmitter = (String) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("ActionCode")) != null)
    {
      out.ActionCode = (String) obj;
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
  
    if ((obj = record.get ("ArchFlag")) != null)
    {
      out.ArchFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("ManualCcauthCode")) != null)
    {
      out.ManualCcauthCode = (String) obj;
    }
  
    if ((obj = record.get ("ManualCcauthDate")) != null)
    {
      out.ManualCcauthDate = (String) obj;
    }
  
    if ((obj = record.get ("DistributedAmount")) != null)
    {
      out.DistributedAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("DistributedGlAmount")) != null)
    {
      out.DistributedGlAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("FileId")) != null)
    {
      out.FileId = (Integer) obj;
    }
  
    if ((obj = record.get ("ResponseCode")) != null)
    {
      out.ResponseCode = (String) obj;
    }
  
    if ((obj = record.get ("BillOrderNumber")) != null)
    {
      out.BillOrderNumber = (String) obj;
    }
  
    if ((obj = record.get ("ExternalAmount")) != null)
    {
      out.ExternalAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("ExternalCurrency")) != null)
    {
      out.ExternalCurrency = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("DiscountId")) != null)
    {
      out.DiscountId = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxTypeCode")) != null)
    {
      out.TaxTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("Annotation")) != null)
    {
      out.Annotation = (String) obj;
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
  /** convert Map to PaymentObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentObjectFilter the converted object
   */
  public static PaymentObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentObjectFilter out = new PaymentObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PaymentObjectKeyHelper.getFilter ((Map) record.get ("Key"));
    Map TransCategoryMap = (Map)record.get("TransCategory");
    Boolean TransCategoryFetch = DataHelper.getFetch(TransCategoryMap);
    Boolean TransCategorySortDir = DataHelper.getSortDirection(TransCategoryMap);
    Integer TransCategorySortOrder = DataHelper.getSortOrder(TransCategoryMap);
    if (TransCategoryFetch != null) out.setTransCategoryFetch(TransCategoryFetch);
    if (TransCategorySortDir != null) out.setTransCategorySortDirection(TransCategorySortDir);
    if (TransCategorySortOrder != null) out.setTransCategorySortOrder(TransCategorySortOrder);

    Filter[] TransCategoryFilter = DataHelper.mapToFilterArray(TransCategoryMap, Integer.class);
    if (TransCategoryFilter != null) {
      IntegerFilter[] TransCategoryFilters = new IntegerFilter[TransCategoryFilter.length];
      for (int i = 0; i < TransCategoryFilters.length; i++) {
        TransCategoryFilters[i] = (IntegerFilter)TransCategoryFilter[i];
      }
      try {
        out.setTransCategoryFilter(TransCategoryFilters);
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
  
    Map OrigBillRefNoMap = (Map)record.get("OrigBillRefNo");
    Boolean OrigBillRefNoFetch = DataHelper.getFetch(OrigBillRefNoMap);
    Boolean OrigBillRefNoSortDir = DataHelper.getSortDirection(OrigBillRefNoMap);
    Integer OrigBillRefNoSortOrder = DataHelper.getSortOrder(OrigBillRefNoMap);
    if (OrigBillRefNoFetch != null) out.setOrigBillRefNoFetch(OrigBillRefNoFetch);
    if (OrigBillRefNoSortDir != null) out.setOrigBillRefNoSortDirection(OrigBillRefNoSortDir);
    if (OrigBillRefNoSortOrder != null) out.setOrigBillRefNoSortOrder(OrigBillRefNoSortOrder);

    Filter[] OrigBillRefNoFilter = DataHelper.mapToFilterArray(OrigBillRefNoMap, Integer.class);
    if (OrigBillRefNoFilter != null) {
      IntegerFilter[] OrigBillRefNoFilters = new IntegerFilter[OrigBillRefNoFilter.length];
      for (int i = 0; i < OrigBillRefNoFilters.length; i++) {
        OrigBillRefNoFilters[i] = (IntegerFilter)OrigBillRefNoFilter[i];
      }
      try {
        out.setOrigBillRefNoFilter(OrigBillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBillRefResetsMap = (Map)record.get("OrigBillRefResets");
    Boolean OrigBillRefResetsFetch = DataHelper.getFetch(OrigBillRefResetsMap);
    Boolean OrigBillRefResetsSortDir = DataHelper.getSortDirection(OrigBillRefResetsMap);
    Integer OrigBillRefResetsSortOrder = DataHelper.getSortOrder(OrigBillRefResetsMap);
    if (OrigBillRefResetsFetch != null) out.setOrigBillRefResetsFetch(OrigBillRefResetsFetch);
    if (OrigBillRefResetsSortDir != null) out.setOrigBillRefResetsSortDirection(OrigBillRefResetsSortDir);
    if (OrigBillRefResetsSortOrder != null) out.setOrigBillRefResetsSortOrder(OrigBillRefResetsSortOrder);

    Filter[] OrigBillRefResetsFilter = DataHelper.mapToFilterArray(OrigBillRefResetsMap, Integer.class);
    if (OrigBillRefResetsFilter != null) {
      IntegerFilter[] OrigBillRefResetsFilters = new IntegerFilter[OrigBillRefResetsFilter.length];
      for (int i = 0; i < OrigBillRefResetsFilters.length; i++) {
        OrigBillRefResetsFilters[i] = (IntegerFilter)OrigBillRefResetsFilter[i];
      }
      try {
        out.setOrigBillRefResetsFilter(OrigBillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CrNoteBillRefNoMap = (Map)record.get("CrNoteBillRefNo");
    Boolean CrNoteBillRefNoFetch = DataHelper.getFetch(CrNoteBillRefNoMap);
    Boolean CrNoteBillRefNoSortDir = DataHelper.getSortDirection(CrNoteBillRefNoMap);
    Integer CrNoteBillRefNoSortOrder = DataHelper.getSortOrder(CrNoteBillRefNoMap);
    if (CrNoteBillRefNoFetch != null) out.setCrNoteBillRefNoFetch(CrNoteBillRefNoFetch);
    if (CrNoteBillRefNoSortDir != null) out.setCrNoteBillRefNoSortDirection(CrNoteBillRefNoSortDir);
    if (CrNoteBillRefNoSortOrder != null) out.setCrNoteBillRefNoSortOrder(CrNoteBillRefNoSortOrder);

    Filter[] CrNoteBillRefNoFilter = DataHelper.mapToFilterArray(CrNoteBillRefNoMap, Integer.class);
    if (CrNoteBillRefNoFilter != null) {
      IntegerFilter[] CrNoteBillRefNoFilters = new IntegerFilter[CrNoteBillRefNoFilter.length];
      for (int i = 0; i < CrNoteBillRefNoFilters.length; i++) {
        CrNoteBillRefNoFilters[i] = (IntegerFilter)CrNoteBillRefNoFilter[i];
      }
      try {
        out.setCrNoteBillRefNoFilter(CrNoteBillRefNoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CrNoteBillRefResetsMap = (Map)record.get("CrNoteBillRefResets");
    Boolean CrNoteBillRefResetsFetch = DataHelper.getFetch(CrNoteBillRefResetsMap);
    Boolean CrNoteBillRefResetsSortDir = DataHelper.getSortDirection(CrNoteBillRefResetsMap);
    Integer CrNoteBillRefResetsSortOrder = DataHelper.getSortOrder(CrNoteBillRefResetsMap);
    if (CrNoteBillRefResetsFetch != null) out.setCrNoteBillRefResetsFetch(CrNoteBillRefResetsFetch);
    if (CrNoteBillRefResetsSortDir != null) out.setCrNoteBillRefResetsSortDirection(CrNoteBillRefResetsSortDir);
    if (CrNoteBillRefResetsSortOrder != null) out.setCrNoteBillRefResetsSortOrder(CrNoteBillRefResetsSortOrder);

    Filter[] CrNoteBillRefResetsFilter = DataHelper.mapToFilterArray(CrNoteBillRefResetsMap, Integer.class);
    if (CrNoteBillRefResetsFilter != null) {
      IntegerFilter[] CrNoteBillRefResetsFilters = new IntegerFilter[CrNoteBillRefResetsFilter.length];
      for (int i = 0; i < CrNoteBillRefResetsFilters.length; i++) {
        CrNoteBillRefResetsFilters[i] = (IntegerFilter)CrNoteBillRefResetsFilter[i];
      }
      try {
        out.setCrNoteBillRefResetsFilter(CrNoteBillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransTypeMap = (Map)record.get("TransType");
    Boolean TransTypeFetch = DataHelper.getFetch(TransTypeMap);
    Boolean TransTypeSortDir = DataHelper.getSortDirection(TransTypeMap);
    Integer TransTypeSortOrder = DataHelper.getSortOrder(TransTypeMap);
    if (TransTypeFetch != null) out.setTransTypeFetch(TransTypeFetch);
    if (TransTypeSortDir != null) out.setTransTypeSortDirection(TransTypeSortDir);
    if (TransTypeSortOrder != null) out.setTransTypeSortOrder(TransTypeSortOrder);

    Filter[] TransTypeFilter = DataHelper.mapToFilterArray(TransTypeMap, Integer.class);
    if (TransTypeFilter != null) {
      IntegerFilter[] TransTypeFilters = new IntegerFilter[TransTypeFilter.length];
      for (int i = 0; i < TransTypeFilters.length; i++) {
        TransTypeFilters[i] = (IntegerFilter)TransTypeFilter[i];
      }
      try {
        out.setTransTypeFilter(TransTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransDateMap = (Map)record.get("TransDate");
    Boolean TransDateFetch = DataHelper.getFetch(TransDateMap);
    Boolean TransDateSortDir = DataHelper.getSortDirection(TransDateMap);
    Integer TransDateSortOrder = DataHelper.getSortOrder(TransDateMap);
    if (TransDateFetch != null) out.setTransDateFetch(TransDateFetch);
    if (TransDateSortDir != null) out.setTransDateSortDirection(TransDateSortDir);
    if (TransDateSortOrder != null) out.setTransDateSortOrder(TransDateSortOrder);

    Filter[] TransDateFilter = DataHelper.mapToFilterArray(TransDateMap, Date.class);
    if (TransDateFilter != null) {
      DateFilter[] TransDateFilters = new DateFilter[TransDateFilter.length];
      for (int i = 0; i < TransDateFilters.length; i++) {
        TransDateFilters[i] = (DateFilter)TransDateFilter[i];
      }
      try {
        out.setTransDateFilter(TransDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PostDateMap = (Map)record.get("PostDate");
    Boolean PostDateFetch = DataHelper.getFetch(PostDateMap);
    Boolean PostDateSortDir = DataHelper.getSortDirection(PostDateMap);
    Integer PostDateSortOrder = DataHelper.getSortOrder(PostDateMap);
    if (PostDateFetch != null) out.setPostDateFetch(PostDateFetch);
    if (PostDateSortDir != null) out.setPostDateSortDirection(PostDateSortDir);
    if (PostDateSortOrder != null) out.setPostDateSortOrder(PostDateSortOrder);

    Filter[] PostDateFilter = DataHelper.mapToFilterArray(PostDateMap, Date.class);
    if (PostDateFilter != null) {
      DateFilter[] PostDateFilters = new DateFilter[PostDateFilter.length];
      for (int i = 0; i < PostDateFilters.length; i++) {
        PostDateFilters[i] = (DateFilter)PostDateFilter[i];
      }
      try {
        out.setPostDateFilter(PostDateFilters);
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
  
    Map TransAmountMap = (Map)record.get("TransAmount");
    Boolean TransAmountFetch = DataHelper.getFetch(TransAmountMap);
    Boolean TransAmountSortDir = DataHelper.getSortDirection(TransAmountMap);
    Integer TransAmountSortOrder = DataHelper.getSortOrder(TransAmountMap);
    if (TransAmountFetch != null) out.setTransAmountFetch(TransAmountFetch);
    if (TransAmountSortDir != null) out.setTransAmountSortDirection(TransAmountSortDir);
    if (TransAmountSortOrder != null) out.setTransAmountSortOrder(TransAmountSortOrder);

    Filter[] TransAmountFilter = DataHelper.mapToFilterArray(TransAmountMap, BigInteger.class);
    if (TransAmountFilter != null) {
      BigIntegerFilter[] TransAmountFilters = new BigIntegerFilter[TransAmountFilter.length];
      for (int i = 0; i < TransAmountFilters.length; i++) {
        TransAmountFilters[i] = (BigIntegerFilter)TransAmountFilter[i];
      }
      try {
        out.setTransAmountFilter(TransAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map GlAmountMap = (Map)record.get("GlAmount");
    Boolean GlAmountFetch = DataHelper.getFetch(GlAmountMap);
    Boolean GlAmountSortDir = DataHelper.getSortDirection(GlAmountMap);
    Integer GlAmountSortOrder = DataHelper.getSortOrder(GlAmountMap);
    if (GlAmountFetch != null) out.setGlAmountFetch(GlAmountFetch);
    if (GlAmountSortDir != null) out.setGlAmountSortDirection(GlAmountSortDir);
    if (GlAmountSortOrder != null) out.setGlAmountSortOrder(GlAmountSortOrder);

    Filter[] GlAmountFilter = DataHelper.mapToFilterArray(GlAmountMap, BigInteger.class);
    if (GlAmountFilter != null) {
      BigIntegerFilter[] GlAmountFilters = new BigIntegerFilter[GlAmountFilter.length];
      for (int i = 0; i < GlAmountFilters.length; i++) {
        GlAmountFilters[i] = (BigIntegerFilter)GlAmountFilter[i];
      }
      try {
        out.setGlAmountFilter(GlAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTrackingIdMap = (Map)record.get("OrigTrackingId");
    Boolean OrigTrackingIdFetch = DataHelper.getFetch(OrigTrackingIdMap);
    Boolean OrigTrackingIdSortDir = DataHelper.getSortDirection(OrigTrackingIdMap);
    Integer OrigTrackingIdSortOrder = DataHelper.getSortOrder(OrigTrackingIdMap);
    if (OrigTrackingIdFetch != null) out.setOrigTrackingIdFetch(OrigTrackingIdFetch);
    if (OrigTrackingIdSortDir != null) out.setOrigTrackingIdSortDirection(OrigTrackingIdSortDir);
    if (OrigTrackingIdSortOrder != null) out.setOrigTrackingIdSortOrder(OrigTrackingIdSortOrder);

    Filter[] OrigTrackingIdFilter = DataHelper.mapToFilterArray(OrigTrackingIdMap, Integer.class);
    if (OrigTrackingIdFilter != null) {
      IntegerFilter[] OrigTrackingIdFilters = new IntegerFilter[OrigTrackingIdFilter.length];
      for (int i = 0; i < OrigTrackingIdFilters.length; i++) {
        OrigTrackingIdFilters[i] = (IntegerFilter)OrigTrackingIdFilter[i];
      }
      try {
        out.setOrigTrackingIdFilter(OrigTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigTrackingIdServMap = (Map)record.get("OrigTrackingIdServ");
    Boolean OrigTrackingIdServFetch = DataHelper.getFetch(OrigTrackingIdServMap);
    Boolean OrigTrackingIdServSortDir = DataHelper.getSortDirection(OrigTrackingIdServMap);
    Integer OrigTrackingIdServSortOrder = DataHelper.getSortOrder(OrigTrackingIdServMap);
    if (OrigTrackingIdServFetch != null) out.setOrigTrackingIdServFetch(OrigTrackingIdServFetch);
    if (OrigTrackingIdServSortDir != null) out.setOrigTrackingIdServSortDirection(OrigTrackingIdServSortDir);
    if (OrigTrackingIdServSortOrder != null) out.setOrigTrackingIdServSortOrder(OrigTrackingIdServSortOrder);

    Filter[] OrigTrackingIdServFilter = DataHelper.mapToFilterArray(OrigTrackingIdServMap, Integer.class);
    if (OrigTrackingIdServFilter != null) {
      IntegerFilter[] OrigTrackingIdServFilters = new IntegerFilter[OrigTrackingIdServFilter.length];
      for (int i = 0; i < OrigTrackingIdServFilters.length; i++) {
        OrigTrackingIdServFilters[i] = (IntegerFilter)OrigTrackingIdServFilter[i];
      }
      try {
        out.setOrigTrackingIdServFilter(OrigTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransSourceMap = (Map)record.get("TransSource");
    Boolean TransSourceFetch = DataHelper.getFetch(TransSourceMap);
    Boolean TransSourceSortDir = DataHelper.getSortDirection(TransSourceMap);
    Integer TransSourceSortOrder = DataHelper.getSortOrder(TransSourceMap);
    if (TransSourceFetch != null) out.setTransSourceFetch(TransSourceFetch);
    if (TransSourceSortDir != null) out.setTransSourceSortDirection(TransSourceSortDir);
    if (TransSourceSortOrder != null) out.setTransSourceSortOrder(TransSourceSortOrder);

    Filter[] TransSourceFilter = DataHelper.mapToFilterArray(TransSourceMap, Integer.class);
    if (TransSourceFilter != null) {
      IntegerFilter[] TransSourceFilters = new IntegerFilter[TransSourceFilter.length];
      for (int i = 0; i < TransSourceFilters.length; i++) {
        TransSourceFilters[i] = (IntegerFilter)TransSourceFilter[i];
      }
      try {
        out.setTransSourceFilter(TransSourceFilters);
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
  
    Map BatchIdMap = (Map)record.get("BatchId");
    Boolean BatchIdFetch = DataHelper.getFetch(BatchIdMap);
    Boolean BatchIdSortDir = DataHelper.getSortDirection(BatchIdMap);
    Integer BatchIdSortOrder = DataHelper.getSortOrder(BatchIdMap);
    if (BatchIdFetch != null) out.setBatchIdFetch(BatchIdFetch);
    if (BatchIdSortDir != null) out.setBatchIdSortDirection(BatchIdSortDir);
    if (BatchIdSortOrder != null) out.setBatchIdSortOrder(BatchIdSortOrder);

    Filter[] BatchIdFilter = DataHelper.mapToFilterArray(BatchIdMap, String.class);
    if (BatchIdFilter != null) {
      StringFilter[] BatchIdFilters = new StringFilter[BatchIdFilter.length];
      for (int i = 0; i < BatchIdFilters.length; i++) {
        BatchIdFilters[i] = (StringFilter)BatchIdFilter[i];
      }
      try {
        out.setBatchIdFilter(BatchIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BatchIdServMap = (Map)record.get("BatchIdServ");
    Boolean BatchIdServFetch = DataHelper.getFetch(BatchIdServMap);
    Boolean BatchIdServSortDir = DataHelper.getSortDirection(BatchIdServMap);
    Integer BatchIdServSortOrder = DataHelper.getSortOrder(BatchIdServMap);
    if (BatchIdServFetch != null) out.setBatchIdServFetch(BatchIdServFetch);
    if (BatchIdServSortDir != null) out.setBatchIdServSortDirection(BatchIdServSortDir);
    if (BatchIdServSortOrder != null) out.setBatchIdServSortOrder(BatchIdServSortOrder);

    Filter[] BatchIdServFilter = DataHelper.mapToFilterArray(BatchIdServMap, Integer.class);
    if (BatchIdServFilter != null) {
      IntegerFilter[] BatchIdServFilters = new IntegerFilter[BatchIdServFilter.length];
      for (int i = 0; i < BatchIdServFilters.length; i++) {
        BatchIdServFilters[i] = (IntegerFilter)BatchIdServFilter[i];
      }
      try {
        out.setBatchIdServFilter(BatchIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransSubmitterMap = (Map)record.get("TransSubmitter");
    Boolean TransSubmitterFetch = DataHelper.getFetch(TransSubmitterMap);
    Boolean TransSubmitterSortDir = DataHelper.getSortDirection(TransSubmitterMap);
    Integer TransSubmitterSortOrder = DataHelper.getSortOrder(TransSubmitterMap);
    if (TransSubmitterFetch != null) out.setTransSubmitterFetch(TransSubmitterFetch);
    if (TransSubmitterSortDir != null) out.setTransSubmitterSortDirection(TransSubmitterSortDir);
    if (TransSubmitterSortOrder != null) out.setTransSubmitterSortOrder(TransSubmitterSortOrder);

    Filter[] TransSubmitterFilter = DataHelper.mapToFilterArray(TransSubmitterMap, String.class);
    if (TransSubmitterFilter != null) {
      StringFilter[] TransSubmitterFilters = new StringFilter[TransSubmitterFilter.length];
      for (int i = 0; i < TransSubmitterFilters.length; i++) {
        TransSubmitterFilters[i] = (StringFilter)TransSubmitterFilter[i];
      }
      try {
        out.setTransSubmitterFilter(TransSubmitterFilters);
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
  
    Map ActionCodeMap = (Map)record.get("ActionCode");
    Boolean ActionCodeFetch = DataHelper.getFetch(ActionCodeMap);
    Boolean ActionCodeSortDir = DataHelper.getSortDirection(ActionCodeMap);
    Integer ActionCodeSortOrder = DataHelper.getSortOrder(ActionCodeMap);
    if (ActionCodeFetch != null) out.setActionCodeFetch(ActionCodeFetch);
    if (ActionCodeSortDir != null) out.setActionCodeSortDirection(ActionCodeSortDir);
    if (ActionCodeSortOrder != null) out.setActionCodeSortOrder(ActionCodeSortOrder);

    Filter[] ActionCodeFilter = DataHelper.mapToFilterArray(ActionCodeMap, String.class);
    if (ActionCodeFilter != null) {
      StringFilter[] ActionCodeFilters = new StringFilter[ActionCodeFilter.length];
      for (int i = 0; i < ActionCodeFilters.length; i++) {
        ActionCodeFilters[i] = (StringFilter)ActionCodeFilter[i];
      }
      try {
        out.setActionCodeFilter(ActionCodeFilters);
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
  
    Map ArchFlagMap = (Map)record.get("ArchFlag");
    Boolean ArchFlagFetch = DataHelper.getFetch(ArchFlagMap);
    Boolean ArchFlagSortDir = DataHelper.getSortDirection(ArchFlagMap);
    Integer ArchFlagSortOrder = DataHelper.getSortOrder(ArchFlagMap);
    if (ArchFlagFetch != null) out.setArchFlagFetch(ArchFlagFetch);
    if (ArchFlagSortDir != null) out.setArchFlagSortDirection(ArchFlagSortDir);
    if (ArchFlagSortOrder != null) out.setArchFlagSortOrder(ArchFlagSortOrder);

    Filter[] ArchFlagFilter = DataHelper.mapToFilterArray(ArchFlagMap, Boolean.class);
    if (ArchFlagFilter != null) {
      BooleanFilter[] ArchFlagFilters = new BooleanFilter[ArchFlagFilter.length];
      for (int i = 0; i < ArchFlagFilters.length; i++) {
        ArchFlagFilters[i] = (BooleanFilter)ArchFlagFilter[i];
      }
      try {
        out.setArchFlagFilter(ArchFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ManualCcauthCodeMap = (Map)record.get("ManualCcauthCode");
    Boolean ManualCcauthCodeFetch = DataHelper.getFetch(ManualCcauthCodeMap);
    Boolean ManualCcauthCodeSortDir = DataHelper.getSortDirection(ManualCcauthCodeMap);
    Integer ManualCcauthCodeSortOrder = DataHelper.getSortOrder(ManualCcauthCodeMap);
    if (ManualCcauthCodeFetch != null) out.setManualCcauthCodeFetch(ManualCcauthCodeFetch);
    if (ManualCcauthCodeSortDir != null) out.setManualCcauthCodeSortDirection(ManualCcauthCodeSortDir);
    if (ManualCcauthCodeSortOrder != null) out.setManualCcauthCodeSortOrder(ManualCcauthCodeSortOrder);

    Filter[] ManualCcauthCodeFilter = DataHelper.mapToFilterArray(ManualCcauthCodeMap, String.class);
    if (ManualCcauthCodeFilter != null) {
      StringFilter[] ManualCcauthCodeFilters = new StringFilter[ManualCcauthCodeFilter.length];
      for (int i = 0; i < ManualCcauthCodeFilters.length; i++) {
        ManualCcauthCodeFilters[i] = (StringFilter)ManualCcauthCodeFilter[i];
      }
      try {
        out.setManualCcauthCodeFilter(ManualCcauthCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ManualCcauthDateMap = (Map)record.get("ManualCcauthDate");
    Boolean ManualCcauthDateFetch = DataHelper.getFetch(ManualCcauthDateMap);
    Boolean ManualCcauthDateSortDir = DataHelper.getSortDirection(ManualCcauthDateMap);
    Integer ManualCcauthDateSortOrder = DataHelper.getSortOrder(ManualCcauthDateMap);
    if (ManualCcauthDateFetch != null) out.setManualCcauthDateFetch(ManualCcauthDateFetch);
    if (ManualCcauthDateSortDir != null) out.setManualCcauthDateSortDirection(ManualCcauthDateSortDir);
    if (ManualCcauthDateSortOrder != null) out.setManualCcauthDateSortOrder(ManualCcauthDateSortOrder);

    Filter[] ManualCcauthDateFilter = DataHelper.mapToFilterArray(ManualCcauthDateMap, String.class);
    if (ManualCcauthDateFilter != null) {
      StringFilter[] ManualCcauthDateFilters = new StringFilter[ManualCcauthDateFilter.length];
      for (int i = 0; i < ManualCcauthDateFilters.length; i++) {
        ManualCcauthDateFilters[i] = (StringFilter)ManualCcauthDateFilter[i];
      }
      try {
        out.setManualCcauthDateFilter(ManualCcauthDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DistributedAmountMap = (Map)record.get("DistributedAmount");
    Boolean DistributedAmountFetch = DataHelper.getFetch(DistributedAmountMap);
    Boolean DistributedAmountSortDir = DataHelper.getSortDirection(DistributedAmountMap);
    Integer DistributedAmountSortOrder = DataHelper.getSortOrder(DistributedAmountMap);
    if (DistributedAmountFetch != null) out.setDistributedAmountFetch(DistributedAmountFetch);
    if (DistributedAmountSortDir != null) out.setDistributedAmountSortDirection(DistributedAmountSortDir);
    if (DistributedAmountSortOrder != null) out.setDistributedAmountSortOrder(DistributedAmountSortOrder);

    Filter[] DistributedAmountFilter = DataHelper.mapToFilterArray(DistributedAmountMap, BigInteger.class);
    if (DistributedAmountFilter != null) {
      BigIntegerFilter[] DistributedAmountFilters = new BigIntegerFilter[DistributedAmountFilter.length];
      for (int i = 0; i < DistributedAmountFilters.length; i++) {
        DistributedAmountFilters[i] = (BigIntegerFilter)DistributedAmountFilter[i];
      }
      try {
        out.setDistributedAmountFilter(DistributedAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DistributedGlAmountMap = (Map)record.get("DistributedGlAmount");
    Boolean DistributedGlAmountFetch = DataHelper.getFetch(DistributedGlAmountMap);
    Boolean DistributedGlAmountSortDir = DataHelper.getSortDirection(DistributedGlAmountMap);
    Integer DistributedGlAmountSortOrder = DataHelper.getSortOrder(DistributedGlAmountMap);
    if (DistributedGlAmountFetch != null) out.setDistributedGlAmountFetch(DistributedGlAmountFetch);
    if (DistributedGlAmountSortDir != null) out.setDistributedGlAmountSortDirection(DistributedGlAmountSortDir);
    if (DistributedGlAmountSortOrder != null) out.setDistributedGlAmountSortOrder(DistributedGlAmountSortOrder);

    Filter[] DistributedGlAmountFilter = DataHelper.mapToFilterArray(DistributedGlAmountMap, BigInteger.class);
    if (DistributedGlAmountFilter != null) {
      BigIntegerFilter[] DistributedGlAmountFilters = new BigIntegerFilter[DistributedGlAmountFilter.length];
      for (int i = 0; i < DistributedGlAmountFilters.length; i++) {
        DistributedGlAmountFilters[i] = (BigIntegerFilter)DistributedGlAmountFilter[i];
      }
      try {
        out.setDistributedGlAmountFilter(DistributedGlAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FileIdMap = (Map)record.get("FileId");
    Boolean FileIdFetch = DataHelper.getFetch(FileIdMap);
    Boolean FileIdSortDir = DataHelper.getSortDirection(FileIdMap);
    Integer FileIdSortOrder = DataHelper.getSortOrder(FileIdMap);
    if (FileIdFetch != null) out.setFileIdFetch(FileIdFetch);
    if (FileIdSortDir != null) out.setFileIdSortDirection(FileIdSortDir);
    if (FileIdSortOrder != null) out.setFileIdSortOrder(FileIdSortOrder);

    Filter[] FileIdFilter = DataHelper.mapToFilterArray(FileIdMap, Integer.class);
    if (FileIdFilter != null) {
      IntegerFilter[] FileIdFilters = new IntegerFilter[FileIdFilter.length];
      for (int i = 0; i < FileIdFilters.length; i++) {
        FileIdFilters[i] = (IntegerFilter)FileIdFilter[i];
      }
      try {
        out.setFileIdFilter(FileIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ResponseCodeMap = (Map)record.get("ResponseCode");
    Boolean ResponseCodeFetch = DataHelper.getFetch(ResponseCodeMap);
    Boolean ResponseCodeSortDir = DataHelper.getSortDirection(ResponseCodeMap);
    Integer ResponseCodeSortOrder = DataHelper.getSortOrder(ResponseCodeMap);
    if (ResponseCodeFetch != null) out.setResponseCodeFetch(ResponseCodeFetch);
    if (ResponseCodeSortDir != null) out.setResponseCodeSortDirection(ResponseCodeSortDir);
    if (ResponseCodeSortOrder != null) out.setResponseCodeSortOrder(ResponseCodeSortOrder);

    Filter[] ResponseCodeFilter = DataHelper.mapToFilterArray(ResponseCodeMap, String.class);
    if (ResponseCodeFilter != null) {
      StringFilter[] ResponseCodeFilters = new StringFilter[ResponseCodeFilter.length];
      for (int i = 0; i < ResponseCodeFilters.length; i++) {
        ResponseCodeFilters[i] = (StringFilter)ResponseCodeFilter[i];
      }
      try {
        out.setResponseCodeFilter(ResponseCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillOrderNumberMap = (Map)record.get("BillOrderNumber");
    Boolean BillOrderNumberFetch = DataHelper.getFetch(BillOrderNumberMap);
    Boolean BillOrderNumberSortDir = DataHelper.getSortDirection(BillOrderNumberMap);
    Integer BillOrderNumberSortOrder = DataHelper.getSortOrder(BillOrderNumberMap);
    if (BillOrderNumberFetch != null) out.setBillOrderNumberFetch(BillOrderNumberFetch);
    if (BillOrderNumberSortDir != null) out.setBillOrderNumberSortDirection(BillOrderNumberSortDir);
    if (BillOrderNumberSortOrder != null) out.setBillOrderNumberSortOrder(BillOrderNumberSortOrder);

    Filter[] BillOrderNumberFilter = DataHelper.mapToFilterArray(BillOrderNumberMap, String.class);
    if (BillOrderNumberFilter != null) {
      StringFilter[] BillOrderNumberFilters = new StringFilter[BillOrderNumberFilter.length];
      for (int i = 0; i < BillOrderNumberFilters.length; i++) {
        BillOrderNumberFilters[i] = (StringFilter)BillOrderNumberFilter[i];
      }
      try {
        out.setBillOrderNumberFilter(BillOrderNumberFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalAmountMap = (Map)record.get("ExternalAmount");
    Boolean ExternalAmountFetch = DataHelper.getFetch(ExternalAmountMap);
    Boolean ExternalAmountSortDir = DataHelper.getSortDirection(ExternalAmountMap);
    Integer ExternalAmountSortOrder = DataHelper.getSortOrder(ExternalAmountMap);
    if (ExternalAmountFetch != null) out.setExternalAmountFetch(ExternalAmountFetch);
    if (ExternalAmountSortDir != null) out.setExternalAmountSortDirection(ExternalAmountSortDir);
    if (ExternalAmountSortOrder != null) out.setExternalAmountSortOrder(ExternalAmountSortOrder);

    Filter[] ExternalAmountFilter = DataHelper.mapToFilterArray(ExternalAmountMap, BigInteger.class);
    if (ExternalAmountFilter != null) {
      BigIntegerFilter[] ExternalAmountFilters = new BigIntegerFilter[ExternalAmountFilter.length];
      for (int i = 0; i < ExternalAmountFilters.length; i++) {
        ExternalAmountFilters[i] = (BigIntegerFilter)ExternalAmountFilter[i];
      }
      try {
        out.setExternalAmountFilter(ExternalAmountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ExternalCurrencyMap = (Map)record.get("ExternalCurrency");
    Boolean ExternalCurrencyFetch = DataHelper.getFetch(ExternalCurrencyMap);
    Boolean ExternalCurrencySortDir = DataHelper.getSortDirection(ExternalCurrencyMap);
    Integer ExternalCurrencySortOrder = DataHelper.getSortOrder(ExternalCurrencyMap);
    if (ExternalCurrencyFetch != null) out.setExternalCurrencyFetch(ExternalCurrencyFetch);
    if (ExternalCurrencySortDir != null) out.setExternalCurrencySortDirection(ExternalCurrencySortDir);
    if (ExternalCurrencySortOrder != null) out.setExternalCurrencySortOrder(ExternalCurrencySortOrder);

    Filter[] ExternalCurrencyFilter = DataHelper.mapToFilterArray(ExternalCurrencyMap, Integer.class);
    if (ExternalCurrencyFilter != null) {
      IntegerFilter[] ExternalCurrencyFilters = new IntegerFilter[ExternalCurrencyFilter.length];
      for (int i = 0; i < ExternalCurrencyFilters.length; i++) {
        ExternalCurrencyFilters[i] = (IntegerFilter)ExternalCurrencyFilter[i];
      }
      try {
        out.setExternalCurrencyFilter(ExternalCurrencyFilters);
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
  
    Map AnnotationMap = (Map)record.get("Annotation");
    Boolean AnnotationFetch = DataHelper.getFetch(AnnotationMap);
    Boolean AnnotationSortDir = DataHelper.getSortDirection(AnnotationMap);
    Integer AnnotationSortOrder = DataHelper.getSortOrder(AnnotationMap);
    if (AnnotationFetch != null) out.setAnnotationFetch(AnnotationFetch);
    if (AnnotationSortDir != null) out.setAnnotationSortDirection(AnnotationSortDir);
    if (AnnotationSortOrder != null) out.setAnnotationSortOrder(AnnotationSortOrder);

    Filter[] AnnotationFilter = DataHelper.mapToFilterArray(AnnotationMap, String.class);
    if (AnnotationFilter != null) {
      StringFilter[] AnnotationFilters = new StringFilter[AnnotationFilter.length];
      for (int i = 0; i < AnnotationFilters.length; i++) {
        AnnotationFilters[i] = (StringFilter)AnnotationFilter[i];
      }
      try {
        out.setAnnotationFilter(AnnotationFilters);
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
