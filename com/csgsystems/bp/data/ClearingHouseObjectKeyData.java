/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ClearingHouseObjectKeyData.java
 * Definition File: Admin/ClearingHouse.xml
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

/** ClearingHouseObject's Key Data class. */
public class ClearingHouseObjectKeyData  extends BaseObjectData
{
  /** CLEARING_HOUSE_ID_VALUES.clearing_house_id field */
  public    String ClearingHouseId  = null;
  protected boolean _ClearingHouseIdSet = false;
  /** CLEARING_HOUSE_ID_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "ClearingHouseObjectKeyData";
  /** default constructor */
  public ClearingHouseObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public ClearingHouseObjectKeyData (ClearingHouseObjectKeyData other)
  {
    if (other == null) return;
    this.ClearingHouseId = other.ClearingHouseId;
    this._ClearingHouseIdSet = other._ClearingHouseIdSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ClearingHouseId") 
  public void setClearingHouseId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ClearingHouseId", "setClearingHouseId");
    }
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

  /** get the value of the field: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @return String the value
   */
  public String getClearingHouseId () {
    return this.ClearingHouseId;
  }
  /** Change the field to not being actively set: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   */
  public void unsetClearingHouseId () {
    this._ClearingHouseIdSet = false;
  }
  /** See if the field is actively set: ClearingHouseId (CLEARING_HOUSE_ID_VALUES.clearing_house_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetClearingHouseId () {
    return this._ClearingHouseIdSet;
  }
  /** set the fields value: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
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

  /** get the value of the field: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (CLEARING_HOUSE_ID_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return ClearingHouseObjectKeyHelper.toMap(this, null).toString();
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
    
  /** CLEARING_HOUSE_ID_VALUES.clearing_house_id field */
    if(!nonNullOnly || (ClearingHouseId != null))  _ClearingHouseIdSet = flag;
  /** CLEARING_HOUSE_ID_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
