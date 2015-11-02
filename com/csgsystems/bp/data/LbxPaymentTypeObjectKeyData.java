/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: LbxPaymentTypeObjectKeyData.java
 * Definition File: Admin/LbxPaymentType.xml
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

/** LbxPaymentTypeObject's Key Data class. */
public class LbxPaymentTypeObjectKeyData  extends BaseObjectData
{
  /** LBX_PAYMENT_TYPES.ext_category field */
  public    String ExtCategory  = null;
  protected boolean _ExtCategorySet = false;
  /** LBX_PAYMENT_TYPES.source_id field */
  public    String SourceId  = null;
  protected boolean _SourceIdSet = false;
  /** LBX_SOURCE_ID_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "LbxPaymentTypeObjectKeyData";
  /** default constructor */
  public LbxPaymentTypeObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public LbxPaymentTypeObjectKeyData (LbxPaymentTypeObjectKeyData other)
  {
    if (other == null) return;
    this.ExtCategory = other.ExtCategory;
    this._ExtCategorySet = other._ExtCategorySet;
    this.SourceId = other.SourceId;
    this._SourceIdSet = other._SourceIdSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ExtCategory") 
  public void setExtCategory (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ExtCategory", "setExtCategory");
    }
    if (value != null && !DataHelper.validLength (value, 1))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "ExtCategory", "setExtCategory");
    }
    this.ExtCategory = value;
    this._ExtCategorySet = true;
  }

  /** Retrieves the ExtCategory field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ExtCategory field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ExtCategory field
   */
   public String getExtCategoryAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtCategoryAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getExtCategoryAsFormattedString");
       return fmtMgr.formatString(this.getExtCategory());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getExtCategoryAsFormattedString");
       throw x;
     }
   }
  /** Sets the ExtCategory field from a formatted string
   *
   * @param _value the ExtCategory field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ExtCategory field
   */
   public void setExtCategoryFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getExtCategoryFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setExtCategory(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ExtCategory");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setExtCategoryFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setExtCategoryFromFormattedString");
   }

  /** get the value of the field: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return String the value
   */
  public String getExtCategory () {
    return this.ExtCategory;
  }
  /** Change the field to not being actively set: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   */
  public void unsetExtCategory () {
    this._ExtCategorySet = false;
  }
  /** See if the field is actively set: ExtCategory (LBX_PAYMENT_TYPES.ext_category)
   * @return boolean whether the field is actively set
   */
  public boolean issetExtCategory () {
    return this._ExtCategorySet;
  }
  /** set the fields value: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SourceId") 
  public void setSourceId (String value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SourceId", "setSourceId");
    }
    if (value != null && !DataHelper.validLength (value, 10))
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_LENGTH", "The field's value is too long", _objName, "SourceId", "setSourceId");
    }
    this.SourceId = value;
    this._SourceIdSet = true;
  }

  /** Retrieves the SourceId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SourceId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SourceId field
   */
   public String getSourceIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSourceIdAsFormattedString");
       return fmtMgr.formatString(this.getSourceId());
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSourceIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SourceId field from a formatted string
   *
   * @param _value the SourceId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SourceId field
   */
   public void setSourceIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSourceIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSourceId(fmtMgr.parseString(_value));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SourceId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSourceIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSourceIdFromFormattedString");
   }

  /** get the value of the field: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return String the value
   */
  public String getSourceId () {
    return this.SourceId;
  }
  /** Change the field to not being actively set: SourceId (LBX_PAYMENT_TYPES.source_id)
   */
  public void unsetSourceId () {
    this._SourceIdSet = false;
  }
  /** See if the field is actively set: SourceId (LBX_PAYMENT_TYPES.source_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSourceId () {
    return this._SourceIdSet;
  }
  /** set the fields value: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
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

  /** get the value of the field: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (LBX_SOURCE_ID_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return LbxPaymentTypeObjectKeyHelper.toMap(this, null).toString();
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
    
  /** LBX_PAYMENT_TYPES.ext_category field */
    if(!nonNullOnly || (ExtCategory != null))  _ExtCategorySet = flag;
  /** LBX_PAYMENT_TYPES.source_id field */
    if(!nonNullOnly || (SourceId != null))  _SourceIdSet = flag;
  /** LBX_SOURCE_ID_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
