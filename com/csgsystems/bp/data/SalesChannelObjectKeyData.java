/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SalesChannelObjectKeyData.java
 * Definition File: Admin/SalesChannel.xml
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

/** SalesChannelObject's Key Data class. */
public class SalesChannelObjectKeyData  extends BaseObjectData
{
  /** SALES_CHANNEL_VALUES.sales_channel_id field */
  public    Integer SalesChannelId  = null;
  protected boolean _SalesChannelIdSet = false;
  /** SALES_CHANNEL_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "SalesChannelObjectKeyData";
  /** default constructor */
  public SalesChannelObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public SalesChannelObjectKeyData (SalesChannelObjectKeyData other)
  {
    if (other == null) return;
    this.SalesChannelId = other.SalesChannelId;
    this._SalesChannelIdSet = other._SalesChannelIdSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SalesChannelId") 
  public void setSalesChannelId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SalesChannelId", "setSalesChannelId");
    }
    this.SalesChannelId = value;
    this._SalesChannelIdSet = true;
  }

  /** Retrieves the SalesChannelId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SalesChannelId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SalesChannelId field
   */
   public String getSalesChannelIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSalesChannelIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSalesChannelId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSalesChannelIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SalesChannelId field from a formatted string
   *
   * @param _value the SalesChannelId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SalesChannelId field
   */
   public void setSalesChannelIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSalesChannelIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSalesChannelId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SalesChannelId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSalesChannelIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSalesChannelIdFromFormattedString");
   }

  /** get the value of the field: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @return Integer the value
   */
  public Integer getSalesChannelId () {
    return this.SalesChannelId;
  }
  /** Change the field to not being actively set: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   */
  public void unsetSalesChannelId () {
    this._SalesChannelIdSet = false;
  }
  /** See if the field is actively set: SalesChannelId (SALES_CHANNEL_VALUES.sales_channel_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSalesChannelId () {
    return this._SalesChannelIdSet;
  }
  /** set the fields value: LanguageCode (SALES_CHANNEL_VALUES.language_code)
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

  /** get the value of the field: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (SALES_CHANNEL_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return SalesChannelObjectKeyHelper.toMap(this, null).toString();
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
    
  /** SALES_CHANNEL_VALUES.sales_channel_id field */
    if(!nonNullOnly || (SalesChannelId != null))  _SalesChannelIdSet = flag;
  /** SALES_CHANNEL_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
