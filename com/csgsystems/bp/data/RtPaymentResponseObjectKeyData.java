/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: RtPaymentResponseObjectKeyData.java
 * Definition File: Admin/RtPaymentResponse.xml
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
import java.util.Map;
import java.util.Locale;
import java.math.BigInteger;

import javax.ws.rs.QueryParam;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.csgsystems.aruba.connection.ServiceException;
import com.csgsystems.aruba.*;
import com.csgsystems.aruba.filter.*;

import com.csgsystems.api.utilities.Logger;
import com.csgsystems.api.utilities.ObjectHelper;

import com.csgsystems.api.constraint.ConstraintManager;
import com.csgsystems.api.constraint.ConstraintException;

import com.csgsystems.api.defaults.DefaultManager;

import com.csgsystems.api.base.BaseObjectData;

import com.csgsystems.api.enumeration.EnumeratedDataMgr;
import com.csgsystems.api.enumeration.Enumeration;
import com.csgsystems.api.enumeration.EnumerationFilter;

import com.csgsystems.api.format.FieldFormatMgr;

/** RtPaymentResponseObject's Key Data class. */
public class RtPaymentResponseObjectKeyData  extends BaseObjectData
{
  /** RT_PAYMENT_RESP_VALUES.epg_type field */
  public    String EpgType  = null;
  protected boolean _EpgTypeSet = false;
  /** RT_PAYMENT_RESP_VALUES.reply_flag field */
  public    String ReplyFlag  = null;
  protected boolean _ReplyFlagSet = false;
  /** RT_PAYMENT_RESP_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "RtPaymentResponseObjectKeyData";
  /** default constructor */
  public RtPaymentResponseObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public RtPaymentResponseObjectKeyData (RtPaymentResponseObjectKeyData other)
  {
    if (other == null) return;
    this.EpgType = other.EpgType;
    this._EpgTypeSet = other._EpgTypeSet;
    this.ReplyFlag = other.ReplyFlag;
    this._ReplyFlagSet = other._ReplyFlagSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("EpgType") 
  public void setEpgType (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "EpgType", "setEpgType");
    }
    if (value != null && !DataHelper.validLength (value, 4))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "EpgType", "setEpgType");
    }
    this.EpgType = value;
    this._EpgTypeSet = true;
  }

  /** Retrieves the EpgType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The EpgType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the EpgType field
   */
   public String getEpgTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getEpgTypeAsFormattedString");
       return fmtMgr.formatString(this.getEpgType());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EpgType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getEpgTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the EpgType field from a formatted string
   *
   * @param _value the EpgType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the EpgType field
   */
   public void setEpgTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getEpgTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setEpgType(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("EpgType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setEpgTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setEpgTypeFromFormattedString");
   }

  /** get the value of the field: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @return String the value
   */
  public String getEpgType () {
    return this.EpgType;
  }
  /** Change the field to not being actively set: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   */
  public void unsetEpgType () {
    this._EpgTypeSet = false;
  }
  /** See if the field is actively set: EpgType (RT_PAYMENT_RESP_VALUES.epg_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetEpgType () {
    return this._EpgTypeSet;
  }
  /** set the fields value: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ReplyFlag") 
  public void setReplyFlag (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ReplyFlag", "setReplyFlag");
    }
    if (value != null && !DataHelper.validLength (value, 50))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ReplyFlag", "setReplyFlag");
    }
    this.ReplyFlag = value;
    this._ReplyFlagSet = true;
  }

  /** Retrieves the ReplyFlag field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ReplyFlag field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ReplyFlag field
   */
   public String getReplyFlagAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReplyFlagAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getReplyFlagAsFormattedString");
       return fmtMgr.formatString(this.getReplyFlag());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReplyFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getReplyFlagAsFormattedString");
       throw x;
     }
   }
  /** Sets the ReplyFlag field from a formatted string
   *
   * @param _value the ReplyFlag field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ReplyFlag field
   */
   public void setReplyFlagFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getReplyFlagFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setReplyFlag(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ReplyFlag");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setReplyFlagFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setReplyFlagFromFormattedString");
   }

  /** get the value of the field: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @return String the value
   */
  public String getReplyFlag () {
    return this.ReplyFlag;
  }
  /** Change the field to not being actively set: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   */
  public void unsetReplyFlag () {
    this._ReplyFlagSet = false;
  }
  /** See if the field is actively set: ReplyFlag (RT_PAYMENT_RESP_VALUES.reply_flag)
   * @return boolean whether the field is actively set
   */
  public boolean issetReplyFlag () {
    return this._ReplyFlagSet;
  }
  /** set the fields value: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LanguageCode") 
  public void setLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LanguageCode", "setLanguageCode");
    }
    this.LanguageCode = value;
    this._LanguageCodeSet = true;
  }

  /** Retrieves the LanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LanguageCode field
   */
   public String getLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the LanguageCode field from a formatted string
   *
   * @param _value the LanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LanguageCode field
   */
   public void setLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLanguageCodeFromFormattedString");
   }

  /** get the value of the field: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (RT_PAYMENT_RESP_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return RtPaymentResponseObjectKeyHelper.toMap(this, null).toString();
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
   * This method sets all of the *Set flags to the specified value
   * @param flag value to set
   */
  public void resetFlags(boolean flag) {
    
      resetFlags(flag, true);
  }
  /*
   * This method sets the *Set flags to the specified value
   * @param flag value to set
   * @param nonNullOnly value to set
   */
  public void resetFlags(boolean flag, boolean nonNullOnly) {
    
  /** RT_PAYMENT_RESP_VALUES.epg_type field */
    if(!nonNullOnly || (EpgType != null))  _EpgTypeSet = flag;
  /** RT_PAYMENT_RESP_VALUES.reply_flag field */
    if(!nonNullOnly || (ReplyFlag != null))  _ReplyFlagSet = flag;
  /** RT_PAYMENT_RESP_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
