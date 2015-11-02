/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: TransSourceTypeObjectKeyData.java
 * Definition File: Admin/TransSourceType.xml
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

/** TransSourceTypeObject's Key Data class. */
public class TransSourceTypeObjectKeyData  extends BaseObjectData
{
  /** TRANS_SOURCE_VALUES.trans_source field */
  public    Integer TransSource  = null;
  protected boolean _TransSourceSet = false;
  /** TRANS_SOURCE_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "TransSourceTypeObjectKeyData";
  /** default constructor */
  public TransSourceTypeObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public TransSourceTypeObjectKeyData (TransSourceTypeObjectKeyData other)
  {
    if (other == null) return;
    this.TransSource = other.TransSource;
    this._TransSourceSet = other._TransSourceSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: TransSource (TRANS_SOURCE_VALUES.trans_source)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("TransSource") 
  public void setTransSource (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "TransSource", "setTransSource");
    }
    this.TransSource = value;
    this._TransSourceSet = true;
  }

  /** Retrieves the TransSource field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The TransSource field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the TransSource field
   */
   public String getTransSourceAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getTransSourceAsFormattedString");
       return fmtMgr.formatNumber(this.getTransSource(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSource");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getTransSourceAsFormattedString");
       throw x;
     }
   }
  /** Sets the TransSource field from a formatted string
   *
   * @param _value the TransSource field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the TransSource field
   */
   public void setTransSourceFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getTransSourceFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setTransSource(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("TransSource");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setTransSourceFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setTransSourceFromFormattedString");
   }

  /** get the value of the field: TransSource (TRANS_SOURCE_VALUES.trans_source)
   * @return Integer the value
   */
  public Integer getTransSource () {
    return this.TransSource;
  }
  /** Change the field to not being actively set: TransSource (TRANS_SOURCE_VALUES.trans_source)
   */
  public void unsetTransSource () {
    this._TransSourceSet = false;
  }
  /** See if the field is actively set: TransSource (TRANS_SOURCE_VALUES.trans_source)
   * @return boolean whether the field is actively set
   */
  public boolean issetTransSource () {
    return this._TransSourceSet;
  }
  /** set the fields value: LanguageCode (TRANS_SOURCE_VALUES.language_code)
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

  /** get the value of the field: LanguageCode (TRANS_SOURCE_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (TRANS_SOURCE_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (TRANS_SOURCE_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return TransSourceTypeObjectKeyHelper.toMap(this, null).toString();
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
    
  /** TRANS_SOURCE_VALUES.trans_source field */
    if(!nonNullOnly || (TransSource != null))  _TransSourceSet = flag;
  /** TRANS_SOURCE_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
