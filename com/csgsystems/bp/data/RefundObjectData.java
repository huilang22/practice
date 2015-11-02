/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RefundObjectData.java
 * Definition File: Customer/Refund.xml
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
  
/** RefundObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class RefundObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public RefundObjectKeyData Key = null;
  /** REFUND.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** REFUND.orig_submitter_name field */
  public    String OrigSubmitterName  = null;
  protected boolean _OrigSubmitterNameSet = false;
  /** REFUND.request_date field */
  public    Date RequestDate  = null;
  protected boolean _RequestDateSet = false;
  /** REFUND.refund_reason_code field */
  public    Integer RefundReasonCode  = null;
  protected boolean _RefundReasonCodeSet = false;
  /** REFUND.amount field */
  public    BigInteger Amount  = null;
  protected boolean _AmountSet = false;
  /** REFUND.refund_status field */
  public    Integer RefundStatus  = null;
  protected boolean _RefundStatusSet = false;
  /** REFUND.refund_type field */
  public    Integer RefundType  = null;
  protected boolean _RefundTypeSet = false;
  /** REFUND.supervisor_name field */
  public    String SupervisorName  = null;
  protected boolean _SupervisorNameSet = false;
  /** REFUND.review_date field */
  public    Date ReviewDate  = null;
  protected boolean _ReviewDateSet = false;
  /** REFUND.payee_last field */
  public    String PayeeLast  = null;
  protected boolean _PayeeLastSet = false;
  /** REFUND.payee_first field */
  public    String PayeeFirst  = null;
  protected boolean _PayeeFirstSet = false;
  /** REFUND.payee_company field */
  public    String PayeeCompany  = null;
  protected boolean _PayeeCompanySet = false;
  /** REFUND.payee_address1 field */
  public    String PayeeAddress1  = null;
  protected boolean _PayeeAddress1Set = false;
  /** REFUND.payee_address2 field */
  public    String PayeeAddress2  = null;
  protected boolean _PayeeAddress2Set = false;
  /** REFUND.payee_address3 field */
  public    String PayeeAddress3  = null;
  protected boolean _PayeeAddress3Set = false;
  /** REFUND.payee_city field */
  public    String PayeeCity  = null;
  protected boolean _PayeeCitySet = false;
  /** REFUND.payee_state field */
  public    String PayeeState  = null;
  protected boolean _PayeeStateSet = false;
  /** REFUND.payee_zip field */
  public    String PayeeZip  = null;
  protected boolean _PayeeZipSet = false;
  /** REFUND.payee_country_code field */
  public    Integer PayeeCountryCode  = null;
  protected boolean _PayeeCountryCodeSet = false;
  /** REFUND.payee_geocode field */
  public    String PayeeGeocode  = null;
  protected boolean _PayeeGeocodeSet = false;
  /** REFUND.payee_county field */
  public    String PayeeCounty  = null;
  protected boolean _PayeeCountySet = false;
  /** REFUND.treasury_date field */
  public    Date TreasuryDate  = null;
  protected boolean _TreasuryDateSet = false;
  /** REFUND.check_num field */
  public    String CheckNum  = null;
  protected boolean _CheckNumSet = false;
  /** REFUND.profile_id field */
  public    BigInteger ProfileId  = null;
  protected boolean _ProfileIdSet = false;
  /** REFUND.currency_code field */
  public    Integer CurrencyCode  = null;
  protected boolean _CurrencyCodeSet = false;
  /** REFUND.last_reviewed_name field */
  public    String LastReviewedName  = null;
  protected boolean _LastReviewedNameSet = false;
  /** REFUND.open_item_id field */
  public    Integer OpenItemId  = null;
  protected boolean _OpenItemIdSet = false;
  /** REFUND.alt_contact_id field */
  public    Integer AltContactId  = null;
  protected boolean _AltContactIdSet = false;
  /** REFUND.alt_currency_code field */
  public    Integer AltCurrencyCode  = null;
  protected boolean _AltCurrencyCodeSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** CUSTOMER_ID_ACCT_MAP.is_current field */
  public    Boolean IsCurrent  = null;
  protected boolean _IsCurrentSet = false;
  /** CUSTOMER_ID_ACCT_MAP.active_date field */
  public    Date ActiveDate  = null;
  protected boolean _ActiveDateSet = false;
  /** CUSTOMER_ID_ACCT_MAP.inactive_date field */
  public    Date InactiveDate  = null;
  protected boolean _InactiveDateSet = false;
  private String _objName = "RefundObjectData";
  /** Default constructor */
  public RefundObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public RefundObjectData (RefundObjectData other)
  {

    if (other == null) return;
    this.Key = new RefundObjectKeyData (other.Key);
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.OrigSubmitterName = other.OrigSubmitterName;
    this._OrigSubmitterNameSet = other._OrigSubmitterNameSet;
    this.RequestDate = other.RequestDate;
    this._RequestDateSet = other._RequestDateSet;
    this.RefundReasonCode = other.RefundReasonCode;
    this._RefundReasonCodeSet = other._RefundReasonCodeSet;
    this.Amount = other.Amount;
    this._AmountSet = other._AmountSet;
    this.RefundStatus = other.RefundStatus;
    this._RefundStatusSet = other._RefundStatusSet;
    this.RefundType = other.RefundType;
    this._RefundTypeSet = other._RefundTypeSet;
    this.SupervisorName = other.SupervisorName;
    this._SupervisorNameSet = other._SupervisorNameSet;
    this.ReviewDate = other.ReviewDate;
    this._ReviewDateSet = other._ReviewDateSet;
    this.PayeeLast = other.PayeeLast;
    this._PayeeLastSet = other._PayeeLastSet;
    this.PayeeFirst = other.PayeeFirst;
    this._PayeeFirstSet = other._PayeeFirstSet;
    this.PayeeCompany = other.PayeeCompany;
    this._PayeeCompanySet = other._PayeeCompanySet;
    this.PayeeAddress1 = other.PayeeAddress1;
    this._PayeeAddress1Set = other._PayeeAddress1Set;
    this.PayeeAddress2 = other.PayeeAddress2;
    this._PayeeAddress2Set = other._PayeeAddress2Set;
    this.PayeeAddress3 = other.PayeeAddress3;
    this._PayeeAddress3Set = other._PayeeAddress3Set;
    this.PayeeCity = other.PayeeCity;
    this._PayeeCitySet = other._PayeeCitySet;
    this.PayeeState = other.PayeeState;
    this._PayeeStateSet = other._PayeeStateSet;
    this.PayeeZip = other.PayeeZip;
    this._PayeeZipSet = other._PayeeZipSet;
    this.PayeeCountryCode = other.PayeeCountryCode;
    this._PayeeCountryCodeSet = other._PayeeCountryCodeSet;
    this.PayeeGeocode = other.PayeeGeocode;
    this._PayeeGeocodeSet = other._PayeeGeocodeSet;
    this.PayeeCounty = other.PayeeCounty;
    this._PayeeCountySet = other._PayeeCountySet;
    this.TreasuryDate = other.TreasuryDate;
    this._TreasuryDateSet = other._TreasuryDateSet;
    this.CheckNum = other.CheckNum;
    this._CheckNumSet = other._CheckNumSet;
    this.ProfileId = other.ProfileId;
    this._ProfileIdSet = other._ProfileIdSet;
    this.CurrencyCode = other.CurrencyCode;
    this._CurrencyCodeSet = other._CurrencyCodeSet;
    this.LastReviewedName = other.LastReviewedName;
    this._LastReviewedNameSet = other._LastReviewedNameSet;
    this.OpenItemId = other.OpenItemId;
    this._OpenItemIdSet = other._OpenItemIdSet;
    this.AltContactId = other.AltContactId;
    this._AltContactIdSet = other._AltContactIdSet;
    this.AltCurrencyCode = other.AltCurrencyCode;
    this._AltCurrencyCodeSet = other._AltCurrencyCodeSet;
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.IsCurrent = other.IsCurrent;
    this._IsCurrentSet = other._IsCurrentSet;
    this.ActiveDate = other.ActiveDate;
    this._ActiveDateSet = other._ActiveDateSet;
    this.InactiveDate = other.InactiveDate;
    this._InactiveDateSet = other._InactiveDateSet;
  }

  /** get the Key for this object
   * @return RefundObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public RefundObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (RefundObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (REFUND.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new RefundObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (REFUND.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (REFUND.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (REFUND.tracking_id)
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

  /** set the fields value: TrackingIdServ (REFUND.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new RefundObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (REFUND.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (REFUND.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (REFUND.tracking_id_serv)
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

  /** set the fields value: AccountInternalId (REFUND.account_no)
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

  /** get the value of the field: AccountInternalId (REFUND.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (REFUND.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (REFUND.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: OrigSubmitterName (REFUND.orig_submitter_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OrigSubmitterName") 
  public void setOrigSubmitterName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OrigSubmitterName", "setOrigSubmitterName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "OrigSubmitterName", "setOrigSubmitterName");
    }
    this.OrigSubmitterName = value;
    this._OrigSubmitterNameSet = true;
  }

  /** Retrieves the OrigSubmitterName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OrigSubmitterName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OrigSubmitterName field
   */
   public String getOrigSubmitterNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSubmitterNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOrigSubmitterNameAsFormattedString");
       return fmtMgr.formatString(this.getOrigSubmitterName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigSubmitterName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOrigSubmitterNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the OrigSubmitterName field from a formatted string
   *
   * @param _value the OrigSubmitterName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OrigSubmitterName field
   */
   public void setOrigSubmitterNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOrigSubmitterNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOrigSubmitterName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OrigSubmitterName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOrigSubmitterNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOrigSubmitterNameFromFormattedString");
   }

  /** get the value of the field: OrigSubmitterName (REFUND.orig_submitter_name)
   * @return String the value
   */
  public String getOrigSubmitterName () {
    return this.OrigSubmitterName;
  }
  /** Change the field to not being actively set: OrigSubmitterName (REFUND.orig_submitter_name)
   */
  public void unsetOrigSubmitterName () {
    this._OrigSubmitterNameSet = false;
  }
  /** See if the field is actively set: OrigSubmitterName (REFUND.orig_submitter_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetOrigSubmitterName () {
    return this._OrigSubmitterNameSet;
  }
  /** set the fields value: RequestDate (REFUND.request_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RequestDate") 
  public void setRequestDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RequestDate", "setRequestDate");
    }
    this.RequestDate = value;
    this._RequestDateSet = true;
  }

  /** Retrieves the RequestDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RequestDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestDate field
   */
   public String getRequestDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestDateAsFormattedString");
       return fmtMgr.formatDate(this.getRequestDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RequestDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the RequestDate field from a formatted string
   *
   * @param _value the RequestDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RequestDate field
   */
   public void setRequestDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRequestDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RequestDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRequestDateFromFormattedString");
   }

  /**
   * Retrieves the RequestDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The RequestDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the RequestDate field
   */
  public String getRequestDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRequestDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRequestDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getRequestDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getRequestDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the RequestDate field value from a formatted date/time string
   *
   * @param _value the RequestDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RequestDate field
   */
  public void setRequestDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setRequestDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setRequestDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("RequestDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setRequestDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: RequestDate (REFUND.request_date)
   * @return Date the value
   */
  public Date getRequestDate () {
    return this.RequestDate;
  }
  /** Change the field to not being actively set: RequestDate (REFUND.request_date)
   */
  public void unsetRequestDate () {
    this._RequestDateSet = false;
  }
  /** See if the field is actively set: RequestDate (REFUND.request_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetRequestDate () {
    return this._RequestDateSet;
  }
  /** set the fields value: RefundReasonCode (REFUND.refund_reason_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RefundReasonCode") 
  public void setRefundReasonCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RefundReasonCode", "setRefundReasonCode");
    }
    this.RefundReasonCode = value;
    this._RefundReasonCodeSet = true;
  }

  /** Retrieves the RefundReasonCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RefundReasonCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefundReasonCode field
   */
   public String getRefundReasonCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundReasonCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundReasonCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getRefundReasonCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefundReasonCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RefundReasonCode field from a formatted string
   *
   * @param _value the RefundReasonCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RefundReasonCode field
   */
   public void setRefundReasonCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundReasonCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRefundReasonCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundReasonCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefundReasonCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefundReasonCodeFromFormattedString");
   }

  /** get the value of the field: RefundReasonCode (REFUND.refund_reason_code)
   * @return Integer the value
   */
  public Integer getRefundReasonCode () {
    return this.RefundReasonCode;
  }
  /** Change the field to not being actively set: RefundReasonCode (REFUND.refund_reason_code)
   */
  public void unsetRefundReasonCode () {
    this._RefundReasonCodeSet = false;
  }
  /** See if the field is actively set: RefundReasonCode (REFUND.refund_reason_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetRefundReasonCode () {
    return this._RefundReasonCodeSet;
  }
  /** set the fields value: Amount (REFUND.amount)
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

  /** get the value of the field: Amount (REFUND.amount)
   * @return BigInteger the value
   */
  public BigInteger getAmount () {
    return this.Amount;
  }
  /** Change the field to not being actively set: Amount (REFUND.amount)
   */
  public void unsetAmount () {
    this._AmountSet = false;
  }
  /** See if the field is actively set: Amount (REFUND.amount)
   * @return boolean whether the field is actively set
   */
  public boolean issetAmount () {
    return this._AmountSet;
  }
  /** set the fields value: RefundStatus (REFUND.refund_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RefundStatus") 
  public void setRefundStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RefundStatus", "setRefundStatus");
    }
    this.RefundStatus = value;
    this._RefundStatusSet = true;
  }

  /** Retrieves the RefundStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RefundStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefundStatus field
   */
   public String getRefundStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getRefundStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefundStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the RefundStatus field from a formatted string
   *
   * @param _value the RefundStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RefundStatus field
   */
   public void setRefundStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRefundStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefundStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefundStatusFromFormattedString");
   }

  /** get the value of the field: RefundStatus (REFUND.refund_status)
   * @return Integer the value
   */
  public Integer getRefundStatus () {
    return this.RefundStatus;
  }
  /** Change the field to not being actively set: RefundStatus (REFUND.refund_status)
   */
  public void unsetRefundStatus () {
    this._RefundStatusSet = false;
  }
  /** See if the field is actively set: RefundStatus (REFUND.refund_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetRefundStatus () {
    return this._RefundStatusSet;
  }
  /** set the fields value: RefundType (REFUND.refund_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RefundType") 
  public void setRefundType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RefundType", "setRefundType");
    }
    this.RefundType = value;
    this._RefundTypeSet = true;
  }

  /** Retrieves the RefundType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RefundType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RefundType field
   */
   public String getRefundTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRefundTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getRefundType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRefundTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RefundType field from a formatted string
   *
   * @param _value the RefundType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RefundType field
   */
   public void setRefundTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRefundTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRefundType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RefundType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRefundTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRefundTypeFromFormattedString");
   }

  /** get the value of the field: RefundType (REFUND.refund_type)
   * @return Integer the value
   */
  public Integer getRefundType () {
    return this.RefundType;
  }
  /** Change the field to not being actively set: RefundType (REFUND.refund_type)
   */
  public void unsetRefundType () {
    this._RefundTypeSet = false;
  }
  /** See if the field is actively set: RefundType (REFUND.refund_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetRefundType () {
    return this._RefundTypeSet;
  }
  /** set the fields value: SupervisorName (REFUND.supervisor_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SupervisorName") 
  public void setSupervisorName (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SupervisorName", "setSupervisorName");
    }
    this.SupervisorName = value;
    this._SupervisorNameSet = true;
  }

  /** Retrieves the SupervisorName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SupervisorName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SupervisorName field
   */
   public String getSupervisorNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSupervisorNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSupervisorNameAsFormattedString");
       return fmtMgr.formatString(this.getSupervisorName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SupervisorName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSupervisorNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the SupervisorName field from a formatted string
   *
   * @param _value the SupervisorName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SupervisorName field
   */
   public void setSupervisorNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSupervisorNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSupervisorName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SupervisorName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSupervisorNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSupervisorNameFromFormattedString");
   }

  /** get the value of the field: SupervisorName (REFUND.supervisor_name)
   * @return String the value
   */
  public String getSupervisorName () {
    return this.SupervisorName;
  }
  /** Change the field to not being actively set: SupervisorName (REFUND.supervisor_name)
   */
  public void unsetSupervisorName () {
    this._SupervisorNameSet = false;
  }
  /** See if the field is actively set: SupervisorName (REFUND.supervisor_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetSupervisorName () {
    return this._SupervisorNameSet;
  }
  /** set the fields value: ReviewDate (REFUND.review_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ReviewDate") 
  public void setReviewDate (Date value) throws ServiceException
  {
    this.ReviewDate = value;
    this._ReviewDateSet = true;
  }

  /** Retrieves the ReviewDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ReviewDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReviewDate field
   */
   public String getReviewDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReviewDateAsFormattedString");
       return fmtMgr.formatDate(this.getReviewDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReviewDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getReviewDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ReviewDate field from a formatted string
   *
   * @param _value the ReviewDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReviewDate field
   */
   public void setReviewDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setReviewDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReviewDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setReviewDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReviewDateFromFormattedString");
   }

  /**
   * Retrieves the ReviewDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ReviewDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReviewDate field
   */
  public String getReviewDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReviewDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReviewDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getReviewDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getReviewDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ReviewDate field value from a formatted date/time string
   *
   * @param _value the ReviewDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReviewDate field
   */
  public void setReviewDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setReviewDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setReviewDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ReviewDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setReviewDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ReviewDate (REFUND.review_date)
   * @return Date the value
   */
  public Date getReviewDate () {
    return this.ReviewDate;
  }
  /** Change the field to not being actively set: ReviewDate (REFUND.review_date)
   */
  public void unsetReviewDate () {
    this._ReviewDateSet = false;
  }
  /** See if the field is actively set: ReviewDate (REFUND.review_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetReviewDate () {
    return this._ReviewDateSet;
  }
  /** set the fields value: PayeeLast (REFUND.payee_last)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeLast") 
  public void setPayeeLast (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeLast", "setPayeeLast");
    }
    this.PayeeLast = value;
    this._PayeeLastSet = true;
  }

  /** Retrieves the PayeeLast field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeLast field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeLast field
   */
   public String getPayeeLastAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeLastAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeLastAsFormattedString");
       return fmtMgr.formatString(this.getPayeeLast());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeLast");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeLastAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeLast field from a formatted string
   *
   * @param _value the PayeeLast field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeLast field
   */
   public void setPayeeLastFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeLastFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeLast(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeLast");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeLastFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeLastFromFormattedString");
   }

  /** get the value of the field: PayeeLast (REFUND.payee_last)
   * @return String the value
   */
  public String getPayeeLast () {
    return this.PayeeLast;
  }
  /** Change the field to not being actively set: PayeeLast (REFUND.payee_last)
   */
  public void unsetPayeeLast () {
    this._PayeeLastSet = false;
  }
  /** See if the field is actively set: PayeeLast (REFUND.payee_last)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeLast () {
    return this._PayeeLastSet;
  }
  /** set the fields value: PayeeFirst (REFUND.payee_first)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeFirst") 
  public void setPayeeFirst (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeFirst", "setPayeeFirst");
    }
    this.PayeeFirst = value;
    this._PayeeFirstSet = true;
  }

  /** Retrieves the PayeeFirst field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeFirst field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeFirst field
   */
   public String getPayeeFirstAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeFirstAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeFirstAsFormattedString");
       return fmtMgr.formatString(this.getPayeeFirst());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeFirst");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeFirstAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeFirst field from a formatted string
   *
   * @param _value the PayeeFirst field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeFirst field
   */
   public void setPayeeFirstFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeFirstFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeFirst(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeFirst");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeFirstFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeFirstFromFormattedString");
   }

  /** get the value of the field: PayeeFirst (REFUND.payee_first)
   * @return String the value
   */
  public String getPayeeFirst () {
    return this.PayeeFirst;
  }
  /** Change the field to not being actively set: PayeeFirst (REFUND.payee_first)
   */
  public void unsetPayeeFirst () {
    this._PayeeFirstSet = false;
  }
  /** See if the field is actively set: PayeeFirst (REFUND.payee_first)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeFirst () {
    return this._PayeeFirstSet;
  }
  /** set the fields value: PayeeCompany (REFUND.payee_company)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeCompany") 
  public void setPayeeCompany (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 56))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeCompany", "setPayeeCompany");
    }
    this.PayeeCompany = value;
    this._PayeeCompanySet = true;
  }

  /** Retrieves the PayeeCompany field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeCompany field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeCompany field
   */
   public String getPayeeCompanyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCompanyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeCompanyAsFormattedString");
       return fmtMgr.formatString(this.getPayeeCompany());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeCompanyAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeCompany field from a formatted string
   *
   * @param _value the PayeeCompany field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeCompany field
   */
   public void setPayeeCompanyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCompanyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeCompany(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeCompany");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeCompanyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeCompanyFromFormattedString");
   }

  /** get the value of the field: PayeeCompany (REFUND.payee_company)
   * @return String the value
   */
  public String getPayeeCompany () {
    return this.PayeeCompany;
  }
  /** Change the field to not being actively set: PayeeCompany (REFUND.payee_company)
   */
  public void unsetPayeeCompany () {
    this._PayeeCompanySet = false;
  }
  /** See if the field is actively set: PayeeCompany (REFUND.payee_company)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeCompany () {
    return this._PayeeCompanySet;
  }
  /** set the fields value: PayeeAddress1 (REFUND.payee_address1)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeAddress1") 
  public void setPayeeAddress1 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeAddress1", "setPayeeAddress1");
    }
    this.PayeeAddress1 = value;
    this._PayeeAddress1Set = true;
  }

  /** Retrieves the PayeeAddress1 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeAddress1 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeAddress1 field
   */
   public String getPayeeAddress1AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeAddress1AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeAddress1AsFormattedString");
       return fmtMgr.formatString(this.getPayeeAddress1());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeAddress1AsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeAddress1 field from a formatted string
   *
   * @param _value the PayeeAddress1 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeAddress1 field
   */
   public void setPayeeAddress1FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeAddress1FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeAddress1(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeAddress1");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeAddress1FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeAddress1FromFormattedString");
   }

  /** get the value of the field: PayeeAddress1 (REFUND.payee_address1)
   * @return String the value
   */
  public String getPayeeAddress1 () {
    return this.PayeeAddress1;
  }
  /** Change the field to not being actively set: PayeeAddress1 (REFUND.payee_address1)
   */
  public void unsetPayeeAddress1 () {
    this._PayeeAddress1Set = false;
  }
  /** See if the field is actively set: PayeeAddress1 (REFUND.payee_address1)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeAddress1 () {
    return this._PayeeAddress1Set;
  }
  /** set the fields value: PayeeAddress2 (REFUND.payee_address2)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeAddress2") 
  public void setPayeeAddress2 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeAddress2", "setPayeeAddress2");
    }
    this.PayeeAddress2 = value;
    this._PayeeAddress2Set = true;
  }

  /** Retrieves the PayeeAddress2 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeAddress2 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeAddress2 field
   */
   public String getPayeeAddress2AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeAddress2AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeAddress2AsFormattedString");
       return fmtMgr.formatString(this.getPayeeAddress2());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeAddress2AsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeAddress2 field from a formatted string
   *
   * @param _value the PayeeAddress2 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeAddress2 field
   */
   public void setPayeeAddress2FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeAddress2FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeAddress2(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeAddress2");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeAddress2FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeAddress2FromFormattedString");
   }

  /** get the value of the field: PayeeAddress2 (REFUND.payee_address2)
   * @return String the value
   */
  public String getPayeeAddress2 () {
    return this.PayeeAddress2;
  }
  /** Change the field to not being actively set: PayeeAddress2 (REFUND.payee_address2)
   */
  public void unsetPayeeAddress2 () {
    this._PayeeAddress2Set = false;
  }
  /** See if the field is actively set: PayeeAddress2 (REFUND.payee_address2)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeAddress2 () {
    return this._PayeeAddress2Set;
  }
  /** set the fields value: PayeeAddress3 (REFUND.payee_address3)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeAddress3") 
  public void setPayeeAddress3 (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 75))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeAddress3", "setPayeeAddress3");
    }
    this.PayeeAddress3 = value;
    this._PayeeAddress3Set = true;
  }

  /** Retrieves the PayeeAddress3 field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeAddress3 field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeAddress3 field
   */
   public String getPayeeAddress3AsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeAddress3AsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeAddress3AsFormattedString");
       return fmtMgr.formatString(this.getPayeeAddress3());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeAddress3AsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeAddress3 field from a formatted string
   *
   * @param _value the PayeeAddress3 field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeAddress3 field
   */
   public void setPayeeAddress3FromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeAddress3FromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeAddress3(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeAddress3");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeAddress3FromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeAddress3FromFormattedString");
   }

  /** get the value of the field: PayeeAddress3 (REFUND.payee_address3)
   * @return String the value
   */
  public String getPayeeAddress3 () {
    return this.PayeeAddress3;
  }
  /** Change the field to not being actively set: PayeeAddress3 (REFUND.payee_address3)
   */
  public void unsetPayeeAddress3 () {
    this._PayeeAddress3Set = false;
  }
  /** See if the field is actively set: PayeeAddress3 (REFUND.payee_address3)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeAddress3 () {
    return this._PayeeAddress3Set;
  }
  /** set the fields value: PayeeCity (REFUND.payee_city)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeCity") 
  public void setPayeeCity (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 35))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeCity", "setPayeeCity");
    }
    this.PayeeCity = value;
    this._PayeeCitySet = true;
  }

  /** Retrieves the PayeeCity field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeCity field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeCity field
   */
   public String getPayeeCityAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCityAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeCityAsFormattedString");
       return fmtMgr.formatString(this.getPayeeCity());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeCityAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeCity field from a formatted string
   *
   * @param _value the PayeeCity field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeCity field
   */
   public void setPayeeCityFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCityFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeCity(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeCity");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeCityFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeCityFromFormattedString");
   }

  /** get the value of the field: PayeeCity (REFUND.payee_city)
   * @return String the value
   */
  public String getPayeeCity () {
    return this.PayeeCity;
  }
  /** Change the field to not being actively set: PayeeCity (REFUND.payee_city)
   */
  public void unsetPayeeCity () {
    this._PayeeCitySet = false;
  }
  /** See if the field is actively set: PayeeCity (REFUND.payee_city)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeCity () {
    return this._PayeeCitySet;
  }
  /** set the fields value: PayeeState (REFUND.payee_state)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeState") 
  public void setPayeeState (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeState", "setPayeeState");
    }
    this.PayeeState = value;
    this._PayeeStateSet = true;
  }

  /** Retrieves the PayeeState field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeState field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeState field
   */
   public String getPayeeStateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeStateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeStateAsFormattedString");
       return fmtMgr.formatString(this.getPayeeState());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeStateAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeState field from a formatted string
   *
   * @param _value the PayeeState field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeState field
   */
   public void setPayeeStateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeStateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeState(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeState");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeStateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeStateFromFormattedString");
   }

  /** get the value of the field: PayeeState (REFUND.payee_state)
   * @return String the value
   */
  public String getPayeeState () {
    return this.PayeeState;
  }
  /** Change the field to not being actively set: PayeeState (REFUND.payee_state)
   */
  public void unsetPayeeState () {
    this._PayeeStateSet = false;
  }
  /** See if the field is actively set: PayeeState (REFUND.payee_state)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeState () {
    return this._PayeeStateSet;
  }
  /** set the fields value: PayeeZip (REFUND.payee_zip)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeZip") 
  public void setPayeeZip (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 16))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeZip", "setPayeeZip");
    }
    this.PayeeZip = value;
    this._PayeeZipSet = true;
  }

  /** Retrieves the PayeeZip field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeZip field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeZip field
   */
   public String getPayeeZipAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeZipAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeZipAsFormattedString");
       return fmtMgr.formatString(this.getPayeeZip());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeZipAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeZip field from a formatted string
   *
   * @param _value the PayeeZip field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeZip field
   */
   public void setPayeeZipFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeZipFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeZip(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeZip");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeZipFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeZipFromFormattedString");
   }

  /** get the value of the field: PayeeZip (REFUND.payee_zip)
   * @return String the value
   */
  public String getPayeeZip () {
    return this.PayeeZip;
  }
  /** Change the field to not being actively set: PayeeZip (REFUND.payee_zip)
   */
  public void unsetPayeeZip () {
    this._PayeeZipSet = false;
  }
  /** See if the field is actively set: PayeeZip (REFUND.payee_zip)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeZip () {
    return this._PayeeZipSet;
  }
  /** set the fields value: PayeeCountryCode (REFUND.payee_country_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeCountryCode") 
  public void setPayeeCountryCode (Integer value) throws ServiceException
  {
    this.PayeeCountryCode = value;
    this._PayeeCountryCodeSet = true;
  }

  /** Retrieves the PayeeCountryCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeCountryCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeCountryCode field
   */
   public String getPayeeCountryCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCountryCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeCountryCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getPayeeCountryCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeCountryCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeCountryCode field from a formatted string
   *
   * @param _value the PayeeCountryCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeCountryCode field
   */
   public void setPayeeCountryCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCountryCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeCountryCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeCountryCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeCountryCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeCountryCodeFromFormattedString");
   }

  /** get the value of the field: PayeeCountryCode (REFUND.payee_country_code)
   * @return Integer the value
   */
  public Integer getPayeeCountryCode () {
    return this.PayeeCountryCode;
  }
  /** Change the field to not being actively set: PayeeCountryCode (REFUND.payee_country_code)
   */
  public void unsetPayeeCountryCode () {
    this._PayeeCountryCodeSet = false;
  }
  /** See if the field is actively set: PayeeCountryCode (REFUND.payee_country_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeCountryCode () {
    return this._PayeeCountryCodeSet;
  }
  /** set the fields value: PayeeGeocode (REFUND.payee_geocode)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeGeocode") 
  public void setPayeeGeocode (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeGeocode", "setPayeeGeocode");
    }
    this.PayeeGeocode = value;
    this._PayeeGeocodeSet = true;
  }

  /** Retrieves the PayeeGeocode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeGeocode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeGeocode field
   */
   public String getPayeeGeocodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeGeocodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeGeocodeAsFormattedString");
       return fmtMgr.formatString(this.getPayeeGeocode());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeGeocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeGeocodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeGeocode field from a formatted string
   *
   * @param _value the PayeeGeocode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeGeocode field
   */
   public void setPayeeGeocodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeGeocodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeGeocode(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeGeocode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeGeocodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeGeocodeFromFormattedString");
   }

  /** get the value of the field: PayeeGeocode (REFUND.payee_geocode)
   * @return String the value
   */
  public String getPayeeGeocode () {
    return this.PayeeGeocode;
  }
  /** Change the field to not being actively set: PayeeGeocode (REFUND.payee_geocode)
   */
  public void unsetPayeeGeocode () {
    this._PayeeGeocodeSet = false;
  }
  /** See if the field is actively set: PayeeGeocode (REFUND.payee_geocode)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeGeocode () {
    return this._PayeeGeocodeSet;
  }
  /** set the fields value: PayeeCounty (REFUND.payee_county)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("PayeeCounty") 
  public void setPayeeCounty (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 28))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "PayeeCounty", "setPayeeCounty");
    }
    this.PayeeCounty = value;
    this._PayeeCountySet = true;
  }

  /** Retrieves the PayeeCounty field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The PayeeCounty field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the PayeeCounty field
   */
   public String getPayeeCountyAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCountyAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getPayeeCountyAsFormattedString");
       return fmtMgr.formatString(this.getPayeeCounty());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getPayeeCountyAsFormattedString");
       throw x;
     }
   }
  /** Sets the PayeeCounty field from a formatted string
   *
   * @param _value the PayeeCounty field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the PayeeCounty field
   */
   public void setPayeeCountyFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getPayeeCountyFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setPayeeCounty(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("PayeeCounty");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setPayeeCountyFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setPayeeCountyFromFormattedString");
   }

  /** get the value of the field: PayeeCounty (REFUND.payee_county)
   * @return String the value
   */
  public String getPayeeCounty () {
    return this.PayeeCounty;
  }
  /** Change the field to not being actively set: PayeeCounty (REFUND.payee_county)
   */
  public void unsetPayeeCounty () {
    this._PayeeCountySet = false;
  }
  /** See if the field is actively set: PayeeCounty (REFUND.payee_county)
   * @return boolean whether the field is actively set
   */
  public boolean issetPayeeCounty () {
    return this._PayeeCountySet;
  }
  /** set the fields value: TreasuryDate (REFUND.treasury_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TreasuryDate") 
  public void setTreasuryDate (Date value) throws ServiceException
  {
    this.TreasuryDate = value;
    this._TreasuryDateSet = true;
  }

  /** Retrieves the TreasuryDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TreasuryDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TreasuryDate field
   */
   public String getTreasuryDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTreasuryDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTreasuryDateAsFormattedString");
       return fmtMgr.formatDate(this.getTreasuryDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TreasuryDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTreasuryDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the TreasuryDate field from a formatted string
   *
   * @param _value the TreasuryDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TreasuryDate field
   */
   public void setTreasuryDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTreasuryDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTreasuryDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TreasuryDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTreasuryDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTreasuryDateFromFormattedString");
   }

  /**
   * Retrieves the TreasuryDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The TreasuryDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the TreasuryDate field
   */
  public String getTreasuryDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTreasuryDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTreasuryDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getTreasuryDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TreasuryDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getTreasuryDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the TreasuryDate field value from a formatted date/time string
   *
   * @param _value the TreasuryDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TreasuryDate field
   */
  public void setTreasuryDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setTreasuryDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setTreasuryDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("TreasuryDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setTreasuryDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: TreasuryDate (REFUND.treasury_date)
   * @return Date the value
   */
  public Date getTreasuryDate () {
    return this.TreasuryDate;
  }
  /** Change the field to not being actively set: TreasuryDate (REFUND.treasury_date)
   */
  public void unsetTreasuryDate () {
    this._TreasuryDateSet = false;
  }
  /** See if the field is actively set: TreasuryDate (REFUND.treasury_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTreasuryDate () {
    return this._TreasuryDateSet;
  }
  /** set the fields value: CheckNum (REFUND.check_num)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("CheckNum") 
  public void setCheckNum (String value) throws ServiceException
  {
    if (value != null && !DataHelper.validLength (value, 15))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "CheckNum", "setCheckNum");
    }
    this.CheckNum = value;
    this._CheckNumSet = true;
  }

  /** Retrieves the CheckNum field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The CheckNum field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the CheckNum field
   */
   public String getCheckNumAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCheckNumAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getCheckNumAsFormattedString");
       return fmtMgr.formatString(this.getCheckNum());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CheckNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getCheckNumAsFormattedString");
       throw x;
     }
   }
  /** Sets the CheckNum field from a formatted string
   *
   * @param _value the CheckNum field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the CheckNum field
   */
   public void setCheckNumFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getCheckNumFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setCheckNum(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("CheckNum");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setCheckNumFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setCheckNumFromFormattedString");
   }

  /** get the value of the field: CheckNum (REFUND.check_num)
   * @return String the value
   */
  public String getCheckNum () {
    return this.CheckNum;
  }
  /** Change the field to not being actively set: CheckNum (REFUND.check_num)
   */
  public void unsetCheckNum () {
    this._CheckNumSet = false;
  }
  /** See if the field is actively set: CheckNum (REFUND.check_num)
   * @return boolean whether the field is actively set
   */
  public boolean issetCheckNum () {
    return this._CheckNumSet;
  }
  /** set the fields value: ProfileId (REFUND.profile_id)
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

  /** get the value of the field: ProfileId (REFUND.profile_id)
   * @return BigInteger the value
   */
  public BigInteger getProfileId () {
    return this.ProfileId;
  }
  /** Change the field to not being actively set: ProfileId (REFUND.profile_id)
   */
  public void unsetProfileId () {
    this._ProfileIdSet = false;
  }
  /** See if the field is actively set: ProfileId (REFUND.profile_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetProfileId () {
    return this._ProfileIdSet;
  }
  /** set the fields value: CurrencyCode (REFUND.currency_code)
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

  /** get the value of the field: CurrencyCode (REFUND.currency_code)
   * @return Integer the value
   */
  public Integer getCurrencyCode () {
    return this.CurrencyCode;
  }
  /** Change the field to not being actively set: CurrencyCode (REFUND.currency_code)
   */
  public void unsetCurrencyCode () {
    this._CurrencyCodeSet = false;
  }
  /** See if the field is actively set: CurrencyCode (REFUND.currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetCurrencyCode () {
    return this._CurrencyCodeSet;
  }
  /** set the fields value: LastReviewedName (REFUND.last_reviewed_name)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LastReviewedName") 
  public void setLastReviewedName (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LastReviewedName", "setLastReviewedName");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "LastReviewedName", "setLastReviewedName");
    }
    this.LastReviewedName = value;
    this._LastReviewedNameSet = true;
  }

  /** Retrieves the LastReviewedName field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LastReviewedName field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LastReviewedName field
   */
   public String getLastReviewedNameAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastReviewedNameAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLastReviewedNameAsFormattedString");
       return fmtMgr.formatString(this.getLastReviewedName());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LastReviewedName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLastReviewedNameAsFormattedString");
       throw x;
     }
   }
  /** Sets the LastReviewedName field from a formatted string
   *
   * @param _value the LastReviewedName field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LastReviewedName field
   */
   public void setLastReviewedNameFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLastReviewedNameFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLastReviewedName(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LastReviewedName");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLastReviewedNameFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLastReviewedNameFromFormattedString");
   }

  /** get the value of the field: LastReviewedName (REFUND.last_reviewed_name)
   * @return String the value
   */
  public String getLastReviewedName () {
    return this.LastReviewedName;
  }
  /** Change the field to not being actively set: LastReviewedName (REFUND.last_reviewed_name)
   */
  public void unsetLastReviewedName () {
    this._LastReviewedNameSet = false;
  }
  /** See if the field is actively set: LastReviewedName (REFUND.last_reviewed_name)
   * @return boolean whether the field is actively set
   */
  public boolean issetLastReviewedName () {
    return this._LastReviewedNameSet;
  }
  /** set the fields value: OpenItemId (REFUND.open_item_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OpenItemId") 
  public void setOpenItemId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OpenItemId", "setOpenItemId");
    }
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

  /** get the value of the field: OpenItemId (REFUND.open_item_id)
   * @return Integer the value
   */
  public Integer getOpenItemId () {
    return this.OpenItemId;
  }
  /** Change the field to not being actively set: OpenItemId (REFUND.open_item_id)
   */
  public void unsetOpenItemId () {
    this._OpenItemIdSet = false;
  }
  /** See if the field is actively set: OpenItemId (REFUND.open_item_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetOpenItemId () {
    return this._OpenItemIdSet;
  }
  /** set the fields value: AltContactId (REFUND.alt_contact_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltContactId") 
  public void setAltContactId (Integer value) throws ServiceException
  {
    this.AltContactId = value;
    this._AltContactIdSet = true;
  }

  /** Retrieves the AltContactId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltContactId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltContactId field
   */
   public String getAltContactIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltContactIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltContactIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAltContactId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltContactIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltContactId field from a formatted string
   *
   * @param _value the AltContactId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltContactId field
   */
   public void setAltContactIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltContactIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltContactId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltContactId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltContactIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltContactIdFromFormattedString");
   }

  /** get the value of the field: AltContactId (REFUND.alt_contact_id)
   * @return Integer the value
   */
  public Integer getAltContactId () {
    return this.AltContactId;
  }
  /** Change the field to not being actively set: AltContactId (REFUND.alt_contact_id)
   */
  public void unsetAltContactId () {
    this._AltContactIdSet = false;
  }
  /** See if the field is actively set: AltContactId (REFUND.alt_contact_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltContactId () {
    return this._AltContactIdSet;
  }
  /** set the fields value: AltCurrencyCode (REFUND.alt_currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AltCurrencyCode") 
  public void setAltCurrencyCode (Integer value) throws ServiceException
  {
    this.AltCurrencyCode = value;
    this._AltCurrencyCodeSet = true;
  }

  /** Retrieves the AltCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AltCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AltCurrencyCode field
   */
   public String getAltCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAltCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getAltCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAltCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the AltCurrencyCode field from a formatted string
   *
   * @param _value the AltCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AltCurrencyCode field
   */
   public void setAltCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAltCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAltCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AltCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAltCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAltCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: AltCurrencyCode (REFUND.alt_currency_code)
   * @return Integer the value
   */
  public Integer getAltCurrencyCode () {
    return this.AltCurrencyCode;
  }
  /** Change the field to not being actively set: AltCurrencyCode (REFUND.alt_currency_code)
   */
  public void unsetAltCurrencyCode () {
    this._AltCurrencyCodeSet = false;
  }
  /** See if the field is actively set: AltCurrencyCode (REFUND.alt_currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetAltCurrencyCode () {
    return this._AltCurrencyCodeSet;
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
  /** set the fields value: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IsCurrent") 
  public void setIsCurrent (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IsCurrent", "setIsCurrent");
    }
    this.IsCurrent = value;
    this._IsCurrentSet = true;
  }

  /** Retrieves the IsCurrent field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IsCurrent field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IsCurrent field
   */
   public String getIsCurrentAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCurrentAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIsCurrentAsFormattedString");
       return fmtMgr.formatBoolean(this.getIsCurrent());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsCurrent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIsCurrentAsFormattedString");
       throw x;
     }
   }
  /** Sets the IsCurrent field from a formatted string
   *
   * @param _value the IsCurrent field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IsCurrent field
   */
   public void setIsCurrentFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIsCurrentFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIsCurrent(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IsCurrent");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIsCurrentFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIsCurrentFromFormattedString");
   }

  /** get the value of the field: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return Boolean the value
   */
  public Boolean getIsCurrent () {
    return this.IsCurrent;
  }
  /** Change the field to not being actively set: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   */
  public void unsetIsCurrent () {
    this._IsCurrentSet = false;
  }
  /** See if the field is actively set: IsCurrent (CUSTOMER_ID_ACCT_MAP.is_current)
   * @return boolean whether the field is actively set
   */
  public boolean issetIsCurrent () {
    return this._IsCurrentSet;
  }
  /** set the fields value: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDate") 
  public void setActiveDate (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDate", "setActiveDate");
    }
    this.ActiveDate = value;
    this._ActiveDateSet = true;
  }

  /** Retrieves the ActiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
   public String getActiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDate field from a formatted string
   *
   * @param _value the ActiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
   public void setActiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDateFromFormattedString");
   }

  /**
   * Retrieves the ActiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDate field
   */
  public String getActiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDate field value from a formatted date/time string
   *
   * @param _value the ActiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDate field
   */
  public void setActiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return Date the value
   */
  public Date getActiveDate () {
    return this.ActiveDate;
  }
  /** Change the field to not being actively set: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   */
  public void unsetActiveDate () {
    this._ActiveDateSet = false;
  }
  /** See if the field is actively set: ActiveDate (CUSTOMER_ID_ACCT_MAP.active_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDate () {
    return this._ActiveDateSet;
  }
  /** set the fields value: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InactiveDate") 
  public void setInactiveDate (Date value) throws ServiceException
  {
    this.InactiveDate = value;
    this._InactiveDateSet = true;
  }

  /** Retrieves the InactiveDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InactiveDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
   public String getInactiveDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedString");
       return fmtMgr.formatDate(this.getInactiveDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the InactiveDate field from a formatted string
   *
   * @param _value the InactiveDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
   public void setInactiveDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInactiveDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InactiveDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInactiveDateFromFormattedString");
   }

  /**
   * Retrieves the InactiveDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InactiveDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InactiveDate field
   */
  public String getInactiveDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInactiveDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInactiveDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InactiveDate field value from a formatted date/time string
   *
   * @param _value the InactiveDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InactiveDate field
   */
  public void setInactiveDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInactiveDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InactiveDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInactiveDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return Date the value
   */
  public Date getInactiveDate () {
    return this.InactiveDate;
  }
  /** Change the field to not being actively set: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   */
  public void unsetInactiveDate () {
    this._InactiveDateSet = false;
  }
  /** See if the field is actively set: InactiveDate (CUSTOMER_ID_ACCT_MAP.inactive_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInactiveDate () {
    return this._InactiveDateSet;
  }
  public String toString() {
    return RefundObjectHelper.toMap(this, null).toString();
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
  /** REFUND.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** REFUND.orig_submitter_name field */
    if(!nonNullOnly || (OrigSubmitterName != null))  _OrigSubmitterNameSet = flag;
  /** REFUND.request_date field */
    if(!nonNullOnly || (RequestDate != null))  _RequestDateSet = flag;
  /** REFUND.refund_reason_code field */
    if(!nonNullOnly || (RefundReasonCode != null))  _RefundReasonCodeSet = flag;
  /** REFUND.amount field */
    if(!nonNullOnly || (Amount != null))  _AmountSet = flag;
  /** REFUND.refund_status field */
    if(!nonNullOnly || (RefundStatus != null))  _RefundStatusSet = flag;
  /** REFUND.refund_type field */
    if(!nonNullOnly || (RefundType != null))  _RefundTypeSet = flag;
  /** REFUND.supervisor_name field */
    if(!nonNullOnly || (SupervisorName != null))  _SupervisorNameSet = flag;
  /** REFUND.review_date field */
    if(!nonNullOnly || (ReviewDate != null))  _ReviewDateSet = flag;
  /** REFUND.payee_last field */
    if(!nonNullOnly || (PayeeLast != null))  _PayeeLastSet = flag;
  /** REFUND.payee_first field */
    if(!nonNullOnly || (PayeeFirst != null))  _PayeeFirstSet = flag;
  /** REFUND.payee_company field */
    if(!nonNullOnly || (PayeeCompany != null))  _PayeeCompanySet = flag;
  /** REFUND.payee_address1 field */
    if(!nonNullOnly || (PayeeAddress1 != null))  _PayeeAddress1Set = flag;
  /** REFUND.payee_address2 field */
    if(!nonNullOnly || (PayeeAddress2 != null))  _PayeeAddress2Set = flag;
  /** REFUND.payee_address3 field */
    if(!nonNullOnly || (PayeeAddress3 != null))  _PayeeAddress3Set = flag;
  /** REFUND.payee_city field */
    if(!nonNullOnly || (PayeeCity != null))  _PayeeCitySet = flag;
  /** REFUND.payee_state field */
    if(!nonNullOnly || (PayeeState != null))  _PayeeStateSet = flag;
  /** REFUND.payee_zip field */
    if(!nonNullOnly || (PayeeZip != null))  _PayeeZipSet = flag;
  /** REFUND.payee_country_code field */
    if(!nonNullOnly || (PayeeCountryCode != null))  _PayeeCountryCodeSet = flag;
  /** REFUND.payee_geocode field */
    if(!nonNullOnly || (PayeeGeocode != null))  _PayeeGeocodeSet = flag;
  /** REFUND.payee_county field */
    if(!nonNullOnly || (PayeeCounty != null))  _PayeeCountySet = flag;
  /** REFUND.treasury_date field */
    if(!nonNullOnly || (TreasuryDate != null))  _TreasuryDateSet = flag;
  /** REFUND.check_num field */
    if(!nonNullOnly || (CheckNum != null))  _CheckNumSet = flag;
  /** REFUND.profile_id field */
    if(!nonNullOnly || (ProfileId != null))  _ProfileIdSet = flag;
  /** REFUND.currency_code field */
    if(!nonNullOnly || (CurrencyCode != null))  _CurrencyCodeSet = flag;
  /** REFUND.last_reviewed_name field */
    if(!nonNullOnly || (LastReviewedName != null))  _LastReviewedNameSet = flag;
  /** REFUND.open_item_id field */
    if(!nonNullOnly || (OpenItemId != null))  _OpenItemIdSet = flag;
  /** REFUND.alt_contact_id field */
    if(!nonNullOnly || (AltContactId != null))  _AltContactIdSet = flag;
  /** REFUND.alt_currency_code field */
    if(!nonNullOnly || (AltCurrencyCode != null))  _AltCurrencyCodeSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
    if(!nonNullOnly || (AccountExternalId != null))  _AccountExternalIdSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
    if(!nonNullOnly || (AccountExternalIdType != null))  _AccountExternalIdTypeSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.is_current field */
    if(!nonNullOnly || (IsCurrent != null))  _IsCurrentSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.active_date field */
    if(!nonNullOnly || (ActiveDate != null))  _ActiveDateSet = flag;
  /** CUSTOMER_ID_ACCT_MAP.inactive_date field */
    if(!nonNullOnly || (InactiveDate != null))  _InactiveDateSet = flag;
  }
}
