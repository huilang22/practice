/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: ServiceCenterObjectKeyData.java
 * Definition File: Admin/ServiceCenter.xml
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

/** ServiceCenterObject's Key Data class. */
public class ServiceCenterObjectKeyData  extends BaseObjectData
{
  /** SERVICE_CENTERS.service_center_id field */
  public    Integer ServiceCenterId  = null;
  protected boolean _ServiceCenterIdSet = false;
  private String _objName = "ServiceCenterObjectKeyData";
  /** default constructor */
  public ServiceCenterObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public ServiceCenterObjectKeyData (ServiceCenterObjectKeyData other)
  {
    if (other == null) return;
    this.ServiceCenterId = other.ServiceCenterId;
    this._ServiceCenterIdSet = other._ServiceCenterIdSet;
  }
  /** set the fields value: ServiceCenterId (SERVICE_CENTERS.service_center_id)
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

  /** get the value of the field: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * @return Integer the value
   */
  public Integer getServiceCenterId () {
    return this.ServiceCenterId;
  }
  /** Change the field to not being actively set: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   */
  public void unsetServiceCenterId () {
    this._ServiceCenterIdSet = false;
  }
  /** See if the field is actively set: ServiceCenterId (SERVICE_CENTERS.service_center_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetServiceCenterId () {
    return this._ServiceCenterIdSet;
  }
  public String toString() {
    return ServiceCenterObjectKeyHelper.toMap(this, null).toString();
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
    
  /** SERVICE_CENTERS.service_center_id field */
    if(!nonNullOnly || (ServiceCenterId != null))  _ServiceCenterIdSet = flag;
  }
}
