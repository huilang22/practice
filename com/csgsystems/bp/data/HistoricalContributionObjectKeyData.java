/*----------------------------------------------------------------------------
 * Generated  Code.  Do not edit.
 * Generator  XSLT: generateIF_Data_J.xslt
 * Generated  File: HistoricalContributionObjectKeyData.java
 * Definition File: Customer/HistoricalContribution.xml
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

/** HistoricalContributionObject's Key Data class. */
public class HistoricalContributionObjectKeyData  extends BaseObjectData
{
  /** HISTORIC_CONTRIBUTION.accumulation_tracking_id field */
  public    Integer AccumulationTrackingId  = null;
  protected boolean _AccumulationTrackingIdSet = false;
  /** HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv field */
  public    Integer AccumulationTrackingIdServ  = null;
  protected boolean _AccumulationTrackingIdServSet = false;
  private String _objName = "HistoricalContributionObjectKeyData";
  /** default constructor */
  public HistoricalContributionObjectKeyData ()
  {
  }
  /** copy constructor
   * @param other the object to copy
   */
  public HistoricalContributionObjectKeyData (HistoricalContributionObjectKeyData other)
  {
    if (other == null) return;
    this.AccumulationTrackingId = other.AccumulationTrackingId;
    this._AccumulationTrackingIdSet = other._AccumulationTrackingIdSet;
    this.AccumulationTrackingIdServ = other.AccumulationTrackingIdServ;
    this._AccumulationTrackingIdServSet = other._AccumulationTrackingIdServSet;
  }
  /** set the fields value: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccumulationTrackingId") 
  public void setAccumulationTrackingId (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccumulationTrackingId", "setAccumulationTrackingId");
    }
    this.AccumulationTrackingId = value;
    this._AccumulationTrackingIdSet = true;
  }

  /** Retrieves the AccumulationTrackingId field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccumulationTrackingId field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccumulationTrackingId field
   */
   public String getAccumulationTrackingIdAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccumulationTrackingIdAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccumulationTrackingIdAsFormattedString");
       return fmtMgr.formatNumber(this.getAccumulationTrackingId(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccumulationTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccumulationTrackingIdAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccumulationTrackingId field from a formatted string
   *
   * @param _value the AccumulationTrackingId field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccumulationTrackingId field
   */
   public void setAccumulationTrackingIdFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccumulationTrackingIdFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccumulationTrackingId(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccumulationTrackingId");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccumulationTrackingIdFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccumulationTrackingIdFromFormattedString");
   }

  /** get the value of the field: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * @return Integer the value
   */
  public Integer getAccumulationTrackingId () {
    return this.AccumulationTrackingId;
  }
  /** Change the field to not being actively set: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   */
  public void unsetAccumulationTrackingId () {
    this._AccumulationTrackingIdSet = false;
  }
  /** See if the field is actively set: AccumulationTrackingId (HISTORIC_CONTRIBUTION.accumulation_tracking_id)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccumulationTrackingId () {
    return this._AccumulationTrackingIdSet;
  }
  /** set the fields value: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * @param value the value to set the field to
   * @throws ServiceException if attempt to set a non-nullable field to null
   */
  @QueryParam("AccumulationTrackingIdServ") 
  public void setAccumulationTrackingIdServ (Integer value) throws ServiceException
  {
    if (value == null)
    {
      throw new ServiceException ("ArubaClient", "ck_INVALID_NULL_VALUE", "The field's value cannot be NULL", _objName, "AccumulationTrackingIdServ", "setAccumulationTrackingIdServ");
    }
    this.AccumulationTrackingIdServ = value;
    this._AccumulationTrackingIdServSet = true;
  }

  /** Retrieves the AccumulationTrackingIdServ field value as a formatted string
   *
   * @param _locale Locale settings used to format text based display values
   * @return The AccumulationTrackingIdServ field value in formatted form
   * @throws ServiceException thrown if an error occurs formatting the data for the AccumulationTrackingIdServ field
   */
   public String getAccumulationTrackingIdServAsFormattedString(Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccumulationTrackingIdServAsFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       if (Logger.TRACE) Logger.traceExit(this.getClass(), "getAccumulationTrackingIdServAsFormattedString");
       return fmtMgr.formatNumber(this.getAccumulationTrackingIdServ(), _locale);
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccumulationTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "getAccumulationTrackingIdServAsFormattedString");
       throw x;
     }
   }
  /** Sets the AccumulationTrackingIdServ field from a formatted string
   *
   * @param _value the AccumulationTrackingIdServ field value in formatted form
   * @param _locale Locale settings used to format text based display values
   * @throws ServiceException thrown if an error occurs parsing the data for the AccumulationTrackingIdServ field
   */
   public void setAccumulationTrackingIdServFromFormattedString(String _value, Locale _locale) throws ServiceException {
     if (Logger.TRACE) Logger.traceEntry(this.getClass(), "getAccumulationTrackingIdServFromFormattedString");
     try {
       FieldFormatMgr fmtMgr = FieldFormatMgr.getInstance();
       this.setAccumulationTrackingIdServ(fmtMgr.parseNumber(_value, _locale));
     } catch (ServiceException x) {
       x.setErrorObjectName(this.getClass().getName());
       x.setErrorObjectFieldName("AccumulationTrackingIdServ");
       if (Logger.TRACE) Logger.traceError(this.getClass(), "setAccumulationTrackingIdServFromFormattedString");
       throw x;
     }
     if (Logger.TRACE) Logger.traceExit(this.getClass(), "setAccumulationTrackingIdServFromFormattedString");
   }

  /** get the value of the field: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * @return Integer the value
   */
  public Integer getAccumulationTrackingIdServ () {
    return this.AccumulationTrackingIdServ;
  }
  /** Change the field to not being actively set: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   */
  public void unsetAccumulationTrackingIdServ () {
    this._AccumulationTrackingIdServSet = false;
  }
  /** See if the field is actively set: AccumulationTrackingIdServ (HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv)
   * @return boolean whether the field is actively set
   */
  public boolean issetAccumulationTrackingIdServ () {
    return this._AccumulationTrackingIdServSet;
  }
  public String toString() {
    return HistoricalContributionObjectKeyHelper.toMap(this, null).toString();
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
    
  /** HISTORIC_CONTRIBUTION.accumulation_tracking_id field */
    if(!nonNullOnly || (AccumulationTrackingId != null))  _AccumulationTrackingIdSet = flag;
  /** HISTORIC_CONTRIBUTION.accumulation_tracking_id_serv field */
    if(!nonNullOnly || (AccumulationTrackingIdServ != null))  _AccumulationTrackingIdServSet = flag;
  }
}
