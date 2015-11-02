/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnappliedPaymentObjectHelper.java
 * Definition File: Customer/UnappliedPayment.xml
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



/** Helper class to convert UnappliedPaymentObject JavaBean objects to/from HashMaps.
 */
public class UnappliedPaymentObjectHelper implements ArubaObjectHelper
{
  /** convert UnappliedPaymentObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (UnappliedPaymentObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnappliedPaymentObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnappliedPaymentObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnappliedPaymentObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnappliedPaymentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert UnappliedPaymentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (UnappliedPaymentObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert UnappliedPaymentObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "UnappliedPaymentObject")
   * @return Map     the output Map
   */
  public static Map toMap (UnappliedPaymentObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "UnappliedPaymentObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to UnappliedPaymentObjectData.
   * @param record the Map containing the data to convert to the object
   * @return UnappliedPaymentObjectData the converted object
   */
  public static UnappliedPaymentObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to UnappliedPaymentObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "UnappliedPaymentObject")
   * @return UnappliedPaymentObjectData the converted object
   */
  public static UnappliedPaymentObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnappliedPaymentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to UnappliedPaymentObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return UnappliedPaymentObjectFilter the converted object
   */
  public static UnappliedPaymentObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to UnappliedPaymentObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "UnappliedPaymentObject")
   * @return UnappliedPaymentObjectFilter the converted object
   */
  public static UnappliedPaymentObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "UnappliedPaymentObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to UnappliedPaymentObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return UnappliedPaymentObjectDataList the converted object
   */
  public static UnappliedPaymentObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to UnappliedPaymentObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "UnappliedPaymentObjectList")
   * @return UnappliedPaymentObjectDataList the converted object
   */
  public static UnappliedPaymentObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "UnappliedPaymentObjectList";
    Object[] root = (Object[]) record.get (rootName);
    UnappliedPaymentObjectData[] array = null;
    if (root != null)
    {
      array = new UnappliedPaymentObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = UnappliedPaymentObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new UnappliedPaymentObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new UnappliedPaymentObjectDataList (array, index, total);
  }
  /** convert UnappliedPaymentObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnappliedPaymentObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", UnappliedPaymentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountExternalIdSet) record.put ("AccountExternalId", in.AccountExternalId);
  
    if (in._AccountExternalIdTypeSet) record.put ("AccountExternalIdType", in.AccountExternalIdType);
  
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._AppliedStatusSet) record.put ("AppliedStatus", in.AppliedStatus);
  
    if (in._BmfTrackingIdSet) record.put ("BmfTrackingId", in.BmfTrackingId);
  
    if (in._BmfTrackingIdServSet) record.put ("BmfTrackingIdServ", in.BmfTrackingIdServ);
  
    if (in._BmfErrorTextSet) record.put ("BmfErrorText", in.BmfErrorText);
  
    if (in._OrigBillRefNoSet) record.put ("OrigBillRefNo", in.OrigBillRefNo);
  
    if (in._OrigBillRefResetsSet) record.put ("OrigBillRefResets", in.OrigBillRefResets);
  
    if (in._CrNoteBillRefNoSet) record.put ("CrNoteBillRefNo", in.CrNoteBillRefNo);
  
    if (in._CrNoteBillRefResetsSet) record.put ("CrNoteBillRefResets", in.CrNoteBillRefResets);
  
    if (in._BmfTransTypeSet) record.put ("BmfTransType", in.BmfTransType);
  
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
  
    if (in._ActionCodeSet) record.put ("ActionCode", in.ActionCode);
  
    if (in._ProfileIdSet) record.put ("ProfileId", in.ProfileId);
  
    if (in._MicrBankIdSet) record.put ("MicrBankId", in.MicrBankId);
  
    if (in._MicrDdaNumSet) record.put ("MicrDdaNum", in.MicrDdaNum);
  
    if (in._MicrCheckNumSet) record.put ("MicrCheckNum", in.MicrCheckNum);
  
    if (in._ArchFlagSet) record.put ("ArchFlag", in.ArchFlag);
  
    if (in._ManualCcauthCodeSet) record.put ("ManualCcauthCode", in.ManualCcauthCode);
  
    if (in._ManualCcauthDateSet) record.put ("ManualCcauthDate", in.ManualCcauthDate);
  
    if (in._FileIdSet) record.put ("FileId", in.FileId);
  
    if (in._ResponseCodeSet) record.put ("ResponseCode", in.ResponseCode);
  
    if (in._BillOrderNumberSet) record.put ("BillOrderNumber", in.BillOrderNumber);
  
    if (in._ExternalAmountSet) record.put ("ExternalAmount", in.ExternalAmount);
  
    if (in._ExternalCurrencySet) record.put ("ExternalCurrency", in.ExternalCurrency);
  
    if (in._OpenItemIdSet) record.put ("OpenItemId", in.OpenItemId);
  
    if (in._AnnotationSet) record.put ("Annotation", in.Annotation);
      return record;
  }
  /** convert UnappliedPaymentObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (UnappliedPaymentObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", UnappliedPaymentObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountExternalId, in.AccountExternalIdSort, in.AccountExternalIdSortAscending, in.AccountExternalIdFetch, in.AccountExternalIdCaseInsensitive);
      if (map != null) record.put ("AccountExternalId", map);
      map = DataHelper.filterToMap (in.AccountExternalIdType, in.AccountExternalIdTypeSort, in.AccountExternalIdTypeSortAscending, in.AccountExternalIdTypeFetch);
      if (map != null) record.put ("AccountExternalIdType", map);
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.AppliedStatus, in.AppliedStatusSort, in.AppliedStatusSortAscending, in.AppliedStatusFetch);
      if (map != null) record.put ("AppliedStatus", map);
      map = DataHelper.filterToMap (in.BmfTrackingId, in.BmfTrackingIdSort, in.BmfTrackingIdSortAscending, in.BmfTrackingIdFetch);
      if (map != null) record.put ("BmfTrackingId", map);
      map = DataHelper.filterToMap (in.BmfTrackingIdServ, in.BmfTrackingIdServSort, in.BmfTrackingIdServSortAscending, in.BmfTrackingIdServFetch);
      if (map != null) record.put ("BmfTrackingIdServ", map);
      map = DataHelper.filterToMap (in.BmfErrorText, in.BmfErrorTextSort, in.BmfErrorTextSortAscending, in.BmfErrorTextFetch, in.BmfErrorTextCaseInsensitive);
      if (map != null) record.put ("BmfErrorText", map);
      map = DataHelper.filterToMap (in.OrigBillRefNo, in.OrigBillRefNoSort, in.OrigBillRefNoSortAscending, in.OrigBillRefNoFetch);
      if (map != null) record.put ("OrigBillRefNo", map);
      map = DataHelper.filterToMap (in.OrigBillRefResets, in.OrigBillRefResetsSort, in.OrigBillRefResetsSortAscending, in.OrigBillRefResetsFetch);
      if (map != null) record.put ("OrigBillRefResets", map);
      map = DataHelper.filterToMap (in.CrNoteBillRefNo, in.CrNoteBillRefNoSort, in.CrNoteBillRefNoSortAscending, in.CrNoteBillRefNoFetch);
      if (map != null) record.put ("CrNoteBillRefNo", map);
      map = DataHelper.filterToMap (in.CrNoteBillRefResets, in.CrNoteBillRefResetsSort, in.CrNoteBillRefResetsSortAscending, in.CrNoteBillRefResetsFetch);
      if (map != null) record.put ("CrNoteBillRefResets", map);
      map = DataHelper.filterToMap (in.BmfTransType, in.BmfTransTypeSort, in.BmfTransTypeSortAscending, in.BmfTransTypeFetch);
      if (map != null) record.put ("BmfTransType", map);
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
      map = DataHelper.filterToMap (in.ActionCode, in.ActionCodeSort, in.ActionCodeSortAscending, in.ActionCodeFetch, in.ActionCodeCaseInsensitive);
      if (map != null) record.put ("ActionCode", map);
      map = DataHelper.filterToMap (in.ProfileId, in.ProfileIdSort, in.ProfileIdSortAscending, in.ProfileIdFetch);
      if (map != null) record.put ("ProfileId", map);
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
      map = DataHelper.filterToMap (in.Annotation, in.AnnotationSort, in.AnnotationSortAscending, in.AnnotationFetch, in.AnnotationCaseInsensitive);
      if (map != null) record.put ("Annotation", map);
    return record;
  }
  /** convert Map to UnappliedPaymentObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnappliedPaymentObjectData the converted object
   */
  public static UnappliedPaymentObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnappliedPaymentObjectData out = new UnappliedPaymentObjectData ();

    out.Key = UnappliedPaymentObjectKeyHelper.getObj ((Map) record.get ("Key"));
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
  
    if ((obj = record.get ("AppliedStatus")) != null)
    {
      out.AppliedStatus = (Boolean) obj;
    }
  
    if ((obj = record.get ("BmfTrackingId")) != null)
    {
      out.BmfTrackingId = (Integer) obj;
    }
  
    if ((obj = record.get ("BmfTrackingIdServ")) != null)
    {
      out.BmfTrackingIdServ = (Integer) obj;
    }
  
    if ((obj = record.get ("BmfErrorText")) != null)
    {
      out.BmfErrorText = (String) obj;
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
  
    if ((obj = record.get ("BmfTransType")) != null)
    {
      out.BmfTransType = (Integer) obj;
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
  
    if ((obj = record.get ("ActionCode")) != null)
    {
      out.ActionCode = (String) obj;
    }
  
    if ((obj = record.get ("ProfileId")) != null)
    {
      out.ProfileId = (BigInteger) obj;
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
  
    if ((obj = record.get ("Annotation")) != null)
    {
      out.Annotation = (String) obj;
    }
      return out;
  }
  /** convert Map to UnappliedPaymentObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return UnappliedPaymentObjectFilter the converted object
   */
  public static UnappliedPaymentObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    UnappliedPaymentObjectFilter out = new UnappliedPaymentObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = UnappliedPaymentObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map AppliedStatusMap = (Map)record.get("AppliedStatus");
    Boolean AppliedStatusFetch = DataHelper.getFetch(AppliedStatusMap);
    Boolean AppliedStatusSortDir = DataHelper.getSortDirection(AppliedStatusMap);
    Integer AppliedStatusSortOrder = DataHelper.getSortOrder(AppliedStatusMap);
    if (AppliedStatusFetch != null) out.setAppliedStatusFetch(AppliedStatusFetch);
    if (AppliedStatusSortDir != null) out.setAppliedStatusSortDirection(AppliedStatusSortDir);
    if (AppliedStatusSortOrder != null) out.setAppliedStatusSortOrder(AppliedStatusSortOrder);

    Filter[] AppliedStatusFilter = DataHelper.mapToFilterArray(AppliedStatusMap, Boolean.class);
    if (AppliedStatusFilter != null) {
      BooleanFilter[] AppliedStatusFilters = new BooleanFilter[AppliedStatusFilter.length];
      for (int i = 0; i < AppliedStatusFilters.length; i++) {
        AppliedStatusFilters[i] = (BooleanFilter)AppliedStatusFilter[i];
      }
      try {
        out.setAppliedStatusFilter(AppliedStatusFilters);
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
  
    Map BmfErrorTextMap = (Map)record.get("BmfErrorText");
    Boolean BmfErrorTextFetch = DataHelper.getFetch(BmfErrorTextMap);
    Boolean BmfErrorTextSortDir = DataHelper.getSortDirection(BmfErrorTextMap);
    Integer BmfErrorTextSortOrder = DataHelper.getSortOrder(BmfErrorTextMap);
    if (BmfErrorTextFetch != null) out.setBmfErrorTextFetch(BmfErrorTextFetch);
    if (BmfErrorTextSortDir != null) out.setBmfErrorTextSortDirection(BmfErrorTextSortDir);
    if (BmfErrorTextSortOrder != null) out.setBmfErrorTextSortOrder(BmfErrorTextSortOrder);

    Filter[] BmfErrorTextFilter = DataHelper.mapToFilterArray(BmfErrorTextMap, String.class);
    if (BmfErrorTextFilter != null) {
      StringFilter[] BmfErrorTextFilters = new StringFilter[BmfErrorTextFilter.length];
      for (int i = 0; i < BmfErrorTextFilters.length; i++) {
        BmfErrorTextFilters[i] = (StringFilter)BmfErrorTextFilter[i];
      }
      try {
        out.setBmfErrorTextFilter(BmfErrorTextFilters);
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
  
    return out;
  }
}
