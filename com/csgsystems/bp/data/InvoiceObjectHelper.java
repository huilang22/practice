/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InvoiceObjectHelper.java
 * Definition File: Customer/Invoice.xml
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


/** Helper class to convert InvoiceObject JavaBean objects to/from HashMaps.
 */
public class InvoiceObjectHelper implements ArubaObjectHelper
{
  /** convert InvoiceObjectData to a Map.
   * @param in     the object to convert to the Map
   * @param record use this Map instead of creating a new one (Optional)
   * @return Map   the output Map
   */
  public static Map toMap (InvoiceObjectData in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceObjectData to a Map.
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceObjectData in, Map record, String rootName)
  {
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    return record;
  }
  /** convert InvoiceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceObjectFilter in, Map record)
  {
    return toMap (in, record, null);
  }
  /** convert InvoiceObjectFilter to a Map.
   * @param in       the filter object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @param rootName use this name as the root name for the object (defaults to "InvoiceObject")
   * @return Map     the output Map
   */
  public static Map toMap (InvoiceObjectFilter in, Map record, String rootName)
  {
    Integer iVal = null;
    if (record == null) record = new HashMap ();
    if (rootName == null) rootName = "InvoiceObject";
    Map map = getMap (in, (Map) record.get (rootName));
    record.put (rootName, map);
    if ((iVal = in.getIndex ()) != null) record.put ("Index", iVal);
    return record;
  }
  /** convert Map to InvoiceObjectData.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceObjectData the converted object
   */
  public static InvoiceObjectData fromMap (Map record)
  {
    return fromMap (record, null);
  }
  /** convert Map to InvoiceObjectData.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the mape (defaults to "InvoiceObject")
   * @return InvoiceObjectData the converted object
   */
  public static InvoiceObjectData fromMap (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getObj (root);
  }
  /** convert Map to InvoiceObjectFilter.
   * @param record the Map containing the data to convert to the object
   * @return InvoiceObjectFilter the converted object
   */
  public static InvoiceObjectFilter fromMapFilter (Map record) {
    return fromMapFilter (record, null);
  }
  /** convert Map to InvoiceObjectFilter.
   * @param record   the Map containing the data to convert to the object
   * @param rootName the root name of the object in the map (defaults to "InvoiceObject")
   * @return InvoiceObjectFilter the converted object
   */
  public static InvoiceObjectFilter fromMapFilter (Map record, String rootName) {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceObject";
    Map root = (Map) record.get (rootName);
    if (root == null) return null;
    return getFilter (root);
  }
  /** convert Map to InvoiceObjectDataList.
   * @param record   the Map containing the data to convert to the list
   * @return InvoiceObjectDataList the converted object
   */
  public static InvoiceObjectDataList fromMapList (Map record)
  {
    return fromMapList (record, null);
  }
  /** convert Map to InvoiceObjectDataList.
   * @param record   the Map containing the data to convert to thelist 
   * @param rootName the root name of the object in the mape (defaults to "InvoiceObjectList")
   * @return InvoiceObjectDataList the converted object
   */
  public static InvoiceObjectDataList fromMapList (Map record, String rootName)
  {
    if (record == null) return null;
    if (rootName == null) rootName = "InvoiceObjectList";
    Object[] root = (Object[]) record.get (rootName);
    InvoiceObjectData[] array = null;
    if (root != null)
    {
      array = new InvoiceObjectData[root.length];
      for (int i = 0; i < root.length; i++)
      {
        array[i] = InvoiceObjectHelper.getObj ((Map) root[i]);
      }
    }
    else
    {
      array = new InvoiceObjectData[0];
    }
    Integer count = (Integer) record.get ("Count");
    Integer index = (Integer) record.get ("Index");
    Integer total = (Integer) record.get ("TotalCount");
    return new InvoiceObjectDataList (array, index, total);
  }
  /** convert InvoiceObjectData to a Map (not including the root).
   * @param in       the object to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceObjectData in, Map record)
  {
    Object[] list = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;

    if (in.Key != null) record.put ("Key", InvoiceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
    if (in._AccountInternalIdSet) record.put ("AccountInternalId", in.AccountInternalId);
  
    if (in._CurrencyCodeSet) record.put ("CurrencyCode", in.CurrencyCode);
  
    if (in._PayDueDateSet) record.put ("PayDueDate", in.PayDueDate);
  
    if (in._OrigPayDueDateSet) record.put ("OrigPayDueDate", in.OrigPayDueDate);
  
    if (in._ClosedDateSet) record.put ("ClosedDate", in.ClosedDate);
  
    if (in._NewChargesSet) record.put ("NewCharges", in.NewCharges);
  
    if (in._NetNewChargesSet) record.put ("NetNewCharges", in.NetNewCharges);
  
    if (in._TotalDueSet) record.put ("TotalDue", in.TotalDue);
  
    if (in._TotalAdjSet) record.put ("TotalAdj", in.TotalAdj);
  
    if (in._TotalPaidSet) record.put ("TotalPaid", in.TotalPaid);
  
    if (in._BalanceDueSet) record.put ("BalanceDue", in.BalanceDue);
  
    if (in._DisputeAmtSet) record.put ("DisputeAmt", in.DisputeAmt);
  
    if (in._LateExemptChargesSet) record.put ("LateExemptCharges", in.LateExemptCharges);
  
    if (in._CollectionIndicatorSet) record.put ("CollectionIndicator", in.CollectionIndicator);
  
    if (in._ChgDateSet) record.put ("ChgDate", in.ChgDate);
  
    if (in._ChgWhoSet) record.put ("ChgWho", in.ChgWho);
  
    if (in._GlAmountSet) record.put ("GlAmount", in.GlAmount);
  
    if (in._BalanceConvertedSet) record.put ("BalanceConverted", in.BalanceConverted);
  
    if (in._NewChargeCreditsSet) record.put ("NewChargeCredits", in.NewChargeCredits);
  
    if (in._BillSequenceNumSet) record.put ("BillSequenceNum", in.BillSequenceNum);
  
    if (in._ProcessNumSet) record.put ("ProcessNum", in.ProcessNum);
  
    if (in._PrevBillRefnoSet) record.put ("PrevBillRefno", in.PrevBillRefno);
  
    if (in._PrevBillRefResetsSet) record.put ("PrevBillRefResets", in.PrevBillRefResets);
  
    if (in._PrevBalanceRefnoSet) record.put ("PrevBalanceRefno", in.PrevBalanceRefno);
  
    if (in._PrevBalanceRefResetsSet) record.put ("PrevBalanceRefResets", in.PrevBalanceRefResets);
  
    if (in._ZipSet) record.put ("Zip", in.Zip);
  
    if (in._FromDateSet) record.put ("FromDate", in.FromDate);
  
    if (in._ToDateSet) record.put ("ToDate", in.ToDate);
  
    if (in._NextToDateSet) record.put ("NextToDate", in.NextToDate);
  
    if (in._PrepDateSet) record.put ("PrepDate", in.PrepDate);
  
    if (in._TaxDateSet) record.put ("TaxDate", in.TaxDate);
  
    if (in._StatementDateSet) record.put ("StatementDate", in.StatementDate);
  
    if (in._PaymentDueDateSet) record.put ("PaymentDueDate", in.PaymentDueDate);
  
    if (in._PrevPpddSet) record.put ("PrevPpdd", in.PrevPpdd);
  
    if (in._PrevCutoffDateSet) record.put ("PrevCutoffDate", in.PrevCutoffDate);
  
    if (in._BillPeriodSet) record.put ("BillPeriod", in.BillPeriod);
  
    if (in._PayMethodSet) record.put ("PayMethod", in.PayMethod);
  
    if (in._BillDispMethSet) record.put ("BillDispMeth", in.BillDispMeth);
  
    if (in._TaxJournalStatusSet) record.put ("TaxJournalStatus", in.TaxJournalStatus);
  
    if (in._AccountStatusSet) record.put ("AccountStatus", in.AccountStatus);
  
    if (in._ImageReqSet) record.put ("ImageReq", in.ImageReq);
  
    if (in._ImageDoneSet) record.put ("ImageDone", in.ImageDone);
  
    if (in._SpecialCodeSet) record.put ("SpecialCode", in.SpecialCode);
  
    if (in._PrepTaskSet) record.put ("PrepTask", in.PrepTask);
  
    if (in._PrepStatusSet) record.put ("PrepStatus", in.PrepStatus);
  
    if (in._FormatStatusSet) record.put ("FormatStatus", in.FormatStatus);
  
    if (in._DispatchCountSet) record.put ("DispatchCount", in.DispatchCount);
  
    if (in._DispatchDateSet) record.put ("DispatchDate", in.DispatchDate);
  
    if (in._FileNameSet) record.put ("FileName", in.FileName);
  
    if (in._StartOffsetSet) record.put ("StartOffset", in.StartOffset);
  
    if (in._EndOffsetSet) record.put ("EndOffset", in.EndOffset);
  
    if (in._PageCountSet) record.put ("PageCount", in.PageCount);
  
    if (in._BillHoldCodeSet) record.put ("BillHoldCode", in.BillHoldCode);
  
    if (in._PrepErrorCodeSet) record.put ("PrepErrorCode", in.PrepErrorCode);
  
    if (in._FormatErrorCodeSet) record.put ("FormatErrorCode", in.FormatErrorCode);
  
    if (in._BackoutStatusSet) record.put ("BackoutStatus", in.BackoutStatus);
  
    if (in._CopyTypeSet) record.put ("CopyType", in.CopyType);
  
    if (in._OrigBillRefnoSet) record.put ("OrigBillRefno", in.OrigBillRefno);
  
    if (in._OrigBillRefResetsSet) record.put ("OrigBillRefResets", in.OrigBillRefResets);
  
    if (in._CollectionHistorySet) record.put ("CollectionHistory", in.CollectionHistory);
  
    if (in._JnlEarnedThruDtSet) record.put ("JnlEarnedThruDt", in.JnlEarnedThruDt);
  
    if (in._JnlStatusSet) record.put ("JnlStatus", in.JnlStatus);
  
    if (in._TestFlagSet) record.put ("TestFlag", in.TestFlag);
  
    if (in._ArchFlagSet) record.put ("ArchFlag", in.ArchFlag);
  
    if (in._InterimBillFlagSet) record.put ("InterimBillFlag", in.InterimBillFlag);
  
    if (in._IncludeNrcSet) record.put ("IncludeNrc", in.IncludeNrc);
  
    if (in._IncludeRcSet) record.put ("IncludeRc", in.IncludeRc);
  
    if (in._IncludeAdjSet) record.put ("IncludeAdj", in.IncludeAdj);
  
    if (in._IncludeUsageSet) record.put ("IncludeUsage", in.IncludeUsage);
  
    if (in._IncludePaymentSet) record.put ("IncludePayment", in.IncludePayment);
  
    if (in._LanguageCodeSet) record.put ("LanguageCode", in.LanguageCode);
  
    if (in._BillConvertedSet) record.put ("BillConverted", in.BillConverted);
  
    if (in._WarmBillFlagSet) record.put ("WarmBillFlag", in.WarmBillFlag);
  
    if (in._BillOrderNumberSet) record.put ("BillOrderNumber", in.BillOrderNumber);
  
    if (in._BillFmtOptSet) record.put ("BillFmtOpt", in.BillFmtOpt);
  
    if (in._DocumentServerIdSet) record.put ("DocumentServerId", in.DocumentServerId);
      return record;
  }
  /** convert InvoiceObjectFilter to a Map (not including the root).
   * @param in       the filter to convert to the Map
   * @param record   use this Map instead of creating a new one (Optional)
   * @return Map     the output Map
   */
  public static Map getMap (InvoiceObjectFilter in, Map record)
  {
    Object[] list = null;
    Map map = null;
    if (record == null) record = new HashMap ();
    if (in == null) return record;
    if (in._fetch) record.put ("Fetch", Boolean.TRUE);

    if (in.Key != null) record.put ("Key", InvoiceObjectKeyHelper.getMap (in.Key, (Map) record.get ("Key")));
      map = DataHelper.filterToMap (in.AccountInternalId, in.AccountInternalIdSort, in.AccountInternalIdSortAscending, in.AccountInternalIdFetch);
      if (map != null) record.put ("AccountInternalId", map);
      map = DataHelper.filterToMap (in.CurrencyCode, in.CurrencyCodeSort, in.CurrencyCodeSortAscending, in.CurrencyCodeFetch);
      if (map != null) record.put ("CurrencyCode", map);
      map = DataHelper.filterToMap (in.PayDueDate, in.PayDueDateSort, in.PayDueDateSortAscending, in.PayDueDateFetch);
      if (map != null) record.put ("PayDueDate", map);
      map = DataHelper.filterToMap (in.OrigPayDueDate, in.OrigPayDueDateSort, in.OrigPayDueDateSortAscending, in.OrigPayDueDateFetch);
      if (map != null) record.put ("OrigPayDueDate", map);
      map = DataHelper.filterToMap (in.ClosedDate, in.ClosedDateSort, in.ClosedDateSortAscending, in.ClosedDateFetch);
      if (map != null) record.put ("ClosedDate", map);
      map = DataHelper.filterToMap (in.NewCharges, in.NewChargesSort, in.NewChargesSortAscending, in.NewChargesFetch);
      if (map != null) record.put ("NewCharges", map);
      map = DataHelper.filterToMap (in.NetNewCharges, in.NetNewChargesSort, in.NetNewChargesSortAscending, in.NetNewChargesFetch);
      if (map != null) record.put ("NetNewCharges", map);
      map = DataHelper.filterToMap (in.TotalDue, in.TotalDueSort, in.TotalDueSortAscending, in.TotalDueFetch);
      if (map != null) record.put ("TotalDue", map);
      map = DataHelper.filterToMap (in.TotalAdj, in.TotalAdjSort, in.TotalAdjSortAscending, in.TotalAdjFetch);
      if (map != null) record.put ("TotalAdj", map);
      map = DataHelper.filterToMap (in.TotalPaid, in.TotalPaidSort, in.TotalPaidSortAscending, in.TotalPaidFetch);
      if (map != null) record.put ("TotalPaid", map);
      map = DataHelper.filterToMap (in.BalanceDue, in.BalanceDueSort, in.BalanceDueSortAscending, in.BalanceDueFetch);
      if (map != null) record.put ("BalanceDue", map);
      map = DataHelper.filterToMap (in.DisputeAmt, in.DisputeAmtSort, in.DisputeAmtSortAscending, in.DisputeAmtFetch);
      if (map != null) record.put ("DisputeAmt", map);
      map = DataHelper.filterToMap (in.LateExemptCharges, in.LateExemptChargesSort, in.LateExemptChargesSortAscending, in.LateExemptChargesFetch);
      if (map != null) record.put ("LateExemptCharges", map);
      map = DataHelper.filterToMap (in.CollectionIndicator, in.CollectionIndicatorSort, in.CollectionIndicatorSortAscending, in.CollectionIndicatorFetch);
      if (map != null) record.put ("CollectionIndicator", map);
      map = DataHelper.filterToMap (in.ChgDate, in.ChgDateSort, in.ChgDateSortAscending, in.ChgDateFetch);
      if (map != null) record.put ("ChgDate", map);
      map = DataHelper.filterToMap (in.ChgWho, in.ChgWhoSort, in.ChgWhoSortAscending, in.ChgWhoFetch, in.ChgWhoCaseInsensitive);
      if (map != null) record.put ("ChgWho", map);
      map = DataHelper.filterToMap (in.GlAmount, in.GlAmountSort, in.GlAmountSortAscending, in.GlAmountFetch);
      if (map != null) record.put ("GlAmount", map);
      map = DataHelper.filterToMap (in.BalanceConverted, in.BalanceConvertedSort, in.BalanceConvertedSortAscending, in.BalanceConvertedFetch);
      if (map != null) record.put ("BalanceConverted", map);
      map = DataHelper.filterToMap (in.NewChargeCredits, in.NewChargeCreditsSort, in.NewChargeCreditsSortAscending, in.NewChargeCreditsFetch);
      if (map != null) record.put ("NewChargeCredits", map);
      map = DataHelper.filterToMap (in.BillSequenceNum, in.BillSequenceNumSort, in.BillSequenceNumSortAscending, in.BillSequenceNumFetch);
      if (map != null) record.put ("BillSequenceNum", map);
      map = DataHelper.filterToMap (in.ProcessNum, in.ProcessNumSort, in.ProcessNumSortAscending, in.ProcessNumFetch, in.ProcessNumCaseInsensitive);
      if (map != null) record.put ("ProcessNum", map);
      map = DataHelper.filterToMap (in.PrevBillRefno, in.PrevBillRefnoSort, in.PrevBillRefnoSortAscending, in.PrevBillRefnoFetch);
      if (map != null) record.put ("PrevBillRefno", map);
      map = DataHelper.filterToMap (in.PrevBillRefResets, in.PrevBillRefResetsSort, in.PrevBillRefResetsSortAscending, in.PrevBillRefResetsFetch);
      if (map != null) record.put ("PrevBillRefResets", map);
      map = DataHelper.filterToMap (in.PrevBalanceRefno, in.PrevBalanceRefnoSort, in.PrevBalanceRefnoSortAscending, in.PrevBalanceRefnoFetch);
      if (map != null) record.put ("PrevBalanceRefno", map);
      map = DataHelper.filterToMap (in.PrevBalanceRefResets, in.PrevBalanceRefResetsSort, in.PrevBalanceRefResetsSortAscending, in.PrevBalanceRefResetsFetch);
      if (map != null) record.put ("PrevBalanceRefResets", map);
      map = DataHelper.filterToMap (in.Zip, in.ZipSort, in.ZipSortAscending, in.ZipFetch, in.ZipCaseInsensitive);
      if (map != null) record.put ("Zip", map);
      map = DataHelper.filterToMap (in.FromDate, in.FromDateSort, in.FromDateSortAscending, in.FromDateFetch);
      if (map != null) record.put ("FromDate", map);
      map = DataHelper.filterToMap (in.ToDate, in.ToDateSort, in.ToDateSortAscending, in.ToDateFetch);
      if (map != null) record.put ("ToDate", map);
      map = DataHelper.filterToMap (in.NextToDate, in.NextToDateSort, in.NextToDateSortAscending, in.NextToDateFetch);
      if (map != null) record.put ("NextToDate", map);
      map = DataHelper.filterToMap (in.PrepDate, in.PrepDateSort, in.PrepDateSortAscending, in.PrepDateFetch);
      if (map != null) record.put ("PrepDate", map);
      map = DataHelper.filterToMap (in.TaxDate, in.TaxDateSort, in.TaxDateSortAscending, in.TaxDateFetch);
      if (map != null) record.put ("TaxDate", map);
      map = DataHelper.filterToMap (in.StatementDate, in.StatementDateSort, in.StatementDateSortAscending, in.StatementDateFetch);
      if (map != null) record.put ("StatementDate", map);
      map = DataHelper.filterToMap (in.PaymentDueDate, in.PaymentDueDateSort, in.PaymentDueDateSortAscending, in.PaymentDueDateFetch);
      if (map != null) record.put ("PaymentDueDate", map);
      map = DataHelper.filterToMap (in.PrevPpdd, in.PrevPpddSort, in.PrevPpddSortAscending, in.PrevPpddFetch);
      if (map != null) record.put ("PrevPpdd", map);
      map = DataHelper.filterToMap (in.PrevCutoffDate, in.PrevCutoffDateSort, in.PrevCutoffDateSortAscending, in.PrevCutoffDateFetch);
      if (map != null) record.put ("PrevCutoffDate", map);
      map = DataHelper.filterToMap (in.BillPeriod, in.BillPeriodSort, in.BillPeriodSortAscending, in.BillPeriodFetch, in.BillPeriodCaseInsensitive);
      if (map != null) record.put ("BillPeriod", map);
      map = DataHelper.filterToMap (in.PayMethod, in.PayMethodSort, in.PayMethodSortAscending, in.PayMethodFetch);
      if (map != null) record.put ("PayMethod", map);
      map = DataHelper.filterToMap (in.BillDispMeth, in.BillDispMethSort, in.BillDispMethSortAscending, in.BillDispMethFetch);
      if (map != null) record.put ("BillDispMeth", map);
      map = DataHelper.filterToMap (in.TaxJournalStatus, in.TaxJournalStatusSort, in.TaxJournalStatusSortAscending, in.TaxJournalStatusFetch);
      if (map != null) record.put ("TaxJournalStatus", map);
      map = DataHelper.filterToMap (in.AccountStatus, in.AccountStatusSort, in.AccountStatusSortAscending, in.AccountStatusFetch);
      if (map != null) record.put ("AccountStatus", map);
      map = DataHelper.filterToMap (in.ImageReq, in.ImageReqSort, in.ImageReqSortAscending, in.ImageReqFetch);
      if (map != null) record.put ("ImageReq", map);
      map = DataHelper.filterToMap (in.ImageDone, in.ImageDoneSort, in.ImageDoneSortAscending, in.ImageDoneFetch);
      if (map != null) record.put ("ImageDone", map);
      map = DataHelper.filterToMap (in.SpecialCode, in.SpecialCodeSort, in.SpecialCodeSortAscending, in.SpecialCodeFetch);
      if (map != null) record.put ("SpecialCode", map);
      map = DataHelper.filterToMap (in.PrepTask, in.PrepTaskSort, in.PrepTaskSortAscending, in.PrepTaskFetch, in.PrepTaskCaseInsensitive);
      if (map != null) record.put ("PrepTask", map);
      map = DataHelper.filterToMap (in.PrepStatus, in.PrepStatusSort, in.PrepStatusSortAscending, in.PrepStatusFetch);
      if (map != null) record.put ("PrepStatus", map);
      map = DataHelper.filterToMap (in.FormatStatus, in.FormatStatusSort, in.FormatStatusSortAscending, in.FormatStatusFetch);
      if (map != null) record.put ("FormatStatus", map);
      map = DataHelper.filterToMap (in.DispatchCount, in.DispatchCountSort, in.DispatchCountSortAscending, in.DispatchCountFetch);
      if (map != null) record.put ("DispatchCount", map);
      map = DataHelper.filterToMap (in.DispatchDate, in.DispatchDateSort, in.DispatchDateSortAscending, in.DispatchDateFetch);
      if (map != null) record.put ("DispatchDate", map);
      map = DataHelper.filterToMap (in.FileName, in.FileNameSort, in.FileNameSortAscending, in.FileNameFetch, in.FileNameCaseInsensitive);
      if (map != null) record.put ("FileName", map);
      map = DataHelper.filterToMap (in.StartOffset, in.StartOffsetSort, in.StartOffsetSortAscending, in.StartOffsetFetch);
      if (map != null) record.put ("StartOffset", map);
      map = DataHelper.filterToMap (in.EndOffset, in.EndOffsetSort, in.EndOffsetSortAscending, in.EndOffsetFetch);
      if (map != null) record.put ("EndOffset", map);
      map = DataHelper.filterToMap (in.PageCount, in.PageCountSort, in.PageCountSortAscending, in.PageCountFetch);
      if (map != null) record.put ("PageCount", map);
      map = DataHelper.filterToMap (in.BillHoldCode, in.BillHoldCodeSort, in.BillHoldCodeSortAscending, in.BillHoldCodeFetch);
      if (map != null) record.put ("BillHoldCode", map);
      map = DataHelper.filterToMap (in.PrepErrorCode, in.PrepErrorCodeSort, in.PrepErrorCodeSortAscending, in.PrepErrorCodeFetch);
      if (map != null) record.put ("PrepErrorCode", map);
      map = DataHelper.filterToMap (in.FormatErrorCode, in.FormatErrorCodeSort, in.FormatErrorCodeSortAscending, in.FormatErrorCodeFetch);
      if (map != null) record.put ("FormatErrorCode", map);
      map = DataHelper.filterToMap (in.BackoutStatus, in.BackoutStatusSort, in.BackoutStatusSortAscending, in.BackoutStatusFetch);
      if (map != null) record.put ("BackoutStatus", map);
      map = DataHelper.filterToMap (in.CopyType, in.CopyTypeSort, in.CopyTypeSortAscending, in.CopyTypeFetch);
      if (map != null) record.put ("CopyType", map);
      map = DataHelper.filterToMap (in.OrigBillRefno, in.OrigBillRefnoSort, in.OrigBillRefnoSortAscending, in.OrigBillRefnoFetch);
      if (map != null) record.put ("OrigBillRefno", map);
      map = DataHelper.filterToMap (in.OrigBillRefResets, in.OrigBillRefResetsSort, in.OrigBillRefResetsSortAscending, in.OrigBillRefResetsFetch);
      if (map != null) record.put ("OrigBillRefResets", map);
      map = DataHelper.filterToMap (in.CollectionHistory, in.CollectionHistorySort, in.CollectionHistorySortAscending, in.CollectionHistoryFetch, in.CollectionHistoryCaseInsensitive);
      if (map != null) record.put ("CollectionHistory", map);
      map = DataHelper.filterToMap (in.JnlEarnedThruDt, in.JnlEarnedThruDtSort, in.JnlEarnedThruDtSortAscending, in.JnlEarnedThruDtFetch);
      if (map != null) record.put ("JnlEarnedThruDt", map);
      map = DataHelper.filterToMap (in.JnlStatus, in.JnlStatusSort, in.JnlStatusSortAscending, in.JnlStatusFetch);
      if (map != null) record.put ("JnlStatus", map);
      map = DataHelper.filterToMap (in.TestFlag, in.TestFlagSort, in.TestFlagSortAscending, in.TestFlagFetch);
      if (map != null) record.put ("TestFlag", map);
      map = DataHelper.filterToMap (in.ArchFlag, in.ArchFlagSort, in.ArchFlagSortAscending, in.ArchFlagFetch);
      if (map != null) record.put ("ArchFlag", map);
      map = DataHelper.filterToMap (in.InterimBillFlag, in.InterimBillFlagSort, in.InterimBillFlagSortAscending, in.InterimBillFlagFetch);
      if (map != null) record.put ("InterimBillFlag", map);
      map = DataHelper.filterToMap (in.IncludeNrc, in.IncludeNrcSort, in.IncludeNrcSortAscending, in.IncludeNrcFetch);
      if (map != null) record.put ("IncludeNrc", map);
      map = DataHelper.filterToMap (in.IncludeRc, in.IncludeRcSort, in.IncludeRcSortAscending, in.IncludeRcFetch);
      if (map != null) record.put ("IncludeRc", map);
      map = DataHelper.filterToMap (in.IncludeAdj, in.IncludeAdjSort, in.IncludeAdjSortAscending, in.IncludeAdjFetch);
      if (map != null) record.put ("IncludeAdj", map);
      map = DataHelper.filterToMap (in.IncludeUsage, in.IncludeUsageSort, in.IncludeUsageSortAscending, in.IncludeUsageFetch);
      if (map != null) record.put ("IncludeUsage", map);
      map = DataHelper.filterToMap (in.IncludePayment, in.IncludePaymentSort, in.IncludePaymentSortAscending, in.IncludePaymentFetch);
      if (map != null) record.put ("IncludePayment", map);
      map = DataHelper.filterToMap (in.LanguageCode, in.LanguageCodeSort, in.LanguageCodeSortAscending, in.LanguageCodeFetch);
      if (map != null) record.put ("LanguageCode", map);
      map = DataHelper.filterToMap (in.BillConverted, in.BillConvertedSort, in.BillConvertedSortAscending, in.BillConvertedFetch);
      if (map != null) record.put ("BillConverted", map);
      map = DataHelper.filterToMap (in.WarmBillFlag, in.WarmBillFlagSort, in.WarmBillFlagSortAscending, in.WarmBillFlagFetch);
      if (map != null) record.put ("WarmBillFlag", map);
      map = DataHelper.filterToMap (in.BillOrderNumber, in.BillOrderNumberSort, in.BillOrderNumberSortAscending, in.BillOrderNumberFetch, in.BillOrderNumberCaseInsensitive);
      if (map != null) record.put ("BillOrderNumber", map);
      map = DataHelper.filterToMap (in.BillFmtOpt, in.BillFmtOptSort, in.BillFmtOptSortAscending, in.BillFmtOptFetch);
      if (map != null) record.put ("BillFmtOpt", map);
      map = DataHelper.filterToMap (in.DocumentServerId, in.DocumentServerIdSort, in.DocumentServerIdSortAscending, in.DocumentServerIdFetch);
      if (map != null) record.put ("DocumentServerId", map);
    return record;
  }
  /** convert Map to InvoiceObjectData.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceObjectData the converted object
   */
  public static InvoiceObjectData getObj (Map record)
  {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceObjectData out = new InvoiceObjectData ();

    out.Key = InvoiceObjectKeyHelper.getObj ((Map) record.get ("Key"));
    if ((obj = record.get ("AccountInternalId")) != null)
    {
      out.AccountInternalId = (Integer) obj;
    }
  
    if ((obj = record.get ("CurrencyCode")) != null)
    {
      out.CurrencyCode = (Integer) obj;
    }
  
    if ((obj = record.get ("PayDueDate")) != null)
    {
      out.PayDueDate = (Date) obj;
    }
  
    if ((obj = record.get ("OrigPayDueDate")) != null)
    {
      out.OrigPayDueDate = (Date) obj;
    }
  
    if ((obj = record.get ("ClosedDate")) != null)
    {
      out.ClosedDate = (Date) obj;
    }
  
    if ((obj = record.get ("NewCharges")) != null)
    {
      out.NewCharges = (BigInteger) obj;
    }
  
    if ((obj = record.get ("NetNewCharges")) != null)
    {
      out.NetNewCharges = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TotalDue")) != null)
    {
      out.TotalDue = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TotalAdj")) != null)
    {
      out.TotalAdj = (BigInteger) obj;
    }
  
    if ((obj = record.get ("TotalPaid")) != null)
    {
      out.TotalPaid = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BalanceDue")) != null)
    {
      out.BalanceDue = (BigInteger) obj;
    }
  
    if ((obj = record.get ("DisputeAmt")) != null)
    {
      out.DisputeAmt = (BigInteger) obj;
    }
  
    if ((obj = record.get ("LateExemptCharges")) != null)
    {
      out.LateExemptCharges = (BigInteger) obj;
    }
  
    if ((obj = record.get ("CollectionIndicator")) != null)
    {
      out.CollectionIndicator = (Integer) obj;
    }
  
    if ((obj = record.get ("ChgDate")) != null)
    {
      out.ChgDate = (Date) obj;
    }
  
    if ((obj = record.get ("ChgWho")) != null)
    {
      out.ChgWho = (String) obj;
    }
  
    if ((obj = record.get ("GlAmount")) != null)
    {
      out.GlAmount = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BalanceConverted")) != null)
    {
      out.BalanceConverted = (Integer) obj;
    }
  
    if ((obj = record.get ("NewChargeCredits")) != null)
    {
      out.NewChargeCredits = (BigInteger) obj;
    }
  
    if ((obj = record.get ("BillSequenceNum")) != null)
    {
      out.BillSequenceNum = (Integer) obj;
    }
  
    if ((obj = record.get ("ProcessNum")) != null)
    {
      out.ProcessNum = (String) obj;
    }
  
    if ((obj = record.get ("PrevBillRefno")) != null)
    {
      out.PrevBillRefno = (Integer) obj;
    }
  
    if ((obj = record.get ("PrevBillRefResets")) != null)
    {
      out.PrevBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("PrevBalanceRefno")) != null)
    {
      out.PrevBalanceRefno = (Integer) obj;
    }
  
    if ((obj = record.get ("PrevBalanceRefResets")) != null)
    {
      out.PrevBalanceRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("Zip")) != null)
    {
      out.Zip = (String) obj;
    }
  
    if ((obj = record.get ("FromDate")) != null)
    {
      out.FromDate = (Date) obj;
    }
  
    if ((obj = record.get ("ToDate")) != null)
    {
      out.ToDate = (Date) obj;
    }
  
    if ((obj = record.get ("NextToDate")) != null)
    {
      out.NextToDate = (Date) obj;
    }
  
    if ((obj = record.get ("PrepDate")) != null)
    {
      out.PrepDate = (Date) obj;
    }
  
    if ((obj = record.get ("TaxDate")) != null)
    {
      out.TaxDate = (Date) obj;
    }
  
    if ((obj = record.get ("StatementDate")) != null)
    {
      out.StatementDate = (Date) obj;
    }
  
    if ((obj = record.get ("PaymentDueDate")) != null)
    {
      out.PaymentDueDate = (Date) obj;
    }
  
    if ((obj = record.get ("PrevPpdd")) != null)
    {
      out.PrevPpdd = (Date) obj;
    }
  
    if ((obj = record.get ("PrevCutoffDate")) != null)
    {
      out.PrevCutoffDate = (Date) obj;
    }
  
    if ((obj = record.get ("BillPeriod")) != null)
    {
      out.BillPeriod = (String) obj;
    }
  
    if ((obj = record.get ("PayMethod")) != null)
    {
      out.PayMethod = (Integer) obj;
    }
  
    if ((obj = record.get ("BillDispMeth")) != null)
    {
      out.BillDispMeth = (Integer) obj;
    }
  
    if ((obj = record.get ("TaxJournalStatus")) != null)
    {
      out.TaxJournalStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("AccountStatus")) != null)
    {
      out.AccountStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("ImageReq")) != null)
    {
      out.ImageReq = (Boolean) obj;
    }
  
    if ((obj = record.get ("ImageDone")) != null)
    {
      out.ImageDone = (Boolean) obj;
    }
  
    if ((obj = record.get ("SpecialCode")) != null)
    {
      out.SpecialCode = (Integer) obj;
    }
  
    if ((obj = record.get ("PrepTask")) != null)
    {
      out.PrepTask = (String) obj;
    }
  
    if ((obj = record.get ("PrepStatus")) != null)
    {
      out.PrepStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("FormatStatus")) != null)
    {
      out.FormatStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("DispatchCount")) != null)
    {
      out.DispatchCount = (Integer) obj;
    }
  
    if ((obj = record.get ("DispatchDate")) != null)
    {
      out.DispatchDate = (Date) obj;
    }
  
    if ((obj = record.get ("FileName")) != null)
    {
      out.FileName = (String) obj;
    }
  
    if ((obj = record.get ("StartOffset")) != null)
    {
      out.StartOffset = (Integer) obj;
    }
  
    if ((obj = record.get ("EndOffset")) != null)
    {
      out.EndOffset = (Integer) obj;
    }
  
    if ((obj = record.get ("PageCount")) != null)
    {
      out.PageCount = (Integer) obj;
    }
  
    if ((obj = record.get ("BillHoldCode")) != null)
    {
      out.BillHoldCode = (Integer) obj;
    }
  
    if ((obj = record.get ("PrepErrorCode")) != null)
    {
      out.PrepErrorCode = (Integer) obj;
    }
  
    if ((obj = record.get ("FormatErrorCode")) != null)
    {
      out.FormatErrorCode = (Integer) obj;
    }
  
    if ((obj = record.get ("BackoutStatus")) != null)
    {
      out.BackoutStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("CopyType")) != null)
    {
      out.CopyType = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefno")) != null)
    {
      out.OrigBillRefno = (Integer) obj;
    }
  
    if ((obj = record.get ("OrigBillRefResets")) != null)
    {
      out.OrigBillRefResets = (Integer) obj;
    }
  
    if ((obj = record.get ("CollectionHistory")) != null)
    {
      out.CollectionHistory = (String) obj;
    }
  
    if ((obj = record.get ("JnlEarnedThruDt")) != null)
    {
      out.JnlEarnedThruDt = (Date) obj;
    }
  
    if ((obj = record.get ("JnlStatus")) != null)
    {
      out.JnlStatus = (Integer) obj;
    }
  
    if ((obj = record.get ("TestFlag")) != null)
    {
      out.TestFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("ArchFlag")) != null)
    {
      out.ArchFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("InterimBillFlag")) != null)
    {
      out.InterimBillFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("IncludeNrc")) != null)
    {
      out.IncludeNrc = (Boolean) obj;
    }
  
    if ((obj = record.get ("IncludeRc")) != null)
    {
      out.IncludeRc = (Boolean) obj;
    }
  
    if ((obj = record.get ("IncludeAdj")) != null)
    {
      out.IncludeAdj = (Boolean) obj;
    }
  
    if ((obj = record.get ("IncludeUsage")) != null)
    {
      out.IncludeUsage = (Boolean) obj;
    }
  
    if ((obj = record.get ("IncludePayment")) != null)
    {
      out.IncludePayment = (Boolean) obj;
    }
  
    if ((obj = record.get ("LanguageCode")) != null)
    {
      out.LanguageCode = (Integer) obj;
    }
  
    if ((obj = record.get ("BillConverted")) != null)
    {
      out.BillConverted = (Integer) obj;
    }
  
    if ((obj = record.get ("WarmBillFlag")) != null)
    {
      out.WarmBillFlag = (Boolean) obj;
    }
  
    if ((obj = record.get ("BillOrderNumber")) != null)
    {
      out.BillOrderNumber = (String) obj;
    }
  
    if ((obj = record.get ("BillFmtOpt")) != null)
    {
      out.BillFmtOpt = (Integer) obj;
    }
  
    if ((obj = record.get ("DocumentServerId")) != null)
    {
      out.DocumentServerId = (Integer) obj;
    }
      return out;
  }
  /** convert Map to InvoiceObjectFilter.
   * @param record   the Map containing the data to convert to the object, not including the root
   * @return InvoiceObjectFilter the converted object
   */
  public static InvoiceObjectFilter getFilter (Map record) {
    Object[] list = null;
    Object obj = null;
    if (record == null) return null;
    InvoiceObjectFilter out = new InvoiceObjectFilter ();
    Boolean Fetch = DataHelper.getFetch(record);
    if (Fetch != null) out.setFetch(Fetch);
    Integer Index = DataHelper.getIndex(record);
    if (Index != null) out.setIndex(Index);

    out.Key = InvoiceObjectKeyHelper.getFilter ((Map) record.get ("Key"));
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
  
    Map PayDueDateMap = (Map)record.get("PayDueDate");
    Boolean PayDueDateFetch = DataHelper.getFetch(PayDueDateMap);
    Boolean PayDueDateSortDir = DataHelper.getSortDirection(PayDueDateMap);
    Integer PayDueDateSortOrder = DataHelper.getSortOrder(PayDueDateMap);
    if (PayDueDateFetch != null) out.setPayDueDateFetch(PayDueDateFetch);
    if (PayDueDateSortDir != null) out.setPayDueDateSortDirection(PayDueDateSortDir);
    if (PayDueDateSortOrder != null) out.setPayDueDateSortOrder(PayDueDateSortOrder);

    Filter[] PayDueDateFilter = DataHelper.mapToFilterArray(PayDueDateMap, Date.class);
    if (PayDueDateFilter != null) {
      DateFilter[] PayDueDateFilters = new DateFilter[PayDueDateFilter.length];
      for (int i = 0; i < PayDueDateFilters.length; i++) {
        PayDueDateFilters[i] = (DateFilter)PayDueDateFilter[i];
      }
      try {
        out.setPayDueDateFilter(PayDueDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigPayDueDateMap = (Map)record.get("OrigPayDueDate");
    Boolean OrigPayDueDateFetch = DataHelper.getFetch(OrigPayDueDateMap);
    Boolean OrigPayDueDateSortDir = DataHelper.getSortDirection(OrigPayDueDateMap);
    Integer OrigPayDueDateSortOrder = DataHelper.getSortOrder(OrigPayDueDateMap);
    if (OrigPayDueDateFetch != null) out.setOrigPayDueDateFetch(OrigPayDueDateFetch);
    if (OrigPayDueDateSortDir != null) out.setOrigPayDueDateSortDirection(OrigPayDueDateSortDir);
    if (OrigPayDueDateSortOrder != null) out.setOrigPayDueDateSortOrder(OrigPayDueDateSortOrder);

    Filter[] OrigPayDueDateFilter = DataHelper.mapToFilterArray(OrigPayDueDateMap, Date.class);
    if (OrigPayDueDateFilter != null) {
      DateFilter[] OrigPayDueDateFilters = new DateFilter[OrigPayDueDateFilter.length];
      for (int i = 0; i < OrigPayDueDateFilters.length; i++) {
        OrigPayDueDateFilters[i] = (DateFilter)OrigPayDueDateFilter[i];
      }
      try {
        out.setOrigPayDueDateFilter(OrigPayDueDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ClosedDateMap = (Map)record.get("ClosedDate");
    Boolean ClosedDateFetch = DataHelper.getFetch(ClosedDateMap);
    Boolean ClosedDateSortDir = DataHelper.getSortDirection(ClosedDateMap);
    Integer ClosedDateSortOrder = DataHelper.getSortOrder(ClosedDateMap);
    if (ClosedDateFetch != null) out.setClosedDateFetch(ClosedDateFetch);
    if (ClosedDateSortDir != null) out.setClosedDateSortDirection(ClosedDateSortDir);
    if (ClosedDateSortOrder != null) out.setClosedDateSortOrder(ClosedDateSortOrder);

    Filter[] ClosedDateFilter = DataHelper.mapToFilterArray(ClosedDateMap, Date.class);
    if (ClosedDateFilter != null) {
      DateFilter[] ClosedDateFilters = new DateFilter[ClosedDateFilter.length];
      for (int i = 0; i < ClosedDateFilters.length; i++) {
        ClosedDateFilters[i] = (DateFilter)ClosedDateFilter[i];
      }
      try {
        out.setClosedDateFilter(ClosedDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NewChargesMap = (Map)record.get("NewCharges");
    Boolean NewChargesFetch = DataHelper.getFetch(NewChargesMap);
    Boolean NewChargesSortDir = DataHelper.getSortDirection(NewChargesMap);
    Integer NewChargesSortOrder = DataHelper.getSortOrder(NewChargesMap);
    if (NewChargesFetch != null) out.setNewChargesFetch(NewChargesFetch);
    if (NewChargesSortDir != null) out.setNewChargesSortDirection(NewChargesSortDir);
    if (NewChargesSortOrder != null) out.setNewChargesSortOrder(NewChargesSortOrder);

    Filter[] NewChargesFilter = DataHelper.mapToFilterArray(NewChargesMap, BigInteger.class);
    if (NewChargesFilter != null) {
      BigIntegerFilter[] NewChargesFilters = new BigIntegerFilter[NewChargesFilter.length];
      for (int i = 0; i < NewChargesFilters.length; i++) {
        NewChargesFilters[i] = (BigIntegerFilter)NewChargesFilter[i];
      }
      try {
        out.setNewChargesFilter(NewChargesFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NetNewChargesMap = (Map)record.get("NetNewCharges");
    Boolean NetNewChargesFetch = DataHelper.getFetch(NetNewChargesMap);
    Boolean NetNewChargesSortDir = DataHelper.getSortDirection(NetNewChargesMap);
    Integer NetNewChargesSortOrder = DataHelper.getSortOrder(NetNewChargesMap);
    if (NetNewChargesFetch != null) out.setNetNewChargesFetch(NetNewChargesFetch);
    if (NetNewChargesSortDir != null) out.setNetNewChargesSortDirection(NetNewChargesSortDir);
    if (NetNewChargesSortOrder != null) out.setNetNewChargesSortOrder(NetNewChargesSortOrder);

    Filter[] NetNewChargesFilter = DataHelper.mapToFilterArray(NetNewChargesMap, BigInteger.class);
    if (NetNewChargesFilter != null) {
      BigIntegerFilter[] NetNewChargesFilters = new BigIntegerFilter[NetNewChargesFilter.length];
      for (int i = 0; i < NetNewChargesFilters.length; i++) {
        NetNewChargesFilters[i] = (BigIntegerFilter)NetNewChargesFilter[i];
      }
      try {
        out.setNetNewChargesFilter(NetNewChargesFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalDueMap = (Map)record.get("TotalDue");
    Boolean TotalDueFetch = DataHelper.getFetch(TotalDueMap);
    Boolean TotalDueSortDir = DataHelper.getSortDirection(TotalDueMap);
    Integer TotalDueSortOrder = DataHelper.getSortOrder(TotalDueMap);
    if (TotalDueFetch != null) out.setTotalDueFetch(TotalDueFetch);
    if (TotalDueSortDir != null) out.setTotalDueSortDirection(TotalDueSortDir);
    if (TotalDueSortOrder != null) out.setTotalDueSortOrder(TotalDueSortOrder);

    Filter[] TotalDueFilter = DataHelper.mapToFilterArray(TotalDueMap, BigInteger.class);
    if (TotalDueFilter != null) {
      BigIntegerFilter[] TotalDueFilters = new BigIntegerFilter[TotalDueFilter.length];
      for (int i = 0; i < TotalDueFilters.length; i++) {
        TotalDueFilters[i] = (BigIntegerFilter)TotalDueFilter[i];
      }
      try {
        out.setTotalDueFilter(TotalDueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalAdjMap = (Map)record.get("TotalAdj");
    Boolean TotalAdjFetch = DataHelper.getFetch(TotalAdjMap);
    Boolean TotalAdjSortDir = DataHelper.getSortDirection(TotalAdjMap);
    Integer TotalAdjSortOrder = DataHelper.getSortOrder(TotalAdjMap);
    if (TotalAdjFetch != null) out.setTotalAdjFetch(TotalAdjFetch);
    if (TotalAdjSortDir != null) out.setTotalAdjSortDirection(TotalAdjSortDir);
    if (TotalAdjSortOrder != null) out.setTotalAdjSortOrder(TotalAdjSortOrder);

    Filter[] TotalAdjFilter = DataHelper.mapToFilterArray(TotalAdjMap, BigInteger.class);
    if (TotalAdjFilter != null) {
      BigIntegerFilter[] TotalAdjFilters = new BigIntegerFilter[TotalAdjFilter.length];
      for (int i = 0; i < TotalAdjFilters.length; i++) {
        TotalAdjFilters[i] = (BigIntegerFilter)TotalAdjFilter[i];
      }
      try {
        out.setTotalAdjFilter(TotalAdjFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TotalPaidMap = (Map)record.get("TotalPaid");
    Boolean TotalPaidFetch = DataHelper.getFetch(TotalPaidMap);
    Boolean TotalPaidSortDir = DataHelper.getSortDirection(TotalPaidMap);
    Integer TotalPaidSortOrder = DataHelper.getSortOrder(TotalPaidMap);
    if (TotalPaidFetch != null) out.setTotalPaidFetch(TotalPaidFetch);
    if (TotalPaidSortDir != null) out.setTotalPaidSortDirection(TotalPaidSortDir);
    if (TotalPaidSortOrder != null) out.setTotalPaidSortOrder(TotalPaidSortOrder);

    Filter[] TotalPaidFilter = DataHelper.mapToFilterArray(TotalPaidMap, BigInteger.class);
    if (TotalPaidFilter != null) {
      BigIntegerFilter[] TotalPaidFilters = new BigIntegerFilter[TotalPaidFilter.length];
      for (int i = 0; i < TotalPaidFilters.length; i++) {
        TotalPaidFilters[i] = (BigIntegerFilter)TotalPaidFilter[i];
      }
      try {
        out.setTotalPaidFilter(TotalPaidFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BalanceDueMap = (Map)record.get("BalanceDue");
    Boolean BalanceDueFetch = DataHelper.getFetch(BalanceDueMap);
    Boolean BalanceDueSortDir = DataHelper.getSortDirection(BalanceDueMap);
    Integer BalanceDueSortOrder = DataHelper.getSortOrder(BalanceDueMap);
    if (BalanceDueFetch != null) out.setBalanceDueFetch(BalanceDueFetch);
    if (BalanceDueSortDir != null) out.setBalanceDueSortDirection(BalanceDueSortDir);
    if (BalanceDueSortOrder != null) out.setBalanceDueSortOrder(BalanceDueSortOrder);

    Filter[] BalanceDueFilter = DataHelper.mapToFilterArray(BalanceDueMap, BigInteger.class);
    if (BalanceDueFilter != null) {
      BigIntegerFilter[] BalanceDueFilters = new BigIntegerFilter[BalanceDueFilter.length];
      for (int i = 0; i < BalanceDueFilters.length; i++) {
        BalanceDueFilters[i] = (BigIntegerFilter)BalanceDueFilter[i];
      }
      try {
        out.setBalanceDueFilter(BalanceDueFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DisputeAmtMap = (Map)record.get("DisputeAmt");
    Boolean DisputeAmtFetch = DataHelper.getFetch(DisputeAmtMap);
    Boolean DisputeAmtSortDir = DataHelper.getSortDirection(DisputeAmtMap);
    Integer DisputeAmtSortOrder = DataHelper.getSortOrder(DisputeAmtMap);
    if (DisputeAmtFetch != null) out.setDisputeAmtFetch(DisputeAmtFetch);
    if (DisputeAmtSortDir != null) out.setDisputeAmtSortDirection(DisputeAmtSortDir);
    if (DisputeAmtSortOrder != null) out.setDisputeAmtSortOrder(DisputeAmtSortOrder);

    Filter[] DisputeAmtFilter = DataHelper.mapToFilterArray(DisputeAmtMap, BigInteger.class);
    if (DisputeAmtFilter != null) {
      BigIntegerFilter[] DisputeAmtFilters = new BigIntegerFilter[DisputeAmtFilter.length];
      for (int i = 0; i < DisputeAmtFilters.length; i++) {
        DisputeAmtFilters[i] = (BigIntegerFilter)DisputeAmtFilter[i];
      }
      try {
        out.setDisputeAmtFilter(DisputeAmtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LateExemptChargesMap = (Map)record.get("LateExemptCharges");
    Boolean LateExemptChargesFetch = DataHelper.getFetch(LateExemptChargesMap);
    Boolean LateExemptChargesSortDir = DataHelper.getSortDirection(LateExemptChargesMap);
    Integer LateExemptChargesSortOrder = DataHelper.getSortOrder(LateExemptChargesMap);
    if (LateExemptChargesFetch != null) out.setLateExemptChargesFetch(LateExemptChargesFetch);
    if (LateExemptChargesSortDir != null) out.setLateExemptChargesSortDirection(LateExemptChargesSortDir);
    if (LateExemptChargesSortOrder != null) out.setLateExemptChargesSortOrder(LateExemptChargesSortOrder);

    Filter[] LateExemptChargesFilter = DataHelper.mapToFilterArray(LateExemptChargesMap, BigInteger.class);
    if (LateExemptChargesFilter != null) {
      BigIntegerFilter[] LateExemptChargesFilters = new BigIntegerFilter[LateExemptChargesFilter.length];
      for (int i = 0; i < LateExemptChargesFilters.length; i++) {
        LateExemptChargesFilters[i] = (BigIntegerFilter)LateExemptChargesFilter[i];
      }
      try {
        out.setLateExemptChargesFilter(LateExemptChargesFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CollectionIndicatorMap = (Map)record.get("CollectionIndicator");
    Boolean CollectionIndicatorFetch = DataHelper.getFetch(CollectionIndicatorMap);
    Boolean CollectionIndicatorSortDir = DataHelper.getSortDirection(CollectionIndicatorMap);
    Integer CollectionIndicatorSortOrder = DataHelper.getSortOrder(CollectionIndicatorMap);
    if (CollectionIndicatorFetch != null) out.setCollectionIndicatorFetch(CollectionIndicatorFetch);
    if (CollectionIndicatorSortDir != null) out.setCollectionIndicatorSortDirection(CollectionIndicatorSortDir);
    if (CollectionIndicatorSortOrder != null) out.setCollectionIndicatorSortOrder(CollectionIndicatorSortOrder);

    Filter[] CollectionIndicatorFilter = DataHelper.mapToFilterArray(CollectionIndicatorMap, Integer.class);
    if (CollectionIndicatorFilter != null) {
      IntegerFilter[] CollectionIndicatorFilters = new IntegerFilter[CollectionIndicatorFilter.length];
      for (int i = 0; i < CollectionIndicatorFilters.length; i++) {
        CollectionIndicatorFilters[i] = (IntegerFilter)CollectionIndicatorFilter[i];
      }
      try {
        out.setCollectionIndicatorFilter(CollectionIndicatorFilters);
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
  
    Map BalanceConvertedMap = (Map)record.get("BalanceConverted");
    Boolean BalanceConvertedFetch = DataHelper.getFetch(BalanceConvertedMap);
    Boolean BalanceConvertedSortDir = DataHelper.getSortDirection(BalanceConvertedMap);
    Integer BalanceConvertedSortOrder = DataHelper.getSortOrder(BalanceConvertedMap);
    if (BalanceConvertedFetch != null) out.setBalanceConvertedFetch(BalanceConvertedFetch);
    if (BalanceConvertedSortDir != null) out.setBalanceConvertedSortDirection(BalanceConvertedSortDir);
    if (BalanceConvertedSortOrder != null) out.setBalanceConvertedSortOrder(BalanceConvertedSortOrder);

    Filter[] BalanceConvertedFilter = DataHelper.mapToFilterArray(BalanceConvertedMap, Integer.class);
    if (BalanceConvertedFilter != null) {
      IntegerFilter[] BalanceConvertedFilters = new IntegerFilter[BalanceConvertedFilter.length];
      for (int i = 0; i < BalanceConvertedFilters.length; i++) {
        BalanceConvertedFilters[i] = (IntegerFilter)BalanceConvertedFilter[i];
      }
      try {
        out.setBalanceConvertedFilter(BalanceConvertedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NewChargeCreditsMap = (Map)record.get("NewChargeCredits");
    Boolean NewChargeCreditsFetch = DataHelper.getFetch(NewChargeCreditsMap);
    Boolean NewChargeCreditsSortDir = DataHelper.getSortDirection(NewChargeCreditsMap);
    Integer NewChargeCreditsSortOrder = DataHelper.getSortOrder(NewChargeCreditsMap);
    if (NewChargeCreditsFetch != null) out.setNewChargeCreditsFetch(NewChargeCreditsFetch);
    if (NewChargeCreditsSortDir != null) out.setNewChargeCreditsSortDirection(NewChargeCreditsSortDir);
    if (NewChargeCreditsSortOrder != null) out.setNewChargeCreditsSortOrder(NewChargeCreditsSortOrder);

    Filter[] NewChargeCreditsFilter = DataHelper.mapToFilterArray(NewChargeCreditsMap, BigInteger.class);
    if (NewChargeCreditsFilter != null) {
      BigIntegerFilter[] NewChargeCreditsFilters = new BigIntegerFilter[NewChargeCreditsFilter.length];
      for (int i = 0; i < NewChargeCreditsFilters.length; i++) {
        NewChargeCreditsFilters[i] = (BigIntegerFilter)NewChargeCreditsFilter[i];
      }
      try {
        out.setNewChargeCreditsFilter(NewChargeCreditsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillSequenceNumMap = (Map)record.get("BillSequenceNum");
    Boolean BillSequenceNumFetch = DataHelper.getFetch(BillSequenceNumMap);
    Boolean BillSequenceNumSortDir = DataHelper.getSortDirection(BillSequenceNumMap);
    Integer BillSequenceNumSortOrder = DataHelper.getSortOrder(BillSequenceNumMap);
    if (BillSequenceNumFetch != null) out.setBillSequenceNumFetch(BillSequenceNumFetch);
    if (BillSequenceNumSortDir != null) out.setBillSequenceNumSortDirection(BillSequenceNumSortDir);
    if (BillSequenceNumSortOrder != null) out.setBillSequenceNumSortOrder(BillSequenceNumSortOrder);

    Filter[] BillSequenceNumFilter = DataHelper.mapToFilterArray(BillSequenceNumMap, Integer.class);
    if (BillSequenceNumFilter != null) {
      IntegerFilter[] BillSequenceNumFilters = new IntegerFilter[BillSequenceNumFilter.length];
      for (int i = 0; i < BillSequenceNumFilters.length; i++) {
        BillSequenceNumFilters[i] = (IntegerFilter)BillSequenceNumFilter[i];
      }
      try {
        out.setBillSequenceNumFilter(BillSequenceNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ProcessNumMap = (Map)record.get("ProcessNum");
    Boolean ProcessNumFetch = DataHelper.getFetch(ProcessNumMap);
    Boolean ProcessNumSortDir = DataHelper.getSortDirection(ProcessNumMap);
    Integer ProcessNumSortOrder = DataHelper.getSortOrder(ProcessNumMap);
    if (ProcessNumFetch != null) out.setProcessNumFetch(ProcessNumFetch);
    if (ProcessNumSortDir != null) out.setProcessNumSortDirection(ProcessNumSortDir);
    if (ProcessNumSortOrder != null) out.setProcessNumSortOrder(ProcessNumSortOrder);

    Filter[] ProcessNumFilter = DataHelper.mapToFilterArray(ProcessNumMap, String.class);
    if (ProcessNumFilter != null) {
      StringFilter[] ProcessNumFilters = new StringFilter[ProcessNumFilter.length];
      for (int i = 0; i < ProcessNumFilters.length; i++) {
        ProcessNumFilters[i] = (StringFilter)ProcessNumFilter[i];
      }
      try {
        out.setProcessNumFilter(ProcessNumFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevBillRefnoMap = (Map)record.get("PrevBillRefno");
    Boolean PrevBillRefnoFetch = DataHelper.getFetch(PrevBillRefnoMap);
    Boolean PrevBillRefnoSortDir = DataHelper.getSortDirection(PrevBillRefnoMap);
    Integer PrevBillRefnoSortOrder = DataHelper.getSortOrder(PrevBillRefnoMap);
    if (PrevBillRefnoFetch != null) out.setPrevBillRefnoFetch(PrevBillRefnoFetch);
    if (PrevBillRefnoSortDir != null) out.setPrevBillRefnoSortDirection(PrevBillRefnoSortDir);
    if (PrevBillRefnoSortOrder != null) out.setPrevBillRefnoSortOrder(PrevBillRefnoSortOrder);

    Filter[] PrevBillRefnoFilter = DataHelper.mapToFilterArray(PrevBillRefnoMap, Integer.class);
    if (PrevBillRefnoFilter != null) {
      IntegerFilter[] PrevBillRefnoFilters = new IntegerFilter[PrevBillRefnoFilter.length];
      for (int i = 0; i < PrevBillRefnoFilters.length; i++) {
        PrevBillRefnoFilters[i] = (IntegerFilter)PrevBillRefnoFilter[i];
      }
      try {
        out.setPrevBillRefnoFilter(PrevBillRefnoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevBillRefResetsMap = (Map)record.get("PrevBillRefResets");
    Boolean PrevBillRefResetsFetch = DataHelper.getFetch(PrevBillRefResetsMap);
    Boolean PrevBillRefResetsSortDir = DataHelper.getSortDirection(PrevBillRefResetsMap);
    Integer PrevBillRefResetsSortOrder = DataHelper.getSortOrder(PrevBillRefResetsMap);
    if (PrevBillRefResetsFetch != null) out.setPrevBillRefResetsFetch(PrevBillRefResetsFetch);
    if (PrevBillRefResetsSortDir != null) out.setPrevBillRefResetsSortDirection(PrevBillRefResetsSortDir);
    if (PrevBillRefResetsSortOrder != null) out.setPrevBillRefResetsSortOrder(PrevBillRefResetsSortOrder);

    Filter[] PrevBillRefResetsFilter = DataHelper.mapToFilterArray(PrevBillRefResetsMap, Integer.class);
    if (PrevBillRefResetsFilter != null) {
      IntegerFilter[] PrevBillRefResetsFilters = new IntegerFilter[PrevBillRefResetsFilter.length];
      for (int i = 0; i < PrevBillRefResetsFilters.length; i++) {
        PrevBillRefResetsFilters[i] = (IntegerFilter)PrevBillRefResetsFilter[i];
      }
      try {
        out.setPrevBillRefResetsFilter(PrevBillRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevBalanceRefnoMap = (Map)record.get("PrevBalanceRefno");
    Boolean PrevBalanceRefnoFetch = DataHelper.getFetch(PrevBalanceRefnoMap);
    Boolean PrevBalanceRefnoSortDir = DataHelper.getSortDirection(PrevBalanceRefnoMap);
    Integer PrevBalanceRefnoSortOrder = DataHelper.getSortOrder(PrevBalanceRefnoMap);
    if (PrevBalanceRefnoFetch != null) out.setPrevBalanceRefnoFetch(PrevBalanceRefnoFetch);
    if (PrevBalanceRefnoSortDir != null) out.setPrevBalanceRefnoSortDirection(PrevBalanceRefnoSortDir);
    if (PrevBalanceRefnoSortOrder != null) out.setPrevBalanceRefnoSortOrder(PrevBalanceRefnoSortOrder);

    Filter[] PrevBalanceRefnoFilter = DataHelper.mapToFilterArray(PrevBalanceRefnoMap, Integer.class);
    if (PrevBalanceRefnoFilter != null) {
      IntegerFilter[] PrevBalanceRefnoFilters = new IntegerFilter[PrevBalanceRefnoFilter.length];
      for (int i = 0; i < PrevBalanceRefnoFilters.length; i++) {
        PrevBalanceRefnoFilters[i] = (IntegerFilter)PrevBalanceRefnoFilter[i];
      }
      try {
        out.setPrevBalanceRefnoFilter(PrevBalanceRefnoFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevBalanceRefResetsMap = (Map)record.get("PrevBalanceRefResets");
    Boolean PrevBalanceRefResetsFetch = DataHelper.getFetch(PrevBalanceRefResetsMap);
    Boolean PrevBalanceRefResetsSortDir = DataHelper.getSortDirection(PrevBalanceRefResetsMap);
    Integer PrevBalanceRefResetsSortOrder = DataHelper.getSortOrder(PrevBalanceRefResetsMap);
    if (PrevBalanceRefResetsFetch != null) out.setPrevBalanceRefResetsFetch(PrevBalanceRefResetsFetch);
    if (PrevBalanceRefResetsSortDir != null) out.setPrevBalanceRefResetsSortDirection(PrevBalanceRefResetsSortDir);
    if (PrevBalanceRefResetsSortOrder != null) out.setPrevBalanceRefResetsSortOrder(PrevBalanceRefResetsSortOrder);

    Filter[] PrevBalanceRefResetsFilter = DataHelper.mapToFilterArray(PrevBalanceRefResetsMap, Integer.class);
    if (PrevBalanceRefResetsFilter != null) {
      IntegerFilter[] PrevBalanceRefResetsFilters = new IntegerFilter[PrevBalanceRefResetsFilter.length];
      for (int i = 0; i < PrevBalanceRefResetsFilters.length; i++) {
        PrevBalanceRefResetsFilters[i] = (IntegerFilter)PrevBalanceRefResetsFilter[i];
      }
      try {
        out.setPrevBalanceRefResetsFilter(PrevBalanceRefResetsFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ZipMap = (Map)record.get("Zip");
    Boolean ZipFetch = DataHelper.getFetch(ZipMap);
    Boolean ZipSortDir = DataHelper.getSortDirection(ZipMap);
    Integer ZipSortOrder = DataHelper.getSortOrder(ZipMap);
    if (ZipFetch != null) out.setZipFetch(ZipFetch);
    if (ZipSortDir != null) out.setZipSortDirection(ZipSortDir);
    if (ZipSortOrder != null) out.setZipSortOrder(ZipSortOrder);

    Filter[] ZipFilter = DataHelper.mapToFilterArray(ZipMap, String.class);
    if (ZipFilter != null) {
      StringFilter[] ZipFilters = new StringFilter[ZipFilter.length];
      for (int i = 0; i < ZipFilters.length; i++) {
        ZipFilters[i] = (StringFilter)ZipFilter[i];
      }
      try {
        out.setZipFilter(ZipFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FromDateMap = (Map)record.get("FromDate");
    Boolean FromDateFetch = DataHelper.getFetch(FromDateMap);
    Boolean FromDateSortDir = DataHelper.getSortDirection(FromDateMap);
    Integer FromDateSortOrder = DataHelper.getSortOrder(FromDateMap);
    if (FromDateFetch != null) out.setFromDateFetch(FromDateFetch);
    if (FromDateSortDir != null) out.setFromDateSortDirection(FromDateSortDir);
    if (FromDateSortOrder != null) out.setFromDateSortOrder(FromDateSortOrder);

    Filter[] FromDateFilter = DataHelper.mapToFilterArray(FromDateMap, Date.class);
    if (FromDateFilter != null) {
      DateFilter[] FromDateFilters = new DateFilter[FromDateFilter.length];
      for (int i = 0; i < FromDateFilters.length; i++) {
        FromDateFilters[i] = (DateFilter)FromDateFilter[i];
      }
      try {
        out.setFromDateFilter(FromDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ToDateMap = (Map)record.get("ToDate");
    Boolean ToDateFetch = DataHelper.getFetch(ToDateMap);
    Boolean ToDateSortDir = DataHelper.getSortDirection(ToDateMap);
    Integer ToDateSortOrder = DataHelper.getSortOrder(ToDateMap);
    if (ToDateFetch != null) out.setToDateFetch(ToDateFetch);
    if (ToDateSortDir != null) out.setToDateSortDirection(ToDateSortDir);
    if (ToDateSortOrder != null) out.setToDateSortOrder(ToDateSortOrder);

    Filter[] ToDateFilter = DataHelper.mapToFilterArray(ToDateMap, Date.class);
    if (ToDateFilter != null) {
      DateFilter[] ToDateFilters = new DateFilter[ToDateFilter.length];
      for (int i = 0; i < ToDateFilters.length; i++) {
        ToDateFilters[i] = (DateFilter)ToDateFilter[i];
      }
      try {
        out.setToDateFilter(ToDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map NextToDateMap = (Map)record.get("NextToDate");
    Boolean NextToDateFetch = DataHelper.getFetch(NextToDateMap);
    Boolean NextToDateSortDir = DataHelper.getSortDirection(NextToDateMap);
    Integer NextToDateSortOrder = DataHelper.getSortOrder(NextToDateMap);
    if (NextToDateFetch != null) out.setNextToDateFetch(NextToDateFetch);
    if (NextToDateSortDir != null) out.setNextToDateSortDirection(NextToDateSortDir);
    if (NextToDateSortOrder != null) out.setNextToDateSortOrder(NextToDateSortOrder);

    Filter[] NextToDateFilter = DataHelper.mapToFilterArray(NextToDateMap, Date.class);
    if (NextToDateFilter != null) {
      DateFilter[] NextToDateFilters = new DateFilter[NextToDateFilter.length];
      for (int i = 0; i < NextToDateFilters.length; i++) {
        NextToDateFilters[i] = (DateFilter)NextToDateFilter[i];
      }
      try {
        out.setNextToDateFilter(NextToDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepDateMap = (Map)record.get("PrepDate");
    Boolean PrepDateFetch = DataHelper.getFetch(PrepDateMap);
    Boolean PrepDateSortDir = DataHelper.getSortDirection(PrepDateMap);
    Integer PrepDateSortOrder = DataHelper.getSortOrder(PrepDateMap);
    if (PrepDateFetch != null) out.setPrepDateFetch(PrepDateFetch);
    if (PrepDateSortDir != null) out.setPrepDateSortDirection(PrepDateSortDir);
    if (PrepDateSortOrder != null) out.setPrepDateSortOrder(PrepDateSortOrder);

    Filter[] PrepDateFilter = DataHelper.mapToFilterArray(PrepDateMap, Date.class);
    if (PrepDateFilter != null) {
      DateFilter[] PrepDateFilters = new DateFilter[PrepDateFilter.length];
      for (int i = 0; i < PrepDateFilters.length; i++) {
        PrepDateFilters[i] = (DateFilter)PrepDateFilter[i];
      }
      try {
        out.setPrepDateFilter(PrepDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxDateMap = (Map)record.get("TaxDate");
    Boolean TaxDateFetch = DataHelper.getFetch(TaxDateMap);
    Boolean TaxDateSortDir = DataHelper.getSortDirection(TaxDateMap);
    Integer TaxDateSortOrder = DataHelper.getSortOrder(TaxDateMap);
    if (TaxDateFetch != null) out.setTaxDateFetch(TaxDateFetch);
    if (TaxDateSortDir != null) out.setTaxDateSortDirection(TaxDateSortDir);
    if (TaxDateSortOrder != null) out.setTaxDateSortOrder(TaxDateSortOrder);

    Filter[] TaxDateFilter = DataHelper.mapToFilterArray(TaxDateMap, Date.class);
    if (TaxDateFilter != null) {
      DateFilter[] TaxDateFilters = new DateFilter[TaxDateFilter.length];
      for (int i = 0; i < TaxDateFilters.length; i++) {
        TaxDateFilters[i] = (DateFilter)TaxDateFilter[i];
      }
      try {
        out.setTaxDateFilter(TaxDateFilters);
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
  
    Map PrevPpddMap = (Map)record.get("PrevPpdd");
    Boolean PrevPpddFetch = DataHelper.getFetch(PrevPpddMap);
    Boolean PrevPpddSortDir = DataHelper.getSortDirection(PrevPpddMap);
    Integer PrevPpddSortOrder = DataHelper.getSortOrder(PrevPpddMap);
    if (PrevPpddFetch != null) out.setPrevPpddFetch(PrevPpddFetch);
    if (PrevPpddSortDir != null) out.setPrevPpddSortDirection(PrevPpddSortDir);
    if (PrevPpddSortOrder != null) out.setPrevPpddSortOrder(PrevPpddSortOrder);

    Filter[] PrevPpddFilter = DataHelper.mapToFilterArray(PrevPpddMap, Date.class);
    if (PrevPpddFilter != null) {
      DateFilter[] PrevPpddFilters = new DateFilter[PrevPpddFilter.length];
      for (int i = 0; i < PrevPpddFilters.length; i++) {
        PrevPpddFilters[i] = (DateFilter)PrevPpddFilter[i];
      }
      try {
        out.setPrevPpddFilter(PrevPpddFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrevCutoffDateMap = (Map)record.get("PrevCutoffDate");
    Boolean PrevCutoffDateFetch = DataHelper.getFetch(PrevCutoffDateMap);
    Boolean PrevCutoffDateSortDir = DataHelper.getSortDirection(PrevCutoffDateMap);
    Integer PrevCutoffDateSortOrder = DataHelper.getSortOrder(PrevCutoffDateMap);
    if (PrevCutoffDateFetch != null) out.setPrevCutoffDateFetch(PrevCutoffDateFetch);
    if (PrevCutoffDateSortDir != null) out.setPrevCutoffDateSortDirection(PrevCutoffDateSortDir);
    if (PrevCutoffDateSortOrder != null) out.setPrevCutoffDateSortOrder(PrevCutoffDateSortOrder);

    Filter[] PrevCutoffDateFilter = DataHelper.mapToFilterArray(PrevCutoffDateMap, Date.class);
    if (PrevCutoffDateFilter != null) {
      DateFilter[] PrevCutoffDateFilters = new DateFilter[PrevCutoffDateFilter.length];
      for (int i = 0; i < PrevCutoffDateFilters.length; i++) {
        PrevCutoffDateFilters[i] = (DateFilter)PrevCutoffDateFilter[i];
      }
      try {
        out.setPrevCutoffDateFilter(PrevCutoffDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillPeriodMap = (Map)record.get("BillPeriod");
    Boolean BillPeriodFetch = DataHelper.getFetch(BillPeriodMap);
    Boolean BillPeriodSortDir = DataHelper.getSortDirection(BillPeriodMap);
    Integer BillPeriodSortOrder = DataHelper.getSortOrder(BillPeriodMap);
    if (BillPeriodFetch != null) out.setBillPeriodFetch(BillPeriodFetch);
    if (BillPeriodSortDir != null) out.setBillPeriodSortDirection(BillPeriodSortDir);
    if (BillPeriodSortOrder != null) out.setBillPeriodSortOrder(BillPeriodSortOrder);

    Filter[] BillPeriodFilter = DataHelper.mapToFilterArray(BillPeriodMap, String.class);
    if (BillPeriodFilter != null) {
      StringFilter[] BillPeriodFilters = new StringFilter[BillPeriodFilter.length];
      for (int i = 0; i < BillPeriodFilters.length; i++) {
        BillPeriodFilters[i] = (StringFilter)BillPeriodFilter[i];
      }
      try {
        out.setBillPeriodFilter(BillPeriodFilters);
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
  
    Map BillDispMethMap = (Map)record.get("BillDispMeth");
    Boolean BillDispMethFetch = DataHelper.getFetch(BillDispMethMap);
    Boolean BillDispMethSortDir = DataHelper.getSortDirection(BillDispMethMap);
    Integer BillDispMethSortOrder = DataHelper.getSortOrder(BillDispMethMap);
    if (BillDispMethFetch != null) out.setBillDispMethFetch(BillDispMethFetch);
    if (BillDispMethSortDir != null) out.setBillDispMethSortDirection(BillDispMethSortDir);
    if (BillDispMethSortOrder != null) out.setBillDispMethSortOrder(BillDispMethSortOrder);

    Filter[] BillDispMethFilter = DataHelper.mapToFilterArray(BillDispMethMap, Integer.class);
    if (BillDispMethFilter != null) {
      IntegerFilter[] BillDispMethFilters = new IntegerFilter[BillDispMethFilter.length];
      for (int i = 0; i < BillDispMethFilters.length; i++) {
        BillDispMethFilters[i] = (IntegerFilter)BillDispMethFilter[i];
      }
      try {
        out.setBillDispMethFilter(BillDispMethFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TaxJournalStatusMap = (Map)record.get("TaxJournalStatus");
    Boolean TaxJournalStatusFetch = DataHelper.getFetch(TaxJournalStatusMap);
    Boolean TaxJournalStatusSortDir = DataHelper.getSortDirection(TaxJournalStatusMap);
    Integer TaxJournalStatusSortOrder = DataHelper.getSortOrder(TaxJournalStatusMap);
    if (TaxJournalStatusFetch != null) out.setTaxJournalStatusFetch(TaxJournalStatusFetch);
    if (TaxJournalStatusSortDir != null) out.setTaxJournalStatusSortDirection(TaxJournalStatusSortDir);
    if (TaxJournalStatusSortOrder != null) out.setTaxJournalStatusSortOrder(TaxJournalStatusSortOrder);

    Filter[] TaxJournalStatusFilter = DataHelper.mapToFilterArray(TaxJournalStatusMap, Integer.class);
    if (TaxJournalStatusFilter != null) {
      IntegerFilter[] TaxJournalStatusFilters = new IntegerFilter[TaxJournalStatusFilter.length];
      for (int i = 0; i < TaxJournalStatusFilters.length; i++) {
        TaxJournalStatusFilters[i] = (IntegerFilter)TaxJournalStatusFilter[i];
      }
      try {
        out.setTaxJournalStatusFilter(TaxJournalStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map AccountStatusMap = (Map)record.get("AccountStatus");
    Boolean AccountStatusFetch = DataHelper.getFetch(AccountStatusMap);
    Boolean AccountStatusSortDir = DataHelper.getSortDirection(AccountStatusMap);
    Integer AccountStatusSortOrder = DataHelper.getSortOrder(AccountStatusMap);
    if (AccountStatusFetch != null) out.setAccountStatusFetch(AccountStatusFetch);
    if (AccountStatusSortDir != null) out.setAccountStatusSortDirection(AccountStatusSortDir);
    if (AccountStatusSortOrder != null) out.setAccountStatusSortOrder(AccountStatusSortOrder);

    Filter[] AccountStatusFilter = DataHelper.mapToFilterArray(AccountStatusMap, Integer.class);
    if (AccountStatusFilter != null) {
      IntegerFilter[] AccountStatusFilters = new IntegerFilter[AccountStatusFilter.length];
      for (int i = 0; i < AccountStatusFilters.length; i++) {
        AccountStatusFilters[i] = (IntegerFilter)AccountStatusFilter[i];
      }
      try {
        out.setAccountStatusFilter(AccountStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ImageReqMap = (Map)record.get("ImageReq");
    Boolean ImageReqFetch = DataHelper.getFetch(ImageReqMap);
    Boolean ImageReqSortDir = DataHelper.getSortDirection(ImageReqMap);
    Integer ImageReqSortOrder = DataHelper.getSortOrder(ImageReqMap);
    if (ImageReqFetch != null) out.setImageReqFetch(ImageReqFetch);
    if (ImageReqSortDir != null) out.setImageReqSortDirection(ImageReqSortDir);
    if (ImageReqSortOrder != null) out.setImageReqSortOrder(ImageReqSortOrder);

    Filter[] ImageReqFilter = DataHelper.mapToFilterArray(ImageReqMap, Boolean.class);
    if (ImageReqFilter != null) {
      BooleanFilter[] ImageReqFilters = new BooleanFilter[ImageReqFilter.length];
      for (int i = 0; i < ImageReqFilters.length; i++) {
        ImageReqFilters[i] = (BooleanFilter)ImageReqFilter[i];
      }
      try {
        out.setImageReqFilter(ImageReqFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map ImageDoneMap = (Map)record.get("ImageDone");
    Boolean ImageDoneFetch = DataHelper.getFetch(ImageDoneMap);
    Boolean ImageDoneSortDir = DataHelper.getSortDirection(ImageDoneMap);
    Integer ImageDoneSortOrder = DataHelper.getSortOrder(ImageDoneMap);
    if (ImageDoneFetch != null) out.setImageDoneFetch(ImageDoneFetch);
    if (ImageDoneSortDir != null) out.setImageDoneSortDirection(ImageDoneSortDir);
    if (ImageDoneSortOrder != null) out.setImageDoneSortOrder(ImageDoneSortOrder);

    Filter[] ImageDoneFilter = DataHelper.mapToFilterArray(ImageDoneMap, Boolean.class);
    if (ImageDoneFilter != null) {
      BooleanFilter[] ImageDoneFilters = new BooleanFilter[ImageDoneFilter.length];
      for (int i = 0; i < ImageDoneFilters.length; i++) {
        ImageDoneFilters[i] = (BooleanFilter)ImageDoneFilter[i];
      }
      try {
        out.setImageDoneFilter(ImageDoneFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map SpecialCodeMap = (Map)record.get("SpecialCode");
    Boolean SpecialCodeFetch = DataHelper.getFetch(SpecialCodeMap);
    Boolean SpecialCodeSortDir = DataHelper.getSortDirection(SpecialCodeMap);
    Integer SpecialCodeSortOrder = DataHelper.getSortOrder(SpecialCodeMap);
    if (SpecialCodeFetch != null) out.setSpecialCodeFetch(SpecialCodeFetch);
    if (SpecialCodeSortDir != null) out.setSpecialCodeSortDirection(SpecialCodeSortDir);
    if (SpecialCodeSortOrder != null) out.setSpecialCodeSortOrder(SpecialCodeSortOrder);

    Filter[] SpecialCodeFilter = DataHelper.mapToFilterArray(SpecialCodeMap, Integer.class);
    if (SpecialCodeFilter != null) {
      IntegerFilter[] SpecialCodeFilters = new IntegerFilter[SpecialCodeFilter.length];
      for (int i = 0; i < SpecialCodeFilters.length; i++) {
        SpecialCodeFilters[i] = (IntegerFilter)SpecialCodeFilter[i];
      }
      try {
        out.setSpecialCodeFilter(SpecialCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepTaskMap = (Map)record.get("PrepTask");
    Boolean PrepTaskFetch = DataHelper.getFetch(PrepTaskMap);
    Boolean PrepTaskSortDir = DataHelper.getSortDirection(PrepTaskMap);
    Integer PrepTaskSortOrder = DataHelper.getSortOrder(PrepTaskMap);
    if (PrepTaskFetch != null) out.setPrepTaskFetch(PrepTaskFetch);
    if (PrepTaskSortDir != null) out.setPrepTaskSortDirection(PrepTaskSortDir);
    if (PrepTaskSortOrder != null) out.setPrepTaskSortOrder(PrepTaskSortOrder);

    Filter[] PrepTaskFilter = DataHelper.mapToFilterArray(PrepTaskMap, String.class);
    if (PrepTaskFilter != null) {
      StringFilter[] PrepTaskFilters = new StringFilter[PrepTaskFilter.length];
      for (int i = 0; i < PrepTaskFilters.length; i++) {
        PrepTaskFilters[i] = (StringFilter)PrepTaskFilter[i];
      }
      try {
        out.setPrepTaskFilter(PrepTaskFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepStatusMap = (Map)record.get("PrepStatus");
    Boolean PrepStatusFetch = DataHelper.getFetch(PrepStatusMap);
    Boolean PrepStatusSortDir = DataHelper.getSortDirection(PrepStatusMap);
    Integer PrepStatusSortOrder = DataHelper.getSortOrder(PrepStatusMap);
    if (PrepStatusFetch != null) out.setPrepStatusFetch(PrepStatusFetch);
    if (PrepStatusSortDir != null) out.setPrepStatusSortDirection(PrepStatusSortDir);
    if (PrepStatusSortOrder != null) out.setPrepStatusSortOrder(PrepStatusSortOrder);

    Filter[] PrepStatusFilter = DataHelper.mapToFilterArray(PrepStatusMap, Integer.class);
    if (PrepStatusFilter != null) {
      IntegerFilter[] PrepStatusFilters = new IntegerFilter[PrepStatusFilter.length];
      for (int i = 0; i < PrepStatusFilters.length; i++) {
        PrepStatusFilters[i] = (IntegerFilter)PrepStatusFilter[i];
      }
      try {
        out.setPrepStatusFilter(PrepStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FormatStatusMap = (Map)record.get("FormatStatus");
    Boolean FormatStatusFetch = DataHelper.getFetch(FormatStatusMap);
    Boolean FormatStatusSortDir = DataHelper.getSortDirection(FormatStatusMap);
    Integer FormatStatusSortOrder = DataHelper.getSortOrder(FormatStatusMap);
    if (FormatStatusFetch != null) out.setFormatStatusFetch(FormatStatusFetch);
    if (FormatStatusSortDir != null) out.setFormatStatusSortDirection(FormatStatusSortDir);
    if (FormatStatusSortOrder != null) out.setFormatStatusSortOrder(FormatStatusSortOrder);

    Filter[] FormatStatusFilter = DataHelper.mapToFilterArray(FormatStatusMap, Integer.class);
    if (FormatStatusFilter != null) {
      IntegerFilter[] FormatStatusFilters = new IntegerFilter[FormatStatusFilter.length];
      for (int i = 0; i < FormatStatusFilters.length; i++) {
        FormatStatusFilters[i] = (IntegerFilter)FormatStatusFilter[i];
      }
      try {
        out.setFormatStatusFilter(FormatStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DispatchCountMap = (Map)record.get("DispatchCount");
    Boolean DispatchCountFetch = DataHelper.getFetch(DispatchCountMap);
    Boolean DispatchCountSortDir = DataHelper.getSortDirection(DispatchCountMap);
    Integer DispatchCountSortOrder = DataHelper.getSortOrder(DispatchCountMap);
    if (DispatchCountFetch != null) out.setDispatchCountFetch(DispatchCountFetch);
    if (DispatchCountSortDir != null) out.setDispatchCountSortDirection(DispatchCountSortDir);
    if (DispatchCountSortOrder != null) out.setDispatchCountSortOrder(DispatchCountSortOrder);

    Filter[] DispatchCountFilter = DataHelper.mapToFilterArray(DispatchCountMap, Integer.class);
    if (DispatchCountFilter != null) {
      IntegerFilter[] DispatchCountFilters = new IntegerFilter[DispatchCountFilter.length];
      for (int i = 0; i < DispatchCountFilters.length; i++) {
        DispatchCountFilters[i] = (IntegerFilter)DispatchCountFilter[i];
      }
      try {
        out.setDispatchCountFilter(DispatchCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DispatchDateMap = (Map)record.get("DispatchDate");
    Boolean DispatchDateFetch = DataHelper.getFetch(DispatchDateMap);
    Boolean DispatchDateSortDir = DataHelper.getSortDirection(DispatchDateMap);
    Integer DispatchDateSortOrder = DataHelper.getSortOrder(DispatchDateMap);
    if (DispatchDateFetch != null) out.setDispatchDateFetch(DispatchDateFetch);
    if (DispatchDateSortDir != null) out.setDispatchDateSortDirection(DispatchDateSortDir);
    if (DispatchDateSortOrder != null) out.setDispatchDateSortOrder(DispatchDateSortOrder);

    Filter[] DispatchDateFilter = DataHelper.mapToFilterArray(DispatchDateMap, Date.class);
    if (DispatchDateFilter != null) {
      DateFilter[] DispatchDateFilters = new DateFilter[DispatchDateFilter.length];
      for (int i = 0; i < DispatchDateFilters.length; i++) {
        DispatchDateFilters[i] = (DateFilter)DispatchDateFilter[i];
      }
      try {
        out.setDispatchDateFilter(DispatchDateFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FileNameMap = (Map)record.get("FileName");
    Boolean FileNameFetch = DataHelper.getFetch(FileNameMap);
    Boolean FileNameSortDir = DataHelper.getSortDirection(FileNameMap);
    Integer FileNameSortOrder = DataHelper.getSortOrder(FileNameMap);
    if (FileNameFetch != null) out.setFileNameFetch(FileNameFetch);
    if (FileNameSortDir != null) out.setFileNameSortDirection(FileNameSortDir);
    if (FileNameSortOrder != null) out.setFileNameSortOrder(FileNameSortOrder);

    Filter[] FileNameFilter = DataHelper.mapToFilterArray(FileNameMap, String.class);
    if (FileNameFilter != null) {
      StringFilter[] FileNameFilters = new StringFilter[FileNameFilter.length];
      for (int i = 0; i < FileNameFilters.length; i++) {
        FileNameFilters[i] = (StringFilter)FileNameFilter[i];
      }
      try {
        out.setFileNameFilter(FileNameFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map StartOffsetMap = (Map)record.get("StartOffset");
    Boolean StartOffsetFetch = DataHelper.getFetch(StartOffsetMap);
    Boolean StartOffsetSortDir = DataHelper.getSortDirection(StartOffsetMap);
    Integer StartOffsetSortOrder = DataHelper.getSortOrder(StartOffsetMap);
    if (StartOffsetFetch != null) out.setStartOffsetFetch(StartOffsetFetch);
    if (StartOffsetSortDir != null) out.setStartOffsetSortDirection(StartOffsetSortDir);
    if (StartOffsetSortOrder != null) out.setStartOffsetSortOrder(StartOffsetSortOrder);

    Filter[] StartOffsetFilter = DataHelper.mapToFilterArray(StartOffsetMap, Integer.class);
    if (StartOffsetFilter != null) {
      IntegerFilter[] StartOffsetFilters = new IntegerFilter[StartOffsetFilter.length];
      for (int i = 0; i < StartOffsetFilters.length; i++) {
        StartOffsetFilters[i] = (IntegerFilter)StartOffsetFilter[i];
      }
      try {
        out.setStartOffsetFilter(StartOffsetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map EndOffsetMap = (Map)record.get("EndOffset");
    Boolean EndOffsetFetch = DataHelper.getFetch(EndOffsetMap);
    Boolean EndOffsetSortDir = DataHelper.getSortDirection(EndOffsetMap);
    Integer EndOffsetSortOrder = DataHelper.getSortOrder(EndOffsetMap);
    if (EndOffsetFetch != null) out.setEndOffsetFetch(EndOffsetFetch);
    if (EndOffsetSortDir != null) out.setEndOffsetSortDirection(EndOffsetSortDir);
    if (EndOffsetSortOrder != null) out.setEndOffsetSortOrder(EndOffsetSortOrder);

    Filter[] EndOffsetFilter = DataHelper.mapToFilterArray(EndOffsetMap, Integer.class);
    if (EndOffsetFilter != null) {
      IntegerFilter[] EndOffsetFilters = new IntegerFilter[EndOffsetFilter.length];
      for (int i = 0; i < EndOffsetFilters.length; i++) {
        EndOffsetFilters[i] = (IntegerFilter)EndOffsetFilter[i];
      }
      try {
        out.setEndOffsetFilter(EndOffsetFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PageCountMap = (Map)record.get("PageCount");
    Boolean PageCountFetch = DataHelper.getFetch(PageCountMap);
    Boolean PageCountSortDir = DataHelper.getSortDirection(PageCountMap);
    Integer PageCountSortOrder = DataHelper.getSortOrder(PageCountMap);
    if (PageCountFetch != null) out.setPageCountFetch(PageCountFetch);
    if (PageCountSortDir != null) out.setPageCountSortDirection(PageCountSortDir);
    if (PageCountSortOrder != null) out.setPageCountSortOrder(PageCountSortOrder);

    Filter[] PageCountFilter = DataHelper.mapToFilterArray(PageCountMap, Integer.class);
    if (PageCountFilter != null) {
      IntegerFilter[] PageCountFilters = new IntegerFilter[PageCountFilter.length];
      for (int i = 0; i < PageCountFilters.length; i++) {
        PageCountFilters[i] = (IntegerFilter)PageCountFilter[i];
      }
      try {
        out.setPageCountFilter(PageCountFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillHoldCodeMap = (Map)record.get("BillHoldCode");
    Boolean BillHoldCodeFetch = DataHelper.getFetch(BillHoldCodeMap);
    Boolean BillHoldCodeSortDir = DataHelper.getSortDirection(BillHoldCodeMap);
    Integer BillHoldCodeSortOrder = DataHelper.getSortOrder(BillHoldCodeMap);
    if (BillHoldCodeFetch != null) out.setBillHoldCodeFetch(BillHoldCodeFetch);
    if (BillHoldCodeSortDir != null) out.setBillHoldCodeSortDirection(BillHoldCodeSortDir);
    if (BillHoldCodeSortOrder != null) out.setBillHoldCodeSortOrder(BillHoldCodeSortOrder);

    Filter[] BillHoldCodeFilter = DataHelper.mapToFilterArray(BillHoldCodeMap, Integer.class);
    if (BillHoldCodeFilter != null) {
      IntegerFilter[] BillHoldCodeFilters = new IntegerFilter[BillHoldCodeFilter.length];
      for (int i = 0; i < BillHoldCodeFilters.length; i++) {
        BillHoldCodeFilters[i] = (IntegerFilter)BillHoldCodeFilter[i];
      }
      try {
        out.setBillHoldCodeFilter(BillHoldCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map PrepErrorCodeMap = (Map)record.get("PrepErrorCode");
    Boolean PrepErrorCodeFetch = DataHelper.getFetch(PrepErrorCodeMap);
    Boolean PrepErrorCodeSortDir = DataHelper.getSortDirection(PrepErrorCodeMap);
    Integer PrepErrorCodeSortOrder = DataHelper.getSortOrder(PrepErrorCodeMap);
    if (PrepErrorCodeFetch != null) out.setPrepErrorCodeFetch(PrepErrorCodeFetch);
    if (PrepErrorCodeSortDir != null) out.setPrepErrorCodeSortDirection(PrepErrorCodeSortDir);
    if (PrepErrorCodeSortOrder != null) out.setPrepErrorCodeSortOrder(PrepErrorCodeSortOrder);

    Filter[] PrepErrorCodeFilter = DataHelper.mapToFilterArray(PrepErrorCodeMap, Integer.class);
    if (PrepErrorCodeFilter != null) {
      IntegerFilter[] PrepErrorCodeFilters = new IntegerFilter[PrepErrorCodeFilter.length];
      for (int i = 0; i < PrepErrorCodeFilters.length; i++) {
        PrepErrorCodeFilters[i] = (IntegerFilter)PrepErrorCodeFilter[i];
      }
      try {
        out.setPrepErrorCodeFilter(PrepErrorCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map FormatErrorCodeMap = (Map)record.get("FormatErrorCode");
    Boolean FormatErrorCodeFetch = DataHelper.getFetch(FormatErrorCodeMap);
    Boolean FormatErrorCodeSortDir = DataHelper.getSortDirection(FormatErrorCodeMap);
    Integer FormatErrorCodeSortOrder = DataHelper.getSortOrder(FormatErrorCodeMap);
    if (FormatErrorCodeFetch != null) out.setFormatErrorCodeFetch(FormatErrorCodeFetch);
    if (FormatErrorCodeSortDir != null) out.setFormatErrorCodeSortDirection(FormatErrorCodeSortDir);
    if (FormatErrorCodeSortOrder != null) out.setFormatErrorCodeSortOrder(FormatErrorCodeSortOrder);

    Filter[] FormatErrorCodeFilter = DataHelper.mapToFilterArray(FormatErrorCodeMap, Integer.class);
    if (FormatErrorCodeFilter != null) {
      IntegerFilter[] FormatErrorCodeFilters = new IntegerFilter[FormatErrorCodeFilter.length];
      for (int i = 0; i < FormatErrorCodeFilters.length; i++) {
        FormatErrorCodeFilters[i] = (IntegerFilter)FormatErrorCodeFilter[i];
      }
      try {
        out.setFormatErrorCodeFilter(FormatErrorCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BackoutStatusMap = (Map)record.get("BackoutStatus");
    Boolean BackoutStatusFetch = DataHelper.getFetch(BackoutStatusMap);
    Boolean BackoutStatusSortDir = DataHelper.getSortDirection(BackoutStatusMap);
    Integer BackoutStatusSortOrder = DataHelper.getSortOrder(BackoutStatusMap);
    if (BackoutStatusFetch != null) out.setBackoutStatusFetch(BackoutStatusFetch);
    if (BackoutStatusSortDir != null) out.setBackoutStatusSortDirection(BackoutStatusSortDir);
    if (BackoutStatusSortOrder != null) out.setBackoutStatusSortOrder(BackoutStatusSortOrder);

    Filter[] BackoutStatusFilter = DataHelper.mapToFilterArray(BackoutStatusMap, Integer.class);
    if (BackoutStatusFilter != null) {
      IntegerFilter[] BackoutStatusFilters = new IntegerFilter[BackoutStatusFilter.length];
      for (int i = 0; i < BackoutStatusFilters.length; i++) {
        BackoutStatusFilters[i] = (IntegerFilter)BackoutStatusFilter[i];
      }
      try {
        out.setBackoutStatusFilter(BackoutStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map CopyTypeMap = (Map)record.get("CopyType");
    Boolean CopyTypeFetch = DataHelper.getFetch(CopyTypeMap);
    Boolean CopyTypeSortDir = DataHelper.getSortDirection(CopyTypeMap);
    Integer CopyTypeSortOrder = DataHelper.getSortOrder(CopyTypeMap);
    if (CopyTypeFetch != null) out.setCopyTypeFetch(CopyTypeFetch);
    if (CopyTypeSortDir != null) out.setCopyTypeSortDirection(CopyTypeSortDir);
    if (CopyTypeSortOrder != null) out.setCopyTypeSortOrder(CopyTypeSortOrder);

    Filter[] CopyTypeFilter = DataHelper.mapToFilterArray(CopyTypeMap, Integer.class);
    if (CopyTypeFilter != null) {
      IntegerFilter[] CopyTypeFilters = new IntegerFilter[CopyTypeFilter.length];
      for (int i = 0; i < CopyTypeFilters.length; i++) {
        CopyTypeFilters[i] = (IntegerFilter)CopyTypeFilter[i];
      }
      try {
        out.setCopyTypeFilter(CopyTypeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map OrigBillRefnoMap = (Map)record.get("OrigBillRefno");
    Boolean OrigBillRefnoFetch = DataHelper.getFetch(OrigBillRefnoMap);
    Boolean OrigBillRefnoSortDir = DataHelper.getSortDirection(OrigBillRefnoMap);
    Integer OrigBillRefnoSortOrder = DataHelper.getSortOrder(OrigBillRefnoMap);
    if (OrigBillRefnoFetch != null) out.setOrigBillRefnoFetch(OrigBillRefnoFetch);
    if (OrigBillRefnoSortDir != null) out.setOrigBillRefnoSortDirection(OrigBillRefnoSortDir);
    if (OrigBillRefnoSortOrder != null) out.setOrigBillRefnoSortOrder(OrigBillRefnoSortOrder);

    Filter[] OrigBillRefnoFilter = DataHelper.mapToFilterArray(OrigBillRefnoMap, Integer.class);
    if (OrigBillRefnoFilter != null) {
      IntegerFilter[] OrigBillRefnoFilters = new IntegerFilter[OrigBillRefnoFilter.length];
      for (int i = 0; i < OrigBillRefnoFilters.length; i++) {
        OrigBillRefnoFilters[i] = (IntegerFilter)OrigBillRefnoFilter[i];
      }
      try {
        out.setOrigBillRefnoFilter(OrigBillRefnoFilters);
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
  
    Map CollectionHistoryMap = (Map)record.get("CollectionHistory");
    Boolean CollectionHistoryFetch = DataHelper.getFetch(CollectionHistoryMap);
    Boolean CollectionHistorySortDir = DataHelper.getSortDirection(CollectionHistoryMap);
    Integer CollectionHistorySortOrder = DataHelper.getSortOrder(CollectionHistoryMap);
    if (CollectionHistoryFetch != null) out.setCollectionHistoryFetch(CollectionHistoryFetch);
    if (CollectionHistorySortDir != null) out.setCollectionHistorySortDirection(CollectionHistorySortDir);
    if (CollectionHistorySortOrder != null) out.setCollectionHistorySortOrder(CollectionHistorySortOrder);

    Filter[] CollectionHistoryFilter = DataHelper.mapToFilterArray(CollectionHistoryMap, String.class);
    if (CollectionHistoryFilter != null) {
      StringFilter[] CollectionHistoryFilters = new StringFilter[CollectionHistoryFilter.length];
      for (int i = 0; i < CollectionHistoryFilters.length; i++) {
        CollectionHistoryFilters[i] = (StringFilter)CollectionHistoryFilter[i];
      }
      try {
        out.setCollectionHistoryFilter(CollectionHistoryFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map JnlEarnedThruDtMap = (Map)record.get("JnlEarnedThruDt");
    Boolean JnlEarnedThruDtFetch = DataHelper.getFetch(JnlEarnedThruDtMap);
    Boolean JnlEarnedThruDtSortDir = DataHelper.getSortDirection(JnlEarnedThruDtMap);
    Integer JnlEarnedThruDtSortOrder = DataHelper.getSortOrder(JnlEarnedThruDtMap);
    if (JnlEarnedThruDtFetch != null) out.setJnlEarnedThruDtFetch(JnlEarnedThruDtFetch);
    if (JnlEarnedThruDtSortDir != null) out.setJnlEarnedThruDtSortDirection(JnlEarnedThruDtSortDir);
    if (JnlEarnedThruDtSortOrder != null) out.setJnlEarnedThruDtSortOrder(JnlEarnedThruDtSortOrder);

    Filter[] JnlEarnedThruDtFilter = DataHelper.mapToFilterArray(JnlEarnedThruDtMap, Date.class);
    if (JnlEarnedThruDtFilter != null) {
      DateFilter[] JnlEarnedThruDtFilters = new DateFilter[JnlEarnedThruDtFilter.length];
      for (int i = 0; i < JnlEarnedThruDtFilters.length; i++) {
        JnlEarnedThruDtFilters[i] = (DateFilter)JnlEarnedThruDtFilter[i];
      }
      try {
        out.setJnlEarnedThruDtFilter(JnlEarnedThruDtFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map JnlStatusMap = (Map)record.get("JnlStatus");
    Boolean JnlStatusFetch = DataHelper.getFetch(JnlStatusMap);
    Boolean JnlStatusSortDir = DataHelper.getSortDirection(JnlStatusMap);
    Integer JnlStatusSortOrder = DataHelper.getSortOrder(JnlStatusMap);
    if (JnlStatusFetch != null) out.setJnlStatusFetch(JnlStatusFetch);
    if (JnlStatusSortDir != null) out.setJnlStatusSortDirection(JnlStatusSortDir);
    if (JnlStatusSortOrder != null) out.setJnlStatusSortOrder(JnlStatusSortOrder);

    Filter[] JnlStatusFilter = DataHelper.mapToFilterArray(JnlStatusMap, Integer.class);
    if (JnlStatusFilter != null) {
      IntegerFilter[] JnlStatusFilters = new IntegerFilter[JnlStatusFilter.length];
      for (int i = 0; i < JnlStatusFilters.length; i++) {
        JnlStatusFilters[i] = (IntegerFilter)JnlStatusFilter[i];
      }
      try {
        out.setJnlStatusFilter(JnlStatusFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map TestFlagMap = (Map)record.get("TestFlag");
    Boolean TestFlagFetch = DataHelper.getFetch(TestFlagMap);
    Boolean TestFlagSortDir = DataHelper.getSortDirection(TestFlagMap);
    Integer TestFlagSortOrder = DataHelper.getSortOrder(TestFlagMap);
    if (TestFlagFetch != null) out.setTestFlagFetch(TestFlagFetch);
    if (TestFlagSortDir != null) out.setTestFlagSortDirection(TestFlagSortDir);
    if (TestFlagSortOrder != null) out.setTestFlagSortOrder(TestFlagSortOrder);

    Filter[] TestFlagFilter = DataHelper.mapToFilterArray(TestFlagMap, Boolean.class);
    if (TestFlagFilter != null) {
      BooleanFilter[] TestFlagFilters = new BooleanFilter[TestFlagFilter.length];
      for (int i = 0; i < TestFlagFilters.length; i++) {
        TestFlagFilters[i] = (BooleanFilter)TestFlagFilter[i];
      }
      try {
        out.setTestFlagFilter(TestFlagFilters);
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
  
    Map InterimBillFlagMap = (Map)record.get("InterimBillFlag");
    Boolean InterimBillFlagFetch = DataHelper.getFetch(InterimBillFlagMap);
    Boolean InterimBillFlagSortDir = DataHelper.getSortDirection(InterimBillFlagMap);
    Integer InterimBillFlagSortOrder = DataHelper.getSortOrder(InterimBillFlagMap);
    if (InterimBillFlagFetch != null) out.setInterimBillFlagFetch(InterimBillFlagFetch);
    if (InterimBillFlagSortDir != null) out.setInterimBillFlagSortDirection(InterimBillFlagSortDir);
    if (InterimBillFlagSortOrder != null) out.setInterimBillFlagSortOrder(InterimBillFlagSortOrder);

    Filter[] InterimBillFlagFilter = DataHelper.mapToFilterArray(InterimBillFlagMap, Boolean.class);
    if (InterimBillFlagFilter != null) {
      BooleanFilter[] InterimBillFlagFilters = new BooleanFilter[InterimBillFlagFilter.length];
      for (int i = 0; i < InterimBillFlagFilters.length; i++) {
        InterimBillFlagFilters[i] = (BooleanFilter)InterimBillFlagFilter[i];
      }
      try {
        out.setInterimBillFlagFilter(InterimBillFlagFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludeNrcMap = (Map)record.get("IncludeNrc");
    Boolean IncludeNrcFetch = DataHelper.getFetch(IncludeNrcMap);
    Boolean IncludeNrcSortDir = DataHelper.getSortDirection(IncludeNrcMap);
    Integer IncludeNrcSortOrder = DataHelper.getSortOrder(IncludeNrcMap);
    if (IncludeNrcFetch != null) out.setIncludeNrcFetch(IncludeNrcFetch);
    if (IncludeNrcSortDir != null) out.setIncludeNrcSortDirection(IncludeNrcSortDir);
    if (IncludeNrcSortOrder != null) out.setIncludeNrcSortOrder(IncludeNrcSortOrder);

    Filter[] IncludeNrcFilter = DataHelper.mapToFilterArray(IncludeNrcMap, Boolean.class);
    if (IncludeNrcFilter != null) {
      BooleanFilter[] IncludeNrcFilters = new BooleanFilter[IncludeNrcFilter.length];
      for (int i = 0; i < IncludeNrcFilters.length; i++) {
        IncludeNrcFilters[i] = (BooleanFilter)IncludeNrcFilter[i];
      }
      try {
        out.setIncludeNrcFilter(IncludeNrcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludeRcMap = (Map)record.get("IncludeRc");
    Boolean IncludeRcFetch = DataHelper.getFetch(IncludeRcMap);
    Boolean IncludeRcSortDir = DataHelper.getSortDirection(IncludeRcMap);
    Integer IncludeRcSortOrder = DataHelper.getSortOrder(IncludeRcMap);
    if (IncludeRcFetch != null) out.setIncludeRcFetch(IncludeRcFetch);
    if (IncludeRcSortDir != null) out.setIncludeRcSortDirection(IncludeRcSortDir);
    if (IncludeRcSortOrder != null) out.setIncludeRcSortOrder(IncludeRcSortOrder);

    Filter[] IncludeRcFilter = DataHelper.mapToFilterArray(IncludeRcMap, Boolean.class);
    if (IncludeRcFilter != null) {
      BooleanFilter[] IncludeRcFilters = new BooleanFilter[IncludeRcFilter.length];
      for (int i = 0; i < IncludeRcFilters.length; i++) {
        IncludeRcFilters[i] = (BooleanFilter)IncludeRcFilter[i];
      }
      try {
        out.setIncludeRcFilter(IncludeRcFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludeAdjMap = (Map)record.get("IncludeAdj");
    Boolean IncludeAdjFetch = DataHelper.getFetch(IncludeAdjMap);
    Boolean IncludeAdjSortDir = DataHelper.getSortDirection(IncludeAdjMap);
    Integer IncludeAdjSortOrder = DataHelper.getSortOrder(IncludeAdjMap);
    if (IncludeAdjFetch != null) out.setIncludeAdjFetch(IncludeAdjFetch);
    if (IncludeAdjSortDir != null) out.setIncludeAdjSortDirection(IncludeAdjSortDir);
    if (IncludeAdjSortOrder != null) out.setIncludeAdjSortOrder(IncludeAdjSortOrder);

    Filter[] IncludeAdjFilter = DataHelper.mapToFilterArray(IncludeAdjMap, Boolean.class);
    if (IncludeAdjFilter != null) {
      BooleanFilter[] IncludeAdjFilters = new BooleanFilter[IncludeAdjFilter.length];
      for (int i = 0; i < IncludeAdjFilters.length; i++) {
        IncludeAdjFilters[i] = (BooleanFilter)IncludeAdjFilter[i];
      }
      try {
        out.setIncludeAdjFilter(IncludeAdjFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludeUsageMap = (Map)record.get("IncludeUsage");
    Boolean IncludeUsageFetch = DataHelper.getFetch(IncludeUsageMap);
    Boolean IncludeUsageSortDir = DataHelper.getSortDirection(IncludeUsageMap);
    Integer IncludeUsageSortOrder = DataHelper.getSortOrder(IncludeUsageMap);
    if (IncludeUsageFetch != null) out.setIncludeUsageFetch(IncludeUsageFetch);
    if (IncludeUsageSortDir != null) out.setIncludeUsageSortDirection(IncludeUsageSortDir);
    if (IncludeUsageSortOrder != null) out.setIncludeUsageSortOrder(IncludeUsageSortOrder);

    Filter[] IncludeUsageFilter = DataHelper.mapToFilterArray(IncludeUsageMap, Boolean.class);
    if (IncludeUsageFilter != null) {
      BooleanFilter[] IncludeUsageFilters = new BooleanFilter[IncludeUsageFilter.length];
      for (int i = 0; i < IncludeUsageFilters.length; i++) {
        IncludeUsageFilters[i] = (BooleanFilter)IncludeUsageFilter[i];
      }
      try {
        out.setIncludeUsageFilter(IncludeUsageFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map IncludePaymentMap = (Map)record.get("IncludePayment");
    Boolean IncludePaymentFetch = DataHelper.getFetch(IncludePaymentMap);
    Boolean IncludePaymentSortDir = DataHelper.getSortDirection(IncludePaymentMap);
    Integer IncludePaymentSortOrder = DataHelper.getSortOrder(IncludePaymentMap);
    if (IncludePaymentFetch != null) out.setIncludePaymentFetch(IncludePaymentFetch);
    if (IncludePaymentSortDir != null) out.setIncludePaymentSortDirection(IncludePaymentSortDir);
    if (IncludePaymentSortOrder != null) out.setIncludePaymentSortOrder(IncludePaymentSortOrder);

    Filter[] IncludePaymentFilter = DataHelper.mapToFilterArray(IncludePaymentMap, Boolean.class);
    if (IncludePaymentFilter != null) {
      BooleanFilter[] IncludePaymentFilters = new BooleanFilter[IncludePaymentFilter.length];
      for (int i = 0; i < IncludePaymentFilters.length; i++) {
        IncludePaymentFilters[i] = (BooleanFilter)IncludePaymentFilter[i];
      }
      try {
        out.setIncludePaymentFilter(IncludePaymentFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map LanguageCodeMap = (Map)record.get("LanguageCode");
    Boolean LanguageCodeFetch = DataHelper.getFetch(LanguageCodeMap);
    Boolean LanguageCodeSortDir = DataHelper.getSortDirection(LanguageCodeMap);
    Integer LanguageCodeSortOrder = DataHelper.getSortOrder(LanguageCodeMap);
    if (LanguageCodeFetch != null) out.setLanguageCodeFetch(LanguageCodeFetch);
    if (LanguageCodeSortDir != null) out.setLanguageCodeSortDirection(LanguageCodeSortDir);
    if (LanguageCodeSortOrder != null) out.setLanguageCodeSortOrder(LanguageCodeSortOrder);

    Filter[] LanguageCodeFilter = DataHelper.mapToFilterArray(LanguageCodeMap, Integer.class);
    if (LanguageCodeFilter != null) {
      IntegerFilter[] LanguageCodeFilters = new IntegerFilter[LanguageCodeFilter.length];
      for (int i = 0; i < LanguageCodeFilters.length; i++) {
        LanguageCodeFilters[i] = (IntegerFilter)LanguageCodeFilter[i];
      }
      try {
        out.setLanguageCodeFilter(LanguageCodeFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map BillConvertedMap = (Map)record.get("BillConverted");
    Boolean BillConvertedFetch = DataHelper.getFetch(BillConvertedMap);
    Boolean BillConvertedSortDir = DataHelper.getSortDirection(BillConvertedMap);
    Integer BillConvertedSortOrder = DataHelper.getSortOrder(BillConvertedMap);
    if (BillConvertedFetch != null) out.setBillConvertedFetch(BillConvertedFetch);
    if (BillConvertedSortDir != null) out.setBillConvertedSortDirection(BillConvertedSortDir);
    if (BillConvertedSortOrder != null) out.setBillConvertedSortOrder(BillConvertedSortOrder);

    Filter[] BillConvertedFilter = DataHelper.mapToFilterArray(BillConvertedMap, Integer.class);
    if (BillConvertedFilter != null) {
      IntegerFilter[] BillConvertedFilters = new IntegerFilter[BillConvertedFilter.length];
      for (int i = 0; i < BillConvertedFilters.length; i++) {
        BillConvertedFilters[i] = (IntegerFilter)BillConvertedFilter[i];
      }
      try {
        out.setBillConvertedFilter(BillConvertedFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map WarmBillFlagMap = (Map)record.get("WarmBillFlag");
    Boolean WarmBillFlagFetch = DataHelper.getFetch(WarmBillFlagMap);
    Boolean WarmBillFlagSortDir = DataHelper.getSortDirection(WarmBillFlagMap);
    Integer WarmBillFlagSortOrder = DataHelper.getSortOrder(WarmBillFlagMap);
    if (WarmBillFlagFetch != null) out.setWarmBillFlagFetch(WarmBillFlagFetch);
    if (WarmBillFlagSortDir != null) out.setWarmBillFlagSortDirection(WarmBillFlagSortDir);
    if (WarmBillFlagSortOrder != null) out.setWarmBillFlagSortOrder(WarmBillFlagSortOrder);

    Filter[] WarmBillFlagFilter = DataHelper.mapToFilterArray(WarmBillFlagMap, Boolean.class);
    if (WarmBillFlagFilter != null) {
      BooleanFilter[] WarmBillFlagFilters = new BooleanFilter[WarmBillFlagFilter.length];
      for (int i = 0; i < WarmBillFlagFilters.length; i++) {
        WarmBillFlagFilters[i] = (BooleanFilter)WarmBillFlagFilter[i];
      }
      try {
        out.setWarmBillFlagFilter(WarmBillFlagFilters);
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
  
    Map BillFmtOptMap = (Map)record.get("BillFmtOpt");
    Boolean BillFmtOptFetch = DataHelper.getFetch(BillFmtOptMap);
    Boolean BillFmtOptSortDir = DataHelper.getSortDirection(BillFmtOptMap);
    Integer BillFmtOptSortOrder = DataHelper.getSortOrder(BillFmtOptMap);
    if (BillFmtOptFetch != null) out.setBillFmtOptFetch(BillFmtOptFetch);
    if (BillFmtOptSortDir != null) out.setBillFmtOptSortDirection(BillFmtOptSortDir);
    if (BillFmtOptSortOrder != null) out.setBillFmtOptSortOrder(BillFmtOptSortOrder);

    Filter[] BillFmtOptFilter = DataHelper.mapToFilterArray(BillFmtOptMap, Integer.class);
    if (BillFmtOptFilter != null) {
      IntegerFilter[] BillFmtOptFilters = new IntegerFilter[BillFmtOptFilter.length];
      for (int i = 0; i < BillFmtOptFilters.length; i++) {
        BillFmtOptFilters[i] = (IntegerFilter)BillFmtOptFilter[i];
      }
      try {
        out.setBillFmtOptFilter(BillFmtOptFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    Map DocumentServerIdMap = (Map)record.get("DocumentServerId");
    Boolean DocumentServerIdFetch = DataHelper.getFetch(DocumentServerIdMap);
    Boolean DocumentServerIdSortDir = DataHelper.getSortDirection(DocumentServerIdMap);
    Integer DocumentServerIdSortOrder = DataHelper.getSortOrder(DocumentServerIdMap);
    if (DocumentServerIdFetch != null) out.setDocumentServerIdFetch(DocumentServerIdFetch);
    if (DocumentServerIdSortDir != null) out.setDocumentServerIdSortDirection(DocumentServerIdSortDir);
    if (DocumentServerIdSortOrder != null) out.setDocumentServerIdSortOrder(DocumentServerIdSortOrder);

    Filter[] DocumentServerIdFilter = DataHelper.mapToFilterArray(DocumentServerIdMap, Integer.class);
    if (DocumentServerIdFilter != null) {
      IntegerFilter[] DocumentServerIdFilters = new IntegerFilter[DocumentServerIdFilter.length];
      for (int i = 0; i < DocumentServerIdFilters.length; i++) {
        DocumentServerIdFilters[i] = (IntegerFilter)DocumentServerIdFilter[i];
      }
      try {
        out.setDocumentServerIdFilter(DocumentServerIdFilters);
      } catch (Exception x) {
        x.printStackTrace();
      }
    }
  
    return out;
  }
}
