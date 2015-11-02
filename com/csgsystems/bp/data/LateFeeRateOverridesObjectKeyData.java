/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LateFeeRateOverridesObjectKeyData.java
 * Definition File: Customer/LateFeeRateOverrides.xml
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

/** LateFeeRateOverridesObject's Key Data class. */
public class LateFeeRateOverridesObjectKeyData  extends BaseObjectData
{
  /** LATE_FEE_RATE_OVERRIDES.account_no field */
  public    Integer AccountInternalId  = null;
  protected boolean _AccountInternalIdSet = false;
  /** LATE_FEE_RATE_OVERRIDES.late_fee_type_id field */
  public    Integer LateFeeTypeId  = null;
  protected boolean _LateFeeTypeIdSet = false;
  /** LATE_FEE_RATE_OVERRIDES.active_dt field */
  public    Date ActiveDt  = null;
  protected boolean _ActiveDtSet = false;
  private String _objName = "LateFeeRateOverridesObjectKeyData";
  /** default constructor */
  public LateFeeRateOverridesObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public LateFeeRateOverridesObjectKeyData (LateFeeRateOverridesObjectKeyData other)
  {
    if (other == null) return;
    this.AccountInternalId = other.AccountInternalId;
    this._AccountInternalIdSet = other._AccountInternalIdSet;
    this.LateFeeTypeId = other.LateFeeTypeId;
    this._LateFeeTypeIdSet = other._LateFeeTypeIdSet;
    this.ActiveDt = other.ActiveDt;
    this._ActiveDtSet = other._ActiveDtSet;
  }
  /** set the fields value: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
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

  /** get the value of the field: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @return Integer the value
   */
  public Integer getAccountInternalId () {
    return this.AccountInternalId;
  }
  /** Change the field to not being actively set: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   */
  public void unsetAccountInternalId () {
    this._AccountInternalIdSet = false;
  }
  /** See if the field is actively set: AccountInternalId (LATE_FEE_RATE_OVERRIDES.account_no)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccountInternalId () {
    return this._AccountInternalIdSet;
  }
  /** set the fields value: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("LateFeeTypeId") 
  public void setLateFeeTypeId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "LateFeeTypeId", "setLateFeeTypeId");
    }
    this.LateFeeTypeId = value;
    this._LateFeeTypeIdSet = true;
  }

  /** Retrieves the LateFeeTypeId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The LateFeeTypeId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the LateFeeTypeId field
   */
   public String getLateFeeTypeIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeTypeIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getLateFeeTypeIdAsFormattedString");
       return fmtMgr.formatNumber(this.getLateFeeTypeId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LateFeeTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getLateFeeTypeIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the LateFeeTypeId field from a formatted string
   *
   * @param _value the LateFeeTypeId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the LateFeeTypeId field
   */
   public void setLateFeeTypeIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getLateFeeTypeIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setLateFeeTypeId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("LateFeeTypeId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setLateFeeTypeIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setLateFeeTypeIdFromFormattedString");
   }

  /** get the value of the field: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @return Integer the value
   */
  public Integer getLateFeeTypeId () {
    return this.LateFeeTypeId;
  }
  /** Change the field to not being actively set: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   */
  public void unsetLateFeeTypeId () {
    this._LateFeeTypeIdSet = false;
  }
  /** See if the field is actively set: LateFeeTypeId (LATE_FEE_RATE_OVERRIDES.late_fee_type_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetLateFeeTypeId () {
    return this._LateFeeTypeIdSet;
  }
  /** set the fields value: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
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

  /** get the value of the field: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @return Date the value
   */
  public Date getActiveDt () {
    return this.ActiveDt;
  }
  /** Change the field to not being actively set: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   */
  public void unsetActiveDt () {
    this._ActiveDtSet = false;
  }
  /** See if the field is actively set: ActiveDt (LATE_FEE_RATE_OVERRIDES.active_dt)
   * @return boolean whether the field is actively set
   */
  public boolean issetActiveDt () {
    return this._ActiveDtSet;
  }
  public String toString() {
    return LateFeeRateOverridesObjectKeyHelper.toMap(this, null).toString();
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
    
  /** LATE_FEE_RATE_OVERRIDES.account_no field */
    if(!nonNullOnly || (AccountInternalId != null))  _AccountInternalIdSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.late_fee_type_id field */
    if(!nonNullOnly || (LateFeeTypeId != null))  _LateFeeTypeIdSet = flag;
  /** LATE_FEE_RATE_OVERRIDES.active_dt field */
    if(!nonNullOnly || (ActiveDt != null))  _ActiveDtSet = flag;
  }
}
