/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: EftTransactionObjectData.java
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
  
/** EftTransactionObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class EftTransactionObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public EftTransactionObjectKeyData Key = null;
  /** PAYMENT_PROFILE.bank_agency_name field */
  public    String BankAgencyName  = null;
  protected boolean _BankAgencyNameSet = false;
  /** PAYMENT_PROFILE.bank_agency_code field */
  public    String BankAgencyCode  = null;
  protected boolean _BankAgencyCodeSet = false;
  /** PAYMENT_PROFILE.cust_bank_sort_code field */
  public    String CustBankSortCode  = null;
  protected boolean _CustBankSortCodeSet = false;
  /** PAYMENT_PROFILE.cust_bank_acc_num field */
  public    String CustBankAccNum  = null;
  protected boolean _CustBankAccNumSet = false;
  /** PAYMENT_PROFILE.ownr_lname field */
  public    String OwnrLname  = null;
  protected boolean _OwnrLnameSet = false;
  /** PAYMENT_PROFILE.ownr_fname field */
  public    String OwnrFname  = null;
  protected boolean _OwnrFnameSet = false;
  /** PAYMENT_PROFILE.mandate_id field */
  public    String MandateId  = null;
  protected boolean _MandateIdSet = false;
  /** PAYMENT_PROFILE.mandate_sign_date field */
  public    Date MandateSignDate  = null;
  protected boolean _MandateSignDateSet = false;
  /** PAYMENT_PROFILE.mandate_status field */
  public    String MandateStatus  = null;
  protected boolean _MandateStatusSet = false;
  /** PAYMENT_PROFILE.cust_bank_iban field */
  public    String CustBankIban  = null;
  protected boolean _CustBankIbanSet = false;
  /** PAYMENT_PROFILE.cust_bank_bic field */
  public    String CustBankBic  = null;
  protected boolean _CustBankBicSet = false;
  /** PAYMENT_PROFILE.diff_acct_own_flag field */
  public    String DiffAcctOwnFlag  = null;
  protected boolean _DiffAcctOwnFlagSet = false;
  /** PAYMENT_PROFILE.cust_bank_acc_owner field */
  public    String CustBankAccOwner  = null;
  protected boolean _CustBankAccOwnerSet = false;
  /** PAYMENT_PROFILE.sequence_type field */
  public    String SequenceType  = null;
  protected boolean _SequenceTypeSet = false;
  /** PAYMENT_PROFILE.cust_bank_iban_hist field */
  public    String CustBankIbanHist  = null;
  protected boolean _CustBankIbanHistSet = false;
  /** PAYMENT_PROFILE.cust_bank_bic_hist field */
  public    String CustBankBicHist  = null;
  protected boolean _CustBankBicHistSet = false;
  /** PAYMENT_PROFILE.mandate_reset field */
  public    String MandateReset  = null;
  protected boolean _MandateResetSet = false;
  /** PAYMENT_TRANS.chg_date field */
  public    Date ChgDate  = null;
  protected boolean _ChgDateSet = false;
  /** PAYMENT_TRANS.response_code field */
  public    String ResponseCode  = null;
  protected boolean _ResponseCodeSet = false;
  /** PAYMENT_TRANS.clearing_house_id field */
  public    String ClearingHouseId  = null;
  protected boolean _ClearingHouseIdSet = false;
  /** PAYMENT_TRANS.file_id field */
  public    Integer FileId  = null;
  protected boolean _FileIdSet = false;
  /** PAYMENT_TRANS.pmt_tracking_id field */
  public    Integer BmfTrackingId  = null;
  protected boolean _BmfTrackingIdSet = false;
  /** PAYMENT_TRANS.pmt_tracking_id_serv field */
  public    Integer BmfTrackingIdServ  = null;
  protected boolean _BmfTrackingIdServSet = false;
  /** PAYMENT_TRANS.orig_tracking_id field */
  public    Integer OrigTrackingId  = null;
  protected boolean _OrigTrackingIdSet = false;
  /** PAYMENT_TRANS.orig_tracking_id_serv field */
  public    Integer OrigTrackingIdServ  = null;
  protected boolean _OrigTrackingIdServSet = false;
  /** PAYMENT_TRANS.pmt_req_sent_counter field */
  public    Integer PmtReqSentCounter  = null;
  protected boolean _PmtReqSentCounterSet = false;
  /** PAYMENT_TRANS.no_bill field */
  public    Boolean NoBill  = null;
  protected boolean _NoBillSet = false;
  /** PAYMENT_TRANS.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** PAYMENT_TRANS.bill_ref_no field */
  public    Integer BillRefNo  = null;
  protected boolean _BillRefNoSet = false;
  /** PAYMENT_TRANS.bill_ref_resets field */
  public    Integer BillRefResets  = null;
  protected boolean _BillRefResetsSet = false;
  /** PAYMENT_TRANS.payment_due_date field */
  public    Date PaymentDueDate  = null;
  protected boolean _PaymentDueDateSet = false;
  /** PAYMENT_TRANS.statement_date field */
  public    Date StatementDate  = null;
  protected boolean _StatementDateSet = false;
  /** PAYMENT_TRANS.amount field */
  public    BigInteger Amount  = null;
  protected boolean _AmountSet = false;
  /** PAYMENT_TRANS.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** PAYMENT_TRANS.trans_type field */
  public    Integer EftTransType  = null;
  protected boolean _EftTransTypeSet = false;
  /** PAYMENT_TRANS.bmf_trans_type field */
  public    Integer BmfTransType  = null;
  protected boolean _BmfTransTypeSet = false;
  /** PAYMENT_TRANS.trans_status field */
  public    Integer EftTransStatus  = null;
  protected boolean _EftTransStatusSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  private String _objName = "EftTransactionObjectData";
  /** Default constructor */
  public EftTransactionObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public EftTransactionObjectData (EftTransactionObjectData other)
  {

    if (other == null) return;
    this.Key = new EftTransactionObjectKeyData (other.Key);
    this.BankAgencyName = other.BankAgencyName;
    this._BankAgencyNameSet = other._BankAgencyNameSet;
    this.BankAgencyCode = other.BankAgencyCode;
    this._BankAgencyCodeSet = other._BankAgencyCodeSet;
    this.CustBankSortCode = other.CustBankSortCode;
    this._CustBankSortCodeSet = other._CustBankSortCodeSet;
    this.CustBankAccNum = other.CustBankAccNum;
    this._CustBankAccNumSet = other._CustBankAccNumSet;
    this.OwnrLname = other.OwnrLname;
    this._OwnrLnameSet = other._OwnrLnameSet;
    this.OwnrFname = other.OwnrFname;
    this._OwnrFnameSet = other._OwnrFnameSet;
    this.MandateId = other.MandateId;
    this._MandateIdSet = other._MandateIdSet;
    this.MandateSignDate = other.MandateSignDate;
    this._MandateSignDateSet = other._MandateSignDateSet;
    this.MandateStatus = other.MandateStatus;
    this._MandateStatusSet = other._MandateStatusSet;
    this.CustBankIban = other.CustBankIban;
    this._CustBankIbanSet = other._CustBankIbanSet;
    this.CustBankBic = other.CustBankBic;
    this._CustBankBicSet = other._CustBankBicSet;
    this.DiffAcctOwnFlag = other.DiffAcctOwnFlag;
    this._DiffAcctOwnFlagSet = other._DiffAcctOwnFlagSet;
    this.CustBankAccOwner = other.CustBankAccOwner;
    this._CustBankAccOwnerSet = other._CustBankAccOwnerSet;
    this.SequenceType = other.SequenceType;
    this._SequenceTypeSet = other._SequenceTypeSet;
    this.CustBankIbanHist = other.CustBankIbanHist;
    this._CustBankIbanHistSet = other._CustBankIbanHistSet;
    this.CustBankBicHist = other.CustBankBicHist;
    this._CustBankBicHistSet = other._CustBankBicHistSet;
    this.MandateReset = other.MandateReset;
    this._MandateResetSet = other._MandateResetSet;
    this.ChgDate = other.ChgDate;
    this._ChgDateSet = other._ChgDateSet;
    this.ResponseCode = other.ResponseCode;
    this._ResponseCodeSet = other._ResponseCodeSet;
    this.ClearingHouseId = other.ClearingHouseId;
    this._ClearingHouseIdSet = other._ClearingHouseIdSet;
    this.FileId = other.FileId;
    this._FileIdSet = other._FileIdSet;
    this.BmfTrackingId = other.BmfTrackingId;
    this._BmfTrackingIdSet = other._BmfTrackingIdSet;
    this.BmfTrackingIdServ = other.BmfTrackingIdServ;
    this._BmfTrackingIdServSet = other._BmfTrackingIdServSet;
    this.OrigTrackingId = other.OrigTrackingId;
    this._OrigTrackingIdSet = other._OrigTrackingIdSet;
    this.OrigTrackingIdServ = other.OrigTrackingIdServ;
    this._OrigTrackingIdServSet = other._OrigTrackingIdServSet;
    this.PmtReqSentCounter = other.PmtReqSentCounter;
    this._PmtReqSentCounterSet = other._PmtReqSentCounterSet;
    this.NoBill = other.NoBill;
    this._NoBillSet = other._NoBillSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.BillRefNo = other.BillRefNo;
    this._BillRefNoSet = other._BillRefNoSet;
    this.BillRefResets = other.BillRefResets;
    this._BillRefResetsSet = other._BillRefResetsSet;
    this.PaymentDueDate = other.PaymentDueDate;
    this._PaymentDueDateSet = other._PaymentDueDateSet;
    this.StatementDate = other.StatementDate;
    this._StatementDateSet = other._StatementDateSet;
    this.Amount = other.Amount;
    this._AmountSet = other._AmountSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.EftTransType = other.EftTransType;
    this._EftTransTypeSet = other._EftTransTypeSet;
    this.BmfTransType = other.BmfTransType;
    this._BmfTransTypeSet = other._BmfTransTypeSet;
    this.EftTransStatus = other.EftTransStatus;
    this._EftTransStatusSet = other._EftTransStatusSet;
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
  }

  /** get the Key for this object
   * @return EftTransactionObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public EftTransactionObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (EftTransactionObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (PAYMENT_TRANS.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new EftTransactionObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (PAYMENT_TRANS.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (PAYMENT_TRANS.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (PAYMENT_TRANS.tracking_id)
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

  /** set the fields value: Counter (PAYMENT_TRANS.counter)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setCounter (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Counter", "setCounter");
    }
    if (this.Key == null) this.Key = new EftTransactionObjectKeyData ();
    this.Key.Counter = value;
    this.Key._CounterSet = true;
  }
  /** get the value of the field: Counter (PAYMENT_TRANS.counter)
   * @return Integer the value
   */
  public Integer getCounter () {
    if (this.Key == null) return null;
    return this.Key.Counter;
  }
  /** Change the field to not being actively set: Counter (PAYMENT_TRANS.counter)
   */
  public void unsetCounter () {
    if (this.Key == null) return;
    this.Key._CounterSet = false;
  }
  /** See if the field is actively set: Counter (PAYMENT_TRANS.counter)
   * @return boolean whether the field is actively set
   */
  public boolean issetCounter () {
    if (this.Key == null) return false;
    return this.Key._CounterSet;
  }

  /** Retrieves the Counter field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Counter field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Counter field
   */
   public String getCounterAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCounterAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCounterAsFormattedString");
       return fmtMgr.formatNumber(this.getCounter(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Counter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCounterAsFormattedString");
       throw x;
     }
   }
  /** Sets the Counter field from a formatted string
   *
   * @param _value the Counter field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Counter field
   */
   public void setCounterFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCounterFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCounter(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Counter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCounterFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCounterFromFormattedString");
   }

  /** set the fields value: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new EftTransactionObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (PAYMENT_TRANS.tracking_id_serv)
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

  /** set the fields value: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BankAgencyName") 
  public void setBankAgencyName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BankAgencyName", "setBankAgencyName");
    }
    this.BankAgencyName = value;
    this._BankAgencyNameSet = true;
  }

  /** Retrieves the BankAgencyName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BankAgencyName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankAgencyName field
   */
   public String getBankAgencyNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankAgencyNameAsFormattedString");
       return fmtMgr.formatString(this.getBankAgencyName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAgencyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankAgencyNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the BankAgencyName field from a formatted string
   *
   * @param _value the BankAgencyName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BankAgencyName field
   */
   public void setBankAgencyNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBankAgencyName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAgencyName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankAgencyNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankAgencyNameFromFormattedString");
   }

  /** get the value of the field: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @return String the value
   */
  public String getBankAgencyName () {
    return this.BankAgencyName;
  }
  /** Change the field to not being actively set: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   */
  public void unsetBankAgencyName () {
    this._BankAgencyNameSet = false;
  }
  /** See if the field is actively set: BankAgencyName (PAYMENT_PROFILE.bank_agency_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetBankAgencyName () {
    return this._BankAgencyNameSet;
  }
  /** set the fields value: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BankAgencyCode") 
  public void setBankAgencyCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 5))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "BankAgencyCode", "setBankAgencyCode");
    }
    this.BankAgencyCode = value;
    this._BankAgencyCodeSet = true;
  }

  /** Retrieves the BankAgencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BankAgencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BankAgencyCode field
   */
   public String getBankAgencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBankAgencyCodeAsFormattedString");
       return fmtMgr.formatString(this.getBankAgencyCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAgencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBankAgencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the BankAgencyCode field from a formatted string
   *
   * @param _value the BankAgencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BankAgencyCode field
   */
   public void setBankAgencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBankAgencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBankAgencyCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BankAgencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBankAgencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBankAgencyCodeFromFormattedString");
   }

  /** get the value of the field: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @return String the value
   */
  public String getBankAgencyCode () {
    return this.BankAgencyCode;
  }
  /** Change the field to not being actively set: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   */
  public void unsetBankAgencyCode () {
    this._BankAgencyCodeSet = false;
  }
  /** See if the field is actively set: BankAgencyCode (PAYMENT_PROFILE.bank_agency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetBankAgencyCode () {
    return this._BankAgencyCodeSet;
  }
  /** set the fields value: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankSortCode") 
  public void setCustBankSortCode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 9))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankSortCode", "setCustBankSortCode");
    }
    this.CustBankSortCode = value;
    this._CustBankSortCodeSet = true;
  }

  /** Retrieves the CustBankSortCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankSortCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankSortCode field
   */
   public String getCustBankSortCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankSortCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankSortCodeAsFormattedString");
       return fmtMgr.formatString(this.getCustBankSortCode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankSortCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankSortCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankSortCode field from a formatted string
   *
   * @param _value the CustBankSortCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankSortCode field
   */
   public void setCustBankSortCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankSortCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankSortCode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankSortCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankSortCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankSortCodeFromFormattedString");
   }

  /** get the value of the field: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @return String the value
   */
  public String getCustBankSortCode () {
    return this.CustBankSortCode;
  }
  /** Change the field to not being actively set: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   */
  public void unsetCustBankSortCode () {
    this._CustBankSortCodeSet = false;
  }
  /** See if the field is actively set: CustBankSortCode (PAYMENT_PROFILE.cust_bank_sort_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankSortCode () {
    return this._CustBankSortCodeSet;
  }
  /** set the fields value: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankAccNum") 
  public void setCustBankAccNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankAccNum", "setCustBankAccNum");
    }
    this.CustBankAccNum = value;
    this._CustBankAccNumSet = true;
  }

  /** Retrieves the CustBankAccNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankAccNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankAccNum field
   */
   public String getCustBankAccNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankAccNumAsFormattedString");
       return fmtMgr.formatString(this.getCustBankAccNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAccNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankAccNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankAccNum field from a formatted string
   *
   * @param _value the CustBankAccNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankAccNum field
   */
   public void setCustBankAccNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankAccNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAccNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankAccNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankAccNumFromFormattedString");
   }

  /** get the value of the field: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @return String the value
   */
  public String getCustBankAccNum () {
    return this.CustBankAccNum;
  }
  /** Change the field to not being actively set: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   */
  public void unsetCustBankAccNum () {
    this._CustBankAccNumSet = false;
  }
  /** See if the field is actively set: CustBankAccNum (PAYMENT_PROFILE.cust_bank_acc_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankAccNum () {
    return this._CustBankAccNumSet;
  }
  /** set the fields value: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwnrLname") 
  public void setOwnrLname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OwnrLname", "setOwnrLname");
    }
    this.OwnrLname = value;
    this._OwnrLnameSet = true;
  }

  /** Retrieves the OwnrLname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwnrLname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrLname field
   */
   public String getOwnrLnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrLnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrLnameAsFormattedString");
       return fmtMgr.formatString(this.getOwnrLname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrLnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwnrLname field from a formatted string
   *
   * @param _value the OwnrLname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwnrLname field
   */
   public void setOwnrLnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrLnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwnrLname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrLname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrLnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrLnameFromFormattedString");
   }

  /** get the value of the field: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return String the value
   */
  public String getOwnrLname () {
    return this.OwnrLname;
  }
  /** Change the field to not being actively set: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   */
  public void unsetOwnrLname () {
    this._OwnrLnameSet = false;
  }
  /** See if the field is actively set: OwnrLname (PAYMENT_PROFILE.ownr_lname)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwnrLname () {
    return this._OwnrLnameSet;
  }
  /** set the fields value: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OwnrFname") 
  public void setOwnrFname (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OwnrFname", "setOwnrFname");
    }
    this.OwnrFname = value;
    this._OwnrFnameSet = true;
  }

  /** Retrieves the OwnrFname field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OwnrFname field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OwnrFname field
   */
   public String getOwnrFnameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrFnameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOwnrFnameAsFormattedString");
       return fmtMgr.formatString(this.getOwnrFname());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOwnrFnameAsFormattedString");
       throw x;
     }
   }
  /** Sets the OwnrFname field from a formatted string
   *
   * @param _value the OwnrFname field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OwnrFname field
   */
   public void setOwnrFnameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOwnrFnameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOwnrFname(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OwnrFname");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOwnrFnameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOwnrFnameFromFormattedString");
   }

  /** get the value of the field: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return String the value
   */
  public String getOwnrFname () {
    return this.OwnrFname;
  }
  /** Change the field to not being actively set: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   */
  public void unsetOwnrFname () {
    this._OwnrFnameSet = false;
  }
  /** See if the field is actively set: OwnrFname (PAYMENT_PROFILE.ownr_fname)
   * @return boolean whether the field is actively set
   */
  public boolean issetOwnrFname () {
    return this._OwnrFnameSet;
  }
  /** set the fields value: MandateId (PAYMENT_PROFILE.mandate_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MandateId") 
  public void setMandateId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 24))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MandateId", "setMandateId");
    }
    this.MandateId = value;
    this._MandateIdSet = true;
  }

  /** Retrieves the MandateId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MandateId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateId field
   */
   public String getMandateIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateIdAsFormattedString");
       return fmtMgr.formatString(this.getMandateId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MandateId field from a formatted string
   *
   * @param _value the MandateId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateId field
   */
   public void setMandateIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMandateId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateIdFromFormattedString");
   }

  /** get the value of the field: MandateId (PAYMENT_PROFILE.mandate_id)
   * @return String the value
   */
  public String getMandateId () {
    return this.MandateId;
  }
  /** Change the field to not being actively set: MandateId (PAYMENT_PROFILE.mandate_id)
   */
  public void unsetMandateId () {
    this._MandateIdSet = false;
  }
  /** See if the field is actively set: MandateId (PAYMENT_PROFILE.mandate_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMandateId () {
    return this._MandateIdSet;
  }
  /** set the fields value: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MandateSignDate") 
  public void setMandateSignDate (Date value) throws ServiceException
  {
    this.MandateSignDate = value;
    this._MandateSignDateSet = true;
  }

  /** Retrieves the MandateSignDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MandateSignDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateSignDate field
   */
   public String getMandateSignDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateSignDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateSignDateAsFormattedString");
       return fmtMgr.formatDate(this.getMandateSignDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateSignDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateSignDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the MandateSignDate field from a formatted string
   *
   * @param _value the MandateSignDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateSignDate field
   */
   public void setMandateSignDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateSignDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMandateSignDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateSignDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateSignDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateSignDateFromFormattedString");
   }

  /**
   * Retrieves the MandateSignDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The MandateSignDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateSignDate field
   */
  public String getMandateSignDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateSignDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateSignDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getMandateSignDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateSignDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateSignDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the MandateSignDate field value from a formatted date/time string
   *
   * @param _value the MandateSignDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateSignDate field
   */
  public void setMandateSignDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setMandateSignDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setMandateSignDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("MandateSignDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateSignDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @return Date the value
   */
  public Date getMandateSignDate () {
    return this.MandateSignDate;
  }
  /** Change the field to not being actively set: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   */
  public void unsetMandateSignDate () {
    this._MandateSignDateSet = false;
  }
  /** See if the field is actively set: MandateSignDate (PAYMENT_PROFILE.mandate_sign_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetMandateSignDate () {
    return this._MandateSignDateSet;
  }
  /** set the fields value: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MandateStatus") 
  public void setMandateStatus (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MandateStatus", "setMandateStatus");
    }
    this.MandateStatus = value;
    this._MandateStatusSet = true;
  }

  /** Retrieves the MandateStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MandateStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateStatus field
   */
   public String getMandateStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateStatusAsFormattedString");
       return fmtMgr.formatString(this.getMandateStatus());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the MandateStatus field from a formatted string
   *
   * @param _value the MandateStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateStatus field
   */
   public void setMandateStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMandateStatus(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateStatusFromFormattedString");
   }

  /** get the value of the field: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @return String the value
   */
  public String getMandateStatus () {
    return this.MandateStatus;
  }
  /** Change the field to not being actively set: MandateStatus (PAYMENT_PROFILE.mandate_status)
   */
  public void unsetMandateStatus () {
    this._MandateStatusSet = false;
  }
  /** See if the field is actively set: MandateStatus (PAYMENT_PROFILE.mandate_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetMandateStatus () {
    return this._MandateStatusSet;
  }
  /** set the fields value: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankIban") 
  public void setCustBankIban (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 34))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankIban", "setCustBankIban");
    }
    this.CustBankIban = value;
    this._CustBankIbanSet = true;
  }

  /** Retrieves the CustBankIban field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankIban field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankIban field
   */
   public String getCustBankIbanAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankIbanAsFormattedString");
       return fmtMgr.formatString(this.getCustBankIban());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankIban");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankIbanAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankIban field from a formatted string
   *
   * @param _value the CustBankIban field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankIban field
   */
   public void setCustBankIbanFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankIban(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankIban");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankIbanFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankIbanFromFormattedString");
   }

  /** get the value of the field: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @return String the value
   */
  public String getCustBankIban () {
    return this.CustBankIban;
  }
  /** Change the field to not being actively set: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   */
  public void unsetCustBankIban () {
    this._CustBankIbanSet = false;
  }
  /** See if the field is actively set: CustBankIban (PAYMENT_PROFILE.cust_bank_iban)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankIban () {
    return this._CustBankIbanSet;
  }
  /** set the fields value: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankBic") 
  public void setCustBankBic (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 11))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankBic", "setCustBankBic");
    }
    this.CustBankBic = value;
    this._CustBankBicSet = true;
  }

  /** Retrieves the CustBankBic field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankBic field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankBic field
   */
   public String getCustBankBicAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankBicAsFormattedString");
       return fmtMgr.formatString(this.getCustBankBic());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankBic");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankBicAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankBic field from a formatted string
   *
   * @param _value the CustBankBic field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankBic field
   */
   public void setCustBankBicFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankBic(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankBic");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankBicFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankBicFromFormattedString");
   }

  /** get the value of the field: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @return String the value
   */
  public String getCustBankBic () {
    return this.CustBankBic;
  }
  /** Change the field to not being actively set: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   */
  public void unsetCustBankBic () {
    this._CustBankBicSet = false;
  }
  /** See if the field is actively set: CustBankBic (PAYMENT_PROFILE.cust_bank_bic)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankBic () {
    return this._CustBankBicSet;
  }
  /** set the fields value: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("DiffAcctOwnFlag") 
  public void setDiffAcctOwnFlag (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "DiffAcctOwnFlag", "setDiffAcctOwnFlag");
    }
    this.DiffAcctOwnFlag = value;
    this._DiffAcctOwnFlagSet = true;
  }

  /** Retrieves the DiffAcctOwnFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The DiffAcctOwnFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the DiffAcctOwnFlag field
   */
   public String getDiffAcctOwnFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiffAcctOwnFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getDiffAcctOwnFlagAsFormattedString");
       return fmtMgr.formatString(this.getDiffAcctOwnFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiffAcctOwnFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getDiffAcctOwnFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the DiffAcctOwnFlag field from a formatted string
   *
   * @param _value the DiffAcctOwnFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the DiffAcctOwnFlag field
   */
   public void setDiffAcctOwnFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getDiffAcctOwnFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setDiffAcctOwnFlag(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("DiffAcctOwnFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setDiffAcctOwnFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setDiffAcctOwnFlagFromFormattedString");
   }

  /** get the value of the field: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @return String the value
   */
  public String getDiffAcctOwnFlag () {
    return this.DiffAcctOwnFlag;
  }
  /** Change the field to not being actively set: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   */
  public void unsetDiffAcctOwnFlag () {
    this._DiffAcctOwnFlagSet = false;
  }
  /** See if the field is actively set: DiffAcctOwnFlag (PAYMENT_PROFILE.diff_acct_own_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetDiffAcctOwnFlag () {
    return this._DiffAcctOwnFlagSet;
  }
  /** set the fields value: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankAccOwner") 
  public void setCustBankAccOwner (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 85))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankAccOwner", "setCustBankAccOwner");
    }
    this.CustBankAccOwner = value;
    this._CustBankAccOwnerSet = true;
  }

  /** Retrieves the CustBankAccOwner field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankAccOwner field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankAccOwner field
   */
   public String getCustBankAccOwnerAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccOwnerAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankAccOwnerAsFormattedString");
       return fmtMgr.formatString(this.getCustBankAccOwner());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAccOwner");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankAccOwnerAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankAccOwner field from a formatted string
   *
   * @param _value the CustBankAccOwner field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankAccOwner field
   */
   public void setCustBankAccOwnerFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankAccOwnerFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankAccOwner(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankAccOwner");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankAccOwnerFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankAccOwnerFromFormattedString");
   }

  /** get the value of the field: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @return String the value
   */
  public String getCustBankAccOwner () {
    return this.CustBankAccOwner;
  }
  /** Change the field to not being actively set: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   */
  public void unsetCustBankAccOwner () {
    this._CustBankAccOwnerSet = false;
  }
  /** See if the field is actively set: CustBankAccOwner (PAYMENT_PROFILE.cust_bank_acc_owner)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankAccOwner () {
    return this._CustBankAccOwnerSet;
  }
  /** set the fields value: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SequenceType") 
  public void setSequenceType (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SequenceType", "setSequenceType");
    }
    this.SequenceType = value;
    this._SequenceTypeSet = true;
  }

  /** Retrieves the SequenceType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SequenceType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SequenceType field
   */
   public String getSequenceTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSequenceTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSequenceTypeAsFormattedString");
       return fmtMgr.formatString(this.getSequenceType());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SequenceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSequenceTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the SequenceType field from a formatted string
   *
   * @param _value the SequenceType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SequenceType field
   */
   public void setSequenceTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSequenceTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSequenceType(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SequenceType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSequenceTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSequenceTypeFromFormattedString");
   }

  /** get the value of the field: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @return String the value
   */
  public String getSequenceType () {
    return this.SequenceType;
  }
  /** Change the field to not being actively set: SequenceType (PAYMENT_PROFILE.sequence_type)
   */
  public void unsetSequenceType () {
    this._SequenceTypeSet = false;
  }
  /** See if the field is actively set: SequenceType (PAYMENT_PROFILE.sequence_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetSequenceType () {
    return this._SequenceTypeSet;
  }
  /** set the fields value: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankIbanHist") 
  public void setCustBankIbanHist (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 34))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankIbanHist", "setCustBankIbanHist");
    }
    this.CustBankIbanHist = value;
    this._CustBankIbanHistSet = true;
  }

  /** Retrieves the CustBankIbanHist field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankIbanHist field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankIbanHist field
   */
   public String getCustBankIbanHistAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanHistAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankIbanHistAsFormattedString");
       return fmtMgr.formatString(this.getCustBankIbanHist());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankIbanHist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankIbanHistAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankIbanHist field from a formatted string
   *
   * @param _value the CustBankIbanHist field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankIbanHist field
   */
   public void setCustBankIbanHistFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankIbanHistFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankIbanHist(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankIbanHist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankIbanHistFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankIbanHistFromFormattedString");
   }

  /** get the value of the field: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @return String the value
   */
  public String getCustBankIbanHist () {
    return this.CustBankIbanHist;
  }
  /** Change the field to not being actively set: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   */
  public void unsetCustBankIbanHist () {
    this._CustBankIbanHistSet = false;
  }
  /** See if the field is actively set: CustBankIbanHist (PAYMENT_PROFILE.cust_bank_iban_hist)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankIbanHist () {
    return this._CustBankIbanHistSet;
  }
  /** set the fields value: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CustBankBicHist") 
  public void setCustBankBicHist (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 11))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CustBankBicHist", "setCustBankBicHist");
    }
    this.CustBankBicHist = value;
    this._CustBankBicHistSet = true;
  }

  /** Retrieves the CustBankBicHist field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CustBankBicHist field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CustBankBicHist field
   */
   public String getCustBankBicHistAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicHistAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCustBankBicHistAsFormattedString");
       return fmtMgr.formatString(this.getCustBankBicHist());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankBicHist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCustBankBicHistAsFormattedString");
       throw x;
     }
   }
  /** Sets the CustBankBicHist field from a formatted string
   *
   * @param _value the CustBankBicHist field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CustBankBicHist field
   */
   public void setCustBankBicHistFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCustBankBicHistFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCustBankBicHist(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CustBankBicHist");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCustBankBicHistFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCustBankBicHistFromFormattedString");
   }

  /** get the value of the field: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @return String the value
   */
  public String getCustBankBicHist () {
    return this.CustBankBicHist;
  }
  /** Change the field to not being actively set: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   */
  public void unsetCustBankBicHist () {
    this._CustBankBicHistSet = false;
  }
  /** See if the field is actively set: CustBankBicHist (PAYMENT_PROFILE.cust_bank_bic_hist)
   * @return boolean whether the field is actively set
   */
  public boolean issetCustBankBicHist () {
    return this._CustBankBicHistSet;
  }
  /** set the fields value: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MandateReset") 
  public void setMandateReset (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "MandateReset", "setMandateReset");
    }
    this.MandateReset = value;
    this._MandateResetSet = true;
  }

  /** Retrieves the MandateReset field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MandateReset field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MandateReset field
   */
   public String getMandateResetAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateResetAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMandateResetAsFormattedString");
       return fmtMgr.formatString(this.getMandateReset());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateReset");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMandateResetAsFormattedString");
       throw x;
     }
   }
  /** Sets the MandateReset field from a formatted string
   *
   * @param _value the MandateReset field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MandateReset field
   */
   public void setMandateResetFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMandateResetFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMandateReset(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MandateReset");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMandateResetFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMandateResetFromFormattedString");
   }

  /** get the value of the field: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @return String the value
   */
  public String getMandateReset () {
    return this.MandateReset;
  }
  /** Change the field to not being actively set: MandateReset (PAYMENT_PROFILE.mandate_reset)
   */
  public void unsetMandateReset () {
    this._MandateResetSet = false;
  }
  /** See if the field is actively set: MandateReset (PAYMENT_PROFILE.mandate_reset)
   * @return boolean whether the field is actively set
   */
  public boolean issetMandateReset () {
    return this._MandateResetSet;
  }
  /** set the fields value: ChgDate (PAYMENT_TRANS.chg_date)
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

  /** get the value of the field: ChgDate (PAYMENT_TRANS.chg_date)
   * @return Date the value
   */
  public Date getChgDate () {
    return this.ChgDate;
  }
  /** Change the field to not being actively set: ChgDate (PAYMENT_TRANS.chg_date)
   */
  public void unsetChgDate () {
    this._ChgDateSet = false;
  }
  /** See if the field is actively set: ChgDate (PAYMENT_TRANS.chg_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetChgDate () {
    return this._ChgDateSet;
  }
  /** set the fields value: ResponseCode (PAYMENT_TRANS.response_code)
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

  /** get the value of the field: ResponseCode (PAYMENT_TRANS.response_code)
   * @return String the value
   */
  public String getResponseCode () {
    return this.ResponseCode;
  }
  /** Change the field to not being actively set: ResponseCode (PAYMENT_TRANS.response_code)
   */
  public void unsetResponseCode () {
    this._ResponseCodeSet = false;
  }
  /** See if the field is actively set: ResponseCode (PAYMENT_TRANS.response_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetResponseCode () {
    return this._ResponseCodeSet;
  }
  /** set the fields value: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ClearingHouseId") 
  public void setClearingHouseId (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 3))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ClearingHouseId", "setClearingHouseId");
    }
    this.ClearingHouseId = value;
    this._ClearingHouseIdSet = true;
  }

  /** Retrieves the ClearingHouseId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ClearingHouseId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ClearingHouseId field
   */
   public String getClearingHouseIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseIdAsFormattedString");
       return fmtMgr.formatString(this.getClearingHouseId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClearingHouseId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getClearingHouseIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ClearingHouseId field from a formatted string
   *
   * @param _value the ClearingHouseId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ClearingHouseId field
   */
   public void setClearingHouseIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setClearingHouseId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ClearingHouseId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setClearingHouseIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setClearingHouseIdFromFormattedString");
   }

  /**
   * Retrieves the display value for the enumerated ClearingHouseId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the ClearingHouseId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ClearingHouseId field
   */

  public String getClearingHouseIdDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getClearingHouseIdEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseIdDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getClearingHouseId()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClearingHouseId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClearingHouseIdDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated ClearingHouseId field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the ClearingHouseId field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the ClearingHouseId field
   */
  public Enumeration getClearingHouseIdEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getClearingHouseIdEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("ClearingHouse", _locale, enumFilter, true);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getClearingHouseIdEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClearingHouseId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getClearingHouseIdEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated ClearingHouseId field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setClearingHouseIdFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClearingHouseIdFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getClearingHouseIdEnumeration(_locale);
      this.setClearingHouseId((String)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), String.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ClearingHouseId");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setClearingHouseIdFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setClearingHouseIdFromDisplayValue");
  }

  /** get the value of the field: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @return String the value
   */
  public String getClearingHouseId () {
    return this.ClearingHouseId;
  }
  /** Change the field to not being actively set: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   */
  public void unsetClearingHouseId () {
    this._ClearingHouseIdSet = false;
  }
  /** See if the field is actively set: ClearingHouseId (PAYMENT_TRANS.clearing_house_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetClearingHouseId () {
    return this._ClearingHouseIdSet;
  }
  /** set the fields value: FileId (PAYMENT_TRANS.file_id)
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

  /** get the value of the field: FileId (PAYMENT_TRANS.file_id)
   * @return Integer the value
   */
  public Integer getFileId () {
    return this.FileId;
  }
  /** Change the field to not being actively set: FileId (PAYMENT_TRANS.file_id)
   */
  public void unsetFileId () {
    this._FileIdSet = false;
  }
  /** See if the field is actively set: FileId (PAYMENT_TRANS.file_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFileId () {
    return this._FileIdSet;
  }
  /** set the fields value: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
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

  /** get the value of the field: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return Integer the value
   */
  public Integer getBmfTrackingId () {
    return this.BmfTrackingId;
  }
  /** Change the field to not being actively set: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   */
  public void unsetBmfTrackingId () {
    this._BmfTrackingIdSet = false;
  }
  /** See if the field is actively set: BmfTrackingId (PAYMENT_TRANS.pmt_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingId () {
    return this._BmfTrackingIdSet;
  }
  /** set the fields value: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
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

  /** get the value of the field: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getBmfTrackingIdServ () {
    return this.BmfTrackingIdServ;
  }
  /** Change the field to not being actively set: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   */
  public void unsetBmfTrackingIdServ () {
    this._BmfTrackingIdServSet = false;
  }
  /** See if the field is actively set: BmfTrackingIdServ (PAYMENT_TRANS.pmt_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTrackingIdServ () {
    return this._BmfTrackingIdServSet;
  }
  /** set the fields value: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
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

  /** get the value of the field: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * @return Integer the value
   */
  public Integer getOrigTrackingId () {
    return this.OrigTrackingId;
  }
  /** Change the field to not being actively set: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   */
  public void unsetOrigTrackingId () {
    this._OrigTrackingIdSet = false;
  }
  /** See if the field is actively set: OrigTrackingId (PAYMENT_TRANS.orig_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTrackingId () {
    return this._OrigTrackingIdSet;
  }
  /** set the fields value: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
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

  /** get the value of the field: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getOrigTrackingIdServ () {
    return this.OrigTrackingIdServ;
  }
  /** Change the field to not being actively set: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   */
  public void unsetOrigTrackingIdServ () {
    this._OrigTrackingIdServSet = false;
  }
  /** See if the field is actively set: OrigTrackingIdServ (PAYMENT_TRANS.orig_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigTrackingIdServ () {
    return this._OrigTrackingIdServSet;
  }
  /** set the fields value: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PmtReqSentCounter") 
  public void setPmtReqSentCounter (Integer value) throws ServiceException
  {
    this.PmtReqSentCounter = value;
    this._PmtReqSentCounterSet = true;
  }

  /** Retrieves the PmtReqSentCounter field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PmtReqSentCounter field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PmtReqSentCounter field
   */
   public String getPmtReqSentCounterAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPmtReqSentCounterAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPmtReqSentCounterAsFormattedString");
       return fmtMgr.formatNumber(this.getPmtReqSentCounter(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PmtReqSentCounter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPmtReqSentCounterAsFormattedString");
       throw x;
     }
   }
  /** Sets the PmtReqSentCounter field from a formatted string
   *
   * @param _value the PmtReqSentCounter field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PmtReqSentCounter field
   */
   public void setPmtReqSentCounterFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPmtReqSentCounterFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPmtReqSentCounter(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PmtReqSentCounter");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPmtReqSentCounterFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPmtReqSentCounterFromFormattedString");
   }

  /** get the value of the field: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * @return Integer the value
   */
  public Integer getPmtReqSentCounter () {
    return this.PmtReqSentCounter;
  }
  /** Change the field to not being actively set: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   */
  public void unsetPmtReqSentCounter () {
    this._PmtReqSentCounterSet = false;
  }
  /** See if the field is actively set: PmtReqSentCounter (PAYMENT_TRANS.pmt_req_sent_counter)
   * @return boolean whether the field is actively set
   */
  public boolean issetPmtReqSentCounter () {
    return this._PmtReqSentCounterSet;
  }
  /** set the fields value: NoBill (PAYMENT_TRANS.no_bill)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("NoBill") 
  public void setNoBill (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "NoBill", "setNoBill");
    }
    this.NoBill = value;
    this._NoBillSet = true;
  }

  /** Retrieves the NoBill field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The NoBill field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the NoBill field
   */
   public String getNoBillAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getNoBillAsFormattedString");
       return fmtMgr.formatBoolean(this.getNoBill());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getNoBillAsFormattedString");
       throw x;
     }
   }
  /** Sets the NoBill field from a formatted string
   *
   * @param _value the NoBill field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the NoBill field
   */
   public void setNoBillFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getNoBillFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setNoBill(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("NoBill");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setNoBillFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setNoBillFromFormattedString");
   }

  /** get the value of the field: NoBill (PAYMENT_TRANS.no_bill)
   * @return Boolean the value
   */
  public Boolean getNoBill () {
    return this.NoBill;
  }
  /** Change the field to not being actively set: NoBill (PAYMENT_TRANS.no_bill)
   */
  public void unsetNoBill () {
    this._NoBillSet = false;
  }
  /** See if the field is actively set: NoBill (PAYMENT_TRANS.no_bill)
   * @return boolean whether the field is actively set
   */
  public boolean issetNoBill () {
    return this._NoBillSet;
  }
  /** set the fields value: AccountInternalId (PAYMENT_TRANS.account_no)
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

  /** get the value of the field: AccountInternalId (PAYMENT_TRANS.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (PAYMENT_TRANS.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (PAYMENT_TRANS.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefNo") 
  public void setBillRefNo (Integer value) throws ServiceException
  {
    this.BillRefNo = value;
    this._BillRefNoSet = true;
  }

  /** Retrieves the BillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefNo field
   */
   public String getBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefNo field from a formatted string
   *
   * @param _value the BillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefNo field
   */
   public void setBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefNoFromFormattedString");
   }

  /** get the value of the field: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * @return Integer the value
   */
  public Integer getBillRefNo () {
    return this.BillRefNo;
  }
  /** Change the field to not being actively set: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   */
  public void unsetBillRefNo () {
    this._BillRefNoSet = false;
  }
  /** See if the field is actively set: BillRefNo (PAYMENT_TRANS.bill_ref_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefNo () {
    return this._BillRefNoSet;
  }
  /** set the fields value: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BillRefResets") 
  public void setBillRefResets (Integer value) throws ServiceException
  {
    this.BillRefResets = value;
    this._BillRefResetsSet = true;
  }

  /** Retrieves the BillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The BillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the BillRefResets field
   */
   public String getBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the BillRefResets field from a formatted string
   *
   * @param _value the BillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the BillRefResets field
   */
   public void setBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("BillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setBillRefResetsFromFormattedString");
   }

  /** get the value of the field: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * @return Integer the value
   */
  public Integer getBillRefResets () {
    return this.BillRefResets;
  }
  /** Change the field to not being actively set: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   */
  public void unsetBillRefResets () {
    this._BillRefResetsSet = false;
  }
  /** See if the field is actively set: BillRefResets (PAYMENT_TRANS.bill_ref_resets)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillRefResets () {
    return this._BillRefResetsSet;
  }
  /** set the fields value: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PaymentDueDate") 
  public void setPaymentDueDate (Date value) throws ServiceException
  {
    this.PaymentDueDate = value;
    this._PaymentDueDateSet = true;
  }

  /** Retrieves the PaymentDueDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PaymentDueDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDate field
   */
   public String getPaymentDueDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateAsFormattedString");
       return fmtMgr.formatDate(this.getPaymentDueDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PaymentDueDate field from a formatted string
   *
   * @param _value the PaymentDueDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentDueDate field
   */
   public void setPaymentDueDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPaymentDueDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PaymentDueDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPaymentDueDateFromFormattedString");
   }

  /**
   * Retrieves the PaymentDueDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The PaymentDueDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the PaymentDueDate field
   */
  public String getPaymentDueDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getPaymentDueDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getPaymentDueDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the PaymentDueDate field value from a formatted date/time string
   *
   * @param _value the PaymentDueDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PaymentDueDate field
   */
  public void setPaymentDueDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setPaymentDueDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setPaymentDueDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("PaymentDueDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setPaymentDueDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * @return Date the value
   */
  public Date getPaymentDueDate () {
    return this.PaymentDueDate;
  }
  /** Change the field to not being actively set: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   */
  public void unsetPaymentDueDate () {
    this._PaymentDueDateSet = false;
  }
  /** See if the field is actively set: PaymentDueDate (PAYMENT_TRANS.payment_due_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentDueDate () {
    return this._PaymentDueDateSet;
  }
  /** set the fields value: StatementDate (PAYMENT_TRANS.statement_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatementDate") 
  public void setStatementDate (Date value) throws ServiceException
  {
    this.StatementDate = value;
    this._StatementDateSet = true;
  }

  /** Retrieves the StatementDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatementDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
   public String getStatementDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedString");
       return fmtMgr.formatDate(this.getStatementDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatementDate field from a formatted string
   *
   * @param _value the StatementDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
   public void setStatementDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatementDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatementDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatementDateFromFormattedString");
   }

  /**
   * Retrieves the StatementDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The StatementDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatementDate field
   */
  public String getStatementDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatementDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getStatementDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatementDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the StatementDate field value from a formatted date/time string
   *
   * @param _value the StatementDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatementDate field
   */
  public void setStatementDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setStatementDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setStatementDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("StatementDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatementDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: StatementDate (PAYMENT_TRANS.statement_date)
   * @return Date the value
   */
  public Date getStatementDate () {
    return this.StatementDate;
  }
  /** Change the field to not being actively set: StatementDate (PAYMENT_TRANS.statement_date)
   */
  public void unsetStatementDate () {
    this._StatementDateSet = false;
  }
  /** See if the field is actively set: StatementDate (PAYMENT_TRANS.statement_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatementDate () {
    return this._StatementDateSet;
  }
  /** set the fields value: Amount (PAYMENT_TRANS.amount)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("Amount") 
  public void setAmount (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "Amount", "setAmount");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "Amount", "setAmount");
    }
    this.Amount = value;
    this._AmountSet = true;
  }

  /** Retrieves the Amount field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The Amount field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
   public String getAmountAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedString");
       return fmtMgr.formatBigInteger(this.getAmount(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedString");
       throw x;
     }
   }
  /** Sets the Amount field from a formatted string
   *
   * @param _value the Amount field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
   public void setAmountFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAmount(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("Amount");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedString");
   }

  /**
   * Retrieves the Amount field value as a formatted currency string
   *
   * @param _locale locale settings used to format text based display values
   * @return The Amount field value in formatted currency form
   * @throws ServiceException thrown if an error occurs formatting the data for the Amount field
   */
  public String getAmountAsFormattedCurrencyString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAmountAsFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAmountAsFormattedCurrencyString");
      return fmtMgr.formatCurrency(this.getAmount(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getAmountAsFormattedCurrencyString");
      throw excp;
    }
  }
  /**
   * Sets the Amount field value from a formatted currency string
   *
   * @param _value the Amount field value in formatted currency form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the Amount field
   */
  public void setAmountFromFormattedCurrencyString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setAmountFromFormattedCurrencyString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setAmount(fmtMgr.parseCurrency(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("Amount");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setAmountFromFormattedCurrencyString");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAmountFromFormattedCurrencyString");
  }

  /** get the value of the field: Amount (PAYMENT_TRANS.amount)
   * @return BigInteger the value
   */
  public BigInteger getAmount () {
    return this.Amount;
  }
  /** Change the field to not being actively set: Amount (PAYMENT_TRANS.amount)
   */
  public void unsetAmount () {
    this._AmountSet = false;
  }
  /** See if the field is actively set: Amount (PAYMENT_TRANS.amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmount () {
    return this._AmountSet;
  }
  /** set the fields value: CurrencyCode (PAYMENT_TRANS.currency_code)
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

  /**
   * Retrieves the display value for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */

  public String getCurrencyCodeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getCurrencyCode()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated CurrencyCode field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the CurrencyCode field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the CurrencyCode field
   */
  public Enumeration getCurrencyCodeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCurrencyCodeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("Currency", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCurrencyCodeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getCurrencyCodeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated CurrencyCode field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setCurrencyCodeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getCurrencyCodeEnumeration(_locale);
      this.setCurrencyCode((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("CurrencyCode");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setCurrencyCodeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setCurrencyCodeFromDisplayValue");
  }

  /** get the value of the field: CurrencyCode (PAYMENT_TRANS.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (PAYMENT_TRANS.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (PAYMENT_TRANS.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: EftTransType (PAYMENT_TRANS.trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EftTransType") 
  public void setEftTransType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EftTransType", "setEftTransType");
    }
    this.EftTransType = value;
    this._EftTransTypeSet = true;
  }

  /** Retrieves the EftTransType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EftTransType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EftTransType field
   */
   public String getEftTransTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getEftTransType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EftTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEftTransTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the EftTransType field from a formatted string
   *
   * @param _value the EftTransType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EftTransType field
   */
   public void setEftTransTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEftTransType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EftTransType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEftTransTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEftTransTypeFromFormattedString");
   }

  /** get the value of the field: EftTransType (PAYMENT_TRANS.trans_type)
   * @return Integer the value
   */
  public Integer getEftTransType () {
    return this.EftTransType;
  }
  /** Change the field to not being actively set: EftTransType (PAYMENT_TRANS.trans_type)
   */
  public void unsetEftTransType () {
    this._EftTransTypeSet = false;
  }
  /** See if the field is actively set: EftTransType (PAYMENT_TRANS.trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetEftTransType () {
    return this._EftTransTypeSet;
  }
  /** set the fields value: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("BmfTransType") 
  public void setBmfTransType (Integer value) throws ServiceException
  {
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

  /**
   * Retrieves the display value for the enumerated BmfTransType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The display value for the BmfTransType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BmfTransType field
   */

  public String getBmfTransTypeDisplayValue(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBmfTransTypeEnumeration(_locale);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeDisplayValue");
      return fmtMgr.formatString(enumeration.getEnumerationValue(this.getBmfTransType()));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeDisplayValue");
      throw excp;
    }
  }
  /**
   * Retrieves the enumerated data set for the enumerated BmfTransType field
   *
   * @param _locale locale settings used to determine the language for text based display values
   * @return The enumerated data set for the BmfTransType field
   * @throws ServiceException thrown if an error occurs accessing the enumerated data for the BmfTransType field
   */
  public Enumeration getBmfTransTypeEnumeration(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getBmfTransTypeEnumeration");
    EnumerationFilter enumFilter = null;

    try {
      EnumeratedDataMgr enumMgr = EnumeratedDataMgr.getInstance();
      Enumeration enumeration = enumMgr.getEnumeration("PaymentType", _locale, enumFilter, false);
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getBmfTransTypeEnumeration");
      return enumeration;
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getBmfTransTypeEnumeration");
      throw excp;
    }
  }
  /**
   * Sets data for the enumerated BmfTransType field based on a display value
   *
   * @param _value display value
   * @param _locale locale settings used to determine the language for text based display values
   * @throws ServiceException thrown if invalid data is set in the BalanceAccountExternalIdType field
   */
  public void setBmfTransTypeFromDisplayValue(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFromDisplayValue");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      Enumeration enumeration = getBmfTransTypeEnumeration(_locale);
      this.setBmfTransType((Integer)(enumeration.getEnumerationCode(fmtMgr.parseString(_value), Integer.class)));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("BmfTransType");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setBmfTransTypeFromDisplayValue");
      throw excp;
    }
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setBmfTransTypeFromDisplayValue");
  }

  /** get the value of the field: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * @return Integer the value
   */
  public Integer getBmfTransType () {
    return this.BmfTransType;
  }
  /** Change the field to not being actively set: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   */
  public void unsetBmfTransType () {
    this._BmfTransTypeSet = false;
  }
  /** See if the field is actively set: BmfTransType (PAYMENT_TRANS.bmf_trans_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetBmfTransType () {
    return this._BmfTransTypeSet;
  }
  /** set the fields value: EftTransStatus (PAYMENT_TRANS.trans_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EftTransStatus") 
  public void setEftTransStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EftTransStatus", "setEftTransStatus");
    }
    this.EftTransStatus = value;
    this._EftTransStatusSet = true;
  }

  /** Retrieves the EftTransStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EftTransStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EftTransStatus field
   */
   public String getEftTransStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEftTransStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getEftTransStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EftTransStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEftTransStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the EftTransStatus field from a formatted string
   *
   * @param _value the EftTransStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EftTransStatus field
   */
   public void setEftTransStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEftTransStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEftTransStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EftTransStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEftTransStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEftTransStatusFromFormattedString");
   }

  /** get the value of the field: EftTransStatus (PAYMENT_TRANS.trans_status)
   * @return Integer the value
   */
  public Integer getEftTransStatus () {
    return this.EftTransStatus;
  }
  /** Change the field to not being actively set: EftTransStatus (PAYMENT_TRANS.trans_status)
   */
  public void unsetEftTransStatus () {
    this._EftTransStatusSet = false;
  }
  /** See if the field is actively set: EftTransStatus (PAYMENT_TRANS.trans_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetEftTransStatus () {
    return this._EftTransStatusSet;
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
  public String toString() {
    return EftTransactionObjectHelper.toMap(this, null).toString();
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
  /** PAYMENT_PROFILE.bank_agency_name field */
    if(!nonNullOnly || (BankAgencyName != null))  _BankAgencyNameSet = flag;
  /** PAYMENT_PROFILE.bank_agency_code field */
    if(!nonNullOnly || (BankAgencyCode != null))  _BankAgencyCodeSet = flag;
  /** PAYMENT_PROFILE.cust_bank_sort_code field */
    if(!nonNullOnly || (CustBankSortCode != null))  _CustBankSortCodeSet = flag;
  /** PAYMENT_PROFILE.cust_bank_acc_num field */
    if(!nonNullOnly || (CustBankAccNum != null))  _CustBankAccNumSet = flag;
  /** PAYMENT_PROFILE.ownr_lname field */
    if(!nonNullOnly || (OwnrLname != null))  _OwnrLnameSet = flag;
  /** PAYMENT_PROFILE.ownr_fname field */
    if(!nonNullOnly || (OwnrFname != null))  _OwnrFnameSet = flag;
  /** PAYMENT_PROFILE.mandate_id field */
    if(!nonNullOnly || (MandateId != null))  _MandateIdSet = flag;
  /** PAYMENT_PROFILE.mandate_sign_date field */
    if(!nonNullOnly || (MandateSignDate != null))  _MandateSignDateSet = flag;
  /** PAYMENT_PROFILE.mandate_status field */
    if(!nonNullOnly || (MandateStatus != null))  _MandateStatusSet = flag;
  /** PAYMENT_PROFILE.cust_bank_iban field */
    if(!nonNullOnly || (CustBankIban != null))  _CustBankIbanSet = flag;
  /** PAYMENT_PROFILE.cust_bank_bic field */
    if(!nonNullOnly || (CustBankBic != null))  _CustBankBicSet = flag;
  /** PAYMENT_PROFILE.diff_acct_own_flag field */
    if(!nonNullOnly || (DiffAcctOwnFlag != null))  _DiffAcctOwnFlagSet = flag;
  /** PAYMENT_PROFILE.cust_bank_acc_owner field */
    if(!nonNullOnly || (CustBankAccOwner != null))  _CustBankAccOwnerSet = flag;
  /** PAYMENT_PROFILE.sequence_type field */
    if(!nonNullOnly || (SequenceType != null))  _SequenceTypeSet = flag;
  /** PAYMENT_PROFILE.cust_bank_iban_hist field */
    if(!nonNullOnly || (CustBankIbanHist != null))  _CustBankIbanHistSet = flag;
  /** PAYMENT_PROFILE.cust_bank_bic_hist field */
    if(!nonNullOnly || (CustBankBicHist != null))  _CustBankBicHistSet = flag;
  /** PAYMENT_PROFILE.mandate_reset field */
    if(!nonNullOnly || (MandateReset != null))  _MandateResetSet = flag;
  /** PAYMENT_TRANS.chg_date field */
    if(!nonNullOnly || (ChgDate != null))  _ChgDateSet = flag;
  /** PAYMENT_TRANS.response_code field */
    if(!nonNullOnly || (ResponseCode != null))  _ResponseCodeSet = flag;
  /** PAYMENT_TRANS.clearing_house_id field */
    if(!nonNullOnly || (ClearingHouseId != null))  _ClearingHouseIdSet = flag;
  /** PAYMENT_TRANS.file_id field */
    if(!nonNullOnly || (FileId != null))  _FileIdSet = flag;
  /** PAYMENT_TRANS.pmt_tracking_id field */
    if(!nonNullOnly || (BmfTrackingId != null))  _BmfTrackingIdSet = flag;
  /** PAYMENT_TRANS.pmt_tracking_id_serv field */
    if(!nonNullOnly || (BmfTrackingIdServ != null))  _BmfTrackingIdServSet = flag;
  /** PAYMENT_TRANS.orig_tracking_id field */
    if(!nonNullOnly || (OrigTrackingId != null))  _OrigTrackingIdSet = flag;
  /** PAYMENT_TRANS.orig_tracking_id_serv field */
    if(!nonNullOnly || (OrigTrackingIdServ != null))  _OrigTrackingIdServSet = flag;
  /** PAYMENT_TRANS.pmt_req_sent_counter field */
    if(!nonNullOnly || (PmtReqSentCounter != null))  _PmtReqSentCounterSet = flag;
  /** PAYMENT_TRANS.no_bill field */
    if(!nonNullOnly || (NoBill != null))  _NoBillSet = flag;
  /** PAYMENT_TRANS.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** PAYMENT_TRANS.bill_ref_no field */
    if(!nonNullOnly || (BillRefNo != null))  _BillRefNoSet = flag;
  /** PAYMENT_TRANS.bill_ref_resets field */
    if(!nonNullOnly || (BillRefResets != null))  _BillRefResetsSet = flag;
  /** PAYMENT_TRANS.payment_due_date field */
    if(!nonNullOnly || (PaymentDueDate != null))  _PaymentDueDateSet = flag;
  /** PAYMENT_TRANS.statement_date field */
    if(!nonNullOnly || (StatementDate != null))  _StatementDateSet = flag;
  /** PAYMENT_TRANS.amount field */
    if(!nonNullOnly || (Amount != null))  _AmountSet = flag;
  /** PAYMENT_TRANS.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** PAYMENT_TRANS.trans_type field */
    if(!nonNullOnly || (EftTransType != null))  _EftTransTypeSet = flag;
  /** PAYMENT_TRANS.bmf_trans_type field */
    if(!nonNullOnly || (BmfTransType != null))  _BmfTransTypeSet = flag;
  /** PAYMENT_TRANS.trans_status field */
    if(!nonNullOnly || (EftTransStatus != null))  _EftTransStatusSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  }
}
