/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceCenterTypeObjectKeyData.java
 * Definition File: Admin/ServiceCenterType.xml
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

/** ServiceCenterTypeObject's Key Data class. */
public class ServiceCenterTypeObjectKeyData  extends BaseObjectData
{
  /** SERVICE_CENTER_TYPES.service_center_id field */
  public    Integer ServiceCenterId  = null;
  protected boolean _ServiceCenterIdSet = false;
  /** SERVICE_CENTER_TYPES.service_center_type field */
  public    Integer ServiceCenterType  = null;
  protected boolean _ServiceCenterTypeSet = false;
  /** SERVICE_CENTER_TYPE_VALUES.language_code field */
  public    Integer LanguageCode  = null;
  protected boolean _LanguageCodeSet = false;
  private String _objName = "ServiceCenterTypeObjectKeyData";
  /** default constructor */
  public ServiceCenterTypeObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public ServiceCenterTypeObjectKeyData (ServiceCenterTypeObjectKeyData other)
  {
    if (other == null) return;
    this.ServiceCenterId = other.ServiceCenterId;
    this._ServiceCenterIdSet = other._ServiceCenterIdSet;
    this.ServiceCenterType = other.ServiceCenterType;
    this._ServiceCenterTypeSet = other._ServiceCenterTypeSet;
    this.LanguageCode = other.LanguageCode;
    this._LanguageCodeSet = other._LanguageCodeSet;
  }
  /** set the fields value: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceCenterId") 
  public void setServiceCenterId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceCenterId", "setServiceCenterId");
    }
    this.ServiceCenterId = value;
    this._ServiceCenterIdSet = true;
  }

  /** Retrieves the ServiceCenterId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceCenterId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCenterId field
   */
   public String getServiceCenterIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterIdAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceCenterId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCenterId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCenterIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceCenterId field from a formatted string
   *
   * @param _value the ServiceCenterId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceCenterId field
   */
   public void setServiceCenterIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceCenterId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCenterId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCenterIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCenterIdFromFormattedString");
   }

  /** get the value of the field: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return Integer the value
   */
  public Integer getServiceCenterId () {
    return this.ServiceCenterId;
  }
  /** Change the field to not being actively set: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   */
  public void unsetServiceCenterId () {
    this._ServiceCenterIdSet = false;
  }
  /** See if the field is actively set: ServiceCenterId (SERVICE_CENTER_TYPES.service_center_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceCenterId () {
    return this._ServiceCenterIdSet;
  }
  /** set the fields value: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ServiceCenterType") 
  public void setServiceCenterType (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ServiceCenterType", "setServiceCenterType");
    }
    this.ServiceCenterType = value;
    this._ServiceCenterTypeSet = true;
  }

  /** Retrieves the ServiceCenterType field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ServiceCenterType field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ServiceCenterType field
   */
   public String getServiceCenterTypeAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getServiceCenterTypeAsFormattedString");
       return fmtMgr.formatNumber(this.getServiceCenterType(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCenterType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getServiceCenterTypeAsFormattedString");
       throw x;
     }
   }
  /** Sets the ServiceCenterType field from a formatted string
   *
   * @param _value the ServiceCenterType field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ServiceCenterType field
   */
   public void setServiceCenterTypeFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getServiceCenterTypeFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setServiceCenterType(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ServiceCenterType");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setServiceCenterTypeFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setServiceCenterTypeFromFormattedString");
   }

  /** get the value of the field: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return Integer the value
   */
  public Integer getServiceCenterType () {
    return this.ServiceCenterType;
  }
  /** Change the field to not being actively set: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   */
  public void unsetServiceCenterType () {
    this._ServiceCenterTypeSet = false;
  }
  /** See if the field is actively set: ServiceCenterType (SERVICE_CENTER_TYPES.service_center_type)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceCenterType () {
    return this._ServiceCenterTypeSet;
  }
  /** set the fields value: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
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

  /** get the value of the field: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return Integer the value
   */
  public Integer getLanguageCode () {
    return this.LanguageCode;
  }
  /** Change the field to not being actively set: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   */
  public void unsetLanguageCode () {
    this._LanguageCodeSet = false;
  }
  /** See if the field is actively set: LanguageCode (SERVICE_CENTER_TYPE_VALUES.language_code)
   * @return boolean whether the field is actively set
   */
  public boolean issetLanguageCode () {
    return this._LanguageCodeSet;
  }
  public String toString() {
    return ServiceCenterTypeObjectKeyHelper.toMap(this, null).toString();
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
    
  /** SERVICE_CENTER_TYPES.service_center_id field */
    if(!nonNullOnly || (ServiceCenterId != null))  _ServiceCenterIdSet = flag;
  /** SERVICE_CENTER_TYPES.service_center_type field */
    if(!nonNullOnly || (ServiceCenterType != null))  _ServiceCenterTypeSet = flag;
  /** SERVICE_CENTER_TYPE_VALUES.language_code field */
    if(!nonNullOnly || (LanguageCode != null))  _LanguageCodeSet = flag;
  }
}
