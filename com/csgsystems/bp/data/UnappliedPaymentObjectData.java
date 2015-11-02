/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: UnappliedPaymentObjectData.java
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
import java.util.Locale;
import java.math.BigInteger;
import java.util.Map;
import java.util.Locale;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlTransient;

import javax.ws.rs.QueryParam;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.bulk.*;


import com.csgsystems.api.format.FieldFormatMgr;

import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;
import com.csgsystems.api.enumeration.EnumeratedDataMgr;


import com.csgsystems.api.base.BaseObjectData;
  
/** UnappliedPaymentObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class UnappliedPaymentObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public UnappliedPaymentObjectKeyData Key = null;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** BMF_UNAPPLIED.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** BMF_UNAPPLIED.applied_status field */
  public    Boolean AppliedStatus  = null;
  protected boolean _AppliedStatusSet = false;
  /** BMF_UNAPPLIED.bmf_tracking_id field */
  public    Integer BmfTrackingId  = null;
  protected boolean _BmfTrackingIdSet = false;
  /** BMF_UNAPPLIED.bmf_tracking_id_serv field */
  public    Integer BmfTrackingIdServ  = null;
  protected boolean _BmfTrackingIdServSet = false;
  /** BMF_UNAPPLIED.bmf_error_text field */
  public    String BmfErrorText  = null;
  protected boolean _BmfErrorTextSet = false;
  /** BMF_UNAPPLIED.orig_bill_ref_no field */
  public    Integer OrigBillRefNo  = null;
  protected boolean _OrigBillRefNoSet = false;
  /** BMF_UNAPPLIED.orig_bill_ref_resets field */
  public    Integer OrigBillRefResets  = null;
  protected boolean _OrigBillRefResetsSet = false;
  /** BMF_UNAPPLIED.cr_note_bill_ref_no field */
  public    Integer CrNoteBillRefNo  = null;
  protected boolean _CrNoteBillRefNoSet = false;
  /** BMF_UNAPPLIED.cr_note_bill_ref_resets field */
  public    Integer CrNoteBillRefResets  = null;
  protected boolean _CrNoteBillRefResetsSet = false;
  /** BMF_UNAPPLIED.bmf_trans_type field */
  public    Integer BmfTransType  = null;
  protected boolean _BmfTransTypeSet = false;
  /** BMF_UNAPPLIED.trans_date field */
  public    Date TransDate  = null;
  protected boolean _TransDateSet = false;
  /** BMF_UNAPPLIED.post_date field */
  public    Date PostDate  = null;
  protected boolean _PostDateSet = false;
  /** BMF_UNAPPLIED.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** BMF_UNAPPLIED.trans_amount field */
  public    BigInteger TransAmount  = null;
  protected boolean _TransAmountSet = false;
  /** BMF_UNAPPLIED.gl_amount field */
  public    BigInteger GlAmount  = null;
  protected boolean _GlAmountSet = false;
  /** BMF_UNAPPLIED.orig_tracking_id field */
  public    Integer OrigTrackingId  = null;
  protected boolean _OrigTrackingIdSet = false;
  /** BMF_UNAPPLIED.orig_tracking_id_serv field */
  public    Integer OrigTrackingIdServ  = null;
  protected boolean _OrigTrackingIdServSet = false;
  /** BMF_UNAPPLIED.trans_source field */
  public    Integer TransSource  = null;
  protected boolean _TransSourceSet = false;
  /** BMF_UNAPPLIED.source_type field */
  public    Integer SourceType  = null;
  protected boolean _SourceTypeSet = false;
  /** BMF_UNAPPLIED.source_id field */
  public    Integer SourceId  = null;
  protected boolean _SourceIdSet = false;
  /** BMF_UNAPPLIED.source_id_serv field */
  public    Integer SourceIdServ  = null;
  protected boolean _SourceIdServSet = false;
  /** BMF_UNAPPLIED.batch_id field */
  public    String BatchId  = null;
  protected boolean _BatchIdSet = false;
  /** BMF_UNAPPLIED.batch_id_serv field */
  public    Integer BatchIdServ  = null;
  protected boolean _BatchIdServSet = false;
  /** BMF_UNAPPLIED.trans_submitter field */
  public    String TransSubmitter  = null;
  protected boolean _TransSubmitterSet = false;
  /** BMF_UNAPPLIED.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** BMF_UNAPPLIED.action_code field */
  public    String ActionCode  = null;
  protected boolean _ActionCodeSet = false;
  /** BMF_UNAPPLIED.profile_id field */
  public    BigInteger ProfileId  = null;
  protected boolean _ProfileIdSet = false;
  /** BMF_UNAPPLIED.micr_bank_id field */
  public    String MicrBankId  = null;
  protected boolean _MicrBankIdSet = false;
  /** BMF_UNAPPLIED.micr_dda_num field */
  public    String MicrDdaNum  = null;
  protected boolean _MicrDdaNumSet = false;
  /** BMF_UNAPPLIED.micr_check_num field */
  public    String MicrCheckNum  = null;
  protected boolean _MicrCheckNumSet = false;
  /** BMF_UNAPPLIED.arch_flag field */
  public    Boolean ArchFlag  = null;
  protected boolean _ArchFlagSet = false;
  /** BMF_UNAPPLIED.manual_ccauth_code field */
  public    String ManualCcauthCode  = null;
  protected boolean _ManualCcauthCodeSet = false;
  /** BMF_UNAPPLIED.manual_ccauth_date field */
  public    String ManualCcauthDate  = null;
  protected boolean _ManualCcauthDateSet = false;
  /** BMF_UNAPPLIED.file_id field */
  public    Integer FileId  = null;
  protected boolean _FileIdSet = false;
  /** BMF_UNAPPLIED.response_code field */
  public    String ResponseCode  = null;
  protected boolean _ResponseCodeSet = false;
  /** BMF_UNAPPLIED.bill_order_number field */
  public    String BillOrderNumber  = null;
  protected boolean _BillOrderNumberSet = false;
  /** BMF_UNAPPLIED.external_amount field */
  public    BigInteger ExternalAmount  = null;
  protected boolean _ExternalAmountSet = false;
  /** BMF_UNAPPLIED.external_currency field */
  public    Integer ExternalCurrency  = null;
  protected boolean _ExternalCurrencySet = false;
  /** BMF_UNAPPLIED.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** BMF_UNAPPLIED.annotation field */
  public    String Annotation  = null;
  protected boolean _AnnotationSet = false;
  private String _objName = "UnappliedPaymentObjectData";
  /** Default constructor */
  public UnappliedPaymentObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public UnappliedPaymentObjectData (UnappliedPaymentObjectData other)
  {

    if (other == null) return;
    this.Key = new UnappliedPaymentObjectKeyData (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.AppliedStatus = other.AppliedStatus;
    this._AppliedStatusSet = other._AppliedStatusSet;
    this.BmfTrackingId = other.BmfTrackingId;
    this._BmfTrackingIdSet = other._BmfTrackingIdSet;
    this.BmfTrackingIdServ = other.BmfTrackingIdServ;
    this._BmfTrackingIdServSet = other._BmfTrackingIdServSet;
    this.BmfErrorText = other.BmfErrorText;
    this._BmfErrorTextSet = other._BmfErrorTextSet;
    this.OrigBillRefNo = other.OrigBillRefNo;
    this._OrigBillRefNoSet = other._OrigBillRefNoSet;
    this.OrigBillRefResets = other.OrigBillRefResets;
    this._OrigBillRefResetsSet = other._OrigBillRefResetsSet;
    this.CrNoteBillRefNo = other.CrNoteBillRefNo;
    this._CrNoteBillRefNoSet = other._CrNoteBillRefNoSet;
    this.CrNoteBillRefResets = other.CrNoteBillRefResets;
    this._CrNoteBillRefResetsSet = other._CrNoteBillRefResetsSet;
    this.BmfTransType = other.BmfTransType;
    this._BmfTransTypeSet = other._BmfTransTypeSet;
    this.TransDate = other.TransDate;
    this._TransDateSet = other._TransDateSet;
    this.PostDate = other.PostDate;
    this._PostDateSet = other._PostDateSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.TransAmount = other.TransAmount;
    this._TransAmountSet = other._TransAmountSet;
    this.GlAmount = other.GlAmount;
    this._GlAmountSet = other._GlAmountSet;
    this.OrigTrackingId = other.OrigTrackingId;
    this._OrigTrackingIdSet = other._OrigTrackingIdSet;
    this.OrigTrackingIdServ = other.OrigTrackingIdServ;
    this._OrigTrackingIdServSet = other._OrigTrackingIdServSet;
    this.TransSource = other.TransSource;
    this._TransSourceSet = other._TransSourceSet;
    this.SourceType = other.SourceType;
    this._SourceTypeSet = other._SourceTypeSet;
    this.SourceId = other.SourceId;
    this._SourceIdSet = other._SourceIdSet;
    this.SourceIdServ = other.SourceIdServ;
    this._SourceIdServSet = other._SourceIdServSet;
    this.BatchId = other.BatchId;
    this._BatchIdSet = other._BatchIdSet;
    this.BatchIdServ = other.BatchIdServ;
    this._BatchIdServSet = other._BatchIdServSet;
    this.TransSubmitter = other.TransSubmitter;
    this._TransSubmitterSet = other._TransSubmitterSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.ActionCode = other.ActionCode;
    this._ActionCodeSet = other._ActionCodeSet;
    this.ProfileId = other.ProfileId;
    this._ProfileIdSet = other._ProfileIdSet;
    this.MicrBankId = other.MicrBankId;
    this._MicrBankIdSet = other._MicrBankIdSet;
    this.MicrDdaNum = other.MicrDdaNum;
    this._MicrDdaNumSet = other._MicrDdaNumSet;
    this.MicrCheckNum = other.MicrCheckNum;
    this._MicrCheckNumSet = other._MicrCheckNumSet;
    this.ArchFlag = other.ArchFlag;
    this._ArchFlagSet = other._ArchFlagSet;
    this.ManualCcauthCode = other.ManualCcauthCode;
    this._ManualCcauthCodeSet = other._ManualCcauthCodeSet;
    this.ManualCcauthDate = other.ManualCcauthDate;
    this._ManualCcauthDateSet = other._ManualCcauthDateSet;
    this.FileId = other.FileId;
    this._FileIdSet = other._FileIdSet;
    this.ResponseCode = other.ResponseCode;
    this._ResponseCodeSet = other._ResponseCodeSet;
    this.BillOrderNumber = other.BillOrderNumber;
    this._BillOrderNumberSet = other._BillOrderNumberSet;
    this.ExternalAmount = other.ExternalAmount;
    this._ExternalAmountSet = other._ExternalAmountSet;
    this.ExternalCurrency = other.ExternalCurrency;
    this._ExternalCurrencySet = other._ExternalCurrencySet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.Annotation = other.Annotation;
    this._AnnotationSet = other._AnnotationSet;
  }

  /** get the Key for this object
   * @return UnappliedPaymentObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public UnappliedPaymentObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (UnappliedPaymentObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (BMF_UNAPPLIED.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (BMF_UNAPPLIED.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (BMF_UNAPPLIED.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (BMF_UNAPPLIED.tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingId () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdSet;
  }

  /** Retrieves the TrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingId field
   */
   public String getTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingId field from a formatted string
   *
   * @param _value the TrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingId field
   */
   public void setTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdFromFormattedString");
   }

  /** set the fields value: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new UnappliedPaymentObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (BMF_UNAPPLIED.tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetTrackingIdServ () {
    if (this.Key == null) return false;
    return this.Key._TrackingIdServSet;
  }

  /** Retrieves the TrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TrackingIdServ field
   */
   public String getTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the TrackingIdServ field from a formatted string
   *
   * @param _value the TrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TrackingIdServ field
   */
   public void setTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTrackingIdServFromFormattedString");
   }

  /** set the fields value: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalId") 
  public void setAccountExternalId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalId", "setAccountExternalId");
    }
    if (value != null && !DataHelper.validLength (value, 144))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "AccountExternalId", "setAccountExternalId");
    }
    this.AccountExternalId = value;
    this._AccountExternalIdSet = true;
  }

  /** Retrieves the AccountExternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalId field
   */
   public String getAccountExternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdAsFormattedString");
       return fmtMgr.formatString(this.getAccountExternalId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalId field from a formatted string
   *
   * @param _value the AccountExternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalId field
   */
   public void setAccountExternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdFromFormattedString");
   }

  /** get the value of the field: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return String the value
   */
  public String getAccountExternalId () {
    return this.AccountExternalId;
  }
  /** Change the field to not being actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   */
  public void unsetAccountExternalId () {
    this._AccountExternalIdSet = false;
  }
  /** See if the field is actively set: AccountExternalId (CUSTOMER_ID_ACCT_MAP.external_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalId () {
    return this._AccountExternalIdSet;
  }
  /** set the fields value: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountExternalIdType") 
  public void setAccountExternalIdType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountExternalIdType", "setAccountExternalIdType");
    }
    this.AccountExternalIdType = value;
    this._AccountExternalIdTypeSet = true;
  }

  /** Retrieves the AccountExternalIdType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountExternalIdType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountExternalIdType field
   */
   public String getAccountExternalIdTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountExternalIdType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountExternalIdType field from a formatted string
   *
   * @param _value the AccountExternalIdType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountExternalIdType field
   */
   public void setAccountExternalIdTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountExternalIdType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountExternalIdType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountExternalIdTypeFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */

  public String getAccountExternalIdTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getAccountExternalIdType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated AccountExternalIdType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the AccountExternalIdType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the AccountExternalIdType field
   */
  public Enumeration getAccountExternalIdTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountExternalIdTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ExternalIdType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountExternalIdTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountExternalIdTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated AccountExternalIdType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setAccountExternalIdTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getAccountExternalIdTypeEnumeration(_locale);
      this.setAccountExternalIdType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("AccountExternalIdType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAccountExternalIdTypeFromDisplayValue");
  }

  /** get the value of the field: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return Integer the value
   */
  public Integer getAccountExternalIdType () {
    return this.AccountExternalIdType;
  }
  /** Change the field to not being actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   */
  public void unsetAccountExternalIdType () {
    this._AccountExternalIdTypeSet = false;
  }
  /** See if the field is actively set: AccountExternalIdType (CUSTOMER_ID_ACCT_MAP.external_id_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountExternalIdType () {
    return this._AccountExternalIdTypeSet;
  }
  /** set the fields value: AccountInternalId (BMF_UNAPPLIED.account_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccountInternalId") 
  public void setAccountInternalId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccountInternalId", "setAccountInternalId");
    }
    this.AccountInternalId = value;
    this._AccountInternalIdSet = true;
  }

  /** Retrieves the AccountInternalId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccountInternalId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccountInternalId field
   */
   public String getAccountInternalIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccountInternalIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccountInternalId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccountInternalIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccountInternalId field from a formatted string
   *
   * @param _value the AccountInternalId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccountInternalId field
   */
   public void setAccountInternalIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccountInternalIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccountInternalId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccountInternalId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccountInternalIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccountInternalIdFromFormattedString");
   }

  /** get the value of the field: AccountInternalId (BMF_UNAPPLIED.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (BMF_UNAPPLIED.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (BMF_UNAPPLIED.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AppliedStatus") 
  public void setAppliedStatus (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AppliedStatus", "setAppliedStatus");
    }
    this.AppliedStatus = value;
    this._AppliedStatusSet = true;
  }

  /** Retrieves the AppliedStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AppliedStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AppliedStatus field
   */
   public String getAppliedStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAppliedStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAppliedStatusAsFormattedString");
       return fmtMgr.formatBoolean(this.getAppliedStatus());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AppliedStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAppliedStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the AppliedStatus field from a formatted string
   *
   * @param _value the AppliedStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AppliedStatus field
   */
   public void setAppliedStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAppliedStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAppliedStatus(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AppliedStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAppliedStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAppliedStatusFromFormattedString");
   }

  /** get the value of the field: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * @return Boolean the value
   */
  public Boolean getAppliedStatus () {
    return this.AppliedStatus;
  }
  /** Change the field to not being actively set: AppliedStatus (BMF_UNAPPLIED.applied_status)
   */
  public void unsetAppliedStatus () {
    this._AppliedStatusSet = false;
  }
  /** See if the field is actively set: AppliedStatus (BMF_UNAPPLIED.applied_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetAppliedStatus () {
    return this._AppliedStatusSet;
  }
  /** set the fields value: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTrackingId") 
  public void setBmfTrackingId (Integer value) throws ServiceException
  {
    this.BmfTrackingId = value;
    this._BmfTrackingIdSet = true;
  }

  /** Retrieves the BmfTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingId field
   */
   public String getBmfTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingId field from a formatted string
   *
   * @param _value the BmfTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingId field
   */
   public void setBmfTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdFromFormattedString");
   }

  /** get the value of the field: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * @return Integer the value
   */
  public Integer getBmfTrackingId () {
    return this.BmfTrackingId;
  }
  /** Change the field to not being actively set: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   */
  public void unsetBmfTrackingId () {
    this._BmfTrackingIdSet = false;
  }
  /** See if the field is actively set: BmfTrackingId (BMF_UNAPPLIED.bmf_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingId () {
    return this._BmfTrackingIdSet;
  }
  /** set the fields value: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTrackingIdServ") 
  public void setBmfTrackingIdServ (Integer value) throws ServiceException
  {
    this.BmfTrackingIdServ = value;
    this._BmfTrackingIdServSet = true;
  }

  /** Retrieves the BmfTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTrackingIdServ field
   */
   public String getBmfTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTrackingIdServ field from a formatted string
   *
   * @param _value the BmfTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTrackingIdServ field
   */
   public void setBmfTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTrackingIdServFromFormattedString");
   }

  /** get the value of the field: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getBmfTrackingIdServ () {
    return this.BmfTrackingIdServ;
  }
  /** Change the field to not being actively set: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   */
  public void unsetBmfTrackingIdServ () {
    this._BmfTrackingIdServSet = false;
  }
  /** See if the field is actively set: BmfTrackingIdServ (BMF_UNAPPLIED.bmf_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingIdServ () {
    return this._BmfTrackingIdServSet;
  }
  /** set the fields value: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfErrorText") 
  public void setBmfErrorText (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 80))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BmfErrorText", "setBmfErrorText");
    }
    this.BmfErrorText = value;
    this._BmfErrorTextSet = true;
  }

  /** Retrieves the BmfErrorText field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfErrorText field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfErrorText field
   */
   public String getBmfErrorTextAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfErrorTextAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfErrorTextAsFormattedString");
       return fmtMgr.formatString(this.getBmfErrorText());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfErrorText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfErrorTextAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfErrorText field from a formatted string
   *
   * @param _value the BmfErrorText field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfErrorText field
   */
   public void setBmfErrorTextFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfErrorTextFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfErrorText(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfErrorText");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfErrorTextFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfErrorTextFromFormattedString");
   }

  /** get the value of the field: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @return String the value
   */
  public String getBmfErrorText () {
    return this.BmfErrorText;
  }
  /** Change the field to not being actively set: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   */
  public void unsetBmfErrorText () {
    this._BmfErrorTextSet = false;
  }
  /** See if the field is actively set: BmfErrorText (BMF_UNAPPLIED.bmf_error_text)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfErrorText () {
    return this._BmfErrorTextSet;
  }
  /** set the fields value: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefNo") 
  public void setOrigBillRefNo (Integer value) throws ServiceException
  {
    this.OrigBillRefNo = value;
    this._OrigBillRefNoSet = true;
  }

  /** Retrieves the OrigBillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefNo field
   */
   public String getOrigBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillRefNo field from a formatted string
   *
   * @param _value the OrigBillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillRefNo field
   */
   public void setOrigBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefNoFromFormattedString");
   }

  /** get the value of the field: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * @return Integer the value
   */
  public Integer getOrigBillRefNo () {
    return this.OrigBillRefNo;
  }
  /** Change the field to not being actively set: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   */
  public void unsetOrigBillRefNo () {
    this._OrigBillRefNoSet = false;
  }
  /** See if the field is actively set: OrigBillRefNo (BMF_UNAPPLIED.orig_bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefNo () {
    return this._OrigBillRefNoSet;
  }
  /** set the fields value: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigBillRefResets") 
  public void setOrigBillRefResets (Integer value) throws ServiceException
  {
    this.OrigBillRefResets = value;
    this._OrigBillRefResetsSet = true;
  }

  /** Retrieves the OrigBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigBillRefResets field
   */
   public String getOrigBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigBillRefResets field from a formatted string
   *
   * @param _value the OrigBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigBillRefResets field
   */
   public void setOrigBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigBillRefResetsFromFormattedString");
   }

  /** get the value of the field: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * @return Integer the value
   */
  public Integer getOrigBillRefResets () {
    return this.OrigBillRefResets;
  }
  /** Change the field to not being actively set: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   */
  public void unsetOrigBillRefResets () {
    this._OrigBillRefResetsSet = false;
  }
  /** See if the field is actively set: OrigBillRefResets (BMF_UNAPPLIED.orig_bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigBillRefResets () {
    return this._OrigBillRefResetsSet;
  }
  /** set the fields value: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CrNoteBillRefNo") 
  public void setCrNoteBillRefNo (Integer value) throws ServiceException
  {
    this.CrNoteBillRefNo = value;
    this._CrNoteBillRefNoSet = true;
  }

  /** Retrieves the CrNoteBillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CrNoteBillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CrNoteBillRefNo field
   */
   public String getCrNoteBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCrNoteBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCrNoteBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getCrNoteBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CrNoteBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCrNoteBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the CrNoteBillRefNo field from a formatted string
   *
   * @param _value the CrNoteBillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CrNoteBillRefNo field
   */
   public void setCrNoteBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCrNoteBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCrNoteBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CrNoteBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCrNoteBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCrNoteBillRefNoFromFormattedString");
   }

  /** get the value of the field: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * @return Integer the value
   */
  public Integer getCrNoteBillRefNo () {
    return this.CrNoteBillRefNo;
  }
  /** Change the field to not being actively set: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   */
  public void unsetCrNoteBillRefNo () {
    this._CrNoteBillRefNoSet = false;
  }
  /** See if the field is actively set: CrNoteBillRefNo (BMF_UNAPPLIED.cr_note_bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetCrNoteBillRefNo () {
    return this._CrNoteBillRefNoSet;
  }
  /** set the fields value: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CrNoteBillRefResets") 
  public void setCrNoteBillRefResets (Integer value) throws ServiceException
  {
    this.CrNoteBillRefResets = value;
    this._CrNoteBillRefResetsSet = true;
  }

  /** Retrieves the CrNoteBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CrNoteBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CrNoteBillRefResets field
   */
   public String getCrNoteBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCrNoteBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCrNoteBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getCrNoteBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CrNoteBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCrNoteBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the CrNoteBillRefResets field from a formatted string
   *
   * @param _value the CrNoteBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CrNoteBillRefResets field
   */
   public void setCrNoteBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCrNoteBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCrNoteBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CrNoteBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCrNoteBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCrNoteBillRefResetsFromFormattedString");
   }

  /** get the value of the field: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * @return Integer the value
   */
  public Integer getCrNoteBillRefResets () {
    return this.CrNoteBillRefResets;
  }
  /** Change the field to not being actively set: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   */
  public void unsetCrNoteBillRefResets () {
    this._CrNoteBillRefResetsSet = false;
  }
  /** See if the field is actively set: CrNoteBillRefResets (BMF_UNAPPLIED.cr_note_bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetCrNoteBillRefResets () {
    return this._CrNoteBillRefResetsSet;
  }
  /** set the fields value: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTransType") 
  public void setBmfTransType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "BmfTransType", "setBmfTransType");
    }
    this.BmfTransType = value;
    this._BmfTransTypeSet = true;
  }

  /** Retrieves the BmfTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BmfTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BmfTransType field
   */
   public String getBmfTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getBmfTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BmfTransType field from a formatted string
   *
   * @param _value the BmfTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BmfTransType field
   */
   public void setBmfTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBmfTransType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BmfTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBmfTransTypeFromFormattedString");
   }

  /** get the value of the field: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * @return Integer the value
   */
  public Integer getBmfTransType () {
    return this.BmfTransType;
  }
  /** Change the field to not being actively set: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   */
  public void unsetBmfTransType () {
    this._BmfTransTypeSet = false;
  }
  /** See if the field is actively set: BmfTransType (BMF_UNAPPLIED.bmf_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTransType () {
    return this._BmfTransTypeSet;
  }
  /** set the fields value: TransDate (BMF_UNAPPLIED.trans_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransDate") 
  public void setTransDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransDate", "setTransDate");
    }
    this.TransDate = value;
    this._TransDateSet = true;
  }

  /** Retrieves the TransDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
   public String getTransDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedString");
       return fmtMgr.formatDate(this.getTransDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransDate field from a formatted string
   *
   * @param _value the TransDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
   public void setTransDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransDateFromFormattedString");
   }

  /**
   * Retrieves the TransDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransDate field
   */
  public String getTransDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTransDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TransDate field value from a formatted date/time string
   *
   * @param _value the TransDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransDate field
   */
  public void setTransDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TransDate (BMF_UNAPPLIED.trans_date)
   * @return Date the value
   */
  public Date getTransDate () {
    return this.TransDate;
  }
  /** Change the field to not being actively set: TransDate (BMF_UNAPPLIED.trans_date)
   */
  public void unsetTransDate () {
    this._TransDateSet = false;
  }
  /** See if the field is actively set: TransDate (BMF_UNAPPLIED.trans_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransDate () {
    return this._TransDateSet;
  }
  /** set the fields value: PostDate (BMF_UNAPPLIED.post_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PostDate") 
  public void setPostDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "PostDate", "setPostDate");
    }
    this.PostDate = value;
    this._PostDateSet = true;
  }

  /** Retrieves the PostDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PostDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostDate field
   */
   public String getPostDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostDateAsFormattedString");
       return fmtMgr.formatDate(this.getPostDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PostDate field from a formatted string
   *
   * @param _value the PostDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostDate field
   */
   public void setPostDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPostDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PostDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPostDateFromFormattedString");
   }

  /**
   * Retrieves the PostDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PostDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PostDate field
   */
  public String getPostDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPostDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPostDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPostDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPostDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PostDate field value from a formatted date/time string
   *
   * @param _value the PostDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PostDate field
   */
  public void setPostDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPostDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPostDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PostDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPostDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PostDate (BMF_UNAPPLIED.post_date)
   * @return Date the value
   */
  public Date getPostDate () {
    return this.PostDate;
  }
  /** Change the field to not being actively set: PostDate (BMF_UNAPPLIED.post_date)
   */
  public void unsetPostDate () {
    this._PostDateSet = false;
  }
  /** See if the field is actively set: PostDate (BMF_UNAPPLIED.post_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPostDate () {
    return this._PostDateSet;
  }
  /** set the fields value: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CurrencyCode") 
  public void setCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "CurrencyCode", "setCurrencyCode");
    }
    this.CurrencyCode = value;
    this._CurrencyCodeSet = true;
  }

  /** Retrieves the CurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CurrencyCode field
   */
   public String getCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CurrencyCode field from a formatted string
   *
   * @param _value the CurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CurrencyCode field
   */
   public void setCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (BMF_UNAPPLIED.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (BMF_UNAPPLIED.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: TransAmount (BMF_UNAPPLIED.trans_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransAmount") 
  public void setTransAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransAmount", "setTransAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TransAmount", "setTransAmount");
    }
    this.TransAmount = value;
    this._TransAmountSet = true;
  }

  /** Retrieves the TransAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransAmount field
   */
   public String getTransAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getTransAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransAmount field from a formatted string
   *
   * @param _value the TransAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransAmount field
   */
   public void setTransAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransAmountFromFormattedString");
   }

  /**
   * Retrieves the TransAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TransAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransAmount field
   */
  public String getTransAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getTransAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the TransAmount field value from a formatted currency string
   *
   * @param _value the TransAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransAmount field
   */
  public void setTransAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTransAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTransAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TransAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: TransAmount (BMF_UNAPPLIED.trans_amount)
   * @return BigInteger the value
   */
  public BigInteger getTransAmount () {
    return this.TransAmount;
  }
  /** Change the field to not being actively set: TransAmount (BMF_UNAPPLIED.trans_amount)
   */
  public void unsetTransAmount () {
    this._TransAmountSet = false;
  }
  /** See if the field is actively set: TransAmount (BMF_UNAPPLIED.trans_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransAmount () {
    return this._TransAmountSet;
  }
  /** set the fields value: GlAmount (BMF_UNAPPLIED.gl_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("GlAmount") 
  public void setGlAmount (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "GlAmount", "setGlAmount");
    }
    this.GlAmount = value;
    this._GlAmountSet = true;
  }

  /** Retrieves the GlAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The GlAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmount field
   */
   public String getGlAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getGlAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GlAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the GlAmount field from a formatted string
   *
   * @param _value the GlAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GlAmount field
   */
   public void setGlAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setGlAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("GlAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFromFormattedString");
   }

  /**
   * Retrieves the GlAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The GlAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the GlAmount field
   */
  public String getGlAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getGlAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getGlAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getGlAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getGlAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the GlAmount field value from a formatted currency string
   *
   * @param _value the GlAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the GlAmount field
   */
  public void setGlAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setGlAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setGlAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("GlAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setGlAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setGlAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: GlAmount (BMF_UNAPPLIED.gl_amount)
   * @return BigInteger the value
   */
  public BigInteger getGlAmount () {
    return this.GlAmount;
  }
  /** Change the field to not being actively set: GlAmount (BMF_UNAPPLIED.gl_amount)
   */
  public void unsetGlAmount () {
    this._GlAmountSet = false;
  }
  /** See if the field is actively set: GlAmount (BMF_UNAPPLIED.gl_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetGlAmount () {
    return this._GlAmountSet;
  }
  /** set the fields value: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigTrackingId") 
  public void setOrigTrackingId (Integer value) throws ServiceException
  {
    this.OrigTrackingId = value;
    this._OrigTrackingIdSet = true;
  }

  /** Retrieves the OrigTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingId field
   */
   public String getOrigTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigTrackingId field from a formatted string
   *
   * @param _value the OrigTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTrackingId field
   */
   public void setOrigTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdFromFormattedString");
   }

  /** get the value of the field: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * @return Integer the value
   */
  public Integer getOrigTrackingId () {
    return this.OrigTrackingId;
  }
  /** Change the field to not being actively set: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   */
  public void unsetOrigTrackingId () {
    this._OrigTrackingIdSet = false;
  }
  /** See if the field is actively set: OrigTrackingId (BMF_UNAPPLIED.orig_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTrackingId () {
    return this._OrigTrackingIdSet;
  }
  /** set the fields value: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigTrackingIdServ") 
  public void setOrigTrackingIdServ (Integer value) throws ServiceException
  {
    this.OrigTrackingIdServ = value;
    this._OrigTrackingIdServSet = true;
  }

  /** Retrieves the OrigTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigTrackingIdServ field
   */
   public String getOrigTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getOrigTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigTrackingIdServ field from a formatted string
   *
   * @param _value the OrigTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigTrackingIdServ field
   */
   public void setOrigTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigTrackingIdServFromFormattedString");
   }

  /** get the value of the field: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getOrigTrackingIdServ () {
    return this.OrigTrackingIdServ;
  }
  /** Change the field to not being actively set: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   */
  public void unsetOrigTrackingIdServ () {
    this._OrigTrackingIdServSet = false;
  }
  /** See if the field is actively set: OrigTrackingIdServ (BMF_UNAPPLIED.orig_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTrackingIdServ () {
    return this._OrigTrackingIdServSet;
  }
  /** set the fields value: TransSource (BMF_UNAPPLIED.trans_source)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransSource") 
  public void setTransSource (Integer value) throws ServiceException
  {
    this.TransSource = value;
    this._TransSourceSet = true;
  }

  /** Retrieves the TransSource field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransSource field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSource field
   */
   public String getTransSourceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceAsFormattedString");
       return fmtMgr.formatNumber(this.getTransSource(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSource");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSourceAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransSource field from a formatted string
   *
   * @param _value the TransSource field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransSource field
   */
   public void setTransSourceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransSource(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSource");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSourceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSourceFromFormattedString");
   }

  /** get the value of the field: TransSource (BMF_UNAPPLIED.trans_source)
   * @return Integer the value
   */
  public Integer getTransSource () {
    return this.TransSource;
  }
  /** Change the field to not being actively set: TransSource (BMF_UNAPPLIED.trans_source)
   */
  public void unsetTransSource () {
    this._TransSourceSet = false;
  }
  /** See if the field is actively set: TransSource (BMF_UNAPPLIED.trans_source)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransSource () {
    return this._TransSourceSet;
  }
  /** set the fields value: SourceType (BMF_UNAPPLIED.source_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceType") 
  public void setSourceType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceType", "setSourceType");
    }
    this.SourceType = value;
    this._SourceTypeSet = true;
  }

  /** Retrieves the SourceType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceType field
   */
   public String getSourceTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getSourceType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceType field from a formatted string
   *
   * @param _value the SourceType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceType field
   */
   public void setSourceTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceTypeFromFormattedString");
   }

  /** get the value of the field: SourceType (BMF_UNAPPLIED.source_type)
   * @return Integer the value
   */
  public Integer getSourceType () {
    return this.SourceType;
  }
  /** Change the field to not being actively set: SourceType (BMF_UNAPPLIED.source_type)
   */
  public void unsetSourceType () {
    this._SourceTypeSet = false;
  }
  /** See if the field is actively set: SourceType (BMF_UNAPPLIED.source_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceType () {
    return this._SourceTypeSet;
  }
  /** set the fields value: SourceId (BMF_UNAPPLIED.source_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceId") 
  public void setSourceId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceId", "setSourceId");
    }
    this.SourceId = value;
    this._SourceIdSet = true;
  }

  /** Retrieves the SourceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceId field
   */
   public String getSourceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSourceId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceId field from a formatted string
   *
   * @param _value the SourceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceId field
   */
   public void setSourceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFromFormattedString");
   }

  /** get the value of the field: SourceId (BMF_UNAPPLIED.source_id)
   * @return Integer the value
   */
  public Integer getSourceId () {
    return this.SourceId;
  }
  /** Change the field to not being actively set: SourceId (BMF_UNAPPLIED.source_id)
   */
  public void unsetSourceId () {
    this._SourceIdSet = false;
  }
  /** See if the field is actively set: SourceId (BMF_UNAPPLIED.source_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceId () {
    return this._SourceIdSet;
  }
  /** set the fields value: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceIdServ") 
  public void setSourceIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceIdServ", "setSourceIdServ");
    }
    this.SourceIdServ = value;
    this._SourceIdServSet = true;
  }

  /** Retrieves the SourceIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceIdServ field
   */
   public String getSourceIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getSourceIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceIdServ field from a formatted string
   *
   * @param _value the SourceIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceIdServ field
   */
   public void setSourceIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdServFromFormattedString");
   }

  /** get the value of the field: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * @return Integer the value
   */
  public Integer getSourceIdServ () {
    return this.SourceIdServ;
  }
  /** Change the field to not being actively set: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   */
  public void unsetSourceIdServ () {
    this._SourceIdServSet = false;
  }
  /** See if the field is actively set: SourceIdServ (BMF_UNAPPLIED.source_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceIdServ () {
    return this._SourceIdServSet;
  }
  /** set the fields value: BatchId (BMF_UNAPPLIED.batch_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BatchId") 
  public void setBatchId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BatchId", "setBatchId");
    }
    this.BatchId = value;
    this._BatchIdSet = true;
  }

  /** Retrieves the BatchId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BatchId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BatchId field
   */
   public String getBatchIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBatchIdAsFormattedString");
       return fmtMgr.formatString(this.getBatchId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BatchId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBatchIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the BatchId field from a formatted string
   *
   * @param _value the BatchId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BatchId field
   */
   public void setBatchIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBatchId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BatchId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBatchIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBatchIdFromFormattedString");
   }

  /** get the value of the field: BatchId (BMF_UNAPPLIED.batch_id)
   * @return String the value
   */
  public String getBatchId () {
    return this.BatchId;
  }
  /** Change the field to not being actively set: BatchId (BMF_UNAPPLIED.batch_id)
   */
  public void unsetBatchId () {
    this._BatchIdSet = false;
  }
  /** See if the field is actively set: BatchId (BMF_UNAPPLIED.batch_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBatchId () {
    return this._BatchIdSet;
  }
  /** set the fields value: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BatchIdServ") 
  public void setBatchIdServ (Integer value) throws ServiceException
  {
    this.BatchIdServ = value;
    this._BatchIdServSet = true;
  }

  /** Retrieves the BatchIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BatchIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BatchIdServ field
   */
   public String getBatchIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBatchIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getBatchIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BatchIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBatchIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the BatchIdServ field from a formatted string
   *
   * @param _value the BatchIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BatchIdServ field
   */
   public void setBatchIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBatchIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBatchIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BatchIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBatchIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBatchIdServFromFormattedString");
   }

  /** get the value of the field: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * @return Integer the value
   */
  public Integer getBatchIdServ () {
    return this.BatchIdServ;
  }
  /** Change the field to not being actively set: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   */
  public void unsetBatchIdServ () {
    this._BatchIdServSet = false;
  }
  /** See if the field is actively set: BatchIdServ (BMF_UNAPPLIED.batch_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetBatchIdServ () {
    return this._BatchIdServSet;
  }
  /** set the fields value: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransSubmitter") 
  public void setTransSubmitter (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransSubmitter", "setTransSubmitter");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "TransSubmitter", "setTransSubmitter");
    }
    this.TransSubmitter = value;
    this._TransSubmitterSet = true;
  }

  /** Retrieves the TransSubmitter field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransSubmitter field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSubmitter field
   */
   public String getTransSubmitterAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSubmitterAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSubmitterAsFormattedString");
       return fmtMgr.formatString(this.getTransSubmitter());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSubmitter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSubmitterAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransSubmitter field from a formatted string
   *
   * @param _value the TransSubmitter field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransSubmitter field
   */
   public void setTransSubmitterFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSubmitterFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransSubmitter(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSubmitter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSubmitterFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSubmitterFromFormattedString");
   }

  /** get the value of the field: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @return String the value
   */
  public String getTransSubmitter () {
    return this.TransSubmitter;
  }
  /** Change the field to not being actively set: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   */
  public void unsetTransSubmitter () {
    this._TransSubmitterSet = false;
  }
  /** See if the field is actively set: TransSubmitter (BMF_UNAPPLIED.trans_submitter)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransSubmitter () {
    return this._TransSubmitterSet;
  }
  /** set the fields value: ChgDate (BMF_UNAPPLIED.chg_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ChgDate") 
  public void setChgDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ChgDate", "setChgDate");
    }
    this.ChgDate = value;
    this._ChgDateSet = true;
  }

  /** Retrieves the ChgDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ChgDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
   public String getChgDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedString");
       return fmtMgr.formatDate(this.getChgDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ChgDate field from a formatted string
   *
   * @param _value the ChgDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
   public void setChgDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setChgDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ChgDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setChgDateFromFormattedString");
   }

  /**
   * Retrieves the ChgDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ChgDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ChgDate field
   */
  public String getChgDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getChgDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getChgDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getChgDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getChgDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ChgDate field value from a formatted date/time string
   *
   * @param _value the ChgDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ChgDate field
   */
  public void setChgDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setChgDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setChgDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ChgDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setChgDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ChgDate (BMF_UNAPPLIED.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (BMF_UNAPPLIED.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (BMF_UNAPPLIED.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: ActionCode (BMF_UNAPPLIED.action_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActionCode") 
  public void setActionCode (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActionCode", "setActionCode");
    }
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ActionCode", "setActionCode");
    }
    this.ActionCode = value;
    this._ActionCodeSet = true;
  }

  /** Retrieves the ActionCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActionCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActionCode field
   */
   public String getActionCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActionCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActionCodeAsFormattedString");
       return fmtMgr.formatString(this.getActionCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActionCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActionCode field from a formatted string
   *
   * @param _value the ActionCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActionCode field
   */
   public void setActionCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActionCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActionCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActionCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActionCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActionCodeFromFormattedString");
   }

  /** get the value of the field: ActionCode (BMF_UNAPPLIED.action_code)
   * @return String the value
   */
  public String getActionCode () {
    return this.ActionCode;
  }
  /** Change the field to not being actively set: ActionCode (BMF_UNAPPLIED.action_code)
   */
  public void unsetActionCode () {
    this._ActionCodeSet = false;
  }
  /** See if the field is actively set: ActionCode (BMF_UNAPPLIED.action_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetActionCode () {
    return this._ActionCodeSet;
  }
  /** set the fields value: ProfileId (BMF_UNAPPLIED.profile_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProfileId") 
  public void setProfileId (BigInteger value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ProfileId", "setProfileId");
    }
    this.ProfileId = value;
    this._ProfileIdSet = true;
  }

  /** Retrieves the ProfileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProfileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProfileId field
   */
   public String getProfileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProfileIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getProfileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProfileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProfileId field from a formatted string
   *
   * @param _value the ProfileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProfileId field
   */
   public void setProfileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProfileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProfileId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProfileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProfileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProfileIdFromFormattedString");
   }

  /** get the value of the field: ProfileId (BMF_UNAPPLIED.profile_id)
   * @return BigInteger the value
   */
  public BigInteger getProfileId () {
    return this.ProfileId;
  }
  /** Change the field to not being actively set: ProfileId (BMF_UNAPPLIED.profile_id)
   */
  public void unsetProfileId () {
    this._ProfileIdSet = false;
  }
  /** See if the field is actively set: ProfileId (BMF_UNAPPLIED.profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileId () {
    return this._ProfileIdSet;
  }
  /** set the fields value: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MicrBankId") 
  public void setMicrBankId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MicrBankId", "setMicrBankId");
    }
    this.MicrBankId = value;
    this._MicrBankIdSet = true;
  }

  /** Retrieves the MicrBankId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MicrBankId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrBankId field
   */
   public String getMicrBankIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrBankIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrBankIdAsFormattedString");
       return fmtMgr.formatString(this.getMicrBankId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrBankId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrBankIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MicrBankId field from a formatted string
   *
   * @param _value the MicrBankId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MicrBankId field
   */
   public void setMicrBankIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrBankIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMicrBankId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrBankId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrBankIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrBankIdFromFormattedString");
   }

  /** get the value of the field: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @return String the value
   */
  public String getMicrBankId () {
    return this.MicrBankId;
  }
  /** Change the field to not being actively set: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   */
  public void unsetMicrBankId () {
    this._MicrBankIdSet = false;
  }
  /** See if the field is actively set: MicrBankId (BMF_UNAPPLIED.micr_bank_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMicrBankId () {
    return this._MicrBankIdSet;
  }
  /** set the fields value: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MicrDdaNum") 
  public void setMicrDdaNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 20))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MicrDdaNum", "setMicrDdaNum");
    }
    this.MicrDdaNum = value;
    this._MicrDdaNumSet = true;
  }

  /** Retrieves the MicrDdaNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MicrDdaNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrDdaNum field
   */
   public String getMicrDdaNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrDdaNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrDdaNumAsFormattedString");
       return fmtMgr.formatString(this.getMicrDdaNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrDdaNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrDdaNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the MicrDdaNum field from a formatted string
   *
   * @param _value the MicrDdaNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MicrDdaNum field
   */
   public void setMicrDdaNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrDdaNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMicrDdaNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrDdaNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrDdaNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrDdaNumFromFormattedString");
   }

  /** get the value of the field: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @return String the value
   */
  public String getMicrDdaNum () {
    return this.MicrDdaNum;
  }
  /** Change the field to not being actively set: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   */
  public void unsetMicrDdaNum () {
    this._MicrDdaNumSet = false;
  }
  /** See if the field is actively set: MicrDdaNum (BMF_UNAPPLIED.micr_dda_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetMicrDdaNum () {
    return this._MicrDdaNumSet;
  }
  /** set the fields value: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MicrCheckNum") 
  public void setMicrCheckNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MicrCheckNum", "setMicrCheckNum");
    }
    this.MicrCheckNum = value;
    this._MicrCheckNumSet = true;
  }

  /** Retrieves the MicrCheckNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MicrCheckNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MicrCheckNum field
   */
   public String getMicrCheckNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrCheckNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMicrCheckNumAsFormattedString");
       return fmtMgr.formatString(this.getMicrCheckNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrCheckNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMicrCheckNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the MicrCheckNum field from a formatted string
   *
   * @param _value the MicrCheckNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MicrCheckNum field
   */
   public void setMicrCheckNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMicrCheckNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMicrCheckNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MicrCheckNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMicrCheckNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMicrCheckNumFromFormattedString");
   }

  /** get the value of the field: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @return String the value
   */
  public String getMicrCheckNum () {
    return this.MicrCheckNum;
  }
  /** Change the field to not being actively set: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   */
  public void unsetMicrCheckNum () {
    this._MicrCheckNumSet = false;
  }
  /** See if the field is actively set: MicrCheckNum (BMF_UNAPPLIED.micr_check_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetMicrCheckNum () {
    return this._MicrCheckNumSet;
  }
  /** set the fields value: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ArchFlag") 
  public void setArchFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ArchFlag", "setArchFlag");
    }
    this.ArchFlag = value;
    this._ArchFlagSet = true;
  }

  /** Retrieves the ArchFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ArchFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ArchFlag field
   */
   public String getArchFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getArchFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getArchFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getArchFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the ArchFlag field from a formatted string
   *
   * @param _value the ArchFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ArchFlag field
   */
   public void setArchFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getArchFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setArchFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ArchFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setArchFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setArchFlagFromFormattedString");
   }

  /** get the value of the field: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * @return Boolean the value
   */
  public Boolean getArchFlag () {
    return this.ArchFlag;
  }
  /** Change the field to not being actively set: ArchFlag (BMF_UNAPPLIED.arch_flag)
   */
  public void unsetArchFlag () {
    this._ArchFlagSet = false;
  }
  /** See if the field is actively set: ArchFlag (BMF_UNAPPLIED.arch_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetArchFlag () {
    return this._ArchFlagSet;
  }
  /** set the fields value: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ManualCcauthCode") 
  public void setManualCcauthCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 6))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ManualCcauthCode", "setManualCcauthCode");
    }
    this.ManualCcauthCode = value;
    this._ManualCcauthCodeSet = true;
  }

  /** Retrieves the ManualCcauthCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ManualCcauthCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthCode field
   */
   public String getManualCcauthCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthCodeAsFormattedString");
       return fmtMgr.formatString(this.getManualCcauthCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ManualCcauthCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ManualCcauthCode field from a formatted string
   *
   * @param _value the ManualCcauthCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ManualCcauthCode field
   */
   public void setManualCcauthCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setManualCcauthCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ManualCcauthCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthCodeFromFormattedString");
   }

  /** get the value of the field: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @return String the value
   */
  public String getManualCcauthCode () {
    return this.ManualCcauthCode;
  }
  /** Change the field to not being actively set: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   */
  public void unsetManualCcauthCode () {
    this._ManualCcauthCodeSet = false;
  }
  /** See if the field is actively set: ManualCcauthCode (BMF_UNAPPLIED.manual_ccauth_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetManualCcauthCode () {
    return this._ManualCcauthCodeSet;
  }
  /** set the fields value: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ManualCcauthDate") 
  public void setManualCcauthDate (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ManualCcauthDate", "setManualCcauthDate");
    }
    this.ManualCcauthDate = value;
    this._ManualCcauthDateSet = true;
  }

  /** Retrieves the ManualCcauthDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ManualCcauthDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ManualCcauthDate field
   */
   public String getManualCcauthDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getManualCcauthDateAsFormattedString");
       return fmtMgr.formatString(this.getManualCcauthDate());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ManualCcauthDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getManualCcauthDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ManualCcauthDate field from a formatted string
   *
   * @param _value the ManualCcauthDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ManualCcauthDate field
   */
   public void setManualCcauthDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getManualCcauthDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setManualCcauthDate(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ManualCcauthDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setManualCcauthDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setManualCcauthDateFromFormattedString");
   }

  /** get the value of the field: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @return String the value
   */
  public String getManualCcauthDate () {
    return this.ManualCcauthDate;
  }
  /** Change the field to not being actively set: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   */
  public void unsetManualCcauthDate () {
    this._ManualCcauthDateSet = false;
  }
  /** See if the field is actively set: ManualCcauthDate (BMF_UNAPPLIED.manual_ccauth_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetManualCcauthDate () {
    return this._ManualCcauthDateSet;
  }
  /** set the fields value: FileId (BMF_UNAPPLIED.file_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FileId") 
  public void setFileId (Integer value) throws ServiceException
  {
    this.FileId = value;
    this._FileIdSet = true;
  }

  /** Retrieves the FileId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FileId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FileId field
   */
   public String getFileIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFileIdAsFormattedString");
       return fmtMgr.formatNumber(this.getFileId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFileIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FileId field from a formatted string
   *
   * @param _value the FileId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FileId field
   */
   public void setFileIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFileIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFileId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FileId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFileIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFileIdFromFormattedString");
   }

  /** get the value of the field: FileId (BMF_UNAPPLIED.file_id)
   * @return Integer the value
   */
  public Integer getFileId () {
    return this.FileId;
  }
  /** Change the field to not being actively set: FileId (BMF_UNAPPLIED.file_id)
   */
  public void unsetFileId () {
    this._FileIdSet = false;
  }
  /** See if the field is actively set: FileId (BMF_UNAPPLIED.file_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFileId () {
    return this._FileIdSet;
  }
  /** set the fields value: ResponseCode (BMF_UNAPPLIED.response_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ResponseCode") 
  public void setResponseCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ResponseCode", "setResponseCode");
    }
    this.ResponseCode = value;
    this._ResponseCodeSet = true;
  }

  /** Retrieves the ResponseCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ResponseCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ResponseCode field
   */
   public String getResponseCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResponseCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getResponseCodeAsFormattedString");
       return fmtMgr.formatString(this.getResponseCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResponseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getResponseCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ResponseCode field from a formatted string
   *
   * @param _value the ResponseCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ResponseCode field
   */
   public void setResponseCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getResponseCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setResponseCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ResponseCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setResponseCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setResponseCodeFromFormattedString");
   }

  /** get the value of the field: ResponseCode (BMF_UNAPPLIED.response_code)
   * @return String the value
   */
  public String getResponseCode () {
    return this.ResponseCode;
  }
  /** Change the field to not being actively set: ResponseCode (BMF_UNAPPLIED.response_code)
   */
  public void unsetResponseCode () {
    this._ResponseCodeSet = false;
  }
  /** See if the field is actively set: ResponseCode (BMF_UNAPPLIED.response_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetResponseCode () {
    return this._ResponseCodeSet;
  }
  /** set the fields value: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillOrderNumber") 
  public void setBillOrderNumber (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 25))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BillOrderNumber", "setBillOrderNumber");
    }
    this.BillOrderNumber = value;
    this._BillOrderNumberSet = true;
  }

  /** Retrieves the BillOrderNumber field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillOrderNumber field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillOrderNumber field
   */
   public String getBillOrderNumberAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillOrderNumberAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillOrderNumberAsFormattedString");
       return fmtMgr.formatString(this.getBillOrderNumber());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillOrderNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillOrderNumberAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillOrderNumber field from a formatted string
   *
   * @param _value the BillOrderNumber field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillOrderNumber field
   */
   public void setBillOrderNumberFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillOrderNumberFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillOrderNumber(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillOrderNumber");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillOrderNumberFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillOrderNumberFromFormattedString");
   }

  /** get the value of the field: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @return String the value
   */
  public String getBillOrderNumber () {
    return this.BillOrderNumber;
  }
  /** Change the field to not being actively set: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   */
  public void unsetBillOrderNumber () {
    this._BillOrderNumberSet = false;
  }
  /** See if the field is actively set: BillOrderNumber (BMF_UNAPPLIED.bill_order_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillOrderNumber () {
    return this._BillOrderNumberSet;
  }
  /** set the fields value: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalAmount") 
  public void setExternalAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExternalAmount", "setExternalAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExternalAmount", "setExternalAmount");
    }
    this.ExternalAmount = value;
    this._ExternalAmountSet = true;
  }

  /** Retrieves the ExternalAmount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalAmount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalAmount field
   */
   public String getExternalAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getExternalAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalAmount field from a formatted string
   *
   * @param _value the ExternalAmount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalAmount field
   */
   public void setExternalAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalAmount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalAmountFromFormattedString");
   }

  /**
   * Retrieves the ExternalAmount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ExternalAmount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalAmount field
   */
  public String getExternalAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getExternalAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the ExternalAmount field value from a formatted currency string
   *
   * @param _value the ExternalAmount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalAmount field
   */
  public void setExternalAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setExternalAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setExternalAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ExternalAmount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * @return BigInteger the value
   */
  public BigInteger getExternalAmount () {
    return this.ExternalAmount;
  }
  /** Change the field to not being actively set: ExternalAmount (BMF_UNAPPLIED.external_amount)
   */
  public void unsetExternalAmount () {
    this._ExternalAmountSet = false;
  }
  /** See if the field is actively set: ExternalAmount (BMF_UNAPPLIED.external_amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalAmount () {
    return this._ExternalAmountSet;
  }
  /** set the fields value: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExternalCurrency") 
  public void setExternalCurrency (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExternalCurrency", "setExternalCurrency");
    }
    this.ExternalCurrency = value;
    this._ExternalCurrencySet = true;
  }

  /** Retrieves the ExternalCurrency field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExternalCurrency field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExternalCurrency field
   */
   public String getExternalCurrencyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalCurrencyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExternalCurrencyAsFormattedString");
       return fmtMgr.formatNumber(this.getExternalCurrency(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalCurrency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExternalCurrencyAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExternalCurrency field from a formatted string
   *
   * @param _value the ExternalCurrency field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExternalCurrency field
   */
   public void setExternalCurrencyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExternalCurrencyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExternalCurrency(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExternalCurrency");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExternalCurrencyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExternalCurrencyFromFormattedString");
   }

  /** get the value of the field: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * @return Integer the value
   */
  public Integer getExternalCurrency () {
    return this.ExternalCurrency;
  }
  /** Change the field to not being actively set: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   */
  public void unsetExternalCurrency () {
    this._ExternalCurrencySet = false;
  }
  /** See if the field is actively set: ExternalCurrency (BMF_UNAPPLIED.external_currency)
   * @return boolean whether the field is actively set
   */
  public boolean issetExternalCurrency () {
    return this._ExternalCurrencySet;
  }
  /** set the fields value: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
    this.OpenItemId = value;
    this._OpenItemIdSet = true;
  }

  /** Retrieves the OpenItemId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OpenItemId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OpenItemId field
   */
   public String getOpenItemIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOpenItemIdAsFormattedString");
       return fmtMgr.formatNumber(this.getOpenItemId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOpenItemIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the OpenItemId field from a formatted string
   *
   * @param _value the OpenItemId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OpenItemId field
   */
   public void setOpenItemIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOpenItemIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOpenItemId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OpenItemId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOpenItemIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOpenItemIdFromFormattedString");
   }

  /** get the value of the field: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (BMF_UNAPPLIED.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (BMF_UNAPPLIED.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: Annotation (BMF_UNAPPLIED.annotation)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Annotation") 
  public void setAnnotation (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 255))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Annotation", "setAnnotation");
    }
    this.Annotation = value;
    this._AnnotationSet = true;
  }

  /** Retrieves the Annotation field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Annotation field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Annotation field
   */
   public String getAnnotationAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAnnotationAsFormattedString");
       return fmtMgr.formatString(this.getAnnotation());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAnnotationAsFormattedString");
       throw x;
     }
   }
  /** Sets the Annotation field from a formatted string
   *
   * @param _value the Annotation field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Annotation field
   */
   public void setAnnotationFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAnnotationFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAnnotation(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Annotation");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAnnotationFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAnnotationFromFormattedString");
   }

  /** get the value of the field: Annotation (BMF_UNAPPLIED.annotation)
   * @return String the value
   */
  public String getAnnotation () {
    return this.Annotation;
  }
  /** Change the field to not being actively set: Annotation (BMF_UNAPPLIED.annotation)
   */
  public void unsetAnnotation () {
    this._AnnotationSet = false;
  }
  /** See if the field is actively set: Annotation (BMF_UNAPPLIED.annotation)
   * @return boolean whether the field is actively set
   */
  public boolean issetAnnotation () {
    return this._AnnotationSet;
  }
  public String toString() {
    return UnappliedPaymentObjectHelper.toMap(this, null).toString();
  }
  public Map toMap() {
    return ObjectHelper.objectToMap(this);
  }
  public void loadDefaults(String action) {
    if (action != null) DefaultManager.getInstance().setObjectDefaults(this, action);
  }
  public void checkConstraints(String action) throws ConstraintException {
    if (action != null) ConstraintManager.getInstance().checkConstraints(this, action);
  }
  /*
   * This method set all of the *Set flags to the specified value
   * @param flag value to set for flags
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set for flags
   * @param nonNullOnly set only those flags where the value is not null. 
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
    /** the object's key data */
    if (Key != null) Key.resetFlags(flag, nonNullOnly);
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** BMF_UNAPPLIED.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** BMF_UNAPPLIED.applied_status field */
    if(!nonNullOnly || (AppliedStatus != null))  _AppliedStatusSet = flag;
  /** BMF_UNAPPLIED.bmf_tracking_id field */
    if(!nonNullOnly || (BmfTrackingId != null))  _BmfTrackingIdSet = flag;
  /** BMF_UNAPPLIED.bmf_tracking_id_serv field */
    if(!nonNullOnly || (BmfTrackingIdServ != null))  _BmfTrackingIdServSet = flag;
  /** BMF_UNAPPLIED.bmf_error_text field */
    if(!nonNullOnly || (BmfErrorText != null))  _BmfErrorTextSet = flag;
  /** BMF_UNAPPLIED.orig_bill_ref_no field */
    if(!nonNullOnly || (OrigBillRefNo != null))  _OrigBillRefNoSet = flag;
  /** BMF_UNAPPLIED.orig_bill_ref_resets field */
    if(!nonNullOnly || (OrigBillRefResets != null))  _OrigBillRefResetsSet = flag;
  /** BMF_UNAPPLIED.cr_note_bill_ref_no field */
    if(!nonNullOnly || (CrNoteBillRefNo != null))  _CrNoteBillRefNoSet = flag;
  /** BMF_UNAPPLIED.cr_note_bill_ref_resets field */
    if(!nonNullOnly || (CrNoteBillRefResets != null))  _CrNoteBillRefResetsSet = flag;
  /** BMF_UNAPPLIED.bmf_trans_type field */
    if(!nonNullOnly || (BmfTransType != null))  _BmfTransTypeSet = flag;
  /** BMF_UNAPPLIED.trans_date field */
    if(!nonNullOnly || (TransDate != null))  _TransDateSet = flag;
  /** BMF_UNAPPLIED.post_date field */
    if(!nonNullOnly || (PostDate != null))  _PostDateSet = flag;
  /** BMF_UNAPPLIED.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** BMF_UNAPPLIED.trans_amount field */
    if(!nonNullOnly || (TransAmount != null))  _TransAmountSet = flag;
  /** BMF_UNAPPLIED.gl_amount field */
    if(!nonNullOnly || (GlAmount != null))  _GlAmountSet = flag;
  /** BMF_UNAPPLIED.orig_tracking_id field */
    if(!nonNullOnly || (OrigTrackingId != null))  _OrigTrackingIdSet = flag;
  /** BMF_UNAPPLIED.orig_tracking_id_serv field */
    if(!nonNullOnly || (OrigTrackingIdServ != null))  _OrigTrackingIdServSet = flag;
  /** BMF_UNAPPLIED.trans_source field */
    if(!nonNullOnly || (TransSource != null))  _TransSourceSet = flag;
  /** BMF_UNAPPLIED.source_type field */
    if(!nonNullOnly || (SourceType != null))  _SourceTypeSet = flag;
  /** BMF_UNAPPLIED.source_id field */
    if(!nonNullOnly || (SourceId != null))  _SourceIdSet = flag;
  /** BMF_UNAPPLIED.source_id_serv field */
    if(!nonNullOnly || (SourceIdServ != null))  _SourceIdServSet = flag;
  /** BMF_UNAPPLIED.batch_id field */
    if(!nonNullOnly || (BatchId != null))  _BatchIdSet = flag;
  /** BMF_UNAPPLIED.batch_id_serv field */
    if(!nonNullOnly || (BatchIdServ != null))  _BatchIdServSet = flag;
  /** BMF_UNAPPLIED.trans_submitter field */
    if(!nonNullOnly || (TransSubmitter != null))  _TransSubmitterSet = flag;
  /** BMF_UNAPPLIED.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** BMF_UNAPPLIED.action_code field */
    if(!nonNullOnly || (ActionCode != null))  _ActionCodeSet = flag;
  /** BMF_UNAPPLIED.profile_id field */
    if(!nonNullOnly || (ProfileId != null))  _ProfileIdSet = flag;
  /** BMF_UNAPPLIED.micr_bank_id field */
    if(!nonNullOnly || (MicrBankId != null))  _MicrBankIdSet = flag;
  /** BMF_UNAPPLIED.micr_dda_num field */
    if(!nonNullOnly || (MicrDdaNum != null))  _MicrDdaNumSet = flag;
  /** BMF_UNAPPLIED.micr_check_num field */
    if(!nonNullOnly || (MicrCheckNum != null))  _MicrCheckNumSet = flag;
  /** BMF_UNAPPLIED.arch_flag field */
    if(!nonNullOnly || (ArchFlag != null))  _ArchFlagSet = flag;
  /** BMF_UNAPPLIED.manual_ccauth_code field */
    if(!nonNullOnly || (ManualCcauthCode != null))  _ManualCcauthCodeSet = flag;
  /** BMF_UNAPPLIED.manual_ccauth_date field */
    if(!nonNullOnly || (ManualCcauthDate != null))  _ManualCcauthDateSet = flag;
  /** BMF_UNAPPLIED.file_id field */
    if(!nonNullOnly || (FileId != null))  _FileIdSet = flag;
  /** BMF_UNAPPLIED.response_code field */
    if(!nonNullOnly || (ResponseCode != null))  _ResponseCodeSet = flag;
  /** BMF_UNAPPLIED.bill_order_number field */
    if(!nonNullOnly || (BillOrderNumber != null))  _BillOrderNumberSet = flag;
  /** BMF_UNAPPLIED.external_amount field */
    if(!nonNullOnly || (ExternalAmount != null))  _ExternalAmountSet = flag;
  /** BMF_UNAPPLIED.external_currency field */
    if(!nonNullOnly || (ExternalCurrency != null))  _ExternalCurrencySet = flag;
  /** BMF_UNAPPLIED.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** BMF_UNAPPLIED.annotation field */
    if(!nonNullOnly || (Annotation != null))  _AnnotationSet = flag;
  }
}
