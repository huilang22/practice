/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AccountMessageObjectKeyData.java
 * Definition File: Customer/AccountMessage.xml
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

/** AccountMessageObject's Key Data class. */
public class AccountMessageObjectKeyData  extends BaseObjectData
{
  /** CMF_MESSAGES.msg_grp_id field */
  public    Integer MsgGrpId  = null;
  protected boolean _MsgGrpIdSet = false;
  /** CMF_MESSAGES.message_id field */
  public    Integer MessageId  = null;
  protected boolean _MessageIdSet = false;
  /** CMF_MESSAGES.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  /** CMF_MESSAGES.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  private String _objName = "AccountMessageObjectKeyData";
  /** default constructor */
  public AccountMessageObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AccountMessageObjectKeyData (AccountMessageObjectKeyData other)
  {
    if (other == null) return;
    this.MsgGrpId = other.MsgGrpId;
    this._MsgGrpIdSet = other._MsgGrpIdSet;
    this.MessageId = other.MessageId;
    this._MessageIdSet = other._MessageIdSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
  }
  /** set the fields value: MsgGrpId (CMF_MESSAGES.msg_grp_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MsgGrpId") 
  public void setMsgGrpId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MsgGrpId", "setMsgGrpId");
    }
    this.MsgGrpId = value;
    this._MsgGrpIdSet = true;
  }

  /** Retrieves the MsgGrpId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MsgGrpId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MsgGrpId field
   */
   public String getMsgGrpIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMsgGrpIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMsgGrpId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMsgGrpIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MsgGrpId field from a formatted string
   *
   * @param _value the MsgGrpId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MsgGrpId field
   */
   public void setMsgGrpIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMsgGrpIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMsgGrpId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MsgGrpId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMsgGrpIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMsgGrpIdFromFormattedString");
   }

  /** get the value of the field: MsgGrpId (CMF_MESSAGES.msg_grp_id)
   * @return Integer the value
   */
  public Integer getMsgGrpId () {
    return this.MsgGrpId;
  }
  /** Change the field to not being actively set: MsgGrpId (CMF_MESSAGES.msg_grp_id)
   */
  public void unsetMsgGrpId () {
    this._MsgGrpIdSet = false;
  }
  /** See if the field is actively set: MsgGrpId (CMF_MESSAGES.msg_grp_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMsgGrpId () {
    return this._MsgGrpIdSet;
  }
  /** set the fields value: MessageId (CMF_MESSAGES.message_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("MessageId") 
  public void setMessageId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "MessageId", "setMessageId");
    }
    this.MessageId = value;
    this._MessageIdSet = true;
  }

  /** Retrieves the MessageId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The MessageId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the MessageId field
   */
   public String getMessageIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getMessageIdAsFormattedString");
       return fmtMgr.formatNumber(this.getMessageId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getMessageIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the MessageId field from a formatted string
   *
   * @param _value the MessageId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the MessageId field
   */
   public void setMessageIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getMessageIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setMessageId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("MessageId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setMessageIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setMessageIdFromFormattedString");
   }

  /** get the value of the field: MessageId (CMF_MESSAGES.message_id)
   * @return Integer the value
   */
  public Integer getMessageId () {
    return this.MessageId;
  }
  /** Change the field to not being actively set: MessageId (CMF_MESSAGES.message_id)
   */
  public void unsetMessageId () {
    this._MessageIdSet = false;
  }
  /** See if the field is actively set: MessageId (CMF_MESSAGES.message_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetMessageId () {
    return this._MessageIdSet;
  }
  /** set the fields value: ActiveDt (CMF_MESSAGES.active_dt)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ActiveDt") 
  public void setActiveDt (Date value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ActiveDt", "setActiveDt");
    }
    this.ActiveDt = value;
    this._ActiveDtSet = true;
  }

  /** Retrieves the ActiveDt field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ActiveDt field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
   public String getActiveDtAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedString");
       return fmtMgr.formatDate(this.getActiveDt(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedString");
       throw x;
     }
   }
  /** Sets the ActiveDt field from a formatted string
   *
   * @param _value the ActiveDt field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
   public void setActiveDtFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setActiveDt(fmtMgr.parseDate(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ActiveDt");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setActiveDtFromFormattedString");
   }

  /**
   * Retrieves the ActiveDt field value as a formatted date/time string
   *
   * @param _locale locale settings used to format text based display values
   * @return The ActiveDt field value in formatted date/time form
   * @throws ServiceException thrown if an error occurs formatting the data for the ActiveDt field
   */
  public String getActiveDtAsFormattedDateTimeString(Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getActiveDtAsFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      if (Logger.TRACE) Logger.traceExit(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      return fmtMgr.formatDateTime(this.getActiveDt(), _locale);
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "getActiveDtAsFormattedDateTimeString");
      throw excp;
    }
  }
  /**
   * Sets the ActiveDt field value from a formatted date/time string
   *
   * @param _value the ActiveDt field value in formatted date/time form
   * @param _locale locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ActiveDt field
   */
  public void setActiveDtFromFormattedDateTimeString(String _value, Locale _locale) throws ServiceException {
    if (Logger.TRACE) Logger.traceEntry(this.getClass(), "setActiveDtFromFormattedDateTimeString");
    try {
      FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
      this.setActiveDt(fmtMgr.parseDateTime(_value, _locale));
    } catch (ServiceException excp) {
      excp.setErrorObjectName(this.getClass().getName());
      excp.setErrorObjectFieldName("ActiveDt");
      if (Logger.TRACE) Logger.traceError(this.getClass(), "setActiveDtFromFormattedDateTimeString");
      throw excp;
    }
  }

  /** get the value of the field: ActiveDt (CMF_MESSAGES.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (CMF_MESSAGES.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (CMF_MESSAGES.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  /** set the fields value: AccountInternalId (CMF_MESSAGES.account_no)
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

  /** get the value of the field: AccountInternalId (CMF_MESSAGES.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (CMF_MESSAGES.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (CMF_MESSAGES.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  public String toString() {
    return AccountMessageObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CMF_MESSAGES.msg_grp_id field */
    if(!nonNullOnly || (MsgGrpId != null))  _MsgGrpIdSet = flag;
  /** CMF_MESSAGES.message_id field */
    if(!nonNullOnly || (MessageId != null))  _MessageIdSet = flag;
  /** CMF_MESSAGES.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  /** CMF_MESSAGES.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  }
}
