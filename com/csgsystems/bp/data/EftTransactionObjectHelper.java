/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EftTransactionObjectHelper.java
 * Definition File: Customer/EftTransaction.xml
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



/** Helper class to convert EftTransactionObject JavaBean objects to/from HashMaps.
 */
public class EftTransactionObjectHelper implements ArubaObjectHelper
{
  /** convert EftTransactionObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (EftTransactionObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EftTransactionObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EftTransactionObject")
   * @return Map     the output Map
   */
  public static Map toMap (EftTransactionObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EftTransactionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert EftTransactionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (EftTransactionObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert EftTransactionObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "EftTransactionObject")
   * @return Map     the output Map
   */
  public static Map toMap (EftTransactionObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "EftTransactionObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to EftTransactionObjectData.
   * @param record the Map containing the data to convert to the object
   * @return EftTransactionObjectData the converted object
   */
  public static EftTransactionObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to EftTransactionObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "EftTransactionObject")
   * @return EftTransactionObjectData the converted object
   */
  public static EftTransactionObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EftTransactionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to EftTransactionObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return EftTransactionObjectFilter the converted object
   */
  public static EftTransactionObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to EftTransactionObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "EftTransactionObject")
   * @return EftTransactionObjectFilter the converted object
   */
  public static EftTransactionObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "EftTransactionObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to EftTransactionObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return EftTransactionObjectDataList the converted object
   */
  public static EftTransactionObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to EftTransactionObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "EftTransactionObjectList")
   * @return EftTransactionObjectDataList the converted object
   */
  public static EftTransactionObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "EftTransactionObjectList";
    Object[] root = (Object[]) record.get (rootName);
    EftTransactionObjectData[] array = null;
    if (root != null)
    {
      array = new EftTransactionObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = EftTransactionObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new EftTransactionObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new EftTransactionObjectDataList (array, index, total);
  }
  /** convert EftTransactionObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EftTransactionObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", EftTransactionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._BankAgencyNameSet) record.put ("BankAgencyName", in.BankAgencyName);
  
    if (in._BankAgencyCodeSet) record.put ("BankAgencyCode", in.BankAgencyCode);
  
    if (in._CustBankSortCodeSet) record.put ("CustBankSortCode", in.CustBankSortCode);
  
    if (in._CustBankAccNumSet) record.put ("CustBankAccNum", in.CustBankAccNum);
  
    if (in._OwnrLnameSet) record.put ("OwnrLname", in.OwnrLname);
  
    if (in._OwnrFnameSet) record.put ("OwnrFname", in.OwnrFname);
  
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
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._ResponseCodeSet) record.put ("ResponseCode", in.ResponseCode);
  
    if (in._ClearingHouseIdSet) record.put ("ClearingHouseId", in.ClearingHouseId);
  
    if (in._FileIdSet) record.put ("FileId", in.FileId);
  
    if (in._BmfTrackingIdSet) record.put ("BmfTrackingId", in.BmfTrackingId);
  
    if (in._BmfTrackingIdServSet) record.put ("BmfTrackingIdServ", in.BmfTrackingIdServ);
  
    if (in._OrigTrackingIdSet) record.put ("OrigTrackingId", in.OrigTrackingId);
  
    if (in._OrigTrackingIdServSet) record.put ("OrigTrackingIdServ", in.OrigTrackingIdServ);
  
    if (in._PmtReqSentCounterSet) record.put ("PmtReqSentCounter", in.PmtReqSentCounter);
  
    if (in._NoBillSet) record.put ("NoBill", in.NoBill);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._BillRefNoSet) record.put ("BillRefNo", in.BillRefNo);
  
    if (in._BillRefResetsSet) record.put ("BillRefResets", in.BillRefResets);
  
    if (in._PaymentDueDateSet) record.put ("PaymentDueDate", in.PaymentDueDate);
  
    if (in._StatementDateSet) record.put ("StatementDate", in.StatementDate);
  
    if (in._AmountSet) record.put ("Amount", in.Amount);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._EftTransTypeSet) record.put ("EftTransType", in.EftTransType);
  
    if (in._BmfTransTypeSet) record.put ("BmfTransType", in.BmfTransType);
  
    if (in._EftTransStatusSet) record.put ("EftTransStatus", in.EftTransStatus);
  
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
      return record;
  }
  /** convert EftTransactionObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (EftTransactionObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", EftTransactionObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.BankAgencyName, in.BankAgencyNameSort, in.BankAgencyNameSortAscending, in.BankAgencyNameFetch, in.BankAgencyNameCaseInsensitive);
      if (map != null) record.put ("BankAgencyName", map);
      map = DataHelper.filterToMap (in.BankAgencyCode, in.BankAgencyCodeSort, in.BankAgencyCodeSortAscending, in.BankAgencyCodeFetch, in.BankAgencyCodeCaseInsensitive);
      if (map != null) record.put ("BankAgencyCode", map);
      map = DataHelper.filterToMap (in.CustBankSortCode, in.CustBankSortCodeSort, in.CustBankSortCodeSortAscending, in.CustBankSortCodeFetch, in.CustBankSortCodeCaseInsensitive);
      if (map != null) record.put ("CustBankSortCode", map);
      map = DataHelper.filterToMap (in.CustBankAccNum, in.CustBankAccNumSort, in.CustBankAccNumSortAscending, in.CustBankAccNumFetch, in.CustBankAccNumCaseInsensitive);
      if (map != null) record.put ("CustBankAccNum", map);
      map = DataHelper.filterToMap (in.OwnrLname, in.OwnrLnameSort, in.OwnrLnameSortAscending, in.OwnrLnameFetch, in.OwnrLnameCaseInsensitive);
      if (map != null) record.put ("OwnrLname", map);
      map = DataHelper.filterToMap (in.OwnrFname, in.OwnrFnameSort, in.OwnrFnameSortAscending, in.OwnrFnameFetch, in.OwnrFnameCaseInsensitive);
      if (map != null) record.put ("OwnrFname", map);
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
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.ResponseCode, in.ResponseCodeSort, in.ResponseCodeSortAscending, in.ResponseCodeFetch, in.ResponseCodeCaseInsensitive);
      if (map != null) record.put ("ResponseCode", map);
      map = DataHelper.filterToMap (in.ClearingHouseId, in.ClearingHouseIdSort, in.ClearingHouseIdSortAscending, in.ClearingHouseIdFetch, in.ClearingHouseIdCaseInsensitive);
      if (map != null) record.put ("ClearingHouseId", map);
      map = DataHelper.filterToMap (in.FileId, in.FileIdSort, in.FileIdSortAscending, in.FileIdFetch);
      if (map != null) record.put ("FileId", map);
      map = DataHelper.filterToMap (in.BmfTrackingId, in.BmfTrackingIdSort, in.BmfTrackingIdSortAscending, in.BmfTrackingIdFetch);
      if (map != null) record.put ("BmfTrackingId", map);
      map = DataHelper.filterToMap (in.BmfTrackingIdServ, in.BmfTrackingIdServSort, in.BmfTrackingIdServSortAscending, in.BmfTrackingIdServFetch);
      if (map != null) record.put ("BmfTrackingIdServ", map);
      map = DataHelper.filterToMap (in.OrigTrackingId, in.OrigTrackingIdSort, in.OrigTrackingIdSortAscending, in.OrigTrackingIdFetch);
      if (map != null) record.put ("OrigTrackingId", map);
      map = DataHelper.filterToMap (in.OrigTrackingIdServ, in.OrigTrackingIdServSort, in.OrigTrackingIdServSortAscending, in.OrigTrackingIdServFetch);
      if (map != null) record.put ("OrigTrackingIdServ", map);
      map = DataHelper.filterToMap (in.PmtReqSentCounter, in.PmtReqSentCounterSort, in.PmtReqSentCounterSortAscending, in.PmtReqSentCounterFetch);
      if (map != null) record.put ("PmtReqSentCounter", map);
      map = DataHelper.filterToMap (in.NoBill, in.NoBillSort, in.NoBillSortAscending, in.NoBillFetch);
      if (map != null) record.put ("NoBill", map);
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
      map = DataHelper.filterToMap (in.EftTransType, in.EftTransTypeSort, in.EftTransTypeSortAscending, in.EftTransTypeFetch);
      if (map != null) record.put ("EftTransType", map);
      map = DataHelper.filterToMap (in.BmfTransType, in.BmfTransTypeSort, in.BmfTransTypeSortAscending, in.BmfTransTypeFetch);
      if (map != null) record.put ("BmfTransType", map);
      map = DataHelper.filterToMap (in.EftTransStatus, in.EftTransStatusSort, in.EftTransStatusSortAscending, in.EftTransStatusFetch);
      if (map != null) record.put ("EftTransStatus", map);
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
    return record;
  }
  /** convert Map to EftTransactionObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EftTransactionObjectData the converted object
   */
  public static EftTransactionObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EftTransactionObjectData out = new EftTransactionObjectData ();

    out.Key = EftTransactionObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("BankAgencyName")) != null)
    {
      out.BankAgencyName = (String) obj;
    }
  
    if ((obj = record.get ("BankAgencyCode")) != null)
    {
      out.BankAgencyCode = (String) obj;
    }
  
    if ((obj = record.get ("CustBankSortCode")) != null)
    {
      out.CustBankSortCode = (String) obj;
    }
  
    if ((obj = record.get ("CustBankAccNum")) != null)
    {
      out.CustBankAccNum = (String) obj;
    }
  
    if ((obj = record.get ("OwnrLname")) != null)
    {
      out.OwnrLname = (String) obj;
    }
  
    if ((obj = record.get ("OwnrFname")) != null)
    {
      out.OwnrFname = (String) obj;
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
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("ResponseCode")) != null)
    {
      out.ResponseCode = (String) obj;
    }
  
    if ((obj = record.get ("ClearingHouseId")) != null)
    {
      out.ClearingHouseId = (String) obj;
    }
  
    if ((obj = record.get ("FileId")) != null)
    {
      out.FileId = (Integer) obj;
    }
  
    if ((obj = record.get ("BmfTrackingId")) != null)
    {
      out.BmfTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("BmfTrackingIdServ")) != null)
    {
      out.BmfTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingId")) != null)
    {
      out.OrigTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigTrackingIdServ")) != null)
    {
      out.OrigTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("PmtReqSentCounter")) != null)
    {
      out.PmtReqSentCounter = (Integer) obj;
    }
  
    if ((obj = record.get ("NoBill")) != null)
    {
      out.NoBill = (Boolean) obj;
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
  
    if ((obj = record.get ("EftTransType")) != null)
    {
      out.EftTransType = (Integer) obj;
    }
  
    if ((obj = record.get ("BmfTransType")) != null)
    {
      out.BmfTransType = (Integer) obj;
    }
  
    if ((obj = record.get ("EftTransStatus")) != null)
    {
      out.EftTransStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountExternalId")) != null)
    {
      out.AccountExternalId = (String) obj;
    }
  
    if ((obj = record.get ("AccountExternalIdType")) != null)
    {
      out.AccountExternalIdType = (Integer) obj;
    }
      return out;
  }
  /** convert Map to EftTransactionObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return EftTransactionObjectFilter the converted object
   */
  public static EftTransactionObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    EftTransactionObjectFilter out = new EftTransactionObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = EftTransactionObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map BmfTrackingIdMap = (Map)record.get("BmfTrackingId");
    Boolean BmfTrackingIdFetch = DataHelper.getFetch(BmfTrackingIdMap);
    Boolean BmfTrackingIdSortDir = DataHelper.getSortDirection(BmfTrackingIdMap);
    Integer BmfTrackingIdSortOrder = DataHelper.getSortOrder(BmfTrackingIdMap);
    if (BmfTrackingIdFetch != null) out.setBmfTrackingIdFetch(BmfTrackingIdFetch);
    if (BmfTrackingIdSortDir != null) out.setBmfTrackingIdSortDirection(BmfTrackingIdSortDir);
    if (BmfTrackingIdSortOrder != null) out.setBmfTrackingIdSortOrder(BmfTrackingIdSortOrder);

    Filter[] BmfTrackingIdFilter = DataHelper.mapToFilterArray(BmfTrackingIdMap, Integer.class);
    if (BmfTrackingIdFilter != null) {
      IntegerFilter[] BmfTrackingIdFilters = new IntegerFilter[BmfTrackingIdFilter.length];
      for (int i = 0; i < BmfTrackingIdFilters.length; i++) {
        BmfTrackingIdFilters[i] = (IntegerFilter)BmfTrackingIdFilter[i];
      }
      try {
        out.setBmfTrackingIdFilter(BmfTrackingIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BmfTrackingIdServMap = (Map)record.get("BmfTrackingIdServ");
    Boolean BmfTrackingIdServFetch = DataHelper.getFetch(BmfTrackingIdServMap);
    Boolean BmfTrackingIdServSortDir = DataHelper.getSortDirection(BmfTrackingIdServMap);
    Integer BmfTrackingIdServSortOrder = DataHelper.getSortOrder(BmfTrackingIdServMap);
    if (BmfTrackingIdServFetch != null) out.setBmfTrackingIdServFetch(BmfTrackingIdServFetch);
    if (BmfTrackingIdServSortDir != null) out.setBmfTrackingIdServSortDirection(BmfTrackingIdServSortDir);
    if (BmfTrackingIdServSortOrder != null) out.setBmfTrackingIdServSortOrder(BmfTrackingIdServSortOrder);

    Filter[] BmfTrackingIdServFilter = DataHelper.mapToFilterArray(BmfTrackingIdServMap, Integer.class);
    if (BmfTrackingIdServFilter != null) {
      IntegerFilter[] BmfTrackingIdServFilters = new IntegerFilter[BmfTrackingIdServFilter.length];
      for (int i = 0; i < BmfTrackingIdServFilters.length; i++) {
        BmfTrackingIdServFilters[i] = (IntegerFilter)BmfTrackingIdServFilter[i];
      }
      try {
        out.setBmfTrackingIdServFilter(BmfTrackingIdServFilters);
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
  
    Map EftTransTypeMap = (Map)record.get("EftTransType");
    Boolean EftTransTypeFetch = DataHelper.getFetch(EftTransTypeMap);
    Boolean EftTransTypeSortDir = DataHelper.getSortDirection(EftTransTypeMap);
    Integer EftTransTypeSortOrder = DataHelper.getSortOrder(EftTransTypeMap);
    if (EftTransTypeFetch != null) out.setEftTransTypeFetch(EftTransTypeFetch);
    if (EftTransTypeSortDir != null) out.setEftTransTypeSortDirection(EftTransTypeSortDir);
    if (EftTransTypeSortOrder != null) out.setEftTransTypeSortOrder(EftTransTypeSortOrder);

    Filter[] EftTransTypeFilter = DataHelper.mapToFilterArray(EftTransTypeMap, Integer.class);
    if (EftTransTypeFilter != null) {
      IntegerFilter[] EftTransTypeFilters = new IntegerFilter[EftTransTypeFilter.length];
      for (int i = 0; i < EftTransTypeFilters.length; i++) {
        EftTransTypeFilters[i] = (IntegerFilter)EftTransTypeFilter[i];
      }
      try {
        out.setEftTransTypeFilter(EftTransTypeFilters);
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
  
    Map EftTransStatusMap = (Map)record.get("EftTransStatus");
    Boolean EftTransStatusFetch = DataHelper.getFetch(EftTransStatusMap);
    Boolean EftTransStatusSortDir = DataHelper.getSortDirection(EftTransStatusMap);
    Integer EftTransStatusSortOrder = DataHelper.getSortOrder(EftTransStatusMap);
    if (EftTransStatusFetch != null) out.setEftTransStatusFetch(EftTransStatusFetch);
    if (EftTransStatusSortDir != null) out.setEftTransStatusSortDirection(EftTransStatusSortDir);
    if (EftTransStatusSortOrder != null) out.setEftTransStatusSortOrder(EftTransStatusSortOrder);

    Filter[] EftTransStatusFilter = DataHelper.mapToFilterArray(EftTransStatusMap, Integer.class);
    if (EftTransStatusFilter != null) {
      IntegerFilter[] EftTransStatusFilters = new IntegerFilter[EftTransStatusFilter.length];
      for (int i = 0; i < EftTransStatusFilters.length; i++) {
        EftTransStatusFilters[i] = (IntegerFilter)EftTransStatusFilter[i];
      }
      try {
        out.setEftTransStatusFilter(EftTransStatusFilters);
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
  
    return out;
  }
}
