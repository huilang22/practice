/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnappliedPaymentObjectFilter.java
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

import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import com.csgsystems.aruba.connection.ServiceException;

import com.csgsystems.aruba.filter.*;
import com.csgsystems.aruba.Filter;

import com.csgsystems.api.base.BaseHelper;

import com.csgsystems.api.utilities.FilterConversionHelper;
import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseFilter;


import com.csgsystems.bali.BaliObjectFilter;

/** Filter object */
public class UnappliedPaymentObjectFilter  extends BaseFilter  implements Serializable
{
  /** the key filter */
  public UnappliedPaymentObjectKeyFilter Key = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id) */
  public    StringFilter[] AccountExternalId  = null;
  protected boolean AccountExternalIdFetch = false;
  protected boolean AccountExternalIdSortAscending = true;
  protected boolean AccountExternalIdCaseInsensitive = false;
  protected Integer AccountExternalIdSort = null;
  /** raw field for: CUSTOMER_ID_ACCT_MAP.external_id_type) */
  public    IntegerFilter[] AccountExternalIdType  = null;
  protected boolean AccountExternalIdTypeFetch = false;
  protected boolean AccountExternalIdTypeSortAscending = true;
  protected Integer AccountExternalIdTypeSort = null;
  /** raw field for: BMF_UNAPPLIED.account_no) */
  public    IntegerFilter[] AccountInternalId  = null;
  protected boolean AccountInternalIdFetch = false;
  protected boolean AccountInternalIdSortAscending = true;
  protected Integer AccountInternalIdSort = null;
  /** raw field for: BMF_UNAPPLIED.applied_status) */
  public    BooleanFilter[] AppliedStatus  = null;
  protected boolean AppliedStatusFetch = false;
  protected boolean AppliedStatusSortAscending = true;
  protected Integer AppliedStatusSort = null;
  /** raw field for: BMF_UNAPPLIED.bmf_tracking_id) */
  public    IntegerFilter[] BmfTrackingId  = null;
  protected boolean BmfTrackingIdFetch = false;
  protected boolean BmfTrackingIdSortAscending = true;
  protected Integer BmfTrackingIdSort = null;
  /** raw field for: BMF_UNAPPLIED.bmf_tracking_id_serv) */
  public    IntegerFilter[] BmfTrackingIdServ  = null;
  protected boolean BmfTrackingIdServFetch = false;
  protected boolean BmfTrackingIdServSortAscending = true;
  protected Integer BmfTrackingIdServSort = null;
  /** raw field for: BMF_UNAPPLIED.bmf_error_text) */
  public    StringFilter[] BmfErrorText  = null;
  protected boolean BmfErrorTextFetch = false;
  protected boolean BmfErrorTextSortAscending = true;
  protected boolean BmfErrorTextCaseInsensitive = false;
  protected Integer BmfErrorTextSort = null;
  /** raw field for: BMF_UNAPPLIED.orig_bill_ref_no) */
  public    IntegerFilter[] OrigBillRefNo  = null;
  protected boolean OrigBillRefNoFetch = false;
  protected boolean OrigBillRefNoSortAscending = true;
  protected Integer OrigBillRefNoSort = null;
  /** raw field for: BMF_UNAPPLIED.orig_bill_ref_resets) */
  public    IntegerFilter[] OrigBillRefResets  = null;
  protected boolean OrigBillRefResetsFetch = false;
  protected boolean OrigBillRefResetsSortAscending = true;
  protected Integer OrigBillRefResetsSort = null;
  /** raw field for: BMF_UNAPPLIED.cr_note_bill_ref_no) */
  public    IntegerFilter[] CrNoteBillRefNo  = null;
  protected boolean CrNoteBillRefNoFetch = false;
  protected boolean CrNoteBillRefNoSortAscending = true;
  protected Integer CrNoteBillRefNoSort = null;
  /** raw field for: BMF_UNAPPLIED.cr_note_bill_ref_resets) */
  public    IntegerFilter[] CrNoteBillRefResets  = null;
  protected boolean CrNoteBillRefResetsFetch = false;
  protected boolean CrNoteBillRefResetsSortAscending = true;
  protected Integer CrNoteBillRefResetsSort = null;
  /** raw field for: BMF_UNAPPLIED.bmf_trans_type) */
  public    IntegerFilter[] BmfTransType  = null;
  protected boolean BmfTransTypeFetch = false;
  protected boolean BmfTransTypeSortAscending = true;
  protected Integer BmfTransTypeSort = null;
  /** raw field for: BMF_UNAPPLIED.trans_date) */
  public    DateFilter[] TransDate  = null;
  protected boolean TransDateFetch = false;
  protected boolean TransDateSortAscending = true;
  protected Integer TransDateSort = null;
  /** raw field for: BMF_UNAPPLIED.post_date) */
  public    DateFilter[] PostDate  = null;
  protected boolean PostDateFetch = false;
  protected boolean PostDateSortAscending = true;
  protected Integer PostDateSort = null;
  /** raw field for: BMF_UNAPPLIED.currency_code) */
  public    IntegerFilter[] CurrencyCode  = null;
  protected boolean CurrencyCodeFetch = false;
  protected boolean CurrencyCodeSortAscending = true;
  protected Integer CurrencyCodeSort = null;
  /** raw field for: BMF_UNAPPLIED.trans_amount) */
  public    BigIntegerFilter[] TransAmount  = null;
  protected boolean TransAmountFetch = false;
  protected boolean TransAmountSortAscending = true;
  protected Integer TransAmountSort = null;
  /** raw field for: BMF_UNAPPLIED.gl_amount) */
  public    BigIntegerFilter[] GlAmount  = null;
  protected boolean GlAmountFetch = false;
  protected boolean GlAmountSortAscending = true;
  protected Integer GlAmountSort = null;
  /** raw field for: BMF_UNAPPLIED.orig_tracking_id) */
  public    IntegerFilter[] OrigTrackingId  = null;
  protected boolean OrigTrackingIdFetch = false;
  protected boolean OrigTrackingIdSortAscending = true;
  protected Integer OrigTrackingIdSort = null;
  /** raw field for: BMF_UNAPPLIED.orig_tracking_id_serv) */
  public    IntegerFilter[] OrigTrackingIdServ  = null;
  protected boolean OrigTrackingIdServFetch = false;
  protected boolean OrigTrackingIdServSortAscending = true;
  protected Integer OrigTrackingIdServSort = null;
  /** raw field for: BMF_UNAPPLIED.trans_source) */
  public    IntegerFilter[] TransSource  = null;
  protected boolean TransSourceFetch = false;
  protected boolean TransSourceSortAscending = true;
  protected Integer TransSourceSort = null;
  /** raw field for: BMF_UNAPPLIED.source_type) */
  public    IntegerFilter[] SourceType  = null;
  protected boolean SourceTypeFetch = false;
  protected boolean SourceTypeSortAscending = true;
  protected Integer SourceTypeSort = null;
  /** raw field for: BMF_UNAPPLIED.source_id) */
  public    IntegerFilter[] SourceId  = null;
  protected boolean SourceIdFetch = false;
  protected boolean SourceIdSortAscending = true;
  protected Integer SourceIdSort = null;
  /** raw field for: BMF_UNAPPLIED.source_id_serv) */
  public    IntegerFilter[] SourceIdServ  = null;
  protected boolean SourceIdServFetch = false;
  protected boolean SourceIdServSortAscending = true;
  protected Integer SourceIdServSort = null;
  /** raw field for: BMF_UNAPPLIED.batch_id) */
  public    StringFilter[] BatchId  = null;
  protected boolean BatchIdFetch = false;
  protected boolean BatchIdSortAscending = true;
  protected boolean BatchIdCaseInsensitive = false;
  protected Integer BatchIdSort = null;
  /** raw field for: BMF_UNAPPLIED.batch_id_serv) */
  public    IntegerFilter[] BatchIdServ  = null;
  protected boolean BatchIdServFetch = false;
  protected boolean BatchIdServSortAscending = true;
  protected Integer BatchIdServSort = null;
  /** raw field for: BMF_UNAPPLIED.trans_submitter) */
  public    StringFilter[] TransSubmitter  = null;
  protected boolean TransSubmitterFetch = false;
  protected boolean TransSubmitterSortAscending = true;
  protected boolean TransSubmitterCaseInsensitive = false;
  protected Integer TransSubmitterSort = null;
  /** raw field for: BMF_UNAPPLIED.chg_date) */
  public    DateFilter[] ChgDate  = null;
  protected boolean ChgDateFetch = false;
  protected boolean ChgDateSortAscending = true;
  protected Integer ChgDateSort = null;
  /** raw field for: BMF_UNAPPLIED.action_code) */
  public    StringFilter[] ActionCode  = null;
  protected boolean ActionCodeFetch = false;
  protected boolean ActionCodeSortAscending = true;
  protected boolean ActionCodeCaseInsensitive = false;
  protected Integer ActionCodeSort = null;
  /** raw field for: BMF_UNAPPLIED.profile_id) */
  public    BigIntegerFilter[] ProfileId  = null;
  protected boolean ProfileIdFetch = false;
  protected boolean ProfileIdSortAscending = true;
  protected Integer ProfileIdSort = null;
  /** raw field for: BMF_UNAPPLIED.micr_bank_id) */
  public    StringFilter[] MicrBankId  = null;
  protected boolean MicrBankIdFetch = false;
  protected boolean MicrBankIdSortAscending = true;
  protected boolean MicrBankIdCaseInsensitive = false;
  protected Integer MicrBankIdSort = null;
  /** raw field for: BMF_UNAPPLIED.micr_dda_num) */
  public    StringFilter[] MicrDdaNum  = null;
  protected boolean MicrDdaNumFetch = false;
  protected boolean MicrDdaNumSortAscending = true;
  protected boolean MicrDdaNumCaseInsensitive = false;
  protected Integer MicrDdaNumSort = null;
  /** raw field for: BMF_UNAPPLIED.micr_check_num) */
  public    StringFilter[] MicrCheckNum  = null;
  protected boolean MicrCheckNumFetch = false;
  protected boolean MicrCheckNumSortAscending = true;
  protected boolean MicrCheckNumCaseInsensitive = false;
  protected Integer MicrCheckNumSort = null;
  /** raw field for: BMF_UNAPPLIED.arch_flag) */
  public    BooleanFilter[] ArchFlag  = null;
  protected boolean ArchFlagFetch = false;
  protected boolean ArchFlagSortAscending = true;
  protected Integer ArchFlagSort = null;
  /** raw field for: BMF_UNAPPLIED.manual_ccauth_code) */
  public    StringFilter[] ManualCcauthCode  = null;
  protected boolean ManualCcauthCodeFetch = false;
  protected boolean ManualCcauthCodeSortAscending = true;
  protected boolean ManualCcauthCodeCaseInsensitive = false;
  protected Integer ManualCcauthCodeSort = null;
  /** raw field for: BMF_UNAPPLIED.manual_ccauth_date) */
  public    StringFilter[] ManualCcauthDate  = null;
  protected boolean ManualCcauthDateFetch = false;
  protected boolean ManualCcauthDateSortAscending = true;
  protected boolean ManualCcauthDateCaseInsensitive = false;
  protected Integer ManualCcauthDateSort = null;
  /** raw field for: BMF_UNAPPLIED.file_id) */
  public    IntegerFilter[] FileId  = null;
  protected boolean FileIdFetch = false;
  protected boolean FileIdSortAscending = true;
  protected Integer FileIdSort = null;
  /** raw field for: BMF_UNAPPLIED.response_code) */
  public    StringFilter[] ResponseCode  = null;
  protected boolean ResponseCodeFetch = false;
  protected boolean ResponseCodeSortAscending = true;
  protected boolean ResponseCodeCaseInsensitive = false;
  protected Integer ResponseCodeSort = null;
  /** raw field for: BMF_UNAPPLIED.bill_order_number) */
  public    StringFilter[] BillOrderNumber  = null;
  protected boolean BillOrderNumberFetch = false;
  protected boolean BillOrderNumberSortAscending = true;
  protected boolean BillOrderNumberCaseInsensitive = false;
  protected Integer BillOrderNumberSort = null;
  /** raw field for: BMF_UNAPPLIED.external_amount) */
  public    BigIntegerFilter[] ExternalAmount  = null;
  protected boolean ExternalAmountFetch = false;
  protected boolean ExternalAmountSortAscending = true;
  protected Integer ExternalAmountSort = null;
  /** raw field for: BMF_UNAPPLIED.external_currency) */
  public    IntegerFilter[] ExternalCurrency  = null;
  protected boolean ExternalCurrencyFetch = false;
  protected boolean ExternalCurrencySortAscending = true;
  protected Integer ExternalCurrencySort = null;
  /** raw field for: BMF_UNAPPLIED.open_item_id) */
  public    IntegerFilter[] OpenItemId  = null;
  protected boolean OpenItemIdFetch = false;
  protected boolean OpenItemIdSortAscending = true;
  protected Integer OpenItemIdSort = null;
  /** raw field for: BMF_UNAPPLIED.annotation) */
  public    StringFilter[] Annotation  = null;
  protected boolean AnnotationFetch = false;
  protected boolean AnnotationSortAscending = true;
  protected boolean AnnotationCaseInsensitive = false;
  protected Integer AnnotationSort = null;
  private String _objName = "UnappliedPaymentObjectFilter";
  /** default constructor */
  public UnappliedPaymentObjectFilter ()
  {
    super ();
  }
  /** copy constructor
   * @param other filter to copy
   */
  public UnappliedPaymentObjectFilter (UnappliedPaymentObjectFilter other)
  {
    if (other == null) return;
    this.Key = new UnappliedPaymentObjectKeyFilter (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this.AccountExternalIdFetch = other.AccountExternalIdFetch;
    this.AccountExternalIdSort = other.AccountExternalIdSort;
    this.AccountExternalIdCaseInsensitive = other.AccountExternalIdCaseInsensitive;
    this.AccountExternalIdSortAscending = other.AccountExternalIdSortAscending;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this.AccountExternalIdTypeFetch = other.AccountExternalIdTypeFetch;
    this.AccountExternalIdTypeSort = other.AccountExternalIdTypeSort;
    this.AccountExternalIdTypeSortAscending = other.AccountExternalIdTypeSortAscending;
    this.AccountInternalId = other.AccountInternalId;
    this.AccountInternalIdFetch = other.AccountInternalIdFetch;
    this.AccountInternalIdSort = other.AccountInternalIdSort;
    this.AccountInternalIdSortAscending = other.AccountInternalIdSortAscending;
    this.AppliedStatus = other.AppliedStatus;
    this.AppliedStatusFetch = other.AppliedStatusFetch;
    this.AppliedStatusSort = other.AppliedStatusSort;
    this.AppliedStatusSortAscending = other.AppliedStatusSortAscending;
    this.BmfTrackingId = other.BmfTrackingId;
    this.BmfTrackingIdFetch = other.BmfTrackingIdFetch;
    this.BmfTrackingIdSort = other.BmfTrackingIdSort;
    this.BmfTrackingIdSortAscending = other.BmfTrackingIdSortAscending;
    this.BmfTrackingIdServ = other.BmfTrackingIdServ;
    this.BmfTrackingIdServFetch = other.BmfTrackingIdServFetch;
    this.BmfTrackingIdServSort = other.BmfTrackingIdServSort;
    this.BmfTrackingIdServSortAscending = other.BmfTrackingIdServSortAscending;
    this.BmfErrorText = other.BmfErrorText;
    this.BmfErrorTextFetch = other.BmfErrorTextFetch;
    this.BmfErrorTextSort = other.BmfErrorTextSort;
    this.BmfErrorTextCaseInsensitive = other.BmfErrorTextCaseInsensitive;
    this.BmfErrorTextSortAscending = other.BmfErrorTextSortAscending;
    this.OrigBillRefNo = other.OrigBillRefNo;
    this.OrigBillRefNoFetch = other.OrigBillRefNoFetch;
    this.OrigBillRefNoSort = other.OrigBillRefNoSort;
    this.OrigBillRefNoSortAscending = other.OrigBillRefNoSortAscending;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this.OrigBillRefResetsFetch = other.OrigBillRefResetsFetch;
    this.OrigBillRefResetsSort = other.OrigBillRefResetsSort;
    this.OrigBillRefResetsSortAscending = other.OrigBillRefResetsSortAscending;
    this.CrNoteBillRefNo = other.CrNoteBillRefNo;
    this.CrNoteBillRefNoFetch = other.CrNoteBillRefNoFetch;
    this.CrNoteBillRefNoSort = other.CrNoteBillRefNoSort;
    this.CrNoteBillRefNoSortAscending = other.CrNoteBillRefNoSortAscending;
    this.CrNoteBillRefResets = other.CrNoteBillRefResets;
    this.CrNoteBillRefResetsFetch = other.CrNoteBillRefResetsFetch;
    this.CrNoteBillRefResetsSort = other.CrNoteBillRefResetsSort;
    this.CrNoteBillRefResetsSortAscending = other.CrNoteBillRefResetsSortAscending;
    this.BmfTransType = other.BmfTransType;
    this.BmfTransTypeFetch = other.BmfTransTypeFetch;
    this.BmfTransTypeSort = other.BmfTransTypeSort;
    this.BmfTransTypeSortAscending = other.BmfTransTypeSortAscending;
    this.TransDate = other.TransDate;
    this.TransDateFetch = other.TransDateFetch;
    this.TransDateSort = other.TransDateSort;
    this.TransDateSortAscending = other.TransDateSortAscending;
    this.PostDate = other.PostDate;
    this.PostDateFetch = other.PostDateFetch;
    this.PostDateSort = other.PostDateSort;
    this.PostDateSortAscending = other.PostDateSortAscending;
    this.CurrencyCode = other.CurrencyCode;
    this.CurrencyCodeFetch = other.CurrencyCodeFetch;
    this.CurrencyCodeSort = other.CurrencyCodeSort;
    this.CurrencyCodeSortAscending = other.CurrencyCodeSortAscending;
    this.TransAmount = other.TransAmount;
    this.TransAmountFetch = other.TransAmountFetch;
    this.TransAmountSort = other.TransAmountSort;
    this.TransAmountSortAscending = other.TransAmountSortAscending;
    this.GlAmount = other.GlAmount;
    this.GlAmountFetch = other.GlAmountFetch;
    this.GlAmountSort = other.GlAmountSort;
    this.GlAmountSortAscending = other.GlAmountSortAscending;
    this.OrigTrackingId = other.OrigTrackingId;
    this.OrigTrackingIdFetch = other.OrigTrackingIdFetch;
    this.OrigTrackingIdSort = other.OrigTrackingIdSort;
    this.OrigTrackingIdSortAscending = other.OrigTrackingIdSortAscending;
    this.OrigTrackingIdServ = other.OrigTrackingIdServ;
    this.OrigTrackingIdServFetch = other.OrigTrackingIdServFetch;
    this.OrigTrackingIdServSort = other.OrigTrackingIdServSort;
    this.OrigTrackingIdServSortAscending = other.OrigTrackingIdServSortAscending;
    this.TransSource = other.TransSource;
    this.TransSourceFetch = other.TransSourceFetch;
    this.TransSourceSort = other.TransSourceSort;
    this.TransSourceSortAscending = other.TransSourceSortAscending;
    this.SourceType = other.SourceType;
    this.SourceTypeFetch = other.SourceTypeFetch;
    this.SourceTypeSort = other.SourceTypeSort;
    this.SourceTypeSortAscending = other.SourceTypeSortAscending;
    this.SourceId = other.SourceId;
    this.SourceIdFetch = other.SourceIdFetch;
    this.SourceIdSort = other.SourceIdSort;
    this.SourceIdSortAscending = other.SourceIdSortAscending;
    this.SourceIdServ = other.SourceIdServ;
    this.SourceIdServFetch = other.SourceIdServFetch;
    this.SourceIdServSort = other.SourceIdServSort;
    this.SourceIdServSortAscending = other.SourceIdServSortAscending;
    this.BatchId = other.BatchId;
    this.BatchIdFetch = other.BatchIdFetch;
    this.BatchIdSort = other.BatchIdSort;
    this.BatchIdCaseInsensitive = other.BatchIdCaseInsensitive;
    this.BatchIdSortAscending = other.BatchIdSortAscending;
    this.BatchIdServ = other.BatchIdServ;
    this.BatchIdServFetch = other.BatchIdServFetch;
    this.BatchIdServSort = other.BatchIdServSort;
    this.BatchIdServSortAscending = other.BatchIdServSortAscending;
    this.TransSubmitter = other.TransSubmitter;
    this.TransSubmitterFetch = other.TransSubmitterFetch;
    this.TransSubmitterSort = other.TransSubmitterSort;
    this.TransSubmitterCaseInsensitive = other.TransSubmitterCaseInsensitive;
    this.TransSubmitterSortAscending = other.TransSubmitterSortAscending;
    this.ChgDate = other.ChgDate;
    this.ChgDateFetch = other.ChgDateFetch;
    this.ChgDateSort = other.ChgDateSort;
    this.ChgDateSortAscending = other.ChgDateSortAscending;
    this.ActionCode = other.ActionCode;
    this.ActionCodeFetch = other.ActionCodeFetch;
    this.ActionCodeSort = other.ActionCodeSort;
    this.ActionCodeCaseInsensitive = other.ActionCodeCaseInsensitive;
    this.ActionCodeSortAscending = other.ActionCodeSortAscending;
    this.ProfileId = other.ProfileId;
    this.ProfileIdFetch = other.ProfileIdFetch;
    this.ProfileIdSort = other.ProfileIdSort;
    this.ProfileIdSortAscending = other.ProfileIdSortAscending;
    this.MicrBankId = other.MicrBankId;
    this.MicrBankIdFetch = other.MicrBankIdFetch;
    this.MicrBankIdSort = other.MicrBankIdSort;
    this.MicrBankIdCaseInsensitive = other.MicrBankIdCaseInsensitive;
    this.MicrBankIdSortAscending = other.MicrBankIdSortAscending;
    this.MicrDdaNum = other.MicrDdaNum;
    this.MicrDdaNumFetch = other.MicrDdaNumFetch;
    this.MicrDdaNumSort = other.MicrDdaNumSort;
    this.MicrDdaNumCaseInsensitive = other.MicrDdaNumCaseInsensitive;
    this.MicrDdaNumSortAscending = other.MicrDdaNumSortAscending;
    this.MicrCheckNum = other.MicrCheckNum;
    this.MicrCheckNumFetch = other.MicrCheckNumFetch;
    this.MicrCheckNumSort = other.MicrCheckNumSort;
    this.MicrCheckNumCaseInsensitive = other.MicrCheckNumCaseInsensitive;
    this.MicrCheckNumSortAscending = other.MicrCheckNumSortAscending;
    this.ArchFlag = other.ArchFlag;
    this.ArchFlagFetch = other.ArchFlagFetch;
    this.ArchFlagSort = other.ArchFlagSort;
    this.ArchFlagSortAscending = other.ArchFlagSortAscending;
    this.ManualCcauthCode = other.ManualCcauthCode;
    this.ManualCcauthCodeFetch = other.ManualCcauthCodeFetch;
    this.ManualCcauthCodeSort = other.ManualCcauthCodeSort;
    this.ManualCcauthCodeCaseInsensitive = other.ManualCcauthCodeCaseInsensitive;
    this.ManualCcauthCodeSortAscending = other.ManualCcauthCodeSortAscending;
    this.ManualCcauthDate = other.ManualCcauthDate;
    this.ManualCcauthDateFetch = other.ManualCcauthDateFetch;
    this.ManualCcauthDateSort = other.ManualCcauthDateSort;
    this.ManualCcauthDateCaseInsensitive = other.ManualCcauthDateCaseInsensitive;
    this.ManualCcauthDateSortAscending = other.ManualCcauthDateSortAscending;
    this.FileId = other.FileId;
    this.FileIdFetch = other.FileIdFetch;
    this.FileIdSort = other.FileIdSort;
    this.FileIdSortAscending = other.FileIdSortAscending;
    this.ResponseCode = other.ResponseCode;
    this.ResponseCodeFetch = other.ResponseCodeFetch;
    this.ResponseCodeSort = other.ResponseCodeSort;
    this.ResponseCodeCaseInsensitive = other.ResponseCodeCaseInsensitive;
    this.ResponseCodeSortAscending = other.ResponseCodeSortAscending;
    this.BillOrderNumber = other.BillOrderNumber;
    this.BillOrderNumberFetch = other.BillOrderNumberFetch;
    this.BillOrderNumberSort = other.BillOrderNumberSort;
    this.BillOrderNumberCaseInsensitive = other.BillOrderNumberCaseInsensitive;
    this.BillOrderNumberSortAscending = other.BillOrderNumberSortAscending;
    this.ExternalAmount = other.ExternalAmount;
    this.ExternalAmountFetch = other.ExternalAmountFetch;
    this.ExternalAmountSort = other.ExternalAmountSort;
    this.ExternalAmountSortAscending = other.ExternalAmountSortAscending;
    this.ExternalCurrency = other.ExternalCurrency;
    this.ExternalCurrencyFetch = other.ExternalCurrencyFetch;
    this.ExternalCurrencySort = other.ExternalCurrencySort;
    this.ExternalCurrencySortAscending = other.ExternalCurrencySortAscending;
    this.OpenItemId = other.OpenItemId;
    this.OpenItemIdFetch = other.OpenItemIdFetch;
    this.OpenItemIdSort = other.OpenItemIdSort;
    this.OpenItemIdSortAscending = other.OpenItemIdSortAscending;
    this.Annotation = other.Annotation;
    this.AnnotationFetch = other.AnnotationFetch;
    this.AnnotationSort = other.AnnotationSort;
    this.AnnotationCaseInsensitive = other.AnnotationCaseInsensitive;
    this.AnnotationSortAscending = other.AnnotationSortAscending;  }
  /** get the filter for this object's key
   * @return UnappliedPaymentObjectKeyFilter
   */
  public UnappliedPaymentObjectKeyFilter getKeyFilter ()
  {
    return this.Key;
  }
  /** set the filter for the Key of this object
   * @param Key the new filter
   */
  public void setKeyFilter (UnappliedPaymentObjectKeyFilter Key)
  {
    this.Key = Key;
  }
  /** Set the field level Fetch value for field: TrackingId (BMF_UNAPPLIED.tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyFilter ();
    this.Key.TrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingId (BMF_UNAPPLIED.tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdFetch;
  }
  /** Set the SortOrder for field: TrackingId (BMF_UNAPPLIED.tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyFilter ();
    this.Key.TrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: TrackingId (BMF_UNAPPLIED.tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdSort;
  }
  /** Set the sort direction for field: TrackingId (BMF_UNAPPLIED.tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyFilter ();
    this.Key.TrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingId (BMF_UNAPPLIED.tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdSortAscending;
  }
  /** Set the field level filters for field: TrackingId (BMF_UNAPPLIED.tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyFilter ();
    this.Key.TrackingId = value;
  }
  /** Retrieve filter for field: TrackingId (BMF_UNAPPLIED.tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Set the field level Fetch value for field: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setTrackingIdServFetch (boolean fetch)
  {
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyFilter ();
    this.Key.TrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getTrackingIdServFetch ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServFetch;
  }
  /** Set the SortOrder for field: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTrackingIdServSortOrder (Integer value)
  {
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyFilter ();
    this.Key.TrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTrackingIdServSortOrder ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServSort;
  }
  /** Set the sort direction for field: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTrackingIdServSortDirection (boolean ascending)
  {
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyFilter ();
    this.Key.TrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTrackingIdServSortDirection ()
  {
    if (this.Key == null) return true;
    return this.Key.TrackingIdServSortAscending;
  }
  /** Set the field level filters for field: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTrackingIdServFilter (IntegerFilter[] value) throws ServiceException
  {
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyFilter ();
    this.Key.TrackingIdServ = value;
  }
  /** Retrieve filter for field: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTrackingIdServFilter ()
  {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Set the field level Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdFetch (boolean fetch) {
    this.AccountExternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdFetch () {
    return this.AccountExternalIdFetch;
  }
  /** Set the SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdSortOrder (Integer value) {
    this.AccountExternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdSortOrder () {
    return this.AccountExternalIdSort;
  }
  /** Set the sort direction for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdSortDirection (boolean ascending) {
    this.AccountExternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdSortDirection () {
    return this.AccountExternalIdSortAscending;
  }
  /** Set the case insensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAccountExternalIdCaseInsensitive (boolean ascending) {
    this.AccountExternalIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAccountExternalIdCaseInsensitive () {
    return this.AccountExternalIdCaseInsensitive;
  }
  /** Set the field level filters for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdFilter (StringFilter[] value) throws ServiceException {
    this.AccountExternalId = value;
  }
  /** Retrieve filter for field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAccountExternalIdFilter () {
    return this.AccountExternalId;
  }

  /**
   * Retrieves the AccountExternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdFilter field
   */
  public String[] getAccountExternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdFilter filter field
   */
  public void setAccountExternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
    try {
      this.setAccountExternalIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountExternalIdTypeFetch (boolean fetch) {
    this.AccountExternalIdTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountExternalIdTypeFetch () {
    return this.AccountExternalIdTypeFetch;
  }
  /** Set the SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountExternalIdTypeSortOrder (Integer value) {
    this.AccountExternalIdTypeSort = value;
  }
  /** Retrieve SortOrder for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountExternalIdTypeSortOrder () {
    return this.AccountExternalIdTypeSort;
  }
  /** Set the sort direction for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountExternalIdTypeSortDirection (boolean ascending) {
    this.AccountExternalIdTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountExternalIdTypeSortDirection () {
    return this.AccountExternalIdTypeSortAscending;
  }
  /** Set the field level filters for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountExternalIdTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountExternalIdType = value;
  }
  /** Retrieve filter for field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountExternalIdTypeFilter () {
    return this.AccountExternalIdType;
  }

  /**
   * Retrieves the AccountExternalIdTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountExternalIdTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdTypeFilter field
   */
  public String[] getAccountExternalIdTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountExternalIdTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountExternalIdTypeFilter filter value from a formatted string
   *
   * @param _value the AccountExternalIdTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromFormattedString");
  }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdTypeFilter filter field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdTypeFilter filter field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdTypeFilter filter field
   */
  public String[] getAccountExternalIdTypeFilterDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      String[] displayValues = null;
      Object[] displayObjs = FilterConversionHelper.toDisplayValue(this.getAccountExternalIdTypeFilter(), "ExternalIdType", _locale, enumFilter, false);
      if (displayObjs != null) {
        displayValues = new String[displayObjs.length];
        for (int i=0; i<displayObjs.length; i++) {
          displayValues[i] = displayObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      return displayValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeFilterDisplayValue");
      throw excp;
    }
  }

  /**
   * Sets a filter for the enumerated AccountExternalIdTypeFilter filter field based on a display value(s)
   *
   * @param _value display value(s) to convert. If the requested output filter type is a
   *          type that contains a single data item, then a single String display value object
   *          must be specified. If the requested output filter type is a type that contains
   *          more than one data item (e.g. a Between Filter), then a Collection of String
   *          display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountExternalIdTypeFilter filter field
   */
  public void setAccountExternalIdTypeFilterFromDisplayValue(Object[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
    EnumerationFilter enumFilter = null;

    try {
      this.setAccountExternalIdTypeFilter((IntegerFilter[])(FilterConversionHelper.toCodeFilter(_value, _filterType, "AccountExternalIdType", _locale, enumFilter, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFilterFromDisplayValue");
  }


  /** Set the field level Fetch value for field: AccountInternalId (BMF_UNAPPLIED.account_no)
   * @param fetch whether to fetch this field or not
   */
  public void setAccountInternalIdFetch (boolean fetch) {
    this.AccountInternalIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: AccountInternalId (BMF_UNAPPLIED.account_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getAccountInternalIdFetch () {
    return this.AccountInternalIdFetch;
  }
  /** Set the SortOrder for field: AccountInternalId (BMF_UNAPPLIED.account_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAccountInternalIdSortOrder (Integer value) {
    this.AccountInternalIdSort = value;
  }
  /** Retrieve SortOrder for field: AccountInternalId (BMF_UNAPPLIED.account_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAccountInternalIdSortOrder () {
    return this.AccountInternalIdSort;
  }
  /** Set the sort direction for field: AccountInternalId (BMF_UNAPPLIED.account_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAccountInternalIdSortDirection (boolean ascending) {
    this.AccountInternalIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AccountInternalId (BMF_UNAPPLIED.account_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAccountInternalIdSortDirection () {
    return this.AccountInternalIdSortAscending;
  }
  /** Set the field level filters for field: AccountInternalId (BMF_UNAPPLIED.account_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAccountInternalIdFilter (IntegerFilter[] value) throws ServiceException {
    this.AccountInternalId = value;
  }
  /** Retrieve filter for field: AccountInternalId (BMF_UNAPPLIED.account_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getAccountInternalIdFilter () {
    return this.AccountInternalId;
  }

  /**
   * Retrieves the AccountInternalIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AccountInternalIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalIdFilter field
   */
  public String[] getAccountInternalIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAccountInternalIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AccountInternalIdFilter filter value from a formatted string
   *
   * @param _value the AccountInternalIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AccountInternalIdFilter filter field
   */
  public void setAccountInternalIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
    try {
      this.setAccountInternalIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountInternalIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * @param fetch whether to fetch this field or not
   */
  public void setAppliedStatusFetch (boolean fetch) {
    this.AppliedStatusFetch = fetch;
  }
  /** Retrieve Fetch value for field: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * @return boolean the Fetch value for this field
   */
  public boolean getAppliedStatusFetch () {
    return this.AppliedStatusFetch;
  }
  /** Set the SortOrder for field: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAppliedStatusSortOrder (Integer value) {
    this.AppliedStatusSort = value;
  }
  /** Retrieve SortOrder for field: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAppliedStatusSortOrder () {
    return this.AppliedStatusSort;
  }
  /** Set the sort direction for field: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAppliedStatusSortDirection (boolean ascending) {
    this.AppliedStatusSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAppliedStatusSortDirection () {
    return this.AppliedStatusSortAscending;
  }
  /** Set the field level filters for field: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAppliedStatusFilter (BooleanFilter[] value) throws ServiceException {
    this.AppliedStatus = value;
  }
  /** Retrieve filter for field: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getAppliedStatusFilter () {
    return this.AppliedStatus;
  }

  /**
   * Retrieves the AppliedStatusFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AppliedStatusFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AppliedStatusFilter field
   */
  public String[] getAppliedStatusFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAppliedStatusFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAppliedStatusFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAppliedStatusFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AppliedStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAppliedStatusFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AppliedStatusFilter filter value from a formatted string
   *
   * @param _value the AppliedStatusFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AppliedStatusFilter filter field
   */
  public void setAppliedStatusFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAppliedStatusFilterFromFormattedString");
    try {
      this.setAppliedStatusFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AppliedStatusFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAppliedStatusFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAppliedStatusFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdFetch (boolean fetch) {
    this.BmfTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdFetch () {
    return this.BmfTrackingIdFetch;
  }
  /** Set the SortOrder for field: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdSortOrder (Integer value) {
    this.BmfTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdSortOrder () {
    return this.BmfTrackingIdSort;
  }
  /** Set the sort direction for field: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdSortDirection (boolean ascending) {
    this.BmfTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdSortDirection () {
    return this.BmfTrackingIdSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTrackingId = value;
  }
  /** Retrieve filter for field: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdFilter () {
    return this.BmfTrackingId;
  }

  /**
   * Retrieves the BmfTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdFilter field
   */
  public String[] getBmfTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTrackingIdFilter filter value from a formatted string
   *
   * @param _value the BmfTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTrackingIdFilter filter field
   */
  public void setBmfTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
    try {
      this.setBmfTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTrackingIdServFetch (boolean fetch) {
    this.BmfTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTrackingIdServFetch () {
    return this.BmfTrackingIdServFetch;
  }
  /** Set the SortOrder for field: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTrackingIdServSortOrder (Integer value) {
    this.BmfTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTrackingIdServSortOrder () {
    return this.BmfTrackingIdServSort;
  }
  /** Set the sort direction for field: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTrackingIdServSortDirection (boolean ascending) {
    this.BmfTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTrackingIdServSortDirection () {
    return this.BmfTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTrackingIdServ = value;
  }
  /** Retrieve filter for field: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTrackingIdServFilter () {
    return this.BmfTrackingIdServ;
  }

  /**
   * Retrieves the BmfTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdServFilter field
   */
  public String[] getBmfTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the BmfTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTrackingIdServFilter filter field
   */
  public void setBmfTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
    try {
      this.setBmfTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfErrorTextFetch (boolean fetch) {
    this.BmfErrorTextFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfErrorTextFetch () {
    return this.BmfErrorTextFetch;
  }
  /** Set the SortOrder for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfErrorTextSortOrder (Integer value) {
    this.BmfErrorTextSort = value;
  }
  /** Retrieve SortOrder for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfErrorTextSortOrder () {
    return this.BmfErrorTextSort;
  }
  /** Set the sort direction for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfErrorTextSortDirection (boolean ascending) {
    this.BmfErrorTextSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfErrorTextSortDirection () {
    return this.BmfErrorTextSortAscending;
  }
  /** Set the case insensitive for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBmfErrorTextCaseInsensitive (boolean ascending) {
    this.BmfErrorTextCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBmfErrorTextCaseInsensitive () {
    return this.BmfErrorTextCaseInsensitive;
  }
  /** Set the field level filters for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfErrorTextFilter (StringFilter[] value) throws ServiceException {
    this.BmfErrorText = value;
  }
  /** Retrieve filter for field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBmfErrorTextFilter () {
    return this.BmfErrorText;
  }

  /**
   * Retrieves the BmfErrorTextFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfErrorTextFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfErrorTextFilter field
   */
  public String[] getBmfErrorTextFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfErrorTextFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfErrorTextFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfErrorTextFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfErrorTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfErrorTextFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfErrorTextFilter filter value from a formatted string
   *
   * @param _value the BmfErrorTextFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfErrorTextFilter filter field
   */
  public void setBmfErrorTextFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfErrorTextFilterFromFormattedString");
    try {
      this.setBmfErrorTextFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfErrorTextFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfErrorTextFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfErrorTextFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefNoFetch (boolean fetch) {
    this.OrigBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefNoFetch () {
    return this.OrigBillRefNoFetch;
  }
  /** Set the SortOrder for field: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefNoSortOrder (Integer value) {
    this.OrigBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefNoSortOrder () {
    return this.OrigBillRefNoSort;
  }
  /** Set the sort direction for field: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefNoSortDirection (boolean ascending) {
    this.OrigBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefNoSortDirection () {
    return this.OrigBillRefNoSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefNo = value;
  }
  /** Retrieve filter for field: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBillRefNoFilter () {
    return this.OrigBillRefNo;
  }

  /**
   * Retrieves the OrigBillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefNoFilter field
   */
  public String[] getOrigBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBillRefNoFilter filter value from a formatted string
   *
   * @param _value the OrigBillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBillRefNoFilter filter field
   */
  public void setOrigBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBillRefNoFilterFromFormattedString");
    try {
      this.setOrigBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigBillRefResetsFetch (boolean fetch) {
    this.OrigBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigBillRefResetsFetch () {
    return this.OrigBillRefResetsFetch;
  }
  /** Set the SortOrder for field: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigBillRefResetsSortOrder (Integer value) {
    this.OrigBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigBillRefResetsSortOrder () {
    return this.OrigBillRefResetsSort;
  }
  /** Set the sort direction for field: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigBillRefResetsSortDirection (boolean ascending) {
    this.OrigBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigBillRefResetsSortDirection () {
    return this.OrigBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigBillRefResets = value;
  }
  /** Retrieve filter for field: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigBillRefResetsFilter () {
    return this.OrigBillRefResets;
  }

  /**
   * Retrieves the OrigBillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigBillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefResetsFilter field
   */
  public String[] getOrigBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigBillRefResetsFilter filter value from a formatted string
   *
   * @param _value the OrigBillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigBillRefResetsFilter filter field
   */
  public void setOrigBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigBillRefResetsFilterFromFormattedString");
    try {
      this.setOrigBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * @param fetch whether to fetch this field or not
   */
  public void setCrNoteBillRefNoFetch (boolean fetch) {
    this.CrNoteBillRefNoFetch = fetch;
  }
  /** Retrieve Fetch value for field: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * @return boolean the Fetch value for this field
   */
  public boolean getCrNoteBillRefNoFetch () {
    return this.CrNoteBillRefNoFetch;
  }
  /** Set the SortOrder for field: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCrNoteBillRefNoSortOrder (Integer value) {
    this.CrNoteBillRefNoSort = value;
  }
  /** Retrieve SortOrder for field: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCrNoteBillRefNoSortOrder () {
    return this.CrNoteBillRefNoSort;
  }
  /** Set the sort direction for field: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCrNoteBillRefNoSortDirection (boolean ascending) {
    this.CrNoteBillRefNoSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCrNoteBillRefNoSortDirection () {
    return this.CrNoteBillRefNoSortAscending;
  }
  /** Set the field level filters for field: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCrNoteBillRefNoFilter (IntegerFilter[] value) throws ServiceException {
    this.CrNoteBillRefNo = value;
  }
  /** Retrieve filter for field: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCrNoteBillRefNoFilter () {
    return this.CrNoteBillRefNo;
  }

  /**
   * Retrieves the CrNoteBillRefNoFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CrNoteBillRefNoFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CrNoteBillRefNoFilter field
   */
  public String[] getCrNoteBillRefNoFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCrNoteBillRefNoFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCrNoteBillRefNoFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCrNoteBillRefNoFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CrNoteBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCrNoteBillRefNoFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CrNoteBillRefNoFilter filter value from a formatted string
   *
   * @param _value the CrNoteBillRefNoFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CrNoteBillRefNoFilter filter field
   */
  public void setCrNoteBillRefNoFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCrNoteBillRefNoFilterFromFormattedString");
    try {
      this.setCrNoteBillRefNoFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CrNoteBillRefNoFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCrNoteBillRefNoFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCrNoteBillRefNoFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * @param fetch whether to fetch this field or not
   */
  public void setCrNoteBillRefResetsFetch (boolean fetch) {
    this.CrNoteBillRefResetsFetch = fetch;
  }
  /** Retrieve Fetch value for field: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * @return boolean the Fetch value for this field
   */
  public boolean getCrNoteBillRefResetsFetch () {
    return this.CrNoteBillRefResetsFetch;
  }
  /** Set the SortOrder for field: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCrNoteBillRefResetsSortOrder (Integer value) {
    this.CrNoteBillRefResetsSort = value;
  }
  /** Retrieve SortOrder for field: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCrNoteBillRefResetsSortOrder () {
    return this.CrNoteBillRefResetsSort;
  }
  /** Set the sort direction for field: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCrNoteBillRefResetsSortDirection (boolean ascending) {
    this.CrNoteBillRefResetsSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCrNoteBillRefResetsSortDirection () {
    return this.CrNoteBillRefResetsSortAscending;
  }
  /** Set the field level filters for field: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCrNoteBillRefResetsFilter (IntegerFilter[] value) throws ServiceException {
    this.CrNoteBillRefResets = value;
  }
  /** Retrieve filter for field: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCrNoteBillRefResetsFilter () {
    return this.CrNoteBillRefResets;
  }

  /**
   * Retrieves the CrNoteBillRefResetsFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CrNoteBillRefResetsFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CrNoteBillRefResetsFilter field
   */
  public String[] getCrNoteBillRefResetsFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCrNoteBillRefResetsFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCrNoteBillRefResetsFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCrNoteBillRefResetsFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CrNoteBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCrNoteBillRefResetsFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CrNoteBillRefResetsFilter filter value from a formatted string
   *
   * @param _value the CrNoteBillRefResetsFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CrNoteBillRefResetsFilter filter field
   */
  public void setCrNoteBillRefResetsFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCrNoteBillRefResetsFilterFromFormattedString");
    try {
      this.setCrNoteBillRefResetsFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CrNoteBillRefResetsFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCrNoteBillRefResetsFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCrNoteBillRefResetsFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * @param fetch whether to fetch this field or not
   */
  public void setBmfTransTypeFetch (boolean fetch) {
    this.BmfTransTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getBmfTransTypeFetch () {
    return this.BmfTransTypeFetch;
  }
  /** Set the SortOrder for field: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBmfTransTypeSortOrder (Integer value) {
    this.BmfTransTypeSort = value;
  }
  /** Retrieve SortOrder for field: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBmfTransTypeSortOrder () {
    return this.BmfTransTypeSort;
  }
  /** Set the sort direction for field: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBmfTransTypeSortDirection (boolean ascending) {
    this.BmfTransTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBmfTransTypeSortDirection () {
    return this.BmfTransTypeSortAscending;
  }
  /** Set the field level filters for field: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBmfTransTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.BmfTransType = value;
  }
  /** Retrieve filter for field: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBmfTransTypeFilter () {
    return this.BmfTransType;
  }

  /**
   * Retrieves the BmfTransTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BmfTransTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransTypeFilter field
   */
  public String[] getBmfTransTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBmfTransTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BmfTransTypeFilter filter value from a formatted string
   *
   * @param _value the BmfTransTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BmfTransTypeFilter filter field
   */
  public void setBmfTransTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
    try {
      this.setBmfTransTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransDate (BMF_UNAPPLIED.trans_date)
   * @param fetch whether to fetch this field or not
   */
  public void setTransDateFetch (boolean fetch) {
    this.TransDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransDate (BMF_UNAPPLIED.trans_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransDateFetch () {
    return this.TransDateFetch;
  }
  /** Set the SortOrder for field: TransDate (BMF_UNAPPLIED.trans_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransDateSortOrder (Integer value) {
    this.TransDateSort = value;
  }
  /** Retrieve SortOrder for field: TransDate (BMF_UNAPPLIED.trans_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransDateSortOrder () {
    return this.TransDateSort;
  }
  /** Set the sort direction for field: TransDate (BMF_UNAPPLIED.trans_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransDateSortDirection (boolean ascending) {
    this.TransDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransDate (BMF_UNAPPLIED.trans_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransDateSortDirection () {
    return this.TransDateSortAscending;
  }
  /** Set the field level filters for field: TransDate (BMF_UNAPPLIED.trans_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransDateFilter (DateFilter[] value) throws ServiceException {
    this.TransDate = value;
  }
  /** Retrieve filter for field: TransDate (BMF_UNAPPLIED.trans_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getTransDateFilter () {
    return this.TransDate;
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedString");
  }

  /**
   * Retrieves the TransDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDateFilter field
   */
  public String[] getTransDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDateFilter filter value from a formatted string
   *
   * @param _value the TransDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransDateFilter filter field
   */
  public void setTransDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
    try {
      this.setTransDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: PostDate (BMF_UNAPPLIED.post_date)
   * @param fetch whether to fetch this field or not
   */
  public void setPostDateFetch (boolean fetch) {
    this.PostDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: PostDate (BMF_UNAPPLIED.post_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getPostDateFetch () {
    return this.PostDateFetch;
  }
  /** Set the SortOrder for field: PostDate (BMF_UNAPPLIED.post_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setPostDateSortOrder (Integer value) {
    this.PostDateSort = value;
  }
  /** Retrieve SortOrder for field: PostDate (BMF_UNAPPLIED.post_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getPostDateSortOrder () {
    return this.PostDateSort;
  }
  /** Set the sort direction for field: PostDate (BMF_UNAPPLIED.post_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setPostDateSortDirection (boolean ascending) {
    this.PostDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: PostDate (BMF_UNAPPLIED.post_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getPostDateSortDirection () {
    return this.PostDateSortAscending;
  }
  /** Set the field level filters for field: PostDate (BMF_UNAPPLIED.post_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setPostDateFilter (DateFilter[] value) throws ServiceException {
    this.PostDate = value;
  }
  /** Retrieve filter for field: PostDate (BMF_UNAPPLIED.post_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getPostDateFilter () {
    return this.PostDate;
  }

  /**
   * Retrieves the PostDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PostDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostDateFilter field
   */
  public String[] getPostDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPostDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the PostDateFilter filter value from a formatted string
   *
   * @param _value the PostDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PostDateFilter filter field
   */
  public void setPostDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPostDateFilterFromFormattedString");
    try {
      this.setPostDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostDateFilterFromFormattedString");
  }

  /**
   * Retrieves the PostDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PostDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostDateFilter field
   */
  public String[] getPostDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getPostDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PostDateFilter filter value from a formatted string
   *
   * @param _value the PostDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the PostDateFilter filter field
   */
  public void setPostDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPostDateFilterFromFormattedDateTimeString");
    try {
      this.setPostDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * @param fetch whether to fetch this field or not
   */
  public void setCurrencyCodeFetch (boolean fetch) {
    this.CurrencyCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getCurrencyCodeFetch () {
    return this.CurrencyCodeFetch;
  }
  /** Set the SortOrder for field: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setCurrencyCodeSortOrder (Integer value) {
    this.CurrencyCodeSort = value;
  }
  /** Retrieve SortOrder for field: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getCurrencyCodeSortOrder () {
    return this.CurrencyCodeSort;
  }
  /** Set the sort direction for field: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setCurrencyCodeSortDirection (boolean ascending) {
    this.CurrencyCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getCurrencyCodeSortDirection () {
    return this.CurrencyCodeSortAscending;
  }
  /** Set the field level filters for field: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setCurrencyCodeFilter (IntegerFilter[] value) throws ServiceException {
    this.CurrencyCode = value;
  }
  /** Retrieve filter for field: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getCurrencyCodeFilter () {
    return this.CurrencyCode;
  }

  /**
   * Retrieves the CurrencyCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The CurrencyCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCodeFilter field
   */
  public String[] getCurrencyCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getCurrencyCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the CurrencyCodeFilter filter value from a formatted string
   *
   * @param _value the CurrencyCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the CurrencyCodeFilter filter field
   */
  public void setCurrencyCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
    try {
      this.setCurrencyCodeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransAmount (BMF_UNAPPLIED.trans_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setTransAmountFetch (boolean fetch) {
    this.TransAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransAmount (BMF_UNAPPLIED.trans_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransAmountFetch () {
    return this.TransAmountFetch;
  }
  /** Set the SortOrder for field: TransAmount (BMF_UNAPPLIED.trans_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransAmountSortOrder (Integer value) {
    this.TransAmountSort = value;
  }
  /** Retrieve SortOrder for field: TransAmount (BMF_UNAPPLIED.trans_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransAmountSortOrder () {
    return this.TransAmountSort;
  }
  /** Set the sort direction for field: TransAmount (BMF_UNAPPLIED.trans_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransAmountSortDirection (boolean ascending) {
    this.TransAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransAmount (BMF_UNAPPLIED.trans_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransAmountSortDirection () {
    return this.TransAmountSortAscending;
  }
  /** Set the field level filters for field: TransAmount (BMF_UNAPPLIED.trans_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.TransAmount = value;
  }
  /** Retrieve filter for field: TransAmount (BMF_UNAPPLIED.trans_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getTransAmountFilter () {
    return this.TransAmount;
  }

  /**
   * Retrieves the TransAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransAmountFilter field
   */
  public String[] getTransAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransAmountFilter filter value from a formatted string
   *
   * @param _value the TransAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransAmountFilter filter field
   */
  public void setTransAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransAmountFilterFromFormattedString");
    try {
      this.setTransAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransAmountFilterFromFormattedString");
  }

  /**
   * Sets the TransAmountFilter filter value from a formatted string
   *
   * @param _value the TransAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransAmountFilter filter field
   */
  public void setTransAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransAmountFilterFromFormattedCurrencyString");
    try {
      this.setTransAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the TransAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransAmountFilter field
   */

  public String[] getTransAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: GlAmount (BMF_UNAPPLIED.gl_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setGlAmountFetch (boolean fetch) {
    this.GlAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: GlAmount (BMF_UNAPPLIED.gl_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getGlAmountFetch () {
    return this.GlAmountFetch;
  }
  /** Set the SortOrder for field: GlAmount (BMF_UNAPPLIED.gl_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setGlAmountSortOrder (Integer value) {
    this.GlAmountSort = value;
  }
  /** Retrieve SortOrder for field: GlAmount (BMF_UNAPPLIED.gl_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getGlAmountSortOrder () {
    return this.GlAmountSort;
  }
  /** Set the sort direction for field: GlAmount (BMF_UNAPPLIED.gl_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setGlAmountSortDirection (boolean ascending) {
    this.GlAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: GlAmount (BMF_UNAPPLIED.gl_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getGlAmountSortDirection () {
    return this.GlAmountSortAscending;
  }
  /** Set the field level filters for field: GlAmount (BMF_UNAPPLIED.gl_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setGlAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.GlAmount = value;
  }
  /** Retrieve filter for field: GlAmount (BMF_UNAPPLIED.gl_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getGlAmountFilter () {
    return this.GlAmount;
  }

  /**
   * Retrieves the GlAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmountFilter field
   */
  public String[] getGlAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGlAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the GlAmountFilter filter value from a formatted string
   *
   * @param _value the GlAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GlAmountFilter filter field
   */
  public void setGlAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlAmountFilterFromFormattedString");
    try {
      this.setGlAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFilterFromFormattedString");
  }

  /**
   * Sets the GlAmountFilter filter value from a formatted string
   *
   * @param _value the GlAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the GlAmountFilter filter field
   */
  public void setGlAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlAmountFilterFromFormattedCurrencyString");
    try {
      this.setGlAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the GlAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmountFilter field
   */

  public String[] getGlAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getGlAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTrackingIdFetch (boolean fetch) {
    this.OrigTrackingIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTrackingIdFetch () {
    return this.OrigTrackingIdFetch;
  }
  /** Set the SortOrder for field: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTrackingIdSortOrder (Integer value) {
    this.OrigTrackingIdSort = value;
  }
  /** Retrieve SortOrder for field: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTrackingIdSortOrder () {
    return this.OrigTrackingIdSort;
  }
  /** Set the sort direction for field: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTrackingIdSortDirection (boolean ascending) {
    this.OrigTrackingIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTrackingIdSortDirection () {
    return this.OrigTrackingIdSortAscending;
  }
  /** Set the field level filters for field: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTrackingIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTrackingId = value;
  }
  /** Retrieve filter for field: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigTrackingIdFilter () {
    return this.OrigTrackingId;
  }

  /**
   * Retrieves the OrigTrackingIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTrackingIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingIdFilter field
   */
  public String[] getOrigTrackingIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigTrackingIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTrackingIdFilter filter value from a formatted string
   *
   * @param _value the OrigTrackingIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTrackingIdFilter filter field
   */
  public void setOrigTrackingIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTrackingIdFilterFromFormattedString");
    try {
      this.setOrigTrackingIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setOrigTrackingIdServFetch (boolean fetch) {
    this.OrigTrackingIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getOrigTrackingIdServFetch () {
    return this.OrigTrackingIdServFetch;
  }
  /** Set the SortOrder for field: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOrigTrackingIdServSortOrder (Integer value) {
    this.OrigTrackingIdServSort = value;
  }
  /** Retrieve SortOrder for field: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOrigTrackingIdServSortOrder () {
    return this.OrigTrackingIdServSort;
  }
  /** Set the sort direction for field: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOrigTrackingIdServSortDirection (boolean ascending) {
    this.OrigTrackingIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOrigTrackingIdServSortDirection () {
    return this.OrigTrackingIdServSortAscending;
  }
  /** Set the field level filters for field: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOrigTrackingIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.OrigTrackingIdServ = value;
  }
  /** Retrieve filter for field: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOrigTrackingIdServFilter () {
    return this.OrigTrackingIdServ;
  }

  /**
   * Retrieves the OrigTrackingIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OrigTrackingIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingIdServFilter field
   */
  public String[] getOrigTrackingIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOrigTrackingIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OrigTrackingIdServFilter filter value from a formatted string
   *
   * @param _value the OrigTrackingIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OrigTrackingIdServFilter filter field
   */
  public void setOrigTrackingIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOrigTrackingIdServFilterFromFormattedString");
    try {
      this.setOrigTrackingIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OrigTrackingIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransSource (BMF_UNAPPLIED.trans_source)
   * @param fetch whether to fetch this field or not
   */
  public void setTransSourceFetch (boolean fetch) {
    this.TransSourceFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransSource (BMF_UNAPPLIED.trans_source)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransSourceFetch () {
    return this.TransSourceFetch;
  }
  /** Set the SortOrder for field: TransSource (BMF_UNAPPLIED.trans_source)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransSourceSortOrder (Integer value) {
    this.TransSourceSort = value;
  }
  /** Retrieve SortOrder for field: TransSource (BMF_UNAPPLIED.trans_source)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransSourceSortOrder () {
    return this.TransSourceSort;
  }
  /** Set the sort direction for field: TransSource (BMF_UNAPPLIED.trans_source)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransSourceSortDirection (boolean ascending) {
    this.TransSourceSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransSource (BMF_UNAPPLIED.trans_source)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransSourceSortDirection () {
    return this.TransSourceSortAscending;
  }
  /** Set the field level filters for field: TransSource (BMF_UNAPPLIED.trans_source)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransSourceFilter (IntegerFilter[] value) throws ServiceException {
    this.TransSource = value;
  }
  /** Retrieve filter for field: TransSource (BMF_UNAPPLIED.trans_source)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getTransSourceFilter () {
    return this.TransSource;
  }

  /**
   * Retrieves the TransSourceFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransSourceFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSourceFilter field
   */
  public String[] getTransSourceFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransSourceFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSourceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSourceFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransSourceFilter filter value from a formatted string
   *
   * @param _value the TransSourceFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransSourceFilter filter field
   */
  public void setTransSourceFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransSourceFilterFromFormattedString");
    try {
      this.setTransSourceFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSourceFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSourceFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSourceFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SourceType (BMF_UNAPPLIED.source_type)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceTypeFetch (boolean fetch) {
    this.SourceTypeFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceType (BMF_UNAPPLIED.source_type)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceTypeFetch () {
    return this.SourceTypeFetch;
  }
  /** Set the SortOrder for field: SourceType (BMF_UNAPPLIED.source_type)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceTypeSortOrder (Integer value) {
    this.SourceTypeSort = value;
  }
  /** Retrieve SortOrder for field: SourceType (BMF_UNAPPLIED.source_type)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceTypeSortOrder () {
    return this.SourceTypeSort;
  }
  /** Set the sort direction for field: SourceType (BMF_UNAPPLIED.source_type)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceTypeSortDirection (boolean ascending) {
    this.SourceTypeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceType (BMF_UNAPPLIED.source_type)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceTypeSortDirection () {
    return this.SourceTypeSortAscending;
  }
  /** Set the field level filters for field: SourceType (BMF_UNAPPLIED.source_type)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceTypeFilter (IntegerFilter[] value) throws ServiceException {
    this.SourceType = value;
  }
  /** Retrieve filter for field: SourceType (BMF_UNAPPLIED.source_type)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceTypeFilter () {
    return this.SourceType;
  }

  /**
   * Retrieves the SourceTypeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceTypeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceTypeFilter field
   */
  public String[] getSourceTypeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceTypeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceTypeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceTypeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceTypeFilter filter value from a formatted string
   *
   * @param _value the SourceTypeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceTypeFilter filter field
   */
  public void setSourceTypeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceTypeFilterFromFormattedString");
    try {
      this.setSourceTypeFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceTypeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceTypeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceTypeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SourceId (BMF_UNAPPLIED.source_id)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceIdFetch (boolean fetch) {
    this.SourceIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceId (BMF_UNAPPLIED.source_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceIdFetch () {
    return this.SourceIdFetch;
  }
  /** Set the SortOrder for field: SourceId (BMF_UNAPPLIED.source_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceIdSortOrder (Integer value) {
    this.SourceIdSort = value;
  }
  /** Retrieve SortOrder for field: SourceId (BMF_UNAPPLIED.source_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceIdSortOrder () {
    return this.SourceIdSort;
  }
  /** Set the sort direction for field: SourceId (BMF_UNAPPLIED.source_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceIdSortDirection (boolean ascending) {
    this.SourceIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceId (BMF_UNAPPLIED.source_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceIdSortDirection () {
    return this.SourceIdSortAscending;
  }
  /** Set the field level filters for field: SourceId (BMF_UNAPPLIED.source_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceIdFilter (IntegerFilter[] value) throws ServiceException {
    this.SourceId = value;
  }
  /** Retrieve filter for field: SourceId (BMF_UNAPPLIED.source_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceIdFilter () {
    return this.SourceId;
  }

  /**
   * Retrieves the SourceIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceIdFilter field
   */
  public String[] getSourceIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceIdFilter filter value from a formatted string
   *
   * @param _value the SourceIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceIdFilter filter field
   */
  public void setSourceIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceIdFilterFromFormattedString");
    try {
      this.setSourceIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setSourceIdServFetch (boolean fetch) {
    this.SourceIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getSourceIdServFetch () {
    return this.SourceIdServFetch;
  }
  /** Set the SortOrder for field: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setSourceIdServSortOrder (Integer value) {
    this.SourceIdServSort = value;
  }
  /** Retrieve SortOrder for field: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getSourceIdServSortOrder () {
    return this.SourceIdServSort;
  }
  /** Set the sort direction for field: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setSourceIdServSortDirection (boolean ascending) {
    this.SourceIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getSourceIdServSortDirection () {
    return this.SourceIdServSortAscending;
  }
  /** Set the field level filters for field: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setSourceIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.SourceIdServ = value;
  }
  /** Retrieve filter for field: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getSourceIdServFilter () {
    return this.SourceIdServ;
  }

  /**
   * Retrieves the SourceIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The SourceIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceIdServFilter field
   */
  public String[] getSourceIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getSourceIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the SourceIdServFilter filter value from a formatted string
   *
   * @param _value the SourceIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the SourceIdServFilter filter field
   */
  public void setSourceIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setSourceIdServFilterFromFormattedString");
    try {
      this.setSourceIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("SourceIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BatchId (BMF_UNAPPLIED.batch_id)
   * @param fetch whether to fetch this field or not
   */
  public void setBatchIdFetch (boolean fetch) {
    this.BatchIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: BatchId (BMF_UNAPPLIED.batch_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getBatchIdFetch () {
    return this.BatchIdFetch;
  }
  /** Set the SortOrder for field: BatchId (BMF_UNAPPLIED.batch_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBatchIdSortOrder (Integer value) {
    this.BatchIdSort = value;
  }
  /** Retrieve SortOrder for field: BatchId (BMF_UNAPPLIED.batch_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBatchIdSortOrder () {
    return this.BatchIdSort;
  }
  /** Set the sort direction for field: BatchId (BMF_UNAPPLIED.batch_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBatchIdSortDirection (boolean ascending) {
    this.BatchIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BatchId (BMF_UNAPPLIED.batch_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBatchIdSortDirection () {
    return this.BatchIdSortAscending;
  }
  /** Set the case insensitive for field: BatchId (BMF_UNAPPLIED.batch_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBatchIdCaseInsensitive (boolean ascending) {
    this.BatchIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BatchId (BMF_UNAPPLIED.batch_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBatchIdCaseInsensitive () {
    return this.BatchIdCaseInsensitive;
  }
  /** Set the field level filters for field: BatchId (BMF_UNAPPLIED.batch_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBatchIdFilter (StringFilter[] value) throws ServiceException {
    this.BatchId = value;
  }
  /** Retrieve filter for field: BatchId (BMF_UNAPPLIED.batch_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBatchIdFilter () {
    return this.BatchId;
  }

  /**
   * Retrieves the BatchIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BatchIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BatchIdFilter field
   */
  public String[] getBatchIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBatchIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBatchIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBatchIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BatchIdFilter filter value from a formatted string
   *
   * @param _value the BatchIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BatchIdFilter filter field
   */
  public void setBatchIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBatchIdFilterFromFormattedString");
    try {
      this.setBatchIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBatchIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBatchIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * @param fetch whether to fetch this field or not
   */
  public void setBatchIdServFetch (boolean fetch) {
    this.BatchIdServFetch = fetch;
  }
  /** Retrieve Fetch value for field: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * @return boolean the Fetch value for this field
   */
  public boolean getBatchIdServFetch () {
    return this.BatchIdServFetch;
  }
  /** Set the SortOrder for field: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBatchIdServSortOrder (Integer value) {
    this.BatchIdServSort = value;
  }
  /** Retrieve SortOrder for field: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBatchIdServSortOrder () {
    return this.BatchIdServSort;
  }
  /** Set the sort direction for field: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBatchIdServSortDirection (boolean ascending) {
    this.BatchIdServSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBatchIdServSortDirection () {
    return this.BatchIdServSortAscending;
  }
  /** Set the field level filters for field: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBatchIdServFilter (IntegerFilter[] value) throws ServiceException {
    this.BatchIdServ = value;
  }
  /** Retrieve filter for field: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getBatchIdServFilter () {
    return this.BatchIdServ;
  }

  /**
   * Retrieves the BatchIdServFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BatchIdServFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BatchIdServFilter field
   */
  public String[] getBatchIdServFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdServFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBatchIdServFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBatchIdServFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBatchIdServFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BatchIdServFilter filter value from a formatted string
   *
   * @param _value the BatchIdServFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BatchIdServFilter filter field
   */
  public void setBatchIdServFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBatchIdServFilterFromFormattedString");
    try {
      this.setBatchIdServFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BatchIdServFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBatchIdServFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBatchIdServFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @param fetch whether to fetch this field or not
   */
  public void setTransSubmitterFetch (boolean fetch) {
    this.TransSubmitterFetch = fetch;
  }
  /** Retrieve Fetch value for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @return boolean the Fetch value for this field
   */
  public boolean getTransSubmitterFetch () {
    return this.TransSubmitterFetch;
  }
  /** Set the SortOrder for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setTransSubmitterSortOrder (Integer value) {
    this.TransSubmitterSort = value;
  }
  /** Retrieve SortOrder for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getTransSubmitterSortOrder () {
    return this.TransSubmitterSort;
  }
  /** Set the sort direction for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setTransSubmitterSortDirection (boolean ascending) {
    this.TransSubmitterSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getTransSubmitterSortDirection () {
    return this.TransSubmitterSortAscending;
  }
  /** Set the case insensitive for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setTransSubmitterCaseInsensitive (boolean ascending) {
    this.TransSubmitterCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getTransSubmitterCaseInsensitive () {
    return this.TransSubmitterCaseInsensitive;
  }
  /** Set the field level filters for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setTransSubmitterFilter (StringFilter[] value) throws ServiceException {
    this.TransSubmitter = value;
  }
  /** Retrieve filter for field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getTransSubmitterFilter () {
    return this.TransSubmitter;
  }

  /**
   * Retrieves the TransSubmitterFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransSubmitterFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSubmitterFilter field
   */
  public String[] getTransSubmitterFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSubmitterFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getTransSubmitterFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSubmitterFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSubmitterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSubmitterFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the TransSubmitterFilter filter value from a formatted string
   *
   * @param _value the TransSubmitterFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the TransSubmitterFilter filter field
   */
  public void setTransSubmitterFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransSubmitterFilterFromFormattedString");
    try {
      this.setTransSubmitterFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransSubmitterFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSubmitterFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSubmitterFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ChgDate (BMF_UNAPPLIED.chg_date)
   * @param fetch whether to fetch this field or not
   */
  public void setChgDateFetch (boolean fetch) {
    this.ChgDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ChgDate (BMF_UNAPPLIED.chg_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getChgDateFetch () {
    return this.ChgDateFetch;
  }
  /** Set the SortOrder for field: ChgDate (BMF_UNAPPLIED.chg_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setChgDateSortOrder (Integer value) {
    this.ChgDateSort = value;
  }
  /** Retrieve SortOrder for field: ChgDate (BMF_UNAPPLIED.chg_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getChgDateSortOrder () {
    return this.ChgDateSort;
  }
  /** Set the sort direction for field: ChgDate (BMF_UNAPPLIED.chg_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setChgDateSortDirection (boolean ascending) {
    this.ChgDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ChgDate (BMF_UNAPPLIED.chg_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getChgDateSortDirection () {
    return this.ChgDateSortAscending;
  }
  /** Set the field level filters for field: ChgDate (BMF_UNAPPLIED.chg_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setChgDateFilter (DateFilter[] value) throws ServiceException {
    this.ChgDate = value;
  }
  /** Retrieve filter for field: ChgDate (BMF_UNAPPLIED.chg_date)
   * @return DateFilter[] array of field level filters
   */
  public DateFilter[] getChgDateFilter () {
    return this.ChgDate;
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedString");
  }

  /**
   * Retrieves the ChgDateFilter filter value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDateFilter filter value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDateFilter field
   */
  public String[] getChgDateFilterAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getChgDateFilter(), _locale, true, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateFilterAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDateFilter filter value from a formatted string
   *
   * @param _value the ChgDateFilter filter value(s) in formatted date/time form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ChgDateFilter filter field
   */
  public void setChgDateFilterFromFormattedDateTimeString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
    try {
      this.setChgDateFilter((DateFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, true, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFilterFromFormattedDateTimeString");
  }


  /** Set the field level Fetch value for field: ActionCode (BMF_UNAPPLIED.action_code)
   * @param fetch whether to fetch this field or not
   */
  public void setActionCodeFetch (boolean fetch) {
    this.ActionCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ActionCode (BMF_UNAPPLIED.action_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getActionCodeFetch () {
    return this.ActionCodeFetch;
  }
  /** Set the SortOrder for field: ActionCode (BMF_UNAPPLIED.action_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setActionCodeSortOrder (Integer value) {
    this.ActionCodeSort = value;
  }
  /** Retrieve SortOrder for field: ActionCode (BMF_UNAPPLIED.action_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getActionCodeSortOrder () {
    return this.ActionCodeSort;
  }
  /** Set the sort direction for field: ActionCode (BMF_UNAPPLIED.action_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setActionCodeSortDirection (boolean ascending) {
    this.ActionCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ActionCode (BMF_UNAPPLIED.action_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getActionCodeSortDirection () {
    return this.ActionCodeSortAscending;
  }
  /** Set the case insensitive for field: ActionCode (BMF_UNAPPLIED.action_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setActionCodeCaseInsensitive (boolean ascending) {
    this.ActionCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ActionCode (BMF_UNAPPLIED.action_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getActionCodeCaseInsensitive () {
    return this.ActionCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ActionCode (BMF_UNAPPLIED.action_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setActionCodeFilter (StringFilter[] value) throws ServiceException {
    this.ActionCode = value;
  }
  /** Retrieve filter for field: ActionCode (BMF_UNAPPLIED.action_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getActionCodeFilter () {
    return this.ActionCode;
  }

  /**
   * Retrieves the ActionCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActionCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActionCodeFilter field
   */
  public String[] getActionCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActionCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getActionCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActionCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActionCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ActionCodeFilter filter value from a formatted string
   *
   * @param _value the ActionCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ActionCodeFilter filter field
   */
  public void setActionCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActionCodeFilterFromFormattedString");
    try {
      this.setActionCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActionCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActionCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActionCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ProfileId (BMF_UNAPPLIED.profile_id)
   * @param fetch whether to fetch this field or not
   */
  public void setProfileIdFetch (boolean fetch) {
    this.ProfileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: ProfileId (BMF_UNAPPLIED.profile_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getProfileIdFetch () {
    return this.ProfileIdFetch;
  }
  /** Set the SortOrder for field: ProfileId (BMF_UNAPPLIED.profile_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setProfileIdSortOrder (Integer value) {
    this.ProfileIdSort = value;
  }
  /** Retrieve SortOrder for field: ProfileId (BMF_UNAPPLIED.profile_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getProfileIdSortOrder () {
    return this.ProfileIdSort;
  }
  /** Set the sort direction for field: ProfileId (BMF_UNAPPLIED.profile_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setProfileIdSortDirection (boolean ascending) {
    this.ProfileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ProfileId (BMF_UNAPPLIED.profile_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getProfileIdSortDirection () {
    return this.ProfileIdSortAscending;
  }
  /** Set the field level filters for field: ProfileId (BMF_UNAPPLIED.profile_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setProfileIdFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ProfileId = value;
  }
  /** Retrieve filter for field: ProfileId (BMF_UNAPPLIED.profile_id)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getProfileIdFilter () {
    return this.ProfileId;
  }

  /**
   * Retrieves the ProfileIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ProfileIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileIdFilter field
   */
  public String[] getProfileIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getProfileIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ProfileIdFilter filter value from a formatted string
   *
   * @param _value the ProfileIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ProfileIdFilter filter field
   */
  public void setProfileIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setProfileIdFilterFromFormattedString");
    try {
      this.setProfileIdFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ProfileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @param fetch whether to fetch this field or not
   */
  public void setMicrBankIdFetch (boolean fetch) {
    this.MicrBankIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getMicrBankIdFetch () {
    return this.MicrBankIdFetch;
  }
  /** Set the SortOrder for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMicrBankIdSortOrder (Integer value) {
    this.MicrBankIdSort = value;
  }
  /** Retrieve SortOrder for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMicrBankIdSortOrder () {
    return this.MicrBankIdSort;
  }
  /** Set the sort direction for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMicrBankIdSortDirection (boolean ascending) {
    this.MicrBankIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMicrBankIdSortDirection () {
    return this.MicrBankIdSortAscending;
  }
  /** Set the case insensitive for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMicrBankIdCaseInsensitive (boolean ascending) {
    this.MicrBankIdCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMicrBankIdCaseInsensitive () {
    return this.MicrBankIdCaseInsensitive;
  }
  /** Set the field level filters for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMicrBankIdFilter (StringFilter[] value) throws ServiceException {
    this.MicrBankId = value;
  }
  /** Retrieve filter for field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMicrBankIdFilter () {
    return this.MicrBankId;
  }

  /**
   * Retrieves the MicrBankIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MicrBankIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrBankIdFilter field
   */
  public String[] getMicrBankIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrBankIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMicrBankIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrBankIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrBankIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrBankIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MicrBankIdFilter filter value from a formatted string
   *
   * @param _value the MicrBankIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MicrBankIdFilter filter field
   */
  public void setMicrBankIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMicrBankIdFilterFromFormattedString");
    try {
      this.setMicrBankIdFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrBankIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrBankIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrBankIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @param fetch whether to fetch this field or not
   */
  public void setMicrDdaNumFetch (boolean fetch) {
    this.MicrDdaNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getMicrDdaNumFetch () {
    return this.MicrDdaNumFetch;
  }
  /** Set the SortOrder for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMicrDdaNumSortOrder (Integer value) {
    this.MicrDdaNumSort = value;
  }
  /** Retrieve SortOrder for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMicrDdaNumSortOrder () {
    return this.MicrDdaNumSort;
  }
  /** Set the sort direction for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMicrDdaNumSortDirection (boolean ascending) {
    this.MicrDdaNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMicrDdaNumSortDirection () {
    return this.MicrDdaNumSortAscending;
  }
  /** Set the case insensitive for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMicrDdaNumCaseInsensitive (boolean ascending) {
    this.MicrDdaNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMicrDdaNumCaseInsensitive () {
    return this.MicrDdaNumCaseInsensitive;
  }
  /** Set the field level filters for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMicrDdaNumFilter (StringFilter[] value) throws ServiceException {
    this.MicrDdaNum = value;
  }
  /** Retrieve filter for field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMicrDdaNumFilter () {
    return this.MicrDdaNum;
  }

  /**
   * Retrieves the MicrDdaNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MicrDdaNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrDdaNumFilter field
   */
  public String[] getMicrDdaNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrDdaNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMicrDdaNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrDdaNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrDdaNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrDdaNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MicrDdaNumFilter filter value from a formatted string
   *
   * @param _value the MicrDdaNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MicrDdaNumFilter filter field
   */
  public void setMicrDdaNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMicrDdaNumFilterFromFormattedString");
    try {
      this.setMicrDdaNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrDdaNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrDdaNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrDdaNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @param fetch whether to fetch this field or not
   */
  public void setMicrCheckNumFetch (boolean fetch) {
    this.MicrCheckNumFetch = fetch;
  }
  /** Retrieve Fetch value for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @return boolean the Fetch value for this field
   */
  public boolean getMicrCheckNumFetch () {
    return this.MicrCheckNumFetch;
  }
  /** Set the SortOrder for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setMicrCheckNumSortOrder (Integer value) {
    this.MicrCheckNumSort = value;
  }
  /** Retrieve SortOrder for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getMicrCheckNumSortOrder () {
    return this.MicrCheckNumSort;
  }
  /** Set the sort direction for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setMicrCheckNumSortDirection (boolean ascending) {
    this.MicrCheckNumSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getMicrCheckNumSortDirection () {
    return this.MicrCheckNumSortAscending;
  }
  /** Set the case insensitive for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setMicrCheckNumCaseInsensitive (boolean ascending) {
    this.MicrCheckNumCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getMicrCheckNumCaseInsensitive () {
    return this.MicrCheckNumCaseInsensitive;
  }
  /** Set the field level filters for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setMicrCheckNumFilter (StringFilter[] value) throws ServiceException {
    this.MicrCheckNum = value;
  }
  /** Retrieve filter for field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getMicrCheckNumFilter () {
    return this.MicrCheckNum;
  }

  /**
   * Retrieves the MicrCheckNumFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MicrCheckNumFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrCheckNumFilter field
   */
  public String[] getMicrCheckNumFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrCheckNumFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getMicrCheckNumFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrCheckNumFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrCheckNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrCheckNumFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the MicrCheckNumFilter filter value from a formatted string
   *
   * @param _value the MicrCheckNumFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the MicrCheckNumFilter filter field
   */
  public void setMicrCheckNumFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMicrCheckNumFilterFromFormattedString");
    try {
      this.setMicrCheckNumFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MicrCheckNumFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrCheckNumFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrCheckNumFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * @param fetch whether to fetch this field or not
   */
  public void setArchFlagFetch (boolean fetch) {
    this.ArchFlagFetch = fetch;
  }
  /** Retrieve Fetch value for field: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * @return boolean the Fetch value for this field
   */
  public boolean getArchFlagFetch () {
    return this.ArchFlagFetch;
  }
  /** Set the SortOrder for field: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setArchFlagSortOrder (Integer value) {
    this.ArchFlagSort = value;
  }
  /** Retrieve SortOrder for field: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getArchFlagSortOrder () {
    return this.ArchFlagSort;
  }
  /** Set the sort direction for field: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setArchFlagSortDirection (boolean ascending) {
    this.ArchFlagSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getArchFlagSortDirection () {
    return this.ArchFlagSortAscending;
  }
  /** Set the field level filters for field: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setArchFlagFilter (BooleanFilter[] value) throws ServiceException {
    this.ArchFlag = value;
  }
  /** Retrieve filter for field: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * @return BooleanFilter[] array of field level filters
   */
  public BooleanFilter[] getArchFlagFilter () {
    return this.ArchFlag;
  }

  /**
   * Retrieves the ArchFlagFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ArchFlagFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArchFlagFilter field
   */
  public String[] getArchFlagFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getArchFlagFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArchFlagFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getArchFlagFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ArchFlagFilter filter value from a formatted string
   *
   * @param _value the ArchFlagFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ArchFlagFilter filter field
   */
  public void setArchFlagFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setArchFlagFilterFromFormattedString");
    try {
      this.setArchFlagFilter((BooleanFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ArchFlagFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setArchFlagFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArchFlagFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @param fetch whether to fetch this field or not
   */
  public void setManualCcauthCodeFetch (boolean fetch) {
    this.ManualCcauthCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getManualCcauthCodeFetch () {
    return this.ManualCcauthCodeFetch;
  }
  /** Set the SortOrder for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setManualCcauthCodeSortOrder (Integer value) {
    this.ManualCcauthCodeSort = value;
  }
  /** Retrieve SortOrder for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getManualCcauthCodeSortOrder () {
    return this.ManualCcauthCodeSort;
  }
  /** Set the sort direction for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setManualCcauthCodeSortDirection (boolean ascending) {
    this.ManualCcauthCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getManualCcauthCodeSortDirection () {
    return this.ManualCcauthCodeSortAscending;
  }
  /** Set the case insensitive for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setManualCcauthCodeCaseInsensitive (boolean ascending) {
    this.ManualCcauthCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getManualCcauthCodeCaseInsensitive () {
    return this.ManualCcauthCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setManualCcauthCodeFilter (StringFilter[] value) throws ServiceException {
    this.ManualCcauthCode = value;
  }
  /** Retrieve filter for field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getManualCcauthCodeFilter () {
    return this.ManualCcauthCode;
  }

  /**
   * Retrieves the ManualCcauthCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ManualCcauthCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthCodeFilter field
   */
  public String[] getManualCcauthCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getManualCcauthCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ManualCcauthCodeFilter filter value from a formatted string
   *
   * @param _value the ManualCcauthCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ManualCcauthCodeFilter filter field
   */
  public void setManualCcauthCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setManualCcauthCodeFilterFromFormattedString");
    try {
      this.setManualCcauthCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @param fetch whether to fetch this field or not
   */
  public void setManualCcauthDateFetch (boolean fetch) {
    this.ManualCcauthDateFetch = fetch;
  }
  /** Retrieve Fetch value for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @return boolean the Fetch value for this field
   */
  public boolean getManualCcauthDateFetch () {
    return this.ManualCcauthDateFetch;
  }
  /** Set the SortOrder for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setManualCcauthDateSortOrder (Integer value) {
    this.ManualCcauthDateSort = value;
  }
  /** Retrieve SortOrder for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getManualCcauthDateSortOrder () {
    return this.ManualCcauthDateSort;
  }
  /** Set the sort direction for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setManualCcauthDateSortDirection (boolean ascending) {
    this.ManualCcauthDateSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getManualCcauthDateSortDirection () {
    return this.ManualCcauthDateSortAscending;
  }
  /** Set the case insensitive for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setManualCcauthDateCaseInsensitive (boolean ascending) {
    this.ManualCcauthDateCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getManualCcauthDateCaseInsensitive () {
    return this.ManualCcauthDateCaseInsensitive;
  }
  /** Set the field level filters for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setManualCcauthDateFilter (StringFilter[] value) throws ServiceException {
    this.ManualCcauthDate = value;
  }
  /** Retrieve filter for field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getManualCcauthDateFilter () {
    return this.ManualCcauthDate;
  }

  /**
   * Retrieves the ManualCcauthDateFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ManualCcauthDateFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthDateFilter field
   */
  public String[] getManualCcauthDateFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthDateFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getManualCcauthDateFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthDateFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthDateFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ManualCcauthDateFilter filter value from a formatted string
   *
   * @param _value the ManualCcauthDateFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ManualCcauthDateFilter filter field
   */
  public void setManualCcauthDateFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setManualCcauthDateFilterFromFormattedString");
    try {
      this.setManualCcauthDateFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ManualCcauthDateFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthDateFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthDateFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: FileId (BMF_UNAPPLIED.file_id)
   * @param fetch whether to fetch this field or not
   */
  public void setFileIdFetch (boolean fetch) {
    this.FileIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: FileId (BMF_UNAPPLIED.file_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getFileIdFetch () {
    return this.FileIdFetch;
  }
  /** Set the SortOrder for field: FileId (BMF_UNAPPLIED.file_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setFileIdSortOrder (Integer value) {
    this.FileIdSort = value;
  }
  /** Retrieve SortOrder for field: FileId (BMF_UNAPPLIED.file_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getFileIdSortOrder () {
    return this.FileIdSort;
  }
  /** Set the sort direction for field: FileId (BMF_UNAPPLIED.file_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setFileIdSortDirection (boolean ascending) {
    this.FileIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: FileId (BMF_UNAPPLIED.file_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getFileIdSortDirection () {
    return this.FileIdSortAscending;
  }
  /** Set the field level filters for field: FileId (BMF_UNAPPLIED.file_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setFileIdFilter (IntegerFilter[] value) throws ServiceException {
    this.FileId = value;
  }
  /** Retrieve filter for field: FileId (BMF_UNAPPLIED.file_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getFileIdFilter () {
    return this.FileId;
  }

  /**
   * Retrieves the FileIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The FileIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileIdFilter field
   */
  public String[] getFileIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getFileIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the FileIdFilter filter value from a formatted string
   *
   * @param _value the FileIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the FileIdFilter filter field
   */
  public void setFileIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setFileIdFilterFromFormattedString");
    try {
      this.setFileIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("FileIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * @param fetch whether to fetch this field or not
   */
  public void setResponseCodeFetch (boolean fetch) {
    this.ResponseCodeFetch = fetch;
  }
  /** Retrieve Fetch value for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * @return boolean the Fetch value for this field
   */
  public boolean getResponseCodeFetch () {
    return this.ResponseCodeFetch;
  }
  /** Set the SortOrder for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setResponseCodeSortOrder (Integer value) {
    this.ResponseCodeSort = value;
  }
  /** Retrieve SortOrder for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getResponseCodeSortOrder () {
    return this.ResponseCodeSort;
  }
  /** Set the sort direction for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setResponseCodeSortDirection (boolean ascending) {
    this.ResponseCodeSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getResponseCodeSortDirection () {
    return this.ResponseCodeSortAscending;
  }
  /** Set the case insensitive for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setResponseCodeCaseInsensitive (boolean ascending) {
    this.ResponseCodeCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getResponseCodeCaseInsensitive () {
    return this.ResponseCodeCaseInsensitive;
  }
  /** Set the field level filters for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setResponseCodeFilter (StringFilter[] value) throws ServiceException {
    this.ResponseCode = value;
  }
  /** Retrieve filter for field: ResponseCode (BMF_UNAPPLIED.response_code)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getResponseCodeFilter () {
    return this.ResponseCode;
  }

  /**
   * Retrieves the ResponseCodeFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ResponseCodeFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResponseCodeFilter field
   */
  public String[] getResponseCodeFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResponseCodeFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getResponseCodeFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResponseCodeFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResponseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getResponseCodeFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ResponseCodeFilter filter value from a formatted string
   *
   * @param _value the ResponseCodeFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ResponseCodeFilter filter field
   */
  public void setResponseCodeFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setResponseCodeFilterFromFormattedString");
    try {
      this.setResponseCodeFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ResponseCodeFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setResponseCodeFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResponseCodeFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @param fetch whether to fetch this field or not
   */
  public void setBillOrderNumberFetch (boolean fetch) {
    this.BillOrderNumberFetch = fetch;
  }
  /** Retrieve Fetch value for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @return boolean the Fetch value for this field
   */
  public boolean getBillOrderNumberFetch () {
    return this.BillOrderNumberFetch;
  }
  /** Set the SortOrder for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setBillOrderNumberSortOrder (Integer value) {
    this.BillOrderNumberSort = value;
  }
  /** Retrieve SortOrder for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getBillOrderNumberSortOrder () {
    return this.BillOrderNumberSort;
  }
  /** Set the sort direction for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setBillOrderNumberSortDirection (boolean ascending) {
    this.BillOrderNumberSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getBillOrderNumberSortDirection () {
    return this.BillOrderNumberSortAscending;
  }
  /** Set the case insensitive for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setBillOrderNumberCaseInsensitive (boolean ascending) {
    this.BillOrderNumberCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getBillOrderNumberCaseInsensitive () {
    return this.BillOrderNumberCaseInsensitive;
  }
  /** Set the field level filters for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setBillOrderNumberFilter (StringFilter[] value) throws ServiceException {
    this.BillOrderNumber = value;
  }
  /** Retrieve filter for field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getBillOrderNumberFilter () {
    return this.BillOrderNumber;
  }

  /**
   * Retrieves the BillOrderNumberFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The BillOrderNumberFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillOrderNumberFilter field
   */
  public String[] getBillOrderNumberFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillOrderNumberFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getBillOrderNumberFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillOrderNumberFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillOrderNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillOrderNumberFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the BillOrderNumberFilter filter value from a formatted string
   *
   * @param _value the BillOrderNumberFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the BillOrderNumberFilter filter field
   */
  public void setBillOrderNumberFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBillOrderNumberFilterFromFormattedString");
    try {
      this.setBillOrderNumberFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BillOrderNumberFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillOrderNumberFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillOrderNumberFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalAmountFetch (boolean fetch) {
    this.ExternalAmountFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalAmountFetch () {
    return this.ExternalAmountFetch;
  }
  /** Set the SortOrder for field: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalAmountSortOrder (Integer value) {
    this.ExternalAmountSort = value;
  }
  /** Retrieve SortOrder for field: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalAmountSortOrder () {
    return this.ExternalAmountSort;
  }
  /** Set the sort direction for field: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalAmountSortDirection (boolean ascending) {
    this.ExternalAmountSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalAmountSortDirection () {
    return this.ExternalAmountSortAscending;
  }
  /** Set the field level filters for field: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalAmountFilter (BigIntegerFilter[] value) throws ServiceException {
    this.ExternalAmount = value;
  }
  /** Retrieve filter for field: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * @return BigIntegerFilter[] array of field level filters
   */
  public BigIntegerFilter[] getExternalAmountFilter () {
    return this.ExternalAmount;
  }

  /**
   * Retrieves the ExternalAmountFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalAmountFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalAmountFilter field
   */
  public String[] getExternalAmountFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalAmountFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalAmountFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalAmountFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalAmountFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalAmountFilter filter value from a formatted string
   *
   * @param _value the ExternalAmountFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalAmountFilter filter field
   */
  public void setExternalAmountFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalAmountFilterFromFormattedString");
    try {
      this.setExternalAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalAmountFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalAmountFilterFromFormattedString");
  }

  /**
   * Sets the ExternalAmountFilter filter value from a formatted string
   *
   * @param _value the ExternalAmountFilter filter value(s) in formatted currency form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalAmountFilter filter field
   */
  public void setExternalAmountFilterFromFormattedCurrencyString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalAmountFilterFromFormattedCurrencyString");
    try {
      this.setExternalAmountFilter((BigIntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, true)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalAmountFilterFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalAmountFilterFromFormattedCurrencyString");
  }
  /**
   * Retrieves the ExternalAmountFilter filter value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalAmountFilter filter value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalAmountFilter field
   */

  public String[] getExternalAmountFilterAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalAmountFilterAsFormattedCurrencyString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalAmountFilter(), _locale, false, true);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalAmountFilterAsFormattedCurrencyString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmountFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalAmountFilterAsFormattedCurrencyString");
      throw excp;
    }
  }


  /** Set the field level Fetch value for field: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * @param fetch whether to fetch this field or not
   */
  public void setExternalCurrencyFetch (boolean fetch) {
    this.ExternalCurrencyFetch = fetch;
  }
  /** Retrieve Fetch value for field: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * @return boolean the Fetch value for this field
   */
  public boolean getExternalCurrencyFetch () {
    return this.ExternalCurrencyFetch;
  }
  /** Set the SortOrder for field: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setExternalCurrencySortOrder (Integer value) {
    this.ExternalCurrencySort = value;
  }
  /** Retrieve SortOrder for field: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getExternalCurrencySortOrder () {
    return this.ExternalCurrencySort;
  }
  /** Set the sort direction for field: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setExternalCurrencySortDirection (boolean ascending) {
    this.ExternalCurrencySortAscending = ascending;
  }
  /** Retrieve SortDirection for field: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getExternalCurrencySortDirection () {
    return this.ExternalCurrencySortAscending;
  }
  /** Set the field level filters for field: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setExternalCurrencyFilter (IntegerFilter[] value) throws ServiceException {
    this.ExternalCurrency = value;
  }
  /** Retrieve filter for field: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getExternalCurrencyFilter () {
    return this.ExternalCurrency;
  }

  /**
   * Retrieves the ExternalCurrencyFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalCurrencyFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalCurrencyFilter field
   */
  public String[] getExternalCurrencyFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalCurrencyFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getExternalCurrencyFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalCurrencyFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalCurrencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalCurrencyFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalCurrencyFilter filter value from a formatted string
   *
   * @param _value the ExternalCurrencyFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the ExternalCurrencyFilter filter field
   */
  public void setExternalCurrencyFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalCurrencyFilterFromFormattedString");
    try {
      this.setExternalCurrencyFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalCurrencyFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalCurrencyFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalCurrencyFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * @param fetch whether to fetch this field or not
   */
  public void setOpenItemIdFetch (boolean fetch) {
    this.OpenItemIdFetch = fetch;
  }
  /** Retrieve Fetch value for field: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * @return boolean the Fetch value for this field
   */
  public boolean getOpenItemIdFetch () {
    return this.OpenItemIdFetch;
  }
  /** Set the SortOrder for field: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setOpenItemIdSortOrder (Integer value) {
    this.OpenItemIdSort = value;
  }
  /** Retrieve SortOrder for field: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getOpenItemIdSortOrder () {
    return this.OpenItemIdSort;
  }
  /** Set the sort direction for field: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setOpenItemIdSortDirection (boolean ascending) {
    this.OpenItemIdSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getOpenItemIdSortDirection () {
    return this.OpenItemIdSortAscending;
  }
  /** Set the field level filters for field: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setOpenItemIdFilter (IntegerFilter[] value) throws ServiceException {
    this.OpenItemId = value;
  }
  /** Retrieve filter for field: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * @return IntegerFilter[] array of field level filters
   */
  public IntegerFilter[] getOpenItemIdFilter () {
    return this.OpenItemId;
  }

  /**
   * Retrieves the OpenItemIdFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The OpenItemIdFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemIdFilter field
   */
  public String[] getOpenItemIdFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getOpenItemIdFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the OpenItemIdFilter filter value from a formatted string
   *
   * @param _value the OpenItemIdFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the OpenItemIdFilter filter field
   */
  public void setOpenItemIdFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setOpenItemIdFilterFromFormattedString");
    try {
      this.setOpenItemIdFilter((IntegerFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("OpenItemIdFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFilterFromFormattedString");
  }

  /** Set the field level Fetch value for field: Annotation (BMF_UNAPPLIED.annotation)
   * @param fetch whether to fetch this field or not
   */
  public void setAnnotationFetch (boolean fetch) {
    this.AnnotationFetch = fetch;
  }
  /** Retrieve Fetch value for field: Annotation (BMF_UNAPPLIED.annotation)
   * @return boolean the Fetch value for this field
   */
  public boolean getAnnotationFetch () {
    return this.AnnotationFetch;
  }
  /** Set the SortOrder for field: Annotation (BMF_UNAPPLIED.annotation)
   * Sort Orders must be all represented for a filter, and start at 0 (ie: all values from 0-MAX(SortOrder) must be set).
   * @param value integer precedent of this field's sort order
   */
  public void setAnnotationSortOrder (Integer value) {
    this.AnnotationSort = value;
  }
  /** Retrieve SortOrder for field: Annotation (BMF_UNAPPLIED.annotation)
   * @return Integer the sort order, if set, for the field
   */
  public Integer getAnnotationSortOrder () {
    return this.AnnotationSort;
  }
  /** Set the sort direction for field: Annotation (BMF_UNAPPLIED.annotation)
   * @param ascending whether the sort for this field is ascending (false is descending)
   */
  public void setAnnotationSortDirection (boolean ascending) {
    this.AnnotationSortAscending = ascending;
  }
  /** Retrieve SortDirection for field: Annotation (BMF_UNAPPLIED.annotation)
   * @return boolean whether the SortDirection is Ascending
   */
  public boolean getAnnotationSortDirection () {
    return this.AnnotationSortAscending;
  }
  /** Set the case insensitive for field: Annotation (BMF_UNAPPLIED.annotation)
   * @param ascending whether the sort for this field is case insensitive
   */
  public void setAnnotationCaseInsensitive (boolean ascending) {
    this.AnnotationCaseInsensitive = ascending;
  }
  /** Retrieve CaseInsensitive for field: Annotation (BMF_UNAPPLIED.annotation)
   * @return boolean whether the field is CaseInsensitive
   */
  public boolean getAnnotationCaseInsensitive () {
    return this.AnnotationCaseInsensitive;
  }
  /** Set the field level filters for field: Annotation (BMF_UNAPPLIED.annotation)
   * If there is more than one entry in the array, they will all be OR'ed together.
   * It is not valid to have more than one of any type of filter in the array (ie: may only have one EqualsFilter, or one InFilter, but may have both).
   * @param value array of filters for this field.
   */
  public void setAnnotationFilter (StringFilter[] value) throws ServiceException {
    this.Annotation = value;
  }
  /** Retrieve filter for field: Annotation (BMF_UNAPPLIED.annotation)
   * @return StringFilter[] array of field level filters
   */
  public StringFilter[] getAnnotationFilter () {
    return this.Annotation;
  }

  /**
   * Retrieves the AnnotationFilter filter value as a formatted string
   *
   * @param _locale locale settings used to format text based display values
   * @return The AnnotationFilter filter value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AnnotationFilter field
   */
  public String[] getAnnotationFilterAsFormattedString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFilterAsFormattedString");
    try {
      String[] formattedValues = null;
      Object[] formattedObjs = FilterConversionHelper.format(this.getAnnotationFilter(), _locale, false, false);
      if (formattedObjs != null) {
        formattedValues = new String[formattedObjs.length];
        for (int i=0; i<formattedObjs.length; i++) {
          formattedValues[i] = formattedObjs[i].toString();
        }
      }
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationFilterAsFormattedString");
      return formattedValues;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationFilterAsFormattedString");
      throw excp;
    }
  }
  /**
   * Sets the AnnotationFilter filter value from a formatted string
   *
   * @param _value the AnnotationFilter filter value(s) in formatted form. If the requested
   *          output filter type is a type that contains a single data item, then a single
   *          String display value object must be specified. If the requested output filter type
   *          is a type that contains more than one data item (e.g. a Between Filter), then a
   *          Collection of String display value objects must be provided.
   * @param _filterType output filter type (see {@link FilterConversionHelper} fields for a list of valid values)
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if invalid data is set in the AnnotationFilter filter field
   */
  public void setAnnotationFilterFromFormattedString(String[] _value, String[] _filterType, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAnnotationFilterFromFormattedString");
    try {
      this.setAnnotationFilter((StringFilter[])(FilterConversionHelper.parse(_value, _filterType, _locale, false, false)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AnnotationFilter");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFilterFromFormattedString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFilterFromFormattedString");
  }

  public String toString() {
    return UnappliedPaymentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return UnappliedPaymentObjectHelper.toMap(this, null);
  }
}
