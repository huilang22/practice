/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: SlaMeasurementDataObjectKeyData.java
 * Definition File: Customer/SlaMeasurementData.xml
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

/** SlaMeasurementDataObject's Key Data class. */
public class SlaMeasurementDataObjectKeyData  extends BaseObjectData
{
  /** SLA_MEASUREMENT_DATA.sla_msm_tracking_id field */
  public    Integer SlaMsmTrackingId  = null;
  protected boolean _SlaMsmTrackingIdSet = false;
  /** SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv field */
  public    Integer SlaMsmTrackingIdServ  = null;
  protected boolean _SlaMsmTrackingIdServSet = false;
  private String _objName = "SlaMeasurementDataObjectKeyData";
  /** default constructor */
  public SlaMeasurementDataObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public SlaMeasurementDataObjectKeyData (SlaMeasurementDataObjectKeyData other)
  {
    if (other == null) return;
    this.SlaMsmTrackingId = other.SlaMsmTrackingId;
    this._SlaMsmTrackingIdSet = other._SlaMsmTrackingIdSet;
    this.SlaMsmTrackingIdServ = other.SlaMsmTrackingIdServ;
    this._SlaMsmTrackingIdServSet = other._SlaMsmTrackingIdServSet;
  }
  /** set the fields value: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SlaMsmTrackingId") 
  public void setSlaMsmTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SlaMsmTrackingId", "setSlaMsmTrackingId");
    }
    this.SlaMsmTrackingId = value;
    this._SlaMsmTrackingIdSet = true;
  }

  /** Retrieves the SlaMsmTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SlaMsmTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaMsmTrackingId field
   */
   public String getSlaMsmTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMsmTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getSlaMsmTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMsmTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaMsmTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the SlaMsmTrackingId field from a formatted string
   *
   * @param _value the SlaMsmTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SlaMsmTrackingId field
   */
   public void setSlaMsmTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSlaMsmTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMsmTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaMsmTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaMsmTrackingIdFromFormattedString");
   }

  /** get the value of the field: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return Integer the value
   */
  public Integer getSlaMsmTrackingId () {
    return this.SlaMsmTrackingId;
  }
  /** Change the field to not being actively set: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   */
  public void unsetSlaMsmTrackingId () {
    this._SlaMsmTrackingIdSet = false;
  }
  /** See if the field is actively set: SlaMsmTrackingId (SLA_MEASUREMENT_DATA.sla_msm_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetSlaMsmTrackingId () {
    return this._SlaMsmTrackingIdSet;
  }
  /** set the fields value: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("SlaMsmTrackingIdServ") 
  public void setSlaMsmTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "SlaMsmTrackingIdServ", "setSlaMsmTrackingIdServ");
    }
    this.SlaMsmTrackingIdServ = value;
    this._SlaMsmTrackingIdServSet = true;
  }

  /** Retrieves the SlaMsmTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The SlaMsmTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the SlaMsmTrackingIdServ field
   */
   public String getSlaMsmTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getSlaMsmTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getSlaMsmTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMsmTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getSlaMsmTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the SlaMsmTrackingIdServ field from a formatted string
   *
   * @param _value the SlaMsmTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the SlaMsmTrackingIdServ field
   */
   public void setSlaMsmTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getSlaMsmTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setSlaMsmTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("SlaMsmTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setSlaMsmTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setSlaMsmTrackingIdServFromFormattedString");
   }

  /** get the value of the field: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getSlaMsmTrackingIdServ () {
    return this.SlaMsmTrackingIdServ;
  }
  /** Change the field to not being actively set: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   */
  public void unsetSlaMsmTrackingIdServ () {
    this._SlaMsmTrackingIdServSet = false;
  }
  /** See if the field is actively set: SlaMsmTrackingIdServ (SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetSlaMsmTrackingIdServ () {
    return this._SlaMsmTrackingIdServSet;
  }
  public String toString() {
    return SlaMeasurementDataObjectKeyHelper.toMap(this, null).toString();
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
    
  /** SLA_MEASUREMENT_DATA.sla_msm_tracking_id field */
    if(!nonNullOnly || (SlaMsmTrackingId != null))  _SlaMsmTrackingIdSet = flag;
  /** SLA_MEASUREMENT_DATA.sla_msm_tracking_id_serv field */
    if(!nonNullOnly || (SlaMsmTrackingIdServ != null))  _SlaMsmTrackingIdServSet = flag;
  }
}
