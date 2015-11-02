/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SecurityRoleObjectKeyData.java
 * Definition File: Admin/SecurityRole.xml
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

/** SecurityRoleObject's Key Data class. */
public class SecurityRoleObjectKeyData  extends BaseObjectData
{
  /** SEC_FX_ROLE_VALUES.frv_role_id field */
  public    BigInteger FrvRoleId  = null;
  protected boolean _FrvRoleIdSet = false;
  /** SEC_FX_ROLE_VALUES.frv_language_code field */
  public    Integer FrvLanguageCode  = null;
  protected boolean _FrvLanguageCodeSet = false;
  private String _objName = "SecurityRoleObjectKeyData";
  /** default constructor */
  public SecurityRoleObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public SecurityRoleObjectKeyData (SecurityRoleObjectKeyData other)
  {
    if (other == null) return;
    this.FrvRoleId = other.FrvRoleId;
    this._FrvRoleIdSet = other._FrvRoleIdSet;
    this.FrvLanguageCode = other.FrvLanguageCode;
    this._FrvLanguageCodeSet = other._FrvLanguageCodeSet;
  }
  /** set the fields value: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvRoleId") 
  public void setFrvRoleId (BigInteger value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvRoleId", "setFrvRoleId");
    }
    if (value != null && !DataHelper.validLength (value, 18))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "FrvRoleId", "setFrvRoleId");
    }
    this.FrvRoleId = value;
    this._FrvRoleIdSet = true;
  }

  /** Retrieves the FrvRoleId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvRoleId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvRoleId field
   */
   public String getFrvRoleIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvRoleIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvRoleIdAsFormattedString");
       return fmtMgr.formatBigInteger(this.getFrvRoleId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvRoleId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvRoleIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvRoleId field from a formatted string
   *
   * @param _value the FrvRoleId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvRoleId field
   */
   public void setFrvRoleIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvRoleIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvRoleId(fmtMgr.parseBigInteger(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvRoleId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvRoleIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvRoleIdFromFormattedString");
   }

  /** get the value of the field: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return BigInteger the value
   */
  public BigInteger getFrvRoleId () {
    return this.FrvRoleId;
  }
  /** Change the field to not being actively set: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   */
  public void unsetFrvRoleId () {
    this._FrvRoleIdSet = false;
  }
  /** See if the field is actively set: FrvRoleId (SEC_FX_ROLE_VALUES.frv_role_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvRoleId () {
    return this._FrvRoleIdSet;
  }
  /** set the fields value: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("FrvLanguageCode") 
  public void setFrvLanguageCode (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "FrvLanguageCode", "setFrvLanguageCode");
    }
    this.FrvLanguageCode = value;
    this._FrvLanguageCodeSet = true;
  }

  /** Retrieves the FrvLanguageCode field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The FrvLanguageCode field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the FrvLanguageCode field
   */
   public String getFrvLanguageCodeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvLanguageCodeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getFrvLanguageCodeAsFormattedString");
       return fmtMgr.formatNumber(this.getFrvLanguageCode(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvLanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getFrvLanguageCodeAsFormattedString");
       throw x;
     }
   }
  /** Sets the FrvLanguageCode field from a formatted string
   *
   * @param _value the FrvLanguageCode field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the FrvLanguageCode field
   */
   public void setFrvLanguageCodeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getFrvLanguageCodeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setFrvLanguageCode(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("FrvLanguageCode");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setFrvLanguageCodeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setFrvLanguageCodeFromFormattedString");
   }

  /** get the value of the field: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return Integer the value
   */
  public Integer getFrvLanguageCode () {
    return this.FrvLanguageCode;
  }
  /** Change the field to not being actively set: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   */
  public void unsetFrvLanguageCode () {
    this._FrvLanguageCodeSet = false;
  }
  /** See if the field is actively set: FrvLanguageCode (SEC_FX_ROLE_VALUES.frv_language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetFrvLanguageCode () {
    return this._FrvLanguageCodeSet;
  }
  public String toString() {
    return SecurityRoleObjectKeyHelper.toMap(this, null).toString();
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
    
  /** SEC_FX_ROLE_VALUES.frv_role_id field */
    if(!nonNullOnly || (FrvRoleId != null))  _FrvRoleIdSet = flag;
  /** SEC_FX_ROLE_VALUES.frv_language_code field */
    if(!nonNullOnly || (FrvLanguageCode != null))  _FrvLanguageCodeSet = flag;
  }
}
