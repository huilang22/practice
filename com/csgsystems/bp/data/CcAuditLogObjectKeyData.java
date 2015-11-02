/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: CcAuditLogObjectKeyData.java
 * Definition File: Customer/CcAuditLog.xml
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

/** CcAuditLogObject's Key Data class. */
public class CcAuditLogObjectKeyData  extends BaseObjectData
{
  /** CC_AUDIT_LOG.view_def_id field */
  public    Integer ViewDefId  = null;
  protected boolean _ViewDefIdSet = false;
  /** CC_AUDIT_LOG.user_id field */
  public    String UserId  = null;
  protected boolean _UserIdSet = false;
  /** CC_AUDIT_LOG.trans_date field */
  public    Date TransDate  = null;
  protected boolean _TransDateSet = false;
  private String _objName = "CcAuditLogObjectKeyData";
  /** default constructor */
  public CcAuditLogObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public CcAuditLogObjectKeyData (CcAuditLogObjectKeyData other)
  {
    if (other == null) return;
    this.ViewDefId = other.ViewDefId;
    this._ViewDefIdSet = other._ViewDefIdSet;
    this.UserId = other.UserId;
    this._UserIdSet = other._UserIdSet;
    this.TransDate = other.TransDate;
    this._TransDateSet = other._TransDateSet;
  }
  /** set the fields value: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ViewDefId") 
  public void setViewDefId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ViewDefId", "setViewDefId");
    }
    this.ViewDefId = value;
    this._ViewDefIdSet = true;
  }

  /** Retrieves the ViewDefId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ViewDefId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ViewDefId field
   */
   public String getViewDefIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewDefIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getViewDefIdAsFormattedString");
       return fmtMgr.formatNumber(this.getViewDefId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewDefId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getViewDefIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ViewDefId field from a formatted string
   *
   * @param _value the ViewDefId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ViewDefId field
   */
   public void setViewDefIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getViewDefIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setViewDefId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ViewDefId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setViewDefIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setViewDefIdFromFormattedString");
   }

  /** get the value of the field: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return Integer the value
   */
  public Integer getViewDefId () {
    return this.ViewDefId;
  }
  /** Change the field to not being actively set: ViewDefId (CC_AUDIT_LOG.view_def_id)
   */
  public void unsetViewDefId () {
    this._ViewDefIdSet = false;
  }
  /** See if the field is actively set: ViewDefId (CC_AUDIT_LOG.view_def_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetViewDefId () {
    return this._ViewDefIdSet;
  }
  /** set the fields value: UserId (CC_AUDIT_LOG.user_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("UserId") 
  public void setUserId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "UserId", "setUserId");
    }
    if (value != null && !DataHelper.validLength (value, 30))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "UserId", "setUserId");
    }
    this.UserId = value;
    this._UserIdSet = true;
  }

  /** Retrieves the UserId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The UserId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the UserId field
   */
   public String getUserIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getUserIdAsFormattedString");
       return fmtMgr.formatString(this.getUserId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UserId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getUserIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the UserId field from a formatted string
   *
   * @param _value the UserId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the UserId field
   */
   public void setUserIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getUserIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setUserId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("UserId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setUserIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setUserIdFromFormattedString");
   }

  /** get the value of the field: UserId (CC_AUDIT_LOG.user_id)
   * @return String the value
   */
  public String getUserId () {
    return this.UserId;
  }
  /** Change the field to not being actively set: UserId (CC_AUDIT_LOG.user_id)
   */
  public void unsetUserId () {
    this._UserIdSet = false;
  }
  /** See if the field is actively set: UserId (CC_AUDIT_LOG.user_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetUserId () {
    return this._UserIdSet;
  }
  /** set the fields value: TransDate (CC_AUDIT_LOG.trans_date)
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

  /** get the value of the field: TransDate (CC_AUDIT_LOG.trans_date)
   * @return Date the value
   */
  public Date getTransDate () {
    return this.TransDate;
  }
  /** Change the field to not being actively set: TransDate (CC_AUDIT_LOG.trans_date)
   */
  public void unsetTransDate () {
    this._TransDateSet = false;
  }
  /** See if the field is actively set: TransDate (CC_AUDIT_LOG.trans_date)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransDate () {
    return this._TransDateSet;
  }
  public String toString() {
    return CcAuditLogObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CC_AUDIT_LOG.view_def_id field */
    if(!nonNullOnly || (ViewDefId != null))  _ViewDefIdSet = flag;
  /** CC_AUDIT_LOG.user_id field */
    if(!nonNullOnly || (UserId != null))  _UserIdSet = flag;
  /** CC_AUDIT_LOG.trans_date field */
    if(!nonNullOnly || (TransDate != null))  _TransDateSet = flag;
  }
}
