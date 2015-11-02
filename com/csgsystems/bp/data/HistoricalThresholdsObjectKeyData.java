/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalThresholdsObjectKeyData.java
 * Definition File: Customer/HistoricalThresholds.xml
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

/** HistoricalThresholdsObject's Key Data class. */
public class HistoricalThresholdsObjectKeyData  extends BaseObjectData
{
  /** HISTORIC_THRESHOLDS.threshold_tracking_id field */
  public    Integer ThresholdTrackingId  = null;
  protected boolean _ThresholdTrackingIdSet = false;
  /** HISTORIC_THRESHOLDS.threshold_tracking_id_serv field */
  public    Integer ThresholdTrackingIdServ  = null;
  protected boolean _ThresholdTrackingIdServSet = false;
  private String _objName = "HistoricalThresholdsObjectKeyData";
  /** default constructor */
  public HistoricalThresholdsObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public HistoricalThresholdsObjectKeyData (HistoricalThresholdsObjectKeyData other)
  {
    if (other == null) return;
    this.ThresholdTrackingId = other.ThresholdTrackingId;
    this._ThresholdTrackingIdSet = other._ThresholdTrackingIdSet;
    this.ThresholdTrackingIdServ = other.ThresholdTrackingIdServ;
    this._ThresholdTrackingIdServSet = other._ThresholdTrackingIdServSet;
  }
  /** set the fields value: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ThresholdTrackingId") 
  public void setThresholdTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ThresholdTrackingId", "setThresholdTrackingId");
    }
    this.ThresholdTrackingId = value;
    this._ThresholdTrackingIdSet = true;
  }

  /** Retrieves the ThresholdTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ThresholdTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdTrackingId field
   */
   public String getThresholdTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getThresholdTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the ThresholdTrackingId field from a formatted string
   *
   * @param _value the ThresholdTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ThresholdTrackingId field
   */
   public void setThresholdTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setThresholdTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdTrackingIdFromFormattedString");
   }

  /** get the value of the field: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @return Integer the value
   */
  public Integer getThresholdTrackingId () {
    return this.ThresholdTrackingId;
  }
  /** Change the field to not being actively set: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   */
  public void unsetThresholdTrackingId () {
    this._ThresholdTrackingIdSet = false;
  }
  /** See if the field is actively set: ThresholdTrackingId (HISTORIC_THRESHOLDS.threshold_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetThresholdTrackingId () {
    return this._ThresholdTrackingIdSet;
  }
  /** set the fields value: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("ThresholdTrackingIdServ") 
  public void setThresholdTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "ThresholdTrackingIdServ", "setThresholdTrackingIdServ");
    }
    this.ThresholdTrackingIdServ = value;
    this._ThresholdTrackingIdServSet = true;
  }

  /** Retrieves the ThresholdTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The ThresholdTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the ThresholdTrackingIdServ field
   */
   public String getThresholdTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getThresholdTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getThresholdTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getThresholdTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the ThresholdTrackingIdServ field from a formatted string
   *
   * @param _value the ThresholdTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the ThresholdTrackingIdServ field
   */
   public void setThresholdTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getThresholdTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setThresholdTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("ThresholdTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setThresholdTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setThresholdTrackingIdServFromFormattedString");
   }

  /** get the value of the field: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getThresholdTrackingIdServ () {
    return this.ThresholdTrackingIdServ;
  }
  /** Change the field to not being actively set: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   */
  public void unsetThresholdTrackingIdServ () {
    this._ThresholdTrackingIdServSet = false;
  }
  /** See if the field is actively set: ThresholdTrackingIdServ (HISTORIC_THRESHOLDS.threshold_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetThresholdTrackingIdServ () {
    return this._ThresholdTrackingIdServSet;
  }
  public String toString() {
    return HistoricalThresholdsObjectKeyHelper.toMap(this, null).toString();
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
    
  /** HISTORIC_THRESHOLDS.threshold_tracking_id field */
    if(!nonNullOnly || (ThresholdTrackingId != null))  _ThresholdTrackingIdSet = flag;
  /** HISTORIC_THRESHOLDS.threshold_tracking_id_serv field */
    if(!nonNullOnly || (ThresholdTrackingIdServ != null))  _ThresholdTrackingIdServSet = flag;
  }
}
