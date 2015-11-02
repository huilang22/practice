/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: InterimBillObjectData.java
 * Definition File: Customer/InterimBill.xml
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
  
/** InterimBillObjectData Object
 */
@XmlRootElement(namespace ="http://bp.comverse.com/data")
@XmlAccessorType (XmlAccessType.PROPERTY)
public class InterimBillObjectData extends BaseObjectData implements Serializable
{

  /** the object's key data */
  public InterimBillObjectKeyData Key = null;
  /** CUSTOMER_ID_ACCT_MAP.external_id field */
  public    String AccountExternalId  = null;
  protected boolean _AccountExternalIdSet = false;
  /** CUSTOMER_ID_ACCT_MAP.external_id_type field */
  public    Integer AccountExternalIdType  = null;
  protected boolean _AccountExternalIdTypeSet = false;
  /** HotReqStatusQueue field */
  public    String HotReqStatusQueue  = null;
  protected boolean _HotReqStatusQueueSet = false;
  /** HotReqId field */
  public    Integer HotReqId  = null;
  protected boolean _HotReqIdSet = false;
  /** HotReqReturnCustom field */
  public    Integer HotReqReturnCustom  = null;
  protected boolean _HotReqReturnCustomSet = false;
  /** HotReqReturnStatus field */
  public    Integer HotReqReturnStatus  = null;
  protected boolean _HotReqReturnStatusSet = false;
  /** HotReqBillRefNo field */
  public    Integer HotReqBillRefNo  = null;
  protected boolean _HotReqBillRefNoSet = false;
  /** HotReqBillRefResets field */
  public    Integer HotReqBillRefResets  = null;
  protected boolean _HotReqBillRefResetsSet = false;
  /** HotReqPollTimeout field */
  public    Integer HotReqPollTimeout  = null;
  protected boolean _HotReqPollTimeoutSet = false;
  /** CMF_INTERIM_BILLS.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** CMF_INTERIM_BILLS.interim_bill_date field */
  public    Date InterimBillDate  = null;
  protected boolean _InterimBillDateSet = false;
  /** CMF_INTERIM_BILLS.include_nrc field */
  public    Boolean IncludeNrc  = null;
  protected boolean _IncludeNrcSet = false;
  /** CMF_INTERIM_BILLS.include_rc field */
  public    Boolean IncludeRc  = null;
  protected boolean _IncludeRcSet = false;
  /** CMF_INTERIM_BILLS.include_adj field */
  public    Boolean IncludeAdj  = null;
  protected boolean _IncludeAdjSet = false;
  /** CMF_INTERIM_BILLS.include_usage field */
  public    Boolean IncludeUsage  = null;
  protected boolean _IncludeUsageSet = false;
  /** CMF_INTERIM_BILLS.include_bmf field */
  public    Boolean IncludePayment  = null;
  protected boolean _IncludePaymentSet = false;
  /** CMF_INTERIM_BILLS.warm_bill_flag field */
  public    Boolean WarmBillFlag  = null;
  protected boolean _WarmBillFlagSet = false;
  /** CMF_INTERIM_BILLS.proforma_bill_flag field */
  public    Boolean ProformaBillFlag  = null;
  protected boolean _ProformaBillFlagSet = false;
  /** CMF_INTERIM_BILLS.format_status field */
  public    Integer FormatStatus  = null;
  protected boolean _FormatStatusSet = false;
  /** CMF_INTERIM_BILLS.bill_order_number field */
  public    String BillOrderNumber  = null;
  protected boolean _BillOrderNumberSet = false;
  /** CMF_INTERIM_BILLS.override_dates field */
  public    Boolean OverrideDates  = null;
  protected boolean _OverrideDatesSet = false;
  /** CMF_INTERIM_BILLS.statement_date field */
  public    Date StatementDate  = null;
  protected boolean _StatementDateSet = false;
  /** CMF_INTERIM_BILLS.payment_due_date field */
  public    Date PaymentDueDate  = null;
  protected boolean _PaymentDueDateSet = false;
  private String _objName = "InterimBillObjectData";
  /** Default constructor */
  public InterimBillObjectData ()
  {
    super ();

  }
  /** Copy Constructor
   * @param other the object to copy
   */
  public InterimBillObjectData (InterimBillObjectData other)
  {

    if (other == null) return;
    this.Key = new InterimBillObjectKeyData (other.Key);
    this.AccountExternalId = other.AccountExternalId;
    this._AccountExternalIdSet = other._AccountExternalIdSet;
    this.AccountExternalIdType = other.AccountExternalIdType;
    this._AccountExternalIdTypeSet = other._AccountExternalIdTypeSet;
    this.HotReqStatusQueue = other.HotReqStatusQueue;
    this._HotReqStatusQueueSet = other._HotReqStatusQueueSet;
    this.HotReqId = other.HotReqId;
    this._HotReqIdSet = other._HotReqIdSet;
    this.HotReqReturnCustom = other.HotReqReturnCustom;
    this._HotReqReturnCustomSet = other._HotReqReturnCustomSet;
    this.HotReqReturnStatus = other.HotReqReturnStatus;
    this._HotReqReturnStatusSet = other._HotReqReturnStatusSet;
    this.HotReqBillRefNo = other.HotReqBillRefNo;
    this._HotReqBillRefNoSet = other._HotReqBillRefNoSet;
    this.HotReqBillRefResets = other.HotReqBillRefResets;
    this._HotReqBillRefResetsSet = other._HotReqBillRefResetsSet;
    this.HotReqPollTimeout = other.HotReqPollTimeout;
    this._HotReqPollTimeoutSet = other._HotReqPollTimeoutSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.InterimBillDate = other.InterimBillDate;
    this._InterimBillDateSet = other._InterimBillDateSet;
    this.IncludeNrc = other.IncludeNrc;
    this._IncludeNrcSet = other._IncludeNrcSet;
    this.IncludeRc = other.IncludeRc;
    this._IncludeRcSet = other._IncludeRcSet;
    this.IncludeAdj = other.IncludeAdj;
    this._IncludeAdjSet = other._IncludeAdjSet;
    this.IncludeUsage = other.IncludeUsage;
    this._IncludeUsageSet = other._IncludeUsageSet;
    this.IncludePayment = other.IncludePayment;
    this._IncludePaymentSet = other._IncludePaymentSet;
    this.WarmBillFlag = other.WarmBillFlag;
    this._WarmBillFlagSet = other._WarmBillFlagSet;
    this.ProformaBillFlag = other.ProformaBillFlag;
    this._ProformaBillFlagSet = other._ProformaBillFlagSet;
    this.FormatStatus = other.FormatStatus;
    this._FormatStatusSet = other._FormatStatusSet;
    this.BillOrderNumber = other.BillOrderNumber;
    this._BillOrderNumberSet = other._BillOrderNumberSet;
    this.OverrideDates = other.OverrideDates;
    this._OverrideDatesSet = other._OverrideDatesSet;
    this.StatementDate = other.StatementDate;
    this._StatementDateSet = other._StatementDateSet;
    this.PaymentDueDate = other.PaymentDueDate;
    this._PaymentDueDateSet = other._PaymentDueDateSet;
  }

  /** get the Key for this object
   * @return InterimBillObjectKeyData
   */
  @JsonIgnore 
  @XmlTransient 
  public InterimBillObjectKeyData getKey ()
  {
    return this.Key;
  }
  /** set the key data for this object
   * @param Key the new key
   */
  @JsonProperty 
  public void setKey (InterimBillObjectKeyData Key)
  {
    this.Key = Key;
  }
  /** set the fields value: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingId", "setTrackingId");
    }
    if (this.Key == null) this.Key = new InterimBillObjectKeyData ();
    this.Key.TrackingId = value;
    this.Key._TrackingIdSet = true;
  }
  /** get the value of the field: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   * @return Integer the value
   */
  public Integer getTrackingId () {
    if (this.Key == null) return null;
    return this.Key.TrackingId;
  }
  /** Change the field to not being actively set: TrackingId (CMF_INTERIM_BILLS.tracking_id)
   */
  public void unsetTrackingId () {
    if (this.Key == null) return;
    this.Key._TrackingIdSet = false;
  }
  /** See if the field is actively set: TrackingId (CMF_INTERIM_BILLS.tracking_id)
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

  /** set the fields value: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TrackingIdServ", "setTrackingIdServ");
    }
    if (this.Key == null) this.Key = new InterimBillObjectKeyData ();
    this.Key.TrackingIdServ = value;
    this.Key._TrackingIdServSet = true;
  }
  /** get the value of the field: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   * @return Integer the value
   */
  public Integer getTrackingIdServ () {
    if (this.Key == null) return null;
    return this.Key.TrackingIdServ;
  }
  /** Change the field to not being actively set: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
   */
  public void unsetTrackingIdServ () {
    if (this.Key == null) return;
    this.Key._TrackingIdServSet = false;
  }
  /** See if the field is actively set: TrackingIdServ (CMF_INTERIM_BILLS.tracking_id_serv)
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
  /** set the fields value: HotReqStatusQueue
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null, or the value's length exceeds the maximum length for the field (33)
   */
  public void setHotReqStatusQueue (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqStatusQueue", "setHotReqStatusQueue");
    }
    if (value != null && !DataHelper.validLength (value, 33))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "HotReqStatusQueue", "setHotReqStatusQueue");
    }
    this.HotReqStatusQueue = value;
    this._HotReqStatusQueueSet = true;
  }
  /** get the value of the field: HotReqStatusQueue
   * @return String the value
   */
  public String getHotReqStatusQueue ()
  {
    return this.HotReqStatusQueue;
  }
  /** Change the field to not being actively set: HotReqStatusQueue
   */
  public void unsetHotReqStatusQueue ()
  {
    this._HotReqStatusQueueSet = false;
  }
  /** See if the field is actively set: HotReqStatusQueue
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqStatusQueue ()
  {
    return this._HotReqStatusQueueSet;
  }

  /** Retrieves the HotReqStatusQueue field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqStatusQueue field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqStatusQueue field
   */
   public String getHotReqStatusQueueAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqStatusQueueAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqStatusQueueAsFormattedString");
       return fmtMgr.formatString(this.getHotReqStatusQueue());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqStatusQueue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqStatusQueueAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqStatusQueue field from a formatted string
   *
   * @param _value the HotReqStatusQueue field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqStatusQueue field
   */
   public void setHotReqStatusQueueFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqStatusQueueFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqStatusQueue(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqStatusQueue");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqStatusQueueFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqStatusQueueFromFormattedString");
   }

  /** set the fields value: HotReqId
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqId", "setHotReqId");
    }
    this.HotReqId = value;
    this._HotReqIdSet = true;
  }
  /** get the value of the field: HotReqId
   * @return Integer the value
   */
  public Integer getHotReqId ()
  {
    return this.HotReqId;
  }
  /** Change the field to not being actively set: HotReqId
   */
  public void unsetHotReqId ()
  {
    this._HotReqIdSet = false;
  }
  /** See if the field is actively set: HotReqId
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqId ()
  {
    return this._HotReqIdSet;
  }

  /** Retrieves the HotReqId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqId field
   */
   public String getHotReqIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqIdAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqId field from a formatted string
   *
   * @param _value the HotReqId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqId field
   */
   public void setHotReqIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqIdFromFormattedString");
   }

  /** set the fields value: HotReqReturnCustom
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqReturnCustom (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqReturnCustom", "setHotReqReturnCustom");
    }
    this.HotReqReturnCustom = value;
    this._HotReqReturnCustomSet = true;
  }
  /** get the value of the field: HotReqReturnCustom
   * @return Integer the value
   */
  public Integer getHotReqReturnCustom ()
  {
    return this.HotReqReturnCustom;
  }
  /** Change the field to not being actively set: HotReqReturnCustom
   */
  public void unsetHotReqReturnCustom ()
  {
    this._HotReqReturnCustomSet = false;
  }
  /** See if the field is actively set: HotReqReturnCustom
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqReturnCustom ()
  {
    return this._HotReqReturnCustomSet;
  }

  /** Retrieves the HotReqReturnCustom field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqReturnCustom field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqReturnCustom field
   */
   public String getHotReqReturnCustomAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqReturnCustomAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqReturnCustomAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqReturnCustom(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqReturnCustom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqReturnCustomAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqReturnCustom field from a formatted string
   *
   * @param _value the HotReqReturnCustom field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqReturnCustom field
   */
   public void setHotReqReturnCustomFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqReturnCustomFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqReturnCustom(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqReturnCustom");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqReturnCustomFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqReturnCustomFromFormattedString");
   }

  /** set the fields value: HotReqReturnStatus
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqReturnStatus (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqReturnStatus", "setHotReqReturnStatus");
    }
    this.HotReqReturnStatus = value;
    this._HotReqReturnStatusSet = true;
  }
  /** get the value of the field: HotReqReturnStatus
   * @return Integer the value
   */
  public Integer getHotReqReturnStatus ()
  {
    return this.HotReqReturnStatus;
  }
  /** Change the field to not being actively set: HotReqReturnStatus
   */
  public void unsetHotReqReturnStatus ()
  {
    this._HotReqReturnStatusSet = false;
  }
  /** See if the field is actively set: HotReqReturnStatus
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqReturnStatus ()
  {
    return this._HotReqReturnStatusSet;
  }

  /** Retrieves the HotReqReturnStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqReturnStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqReturnStatus field
   */
   public String getHotReqReturnStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqReturnStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqReturnStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqReturnStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqReturnStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqReturnStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqReturnStatus field from a formatted string
   *
   * @param _value the HotReqReturnStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqReturnStatus field
   */
   public void setHotReqReturnStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqReturnStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqReturnStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqReturnStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqReturnStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqReturnStatusFromFormattedString");
   }

  /** set the fields value: HotReqBillRefNo
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqBillRefNo (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqBillRefNo", "setHotReqBillRefNo");
    }
    this.HotReqBillRefNo = value;
    this._HotReqBillRefNoSet = true;
  }
  /** get the value of the field: HotReqBillRefNo
   * @return Integer the value
   */
  public Integer getHotReqBillRefNo ()
  {
    return this.HotReqBillRefNo;
  }
  /** Change the field to not being actively set: HotReqBillRefNo
   */
  public void unsetHotReqBillRefNo ()
  {
    this._HotReqBillRefNoSet = false;
  }
  /** See if the field is actively set: HotReqBillRefNo
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqBillRefNo ()
  {
    return this._HotReqBillRefNoSet;
  }

  /** Retrieves the HotReqBillRefNo field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqBillRefNo field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqBillRefNo field
   */
   public String getHotReqBillRefNoAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqBillRefNoAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqBillRefNoAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqBillRefNo(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqBillRefNoAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqBillRefNo field from a formatted string
   *
   * @param _value the HotReqBillRefNo field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqBillRefNo field
   */
   public void setHotReqBillRefNoFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqBillRefNoFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqBillRefNo(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqBillRefNo");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqBillRefNoFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqBillRefNoFromFormattedString");
   }

  /** set the fields value: HotReqBillRefResets
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqBillRefResets (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqBillRefResets", "setHotReqBillRefResets");
    }
    this.HotReqBillRefResets = value;
    this._HotReqBillRefResetsSet = true;
  }
  /** get the value of the field: HotReqBillRefResets
   * @return Integer the value
   */
  public Integer getHotReqBillRefResets ()
  {
    return this.HotReqBillRefResets;
  }
  /** Change the field to not being actively set: HotReqBillRefResets
   */
  public void unsetHotReqBillRefResets ()
  {
    this._HotReqBillRefResetsSet = false;
  }
  /** See if the field is actively set: HotReqBillRefResets
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqBillRefResets ()
  {
    return this._HotReqBillRefResetsSet;
  }

  /** Retrieves the HotReqBillRefResets field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqBillRefResets field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqBillRefResets field
   */
   public String getHotReqBillRefResetsAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqBillRefResetsAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqBillRefResetsAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqBillRefResets(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqBillRefResetsAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqBillRefResets field from a formatted string
   *
   * @param _value the HotReqBillRefResets field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqBillRefResets field
   */
   public void setHotReqBillRefResetsFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqBillRefResetsFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqBillRefResets(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqBillRefResets");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqBillRefResetsFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqBillRefResetsFromFormattedString");
   }

  /** set the fields value: HotReqPollTimeout
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  public void setHotReqPollTimeout (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "HotReqPollTimeout", "setHotReqPollTimeout");
    }
    this.HotReqPollTimeout = value;
    this._HotReqPollTimeoutSet = true;
  }
  /** get the value of the field: HotReqPollTimeout
   * @return Integer the value
   */
  public Integer getHotReqPollTimeout ()
  {
    return this.HotReqPollTimeout;
  }
  /** Change the field to not being actively set: HotReqPollTimeout
   */
  public void unsetHotReqPollTimeout ()
  {
    this._HotReqPollTimeoutSet = false;
  }
  /** See if the field is actively set: HotReqPollTimeout
   * @return boolean whether the field is actively set
   */
  public boolean issetHotReqPollTimeout ()
  {
    return this._HotReqPollTimeoutSet;
  }

  /** Retrieves the HotReqPollTimeout field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The HotReqPollTimeout field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the HotReqPollTimeout field
   */
   public String getHotReqPollTimeoutAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqPollTimeoutAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getHotReqPollTimeoutAsFormattedString");
       return fmtMgr.formatNumber(this.getHotReqPollTimeout(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqPollTimeout");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getHotReqPollTimeoutAsFormattedString");
       throw x;
     }
   }
  /** Sets the HotReqPollTimeout field from a formatted string
   *
   * @param _value the HotReqPollTimeout field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the HotReqPollTimeout field
   */
   public void setHotReqPollTimeoutFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getHotReqPollTimeoutFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setHotReqPollTimeout(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("HotReqPollTimeout");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setHotReqPollTimeoutFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setHotReqPollTimeoutFromFormattedString");
   }

  /** set the fields value: AccountInternalId (CMF_INTERIM_BILLS.account_no)
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

  /** get the value of the field: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CMF_INTERIM_BILLS.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("InterimBillDate") 
  public void setInterimBillDate (Date value) throws ServiceException
  {
    this.InterimBillDate = value;
    this._InterimBillDateSet = true;
  }

  /** Retrieves the InterimBillDate field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The InterimBillDate field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterimBillDate field
   */
   public String getInterimBillDateAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillDateAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillDateAsFormattedString");
       return fmtMgr.formatDate(this.getInterimBillDate(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InterimBillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterimBillDateAsFormattedString");
       throw x;
     }
   }
  /** Sets the InterimBillDate field from a formatted string
   *
   * @param _value the InterimBillDate field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InterimBillDate field
   */
   public void setInterimBillDateFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillDateFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setInterimBillDate(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("InterimBillDate");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterimBillDateFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setInterimBillDateFromFormattedString");
   }

  /**
   * Retrieves the InterimBillDate field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The InterimBillDate field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the InterimBillDate field
   */
  public String getInterimBillDateAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getInterimBillDateAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getInterimBillDateAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getInterimBillDate(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterimBillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getInterimBillDateAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the InterimBillDate field value from a formatted date/time string
   *
   * @param _value the InterimBillDate field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the InterimBillDate field
   */
  public void setInterimBillDateFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setInterimBillDateFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setInterimBillDate(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("InterimBillDate");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setInterimBillDateFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * @return Date the value
   */
  public Date getInterimBillDate () {
    return this.InterimBillDate;
  }
  /** Change the field to not being actively set: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   */
  public void unsetInterimBillDate () {
    this._InterimBillDateSet = false;
  }
  /** See if the field is actively set: InterimBillDate (CMF_INTERIM_BILLS.interim_bill_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetInterimBillDate () {
    return this._InterimBillDateSet;
  }
  /** set the fields value: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludeNrc") 
  public void setIncludeNrc (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludeNrc", "setIncludeNrc");
    }
    this.IncludeNrc = value;
    this._IncludeNrcSet = true;
  }

  /** Retrieves the IncludeNrc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludeNrc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeNrc field
   */
   public String getIncludeNrcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeNrcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeNrcAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludeNrc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeNrcAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludeNrc field from a formatted string
   *
   * @param _value the IncludeNrc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludeNrc field
   */
   public void setIncludeNrcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeNrcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludeNrc(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeNrc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeNrcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeNrcFromFormattedString");
   }

  /** get the value of the field: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * @return Boolean the value
   */
  public Boolean getIncludeNrc () {
    return this.IncludeNrc;
  }
  /** Change the field to not being actively set: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   */
  public void unsetIncludeNrc () {
    this._IncludeNrcSet = false;
  }
  /** See if the field is actively set: IncludeNrc (CMF_INTERIM_BILLS.include_nrc)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludeNrc () {
    return this._IncludeNrcSet;
  }
  /** set the fields value: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludeRc") 
  public void setIncludeRc (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludeRc", "setIncludeRc");
    }
    this.IncludeRc = value;
    this._IncludeRcSet = true;
  }

  /** Retrieves the IncludeRc field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludeRc field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeRc field
   */
   public String getIncludeRcAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeRcAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeRcAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludeRc());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeRc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeRcAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludeRc field from a formatted string
   *
   * @param _value the IncludeRc field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludeRc field
   */
   public void setIncludeRcFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeRcFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludeRc(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeRc");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeRcFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeRcFromFormattedString");
   }

  /** get the value of the field: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * @return Boolean the value
   */
  public Boolean getIncludeRc () {
    return this.IncludeRc;
  }
  /** Change the field to not being actively set: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   */
  public void unsetIncludeRc () {
    this._IncludeRcSet = false;
  }
  /** See if the field is actively set: IncludeRc (CMF_INTERIM_BILLS.include_rc)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludeRc () {
    return this._IncludeRcSet;
  }
  /** set the fields value: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludeAdj") 
  public void setIncludeAdj (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludeAdj", "setIncludeAdj");
    }
    this.IncludeAdj = value;
    this._IncludeAdjSet = true;
  }

  /** Retrieves the IncludeAdj field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludeAdj field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeAdj field
   */
   public String getIncludeAdjAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeAdjAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeAdjAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludeAdj());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeAdjAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludeAdj field from a formatted string
   *
   * @param _value the IncludeAdj field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludeAdj field
   */
   public void setIncludeAdjFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeAdjFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludeAdj(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeAdj");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeAdjFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeAdjFromFormattedString");
   }

  /** get the value of the field: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * @return Boolean the value
   */
  public Boolean getIncludeAdj () {
    return this.IncludeAdj;
  }
  /** Change the field to not being actively set: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   */
  public void unsetIncludeAdj () {
    this._IncludeAdjSet = false;
  }
  /** See if the field is actively set: IncludeAdj (CMF_INTERIM_BILLS.include_adj)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludeAdj () {
    return this._IncludeAdjSet;
  }
  /** set the fields value: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludeUsage") 
  public void setIncludeUsage (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludeUsage", "setIncludeUsage");
    }
    this.IncludeUsage = value;
    this._IncludeUsageSet = true;
  }

  /** Retrieves the IncludeUsage field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludeUsage field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludeUsage field
   */
   public String getIncludeUsageAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeUsageAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludeUsageAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludeUsage());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludeUsageAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludeUsage field from a formatted string
   *
   * @param _value the IncludeUsage field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludeUsage field
   */
   public void setIncludeUsageFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludeUsageFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludeUsage(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludeUsage");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludeUsageFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludeUsageFromFormattedString");
   }

  /** get the value of the field: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * @return Boolean the value
   */
  public Boolean getIncludeUsage () {
    return this.IncludeUsage;
  }
  /** Change the field to not being actively set: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   */
  public void unsetIncludeUsage () {
    this._IncludeUsageSet = false;
  }
  /** See if the field is actively set: IncludeUsage (CMF_INTERIM_BILLS.include_usage)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludeUsage () {
    return this._IncludeUsageSet;
  }
  /** set the fields value: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("IncludePayment") 
  public void setIncludePayment (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "IncludePayment", "setIncludePayment");
    }
    this.IncludePayment = value;
    this._IncludePaymentSet = true;
  }

  /** Retrieves the IncludePayment field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The IncludePayment field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the IncludePayment field
   */
   public String getIncludePaymentAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludePaymentAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getIncludePaymentAsFormattedString");
       return fmtMgr.formatBoolean(this.getIncludePayment());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludePayment");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getIncludePaymentAsFormattedString");
       throw x;
     }
   }
  /** Sets the IncludePayment field from a formatted string
   *
   * @param _value the IncludePayment field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the IncludePayment field
   */
   public void setIncludePaymentFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getIncludePaymentFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setIncludePayment(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("IncludePayment");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setIncludePaymentFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setIncludePaymentFromFormattedString");
   }

  /** get the value of the field: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * @return Boolean the value
   */
  public Boolean getIncludePayment () {
    return this.IncludePayment;
  }
  /** Change the field to not being actively set: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   */
  public void unsetIncludePayment () {
    this._IncludePaymentSet = false;
  }
  /** See if the field is actively set: IncludePayment (CMF_INTERIM_BILLS.include_bmf)
   * @return boolean whether the field is actively set
   */
  public boolean issetIncludePayment () {
    return this._IncludePaymentSet;
  }
  /** set the fields value: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("WarmBillFlag") 
  public void setWarmBillFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "WarmBillFlag", "setWarmBillFlag");
    }
    this.WarmBillFlag = value;
    this._WarmBillFlagSet = true;
  }

  /** Retrieves the WarmBillFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The WarmBillFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the WarmBillFlag field
   */
   public String getWarmBillFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWarmBillFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getWarmBillFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getWarmBillFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WarmBillFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getWarmBillFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the WarmBillFlag field from a formatted string
   *
   * @param _value the WarmBillFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the WarmBillFlag field
   */
   public void setWarmBillFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getWarmBillFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setWarmBillFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("WarmBillFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setWarmBillFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setWarmBillFlagFromFormattedString");
   }

  /** get the value of the field: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * @return Boolean the value
   */
  public Boolean getWarmBillFlag () {
    return this.WarmBillFlag;
  }
  /** Change the field to not being actively set: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   */
  public void unsetWarmBillFlag () {
    this._WarmBillFlagSet = false;
  }
  /** See if the field is actively set: WarmBillFlag (CMF_INTERIM_BILLS.warm_bill_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetWarmBillFlag () {
    return this._WarmBillFlagSet;
  }
  /** set the fields value: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ProformaBillFlag") 
  public void setProformaBillFlag (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ProformaBillFlag", "setProformaBillFlag");
    }
    this.ProformaBillFlag = value;
    this._ProformaBillFlagSet = true;
  }

  /** Retrieves the ProformaBillFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ProformaBillFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ProformaBillFlag field
   */
   public String getProformaBillFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProformaBillFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getProformaBillFlagAsFormattedString");
       return fmtMgr.formatBoolean(this.getProformaBillFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProformaBillFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getProformaBillFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the ProformaBillFlag field from a formatted string
   *
   * @param _value the ProformaBillFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ProformaBillFlag field
   */
   public void setProformaBillFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getProformaBillFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setProformaBillFlag(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ProformaBillFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setProformaBillFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setProformaBillFlagFromFormattedString");
   }

  /** get the value of the field: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * @return Boolean the value
   */
  public Boolean getProformaBillFlag () {
    return this.ProformaBillFlag;
  }
  /** Change the field to not being actively set: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   */
  public void unsetProformaBillFlag () {
    this._ProformaBillFlagSet = false;
  }
  /** See if the field is actively set: ProformaBillFlag (CMF_INTERIM_BILLS.proforma_bill_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetProformaBillFlag () {
    return this._ProformaBillFlagSet;
  }
  /** set the fields value: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FormatStatus") 
  public void setFormatStatus (Integer value) throws ServiceException
  {
    this.FormatStatus = value;
    this._FormatStatusSet = true;
  }

  /** Retrieves the FormatStatus field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FormatStatus field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FormatStatus field
   */
   public String getFormatStatusAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatStatusAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFormatStatusAsFormattedString");
       return fmtMgr.formatNumber(this.getFormatStatus(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FormatStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFormatStatusAsFormattedString");
       throw x;
     }
   }
  /** Sets the FormatStatus field from a formatted string
   *
   * @param _value the FormatStatus field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FormatStatus field
   */
   public void setFormatStatusFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFormatStatusFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFormatStatus(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FormatStatus");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFormatStatusFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFormatStatusFromFormattedString");
   }

  /** get the value of the field: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * @return Integer the value
   */
  public Integer getFormatStatus () {
    return this.FormatStatus;
  }
  /** Change the field to not being actively set: FormatStatus (CMF_INTERIM_BILLS.format_status)
   */
  public void unsetFormatStatus () {
    this._FormatStatusSet = false;
  }
  /** See if the field is actively set: FormatStatus (CMF_INTERIM_BILLS.format_status)
   * @return boolean whether the field is actively set
   */
  public boolean issetFormatStatus () {
    return this._FormatStatusSet;
  }
  /** set the fields value: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
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

  /** get the value of the field: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @return String the value
   */
  public String getBillOrderNumber () {
    return this.BillOrderNumber;
  }
  /** Change the field to not being actively set: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   */
  public void unsetBillOrderNumber () {
    this._BillOrderNumberSet = false;
  }
  /** See if the field is actively set: BillOrderNumber (CMF_INTERIM_BILLS.bill_order_number)
   * @return boolean whether the field is actively set
   */
  public boolean issetBillOrderNumber () {
    return this._BillOrderNumberSet;
  }
  /** set the fields value: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("OverrideDates") 
  public void setOverrideDates (Boolean value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "OverrideDates", "setOverrideDates");
    }
    this.OverrideDates = value;
    this._OverrideDatesSet = true;
  }

  /** Retrieves the OverrideDates field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The OverrideDates field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the OverrideDates field
   */
   public String getOverrideDatesAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideDatesAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getOverrideDatesAsFormattedString");
       return fmtMgr.formatBoolean(this.getOverrideDates());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideDates");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getOverrideDatesAsFormattedString");
       throw x;
     }
   }
  /** Sets the OverrideDates field from a formatted string
   *
   * @param _value the OverrideDates field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the OverrideDates field
   */
   public void setOverrideDatesFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getOverrideDatesFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setOverrideDates(fmtMgr.parseBoolean(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("OverrideDates");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setOverrideDatesFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setOverrideDatesFromFormattedString");
   }

  /** get the value of the field: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * @return Boolean the value
   */
  public Boolean getOverrideDates () {
    return this.OverrideDates;
  }
  /** Change the field to not being actively set: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   */
  public void unsetOverrideDates () {
    this._OverrideDatesSet = false;
  }
  /** See if the field is actively set: OverrideDates (CMF_INTERIM_BILLS.override_dates)
   * @return boolean whether the field is actively set
   */
  public boolean issetOverrideDates () {
    return this._OverrideDatesSet;
  }
  /** set the fields value: StatementDate (CMF_INTERIM_BILLS.statement_date)
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

  /** get the value of the field: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * @return Date the value
   */
  public Date getStatementDate () {
    return this.StatementDate;
  }
  /** Change the field to not being actively set: StatementDate (CMF_INTERIM_BILLS.statement_date)
   */
  public void unsetStatementDate () {
    this._StatementDateSet = false;
  }
  /** See if the field is actively set: StatementDate (CMF_INTERIM_BILLS.statement_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatementDate () {
    return this._StatementDateSet;
  }
  /** set the fields value: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
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

  /** get the value of the field: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * @return Date the value
   */
  public Date getPaymentDueDate () {
    return this.PaymentDueDate;
  }
  /** Change the field to not being actively set: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   */
  public void unsetPaymentDueDate () {
    this._PaymentDueDateSet = false;
  }
  /** See if the field is actively set: PaymentDueDate (CMF_INTERIM_BILLS.payment_due_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetPaymentDueDate () {
    return this._PaymentDueDateSet;
  }
  public String toString() {
    return InterimBillObjectHelper.toMap(this, null).toString();
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
  /** HotReqStatusQueue field */
    if (!nonNullOnly || (HotReqStatusQueue != null)) _HotReqStatusQueueSet = flag;
  /** HotReqId field */
    if (!nonNullOnly || (HotReqId != null)) _HotReqIdSet = flag;
  /** HotReqReturnCustom field */
    if (!nonNullOnly || (HotReqReturnCustom != null)) _HotReqReturnCustomSet = flag;
  /** HotReqReturnStatus field */
    if (!nonNullOnly || (HotReqReturnStatus != null)) _HotReqReturnStatusSet = flag;
  /** HotReqBillRefNo field */
    if (!nonNullOnly || (HotReqBillRefNo != null)) _HotReqBillRefNoSet = flag;
  /** HotReqBillRefResets field */
    if (!nonNullOnly || (HotReqBillRefResets != null)) _HotReqBillRefResetsSet = flag;
  /** HotReqPollTimeout field */
    if (!nonNullOnly || (HotReqPollTimeout != null)) _HotReqPollTimeoutSet = flag;
  /** CMF_INTERIM_BILLS.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** CMF_INTERIM_BILLS.interim_bill_date field */
    if(!nonNullOnly || (InterimBillDate != null))  _InterimBillDateSet = flag;
  /** CMF_INTERIM_BILLS.include_nrc field */
    if(!nonNullOnly || (IncludeNrc != null))  _IncludeNrcSet = flag;
  /** CMF_INTERIM_BILLS.include_rc field */
    if(!nonNullOnly || (IncludeRc != null))  _IncludeRcSet = flag;
  /** CMF_INTERIM_BILLS.include_adj field */
    if(!nonNullOnly || (IncludeAdj != null))  _IncludeAdjSet = flag;
  /** CMF_INTERIM_BILLS.include_usage field */
    if(!nonNullOnly || (IncludeUsage != null))  _IncludeUsageSet = flag;
  /** CMF_INTERIM_BILLS.include_bmf field */
    if(!nonNullOnly || (IncludePayment != null))  _IncludePaymentSet = flag;
  /** CMF_INTERIM_BILLS.warm_bill_flag field */
    if(!nonNullOnly || (WarmBillFlag != null))  _WarmBillFlagSet = flag;
  /** CMF_INTERIM_BILLS.proforma_bill_flag field */
    if(!nonNullOnly || (ProformaBillFlag != null))  _ProformaBillFlagSet = flag;
  /** CMF_INTERIM_BILLS.format_status field */
    if(!nonNullOnly || (FormatStatus != null))  _FormatStatusSet = flag;
  /** CMF_INTERIM_BILLS.bill_order_number field */
    if(!nonNullOnly || (BillOrderNumber != null))  _BillOrderNumberSet = flag;
  /** CMF_INTERIM_BILLS.override_dates field */
    if(!nonNullOnly || (OverrideDates != null))  _OverrideDatesSet = flag;
  /** CMF_INTERIM_BILLS.statement_date field */
    if(!nonNullOnly || (StatementDate != null))  _StatementDateSet = flag;
  /** CMF_INTERIM_BILLS.payment_due_date field */
    if(!nonNullOnly || (PaymentDueDate != null))  _PaymentDueDateSet = flag;
  }
}
