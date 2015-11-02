/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: AxrtCurrCodeMapObjectKeyData.java
 * Definition File: Admin/AxrtCurrCodeMap.xml
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

/** AxrtCurrCodeMapObject's Key Data class. */
public class AxrtCurrCodeMapObjectKeyData  extends BaseObjectData
{
  /** ISO_CURRENCY_CODE_MAPPING.rate_currency_code field */
  public    Integer RateCurrencyCode  = null;
  protected boolean _RateCurrencyCodeSet = false;
  private String _objName = "AxrtCurrCodeMapObjectKeyData";
  /** default constructor */
  public AxrtCurrCodeMapObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public AxrtCurrCodeMapObjectKeyData (AxrtCurrCodeMapObjectKeyData other)
  {
    if (other == null) return;
    this.RateCurrencyCode = other.RateCurrencyCode;
    this._RateCurrencyCodeSet = other._RateCurrencyCodeSet;
  }
  /** set the fields value: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("RateCurrencyCode") 
  public void setRateCurrencyCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "RateCurrencyCode", "setRateCurrencyCode");
    }
    this.RateCurrencyCode = value;
    this._RateCurrencyCodeSet = true;
  }

  /** Retrieves the RateCurrencyCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The RateCurrencyCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the RateCurrencyCode field
   */
   public String getRateCurrencyCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getRateCurrencyCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getRateCurrencyCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getRateCurrencyCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the RateCurrencyCode field from a formatted string
   *
   * @param _value the RateCurrencyCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the RateCurrencyCode field
   */
   public void setRateCurrencyCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getRateCurrencyCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setRateCurrencyCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("RateCurrencyCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setRateCurrencyCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setRateCurrencyCodeFromFormattedString");
   }

  /** get the value of the field: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return Integer the value
   */
  public Integer getRateCurrencyCode () {
    return this.RateCurrencyCode;
  }
  /** Change the field to not being actively set: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   */
  public void unsetRateCurrencyCode () {
    this._RateCurrencyCodeSet = false;
  }
  /** See if the field is actively set: RateCurrencyCode (ISO_CURRENCY_CODE_MAPPING.rate_currency_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetRateCurrencyCode () {
    return this._RateCurrencyCodeSet;
  }
  public String toString() {
    return AxrtCurrCodeMapObjectKeyHelper.toMap(this, null).toString();
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
    
  /** ISO_CURRENCY_CODE_MAPPING.rate_currency_code field */
    if(!nonNullOnly || (RateCurrencyCode != null))  _RateCurrencyCodeSet = flag;
  }
}
