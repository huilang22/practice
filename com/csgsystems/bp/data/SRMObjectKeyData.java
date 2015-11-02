/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SRMObjectKeyData.java
 * Definition File: Admin/StatusReasonMap.xml
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

/** SRMObject's Key Data class. */
public class SRMObjectKeyData  extends BaseObjectData
{
  /** STATUS_REASON_MAP.status_id field */
  public    Integer StatusId  = null;
  protected boolean _StatusIdSet = false;
  /** STATUS_REASON_MAP.status_reason_id field */
  public    Integer StatusReasonId  = null;
  protected boolean _StatusReasonIdSet = false;
  /** STATUS_REASON_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "SRMObjectKeyData";
  /** default constructor */
  public SRMObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public SRMObjectKeyData (SRMObjectKeyData other)
  {
    if (other == null) return;
    this.StatusId = other.StatusId;
    this._StatusIdSet = other._StatusIdSet;
    this.StatusReasonId = other.StatusReasonId;
    this._StatusReasonIdSet = other._StatusReasonIdSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: StatusId (STATUS_REASON_MAP.status_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatusId") 
  public void setStatusId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatusId", "setStatusId");
    }
    this.StatusId = value;
    this._StatusIdSet = true;
  }

  /** Retrieves the StatusId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatusId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusId field
   */
   public String getStatusIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusIdAsFormattedString");
       return fmtMgr.formatNumber(this.getStatusId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatusId field from a formatted string
   *
   * @param _value the StatusId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatusId field
   */
   public void setStatusIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatusId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusIdFromFormattedString");
   }

  /** get the value of the field: StatusId (STATUS_REASON_MAP.status_id)
   * @return Integer the value
   */
  public Integer getStatusId () {
    return this.StatusId;
  }
  /** Change the field to not being actively set: StatusId (STATUS_REASON_MAP.status_id)
   */
  public void unsetStatusId () {
    this._StatusIdSet = false;
  }
  /** See if the field is actively set: StatusId (STATUS_REASON_MAP.status_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatusId () {
    return this._StatusIdSet;
  }
  /** set the fields value: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("StatusReasonId") 
  public void setStatusReasonId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "StatusReasonId", "setStatusReasonId");
    }
    this.StatusReasonId = value;
    this._StatusReasonIdSet = true;
  }

  /** Retrieves the StatusReasonId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The StatusReasonId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the StatusReasonId field
   */
   public String getStatusReasonIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getStatusReasonIdAsFormattedString");
       return fmtMgr.formatNumber(this.getStatusReasonId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusReasonId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getStatusReasonIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the StatusReasonId field from a formatted string
   *
   * @param _value the StatusReasonId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the StatusReasonId field
   */
   public void setStatusReasonIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getStatusReasonIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setStatusReasonId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("StatusReasonId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setStatusReasonIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setStatusReasonIdFromFormattedString");
   }

  /** get the value of the field: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return Integer the value
   */
  public Integer getStatusReasonId () {
    return this.StatusReasonId;
  }
  /** Change the field to not being actively set: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   */
  public void unsetStatusReasonId () {
    this._StatusReasonIdSet = false;
  }
  /** See if the field is actively set: StatusReasonId (STATUS_REASON_MAP.status_reason_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetStatusReasonId () {
    return this._StatusReasonIdSet;
  }
  /** set the fields value: LanguageCode (STATUS_REASON_VALUES.language_code)
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

  /** get the value of the field: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (STATUS_REASON_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (STATUS_REASON_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return SRMObjectKeyHelper.toMap(this, null).toString();
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
    
  /** STATUS_REASON_MAP.status_id field */
    if(!nonNullOnly || (StatusId != null))  _StatusIdSet = flag;
  /** STATUS_REASON_MAP.status_reason_id field */
    if(!nonNullOnly || (StatusReasonId != null))  _StatusReasonIdSet = flag;
  /** STATUS_REASON_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
