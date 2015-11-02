/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: PaymentTransObjectHelper.java
 * Definition File: Customer/PaymentTrans.xml
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



/** Helper class to convert PaymentTransObject JavaBean objects to/from HashMaps.
 */
public class PaymentTransObjectHelper implements ArubaObjectHelper
{
  /** convert PaymentTransObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (PaymentTransObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentTransObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentTransObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTransObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentTransObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert PaymentTransObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTransObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert PaymentTransObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "PaymentTransObject")
   * @return Map     the output Map
   */
  public static Map toMap (PaymentTransObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "PaymentTransObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to PaymentTransObjectData.
   * @param record the Map containing the data to convert to the object
   * @return PaymentTransObjectData the converted object
   */
  public static PaymentTransObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to PaymentTransObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "PaymentTransObject")
   * @return PaymentTransObjectData the converted object
   */
  public static PaymentTransObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTransObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to PaymentTransObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return PaymentTransObjectFilter the converted object
   */
  public static PaymentTransObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to PaymentTransObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "PaymentTransObject")
   * @return PaymentTransObjectFilter the converted object
   */
  public static PaymentTransObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTransObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to PaymentTransObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return PaymentTransObjectDataList the converted object
   */
  public static PaymentTransObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to PaymentTransObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "PaymentTransObjectList")
   * @return PaymentTransObjectDataList the converted object
   */
  public static PaymentTransObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "PaymentTransObjectList";
    Object[] root = (Object[]) record.get (rootName);
    PaymentTransObjectData[] array = null;
    if (root != null)
    {
      array = new PaymentTransObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = PaymentTransObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new PaymentTransObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new PaymentTransObjectDataList (array, index, total);
  }
  /** convert PaymentTransObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentTransObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", PaymentTransObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._PaymentDueDateSet) record.put ("PaymentDueDate", in.PaymentDueDate);
  
    if (in._StatementDateSet) record.put ("StatementDate", in.StatementDate);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._TransTypeSet) record.put ("TransType", in.TransType);
  
    if (in._BmfTransTypeSet) record.put ("BmfTransType", in.BmfTransType);
  
    if (in._TransStatusSet) record.put ("TransStatus", in.TransStatus);
  
    if (in._FileIdSet) record.put ("FileId", in.FileId);
  
    if (in._ClearingHouseIdSet) record.put ("ClearingHouseId", in.ClearingHouseId);
  
    if (in._ResponseCodeSet) record.put ("ResponseCode", in.ResponseCode);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._PmtTrackingIdSet) record.put ("PmtTrackingId", in.PmtTrackingId);
  
    if (in._PmtTrackingIdServSet) record.put ("PmtTrackingIdServ", in.PmtTrackingIdServ);
  
    if (in._ProviderIdSet) record.put ("ProviderId", in.ProviderId);
  
    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
  
    if (in._CcauthCodeSet) record.put ("CcauthCode", in.CcauthCode);
  
    if (in._CcauthDateSet) record.put ("CcauthDate", in.CcauthDate);
  
    if (in._PmtReqSentCounterSet) record.put ("PmtReqSentCounter", in.PmtReqSentCounter);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._OrigTrackingIdSet) record.put ("OrigTrackingId", in.OrigTrackingId);
  
    if (in._OrigTrackingIdServSet) record.put ("OrigTrackingIdServ", in.OrigTrackingIdServ);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._RequestTypeSet) record.put ("RequestType", in.RequestType);
  
    if (in._RequestedServiceSet) record.put ("RequestedService", in.RequestedService);
  
    if (in._RequestIdSet) record.put ("RequestId", in.RequestId);
  
    if (in._EpgTransactionIdSet) record.put ("EpgTransactionId", in.EpgTransactionId);
  
    if (in._EpgFlagSet) record.put ("EpgFlag", in.EpgFlag);
  
    if (in._EpgMessageSet) record.put ("EpgMessage", in.EpgMessage);
  
    if (in._EftDebitProcTransIdSet) record.put ("EftDebitProcTransId", in.EftDebitProcTransId);
  
    if (in._PayMethodSet) record.put ("PayMethod", in.PayMethod);
  
    if (in._IsRealtimeSet) record.put ("IsRealtime", in.IsRealtime);
  
    if (in._TransDateSet) record.put ("TransDate", in.TransDate);
  
    if (in._AnnotationSet) record.put ("Annotation", in.Annotation);
  
    if (in._DesignatedTaxAmountSet) record.put ("DesignatedTaxAmount", in.DesignatedTaxAmount);
  
    if (in._TaxPointSet) record.put ("TaxPoint", in.TaxPoint);
  
    if (in._TaxRateSet) record.put ("TaxRate", in.TaxRate);
  
    if (in._ImpliedDecimalSet) record.put ("ImpliedDecimal", in.ImpliedDecimal);
  
    if (in._TaxPkgInstIdSet) record.put ("TaxPkgInstId", in.TaxPkgInstId);
  
    if (in._TaxTypeCodeSet) record.put ("TaxTypeCode", in.TaxTypeCode);
  
    if (in._OneoffCardnumSet) record.put ("OneoffCardnum", in.OneoffCardnum);
  
    if (in._DcardValStatusSet) record.put ("DcardValStatus", in.DcardValStatus);
  
    if (in._PaymentMerchantIdSet) record.put ("PaymentMerchantId", in.PaymentMerchantId);
  
    if (in._TransactionUuidSet) record.put ("TransactionUuid", in.TransactionUuid);
      return record;
  }
  /** convert PaymentTransObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (PaymentTransObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", PaymentTransObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.BillRefNo, in.BillRefNoSort, in.BillRefNoSortAscending, in.BillRefNoFetch);
      if (map != null) record.put ("BillRefNo", map);
      map = DataHelper.filterToMap (in.BillRefResets, in.BillRefResetsSort, in.BillRefResetsSortAscending, in.BillRefResetsFetch);
      if (map != null) record.put ("BillRefResets", map);
      map = DataHelper.filterToMap (in.PaymentDueDate, in.PaymentDueDateSort, in.PaymentDueDateSortAscending, in.PaymentDueDateFetch);
      if (map != null) record.put ("PaymentDueDate", map);
      map = DataHelper.filterToMap (in.StatementDate, in.StatementDateSort, in.StatementDateSortAscending, in.StatementDateFetch);
      if (map != null) record.put ("StatementDate", map);
      map = DataHelper.filterToMap (in.Amount, in.AmountSort, in.AmountSortAscending, in.AmountFetch);
      if (map != null) record.put ("Amount", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.TransType, in.TransTypeSort, in.TransTypeSortAscending, in.TransTypeFetch);
      if (map != null) record.put ("TransType", map);
      map = DataHelper.filterToMap (in.BmfTransType, in.BmfTransTypeSort, in.BmfTransTypeSortAscending, in.BmfTransTypeFetch);
      if (map != null) record.put ("BmfTransType", map);
      map = DataHelper.filterToMap (in.TransStatus, in.TransStatusSort, in.TransStatusSortAscending, in.TransStatusFetch);
      if (map != null) record.put ("TransStatus", map);
      map = DataHelper.filterToMap (in.FileId, in.FileIdSort, in.FileIdSortAscending, in.FileIdFetch);
      if (map != null) record.put ("FileId", map);
      map = DataHelper.filterToMap (in.ClearingHouseId, in.ClearingHouseIdSort, in.ClearingHouseIdSortAscending, in.ClearingHouseIdFetch, in.ClearingHouseIdCaseInsensitive);
      if (map != null) record.put ("ClearingHouseId", map);
      map = DataHelper.filterToMap (in.ResponseCode, in.ResponseCodeSort, in.ResponseCodeSortAscending, in.ResponseCodeFetch, in.ResponseCodeCaseInsensitive);
      if (map != null) record.put ("ResponseCode", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.PmtTrackingId, in.PmtTrackingIdSort, in.PmtTrackingIdSortAscending, in.PmtTrackingIdFetch);
      if (map != null) record.put ("PmtTrackingId", map);
      map = DataHelper.filterToMap (in.PmtTrackingIdServ, in.PmtTrackingIdServSort, in.PmtTrackingIdServSortAscending, in.PmtTrackingIdServFetch);
      if (map != null) record.put ("PmtTrackingIdServ", map);
      map = DataHelper.filterToMap (in.ProviderId, in.ProviderIdSort, in.ProviderIdSortAscending, in.ProviderIdFetch);
      if (map != null) record.put ("ProviderId", map);
      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch);
      if (map != null) record.put ("ProfileId", map);
      map = DataHelper.filterToMap (in.CcauthCode, in.CcauthCodeSort, in.CcauthCodeSortAscending, in.CcauthCodeFetch, in.CcauthCodeCaseInsensitive);
      if (map != null) record.put ("CcauthCode", map);
      map = DataHelper.filterToMap (in.CcauthDate, in.CcauthDateSort, in.CcauthDateSortAscending, in.CcauthDateFetch, in.CcauthDateCaseInsensitive);
      if (map != null) record.put ("CcauthDate", map);
      map = DataHelper.filterToMap (in.PmtReqSentCounter, in.PmtReqSentCounterSort, in.PmtReqSentCounterSortAscending, in.PmtReqSentCounterFetch);
      if (map != null) record.put ("PmtReqSentCounter", map);
      map = DataHelper.filterToMap (in.OpenItemId, in.OpenItemIdSort, in.OpenItemIdSortAscending, in.OpenItemIdFetch);
      if (map != null) record.put ("OpenItemId", map);
      map = DataHelper.filterToMap (in.OrigTrackingId, in.OrigTrackingIdSort, in.OrigTrackingIdSortAscending, in.OrigTrackingIdFetch);
      if (map != null) record.put ("OrigTrackingId", map);
      map = DataHelper.filterToMap (in.OrigTrackingIdServ, in.OrigTrackingIdServSort, in.OrigTrackingIdServSortAscending, in.OrigTrackingIdServFetch);
      if (map != null) record.put ("OrigTrackingIdServ", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
      map = DataHelper.filterToMap (in.RequestType, in.RequestTypeSort, in.RequestTypeSortAscending, in.RequestTypeFetch);
      if (map != null) record.put ("RequestType", map);
      map = DataHelper.filterToMap (in.RequestedService, in.RequestedServiceSort, in.RequestedServiceSortAscending, in.RequestedServiceFetch, in.RequestedServiceCaseInsensitive);
      if (map != null) record.put ("RequestedService", map);
      map = DataHelper.filterToMap (in.RequestId, in.RequestIdSort, in.RequestIdSortAscending, in.RequestIdFetch, in.RequestIdCaseInsensitive);
      if (map != null) record.put ("RequestId", map);
      map = DataHelper.filterToMap (in.EpgTransactionId, in.EpgTransactionIdSort, in.EpgTransactionIdSortAscending, in.EpgTransactionIdFetch, in.EpgTransactionIdCaseInsensitive);
      if (map != null) record.put ("EpgTransactionId", map);
      map = DataHelper.filterToMap (in.EpgFlag, in.EpgFlagSort, in.EpgFlagSortAscending, in.EpgFlagFetch, in.EpgFlagCaseInsensitive);
      if (map != null) record.put ("EpgFlag", map);
      map = DataHelper.filterToMap (in.EpgMessage, in.EpgMessageSort, in.EpgMessageSortAscending, in.EpgMessageFetch, in.EpgMessageCaseInsensitive);
      if (map != null) record.put ("EpgMessage", map);
      map = DataHelper.filterToMap (in.EftDebitProcTransId, in.EftDebitProcTransIdSort, in.EftDebitProcTransIdSortAscending, in.EftDebitProcTransIdFetch, in.EftDebitProcTransIdCaseInsensitive);
      if (map != null) record.put ("EftDebitProcTransId", map);
      map = DataHelper.filterToMap (in.PayMethod, in.PayMethodSort, in.PayMethodSortAscending, in.PayMethodFetch);
      if (map != null) record.put ("PayMethod", map);
      map = DataHelper.filterToMap (in.IsRealtime, in.IsRealtimeSort, in.IsRealtimeSortAscending, in.IsRealtimeFetch);
      if (map != null) record.put ("IsRealtime", map);
      map = DataHelper.filterToMap (in.TransDate, in.TransDateSort, in.TransDateSortAscending, in.TransDateFetch);
      if (map != null) record.put ("TransDate", map);
      map = DataHelper.filterToMap (in.Annotation, in.AnnotationSort, in.AnnotationSortAscending, in.AnnotationFetch, in.AnnotationCaseInsensitive);
      if (map != null) record.put ("Annotation", map);
      map = DataHelper.filterToMap (in.DesignatedTaxAmount, in.DesignatedTaxAmountSort, in.DesignatedTaxAmountSortAscending, in.DesignatedTaxAmountFetch);
      if (map != null) record.put ("DesignatedTaxAmount", map);
      map = DataHelper.filterToMap (in.TaxPoint, in.TaxPointSort, in.TaxPointSortAscending, in.TaxPointFetch);
      if (map != null) record.put ("TaxPoint", map);
      map = DataHelper.filterToMap (in.TaxRate, in.TaxRateSort, in.TaxRateSortAscending, in.TaxRateFetch);
      if (map != null) record.put ("TaxRate", map);
      map = DataHelper.filterToMap (in.ImpliedDecimal, in.ImpliedDecimalSort, in.ImpliedDecimalSortAscending, in.ImpliedDecimalFetch);
      if (map != null) record.put ("ImpliedDecimal", map);
      map = DataHelper.filterToMap (in.TaxPkgInstId, in.TaxPkgInstIdSort, in.TaxPkgInstIdSortAscending, in.TaxPkgInstIdFetch);
      if (map != null) record.put ("TaxPkgInstId", map);
      map = DataHelper.filterToMap (in.TaxTypeCode, in.TaxTypeCodeSort, in.TaxTypeCodeSortAscending, in.TaxTypeCodeFetch);
      if (map != null) record.put ("TaxTypeCode", map);
      map = DataHelper.filterToMap (in.OneoffCardnum, in.OneoffCardnumSort, in.OneoffCardnumSortAscending, in.OneoffCardnumFetch, in.OneoffCardnumCaseInsensitive);
      if (map != null) record.put ("OneoffCardnum", map);
      map = DataHelper.filterToMap (in.DcardValStatus, in.DcardValStatusSort, in.DcardValStatusSortAscending, in.DcardValStatusFetch);
      if (map != null) record.put ("DcardValStatus", map);
      map = DataHelper.filterToMap (in.PaymentMerchantId, in.PaymentMerchantIdSort, in.PaymentMerchantIdSortAscending, in.PaymentMerchantIdFetch);
      if (map != null) record.put ("PaymentMerchantId", map);
      map = DataHelper.filterToMap (in.TransactionUuid, in.TransactionUuidSort, in.TransactionUuidSortAscending, in.TransactionUuidFetch, in.TransactionUuidCaseInsensitive);
      if (map != null) record.put ("TransactionUuid", map);
    return record;
  }
  /** convert Map to PaymentTransObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentTransObjectData the converted object
   */
  public static PaymentTransObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentTransObjectData out = new PaymentTransObjectData ();

    out.Key = PaymentTransObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("BillRefNo")) != null)
    {
      out.BillRefNo = (Integer) obj;
    }
  
    if ((obj = record.get ("BillRefResets")) != null)
    {
      out.BillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("PaymentDueDate")) != null)
    {
      out.PaymentDueDate = (Date) obj;
    }
  
    if ((obj = record.get ("StatementDate")) != null)
    {
      out.StatementDate = (Date) obj;
    }
  
    if ((obj = record.get ("Amount")) != null)
    {
      out.Amount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("TransType")) != null)
    {
      out.TransType = (Integer) obj;
    }
  
    if ((obj = record.get ("BmfTransType")) != null)
    {
      out.BmfTransType = (Integer) obj;
    }
  
    if ((obj = record.get ("TransStatus")) != null)
    {
      out.TransStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("FileId")) != null)
    {
      out.FileId = (Integer) obj;
    }
  
    if ((obj = record.get ("ClearingHouseId")) != null)
    {
      out.ClearingHouseId = (String) obj;
    }
  
    if ((obj = record.get ("ResponseCode")) != null)
    {
      out.ResponseCode = (String) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("PmtTrackingId")) != null)
    {
      out.PmtTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("PmtTrackingIdServ")) != null)
    {
      out.PmtTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("ProviderId")) != null)
    {
      out.ProviderId = (Integer) obj;
    }
  
    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CcauthCode")) != null)
    {
      out.CcauthCode = (String) obj;
    }
  
    if ((obj = record.get ("CcauthDate")) != null)
    {
      out.CcauthDate = (String) obj;
    }
  
    if ((obj = record.get ("PmtReqSentCounter")) != null)
    {
      out.PmtReqSentCounter = (Integer) obj;
    }
  
    if ((obj = record.get ("OpenItemId")) != null)
    {
      out.OpenItemId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingId")) != null)
    {
      out.OrigTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingIdServ")) != null)
    {
      out.OrigTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
    }
  
    if ((obj = record.get ("RequestType")) != null)
    {
      out.RequestType = (Integer) obj;
    }
  
    if ((obj = record.get ("RequestedService")) != null)
    {
      out.RequestedService = (String) obj;
    }
  
    if ((obj = record.get ("RequestId")) != null)
    {
      out.RequestId = (String) obj;
    }
  
    if ((obj = record.get ("EpgTransactionId")) != null)
    {
      out.EpgTransactionId = (String) obj;
    }
  
    if ((obj = record.get ("EpgFlag")) != null)
    {
      out.EpgFlag = (String) obj;
    }
  
    if ((obj = record.get ("EpgMessage")) != null)
    {
      out.EpgMessage = (String) obj;
    }
  
    if ((obj = record.get ("EftDebitProcTransId")) != null)
    {
      out.EftDebitProcTransId = (String) obj;
    }
  
    if ((obj = record.get ("PayMethod")) != null)
    {
      out.PayMethod = (Integer) obj;
    }
  
    if ((obj = record.get ("IsRealtime")) != null)
    {
      out.IsRealtime = (Boolean) obj;
    }
  
    if ((obj = record.get ("TransDate")) != null)
    {
      out.TransDate = (Date) obj;
    }
  
    if ((obj = record.get ("Annotation")) != null)
    {
      out.Annotation = (String) obj;
    }
  
    if ((obj = record.get ("DesignatedTaxAmount")) != null)
    {
      out.DesignatedTaxAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TaxPoint")) != null)
    {
      out.TaxPoint = (Date) obj;
    }
  
    if ((obj = record.get ("TaxRate")) != null)
    {
      out.TaxRate = (Integer) obj;
    }
  
    if ((obj = record.get ("ImpliedDecimal")) != null)
    {
      out.ImpliedDecimal = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxPkgInstId")) != null)
    {
      out.TaxPkgInstId = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxTypeCode")) != null)
    {
      out.TaxTypeCode = (Integer) obj;
    }
  
    if ((obj = record.get ("OneoffCardnum")) != null)
    {
      out.OneoffCardnum = (String) obj;
    }
  
    if ((obj = record.get ("DcardValStatus")) != null)
    {
      out.DcardValStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("PaymentMerchantId")) != null)
    {
      out.PaymentMerchantId = (Integer) obj;
    }
  
    if ((obj = record.get ("TransactionUuid")) != null)
    {
      out.TransactionUuid = (String) obj;
    }
      return out;
  }
  /** convert Map to PaymentTransObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return PaymentTransObjectFilter the converted object
   */
  public static PaymentTransObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    PaymentTransObjectFilter out = new PaymentTransObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = PaymentTransObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map PaymentDueDateMap = (Map)record.get("PaymentDueDate");
    Boolean PaymentDueDateFetch = DataHelper.getFetch(PaymentDueDateMap);
    Boolean PaymentDueDateSortDir = DataHelper.getSortDirection(PaymentDueDateMap);
    Integer PaymentDueDateSortOrder = DataHelper.getSortOrder(PaymentDueDateMap);
    if (PaymentDueDateFetch != null) out.setPaymentDueDateFetch(PaymentDueDateFetch);
    if (PaymentDueDateSortDir != null) out.setPaymentDueDateSortDirection(PaymentDueDateSortDir);
    if (PaymentDueDateSortOrder != null) out.setPaymentDueDateSortOrder(PaymentDueDateSortOrder);

    Filter[] PaymentDueDateFilter = DataHelper.mapToFilterArray(PaymentDueDateMap, Date.class);
    if (PaymentDueDateFilter != null) {
      DateFilter[] PaymentDueDateFilters = new DateFilter[PaymentDueDateFilter.length];
      for (int i = 0; i < PaymentDueDateFilters.length; i++) {
        PaymentDueDateFilters[i] = (DateFilter)PaymentDueDateFilter[i];
      }
      try {
        out.setPaymentDueDateFilter(PaymentDueDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StatementDateMap = (Map)record.get("StatementDate");
    Boolean StatementDateFetch = DataHelper.getFetch(StatementDateMap);
    Boolean StatementDateSortDir = DataHelper.getSortDirection(StatementDateMap);
    Integer StatementDateSortOrder = DataHelper.getSortOrder(StatementDateMap);
    if (StatementDateFetch != null) out.setStatementDateFetch(StatementDateFetch);
    if (StatementDateSortDir != null) out.setStatementDateSortDirection(StatementDateSortDir);
    if (StatementDateSortOrder != null) out.setStatementDateSortOrder(StatementDateSortOrder);

    Filter[] StatementDateFilter = DataHelper.mapToFilterArray(StatementDateMap, Date.class);
    if (StatementDateFilter != null) {
      DateFilter[] StatementDateFilters = new DateFilter[StatementDateFilter.length];
      for (int i = 0; i < StatementDateFilters.length; i++) {
        StatementDateFilters[i] = (DateFilter)StatementDateFilter[i];
      }
      try {
        out.setStatementDateFilter(StatementDateFilters);
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
  
    Map BmfTransTypeMap = (Map)record.get("BmfTransType");
    Boolean BmfTransTypeFetch = DataHelper.getFetch(BmfTransTypeMap);
    Boolean BmfTransTypeSortDir = DataHelper.getSortDirection(BmfTransTypeMap);
    Integer BmfTransTypeSortOrder = DataHelper.getSortOrder(BmfTransTypeMap);
    if (BmfTransTypeFetch != null) out.setBmfTransTypeFetch(BmfTransTypeFetch);
    if (BmfTransTypeSortDir != null) out.setBmfTransTypeSortDirection(BmfTransTypeSortDir);
    if (BmfTransTypeSortOrder != null) out.setBmfTransTypeSortOrder(BmfTransTypeSortOrder);

    Filter[] BmfTransTypeFilter = DataHelper.mapToFilterArray(BmfTransTypeMap, Integer.class);
    if (BmfTransTypeFilter != null) {
      IntegerFilter[] BmfTransTypeFilters = new IntegerFilter[BmfTransTypeFilter.length];
      for (int i = 0; i < BmfTransTypeFilters.length; i++) {
        BmfTransTypeFilters[i] = (IntegerFilter)BmfTransTypeFilter[i];
      }
      try {
        out.setBmfTransTypeFilter(BmfTransTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TransStatusMap = (Map)record.get("TransStatus");
    Boolean TransStatusFetch = DataHelper.getFetch(TransStatusMap);
    Boolean TransStatusSortDir = DataHelper.getSortDirection(TransStatusMap);
    Integer TransStatusSortOrder = DataHelper.getSortOrder(TransStatusMap);
    if (TransStatusFetch != null) out.setTransStatusFetch(TransStatusFetch);
    if (TransStatusSortDir != null) out.setTransStatusSortDirection(TransStatusSortDir);
    if (TransStatusSortOrder != null) out.setTransStatusSortOrder(TransStatusSortOrder);

    Filter[] TransStatusFilter = DataHelper.mapToFilterArray(TransStatusMap, Integer.class);
    if (TransStatusFilter != null) {
      IntegerFilter[] TransStatusFilters = new IntegerFilter[TransStatusFilter.length];
      for (int i = 0; i < TransStatusFilters.length; i++) {
        TransStatusFilters[i] = (IntegerFilter)TransStatusFilter[i];
      }
      try {
        out.setTransStatusFilter(TransStatusFilters);
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
  
    Map PmtTrackingIdMap = (Map)record.get("PmtTrackingId");
    Boolean PmtTrackingIdFetch = DataHelper.getFetch(PmtTrackingIdMap);
    Boolean PmtTrackingIdSortDir = DataHelper.getSortDirection(PmtTrackingIdMap);
    Integer PmtTrackingIdSortOrder = DataHelper.getSortOrder(PmtTrackingIdMap);
    if (PmtTrackingIdFetch != null) out.setPmtTrackingIdFetch(PmtTrackingIdFetch);
    if (PmtTrackingIdSortDir != null) out.setPmtTrackingIdSortDirection(PmtTrackingIdSortDir);
    if (PmtTrackingIdSortOrder != null) out.setPmtTrackingIdSortOrder(PmtTrackingIdSortOrder);

    Filter[] PmtTrackingIdFilter = DataHelper.mapToFilterArray(PmtTrackingIdMap, Integer.class);
    if (PmtTrackingIdFilter != null) {
      IntegerFilter[] PmtTrackingIdFilters = new IntegerFilter[PmtTrackingIdFilter.length];
      for (int i = 0; i < PmtTrackingIdFilters.length; i++) {
        PmtTrackingIdFilters[i] = (IntegerFilter)PmtTrackingIdFilter[i];
      }
      try {
        out.setPmtTrackingIdFilter(PmtTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PmtTrackingIdServMap = (Map)record.get("PmtTrackingIdServ");
    Boolean PmtTrackingIdServFetch = DataHelper.getFetch(PmtTrackingIdServMap);
    Boolean PmtTrackingIdServSortDir = DataHelper.getSortDirection(PmtTrackingIdServMap);
    Integer PmtTrackingIdServSortOrder = DataHelper.getSortOrder(PmtTrackingIdServMap);
    if (PmtTrackingIdServFetch != null) out.setPmtTrackingIdServFetch(PmtTrackingIdServFetch);
    if (PmtTrackingIdServSortDir != null) out.setPmtTrackingIdServSortDirection(PmtTrackingIdServSortDir);
    if (PmtTrackingIdServSortOrder != null) out.setPmtTrackingIdServSortOrder(PmtTrackingIdServSortOrder);

    Filter[] PmtTrackingIdServFilter = DataHelper.mapToFilterArray(PmtTrackingIdServMap, Integer.class);
    if (PmtTrackingIdServFilter != null) {
      IntegerFilter[] PmtTrackingIdServFilters = new IntegerFilter[PmtTrackingIdServFilter.length];
      for (int i = 0; i < PmtTrackingIdServFilters.length; i++) {
        PmtTrackingIdServFilters[i] = (IntegerFilter)PmtTrackingIdServFilter[i];
      }
      try {
        out.setPmtTrackingIdServFilter(PmtTrackingIdServFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProviderIdMap = (Map)record.get("ProviderId");
    Boolean ProviderIdFetch = DataHelper.getFetch(ProviderIdMap);
    Boolean ProviderIdSortDir = DataHelper.getSortDirection(ProviderIdMap);
    Integer ProviderIdSortOrder = DataHelper.getSortOrder(ProviderIdMap);
    if (ProviderIdFetch != null) out.setProviderIdFetch(ProviderIdFetch);
    if (ProviderIdSortDir != null) out.setProviderIdSortDirection(ProviderIdSortDir);
    if (ProviderIdSortOrder != null) out.setProviderIdSortOrder(ProviderIdSortOrder);

    Filter[] ProviderIdFilter = DataHelper.mapToFilterArray(ProviderIdMap, Integer.class);
    if (ProviderIdFilter != null) {
      IntegerFilter[] ProviderIdFilters = new IntegerFilter[ProviderIdFilter.length];
      for (int i = 0; i < ProviderIdFilters.length; i++) {
        ProviderIdFilters[i] = (IntegerFilter)ProviderIdFilter[i];
      }
      try {
        out.setProviderIdFilter(ProviderIdFilters);
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
  
    Map CcauthCodeMap = (Map)record.get("CcauthCode");
    Boolean CcauthCodeFetch = DataHelper.getFetch(CcauthCodeMap);
    Boolean CcauthCodeSortDir = DataHelper.getSortDirection(CcauthCodeMap);
    Integer CcauthCodeSortOrder = DataHelper.getSortOrder(CcauthCodeMap);
    if (CcauthCodeFetch != null) out.setCcauthCodeFetch(CcauthCodeFetch);
    if (CcauthCodeSortDir != null) out.setCcauthCodeSortDirection(CcauthCodeSortDir);
    if (CcauthCodeSortOrder != null) out.setCcauthCodeSortOrder(CcauthCodeSortOrder);

    Filter[] CcauthCodeFilter = DataHelper.mapToFilterArray(CcauthCodeMap, String.class);
    if (CcauthCodeFilter != null) {
      StringFilter[] CcauthCodeFilters = new StringFilter[CcauthCodeFilter.length];
      for (int i = 0; i < CcauthCodeFilters.length; i++) {
        CcauthCodeFilters[i] = (StringFilter)CcauthCodeFilter[i];
      }
      try {
        out.setCcauthCodeFilter(CcauthCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CcauthDateMap = (Map)record.get("CcauthDate");
    Boolean CcauthDateFetch = DataHelper.getFetch(CcauthDateMap);
    Boolean CcauthDateSortDir = DataHelper.getSortDirection(CcauthDateMap);
    Integer CcauthDateSortOrder = DataHelper.getSortOrder(CcauthDateMap);
    if (CcauthDateFetch != null) out.setCcauthDateFetch(CcauthDateFetch);
    if (CcauthDateSortDir != null) out.setCcauthDateSortDirection(CcauthDateSortDir);
    if (CcauthDateSortOrder != null) out.setCcauthDateSortOrder(CcauthDateSortOrder);

    Filter[] CcauthDateFilter = DataHelper.mapToFilterArray(CcauthDateMap, String.class);
    if (CcauthDateFilter != null) {
      StringFilter[] CcauthDateFilters = new StringFilter[CcauthDateFilter.length];
      for (int i = 0; i < CcauthDateFilters.length; i++) {
        CcauthDateFilters[i] = (StringFilter)CcauthDateFilter[i];
      }
      try {
        out.setCcauthDateFilter(CcauthDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PmtReqSentCounterMap = (Map)record.get("PmtReqSentCounter");
    Boolean PmtReqSentCounterFetch = DataHelper.getFetch(PmtReqSentCounterMap);
    Boolean PmtReqSentCounterSortDir = DataHelper.getSortDirection(PmtReqSentCounterMap);
    Integer PmtReqSentCounterSortOrder = DataHelper.getSortOrder(PmtReqSentCounterMap);
    if (PmtReqSentCounterFetch != null) out.setPmtReqSentCounterFetch(PmtReqSentCounterFetch);
    if (PmtReqSentCounterSortDir != null) out.setPmtReqSentCounterSortDirection(PmtReqSentCounterSortDir);
    if (PmtReqSentCounterSortOrder != null) out.setPmtReqSentCounterSortOrder(PmtReqSentCounterSortOrder);

    Filter[] PmtReqSentCounterFilter = DataHelper.mapToFilterArray(PmtReqSentCounterMap, Integer.class);
    if (PmtReqSentCounterFilter != null) {
      IntegerFilter[] PmtReqSentCounterFilters = new IntegerFilter[PmtReqSentCounterFilter.length];
      for (int i = 0; i < PmtReqSentCounterFilters.length; i++) {
        PmtReqSentCounterFilters[i] = (IntegerFilter)PmtReqSentCounterFilter[i];
      }
      try {
        out.setPmtReqSentCounterFilter(PmtReqSentCounterFilters);
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
  
    Map RequestTypeMap = (Map)record.get("RequestType");
    Boolean RequestTypeFetch = DataHelper.getFetch(RequestTypeMap);
    Boolean RequestTypeSortDir = DataHelper.getSortDirection(RequestTypeMap);
    Integer RequestTypeSortOrder = DataHelper.getSortOrder(RequestTypeMap);
    if (RequestTypeFetch != null) out.setRequestTypeFetch(RequestTypeFetch);
    if (RequestTypeSortDir != null) out.setRequestTypeSortDirection(RequestTypeSortDir);
    if (RequestTypeSortOrder != null) out.setRequestTypeSortOrder(RequestTypeSortOrder);

    Filter[] RequestTypeFilter = DataHelper.mapToFilterArray(RequestTypeMap, Integer.class);
    if (RequestTypeFilter != null) {
      IntegerFilter[] RequestTypeFilters = new IntegerFilter[RequestTypeFilter.length];
      for (int i = 0; i < RequestTypeFilters.length; i++) {
        RequestTypeFilters[i] = (IntegerFilter)RequestTypeFilter[i];
      }
      try {
        out.setRequestTypeFilter(RequestTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RequestedServiceMap = (Map)record.get("RequestedService");
    Boolean RequestedServiceFetch = DataHelper.getFetch(RequestedServiceMap);
    Boolean RequestedServiceSortDir = DataHelper.getSortDirection(RequestedServiceMap);
    Integer RequestedServiceSortOrder = DataHelper.getSortOrder(RequestedServiceMap);
    if (RequestedServiceFetch != null) out.setRequestedServiceFetch(RequestedServiceFetch);
    if (RequestedServiceSortDir != null) out.setRequestedServiceSortDirection(RequestedServiceSortDir);
    if (RequestedServiceSortOrder != null) out.setRequestedServiceSortOrder(RequestedServiceSortOrder);

    Filter[] RequestedServiceFilter = DataHelper.mapToFilterArray(RequestedServiceMap, String.class);
    if (RequestedServiceFilter != null) {
      StringFilter[] RequestedServiceFilters = new StringFilter[RequestedServiceFilter.length];
      for (int i = 0; i < RequestedServiceFilters.length; i++) {
        RequestedServiceFilters[i] = (StringFilter)RequestedServiceFilter[i];
      }
      try {
        out.setRequestedServiceFilter(RequestedServiceFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map RequestIdMap = (Map)record.get("RequestId");
    Boolean RequestIdFetch = DataHelper.getFetch(RequestIdMap);
    Boolean RequestIdSortDir = DataHelper.getSortDirection(RequestIdMap);
    Integer RequestIdSortOrder = DataHelper.getSortOrder(RequestIdMap);
    if (RequestIdFetch != null) out.setRequestIdFetch(RequestIdFetch);
    if (RequestIdSortDir != null) out.setRequestIdSortDirection(RequestIdSortDir);
    if (RequestIdSortOrder != null) out.setRequestIdSortOrder(RequestIdSortOrder);

    Filter[] RequestIdFilter = DataHelper.mapToFilterArray(RequestIdMap, String.class);
    if (RequestIdFilter != null) {
      StringFilter[] RequestIdFilters = new StringFilter[RequestIdFilter.length];
      for (int i = 0; i < RequestIdFilters.length; i++) {
        RequestIdFilters[i] = (StringFilter)RequestIdFilter[i];
      }
      try {
        out.setRequestIdFilter(RequestIdFilters);
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
  
    Map EpgFlagMap = (Map)record.get("EpgFlag");
    Boolean EpgFlagFetch = DataHelper.getFetch(EpgFlagMap);
    Boolean EpgFlagSortDir = DataHelper.getSortDirection(EpgFlagMap);
    Integer EpgFlagSortOrder = DataHelper.getSortOrder(EpgFlagMap);
    if (EpgFlagFetch != null) out.setEpgFlagFetch(EpgFlagFetch);
    if (EpgFlagSortDir != null) out.setEpgFlagSortDirection(EpgFlagSortDir);
    if (EpgFlagSortOrder != null) out.setEpgFlagSortOrder(EpgFlagSortOrder);

    Filter[] EpgFlagFilter = DataHelper.mapToFilterArray(EpgFlagMap, String.class);
    if (EpgFlagFilter != null) {
      StringFilter[] EpgFlagFilters = new StringFilter[EpgFlagFilter.length];
      for (int i = 0; i < EpgFlagFilters.length; i++) {
        EpgFlagFilters[i] = (StringFilter)EpgFlagFilter[i];
      }
      try {
        out.setEpgFlagFilter(EpgFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EpgMessageMap = (Map)record.get("EpgMessage");
    Boolean EpgMessageFetch = DataHelper.getFetch(EpgMessageMap);
    Boolean EpgMessageSortDir = DataHelper.getSortDirection(EpgMessageMap);
    Integer EpgMessageSortOrder = DataHelper.getSortOrder(EpgMessageMap);
    if (EpgMessageFetch != null) out.setEpgMessageFetch(EpgMessageFetch);
    if (EpgMessageSortDir != null) out.setEpgMessageSortDirection(EpgMessageSortDir);
    if (EpgMessageSortOrder != null) out.setEpgMessageSortOrder(EpgMessageSortOrder);

    Filter[] EpgMessageFilter = DataHelper.mapToFilterArray(EpgMessageMap, String.class);
    if (EpgMessageFilter != null) {
      StringFilter[] EpgMessageFilters = new StringFilter[EpgMessageFilter.length];
      for (int i = 0; i < EpgMessageFilters.length; i++) {
        EpgMessageFilters[i] = (StringFilter)EpgMessageFilter[i];
      }
      try {
        out.setEpgMessageFilter(EpgMessageFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EftDebitProcTransIdMap = (Map)record.get("EftDebitProcTransId");
    Boolean EftDebitProcTransIdFetch = DataHelper.getFetch(EftDebitProcTransIdMap);
    Boolean EftDebitProcTransIdSortDir = DataHelper.getSortDirection(EftDebitProcTransIdMap);
    Integer EftDebitProcTransIdSortOrder = DataHelper.getSortOrder(EftDebitProcTransIdMap);
    if (EftDebitProcTransIdFetch != null) out.setEftDebitProcTransIdFetch(EftDebitProcTransIdFetch);
    if (EftDebitProcTransIdSortDir != null) out.setEftDebitProcTransIdSortDirection(EftDebitProcTransIdSortDir);
    if (EftDebitProcTransIdSortOrder != null) out.setEftDebitProcTransIdSortOrder(EftDebitProcTransIdSortOrder);

    Filter[] EftDebitProcTransIdFilter = DataHelper.mapToFilterArray(EftDebitProcTransIdMap, String.class);
    if (EftDebitProcTransIdFilter != null) {
      StringFilter[] EftDebitProcTransIdFilters = new StringFilter[EftDebitProcTransIdFilter.length];
      for (int i = 0; i < EftDebitProcTransIdFilters.length; i++) {
        EftDebitProcTransIdFilters[i] = (StringFilter)EftDebitProcTransIdFilter[i];
      }
      try {
        out.setEftDebitProcTransIdFilter(EftDebitProcTransIdFilters);
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
  
    Map IsRealtimeMap = (Map)record.get("IsRealtime");
    Boolean IsRealtimeFetch = DataHelper.getFetch(IsRealtimeMap);
    Boolean IsRealtimeSortDir = DataHelper.getSortDirection(IsRealtimeMap);
    Integer IsRealtimeSortOrder = DataHelper.getSortOrder(IsRealtimeMap);
    if (IsRealtimeFetch != null) out.setIsRealtimeFetch(IsRealtimeFetch);
    if (IsRealtimeSortDir != null) out.setIsRealtimeSortDirection(IsRealtimeSortDir);
    if (IsRealtimeSortOrder != null) out.setIsRealtimeSortOrder(IsRealtimeSortOrder);

    Filter[] IsRealtimeFilter = DataHelper.mapToFilterArray(IsRealtimeMap, Boolean.class);
    if (IsRealtimeFilter != null) {
      BooleanFilter[] IsRealtimeFilters = new BooleanFilter[IsRealtimeFilter.length];
      for (int i = 0; i < IsRealtimeFilters.length; i++) {
        IsRealtimeFilters[i] = (BooleanFilter)IsRealtimeFilter[i];
      }
      try {
        out.setIsRealtimeFilter(IsRealtimeFilters);
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
  
    Map OneoffCardnumMap = (Map)record.get("OneoffCardnum");
    Boolean OneoffCardnumFetch = DataHelper.getFetch(OneoffCardnumMap);
    Boolean OneoffCardnumSortDir = DataHelper.getSortDirection(OneoffCardnumMap);
    Integer OneoffCardnumSortOrder = DataHelper.getSortOrder(OneoffCardnumMap);
    if (OneoffCardnumFetch != null) out.setOneoffCardnumFetch(OneoffCardnumFetch);
    if (OneoffCardnumSortDir != null) out.setOneoffCardnumSortDirection(OneoffCardnumSortDir);
    if (OneoffCardnumSortOrder != null) out.setOneoffCardnumSortOrder(OneoffCardnumSortOrder);

    Filter[] OneoffCardnumFilter = DataHelper.mapToFilterArray(OneoffCardnumMap, String.class);
    if (OneoffCardnumFilter != null) {
      StringFilter[] OneoffCardnumFilters = new StringFilter[OneoffCardnumFilter.length];
      for (int i = 0; i < OneoffCardnumFilters.length; i++) {
        OneoffCardnumFilters[i] = (StringFilter)OneoffCardnumFilter[i];
      }
      try {
        out.setOneoffCardnumFilter(OneoffCardnumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DcardValStatusMap = (Map)record.get("DcardValStatus");
    Boolean DcardValStatusFetch = DataHelper.getFetch(DcardValStatusMap);
    Boolean DcardValStatusSortDir = DataHelper.getSortDirection(DcardValStatusMap);
    Integer DcardValStatusSortOrder = DataHelper.getSortOrder(DcardValStatusMap);
    if (DcardValStatusFetch != null) out.setDcardValStatusFetch(DcardValStatusFetch);
    if (DcardValStatusSortDir != null) out.setDcardValStatusSortDirection(DcardValStatusSortDir);
    if (DcardValStatusSortOrder != null) out.setDcardValStatusSortOrder(DcardValStatusSortOrder);

    Filter[] DcardValStatusFilter = DataHelper.mapToFilterArray(DcardValStatusMap, Integer.class);
    if (DcardValStatusFilter != null) {
      IntegerFilter[] DcardValStatusFilters = new IntegerFilter[DcardValStatusFilter.length];
      for (int i = 0; i < DcardValStatusFilters.length; i++) {
        DcardValStatusFilters[i] = (IntegerFilter)DcardValStatusFilter[i];
      }
      try {
        out.setDcardValStatusFilter(DcardValStatusFilters);
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
  
    return out;
  }
}
